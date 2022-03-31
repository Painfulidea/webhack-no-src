package bigname.zprestige.webhack.util;

import Perry1;

public class ItemUtil$Task {
  public int slot;
  
  public boolean quickClick;
  
  public boolean update;
  
  public boolean isSwitching() {
    return Perry1.4z(this, (int)-1472624940L ^ 0x800603FF);
  }
  
  public ItemUtil$Task() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 1738679155
    //   9: l2i
    //   10: ldc 114224550
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -2130363749
    //   19: l2i
    //   20: ldc -243684971
    //   22: ixor
    //   23: ldc2_w 638627665
    //   26: l2i
    //   27: ldc -286048682
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1450221614 -> 496, 1895124902 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w -2115869923
    //   66: l2i
    //   67: ldc -718145815
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -584378323
    //   76: l2i
    //   77: ldc -1153735243
    //   79: ixor
    //   80: ldc2_w -174085902
    //   83: l2i
    //   84: ldc -1307280228
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, 324551066 -> 506, 954710457 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.c : I
    //   122: iflt -> 135
    //   125: ldc2_w 161113617
    //   128: l2i
    //   129: ldc 876826642
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w 844184838
    //   138: l2i
    //   139: ldc -45800883
    //   141: ixor
    //   142: ldc2_w -203497092
    //   145: l2i
    //   146: ldc -780132637
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, -923376072 -> 135, 528992668 -> 504
    //   176: aload_0
    //   177: ldc2_w 1361031899
    //   180: l2i
    //   181: ldc 1361031898
    //   183: ixor
    //   184: getstatic Perryc.c : I
    //   187: iflt -> 200
    //   190: ldc2_w 988103802
    //   193: l2i
    //   194: ldc 1231478538
    //   196: ixor
    //   197: goto -> 207
    //   200: ldc2_w -429007907
    //   203: l2i
    //   204: ldc 1488960726
    //   206: ixor
    //   207: ldc2_w 1823735301
    //   210: l2i
    //   211: ldc 1036024457
    //   213: ixor
    //   214: ixor
    //   215: lookupswitch default -> 502, -274603129 -> 240, 586162172 -> 200
    //   240: putfield update : Z
    //   243: getstatic Perryc.1 : I
    //   246: ifeq -> 259
    //   249: ldc2_w 738049741
    //   252: l2i
    //   253: ldc -1821596486
    //   255: ixor
    //   256: goto -> 266
    //   259: ldc2_w -651461871
    //   262: l2i
    //   263: ldc -1111804070
    //   265: ixor
    //   266: ldc2_w -1245589203
    //   269: l2i
    //   270: ldc -1005636284
    //   272: ixor
    //   273: ixor
    //   274: lookupswitch default -> 494, -916455906 -> 259, 358524962 -> 300
    //   300: aload_0
    //   301: ldc2_w 1462805168
    //   304: l2i
    //   305: ldc -1462805169
    //   307: ixor
    //   308: getstatic Perryc.c : I
    //   311: iflt -> 324
    //   314: ldc2_w 1107521227
    //   317: l2i
    //   318: ldc 2142616631
    //   320: ixor
    //   321: goto -> 331
    //   324: ldc2_w -701809264
    //   327: l2i
    //   328: ldc -290480687
    //   330: ixor
    //   331: ldc2_w -162951303
    //   334: l2i
    //   335: ldc 979014853
    //   337: ixor
    //   338: ixor
    //   339: lookupswitch default -> 492, -240793280 -> 324, -191382531 -> 364
    //   364: putfield slot : I
    //   367: getstatic Perryc.1 : I
    //   370: ifeq -> 383
    //   373: ldc2_w -1042033681
    //   376: l2i
    //   377: ldc 1822642242
    //   379: ixor
    //   380: goto -> 390
    //   383: ldc2_w 1176201286
    //   386: l2i
    //   387: ldc 1829106132
    //   389: ixor
    //   390: ldc2_w 1844158755
    //   393: l2i
    //   394: ldc 1837157588
    //   396: ixor
    //   397: ixor
    //   398: lookupswitch default -> 424, -1389629862 -> 500, 1558735519 -> 383
    //   424: aload_0
    //   425: ldc2_w 1103031142
    //   428: l2i
    //   429: ldc 1103031142
    //   431: ixor
    //   432: getstatic Perryc.c : I
    //   435: iflt -> 448
    //   438: ldc2_w -1960993187
    //   441: l2i
    //   442: ldc -1117295862
    //   444: ixor
    //   445: goto -> 455
    //   448: ldc2_w -1603012969
    //   451: l2i
    //   452: ldc -1133215264
    //   454: ixor
    //   455: ldc2_w 2077232724
    //   458: l2i
    //   459: ldc -699954390
    //   461: ixor
    //   462: ixor
    //   463: lookupswitch default -> 498, -1678938071 -> 448, -1315900919 -> 488
    //   488: putfield quickClick : Z
    //   491: return
    //   492: aconst_null
    //   493: athrow
    //   494: aconst_null
    //   495: athrow
    //   496: aconst_null
    //   497: athrow
    //   498: aconst_null
    //   499: athrow
    //   500: aconst_null
    //   501: athrow
    //   502: aconst_null
    //   503: athrow
    //   504: aconst_null
    //   505: athrow
    //   506: aconst_null
    //   507: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	492	0	this	Lbigname/zprestige/webhack/util/ItemUtil$Task;
  }
  
  public ItemUtil$Task(int slot, boolean quickClick) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 1412151847
    //   9: l2i
    //   10: ldc -385227663
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1196343017
    //   19: l2i
    //   20: ldc 1743877944
    //   22: ixor
    //   23: ldc2_w 566322890
    //   26: l2i
    //   27: ldc -1182522915
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 606, 627513665 -> 16, 1191539000 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.1 : I
    //   60: ifeq -> 73
    //   63: ldc2_w -935670632
    //   66: l2i
    //   67: ldc -1791519068
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -1683445061
    //   76: l2i
    //   77: ldc -1820421485
    //   79: ixor
    //   80: ldc2_w -125260336
    //   83: l2i
    //   84: ldc -1858461757
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1035413956 -> 73, 884992047 -> 612
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.1 : I
    //   122: ifeq -> 135
    //   125: ldc2_w -680232067
    //   128: l2i
    //   129: ldc 964266216
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w 802014665
    //   138: l2i
    //   139: ldc 695712417
    //   141: ixor
    //   142: ldc2_w 2055369012
    //   145: l2i
    //   146: ldc 611148687
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 616, -1327308498 -> 135, 1481993683 -> 176
    //   176: aload_0
    //   177: getstatic Perryc.1 : I
    //   180: ifeq -> 193
    //   183: ldc2_w 791555033
    //   186: l2i
    //   187: ldc -250665310
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w -353402236
    //   196: l2i
    //   197: ldc 245738145
    //   199: ixor
    //   200: ldc2_w -1182942252
    //   203: l2i
    //   204: ldc 1544119343
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 618, 20903902 -> 236, 995480192 -> 193
    //   236: iload_1
    //   237: getstatic Perryc.c : I
    //   240: iflt -> 253
    //   243: ldc2_w 103507233
    //   246: l2i
    //   247: ldc -1149818324
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w -983593553
    //   256: l2i
    //   257: ldc 436766632
    //   259: ixor
    //   260: ldc2_w -1246272693
    //   263: l2i
    //   264: ldc -1636568124
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 622, -1768366206 -> 253, -191653240 -> 296
    //   296: putfield slot : I
    //   299: getstatic Perryc.1 : I
    //   302: ifeq -> 315
    //   305: ldc2_w 1062902398
    //   308: l2i
    //   309: ldc -596108687
    //   311: ixor
    //   312: goto -> 322
    //   315: ldc2_w -1558620438
    //   318: l2i
    //   319: ldc 1169748423
    //   321: ixor
    //   322: ldc2_w 1928856173
    //   325: l2i
    //   326: ldc 2115417697
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 356, -271830013 -> 608, 1904196198 -> 315
    //   356: aload_0
    //   357: getstatic Perryc.1 : I
    //   360: ifeq -> 373
    //   363: ldc2_w 226329373
    //   366: l2i
    //   367: ldc 575195729
    //   369: ixor
    //   370: goto -> 380
    //   373: ldc2_w -192450583
    //   376: l2i
    //   377: ldc -422765946
    //   379: ixor
    //   380: ldc2_w -23411416
    //   383: l2i
    //   384: ldc -1409864781
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 604, 1193778164 -> 416, 2052630487 -> 373
    //   416: iload_2
    //   417: getstatic Perryc.0 : I
    //   420: ifle -> 433
    //   423: ldc2_w 54570691
    //   426: l2i
    //   427: ldc 1518281617
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w -1321248842
    //   436: l2i
    //   437: ldc -1717093154
    //   439: ixor
    //   440: ldc2_w 1012875568
    //   443: l2i
    //   444: ldc -666588100
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, -1121689506 -> 614, 201906862 -> 433
    //   476: putfield quickClick : Z
    //   479: getstatic Perryc.1 : I
    //   482: ifeq -> 495
    //   485: ldc2_w 369144566
    //   488: l2i
    //   489: ldc -118203045
    //   491: ixor
    //   492: goto -> 502
    //   495: ldc2_w -2007943533
    //   498: l2i
    //   499: ldc -978322575
    //   501: ixor
    //   502: ldc2_w 1759071001
    //   505: l2i
    //   506: ldc -1205525367
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 620, -1660771726 -> 536, 1040744509 -> 495
    //   536: aload_0
    //   537: ldc2_w -954070233
    //   540: l2i
    //   541: ldc -954070233
    //   543: ixor
    //   544: getstatic Perryc.0 : I
    //   547: ifle -> 560
    //   550: ldc2_w -1996123152
    //   553: l2i
    //   554: ldc 1834254030
    //   556: ixor
    //   557: goto -> 567
    //   560: ldc2_w 830306208
    //   563: l2i
    //   564: ldc 2055978197
    //   566: ixor
    //   567: ldc2_w 207180435
    //   570: l2i
    //   571: ldc 1092694015
    //   573: ixor
    //   574: ixor
    //   575: lookupswitch default -> 600, -1456893870 -> 610, -1044878170 -> 560
    //   600: putfield update : Z
    //   603: return
    //   604: aconst_null
    //   605: athrow
    //   606: aconst_null
    //   607: athrow
    //   608: aconst_null
    //   609: athrow
    //   610: aconst_null
    //   611: athrow
    //   612: aconst_null
    //   613: athrow
    //   614: aconst_null
    //   615: athrow
    //   616: aconst_null
    //   617: athrow
    //   618: aconst_null
    //   619: athrow
    //   620: aconst_null
    //   621: athrow
    //   622: aconst_null
    //   623: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	604	0	this	Lbigname/zprestige/webhack/util/ItemUtil$Task;
    //   0	604	1	slot	I
    //   0	604	2	quickClick	Z
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public ItemUtil$Task(int slot) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 1864429573
    //   9: l2i
    //   10: ldc -56575328
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1723993448
    //   19: l2i
    //   20: ldc -1930368719
    //   22: ixor
    //   23: ldc2_w -1900012433
    //   26: l2i
    //   27: ldc -253826350
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -308364264 -> 576, 1574041524 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w -685059568
    //   66: l2i
    //   67: ldc -2144510254
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1807439564
    //   76: l2i
    //   77: ldc -588707346
    //   79: ixor
    //   80: ldc2_w 2046688696
    //   83: l2i
    //   84: ldc -2133072577
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1373531067 -> 574, 2103002137 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.0 : I
    //   122: ifle -> 135
    //   125: ldc2_w 1040590985
    //   128: l2i
    //   129: ldc -564482826
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -1935755490
    //   138: l2i
    //   139: ldc 1953462167
    //   141: ixor
    //   142: ldc2_w -1573469548
    //   145: l2i
    //   146: ldc -141498258
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, -1536073981 -> 135, -1241862523 -> 568
    //   176: aload_0
    //   177: getstatic Perryc.0 : I
    //   180: ifle -> 193
    //   183: ldc2_w -2133599321
    //   186: l2i
    //   187: ldc 1112386474
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w 201848137
    //   196: l2i
    //   197: ldc -556409689
    //   199: ixor
    //   200: ldc2_w -1119495999
    //   203: l2i
    //   204: ldc_w -1924120850
    //   207: ixor
    //   208: ixor
    //   209: lookupswitch default -> 564, -490221631 -> 236, -225733086 -> 193
    //   236: iload_1
    //   237: getstatic Perryc.c : I
    //   240: iflt -> 254
    //   243: ldc2_w -834885513
    //   246: l2i
    //   247: ldc_w 1759661833
    //   250: ixor
    //   251: goto -> 262
    //   254: ldc2_w -353803239
    //   257: l2i
    //   258: ldc_w 1155062569
    //   261: ixor
    //   262: ldc2_w -217811359
    //   265: l2i
    //   266: ldc_w 1011258769
    //   269: ixor
    //   270: ixor
    //   271: lookupswitch default -> 296, -503829293 -> 254, 1771832462 -> 566
    //   296: putfield slot : I
    //   299: getstatic Perryc.1 : I
    //   302: ifeq -> 316
    //   305: ldc2_w 974054007
    //   308: l2i
    //   309: ldc_w 2091305368
    //   312: ixor
    //   313: goto -> 324
    //   316: ldc2_w 1610037573
    //   319: l2i
    //   320: ldc_w -1459510032
    //   323: ixor
    //   324: ldc2_w -1589515167
    //   327: l2i
    //   328: ldc_w 1581591155
    //   331: ixor
    //   332: ixor
    //   333: lookupswitch default -> 360, -1179849219 -> 580, -456728527 -> 316
    //   360: aload_0
    //   361: ldc2_w -1448352844
    //   364: l2i
    //   365: ldc_w -1448352844
    //   368: ixor
    //   369: getstatic Perryc.c : I
    //   372: iflt -> 386
    //   375: ldc2_w 192862767
    //   378: l2i
    //   379: ldc_w -834211146
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w 1588602806
    //   389: l2i
    //   390: ldc_w -1728249088
    //   393: ixor
    //   394: ldc2_w -311834217
    //   397: l2i
    //   398: ldc_w -1952492060
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 428, -1546734358 -> 578, 614829076 -> 386
    //   428: putfield quickClick : Z
    //   431: getstatic Perryc.c : I
    //   434: iflt -> 448
    //   437: ldc2_w -389103551
    //   440: l2i
    //   441: ldc_w -1147536069
    //   444: ixor
    //   445: goto -> 456
    //   448: ldc2_w -1251960176
    //   451: l2i
    //   452: ldc_w -1449170287
    //   455: ixor
    //   456: ldc2_w -233997913
    //   459: l2i
    //   460: ldc_w -2066556496
    //   463: ixor
    //   464: ixor
    //   465: lookupswitch default -> 492, -1339250506 -> 448, 629710189 -> 570
    //   492: aload_0
    //   493: ldc2_w -9528899
    //   496: l2i
    //   497: ldc_w -9528899
    //   500: ixor
    //   501: getstatic Perryc.c : I
    //   504: iflt -> 518
    //   507: ldc2_w 1276041069
    //   510: l2i
    //   511: ldc_w 1257924556
    //   514: ixor
    //   515: goto -> 526
    //   518: ldc2_w -1728965842
    //   521: l2i
    //   522: ldc_w -1619831654
    //   525: ixor
    //   526: ldc2_w -337675671
    //   529: l2i
    //   530: ldc_w 1339480538
    //   533: ixor
    //   534: ixor
    //   535: lookupswitch default -> 560, -1895251177 -> 518, -1560472814 -> 572
    //   560: putfield update : Z
    //   563: return
    //   564: aconst_null
    //   565: athrow
    //   566: aconst_null
    //   567: athrow
    //   568: aconst_null
    //   569: athrow
    //   570: aconst_null
    //   571: athrow
    //   572: aconst_null
    //   573: athrow
    //   574: aconst_null
    //   575: athrow
    //   576: aconst_null
    //   577: athrow
    //   578: aconst_null
    //   579: athrow
    //   580: aconst_null
    //   581: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	564	0	this	Lbigname/zprestige/webhack/util/ItemUtil$Task;
    //   0	564	1	slot	I
  }
  
  public void run() {
    Perry1.3O(this, (int)-1753313247L ^ 0xD53563B0);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\ItemUtil$Task.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */