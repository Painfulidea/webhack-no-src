package bigname.zprestige.webhack.features.modules.Hud;

import Perryc;
import bigname.zprestige.webhack.event.events.Render2DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class PotionEffects extends Module {
  public Setting<Boolean> bottomAlign;
  
  public int color;
  
  public Setting<Boolean> grayNess;
  
  public PotionEffects() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 135707787
    //   9: l2i
    //   10: ldc -319852445
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -258989074
    //   19: l2i
    //   20: ldc -401951427
    //   22: ixor
    //   23: ldc2_w 239081096
    //   26: l2i
    //   27: ldc 2064290053
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1850520731 -> 1284, -42551182 -> 16
    //   56: aload_0
    //   57: ldc '㌜㶾冧ೡ๜鿠蹥൓媋ਲ਼⾀'
    //   59: getstatic Perryc.0 : I
    //   62: ifle -> 75
    //   65: ldc2_w -346495427
    //   68: l2i
    //   69: ldc -2034953866
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -1210765014
    //   78: l2i
    //   79: ldc 536106599
    //   81: ixor
    //   82: ldc2_w 1075949321
    //   85: l2i
    //   86: ldc 1752190543
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 116, 1169954317 -> 1286, 1853290314 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '㌚㶧冤೮๠鿵踣ൃ媚੧⾖照覦缳辜㩒Ᵹ'
    //   121: getstatic Perryc.0 : I
    //   124: ifle -> 137
    //   127: ldc2_w 1525847095
    //   130: l2i
    //   131: ldc -2112957776
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w -613974525
    //   140: l2i
    //   141: ldc 214767761
    //   143: ixor
    //   144: ldc2_w -1835236105
    //   147: l2i
    //   148: ldc 1596503140
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 1294, 357070356 -> 137, 438195713 -> 180
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.c : I
    //   186: iflt -> 199
    //   189: ldc2_w 1278624649
    //   192: l2i
    //   193: ldc 2114171103
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w 1129717027
    //   202: l2i
    //   203: ldc -1231151435
    //   205: ixor
    //   206: ldc2_w -1174833064
    //   209: l2i
    //   210: ldc 1404120737
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 1256, -662854225 -> 199, 528504175 -> 240
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.HUD : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w 869179684
    //   246: l2i
    //   247: ldc 869179685
    //   249: ixor
    //   250: ldc2_w 921059014
    //   253: l2i
    //   254: ldc 921059014
    //   256: ixor
    //   257: ldc2_w -690150759
    //   260: l2i
    //   261: ldc -690150759
    //   263: ixor
    //   264: getstatic Perryc.0 : I
    //   267: ifle -> 280
    //   270: ldc2_w 1299573424
    //   273: l2i
    //   274: ldc 799559598
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w 1018016411
    //   283: l2i
    //   284: ldc 1641006376
    //   286: ixor
    //   287: ldc2_w 1128851019
    //   290: l2i
    //   291: ldc -1607470418
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 320, -2118471173 -> 1258, 1486082502 -> 280
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.c : I
    //   326: iflt -> 339
    //   329: ldc2_w -2083779335
    //   332: l2i
    //   333: ldc -498977653
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w -1200788015
    //   342: l2i
    //   343: ldc -1037571877
    //   345: ixor
    //   346: ldc2_w 1863183327
    //   349: l2i
    //   350: ldc -1908890262
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 1264, -2135198009 -> 339, -1686123585 -> 380
    //   380: aload_0
    //   381: getstatic Perryc.1 : I
    //   384: ifeq -> 397
    //   387: ldc2_w -1272346565
    //   390: l2i
    //   391: ldc 1312393180
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w 1090180671
    //   400: l2i
    //   401: ldc 1112897943
    //   403: ixor
    //   404: ldc2_w 111185769
    //   407: l2i
    //   408: ldc 1613556375
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 440, -1667470823 -> 1278, -1240747307 -> 397
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc '㌁㶮'
    //   447: getstatic Perryc.0 : I
    //   450: ifle -> 463
    //   453: ldc2_w 378760186
    //   456: l2i
    //   457: ldc 2103933776
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w -1265719726
    //   466: l2i
    //   467: ldc -2114152752
    //   469: ixor
    //   470: ldc2_w 1531275904
    //   473: l2i
    //   474: ldc 2065260373
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 504, -37216209 -> 463, 1269310847 -> 1260
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc2_w 1794877742
    //   510: l2i
    //   511: ldc 1794877743
    //   513: ixor
    //   514: getstatic Perryc.1 : I
    //   517: ifeq -> 530
    //   520: ldc2_w 611125592
    //   523: l2i
    //   524: ldc -1688644254
    //   526: ixor
    //   527: goto -> 537
    //   530: ldc2_w 1716427731
    //   533: l2i
    //   534: ldc -724250697
    //   536: ixor
    //   537: ldc2_w -1657914667
    //   540: l2i
    //   541: ldc -1248336011
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 1268, -1752333926 -> 530, -1708947004 -> 572
    //   572: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   575: getstatic Perryc.1 : I
    //   578: ifeq -> 591
    //   581: ldc2_w 1164421816
    //   584: l2i
    //   585: ldc -77509755
    //   587: ixor
    //   588: goto -> 598
    //   591: ldc2_w 1616031543
    //   594: l2i
    //   595: ldc -756038364
    //   597: ixor
    //   598: ldc2_w 1367672717
    //   601: l2i
    //   602: ldc 1327011095
    //   604: ixor
    //   605: ixor
    //   606: lookupswitch default -> 632, -2125559708 -> 591, -1600425049 -> 1274
    //   632: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   635: getstatic Perryc.1 : I
    //   638: ifeq -> 651
    //   641: ldc2_w -146488301
    //   644: l2i
    //   645: ldc -1444509771
    //   647: ixor
    //   648: goto -> 658
    //   651: ldc2_w 1719839382
    //   654: l2i
    //   655: ldc 1082284727
    //   657: ixor
    //   658: ldc2_w -1731395107
    //   661: l2i
    //   662: ldc -96365130
    //   664: ixor
    //   665: ixor
    //   666: lookupswitch default -> 1266, 1009702861 -> 651, 1150051402 -> 692
    //   692: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   695: getstatic Perryc.0 : I
    //   698: ifle -> 711
    //   701: ldc2_w 1873123201
    //   704: l2i
    //   705: ldc 332277294
    //   707: ixor
    //   708: goto -> 718
    //   711: ldc2_w -711526328
    //   714: l2i
    //   715: ldc -511365931
    //   717: ixor
    //   718: ldc2_w 977771389
    //   721: l2i
    //   722: ldc 1591437073
    //   724: ixor
    //   725: ixor
    //   726: lookupswitch default -> 752, 418860483 -> 1276, 1250918535 -> 711
    //   752: putfield grayNess : Lbigname/zprestige/webhack/features/setting/Setting;
    //   755: getstatic Perryc.0 : I
    //   758: ifle -> 771
    //   761: ldc2_w 1688092540
    //   764: l2i
    //   765: ldc 748086887
    //   767: ixor
    //   768: goto -> 778
    //   771: ldc2_w 321174748
    //   774: l2i
    //   775: ldc -1779633449
    //   777: ixor
    //   778: ldc2_w 357214685
    //   781: l2i
    //   782: ldc 390889487
    //   784: ixor
    //   785: ixor
    //   786: lookupswitch default -> 812, 1070530283 -> 771, 1242493129 -> 1262
    //   812: aload_0
    //   813: getstatic Perryc.0 : I
    //   816: ifle -> 829
    //   819: ldc2_w 1440525419
    //   822: l2i
    //   823: ldc 451612345
    //   825: ixor
    //   826: goto -> 836
    //   829: ldc2_w -1758888592
    //   832: l2i
    //   833: ldc 1709482554
    //   835: ixor
    //   836: ldc2_w 546910218
    //   839: l2i
    //   840: ldc -498623594
    //   842: ixor
    //   843: ixor
    //   844: lookupswitch default -> 1290, -1914107570 -> 829, 806581462 -> 872
    //   872: aload_0
    //   873: new bigname/zprestige/webhack/features/setting/Setting
    //   876: dup
    //   877: ldc '㌜㶣冧ೢ๘鿪蹪൑媆'
    //   879: getstatic Perryc.0 : I
    //   882: ifle -> 895
    //   885: ldc2_w -1124472488
    //   888: l2i
    //   889: ldc -631296464
    //   891: ixor
    //   892: goto -> 902
    //   895: ldc2_w 993980016
    //   898: l2i
    //   899: ldc -1033105574
    //   901: ixor
    //   902: ldc2_w -1145587525
    //   905: l2i
    //   906: ldc 2092442266
    //   908: ixor
    //   909: ixor
    //   910: lookupswitch default -> 936, -1582736055 -> 1270, 1080312761 -> 895
    //   936: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   939: ldc2_w -1652282191
    //   942: l2i
    //   943: ldc -1652282191
    //   945: ixor
    //   946: getstatic Perryc.1 : I
    //   949: ifeq -> 962
    //   952: ldc2_w 1062344255
    //   955: l2i
    //   956: ldc 1890668325
    //   958: ixor
    //   959: goto -> 969
    //   962: ldc2_w -916443937
    //   965: l2i
    //   966: ldc -780827589
    //   968: ixor
    //   969: ldc2_w 1102810102
    //   972: l2i
    //   973: ldc 1211297801
    //   975: ixor
    //   976: ixor
    //   977: lookupswitch default -> 1272, 295490331 -> 1004, 1181360869 -> 962
    //   1004: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1007: ldc '㌜㶼'
    //   1009: getstatic Perryc.c : I
    //   1012: iflt -> 1025
    //   1015: ldc2_w -245253641
    //   1018: l2i
    //   1019: ldc 2095709507
    //   1021: ixor
    //   1022: goto -> 1032
    //   1025: ldc2_w 1243863858
    //   1028: l2i
    //   1029: ldc -268577908
    //   1031: ixor
    //   1032: ldc2_w -489322643
    //   1035: l2i
    //   1036: ldc -1378032969
    //   1038: ixor
    //   1039: ixor
    //   1040: lookupswitch default -> 1068, -1031724690 -> 1292, -33486951 -> 1025
    //   1068: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1071: getstatic Perryc.1 : I
    //   1074: ifeq -> 1087
    //   1077: ldc2_w 112976745
    //   1080: l2i
    //   1081: ldc 2095603957
    //   1083: ixor
    //   1084: goto -> 1094
    //   1087: ldc2_w -1133894949
    //   1090: l2i
    //   1091: ldc -1358736443
    //   1093: ixor
    //   1094: ldc2_w 2082002855
    //   1097: l2i
    //   1098: ldc -1156576921
    //   1100: ixor
    //   1101: ixor
    //   1102: lookupswitch default -> 1280, -1118085796 -> 1087, -731795490 -> 1128
    //   1128: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    //   1131: getstatic Perryc.1 : I
    //   1134: ifeq -> 1147
    //   1137: ldc2_w -1853879300
    //   1140: l2i
    //   1141: ldc -1438530160
    //   1143: ixor
    //   1144: goto -> 1154
    //   1147: ldc2_w -1592171458
    //   1150: l2i
    //   1151: ldc 1138580523
    //   1153: ixor
    //   1154: ldc2_w -1719074333
    //   1157: l2i
    //   1158: ldc 979005678
    //   1160: ixor
    //   1161: ixor
    //   1162: lookupswitch default -> 1282, -1743601823 -> 1147, 1092045080 -> 1188
    //   1188: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1191: getstatic Perryc.c : I
    //   1194: iflt -> 1208
    //   1197: ldc2_w -856713420
    //   1200: l2i
    //   1201: ldc_w -1207913803
    //   1204: ixor
    //   1205: goto -> 1216
    //   1208: ldc2_w -1952283560
    //   1211: l2i
    //   1212: ldc_w 1544527726
    //   1215: ixor
    //   1216: ldc2_w -1581031038
    //   1219: l2i
    //   1220: ldc_w -471611540
    //   1223: ixor
    //   1224: ixor
    //   1225: lookupswitch default -> 1288, -1785872936 -> 1252, 919569263 -> 1208
    //   1252: putfield bottomAlign : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1255: return
    //   1256: aconst_null
    //   1257: athrow
    //   1258: aconst_null
    //   1259: athrow
    //   1260: aconst_null
    //   1261: athrow
    //   1262: aconst_null
    //   1263: athrow
    //   1264: aconst_null
    //   1265: athrow
    //   1266: aconst_null
    //   1267: athrow
    //   1268: aconst_null
    //   1269: athrow
    //   1270: aconst_null
    //   1271: athrow
    //   1272: aconst_null
    //   1273: athrow
    //   1274: aconst_null
    //   1275: athrow
    //   1276: aconst_null
    //   1277: athrow
    //   1278: aconst_null
    //   1279: athrow
    //   1280: aconst_null
    //   1281: athrow
    //   1282: aconst_null
    //   1283: athrow
    //   1284: aconst_null
    //   1285: athrow
    //   1286: aconst_null
    //   1287: athrow
    //   1288: aconst_null
    //   1289: athrow
    //   1290: aconst_null
    //   1291: athrow
    //   1292: aconst_null
    //   1293: athrow
    //   1294: aconst_null
    //   1295: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1256	0	this	Lbigname/zprestige/webhack/features/modules/Hud/PotionEffects;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Hud\PotionEffects.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */