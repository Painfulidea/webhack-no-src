package bigname.zprestige.webhack.features.modules.Hud;

import Perryc;
import bigname.zprestige.webhack.event.events.Render2DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class FriendList extends Module {
  public int color;
  
  public Setting<Integer> FriendListY;
  
  public void onRender2D(Render2DEvent event) {
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
  
  public FriendList() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 1929507954
    //   9: l2i
    //   10: ldc -971875645
    //   12: ixor
    //   13: goto -> 24
    //   16: ldc2_w 1715276179
    //   19: l2i
    //   20: ldc_w 1808946171
    //   23: ixor
    //   24: ldc2_w 1625037231
    //   27: l2i
    //   28: ldc_w 247597127
    //   31: ixor
    //   32: ixor
    //   33: lookupswitch default -> 968, -619856039 -> 16, 1676757888 -> 60
    //   60: aload_0
    //   61: ldc_w '狦㌁狛㶲쀩鱸๕༜蹰鳍'
    //   64: getstatic Perryc.1 : I
    //   67: ifeq -> 81
    //   70: ldc2_w -745090601
    //   73: l2i
    //   74: ldc_w -1165047772
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 656185582
    //   84: l2i
    //   85: ldc_w 1481380812
    //   88: ixor
    //   89: ldc2_w -168744592
    //   92: l2i
    //   93: ldc_w -261856414
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 948, 1821201377 -> 81, 2059780400 -> 124
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '独㌚狁㶣쀴鰼๬༇踣鳟쨉ਮ뽥煯ᠫ迟ꪼꝠ?ﴹ侴頡䚺鿴⛯'
    //   130: getstatic Perryc.1 : I
    //   133: ifeq -> 147
    //   136: ldc2_w -159925244
    //   139: l2i
    //   140: ldc_w -310957312
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w -1872295025
    //   150: l2i
    //   151: ldc_w -58116085
    //   154: ixor
    //   155: ldc2_w 1019535631
    //   158: l2i
    //   159: ldc_w -837684380
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 192, -371882641 -> 956, 1236566187 -> 147
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w 1178835341
    //   204: l2i
    //   205: ldc_w -1822298741
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -1616838487
    //   215: l2i
    //   216: ldc_w -440462886
    //   219: ixor
    //   220: ldc2_w -876720271
    //   223: l2i
    //   224: ldc_w -1420790491
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 950, -1244901806 -> 212, 451947303 -> 256
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.HUD : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w 263172541
    //   262: l2i
    //   263: ldc_w 263172540
    //   266: ixor
    //   267: ldc2_w -52599094
    //   270: l2i
    //   271: ldc_w -52599094
    //   274: ixor
    //   275: ldc2_w -1146906961
    //   278: l2i
    //   279: ldc_w -1146906961
    //   282: ixor
    //   283: getstatic Perryc.c : I
    //   286: iflt -> 300
    //   289: ldc2_w 341303739
    //   292: l2i
    //   293: ldc_w 3612336
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -2278039
    //   303: l2i
    //   304: ldc_w -897606361
    //   307: ixor
    //   308: ldc2_w -282674439
    //   311: l2i
    //   312: ldc_w -1306539094
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 952, 1230605912 -> 300, 1755042077 -> 344
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.1 : I
    //   350: ifeq -> 364
    //   353: ldc2_w 1058418281
    //   356: l2i
    //   357: ldc_w 710105351
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w 1800089797
    //   367: l2i
    //   368: ldc_w 2121370320
    //   371: ixor
    //   372: ldc2_w 1126791966
    //   375: l2i
    //   376: ldc_w 1795831647
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 960, 1025111636 -> 408, 1030109999 -> 364
    //   408: aload_0
    //   409: getstatic Perryc.0 : I
    //   412: ifle -> 426
    //   415: ldc2_w -517446429
    //   418: l2i
    //   419: ldc_w -311162929
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w 849174776
    //   429: l2i
    //   430: ldc_w 664090161
    //   433: ixor
    //   434: ldc2_w 2145496562
    //   437: l2i
    //   438: ldc_w 588609484
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 972, 1241287927 -> 468, 1353234706 -> 426
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '狦㌁狛㶲쀩鱸๕༜蹰鳍쨢'
    //   476: getstatic Perryc.0 : I
    //   479: ifle -> 493
    //   482: ldc2_w 1502957061
    //   485: l2i
    //   486: ldc_w -1370325116
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w 1306417775
    //   496: l2i
    //   497: ldc_w 1013794235
    //   500: ixor
    //   501: ldc2_w -848288598
    //   504: l2i
    //   505: ldc_w 35039428
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 970, -1093299270 -> 536, 950124015 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w 296056982
    //   542: l2i
    //   543: ldc_w 296057070
    //   546: ixor
    //   547: getstatic Perryc.1 : I
    //   550: ifeq -> 564
    //   553: ldc2_w 1746279075
    //   556: l2i
    //   557: ldc_w -2000169415
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w -2126286892
    //   567: l2i
    //   568: ldc_w -229841590
    //   571: ixor
    //   572: ldc2_w 549216990
    //   575: l2i
    //   576: ldc_w 78405355
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 608, -993922897 -> 958, 1600478296 -> 564
    //   608: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   611: ldc2_w 348828838
    //   614: l2i
    //   615: ldc_w 348828838
    //   618: ixor
    //   619: getstatic Perryc.0 : I
    //   622: ifle -> 636
    //   625: ldc2_w -331384188
    //   628: l2i
    //   629: ldc_w 1429841897
    //   632: ixor
    //   633: goto -> 644
    //   636: ldc2_w -1762993245
    //   639: l2i
    //   640: ldc_w -989879928
    //   643: ixor
    //   644: ldc2_w -1917525292
    //   647: l2i
    //   648: ldc_w 222335063
    //   651: ixor
    //   652: ixor
    //   653: lookupswitch default -> 974, -757004120 -> 680, 972206062 -> 636
    //   680: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   683: ldc2_w -393378534
    //   686: l2i
    //   687: ldc_w -393378040
    //   690: ixor
    //   691: getstatic Perryc.c : I
    //   694: iflt -> 708
    //   697: ldc2_w -2018479326
    //   700: l2i
    //   701: ldc_w -963056454
    //   704: ixor
    //   705: goto -> 716
    //   708: ldc2_w 1363559957
    //   711: l2i
    //   712: ldc_w -721114403
    //   715: ixor
    //   716: ldc2_w 53713062
    //   719: l2i
    //   720: ldc_w 433672039
    //   723: ixor
    //   724: ixor
    //   725: lookupswitch default -> 752, -2087718022 -> 708, 1539459161 -> 964
    //   752: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   755: getstatic Perryc.1 : I
    //   758: ifeq -> 772
    //   761: ldc2_w -1209246751
    //   764: l2i
    //   765: ldc_w 1197444685
    //   768: ixor
    //   769: goto -> 780
    //   772: ldc2_w 246610722
    //   775: l2i
    //   776: ldc_w -1574096093
    //   779: ixor
    //   780: ldc2_w -1724840965
    //   783: l2i
    //   784: ldc_w -1091630102
    //   787: ixor
    //   788: ixor
    //   789: lookupswitch default -> 816, -680665667 -> 954, -261091300 -> 772
    //   816: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   819: getstatic Perryc.0 : I
    //   822: ifle -> 836
    //   825: ldc2_w 2028631806
    //   828: l2i
    //   829: ldc_w 1762513809
    //   832: ixor
    //   833: goto -> 844
    //   836: ldc2_w 1575864227
    //   839: l2i
    //   840: ldc_w 216678861
    //   843: ixor
    //   844: ldc2_w -1397595454
    //   847: l2i
    //   848: ldc_w 974076084
    //   851: ixor
    //   852: ixor
    //   853: lookupswitch default -> 880, -2024079591 -> 966, -1780112084 -> 836
    //   880: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   883: getstatic Perryc.0 : I
    //   886: ifle -> 900
    //   889: ldc2_w 1566481681
    //   892: l2i
    //   893: ldc_w -2087078081
    //   896: ixor
    //   897: goto -> 908
    //   900: ldc2_w 21780210
    //   903: l2i
    //   904: ldc_w -923109507
    //   907: ixor
    //   908: ldc2_w -346469216
    //   911: l2i
    //   912: ldc_w 762478291
    //   915: ixor
    //   916: ixor
    //   917: lookupswitch default -> 944, 418125917 -> 962, 2102726389 -> 900
    //   944: putfield FriendListY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   947: return
    //   948: aconst_null
    //   949: athrow
    //   950: aconst_null
    //   951: athrow
    //   952: aconst_null
    //   953: athrow
    //   954: aconst_null
    //   955: athrow
    //   956: aconst_null
    //   957: athrow
    //   958: aconst_null
    //   959: athrow
    //   960: aconst_null
    //   961: athrow
    //   962: aconst_null
    //   963: athrow
    //   964: aconst_null
    //   965: athrow
    //   966: aconst_null
    //   967: athrow
    //   968: aconst_null
    //   969: athrow
    //   970: aconst_null
    //   971: athrow
    //   972: aconst_null
    //   973: athrow
    //   974: aconst_null
    //   975: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	948	0	this	Lbigname/zprestige/webhack/features/modules/Hud/FriendList;
  }
  
  public void renderFriends() {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Hud\FriendList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */