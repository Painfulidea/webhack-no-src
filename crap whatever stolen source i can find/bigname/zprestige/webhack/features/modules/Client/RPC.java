package bigname.zprestige.webhack.features.modules.Client;

import Perry1;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class RPC extends Module {
  public Setting<Boolean> showIP;
  
  public static RPC INSTANCE;
  
  public void onEnable() {
    Perry1.3V(this, (int)-119775040L ^ 0x8B1F6615);
  }
  
  public RPC() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 706033708
    //   9: l2i
    //   10: ldc 1233811963
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -902753831
    //   19: l2i
    //   20: ldc -1083407355
    //   22: ixor
    //   23: ldc2_w 948748454
    //   26: l2i
    //   27: ldc -230645904
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 944, -1454170623 -> 16, -1080964598 -> 56
    //   56: aload_0
    //   57: ldc '辡㌣迂'
    //   59: getstatic Perryc.0 : I
    //   62: ifle -> 75
    //   65: ldc2_w 76827961
    //   68: l2i
    //   69: ldc 869518561
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -1445170538
    //   78: l2i
    //   79: ldc -1341813558
    //   81: ixor
    //   82: ldc2_w -1634991128
    //   85: l2i
    //   86: ldc -634028009
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 960, 1566604707 -> 116, 1946026535 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '辵㌟迤㶯㲨愺๫蹠怚㝁ਢ䉝煵ዹ辑埆Ꝫ⇉k侲攓䚬挺'
    //   121: getstatic Perryc.c : I
    //   124: iflt -> 137
    //   127: ldc2_w -2124766851
    //   130: l2i
    //   131: ldc -2056244956
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 601586403
    //   140: l2i
    //   141: ldc -1539512592
    //   143: ixor
    //   144: ldc2_w -640450321
    //   147: l2i
    //   148: ldc -1241388504
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 180, -1911863892 -> 137, 1811479198 -> 952
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.1 : I
    //   186: ifeq -> 199
    //   189: ldc2_w -1297952909
    //   192: l2i
    //   193: ldc 1879654445
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w -198261027
    //   202: l2i
    //   203: ldc -1153732734
    //   205: ixor
    //   206: ldc2_w -2100876471
    //   209: l2i
    //   210: ldc 1525975950
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 950, -1759114856 -> 240, 446181273 -> 199
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.CLIENT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w -2089945895
    //   246: l2i
    //   247: ldc -2089945896
    //   249: ixor
    //   250: ldc2_w 1868953894
    //   253: l2i
    //   254: ldc 1868953894
    //   256: ixor
    //   257: ldc2_w -841078480
    //   260: l2i
    //   261: ldc -841078480
    //   263: ixor
    //   264: getstatic Perryc.1 : I
    //   267: ifeq -> 280
    //   270: ldc2_w -763545674
    //   273: l2i
    //   274: ldc -1358990765
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w -2011511101
    //   283: l2i
    //   284: ldc 518620980
    //   286: ixor
    //   287: ldc2_w 13661904
    //   290: l2i
    //   291: ldc -2131472729
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 954, -56197742 -> 280, 383220096 -> 320
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.0 : I
    //   326: ifle -> 339
    //   329: ldc2_w -459604282
    //   332: l2i
    //   333: ldc 1753567056
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w 1372803401
    //   342: l2i
    //   343: ldc -1333745781
    //   345: ixor
    //   346: ldc2_w -82128282
    //   349: l2i
    //   350: ldc -1445810912
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 380, -556282160 -> 940, 221051698 -> 339
    //   380: aload_0
    //   381: getstatic Perryc.c : I
    //   384: iflt -> 397
    //   387: ldc2_w 1499592002
    //   390: l2i
    //   391: ldc -1567254167
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w 723265283
    //   400: l2i
    //   401: ldc 1426558779
    //   403: ixor
    //   404: ldc2_w -1690881143
    //   407: l2i
    //   408: ldc -366223927
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 440, -1964473749 -> 964, -1357188384 -> 397
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc '辠㌛迮㶠㳁感'
    //   447: getstatic Perryc.0 : I
    //   450: ifle -> 463
    //   453: ldc2_w 1891578518
    //   456: l2i
    //   457: ldc -1983947491
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w -54767307
    //   466: l2i
    //   467: ldc 1778944233
    //   469: ixor
    //   470: ldc2_w 69686295
    //   473: l2i
    //   474: ldc 600364164
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 946, -1319413425 -> 504, -554701032 -> 463
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc2_w -372177212
    //   510: l2i
    //   511: ldc -372177211
    //   513: ixor
    //   514: getstatic Perryc.c : I
    //   517: iflt -> 530
    //   520: ldc2_w 1021739353
    //   523: l2i
    //   524: ldc -433225328
    //   526: ixor
    //   527: goto -> 537
    //   530: ldc2_w 1550327854
    //   533: l2i
    //   534: ldc 1433813087
    //   536: ixor
    //   537: ldc2_w -1064905482
    //   540: l2i
    //   541: ldc -1669365081
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 958, -2043521384 -> 530, 1441216032 -> 572
    //   572: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   575: ldc '辠㌛迮㶠㳻慯๭蹦恖㝛ਢ䉁煷ዤ迟垯Ꝟↀq便敜䚧挱?ᣜ⫈⥑摶㘥Ĳ奰ꛤා缤✇鄵뮞릖ੌ'
    //   577: getstatic Perryc.0 : I
    //   580: ifle -> 593
    //   583: ldc2_w -2079777630
    //   586: l2i
    //   587: ldc 248324079
    //   589: ixor
    //   590: goto -> 600
    //   593: ldc2_w -1179611785
    //   596: l2i
    //   597: ldc -2145131707
    //   599: ixor
    //   600: ldc2_w -799596878
    //   603: l2i
    //   604: ldc 197757407
    //   606: ixor
    //   607: ixor
    //   608: lookupswitch default -> 636, -1728803179 -> 593, 1364890656 -> 956
    //   636: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   639: getstatic Perryc.c : I
    //   642: iflt -> 655
    //   645: ldc2_w 1783444260
    //   648: l2i
    //   649: ldc -750047521
    //   651: ixor
    //   652: goto -> 662
    //   655: ldc2_w 1499546904
    //   658: l2i
    //   659: ldc -1953276829
    //   661: ixor
    //   662: ldc2_w -1377825065
    //   665: l2i
    //   666: ldc 183622358
    //   668: ixor
    //   669: ixor
    //   670: lookupswitch default -> 942, 504875514 -> 655, 1977863546 -> 696
    //   696: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    //   699: getstatic Perryc.0 : I
    //   702: ifle -> 715
    //   705: ldc2_w -609078576
    //   708: l2i
    //   709: ldc -1764047102
    //   711: ixor
    //   712: goto -> 722
    //   715: ldc2_w -1781780345
    //   718: l2i
    //   719: ldc -754635047
    //   721: ixor
    //   722: ldc2_w -199532669
    //   725: l2i
    //   726: ldc -616827575
    //   728: ixor
    //   729: ixor
    //   730: lookupswitch default -> 756, 998545317 -> 715, 1648910104 -> 962
    //   756: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   759: getstatic Perryc.1 : I
    //   762: ifeq -> 775
    //   765: ldc2_w -1567219439
    //   768: l2i
    //   769: ldc -939003001
    //   771: ixor
    //   772: goto -> 782
    //   775: ldc2_w -1882674643
    //   778: l2i
    //   779: ldc -1469347083
    //   781: ixor
    //   782: ldc2_w 579802295
    //   785: l2i
    //   786: ldc 700342069
    //   788: ixor
    //   789: ixor
    //   790: lookupswitch default -> 966, 747793242 -> 816, 1637914900 -> 775
    //   816: putfield showIP : Lbigname/zprestige/webhack/features/setting/Setting;
    //   819: getstatic Perryc.0 : I
    //   822: ifle -> 835
    //   825: ldc2_w -1251315995
    //   828: l2i
    //   829: ldc -668262765
    //   831: ixor
    //   832: goto -> 842
    //   835: ldc2_w 513193096
    //   838: l2i
    //   839: ldc -901243575
    //   841: ixor
    //   842: ldc2_w 1286454508
    //   845: l2i
    //   846: ldc -19477317
    //   848: ixor
    //   849: ixor
    //   850: lookupswitch default -> 876, -549847007 -> 968, 191979340 -> 835
    //   876: aload_0
    //   877: getstatic Perryc.1 : I
    //   880: ifeq -> 893
    //   883: ldc2_w 1691212252
    //   886: l2i
    //   887: ldc -1811538744
    //   889: ixor
    //   890: goto -> 900
    //   893: ldc2_w 483983668
    //   896: l2i
    //   897: ldc -1247982218
    //   899: ixor
    //   900: ldc2_w -491426096
    //   903: l2i
    //   904: ldc -1320547387
    //   906: ixor
    //   907: ixor
    //   908: lookupswitch default -> 936, -1556832255 -> 948, -1534911238 -> 893
    //   936: putstatic bigname/zprestige/webhack/features/modules/Client/RPC.INSTANCE : Lbigname/zprestige/webhack/features/modules/Client/RPC;
    //   939: return
    //   940: aconst_null
    //   941: athrow
    //   942: aconst_null
    //   943: athrow
    //   944: aconst_null
    //   945: athrow
    //   946: aconst_null
    //   947: athrow
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
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	940	0	this	Lbigname/zprestige/webhack/features/modules/Client/RPC;
  }
  
  public void onLogout() {
    Perry1.3l(this, (int)814216040L ^ 0x3AD97C1F);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void onLogin() {
    Perry1.3v(this, (int)-251296425L ^ 0xC0714288);
  }
  
  public void onDisable() {
    Perry1.4h(this, (int)-665515403L ^ 0xA6CD116F);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Client\RPC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */