package bigname.zprestige.webhack.features.modules.Movement;

import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class ReverseStep extends Module {
  public Setting<Integer> speed;
  
  public void onDisable() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 379
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 371
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 363
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 40
    //   30: ldc2_w 1794910993
    //   33: l2i
    //   34: ldc 91646578
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -729602757
    //   43: l2i
    //   44: ldc -822449008
    //   46: ixor
    //   47: ldc2_w -66936878
    //   50: l2i
    //   51: ldc 320455880
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 80, -2137974151 -> 346, -724994427 -> 40
    //   80: aload_0
    //   81: getstatic Perryc.0 : I
    //   84: ifle -> 97
    //   87: ldc2_w 1920169124
    //   90: l2i
    //   91: ldc -1737283643
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -960219825
    //   100: l2i
    //   101: ldc -1311306243
    //   103: ixor
    //   104: ldc2_w 133910902
    //   107: l2i
    //   108: ldc 697443413
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, -999741886 -> 350, -388347847 -> 97
    //   140: goto -> 144
    //   143: athrow
    //   144: invokespecial onDisable : ()V
    //   147: goto -> 151
    //   150: athrow
    //   151: getstatic Perryc.1 : I
    //   154: ifeq -> 167
    //   157: ldc2_w 986108270
    //   160: l2i
    //   161: ldc -311143123
    //   163: ixor
    //   164: goto -> 174
    //   167: ldc2_w -1029413889
    //   170: l2i
    //   171: ldc 1571671139
    //   173: ixor
    //   174: ldc2_w 319791310
    //   177: l2i
    //   178: ldc 356376327
    //   180: ixor
    //   181: ixor
    //   182: lookupswitch default -> 344, -1724133291 -> 208, -780076150 -> 167
    //   208: getstatic bigname/zprestige/webhack/features/modules/Movement/ReverseStep.mc : Lnet/minecraft/client/Minecraft;
    //   211: getstatic Perryc.1 : I
    //   214: ifeq -> 227
    //   217: ldc2_w -1041250012
    //   220: l2i
    //   221: ldc -1911231546
    //   223: ixor
    //   224: goto -> 234
    //   227: ldc2_w 169257160
    //   230: l2i
    //   231: ldc 1249846315
    //   233: ixor
    //   234: ldc2_w -1319353529
    //   237: l2i
    //   238: ldc -146454895
    //   240: ixor
    //   241: ixor
    //   242: lookupswitch default -> 268, -1275266322 -> 227, 165816116 -> 352
    //   268: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   271: ldc2_w 1.0243442896470622E308
    //   274: invokestatic doubleToLongBits : (D)J
    //   277: ldc2_w 9214993634010330592
    //   280: lxor
    //   281: invokestatic longBitsToDouble : (J)D
    //   284: getstatic Perryc.1 : I
    //   287: ifeq -> 300
    //   290: ldc2_w -1179094976
    //   293: l2i
    //   294: ldc -1872662854
    //   296: ixor
    //   297: goto -> 307
    //   300: ldc2_w 1113758334
    //   303: l2i
    //   304: ldc 1729295728
    //   306: ixor
    //   307: ldc2_w -1445448423
    //   310: l2i
    //   311: ldc -1781703245
    //   313: ixor
    //   314: ixor
    //   315: lookupswitch default -> 348, 365721168 -> 300, 426051492 -> 340
    //   340: putfield field_70181_x : D
    //   343: return
    //   344: aconst_null
    //   345: athrow
    //   346: aconst_null
    //   347: athrow
    //   348: aconst_null
    //   349: athrow
    //   350: aconst_null
    //   351: athrow
    //   352: aconst_null
    //   353: athrow
    //   354: pop
    //   355: goto -> 24
    //   358: pop
    //   359: aconst_null
    //   360: goto -> 354
    //   363: dup
    //   364: ifnull -> 354
    //   367: checkcast java/lang/Throwable
    //   370: athrow
    //   371: dup
    //   372: ifnull -> 358
    //   375: checkcast java/lang/Throwable
    //   378: athrow
    //   379: aconst_null
    //   380: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	320	0	this	Lbigname/zprestige/webhack/features/modules/Movement/ReverseStep;
    // Exception table:
    //   from	to	target	type
    //   8	20	363	java/lang/IndexOutOfBoundsException
    //   144	150	150	finally
    //   144	150	3	finally
    //   144	150	3	java/lang/IllegalStateException
    //   144	150	3	java/lang/NullPointerException
    //   144	150	3	finally
    //   363	371	363	finally
    //   379	381	3	java/lang/StringIndexOutOfBoundsException
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public ReverseStep() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 1804189667
    //   9: l2i
    //   10: ldc 678450694
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1327658921
    //   19: l2i
    //   20: ldc -125064047
    //   22: ixor
    //   23: ldc2_w 1197581700
    //   26: l2i
    //   27: ldc -1387825887
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 906, -1444988608 -> 16, 1569655709 -> 56
    //   56: aload_0
    //   57: ldc '嚮㌖因㶲렳๼⬂蹷룠'
    //   59: getstatic Perryc.c : I
    //   62: iflt -> 75
    //   65: ldc2_w 270926906
    //   68: l2i
    //   69: ldc -773917798
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w 1816850984
    //   78: l2i
    //   79: ldc 1524049528
    //   81: ixor
    //   82: ldc2_w 2118381744
    //   85: l2i
    //   86: ldc 2097154777
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 116, -1027928631 -> 922, 640836780 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '嚻㌜嚶㶳렷๷'
    //   121: getstatic Perryc.0 : I
    //   124: ifle -> 137
    //   127: ldc2_w 1313528924
    //   130: l2i
    //   131: ldc -1159477046
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 1441172199
    //   140: l2i
    //   141: ldc -1160611552
    //   143: ixor
    //   144: ldc2_w -2088535043
    //   147: l2i
    //   148: ldc -1640734298
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 180, -383906099 -> 926, 388779219 -> 137
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.1 : I
    //   186: ifeq -> 199
    //   189: ldc2_w -1117874696
    //   192: l2i
    //   193: ldc -1299531875
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w -1028964104
    //   202: l2i
    //   203: ldc -1324695402
    //   205: ixor
    //   206: ldc2_w 1889343152
    //   209: l2i
    //   210: ldc 1705721180
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 918, 451021193 -> 199, 1721215874 -> 240
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.MOVEMENT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w 1527778041
    //   246: l2i
    //   247: ldc 1527778040
    //   249: ixor
    //   250: ldc2_w -929119050
    //   253: l2i
    //   254: ldc -929119050
    //   256: ixor
    //   257: ldc2_w -1616196166
    //   260: l2i
    //   261: ldc -1616196166
    //   263: ixor
    //   264: getstatic Perryc.c : I
    //   267: iflt -> 280
    //   270: ldc2_w -1161069383
    //   273: l2i
    //   274: ldc -865955878
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w -135431960
    //   283: l2i
    //   284: ldc 166217924
    //   286: ixor
    //   287: ldc2_w -477768787
    //   290: l2i
    //   291: ldc -2085475053
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 924, -1640837486 -> 320, 379456989 -> 280
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.0 : I
    //   326: ifle -> 339
    //   329: ldc2_w 660238610
    //   332: l2i
    //   333: ldc -1499905369
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w 1241822399
    //   342: l2i
    //   343: ldc -664334244
    //   345: ixor
    //   346: ldc2_w -1372238538
    //   349: l2i
    //   350: ldc -1766893005
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 914, -1426476058 -> 380, -1185340240 -> 339
    //   380: aload_0
    //   381: getstatic Perryc.c : I
    //   384: iflt -> 397
    //   387: ldc2_w 1116555065
    //   390: l2i
    //   391: ldc 1810134482
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w -1391643061
    //   400: l2i
    //   401: ldc 1782920243
    //   403: ixor
    //   404: ldc2_w 2055971570
    //   407: l2i
    //   408: ldc 321322692
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 920, -1360699826 -> 440, 1086615261 -> 397
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc '嚯㌃図㶲'
    //   447: getstatic Perryc.c : I
    //   450: iflt -> 463
    //   453: ldc2_w 1903174990
    //   456: l2i
    //   457: ldc 949385036
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w 238337899
    //   466: l2i
    //   467: ldc -971957211
    //   469: ixor
    //   470: ldc2_w 1782276893
    //   473: l2i
    //   474: ldc 1580193223
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 504, -1795167433 -> 463, 2113070296 -> 908
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc2_w -112162082
    //   510: l2i
    //   511: ldc -112162092
    //   513: ixor
    //   514: getstatic Perryc.1 : I
    //   517: ifeq -> 530
    //   520: ldc2_w 904123676
    //   523: l2i
    //   524: ldc 990655515
    //   526: ixor
    //   527: goto -> 537
    //   530: ldc2_w -1478997634
    //   533: l2i
    //   534: ldc 385642152
    //   536: ixor
    //   537: ldc2_w 1330959175
    //   540: l2i
    //   541: ldc 1514231088
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 930, -1540251231 -> 572, 469395312 -> 530
    //   572: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   575: ldc2_w 1833796525
    //   578: l2i
    //   579: ldc 1833796524
    //   581: ixor
    //   582: getstatic Perryc.1 : I
    //   585: ifeq -> 598
    //   588: ldc2_w -1572377434
    //   591: l2i
    //   592: ldc -1009498845
    //   594: ixor
    //   595: goto -> 605
    //   598: ldc2_w -385706211
    //   601: l2i
    //   602: ldc -804872703
    //   604: ixor
    //   605: ldc2_w 1159927756
    //   608: l2i
    //   609: ldc 1710097198
    //   611: ixor
    //   612: ixor
    //   613: lookupswitch default -> 910, 432610814 -> 640, 1096695143 -> 598
    //   640: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   643: ldc2_w 1971930109
    //   646: l2i
    //   647: ldc 1971930089
    //   649: ixor
    //   650: getstatic Perryc.1 : I
    //   653: ifeq -> 666
    //   656: ldc2_w -911214753
    //   659: l2i
    //   660: ldc 592696666
    //   662: ixor
    //   663: goto -> 674
    //   666: ldc2_w 643015481
    //   669: l2i
    //   670: ldc_w 1183098026
    //   673: ixor
    //   674: ldc2_w 714802720
    //   677: l2i
    //   678: ldc_w 1931635491
    //   681: ixor
    //   682: ixor
    //   683: lookupswitch default -> 904, -1287303418 -> 666, 963537552 -> 708
    //   708: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   711: getstatic Perryc.c : I
    //   714: iflt -> 728
    //   717: ldc2_w -1669266948
    //   720: l2i
    //   721: ldc_w -178557817
    //   724: ixor
    //   725: goto -> 736
    //   728: ldc2_w 255923032
    //   731: l2i
    //   732: ldc_w -1166870244
    //   735: ixor
    //   736: ldc2_w -545333741
    //   739: l2i
    //   740: ldc_w 451508050
    //   743: ixor
    //   744: ixor
    //   745: lookupswitch default -> 772, -1404189638 -> 916, 180084826 -> 728
    //   772: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   775: getstatic Perryc.c : I
    //   778: iflt -> 792
    //   781: ldc2_w -266719106
    //   784: l2i
    //   785: ldc_w -1352773232
    //   788: ixor
    //   789: goto -> 800
    //   792: ldc2_w 1318594119
    //   795: l2i
    //   796: ldc_w 1560835977
    //   799: ixor
    //   800: ldc2_w 1572202040
    //   803: l2i
    //   804: ldc_w -1005965554
    //   807: ixor
    //   808: ixor
    //   809: lookupswitch default -> 928, -1976592136 -> 836, -956585768 -> 792
    //   836: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   839: getstatic Perryc.1 : I
    //   842: ifeq -> 856
    //   845: ldc2_w -214177302
    //   848: l2i
    //   849: ldc_w -794599674
    //   852: ixor
    //   853: goto -> 864
    //   856: ldc2_w -1841489957
    //   859: l2i
    //   860: ldc_w 1342293608
    //   863: ixor
    //   864: ldc2_w 1612753362
    //   867: l2i
    //   868: ldc_w -1540596570
    //   871: ixor
    //   872: ixor
    //   873: lookupswitch default -> 912, -409713768 -> 856, 103818439 -> 900
    //   900: putfield speed : Lbigname/zprestige/webhack/features/setting/Setting;
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
    //   0	904	0	this	Lbigname/zprestige/webhack/features/modules/Movement/ReverseStep;
  }
  
  public void onUpdate() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1887
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 1879
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1871
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 1174034495
    //   33: l2i
    //   34: ldc_w 399863967
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -9603664
    //   44: l2i
    //   45: ldc_w -1533328672
    //   48: ixor
    //   49: ldc2_w -533258790
    //   52: l2i
    //   53: ldc_w -375665275
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1635939973 -> 41, 1535375615 -> 1832
    //   84: goto -> 88
    //   87: athrow
    //   88: invokestatic fullNullCheck : ()Z
    //   91: goto -> 95
    //   94: athrow
    //   95: ifne -> 109
    //   98: ldc2_w -2046085941
    //   101: l2i
    //   102: ldc_w 1887526008
    //   105: ixor
    //   106: goto -> 117
    //   109: ldc2_w 17056416
    //   112: l2i
    //   113: ldc_w -141678060
    //   116: ixor
    //   117: ldc2_w 1652632171
    //   120: l2i
    //   121: ldc_w 1767849163
    //   124: ixor
    //   125: ixor
    //   126: tableswitch default -> 98, -44794349 -> 148, -44794348 -> 904
    //   148: getstatic Perryc.0 : I
    //   151: ifle -> 165
    //   154: ldc2_w -1577468109
    //   157: l2i
    //   158: ldc_w 1449900213
    //   161: ixor
    //   162: goto -> 173
    //   165: ldc2_w -1107550825
    //   168: l2i
    //   169: ldc_w 1060039629
    //   172: ixor
    //   173: ldc2_w 1978148977
    //   176: l2i
    //   177: ldc_w -1202171241
    //   180: ixor
    //   181: ixor
    //   182: lookupswitch default -> 1846, 975338848 -> 165, 1331858620 -> 208
    //   208: getstatic bigname/zprestige/webhack/features/modules/Movement/ReverseStep.mc : Lnet/minecraft/client/Minecraft;
    //   211: getstatic Perryc.c : I
    //   214: iflt -> 228
    //   217: ldc2_w 1965643018
    //   220: l2i
    //   221: ldc_w 1112785056
    //   224: ixor
    //   225: goto -> 236
    //   228: ldc2_w -1749256164
    //   231: l2i
    //   232: ldc_w -1148018540
    //   235: ixor
    //   236: ldc2_w 447161039
    //   239: l2i
    //   240: ldc_w -102307879
    //   243: ixor
    //   244: ixor
    //   245: lookupswitch default -> 1850, -814801506 -> 272, -734310212 -> 228
    //   272: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   275: getstatic Perryc.1 : I
    //   278: ifeq -> 292
    //   281: ldc2_w -197114877
    //   284: l2i
    //   285: ldc_w -1695610448
    //   288: ixor
    //   289: goto -> 300
    //   292: ldc2_w 80387801
    //   295: l2i
    //   296: ldc_w -1941093707
    //   299: ixor
    //   300: ldc2_w -357326589
    //   303: l2i
    //   304: ldc_w -29377909
    //   307: ixor
    //   308: ixor
    //   309: lookupswitch default -> 336, -756076394 -> 292, 2049136187 -> 1838
    //   336: goto -> 340
    //   339: athrow
    //   340: invokevirtual func_70090_H : ()Z
    //   343: goto -> 347
    //   346: athrow
    //   347: ifne -> 361
    //   350: ldc2_w 1670241938
    //   353: l2i
    //   354: ldc_w -1173591962
    //   357: ixor
    //   358: goto -> 369
    //   361: ldc2_w -202861637
    //   364: l2i
    //   365: ldc_w 711533902
    //   368: ixor
    //   369: ldc2_w -678854840
    //   372: l2i
    //   373: ldc_w 722505940
    //   376: ixor
    //   377: ixor
    //   378: tableswitch default -> 350, 622352744 -> 400, 622352745 -> 904
    //   400: getstatic Perryc.1 : I
    //   403: ifeq -> 417
    //   406: ldc2_w -724776236
    //   409: l2i
    //   410: ldc_w 1732880901
    //   413: ixor
    //   414: goto -> 425
    //   417: ldc2_w -1384468396
    //   420: l2i
    //   421: ldc_w -1732204277
    //   424: ixor
    //   425: ldc2_w -12069255
    //   428: l2i
    //   429: ldc_w -112909197
    //   432: ixor
    //   433: ixor
    //   434: lookupswitch default -> 460, -1249406245 -> 1828, 1831170697 -> 417
    //   460: getstatic bigname/zprestige/webhack/features/modules/Movement/ReverseStep.mc : Lnet/minecraft/client/Minecraft;
    //   463: getstatic Perryc.0 : I
    //   466: ifle -> 480
    //   469: ldc2_w -1770454691
    //   472: l2i
    //   473: ldc_w -1329225458
    //   476: ixor
    //   477: goto -> 488
    //   480: ldc2_w -1787090794
    //   483: l2i
    //   484: ldc_w 1621433180
    //   487: ixor
    //   488: ldc2_w -829447643
    //   491: l2i
    //   492: ldc_w 1732772628
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 1854, -1887764126 -> 480, 1545179899 -> 524
    //   524: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   527: getstatic Perryc.1 : I
    //   530: ifeq -> 544
    //   533: ldc2_w 1820031977
    //   536: l2i
    //   537: ldc_w -1541806619
    //   540: ixor
    //   541: goto -> 552
    //   544: ldc2_w -351195730
    //   547: l2i
    //   548: ldc_w -712687011
    //   551: ixor
    //   552: ldc2_w 894881239
    //   555: l2i
    //   556: ldc_w -1579831423
    //   559: ixor
    //   560: ixor
    //   561: lookupswitch default -> 588, -1334357056 -> 544, 1558314074 -> 1816
    //   588: goto -> 592
    //   591: athrow
    //   592: invokevirtual func_180799_ab : ()Z
    //   595: goto -> 599
    //   598: athrow
    //   599: ifne -> 613
    //   602: ldc2_w -1267580098
    //   605: l2i
    //   606: ldc_w -565793399
    //   609: ixor
    //   610: goto -> 621
    //   613: ldc2_w 798747035
    //   616: l2i
    //   617: ldc_w 1169098541
    //   620: ixor
    //   621: ldc2_w -960586578
    //   624: l2i
    //   625: ldc_w 70029201
    //   628: ixor
    //   629: ixor
    //   630: tableswitch default -> 602, -1465451128 -> 652, -1465451127 -> 904
    //   652: getstatic Perryc.c : I
    //   655: iflt -> 669
    //   658: ldc2_w 410050891
    //   661: l2i
    //   662: ldc_w -1203526384
    //   665: ixor
    //   666: goto -> 677
    //   669: ldc2_w 409461361
    //   672: l2i
    //   673: ldc_w -2087945401
    //   676: ixor
    //   677: ldc2_w 487685838
    //   680: l2i
    //   681: ldc_w -2090209212
    //   684: ixor
    //   685: ixor
    //   686: lookupswitch default -> 712, 1045154513 -> 1856, 1143129213 -> 669
    //   712: getstatic bigname/zprestige/webhack/features/modules/Movement/ReverseStep.mc : Lnet/minecraft/client/Minecraft;
    //   715: getstatic Perryc.0 : I
    //   718: ifle -> 732
    //   721: ldc2_w 781259954
    //   724: l2i
    //   725: ldc_w 405655100
    //   728: ixor
    //   729: goto -> 740
    //   732: ldc2_w 1390428716
    //   735: l2i
    //   736: ldc_w -1409745107
    //   739: ixor
    //   740: ldc2_w 1544419250
    //   743: l2i
    //   744: ldc_w 1626732274
    //   747: ixor
    //   748: ixor
    //   749: lookupswitch default -> 1858, -975127487 -> 776, 172284878 -> 732
    //   776: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   779: getstatic Perryc.1 : I
    //   782: ifeq -> 796
    //   785: ldc2_w 1794224716
    //   788: l2i
    //   789: ldc_w 860397424
    //   792: ixor
    //   793: goto -> 804
    //   796: ldc2_w 526551274
    //   799: l2i
    //   800: ldc_w 293509159
    //   803: ixor
    //   804: ldc2_w 2086160589
    //   807: l2i
    //   808: ldc_w 2129113149
    //   811: ixor
    //   812: ixor
    //   813: lookupswitch default -> 1826, 212068413 -> 840, 1527174604 -> 796
    //   840: goto -> 844
    //   843: athrow
    //   844: invokevirtual func_70617_f_ : ()Z
    //   847: goto -> 851
    //   850: athrow
    //   851: ifeq -> 865
    //   854: ldc2_w 718021609
    //   857: l2i
    //   858: ldc_w -157725917
    //   861: ixor
    //   862: goto -> 873
    //   865: ldc2_w -302281091
    //   868: l2i
    //   869: ldc_w 833545910
    //   872: ixor
    //   873: ldc2_w -1256460304
    //   876: l2i
    //   877: ldc_w 140397720
    //   880: ixor
    //   881: ixor
    //   882: tableswitch default -> 854, 1628490658 -> 904, 1628490659 -> 905
    //   904: return
    //   905: getstatic Perryc.1 : I
    //   908: ifeq -> 922
    //   911: ldc2_w 1220064347
    //   914: l2i
    //   915: ldc_w -523700569
    //   918: ixor
    //   919: goto -> 930
    //   922: ldc2_w -1333909979
    //   925: l2i
    //   926: ldc_w 1084388073
    //   929: ixor
    //   930: ldc2_w 687728256
    //   933: l2i
    //   934: ldc_w 1119237047
    //   937: ixor
    //   938: ixor
    //   939: lookupswitch default -> 1840, -1701346821 -> 964, -1036281909 -> 922
    //   964: getstatic bigname/zprestige/webhack/features/modules/Movement/ReverseStep.mc : Lnet/minecraft/client/Minecraft;
    //   967: getstatic Perryc.0 : I
    //   970: ifle -> 984
    //   973: ldc2_w 1779726482
    //   976: l2i
    //   977: ldc_w 1003769929
    //   980: ixor
    //   981: goto -> 992
    //   984: ldc2_w -1468811701
    //   987: l2i
    //   988: ldc_w 776996709
    //   991: ixor
    //   992: ldc2_w 1238784402
    //   995: l2i
    //   996: ldc_w -1390675983
    //   999: ixor
    //   1000: ixor
    //   1001: lookupswitch default -> 1028, -1257404744 -> 1818, -873053366 -> 984
    //   1028: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1031: getstatic Perryc.0 : I
    //   1034: ifle -> 1048
    //   1037: ldc2_w -1100567744
    //   1040: l2i
    //   1041: ldc_w -1141234882
    //   1044: ixor
    //   1045: goto -> 1056
    //   1048: ldc2_w -1611781430
    //   1051: l2i
    //   1052: ldc_w 1848537137
    //   1055: ixor
    //   1056: ldc2_w 1753417647
    //   1059: l2i
    //   1060: ldc_w -459684531
    //   1063: ixor
    //   1064: ixor
    //   1065: lookupswitch default -> 1860, -1987687780 -> 1048, 2111477785 -> 1092
    //   1092: getfield field_70122_E : Z
    //   1095: ifeq -> 1109
    //   1098: ldc2_w 1307559172
    //   1101: l2i
    //   1102: ldc_w -172747157
    //   1105: ixor
    //   1106: goto -> 1117
    //   1109: ldc2_w 90653503
    //   1112: l2i
    //   1113: ldc_w -1120104367
    //   1116: ixor
    //   1117: ldc2_w 1544983141
    //   1120: l2i
    //   1121: ldc_w 1421038670
    //   1124: ixor
    //   1125: ixor
    //   1126: tableswitch default -> 1098, -1325525692 -> 1148, -1325525691 -> 1815
    //   1148: getstatic Perryc.c : I
    //   1151: iflt -> 1165
    //   1154: ldc2_w 1851884912
    //   1157: l2i
    //   1158: ldc_w -1790363639
    //   1161: ixor
    //   1162: goto -> 1173
    //   1165: ldc2_w 1516819198
    //   1168: l2i
    //   1169: ldc_w 251931376
    //   1172: ixor
    //   1173: ldc2_w -1029564671
    //   1176: l2i
    //   1177: ldc_w 2096344768
    //   1180: ixor
    //   1181: ixor
    //   1182: lookupswitch default -> 1208, 1165558968 -> 1830, 1851743839 -> 1165
    //   1208: getstatic bigname/zprestige/webhack/features/modules/Movement/ReverseStep.mc : Lnet/minecraft/client/Minecraft;
    //   1211: getstatic Perryc.1 : I
    //   1214: ifeq -> 1228
    //   1217: ldc2_w 24727918
    //   1220: l2i
    //   1221: ldc_w -499489455
    //   1224: ixor
    //   1225: goto -> 1236
    //   1228: ldc2_w -314974607
    //   1231: l2i
    //   1232: ldc_w 45866242
    //   1235: ixor
    //   1236: ldc2_w -1446408638
    //   1239: l2i
    //   1240: ldc_w -45991059
    //   1243: ixor
    //   1244: ixor
    //   1245: lookupswitch default -> 1852, -1211596528 -> 1228, -1156991396 -> 1272
    //   1272: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1275: getstatic Perryc.c : I
    //   1278: iflt -> 1292
    //   1281: ldc2_w 1286135122
    //   1284: l2i
    //   1285: ldc_w -1018740738
    //   1288: ixor
    //   1289: goto -> 1300
    //   1292: ldc2_w 1859407672
    //   1295: l2i
    //   1296: ldc_w -1640386093
    //   1299: ixor
    //   1300: ldc2_w 142662950
    //   1303: l2i
    //   1304: ldc_w -1002031456
    //   1307: ixor
    //   1308: ixor
    //   1309: lookupswitch default -> 1822, 1009456493 -> 1336, 1126762794 -> 1292
    //   1336: astore_1
    //   1337: getstatic Perryc.0 : I
    //   1340: ifle -> 1354
    //   1343: ldc2_w -1452087532
    //   1346: l2i
    //   1347: ldc_w -1281328337
    //   1350: ixor
    //   1351: goto -> 1362
    //   1354: ldc2_w 270098573
    //   1357: l2i
    //   1358: ldc_w 1980527166
    //   1361: ixor
    //   1362: ldc2_w -549654298
    //   1365: l2i
    //   1366: ldc_w -761178376
    //   1369: ixor
    //   1370: ixor
    //   1371: lookupswitch default -> 1836, 391068197 -> 1354, 1804121261 -> 1396
    //   1396: aload_1
    //   1397: dup
    //   1398: getstatic Perryc.c : I
    //   1401: iflt -> 1415
    //   1404: ldc2_w -793466473
    //   1407: l2i
    //   1408: ldc_w -179765075
    //   1411: ixor
    //   1412: goto -> 1423
    //   1415: ldc2_w -637918072
    //   1418: l2i
    //   1419: ldc_w 147210876
    //   1422: ixor
    //   1423: ldc2_w 817923311
    //   1426: l2i
    //   1427: ldc_w 1569134402
    //   1430: ixor
    //   1431: ixor
    //   1432: lookupswitch default -> 1460, -1354920465 -> 1415, 1220164247 -> 1824
    //   1460: getfield field_70181_x : D
    //   1463: getstatic Perryc.1 : I
    //   1466: ifeq -> 1480
    //   1469: ldc2_w -475111316
    //   1472: l2i
    //   1473: ldc_w -1429697440
    //   1476: ixor
    //   1477: goto -> 1488
    //   1480: ldc2_w -537201109
    //   1483: l2i
    //   1484: ldc_w 147218166
    //   1487: ixor
    //   1488: ldc2_w 926164551
    //   1491: l2i
    //   1492: ldc_w 1210787769
    //   1495: ixor
    //   1496: ixor
    //   1497: lookupswitch default -> 1524, -1537662735 -> 1480, 913960434 -> 1842
    //   1524: aload_0
    //   1525: getstatic Perryc.1 : I
    //   1528: ifeq -> 1542
    //   1531: ldc2_w 1251640493
    //   1534: l2i
    //   1535: ldc_w -2071303574
    //   1538: ixor
    //   1539: goto -> 1550
    //   1542: ldc2_w 527909679
    //   1545: l2i
    //   1546: ldc_w -2138151869
    //   1549: ixor
    //   1550: ldc2_w 1317348543
    //   1553: l2i
    //   1554: ldc_w 487409881
    //   1557: ixor
    //   1558: ixor
    //   1559: lookupswitch default -> 1834, -1650949471 -> 1542, -864990454 -> 1584
    //   1584: getfield speed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1587: getstatic Perryc.1 : I
    //   1590: ifeq -> 1604
    //   1593: ldc2_w -1435735072
    //   1596: l2i
    //   1597: ldc_w 1991074793
    //   1600: ixor
    //   1601: goto -> 1612
    //   1604: ldc2_w 2023588867
    //   1607: l2i
    //   1608: ldc_w 1144479916
    //   1611: ixor
    //   1612: ldc2_w -870657398
    //   1615: l2i
    //   1616: ldc_w 665662993
    //   1619: ixor
    //   1620: ixor
    //   1621: lookupswitch default -> 1820, -685965260 -> 1648, 930540690 -> 1604
    //   1648: goto -> 1652
    //   1651: athrow
    //   1652: invokevirtual getValue : ()Ljava/lang/Object;
    //   1655: goto -> 1659
    //   1658: athrow
    //   1659: checkcast java/lang/Integer
    //   1662: getstatic Perryc.0 : I
    //   1665: ifle -> 1679
    //   1668: ldc2_w -2089803240
    //   1671: l2i
    //   1672: ldc_w 156989873
    //   1675: ixor
    //   1676: goto -> 1687
    //   1679: ldc2_w -257448841
    //   1682: l2i
    //   1683: ldc_w 1379863781
    //   1686: ixor
    //   1687: ldc2_w -742915171
    //   1690: l2i
    //   1691: ldc_w -1147770032
    //   1694: ixor
    //   1695: ixor
    //   1696: lookupswitch default -> 1848, -893992865 -> 1724, -502975644 -> 1679
    //   1724: goto -> 1728
    //   1727: athrow
    //   1728: invokevirtual intValue : ()I
    //   1731: goto -> 1735
    //   1734: athrow
    //   1735: i2f
    //   1736: ldc_w 0.023548676
    //   1739: invokestatic floatToIntBits : (F)I
    //   1742: ldc_w 2111891751
    //   1745: ixor
    //   1746: invokestatic intBitsToFloat : (I)F
    //   1749: fdiv
    //   1750: f2d
    //   1751: dsub
    //   1752: getstatic Perryc.1 : I
    //   1755: ifeq -> 1769
    //   1758: ldc2_w -1448276881
    //   1761: l2i
    //   1762: ldc_w -2135458462
    //   1765: ixor
    //   1766: goto -> 1777
    //   1769: ldc2_w 1048249175
    //   1772: l2i
    //   1773: ldc_w 427489127
    //   1776: ixor
    //   1777: ldc2_w 70326471
    //   1780: l2i
    //   1781: ldc_w -1307405894
    //   1784: ixor
    //   1785: ixor
    //   1786: lookupswitch default -> 1812, -1623590800 -> 1844, 212108371 -> 1769
    //   1812: putfield field_70181_x : D
    //   1815: return
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
    //   1842: aconst_null
    //   1843: athrow
    //   1844: aconst_null
    //   1845: athrow
    //   1846: aconst_null
    //   1847: athrow
    //   1848: aconst_null
    //   1849: athrow
    //   1850: aconst_null
    //   1851: athrow
    //   1852: aconst_null
    //   1853: athrow
    //   1854: aconst_null
    //   1855: athrow
    //   1856: aconst_null
    //   1857: athrow
    //   1858: aconst_null
    //   1859: athrow
    //   1860: aconst_null
    //   1861: athrow
    //   1862: pop
    //   1863: goto -> 24
    //   1866: pop
    //   1867: aconst_null
    //   1868: goto -> 1862
    //   1871: dup
    //   1872: ifnull -> 1862
    //   1875: checkcast java/lang/Throwable
    //   1878: athrow
    //   1879: dup
    //   1880: ifnull -> 1866
    //   1883: checkcast java/lang/Throwable
    //   1886: athrow
    //   1887: aconst_null
    //   1888: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1337	478	1	player	Lnet/minecraft/client/entity/EntityPlayerSP;
    //   24	1792	0	this	Lbigname/zprestige/webhack/features/modules/Movement/ReverseStep;
    // Exception table:
    //   from	to	target	type
    //   8	20	1871	java/lang/NullPointerException
    //   87	94	94	finally
    //   87	94	3	finally
    //   87	94	87	finally
    //   87	94	87	finally
    //   88	94	94	java/lang/EnumConstantNotPresentException
    //   339	346	346	finally
    //   340	346	339	java/lang/StringIndexOutOfBoundsException
    //   340	346	346	java/lang/ArrayIndexOutOfBoundsException
    //   340	346	339	java/util/NoSuchElementException
    //   340	346	3	java/util/NoSuchElementException
    //   591	598	598	finally
    //   591	598	598	java/lang/NegativeArraySizeException
    //   591	598	591	java/util/ConcurrentModificationException
    //   592	598	598	finally
    //   592	598	591	finally
    //   843	850	850	finally
    //   843	850	850	java/lang/StringIndexOutOfBoundsException
    //   843	850	843	java/lang/ArrayIndexOutOfBoundsException
    //   844	850	850	finally
    //   844	850	3	finally
    //   1651	1658	1658	finally
    //   1651	1658	1651	java/lang/NullPointerException
    //   1651	1658	3	java/lang/NumberFormatException
    //   1652	1658	1651	java/util/NoSuchElementException
    //   1652	1658	1651	finally
    //   1727	1734	1734	finally
    //   1728	1734	1734	java/lang/NullPointerException
    //   1728	1734	3	java/lang/IndexOutOfBoundsException
    //   1728	1734	1734	finally
    //   1728	1734	1727	finally
    //   1871	1879	1871	finally
    //   1887	1889	3	finally
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Movement\ReverseStep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */