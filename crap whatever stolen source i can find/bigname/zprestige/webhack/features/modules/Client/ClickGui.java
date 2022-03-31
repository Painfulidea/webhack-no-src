package bigname.zprestige.webhack.features.modules.Client;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.ClientEvent;
import bigname.zprestige.webhack.event.events.Render2DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClickGui extends Module {
  public Setting<Integer> alpha;
  
  public Setting<String> prefix;
  
  public Setting<Integer> g_green1;
  
  public Setting<Integer> gb_green;
  
  public Setting<Integer> rainbowHue;
  
  public Setting<Boolean> customFont;
  
  public Setting<Integer> gb_blue;
  
  public Setting<Integer> g_alpha;
  
  public Setting<Integer> gb_red;
  
  public Setting<Integer> alphaBox;
  
  public Setting<Integer> green;
  
  public static ClickGui INSTANCE;
  
  public Setting<Boolean> guiComponent;
  
  public Setting<Boolean> customScreen;
  
  public Setting<Integer> g_green;
  
  public Setting<Boolean> rainbow;
  
  public Setting<Integer> g_blue1;
  
  public Setting<Boolean> background;
  
  public Setting<Integer> hoverAlpha;
  
  public Setting<ClickGui$rainbowMode> rainbowModeHud;
  
  public Setting<ClickGui$Settings> setting;
  
  public Setting<ClickGui$rainbowModeArray> rainbowModeA;
  
  public Setting<Integer> red;
  
  public Setting<Integer> g_blue;
  
  public Setting<Float> rainbowBrightness;
  
  public Setting<Integer> g_red;
  
  public Setting<Integer> backgroundAlpha;
  
  public Setting<Float> rainbowSaturation;
  
  public Setting<Integer> blue;
  
  public Setting<Integer> g_red1;
  
  public Setting<Boolean> rainbowg;
  
  public Setting<ClickGui$Mode> mode;
  
  public Setting<Integer> g_alpha1;
  
  public boolean lambda$new$10(Object paramObject) {
    return Perry1.1z(this, (int)-1821832606L ^ 0xF6F599FF, paramObject);
  }
  
  public static ClickGui getInstance() {
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
  
  public void onRender2D(Render2DEvent paramRender2DEvent) {
    Perry1.U(this, (int)-210576730L ^ 0xB3A80AE4, paramRender2DEvent);
  }
  
  public boolean lambda$new$12(Object paramObject) {
    return Perry1.1K(this, (int)1469296585L ^ 0x5CFF74A0, paramObject);
  }
  
  public boolean lambda$new$6(Integer paramInteger) {
    return Perry1.5p(this, (int)1303796061L ^ 0x7D2D87E8, paramInteger);
  }
  
  public boolean lambda$new$1(Integer paramInteger) {
    return Perry1.5y(this, (int)-1889054257L ^ 0xEA3D09E1, paramInteger);
  }
  
  public boolean lambda$new$18(Integer paramInteger) {
    return Perry1.5s(this, (int)605598862L ^ 0x7F1F8433, paramInteger);
  }
  
  public boolean lambda$new$13(Boolean paramBoolean) {
    return Perry1.2t(this, (int)354865231L ^ 0x35FF24F, paramBoolean);
  }
  
  public boolean lambda$new$8(Object paramObject) {
    return Perry1.1L(this, (int)1714276486L ^ 0x214A5A4D, paramObject);
  }
  
  public boolean lambda$new$9(Object paramObject) {
    return Perry1.1X(this, (int)-1625769056L ^ 0xA2EFBB57, paramObject);
  }
  
  public void onDisable() {
    Perry1.3u(this, (int)691076630L ^ 0x70B486AA);
  }
  
  public boolean lambda$new$27(Integer paramInteger) {
    return Perry1.5i(this, (int)-1439225119L ^ 0x8987DD40, paramInteger);
  }
  
  @SubscribeEvent
  public void onSettingChange(ClientEvent event) {
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
    //   0: new bigname/zprestige/webhack/features/modules/Client/ClickGui
    //   3: dup
    //   4: getstatic Perryc.c : I
    //   7: iflt -> 21
    //   10: ldc2_w -1286481745
    //   13: l2i
    //   14: ldc_w -2090151404
    //   17: ixor
    //   18: goto -> 29
    //   21: ldc2_w 846792415
    //   24: l2i
    //   25: ldc_w -775933550
    //   28: ixor
    //   29: ldc2_w -752391123
    //   32: l2i
    //   33: ldc_w 1480117846
    //   36: ixor
    //   37: ixor
    //   38: lookupswitch default -> 64, -1155225408 -> 134, -428390980 -> 21
    //   64: invokespecial <init> : ()V
    //   67: getstatic Perryc.1 : I
    //   70: ifeq -> 84
    //   73: ldc2_w -1717212127
    //   76: l2i
    //   77: ldc_w -781833333
    //   80: ixor
    //   81: goto -> 92
    //   84: ldc2_w -874962189
    //   87: l2i
    //   88: ldc_w -1649104778
    //   91: ixor
    //   92: ldc2_w -807473861
    //   95: l2i
    //   96: ldc_w 899264347
    //   99: ixor
    //   100: ixor
    //   101: lookupswitch default -> 132, -1406482203 -> 128, -1299970614 -> 84
    //   128: putstatic bigname/zprestige/webhack/features/modules/Client/ClickGui.INSTANCE : Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
    //   131: return
    //   132: aconst_null
    //   133: athrow
    //   134: aconst_null
    //   135: athrow
  }
  
  public void onLoad() {
    Perry1.3L(this, (int)-681935308L ^ 0xC66D66F8);
  }
  
  public boolean lambda$new$23(Integer paramInteger) {
    return Perry1.5a(this, (int)-403708637L ^ 0x90794A7F, paramInteger);
  }
  
  public boolean lambda$new$17(Integer paramInteger) {
    return Perry1.5a(this, (int)1763159891L ^ 0x1E810008, paramInteger);
  }
  
  public boolean lambda$new$5(Object paramObject) {
    return Perry1.1R(this, (int)-2047306562L ^ 0x893A104E, paramObject);
  }
  
  public boolean lambda$new$24(Object paramObject) {
    return Perry1.1P(this, (int)2129229502L ^ 0x7F861785, paramObject);
  }
  
  public void drawBackground() {
    Perry1.3C(this, (int)824384186L ^ 0x40434DC8);
  }
  
  public void onTick() {
    Perry1.48(this, (int)302988634L ^ 0x41FBB83B);
  }
  
  public boolean lambda$new$0(String paramString) {
    return Perry1.0O(this, (int)-1566521451L ^ 0x8C27051B, paramString);
  }
  
  public boolean lambda$new$26(Integer paramInteger) {
    return Perry1.5h(this, (int)-1539699454L ^ 0xD5F339BD, paramInteger);
  }
  
  public boolean lambda$new$21(Integer paramInteger) {
    return Perry1.5d(this, (int)1686227765L ^ 0x2B9A743B, paramInteger);
  }
  
  public boolean lambda$new$28(Integer paramInteger) {
    return Perry1.5v(this, (int)-1621531004L ^ 0x907723FD, paramInteger);
  }
  
  public void setInstance() {
    Perry1.3Q(this, (int)-671332568L ^ 0xBBE9F733);
  }
  
  public boolean lambda$new$7(Boolean paramBoolean) {
    return Perry1.2n(this, (int)1998122170L ^ 0x340DE0C, paramBoolean);
  }
  
  public boolean lambda$new$19(Integer paramInteger) {
    return Perry1.5x(this, (int)-278321019L ^ 0xD3E7E074, paramInteger);
  }
  
  public boolean lambda$new$15(Boolean paramBoolean) {
    return Perry1.2p(this, (int)648875793L ^ 0x716EF89F, paramBoolean);
  }
  
  public boolean lambda$new$20(Integer paramInteger) {
    return Perry1.5t(this, (int)-459684487L ^ 0xF1D334FB, paramInteger);
  }
  
  public void onEnable() {
    Perry1.4k(this, (int)1351275376L ^ 0x5C8AAC90);
  }
  
  public boolean lambda$new$2(Integer paramInteger) {
    return Perry1.5o(this, (int)-1977734182L ^ 0xB455F6F5, paramInteger);
  }
  
  public boolean lambda$new$25(Integer paramInteger) {
    return Perry1.5i(this, (int)949692025L ^ 0x1B2BD1D9, paramInteger);
  }
  
  public boolean lambda$new$3(Integer paramInteger) {
    return Perry1.5g(this, (int)-2104402856L ^ 0xBFC4F016, paramInteger);
  }
  
  public boolean lambda$new$22(Integer paramInteger) {
    return Perry1.5b(this, (int)-295020358L ^ 0xD4BDE74B, paramInteger);
  }
  
  public boolean lambda$new$16(Integer paramInteger) {
    return Perry1.5l(this, (int)1880948483L ^ 0x32468A78, paramInteger);
  }
  
  public boolean lambda$new$11(Object paramObject) {
    return Perry1.21(this, (int)2041364399L ^ 0xC224D, paramObject);
  }
  
  public boolean lambda$new$14(Boolean paramBoolean) {
    return Perry1.2s(this, (int)-1352507720L ^ 0x87F71473, paramBoolean);
  }
  
  public boolean lambda$new$4(Integer paramInteger) {
    return Perry1.5u(this, (int)-2031538595L ^ 0x9A781B35, paramInteger);
  }
  
  public ClickGui() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w -24487522
    //   9: l2i
    //   10: ldc_w 240439940
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -719815202
    //   20: l2i
    //   21: ldc_w -673650288
    //   24: ixor
    //   25: ldc2_w 1340590823
    //   28: l2i
    //   29: ldc_w -1114360970
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 20444, -256676385 -> 60, 44921483 -> 17
    //   60: aload_0
    //   61: ldc_w '෎㌟ඎ㶴륁๬灉'
    //   64: getstatic Perryc.c : I
    //   67: iflt -> 81
    //   70: ldc2_w -1340994227
    //   73: l2i
    //   74: ldc_w 721550921
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 326049460
    //   84: l2i
    //   85: ldc_w 821421273
    //   88: ixor
    //   89: ldc2_w 2144027586
    //   92: l2i
    //   93: ldc_w 1879353557
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, -1797515245 -> 20714, -516202371 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w 'ෂ㌃ං㶹륙๭灈蹦딕ਫ쀼煢慉邯辊헩'
    //   130: getstatic Perryc.1 : I
    //   133: ifeq -> 147
    //   136: ldc2_w 1091457746
    //   139: l2i
    //   140: ldc_w 332175487
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w 2085735134
    //   150: l2i
    //   151: ldc_w 1416821169
    //   154: ixor
    //   155: ldc2_w -1187264823
    //   158: l2i
    //   159: ldc_w -2131324952
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 20742, 300841550 -> 192, 1796178828 -> 147
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.1 : I
    //   198: ifeq -> 212
    //   201: ldc2_w -863566429
    //   204: l2i
    //   205: ldc_w 1363276824
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w 1285720263
    //   215: l2i
    //   216: ldc_w 1891171291
    //   219: ixor
    //   220: ldc2_w -1594986786
    //   223: l2i
    //   224: ldc_w 1262784024
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 20728, -676293670 -> 256, 1986793853 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.CLIENT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -1993207523
    //   262: l2i
    //   263: ldc_w -1993207524
    //   266: ixor
    //   267: ldc2_w 1845479386
    //   270: l2i
    //   271: ldc_w 1845479386
    //   274: ixor
    //   275: ldc2_w 1408793030
    //   278: l2i
    //   279: ldc_w 1408793030
    //   282: ixor
    //   283: getstatic Perryc.0 : I
    //   286: ifle -> 300
    //   289: ldc2_w -277499770
    //   292: l2i
    //   293: ldc_w -2099975419
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -1869736036
    //   303: l2i
    //   304: ldc_w -189388626
    //   307: ixor
    //   308: ldc2_w 438266461
    //   311: l2i
    //   312: ldc_w -594449634
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 20536, -1565114767 -> 344, -1422959936 -> 300
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.c : I
    //   350: iflt -> 364
    //   353: ldc2_w -1863214101
    //   356: l2i
    //   357: ldc_w -899628826
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w 1792827036
    //   367: l2i
    //   368: ldc_w -311840636
    //   371: ixor
    //   372: ldc2_w 842432483
    //   375: l2i
    //   376: ldc_w 1689395481
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 20758, -785272606 -> 408, 202704375 -> 364
    //   408: aload_0
    //   409: getstatic Perryc.0 : I
    //   412: ifle -> 426
    //   415: ldc2_w 1355890403
    //   418: l2i
    //   419: ldc_w 1087121171
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -565477100
    //   429: l2i
    //   430: ldc_w 1550189498
    //   433: ixor
    //   434: ldc2_w -1082528623
    //   437: l2i
    //   438: ldc_w -1834272595
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -1231177703 -> 426, 1037028812 -> 20528
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w 'ෞ㌖ඓ㶣륃๾灓'
    //   476: getstatic Perryc.c : I
    //   479: iflt -> 493
    //   482: ldc2_w -1741992798
    //   485: l2i
    //   486: ldc_w -1453457671
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w 26246942
    //   496: l2i
    //   497: ldc_w 1579208383
    //   500: ixor
    //   501: ldc2_w 1854781293
    //   504: l2i
    //   505: ldc_w -1532374982
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 536, -78457588 -> 20830, 606617529 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: getstatic Perryc.0 : I
    //   542: ifle -> 556
    //   545: ldc2_w -663754659
    //   548: l2i
    //   549: ldc_w 1767352215
    //   552: ixor
    //   553: goto -> 564
    //   556: ldc2_w -1104988006
    //   559: l2i
    //   560: ldc_w 1073832306
    //   563: ixor
    //   564: ldc2_w -1153761411
    //   567: l2i
    //   568: ldc_w -944701401
    //   571: ixor
    //   572: ixor
    //   573: lookupswitch default -> 20302, -2102810958 -> 600, -843861872 -> 556
    //   600: getstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$Settings.CLICKGUI : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$Settings;
    //   603: getstatic Perryc.1 : I
    //   606: ifeq -> 620
    //   609: ldc2_w 927008952
    //   612: l2i
    //   613: ldc_w 1100103086
    //   616: ixor
    //   617: goto -> 628
    //   620: ldc2_w 797198818
    //   623: l2i
    //   624: ldc_w 1183131787
    //   627: ixor
    //   628: ldc2_w 518755458
    //   631: l2i
    //   632: ldc_w 1514896763
    //   635: ixor
    //   636: ixor
    //   637: lookupswitch default -> 20448, 765560976 -> 664, 846453999 -> 620
    //   664: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   667: getstatic Perryc.c : I
    //   670: iflt -> 684
    //   673: ldc2_w -1427133621
    //   676: l2i
    //   677: ldc_w 308170953
    //   680: ixor
    //   681: goto -> 692
    //   684: ldc2_w 1775628073
    //   687: l2i
    //   688: ldc_w 1891149211
    //   691: ixor
    //   692: ldc2_w -543675206
    //   695: l2i
    //   696: ldc_w 2031784308
    //   699: ixor
    //   700: ixor
    //   701: lookupswitch default -> 728, 506676812 -> 20548, 1330217832 -> 684
    //   728: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   731: getstatic Perryc.0 : I
    //   734: ifle -> 748
    //   737: ldc2_w 1815882410
    //   740: l2i
    //   741: ldc_w -42124106
    //   744: ixor
    //   745: goto -> 756
    //   748: ldc2_w -1704969916
    //   751: l2i
    //   752: ldc_w 1644313010
    //   755: ixor
    //   756: ldc2_w 1598460038
    //   759: l2i
    //   760: ldc_w -1112400351
    //   763: ixor
    //   764: ixor
    //   765: lookupswitch default -> 792, -1822843092 -> 748, 1941280955 -> 20440
    //   792: putfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   795: getstatic Perryc.c : I
    //   798: iflt -> 812
    //   801: ldc2_w -1463073033
    //   804: l2i
    //   805: ldc_w -966877757
    //   808: ixor
    //   809: goto -> 820
    //   812: ldc2_w 926220400
    //   815: l2i
    //   816: ldc_w 1354658987
    //   819: ixor
    //   820: ldc2_w -1243386885
    //   823: l2i
    //   824: ldc_w -2080270848
    //   827: ixor
    //   828: ixor
    //   829: lookupswitch default -> 20414, 1449756960 -> 856, 1601644239 -> 812
    //   856: aload_0
    //   857: getstatic Perryc.1 : I
    //   860: ifeq -> 874
    //   863: ldc2_w 597929689
    //   866: l2i
    //   867: ldc_w -1687991272
    //   870: ixor
    //   871: goto -> 882
    //   874: ldc2_w 401275789
    //   877: l2i
    //   878: ldc_w 86249113
    //   881: ixor
    //   882: ldc2_w -1587137110
    //   885: l2i
    //   886: ldc_w 279674650
    //   889: ixor
    //   890: ixor
    //   891: lookupswitch default -> 20410, -1560035420 -> 916, 151890033 -> 874
    //   916: aload_0
    //   917: new bigname/zprestige/webhack/features/setting/Setting
    //   920: dup
    //   921: ldc_w '෎㌆ඔ㶣륅๟灏蹭'
    //   924: getstatic Perryc.1 : I
    //   927: ifeq -> 941
    //   930: ldc2_w 1372883737
    //   933: l2i
    //   934: ldc_w -730769238
    //   937: ixor
    //   938: goto -> 949
    //   941: ldc2_w -1799589855
    //   944: l2i
    //   945: ldc_w -1233397009
    //   948: ixor
    //   949: ldc2_w 858992200
    //   952: l2i
    //   953: ldc_w 913140151
    //   956: ixor
    //   957: ixor
    //   958: lookupswitch default -> 20358, -2130996148 -> 941, 664399153 -> 984
    //   984: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   987: ldc2_w 1419560285
    //   990: l2i
    //   991: ldc_w 1419560285
    //   994: ixor
    //   995: getstatic Perryc.c : I
    //   998: iflt -> 1012
    //   1001: ldc2_w -1874956693
    //   1004: l2i
    //   1005: ldc_w 463866070
    //   1008: ixor
    //   1009: goto -> 1020
    //   1012: ldc2_w -841965997
    //   1015: l2i
    //   1016: ldc_w 460549671
    //   1019: ixor
    //   1020: ldc2_w 1325086680
    //   1023: l2i
    //   1024: ldc_w 578162540
    //   1027: ixor
    //   1028: ixor
    //   1029: lookupswitch default -> 1056, -1818660465 -> 1012, -418030071 -> 20790
    //   1056: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1059: getstatic Perryc.0 : I
    //   1062: ifle -> 1076
    //   1065: ldc2_w -1587923699
    //   1068: l2i
    //   1069: ldc_w -1128494373
    //   1072: ixor
    //   1073: goto -> 1084
    //   1076: ldc2_w -256388020
    //   1079: l2i
    //   1080: ldc_w 1030762929
    //   1083: ixor
    //   1084: ldc2_w -1673800771
    //   1087: l2i
    //   1088: ldc_w 90473131
    //   1091: ixor
    //   1092: ixor
    //   1093: lookupswitch default -> 20856, -2068189504 -> 1076, 1419293931 -> 1120
    //   1120: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1123: getstatic Perryc.c : I
    //   1126: iflt -> 1140
    //   1129: ldc2_w -239193919
    //   1132: l2i
    //   1133: ldc_w 1039226177
    //   1136: ixor
    //   1137: goto -> 1148
    //   1140: ldc2_w 1474380679
    //   1143: l2i
    //   1144: ldc_w -2062801259
    //   1147: ixor
    //   1148: ldc2_w 175757336
    //   1151: l2i
    //   1152: ldc_w 1383053197
    //   1155: ixor
    //   1156: ixor
    //   1157: lookupswitch default -> 1184, -1806104043 -> 20828, 2033243125 -> 1140
    //   1184: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1187: getstatic Perryc.c : I
    //   1190: iflt -> 1204
    //   1193: ldc2_w -1164304729
    //   1196: l2i
    //   1197: ldc_w 1664188119
    //   1200: ixor
    //   1201: goto -> 1212
    //   1204: ldc2_w 619826206
    //   1207: l2i
    //   1208: ldc_w 668652986
    //   1211: ixor
    //   1212: ldc2_w -1067293451
    //   1215: l2i
    //   1216: ldc_w -1305019874
    //   1219: ixor
    //   1220: ixor
    //   1221: lookupswitch default -> 1248, -1409286501 -> 20560, 639497567 -> 1204
    //   1248: putfield customFont : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1251: getstatic Perryc.0 : I
    //   1254: ifle -> 1268
    //   1257: ldc2_w -506222880
    //   1260: l2i
    //   1261: ldc_w 914489670
    //   1264: ixor
    //   1265: goto -> 1276
    //   1268: ldc2_w 448452742
    //   1271: l2i
    //   1272: ldc_w -1336441290
    //   1275: ixor
    //   1276: ldc2_w 29041295
    //   1279: l2i
    //   1280: ldc_w 86083603
    //   1283: ixor
    //   1284: ixor
    //   1285: lookupswitch default -> 1312, -741667526 -> 20442, 65623377 -> 1268
    //   1312: aload_0
    //   1313: getstatic Perryc.1 : I
    //   1316: ifeq -> 1330
    //   1319: ldc2_w 83519616
    //   1322: l2i
    //   1323: ldc_w -1338758727
    //   1326: ixor
    //   1327: goto -> 1338
    //   1330: ldc2_w 1150925283
    //   1333: l2i
    //   1334: ldc_w 1682714869
    //   1337: ixor
    //   1338: ldc2_w 1694254311
    //   1341: l2i
    //   1342: ldc_w -750693816
    //   1345: ixor
    //   1346: ixor
    //   1347: lookupswitch default -> 1372, -1386719952 -> 1330, 57890710 -> 20364
    //   1372: aload_0
    //   1373: new bigname/zprestige/webhack/features/setting/Setting
    //   1376: dup
    //   1377: ldc_w 'ෝ㌁ං㶱륃'
    //   1380: getstatic Perryc.0 : I
    //   1383: ifle -> 1397
    //   1386: ldc2_w -1340942623
    //   1389: l2i
    //   1390: ldc_w 445900969
    //   1393: ixor
    //   1394: goto -> 1405
    //   1397: ldc2_w -23197884
    //   1400: l2i
    //   1401: ldc_w 685265381
    //   1404: ixor
    //   1405: ldc2_w -1104242269
    //   1408: l2i
    //   1409: ldc_w -1847727003
    //   1412: ixor
    //   1413: ixor
    //   1414: lookupswitch default -> 1440, -2056107122 -> 20354, -1706936105 -> 1397
    //   1440: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1443: ldc_w '='
    //   1446: getstatic Perryc.1 : I
    //   1449: ifeq -> 1463
    //   1452: ldc2_w -1137431479
    //   1455: l2i
    //   1456: ldc_w -1723683370
    //   1459: ixor
    //   1460: goto -> 1471
    //   1463: ldc2_w 2069164842
    //   1466: l2i
    //   1467: ldc_w -82274405
    //   1470: ixor
    //   1471: ldc2_w -839970291
    //   1474: l2i
    //   1475: ldc_w 83541467
    //   1478: ixor
    //   1479: ixor
    //   1480: lookupswitch default -> 20710, -329044407 -> 1463, 1230621543 -> 1508
    //   1508: aload_0
    //   1509: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   1514: getstatic Perryc.1 : I
    //   1517: ifeq -> 1531
    //   1520: ldc2_w 823262991
    //   1523: l2i
    //   1524: ldc_w -242628241
    //   1527: ixor
    //   1528: goto -> 1539
    //   1531: ldc2_w -1167488056
    //   1534: l2i
    //   1535: ldc_w -234269358
    //   1538: ixor
    //   1539: ldc2_w -8102879
    //   1542: l2i
    //   1543: ldc_w -1679516413
    //   1546: ixor
    //   1547: ixor
    //   1548: lookupswitch default -> 1576, -1527187646 -> 20674, 1225835150 -> 1531
    //   1576: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   1579: getstatic Perryc.c : I
    //   1582: iflt -> 1596
    //   1585: ldc2_w 651523204
    //   1588: l2i
    //   1589: ldc_w -1495202208
    //   1592: ixor
    //   1593: goto -> 1604
    //   1596: ldc2_w 1209102284
    //   1599: l2i
    //   1600: ldc_w 1578084266
    //   1603: ixor
    //   1604: ldc2_w 1003846799
    //   1607: l2i
    //   1608: ldc_w 887515118
    //   1611: ixor
    //   1612: ixor
    //   1613: lookupswitch default -> 20690, -1895339643 -> 1596, 422433543 -> 1640
    //   1640: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1643: getstatic Perryc.1 : I
    //   1646: ifeq -> 1660
    //   1649: ldc2_w 633910853
    //   1652: l2i
    //   1653: ldc_w 2062035104
    //   1656: ixor
    //   1657: goto -> 1668
    //   1660: ldc2_w 632672902
    //   1663: l2i
    //   1664: ldc_w 761752656
    //   1667: ixor
    //   1668: ldc2_w 1193567579
    //   1671: l2i
    //   1672: ldc_w -1167606206
    //   1675: ixor
    //   1676: ixor
    //   1677: lookupswitch default -> 20334, -1570552324 -> 1660, -175020593 -> 1704
    //   1704: putfield prefix : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1707: getstatic Perryc.1 : I
    //   1710: ifeq -> 1724
    //   1713: ldc2_w 470942821
    //   1716: l2i
    //   1717: ldc_w -132833566
    //   1720: ixor
    //   1721: goto -> 1732
    //   1724: ldc2_w 1457673846
    //   1727: l2i
    //   1728: ldc_w 2121434783
    //   1731: ixor
    //   1732: ldc2_w -1387155562
    //   1735: l2i
    //   1736: ldc_w -1338237143
    //   1739: ixor
    //   1740: ixor
    //   1741: lookupswitch default -> 20490, -110450120 -> 1724, 905797718 -> 1768
    //   1768: aload_0
    //   1769: getstatic Perryc.0 : I
    //   1772: ifle -> 1786
    //   1775: ldc2_w -1978287743
    //   1778: l2i
    //   1779: ldc_w 1767222031
    //   1782: ixor
    //   1783: goto -> 1794
    //   1786: ldc2_w 1420624240
    //   1789: l2i
    //   1790: ldc_w -1968886756
    //   1793: ixor
    //   1794: ldc2_w 1394410750
    //   1797: l2i
    //   1798: ldc_w -459269995
    //   1801: ixor
    //   1802: ixor
    //   1803: lookupswitch default -> 1828, 71007089 -> 1786, 1425870565 -> 20576
    //   1828: aload_0
    //   1829: new bigname/zprestige/webhack/features/setting/Setting
    //   1832: dup
    //   1833: ldc_w 'ෟ㌖ඃ'
    //   1836: getstatic Perryc.0 : I
    //   1839: ifle -> 1853
    //   1842: ldc2_w -1462366144
    //   1845: l2i
    //   1846: ldc_w -1040139072
    //   1849: ixor
    //   1850: goto -> 1861
    //   1853: ldc2_w -19208191
    //   1856: l2i
    //   1857: ldc_w -1333606636
    //   1860: ixor
    //   1861: ldc2_w -858571430
    //   1864: l2i
    //   1865: ldc_w -1543589641
    //   1868: ixor
    //   1869: ixor
    //   1870: lookupswitch default -> 20378, 100344109 -> 1853, 561357496 -> 1896
    //   1896: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1899: ldc2_w 760352026
    //   1902: l2i
    //   1903: ldc_w 760352026
    //   1906: ixor
    //   1907: getstatic Perryc.1 : I
    //   1910: ifeq -> 1924
    //   1913: ldc2_w 452933214
    //   1916: l2i
    //   1917: ldc_w 1964291045
    //   1920: ixor
    //   1921: goto -> 1932
    //   1924: ldc2_w 396859040
    //   1927: l2i
    //   1928: ldc_w 1990488842
    //   1931: ixor
    //   1932: ldc2_w -1157086002
    //   1935: l2i
    //   1936: ldc_w 617505921
    //   1939: ixor
    //   1940: ixor
    //   1941: lookupswitch default -> 20772, -265443852 -> 1924, -20593179 -> 1968
    //   1968: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1971: ldc2_w 2009027568
    //   1974: l2i
    //   1975: ldc_w 2009027568
    //   1978: ixor
    //   1979: getstatic Perryc.0 : I
    //   1982: ifle -> 1996
    //   1985: ldc2_w 955928256
    //   1988: l2i
    //   1989: ldc_w -823460389
    //   1992: ixor
    //   1993: goto -> 2004
    //   1996: ldc2_w -2078264579
    //   1999: l2i
    //   2000: ldc_w -2137592399
    //   2003: ixor
    //   2004: ldc2_w 325682548
    //   2007: l2i
    //   2008: ldc_w 1384246652
    //   2011: ixor
    //   2012: ixor
    //   2013: lookupswitch default -> 20342, -1208427757 -> 1996, 1163835204 -> 2040
    //   2040: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2043: ldc2_w -1449245482
    //   2046: l2i
    //   2047: ldc_w -1449245655
    //   2050: ixor
    //   2051: getstatic Perryc.1 : I
    //   2054: ifeq -> 2068
    //   2057: ldc2_w 157405839
    //   2060: l2i
    //   2061: ldc_w -696215340
    //   2064: ixor
    //   2065: goto -> 2076
    //   2068: ldc2_w -603184558
    //   2071: l2i
    //   2072: ldc_w 1705780200
    //   2075: ixor
    //   2076: ldc2_w -1235754814
    //   2079: l2i
    //   2080: ldc_w -2052784320
    //   2083: ixor
    //   2084: ixor
    //   2085: lookupswitch default -> 20572, -1974264264 -> 2112, -334342695 -> 2068
    //   2112: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2115: getstatic Perryc.0 : I
    //   2118: ifle -> 2132
    //   2121: ldc2_w 407335902
    //   2124: l2i
    //   2125: ldc_w -2146259601
    //   2128: ixor
    //   2129: goto -> 2140
    //   2132: ldc2_w 1403184741
    //   2135: l2i
    //   2136: ldc_w 1766670376
    //   2139: ixor
    //   2140: ldc2_w 1211710220
    //   2143: l2i
    //   2144: ldc_w -1793304936
    //   2147: ixor
    //   2148: ixor
    //   2149: lookupswitch default -> 20382, -406139943 -> 2176, 1165013797 -> 2132
    //   2176: aload_0
    //   2177: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   2182: getstatic Perryc.0 : I
    //   2185: ifle -> 2199
    //   2188: ldc2_w -796588883
    //   2191: l2i
    //   2192: ldc_w 2011678400
    //   2195: ixor
    //   2196: goto -> 2207
    //   2199: ldc2_w -1368860627
    //   2202: l2i
    //   2203: ldc_w -1737934792
    //   2206: ixor
    //   2207: ldc2_w 1121319130
    //   2210: l2i
    //   2211: ldc_w -45631373
    //   2214: ixor
    //   2215: ixor
    //   2216: lookupswitch default -> 2244, -41524627 -> 2199, 418415300 -> 20658
    //   2244: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   2247: getstatic Perryc.0 : I
    //   2250: ifle -> 2264
    //   2253: ldc2_w 1547162033
    //   2256: l2i
    //   2257: ldc_w -1738944816
    //   2260: ixor
    //   2261: goto -> 2272
    //   2264: ldc2_w 1347000427
    //   2267: l2i
    //   2268: ldc_w -2010816742
    //   2271: ixor
    //   2272: ldc2_w 1638519570
    //   2275: l2i
    //   2276: ldc_w -257122609
    //   2279: ixor
    //   2280: ixor
    //   2281: lookupswitch default -> 20720, 1231653548 -> 2308, 1433096892 -> 2264
    //   2308: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2311: getstatic Perryc.0 : I
    //   2314: ifle -> 2328
    //   2317: ldc2_w 752349833
    //   2320: l2i
    //   2321: ldc_w 626995306
    //   2324: ixor
    //   2325: goto -> 2336
    //   2328: ldc2_w -537516148
    //   2331: l2i
    //   2332: ldc_w -453930610
    //   2335: ixor
    //   2336: ldc2_w 1350819767
    //   2339: l2i
    //   2340: ldc_w -1113420995
    //   2343: ixor
    //   2344: ixor
    //   2345: lookupswitch default -> 2372, -458647959 -> 20712, -92264930 -> 2328
    //   2372: putfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2375: getstatic Perryc.c : I
    //   2378: iflt -> 2392
    //   2381: ldc2_w -191433344
    //   2384: l2i
    //   2385: ldc_w -965020239
    //   2388: ixor
    //   2389: goto -> 2400
    //   2392: ldc2_w -839379020
    //   2395: l2i
    //   2396: ldc_w -36172429
    //   2399: ixor
    //   2400: ldc2_w 438439975
    //   2403: l2i
    //   2404: ldc_w -1721666049
    //   2407: ixor
    //   2408: ixor
    //   2409: lookupswitch default -> 2436, -1863155232 -> 2392, -1313905175 -> 20320
    //   2436: aload_0
    //   2437: getstatic Perryc.0 : I
    //   2440: ifle -> 2454
    //   2443: ldc2_w -501201813
    //   2446: l2i
    //   2447: ldc_w 1959771932
    //   2450: ixor
    //   2451: goto -> 2462
    //   2454: ldc2_w 1105498918
    //   2457: l2i
    //   2458: ldc_w -1755052279
    //   2461: ixor
    //   2462: ldc2_w -1640060296
    //   2465: l2i
    //   2466: ldc_w 482931605
    //   2469: ixor
    //   2470: ixor
    //   2471: lookupswitch default -> 20370, 337224346 -> 2454, 1417072066 -> 2496
    //   2496: aload_0
    //   2497: new bigname/zprestige/webhack/features/setting/Setting
    //   2500: dup
    //   2501: ldc_w '්㌁ං㶲륄'
    //   2504: getstatic Perryc.c : I
    //   2507: iflt -> 2521
    //   2510: ldc2_w 438512391
    //   2513: l2i
    //   2514: ldc_w -107447470
    //   2517: ixor
    //   2518: goto -> 2529
    //   2521: ldc2_w 78056366
    //   2524: l2i
    //   2525: ldc_w 863342531
    //   2528: ixor
    //   2529: ldc2_w 1170969951
    //   2532: l2i
    //   2533: ldc_w 655289361
    //   2536: ixor
    //   2537: ixor
    //   2538: lookupswitch default -> 2564, -2122438373 -> 20350, -604466454 -> 2521
    //   2564: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2567: ldc2_w -1476661899
    //   2570: l2i
    //   2571: ldc_w -1476661899
    //   2574: ixor
    //   2575: getstatic Perryc.0 : I
    //   2578: ifle -> 2592
    //   2581: ldc2_w -66345971
    //   2584: l2i
    //   2585: ldc_w 1331136104
    //   2588: ixor
    //   2589: goto -> 2600
    //   2592: ldc2_w 1601649695
    //   2595: l2i
    //   2596: ldc_w -2043325331
    //   2599: ixor
    //   2600: ldc2_w 2132697398
    //   2603: l2i
    //   2604: ldc_w 966547114
    //   2607: ixor
    //   2608: ixor
    //   2609: lookupswitch default -> 2636, -169994759 -> 20430, -153752063 -> 2592
    //   2636: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2639: ldc2_w -971666499
    //   2642: l2i
    //   2643: ldc_w -971666499
    //   2646: ixor
    //   2647: getstatic Perryc.c : I
    //   2650: iflt -> 2664
    //   2653: ldc2_w 1397317238
    //   2656: l2i
    //   2657: ldc_w 883315202
    //   2660: ixor
    //   2661: goto -> 2672
    //   2664: ldc2_w -1753371285
    //   2667: l2i
    //   2668: ldc_w 213267507
    //   2671: ixor
    //   2672: ldc2_w -483776172
    //   2675: l2i
    //   2676: ldc_w -386437915
    //   2679: ixor
    //   2680: ixor
    //   2681: lookupswitch default -> 2708, 480090209 -> 2664, 1815235013 -> 20688
    //   2708: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2711: ldc2_w 224295493
    //   2714: l2i
    //   2715: ldc_w 224295610
    //   2718: ixor
    //   2719: getstatic Perryc.c : I
    //   2722: iflt -> 2736
    //   2725: ldc2_w 738459156
    //   2728: l2i
    //   2729: ldc_w 1803451054
    //   2732: ixor
    //   2733: goto -> 2744
    //   2736: ldc2_w -931396274
    //   2739: l2i
    //   2740: ldc_w -605940765
    //   2743: ixor
    //   2744: ldc2_w 945176003
    //   2747: l2i
    //   2748: ldc_w -137040029
    //   2751: ixor
    //   2752: ixor
    //   2753: lookupswitch default -> 20484, -1996532198 -> 2736, -602094579 -> 2780
    //   2780: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2783: getstatic Perryc.c : I
    //   2786: iflt -> 2800
    //   2789: ldc2_w -1553702312
    //   2792: l2i
    //   2793: ldc_w -1211670937
    //   2796: ixor
    //   2797: goto -> 2808
    //   2800: ldc2_w 873178032
    //   2803: l2i
    //   2804: ldc_w 759456984
    //   2807: ixor
    //   2808: ldc2_w -1415887938
    //   2811: l2i
    //   2812: ldc_w -128478623
    //   2815: ixor
    //   2816: ixor
    //   2817: lookupswitch default -> 20450, 1198517728 -> 2800, 1250105015 -> 2844
    //   2844: aload_0
    //   2845: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   2850: getstatic Perryc.c : I
    //   2853: iflt -> 2867
    //   2856: ldc2_w -465459615
    //   2859: l2i
    //   2860: ldc_w 1661577198
    //   2863: ixor
    //   2864: goto -> 2875
    //   2867: ldc2_w -1595522646
    //   2870: l2i
    //   2871: ldc_w 2142850172
    //   2874: ixor
    //   2875: ldc2_w 1481521393
    //   2878: l2i
    //   2879: ldc_w -557411413
    //   2882: ixor
    //   2883: ixor
    //   2884: lookupswitch default -> 20394, 29403861 -> 2867, 1507305100 -> 2912
    //   2912: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   2915: getstatic Perryc.0 : I
    //   2918: ifle -> 2932
    //   2921: ldc2_w 22748288
    //   2924: l2i
    //   2925: ldc_w -875093383
    //   2928: ixor
    //   2929: goto -> 2940
    //   2932: ldc2_w 1717521393
    //   2935: l2i
    //   2936: ldc_w 1282231301
    //   2939: ixor
    //   2940: ldc2_w -1307135581
    //   2943: l2i
    //   2944: ldc_w 266575714
    //   2947: ixor
    //   2948: ixor
    //   2949: lookupswitch default -> 20470, -1748555467 -> 2976, 2004422712 -> 2932
    //   2976: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2979: getstatic Perryc.0 : I
    //   2982: ifle -> 2996
    //   2985: ldc2_w -166418570
    //   2988: l2i
    //   2989: ldc_w 1848182055
    //   2992: ixor
    //   2993: goto -> 3004
    //   2996: ldc2_w 586421605
    //   2999: l2i
    //   3000: ldc_w 1834208494
    //   3003: ixor
    //   3004: ldc2_w 921736775
    //   3007: l2i
    //   3008: ldc_w 1233188687
    //   3011: ixor
    //   3012: ixor
    //   3013: lookupswitch default -> 20818, -414334119 -> 2996, 819443843 -> 3040
    //   3040: putfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3043: getstatic Perryc.c : I
    //   3046: iflt -> 3060
    //   3049: ldc2_w 381679286
    //   3052: l2i
    //   3053: ldc_w 1708161822
    //   3056: ixor
    //   3057: goto -> 3068
    //   3060: ldc2_w -867593156
    //   3063: l2i
    //   3064: ldc_w -2009735007
    //   3067: ixor
    //   3068: ldc2_w -402485493
    //   3071: l2i
    //   3072: ldc_w -1731158516
    //   3075: ixor
    //   3076: ixor
    //   3077: lookupswitch default -> 20702, 62758063 -> 3060, 883844506 -> 3104
    //   3104: aload_0
    //   3105: getstatic Perryc.0 : I
    //   3108: ifle -> 3122
    //   3111: ldc2_w -1664659013
    //   3114: l2i
    //   3115: ldc_w -847817611
    //   3118: ixor
    //   3119: goto -> 3130
    //   3122: ldc2_w -964885909
    //   3125: l2i
    //   3126: ldc_w -1509855281
    //   3129: ixor
    //   3130: ldc2_w 889936277
    //   3133: l2i
    //   3134: ldc_w -971044688
    //   3137: ixor
    //   3138: ixor
    //   3139: lookupswitch default -> 20412, -1821885311 -> 3164, -1566288661 -> 3122
    //   3164: aload_0
    //   3165: new bigname/zprestige/webhack/features/setting/Setting
    //   3168: dup
    //   3169: ldc_w 'ා㌟ඒ㶲'
    //   3172: getstatic Perryc.c : I
    //   3175: iflt -> 3189
    //   3178: ldc2_w -1990452147
    //   3181: l2i
    //   3182: ldc_w 751156310
    //   3185: ixor
    //   3186: goto -> 3197
    //   3189: ldc2_w 2032754397
    //   3192: l2i
    //   3193: ldc_w 755535663
    //   3196: ixor
    //   3197: ldc2_w -1054536793
    //   3200: l2i
    //   3201: ldc_w 936950079
    //   3204: ixor
    //   3205: ixor
    //   3206: lookupswitch default -> 3232, -811668600 -> 3189, 1399067267 -> 20456
    //   3232: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3235: ldc2_w 1853868546
    //   3238: l2i
    //   3239: ldc_w 1853868797
    //   3242: ixor
    //   3243: getstatic Perryc.1 : I
    //   3246: ifeq -> 3260
    //   3249: ldc2_w -944631670
    //   3252: l2i
    //   3253: ldc_w -1530988017
    //   3256: ixor
    //   3257: goto -> 3268
    //   3260: ldc2_w -455301318
    //   3263: l2i
    //   3264: ldc_w 48283015
    //   3267: ixor
    //   3268: ldc2_w 1514061633
    //   3271: l2i
    //   3272: ldc_w 113977210
    //   3275: ixor
    //   3276: ixor
    //   3277: lookupswitch default -> 20396, -1161198970 -> 3304, 1073312446 -> 3260
    //   3304: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3307: ldc2_w 528931229
    //   3310: l2i
    //   3311: ldc_w 528931229
    //   3314: ixor
    //   3315: getstatic Perryc.0 : I
    //   3318: ifle -> 3332
    //   3321: ldc2_w 299883886
    //   3324: l2i
    //   3325: ldc_w 1671688763
    //   3328: ixor
    //   3329: goto -> 3340
    //   3332: ldc2_w 1968235270
    //   3335: l2i
    //   3336: ldc_w 1504116897
    //   3339: ixor
    //   3340: ldc2_w -1702959147
    //   3343: l2i
    //   3344: ldc_w -1036242422
    //   3347: ixor
    //   3348: ixor
    //   3349: lookupswitch default -> 3376, -115025482 -> 3332, 708770442 -> 20534
    //   3376: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3379: ldc2_w 1952321540
    //   3382: l2i
    //   3383: ldc_w 1952321787
    //   3386: ixor
    //   3387: getstatic Perryc.1 : I
    //   3390: ifeq -> 3404
    //   3393: ldc2_w 87137014
    //   3396: l2i
    //   3397: ldc_w -1592324322
    //   3400: ixor
    //   3401: goto -> 3412
    //   3404: ldc2_w -1011788133
    //   3407: l2i
    //   3408: ldc_w 1650138736
    //   3411: ixor
    //   3412: ldc2_w -1935666330
    //   3415: l2i
    //   3416: ldc_w 475903944
    //   3419: ixor
    //   3420: ixor
    //   3421: lookupswitch default -> 20300, 823651397 -> 3448, 886780230 -> 3404
    //   3448: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3451: getstatic Perryc.1 : I
    //   3454: ifeq -> 3468
    //   3457: ldc2_w 930261890
    //   3460: l2i
    //   3461: ldc_w -732394877
    //   3464: ixor
    //   3465: goto -> 3476
    //   3468: ldc2_w 1277869625
    //   3471: l2i
    //   3472: ldc_w 1467338928
    //   3475: ixor
    //   3476: ldc2_w 735195013
    //   3479: l2i
    //   3480: ldc_w -902759001
    //   3483: ixor
    //   3484: ixor
    //   3485: lookupswitch default -> 3512, -1688834587 -> 3468, 46723875 -> 20326
    //   3512: aload_0
    //   3513: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   3518: getstatic Perryc.1 : I
    //   3521: ifeq -> 3535
    //   3524: ldc2_w -1202041573
    //   3527: l2i
    //   3528: ldc_w 1236821325
    //   3531: ixor
    //   3532: goto -> 3543
    //   3535: ldc2_w 2075693616
    //   3538: l2i
    //   3539: ldc_w -1841910414
    //   3542: ixor
    //   3543: ldc2_w 666853703
    //   3546: l2i
    //   3547: ldc_w -969830300
    //   3550: ixor
    //   3551: ixor
    //   3552: lookupswitch default -> 3580, -354638278 -> 3535, 275569013 -> 20280
    //   3580: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   3583: getstatic Perryc.0 : I
    //   3586: ifle -> 3600
    //   3589: ldc2_w 277099118
    //   3592: l2i
    //   3593: ldc_w 1606506002
    //   3596: ixor
    //   3597: goto -> 3608
    //   3600: ldc2_w -1655618384
    //   3603: l2i
    //   3604: ldc_w -1704480330
    //   3607: ixor
    //   3608: ldc2_w -283278755
    //   3611: l2i
    //   3612: ldc_w 574447642
    //   3615: ixor
    //   3616: ixor
    //   3617: lookupswitch default -> 3644, -2107275717 -> 20812, -1433037987 -> 3600
    //   3644: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3647: getstatic Perryc.1 : I
    //   3650: ifeq -> 3664
    //   3653: ldc2_w 735196706
    //   3656: l2i
    //   3657: ldc_w 1845229343
    //   3660: ixor
    //   3661: goto -> 3672
    //   3664: ldc2_w 373528505
    //   3667: l2i
    //   3668: ldc_w -49843684
    //   3671: ixor
    //   3672: ldc2_w -151751879
    //   3675: l2i
    //   3676: ldc_w -360660630
    //   3679: ixor
    //   3680: ixor
    //   3681: lookupswitch default -> 3708, -1936710061 -> 3664, 1516073838 -> 20400
    //   3708: putfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3711: getstatic Perryc.0 : I
    //   3714: ifle -> 3728
    //   3717: ldc2_w -216138675
    //   3720: l2i
    //   3721: ldc_w -1615946631
    //   3724: ixor
    //   3725: goto -> 3736
    //   3728: ldc2_w -1953378700
    //   3731: l2i
    //   3732: ldc_w -1109875006
    //   3735: ixor
    //   3736: ldc2_w 1363860278
    //   3739: l2i
    //   3740: ldc_w -339971173
    //   3743: ixor
    //   3744: ixor
    //   3745: lookupswitch default -> 20436, -1933590501 -> 3772, -700069735 -> 3728
    //   3772: aload_0
    //   3773: getstatic Perryc.c : I
    //   3776: iflt -> 3790
    //   3779: ldc2_w -1354169492
    //   3782: l2i
    //   3783: ldc_w 52927915
    //   3786: ixor
    //   3787: goto -> 3798
    //   3790: ldc2_w 141128759
    //   3793: l2i
    //   3794: ldc_w -2042076714
    //   3797: ixor
    //   3798: ldc2_w -1123951259
    //   3801: l2i
    //   3802: ldc_w -1854996586
    //   3805: ixor
    //   3806: ixor
    //   3807: lookupswitch default -> 20814, -2147369932 -> 3790, -1571932398 -> 3832
    //   3832: aload_0
    //   3833: new bigname/zprestige/webhack/features/setting/Setting
    //   3836: dup
    //   3837: ldc_w '෌㌟඗㶿륋'
    //   3840: getstatic Perryc.0 : I
    //   3843: ifle -> 3857
    //   3846: ldc2_w 464212186
    //   3849: l2i
    //   3850: ldc_w -110190165
    //   3853: ixor
    //   3854: goto -> 3865
    //   3857: ldc2_w 200588921
    //   3860: l2i
    //   3861: ldc_w 294069480
    //   3864: ixor
    //   3865: ldc2_w 968762193
    //   3868: l2i
    //   3869: ldc_w -1593826389
    //   3872: ixor
    //   3873: ixor
    //   3874: lookupswitch default -> 3900, 261621635 -> 3857, 2054943115 -> 20628
    //   3900: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3903: ldc2_w -246309953
    //   3906: l2i
    //   3907: ldc_w -246310133
    //   3910: ixor
    //   3911: getstatic Perryc.c : I
    //   3914: iflt -> 3928
    //   3917: ldc2_w 1472552628
    //   3920: l2i
    //   3921: ldc_w -1546936860
    //   3924: ixor
    //   3925: goto -> 3936
    //   3928: ldc2_w 1553888091
    //   3931: l2i
    //   3932: ldc_w 1899935186
    //   3935: ixor
    //   3936: ldc2_w 867690446
    //   3939: l2i
    //   3940: ldc_w -682705806
    //   3943: ixor
    //   3944: ixor
    //   3945: lookupswitch default -> 3972, -44133718 -> 3928, 284661996 -> 20646
    //   3972: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3975: ldc2_w -121470416
    //   3978: l2i
    //   3979: ldc_w -121470416
    //   3982: ixor
    //   3983: getstatic Perryc.0 : I
    //   3986: ifle -> 4000
    //   3989: ldc2_w 1019499467
    //   3992: l2i
    //   3993: ldc_w 93284582
    //   3996: ixor
    //   3997: goto -> 4008
    //   4000: ldc2_w -820487238
    //   4003: l2i
    //   4004: ldc_w -1211852601
    //   4007: ixor
    //   4008: ldc2_w -1995243180
    //   4011: l2i
    //   4012: ldc_w 2094629502
    //   4015: ixor
    //   4016: ixor
    //   4017: lookupswitch default -> 4044, -927308121 -> 4000, -863913977 -> 20282
    //   4044: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4047: ldc2_w 362176075
    //   4050: l2i
    //   4051: ldc_w 362176180
    //   4054: ixor
    //   4055: getstatic Perryc.c : I
    //   4058: iflt -> 4072
    //   4061: ldc2_w 1018307174
    //   4064: l2i
    //   4065: ldc_w 270421938
    //   4068: ixor
    //   4069: goto -> 4080
    //   4072: ldc2_w -1698032683
    //   4075: l2i
    //   4076: ldc_w 848454418
    //   4079: ixor
    //   4080: ldc2_w 43833223
    //   4083: l2i
    //   4084: ldc_w 415023416
    //   4087: ixor
    //   4088: ixor
    //   4089: lookupswitch default -> 4116, -1244776101 -> 4072, 915176299 -> 20568
    //   4116: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4119: getstatic Perryc.0 : I
    //   4122: ifle -> 4136
    //   4125: ldc2_w -1906362741
    //   4128: l2i
    //   4129: ldc_w -1565554742
    //   4132: ixor
    //   4133: goto -> 4144
    //   4136: ldc2_w -236962991
    //   4139: l2i
    //   4140: ldc_w -1351841198
    //   4143: ixor
    //   4144: ldc2_w -938714685
    //   4147: l2i
    //   4148: ldc_w 2055078527
    //   4151: ixor
    //   4152: ixor
    //   4153: lookupswitch default -> 4180, -1635587331 -> 20506, -464839862 -> 4136
    //   4180: aload_0
    //   4181: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   4186: getstatic Perryc.c : I
    //   4189: iflt -> 4203
    //   4192: ldc2_w -880302537
    //   4195: l2i
    //   4196: ldc_w -983477762
    //   4199: ixor
    //   4200: goto -> 4211
    //   4203: ldc2_w 431193345
    //   4206: l2i
    //   4207: ldc_w 117914088
    //   4210: ixor
    //   4211: ldc2_w 466453194
    //   4214: l2i
    //   4215: ldc_w 416625445
    //   4218: ixor
    //   4219: ixor
    //   4220: lookupswitch default -> 20630, 234767910 -> 4203, 497874182 -> 4248
    //   4248: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   4251: getstatic Perryc.0 : I
    //   4254: ifle -> 4268
    //   4257: ldc2_w -689180970
    //   4260: l2i
    //   4261: ldc_w -249172648
    //   4264: ixor
    //   4265: goto -> 4276
    //   4268: ldc2_w 1286234131
    //   4271: l2i
    //   4272: ldc_w 555073350
    //   4275: ixor
    //   4276: ldc2_w 134649223
    //   4279: l2i
    //   4280: ldc_w 1620545365
    //   4283: ixor
    //   4284: ixor
    //   4285: lookupswitch default -> 20262, 86951303 -> 4312, 1331632476 -> 4268
    //   4312: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4315: getstatic Perryc.0 : I
    //   4318: ifle -> 4332
    //   4321: ldc2_w 1772119621
    //   4324: l2i
    //   4325: ldc_w 1299226173
    //   4328: ixor
    //   4329: goto -> 4340
    //   4332: ldc2_w 1217059182
    //   4335: l2i
    //   4336: ldc_w 793596428
    //   4339: ixor
    //   4340: ldc2_w -471076019
    //   4343: l2i
    //   4344: ldc_w -1369590524
    //   4347: ixor
    //   4348: ixor
    //   4349: lookupswitch default -> 4376, -1847448809 -> 4332, 1768341041 -> 20314
    //   4376: putfield hoverAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4379: getstatic Perryc.1 : I
    //   4382: ifeq -> 4396
    //   4385: ldc2_w 2126539940
    //   4388: l2i
    //   4389: ldc_w 2099538133
    //   4392: ixor
    //   4393: goto -> 4404
    //   4396: ldc2_w -798864522
    //   4399: l2i
    //   4400: ldc_w 848693660
    //   4403: ixor
    //   4404: ldc2_w -1823188214
    //   4407: l2i
    //   4408: ldc_w 1420019218
    //   4411: ixor
    //   4412: ixor
    //   4413: lookupswitch default -> 20700, -1005348503 -> 4396, 621010930 -> 4440
    //   4440: aload_0
    //   4441: getstatic Perryc.0 : I
    //   4444: ifle -> 4458
    //   4447: ldc2_w 51995866
    //   4450: l2i
    //   4451: ldc_w 573722673
    //   4454: ixor
    //   4455: goto -> 4466
    //   4458: ldc2_w -35425154
    //   4461: l2i
    //   4462: ldc_w 569162036
    //   4465: ixor
    //   4466: ldc2_w -1220747097
    //   4469: l2i
    //   4470: ldc_w 600594828
    //   4473: ixor
    //   4474: ixor
    //   4475: lookupswitch default -> 4500, -1243902528 -> 20566, 703365215 -> 4458
    //   4500: aload_0
    //   4501: new bigname/zprestige/webhack/features/setting/Setting
    //   4504: dup
    //   4505: ldc_w '෌㌟඗㶿륋๛灏蹻'
    //   4508: getstatic Perryc.c : I
    //   4511: iflt -> 4525
    //   4514: ldc2_w 940752320
    //   4517: l2i
    //   4518: ldc_w -428085408
    //   4521: ixor
    //   4522: goto -> 4533
    //   4525: ldc2_w 2045818918
    //   4528: l2i
    //   4529: ldc_w 753611555
    //   4532: ixor
    //   4533: ldc2_w -207959321
    //   4536: l2i
    //   4537: ldc_w 811134409
    //   4540: ixor
    //   4541: ixor
    //   4542: lookupswitch default -> 20530, -1764119509 -> 4568, 497776014 -> 4525
    //   4568: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4571: ldc2_w 429230014
    //   4574: l2i
    //   4575: ldc_w 429229864
    //   4578: ixor
    //   4579: getstatic Perryc.1 : I
    //   4582: ifeq -> 4596
    //   4585: ldc2_w 1183109779
    //   4588: l2i
    //   4589: ldc_w -2101597018
    //   4592: ixor
    //   4593: goto -> 4604
    //   4596: ldc2_w 620014035
    //   4599: l2i
    //   4600: ldc_w -989246048
    //   4603: ixor
    //   4604: ldc2_w 1962963106
    //   4607: l2i
    //   4608: ldc_w -752986287
    //   4611: ixor
    //   4612: ixor
    //   4613: lookupswitch default -> 4640, 1458513176 -> 4596, 1646713286 -> 20508
    //   4640: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4643: ldc2_w -1933687135
    //   4646: l2i
    //   4647: ldc_w -1933687135
    //   4650: ixor
    //   4651: getstatic Perryc.c : I
    //   4654: iflt -> 4668
    //   4657: ldc2_w -386653806
    //   4660: l2i
    //   4661: ldc_w 420165967
    //   4664: ixor
    //   4665: goto -> 4676
    //   4668: ldc2_w 503801075
    //   4671: l2i
    //   4672: ldc_w -1547261137
    //   4675: ixor
    //   4676: ldc2_w 480296568
    //   4679: l2i
    //   4680: ldc_w 967336164
    //   4683: ixor
    //   4684: ixor
    //   4685: lookupswitch default -> 4712, -721959359 -> 20624, 456711023 -> 4668
    //   4712: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4715: ldc2_w -1808910139
    //   4718: l2i
    //   4719: ldc_w -1808910278
    //   4722: ixor
    //   4723: getstatic Perryc.c : I
    //   4726: iflt -> 4740
    //   4729: ldc2_w 321564703
    //   4732: l2i
    //   4733: ldc_w 122659724
    //   4736: ixor
    //   4737: goto -> 4748
    //   4740: ldc2_w 1516638878
    //   4743: l2i
    //   4744: ldc_w -682702526
    //   4747: ixor
    //   4748: ldc2_w 178023176
    //   4751: l2i
    //   4752: ldc_w 233619517
    //   4755: ixor
    //   4756: ixor
    //   4757: lookupswitch default -> 4784, 320190630 -> 20788, 509940303 -> 4740
    //   4784: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4787: getstatic Perryc.1 : I
    //   4790: ifeq -> 4804
    //   4793: ldc2_w -1712553619
    //   4796: l2i
    //   4797: ldc_w -420229845
    //   4800: ixor
    //   4801: goto -> 4812
    //   4804: ldc2_w -1085880088
    //   4807: l2i
    //   4808: ldc_w -923993243
    //   4811: ixor
    //   4812: ldc2_w 1735020516
    //   4815: l2i
    //   4816: ldc_w 97646340
    //   4819: ixor
    //   4820: ixor
    //   4821: lookupswitch default -> 4848, 497349798 -> 20416, 1029183905 -> 4804
    //   4848: aload_0
    //   4849: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   4854: getstatic Perryc.c : I
    //   4857: iflt -> 4871
    //   4860: ldc2_w 1942014315
    //   4863: l2i
    //   4864: ldc_w -906623960
    //   4867: ixor
    //   4868: goto -> 4879
    //   4871: ldc2_w 648748520
    //   4874: l2i
    //   4875: ldc_w -1232798080
    //   4878: ixor
    //   4879: ldc2_w -1595089912
    //   4882: l2i
    //   4883: ldc_w 524276871
    //   4886: ixor
    //   4887: ixor
    //   4888: lookupswitch default -> 4916, 98944460 -> 20388, 759128764 -> 4871
    //   4916: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   4919: getstatic Perryc.1 : I
    //   4922: ifeq -> 4936
    //   4925: ldc2_w -1860045838
    //   4928: l2i
    //   4929: ldc_w -2046053663
    //   4932: ixor
    //   4933: goto -> 4944
    //   4936: ldc2_w -1067880437
    //   4939: l2i
    //   4940: ldc_w -1905299944
    //   4943: ixor
    //   4944: ldc2_w -1737834151
    //   4947: l2i
    //   4948: ldc_w -992543232
    //   4951: ixor
    //   4952: ixor
    //   4953: lookupswitch default -> 20284, 311042378 -> 4980, 1268153930 -> 4936
    //   4980: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4983: getstatic Perryc.1 : I
    //   4986: ifeq -> 5000
    //   4989: ldc2_w 1588815716
    //   4992: l2i
    //   4993: ldc_w -258370631
    //   4996: ixor
    //   4997: goto -> 5008
    //   5000: ldc2_w 111157883
    //   5003: l2i
    //   5004: ldc_w -30231710
    //   5007: ixor
    //   5008: ldc2_w -2127801640
    //   5011: l2i
    //   5012: ldc_w 2056106660
    //   5015: ixor
    //   5016: ixor
    //   5017: lookupswitch default -> 20428, 53703013 -> 5044, 1435178145 -> 5000
    //   5044: putfield alphaBox : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5047: getstatic Perryc.0 : I
    //   5050: ifle -> 5064
    //   5053: ldc2_w 538270031
    //   5056: l2i
    //   5057: ldc_w -1559150117
    //   5060: ixor
    //   5061: goto -> 5072
    //   5064: ldc2_w 1564220837
    //   5067: l2i
    //   5068: ldc_w 1552339649
    //   5071: ixor
    //   5072: ldc2_w 740243205
    //   5075: l2i
    //   5076: ldc_w -18025327
    //   5079: ixor
    //   5080: ixor
    //   5081: lookupswitch default -> 5108, 1367282513 -> 5064, 1375197952 -> 20730
    //   5108: aload_0
    //   5109: getstatic Perryc.0 : I
    //   5112: ifle -> 5126
    //   5115: ldc2_w -780951238
    //   5118: l2i
    //   5119: ldc_w -1859209883
    //   5122: ixor
    //   5123: goto -> 5134
    //   5126: ldc2_w 248497934
    //   5129: l2i
    //   5130: ldc_w 1960967939
    //   5133: ixor
    //   5134: ldc2_w 1644194544
    //   5137: l2i
    //   5138: ldc_w -86249057
    //   5141: ixor
    //   5142: ixor
    //   5143: lookupswitch default -> 5168, -662270160 -> 20774, 1515503057 -> 5126
    //   5168: aload_0
    //   5169: new bigname/zprestige/webhack/features/setting/Setting
    //   5172: dup
    //   5173: ldc_w 'ළ㌜එ㶲류๵灐蹫'
    //   5176: getstatic Perryc.1 : I
    //   5179: ifeq -> 5193
    //   5182: ldc2_w -590560403
    //   5185: l2i
    //   5186: ldc_w 1338156980
    //   5189: ixor
    //   5190: goto -> 5201
    //   5193: ldc2_w 1904213783
    //   5196: l2i
    //   5197: ldc_w -303564306
    //   5200: ixor
    //   5201: ldc2_w 607328837
    //   5204: l2i
    //   5205: ldc_w 345504771
    //   5208: ixor
    //   5209: ixor
    //   5210: lookupswitch default -> 5236, -1549106529 -> 20836, 1632431864 -> 5193
    //   5236: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5239: ldc2_w 1445473509
    //   5242: l2i
    //   5243: ldc_w 1445473301
    //   5246: ixor
    //   5247: getstatic Perryc.c : I
    //   5250: iflt -> 5264
    //   5253: ldc2_w -86559404
    //   5256: l2i
    //   5257: ldc_w -1140979400
    //   5260: ixor
    //   5261: goto -> 5272
    //   5264: ldc2_w -304742316
    //   5267: l2i
    //   5268: ldc_w -2143388856
    //   5271: ixor
    //   5272: ldc2_w 372480183
    //   5275: l2i
    //   5276: ldc_w 1695824628
    //   5279: ixor
    //   5280: ixor
    //   5281: lookupswitch default -> 5308, -829834704 -> 5264, 839818799 -> 20698
    //   5308: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5311: ldc2_w 1580474280
    //   5314: l2i
    //   5315: ldc_w 1580474280
    //   5318: ixor
    //   5319: getstatic Perryc.c : I
    //   5322: iflt -> 5336
    //   5325: ldc2_w 1464040950
    //   5328: l2i
    //   5329: ldc_w -1965878018
    //   5332: ixor
    //   5333: goto -> 5344
    //   5336: ldc2_w 1568695610
    //   5339: l2i
    //   5340: ldc_w 891611732
    //   5343: ixor
    //   5344: ldc2_w -1652212883
    //   5347: l2i
    //   5348: ldc_w -77388448
    //   5351: ixor
    //   5352: ixor
    //   5353: lookupswitch default -> 5380, -2009238384 -> 5336, -1149864187 -> 20502
    //   5380: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5383: ldc2_w -1320971152
    //   5386: l2i
    //   5387: ldc_w -1320971121
    //   5390: ixor
    //   5391: getstatic Perryc.0 : I
    //   5394: ifle -> 5408
    //   5397: ldc2_w 687357103
    //   5400: l2i
    //   5401: ldc_w -110384630
    //   5404: ixor
    //   5405: goto -> 5416
    //   5408: ldc2_w -763865006
    //   5411: l2i
    //   5412: ldc_w -879372497
    //   5415: ixor
    //   5416: ldc2_w 2141851730
    //   5419: l2i
    //   5420: ldc_w -622118783
    //   5423: ixor
    //   5424: ixor
    //   5425: lookupswitch default -> 20666, -1129535570 -> 5452, 1959968374 -> 5408
    //   5452: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5455: getstatic Perryc.1 : I
    //   5458: ifeq -> 5472
    //   5461: ldc2_w 1725996463
    //   5464: l2i
    //   5465: ldc_w 529233599
    //   5468: ixor
    //   5469: goto -> 5480
    //   5472: ldc2_w -1911914526
    //   5475: l2i
    //   5476: ldc_w 301245521
    //   5479: ixor
    //   5480: ldc2_w -2102308822
    //   5483: l2i
    //   5484: ldc_w 1162360997
    //   5487: ixor
    //   5488: ixor
    //   5489: lookupswitch default -> 20476, -1097694305 -> 5472, 1476899644 -> 5516
    //   5516: aload_0
    //   5517: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   5522: getstatic Perryc.0 : I
    //   5525: ifle -> 5539
    //   5528: ldc2_w -1409577615
    //   5531: l2i
    //   5532: ldc_w -1262701982
    //   5535: ixor
    //   5536: goto -> 5547
    //   5539: ldc2_w -272249796
    //   5542: l2i
    //   5543: ldc_w 47072652
    //   5546: ixor
    //   5547: ldc2_w 1402769680
    //   5550: l2i
    //   5551: ldc_w -1313503645
    //   5554: ixor
    //   5555: ixor
    //   5556: lookupswitch default -> 5584, -859621990 -> 5539, -43112352 -> 20532
    //   5584: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   5587: getstatic Perryc.c : I
    //   5590: iflt -> 5604
    //   5593: ldc2_w 1246495376
    //   5596: l2i
    //   5597: ldc_w 2092789975
    //   5600: ixor
    //   5601: goto -> 5612
    //   5604: ldc2_w -8820591
    //   5607: l2i
    //   5608: ldc_w -1638890781
    //   5611: ixor
    //   5612: ldc2_w -396973278
    //   5615: l2i
    //   5616: ldc_w 1393336498
    //   5619: ixor
    //   5620: ixor
    //   5621: lookupswitch default -> 5648, -1918141993 -> 20562, -827747323 -> 5604
    //   5648: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5651: getstatic Perryc.0 : I
    //   5654: ifle -> 5668
    //   5657: ldc2_w -1119809489
    //   5660: l2i
    //   5661: ldc_w 847748990
    //   5664: ixor
    //   5665: goto -> 5676
    //   5668: ldc2_w 480873643
    //   5671: l2i
    //   5672: ldc_w 84336702
    //   5675: ixor
    //   5676: ldc2_w -925342811
    //   5679: l2i
    //   5680: ldc_w 47239137
    //   5683: ixor
    //   5684: ixor
    //   5685: lookupswitch default -> 5712, 1171137301 -> 20404, 1499618370 -> 5668
    //   5712: putfield alpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5715: getstatic Perryc.0 : I
    //   5718: ifle -> 5732
    //   5721: ldc2_w -292455624
    //   5724: l2i
    //   5725: ldc_w -1448567364
    //   5728: ixor
    //   5729: goto -> 5740
    //   5732: ldc2_w 1702031502
    //   5735: l2i
    //   5736: ldc_w -1620509510
    //   5739: ixor
    //   5740: ldc2_w -287049739
    //   5743: l2i
    //   5744: ldc_w 795864993
    //   5747: ixor
    //   5748: ixor
    //   5749: lookupswitch default -> 5776, -2034893104 -> 20304, -216593226 -> 5732
    //   5776: aload_0
    //   5777: getstatic Perryc.0 : I
    //   5780: ifle -> 5794
    //   5783: ldc2_w -2002184484
    //   5786: l2i
    //   5787: ldc_w -1999862385
    //   5790: ixor
    //   5791: goto -> 5802
    //   5794: ldc2_w -13619836
    //   5797: l2i
    //   5798: ldc_w 1508930378
    //   5801: ixor
    //   5802: ldc2_w 1820822070
    //   5805: l2i
    //   5806: ldc_w 1725970760
    //   5809: ixor
    //   5810: ixor
    //   5811: lookupswitch default -> 5836, -2006927350 -> 5794, 167911469 -> 20514
    //   5836: aload_0
    //   5837: new bigname/zprestige/webhack/features/setting/Setting
    //   5840: dup
    //   5841: ldc_w 'ෟ㌒ඎ㶹륈๮'
    //   5844: getstatic Perryc.c : I
    //   5847: iflt -> 5861
    //   5850: ldc2_w -2004441360
    //   5853: l2i
    //   5854: ldc_w -789368388
    //   5857: ixor
    //   5858: goto -> 5869
    //   5861: ldc2_w -1992043053
    //   5864: l2i
    //   5865: ldc_w -60756522
    //   5868: ixor
    //   5869: ldc2_w 196551264
    //   5872: l2i
    //   5873: ldc_w -201231676
    //   5876: ixor
    //   5877: ixor
    //   5878: lookupswitch default -> 5904, -1480341528 -> 20322, -1310488903 -> 5861
    //   5904: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5907: ldc2_w 2040495081
    //   5910: l2i
    //   5911: ldc_w 2040495080
    //   5914: ixor
    //   5915: getstatic Perryc.0 : I
    //   5918: ifle -> 5932
    //   5921: ldc2_w 60636764
    //   5924: l2i
    //   5925: ldc_w 478889726
    //   5928: ixor
    //   5929: goto -> 5940
    //   5932: ldc2_w -1206305127
    //   5935: l2i
    //   5936: ldc_w -325007401
    //   5939: ixor
    //   5940: ldc2_w -708404107
    //   5943: l2i
    //   5944: ldc_w -58909842
    //   5947: ixor
    //   5948: ixor
    //   5949: lookupswitch default -> 20848, 917372857 -> 5932, 2097315413 -> 5976
    //   5976: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   5979: getstatic Perryc.1 : I
    //   5982: ifeq -> 5996
    //   5985: ldc2_w -1220310103
    //   5988: l2i
    //   5989: ldc_w -1315655811
    //   5992: ixor
    //   5993: goto -> 6004
    //   5996: ldc2_w -1571021032
    //   5999: l2i
    //   6000: ldc_w -1419007642
    //   6003: ixor
    //   6004: ldc2_w 2033858414
    //   6007: l2i
    //   6008: ldc_w 1247105575
    //   6011: ixor
    //   6012: ixor
    //   6013: lookupswitch default -> 6040, -2000608239 -> 5996, 901267869 -> 20578
    //   6040: aload_0
    //   6041: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   6046: getstatic Perryc.c : I
    //   6049: iflt -> 6063
    //   6052: ldc2_w -1100492187
    //   6055: l2i
    //   6056: ldc_w -746025558
    //   6059: ixor
    //   6060: goto -> 6071
    //   6063: ldc2_w 1823251588
    //   6066: l2i
    //   6067: ldc_w -518527676
    //   6070: ixor
    //   6071: ldc2_w -1401787018
    //   6074: l2i
    //   6075: ldc_w 1344964991
    //   6078: ixor
    //   6079: ixor
    //   6080: lookupswitch default -> 20496, -1850229818 -> 6063, 1910742473 -> 6108
    //   6108: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   6111: getstatic Perryc.0 : I
    //   6114: ifle -> 6128
    //   6117: ldc2_w -496211663
    //   6120: l2i
    //   6121: ldc_w -1631268049
    //   6124: ixor
    //   6125: goto -> 6136
    //   6128: ldc2_w 1453125254
    //   6131: l2i
    //   6132: ldc_w -288131690
    //   6135: ixor
    //   6136: ldc2_w 534557200
    //   6139: l2i
    //   6140: ldc_w -1690265820
    //   6143: ixor
    //   6144: ixor
    //   6145: lookupswitch default -> 20258, -130769110 -> 6128, 1020509732 -> 6172
    //   6172: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6175: getstatic Perryc.1 : I
    //   6178: ifeq -> 6192
    //   6181: ldc2_w 1516411207
    //   6184: l2i
    //   6185: ldc_w -1074392487
    //   6188: ixor
    //   6189: goto -> 6200
    //   6192: ldc2_w -1392164781
    //   6195: l2i
    //   6196: ldc_w 144203269
    //   6199: ixor
    //   6200: ldc2_w 395799990
    //   6203: l2i
    //   6204: ldc_w -679356120
    //   6207: ixor
    //   6208: ixor
    //   6209: lookupswitch default -> 20518, 629292928 -> 6192, 1703652040 -> 6236
    //   6236: putfield rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6239: getstatic Perryc.1 : I
    //   6242: ifeq -> 6256
    //   6245: ldc2_w -707759195
    //   6248: l2i
    //   6249: ldc_w 849917618
    //   6252: ixor
    //   6253: goto -> 6264
    //   6256: ldc2_w 1094887485
    //   6259: l2i
    //   6260: ldc_w 1323766616
    //   6263: ixor
    //   6264: ldc2_w 127896570
    //   6267: l2i
    //   6268: ldc_w 1997870448
    //   6271: ixor
    //   6272: ixor
    //   6273: lookupswitch default -> 6300, -1745724515 -> 20328, 1505126130 -> 6256
    //   6300: aload_0
    //   6301: getstatic Perryc.0 : I
    //   6304: ifle -> 6318
    //   6307: ldc2_w -1160124837
    //   6310: l2i
    //   6311: ldc_w 1960796623
    //   6314: ixor
    //   6315: goto -> 6326
    //   6318: ldc2_w 1616618637
    //   6321: l2i
    //   6322: ldc_w -980564643
    //   6325: ixor
    //   6326: ldc2_w 1838164578
    //   6329: l2i
    //   6330: ldc_w -860413198
    //   6333: ixor
    //   6334: ixor
    //   6335: lookupswitch default -> 20344, 82929984 -> 6360, 1864470276 -> 6318
    //   6360: aload_0
    //   6361: new bigname/zprestige/webhack/features/setting/Setting
    //   6364: dup
    //   6365: ldc_w 'ළ㌡ආ㶾륄๶灗蹎딲ਢ'
    //   6368: getstatic Perryc.c : I
    //   6371: iflt -> 6385
    //   6374: ldc2_w 1923985348
    //   6377: l2i
    //   6378: ldc_w -2133605051
    //   6381: ixor
    //   6382: goto -> 6393
    //   6385: ldc2_w 2070839366
    //   6388: l2i
    //   6389: ldc_w 1271706754
    //   6392: ixor
    //   6393: ldc2_w 1068824394
    //   6396: l2i
    //   6397: ldc_w -2117973619
    //   6400: ixor
    //   6401: ixor
    //   6402: lookupswitch default -> 6428, 1275647046 -> 20656, 1710291336 -> 6385
    //   6428: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6431: getstatic Perryc.0 : I
    //   6434: ifle -> 6448
    //   6437: ldc2_w 1791738914
    //   6440: l2i
    //   6441: ldc_w -2133371111
    //   6444: ixor
    //   6445: goto -> 6456
    //   6448: ldc2_w 1361162680
    //   6451: l2i
    //   6452: ldc_w 1166464263
    //   6455: ixor
    //   6456: ldc2_w 1625188266
    //   6459: l2i
    //   6460: ldc_w 2088578122
    //   6463: ixor
    //   6464: ixor
    //   6465: lookupswitch default -> 20454, -155199269 -> 6448, 134491999 -> 6492
    //   6492: getstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode.Static : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowMode;
    //   6495: getstatic Perryc.c : I
    //   6498: iflt -> 6512
    //   6501: ldc2_w -1867123325
    //   6504: l2i
    //   6505: ldc_w -1195345385
    //   6508: ixor
    //   6509: goto -> 6520
    //   6512: ldc2_w -34384572
    //   6515: l2i
    //   6516: ldc_w 1507457476
    //   6519: ixor
    //   6520: ldc2_w -2125560388
    //   6523: l2i
    //   6524: ldc_w 1299531424
    //   6527: ixor
    //   6528: ixor
    //   6529: lookupswitch default -> 6556, -464630648 -> 20744, 517622258 -> 6512
    //   6556: aload_0
    //   6557: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   6562: getstatic Perryc.c : I
    //   6565: iflt -> 6579
    //   6568: ldc2_w 180043244
    //   6571: l2i
    //   6572: ldc_w -159146334
    //   6575: ixor
    //   6576: goto -> 6587
    //   6579: ldc2_w 351679817
    //   6582: l2i
    //   6583: ldc_w 168771800
    //   6586: ixor
    //   6587: ldc2_w -1835750578
    //   6590: l2i
    //   6591: ldc_w 1424032068
    //   6594: ixor
    //   6595: ixor
    //   6596: lookupswitch default -> 6624, -1988646052 -> 6579, 978127172 -> 20636
    //   6624: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   6627: getstatic Perryc.1 : I
    //   6630: ifeq -> 6644
    //   6633: ldc2_w -248816263
    //   6636: l2i
    //   6637: ldc_w -912481286
    //   6640: ixor
    //   6641: goto -> 6652
    //   6644: ldc2_w 465006199
    //   6647: l2i
    //   6648: ldc_w 787235304
    //   6651: ixor
    //   6652: ldc2_w -2114412794
    //   6655: l2i
    //   6656: ldc_w -710618564
    //   6659: ixor
    //   6660: ixor
    //   6661: lookupswitch default -> 20522, 1627873957 -> 6688, 1827386297 -> 6644
    //   6688: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6691: getstatic Perryc.c : I
    //   6694: iflt -> 6708
    //   6697: ldc2_w 1007930761
    //   6700: l2i
    //   6701: ldc_w -1325936540
    //   6704: ixor
    //   6705: goto -> 6716
    //   6708: ldc2_w -1552224107
    //   6711: l2i
    //   6712: ldc_w 1781295916
    //   6715: ixor
    //   6716: ldc2_w -920431557
    //   6719: l2i
    //   6720: ldc_w 646006147
    //   6723: ixor
    //   6724: ixor
    //   6725: lookupswitch default -> 20272, 653560321 -> 6752, 1665535061 -> 6708
    //   6752: putfield rainbowModeHud : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6755: getstatic Perryc.c : I
    //   6758: iflt -> 6772
    //   6761: ldc2_w 224433651
    //   6764: l2i
    //   6765: ldc_w 786551323
    //   6768: ixor
    //   6769: goto -> 6780
    //   6772: ldc2_w -781126773
    //   6775: l2i
    //   6776: ldc_w -985314828
    //   6779: ixor
    //   6780: ldc2_w 138967439
    //   6783: l2i
    //   6784: ldc_w 1634313003
    //   6787: ixor
    //   6788: ixor
    //   6789: lookupswitch default -> 20806, 1252040012 -> 6772, 2098487515 -> 6816
    //   6816: aload_0
    //   6817: getstatic Perryc.c : I
    //   6820: iflt -> 6834
    //   6823: ldc2_w 1426693337
    //   6826: l2i
    //   6827: ldc_w 1601899811
    //   6830: ixor
    //   6831: goto -> 6842
    //   6834: ldc2_w -861425721
    //   6837: l2i
    //   6838: ldc_w 702128757
    //   6841: ixor
    //   6842: ldc2_w -1084390575
    //   6845: l2i
    //   6846: ldc_w 1566969211
    //   6849: ixor
    //   6850: ixor
    //   6851: lookupswitch default -> 20716, -397860912 -> 6834, 121996184 -> 6876
    //   6876: aload_0
    //   6877: new bigname/zprestige/webhack/features/setting/Setting
    //   6880: dup
    //   6881: ldc_w '෌㌡ආ㶾륄๶灗蹎딲ਢ'
    //   6884: getstatic Perryc.0 : I
    //   6887: ifle -> 6901
    //   6890: ldc2_w 450324392
    //   6893: l2i
    //   6894: ldc_w 7059632
    //   6897: ixor
    //   6898: goto -> 6909
    //   6901: ldc2_w -119505818
    //   6904: l2i
    //   6905: ldc_w -470997496
    //   6908: ixor
    //   6909: ldc2_w 1942453454
    //   6912: l2i
    //   6913: ldc_w 564171211
    //   6916: ixor
    //   6917: ixor
    //   6918: lookupswitch default -> 20516, 1222324765 -> 6901, 1231730539 -> 6944
    //   6944: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6947: getstatic Perryc.1 : I
    //   6950: ifeq -> 6964
    //   6953: ldc2_w -167508747
    //   6956: l2i
    //   6957: ldc_w 1923385009
    //   6960: ixor
    //   6961: goto -> 6972
    //   6964: ldc2_w -502821344
    //   6967: l2i
    //   6968: ldc_w 196596813
    //   6971: ixor
    //   6972: ldc2_w 855149891
    //   6975: l2i
    //   6976: ldc_w -468144399
    //   6979: ixor
    //   6980: ixor
    //   6981: lookupswitch default -> 20800, 1062238687 -> 7008, 1379967478 -> 6964
    //   7008: getstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowModeArray.Static : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$rainbowModeArray;
    //   7011: getstatic Perryc.c : I
    //   7014: iflt -> 7028
    //   7017: ldc2_w 1565849512
    //   7020: l2i
    //   7021: ldc_w -404505699
    //   7024: ixor
    //   7025: goto -> 7036
    //   7028: ldc2_w -2021347733
    //   7031: l2i
    //   7032: ldc_w -1747229824
    //   7035: ixor
    //   7036: ldc2_w 118359493
    //   7039: l2i
    //   7040: ldc_w -1840311332
    //   7043: ixor
    //   7044: ixor
    //   7045: lookupswitch default -> 20330, -2061575182 -> 7072, 804674092 -> 7028
    //   7072: aload_0
    //   7073: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   7078: getstatic Perryc.0 : I
    //   7081: ifle -> 7095
    //   7084: ldc2_w -1841530701
    //   7087: l2i
    //   7088: ldc_w -598975146
    //   7091: ixor
    //   7092: goto -> 7103
    //   7095: ldc2_w 1422565592
    //   7098: l2i
    //   7099: ldc_w 1326193038
    //   7102: ixor
    //   7103: ldc2_w -338804959
    //   7106: l2i
    //   7107: ldc_w 620087317
    //   7110: ixor
    //   7111: ixor
    //   7112: lookupswitch default -> 20798, -2125737263 -> 7095, -721596830 -> 7140
    //   7140: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   7143: getstatic Perryc.c : I
    //   7146: iflt -> 7160
    //   7149: ldc2_w -727081637
    //   7152: l2i
    //   7153: ldc_w 1434639112
    //   7156: ixor
    //   7157: goto -> 7168
    //   7160: ldc2_w 769312494
    //   7163: l2i
    //   7164: ldc_w -1187078229
    //   7167: ixor
    //   7168: ldc2_w 389642972
    //   7171: l2i
    //   7172: ldc_w -897253195
    //   7175: ixor
    //   7176: ixor
    //   7177: lookupswitch default -> 7204, 1553415226 -> 20638, 1575422548 -> 7160
    //   7204: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7207: getstatic Perryc.1 : I
    //   7210: ifeq -> 7224
    //   7213: ldc2_w 1773926268
    //   7216: l2i
    //   7217: ldc_w -136480052
    //   7220: ixor
    //   7221: goto -> 7232
    //   7224: ldc2_w 2111892659
    //   7227: l2i
    //   7228: ldc_w -604586774
    //   7231: ixor
    //   7232: ldc2_w -1676741192
    //   7235: l2i
    //   7236: ldc_w 196436264
    //   7239: ixor
    //   7240: ixor
    //   7241: lookupswitch default -> 7268, 165484832 -> 20520, 1360130051 -> 7224
    //   7268: putfield rainbowModeA : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7271: getstatic Perryc.0 : I
    //   7274: ifle -> 7288
    //   7277: ldc2_w 1598752257
    //   7280: l2i
    //   7281: ldc_w 982500222
    //   7284: ixor
    //   7285: goto -> 7296
    //   7288: ldc2_w -290159005
    //   7291: l2i
    //   7292: ldc_w -1038988406
    //   7295: ixor
    //   7296: ldc2_w -1253656184
    //   7299: l2i
    //   7300: ldc_w 1981244178
    //   7303: ixor
    //   7304: ixor
    //   7305: lookupswitch default -> 7332, -1500176411 -> 20598, 2055916428 -> 7288
    //   7332: aload_0
    //   7333: getstatic Perryc.c : I
    //   7336: iflt -> 7350
    //   7339: ldc2_w -1958344246
    //   7342: l2i
    //   7343: ldc_w 64259265
    //   7346: ixor
    //   7347: goto -> 7358
    //   7350: ldc2_w -1698691761
    //   7353: l2i
    //   7354: ldc_w 696358219
    //   7357: ixor
    //   7358: ldc2_w -1901787826
    //   7361: l2i
    //   7362: ldc_w -466382800
    //   7365: ixor
    //   7366: ixor
    //   7367: lookupswitch default -> 20498, -640219782 -> 7392, -503048075 -> 7350
    //   7392: aload_0
    //   7393: new bigname/zprestige/webhack/features/setting/Setting
    //   7396: dup
    //   7397: ldc_w '෉㌖උ㶶륓'
    //   7400: getstatic Perryc.0 : I
    //   7403: ifle -> 7417
    //   7406: ldc2_w 1029562192
    //   7409: l2i
    //   7410: ldc_w 54490126
    //   7413: ixor
    //   7414: goto -> 7425
    //   7417: ldc2_w 1778161772
    //   7420: l2i
    //   7421: ldc_w -1273180488
    //   7424: ixor
    //   7425: ldc2_w -1269551144
    //   7428: l2i
    //   7429: ldc_w 388454025
    //   7432: ixor
    //   7433: ixor
    //   7434: lookupswitch default -> 20538, -1659776497 -> 7417, 2123575173 -> 7460
    //   7460: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7463: ldc2_w -557560501
    //   7466: l2i
    //   7467: ldc_w -557560445
    //   7470: ixor
    //   7471: getstatic Perryc.0 : I
    //   7474: ifle -> 7488
    //   7477: ldc2_w 1009081514
    //   7480: l2i
    //   7481: ldc_w -948988908
    //   7484: ixor
    //   7485: goto -> 7496
    //   7488: ldc2_w 1020764764
    //   7491: l2i
    //   7492: ldc_w -679821706
    //   7495: ixor
    //   7496: ldc2_w 1290946944
    //   7499: l2i
    //   7500: ldc_w -727356570
    //   7503: ixor
    //   7504: ixor
    //   7505: lookupswitch default -> 7532, -136094273 -> 7488, 1662904920 -> 20384
    //   7532: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7535: ldc2_w 278070501
    //   7538: l2i
    //   7539: ldc_w 278070501
    //   7542: ixor
    //   7543: getstatic Perryc.c : I
    //   7546: iflt -> 7560
    //   7549: ldc2_w 2084229644
    //   7552: l2i
    //   7553: ldc_w -19307739
    //   7556: ixor
    //   7557: goto -> 7568
    //   7560: ldc2_w 1266844957
    //   7563: l2i
    //   7564: ldc_w -1609922447
    //   7567: ixor
    //   7568: ldc2_w 289280110
    //   7571: l2i
    //   7572: ldc_w 28361589
    //   7575: ixor
    //   7576: ixor
    //   7577: lookupswitch default -> 20686, -1838325198 -> 7560, -83435913 -> 7604
    //   7604: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7607: ldc2_w -1554987861
    //   7610: l2i
    //   7611: ldc_w -1554987277
    //   7614: ixor
    //   7615: getstatic Perryc.c : I
    //   7618: iflt -> 7632
    //   7621: ldc2_w -650788217
    //   7624: l2i
    //   7625: ldc_w -1970976362
    //   7628: ixor
    //   7629: goto -> 7640
    //   7632: ldc2_w -707293372
    //   7635: l2i
    //   7636: ldc_w -896101597
    //   7639: ixor
    //   7640: ldc2_w -422823771
    //   7643: l2i
    //   7644: ldc_w 47617789
    //   7647: ixor
    //   7648: ixor
    //   7649: lookupswitch default -> 7676, -1213586103 -> 20510, 1012074383 -> 7632
    //   7676: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7679: getstatic Perryc.1 : I
    //   7682: ifeq -> 7696
    //   7685: ldc2_w 182083432
    //   7688: l2i
    //   7689: ldc_w 1837212800
    //   7692: ixor
    //   7693: goto -> 7704
    //   7696: ldc2_w -656188411
    //   7699: l2i
    //   7700: ldc_w -428596549
    //   7703: ixor
    //   7704: ldc2_w 1311004222
    //   7707: l2i
    //   7708: ldc_w 2047755028
    //   7711: ixor
    //   7712: ixor
    //   7713: lookupswitch default -> 7740, -913840695 -> 7696, 1399975618 -> 20270
    //   7740: aload_0
    //   7741: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   7746: getstatic Perryc.0 : I
    //   7749: ifle -> 7763
    //   7752: ldc2_w -2119981530
    //   7755: l2i
    //   7756: ldc_w 2081431081
    //   7759: ixor
    //   7760: goto -> 7771
    //   7763: ldc2_w -757192897
    //   7766: l2i
    //   7767: ldc_w -82406923
    //   7770: ixor
    //   7771: ldc2_w 490864304
    //   7774: l2i
    //   7775: ldc_w 279572336
    //   7778: ixor
    //   7779: ixor
    //   7780: lookupswitch default -> 7808, -1675621710 -> 7763, -262428209 -> 20466
    //   7808: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   7811: getstatic Perryc.1 : I
    //   7814: ifeq -> 7828
    //   7817: ldc2_w -267824787
    //   7820: l2i
    //   7821: ldc_w 59465332
    //   7824: ixor
    //   7825: goto -> 7836
    //   7828: ldc2_w 1192364350
    //   7831: l2i
    //   7832: ldc_w 1094343183
    //   7835: ixor
    //   7836: ldc2_w -1683512488
    //   7839: l2i
    //   7840: ldc_w 247078558
    //   7843: ixor
    //   7844: ixor
    //   7845: lookupswitch default -> 7872, 1690738707 -> 7828, 1721742047 -> 20492
    //   7872: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7875: getstatic Perryc.0 : I
    //   7878: ifle -> 7892
    //   7881: ldc2_w 2085075991
    //   7884: l2i
    //   7885: ldc_w -200419119
    //   7888: ixor
    //   7889: goto -> 7900
    //   7892: ldc2_w 107500966
    //   7895: l2i
    //   7896: ldc_w -117288016
    //   7899: ixor
    //   7900: ldc2_w -1183448133
    //   7903: l2i
    //   7904: ldc_w -647595151
    //   7907: ixor
    //   7908: ixor
    //   7909: lookupswitch default -> 20588, -1619362084 -> 7936, -396747764 -> 7892
    //   7936: putfield rainbowHue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7939: getstatic Perryc.0 : I
    //   7942: ifle -> 7956
    //   7945: ldc2_w 146656320
    //   7948: l2i
    //   7949: ldc_w 1511610222
    //   7952: ixor
    //   7953: goto -> 7964
    //   7956: ldc2_w 710954781
    //   7959: l2i
    //   7960: ldc_w -905469498
    //   7963: ixor
    //   7964: ldc2_w 1652892291
    //   7967: l2i
    //   7968: ldc_w 346994387
    //   7971: ixor
    //   7972: ixor
    //   7973: lookupswitch default -> 8000, -1600665609 -> 7956, 613355390 -> 20736
    //   8000: aload_0
    //   8001: getstatic Perryc.0 : I
    //   8004: ifle -> 8018
    //   8007: ldc2_w 1390382224
    //   8010: l2i
    //   8011: ldc_w -1760241662
    //   8014: ixor
    //   8015: goto -> 8026
    //   8018: ldc2_w 1695949718
    //   8021: l2i
    //   8022: ldc_w 2020019498
    //   8025: ixor
    //   8026: ldc2_w 1640646808
    //   8029: l2i
    //   8030: ldc_w 478202822
    //   8033: ixor
    //   8034: ixor
    //   8035: lookupswitch default -> 20552, -1199450164 -> 8018, 1614523874 -> 8060
    //   8060: aload_0
    //   8061: new bigname/zprestige/webhack/features/setting/Setting
    //   8064: dup
    //   8065: ldc_w 'ා㌁ඎ㶰륂๷灅蹰땶'
    //   8068: getstatic Perryc.1 : I
    //   8071: ifeq -> 8085
    //   8074: ldc2_w 1488155226
    //   8077: l2i
    //   8078: ldc_w 613382414
    //   8081: ixor
    //   8082: goto -> 8093
    //   8085: ldc2_w 1274041706
    //   8088: l2i
    //   8089: ldc_w -1778644295
    //   8092: ixor
    //   8093: ldc2_w -613749976
    //   8096: l2i
    //   8097: ldc_w 961894778
    //   8100: ixor
    //   8101: ixor
    //   8102: lookupswitch default -> 20486, -1643923194 -> 8085, 1010036097 -> 8128
    //   8128: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8131: ldc_w 0.010857287
    //   8134: invokestatic floatToIntBits : (F)I
    //   8137: ldc_w 2135876291
    //   8140: ixor
    //   8141: invokestatic intBitsToFloat : (I)F
    //   8144: getstatic Perryc.1 : I
    //   8147: ifeq -> 8161
    //   8150: ldc2_w 2074123866
    //   8153: l2i
    //   8154: ldc_w 1672168264
    //   8157: ixor
    //   8158: goto -> 8169
    //   8161: ldc2_w -2012383410
    //   8164: l2i
    //   8165: ldc_w -1091883771
    //   8168: ixor
    //   8169: ldc2_w -2131766229
    //   8172: l2i
    //   8173: ldc_w -1934760413
    //   8176: ixor
    //   8177: ixor
    //   8178: lookupswitch default -> 20832, 340389658 -> 8161, 983853123 -> 8204
    //   8204: invokestatic valueOf : (F)Ljava/lang/Float;
    //   8207: ldc_w 15.994254
    //   8210: invokestatic floatToIntBits : (F)I
    //   8213: ldc_w 2130700407
    //   8216: ixor
    //   8217: invokestatic intBitsToFloat : (I)F
    //   8220: getstatic Perryc.0 : I
    //   8223: ifle -> 8237
    //   8226: ldc2_w -359120528
    //   8229: l2i
    //   8230: ldc_w -44423993
    //   8233: ixor
    //   8234: goto -> 8245
    //   8237: ldc2_w -1959679104
    //   8240: l2i
    //   8241: ldc_w -143027410
    //   8244: ixor
    //   8245: ldc2_w -1329453060
    //   8248: l2i
    //   8249: ldc_w -1783335900
    //   8252: ixor
    //   8253: ixor
    //   8254: lookupswitch default -> 8280, -2100628138 -> 8237, 850671215 -> 20846
    //   8280: invokestatic valueOf : (F)Ljava/lang/Float;
    //   8283: ldc_w 0.014143418
    //   8286: invokestatic floatToIntBits : (F)I
    //   8289: ldc_w 2132326859
    //   8292: ixor
    //   8293: invokestatic intBitsToFloat : (I)F
    //   8296: getstatic Perryc.0 : I
    //   8299: ifle -> 8313
    //   8302: ldc2_w 1051162840
    //   8305: l2i
    //   8306: ldc_w 998186897
    //   8309: ixor
    //   8310: goto -> 8321
    //   8313: ldc2_w -1060493140
    //   8316: l2i
    //   8317: ldc_w -2052051904
    //   8320: ixor
    //   8321: ldc2_w -158045370
    //   8324: l2i
    //   8325: ldc_w 851109011
    //   8328: ixor
    //   8329: ixor
    //   8330: lookupswitch default -> 8356, -1040783204 -> 20386, -534506460 -> 8313
    //   8356: invokestatic valueOf : (F)Ljava/lang/Float;
    //   8359: getstatic Perryc.c : I
    //   8362: iflt -> 8376
    //   8365: ldc2_w 783753999
    //   8368: l2i
    //   8369: ldc_w 193460697
    //   8372: ixor
    //   8373: goto -> 8384
    //   8376: ldc2_w 186537255
    //   8379: l2i
    //   8380: ldc_w -552487148
    //   8383: ixor
    //   8384: ldc2_w 364927081
    //   8387: l2i
    //   8388: ldc_w 2082092829
    //   8391: ixor
    //   8392: ixor
    //   8393: lookupswitch default -> 20254, -1110078137 -> 8420, 1290450338 -> 8376
    //   8420: aload_0
    //   8421: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   8426: getstatic Perryc.0 : I
    //   8429: ifle -> 8443
    //   8432: ldc2_w 2040565466
    //   8435: l2i
    //   8436: ldc_w 1505947473
    //   8439: ixor
    //   8440: goto -> 8451
    //   8443: ldc2_w 108860022
    //   8446: l2i
    //   8447: ldc_w -591137265
    //   8450: ixor
    //   8451: ldc2_w -26086439
    //   8454: l2i
    //   8455: ldc_w -865362876
    //   8458: ixor
    //   8459: ixor
    //   8460: lookupswitch default -> 20338, -391869468 -> 8488, 309857814 -> 8443
    //   8488: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   8491: getstatic Perryc.c : I
    //   8494: iflt -> 8508
    //   8497: ldc2_w -299614841
    //   8500: l2i
    //   8501: ldc_w -258855646
    //   8504: ixor
    //   8505: goto -> 8516
    //   8508: ldc2_w 615712180
    //   8511: l2i
    //   8512: ldc_w -637751573
    //   8515: ixor
    //   8516: ldc2_w -1642010322
    //   8519: l2i
    //   8520: ldc_w -1018784841
    //   8523: ixor
    //   8524: ixor
    //   8525: lookupswitch default -> 20558, -1607872058 -> 8552, 1137732156 -> 8508
    //   8552: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8555: getstatic Perryc.c : I
    //   8558: iflt -> 8572
    //   8561: ldc2_w -1157671641
    //   8564: l2i
    //   8565: ldc_w -1185839854
    //   8568: ixor
    //   8569: goto -> 8580
    //   8572: ldc2_w -253524369
    //   8575: l2i
    //   8576: ldc_w 577665988
    //   8579: ixor
    //   8580: ldc2_w -1826752653
    //   8583: l2i
    //   8584: ldc_w -689971091
    //   8587: ixor
    //   8588: ixor
    //   8589: lookupswitch default -> 20540, -1756370251 -> 8616, 1181533995 -> 8572
    //   8616: putfield rainbowBrightness : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8619: getstatic Perryc.0 : I
    //   8622: ifle -> 8636
    //   8625: ldc2_w -462844908
    //   8628: l2i
    //   8629: ldc_w 846553021
    //   8632: ixor
    //   8633: goto -> 8644
    //   8636: ldc2_w -1279987186
    //   8639: l2i
    //   8640: ldc_w -792462184
    //   8643: ixor
    //   8644: ldc2_w 141747820
    //   8647: l2i
    //   8648: ldc_w -265583194
    //   8651: ixor
    //   8652: ixor
    //   8653: lookupswitch default -> 20288, -1691456164 -> 8680, 776319075 -> 8636
    //   8680: aload_0
    //   8681: getstatic Perryc.c : I
    //   8684: iflt -> 8698
    //   8687: ldc2_w 919643074
    //   8690: l2i
    //   8691: ldc_w -1146859982
    //   8694: ixor
    //   8695: goto -> 8706
    //   8698: ldc2_w 1834648496
    //   8701: l2i
    //   8702: ldc_w 372669931
    //   8705: ixor
    //   8706: ldc2_w 1637624201
    //   8709: l2i
    //   8710: ldc_w -1474984212
    //   8713: ixor
    //   8714: ixor
    //   8715: lookupswitch default -> 20432, -1293594306 -> 8740, 1157448341 -> 8698
    //   8740: aload_0
    //   8741: new bigname/zprestige/webhack/features/setting/Setting
    //   8744: dup
    //   8745: ldc_w 'ෞ㌒ඓ㶢류๭灉蹬'
    //   8748: getstatic Perryc.1 : I
    //   8751: ifeq -> 8765
    //   8754: ldc2_w -1553641940
    //   8757: l2i
    //   8758: ldc_w 1228624293
    //   8761: ixor
    //   8762: goto -> 8773
    //   8765: ldc2_w -1538666793
    //   8768: l2i
    //   8769: ldc_w -247177929
    //   8772: ixor
    //   8773: ldc2_w -2146561376
    //   8776: l2i
    //   8777: ldc_w -1962549831
    //   8780: ixor
    //   8781: ixor
    //   8782: lookupswitch default -> 20642, -514469744 -> 8765, 1577475321 -> 8808
    //   8808: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8811: ldc_w 0.016012078
    //   8814: invokestatic floatToIntBits : (F)I
    //   8817: ldc_w 2118855619
    //   8820: ixor
    //   8821: invokestatic intBitsToFloat : (I)F
    //   8824: getstatic Perryc.0 : I
    //   8827: ifle -> 8841
    //   8830: ldc2_w -956132140
    //   8833: l2i
    //   8834: ldc_w -1074370528
    //   8837: ixor
    //   8838: goto -> 8849
    //   8841: ldc2_w 438212286
    //   8844: l2i
    //   8845: ldc_w 2145895540
    //   8848: ixor
    //   8849: ldc2_w 1755004366
    //   8852: l2i
    //   8853: ldc_w 681468911
    //   8856: ixor
    //   8857: ixor
    //   8858: lookupswitch default -> 20626, 637275371 -> 8884, 955359957 -> 8841
    //   8884: invokestatic valueOf : (F)Ljava/lang/Float;
    //   8887: ldc_w 4.9462237
    //   8890: invokestatic floatToIntBits : (F)I
    //   8893: ldc_w 2132690807
    //   8896: ixor
    //   8897: invokestatic intBitsToFloat : (I)F
    //   8900: getstatic Perryc.1 : I
    //   8903: ifeq -> 8917
    //   8906: ldc2_w 1770313067
    //   8909: l2i
    //   8910: ldc_w -1584098345
    //   8913: ixor
    //   8914: goto -> 8925
    //   8917: ldc2_w -944091190
    //   8920: l2i
    //   8921: ldc_w 1263279850
    //   8924: ixor
    //   8925: ldc2_w -1046164181
    //   8928: l2i
    //   8929: ldc_w -495715887
    //   8932: ixor
    //   8933: ixor
    //   8934: lookupswitch default -> 8960, -339250618 -> 20336, 479568445 -> 8917
    //   8960: invokestatic valueOf : (F)Ljava/lang/Float;
    //   8963: ldc_w 0.14864872
    //   8966: invokestatic floatToIntBits : (F)I
    //   8969: ldc_w 2103916383
    //   8972: ixor
    //   8973: invokestatic intBitsToFloat : (I)F
    //   8976: getstatic Perryc.c : I
    //   8979: iflt -> 8993
    //   8982: ldc2_w 1404067939
    //   8985: l2i
    //   8986: ldc_w 149512507
    //   8989: ixor
    //   8990: goto -> 9001
    //   8993: ldc2_w 1543690818
    //   8996: l2i
    //   8997: ldc_w -642112742
    //   9000: ixor
    //   9001: ldc2_w -1231974293
    //   9004: l2i
    //   9005: ldc_w -1141434647
    //   9008: ixor
    //   9009: ixor
    //   9010: lookupswitch default -> 20306, -1998684198 -> 9036, 1447004122 -> 8993
    //   9036: invokestatic valueOf : (F)Ljava/lang/Float;
    //   9039: getstatic Perryc.1 : I
    //   9042: ifeq -> 9056
    //   9045: ldc2_w 703127394
    //   9048: l2i
    //   9049: ldc_w 518141937
    //   9052: ixor
    //   9053: goto -> 9064
    //   9056: ldc2_w 814964662
    //   9059: l2i
    //   9060: ldc_w 714859510
    //   9063: ixor
    //   9064: ldc2_w -1262025637
    //   9067: l2i
    //   9068: ldc_w 751127069
    //   9071: ixor
    //   9072: ixor
    //   9073: lookupswitch default -> 9100, -1358387499 -> 20838, -103125310 -> 9056
    //   9100: aload_0
    //   9101: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   9106: getstatic Perryc.0 : I
    //   9109: ifle -> 9123
    //   9112: ldc2_w -865023900
    //   9115: l2i
    //   9116: ldc_w 918557834
    //   9119: ixor
    //   9120: goto -> 9131
    //   9123: ldc2_w 79061098
    //   9126: l2i
    //   9127: ldc_w -1131207491
    //   9130: ixor
    //   9131: ldc2_w 381273551
    //   9134: l2i
    //   9135: ldc_w 1630907140
    //   9138: ixor
    //   9139: ixor
    //   9140: lookupswitch default -> 20524, -1925402075 -> 9123, -810997220 -> 9168
    //   9168: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   9171: getstatic Perryc.c : I
    //   9174: iflt -> 9188
    //   9177: ldc2_w -1794260212
    //   9180: l2i
    //   9181: ldc_w -1740742027
    //   9184: ixor
    //   9185: goto -> 9196
    //   9188: ldc2_w -854019518
    //   9191: l2i
    //   9192: ldc_w 335561423
    //   9195: ixor
    //   9196: ldc2_w -1220667144
    //   9199: l2i
    //   9200: ldc_w -96243223
    //   9203: ixor
    //   9204: ixor
    //   9205: lookupswitch default -> 20822, -1805280868 -> 9232, 1078904936 -> 9188
    //   9232: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9235: getstatic Perryc.1 : I
    //   9238: ifeq -> 9252
    //   9241: ldc2_w 478919546
    //   9244: l2i
    //   9245: ldc_w -526561932
    //   9248: ixor
    //   9249: goto -> 9260
    //   9252: ldc2_w -120378457
    //   9255: l2i
    //   9256: ldc_w 915384359
    //   9259: ixor
    //   9260: ldc2_w 192941853
    //   9263: l2i
    //   9264: ldc_w 2144959360
    //   9267: ixor
    //   9268: ixor
    //   9269: lookupswitch default -> 20842, -2008055149 -> 9252, -1174014179 -> 9296
    //   9296: putfield rainbowSaturation : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9299: getstatic Perryc.0 : I
    //   9302: ifle -> 9316
    //   9305: ldc2_w 173819036
    //   9308: l2i
    //   9309: ldc_w 1505035615
    //   9312: ixor
    //   9313: goto -> 9324
    //   9316: ldc2_w 2069472875
    //   9319: l2i
    //   9320: ldc_w -795606546
    //   9323: ixor
    //   9324: ldc2_w 486064256
    //   9327: l2i
    //   9328: ldc_w 153961314
    //   9331: ixor
    //   9332: ixor
    //   9333: lookupswitch default -> 9360, -11155433 -> 9316, 1178386977 -> 20692
    //   9360: aload_0
    //   9361: getstatic Perryc.0 : I
    //   9364: ifle -> 9378
    //   9367: ldc2_w -892188939
    //   9370: l2i
    //   9371: ldc_w -1163757528
    //   9374: ixor
    //   9375: goto -> 9386
    //   9378: ldc2_w 805607246
    //   9381: l2i
    //   9382: ldc_w -1815637667
    //   9385: ixor
    //   9386: ldc2_w 1045491410
    //   9389: l2i
    //   9390: ldc_w 29569237
    //   9393: ixor
    //   9394: ixor
    //   9395: lookupswitch default -> 9420, -1980510158 -> 9378, 1340334298 -> 20340
    //   9420: aload_0
    //   9421: new bigname/zprestige/webhack/features/setting/Setting
    //   9424: dup
    //   9425: ldc_w 'ව㌒ඎ㶹륧๷灕蹐딤ਢ쀰煯'
    //   9428: getstatic Perryc.c : I
    //   9431: iflt -> 9445
    //   9434: ldc2_w -1574177408
    //   9437: l2i
    //   9438: ldc_w 1823800873
    //   9441: ixor
    //   9442: goto -> 9453
    //   9445: ldc2_w -1588394758
    //   9448: l2i
    //   9449: ldc_w 1430728816
    //   9452: ixor
    //   9453: ldc2_w 1689232074
    //   9456: l2i
    //   9457: ldc_w 1194980293
    //   9460: ixor
    //   9461: ixor
    //   9462: lookupswitch default -> 20550, -679320187 -> 9488, -318154074 -> 9445
    //   9488: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9491: ldc2_w -196441734
    //   9494: l2i
    //   9495: ldc_w -196441734
    //   9498: ixor
    //   9499: getstatic Perryc.0 : I
    //   9502: ifle -> 9516
    //   9505: ldc2_w 102320348
    //   9508: l2i
    //   9509: ldc_w -1558906809
    //   9512: ixor
    //   9513: goto -> 9524
    //   9516: ldc2_w 301973014
    //   9519: l2i
    //   9520: ldc_w -1256156398
    //   9523: ixor
    //   9524: ldc2_w -1693215110
    //   9527: l2i
    //   9528: ldc_w 539995857
    //   9531: ixor
    //   9532: ixor
    //   9533: lookupswitch default -> 20632, 506562608 -> 9516, 534975919 -> 9560
    //   9560: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   9563: getstatic Perryc.1 : I
    //   9566: ifeq -> 9580
    //   9569: ldc2_w -14868654
    //   9572: l2i
    //   9573: ldc_w 508393968
    //   9576: ixor
    //   9577: goto -> 9588
    //   9580: ldc2_w -2051126215
    //   9583: l2i
    //   9584: ldc_w 2145588002
    //   9587: ixor
    //   9588: ldc2_w 259657241
    //   9591: l2i
    //   9592: ldc_w 1843459566
    //   9595: ixor
    //   9596: ixor
    //   9597: lookupswitch default -> 9624, -2083873451 -> 20604, 1449692606 -> 9580
    //   9624: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   9627: getstatic Perryc.0 : I
    //   9630: ifle -> 9644
    //   9633: ldc2_w 60051802
    //   9636: l2i
    //   9637: ldc_w -1493389849
    //   9640: ixor
    //   9641: goto -> 9652
    //   9644: ldc2_w -868151639
    //   9647: l2i
    //   9648: ldc_w -258218012
    //   9651: ixor
    //   9652: ldc2_w 1035443856
    //   9655: l2i
    //   9656: ldc_w 950631855
    //   9659: ixor
    //   9660: ixor
    //   9661: lookupswitch default -> 9688, -1602871422 -> 20360, -1300503882 -> 9644
    //   9688: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9691: getstatic Perryc.1 : I
    //   9694: ifeq -> 9708
    //   9697: ldc2_w -189182892
    //   9700: l2i
    //   9701: ldc_w 303015958
    //   9704: ixor
    //   9705: goto -> 9716
    //   9708: ldc2_w 196921851
    //   9711: l2i
    //   9712: ldc_w 1108746361
    //   9715: ixor
    //   9716: ldc2_w 517444355
    //   9719: l2i
    //   9720: ldc_w -85548568
    //   9723: ixor
    //   9724: ixor
    //   9725: lookupswitch default -> 20760, -1382294679 -> 9752, 42456745 -> 9708
    //   9752: putfield customScreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9755: getstatic Perryc.1 : I
    //   9758: ifeq -> 9772
    //   9761: ldc2_w 2082213024
    //   9764: l2i
    //   9765: ldc_w 1939217381
    //   9768: ixor
    //   9769: goto -> 9780
    //   9772: ldc2_w 61547580
    //   9775: l2i
    //   9776: ldc_w 343472088
    //   9779: ixor
    //   9780: ldc2_w 748085524
    //   9783: l2i
    //   9784: ldc_w 998971240
    //   9787: ixor
    //   9788: ixor
    //   9789: lookupswitch default -> 9816, -229041727 -> 9772, 412606777 -> 20684
    //   9816: aload_0
    //   9817: getstatic Perryc.0 : I
    //   9820: ifle -> 9834
    //   9823: ldc2_w 2074429880
    //   9826: l2i
    //   9827: ldc_w 1491928178
    //   9830: ixor
    //   9831: goto -> 9842
    //   9834: ldc2_w -300680745
    //   9837: l2i
    //   9838: ldc_w -202474468
    //   9841: ixor
    //   9842: ldc2_w 1656795167
    //   9845: l2i
    //   9846: ldc_w 1014206657
    //   9849: ixor
    //   9850: ixor
    //   9851: lookupswitch default -> 9876, 1441059432 -> 9834, 2113629460 -> 20478
    //   9876: aload_0
    //   9877: new bigname/zprestige/webhack/features/setting/Setting
    //   9880: dup
    //   9881: ldc_w 'ා㌒඄㶼륭๶灕蹭'
    //   9884: getstatic Perryc.c : I
    //   9887: iflt -> 9901
    //   9890: ldc2_w -1680836083
    //   9893: l2i
    //   9894: ldc_w 646454055
    //   9897: ixor
    //   9898: goto -> 9909
    //   9901: ldc2_w 1053002445
    //   9904: l2i
    //   9905: ldc_w -611659431
    //   9908: ixor
    //   9909: ldc2_w 971771719
    //   9912: l2i
    //   9913: ldc_w 2141393442
    //   9916: ixor
    //   9917: ixor
    //   9918: lookupswitch default -> 9944, -1786541223 -> 9901, -82346929 -> 20754
    //   9944: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9947: ldc2_w -1349150064
    //   9950: l2i
    //   9951: ldc_w -1349150063
    //   9954: ixor
    //   9955: getstatic Perryc.c : I
    //   9958: iflt -> 9972
    //   9961: ldc2_w -118076237
    //   9964: l2i
    //   9965: ldc_w 1314447291
    //   9968: ixor
    //   9969: goto -> 9980
    //   9972: ldc2_w 896052870
    //   9975: l2i
    //   9976: ldc_w -1507196425
    //   9979: ixor
    //   9980: ldc2_w -1565345476
    //   9983: l2i
    //   9984: ldc_w -1140450481
    //   9987: ixor
    //   9988: ixor
    //   9989: lookupswitch default -> 10016, -1474678405 -> 20676, -455003921 -> 9972
    //   10016: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   10019: getstatic Perryc.0 : I
    //   10022: ifle -> 10036
    //   10025: ldc2_w -1389141595
    //   10028: l2i
    //   10029: ldc_w -775982612
    //   10032: ixor
    //   10033: goto -> 10044
    //   10036: ldc2_w 877706750
    //   10039: l2i
    //   10040: ldc_w 1895318876
    //   10043: ixor
    //   10044: ldc2_w 177633017
    //   10047: l2i
    //   10048: ldc_w 1517721765
    //   10051: ixor
    //   10052: ixor
    //   10053: lookupswitch default -> 20620, 340268798 -> 10080, 745340437 -> 10036
    //   10080: aload_0
    //   10081: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   10086: getstatic Perryc.0 : I
    //   10089: ifle -> 10103
    //   10092: ldc2_w 1088925935
    //   10095: l2i
    //   10096: ldc_w 148750668
    //   10099: ixor
    //   10100: goto -> 10111
    //   10103: ldc2_w -510266275
    //   10106: l2i
    //   10107: ldc_w -1568739514
    //   10110: ixor
    //   10111: ldc2_w -244515606
    //   10114: l2i
    //   10115: ldc_w 177129874
    //   10118: ixor
    //   10119: ixor
    //   10120: lookupswitch default -> 20422, -1277672229 -> 10103, -1207357853 -> 10148
    //   10148: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   10151: getstatic Perryc.c : I
    //   10154: iflt -> 10168
    //   10157: ldc2_w 19844767
    //   10160: l2i
    //   10161: ldc_w 1022729364
    //   10164: ixor
    //   10165: goto -> 10176
    //   10168: ldc2_w 752582061
    //   10171: l2i
    //   10172: ldc_w 1427319709
    //   10175: ixor
    //   10176: ldc2_w -1498901129
    //   10179: l2i
    //   10180: ldc_w 1670704280
    //   10183: ixor
    //   10184: ixor
    //   10185: lookupswitch default -> 10212, -2066007418 -> 10168, -119067676 -> 20750
    //   10212: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10215: getstatic Perryc.0 : I
    //   10218: ifle -> 10232
    //   10221: ldc2_w -1460067865
    //   10224: l2i
    //   10225: ldc_w 2460194
    //   10228: ixor
    //   10229: goto -> 10240
    //   10232: ldc2_w -1928788238
    //   10235: l2i
    //   10236: ldc_w 1007742963
    //   10239: ixor
    //   10240: ldc2_w -2021138292
    //   10243: l2i
    //   10244: ldc_w -1091454979
    //   10247: ixor
    //   10248: ixor
    //   10249: lookupswitch default -> 10276, -1851065164 -> 20852, -1519885548 -> 10232
    //   10276: putfield background : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10279: getstatic Perryc.1 : I
    //   10282: ifeq -> 10296
    //   10285: ldc2_w 587352276
    //   10288: l2i
    //   10289: ldc_w 1512527450
    //   10292: ixor
    //   10293: goto -> 10304
    //   10296: ldc2_w -907333092
    //   10299: l2i
    //   10300: ldc_w 1254057489
    //   10303: ixor
    //   10304: ldc2_w 1962947454
    //   10307: l2i
    //   10308: ldc_w 1351487881
    //   10311: ixor
    //   10312: ixor
    //   10313: lookupswitch default -> 10340, 1080838959 -> 10296, 1554726009 -> 20296
    //   10340: aload_0
    //   10341: getstatic Perryc.c : I
    //   10344: iflt -> 10358
    //   10347: ldc2_w 129749526
    //   10350: l2i
    //   10351: ldc_w -1110484876
    //   10354: ixor
    //   10355: goto -> 10366
    //   10358: ldc2_w 429445233
    //   10361: l2i
    //   10362: ldc_w 600588482
    //   10365: ixor
    //   10366: ldc2_w 1957444417
    //   10369: l2i
    //   10370: ldc_w -2041909432
    //   10373: ixor
    //   10374: ixor
    //   10375: lookupswitch default -> 10400, 532330535 -> 10358, 1217551979 -> 20824
    //   10400: aload_0
    //   10401: new bigname/zprestige/webhack/features/setting/Setting
    //   10404: dup
    //   10405: ldc_w 'ෟ㌒ඎ㶹륈๮'
    //   10408: getstatic Perryc.c : I
    //   10411: iflt -> 10425
    //   10414: ldc2_w -38098204
    //   10417: l2i
    //   10418: ldc_w 1660463137
    //   10421: ixor
    //   10422: goto -> 10433
    //   10425: ldc2_w -1910449113
    //   10428: l2i
    //   10429: ldc_w 395810444
    //   10432: ixor
    //   10433: ldc2_w 1950588661
    //   10436: l2i
    //   10437: ldc_w -732445522
    //   10440: ixor
    //   10441: ixor
    //   10442: lookupswitch default -> 10468, -1240077396 -> 10425, 1062623390 -> 20274
    //   10468: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10471: ldc2_w 256805006
    //   10474: l2i
    //   10475: ldc_w 256805007
    //   10478: ixor
    //   10479: getstatic Perryc.c : I
    //   10482: iflt -> 10496
    //   10485: ldc2_w -1261632486
    //   10488: l2i
    //   10489: ldc_w -1697524160
    //   10492: ixor
    //   10493: goto -> 10504
    //   10496: ldc2_w 136119027
    //   10499: l2i
    //   10500: ldc_w -1927839618
    //   10503: ixor
    //   10504: ldc2_w 252133159
    //   10507: l2i
    //   10508: ldc_w 1473540588
    //   10511: ixor
    //   10512: ixor
    //   10513: lookupswitch default -> 20398, -572928954 -> 10540, 1993317521 -> 10496
    //   10540: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   10543: getstatic Perryc.c : I
    //   10546: iflt -> 10560
    //   10549: ldc2_w 1671300362
    //   10552: l2i
    //   10553: ldc_w -1933830249
    //   10556: ixor
    //   10557: goto -> 10568
    //   10560: ldc2_w 71181665
    //   10563: l2i
    //   10564: ldc_w -910413281
    //   10567: ixor
    //   10568: ldc2_w 1278814523
    //   10571: l2i
    //   10572: ldc_w 275544109
    //   10575: ixor
    //   10576: ixor
    //   10577: lookupswitch default -> 20718, -1848162712 -> 10604, -1284029557 -> 10560
    //   10604: aload_0
    //   10605: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   10610: getstatic Perryc.1 : I
    //   10613: ifeq -> 10627
    //   10616: ldc2_w -649359529
    //   10619: l2i
    //   10620: ldc_w 751443769
    //   10623: ixor
    //   10624: goto -> 10635
    //   10627: ldc2_w -142412172
    //   10630: l2i
    //   10631: ldc_w -623936652
    //   10634: ixor
    //   10635: ldc2_w -870734151
    //   10638: l2i
    //   10639: ldc_w 1859556803
    //   10642: ixor
    //   10643: ixor
    //   10644: lookupswitch default -> 10672, 1389839554 -> 10627, 1464771348 -> 20752
    //   10672: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   10675: getstatic Perryc.c : I
    //   10678: iflt -> 10692
    //   10681: ldc2_w -1846091466
    //   10684: l2i
    //   10685: ldc_w 1849850834
    //   10688: ixor
    //   10689: goto -> 10700
    //   10692: ldc2_w -802592441
    //   10695: l2i
    //   10696: ldc_w -1159522535
    //   10699: ixor
    //   10700: ldc2_w 971912709
    //   10703: l2i
    //   10704: ldc_w -1585353999
    //   10707: ixor
    //   10708: ixor
    //   10709: lookupswitch default -> 10736, -2099273025 -> 10692, 1742456336 -> 20786
    //   10736: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10739: getstatic Perryc.1 : I
    //   10742: ifeq -> 10756
    //   10745: ldc2_w 280205902
    //   10748: l2i
    //   10749: ldc_w 800132249
    //   10752: ixor
    //   10753: goto -> 10764
    //   10756: ldc2_w 1472313850
    //   10759: l2i
    //   10760: ldc_w -548966070
    //   10763: ixor
    //   10764: ldc2_w -792224052
    //   10767: l2i
    //   10768: ldc_w -1269968644
    //   10771: ixor
    //   10772: ixor
    //   10773: lookupswitch default -> 20480, -334723456 -> 10800, 1535695079 -> 10756
    //   10800: putfield rainbowg : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10803: getstatic Perryc.c : I
    //   10806: iflt -> 10820
    //   10809: ldc2_w 1014854650
    //   10812: l2i
    //   10813: ldc_w 2146817392
    //   10816: ixor
    //   10817: goto -> 10828
    //   10820: ldc2_w 384024742
    //   10823: l2i
    //   10824: ldc_w 571626240
    //   10827: ixor
    //   10828: ldc2_w 1605392339
    //   10831: l2i
    //   10832: ldc_w -517834502
    //   10835: ixor
    //   10836: ixor
    //   10837: lookupswitch default -> 20526, -1973175153 -> 10864, -48592477 -> 10820
    //   10864: aload_0
    //   10865: getstatic Perryc.1 : I
    //   10868: ifeq -> 10882
    //   10871: ldc2_w 301023662
    //   10874: l2i
    //   10875: ldc_w 1384193014
    //   10878: ixor
    //   10879: goto -> 10890
    //   10882: ldc2_w -1715634026
    //   10885: l2i
    //   10886: ldc_w -278208721
    //   10889: ixor
    //   10890: ldc2_w 1305053076
    //   10893: l2i
    //   10894: ldc_w -1970480168
    //   10897: ixor
    //   10898: ixor
    //   10899: lookupswitch default -> 20622, -2076899820 -> 10882, -1315830795 -> 10924
    //   10924: aload_0
    //   10925: new bigname/zprestige/webhack/features/setting/Setting
    //   10928: dup
    //   10929: ldc_w '්㌆ඎ㷷륩๴灐蹬딳਩쀡'
    //   10932: getstatic Perryc.c : I
    //   10935: iflt -> 10949
    //   10938: ldc2_w -998818517
    //   10941: l2i
    //   10942: ldc_w 301891409
    //   10945: ixor
    //   10946: goto -> 10957
    //   10949: ldc2_w -1596636919
    //   10952: l2i
    //   10953: ldc_w -1742849080
    //   10956: ixor
    //   10957: ldc2_w -1169063426
    //   10960: l2i
    //   10961: ldc_w 1284999836
    //   10964: ixor
    //   10965: ixor
    //   10966: lookupswitch default -> 20756, -837979741 -> 10992, 592398616 -> 10949
    //   10992: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10995: ldc2_w 38333330
    //   10998: l2i
    //   10999: ldc_w 38333331
    //   11002: ixor
    //   11003: getstatic Perryc.0 : I
    //   11006: ifle -> 11020
    //   11009: ldc2_w 506046714
    //   11012: l2i
    //   11013: ldc_w 892021711
    //   11016: ixor
    //   11017: goto -> 11028
    //   11020: ldc2_w -88748268
    //   11023: l2i
    //   11024: ldc_w 566103600
    //   11027: ixor
    //   11028: ldc2_w -188516298
    //   11031: l2i
    //   11032: ldc_w -1456070429
    //   11035: ixor
    //   11036: ixor
    //   11037: lookupswitch default -> 11064, -1288382618 -> 11020, 1995955168 -> 20732
    //   11064: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   11067: getstatic Perryc.0 : I
    //   11070: ifle -> 11084
    //   11073: ldc2_w -959980672
    //   11076: l2i
    //   11077: ldc_w -551344439
    //   11080: ixor
    //   11081: goto -> 11092
    //   11084: ldc2_w 532329405
    //   11087: l2i
    //   11088: ldc_w 1899935887
    //   11091: ixor
    //   11092: ldc2_w 1176887847
    //   11095: l2i
    //   11096: ldc_w 644870061
    //   11099: ixor
    //   11100: ixor
    //   11101: lookupswitch default -> 20664, 248383160 -> 11128, 2041508035 -> 11084
    //   11128: aload_0
    //   11129: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   11134: getstatic Perryc.1 : I
    //   11137: ifeq -> 11151
    //   11140: ldc2_w -1179723139
    //   11143: l2i
    //   11144: ldc_w 1625814952
    //   11147: ixor
    //   11148: goto -> 11159
    //   11151: ldc2_w -1038033908
    //   11154: l2i
    //   11155: ldc_w -1353589772
    //   11158: ixor
    //   11159: ldc2_w 1313031497
    //   11162: l2i
    //   11163: ldc_w 924219508
    //   11166: ixor
    //   11167: ixor
    //   11168: lookupswitch default -> 11196, -1608773400 -> 20810, -1305976595 -> 11151
    //   11196: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   11199: getstatic Perryc.1 : I
    //   11202: ifeq -> 11216
    //   11205: ldc2_w -1017385109
    //   11208: l2i
    //   11209: ldc_w 1602433430
    //   11212: ixor
    //   11213: goto -> 11224
    //   11216: ldc2_w -403868096
    //   11219: l2i
    //   11220: ldc_w -570460756
    //   11223: ixor
    //   11224: ldc2_w 1547158515
    //   11227: l2i
    //   11228: ldc_w -267712935
    //   11231: ixor
    //   11232: ixor
    //   11233: lookupswitch default -> 11260, 820255575 -> 20726, 1070770055 -> 11216
    //   11260: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   11263: getstatic Perryc.0 : I
    //   11266: ifle -> 11280
    //   11269: ldc2_w 867596858
    //   11272: l2i
    //   11273: ldc_w 1360579637
    //   11276: ixor
    //   11277: goto -> 11288
    //   11280: ldc2_w 1878508230
    //   11283: l2i
    //   11284: ldc_w -161863889
    //   11287: ixor
    //   11288: ldc2_w -1866237166
    //   11291: l2i
    //   11292: ldc_w -305946355
    //   11295: ixor
    //   11296: ixor
    //   11297: lookupswitch default -> 11324, -663515853 -> 11280, 531524624 -> 20584
    //   11324: putfield guiComponent : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11327: getstatic Perryc.c : I
    //   11330: iflt -> 11344
    //   11333: ldc2_w 901493752
    //   11336: l2i
    //   11337: ldc_w -1163809572
    //   11340: ixor
    //   11341: goto -> 11352
    //   11344: ldc2_w 2121047026
    //   11347: l2i
    //   11348: ldc_w 1815847863
    //   11351: ixor
    //   11352: ldc2_w 932862211
    //   11355: l2i
    //   11356: ldc_w 2069461520
    //   11359: ixor
    //   11360: ixor
    //   11361: lookupswitch default -> 11388, -1009173449 -> 20644, 698935582 -> 11344
    //   11388: aload_0
    //   11389: getstatic Perryc.c : I
    //   11392: iflt -> 11406
    //   11395: ldc2_w 1163347828
    //   11398: l2i
    //   11399: ldc_w 1733228379
    //   11402: ixor
    //   11403: goto -> 11414
    //   11406: ldc2_w -1634142059
    //   11409: l2i
    //   11410: ldc_w -2137271468
    //   11413: ixor
    //   11414: ldc2_w 395532115
    //   11417: l2i
    //   11418: ldc_w 1201034904
    //   11421: ixor
    //   11422: ixor
    //   11423: lookupswitch default -> 20310, 1309026826 -> 11448, 1914483172 -> 11406
    //   11448: aload_0
    //   11449: new bigname/zprestige/webhack/features/setting/Setting
    //   11452: dup
    //   11453: ldc_w 'ෟ㌖ඃ㷷륦๿灔'
    //   11456: getstatic Perryc.0 : I
    //   11459: ifle -> 11473
    //   11462: ldc2_w 1085740738
    //   11465: l2i
    //   11466: ldc_w -157385476
    //   11469: ixor
    //   11470: goto -> 11481
    //   11473: ldc2_w 511709097
    //   11476: l2i
    //   11477: ldc_w 1304765823
    //   11480: ixor
    //   11481: ldc2_w -1471640871
    //   11484: l2i
    //   11485: ldc_w -168683636
    //   11488: ixor
    //   11489: ixor
    //   11490: lookupswitch default -> 20512, -342624405 -> 11473, 251639683 -> 11516
    //   11516: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   11519: ldc2_w -685690626
    //   11522: l2i
    //   11523: ldc_w -685690729
    //   11526: ixor
    //   11527: getstatic Perryc.c : I
    //   11530: iflt -> 11544
    //   11533: ldc2_w -104855141
    //   11536: l2i
    //   11537: ldc_w -1621918768
    //   11540: ixor
    //   11541: goto -> 11552
    //   11544: ldc2_w 1713304906
    //   11547: l2i
    //   11548: ldc_w -795648154
    //   11551: ixor
    //   11552: ldc2_w 22898092
    //   11555: l2i
    //   11556: ldc_w -769270365
    //   11559: ixor
    //   11560: ixor
    //   11561: lookupswitch default -> 20380, -1242838460 -> 11544, 1710559779 -> 11588
    //   11588: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11591: ldc2_w 202921943
    //   11594: l2i
    //   11595: ldc_w 202921943
    //   11598: ixor
    //   11599: getstatic Perryc.1 : I
    //   11602: ifeq -> 11616
    //   11605: ldc2_w -1697261445
    //   11608: l2i
    //   11609: ldc_w -263719039
    //   11612: ixor
    //   11613: goto -> 11624
    //   11616: ldc2_w -2043186794
    //   11619: l2i
    //   11620: ldc_w -185024148
    //   11623: ixor
    //   11624: ldc2_w 931405214
    //   11627: l2i
    //   11628: ldc_w -1297763725
    //   11631: ixor
    //   11632: ixor
    //   11633: lookupswitch default -> 11660, -307495129 -> 11616, -273448937 -> 20256
    //   11660: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11663: ldc2_w -1275435461
    //   11666: l2i
    //   11667: ldc_w -1275435324
    //   11670: ixor
    //   11671: getstatic Perryc.c : I
    //   11674: iflt -> 11688
    //   11677: ldc2_w -1875797678
    //   11680: l2i
    //   11681: ldc_w -961409043
    //   11684: ixor
    //   11685: goto -> 11696
    //   11688: ldc2_w -1168663749
    //   11691: l2i
    //   11692: ldc_w 1530570208
    //   11695: ixor
    //   11696: ldc2_w -1332596568
    //   11699: l2i
    //   11700: ldc_w 1310607568
    //   11703: ixor
    //   11704: ixor
    //   11705: lookupswitch default -> 20580, -1475350841 -> 11688, 534857379 -> 11732
    //   11732: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11735: getstatic Perryc.1 : I
    //   11738: ifeq -> 11752
    //   11741: ldc2_w 705135337
    //   11744: l2i
    //   11745: ldc_w 1583416444
    //   11748: ixor
    //   11749: goto -> 11760
    //   11752: ldc2_w -1870870170
    //   11755: l2i
    //   11756: ldc_w 138351008
    //   11759: ixor
    //   11760: ldc2_w -356994324
    //   11763: l2i
    //   11764: ldc_w -1986177016
    //   11767: ixor
    //   11768: ixor
    //   11769: lookupswitch default -> 11796, -727835557 -> 11752, 390294641 -> 20426
    //   11796: aload_0
    //   11797: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   11802: getstatic Perryc.1 : I
    //   11805: ifeq -> 11819
    //   11808: ldc2_w 1290913901
    //   11811: l2i
    //   11812: ldc_w 492408490
    //   11815: ixor
    //   11816: goto -> 11827
    //   11819: ldc2_w -1019495393
    //   11822: l2i
    //   11823: ldc_w 50503686
    //   11826: ixor
    //   11827: ldc2_w -1380887268
    //   11830: l2i
    //   11831: ldc_w -1318362675
    //   11834: ixor
    //   11835: ixor
    //   11836: lookupswitch default -> 11864, 1299345942 -> 20290, 1461387422 -> 11819
    //   11864: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   11867: getstatic Perryc.0 : I
    //   11870: ifle -> 11884
    //   11873: ldc2_w 1991562838
    //   11876: l2i
    //   11877: ldc_w 997046150
    //   11880: ixor
    //   11881: goto -> 11892
    //   11884: ldc2_w -1774118546
    //   11887: l2i
    //   11888: ldc_w -410468306
    //   11891: ixor
    //   11892: ldc2_w -1204865535
    //   11895: l2i
    //   11896: ldc_w 1149105333
    //   11899: ixor
    //   11900: ixor
    //   11901: lookupswitch default -> 11928, -1316248732 -> 20594, -836539493 -> 11884
    //   11928: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   11931: getstatic Perryc.c : I
    //   11934: iflt -> 11948
    //   11937: ldc2_w 246133484
    //   11940: l2i
    //   11941: ldc_w 1025760453
    //   11944: ixor
    //   11945: goto -> 11956
    //   11948: ldc2_w -459816790
    //   11951: l2i
    //   11952: ldc_w -383176921
    //   11955: ixor
    //   11956: ldc2_w -359071281
    //   11959: l2i
    //   11960: ldc_w 435887896
    //   11963: ixor
    //   11964: ixor
    //   11965: lookupswitch default -> 11992, -1058377474 -> 20670, -358792232 -> 11948
    //   11992: putfield g_red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11995: getstatic Perryc.0 : I
    //   11998: ifle -> 12012
    //   12001: ldc2_w -1674857758
    //   12004: l2i
    //   12005: ldc_w -1177479220
    //   12008: ixor
    //   12009: goto -> 12020
    //   12012: ldc2_w -1790162235
    //   12015: l2i
    //   12016: ldc_w 1517721740
    //   12019: ixor
    //   12020: ldc2_w 916055872
    //   12023: l2i
    //   12024: ldc_w 1083104401
    //   12027: ixor
    //   12028: ixor
    //   12029: lookupswitch default -> 12056, -690612134 -> 12012, 1408081663 -> 20610
    //   12056: aload_0
    //   12057: getstatic Perryc.c : I
    //   12060: iflt -> 12074
    //   12063: ldc2_w -1481154416
    //   12066: l2i
    //   12067: ldc_w -1142760486
    //   12070: ixor
    //   12071: goto -> 12082
    //   12074: ldc2_w -361832412
    //   12077: l2i
    //   12078: ldc_w 1677855490
    //   12081: ixor
    //   12082: ldc2_w -72727953
    //   12085: l2i
    //   12086: ldc_w -1827249053
    //   12089: ixor
    //   12090: ixor
    //   12091: lookupswitch default -> 12116, -1407208612 -> 12074, 1961467206 -> 20464
    //   12116: aload_0
    //   12117: new bigname/zprestige/webhack/features/setting/Setting
    //   12120: dup
    //   12121: ldc_w '්㌁ං㶲륄๕灅蹥'
    //   12124: getstatic Perryc.1 : I
    //   12127: ifeq -> 12141
    //   12130: ldc2_w -1921376706
    //   12133: l2i
    //   12134: ldc_w -1987689252
    //   12137: ixor
    //   12138: goto -> 12149
    //   12141: ldc2_w 1195799819
    //   12144: l2i
    //   12145: ldc_w -948731478
    //   12148: ixor
    //   12149: ldc2_w 1590512877
    //   12152: l2i
    //   12153: ldc_w 1544359878
    //   12156: ixor
    //   12157: ixor
    //   12158: lookupswitch default -> 12184, -1017450728 -> 12141, 104602057 -> 20554
    //   12184: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   12187: ldc2_w -583104164
    //   12190: l2i
    //   12191: ldc_w -583104002
    //   12194: ixor
    //   12195: getstatic Perryc.1 : I
    //   12198: ifeq -> 12212
    //   12201: ldc2_w 711925575
    //   12204: l2i
    //   12205: ldc_w 1951753617
    //   12208: ixor
    //   12209: goto -> 12220
    //   12212: ldc2_w -945007602
    //   12215: l2i
    //   12216: ldc_w 750215702
    //   12219: ixor
    //   12220: ldc2_w -1675103834
    //   12223: l2i
    //   12224: ldc_w -725829470
    //   12227: ixor
    //   12228: ixor
    //   12229: lookupswitch default -> 20420, -1551859940 -> 12256, 379663314 -> 12212
    //   12256: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12259: ldc2_w 691627810
    //   12262: l2i
    //   12263: ldc_w 691627810
    //   12266: ixor
    //   12267: getstatic Perryc.0 : I
    //   12270: ifle -> 12284
    //   12273: ldc2_w -245060880
    //   12276: l2i
    //   12277: ldc_w -899547619
    //   12280: ixor
    //   12281: goto -> 12292
    //   12284: ldc2_w 2031046063
    //   12287: l2i
    //   12288: ldc_w 434883750
    //   12291: ixor
    //   12292: ldc2_w -995916700
    //   12295: l2i
    //   12296: ldc_w 1202102131
    //   12299: ixor
    //   12300: ixor
    //   12301: lookupswitch default -> 12328, -1207939078 -> 20768, -1118349687 -> 12284
    //   12328: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12331: ldc2_w 764177594
    //   12334: l2i
    //   12335: ldc_w 764177477
    //   12338: ixor
    //   12339: getstatic Perryc.c : I
    //   12342: iflt -> 12356
    //   12345: ldc2_w 1266309901
    //   12348: l2i
    //   12349: ldc_w -440239699
    //   12352: ixor
    //   12353: goto -> 12364
    //   12356: ldc2_w -2114432006
    //   12359: l2i
    //   12360: ldc_w -2144270469
    //   12363: ixor
    //   12364: ldc2_w -1052738739
    //   12367: l2i
    //   12368: ldc_w 405660851
    //   12371: ixor
    //   12372: ixor
    //   12373: lookupswitch default -> 20648, -660288641 -> 12400, 2010496350 -> 12356
    //   12400: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12403: getstatic Perryc.0 : I
    //   12406: ifle -> 12420
    //   12409: ldc2_w 1682490109
    //   12412: l2i
    //   12413: ldc_w -1901590451
    //   12416: ixor
    //   12417: goto -> 12428
    //   12420: ldc2_w -1356905349
    //   12423: l2i
    //   12424: ldc_w -1095530089
    //   12427: ixor
    //   12428: ldc2_w 1056263906
    //   12431: l2i
    //   12432: ldc_w 504696364
    //   12435: ixor
    //   12436: ixor
    //   12437: lookupswitch default -> 12464, -905934210 -> 20600, -573960108 -> 12420
    //   12464: aload_0
    //   12465: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   12470: getstatic Perryc.c : I
    //   12473: iflt -> 12487
    //   12476: ldc2_w 1352770745
    //   12479: l2i
    //   12480: ldc_w 1884795776
    //   12483: ixor
    //   12484: goto -> 12495
    //   12487: ldc2_w 1302738019
    //   12490: l2i
    //   12491: ldc_w -1386086433
    //   12494: ixor
    //   12495: ldc2_w -136272417
    //   12498: l2i
    //   12499: ldc_w -372714974
    //   12502: ixor
    //   12503: ixor
    //   12504: lookupswitch default -> 20408, -17843135 -> 12532, 1054761156 -> 12487
    //   12532: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   12535: getstatic Perryc.0 : I
    //   12538: ifle -> 12552
    //   12541: ldc2_w 280872458
    //   12544: l2i
    //   12545: ldc_w -1483659408
    //   12548: ixor
    //   12549: goto -> 12560
    //   12552: ldc2_w -132010599
    //   12555: l2i
    //   12556: ldc_w -1269269278
    //   12559: ixor
    //   12560: ldc2_w -988014624
    //   12563: l2i
    //   12564: ldc_w 1657152509
    //   12567: ixor
    //   12568: ixor
    //   12569: lookupswitch default -> 12596, -2028522831 -> 12552, 284611943 -> 20392
    //   12596: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   12599: getstatic Perryc.0 : I
    //   12602: ifle -> 12616
    //   12605: ldc2_w -39634474
    //   12608: l2i
    //   12609: ldc_w -1689608013
    //   12612: ixor
    //   12613: goto -> 12624
    //   12616: ldc2_w 554218380
    //   12619: l2i
    //   12620: ldc_w 1956958439
    //   12623: ixor
    //   12624: ldc2_w 1833411063
    //   12627: l2i
    //   12628: ldc_w -1935996645
    //   12631: ixor
    //   12632: ixor
    //   12633: lookupswitch default -> 12660, -2026557047 -> 20312, -1704608949 -> 12616
    //   12660: putfield g_green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12663: getstatic Perryc.0 : I
    //   12666: ifle -> 12680
    //   12669: ldc2_w -2053348570
    //   12672: l2i
    //   12673: ldc_w -1824882378
    //   12676: ixor
    //   12677: goto -> 12688
    //   12680: ldc2_w 1526364180
    //   12683: l2i
    //   12684: ldc_w -1962246538
    //   12687: ixor
    //   12688: ldc2_w 1024447718
    //   12691: l2i
    //   12692: ldc_w -1194457963
    //   12695: ixor
    //   12696: ixor
    //   12697: lookupswitch default -> 20268, -1821953437 -> 12680, 1412552209 -> 12724
    //   12724: aload_0
    //   12725: getstatic Perryc.c : I
    //   12728: iflt -> 12742
    //   12731: ldc2_w -1471363929
    //   12734: l2i
    //   12735: ldc_w 1956570828
    //   12738: ixor
    //   12739: goto -> 12750
    //   12742: ldc2_w -610439441
    //   12745: l2i
    //   12746: ldc_w 754277870
    //   12749: ixor
    //   12750: ldc2_w -1190313473
    //   12753: l2i
    //   12754: ldc_w 548603392
    //   12757: ixor
    //   12758: ixor
    //   12759: lookupswitch default -> 12784, 1164731796 -> 20286, 1316799863 -> 12742
    //   12784: aload_0
    //   12785: new bigname/zprestige/webhack/features/setting/Setting
    //   12788: dup
    //   12789: ldc_w 'ා㌟ඒ㶲뤊๼灆蹷'
    //   12792: getstatic Perryc.1 : I
    //   12795: ifeq -> 12809
    //   12798: ldc2_w -1549643450
    //   12801: l2i
    //   12802: ldc_w -1667442884
    //   12805: ixor
    //   12806: goto -> 12817
    //   12809: ldc2_w -1583608543
    //   12812: l2i
    //   12813: ldc_w 1783342329
    //   12816: ixor
    //   12817: ldc2_w 1742500637
    //   12820: l2i
    //   12821: ldc_w 670227363
    //   12824: ixor
    //   12825: ixor
    //   12826: lookupswitch default -> 20668, -1946615450 -> 12852, 2131766980 -> 12809
    //   12852: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   12855: ldc2_w -1773182256
    //   12858: l2i
    //   12859: ldc_w -1773182417
    //   12862: ixor
    //   12863: getstatic Perryc.0 : I
    //   12866: ifle -> 12880
    //   12869: ldc2_w 1055787866
    //   12872: l2i
    //   12873: ldc_w -1313930720
    //   12876: ixor
    //   12877: goto -> 12888
    //   12880: ldc2_w -1187447514
    //   12883: l2i
    //   12884: ldc_w -941849294
    //   12887: ixor
    //   12888: ldc2_w -1980498652
    //   12891: l2i
    //   12892: ldc_w 1629410382
    //   12895: ixor
    //   12896: ixor
    //   12897: lookupswitch default -> 12924, 1003170140 -> 12880, 1739333648 -> 20564
    //   12924: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12927: ldc2_w 759430522
    //   12930: l2i
    //   12931: ldc_w 759430522
    //   12934: ixor
    //   12935: getstatic Perryc.0 : I
    //   12938: ifle -> 12952
    //   12941: ldc2_w 596293040
    //   12944: l2i
    //   12945: ldc_w -1462554425
    //   12948: ixor
    //   12949: goto -> 12960
    //   12952: ldc2_w -324665567
    //   12955: l2i
    //   12956: ldc_w 710597778
    //   12959: ixor
    //   12960: ldc2_w 100506090
    //   12963: l2i
    //   12964: ldc_w 849538827
    //   12967: ixor
    //   12968: ixor
    //   12969: lookupswitch default -> 20452, -1140395114 -> 12952, -241150638 -> 12996
    //   12996: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12999: ldc2_w -818403943
    //   13002: l2i
    //   13003: ldc_w -818403994
    //   13006: ixor
    //   13007: getstatic Perryc.1 : I
    //   13010: ifeq -> 13024
    //   13013: ldc2_w -1046178577
    //   13016: l2i
    //   13017: ldc_w -1048836681
    //   13020: ixor
    //   13021: goto -> 13032
    //   13024: ldc2_w -1431356633
    //   13027: l2i
    //   13028: ldc_w 54826954
    //   13031: ixor
    //   13032: ldc2_w 536442486
    //   13035: l2i
    //   13036: ldc_w -48010677
    //   13039: ixor
    //   13040: ixor
    //   13041: lookupswitch default -> 13068, -2081089510 -> 13024, -503149211 -> 20662
    //   13068: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13071: getstatic Perryc.c : I
    //   13074: iflt -> 13088
    //   13077: ldc2_w 1743180518
    //   13080: l2i
    //   13081: ldc_w -1516868237
    //   13084: ixor
    //   13085: goto -> 13096
    //   13088: ldc2_w 146042557
    //   13091: l2i
    //   13092: ldc_w -353753282
    //   13095: ixor
    //   13096: ldc2_w 1789831022
    //   13099: l2i
    //   13100: ldc_w 1487840703
    //   13103: ixor
    //   13104: ixor
    //   13105: lookupswitch default -> 13132, -261046972 -> 20694, 344736719 -> 13088
    //   13132: aload_0
    //   13133: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   13138: getstatic Perryc.0 : I
    //   13141: ifle -> 13155
    //   13144: ldc2_w -2089800024
    //   13147: l2i
    //   13148: ldc_w -380639703
    //   13151: ixor
    //   13152: goto -> 13163
    //   13155: ldc2_w 1625616935
    //   13158: l2i
    //   13159: ldc_w 1423693710
    //   13162: ixor
    //   13163: ldc2_w 1199862778
    //   13166: l2i
    //   13167: ldc_w 443667900
    //   13170: ixor
    //   13171: ixor
    //   13172: lookupswitch default -> 13200, -972284771 -> 13155, 936013511 -> 20762
    //   13200: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   13203: getstatic Perryc.1 : I
    //   13206: ifeq -> 13220
    //   13209: ldc2_w -651158288
    //   13212: l2i
    //   13213: ldc_w -1865450413
    //   13216: ixor
    //   13217: goto -> 13228
    //   13220: ldc2_w 1870341555
    //   13223: l2i
    //   13224: ldc_w -12610936
    //   13227: ixor
    //   13228: ldc2_w 762000507
    //   13231: l2i
    //   13232: ldc_w -832995281
    //   13235: ixor
    //   13236: ixor
    //   13237: lookupswitch default -> 13264, -1429351177 -> 20738, -1248151400 -> 13220
    //   13264: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   13267: getstatic Perryc.c : I
    //   13270: iflt -> 13284
    //   13273: ldc2_w 423930538
    //   13276: l2i
    //   13277: ldc_w 1620688815
    //   13280: ixor
    //   13281: goto -> 13292
    //   13284: ldc2_w -1093452519
    //   13287: l2i
    //   13288: ldc_w 623294059
    //   13291: ixor
    //   13292: ldc2_w -2001450563
    //   13295: l2i
    //   13296: ldc_w 2112121452
    //   13299: ixor
    //   13300: ixor
    //   13301: lookupswitch default -> 20570, -1936902444 -> 13284, 1856350371 -> 13328
    //   13328: putfield g_blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13331: getstatic Perryc.1 : I
    //   13334: ifeq -> 13348
    //   13337: ldc2_w 815742394
    //   13340: l2i
    //   13341: ldc_w 1160512941
    //   13344: ixor
    //   13345: goto -> 13356
    //   13348: ldc2_w -2080869488
    //   13351: l2i
    //   13352: ldc_w 426590528
    //   13355: ixor
    //   13356: ldc2_w 308788572
    //   13359: l2i
    //   13360: ldc_w -1086451269
    //   13363: ixor
    //   13364: ixor
    //   13365: lookupswitch default -> 20850, -655715088 -> 13348, 936156727 -> 13392
    //   13392: aload_0
    //   13393: getstatic Perryc.c : I
    //   13396: iflt -> 13410
    //   13399: ldc2_w 1586594291
    //   13402: l2i
    //   13403: ldc_w 1040150898
    //   13406: ixor
    //   13407: goto -> 13418
    //   13410: ldc2_w -1510846838
    //   13413: l2i
    //   13414: ldc_w 1145230727
    //   13417: ixor
    //   13418: ldc2_w -1805888760
    //   13421: l2i
    //   13422: ldc_w 1044150657
    //   13425: ixor
    //   13426: ixor
    //   13427: lookupswitch default -> 13452, -921773560 -> 20602, 1400328882 -> 13410
    //   13452: aload_0
    //   13453: new bigname/zprestige/webhack/features/setting/Setting
    //   13456: dup
    //   13457: ldc_w 'ෟ㌖ඃ㷷른๾灈蹷'
    //   13460: getstatic Perryc.0 : I
    //   13463: ifle -> 13477
    //   13466: ldc2_w -1701756960
    //   13469: l2i
    //   13470: ldc_w 1633004987
    //   13473: ixor
    //   13474: goto -> 13485
    //   13477: ldc2_w 1502321338
    //   13480: l2i
    //   13481: ldc_w 518805676
    //   13484: ixor
    //   13485: ldc2_w 1827130179
    //   13488: l2i
    //   13489: ldc_w 1894554043
    //   13492: ixor
    //   13493: ixor
    //   13494: lookupswitch default -> 20708, -405815133 -> 13477, 1533841646 -> 13520
    //   13520: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   13523: ldc2_w -1415723715
    //   13526: l2i
    //   13527: ldc_w -1415723598
    //   13530: ixor
    //   13531: getstatic Perryc.1 : I
    //   13534: ifeq -> 13548
    //   13537: ldc2_w -1441780088
    //   13540: l2i
    //   13541: ldc_w -214922438
    //   13544: ixor
    //   13545: goto -> 13556
    //   13548: ldc2_w 1502601211
    //   13551: l2i
    //   13552: ldc_w -1760133384
    //   13555: ixor
    //   13556: ldc2_w 2133871169
    //   13559: l2i
    //   13560: ldc_w -876204492
    //   13563: ixor
    //   13564: ixor
    //   13565: lookupswitch default -> 20764, -304692793 -> 13548, 2054145398 -> 13592
    //   13592: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13595: ldc2_w 359681689
    //   13598: l2i
    //   13599: ldc_w 359681689
    //   13602: ixor
    //   13603: getstatic Perryc.0 : I
    //   13606: ifle -> 13620
    //   13609: ldc2_w 1538017113
    //   13612: l2i
    //   13613: ldc_w 702883409
    //   13616: ixor
    //   13617: goto -> 13628
    //   13620: ldc2_w 208855273
    //   13623: l2i
    //   13624: ldc_w -110904050
    //   13627: ixor
    //   13628: ldc2_w -1291785319
    //   13631: l2i
    //   13632: ldc_w 115594687
    //   13635: ixor
    //   13636: ixor
    //   13637: lookupswitch default -> 13664, -945135826 -> 20844, -513565268 -> 13620
    //   13664: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13667: ldc2_w -1987339780
    //   13670: l2i
    //   13671: ldc_w -1987340029
    //   13674: ixor
    //   13675: getstatic Perryc.c : I
    //   13678: iflt -> 13692
    //   13681: ldc2_w 415337816
    //   13684: l2i
    //   13685: ldc_w 1257053291
    //   13688: ixor
    //   13689: goto -> 13700
    //   13692: ldc2_w 2023141759
    //   13695: l2i
    //   13696: ldc_w 1266379686
    //   13699: ixor
    //   13700: ldc2_w 826023934
    //   13703: l2i
    //   13704: ldc_w 1981014838
    //   13707: ixor
    //   13708: ixor
    //   13709: lookupswitch default -> 13736, -473183410 -> 13692, 352546299 -> 20472
    //   13736: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13739: getstatic Perryc.c : I
    //   13742: iflt -> 13756
    //   13745: ldc2_w -1258055393
    //   13748: l2i
    //   13749: ldc_w -177094489
    //   13752: ixor
    //   13753: goto -> 13764
    //   13756: ldc2_w 367654661
    //   13759: l2i
    //   13760: ldc_w -1669627635
    //   13763: ixor
    //   13764: ldc2_w -856228598
    //   13767: l2i
    //   13768: ldc_w -2138682459
    //   13771: ixor
    //   13772: ixor
    //   13773: lookupswitch default -> 13800, 201518871 -> 20308, 278301522 -> 13756
    //   13800: aload_0
    //   13801: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   13806: getstatic Perryc.1 : I
    //   13809: ifeq -> 13823
    //   13812: ldc2_w 701349096
    //   13815: l2i
    //   13816: ldc_w 683462864
    //   13819: ixor
    //   13820: goto -> 13831
    //   13823: ldc2_w -1138962850
    //   13826: l2i
    //   13827: ldc_w -1551670338
    //   13830: ixor
    //   13831: ldc2_w -1693087892
    //   13834: l2i
    //   13835: ldc_w 1506856169
    //   13838: ixor
    //   13839: ixor
    //   13840: lookupswitch default -> 13868, -1011603523 -> 20372, -984114189 -> 13823
    //   13868: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   13871: getstatic Perryc.c : I
    //   13874: iflt -> 13888
    //   13877: ldc2_w 1730399361
    //   13880: l2i
    //   13881: ldc_w 16995958
    //   13884: ixor
    //   13885: goto -> 13896
    //   13888: ldc2_w 719063820
    //   13891: l2i
    //   13892: ldc_w 1616797019
    //   13895: ixor
    //   13896: ldc2_w -941859056
    //   13899: l2i
    //   13900: ldc_w 544714728
    //   13903: ixor
    //   13904: ixor
    //   13905: lookupswitch default -> 13932, -2121569777 -> 20816, 2051305863 -> 13888
    //   13932: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   13935: getstatic Perryc.c : I
    //   13938: iflt -> 13952
    //   13941: ldc2_w 141645105
    //   13944: l2i
    //   13945: ldc_w -618130004
    //   13948: ixor
    //   13949: goto -> 13960
    //   13952: ldc2_w -1676765251
    //   13955: l2i
    //   13956: ldc_w -855740032
    //   13959: ixor
    //   13960: ldc2_w -556417973
    //   13963: l2i
    //   13964: ldc_w -1552528608
    //   13967: ixor
    //   13968: ixor
    //   13969: lookupswitch default -> 13996, -1359300618 -> 20542, -737046207 -> 13952
    //   13996: putfield g_red1 : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13999: getstatic Perryc.1 : I
    //   14002: ifeq -> 14016
    //   14005: ldc2_w -689660716
    //   14008: l2i
    //   14009: ldc_w 748336090
    //   14012: ixor
    //   14013: goto -> 14024
    //   14016: ldc2_w -2094920759
    //   14019: l2i
    //   14020: ldc_w 50798105
    //   14023: ixor
    //   14024: ldc2_w -1434436602
    //   14027: l2i
    //   14028: ldc_w 18992947
    //   14031: ixor
    //   14032: ixor
    //   14033: lookupswitch default -> 14060, 241429753 -> 14016, 1373625403 -> 20808
    //   14060: aload_0
    //   14061: getstatic Perryc.c : I
    //   14064: iflt -> 14078
    //   14067: ldc2_w 1732826315
    //   14070: l2i
    //   14071: ldc_w -1158542574
    //   14074: ixor
    //   14075: goto -> 14086
    //   14078: ldc2_w -106802638
    //   14081: l2i
    //   14082: ldc_w -64488129
    //   14085: ixor
    //   14086: ldc2_w 1955649046
    //   14089: l2i
    //   14090: ldc_w 1500052760
    //   14093: ixor
    //   14094: ixor
    //   14095: lookupswitch default -> 14120, -264047401 -> 20318, 1849906892 -> 14078
    //   14120: aload_0
    //   14121: new bigname/zprestige/webhack/features/setting/Setting
    //   14124: dup
    //   14125: ldc_w '්㌁ං㶲륄๋灉蹤딢'
    //   14128: getstatic Perryc.1 : I
    //   14131: ifeq -> 14145
    //   14134: ldc2_w -2087059796
    //   14137: l2i
    //   14138: ldc_w 1049417824
    //   14141: ixor
    //   14142: goto -> 14153
    //   14145: ldc2_w 9456209
    //   14148: l2i
    //   14149: ldc_w 1937511519
    //   14152: ixor
    //   14153: ldc2_w 1980790296
    //   14156: l2i
    //   14157: ldc_w -574061561
    //   14160: ixor
    //   14161: ixor
    //   14162: lookupswitch default -> 14188, 382588115 -> 20324, 1478335746 -> 14145
    //   14188: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   14191: ldc2_w 1134728263
    //   14194: l2i
    //   14195: ldc_w 1134728395
    //   14198: ixor
    //   14199: getstatic Perryc.0 : I
    //   14202: ifle -> 14216
    //   14205: ldc2_w -2146708473
    //   14208: l2i
    //   14209: ldc_w -579584356
    //   14212: ixor
    //   14213: goto -> 14224
    //   14216: ldc2_w 393720986
    //   14219: l2i
    //   14220: ldc_w -1912258334
    //   14223: ixor
    //   14224: ldc2_w 1670677885
    //   14227: l2i
    //   14228: ldc_w 408490901
    //   14231: ixor
    //   14232: ixor
    //   14233: lookupswitch default -> 20390, -490773872 -> 14260, 649231475 -> 14216
    //   14260: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14263: ldc2_w 1647413359
    //   14266: l2i
    //   14267: ldc_w 1647413359
    //   14270: ixor
    //   14271: getstatic Perryc.0 : I
    //   14274: ifle -> 14288
    //   14277: ldc2_w 1584835449
    //   14280: l2i
    //   14281: ldc_w 2034081439
    //   14284: ixor
    //   14285: goto -> 14296
    //   14288: ldc2_w -1156038192
    //   14291: l2i
    //   14292: ldc_w -803208289
    //   14295: ixor
    //   14296: ldc2_w -454740779
    //   14299: l2i
    //   14300: ldc_w 1051983391
    //   14303: ixor
    //   14304: ixor
    //   14305: lookupswitch default -> 14332, -1844833845 -> 14288, -48365780 -> 20434
    //   14332: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14335: ldc2_w -1562890093
    //   14338: l2i
    //   14339: ldc_w -1562890132
    //   14342: ixor
    //   14343: getstatic Perryc.0 : I
    //   14346: ifle -> 14360
    //   14349: ldc2_w -1262662120
    //   14352: l2i
    //   14353: ldc_w -805898025
    //   14356: ixor
    //   14357: goto -> 14368
    //   14360: ldc2_w -359747841
    //   14363: l2i
    //   14364: ldc_w -1587790974
    //   14367: ixor
    //   14368: ldc2_w 1110017620
    //   14371: l2i
    //   14372: ldc_w -1120227225
    //   14375: ixor
    //   14376: ixor
    //   14377: lookupswitch default -> 20820, -2074574596 -> 14360, -1262378162 -> 14404
    //   14404: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14407: getstatic Perryc.c : I
    //   14410: iflt -> 14424
    //   14413: ldc2_w 1911501044
    //   14416: l2i
    //   14417: ldc_w -268768093
    //   14420: ixor
    //   14421: goto -> 14432
    //   14424: ldc2_w -28005943
    //   14427: l2i
    //   14428: ldc_w -894267240
    //   14431: ixor
    //   14432: ldc2_w -985806234
    //   14435: l2i
    //   14436: ldc_w 1116506051
    //   14439: ixor
    //   14440: ixor
    //   14441: lookupswitch default -> 14468, -386593020 -> 14424, 430215666 -> 20556
    //   14468: aload_0
    //   14469: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   14474: getstatic Perryc.0 : I
    //   14477: ifle -> 14491
    //   14480: ldc2_w 1198745038
    //   14483: l2i
    //   14484: ldc_w -1987111684
    //   14487: ixor
    //   14488: goto -> 14499
    //   14491: ldc2_w 366995698
    //   14494: l2i
    //   14495: ldc_w 1095660101
    //   14498: ixor
    //   14499: ldc2_w -1966177169
    //   14502: l2i
    //   14503: ldc_w -1044781310
    //   14506: ixor
    //   14507: ixor
    //   14508: lookupswitch default -> 20696, -2054483361 -> 14491, 535230938 -> 14536
    //   14536: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   14539: getstatic Perryc.0 : I
    //   14542: ifle -> 14556
    //   14545: ldc2_w -293546378
    //   14548: l2i
    //   14549: ldc_w 1767303548
    //   14552: ixor
    //   14553: goto -> 14564
    //   14556: ldc2_w 832841770
    //   14559: l2i
    //   14560: ldc_w 1298280377
    //   14563: ixor
    //   14564: ldc2_w 64080321
    //   14567: l2i
    //   14568: ldc_w 91616735
    //   14571: ixor
    //   14572: ixor
    //   14573: lookupswitch default -> 14600, -2123234540 -> 20650, -727295725 -> 14556
    //   14600: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   14603: getstatic Perryc.c : I
    //   14606: iflt -> 14620
    //   14609: ldc2_w 893983195
    //   14612: l2i
    //   14613: ldc_w -1025599982
    //   14616: ixor
    //   14617: goto -> 14628
    //   14620: ldc2_w 245505271
    //   14623: l2i
    //   14624: ldc_w -1751287586
    //   14627: ixor
    //   14628: ldc2_w 993951943
    //   14631: l2i
    //   14632: ldc_w -839164195
    //   14635: ixor
    //   14636: ixor
    //   14637: lookupswitch default -> 20682, 22172115 -> 14620, 1878702643 -> 14664
    //   14664: putfield g_green1 : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14667: getstatic Perryc.1 : I
    //   14670: ifeq -> 14684
    //   14673: ldc2_w 1179996760
    //   14676: l2i
    //   14677: ldc_w 291895675
    //   14680: ixor
    //   14681: goto -> 14692
    //   14684: ldc2_w -1425314671
    //   14687: l2i
    //   14688: ldc_w 1201312105
    //   14691: ixor
    //   14692: ldc2_w 638002972
    //   14695: l2i
    //   14696: ldc_w -610489312
    //   14699: ixor
    //   14700: ixor
    //   14701: lookupswitch default -> 20278, -1431625697 -> 14684, 285898436 -> 14728
    //   14728: aload_0
    //   14729: getstatic Perryc.0 : I
    //   14732: ifle -> 14746
    //   14735: ldc2_w -335906308
    //   14738: l2i
    //   14739: ldc_w 695088174
    //   14742: ixor
    //   14743: goto -> 14754
    //   14746: ldc2_w -1110122298
    //   14749: l2i
    //   14750: ldc_w -1281091548
    //   14753: ixor
    //   14754: ldc2_w -159780339
    //   14757: l2i
    //   14758: ldc_w 468429193
    //   14761: ixor
    //   14762: ixor
    //   14763: lookupswitch default -> 20680, -471686298 -> 14788, 788928086 -> 14746
    //   14788: aload_0
    //   14789: new bigname/zprestige/webhack/features/setting/Setting
    //   14792: dup
    //   14793: ldc_w 'ා㌟ඒ㶲뤊๰灇蹫'
    //   14796: getstatic Perryc.1 : I
    //   14799: ifeq -> 14813
    //   14802: ldc2_w 1266462532
    //   14805: l2i
    //   14806: ldc_w -936737536
    //   14809: ixor
    //   14810: goto -> 14821
    //   14813: ldc2_w -1462915112
    //   14816: l2i
    //   14817: ldc_w 79794335
    //   14820: ixor
    //   14821: ldc2_w -1143165484
    //   14824: l2i
    //   14825: ldc_w -1240508573
    //   14828: ixor
    //   14829: ixor
    //   14830: lookupswitch default -> 14856, -1903832845 -> 20352, -1861097734 -> 14813
    //   14856: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   14859: ldc2_w -1099431213
    //   14862: l2i
    //   14863: ldc_w -1099431418
    //   14866: ixor
    //   14867: getstatic Perryc.c : I
    //   14870: iflt -> 14884
    //   14873: ldc2_w 1991949086
    //   14876: l2i
    //   14877: ldc_w -1026560513
    //   14880: ixor
    //   14881: goto -> 14892
    //   14884: ldc2_w 1119105454
    //   14887: l2i
    //   14888: ldc_w -432148443
    //   14891: ixor
    //   14892: ldc2_w 1442499302
    //   14895: l2i
    //   14896: ldc_w 1045267232
    //   14899: ixor
    //   14900: ixor
    //   14901: lookupswitch default -> 20592, -817985459 -> 14928, -540926169 -> 14884
    //   14928: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14931: ldc2_w 1522396210
    //   14934: l2i
    //   14935: ldc_w 1522396210
    //   14938: ixor
    //   14939: getstatic Perryc.1 : I
    //   14942: ifeq -> 14956
    //   14945: ldc2_w 52384704
    //   14948: l2i
    //   14949: ldc_w 1085116930
    //   14952: ixor
    //   14953: goto -> 14964
    //   14956: ldc2_w 349824360
    //   14959: l2i
    //   14960: ldc_w -44783725
    //   14963: ixor
    //   14964: ldc2_w -278616116
    //   14967: l2i
    //   14968: ldc_w 1646388355
    //   14971: ixor
    //   14972: ixor
    //   14973: lookupswitch default -> 15000, -822639987 -> 20366, 1377136805 -> 14956
    //   15000: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15003: ldc2_w -109724838
    //   15006: l2i
    //   15007: ldc_w -109724763
    //   15010: ixor
    //   15011: getstatic Perryc.0 : I
    //   15014: ifle -> 15028
    //   15017: ldc2_w -120993737
    //   15020: l2i
    //   15021: ldc_w -1012572522
    //   15024: ixor
    //   15025: goto -> 15036
    //   15028: ldc2_w -448691576
    //   15031: l2i
    //   15032: ldc_w -1933115452
    //   15035: ixor
    //   15036: ldc2_w 696569248
    //   15039: l2i
    //   15040: ldc_w 1334404312
    //   15043: ixor
    //   15044: ixor
    //   15045: lookupswitch default -> 15072, -2015201092 -> 15028, 1566654425 -> 20782
    //   15072: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15075: getstatic Perryc.1 : I
    //   15078: ifeq -> 15092
    //   15081: ldc2_w 927778788
    //   15084: l2i
    //   15085: ldc_w -1350022453
    //   15088: ixor
    //   15089: goto -> 15100
    //   15092: ldc2_w -1126963511
    //   15095: l2i
    //   15096: ldc_w -376534325
    //   15099: ixor
    //   15100: ldc2_w 718424807
    //   15103: l2i
    //   15104: ldc_w 223135026
    //   15107: ixor
    //   15108: ixor
    //   15109: lookupswitch default -> 15136, -1084620038 -> 20298, -263867251 -> 15092
    //   15136: aload_0
    //   15137: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   15142: getstatic Perryc.1 : I
    //   15145: ifeq -> 15159
    //   15148: ldc2_w 1387053421
    //   15151: l2i
    //   15152: ldc_w -1504009146
    //   15155: ixor
    //   15156: goto -> 15167
    //   15159: ldc2_w -361015196
    //   15162: l2i
    //   15163: ldc_w -1419811577
    //   15166: ixor
    //   15167: ldc2_w -1097558620
    //   15170: l2i
    //   15171: ldc_w 1544446446
    //   15174: ixor
    //   15175: ixor
    //   15176: lookupswitch default -> 20446, -1547777751 -> 15204, 376213857 -> 15159
    //   15204: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   15207: getstatic Perryc.1 : I
    //   15210: ifeq -> 15224
    //   15213: ldc2_w 1978039472
    //   15216: l2i
    //   15217: ldc_w 1529359570
    //   15220: ixor
    //   15221: goto -> 15232
    //   15224: ldc2_w 383833299
    //   15227: l2i
    //   15228: ldc_w -1401274463
    //   15231: ixor
    //   15232: ldc2_w 232758849
    //   15235: l2i
    //   15236: ldc_w -865837465
    //   15239: ixor
    //   15240: ixor
    //   15241: lookupswitch default -> 20740, -277508028 -> 15224, 2065771348 -> 15268
    //   15268: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   15271: getstatic Perryc.c : I
    //   15274: iflt -> 15288
    //   15277: ldc2_w 2129866613
    //   15280: l2i
    //   15281: ldc_w -1645441636
    //   15284: ixor
    //   15285: goto -> 15296
    //   15288: ldc2_w -315173166
    //   15291: l2i
    //   15292: ldc_w -1799549198
    //   15295: ixor
    //   15296: ldc2_w 296791242
    //   15299: l2i
    //   15300: ldc_w -708484658
    //   15303: ixor
    //   15304: ixor
    //   15305: lookupswitch default -> 20606, -1107421916 -> 15332, 661286893 -> 15288
    //   15332: putfield g_blue1 : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15335: getstatic Perryc.1 : I
    //   15338: ifeq -> 15352
    //   15341: ldc2_w 375479395
    //   15344: l2i
    //   15345: ldc_w 312417205
    //   15348: ixor
    //   15349: goto -> 15360
    //   15352: ldc2_w 2077942980
    //   15355: l2i
    //   15356: ldc_w -501748121
    //   15359: ixor
    //   15360: ldc2_w 1834737196
    //   15363: l2i
    //   15364: ldc_w 687048241
    //   15367: ixor
    //   15368: ixor
    //   15369: lookupswitch default -> 15396, -1066648889 -> 15352, 1096163275 -> 20784
    //   15396: aload_0
    //   15397: getstatic Perryc.1 : I
    //   15400: ifeq -> 15414
    //   15403: ldc2_w -277925281
    //   15406: l2i
    //   15407: ldc_w 1610352948
    //   15410: ixor
    //   15411: goto -> 15422
    //   15414: ldc2_w 141326652
    //   15417: l2i
    //   15418: ldc_w 418130463
    //   15421: ixor
    //   15422: ldc2_w -630117725
    //   15425: l2i
    //   15426: ldc_w 796154676
    //   15429: ixor
    //   15430: ixor
    //   15431: lookupswitch default -> 15456, 1123068290 -> 15414, 1167477500 -> 20368
    //   15456: aload_0
    //   15457: new bigname/zprestige/webhack/features/setting/Setting
    //   15460: dup
    //   15461: ldc_w '෌㌟඗㶿륋'
    //   15464: getstatic Perryc.0 : I
    //   15467: ifle -> 15481
    //   15470: ldc2_w 1779908672
    //   15473: l2i
    //   15474: ldc_w 1628146808
    //   15477: ixor
    //   15478: goto -> 15489
    //   15481: ldc2_w -76852215
    //   15484: l2i
    //   15485: ldc_w -655271283
    //   15488: ixor
    //   15489: ldc2_w -412553857
    //   15492: l2i
    //   15493: ldc_w -1950239320
    //   15496: ixor
    //   15497: ixor
    //   15498: lookupswitch default -> 15524, -606080559 -> 15481, 1739953391 -> 20438
    //   15524: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   15527: ldc2_w -968883768
    //   15530: l2i
    //   15531: ldc_w -968883913
    //   15534: ixor
    //   15535: getstatic Perryc.0 : I
    //   15538: ifle -> 15552
    //   15541: ldc2_w 1829583908
    //   15544: l2i
    //   15545: ldc_w 1993729251
    //   15548: ixor
    //   15549: goto -> 15560
    //   15552: ldc2_w 1223526504
    //   15555: l2i
    //   15556: ldc_w -254608484
    //   15559: ixor
    //   15560: ldc2_w -1723743310
    //   15563: l2i
    //   15564: ldc_w -591825
    //   15567: ixor
    //   15568: ixor
    //   15569: lookupswitch default -> 15596, -1003486101 -> 15552, 2104484698 -> 20826
    //   15596: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15599: ldc2_w -1520032639
    //   15602: l2i
    //   15603: ldc_w -1520032639
    //   15606: ixor
    //   15607: getstatic Perryc.0 : I
    //   15610: ifle -> 15624
    //   15613: ldc2_w 1725445418
    //   15616: l2i
    //   15617: ldc_w 369554689
    //   15620: ixor
    //   15621: goto -> 15632
    //   15624: ldc2_w 380069915
    //   15627: l2i
    //   15628: ldc_w -1844256645
    //   15631: ixor
    //   15632: ldc2_w 1115843406
    //   15635: l2i
    //   15636: ldc_w 2017257967
    //   15639: ixor
    //   15640: ixor
    //   15641: lookupswitch default -> 20500, -1106572607 -> 15668, 1247822474 -> 15624
    //   15668: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15671: ldc2_w -1265027874
    //   15674: l2i
    //   15675: ldc_w -1265028063
    //   15678: ixor
    //   15679: getstatic Perryc.1 : I
    //   15682: ifeq -> 15696
    //   15685: ldc2_w 991991172
    //   15688: l2i
    //   15689: ldc_w -339132379
    //   15692: ixor
    //   15693: goto -> 15704
    //   15696: ldc2_w -1428072926
    //   15699: l2i
    //   15700: ldc_w -666697332
    //   15703: ixor
    //   15704: ldc2_w -730237889
    //   15707: l2i
    //   15708: ldc_w -292093540
    //   15711: ixor
    //   15712: ixor
    //   15713: lookupswitch default -> 15740, -368599038 -> 20374, 427381074 -> 15696
    //   15740: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15743: getstatic Perryc.0 : I
    //   15746: ifle -> 15760
    //   15749: ldc2_w 431297495
    //   15752: l2i
    //   15753: ldc_w 1034344362
    //   15756: ixor
    //   15757: goto -> 15768
    //   15760: ldc2_w -1776498705
    //   15763: l2i
    //   15764: ldc_w 491113743
    //   15767: ixor
    //   15768: ldc2_w 253811636
    //   15771: l2i
    //   15772: ldc_w -960925789
    //   15775: ixor
    //   15776: ixor
    //   15777: lookupswitch default -> 20840, -309694358 -> 15760, 1119928055 -> 15804
    //   15804: aload_0
    //   15805: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   15810: getstatic Perryc.1 : I
    //   15813: ifeq -> 15827
    //   15816: ldc2_w 1191634433
    //   15819: l2i
    //   15820: ldc_w 1109950836
    //   15823: ixor
    //   15824: goto -> 15835
    //   15827: ldc2_w 299153062
    //   15830: l2i
    //   15831: ldc_w 1283686237
    //   15834: ixor
    //   15835: ldc2_w -1489468483
    //   15838: l2i
    //   15839: ldc_w -1807216487
    //   15842: ixor
    //   15843: ixor
    //   15844: lookupswitch default -> 15872, 912192593 -> 20834, 1429962140 -> 15827
    //   15872: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   15875: getstatic Perryc.c : I
    //   15878: iflt -> 15892
    //   15881: ldc2_w -1764565813
    //   15884: l2i
    //   15885: ldc_w 837959982
    //   15888: ixor
    //   15889: goto -> 15900
    //   15892: ldc2_w 11270181
    //   15895: l2i
    //   15896: ldc_w 1087508862
    //   15899: ixor
    //   15900: ldc2_w 257868243
    //   15903: l2i
    //   15904: ldc_w -846862673
    //   15907: ixor
    //   15908: ixor
    //   15909: lookupswitch default -> 15936, -2040451790 -> 15892, 1710996121 -> 20802
    //   15936: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   15939: getstatic Perryc.c : I
    //   15942: iflt -> 15956
    //   15945: ldc2_w 1887155926
    //   15948: l2i
    //   15949: ldc_w 1310282905
    //   15952: ixor
    //   15953: goto -> 15964
    //   15956: ldc2_w 1879807735
    //   15959: l2i
    //   15960: ldc_w 1419323303
    //   15963: ixor
    //   15964: ldc2_w -2143284280
    //   15967: l2i
    //   15968: ldc_w 1270377063
    //   15971: ixor
    //   15972: ixor
    //   15973: lookupswitch default -> 16000, -1415692225 -> 15956, -174416928 -> 20608
    //   16000: putfield g_alpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16003: getstatic Perryc.0 : I
    //   16006: ifle -> 16020
    //   16009: ldc2_w -1444812428
    //   16012: l2i
    //   16013: ldc_w -1513626236
    //   16016: ixor
    //   16017: goto -> 16028
    //   16020: ldc2_w 1943948752
    //   16023: l2i
    //   16024: ldc_w 837846043
    //   16027: ixor
    //   16028: ldc2_w -1814094068
    //   16031: l2i
    //   16032: ldc_w -644314076
    //   16035: ixor
    //   16036: ixor
    //   16037: lookupswitch default -> 16064, 1180803032 -> 20266, 1414550004 -> 16020
    //   16064: aload_0
    //   16065: getstatic Perryc.1 : I
    //   16068: ifeq -> 16082
    //   16071: ldc2_w 1724416894
    //   16074: l2i
    //   16075: ldc_w -1293496318
    //   16078: ixor
    //   16079: goto -> 16090
    //   16082: ldc2_w 531402962
    //   16085: l2i
    //   16086: ldc_w 1739322538
    //   16089: ixor
    //   16090: ldc2_w 361952934
    //   16093: l2i
    //   16094: ldc_w -2139899380
    //   16097: ixor
    //   16098: ixor
    //   16099: lookupswitch default -> 16124, -1076680664 -> 16082, 1104093142 -> 20544
    //   16124: aload_0
    //   16125: new bigname/zprestige/webhack/features/setting/Setting
    //   16128: dup
    //   16129: ldc_w '෌㌟඗㶿륋ห'
    //   16132: getstatic Perryc.c : I
    //   16135: iflt -> 16149
    //   16138: ldc2_w -1895155858
    //   16141: l2i
    //   16142: ldc_w 1465551916
    //   16145: ixor
    //   16146: goto -> 16157
    //   16149: ldc2_w 1703040026
    //   16152: l2i
    //   16153: ldc_w 822932669
    //   16156: ixor
    //   16157: ldc2_w -964142122
    //   16160: l2i
    //   16161: ldc_w 811792932
    //   16164: ixor
    //   16165: ixor
    //   16166: lookupswitch default -> 20260, -1570504363 -> 16192, 783948464 -> 16149
    //   16192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   16195: ldc2_w 191161935
    //   16198: l2i
    //   16199: ldc_w 191162032
    //   16202: ixor
    //   16203: getstatic Perryc.0 : I
    //   16206: ifle -> 16220
    //   16209: ldc2_w -539671775
    //   16212: l2i
    //   16213: ldc_w 427968474
    //   16216: ixor
    //   16217: goto -> 16228
    //   16220: ldc2_w 1152515506
    //   16223: l2i
    //   16224: ldc_w -471729396
    //   16227: ixor
    //   16228: ldc2_w 184829902
    //   16231: l2i
    //   16232: ldc_w 1198762312
    //   16235: ixor
    //   16236: ixor
    //   16237: lookupswitch default -> 20488, -1977554307 -> 16220, -349706184 -> 16264
    //   16264: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   16267: ldc2_w 2127736316
    //   16270: l2i
    //   16271: ldc_w 2127736316
    //   16274: ixor
    //   16275: getstatic Perryc.1 : I
    //   16278: ifeq -> 16292
    //   16281: ldc2_w 2066037396
    //   16284: l2i
    //   16285: ldc_w -1812919624
    //   16288: ixor
    //   16289: goto -> 16300
    //   16292: ldc2_w 1428743143
    //   16295: l2i
    //   16296: ldc_w -1344838866
    //   16299: ixor
    //   16300: ldc2_w -1650286986
    //   16303: l2i
    //   16304: ldc_w 527784623
    //   16307: ixor
    //   16308: ixor
    //   16309: lookupswitch default -> 16336, 865571494 -> 16292, 1778644213 -> 20776
    //   16336: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   16339: ldc2_w -242159974
    //   16342: l2i
    //   16343: ldc_w -242160027
    //   16346: ixor
    //   16347: getstatic Perryc.c : I
    //   16350: iflt -> 16364
    //   16353: ldc2_w 597643300
    //   16356: l2i
    //   16357: ldc_w -610179107
    //   16360: ixor
    //   16361: goto -> 16372
    //   16364: ldc2_w 919113220
    //   16367: l2i
    //   16368: ldc_w 57078354
    //   16371: ixor
    //   16372: ldc2_w 1247474153
    //   16375: l2i
    //   16376: ldc_w -574991921
    //   16379: ixor
    //   16380: ixor
    //   16381: lookupswitch default -> 16408, -176039886 -> 16364, 1876858847 -> 20248
    //   16408: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   16411: getstatic Perryc.0 : I
    //   16414: ifle -> 16428
    //   16417: ldc2_w -256989570
    //   16420: l2i
    //   16421: ldc_w -2028348060
    //   16424: ixor
    //   16425: goto -> 16436
    //   16428: ldc2_w 1863141650
    //   16431: l2i
    //   16432: ldc_w -1477897000
    //   16435: ixor
    //   16436: ldc2_w -1852460468
    //   16439: l2i
    //   16440: ldc_w 1618628555
    //   16443: ixor
    //   16444: ixor
    //   16445: lookupswitch default -> 16472, -2067561036 -> 16428, -2041018723 -> 20778
    //   16472: aload_0
    //   16473: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   16478: getstatic Perryc.0 : I
    //   16481: ifle -> 16495
    //   16484: ldc2_w -1461715060
    //   16487: l2i
    //   16488: ldc_w 395482711
    //   16491: ixor
    //   16492: goto -> 16503
    //   16495: ldc2_w 278413248
    //   16498: l2i
    //   16499: ldc_w 1248758187
    //   16502: ixor
    //   16503: ldc2_w -1584115171
    //   16506: l2i
    //   16507: ldc_w -35431168
    //   16510: ixor
    //   16511: ixor
    //   16512: lookupswitch default -> 20770, -482711866 -> 16495, 109164918 -> 16540
    //   16540: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   16543: getstatic Perryc.c : I
    //   16546: iflt -> 16560
    //   16549: ldc2_w 1100799625
    //   16552: l2i
    //   16553: ldc_w -1115421736
    //   16556: ixor
    //   16557: goto -> 16568
    //   16560: ldc2_w 553150115
    //   16563: l2i
    //   16564: ldc_w 147179469
    //   16567: ixor
    //   16568: ldc2_w 1735155793
    //   16571: l2i
    //   16572: ldc_w 1866110361
    //   16575: ixor
    //   16576: ixor
    //   16577: lookupswitch default -> 20582, -196204391 -> 16560, 543904934 -> 16604
    //   16604: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   16607: getstatic Perryc.0 : I
    //   16610: ifle -> 16624
    //   16613: ldc2_w -1151528552
    //   16616: l2i
    //   16617: ldc_w 469569735
    //   16620: ixor
    //   16621: goto -> 16632
    //   16624: ldc2_w 1448698002
    //   16627: l2i
    //   16628: ldc_w 1566321383
    //   16631: ixor
    //   16632: ldc2_w -570639229
    //   16635: l2i
    //   16636: ldc_w -2125244280
    //   16639: ixor
    //   16640: ixor
    //   16641: lookupswitch default -> 16668, -2049775903 -> 16624, -66067116 -> 20362
    //   16668: putfield g_alpha1 : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16671: getstatic Perryc.0 : I
    //   16674: ifle -> 16688
    //   16677: ldc2_w -846679501
    //   16680: l2i
    //   16681: ldc_w 1963344936
    //   16684: ixor
    //   16685: goto -> 16696
    //   16688: ldc2_w -881713427
    //   16691: l2i
    //   16692: ldc_w 663510829
    //   16695: ixor
    //   16696: ldc2_w 451743662
    //   16699: l2i
    //   16700: ldc_w -363141361
    //   16703: ixor
    //   16704: ixor
    //   16705: lookupswitch default -> 20660, 474589537 -> 16732, 1211702970 -> 16688
    //   16732: aload_0
    //   16733: getstatic Perryc.1 : I
    //   16736: ifeq -> 16750
    //   16739: ldc2_w -36845239
    //   16742: l2i
    //   16743: ldc_w -852363293
    //   16746: ixor
    //   16747: goto -> 16758
    //   16750: ldc2_w 1073416094
    //   16753: l2i
    //   16754: ldc_w 710147783
    //   16757: ixor
    //   16758: ldc2_w -1361381993
    //   16761: l2i
    //   16762: ldc_w 242836894
    //   16765: ixor
    //   16766: ixor
    //   16767: lookupswitch default -> 20654, -1872777565 -> 16750, -1257543344 -> 16792
    //   16792: aload_0
    //   16793: new bigname/zprestige/webhack/features/setting/Setting
    //   16796: dup
    //   16797: ldc_w 'ව㌜ඃ㶲뤐'
    //   16800: getstatic Perryc.1 : I
    //   16803: ifeq -> 16817
    //   16806: ldc2_w -768888783
    //   16809: l2i
    //   16810: ldc_w 1800538391
    //   16813: ixor
    //   16814: goto -> 16825
    //   16817: ldc2_w 925766641
    //   16820: l2i
    //   16821: ldc_w 1476828483
    //   16824: ixor
    //   16825: ldc2_w -1075351394
    //   16828: l2i
    //   16829: ldc_w 851786411
    //   16832: ixor
    //   16833: ixor
    //   16834: lookupswitch default -> 16860, -359160433 -> 16817, 878441235 -> 20678
    //   16860: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   16863: getstatic Perryc.1 : I
    //   16866: ifeq -> 16880
    //   16869: ldc2_w -1282512842
    //   16872: l2i
    //   16873: ldc_w -124911131
    //   16876: ixor
    //   16877: goto -> 16888
    //   16880: ldc2_w -1493566517
    //   16883: l2i
    //   16884: ldc_w -1446605204
    //   16887: ixor
    //   16888: ldc2_w -349813255
    //   16891: l2i
    //   16892: ldc_w 1149124550
    //   16895: ixor
    //   16896: ixor
    //   16897: lookupswitch default -> 20482, -1603858536 -> 16924, -463989780 -> 16880
    //   16924: getstatic bigname/zprestige/webhack/features/modules/Client/ClickGui$Mode.BLUR : Lbigname/zprestige/webhack/features/modules/Client/ClickGui$Mode;
    //   16927: getstatic Perryc.0 : I
    //   16930: ifle -> 16944
    //   16933: ldc2_w 1170654167
    //   16936: l2i
    //   16937: ldc_w -1967001205
    //   16940: ixor
    //   16941: goto -> 16952
    //   16944: ldc2_w 158812620
    //   16947: l2i
    //   16948: ldc_w 2117835939
    //   16951: ixor
    //   16952: ldc2_w 2033673325
    //   16955: l2i
    //   16956: ldc_w 2128676198
    //   16959: ixor
    //   16960: ixor
    //   16961: lookupswitch default -> 20474, -925805737 -> 16944, 1889186916 -> 16988
    //   16988: aload_0
    //   16989: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   16994: getstatic Perryc.c : I
    //   16997: iflt -> 17011
    //   17000: ldc2_w -273201992
    //   17003: l2i
    //   17004: ldc_w 1715133963
    //   17007: ixor
    //   17008: goto -> 17019
    //   17011: ldc2_w -883451183
    //   17014: l2i
    //   17015: ldc_w -1023324401
    //   17018: ixor
    //   17019: ldc2_w -936584666
    //   17022: l2i
    //   17023: ldc_w 2007390469
    //   17026: ixor
    //   17027: ixor
    //   17028: lookupswitch default -> 20634, -1210296579 -> 17056, 906434960 -> 17011
    //   17056: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   17059: getstatic Perryc.1 : I
    //   17062: ifeq -> 17076
    //   17065: ldc2_w 1914898401
    //   17068: l2i
    //   17069: ldc_w -1611950565
    //   17072: ixor
    //   17073: goto -> 17084
    //   17076: ldc2_w 559573520
    //   17079: l2i
    //   17080: ldc_w -1035575999
    //   17083: ixor
    //   17084: ldc2_w -1952160369
    //   17087: l2i
    //   17088: ldc_w -1758668250
    //   17091: ixor
    //   17092: ixor
    //   17093: lookupswitch default -> 20792, -247452077 -> 17076, -7042824 -> 17120
    //   17120: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   17123: getstatic Perryc.0 : I
    //   17126: ifle -> 17140
    //   17129: ldc2_w -992554682
    //   17132: l2i
    //   17133: ldc_w -1498507090
    //   17136: ixor
    //   17137: goto -> 17148
    //   17140: ldc2_w 947580264
    //   17143: l2i
    //   17144: ldc_w 860931103
    //   17147: ixor
    //   17148: ldc2_w 292227306
    //   17151: l2i
    //   17152: ldc_w -607541862
    //   17155: ixor
    //   17156: ixor
    //   17157: lookupswitch default -> 20734, -1462049640 -> 17140, -1048017913 -> 17184
    //   17184: putfield mode : Lbigname/zprestige/webhack/features/setting/Setting;
    //   17187: getstatic Perryc.c : I
    //   17190: iflt -> 17204
    //   17193: ldc2_w -1562472116
    //   17196: l2i
    //   17197: ldc_w 2095358630
    //   17200: ixor
    //   17201: goto -> 17212
    //   17204: ldc2_w 1675558919
    //   17207: l2i
    //   17208: ldc_w 1852802823
    //   17211: ixor
    //   17212: ldc2_w -876678869
    //   17215: l2i
    //   17216: ldc_w 1235943396
    //   17219: ixor
    //   17220: ixor
    //   17221: lookupswitch default -> 17248, 1248693486 -> 17204, 1546534181 -> 20264
    //   17248: aload_0
    //   17249: getstatic Perryc.1 : I
    //   17252: ifeq -> 17266
    //   17255: ldc2_w -2052062613
    //   17258: l2i
    //   17259: ldc_w 1120226348
    //   17262: ixor
    //   17263: goto -> 17274
    //   17266: ldc2_w -593496006
    //   17269: l2i
    //   17270: ldc_w -525789284
    //   17273: ixor
    //   17274: ldc2_w 836811665
    //   17277: l2i
    //   17278: ldc_w 1973923191
    //   17281: ixor
    //   17282: ixor
    //   17283: lookupswitch default -> 20546, -2093852511 -> 17266, 2020735296 -> 17308
    //   17308: aload_0
    //   17309: new bigname/zprestige/webhack/features/setting/Setting
    //   17312: dup
    //   17313: ldc_w 'ා㌒඄㶼륍๶灕蹭땶ਆ쀹煱慊邉'
    //   17316: getstatic Perryc.1 : I
    //   17319: ifeq -> 17333
    //   17322: ldc2_w 1305800269
    //   17325: l2i
    //   17326: ldc_w -1147941240
    //   17329: ixor
    //   17330: goto -> 17341
    //   17333: ldc2_w -1226867264
    //   17336: l2i
    //   17337: ldc_w 1165796824
    //   17340: ixor
    //   17341: ldc2_w -1305453422
    //   17344: l2i
    //   17345: ldc_w 112147418
    //   17348: ixor
    //   17349: ixor
    //   17350: lookupswitch default -> 20460, 1121470349 -> 17333, 1195163472 -> 17376
    //   17376: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   17379: ldc2_w -1643071135
    //   17382: l2i
    //   17383: ldc_w -1643071039
    //   17386: ixor
    //   17387: getstatic Perryc.0 : I
    //   17390: ifle -> 17404
    //   17393: ldc2_w -636766694
    //   17396: l2i
    //   17397: ldc_w 960133802
    //   17400: ixor
    //   17401: goto -> 17412
    //   17404: ldc2_w 1682807808
    //   17407: l2i
    //   17408: ldc_w 1716178927
    //   17411: ixor
    //   17412: ldc2_w -1548519259
    //   17415: l2i
    //   17416: ldc_w 1881393681
    //   17419: ixor
    //   17420: ixor
    //   17421: lookupswitch default -> 17448, -1120665140 -> 17404, 815889924 -> 20316
    //   17448: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   17451: ldc2_w 41649061
    //   17454: l2i
    //   17455: ldc_w 41649061
    //   17458: ixor
    //   17459: getstatic Perryc.1 : I
    //   17462: ifeq -> 17476
    //   17465: ldc2_w -830496505
    //   17468: l2i
    //   17469: ldc_w 452764193
    //   17472: ixor
    //   17473: goto -> 17484
    //   17476: ldc2_w -1270601313
    //   17479: l2i
    //   17480: ldc_w 1901438715
    //   17483: ixor
    //   17484: ldc2_w 883499018
    //   17487: l2i
    //   17488: ldc_w 1384450093
    //   17491: ixor
    //   17492: ixor
    //   17493: lookupswitch default -> 17520, -1297143039 -> 20704, -628425924 -> 17476
    //   17520: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   17523: ldc2_w -608895980
    //   17526: l2i
    //   17527: ldc_w -608895765
    //   17530: ixor
    //   17531: getstatic Perryc.c : I
    //   17534: iflt -> 17548
    //   17537: ldc2_w -500451160
    //   17540: l2i
    //   17541: ldc_w -126693398
    //   17544: ixor
    //   17545: goto -> 17556
    //   17548: ldc2_w 744144773
    //   17551: l2i
    //   17552: ldc_w 1848763483
    //   17555: ixor
    //   17556: ldc2_w 1846223209
    //   17559: l2i
    //   17560: ldc_w 1021498416
    //   17563: ixor
    //   17564: ixor
    //   17565: lookupswitch default -> 17592, -1306883875 -> 17548, 1219527195 -> 20462
    //   17592: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   17595: getstatic Perryc.1 : I
    //   17598: ifeq -> 17612
    //   17601: ldc2_w 1004385140
    //   17604: l2i
    //   17605: ldc_w 1740773115
    //   17608: ixor
    //   17609: goto -> 17620
    //   17612: ldc2_w -644568863
    //   17615: l2i
    //   17616: ldc_w 656337953
    //   17619: ixor
    //   17620: ldc2_w -1744057036
    //   17623: l2i
    //   17624: ldc_w 1448696718
    //   17627: ixor
    //   17628: ixor
    //   17629: lookupswitch default -> 20854, -1840434379 -> 17612, 819516026 -> 17656
    //   17656: aload_0
    //   17657: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   17662: getstatic Perryc.c : I
    //   17665: iflt -> 17679
    //   17668: ldc2_w -123258098
    //   17671: l2i
    //   17672: ldc_w -2065364445
    //   17675: ixor
    //   17676: goto -> 17687
    //   17679: ldc2_w 1750578039
    //   17682: l2i
    //   17683: ldc_w -1357369927
    //   17686: ixor
    //   17687: ldc2_w 501752731
    //   17690: l2i
    //   17691: ldc_w 817477207
    //   17694: ixor
    //   17695: ixor
    //   17696: lookupswitch default -> 17724, 942531672 -> 17679, 1360241889 -> 20804
    //   17724: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   17727: getstatic Perryc.1 : I
    //   17730: ifeq -> 17744
    //   17733: ldc2_w 1475096961
    //   17736: l2i
    //   17737: ldc_w 1641579484
    //   17740: ixor
    //   17741: goto -> 17752
    //   17744: ldc2_w 296019767
    //   17747: l2i
    //   17748: ldc_w 360565381
    //   17751: ixor
    //   17752: ldc2_w 1892576064
    //   17755: l2i
    //   17756: ldc_w 126191339
    //   17759: ixor
    //   17760: ixor
    //   17761: lookupswitch default -> 17788, 1098866678 -> 20332, 1139970228 -> 17744
    //   17788: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   17791: getstatic Perryc.1 : I
    //   17794: ifeq -> 17808
    //   17797: ldc2_w 1424358455
    //   17800: l2i
    //   17801: ldc_w 1046966544
    //   17804: ixor
    //   17805: goto -> 17816
    //   17808: ldc2_w 386866851
    //   17811: l2i
    //   17812: ldc_w 1594231747
    //   17815: ixor
    //   17816: ldc2_w 1862605112
    //   17819: l2i
    //   17820: ldc_w -862869218
    //   17823: ixor
    //   17824: ixor
    //   17825: lookupswitch default -> 17852, -921289471 -> 20356, -226567226 -> 17808
    //   17852: putfield backgroundAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   17855: getstatic Perryc.0 : I
    //   17858: ifle -> 17872
    //   17861: ldc2_w 682163259
    //   17864: l2i
    //   17865: ldc_w -1880393905
    //   17868: ixor
    //   17869: goto -> 17880
    //   17872: ldc2_w -1025348065
    //   17875: l2i
    //   17876: ldc_w -1551888423
    //   17879: ixor
    //   17880: ldc2_w 1596332709
    //   17883: l2i
    //   17884: ldc_w -1857575255
    //   17887: ixor
    //   17888: ixor
    //   17889: lookupswitch default -> 20346, -1358701110 -> 17916, 1763850104 -> 17872
    //   17916: aload_0
    //   17917: getstatic Perryc.1 : I
    //   17920: ifeq -> 17934
    //   17923: ldc2_w 1589314607
    //   17926: l2i
    //   17927: ldc_w 288274324
    //   17930: ixor
    //   17931: goto -> 17942
    //   17934: ldc2_w -1623299449
    //   17937: l2i
    //   17938: ldc_w 1103437978
    //   17941: ixor
    //   17942: ldc2_w 798985706
    //   17945: l2i
    //   17946: ldc_w 1037469593
    //   17949: ixor
    //   17950: ixor
    //   17951: lookupswitch default -> 17976, -2117780441 -> 17934, 1574746568 -> 20252
    //   17976: aload_0
    //   17977: new bigname/zprestige/webhack/features/setting/Setting
    //   17980: dup
    //   17981: ldc_w 'ෟ㌖ඃ'
    //   17984: getstatic Perryc.c : I
    //   17987: iflt -> 18001
    //   17990: ldc2_w 768453901
    //   17993: l2i
    //   17994: ldc_w 1508033422
    //   17997: ixor
    //   17998: goto -> 18009
    //   18001: ldc2_w 1495811140
    //   18004: l2i
    //   18005: ldc_w -1862458533
    //   18008: ixor
    //   18009: ldc2_w 371375027
    //   18012: l2i
    //   18013: ldc_w -285683444
    //   18016: ixor
    //   18017: ixor
    //   18018: lookupswitch default -> 18044, -1930099652 -> 20276, -49075374 -> 18001
    //   18044: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   18047: ldc2_w -754467635
    //   18050: l2i
    //   18051: ldc_w -754467623
    //   18054: ixor
    //   18055: getstatic Perryc.0 : I
    //   18058: ifle -> 18072
    //   18061: ldc2_w 1835799454
    //   18064: l2i
    //   18065: ldc_w 1224275945
    //   18068: ixor
    //   18069: goto -> 18080
    //   18072: ldc2_w 1649672810
    //   18075: l2i
    //   18076: ldc_w 1203779920
    //   18079: ixor
    //   18080: ldc2_w 994390785
    //   18083: l2i
    //   18084: ldc_w -998170980
    //   18087: ixor
    //   18088: ixor
    //   18089: lookupswitch default -> 18116, -632239638 -> 20586, 1235259599 -> 18072
    //   18116: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   18119: ldc2_w -1674904405
    //   18122: l2i
    //   18123: ldc_w -1674904405
    //   18126: ixor
    //   18127: getstatic Perryc.1 : I
    //   18130: ifeq -> 18144
    //   18133: ldc2_w 1686359438
    //   18136: l2i
    //   18137: ldc_w -1217726367
    //   18140: ixor
    //   18141: goto -> 18152
    //   18144: ldc2_w -1827543373
    //   18147: l2i
    //   18148: ldc_w 1938431647
    //   18151: ixor
    //   18152: ldc2_w -77487393
    //   18155: l2i
    //   18156: ldc_w 1956544813
    //   18159: ixor
    //   18160: ixor
    //   18161: lookupswitch default -> 20402, 1544951325 -> 18144, 1868880862 -> 18188
    //   18188: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   18191: ldc2_w -1012698569
    //   18194: l2i
    //   18195: ldc_w -1012698424
    //   18198: ixor
    //   18199: getstatic Perryc.0 : I
    //   18202: ifle -> 18216
    //   18205: ldc2_w 1527683047
    //   18208: l2i
    //   18209: ldc_w 1620448512
    //   18212: ixor
    //   18213: goto -> 18224
    //   18216: ldc2_w 1297358448
    //   18219: l2i
    //   18220: ldc_w -778289015
    //   18223: ixor
    //   18224: ldc2_w -1615902448
    //   18227: l2i
    //   18228: ldc_w 934999456
    //   18231: ixor
    //   18232: ixor
    //   18233: lookupswitch default -> 20652, -1819460009 -> 18216, 886956617 -> 18260
    //   18260: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   18263: getstatic Perryc.1 : I
    //   18266: ifeq -> 18280
    //   18269: ldc2_w 631841618
    //   18272: l2i
    //   18273: ldc_w -610784567
    //   18276: ixor
    //   18277: goto -> 18288
    //   18280: ldc2_w 864528349
    //   18283: l2i
    //   18284: ldc_w 111038266
    //   18287: ixor
    //   18288: ldc2_w 1654776713
    //   18291: l2i
    //   18292: ldc_w -1192283500
    //   18295: ixor
    //   18296: ixor
    //   18297: lookupswitch default -> 20424, -279496198 -> 18324, 612358278 -> 18280
    //   18324: aload_0
    //   18325: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   18330: getstatic Perryc.0 : I
    //   18333: ifle -> 18347
    //   18336: ldc2_w -1037345475
    //   18339: l2i
    //   18340: ldc_w -2100607757
    //   18343: ixor
    //   18344: goto -> 18355
    //   18347: ldc2_w -1396039314
    //   18350: l2i
    //   18351: ldc_w 1491968623
    //   18354: ixor
    //   18355: ldc2_w -970239212
    //   18358: l2i
    //   18359: ldc_w -427341962
    //   18362: ixor
    //   18363: ixor
    //   18364: lookupswitch default -> 20616, -729049245 -> 18392, 1615596972 -> 18347
    //   18392: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   18395: getstatic Perryc.0 : I
    //   18398: ifle -> 18412
    //   18401: ldc2_w 2027412872
    //   18404: l2i
    //   18405: ldc_w -51528492
    //   18408: ixor
    //   18409: goto -> 18420
    //   18412: ldc2_w 1404708750
    //   18415: l2i
    //   18416: ldc_w -888933028
    //   18419: ixor
    //   18420: ldc2_w 1857103628
    //   18423: l2i
    //   18424: ldc_w -1782800522
    //   18427: ixor
    //   18428: ixor
    //   18429: lookupswitch default -> 18456, 1059489838 -> 18412, 2134366502 -> 20504
    //   18456: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   18459: getstatic Perryc.1 : I
    //   18462: ifeq -> 18476
    //   18465: ldc2_w 1775036717
    //   18468: l2i
    //   18469: ldc_w 1242131388
    //   18472: ixor
    //   18473: goto -> 18484
    //   18476: ldc2_w -924807334
    //   18479: l2i
    //   18480: ldc_w 1522596717
    //   18483: ixor
    //   18484: ldc2_w 609208202
    //   18487: l2i
    //   18488: ldc_w -95934166
    //   18491: ixor
    //   18492: ixor
    //   18493: lookupswitch default -> 20494, -37589967 -> 18476, 1277663895 -> 18520
    //   18520: putfield gb_red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   18523: getstatic Perryc.c : I
    //   18526: iflt -> 18540
    //   18529: ldc2_w -1160434643
    //   18532: l2i
    //   18533: ldc_w -460610515
    //   18536: ixor
    //   18537: goto -> 18548
    //   18540: ldc2_w 1907792724
    //   18543: l2i
    //   18544: ldc_w -331066938
    //   18547: ixor
    //   18548: ldc2_w 278169124
    //   18551: l2i
    //   18552: ldc_w 597313897
    //   18555: ixor
    //   18556: ixor
    //   18557: lookupswitch default -> 20574, -1359215137 -> 18584, 1833977677 -> 18540
    //   18584: aload_0
    //   18585: getstatic Perryc.c : I
    //   18588: iflt -> 18602
    //   18591: ldc2_w -1660484814
    //   18594: l2i
    //   18595: ldc_w -17507617
    //   18598: ixor
    //   18599: goto -> 18610
    //   18602: ldc2_w 794856993
    //   18605: l2i
    //   18606: ldc_w -1494894810
    //   18609: ixor
    //   18610: ldc2_w -1489234230
    //   18613: l2i
    //   18614: ldc_w 356794205
    //   18617: ixor
    //   18618: ixor
    //   18619: lookupswitch default -> 18644, -779358086 -> 20722, 1229478010 -> 18602
    //   18644: aload_0
    //   18645: new bigname/zprestige/webhack/features/setting/Setting
    //   18648: dup
    //   18649: ldc_w '්㌁ං㶲륄'
    //   18652: getstatic Perryc.0 : I
    //   18655: ifle -> 18669
    //   18658: ldc2_w -1551541706
    //   18661: l2i
    //   18662: ldc_w 691806673
    //   18665: ixor
    //   18666: goto -> 18677
    //   18669: ldc2_w -1247395434
    //   18672: l2i
    //   18673: ldc_w -2108068954
    //   18676: ixor
    //   18677: ldc2_w -1300927242
    //   18680: l2i
    //   18681: ldc_w -1282357942
    //   18684: ixor
    //   18685: ixor
    //   18686: lookupswitch default -> 20794, -1956851109 -> 18669, 907707276 -> 18712
    //   18712: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   18715: ldc2_w -1073877158
    //   18718: l2i
    //   18719: ldc_w -1073877170
    //   18722: ixor
    //   18723: getstatic Perryc.1 : I
    //   18726: ifeq -> 18740
    //   18729: ldc2_w 1627481709
    //   18732: l2i
    //   18733: ldc_w 329363535
    //   18736: ixor
    //   18737: goto -> 18748
    //   18740: ldc2_w 6000881
    //   18743: l2i
    //   18744: ldc_w -611775874
    //   18747: ixor
    //   18748: ldc2_w 1772439539
    //   18751: l2i
    //   18752: ldc_w -1252596354
    //   18755: ixor
    //   18756: ixor
    //   18757: lookupswitch default -> 20618, -1370262353 -> 18740, 119617538 -> 18784
    //   18784: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   18787: ldc2_w 806419465
    //   18790: l2i
    //   18791: ldc_w 806419465
    //   18794: ixor
    //   18795: getstatic Perryc.0 : I
    //   18798: ifle -> 18812
    //   18801: ldc2_w 100862834
    //   18804: l2i
    //   18805: ldc_w -1245803904
    //   18808: ixor
    //   18809: goto -> 18820
    //   18812: ldc2_w -1993401502
    //   18815: l2i
    //   18816: ldc_w 597400847
    //   18819: ixor
    //   18820: ldc2_w -1264883183
    //   18823: l2i
    //   18824: ldc_w 1811141800
    //   18827: ixor
    //   18828: ixor
    //   18829: lookupswitch default -> 18856, -1370689285 -> 18812, 1825914699 -> 20590
    //   18856: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   18859: ldc2_w 668214797
    //   18862: l2i
    //   18863: ldc_w 668215026
    //   18866: ixor
    //   18867: getstatic Perryc.0 : I
    //   18870: ifle -> 18884
    //   18873: ldc2_w -1662366514
    //   18876: l2i
    //   18877: ldc_w 1833829800
    //   18880: ixor
    //   18881: goto -> 18892
    //   18884: ldc2_w 694154805
    //   18887: l2i
    //   18888: ldc_w 1331802333
    //   18891: ixor
    //   18892: ldc2_w -340138066
    //   18895: l2i
    //   18896: ldc_w 258036676
    //   18899: ixor
    //   18900: ixor
    //   18901: lookupswitch default -> 20748, -2098793854 -> 18928, 360512780 -> 18884
    //   18928: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   18931: getstatic Perryc.c : I
    //   18934: iflt -> 18948
    //   18937: ldc2_w -1246842795
    //   18940: l2i
    //   18941: ldc_w 1030994783
    //   18944: ixor
    //   18945: goto -> 18956
    //   18948: ldc2_w -1618112610
    //   18951: l2i
    //   18952: ldc_w -1030304655
    //   18955: ixor
    //   18956: ldc2_w -1324252927
    //   18959: l2i
    //   18960: ldc_w -1468244775
    //   18963: ixor
    //   18964: ixor
    //   18965: lookupswitch default -> 20614, -1850681646 -> 18948, 1148624439 -> 18992
    //   18992: aload_0
    //   18993: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   18998: getstatic Perryc.0 : I
    //   19001: ifle -> 19015
    //   19004: ldc2_w -66174922
    //   19007: l2i
    //   19008: ldc_w 243042030
    //   19011: ixor
    //   19012: goto -> 19023
    //   19015: ldc2_w 575272746
    //   19018: l2i
    //   19019: ldc_w 2087360675
    //   19022: ixor
    //   19023: ldc2_w 446754124
    //   19026: l2i
    //   19027: ldc_w 1363692328
    //   19030: ixor
    //   19031: ixor
    //   19032: lookupswitch default -> 20418, -1181065028 -> 19015, 365677037 -> 19060
    //   19060: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   19063: getstatic Perryc.0 : I
    //   19066: ifle -> 19080
    //   19069: ldc2_w -512988334
    //   19072: l2i
    //   19073: ldc_w -148973354
    //   19076: ixor
    //   19077: goto -> 19088
    //   19080: ldc2_w 577781980
    //   19083: l2i
    //   19084: ldc_w -1555423992
    //   19087: ixor
    //   19088: ldc2_w -366866624
    //   19091: l2i
    //   19092: ldc_w 25135995
    //   19095: ixor
    //   19096: ixor
    //   19097: lookupswitch default -> 19124, -790534455 -> 19080, -47237185 -> 20376
    //   19124: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   19127: getstatic Perryc.0 : I
    //   19130: ifle -> 19144
    //   19133: ldc2_w 1218965263
    //   19136: l2i
    //   19137: ldc_w -2005339944
    //   19140: ixor
    //   19141: goto -> 19152
    //   19144: ldc2_w -2037520428
    //   19147: l2i
    //   19148: ldc_w 1321388529
    //   19151: ixor
    //   19152: ldc2_w -462507253
    //   19155: l2i
    //   19156: ldc_w 763541969
    //   19159: ixor
    //   19160: ixor
    //   19161: lookupswitch default -> 19188, -274294933 -> 19144, 154342669 -> 20640
    //   19188: putfield gb_green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   19191: getstatic Perryc.0 : I
    //   19194: ifle -> 19208
    //   19197: ldc2_w 577811704
    //   19200: l2i
    //   19201: ldc_w 497654902
    //   19204: ixor
    //   19205: goto -> 19216
    //   19208: ldc2_w 984197157
    //   19211: l2i
    //   19212: ldc_w -1973779899
    //   19215: ixor
    //   19216: ldc2_w -119331554
    //   19219: l2i
    //   19220: ldc_w 1282745080
    //   19223: ixor
    //   19224: ixor
    //   19225: lookupswitch default -> 19252, -1957744792 -> 20348, -1099231503 -> 19208
    //   19252: aload_0
    //   19253: getstatic Perryc.0 : I
    //   19256: ifle -> 19270
    //   19259: ldc2_w 687570876
    //   19262: l2i
    //   19263: ldc_w 2028876602
    //   19266: ixor
    //   19267: goto -> 19278
    //   19270: ldc2_w -2106994334
    //   19273: l2i
    //   19274: ldc_w 907663279
    //   19277: ixor
    //   19278: ldc2_w 592995986
    //   19281: l2i
    //   19282: ldc_w 667324154
    //   19285: ixor
    //   19286: ixor
    //   19287: lookupswitch default -> 20796, -1326518619 -> 19312, 1418437870 -> 19270
    //   19312: aload_0
    //   19313: new bigname/zprestige/webhack/features/setting/Setting
    //   19316: dup
    //   19317: ldc_w 'ා㌟ඒ㶲'
    //   19320: getstatic Perryc.c : I
    //   19323: iflt -> 19337
    //   19326: ldc2_w -1333435591
    //   19329: l2i
    //   19330: ldc_w -2004956244
    //   19333: ixor
    //   19334: goto -> 19345
    //   19337: ldc2_w -1774407476
    //   19340: l2i
    //   19341: ldc_w 1738408038
    //   19344: ixor
    //   19345: ldc2_w 1135693514
    //   19348: l2i
    //   19349: ldc_w 1700041741
    //   19352: ixor
    //   19353: ixor
    //   19354: lookupswitch default -> 19380, -2142619027 -> 19337, 505311826 -> 20706
    //   19380: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   19383: ldc2_w -1208186328
    //   19386: l2i
    //   19387: ldc_w -1208186308
    //   19390: ixor
    //   19391: getstatic Perryc.c : I
    //   19394: iflt -> 19408
    //   19397: ldc2_w 165294107
    //   19400: l2i
    //   19401: ldc_w 1469172722
    //   19404: ixor
    //   19405: goto -> 19416
    //   19408: ldc2_w -453690842
    //   19411: l2i
    //   19412: ldc_w -1317450340
    //   19415: ixor
    //   19416: ldc2_w -995111752
    //   19419: l2i
    //   19420: ldc_w 736424350
    //   19423: ixor
    //   19424: ixor
    //   19425: lookupswitch default -> 19452, -1325349169 -> 20292, 12861236 -> 19408
    //   19452: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   19455: ldc2_w 1919214986
    //   19458: l2i
    //   19459: ldc_w 1919214986
    //   19462: ixor
    //   19463: getstatic Perryc.1 : I
    //   19466: ifeq -> 19480
    //   19469: ldc2_w -1643963844
    //   19472: l2i
    //   19473: ldc_w 337058659
    //   19476: ixor
    //   19477: goto -> 19488
    //   19480: ldc2_w 918883885
    //   19483: l2i
    //   19484: ldc_w 784388877
    //   19487: ixor
    //   19488: ldc2_w 1690936957
    //   19491: l2i
    //   19492: ldc_w 636780034
    //   19495: ixor
    //   19496: ixor
    //   19497: lookupswitch default -> 19524, -886449888 -> 20672, 1589248367 -> 19480
    //   19524: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   19527: ldc2_w 563215025
    //   19530: l2i
    //   19531: ldc_w 563214926
    //   19534: ixor
    //   19535: getstatic Perryc.1 : I
    //   19538: ifeq -> 19552
    //   19541: ldc2_w 1622469448
    //   19544: l2i
    //   19545: ldc_w -1653247277
    //   19548: ixor
    //   19549: goto -> 19560
    //   19552: ldc2_w 1485570741
    //   19555: l2i
    //   19556: ldc_w 1967425008
    //   19559: ixor
    //   19560: ldc2_w -1067650243
    //   19563: l2i
    //   19564: ldc_w -948902649
    //   19567: ixor
    //   19568: ixor
    //   19569: lookupswitch default -> 20596, -85094495 -> 19552, 719622527 -> 19596
    //   19596: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   19599: getstatic Perryc.0 : I
    //   19602: ifle -> 19616
    //   19605: ldc2_w 1318581079
    //   19608: l2i
    //   19609: ldc_w -560209015
    //   19612: ixor
    //   19613: goto -> 19624
    //   19616: ldc2_w 638861313
    //   19619: l2i
    //   19620: ldc_w -631213207
    //   19623: ixor
    //   19624: ldc2_w -1398699741
    //   19627: l2i
    //   19628: ldc_w 352128541
    //   19631: ixor
    //   19632: ixor
    //   19633: lookupswitch default -> 20612, 676370400 -> 19616, 1143518294 -> 19660
    //   19660: aload_0
    //   19661: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Client/ClickGui;)Ljava/util/function/Predicate;
    //   19666: getstatic Perryc.0 : I
    //   19669: ifle -> 19683
    //   19672: ldc2_w -1204745463
    //   19675: l2i
    //   19676: ldc_w 1959452890
    //   19679: ixor
    //   19680: goto -> 19691
    //   19683: ldc2_w -1351448288
    //   19686: l2i
    //   19687: ldc_w -1428675288
    //   19690: ixor
    //   19691: ldc2_w 948993200
    //   19694: l2i
    //   19695: ldc_w 2082775363
    //   19698: ixor
    //   19699: ixor
    //   19700: lookupswitch default -> 19728, -2008074720 -> 20724, 372561058 -> 19683
    //   19728: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   19731: getstatic Perryc.1 : I
    //   19734: ifeq -> 19748
    //   19737: ldc2_w 821652687
    //   19740: l2i
    //   19741: ldc_w -933391500
    //   19744: ixor
    //   19745: goto -> 19756
    //   19748: ldc2_w -1874067696
    //   19751: l2i
    //   19752: ldc_w -1512928503
    //   19755: ixor
    //   19756: ldc2_w 643840487
    //   19759: l2i
    //   19760: ldc_w 1351910389
    //   19763: ixor
    //   19764: ixor
    //   19765: lookupswitch default -> 19792, -1907341911 -> 20406, 842107124 -> 19748
    //   19792: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   19795: getstatic Perryc.1 : I
    //   19798: ifeq -> 19812
    //   19801: ldc2_w 1932544234
    //   19804: l2i
    //   19805: ldc_w 2083098523
    //   19808: ixor
    //   19809: goto -> 19820
    //   19812: ldc2_w -1252444415
    //   19815: l2i
    //   19816: ldc_w 667328607
    //   19819: ixor
    //   19820: ldc2_w 1962313285
    //   19823: l2i
    //   19824: ldc_w 1354179635
    //   19827: ixor
    //   19828: ixor
    //   19829: lookupswitch default -> 19856, -904933248 -> 19812, 727213319 -> 20250
    //   19856: putfield gb_blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   19859: getstatic Perryc.0 : I
    //   19862: ifle -> 19876
    //   19865: ldc2_w 435053988
    //   19868: l2i
    //   19869: ldc_w -1519180166
    //   19872: ixor
    //   19873: goto -> 19884
    //   19876: ldc2_w -245409320
    //   19879: l2i
    //   19880: ldc_w 284550775
    //   19883: ixor
    //   19884: ldc2_w 1737559860
    //   19887: l2i
    //   19888: ldc_w -47197162
    //   19891: ixor
    //   19892: ixor
    //   19893: lookupswitch default -> 19920, 639867132 -> 20468, 1850108048 -> 19876
    //   19920: aload_0
    //   19921: ldc2_w 614784108
    //   19924: l2i
    //   19925: ldc_w 614784116
    //   19928: ixor
    //   19929: getstatic Perryc.1 : I
    //   19932: ifeq -> 19946
    //   19935: ldc2_w 522776714
    //   19938: l2i
    //   19939: ldc_w 1029220093
    //   19942: ixor
    //   19943: goto -> 19954
    //   19946: ldc2_w 698993133
    //   19949: l2i
    //   19950: ldc_w 2064736416
    //   19953: ixor
    //   19954: ldc2_w -1361058700
    //   19957: l2i
    //   19958: ldc_w 1930150758
    //   19961: ixor
    //   19962: ixor
    //   19963: lookupswitch default -> 19988, -792120915 -> 19946, -6000283 -> 20766
    //   19988: invokevirtual setBind : (I)V
    //   19991: getstatic Perryc.0 : I
    //   19994: ifle -> 20008
    //   19997: ldc2_w 613414500
    //   20000: l2i
    //   20001: ldc_w 292831314
    //   20004: ixor
    //   20005: goto -> 20016
    //   20008: ldc2_w 464691093
    //   20011: l2i
    //   20012: ldc_w -1513108294
    //   20015: ixor
    //   20016: ldc2_w 1088235749
    //   20019: l2i
    //   20020: ldc_w -167566515
    //   20023: ixor
    //   20024: ixor
    //   20025: lookupswitch default -> 20780, -2094678626 -> 20008, 144922759 -> 20052
    //   20052: aload_0
    //   20053: ldc2_w 1878677270
    //   20056: l2i
    //   20057: ldc_w 1878677270
    //   20060: ixor
    //   20061: getstatic Perryc.0 : I
    //   20064: ifle -> 20078
    //   20067: ldc2_w -1992260027
    //   20070: l2i
    //   20071: ldc_w 1803256633
    //   20074: ixor
    //   20075: goto -> 20086
    //   20078: ldc2_w 832045623
    //   20081: l2i
    //   20082: ldc_w 1214218732
    //   20085: ixor
    //   20086: ldc2_w 914899595
    //   20089: l2i
    //   20090: ldc_w 680889634
    //   20093: ixor
    //   20094: ixor
    //   20095: lookupswitch default -> 20294, -64566571 -> 20078, 1742359666 -> 20120
    //   20120: invokevirtual setDrawn : (Z)V
    //   20123: getstatic Perryc.1 : I
    //   20126: ifeq -> 20140
    //   20129: ldc2_w -967904066
    //   20132: l2i
    //   20133: ldc_w 1217124703
    //   20136: ixor
    //   20137: goto -> 20148
    //   20140: ldc2_w -1332155379
    //   20143: l2i
    //   20144: ldc_w -199875104
    //   20147: ixor
    //   20148: ldc2_w -935945066
    //   20151: l2i
    //   20152: ldc_w -756869987
    //   20155: ixor
    //   20156: ixor
    //   20157: lookupswitch default -> 20184, -1810848278 -> 20458, -955257614 -> 20140
    //   20184: aload_0
    //   20185: getstatic Perryc.1 : I
    //   20188: ifeq -> 20202
    //   20191: ldc2_w -775585474
    //   20194: l2i
    //   20195: ldc_w -1628938124
    //   20198: ixor
    //   20199: goto -> 20210
    //   20202: ldc2_w 174756925
    //   20205: l2i
    //   20206: ldc_w 1724832754
    //   20209: ixor
    //   20210: ldc2_w -860114605
    //   20213: l2i
    //   20214: ldc_w 632129562
    //   20217: ixor
    //   20218: ixor
    //   20219: lookupswitch default -> 20746, -2051901818 -> 20244, -1506027517 -> 20202
    //   20244: invokespecial setInstance : ()V
    //   20247: return
    //   20248: aconst_null
    //   20249: athrow
    //   20250: aconst_null
    //   20251: athrow
    //   20252: aconst_null
    //   20253: athrow
    //   20254: aconst_null
    //   20255: athrow
    //   20256: aconst_null
    //   20257: athrow
    //   20258: aconst_null
    //   20259: athrow
    //   20260: aconst_null
    //   20261: athrow
    //   20262: aconst_null
    //   20263: athrow
    //   20264: aconst_null
    //   20265: athrow
    //   20266: aconst_null
    //   20267: athrow
    //   20268: aconst_null
    //   20269: athrow
    //   20270: aconst_null
    //   20271: athrow
    //   20272: aconst_null
    //   20273: athrow
    //   20274: aconst_null
    //   20275: athrow
    //   20276: aconst_null
    //   20277: athrow
    //   20278: aconst_null
    //   20279: athrow
    //   20280: aconst_null
    //   20281: athrow
    //   20282: aconst_null
    //   20283: athrow
    //   20284: aconst_null
    //   20285: athrow
    //   20286: aconst_null
    //   20287: athrow
    //   20288: aconst_null
    //   20289: athrow
    //   20290: aconst_null
    //   20291: athrow
    //   20292: aconst_null
    //   20293: athrow
    //   20294: aconst_null
    //   20295: athrow
    //   20296: aconst_null
    //   20297: athrow
    //   20298: aconst_null
    //   20299: athrow
    //   20300: aconst_null
    //   20301: athrow
    //   20302: aconst_null
    //   20303: athrow
    //   20304: aconst_null
    //   20305: athrow
    //   20306: aconst_null
    //   20307: athrow
    //   20308: aconst_null
    //   20309: athrow
    //   20310: aconst_null
    //   20311: athrow
    //   20312: aconst_null
    //   20313: athrow
    //   20314: aconst_null
    //   20315: athrow
    //   20316: aconst_null
    //   20317: athrow
    //   20318: aconst_null
    //   20319: athrow
    //   20320: aconst_null
    //   20321: athrow
    //   20322: aconst_null
    //   20323: athrow
    //   20324: aconst_null
    //   20325: athrow
    //   20326: aconst_null
    //   20327: athrow
    //   20328: aconst_null
    //   20329: athrow
    //   20330: aconst_null
    //   20331: athrow
    //   20332: aconst_null
    //   20333: athrow
    //   20334: aconst_null
    //   20335: athrow
    //   20336: aconst_null
    //   20337: athrow
    //   20338: aconst_null
    //   20339: athrow
    //   20340: aconst_null
    //   20341: athrow
    //   20342: aconst_null
    //   20343: athrow
    //   20344: aconst_null
    //   20345: athrow
    //   20346: aconst_null
    //   20347: athrow
    //   20348: aconst_null
    //   20349: athrow
    //   20350: aconst_null
    //   20351: athrow
    //   20352: aconst_null
    //   20353: athrow
    //   20354: aconst_null
    //   20355: athrow
    //   20356: aconst_null
    //   20357: athrow
    //   20358: aconst_null
    //   20359: athrow
    //   20360: aconst_null
    //   20361: athrow
    //   20362: aconst_null
    //   20363: athrow
    //   20364: aconst_null
    //   20365: athrow
    //   20366: aconst_null
    //   20367: athrow
    //   20368: aconst_null
    //   20369: athrow
    //   20370: aconst_null
    //   20371: athrow
    //   20372: aconst_null
    //   20373: athrow
    //   20374: aconst_null
    //   20375: athrow
    //   20376: aconst_null
    //   20377: athrow
    //   20378: aconst_null
    //   20379: athrow
    //   20380: aconst_null
    //   20381: athrow
    //   20382: aconst_null
    //   20383: athrow
    //   20384: aconst_null
    //   20385: athrow
    //   20386: aconst_null
    //   20387: athrow
    //   20388: aconst_null
    //   20389: athrow
    //   20390: aconst_null
    //   20391: athrow
    //   20392: aconst_null
    //   20393: athrow
    //   20394: aconst_null
    //   20395: athrow
    //   20396: aconst_null
    //   20397: athrow
    //   20398: aconst_null
    //   20399: athrow
    //   20400: aconst_null
    //   20401: athrow
    //   20402: aconst_null
    //   20403: athrow
    //   20404: aconst_null
    //   20405: athrow
    //   20406: aconst_null
    //   20407: athrow
    //   20408: aconst_null
    //   20409: athrow
    //   20410: aconst_null
    //   20411: athrow
    //   20412: aconst_null
    //   20413: athrow
    //   20414: aconst_null
    //   20415: athrow
    //   20416: aconst_null
    //   20417: athrow
    //   20418: aconst_null
    //   20419: athrow
    //   20420: aconst_null
    //   20421: athrow
    //   20422: aconst_null
    //   20423: athrow
    //   20424: aconst_null
    //   20425: athrow
    //   20426: aconst_null
    //   20427: athrow
    //   20428: aconst_null
    //   20429: athrow
    //   20430: aconst_null
    //   20431: athrow
    //   20432: aconst_null
    //   20433: athrow
    //   20434: aconst_null
    //   20435: athrow
    //   20436: aconst_null
    //   20437: athrow
    //   20438: aconst_null
    //   20439: athrow
    //   20440: aconst_null
    //   20441: athrow
    //   20442: aconst_null
    //   20443: athrow
    //   20444: aconst_null
    //   20445: athrow
    //   20446: aconst_null
    //   20447: athrow
    //   20448: aconst_null
    //   20449: athrow
    //   20450: aconst_null
    //   20451: athrow
    //   20452: aconst_null
    //   20453: athrow
    //   20454: aconst_null
    //   20455: athrow
    //   20456: aconst_null
    //   20457: athrow
    //   20458: aconst_null
    //   20459: athrow
    //   20460: aconst_null
    //   20461: athrow
    //   20462: aconst_null
    //   20463: athrow
    //   20464: aconst_null
    //   20465: athrow
    //   20466: aconst_null
    //   20467: athrow
    //   20468: aconst_null
    //   20469: athrow
    //   20470: aconst_null
    //   20471: athrow
    //   20472: aconst_null
    //   20473: athrow
    //   20474: aconst_null
    //   20475: athrow
    //   20476: aconst_null
    //   20477: athrow
    //   20478: aconst_null
    //   20479: athrow
    //   20480: aconst_null
    //   20481: athrow
    //   20482: aconst_null
    //   20483: athrow
    //   20484: aconst_null
    //   20485: athrow
    //   20486: aconst_null
    //   20487: athrow
    //   20488: aconst_null
    //   20489: athrow
    //   20490: aconst_null
    //   20491: athrow
    //   20492: aconst_null
    //   20493: athrow
    //   20494: aconst_null
    //   20495: athrow
    //   20496: aconst_null
    //   20497: athrow
    //   20498: aconst_null
    //   20499: athrow
    //   20500: aconst_null
    //   20501: athrow
    //   20502: aconst_null
    //   20503: athrow
    //   20504: aconst_null
    //   20505: athrow
    //   20506: aconst_null
    //   20507: athrow
    //   20508: aconst_null
    //   20509: athrow
    //   20510: aconst_null
    //   20511: athrow
    //   20512: aconst_null
    //   20513: athrow
    //   20514: aconst_null
    //   20515: athrow
    //   20516: aconst_null
    //   20517: athrow
    //   20518: aconst_null
    //   20519: athrow
    //   20520: aconst_null
    //   20521: athrow
    //   20522: aconst_null
    //   20523: athrow
    //   20524: aconst_null
    //   20525: athrow
    //   20526: aconst_null
    //   20527: athrow
    //   20528: aconst_null
    //   20529: athrow
    //   20530: aconst_null
    //   20531: athrow
    //   20532: aconst_null
    //   20533: athrow
    //   20534: aconst_null
    //   20535: athrow
    //   20536: aconst_null
    //   20537: athrow
    //   20538: aconst_null
    //   20539: athrow
    //   20540: aconst_null
    //   20541: athrow
    //   20542: aconst_null
    //   20543: athrow
    //   20544: aconst_null
    //   20545: athrow
    //   20546: aconst_null
    //   20547: athrow
    //   20548: aconst_null
    //   20549: athrow
    //   20550: aconst_null
    //   20551: athrow
    //   20552: aconst_null
    //   20553: athrow
    //   20554: aconst_null
    //   20555: athrow
    //   20556: aconst_null
    //   20557: athrow
    //   20558: aconst_null
    //   20559: athrow
    //   20560: aconst_null
    //   20561: athrow
    //   20562: aconst_null
    //   20563: athrow
    //   20564: aconst_null
    //   20565: athrow
    //   20566: aconst_null
    //   20567: athrow
    //   20568: aconst_null
    //   20569: athrow
    //   20570: aconst_null
    //   20571: athrow
    //   20572: aconst_null
    //   20573: athrow
    //   20574: aconst_null
    //   20575: athrow
    //   20576: aconst_null
    //   20577: athrow
    //   20578: aconst_null
    //   20579: athrow
    //   20580: aconst_null
    //   20581: athrow
    //   20582: aconst_null
    //   20583: athrow
    //   20584: aconst_null
    //   20585: athrow
    //   20586: aconst_null
    //   20587: athrow
    //   20588: aconst_null
    //   20589: athrow
    //   20590: aconst_null
    //   20591: athrow
    //   20592: aconst_null
    //   20593: athrow
    //   20594: aconst_null
    //   20595: athrow
    //   20596: aconst_null
    //   20597: athrow
    //   20598: aconst_null
    //   20599: athrow
    //   20600: aconst_null
    //   20601: athrow
    //   20602: aconst_null
    //   20603: athrow
    //   20604: aconst_null
    //   20605: athrow
    //   20606: aconst_null
    //   20607: athrow
    //   20608: aconst_null
    //   20609: athrow
    //   20610: aconst_null
    //   20611: athrow
    //   20612: aconst_null
    //   20613: athrow
    //   20614: aconst_null
    //   20615: athrow
    //   20616: aconst_null
    //   20617: athrow
    //   20618: aconst_null
    //   20619: athrow
    //   20620: aconst_null
    //   20621: athrow
    //   20622: aconst_null
    //   20623: athrow
    //   20624: aconst_null
    //   20625: athrow
    //   20626: aconst_null
    //   20627: athrow
    //   20628: aconst_null
    //   20629: athrow
    //   20630: aconst_null
    //   20631: athrow
    //   20632: aconst_null
    //   20633: athrow
    //   20634: aconst_null
    //   20635: athrow
    //   20636: aconst_null
    //   20637: athrow
    //   20638: aconst_null
    //   20639: athrow
    //   20640: aconst_null
    //   20641: athrow
    //   20642: aconst_null
    //   20643: athrow
    //   20644: aconst_null
    //   20645: athrow
    //   20646: aconst_null
    //   20647: athrow
    //   20648: aconst_null
    //   20649: athrow
    //   20650: aconst_null
    //   20651: athrow
    //   20652: aconst_null
    //   20653: athrow
    //   20654: aconst_null
    //   20655: athrow
    //   20656: aconst_null
    //   20657: athrow
    //   20658: aconst_null
    //   20659: athrow
    //   20660: aconst_null
    //   20661: athrow
    //   20662: aconst_null
    //   20663: athrow
    //   20664: aconst_null
    //   20665: athrow
    //   20666: aconst_null
    //   20667: athrow
    //   20668: aconst_null
    //   20669: athrow
    //   20670: aconst_null
    //   20671: athrow
    //   20672: aconst_null
    //   20673: athrow
    //   20674: aconst_null
    //   20675: athrow
    //   20676: aconst_null
    //   20677: athrow
    //   20678: aconst_null
    //   20679: athrow
    //   20680: aconst_null
    //   20681: athrow
    //   20682: aconst_null
    //   20683: athrow
    //   20684: aconst_null
    //   20685: athrow
    //   20686: aconst_null
    //   20687: athrow
    //   20688: aconst_null
    //   20689: athrow
    //   20690: aconst_null
    //   20691: athrow
    //   20692: aconst_null
    //   20693: athrow
    //   20694: aconst_null
    //   20695: athrow
    //   20696: aconst_null
    //   20697: athrow
    //   20698: aconst_null
    //   20699: athrow
    //   20700: aconst_null
    //   20701: athrow
    //   20702: aconst_null
    //   20703: athrow
    //   20704: aconst_null
    //   20705: athrow
    //   20706: aconst_null
    //   20707: athrow
    //   20708: aconst_null
    //   20709: athrow
    //   20710: aconst_null
    //   20711: athrow
    //   20712: aconst_null
    //   20713: athrow
    //   20714: aconst_null
    //   20715: athrow
    //   20716: aconst_null
    //   20717: athrow
    //   20718: aconst_null
    //   20719: athrow
    //   20720: aconst_null
    //   20721: athrow
    //   20722: aconst_null
    //   20723: athrow
    //   20724: aconst_null
    //   20725: athrow
    //   20726: aconst_null
    //   20727: athrow
    //   20728: aconst_null
    //   20729: athrow
    //   20730: aconst_null
    //   20731: athrow
    //   20732: aconst_null
    //   20733: athrow
    //   20734: aconst_null
    //   20735: athrow
    //   20736: aconst_null
    //   20737: athrow
    //   20738: aconst_null
    //   20739: athrow
    //   20740: aconst_null
    //   20741: athrow
    //   20742: aconst_null
    //   20743: athrow
    //   20744: aconst_null
    //   20745: athrow
    //   20746: aconst_null
    //   20747: athrow
    //   20748: aconst_null
    //   20749: athrow
    //   20750: aconst_null
    //   20751: athrow
    //   20752: aconst_null
    //   20753: athrow
    //   20754: aconst_null
    //   20755: athrow
    //   20756: aconst_null
    //   20757: athrow
    //   20758: aconst_null
    //   20759: athrow
    //   20760: aconst_null
    //   20761: athrow
    //   20762: aconst_null
    //   20763: athrow
    //   20764: aconst_null
    //   20765: athrow
    //   20766: aconst_null
    //   20767: athrow
    //   20768: aconst_null
    //   20769: athrow
    //   20770: aconst_null
    //   20771: athrow
    //   20772: aconst_null
    //   20773: athrow
    //   20774: aconst_null
    //   20775: athrow
    //   20776: aconst_null
    //   20777: athrow
    //   20778: aconst_null
    //   20779: athrow
    //   20780: aconst_null
    //   20781: athrow
    //   20782: aconst_null
    //   20783: athrow
    //   20784: aconst_null
    //   20785: athrow
    //   20786: aconst_null
    //   20787: athrow
    //   20788: aconst_null
    //   20789: athrow
    //   20790: aconst_null
    //   20791: athrow
    //   20792: aconst_null
    //   20793: athrow
    //   20794: aconst_null
    //   20795: athrow
    //   20796: aconst_null
    //   20797: athrow
    //   20798: aconst_null
    //   20799: athrow
    //   20800: aconst_null
    //   20801: athrow
    //   20802: aconst_null
    //   20803: athrow
    //   20804: aconst_null
    //   20805: athrow
    //   20806: aconst_null
    //   20807: athrow
    //   20808: aconst_null
    //   20809: athrow
    //   20810: aconst_null
    //   20811: athrow
    //   20812: aconst_null
    //   20813: athrow
    //   20814: aconst_null
    //   20815: athrow
    //   20816: aconst_null
    //   20817: athrow
    //   20818: aconst_null
    //   20819: athrow
    //   20820: aconst_null
    //   20821: athrow
    //   20822: aconst_null
    //   20823: athrow
    //   20824: aconst_null
    //   20825: athrow
    //   20826: aconst_null
    //   20827: athrow
    //   20828: aconst_null
    //   20829: athrow
    //   20830: aconst_null
    //   20831: athrow
    //   20832: aconst_null
    //   20833: athrow
    //   20834: aconst_null
    //   20835: athrow
    //   20836: aconst_null
    //   20837: athrow
    //   20838: aconst_null
    //   20839: athrow
    //   20840: aconst_null
    //   20841: athrow
    //   20842: aconst_null
    //   20843: athrow
    //   20844: aconst_null
    //   20845: athrow
    //   20846: aconst_null
    //   20847: athrow
    //   20848: aconst_null
    //   20849: athrow
    //   20850: aconst_null
    //   20851: athrow
    //   20852: aconst_null
    //   20853: athrow
    //   20854: aconst_null
    //   20855: athrow
    //   20856: aconst_null
    //   20857: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	20248	0	this	Lbigname/zprestige/webhack/features/modules/Client/ClickGui;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Client\ClickGui.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */