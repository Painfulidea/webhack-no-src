package bigname.zprestige.webhack.features.modules.Combat;

import net.minecraft.util.math.BlockPos;

public class GodModule$AttackThread extends Thread {
  public GodModule godModule;
  
  public BlockPos pos;
  
  public int id;
  
  public int delay;
  
  public GodModule$AttackThread(int idIn, BlockPos posIn, int delayIn, GodModule godModuleIn) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 287434959
    //   9: l2i
    //   10: ldc -1459888171
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1712270741
    //   19: l2i
    //   20: ldc -623785878
    //   22: ixor
    //   23: ldc2_w 952244644
    //   26: l2i
    //   27: ldc -96272665
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 856, -2120090302 -> 56, 2069549145 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w 1128802380
    //   66: l2i
    //   67: ldc -2143393772
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1929821124
    //   76: l2i
    //   77: ldc -772033700
    //   79: ixor
    //   80: ldc2_w 981673079
    //   83: l2i
    //   84: ldc -1637828782
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, 46083276 -> 73, 1737872253 -> 862
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.c : I
    //   122: iflt -> 135
    //   125: ldc2_w -338764916
    //   128: l2i
    //   129: ldc 588433516
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -1725072265
    //   138: l2i
    //   139: ldc 181600277
    //   141: ixor
    //   142: ldc2_w -1990509917
    //   145: l2i
    //   146: ldc -65585236
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 858, -1114630417 -> 135, -424511123 -> 176
    //   176: aload_0
    //   177: getstatic Perryc.c : I
    //   180: iflt -> 193
    //   183: ldc2_w -2118530134
    //   186: l2i
    //   187: ldc 238455097
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w -1117526311
    //   196: l2i
    //   197: ldc -1329038863
    //   199: ixor
    //   200: ldc2_w 1014384420
    //   203: l2i
    //   204: ldc -1018442059
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 236, 1174724836 -> 193, 1890765570 -> 860
    //   236: iload_1
    //   237: getstatic Perryc.0 : I
    //   240: ifle -> 253
    //   243: ldc2_w -2072527250
    //   246: l2i
    //   247: ldc 1010303406
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w 1408183979
    //   256: l2i
    //   257: ldc -1491689858
    //   259: ixor
    //   260: ldc2_w 769082635
    //   263: l2i
    //   264: ldc -592613402
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 296, -921973782 -> 253, 1228248365 -> 842
    //   296: putfield id : I
    //   299: getstatic Perryc.c : I
    //   302: iflt -> 315
    //   305: ldc2_w -1005360000
    //   308: l2i
    //   309: ldc 936427833
    //   311: ixor
    //   312: goto -> 322
    //   315: ldc2_w -341576172
    //   318: l2i
    //   319: ldc 1072596241
    //   321: ixor
    //   322: ldc2_w 1752480940
    //   325: l2i
    //   326: ldc 2071615794
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 356, -844538408 -> 315, -523417561 -> 864
    //   356: aload_0
    //   357: getstatic Perryc.1 : I
    //   360: ifeq -> 373
    //   363: ldc2_w -837043562
    //   366: l2i
    //   367: ldc -1739492008
    //   369: ixor
    //   370: goto -> 380
    //   373: ldc2_w -126267281
    //   376: l2i
    //   377: ldc 2004406940
    //   379: ixor
    //   380: ldc2_w 1099294450
    //   383: l2i
    //   384: ldc -2122791945
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 854, -1766331701 -> 373, 1341958134 -> 416
    //   416: aload_2
    //   417: getstatic Perryc.1 : I
    //   420: ifeq -> 433
    //   423: ldc2_w -1549511698
    //   426: l2i
    //   427: ldc 967583305
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 2023617132
    //   436: l2i
    //   437: ldc 1115946350
    //   439: ixor
    //   440: ldc2_w -1653299554
    //   443: l2i
    //   444: ldc 487566790
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 866, -1167784870 -> 476, 443776767 -> 433
    //   476: putfield pos : Lnet/minecraft/util/math/BlockPos;
    //   479: getstatic Perryc.1 : I
    //   482: ifeq -> 495
    //   485: ldc2_w -1016938949
    //   488: l2i
    //   489: ldc 2019346711
    //   491: ixor
    //   492: goto -> 502
    //   495: ldc2_w 1540002760
    //   498: l2i
    //   499: ldc -1428391649
    //   501: ixor
    //   502: ldc2_w -49942997
    //   505: l2i
    //   506: ldc -1796130197
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 840, -1730003305 -> 536, -758471828 -> 495
    //   536: aload_0
    //   537: getstatic Perryc.c : I
    //   540: iflt -> 553
    //   543: ldc2_w 1678365584
    //   546: l2i
    //   547: ldc 1704517786
    //   549: ixor
    //   550: goto -> 560
    //   553: ldc2_w 306692238
    //   556: l2i
    //   557: ldc 1025007773
    //   559: ixor
    //   560: ldc2_w -1407677061
    //   563: l2i
    //   564: ldc 1173527955
    //   566: ixor
    //   567: ixor
    //   568: lookupswitch default -> 596, -1451437826 -> 553, -394583070 -> 846
    //   596: iload_3
    //   597: getstatic Perryc.0 : I
    //   600: ifle -> 613
    //   603: ldc2_w -604701192
    //   606: l2i
    //   607: ldc -2048528553
    //   609: ixor
    //   610: goto -> 620
    //   613: ldc2_w -1521138944
    //   616: l2i
    //   617: ldc 267902726
    //   619: ixor
    //   620: ldc2_w 309899084
    //   623: l2i
    //   624: ldc -2018211477
    //   626: ixor
    //   627: ixor
    //   628: lookupswitch default -> 844, -874695544 -> 613, 1064221217 -> 656
    //   656: putfield delay : I
    //   659: getstatic Perryc.0 : I
    //   662: ifle -> 675
    //   665: ldc2_w 1135508509
    //   668: l2i
    //   669: ldc -723254926
    //   671: ixor
    //   672: goto -> 682
    //   675: ldc2_w -416313789
    //   678: l2i
    //   679: ldc -721127612
    //   681: ixor
    //   682: ldc2_w 1562237137
    //   685: l2i
    //   686: ldc 477030729
    //   688: ixor
    //   689: ixor
    //   690: lookupswitch default -> 716, -700887817 -> 848, 177518503 -> 675
    //   716: aload_0
    //   717: getstatic Perryc.0 : I
    //   720: ifle -> 733
    //   723: ldc2_w 1689703747
    //   726: l2i
    //   727: ldc 104611490
    //   729: ixor
    //   730: goto -> 740
    //   733: ldc2_w 1380989192
    //   736: l2i
    //   737: ldc 763228208
    //   739: ixor
    //   740: ldc2_w -610963764
    //   743: l2i
    //   744: ldc -2072064734
    //   746: ixor
    //   747: ixor
    //   748: lookupswitch default -> 776, -762584456 -> 733, 1029785615 -> 850
    //   776: aload #4
    //   778: getstatic Perryc.c : I
    //   781: iflt -> 794
    //   784: ldc2_w -1793556334
    //   787: l2i
    //   788: ldc -321643505
    //   790: ixor
    //   791: goto -> 801
    //   794: ldc2_w -31227006
    //   797: l2i
    //   798: ldc 153708970
    //   800: ixor
    //   801: ldc2_w 1618600666
    //   804: l2i
    //   805: ldc 1599264660
    //   807: ixor
    //   808: ixor
    //   809: lookupswitch default -> 852, -937304218 -> 836, 1189587411 -> 794
    //   836: putfield godModule : Lbigname/zprestige/webhack/features/modules/Combat/GodModule;
    //   839: return
    //   840: aconst_null
    //   841: athrow
    //   842: aconst_null
    //   843: athrow
    //   844: aconst_null
    //   845: athrow
    //   846: aconst_null
    //   847: athrow
    //   848: aconst_null
    //   849: athrow
    //   850: aconst_null
    //   851: athrow
    //   852: aconst_null
    //   853: athrow
    //   854: aconst_null
    //   855: athrow
    //   856: aconst_null
    //   857: athrow
    //   858: aconst_null
    //   859: athrow
    //   860: aconst_null
    //   861: athrow
    //   862: aconst_null
    //   863: athrow
    //   864: aconst_null
    //   865: athrow
    //   866: aconst_null
    //   867: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	840	0	this	Lbigname/zprestige/webhack/features/modules/Combat/GodModule$AttackThread;
    //   0	840	1	idIn	I
    //   0	840	2	posIn	Lnet/minecraft/util/math/BlockPos;
    //   0	840	3	delayIn	I
    //   0	840	4	godModuleIn	Lbigname/zprestige/webhack/features/modules/Combat/GodModule;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void run() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2247
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 2239
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2231
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 40
    //   30: ldc2_w 519992893
    //   33: l2i
    //   34: ldc 1931429606
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -595291132
    //   43: l2i
    //   44: ldc -1538985428
    //   46: ixor
    //   47: ldc2_w 997491585
    //   50: l2i
    //   51: ldc -1964893773
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 80, -596137239 -> 2156, 1484506163 -> 40
    //   80: aload_0
    //   81: getstatic Perryc.c : I
    //   84: iflt -> 97
    //   87: ldc2_w 1434027628
    //   90: l2i
    //   91: ldc 433199423
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -1413379898
    //   100: l2i
    //   101: ldc -483119068
    //   103: ixor
    //   104: ldc2_w 1656984517
    //   107: l2i
    //   108: ldc -309865012
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, -1007691430 -> 2212, 71976413 -> 97
    //   140: aload_0
    //   141: getstatic Perryc.c : I
    //   144: iflt -> 157
    //   147: ldc2_w -1252431618
    //   150: l2i
    //   151: ldc -1007253445
    //   153: ixor
    //   154: goto -> 164
    //   157: ldc2_w -62379514
    //   160: l2i
    //   161: ldc 1538599521
    //   163: ixor
    //   164: ldc2_w 1703766001
    //   167: l2i
    //   168: ldc 474471927
    //   170: ixor
    //   171: ixor
    //   172: lookupswitch default -> 2218, -566773151 -> 200, 258300611 -> 157
    //   200: getfield delay : I
    //   203: i2l
    //   204: getstatic Perryc.c : I
    //   207: iflt -> 220
    //   210: ldc2_w 1961409583
    //   213: l2i
    //   214: ldc -1016950592
    //   216: ixor
    //   217: goto -> 227
    //   220: ldc2_w -441014758
    //   223: l2i
    //   224: ldc -1820143369
    //   226: ixor
    //   227: ldc2_w -37458792
    //   230: l2i
    //   231: ldc 433222468
    //   233: ixor
    //   234: ixor
    //   235: lookupswitch default -> 2214, -1843238607 -> 260, 1402745651 -> 220
    //   260: goto -> 264
    //   263: athrow
    //   264: invokevirtual wait : (J)V
    //   267: goto -> 271
    //   270: athrow
    //   271: new net/minecraft/network/play/client/CPacketUseEntity
    //   274: dup
    //   275: getstatic Perryc.1 : I
    //   278: ifeq -> 291
    //   281: ldc2_w 1775891302
    //   284: l2i
    //   285: ldc 2041254121
    //   287: ixor
    //   288: goto -> 298
    //   291: ldc2_w -1116224461
    //   294: l2i
    //   295: ldc 825213547
    //   297: ixor
    //   298: ldc2_w -764415010
    //   301: l2i
    //   302: ldc -458542411
    //   304: ixor
    //   305: ixor
    //   306: lookupswitch default -> 332, 649470692 -> 2158, 1785730518 -> 291
    //   332: goto -> 336
    //   335: athrow
    //   336: invokespecial <init> : ()V
    //   339: goto -> 343
    //   342: athrow
    //   343: getstatic Perryc.0 : I
    //   346: ifle -> 359
    //   349: ldc2_w 2008776430
    //   352: l2i
    //   353: ldc 850357014
    //   355: ixor
    //   356: goto -> 367
    //   359: ldc2_w 429753018
    //   362: l2i
    //   363: ldc_w 815738978
    //   366: ixor
    //   367: ldc2_w -1642777045
    //   370: l2i
    //   371: ldc_w -1427689829
    //   374: ixor
    //   375: ixor
    //   376: lookupswitch default -> 2198, 502311528 -> 404, 1910902088 -> 359
    //   404: astore_1
    //   405: getstatic Perryc.1 : I
    //   408: ifeq -> 422
    //   411: ldc2_w 711150972
    //   414: l2i
    //   415: ldc_w 1800477141
    //   418: ixor
    //   419: goto -> 430
    //   422: ldc2_w -958642699
    //   425: l2i
    //   426: ldc_w -512289293
    //   429: ixor
    //   430: ldc2_w -1737344534
    //   433: l2i
    //   434: ldc_w -638807884
    //   437: ixor
    //   438: ixor
    //   439: lookupswitch default -> 2178, 11337207 -> 422, 1714813272 -> 464
    //   464: aload_1
    //   465: getstatic Perryc.c : I
    //   468: iflt -> 482
    //   471: ldc2_w 1094330344
    //   474: l2i
    //   475: ldc_w -213809336
    //   478: ixor
    //   479: goto -> 490
    //   482: ldc2_w -168737196
    //   485: l2i
    //   486: ldc_w 194532775
    //   489: ixor
    //   490: ldc2_w 9769250
    //   493: l2i
    //   494: ldc_w -847144357
    //   497: ixor
    //   498: ixor
    //   499: lookupswitch default -> 524, 1955559057 -> 482, 2137992153 -> 2206
    //   524: aload_0
    //   525: getstatic Perryc.c : I
    //   528: iflt -> 542
    //   531: ldc2_w 1088040747
    //   534: l2i
    //   535: ldc_w 743130935
    //   538: ixor
    //   539: goto -> 550
    //   542: ldc2_w 1202892736
    //   545: l2i
    //   546: ldc_w -332008916
    //   549: ixor
    //   550: ldc2_w -1477629426
    //   553: l2i
    //   554: ldc_w -205090696
    //   557: ixor
    //   558: ixor
    //   559: lookupswitch default -> 584, -2131969464 -> 542, 951767658 -> 2186
    //   584: getfield id : I
    //   587: getstatic Perryc.c : I
    //   590: iflt -> 604
    //   593: ldc2_w 159833914
    //   596: l2i
    //   597: ldc_w 1555970912
    //   600: ixor
    //   601: goto -> 612
    //   604: ldc2_w 1299177917
    //   607: l2i
    //   608: ldc_w -438120797
    //   611: ixor
    //   612: ldc2_w -1597715233
    //   615: l2i
    //   616: ldc_w -1256412638
    //   619: ixor
    //   620: ixor
    //   621: lookupswitch default -> 648, -1078355327 -> 604, 1088455335 -> 2174
    //   648: putfield field_149567_a : I
    //   651: getstatic Perryc.0 : I
    //   654: ifle -> 668
    //   657: ldc2_w 1223629454
    //   660: l2i
    //   661: ldc_w 329344306
    //   664: ixor
    //   665: goto -> 676
    //   668: ldc2_w -1132283530
    //   671: l2i
    //   672: ldc_w -1026981220
    //   675: ixor
    //   676: ldc2_w -2130189155
    //   679: l2i
    //   680: ldc_w 1878449373
    //   683: ixor
    //   684: ixor
    //   685: lookupswitch default -> 2168, -1866857558 -> 712, -1245755396 -> 668
    //   712: aload_1
    //   713: getstatic Perryc.c : I
    //   716: iflt -> 730
    //   719: ldc2_w -1515622932
    //   722: l2i
    //   723: ldc_w -196599533
    //   726: ixor
    //   727: goto -> 738
    //   730: ldc2_w -976464426
    //   733: l2i
    //   734: ldc_w 2142964373
    //   737: ixor
    //   738: ldc2_w 89728391
    //   741: l2i
    //   742: ldc_w -1250441157
    //   745: ixor
    //   746: ixor
    //   747: lookupswitch default -> 2194, -506486461 -> 730, 173650687 -> 772
    //   772: getstatic net/minecraft/network/play/client/CPacketUseEntity$Action.ATTACK : Lnet/minecraft/network/play/client/CPacketUseEntity$Action;
    //   775: getstatic Perryc.c : I
    //   778: iflt -> 792
    //   781: ldc2_w -748084697
    //   784: l2i
    //   785: ldc_w 2124702050
    //   788: ixor
    //   789: goto -> 800
    //   792: ldc2_w 2133195044
    //   795: l2i
    //   796: ldc_w 1610447351
    //   799: ixor
    //   800: ldc2_w -436900271
    //   803: l2i
    //   804: ldc_w -1816135162
    //   807: ixor
    //   808: ixor
    //   809: lookupswitch default -> 2176, -611854574 -> 792, 1452414084 -> 836
    //   836: putfield field_149566_b : Lnet/minecraft/network/play/client/CPacketUseEntity$Action;
    //   839: getstatic Perryc.0 : I
    //   842: ifle -> 856
    //   845: ldc2_w -1315191464
    //   848: l2i
    //   849: ldc_w 437574279
    //   852: ixor
    //   853: goto -> 864
    //   856: ldc2_w 1159368121
    //   859: l2i
    //   860: ldc_w 210848257
    //   863: ixor
    //   864: ldc2_w -1535947104
    //   867: l2i
    //   868: ldc_w -2124276085
    //   871: ixor
    //   872: ixor
    //   873: lookupswitch default -> 900, -2099083836 -> 856, -1902227468 -> 2162
    //   900: aload_0
    //   901: getstatic Perryc.1 : I
    //   904: ifeq -> 918
    //   907: ldc2_w -1098768767
    //   910: l2i
    //   911: ldc_w 278773802
    //   914: ixor
    //   915: goto -> 926
    //   918: ldc2_w -778937136
    //   921: l2i
    //   922: ldc_w 1151520381
    //   925: ixor
    //   926: ldc2_w -1095459962
    //   929: l2i
    //   930: ldc_w 750840613
    //   933: ixor
    //   934: ixor
    //   935: lookupswitch default -> 960, 820458140 -> 918, 1013689864 -> 2170
    //   960: getfield godModule : Lbigname/zprestige/webhack/features/modules/Combat/GodModule;
    //   963: getstatic Perryc.1 : I
    //   966: ifeq -> 980
    //   969: ldc2_w 1787768911
    //   972: l2i
    //   973: ldc_w 534345250
    //   976: ixor
    //   977: goto -> 988
    //   980: ldc2_w 2081521482
    //   983: l2i
    //   984: ldc_w 489502973
    //   987: ixor
    //   988: ldc2_w -991246576
    //   991: l2i
    //   992: ldc_w -1999527752
    //   995: ixor
    //   996: ixor
    //   997: lookupswitch default -> 1024, -654424884 -> 980, 963453381 -> 2216
    //   1024: aload_0
    //   1025: getstatic Perryc.0 : I
    //   1028: ifle -> 1042
    //   1031: ldc2_w 911340531
    //   1034: l2i
    //   1035: ldc_w 1718146011
    //   1038: ixor
    //   1039: goto -> 1050
    //   1042: ldc2_w 1430991996
    //   1045: l2i
    //   1046: ldc_w -298413727
    //   1049: ixor
    //   1050: ldc2_w 653517664
    //   1053: l2i
    //   1054: ldc_w -1344796494
    //   1057: ixor
    //   1058: ixor
    //   1059: lookupswitch default -> 2172, -653079558 -> 1042, 844517071 -> 1084
    //   1084: getfield pos : Lnet/minecraft/util/math/BlockPos;
    //   1087: getstatic Perryc.0 : I
    //   1090: ifle -> 1104
    //   1093: ldc2_w 1160631451
    //   1096: l2i
    //   1097: ldc_w -1224927843
    //   1100: ixor
    //   1101: goto -> 1112
    //   1104: ldc2_w 9867005
    //   1107: l2i
    //   1108: ldc_w -1727904425
    //   1111: ixor
    //   1112: ldc2_w 1875071230
    //   1115: l2i
    //   1116: ldc_w -2057217211
    //   1119: ixor
    //   1120: ixor
    //   1121: lookupswitch default -> 1148, 426953405 -> 2180, 815317613 -> 1104
    //   1148: goto -> 1152
    //   1151: athrow
    //   1152: invokevirtual func_177984_a : ()Lnet/minecraft/util/math/BlockPos;
    //   1155: goto -> 1159
    //   1158: athrow
    //   1159: getstatic Perryc.c : I
    //   1162: iflt -> 1176
    //   1165: ldc2_w 371869811
    //   1168: l2i
    //   1169: ldc_w 722237762
    //   1172: ixor
    //   1173: goto -> 1184
    //   1176: ldc2_w 1086547374
    //   1179: l2i
    //   1180: ldc_w -819966294
    //   1183: ixor
    //   1184: ldc2_w 1652060944
    //   1187: l2i
    //   1188: ldc_w -705672809
    //   1191: ixor
    //   1192: ixor
    //   1193: lookupswitch default -> 1220, -1968305226 -> 2166, 619085124 -> 1176
    //   1220: goto -> 1224
    //   1223: athrow
    //   1224: invokevirtual rotateTo : (Lnet/minecraft/util/math/BlockPos;)V
    //   1227: goto -> 1231
    //   1230: athrow
    //   1231: getstatic Perryc.c : I
    //   1234: iflt -> 1248
    //   1237: ldc2_w 1318492081
    //   1240: l2i
    //   1241: ldc_w 392047904
    //   1244: ixor
    //   1245: goto -> 1256
    //   1248: ldc2_w -96115404
    //   1251: l2i
    //   1252: ldc_w -876654556
    //   1255: ixor
    //   1256: ldc2_w -692805914
    //   1259: l2i
    //   1260: ldc_w 1897853571
    //   1263: ixor
    //   1264: ixor
    //   1265: lookupswitch default -> 1292, -1254539520 -> 1248, -27076876 -> 2188
    //   1292: getstatic bigname/zprestige/webhack/util/Util.mc : Lnet/minecraft/client/Minecraft;
    //   1295: getstatic Perryc.c : I
    //   1298: iflt -> 1312
    //   1301: ldc2_w -960333090
    //   1304: l2i
    //   1305: ldc_w -1481527336
    //   1308: ixor
    //   1309: goto -> 1320
    //   1312: ldc2_w 1636035386
    //   1315: l2i
    //   1316: ldc_w 635006694
    //   1319: ixor
    //   1320: ldc2_w 572325476
    //   1323: l2i
    //   1324: ldc_w 945899310
    //   1327: ixor
    //   1328: ixor
    //   1329: lookupswitch default -> 2208, 1579629718 -> 1356, 2064542796 -> 1312
    //   1356: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1359: getstatic Perryc.0 : I
    //   1362: ifle -> 1376
    //   1365: ldc2_w 682036652
    //   1368: l2i
    //   1369: ldc_w -1195493641
    //   1372: ixor
    //   1373: goto -> 1384
    //   1376: ldc2_w -466588869
    //   1379: l2i
    //   1380: ldc_w 1256952552
    //   1383: ixor
    //   1384: ldc2_w -412932211
    //   1387: l2i
    //   1388: ldc_w 835412092
    //   1391: ixor
    //   1392: ixor
    //   1393: lookupswitch default -> 1420, -537547569 -> 1376, 1186036906 -> 2164
    //   1420: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   1423: getstatic Perryc.0 : I
    //   1426: ifle -> 1440
    //   1429: ldc2_w 675972829
    //   1432: l2i
    //   1433: ldc_w -1595008105
    //   1436: ixor
    //   1437: goto -> 1448
    //   1440: ldc2_w 349405981
    //   1443: l2i
    //   1444: ldc_w 421396768
    //   1447: ixor
    //   1448: ldc2_w 683168800
    //   1451: l2i
    //   1452: ldc_w -1038518179
    //   1455: ixor
    //   1456: ixor
    //   1457: lookupswitch default -> 1484, 1644540215 -> 2220, 2028981896 -> 1440
    //   1484: aload_1
    //   1485: getstatic Perryc.1 : I
    //   1488: ifeq -> 1502
    //   1491: ldc2_w -1692385608
    //   1494: l2i
    //   1495: ldc_w -752736408
    //   1498: ixor
    //   1499: goto -> 1510
    //   1502: ldc2_w 71322507
    //   1505: l2i
    //   1506: ldc_w 1164720014
    //   1509: ixor
    //   1510: ldc2_w 134694533
    //   1513: l2i
    //   1514: ldc_w -1715522379
    //   1517: ixor
    //   1518: ixor
    //   1519: lookupswitch default -> 2200, -795603403 -> 1544, -642094112 -> 1502
    //   1544: goto -> 1548
    //   1547: athrow
    //   1548: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   1551: goto -> 1555
    //   1554: athrow
    //   1555: getstatic Perryc.1 : I
    //   1558: ifeq -> 1572
    //   1561: ldc2_w 924206964
    //   1564: l2i
    //   1565: ldc_w 1441756615
    //   1568: ixor
    //   1569: goto -> 1580
    //   1572: ldc2_w 664820978
    //   1575: l2i
    //   1576: ldc_w 1751253128
    //   1579: ixor
    //   1580: ldc2_w 316289273
    //   1583: l2i
    //   1584: ldc_w 1253062138
    //   1587: ixor
    //   1588: ixor
    //   1589: lookupswitch default -> 1616, 66692321 -> 1572, 982726576 -> 2190
    //   1616: getstatic bigname/zprestige/webhack/util/Util.mc : Lnet/minecraft/client/Minecraft;
    //   1619: getstatic Perryc.c : I
    //   1622: iflt -> 1636
    //   1625: ldc2_w 236829512
    //   1628: l2i
    //   1629: ldc_w -84609624
    //   1632: ixor
    //   1633: goto -> 1644
    //   1636: ldc2_w 1404813359
    //   1639: l2i
    //   1640: ldc_w -1925176927
    //   1643: ixor
    //   1644: ldc2_w 1014936441
    //   1647: l2i
    //   1648: ldc_w 1429519614
    //   1651: ixor
    //   1652: ixor
    //   1653: lookupswitch default -> 1680, -1650245273 -> 2184, 1937375327 -> 1636
    //   1680: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1683: getstatic Perryc.c : I
    //   1686: iflt -> 1700
    //   1689: ldc2_w -1963062673
    //   1692: l2i
    //   1693: ldc_w 1782846466
    //   1696: ixor
    //   1697: goto -> 1708
    //   1700: ldc2_w 1952755760
    //   1703: l2i
    //   1704: ldc_w 369388734
    //   1707: ixor
    //   1708: ldc2_w 683243339
    //   1711: l2i
    //   1712: ldc_w 1764456476
    //   1715: ixor
    //   1716: ixor
    //   1717: lookupswitch default -> 2182, -1591209670 -> 1700, 603116505 -> 1744
    //   1744: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   1747: new net/minecraft/network/play/client/CPacketAnimation
    //   1750: dup
    //   1751: getstatic Perryc.1 : I
    //   1754: ifeq -> 1768
    //   1757: ldc2_w -1232621741
    //   1760: l2i
    //   1761: ldc_w -1514764977
    //   1764: ixor
    //   1765: goto -> 1776
    //   1768: ldc2_w 1919357670
    //   1771: l2i
    //   1772: ldc_w 249409887
    //   1775: ixor
    //   1776: ldc2_w -449517123
    //   1779: l2i
    //   1780: ldc_w 755808828
    //   1783: ixor
    //   1784: ixor
    //   1785: lookupswitch default -> 1812, -620136035 -> 2202, 309493649 -> 1768
    //   1812: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   1815: getstatic Perryc.c : I
    //   1818: iflt -> 1832
    //   1821: ldc2_w 550098127
    //   1824: l2i
    //   1825: ldc_w 434551216
    //   1828: ixor
    //   1829: goto -> 1840
    //   1832: ldc2_w 930687466
    //   1835: l2i
    //   1836: ldc_w -1922906798
    //   1839: ixor
    //   1840: ldc2_w -1603920721
    //   1843: l2i
    //   1844: ldc_w 126677702
    //   1847: ixor
    //   1848: ixor
    //   1849: lookupswitch default -> 2204, -1631223018 -> 1832, 502334161 -> 1876
    //   1876: goto -> 1880
    //   1879: athrow
    //   1880: invokespecial <init> : (Lnet/minecraft/util/EnumHand;)V
    //   1883: goto -> 1887
    //   1886: athrow
    //   1887: getstatic Perryc.c : I
    //   1890: iflt -> 1904
    //   1893: ldc2_w 21999805
    //   1896: l2i
    //   1897: ldc_w 1471769299
    //   1900: ixor
    //   1901: goto -> 1912
    //   1904: ldc2_w -229027261
    //   1907: l2i
    //   1908: ldc_w 721246322
    //   1911: ixor
    //   1912: ldc2_w 1089162469
    //   1915: l2i
    //   1916: ldc_w -1589184097
    //   1919: ixor
    //   1920: ixor
    //   1921: lookupswitch default -> 2160, -1218744556 -> 1904, 956940107 -> 1948
    //   1948: goto -> 1952
    //   1951: athrow
    //   1952: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   1955: goto -> 1959
    //   1958: athrow
    //   1959: goto -> 2155
    //   1962: getstatic Perryc.1 : I
    //   1965: ifeq -> 1979
    //   1968: ldc2_w 1869532617
    //   1971: l2i
    //   1972: ldc_w 826542296
    //   1975: ixor
    //   1976: goto -> 1987
    //   1979: ldc2_w -1205682726
    //   1982: l2i
    //   1983: ldc_w -1494954316
    //   1986: ixor
    //   1987: ldc2_w -491844842
    //   1990: l2i
    //   1991: ldc_w -1572375379
    //   1994: ixor
    //   1995: ixor
    //   1996: lookupswitch default -> 2210, 516078250 -> 1979, 1580076245 -> 2024
    //   2024: astore_1
    //   2025: getstatic Perryc.c : I
    //   2028: iflt -> 2042
    //   2031: ldc2_w -731451539
    //   2034: l2i
    //   2035: ldc_w -1789811006
    //   2038: ixor
    //   2039: goto -> 2050
    //   2042: ldc2_w 1620460317
    //   2045: l2i
    //   2046: ldc_w 1180411754
    //   2049: ixor
    //   2050: ldc2_w 405597199
    //   2053: l2i
    //   2054: ldc_w 896128284
    //   2057: ixor
    //   2058: ixor
    //   2059: lookupswitch default -> 2084, 668335065 -> 2042, 1819439292 -> 2196
    //   2084: aload_1
    //   2085: getstatic Perryc.0 : I
    //   2088: ifle -> 2102
    //   2091: ldc2_w -468448201
    //   2094: l2i
    //   2095: ldc_w -2035887365
    //   2098: ixor
    //   2099: goto -> 2110
    //   2102: ldc2_w 1681924538
    //   2105: l2i
    //   2106: ldc_w 1986890894
    //   2109: ixor
    //   2110: ldc2_w -772100262
    //   2113: l2i
    //   2114: ldc_w -2018104317
    //   2117: ixor
    //   2118: ixor
    //   2119: lookupswitch default -> 2192, 889085333 -> 2102, 1147219565 -> 2144
    //   2144: goto -> 2148
    //   2147: athrow
    //   2148: invokevirtual printStackTrace : ()V
    //   2151: goto -> 2155
    //   2154: athrow
    //   2155: return
    //   2156: aconst_null
    //   2157: athrow
    //   2158: aconst_null
    //   2159: athrow
    //   2160: aconst_null
    //   2161: athrow
    //   2162: aconst_null
    //   2163: athrow
    //   2164: aconst_null
    //   2165: athrow
    //   2166: aconst_null
    //   2167: athrow
    //   2168: aconst_null
    //   2169: athrow
    //   2170: aconst_null
    //   2171: athrow
    //   2172: aconst_null
    //   2173: athrow
    //   2174: aconst_null
    //   2175: athrow
    //   2176: aconst_null
    //   2177: athrow
    //   2178: aconst_null
    //   2179: athrow
    //   2180: aconst_null
    //   2181: athrow
    //   2182: aconst_null
    //   2183: athrow
    //   2184: aconst_null
    //   2185: athrow
    //   2186: aconst_null
    //   2187: athrow
    //   2188: aconst_null
    //   2189: athrow
    //   2190: aconst_null
    //   2191: athrow
    //   2192: aconst_null
    //   2193: athrow
    //   2194: aconst_null
    //   2195: athrow
    //   2196: aconst_null
    //   2197: athrow
    //   2198: aconst_null
    //   2199: athrow
    //   2200: aconst_null
    //   2201: athrow
    //   2202: aconst_null
    //   2203: athrow
    //   2204: aconst_null
    //   2205: athrow
    //   2206: aconst_null
    //   2207: athrow
    //   2208: aconst_null
    //   2209: athrow
    //   2210: aconst_null
    //   2211: athrow
    //   2212: aconst_null
    //   2213: athrow
    //   2214: aconst_null
    //   2215: athrow
    //   2216: aconst_null
    //   2217: athrow
    //   2218: aconst_null
    //   2219: athrow
    //   2220: aconst_null
    //   2221: athrow
    //   2222: pop
    //   2223: goto -> 24
    //   2226: pop
    //   2227: aconst_null
    //   2228: goto -> 2222
    //   2231: dup
    //   2232: ifnull -> 2222
    //   2235: checkcast java/lang/Throwable
    //   2238: athrow
    //   2239: dup
    //   2240: ifnull -> 2226
    //   2243: checkcast java/lang/Throwable
    //   2246: athrow
    //   2247: aconst_null
    //   2248: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   405	1554	1	attack	Lnet/minecraft/network/play/client/CPacketUseEntity;
    //   2025	130	1	e	Ljava/lang/InterruptedException;
    //   24	2132	0	this	Lbigname/zprestige/webhack/features/modules/Combat/GodModule$AttackThread;
    // Exception table:
    //   from	to	target	type
    //   8	20	2231	finally
    //   24	335	1962	java/lang/InterruptedException
    //   263	270	270	finally
    //   263	270	270	java/lang/IndexOutOfBoundsException
    //   263	270	3	finally
    //   263	270	3	finally
    //   264	270	263	java/lang/NegativeArraySizeException
    //   336	342	342	finally
    //   336	342	342	finally
    //   336	342	342	java/lang/RuntimeException
    //   336	342	342	java/lang/ClassCastException
    //   336	342	342	java/lang/NullPointerException
    //   336	1547	1962	java/lang/InterruptedException
    //   1151	1158	1158	finally
    //   1151	1158	1151	finally
    //   1151	1158	1151	finally
    //   1151	1158	1158	finally
    //   1152	1158	1158	finally
    //   1223	1230	1230	finally
    //   1223	1230	1223	finally
    //   1223	1230	3	java/lang/NumberFormatException
    //   1223	1230	1230	java/lang/ArithmeticException
    //   1224	1230	3	finally
    //   1548	1554	1554	finally
    //   1548	1554	3	finally
    //   1548	1554	1554	java/lang/IndexOutOfBoundsException
    //   1548	1554	1554	java/lang/NumberFormatException
    //   1548	1554	1554	finally
    //   1548	1959	1962	java/lang/InterruptedException
    //   1879	1886	1886	finally
    //   1879	1886	1879	finally
    //   1879	1886	3	java/lang/IllegalStateException
    //   1879	1886	1886	finally
    //   1880	1886	1879	java/lang/ArrayIndexOutOfBoundsException
    //   1951	1958	1958	finally
    //   1951	1958	1951	java/lang/ArithmeticException
    //   1952	1958	1951	finally
    //   1952	1958	1951	java/lang/ArrayIndexOutOfBoundsException
    //   1952	1958	3	finally
    //   2147	2154	2154	finally
    //   2147	2154	2147	finally
    //   2147	2154	2147	java/lang/NumberFormatException
    //   2147	2154	2154	java/lang/RuntimeException
    //   2148	2154	2154	finally
    //   2231	2239	2231	java/lang/IndexOutOfBoundsException
    //   2247	2249	3	java/lang/NullPointerException
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\GodModule$AttackThread.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */