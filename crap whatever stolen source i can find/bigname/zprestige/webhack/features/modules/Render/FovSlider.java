package bigname.zprestige.webhack.features.modules.Render;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class FovSlider extends Module {
  public static FovSlider INSTANCE;
  
  public Setting<Float> fov;
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Render/FovSlider
    //   3: dup
    //   4: getstatic Perryc.0 : I
    //   7: ifle -> 20
    //   10: ldc2_w 605325335
    //   13: l2i
    //   14: ldc 1210908037
    //   16: ixor
    //   17: goto -> 27
    //   20: ldc2_w -450837630
    //   23: l2i
    //   24: ldc 2083287798
    //   26: ixor
    //   27: ldc2_w 2096986077
    //   30: l2i
    //   31: ldc -194415062
    //   33: ixor
    //   34: ixor
    //   35: lookupswitch default -> 60, -1383500942 -> 20, -458460059 -> 126
    //   60: invokespecial <init> : ()V
    //   63: getstatic Perryc.c : I
    //   66: iflt -> 79
    //   69: ldc2_w -341183119
    //   72: l2i
    //   73: ldc 1453164569
    //   75: ixor
    //   76: goto -> 86
    //   79: ldc2_w -981113696
    //   82: l2i
    //   83: ldc -967040578
    //   85: ixor
    //   86: ldc2_w -1761406116
    //   89: l2i
    //   90: ldc 1204217601
    //   92: ixor
    //   93: ixor
    //   94: lookupswitch default -> 120, 1844545845 -> 124, 2074750796 -> 79
    //   120: putstatic bigname/zprestige/webhack/features/modules/Render/FovSlider.INSTANCE : Lbigname/zprestige/webhack/features/modules/Render/FovSlider;
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
  }
  
  public void setInstance() {
    Perry1.3I(this, (int)-1008127140L ^ 0xD3831503);
  }
  
  public FovSlider() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w -1317307367
    //   9: l2i
    //   10: ldc -843410542
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1384485170
    //   19: l2i
    //   20: ldc -656361395
    //   22: ixor
    //   23: ldc2_w -1097763696
    //   26: l2i
    //   27: ldc -337453993
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, 699549516 -> 1042, 1455309078 -> 16
    //   56: aload_0
    //   57: ldc '鏡㌜鎻㶄弨絲๽蹱'
    //   59: getstatic Perryc.1 : I
    //   62: ifeq -> 75
    //   65: ldc2_w -50541760
    //   68: l2i
    //   69: ldc -697735242
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -1506344056
    //   78: l2i
    //   79: ldc 1126130289
    //   81: ixor
    //   82: ldc2_w 404301860
    //   85: l2i
    //   86: ldc -22540925
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 1036, -870020783 -> 75, 60376158 -> 116
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '鏤㌛鎬㶹弣絾๪蹶ψ⭜ਁ帰煗'
    //   121: getstatic Perryc.c : I
    //   124: iflt -> 137
    //   127: ldc2_w 1409203715
    //   130: l2i
    //   131: ldc -2058325000
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w -1192118641
    //   140: l2i
    //   141: ldc -1909186900
    //   143: ixor
    //   144: ldc2_w 1401385209
    //   147: l2i
    //   148: ldc 595460428
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 1024, -1504199602 -> 137, 1178392982 -> 180
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.1 : I
    //   186: ifeq -> 199
    //   189: ldc2_w 1205675523
    //   192: l2i
    //   193: ldc 672912385
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w 1565469506
    //   202: l2i
    //   203: ldc -1911920802
    //   205: ixor
    //   206: ldc2_w -1698547963
    //   209: l2i
    //   210: ldc 1317100445
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 240, -1148871014 -> 1038, 434888432 -> 199
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.RENDER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w 1010986045
    //   246: l2i
    //   247: ldc 1010986044
    //   249: ixor
    //   250: ldc2_w -1145949394
    //   253: l2i
    //   254: ldc -1145949394
    //   256: ixor
    //   257: ldc2_w 1531782949
    //   260: l2i
    //   261: ldc 1531782949
    //   263: ixor
    //   264: getstatic Perryc.0 : I
    //   267: ifle -> 280
    //   270: ldc2_w -541537332
    //   273: l2i
    //   274: ldc 384203725
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w -8641178
    //   283: l2i
    //   284: ldc 2053798824
    //   286: ixor
    //   287: ldc2_w -1720587280
    //   290: l2i
    //   291: ldc -785933606
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 320, -2130132693 -> 1032, -1149442586 -> 280
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.0 : I
    //   326: ifle -> 339
    //   329: ldc2_w 16118757
    //   332: l2i
    //   333: ldc -1691215718
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w 1276082417
    //   342: l2i
    //   343: ldc 45716653
    //   345: ixor
    //   346: ldc2_w -240137636
    //   349: l2i
    //   350: ldc 770826257
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 1034, -1830238703 -> 380, 1201258802 -> 339
    //   380: aload_0
    //   381: getstatic Perryc.1 : I
    //   384: ifeq -> 397
    //   387: ldc2_w 1079009364
    //   390: l2i
    //   391: ldc 561162116
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w 1800730953
    //   400: l2i
    //   401: ldc -714484974
    //   403: ixor
    //   404: ldc2_w 501484582
    //   407: l2i
    //   408: ldc -1756446348
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 440, -1101299262 -> 397, -343405950 -> 1052
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc '鏡㌜鎻'
    //   447: getstatic Perryc.0 : I
    //   450: ifle -> 463
    //   453: ldc2_w 1009544031
    //   456: l2i
    //   457: ldc 942657716
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w -199434074
    //   466: l2i
    //   467: ldc -1460717443
    //   469: ixor
    //   470: ldc2_w 1466490150
    //   473: l2i
    //   474: ldc 767805405
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 1050, 643351072 -> 504, 2124980496 -> 463
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc 0.008602884
    //   509: invokestatic floatToIntBits : (F)I
    //   512: ldc 2132472604
    //   514: ixor
    //   515: invokestatic intBitsToFloat : (I)F
    //   518: getstatic Perryc.1 : I
    //   521: ifeq -> 534
    //   524: ldc2_w 1380699245
    //   527: l2i
    //   528: ldc 1254172165
    //   530: ixor
    //   531: goto -> 541
    //   534: ldc2_w -1425906891
    //   537: l2i
    //   538: ldc -738100547
    //   540: ixor
    //   541: ldc2_w 628731791
    //   544: l2i
    //   545: ldc 2025936342
    //   547: ixor
    //   548: ixor
    //   549: lookupswitch default -> 576, 972284550 -> 534, 1160908849 -> 1046
    //   576: invokestatic valueOf : (F)Ljava/lang/Float;
    //   579: ldc -0.076038904
    //   581: invokestatic floatToIntBits : (F)I
    //   584: ldc 2125445705
    //   586: ixor
    //   587: invokestatic intBitsToFloat : (I)F
    //   590: getstatic Perryc.c : I
    //   593: iflt -> 606
    //   596: ldc2_w 1474435537
    //   599: l2i
    //   600: ldc -9717644
    //   602: ixor
    //   603: goto -> 613
    //   606: ldc2_w 1412765130
    //   609: l2i
    //   610: ldc -1883111640
    //   612: ixor
    //   613: ldc2_w 481516338
    //   616: l2i
    //   617: ldc -806405377
    //   619: ixor
    //   620: ixor
    //   621: lookupswitch default -> 1026, 145263407 -> 648, 2077605992 -> 606
    //   648: invokestatic valueOf : (F)Ljava/lang/Float;
    //   651: ldc 0.086029015
    //   653: invokestatic floatToIntBits : (F)I
    //   656: ldc 2122592251
    //   658: ixor
    //   659: invokestatic intBitsToFloat : (I)F
    //   662: getstatic Perryc.0 : I
    //   665: ifle -> 678
    //   668: ldc2_w 93724617
    //   671: l2i
    //   672: ldc 1443671044
    //   674: ixor
    //   675: goto -> 685
    //   678: ldc2_w -840393511
    //   681: l2i
    //   682: ldc 107978233
    //   684: ixor
    //   685: ldc2_w -986817599
    //   688: l2i
    //   689: ldc 507065382
    //   691: ixor
    //   692: ixor
    //   693: lookupswitch default -> 720, -2003968982 -> 1030, -1071402868 -> 678
    //   720: invokestatic valueOf : (F)Ljava/lang/Float;
    //   723: getstatic Perryc.1 : I
    //   726: ifeq -> 739
    //   729: ldc2_w 1137716319
    //   732: l2i
    //   733: ldc -651889238
    //   735: ixor
    //   736: goto -> 746
    //   739: ldc2_w 874207909
    //   742: l2i
    //   743: ldc -248536845
    //   745: ixor
    //   746: ldc2_w -956916630
    //   749: l2i
    //   750: ldc -1875535038
    //   752: ixor
    //   753: ixor
    //   754: lookupswitch default -> 1048, -1812464258 -> 780, -868753699 -> 739
    //   780: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   783: getstatic Perryc.0 : I
    //   786: ifle -> 799
    //   789: ldc2_w 335295
    //   792: l2i
    //   793: ldc -1936222671
    //   795: ixor
    //   796: goto -> 806
    //   799: ldc2_w 94747615
    //   802: l2i
    //   803: ldc -1657678778
    //   805: ixor
    //   806: ldc2_w 731483450
    //   809: l2i
    //   810: ldc -1255145489
    //   812: ixor
    //   813: ixor
    //   814: lookupswitch default -> 1040, 102899020 -> 840, 304413019 -> 799
    //   840: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   843: getstatic Perryc.c : I
    //   846: iflt -> 859
    //   849: ldc2_w -1618242809
    //   852: l2i
    //   853: ldc 1928951162
    //   855: ixor
    //   856: goto -> 866
    //   859: ldc2_w 1912570401
    //   862: l2i
    //   863: ldc 1392425413
    //   865: ixor
    //   866: ldc2_w -821725149
    //   869: l2i
    //   870: ldc -1244995349
    //   872: ixor
    //   873: ixor
    //   874: lookupswitch default -> 1028, -1749188939 -> 859, 1506714412 -> 900
    //   900: putfield fov : Lbigname/zprestige/webhack/features/setting/Setting;
    //   903: getstatic Perryc.0 : I
    //   906: ifle -> 919
    //   909: ldc2_w 1492002625
    //   912: l2i
    //   913: ldc -576329397
    //   915: ixor
    //   916: goto -> 926
    //   919: ldc2_w 284602359
    //   922: l2i
    //   923: ldc 1763284393
    //   925: ixor
    //   926: ldc2_w -262545069
    //   929: l2i
    //   930: ldc 29507794
    //   932: ixor
    //   933: ixor
    //   934: lookupswitch default -> 960, 1237520216 -> 919, 1959817099 -> 1044
    //   960: aload_0
    //   961: getstatic Perryc.0 : I
    //   964: ifle -> 977
    //   967: ldc2_w -1413981767
    //   970: l2i
    //   971: ldc -1543735666
    //   973: ixor
    //   974: goto -> 985
    //   977: ldc2_w -2037864642
    //   980: l2i
    //   981: ldc_w 1012811329
    //   984: ixor
    //   985: ldc2_w -1108151506
    //   988: l2i
    //   989: ldc_w 1043931938
    //   992: ixor
    //   993: ixor
    //   994: lookupswitch default -> 1054, -1953497285 -> 977, 958214515 -> 1020
    //   1020: invokespecial setInstance : ()V
    //   1023: return
    //   1024: aconst_null
    //   1025: athrow
    //   1026: aconst_null
    //   1027: athrow
    //   1028: aconst_null
    //   1029: athrow
    //   1030: aconst_null
    //   1031: athrow
    //   1032: aconst_null
    //   1033: athrow
    //   1034: aconst_null
    //   1035: athrow
    //   1036: aconst_null
    //   1037: athrow
    //   1038: aconst_null
    //   1039: athrow
    //   1040: aconst_null
    //   1041: athrow
    //   1042: aconst_null
    //   1043: athrow
    //   1044: aconst_null
    //   1045: athrow
    //   1046: aconst_null
    //   1047: athrow
    //   1048: aconst_null
    //   1049: athrow
    //   1050: aconst_null
    //   1051: athrow
    //   1052: aconst_null
    //   1053: athrow
    //   1054: aconst_null
    //   1055: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1024	0	this	Lbigname/zprestige/webhack/features/modules/Render/FovSlider;
  }
  
  public void onUpdate() {
    Perry1.42(this, (int)789869568L ^ 0x15EE1844);
  }
  
  public static FovSlider getINSTANCE() {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Render\FovSlider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */