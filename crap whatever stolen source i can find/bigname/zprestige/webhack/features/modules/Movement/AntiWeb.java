package bigname.zprestige.webhack.features.modules.Movement;

import Perry1;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class AntiWeb extends Module {
  public Setting<Float> motionY;
  
  public void onUpdate() {
    Perry1.3T(this, (int)1159372104L ^ 0x6EB59F4B);
  }
  
  public AntiWeb() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 577269527
    //   9: l2i
    //   10: ldc 1578172706
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 2049741904
    //   19: l2i
    //   20: ldc 1720401007
    //   22: ixor
    //   23: ldc2_w -118278640
    //   26: l2i
    //   27: ldc -15445868
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 906, 457232059 -> 56, 2073954481 -> 16
    //   56: aload_0
    //   57: ldc '쁁㌝쀦㶾濰⻙๻'
    //   59: getstatic Perryc.c : I
    //   62: iflt -> 75
    //   65: ldc2_w -1379927142
    //   68: l2i
    //   69: ldc -2141269420
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w 1965404538
    //   78: l2i
    //   79: ldc 1661453974
    //   81: ixor
    //   82: ldc2_w 1538224925
    //   85: l2i
    //   86: ldc 1292017539
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 926, 9411442 -> 116, 994886992 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '쁣㌜쀹'
    //   121: getstatic Perryc.1 : I
    //   124: ifeq -> 137
    //   127: ldc2_w 2044878993
    //   130: l2i
    //   131: ldc 18983366
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 924690252
    //   140: l2i
    //   141: ldc -1184529588
    //   143: ixor
    //   144: ldc2_w 793505688
    //   147: l2i
    //   148: ldc -1727751360
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 920, -829637233 -> 137, 943149272 -> 180
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.1 : I
    //   186: ifeq -> 199
    //   189: ldc2_w 990882263
    //   192: l2i
    //   193: ldc -1892353841
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w -315119762
    //   202: l2i
    //   203: ldc 923498362
    //   205: ixor
    //   206: ldc2_w 1404546107
    //   209: l2i
    //   210: ldc -196047554
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 930, 333213725 -> 199, 2111566097 -> 240
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.MOVEMENT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w -2098708656
    //   246: l2i
    //   247: ldc -2098708655
    //   249: ixor
    //   250: ldc2_w 56808599
    //   253: l2i
    //   254: ldc 56808599
    //   256: ixor
    //   257: ldc2_w 1097347619
    //   260: l2i
    //   261: ldc 1097347619
    //   263: ixor
    //   264: getstatic Perryc.1 : I
    //   267: ifeq -> 280
    //   270: ldc2_w -432699854
    //   273: l2i
    //   274: ldc -335476602
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w 1115171849
    //   283: l2i
    //   284: ldc -212817270
    //   286: ixor
    //   287: ldc2_w -37289
    //   290: l2i
    //   291: ldc -462466695
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 914, -1430734419 -> 320, 296006042 -> 280
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.c : I
    //   326: iflt -> 339
    //   329: ldc2_w 1288439361
    //   332: l2i
    //   333: ldc -898634954
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w 4195387
    //   342: l2i
    //   343: ldc 1008260060
    //   345: ixor
    //   346: ldc2_w -1391503200
    //   349: l2i
    //   350: ldc 229481491
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 380, -351134801 -> 339, 637610436 -> 904
    //   380: aload_0
    //   381: getstatic Perryc.0 : I
    //   384: ifle -> 397
    //   387: ldc2_w -250206299
    //   390: l2i
    //   391: ldc 1690765072
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w -806713308
    //   400: l2i
    //   401: ldc -2147464514
    //   403: ixor
    //   404: ldc2_w 1347925805
    //   407: l2i
    //   408: ldc 1019867561
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 908, -112237007 -> 397, 594838558 -> 440
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc '쁍㌜쀦㶾濈⻒เ'
    //   447: getstatic Perryc.0 : I
    //   450: ifle -> 463
    //   453: ldc2_w 1565927189
    //   456: l2i
    //   457: ldc 588651561
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w 2035831168
    //   466: l2i
    //   467: ldc 631415936
    //   469: ixor
    //   470: ldc2_w -1105421037
    //   473: l2i
    //   474: ldc -1645706234
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 916, 1572086313 -> 463, 2131684373 -> 504
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc 69.45251
    //   509: invokestatic floatToIntBits : (F)I
    //   512: ldc 2097866671
    //   514: ixor
    //   515: invokestatic intBitsToFloat : (I)F
    //   518: getstatic Perryc.c : I
    //   521: iflt -> 534
    //   524: ldc2_w -854959535
    //   527: l2i
    //   528: ldc -2044775307
    //   530: ixor
    //   531: goto -> 541
    //   534: ldc2_w -790839674
    //   537: l2i
    //   538: ldc 1197728652
    //   540: ixor
    //   541: ldc2_w 1969982770
    //   544: l2i
    //   545: ldc 2069275509
    //   547: ixor
    //   548: ixor
    //   549: lookupswitch default -> 576, -111823913 -> 534, 1160265827 -> 912
    //   576: invokestatic valueOf : (F)Ljava/lang/Float;
    //   579: ldc 2.9630304E38
    //   581: invokestatic floatToIntBits : (F)I
    //   584: ldc 2136926692
    //   586: ixor
    //   587: invokestatic intBitsToFloat : (I)F
    //   590: getstatic Perryc.1 : I
    //   593: ifeq -> 606
    //   596: ldc2_w -1798055361
    //   599: l2i
    //   600: ldc 1933048728
    //   602: ixor
    //   603: goto -> 613
    //   606: ldc2_w 419740499
    //   609: l2i
    //   610: ldc 1536717633
    //   612: ixor
    //   613: ldc2_w -1529849053
    //   616: l2i
    //   617: ldc 1204009543
    //   619: ixor
    //   620: ixor
    //   621: lookupswitch default -> 648, -2030576252 -> 606, 83345603 -> 910
    //   648: invokestatic valueOf : (F)Ljava/lang/Float;
    //   651: ldc 0.03549163
    //   653: invokestatic floatToIntBits : (F)I
    //   656: ldc 2136563628
    //   658: ixor
    //   659: invokestatic intBitsToFloat : (I)F
    //   662: getstatic Perryc.0 : I
    //   665: ifle -> 678
    //   668: ldc2_w -1522449271
    //   671: l2i
    //   672: ldc 1916052637
    //   674: ixor
    //   675: goto -> 685
    //   678: ldc2_w 1692534394
    //   681: l2i
    //   682: ldc -1153755461
    //   684: ixor
    //   685: ldc2_w -847014993
    //   688: l2i
    //   689: ldc -1253760683
    //   691: ixor
    //   692: ixor
    //   693: lookupswitch default -> 924, -1491099077 -> 720, -1347202322 -> 678
    //   720: invokestatic valueOf : (F)Ljava/lang/Float;
    //   723: getstatic Perryc.1 : I
    //   726: ifeq -> 739
    //   729: ldc2_w -991175319
    //   732: l2i
    //   733: ldc 6167689
    //   735: ixor
    //   736: goto -> 746
    //   739: ldc2_w 1436730375
    //   742: l2i
    //   743: ldc -1638730547
    //   745: ixor
    //   746: ldc2_w 1224563762
    //   749: l2i
    //   750: ldc 238929364
    //   752: ixor
    //   753: ixor
    //   754: lookupswitch default -> 922, -2106238970 -> 739, -1926190804 -> 780
    //   780: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   783: getstatic Perryc.0 : I
    //   786: ifle -> 799
    //   789: ldc2_w -1895206687
    //   792: l2i
    //   793: ldc 1826481039
    //   795: ixor
    //   796: goto -> 806
    //   799: ldc2_w 1120131949
    //   802: l2i
    //   803: ldc -821515147
    //   805: ixor
    //   806: ldc2_w -1823877690
    //   809: l2i
    //   810: ldc -1618775554
    //   812: ixor
    //   813: ixor
    //   814: lookupswitch default -> 928, -2130586848 -> 840, -283232426 -> 799
    //   840: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   843: getstatic Perryc.1 : I
    //   846: ifeq -> 859
    //   849: ldc2_w 740003895
    //   852: l2i
    //   853: ldc -650627308
    //   855: ixor
    //   856: goto -> 866
    //   859: ldc2_w 2056863284
    //   862: l2i
    //   863: ldc -1167324203
    //   865: ixor
    //   866: ldc2_w 1347689246
    //   869: l2i
    //   870: ldc 1081447547
    //   872: ixor
    //   873: ixor
    //   874: lookupswitch default -> 900, -771331409 -> 859, -452843450 -> 918
    //   900: putfield motionY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   903: return
    //   904: aconst_null
    //   905: athrow
    //   906: aconst_null
    //   907: athrow
    //   908: aconst_null
    //   909: athrow
    //   910: aconst_null
    //   911: athrow
    //   912: aconst_null
    //   913: athrow
    //   914: aconst_null
    //   915: athrow
    //   916: aconst_null
    //   917: athrow
    //   918: aconst_null
    //   919: athrow
    //   920: aconst_null
    //   921: athrow
    //   922: aconst_null
    //   923: athrow
    //   924: aconst_null
    //   925: athrow
    //   926: aconst_null
    //   927: athrow
    //   928: aconst_null
    //   929: athrow
    //   930: aconst_null
    //   931: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	904	0	this	Lbigname/zprestige/webhack/features/modules/Movement/AntiWeb;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Movement\AntiWeb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */