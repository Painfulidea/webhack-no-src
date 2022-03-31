package bigname.zprestige.webhack.util;

import Perry1;

public class InventoryUtil$Task {
  public boolean quickClick;
  
  public int slot;
  
  public boolean update;
  
  public void run() {
    Perry1.3q(this, (int)-701181456L ^ 0xE46C7074);
  }
  
  public InventoryUtil$Task() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w -594406102
    //   9: l2i
    //   10: ldc -2044590476
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1374059441
    //   19: l2i
    //   20: ldc -1448989776
    //   22: ixor
    //   23: ldc2_w 1616126670
    //   26: l2i
    //   27: ldc -212335178
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -910412762 -> 502, 145355729 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w -585906951
    //   66: l2i
    //   67: ldc -1542048634
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -1923665545
    //   76: l2i
    //   77: ldc 86714780
    //   79: ixor
    //   80: ldc2_w -1371816581
    //   83: l2i
    //   84: ldc -351629981
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1777147292 -> 73, 1010090087 -> 504
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.c : I
    //   122: iflt -> 135
    //   125: ldc2_w 465252242
    //   128: l2i
    //   129: ldc 2035238967
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w 159582978
    //   138: l2i
    //   139: ldc 1410356895
    //   141: ixor
    //   142: ldc2_w -1038706872
    //   145: l2i
    //   146: ldc 2125088178
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, -904919273 -> 135, -565660321 -> 498
    //   176: aload_0
    //   177: ldc2_w -1212300272
    //   180: l2i
    //   181: ldc -1212300271
    //   183: ixor
    //   184: getstatic Perryc.0 : I
    //   187: ifle -> 200
    //   190: ldc2_w -1673835089
    //   193: l2i
    //   194: ldc 314356963
    //   196: ixor
    //   197: goto -> 207
    //   200: ldc2_w 368383116
    //   203: l2i
    //   204: ldc 318094320
    //   206: ixor
    //   207: ldc2_w 1095018056
    //   210: l2i
    //   211: ldc 2074052799
    //   213: ixor
    //   214: ixor
    //   215: lookupswitch default -> 496, -1268983877 -> 200, 1037795723 -> 240
    //   240: putfield update : Z
    //   243: getstatic Perryc.1 : I
    //   246: ifeq -> 259
    //   249: ldc2_w 1117019608
    //   252: l2i
    //   253: ldc -91001035
    //   255: ixor
    //   256: goto -> 266
    //   259: ldc2_w 1217914054
    //   262: l2i
    //   263: ldc 597979196
    //   265: ixor
    //   266: ldc2_w 470746631
    //   269: l2i
    //   270: ldc 1761122036
    //   272: ixor
    //   273: ixor
    //   274: lookupswitch default -> 300, -856645090 -> 500, 832128822 -> 259
    //   300: aload_0
    //   301: ldc2_w -691958328
    //   304: l2i
    //   305: ldc 691958327
    //   307: ixor
    //   308: getstatic Perryc.c : I
    //   311: iflt -> 324
    //   314: ldc2_w 1021776605
    //   317: l2i
    //   318: ldc 588595028
    //   320: ixor
    //   321: goto -> 331
    //   324: ldc2_w 1606758569
    //   327: l2i
    //   328: ldc 11301246
    //   330: ixor
    //   331: ldc2_w 634060175
    //   334: l2i
    //   335: ldc -566068625
    //   337: ixor
    //   338: ixor
    //   339: lookupswitch default -> 364, -461723031 -> 506, 1894244235 -> 324
    //   364: putfield slot : I
    //   367: getstatic Perryc.0 : I
    //   370: ifle -> 383
    //   373: ldc2_w -230216746
    //   376: l2i
    //   377: ldc -2002036454
    //   379: ixor
    //   380: goto -> 390
    //   383: ldc2_w -150214560
    //   386: l2i
    //   387: ldc -210923305
    //   389: ixor
    //   390: ldc2_w 445501909
    //   393: l2i
    //   394: ldc -1128933504
    //   396: ixor
    //   397: ixor
    //   398: lookupswitch default -> 494, -1570865438 -> 424, -590056295 -> 383
    //   424: aload_0
    //   425: ldc2_w 398642197
    //   428: l2i
    //   429: ldc 398642197
    //   431: ixor
    //   432: getstatic Perryc.0 : I
    //   435: ifle -> 448
    //   438: ldc2_w -857815794
    //   441: l2i
    //   442: ldc 742207595
    //   444: ixor
    //   445: goto -> 455
    //   448: ldc2_w 1637525774
    //   451: l2i
    //   452: ldc 97136781
    //   454: ixor
    //   455: ldc2_w 622197451
    //   458: l2i
    //   459: ldc -701807945
    //   461: ixor
    //   462: ixor
    //   463: lookupswitch default -> 488, -1488761765 -> 448, 333270297 -> 492
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
    //   0	492	0	this	Lbigname/zprestige/webhack/util/InventoryUtil$Task;
  }
  
  public InventoryUtil$Task(int slot, boolean quickClick) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -483772697
    //   9: l2i
    //   10: ldc -941345665
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -381244186
    //   19: l2i
    //   20: ldc -1698982822
    //   22: ixor
    //   23: ldc2_w 1396696576
    //   26: l2i
    //   27: ldc 2049850952
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, 232774352 -> 622, 1209330144 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w 577278802
    //   66: l2i
    //   67: ldc -1002194430
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -2016993334
    //   76: l2i
    //   77: ldc -2034678514
    //   79: ixor
    //   80: ldc2_w -609091279
    //   83: l2i
    //   84: ldc 370109050
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 604, -859623025 -> 116, 731267611 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.c : I
    //   122: iflt -> 135
    //   125: ldc2_w -635258624
    //   128: l2i
    //   129: ldc 122512127
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -884952453
    //   138: l2i
    //   139: ldc 1453866431
    //   141: ixor
    //   142: ldc2_w -923508476
    //   145: l2i
    //   146: ldc -1530170421
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 620, -1320105680 -> 135, -237527797 -> 176
    //   176: aload_0
    //   177: getstatic Perryc.c : I
    //   180: iflt -> 193
    //   183: ldc2_w 490890194
    //   186: l2i
    //   187: ldc 1568980266
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w -877360025
    //   196: l2i
    //   197: ldc -193898289
    //   199: ixor
    //   200: ldc2_w -439800272
    //   203: l2i
    //   204: ldc -468296670
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 236, -1751813297 -> 193, 1092201706 -> 608
    //   236: iload_1
    //   237: getstatic Perryc.1 : I
    //   240: ifeq -> 253
    //   243: ldc2_w -907606697
    //   246: l2i
    //   247: ldc -1765735379
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w 779011993
    //   256: l2i
    //   257: ldc 2002825524
    //   259: ixor
    //   260: ldc2_w -915236
    //   263: l2i
    //   264: ldc 722970029
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 296, -1950110709 -> 612, 933017227 -> 253
    //   296: putfield slot : I
    //   299: getstatic Perryc.1 : I
    //   302: ifeq -> 315
    //   305: ldc2_w 1953486756
    //   308: l2i
    //   309: ldc -675348702
    //   311: ixor
    //   312: goto -> 322
    //   315: ldc2_w -62315481
    //   318: l2i
    //   319: ldc 705069857
    //   321: ixor
    //   322: ldc2_w 1242067516
    //   325: l2i
    //   326: ldc 2044207008
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 356, -1878964966 -> 616, -924619800 -> 315
    //   356: aload_0
    //   357: getstatic Perryc.1 : I
    //   360: ifeq -> 373
    //   363: ldc2_w 1774100428
    //   366: l2i
    //   367: ldc 1073253542
    //   369: ixor
    //   370: goto -> 380
    //   373: ldc2_w 1367110229
    //   376: l2i
    //   377: ldc 1082095611
    //   379: ixor
    //   380: ldc2_w -1673970172
    //   383: l2i
    //   384: ldc 195836169
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 614, -2036989277 -> 416, -1043131289 -> 373
    //   416: iload_2
    //   417: getstatic Perryc.0 : I
    //   420: ifle -> 433
    //   423: ldc2_w 625612782
    //   426: l2i
    //   427: ldc -1457794654
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w -1458845319
    //   436: l2i
    //   437: ldc 1991418091
    //   439: ixor
    //   440: ldc2_w 92012184
    //   443: l2i
    //   444: ldc -1385234468
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, 62987884 -> 433, 608487176 -> 606
    //   476: putfield quickClick : Z
    //   479: getstatic Perryc.0 : I
    //   482: ifle -> 495
    //   485: ldc2_w 308518306
    //   488: l2i
    //   489: ldc 158423373
    //   491: ixor
    //   492: goto -> 502
    //   495: ldc2_w -1020579235
    //   498: l2i
    //   499: ldc -849885155
    //   501: ixor
    //   502: ldc2_w 512183975
    //   505: l2i
    //   506: ldc -2034153309
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 610, -2091597077 -> 495, -1774519228 -> 536
    //   536: aload_0
    //   537: ldc2_w 733179369
    //   540: l2i
    //   541: ldc 733179369
    //   543: ixor
    //   544: getstatic Perryc.1 : I
    //   547: ifeq -> 560
    //   550: ldc2_w 1973594939
    //   553: l2i
    //   554: ldc 1688434309
    //   556: ixor
    //   557: goto -> 567
    //   560: ldc2_w -1858323683
    //   563: l2i
    //   564: ldc 2021599082
    //   566: ixor
    //   567: ldc2_w -425700973
    //   570: l2i
    //   571: ldc 1669945706
    //   573: ixor
    //   574: ixor
    //   575: lookupswitch default -> 600, -1809263289 -> 618, -1612303335 -> 560
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
    //   0	604	0	this	Lbigname/zprestige/webhack/util/InventoryUtil$Task;
    //   0	604	1	slot	I
    //   0	604	2	quickClick	Z
  }
  
  public InventoryUtil$Task(int slot) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w -335610555
    //   9: l2i
    //   10: ldc 20312739
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 2069848219
    //   19: l2i
    //   20: ldc -153475563
    //   22: ixor
    //   23: ldc2_w -1136345395
    //   26: l2i
    //   27: ldc -1408341584
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -727612994 -> 16, -92153701 -> 564
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w -1751298395
    //   66: l2i
    //   67: ldc 1501722965
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1619817833
    //   76: l2i
    //   77: ldc -2032154212
    //   79: ixor
    //   80: ldc2_w -1296712105
    //   83: l2i
    //   84: ldc -989409960
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1179892481 -> 578, 176101916 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.0 : I
    //   122: ifle -> 135
    //   125: ldc2_w 523225132
    //   128: l2i
    //   129: ldc -842888075
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -504931405
    //   138: l2i
    //   139: ldc 437817799
    //   141: ixor
    //   142: ldc2_w -276070831
    //   145: l2i
    //   146: ldc -1498919912
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, -1680968176 -> 574, 920275491 -> 135
    //   176: aload_0
    //   177: getstatic Perryc.1 : I
    //   180: ifeq -> 193
    //   183: ldc2_w 1725547454
    //   186: l2i
    //   187: ldc -1463376272
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w -1743670307
    //   196: l2i
    //   197: ldc 987082446
    //   199: ixor
    //   200: ldc2_w 1612027828
    //   203: l2i
    //   204: ldc 447244989
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 236, -1264412473 -> 580, -967519288 -> 193
    //   236: iload_1
    //   237: getstatic Perryc.1 : I
    //   240: ifeq -> 254
    //   243: ldc2_w -1715001363
    //   246: l2i
    //   247: ldc_w -1705418994
    //   250: ixor
    //   251: goto -> 262
    //   254: ldc2_w -931698744
    //   257: l2i
    //   258: ldc_w -1261343570
    //   261: ixor
    //   262: ldc2_w -376545558
    //   265: l2i
    //   266: ldc_w 2017938077
    //   269: ixor
    //   270: ixor
    //   271: lookupswitch default -> 296, -1839764332 -> 576, -1341566175 -> 254
    //   296: putfield slot : I
    //   299: getstatic Perryc.0 : I
    //   302: ifle -> 316
    //   305: ldc2_w 1164415767
    //   308: l2i
    //   309: ldc_w 1376692912
    //   312: ixor
    //   313: goto -> 324
    //   316: ldc2_w 609444214
    //   319: l2i
    //   320: ldc_w -1002904505
    //   323: ixor
    //   324: ldc2_w 2115913630
    //   327: l2i
    //   328: ldc_w 1778620083
    //   331: ixor
    //   332: ixor
    //   333: lookupswitch default -> 572, -193571812 -> 360, 57993354 -> 316
    //   360: aload_0
    //   361: ldc2_w 278826371
    //   364: l2i
    //   365: ldc_w 278826371
    //   368: ixor
    //   369: getstatic Perryc.c : I
    //   372: iflt -> 386
    //   375: ldc2_w 1943389897
    //   378: l2i
    //   379: ldc_w 709477769
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w 383177995
    //   389: l2i
    //   390: ldc_w -1977587515
    //   393: ixor
    //   394: ldc2_w 322362467
    //   397: l2i
    //   398: ldc_w 1194871186
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 568, -923260865 -> 428, 227710641 -> 386
    //   428: putfield quickClick : Z
    //   431: getstatic Perryc.c : I
    //   434: iflt -> 448
    //   437: ldc2_w 1761277456
    //   440: l2i
    //   441: ldc_w -1724839173
    //   444: ixor
    //   445: goto -> 456
    //   448: ldc2_w 1505813837
    //   451: l2i
    //   452: ldc_w 1379975550
    //   455: ixor
    //   456: ldc2_w -413580045
    //   459: l2i
    //   460: ldc_w -693513861
    //   463: ixor
    //   464: ixor
    //   465: lookupswitch default -> 570, -1069848221 -> 448, 980464059 -> 492
    //   492: aload_0
    //   493: ldc2_w -2129480185
    //   496: l2i
    //   497: ldc_w -2129480185
    //   500: ixor
    //   501: getstatic Perryc.1 : I
    //   504: ifeq -> 518
    //   507: ldc2_w -1896916860
    //   510: l2i
    //   511: ldc_w -648224237
    //   514: ixor
    //   515: goto -> 526
    //   518: ldc2_w 238028910
    //   521: l2i
    //   522: ldc_w 1202956943
    //   525: ixor
    //   526: ldc2_w 1042526695
    //   529: l2i
    //   530: ldc_w -473698440
    //   533: ixor
    //   534: ixor
    //   535: lookupswitch default -> 560, -1974213624 -> 566, -1240836790 -> 518
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
    //   0	564	0	this	Lbigname/zprestige/webhack/util/InventoryUtil$Task;
    //   0	564	1	slot	I
  }
  
  public boolean isSwitching() {
    return Perry1.4s(this, (int)2083282584L ^ 0xCF111CB);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\InventoryUtil$Task.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */