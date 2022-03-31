package bigname.zprestige.webhack.features.modules.Render;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.Render3DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class HoleESP extends Module {
  public static boolean $assertionsDisabled;
  
  public Setting<Boolean> invertGradientOutline;
  
  public Setting<Boolean> gradientBox;
  
  public Setting<Float> lineWidth;
  
  public static HoleESP INSTANCE;
  
  public Setting<Integer> boxAlpha;
  
  public Setting<Boolean> fov;
  
  public Setting<Integer> range;
  
  public Setting<Integer> safeRed;
  
  public Setting<Integer> safecBlue;
  
  public Setting<Integer> cBlue;
  
  public Setting<Boolean> rainbow;
  
  public Setting<Boolean> renderOwn;
  
  public Setting<Integer> blue;
  
  public Setting<Boolean> customOutline;
  
  public Setting<Boolean> safeColor;
  
  public Setting<Boolean> box;
  
  public Setting<Integer> safeGreen;
  
  public Setting<Boolean> invertGradientBox;
  
  public Setting<Integer> cAlpha;
  
  public Setting<Integer> rangeY;
  
  public Setting<Integer> safeAlpha;
  
  public Setting<Integer> safecRed;
  
  public Setting<Boolean> outline;
  
  public Setting<Integer> cRed;
  
  public int currentAlpha;
  
  public Setting<Boolean> gradientOutline;
  
  public Setting<Integer> safecGreen;
  
  public Setting<Integer> green;
  
  public Setting<Integer> cGreen;
  
  public Setting<Integer> safecAlpha;
  
  public Setting<Integer> safeBlue;
  
  public Setting<Double> height;
  
  public Setting<Integer> alpha;
  
  public Setting<Integer> red;
  
  public boolean lambda$new$18(Object paramObject) {
    return Perry1.1B(this, (int)-2136060662L ^ 0x84B10422, paramObject);
  }
  
  public boolean lambda$new$10(Object paramObject) {
    return Perry1.23(this, (int)-1224144153L ^ 0xDB390C96, paramObject);
  }
  
  public boolean lambda$new$7(Object paramObject) {
    return Perry1.1u(this, (int)-1052744646L ^ 0xBC4FCDFD, paramObject);
  }
  
  public boolean lambda$new$8(Object paramObject) {
    return Perry1.1Q(this, (int)1661883139L ^ 0x6202F05F, paramObject);
  }
  
  public boolean lambda$new$16(Object paramObject) {
    return Perry1.1U(this, (int)-447637015L ^ 0xEC8140FB, paramObject);
  }
  
  public boolean lambda$new$3(Object paramObject) {
    return Perry1.1G(this, (int)1532947548L ^ 0x2F882FB0, paramObject);
  }
  
  public boolean lambda$new$11(Object paramObject) {
    return Perry1.1x(this, (int)-2099753000L ^ 0xBD9936AC, paramObject);
  }
  
  public boolean lambda$new$1(Object paramObject) {
    return Perry1.1N(this, (int)108457315L ^ 0x7A8D11D3, paramObject);
  }
  
  public boolean lambda$new$15(Object paramObject) {
    return Perry1.1H(this, (int)162709163L ^ 0x58C960F8, paramObject);
  }
  
  public boolean lambda$new$12(Object paramObject) {
    return Perry1.1N(this, (int)1430436178L ^ 0x29B945E3, paramObject);
  }
  
  public boolean lambda$new$14(Object paramObject) {
    return Perry1.1J(this, (int)2132606275L ^ 0x35C21C44, paramObject);
  }
  
  public static HoleESP getInstance() {
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
  
  public boolean lambda$new$13(Object paramObject) {
    return Perry1.1W(this, (int)-1863974308L ^ 0xF770FC96, paramObject);
  }
  
  public boolean lambda$new$17(Object paramObject) {
    return Perry1.1P(this, (int)-2022634829L ^ 0x861E6B8F, paramObject);
  }
  
  public boolean lambda$new$0(Object paramObject) {
    return Perry1.1v(this, (int)-1321740444L ^ 0xF19EB2E6, paramObject);
  }
  
  public boolean lambda$new$2(Object paramObject) {
    return Perry1.1F(this, (int)1504733455L ^ 0x7DB0257, paramObject);
  }
  
  public boolean lambda$new$6(Object paramObject) {
    return Perry1.1R(this, (int)626212781L ^ 0x2991BB5E, paramObject);
  }
  
  public boolean lambda$new$4(Object paramObject) {
    return Perry1.1J(this, (int)24785648L ^ 0x4BA4D3F0, paramObject);
  }
  
  public boolean lambda$new$5(Object paramObject) {
    return Perry1.1H(this, (int)21297906L ^ 0x503F24A0, paramObject);
  }
  
  static {
    // Byte code:
    //   0: ldc bigname/zprestige/webhack/features/modules/Render/HoleESP
    //   2: getstatic Perryc.c : I
    //   5: iflt -> 18
    //   8: ldc2_w -564340578
    //   11: l2i
    //   12: ldc -1144642181
    //   14: ixor
    //   15: goto -> 25
    //   18: ldc2_w 760457157
    //   21: l2i
    //   22: ldc 1350260267
    //   24: ixor
    //   25: ldc2_w -946113478
    //   28: l2i
    //   29: ldc 472101571
    //   31: ixor
    //   32: ixor
    //   33: lookupswitch default -> 336, -1500498153 -> 60, -1105052900 -> 18
    //   60: invokevirtual desiredAssertionStatus : ()Z
    //   63: ifne -> 77
    //   66: ldc2_w 385644293
    //   69: l2i
    //   70: ldc_w 283687625
    //   73: ixor
    //   74: goto -> 85
    //   77: ldc2_w 2112877755
    //   80: l2i
    //   81: ldc_w 2080061814
    //   84: ixor
    //   85: ldc2_w -35633606
    //   88: l2i
    //   89: ldc_w -957566548
    //   92: ixor
    //   93: ixor
    //   94: tableswitch default -> 66, 1024997978 -> 116, 1024997979 -> 127
    //   116: ldc2_w 412748656
    //   119: l2i
    //   120: ldc_w 412748657
    //   123: ixor
    //   124: goto -> 135
    //   127: ldc2_w -1098210050
    //   130: l2i
    //   131: ldc_w -1098210050
    //   134: ixor
    //   135: getstatic Perryc.0 : I
    //   138: ifle -> 152
    //   141: ldc2_w 1567024480
    //   144: l2i
    //   145: ldc_w 2000261372
    //   148: ixor
    //   149: goto -> 160
    //   152: ldc2_w 1447209239
    //   155: l2i
    //   156: ldc_w -160517988
    //   159: ixor
    //   160: ldc2_w 380113352
    //   163: l2i
    //   164: ldc_w 145188990
    //   167: ixor
    //   168: ixor
    //   169: lookupswitch default -> 196, 217475494 -> 152, 877661226 -> 334
    //   196: putstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.$assertionsDisabled : Z
    //   199: new bigname/zprestige/webhack/features/modules/Render/HoleESP
    //   202: dup
    //   203: getstatic Perryc.0 : I
    //   206: ifle -> 220
    //   209: ldc2_w 471553628
    //   212: l2i
    //   213: ldc_w -1332359332
    //   216: ixor
    //   217: goto -> 228
    //   220: ldc2_w 814047284
    //   223: l2i
    //   224: ldc_w -205153719
    //   227: ixor
    //   228: ldc2_w -1577716729
    //   231: l2i
    //   232: ldc_w -1866085992
    //   235: ixor
    //   236: ixor
    //   237: lookupswitch default -> 332, -1648450401 -> 220, -227489822 -> 264
    //   264: invokespecial <init> : ()V
    //   267: getstatic Perryc.1 : I
    //   270: ifeq -> 284
    //   273: ldc2_w -1039472905
    //   276: l2i
    //   277: ldc_w -1877087175
    //   280: ixor
    //   281: goto -> 292
    //   284: ldc2_w 141364149
    //   287: l2i
    //   288: ldc_w -2100138004
    //   291: ixor
    //   292: ldc2_w 1931598012
    //   295: l2i
    //   296: ldc_w 712042010
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 338, -739353857 -> 328, 189150312 -> 284
    //   328: putstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.INSTANCE : Lbigname/zprestige/webhack/features/modules/Render/HoleESP;
    //   331: return
    //   332: aconst_null
    //   333: athrow
    //   334: aconst_null
    //   335: athrow
    //   336: aconst_null
    //   337: athrow
    //   338: aconst_null
    //   339: athrow
  }
  
  public void onRender3D(Render3DEvent event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 25935
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 25927
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 25919
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 1712494592
    //   33: l2i
    //   34: ldc_w -1218230807
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -2055651658
    //   44: l2i
    //   45: ldc_w -1963470426
    //   48: ixor
    //   49: ldc2_w -362897042
    //   52: l2i
    //   53: ldc_w 722614206
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 25232, -826115648 -> 84, 272452409 -> 41
    //   84: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.$assertionsDisabled : Z
    //   87: ifne -> 101
    //   90: ldc2_w -1521725582
    //   93: l2i
    //   94: ldc_w -1858238564
    //   97: ixor
    //   98: goto -> 109
    //   101: ldc2_w -637974281
    //   104: l2i
    //   105: ldc_w -309821414
    //   108: ixor
    //   109: ldc2_w -1569444745
    //   112: l2i
    //   113: ldc_w 21043916
    //   116: ixor
    //   117: ixor
    //   118: tableswitch default -> 90, -1757086123 -> 140, -1757086122 -> 396
    //   140: getstatic Perryc.0 : I
    //   143: ifle -> 157
    //   146: ldc2_w 608701050
    //   149: l2i
    //   150: ldc_w 994242967
    //   153: ixor
    //   154: goto -> 165
    //   157: ldc2_w -1913136203
    //   160: l2i
    //   161: ldc_w 1089972776
    //   164: ixor
    //   165: ldc2_w -995427671
    //   168: l2i
    //   169: ldc_w 1073872363
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 25892, -1683882833 -> 157, 1235973855 -> 200
    //   200: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   203: getstatic Perryc.1 : I
    //   206: ifeq -> 220
    //   209: ldc2_w 807563090
    //   212: l2i
    //   213: ldc_w 1570397792
    //   216: ixor
    //   217: goto -> 228
    //   220: ldc2_w 292702311
    //   223: l2i
    //   224: ldc_w -676377983
    //   227: ixor
    //   228: ldc2_w 88541024
    //   231: l2i
    //   232: ldc_w -226345924
    //   235: ixor
    //   236: ixor
    //   237: lookupswitch default -> 25612, -1703081362 -> 220, 823671226 -> 264
    //   264: getfield field_175622_Z : Lnet/minecraft/entity/Entity;
    //   267: ifnonnull -> 281
    //   270: ldc2_w 1100529782
    //   273: l2i
    //   274: ldc_w -1930950855
    //   277: ixor
    //   278: goto -> 289
    //   281: ldc2_w 966989549
    //   284: l2i
    //   285: ldc_w -187444829
    //   288: ixor
    //   289: ldc2_w 1950514192
    //   292: l2i
    //   293: ldc_w -847835287
    //   296: ixor
    //   297: ixor
    //   298: tableswitch default -> 270, 1950725174 -> 320, 1950725175 -> 396
    //   320: new java/lang/AssertionError
    //   323: dup
    //   324: getstatic Perryc.0 : I
    //   327: ifle -> 341
    //   330: ldc2_w 2003077569
    //   333: l2i
    //   334: ldc_w -548298030
    //   337: ixor
    //   338: goto -> 349
    //   341: ldc2_w -1878847684
    //   344: l2i
    //   345: ldc_w 2141580028
    //   348: ixor
    //   349: ldc2_w 522482774
    //   352: l2i
    //   353: ldc_w -2010099088
    //   356: ixor
    //   357: ixor
    //   358: lookupswitch default -> 384, 1059130677 -> 25906, 1503814749 -> 341
    //   384: goto -> 388
    //   387: athrow
    //   388: invokespecial <init> : ()V
    //   391: goto -> 395
    //   394: athrow
    //   395: athrow
    //   396: new net/minecraft/util/math/Vec3i
    //   399: dup
    //   400: getstatic Perryc.1 : I
    //   403: ifeq -> 417
    //   406: ldc2_w -1583000710
    //   409: l2i
    //   410: ldc_w -1272283971
    //   413: ixor
    //   414: goto -> 425
    //   417: ldc2_w 575728701
    //   420: l2i
    //   421: ldc_w -1302260205
    //   424: ixor
    //   425: ldc2_w -772314877
    //   428: l2i
    //   429: ldc_w -329910696
    //   432: ixor
    //   433: ixor
    //   434: lookupswitch default -> 460, -813360526 -> 417, 674082972 -> 25742
    //   460: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   463: getstatic Perryc.0 : I
    //   466: ifle -> 480
    //   469: ldc2_w 1168494836
    //   472: l2i
    //   473: ldc_w 209118942
    //   476: ixor
    //   477: goto -> 488
    //   480: ldc2_w -2102521274
    //   483: l2i
    //   484: ldc_w -1824222692
    //   487: ixor
    //   488: ldc2_w 1154729352
    //   491: l2i
    //   492: ldc_w -973512981
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 524, -923161271 -> 25298, 985019050 -> 480
    //   524: getfield field_175622_Z : Lnet/minecraft/entity/Entity;
    //   527: getstatic Perryc.1 : I
    //   530: ifeq -> 544
    //   533: ldc2_w -113185524
    //   536: l2i
    //   537: ldc_w -1616910677
    //   540: ixor
    //   541: goto -> 552
    //   544: ldc2_w -1145481968
    //   547: l2i
    //   548: ldc_w -209353903
    //   551: ixor
    //   552: ldc2_w 654670128
    //   555: l2i
    //   556: ldc_w -1287917212
    //   559: ixor
    //   560: ixor
    //   561: lookupswitch default -> 588, -1582052652 -> 544, -220101645 -> 25222
    //   588: getfield field_70165_t : D
    //   591: getstatic Perryc.0 : I
    //   594: ifle -> 608
    //   597: ldc2_w 197224039
    //   600: l2i
    //   601: ldc_w 1525076063
    //   604: ixor
    //   605: goto -> 616
    //   608: ldc2_w 343142909
    //   611: l2i
    //   612: ldc_w -1327795748
    //   615: ixor
    //   616: ldc2_w -2028487459
    //   619: l2i
    //   620: ldc_w 1399902844
    //   623: ixor
    //   624: ixor
    //   625: lookupswitch default -> 25390, -2059347815 -> 608, 1892675200 -> 652
    //   652: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   655: getstatic Perryc.c : I
    //   658: iflt -> 672
    //   661: ldc2_w 2124663619
    //   664: l2i
    //   665: ldc_w -1136188673
    //   668: ixor
    //   669: goto -> 680
    //   672: ldc2_w -1617026977
    //   675: l2i
    //   676: ldc_w -547763715
    //   679: ixor
    //   680: ldc2_w -810369284
    //   683: l2i
    //   684: ldc_w -1863136289
    //   687: ixor
    //   688: ixor
    //   689: lookupswitch default -> 25660, -1650156385 -> 672, 528981121 -> 716
    //   716: getfield field_175622_Z : Lnet/minecraft/entity/Entity;
    //   719: getstatic Perryc.0 : I
    //   722: ifle -> 736
    //   725: ldc2_w 669152340
    //   728: l2i
    //   729: ldc_w -1406282134
    //   732: ixor
    //   733: goto -> 744
    //   736: ldc2_w 911231970
    //   739: l2i
    //   740: ldc_w -1069259155
    //   743: ixor
    //   744: ldc2_w 979471876
    //   747: l2i
    //   748: ldc_w 1172370116
    //   751: ixor
    //   752: ixor
    //   753: lookupswitch default -> 25290, -1986703025 -> 780, -196157698 -> 736
    //   780: getfield field_70163_u : D
    //   783: getstatic Perryc.c : I
    //   786: iflt -> 800
    //   789: ldc2_w -359631690
    //   792: l2i
    //   793: ldc_w -1712421584
    //   796: ixor
    //   797: goto -> 808
    //   800: ldc2_w 1232540699
    //   803: l2i
    //   804: ldc_w 1780721159
    //   807: ixor
    //   808: ldc2_w 1951722978
    //   811: l2i
    //   812: ldc_w -1665029390
    //   815: ixor
    //   816: ixor
    //   817: lookupswitch default -> 25746, -1679051114 -> 800, -876481268 -> 844
    //   844: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   847: getstatic Perryc.1 : I
    //   850: ifeq -> 864
    //   853: ldc2_w -443891073
    //   856: l2i
    //   857: ldc_w -2116797644
    //   860: ixor
    //   861: goto -> 872
    //   864: ldc2_w -455775889
    //   867: l2i
    //   868: ldc_w 580882242
    //   871: ixor
    //   872: ldc2_w 822532407
    //   875: l2i
    //   876: ldc_w 15542920
    //   879: ixor
    //   880: ixor
    //   881: lookupswitch default -> 25310, -140438126 -> 908, 1437928180 -> 864
    //   908: getfield field_175622_Z : Lnet/minecraft/entity/Entity;
    //   911: getstatic Perryc.0 : I
    //   914: ifle -> 928
    //   917: ldc2_w 1821185206
    //   920: l2i
    //   921: ldc_w -1416247090
    //   924: ixor
    //   925: goto -> 936
    //   928: ldc2_w 1391143561
    //   931: l2i
    //   932: ldc_w 919387041
    //   935: ixor
    //   936: ldc2_w -1986866347
    //   939: l2i
    //   940: ldc_w 103832673
    //   943: ixor
    //   944: ixor
    //   945: lookupswitch default -> 25224, -343597540 -> 972, 1220170572 -> 928
    //   972: getfield field_70161_v : D
    //   975: getstatic Perryc.c : I
    //   978: iflt -> 992
    //   981: ldc2_w 1684135074
    //   984: l2i
    //   985: ldc_w -1861434352
    //   988: ixor
    //   989: goto -> 1000
    //   992: ldc2_w -1318731414
    //   995: l2i
    //   996: ldc_w 314567529
    //   999: ixor
    //   1000: ldc2_w 29272837
    //   1003: l2i
    //   1004: ldc_w -1674937518
    //   1007: ixor
    //   1008: ixor
    //   1009: lookupswitch default -> 25234, 1045363284 -> 1036, 1761200357 -> 992
    //   1036: goto -> 1040
    //   1039: athrow
    //   1040: invokespecial <init> : (DDD)V
    //   1043: goto -> 1047
    //   1046: athrow
    //   1047: getstatic Perryc.0 : I
    //   1050: ifle -> 1064
    //   1053: ldc2_w 346356677
    //   1056: l2i
    //   1057: ldc_w -1002739136
    //   1060: ixor
    //   1061: goto -> 1072
    //   1064: ldc2_w 106985670
    //   1067: l2i
    //   1068: ldc_w -671484487
    //   1071: ixor
    //   1072: ldc2_w 1313794946
    //   1075: l2i
    //   1076: ldc_w 197938610
    //   1079: ixor
    //   1080: ixor
    //   1081: lookupswitch default -> 1108, -1793247307 -> 25674, 1359170879 -> 1064
    //   1108: astore_2
    //   1109: getstatic Perryc.1 : I
    //   1112: ifeq -> 1126
    //   1115: ldc2_w 474862092
    //   1118: l2i
    //   1119: ldc_w -1603519995
    //   1122: ixor
    //   1123: goto -> 1134
    //   1126: ldc2_w 42389036
    //   1129: l2i
    //   1130: ldc_w -2647027
    //   1133: ixor
    //   1134: ldc2_w -1425446948
    //   1137: l2i
    //   1138: ldc_w -526288647
    //   1141: ixor
    //   1142: ixor
    //   1143: lookupswitch default -> 25834, -1225175804 -> 1168, -141953236 -> 1126
    //   1168: aload_2
    //   1169: getstatic Perryc.c : I
    //   1172: iflt -> 1186
    //   1175: ldc2_w 355633065
    //   1178: l2i
    //   1179: ldc_w 2106169030
    //   1182: ixor
    //   1183: goto -> 1194
    //   1186: ldc2_w 2063636090
    //   1189: l2i
    //   1190: ldc_w 660747488
    //   1193: ixor
    //   1194: ldc2_w -1551639459
    //   1197: l2i
    //   1198: ldc_w -35749164
    //   1201: ixor
    //   1202: ixor
    //   1203: lookupswitch default -> 25358, 37747731 -> 1228, 921063398 -> 1186
    //   1228: goto -> 1232
    //   1231: athrow
    //   1232: invokevirtual func_177958_n : ()I
    //   1235: goto -> 1239
    //   1238: athrow
    //   1239: getstatic Perryc.0 : I
    //   1242: ifle -> 1256
    //   1245: ldc2_w 1663405670
    //   1248: l2i
    //   1249: ldc_w 1601854050
    //   1252: ixor
    //   1253: goto -> 1264
    //   1256: ldc2_w 2061175352
    //   1259: l2i
    //   1260: ldc_w 1538617830
    //   1263: ixor
    //   1264: ldc2_w -1718850920
    //   1267: l2i
    //   1268: ldc_w 353556550
    //   1271: ixor
    //   1272: ixor
    //   1273: lookupswitch default -> 1300, -1343840545 -> 1256, -1329502502 -> 25878
    //   1300: aload_0
    //   1301: getstatic Perryc.c : I
    //   1304: iflt -> 1318
    //   1307: ldc2_w -1696155970
    //   1310: l2i
    //   1311: ldc_w 371277571
    //   1314: ixor
    //   1315: goto -> 1326
    //   1318: ldc2_w -253744930
    //   1321: l2i
    //   1322: ldc_w -840750201
    //   1325: ixor
    //   1326: ldc2_w -1480078371
    //   1329: l2i
    //   1330: ldc_w -979185448
    //   1333: ixor
    //   1334: ixor
    //   1335: lookupswitch default -> 1360, -1991214284 -> 1318, -291335496 -> 25526
    //   1360: getfield range : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1363: getstatic Perryc.1 : I
    //   1366: ifeq -> 1380
    //   1369: ldc2_w -1940775155
    //   1372: l2i
    //   1373: ldc_w 952494194
    //   1376: ixor
    //   1377: goto -> 1388
    //   1380: ldc2_w -316412575
    //   1383: l2i
    //   1384: ldc_w 776910947
    //   1387: ixor
    //   1388: ldc2_w 1729329410
    //   1391: l2i
    //   1392: ldc_w 1540274160
    //   1395: ixor
    //   1396: ixor
    //   1397: lookupswitch default -> 1424, -2008401523 -> 25258, -322016432 -> 1380
    //   1424: goto -> 1428
    //   1427: athrow
    //   1428: invokevirtual getValue : ()Ljava/lang/Object;
    //   1431: goto -> 1435
    //   1434: athrow
    //   1435: checkcast java/lang/Integer
    //   1438: getstatic Perryc.0 : I
    //   1441: ifle -> 1455
    //   1444: ldc2_w -1362262351
    //   1447: l2i
    //   1448: ldc_w 1243567132
    //   1451: ixor
    //   1452: goto -> 1463
    //   1455: ldc2_w 483333359
    //   1458: l2i
    //   1459: ldc_w -437689250
    //   1462: ixor
    //   1463: ldc2_w 2071875565
    //   1466: l2i
    //   1467: ldc_w 1752698529
    //   1470: ixor
    //   1471: ixor
    //   1472: lookupswitch default -> 1500, -1441247862 -> 1455, -137063455 -> 25854
    //   1500: goto -> 1504
    //   1503: athrow
    //   1504: invokevirtual intValue : ()I
    //   1507: goto -> 1511
    //   1510: athrow
    //   1511: isub
    //   1512: getstatic Perryc.1 : I
    //   1515: ifeq -> 1529
    //   1518: ldc2_w 1402114275
    //   1521: l2i
    //   1522: ldc_w -2096043246
    //   1525: ixor
    //   1526: goto -> 1537
    //   1529: ldc2_w 625394894
    //   1532: l2i
    //   1533: ldc_w -2051238703
    //   1536: ixor
    //   1537: ldc2_w 1588687866
    //   1540: l2i
    //   1541: ldc_w 663027539
    //   1544: ixor
    //   1545: ixor
    //   1546: lookupswitch default -> 25810, -1447561384 -> 1529, -640688970 -> 1572
    //   1572: istore_3
    //   1573: getstatic Perryc.c : I
    //   1576: iflt -> 1590
    //   1579: ldc2_w -1225853113
    //   1582: l2i
    //   1583: ldc_w 1039872325
    //   1586: ixor
    //   1587: goto -> 1598
    //   1590: ldc2_w 699806011
    //   1593: l2i
    //   1594: ldc_w 1995122852
    //   1597: ixor
    //   1598: ldc2_w -1860313799
    //   1601: l2i
    //   1602: ldc_w 92657205
    //   1605: ixor
    //   1606: ixor
    //   1607: lookupswitch default -> 1632, -843751666 -> 1590, 529386766 -> 25812
    //   1632: iload_3
    //   1633: getstatic Perryc.1 : I
    //   1636: ifeq -> 1650
    //   1639: ldc2_w -1040830396
    //   1642: l2i
    //   1643: ldc_w -1609851511
    //   1646: ixor
    //   1647: goto -> 1658
    //   1650: ldc2_w -1012394608
    //   1653: l2i
    //   1654: ldc_w -28603189
    //   1657: ixor
    //   1658: ldc2_w -1406859496
    //   1661: l2i
    //   1662: ldc_w 33614013
    //   1665: ixor
    //   1666: ixor
    //   1667: lookupswitch default -> 25600, -1815709954 -> 1692, -807910808 -> 1650
    //   1692: aload_2
    //   1693: getstatic Perryc.c : I
    //   1696: iflt -> 1710
    //   1699: ldc2_w 150610275
    //   1702: l2i
    //   1703: ldc_w -807130389
    //   1706: ixor
    //   1707: goto -> 1718
    //   1710: ldc2_w -1517644775
    //   1713: l2i
    //   1714: ldc_w 337854512
    //   1717: ixor
    //   1718: ldc2_w -416221767
    //   1721: l2i
    //   1722: ldc_w 1783032701
    //   1725: ixor
    //   1726: ixor
    //   1727: lookupswitch default -> 1752, -80304113 -> 1710, 1248335180 -> 25802
    //   1752: goto -> 1756
    //   1755: athrow
    //   1756: invokevirtual func_177958_n : ()I
    //   1759: goto -> 1763
    //   1762: athrow
    //   1763: getstatic Perryc.c : I
    //   1766: iflt -> 1780
    //   1769: ldc2_w -177606396
    //   1772: l2i
    //   1773: ldc_w -2058006373
    //   1776: ixor
    //   1777: goto -> 1788
    //   1780: ldc2_w -1882821862
    //   1783: l2i
    //   1784: ldc_w 4668801
    //   1787: ixor
    //   1788: ldc2_w 1695329793
    //   1791: l2i
    //   1792: ldc_w 756918111
    //   1795: ixor
    //   1796: ixor
    //   1797: lookupswitch default -> 25626, -946839611 -> 1824, 942516417 -> 1780
    //   1824: aload_0
    //   1825: getstatic Perryc.1 : I
    //   1828: ifeq -> 1842
    //   1831: ldc2_w -859360705
    //   1834: l2i
    //   1835: ldc_w -1749983945
    //   1838: ixor
    //   1839: goto -> 1850
    //   1842: ldc2_w -839449863
    //   1845: l2i
    //   1846: ldc_w -2089751314
    //   1849: ixor
    //   1850: ldc2_w 1417113097
    //   1853: l2i
    //   1854: ldc_w -1025081058
    //   1857: ixor
    //   1858: ixor
    //   1859: lookupswitch default -> 25282, -840466401 -> 1842, -669646592 -> 1884
    //   1884: getfield range : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1887: getstatic Perryc.c : I
    //   1890: iflt -> 1904
    //   1893: ldc2_w -1717930451
    //   1896: l2i
    //   1897: ldc_w 1226256870
    //   1900: ixor
    //   1901: goto -> 1912
    //   1904: ldc2_w -209310669
    //   1907: l2i
    //   1908: ldc_w 1085046079
    //   1911: ixor
    //   1912: ldc2_w -130418646
    //   1915: l2i
    //   1916: ldc_w 505929334
    //   1919: ixor
    //   1920: ixor
    //   1921: lookupswitch default -> 1948, 777033079 -> 1904, 915628439 -> 25756
    //   1948: goto -> 1952
    //   1951: athrow
    //   1952: invokevirtual getValue : ()Ljava/lang/Object;
    //   1955: goto -> 1959
    //   1958: athrow
    //   1959: checkcast java/lang/Integer
    //   1962: getstatic Perryc.0 : I
    //   1965: ifle -> 1979
    //   1968: ldc2_w 1060376304
    //   1971: l2i
    //   1972: ldc_w -80666187
    //   1975: ixor
    //   1976: goto -> 1987
    //   1979: ldc2_w -1493499546
    //   1982: l2i
    //   1983: ldc_w -908903192
    //   1986: ixor
    //   1987: ldc2_w 511684689
    //   1990: l2i
    //   1991: ldc_w -1847984121
    //   1994: ixor
    //   1995: ixor
    //   1996: lookupswitch default -> 2024, 526329539 -> 1979, 1268817683 -> 25578
    //   2024: goto -> 2028
    //   2027: athrow
    //   2028: invokevirtual intValue : ()I
    //   2031: goto -> 2035
    //   2034: athrow
    //   2035: iadd
    //   2036: if_icmpge -> 2050
    //   2039: ldc2_w -1291640254
    //   2042: l2i
    //   2043: ldc_w -1594451425
    //   2046: ixor
    //   2047: goto -> 2058
    //   2050: ldc2_w 263320605
    //   2053: l2i
    //   2054: ldc_w 474238017
    //   2057: ixor
    //   2058: ldc2_w 1149308591
    //   2061: l2i
    //   2062: ldc_w -1933353282
    //   2065: ixor
    //   2066: ixor
    //   2067: tableswitch default -> 2039, -608704436 -> 2088, -608704435 -> 25205
    //   2088: getstatic Perryc.c : I
    //   2091: iflt -> 2105
    //   2094: ldc2_w -544847499
    //   2097: l2i
    //   2098: ldc_w -212590275
    //   2101: ixor
    //   2102: goto -> 2113
    //   2105: ldc2_w -1709769220
    //   2108: l2i
    //   2109: ldc_w 1369106473
    //   2112: ixor
    //   2113: ldc2_w -1998372519
    //   2116: l2i
    //   2117: ldc_w -278184209
    //   2120: ixor
    //   2121: ixor
    //   2122: lookupswitch default -> 25770, -1408996765 -> 2148, 1264195582 -> 2105
    //   2148: aload_2
    //   2149: getstatic Perryc.1 : I
    //   2152: ifeq -> 2166
    //   2155: ldc2_w 2025480419
    //   2158: l2i
    //   2159: ldc_w 832490672
    //   2162: ixor
    //   2163: goto -> 2174
    //   2166: ldc2_w -1297825160
    //   2169: l2i
    //   2170: ldc_w 1679886800
    //   2173: ixor
    //   2174: ldc2_w 509789700
    //   2177: l2i
    //   2178: ldc_w -429349228
    //   2181: ixor
    //   2182: ixor
    //   2183: lookupswitch default -> 25266, -1322332989 -> 2166, 781167416 -> 2208
    //   2208: goto -> 2212
    //   2211: athrow
    //   2212: invokevirtual func_177952_p : ()I
    //   2215: goto -> 2219
    //   2218: athrow
    //   2219: getstatic Perryc.1 : I
    //   2222: ifeq -> 2236
    //   2225: ldc2_w -1208376063
    //   2228: l2i
    //   2229: ldc_w 91681667
    //   2232: ixor
    //   2233: goto -> 2244
    //   2236: ldc2_w -69434699
    //   2239: l2i
    //   2240: ldc_w -1318788260
    //   2243: ixor
    //   2244: ldc2_w -986257742
    //   2247: l2i
    //   2248: ldc_w -1096883626
    //   2251: ixor
    //   2252: ixor
    //   2253: lookupswitch default -> 2280, -920169882 -> 25392, 126455876 -> 2236
    //   2280: aload_0
    //   2281: getstatic Perryc.c : I
    //   2284: iflt -> 2298
    //   2287: ldc2_w 1949809004
    //   2290: l2i
    //   2291: ldc_w 1549900358
    //   2294: ixor
    //   2295: goto -> 2306
    //   2298: ldc2_w -820598218
    //   2301: l2i
    //   2302: ldc_w -1160949104
    //   2305: ixor
    //   2306: ldc2_w -215217175
    //   2309: l2i
    //   2310: ldc_w 487550585
    //   2313: ixor
    //   2314: ixor
    //   2315: lookupswitch default -> 25384, -1678205642 -> 2340, -965392710 -> 2298
    //   2340: getfield range : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2343: getstatic Perryc.c : I
    //   2346: iflt -> 2360
    //   2349: ldc2_w 446461904
    //   2352: l2i
    //   2353: ldc_w -646844915
    //   2356: ixor
    //   2357: goto -> 2368
    //   2360: ldc2_w 2104594402
    //   2363: l2i
    //   2364: ldc_w -50900810
    //   2367: ixor
    //   2368: ldc2_w -1333188490
    //   2371: l2i
    //   2372: ldc_w 1909085839
    //   2375: ixor
    //   2376: ixor
    //   2377: lookupswitch default -> 2404, -698515774 -> 2360, 45016868 -> 25586
    //   2404: goto -> 2408
    //   2407: athrow
    //   2408: invokevirtual getValue : ()Ljava/lang/Object;
    //   2411: goto -> 2415
    //   2414: athrow
    //   2415: checkcast java/lang/Integer
    //   2418: getstatic Perryc.1 : I
    //   2421: ifeq -> 2435
    //   2424: ldc2_w -363340138
    //   2427: l2i
    //   2428: ldc_w 1493014042
    //   2431: ixor
    //   2432: goto -> 2443
    //   2435: ldc2_w -1235110346
    //   2438: l2i
    //   2439: ldc_w -1304806076
    //   2442: ixor
    //   2443: ldc2_w -1767828430
    //   2446: l2i
    //   2447: ldc_w -844182461
    //   2450: ixor
    //   2451: ixor
    //   2452: lookupswitch default -> 2480, -375025411 -> 25838, 1287944725 -> 2435
    //   2480: goto -> 2484
    //   2483: athrow
    //   2484: invokevirtual intValue : ()I
    //   2487: goto -> 2491
    //   2490: athrow
    //   2491: isub
    //   2492: getstatic Perryc.c : I
    //   2495: iflt -> 2509
    //   2498: ldc2_w -1629052991
    //   2501: l2i
    //   2502: ldc_w -1752749843
    //   2505: ixor
    //   2506: goto -> 2517
    //   2509: ldc2_w -1439285309
    //   2512: l2i
    //   2513: ldc_w -92808713
    //   2516: ixor
    //   2517: ldc2_w -1738545373
    //   2520: l2i
    //   2521: ldc_w 1630379398
    //   2524: ixor
    //   2525: ixor
    //   2526: lookupswitch default -> 2552, -267137655 -> 25824, 602493864 -> 2509
    //   2552: istore #4
    //   2554: getstatic Perryc.0 : I
    //   2557: ifle -> 2571
    //   2560: ldc2_w 1332112365
    //   2563: l2i
    //   2564: ldc_w -2003922885
    //   2567: ixor
    //   2568: goto -> 2579
    //   2571: ldc2_w 487207335
    //   2574: l2i
    //   2575: ldc_w 938326406
    //   2578: ixor
    //   2579: ldc2_w -969807182
    //   2582: l2i
    //   2583: ldc_w -772626853
    //   2586: ixor
    //   2587: ixor
    //   2588: lookupswitch default -> 2616, -802441409 -> 25734, 156567500 -> 2571
    //   2616: iload #4
    //   2618: getstatic Perryc.1 : I
    //   2621: ifeq -> 2635
    //   2624: ldc2_w 548323244
    //   2627: l2i
    //   2628: ldc_w 2087828866
    //   2631: ixor
    //   2632: goto -> 2643
    //   2635: ldc2_w 1281364614
    //   2638: l2i
    //   2639: ldc_w -1196450990
    //   2642: ixor
    //   2643: ldc2_w -626158430
    //   2646: l2i
    //   2647: ldc_w -1887872039
    //   2650: ixor
    //   2651: ixor
    //   2652: lookupswitch default -> 25840, -1592047953 -> 2680, 151768405 -> 2635
    //   2680: aload_2
    //   2681: getstatic Perryc.1 : I
    //   2684: ifeq -> 2698
    //   2687: ldc2_w 1371740336
    //   2690: l2i
    //   2691: ldc_w -878631266
    //   2694: ixor
    //   2695: goto -> 2706
    //   2698: ldc2_w -1281351035
    //   2701: l2i
    //   2702: ldc_w 383239677
    //   2705: ixor
    //   2706: ldc2_w 838613753
    //   2709: l2i
    //   2710: ldc_w 1180293628
    //   2713: ixor
    //   2714: ixor
    //   2715: lookupswitch default -> 25520, -757988227 -> 2740, -305668821 -> 2698
    //   2740: goto -> 2744
    //   2743: athrow
    //   2744: invokevirtual func_177952_p : ()I
    //   2747: goto -> 2751
    //   2750: athrow
    //   2751: getstatic Perryc.1 : I
    //   2754: ifeq -> 2768
    //   2757: ldc2_w 1061404826
    //   2760: l2i
    //   2761: ldc_w -1531672939
    //   2764: ixor
    //   2765: goto -> 2776
    //   2768: ldc2_w 1770901786
    //   2771: l2i
    //   2772: ldc_w -1655469275
    //   2775: ixor
    //   2776: ldc2_w 51971639
    //   2779: l2i
    //   2780: ldc_w -2039514398
    //   2783: ixor
    //   2784: ixor
    //   2785: lookupswitch default -> 25558, 511785690 -> 2768, 1906845418 -> 2812
    //   2812: aload_0
    //   2813: getstatic Perryc.c : I
    //   2816: iflt -> 2830
    //   2819: ldc2_w -1635099386
    //   2822: l2i
    //   2823: ldc_w 1236688510
    //   2826: ixor
    //   2827: goto -> 2838
    //   2830: ldc2_w 1926114180
    //   2833: l2i
    //   2834: ldc_w 1153096430
    //   2837: ixor
    //   2838: ldc2_w 1933104625
    //   2841: l2i
    //   2842: ldc_w -169077457
    //   2845: ixor
    //   2846: ixor
    //   2847: lookupswitch default -> 25508, -1331678796 -> 2872, 1374208934 -> 2830
    //   2872: getfield range : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2875: getstatic Perryc.1 : I
    //   2878: ifeq -> 2892
    //   2881: ldc2_w -1163533746
    //   2884: l2i
    //   2885: ldc_w -1315999110
    //   2888: ixor
    //   2889: goto -> 2900
    //   2892: ldc2_w 1658925853
    //   2895: l2i
    //   2896: ldc_w -398578571
    //   2899: ixor
    //   2900: ldc2_w -840169084
    //   2903: l2i
    //   2904: ldc_w 707351395
    //   2907: ixor
    //   2908: ixor
    //   2909: lookupswitch default -> 2936, -319829293 -> 25908, 831488264 -> 2892
    //   2936: goto -> 2940
    //   2939: athrow
    //   2940: invokevirtual getValue : ()Ljava/lang/Object;
    //   2943: goto -> 2947
    //   2946: athrow
    //   2947: checkcast java/lang/Integer
    //   2950: getstatic Perryc.c : I
    //   2953: iflt -> 2967
    //   2956: ldc2_w -972208578
    //   2959: l2i
    //   2960: ldc_w -1336442697
    //   2963: ixor
    //   2964: goto -> 2975
    //   2967: ldc2_w -1426068212
    //   2970: l2i
    //   2971: ldc_w 896739881
    //   2974: ixor
    //   2975: ldc2_w 1224505027
    //   2978: l2i
    //   2979: ldc_w -630526631
    //   2982: ixor
    //   2983: ixor
    //   2984: lookupswitch default -> 25598, -456368877 -> 2967, 219831487 -> 3012
    //   3012: goto -> 3016
    //   3015: athrow
    //   3016: invokevirtual intValue : ()I
    //   3019: goto -> 3023
    //   3022: athrow
    //   3023: iadd
    //   3024: if_icmpge -> 3038
    //   3027: ldc2_w 1806714505
    //   3030: l2i
    //   3031: ldc_w -244740387
    //   3034: ixor
    //   3035: goto -> 3046
    //   3038: ldc2_w -891642619
    //   3041: l2i
    //   3042: ldc_w 1342395742
    //   3045: ixor
    //   3046: ldc2_w 2036971230
    //   3049: l2i
    //   3050: ldc_w -832259795
    //   3053: ixor
    //   3054: ixor
    //   3055: tableswitch default -> 3027, 768919463 -> 3076, 768919464 -> 25199
    //   3076: getstatic Perryc.0 : I
    //   3079: ifle -> 3093
    //   3082: ldc2_w -1478003717
    //   3085: l2i
    //   3086: ldc_w -207966060
    //   3089: ixor
    //   3090: goto -> 3101
    //   3093: ldc2_w -741828086
    //   3096: l2i
    //   3097: ldc_w 737700569
    //   3100: ixor
    //   3101: ldc2_w -1162602611
    //   3104: l2i
    //   3105: ldc_w -1248389107
    //   3108: ixor
    //   3109: ixor
    //   3110: lookupswitch default -> 3136, -497265096 -> 3093, 1532939503 -> 25640
    //   3136: aload_2
    //   3137: getstatic Perryc.0 : I
    //   3140: ifle -> 3154
    //   3143: ldc2_w -1356797459
    //   3146: l2i
    //   3147: ldc_w -1729843134
    //   3150: ixor
    //   3151: goto -> 3162
    //   3154: ldc2_w -1716733585
    //   3157: l2i
    //   3158: ldc_w 933794856
    //   3161: ixor
    //   3162: ldc2_w 758118391
    //   3165: l2i
    //   3166: ldc_w -396848299
    //   3169: ixor
    //   3170: ixor
    //   3171: lookupswitch default -> 3196, -223134451 -> 25226, 1718631827 -> 3154
    //   3196: goto -> 3200
    //   3199: athrow
    //   3200: invokevirtual func_177956_o : ()I
    //   3203: goto -> 3207
    //   3206: athrow
    //   3207: getstatic Perryc.0 : I
    //   3210: ifle -> 3224
    //   3213: ldc2_w 420889996
    //   3216: l2i
    //   3217: ldc_w 415789841
    //   3220: ixor
    //   3221: goto -> 3232
    //   3224: ldc2_w 979704487
    //   3227: l2i
    //   3228: ldc_w 310541439
    //   3231: ixor
    //   3232: ldc2_w -5163123
    //   3235: l2i
    //   3236: ldc_w -595213891
    //   3239: ixor
    //   3240: ixor
    //   3241: lookupswitch default -> 25466, 198414568 -> 3268, 585810093 -> 3224
    //   3268: aload_0
    //   3269: getstatic Perryc.1 : I
    //   3272: ifeq -> 3286
    //   3275: ldc2_w 1075077647
    //   3278: l2i
    //   3279: ldc_w -1657786336
    //   3282: ixor
    //   3283: goto -> 3294
    //   3286: ldc2_w 360382752
    //   3289: l2i
    //   3290: ldc_w 41310364
    //   3293: ixor
    //   3294: ldc2_w -2013397326
    //   3297: l2i
    //   3298: ldc_w 1705301361
    //   3301: ixor
    //   3302: ixor
    //   3303: lookupswitch default -> 25502, -179015041 -> 3328, 1065187820 -> 3286
    //   3328: getfield rangeY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3331: getstatic Perryc.c : I
    //   3334: iflt -> 3348
    //   3337: ldc2_w -1519943066
    //   3340: l2i
    //   3341: ldc_w -838833976
    //   3344: ixor
    //   3345: goto -> 3356
    //   3348: ldc2_w 540747894
    //   3351: l2i
    //   3352: ldc_w -1485259325
    //   3355: ixor
    //   3356: ldc2_w 99794595
    //   3359: l2i
    //   3360: ldc_w 1056616152
    //   3363: ixor
    //   3364: ixor
    //   3365: lookupswitch default -> 3392, 1349515989 -> 25494, 1815747277 -> 3348
    //   3392: goto -> 3396
    //   3395: athrow
    //   3396: invokevirtual getValue : ()Ljava/lang/Object;
    //   3399: goto -> 3403
    //   3402: athrow
    //   3403: checkcast java/lang/Integer
    //   3406: getstatic Perryc.0 : I
    //   3409: ifle -> 3423
    //   3412: ldc2_w 1245636406
    //   3415: l2i
    //   3416: ldc_w 1230325075
    //   3419: ixor
    //   3420: goto -> 3431
    //   3423: ldc2_w -303429151
    //   3426: l2i
    //   3427: ldc_w 1867804730
    //   3430: ixor
    //   3431: ldc2_w -300734654
    //   3434: l2i
    //   3435: ldc_w 807338655
    //   3438: ixor
    //   3439: ixor
    //   3440: lookupswitch default -> 3468, -2057541040 -> 3423, -580417608 -> 25462
    //   3468: goto -> 3472
    //   3471: athrow
    //   3472: invokevirtual intValue : ()I
    //   3475: goto -> 3479
    //   3478: athrow
    //   3479: iadd
    //   3480: getstatic Perryc.0 : I
    //   3483: ifle -> 3497
    //   3486: ldc2_w -1601977665
    //   3489: l2i
    //   3490: ldc_w -500338805
    //   3493: ixor
    //   3494: goto -> 3505
    //   3497: ldc2_w 1068940210
    //   3500: l2i
    //   3501: ldc_w -436442691
    //   3504: ixor
    //   3505: ldc2_w 333189691
    //   3508: l2i
    //   3509: ldc_w -834410692
    //   3512: ixor
    //   3513: ixor
    //   3514: lookupswitch default -> 25596, -1624156109 -> 3497, 131409672 -> 3540
    //   3540: istore #5
    //   3542: getstatic Perryc.c : I
    //   3545: iflt -> 3559
    //   3548: ldc2_w 1130909951
    //   3551: l2i
    //   3552: ldc_w 1332271177
    //   3555: ixor
    //   3556: goto -> 3567
    //   3559: ldc2_w -1345601108
    //   3562: l2i
    //   3563: ldc_w 1644159744
    //   3566: ixor
    //   3567: ldc2_w 980764171
    //   3570: l2i
    //   3571: ldc_w 1818457709
    //   3574: ixor
    //   3575: ixor
    //   3576: lookupswitch default -> 25362, -1742597430 -> 3604, 1511438544 -> 3559
    //   3604: iload #5
    //   3606: getstatic Perryc.c : I
    //   3609: iflt -> 3623
    //   3612: ldc2_w 1806846726
    //   3615: l2i
    //   3616: ldc_w -1238573391
    //   3619: ixor
    //   3620: goto -> 3631
    //   3623: ldc2_w -1898670321
    //   3626: l2i
    //   3627: ldc_w -1270818710
    //   3630: ixor
    //   3631: ldc2_w -566008662
    //   3634: l2i
    //   3635: ldc_w -448555413
    //   3638: ixor
    //   3639: ixor
    //   3640: lookupswitch default -> 3668, -425826442 -> 25488, 482391000 -> 3623
    //   3668: aload_2
    //   3669: getstatic Perryc.1 : I
    //   3672: ifeq -> 3686
    //   3675: ldc2_w 1210924646
    //   3678: l2i
    //   3679: ldc_w 420620315
    //   3682: ixor
    //   3683: goto -> 3694
    //   3686: ldc2_w 1376960167
    //   3689: l2i
    //   3690: ldc_w -1812846388
    //   3693: ixor
    //   3694: ldc2_w -1991100490
    //   3697: l2i
    //   3698: ldc_w -1306634356
    //   3701: ixor
    //   3702: ixor
    //   3703: lookupswitch default -> 3728, -2091826364 -> 3686, 1785951815 -> 25500
    //   3728: goto -> 3732
    //   3731: athrow
    //   3732: invokevirtual func_177956_o : ()I
    //   3735: goto -> 3739
    //   3738: athrow
    //   3739: getstatic Perryc.1 : I
    //   3742: ifeq -> 3756
    //   3745: ldc2_w 313402954
    //   3748: l2i
    //   3749: ldc_w 314343998
    //   3752: ixor
    //   3753: goto -> 3764
    //   3756: ldc2_w -340724312
    //   3759: l2i
    //   3760: ldc_w 1100121487
    //   3763: ixor
    //   3764: ldc2_w 1827656056
    //   3767: l2i
    //   3768: ldc_w 1868346370
    //   3771: ixor
    //   3772: ixor
    //   3773: lookupswitch default -> 3800, -946476158 -> 3756, 60932366 -> 25424
    //   3800: aload_0
    //   3801: getstatic Perryc.c : I
    //   3804: iflt -> 3818
    //   3807: ldc2_w -315975152
    //   3810: l2i
    //   3811: ldc_w -1530887782
    //   3814: ixor
    //   3815: goto -> 3826
    //   3818: ldc2_w -216505893
    //   3821: l2i
    //   3822: ldc_w -1426455469
    //   3825: ixor
    //   3826: ldc2_w -182179614
    //   3829: l2i
    //   3830: ldc_w -1589417486
    //   3833: ixor
    //   3834: ixor
    //   3835: lookupswitch default -> 25684, 226829464 -> 3860, 495803034 -> 3818
    //   3860: getfield rangeY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3863: getstatic Perryc.c : I
    //   3866: iflt -> 3880
    //   3869: ldc2_w -1549134792
    //   3872: l2i
    //   3873: ldc_w 2013934582
    //   3876: ixor
    //   3877: goto -> 3888
    //   3880: ldc2_w -123290125
    //   3883: l2i
    //   3884: ldc_w -1233046815
    //   3887: ixor
    //   3888: ldc2_w 633279334
    //   3891: l2i
    //   3892: ldc_w -1850298011
    //   3895: ixor
    //   3896: ixor
    //   3897: lookupswitch default -> 25816, -97637103 -> 3924, 1873380813 -> 3880
    //   3924: goto -> 3928
    //   3927: athrow
    //   3928: invokevirtual getValue : ()Ljava/lang/Object;
    //   3931: goto -> 3935
    //   3934: athrow
    //   3935: checkcast java/lang/Integer
    //   3938: getstatic Perryc.c : I
    //   3941: iflt -> 3955
    //   3944: ldc2_w 208999393
    //   3947: l2i
    //   3948: ldc_w -1307086061
    //   3951: ixor
    //   3952: goto -> 3963
    //   3955: ldc2_w 218033185
    //   3958: l2i
    //   3959: ldc_w 1514707943
    //   3962: ixor
    //   3963: ldc2_w 1614336394
    //   3966: l2i
    //   3967: ldc_w -1180365433
    //   3970: ixor
    //   3971: ixor
    //   3972: lookupswitch default -> 25886, -1892963381 -> 4000, 1744813311 -> 3955
    //   4000: goto -> 4004
    //   4003: athrow
    //   4004: invokevirtual intValue : ()I
    //   4007: goto -> 4011
    //   4010: athrow
    //   4011: isub
    //   4012: if_icmple -> 4026
    //   4015: ldc2_w -1136795333
    //   4018: l2i
    //   4019: ldc_w 2133466336
    //   4022: ixor
    //   4023: goto -> 4034
    //   4026: ldc2_w 1356846963
    //   4029: l2i
    //   4030: ldc_w -1815598423
    //   4033: ixor
    //   4034: ldc2_w -484564312
    //   4037: l2i
    //   4038: ldc_w 132647689
    //   4041: ixor
    //   4042: ixor
    //   4043: tableswitch default -> 4015, 669111418 -> 4064, 669111419 -> 25193
    //   4064: new net/minecraft/util/math/BlockPos
    //   4067: dup
    //   4068: getstatic Perryc.0 : I
    //   4071: ifle -> 4085
    //   4074: ldc2_w 1257133264
    //   4077: l2i
    //   4078: ldc_w -1070603336
    //   4081: ixor
    //   4082: goto -> 4093
    //   4085: ldc2_w 587507822
    //   4088: l2i
    //   4089: ldc_w -1626146391
    //   4092: ixor
    //   4093: ldc2_w -1210817287
    //   4096: l2i
    //   4097: ldc_w 1282961257
    //   4100: ixor
    //   4101: ixor
    //   4102: lookupswitch default -> 25692, 1203395159 -> 4128, 1903017208 -> 4085
    //   4128: iload_3
    //   4129: getstatic Perryc.0 : I
    //   4132: ifle -> 4146
    //   4135: ldc2_w 305548280
    //   4138: l2i
    //   4139: ldc_w -1496483210
    //   4142: ixor
    //   4143: goto -> 4154
    //   4146: ldc2_w 475366301
    //   4149: l2i
    //   4150: ldc_w 640263281
    //   4153: ixor
    //   4154: ldc2_w 2031256700
    //   4157: l2i
    //   4158: ldc_w 2120815632
    //   4161: ixor
    //   4162: ixor
    //   4163: lookupswitch default -> 25858, -1283415582 -> 4146, 1023915904 -> 4188
    //   4188: iload #5
    //   4190: getstatic Perryc.c : I
    //   4193: iflt -> 4207
    //   4196: ldc2_w -1791156200
    //   4199: l2i
    //   4200: ldc_w 1852214181
    //   4203: ixor
    //   4204: goto -> 4215
    //   4207: ldc2_w -735996346
    //   4210: l2i
    //   4211: ldc_w -1112536423
    //   4214: ixor
    //   4215: ldc2_w 920909023
    //   4218: l2i
    //   4219: ldc_w -426357808
    //   4222: ixor
    //   4223: ixor
    //   4224: lookupswitch default -> 4252, 25648723 -> 4207, 724440242 -> 25518
    //   4252: iload #4
    //   4254: getstatic Perryc.c : I
    //   4257: iflt -> 4271
    //   4260: ldc2_w -907894649
    //   4263: l2i
    //   4264: ldc_w 1866103531
    //   4267: ixor
    //   4268: goto -> 4279
    //   4271: ldc2_w -797314587
    //   4274: l2i
    //   4275: ldc_w -146105412
    //   4278: ixor
    //   4279: ldc2_w -1727869095
    //   4282: l2i
    //   4283: ldc_w -211293155
    //   4286: ixor
    //   4287: ixor
    //   4288: lookupswitch default -> 25278, -859965144 -> 4271, 1297500445 -> 4316
    //   4316: goto -> 4320
    //   4319: athrow
    //   4320: invokespecial <init> : (III)V
    //   4323: goto -> 4327
    //   4326: athrow
    //   4327: getstatic Perryc.c : I
    //   4330: iflt -> 4344
    //   4333: ldc2_w 640203136
    //   4336: l2i
    //   4337: ldc_w -381924427
    //   4340: ixor
    //   4341: goto -> 4352
    //   4344: ldc2_w 1008507392
    //   4347: l2i
    //   4348: ldc_w 1339662332
    //   4351: ixor
    //   4352: ldc2_w -1918498143
    //   4355: l2i
    //   4356: ldc_w 217942271
    //   4359: ixor
    //   4360: ixor
    //   4361: lookupswitch default -> 4388, 1313828971 -> 25676, 1704048155 -> 4344
    //   4388: astore #6
    //   4390: getstatic Perryc.0 : I
    //   4393: ifle -> 4407
    //   4396: ldc2_w 1675600871
    //   4399: l2i
    //   4400: ldc_w -1222945496
    //   4403: ixor
    //   4404: goto -> 4415
    //   4407: ldc2_w 1810784448
    //   4410: l2i
    //   4411: ldc_w 567496874
    //   4414: ixor
    //   4415: ldc2_w 1458345082
    //   4418: l2i
    //   4419: ldc_w 1799717730
    //   4422: ixor
    //   4423: ixor
    //   4424: lookupswitch default -> 25252, -378674729 -> 4407, 2006198130 -> 4452
    //   4452: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   4455: getstatic Perryc.0 : I
    //   4458: ifle -> 4472
    //   4461: ldc2_w 1764750447
    //   4464: l2i
    //   4465: ldc_w -1690381037
    //   4468: ixor
    //   4469: goto -> 4480
    //   4472: ldc2_w 1584112029
    //   4475: l2i
    //   4476: ldc_w -1732479508
    //   4479: ixor
    //   4480: ldc2_w 375435885
    //   4483: l2i
    //   4484: ldc_w 1275672548
    //   4487: ixor
    //   4488: ixor
    //   4489: lookupswitch default -> 4516, -1468488459 -> 25268, 809232482 -> 4472
    //   4516: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   4519: getstatic Perryc.0 : I
    //   4522: ifle -> 4536
    //   4525: ldc2_w 1587363483
    //   4528: l2i
    //   4529: ldc_w -1984897997
    //   4532: ixor
    //   4533: goto -> 4544
    //   4536: ldc2_w 135879601
    //   4539: l2i
    //   4540: ldc_w 2000950460
    //   4543: ixor
    //   4544: ldc2_w -451536823
    //   4547: l2i
    //   4548: ldc_w 371197061
    //   4551: ixor
    //   4552: ixor
    //   4553: lookupswitch default -> 4580, 605814372 -> 25530, 1799430255 -> 4536
    //   4580: aload #6
    //   4582: getstatic Perryc.c : I
    //   4585: iflt -> 4599
    //   4588: ldc2_w 212725099
    //   4591: l2i
    //   4592: ldc_w -1020388085
    //   4595: ixor
    //   4596: goto -> 4607
    //   4599: ldc2_w -1816616891
    //   4602: l2i
    //   4603: ldc_w 493267169
    //   4606: ixor
    //   4607: ldc2_w -1355436846
    //   4610: l2i
    //   4611: ldc_w 1126063555
    //   4614: ixor
    //   4615: ixor
    //   4616: lookupswitch default -> 4644, 326352207 -> 4599, 598212977 -> 25818
    //   4644: goto -> 4648
    //   4647: athrow
    //   4648: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   4651: goto -> 4655
    //   4654: athrow
    //   4655: getstatic Perryc.1 : I
    //   4658: ifeq -> 4672
    //   4661: ldc2_w -1137255638
    //   4664: l2i
    //   4665: ldc_w -1498087103
    //   4668: ixor
    //   4669: goto -> 4680
    //   4672: ldc2_w -2145992469
    //   4675: l2i
    //   4676: ldc_w 1706096403
    //   4679: ixor
    //   4680: ldc2_w -1453338865
    //   4683: l2i
    //   4684: ldc_w 1359461612
    //   4687: ixor
    //   4688: ixor
    //   4689: lookupswitch default -> 25648, -488920696 -> 4672, 503202843 -> 4716
    //   4716: goto -> 4720
    //   4719: athrow
    //   4720: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   4725: goto -> 4729
    //   4728: athrow
    //   4729: getstatic Perryc.1 : I
    //   4732: ifeq -> 4746
    //   4735: ldc2_w 1246496432
    //   4738: l2i
    //   4739: ldc_w -1961395280
    //   4742: ixor
    //   4743: goto -> 4754
    //   4746: ldc2_w 446841267
    //   4749: l2i
    //   4750: ldc_w 651661975
    //   4753: ixor
    //   4754: ldc2_w -2044962815
    //   4757: l2i
    //   4758: ldc_w -1693313550
    //   4761: ixor
    //   4762: ixor
    //   4763: lookupswitch default -> 4788, -1460646658 -> 4746, -598396685 -> 25792
    //   4788: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
    //   4791: getstatic Perryc.1 : I
    //   4794: ifeq -> 4808
    //   4797: ldc2_w -630212807
    //   4800: l2i
    //   4801: ldc_w 1644144955
    //   4804: ixor
    //   4805: goto -> 4816
    //   4808: ldc2_w -1792246659
    //   4811: l2i
    //   4812: ldc_w -1544894933
    //   4815: ixor
    //   4816: ldc2_w -1370061126
    //   4819: l2i
    //   4820: ldc_w 1787107720
    //   4823: ixor
    //   4824: ixor
    //   4825: lookupswitch default -> 25862, -233495196 -> 4852, 2135130416 -> 4808
    //   4852: goto -> 4856
    //   4855: athrow
    //   4856: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4859: goto -> 4863
    //   4862: athrow
    //   4863: ifeq -> 4877
    //   4866: ldc2_w -387908964
    //   4869: l2i
    //   4870: ldc_w 218299536
    //   4873: ixor
    //   4874: goto -> 4885
    //   4877: ldc2_w 1168210983
    //   4880: l2i
    //   4881: ldc_w -1606190550
    //   4884: ixor
    //   4885: ldc2_w -1365322154
    //   4888: l2i
    //   4889: ldc_w -1451311000
    //   4892: ixor
    //   4893: ixor
    //   4894: tableswitch default -> 4866, -503181262 -> 4916, -503181261 -> 25187
    //   4916: getstatic Perryc.0 : I
    //   4919: ifle -> 4933
    //   4922: ldc2_w 2007515012
    //   4925: l2i
    //   4926: ldc_w 850547505
    //   4929: ixor
    //   4930: goto -> 4941
    //   4933: ldc2_w 178813270
    //   4936: l2i
    //   4937: ldc_w 884644912
    //   4940: ixor
    //   4941: ldc2_w -1977954637
    //   4944: l2i
    //   4945: ldc_w 644448755
    //   4948: ixor
    //   4949: ixor
    //   4950: lookupswitch default -> 4976, -378985483 -> 25678, 559440431 -> 4933
    //   4976: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   4979: getstatic Perryc.1 : I
    //   4982: ifeq -> 4996
    //   4985: ldc2_w 939664216
    //   4988: l2i
    //   4989: ldc_w 1569797650
    //   4992: ixor
    //   4993: goto -> 5004
    //   4996: ldc2_w -1783252613
    //   4999: l2i
    //   5000: ldc_w -824388168
    //   5003: ixor
    //   5004: ldc2_w -1137501175
    //   5007: l2i
    //   5008: ldc_w -1298224697
    //   5011: ixor
    //   5012: ixor
    //   5013: lookupswitch default -> 25490, 1438963981 -> 5040, 1799266436 -> 4996
    //   5040: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   5043: getstatic Perryc.1 : I
    //   5046: ifeq -> 5060
    //   5049: ldc2_w 1493949524
    //   5052: l2i
    //   5053: ldc_w -489012670
    //   5056: ixor
    //   5057: goto -> 5068
    //   5060: ldc2_w 991560620
    //   5063: l2i
    //   5064: ldc_w -1981371505
    //   5067: ixor
    //   5068: ldc2_w 512719581
    //   5071: l2i
    //   5072: ldc_w -1980784255
    //   5075: ixor
    //   5076: ixor
    //   5077: lookupswitch default -> 25616, 631010175 -> 5104, 749815114 -> 5060
    //   5104: aload #6
    //   5106: ldc2_w -1478640546
    //   5109: l2i
    //   5110: ldc_w -1478640546
    //   5113: ixor
    //   5114: ldc2_w -438028581
    //   5117: l2i
    //   5118: ldc_w -438028582
    //   5121: ixor
    //   5122: ldc2_w 653886276
    //   5125: l2i
    //   5126: ldc_w 653886276
    //   5129: ixor
    //   5130: getstatic Perryc.1 : I
    //   5133: ifeq -> 5147
    //   5136: ldc2_w -1752569528
    //   5139: l2i
    //   5140: ldc_w -1483261183
    //   5143: ixor
    //   5144: goto -> 5155
    //   5147: ldc2_w -866330687
    //   5150: l2i
    //   5151: ldc_w -908122253
    //   5154: ixor
    //   5155: ldc2_w -1535498776
    //   5158: l2i
    //   5159: ldc_w 598471870
    //   5162: ixor
    //   5163: ixor
    //   5164: lookupswitch default -> 25276, -2108546588 -> 5192, -1211170017 -> 5147
    //   5192: goto -> 5196
    //   5195: athrow
    //   5196: invokevirtual func_177982_a : (III)Lnet/minecraft/util/math/BlockPos;
    //   5199: goto -> 5203
    //   5202: athrow
    //   5203: getstatic Perryc.1 : I
    //   5206: ifeq -> 5220
    //   5209: ldc2_w 1602921733
    //   5212: l2i
    //   5213: ldc_w -736391507
    //   5216: ixor
    //   5217: goto -> 5228
    //   5220: ldc2_w 1278190303
    //   5223: l2i
    //   5224: ldc_w -1487132997
    //   5227: ixor
    //   5228: ldc2_w -1753479753
    //   5231: l2i
    //   5232: ldc_w 1170380002
    //   5235: ixor
    //   5236: ixor
    //   5237: lookupswitch default -> 25796, 969741617 -> 5264, 1496300285 -> 5220
    //   5264: goto -> 5268
    //   5267: athrow
    //   5268: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   5271: goto -> 5275
    //   5274: athrow
    //   5275: getstatic Perryc.c : I
    //   5278: iflt -> 5292
    //   5281: ldc2_w 398694212
    //   5284: l2i
    //   5285: ldc_w -824926052
    //   5288: ixor
    //   5289: goto -> 5300
    //   5292: ldc2_w 248037695
    //   5295: l2i
    //   5296: ldc_w -1097673499
    //   5299: ixor
    //   5300: ldc2_w 1218297133
    //   5303: l2i
    //   5304: ldc_w -1057433748
    //   5307: ixor
    //   5308: ixor
    //   5309: lookupswitch default -> 5336, 1366449561 -> 25536, 1430326076 -> 5292
    //   5336: goto -> 5340
    //   5339: athrow
    //   5340: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   5345: goto -> 5349
    //   5348: athrow
    //   5349: getstatic Perryc.c : I
    //   5352: iflt -> 5366
    //   5355: ldc2_w 857278309
    //   5358: l2i
    //   5359: ldc_w 1805020414
    //   5362: ixor
    //   5363: goto -> 5374
    //   5366: ldc2_w 358738672
    //   5369: l2i
    //   5370: ldc_w 1075988545
    //   5373: ixor
    //   5374: ldc2_w -749674378
    //   5377: l2i
    //   5378: ldc_w 1766835519
    //   5381: ixor
    //   5382: ixor
    //   5383: lookupswitch default -> 5408, -493859118 -> 25634, 1257381622 -> 5366
    //   5408: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
    //   5411: getstatic Perryc.0 : I
    //   5414: ifle -> 5428
    //   5417: ldc2_w -200618826
    //   5420: l2i
    //   5421: ldc_w -974000445
    //   5424: ixor
    //   5425: goto -> 5436
    //   5428: ldc2_w -236302754
    //   5431: l2i
    //   5432: ldc_w -663134691
    //   5435: ixor
    //   5436: ldc2_w -1560352510
    //   5439: l2i
    //   5440: ldc_w -2130572437
    //   5443: ixor
    //   5444: ixor
    //   5445: lookupswitch default -> 25722, 175108650 -> 5472, 302497820 -> 5428
    //   5472: goto -> 5476
    //   5475: athrow
    //   5476: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5479: goto -> 5483
    //   5482: athrow
    //   5483: ifeq -> 5497
    //   5486: ldc2_w -218950175
    //   5489: l2i
    //   5490: ldc_w 1378849779
    //   5493: ixor
    //   5494: goto -> 5505
    //   5497: ldc2_w 199606265
    //   5500: l2i
    //   5501: ldc_w -1422312982
    //   5504: ixor
    //   5505: ldc2_w -862621894
    //   5508: l2i
    //   5509: ldc_w 840855538
    //   5512: ixor
    //   5513: ixor
    //   5514: tableswitch default -> 5486, 1582794458 -> 5536, 1582794459 -> 25187
    //   5536: getstatic Perryc.1 : I
    //   5539: ifeq -> 5553
    //   5542: ldc2_w 295061673
    //   5545: l2i
    //   5546: ldc_w -367401376
    //   5549: ixor
    //   5550: goto -> 5561
    //   5553: ldc2_w -2032358812
    //   5556: l2i
    //   5557: ldc_w -1445069774
    //   5560: ixor
    //   5561: ldc2_w 10054054
    //   5564: l2i
    //   5565: ldc_w -314990795
    //   5568: ixor
    //   5569: ixor
    //   5570: lookupswitch default -> 25652, -1029594939 -> 5596, 372201562 -> 5553
    //   5596: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   5599: getstatic Perryc.c : I
    //   5602: iflt -> 5616
    //   5605: ldc2_w -1976014643
    //   5608: l2i
    //   5609: ldc_w -1653041933
    //   5612: ixor
    //   5613: goto -> 5624
    //   5616: ldc2_w 1656943583
    //   5619: l2i
    //   5620: ldc_w 500468827
    //   5623: ixor
    //   5624: ldc2_w -145900601
    //   5627: l2i
    //   5628: ldc_w 1168778015
    //   5631: ixor
    //   5632: ixor
    //   5633: lookupswitch default -> 5660, -1515756314 -> 25428, 1937253563 -> 5616
    //   5660: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   5663: getstatic Perryc.c : I
    //   5666: iflt -> 5680
    //   5669: ldc2_w -1740728742
    //   5672: l2i
    //   5673: ldc_w 642298924
    //   5676: ixor
    //   5677: goto -> 5688
    //   5680: ldc2_w -1950697255
    //   5683: l2i
    //   5684: ldc_w -2028236308
    //   5687: ixor
    //   5688: ldc2_w 518343896
    //   5691: l2i
    //   5692: ldc_w 54906039
    //   5695: ixor
    //   5696: ixor
    //   5697: lookupswitch default -> 25814, -1546214887 -> 5680, 285321562 -> 5724
    //   5724: aload #6
    //   5726: ldc2_w -1038210771
    //   5729: l2i
    //   5730: ldc_w -1038210771
    //   5733: ixor
    //   5734: ldc2_w 1394651561
    //   5737: l2i
    //   5738: ldc_w 1394651563
    //   5741: ixor
    //   5742: ldc2_w 211665380
    //   5745: l2i
    //   5746: ldc_w 211665380
    //   5749: ixor
    //   5750: getstatic Perryc.1 : I
    //   5753: ifeq -> 5767
    //   5756: ldc2_w -954948440
    //   5759: l2i
    //   5760: ldc_w 854110742
    //   5763: ixor
    //   5764: goto -> 5775
    //   5767: ldc2_w -670024144
    //   5770: l2i
    //   5771: ldc_w -847192752
    //   5774: ixor
    //   5775: ldc2_w -1878417879
    //   5778: l2i
    //   5779: ldc_w -64638014
    //   5782: ixor
    //   5783: ixor
    //   5784: lookupswitch default -> 5812, -1714406571 -> 25608, 1905210495 -> 5767
    //   5812: goto -> 5816
    //   5815: athrow
    //   5816: invokevirtual func_177982_a : (III)Lnet/minecraft/util/math/BlockPos;
    //   5819: goto -> 5823
    //   5822: athrow
    //   5823: getstatic Perryc.0 : I
    //   5826: ifle -> 5840
    //   5829: ldc2_w 175137356
    //   5832: l2i
    //   5833: ldc_w -80850563
    //   5836: ixor
    //   5837: goto -> 5848
    //   5840: ldc2_w 899334454
    //   5843: l2i
    //   5844: ldc_w 1765827972
    //   5847: ixor
    //   5848: ldc2_w -246822017
    //   5851: l2i
    //   5852: ldc_w -1458490657
    //   5855: ixor
    //   5856: ixor
    //   5857: lookupswitch default -> 25754, -1459172719 -> 5840, 75652370 -> 5884
    //   5884: goto -> 5888
    //   5887: athrow
    //   5888: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   5891: goto -> 5895
    //   5894: athrow
    //   5895: getstatic Perryc.1 : I
    //   5898: ifeq -> 5912
    //   5901: ldc2_w -1450550863
    //   5904: l2i
    //   5905: ldc_w -1493239772
    //   5908: ixor
    //   5909: goto -> 5920
    //   5912: ldc2_w 1582720491
    //   5915: l2i
    //   5916: ldc_w -85655291
    //   5919: ixor
    //   5920: ldc2_w -972685387
    //   5923: l2i
    //   5924: ldc_w 2033469981
    //   5927: ixor
    //   5928: ixor
    //   5929: lookupswitch default -> 5956, -1965623904 -> 5912, -1337650115 -> 25794
    //   5956: goto -> 5960
    //   5959: athrow
    //   5960: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   5965: goto -> 5969
    //   5968: athrow
    //   5969: getstatic Perryc.c : I
    //   5972: iflt -> 5986
    //   5975: ldc2_w -1632873964
    //   5978: l2i
    //   5979: ldc_w 2108858334
    //   5982: ixor
    //   5983: goto -> 5994
    //   5986: ldc2_w 1373823983
    //   5989: l2i
    //   5990: ldc_w 717092918
    //   5993: ixor
    //   5994: ldc2_w 1703356013
    //   5997: l2i
    //   5998: ldc_w -1388488042
    //   6001: ixor
    //   6002: ixor
    //   6003: lookupswitch default -> 25694, -1276811486 -> 6028, 732213553 -> 5986
    //   6028: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
    //   6031: getstatic Perryc.0 : I
    //   6034: ifle -> 6048
    //   6037: ldc2_w -1888293367
    //   6040: l2i
    //   6041: ldc_w -2128074818
    //   6044: ixor
    //   6045: goto -> 6056
    //   6048: ldc2_w 725149621
    //   6051: l2i
    //   6052: ldc_w 1327766261
    //   6055: ixor
    //   6056: ldc2_w 494402747
    //   6059: l2i
    //   6060: ldc_w 2124380192
    //   6063: ixor
    //   6064: ixor
    //   6065: lookupswitch default -> 25902, 133462491 -> 6092, 1840401708 -> 6048
    //   6092: goto -> 6096
    //   6095: athrow
    //   6096: invokevirtual equals : (Ljava/lang/Object;)Z
    //   6099: goto -> 6103
    //   6102: athrow
    //   6103: ifeq -> 6117
    //   6106: ldc2_w -805061384
    //   6109: l2i
    //   6110: ldc_w 2121944738
    //   6113: ixor
    //   6114: goto -> 6125
    //   6117: ldc2_w 1875548450
    //   6120: l2i
    //   6121: ldc_w -1045206151
    //   6124: ixor
    //   6125: ldc2_w 1565409518
    //   6128: l2i
    //   6129: ldc_w -1271830692
    //   6132: ixor
    //   6133: ixor
    //   6134: tableswitch default -> 6106, 1191630312 -> 6156, 1191630313 -> 25187
    //   6156: getstatic Perryc.c : I
    //   6159: iflt -> 6173
    //   6162: ldc2_w 1088694143
    //   6165: l2i
    //   6166: ldc_w 1587279418
    //   6169: ixor
    //   6170: goto -> 6181
    //   6173: ldc2_w 451703760
    //   6176: l2i
    //   6177: ldc_w 227192910
    //   6180: ixor
    //   6181: ldc2_w 1686798186
    //   6184: l2i
    //   6185: ldc_w 804691352
    //   6188: ixor
    //   6189: ixor
    //   6190: lookupswitch default -> 25750, 1426273207 -> 6173, 1545216364 -> 6216
    //   6216: aload #6
    //   6218: new net/minecraft/util/math/BlockPos
    //   6221: dup
    //   6222: getstatic Perryc.1 : I
    //   6225: ifeq -> 6239
    //   6228: ldc2_w 1201951546
    //   6231: l2i
    //   6232: ldc_w -948632149
    //   6235: ixor
    //   6236: goto -> 6247
    //   6239: ldc2_w 745238962
    //   6242: l2i
    //   6243: ldc_w 335733220
    //   6246: ixor
    //   6247: ldc2_w 36621381
    //   6250: l2i
    //   6251: ldc_w 1564134201
    //   6254: ixor
    //   6255: ixor
    //   6256: lookupswitch default -> 6284, -540716563 -> 25436, 7846565 -> 6239
    //   6284: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   6287: getstatic Perryc.1 : I
    //   6290: ifeq -> 6304
    //   6293: ldc2_w -1194737562
    //   6296: l2i
    //   6297: ldc_w -2119687542
    //   6300: ixor
    //   6301: goto -> 6312
    //   6304: ldc2_w -1438591130
    //   6307: l2i
    //   6308: ldc_w 219351281
    //   6311: ixor
    //   6312: ldc2_w 1764380669
    //   6315: l2i
    //   6316: ldc_w -788746631
    //   6319: ixor
    //   6320: ixor
    //   6321: lookupswitch default -> 6348, -2135489688 -> 25738, 183920430 -> 6304
    //   6348: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6351: getstatic Perryc.0 : I
    //   6354: ifle -> 6368
    //   6357: ldc2_w 742521609
    //   6360: l2i
    //   6361: ldc_w 799726433
    //   6364: ixor
    //   6365: goto -> 6376
    //   6368: ldc2_w 712967786
    //   6371: l2i
    //   6372: ldc_w -2013212501
    //   6375: ixor
    //   6376: ldc2_w 1557916218
    //   6379: l2i
    //   6380: ldc_w -1606485302
    //   6383: ixor
    //   6384: ixor
    //   6385: lookupswitch default -> 25784, -15847272 -> 6368, 1587201585 -> 6412
    //   6412: getfield field_70165_t : D
    //   6415: getstatic Perryc.0 : I
    //   6418: ifle -> 6432
    //   6421: ldc2_w -1703160655
    //   6424: l2i
    //   6425: ldc_w -2066765697
    //   6428: ixor
    //   6429: goto -> 6440
    //   6432: ldc2_w -814666503
    //   6435: l2i
    //   6436: ldc_w -2014675862
    //   6439: ixor
    //   6440: ldc2_w 986678534
    //   6443: l2i
    //   6444: ldc_w 789189731
    //   6447: ixor
    //   6448: ixor
    //   6449: lookupswitch default -> 25896, 192015787 -> 6432, 1566491126 -> 6476
    //   6476: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   6479: getstatic Perryc.0 : I
    //   6482: ifle -> 6496
    //   6485: ldc2_w 1977812865
    //   6488: l2i
    //   6489: ldc_w 1008149562
    //   6492: ixor
    //   6493: goto -> 6504
    //   6496: ldc2_w 556681331
    //   6499: l2i
    //   6500: ldc_w 606471687
    //   6503: ixor
    //   6504: ldc2_w 497748759
    //   6507: l2i
    //   6508: ldc_w -1246674662
    //   6511: ixor
    //   6512: ixor
    //   6513: lookupswitch default -> 6540, -578053963 -> 6496, -504469066 -> 25534
    //   6540: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6543: getstatic Perryc.c : I
    //   6546: iflt -> 6560
    //   6549: ldc2_w -1731212924
    //   6552: l2i
    //   6553: ldc_w -1264826206
    //   6556: ixor
    //   6557: goto -> 6568
    //   6560: ldc2_w -1218329808
    //   6563: l2i
    //   6564: ldc_w 1643419820
    //   6567: ixor
    //   6568: ldc2_w -300521718
    //   6571: l2i
    //   6572: ldc_w 1674392444
    //   6575: ixor
    //   6576: ixor
    //   6577: lookupswitch default -> 25414, -1584868016 -> 6560, 1531842538 -> 6604
    //   6604: getfield field_70163_u : D
    //   6607: getstatic Perryc.0 : I
    //   6610: ifle -> 6624
    //   6613: ldc2_w -1759295133
    //   6616: l2i
    //   6617: ldc_w -1657667923
    //   6620: ixor
    //   6621: goto -> 6632
    //   6624: ldc2_w 1882542453
    //   6627: l2i
    //   6628: ldc_w 209162617
    //   6631: ixor
    //   6632: ldc2_w 746205541
    //   6635: l2i
    //   6636: ldc_w 653172157
    //   6639: ixor
    //   6640: ixor
    //   6641: lookupswitch default -> 6668, 8788758 -> 25320, 1774751014 -> 6624
    //   6668: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   6671: getstatic Perryc.0 : I
    //   6674: ifle -> 6688
    //   6677: ldc2_w 365556906
    //   6680: l2i
    //   6681: ldc_w -461088817
    //   6684: ixor
    //   6685: goto -> 6696
    //   6688: ldc2_w 1149093220
    //   6691: l2i
    //   6692: ldc_w 1934491977
    //   6695: ixor
    //   6696: ldc2_w 646810352
    //   6699: l2i
    //   6700: ldc_w 1170893253
    //   6703: ixor
    //   6704: ixor
    //   6705: lookupswitch default -> 25664, -1844821936 -> 6688, 1416898328 -> 6732
    //   6732: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6735: getstatic Perryc.1 : I
    //   6738: ifeq -> 6752
    //   6741: ldc2_w 1435558093
    //   6744: l2i
    //   6745: ldc_w -67468853
    //   6748: ixor
    //   6749: goto -> 6760
    //   6752: ldc2_w -1250949715
    //   6755: l2i
    //   6756: ldc_w -1442982119
    //   6759: ixor
    //   6760: ldc2_w 688613470
    //   6763: l2i
    //   6764: ldc_w -485132611
    //   6767: ixor
    //   6768: ixor
    //   6769: lookupswitch default -> 25610, -694956969 -> 6796, 1685356517 -> 6752
    //   6796: getfield field_70161_v : D
    //   6799: getstatic Perryc.0 : I
    //   6802: ifle -> 6816
    //   6805: ldc2_w -838901275
    //   6808: l2i
    //   6809: ldc_w -704654940
    //   6812: ixor
    //   6813: goto -> 6824
    //   6816: ldc2_w -607408147
    //   6819: l2i
    //   6820: ldc_w 290392564
    //   6823: ixor
    //   6824: ldc2_w 290128633
    //   6827: l2i
    //   6828: ldc_w -804870334
    //   6831: ixor
    //   6832: ixor
    //   6833: lookupswitch default -> 6860, -649259526 -> 25292, 1035340922 -> 6816
    //   6860: goto -> 6864
    //   6863: athrow
    //   6864: invokespecial <init> : (DDD)V
    //   6867: goto -> 6871
    //   6870: athrow
    //   6871: getstatic Perryc.1 : I
    //   6874: ifeq -> 6888
    //   6877: ldc2_w -645185618
    //   6880: l2i
    //   6881: ldc_w 1206909550
    //   6884: ixor
    //   6885: goto -> 6896
    //   6888: ldc2_w -539431934
    //   6891: l2i
    //   6892: ldc_w 1933882850
    //   6895: ixor
    //   6896: ldc2_w -1156990294
    //   6899: l2i
    //   6900: ldc_w -77917963
    //   6903: ixor
    //   6904: ixor
    //   6905: lookupswitch default -> 25668, -566857825 -> 6888, -321981505 -> 6932
    //   6932: goto -> 6936
    //   6935: athrow
    //   6936: invokevirtual equals : (Ljava/lang/Object;)Z
    //   6939: goto -> 6943
    //   6942: athrow
    //   6943: ifeq -> 6957
    //   6946: ldc2_w -1989901598
    //   6949: l2i
    //   6950: ldc_w 1647294489
    //   6953: ixor
    //   6954: goto -> 6965
    //   6957: ldc2_w -499159361
    //   6960: l2i
    //   6961: ldc_w 158618693
    //   6964: ixor
    //   6965: ldc2_w 1870219626
    //   6968: l2i
    //   6969: ldc_w -1514166507
    //   6972: ixor
    //   6973: ixor
    //   6974: tableswitch default -> 6946, 562943108 -> 6996, 562943109 -> 7320
    //   6996: getstatic Perryc.1 : I
    //   6999: ifeq -> 7013
    //   7002: ldc2_w 1703350291
    //   7005: l2i
    //   7006: ldc_w 1131743062
    //   7009: ixor
    //   7010: goto -> 7021
    //   7013: ldc2_w -146885423
    //   7016: l2i
    //   7017: ldc_w -1713804524
    //   7020: ixor
    //   7021: ldc2_w 1483010258
    //   7024: l2i
    //   7025: ldc_w -1673454051
    //   7028: ixor
    //   7029: ixor
    //   7030: lookupswitch default -> 7056, -489162358 -> 25576, -12230168 -> 7013
    //   7056: aload_0
    //   7057: getstatic Perryc.1 : I
    //   7060: ifeq -> 7074
    //   7063: ldc2_w -1707157313
    //   7066: l2i
    //   7067: ldc_w 885057015
    //   7070: ixor
    //   7071: goto -> 7082
    //   7074: ldc2_w -410667191
    //   7077: l2i
    //   7078: ldc_w -1874642673
    //   7081: ixor
    //   7082: ldc2_w 1971115735
    //   7085: l2i
    //   7086: ldc_w -441915859
    //   7089: ixor
    //   7090: ixor
    //   7091: lookupswitch default -> 7116, -1499379091 -> 7074, 1042943410 -> 25496
    //   7116: getfield renderOwn : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7119: getstatic Perryc.1 : I
    //   7122: ifeq -> 7136
    //   7125: ldc2_w -648221714
    //   7128: l2i
    //   7129: ldc_w 131539094
    //   7132: ixor
    //   7133: goto -> 7144
    //   7136: ldc2_w 1315312732
    //   7139: l2i
    //   7140: ldc_w 1902237816
    //   7143: ixor
    //   7144: ldc2_w 715066090
    //   7147: l2i
    //   7148: ldc_w 898330813
    //   7151: ixor
    //   7152: ixor
    //   7153: lookupswitch default -> 7180, -1046499025 -> 25260, 1215413811 -> 7136
    //   7180: goto -> 7184
    //   7183: athrow
    //   7184: invokevirtual getValue : ()Ljava/lang/Object;
    //   7187: goto -> 7191
    //   7190: athrow
    //   7191: checkcast java/lang/Boolean
    //   7194: getstatic Perryc.c : I
    //   7197: iflt -> 7211
    //   7200: ldc2_w -406280664
    //   7203: l2i
    //   7204: ldc_w 988044974
    //   7207: ixor
    //   7208: goto -> 7219
    //   7211: ldc2_w 901876056
    //   7214: l2i
    //   7215: ldc_w -1449615572
    //   7218: ixor
    //   7219: ldc2_w -1388417569
    //   7222: l2i
    //   7223: ldc_w -1398730273
    //   7226: ixor
    //   7227: ixor
    //   7228: lookupswitch default -> 7256, -592214906 -> 25866, -348296921 -> 7211
    //   7256: goto -> 7260
    //   7259: athrow
    //   7260: invokevirtual booleanValue : ()Z
    //   7263: goto -> 7267
    //   7266: athrow
    //   7267: ifeq -> 7281
    //   7270: ldc2_w 554352748
    //   7273: l2i
    //   7274: ldc_w 968647085
    //   7277: ixor
    //   7278: goto -> 7289
    //   7281: ldc2_w 260917337
    //   7284: l2i
    //   7285: ldc_w 389802393
    //   7288: ixor
    //   7289: ldc2_w 140191738
    //   7292: l2i
    //   7293: ldc_w -591791177
    //   7296: ixor
    //   7297: ixor
    //   7298: tableswitch default -> 7270, -866878068 -> 7320, -866878067 -> 25187
    //   7320: getstatic Perryc.c : I
    //   7323: iflt -> 7337
    //   7326: ldc2_w 1841452559
    //   7329: l2i
    //   7330: ldc_w 183792845
    //   7333: ixor
    //   7334: goto -> 7345
    //   7337: ldc2_w -1936520729
    //   7340: l2i
    //   7341: ldc_w 1473354888
    //   7344: ixor
    //   7345: ldc2_w -1336742200
    //   7348: l2i
    //   7349: ldc_w -805859322
    //   7352: ixor
    //   7353: ixor
    //   7354: lookupswitch default -> 25712, -1528304735 -> 7380, 412310540 -> 7337
    //   7380: aload #6
    //   7382: getstatic Perryc.c : I
    //   7385: iflt -> 7399
    //   7388: ldc2_w 889008449
    //   7391: l2i
    //   7392: ldc_w 333418392
    //   7395: ixor
    //   7396: goto -> 7407
    //   7399: ldc2_w 53654914
    //   7402: l2i
    //   7403: ldc_w -306168058
    //   7406: ixor
    //   7407: ldc2_w -1023201482
    //   7410: l2i
    //   7411: ldc_w -1718031610
    //   7414: ixor
    //   7415: ixor
    //   7416: lookupswitch default -> 7444, -614257102 -> 7399, 2109307625 -> 25698
    //   7444: goto -> 7448
    //   7447: athrow
    //   7448: invokestatic isPosInFov : (Lnet/minecraft/util/math/BlockPos;)Ljava/lang/Boolean;
    //   7451: goto -> 7455
    //   7454: athrow
    //   7455: getstatic Perryc.c : I
    //   7458: iflt -> 7472
    //   7461: ldc2_w 1415597614
    //   7464: l2i
    //   7465: ldc_w -902658062
    //   7468: ixor
    //   7469: goto -> 7480
    //   7472: ldc2_w 1536252553
    //   7475: l2i
    //   7476: ldc_w -28771125
    //   7479: ixor
    //   7480: ldc2_w -1558009472
    //   7483: l2i
    //   7484: ldc_w -1760156845
    //   7487: ixor
    //   7488: ixor
    //   7489: lookupswitch default -> 25316, -1846727535 -> 7516, -1436138737 -> 7472
    //   7516: goto -> 7520
    //   7519: athrow
    //   7520: invokevirtual booleanValue : ()Z
    //   7523: goto -> 7527
    //   7526: athrow
    //   7527: ifne -> 7541
    //   7530: ldc2_w 2077990695
    //   7533: l2i
    //   7534: ldc_w -1934321916
    //   7537: ixor
    //   7538: goto -> 7549
    //   7541: ldc2_w -95819777
    //   7544: l2i
    //   7545: ldc_w 220655581
    //   7548: ixor
    //   7549: ldc2_w -359909263
    //   7552: l2i
    //   7553: ldc_w -2030508562
    //   7556: ixor
    //   7557: ixor
    //   7558: tableswitch default -> 7530, -1692674628 -> 7580, -1692674627 -> 7904
    //   7580: getstatic Perryc.c : I
    //   7583: iflt -> 7597
    //   7586: ldc2_w -1206181986
    //   7589: l2i
    //   7590: ldc_w -1499596190
    //   7593: ixor
    //   7594: goto -> 7605
    //   7597: ldc2_w -1214802009
    //   7600: l2i
    //   7601: ldc_w 1346789327
    //   7604: ixor
    //   7605: ldc2_w -201664663
    //   7608: l2i
    //   7609: ldc_w 654673509
    //   7612: ixor
    //   7613: ixor
    //   7614: lookupswitch default -> 7640, -897993488 -> 25836, 1330359949 -> 7597
    //   7640: aload_0
    //   7641: getstatic Perryc.c : I
    //   7644: iflt -> 7658
    //   7647: ldc2_w 892608808
    //   7650: l2i
    //   7651: ldc_w 28384811
    //   7654: ixor
    //   7655: goto -> 7666
    //   7658: ldc2_w 193689026
    //   7661: l2i
    //   7662: ldc_w 390763039
    //   7665: ixor
    //   7666: ldc2_w -1100422555
    //   7669: l2i
    //   7670: ldc_w 1196012702
    //   7673: ixor
    //   7674: ixor
    //   7675: lookupswitch default -> 25386, -844862984 -> 7658, -438259418 -> 7700
    //   7700: getfield fov : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7703: getstatic Perryc.c : I
    //   7706: iflt -> 7720
    //   7709: ldc2_w 1734208566
    //   7712: l2i
    //   7713: ldc_w 224073660
    //   7716: ixor
    //   7717: goto -> 7728
    //   7720: ldc2_w -516022086
    //   7723: l2i
    //   7724: ldc_w -1563282111
    //   7727: ixor
    //   7728: ldc2_w -20108401
    //   7731: l2i
    //   7732: ldc_w -1408342111
    //   7735: ixor
    //   7736: ixor
    //   7737: lookupswitch default -> 25830, 288315861 -> 7764, 952481700 -> 7720
    //   7764: goto -> 7768
    //   7767: athrow
    //   7768: invokevirtual getValue : ()Ljava/lang/Object;
    //   7771: goto -> 7775
    //   7774: athrow
    //   7775: checkcast java/lang/Boolean
    //   7778: getstatic Perryc.c : I
    //   7781: iflt -> 7795
    //   7784: ldc2_w 1590444810
    //   7787: l2i
    //   7788: ldc_w -1640103793
    //   7791: ixor
    //   7792: goto -> 7803
    //   7795: ldc2_w 328254283
    //   7798: l2i
    //   7799: ldc_w 1842957389
    //   7802: ixor
    //   7803: ldc2_w -767574910
    //   7806: l2i
    //   7807: ldc_w -56884045
    //   7810: ixor
    //   7811: ixor
    //   7812: lookupswitch default -> 7840, -296617036 -> 25748, 331939615 -> 7795
    //   7840: goto -> 7844
    //   7843: athrow
    //   7844: invokevirtual booleanValue : ()Z
    //   7847: goto -> 7851
    //   7850: athrow
    //   7851: ifne -> 7865
    //   7854: ldc2_w -1925906450
    //   7857: l2i
    //   7858: ldc_w 584420675
    //   7861: ixor
    //   7862: goto -> 7873
    //   7865: ldc2_w -1143892259
    //   7868: l2i
    //   7869: ldc_w 338748529
    //   7872: ixor
    //   7873: ldc2_w -1917421062
    //   7876: l2i
    //   7877: ldc_w -794847727
    //   7880: ixor
    //   7881: ixor
    //   7882: tableswitch default -> 7854, -221733562 -> 7904, -221733561 -> 25187
    //   7904: getstatic Perryc.1 : I
    //   7907: ifeq -> 7921
    //   7910: ldc2_w 1232089080
    //   7913: l2i
    //   7914: ldc_w 1212161046
    //   7917: ixor
    //   7918: goto -> 7929
    //   7921: ldc2_w -781905471
    //   7924: l2i
    //   7925: ldc_w 567889868
    //   7928: ixor
    //   7929: ldc2_w 767707915
    //   7932: l2i
    //   7933: ldc_w -1430316910
    //   7936: ixor
    //   7937: ixor
    //   7938: lookupswitch default -> 7964, -2041749385 -> 25614, -1169111755 -> 7921
    //   7964: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   7967: getstatic Perryc.1 : I
    //   7970: ifeq -> 7984
    //   7973: ldc2_w -858060813
    //   7976: l2i
    //   7977: ldc_w -1876767172
    //   7980: ixor
    //   7981: goto -> 7992
    //   7984: ldc2_w -117828101
    //   7987: l2i
    //   7988: ldc_w -1551542691
    //   7991: ixor
    //   7992: ldc2_w -597165749
    //   7995: l2i
    //   7996: ldc_w -1053657840
    //   7999: ixor
    //   8000: ixor
    //   8001: lookupswitch default -> 8028, 1101809044 -> 25606, 1767205894 -> 7984
    //   8028: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   8031: getstatic Perryc.0 : I
    //   8034: ifle -> 8048
    //   8037: ldc2_w -1185084681
    //   8040: l2i
    //   8041: ldc_w -571351470
    //   8044: ixor
    //   8045: goto -> 8056
    //   8048: ldc2_w 559872187
    //   8051: l2i
    //   8052: ldc_w -146760900
    //   8055: ixor
    //   8056: ldc2_w -433684377
    //   8059: l2i
    //   8060: ldc_w -716589769
    //   8063: ixor
    //   8064: ixor
    //   8065: lookupswitch default -> 8092, -1367892954 -> 8048, 1472455157 -> 25322
    //   8092: aload #6
    //   8094: getstatic Perryc.0 : I
    //   8097: ifle -> 8111
    //   8100: ldc2_w 1286159235
    //   8103: l2i
    //   8104: ldc_w 1865226498
    //   8107: ixor
    //   8108: goto -> 8119
    //   8111: ldc2_w -842866516
    //   8114: l2i
    //   8115: ldc_w 1705333504
    //   8118: ixor
    //   8119: ldc2_w 117141078
    //   8122: l2i
    //   8123: ldc_w 1973443028
    //   8126: ixor
    //   8127: ixor
    //   8128: lookupswitch default -> 25364, -616790994 -> 8156, 1356797187 -> 8111
    //   8156: goto -> 8160
    //   8159: athrow
    //   8160: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   8163: goto -> 8167
    //   8166: athrow
    //   8167: getstatic Perryc.0 : I
    //   8170: ifle -> 8184
    //   8173: ldc2_w 209549139
    //   8176: l2i
    //   8177: ldc_w 1550667763
    //   8180: ixor
    //   8181: goto -> 8192
    //   8184: ldc2_w 960035846
    //   8187: l2i
    //   8188: ldc_w 204976860
    //   8191: ixor
    //   8192: ldc2_w -1823672329
    //   8195: l2i
    //   8196: ldc_w -1248405873
    //   8199: ixor
    //   8200: ixor
    //   8201: lookupswitch default -> 25236, 332754850 -> 8228, 1992956376 -> 8184
    //   8228: goto -> 8232
    //   8231: athrow
    //   8232: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   8235: goto -> 8239
    //   8238: athrow
    //   8239: getstatic Perryc.1 : I
    //   8242: ifeq -> 8256
    //   8245: ldc2_w -536171123
    //   8248: l2i
    //   8249: ldc_w 1603165021
    //   8252: ixor
    //   8253: goto -> 8264
    //   8256: ldc2_w -1940242823
    //   8259: l2i
    //   8260: ldc_w -266152297
    //   8263: ixor
    //   8264: ldc2_w -995880847
    //   8267: l2i
    //   8268: ldc_w 1107091960
    //   8271: ixor
    //   8272: ixor
    //   8273: lookupswitch default -> 25732, -115336857 -> 8300, 987498329 -> 8256
    //   8300: goto -> 8304
    //   8303: athrow
    //   8304: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   8309: goto -> 8313
    //   8312: athrow
    //   8313: getstatic Perryc.0 : I
    //   8316: ifle -> 8330
    //   8319: ldc2_w -1120170426
    //   8322: l2i
    //   8323: ldc_w 997015001
    //   8326: ixor
    //   8327: goto -> 8338
    //   8330: ldc2_w -1373892329
    //   8333: l2i
    //   8334: ldc_w -914970880
    //   8337: ixor
    //   8338: ldc2_w -1483439392
    //   8341: l2i
    //   8342: ldc_w 21832220
    //   8345: ixor
    //   8346: ixor
    //   8347: lookupswitch default -> 8372, 546247523 -> 25286, 1140615191 -> 8330
    //   8372: getstatic net/minecraft/init/Blocks.field_150357_h : Lnet/minecraft/block/Block;
    //   8375: if_acmpne -> 8389
    //   8378: ldc2_w -1091314487
    //   8381: l2i
    //   8382: ldc_w -1865690507
    //   8385: ixor
    //   8386: goto -> 8397
    //   8389: ldc2_w 362657138
    //   8392: l2i
    //   8393: ldc_w 1000717263
    //   8396: ixor
    //   8397: ldc2_w -1556684920
    //   8400: l2i
    //   8401: ldc_w 259718964
    //   8404: ixor
    //   8405: ixor
    //   8406: tableswitch default -> 8378, -2106315264 -> 8428, -2106315263 -> 16526
    //   8428: getstatic Perryc.c : I
    //   8431: iflt -> 8445
    //   8434: ldc2_w 333821080
    //   8437: l2i
    //   8438: ldc_w 930743144
    //   8441: ixor
    //   8442: goto -> 8453
    //   8445: ldc2_w -1631978750
    //   8448: l2i
    //   8449: ldc_w 211687924
    //   8452: ixor
    //   8453: ldc2_w -2103168791
    //   8456: l2i
    //   8457: ldc_w -1633524842
    //   8460: ixor
    //   8461: ixor
    //   8462: lookupswitch default -> 8488, -2006139021 -> 8445, 949609615 -> 25306
    //   8488: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   8491: getstatic Perryc.1 : I
    //   8494: ifeq -> 8508
    //   8497: ldc2_w -302776053
    //   8500: l2i
    //   8501: ldc_w -883007170
    //   8504: ixor
    //   8505: goto -> 8516
    //   8508: ldc2_w -237885741
    //   8511: l2i
    //   8512: ldc_w 959567504
    //   8515: ixor
    //   8516: ldc2_w -630626220
    //   8519: l2i
    //   8520: ldc_w 211886033
    //   8523: ixor
    //   8524: ixor
    //   8525: lookupswitch default -> 25826, -262006864 -> 8508, 506169286 -> 8552
    //   8552: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   8555: getstatic Perryc.1 : I
    //   8558: ifeq -> 8572
    //   8561: ldc2_w -1681544103
    //   8564: l2i
    //   8565: ldc_w -1511128904
    //   8568: ixor
    //   8569: goto -> 8580
    //   8572: ldc2_w 854217581
    //   8575: l2i
    //   8576: ldc_w -1300767568
    //   8579: ixor
    //   8580: ldc2_w 538918260
    //   8583: l2i
    //   8584: ldc_w -222710822
    //   8587: ixor
    //   8588: ixor
    //   8589: lookupswitch default -> 8616, -326294961 -> 25330, 938925136 -> 8572
    //   8616: aload #6
    //   8618: getstatic Perryc.0 : I
    //   8621: ifle -> 8635
    //   8624: ldc2_w -103916003
    //   8627: l2i
    //   8628: ldc_w 566514481
    //   8631: ixor
    //   8632: goto -> 8643
    //   8635: ldc2_w -257180043
    //   8638: l2i
    //   8639: ldc_w 2124894588
    //   8642: ixor
    //   8643: ldc2_w 221032501
    //   8646: l2i
    //   8647: ldc_w 1459612695
    //   8650: ixor
    //   8651: ixor
    //   8652: lookupswitch default -> 25432, -2082909938 -> 8635, -706759893 -> 8680
    //   8680: goto -> 8684
    //   8683: athrow
    //   8684: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   8687: goto -> 8691
    //   8690: athrow
    //   8691: getstatic Perryc.1 : I
    //   8694: ifeq -> 8708
    //   8697: ldc2_w -413035125
    //   8700: l2i
    //   8701: ldc_w -481352635
    //   8704: ixor
    //   8705: goto -> 8716
    //   8708: ldc2_w -970810968
    //   8711: l2i
    //   8712: ldc_w 1447516696
    //   8715: ixor
    //   8716: ldc2_w -1217957566
    //   8719: l2i
    //   8720: ldc_w 123887593
    //   8723: ixor
    //   8724: ixor
    //   8725: lookupswitch default -> 8752, -1272209563 -> 25304, 262027312 -> 8708
    //   8752: goto -> 8756
    //   8755: athrow
    //   8756: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   8759: goto -> 8763
    //   8762: athrow
    //   8763: getstatic Perryc.c : I
    //   8766: iflt -> 8780
    //   8769: ldc2_w -1315224820
    //   8772: l2i
    //   8773: ldc_w 1266842880
    //   8776: ixor
    //   8777: goto -> 8788
    //   8780: ldc2_w -1080720585
    //   8783: l2i
    //   8784: ldc_w 855055311
    //   8787: ixor
    //   8788: ldc2_w -47550054
    //   8791: l2i
    //   8792: ldc_w -1837924109
    //   8795: ixor
    //   8796: ixor
    //   8797: lookupswitch default -> 25448, -1790914715 -> 8780, -499422831 -> 8824
    //   8824: goto -> 8828
    //   8827: athrow
    //   8828: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   8833: goto -> 8837
    //   8836: athrow
    //   8837: getstatic Perryc.1 : I
    //   8840: ifeq -> 8854
    //   8843: ldc2_w -1121416560
    //   8846: l2i
    //   8847: ldc_w 1335617508
    //   8850: ixor
    //   8851: goto -> 8862
    //   8854: ldc2_w -440844569
    //   8857: l2i
    //   8858: ldc_w 1315137335
    //   8861: ixor
    //   8862: ldc2_w -1558993182
    //   8865: l2i
    //   8866: ldc_w 574170053
    //   8869: ixor
    //   8870: ixor
    //   8871: lookupswitch default -> 8896, 1101265059 -> 8854, 1939466323 -> 25556
    //   8896: getstatic net/minecraft/init/Blocks.field_150357_h : Lnet/minecraft/block/Block;
    //   8899: if_acmpne -> 8913
    //   8902: ldc2_w 2065348271
    //   8905: l2i
    //   8906: ldc_w -1242454489
    //   8909: ixor
    //   8910: goto -> 8921
    //   8913: ldc2_w -908886615
    //   8916: l2i
    //   8917: ldc_w 121138464
    //   8920: ixor
    //   8921: ldc2_w -1381846303
    //   8924: l2i
    //   8925: ldc_w 2113962853
    //   8928: ixor
    //   8929: ixor
    //   8930: tableswitch default -> 8902, 491331852 -> 8952, 491331853 -> 16526
    //   8952: getstatic Perryc.1 : I
    //   8955: ifeq -> 8969
    //   8958: ldc2_w 1595003610
    //   8961: l2i
    //   8962: ldc_w 55841163
    //   8965: ixor
    //   8966: goto -> 8977
    //   8969: ldc2_w -1313492437
    //   8972: l2i
    //   8973: ldc_w -1448727616
    //   8976: ixor
    //   8977: ldc2_w 2130226850
    //   8980: l2i
    //   8981: ldc_w -900007851
    //   8984: ixor
    //   8985: ixor
    //   8986: lookupswitch default -> 25340, -1397633252 -> 9012, -387476058 -> 8969
    //   9012: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   9015: getstatic Perryc.c : I
    //   9018: iflt -> 9032
    //   9021: ldc2_w -145707104
    //   9024: l2i
    //   9025: ldc_w 1185550351
    //   9028: ixor
    //   9029: goto -> 9040
    //   9032: ldc2_w -369176083
    //   9035: l2i
    //   9036: ldc_w 1447841721
    //   9039: ixor
    //   9040: ldc2_w -1790757821
    //   9043: l2i
    //   9044: ldc_w -702155044
    //   9047: ixor
    //   9048: ixor
    //   9049: lookupswitch default -> 25456, -224625360 -> 9032, -53191477 -> 9076
    //   9076: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   9079: getstatic Perryc.c : I
    //   9082: iflt -> 9096
    //   9085: ldc2_w -1443848758
    //   9088: l2i
    //   9089: ldc_w 1229356566
    //   9092: ixor
    //   9093: goto -> 9104
    //   9096: ldc2_w 703622099
    //   9099: l2i
    //   9100: ldc_w -1348545787
    //   9103: ixor
    //   9104: ldc2_w -137817864
    //   9107: l2i
    //   9108: ldc_w 141402540
    //   9111: ixor
    //   9112: ixor
    //   9113: lookupswitch default -> 25326, 521294472 -> 9096, 2043283842 -> 9140
    //   9140: aload #6
    //   9142: getstatic Perryc.1 : I
    //   9145: ifeq -> 9159
    //   9148: ldc2_w 1353200475
    //   9151: l2i
    //   9152: ldc_w 1817884340
    //   9155: ixor
    //   9156: goto -> 9167
    //   9159: ldc2_w -1399453958
    //   9162: l2i
    //   9163: ldc_w 762711856
    //   9166: ixor
    //   9167: ldc2_w 1574987260
    //   9170: l2i
    //   9171: ldc_w -383509893
    //   9174: ixor
    //   9175: ixor
    //   9176: lookupswitch default -> 9204, -2009662872 -> 25542, 789274418 -> 9159
    //   9204: goto -> 9208
    //   9207: athrow
    //   9208: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   9211: goto -> 9215
    //   9214: athrow
    //   9215: getstatic Perryc.1 : I
    //   9218: ifeq -> 9232
    //   9221: ldc2_w -861785680
    //   9224: l2i
    //   9225: ldc_w 1040156483
    //   9228: ixor
    //   9229: goto -> 9240
    //   9232: ldc2_w -1015122339
    //   9235: l2i
    //   9236: ldc_w -386291974
    //   9239: ixor
    //   9240: ldc2_w 87264396
    //   9243: l2i
    //   9244: ldc_w -1119440301
    //   9247: ixor
    //   9248: ixor
    //   9249: lookupswitch default -> 9276, 736094150 -> 9232, 1227393068 -> 25788
    //   9276: goto -> 9280
    //   9279: athrow
    //   9280: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   9283: goto -> 9287
    //   9286: athrow
    //   9287: getstatic Perryc.c : I
    //   9290: iflt -> 9304
    //   9293: ldc2_w 869672890
    //   9296: l2i
    //   9297: ldc_w 911549653
    //   9300: ixor
    //   9301: goto -> 9312
    //   9304: ldc2_w 629998786
    //   9307: l2i
    //   9308: ldc_w -684568465
    //   9311: ixor
    //   9312: ldc2_w 1871511194
    //   9315: l2i
    //   9316: ldc_w 603069479
    //   9319: ixor
    //   9320: ixor
    //   9321: lookupswitch default -> 25272, -1094601200 -> 9348, 1241375186 -> 9304
    //   9348: goto -> 9352
    //   9351: athrow
    //   9352: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   9357: goto -> 9361
    //   9360: athrow
    //   9361: getstatic Perryc.1 : I
    //   9364: ifeq -> 9378
    //   9367: ldc2_w -1472897757
    //   9370: l2i
    //   9371: ldc_w 1782855761
    //   9374: ixor
    //   9375: goto -> 9386
    //   9378: ldc2_w -1928288310
    //   9381: l2i
    //   9382: ldc_w 826511994
    //   9385: ixor
    //   9386: ldc2_w -731296486
    //   9389: l2i
    //   9390: ldc_w 969704760
    //   9393: ixor
    //   9394: ixor
    //   9395: lookupswitch default -> 25244, 802467152 -> 9378, 1375141266 -> 9420
    //   9420: getstatic net/minecraft/init/Blocks.field_150357_h : Lnet/minecraft/block/Block;
    //   9423: if_acmpne -> 9437
    //   9426: ldc2_w 538187446
    //   9429: l2i
    //   9430: ldc_w -885296171
    //   9433: ixor
    //   9434: goto -> 9445
    //   9437: ldc2_w -714529110
    //   9440: l2i
    //   9441: ldc_w 1044792278
    //   9444: ixor
    //   9445: ldc2_w 611183084
    //   9448: l2i
    //   9449: ldc_w 1590650944
    //   9452: ixor
    //   9453: ixor
    //   9454: tableswitch default -> 9426, -1852971825 -> 9476, -1852971824 -> 16526
    //   9476: getstatic Perryc.0 : I
    //   9479: ifle -> 9493
    //   9482: ldc2_w 1185204837
    //   9485: l2i
    //   9486: ldc_w 543890600
    //   9489: ixor
    //   9490: goto -> 9501
    //   9493: ldc2_w -1821699167
    //   9496: l2i
    //   9497: ldc_w 1144646093
    //   9500: ixor
    //   9501: ldc2_w -681368221
    //   9504: l2i
    //   9505: ldc_w -1930143272
    //   9508: ixor
    //   9509: ixor
    //   9510: lookupswitch default -> 25570, -1933211945 -> 9536, 1029220982 -> 9493
    //   9536: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   9539: getstatic Perryc.0 : I
    //   9542: ifle -> 9556
    //   9545: ldc2_w -314524839
    //   9548: l2i
    //   9549: ldc_w 2119914419
    //   9552: ixor
    //   9553: goto -> 9564
    //   9556: ldc2_w -1153965813
    //   9559: l2i
    //   9560: ldc_w 2136499601
    //   9563: ixor
    //   9564: ldc2_w 1137489982
    //   9567: l2i
    //   9568: ldc_w -1500252883
    //   9571: ixor
    //   9572: ixor
    //   9573: lookupswitch default -> 25210, 556845449 -> 9600, 1984210425 -> 9556
    //   9600: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   9603: getstatic Perryc.0 : I
    //   9606: ifle -> 9620
    //   9609: ldc2_w 878801503
    //   9612: l2i
    //   9613: ldc_w -151355015
    //   9616: ixor
    //   9617: goto -> 9628
    //   9620: ldc2_w -9368297
    //   9623: l2i
    //   9624: ldc_w -1034193655
    //   9627: ixor
    //   9628: ldc2_w 637015227
    //   9631: l2i
    //   9632: ldc_w -130079366
    //   9635: ixor
    //   9636: ixor
    //   9637: lookupswitch default -> 9664, -581398282 -> 9620, 526172903 -> 25832
    //   9664: aload #6
    //   9666: getstatic Perryc.c : I
    //   9669: iflt -> 9683
    //   9672: ldc2_w 1159885481
    //   9675: l2i
    //   9676: ldc_w -354421775
    //   9679: ixor
    //   9680: goto -> 9691
    //   9683: ldc2_w 2034672950
    //   9686: l2i
    //   9687: ldc_w -176437237
    //   9690: ixor
    //   9691: ldc2_w -981292385
    //   9694: l2i
    //   9695: ldc_w 91905249
    //   9698: ixor
    //   9699: ixor
    //   9700: lookupswitch default -> 25782, 1288018755 -> 9728, 1862629158 -> 9683
    //   9728: goto -> 9732
    //   9731: athrow
    //   9732: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   9735: goto -> 9739
    //   9738: athrow
    //   9739: getstatic Perryc.0 : I
    //   9742: ifle -> 9756
    //   9745: ldc2_w 1153977075
    //   9748: l2i
    //   9749: ldc_w 78415112
    //   9752: ixor
    //   9753: goto -> 9764
    //   9756: ldc2_w -663263985
    //   9759: l2i
    //   9760: ldc_w -858213165
    //   9763: ixor
    //   9764: ldc2_w -1124738149
    //   9767: l2i
    //   9768: ldc_w 1120810166
    //   9771: ixor
    //   9772: ixor
    //   9773: lookupswitch default -> 25686, -1101061930 -> 9756, -359383311 -> 9800
    //   9800: goto -> 9804
    //   9803: athrow
    //   9804: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   9807: goto -> 9811
    //   9810: athrow
    //   9811: getstatic Perryc.c : I
    //   9814: iflt -> 9828
    //   9817: ldc2_w -1180772204
    //   9820: l2i
    //   9821: ldc_w -889937151
    //   9824: ixor
    //   9825: goto -> 9836
    //   9828: ldc2_w -1442461992
    //   9831: l2i
    //   9832: ldc_w 1710415600
    //   9835: ixor
    //   9836: ldc2_w 1343722134
    //   9839: l2i
    //   9840: ldc_w 687527071
    //   9843: ixor
    //   9844: ixor
    //   9845: lookupswitch default -> 9872, 193412508 -> 25724, 2024241905 -> 9828
    //   9872: goto -> 9876
    //   9875: athrow
    //   9876: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   9881: goto -> 9885
    //   9884: athrow
    //   9885: getstatic Perryc.c : I
    //   9888: iflt -> 9902
    //   9891: ldc2_w -891089653
    //   9894: l2i
    //   9895: ldc_w 693317222
    //   9898: ixor
    //   9899: goto -> 9910
    //   9902: ldc2_w 1840641709
    //   9905: l2i
    //   9906: ldc_w 581617680
    //   9909: ixor
    //   9910: ldc2_w 1630855834
    //   9913: l2i
    //   9914: ldc_w -1154619656
    //   9917: ixor
    //   9918: ixor
    //   9919: lookupswitch default -> 25402, -1794753825 -> 9944, 967386895 -> 9902
    //   9944: getstatic net/minecraft/init/Blocks.field_150357_h : Lnet/minecraft/block/Block;
    //   9947: if_acmpne -> 9961
    //   9950: ldc2_w -223052794
    //   9953: l2i
    //   9954: ldc_w 1339710827
    //   9957: ixor
    //   9958: goto -> 9969
    //   9961: ldc2_w 607645442
    //   9964: l2i
    //   9965: ldc_w -1722167700
    //   9968: ixor
    //   9969: ldc2_w -34277962
    //   9972: l2i
    //   9973: ldc_w -438207946
    //   9976: ixor
    //   9977: ixor
    //   9978: tableswitch default -> 9950, -1518620947 -> 10000, -1518620946 -> 16526
    //   10000: getstatic Perryc.1 : I
    //   10003: ifeq -> 10017
    //   10006: ldc2_w -68087773
    //   10009: l2i
    //   10010: ldc_w 541721522
    //   10013: ixor
    //   10014: goto -> 10025
    //   10017: ldc2_w -109286598
    //   10020: l2i
    //   10021: ldc_w 691001499
    //   10024: ixor
    //   10025: ldc2_w -1190407550
    //   10028: l2i
    //   10029: ldc_w 48587374
    //   10032: ixor
    //   10033: ixor
    //   10034: lookupswitch default -> 10060, 1201647449 -> 10017, 1616225149 -> 25696
    //   10060: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   10063: getstatic Perryc.0 : I
    //   10066: ifle -> 10080
    //   10069: ldc2_w -291844843
    //   10072: l2i
    //   10073: ldc_w -854057699
    //   10076: ixor
    //   10077: goto -> 10088
    //   10080: ldc2_w -155766997
    //   10083: l2i
    //   10084: ldc_w 286214653
    //   10087: ixor
    //   10088: ldc2_w -234493739
    //   10091: l2i
    //   10092: ldc_w 146021490
    //   10095: ixor
    //   10096: ixor
    //   10097: lookupswitch default -> 10124, -650959697 -> 25464, 1524663423 -> 10080
    //   10124: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   10127: getstatic Perryc.c : I
    //   10130: iflt -> 10144
    //   10133: ldc2_w -1352741556
    //   10136: l2i
    //   10137: ldc_w -288932639
    //   10140: ixor
    //   10141: goto -> 10152
    //   10144: ldc2_w 1338783510
    //   10147: l2i
    //   10148: ldc_w -303036835
    //   10151: ixor
    //   10152: ldc2_w -405986483
    //   10155: l2i
    //   10156: ldc_w 692607548
    //   10159: ixor
    //   10160: ixor
    //   10161: lookupswitch default -> 25706, -1893955364 -> 10144, 1824081978 -> 10188
    //   10188: aload #6
    //   10190: getstatic Perryc.c : I
    //   10193: iflt -> 10207
    //   10196: ldc2_w -332348430
    //   10199: l2i
    //   10200: ldc_w -1174509444
    //   10203: ixor
    //   10204: goto -> 10215
    //   10207: ldc2_w -1367389283
    //   10210: l2i
    //   10211: ldc_w -234613438
    //   10214: ixor
    //   10215: ldc2_w -1040969630
    //   10218: l2i
    //   10219: ldc_w 306724972
    //   10222: ixor
    //   10223: ixor
    //   10224: lookupswitch default -> 10252, -2039284864 -> 25342, 434968730 -> 10207
    //   10252: goto -> 10256
    //   10255: athrow
    //   10256: invokevirtual func_177977_b : ()Lnet/minecraft/util/math/BlockPos;
    //   10259: goto -> 10263
    //   10262: athrow
    //   10263: getstatic Perryc.0 : I
    //   10266: ifle -> 10280
    //   10269: ldc2_w 1642293934
    //   10272: l2i
    //   10273: ldc_w -1170891448
    //   10276: ixor
    //   10277: goto -> 10288
    //   10280: ldc2_w 1792438802
    //   10283: l2i
    //   10284: ldc_w -2115444236
    //   10287: ixor
    //   10288: ldc2_w -1612142846
    //   10291: l2i
    //   10292: ldc_w -1469570512
    //   10295: ixor
    //   10296: ixor
    //   10297: lookupswitch default -> 10324, -329878828 -> 25420, 884639840 -> 10280
    //   10324: goto -> 10328
    //   10327: athrow
    //   10328: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   10331: goto -> 10335
    //   10334: athrow
    //   10335: getstatic Perryc.1 : I
    //   10338: ifeq -> 10352
    //   10341: ldc2_w 172260352
    //   10344: l2i
    //   10345: ldc_w -1155580607
    //   10348: ixor
    //   10349: goto -> 10360
    //   10352: ldc2_w -1908058809
    //   10355: l2i
    //   10356: ldc_w -394954873
    //   10359: ixor
    //   10360: ldc2_w 560133531
    //   10363: l2i
    //   10364: ldc_w 66678821
    //   10367: ixor
    //   10368: ixor
    //   10369: lookupswitch default -> 25638, -1816083201 -> 10352, 1152100222 -> 10396
    //   10396: goto -> 10400
    //   10399: athrow
    //   10400: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   10405: goto -> 10409
    //   10408: athrow
    //   10409: getstatic Perryc.0 : I
    //   10412: ifle -> 10426
    //   10415: ldc2_w -1207559434
    //   10418: l2i
    //   10419: ldc_w 587555739
    //   10422: ixor
    //   10423: goto -> 10434
    //   10426: ldc2_w 357739307
    //   10429: l2i
    //   10430: ldc_w 1272464065
    //   10433: ixor
    //   10434: ldc2_w 447106453
    //   10437: l2i
    //   10438: ldc_w 877795892
    //   10441: ixor
    //   10442: ixor
    //   10443: lookupswitch default -> 25690, -1242091828 -> 10426, 1887354443 -> 10468
    //   10468: getstatic net/minecraft/init/Blocks.field_150357_h : Lnet/minecraft/block/Block;
    //   10471: if_acmpne -> 10485
    //   10474: ldc2_w -968938246
    //   10477: l2i
    //   10478: ldc_w -1744974544
    //   10481: ixor
    //   10482: goto -> 10493
    //   10485: ldc2_w 1517688509
    //   10488: l2i
    //   10489: ldc_w 196409200
    //   10492: ixor
    //   10493: ldc2_w 1954844075
    //   10496: l2i
    //   10497: ldc_w -1982718982
    //   10500: ixor
    //   10501: ixor
    //   10502: tableswitch default -> 10474, -1399556197 -> 10524, -1399556196 -> 16526
    //   10524: getstatic Perryc.c : I
    //   10527: iflt -> 10541
    //   10530: ldc2_w 1271485073
    //   10533: l2i
    //   10534: ldc_w -2071762294
    //   10537: ixor
    //   10538: goto -> 10549
    //   10541: ldc2_w 71149339
    //   10544: l2i
    //   10545: ldc_w -919435772
    //   10548: ixor
    //   10549: ldc2_w -1297982650
    //   10552: l2i
    //   10553: ldc_w 695948209
    //   10556: ixor
    //   10557: ixor
    //   10558: lookupswitch default -> 25274, 1418932460 -> 10541, 1456876008 -> 10584
    //   10584: aload #6
    //   10586: getstatic Perryc.c : I
    //   10589: iflt -> 10603
    //   10592: ldc2_w 1353760038
    //   10595: l2i
    //   10596: ldc_w 2113175731
    //   10599: ixor
    //   10600: goto -> 10611
    //   10603: ldc2_w 1646415069
    //   10606: l2i
    //   10607: ldc_w -1323057423
    //   10610: ixor
    //   10611: ldc2_w -1222802192
    //   10614: l2i
    //   10615: ldc_w 74203836
    //   10618: ixor
    //   10619: ixor
    //   10620: lookupswitch default -> 25546, -1640629287 -> 10603, 1617966176 -> 10648
    //   10648: aload_0
    //   10649: getstatic Perryc.c : I
    //   10652: iflt -> 10666
    //   10655: ldc2_w 190045761
    //   10658: l2i
    //   10659: ldc_w 1630567455
    //   10662: ixor
    //   10663: goto -> 10674
    //   10666: ldc2_w -1618147318
    //   10669: l2i
    //   10670: ldc_w -318705262
    //   10673: ixor
    //   10674: ldc2_w -526488718
    //   10677: l2i
    //   10678: ldc_w -764896627
    //   10681: ixor
    //   10682: ixor
    //   10683: lookupswitch default -> 25760, 1081804903 -> 10708, 1486181281 -> 10666
    //   10708: getfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10711: getstatic Perryc.c : I
    //   10714: iflt -> 10728
    //   10717: ldc2_w -1042764505
    //   10720: l2i
    //   10721: ldc_w -1014832924
    //   10724: ixor
    //   10725: goto -> 10736
    //   10728: ldc2_w 693413742
    //   10731: l2i
    //   10732: ldc_w 247585188
    //   10735: ixor
    //   10736: ldc2_w -854724857
    //   10739: l2i
    //   10740: ldc_w 1647067261
    //   10743: ixor
    //   10744: ixor
    //   10745: lookupswitch default -> 10772, -1384389959 -> 25514, -760168648 -> 10728
    //   10772: goto -> 10776
    //   10775: athrow
    //   10776: invokevirtual getValue : ()Ljava/lang/Object;
    //   10779: goto -> 10783
    //   10782: athrow
    //   10783: checkcast java/lang/Boolean
    //   10786: getstatic Perryc.0 : I
    //   10789: ifle -> 10803
    //   10792: ldc2_w 1384969245
    //   10795: l2i
    //   10796: ldc_w -363550523
    //   10799: ixor
    //   10800: goto -> 10811
    //   10803: ldc2_w 1597801443
    //   10806: l2i
    //   10807: ldc_w 1749497743
    //   10810: ixor
    //   10811: ldc2_w -745212476
    //   10814: l2i
    //   10815: ldc_w -909989918
    //   10818: ixor
    //   10819: ixor
    //   10820: lookupswitch default -> 25482, -1567748354 -> 10803, 757982794 -> 10848
    //   10848: goto -> 10852
    //   10851: athrow
    //   10852: invokevirtual booleanValue : ()Z
    //   10855: goto -> 10859
    //   10858: athrow
    //   10859: ifeq -> 10873
    //   10862: ldc2_w 240181221
    //   10865: l2i
    //   10866: ldc_w 1635539751
    //   10869: ixor
    //   10870: goto -> 10881
    //   10873: ldc2_w 1973831874
    //   10876: l2i
    //   10877: ldc_w 445303815
    //   10880: ixor
    //   10881: ldc2_w -89593813
    //   10884: l2i
    //   10885: ldc_w 1495309970
    //   10888: ixor
    //   10889: ixor
    //   10890: tableswitch default -> 10862, -861605253 -> 10912, -861605252 -> 11270
    //   10912: getstatic Perryc.0 : I
    //   10915: ifle -> 10929
    //   10918: ldc2_w -1810233149
    //   10921: l2i
    //   10922: ldc_w 1498302551
    //   10925: ixor
    //   10926: goto -> 10937
    //   10929: ldc2_w -1123509100
    //   10932: l2i
    //   10933: ldc_w -1533589996
    //   10936: ixor
    //   10937: ldc2_w -509971004
    //   10940: l2i
    //   10941: ldc_w -244853648
    //   10944: ixor
    //   10945: ixor
    //   10946: lookupswitch default -> 25778, -576069344 -> 10929, 157449012 -> 10972
    //   10972: goto -> 10976
    //   10975: athrow
    //   10976: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   10979: goto -> 10983
    //   10982: athrow
    //   10983: getstatic Perryc.0 : I
    //   10986: ifle -> 11000
    //   10989: ldc2_w -1689723077
    //   10992: l2i
    //   10993: ldc_w 855877750
    //   10996: ixor
    //   10997: goto -> 11008
    //   11000: ldc2_w -33392424
    //   11003: l2i
    //   11004: ldc_w 715775440
    //   11007: ixor
    //   11008: ldc2_w 582989588
    //   11011: l2i
    //   11012: ldc_w -1260279674
    //   11015: ixor
    //   11016: ixor
    //   11017: lookupswitch default -> 25410, 1041590495 -> 11000, 1123400346 -> 11044
    //   11044: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11047: getstatic Perryc.0 : I
    //   11050: ifle -> 11064
    //   11053: ldc2_w 1614848868
    //   11056: l2i
    //   11057: ldc_w 436980236
    //   11060: ixor
    //   11061: goto -> 11072
    //   11064: ldc2_w 1042617473
    //   11067: l2i
    //   11068: ldc_w -78718098
    //   11071: ixor
    //   11072: ldc2_w 1684966838
    //   11075: l2i
    //   11076: ldc_w 2088856279
    //   11079: ixor
    //   11080: ixor
    //   11081: lookupswitch default -> 11108, 540803101 -> 11064, 1654951433 -> 25700
    //   11108: goto -> 11112
    //   11111: athrow
    //   11112: invokevirtual getValue : ()Ljava/lang/Object;
    //   11115: goto -> 11119
    //   11118: athrow
    //   11119: checkcast java/lang/Integer
    //   11122: getstatic Perryc.0 : I
    //   11125: ifle -> 11139
    //   11128: ldc2_w 590761317
    //   11131: l2i
    //   11132: ldc_w -1814755755
    //   11135: ixor
    //   11136: goto -> 11147
    //   11139: ldc2_w -1607310071
    //   11142: l2i
    //   11143: ldc_w 1610877781
    //   11146: ixor
    //   11147: ldc2_w -1532743413
    //   11150: l2i
    //   11151: ldc_w 292452620
    //   11154: ixor
    //   11155: ixor
    //   11156: lookupswitch default -> 25622, 86573879 -> 11139, 1979459163 -> 11184
    //   11184: goto -> 11188
    //   11187: athrow
    //   11188: invokevirtual intValue : ()I
    //   11191: goto -> 11195
    //   11194: athrow
    //   11195: getstatic Perryc.c : I
    //   11198: iflt -> 11212
    //   11201: ldc2_w 301434872
    //   11204: l2i
    //   11205: ldc_w -1431586812
    //   11208: ixor
    //   11209: goto -> 11220
    //   11212: ldc2_w -124968031
    //   11215: l2i
    //   11216: ldc_w -730008782
    //   11219: ixor
    //   11220: ldc2_w 1846188448
    //   11223: l2i
    //   11224: ldc_w 592816693
    //   11227: ixor
    //   11228: ixor
    //   11229: lookupswitch default -> 11256, -748923923 -> 11212, -167572375 -> 25230
    //   11256: goto -> 11260
    //   11259: athrow
    //   11260: invokestatic rainbow : (I)Ljava/awt/Color;
    //   11263: goto -> 11267
    //   11266: athrow
    //   11267: goto -> 12435
    //   11270: new java/awt/Color
    //   11273: dup
    //   11274: getstatic Perryc.0 : I
    //   11277: ifle -> 11291
    //   11280: ldc2_w -1768162690
    //   11283: l2i
    //   11284: ldc_w 109186181
    //   11287: ixor
    //   11288: goto -> 11299
    //   11291: ldc2_w -1198841511
    //   11294: l2i
    //   11295: ldc_w 2001785051
    //   11298: ixor
    //   11299: ldc2_w -1236939543
    //   11302: l2i
    //   11303: ldc_w -629350283
    //   11306: ixor
    //   11307: ixor
    //   11308: lookupswitch default -> 25468, -1545413346 -> 11336, -64955801 -> 11291
    //   11336: aload_0
    //   11337: getstatic Perryc.c : I
    //   11340: iflt -> 11354
    //   11343: ldc2_w 594046955
    //   11346: l2i
    //   11347: ldc_w -1187952721
    //   11350: ixor
    //   11351: goto -> 11362
    //   11354: ldc2_w 1864481845
    //   11357: l2i
    //   11358: ldc_w 363812654
    //   11361: ixor
    //   11362: ldc2_w -1780028645
    //   11365: l2i
    //   11366: ldc_w -642274366
    //   11369: ixor
    //   11370: ixor
    //   11371: lookupswitch default -> 25528, -704092003 -> 11354, 920628162 -> 11396
    //   11396: getfield safeRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11399: getstatic Perryc.c : I
    //   11402: iflt -> 11416
    //   11405: ldc2_w -2039535137
    //   11408: l2i
    //   11409: ldc_w 804474924
    //   11412: ixor
    //   11413: goto -> 11424
    //   11416: ldc2_w 256142150
    //   11419: l2i
    //   11420: ldc_w -315393432
    //   11423: ixor
    //   11424: ldc2_w -2030589834
    //   11427: l2i
    //   11428: ldc_w -1410416366
    //   11431: ixor
    //   11432: ixor
    //   11433: lookupswitch default -> 11460, -2071654249 -> 25566, -579077463 -> 11416
    //   11460: goto -> 11464
    //   11463: athrow
    //   11464: invokevirtual getValue : ()Ljava/lang/Object;
    //   11467: goto -> 11471
    //   11470: athrow
    //   11471: checkcast java/lang/Integer
    //   11474: getstatic Perryc.c : I
    //   11477: iflt -> 11491
    //   11480: ldc2_w 1506802114
    //   11483: l2i
    //   11484: ldc_w 590170833
    //   11487: ixor
    //   11488: goto -> 11499
    //   11491: ldc2_w 1073083520
    //   11494: l2i
    //   11495: ldc_w -1634229042
    //   11498: ixor
    //   11499: ldc2_w 123658519
    //   11502: l2i
    //   11503: ldc_w -388377671
    //   11506: ixor
    //   11507: ixor
    //   11508: lookupswitch default -> 25688, -1788509763 -> 11491, 1323655904 -> 11536
    //   11536: goto -> 11540
    //   11539: athrow
    //   11540: invokevirtual intValue : ()I
    //   11543: goto -> 11547
    //   11546: athrow
    //   11547: getstatic Perryc.c : I
    //   11550: iflt -> 11564
    //   11553: ldc2_w 1638204417
    //   11556: l2i
    //   11557: ldc_w 574411155
    //   11560: ixor
    //   11561: goto -> 11572
    //   11564: ldc2_w 1384634294
    //   11567: l2i
    //   11568: ldc_w 2004980390
    //   11571: ixor
    //   11572: ldc2_w -938700871
    //   11575: l2i
    //   11576: ldc_w 275656735
    //   11579: ixor
    //   11580: ixor
    //   11581: lookupswitch default -> 11608, -1678022092 -> 25478, -1176247917 -> 11564
    //   11608: aload_0
    //   11609: getstatic Perryc.c : I
    //   11612: iflt -> 11626
    //   11615: ldc2_w -1849830892
    //   11618: l2i
    //   11619: ldc_w 249122909
    //   11622: ixor
    //   11623: goto -> 11634
    //   11626: ldc2_w -1346543915
    //   11629: l2i
    //   11630: ldc_w 273845180
    //   11633: ixor
    //   11634: ldc2_w 1414983061
    //   11637: l2i
    //   11638: ldc_w 1383163077
    //   11641: ixor
    //   11642: ixor
    //   11643: lookupswitch default -> 25512, -1723659495 -> 11626, -1178051527 -> 11668
    //   11668: getfield safeGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11671: getstatic Perryc.c : I
    //   11674: iflt -> 11688
    //   11677: ldc2_w -1053038866
    //   11680: l2i
    //   11681: ldc_w -1131990573
    //   11684: ixor
    //   11685: goto -> 11696
    //   11688: ldc2_w 1855796818
    //   11691: l2i
    //   11692: ldc_w 436718600
    //   11695: ixor
    //   11696: ldc2_w 610575360
    //   11699: l2i
    //   11700: ldc_w -1181406631
    //   11703: ixor
    //   11704: ixor
    //   11705: lookupswitch default -> 11732, -531801756 -> 25426, 2056079939 -> 11688
    //   11732: goto -> 11736
    //   11735: athrow
    //   11736: invokevirtual getValue : ()Ljava/lang/Object;
    //   11739: goto -> 11743
    //   11742: athrow
    //   11743: checkcast java/lang/Integer
    //   11746: getstatic Perryc.c : I
    //   11749: iflt -> 11763
    //   11752: ldc2_w -488587182
    //   11755: l2i
    //   11756: ldc_w -1243121470
    //   11759: ixor
    //   11760: goto -> 11771
    //   11763: ldc2_w -1408162658
    //   11766: l2i
    //   11767: ldc_w 1012390498
    //   11770: ixor
    //   11771: ldc2_w 220099447
    //   11774: l2i
    //   11775: ldc_w -1596754982
    //   11778: ixor
    //   11779: ixor
    //   11780: lookupswitch default -> 11808, -808183086 -> 11763, -87377859 -> 25730
    //   11808: goto -> 11812
    //   11811: athrow
    //   11812: invokevirtual intValue : ()I
    //   11815: goto -> 11819
    //   11818: athrow
    //   11819: getstatic Perryc.1 : I
    //   11822: ifeq -> 11836
    //   11825: ldc2_w -1851675311
    //   11828: l2i
    //   11829: ldc_w -392779831
    //   11832: ixor
    //   11833: goto -> 11844
    //   11836: ldc2_w -1875131214
    //   11839: l2i
    //   11840: ldc_w 878955533
    //   11843: ixor
    //   11844: ldc2_w 1705478801
    //   11847: l2i
    //   11848: ldc_w 265527634
    //   11851: ixor
    //   11852: ixor
    //   11853: lookupswitch default -> 25624, -835968132 -> 11880, 323166555 -> 11836
    //   11880: aload_0
    //   11881: getstatic Perryc.c : I
    //   11884: iflt -> 11898
    //   11887: ldc2_w 277915066
    //   11890: l2i
    //   11891: ldc_w -395731925
    //   11894: ixor
    //   11895: goto -> 11906
    //   11898: ldc2_w 606378427
    //   11901: l2i
    //   11902: ldc_w -1746000369
    //   11905: ixor
    //   11906: ldc2_w 1932054979
    //   11909: l2i
    //   11910: ldc_w 1007083602
    //   11913: ixor
    //   11914: ixor
    //   11915: lookupswitch default -> 11940, -1210644480 -> 25704, -869941459 -> 11898
    //   11940: getfield safeBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11943: getstatic Perryc.1 : I
    //   11946: ifeq -> 11960
    //   11949: ldc2_w -278875006
    //   11952: l2i
    //   11953: ldc_w 83386365
    //   11956: ixor
    //   11957: goto -> 11968
    //   11960: ldc2_w -2126828134
    //   11963: l2i
    //   11964: ldc_w -1282846596
    //   11967: ixor
    //   11968: ldc2_w 1303362286
    //   11971: l2i
    //   11972: ldc_w 2056707726
    //   11975: ixor
    //   11976: ixor
    //   11977: lookupswitch default -> 12004, -593391841 -> 25872, 526795718 -> 11960
    //   12004: goto -> 12008
    //   12007: athrow
    //   12008: invokevirtual getValue : ()Ljava/lang/Object;
    //   12011: goto -> 12015
    //   12014: athrow
    //   12015: checkcast java/lang/Integer
    //   12018: getstatic Perryc.1 : I
    //   12021: ifeq -> 12035
    //   12024: ldc2_w 1983774187
    //   12027: l2i
    //   12028: ldc_w -1221053755
    //   12031: ixor
    //   12032: goto -> 12043
    //   12035: ldc2_w 1270600493
    //   12038: l2i
    //   12039: ldc_w -191944805
    //   12042: ixor
    //   12043: ldc2_w -1686776964
    //   12046: l2i
    //   12047: ldc_w -549955909
    //   12050: ixor
    //   12051: ixor
    //   12052: lookupswitch default -> 25590, -2058859799 -> 12035, -75927183 -> 12080
    //   12080: goto -> 12084
    //   12083: athrow
    //   12084: invokevirtual intValue : ()I
    //   12087: goto -> 12091
    //   12090: athrow
    //   12091: getstatic Perryc.1 : I
    //   12094: ifeq -> 12108
    //   12097: ldc2_w -1746595226
    //   12100: l2i
    //   12101: ldc_w 680585890
    //   12104: ixor
    //   12105: goto -> 12116
    //   12108: ldc2_w -1748501267
    //   12111: l2i
    //   12112: ldc_w -287714434
    //   12115: ixor
    //   12116: ldc2_w -783922169
    //   12119: l2i
    //   12120: ldc_w 1594128053
    //   12123: ixor
    //   12124: ixor
    //   12125: lookupswitch default -> 25856, -144960223 -> 12152, 825737846 -> 12108
    //   12152: aload_0
    //   12153: getstatic Perryc.c : I
    //   12156: iflt -> 12170
    //   12159: ldc2_w 1901371071
    //   12162: l2i
    //   12163: ldc_w 543614698
    //   12166: ixor
    //   12167: goto -> 12178
    //   12170: ldc2_w -216051615
    //   12173: l2i
    //   12174: ldc_w -1344769723
    //   12177: ixor
    //   12178: ldc2_w -2069287850
    //   12181: l2i
    //   12182: ldc_w 875737067
    //   12185: ixor
    //   12186: ixor
    //   12187: lookupswitch default -> 12212, -508953624 -> 25504, 255474093 -> 12170
    //   12212: getfield safeAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12215: getstatic Perryc.c : I
    //   12218: iflt -> 12232
    //   12221: ldc2_w -2096984667
    //   12224: l2i
    //   12225: ldc_w -1239504444
    //   12228: ixor
    //   12229: goto -> 12240
    //   12232: ldc2_w 1610802464
    //   12235: l2i
    //   12236: ldc_w -1486453122
    //   12239: ixor
    //   12240: ldc2_w 293133903
    //   12243: l2i
    //   12244: ldc_w -1174164785
    //   12247: ixor
    //   12248: ixor
    //   12249: lookupswitch default -> 12276, -1637396255 -> 25356, -382265481 -> 12232
    //   12276: goto -> 12280
    //   12279: athrow
    //   12280: invokevirtual getValue : ()Ljava/lang/Object;
    //   12283: goto -> 12287
    //   12286: athrow
    //   12287: checkcast java/lang/Integer
    //   12290: getstatic Perryc.1 : I
    //   12293: ifeq -> 12307
    //   12296: ldc2_w 1199754126
    //   12299: l2i
    //   12300: ldc_w 1775812671
    //   12303: ixor
    //   12304: goto -> 12315
    //   12307: ldc2_w 1884508546
    //   12310: l2i
    //   12311: ldc_w 1114644990
    //   12314: ixor
    //   12315: ldc2_w 571837401
    //   12318: l2i
    //   12319: ldc_w -563311759
    //   12322: ixor
    //   12323: ixor
    //   12324: lookupswitch default -> 12352, -769455335 -> 25484, 97032525 -> 12307
    //   12352: goto -> 12356
    //   12355: athrow
    //   12356: invokevirtual intValue : ()I
    //   12359: goto -> 12363
    //   12362: athrow
    //   12363: getstatic Perryc.1 : I
    //   12366: ifeq -> 12380
    //   12369: ldc2_w 685147700
    //   12372: l2i
    //   12373: ldc_w 1313082308
    //   12376: ixor
    //   12377: goto -> 12388
    //   12380: ldc2_w 472592708
    //   12383: l2i
    //   12384: ldc_w 1456685119
    //   12387: ixor
    //   12388: ldc2_w -29535611
    //   12391: l2i
    //   12392: ldc_w -729686966
    //   12395: ixor
    //   12396: ixor
    //   12397: lookupswitch default -> 12424, -227247455 -> 12380, 1278083903 -> 25376
    //   12424: goto -> 12428
    //   12427: athrow
    //   12428: invokespecial <init> : (IIII)V
    //   12431: goto -> 12435
    //   12434: athrow
    //   12435: getstatic Perryc.c : I
    //   12438: iflt -> 12452
    //   12441: ldc2_w 969886709
    //   12444: l2i
    //   12445: ldc_w 1895117652
    //   12448: ixor
    //   12449: goto -> 12460
    //   12452: ldc2_w 492378627
    //   12455: l2i
    //   12456: ldc_w 695529210
    //   12459: ixor
    //   12460: ldc2_w 1509749645
    //   12463: l2i
    //   12464: ldc_w -1976845173
    //   12467: ixor
    //   12468: ixor
    //   12469: lookupswitch default -> 12496, -1695729753 -> 25212, -715793999 -> 12452
    //   12496: aload_0
    //   12497: getstatic Perryc.c : I
    //   12500: iflt -> 12514
    //   12503: ldc2_w -494895923
    //   12506: l2i
    //   12507: ldc_w 260819848
    //   12510: ixor
    //   12511: goto -> 12522
    //   12514: ldc2_w 1197114675
    //   12517: l2i
    //   12518: ldc_w 2131326374
    //   12521: ixor
    //   12522: ldc2_w 780985257
    //   12525: l2i
    //   12526: ldc_w -1736074185
    //   12529: ixor
    //   12530: ixor
    //   12531: lookupswitch default -> 12556, -350359308 -> 12514, 1526909147 -> 25354
    //   12556: getfield customOutline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12559: getstatic Perryc.1 : I
    //   12562: ifeq -> 12576
    //   12565: ldc2_w -1942322155
    //   12568: l2i
    //   12569: ldc_w -1898561601
    //   12572: ixor
    //   12573: goto -> 12584
    //   12576: ldc2_w 2074070323
    //   12579: l2i
    //   12580: ldc_w 1480935831
    //   12583: ixor
    //   12584: ldc2_w 916865490
    //   12587: l2i
    //   12588: ldc_w 1647422710
    //   12591: ixor
    //   12592: ixor
    //   12593: lookupswitch default -> 25882, 1450923662 -> 12576, 2001561984 -> 12620
    //   12620: goto -> 12624
    //   12623: athrow
    //   12624: invokevirtual getValue : ()Ljava/lang/Object;
    //   12627: goto -> 12631
    //   12630: athrow
    //   12631: checkcast java/lang/Boolean
    //   12634: getstatic Perryc.1 : I
    //   12637: ifeq -> 12651
    //   12640: ldc2_w -522824863
    //   12643: l2i
    //   12644: ldc_w 367964048
    //   12647: ixor
    //   12648: goto -> 12659
    //   12651: ldc2_w 261546174
    //   12654: l2i
    //   12655: ldc_w 1155009974
    //   12658: ixor
    //   12659: ldc2_w -1159240499
    //   12662: l2i
    //   12663: ldc_w 160749511
    //   12666: ixor
    //   12667: ixor
    //   12668: lookupswitch default -> 12696, -1399113538 -> 12651, 1179340795 -> 25666
    //   12696: goto -> 12700
    //   12699: athrow
    //   12700: invokevirtual booleanValue : ()Z
    //   12703: goto -> 12707
    //   12706: athrow
    //   12707: new java/awt/Color
    //   12710: dup
    //   12711: getstatic Perryc.c : I
    //   12714: iflt -> 12728
    //   12717: ldc2_w -1572252931
    //   12720: l2i
    //   12721: ldc_w 1062994636
    //   12724: ixor
    //   12725: goto -> 12736
    //   12728: ldc2_w 1786879609
    //   12731: l2i
    //   12732: ldc_w -181338932
    //   12735: ixor
    //   12736: ldc2_w 342016413
    //   12739: l2i
    //   12740: ldc_w -736414378
    //   12743: ixor
    //   12744: ixor
    //   12745: lookupswitch default -> 25602, 1567401210 -> 12728, 1606981246 -> 12772
    //   12772: aload_0
    //   12773: getstatic Perryc.c : I
    //   12776: iflt -> 12790
    //   12779: ldc2_w -629679390
    //   12782: l2i
    //   12783: ldc_w -1948324314
    //   12786: ixor
    //   12787: goto -> 12798
    //   12790: ldc2_w 1940660953
    //   12793: l2i
    //   12794: ldc_w -804711311
    //   12797: ixor
    //   12798: ldc2_w 1309129536
    //   12801: l2i
    //   12802: ldc_w -169969210
    //   12805: ixor
    //   12806: ixor
    //   12807: lookupswitch default -> 12832, -361695678 -> 25744, 771638887 -> 12790
    //   12832: getfield safecRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12835: getstatic Perryc.1 : I
    //   12838: ifeq -> 12852
    //   12841: ldc2_w 1720192129
    //   12844: l2i
    //   12845: ldc_w -1975562593
    //   12848: ixor
    //   12849: goto -> 12860
    //   12852: ldc2_w 1786486916
    //   12855: l2i
    //   12856: ldc_w -352253758
    //   12859: ixor
    //   12860: ldc2_w -803748728
    //   12863: l2i
    //   12864: ldc_w 846233606
    //   12867: ixor
    //   12868: ixor
    //   12869: lookupswitch default -> 25296, 248514192 -> 12852, 1662905544 -> 12896
    //   12896: goto -> 12900
    //   12899: athrow
    //   12900: invokevirtual getValue : ()Ljava/lang/Object;
    //   12903: goto -> 12907
    //   12906: athrow
    //   12907: checkcast java/lang/Integer
    //   12910: getstatic Perryc.c : I
    //   12913: iflt -> 12927
    //   12916: ldc2_w -738594623
    //   12919: l2i
    //   12920: ldc_w 375527733
    //   12923: ixor
    //   12924: goto -> 12935
    //   12927: ldc2_w 900451192
    //   12930: l2i
    //   12931: ldc_w 535331423
    //   12934: ixor
    //   12935: ldc2_w 6328287
    //   12938: l2i
    //   12939: ldc_w 323739868
    //   12942: ixor
    //   12943: ixor
    //   12944: lookupswitch default -> 12972, -724648717 -> 12927, -693074185 -> 25262
    //   12972: goto -> 12976
    //   12975: athrow
    //   12976: invokevirtual intValue : ()I
    //   12979: goto -> 12983
    //   12982: athrow
    //   12983: getstatic Perryc.0 : I
    //   12986: ifle -> 13000
    //   12989: ldc2_w -590067959
    //   12992: l2i
    //   12993: ldc_w 611489995
    //   12996: ixor
    //   12997: goto -> 13008
    //   13000: ldc2_w -800223432
    //   13003: l2i
    //   13004: ldc_w -779919720
    //   13007: ixor
    //   13008: ldc2_w 965960390
    //   13011: l2i
    //   13012: ldc_w 41803985
    //   13015: ixor
    //   13016: ixor
    //   13017: lookupswitch default -> 25898, -1018667563 -> 13000, 975197111 -> 13044
    //   13044: aload_0
    //   13045: getstatic Perryc.0 : I
    //   13048: ifle -> 13062
    //   13051: ldc2_w 1804895241
    //   13054: l2i
    //   13055: ldc_w -278387301
    //   13058: ixor
    //   13059: goto -> 13070
    //   13062: ldc2_w -759935984
    //   13065: l2i
    //   13066: ldc_w 63307285
    //   13069: ixor
    //   13070: ldc2_w 1868552937
    //   13073: l2i
    //   13074: ldc_w 2134011019
    //   13077: ixor
    //   13078: ixor
    //   13079: lookupswitch default -> 13104, -1802430480 -> 25650, 1396783673 -> 13062
    //   13104: getfield safecGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13107: getstatic Perryc.1 : I
    //   13110: ifeq -> 13124
    //   13113: ldc2_w -1252541095
    //   13116: l2i
    //   13117: ldc_w 1133150027
    //   13120: ixor
    //   13121: goto -> 13132
    //   13124: ldc2_w 1979930268
    //   13127: l2i
    //   13128: ldc_w -978290400
    //   13131: ixor
    //   13132: ldc2_w -981407217
    //   13135: l2i
    //   13136: ldc_w -219590377
    //   13139: ixor
    //   13140: ixor
    //   13141: lookupswitch default -> 25338, -2066049884 -> 13168, -1045137142 -> 13124
    //   13168: goto -> 13172
    //   13171: athrow
    //   13172: invokevirtual getValue : ()Ljava/lang/Object;
    //   13175: goto -> 13179
    //   13178: athrow
    //   13179: checkcast java/lang/Integer
    //   13182: getstatic Perryc.c : I
    //   13185: iflt -> 13199
    //   13188: ldc2_w -1669103653
    //   13191: l2i
    //   13192: ldc_w 1566263679
    //   13195: ixor
    //   13196: goto -> 13207
    //   13199: ldc2_w -1738945796
    //   13202: l2i
    //   13203: ldc_w 603577692
    //   13206: ixor
    //   13207: ldc2_w 466770931
    //   13210: l2i
    //   13211: ldc_w -271045478
    //   13214: ixor
    //   13215: ixor
    //   13216: lookupswitch default -> 13244, -739388699 -> 13199, 902971853 -> 25336
    //   13244: goto -> 13248
    //   13247: athrow
    //   13248: invokevirtual intValue : ()I
    //   13251: goto -> 13255
    //   13254: athrow
    //   13255: getstatic Perryc.0 : I
    //   13258: ifle -> 13272
    //   13261: ldc2_w -1865292270
    //   13264: l2i
    //   13265: ldc_w -1294911998
    //   13268: ixor
    //   13269: goto -> 13280
    //   13272: ldc2_w -1580878636
    //   13275: l2i
    //   13276: ldc_w -1403184388
    //   13279: ixor
    //   13280: ldc2_w -649869396
    //   13283: l2i
    //   13284: ldc_w 281194173
    //   13287: ixor
    //   13288: ixor
    //   13289: lookupswitch default -> 13316, -343820031 -> 25736, 1979886989 -> 13272
    //   13316: aload_0
    //   13317: getstatic Perryc.1 : I
    //   13320: ifeq -> 13334
    //   13323: ldc2_w 605613317
    //   13326: l2i
    //   13327: ldc_w -1388457121
    //   13330: ixor
    //   13331: goto -> 13342
    //   13334: ldc2_w -1309722979
    //   13337: l2i
    //   13338: ldc_w 374200872
    //   13341: ixor
    //   13342: ldc2_w 538657498
    //   13345: l2i
    //   13346: ldc_w -967814475
    //   13349: ixor
    //   13350: ixor
    //   13351: lookupswitch default -> 25628, 1105853658 -> 13376, 1869491765 -> 13334
    //   13376: getfield safecBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13379: getstatic Perryc.c : I
    //   13382: iflt -> 13396
    //   13385: ldc2_w -1747949754
    //   13388: l2i
    //   13389: ldc_w 1301252628
    //   13392: ixor
    //   13393: goto -> 13404
    //   13396: ldc2_w -1944167861
    //   13399: l2i
    //   13400: ldc_w -1822259734
    //   13403: ixor
    //   13404: ldc2_w 253108826
    //   13407: l2i
    //   13408: ldc_w 39531909
    //   13411: ixor
    //   13412: ixor
    //   13413: lookupswitch default -> 13440, -686622067 -> 25228, 1925290945 -> 13396
    //   13440: goto -> 13444
    //   13443: athrow
    //   13444: invokevirtual getValue : ()Ljava/lang/Object;
    //   13447: goto -> 13451
    //   13450: athrow
    //   13451: checkcast java/lang/Integer
    //   13454: getstatic Perryc.1 : I
    //   13457: ifeq -> 13471
    //   13460: ldc2_w -1681438347
    //   13463: l2i
    //   13464: ldc_w 457070356
    //   13467: ixor
    //   13468: goto -> 13479
    //   13471: ldc2_w 954963338
    //   13474: l2i
    //   13475: ldc_w -143843140
    //   13478: ixor
    //   13479: ldc2_w -1670828192
    //   13482: l2i
    //   13483: ldc_w 135886715
    //   13486: ixor
    //   13487: ixor
    //   13488: lookupswitch default -> 25378, 344540794 -> 13471, 1542909229 -> 13516
    //   13516: goto -> 13520
    //   13519: athrow
    //   13520: invokevirtual intValue : ()I
    //   13523: goto -> 13527
    //   13526: athrow
    //   13527: getstatic Perryc.c : I
    //   13530: iflt -> 13544
    //   13533: ldc2_w 1038015068
    //   13536: l2i
    //   13537: ldc_w -375508743
    //   13540: ixor
    //   13541: goto -> 13552
    //   13544: ldc2_w -95943733
    //   13547: l2i
    //   13548: ldc_w 610063874
    //   13551: ixor
    //   13552: ldc2_w 351236354
    //   13555: l2i
    //   13556: ldc_w 1643949681
    //   13559: ixor
    //   13560: ixor
    //   13561: lookupswitch default -> 25400, -1588382250 -> 13544, -1425601862 -> 13588
    //   13588: aload_0
    //   13589: getstatic Perryc.c : I
    //   13592: iflt -> 13606
    //   13595: ldc2_w -435382561
    //   13598: l2i
    //   13599: ldc_w 232996392
    //   13602: ixor
    //   13603: goto -> 13614
    //   13606: ldc2_w 1787910164
    //   13609: l2i
    //   13610: ldc_w 344791932
    //   13613: ixor
    //   13614: ldc2_w -755580164
    //   13617: l2i
    //   13618: ldc_w 38886321
    //   13621: ixor
    //   13622: ixor
    //   13623: lookupswitch default -> 13648, 994587066 -> 25254, 2141296902 -> 13606
    //   13648: getfield safecAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13651: getstatic Perryc.0 : I
    //   13654: ifle -> 13668
    //   13657: ldc2_w 1644428456
    //   13660: l2i
    //   13661: ldc_w 1725928320
    //   13664: ixor
    //   13665: goto -> 13676
    //   13668: ldc2_w -1259714177
    //   13671: l2i
    //   13672: ldc_w -1767689606
    //   13675: ixor
    //   13676: ldc2_w 994974553
    //   13679: l2i
    //   13680: ldc_w -1541648737
    //   13683: ixor
    //   13684: ixor
    //   13685: lookupswitch default -> 13712, -1685177618 -> 25440, 1982411070 -> 13668
    //   13712: goto -> 13716
    //   13715: athrow
    //   13716: invokevirtual getValue : ()Ljava/lang/Object;
    //   13719: goto -> 13723
    //   13722: athrow
    //   13723: checkcast java/lang/Integer
    //   13726: getstatic Perryc.c : I
    //   13729: iflt -> 13743
    //   13732: ldc2_w -963002074
    //   13735: l2i
    //   13736: ldc_w 1523242036
    //   13739: ixor
    //   13740: goto -> 13751
    //   13743: ldc2_w -2125015301
    //   13746: l2i
    //   13747: ldc_w 1982201151
    //   13750: ixor
    //   13751: ldc2_w 1478261028
    //   13754: l2i
    //   13755: ldc_w -11130126
    //   13758: ixor
    //   13759: ixor
    //   13760: lookupswitch default -> 13788, -141308689 -> 13743, 991512260 -> 25312
    //   13788: goto -> 13792
    //   13791: athrow
    //   13792: invokevirtual intValue : ()I
    //   13795: goto -> 13799
    //   13798: athrow
    //   13799: getstatic Perryc.0 : I
    //   13802: ifle -> 13816
    //   13805: ldc2_w -34165448
    //   13808: l2i
    //   13809: ldc_w 1866331720
    //   13812: ixor
    //   13813: goto -> 13824
    //   13816: ldc2_w -28313452
    //   13819: l2i
    //   13820: ldc_w -1880659659
    //   13823: ixor
    //   13824: ldc2_w -1987248023
    //   13827: l2i
    //   13828: ldc_w -1239647400
    //   13831: ixor
    //   13832: ixor
    //   13833: lookupswitch default -> 25808, -1386602431 -> 13816, 1312418448 -> 13860
    //   13860: goto -> 13864
    //   13863: athrow
    //   13864: invokespecial <init> : (IIII)V
    //   13867: goto -> 13871
    //   13870: athrow
    //   13871: getstatic Perryc.1 : I
    //   13874: ifeq -> 13888
    //   13877: ldc2_w -274764148
    //   13880: l2i
    //   13881: ldc_w 1105809119
    //   13884: ixor
    //   13885: goto -> 13896
    //   13888: ldc2_w -1528915486
    //   13891: l2i
    //   13892: ldc_w -1430119573
    //   13895: ixor
    //   13896: ldc2_w 1567177027
    //   13899: l2i
    //   13900: ldc_w 1189814850
    //   13903: ixor
    //   13904: ixor
    //   13905: lookupswitch default -> 13932, -1984265794 -> 13888, -1242285230 -> 25572
    //   13932: aload_0
    //   13933: getstatic Perryc.c : I
    //   13936: iflt -> 13950
    //   13939: ldc2_w 876751853
    //   13942: l2i
    //   13943: ldc_w -1507173546
    //   13946: ixor
    //   13947: goto -> 13958
    //   13950: ldc2_w -1665484968
    //   13953: l2i
    //   13954: ldc_w -1167221859
    //   13957: ixor
    //   13958: ldc2_w 1769726228
    //   13961: l2i
    //   13962: ldc_w -1717139742
    //   13965: ixor
    //   13966: ixor
    //   13967: lookupswitch default -> 13992, 608887889 -> 13950, 1656035149 -> 25382
    //   13992: getfield lineWidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13995: getstatic Perryc.0 : I
    //   13998: ifle -> 14012
    //   14001: ldc2_w 919829381
    //   14004: l2i
    //   14005: ldc_w -509953065
    //   14008: ixor
    //   14009: goto -> 14020
    //   14012: ldc2_w 1775741086
    //   14015: l2i
    //   14016: ldc_w 1445369184
    //   14019: ixor
    //   14020: ldc2_w 1740618900
    //   14023: l2i
    //   14024: ldc_w -1363828901
    //   14027: ixor
    //   14028: ixor
    //   14029: lookupswitch default -> 14056, -364905364 -> 14012, 507765661 -> 25516
    //   14056: goto -> 14060
    //   14059: athrow
    //   14060: invokevirtual getValue : ()Ljava/lang/Object;
    //   14063: goto -> 14067
    //   14066: athrow
    //   14067: checkcast java/lang/Float
    //   14070: getstatic Perryc.1 : I
    //   14073: ifeq -> 14087
    //   14076: ldc2_w -1048658343
    //   14079: l2i
    //   14080: ldc_w -1897210873
    //   14083: ixor
    //   14084: goto -> 14095
    //   14087: ldc2_w -678968959
    //   14090: l2i
    //   14091: ldc_w -1281747975
    //   14094: ixor
    //   14095: ldc2_w 152161613
    //   14098: l2i
    //   14099: ldc_w 219005299
    //   14102: ixor
    //   14103: ixor
    //   14104: lookupswitch default -> 14132, -1267795770 -> 14087, 1267232352 -> 25868
    //   14132: goto -> 14136
    //   14135: athrow
    //   14136: invokevirtual floatValue : ()F
    //   14139: goto -> 14143
    //   14142: athrow
    //   14143: getstatic Perryc.0 : I
    //   14146: ifle -> 14160
    //   14149: ldc2_w 1506200106
    //   14152: l2i
    //   14153: ldc_w -987810017
    //   14156: ixor
    //   14157: goto -> 14168
    //   14160: ldc2_w -1032586295
    //   14163: l2i
    //   14164: ldc_w 369660175
    //   14167: ixor
    //   14168: ldc2_w 20019878
    //   14171: l2i
    //   14172: ldc_w 2010075734
    //   14175: ixor
    //   14176: ixor
    //   14177: lookupswitch default -> 25394, -1568325066 -> 14204, -366488123 -> 14160
    //   14204: aload_0
    //   14205: getstatic Perryc.c : I
    //   14208: iflt -> 14222
    //   14211: ldc2_w -1514922403
    //   14214: l2i
    //   14215: ldc_w 206988867
    //   14218: ixor
    //   14219: goto -> 14230
    //   14222: ldc2_w 716789616
    //   14225: l2i
    //   14226: ldc_w -551609945
    //   14229: ixor
    //   14230: ldc2_w 2039453651
    //   14233: l2i
    //   14234: ldc_w -1933519166
    //   14237: ixor
    //   14238: ixor
    //   14239: lookupswitch default -> 14264, -2092463247 -> 14222, 1554856207 -> 25592
    //   14264: getfield outline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14267: getstatic Perryc.0 : I
    //   14270: ifle -> 14284
    //   14273: ldc2_w -2131506395
    //   14276: l2i
    //   14277: ldc_w -1288286379
    //   14280: ixor
    //   14281: goto -> 14292
    //   14284: ldc2_w -1119195972
    //   14287: l2i
    //   14288: ldc_w -164208439
    //   14291: ixor
    //   14292: ldc2_w 1369043481
    //   14295: l2i
    //   14296: ldc_w 1124047252
    //   14299: ixor
    //   14300: ixor
    //   14301: lookupswitch default -> 14328, -607452323 -> 14284, 547614717 -> 25842
    //   14328: goto -> 14332
    //   14331: athrow
    //   14332: invokevirtual getValue : ()Ljava/lang/Object;
    //   14335: goto -> 14339
    //   14338: athrow
    //   14339: checkcast java/lang/Boolean
    //   14342: getstatic Perryc.c : I
    //   14345: iflt -> 14359
    //   14348: ldc2_w -1826358193
    //   14351: l2i
    //   14352: ldc_w -1753504529
    //   14355: ixor
    //   14356: goto -> 14367
    //   14359: ldc2_w 99374300
    //   14362: l2i
    //   14363: ldc_w 584224619
    //   14366: ixor
    //   14367: ldc2_w -1418053137
    //   14370: l2i
    //   14371: ldc_w 533445000
    //   14374: ixor
    //   14375: ixor
    //   14376: lookupswitch default -> 25470, -1819321392 -> 14404, -1326851897 -> 14359
    //   14404: goto -> 14408
    //   14407: athrow
    //   14408: invokevirtual booleanValue : ()Z
    //   14411: goto -> 14415
    //   14414: athrow
    //   14415: getstatic Perryc.1 : I
    //   14418: ifeq -> 14432
    //   14421: ldc2_w 1325339951
    //   14424: l2i
    //   14425: ldc_w 1202070568
    //   14428: ixor
    //   14429: goto -> 14440
    //   14432: ldc2_w 340049205
    //   14435: l2i
    //   14436: ldc_w -567238797
    //   14439: ixor
    //   14440: ldc2_w 1162934465
    //   14443: l2i
    //   14444: ldc_w 2114396924
    //   14447: ixor
    //   14448: ixor
    //   14449: lookupswitch default -> 25452, -249300869 -> 14476, 839838522 -> 14432
    //   14476: aload_0
    //   14477: getstatic Perryc.1 : I
    //   14480: ifeq -> 14494
    //   14483: ldc2_w 1157925235
    //   14486: l2i
    //   14487: ldc_w -711284812
    //   14490: ixor
    //   14491: goto -> 14502
    //   14494: ldc2_w -973843046
    //   14497: l2i
    //   14498: ldc_w 1338088139
    //   14501: ixor
    //   14502: ldc2_w -777642446
    //   14505: l2i
    //   14506: ldc_w -1616967034
    //   14509: ixor
    //   14510: ixor
    //   14511: lookupswitch default -> 14536, -559465869 -> 25334, 2015487505 -> 14494
    //   14536: getfield box : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14539: getstatic Perryc.0 : I
    //   14542: ifle -> 14556
    //   14545: ldc2_w -476626204
    //   14548: l2i
    //   14549: ldc_w 1278599217
    //   14552: ixor
    //   14553: goto -> 14564
    //   14556: ldc2_w 1281728182
    //   14559: l2i
    //   14560: ldc_w 293924515
    //   14563: ixor
    //   14564: ldc2_w 1093835230
    //   14567: l2i
    //   14568: ldc_w -638909731
    //   14571: ixor
    //   14572: ixor
    //   14573: lookupswitch default -> 14600, 930822614 -> 25884, 1301982745 -> 14556
    //   14600: goto -> 14604
    //   14603: athrow
    //   14604: invokevirtual getValue : ()Ljava/lang/Object;
    //   14607: goto -> 14611
    //   14610: athrow
    //   14611: checkcast java/lang/Boolean
    //   14614: getstatic Perryc.c : I
    //   14617: iflt -> 14631
    //   14620: ldc2_w -1951120869
    //   14623: l2i
    //   14624: ldc_w -518583013
    //   14627: ixor
    //   14628: goto -> 14639
    //   14631: ldc2_w 1226302894
    //   14634: l2i
    //   14635: ldc_w -810522545
    //   14638: ixor
    //   14639: ldc2_w 1630441078
    //   14642: l2i
    //   14643: ldc_w 521149549
    //   14646: ixor
    //   14647: ixor
    //   14648: lookupswitch default -> 25360, -124182534 -> 14676, 345890075 -> 14631
    //   14676: goto -> 14680
    //   14679: athrow
    //   14680: invokevirtual booleanValue : ()Z
    //   14683: goto -> 14687
    //   14686: athrow
    //   14687: getstatic Perryc.c : I
    //   14690: iflt -> 14704
    //   14693: ldc2_w 2112639992
    //   14696: l2i
    //   14697: ldc_w -802791265
    //   14700: ixor
    //   14701: goto -> 14712
    //   14704: ldc2_w -114419867
    //   14707: l2i
    //   14708: ldc_w 488308455
    //   14711: ixor
    //   14712: ldc2_w 413991371
    //   14715: l2i
    //   14716: ldc_w -805325268
    //   14719: ixor
    //   14720: ixor
    //   14721: lookupswitch default -> 25540, 862346853 -> 14748, 2056815744 -> 14704
    //   14748: aload_0
    //   14749: getstatic Perryc.0 : I
    //   14752: ifle -> 14766
    //   14755: ldc2_w 1886365916
    //   14758: l2i
    //   14759: ldc_w 485047386
    //   14762: ixor
    //   14763: goto -> 14774
    //   14766: ldc2_w 1637271299
    //   14769: l2i
    //   14770: ldc_w -1142181970
    //   14773: ixor
    //   14774: ldc2_w 1502699894
    //   14777: l2i
    //   14778: ldc_w -124723678
    //   14781: ixor
    //   14782: ixor
    //   14783: lookupswitch default -> 25368, -846779438 -> 14766, 2071779321 -> 14808
    //   14808: getfield boxAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14811: getstatic Perryc.c : I
    //   14814: iflt -> 14828
    //   14817: ldc2_w -1480438344
    //   14820: l2i
    //   14821: ldc_w 41733351
    //   14824: ixor
    //   14825: goto -> 14836
    //   14828: ldc2_w 1887402920
    //   14831: l2i
    //   14832: ldc_w -1008823666
    //   14835: ixor
    //   14836: ldc2_w -2128536062
    //   14839: l2i
    //   14840: ldc_w -166163095
    //   14843: ixor
    //   14844: ixor
    //   14845: lookupswitch default -> 14872, -1676939065 -> 14828, -762899916 -> 25798
    //   14872: goto -> 14876
    //   14875: athrow
    //   14876: invokevirtual getValue : ()Ljava/lang/Object;
    //   14879: goto -> 14883
    //   14882: athrow
    //   14883: checkcast java/lang/Integer
    //   14886: getstatic Perryc.0 : I
    //   14889: ifle -> 14903
    //   14892: ldc2_w -1944154914
    //   14895: l2i
    //   14896: ldc_w 632970625
    //   14899: ixor
    //   14900: goto -> 14911
    //   14903: ldc2_w -643653833
    //   14906: l2i
    //   14907: ldc_w 1720786105
    //   14910: ixor
    //   14911: ldc2_w 1727411601
    //   14914: l2i
    //   14915: ldc_w -1262633888
    //   14918: ixor
    //   14919: ixor
    //   14920: lookupswitch default -> 25250, 1836583551 -> 14948, 2079283374 -> 14903
    //   14948: goto -> 14952
    //   14951: athrow
    //   14952: invokevirtual intValue : ()I
    //   14955: goto -> 14959
    //   14958: athrow
    //   14959: ldc2_w 52909018
    //   14962: l2i
    //   14963: ldc_w 52909019
    //   14966: ixor
    //   14967: getstatic Perryc.0 : I
    //   14970: ifle -> 14984
    //   14973: ldc2_w 1321633072
    //   14976: l2i
    //   14977: ldc_w -1510131995
    //   14980: ixor
    //   14981: goto -> 14992
    //   14984: ldc2_w -1588792302
    //   14987: l2i
    //   14988: ldc_w -1900768110
    //   14991: ixor
    //   14992: ldc2_w -874173564
    //   14995: l2i
    //   14996: ldc_w 1888796029
    //   14999: ixor
    //   15000: ixor
    //   15001: lookupswitch default -> 25774, -1802897799 -> 15028, 1347036460 -> 14984
    //   15028: aload_0
    //   15029: getstatic Perryc.1 : I
    //   15032: ifeq -> 15046
    //   15035: ldc2_w 1764229932
    //   15038: l2i
    //   15039: ldc_w -970349998
    //   15042: ixor
    //   15043: goto -> 15054
    //   15046: ldc2_w 946655370
    //   15049: l2i
    //   15050: ldc_w -1022974845
    //   15053: ixor
    //   15054: ldc2_w -40126164
    //   15057: l2i
    //   15058: ldc_w 1150045259
    //   15061: ixor
    //   15062: ixor
    //   15063: lookupswitch default -> 25820, 370562073 -> 15046, 1115521390 -> 15088
    //   15088: getfield height : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15091: getstatic Perryc.0 : I
    //   15094: ifle -> 15108
    //   15097: ldc2_w -2141810865
    //   15100: l2i
    //   15101: ldc_w 171950318
    //   15104: ixor
    //   15105: goto -> 15116
    //   15108: ldc2_w 2129091618
    //   15111: l2i
    //   15112: ldc_w -1384978596
    //   15115: ixor
    //   15116: ldc2_w 1139485795
    //   15119: l2i
    //   15120: ldc_w -664842032
    //   15123: ixor
    //   15124: ixor
    //   15125: lookupswitch default -> 15152, 299709202 -> 25474, 2038892521 -> 15108
    //   15152: goto -> 15156
    //   15155: athrow
    //   15156: invokevirtual getValue : ()Ljava/lang/Object;
    //   15159: goto -> 15163
    //   15162: athrow
    //   15163: checkcast java/lang/Double
    //   15166: getstatic Perryc.0 : I
    //   15169: ifle -> 15183
    //   15172: ldc2_w 1272224238
    //   15175: l2i
    //   15176: ldc_w -1374730895
    //   15179: ixor
    //   15180: goto -> 15191
    //   15183: ldc2_w -1785615902
    //   15186: l2i
    //   15187: ldc_w 528887302
    //   15190: ixor
    //   15191: ldc2_w 1091531520
    //   15194: l2i
    //   15195: ldc_w 1583360172
    //   15198: ixor
    //   15199: ixor
    //   15200: lookupswitch default -> 15228, -88832205 -> 25786, 110700651 -> 15183
    //   15228: goto -> 15232
    //   15231: athrow
    //   15232: invokevirtual doubleValue : ()D
    //   15235: goto -> 15239
    //   15238: athrow
    //   15239: getstatic Perryc.0 : I
    //   15242: ifle -> 15256
    //   15245: ldc2_w -1643610559
    //   15248: l2i
    //   15249: ldc_w 385338703
    //   15252: ixor
    //   15253: goto -> 15264
    //   15256: ldc2_w -998680280
    //   15259: l2i
    //   15260: ldc_w -397999593
    //   15263: ixor
    //   15264: ldc2_w -2019895475
    //   15267: l2i
    //   15268: ldc_w -1593246697
    //   15271: ixor
    //   15272: ixor
    //   15273: lookupswitch default -> 15300, -1906149677 -> 15256, -1368549292 -> 25568
    //   15300: aload_0
    //   15301: getstatic Perryc.1 : I
    //   15304: ifeq -> 15318
    //   15307: ldc2_w 1815683137
    //   15310: l2i
    //   15311: ldc_w -749693023
    //   15314: ixor
    //   15315: goto -> 15326
    //   15318: ldc2_w -2034962009
    //   15321: l2i
    //   15322: ldc_w -667960575
    //   15325: ixor
    //   15326: ldc2_w 1529589705
    //   15329: l2i
    //   15330: ldc_w 595601068
    //   15333: ixor
    //   15334: ixor
    //   15335: lookupswitch default -> 25618, -943571323 -> 15318, 640730051 -> 15360
    //   15360: getfield gradientBox : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15363: getstatic Perryc.1 : I
    //   15366: ifeq -> 15380
    //   15369: ldc2_w 786094723
    //   15372: l2i
    //   15373: ldc_w 38181393
    //   15376: ixor
    //   15377: goto -> 15388
    //   15380: ldc2_w -1621572888
    //   15383: l2i
    //   15384: ldc_w -1817585326
    //   15387: ixor
    //   15388: ldc2_w 534088584
    //   15391: l2i
    //   15392: ldc_w 1327609189
    //   15395: ixor
    //   15396: ixor
    //   15397: lookupswitch default -> 15424, -880749064 -> 15380, 2087222911 -> 25434
    //   15424: goto -> 15428
    //   15427: athrow
    //   15428: invokevirtual getValue : ()Ljava/lang/Object;
    //   15431: goto -> 15435
    //   15434: athrow
    //   15435: checkcast java/lang/Boolean
    //   15438: getstatic Perryc.0 : I
    //   15441: ifle -> 15455
    //   15444: ldc2_w 1027702047
    //   15447: l2i
    //   15448: ldc_w 399744273
    //   15451: ixor
    //   15452: goto -> 15463
    //   15455: ldc2_w -463945767
    //   15458: l2i
    //   15459: ldc_w -1448677614
    //   15462: ixor
    //   15463: ldc2_w 1794219043
    //   15466: l2i
    //   15467: ldc_w 123822041
    //   15470: ixor
    //   15471: ixor
    //   15472: lookupswitch default -> 25412, 544117553 -> 15500, 1191322612 -> 15455
    //   15500: goto -> 15504
    //   15503: athrow
    //   15504: invokevirtual booleanValue : ()Z
    //   15507: goto -> 15511
    //   15510: athrow
    //   15511: getstatic Perryc.c : I
    //   15514: iflt -> 15528
    //   15517: ldc2_w 1342075604
    //   15520: l2i
    //   15521: ldc_w 462611210
    //   15524: ixor
    //   15525: goto -> 15536
    //   15528: ldc2_w 422581800
    //   15531: l2i
    //   15532: ldc_w -2053765298
    //   15535: ixor
    //   15536: ldc2_w -443718825
    //   15539: l2i
    //   15540: ldc_w 1426069028
    //   15543: ixor
    //   15544: ixor
    //   15545: lookupswitch default -> 25206, -454957907 -> 15528, 741041173 -> 15572
    //   15572: aload_0
    //   15573: getstatic Perryc.0 : I
    //   15576: ifle -> 15590
    //   15579: ldc2_w -1845461123
    //   15582: l2i
    //   15583: ldc_w -1922390052
    //   15586: ixor
    //   15587: goto -> 15598
    //   15590: ldc2_w -1288556885
    //   15593: l2i
    //   15594: ldc_w 2028312958
    //   15597: ixor
    //   15598: ldc2_w 49271557
    //   15601: l2i
    //   15602: ldc_w -1776991323
    //   15605: ixor
    //   15606: ixor
    //   15607: lookupswitch default -> 15632, -1953478655 -> 25766, -1033871317 -> 15590
    //   15632: getfield gradientOutline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15635: getstatic Perryc.c : I
    //   15638: iflt -> 15652
    //   15641: ldc2_w -480763333
    //   15644: l2i
    //   15645: ldc_w -296036757
    //   15648: ixor
    //   15649: goto -> 15660
    //   15652: ldc2_w -10547139
    //   15655: l2i
    //   15656: ldc_w -1380585684
    //   15659: ixor
    //   15660: ldc2_w 1758733214
    //   15663: l2i
    //   15664: ldc_w 631030246
    //   15667: ixor
    //   15668: ixor
    //   15669: lookupswitch default -> 15696, -1272757689 -> 15652, 1078597160 -> 25806
    //   15696: goto -> 15700
    //   15699: athrow
    //   15700: invokevirtual getValue : ()Ljava/lang/Object;
    //   15703: goto -> 15707
    //   15706: athrow
    //   15707: checkcast java/lang/Boolean
    //   15710: getstatic Perryc.c : I
    //   15713: iflt -> 15727
    //   15716: ldc2_w -1192700467
    //   15719: l2i
    //   15720: ldc_w -1008163087
    //   15723: ixor
    //   15724: goto -> 15735
    //   15727: ldc2_w 1464734894
    //   15730: l2i
    //   15731: ldc_w -178261183
    //   15734: ixor
    //   15735: ldc2_w 557661532
    //   15738: l2i
    //   15739: ldc_w -523886262
    //   15742: ixor
    //   15743: ixor
    //   15744: lookupswitch default -> 25216, -1157927126 -> 15727, 1676344313 -> 15772
    //   15772: goto -> 15776
    //   15775: athrow
    //   15776: invokevirtual booleanValue : ()Z
    //   15779: goto -> 15783
    //   15782: athrow
    //   15783: getstatic Perryc.0 : I
    //   15786: ifle -> 15800
    //   15789: ldc2_w 1416198375
    //   15792: l2i
    //   15793: ldc_w -661032332
    //   15796: ixor
    //   15797: goto -> 15808
    //   15800: ldc2_w -1956345570
    //   15803: l2i
    //   15804: ldc_w -1766867799
    //   15807: ixor
    //   15808: ldc2_w 870442330
    //   15811: l2i
    //   15812: ldc_w 10063418
    //   15815: ixor
    //   15816: ixor
    //   15817: lookupswitch default -> 15844, -1081581069 -> 25284, 1653125037 -> 15800
    //   15844: aload_0
    //   15845: getstatic Perryc.1 : I
    //   15848: ifeq -> 15862
    //   15851: ldc2_w -1054552980
    //   15854: l2i
    //   15855: ldc_w -584088013
    //   15858: ixor
    //   15859: goto -> 15870
    //   15862: ldc2_w -745289367
    //   15865: l2i
    //   15866: ldc_w 711570360
    //   15869: ixor
    //   15870: ldc2_w -1685566797
    //   15873: l2i
    //   15874: ldc_w -57409158
    //   15877: ixor
    //   15878: ixor
    //   15879: lookupswitch default -> 15904, 1206323461 -> 15862, 2065105302 -> 25860
    //   15904: getfield invertGradientBox : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15907: getstatic Perryc.0 : I
    //   15910: ifle -> 15924
    //   15913: ldc2_w -1522166410
    //   15916: l2i
    //   15917: ldc_w -1948509922
    //   15920: ixor
    //   15921: goto -> 15932
    //   15924: ldc2_w 1802198232
    //   15927: l2i
    //   15928: ldc_w 1383775500
    //   15931: ixor
    //   15932: ldc2_w -437689103
    //   15935: l2i
    //   15936: ldc_w 125565854
    //   15939: ixor
    //   15940: ixor
    //   15941: lookupswitch default -> 25728, -871689465 -> 15924, -612139333 -> 15968
    //   15968: goto -> 15972
    //   15971: athrow
    //   15972: invokevirtual getValue : ()Ljava/lang/Object;
    //   15975: goto -> 15979
    //   15978: athrow
    //   15979: checkcast java/lang/Boolean
    //   15982: getstatic Perryc.c : I
    //   15985: iflt -> 15999
    //   15988: ldc2_w -2009972129
    //   15991: l2i
    //   15992: ldc_w -125651720
    //   15995: ixor
    //   15996: goto -> 16007
    //   15999: ldc2_w 857884263
    //   16002: l2i
    //   16003: ldc_w 1007469939
    //   16006: ixor
    //   16007: ldc2_w 1989289155
    //   16010: l2i
    //   16011: ldc_w -1195341850
    //   16014: ixor
    //   16015: ixor
    //   16016: lookupswitch default -> 25446, -1092463230 -> 15999, -1048829903 -> 16044
    //   16044: goto -> 16048
    //   16047: athrow
    //   16048: invokevirtual booleanValue : ()Z
    //   16051: goto -> 16055
    //   16054: athrow
    //   16055: getstatic Perryc.c : I
    //   16058: iflt -> 16072
    //   16061: ldc2_w 1770759832
    //   16064: l2i
    //   16065: ldc_w -129119260
    //   16068: ixor
    //   16069: goto -> 16080
    //   16072: ldc2_w 1323261036
    //   16075: l2i
    //   16076: ldc_w 1857447578
    //   16079: ixor
    //   16080: ldc2_w 698609972
    //   16083: l2i
    //   16084: ldc_w -281558470
    //   16087: ixor
    //   16088: ixor
    //   16089: lookupswitch default -> 25396, -419624456 -> 16116, 1465015922 -> 16072
    //   16116: aload_0
    //   16117: getstatic Perryc.1 : I
    //   16120: ifeq -> 16134
    //   16123: ldc2_w -1745320122
    //   16126: l2i
    //   16127: ldc_w -48475155
    //   16130: ixor
    //   16131: goto -> 16142
    //   16134: ldc2_w 70000364
    //   16137: l2i
    //   16138: ldc_w 927255669
    //   16141: ixor
    //   16142: ldc2_w 1994368198
    //   16145: l2i
    //   16146: ldc_w -1296401112
    //   16149: ixor
    //   16150: ixor
    //   16151: lookupswitch default -> 16176, -1367274171 -> 25246, -27271917 -> 16134
    //   16176: getfield invertGradientOutline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16179: getstatic Perryc.c : I
    //   16182: iflt -> 16196
    //   16185: ldc2_w 101168458
    //   16188: l2i
    //   16189: ldc_w -1386463295
    //   16192: ixor
    //   16193: goto -> 16204
    //   16196: ldc2_w 2054475864
    //   16199: l2i
    //   16200: ldc_w -162646656
    //   16203: ixor
    //   16204: ldc2_w 438100831
    //   16207: l2i
    //   16208: ldc_w -1432127231
    //   16211: ixor
    //   16212: ixor
    //   16213: lookupswitch default -> 16240, -980832097 -> 16196, 467931349 -> 25332
    //   16240: goto -> 16244
    //   16243: athrow
    //   16244: invokevirtual getValue : ()Ljava/lang/Object;
    //   16247: goto -> 16251
    //   16250: athrow
    //   16251: checkcast java/lang/Boolean
    //   16254: getstatic Perryc.0 : I
    //   16257: ifle -> 16271
    //   16260: ldc2_w 1434686009
    //   16263: l2i
    //   16264: ldc_w -214015567
    //   16267: ixor
    //   16268: goto -> 16279
    //   16271: ldc2_w 1259392438
    //   16274: l2i
    //   16275: ldc_w -801629706
    //   16278: ixor
    //   16279: ldc2_w 1511553124
    //   16282: l2i
    //   16283: ldc_w 45870931
    //   16286: ixor
    //   16287: ixor
    //   16288: lookupswitch default -> 25772, -1014283401 -> 16316, -31562561 -> 16271
    //   16316: goto -> 16320
    //   16319: athrow
    //   16320: invokevirtual booleanValue : ()Z
    //   16323: goto -> 16327
    //   16326: athrow
    //   16327: getstatic Perryc.c : I
    //   16330: iflt -> 16344
    //   16333: ldc2_w 1167126837
    //   16336: l2i
    //   16337: ldc_w -29000676
    //   16340: ixor
    //   16341: goto -> 16352
    //   16344: ldc2_w 1071500166
    //   16347: l2i
    //   16348: ldc_w -1786149782
    //   16351: ixor
    //   16352: ldc2_w -199379085
    //   16355: l2i
    //   16356: ldc_w -475610507
    //   16359: ixor
    //   16360: ixor
    //   16361: lookupswitch default -> 25844, -1402013649 -> 16344, -1108395286 -> 16388
    //   16388: aload_0
    //   16389: getstatic Perryc.0 : I
    //   16392: ifle -> 16406
    //   16395: ldc2_w 449036990
    //   16398: l2i
    //   16399: ldc_w 1962376917
    //   16402: ixor
    //   16403: goto -> 16414
    //   16406: ldc2_w 1259507971
    //   16409: l2i
    //   16410: ldc_w -2121666358
    //   16413: ixor
    //   16414: ldc2_w -1492288780
    //   16417: l2i
    //   16418: ldc_w 995179222
    //   16421: ixor
    //   16422: ixor
    //   16423: lookupswitch default -> 16448, -1482230605 -> 16406, -228000695 -> 25524
    //   16448: getfield currentAlpha : I
    //   16451: getstatic Perryc.c : I
    //   16454: iflt -> 16468
    //   16457: ldc2_w 537357676
    //   16460: l2i
    //   16461: ldc_w 622204803
    //   16464: ixor
    //   16465: goto -> 16476
    //   16468: ldc2_w 400334022
    //   16471: l2i
    //   16472: ldc_w -327442019
    //   16475: ixor
    //   16476: ldc2_w 119021056
    //   16479: l2i
    //   16480: ldc_w 948318256
    //   16483: ixor
    //   16484: ixor
    //   16485: lookupswitch default -> 16512, -1635795136 -> 16468, 982471903 -> 25630
    //   16512: goto -> 16516
    //   16515: athrow
    //   16516: invokestatic drawBoxESP : (Lnet/minecraft/util/math/BlockPos;Ljava/awt/Color;ZLjava/awt/Color;FZZIZDZZZZI)V
    //   16519: goto -> 16523
    //   16522: athrow
    //   16523: goto -> 25187
    //   16526: getstatic Perryc.0 : I
    //   16529: ifle -> 16543
    //   16532: ldc2_w 1617425746
    //   16535: l2i
    //   16536: ldc_w -56870818
    //   16539: ixor
    //   16540: goto -> 16551
    //   16543: ldc2_w 2127910173
    //   16546: l2i
    //   16547: ldc_w 216371089
    //   16550: ixor
    //   16551: ldc2_w -1495167840
    //   16554: l2i
    //   16555: ldc_w 683172504
    //   16558: ixor
    //   16559: ixor
    //   16560: lookupswitch default -> 16588, -1436742339 -> 16543, 312615732 -> 25314
    //   16588: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   16591: getstatic Perryc.c : I
    //   16594: iflt -> 16608
    //   16597: ldc2_w -417057155
    //   16600: l2i
    //   16601: ldc_w 864896979
    //   16604: ixor
    //   16605: goto -> 16616
    //   16608: ldc2_w 74546005
    //   16611: l2i
    //   16612: ldc_w -780182694
    //   16615: ixor
    //   16616: ldc2_w 613768834
    //   16619: l2i
    //   16620: ldc_w 993221218
    //   16623: ixor
    //   16624: ixor
    //   16625: lookupswitch default -> 16652, -888179378 -> 25510, -209499943 -> 16608
    //   16652: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   16655: getstatic Perryc.c : I
    //   16658: iflt -> 16672
    //   16661: ldc2_w 1645554239
    //   16664: l2i
    //   16665: ldc_w 900861486
    //   16668: ixor
    //   16669: goto -> 16680
    //   16672: ldc2_w 1433085973
    //   16675: l2i
    //   16676: ldc_w -1862193524
    //   16679: ixor
    //   16680: ldc2_w -1264503697
    //   16683: l2i
    //   16684: ldc_w -1333450508
    //   16687: ixor
    //   16688: ixor
    //   16689: lookupswitch default -> 25472, -1068623358 -> 16716, 1401108618 -> 16672
    //   16716: aload #6
    //   16718: getstatic Perryc.1 : I
    //   16721: ifeq -> 16735
    //   16724: ldc2_w -1555809184
    //   16727: l2i
    //   16728: ldc_w -2017118137
    //   16731: ixor
    //   16732: goto -> 16743
    //   16735: ldc2_w -668980249
    //   16738: l2i
    //   16739: ldc_w 1008691197
    //   16742: ixor
    //   16743: ldc2_w -283930605
    //   16746: l2i
    //   16747: ldc_w 467040692
    //   16750: ixor
    //   16751: ixor
    //   16752: lookupswitch default -> 16780, -1647342637 -> 16735, -800789120 -> 25822
    //   16780: goto -> 16784
    //   16783: athrow
    //   16784: invokevirtual func_177977_b : ()Lnet/minecraft/util/math/BlockPos;
    //   16787: goto -> 16791
    //   16790: athrow
    //   16791: getstatic Perryc.c : I
    //   16794: iflt -> 16808
    //   16797: ldc2_w 1992179063
    //   16800: l2i
    //   16801: ldc_w -1169509960
    //   16804: ixor
    //   16805: goto -> 16816
    //   16808: ldc2_w -1161818202
    //   16811: l2i
    //   16812: ldc_w -2073138377
    //   16815: ixor
    //   16816: ldc2_w -151687792
    //   16819: l2i
    //   16820: ldc_w 1731118871
    //   16823: ixor
    //   16824: ixor
    //   16825: lookupswitch default -> 16852, 704945966 -> 16808, 1563371080 -> 25240
    //   16852: goto -> 16856
    //   16855: athrow
    //   16856: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   16859: goto -> 16863
    //   16862: athrow
    //   16863: getstatic Perryc.c : I
    //   16866: iflt -> 16880
    //   16869: ldc2_w 63127563
    //   16872: l2i
    //   16873: ldc_w -2054047105
    //   16876: ixor
    //   16877: goto -> 16888
    //   16880: ldc2_w 1792907183
    //   16883: l2i
    //   16884: ldc_w 101310474
    //   16887: ixor
    //   16888: ldc2_w 2106510077
    //   16891: l2i
    //   16892: ldc_w 897758154
    //   16895: ixor
    //   16896: ixor
    //   16897: lookupswitch default -> 16924, -832666813 -> 25280, 1004071481 -> 16880
    //   16924: goto -> 16928
    //   16927: athrow
    //   16928: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   16933: goto -> 16937
    //   16936: athrow
    //   16937: getstatic Perryc.c : I
    //   16940: iflt -> 16954
    //   16943: ldc2_w 1520608541
    //   16946: l2i
    //   16947: ldc_w 1684753007
    //   16950: ixor
    //   16951: goto -> 16962
    //   16954: ldc2_w 1146054668
    //   16957: l2i
    //   16958: ldc_w 1890889739
    //   16961: ixor
    //   16962: ldc2_w -77758105
    //   16965: l2i
    //   16966: ldc_w 1539383827
    //   16969: ixor
    //   16970: ixor
    //   16971: lookupswitch default -> 16996, -1638577146 -> 25238, -139896747 -> 16954
    //   16996: goto -> 17000
    //   16999: athrow
    //   17000: invokestatic isBlockUnSafe : (Lnet/minecraft/block/Block;)Z
    //   17003: goto -> 17007
    //   17006: athrow
    //   17007: ifeq -> 17021
    //   17010: ldc2_w -1882595012
    //   17013: l2i
    //   17014: ldc_w 382621560
    //   17017: ixor
    //   17018: goto -> 17029
    //   17021: ldc2_w -43322395
    //   17024: l2i
    //   17025: ldc_w 1684882850
    //   17028: ixor
    //   17029: ldc2_w 688683338
    //   17032: l2i
    //   17033: ldc_w -701095869
    //   17036: ixor
    //   17037: ixor
    //   17038: tableswitch default -> 17010, 1715334989 -> 17060, 1715334990 -> 25187
    //   17060: getstatic Perryc.0 : I
    //   17063: ifle -> 17077
    //   17066: ldc2_w -105692460
    //   17069: l2i
    //   17070: ldc_w -743388602
    //   17073: ixor
    //   17074: goto -> 17085
    //   17077: ldc2_w 336398824
    //   17080: l2i
    //   17081: ldc_w -1192424309
    //   17084: ixor
    //   17085: ldc2_w 838956260
    //   17088: l2i
    //   17089: ldc_w 701292189
    //   17092: ixor
    //   17093: ixor
    //   17094: lookupswitch default -> 17120, -1656270534 -> 17077, 835592939 -> 25870
    //   17120: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   17123: getstatic Perryc.1 : I
    //   17126: ifeq -> 17140
    //   17129: ldc2_w 2100121351
    //   17132: l2i
    //   17133: ldc_w 971179798
    //   17136: ixor
    //   17137: goto -> 17148
    //   17140: ldc2_w 1749907536
    //   17143: l2i
    //   17144: ldc_w 1747510491
    //   17147: ixor
    //   17148: ldc2_w 209600193
    //   17151: l2i
    //   17152: ldc_w -149648115
    //   17155: ixor
    //   17156: ixor
    //   17157: lookupswitch default -> 17184, -1079706659 -> 25398, -1030957588 -> 17140
    //   17184: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   17187: getstatic Perryc.0 : I
    //   17190: ifle -> 17204
    //   17193: ldc2_w 1825949589
    //   17196: l2i
    //   17197: ldc_w 511960830
    //   17200: ixor
    //   17201: goto -> 17212
    //   17204: ldc2_w -1918769416
    //   17207: l2i
    //   17208: ldc_w -1535241603
    //   17211: ixor
    //   17212: ldc2_w -528114429
    //   17215: l2i
    //   17216: ldc_w -360795928
    //   17219: ixor
    //   17220: ixor
    //   17221: lookupswitch default -> 25416, 589617518 -> 17248, 2024606848 -> 17204
    //   17248: aload #6
    //   17250: getstatic Perryc.1 : I
    //   17253: ifeq -> 17267
    //   17256: ldc2_w -908666433
    //   17259: l2i
    //   17260: ldc_w 38644894
    //   17263: ixor
    //   17264: goto -> 17275
    //   17267: ldc2_w -1840027201
    //   17270: l2i
    //   17271: ldc_w 1330430513
    //   17274: ixor
    //   17275: ldc2_w 596311432
    //   17278: l2i
    //   17279: ldc_w 489414578
    //   17282: ixor
    //   17283: ixor
    //   17284: lookupswitch default -> 17312, -1017170428 -> 17267, -180725989 -> 25208
    //   17312: goto -> 17316
    //   17315: athrow
    //   17316: invokevirtual func_177974_f : ()Lnet/minecraft/util/math/BlockPos;
    //   17319: goto -> 17323
    //   17322: athrow
    //   17323: getstatic Perryc.1 : I
    //   17326: ifeq -> 17340
    //   17329: ldc2_w -896157657
    //   17332: l2i
    //   17333: ldc_w 1574040665
    //   17336: ixor
    //   17337: goto -> 17348
    //   17340: ldc2_w 1305688269
    //   17343: l2i
    //   17344: ldc_w -730613999
    //   17347: ixor
    //   17348: ldc2_w 1698245020
    //   17351: l2i
    //   17352: ldc_w 346666693
    //   17355: ixor
    //   17356: ixor
    //   17357: lookupswitch default -> 17384, -422259929 -> 25708, 1675850945 -> 17340
    //   17384: goto -> 17388
    //   17387: athrow
    //   17388: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   17391: goto -> 17395
    //   17394: athrow
    //   17395: getstatic Perryc.0 : I
    //   17398: ifle -> 17412
    //   17401: ldc2_w 1020797831
    //   17404: l2i
    //   17405: ldc_w 779817997
    //   17408: ixor
    //   17409: goto -> 17420
    //   17412: ldc2_w -1542726175
    //   17415: l2i
    //   17416: ldc_w -1009299146
    //   17419: ixor
    //   17420: ldc2_w -1194102903
    //   17423: l2i
    //   17424: ldc_w 1786573821
    //   17427: ixor
    //   17428: ixor
    //   17429: lookupswitch default -> 17456, -2065920844 -> 17412, -1072911362 -> 25242
    //   17456: goto -> 17460
    //   17459: athrow
    //   17460: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   17465: goto -> 17469
    //   17468: athrow
    //   17469: getstatic Perryc.0 : I
    //   17472: ifle -> 17486
    //   17475: ldc2_w 1275148492
    //   17478: l2i
    //   17479: ldc_w 161340557
    //   17482: ixor
    //   17483: goto -> 17494
    //   17486: ldc2_w 16930835
    //   17489: l2i
    //   17490: ldc_w -1827561980
    //   17493: ixor
    //   17494: ldc2_w -1838656783
    //   17497: l2i
    //   17498: ldc_w 1371770081
    //   17501: ixor
    //   17502: ixor
    //   17503: lookupswitch default -> 17528, -2043200943 -> 25848, 813452726 -> 17486
    //   17528: goto -> 17532
    //   17531: athrow
    //   17532: invokestatic isBlockUnSafe : (Lnet/minecraft/block/Block;)Z
    //   17535: goto -> 17539
    //   17538: athrow
    //   17539: ifeq -> 17553
    //   17542: ldc2_w -1965574766
    //   17545: l2i
    //   17546: ldc_w -71917199
    //   17549: ixor
    //   17550: goto -> 17561
    //   17553: ldc2_w -490719007
    //   17556: l2i
    //   17557: ldc_w -1818153981
    //   17560: ixor
    //   17561: ldc2_w -573899543
    //   17564: l2i
    //   17565: ldc_w -673065088
    //   17568: ixor
    //   17569: ixor
    //   17570: tableswitch default -> 17542, 2068463498 -> 17592, 2068463499 -> 25187
    //   17592: getstatic Perryc.0 : I
    //   17595: ifle -> 17609
    //   17598: ldc2_w 252097747
    //   17601: l2i
    //   17602: ldc_w -553482724
    //   17605: ixor
    //   17606: goto -> 17617
    //   17609: ldc2_w -1769291706
    //   17612: l2i
    //   17613: ldc_w 286688916
    //   17616: ixor
    //   17617: ldc2_w 913600338
    //   17620: l2i
    //   17621: ldc_w 309488243
    //   17624: ixor
    //   17625: ixor
    //   17626: lookupswitch default -> 17652, -352486211 -> 17609, -201181202 -> 25580
    //   17652: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   17655: getstatic Perryc.0 : I
    //   17658: ifle -> 17672
    //   17661: ldc2_w 1517189135
    //   17664: l2i
    //   17665: ldc_w -306672172
    //   17668: ixor
    //   17669: goto -> 17680
    //   17672: ldc2_w 1671980608
    //   17675: l2i
    //   17676: ldc_w -1394580729
    //   17679: ixor
    //   17680: ldc2_w 414140155
    //   17683: l2i
    //   17684: ldc_w -80208747
    //   17687: ixor
    //   17688: ixor
    //   17689: lookupswitch default -> 17716, 588533122 -> 17672, 1413590965 -> 25422
    //   17716: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   17719: getstatic Perryc.c : I
    //   17722: iflt -> 17736
    //   17725: ldc2_w -327334866
    //   17728: l2i
    //   17729: ldc_w 696771288
    //   17732: ixor
    //   17733: goto -> 17744
    //   17736: ldc2_w -1661065242
    //   17739: l2i
    //   17740: ldc_w 553801326
    //   17743: ixor
    //   17744: ldc2_w 1414218819
    //   17747: l2i
    //   17748: ldc_w 1131663922
    //   17751: ixor
    //   17752: ixor
    //   17753: lookupswitch default -> 25762, -1429936135 -> 17780, -759025529 -> 17736
    //   17780: aload #6
    //   17782: getstatic Perryc.1 : I
    //   17785: ifeq -> 17799
    //   17788: ldc2_w -1250464280
    //   17791: l2i
    //   17792: ldc_w -789877234
    //   17795: ixor
    //   17796: goto -> 17807
    //   17799: ldc2_w -1743242420
    //   17802: l2i
    //   17803: ldc_w -1376287789
    //   17806: ixor
    //   17807: ldc2_w -1428544345
    //   17810: l2i
    //   17811: ldc_w -476713351
    //   17814: ixor
    //   17815: ixor
    //   17816: lookupswitch default -> 25888, 752077112 -> 17799, 2090889793 -> 17844
    //   17844: goto -> 17848
    //   17847: athrow
    //   17848: invokevirtual func_177976_e : ()Lnet/minecraft/util/math/BlockPos;
    //   17851: goto -> 17855
    //   17854: athrow
    //   17855: getstatic Perryc.c : I
    //   17858: iflt -> 17872
    //   17861: ldc2_w 1580537895
    //   17864: l2i
    //   17865: ldc_w -200590472
    //   17868: ixor
    //   17869: goto -> 17880
    //   17872: ldc2_w 1192286295
    //   17875: l2i
    //   17876: ldc_w 1435165911
    //   17879: ixor
    //   17880: ldc2_w -1928855834
    //   17883: l2i
    //   17884: ldc_w -1188480887
    //   17887: ixor
    //   17888: ixor
    //   17889: lookupswitch default -> 17916, -1643059920 -> 25574, 2103435630 -> 17872
    //   17916: goto -> 17920
    //   17919: athrow
    //   17920: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   17923: goto -> 17927
    //   17926: athrow
    //   17927: getstatic Perryc.c : I
    //   17930: iflt -> 17944
    //   17933: ldc2_w -1593013121
    //   17936: l2i
    //   17937: ldc_w 1413421813
    //   17940: ixor
    //   17941: goto -> 17952
    //   17944: ldc2_w 1851819692
    //   17947: l2i
    //   17948: ldc_w -473012986
    //   17951: ixor
    //   17952: ldc2_w 1490611542
    //   17955: l2i
    //   17956: ldc_w 1124565857
    //   17959: ixor
    //   17960: ixor
    //   17961: lookupswitch default -> 25506, -1770943075 -> 17988, -286459715 -> 17944
    //   17988: goto -> 17992
    //   17991: athrow
    //   17992: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   17997: goto -> 18001
    //   18000: athrow
    //   18001: getstatic Perryc.c : I
    //   18004: iflt -> 18018
    //   18007: ldc2_w -1309481465
    //   18010: l2i
    //   18011: ldc_w -846210039
    //   18014: ixor
    //   18015: goto -> 18026
    //   18018: ldc2_w -380650728
    //   18021: l2i
    //   18022: ldc_w 440229185
    //   18025: ixor
    //   18026: ldc2_w 62168514
    //   18029: l2i
    //   18030: ldc_w 1852074338
    //   18033: ixor
    //   18034: ixor
    //   18035: lookupswitch default -> 25880, -1633545479 -> 18060, 296603310 -> 18018
    //   18060: goto -> 18064
    //   18063: athrow
    //   18064: invokestatic isBlockUnSafe : (Lnet/minecraft/block/Block;)Z
    //   18067: goto -> 18071
    //   18070: athrow
    //   18071: ifeq -> 18085
    //   18074: ldc2_w -2142196534
    //   18077: l2i
    //   18078: ldc_w 259645779
    //   18081: ixor
    //   18082: goto -> 18093
    //   18085: ldc2_w 1172379617
    //   18088: l2i
    //   18089: ldc_w -892839297
    //   18092: ixor
    //   18093: ldc2_w -175078072
    //   18096: l2i
    //   18097: ldc_w -1242012318
    //   18100: ixor
    //   18101: ixor
    //   18102: tableswitch default -> 18074, -817779277 -> 18124, -817779276 -> 25187
    //   18124: getstatic Perryc.0 : I
    //   18127: ifle -> 18141
    //   18130: ldc2_w 1093891027
    //   18133: l2i
    //   18134: ldc_w -148444993
    //   18137: ixor
    //   18138: goto -> 18149
    //   18141: ldc2_w -1000634320
    //   18144: l2i
    //   18145: ldc_w -2122886691
    //   18148: ixor
    //   18149: ldc2_w 712551523
    //   18152: l2i
    //   18153: ldc_w -646522016
    //   18156: ixor
    //   18157: ixor
    //   18158: lookupswitch default -> 25404, -1239240978 -> 18184, 1159457903 -> 18141
    //   18184: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   18187: getstatic Perryc.c : I
    //   18190: iflt -> 18204
    //   18193: ldc2_w -886935350
    //   18196: l2i
    //   18197: ldc_w 753484371
    //   18200: ixor
    //   18201: goto -> 18212
    //   18204: ldc2_w -1045659629
    //   18207: l2i
    //   18208: ldc_w -1046531351
    //   18211: ixor
    //   18212: ldc2_w 1393688294
    //   18215: l2i
    //   18216: ldc_w 1375486287
    //   18219: ixor
    //   18220: ixor
    //   18221: lookupswitch default -> 25768, -450458320 -> 18204, 48106835 -> 18248
    //   18248: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   18251: getstatic Perryc.1 : I
    //   18254: ifeq -> 18268
    //   18257: ldc2_w -1694327726
    //   18260: l2i
    //   18261: ldc_w -94971374
    //   18264: ixor
    //   18265: goto -> 18276
    //   18268: ldc2_w -1454997312
    //   18271: l2i
    //   18272: ldc_w 1323948712
    //   18275: ixor
    //   18276: ldc2_w 305591365
    //   18279: l2i
    //   18280: ldc_w -356497656
    //   18283: ixor
    //   18284: ixor
    //   18285: lookupswitch default -> 18312, -1717373683 -> 25800, 352821613 -> 18268
    //   18312: aload #6
    //   18314: getstatic Perryc.c : I
    //   18317: iflt -> 18331
    //   18320: ldc2_w -1500668316
    //   18323: l2i
    //   18324: ldc_w 1779480857
    //   18327: ixor
    //   18328: goto -> 18339
    //   18331: ldc2_w -1865705907
    //   18334: l2i
    //   18335: ldc_w -148090305
    //   18338: ixor
    //   18339: ldc2_w 397794681
    //   18342: l2i
    //   18343: ldc_w 1894209026
    //   18346: ixor
    //   18347: ixor
    //   18348: lookupswitch default -> 18376, -1412453370 -> 25214, -344932132 -> 18331
    //   18376: goto -> 18380
    //   18379: athrow
    //   18380: invokevirtual func_177968_d : ()Lnet/minecraft/util/math/BlockPos;
    //   18383: goto -> 18387
    //   18386: athrow
    //   18387: getstatic Perryc.0 : I
    //   18390: ifle -> 18404
    //   18393: ldc2_w 611243401
    //   18396: l2i
    //   18397: ldc_w 835613897
    //   18400: ixor
    //   18401: goto -> 18412
    //   18404: ldc2_w 2097253017
    //   18407: l2i
    //   18408: ldc_w -1046688340
    //   18411: ixor
    //   18412: ldc2_w -964070856
    //   18415: l2i
    //   18416: ldc_w -545007681
    //   18419: ixor
    //   18420: ixor
    //   18421: lookupswitch default -> 18448, 192988620 -> 18404, 212468935 -> 25714
    //   18448: goto -> 18452
    //   18451: athrow
    //   18452: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   18455: goto -> 18459
    //   18458: athrow
    //   18459: getstatic Perryc.1 : I
    //   18462: ifeq -> 18476
    //   18465: ldc2_w -894634020
    //   18468: l2i
    //   18469: ldc_w 113789040
    //   18472: ixor
    //   18473: goto -> 18484
    //   18476: ldc2_w -1842520663
    //   18479: l2i
    //   18480: ldc_w -84945318
    //   18483: ixor
    //   18484: ldc2_w -1012137398
    //   18487: l2i
    //   18488: ldc_w 641860120
    //   18491: ixor
    //   18492: ixor
    //   18493: lookupswitch default -> 18520, -962407565 -> 18476, 696958974 -> 25454
    //   18520: goto -> 18524
    //   18523: athrow
    //   18524: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   18529: goto -> 18533
    //   18532: athrow
    //   18533: getstatic Perryc.c : I
    //   18536: iflt -> 18550
    //   18539: ldc2_w 390598435
    //   18542: l2i
    //   18543: ldc_w -1211411590
    //   18546: ixor
    //   18547: goto -> 18558
    //   18550: ldc2_w 1075291291
    //   18553: l2i
    //   18554: ldc_w 1891148075
    //   18557: ixor
    //   18558: ldc2_w -1733809245
    //   18561: l2i
    //   18562: ldc_w 815522287
    //   18565: ixor
    //   18566: ixor
    //   18567: lookupswitch default -> 25444, -1734553604 -> 18592, 145790485 -> 18550
    //   18592: goto -> 18596
    //   18595: athrow
    //   18596: invokestatic isBlockUnSafe : (Lnet/minecraft/block/Block;)Z
    //   18599: goto -> 18603
    //   18602: athrow
    //   18603: ifeq -> 18617
    //   18606: ldc2_w 154493097
    //   18609: l2i
    //   18610: ldc_w 134030974
    //   18613: ixor
    //   18614: goto -> 18625
    //   18617: ldc2_w -1688203388
    //   18620: l2i
    //   18621: ldc_w -1784133294
    //   18624: ixor
    //   18625: ldc2_w 390439872
    //   18628: l2i
    //   18629: ldc_w -1274150953
    //   18632: ixor
    //   18633: ixor
    //   18634: tableswitch default -> 18606, -1384113472 -> 18656, -1384113471 -> 25187
    //   18656: getstatic Perryc.0 : I
    //   18659: ifle -> 18673
    //   18662: ldc2_w 1779422594
    //   18665: l2i
    //   18666: ldc_w -967640977
    //   18669: ixor
    //   18670: goto -> 18681
    //   18673: ldc2_w 575099252
    //   18676: l2i
    //   18677: ldc_w -2035524209
    //   18680: ixor
    //   18681: ldc2_w -2031959183
    //   18684: l2i
    //   18685: ldc_w -2047732926
    //   18688: ixor
    //   18689: ixor
    //   18690: lookupswitch default -> 18716, -1353843234 -> 25620, -645630946 -> 18673
    //   18716: getstatic bigname/zprestige/webhack/features/modules/Render/HoleESP.mc : Lnet/minecraft/client/Minecraft;
    //   18719: getstatic Perryc.c : I
    //   18722: iflt -> 18736
    //   18725: ldc2_w -1368365071
    //   18728: l2i
    //   18729: ldc_w -2033497689
    //   18732: ixor
    //   18733: goto -> 18744
    //   18736: ldc2_w -2086941967
    //   18739: l2i
    //   18740: ldc_w -520439164
    //   18743: ixor
    //   18744: ldc2_w 1469489832
    //   18747: l2i
    //   18748: ldc_w 1087301169
    //   18751: ixor
    //   18752: ixor
    //   18753: lookupswitch default -> 25804, 1071868623 -> 18736, 1949906156 -> 18780
    //   18780: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   18783: getstatic Perryc.1 : I
    //   18786: ifeq -> 18800
    //   18789: ldc2_w -824793730
    //   18792: l2i
    //   18793: ldc_w -2023920698
    //   18796: ixor
    //   18797: goto -> 18808
    //   18800: ldc2_w -2099484636
    //   18803: l2i
    //   18804: ldc_w -191865689
    //   18807: ixor
    //   18808: ldc2_w 700182481
    //   18811: l2i
    //   18812: ldc_w 1914880175
    //   18815: ixor
    //   18816: ixor
    //   18817: lookupswitch default -> 18844, 303227334 -> 25632, 994633204 -> 18800
    //   18844: aload #6
    //   18846: getstatic Perryc.1 : I
    //   18849: ifeq -> 18863
    //   18852: ldc2_w -1122810681
    //   18855: l2i
    //   18856: ldc_w 935437437
    //   18859: ixor
    //   18860: goto -> 18871
    //   18863: ldc2_w 423794254
    //   18866: l2i
    //   18867: ldc_w 1847605
    //   18870: ixor
    //   18871: ldc2_w -377689260
    //   18874: l2i
    //   18875: ldc_w 1977998990
    //   18878: ixor
    //   18879: ixor
    //   18880: lookupswitch default -> 18908, 374068576 -> 25380, 1402251180 -> 18863
    //   18908: goto -> 18912
    //   18911: athrow
    //   18912: invokevirtual func_177978_c : ()Lnet/minecraft/util/math/BlockPos;
    //   18915: goto -> 18919
    //   18918: athrow
    //   18919: getstatic Perryc.1 : I
    //   18922: ifeq -> 18936
    //   18925: ldc2_w 787856560
    //   18928: l2i
    //   18929: ldc_w -1335692754
    //   18932: ixor
    //   18933: goto -> 18944
    //   18936: ldc2_w 829860274
    //   18939: l2i
    //   18940: ldc_w 913139
    //   18943: ixor
    //   18944: ldc2_w 1784968873
    //   18947: l2i
    //   18948: ldc_w -1201638449
    //   18951: ixor
    //   18952: ixor
    //   18953: lookupswitch default -> 25642, -478199257 -> 18980, 1284721656 -> 18936
    //   18980: goto -> 18984
    //   18983: athrow
    //   18984: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   18987: goto -> 18991
    //   18990: athrow
    //   18991: getstatic Perryc.c : I
    //   18994: iflt -> 19008
    //   18997: ldc2_w -1853238118
    //   19000: l2i
    //   19001: ldc_w -2121295266
    //   19004: ixor
    //   19005: goto -> 19016
    //   19008: ldc2_w -1904315517
    //   19011: l2i
    //   19012: ldc_w 926355465
    //   19015: ixor
    //   19016: ldc2_w -694789963
    //   19019: l2i
    //   19020: ldc_w -497702528
    //   19023: ixor
    //   19024: ixor
    //   19025: lookupswitch default -> 25458, -1920298305 -> 19052, 616939505 -> 19008
    //   19052: goto -> 19056
    //   19055: athrow
    //   19056: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   19061: goto -> 19065
    //   19064: athrow
    //   19065: getstatic Perryc.c : I
    //   19068: iflt -> 19082
    //   19071: ldc2_w 586369644
    //   19074: l2i
    //   19075: ldc_w 115612516
    //   19078: ixor
    //   19079: goto -> 19090
    //   19082: ldc2_w -225601725
    //   19085: l2i
    //   19086: ldc_w 75870583
    //   19089: ixor
    //   19090: ldc2_w 1114686003
    //   19093: l2i
    //   19094: ldc_w 1034939527
    //   19097: ixor
    //   19098: ixor
    //   19099: lookupswitch default -> 19124, 1539866556 -> 25486, 2017093018 -> 19082
    //   19124: goto -> 19128
    //   19127: athrow
    //   19128: invokestatic isBlockUnSafe : (Lnet/minecraft/block/Block;)Z
    //   19131: goto -> 19135
    //   19134: athrow
    //   19135: ifeq -> 19149
    //   19138: ldc2_w 946842945
    //   19141: l2i
    //   19142: ldc_w -1409282304
    //   19145: ixor
    //   19146: goto -> 19157
    //   19149: ldc2_w -1492758570
    //   19152: l2i
    //   19153: ldc_w 862580120
    //   19156: ixor
    //   19157: ldc2_w -544183374
    //   19160: l2i
    //   19161: ldc_w 1344046260
    //   19164: ixor
    //   19165: ixor
    //   19166: tableswitch default -> 19138, 467881287 -> 19188, 467881288 -> 25187
    //   19188: getstatic Perryc.0 : I
    //   19191: ifle -> 19205
    //   19194: ldc2_w -1295148986
    //   19197: l2i
    //   19198: ldc_w 115603373
    //   19201: ixor
    //   19202: goto -> 19213
    //   19205: ldc2_w -463622282
    //   19208: l2i
    //   19209: ldc_w -1238314072
    //   19212: ixor
    //   19213: ldc2_w -2111032872
    //   19216: l2i
    //   19217: ldc_w -1973405031
    //   19220: ixor
    //   19221: ixor
    //   19222: lookupswitch default -> 25726, -1134402390 -> 19205, 1512142751 -> 19248
    //   19248: aload #6
    //   19250: getstatic Perryc.1 : I
    //   19253: ifeq -> 19267
    //   19256: ldc2_w 48754051
    //   19259: l2i
    //   19260: ldc_w -139199107
    //   19263: ixor
    //   19264: goto -> 19275
    //   19267: ldc2_w 288893352
    //   19270: l2i
    //   19271: ldc_w -1458116463
    //   19274: ixor
    //   19275: ldc2_w -103511047
    //   19278: l2i
    //   19279: ldc_w -1305684218
    //   19282: ixor
    //   19283: ixor
    //   19284: lookupswitch default -> 19312, -1096004607 -> 25370, -370709814 -> 19267
    //   19312: aload_0
    //   19313: getstatic Perryc.c : I
    //   19316: iflt -> 19330
    //   19319: ldc2_w -1020578951
    //   19322: l2i
    //   19323: ldc_w -304494176
    //   19326: ixor
    //   19327: goto -> 19338
    //   19330: ldc2_w -1267789426
    //   19333: l2i
    //   19334: ldc_w -2039658789
    //   19337: ixor
    //   19338: ldc2_w 74395535
    //   19341: l2i
    //   19342: ldc_w -1384243743
    //   19345: ixor
    //   19346: ixor
    //   19347: lookupswitch default -> 19372, -2015115081 -> 25344, -85690850 -> 19330
    //   19372: getfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   19375: getstatic Perryc.1 : I
    //   19378: ifeq -> 19392
    //   19381: ldc2_w -376371198
    //   19384: l2i
    //   19385: ldc_w 1443633082
    //   19388: ixor
    //   19389: goto -> 19400
    //   19392: ldc2_w 689805430
    //   19395: l2i
    //   19396: ldc_w 36460248
    //   19399: ixor
    //   19400: ldc2_w -1759572600
    //   19403: l2i
    //   19404: ldc_w -696516161
    //   19407: ixor
    //   19408: ixor
    //   19409: lookupswitch default -> 25758, -16903281 -> 19392, 1783808665 -> 19436
    //   19436: goto -> 19440
    //   19439: athrow
    //   19440: invokevirtual getValue : ()Ljava/lang/Object;
    //   19443: goto -> 19447
    //   19446: athrow
    //   19447: checkcast java/lang/Boolean
    //   19450: getstatic Perryc.1 : I
    //   19453: ifeq -> 19467
    //   19456: ldc2_w 251414282
    //   19459: l2i
    //   19460: ldc_w 827482241
    //   19463: ixor
    //   19464: goto -> 19475
    //   19467: ldc2_w 1467548247
    //   19470: l2i
    //   19471: ldc_w 966176964
    //   19474: ixor
    //   19475: ldc2_w 1942670139
    //   19478: l2i
    //   19479: ldc_w 795269830
    //   19482: ixor
    //   19483: ixor
    //   19484: lookupswitch default -> 25752, 843293550 -> 19512, 1661089398 -> 19467
    //   19512: goto -> 19516
    //   19515: athrow
    //   19516: invokevirtual booleanValue : ()Z
    //   19519: goto -> 19523
    //   19522: athrow
    //   19523: ifeq -> 19537
    //   19526: ldc2_w -1867423840
    //   19529: l2i
    //   19530: ldc_w 1602736671
    //   19533: ixor
    //   19534: goto -> 19545
    //   19537: ldc2_w -219498015
    //   19540: l2i
    //   19541: ldc_w 1037841503
    //   19544: ixor
    //   19545: ldc2_w 308586432
    //   19548: l2i
    //   19549: ldc_w 704339333
    //   19552: ixor
    //   19553: ixor
    //   19554: tableswitch default -> 19526, -190220294 -> 19576, -190220293 -> 19934
    //   19576: getstatic Perryc.c : I
    //   19579: iflt -> 19593
    //   19582: ldc2_w -1549339320
    //   19585: l2i
    //   19586: ldc_w 861036838
    //   19589: ixor
    //   19590: goto -> 19601
    //   19593: ldc2_w 1765207281
    //   19596: l2i
    //   19597: ldc_w -1888678532
    //   19600: ixor
    //   19601: ldc2_w -490616224
    //   19604: l2i
    //   19605: ldc_w 1049147128
    //   19608: ixor
    //   19609: ixor
    //   19610: lookupswitch default -> 25644, 974298389 -> 19636, 1287514358 -> 19593
    //   19636: goto -> 19640
    //   19639: athrow
    //   19640: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   19643: goto -> 19647
    //   19646: athrow
    //   19647: getstatic Perryc.0 : I
    //   19650: ifle -> 19664
    //   19653: ldc2_w 1362887977
    //   19656: l2i
    //   19657: ldc_w 1008429257
    //   19660: ixor
    //   19661: goto -> 19672
    //   19664: ldc2_w -226466619
    //   19667: l2i
    //   19668: ldc_w -2049865555
    //   19671: ixor
    //   19672: ldc2_w -1283438400
    //   19675: l2i
    //   19676: ldc_w -1395370054
    //   19679: ixor
    //   19680: ixor
    //   19681: lookupswitch default -> 25532, 1745220370 -> 19708, 1920168602 -> 19664
    //   19708: getfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   19711: getstatic Perryc.1 : I
    //   19714: ifeq -> 19728
    //   19717: ldc2_w 918034512
    //   19720: l2i
    //   19721: ldc_w 717346369
    //   19724: ixor
    //   19725: goto -> 19736
    //   19728: ldc2_w 1632787803
    //   19731: l2i
    //   19732: ldc_w -1657766532
    //   19735: ixor
    //   19736: ldc2_w 1621447056
    //   19739: l2i
    //   19740: ldc_w 1672019287
    //   19743: ixor
    //   19744: ixor
    //   19745: lookupswitch default -> 25450, -9466656 -> 19772, 527721174 -> 19728
    //   19772: goto -> 19776
    //   19775: athrow
    //   19776: invokevirtual getValue : ()Ljava/lang/Object;
    //   19779: goto -> 19783
    //   19782: athrow
    //   19783: checkcast java/lang/Integer
    //   19786: getstatic Perryc.c : I
    //   19789: iflt -> 19803
    //   19792: ldc2_w 1441992959
    //   19795: l2i
    //   19796: ldc_w -903095691
    //   19799: ixor
    //   19800: goto -> 19811
    //   19803: ldc2_w 1963355849
    //   19806: l2i
    //   19807: ldc_w -1647654952
    //   19810: ixor
    //   19811: ldc2_w -1376487275
    //   19814: l2i
    //   19815: ldc_w -1099029869
    //   19818: ixor
    //   19819: ixor
    //   19820: lookupswitch default -> 19848, -1940746100 -> 25594, 423009916 -> 19803
    //   19848: goto -> 19852
    //   19851: athrow
    //   19852: invokevirtual intValue : ()I
    //   19855: goto -> 19859
    //   19858: athrow
    //   19859: getstatic Perryc.0 : I
    //   19862: ifle -> 19876
    //   19865: ldc2_w 594808882
    //   19868: l2i
    //   19869: ldc_w -1970602675
    //   19872: ixor
    //   19873: goto -> 19884
    //   19876: ldc2_w 821230195
    //   19879: l2i
    //   19880: ldc_w -1454105172
    //   19883: ixor
    //   19884: ldc2_w -1304980338
    //   19887: l2i
    //   19888: ldc_w -2117689765
    //   19891: ixor
    //   19892: ixor
    //   19893: lookupswitch default -> 25498, -1710233686 -> 19876, -1437078262 -> 19920
    //   19920: goto -> 19924
    //   19923: athrow
    //   19924: invokestatic rainbow : (I)Ljava/awt/Color;
    //   19927: goto -> 19931
    //   19930: athrow
    //   19931: goto -> 21099
    //   19934: new java/awt/Color
    //   19937: dup
    //   19938: getstatic Perryc.1 : I
    //   19941: ifeq -> 19955
    //   19944: ldc2_w 137009513
    //   19947: l2i
    //   19948: ldc_w -621791777
    //   19951: ixor
    //   19952: goto -> 19963
    //   19955: ldc2_w -1818194822
    //   19958: l2i
    //   19959: ldc_w 444636968
    //   19962: ixor
    //   19963: ldc2_w 870063704
    //   19966: l2i
    //   19967: ldc_w 716398393
    //   19970: ixor
    //   19971: ixor
    //   19972: lookupswitch default -> 20000, -1361451563 -> 19955, -877269545 -> 25372
    //   20000: aload_0
    //   20001: getstatic Perryc.0 : I
    //   20004: ifle -> 20018
    //   20007: ldc2_w -772602327
    //   20010: l2i
    //   20011: ldc_w 2088672620
    //   20014: ixor
    //   20015: goto -> 20026
    //   20018: ldc2_w 1936754276
    //   20021: l2i
    //   20022: ldc_w 2006768550
    //   20025: ixor
    //   20026: ldc2_w 1747842759
    //   20029: l2i
    //   20030: ldc_w 81033772
    //   20033: ixor
    //   20034: ixor
    //   20035: lookupswitch default -> 25702, -1049356370 -> 20018, 1746260265 -> 20060
    //   20060: getfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   20063: getstatic Perryc.0 : I
    //   20066: ifle -> 20080
    //   20069: ldc2_w -202442274
    //   20072: l2i
    //   20073: ldc_w 1057275951
    //   20076: ixor
    //   20077: goto -> 20088
    //   20080: ldc2_w -1414371231
    //   20083: l2i
    //   20084: ldc_w 2102612791
    //   20087: ixor
    //   20088: ldc2_w -836699294
    //   20091: l2i
    //   20092: ldc_w -1277571891
    //   20095: ixor
    //   20096: ixor
    //   20097: lookupswitch default -> 25406, -1424487175 -> 20124, -1324151202 -> 20080
    //   20124: goto -> 20128
    //   20127: athrow
    //   20128: invokevirtual getValue : ()Ljava/lang/Object;
    //   20131: goto -> 20135
    //   20134: athrow
    //   20135: checkcast java/lang/Integer
    //   20138: getstatic Perryc.0 : I
    //   20141: ifle -> 20155
    //   20144: ldc2_w 887857109
    //   20147: l2i
    //   20148: ldc_w -188155085
    //   20151: ixor
    //   20152: goto -> 20163
    //   20155: ldc2_w -524100855
    //   20158: l2i
    //   20159: ldc_w 1735630352
    //   20162: ixor
    //   20163: ldc2_w 1158175857
    //   20166: l2i
    //   20167: ldc_w -1932016129
    //   20170: ixor
    //   20171: ixor
    //   20172: lookupswitch default -> 20200, 167574888 -> 25716, 1867238459 -> 20155
    //   20200: goto -> 20204
    //   20203: athrow
    //   20204: invokevirtual intValue : ()I
    //   20207: goto -> 20211
    //   20210: athrow
    //   20211: getstatic Perryc.c : I
    //   20214: iflt -> 20228
    //   20217: ldc2_w -1317734706
    //   20220: l2i
    //   20221: ldc_w -969029593
    //   20224: ixor
    //   20225: goto -> 20236
    //   20228: ldc2_w -2077370109
    //   20231: l2i
    //   20232: ldc_w 763455984
    //   20235: ixor
    //   20236: ldc2_w 1800601987
    //   20239: l2i
    //   20240: ldc_w 1072113473
    //   20243: ixor
    //   20244: ixor
    //   20245: lookupswitch default -> 25740, -48720335 -> 20272, 603789355 -> 20228
    //   20272: aload_0
    //   20273: getstatic Perryc.0 : I
    //   20276: ifle -> 20290
    //   20279: ldc2_w 934786452
    //   20282: l2i
    //   20283: ldc_w 1922262000
    //   20286: ixor
    //   20287: goto -> 20298
    //   20290: ldc2_w 1571873255
    //   20293: l2i
    //   20294: ldc_w 943219736
    //   20297: ixor
    //   20298: ldc2_w 290916151
    //   20301: l2i
    //   20302: ldc_w 2103344979
    //   20305: ixor
    //   20306: ixor
    //   20307: lookupswitch default -> 20332, -1600767653 -> 20290, 690859520 -> 25256
    //   20332: getfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   20335: getstatic Perryc.0 : I
    //   20338: ifle -> 20352
    //   20341: ldc2_w -2022595689
    //   20344: l2i
    //   20345: ldc_w 1539616392
    //   20348: ixor
    //   20349: goto -> 20360
    //   20352: ldc2_w -51921574
    //   20355: l2i
    //   20356: ldc_w 45289676
    //   20359: ixor
    //   20360: ldc2_w -2004070889
    //   20363: l2i
    //   20364: ldc_w -1907113924
    //   20367: ixor
    //   20368: ixor
    //   20369: lookupswitch default -> 20396, -848027291 -> 20352, -630553804 -> 25350
    //   20396: goto -> 20400
    //   20399: athrow
    //   20400: invokevirtual getValue : ()Ljava/lang/Object;
    //   20403: goto -> 20407
    //   20406: athrow
    //   20407: checkcast java/lang/Integer
    //   20410: getstatic Perryc.c : I
    //   20413: iflt -> 20427
    //   20416: ldc2_w -1457566885
    //   20419: l2i
    //   20420: ldc_w -1632103518
    //   20423: ixor
    //   20424: goto -> 20435
    //   20427: ldc2_w 1201855541
    //   20430: l2i
    //   20431: ldc_w 1155613761
    //   20434: ixor
    //   20435: ldc2_w -2081854637
    //   20438: l2i
    //   20439: ldc_w 654363451
    //   20442: ixor
    //   20443: ixor
    //   20444: lookupswitch default -> 25662, -1823541103 -> 20427, -1482016740 -> 20472
    //   20472: goto -> 20476
    //   20475: athrow
    //   20476: invokevirtual intValue : ()I
    //   20479: goto -> 20483
    //   20482: athrow
    //   20483: getstatic Perryc.1 : I
    //   20486: ifeq -> 20500
    //   20489: ldc2_w -1942925153
    //   20492: l2i
    //   20493: ldc_w -4565316
    //   20496: ixor
    //   20497: goto -> 20508
    //   20500: ldc2_w 372531169
    //   20503: l2i
    //   20504: ldc_w 1959714028
    //   20507: ixor
    //   20508: ldc2_w -206370782
    //   20511: l2i
    //   20512: ldc_w -462645806
    //   20515: ixor
    //   20516: ixor
    //   20517: lookupswitch default -> 25764, 1683266515 -> 20500, 1965367037 -> 20544
    //   20544: aload_0
    //   20545: getstatic Perryc.c : I
    //   20548: iflt -> 20562
    //   20551: ldc2_w 108403981
    //   20554: l2i
    //   20555: ldc_w -1581370879
    //   20558: ixor
    //   20559: goto -> 20570
    //   20562: ldc2_w 2000847521
    //   20565: l2i
    //   20566: ldc_w -1009993218
    //   20569: ixor
    //   20570: ldc2_w -2100397521
    //   20573: l2i
    //   20574: ldc_w -1150111415
    //   20577: ixor
    //   20578: ixor
    //   20579: lookupswitch default -> 20604, -1636506518 -> 25658, 209525355 -> 20562
    //   20604: getfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   20607: getstatic Perryc.1 : I
    //   20610: ifeq -> 20624
    //   20613: ldc2_w 1475432293
    //   20616: l2i
    //   20617: ldc_w -1358738726
    //   20620: ixor
    //   20621: goto -> 20632
    //   20624: ldc2_w -230383209
    //   20627: l2i
    //   20628: ldc_w -2068027734
    //   20631: ixor
    //   20632: ldc2_w 1176247712
    //   20635: l2i
    //   20636: ldc_w -484157692
    //   20639: ixor
    //   20640: ixor
    //   20641: lookupswitch default -> 20668, -1835988666 -> 20624, 1573539611 -> 25894
    //   20668: goto -> 20672
    //   20671: athrow
    //   20672: invokevirtual getValue : ()Ljava/lang/Object;
    //   20675: goto -> 20679
    //   20678: athrow
    //   20679: checkcast java/lang/Integer
    //   20682: getstatic Perryc.c : I
    //   20685: iflt -> 20699
    //   20688: ldc2_w -1798261113
    //   20691: l2i
    //   20692: ldc_w -1505418466
    //   20695: ixor
    //   20696: goto -> 20707
    //   20699: ldc2_w -1155294175
    //   20702: l2i
    //   20703: ldc_w -55246603
    //   20706: ixor
    //   20707: ldc2_w 1701534769
    //   20710: l2i
    //   20711: ldc_w 1668874009
    //   20714: ixor
    //   20715: ixor
    //   20716: lookupswitch default -> 20744, -21454754 -> 20699, 881211057 -> 25582
    //   20744: goto -> 20748
    //   20747: athrow
    //   20748: invokevirtual intValue : ()I
    //   20751: goto -> 20755
    //   20754: athrow
    //   20755: getstatic Perryc.1 : I
    //   20758: ifeq -> 20772
    //   20761: ldc2_w 463699059
    //   20764: l2i
    //   20765: ldc_w -1028369305
    //   20768: ixor
    //   20769: goto -> 20780
    //   20772: ldc2_w -1535140400
    //   20775: l2i
    //   20776: ldc_w 72137826
    //   20779: ixor
    //   20780: ldc2_w -1870399273
    //   20783: l2i
    //   20784: ldc_w -1587241813
    //   20787: ixor
    //   20788: ixor
    //   20789: lookupswitch default -> 25218, -1848359474 -> 20816, -386904984 -> 20772
    //   20816: aload_0
    //   20817: getstatic Perryc.c : I
    //   20820: iflt -> 20834
    //   20823: ldc2_w 545581191
    //   20826: l2i
    //   20827: ldc_w -1766214086
    //   20830: ixor
    //   20831: goto -> 20842
    //   20834: ldc2_w -1165227847
    //   20837: l2i
    //   20838: ldc_w 1590827245
    //   20841: ixor
    //   20842: ldc2_w -1473270225
    //   20845: l2i
    //   20846: ldc_w -597824101
    //   20849: ixor
    //   20850: ixor
    //   20851: lookupswitch default -> 20876, -2048334651 -> 20834, -1035002615 -> 25900
    //   20876: getfield alpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   20879: getstatic Perryc.0 : I
    //   20882: ifle -> 20896
    //   20885: ldc2_w -785444092
    //   20888: l2i
    //   20889: ldc_w -1918419125
    //   20892: ixor
    //   20893: goto -> 20904
    //   20896: ldc2_w -1448141699
    //   20899: l2i
    //   20900: ldc_w -1274921487
    //   20903: ixor
    //   20904: ldc2_w -1683604503
    //   20907: l2i
    //   20908: ldc_w 1035321950
    //   20911: ixor
    //   20912: ixor
    //   20913: lookupswitch default -> 25346, -1145120709 -> 20940, -90450440 -> 20896
    //   20940: goto -> 20944
    //   20943: athrow
    //   20944: invokevirtual getValue : ()Ljava/lang/Object;
    //   20947: goto -> 20951
    //   20950: athrow
    //   20951: checkcast java/lang/Integer
    //   20954: getstatic Perryc.0 : I
    //   20957: ifle -> 20971
    //   20960: ldc2_w -754755580
    //   20963: l2i
    //   20964: ldc_w -915032561
    //   20967: ixor
    //   20968: goto -> 20979
    //   20971: ldc2_w 1075216941
    //   20974: l2i
    //   20975: ldc_w 1283731915
    //   20978: ixor
    //   20979: ldc2_w 269816601
    //   20982: l2i
    //   20983: ldc_w 294209759
    //   20986: ixor
    //   20987: ixor
    //   20988: lookupswitch default -> 25776, 219080736 -> 21016, 468366797 -> 20971
    //   21016: goto -> 21020
    //   21019: athrow
    //   21020: invokevirtual intValue : ()I
    //   21023: goto -> 21027
    //   21026: athrow
    //   21027: getstatic Perryc.1 : I
    //   21030: ifeq -> 21044
    //   21033: ldc2_w -1553885270
    //   21036: l2i
    //   21037: ldc_w -2139535947
    //   21040: ixor
    //   21041: goto -> 21052
    //   21044: ldc2_w 233575729
    //   21047: l2i
    //   21048: ldc_w -1744214145
    //   21051: ixor
    //   21052: ldc2_w -1709304228
    //   21055: l2i
    //   21056: ldc_w -1234447615
    //   21059: ixor
    //   21060: ixor
    //   21061: lookupswitch default -> 21088, 258807618 -> 25720, 288106919 -> 21044
    //   21088: goto -> 21092
    //   21091: athrow
    //   21092: invokespecial <init> : (IIII)V
    //   21095: goto -> 21099
    //   21098: athrow
    //   21099: getstatic Perryc.1 : I
    //   21102: ifeq -> 21116
    //   21105: ldc2_w -416319414
    //   21108: l2i
    //   21109: ldc_w 523726762
    //   21112: ixor
    //   21113: goto -> 21124
    //   21116: ldc2_w -1550316717
    //   21119: l2i
    //   21120: ldc_w -2065891181
    //   21123: ixor
    //   21124: ldc2_w 734079367
    //   21127: l2i
    //   21128: ldc_w -1018105706
    //   21131: ixor
    //   21132: ixor
    //   21133: lookupswitch default -> 25288, -808135983 -> 21160, 277466865 -> 21116
    //   21160: aload_0
    //   21161: getstatic Perryc.c : I
    //   21164: iflt -> 21178
    //   21167: ldc2_w 34739959
    //   21170: l2i
    //   21171: ldc_w 200439163
    //   21174: ixor
    //   21175: goto -> 21186
    //   21178: ldc2_w -1016571971
    //   21181: l2i
    //   21182: ldc_w 1021229622
    //   21185: ixor
    //   21186: ldc2_w 70489521
    //   21189: l2i
    //   21190: ldc_w -1088487150
    //   21193: ixor
    //   21194: ixor
    //   21195: lookupswitch default -> 21220, -1532971934 -> 21178, -1295190225 -> 25308
    //   21220: getfield customOutline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   21223: getstatic Perryc.0 : I
    //   21226: ifle -> 21240
    //   21229: ldc2_w 493355143
    //   21232: l2i
    //   21233: ldc_w 1635799544
    //   21236: ixor
    //   21237: goto -> 21248
    //   21240: ldc2_w -828694689
    //   21243: l2i
    //   21244: ldc_w -880447519
    //   21247: ixor
    //   21248: ldc2_w -1211334819
    //   21251: l2i
    //   21252: ldc_w 1464009812
    //   21255: ixor
    //   21256: ixor
    //   21257: lookupswitch default -> 25302, -1670960522 -> 21240, -443479113 -> 21284
    //   21284: goto -> 21288
    //   21287: athrow
    //   21288: invokevirtual getValue : ()Ljava/lang/Object;
    //   21291: goto -> 21295
    //   21294: athrow
    //   21295: checkcast java/lang/Boolean
    //   21298: getstatic Perryc.0 : I
    //   21301: ifle -> 21315
    //   21304: ldc2_w -1204668227
    //   21307: l2i
    //   21308: ldc_w 501250863
    //   21311: ixor
    //   21312: goto -> 21323
    //   21315: ldc2_w 715045101
    //   21318: l2i
    //   21319: ldc_w -1221639820
    //   21322: ixor
    //   21323: ldc2_w 566969301
    //   21326: l2i
    //   21327: ldc_w 1530880500
    //   21330: ixor
    //   21331: ixor
    //   21332: lookupswitch default -> 25374, -551132749 -> 21315, -414852168 -> 21360
    //   21360: goto -> 21364
    //   21363: athrow
    //   21364: invokevirtual booleanValue : ()Z
    //   21367: goto -> 21371
    //   21370: athrow
    //   21371: new java/awt/Color
    //   21374: dup
    //   21375: getstatic Perryc.1 : I
    //   21378: ifeq -> 21392
    //   21381: ldc2_w -769405178
    //   21384: l2i
    //   21385: ldc_w 31635982
    //   21388: ixor
    //   21389: goto -> 21400
    //   21392: ldc2_w -372464948
    //   21395: l2i
    //   21396: ldc_w 661061857
    //   21399: ixor
    //   21400: ldc2_w 1179976283
    //   21403: l2i
    //   21404: ldc_w -836903555
    //   21407: ixor
    //   21408: ixor
    //   21409: lookupswitch default -> 21436, -870857358 -> 21392, 1535748654 -> 25828
    //   21436: aload_0
    //   21437: getstatic Perryc.c : I
    //   21440: iflt -> 21454
    //   21443: ldc2_w 1647678304
    //   21446: l2i
    //   21447: ldc_w 1705054137
    //   21450: ixor
    //   21451: goto -> 21462
    //   21454: ldc2_w -1952144397
    //   21457: l2i
    //   21458: ldc_w -594569306
    //   21461: ixor
    //   21462: ldc2_w 1041463196
    //   21465: l2i
    //   21466: ldc_w 1624322666
    //   21469: ixor
    //   21470: ixor
    //   21471: lookupswitch default -> 21496, -231861829 -> 21454, 1498863919 -> 25418
    //   21496: getfield cRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   21499: getstatic Perryc.1 : I
    //   21502: ifeq -> 21516
    //   21505: ldc2_w 408348535
    //   21508: l2i
    //   21509: ldc_w 1071845358
    //   21512: ixor
    //   21513: goto -> 21524
    //   21516: ldc2_w -242278359
    //   21519: l2i
    //   21520: ldc_w 1672489656
    //   21523: ixor
    //   21524: ldc2_w 3563157
    //   21527: l2i
    //   21528: ldc_w 1668445272
    //   21531: ixor
    //   21532: ixor
    //   21533: lookupswitch default -> 25544, -243589028 -> 21560, 1156694612 -> 21516
    //   21560: goto -> 21564
    //   21563: athrow
    //   21564: invokevirtual getValue : ()Ljava/lang/Object;
    //   21567: goto -> 21571
    //   21570: athrow
    //   21571: checkcast java/lang/Integer
    //   21574: getstatic Perryc.0 : I
    //   21577: ifle -> 21591
    //   21580: ldc2_w -1638895818
    //   21583: l2i
    //   21584: ldc_w -1212450226
    //   21587: ixor
    //   21588: goto -> 21599
    //   21591: ldc2_w 1980528409
    //   21594: l2i
    //   21595: ldc_w 1400843397
    //   21598: ixor
    //   21599: ldc2_w -1885161942
    //   21602: l2i
    //   21603: ldc_w 1812982524
    //   21606: ixor
    //   21607: ixor
    //   21608: lookupswitch default -> 21636, -1833944763 -> 21591, -901363282 -> 25780
    //   21636: goto -> 21640
    //   21639: athrow
    //   21640: invokevirtual intValue : ()I
    //   21643: goto -> 21647
    //   21646: athrow
    //   21647: getstatic Perryc.1 : I
    //   21650: ifeq -> 21664
    //   21653: ldc2_w -2079066388
    //   21656: l2i
    //   21657: ldc_w 718714266
    //   21660: ixor
    //   21661: goto -> 21672
    //   21664: ldc2_w 1164695889
    //   21667: l2i
    //   21668: ldc_w 202364713
    //   21671: ixor
    //   21672: ldc2_w -286690877
    //   21675: l2i
    //   21676: ldc_w 237610897
    //   21679: ixor
    //   21680: ixor
    //   21681: lookupswitch default -> 21708, 878496059 -> 21664, 1308988708 -> 25318
    //   21708: aload_0
    //   21709: getstatic Perryc.0 : I
    //   21712: ifle -> 21726
    //   21715: ldc2_w -73160757
    //   21718: l2i
    //   21719: ldc_w -2124556
    //   21722: ixor
    //   21723: goto -> 21734
    //   21726: ldc2_w -1409374127
    //   21729: l2i
    //   21730: ldc_w 22675819
    //   21733: ixor
    //   21734: ldc2_w 816587146
    //   21737: l2i
    //   21738: ldc_w 628540542
    //   21741: ixor
    //   21742: ixor
    //   21743: lookupswitch default -> 25682, -1082241842 -> 21768, 296146635 -> 21726
    //   21768: getfield cGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   21771: getstatic Perryc.1 : I
    //   21774: ifeq -> 21788
    //   21777: ldc2_w 1258687331
    //   21780: l2i
    //   21781: ldc_w 1526174648
    //   21784: ixor
    //   21785: goto -> 21796
    //   21788: ldc2_w -1457163956
    //   21791: l2i
    //   21792: ldc_w -26993504
    //   21795: ixor
    //   21796: ldc2_w 1740048923
    //   21799: l2i
    //   21800: ldc_w 446149408
    //   21803: ixor
    //   21804: ixor
    //   21805: lookupswitch default -> 21832, -2111905617 -> 21788, 1825645024 -> 25562
    //   21832: goto -> 21836
    //   21835: athrow
    //   21836: invokevirtual getValue : ()Ljava/lang/Object;
    //   21839: goto -> 21843
    //   21842: athrow
    //   21843: checkcast java/lang/Integer
    //   21846: getstatic Perryc.0 : I
    //   21849: ifle -> 21863
    //   21852: ldc2_w 395091496
    //   21855: l2i
    //   21856: ldc_w -1965324689
    //   21859: ixor
    //   21860: goto -> 21871
    //   21863: ldc2_w 1754343702
    //   21866: l2i
    //   21867: ldc_w 1213211121
    //   21870: ixor
    //   21871: ldc2_w -209002489
    //   21874: l2i
    //   21875: ldc_w -1213163063
    //   21878: ixor
    //   21879: ixor
    //   21880: lookupswitch default -> 25476, -647143031 -> 21863, 1694200105 -> 21908
    //   21908: goto -> 21912
    //   21911: athrow
    //   21912: invokevirtual intValue : ()I
    //   21915: goto -> 21919
    //   21918: athrow
    //   21919: getstatic Perryc.c : I
    //   21922: iflt -> 21936
    //   21925: ldc2_w -1423574861
    //   21928: l2i
    //   21929: ldc_w 285059823
    //   21932: ixor
    //   21933: goto -> 21944
    //   21936: ldc2_w -127708816
    //   21939: l2i
    //   21940: ldc_w -662425699
    //   21943: ixor
    //   21944: ldc2_w -175721815
    //   21947: l2i
    //   21948: ldc_w 1644320648
    //   21951: ixor
    //   21952: ixor
    //   21953: lookupswitch default -> 25654, -1218208820 -> 21980, 744273789 -> 21936
    //   21980: aload_0
    //   21981: getstatic Perryc.1 : I
    //   21984: ifeq -> 21998
    //   21987: ldc2_w 1170040885
    //   21990: l2i
    //   21991: ldc_w -956493337
    //   21994: ixor
    //   21995: goto -> 22006
    //   21998: ldc2_w -1028722499
    //   22001: l2i
    //   22002: ldc_w 1209676077
    //   22005: ixor
    //   22006: ldc2_w 864190659
    //   22009: l2i
    //   22010: ldc_w -312530629
    //   22013: ixor
    //   22014: ixor
    //   22015: lookupswitch default -> 22040, 552434448 -> 21998, 1570623530 -> 25680
    //   22040: getfield cBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   22043: getstatic Perryc.c : I
    //   22046: iflt -> 22060
    //   22049: ldc2_w 1140052712
    //   22052: l2i
    //   22053: ldc_w -1245843810
    //   22056: ixor
    //   22057: goto -> 22068
    //   22060: ldc2_w -1804299142
    //   22063: l2i
    //   22064: ldc_w 2047595930
    //   22067: ixor
    //   22068: ldc2_w 1357488618
    //   22071: l2i
    //   22072: ldc_w -812543978
    //   22075: ixor
    //   22076: ixor
    //   22077: lookupswitch default -> 25294, 1765150090 -> 22060, 1896312860 -> 22104
    //   22104: goto -> 22108
    //   22107: athrow
    //   22108: invokevirtual getValue : ()Ljava/lang/Object;
    //   22111: goto -> 22115
    //   22114: athrow
    //   22115: checkcast java/lang/Integer
    //   22118: getstatic Perryc.1 : I
    //   22121: ifeq -> 22135
    //   22124: ldc2_w 1155530786
    //   22127: l2i
    //   22128: ldc_w -1815199110
    //   22131: ixor
    //   22132: goto -> 22143
    //   22135: ldc2_w -1633119039
    //   22138: l2i
    //   22139: ldc_w 1439868109
    //   22142: ixor
    //   22143: ldc2_w 723905524
    //   22146: l2i
    //   22147: ldc_w 983295505
    //   22150: ixor
    //   22151: ixor
    //   22152: lookupswitch default -> 22180, -963620931 -> 25430, 2056818248 -> 22135
    //   22180: goto -> 22184
    //   22183: athrow
    //   22184: invokevirtual intValue : ()I
    //   22187: goto -> 22191
    //   22190: athrow
    //   22191: getstatic Perryc.0 : I
    //   22194: ifle -> 22208
    //   22197: ldc2_w -535269256
    //   22200: l2i
    //   22201: ldc_w 681315461
    //   22204: ixor
    //   22205: goto -> 22216
    //   22208: ldc2_w -1358603622
    //   22211: l2i
    //   22212: ldc_w -817230040
    //   22215: ixor
    //   22216: ldc2_w 251449366
    //   22219: l2i
    //   22220: ldc_w -2086218594
    //   22223: ixor
    //   22224: ixor
    //   22225: lookupswitch default -> 25548, -317370054 -> 22252, 1172207733 -> 22208
    //   22252: aload_0
    //   22253: getstatic Perryc.0 : I
    //   22256: ifle -> 22270
    //   22259: ldc2_w 327479994
    //   22262: l2i
    //   22263: ldc_w -1545910862
    //   22266: ixor
    //   22267: goto -> 22278
    //   22270: ldc2_w -1093741931
    //   22273: l2i
    //   22274: ldc_w 900587091
    //   22277: ixor
    //   22278: ldc2_w -2110604858
    //   22281: l2i
    //   22282: ldc_w -1152435562
    //   22285: ixor
    //   22286: ixor
    //   22287: lookupswitch default -> 25604, -1994247080 -> 22270, -1306620010 -> 22312
    //   22312: getfield cAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   22315: getstatic Perryc.c : I
    //   22318: iflt -> 22332
    //   22321: ldc2_w -1104782073
    //   22324: l2i
    //   22325: ldc_w -1402132804
    //   22328: ixor
    //   22329: goto -> 22340
    //   22332: ldc2_w 1348451667
    //   22335: l2i
    //   22336: ldc_w 1586054119
    //   22339: ixor
    //   22340: ldc2_w -943967027
    //   22343: l2i
    //   22344: ldc_w -1689944858
    //   22347: ixor
    //   22348: ixor
    //   22349: lookupswitch default -> 25670, 1320301456 -> 22332, 1378858655 -> 22376
    //   22376: goto -> 22380
    //   22379: athrow
    //   22380: invokevirtual getValue : ()Ljava/lang/Object;
    //   22383: goto -> 22387
    //   22386: athrow
    //   22387: checkcast java/lang/Integer
    //   22390: getstatic Perryc.0 : I
    //   22393: ifle -> 22407
    //   22396: ldc2_w -1936216513
    //   22399: l2i
    //   22400: ldc_w 2133712772
    //   22403: ixor
    //   22404: goto -> 22415
    //   22407: ldc2_w -316289252
    //   22410: l2i
    //   22411: ldc_w 1379448400
    //   22414: ixor
    //   22415: ldc2_w 1460736708
    //   22418: l2i
    //   22419: ldc_w -1195573755
    //   22422: ixor
    //   22423: ixor
    //   22424: lookupswitch default -> 25352, 471309690 -> 22407, 1353749901 -> 22452
    //   22452: goto -> 22456
    //   22455: athrow
    //   22456: invokevirtual intValue : ()I
    //   22459: goto -> 22463
    //   22462: athrow
    //   22463: getstatic Perryc.c : I
    //   22466: iflt -> 22480
    //   22469: ldc2_w 697330502
    //   22472: l2i
    //   22473: ldc_w -603980471
    //   22476: ixor
    //   22477: goto -> 22488
    //   22480: ldc2_w 1166753372
    //   22483: l2i
    //   22484: ldc_w -581162056
    //   22487: ixor
    //   22488: ldc2_w 1785476038
    //   22491: l2i
    //   22492: ldc_w -1830016736
    //   22495: ixor
    //   22496: ixor
    //   22497: lookupswitch default -> 22524, 183471337 -> 25846, 2137891967 -> 22480
    //   22524: goto -> 22528
    //   22527: athrow
    //   22528: invokespecial <init> : (IIII)V
    //   22531: goto -> 22535
    //   22534: athrow
    //   22535: getstatic Perryc.c : I
    //   22538: iflt -> 22552
    //   22541: ldc2_w -141737931
    //   22544: l2i
    //   22545: ldc_w 407350047
    //   22548: ixor
    //   22549: goto -> 22560
    //   22552: ldc2_w 385777625
    //   22555: l2i
    //   22556: ldc_w 286594082
    //   22559: ixor
    //   22560: ldc2_w -1589712381
    //   22563: l2i
    //   22564: ldc_w -1194889243
    //   22567: ixor
    //   22568: ixor
    //   22569: lookupswitch default -> 25264, -164401460 -> 22552, 504557085 -> 22596
    //   22596: aload_0
    //   22597: getstatic Perryc.c : I
    //   22600: iflt -> 22614
    //   22603: ldc2_w -1680488971
    //   22606: l2i
    //   22607: ldc_w 44778250
    //   22610: ixor
    //   22611: goto -> 22622
    //   22614: ldc2_w 2104237384
    //   22617: l2i
    //   22618: ldc_w 1920708777
    //   22621: ixor
    //   22622: ldc2_w 1979471496
    //   22625: l2i
    //   22626: ldc_w -305719298
    //   22629: ixor
    //   22630: ixor
    //   22631: lookupswitch default -> 25442, -1758663529 -> 22656, 21350281 -> 22614
    //   22656: getfield lineWidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   22659: getstatic Perryc.c : I
    //   22662: iflt -> 22676
    //   22665: ldc2_w -1951862836
    //   22668: l2i
    //   22669: ldc_w 450973253
    //   22672: ixor
    //   22673: goto -> 22684
    //   22676: ldc2_w 1510013355
    //   22679: l2i
    //   22680: ldc_w -592847939
    //   22683: ixor
    //   22684: ldc2_w -1221410024
    //   22687: l2i
    //   22688: ldc_w -11978869
    //   22691: ixor
    //   22692: ixor
    //   22693: lookupswitch default -> 22720, -651012838 -> 25656, 1397429015 -> 22676
    //   22720: goto -> 22724
    //   22723: athrow
    //   22724: invokevirtual getValue : ()Ljava/lang/Object;
    //   22727: goto -> 22731
    //   22730: athrow
    //   22731: checkcast java/lang/Float
    //   22734: getstatic Perryc.0 : I
    //   22737: ifle -> 22751
    //   22740: ldc2_w 1081971144
    //   22743: l2i
    //   22744: ldc_w -739741010
    //   22747: ixor
    //   22748: goto -> 22759
    //   22751: ldc2_w 621791070
    //   22754: l2i
    //   22755: ldc_w -141813314
    //   22758: ixor
    //   22759: ldc2_w 464221168
    //   22762: l2i
    //   22763: ldc_w 2049473353
    //   22766: ixor
    //   22767: ixor
    //   22768: lookupswitch default -> 25324, -1291790759 -> 22796, -233378849 -> 22751
    //   22796: goto -> 22800
    //   22799: athrow
    //   22800: invokevirtual floatValue : ()F
    //   22803: goto -> 22807
    //   22806: athrow
    //   22807: getstatic Perryc.c : I
    //   22810: iflt -> 22824
    //   22813: ldc2_w -809103627
    //   22816: l2i
    //   22817: ldc_w -1715752793
    //   22820: ixor
    //   22821: goto -> 22832
    //   22824: ldc2_w 12969107
    //   22827: l2i
    //   22828: ldc_w 1060916619
    //   22831: ixor
    //   22832: ldc2_w 1090293474
    //   22835: l2i
    //   22836: ldc_w -694281527
    //   22839: ixor
    //   22840: ixor
    //   22841: lookupswitch default -> 22868, -1071699335 -> 25270, -536564658 -> 22824
    //   22868: aload_0
    //   22869: getstatic Perryc.c : I
    //   22872: iflt -> 22886
    //   22875: ldc2_w 600525791
    //   22878: l2i
    //   22879: ldc_w 1578470452
    //   22882: ixor
    //   22883: goto -> 22894
    //   22886: ldc2_w -725135035
    //   22889: l2i
    //   22890: ldc_w 1232214651
    //   22893: ixor
    //   22894: ldc2_w -1528482860
    //   22897: l2i
    //   22898: ldc_w -1656419098
    //   22901: ixor
    //   22902: ixor
    //   22903: lookupswitch default -> 25584, -1542097908 -> 22928, 1149171929 -> 22886
    //   22928: getfield outline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   22931: getstatic Perryc.1 : I
    //   22934: ifeq -> 22948
    //   22937: ldc2_w -1365090953
    //   22940: l2i
    //   22941: ldc_w 2019275133
    //   22944: ixor
    //   22945: goto -> 22956
    //   22948: ldc2_w 283258680
    //   22951: l2i
    //   22952: ldc_w 112263695
    //   22955: ixor
    //   22956: ldc2_w -1805666397
    //   22959: l2i
    //   22960: ldc_w 2127797743
    //   22963: ixor
    //   22964: ixor
    //   22965: lookupswitch default -> 22992, -1434084506 -> 22948, 1014351430 -> 25552
    //   22992: goto -> 22996
    //   22995: athrow
    //   22996: invokevirtual getValue : ()Ljava/lang/Object;
    //   22999: goto -> 23003
    //   23002: athrow
    //   23003: checkcast java/lang/Boolean
    //   23006: getstatic Perryc.1 : I
    //   23009: ifeq -> 23023
    //   23012: ldc2_w 232263902
    //   23015: l2i
    //   23016: ldc_w 1724809655
    //   23019: ixor
    //   23020: goto -> 23031
    //   23023: ldc2_w 887985277
    //   23026: l2i
    //   23027: ldc_w 1789175743
    //   23030: ixor
    //   23031: ldc2_w 181101362
    //   23034: l2i
    //   23035: ldc_w -1184722892
    //   23038: ixor
    //   23039: ixor
    //   23040: lookupswitch default -> 25560, -658546065 -> 23023, -304037692 -> 23068
    //   23068: goto -> 23072
    //   23071: athrow
    //   23072: invokevirtual booleanValue : ()Z
    //   23075: goto -> 23079
    //   23078: athrow
    //   23079: getstatic Perryc.0 : I
    //   23082: ifle -> 23096
    //   23085: ldc2_w 422967868
    //   23088: l2i
    //   23089: ldc_w -2012870769
    //   23092: ixor
    //   23093: goto -> 23104
    //   23096: ldc2_w 71434248
    //   23099: l2i
    //   23100: ldc_w 1069732671
    //   23103: ixor
    //   23104: ldc2_w 999701548
    //   23107: l2i
    //   23108: ldc_w 515061215
    //   23111: ixor
    //   23112: ixor
    //   23113: lookupswitch default -> 25300, -1273564096 -> 23096, 514185924 -> 23140
    //   23140: aload_0
    //   23141: getstatic Perryc.0 : I
    //   23144: ifle -> 23158
    //   23147: ldc2_w 388354349
    //   23150: l2i
    //   23151: ldc_w 938971843
    //   23154: ixor
    //   23155: goto -> 23166
    //   23158: ldc2_w -2101011465
    //   23161: l2i
    //   23162: ldc_w 263917969
    //   23165: ixor
    //   23166: ldc2_w 909425731
    //   23169: l2i
    //   23170: ldc_w 809925469
    //   23173: ixor
    //   23174: ixor
    //   23175: lookupswitch default -> 25366, -1962095240 -> 23200, 648054000 -> 23158
    //   23200: getfield box : Lbigname/zprestige/webhack/features/setting/Setting;
    //   23203: getstatic Perryc.0 : I
    //   23206: ifle -> 23220
    //   23209: ldc2_w 124857073
    //   23212: l2i
    //   23213: ldc_w 1492799911
    //   23216: ixor
    //   23217: goto -> 23228
    //   23220: ldc2_w -535968191
    //   23223: l2i
    //   23224: ldc_w -1653776930
    //   23227: ixor
    //   23228: ldc2_w 1033512789
    //   23231: l2i
    //   23232: ldc_w -2100504230
    //   23235: ixor
    //   23236: ixor
    //   23237: lookupswitch default -> 23264, -522353319 -> 25718, -261811317 -> 23220
    //   23264: goto -> 23268
    //   23267: athrow
    //   23268: invokevirtual getValue : ()Ljava/lang/Object;
    //   23271: goto -> 23275
    //   23274: athrow
    //   23275: checkcast java/lang/Boolean
    //   23278: getstatic Perryc.c : I
    //   23281: iflt -> 23295
    //   23284: ldc2_w 1602488510
    //   23287: l2i
    //   23288: ldc_w 1604441926
    //   23291: ixor
    //   23292: goto -> 23303
    //   23295: ldc2_w 197655093
    //   23298: l2i
    //   23299: ldc_w 1386631507
    //   23302: ixor
    //   23303: ldc2_w 2010142595
    //   23306: l2i
    //   23307: ldc_w 1335678638
    //   23310: ixor
    //   23311: ixor
    //   23312: lookupswitch default -> 25588, 946429653 -> 23295, 1630349899 -> 23340
    //   23340: goto -> 23344
    //   23343: athrow
    //   23344: invokevirtual booleanValue : ()Z
    //   23347: goto -> 23351
    //   23350: athrow
    //   23351: getstatic Perryc.c : I
    //   23354: iflt -> 23368
    //   23357: ldc2_w -608217122
    //   23360: l2i
    //   23361: ldc_w 1929844467
    //   23364: ixor
    //   23365: goto -> 23376
    //   23368: ldc2_w -1082200109
    //   23371: l2i
    //   23372: ldc_w -985767413
    //   23375: ixor
    //   23376: ldc2_w 1473355706
    //   23379: l2i
    //   23380: ldc_w -491555800
    //   23383: ixor
    //   23384: ixor
    //   23385: lookupswitch default -> 25348, -819829174 -> 23412, 500869823 -> 23368
    //   23412: aload_0
    //   23413: getstatic Perryc.1 : I
    //   23416: ifeq -> 23430
    //   23419: ldc2_w 589210274
    //   23422: l2i
    //   23423: ldc_w 1602588720
    //   23426: ixor
    //   23427: goto -> 23438
    //   23430: ldc2_w -1170912640
    //   23433: l2i
    //   23434: ldc_w 716019504
    //   23437: ixor
    //   23438: ldc2_w 727788609
    //   23441: l2i
    //   23442: ldc_w -7711375
    //   23445: ixor
    //   23446: ixor
    //   23447: lookupswitch default -> 23472, -1469035614 -> 25874, -140106777 -> 23430
    //   23472: getfield boxAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   23475: getstatic Perryc.0 : I
    //   23478: ifle -> 23492
    //   23481: ldc2_w -1372065608
    //   23484: l2i
    //   23485: ldc_w -406342869
    //   23488: ixor
    //   23489: goto -> 23500
    //   23492: ldc2_w -731697125
    //   23495: l2i
    //   23496: ldc_w 1183192667
    //   23499: ixor
    //   23500: ldc2_w 1399323284
    //   23503: l2i
    //   23504: ldc_w 915597727
    //   23507: ixor
    //   23508: ixor
    //   23509: lookupswitch default -> 23536, -473116474 -> 23492, 738545816 -> 25646
    //   23536: goto -> 23540
    //   23539: athrow
    //   23540: invokevirtual getValue : ()Ljava/lang/Object;
    //   23543: goto -> 23547
    //   23546: athrow
    //   23547: checkcast java/lang/Integer
    //   23550: getstatic Perryc.1 : I
    //   23553: ifeq -> 23567
    //   23556: ldc2_w 474288101
    //   23559: l2i
    //   23560: ldc_w -1124418420
    //   23563: ixor
    //   23564: goto -> 23575
    //   23567: ldc2_w -1668037846
    //   23570: l2i
    //   23571: ldc_w -1599905739
    //   23574: ixor
    //   23575: ldc2_w -165710749
    //   23578: l2i
    //   23579: ldc_w 1295977000
    //   23582: ixor
    //   23583: ixor
    //   23584: lookupswitch default -> 25550, -2028937900 -> 23612, 463457570 -> 23567
    //   23612: goto -> 23616
    //   23615: athrow
    //   23616: invokevirtual intValue : ()I
    //   23619: goto -> 23623
    //   23622: athrow
    //   23623: ldc2_w -1711868104
    //   23626: l2i
    //   23627: ldc_w -1711868103
    //   23630: ixor
    //   23631: getstatic Perryc.0 : I
    //   23634: ifle -> 23648
    //   23637: ldc2_w -1129657987
    //   23640: l2i
    //   23641: ldc_w 2056441642
    //   23644: ixor
    //   23645: goto -> 23656
    //   23648: ldc2_w 1060115897
    //   23651: l2i
    //   23652: ldc_w -1245921310
    //   23655: ixor
    //   23656: ldc2_w 467577115
    //   23659: l2i
    //   23660: ldc_w -37409295
    //   23663: ixor
    //   23664: ixor
    //   23665: lookupswitch default -> 23692, 539198141 -> 25710, 1232370982 -> 23648
    //   23692: aload_0
    //   23693: getstatic Perryc.1 : I
    //   23696: ifeq -> 23710
    //   23699: ldc2_w -1404953778
    //   23702: l2i
    //   23703: ldc_w 269383217
    //   23706: ixor
    //   23707: goto -> 23718
    //   23710: ldc2_w -1892975947
    //   23713: l2i
    //   23714: ldc_w -793804965
    //   23717: ixor
    //   23718: ldc2_w 2135297293
    //   23721: l2i
    //   23722: ldc_w 271433069
    //   23725: ixor
    //   23726: ixor
    //   23727: lookupswitch default -> 23752, -752362209 -> 25388, -357893224 -> 23710
    //   23752: getfield height : Lbigname/zprestige/webhack/features/setting/Setting;
    //   23755: getstatic Perryc.0 : I
    //   23758: ifle -> 23772
    //   23761: ldc2_w 1688304043
    //   23764: l2i
    //   23765: ldc_w 1991577572
    //   23768: ixor
    //   23769: goto -> 23780
    //   23772: ldc2_w -954747143
    //   23775: l2i
    //   23776: ldc_w 1677554040
    //   23779: ixor
    //   23780: ldc2_w -1616003931
    //   23783: l2i
    //   23784: ldc_w 983932862
    //   23787: ixor
    //   23788: ixor
    //   23789: lookupswitch default -> 25538, -1222879916 -> 23772, 31646874 -> 23816
    //   23816: goto -> 23820
    //   23819: athrow
    //   23820: invokevirtual getValue : ()Ljava/lang/Object;
    //   23823: goto -> 23827
    //   23826: athrow
    //   23827: checkcast java/lang/Double
    //   23830: getstatic Perryc.c : I
    //   23833: iflt -> 23847
    //   23836: ldc2_w 938956007
    //   23839: l2i
    //   23840: ldc_w -832496234
    //   23843: ixor
    //   23844: goto -> 23855
    //   23847: ldc2_w 1224976916
    //   23850: l2i
    //   23851: ldc_w -1479237709
    //   23854: ixor
    //   23855: ldc2_w 424578296
    //   23858: l2i
    //   23859: ldc_w -2119583575
    //   23862: ixor
    //   23863: ixor
    //   23864: lookupswitch default -> 23892, -2106529774 -> 23847, 1634827552 -> 25328
    //   23892: goto -> 23896
    //   23895: athrow
    //   23896: invokevirtual doubleValue : ()D
    //   23899: goto -> 23903
    //   23902: athrow
    //   23903: getstatic Perryc.c : I
    //   23906: iflt -> 23920
    //   23909: ldc2_w 1396880341
    //   23912: l2i
    //   23913: ldc_w 522953755
    //   23916: ixor
    //   23917: goto -> 23928
    //   23920: ldc2_w 1132046880
    //   23923: l2i
    //   23924: ldc_w 1513844764
    //   23927: ixor
    //   23928: ldc2_w 1172640224
    //   23931: l2i
    //   23932: ldc_w -675520107
    //   23935: ixor
    //   23936: ixor
    //   23937: lookupswitch default -> 25850, -1961121207 -> 23964, -567253061 -> 23920
    //   23964: aload_0
    //   23965: getstatic Perryc.c : I
    //   23968: iflt -> 23982
    //   23971: ldc2_w 496650832
    //   23974: l2i
    //   23975: ldc_w -2064242091
    //   23978: ixor
    //   23979: goto -> 23990
    //   23982: ldc2_w 128533236
    //   23985: l2i
    //   23986: ldc_w 1579061133
    //   23989: ixor
    //   23990: ldc2_w -1052663969
    //   23993: l2i
    //   23994: ldc_w 1548421288
    //   23997: ixor
    //   23998: ixor
    //   23999: lookupswitch default -> 25220, -994223474 -> 24024, 73857010 -> 23982
    //   24024: getfield gradientBox : Lbigname/zprestige/webhack/features/setting/Setting;
    //   24027: getstatic Perryc.c : I
    //   24030: iflt -> 24044
    //   24033: ldc2_w -577619851
    //   24036: l2i
    //   24037: ldc_w 1703195994
    //   24040: ixor
    //   24041: goto -> 24052
    //   24044: ldc2_w 174730655
    //   24047: l2i
    //   24048: ldc_w 1486155709
    //   24051: ixor
    //   24052: ldc2_w 1738131932
    //   24055: l2i
    //   24056: ldc_w -96768469
    //   24059: ixor
    //   24060: ixor
    //   24061: lookupswitch default -> 25790, -816028203 -> 24088, 632564440 -> 24044
    //   24088: goto -> 24092
    //   24091: athrow
    //   24092: invokevirtual getValue : ()Ljava/lang/Object;
    //   24095: goto -> 24099
    //   24098: athrow
    //   24099: checkcast java/lang/Boolean
    //   24102: getstatic Perryc.0 : I
    //   24105: ifle -> 24119
    //   24108: ldc2_w -995014873
    //   24111: l2i
    //   24112: ldc_w -534228670
    //   24115: ixor
    //   24116: goto -> 24127
    //   24119: ldc2_w 1430810539
    //   24122: l2i
    //   24123: ldc_w -1524279442
    //   24126: ixor
    //   24127: ldc2_w -1587776339
    //   24130: l2i
    //   24131: ldc_w 355686494
    //   24134: ixor
    //   24135: ixor
    //   24136: lookupswitch default -> 24164, -1862911338 -> 25248, 1465013133 -> 24119
    //   24164: goto -> 24168
    //   24167: athrow
    //   24168: invokevirtual booleanValue : ()Z
    //   24171: goto -> 24175
    //   24174: athrow
    //   24175: getstatic Perryc.c : I
    //   24178: iflt -> 24192
    //   24181: ldc2_w -866217970
    //   24184: l2i
    //   24185: ldc_w 1989954061
    //   24188: ixor
    //   24189: goto -> 24200
    //   24192: ldc2_w 573256951
    //   24195: l2i
    //   24196: ldc_w 1840534994
    //   24199: ixor
    //   24200: ldc2_w -84864193
    //   24203: l2i
    //   24204: ldc_w -858750230
    //   24207: ixor
    //   24208: ixor
    //   24209: lookupswitch default -> 25522, -1931260970 -> 24192, 2042556656 -> 24236
    //   24236: aload_0
    //   24237: getstatic Perryc.0 : I
    //   24240: ifle -> 24254
    //   24243: ldc2_w 193035319
    //   24246: l2i
    //   24247: ldc_w 1516725988
    //   24250: ixor
    //   24251: goto -> 24262
    //   24254: ldc2_w -1581750140
    //   24257: l2i
    //   24258: ldc_w 759659490
    //   24261: ixor
    //   24262: ldc2_w -1217762482
    //   24265: l2i
    //   24266: ldc_w 322841232
    //   24269: ixor
    //   24270: ixor
    //   24271: lookupswitch default -> 24296, -492005860 -> 24254, -172860659 -> 25438
    //   24296: getfield gradientOutline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   24299: getstatic Perryc.1 : I
    //   24302: ifeq -> 24316
    //   24305: ldc2_w 981608262
    //   24308: l2i
    //   24309: ldc_w -2007197499
    //   24312: ixor
    //   24313: goto -> 24324
    //   24316: ldc2_w -1578291309
    //   24319: l2i
    //   24320: ldc_w -778246071
    //   24323: ixor
    //   24324: ldc2_w -2002241570
    //   24327: l2i
    //   24328: ldc_w 1319927774
    //   24331: ixor
    //   24332: ixor
    //   24333: lookupswitch default -> 24360, -356057860 -> 24316, 1960507267 -> 25890
    //   24360: goto -> 24364
    //   24363: athrow
    //   24364: invokevirtual getValue : ()Ljava/lang/Object;
    //   24367: goto -> 24371
    //   24370: athrow
    //   24371: checkcast java/lang/Boolean
    //   24374: getstatic Perryc.c : I
    //   24377: iflt -> 24391
    //   24380: ldc2_w -137885378
    //   24383: l2i
    //   24384: ldc_w 2122341393
    //   24387: ixor
    //   24388: goto -> 24399
    //   24391: ldc2_w 424505025
    //   24394: l2i
    //   24395: ldc_w -1981358468
    //   24398: ixor
    //   24399: ldc2_w -2096863172
    //   24402: l2i
    //   24403: ldc_w 1341490743
    //   24406: ixor
    //   24407: ixor
    //   24408: lookupswitch default -> 24436, 1169799972 -> 25904, 1540125046 -> 24391
    //   24436: goto -> 24440
    //   24439: athrow
    //   24440: invokevirtual booleanValue : ()Z
    //   24443: goto -> 24447
    //   24446: athrow
    //   24447: getstatic Perryc.1 : I
    //   24450: ifeq -> 24464
    //   24453: ldc2_w 236492002
    //   24456: l2i
    //   24457: ldc_w -1764997726
    //   24460: ixor
    //   24461: goto -> 24472
    //   24464: ldc2_w -953514760
    //   24467: l2i
    //   24468: ldc_w 233393202
    //   24471: ixor
    //   24472: ldc2_w -1574689439
    //   24475: l2i
    //   24476: ldc_w -211752998
    //   24479: ixor
    //   24480: ixor
    //   24481: lookupswitch default -> 24508, -913304581 -> 25636, -141841761 -> 24464
    //   24508: aload_0
    //   24509: getstatic Perryc.1 : I
    //   24512: ifeq -> 24526
    //   24515: ldc2_w -116699809
    //   24518: l2i
    //   24519: ldc_w -1667893091
    //   24522: ixor
    //   24523: goto -> 24534
    //   24526: ldc2_w 2048084723
    //   24529: l2i
    //   24530: ldc_w 504405731
    //   24533: ixor
    //   24534: ldc2_w -239160115
    //   24537: l2i
    //   24538: ldc_w -389841669
    //   24541: ixor
    //   24542: ixor
    //   24543: lookupswitch default -> 25672, 2095283700 -> 24526, 2105416742 -> 24568
    //   24568: getfield invertGradientBox : Lbigname/zprestige/webhack/features/setting/Setting;
    //   24571: getstatic Perryc.c : I
    //   24574: iflt -> 24588
    //   24577: ldc2_w -1001558375
    //   24580: l2i
    //   24581: ldc_w -60957910
    //   24584: ixor
    //   24585: goto -> 24596
    //   24588: ldc2_w 752317610
    //   24591: l2i
    //   24592: ldc_w 1202152627
    //   24595: ixor
    //   24596: ldc2_w -1849515847
    //   24599: l2i
    //   24600: ldc_w -1998766984
    //   24603: ixor
    //   24604: ixor
    //   24605: lookupswitch default -> 24632, -602054627 -> 24588, 554641778 -> 25852
    //   24632: goto -> 24636
    //   24635: athrow
    //   24636: invokevirtual getValue : ()Ljava/lang/Object;
    //   24639: goto -> 24643
    //   24642: athrow
    //   24643: checkcast java/lang/Boolean
    //   24646: getstatic Perryc.1 : I
    //   24649: ifeq -> 24663
    //   24652: ldc2_w -144681156
    //   24655: l2i
    //   24656: ldc_w -1325773768
    //   24659: ixor
    //   24660: goto -> 24671
    //   24663: ldc2_w -1120214442
    //   24666: l2i
    //   24667: ldc_w -401506331
    //   24670: ixor
    //   24671: ldc2_w 810040783
    //   24674: l2i
    //   24675: ldc_w -1596812655
    //   24678: ixor
    //   24679: ixor
    //   24680: lookupswitch default -> 25554, -978242835 -> 24708, -687819686 -> 24663
    //   24708: goto -> 24712
    //   24711: athrow
    //   24712: invokevirtual booleanValue : ()Z
    //   24715: goto -> 24719
    //   24718: athrow
    //   24719: getstatic Perryc.1 : I
    //   24722: ifeq -> 24736
    //   24725: ldc2_w 1377809026
    //   24728: l2i
    //   24729: ldc_w -1028652479
    //   24732: ixor
    //   24733: goto -> 24744
    //   24736: ldc2_w 265833977
    //   24739: l2i
    //   24740: ldc_w -1276476359
    //   24743: ixor
    //   24744: ldc2_w -1058708698
    //   24747: l2i
    //   24748: ldc_w 1248743064
    //   24751: ixor
    //   24752: ixor
    //   24753: lookupswitch default -> 25564, 438607229 -> 24736, 918152318 -> 24780
    //   24780: aload_0
    //   24781: getstatic Perryc.1 : I
    //   24784: ifeq -> 24798
    //   24787: ldc2_w 2053695587
    //   24790: l2i
    //   24791: ldc_w 518568153
    //   24794: ixor
    //   24795: goto -> 24806
    //   24798: ldc2_w 1951083132
    //   24801: l2i
    //   24802: ldc_w 1961039375
    //   24805: ixor
    //   24806: ldc2_w 892694194
    //   24809: l2i
    //   24810: ldc_w -507159321
    //   24813: ixor
    //   24814: ixor
    //   24815: lookupswitch default -> 24840, -1893378775 -> 24798, -1334811921 -> 25480
    //   24840: getfield invertGradientOutline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   24843: getstatic Perryc.0 : I
    //   24846: ifle -> 24860
    //   24849: ldc2_w -1776411891
    //   24852: l2i
    //   24853: ldc_w -2008762641
    //   24856: ixor
    //   24857: goto -> 24868
    //   24860: ldc2_w 1135979439
    //   24863: l2i
    //   24864: ldc_w 1591992221
    //   24867: ixor
    //   24868: ldc2_w -1432412953
    //   24871: l2i
    //   24872: ldc_w -2142408036
    //   24875: ixor
    //   24876: ixor
    //   24877: lookupswitch default -> 25864, 881378201 -> 24860, 931404361 -> 24904
    //   24904: goto -> 24908
    //   24907: athrow
    //   24908: invokevirtual getValue : ()Ljava/lang/Object;
    //   24911: goto -> 24915
    //   24914: athrow
    //   24915: checkcast java/lang/Boolean
    //   24918: getstatic Perryc.1 : I
    //   24921: ifeq -> 24935
    //   24924: ldc2_w -1541332032
    //   24927: l2i
    //   24928: ldc_w 864084874
    //   24931: ixor
    //   24932: goto -> 24943
    //   24935: ldc2_w 1236116980
    //   24938: l2i
    //   24939: ldc_w 777312680
    //   24942: ixor
    //   24943: ldc2_w 1788126392
    //   24946: l2i
    //   24947: ldc_w -2067481606
    //   24950: ixor
    //   24951: ixor
    //   24952: lookupswitch default -> 25492, -1985387746 -> 24980, 2045894408 -> 24935
    //   24980: goto -> 24984
    //   24983: athrow
    //   24984: invokevirtual booleanValue : ()Z
    //   24987: goto -> 24991
    //   24990: athrow
    //   24991: getstatic Perryc.c : I
    //   24994: iflt -> 25008
    //   24997: ldc2_w -1261928578
    //   25000: l2i
    //   25001: ldc_w -1732552716
    //   25004: ixor
    //   25005: goto -> 25016
    //   25008: ldc2_w -1867176462
    //   25011: l2i
    //   25012: ldc_w -1710682966
    //   25015: ixor
    //   25016: ldc2_w 1841412765
    //   25019: l2i
    //   25020: ldc_w 1492117287
    //   25023: ixor
    //   25024: ixor
    //   25025: lookupswitch default -> 25408, 425555248 -> 25008, 1066562786 -> 25052
    //   25052: aload_0
    //   25053: getstatic Perryc.0 : I
    //   25056: ifle -> 25070
    //   25059: ldc2_w -1803093473
    //   25062: l2i
    //   25063: ldc_w 2120957174
    //   25066: ixor
    //   25067: goto -> 25078
    //   25070: ldc2_w 1954838680
    //   25073: l2i
    //   25074: ldc_w 208128572
    //   25077: ixor
    //   25078: ldc2_w -1037143536
    //   25081: l2i
    //   25082: ldc_w 1552602012
    //   25085: ixor
    //   25086: ixor
    //   25087: lookupswitch default -> 25876, -431549656 -> 25112, 1950967653 -> 25070
    //   25112: getfield currentAlpha : I
    //   25115: getstatic Perryc.0 : I
    //   25118: ifle -> 25132
    //   25121: ldc2_w 1062528333
    //   25124: l2i
    //   25125: ldc_w -1432318124
    //   25128: ixor
    //   25129: goto -> 25140
    //   25132: ldc2_w 1025385210
    //   25135: l2i
    //   25136: ldc_w -2111557323
    //   25139: ixor
    //   25140: ldc2_w -1172175867
    //   25143: l2i
    //   25144: ldc_w -972905601
    //   25147: ixor
    //   25148: ixor
    //   25149: lookupswitch default -> 25176, -371929757 -> 25460, 1827814035 -> 25132
    //   25176: goto -> 25180
    //   25179: athrow
    //   25180: invokestatic drawBoxESP : (Lnet/minecraft/util/math/BlockPos;Ljava/awt/Color;ZLjava/awt/Color;FZZIZDZZZZI)V
    //   25183: goto -> 25187
    //   25186: athrow
    //   25187: iinc #5, -1
    //   25190: goto -> 3542
    //   25193: iinc #4, 1
    //   25196: goto -> 2554
    //   25199: iinc #3, 1
    //   25202: goto -> 1573
    //   25205: return
    //   25206: aconst_null
    //   25207: athrow
    //   25208: aconst_null
    //   25209: athrow
    //   25210: aconst_null
    //   25211: athrow
    //   25212: aconst_null
    //   25213: athrow
    //   25214: aconst_null
    //   25215: athrow
    //   25216: aconst_null
    //   25217: athrow
    //   25218: aconst_null
    //   25219: athrow
    //   25220: aconst_null
    //   25221: athrow
    //   25222: aconst_null
    //   25223: athrow
    //   25224: aconst_null
    //   25225: athrow
    //   25226: aconst_null
    //   25227: athrow
    //   25228: aconst_null
    //   25229: athrow
    //   25230: aconst_null
    //   25231: athrow
    //   25232: aconst_null
    //   25233: athrow
    //   25234: aconst_null
    //   25235: athrow
    //   25236: aconst_null
    //   25237: athrow
    //   25238: aconst_null
    //   25239: athrow
    //   25240: aconst_null
    //   25241: athrow
    //   25242: aconst_null
    //   25243: athrow
    //   25244: aconst_null
    //   25245: athrow
    //   25246: aconst_null
    //   25247: athrow
    //   25248: aconst_null
    //   25249: athrow
    //   25250: aconst_null
    //   25251: athrow
    //   25252: aconst_null
    //   25253: athrow
    //   25254: aconst_null
    //   25255: athrow
    //   25256: aconst_null
    //   25257: athrow
    //   25258: aconst_null
    //   25259: athrow
    //   25260: aconst_null
    //   25261: athrow
    //   25262: aconst_null
    //   25263: athrow
    //   25264: aconst_null
    //   25265: athrow
    //   25266: aconst_null
    //   25267: athrow
    //   25268: aconst_null
    //   25269: athrow
    //   25270: aconst_null
    //   25271: athrow
    //   25272: aconst_null
    //   25273: athrow
    //   25274: aconst_null
    //   25275: athrow
    //   25276: aconst_null
    //   25277: athrow
    //   25278: aconst_null
    //   25279: athrow
    //   25280: aconst_null
    //   25281: athrow
    //   25282: aconst_null
    //   25283: athrow
    //   25284: aconst_null
    //   25285: athrow
    //   25286: aconst_null
    //   25287: athrow
    //   25288: aconst_null
    //   25289: athrow
    //   25290: aconst_null
    //   25291: athrow
    //   25292: aconst_null
    //   25293: athrow
    //   25294: aconst_null
    //   25295: athrow
    //   25296: aconst_null
    //   25297: athrow
    //   25298: aconst_null
    //   25299: athrow
    //   25300: aconst_null
    //   25301: athrow
    //   25302: aconst_null
    //   25303: athrow
    //   25304: aconst_null
    //   25305: athrow
    //   25306: aconst_null
    //   25307: athrow
    //   25308: aconst_null
    //   25309: athrow
    //   25310: aconst_null
    //   25311: athrow
    //   25312: aconst_null
    //   25313: athrow
    //   25314: aconst_null
    //   25315: athrow
    //   25316: aconst_null
    //   25317: athrow
    //   25318: aconst_null
    //   25319: athrow
    //   25320: aconst_null
    //   25321: athrow
    //   25322: aconst_null
    //   25323: athrow
    //   25324: aconst_null
    //   25325: athrow
    //   25326: aconst_null
    //   25327: athrow
    //   25328: aconst_null
    //   25329: athrow
    //   25330: aconst_null
    //   25331: athrow
    //   25332: aconst_null
    //   25333: athrow
    //   25334: aconst_null
    //   25335: athrow
    //   25336: aconst_null
    //   25337: athrow
    //   25338: aconst_null
    //   25339: athrow
    //   25340: aconst_null
    //   25341: athrow
    //   25342: aconst_null
    //   25343: athrow
    //   25344: aconst_null
    //   25345: athrow
    //   25346: aconst_null
    //   25347: athrow
    //   25348: aconst_null
    //   25349: athrow
    //   25350: aconst_null
    //   25351: athrow
    //   25352: aconst_null
    //   25353: athrow
    //   25354: aconst_null
    //   25355: athrow
    //   25356: aconst_null
    //   25357: athrow
    //   25358: aconst_null
    //   25359: athrow
    //   25360: aconst_null
    //   25361: athrow
    //   25362: aconst_null
    //   25363: athrow
    //   25364: aconst_null
    //   25365: athrow
    //   25366: aconst_null
    //   25367: athrow
    //   25368: aconst_null
    //   25369: athrow
    //   25370: aconst_null
    //   25371: athrow
    //   25372: aconst_null
    //   25373: athrow
    //   25374: aconst_null
    //   25375: athrow
    //   25376: aconst_null
    //   25377: athrow
    //   25378: aconst_null
    //   25379: athrow
    //   25380: aconst_null
    //   25381: athrow
    //   25382: aconst_null
    //   25383: athrow
    //   25384: aconst_null
    //   25385: athrow
    //   25386: aconst_null
    //   25387: athrow
    //   25388: aconst_null
    //   25389: athrow
    //   25390: aconst_null
    //   25391: athrow
    //   25392: aconst_null
    //   25393: athrow
    //   25394: aconst_null
    //   25395: athrow
    //   25396: aconst_null
    //   25397: athrow
    //   25398: aconst_null
    //   25399: athrow
    //   25400: aconst_null
    //   25401: athrow
    //   25402: aconst_null
    //   25403: athrow
    //   25404: aconst_null
    //   25405: athrow
    //   25406: aconst_null
    //   25407: athrow
    //   25408: aconst_null
    //   25409: athrow
    //   25410: aconst_null
    //   25411: athrow
    //   25412: aconst_null
    //   25413: athrow
    //   25414: aconst_null
    //   25415: athrow
    //   25416: aconst_null
    //   25417: athrow
    //   25418: aconst_null
    //   25419: athrow
    //   25420: aconst_null
    //   25421: athrow
    //   25422: aconst_null
    //   25423: athrow
    //   25424: aconst_null
    //   25425: athrow
    //   25426: aconst_null
    //   25427: athrow
    //   25428: aconst_null
    //   25429: athrow
    //   25430: aconst_null
    //   25431: athrow
    //   25432: aconst_null
    //   25433: athrow
    //   25434: aconst_null
    //   25435: athrow
    //   25436: aconst_null
    //   25437: athrow
    //   25438: aconst_null
    //   25439: athrow
    //   25440: aconst_null
    //   25441: athrow
    //   25442: aconst_null
    //   25443: athrow
    //   25444: aconst_null
    //   25445: athrow
    //   25446: aconst_null
    //   25447: athrow
    //   25448: aconst_null
    //   25449: athrow
    //   25450: aconst_null
    //   25451: athrow
    //   25452: aconst_null
    //   25453: athrow
    //   25454: aconst_null
    //   25455: athrow
    //   25456: aconst_null
    //   25457: athrow
    //   25458: aconst_null
    //   25459: athrow
    //   25460: aconst_null
    //   25461: athrow
    //   25462: aconst_null
    //   25463: athrow
    //   25464: aconst_null
    //   25465: athrow
    //   25466: aconst_null
    //   25467: athrow
    //   25468: aconst_null
    //   25469: athrow
    //   25470: aconst_null
    //   25471: athrow
    //   25472: aconst_null
    //   25473: athrow
    //   25474: aconst_null
    //   25475: athrow
    //   25476: aconst_null
    //   25477: athrow
    //   25478: aconst_null
    //   25479: athrow
    //   25480: aconst_null
    //   25481: athrow
    //   25482: aconst_null
    //   25483: athrow
    //   25484: aconst_null
    //   25485: athrow
    //   25486: aconst_null
    //   25487: athrow
    //   25488: aconst_null
    //   25489: athrow
    //   25490: aconst_null
    //   25491: athrow
    //   25492: aconst_null
    //   25493: athrow
    //   25494: aconst_null
    //   25495: athrow
    //   25496: aconst_null
    //   25497: athrow
    //   25498: aconst_null
    //   25499: athrow
    //   25500: aconst_null
    //   25501: athrow
    //   25502: aconst_null
    //   25503: athrow
    //   25504: aconst_null
    //   25505: athrow
    //   25506: aconst_null
    //   25507: athrow
    //   25508: aconst_null
    //   25509: athrow
    //   25510: aconst_null
    //   25511: athrow
    //   25512: aconst_null
    //   25513: athrow
    //   25514: aconst_null
    //   25515: athrow
    //   25516: aconst_null
    //   25517: athrow
    //   25518: aconst_null
    //   25519: athrow
    //   25520: aconst_null
    //   25521: athrow
    //   25522: aconst_null
    //   25523: athrow
    //   25524: aconst_null
    //   25525: athrow
    //   25526: aconst_null
    //   25527: athrow
    //   25528: aconst_null
    //   25529: athrow
    //   25530: aconst_null
    //   25531: athrow
    //   25532: aconst_null
    //   25533: athrow
    //   25534: aconst_null
    //   25535: athrow
    //   25536: aconst_null
    //   25537: athrow
    //   25538: aconst_null
    //   25539: athrow
    //   25540: aconst_null
    //   25541: athrow
    //   25542: aconst_null
    //   25543: athrow
    //   25544: aconst_null
    //   25545: athrow
    //   25546: aconst_null
    //   25547: athrow
    //   25548: aconst_null
    //   25549: athrow
    //   25550: aconst_null
    //   25551: athrow
    //   25552: aconst_null
    //   25553: athrow
    //   25554: aconst_null
    //   25555: athrow
    //   25556: aconst_null
    //   25557: athrow
    //   25558: aconst_null
    //   25559: athrow
    //   25560: aconst_null
    //   25561: athrow
    //   25562: aconst_null
    //   25563: athrow
    //   25564: aconst_null
    //   25565: athrow
    //   25566: aconst_null
    //   25567: athrow
    //   25568: aconst_null
    //   25569: athrow
    //   25570: aconst_null
    //   25571: athrow
    //   25572: aconst_null
    //   25573: athrow
    //   25574: aconst_null
    //   25575: athrow
    //   25576: aconst_null
    //   25577: athrow
    //   25578: aconst_null
    //   25579: athrow
    //   25580: aconst_null
    //   25581: athrow
    //   25582: aconst_null
    //   25583: athrow
    //   25584: aconst_null
    //   25585: athrow
    //   25586: aconst_null
    //   25587: athrow
    //   25588: aconst_null
    //   25589: athrow
    //   25590: aconst_null
    //   25591: athrow
    //   25592: aconst_null
    //   25593: athrow
    //   25594: aconst_null
    //   25595: athrow
    //   25596: aconst_null
    //   25597: athrow
    //   25598: aconst_null
    //   25599: athrow
    //   25600: aconst_null
    //   25601: athrow
    //   25602: aconst_null
    //   25603: athrow
    //   25604: aconst_null
    //   25605: athrow
    //   25606: aconst_null
    //   25607: athrow
    //   25608: aconst_null
    //   25609: athrow
    //   25610: aconst_null
    //   25611: athrow
    //   25612: aconst_null
    //   25613: athrow
    //   25614: aconst_null
    //   25615: athrow
    //   25616: aconst_null
    //   25617: athrow
    //   25618: aconst_null
    //   25619: athrow
    //   25620: aconst_null
    //   25621: athrow
    //   25622: aconst_null
    //   25623: athrow
    //   25624: aconst_null
    //   25625: athrow
    //   25626: aconst_null
    //   25627: athrow
    //   25628: aconst_null
    //   25629: athrow
    //   25630: aconst_null
    //   25631: athrow
    //   25632: aconst_null
    //   25633: athrow
    //   25634: aconst_null
    //   25635: athrow
    //   25636: aconst_null
    //   25637: athrow
    //   25638: aconst_null
    //   25639: athrow
    //   25640: aconst_null
    //   25641: athrow
    //   25642: aconst_null
    //   25643: athrow
    //   25644: aconst_null
    //   25645: athrow
    //   25646: aconst_null
    //   25647: athrow
    //   25648: aconst_null
    //   25649: athrow
    //   25650: aconst_null
    //   25651: athrow
    //   25652: aconst_null
    //   25653: athrow
    //   25654: aconst_null
    //   25655: athrow
    //   25656: aconst_null
    //   25657: athrow
    //   25658: aconst_null
    //   25659: athrow
    //   25660: aconst_null
    //   25661: athrow
    //   25662: aconst_null
    //   25663: athrow
    //   25664: aconst_null
    //   25665: athrow
    //   25666: aconst_null
    //   25667: athrow
    //   25668: aconst_null
    //   25669: athrow
    //   25670: aconst_null
    //   25671: athrow
    //   25672: aconst_null
    //   25673: athrow
    //   25674: aconst_null
    //   25675: athrow
    //   25676: aconst_null
    //   25677: athrow
    //   25678: aconst_null
    //   25679: athrow
    //   25680: aconst_null
    //   25681: athrow
    //   25682: aconst_null
    //   25683: athrow
    //   25684: aconst_null
    //   25685: athrow
    //   25686: aconst_null
    //   25687: athrow
    //   25688: aconst_null
    //   25689: athrow
    //   25690: aconst_null
    //   25691: athrow
    //   25692: aconst_null
    //   25693: athrow
    //   25694: aconst_null
    //   25695: athrow
    //   25696: aconst_null
    //   25697: athrow
    //   25698: aconst_null
    //   25699: athrow
    //   25700: aconst_null
    //   25701: athrow
    //   25702: aconst_null
    //   25703: athrow
    //   25704: aconst_null
    //   25705: athrow
    //   25706: aconst_null
    //   25707: athrow
    //   25708: aconst_null
    //   25709: athrow
    //   25710: aconst_null
    //   25711: athrow
    //   25712: aconst_null
    //   25713: athrow
    //   25714: aconst_null
    //   25715: athrow
    //   25716: aconst_null
    //   25717: athrow
    //   25718: aconst_null
    //   25719: athrow
    //   25720: aconst_null
    //   25721: athrow
    //   25722: aconst_null
    //   25723: athrow
    //   25724: aconst_null
    //   25725: athrow
    //   25726: aconst_null
    //   25727: athrow
    //   25728: aconst_null
    //   25729: athrow
    //   25730: aconst_null
    //   25731: athrow
    //   25732: aconst_null
    //   25733: athrow
    //   25734: aconst_null
    //   25735: athrow
    //   25736: aconst_null
    //   25737: athrow
    //   25738: aconst_null
    //   25739: athrow
    //   25740: aconst_null
    //   25741: athrow
    //   25742: aconst_null
    //   25743: athrow
    //   25744: aconst_null
    //   25745: athrow
    //   25746: aconst_null
    //   25747: athrow
    //   25748: aconst_null
    //   25749: athrow
    //   25750: aconst_null
    //   25751: athrow
    //   25752: aconst_null
    //   25753: athrow
    //   25754: aconst_null
    //   25755: athrow
    //   25756: aconst_null
    //   25757: athrow
    //   25758: aconst_null
    //   25759: athrow
    //   25760: aconst_null
    //   25761: athrow
    //   25762: aconst_null
    //   25763: athrow
    //   25764: aconst_null
    //   25765: athrow
    //   25766: aconst_null
    //   25767: athrow
    //   25768: aconst_null
    //   25769: athrow
    //   25770: aconst_null
    //   25771: athrow
    //   25772: aconst_null
    //   25773: athrow
    //   25774: aconst_null
    //   25775: athrow
    //   25776: aconst_null
    //   25777: athrow
    //   25778: aconst_null
    //   25779: athrow
    //   25780: aconst_null
    //   25781: athrow
    //   25782: aconst_null
    //   25783: athrow
    //   25784: aconst_null
    //   25785: athrow
    //   25786: aconst_null
    //   25787: athrow
    //   25788: aconst_null
    //   25789: athrow
    //   25790: aconst_null
    //   25791: athrow
    //   25792: aconst_null
    //   25793: athrow
    //   25794: aconst_null
    //   25795: athrow
    //   25796: aconst_null
    //   25797: athrow
    //   25798: aconst_null
    //   25799: athrow
    //   25800: aconst_null
    //   25801: athrow
    //   25802: aconst_null
    //   25803: athrow
    //   25804: aconst_null
    //   25805: athrow
    //   25806: aconst_null
    //   25807: athrow
    //   25808: aconst_null
    //   25809: athrow
    //   25810: aconst_null
    //   25811: athrow
    //   25812: aconst_null
    //   25813: athrow
    //   25814: aconst_null
    //   25815: athrow
    //   25816: aconst_null
    //   25817: athrow
    //   25818: aconst_null
    //   25819: athrow
    //   25820: aconst_null
    //   25821: athrow
    //   25822: aconst_null
    //   25823: athrow
    //   25824: aconst_null
    //   25825: athrow
    //   25826: aconst_null
    //   25827: athrow
    //   25828: aconst_null
    //   25829: athrow
    //   25830: aconst_null
    //   25831: athrow
    //   25832: aconst_null
    //   25833: athrow
    //   25834: aconst_null
    //   25835: athrow
    //   25836: aconst_null
    //   25837: athrow
    //   25838: aconst_null
    //   25839: athrow
    //   25840: aconst_null
    //   25841: athrow
    //   25842: aconst_null
    //   25843: athrow
    //   25844: aconst_null
    //   25845: athrow
    //   25846: aconst_null
    //   25847: athrow
    //   25848: aconst_null
    //   25849: athrow
    //   25850: aconst_null
    //   25851: athrow
    //   25852: aconst_null
    //   25853: athrow
    //   25854: aconst_null
    //   25855: athrow
    //   25856: aconst_null
    //   25857: athrow
    //   25858: aconst_null
    //   25859: athrow
    //   25860: aconst_null
    //   25861: athrow
    //   25862: aconst_null
    //   25863: athrow
    //   25864: aconst_null
    //   25865: athrow
    //   25866: aconst_null
    //   25867: athrow
    //   25868: aconst_null
    //   25869: athrow
    //   25870: aconst_null
    //   25871: athrow
    //   25872: aconst_null
    //   25873: athrow
    //   25874: aconst_null
    //   25875: athrow
    //   25876: aconst_null
    //   25877: athrow
    //   25878: aconst_null
    //   25879: athrow
    //   25880: aconst_null
    //   25881: athrow
    //   25882: aconst_null
    //   25883: athrow
    //   25884: aconst_null
    //   25885: athrow
    //   25886: aconst_null
    //   25887: athrow
    //   25888: aconst_null
    //   25889: athrow
    //   25890: aconst_null
    //   25891: athrow
    //   25892: aconst_null
    //   25893: athrow
    //   25894: aconst_null
    //   25895: athrow
    //   25896: aconst_null
    //   25897: athrow
    //   25898: aconst_null
    //   25899: athrow
    //   25900: aconst_null
    //   25901: athrow
    //   25902: aconst_null
    //   25903: athrow
    //   25904: aconst_null
    //   25905: athrow
    //   25906: aconst_null
    //   25907: athrow
    //   25908: aconst_null
    //   25909: athrow
    //   25910: pop
    //   25911: goto -> 24
    //   25914: pop
    //   25915: aconst_null
    //   25916: goto -> 25910
    //   25919: dup
    //   25920: ifnull -> 25910
    //   25923: checkcast java/lang/Throwable
    //   25926: athrow
    //   25927: dup
    //   25928: ifnull -> 25914
    //   25931: checkcast java/lang/Throwable
    //   25934: athrow
    //   25935: aconst_null
    //   25936: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   4390	20797	6	pos	Lnet/minecraft/util/math/BlockPos;
    //   3542	21651	5	y	I
    //   2554	22645	4	z	I
    //   1573	23632	3	x	I
    //   24	25182	0	this	Lbigname/zprestige/webhack/features/modules/Render/HoleESP;
    //   24	25182	1	event	Lbigname/zprestige/webhack/event/events/Render3DEvent;
    //   1109	24097	2	playerPos	Lnet/minecraft/util/math/Vec3i;
    // Exception table:
    //   from	to	target	type
    //   8	20	25919	java/lang/NegativeArraySizeException
    //   387	394	394	finally
    //   387	394	394	java/lang/UnsupportedOperationException
    //   388	394	394	finally
    //   388	394	387	java/lang/IndexOutOfBoundsException
    //   388	394	387	finally
    //   1039	1046	1046	finally
    //   1039	1046	3	finally
    //   1040	1046	1046	java/lang/NumberFormatException
    //   1040	1046	3	finally
    //   1040	1046	1039	java/lang/EnumConstantNotPresentException
    //   1231	1238	1238	finally
    //   1231	1238	1238	finally
    //   1232	1238	1238	finally
    //   1232	1238	3	java/lang/ArrayIndexOutOfBoundsException
    //   1232	1238	1231	finally
    //   1427	1434	1434	finally
    //   1427	1434	1427	java/lang/ClassCastException
    //   1427	1434	1434	finally
    //   1428	1434	1427	finally
    //   1428	1434	1434	java/lang/IllegalArgumentException
    //   1504	1510	1510	finally
    //   1504	1510	1510	finally
    //   1504	1510	3	java/lang/ClassCastException
    //   1504	1510	1510	java/lang/ArithmeticException
    //   1504	1510	1510	java/lang/NumberFormatException
    //   1755	1762	1762	finally
    //   1755	1762	3	finally
    //   1755	1762	1755	java/lang/UnsupportedOperationException
    //   1756	1762	1755	finally
    //   1756	1762	3	finally
    //   1952	1958	1958	finally
    //   1952	1958	3	finally
    //   1952	1958	1958	java/lang/NegativeArraySizeException
    //   1952	1958	1958	finally
    //   1952	1958	3	finally
    //   2027	2034	2034	finally
    //   2027	2034	2034	java/lang/RuntimeException
    //   2027	2034	2027	java/lang/RuntimeException
    //   2028	2034	2034	java/lang/NumberFormatException
    //   2028	2034	2034	java/lang/EnumConstantNotPresentException
    //   2211	2218	2218	finally
    //   2211	2218	2211	java/util/ConcurrentModificationException
    //   2212	2218	2218	java/lang/StringIndexOutOfBoundsException
    //   2212	2218	2218	finally
    //   2212	2218	3	java/lang/ArithmeticException
    //   2407	2414	2414	finally
    //   2407	2414	2414	java/lang/NegativeArraySizeException
    //   2407	2414	2414	finally
    //   2408	2414	2407	java/lang/StringIndexOutOfBoundsException
    //   2408	2414	2407	finally
    //   2483	2490	2490	finally
    //   2484	2490	2483	java/lang/ClassCastException
    //   2484	2490	3	java/lang/NullPointerException
    //   2484	2490	3	java/util/ConcurrentModificationException
    //   2484	2490	3	java/lang/ClassCastException
    //   2743	2750	2750	finally
    //   2743	2750	2750	finally
    //   2744	2750	2750	finally
    //   2744	2750	2743	java/lang/EnumConstantNotPresentException
    //   2744	2750	2743	java/lang/UnsupportedOperationException
    //   2939	2946	2946	finally
    //   2939	2946	2939	java/lang/IllegalStateException
    //   2939	2946	3	java/lang/NegativeArraySizeException
    //   2939	2946	2939	java/lang/NullPointerException
    //   2940	2946	2946	java/lang/NumberFormatException
    //   3015	3022	3022	finally
    //   3015	3022	3015	finally
    //   3016	3022	3	finally
    //   3016	3022	3015	java/lang/ArithmeticException
    //   3016	3022	3015	java/lang/NumberFormatException
    //   3200	3206	3206	finally
    //   3200	3206	3206	finally
    //   3200	3206	3206	java/util/ConcurrentModificationException
    //   3200	3206	3206	finally
    //   3200	3206	3	finally
    //   3395	3402	3402	finally
    //   3395	3402	3395	finally
    //   3396	3402	3402	java/lang/ArithmeticException
    //   3396	3402	3402	java/lang/ArrayIndexOutOfBoundsException
    //   3396	3402	3402	finally
    //   3471	3478	3478	finally
    //   3471	3478	3471	finally
    //   3471	3478	3	finally
    //   3471	3478	3	java/lang/IllegalArgumentException
    //   3472	3478	3471	java/util/ConcurrentModificationException
    //   3732	3738	3738	finally
    //   3732	3738	3738	java/lang/AssertionError
    //   3732	3738	3738	finally
    //   3732	3738	3	java/lang/IndexOutOfBoundsException
    //   3732	3738	3738	finally
    //   3927	3934	3934	finally
    //   3927	3934	3	java/lang/AssertionError
    //   3927	3934	3927	finally
    //   3927	3934	3	finally
    //   3928	3934	3927	finally
    //   4003	4010	4010	finally
    //   4003	4010	4010	java/lang/ClassCastException
    //   4004	4010	4010	java/lang/NegativeArraySizeException
    //   4004	4010	4003	finally
    //   4004	4010	4003	java/lang/IllegalStateException
    //   4319	4326	4326	finally
    //   4319	4326	4319	java/lang/NumberFormatException
    //   4319	4326	3	finally
    //   4319	4326	3	finally
    //   4320	4326	4319	java/lang/NullPointerException
    //   4647	4654	4654	finally
    //   4647	4654	3	finally
    //   4647	4654	4647	java/lang/ArithmeticException
    //   4647	4654	4654	java/lang/IllegalStateException
    //   4648	4654	4647	finally
    //   4719	4728	4728	finally
    //   4719	4728	3	finally
    //   4719	4728	4719	finally
    //   4719	4728	4728	finally
    //   4720	4728	4719	java/lang/ArithmeticException
    //   4855	4862	4862	finally
    //   4855	4862	3	java/lang/NegativeArraySizeException
    //   4856	4862	4862	finally
    //   4856	4862	4862	java/lang/RuntimeException
    //   4856	4862	4855	java/lang/NumberFormatException
    //   5195	5202	5202	finally
    //   5195	5202	5202	finally
    //   5195	5202	3	finally
    //   5195	5202	5195	java/lang/StringIndexOutOfBoundsException
    //   5195	5202	3	finally
    //   5267	5274	5274	finally
    //   5267	5274	3	finally
    //   5267	5274	5274	java/lang/NullPointerException
    //   5267	5274	5274	java/lang/RuntimeException
    //   5268	5274	5267	java/lang/AssertionError
    //   5339	5348	5348	finally
    //   5339	5348	3	java/lang/ArrayIndexOutOfBoundsException
    //   5340	5348	5339	java/util/ConcurrentModificationException
    //   5340	5348	3	finally
    //   5340	5348	5348	finally
    //   5476	5482	5482	finally
    //   5476	5482	5482	java/lang/NegativeArraySizeException
    //   5476	5482	5482	java/lang/NullPointerException
    //   5476	5482	5482	java/lang/IllegalStateException
    //   5476	5482	3	finally
    //   5815	5822	5822	finally
    //   5815	5822	3	java/lang/ArithmeticException
    //   5816	5822	3	java/lang/IllegalArgumentException
    //   5816	5822	5815	java/lang/ArrayIndexOutOfBoundsException
    //   5816	5822	5822	finally
    //   5887	5894	5894	finally
    //   5887	5894	3	finally
    //   5887	5894	5894	finally
    //   5888	5894	5887	java/lang/AssertionError
    //   5888	5894	3	finally
    //   5959	5968	5968	finally
    //   5959	5968	3	finally
    //   5959	5968	5968	finally
    //   5960	5968	3	finally
    //   5960	5968	5959	finally
    //   6095	6102	6102	finally
    //   6095	6102	3	finally
    //   6095	6102	6095	finally
    //   6096	6102	6102	java/lang/ArithmeticException
    //   6096	6102	6102	java/lang/RuntimeException
    //   6863	6870	6870	finally
    //   6863	6870	6870	java/lang/ArithmeticException
    //   6863	6870	6870	finally
    //   6864	6870	6870	finally
    //   6864	6870	6863	java/lang/EnumConstantNotPresentException
    //   6935	6942	6942	finally
    //   6935	6942	6935	java/util/NoSuchElementException
    //   6936	6942	6935	java/lang/ArithmeticException
    //   6936	6942	3	java/lang/IllegalArgumentException
    //   6936	6942	6942	finally
    //   7183	7190	7190	finally
    //   7183	7190	3	java/lang/ArithmeticException
    //   7183	7190	7183	java/util/NoSuchElementException
    //   7183	7190	7183	java/lang/RuntimeException
    //   7184	7190	3	java/lang/ArithmeticException
    //   7259	7266	7266	finally
    //   7259	7266	7259	finally
    //   7259	7266	7266	java/util/NoSuchElementException
    //   7260	7266	7259	finally
    //   7260	7266	7259	finally
    //   7447	7454	7454	finally
    //   7447	7454	7454	finally
    //   7447	7454	7454	finally
    //   7447	7454	3	java/lang/NullPointerException
    //   7448	7454	7447	finally
    //   7519	7526	7526	finally
    //   7519	7526	7519	java/lang/NullPointerException
    //   7520	7526	7526	finally
    //   7520	7526	7526	java/util/NoSuchElementException
    //   7520	7526	7526	java/lang/ClassCastException
    //   7767	7774	7774	finally
    //   7767	7774	7774	java/lang/NegativeArraySizeException
    //   7767	7774	7767	finally
    //   7767	7774	7767	finally
    //   7768	7774	7774	java/lang/IllegalStateException
    //   7843	7850	7850	finally
    //   7843	7850	3	java/lang/IndexOutOfBoundsException
    //   7843	7850	3	finally
    //   7843	7850	7843	finally
    //   7844	7850	7843	finally
    //   8159	8166	8166	finally
    //   8159	8166	3	java/lang/NegativeArraySizeException
    //   8159	8166	8159	finally
    //   8159	8166	3	finally
    //   8160	8166	8166	finally
    //   8231	8238	8238	finally
    //   8231	8238	3	java/lang/RuntimeException
    //   8231	8238	3	java/lang/NegativeArraySizeException
    //   8232	8238	8231	java/util/NoSuchElementException
    //   8232	8238	8238	finally
    //   8304	8312	8312	finally
    //   8304	8312	8312	java/lang/IllegalStateException
    //   8304	8312	3	java/lang/EnumConstantNotPresentException
    //   8304	8312	8312	finally
    //   8304	8312	3	java/lang/StringIndexOutOfBoundsException
    //   8683	8690	8690	finally
    //   8683	8690	8683	java/lang/EnumConstantNotPresentException
    //   8683	8690	8683	finally
    //   8683	8690	8683	finally
    //   8684	8690	8683	finally
    //   8755	8762	8762	finally
    //   8755	8762	8762	finally
    //   8756	8762	8755	finally
    //   8756	8762	8762	finally
    //   8756	8762	8755	java/lang/ArithmeticException
    //   8827	8836	8836	finally
    //   8827	8836	8836	java/util/ConcurrentModificationException
    //   8827	8836	8827	finally
    //   8827	8836	8836	finally
    //   8827	8836	8827	java/lang/StringIndexOutOfBoundsException
    //   9207	9214	9214	finally
    //   9207	9214	3	java/lang/NegativeArraySizeException
    //   9207	9214	9207	java/lang/IndexOutOfBoundsException
    //   9208	9214	9214	java/lang/IllegalStateException
    //   9208	9214	3	finally
    //   9279	9286	9286	finally
    //   9279	9286	9279	finally
    //   9279	9286	9279	java/lang/IllegalArgumentException
    //   9279	9286	3	finally
    //   9280	9286	9286	java/lang/AssertionError
    //   9352	9360	9360	finally
    //   9352	9360	9360	java/util/ConcurrentModificationException
    //   9352	9360	3	java/lang/IndexOutOfBoundsException
    //   9352	9360	9360	java/lang/AssertionError
    //   9352	9360	3	java/lang/ArrayIndexOutOfBoundsException
    //   9731	9738	9738	finally
    //   9731	9738	3	java/lang/EnumConstantNotPresentException
    //   9731	9738	9738	finally
    //   9732	9738	9738	java/lang/UnsupportedOperationException
    //   9732	9738	9731	finally
    //   9803	9810	9810	finally
    //   9803	9810	9803	java/lang/NegativeArraySizeException
    //   9803	9810	3	java/lang/IndexOutOfBoundsException
    //   9804	9810	9803	finally
    //   9804	9810	9803	finally
    //   9876	9884	9884	finally
    //   9876	9884	9884	finally
    //   9876	9884	3	java/lang/ArrayIndexOutOfBoundsException
    //   9876	9884	3	finally
    //   9876	9884	3	java/lang/IndexOutOfBoundsException
    //   10255	10262	10262	finally
    //   10255	10262	10262	java/lang/AssertionError
    //   10255	10262	10255	finally
    //   10256	10262	10255	java/util/NoSuchElementException
    //   10256	10262	10255	finally
    //   10328	10334	10334	finally
    //   10328	10334	3	finally
    //   10328	10334	10334	java/lang/UnsupportedOperationException
    //   10328	10334	3	finally
    //   10328	10334	10334	finally
    //   10399	10408	10408	finally
    //   10399	10408	10399	finally
    //   10399	10408	3	java/lang/NullPointerException
    //   10399	10408	3	java/lang/RuntimeException
    //   10400	10408	10408	finally
    //   10775	10782	10782	finally
    //   10775	10782	10775	finally
    //   10775	10782	3	finally
    //   10775	10782	10775	finally
    //   10776	10782	3	java/lang/IllegalArgumentException
    //   10851	10858	10858	finally
    //   10851	10858	10858	finally
    //   10852	10858	10858	finally
    //   10852	10858	10851	finally
    //   10852	10858	10851	java/lang/ArithmeticException
    //   10975	10982	10982	finally
    //   10975	10982	10975	finally
    //   10975	10982	3	finally
    //   10976	10982	10975	java/util/ConcurrentModificationException
    //   10976	10982	10982	java/lang/ArithmeticException
    //   11111	11118	11118	finally
    //   11111	11118	11118	finally
    //   11112	11118	11111	java/util/ConcurrentModificationException
    //   11112	11118	3	finally
    //   11112	11118	3	java/lang/EnumConstantNotPresentException
    //   11187	11194	11194	finally
    //   11187	11194	3	java/lang/UnsupportedOperationException
    //   11187	11194	3	java/lang/RuntimeException
    //   11188	11194	11187	java/lang/NegativeArraySizeException
    //   11188	11194	3	finally
    //   11259	11266	11266	finally
    //   11260	11266	11259	java/lang/RuntimeException
    //   11260	11266	3	finally
    //   11260	11266	3	finally
    //   11260	11266	11266	finally
    //   11464	11470	11470	finally
    //   11464	11470	11470	finally
    //   11464	11470	3	finally
    //   11464	11470	3	finally
    //   11464	11470	3	java/lang/IndexOutOfBoundsException
    //   11539	11546	11546	finally
    //   11539	11546	3	finally
    //   11539	11546	3	java/lang/IndexOutOfBoundsException
    //   11540	11546	11539	finally
    //   11540	11546	3	java/lang/UnsupportedOperationException
    //   11735	11742	11742	finally
    //   11735	11742	11742	java/lang/NegativeArraySizeException
    //   11735	11742	3	finally
    //   11736	11742	11735	java/lang/IndexOutOfBoundsException
    //   11736	11742	11735	java/lang/NullPointerException
    //   11811	11818	11818	finally
    //   11811	11818	11818	java/lang/NumberFormatException
    //   11812	11818	11811	java/lang/ArithmeticException
    //   11812	11818	11818	finally
    //   11812	11818	3	java/lang/StringIndexOutOfBoundsException
    //   12007	12014	12014	finally
    //   12007	12014	12007	java/lang/EnumConstantNotPresentException
    //   12008	12014	3	finally
    //   12008	12014	12014	java/lang/NumberFormatException
    //   12008	12014	12014	java/lang/RuntimeException
    //   12083	12090	12090	finally
    //   12083	12090	12083	java/lang/ClassCastException
    //   12083	12090	3	finally
    //   12083	12090	3	java/util/NoSuchElementException
    //   12084	12090	12090	finally
    //   12279	12286	12286	finally
    //   12279	12286	12286	finally
    //   12279	12286	3	finally
    //   12279	12286	3	finally
    //   12280	12286	12279	finally
    //   12355	12362	12362	finally
    //   12355	12362	3	finally
    //   12356	12362	12355	finally
    //   12356	12362	12362	java/lang/IllegalStateException
    //   12356	12362	12362	java/lang/StringIndexOutOfBoundsException
    //   12428	12434	12434	finally
    //   12428	12434	12434	finally
    //   12428	12434	3	finally
    //   12428	12434	12434	finally
    //   12428	12434	12434	finally
    //   12623	12630	12630	finally
    //   12623	12630	12623	java/lang/ArithmeticException
    //   12623	12630	12630	java/lang/IllegalStateException
    //   12624	12630	12623	finally
    //   12624	12630	12630	java/lang/IllegalArgumentException
    //   12700	12706	12706	finally
    //   12700	12706	12706	finally
    //   12700	12706	3	java/lang/EnumConstantNotPresentException
    //   12700	12706	3	java/lang/EnumConstantNotPresentException
    //   12700	12706	3	finally
    //   12900	12906	12906	finally
    //   12900	12906	3	java/lang/AssertionError
    //   12900	12906	3	finally
    //   12900	12906	12906	finally
    //   12900	12906	12906	java/lang/RuntimeException
    //   12975	12982	12982	finally
    //   12975	12982	12975	finally
    //   12975	12982	3	java/lang/IndexOutOfBoundsException
    //   12975	12982	12982	finally
    //   12976	12982	3	finally
    //   13171	13178	13178	finally
    //   13171	13178	13178	java/util/ConcurrentModificationException
    //   13171	13178	13178	java/lang/IndexOutOfBoundsException
    //   13172	13178	13171	finally
    //   13172	13178	13171	finally
    //   13247	13254	13254	finally
    //   13247	13254	13247	finally
    //   13247	13254	3	finally
    //   13247	13254	13254	java/lang/ArithmeticException
    //   13248	13254	3	finally
    //   13443	13450	13450	finally
    //   13443	13450	13443	java/lang/IndexOutOfBoundsException
    //   13443	13450	13443	finally
    //   13443	13450	3	finally
    //   13444	13450	13450	finally
    //   13519	13526	13526	finally
    //   13519	13526	13526	finally
    //   13519	13526	13526	finally
    //   13520	13526	13519	java/lang/StringIndexOutOfBoundsException
    //   13520	13526	3	java/util/ConcurrentModificationException
    //   13715	13722	13722	finally
    //   13715	13722	3	java/lang/NumberFormatException
    //   13715	13722	3	finally
    //   13715	13722	13715	java/lang/StringIndexOutOfBoundsException
    //   13716	13722	13722	java/lang/UnsupportedOperationException
    //   13792	13798	13798	finally
    //   13792	13798	3	finally
    //   13792	13798	3	java/lang/EnumConstantNotPresentException
    //   13792	13798	13798	java/lang/IllegalStateException
    //   13792	13798	13798	finally
    //   13863	13870	13870	finally
    //   13863	13870	13870	finally
    //   13863	13870	13863	java/lang/StringIndexOutOfBoundsException
    //   13863	13870	3	finally
    //   13864	13870	3	java/lang/NegativeArraySizeException
    //   14060	14066	14066	finally
    //   14060	14066	3	java/lang/IllegalArgumentException
    //   14060	14066	3	java/lang/IllegalStateException
    //   14060	14066	14066	java/lang/IllegalArgumentException
    //   14060	14066	14066	finally
    //   14135	14142	14142	finally
    //   14135	14142	14135	java/lang/RuntimeException
    //   14135	14142	14135	java/lang/NullPointerException
    //   14135	14142	14142	java/lang/UnsupportedOperationException
    //   14136	14142	14135	finally
    //   14331	14338	14338	finally
    //   14331	14338	14331	finally
    //   14332	14338	14331	finally
    //   14332	14338	14338	finally
    //   14332	14338	14338	finally
    //   14407	14414	14414	finally
    //   14407	14414	14414	finally
    //   14407	14414	14414	finally
    //   14408	14414	14414	finally
    //   14408	14414	14407	java/util/ConcurrentModificationException
    //   14603	14610	14610	finally
    //   14603	14610	3	java/lang/NullPointerException
    //   14603	14610	14610	finally
    //   14603	14610	14603	java/util/NoSuchElementException
    //   14603	14610	14610	java/lang/RuntimeException
    //   14679	14686	14686	finally
    //   14679	14686	3	finally
    //   14679	14686	14686	finally
    //   14680	14686	14679	java/lang/ClassCastException
    //   14680	14686	14686	finally
    //   14876	14882	14882	finally
    //   14876	14882	3	finally
    //   14876	14882	3	finally
    //   14876	14882	14882	java/lang/NullPointerException
    //   14876	14882	3	java/lang/AssertionError
    //   14952	14958	14958	finally
    //   14952	14958	3	java/lang/AssertionError
    //   14952	14958	14958	java/lang/NullPointerException
    //   14952	14958	3	java/util/ConcurrentModificationException
    //   14952	14958	3	java/util/ConcurrentModificationException
    //   15155	15162	15162	finally
    //   15155	15162	3	finally
    //   15155	15162	3	finally
    //   15156	15162	3	finally
    //   15156	15162	15155	java/lang/IndexOutOfBoundsException
    //   15231	15238	15238	finally
    //   15231	15238	3	finally
    //   15232	15238	15231	finally
    //   15232	15238	15231	java/lang/IllegalArgumentException
    //   15232	15238	15238	java/lang/ArithmeticException
    //   15428	15434	15434	finally
    //   15428	15434	15434	finally
    //   15428	15434	15434	java/lang/EnumConstantNotPresentException
    //   15428	15434	3	java/util/ConcurrentModificationException
    //   15428	15434	15434	java/util/NoSuchElementException
    //   15504	15510	15510	finally
    //   15504	15510	15510	finally
    //   15504	15510	3	finally
    //   15504	15510	15510	finally
    //   15504	15510	15510	java/lang/AssertionError
    //   15699	15706	15706	finally
    //   15699	15706	15706	finally
    //   15699	15706	15699	java/lang/NegativeArraySizeException
    //   15699	15706	15706	java/lang/IllegalStateException
    //   15699	15706	15699	java/lang/NegativeArraySizeException
    //   15775	15782	15782	finally
    //   15775	15782	3	java/lang/ArrayIndexOutOfBoundsException
    //   15775	15782	15775	java/util/ConcurrentModificationException
    //   15776	15782	3	finally
    //   15776	15782	15782	java/lang/RuntimeException
    //   15972	15978	15978	finally
    //   15972	15978	15978	finally
    //   15972	15978	3	java/lang/IllegalArgumentException
    //   15972	15978	15978	java/lang/IllegalArgumentException
    //   15972	15978	3	java/util/ConcurrentModificationException
    //   16048	16054	16054	finally
    //   16048	16054	16054	java/lang/StringIndexOutOfBoundsException
    //   16048	16054	3	finally
    //   16048	16054	16054	java/util/NoSuchElementException
    //   16048	16054	3	java/lang/ClassCastException
    //   16243	16250	16250	finally
    //   16244	16250	16250	finally
    //   16244	16250	16243	java/lang/EnumConstantNotPresentException
    //   16244	16250	16243	java/lang/StringIndexOutOfBoundsException
    //   16244	16250	16250	java/lang/EnumConstantNotPresentException
    //   16319	16326	16326	finally
    //   16319	16326	3	finally
    //   16320	16326	3	finally
    //   16320	16326	16319	finally
    //   16320	16326	3	java/lang/NumberFormatException
    //   16515	16522	16522	finally
    //   16515	16522	3	java/lang/NullPointerException
    //   16515	16522	16522	finally
    //   16516	16522	16522	finally
    //   16516	16522	16515	finally
    //   16783	16790	16790	finally
    //   16783	16790	16783	finally
    //   16784	16790	16783	finally
    //   16784	16790	16790	finally
    //   16784	16790	16783	java/lang/NegativeArraySizeException
    //   16855	16862	16862	finally
    //   16856	16862	16855	finally
    //   16856	16862	16855	java/lang/EnumConstantNotPresentException
    //   16856	16862	16855	java/lang/EnumConstantNotPresentException
    //   16856	16862	3	finally
    //   16927	16936	16936	finally
    //   16927	16936	16927	java/lang/IllegalStateException
    //   16927	16936	16927	java/util/ConcurrentModificationException
    //   16927	16936	3	finally
    //   16928	16936	16927	java/util/NoSuchElementException
    //   16999	17006	17006	finally
    //   16999	17006	17006	finally
    //   17000	17006	3	java/lang/NumberFormatException
    //   17000	17006	3	finally
    //   17000	17006	16999	java/lang/NegativeArraySizeException
    //   17315	17322	17322	finally
    //   17315	17322	17322	java/lang/NullPointerException
    //   17315	17322	17315	java/lang/EnumConstantNotPresentException
    //   17316	17322	17322	finally
    //   17316	17322	17322	finally
    //   17387	17394	17394	finally
    //   17387	17394	17394	java/lang/UnsupportedOperationException
    //   17387	17394	3	java/lang/NumberFormatException
    //   17388	17394	3	finally
    //   17388	17394	17387	finally
    //   17459	17468	17468	finally
    //   17459	17468	17468	finally
    //   17459	17468	3	java/util/ConcurrentModificationException
    //   17460	17468	17459	java/lang/IndexOutOfBoundsException
    //   17460	17468	17468	finally
    //   17531	17538	17538	finally
    //   17531	17538	3	finally
    //   17531	17538	17538	java/lang/IllegalStateException
    //   17532	17538	3	finally
    //   17532	17538	17531	finally
    //   17848	17854	17854	finally
    //   17848	17854	3	finally
    //   17848	17854	3	java/util/NoSuchElementException
    //   17848	17854	17854	java/lang/EnumConstantNotPresentException
    //   17848	17854	3	java/lang/IllegalStateException
    //   17919	17926	17926	finally
    //   17919	17926	17926	finally
    //   17919	17926	17919	finally
    //   17920	17926	3	java/lang/NullPointerException
    //   17920	17926	3	java/lang/StringIndexOutOfBoundsException
    //   17991	18000	18000	finally
    //   17991	18000	3	java/lang/ClassCastException
    //   17992	18000	17991	finally
    //   17992	18000	17991	finally
    //   17992	18000	17991	finally
    //   18063	18070	18070	finally
    //   18063	18070	18063	java/lang/RuntimeException
    //   18063	18070	3	finally
    //   18064	18070	18063	finally
    //   18064	18070	18070	finally
    //   18380	18386	18386	finally
    //   18380	18386	3	finally
    //   18380	18386	18386	finally
    //   18380	18386	3	java/lang/ArrayIndexOutOfBoundsException
    //   18380	18386	18386	finally
    //   18451	18458	18458	finally
    //   18451	18458	18458	finally
    //   18451	18458	18458	java/lang/AssertionError
    //   18452	18458	18451	java/util/NoSuchElementException
    //   18452	18458	18451	java/lang/NegativeArraySizeException
    //   18523	18532	18532	finally
    //   18523	18532	3	java/lang/AssertionError
    //   18523	18532	3	finally
    //   18524	18532	3	java/lang/NegativeArraySizeException
    //   18524	18532	18523	java/lang/IllegalArgumentException
    //   18596	18602	18602	finally
    //   18596	18602	18602	finally
    //   18596	18602	3	finally
    //   18596	18602	3	java/lang/ArrayIndexOutOfBoundsException
    //   18596	18602	3	java/lang/ArrayIndexOutOfBoundsException
    //   18911	18918	18918	finally
    //   18911	18918	18911	finally
    //   18911	18918	3	finally
    //   18912	18918	18918	finally
    //   18912	18918	18911	java/lang/IllegalArgumentException
    //   18983	18990	18990	finally
    //   18983	18990	18990	java/lang/IllegalStateException
    //   18984	18990	3	java/lang/ClassCastException
    //   18984	18990	18990	finally
    //   18984	18990	18983	java/lang/ArithmeticException
    //   19056	19064	19064	finally
    //   19056	19064	3	finally
    //   19056	19064	3	finally
    //   19056	19064	3	java/lang/NullPointerException
    //   19056	19064	19064	finally
    //   19127	19134	19134	finally
    //   19127	19134	3	java/lang/StringIndexOutOfBoundsException
    //   19127	19134	3	java/lang/AssertionError
    //   19127	19134	3	finally
    //   19128	19134	19127	java/lang/StringIndexOutOfBoundsException
    //   19440	19446	19446	finally
    //   19440	19446	3	java/lang/EnumConstantNotPresentException
    //   19440	19446	19446	finally
    //   19440	19446	19446	java/util/NoSuchElementException
    //   19440	19446	3	java/lang/StringIndexOutOfBoundsException
    //   19515	19522	19522	finally
    //   19515	19522	19522	java/lang/IllegalStateException
    //   19515	19522	19515	finally
    //   19516	19522	3	finally
    //   19516	19522	19522	java/lang/NullPointerException
    //   19640	19646	19646	finally
    //   19640	19646	19646	finally
    //   19640	19646	3	java/lang/RuntimeException
    //   19640	19646	19646	finally
    //   19640	19646	19646	finally
    //   19775	19782	19782	finally
    //   19776	19782	3	java/lang/AssertionError
    //   19776	19782	3	finally
    //   19776	19782	19775	finally
    //   19776	19782	3	java/lang/UnsupportedOperationException
    //   19852	19858	19858	finally
    //   19852	19858	3	finally
    //   19852	19858	19858	java/lang/ArithmeticException
    //   19852	19858	19858	finally
    //   19852	19858	19858	finally
    //   19924	19930	19930	finally
    //   19924	19930	19930	finally
    //   19924	19930	3	java/lang/ArrayIndexOutOfBoundsException
    //   19924	19930	3	finally
    //   19924	19930	3	java/lang/IndexOutOfBoundsException
    //   20127	20134	20134	finally
    //   20127	20134	20134	finally
    //   20127	20134	3	java/lang/ArrayIndexOutOfBoundsException
    //   20127	20134	3	java/lang/NegativeArraySizeException
    //   20128	20134	20127	finally
    //   20203	20210	20210	finally
    //   20203	20210	20203	finally
    //   20203	20210	20203	java/lang/ArrayIndexOutOfBoundsException
    //   20204	20210	3	finally
    //   20204	20210	20203	finally
    //   20399	20406	20406	finally
    //   20399	20406	20399	java/util/NoSuchElementException
    //   20399	20406	20399	java/lang/NumberFormatException
    //   20400	20406	20399	finally
    //   20400	20406	20406	finally
    //   20475	20482	20482	finally
    //   20475	20482	20475	java/lang/ArrayIndexOutOfBoundsException
    //   20475	20482	20482	finally
    //   20476	20482	20482	java/lang/NullPointerException
    //   20476	20482	20482	finally
    //   20671	20678	20678	finally
    //   20671	20678	20671	java/lang/NullPointerException
    //   20672	20678	20671	finally
    //   20672	20678	20678	finally
    //   20672	20678	20678	java/lang/AssertionError
    //   20747	20754	20754	finally
    //   20747	20754	20754	finally
    //   20747	20754	20747	finally
    //   20748	20754	20754	finally
    //   20748	20754	20747	finally
    //   20943	20950	20950	finally
    //   20943	20950	3	java/lang/ArrayIndexOutOfBoundsException
    //   20944	20950	20943	java/util/NoSuchElementException
    //   20944	20950	3	java/lang/StringIndexOutOfBoundsException
    //   20944	20950	20943	finally
    //   21019	21026	21026	finally
    //   21019	21026	3	java/lang/UnsupportedOperationException
    //   21019	21026	21019	java/lang/UnsupportedOperationException
    //   21020	21026	3	java/lang/EnumConstantNotPresentException
    //   21020	21026	3	java/lang/NullPointerException
    //   21091	21098	21098	finally
    //   21091	21098	21091	java/util/NoSuchElementException
    //   21091	21098	21098	java/lang/RuntimeException
    //   21091	21098	21091	finally
    //   21092	21098	21091	finally
    //   21287	21294	21294	finally
    //   21287	21294	3	java/lang/NullPointerException
    //   21288	21294	21294	java/lang/EnumConstantNotPresentException
    //   21288	21294	21287	finally
    //   21288	21294	21287	java/lang/NegativeArraySizeException
    //   21363	21370	21370	finally
    //   21363	21370	21370	finally
    //   21363	21370	21370	java/lang/NumberFormatException
    //   21363	21370	3	finally
    //   21363	21370	21363	java/lang/NumberFormatException
    //   21563	21570	21570	finally
    //   21563	21570	21563	finally
    //   21564	21570	21570	finally
    //   21564	21570	21570	finally
    //   21564	21570	21563	finally
    //   21639	21646	21646	finally
    //   21639	21646	21639	finally
    //   21639	21646	21639	java/util/NoSuchElementException
    //   21640	21646	21646	finally
    //   21640	21646	3	java/lang/UnsupportedOperationException
    //   21835	21842	21842	finally
    //   21835	21842	3	java/lang/ArrayIndexOutOfBoundsException
    //   21835	21842	21842	java/lang/ArrayIndexOutOfBoundsException
    //   21835	21842	21842	java/lang/UnsupportedOperationException
    //   21836	21842	21835	finally
    //   21911	21918	21918	finally
    //   21912	21918	3	java/lang/EnumConstantNotPresentException
    //   21912	21918	3	java/lang/AssertionError
    //   21912	21918	21911	java/util/ConcurrentModificationException
    //   21912	21918	3	java/util/NoSuchElementException
    //   22108	22114	22114	finally
    //   22108	22114	22114	java/util/NoSuchElementException
    //   22108	22114	3	java/util/ConcurrentModificationException
    //   22108	22114	3	java/lang/IndexOutOfBoundsException
    //   22108	22114	22114	finally
    //   22183	22190	22190	finally
    //   22183	22190	22190	finally
    //   22183	22190	22183	finally
    //   22184	22190	22190	java/lang/IndexOutOfBoundsException
    //   22184	22190	22190	java/lang/IllegalArgumentException
    //   22379	22386	22386	finally
    //   22379	22386	22386	finally
    //   22379	22386	22386	java/lang/NumberFormatException
    //   22380	22386	3	finally
    //   22380	22386	22379	finally
    //   22455	22462	22462	finally
    //   22455	22462	22455	java/lang/ArrayIndexOutOfBoundsException
    //   22455	22462	22455	finally
    //   22455	22462	3	finally
    //   22456	22462	3	java/lang/IllegalStateException
    //   22527	22534	22534	finally
    //   22527	22534	22534	finally
    //   22528	22534	3	java/lang/UnsupportedOperationException
    //   22528	22534	3	finally
    //   22528	22534	22527	finally
    //   22723	22730	22730	finally
    //   22723	22730	3	java/lang/IndexOutOfBoundsException
    //   22723	22730	22730	java/util/ConcurrentModificationException
    //   22724	22730	22723	java/lang/NullPointerException
    //   22724	22730	22730	finally
    //   22799	22806	22806	finally
    //   22799	22806	22799	java/lang/ClassCastException
    //   22799	22806	22799	java/lang/StringIndexOutOfBoundsException
    //   22799	22806	22806	java/util/NoSuchElementException
    //   22800	22806	22799	finally
    //   22995	23002	23002	finally
    //   22995	23002	23002	finally
    //   22996	23002	22995	finally
    //   22996	23002	3	java/lang/IllegalArgumentException
    //   22996	23002	23002	finally
    //   23071	23078	23078	finally
    //   23071	23078	3	java/lang/ArithmeticException
    //   23072	23078	23078	finally
    //   23072	23078	3	java/lang/IndexOutOfBoundsException
    //   23072	23078	23071	finally
    //   23267	23274	23274	finally
    //   23267	23274	23267	java/lang/UnsupportedOperationException
    //   23268	23274	3	finally
    //   23268	23274	3	java/lang/IllegalStateException
    //   23268	23274	23267	java/lang/ArithmeticException
    //   23343	23350	23350	finally
    //   23344	23350	23343	finally
    //   23344	23350	23350	java/lang/NumberFormatException
    //   23344	23350	3	finally
    //   23344	23350	3	finally
    //   23539	23546	23546	finally
    //   23539	23546	3	java/lang/IndexOutOfBoundsException
    //   23540	23546	23546	finally
    //   23540	23546	23539	java/lang/AssertionError
    //   23540	23546	3	java/lang/IllegalStateException
    //   23615	23622	23622	finally
    //   23615	23622	23615	finally
    //   23616	23622	23622	java/lang/NumberFormatException
    //   23616	23622	23615	finally
    //   23616	23622	3	finally
    //   23819	23826	23826	finally
    //   23819	23826	3	finally
    //   23819	23826	3	java/lang/EnumConstantNotPresentException
    //   23820	23826	3	finally
    //   23820	23826	23819	java/lang/IndexOutOfBoundsException
    //   23895	23902	23902	finally
    //   23895	23902	23895	java/util/ConcurrentModificationException
    //   23895	23902	3	finally
    //   23895	23902	23902	finally
    //   23896	23902	23895	java/lang/IllegalArgumentException
    //   24091	24098	24098	finally
    //   24091	24098	24091	java/lang/IllegalStateException
    //   24091	24098	24091	finally
    //   24091	24098	24091	java/lang/RuntimeException
    //   24092	24098	24091	java/lang/NegativeArraySizeException
    //   24167	24174	24174	finally
    //   24167	24174	24174	finally
    //   24167	24174	24167	finally
    //   24168	24174	24174	finally
    //   24168	24174	3	java/lang/IllegalStateException
    //   24363	24370	24370	finally
    //   24363	24370	3	finally
    //   24363	24370	24370	finally
    //   24364	24370	3	java/lang/IndexOutOfBoundsException
    //   24364	24370	24363	finally
    //   24439	24446	24446	finally
    //   24439	24446	24439	finally
    //   24439	24446	3	java/lang/StringIndexOutOfBoundsException
    //   24439	24446	3	java/lang/EnumConstantNotPresentException
    //   24440	24446	24446	java/util/NoSuchElementException
    //   24635	24642	24642	finally
    //   24635	24642	24642	java/lang/IllegalStateException
    //   24635	24642	3	java/lang/ArithmeticException
    //   24636	24642	24635	finally
    //   24636	24642	24642	finally
    //   24711	24718	24718	finally
    //   24712	24718	3	java/lang/RuntimeException
    //   24712	24718	24718	java/lang/AssertionError
    //   24712	24718	24711	finally
    //   24712	24718	3	finally
    //   24907	24914	24914	finally
    //   24907	24914	24907	finally
    //   24907	24914	3	java/lang/IllegalStateException
    //   24908	24914	24907	finally
    //   24908	24914	24907	java/lang/ArithmeticException
    //   24983	24990	24990	finally
    //   24983	24990	24983	java/util/NoSuchElementException
    //   24984	24990	24990	java/lang/IllegalArgumentException
    //   24984	24990	24983	java/lang/NullPointerException
    //   24984	24990	24983	finally
    //   25179	25186	25186	finally
    //   25179	25186	25186	finally
    //   25179	25186	25186	finally
    //   25180	25186	25179	java/lang/IndexOutOfBoundsException
    //   25180	25186	25186	finally
    //   25919	25927	25919	java/lang/IndexOutOfBoundsException
    //   25935	25937	3	finally
  }
  
  public boolean lambda$new$9(Object paramObject) {
    return Perry1.26(this, (int)554230614L ^ 0x6A0B30E2, paramObject);
  }
  
  public void setInstance() {
    Perry1.3K(this, (int)-1742416254L ^ 0xEB220D56);
  }
  
  public HoleESP() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w 277445226
    //   9: l2i
    //   10: ldc_w -1300358035
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1798296740
    //   20: l2i
    //   21: ldc_w -470973372
    //   24: ixor
    //   25: ldc2_w 1066192710
    //   28: l2i
    //   29: ldc_w 1827728837
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -542649334 -> 17, -242531196 -> 19592
    //   60: aload_0
    //   61: ldc_w '┳㌜╵㶲銵쮔้'
    //   64: getstatic Perryc.0 : I
    //   67: ifle -> 81
    //   70: ldc2_w 199925985
    //   73: l2i
    //   74: ldc_w -370927550
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 97805141
    //   84: l2i
    //   85: ldc_w -1276176999
    //   88: ixor
    //   89: ldc2_w -647170455
    //   92: l2i
    //   93: ldc_w 360174847
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, 773167669 -> 19954, 853603318 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '┨㌛╶㶠銃쯧๪墿蹥칫鶀਴煮䪌롭近'
    //   130: getstatic Perryc.c : I
    //   133: iflt -> 147
    //   136: ldc2_w -2146341653
    //   139: l2i
    //   140: ldc_w 1312387971
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w 1108997394
    //   150: l2i
    //   151: ldc_w -635816726
    //   154: ixor
    //   155: ldc2_w 1902306301
    //   158: l2i
    //   159: ldc_w -304841192
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 192, -51542796 -> 147, 1386119821 -> 20118
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w 547206382
    //   204: l2i
    //   205: ldc_w 331804561
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w 1764868384
    //   215: l2i
    //   216: ldc_w 1808806715
    //   219: ixor
    //   220: ldc2_w -786569259
    //   223: l2i
    //   224: ldc_w 1004216159
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 19942, -643980299 -> 212, -400094575 -> 256
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.RENDER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w 1912464416
    //   262: l2i
    //   263: ldc_w 1912464416
    //   266: ixor
    //   267: ldc2_w -1714005308
    //   270: l2i
    //   271: ldc_w -1714005308
    //   274: ixor
    //   275: ldc2_w 952779513
    //   278: l2i
    //   279: ldc_w 952779513
    //   282: ixor
    //   283: getstatic Perryc.c : I
    //   286: iflt -> 300
    //   289: ldc2_w 843054358
    //   292: l2i
    //   293: ldc_w 938108567
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 146356679
    //   303: l2i
    //   304: ldc_w 505920286
    //   307: ixor
    //   308: ldc2_w -1297416360
    //   311: l2i
    //   312: ldc_w 305798157
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 19874, -1522173740 -> 300, -1240571508 -> 344
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.0 : I
    //   350: ifle -> 364
    //   353: ldc2_w 1097091079
    //   356: l2i
    //   357: ldc_w -1700016183
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -962378026
    //   367: l2i
    //   368: ldc_w 864149418
    //   371: ixor
    //   372: ldc2_w 226927023
    //   375: l2i
    //   376: ldc_w 2026766818
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -1366874237 -> 20022, -688454298 -> 364
    //   408: aload_0
    //   409: getstatic Perryc.0 : I
    //   412: ifle -> 426
    //   415: ldc2_w 1077119649
    //   418: l2i
    //   419: ldc_w 1104368927
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w 366486204
    //   429: l2i
    //   430: ldc_w -213977679
    //   433: ixor
    //   434: ldc2_w 1892952470
    //   437: l2i
    //   438: ldc_w -72952642
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -1970134378 -> 19628, -1913314145 -> 426
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '┩㌖╷㶳銕쮵๖墩蹭'
    //   476: getstatic Perryc.0 : I
    //   479: ifle -> 493
    //   482: ldc2_w 68795330
    //   485: l2i
    //   486: ldc_w -698983078
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w 725524434
    //   496: l2i
    //   497: ldc_w 114158454
    //   500: ixor
    //   501: ldc2_w -1922105368
    //   504: l2i
    //   505: ldc_w 465179683
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 19560, -1155031185 -> 536, 1151012179 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w 1744310293
    //   542: l2i
    //   543: ldc_w 1744310293
    //   546: ixor
    //   547: getstatic Perryc.0 : I
    //   550: ifle -> 564
    //   553: ldc2_w 63847887
    //   556: l2i
    //   557: ldc_w -1378647
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w 1521766850
    //   567: l2i
    //   568: ldc_w -1338342477
    //   571: ixor
    //   572: ldc2_w 1480474310
    //   575: l2i
    //   576: ldc_w 557697401
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 20088, -2061026087 -> 564, -1819466290 -> 608
    //   608: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   611: getstatic Perryc.0 : I
    //   614: ifle -> 628
    //   617: ldc2_w 1944642173
    //   620: l2i
    //   621: ldc_w -611394872
    //   624: ixor
    //   625: goto -> 636
    //   628: ldc2_w 1938322885
    //   631: l2i
    //   632: ldc_w 1877825453
    //   635: ixor
    //   636: ldc2_w 1135821
    //   639: l2i
    //   640: ldc_w -1905073857
    //   643: ixor
    //   644: ixor
    //   645: lookupswitch default -> 672, -1197433929 -> 628, 637898055 -> 19572
    //   672: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   675: getstatic Perryc.0 : I
    //   678: ifle -> 692
    //   681: ldc2_w -1295235015
    //   684: l2i
    //   685: ldc_w -554442311
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w 1578484899
    //   695: l2i
    //   696: ldc_w -1960636651
    //   699: ixor
    //   700: ldc2_w 102723233
    //   703: l2i
    //   704: ldc_w 2037329759
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 19920, -1438217656 -> 736, 324003966 -> 692
    //   736: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   739: getstatic Perryc.c : I
    //   742: iflt -> 756
    //   745: ldc2_w 799813056
    //   748: l2i
    //   749: ldc_w -1612775911
    //   752: ixor
    //   753: goto -> 764
    //   756: ldc2_w -778535314
    //   759: l2i
    //   760: ldc_w -1881991025
    //   763: ixor
    //   764: ldc2_w -274137245
    //   767: l2i
    //   768: ldc_w -1735719029
    //   771: ixor
    //   772: ixor
    //   773: lookupswitch default -> 800, -1719264373 -> 756, -950981839 -> 19574
    //   800: putfield renderOwn : Lbigname/zprestige/webhack/features/setting/Setting;
    //   803: getstatic Perryc.c : I
    //   806: iflt -> 820
    //   809: ldc2_w 115595167
    //   812: l2i
    //   813: ldc_w -2101258668
    //   816: ixor
    //   817: goto -> 828
    //   820: ldc2_w 891361639
    //   823: l2i
    //   824: ldc_w 731376784
    //   827: ixor
    //   828: ldc2_w 615210181
    //   831: l2i
    //   832: ldc_w -507593670
    //   835: ixor
    //   836: ixor
    //   837: lookupswitch default -> 20012, -610069240 -> 864, 1094148404 -> 820
    //   864: aload_0
    //   865: getstatic Perryc.c : I
    //   868: iflt -> 882
    //   871: ldc2_w -1134404249
    //   874: l2i
    //   875: ldc_w -664316265
    //   878: ixor
    //   879: goto -> 890
    //   882: ldc2_w 895186425
    //   885: l2i
    //   886: ldc_w 2039070872
    //   889: ixor
    //   890: ldc2_w -2135236506
    //   893: l2i
    //   894: ldc_w 1136465709
    //   897: ixor
    //   898: ixor
    //   899: lookupswitch default -> 924, -1492976453 -> 20078, 926604469 -> 882
    //   924: aload_0
    //   925: new bigname/zprestige/webhack/features/setting/Setting
    //   928: dup
    //   929: ldc_w '┴㌝╵㶮銶쮨๯'
    //   932: getstatic Perryc.0 : I
    //   935: ifle -> 949
    //   938: ldc2_w 1668577161
    //   941: l2i
    //   942: ldc_w 846818856
    //   945: ixor
    //   946: goto -> 957
    //   949: ldc2_w 1439158884
    //   952: l2i
    //   953: ldc_w 54106591
    //   956: ixor
    //   957: ldc2_w 1025338541
    //   960: l2i
    //   961: ldc_w -750906158
    //   964: ixor
    //   965: ixor
    //   966: lookupswitch default -> 992, -1271241594 -> 949, -1087479330 -> 19778
    //   992: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   995: ldc2_w -538775398
    //   998: l2i
    //   999: ldc_w -538775397
    //   1002: ixor
    //   1003: getstatic Perryc.c : I
    //   1006: iflt -> 1020
    //   1009: ldc2_w 837024084
    //   1012: l2i
    //   1013: ldc_w -1780849919
    //   1016: ixor
    //   1017: goto -> 1028
    //   1020: ldc2_w 1376493226
    //   1023: l2i
    //   1024: ldc_w 407578840
    //   1027: ixor
    //   1028: ldc2_w 458105565
    //   1031: l2i
    //   1032: ldc_w 571782790
    //   1035: ixor
    //   1036: ixor
    //   1037: lookupswitch default -> 1064, -1654452722 -> 20002, -469288767 -> 1020
    //   1064: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1067: getstatic Perryc.c : I
    //   1070: iflt -> 1084
    //   1073: ldc2_w 1322397164
    //   1076: l2i
    //   1077: ldc_w -898785172
    //   1080: ixor
    //   1081: goto -> 1092
    //   1084: ldc2_w -991070057
    //   1087: l2i
    //   1088: ldc_w -1503908675
    //   1091: ixor
    //   1092: ldc2_w 1738716481
    //   1095: l2i
    //   1096: ldc_w 680360135
    //   1099: ixor
    //   1100: ixor
    //   1101: lookupswitch default -> 1128, -1178122774 -> 1084, -879738874 -> 19808
    //   1128: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1131: getstatic Perryc.0 : I
    //   1134: ifle -> 1148
    //   1137: ldc2_w 1698059443
    //   1140: l2i
    //   1141: ldc_w 577764033
    //   1144: ixor
    //   1145: goto -> 1156
    //   1148: ldc2_w -1793639737
    //   1151: l2i
    //   1152: ldc_w -475676620
    //   1155: ixor
    //   1156: ldc2_w 853282535
    //   1159: l2i
    //   1160: ldc_w 820033155
    //   1163: ixor
    //   1164: ixor
    //   1165: lookupswitch default -> 19952, 1164252694 -> 1148, 1955480215 -> 1192
    //   1192: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1195: getstatic Perryc.1 : I
    //   1198: ifeq -> 1212
    //   1201: ldc2_w -1152926347
    //   1204: l2i
    //   1205: ldc_w 1615548660
    //   1208: ixor
    //   1209: goto -> 1220
    //   1212: ldc2_w 399314095
    //   1215: l2i
    //   1216: ldc_w 1020301857
    //   1219: ixor
    //   1220: ldc2_w -1595817852
    //   1223: l2i
    //   1224: ldc_w -138894632
    //   1227: ixor
    //   1228: ixor
    //   1229: lookupswitch default -> 1256, -1940549667 -> 19568, 9081739 -> 1212
    //   1256: putfield fov : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1259: getstatic Perryc.0 : I
    //   1262: ifle -> 1276
    //   1265: ldc2_w 681830437
    //   1268: l2i
    //   1269: ldc_w 1307314801
    //   1272: ixor
    //   1273: goto -> 1284
    //   1276: ldc2_w -2089276192
    //   1279: l2i
    //   1280: ldc_w -523561676
    //   1283: ixor
    //   1284: ldc2_w -1000965537
    //   1287: l2i
    //   1288: ldc_w -737206228
    //   1291: ixor
    //   1292: ixor
    //   1293: lookupswitch default -> 1320, 1271000686 -> 1276, 1964423207 -> 19682
    //   1320: aload_0
    //   1321: getstatic Perryc.0 : I
    //   1324: ifle -> 1338
    //   1327: ldc2_w 1529722099
    //   1330: l2i
    //   1331: ldc_w -1790899233
    //   1334: ixor
    //   1335: goto -> 1346
    //   1338: ldc2_w -501083110
    //   1341: l2i
    //   1342: ldc_w -681254320
    //   1345: ixor
    //   1346: ldc2_w -1725419909
    //   1349: l2i
    //   1350: ldc_w 578245475
    //   1353: ixor
    //   1354: ixor
    //   1355: lookupswitch default -> 1380, -1748684963 -> 1338, 1966326324 -> 19772
    //   1380: aload_0
    //   1381: new bigname/zprestige/webhack/features/setting/Setting
    //   1384: dup
    //   1385: ldc_w '┩㌒╰㶹銒쮨๮'
    //   1388: getstatic Perryc.1 : I
    //   1391: ifeq -> 1405
    //   1394: ldc2_w 2008183662
    //   1397: l2i
    //   1398: ldc_w 680741351
    //   1401: ixor
    //   1402: goto -> 1413
    //   1405: ldc2_w 1211671952
    //   1408: l2i
    //   1409: ldc_w -822225021
    //   1412: ixor
    //   1413: ldc2_w 504055837
    //   1416: l2i
    //   1417: ldc_w -1366733363
    //   1420: ixor
    //   1421: ixor
    //   1422: lookupswitch default -> 1448, -274514087 -> 19852, 39788570 -> 1405
    //   1448: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1451: ldc2_w 41529170
    //   1454: l2i
    //   1455: ldc_w 41529170
    //   1458: ixor
    //   1459: getstatic Perryc.1 : I
    //   1462: ifeq -> 1476
    //   1465: ldc2_w 1683351751
    //   1468: l2i
    //   1469: ldc_w 130497899
    //   1472: ixor
    //   1473: goto -> 1484
    //   1476: ldc2_w 1312375434
    //   1479: l2i
    //   1480: ldc_w -414825519
    //   1483: ixor
    //   1484: ldc2_w 328622049
    //   1487: l2i
    //   1488: ldc_w -1256317833
    //   1491: ixor
    //   1492: ixor
    //   1493: lookupswitch default -> 20044, -988113350 -> 1476, 267862733 -> 1520
    //   1520: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1523: getstatic Perryc.0 : I
    //   1526: ifle -> 1540
    //   1529: ldc2_w 1795367705
    //   1532: l2i
    //   1533: ldc_w -1797042784
    //   1536: ixor
    //   1537: goto -> 1548
    //   1540: ldc2_w 2144959969
    //   1543: l2i
    //   1544: ldc_w -1125483448
    //   1547: ixor
    //   1548: ldc2_w -1015718006
    //   1551: l2i
    //   1552: ldc_w -1069106458
    //   1555: ixor
    //   1556: ixor
    //   1557: lookupswitch default -> 1584, -53244971 -> 20014, 1386709007 -> 1540
    //   1584: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1587: getstatic Perryc.0 : I
    //   1590: ifle -> 1604
    //   1593: ldc2_w -104638601
    //   1596: l2i
    //   1597: ldc_w 1314001195
    //   1600: ixor
    //   1601: goto -> 1612
    //   1604: ldc2_w 662286873
    //   1607: l2i
    //   1608: ldc_w 1734030147
    //   1611: ixor
    //   1612: ldc2_w -2082228218
    //   1615: l2i
    //   1616: ldc_w -1554862059
    //   1619: ixor
    //   1620: ixor
    //   1621: lookupswitch default -> 1648, -1759490481 -> 19904, -1633987787 -> 1604
    //   1648: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1651: getstatic Perryc.c : I
    //   1654: iflt -> 1668
    //   1657: ldc2_w -61380751
    //   1660: l2i
    //   1661: ldc_w 712598592
    //   1664: ixor
    //   1665: goto -> 1676
    //   1668: ldc2_w 167622974
    //   1671: l2i
    //   1672: ldc_w 1282577971
    //   1675: ixor
    //   1676: ldc2_w -2072913459
    //   1679: l2i
    //   1680: ldc_w -1354327571
    //   1683: ixor
    //   1684: ixor
    //   1685: lookupswitch default -> 1712, -48676079 -> 20070, 1710315747 -> 1668
    //   1712: putfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1715: getstatic Perryc.c : I
    //   1718: iflt -> 1732
    //   1721: ldc2_w -1262365583
    //   1724: l2i
    //   1725: ldc_w -854673249
    //   1728: ixor
    //   1729: goto -> 1740
    //   1732: ldc2_w 1953489814
    //   1735: l2i
    //   1736: ldc_w 1550787061
    //   1739: ixor
    //   1740: ldc2_w -2139253306
    //   1743: l2i
    //   1744: ldc_w -2104769461
    //   1747: ixor
    //   1748: ixor
    //   1749: lookupswitch default -> 19854, 720802798 -> 1776, 2067348835 -> 1732
    //   1776: aload_0
    //   1777: getstatic Perryc.c : I
    //   1780: iflt -> 1794
    //   1783: ldc2_w -1490300520
    //   1786: l2i
    //   1787: ldc_w -105052697
    //   1790: ixor
    //   1791: goto -> 1802
    //   1794: ldc2_w -549142602
    //   1797: l2i
    //   1798: ldc_w 2078186405
    //   1801: ixor
    //   1802: ldc2_w 1392737746
    //   1805: l2i
    //   1806: ldc_w 261897650
    //   1809: ixor
    //   1810: ixor
    //   1811: lookupswitch default -> 1836, 34182175 -> 19760, 669248177 -> 1794
    //   1836: aload_0
    //   1837: new bigname/zprestige/webhack/features/setting/Setting
    //   1840: dup
    //   1841: ldc_w '┩㌒╷㶰銕쮟'
    //   1844: getstatic Perryc.1 : I
    //   1847: ifeq -> 1861
    //   1850: ldc2_w -793537291
    //   1853: l2i
    //   1854: ldc_w -2023478505
    //   1857: ixor
    //   1858: goto -> 1869
    //   1861: ldc2_w -177597776
    //   1864: l2i
    //   1865: ldc_w 592178740
    //   1868: ixor
    //   1869: ldc2_w -1296779984
    //   1872: l2i
    //   1873: ldc_w 2047775586
    //   1876: ixor
    //   1877: ixor
    //   1878: lookupswitch default -> 1904, -1620207184 -> 19754, 578500044 -> 1861
    //   1904: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1907: ldc2_w 1364941482
    //   1910: l2i
    //   1911: ldc_w 1364941474
    //   1914: ixor
    //   1915: getstatic Perryc.1 : I
    //   1918: ifeq -> 1932
    //   1921: ldc2_w -1019112001
    //   1924: l2i
    //   1925: ldc_w -2012708198
    //   1928: ixor
    //   1929: goto -> 1940
    //   1932: ldc2_w -730447739
    //   1935: l2i
    //   1936: ldc_w 320473442
    //   1939: ixor
    //   1940: ldc2_w 825906952
    //   1943: l2i
    //   1944: ldc_w -332561830
    //   1947: ixor
    //   1948: ixor
    //   1949: lookupswitch default -> 1976, -1772174729 -> 19586, -732445913 -> 1932
    //   1976: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1979: ldc2_w 277929979
    //   1982: l2i
    //   1983: ldc_w 277929979
    //   1986: ixor
    //   1987: getstatic Perryc.0 : I
    //   1990: ifle -> 2004
    //   1993: ldc2_w 2110793283
    //   1996: l2i
    //   1997: ldc_w -1154089038
    //   2000: ixor
    //   2001: goto -> 2012
    //   2004: ldc2_w 517776582
    //   2007: l2i
    //   2008: ldc_w -127113411
    //   2011: ixor
    //   2012: ldc2_w 980256986
    //   2015: l2i
    //   2016: ldc_w 2011771166
    //   2019: ixor
    //   2020: ixor
    //   2021: lookupswitch default -> 20098, -1956552651 -> 2004, -1422624193 -> 2048
    //   2048: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2051: ldc2_w -1878875873
    //   2054: l2i
    //   2055: ldc_w -1878875883
    //   2058: ixor
    //   2059: getstatic Perryc.c : I
    //   2062: iflt -> 2076
    //   2065: ldc2_w -1487598574
    //   2068: l2i
    //   2069: ldc_w 1205682804
    //   2072: ixor
    //   2073: goto -> 2084
    //   2076: ldc2_w -1496461094
    //   2079: l2i
    //   2080: ldc_w 1542216100
    //   2083: ixor
    //   2084: ldc2_w 1809581321
    //   2087: l2i
    //   2088: ldc_w -1071213430
    //   2091: ixor
    //   2092: ixor
    //   2093: lookupswitch default -> 2120, -781975456 -> 2076, 1265819621 -> 20024
    //   2120: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2123: getstatic Perryc.1 : I
    //   2126: ifeq -> 2140
    //   2129: ldc2_w -1613130108
    //   2132: l2i
    //   2133: ldc_w 2053514452
    //   2136: ixor
    //   2137: goto -> 2148
    //   2140: ldc2_w 594074617
    //   2143: l2i
    //   2144: ldc_w 2086163502
    //   2147: ixor
    //   2148: ldc2_w -2064538670
    //   2151: l2i
    //   2152: ldc_w 1824301739
    //   2155: ixor
    //   2156: ixor
    //   2157: lookupswitch default -> 19830, -1216508242 -> 2184, 234009385 -> 2140
    //   2184: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   2187: getstatic Perryc.1 : I
    //   2190: ifeq -> 2204
    //   2193: ldc2_w 1513553287
    //   2196: l2i
    //   2197: ldc_w 1475330002
    //   2200: ixor
    //   2201: goto -> 2212
    //   2204: ldc2_w -383193816
    //   2207: l2i
    //   2208: ldc_w -158372123
    //   2211: ixor
    //   2212: ldc2_w 811288742
    //   2215: l2i
    //   2216: ldc_w -1453803640
    //   2219: ixor
    //   2220: ixor
    //   2221: lookupswitch default -> 19594, -2036040477 -> 2248, -1797603973 -> 2204
    //   2248: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2251: getstatic Perryc.0 : I
    //   2254: ifle -> 2268
    //   2257: ldc2_w -1307328321
    //   2260: l2i
    //   2261: ldc_w -578755510
    //   2264: ixor
    //   2265: goto -> 2276
    //   2268: ldc2_w 647671292
    //   2271: l2i
    //   2272: ldc_w 2034165090
    //   2275: ixor
    //   2276: ldc2_w -210077703
    //   2279: l2i
    //   2280: ldc_w 623236169
    //   2283: ixor
    //   2284: ixor
    //   2285: lookupswitch default -> 2312, -1177778363 -> 19960, 748627341 -> 2268
    //   2312: putfield range : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2315: getstatic Perryc.1 : I
    //   2318: ifeq -> 2332
    //   2321: ldc2_w -1737602511
    //   2324: l2i
    //   2325: ldc_w 1078260935
    //   2328: ixor
    //   2329: goto -> 2340
    //   2332: ldc2_w 781306806
    //   2335: l2i
    //   2336: ldc_w 239234546
    //   2339: ixor
    //   2340: ldc2_w -305109843
    //   2343: l2i
    //   2344: ldc_w 460484833
    //   2347: ixor
    //   2348: ixor
    //   2349: lookupswitch default -> 2376, -36719725 -> 2332, 780708538 -> 20004
    //   2376: aload_0
    //   2377: getstatic Perryc.1 : I
    //   2380: ifeq -> 2394
    //   2383: ldc2_w 1819801758
    //   2386: l2i
    //   2387: ldc_w -1277022868
    //   2390: ixor
    //   2391: goto -> 2402
    //   2394: ldc2_w 479241414
    //   2397: l2i
    //   2398: ldc_w 1879182873
    //   2401: ixor
    //   2402: ldc2_w 333127827
    //   2405: l2i
    //   2406: ldc_w -438568241
    //   2409: ixor
    //   2410: ixor
    //   2411: lookupswitch default -> 19812, -1701678973 -> 2436, 697634734 -> 2394
    //   2436: aload_0
    //   2437: new bigname/zprestige/webhack/features/setting/Setting
    //   2440: dup
    //   2441: ldc_w '┩㌒╷㶰銕쮞'
    //   2444: getstatic Perryc.1 : I
    //   2447: ifeq -> 2461
    //   2450: ldc2_w 1276227769
    //   2453: l2i
    //   2454: ldc_w -535530409
    //   2457: ixor
    //   2458: goto -> 2469
    //   2461: ldc2_w 255778479
    //   2464: l2i
    //   2465: ldc_w -1544901584
    //   2468: ixor
    //   2469: ldc2_w 1626626745
    //   2472: l2i
    //   2473: ldc_w 1556978488
    //   2476: ixor
    //   2477: ixor
    //   2478: lookupswitch default -> 19706, -1875114641 -> 2461, -1863470306 -> 2504
    //   2504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2507: ldc2_w -1143184123
    //   2510: l2i
    //   2511: ldc_w -1143184128
    //   2514: ixor
    //   2515: getstatic Perryc.1 : I
    //   2518: ifeq -> 2532
    //   2521: ldc2_w -1379417337
    //   2524: l2i
    //   2525: ldc_w -740608400
    //   2528: ixor
    //   2529: goto -> 2540
    //   2532: ldc2_w -2023095475
    //   2535: l2i
    //   2536: ldc_w 515119234
    //   2539: ixor
    //   2540: ldc2_w -331537135
    //   2543: l2i
    //   2544: ldc_w 2008773104
    //   2547: ixor
    //   2548: ixor
    //   2549: lookupswitch default -> 2576, -442850922 -> 19918, 1628771047 -> 2532
    //   2576: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2579: ldc2_w 1265085025
    //   2582: l2i
    //   2583: ldc_w 1265085025
    //   2586: ixor
    //   2587: getstatic Perryc.c : I
    //   2590: iflt -> 2604
    //   2593: ldc2_w 1225722571
    //   2596: l2i
    //   2597: ldc_w -1600562169
    //   2600: ixor
    //   2601: goto -> 2612
    //   2604: ldc2_w -2056151067
    //   2607: l2i
    //   2608: ldc_w -1214371532
    //   2611: ixor
    //   2612: ldc2_w 1968013457
    //   2615: l2i
    //   2616: ldc_w -1729345831
    //   2619: ixor
    //   2620: ixor
    //   2621: lookupswitch default -> 2648, 70750340 -> 19742, 1299420918 -> 2604
    //   2648: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2651: ldc2_w 10553440
    //   2654: l2i
    //   2655: ldc_w 10553450
    //   2658: ixor
    //   2659: getstatic Perryc.0 : I
    //   2662: ifle -> 2676
    //   2665: ldc2_w 165350429
    //   2668: l2i
    //   2669: ldc_w 418113824
    //   2672: ixor
    //   2673: goto -> 2684
    //   2676: ldc2_w -596208134
    //   2679: l2i
    //   2680: ldc_w -162937555
    //   2683: ixor
    //   2684: ldc2_w -1941862023
    //   2687: l2i
    //   2688: ldc_w -1966806416
    //   2691: ixor
    //   2692: ixor
    //   2693: lookupswitch default -> 19708, 397772340 -> 2676, 750400478 -> 2720
    //   2720: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2723: getstatic Perryc.c : I
    //   2726: iflt -> 2740
    //   2729: ldc2_w 463595007
    //   2732: l2i
    //   2733: ldc_w 1324776317
    //   2736: ixor
    //   2737: goto -> 2748
    //   2740: ldc2_w 9651798
    //   2743: l2i
    //   2744: ldc_w -2146184034
    //   2747: ixor
    //   2748: ldc2_w 1697397742
    //   2751: l2i
    //   2752: ldc_w -1569359367
    //   2755: ixor
    //   2756: ixor
    //   2757: lookupswitch default -> 2784, -1844519787 -> 19652, 1891828292 -> 2740
    //   2784: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   2787: getstatic Perryc.1 : I
    //   2790: ifeq -> 2804
    //   2793: ldc2_w 73034630
    //   2796: l2i
    //   2797: ldc_w -1627184963
    //   2800: ixor
    //   2801: goto -> 2812
    //   2804: ldc2_w -1602384592
    //   2807: l2i
    //   2808: ldc_w 9898679
    //   2811: ixor
    //   2812: ldc2_w 1417598204
    //   2815: l2i
    //   2816: ldc_w -1901246607
    //   2819: ixor
    //   2820: ixor
    //   2821: lookupswitch default -> 2848, -1204610948 -> 2804, 1099618486 -> 20102
    //   2848: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2851: getstatic Perryc.0 : I
    //   2854: ifle -> 2868
    //   2857: ldc2_w -1883590532
    //   2860: l2i
    //   2861: ldc_w 1659901617
    //   2864: ixor
    //   2865: goto -> 2876
    //   2868: ldc2_w 1387776675
    //   2871: l2i
    //   2872: ldc_w -681066249
    //   2875: ixor
    //   2876: ldc2_w -653323335
    //   2879: l2i
    //   2880: ldc_w -549351857
    //   2883: ixor
    //   2884: ixor
    //   2885: lookupswitch default -> 2912, -1513444272 -> 2868, -352044229 -> 19634
    //   2912: putfield rangeY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2915: getstatic Perryc.0 : I
    //   2918: ifle -> 2932
    //   2921: ldc2_w -1305984789
    //   2924: l2i
    //   2925: ldc_w -1064960914
    //   2928: ixor
    //   2929: goto -> 2940
    //   2932: ldc2_w -794882167
    //   2935: l2i
    //   2936: ldc_w 1134775248
    //   2939: ixor
    //   2940: ldc2_w -1699118780
    //   2943: l2i
    //   2944: ldc_w -790056971
    //   2947: ixor
    //   2948: ixor
    //   2949: lookupswitch default -> 19722, -647140632 -> 2976, 956076596 -> 2932
    //   2976: aload_0
    //   2977: getstatic Perryc.0 : I
    //   2980: ifle -> 2994
    //   2983: ldc2_w 1736003033
    //   2986: l2i
    //   2987: ldc_w -107175126
    //   2990: ixor
    //   2991: goto -> 3002
    //   2994: ldc2_w -378356569
    //   2997: l2i
    //   2998: ldc_w 1295096483
    //   3001: ixor
    //   3002: ldc2_w -57191965
    //   3005: l2i
    //   3006: ldc_w -1250238118
    //   3009: ixor
    //   3010: ixor
    //   3011: lookupswitch default -> 3036, -687317430 -> 19756, -76559028 -> 2994
    //   3036: aload_0
    //   3037: new bigname/zprestige/webhack/features/setting/Setting
    //   3040: dup
    //   3041: ldc_w '┹㌜╡'
    //   3044: getstatic Perryc.1 : I
    //   3047: ifeq -> 3061
    //   3050: ldc2_w -1827906425
    //   3053: l2i
    //   3054: ldc_w 2044203204
    //   3057: ixor
    //   3058: goto -> 3069
    //   3061: ldc2_w -527847709
    //   3064: l2i
    //   3065: ldc_w 1823416455
    //   3068: ixor
    //   3069: ldc2_w -477939979
    //   3072: l2i
    //   3073: ldc_w 996945545
    //   3076: ixor
    //   3077: ixor
    //   3078: lookupswitch default -> 3104, 577735094 -> 3061, 842748991 -> 19896
    //   3104: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3107: ldc2_w -1895039793
    //   3110: l2i
    //   3111: ldc_w -1895039794
    //   3114: ixor
    //   3115: getstatic Perryc.c : I
    //   3118: iflt -> 3132
    //   3121: ldc2_w 398109353
    //   3124: l2i
    //   3125: ldc_w 1796094660
    //   3128: ixor
    //   3129: goto -> 3140
    //   3132: ldc2_w -1909082618
    //   3135: l2i
    //   3136: ldc_w 61774656
    //   3139: ixor
    //   3140: ldc2_w 1274300937
    //   3143: l2i
    //   3144: ldc_w 1658153084
    //   3147: ixor
    //   3148: ixor
    //   3149: lookupswitch default -> 19674, -1531310285 -> 3176, 1435873816 -> 3132
    //   3176: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3179: getstatic Perryc.c : I
    //   3182: iflt -> 3196
    //   3185: ldc2_w 1673304611
    //   3188: l2i
    //   3189: ldc_w -1131275104
    //   3192: ixor
    //   3193: goto -> 3204
    //   3196: ldc2_w -996354425
    //   3199: l2i
    //   3200: ldc_w -778015368
    //   3203: ixor
    //   3204: ldc2_w 1520752100
    //   3207: l2i
    //   3208: ldc_w -932018004
    //   3211: ixor
    //   3212: ixor
    //   3213: lookupswitch default -> 3240, 323175280 -> 3196, 1308154827 -> 19880
    //   3240: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   3243: getstatic Perryc.0 : I
    //   3246: ifle -> 3260
    //   3249: ldc2_w -2040932554
    //   3252: l2i
    //   3253: ldc_w 656337178
    //   3256: ixor
    //   3257: goto -> 3268
    //   3260: ldc2_w 560407121
    //   3263: l2i
    //   3264: ldc_w -1290669192
    //   3267: ixor
    //   3268: ldc2_w -1254787763
    //   3271: l2i
    //   3272: ldc_w -2136698975
    //   3275: ixor
    //   3276: ixor
    //   3277: lookupswitch default -> 19790, -1797864256 -> 3260, -1478022203 -> 3304
    //   3304: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3307: getstatic Perryc.0 : I
    //   3310: ifle -> 3324
    //   3313: ldc2_w -1786984464
    //   3316: l2i
    //   3317: ldc_w -1758199393
    //   3320: ixor
    //   3321: goto -> 3332
    //   3324: ldc2_w -1962362361
    //   3327: l2i
    //   3328: ldc_w -874905430
    //   3331: ixor
    //   3332: ldc2_w 472783761
    //   3335: l2i
    //   3336: ldc_w 295190977
    //   3339: ixor
    //   3340: ixor
    //   3341: lookupswitch default -> 19834, 268344383 -> 3324, 1298456829 -> 3368
    //   3368: putfield box : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3371: getstatic Perryc.c : I
    //   3374: iflt -> 3388
    //   3377: ldc2_w 479290137
    //   3380: l2i
    //   3381: ldc_w 2003708119
    //   3384: ixor
    //   3385: goto -> 3396
    //   3388: ldc2_w 80020266
    //   3391: l2i
    //   3392: ldc_w 740352728
    //   3395: ixor
    //   3396: ldc2_w -1436758299
    //   3399: l2i
    //   3400: ldc_w -1031997208
    //   3403: ixor
    //   3404: ixor
    //   3405: lookupswitch default -> 19892, 64978371 -> 3388, 1086707711 -> 3432
    //   3432: aload_0
    //   3433: getstatic Perryc.0 : I
    //   3436: ifle -> 3450
    //   3439: ldc2_w 308566185
    //   3442: l2i
    //   3443: ldc_w -1266936177
    //   3446: ixor
    //   3447: goto -> 3458
    //   3450: ldc2_w -1575216394
    //   3453: l2i
    //   3454: ldc_w -1438531718
    //   3457: ixor
    //   3458: ldc2_w -1713223624
    //   3461: l2i
    //   3462: ldc_w 609288130
    //   3465: ixor
    //   3466: ixor
    //   3467: lookupswitch default -> 20110, -1242623370 -> 3492, 464189916 -> 3450
    //   3492: aload_0
    //   3493: new bigname/zprestige/webhack/features/setting/Setting
    //   3496: dup
    //   3497: ldc_w '┼㌁╸㶳銙쮢๷墪'
    //   3500: getstatic Perryc.0 : I
    //   3503: ifle -> 3517
    //   3506: ldc2_w 1443987273
    //   3509: l2i
    //   3510: ldc_w -1252458047
    //   3513: ixor
    //   3514: goto -> 3525
    //   3517: ldc2_w -1234243031
    //   3520: l2i
    //   3521: ldc_w 297304104
    //   3524: ixor
    //   3525: ldc2_w -1173191242
    //   3528: l2i
    //   3529: ldc_w 250398002
    //   3532: ixor
    //   3533: ixor
    //   3534: lookupswitch default -> 20006, 321401477 -> 3560, 1471561228 -> 3517
    //   3560: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3563: ldc2_w -1313816041
    //   3566: l2i
    //   3567: ldc_w -1313816042
    //   3570: ixor
    //   3571: getstatic Perryc.1 : I
    //   3574: ifeq -> 3588
    //   3577: ldc2_w 1505449633
    //   3580: l2i
    //   3581: ldc_w -877602253
    //   3584: ixor
    //   3585: goto -> 3596
    //   3588: ldc2_w 1489369875
    //   3591: l2i
    //   3592: ldc_w 838159609
    //   3595: ixor
    //   3596: ldc2_w -1462404321
    //   3599: l2i
    //   3600: ldc_w 1352491606
    //   3603: ixor
    //   3604: ixor
    //   3605: lookupswitch default -> 3632, -185868963 -> 3588, 1782814171 -> 19686
    //   3632: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3635: getstatic Perryc.1 : I
    //   3638: ifeq -> 3652
    //   3641: ldc2_w 1581883120
    //   3644: l2i
    //   3645: ldc_w -1754275539
    //   3648: ixor
    //   3649: goto -> 3660
    //   3652: ldc2_w 487059946
    //   3655: l2i
    //   3656: ldc_w 2097100266
    //   3659: ixor
    //   3660: ldc2_w 2104333327
    //   3663: l2i
    //   3664: ldc_w 813933769
    //   3667: ixor
    //   3668: ixor
    //   3669: lookupswitch default -> 3696, -2067247333 -> 19882, -1807905088 -> 3652
    //   3696: aload_0
    //   3697: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   3702: getstatic Perryc.1 : I
    //   3705: ifeq -> 3719
    //   3708: ldc2_w 1865155029
    //   3711: l2i
    //   3712: ldc_w 1956287187
    //   3715: ixor
    //   3716: goto -> 3727
    //   3719: ldc2_w 322953627
    //   3722: l2i
    //   3723: ldc_w 1824580579
    //   3726: ixor
    //   3727: ldc2_w 1824981095
    //   3730: l2i
    //   3731: ldc_w -1607282524
    //   3734: ixor
    //   3735: ixor
    //   3736: lookupswitch default -> 20052, -1291136325 -> 3764, -683457595 -> 3719
    //   3764: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   3767: getstatic Perryc.c : I
    //   3770: iflt -> 3784
    //   3773: ldc2_w 1422654044
    //   3776: l2i
    //   3777: ldc_w -310917168
    //   3780: ixor
    //   3781: goto -> 3792
    //   3784: ldc2_w 20354299
    //   3787: l2i
    //   3788: ldc_w 225020095
    //   3791: ixor
    //   3792: ldc2_w 1336887699
    //   3795: l2i
    //   3796: ldc_w 1124930993
    //   3799: ixor
    //   3800: ixor
    //   3801: lookupswitch default -> 19758, -1256300114 -> 3784, 16597094 -> 3828
    //   3828: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3831: getstatic Perryc.1 : I
    //   3834: ifeq -> 3848
    //   3837: ldc2_w 1676959210
    //   3840: l2i
    //   3841: ldc_w -406743837
    //   3844: ixor
    //   3845: goto -> 3856
    //   3848: ldc2_w 1374683893
    //   3851: l2i
    //   3852: ldc_w 1373667311
    //   3855: ixor
    //   3856: ldc2_w -1663344159
    //   3859: l2i
    //   3860: ldc_w 1073859730
    //   3863: ixor
    //   3864: ixor
    //   3865: lookupswitch default -> 3892, 1230921892 -> 3848, 1492083834 -> 19804
    //   3892: putfield gradientBox : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3895: getstatic Perryc.c : I
    //   3898: iflt -> 3912
    //   3901: ldc2_w 1994176910
    //   3904: l2i
    //   3905: ldc_w 240551425
    //   3908: ixor
    //   3909: goto -> 3920
    //   3912: ldc2_w 1236552868
    //   3915: l2i
    //   3916: ldc_w 239420580
    //   3919: ixor
    //   3920: ldc2_w 383370965
    //   3923: l2i
    //   3924: ldc_w -1532436256
    //   3927: ixor
    //   3928: ixor
    //   3929: lookupswitch default -> 3956, -889513542 -> 19762, 590820087 -> 3912
    //   3956: aload_0
    //   3957: getstatic Perryc.0 : I
    //   3960: ifle -> 3974
    //   3963: ldc2_w -2056910862
    //   3966: l2i
    //   3967: ldc_w -418618378
    //   3970: ixor
    //   3971: goto -> 3982
    //   3974: ldc2_w -612125949
    //   3977: l2i
    //   3978: ldc_w 1806693811
    //   3981: ixor
    //   3982: ldc2_w -59367192
    //   3985: l2i
    //   3986: ldc_w 463025410
    //   3989: ixor
    //   3990: ixor
    //   3991: lookupswitch default -> 19794, -2054852114 -> 3974, 1472418650 -> 4016
    //   4016: aload_0
    //   4017: new bigname/zprestige/webhack/features/setting/Setting
    //   4020: dup
    //   4021: ldc_w '┩㌖╯㶲銂쮴๼墙蹱칯鷄ਮ煯䪌'
    //   4024: getstatic Perryc.1 : I
    //   4027: ifeq -> 4041
    //   4030: ldc2_w -277618176
    //   4033: l2i
    //   4034: ldc_w 1722899990
    //   4037: ixor
    //   4038: goto -> 4049
    //   4041: ldc2_w -981074630
    //   4044: l2i
    //   4045: ldc_w -885393965
    //   4048: ixor
    //   4049: ldc2_w -1560489072
    //   4052: l2i
    //   4053: ldc_w -363973579
    //   4056: ixor
    //   4057: ixor
    //   4058: lookupswitch default -> 4084, -1049601101 -> 20120, -501697155 -> 4041
    //   4084: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4087: ldc2_w 1608471448
    //   4090: l2i
    //   4091: ldc_w 1608471448
    //   4094: ixor
    //   4095: getstatic Perryc.0 : I
    //   4098: ifle -> 4112
    //   4101: ldc2_w -982353094
    //   4104: l2i
    //   4105: ldc_w -66266632
    //   4108: ixor
    //   4109: goto -> 4120
    //   4112: ldc2_w 1617547131
    //   4115: l2i
    //   4116: ldc_w -1487395409
    //   4119: ixor
    //   4120: ldc2_w 1793624249
    //   4123: l2i
    //   4124: ldc_w -300692128
    //   4127: ixor
    //   4128: ixor
    //   4129: lookupswitch default -> 4156, -1115298021 -> 19732, 262197491 -> 4112
    //   4156: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4159: getstatic Perryc.c : I
    //   4162: iflt -> 4176
    //   4165: ldc2_w -1324400210
    //   4168: l2i
    //   4169: ldc_w 1929419252
    //   4172: ixor
    //   4173: goto -> 4184
    //   4176: ldc2_w 153239343
    //   4179: l2i
    //   4180: ldc_w 231338156
    //   4183: ixor
    //   4184: ldc2_w 678478677
    //   4187: l2i
    //   4188: ldc_w 842979970
    //   4191: ixor
    //   4192: ixor
    //   4193: lookupswitch default -> 4220, -666779251 -> 19638, 2007758693 -> 4176
    //   4220: aload_0
    //   4221: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   4226: getstatic Perryc.1 : I
    //   4229: ifeq -> 4243
    //   4232: ldc2_w 124461270
    //   4235: l2i
    //   4236: ldc_w 1173028975
    //   4239: ixor
    //   4240: goto -> 4251
    //   4243: ldc2_w -208068311
    //   4246: l2i
    //   4247: ldc_w -1655807544
    //   4250: ixor
    //   4251: ldc2_w -334303520
    //   4254: l2i
    //   4255: ldc_w -810717087
    //   4258: ixor
    //   4259: ixor
    //   4260: lookupswitch default -> 19740, 1298718304 -> 4288, 1631567416 -> 4243
    //   4288: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   4291: getstatic Perryc.0 : I
    //   4294: ifle -> 4308
    //   4297: ldc2_w 308727899
    //   4300: l2i
    //   4301: ldc_w 909080193
    //   4304: ixor
    //   4305: goto -> 4316
    //   4308: ldc2_w 256590934
    //   4311: l2i
    //   4312: ldc_w 695299590
    //   4315: ixor
    //   4316: ldc2_w 1932119782
    //   4319: l2i
    //   4320: ldc_w 1746484413
    //   4323: ixor
    //   4324: ixor
    //   4325: lookupswitch default -> 4352, 1064916097 -> 19866, 1324930141 -> 4308
    //   4352: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4355: getstatic Perryc.1 : I
    //   4358: ifeq -> 4372
    //   4361: ldc2_w 1831238068
    //   4364: l2i
    //   4365: ldc_w -306348385
    //   4368: ixor
    //   4369: goto -> 4380
    //   4372: ldc2_w 615744008
    //   4375: l2i
    //   4376: ldc_w -932724143
    //   4379: ixor
    //   4380: ldc2_w -978901484
    //   4383: l2i
    //   4384: ldc_w 381412987
    //   4387: ixor
    //   4388: ixor
    //   4389: lookupswitch default -> 4416, 50743561 -> 4372, 1401407300 -> 19914
    //   4416: putfield invertGradientBox : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4419: getstatic Perryc.1 : I
    //   4422: ifeq -> 4436
    //   4425: ldc2_w -1429609632
    //   4428: l2i
    //   4429: ldc_w 1039933738
    //   4432: ixor
    //   4433: goto -> 4444
    //   4436: ldc2_w 265582290
    //   4439: l2i
    //   4440: ldc_w -1591091425
    //   4443: ixor
    //   4444: ldc2_w -1970925042
    //   4447: l2i
    //   4448: ldc_w -1852716548
    //   4451: ixor
    //   4452: ixor
    //   4453: lookupswitch default -> 4480, -1943922248 -> 19692, 548102603 -> 4436
    //   4480: aload_0
    //   4481: getstatic Perryc.c : I
    //   4484: iflt -> 4498
    //   4487: ldc2_w 653725369
    //   4490: l2i
    //   4491: ldc_w 1389360432
    //   4494: ixor
    //   4495: goto -> 4506
    //   4498: ldc2_w -19310775
    //   4501: l2i
    //   4502: ldc_w -37372030
    //   4505: ixor
    //   4506: ldc2_w 807979678
    //   4509: l2i
    //   4510: ldc_w 275554215
    //   4513: ixor
    //   4514: ixor
    //   4515: lookupswitch default -> 4540, 615274201 -> 4498, 1417457328 -> 19822
    //   4540: aload_0
    //   4541: new bigname/zprestige/webhack/features/setting/Setting
    //   4544: dup
    //   4545: ldc_w '┴㌆╭㶻銙쮩๼'
    //   4548: getstatic Perryc.0 : I
    //   4551: ifle -> 4565
    //   4554: ldc2_w 1301328331
    //   4557: l2i
    //   4558: ldc_w 380537281
    //   4561: ixor
    //   4562: goto -> 4573
    //   4565: ldc2_w -619619579
    //   4568: l2i
    //   4569: ldc_w 850895045
    //   4572: ixor
    //   4573: ldc2_w 153570702
    //   4576: l2i
    //   4577: ldc_w -1422387704
    //   4580: ixor
    //   4581: ixor
    //   4582: lookupswitch default -> 4608, -115252340 -> 19850, 1798886076 -> 4565
    //   4608: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4611: ldc2_w 769451914
    //   4614: l2i
    //   4615: ldc_w 769451915
    //   4618: ixor
    //   4619: getstatic Perryc.c : I
    //   4622: iflt -> 4636
    //   4625: ldc2_w -1584819858
    //   4628: l2i
    //   4629: ldc_w 1804010462
    //   4632: ixor
    //   4633: goto -> 4644
    //   4636: ldc2_w -1277710996
    //   4639: l2i
    //   4640: ldc_w 1455607498
    //   4643: ixor
    //   4644: ldc2_w 1022074581
    //   4647: l2i
    //   4648: ldc_w 1907951384
    //   4651: ixor
    //   4652: ixor
    //   4653: lookupswitch default -> 4680, -2024010883 -> 19842, 787343641 -> 4636
    //   4680: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4683: getstatic Perryc.0 : I
    //   4686: ifle -> 4700
    //   4689: ldc2_w 1873950716
    //   4692: l2i
    //   4693: ldc_w 612298727
    //   4696: ixor
    //   4697: goto -> 4708
    //   4700: ldc2_w 94841684
    //   4703: l2i
    //   4704: ldc_w -952236142
    //   4707: ixor
    //   4708: ldc2_w -66359810
    //   4711: l2i
    //   4712: ldc_w -1928167319
    //   4715: ixor
    //   4716: ixor
    //   4717: lookupswitch default -> 20018, -1283407535 -> 4744, 987051404 -> 4700
    //   4744: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   4747: getstatic Perryc.1 : I
    //   4750: ifeq -> 4764
    //   4753: ldc2_w 185848424
    //   4756: l2i
    //   4757: ldc_w 740824213
    //   4760: ixor
    //   4761: goto -> 4772
    //   4764: ldc2_w -1690874171
    //   4767: l2i
    //   4768: ldc_w 962056649
    //   4771: ixor
    //   4772: ldc2_w -49680670
    //   4775: l2i
    //   4776: ldc_w 1025482689
    //   4779: ixor
    //   4780: ixor
    //   4781: lookupswitch default -> 19548, -416434210 -> 4764, 1651961391 -> 4808
    //   4808: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4811: getstatic Perryc.0 : I
    //   4814: ifle -> 4828
    //   4817: ldc2_w -1209328732
    //   4820: l2i
    //   4821: ldc_w 1812874784
    //   4824: ixor
    //   4825: goto -> 4836
    //   4828: ldc2_w -807802042
    //   4831: l2i
    //   4832: ldc_w 1087718671
    //   4835: ixor
    //   4836: ldc2_w 2009320541
    //   4839: l2i
    //   4840: ldc_w -1634899544
    //   4843: ixor
    //   4844: ixor
    //   4845: lookupswitch default -> 20106, 850131057 -> 4828, 1715604412 -> 4872
    //   4872: putfield outline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4875: getstatic Perryc.0 : I
    //   4878: ifle -> 4892
    //   4881: ldc2_w 1610423087
    //   4884: l2i
    //   4885: ldc_w 745483101
    //   4888: ixor
    //   4889: goto -> 4900
    //   4892: ldc2_w -2006218468
    //   4895: l2i
    //   4896: ldc_w 30570565
    //   4899: ixor
    //   4900: ldc2_w 1571023886
    //   4903: l2i
    //   4904: ldc_w 2082798690
    //   4907: ixor
    //   4908: ixor
    //   4909: lookupswitch default -> 4936, 1377116190 -> 20048, 1563168913 -> 4892
    //   4936: aload_0
    //   4937: getstatic Perryc.1 : I
    //   4940: ifeq -> 4954
    //   4943: ldc2_w 643556355
    //   4946: l2i
    //   4947: ldc_w 1250052658
    //   4950: ixor
    //   4951: goto -> 4962
    //   4954: ldc2_w -556232216
    //   4957: l2i
    //   4958: ldc_w 56585185
    //   4961: ixor
    //   4962: ldc2_w -524985920
    //   4965: l2i
    //   4966: ldc_w 20396821
    //   4969: ixor
    //   4970: ixor
    //   4971: lookupswitch default -> 4996, -1923363612 -> 19810, 1844258048 -> 4954
    //   4996: aload_0
    //   4997: new bigname/zprestige/webhack/features/setting/Setting
    //   5000: dup
    //   5001: ldc_w '┼㌁╸㶳銙쮢๷墪蹌칻鷔ਫ煯䪝'
    //   5004: getstatic Perryc.0 : I
    //   5007: ifle -> 5021
    //   5010: ldc2_w 1742713133
    //   5013: l2i
    //   5014: ldc_w -2101463806
    //   5017: ixor
    //   5018: goto -> 5029
    //   5021: ldc2_w 1274741397
    //   5024: l2i
    //   5025: ldc_w 294551746
    //   5028: ixor
    //   5029: ldc2_w -1402670815
    //   5032: l2i
    //   5033: ldc_w 1115483619
    //   5036: ixor
    //   5037: ixor
    //   5038: lookupswitch default -> 19536, -1267884395 -> 5064, 192518381 -> 5021
    //   5064: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5067: ldc2_w -613155570
    //   5070: l2i
    //   5071: ldc_w -613155570
    //   5074: ixor
    //   5075: getstatic Perryc.c : I
    //   5078: iflt -> 5092
    //   5081: ldc2_w -660390057
    //   5084: l2i
    //   5085: ldc_w 969138526
    //   5088: ixor
    //   5089: goto -> 5100
    //   5092: ldc2_w 1967273337
    //   5095: l2i
    //   5096: ldc_w -1353107197
    //   5099: ixor
    //   5100: ldc2_w 1093698580
    //   5103: l2i
    //   5104: ldc_w 892442577
    //   5107: ixor
    //   5108: ixor
    //   5109: lookupswitch default -> 19974, -1788752436 -> 5092, -1374019649 -> 5136
    //   5136: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   5139: getstatic Perryc.0 : I
    //   5142: ifle -> 5156
    //   5145: ldc2_w 580305322
    //   5148: l2i
    //   5149: ldc_w -1192959985
    //   5152: ixor
    //   5153: goto -> 5164
    //   5156: ldc2_w -442870133
    //   5159: l2i
    //   5160: ldc_w 281064289
    //   5163: ixor
    //   5164: ldc2_w 1135614123
    //   5167: l2i
    //   5168: ldc_w -965115105
    //   5171: ixor
    //   5172: ixor
    //   5173: lookupswitch default -> 5200, -2084615264 -> 5156, 532396561 -> 20114
    //   5200: aload_0
    //   5201: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   5206: getstatic Perryc.c : I
    //   5209: iflt -> 5223
    //   5212: ldc2_w 40087516
    //   5215: l2i
    //   5216: ldc_w 1294239986
    //   5219: ixor
    //   5220: goto -> 5231
    //   5223: ldc2_w 2105086870
    //   5226: l2i
    //   5227: ldc_w 997681013
    //   5230: ixor
    //   5231: ldc2_w -1345481429
    //   5234: l2i
    //   5235: ldc_w 1224062234
    //   5238: ixor
    //   5239: ixor
    //   5240: lookupswitch default -> 5268, -1885457804 -> 5223, -1468070113 -> 19802
    //   5268: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   5271: getstatic Perryc.0 : I
    //   5274: ifle -> 5288
    //   5277: ldc2_w -587194060
    //   5280: l2i
    //   5281: ldc_w 1847882338
    //   5284: ixor
    //   5285: goto -> 5296
    //   5288: ldc2_w 1915302795
    //   5291: l2i
    //   5292: ldc_w 304128401
    //   5295: ixor
    //   5296: ldc2_w 256437064
    //   5299: l2i
    //   5300: ldc_w -27439364
    //   5303: ixor
    //   5304: ixor
    //   5305: lookupswitch default -> 20076, -1860421714 -> 5332, 1110570722 -> 5288
    //   5332: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5335: getstatic Perryc.0 : I
    //   5338: ifle -> 5352
    //   5341: ldc2_w -849501936
    //   5344: l2i
    //   5345: ldc_w -629489586
    //   5348: ixor
    //   5349: goto -> 5360
    //   5352: ldc2_w -1856795595
    //   5355: l2i
    //   5356: ldc_w 1809813272
    //   5359: ixor
    //   5360: ldc2_w -1014164143
    //   5363: l2i
    //   5364: ldc_w 148628337
    //   5367: ixor
    //   5368: ixor
    //   5369: lookupswitch default -> 19716, -596535426 -> 5352, 836433165 -> 5396
    //   5396: putfield gradientOutline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5399: getstatic Perryc.0 : I
    //   5402: ifle -> 5416
    //   5405: ldc2_w -2073906042
    //   5408: l2i
    //   5409: ldc_w -1896950111
    //   5412: ixor
    //   5413: goto -> 5424
    //   5416: ldc2_w -1941266101
    //   5419: l2i
    //   5420: ldc_w 644579193
    //   5423: ixor
    //   5424: ldc2_w -1029945065
    //   5427: l2i
    //   5428: ldc_w -637251269
    //   5431: ixor
    //   5432: ixor
    //   5433: lookupswitch default -> 20050, -1296447970 -> 5460, 303331851 -> 5416
    //   5460: aload_0
    //   5461: getstatic Perryc.c : I
    //   5464: iflt -> 5478
    //   5467: ldc2_w 456490012
    //   5470: l2i
    //   5471: ldc_w 1304873050
    //   5474: ixor
    //   5475: goto -> 5486
    //   5478: ldc2_w -566874238
    //   5481: l2i
    //   5482: ldc_w 81897134
    //   5485: ixor
    //   5486: ldc2_w 2041678697
    //   5489: l2i
    //   5490: ldc_w 1144456357
    //   5493: ixor
    //   5494: ixor
    //   5495: lookupswitch default -> 19996, -414120224 -> 5520, 1802845066 -> 5478
    //   5520: aload_0
    //   5521: new bigname/zprestige/webhack/features/setting/Setting
    //   5524: dup
    //   5525: ldc_w '┩㌖╯㶲銂쮴๼墙蹱칯鷄ਮ煯䪌롑辊ﴊꝢ辱꫾侴'
    //   5528: getstatic Perryc.c : I
    //   5531: iflt -> 5545
    //   5534: ldc2_w -1095748599
    //   5537: l2i
    //   5538: ldc_w 1736853830
    //   5541: ixor
    //   5542: goto -> 5553
    //   5545: ldc2_w -1033774915
    //   5548: l2i
    //   5549: ldc_w -1728482622
    //   5552: ixor
    //   5553: ldc2_w 1731645123
    //   5556: l2i
    //   5557: ldc_w -1901795490
    //   5560: ixor
    //   5561: ixor
    //   5562: lookupswitch default -> 5588, -1645986114 -> 5545, 816075986 -> 19736
    //   5588: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5591: ldc2_w 460976608
    //   5594: l2i
    //   5595: ldc_w 460976608
    //   5598: ixor
    //   5599: getstatic Perryc.1 : I
    //   5602: ifeq -> 5616
    //   5605: ldc2_w 422072047
    //   5608: l2i
    //   5609: ldc_w 259146503
    //   5612: ixor
    //   5613: goto -> 5624
    //   5616: ldc2_w -1426089487
    //   5619: l2i
    //   5620: ldc_w 1873796110
    //   5623: ixor
    //   5624: ldc2_w 104416523
    //   5627: l2i
    //   5628: ldc_w -417807996
    //   5631: ixor
    //   5632: ixor
    //   5633: lookupswitch default -> 19814, -142898841 -> 5616, 611434864 -> 5660
    //   5660: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   5663: getstatic Perryc.0 : I
    //   5666: ifle -> 5680
    //   5669: ldc2_w -1764428650
    //   5672: l2i
    //   5673: ldc_w 1738562352
    //   5676: ixor
    //   5677: goto -> 5688
    //   5680: ldc2_w 704494433
    //   5683: l2i
    //   5684: ldc_w -556729961
    //   5687: ixor
    //   5688: ldc2_w -1561883295
    //   5691: l2i
    //   5692: ldc_w -803989949
    //   5695: ixor
    //   5696: ixor
    //   5697: lookupswitch default -> 5724, -2088291196 -> 19946, 1417660486 -> 5680
    //   5724: aload_0
    //   5725: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   5730: getstatic Perryc.c : I
    //   5733: iflt -> 5747
    //   5736: ldc2_w -601841769
    //   5739: l2i
    //   5740: ldc_w 1548425122
    //   5743: ixor
    //   5744: goto -> 5755
    //   5747: ldc2_w -1070938453
    //   5750: l2i
    //   5751: ldc_w 1737376327
    //   5754: ixor
    //   5755: ldc2_w -818563382
    //   5758: l2i
    //   5759: ldc_w 1648209282
    //   5762: ixor
    //   5763: ixor
    //   5764: lookupswitch default -> 5792, -1564207605 -> 5747, 761500541 -> 19986
    //   5792: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   5795: getstatic Perryc.0 : I
    //   5798: ifle -> 5812
    //   5801: ldc2_w -387891381
    //   5804: l2i
    //   5805: ldc_w -1917303647
    //   5808: ixor
    //   5809: goto -> 5820
    //   5812: ldc2_w -837708508
    //   5815: l2i
    //   5816: ldc_w -939097249
    //   5819: ixor
    //   5820: ldc2_w -952893344
    //   5823: l2i
    //   5824: ldc_w -918090002
    //   5827: ixor
    //   5828: ixor
    //   5829: lookupswitch default -> 19968, 140777717 -> 5856, 1797944676 -> 5812
    //   5856: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5859: getstatic Perryc.0 : I
    //   5862: ifle -> 5876
    //   5865: ldc2_w 163795508
    //   5868: l2i
    //   5869: ldc_w -985513832
    //   5872: ixor
    //   5873: goto -> 5884
    //   5876: ldc2_w -1001479542
    //   5879: l2i
    //   5880: ldc_w 1208036535
    //   5883: ixor
    //   5884: ldc2_w 618593404
    //   5887: l2i
    //   5888: ldc_w 291338187
    //   5891: ixor
    //   5892: ixor
    //   5893: lookupswitch default -> 19948, -1177811574 -> 5920, -117270245 -> 5876
    //   5920: putfield invertGradientOutline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5923: getstatic Perryc.0 : I
    //   5926: ifle -> 5940
    //   5929: ldc2_w 2106701275
    //   5932: l2i
    //   5933: ldc_w 5138629
    //   5936: ixor
    //   5937: goto -> 5948
    //   5940: ldc2_w 906164804
    //   5943: l2i
    //   5944: ldc_w -1740107632
    //   5947: ixor
    //   5948: ldc2_w 1729948479
    //   5951: l2i
    //   5952: ldc_w 1107085452
    //   5955: ixor
    //   5956: ixor
    //   5957: lookupswitch default -> 5984, 1017215785 -> 5940, 1530920621 -> 19826
    //   5984: aload_0
    //   5985: getstatic Perryc.0 : I
    //   5988: ifle -> 6002
    //   5991: ldc2_w -308982527
    //   5994: l2i
    //   5995: ldc_w 1104880210
    //   5998: ixor
    //   5999: goto -> 6010
    //   6002: ldc2_w -1016367487
    //   6005: l2i
    //   6006: ldc_w 464588525
    //   6009: ixor
    //   6010: ldc2_w -2009421262
    //   6013: l2i
    //   6014: ldc_w -330478682
    //   6017: ixor
    //   6018: ixor
    //   6019: lookupswitch default -> 19962, -1129473544 -> 6044, -935751993 -> 6002
    //   6044: aload_0
    //   6045: new bigname/zprestige/webhack/features/setting/Setting
    //   6048: dup
    //   6049: ldc_w '┳㌖╰㶰銘쮳'
    //   6052: getstatic Perryc.0 : I
    //   6055: ifle -> 6069
    //   6058: ldc2_w -1485405302
    //   6061: l2i
    //   6062: ldc_w 1504880226
    //   6065: ixor
    //   6066: goto -> 6077
    //   6069: ldc2_w 650896985
    //   6072: l2i
    //   6073: ldc_w 1493092809
    //   6076: ixor
    //   6077: ldc2_w 1613628936
    //   6080: l2i
    //   6081: ldc_w -1485407843
    //   6084: ixor
    //   6085: ixor
    //   6086: lookupswitch default -> 6112, -1643998279 -> 6069, 966548093 -> 19648
    //   6112: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6115: ldc2_w 1.3308215698763034E308
    //   6118: invokestatic doubleToLongBits : (D)J
    //   6121: ldc2_w 9216529214180573214
    //   6124: lxor
    //   6125: invokestatic longBitsToDouble : (J)D
    //   6128: getstatic Perryc.0 : I
    //   6131: ifle -> 6145
    //   6134: ldc2_w 1863970376
    //   6137: l2i
    //   6138: ldc_w -1389302195
    //   6141: ixor
    //   6142: goto -> 6153
    //   6145: ldc2_w -1599632337
    //   6148: l2i
    //   6149: ldc_w 643362347
    //   6152: ixor
    //   6153: ldc2_w 1398245061
    //   6156: l2i
    //   6157: ldc_w 1142801914
    //   6160: ixor
    //   6161: ixor
    //   6162: lookupswitch default -> 6188, -714915014 -> 19798, 256070332 -> 6145
    //   6188: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6191: ldc2_w -0.09354237216349891
    //   6194: invokestatic doubleToLongBits : (D)J
    //   6197: ldc2_w 9203090877369255007
    //   6200: lxor
    //   6201: invokestatic longBitsToDouble : (J)D
    //   6204: getstatic Perryc.c : I
    //   6207: iflt -> 6221
    //   6210: ldc2_w 1450420782
    //   6213: l2i
    //   6214: ldc_w 2114695799
    //   6217: ixor
    //   6218: goto -> 6229
    //   6221: ldc2_w -499788507
    //   6224: l2i
    //   6225: ldc_w -1429024585
    //   6228: ixor
    //   6229: ldc2_w 1397006337
    //   6232: l2i
    //   6233: ldc_w 25426544
    //   6236: ixor
    //   6237: ixor
    //   6238: lookupswitch default -> 6264, 227702876 -> 6221, 2059354664 -> 19710
    //   6264: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6267: ldc2_w 0.5677745712649601
    //   6270: invokestatic doubleToLongBits : (D)J
    //   6273: ldc2_w 9214975296667822955
    //   6276: lxor
    //   6277: invokestatic longBitsToDouble : (J)D
    //   6280: getstatic Perryc.c : I
    //   6283: iflt -> 6297
    //   6286: ldc2_w 760001266
    //   6289: l2i
    //   6290: ldc_w -1226648357
    //   6293: ixor
    //   6294: goto -> 6305
    //   6297: ldc2_w 2066925521
    //   6300: l2i
    //   6301: ldc_w -1312432616
    //   6304: ixor
    //   6305: ldc2_w -1114563394
    //   6308: l2i
    //   6309: ldc_w 391933444
    //   6312: ixor
    //   6313: ixor
    //   6314: lookupswitch default -> 19928, 828576915 -> 6297, 1614441331 -> 6340
    //   6340: invokestatic valueOf : (D)Ljava/lang/Double;
    //   6343: getstatic Perryc.0 : I
    //   6346: ifle -> 6360
    //   6349: ldc2_w -1911153914
    //   6352: l2i
    //   6353: ldc_w -1507046220
    //   6356: ixor
    //   6357: goto -> 6368
    //   6360: ldc2_w 1129340767
    //   6363: l2i
    //   6364: ldc_w -1634765448
    //   6367: ixor
    //   6368: ldc2_w -660694644
    //   6371: l2i
    //   6372: ldc_w -210170111
    //   6375: ixor
    //   6376: ixor
    //   6377: lookupswitch default -> 6404, -721850991 -> 6360, 64864575 -> 19582
    //   6404: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   6407: getstatic Perryc.0 : I
    //   6410: ifle -> 6424
    //   6413: ldc2_w 511944175
    //   6416: l2i
    //   6417: ldc_w 1575935416
    //   6420: ixor
    //   6421: goto -> 6432
    //   6424: ldc2_w -2102753904
    //   6427: l2i
    //   6428: ldc_w 1267079638
    //   6431: ixor
    //   6432: ldc2_w 992166280
    //   6435: l2i
    //   6436: ldc_w 1476122821
    //   6439: ixor
    //   6440: ixor
    //   6441: lookupswitch default -> 6468, -2028407010 -> 6424, 800448794 -> 20096
    //   6468: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6471: getstatic Perryc.0 : I
    //   6474: ifle -> 6488
    //   6477: ldc2_w -1483884870
    //   6480: l2i
    //   6481: ldc_w 81324778
    //   6484: ixor
    //   6485: goto -> 6496
    //   6488: ldc2_w -1788276801
    //   6491: l2i
    //   6492: ldc_w 1952435372
    //   6495: ixor
    //   6496: ldc2_w 12601220
    //   6499: l2i
    //   6500: ldc_w -142755114
    //   6503: ixor
    //   6504: ixor
    //   6505: lookupswitch default -> 19836, 378224193 -> 6532, 1424531714 -> 6488
    //   6532: putfield height : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6535: getstatic Perryc.0 : I
    //   6538: ifle -> 6552
    //   6541: ldc2_w -306544423
    //   6544: l2i
    //   6545: ldc_w 1664077998
    //   6548: ixor
    //   6549: goto -> 6560
    //   6552: ldc2_w -1391243840
    //   6555: l2i
    //   6556: ldc_w 697009055
    //   6559: ixor
    //   6560: ldc2_w 953889381
    //   6563: l2i
    //   6564: ldc_w -264828536
    //   6567: ixor
    //   6568: ixor
    //   6569: lookupswitch default -> 19542, 1182362522 -> 6552, 1282733490 -> 6596
    //   6596: aload_0
    //   6597: getstatic Perryc.0 : I
    //   6600: ifle -> 6614
    //   6603: ldc2_w -852796335
    //   6606: l2i
    //   6607: ldc_w -101303096
    //   6610: ixor
    //   6611: goto -> 6622
    //   6614: ldc2_w 104382957
    //   6617: l2i
    //   6618: ldc_w 1920249107
    //   6621: ixor
    //   6622: ldc2_w -772476932
    //   6625: l2i
    //   6626: ldc_w -822541907
    //   6629: ixor
    //   6630: ixor
    //   6631: lookupswitch default -> 19604, 735088328 -> 6614, 1799455407 -> 6656
    //   6656: aload_0
    //   6657: new bigname/zprestige/webhack/features/setting/Setting
    //   6660: dup
    //   6661: ldc_w '┩㌖╽'
    //   6664: getstatic Perryc.0 : I
    //   6667: ifle -> 6681
    //   6670: ldc2_w 1276785453
    //   6673: l2i
    //   6674: ldc_w -1326982047
    //   6677: ixor
    //   6678: goto -> 6689
    //   6681: ldc2_w 1086895345
    //   6684: l2i
    //   6685: ldc_w 1636248761
    //   6688: ixor
    //   6689: ldc2_w -1583929180
    //   6692: l2i
    //   6693: ldc_w -1826374487
    //   6696: ixor
    //   6697: ixor
    //   6698: lookupswitch default -> 19982, -834045119 -> 6681, 335219781 -> 6724
    //   6724: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6727: ldc2_w -2044446249
    //   6730: l2i
    //   6731: ldc_w -2044446249
    //   6734: ixor
    //   6735: getstatic Perryc.1 : I
    //   6738: ifeq -> 6752
    //   6741: ldc2_w -1969493049
    //   6744: l2i
    //   6745: ldc_w -297853385
    //   6748: ixor
    //   6749: goto -> 6760
    //   6752: ldc2_w -1091081223
    //   6755: l2i
    //   6756: ldc_w 1533654189
    //   6759: ixor
    //   6760: ldc2_w -9535129
    //   6763: l2i
    //   6764: ldc_w -1674914367
    //   6767: ixor
    //   6768: ixor
    //   6769: lookupswitch default -> 20072, -2032497678 -> 6796, 132161878 -> 6752
    //   6796: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6799: ldc2_w -1672843873
    //   6802: l2i
    //   6803: ldc_w -1672843873
    //   6806: ixor
    //   6807: getstatic Perryc.0 : I
    //   6810: ifle -> 6824
    //   6813: ldc2_w 1042938226
    //   6816: l2i
    //   6817: ldc_w -841813144
    //   6820: ixor
    //   6821: goto -> 6832
    //   6824: ldc2_w -1993860808
    //   6827: l2i
    //   6828: ldc_w -123168698
    //   6831: ixor
    //   6832: ldc2_w 1171744648
    //   6835: l2i
    //   6836: ldc_w -411198537
    //   6839: ixor
    //   6840: ixor
    //   6841: lookupswitch default -> 6868, -437291901 -> 6824, 1364325925 -> 20112
    //   6868: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6871: ldc2_w 1513673458
    //   6874: l2i
    //   6875: ldc_w 1513673229
    //   6878: ixor
    //   6879: getstatic Perryc.c : I
    //   6882: iflt -> 6896
    //   6885: ldc2_w -537979315
    //   6888: l2i
    //   6889: ldc_w 762401387
    //   6892: ixor
    //   6893: goto -> 6904
    //   6896: ldc2_w 1937493137
    //   6899: l2i
    //   6900: ldc_w 1989010879
    //   6903: ixor
    //   6904: ldc2_w -1311319051
    //   6907: l2i
    //   6908: ldc_w -1783917291
    //   6911: ixor
    //   6912: ixor
    //   6913: lookupswitch default -> 19888, -689763642 -> 6896, 562784206 -> 6940
    //   6940: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6943: getstatic Perryc.1 : I
    //   6946: ifeq -> 6960
    //   6949: ldc2_w -57402722
    //   6952: l2i
    //   6953: ldc_w -2139025738
    //   6956: ixor
    //   6957: goto -> 6968
    //   6960: ldc2_w -324679081
    //   6963: l2i
    //   6964: ldc_w -1174946953
    //   6967: ixor
    //   6968: ldc2_w 482665079
    //   6971: l2i
    //   6972: ldc_w -1396690611
    //   6975: ixor
    //   6976: ixor
    //   6977: lookupswitch default -> 7004, -871250158 -> 19676, 87210773 -> 6960
    //   7004: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   7007: getstatic Perryc.c : I
    //   7010: iflt -> 7024
    //   7013: ldc2_w -1616510069
    //   7016: l2i
    //   7017: ldc_w -979708386
    //   7020: ixor
    //   7021: goto -> 7032
    //   7024: ldc2_w 1135638269
    //   7027: l2i
    //   7028: ldc_w -301184556
    //   7031: ixor
    //   7032: ldc2_w 314232844
    //   7035: l2i
    //   7036: ldc_w 1269765782
    //   7039: ixor
    //   7040: ixor
    //   7041: lookupswitch default -> 19924, -190187085 -> 7068, 53023503 -> 7024
    //   7068: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7071: getstatic Perryc.0 : I
    //   7074: ifle -> 7088
    //   7077: ldc2_w 315443702
    //   7080: l2i
    //   7081: ldc_w -1058105768
    //   7084: ixor
    //   7085: goto -> 7096
    //   7088: ldc2_w 169507585
    //   7091: l2i
    //   7092: ldc_w -2110868271
    //   7095: ixor
    //   7096: ldc2_w -1778776989
    //   7099: l2i
    //   7100: ldc_w -2113386300
    //   7103: ixor
    //   7104: ixor
    //   7105: lookupswitch default -> 19782, -1614380169 -> 7132, -976121079 -> 7088
    //   7132: putfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7135: getstatic Perryc.0 : I
    //   7138: ifle -> 7152
    //   7141: ldc2_w -122357563
    //   7144: l2i
    //   7145: ldc_w 1040242832
    //   7148: ixor
    //   7149: goto -> 7160
    //   7152: ldc2_w -1414023810
    //   7155: l2i
    //   7156: ldc_w -2035354331
    //   7159: ixor
    //   7160: ldc2_w 1280165491
    //   7163: l2i
    //   7164: ldc_w 659814879
    //   7167: ixor
    //   7168: ixor
    //   7169: lookupswitch default -> 19598, -1381359623 -> 7152, 1174896631 -> 7196
    //   7196: aload_0
    //   7197: getstatic Perryc.0 : I
    //   7200: ifle -> 7214
    //   7203: ldc2_w -1649710862
    //   7206: l2i
    //   7207: ldc_w 1319749491
    //   7210: ixor
    //   7211: goto -> 7222
    //   7214: ldc2_w -610010899
    //   7217: l2i
    //   7218: ldc_w 619199143
    //   7221: ixor
    //   7222: ldc2_w -828324785
    //   7225: l2i
    //   7226: ldc_w 1177894170
    //   7229: ixor
    //   7230: ixor
    //   7231: lookupswitch default -> 19858, 1536644820 -> 7214, 2011052831 -> 7256
    //   7256: aload_0
    //   7257: new bigname/zprestige/webhack/features/setting/Setting
    //   7260: dup
    //   7261: ldc_w '┼㌁╼㶲銞'
    //   7264: getstatic Perryc.c : I
    //   7267: iflt -> 7281
    //   7270: ldc2_w -105626874
    //   7273: l2i
    //   7274: ldc_w 458814105
    //   7277: ixor
    //   7278: goto -> 7289
    //   7281: ldc2_w 1440550907
    //   7284: l2i
    //   7285: ldc_w 88111879
    //   7288: ixor
    //   7289: ldc2_w 1209123393
    //   7292: l2i
    //   7293: ldc_w -1423440430
    //   7296: ixor
    //   7297: ixor
    //   7298: lookupswitch default -> 19818, -1281051793 -> 7324, 30766604 -> 7281
    //   7324: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7327: ldc2_w 1340546118
    //   7330: l2i
    //   7331: ldc_w 1340546233
    //   7334: ixor
    //   7335: getstatic Perryc.0 : I
    //   7338: ifle -> 7352
    //   7341: ldc2_w 1722753017
    //   7344: l2i
    //   7345: ldc_w 745245763
    //   7348: ixor
    //   7349: goto -> 7360
    //   7352: ldc2_w 219042958
    //   7355: l2i
    //   7356: ldc_w 2096547131
    //   7359: ixor
    //   7360: ldc2_w 1702006512
    //   7363: l2i
    //   7364: ldc_w 1008678627
    //   7367: ixor
    //   7368: ixor
    //   7369: lookupswitch default -> 7396, 329853865 -> 19600, 1169100678 -> 7352
    //   7396: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7399: ldc2_w -1906852601
    //   7402: l2i
    //   7403: ldc_w -1906852601
    //   7406: ixor
    //   7407: getstatic Perryc.1 : I
    //   7410: ifeq -> 7424
    //   7413: ldc2_w 2032541762
    //   7416: l2i
    //   7417: ldc_w -1104519020
    //   7420: ixor
    //   7421: goto -> 7432
    //   7424: ldc2_w 673994789
    //   7427: l2i
    //   7428: ldc_w 1561936193
    //   7431: ixor
    //   7432: ldc2_w 1641351409
    //   7435: l2i
    //   7436: ldc_w 62269205
    //   7439: ixor
    //   7440: ixor
    //   7441: lookupswitch default -> 19964, -1519423694 -> 7424, 391526016 -> 7468
    //   7468: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7471: ldc2_w -605389158
    //   7474: l2i
    //   7475: ldc_w -605389211
    //   7478: ixor
    //   7479: getstatic Perryc.1 : I
    //   7482: ifeq -> 7496
    //   7485: ldc2_w -194005569
    //   7488: l2i
    //   7489: ldc_w -30303706
    //   7492: ixor
    //   7493: goto -> 7504
    //   7496: ldc2_w -92018896
    //   7499: l2i
    //   7500: ldc_w -847212850
    //   7503: ixor
    //   7504: ldc2_w -21989592
    //   7507: l2i
    //   7508: ldc_w 59333829
    //   7511: ixor
    //   7512: ixor
    //   7513: lookupswitch default -> 19728, -902151661 -> 7540, -144243596 -> 7496
    //   7540: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7543: getstatic Perryc.0 : I
    //   7546: ifle -> 7560
    //   7549: ldc2_w -805878416
    //   7552: l2i
    //   7553: ldc_w 1740348417
    //   7556: ixor
    //   7557: goto -> 7568
    //   7560: ldc2_w -1727498174
    //   7563: l2i
    //   7564: ldc_w -635252854
    //   7567: ixor
    //   7568: ldc2_w 647010961
    //   7571: l2i
    //   7572: ldc_w -950473307
    //   7575: ixor
    //   7576: ixor
    //   7577: lookupswitch default -> 7604, 673159497 -> 7560, 1233432133 -> 19770
    //   7604: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   7607: getstatic Perryc.c : I
    //   7610: iflt -> 7624
    //   7613: ldc2_w -809322436
    //   7616: l2i
    //   7617: ldc_w 581019022
    //   7620: ixor
    //   7621: goto -> 7632
    //   7624: ldc2_w 921714727
    //   7627: l2i
    //   7628: ldc_w -797505233
    //   7631: ixor
    //   7632: ldc2_w 613032294
    //   7635: l2i
    //   7636: ldc_w 352220082
    //   7639: ixor
    //   7640: ixor
    //   7641: lookupswitch default -> 7668, -585674906 -> 19670, 1710446351 -> 7624
    //   7668: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7671: getstatic Perryc.0 : I
    //   7674: ifle -> 7688
    //   7677: ldc2_w -810831843
    //   7680: l2i
    //   7681: ldc_w -1183293677
    //   7684: ixor
    //   7685: goto -> 7696
    //   7688: ldc2_w -1117407324
    //   7691: l2i
    //   7692: ldc_w -1657298413
    //   7695: ixor
    //   7696: ldc2_w 188913088
    //   7699: l2i
    //   7700: ldc_w -1373722499
    //   7703: ixor
    //   7704: ixor
    //   7705: lookupswitch default -> 19872, -2062669814 -> 7732, -745549133 -> 7688
    //   7732: putfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7735: getstatic Perryc.c : I
    //   7738: iflt -> 7752
    //   7741: ldc2_w 2103136612
    //   7744: l2i
    //   7745: ldc_w -2030136659
    //   7748: ixor
    //   7749: goto -> 7760
    //   7752: ldc2_w -990838596
    //   7755: l2i
    //   7756: ldc_w 886678620
    //   7759: ixor
    //   7760: ldc2_w 1892719961
    //   7763: l2i
    //   7764: ldc_w 1844989584
    //   7767: ixor
    //   7768: ixor
    //   7769: lookupswitch default -> 19864, -426962944 -> 7752, -318736599 -> 7796
    //   7796: aload_0
    //   7797: getstatic Perryc.0 : I
    //   7800: ifle -> 7814
    //   7803: ldc2_w 1200337118
    //   7806: l2i
    //   7807: ldc_w 828520269
    //   7810: ixor
    //   7811: goto -> 7822
    //   7814: ldc2_w -116750210
    //   7817: l2i
    //   7818: ldc_w 1411405524
    //   7821: ixor
    //   7822: ldc2_w 244230472
    //   7825: l2i
    //   7826: ldc_w -1881433464
    //   7829: ixor
    //   7830: ixor
    //   7831: lookupswitch default -> 7856, -138628013 -> 19926, 510231102 -> 7814
    //   7856: aload_0
    //   7857: new bigname/zprestige/webhack/features/setting/Setting
    //   7860: dup
    //   7861: ldc_w '┹㌟╬㶲'
    //   7864: getstatic Perryc.0 : I
    //   7867: ifle -> 7881
    //   7870: ldc2_w -1285697478
    //   7873: l2i
    //   7874: ldc_w 664140061
    //   7877: ixor
    //   7878: goto -> 7889
    //   7881: ldc2_w -1157567236
    //   7884: l2i
    //   7885: ldc_w -1657339907
    //   7888: ixor
    //   7889: ldc2_w 1154808621
    //   7892: l2i
    //   7893: ldc_w -1445580888
    //   7896: ixor
    //   7897: ixor
    //   7898: lookupswitch default -> 7924, -1599829418 -> 7881, 2043346338 -> 19840
    //   7924: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7927: ldc2_w 893041408
    //   7930: l2i
    //   7931: ldc_w 893041408
    //   7934: ixor
    //   7935: getstatic Perryc.0 : I
    //   7938: ifle -> 7952
    //   7941: ldc2_w 832962373
    //   7944: l2i
    //   7945: ldc_w -572601423
    //   7948: ixor
    //   7949: goto -> 7960
    //   7952: ldc2_w 593937493
    //   7955: l2i
    //   7956: ldc_w -1546657411
    //   7959: ixor
    //   7960: ldc2_w 657759349
    //   7963: l2i
    //   7964: ldc_w 91917770
    //   7967: ixor
    //   7968: ixor
    //   7969: lookupswitch default -> 19788, -1561906025 -> 7996, -835377845 -> 7952
    //   7996: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7999: ldc2_w -1060973391
    //   8002: l2i
    //   8003: ldc_w -1060973391
    //   8006: ixor
    //   8007: getstatic Perryc.0 : I
    //   8010: ifle -> 8024
    //   8013: ldc2_w 91693770
    //   8016: l2i
    //   8017: ldc_w -286875108
    //   8020: ixor
    //   8021: goto -> 8032
    //   8024: ldc2_w -129504484
    //   8027: l2i
    //   8028: ldc_w 914743141
    //   8031: ixor
    //   8032: ldc2_w -112594565
    //   8035: l2i
    //   8036: ldc_w 1483166150
    //   8039: ixor
    //   8040: ixor
    //   8041: lookupswitch default -> 8068, 652006837 -> 8024, 1254039659 -> 20100
    //   8068: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8071: ldc2_w 167598899
    //   8074: l2i
    //   8075: ldc_w 167599052
    //   8078: ixor
    //   8079: getstatic Perryc.1 : I
    //   8082: ifeq -> 8096
    //   8085: ldc2_w -1560112195
    //   8088: l2i
    //   8089: ldc_w 932436024
    //   8092: ixor
    //   8093: goto -> 8104
    //   8096: ldc2_w -49441118
    //   8099: l2i
    //   8100: ldc_w -1945041507
    //   8103: ixor
    //   8104: ldc2_w -1591499659
    //   8107: l2i
    //   8108: ldc_w -189110242
    //   8111: ixor
    //   8112: ixor
    //   8113: lookupswitch default -> 8140, -1686727632 -> 8096, -1056405522 -> 20056
    //   8140: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8143: getstatic Perryc.c : I
    //   8146: iflt -> 8160
    //   8149: ldc2_w -450330479
    //   8152: l2i
    //   8153: ldc_w -607389382
    //   8156: ixor
    //   8157: goto -> 8168
    //   8160: ldc2_w 1761800689
    //   8163: l2i
    //   8164: ldc_w -1288870970
    //   8167: ixor
    //   8168: ldc2_w 1507526170
    //   8171: l2i
    //   8172: ldc_w 1454286347
    //   8175: ixor
    //   8176: ixor
    //   8177: lookupswitch default -> 19800, -715509210 -> 8204, 831969722 -> 8160
    //   8204: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   8207: getstatic Perryc.1 : I
    //   8210: ifeq -> 8224
    //   8213: ldc2_w 1912308816
    //   8216: l2i
    //   8217: ldc_w -314196105
    //   8220: ixor
    //   8221: goto -> 8232
    //   8224: ldc2_w 94704060
    //   8227: l2i
    //   8228: ldc_w -174951227
    //   8231: ixor
    //   8232: ldc2_w 1939522128
    //   8235: l2i
    //   8236: ldc_w -710862870
    //   8239: ixor
    //   8240: ixor
    //   8241: lookupswitch default -> 19662, 981855901 -> 8224, 1443672259 -> 8268
    //   8268: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8271: getstatic Perryc.1 : I
    //   8274: ifeq -> 8288
    //   8277: ldc2_w -1115848933
    //   8280: l2i
    //   8281: ldc_w -1418399950
    //   8284: ixor
    //   8285: goto -> 8296
    //   8288: ldc2_w -1022357665
    //   8291: l2i
    //   8292: ldc_w -134742267
    //   8295: ixor
    //   8296: ldc2_w -458126726
    //   8299: l2i
    //   8300: ldc_w 1771911705
    //   8303: ixor
    //   8304: ixor
    //   8305: lookupswitch default -> 19630, -1692065718 -> 8288, -1177862087 -> 8332
    //   8332: putfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8335: getstatic Perryc.1 : I
    //   8338: ifeq -> 8352
    //   8341: ldc2_w -1193704702
    //   8344: l2i
    //   8345: ldc_w -1263401659
    //   8348: ixor
    //   8349: goto -> 8360
    //   8352: ldc2_w -1200702541
    //   8355: l2i
    //   8356: ldc_w 1361923775
    //   8359: ixor
    //   8360: ldc2_w -102194822
    //   8363: l2i
    //   8364: ldc_w -1659977636
    //   8367: ixor
    //   8368: ixor
    //   8369: lookupswitch default -> 20030, -1918528470 -> 8396, 1754130273 -> 8352
    //   8396: aload_0
    //   8397: getstatic Perryc.c : I
    //   8400: iflt -> 8414
    //   8403: ldc2_w -2071444885
    //   8406: l2i
    //   8407: ldc_w -148467672
    //   8410: ixor
    //   8411: goto -> 8422
    //   8414: ldc2_w 1182228296
    //   8417: l2i
    //   8418: ldc_w 2113692118
    //   8421: ixor
    //   8422: ldc2_w -1333812108
    //   8425: l2i
    //   8426: ldc_w 1903896600
    //   8429: ixor
    //   8430: ixor
    //   8431: lookupswitch default -> 19998, -1297457617 -> 8414, -91245838 -> 8456
    //   8456: aload_0
    //   8457: new bigname/zprestige/webhack/features/setting/Setting
    //   8460: dup
    //   8461: ldc_w '┺㌟╩㶿銑'
    //   8464: getstatic Perryc.0 : I
    //   8467: ifle -> 8481
    //   8470: ldc2_w 14045430
    //   8473: l2i
    //   8474: ldc_w -818409548
    //   8477: ixor
    //   8478: goto -> 8489
    //   8481: ldc2_w -1983870320
    //   8484: l2i
    //   8485: ldc_w 1984862237
    //   8488: ixor
    //   8489: ldc2_w 973683626
    //   8492: l2i
    //   8493: ldc_w 518962417
    //   8496: ixor
    //   8497: ixor
    //   8498: lookupswitch default -> 19646, -613837354 -> 8524, -351676391 -> 8481
    //   8524: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8527: ldc2_w -1312113139
    //   8530: l2i
    //   8531: ldc_w -1312112910
    //   8534: ixor
    //   8535: getstatic Perryc.1 : I
    //   8538: ifeq -> 8552
    //   8541: ldc2_w 416963079
    //   8544: l2i
    //   8545: ldc_w 506268605
    //   8548: ixor
    //   8549: goto -> 8560
    //   8552: ldc2_w 1533946590
    //   8555: l2i
    //   8556: ldc_w 1182829723
    //   8559: ixor
    //   8560: ldc2_w 1102849120
    //   8563: l2i
    //   8564: ldc_w 456200295
    //   8567: ixor
    //   8568: ixor
    //   8569: lookupswitch default -> 8596, -843012233 -> 8552, 1551525309 -> 19546
    //   8596: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8599: ldc2_w 340531681
    //   8602: l2i
    //   8603: ldc_w 340531681
    //   8606: ixor
    //   8607: getstatic Perryc.0 : I
    //   8610: ifle -> 8624
    //   8613: ldc2_w -1661142066
    //   8616: l2i
    //   8617: ldc_w -611976324
    //   8620: ixor
    //   8621: goto -> 8632
    //   8624: ldc2_w 205104501
    //   8627: l2i
    //   8628: ldc_w -602686035
    //   8631: ixor
    //   8632: ldc2_w 1382412451
    //   8635: l2i
    //   8636: ldc_w -1746824127
    //   8639: ixor
    //   8640: ixor
    //   8641: lookupswitch default -> 8668, -2097322928 -> 19672, -1217081141 -> 8624
    //   8668: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8671: ldc2_w 703751938
    //   8674: l2i
    //   8675: ldc_w 703752189
    //   8678: ixor
    //   8679: getstatic Perryc.c : I
    //   8682: iflt -> 8696
    //   8685: ldc2_w -1742666563
    //   8688: l2i
    //   8689: ldc_w -568427866
    //   8692: ixor
    //   8693: goto -> 8704
    //   8696: ldc2_w -597136866
    //   8699: l2i
    //   8700: ldc_w -714814158
    //   8703: ixor
    //   8704: ldc2_w -881425424
    //   8707: l2i
    //   8708: ldc_w -410932482
    //   8711: ixor
    //   8712: ixor
    //   8713: lookupswitch default -> 8740, -2120191506 -> 8696, 1791514389 -> 19766
    //   8740: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8743: getstatic Perryc.0 : I
    //   8746: ifle -> 8760
    //   8749: ldc2_w -51897088
    //   8752: l2i
    //   8753: ldc_w 252390022
    //   8756: ixor
    //   8757: goto -> 8768
    //   8760: ldc2_w 1363179800
    //   8763: l2i
    //   8764: ldc_w -1178549561
    //   8767: ixor
    //   8768: ldc2_w -914045004
    //   8771: l2i
    //   8772: ldc_w -296662788
    //   8775: ixor
    //   8776: ixor
    //   8777: lookupswitch default -> 8804, -734611250 -> 20074, 283510067 -> 8760
    //   8804: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   8807: getstatic Perryc.1 : I
    //   8810: ifeq -> 8824
    //   8813: ldc2_w -466527286
    //   8816: l2i
    //   8817: ldc_w -1710545054
    //   8820: ixor
    //   8821: goto -> 8832
    //   8824: ldc2_w 25979898
    //   8827: l2i
    //   8828: ldc_w -343211525
    //   8831: ixor
    //   8832: ldc2_w 1187165067
    //   8835: l2i
    //   8836: ldc_w 1698444829
    //   8839: ixor
    //   8840: ixor
    //   8841: lookupswitch default -> 19936, -906367081 -> 8868, 1573189950 -> 8824
    //   8868: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8871: getstatic Perryc.1 : I
    //   8874: ifeq -> 8888
    //   8877: ldc2_w -1342925628
    //   8880: l2i
    //   8881: ldc_w 356999123
    //   8884: ixor
    //   8885: goto -> 8896
    //   8888: ldc2_w 2054767540
    //   8891: l2i
    //   8892: ldc_w -772216457
    //   8895: ixor
    //   8896: ldc2_w -1988853533
    //   8899: l2i
    //   8900: ldc_w 1441377326
    //   8903: ixor
    //   8904: ixor
    //   8905: lookupswitch default -> 19550, 1714350042 -> 8888, 1998358030 -> 8932
    //   8932: putfield alpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8935: getstatic Perryc.1 : I
    //   8938: ifeq -> 8952
    //   8941: ldc2_w 1664976842
    //   8944: l2i
    //   8945: ldc_w -301107420
    //   8948: ixor
    //   8949: goto -> 8960
    //   8952: ldc2_w 80029830
    //   8955: l2i
    //   8956: ldc_w 350970899
    //   8959: ixor
    //   8960: ldc2_w 964163143
    //   8963: l2i
    //   8964: ldc_w 587119562
    //   8967: ixor
    //   8968: ixor
    //   8969: lookupswitch default -> 19636, -1766212253 -> 8952, 195494168 -> 8996
    //   8996: aload_0
    //   8997: getstatic Perryc.c : I
    //   9000: iflt -> 9014
    //   9003: ldc2_w 1598984079
    //   9006: l2i
    //   9007: ldc_w 536211479
    //   9010: ixor
    //   9011: goto -> 9022
    //   9014: ldc2_w -664261298
    //   9017: l2i
    //   9018: ldc_w -1136736899
    //   9021: ixor
    //   9022: ldc2_w 1502516467
    //   9025: l2i
    //   9026: ldc_w 1828482045
    //   9029: ixor
    //   9030: ixor
    //   9031: lookupswitch default -> 19890, 1361319741 -> 9056, 1976139926 -> 9014
    //   9056: aload_0
    //   9057: new bigname/zprestige/webhack/features/setting/Setting
    //   9060: dup
    //   9061: ldc_w '┹㌜╡㶖銜쮷๱墿'
    //   9064: getstatic Perryc.c : I
    //   9067: iflt -> 9081
    //   9070: ldc2_w 237388791
    //   9073: l2i
    //   9074: ldc_w -1476252370
    //   9077: ixor
    //   9078: goto -> 9089
    //   9081: ldc2_w 2120472158
    //   9084: l2i
    //   9085: ldc_w 89525841
    //   9088: ixor
    //   9089: ldc2_w -44533845
    //   9092: l2i
    //   9093: ldc_w -1264428150
    //   9096: ixor
    //   9097: ixor
    //   9098: lookupswitch default -> 20010, -270646536 -> 9081, 852489262 -> 9124
    //   9124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9127: ldc2_w 1217797713
    //   9130: l2i
    //   9131: ldc_w 1217797676
    //   9134: ixor
    //   9135: getstatic Perryc.1 : I
    //   9138: ifeq -> 9152
    //   9141: ldc2_w -1495460066
    //   9144: l2i
    //   9145: ldc_w -354861441
    //   9148: ixor
    //   9149: goto -> 9160
    //   9152: ldc2_w -1339687175
    //   9155: l2i
    //   9156: ldc_w -750435086
    //   9159: ixor
    //   9160: ldc2_w 181378674
    //   9163: l2i
    //   9164: ldc_w -67024830
    //   9167: ixor
    //   9168: ixor
    //   9169: lookupswitch default -> 20066, -1783731141 -> 9196, -1161101487 -> 9152
    //   9196: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9199: ldc2_w 1208177490
    //   9202: l2i
    //   9203: ldc_w 1208177490
    //   9206: ixor
    //   9207: getstatic Perryc.1 : I
    //   9210: ifeq -> 9224
    //   9213: ldc2_w -933195087
    //   9216: l2i
    //   9217: ldc_w 1857027086
    //   9220: ixor
    //   9221: goto -> 9232
    //   9224: ldc2_w 1466714049
    //   9227: l2i
    //   9228: ldc_w -1708061876
    //   9231: ixor
    //   9232: ldc2_w 191996338
    //   9235: l2i
    //   9236: ldc_w 1068958559
    //   9239: ixor
    //   9240: ixor
    //   9241: lookupswitch default -> 9268, -1844851630 -> 19610, -1295782631 -> 9224
    //   9268: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9271: ldc2_w 112154593
    //   9274: l2i
    //   9275: ldc_w 112154398
    //   9278: ixor
    //   9279: getstatic Perryc.c : I
    //   9282: iflt -> 9296
    //   9285: ldc2_w -1076305593
    //   9288: l2i
    //   9289: ldc_w -1438492909
    //   9292: ixor
    //   9293: goto -> 9304
    //   9296: ldc2_w 1179274393
    //   9299: l2i
    //   9300: ldc_w -798731004
    //   9303: ixor
    //   9304: ldc2_w -1702967915
    //   9307: l2i
    //   9308: ldc_w -1037768931
    //   9311: ixor
    //   9312: ixor
    //   9313: lookupswitch default -> 9340, -257233288 -> 9296, 1304466652 -> 19876
    //   9340: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9343: getstatic Perryc.1 : I
    //   9346: ifeq -> 9360
    //   9349: ldc2_w 1231029210
    //   9352: l2i
    //   9353: ldc_w -1731625923
    //   9356: ixor
    //   9357: goto -> 9368
    //   9360: ldc2_w -1079143327
    //   9363: l2i
    //   9364: ldc_w 1875914820
    //   9367: ixor
    //   9368: ldc2_w -539040599
    //   9371: l2i
    //   9372: ldc_w -1022276810
    //   9375: ixor
    //   9376: ixor
    //   9377: lookupswitch default -> 19538, -860746822 -> 9404, -848899976 -> 9360
    //   9404: aload_0
    //   9405: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   9410: getstatic Perryc.1 : I
    //   9413: ifeq -> 9427
    //   9416: ldc2_w -1501289616
    //   9419: l2i
    //   9420: ldc_w -1465332919
    //   9423: ixor
    //   9424: goto -> 9435
    //   9427: ldc2_w -1352510205
    //   9430: l2i
    //   9431: ldc_w 1886045749
    //   9434: ixor
    //   9435: ldc2_w -669995204
    //   9438: l2i
    //   9439: ldc_w 81426060
    //   9442: ixor
    //   9443: ixor
    //   9444: lookupswitch default -> 9472, -1895895296 -> 9427, -756665975 -> 19576
    //   9472: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   9475: getstatic Perryc.1 : I
    //   9478: ifeq -> 9492
    //   9481: ldc2_w 339168569
    //   9484: l2i
    //   9485: ldc_w 14136953
    //   9488: ixor
    //   9489: goto -> 9500
    //   9492: ldc2_w 74608318
    //   9495: l2i
    //   9496: ldc_w 569970889
    //   9499: ixor
    //   9500: ldc2_w -1976582133
    //   9503: l2i
    //   9504: ldc_w 995202838
    //   9507: ixor
    //   9508: ixor
    //   9509: lookupswitch default -> 20000, -1795872406 -> 9536, -1516327843 -> 9492
    //   9536: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9539: getstatic Perryc.0 : I
    //   9542: ifle -> 9556
    //   9545: ldc2_w 678830613
    //   9548: l2i
    //   9549: ldc_w -1929043992
    //   9552: ixor
    //   9553: goto -> 9564
    //   9556: ldc2_w 140908132
    //   9559: l2i
    //   9560: ldc_w -34602312
    //   9563: ixor
    //   9564: ldc2_w -1672010041
    //   9567: l2i
    //   9568: ldc_w -1426798958
    //   9571: ixor
    //   9572: ixor
    //   9573: lookupswitch default -> 20026, -1815028312 -> 9556, -1019874167 -> 9600
    //   9600: putfield boxAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9603: getstatic Perryc.0 : I
    //   9606: ifle -> 9620
    //   9609: ldc2_w -358575026
    //   9612: l2i
    //   9613: ldc_w -98604414
    //   9616: ixor
    //   9617: goto -> 9628
    //   9620: ldc2_w 1632408691
    //   9623: l2i
    //   9624: ldc_w 1142726916
    //   9627: ixor
    //   9628: ldc2_w 776516887
    //   9631: l2i
    //   9632: ldc_w 1533340510
    //   9635: ixor
    //   9636: ixor
    //   9637: lookupswitch default -> 19846, 1350331198 -> 9664, 1704173701 -> 9620
    //   9664: aload_0
    //   9665: getstatic Perryc.0 : I
    //   9668: ifle -> 9682
    //   9671: ldc2_w -1164651861
    //   9674: l2i
    //   9675: ldc_w 427258130
    //   9678: ixor
    //   9679: goto -> 9690
    //   9682: ldc2_w 553078795
    //   9685: l2i
    //   9686: ldc_w 330609420
    //   9689: ixor
    //   9690: ldc2_w -485528766
    //   9693: l2i
    //   9694: ldc_w 265078696
    //   9697: ixor
    //   9698: ixor
    //   9699: lookupswitch default -> 19606, -545239059 -> 9724, 1327501139 -> 9682
    //   9724: aload_0
    //   9725: new bigname/zprestige/webhack/features/setting/Setting
    //   9728: dup
    //   9729: ldc_w '┷㌚╷㶲銧쮮๽墪蹫'
    //   9732: getstatic Perryc.c : I
    //   9735: iflt -> 9749
    //   9738: ldc2_w 849164334
    //   9741: l2i
    //   9742: ldc_w -2037161793
    //   9745: ixor
    //   9746: goto -> 9757
    //   9749: ldc2_w -658997104
    //   9752: l2i
    //   9753: ldc_w 1350290157
    //   9756: ixor
    //   9757: ldc2_w 569342878
    //   9760: l2i
    //   9761: ldc_w -84965244
    //   9764: ixor
    //   9765: ixor
    //   9766: lookupswitch default -> 20082, 1405335911 -> 9792, 1863232395 -> 9749
    //   9792: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9795: ldc_w 4.980416
    //   9798: invokestatic floatToIntBits : (F)I
    //   9801: ldc_w 2132762513
    //   9804: ixor
    //   9805: invokestatic intBitsToFloat : (I)F
    //   9808: getstatic Perryc.0 : I
    //   9811: ifle -> 9825
    //   9814: ldc2_w 591345415
    //   9817: l2i
    //   9818: ldc_w 1727167786
    //   9821: ixor
    //   9822: goto -> 9833
    //   9825: ldc2_w 2107743029
    //   9828: l2i
    //   9829: ldc_w 951357696
    //   9832: ixor
    //   9833: ldc2_w -1777536473
    //   9836: l2i
    //   9837: ldc_w 1633029545
    //   9840: ixor
    //   9841: ixor
    //   9842: lookupswitch default -> 9868, -1298680413 -> 19776, 635595235 -> 9825
    //   9868: invokestatic valueOf : (F)Ljava/lang/Float;
    //   9871: ldc_w 97.35679
    //   9874: invokestatic floatToIntBits : (F)I
    //   9877: ldc_w 2131655264
    //   9880: ixor
    //   9881: invokestatic intBitsToFloat : (I)F
    //   9884: getstatic Perryc.1 : I
    //   9887: ifeq -> 9901
    //   9890: ldc2_w -1717427944
    //   9893: l2i
    //   9894: ldc_w 454924443
    //   9897: ixor
    //   9898: goto -> 9909
    //   9901: ldc2_w -1525237882
    //   9904: l2i
    //   9905: ldc_w -1116444291
    //   9908: ixor
    //   9909: ldc2_w -528951937
    //   9912: l2i
    //   9913: ldc_w 232759205
    //   9916: ixor
    //   9917: ixor
    //   9918: lookupswitch default -> 9944, 168768985 -> 9901, 1863906137 -> 19622
    //   9944: invokestatic valueOf : (F)Ljava/lang/Float;
    //   9947: ldc_w 1.8569905
    //   9950: invokestatic floatToIntBits : (F)I
    //   9953: ldc_w 2135798237
    //   9956: ixor
    //   9957: invokestatic intBitsToFloat : (I)F
    //   9960: getstatic Perryc.0 : I
    //   9963: ifle -> 9977
    //   9966: ldc2_w 1276842703
    //   9969: l2i
    //   9970: ldc_w -1978288573
    //   9973: ixor
    //   9974: goto -> 9985
    //   9977: ldc2_w 140110058
    //   9980: l2i
    //   9981: ldc_w 2136343618
    //   9984: ixor
    //   9985: ldc2_w 1116477229
    //   9988: l2i
    //   9989: ldc_w -52052974
    //   9992: ixor
    //   9993: ixor
    //   9994: lookupswitch default -> 10020, 2020020147 -> 19564, 2073928572 -> 9977
    //   10020: invokestatic valueOf : (F)Ljava/lang/Float;
    //   10023: getstatic Perryc.c : I
    //   10026: iflt -> 10040
    //   10029: ldc2_w -1323039606
    //   10032: l2i
    //   10033: ldc_w 786730357
    //   10036: ixor
    //   10037: goto -> 10048
    //   10040: ldc2_w 2112090540
    //   10043: l2i
    //   10044: ldc_w -443018601
    //   10047: ixor
    //   10048: ldc2_w 1914210430
    //   10051: l2i
    //   10052: ldc_w -522402212
    //   10055: ixor
    //   10056: ixor
    //   10057: lookupswitch default -> 10084, 218417117 -> 19596, 596210176 -> 10040
    //   10084: aload_0
    //   10085: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   10090: getstatic Perryc.1 : I
    //   10093: ifeq -> 10107
    //   10096: ldc2_w -1787152868
    //   10099: l2i
    //   10100: ldc_w -830726881
    //   10103: ixor
    //   10104: goto -> 10115
    //   10107: ldc2_w 513168010
    //   10110: l2i
    //   10111: ldc_w -973199181
    //   10114: ixor
    //   10115: ldc2_w 1086582907
    //   10118: l2i
    //   10119: ldc_w -940128950
    //   10122: ixor
    //   10123: ixor
    //   10124: lookupswitch default -> 10152, -1142885049 -> 10107, -600629710 -> 19702
    //   10152: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   10155: getstatic Perryc.c : I
    //   10158: iflt -> 10172
    //   10161: ldc2_w 720423300
    //   10164: l2i
    //   10165: ldc_w 1213987574
    //   10168: ixor
    //   10169: goto -> 10180
    //   10172: ldc2_w 709478833
    //   10175: l2i
    //   10176: ldc_w -1485696396
    //   10179: ixor
    //   10180: ldc2_w 1203814319
    //   10183: l2i
    //   10184: ldc_w 1368680683
    //   10187: ixor
    //   10188: ixor
    //   10189: lookupswitch default -> 20104, -1687221119 -> 10216, 1962927158 -> 10172
    //   10216: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10219: getstatic Perryc.0 : I
    //   10222: ifle -> 10236
    //   10225: ldc2_w -1233247588
    //   10228: l2i
    //   10229: ldc_w -1084322207
    //   10232: ixor
    //   10233: goto -> 10244
    //   10236: ldc2_w 1004554777
    //   10239: l2i
    //   10240: ldc_w -1942642728
    //   10243: ixor
    //   10244: ldc2_w 269488096
    //   10247: l2i
    //   10248: ldc_w 1241268842
    //   10251: ixor
    //   10252: ixor
    //   10253: lookupswitch default -> 10280, 987637558 -> 10236, 1355604343 -> 19556
    //   10280: putfield lineWidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10283: getstatic Perryc.1 : I
    //   10286: ifeq -> 10300
    //   10289: ldc2_w -1856765732
    //   10292: l2i
    //   10293: ldc_w -1522657684
    //   10296: ixor
    //   10297: goto -> 10308
    //   10300: ldc2_w 528201664
    //   10303: l2i
    //   10304: ldc_w -860004122
    //   10307: ixor
    //   10308: ldc2_w -1346717847
    //   10311: l2i
    //   10312: ldc_w 177106529
    //   10315: ixor
    //   10316: ixor
    //   10317: lookupswitch default -> 10344, -1856057416 -> 19916, -1230938204 -> 10300
    //   10344: aload_0
    //   10345: getstatic Perryc.1 : I
    //   10348: ifeq -> 10362
    //   10351: ldc2_w -35368130
    //   10354: l2i
    //   10355: ldc_w -1762053421
    //   10358: ixor
    //   10359: goto -> 10370
    //   10362: ldc2_w -1218976248
    //   10365: l2i
    //   10366: ldc_w 832375237
    //   10369: ixor
    //   10370: ldc2_w 585784579
    //   10373: l2i
    //   10374: ldc_w -421637808
    //   10377: ixor
    //   10378: ixor
    //   10379: lookupswitch default -> 20054, -1356239426 -> 10362, 1124000670 -> 10404
    //   10404: aload_0
    //   10405: new bigname/zprestige/webhack/features/setting/Setting
    //   10408: dup
    //   10409: ldc_w '┹㌖╽㶥銟쮤๲墝蹬칢鷏ਵ'
    //   10412: getstatic Perryc.0 : I
    //   10415: ifle -> 10429
    //   10418: ldc2_w 1207243958
    //   10421: l2i
    //   10422: ldc_w 1610564403
    //   10425: ixor
    //   10426: goto -> 10437
    //   10429: ldc2_w 630788643
    //   10432: l2i
    //   10433: ldc_w 1769691217
    //   10436: ixor
    //   10437: ldc2_w 1877141307
    //   10440: l2i
    //   10441: ldc_w -1601044605
    //   10444: ixor
    //   10445: ixor
    //   10446: lookupswitch default -> 20108, -2087628086 -> 10472, -679915715 -> 10429
    //   10472: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10475: ldc2_w -1730597456
    //   10478: l2i
    //   10479: ldc_w -1730597456
    //   10482: ixor
    //   10483: getstatic Perryc.0 : I
    //   10486: ifle -> 10500
    //   10489: ldc2_w -85374710
    //   10492: l2i
    //   10493: ldc_w -230082814
    //   10496: ixor
    //   10497: goto -> 10508
    //   10500: ldc2_w 966068397
    //   10503: l2i
    //   10504: ldc_w 213854048
    //   10507: ixor
    //   10508: ldc2_w -1997659759
    //   10511: l2i
    //   10512: ldc_w -1641827035
    //   10515: ixor
    //   10516: ixor
    //   10517: lookupswitch default -> 10544, -1700000233 -> 10500, 510519996 -> 19724
    //   10544: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   10547: getstatic Perryc.c : I
    //   10550: iflt -> 10564
    //   10553: ldc2_w -366835361
    //   10556: l2i
    //   10557: ldc_w 271466264
    //   10560: ixor
    //   10561: goto -> 10572
    //   10564: ldc2_w -53397661
    //   10567: l2i
    //   10568: ldc_w 1720216914
    //   10571: ixor
    //   10572: ldc2_w -1818439023
    //   10575: l2i
    //   10576: ldc_w 928906075
    //   10579: ixor
    //   10580: ixor
    //   10581: lookupswitch default -> 10608, 18022974 -> 10564, 1590534029 -> 19956
    //   10608: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   10611: getstatic Perryc.c : I
    //   10614: iflt -> 10628
    //   10617: ldc2_w 719911193
    //   10620: l2i
    //   10621: ldc_w -1237525350
    //   10624: ixor
    //   10625: goto -> 10636
    //   10628: ldc2_w -1790903609
    //   10631: l2i
    //   10632: ldc_w 1168495139
    //   10635: ixor
    //   10636: ldc2_w -1302506464
    //   10639: l2i
    //   10640: ldc_w 1004892074
    //   10643: ixor
    //   10644: ixor
    //   10645: lookupswitch default -> 10672, 359407113 -> 19844, 725568126 -> 10628
    //   10672: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10675: getstatic Perryc.1 : I
    //   10678: ifeq -> 10692
    //   10681: ldc2_w -375393828
    //   10684: l2i
    //   10685: ldc_w -898928699
    //   10688: ixor
    //   10689: goto -> 10700
    //   10692: ldc2_w -610958306
    //   10695: l2i
    //   10696: ldc_w -91703653
    //   10699: ixor
    //   10700: ldc2_w 1049095224
    //   10703: l2i
    //   10704: ldc_w -2000919243
    //   10707: ixor
    //   10708: ixor
    //   10709: lookupswitch default -> 20016, -1781590252 -> 10692, -1759069304 -> 10736
    //   10736: putfield safeColor : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10739: getstatic Perryc.c : I
    //   10742: iflt -> 10756
    //   10745: ldc2_w 1891769824
    //   10748: l2i
    //   10749: ldc_w 1544900767
    //   10752: ixor
    //   10753: goto -> 10764
    //   10756: ldc2_w -817977480
    //   10759: l2i
    //   10760: ldc_w -1033048308
    //   10763: ixor
    //   10764: ldc2_w -336944278
    //   10767: l2i
    //   10768: ldc_w -2025127775
    //   10771: ixor
    //   10772: ixor
    //   10773: lookupswitch default -> 10800, 792878358 -> 10756, 1081536180 -> 19602
    //   10800: aload_0
    //   10801: getstatic Perryc.1 : I
    //   10804: ifeq -> 10818
    //   10807: ldc2_w -389918386
    //   10810: l2i
    //   10811: ldc_w -895760416
    //   10814: ixor
    //   10815: goto -> 10826
    //   10818: ldc2_w -669342003
    //   10821: l2i
    //   10822: ldc_w 1973485306
    //   10825: ixor
    //   10826: ldc2_w -1546997376
    //   10829: l2i
    //   10830: ldc_w 1001265274
    //   10833: ixor
    //   10834: ixor
    //   10835: lookupswitch default -> 10860, -1170391212 -> 19786, 667897824 -> 10818
    //   10860: aload_0
    //   10861: new bigname/zprestige/webhack/features/setting/Setting
    //   10864: dup
    //   10865: ldc_w '┹㌖╽㶥銟쮤๲墌蹦칪'
    //   10868: getstatic Perryc.0 : I
    //   10871: ifle -> 10885
    //   10874: ldc2_w 82743571
    //   10877: l2i
    //   10878: ldc_w 27721296
    //   10881: ixor
    //   10882: goto -> 10893
    //   10885: ldc2_w 740460257
    //   10888: l2i
    //   10889: ldc_w -1598114522
    //   10892: ixor
    //   10893: ldc2_w -30526946
    //   10896: l2i
    //   10897: ldc_w 1184540303
    //   10900: ixor
    //   10901: ixor
    //   10902: lookupswitch default -> 10928, -1107493934 -> 19900, 237782185 -> 10885
    //   10928: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10931: ldc2_w 1595800652
    //   10934: l2i
    //   10935: ldc_w 1595800652
    //   10938: ixor
    //   10939: getstatic Perryc.1 : I
    //   10942: ifeq -> 10956
    //   10945: ldc2_w 1339157054
    //   10948: l2i
    //   10949: ldc_w -127040724
    //   10952: ixor
    //   10953: goto -> 10964
    //   10956: ldc2_w -942521753
    //   10959: l2i
    //   10960: ldc_w -1965227721
    //   10963: ixor
    //   10964: ldc2_w 1824787894
    //   10967: l2i
    //   10968: ldc_w 1928569686
    //   10971: ixor
    //   10972: ixor
    //   10973: lookupswitch default -> 11000, -1450457102 -> 19624, 1190083589 -> 10956
    //   11000: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11003: ldc2_w 84237970
    //   11006: l2i
    //   11007: ldc_w 84237970
    //   11010: ixor
    //   11011: getstatic Perryc.1 : I
    //   11014: ifeq -> 11028
    //   11017: ldc2_w 354786199
    //   11020: l2i
    //   11021: ldc_w 2118219685
    //   11024: ixor
    //   11025: goto -> 11036
    //   11028: ldc2_w 1981786677
    //   11031: l2i
    //   11032: ldc_w 1961181434
    //   11035: ixor
    //   11036: ldc2_w 616050641
    //   11039: l2i
    //   11040: ldc_w -930091405
    //   11043: ixor
    //   11044: ixor
    //   11045: lookupswitch default -> 11072, -2024591984 -> 20046, -1983177893 -> 11028
    //   11072: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11075: ldc2_w 1300799549
    //   11078: l2i
    //   11079: ldc_w 1300799682
    //   11082: ixor
    //   11083: getstatic Perryc.1 : I
    //   11086: ifeq -> 11100
    //   11089: ldc2_w 774394209
    //   11092: l2i
    //   11093: ldc_w 1039646624
    //   11096: ixor
    //   11097: goto -> 11108
    //   11100: ldc2_w -51537683
    //   11103: l2i
    //   11104: ldc_w -795957724
    //   11107: ixor
    //   11108: ldc2_w 594276024
    //   11111: l2i
    //   11112: ldc_w -508149396
    //   11115: ixor
    //   11116: ixor
    //   11117: lookupswitch default -> 19684, -788381419 -> 11100, -289500899 -> 11144
    //   11144: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11147: getstatic Perryc.1 : I
    //   11150: ifeq -> 11164
    //   11153: ldc2_w 1307300662
    //   11156: l2i
    //   11157: ldc_w -709345448
    //   11160: ixor
    //   11161: goto -> 11172
    //   11164: ldc2_w -1679821878
    //   11167: l2i
    //   11168: ldc_w 1127327767
    //   11171: ixor
    //   11172: ldc2_w -331234148
    //   11175: l2i
    //   11176: ldc_w -1098167470
    //   11179: ixor
    //   11180: ixor
    //   11181: lookupswitch default -> 19584, -1977297901 -> 11208, -895917152 -> 11164
    //   11208: aload_0
    //   11209: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   11214: getstatic Perryc.c : I
    //   11217: iflt -> 11231
    //   11220: ldc2_w 1582531180
    //   11223: l2i
    //   11224: ldc_w -1419016656
    //   11227: ixor
    //   11228: goto -> 11239
    //   11231: ldc2_w -1746097331
    //   11234: l2i
    //   11235: ldc_w -372205990
    //   11238: ixor
    //   11239: ldc2_w 262790638
    //   11242: l2i
    //   11243: ldc_w -1150322209
    //   11246: ixor
    //   11247: ixor
    //   11248: lookupswitch default -> 11276, -1817584878 -> 11231, 1107206253 -> 20038
    //   11276: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   11279: getstatic Perryc.0 : I
    //   11282: ifle -> 11296
    //   11285: ldc2_w 1398477771
    //   11288: l2i
    //   11289: ldc_w -2107780744
    //   11292: ixor
    //   11293: goto -> 11304
    //   11296: ldc2_w 1142329352
    //   11299: l2i
    //   11300: ldc_w 462921992
    //   11303: ixor
    //   11304: ldc2_w 283973742
    //   11307: l2i
    //   11308: ldc_w 661432462
    //   11311: ixor
    //   11312: ixor
    //   11313: lookupswitch default -> 19990, -427330989 -> 11296, 1744863712 -> 11340
    //   11340: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   11343: getstatic Perryc.1 : I
    //   11346: ifeq -> 11360
    //   11349: ldc2_w 751953974
    //   11352: l2i
    //   11353: ldc_w 1262918833
    //   11356: ixor
    //   11357: goto -> 11368
    //   11360: ldc2_w -1100762460
    //   11363: l2i
    //   11364: ldc_w 1939007816
    //   11367: ixor
    //   11368: ldc2_w -1075455954
    //   11371: l2i
    //   11372: ldc_w -267124633
    //   11375: ixor
    //   11376: ixor
    //   11377: lookupswitch default -> 11404, 389721766 -> 11360, 677817550 -> 19640
    //   11404: putfield safeRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11407: getstatic Perryc.c : I
    //   11410: iflt -> 11424
    //   11413: ldc2_w -1517045012
    //   11416: l2i
    //   11417: ldc_w -726235575
    //   11420: ixor
    //   11421: goto -> 11432
    //   11424: ldc2_w -1091131371
    //   11427: l2i
    //   11428: ldc_w 1077812042
    //   11431: ixor
    //   11432: ldc2_w 115500534
    //   11435: l2i
    //   11436: ldc_w 1751387176
    //   11439: ixor
    //   11440: ixor
    //   11441: lookupswitch default -> 19970, -1873880447 -> 11468, 530797947 -> 11424
    //   11468: aload_0
    //   11469: getstatic Perryc.c : I
    //   11472: iflt -> 11486
    //   11475: ldc2_w -972790327
    //   11478: l2i
    //   11479: ldc_w -1787097595
    //   11482: ixor
    //   11483: goto -> 11494
    //   11486: ldc2_w -1723177315
    //   11489: l2i
    //   11490: ldc_w 145900919
    //   11493: ixor
    //   11494: ldc2_w -1689687535
    //   11497: l2i
    //   11498: ldc_w 2078512443
    //   11501: ixor
    //   11502: ixor
    //   11503: lookupswitch default -> 11528, -1277848346 -> 19748, 398564768 -> 11486
    //   11528: aload_0
    //   11529: new bigname/zprestige/webhack/features/setting/Setting
    //   11532: dup
    //   11533: ldc_w '┹㌖╽㶥銟쮤๲墙蹱칫鷅਩'
    //   11536: getstatic Perryc.0 : I
    //   11539: ifle -> 11553
    //   11542: ldc2_w 1373505263
    //   11545: l2i
    //   11546: ldc_w 1342550576
    //   11549: ixor
    //   11550: goto -> 11561
    //   11553: ldc2_w -70703480
    //   11556: l2i
    //   11557: ldc_w 1521240229
    //   11560: ixor
    //   11561: ldc2_w 385005875
    //   11564: l2i
    //   11565: ldc_w 1563793709
    //   11568: ixor
    //   11569: ixor
    //   11570: lookupswitch default -> 11596, 1243387073 -> 19774, 1837685099 -> 11553
    //   11596: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   11599: ldc2_w 2074097773
    //   11602: l2i
    //   11603: ldc_w 2074097810
    //   11606: ixor
    //   11607: getstatic Perryc.1 : I
    //   11610: ifeq -> 11624
    //   11613: ldc2_w 1909898130
    //   11616: l2i
    //   11617: ldc_w -165557735
    //   11620: ixor
    //   11621: goto -> 11632
    //   11624: ldc2_w -70827126
    //   11627: l2i
    //   11628: ldc_w -339934607
    //   11631: ixor
    //   11632: ldc2_w 459639243
    //   11635: l2i
    //   11636: ldc_w 2020151768
    //   11639: ixor
    //   11640: ixor
    //   11641: lookupswitch default -> 19738, -453252712 -> 11624, 1937168872 -> 11668
    //   11668: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11671: ldc2_w -1938695724
    //   11674: l2i
    //   11675: ldc_w -1938695724
    //   11678: ixor
    //   11679: getstatic Perryc.1 : I
    //   11682: ifeq -> 11696
    //   11685: ldc2_w -338201953
    //   11688: l2i
    //   11689: ldc_w -1063522491
    //   11692: ixor
    //   11693: goto -> 11704
    //   11696: ldc2_w 1575538337
    //   11699: l2i
    //   11700: ldc_w -1681694719
    //   11703: ixor
    //   11704: ldc2_w 1953695453
    //   11707: l2i
    //   11708: ldc_w -1632697478
    //   11711: ixor
    //   11712: ixor
    //   11713: lookupswitch default -> 11740, -1047488387 -> 19704, 1926798194 -> 11696
    //   11740: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11743: ldc2_w 1418804034
    //   11746: l2i
    //   11747: ldc_w 1418804157
    //   11750: ixor
    //   11751: getstatic Perryc.c : I
    //   11754: iflt -> 11768
    //   11757: ldc2_w -893602066
    //   11760: l2i
    //   11761: ldc_w 453090358
    //   11764: ixor
    //   11765: goto -> 11776
    //   11768: ldc2_w -107261520
    //   11771: l2i
    //   11772: ldc_w 579204050
    //   11775: ixor
    //   11776: ldc2_w 357700078
    //   11779: l2i
    //   11780: ldc_w -1813333273
    //   11783: ixor
    //   11784: ixor
    //   11785: lookupswitch default -> 19590, 1459978705 -> 11768, 1571162475 -> 11812
    //   11812: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11815: getstatic Perryc.c : I
    //   11818: iflt -> 11832
    //   11821: ldc2_w 517308192
    //   11824: l2i
    //   11825: ldc_w 2084526924
    //   11828: ixor
    //   11829: goto -> 11840
    //   11832: ldc2_w 482277017
    //   11835: l2i
    //   11836: ldc_w -1718036816
    //   11839: ixor
    //   11840: ldc2_w -744943047
    //   11843: l2i
    //   11844: ldc_w 702544536
    //   11847: ixor
    //   11848: ixor
    //   11849: lookupswitch default -> 11876, -1733505843 -> 19934, 351424770 -> 11832
    //   11876: aload_0
    //   11877: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   11882: getstatic Perryc.0 : I
    //   11885: ifle -> 11899
    //   11888: ldc2_w -1096307386
    //   11891: l2i
    //   11892: ldc_w -1997128373
    //   11895: ixor
    //   11896: goto -> 11907
    //   11899: ldc2_w -554450616
    //   11902: l2i
    //   11903: ldc_w 1805856923
    //   11906: ixor
    //   11907: ldc2_w -241197754
    //   11910: l2i
    //   11911: ldc_w -474943803
    //   11914: ixor
    //   11915: ixor
    //   11916: lookupswitch default -> 19856, -1484815792 -> 11944, 612295566 -> 11899
    //   11944: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   11947: getstatic Perryc.c : I
    //   11950: iflt -> 11964
    //   11953: ldc2_w 1764203521
    //   11956: l2i
    //   11957: ldc_w 519967835
    //   11960: ixor
    //   11961: goto -> 11972
    //   11964: ldc2_w 1147147717
    //   11967: l2i
    //   11968: ldc_w -831122703
    //   11971: ixor
    //   11972: ldc2_w 1157157288
    //   11975: l2i
    //   11976: ldc_w 497314104
    //   11979: ixor
    //   11980: ixor
    //   11981: lookupswitch default -> 12008, -590357366 -> 11964, 780480714 -> 20080
    //   12008: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   12011: getstatic Perryc.c : I
    //   12014: iflt -> 12028
    //   12017: ldc2_w -1888011849
    //   12020: l2i
    //   12021: ldc_w -1217143299
    //   12024: ixor
    //   12025: goto -> 12036
    //   12028: ldc2_w -737717184
    //   12031: l2i
    //   12032: ldc_w 476670556
    //   12035: ixor
    //   12036: ldc2_w 1471269571
    //   12039: l2i
    //   12040: ldc_w 1018740703
    //   12043: ixor
    //   12044: ixor
    //   12045: lookupswitch default -> 12072, -1050829116 -> 12028, 1393398102 -> 19730
    //   12072: putfield safeGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12075: getstatic Perryc.c : I
    //   12078: iflt -> 12092
    //   12081: ldc2_w -1222273493
    //   12084: l2i
    //   12085: ldc_w -1691254744
    //   12088: ixor
    //   12089: goto -> 12100
    //   12092: ldc2_w 1985279897
    //   12095: l2i
    //   12096: ldc_w 1892456844
    //   12099: ixor
    //   12100: ldc2_w 1198138789
    //   12103: l2i
    //   12104: ldc_w 76876561
    //   12107: ixor
    //   12108: ixor
    //   12109: lookupswitch default -> 19768, 1164394657 -> 12136, 1877686455 -> 12092
    //   12136: aload_0
    //   12137: getstatic Perryc.c : I
    //   12140: iflt -> 12154
    //   12143: ldc2_w -1578735887
    //   12146: l2i
    //   12147: ldc_w -646322973
    //   12150: ixor
    //   12151: goto -> 12162
    //   12154: ldc2_w -762675071
    //   12157: l2i
    //   12158: ldc_w 814897
    //   12161: ixor
    //   12162: ldc2_w -923114978
    //   12165: l2i
    //   12166: ldc_w -1312424723
    //   12169: ixor
    //   12170: ixor
    //   12171: lookupswitch default -> 12196, -1990529004 -> 12154, 27270369 -> 19958
    //   12196: aload_0
    //   12197: new bigname/zprestige/webhack/features/setting/Setting
    //   12200: dup
    //   12201: ldc_w '┹㌖╽㶥銟쮤๲墜蹯칻鷅'
    //   12204: getstatic Perryc.1 : I
    //   12207: ifeq -> 12221
    //   12210: ldc2_w 1742326049
    //   12213: l2i
    //   12214: ldc_w -867821888
    //   12217: ixor
    //   12218: goto -> 12229
    //   12221: ldc2_w -747072103
    //   12224: l2i
    //   12225: ldc_w -50661415
    //   12228: ixor
    //   12229: ldc2_w 565633056
    //   12232: l2i
    //   12233: ldc_w 1567871321
    //   12236: ixor
    //   12237: ixor
    //   12238: lookupswitch default -> 12264, -681906536 -> 19898, 1426149716 -> 12221
    //   12264: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   12267: ldc2_w 738608769
    //   12270: l2i
    //   12271: ldc_w 738608769
    //   12274: ixor
    //   12275: getstatic Perryc.0 : I
    //   12278: ifle -> 12292
    //   12281: ldc2_w 1865425088
    //   12284: l2i
    //   12285: ldc_w 611083272
    //   12288: ixor
    //   12289: goto -> 12300
    //   12292: ldc2_w 1653882110
    //   12295: l2i
    //   12296: ldc_w -2106437925
    //   12299: ixor
    //   12300: ldc2_w -380608775
    //   12303: l2i
    //   12304: ldc_w -813385230
    //   12307: ixor
    //   12308: ixor
    //   12309: lookupswitch default -> 19552, -969763538 -> 12336, 1837671363 -> 12292
    //   12336: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12339: ldc2_w 1437275479
    //   12342: l2i
    //   12343: ldc_w 1437275479
    //   12346: ixor
    //   12347: getstatic Perryc.c : I
    //   12350: iflt -> 12364
    //   12353: ldc2_w -1749853571
    //   12356: l2i
    //   12357: ldc_w -865563405
    //   12360: ixor
    //   12361: goto -> 12372
    //   12364: ldc2_w 393955792
    //   12367: l2i
    //   12368: ldc_w -1150595275
    //   12371: ixor
    //   12372: ldc2_w -1674299613
    //   12375: l2i
    //   12376: ldc_w -1343272756
    //   12379: ixor
    //   12380: ixor
    //   12381: lookupswitch default -> 12408, -1511202837 -> 12364, 1744873825 -> 20092
    //   12408: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12411: ldc2_w -1574180142
    //   12414: l2i
    //   12415: ldc_w -1574180307
    //   12418: ixor
    //   12419: getstatic Perryc.1 : I
    //   12422: ifeq -> 12436
    //   12425: ldc2_w -1618193828
    //   12428: l2i
    //   12429: ldc_w 36393040
    //   12432: ixor
    //   12433: goto -> 12444
    //   12436: ldc2_w 1470632992
    //   12439: l2i
    //   12440: ldc_w 1128141418
    //   12443: ixor
    //   12444: ldc2_w -1689814478
    //   12447: l2i
    //   12448: ldc_w -1150121090
    //   12451: ixor
    //   12452: ixor
    //   12453: lookupswitch default -> 20040, -1114442944 -> 12436, 883160838 -> 12480
    //   12480: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12483: getstatic Perryc.1 : I
    //   12486: ifeq -> 12500
    //   12489: ldc2_w -835948888
    //   12492: l2i
    //   12493: ldc_w -1150613337
    //   12496: ixor
    //   12497: goto -> 12508
    //   12500: ldc2_w 2065033727
    //   12503: l2i
    //   12504: ldc_w 840673648
    //   12507: ixor
    //   12508: ldc2_w -1541705514
    //   12511: l2i
    //   12512: ldc_w -144636989
    //   12515: ixor
    //   12516: ixor
    //   12517: lookupswitch default -> 19690, 443823002 -> 12544, 641537306 -> 12500
    //   12544: aload_0
    //   12545: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   12550: getstatic Perryc.0 : I
    //   12553: ifle -> 12567
    //   12556: ldc2_w 673466537
    //   12559: l2i
    //   12560: ldc_w -756586782
    //   12563: ixor
    //   12564: goto -> 12575
    //   12567: ldc2_w 729980154
    //   12570: l2i
    //   12571: ldc_w 1568323275
    //   12574: ixor
    //   12575: ldc2_w -2076581390
    //   12578: l2i
    //   12579: ldc_w -818826017
    //   12582: ixor
    //   12583: ixor
    //   12584: lookupswitch default -> 19878, -1312064666 -> 12567, 1039171356 -> 12612
    //   12612: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   12615: getstatic Perryc.0 : I
    //   12618: ifle -> 12632
    //   12621: ldc2_w -1676286600
    //   12624: l2i
    //   12625: ldc_w -1576748904
    //   12628: ixor
    //   12629: goto -> 12640
    //   12632: ldc2_w -1186325031
    //   12635: l2i
    //   12636: ldc_w -1742459837
    //   12639: ixor
    //   12640: ldc2_w 748318121
    //   12643: l2i
    //   12644: ldc_w -1336968089
    //   12647: ixor
    //   12648: ixor
    //   12649: lookupswitch default -> 19642, -1564193746 -> 12632, -1111809964 -> 12676
    //   12676: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   12679: getstatic Perryc.1 : I
    //   12682: ifeq -> 12696
    //   12685: ldc2_w -2101026375
    //   12688: l2i
    //   12689: ldc_w 1539992396
    //   12692: ixor
    //   12693: goto -> 12704
    //   12696: ldc2_w 318063243
    //   12699: l2i
    //   12700: ldc_w -238390331
    //   12703: ixor
    //   12704: ldc2_w 2059570690
    //   12707: l2i
    //   12708: ldc_w 60843780
    //   12711: ixor
    //   12712: ixor
    //   12713: lookupswitch default -> 12740, -1603509261 -> 19678, -1080913449 -> 12696
    //   12740: putfield safeBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12743: getstatic Perryc.1 : I
    //   12746: ifeq -> 12760
    //   12749: ldc2_w 464388860
    //   12752: l2i
    //   12753: ldc_w -1068527786
    //   12756: ixor
    //   12757: goto -> 12768
    //   12760: ldc2_w 1502693797
    //   12763: l2i
    //   12764: ldc_w -1584124818
    //   12767: ixor
    //   12768: ldc2_w 216985235
    //   12771: l2i
    //   12772: ldc_w 208785405
    //   12775: ixor
    //   12776: ixor
    //   12777: lookupswitch default -> 12804, -612455228 -> 19908, -404673880 -> 12760
    //   12804: aload_0
    //   12805: getstatic Perryc.1 : I
    //   12808: ifeq -> 12822
    //   12811: ldc2_w 1561553793
    //   12814: l2i
    //   12815: ldc_w -926597478
    //   12818: ixor
    //   12819: goto -> 12830
    //   12822: ldc2_w -1806205613
    //   12825: l2i
    //   12826: ldc_w 1971238992
    //   12829: ixor
    //   12830: ldc2_w 1168923587
    //   12833: l2i
    //   12834: ldc_w -1929568465
    //   12837: ixor
    //   12838: ixor
    //   12839: lookupswitch default -> 19644, 678986223 -> 12864, 1552355831 -> 12822
    //   12864: aload_0
    //   12865: new bigname/zprestige/webhack/features/setting/Setting
    //   12868: dup
    //   12869: ldc_w '┹㌖╽㶥銟쮤๲墟蹯칾鷈ਦ'
    //   12872: getstatic Perryc.c : I
    //   12875: iflt -> 12889
    //   12878: ldc2_w 771906708
    //   12881: l2i
    //   12882: ldc_w 1213232819
    //   12885: ixor
    //   12886: goto -> 12897
    //   12889: ldc2_w 325820899
    //   12892: l2i
    //   12893: ldc_w 1820094810
    //   12896: ixor
    //   12897: ldc2_w 1394766187
    //   12900: l2i
    //   12901: ldc_w 1512095931
    //   12904: ixor
    //   12905: ixor
    //   12906: lookupswitch default -> 12932, -1675929849 -> 12889, 1867553783 -> 19992
    //   12932: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   12935: ldc2_w 311679126
    //   12938: l2i
    //   12939: ldc_w 311679081
    //   12942: ixor
    //   12943: getstatic Perryc.1 : I
    //   12946: ifeq -> 12960
    //   12949: ldc2_w 1496057876
    //   12952: l2i
    //   12953: ldc_w -1370932510
    //   12956: ixor
    //   12957: goto -> 12968
    //   12960: ldc2_w 1392287981
    //   12963: l2i
    //   12964: ldc_w 2102528391
    //   12967: ixor
    //   12968: ldc2_w -484739191
    //   12971: l2i
    //   12972: ldc_w -301983963
    //   12975: ixor
    //   12976: ixor
    //   12977: lookupswitch default -> 19570, -92384678 -> 12960, 582339014 -> 13004
    //   13004: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13007: ldc2_w -317503934
    //   13010: l2i
    //   13011: ldc_w -317503934
    //   13014: ixor
    //   13015: getstatic Perryc.0 : I
    //   13018: ifle -> 13032
    //   13021: ldc2_w 2062346277
    //   13024: l2i
    //   13025: ldc_w 1105253878
    //   13028: ixor
    //   13029: goto -> 13040
    //   13032: ldc2_w 2051013479
    //   13035: l2i
    //   13036: ldc_w 1647981697
    //   13039: ixor
    //   13040: ldc2_w -1413787085
    //   13043: l2i
    //   13044: ldc_w 1842294546
    //   13047: ixor
    //   13048: ixor
    //   13049: lookupswitch default -> 19554, -562974009 -> 13076, -42450702 -> 13032
    //   13076: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13079: ldc2_w 1784448195
    //   13082: l2i
    //   13083: ldc_w 1784448060
    //   13086: ixor
    //   13087: getstatic Perryc.1 : I
    //   13090: ifeq -> 13104
    //   13093: ldc2_w 621242811
    //   13096: l2i
    //   13097: ldc_w -1663241932
    //   13100: ixor
    //   13101: goto -> 13112
    //   13104: ldc2_w -1793221431
    //   13107: l2i
    //   13108: ldc_w 1873791932
    //   13111: ixor
    //   13112: ldc2_w -732516113
    //   13115: l2i
    //   13116: ldc_w -688671143
    //   13119: ixor
    //   13120: ixor
    //   13121: lookupswitch default -> 20028, -1149329863 -> 13104, -132689469 -> 13148
    //   13148: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13151: getstatic Perryc.1 : I
    //   13154: ifeq -> 13168
    //   13157: ldc2_w -1700945627
    //   13160: l2i
    //   13161: ldc_w -1750687608
    //   13164: ixor
    //   13165: goto -> 13176
    //   13168: ldc2_w 1097624847
    //   13171: l2i
    //   13172: ldc_w 1550795634
    //   13175: ixor
    //   13176: ldc2_w 6886191
    //   13179: l2i
    //   13180: ldc_w 1839343118
    //   13183: ixor
    //   13184: ixor
    //   13185: lookupswitch default -> 13212, 1450398930 -> 13168, 1626354828 -> 20008
    //   13212: aload_0
    //   13213: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   13218: getstatic Perryc.1 : I
    //   13221: ifeq -> 13235
    //   13224: ldc2_w -1517553402
    //   13227: l2i
    //   13228: ldc_w 2087956015
    //   13231: ixor
    //   13232: goto -> 13243
    //   13235: ldc2_w 740305648
    //   13238: l2i
    //   13239: ldc_w -1654957515
    //   13242: ixor
    //   13243: ldc2_w 1179001831
    //   13246: l2i
    //   13247: ldc_w -1970448746
    //   13250: ixor
    //   13251: ixor
    //   13252: lookupswitch default -> 13280, 27063141 -> 13235, 355672664 -> 19746
    //   13280: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   13283: getstatic Perryc.c : I
    //   13286: iflt -> 13300
    //   13289: ldc2_w 129513257
    //   13292: l2i
    //   13293: ldc_w -1074458829
    //   13296: ixor
    //   13297: goto -> 13308
    //   13300: ldc2_w -1997592461
    //   13303: l2i
    //   13304: ldc_w -1201654129
    //   13307: ixor
    //   13308: ldc2_w -388745391
    //   13311: l2i
    //   13312: ldc_w 471128827
    //   13315: ixor
    //   13316: ixor
    //   13317: lookupswitch default -> 13344, 1284363696 -> 19938, 1633958898 -> 13300
    //   13344: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   13347: getstatic Perryc.0 : I
    //   13350: ifle -> 13364
    //   13353: ldc2_w -1794912299
    //   13356: l2i
    //   13357: ldc_w 148935486
    //   13360: ixor
    //   13361: goto -> 13372
    //   13364: ldc2_w 944485233
    //   13367: l2i
    //   13368: ldc_w -1472539347
    //   13371: ixor
    //   13372: ldc2_w 522110686
    //   13375: l2i
    //   13376: ldc_w -4782721
    //   13379: ixor
    //   13380: ixor
    //   13381: lookupswitch default -> 13408, 81038056 -> 13364, 2102042442 -> 19656
    //   13408: putfield safeAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13411: getstatic Perryc.c : I
    //   13414: iflt -> 13428
    //   13417: ldc2_w 1438164209
    //   13420: l2i
    //   13421: ldc_w -1491238319
    //   13424: ixor
    //   13425: goto -> 13436
    //   13428: ldc2_w 33150963
    //   13431: l2i
    //   13432: ldc_w -721173380
    //   13435: ixor
    //   13436: ldc2_w -977443941
    //   13439: l2i
    //   13440: ldc_w -1604482273
    //   13443: ixor
    //   13444: ixor
    //   13445: lookupswitch default -> 13472, -1829779792 -> 13428, -1757032924 -> 20058
    //   13472: aload_0
    //   13473: getstatic Perryc.1 : I
    //   13476: ifeq -> 13490
    //   13479: ldc2_w -1756719923
    //   13482: l2i
    //   13483: ldc_w -56111577
    //   13486: ixor
    //   13487: goto -> 13498
    //   13490: ldc2_w -1787527519
    //   13493: l2i
    //   13494: ldc_w 1856939312
    //   13497: ixor
    //   13498: ldc2_w -2042186428
    //   13501: l2i
    //   13502: ldc_w 1532222225
    //   13505: ixor
    //   13506: ixor
    //   13507: lookupswitch default -> 19806, -1225247553 -> 13490, 651146692 -> 13532
    //   13532: aload_0
    //   13533: new bigname/zprestige/webhack/features/setting/Setting
    //   13536: dup
    //   13537: ldc_w '┸㌆╪㶣銟쮪๕墷蹭칫'
    //   13540: getstatic Perryc.1 : I
    //   13543: ifeq -> 13557
    //   13546: ldc2_w 213511261
    //   13549: l2i
    //   13550: ldc_w 959940948
    //   13553: ixor
    //   13554: goto -> 13565
    //   13557: ldc2_w 1974999185
    //   13560: l2i
    //   13561: ldc_w 363886033
    //   13564: ixor
    //   13565: ldc2_w -976048012
    //   13568: l2i
    //   13569: ldc_w 1057075910
    //   13572: ixor
    //   13573: ixor
    //   13574: lookupswitch default -> 19848, -1696894990 -> 13600, -815962181 -> 13557
    //   13600: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   13603: ldc2_w 1786181035
    //   13606: l2i
    //   13607: ldc_w 1786181035
    //   13610: ixor
    //   13611: getstatic Perryc.1 : I
    //   13614: ifeq -> 13628
    //   13617: ldc2_w -1310999502
    //   13620: l2i
    //   13621: ldc_w -831695608
    //   13624: ixor
    //   13625: goto -> 13636
    //   13628: ldc2_w 1581151845
    //   13631: l2i
    //   13632: ldc_w 1664299646
    //   13635: ixor
    //   13636: ldc2_w 201476729
    //   13639: l2i
    //   13640: ldc_w -1896201488
    //   13643: ixor
    //   13644: ixor
    //   13645: lookupswitch default -> 13672, -859705565 -> 13628, -45162061 -> 19744
    //   13672: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   13675: getstatic Perryc.0 : I
    //   13678: ifle -> 13692
    //   13681: ldc2_w -1531156744
    //   13684: l2i
    //   13685: ldc_w 1923414994
    //   13688: ixor
    //   13689: goto -> 13700
    //   13692: ldc2_w -1918137406
    //   13695: l2i
    //   13696: ldc_w 183845155
    //   13699: ixor
    //   13700: ldc2_w 346144187
    //   13703: l2i
    //   13704: ldc_w 1886887903
    //   13707: ixor
    //   13708: ixor
    //   13709: lookupswitch default -> 13736, -1295073458 -> 20094, 1332426074 -> 13692
    //   13736: aload_0
    //   13737: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   13742: getstatic Perryc.c : I
    //   13745: iflt -> 13759
    //   13748: ldc2_w 1638390053
    //   13751: l2i
    //   13752: ldc_w -415088359
    //   13755: ixor
    //   13756: goto -> 13767
    //   13759: ldc2_w -215321239
    //   13762: l2i
    //   13763: ldc_w -1062157692
    //   13766: ixor
    //   13767: ldc2_w 1776855890
    //   13770: l2i
    //   13771: ldc_w -462824544
    //   13774: ixor
    //   13775: ixor
    //   13776: lookupswitch default -> 13804, 191162574 -> 19696, 1797513183 -> 13759
    //   13804: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   13807: getstatic Perryc.c : I
    //   13810: iflt -> 13824
    //   13813: ldc2_w 1922539762
    //   13816: l2i
    //   13817: ldc_w -816688134
    //   13820: ixor
    //   13821: goto -> 13832
    //   13824: ldc2_w -1848243477
    //   13827: l2i
    //   13828: ldc_w -2138986600
    //   13831: ixor
    //   13832: ldc2_w 673975625
    //   13835: l2i
    //   13836: ldc_w 1290218734
    //   13839: ixor
    //   13840: ixor
    //   13841: lookupswitch default -> 13868, -1622815919 -> 13824, -653339985 -> 19930
    //   13868: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   13871: getstatic Perryc.0 : I
    //   13874: ifle -> 13888
    //   13877: ldc2_w -881511037
    //   13880: l2i
    //   13881: ldc_w 296061211
    //   13884: ixor
    //   13885: goto -> 13896
    //   13888: ldc2_w 2072225747
    //   13891: l2i
    //   13892: ldc_w 568065451
    //   13895: ixor
    //   13896: ldc2_w -1886262187
    //   13899: l2i
    //   13900: ldc_w 133567147
    //   13903: ixor
    //   13904: ixor
    //   13905: lookupswitch default -> 13932, 1387741798 -> 19666, 1785558663 -> 13888
    //   13932: putfield customOutline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13935: getstatic Perryc.0 : I
    //   13938: ifle -> 13952
    //   13941: ldc2_w -1002285958
    //   13944: l2i
    //   13945: ldc_w 2088314375
    //   13948: ixor
    //   13949: goto -> 13960
    //   13952: ldc2_w -1282065432
    //   13955: l2i
    //   13956: ldc_w 1374672981
    //   13959: ixor
    //   13960: ldc2_w -2108773707
    //   13963: l2i
    //   13964: ldc_w 1431806845
    //   13967: ixor
    //   13968: ixor
    //   13969: lookupswitch default -> 13996, 1864530869 -> 19566, 2010100800 -> 13952
    //   13996: aload_0
    //   13997: getstatic Perryc.0 : I
    //   14000: ifle -> 14014
    //   14003: ldc2_w -1260330783
    //   14006: l2i
    //   14007: ldc_w -953920887
    //   14010: ixor
    //   14011: goto -> 14022
    //   14014: ldc2_w -1703478336
    //   14017: l2i
    //   14018: ldc_w 1881859376
    //   14021: ixor
    //   14022: ldc2_w -1385434343
    //   14025: l2i
    //   14026: ldc_w 1708273215
    //   14029: ixor
    //   14030: ixor
    //   14031: lookupswitch default -> 19626, -1149407410 -> 14014, 585483222 -> 14056
    //   14056: aload_0
    //   14057: new bigname/zprestige/webhack/features/setting/Setting
    //   14060: dup
    //   14061: ldc_w '┴㌿┴㶅銕쮣'
    //   14064: getstatic Perryc.c : I
    //   14067: iflt -> 14081
    //   14070: ldc2_w -70246557
    //   14073: l2i
    //   14074: ldc_w 789933862
    //   14077: ixor
    //   14078: goto -> 14089
    //   14081: ldc2_w 410796626
    //   14084: l2i
    //   14085: ldc_w 253098642
    //   14088: ixor
    //   14089: ldc2_w 1597645495
    //   14092: l2i
    //   14093: ldc_w 2104602762
    //   14096: ixor
    //   14097: ixor
    //   14098: lookupswitch default -> 14124, -1483110656 -> 14081, -158408072 -> 19694
    //   14124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   14127: ldc2_w -1064394113
    //   14130: l2i
    //   14131: ldc_w -1064394113
    //   14134: ixor
    //   14135: getstatic Perryc.1 : I
    //   14138: ifeq -> 14152
    //   14141: ldc2_w -668665959
    //   14144: l2i
    //   14145: ldc_w 1813483602
    //   14148: ixor
    //   14149: goto -> 14160
    //   14152: ldc2_w 643170628
    //   14155: l2i
    //   14156: ldc_w 1848671199
    //   14159: ixor
    //   14160: ldc2_w -1346642105
    //   14163: l2i
    //   14164: ldc_w 176955154
    //   14167: ixor
    //   14168: ixor
    //   14169: lookupswitch default -> 14196, -1627996879 -> 14152, 285517726 -> 19700
    //   14196: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14199: ldc2_w 659958073
    //   14202: l2i
    //   14203: ldc_w 659958073
    //   14206: ixor
    //   14207: getstatic Perryc.0 : I
    //   14210: ifle -> 14224
    //   14213: ldc2_w -2141674468
    //   14216: l2i
    //   14217: ldc_w 353054930
    //   14220: ixor
    //   14221: goto -> 14232
    //   14224: ldc2_w -1138303388
    //   14227: l2i
    //   14228: ldc_w -171687836
    //   14231: ixor
    //   14232: ldc2_w -1136126066
    //   14235: l2i
    //   14236: ldc_w 1567893733
    //   14239: ixor
    //   14240: ixor
    //   14241: lookupswitch default -> 14268, -895209179 -> 14224, 1953475493 -> 20020
    //   14268: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14271: ldc2_w 653199807
    //   14274: l2i
    //   14275: ldc_w 653199680
    //   14278: ixor
    //   14279: getstatic Perryc.c : I
    //   14282: iflt -> 14296
    //   14285: ldc2_w -882497730
    //   14288: l2i
    //   14289: ldc_w 1764885489
    //   14292: ixor
    //   14293: goto -> 14304
    //   14296: ldc2_w 1071710936
    //   14299: l2i
    //   14300: ldc_w 965699175
    //   14303: ixor
    //   14304: ldc2_w -1620101813
    //   14307: l2i
    //   14308: ldc_w 1298063975
    //   14311: ixor
    //   14312: ixor
    //   14313: lookupswitch default -> 14340, 1353649555 -> 14296, 1885729763 -> 19588
    //   14340: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14343: getstatic Perryc.c : I
    //   14346: iflt -> 14360
    //   14349: ldc2_w 2023947823
    //   14352: l2i
    //   14353: ldc_w 1522943690
    //   14356: ixor
    //   14357: goto -> 14368
    //   14360: ldc2_w -1480161066
    //   14363: l2i
    //   14364: ldc_w 1360384891
    //   14367: ixor
    //   14368: ldc2_w 636413142
    //   14371: l2i
    //   14372: ldc_w 941824978
    //   14375: ixor
    //   14376: ixor
    //   14377: lookupswitch default -> 14404, 1068058593 -> 19870, 1356557133 -> 14360
    //   14404: aload_0
    //   14405: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   14410: getstatic Perryc.0 : I
    //   14413: ifle -> 14427
    //   14416: ldc2_w 433310075
    //   14419: l2i
    //   14420: ldc_w -6791959
    //   14423: ixor
    //   14424: goto -> 14435
    //   14427: ldc2_w -2026683671
    //   14430: l2i
    //   14431: ldc_w 230930153
    //   14434: ixor
    //   14435: ldc2_w -1420954076
    //   14438: l2i
    //   14439: ldc_w 989423491
    //   14442: ixor
    //   14443: ixor
    //   14444: lookupswitch default -> 19932, 457467303 -> 14472, 2013201461 -> 14427
    //   14472: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   14475: getstatic Perryc.c : I
    //   14478: iflt -> 14492
    //   14481: ldc2_w 47898672
    //   14484: l2i
    //   14485: ldc_w 815682238
    //   14488: ixor
    //   14489: goto -> 14500
    //   14492: ldc2_w 329788688
    //   14495: l2i
    //   14496: ldc_w 1573327336
    //   14499: ixor
    //   14500: ldc2_w -601565669
    //   14503: l2i
    //   14504: ldc_w -166951762
    //   14507: ixor
    //   14508: ixor
    //   14509: lookupswitch default -> 19720, 409788475 -> 14492, 1682402893 -> 14536
    //   14536: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   14539: getstatic Perryc.0 : I
    //   14542: ifle -> 14556
    //   14545: ldc2_w -26310165
    //   14548: l2i
    //   14549: ldc_w 1504264452
    //   14552: ixor
    //   14553: goto -> 14564
    //   14556: ldc2_w -437166041
    //   14559: l2i
    //   14560: ldc_w -545902865
    //   14563: ixor
    //   14564: ldc2_w -924529350
    //   14567: l2i
    //   14568: ldc_w 976342518
    //   14571: ixor
    //   14572: ixor
    //   14573: lookupswitch default -> 14600, -1898982621 -> 14556, 1427294243 -> 19824
    //   14600: putfield cRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14603: getstatic Perryc.0 : I
    //   14606: ifle -> 14620
    //   14609: ldc2_w -1865308429
    //   14612: l2i
    //   14613: ldc_w -1654815664
    //   14616: ixor
    //   14617: goto -> 14628
    //   14620: ldc2_w -1101515983
    //   14623: l2i
    //   14624: ldc_w 1573225471
    //   14627: ixor
    //   14628: ldc2_w -126193440
    //   14631: l2i
    //   14632: ldc_w 1493044159
    //   14635: ixor
    //   14636: ixor
    //   14637: lookupswitch default -> 19816, -1391961604 -> 14620, 1125763985 -> 14664
    //   14664: aload_0
    //   14665: getstatic Perryc.0 : I
    //   14668: ifle -> 14682
    //   14671: ldc2_w -745942142
    //   14674: l2i
    //   14675: ldc_w 1324095369
    //   14678: ixor
    //   14679: goto -> 14690
    //   14682: ldc2_w -828382467
    //   14685: l2i
    //   14686: ldc_w 259901674
    //   14689: ixor
    //   14690: ldc2_w 1603731485
    //   14693: l2i
    //   14694: ldc_w -497106306
    //   14697: ixor
    //   14698: ixor
    //   14699: lookupswitch default -> 19562, 548144744 -> 14682, 2083252340 -> 14724
    //   14724: aload_0
    //   14725: new bigname/zprestige/webhack/features/setting/Setting
    //   14728: dup
    //   14729: ldc_w '┴㌿┴㶐銂쮢๼墰'
    //   14732: getstatic Perryc.c : I
    //   14735: iflt -> 14749
    //   14738: ldc2_w -951252834
    //   14741: l2i
    //   14742: ldc_w -1991230660
    //   14745: ixor
    //   14746: goto -> 14757
    //   14749: ldc2_w -303312438
    //   14752: l2i
    //   14753: ldc_w 578244184
    //   14756: ixor
    //   14757: ldc2_w -338487447
    //   14760: l2i
    //   14761: ldc_w -1408812745
    //   14764: ixor
    //   14765: ixor
    //   14766: lookupswitch default -> 14792, 164175356 -> 20034, 405033371 -> 14749
    //   14792: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   14795: ldc2_w 1273410516
    //   14798: l2i
    //   14799: ldc_w 1273410516
    //   14802: ixor
    //   14803: getstatic Perryc.0 : I
    //   14806: ifle -> 14820
    //   14809: ldc2_w 1774600481
    //   14812: l2i
    //   14813: ldc_w 1360835891
    //   14816: ixor
    //   14817: goto -> 14828
    //   14820: ldc2_w -999625175
    //   14823: l2i
    //   14824: ldc_w -1659338515
    //   14827: ixor
    //   14828: ldc2_w 375699014
    //   14831: l2i
    //   14832: ldc_w -854651823
    //   14835: ixor
    //   14836: ixor
    //   14837: lookupswitch default -> 14864, -1436475660 -> 14820, -474919419 -> 19994
    //   14864: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14867: ldc2_w 1778535963
    //   14870: l2i
    //   14871: ldc_w 1778535963
    //   14874: ixor
    //   14875: getstatic Perryc.0 : I
    //   14878: ifle -> 14892
    //   14881: ldc2_w -819202615
    //   14884: l2i
    //   14885: ldc_w -309908005
    //   14888: ixor
    //   14889: goto -> 14900
    //   14892: ldc2_w 644745595
    //   14895: l2i
    //   14896: ldc_w 1100482172
    //   14899: ixor
    //   14900: ldc2_w 2041266667
    //   14903: l2i
    //   14904: ldc_w -127414690
    //   14907: ixor
    //   14908: ixor
    //   14909: lookupswitch default -> 20084, -1553967193 -> 14892, -432373582 -> 14936
    //   14936: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14939: ldc2_w -127584116
    //   14942: l2i
    //   14943: ldc_w -127584141
    //   14946: ixor
    //   14947: getstatic Perryc.1 : I
    //   14950: ifeq -> 14964
    //   14953: ldc2_w 1818897060
    //   14956: l2i
    //   14957: ldc_w -1521693417
    //   14960: ixor
    //   14961: goto -> 14972
    //   14964: ldc2_w 1112699436
    //   14967: l2i
    //   14968: ldc_w 529696195
    //   14971: ixor
    //   14972: ldc2_w -637933219
    //   14975: l2i
    //   14976: ldc_w -1445150148
    //   14979: ixor
    //   14980: ixor
    //   14981: lookupswitch default -> 15008, -2014710324 -> 14964, -1190933294 -> 19792
    //   15008: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15011: getstatic Perryc.1 : I
    //   15014: ifeq -> 15028
    //   15017: ldc2_w -91289482
    //   15020: l2i
    //   15021: ldc_w 17444481
    //   15024: ixor
    //   15025: goto -> 15036
    //   15028: ldc2_w -1252881057
    //   15031: l2i
    //   15032: ldc_w 425388460
    //   15035: ixor
    //   15036: ldc2_w -1461577546
    //   15039: l2i
    //   15040: ldc_w 1368521161
    //   15043: ixor
    //   15044: ixor
    //   15045: lookupswitch default -> 15072, -2059171950 -> 15028, 49727368 -> 19902
    //   15072: aload_0
    //   15073: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   15078: getstatic Perryc.0 : I
    //   15081: ifle -> 15095
    //   15084: ldc2_w 1024058963
    //   15087: l2i
    //   15088: ldc_w 1228586930
    //   15091: ixor
    //   15092: goto -> 15103
    //   15095: ldc2_w -338799621
    //   15098: l2i
    //   15099: ldc_w -292615898
    //   15102: ixor
    //   15103: ldc2_w 722199627
    //   15106: l2i
    //   15107: ldc_w -1759201150
    //   15110: ixor
    //   15111: ixor
    //   15112: lookupswitch default -> 19608, -1183971820 -> 15140, -937687768 -> 15095
    //   15140: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   15143: getstatic Perryc.0 : I
    //   15146: ifle -> 15160
    //   15149: ldc2_w 460312481
    //   15152: l2i
    //   15153: ldc_w -897895237
    //   15156: ixor
    //   15157: goto -> 15168
    //   15160: ldc2_w 83555563
    //   15163: l2i
    //   15164: ldc_w 1517389761
    //   15167: ixor
    //   15168: ldc2_w -292916040
    //   15171: l2i
    //   15172: ldc_w -307483234
    //   15175: ixor
    //   15176: ixor
    //   15177: lookupswitch default -> 15204, -768433604 -> 20036, 606830068 -> 15160
    //   15204: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   15207: getstatic Perryc.c : I
    //   15210: iflt -> 15224
    //   15213: ldc2_w -2068275509
    //   15216: l2i
    //   15217: ldc_w -1796680440
    //   15220: ixor
    //   15221: goto -> 15232
    //   15224: ldc2_w 734855155
    //   15227: l2i
    //   15228: ldc_w -443669687
    //   15231: ixor
    //   15232: ldc2_w 1858755135
    //   15235: l2i
    //   15236: ldc_w -123732578
    //   15239: ixor
    //   15240: ixor
    //   15241: lookupswitch default -> 15268, -2046432158 -> 20032, -1782818245 -> 15224
    //   15268: putfield cGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15271: getstatic Perryc.c : I
    //   15274: iflt -> 15288
    //   15277: ldc2_w 1514602257
    //   15280: l2i
    //   15281: ldc_w 1315974998
    //   15284: ixor
    //   15285: goto -> 15296
    //   15288: ldc2_w 1196820236
    //   15291: l2i
    //   15292: ldc_w -1578844642
    //   15295: ixor
    //   15296: ldc2_w 73274540
    //   15299: l2i
    //   15300: ldc_w -1513809374
    //   15303: ixor
    //   15304: ixor
    //   15305: lookupswitch default -> 15332, -2024885864 -> 15288, -1246896439 -> 20062
    //   15332: aload_0
    //   15333: getstatic Perryc.1 : I
    //   15336: ifeq -> 15350
    //   15339: ldc2_w 964450851
    //   15342: l2i
    //   15343: ldc_w -761475507
    //   15346: ixor
    //   15347: goto -> 15358
    //   15350: ldc2_w 1490699825
    //   15353: l2i
    //   15354: ldc_w -821910487
    //   15357: ixor
    //   15358: ldc2_w 398824159
    //   15361: l2i
    //   15362: ldc_w -476757282
    //   15365: ixor
    //   15366: ixor
    //   15367: lookupswitch default -> 15392, 531645551 -> 19718, 631709247 -> 15350
    //   15392: aload_0
    //   15393: new bigname/zprestige/webhack/features/setting/Setting
    //   15396: dup
    //   15397: ldc_w '┴㌿┴㶕銜쮲๼'
    //   15400: getstatic Perryc.0 : I
    //   15403: ifle -> 15417
    //   15406: ldc2_w 74997113
    //   15409: l2i
    //   15410: ldc_w 1669159917
    //   15413: ixor
    //   15414: goto -> 15425
    //   15417: ldc2_w -1193279592
    //   15420: l2i
    //   15421: ldc_w 871271727
    //   15424: ixor
    //   15425: ldc2_w 1738495913
    //   15428: l2i
    //   15429: ldc_w 207657356
    //   15432: ixor
    //   15433: ixor
    //   15434: lookupswitch default -> 19886, -523322222 -> 15460, 217761969 -> 15417
    //   15460: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   15463: ldc2_w 974717163
    //   15466: l2i
    //   15467: ldc_w 974716948
    //   15470: ixor
    //   15471: getstatic Perryc.0 : I
    //   15474: ifle -> 15488
    //   15477: ldc2_w -601382242
    //   15480: l2i
    //   15481: ldc_w -1224388623
    //   15484: ixor
    //   15485: goto -> 15496
    //   15488: ldc2_w -100130261
    //   15491: l2i
    //   15492: ldc_w 513167679
    //   15495: ixor
    //   15496: ldc2_w -2003516178
    //   15499: l2i
    //   15500: ldc_w 1851775657
    //   15503: ixor
    //   15504: ixor
    //   15505: lookupswitch default -> 19734, -1914047704 -> 15488, 39152979 -> 15532
    //   15532: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15535: ldc2_w -409250293
    //   15538: l2i
    //   15539: ldc_w -409250293
    //   15542: ixor
    //   15543: getstatic Perryc.1 : I
    //   15546: ifeq -> 15560
    //   15549: ldc2_w 821898520
    //   15552: l2i
    //   15553: ldc_w -249086745
    //   15556: ixor
    //   15557: goto -> 15568
    //   15560: ldc2_w -979068576
    //   15563: l2i
    //   15564: ldc_w -1807897798
    //   15567: ixor
    //   15568: ldc2_w 25867776
    //   15571: l2i
    //   15572: ldc_w -785691277
    //   15575: ixor
    //   15576: ixor
    //   15577: lookupswitch default -> 19784, -2126984919 -> 15604, 293333644 -> 15560
    //   15604: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15607: ldc2_w 1517508482
    //   15610: l2i
    //   15611: ldc_w 1517508477
    //   15614: ixor
    //   15615: getstatic Perryc.1 : I
    //   15618: ifeq -> 15632
    //   15621: ldc2_w -854110582
    //   15624: l2i
    //   15625: ldc_w 502971383
    //   15628: ixor
    //   15629: goto -> 15640
    //   15632: ldc2_w 279981740
    //   15635: l2i
    //   15636: ldc_w 864029441
    //   15639: ixor
    //   15640: ldc2_w 613598123
    //   15643: l2i
    //   15644: ldc_w 818287829
    //   15647: ixor
    //   15648: ixor
    //   15649: lookupswitch default -> 19944, -994500093 -> 15632, 929362643 -> 15676
    //   15676: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15679: getstatic Perryc.0 : I
    //   15682: ifle -> 15696
    //   15685: ldc2_w -2094707208
    //   15688: l2i
    //   15689: ldc_w 2135589905
    //   15692: ixor
    //   15693: goto -> 15704
    //   15696: ldc2_w 1710793510
    //   15699: l2i
    //   15700: ldc_w 1760617264
    //   15703: ixor
    //   15704: ldc2_w -1390557922
    //   15707: l2i
    //   15708: ldc_w 1298787139
    //   15711: ixor
    //   15712: ixor
    //   15713: lookupswitch default -> 19832, -310612405 -> 15740, 471590836 -> 15696
    //   15740: aload_0
    //   15741: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   15746: getstatic Perryc.1 : I
    //   15749: ifeq -> 15763
    //   15752: ldc2_w 308940207
    //   15755: l2i
    //   15756: ldc_w 1283060360
    //   15759: ixor
    //   15760: goto -> 15771
    //   15763: ldc2_w 1067742791
    //   15766: l2i
    //   15767: ldc_w -420615126
    //   15770: ixor
    //   15771: ldc2_w -679827980
    //   15774: l2i
    //   15775: ldc_w -2106172459
    //   15778: ixor
    //   15779: ixor
    //   15780: lookupswitch default -> 15808, 186581254 -> 19668, 356199776 -> 15763
    //   15808: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   15811: getstatic Perryc.0 : I
    //   15814: ifle -> 15828
    //   15817: ldc2_w 876714642
    //   15820: l2i
    //   15821: ldc_w -1477558470
    //   15824: ixor
    //   15825: goto -> 15836
    //   15828: ldc2_w -1106808158
    //   15831: l2i
    //   15832: ldc_w 1173999572
    //   15835: ixor
    //   15836: ldc2_w -1072845543
    //   15839: l2i
    //   15840: ldc_w -1067858972
    //   15843: ixor
    //   15844: ixor
    //   15845: lookupswitch default -> 15872, -1812214955 -> 19966, 1946237070 -> 15828
    //   15872: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   15875: getstatic Perryc.0 : I
    //   15878: ifle -> 15892
    //   15881: ldc2_w -1228010762
    //   15884: l2i
    //   15885: ldc_w -1911752265
    //   15888: ixor
    //   15889: goto -> 15900
    //   15892: ldc2_w 1101960637
    //   15895: l2i
    //   15896: ldc_w -704774048
    //   15899: ixor
    //   15900: ldc2_w -969911416
    //   15903: l2i
    //   15904: ldc_w -2025927075
    //   15907: ixor
    //   15908: ixor
    //   15909: lookupswitch default -> 19712, -715257848 -> 15936, 2043440788 -> 15892
    //   15936: putfield cBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15939: getstatic Perryc.0 : I
    //   15942: ifle -> 15956
    //   15945: ldc2_w 2014119040
    //   15948: l2i
    //   15949: ldc_w 2140865965
    //   15952: ixor
    //   15953: goto -> 15964
    //   15956: ldc2_w 1451198266
    //   15959: l2i
    //   15960: ldc_w 1953878539
    //   15963: ixor
    //   15964: ldc2_w 534050809
    //   15967: l2i
    //   15968: ldc_w 2027048060
    //   15971: ixor
    //   15972: ixor
    //   15973: lookupswitch default -> 16000, -1127911476 -> 15956, 1620097704 -> 19660
    //   16000: aload_0
    //   16001: getstatic Perryc.0 : I
    //   16004: ifle -> 16018
    //   16007: ldc2_w -772871235
    //   16010: l2i
    //   16011: ldc_w -1453586439
    //   16014: ixor
    //   16015: goto -> 16026
    //   16018: ldc2_w 1006244653
    //   16021: l2i
    //   16022: ldc_w -1919299102
    //   16025: ixor
    //   16026: ldc2_w -85643554
    //   16029: l2i
    //   16030: ldc_w 1141508688
    //   16033: ixor
    //   16034: ixor
    //   16035: lookupswitch default -> 16060, -966932278 -> 19796, 1974993505 -> 16018
    //   16060: aload_0
    //   16061: new bigname/zprestige/webhack/features/setting/Setting
    //   16064: dup
    //   16065: ldc_w '┴㌿┴㶖銜쮷๱墿'
    //   16068: getstatic Perryc.0 : I
    //   16071: ifle -> 16085
    //   16074: ldc2_w 1181476094
    //   16077: l2i
    //   16078: ldc_w -621102575
    //   16081: ixor
    //   16082: goto -> 16093
    //   16085: ldc2_w 139844151
    //   16088: l2i
    //   16089: ldc_w 922100003
    //   16092: ixor
    //   16093: ldc2_w -1889529541
    //   16096: l2i
    //   16097: ldc_w 1595165358
    //   16100: ixor
    //   16101: ixor
    //   16102: lookupswitch default -> 16128, -379570140 -> 16085, 1290077562 -> 19940
    //   16128: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   16131: ldc2_w 1309959950
    //   16134: l2i
    //   16135: ldc_w 1309960177
    //   16138: ixor
    //   16139: getstatic Perryc.c : I
    //   16142: iflt -> 16156
    //   16145: ldc2_w -1110029770
    //   16148: l2i
    //   16149: ldc_w 993669148
    //   16152: ixor
    //   16153: goto -> 16164
    //   16156: ldc2_w 796626235
    //   16159: l2i
    //   16160: ldc_w 1842713430
    //   16163: ixor
    //   16164: ldc2_w 1534896825
    //   16167: l2i
    //   16168: ldc_w -1631920756
    //   16171: ixor
    //   16172: ixor
    //   16173: lookupswitch default -> 19558, -2023200424 -> 16200, 1126829343 -> 16156
    //   16200: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   16203: ldc2_w -1924182292
    //   16206: l2i
    //   16207: ldc_w -1924182292
    //   16210: ixor
    //   16211: getstatic Perryc.1 : I
    //   16214: ifeq -> 16228
    //   16217: ldc2_w -360883037
    //   16220: l2i
    //   16221: ldc_w 644905276
    //   16224: ixor
    //   16225: goto -> 16236
    //   16228: ldc2_w 1248182363
    //   16231: l2i
    //   16232: ldc_w 1136244133
    //   16235: ixor
    //   16236: ldc2_w -771603422
    //   16239: l2i
    //   16240: ldc_w -383161257
    //   16243: ixor
    //   16244: ixor
    //   16245: lookupswitch default -> 16272, -148501014 -> 19838, -20221045 -> 16228
    //   16272: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   16275: ldc2_w -1404323329
    //   16278: l2i
    //   16279: ldc_w -1404323584
    //   16282: ixor
    //   16283: getstatic Perryc.c : I
    //   16286: iflt -> 16300
    //   16289: ldc2_w 507886407
    //   16292: l2i
    //   16293: ldc_w -670154070
    //   16296: ixor
    //   16297: goto -> 16308
    //   16300: ldc2_w -1515664199
    //   16303: l2i
    //   16304: ldc_w 1289464082
    //   16307: ixor
    //   16308: ldc2_w -231051576
    //   16311: l2i
    //   16312: ldc_w -1139861326
    //   16315: ixor
    //   16316: ixor
    //   16317: lookupswitch default -> 16344, -2004971625 -> 19980, 930318588 -> 16300
    //   16344: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   16347: getstatic Perryc.1 : I
    //   16350: ifeq -> 16364
    //   16353: ldc2_w -883996911
    //   16356: l2i
    //   16357: ldc_w 1612598587
    //   16360: ixor
    //   16361: goto -> 16372
    //   16364: ldc2_w 1875037195
    //   16367: l2i
    //   16368: ldc_w -711817046
    //   16371: ixor
    //   16372: ldc2_w 1128978620
    //   16375: l2i
    //   16376: ldc_w 2108776508
    //   16379: ixor
    //   16380: ixor
    //   16381: lookupswitch default -> 16408, -1783975254 -> 19612, 1716470968 -> 16364
    //   16408: aload_0
    //   16409: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   16414: getstatic Perryc.0 : I
    //   16417: ifle -> 16431
    //   16420: ldc2_w 1941650329
    //   16423: l2i
    //   16424: ldc_w 246001841
    //   16427: ixor
    //   16428: goto -> 16439
    //   16431: ldc2_w 2032178572
    //   16434: l2i
    //   16435: ldc_w -1711186933
    //   16438: ixor
    //   16439: ldc2_w -597330568
    //   16442: l2i
    //   16443: ldc_w 1988879596
    //   16446: ixor
    //   16447: ixor
    //   16448: lookupswitch default -> 16476, -671343940 -> 19654, 104737136 -> 16431
    //   16476: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   16479: getstatic Perryc.1 : I
    //   16482: ifeq -> 16496
    //   16485: ldc2_w 393433430
    //   16488: l2i
    //   16489: ldc_w -1083959988
    //   16492: ixor
    //   16493: goto -> 16504
    //   16496: ldc2_w -1016299786
    //   16499: l2i
    //   16500: ldc_w 1177936951
    //   16503: ixor
    //   16504: ldc2_w 1179923487
    //   16507: l2i
    //   16508: ldc_w 977503985
    //   16511: ixor
    //   16512: ixor
    //   16513: lookupswitch default -> 19632, -738134284 -> 16496, -112318417 -> 16540
    //   16540: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   16543: getstatic Perryc.1 : I
    //   16546: ifeq -> 16560
    //   16549: ldc2_w 1701274931
    //   16552: l2i
    //   16553: ldc_w 322196427
    //   16556: ixor
    //   16557: goto -> 16568
    //   16560: ldc2_w 2020552895
    //   16563: l2i
    //   16564: ldc_w -1081824
    //   16567: ixor
    //   16568: ldc2_w -1567155638
    //   16571: l2i
    //   16572: ldc_w 2083284722
    //   16575: ixor
    //   16576: ixor
    //   16577: lookupswitch default -> 19860, -1461171648 -> 16560, 1497051687 -> 16604
    //   16604: putfield cAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16607: getstatic Perryc.0 : I
    //   16610: ifle -> 16624
    //   16613: ldc2_w -909649762
    //   16616: l2i
    //   16617: ldc_w 894813981
    //   16620: ixor
    //   16621: goto -> 16632
    //   16624: ldc2_w -1144828498
    //   16627: l2i
    //   16628: ldc_w -422263963
    //   16631: ixor
    //   16632: ldc2_w -1024566531
    //   16635: l2i
    //   16636: ldc_w -2060671261
    //   16639: ixor
    //   16640: ixor
    //   16641: lookupswitch default -> 16668, -1152326755 -> 19580, 1413121416 -> 16624
    //   16668: aload_0
    //   16669: getstatic Perryc.1 : I
    //   16672: ifeq -> 16686
    //   16675: ldc2_w 2104879794
    //   16678: l2i
    //   16679: ldc_w 516103636
    //   16682: ixor
    //   16683: goto -> 16694
    //   16686: ldc2_w -650558339
    //   16689: l2i
    //   16690: ldc_w -1579728901
    //   16693: ixor
    //   16694: ldc2_w 2136741033
    //   16697: l2i
    //   16698: ldc_w -1518587614
    //   16701: ixor
    //   16702: ixor
    //   16703: lookupswitch default -> 19894, -1563533811 -> 16728, -1181297939 -> 16686
    //   16728: aload_0
    //   16729: new bigname/zprestige/webhack/features/setting/Setting
    //   16732: dup
    //   16733: ldc_w '┴㌿┴㶄銑쮡๼墌蹦칪'
    //   16736: getstatic Perryc.0 : I
    //   16739: ifle -> 16753
    //   16742: ldc2_w 90300530
    //   16745: l2i
    //   16746: ldc_w 23213455
    //   16749: ixor
    //   16750: goto -> 16761
    //   16753: ldc2_w 1859028447
    //   16756: l2i
    //   16757: ldc_w 470108739
    //   16760: ixor
    //   16761: ldc2_w 1257003941
    //   16764: l2i
    //   16765: ldc_w 1676313196
    //   16768: ixor
    //   16769: ixor
    //   16770: lookupswitch default -> 16796, -311978672 -> 16753, 755305524 -> 20064
    //   16796: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   16799: ldc2_w 884869332
    //   16802: l2i
    //   16803: ldc_w 884869332
    //   16806: ixor
    //   16807: getstatic Perryc.1 : I
    //   16810: ifeq -> 16824
    //   16813: ldc2_w -1771649938
    //   16816: l2i
    //   16817: ldc_w -1605141998
    //   16820: ixor
    //   16821: goto -> 16832
    //   16824: ldc2_w 997634564
    //   16827: l2i
    //   16828: ldc_w 1616041088
    //   16831: ixor
    //   16832: ldc2_w 1892496768
    //   16835: l2i
    //   16836: ldc_w 67829451
    //   16839: ixor
    //   16840: ixor
    //   16841: lookupswitch default -> 16868, 120024744 -> 16824, 1123185975 -> 20086
    //   16868: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   16871: ldc2_w 1047276979
    //   16874: l2i
    //   16875: ldc_w 1047276979
    //   16878: ixor
    //   16879: getstatic Perryc.c : I
    //   16882: iflt -> 16896
    //   16885: ldc2_w 1338361651
    //   16888: l2i
    //   16889: ldc_w 2079341159
    //   16892: ixor
    //   16893: goto -> 16904
    //   16896: ldc2_w -594653595
    //   16899: l2i
    //   16900: ldc_w 710542543
    //   16903: ixor
    //   16904: ldc2_w -188075482
    //   16907: l2i
    //   16908: ldc_w 1856780366
    //   16911: ixor
    //   16912: ixor
    //   16913: lookupswitch default -> 16940, -1370228932 -> 20068, -558112046 -> 16896
    //   16940: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   16943: ldc2_w -359741919
    //   16946: l2i
    //   16947: ldc_w -359741730
    //   16950: ixor
    //   16951: getstatic Perryc.0 : I
    //   16954: ifle -> 16968
    //   16957: ldc2_w -525343162
    //   16960: l2i
    //   16961: ldc_w -1776547757
    //   16964: ixor
    //   16965: goto -> 16976
    //   16968: ldc2_w -582325502
    //   16971: l2i
    //   16972: ldc_w 164605463
    //   16975: ixor
    //   16976: ldc2_w -1816569692
    //   16979: l2i
    //   16980: ldc_w -1245158105
    //   16983: ixor
    //   16984: ixor
    //   16985: lookupswitch default -> 19862, -218826602 -> 17012, 1354945430 -> 16968
    //   17012: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   17015: getstatic Perryc.1 : I
    //   17018: ifeq -> 17032
    //   17021: ldc2_w 1093269083
    //   17024: l2i
    //   17025: ldc_w 1687533505
    //   17028: ixor
    //   17029: goto -> 17040
    //   17032: ldc2_w 479429209
    //   17035: l2i
    //   17036: ldc_w -947179646
    //   17039: ixor
    //   17040: ldc2_w -609254733
    //   17043: l2i
    //   17044: ldc_w 650765900
    //   17047: ixor
    //   17048: ixor
    //   17049: lookupswitch default -> 17076, -656792219 -> 19614, -159355111 -> 17032
    //   17076: aload_0
    //   17077: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   17082: getstatic Perryc.1 : I
    //   17085: ifeq -> 17099
    //   17088: ldc2_w 1828895972
    //   17091: l2i
    //   17092: ldc_w -740346148
    //   17095: ixor
    //   17096: goto -> 17107
    //   17099: ldc2_w -1789720161
    //   17102: l2i
    //   17103: ldc_w -1619579016
    //   17106: ixor
    //   17107: ldc2_w -1725001869
    //   17110: l2i
    //   17111: ldc_w 655523968
    //   17114: ixor
    //   17115: ixor
    //   17116: lookupswitch default -> 19868, -1273485036 -> 17144, 14779851 -> 17099
    //   17144: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   17147: getstatic Perryc.c : I
    //   17150: iflt -> 17164
    //   17153: ldc2_w 711797202
    //   17156: l2i
    //   17157: ldc_w 1780418421
    //   17160: ixor
    //   17161: goto -> 17172
    //   17164: ldc2_w 986445899
    //   17167: l2i
    //   17168: ldc_w -2136992862
    //   17171: ixor
    //   17172: ldc2_w 1854517980
    //   17175: l2i
    //   17176: ldc_w 2052332361
    //   17179: ixor
    //   17180: ixor
    //   17181: lookupswitch default -> 17208, -949095613 -> 17164, 1420789554 -> 19578
    //   17208: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   17211: getstatic Perryc.1 : I
    //   17214: ifeq -> 17228
    //   17217: ldc2_w 1326911106
    //   17220: l2i
    //   17221: ldc_w -1018553432
    //   17224: ixor
    //   17225: goto -> 17236
    //   17228: ldc2_w -1250241808
    //   17231: l2i
    //   17232: ldc_w -887181211
    //   17235: ixor
    //   17236: ldc2_w -1891793942
    //   17239: l2i
    //   17240: ldc_w 1094505888
    //   17243: ixor
    //   17244: ixor
    //   17245: lookupswitch default -> 20042, -1335544609 -> 17272, 1113342816 -> 17228
    //   17272: putfield safecRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   17275: getstatic Perryc.0 : I
    //   17278: ifle -> 17292
    //   17281: ldc2_w 1861328822
    //   17284: l2i
    //   17285: ldc_w -1352510214
    //   17288: ixor
    //   17289: goto -> 17300
    //   17292: ldc2_w -2119886886
    //   17295: l2i
    //   17296: ldc_w 914234249
    //   17299: ixor
    //   17300: ldc2_w -1025442803
    //   17303: l2i
    //   17304: ldc_w 2105441795
    //   17307: ixor
    //   17308: ixor
    //   17309: lookupswitch default -> 17336, 1480152692 -> 17292, 2114799938 -> 19988
    //   17336: aload_0
    //   17337: getstatic Perryc.0 : I
    //   17340: ifle -> 17354
    //   17343: ldc2_w 125951851
    //   17346: l2i
    //   17347: ldc_w 1961272639
    //   17350: ixor
    //   17351: goto -> 17362
    //   17354: ldc2_w 1401101376
    //   17357: l2i
    //   17358: ldc_w -426443373
    //   17361: ixor
    //   17362: ldc2_w 795705379
    //   17365: l2i
    //   17366: ldc_w 429548037
    //   17369: ixor
    //   17370: ixor
    //   17371: lookupswitch default -> 19884, -2082470923 -> 17396, 1167104114 -> 17354
    //   17396: aload_0
    //   17397: new bigname/zprestige/webhack/features/setting/Setting
    //   17400: dup
    //   17401: ldc_w '┴㌿┴㶄銑쮡๼墙蹱칫鷅਩'
    //   17404: getstatic Perryc.c : I
    //   17407: iflt -> 17421
    //   17410: ldc2_w 23387657
    //   17413: l2i
    //   17414: ldc_w -2075011599
    //   17417: ixor
    //   17418: goto -> 17429
    //   17421: ldc2_w 258805297
    //   17424: l2i
    //   17425: ldc_w 74501200
    //   17428: ixor
    //   17429: ldc2_w 475386088
    //   17432: l2i
    //   17433: ldc_w -477138714
    //   17436: ixor
    //   17437: ixor
    //   17438: lookupswitch default -> 19828, -188259729 -> 17464, 2062527478 -> 17421
    //   17464: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   17467: ldc2_w -1146338943
    //   17470: l2i
    //   17471: ldc_w -1146338946
    //   17474: ixor
    //   17475: getstatic Perryc.1 : I
    //   17478: ifeq -> 17492
    //   17481: ldc2_w 233260435
    //   17484: l2i
    //   17485: ldc_w -504538613
    //   17488: ixor
    //   17489: goto -> 17500
    //   17492: ldc2_w 966302441
    //   17495: l2i
    //   17496: ldc_w -1198705425
    //   17499: ixor
    //   17500: ldc2_w 1182338962
    //   17503: l2i
    //   17504: ldc_w -2003683938
    //   17507: ixor
    //   17508: ixor
    //   17509: lookupswitch default -> 17536, -582979317 -> 17492, 585180564 -> 19658
    //   17536: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   17539: ldc2_w -1794072429
    //   17542: l2i
    //   17543: ldc_w -1794072429
    //   17546: ixor
    //   17547: getstatic Perryc.c : I
    //   17550: iflt -> 17564
    //   17553: ldc2_w -434897425
    //   17556: l2i
    //   17557: ldc_w 395595296
    //   17560: ixor
    //   17561: goto -> 17572
    //   17564: ldc2_w 1681414315
    //   17567: l2i
    //   17568: ldc_w 1766303165
    //   17571: ixor
    //   17572: ldc2_w 1126958973
    //   17575: l2i
    //   17576: ldc_w 794590420
    //   17579: ixor
    //   17580: ixor
    //   17581: lookupswitch default -> 17608, -1644705690 -> 19726, 209080411 -> 17564
    //   17608: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   17611: ldc2_w 1973053418
    //   17614: l2i
    //   17615: ldc_w 1973053205
    //   17618: ixor
    //   17619: getstatic Perryc.0 : I
    //   17622: ifle -> 17636
    //   17625: ldc2_w 837096486
    //   17628: l2i
    //   17629: ldc_w -1434136893
    //   17632: ixor
    //   17633: goto -> 17644
    //   17636: ldc2_w 1420302766
    //   17639: l2i
    //   17640: ldc_w 1367785908
    //   17643: ixor
    //   17644: ldc2_w -1893052562
    //   17647: l2i
    //   17648: ldc_w 1501620369
    //   17651: ixor
    //   17652: ixor
    //   17653: lookupswitch default -> 17680, -1169797616 -> 17636, 1305181466 -> 19906
    //   17680: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   17683: getstatic Perryc.1 : I
    //   17686: ifeq -> 17700
    //   17689: ldc2_w -1109655181
    //   17692: l2i
    //   17693: ldc_w -1467751618
    //   17696: ixor
    //   17697: goto -> 17708
    //   17700: ldc2_w -2029241870
    //   17703: l2i
    //   17704: ldc_w -136887005
    //   17707: ixor
    //   17708: ldc2_w 1926863729
    //   17711: l2i
    //   17712: ldc_w -1773970435
    //   17715: ixor
    //   17716: ixor
    //   17717: lookupswitch default -> 19950, -1807631267 -> 17744, -238738751 -> 17700
    //   17744: aload_0
    //   17745: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   17750: getstatic Perryc.0 : I
    //   17753: ifle -> 17767
    //   17756: ldc2_w -1256947068
    //   17759: l2i
    //   17760: ldc_w -760200933
    //   17763: ixor
    //   17764: goto -> 17775
    //   17767: ldc2_w -102116663
    //   17770: l2i
    //   17771: ldc_w -1083262234
    //   17774: ixor
    //   17775: ldc2_w 190285564
    //   17778: l2i
    //   17779: ldc_w 336506838
    //   17782: ixor
    //   17783: ixor
    //   17784: lookupswitch default -> 19910, 1507737861 -> 17812, 2029906613 -> 17767
    //   17812: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   17815: getstatic Perryc.c : I
    //   17818: iflt -> 17832
    //   17821: ldc2_w -815826182
    //   17824: l2i
    //   17825: ldc_w 942646216
    //   17828: ixor
    //   17829: goto -> 17840
    //   17832: ldc2_w -23977976
    //   17835: l2i
    //   17836: ldc_w 912339390
    //   17839: ixor
    //   17840: ldc2_w 741068099
    //   17843: l2i
    //   17844: ldc_w 1104851006
    //   17847: ixor
    //   17848: ixor
    //   17849: lookupswitch default -> 17876, -1702779825 -> 19820, 1369868122 -> 17832
    //   17876: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   17879: getstatic Perryc.c : I
    //   17882: iflt -> 17896
    //   17885: ldc2_w 1403844897
    //   17888: l2i
    //   17889: ldc_w -816648760
    //   17892: ixor
    //   17893: goto -> 17904
    //   17896: ldc2_w -916882966
    //   17899: l2i
    //   17900: ldc_w 2016821400
    //   17903: ixor
    //   17904: ldc2_w -1095888309
    //   17907: l2i
    //   17908: ldc_w 172771035
    //   17911: ixor
    //   17912: ixor
    //   17913: lookupswitch default -> 19922, 93154786 -> 17940, 672940153 -> 17896
    //   17940: putfield safecGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   17943: getstatic Perryc.c : I
    //   17946: iflt -> 17960
    //   17949: ldc2_w -752806821
    //   17952: l2i
    //   17953: ldc_w -1514152532
    //   17956: ixor
    //   17957: goto -> 17968
    //   17960: ldc2_w -796639933
    //   17963: l2i
    //   17964: ldc_w -961056768
    //   17967: ixor
    //   17968: ldc2_w -339582806
    //   17971: l2i
    //   17972: ldc_w -1608059695
    //   17975: ixor
    //   17976: ixor
    //   17977: lookupswitch default -> 18004, 1031429516 -> 19620, 1978576754 -> 17960
    //   18004: aload_0
    //   18005: getstatic Perryc.1 : I
    //   18008: ifeq -> 18022
    //   18011: ldc2_w 1389324563
    //   18014: l2i
    //   18015: ldc_w 518644924
    //   18018: ixor
    //   18019: goto -> 18030
    //   18022: ldc2_w -749796143
    //   18025: l2i
    //   18026: ldc_w 1815409521
    //   18029: ixor
    //   18030: ldc2_w -2102834874
    //   18033: l2i
    //   18034: ldc_w -569271467
    //   18037: ixor
    //   18038: ixor
    //   18039: lookupswitch default -> 18064, 278814652 -> 20116, 1804636013 -> 18022
    //   18064: aload_0
    //   18065: new bigname/zprestige/webhack/features/setting/Setting
    //   18068: dup
    //   18069: ldc_w '┴㌿┴㶄銑쮡๼墜蹯칻鷅'
    //   18072: getstatic Perryc.0 : I
    //   18075: ifle -> 18089
    //   18078: ldc2_w 1030127410
    //   18081: l2i
    //   18082: ldc_w -657132194
    //   18085: ixor
    //   18086: goto -> 18097
    //   18089: ldc2_w 929162934
    //   18092: l2i
    //   18093: ldc_w -1190015666
    //   18096: ixor
    //   18097: ldc2_w 322872824
    //   18100: l2i
    //   18101: ldc_w -369110582
    //   18104: ixor
    //   18105: ixor
    //   18106: lookupswitch default -> 18132, 527695454 -> 19618, 709408995 -> 18089
    //   18132: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   18135: ldc2_w 707915862
    //   18138: l2i
    //   18139: ldc_w 707915862
    //   18142: ixor
    //   18143: getstatic Perryc.0 : I
    //   18146: ifle -> 18160
    //   18149: ldc2_w -1382079500
    //   18152: l2i
    //   18153: ldc_w -621011834
    //   18156: ixor
    //   18157: goto -> 18168
    //   18160: ldc2_w -1985811684
    //   18163: l2i
    //   18164: ldc_w 1519644729
    //   18167: ixor
    //   18168: ldc2_w -1739928321
    //   18171: l2i
    //   18172: ldc_w -268349875
    //   18175: ixor
    //   18176: ixor
    //   18177: lookupswitch default -> 18204, 522763712 -> 20122, 1574999747 -> 18160
    //   18204: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   18207: ldc2_w -7032236
    //   18210: l2i
    //   18211: ldc_w -7032236
    //   18214: ixor
    //   18215: getstatic Perryc.c : I
    //   18218: iflt -> 18232
    //   18221: ldc2_w 319283425
    //   18224: l2i
    //   18225: ldc_w 1726790280
    //   18228: ixor
    //   18229: goto -> 18240
    //   18232: ldc2_w 1529233925
    //   18235: l2i
    //   18236: ldc_w -963684211
    //   18239: ixor
    //   18240: ldc2_w 167064212
    //   18243: l2i
    //   18244: ldc_w -99529504
    //   18247: ixor
    //   18248: ixor
    //   18249: lookupswitch default -> 19664, -2045828067 -> 18232, 1850565884 -> 18276
    //   18276: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   18279: ldc2_w -1403929291
    //   18282: l2i
    //   18283: ldc_w -1403929142
    //   18286: ixor
    //   18287: getstatic Perryc.1 : I
    //   18290: ifeq -> 18304
    //   18293: ldc2_w -1198836653
    //   18296: l2i
    //   18297: ldc_w -987369228
    //   18300: ixor
    //   18301: goto -> 18312
    //   18304: ldc2_w -486478062
    //   18307: l2i
    //   18308: ldc_w -1878197830
    //   18311: ixor
    //   18312: ldc2_w -1198726826
    //   18315: l2i
    //   18316: ldc_w 954220137
    //   18319: ixor
    //   18320: ixor
    //   18321: lookupswitch default -> 18348, -37610600 -> 19764, 1413631015 -> 18304
    //   18348: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   18351: getstatic Perryc.c : I
    //   18354: iflt -> 18368
    //   18357: ldc2_w -190176247
    //   18360: l2i
    //   18361: ldc_w 117539375
    //   18364: ixor
    //   18365: goto -> 18376
    //   18368: ldc2_w 253466338
    //   18371: l2i
    //   18372: ldc_w -1874112759
    //   18375: ixor
    //   18376: ldc2_w 2098400881
    //   18379: l2i
    //   18380: ldc_w 1633078476
    //   18383: ixor
    //   18384: ixor
    //   18385: lookupswitch default -> 19540, -2095768746 -> 18412, -269589349 -> 18368
    //   18412: aload_0
    //   18413: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   18418: getstatic Perryc.c : I
    //   18421: iflt -> 18435
    //   18424: ldc2_w 512600087
    //   18427: l2i
    //   18428: ldc_w -634418055
    //   18431: ixor
    //   18432: goto -> 18443
    //   18435: ldc2_w 1661232348
    //   18438: l2i
    //   18439: ldc_w 1909920415
    //   18442: ixor
    //   18443: ldc2_w 274160493
    //   18446: l2i
    //   18447: ldc_w -308366087
    //   18450: ixor
    //   18451: ixor
    //   18452: lookupswitch default -> 20090, -283469353 -> 18480, 963365882 -> 18435
    //   18480: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   18483: getstatic Perryc.1 : I
    //   18486: ifeq -> 18500
    //   18489: ldc2_w 17750177
    //   18492: l2i
    //   18493: ldc_w -162981946
    //   18496: ixor
    //   18497: goto -> 18508
    //   18500: ldc2_w 293261636
    //   18503: l2i
    //   18504: ldc_w -893634620
    //   18507: ixor
    //   18508: ldc2_w 681217351
    //   18511: l2i
    //   18512: ldc_w -1582139109
    //   18515: ixor
    //   18516: ixor
    //   18517: lookupswitch default -> 18544, 1756588953 -> 18500, 2121218875 -> 19912
    //   18544: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   18547: getstatic Perryc.1 : I
    //   18550: ifeq -> 18564
    //   18553: ldc2_w 1105523674
    //   18556: l2i
    //   18557: ldc_w -1105488529
    //   18560: ixor
    //   18561: goto -> 18572
    //   18564: ldc2_w 875969788
    //   18567: l2i
    //   18568: ldc_w 236553652
    //   18571: ixor
    //   18572: ldc2_w 657536109
    //   18575: l2i
    //   18576: ldc_w -513201960
    //   18579: ixor
    //   18580: ixor
    //   18581: lookupswitch default -> 19680, -59267587 -> 18608, 967277056 -> 18564
    //   18608: putfield safecBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   18611: getstatic Perryc.c : I
    //   18614: iflt -> 18628
    //   18617: ldc2_w -742808440
    //   18620: l2i
    //   18621: ldc_w -763085687
    //   18624: ixor
    //   18625: goto -> 18636
    //   18628: ldc2_w 32431308
    //   18631: l2i
    //   18632: ldc_w -324566140
    //   18635: ixor
    //   18636: ldc2_w -1495769499
    //   18639: l2i
    //   18640: ldc_w 473749984
    //   18643: ixor
    //   18644: ixor
    //   18645: lookupswitch default -> 18672, -1143398524 -> 19984, -889182801 -> 18628
    //   18672: aload_0
    //   18673: getstatic Perryc.0 : I
    //   18676: ifle -> 18690
    //   18679: ldc2_w -1571000461
    //   18682: l2i
    //   18683: ldc_w -461359139
    //   18686: ixor
    //   18687: goto -> 18698
    //   18690: ldc2_w -718848180
    //   18693: l2i
    //   18694: ldc_w -384374952
    //   18697: ixor
    //   18698: ldc2_w 765147924
    //   18701: l2i
    //   18702: ldc_w 193446993
    //   18705: ixor
    //   18706: ixor
    //   18707: lookupswitch default -> 18732, -2001967391 -> 18690, 1623238635 -> 19972
    //   18732: aload_0
    //   18733: new bigname/zprestige/webhack/features/setting/Setting
    //   18736: dup
    //   18737: ldc_w '┴㌿┴㶄銑쮡๼墟蹯칾鷈ਦ'
    //   18740: getstatic Perryc.c : I
    //   18743: iflt -> 18757
    //   18746: ldc2_w 690519271
    //   18749: l2i
    //   18750: ldc_w -1462849214
    //   18753: ixor
    //   18754: goto -> 18765
    //   18757: ldc2_w 323626541
    //   18760: l2i
    //   18761: ldc_w 1116235450
    //   18764: ixor
    //   18765: ldc2_w -2059269544
    //   18768: l2i
    //   18769: ldc_w -1344980426
    //   18772: ixor
    //   18773: ixor
    //   18774: lookupswitch default -> 18800, -1418592821 -> 19976, 1511715462 -> 18757
    //   18800: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   18803: ldc2_w 2044845768
    //   18806: l2i
    //   18807: ldc_w 2044845623
    //   18810: ixor
    //   18811: getstatic Perryc.c : I
    //   18814: iflt -> 18828
    //   18817: ldc2_w 1606349505
    //   18820: l2i
    //   18821: ldc_w -732054558
    //   18824: ixor
    //   18825: goto -> 18836
    //   18828: ldc2_w -1018995585
    //   18831: l2i
    //   18832: ldc_w -2060032369
    //   18835: ixor
    //   18836: ldc2_w 1976192335
    //   18839: l2i
    //   18840: ldc_w 2022088077
    //   18843: ixor
    //   18844: ixor
    //   18845: lookupswitch default -> 19752, -2035312159 -> 18828, 1262086706 -> 18872
    //   18872: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   18875: ldc2_w -786800896
    //   18878: l2i
    //   18879: ldc_w -786800896
    //   18882: ixor
    //   18883: getstatic Perryc.c : I
    //   18886: iflt -> 18900
    //   18889: ldc2_w -2028274313
    //   18892: l2i
    //   18893: ldc_w 819347708
    //   18896: ixor
    //   18897: goto -> 18908
    //   18900: ldc2_w -891586125
    //   18903: l2i
    //   18904: ldc_w 1750196992
    //   18907: ixor
    //   18908: ldc2_w -349164520
    //   18911: l2i
    //   18912: ldc_w 671860618
    //   18915: ixor
    //   18916: ixor
    //   18917: lookupswitch default -> 18944, 1709237227 -> 18900, 1962366489 -> 19698
    //   18944: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   18947: ldc2_w 1300311653
    //   18950: l2i
    //   18951: ldc_w 1300311706
    //   18954: ixor
    //   18955: getstatic Perryc.0 : I
    //   18958: ifle -> 18972
    //   18961: ldc2_w -1303918694
    //   18964: l2i
    //   18965: ldc_w -1026247884
    //   18968: ixor
    //   18969: goto -> 18980
    //   18972: ldc2_w -2006192305
    //   18975: l2i
    //   18976: ldc_w -1311321781
    //   18979: ixor
    //   18980: ldc2_w 322586951
    //   18983: l2i
    //   18984: ldc_w -1605488799
    //   18987: ixor
    //   18988: ixor
    //   18989: lookupswitch default -> 19688, -1966516190 -> 19016, -1008266616 -> 18972
    //   19016: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   19019: getstatic Perryc.1 : I
    //   19022: ifeq -> 19036
    //   19025: ldc2_w 588643784
    //   19028: l2i
    //   19029: ldc_w -137974298
    //   19032: ixor
    //   19033: goto -> 19044
    //   19036: ldc2_w -458609477
    //   19039: l2i
    //   19040: ldc_w -56441239
    //   19043: ixor
    //   19044: ldc2_w 10181559
    //   19047: l2i
    //   19048: ldc_w -3253187
    //   19051: ixor
    //   19052: ixor
    //   19053: lookupswitch default -> 20060, -413274792 -> 19080, 730224548 -> 19036
    //   19080: aload_0
    //   19081: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Render/HoleESP;)Ljava/util/function/Predicate;
    //   19086: getstatic Perryc.0 : I
    //   19089: ifle -> 19103
    //   19092: ldc2_w -1716511843
    //   19095: l2i
    //   19096: ldc_w 2108378855
    //   19099: ixor
    //   19100: goto -> 19111
    //   19103: ldc2_w 1520090444
    //   19106: l2i
    //   19107: ldc_w -1746062176
    //   19110: ixor
    //   19111: ldc2_w -1743173162
    //   19114: l2i
    //   19115: ldc_w -1292975229
    //   19118: ixor
    //   19119: ixor
    //   19120: lookupswitch default -> 19616, -823337169 -> 19103, -411040839 -> 19148
    //   19148: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   19151: getstatic Perryc.1 : I
    //   19154: ifeq -> 19168
    //   19157: ldc2_w -448262205
    //   19160: l2i
    //   19161: ldc_w 2139555081
    //   19164: ixor
    //   19165: goto -> 19176
    //   19168: ldc2_w -400103582
    //   19171: l2i
    //   19172: ldc_w -136360532
    //   19175: ixor
    //   19176: ldc2_w 2089470485
    //   19179: l2i
    //   19180: ldc_w 1113468908
    //   19183: ixor
    //   19184: ixor
    //   19185: lookupswitch default -> 19212, -1541673165 -> 19650, 954204741 -> 19168
    //   19212: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   19215: getstatic Perryc.0 : I
    //   19218: ifle -> 19232
    //   19221: ldc2_w 1878380688
    //   19224: l2i
    //   19225: ldc_w 726014423
    //   19228: ixor
    //   19229: goto -> 19240
    //   19232: ldc2_w 110029697
    //   19235: l2i
    //   19236: ldc_w -843149196
    //   19239: ixor
    //   19240: ldc2_w -1442399352
    //   19243: l2i
    //   19244: ldc_w 1150570124
    //   19247: ixor
    //   19248: ixor
    //   19249: lookupswitch default -> 19276, -1440662461 -> 19714, 1911484147 -> 19232
    //   19276: putfield safecAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   19279: getstatic Perryc.1 : I
    //   19282: ifeq -> 19296
    //   19285: ldc2_w 1548704242
    //   19288: l2i
    //   19289: ldc_w 1246551109
    //   19292: ixor
    //   19293: goto -> 19304
    //   19296: ldc2_w -2038118959
    //   19299: l2i
    //   19300: ldc_w 1099487663
    //   19303: ixor
    //   19304: ldc2_w 1484334091
    //   19307: l2i
    //   19308: ldc_w 459898223
    //   19311: ixor
    //   19312: ixor
    //   19313: lookupswitch default -> 19750, -2078522086 -> 19340, 1427365075 -> 19296
    //   19340: aload_0
    //   19341: ldc2_w -1510356370
    //   19344: l2i
    //   19345: ldc_w -1510356370
    //   19348: ixor
    //   19349: getstatic Perryc.0 : I
    //   19352: ifle -> 19366
    //   19355: ldc2_w -770348496
    //   19358: l2i
    //   19359: ldc_w 1303890157
    //   19362: ixor
    //   19363: goto -> 19374
    //   19366: ldc2_w -1189184856
    //   19369: l2i
    //   19370: ldc_w 562665973
    //   19373: ixor
    //   19374: ldc2_w -1918064632
    //   19377: l2i
    //   19378: ldc_w 1137271607
    //   19381: ixor
    //   19382: ixor
    //   19383: lookupswitch default -> 19978, 1372023266 -> 19366, 1458710626 -> 19408
    //   19408: putfield currentAlpha : I
    //   19411: getstatic Perryc.0 : I
    //   19414: ifle -> 19428
    //   19417: ldc2_w 1807405543
    //   19420: l2i
    //   19421: ldc_w -983299931
    //   19424: ixor
    //   19425: goto -> 19436
    //   19428: ldc2_w 847210777
    //   19431: l2i
    //   19432: ldc_w 1207829516
    //   19435: ixor
    //   19436: ldc2_w -2014985528
    //   19439: l2i
    //   19440: ldc_w 2090076196
    //   19443: ixor
    //   19444: ixor
    //   19445: lookupswitch default -> 19472, -1190618536 -> 19428, 1437537198 -> 19780
    //   19472: aload_0
    //   19473: getstatic Perryc.c : I
    //   19476: iflt -> 19490
    //   19479: ldc2_w 1870503198
    //   19482: l2i
    //   19483: ldc_w -1487553324
    //   19486: ixor
    //   19487: goto -> 19498
    //   19490: ldc2_w 377487530
    //   19493: l2i
    //   19494: ldc_w 1528294481
    //   19497: ixor
    //   19498: ldc2_w 779231618
    //   19501: l2i
    //   19502: ldc_w -468562209
    //   19505: ixor
    //   19506: ixor
    //   19507: lookupswitch default -> 19532, 38293143 -> 19544, 677813718 -> 19490
    //   19532: invokespecial setInstance : ()V
    //   19535: return
    //   19536: aconst_null
    //   19537: athrow
    //   19538: aconst_null
    //   19539: athrow
    //   19540: aconst_null
    //   19541: athrow
    //   19542: aconst_null
    //   19543: athrow
    //   19544: aconst_null
    //   19545: athrow
    //   19546: aconst_null
    //   19547: athrow
    //   19548: aconst_null
    //   19549: athrow
    //   19550: aconst_null
    //   19551: athrow
    //   19552: aconst_null
    //   19553: athrow
    //   19554: aconst_null
    //   19555: athrow
    //   19556: aconst_null
    //   19557: athrow
    //   19558: aconst_null
    //   19559: athrow
    //   19560: aconst_null
    //   19561: athrow
    //   19562: aconst_null
    //   19563: athrow
    //   19564: aconst_null
    //   19565: athrow
    //   19566: aconst_null
    //   19567: athrow
    //   19568: aconst_null
    //   19569: athrow
    //   19570: aconst_null
    //   19571: athrow
    //   19572: aconst_null
    //   19573: athrow
    //   19574: aconst_null
    //   19575: athrow
    //   19576: aconst_null
    //   19577: athrow
    //   19578: aconst_null
    //   19579: athrow
    //   19580: aconst_null
    //   19581: athrow
    //   19582: aconst_null
    //   19583: athrow
    //   19584: aconst_null
    //   19585: athrow
    //   19586: aconst_null
    //   19587: athrow
    //   19588: aconst_null
    //   19589: athrow
    //   19590: aconst_null
    //   19591: athrow
    //   19592: aconst_null
    //   19593: athrow
    //   19594: aconst_null
    //   19595: athrow
    //   19596: aconst_null
    //   19597: athrow
    //   19598: aconst_null
    //   19599: athrow
    //   19600: aconst_null
    //   19601: athrow
    //   19602: aconst_null
    //   19603: athrow
    //   19604: aconst_null
    //   19605: athrow
    //   19606: aconst_null
    //   19607: athrow
    //   19608: aconst_null
    //   19609: athrow
    //   19610: aconst_null
    //   19611: athrow
    //   19612: aconst_null
    //   19613: athrow
    //   19614: aconst_null
    //   19615: athrow
    //   19616: aconst_null
    //   19617: athrow
    //   19618: aconst_null
    //   19619: athrow
    //   19620: aconst_null
    //   19621: athrow
    //   19622: aconst_null
    //   19623: athrow
    //   19624: aconst_null
    //   19625: athrow
    //   19626: aconst_null
    //   19627: athrow
    //   19628: aconst_null
    //   19629: athrow
    //   19630: aconst_null
    //   19631: athrow
    //   19632: aconst_null
    //   19633: athrow
    //   19634: aconst_null
    //   19635: athrow
    //   19636: aconst_null
    //   19637: athrow
    //   19638: aconst_null
    //   19639: athrow
    //   19640: aconst_null
    //   19641: athrow
    //   19642: aconst_null
    //   19643: athrow
    //   19644: aconst_null
    //   19645: athrow
    //   19646: aconst_null
    //   19647: athrow
    //   19648: aconst_null
    //   19649: athrow
    //   19650: aconst_null
    //   19651: athrow
    //   19652: aconst_null
    //   19653: athrow
    //   19654: aconst_null
    //   19655: athrow
    //   19656: aconst_null
    //   19657: athrow
    //   19658: aconst_null
    //   19659: athrow
    //   19660: aconst_null
    //   19661: athrow
    //   19662: aconst_null
    //   19663: athrow
    //   19664: aconst_null
    //   19665: athrow
    //   19666: aconst_null
    //   19667: athrow
    //   19668: aconst_null
    //   19669: athrow
    //   19670: aconst_null
    //   19671: athrow
    //   19672: aconst_null
    //   19673: athrow
    //   19674: aconst_null
    //   19675: athrow
    //   19676: aconst_null
    //   19677: athrow
    //   19678: aconst_null
    //   19679: athrow
    //   19680: aconst_null
    //   19681: athrow
    //   19682: aconst_null
    //   19683: athrow
    //   19684: aconst_null
    //   19685: athrow
    //   19686: aconst_null
    //   19687: athrow
    //   19688: aconst_null
    //   19689: athrow
    //   19690: aconst_null
    //   19691: athrow
    //   19692: aconst_null
    //   19693: athrow
    //   19694: aconst_null
    //   19695: athrow
    //   19696: aconst_null
    //   19697: athrow
    //   19698: aconst_null
    //   19699: athrow
    //   19700: aconst_null
    //   19701: athrow
    //   19702: aconst_null
    //   19703: athrow
    //   19704: aconst_null
    //   19705: athrow
    //   19706: aconst_null
    //   19707: athrow
    //   19708: aconst_null
    //   19709: athrow
    //   19710: aconst_null
    //   19711: athrow
    //   19712: aconst_null
    //   19713: athrow
    //   19714: aconst_null
    //   19715: athrow
    //   19716: aconst_null
    //   19717: athrow
    //   19718: aconst_null
    //   19719: athrow
    //   19720: aconst_null
    //   19721: athrow
    //   19722: aconst_null
    //   19723: athrow
    //   19724: aconst_null
    //   19725: athrow
    //   19726: aconst_null
    //   19727: athrow
    //   19728: aconst_null
    //   19729: athrow
    //   19730: aconst_null
    //   19731: athrow
    //   19732: aconst_null
    //   19733: athrow
    //   19734: aconst_null
    //   19735: athrow
    //   19736: aconst_null
    //   19737: athrow
    //   19738: aconst_null
    //   19739: athrow
    //   19740: aconst_null
    //   19741: athrow
    //   19742: aconst_null
    //   19743: athrow
    //   19744: aconst_null
    //   19745: athrow
    //   19746: aconst_null
    //   19747: athrow
    //   19748: aconst_null
    //   19749: athrow
    //   19750: aconst_null
    //   19751: athrow
    //   19752: aconst_null
    //   19753: athrow
    //   19754: aconst_null
    //   19755: athrow
    //   19756: aconst_null
    //   19757: athrow
    //   19758: aconst_null
    //   19759: athrow
    //   19760: aconst_null
    //   19761: athrow
    //   19762: aconst_null
    //   19763: athrow
    //   19764: aconst_null
    //   19765: athrow
    //   19766: aconst_null
    //   19767: athrow
    //   19768: aconst_null
    //   19769: athrow
    //   19770: aconst_null
    //   19771: athrow
    //   19772: aconst_null
    //   19773: athrow
    //   19774: aconst_null
    //   19775: athrow
    //   19776: aconst_null
    //   19777: athrow
    //   19778: aconst_null
    //   19779: athrow
    //   19780: aconst_null
    //   19781: athrow
    //   19782: aconst_null
    //   19783: athrow
    //   19784: aconst_null
    //   19785: athrow
    //   19786: aconst_null
    //   19787: athrow
    //   19788: aconst_null
    //   19789: athrow
    //   19790: aconst_null
    //   19791: athrow
    //   19792: aconst_null
    //   19793: athrow
    //   19794: aconst_null
    //   19795: athrow
    //   19796: aconst_null
    //   19797: athrow
    //   19798: aconst_null
    //   19799: athrow
    //   19800: aconst_null
    //   19801: athrow
    //   19802: aconst_null
    //   19803: athrow
    //   19804: aconst_null
    //   19805: athrow
    //   19806: aconst_null
    //   19807: athrow
    //   19808: aconst_null
    //   19809: athrow
    //   19810: aconst_null
    //   19811: athrow
    //   19812: aconst_null
    //   19813: athrow
    //   19814: aconst_null
    //   19815: athrow
    //   19816: aconst_null
    //   19817: athrow
    //   19818: aconst_null
    //   19819: athrow
    //   19820: aconst_null
    //   19821: athrow
    //   19822: aconst_null
    //   19823: athrow
    //   19824: aconst_null
    //   19825: athrow
    //   19826: aconst_null
    //   19827: athrow
    //   19828: aconst_null
    //   19829: athrow
    //   19830: aconst_null
    //   19831: athrow
    //   19832: aconst_null
    //   19833: athrow
    //   19834: aconst_null
    //   19835: athrow
    //   19836: aconst_null
    //   19837: athrow
    //   19838: aconst_null
    //   19839: athrow
    //   19840: aconst_null
    //   19841: athrow
    //   19842: aconst_null
    //   19843: athrow
    //   19844: aconst_null
    //   19845: athrow
    //   19846: aconst_null
    //   19847: athrow
    //   19848: aconst_null
    //   19849: athrow
    //   19850: aconst_null
    //   19851: athrow
    //   19852: aconst_null
    //   19853: athrow
    //   19854: aconst_null
    //   19855: athrow
    //   19856: aconst_null
    //   19857: athrow
    //   19858: aconst_null
    //   19859: athrow
    //   19860: aconst_null
    //   19861: athrow
    //   19862: aconst_null
    //   19863: athrow
    //   19864: aconst_null
    //   19865: athrow
    //   19866: aconst_null
    //   19867: athrow
    //   19868: aconst_null
    //   19869: athrow
    //   19870: aconst_null
    //   19871: athrow
    //   19872: aconst_null
    //   19873: athrow
    //   19874: aconst_null
    //   19875: athrow
    //   19876: aconst_null
    //   19877: athrow
    //   19878: aconst_null
    //   19879: athrow
    //   19880: aconst_null
    //   19881: athrow
    //   19882: aconst_null
    //   19883: athrow
    //   19884: aconst_null
    //   19885: athrow
    //   19886: aconst_null
    //   19887: athrow
    //   19888: aconst_null
    //   19889: athrow
    //   19890: aconst_null
    //   19891: athrow
    //   19892: aconst_null
    //   19893: athrow
    //   19894: aconst_null
    //   19895: athrow
    //   19896: aconst_null
    //   19897: athrow
    //   19898: aconst_null
    //   19899: athrow
    //   19900: aconst_null
    //   19901: athrow
    //   19902: aconst_null
    //   19903: athrow
    //   19904: aconst_null
    //   19905: athrow
    //   19906: aconst_null
    //   19907: athrow
    //   19908: aconst_null
    //   19909: athrow
    //   19910: aconst_null
    //   19911: athrow
    //   19912: aconst_null
    //   19913: athrow
    //   19914: aconst_null
    //   19915: athrow
    //   19916: aconst_null
    //   19917: athrow
    //   19918: aconst_null
    //   19919: athrow
    //   19920: aconst_null
    //   19921: athrow
    //   19922: aconst_null
    //   19923: athrow
    //   19924: aconst_null
    //   19925: athrow
    //   19926: aconst_null
    //   19927: athrow
    //   19928: aconst_null
    //   19929: athrow
    //   19930: aconst_null
    //   19931: athrow
    //   19932: aconst_null
    //   19933: athrow
    //   19934: aconst_null
    //   19935: athrow
    //   19936: aconst_null
    //   19937: athrow
    //   19938: aconst_null
    //   19939: athrow
    //   19940: aconst_null
    //   19941: athrow
    //   19942: aconst_null
    //   19943: athrow
    //   19944: aconst_null
    //   19945: athrow
    //   19946: aconst_null
    //   19947: athrow
    //   19948: aconst_null
    //   19949: athrow
    //   19950: aconst_null
    //   19951: athrow
    //   19952: aconst_null
    //   19953: athrow
    //   19954: aconst_null
    //   19955: athrow
    //   19956: aconst_null
    //   19957: athrow
    //   19958: aconst_null
    //   19959: athrow
    //   19960: aconst_null
    //   19961: athrow
    //   19962: aconst_null
    //   19963: athrow
    //   19964: aconst_null
    //   19965: athrow
    //   19966: aconst_null
    //   19967: athrow
    //   19968: aconst_null
    //   19969: athrow
    //   19970: aconst_null
    //   19971: athrow
    //   19972: aconst_null
    //   19973: athrow
    //   19974: aconst_null
    //   19975: athrow
    //   19976: aconst_null
    //   19977: athrow
    //   19978: aconst_null
    //   19979: athrow
    //   19980: aconst_null
    //   19981: athrow
    //   19982: aconst_null
    //   19983: athrow
    //   19984: aconst_null
    //   19985: athrow
    //   19986: aconst_null
    //   19987: athrow
    //   19988: aconst_null
    //   19989: athrow
    //   19990: aconst_null
    //   19991: athrow
    //   19992: aconst_null
    //   19993: athrow
    //   19994: aconst_null
    //   19995: athrow
    //   19996: aconst_null
    //   19997: athrow
    //   19998: aconst_null
    //   19999: athrow
    //   20000: aconst_null
    //   20001: athrow
    //   20002: aconst_null
    //   20003: athrow
    //   20004: aconst_null
    //   20005: athrow
    //   20006: aconst_null
    //   20007: athrow
    //   20008: aconst_null
    //   20009: athrow
    //   20010: aconst_null
    //   20011: athrow
    //   20012: aconst_null
    //   20013: athrow
    //   20014: aconst_null
    //   20015: athrow
    //   20016: aconst_null
    //   20017: athrow
    //   20018: aconst_null
    //   20019: athrow
    //   20020: aconst_null
    //   20021: athrow
    //   20022: aconst_null
    //   20023: athrow
    //   20024: aconst_null
    //   20025: athrow
    //   20026: aconst_null
    //   20027: athrow
    //   20028: aconst_null
    //   20029: athrow
    //   20030: aconst_null
    //   20031: athrow
    //   20032: aconst_null
    //   20033: athrow
    //   20034: aconst_null
    //   20035: athrow
    //   20036: aconst_null
    //   20037: athrow
    //   20038: aconst_null
    //   20039: athrow
    //   20040: aconst_null
    //   20041: athrow
    //   20042: aconst_null
    //   20043: athrow
    //   20044: aconst_null
    //   20045: athrow
    //   20046: aconst_null
    //   20047: athrow
    //   20048: aconst_null
    //   20049: athrow
    //   20050: aconst_null
    //   20051: athrow
    //   20052: aconst_null
    //   20053: athrow
    //   20054: aconst_null
    //   20055: athrow
    //   20056: aconst_null
    //   20057: athrow
    //   20058: aconst_null
    //   20059: athrow
    //   20060: aconst_null
    //   20061: athrow
    //   20062: aconst_null
    //   20063: athrow
    //   20064: aconst_null
    //   20065: athrow
    //   20066: aconst_null
    //   20067: athrow
    //   20068: aconst_null
    //   20069: athrow
    //   20070: aconst_null
    //   20071: athrow
    //   20072: aconst_null
    //   20073: athrow
    //   20074: aconst_null
    //   20075: athrow
    //   20076: aconst_null
    //   20077: athrow
    //   20078: aconst_null
    //   20079: athrow
    //   20080: aconst_null
    //   20081: athrow
    //   20082: aconst_null
    //   20083: athrow
    //   20084: aconst_null
    //   20085: athrow
    //   20086: aconst_null
    //   20087: athrow
    //   20088: aconst_null
    //   20089: athrow
    //   20090: aconst_null
    //   20091: athrow
    //   20092: aconst_null
    //   20093: athrow
    //   20094: aconst_null
    //   20095: athrow
    //   20096: aconst_null
    //   20097: athrow
    //   20098: aconst_null
    //   20099: athrow
    //   20100: aconst_null
    //   20101: athrow
    //   20102: aconst_null
    //   20103: athrow
    //   20104: aconst_null
    //   20105: athrow
    //   20106: aconst_null
    //   20107: athrow
    //   20108: aconst_null
    //   20109: athrow
    //   20110: aconst_null
    //   20111: athrow
    //   20112: aconst_null
    //   20113: athrow
    //   20114: aconst_null
    //   20115: athrow
    //   20116: aconst_null
    //   20117: athrow
    //   20118: aconst_null
    //   20119: athrow
    //   20120: aconst_null
    //   20121: athrow
    //   20122: aconst_null
    //   20123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	19536	0	this	Lbigname/zprestige/webhack/features/modules/Render/HoleESP;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Render\HoleESP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */