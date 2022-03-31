package bigname.zprestige.webhack.features.gui.components.items.buttons;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.setting.Setting;

public class UnlimitedSlider extends Button {
  public Setting setting;
  
  public UnlimitedSlider(Setting setting) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -1693738178
    //   9: l2i
    //   10: ldc 544565780
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 724438416
    //   19: l2i
    //   20: ldc -1924750617
    //   22: ixor
    //   23: ldc2_w -1558183494
    //   26: l2i
    //   27: ldc 1858852766
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -876678503 -> 16, 1989486350 -> 558
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w -1803274297
    //   66: l2i
    //   67: ldc -2144725281
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -1897159544
    //   76: l2i
    //   77: ldc -1723448193
    //   79: ixor
    //   80: ldc2_w -780401958
    //   83: l2i
    //   84: ldc 579843451
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 548, -463579306 -> 116, -413296967 -> 73
    //   116: aload_1
    //   117: getstatic Perryc.1 : I
    //   120: ifeq -> 133
    //   123: ldc2_w -1607762170
    //   126: l2i
    //   127: ldc 1312352392
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w 507522635
    //   136: l2i
    //   137: ldc 251569768
    //   139: ixor
    //   140: ldc2_w -1958499317
    //   143: l2i
    //   144: ldc 1467663838
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 552, -863510026 -> 176, 841678427 -> 133
    //   176: invokevirtual getName : ()Ljava/lang/String;
    //   179: getstatic Perryc.1 : I
    //   182: ifeq -> 195
    //   185: ldc2_w -708345784
    //   188: l2i
    //   189: ldc -1837983273
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w -277755098
    //   198: l2i
    //   199: ldc 2008948780
    //   201: ixor
    //   202: ldc2_w -2076802799
    //   205: l2i
    //   206: ldc 630512955
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 236, -648853171 -> 195, -434682443 -> 550
    //   236: invokespecial <init> : (Ljava/lang/String;)V
    //   239: getstatic Perryc.1 : I
    //   242: ifeq -> 255
    //   245: ldc2_w 2085902693
    //   248: l2i
    //   249: ldc 2094747809
    //   251: ixor
    //   252: goto -> 262
    //   255: ldc2_w 199585450
    //   258: l2i
    //   259: ldc 704988118
    //   261: ixor
    //   262: ldc2_w 1961936013
    //   265: l2i
    //   266: ldc -1415125978
    //   268: ixor
    //   269: ixor
    //   270: lookupswitch default -> 554, -539416209 -> 255, -21623337 -> 296
    //   296: aload_0
    //   297: getstatic Perryc.0 : I
    //   300: ifle -> 313
    //   303: ldc2_w -521891292
    //   306: l2i
    //   307: ldc -1269430323
    //   309: ixor
    //   310: goto -> 320
    //   313: ldc2_w -523868888
    //   316: l2i
    //   317: ldc 161862586
    //   319: ixor
    //   320: ldc2_w 1908056527
    //   323: l2i
    //   324: ldc 785450086
    //   326: ixor
    //   327: ixor
    //   328: lookupswitch default -> 544, -1240984773 -> 356, 198783040 -> 313
    //   356: aload_1
    //   357: getstatic Perryc.1 : I
    //   360: ifeq -> 373
    //   363: ldc2_w -942676991
    //   366: l2i
    //   367: ldc -1091896075
    //   369: ixor
    //   370: goto -> 380
    //   373: ldc2_w 854072413
    //   376: l2i
    //   377: ldc -448651258
    //   379: ixor
    //   380: ldc2_w -1126223104
    //   383: l2i
    //   384: ldc 1620108695
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 416, -1519727005 -> 560, -1089706893 -> 373
    //   416: putfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   419: getstatic Perryc.0 : I
    //   422: ifle -> 435
    //   425: ldc2_w -1537625140
    //   428: l2i
    //   429: ldc 343688164
    //   431: ixor
    //   432: goto -> 442
    //   435: ldc2_w -1045013764
    //   438: l2i
    //   439: ldc 1171027873
    //   441: ixor
    //   442: ldc2_w -867707544
    //   445: l2i
    //   446: ldc -892163602
    //   448: ixor
    //   449: ixor
    //   450: lookupswitch default -> 476, -1229943634 -> 546, -456517202 -> 435
    //   476: aload_0
    //   477: ldc2_w 644648581
    //   480: l2i
    //   481: ldc 644648586
    //   483: ixor
    //   484: getstatic Perryc.0 : I
    //   487: ifle -> 500
    //   490: ldc2_w 1043277530
    //   493: l2i
    //   494: ldc 1903541557
    //   496: ixor
    //   497: goto -> 507
    //   500: ldc2_w -264910946
    //   503: l2i
    //   504: ldc -807779221
    //   506: ixor
    //   507: ldc2_w 1390579249
    //   510: l2i
    //   511: ldc -877771364
    //   513: ixor
    //   514: ixor
    //   515: lookupswitch default -> 540, -1334947560 -> 500, -703180734 -> 556
    //   540: putfield width : I
    //   543: return
    //   544: aconst_null
    //   545: athrow
    //   546: aconst_null
    //   547: athrow
    //   548: aconst_null
    //   549: athrow
    //   550: aconst_null
    //   551: athrow
    //   552: aconst_null
    //   553: athrow
    //   554: aconst_null
    //   555: athrow
    //   556: aconst_null
    //   557: athrow
    //   558: aconst_null
    //   559: athrow
    //   560: aconst_null
    //   561: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	544	0	this	Lbigname/zprestige/webhack/features/gui/components/items/buttons/UnlimitedSlider;
    //   0	544	1	setting	Lbigname/zprestige/webhack/features/setting/Setting;
  }
  
  public boolean getState() {
    return Perry1.4I(this, (int)-1904665891L ^ 0xF74F8525);
  }
  
  public void toggle() {
    Perry1.3P(this, (int)-1068153179L ^ 0xDA989C64);
  }
  
  public void drawScreen(int mouseX, int mouseY, float partialTicks) {
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
  
  public int getHeight() {
    return Perry1.2V(this, (int)-75339709L ^ 0xCDFF8D04);
  }
  
  public boolean isRight(int paramInt) {
    return Perry1.u(this, (int)1058304170L ^ 0x4A11B11D, paramInt);
  }
  
  public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 6267
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 6259
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 6251
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w -439417169
    //   33: l2i
    //   34: ldc_w 380773961
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1195167055
    //   44: l2i
    //   45: ldc_w 1578384009
    //   48: ixor
    //   49: ldc2_w 2133050275
    //   52: l2i
    //   53: ldc_w 1649876176
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 6140, -301334635 -> 41, 73148597 -> 84
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w -1611224870
    //   94: l2i
    //   95: ldc_w 1289770037
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -1174183317
    //   105: l2i
    //   106: ldc_w 1453482852
    //   109: ixor
    //   110: ldc2_w 71005627
    //   113: l2i
    //   114: ldc_w 864087988
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 6226, -619013376 -> 144, -458397984 -> 102
    //   144: iload_1
    //   145: getstatic Perryc.c : I
    //   148: iflt -> 162
    //   151: ldc2_w -1014360682
    //   154: l2i
    //   155: ldc_w -1041897385
    //   158: ixor
    //   159: goto -> 170
    //   162: ldc2_w 336753482
    //   165: l2i
    //   166: ldc_w -1784109038
    //   169: ixor
    //   170: ldc2_w 2047830720
    //   173: l2i
    //   174: ldc_w -1409379878
    //   177: ixor
    //   178: ixor
    //   179: lookupswitch default -> 6124, -744618277 -> 162, 1347100738 -> 204
    //   204: iload_2
    //   205: getstatic Perryc.1 : I
    //   208: ifeq -> 222
    //   211: ldc2_w -297026202
    //   214: l2i
    //   215: ldc_w -1339784183
    //   218: ixor
    //   219: goto -> 230
    //   222: ldc2_w -406208427
    //   225: l2i
    //   226: ldc_w -1167569871
    //   229: ixor
    //   230: ldc2_w 1019348182
    //   233: l2i
    //   234: ldc_w -1196449185
    //   237: ixor
    //   238: ixor
    //   239: lookupswitch default -> 6118, -640931091 -> 264, -637362202 -> 222
    //   264: iload_3
    //   265: getstatic Perryc.0 : I
    //   268: ifle -> 282
    //   271: ldc2_w -110103498
    //   274: l2i
    //   275: ldc_w 920777258
    //   278: ixor
    //   279: goto -> 290
    //   282: ldc2_w -1660918777
    //   285: l2i
    //   286: ldc_w 231619949
    //   289: ixor
    //   290: ldc2_w -1301210463
    //   293: l2i
    //   294: ldc_w 725360997
    //   297: ixor
    //   298: ixor
    //   299: lookupswitch default -> 6120, 159605422 -> 324, 1455635928 -> 282
    //   324: goto -> 328
    //   327: athrow
    //   328: invokespecial mouseClicked : (III)V
    //   331: goto -> 335
    //   334: athrow
    //   335: getstatic Perryc.0 : I
    //   338: ifle -> 352
    //   341: ldc2_w 1724394381
    //   344: l2i
    //   345: ldc_w -1895094617
    //   348: ixor
    //   349: goto -> 360
    //   352: ldc2_w 861396941
    //   355: l2i
    //   356: ldc_w 519323595
    //   359: ixor
    //   360: ldc2_w -587389036
    //   363: l2i
    //   364: ldc_w -33924410
    //   367: ixor
    //   368: ixor
    //   369: lookupswitch default -> 6146, -926650248 -> 352, 212114772 -> 396
    //   396: aload_0
    //   397: getstatic Perryc.1 : I
    //   400: ifeq -> 414
    //   403: ldc2_w 622139698
    //   406: l2i
    //   407: ldc_w -963583773
    //   410: ixor
    //   411: goto -> 422
    //   414: ldc2_w -646841180
    //   417: l2i
    //   418: ldc_w -1058849636
    //   421: ixor
    //   422: ldc2_w -1128321202
    //   425: l2i
    //   426: ldc_w -1303519146
    //   429: ixor
    //   430: ixor
    //   431: lookupswitch default -> 456, -708289503 -> 414, -310954295 -> 6148
    //   456: iload_1
    //   457: getstatic Perryc.1 : I
    //   460: ifeq -> 474
    //   463: ldc2_w -914584202
    //   466: l2i
    //   467: ldc_w -1216559925
    //   470: ixor
    //   471: goto -> 482
    //   474: ldc2_w 380994417
    //   477: l2i
    //   478: ldc_w -1498191982
    //   481: ixor
    //   482: ldc2_w -18515904
    //   485: l2i
    //   486: ldc_w 685897267
    //   489: ixor
    //   490: ixor
    //   491: lookupswitch default -> 516, -1476081714 -> 6152, 1275696838 -> 474
    //   516: iload_2
    //   517: getstatic Perryc.c : I
    //   520: iflt -> 534
    //   523: ldc2_w -1735123604
    //   526: l2i
    //   527: ldc_w -1988905769
    //   530: ixor
    //   531: goto -> 542
    //   534: ldc2_w -1618985227
    //   537: l2i
    //   538: ldc_w -1370034306
    //   541: ixor
    //   542: ldc2_w -1328998995
    //   545: l2i
    //   546: ldc_w 280446502
    //   549: ixor
    //   550: ixor
    //   551: lookupswitch default -> 576, -1318138787 -> 534, -1315309008 -> 6158
    //   576: goto -> 580
    //   579: athrow
    //   580: invokevirtual isHovering : (II)Z
    //   583: goto -> 587
    //   586: athrow
    //   587: ifeq -> 601
    //   590: ldc2_w -1586776612
    //   593: l2i
    //   594: ldc_w 1290819904
    //   597: ixor
    //   598: goto -> 609
    //   601: ldc2_w 522505056
    //   604: l2i
    //   605: ldc_w -222353413
    //   608: ixor
    //   609: ldc2_w 1591149273
    //   612: l2i
    //   613: ldc_w -1755109850
    //   616: ixor
    //   617: ixor
    //   618: tableswitch default -> 590, 607111267 -> 640, 607111268 -> 6075
    //   640: getstatic Perryc.c : I
    //   643: iflt -> 657
    //   646: ldc2_w -1201026814
    //   649: l2i
    //   650: ldc_w -1944517603
    //   653: ixor
    //   654: goto -> 665
    //   657: ldc2_w 1329384578
    //   660: l2i
    //   661: ldc_w 796127104
    //   664: ixor
    //   665: ldc2_w 2044413408
    //   668: l2i
    //   669: ldc_w 78468215
    //   672: ixor
    //   673: ixor
    //   674: lookupswitch default -> 6238, 490287765 -> 700, 1225186440 -> 657
    //   700: getstatic bigname/zprestige/webhack/features/gui/components/items/buttons/UnlimitedSlider.mc : Lnet/minecraft/client/Minecraft;
    //   703: getstatic Perryc.c : I
    //   706: iflt -> 720
    //   709: ldc2_w 161025720
    //   712: l2i
    //   713: ldc_w -132458376
    //   716: ixor
    //   717: goto -> 728
    //   720: ldc2_w 1094896455
    //   723: l2i
    //   724: ldc_w -930998639
    //   727: ixor
    //   728: ldc2_w -1211946228
    //   731: l2i
    //   732: ldc_w 1149855797
    //   735: ixor
    //   736: ixor
    //   737: lookupswitch default -> 6150, 46765561 -> 720, 2055905007 -> 764
    //   764: goto -> 768
    //   767: athrow
    //   768: invokevirtual func_147118_V : ()Lnet/minecraft/client/audio/SoundHandler;
    //   771: goto -> 775
    //   774: athrow
    //   775: getstatic Perryc.1 : I
    //   778: ifeq -> 792
    //   781: ldc2_w -963921406
    //   784: l2i
    //   785: ldc_w -1553173350
    //   788: ixor
    //   789: goto -> 800
    //   792: ldc2_w 626970791
    //   795: l2i
    //   796: ldc_w -1465496621
    //   799: ixor
    //   800: ldc2_w 1221685990
    //   803: l2i
    //   804: ldc_w -300018526
    //   807: ixor
    //   808: ixor
    //   809: lookupswitch default -> 6102, -1020745508 -> 792, 725089584 -> 836
    //   836: getstatic net/minecraft/init/SoundEvents.field_187909_gi : Lnet/minecraft/util/SoundEvent;
    //   839: ldc_w 619.039
    //   842: invokestatic floatToIntBits : (F)I
    //   845: ldc_w 2073739903
    //   848: ixor
    //   849: invokestatic intBitsToFloat : (I)F
    //   852: getstatic Perryc.c : I
    //   855: iflt -> 869
    //   858: ldc2_w -172383221
    //   861: l2i
    //   862: ldc_w -153520429
    //   865: ixor
    //   866: goto -> 877
    //   869: ldc2_w -589560394
    //   872: l2i
    //   873: ldc_w -446896323
    //   876: ixor
    //   877: ldc2_w 1127953989
    //   880: l2i
    //   881: ldc_w 323110719
    //   884: ixor
    //   885: ixor
    //   886: lookupswitch default -> 912, -1026977861 -> 869, 1394189218 -> 6182
    //   912: goto -> 916
    //   915: athrow
    //   916: invokestatic func_184371_a : (Lnet/minecraft/util/SoundEvent;F)Lnet/minecraft/client/audio/PositionedSoundRecord;
    //   919: goto -> 923
    //   922: athrow
    //   923: getstatic Perryc.1 : I
    //   926: ifeq -> 940
    //   929: ldc2_w -92169022
    //   932: l2i
    //   933: ldc_w 1752129493
    //   936: ixor
    //   937: goto -> 948
    //   940: ldc2_w -1066913615
    //   943: l2i
    //   944: ldc_w -951844163
    //   947: ixor
    //   948: ldc2_w 1996525524
    //   951: l2i
    //   952: ldc_w 1473242676
    //   955: ixor
    //   956: ixor
    //   957: lookupswitch default -> 984, -1306416393 -> 6128, 1874475275 -> 940
    //   984: goto -> 988
    //   987: athrow
    //   988: invokevirtual func_147682_a : (Lnet/minecraft/client/audio/ISound;)V
    //   991: goto -> 995
    //   994: athrow
    //   995: getstatic Perryc.1 : I
    //   998: ifeq -> 1012
    //   1001: ldc2_w 1333022558
    //   1004: l2i
    //   1005: ldc_w -1743924985
    //   1008: ixor
    //   1009: goto -> 1020
    //   1012: ldc2_w 101692581
    //   1015: l2i
    //   1016: ldc_w 756827630
    //   1019: ixor
    //   1020: ldc2_w -2143031468
    //   1023: l2i
    //   1024: ldc_w -2084191845
    //   1027: ixor
    //   1028: ixor
    //   1029: lookupswitch default -> 6176, -721440618 -> 1012, 680910724 -> 1056
    //   1056: aload_0
    //   1057: getstatic Perryc.0 : I
    //   1060: ifle -> 1074
    //   1063: ldc2_w 767700277
    //   1066: l2i
    //   1067: ldc_w -2045172863
    //   1070: ixor
    //   1071: goto -> 1082
    //   1074: ldc2_w 137421220
    //   1077: l2i
    //   1078: ldc_w -1199808170
    //   1081: ixor
    //   1082: ldc2_w -1368134017
    //   1085: l2i
    //   1086: ldc_w 1753336653
    //   1089: ixor
    //   1090: ixor
    //   1091: lookupswitch default -> 1116, -397206517 -> 1074, 1831414662 -> 6104
    //   1116: iload_1
    //   1117: getstatic Perryc.c : I
    //   1120: iflt -> 1134
    //   1123: ldc2_w 851120852
    //   1126: l2i
    //   1127: ldc_w -1912734954
    //   1130: ixor
    //   1131: goto -> 1142
    //   1134: ldc2_w -286967739
    //   1137: l2i
    //   1138: ldc_w -861228949
    //   1141: ixor
    //   1142: ldc2_w -404214270
    //   1145: l2i
    //   1146: ldc_w 1745099697
    //   1149: ixor
    //   1150: ixor
    //   1151: lookupswitch default -> 6198, -1381778019 -> 1176, 816503921 -> 1134
    //   1176: goto -> 1180
    //   1179: athrow
    //   1180: invokevirtual isRight : (I)Z
    //   1183: goto -> 1187
    //   1186: athrow
    //   1187: ifeq -> 1201
    //   1190: ldc2_w -988387084
    //   1193: l2i
    //   1194: ldc_w 949124755
    //   1197: ixor
    //   1198: goto -> 1209
    //   1201: ldc2_w -1163143292
    //   1204: l2i
    //   1205: ldc_w 1194312162
    //   1208: ixor
    //   1209: ldc2_w -1708462383
    //   1212: l2i
    //   1213: ldc_w -729232330
    //   1216: ixor
    //   1217: ixor
    //   1218: tableswitch default -> 1190, -1289341824 -> 1240, -1289341823 -> 3658
    //   1240: getstatic Perryc.1 : I
    //   1243: ifeq -> 1257
    //   1246: ldc2_w 1762892658
    //   1249: l2i
    //   1250: ldc_w 1626366113
    //   1253: ixor
    //   1254: goto -> 1265
    //   1257: ldc2_w 909128591
    //   1260: l2i
    //   1261: ldc_w 1382962378
    //   1264: ixor
    //   1265: ldc2_w -1414037098
    //   1268: l2i
    //   1269: ldc_w 241473228
    //   1272: ixor
    //   1273: ixor
    //   1274: lookupswitch default -> 6108, -1406079863 -> 1257, -1047695329 -> 1300
    //   1300: aload_0
    //   1301: getstatic Perryc.c : I
    //   1304: iflt -> 1318
    //   1307: ldc2_w 1906303312
    //   1310: l2i
    //   1311: ldc_w -2086759196
    //   1314: ixor
    //   1315: goto -> 1326
    //   1318: ldc2_w 1571248658
    //   1321: l2i
    //   1322: ldc_w 1547736237
    //   1325: ixor
    //   1326: ldc2_w 256725484
    //   1329: l2i
    //   1330: ldc_w -468698009
    //   1333: ixor
    //   1334: ixor
    //   1335: lookupswitch default -> 1360, -677628838 -> 1318, 425465919 -> 6168
    //   1360: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1363: getstatic Perryc.1 : I
    //   1366: ifeq -> 1380
    //   1369: ldc2_w 1037589350
    //   1372: l2i
    //   1373: ldc_w 1021778950
    //   1376: ixor
    //   1377: goto -> 1388
    //   1380: ldc2_w -285412571
    //   1383: l2i
    //   1384: ldc_w -1751867987
    //   1387: ixor
    //   1388: ldc2_w 436424284
    //   1391: l2i
    //   1392: ldc_w -152076539
    //   1395: ixor
    //   1396: ixor
    //   1397: lookupswitch default -> 1424, -304908743 -> 6192, 312574133 -> 1380
    //   1424: goto -> 1428
    //   1427: athrow
    //   1428: invokevirtual getValue : ()Ljava/lang/Object;
    //   1431: goto -> 1435
    //   1434: athrow
    //   1435: instanceof java/lang/Double
    //   1438: ifeq -> 1452
    //   1441: ldc2_w 1590495786
    //   1444: l2i
    //   1445: ldc_w -21394671
    //   1448: ixor
    //   1449: goto -> 1460
    //   1452: ldc2_w 1144810942
    //   1455: l2i
    //   1456: ldc_w -464982906
    //   1459: ixor
    //   1460: ldc2_w 798083730
    //   1463: l2i
    //   1464: ldc_w 50738444
    //   1467: ixor
    //   1468: ixor
    //   1469: tableswitch default -> 1441, -1931247963 -> 1492, -1931247962 -> 2046
    //   1492: getstatic Perryc.c : I
    //   1495: iflt -> 1509
    //   1498: ldc2_w -218248795
    //   1501: l2i
    //   1502: ldc_w -928473679
    //   1505: ixor
    //   1506: goto -> 1517
    //   1509: ldc2_w -726527357
    //   1512: l2i
    //   1513: ldc_w 1912247478
    //   1516: ixor
    //   1517: ldc2_w 330065266
    //   1520: l2i
    //   1521: ldc_w 342253463
    //   1524: ixor
    //   1525: ixor
    //   1526: lookupswitch default -> 1552, 1033858801 -> 6212, 2065949097 -> 1509
    //   1552: aload_0
    //   1553: getstatic Perryc.c : I
    //   1556: iflt -> 1570
    //   1559: ldc2_w -618304915
    //   1562: l2i
    //   1563: ldc_w -108059166
    //   1566: ixor
    //   1567: goto -> 1578
    //   1570: ldc2_w 123213634
    //   1573: l2i
    //   1574: ldc_w 1777219043
    //   1577: ixor
    //   1578: ldc2_w -1779844851
    //   1581: l2i
    //   1582: ldc_w -1325198948
    //   1585: ixor
    //   1586: ixor
    //   1587: lookupswitch default -> 6188, 104916766 -> 1570, 1247578672 -> 1612
    //   1612: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1615: getstatic Perryc.c : I
    //   1618: iflt -> 1632
    //   1621: ldc2_w -1051188578
    //   1624: l2i
    //   1625: ldc_w 743049563
    //   1628: ixor
    //   1629: goto -> 1640
    //   1632: ldc2_w -219106940
    //   1635: l2i
    //   1636: ldc_w -1871266014
    //   1639: ixor
    //   1640: ldc2_w -1187140620
    //   1643: l2i
    //   1644: ldc_w 2071163430
    //   1647: ixor
    //   1648: ixor
    //   1649: lookupswitch default -> 6110, -1597450380 -> 1676, 794620439 -> 1632
    //   1676: aload_0
    //   1677: getstatic Perryc.0 : I
    //   1680: ifle -> 1694
    //   1683: ldc2_w -211534279
    //   1686: l2i
    //   1687: ldc_w 543486633
    //   1690: ixor
    //   1691: goto -> 1702
    //   1694: ldc2_w -2144040012
    //   1697: l2i
    //   1698: ldc_w -1642105014
    //   1701: ixor
    //   1702: ldc2_w -1485465803
    //   1705: l2i
    //   1706: ldc_w 843638071
    //   1709: ixor
    //   1710: ixor
    //   1711: lookupswitch default -> 6122, -1961455876 -> 1736, 1178451602 -> 1694
    //   1736: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1739: getstatic Perryc.1 : I
    //   1742: ifeq -> 1756
    //   1745: ldc2_w -1436325110
    //   1748: l2i
    //   1749: ldc_w 1441962480
    //   1752: ixor
    //   1753: goto -> 1764
    //   1756: ldc2_w -1562042085
    //   1759: l2i
    //   1760: ldc_w 180970192
    //   1763: ixor
    //   1764: ldc2_w -2001617731
    //   1767: l2i
    //   1768: ldc_w 1312065083
    //   1771: ixor
    //   1772: ixor
    //   1773: lookupswitch default -> 6092, 957663356 -> 1756, 1856600397 -> 1800
    //   1800: goto -> 1804
    //   1803: athrow
    //   1804: invokevirtual getValue : ()Ljava/lang/Object;
    //   1807: goto -> 1811
    //   1810: athrow
    //   1811: checkcast java/lang/Double
    //   1814: getstatic Perryc.c : I
    //   1817: iflt -> 1831
    //   1820: ldc2_w -643321138
    //   1823: l2i
    //   1824: ldc_w 2018219494
    //   1827: ixor
    //   1828: goto -> 1839
    //   1831: ldc2_w 555002282
    //   1834: l2i
    //   1835: ldc_w 2112877833
    //   1838: ixor
    //   1839: ldc2_w -1893427730
    //   1842: l2i
    //   1843: ldc_w 1434811052
    //   1846: ixor
    //   1847: ixor
    //   1848: lookupswitch default -> 1876, -2043163942 -> 1831, 2068695146 -> 6094
    //   1876: goto -> 1880
    //   1879: athrow
    //   1880: invokevirtual doubleValue : ()D
    //   1883: goto -> 1887
    //   1886: athrow
    //   1887: ldc2_w 12.562704830375589
    //   1890: invokestatic doubleToLongBits : (D)J
    //   1893: ldc2_w 9212429812444399453
    //   1896: lxor
    //   1897: invokestatic longBitsToDouble : (J)D
    //   1900: dadd
    //   1901: getstatic Perryc.1 : I
    //   1904: ifeq -> 1918
    //   1907: ldc2_w -370592366
    //   1910: l2i
    //   1911: ldc_w -513446231
    //   1914: ixor
    //   1915: goto -> 1926
    //   1918: ldc2_w -47860416
    //   1921: l2i
    //   1922: ldc_w 976251477
    //   1925: ixor
    //   1926: ldc2_w 1452312331
    //   1929: l2i
    //   1930: ldc_w 1382958062
    //   1933: ixor
    //   1934: ixor
    //   1935: lookupswitch default -> 6184, -1008002064 -> 1960, 208838622 -> 1918
    //   1960: goto -> 1964
    //   1963: athrow
    //   1964: invokestatic valueOf : (D)Ljava/lang/Double;
    //   1967: goto -> 1971
    //   1970: athrow
    //   1971: getstatic Perryc.c : I
    //   1974: iflt -> 1988
    //   1977: ldc2_w -754949091
    //   1980: l2i
    //   1981: ldc_w 1530592562
    //   1984: ixor
    //   1985: goto -> 1996
    //   1988: ldc2_w 1085236077
    //   1991: l2i
    //   1992: ldc_w 1403369078
    //   1995: ixor
    //   1996: ldc2_w -1983251470
    //   1999: l2i
    //   2000: ldc_w -484221922
    //   2003: ixor
    //   2004: ixor
    //   2005: lookupswitch default -> 6240, -489668925 -> 1988, 2044752631 -> 2032
    //   2032: goto -> 2036
    //   2035: athrow
    //   2036: invokevirtual setValue : (Ljava/lang/Object;)V
    //   2039: goto -> 2043
    //   2042: athrow
    //   2043: goto -> 6075
    //   2046: getstatic Perryc.1 : I
    //   2049: ifeq -> 2063
    //   2052: ldc2_w 1018487933
    //   2055: l2i
    //   2056: ldc_w -1173122951
    //   2059: ixor
    //   2060: goto -> 2071
    //   2063: ldc2_w 669281001
    //   2066: l2i
    //   2067: ldc_w -1754231760
    //   2070: ixor
    //   2071: ldc2_w 2130438924
    //   2074: l2i
    //   2075: ldc_w 1397018218
    //   2078: ixor
    //   2079: ixor
    //   2080: lookupswitch default -> 2108, -1614950876 -> 2063, -1424469662 -> 6218
    //   2108: aload_0
    //   2109: getstatic Perryc.0 : I
    //   2112: ifle -> 2126
    //   2115: ldc2_w -1593141219
    //   2118: l2i
    //   2119: ldc_w -159802958
    //   2122: ixor
    //   2123: goto -> 2134
    //   2126: ldc2_w 315754466
    //   2129: l2i
    //   2130: ldc_w 702120717
    //   2133: ixor
    //   2134: ldc2_w -849315818
    //   2137: l2i
    //   2138: ldc_w -72762043
    //   2141: ixor
    //   2142: ixor
    //   2143: lookupswitch default -> 6234, 230834620 -> 2168, 1639630076 -> 2126
    //   2168: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2171: getstatic Perryc.0 : I
    //   2174: ifle -> 2188
    //   2177: ldc2_w -1918451657
    //   2180: l2i
    //   2181: ldc_w -1016395
    //   2184: ixor
    //   2185: goto -> 2196
    //   2188: ldc2_w 535969193
    //   2191: l2i
    //   2192: ldc_w 700142874
    //   2195: ixor
    //   2196: ldc2_w 1370212829
    //   2199: l2i
    //   2200: ldc_w -1342621696
    //   2203: ixor
    //   2204: ixor
    //   2205: lookupswitch default -> 2232, -1945875361 -> 6230, 1015346555 -> 2188
    //   2232: goto -> 2236
    //   2235: athrow
    //   2236: invokevirtual getValue : ()Ljava/lang/Object;
    //   2239: goto -> 2243
    //   2242: athrow
    //   2243: instanceof java/lang/Float
    //   2246: ifeq -> 2260
    //   2249: ldc2_w -548173827
    //   2252: l2i
    //   2253: ldc_w -2029721686
    //   2256: ixor
    //   2257: goto -> 2268
    //   2260: ldc2_w -666288890
    //   2263: l2i
    //   2264: ldc_w -2145493678
    //   2267: ixor
    //   2268: ldc2_w 530141894
    //   2271: l2i
    //   2272: ldc_w -723170488
    //   2275: ixor
    //   2276: ixor
    //   2277: tableswitch default -> 2249, -1825867303 -> 2300, -1825867302 -> 2854
    //   2300: getstatic Perryc.c : I
    //   2303: iflt -> 2317
    //   2306: ldc2_w -2103628651
    //   2309: l2i
    //   2310: ldc_w -1201370456
    //   2313: ixor
    //   2314: goto -> 2325
    //   2317: ldc2_w 1363844792
    //   2320: l2i
    //   2321: ldc_w 1244020823
    //   2324: ixor
    //   2325: ldc2_w -595137628
    //   2328: l2i
    //   2329: ldc_w 740487954
    //   2332: ixor
    //   2333: ixor
    //   2334: lookupswitch default -> 6086, -899826037 -> 2317, -339163559 -> 2360
    //   2360: aload_0
    //   2361: getstatic Perryc.0 : I
    //   2364: ifle -> 2378
    //   2367: ldc2_w 308037517
    //   2370: l2i
    //   2371: ldc_w 1474016060
    //   2374: ixor
    //   2375: goto -> 2386
    //   2378: ldc2_w -430546943
    //   2381: l2i
    //   2382: ldc_w 1697493835
    //   2385: ixor
    //   2386: ldc2_w 796570405
    //   2389: l2i
    //   2390: ldc_w -595097777
    //   2393: ixor
    //   2394: ixor
    //   2395: lookupswitch default -> 6170, -1233469221 -> 2378, 1887889184 -> 2420
    //   2420: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2423: getstatic Perryc.c : I
    //   2426: iflt -> 2440
    //   2429: ldc2_w 1575834399
    //   2432: l2i
    //   2433: ldc_w 35974958
    //   2436: ixor
    //   2437: goto -> 2448
    //   2440: ldc2_w 778871340
    //   2443: l2i
    //   2444: ldc_w 294752815
    //   2447: ixor
    //   2448: ldc2_w -1826324090
    //   2451: l2i
    //   2452: ldc_w -472193301
    //   2455: ixor
    //   2456: ixor
    //   2457: lookupswitch default -> 6164, 792189788 -> 2440, 1325619054 -> 2484
    //   2484: aload_0
    //   2485: getstatic Perryc.1 : I
    //   2488: ifeq -> 2502
    //   2491: ldc2_w 1786105820
    //   2494: l2i
    //   2495: ldc_w -349368668
    //   2498: ixor
    //   2499: goto -> 2510
    //   2502: ldc2_w -1329463239
    //   2505: l2i
    //   2506: ldc_w 895584725
    //   2509: ixor
    //   2510: ldc2_w -2038135343
    //   2513: l2i
    //   2514: ldc_w -1441103070
    //   2517: ixor
    //   2518: ixor
    //   2519: lookupswitch default -> 2544, -1379481717 -> 6076, -1346654374 -> 2502
    //   2544: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2547: getstatic Perryc.0 : I
    //   2550: ifle -> 2564
    //   2553: ldc2_w -992385155
    //   2556: l2i
    //   2557: ldc_w -15665288
    //   2560: ixor
    //   2561: goto -> 2572
    //   2564: ldc2_w -1944813794
    //   2567: l2i
    //   2568: ldc_w 372086966
    //   2571: ixor
    //   2572: ldc2_w -867846471
    //   2575: l2i
    //   2576: ldc_w -253028681
    //   2579: ixor
    //   2580: ixor
    //   2581: lookupswitch default -> 2608, 124203019 -> 6186, 1531070109 -> 2564
    //   2608: goto -> 2612
    //   2611: athrow
    //   2612: invokevirtual getValue : ()Ljava/lang/Object;
    //   2615: goto -> 2619
    //   2618: athrow
    //   2619: checkcast java/lang/Float
    //   2622: getstatic Perryc.0 : I
    //   2625: ifle -> 2639
    //   2628: ldc2_w -1013682118
    //   2631: l2i
    //   2632: ldc_w 1231972070
    //   2635: ixor
    //   2636: goto -> 2647
    //   2639: ldc2_w 132730570
    //   2642: l2i
    //   2643: ldc_w 788481161
    //   2646: ixor
    //   2647: ldc2_w -921054239
    //   2650: l2i
    //   2651: ldc_w 1456077251
    //   2654: ixor
    //   2655: ixor
    //   2656: lookupswitch default -> 6220, -1228529567 -> 2684, 355089662 -> 2639
    //   2684: goto -> 2688
    //   2687: athrow
    //   2688: invokevirtual floatValue : ()F
    //   2691: goto -> 2695
    //   2694: athrow
    //   2695: ldc_w 14.31117
    //   2698: invokestatic floatToIntBits : (F)I
    //   2701: ldc_w 2128935565
    //   2704: ixor
    //   2705: invokestatic intBitsToFloat : (I)F
    //   2708: fadd
    //   2709: getstatic Perryc.0 : I
    //   2712: ifle -> 2726
    //   2715: ldc2_w -1295502768
    //   2718: l2i
    //   2719: ldc_w -1218618381
    //   2722: ixor
    //   2723: goto -> 2734
    //   2726: ldc2_w -1693248657
    //   2729: l2i
    //   2730: ldc_w -782744624
    //   2733: ixor
    //   2734: ldc2_w -487726398
    //   2737: l2i
    //   2738: ldc_w 1684252901
    //   2741: ixor
    //   2742: ixor
    //   2743: lookupswitch default -> 2768, -2095373436 -> 6142, -733018408 -> 2726
    //   2768: goto -> 2772
    //   2771: athrow
    //   2772: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2775: goto -> 2779
    //   2778: athrow
    //   2779: getstatic Perryc.0 : I
    //   2782: ifle -> 2796
    //   2785: ldc2_w -617280411
    //   2788: l2i
    //   2789: ldc_w 650415243
    //   2792: ixor
    //   2793: goto -> 2804
    //   2796: ldc2_w 1410698610
    //   2799: l2i
    //   2800: ldc_w -1178958047
    //   2803: ixor
    //   2804: ldc2_w -1456686144
    //   2807: l2i
    //   2808: ldc_w -1700776650
    //   2811: ixor
    //   2812: ixor
    //   2813: lookupswitch default -> 2840, -830665192 -> 6178, 1898440391 -> 2796
    //   2840: goto -> 2844
    //   2843: athrow
    //   2844: invokevirtual setValue : (Ljava/lang/Object;)V
    //   2847: goto -> 2851
    //   2850: athrow
    //   2851: goto -> 6075
    //   2854: getstatic Perryc.c : I
    //   2857: iflt -> 2871
    //   2860: ldc2_w 1072352217
    //   2863: l2i
    //   2864: ldc_w -1024182383
    //   2867: ixor
    //   2868: goto -> 2879
    //   2871: ldc2_w 1836506863
    //   2874: l2i
    //   2875: ldc_w -237581819
    //   2878: ixor
    //   2879: ldc2_w -279087625
    //   2882: l2i
    //   2883: ldc_w -359841274
    //   2886: ixor
    //   2887: ixor
    //   2888: lookupswitch default -> 6134, -1720704229 -> 2916, -120665159 -> 2871
    //   2916: aload_0
    //   2917: getstatic Perryc.1 : I
    //   2920: ifeq -> 2934
    //   2923: ldc2_w 1341034800
    //   2926: l2i
    //   2927: ldc_w -1348773355
    //   2930: ixor
    //   2931: goto -> 2942
    //   2934: ldc2_w -1329730857
    //   2937: l2i
    //   2938: ldc_w -52995905
    //   2941: ixor
    //   2942: ldc2_w -1737902198
    //   2945: l2i
    //   2946: ldc_w 2011212658
    //   2949: ixor
    //   2950: ixor
    //   2951: lookupswitch default -> 6228, -1545359728 -> 2976, 268228573 -> 2934
    //   2976: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2979: getstatic Perryc.c : I
    //   2982: iflt -> 2996
    //   2985: ldc2_w -998132658
    //   2988: l2i
    //   2989: ldc_w -972577531
    //   2992: ixor
    //   2993: goto -> 3004
    //   2996: ldc2_w 192963524
    //   2999: l2i
    //   3000: ldc_w -1067588300
    //   3003: ixor
    //   3004: ldc2_w 1035361422
    //   3007: l2i
    //   3008: ldc_w 722320897
    //   3011: ixor
    //   3012: ixor
    //   3013: lookupswitch default -> 6080, -580492161 -> 3040, 339604420 -> 2996
    //   3040: goto -> 3044
    //   3043: athrow
    //   3044: invokevirtual getValue : ()Ljava/lang/Object;
    //   3047: goto -> 3051
    //   3050: athrow
    //   3051: instanceof java/lang/Integer
    //   3054: ifeq -> 3068
    //   3057: ldc2_w 620651038
    //   3060: l2i
    //   3061: ldc_w 976492261
    //   3064: ixor
    //   3065: goto -> 3076
    //   3068: ldc2_w -272725011
    //   3071: l2i
    //   3072: ldc_w -243990761
    //   3075: ixor
    //   3076: ldc2_w 114022830
    //   3079: l2i
    //   3080: ldc_w 399422909
    //   3083: ixor
    //   3084: ixor
    //   3085: tableswitch default -> 3057, 265230568 -> 3108, 265230569 -> 6075
    //   3108: getstatic Perryc.1 : I
    //   3111: ifeq -> 3125
    //   3114: ldc2_w -911895608
    //   3117: l2i
    //   3118: ldc_w -1875210294
    //   3121: ixor
    //   3122: goto -> 3133
    //   3125: ldc2_w -39893286
    //   3128: l2i
    //   3129: ldc_w 1275955800
    //   3132: ixor
    //   3133: ldc2_w -1151527551
    //   3136: l2i
    //   3137: ldc_w 754628036
    //   3140: ixor
    //   3141: ixor
    //   3142: lookupswitch default -> 3168, -1884223428 -> 3125, -835142585 -> 6172
    //   3168: aload_0
    //   3169: getstatic Perryc.0 : I
    //   3172: ifle -> 3186
    //   3175: ldc2_w 1562389363
    //   3178: l2i
    //   3179: ldc_w -635023479
    //   3182: ixor
    //   3183: goto -> 3194
    //   3186: ldc2_w 462834259
    //   3189: l2i
    //   3190: ldc_w 304422034
    //   3193: ixor
    //   3194: ldc2_w 1849901652
    //   3197: l2i
    //   3198: ldc_w 815401443
    //   3201: ixor
    //   3202: ixor
    //   3203: lookupswitch default -> 6154, -639684787 -> 3186, 1466572150 -> 3228
    //   3228: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3231: getstatic Perryc.0 : I
    //   3234: ifle -> 3248
    //   3237: ldc2_w -1072293358
    //   3240: l2i
    //   3241: ldc_w 328187370
    //   3244: ixor
    //   3245: goto -> 3256
    //   3248: ldc2_w -291476015
    //   3251: l2i
    //   3252: ldc_w 1544211960
    //   3255: ixor
    //   3256: ldc2_w 928896912
    //   3259: l2i
    //   3260: ldc_w -2048084411
    //   3263: ixor
    //   3264: ixor
    //   3265: lookupswitch default -> 6180, 1819132 -> 3292, 1630062125 -> 3248
    //   3292: aload_0
    //   3293: getstatic Perryc.c : I
    //   3296: iflt -> 3310
    //   3299: ldc2_w -1138150871
    //   3302: l2i
    //   3303: ldc_w -605554266
    //   3306: ixor
    //   3307: goto -> 3318
    //   3310: ldc2_w -957208015
    //   3313: l2i
    //   3314: ldc_w 1531049057
    //   3317: ixor
    //   3318: ldc2_w 1216373067
    //   3321: l2i
    //   3322: ldc_w 887020828
    //   3325: ixor
    //   3326: ixor
    //   3327: lookupswitch default -> 6082, -504536569 -> 3352, 462452696 -> 3310
    //   3352: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3355: getstatic Perryc.1 : I
    //   3358: ifeq -> 3372
    //   3361: ldc2_w 1152022951
    //   3364: l2i
    //   3365: ldc_w 1954017637
    //   3368: ixor
    //   3369: goto -> 3380
    //   3372: ldc2_w 1903034242
    //   3375: l2i
    //   3376: ldc_w 267187672
    //   3379: ixor
    //   3380: ldc2_w 145892812
    //   3383: l2i
    //   3384: ldc_w -581749130
    //   3387: ixor
    //   3388: ixor
    //   3389: lookupswitch default -> 3416, -1639439316 -> 3372, -449012872 -> 6084
    //   3416: goto -> 3420
    //   3419: athrow
    //   3420: invokevirtual getValue : ()Ljava/lang/Object;
    //   3423: goto -> 3427
    //   3426: athrow
    //   3427: checkcast java/lang/Integer
    //   3430: getstatic Perryc.c : I
    //   3433: iflt -> 3447
    //   3436: ldc2_w -829120156
    //   3439: l2i
    //   3440: ldc_w -1119750285
    //   3443: ixor
    //   3444: goto -> 3455
    //   3447: ldc2_w 1948030507
    //   3450: l2i
    //   3451: ldc_w 1572263052
    //   3454: ixor
    //   3455: ldc2_w -653535532
    //   3458: l2i
    //   3459: ldc_w 834913627
    //   3462: ixor
    //   3463: ixor
    //   3464: lookupswitch default -> 6106, -1692580456 -> 3447, -1050521304 -> 3492
    //   3492: goto -> 3496
    //   3495: athrow
    //   3496: invokevirtual intValue : ()I
    //   3499: goto -> 3503
    //   3502: athrow
    //   3503: ldc2_w -1749885766
    //   3506: l2i
    //   3507: ldc_w -1749885765
    //   3510: ixor
    //   3511: iadd
    //   3512: getstatic Perryc.1 : I
    //   3515: ifeq -> 3529
    //   3518: ldc2_w -666101705
    //   3521: l2i
    //   3522: ldc_w -64939704
    //   3525: ixor
    //   3526: goto -> 3537
    //   3529: ldc2_w 986954096
    //   3532: l2i
    //   3533: ldc_w -1390818847
    //   3536: ixor
    //   3537: ldc2_w -262106919
    //   3540: l2i
    //   3541: ldc_w 1614275973
    //   3544: ixor
    //   3545: ixor
    //   3546: lookupswitch default -> 6208, -1271237597 -> 3529, 127731149 -> 3572
    //   3572: goto -> 3576
    //   3575: athrow
    //   3576: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3579: goto -> 3583
    //   3582: athrow
    //   3583: getstatic Perryc.1 : I
    //   3586: ifeq -> 3600
    //   3589: ldc2_w 1474064174
    //   3592: l2i
    //   3593: ldc_w 1521850647
    //   3596: ixor
    //   3597: goto -> 3608
    //   3600: ldc2_w 621100187
    //   3603: l2i
    //   3604: ldc_w -663489215
    //   3607: ixor
    //   3608: ldc2_w 755909343
    //   3611: l2i
    //   3612: ldc_w 24130264
    //   3615: ixor
    //   3616: ixor
    //   3617: lookupswitch default -> 3644, -350787536 -> 3600, 555189822 -> 6160
    //   3644: goto -> 3648
    //   3647: athrow
    //   3648: invokevirtual setValue : (Ljava/lang/Object;)V
    //   3651: goto -> 3655
    //   3654: athrow
    //   3655: goto -> 6075
    //   3658: getstatic Perryc.c : I
    //   3661: iflt -> 3675
    //   3664: ldc2_w 1141316770
    //   3667: l2i
    //   3668: ldc_w -731305870
    //   3671: ixor
    //   3672: goto -> 3683
    //   3675: ldc2_w -307612107
    //   3678: l2i
    //   3679: ldc_w -483759545
    //   3682: ixor
    //   3683: ldc2_w -1363144664
    //   3686: l2i
    //   3687: ldc_w 1573939141
    //   3690: ixor
    //   3691: ixor
    //   3692: lookupswitch default -> 3720, 171011398 -> 3675, 1669219133 -> 6138
    //   3720: aload_0
    //   3721: getstatic Perryc.c : I
    //   3724: iflt -> 3738
    //   3727: ldc2_w 186790404
    //   3730: l2i
    //   3731: ldc_w -1175185788
    //   3734: ixor
    //   3735: goto -> 3746
    //   3738: ldc2_w 690378678
    //   3741: l2i
    //   3742: ldc_w 1997583786
    //   3745: ixor
    //   3746: ldc2_w 954163874
    //   3749: l2i
    //   3750: ldc_w -141801855
    //   3753: ixor
    //   3754: ixor
    //   3755: lookupswitch default -> 3780, 1537951482 -> 3738, 2105868451 -> 6200
    //   3780: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3783: getstatic Perryc.c : I
    //   3786: iflt -> 3800
    //   3789: ldc2_w 1074375660
    //   3792: l2i
    //   3793: ldc_w 1685432042
    //   3796: ixor
    //   3797: goto -> 3808
    //   3800: ldc2_w 1735070838
    //   3803: l2i
    //   3804: ldc_w 182308841
    //   3807: ixor
    //   3808: ldc2_w 41617995
    //   3811: l2i
    //   3812: ldc_w -1106016052
    //   3815: ixor
    //   3816: ixor
    //   3817: lookupswitch default -> 3844, -1743483007 -> 6166, -670256518 -> 3800
    //   3844: goto -> 3848
    //   3847: athrow
    //   3848: invokevirtual getValue : ()Ljava/lang/Object;
    //   3851: goto -> 3855
    //   3854: athrow
    //   3855: instanceof java/lang/Double
    //   3858: ifeq -> 3872
    //   3861: ldc2_w -1332552542
    //   3864: l2i
    //   3865: ldc_w 238093485
    //   3868: ixor
    //   3869: goto -> 3880
    //   3872: ldc2_w -1565268647
    //   3875: l2i
    //   3876: ldc_w 470826327
    //   3879: ixor
    //   3880: ldc2_w -2047967785
    //   3883: l2i
    //   3884: ldc_w -2128095172
    //   3887: ixor
    //   3888: ixor
    //   3889: tableswitch default -> 3861, -1167426076 -> 3912, -1167426075 -> 4466
    //   3912: getstatic Perryc.1 : I
    //   3915: ifeq -> 3929
    //   3918: ldc2_w -529555003
    //   3921: l2i
    //   3922: ldc_w -1543511675
    //   3925: ixor
    //   3926: goto -> 3937
    //   3929: ldc2_w -1751574988
    //   3932: l2i
    //   3933: ldc_w -1873170232
    //   3936: ixor
    //   3937: ldc2_w -1486464598
    //   3940: l2i
    //   3941: ldc_w 94701386
    //   3944: ixor
    //   3945: ixor
    //   3946: lookupswitch default -> 6136, -1526466532 -> 3972, -514646368 -> 3929
    //   3972: aload_0
    //   3973: getstatic Perryc.1 : I
    //   3976: ifeq -> 3990
    //   3979: ldc2_w 1669657094
    //   3982: l2i
    //   3983: ldc_w -570429771
    //   3986: ixor
    //   3987: goto -> 3998
    //   3990: ldc2_w 1009388520
    //   3993: l2i
    //   3994: ldc_w -758161434
    //   3997: ixor
    //   3998: ldc2_w 1858043434
    //   4001: l2i
    //   4002: ldc_w -679203426
    //   4005: ixor
    //   4006: ixor
    //   4007: lookupswitch default -> 6204, 121655047 -> 3990, 1474168762 -> 4032
    //   4032: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4035: getstatic Perryc.0 : I
    //   4038: ifle -> 4052
    //   4041: ldc2_w 335263947
    //   4044: l2i
    //   4045: ldc_w 252008762
    //   4048: ixor
    //   4049: goto -> 4060
    //   4052: ldc2_w 245865581
    //   4055: l2i
    //   4056: ldc_w 1830278606
    //   4059: ixor
    //   4060: ldc2_w -316943978
    //   4063: l2i
    //   4064: ldc_w 807477142
    //   4067: ixor
    //   4068: ixor
    //   4069: lookupswitch default -> 6112, -1098217565 -> 4096, -1044107279 -> 4052
    //   4096: aload_0
    //   4097: getstatic Perryc.c : I
    //   4100: iflt -> 4114
    //   4103: ldc2_w -1593883032
    //   4106: l2i
    //   4107: ldc_w -2099889637
    //   4110: ixor
    //   4111: goto -> 4122
    //   4114: ldc2_w -1363499107
    //   4117: l2i
    //   4118: ldc_w 925827834
    //   4121: ixor
    //   4122: ldc2_w 1724874235
    //   4125: l2i
    //   4126: ldc_w 1246553804
    //   4129: ixor
    //   4130: ixor
    //   4131: lookupswitch default -> 4156, 246081348 -> 6210, 898891692 -> 4114
    //   4156: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4159: getstatic Perryc.c : I
    //   4162: iflt -> 4176
    //   4165: ldc2_w -1140154651
    //   4168: l2i
    //   4169: ldc_w -718280963
    //   4172: ixor
    //   4173: goto -> 4184
    //   4176: ldc2_w 1614542384
    //   4179: l2i
    //   4180: ldc_w -446858159
    //   4183: ixor
    //   4184: ldc2_w 1255880716
    //   4187: l2i
    //   4188: ldc_w 1089879893
    //   4191: ixor
    //   4192: ixor
    //   4193: lookupswitch default -> 6202, -1890874056 -> 4220, 1661501249 -> 4176
    //   4220: goto -> 4224
    //   4223: athrow
    //   4224: invokevirtual getValue : ()Ljava/lang/Object;
    //   4227: goto -> 4231
    //   4230: athrow
    //   4231: checkcast java/lang/Double
    //   4234: getstatic Perryc.1 : I
    //   4237: ifeq -> 4251
    //   4240: ldc2_w -1046647933
    //   4243: l2i
    //   4244: ldc_w 270475502
    //   4247: ixor
    //   4248: goto -> 4259
    //   4251: ldc2_w -1085611734
    //   4254: l2i
    //   4255: ldc_w 1487636580
    //   4258: ixor
    //   4259: ldc2_w -1267331572
    //   4262: l2i
    //   4263: ldc_w -346967992
    //   4266: ixor
    //   4267: ixor
    //   4268: lookupswitch default -> 6156, -1901726423 -> 4251, -1194928374 -> 4296
    //   4296: goto -> 4300
    //   4299: athrow
    //   4300: invokevirtual doubleValue : ()D
    //   4303: goto -> 4307
    //   4306: athrow
    //   4307: ldc2_w 197.26776373610207
    //   4310: invokestatic doubleToLongBits : (D)J
    //   4313: ldc2_w 9194283982236234655
    //   4316: lxor
    //   4317: invokestatic longBitsToDouble : (J)D
    //   4320: dsub
    //   4321: getstatic Perryc.1 : I
    //   4324: ifeq -> 4338
    //   4327: ldc2_w -327112525
    //   4330: l2i
    //   4331: ldc_w 999043486
    //   4334: ixor
    //   4335: goto -> 4346
    //   4338: ldc2_w -1002471373
    //   4341: l2i
    //   4342: ldc_w 917460519
    //   4345: ixor
    //   4346: ldc2_w -582566280
    //   4349: l2i
    //   4350: ldc_w 948668529
    //   4353: ixor
    //   4354: ixor
    //   4355: lookupswitch default -> 6222, 392028189 -> 4380, 851554084 -> 4338
    //   4380: goto -> 4384
    //   4383: athrow
    //   4384: invokestatic valueOf : (D)Ljava/lang/Double;
    //   4387: goto -> 4391
    //   4390: athrow
    //   4391: getstatic Perryc.0 : I
    //   4394: ifle -> 4408
    //   4397: ldc2_w 1072299793
    //   4400: l2i
    //   4401: ldc_w 272073569
    //   4404: ixor
    //   4405: goto -> 4416
    //   4408: ldc2_w -1326746133
    //   4411: l2i
    //   4412: ldc_w -1600175646
    //   4415: ixor
    //   4416: ldc2_w -1017899571
    //   4419: l2i
    //   4420: ldc_w -126404799
    //   4423: ixor
    //   4424: ixor
    //   4425: lookupswitch default -> 4452, -999286329 -> 4408, 352149244 -> 6236
    //   4452: goto -> 4456
    //   4455: athrow
    //   4456: invokevirtual setValue : (Ljava/lang/Object;)V
    //   4459: goto -> 4463
    //   4462: athrow
    //   4463: goto -> 6075
    //   4466: getstatic Perryc.c : I
    //   4469: iflt -> 4483
    //   4472: ldc2_w 713783123
    //   4475: l2i
    //   4476: ldc_w -1185816584
    //   4479: ixor
    //   4480: goto -> 4491
    //   4483: ldc2_w 1741712658
    //   4486: l2i
    //   4487: ldc_w 616933025
    //   4490: ixor
    //   4491: ldc2_w 1548735420
    //   4494: l2i
    //   4495: ldc_w -423215904
    //   4498: ixor
    //   4499: ixor
    //   4500: lookupswitch default -> 6116, -107207441 -> 4528, 693323767 -> 4483
    //   4528: aload_0
    //   4529: getstatic Perryc.c : I
    //   4532: iflt -> 4546
    //   4535: ldc2_w 10405615
    //   4538: l2i
    //   4539: ldc_w -1562828967
    //   4542: ixor
    //   4543: goto -> 4554
    //   4546: ldc2_w -1415804621
    //   4549: l2i
    //   4550: ldc_w -2006635217
    //   4553: ixor
    //   4554: ldc2_w 182875832
    //   4557: l2i
    //   4558: ldc_w -1011974651
    //   4561: ixor
    //   4562: ixor
    //   4563: lookupswitch default -> 4588, 1796198667 -> 6224, 2041892830 -> 4546
    //   4588: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4591: getstatic Perryc.c : I
    //   4594: iflt -> 4608
    //   4597: ldc2_w 964967714
    //   4600: l2i
    //   4601: ldc_w -1487912527
    //   4604: ixor
    //   4605: goto -> 4616
    //   4608: ldc2_w -732477789
    //   4611: l2i
    //   4612: ldc_w 96983376
    //   4615: ixor
    //   4616: ldc2_w -719755465
    //   4619: l2i
    //   4620: ldc_w -382905355
    //   4623: ixor
    //   4624: ixor
    //   4625: lookupswitch default -> 4652, -1562359727 -> 6096, -1048150319 -> 4608
    //   4652: goto -> 4656
    //   4655: athrow
    //   4656: invokevirtual getValue : ()Ljava/lang/Object;
    //   4659: goto -> 4663
    //   4662: athrow
    //   4663: instanceof java/lang/Float
    //   4666: ifeq -> 4680
    //   4669: ldc2_w 433524692
    //   4672: l2i
    //   4673: ldc_w -1114916061
    //   4676: ixor
    //   4677: goto -> 4688
    //   4680: ldc2_w 577812061
    //   4683: l2i
    //   4684: ldc_w -2043936085
    //   4687: ixor
    //   4688: ldc2_w -1149171406
    //   4691: l2i
    //   4692: ldc_w -1029846337
    //   4695: ixor
    //   4696: ixor
    //   4697: tableswitch default -> 4669, -582977670 -> 4720, -582977669 -> 5274
    //   4720: getstatic Perryc.1 : I
    //   4723: ifeq -> 4737
    //   4726: ldc2_w 161500719
    //   4729: l2i
    //   4730: ldc_w -471724325
    //   4733: ixor
    //   4734: goto -> 4745
    //   4737: ldc2_w 366011340
    //   4740: l2i
    //   4741: ldc_w -559947838
    //   4744: ixor
    //   4745: ldc2_w -2291619
    //   4748: l2i
    //   4749: ldc_w -899764646
    //   4752: ixor
    //   4753: ixor
    //   4754: lookupswitch default -> 4780, -540940557 -> 6206, 969643484 -> 4737
    //   4780: aload_0
    //   4781: getstatic Perryc.0 : I
    //   4784: ifle -> 4798
    //   4787: ldc2_w -1230352348
    //   4790: l2i
    //   4791: ldc_w -545619386
    //   4794: ixor
    //   4795: goto -> 4806
    //   4798: ldc2_w 487201589
    //   4801: l2i
    //   4802: ldc_w -149606392
    //   4805: ixor
    //   4806: ldc2_w -1851898713
    //   4809: l2i
    //   4810: ldc_w -929239793
    //   4813: ixor
    //   4814: ixor
    //   4815: lookupswitch default -> 4840, -1831606966 -> 4798, 819100618 -> 6078
    //   4840: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4843: getstatic Perryc.1 : I
    //   4846: ifeq -> 4860
    //   4849: ldc2_w -1642491547
    //   4852: l2i
    //   4853: ldc_w -268616529
    //   4856: ixor
    //   4857: goto -> 4868
    //   4860: ldc2_w -1597891933
    //   4863: l2i
    //   4864: ldc_w 1552615608
    //   4867: ixor
    //   4868: ldc2_w -2131405361
    //   4871: l2i
    //   4872: ldc_w 1466137768
    //   4875: ixor
    //   4876: ixor
    //   4877: lookupswitch default -> 4904, -1774674847 -> 4860, -1502444371 -> 6114
    //   4904: aload_0
    //   4905: getstatic Perryc.0 : I
    //   4908: ifle -> 4922
    //   4911: ldc2_w -1410716708
    //   4914: l2i
    //   4915: ldc_w -584138598
    //   4918: ixor
    //   4919: goto -> 4930
    //   4922: ldc2_w -244010108
    //   4925: l2i
    //   4926: ldc_w -2139760843
    //   4929: ixor
    //   4930: ldc2_w -981380583
    //   4933: l2i
    //   4934: ldc_w 1106484412
    //   4937: ixor
    //   4938: ixor
    //   4939: lookupswitch default -> 4964, -222943773 -> 6098, 636639020 -> 4922
    //   4964: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4967: getstatic Perryc.0 : I
    //   4970: ifle -> 4984
    //   4973: ldc2_w -71039448
    //   4976: l2i
    //   4977: ldc_w -1468747568
    //   4980: ixor
    //   4981: goto -> 4992
    //   4984: ldc2_w 652579081
    //   4987: l2i
    //   4988: ldc_w 692074447
    //   4991: ixor
    //   4992: ldc2_w 1106050306
    //   4995: l2i
    //   4996: ldc_w 873751105
    //   4999: ixor
    //   5000: ixor
    //   5001: lookupswitch default -> 6100, 642263483 -> 4984, 2052929925 -> 5028
    //   5028: goto -> 5032
    //   5031: athrow
    //   5032: invokevirtual getValue : ()Ljava/lang/Object;
    //   5035: goto -> 5039
    //   5038: athrow
    //   5039: checkcast java/lang/Float
    //   5042: getstatic Perryc.c : I
    //   5045: iflt -> 5059
    //   5048: ldc2_w 1828378666
    //   5051: l2i
    //   5052: ldc_w 1555951783
    //   5055: ixor
    //   5056: goto -> 5067
    //   5059: ldc2_w -2019132721
    //   5062: l2i
    //   5063: ldc_w -9515095
    //   5066: ixor
    //   5067: ldc2_w 193430184
    //   5070: l2i
    //   5071: ldc_w 89520126
    //   5074: ixor
    //   5075: ixor
    //   5076: lookupswitch default -> 6196, 1049976283 -> 5059, 1981464624 -> 5104
    //   5104: goto -> 5108
    //   5107: athrow
    //   5108: invokevirtual floatValue : ()F
    //   5111: goto -> 5115
    //   5114: athrow
    //   5115: ldc_w 7.047768
    //   5118: invokestatic floatToIntBits : (F)I
    //   5121: ldc_w 2137098065
    //   5124: ixor
    //   5125: invokestatic intBitsToFloat : (I)F
    //   5128: fsub
    //   5129: getstatic Perryc.c : I
    //   5132: iflt -> 5146
    //   5135: ldc2_w -679185048
    //   5138: l2i
    //   5139: ldc_w 903641500
    //   5142: ixor
    //   5143: goto -> 5154
    //   5146: ldc2_w 961756255
    //   5149: l2i
    //   5150: ldc_w 1771947481
    //   5153: ixor
    //   5154: ldc2_w 859859052
    //   5157: l2i
    //   5158: ldc_w 489834189
    //   5161: ixor
    //   5162: ixor
    //   5163: lookupswitch default -> 5188, -869653931 -> 6194, -4195063 -> 5146
    //   5188: goto -> 5192
    //   5191: athrow
    //   5192: invokestatic valueOf : (F)Ljava/lang/Float;
    //   5195: goto -> 5199
    //   5198: athrow
    //   5199: getstatic Perryc.c : I
    //   5202: iflt -> 5216
    //   5205: ldc2_w 1812537349
    //   5208: l2i
    //   5209: ldc_w 1086678548
    //   5212: ixor
    //   5213: goto -> 5224
    //   5216: ldc2_w 822144278
    //   5219: l2i
    //   5220: ldc_w 777982056
    //   5223: ixor
    //   5224: ldc2_w 1704581901
    //   5227: l2i
    //   5228: ldc_w 1516402347
    //   5231: ixor
    //   5232: ixor
    //   5233: lookupswitch default -> 6090, 322431927 -> 5216, 547639512 -> 5260
    //   5260: goto -> 5264
    //   5263: athrow
    //   5264: invokevirtual setValue : (Ljava/lang/Object;)V
    //   5267: goto -> 5271
    //   5270: athrow
    //   5271: goto -> 6075
    //   5274: getstatic Perryc.c : I
    //   5277: iflt -> 5291
    //   5280: ldc2_w 1108015654
    //   5283: l2i
    //   5284: ldc_w 999173539
    //   5287: ixor
    //   5288: goto -> 5299
    //   5291: ldc2_w -1404268345
    //   5294: l2i
    //   5295: ldc_w 680977482
    //   5298: ixor
    //   5299: ldc2_w -1571140975
    //   5302: l2i
    //   5303: ldc_w -1602962291
    //   5306: ixor
    //   5307: ixor
    //   5308: lookupswitch default -> 6214, -2030796143 -> 5336, 2074747289 -> 5291
    //   5336: aload_0
    //   5337: getstatic Perryc.c : I
    //   5340: iflt -> 5354
    //   5343: ldc2_w 72754436
    //   5346: l2i
    //   5347: ldc_w -710686315
    //   5350: ixor
    //   5351: goto -> 5362
    //   5354: ldc2_w -1841376672
    //   5357: l2i
    //   5358: ldc_w 985747464
    //   5361: ixor
    //   5362: ldc2_w -1287575535
    //   5365: l2i
    //   5366: ldc_w 1454910974
    //   5369: ixor
    //   5370: ixor
    //   5371: lookupswitch default -> 6162, 873261438 -> 5354, 1292273543 -> 5396
    //   5396: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5399: getstatic Perryc.c : I
    //   5402: iflt -> 5416
    //   5405: ldc2_w -645508682
    //   5408: l2i
    //   5409: ldc_w -860499354
    //   5412: ixor
    //   5413: goto -> 5424
    //   5416: ldc2_w -2689050
    //   5419: l2i
    //   5420: ldc_w 793841025
    //   5423: ixor
    //   5424: ldc2_w -838318289
    //   5427: l2i
    //   5428: ldc_w -494874845
    //   5431: ixor
    //   5432: ixor
    //   5433: lookupswitch default -> 5460, 736759420 -> 5416, 968559580 -> 6216
    //   5460: goto -> 5464
    //   5463: athrow
    //   5464: invokevirtual getValue : ()Ljava/lang/Object;
    //   5467: goto -> 5471
    //   5470: athrow
    //   5471: instanceof java/lang/Integer
    //   5474: ifeq -> 5488
    //   5477: ldc2_w -2068164714
    //   5480: l2i
    //   5481: ldc_w -604624018
    //   5484: ixor
    //   5485: goto -> 5496
    //   5488: ldc2_w -894937828
    //   5491: l2i
    //   5492: ldc_w -1780207131
    //   5495: ixor
    //   5496: ldc2_w -287766528
    //   5499: l2i
    //   5500: ldc_w -489034440
    //   5503: ixor
    //   5504: ixor
    //   5505: tableswitch default -> 5477, 1397522880 -> 5528, 1397522881 -> 6075
    //   5528: getstatic Perryc.1 : I
    //   5531: ifeq -> 5545
    //   5534: ldc2_w 2038504223
    //   5537: l2i
    //   5538: ldc_w -501242977
    //   5541: ixor
    //   5542: goto -> 5553
    //   5545: ldc2_w -2108098103
    //   5548: l2i
    //   5549: ldc_w -2128021415
    //   5552: ixor
    //   5553: ldc2_w 205977223
    //   5556: l2i
    //   5557: ldc_w 789086638
    //   5560: ixor
    //   5561: ixor
    //   5562: lookupswitch default -> 5588, -1194274903 -> 6174, -61740114 -> 5545
    //   5588: aload_0
    //   5589: getstatic Perryc.c : I
    //   5592: iflt -> 5606
    //   5595: ldc2_w 812816628
    //   5598: l2i
    //   5599: ldc_w 463779263
    //   5602: ixor
    //   5603: goto -> 5614
    //   5606: ldc2_w 1068378547
    //   5609: l2i
    //   5610: ldc_w -2027217227
    //   5613: ixor
    //   5614: ldc2_w 1731519496
    //   5617: l2i
    //   5618: ldc_w 1864856627
    //   5621: ixor
    //   5622: ixor
    //   5623: lookupswitch default -> 5648, 600161648 -> 6144, 1562173751 -> 5606
    //   5648: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5651: getstatic Perryc.c : I
    //   5654: iflt -> 5668
    //   5657: ldc2_w -357365558
    //   5660: l2i
    //   5661: ldc_w 34761149
    //   5664: ixor
    //   5665: goto -> 5676
    //   5668: ldc2_w 135702292
    //   5671: l2i
    //   5672: ldc_w -334746033
    //   5675: ixor
    //   5676: ldc2_w -582983320
    //   5679: l2i
    //   5680: ldc_w -137962822
    //   5683: ixor
    //   5684: ixor
    //   5685: lookupswitch default -> 5712, -1037575515 -> 6232, 702762179 -> 5668
    //   5712: aload_0
    //   5713: getstatic Perryc.0 : I
    //   5716: ifle -> 5730
    //   5719: ldc2_w 7764787
    //   5722: l2i
    //   5723: ldc_w 303300800
    //   5726: ixor
    //   5727: goto -> 5738
    //   5730: ldc2_w -1881592669
    //   5733: l2i
    //   5734: ldc_w 261359817
    //   5737: ixor
    //   5738: ldc2_w 449557470
    //   5741: l2i
    //   5742: ldc_w -376977517
    //   5745: ixor
    //   5746: ixor
    //   5747: lookupswitch default -> 6126, -517075010 -> 5730, 1929465895 -> 5772
    //   5772: getfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5775: getstatic Perryc.1 : I
    //   5778: ifeq -> 5792
    //   5781: ldc2_w 247011182
    //   5784: l2i
    //   5785: ldc_w -1223679697
    //   5788: ixor
    //   5789: goto -> 5800
    //   5792: ldc2_w -2038676164
    //   5795: l2i
    //   5796: ldc_w 2073775643
    //   5799: ixor
    //   5800: ldc2_w 95022423
    //   5803: l2i
    //   5804: ldc_w -581020348
    //   5807: ixor
    //   5808: ixor
    //   5809: lookupswitch default -> 5836, 1153757316 -> 5792, 1633586770 -> 6190
    //   5836: goto -> 5840
    //   5839: athrow
    //   5840: invokevirtual getValue : ()Ljava/lang/Object;
    //   5843: goto -> 5847
    //   5846: athrow
    //   5847: checkcast java/lang/Integer
    //   5850: getstatic Perryc.0 : I
    //   5853: ifle -> 5867
    //   5856: ldc2_w 1741610396
    //   5859: l2i
    //   5860: ldc_w -142223821
    //   5863: ixor
    //   5864: goto -> 5875
    //   5867: ldc2_w 269366728
    //   5870: l2i
    //   5871: ldc_w 619918860
    //   5874: ixor
    //   5875: ldc2_w -600783583
    //   5878: l2i
    //   5879: ldc_w 218132618
    //   5882: ixor
    //   5883: ixor
    //   5884: lookupswitch default -> 5912, -1788760917 -> 5867, 1098628612 -> 6130
    //   5912: goto -> 5916
    //   5915: athrow
    //   5916: invokevirtual intValue : ()I
    //   5919: goto -> 5923
    //   5922: athrow
    //   5923: ldc2_w -1296880187
    //   5926: l2i
    //   5927: ldc_w -1296880188
    //   5930: ixor
    //   5931: isub
    //   5932: getstatic Perryc.c : I
    //   5935: iflt -> 5949
    //   5938: ldc2_w 1632421116
    //   5941: l2i
    //   5942: ldc_w 653146346
    //   5945: ixor
    //   5946: goto -> 5957
    //   5949: ldc2_w 545863432
    //   5952: l2i
    //   5953: ldc_w -1618772
    //   5956: ixor
    //   5957: ldc2_w 187466910
    //   5960: l2i
    //   5961: ldc_w 66040718
    //   5964: ixor
    //   5965: ixor
    //   5966: lookupswitch default -> 5992, -537846054 -> 5949, 1331809030 -> 6132
    //   5992: goto -> 5996
    //   5995: athrow
    //   5996: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5999: goto -> 6003
    //   6002: athrow
    //   6003: getstatic Perryc.c : I
    //   6006: iflt -> 6020
    //   6009: ldc2_w 1045685601
    //   6012: l2i
    //   6013: ldc_w 308504841
    //   6016: ixor
    //   6017: goto -> 6028
    //   6020: ldc2_w -471155488
    //   6023: l2i
    //   6024: ldc_w 1545749281
    //   6027: ixor
    //   6028: ldc2_w -1422073235
    //   6031: l2i
    //   6032: ldc_w 123020270
    //   6035: ixor
    //   6036: ixor
    //   6037: lookupswitch default -> 6064, -2141630997 -> 6088, -1390694689 -> 6020
    //   6064: goto -> 6068
    //   6067: athrow
    //   6068: invokevirtual setValue : (Ljava/lang/Object;)V
    //   6071: goto -> 6075
    //   6074: athrow
    //   6075: return
    //   6076: aconst_null
    //   6077: athrow
    //   6078: aconst_null
    //   6079: athrow
    //   6080: aconst_null
    //   6081: athrow
    //   6082: aconst_null
    //   6083: athrow
    //   6084: aconst_null
    //   6085: athrow
    //   6086: aconst_null
    //   6087: athrow
    //   6088: aconst_null
    //   6089: athrow
    //   6090: aconst_null
    //   6091: athrow
    //   6092: aconst_null
    //   6093: athrow
    //   6094: aconst_null
    //   6095: athrow
    //   6096: aconst_null
    //   6097: athrow
    //   6098: aconst_null
    //   6099: athrow
    //   6100: aconst_null
    //   6101: athrow
    //   6102: aconst_null
    //   6103: athrow
    //   6104: aconst_null
    //   6105: athrow
    //   6106: aconst_null
    //   6107: athrow
    //   6108: aconst_null
    //   6109: athrow
    //   6110: aconst_null
    //   6111: athrow
    //   6112: aconst_null
    //   6113: athrow
    //   6114: aconst_null
    //   6115: athrow
    //   6116: aconst_null
    //   6117: athrow
    //   6118: aconst_null
    //   6119: athrow
    //   6120: aconst_null
    //   6121: athrow
    //   6122: aconst_null
    //   6123: athrow
    //   6124: aconst_null
    //   6125: athrow
    //   6126: aconst_null
    //   6127: athrow
    //   6128: aconst_null
    //   6129: athrow
    //   6130: aconst_null
    //   6131: athrow
    //   6132: aconst_null
    //   6133: athrow
    //   6134: aconst_null
    //   6135: athrow
    //   6136: aconst_null
    //   6137: athrow
    //   6138: aconst_null
    //   6139: athrow
    //   6140: aconst_null
    //   6141: athrow
    //   6142: aconst_null
    //   6143: athrow
    //   6144: aconst_null
    //   6145: athrow
    //   6146: aconst_null
    //   6147: athrow
    //   6148: aconst_null
    //   6149: athrow
    //   6150: aconst_null
    //   6151: athrow
    //   6152: aconst_null
    //   6153: athrow
    //   6154: aconst_null
    //   6155: athrow
    //   6156: aconst_null
    //   6157: athrow
    //   6158: aconst_null
    //   6159: athrow
    //   6160: aconst_null
    //   6161: athrow
    //   6162: aconst_null
    //   6163: athrow
    //   6164: aconst_null
    //   6165: athrow
    //   6166: aconst_null
    //   6167: athrow
    //   6168: aconst_null
    //   6169: athrow
    //   6170: aconst_null
    //   6171: athrow
    //   6172: aconst_null
    //   6173: athrow
    //   6174: aconst_null
    //   6175: athrow
    //   6176: aconst_null
    //   6177: athrow
    //   6178: aconst_null
    //   6179: athrow
    //   6180: aconst_null
    //   6181: athrow
    //   6182: aconst_null
    //   6183: athrow
    //   6184: aconst_null
    //   6185: athrow
    //   6186: aconst_null
    //   6187: athrow
    //   6188: aconst_null
    //   6189: athrow
    //   6190: aconst_null
    //   6191: athrow
    //   6192: aconst_null
    //   6193: athrow
    //   6194: aconst_null
    //   6195: athrow
    //   6196: aconst_null
    //   6197: athrow
    //   6198: aconst_null
    //   6199: athrow
    //   6200: aconst_null
    //   6201: athrow
    //   6202: aconst_null
    //   6203: athrow
    //   6204: aconst_null
    //   6205: athrow
    //   6206: aconst_null
    //   6207: athrow
    //   6208: aconst_null
    //   6209: athrow
    //   6210: aconst_null
    //   6211: athrow
    //   6212: aconst_null
    //   6213: athrow
    //   6214: aconst_null
    //   6215: athrow
    //   6216: aconst_null
    //   6217: athrow
    //   6218: aconst_null
    //   6219: athrow
    //   6220: aconst_null
    //   6221: athrow
    //   6222: aconst_null
    //   6223: athrow
    //   6224: aconst_null
    //   6225: athrow
    //   6226: aconst_null
    //   6227: athrow
    //   6228: aconst_null
    //   6229: athrow
    //   6230: aconst_null
    //   6231: athrow
    //   6232: aconst_null
    //   6233: athrow
    //   6234: aconst_null
    //   6235: athrow
    //   6236: aconst_null
    //   6237: athrow
    //   6238: aconst_null
    //   6239: athrow
    //   6240: aconst_null
    //   6241: athrow
    //   6242: pop
    //   6243: goto -> 24
    //   6246: pop
    //   6247: aconst_null
    //   6248: goto -> 6242
    //   6251: dup
    //   6252: ifnull -> 6242
    //   6255: checkcast java/lang/Throwable
    //   6258: athrow
    //   6259: dup
    //   6260: ifnull -> 6246
    //   6263: checkcast java/lang/Throwable
    //   6266: athrow
    //   6267: aconst_null
    //   6268: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	6052	0	this	Lbigname/zprestige/webhack/features/gui/components/items/buttons/UnlimitedSlider;
    //   24	6052	1	mouseX	I
    //   24	6052	2	mouseY	I
    //   24	6052	3	mouseButton	I
    // Exception table:
    //   from	to	target	type
    //   8	20	6251	finally
    //   327	334	334	finally
    //   327	334	334	java/lang/RuntimeException
    //   327	334	334	finally
    //   328	334	3	finally
    //   328	334	327	finally
    //   579	586	586	finally
    //   580	586	579	finally
    //   580	586	3	java/lang/IllegalStateException
    //   580	586	586	java/util/NoSuchElementException
    //   580	586	579	java/lang/NullPointerException
    //   767	774	774	finally
    //   767	774	3	java/lang/ArrayIndexOutOfBoundsException
    //   767	774	767	finally
    //   767	774	767	finally
    //   768	774	3	java/lang/AssertionError
    //   915	922	922	finally
    //   915	922	3	finally
    //   915	922	915	finally
    //   915	922	915	java/lang/IllegalArgumentException
    //   916	922	3	java/lang/NegativeArraySizeException
    //   988	994	994	finally
    //   988	994	994	finally
    //   988	994	3	java/lang/RuntimeException
    //   988	994	994	finally
    //   988	994	994	finally
    //   1180	1186	1186	finally
    //   1180	1186	1186	java/lang/IllegalArgumentException
    //   1180	1186	1186	java/lang/IndexOutOfBoundsException
    //   1180	1186	3	java/lang/UnsupportedOperationException
    //   1180	1186	3	java/lang/EnumConstantNotPresentException
    //   1427	1434	1434	finally
    //   1427	1434	1427	finally
    //   1427	1434	3	java/lang/IllegalStateException
    //   1428	1434	1434	finally
    //   1428	1434	1427	java/lang/IndexOutOfBoundsException
    //   1803	1810	1810	finally
    //   1803	1810	1810	finally
    //   1803	1810	3	finally
    //   1804	1810	1810	java/lang/AssertionError
    //   1804	1810	1803	java/util/NoSuchElementException
    //   1879	1886	1886	finally
    //   1879	1886	1886	java/lang/NegativeArraySizeException
    //   1879	1886	1879	finally
    //   1880	1886	3	java/lang/ArrayIndexOutOfBoundsException
    //   1880	1886	1879	java/lang/EnumConstantNotPresentException
    //   1963	1970	1970	finally
    //   1963	1970	1963	finally
    //   1964	1970	3	java/util/NoSuchElementException
    //   1964	1970	1970	finally
    //   1964	1970	1970	finally
    //   2036	2042	2042	finally
    //   2036	2042	3	finally
    //   2036	2042	2042	finally
    //   2036	2042	3	finally
    //   2036	2042	2042	finally
    //   2235	2242	2242	finally
    //   2235	2242	3	finally
    //   2235	2242	2242	java/lang/AssertionError
    //   2235	2242	3	java/lang/ArrayIndexOutOfBoundsException
    //   2236	2242	2235	finally
    //   2611	2618	2618	finally
    //   2611	2618	2618	finally
    //   2612	2618	2611	java/lang/RuntimeException
    //   2612	2618	2611	java/lang/AssertionError
    //   2612	2618	2611	java/lang/EnumConstantNotPresentException
    //   2687	2694	2694	finally
    //   2687	2694	2687	java/lang/RuntimeException
    //   2687	2694	3	finally
    //   2688	2694	2687	finally
    //   2688	2694	2687	finally
    //   2771	2778	2778	finally
    //   2771	2778	2771	finally
    //   2771	2778	2771	finally
    //   2772	2778	2771	finally
    //   2772	2778	3	finally
    //   2843	2850	2850	finally
    //   2843	2850	2843	finally
    //   2843	2850	2850	java/lang/EnumConstantNotPresentException
    //   2843	2850	2850	java/lang/UnsupportedOperationException
    //   2844	2850	2843	java/lang/NegativeArraySizeException
    //   3044	3050	3050	finally
    //   3044	3050	3	finally
    //   3044	3050	3050	finally
    //   3044	3050	3050	java/lang/AssertionError
    //   3044	3050	3050	java/lang/IllegalArgumentException
    //   3419	3426	3426	finally
    //   3419	3426	3	finally
    //   3419	3426	3419	finally
    //   3419	3426	3	finally
    //   3420	3426	3	finally
    //   3495	3502	3502	finally
    //   3495	3502	3502	finally
    //   3495	3502	3495	java/lang/IndexOutOfBoundsException
    //   3495	3502	3	java/lang/ArrayIndexOutOfBoundsException
    //   3496	3502	3502	finally
    //   3575	3582	3582	finally
    //   3575	3582	3575	finally
    //   3575	3582	3575	java/util/ConcurrentModificationException
    //   3575	3582	3	java/lang/ArithmeticException
    //   3576	3582	3582	finally
    //   3648	3654	3654	finally
    //   3648	3654	3654	finally
    //   3648	3654	3654	finally
    //   3648	3654	3654	finally
    //   3648	3654	3654	java/lang/UnsupportedOperationException
    //   3848	3854	3854	finally
    //   3848	3854	3	finally
    //   3848	3854	3	finally
    //   3848	3854	3854	finally
    //   3848	3854	3854	finally
    //   4224	4230	4230	finally
    //   4224	4230	3	finally
    //   4224	4230	3	java/lang/EnumConstantNotPresentException
    //   4224	4230	4230	java/lang/RuntimeException
    //   4224	4230	3	finally
    //   4300	4306	4306	finally
    //   4300	4306	3	finally
    //   4300	4306	3	java/lang/ArithmeticException
    //   4300	4306	3	java/lang/IllegalArgumentException
    //   4300	4306	3	finally
    //   4383	4390	4390	finally
    //   4383	4390	3	java/lang/ClassCastException
    //   4383	4390	4383	java/util/ConcurrentModificationException
    //   4384	4390	4390	java/lang/StringIndexOutOfBoundsException
    //   4384	4390	4383	java/lang/IllegalStateException
    //   4455	4462	4462	finally
    //   4455	4462	4462	java/lang/NumberFormatException
    //   4455	4462	3	finally
    //   4456	4462	3	finally
    //   4456	4462	4455	finally
    //   4656	4662	4662	finally
    //   4656	4662	4662	java/lang/NumberFormatException
    //   4656	4662	3	finally
    //   4656	4662	4662	finally
    //   4656	4662	4662	finally
    //   5031	5038	5038	finally
    //   5031	5038	5038	finally
    //   5031	5038	5031	java/lang/UnsupportedOperationException
    //   5031	5038	5031	finally
    //   5032	5038	5031	finally
    //   5107	5114	5114	finally
    //   5107	5114	5114	finally
    //   5107	5114	5107	finally
    //   5108	5114	5107	java/lang/ArrayIndexOutOfBoundsException
    //   5108	5114	3	finally
    //   5191	5198	5198	finally
    //   5191	5198	5191	java/lang/NumberFormatException
    //   5191	5198	3	java/lang/UnsupportedOperationException
    //   5191	5198	3	java/lang/ArrayIndexOutOfBoundsException
    //   5191	5198	5198	finally
    //   5264	5270	5270	finally
    //   5264	5270	5270	finally
    //   5264	5270	3	java/util/ConcurrentModificationException
    //   5264	5270	5270	finally
    //   5264	5270	5270	finally
    //   5463	5470	5470	finally
    //   5463	5470	5463	finally
    //   5463	5470	5470	finally
    //   5464	5470	5470	java/lang/EnumConstantNotPresentException
    //   5464	5470	5470	finally
    //   5839	5846	5846	finally
    //   5839	5846	5846	java/lang/IllegalStateException
    //   5839	5846	3	java/lang/AssertionError
    //   5840	5846	5839	java/lang/RuntimeException
    //   5840	5846	3	finally
    //   5915	5922	5922	finally
    //   5915	5922	3	java/util/NoSuchElementException
    //   5915	5922	5915	java/lang/NullPointerException
    //   5916	5922	5922	finally
    //   5916	5922	5922	java/lang/StringIndexOutOfBoundsException
    //   5996	6002	6002	finally
    //   5996	6002	3	java/util/NoSuchElementException
    //   5996	6002	3	finally
    //   5996	6002	6002	finally
    //   5996	6002	3	finally
    //   6068	6074	6074	finally
    //   6068	6074	3	java/lang/NumberFormatException
    //   6068	6074	6074	java/lang/IllegalStateException
    //   6068	6074	6074	java/lang/RuntimeException
    //   6068	6074	6074	java/util/ConcurrentModificationException
    //   6251	6259	6251	java/lang/IllegalStateException
    //   6267	6269	3	java/lang/RuntimeException
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void update() {
    Perry1.4c(this, (int)-660242914L ^ 0x98669832);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\gui\components\items\buttons\UnlimitedSlider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */