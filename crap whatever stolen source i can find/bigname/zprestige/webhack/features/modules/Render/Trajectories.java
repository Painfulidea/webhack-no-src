package bigname.zprestige.webhack.features.modules.Render;

import Perry1;
import bigname.zprestige.webhack.event.events.Render3DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;

public class Trajectories extends Module {
  public void disableGL3D() {
    Perry1.3A(this, (int)-385579217L ^ 0x94644C78);
  }
  
  public void onRender3D(Render3DEvent event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 785
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 777
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 769
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w -50713152
    //   33: l2i
    //   34: ldc -402636787
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -1081846797
    //   43: l2i
    //   44: ldc 1010507443
    //   46: ixor
    //   47: ldc2_w 565622176
    //   50: l2i
    //   51: ldc 1931025413
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 748, -787421979 -> 80, 1180025960 -> 40
    //   80: getstatic bigname/zprestige/webhack/features/modules/Render/Trajectories.mc : Lnet/minecraft/client/Minecraft;
    //   83: getstatic Perryc.c : I
    //   86: iflt -> 99
    //   89: ldc2_w 1467390633
    //   92: l2i
    //   93: ldc -1445569660
    //   95: ixor
    //   96: goto -> 106
    //   99: ldc2_w 977851362
    //   102: l2i
    //   103: ldc 582467595
    //   105: ixor
    //   106: ldc2_w 1317643848
    //   109: l2i
    //   110: ldc -2100604348
    //   112: ixor
    //   113: ixor
    //   114: lookupswitch default -> 140, -1725125088 -> 99, 853685537 -> 744
    //   140: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   143: ifnull -> 156
    //   146: ldc2_w 249822995
    //   149: l2i
    //   150: ldc 1393948134
    //   152: ixor
    //   153: goto -> 163
    //   156: ldc2_w -655420490
    //   159: l2i
    //   160: ldc -2061952700
    //   162: ixor
    //   163: ldc2_w 1005256866
    //   166: l2i
    //   167: ldc 1845534700
    //   169: ixor
    //   170: ixor
    //   171: tableswitch default -> 146, 136156603 -> 192, 136156604 -> 360
    //   192: getstatic Perryc.0 : I
    //   195: ifle -> 208
    //   198: ldc2_w 1933614438
    //   201: l2i
    //   202: ldc -1639483318
    //   204: ixor
    //   205: goto -> 215
    //   208: ldc2_w 1774569807
    //   211: l2i
    //   212: ldc -1814827137
    //   214: ixor
    //   215: ldc2_w 2141670953
    //   218: l2i
    //   219: ldc -1153765463
    //   221: ixor
    //   222: ixor
    //   223: lookupswitch default -> 248, -612202714 -> 208, 697975980 -> 758
    //   248: getstatic bigname/zprestige/webhack/features/modules/Render/Trajectories.mc : Lnet/minecraft/client/Minecraft;
    //   251: getstatic Perryc.1 : I
    //   254: ifeq -> 267
    //   257: ldc2_w 1531847210
    //   260: l2i
    //   261: ldc 280418793
    //   263: ixor
    //   264: goto -> 274
    //   267: ldc2_w -931189815
    //   270: l2i
    //   271: ldc 726809949
    //   273: ixor
    //   274: ldc2_w -1778633904
    //   277: l2i
    //   278: ldc -719497715
    //   280: ixor
    //   281: ixor
    //   282: lookupswitch default -> 308, 186228382 -> 742, 1081811349 -> 267
    //   308: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   311: ifnonnull -> 324
    //   314: ldc2_w 1912967880
    //   317: l2i
    //   318: ldc 453346873
    //   320: ixor
    //   321: goto -> 331
    //   324: ldc2_w -846357701
    //   327: l2i
    //   328: ldc -1534226483
    //   330: ixor
    //   331: ldc2_w 330797493
    //   334: l2i
    //   335: ldc 1606597807
    //   337: ixor
    //   338: ixor
    //   339: tableswitch default -> 314, 628439531 -> 360, 628439532 -> 361
    //   360: return
    //   361: getstatic Perryc.c : I
    //   364: iflt -> 377
    //   367: ldc2_w 2103012931
    //   370: l2i
    //   371: ldc 252609550
    //   373: ixor
    //   374: goto -> 384
    //   377: ldc2_w 1452316128
    //   380: l2i
    //   381: ldc 17282666
    //   383: ixor
    //   384: ldc2_w -2002097763
    //   387: l2i
    //   388: ldc 653910145
    //   390: ixor
    //   391: ixor
    //   392: lookupswitch default -> 420, -1028982356 -> 377, -603692207 -> 750
    //   420: aload_0
    //   421: getstatic Perryc.c : I
    //   424: iflt -> 437
    //   427: ldc2_w 1537110878
    //   430: l2i
    //   431: ldc 1335090969
    //   433: ixor
    //   434: goto -> 444
    //   437: ldc2_w -1979431226
    //   440: l2i
    //   441: ldc 639815451
    //   443: ixor
    //   444: ldc2_w 1705360301
    //   447: l2i
    //   448: ldc 1073726243
    //   450: ixor
    //   451: ixor
    //   452: lookupswitch default -> 480, 126741424 -> 437, 1314378953 -> 740
    //   480: getstatic bigname/zprestige/webhack/features/modules/Render/Trajectories.mc : Lnet/minecraft/client/Minecraft;
    //   483: getstatic Perryc.1 : I
    //   486: ifeq -> 499
    //   489: ldc2_w -988344193
    //   492: l2i
    //   493: ldc 839584255
    //   495: ixor
    //   496: goto -> 506
    //   499: ldc2_w -332939164
    //   502: l2i
    //   503: ldc 1469703193
    //   505: ixor
    //   506: ldc2_w -203709804
    //   509: l2i
    //   510: ldc 624423602
    //   512: ixor
    //   513: ixor
    //   514: lookupswitch default -> 754, 569395622 -> 499, 1834120283 -> 540
    //   540: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   543: getstatic Perryc.c : I
    //   546: iflt -> 559
    //   549: ldc2_w -815881638
    //   552: l2i
    //   553: ldc 2045714459
    //   555: ixor
    //   556: goto -> 566
    //   559: ldc2_w -1033276764
    //   562: l2i
    //   563: ldc 570758941
    //   565: ixor
    //   566: ldc2_w 1197217185
    //   569: l2i
    //   570: ldc -297944868
    //   572: ixor
    //   573: ixor
    //   574: lookupswitch default -> 600, -220046218 -> 559, 533737276 -> 746
    //   600: aload_1
    //   601: getstatic Perryc.c : I
    //   604: iflt -> 617
    //   607: ldc2_w -1177901417
    //   610: l2i
    //   611: ldc -193779606
    //   613: ixor
    //   614: goto -> 624
    //   617: ldc2_w 1037110702
    //   620: l2i
    //   621: ldc -1166801457
    //   623: ixor
    //   624: ldc2_w -1192176565
    //   627: l2i
    //   628: ldc -2097374193
    //   630: ixor
    //   631: ixor
    //   632: lookupswitch default -> 660, -1136760528 -> 617, 2008401593 -> 752
    //   660: goto -> 664
    //   663: athrow
    //   664: invokevirtual getPartialTicks : ()F
    //   667: goto -> 671
    //   670: athrow
    //   671: getstatic Perryc.c : I
    //   674: iflt -> 687
    //   677: ldc2_w 793097374
    //   680: l2i
    //   681: ldc 20040942
    //   683: ixor
    //   684: goto -> 694
    //   687: ldc2_w -746207858
    //   690: l2i
    //   691: ldc 1803044787
    //   693: ixor
    //   694: ldc2_w 467525033
    //   697: l2i
    //   698: ldc -1076893763
    //   700: ixor
    //   701: ixor
    //   702: lookupswitch default -> 756, -1973009820 -> 687, 485472297 -> 728
    //   728: goto -> 732
    //   731: athrow
    //   732: invokespecial drawTrajectories : (Lnet/minecraft/entity/player/EntityPlayer;F)V
    //   735: goto -> 739
    //   738: athrow
    //   739: return
    //   740: aconst_null
    //   741: athrow
    //   742: aconst_null
    //   743: athrow
    //   744: aconst_null
    //   745: athrow
    //   746: aconst_null
    //   747: athrow
    //   748: aconst_null
    //   749: athrow
    //   750: aconst_null
    //   751: athrow
    //   752: aconst_null
    //   753: athrow
    //   754: aconst_null
    //   755: athrow
    //   756: aconst_null
    //   757: athrow
    //   758: aconst_null
    //   759: athrow
    //   760: pop
    //   761: goto -> 24
    //   764: pop
    //   765: aconst_null
    //   766: goto -> 760
    //   769: dup
    //   770: ifnull -> 760
    //   773: checkcast java/lang/Throwable
    //   776: athrow
    //   777: dup
    //   778: ifnull -> 764
    //   781: checkcast java/lang/Throwable
    //   784: athrow
    //   785: aconst_null
    //   786: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	716	0	this	Lbigname/zprestige/webhack/features/modules/Render/Trajectories;
    //   24	716	1	event	Lbigname/zprestige/webhack/event/events/Render3DEvent;
    // Exception table:
    //   from	to	target	type
    //   8	20	769	java/lang/NumberFormatException
    //   663	670	670	finally
    //   663	670	663	finally
    //   663	670	3	finally
    //   664	670	663	finally
    //   664	670	670	finally
    //   731	738	738	finally
    //   731	738	731	java/lang/UnsupportedOperationException
    //   732	738	731	finally
    //   732	738	3	finally
    //   732	738	3	finally
    //   769	777	769	finally
    //   785	787	3	java/lang/UnsupportedOperationException
  }
  
  public Trajectories() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 132655151
    //   9: l2i
    //   10: ldc -375107644
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -427462059
    //   19: l2i
    //   20: ldc 250650557
    //   22: ixor
    //   23: ldc2_w -1965552071
    //   26: l2i
    //   27: ldc 1227261728
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 332, 730555633 -> 56, 766701298 -> 16
    //   56: aload_0
    //   57: ldc '࿠㌁྿㶽뭖๭牶蹱뜊਴'
    //   59: getstatic Perryc.0 : I
    //   62: ifle -> 75
    //   65: ldc2_w 1771367044
    //   68: l2i
    //   69: ldc -1563253154
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w 1820473247
    //   78: l2i
    //   79: ldc -1594567476
    //   81: ixor
    //   82: ldc2_w -221370937
    //   85: l2i
    //   86: ldc -766835548
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 116, -339513927 -> 328, 1164169587 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '࿧㌛ྱ㶠뭀๭牱蹦뜘ਦ숕無捔銷迟퟉ꝼꙴ耵侴䚪寥ᣋ꫄⤛'
    //   121: getstatic Perryc.c : I
    //   124: iflt -> 137
    //   127: ldc2_w 1347760622
    //   130: l2i
    //   131: ldc -1888073183
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w -2117110719
    //   140: l2i
    //   141: ldc 289107769
    //   143: ixor
    //   144: ldc2_w 1869463278
    //   147: l2i
    //   148: ldc -818699788
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 180, -386893932 -> 137, 2138924245 -> 330
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.c : I
    //   186: iflt -> 199
    //   189: ldc2_w 369766548
    //   192: l2i
    //   193: ldc -784255799
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w -363443333
    //   202: l2i
    //   203: ldc 1805626975
    //   205: ixor
    //   206: ldc2_w 45486185
    //   209: l2i
    //   210: ldc 1557999157
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 240, -1725941247 -> 326, 1468090119 -> 199
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.RENDER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w 1009661727
    //   246: l2i
    //   247: ldc 1009661727
    //   249: ixor
    //   250: ldc2_w -1623091701
    //   253: l2i
    //   254: ldc -1623091701
    //   256: ixor
    //   257: ldc2_w 1503431011
    //   260: l2i
    //   261: ldc 1503431011
    //   263: ixor
    //   264: getstatic Perryc.0 : I
    //   267: ifle -> 280
    //   270: ldc2_w 1101671139
    //   273: l2i
    //   274: ldc 1032821256
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w 682069911
    //   283: l2i
    //   284: ldc -729084304
    //   286: ixor
    //   287: ldc2_w 852415212
    //   290: l2i
    //   291: ldc -952466432
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 324, -1982732793 -> 280, 165205771 -> 320
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: return
    //   324: aconst_null
    //   325: athrow
    //   326: aconst_null
    //   327: athrow
    //   328: aconst_null
    //   329: athrow
    //   330: aconst_null
    //   331: athrow
    //   332: aconst_null
    //   333: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	324	0	this	Lbigname/zprestige/webhack/features/modules/Render/Trajectories;
  }
  
  public void drawTrajectories(EntityPlayer player, float partialTicks) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 25121
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 25113
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 25105
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 709356425
    //   33: l2i
    //   34: ldc_w 1847535666
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 773061693
    //   44: l2i
    //   45: ldc_w 1767292082
    //   48: ixor
    //   49: ldc2_w 120467854
    //   52: l2i
    //   53: ldc_w 1682923479
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1336077253 -> 41, 658091490 -> 24878
    //   84: aload_1
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w 1678901188
    //   94: l2i
    //   95: ldc_w -740932497
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -504182239
    //   105: l2i
    //   106: ldc_w -351054656
    //   109: ixor
    //   110: ldc2_w -1135534831
    //   113: l2i
    //   114: ldc_w -829760775
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -1862652299 -> 102, -987988925 -> 24656
    //   144: getfield field_70142_S : D
    //   147: getstatic Perryc.1 : I
    //   150: ifeq -> 164
    //   153: ldc2_w -1908278299
    //   156: l2i
    //   157: ldc_w 1692737338
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w -41240264
    //   167: l2i
    //   168: ldc_w 1187975416
    //   171: ixor
    //   172: ldc2_w 1469409375
    //   175: l2i
    //   176: ldc_w 1135481009
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 24506, -1350643410 -> 208, -23094223 -> 164
    //   208: aload_1
    //   209: getstatic Perryc.1 : I
    //   212: ifeq -> 226
    //   215: ldc2_w 169143432
    //   218: l2i
    //   219: ldc_w 60522175
    //   222: ixor
    //   223: goto -> 234
    //   226: ldc2_w -1113313507
    //   229: l2i
    //   230: ldc_w -2121747113
    //   233: ixor
    //   234: ldc2_w 1789229661
    //   237: l2i
    //   238: ldc_w -1983393673
    //   241: ixor
    //   242: ixor
    //   243: lookupswitch default -> 268, -1325377271 -> 226, -353552355 -> 25018
    //   268: getfield field_70165_t : D
    //   271: getstatic Perryc.1 : I
    //   274: ifeq -> 288
    //   277: ldc2_w -673588208
    //   280: l2i
    //   281: ldc_w 844329886
    //   284: ixor
    //   285: goto -> 296
    //   288: ldc2_w -661451180
    //   291: l2i
    //   292: ldc_w 1530703841
    //   295: ixor
    //   296: ldc2_w 1058353872
    //   299: l2i
    //   300: ldc_w -1104921342
    //   303: ixor
    //   304: ixor
    //   305: lookupswitch default -> 24468, 43953767 -> 332, 1690017884 -> 288
    //   332: aload_1
    //   333: getstatic Perryc.0 : I
    //   336: ifle -> 350
    //   339: ldc2_w 331095974
    //   342: l2i
    //   343: ldc_w 627465768
    //   346: ixor
    //   347: goto -> 358
    //   350: ldc2_w 1804124001
    //   353: l2i
    //   354: ldc_w 890185339
    //   357: ixor
    //   358: ldc2_w 1010349651
    //   361: l2i
    //   362: ldc_w -707177886
    //   365: ixor
    //   366: ixor
    //   367: lookupswitch default -> 24920, -1218020053 -> 392, -549739073 -> 350
    //   392: getfield field_70142_S : D
    //   395: dsub
    //   396: getstatic Perryc.c : I
    //   399: iflt -> 413
    //   402: ldc2_w -1684338578
    //   405: l2i
    //   406: ldc_w 347961820
    //   409: ixor
    //   410: goto -> 421
    //   413: ldc2_w -499172911
    //   416: l2i
    //   417: ldc_w -1829676019
    //   420: ixor
    //   421: ldc2_w -1149078112
    //   424: l2i
    //   425: ldc_w -1643114112
    //   428: ixor
    //   429: ixor
    //   430: lookupswitch default -> 24658, -1431038574 -> 413, 1432093180 -> 456
    //   456: fload_2
    //   457: f2d
    //   458: dmul
    //   459: dadd
    //   460: getstatic Perryc.0 : I
    //   463: ifle -> 477
    //   466: ldc2_w -2086978472
    //   469: l2i
    //   470: ldc_w 229772777
    //   473: ixor
    //   474: goto -> 485
    //   477: ldc2_w -1071207521
    //   480: l2i
    //   481: ldc_w -1691340285
    //   484: ixor
    //   485: ldc2_w -1380138898
    //   488: l2i
    //   489: ldc_w -1881443384
    //   492: ixor
    //   493: ixor
    //   494: lookupswitch default -> 24916, -1404141033 -> 477, 2037459514 -> 520
    //   520: dstore_3
    //   521: getstatic Perryc.0 : I
    //   524: ifle -> 538
    //   527: ldc2_w -308005150
    //   530: l2i
    //   531: ldc_w -642602313
    //   534: ixor
    //   535: goto -> 546
    //   538: ldc2_w -576493738
    //   541: l2i
    //   542: ldc_w 1023290230
    //   545: ixor
    //   546: ldc2_w -942364460
    //   549: l2i
    //   550: ldc_w 641029477
    //   553: ixor
    //   554: ixor
    //   555: lookupswitch default -> 580, -705207836 -> 24548, 663657829 -> 538
    //   580: aload_1
    //   581: getstatic Perryc.0 : I
    //   584: ifle -> 598
    //   587: ldc2_w 485560287
    //   590: l2i
    //   591: ldc_w -437622545
    //   594: ixor
    //   595: goto -> 606
    //   598: ldc2_w 1599373988
    //   601: l2i
    //   602: ldc_w -1021410367
    //   605: ixor
    //   606: ldc2_w -1880019875
    //   609: l2i
    //   610: ldc_w 255379820
    //   613: ixor
    //   614: ixor
    //   615: lookupswitch default -> 24606, 478405716 -> 640, 2043838977 -> 598
    //   640: getfield field_70137_T : D
    //   643: getstatic Perryc.c : I
    //   646: iflt -> 660
    //   649: ldc2_w -140047928
    //   652: l2i
    //   653: ldc_w -1015826739
    //   656: ixor
    //   657: goto -> 668
    //   660: ldc2_w -1294828204
    //   663: l2i
    //   664: ldc_w 41343567
    //   667: ixor
    //   668: ldc2_w 1471192685
    //   671: l2i
    //   672: ldc_w -24415922
    //   675: ixor
    //   676: ixor
    //   677: lookupswitch default -> 704, -1907388794 -> 660, -1645260762 -> 24746
    //   704: aload_1
    //   705: getstatic Perryc.0 : I
    //   708: ifle -> 722
    //   711: ldc2_w -494590853
    //   714: l2i
    //   715: ldc_w 1371529657
    //   718: ixor
    //   719: goto -> 730
    //   722: ldc2_w 1545666766
    //   725: l2i
    //   726: ldc_w -1499243779
    //   729: ixor
    //   730: ldc2_w -103541666
    //   733: l2i
    //   734: ldc_w -1744583458
    //   737: ixor
    //   738: ixor
    //   739: lookupswitch default -> 764, -836764002 -> 722, -756214462 -> 24926
    //   764: getfield field_70163_u : D
    //   767: getstatic Perryc.0 : I
    //   770: ifle -> 784
    //   773: ldc2_w 974513244
    //   776: l2i
    //   777: ldc_w 289004486
    //   780: ixor
    //   781: goto -> 792
    //   784: ldc2_w 1723368884
    //   787: l2i
    //   788: ldc_w -811912477
    //   791: ixor
    //   792: ldc2_w -2145678582
    //   795: l2i
    //   796: ldc_w -1834581027
    //   799: ixor
    //   800: ixor
    //   801: lookupswitch default -> 24896, -1147224192 -> 828, 965818189 -> 784
    //   828: aload_1
    //   829: getstatic Perryc.0 : I
    //   832: ifle -> 846
    //   835: ldc2_w -682341131
    //   838: l2i
    //   839: ldc_w 2117603315
    //   842: ixor
    //   843: goto -> 854
    //   846: ldc2_w 656422937
    //   849: l2i
    //   850: ldc_w 1838130489
    //   853: ixor
    //   854: ldc2_w -1404143669
    //   857: l2i
    //   858: ldc_w 10623602
    //   861: ixor
    //   862: ixor
    //   863: lookupswitch default -> 888, 92286655 -> 24490, 1886294527 -> 846
    //   888: getfield field_70137_T : D
    //   891: dsub
    //   892: getstatic Perryc.c : I
    //   895: iflt -> 909
    //   898: ldc2_w -2043130036
    //   901: l2i
    //   902: ldc_w 1022785293
    //   905: ixor
    //   906: goto -> 917
    //   909: ldc2_w -618763243
    //   912: l2i
    //   913: ldc_w -1177560811
    //   916: ixor
    //   917: ldc2_w 1998957677
    //   920: l2i
    //   921: ldc_w 1322498276
    //   924: ixor
    //   925: ixor
    //   926: lookupswitch default -> 952, -2093470520 -> 24788, 1717336636 -> 909
    //   952: fload_2
    //   953: f2d
    //   954: dmul
    //   955: dadd
    //   956: getstatic Perryc.c : I
    //   959: iflt -> 973
    //   962: ldc2_w -687797521
    //   965: l2i
    //   966: ldc_w 1115076424
    //   969: ixor
    //   970: goto -> 981
    //   973: ldc2_w 210811132
    //   976: l2i
    //   977: ldc_w -20665942
    //   980: ixor
    //   981: ldc2_w -724412550
    //   984: l2i
    //   985: ldc_w 926964451
    //   988: ixor
    //   989: ixor
    //   990: lookupswitch default -> 1016, -1887521631 -> 973, 1994764350 -> 24632
    //   1016: dstore #5
    //   1018: getstatic Perryc.1 : I
    //   1021: ifeq -> 1035
    //   1024: ldc2_w 1136454835
    //   1027: l2i
    //   1028: ldc_w 1170534603
    //   1031: ixor
    //   1032: goto -> 1043
    //   1035: ldc2_w -356945982
    //   1038: l2i
    //   1039: ldc_w 835428917
    //   1042: ixor
    //   1043: ldc2_w 1700944810
    //   1046: l2i
    //   1047: ldc_w -2071322425
    //   1050: ixor
    //   1051: ixor
    //   1052: lookupswitch default -> 1080, -409966827 -> 24930, 1386653471 -> 1035
    //   1080: aload_1
    //   1081: getstatic Perryc.1 : I
    //   1084: ifeq -> 1098
    //   1087: ldc2_w -74420993
    //   1090: l2i
    //   1091: ldc_w -1799167060
    //   1094: ixor
    //   1095: goto -> 1106
    //   1098: ldc2_w -1634590465
    //   1101: l2i
    //   1102: ldc_w -2007959408
    //   1105: ixor
    //   1106: ldc2_w 763731459
    //   1109: l2i
    //   1110: ldc_w 1514719261
    //   1113: ixor
    //   1114: ixor
    //   1115: lookupswitch default -> 24808, 413129037 -> 1098, 1628409457 -> 1140
    //   1140: getfield field_70136_U : D
    //   1143: getstatic Perryc.1 : I
    //   1146: ifeq -> 1160
    //   1149: ldc2_w -146633647
    //   1152: l2i
    //   1153: ldc_w -890937256
    //   1156: ixor
    //   1157: goto -> 1168
    //   1160: ldc2_w 329649566
    //   1163: l2i
    //   1164: ldc_w -1603778186
    //   1167: ixor
    //   1168: ldc2_w -847571722
    //   1171: l2i
    //   1172: ldc_w -881828762
    //   1175: ixor
    //   1176: ixor
    //   1177: lookupswitch default -> 1204, -2125213659 -> 1160, 1001170073 -> 24748
    //   1204: aload_1
    //   1205: getstatic Perryc.c : I
    //   1208: iflt -> 1222
    //   1211: ldc2_w 344493712
    //   1214: l2i
    //   1215: ldc_w 298551813
    //   1218: ixor
    //   1219: goto -> 1230
    //   1222: ldc2_w -1993758666
    //   1225: l2i
    //   1226: ldc_w 437640986
    //   1229: ixor
    //   1230: ldc2_w 431586116
    //   1233: l2i
    //   1234: ldc_w -1383626409
    //   1237: ixor
    //   1238: ixor
    //   1239: lookupswitch default -> 24666, -1317144954 -> 1222, 654476607 -> 1264
    //   1264: getfield field_70161_v : D
    //   1267: getstatic Perryc.1 : I
    //   1270: ifeq -> 1284
    //   1273: ldc2_w 2118592092
    //   1276: l2i
    //   1277: ldc_w -1763193042
    //   1280: ixor
    //   1281: goto -> 1292
    //   1284: ldc2_w 1224387305
    //   1287: l2i
    //   1288: ldc_w -279374052
    //   1291: ixor
    //   1292: ldc2_w 288740489
    //   1295: l2i
    //   1296: ldc_w -584780371
    //   1299: ixor
    //   1300: ixor
    //   1301: lookupswitch default -> 1328, -2004424740 -> 1284, 615630934 -> 24560
    //   1328: aload_1
    //   1329: getstatic Perryc.1 : I
    //   1332: ifeq -> 1346
    //   1335: ldc2_w 2016846551
    //   1338: l2i
    //   1339: ldc_w 1334591660
    //   1342: ixor
    //   1343: goto -> 1354
    //   1346: ldc2_w -1769453249
    //   1349: l2i
    //   1350: ldc_w -1700743480
    //   1353: ixor
    //   1354: ldc2_w -1079975434
    //   1357: l2i
    //   1358: ldc_w 1734473409
    //   1361: ixor
    //   1362: ixor
    //   1363: lookupswitch default -> 24550, -722868032 -> 1388, -277088948 -> 1346
    //   1388: getfield field_70136_U : D
    //   1391: dsub
    //   1392: getstatic Perryc.0 : I
    //   1395: ifle -> 1409
    //   1398: ldc2_w 250119862
    //   1401: l2i
    //   1402: ldc_w -43155572
    //   1405: ixor
    //   1406: goto -> 1417
    //   1409: ldc2_w -1213855479
    //   1412: l2i
    //   1413: ldc_w 1546615687
    //   1416: ixor
    //   1417: ldc2_w -584128535
    //   1420: l2i
    //   1421: ldc_w -980356544
    //   1424: ixor
    //   1425: ixor
    //   1426: lookupswitch default -> 24500, -348394349 -> 1409, -214472921 -> 1452
    //   1452: fload_2
    //   1453: f2d
    //   1454: dmul
    //   1455: dadd
    //   1456: getstatic Perryc.c : I
    //   1459: iflt -> 1473
    //   1462: ldc2_w -1184534123
    //   1465: l2i
    //   1466: ldc_w -88999695
    //   1469: ixor
    //   1470: goto -> 1481
    //   1473: ldc2_w -1809763399
    //   1476: l2i
    //   1477: ldc_w 1202618365
    //   1480: ixor
    //   1481: ldc2_w 1982059319
    //   1484: l2i
    //   1485: ldc_w -1696873390
    //   1488: ixor
    //   1489: ixor
    //   1490: lookupswitch default -> 24790, -1356030463 -> 1473, 1064786721 -> 1516
    //   1516: dstore #7
    //   1518: getstatic Perryc.c : I
    //   1521: iflt -> 1535
    //   1524: ldc2_w -739040723
    //   1527: l2i
    //   1528: ldc_w 1951484476
    //   1531: ixor
    //   1532: goto -> 1543
    //   1535: ldc2_w 1399081909
    //   1538: l2i
    //   1539: ldc_w -1702626864
    //   1542: ixor
    //   1543: ldc2_w 806606647
    //   1546: l2i
    //   1547: ldc_w 17984174
    //   1550: ixor
    //   1551: ixor
    //   1552: lookupswitch default -> 24552, -1767647864 -> 1535, -119140356 -> 1580
    //   1580: aload_1
    //   1581: getstatic Perryc.c : I
    //   1584: iflt -> 1598
    //   1587: ldc2_w 103109934
    //   1590: l2i
    //   1591: ldc_w 504388510
    //   1594: ixor
    //   1595: goto -> 1606
    //   1598: ldc2_w 857848840
    //   1601: l2i
    //   1602: ldc_w -1851227976
    //   1605: ixor
    //   1606: ldc2_w 783211980
    //   1609: l2i
    //   1610: ldc_w -1989733028
    //   1613: ixor
    //   1614: ixor
    //   1615: lookupswitch default -> 1640, -1073953248 -> 24714, -533729392 -> 1598
    //   1640: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   1643: getstatic Perryc.0 : I
    //   1646: ifle -> 1660
    //   1649: ldc2_w -342491136
    //   1652: l2i
    //   1653: ldc_w -2081144056
    //   1656: ixor
    //   1657: goto -> 1668
    //   1660: ldc2_w -771858595
    //   1663: l2i
    //   1664: ldc_w 1142568812
    //   1667: ixor
    //   1668: ldc2_w 1691782157
    //   1671: l2i
    //   1672: ldc_w -276662923
    //   1675: ixor
    //   1676: ixor
    //   1677: lookupswitch default -> 24516, -482952592 -> 1660, 514888009 -> 1704
    //   1704: goto -> 1708
    //   1707: athrow
    //   1708: invokevirtual func_184586_b : (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
    //   1711: goto -> 1715
    //   1714: athrow
    //   1715: pop
    //   1716: getstatic Perryc.c : I
    //   1719: iflt -> 1733
    //   1722: ldc2_w -322662957
    //   1725: l2i
    //   1726: ldc_w 1069538095
    //   1729: ixor
    //   1730: goto -> 1741
    //   1733: ldc2_w -447856244
    //   1736: l2i
    //   1737: ldc_w 970966432
    //   1740: ixor
    //   1741: ldc2_w -111771294
    //   1744: l2i
    //   1745: ldc_w -1164823220
    //   1748: ixor
    //   1749: ixor
    //   1750: lookupswitch default -> 24984, -1866472750 -> 1733, -1621807102 -> 1776
    //   1776: getstatic bigname/zprestige/webhack/features/modules/Render/Trajectories.mc : Lnet/minecraft/client/Minecraft;
    //   1779: getstatic Perryc.1 : I
    //   1782: ifeq -> 1796
    //   1785: ldc2_w 1157512235
    //   1788: l2i
    //   1789: ldc_w 1440526785
    //   1792: ixor
    //   1793: goto -> 1804
    //   1796: ldc2_w -423636879
    //   1799: l2i
    //   1800: ldc_w 1473400416
    //   1803: ixor
    //   1804: ldc2_w -1552741154
    //   1807: l2i
    //   1808: ldc_w -1549739967
    //   1811: ixor
    //   1812: ixor
    //   1813: lookupswitch default -> 1840, 301029749 -> 25014, 844190942 -> 1796
    //   1840: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   1843: getstatic Perryc.c : I
    //   1846: iflt -> 1860
    //   1849: ldc2_w -552053528
    //   1852: l2i
    //   1853: ldc_w -1467744186
    //   1856: ixor
    //   1857: goto -> 1868
    //   1860: ldc2_w -1827185265
    //   1863: l2i
    //   1864: ldc_w -96838360
    //   1867: ixor
    //   1868: ldc2_w 531123128
    //   1871: l2i
    //   1872: ldc_w 985017328
    //   1875: ixor
    //   1876: ixor
    //   1877: lookupswitch default -> 24940, 1278435567 -> 1904, 1384264934 -> 1860
    //   1904: getfield field_74320_O : I
    //   1907: ifne -> 1921
    //   1910: ldc2_w 1687014702
    //   1913: l2i
    //   1914: ldc_w 4743818
    //   1917: ixor
    //   1918: goto -> 1929
    //   1921: ldc2_w 1075780737
    //   1924: l2i
    //   1925: ldc_w 618312482
    //   1928: ixor
    //   1929: ldc2_w -683725671
    //   1932: l2i
    //   1933: ldc_w -1064673770
    //   1936: ixor
    //   1937: ixor
    //   1938: tableswitch default -> 1910, 1936776491 -> 1960, 1936776492 -> 3904
    //   1960: getstatic Perryc.1 : I
    //   1963: ifeq -> 1977
    //   1966: ldc2_w 944242169
    //   1969: l2i
    //   1970: ldc_w 2127101980
    //   1973: ixor
    //   1974: goto -> 1985
    //   1977: ldc2_w -1036659477
    //   1980: l2i
    //   1981: ldc_w -772911569
    //   1984: ixor
    //   1985: ldc2_w 1006716525
    //   1988: l2i
    //   1989: ldc_w 940252457
    //   1992: ixor
    //   1993: ixor
    //   1994: lookupswitch default -> 24730, 399622528 -> 2020, 1115989665 -> 1977
    //   2020: aload_1
    //   2021: getstatic Perryc.0 : I
    //   2024: ifle -> 2038
    //   2027: ldc2_w 168300236
    //   2030: l2i
    //   2031: ldc_w -116737510
    //   2034: ixor
    //   2035: goto -> 2046
    //   2038: ldc2_w 258981478
    //   2041: l2i
    //   2042: ldc_w 1380447899
    //   2045: ixor
    //   2046: ldc2_w 71240239
    //   2049: l2i
    //   2050: ldc_w -1237522697
    //   2053: ixor
    //   2054: ixor
    //   2055: lookupswitch default -> 2080, 1090607118 -> 24654, 1234595858 -> 2038
    //   2080: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   2083: getstatic Perryc.c : I
    //   2086: iflt -> 2100
    //   2089: ldc2_w 1155770913
    //   2092: l2i
    //   2093: ldc_w 135817245
    //   2096: ixor
    //   2097: goto -> 2108
    //   2100: ldc2_w 1758317597
    //   2103: l2i
    //   2104: ldc_w -152452046
    //   2107: ixor
    //   2108: ldc2_w 1509270850
    //   2111: l2i
    //   2112: ldc_w 58312498
    //   2115: ixor
    //   2116: ixor
    //   2117: lookupswitch default -> 24952, -995595681 -> 2144, 376938572 -> 2100
    //   2144: goto -> 2148
    //   2147: athrow
    //   2148: invokevirtual func_184586_b : (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
    //   2151: goto -> 2155
    //   2154: athrow
    //   2155: getstatic Perryc.0 : I
    //   2158: ifle -> 2172
    //   2161: ldc2_w 156605776
    //   2164: l2i
    //   2165: ldc_w 493556359
    //   2168: ixor
    //   2169: goto -> 2180
    //   2172: ldc2_w -532957030
    //   2175: l2i
    //   2176: ldc_w -1761532680
    //   2179: ixor
    //   2180: ldc2_w -309475998
    //   2183: l2i
    //   2184: ldc_w -645213206
    //   2187: ixor
    //   2188: ixor
    //   2189: lookupswitch default -> 24842, 540645727 -> 2172, 1128106730 -> 2216
    //   2216: goto -> 2220
    //   2219: athrow
    //   2220: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   2223: goto -> 2227
    //   2226: athrow
    //   2227: instanceof net/minecraft/item/ItemBow
    //   2230: ifne -> 2244
    //   2233: ldc2_w -1212444035
    //   2236: l2i
    //   2237: ldc_w -1194333372
    //   2240: ixor
    //   2241: goto -> 2252
    //   2244: ldc2_w -35788658
    //   2247: l2i
    //   2248: ldc_w -223768140
    //   2251: ixor
    //   2252: ldc2_w -267003771
    //   2255: l2i
    //   2256: ldc_w 1390788769
    //   2259: ixor
    //   2260: ixor
    //   2261: tableswitch default -> 2233, -1383833315 -> 2284, -1383833314 -> 3905
    //   2284: getstatic Perryc.1 : I
    //   2287: ifeq -> 2301
    //   2290: ldc2_w -1994856802
    //   2293: l2i
    //   2294: ldc_w -21441091
    //   2297: ixor
    //   2298: goto -> 2309
    //   2301: ldc2_w -1504566928
    //   2304: l2i
    //   2305: ldc_w 79892545
    //   2308: ixor
    //   2309: ldc2_w 1330342269
    //   2312: l2i
    //   2313: ldc_w -2079580582
    //   2316: ixor
    //   2317: ixor
    //   2318: lookupswitch default -> 2344, -1125694460 -> 24964, 868023902 -> 2301
    //   2344: aload_1
    //   2345: getstatic Perryc.0 : I
    //   2348: ifle -> 2362
    //   2351: ldc2_w -1141498861
    //   2354: l2i
    //   2355: ldc_w -765755415
    //   2358: ixor
    //   2359: goto -> 2370
    //   2362: ldc2_w -914012051
    //   2365: l2i
    //   2366: ldc_w 1242716092
    //   2369: ixor
    //   2370: ldc2_w 679634247
    //   2373: l2i
    //   2374: ldc_w 2043060593
    //   2377: ixor
    //   2378: ixor
    //   2379: lookupswitch default -> 2404, -367214524 -> 2362, 954836940 -> 24950
    //   2404: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   2407: getstatic Perryc.c : I
    //   2410: iflt -> 2424
    //   2413: ldc2_w 1704395829
    //   2416: l2i
    //   2417: ldc_w -312418910
    //   2420: ixor
    //   2421: goto -> 2432
    //   2424: ldc2_w 77626484
    //   2427: l2i
    //   2428: ldc_w 1839421272
    //   2431: ixor
    //   2432: ldc2_w 888923868
    //   2435: l2i
    //   2436: ldc_w -2131006775
    //   2439: ixor
    //   2440: ixor
    //   2441: lookupswitch default -> 2468, -1801798477 -> 2424, 1022842242 -> 25092
    //   2468: goto -> 2472
    //   2471: athrow
    //   2472: invokevirtual func_184586_b : (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
    //   2475: goto -> 2479
    //   2478: athrow
    //   2479: getstatic Perryc.0 : I
    //   2482: ifle -> 2496
    //   2485: ldc2_w -857221582
    //   2488: l2i
    //   2489: ldc_w 1853801121
    //   2492: ixor
    //   2493: goto -> 2504
    //   2496: ldc2_w -839681316
    //   2499: l2i
    //   2500: ldc_w 248730867
    //   2503: ixor
    //   2504: ldc2_w -2071459199
    //   2507: l2i
    //   2508: ldc_w -1399571152
    //   2511: ixor
    //   2512: ixor
    //   2513: lookupswitch default -> 25034, -1970986206 -> 2496, -348382818 -> 2540
    //   2540: goto -> 2544
    //   2543: athrow
    //   2544: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   2547: goto -> 2551
    //   2550: athrow
    //   2551: instanceof net/minecraft/item/ItemFishingRod
    //   2554: ifne -> 2568
    //   2557: ldc2_w -1193456015
    //   2560: l2i
    //   2561: ldc_w -99777255
    //   2564: ixor
    //   2565: goto -> 2576
    //   2568: ldc2_w -344071028
    //   2571: l2i
    //   2572: ldc_w -1448267803
    //   2575: ixor
    //   2576: ldc2_w -1587233720
    //   2579: l2i
    //   2580: ldc_w -923909492
    //   2583: ixor
    //   2584: ixor
    //   2585: tableswitch default -> 2557, 727332268 -> 2608, 727332269 -> 3905
    //   2608: getstatic Perryc.c : I
    //   2611: iflt -> 2625
    //   2614: ldc2_w 439427574
    //   2617: l2i
    //   2618: ldc_w 30598370
    //   2621: ixor
    //   2622: goto -> 2633
    //   2625: ldc2_w 862429134
    //   2628: l2i
    //   2629: ldc_w -905617790
    //   2632: ixor
    //   2633: ldc2_w 537270997
    //   2636: l2i
    //   2637: ldc_w -1334581114
    //   2640: ixor
    //   2641: ixor
    //   2642: lookupswitch default -> 2668, -1953089721 -> 24822, 573861191 -> 2625
    //   2668: aload_1
    //   2669: getstatic Perryc.c : I
    //   2672: iflt -> 2686
    //   2675: ldc2_w 707216454
    //   2678: l2i
    //   2679: ldc_w 549165013
    //   2682: ixor
    //   2683: goto -> 2694
    //   2686: ldc2_w 935092108
    //   2689: l2i
    //   2690: ldc_w 602277891
    //   2693: ixor
    //   2694: ldc2_w -120962298
    //   2697: l2i
    //   2698: ldc_w 403331392
    //   2701: ixor
    //   2702: ixor
    //   2703: lookupswitch default -> 2728, -1783788433 -> 2686, -363017771 -> 24646
    //   2728: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   2731: getstatic Perryc.0 : I
    //   2734: ifle -> 2748
    //   2737: ldc2_w 404956674
    //   2740: l2i
    //   2741: ldc_w -1693303644
    //   2744: ixor
    //   2745: goto -> 2756
    //   2748: ldc2_w -1255740050
    //   2751: l2i
    //   2752: ldc_w -1614614777
    //   2755: ixor
    //   2756: ldc2_w 1233598000
    //   2759: l2i
    //   2760: ldc_w 1611465722
    //   2763: ixor
    //   2764: ixor
    //   2765: lookupswitch default -> 2792, -1430573204 -> 24796, -346384674 -> 2748
    //   2792: goto -> 2796
    //   2795: athrow
    //   2796: invokevirtual func_184586_b : (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
    //   2799: goto -> 2803
    //   2802: athrow
    //   2803: getstatic Perryc.c : I
    //   2806: iflt -> 2820
    //   2809: ldc2_w 278133363
    //   2812: l2i
    //   2813: ldc_w -1521087374
    //   2816: ixor
    //   2817: goto -> 2828
    //   2820: ldc2_w -1256624927
    //   2823: l2i
    //   2824: ldc_w -102683631
    //   2827: ixor
    //   2828: ldc2_w 1153102750
    //   2831: l2i
    //   2832: ldc_w 1481472861
    //   2835: ixor
    //   2836: ixor
    //   2837: lookupswitch default -> 24660, -1456308542 -> 2820, 1343211571 -> 2864
    //   2864: goto -> 2868
    //   2867: athrow
    //   2868: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   2871: goto -> 2875
    //   2874: athrow
    //   2875: instanceof net/minecraft/item/ItemEnderPearl
    //   2878: ifne -> 2892
    //   2881: ldc2_w -1649385201
    //   2884: l2i
    //   2885: ldc_w 1733213319
    //   2888: ixor
    //   2889: goto -> 2900
    //   2892: ldc2_w -925888854
    //   2895: l2i
    //   2896: ldc_w 841929507
    //   2899: ixor
    //   2900: ldc2_w -1960500615
    //   2903: l2i
    //   2904: ldc_w 382574331
    //   2907: ixor
    //   2908: ixor
    //   2909: tableswitch default -> 2881, 1729519882 -> 2932, 1729519883 -> 3905
    //   2932: getstatic Perryc.1 : I
    //   2935: ifeq -> 2949
    //   2938: ldc2_w -1184433917
    //   2941: l2i
    //   2942: ldc_w 29297703
    //   2945: ixor
    //   2946: goto -> 2957
    //   2949: ldc2_w -779953963
    //   2952: l2i
    //   2953: ldc_w 1427809543
    //   2956: ixor
    //   2957: ldc2_w 1585021950
    //   2960: l2i
    //   2961: ldc_w -263847036
    //   2964: ixor
    //   2965: ixor
    //   2966: lookupswitch default -> 24486, 384202078 -> 2949, 715652520 -> 2992
    //   2992: aload_1
    //   2993: getstatic Perryc.c : I
    //   2996: iflt -> 3010
    //   2999: ldc2_w 468087995
    //   3002: l2i
    //   3003: ldc_w -789830605
    //   3006: ixor
    //   3007: goto -> 3018
    //   3010: ldc2_w -1208280667
    //   3013: l2i
    //   3014: ldc_w 1696359964
    //   3017: ixor
    //   3018: ldc2_w -821151112
    //   3021: l2i
    //   3022: ldc_w -252474489
    //   3025: ixor
    //   3026: ixor
    //   3027: lookupswitch default -> 24932, -317010362 -> 3052, -185081481 -> 3010
    //   3052: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   3055: getstatic Perryc.1 : I
    //   3058: ifeq -> 3072
    //   3061: ldc2_w 581624254
    //   3064: l2i
    //   3065: ldc_w 1343464428
    //   3068: ixor
    //   3069: goto -> 3080
    //   3072: ldc2_w 1640673565
    //   3075: l2i
    //   3076: ldc_w -1716640998
    //   3079: ixor
    //   3080: ldc2_w -1351726723
    //   3083: l2i
    //   3084: ldc_w -106328266
    //   3087: ixor
    //   3088: ixor
    //   3089: lookupswitch default -> 24880, -1365027764 -> 3116, 612271129 -> 3072
    //   3116: goto -> 3120
    //   3119: athrow
    //   3120: invokevirtual func_184586_b : (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
    //   3123: goto -> 3127
    //   3126: athrow
    //   3127: getstatic Perryc.c : I
    //   3130: iflt -> 3144
    //   3133: ldc2_w -1032920068
    //   3136: l2i
    //   3137: ldc_w 421543802
    //   3140: ixor
    //   3141: goto -> 3152
    //   3144: ldc2_w 2057913075
    //   3147: l2i
    //   3148: ldc_w -642233020
    //   3151: ixor
    //   3152: ldc2_w -907475107
    //   3155: l2i
    //   3156: ldc_w -1904481815
    //   3159: ixor
    //   3160: ixor
    //   3161: lookupswitch default -> 3188, -1663290830 -> 24664, 1083993596 -> 3144
    //   3188: goto -> 3192
    //   3191: athrow
    //   3192: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   3195: goto -> 3199
    //   3198: athrow
    //   3199: instanceof net/minecraft/item/ItemEgg
    //   3202: ifne -> 3216
    //   3205: ldc2_w 1968103895
    //   3208: l2i
    //   3209: ldc_w 35603383
    //   3212: ixor
    //   3213: goto -> 3224
    //   3216: ldc2_w -287927059
    //   3219: l2i
    //   3220: ldc_w -1719191924
    //   3223: ixor
    //   3224: ldc2_w -1977099387
    //   3227: l2i
    //   3228: ldc_w 149895197
    //   3231: ixor
    //   3232: ixor
    //   3233: tableswitch default -> 3205, -174505480 -> 3256, -174505479 -> 3905
    //   3256: getstatic Perryc.1 : I
    //   3259: ifeq -> 3273
    //   3262: ldc2_w 2116423090
    //   3265: l2i
    //   3266: ldc_w -2082397991
    //   3269: ixor
    //   3270: goto -> 3281
    //   3273: ldc2_w -1688414765
    //   3276: l2i
    //   3277: ldc_w -1487165723
    //   3280: ixor
    //   3281: ldc2_w -1737012229
    //   3284: l2i
    //   3285: ldc_w 1126046168
    //   3288: ixor
    //   3289: ixor
    //   3290: lookupswitch default -> 24768, -412212971 -> 3316, 648970056 -> 3273
    //   3316: aload_1
    //   3317: getstatic Perryc.0 : I
    //   3320: ifle -> 3334
    //   3323: ldc2_w -222565759
    //   3326: l2i
    //   3327: ldc_w 2086605960
    //   3330: ixor
    //   3331: goto -> 3342
    //   3334: ldc2_w -90193068
    //   3337: l2i
    //   3338: ldc_w 34475262
    //   3341: ixor
    //   3342: ldc2_w -1487327821
    //   3345: l2i
    //   3346: ldc_w 1364220161
    //   3349: ixor
    //   3350: ixor
    //   3351: lookupswitch default -> 24948, 244890392 -> 3376, 2028833467 -> 3334
    //   3376: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   3379: getstatic Perryc.0 : I
    //   3382: ifle -> 3396
    //   3385: ldc2_w 772348555
    //   3388: l2i
    //   3389: ldc_w 1191765618
    //   3392: ixor
    //   3393: goto -> 3404
    //   3396: ldc2_w 1527747480
    //   3399: l2i
    //   3400: ldc_w -2075443051
    //   3403: ixor
    //   3404: ldc2_w -1880472808
    //   3407: l2i
    //   3408: ldc_w -1857193141
    //   3411: ixor
    //   3412: ixor
    //   3413: lookupswitch default -> 3440, -130940640 -> 3396, 2007418026 -> 24474
    //   3440: goto -> 3444
    //   3443: athrow
    //   3444: invokevirtual func_184586_b : (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
    //   3447: goto -> 3451
    //   3450: athrow
    //   3451: getstatic Perryc.1 : I
    //   3454: ifeq -> 3468
    //   3457: ldc2_w 420329800
    //   3460: l2i
    //   3461: ldc_w -1269090161
    //   3464: ixor
    //   3465: goto -> 3476
    //   3468: ldc2_w -568656483
    //   3471: l2i
    //   3472: ldc_w -295395187
    //   3475: ixor
    //   3476: ldc2_w 829806273
    //   3479: l2i
    //   3480: ldc_w -1661423508
    //   3483: ixor
    //   3484: ixor
    //   3485: lookupswitch default -> 3512, 14411626 -> 25074, 2122205741 -> 3468
    //   3512: goto -> 3516
    //   3515: athrow
    //   3516: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   3519: goto -> 3523
    //   3522: athrow
    //   3523: instanceof net/minecraft/item/ItemSnowball
    //   3526: ifne -> 3540
    //   3529: ldc2_w -813836363
    //   3532: l2i
    //   3533: ldc_w 910574119
    //   3536: ixor
    //   3537: goto -> 3548
    //   3540: ldc2_w 1802407902
    //   3543: l2i
    //   3544: ldc_w -1839916465
    //   3547: ixor
    //   3548: ldc2_w -222701783
    //   3551: l2i
    //   3552: ldc_w -597268790
    //   3555: ixor
    //   3556: ixor
    //   3557: tableswitch default -> 3529, -672914319 -> 3580, -672914318 -> 3905
    //   3580: getstatic Perryc.0 : I
    //   3583: ifle -> 3597
    //   3586: ldc2_w -1393165701
    //   3589: l2i
    //   3590: ldc_w 450457498
    //   3593: ixor
    //   3594: goto -> 3605
    //   3597: ldc2_w -2016802176
    //   3600: l2i
    //   3601: ldc_w 1559484125
    //   3604: ixor
    //   3605: ldc2_w 1354277363
    //   3608: l2i
    //   3609: ldc_w -1184878472
    //   3612: ixor
    //   3613: ixor
    //   3614: lookupswitch default -> 3640, 1163766834 -> 3597, 1609827434 -> 25004
    //   3640: aload_1
    //   3641: getstatic Perryc.c : I
    //   3644: iflt -> 3658
    //   3647: ldc2_w 267436156
    //   3650: l2i
    //   3651: ldc_w -1715500716
    //   3654: ixor
    //   3655: goto -> 3666
    //   3658: ldc2_w 350951010
    //   3661: l2i
    //   3662: ldc_w -205438884
    //   3665: ixor
    //   3666: ldc2_w 686341387
    //   3669: l2i
    //   3670: ldc_w 164424915
    //   3673: ixor
    //   3674: ixor
    //   3675: lookupswitch default -> 3700, -1217718032 -> 24824, 1334105230 -> 3658
    //   3700: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   3703: getstatic Perryc.1 : I
    //   3706: ifeq -> 3720
    //   3709: ldc2_w 1862022453
    //   3712: l2i
    //   3713: ldc_w 314002570
    //   3716: ixor
    //   3717: goto -> 3728
    //   3720: ldc2_w -37340913
    //   3723: l2i
    //   3724: ldc_w 535235863
    //   3727: ixor
    //   3728: ldc2_w -2061982874
    //   3731: l2i
    //   3732: ldc_w -2006173011
    //   3735: ixor
    //   3736: ixor
    //   3737: lookupswitch default -> 3764, -1722265974 -> 3720, 1900011636 -> 25084
    //   3764: goto -> 3768
    //   3767: athrow
    //   3768: invokevirtual func_184586_b : (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
    //   3771: goto -> 3775
    //   3774: athrow
    //   3775: getstatic Perryc.c : I
    //   3778: iflt -> 3792
    //   3781: ldc2_w 237510657
    //   3784: l2i
    //   3785: ldc_w 1668646776
    //   3788: ixor
    //   3789: goto -> 3800
    //   3792: ldc2_w -1719220295
    //   3795: l2i
    //   3796: ldc_w -2043353884
    //   3799: ixor
    //   3800: ldc2_w -1208093407
    //   3803: l2i
    //   3804: ldc_w 1068072770
    //   3807: ixor
    //   3808: ixor
    //   3809: lookupswitch default -> 3836, -452383462 -> 24476, 718544659 -> 3792
    //   3836: goto -> 3840
    //   3839: athrow
    //   3840: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   3843: goto -> 3847
    //   3846: athrow
    //   3847: instanceof net/minecraft/item/ItemExpBottle
    //   3850: ifne -> 3864
    //   3853: ldc2_w -1120895949
    //   3856: l2i
    //   3857: ldc_w -1953790970
    //   3860: ixor
    //   3861: goto -> 3872
    //   3864: ldc2_w 1894554807
    //   3867: l2i
    //   3868: ldc_w 1180132481
    //   3871: ixor
    //   3872: ldc2_w 1710828684
    //   3875: l2i
    //   3876: ldc_w -1678667112
    //   3879: ixor
    //   3880: ixor
    //   3881: tableswitch default -> 3853, -927775199 -> 3904, -927775198 -> 3905
    //   3904: return
    //   3905: getstatic Perryc.1 : I
    //   3908: ifeq -> 3922
    //   3911: ldc2_w 1750792785
    //   3914: l2i
    //   3915: ldc_w 683718937
    //   3918: ixor
    //   3919: goto -> 3930
    //   3922: ldc2_w -1118941238
    //   3925: l2i
    //   3926: ldc_w 1258843530
    //   3929: ixor
    //   3930: ldc2_w 1685256140
    //   3933: l2i
    //   3934: ldc_w 1797705313
    //   3937: ixor
    //   3938: ixor
    //   3939: lookupswitch default -> 24834, -116253715 -> 3964, 1338931941 -> 3922
    //   3964: goto -> 3968
    //   3967: athrow
    //   3968: invokestatic glPushMatrix : ()V
    //   3971: goto -> 3975
    //   3974: athrow
    //   3975: getstatic Perryc.1 : I
    //   3978: ifeq -> 3992
    //   3981: ldc2_w -1564452677
    //   3984: l2i
    //   3985: ldc_w 565250803
    //   3988: ixor
    //   3989: goto -> 4000
    //   3992: ldc2_w -992824637
    //   3995: l2i
    //   3996: ldc_w -754932946
    //   3999: ixor
    //   4000: ldc2_w -223246206
    //   4003: l2i
    //   4004: ldc_w 643248384
    //   4007: ixor
    //   4008: ixor
    //   4009: lookupswitch default -> 4036, -1958896547 -> 3992, 1469574090 -> 24690
    //   4036: aload_1
    //   4037: getstatic Perryc.1 : I
    //   4040: ifeq -> 4054
    //   4043: ldc2_w 1668574120
    //   4046: l2i
    //   4047: ldc_w 697348953
    //   4050: ixor
    //   4051: goto -> 4062
    //   4054: ldc2_w -314142458
    //   4057: l2i
    //   4058: ldc_w -793376060
    //   4061: ixor
    //   4062: ldc2_w 1500032656
    //   4065: l2i
    //   4066: ldc_w 488103742
    //   4069: ixor
    //   4070: ixor
    //   4071: lookupswitch default -> 4096, -842545050 -> 4054, 245082463 -> 24678
    //   4096: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   4099: getstatic Perryc.c : I
    //   4102: iflt -> 4116
    //   4105: ldc2_w 913540032
    //   4108: l2i
    //   4109: ldc_w 1249226207
    //   4112: ixor
    //   4113: goto -> 4124
    //   4116: ldc2_w -2096197064
    //   4119: l2i
    //   4120: ldc_w -1130263506
    //   4123: ixor
    //   4124: ldc2_w -2018167062
    //   4127: l2i
    //   4128: ldc_w 68783418
    //   4131: ixor
    //   4132: ixor
    //   4133: lookupswitch default -> 24936, -1140611642 -> 4160, -5597745 -> 4116
    //   4160: goto -> 4164
    //   4163: athrow
    //   4164: invokevirtual func_184586_b : (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
    //   4167: goto -> 4171
    //   4170: athrow
    //   4171: getstatic Perryc.1 : I
    //   4174: ifeq -> 4188
    //   4177: ldc2_w -330265793
    //   4180: l2i
    //   4181: ldc_w 2028615697
    //   4184: ixor
    //   4185: goto -> 4196
    //   4188: ldc2_w 370200079
    //   4191: l2i
    //   4192: ldc_w 1206040707
    //   4195: ixor
    //   4196: ldc2_w -886467268
    //   4199: l2i
    //   4200: ldc_w 735298724
    //   4203: ixor
    //   4204: ixor
    //   4205: lookupswitch default -> 4232, -1254517426 -> 4188, 1950409398 -> 25042
    //   4232: goto -> 4236
    //   4235: athrow
    //   4236: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   4239: goto -> 4243
    //   4242: athrow
    //   4243: getstatic Perryc.1 : I
    //   4246: ifeq -> 4260
    //   4249: ldc2_w -1199647599
    //   4252: l2i
    //   4253: ldc_w -16969176
    //   4256: ixor
    //   4257: goto -> 4268
    //   4260: ldc2_w 580939967
    //   4263: l2i
    //   4264: ldc_w 2075399690
    //   4267: ixor
    //   4268: ldc2_w -818142809
    //   4271: l2i
    //   4272: ldc_w -131601585
    //   4275: ixor
    //   4276: ixor
    //   4277: lookupswitch default -> 4304, 311792805 -> 4260, 1905790033 -> 24502
    //   4304: astore #9
    //   4306: getstatic Perryc.c : I
    //   4309: iflt -> 4323
    //   4312: ldc2_w -1272302533
    //   4315: l2i
    //   4316: ldc_w 1362876157
    //   4319: ixor
    //   4320: goto -> 4331
    //   4323: ldc2_w -661892544
    //   4326: l2i
    //   4327: ldc_w 891207951
    //   4330: ixor
    //   4331: ldc2_w 628270307
    //   4334: l2i
    //   4335: ldc_w 317837551
    //   4338: ixor
    //   4339: ixor
    //   4340: lookupswitch default -> 24838, -762145078 -> 4323, -636360893 -> 4368
    //   4368: dload_3
    //   4369: getstatic Perryc.0 : I
    //   4372: ifle -> 4386
    //   4375: ldc2_w 1030066614
    //   4378: l2i
    //   4379: ldc_w 20405553
    //   4382: ixor
    //   4383: goto -> 4394
    //   4386: ldc2_w 1925683773
    //   4389: l2i
    //   4390: ldc_w -1548821372
    //   4393: ixor
    //   4394: ldc2_w 362323455
    //   4397: l2i
    //   4398: ldc_w 1916771096
    //   4401: ixor
    //   4402: ixor
    //   4403: lookupswitch default -> 4428, 1287594326 -> 4386, 1542834784 -> 24596
    //   4428: aload_1
    //   4429: getstatic Perryc.1 : I
    //   4432: ifeq -> 4446
    //   4435: ldc2_w -1089381914
    //   4438: l2i
    //   4439: ldc_w -961096873
    //   4442: ixor
    //   4443: goto -> 4454
    //   4446: ldc2_w 34210669
    //   4449: l2i
    //   4450: ldc_w -139680626
    //   4453: ixor
    //   4454: ldc2_w -2043385542
    //   4457: l2i
    //   4458: ldc_w 537955100
    //   4461: ixor
    //   4462: ixor
    //   4463: lookupswitch default -> 4488, -545036137 -> 24986, 1956398860 -> 4446
    //   4488: getfield field_70177_z : F
    //   4491: ldc_w 0.07524956
    //   4494: invokestatic floatToIntBits : (F)I
    //   4497: ldc_w 2125339761
    //   4500: ixor
    //   4501: invokestatic intBitsToFloat : (I)F
    //   4504: fdiv
    //   4505: ldc_w 0.82696444
    //   4508: invokestatic floatToIntBits : (F)I
    //   4511: ldc_w 2132458538
    //   4514: ixor
    //   4515: invokestatic intBitsToFloat : (I)F
    //   4518: fmul
    //   4519: getstatic Perryc.0 : I
    //   4522: ifle -> 4536
    //   4525: ldc2_w 1549721422
    //   4528: l2i
    //   4529: ldc_w 1067256745
    //   4532: ixor
    //   4533: goto -> 4544
    //   4536: ldc2_w 989113229
    //   4539: l2i
    //   4540: ldc_w 45098321
    //   4543: ixor
    //   4544: ldc2_w -1440709830
    //   4547: l2i
    //   4548: ldc_w 1197915081
    //   4551: ixor
    //   4552: ixor
    //   4553: lookupswitch default -> 24466, -1903825900 -> 4536, -721242577 -> 4580
    //   4580: goto -> 4584
    //   4583: athrow
    //   4584: invokestatic func_76134_b : (F)F
    //   4587: goto -> 4591
    //   4590: athrow
    //   4591: ldc_w 5.222298
    //   4594: invokestatic floatToIntBits : (F)I
    //   4597: ldc_w 2122631707
    //   4600: ixor
    //   4601: invokestatic intBitsToFloat : (I)F
    //   4604: fmul
    //   4605: f2d
    //   4606: dsub
    //   4607: getstatic Perryc.0 : I
    //   4610: ifle -> 4624
    //   4613: ldc2_w 1185031519
    //   4616: l2i
    //   4617: ldc_w -915931311
    //   4620: ixor
    //   4621: goto -> 4632
    //   4624: ldc2_w -1886907057
    //   4627: l2i
    //   4628: ldc_w 134640522
    //   4631: ixor
    //   4632: ldc2_w -413903224
    //   4635: l2i
    //   4636: ldc_w 157974195
    //   4639: ixor
    //   4640: ixor
    //   4641: lookupswitch default -> 24860, 1643901493 -> 4624, 1773162238 -> 4668
    //   4668: dstore #10
    //   4670: getstatic Perryc.1 : I
    //   4673: ifeq -> 4687
    //   4676: ldc2_w 624452909
    //   4679: l2i
    //   4680: ldc_w 2007205221
    //   4683: ixor
    //   4684: goto -> 4695
    //   4687: ldc2_w 868072032
    //   4690: l2i
    //   4691: ldc_w -2042033545
    //   4694: ixor
    //   4695: ldc2_w 460064658
    //   4698: l2i
    //   4699: ldc_w -355576091
    //   4702: ixor
    //   4703: ixor
    //   4704: lookupswitch default -> 4732, -1556500161 -> 24628, -1328088690 -> 4687
    //   4732: dload #5
    //   4734: getstatic Perryc.1 : I
    //   4737: ifeq -> 4751
    //   4740: ldc2_w -1911765167
    //   4743: l2i
    //   4744: ldc_w 234559437
    //   4747: ixor
    //   4748: goto -> 4759
    //   4751: ldc2_w 1151797736
    //   4754: l2i
    //   4755: ldc_w 226511032
    //   4758: ixor
    //   4759: ldc2_w 236301816
    //   4762: l2i
    //   4763: ldc_w 1050926178
    //   4766: ixor
    //   4767: ixor
    //   4768: lookupswitch default -> 24578, -1287544570 -> 4751, 2039558346 -> 4796
    //   4796: aload_1
    //   4797: getstatic Perryc.c : I
    //   4800: iflt -> 4814
    //   4803: ldc2_w 1410883020
    //   4806: l2i
    //   4807: ldc_w -795641920
    //   4810: ixor
    //   4811: goto -> 4822
    //   4814: ldc2_w 1195350420
    //   4817: l2i
    //   4818: ldc_w 82898936
    //   4821: ixor
    //   4822: ldc2_w 12686297
    //   4825: l2i
    //   4826: ldc_w -1400909802
    //   4829: ixor
    //   4830: ixor
    //   4831: lookupswitch default -> 24992, -277793373 -> 4856, 674589123 -> 4814
    //   4856: goto -> 4860
    //   4859: athrow
    //   4860: invokevirtual func_70047_e : ()F
    //   4863: goto -> 4867
    //   4866: athrow
    //   4867: f2d
    //   4868: dadd
    //   4869: ldc2_w 122.68494976377677
    //   4872: invokestatic doubleToLongBits : (D)J
    //   4875: ldc2_w 9216390480147204928
    //   4878: lxor
    //   4879: invokestatic longBitsToDouble : (J)D
    //   4882: dsub
    //   4883: getstatic Perryc.0 : I
    //   4886: ifle -> 4900
    //   4889: ldc2_w 1110867724
    //   4892: l2i
    //   4893: ldc_w -636982826
    //   4896: ixor
    //   4897: goto -> 4908
    //   4900: ldc2_w 1253267821
    //   4903: l2i
    //   4904: ldc_w 934813893
    //   4907: ixor
    //   4908: ldc2_w -2040960906
    //   4911: l2i
    //   4912: ldc_w -1774788519
    //   4915: ixor
    //   4916: ixor
    //   4917: lookupswitch default -> 4944, -2007916811 -> 24688, 709551171 -> 4900
    //   4944: dstore #12
    //   4946: getstatic Perryc.0 : I
    //   4949: ifle -> 4963
    //   4952: ldc2_w 1579129716
    //   4955: l2i
    //   4956: ldc_w -1593495984
    //   4959: ixor
    //   4960: goto -> 4971
    //   4963: ldc2_w -1338159782
    //   4966: l2i
    //   4967: ldc_w -1369531843
    //   4970: ixor
    //   4971: ldc2_w 753943013
    //   4974: l2i
    //   4975: ldc_w -1951459470
    //   4978: ixor
    //   4979: ixor
    //   4980: lookupswitch default -> 24844, -1187216912 -> 5008, 1480975283 -> 4963
    //   5008: dload #7
    //   5010: getstatic Perryc.c : I
    //   5013: iflt -> 5027
    //   5016: ldc2_w -1500183758
    //   5019: l2i
    //   5020: ldc_w -990963434
    //   5023: ixor
    //   5024: goto -> 5035
    //   5027: ldc2_w -2005740858
    //   5030: l2i
    //   5031: ldc_w -1418767518
    //   5034: ixor
    //   5035: ldc2_w -1034194997
    //   5038: l2i
    //   5039: ldc_w 1421760209
    //   5042: ixor
    //   5043: ixor
    //   5044: lookupswitch default -> 5072, -925044112 -> 5027, -190897346 -> 24994
    //   5072: aload_1
    //   5073: getstatic Perryc.1 : I
    //   5076: ifeq -> 5090
    //   5079: ldc2_w -1030571277
    //   5082: l2i
    //   5083: ldc_w -2101712914
    //   5086: ixor
    //   5087: goto -> 5098
    //   5090: ldc2_w 475382394
    //   5093: l2i
    //   5094: ldc_w 1248917733
    //   5097: ixor
    //   5098: ldc2_w 1930763060
    //   5101: l2i
    //   5102: ldc_w 1093811509
    //   5105: ixor
    //   5106: ixor
    //   5107: lookupswitch default -> 5132, -1693437414 -> 5090, 1913649948 -> 24524
    //   5132: getfield field_70177_z : F
    //   5135: ldc_w 0.009451686
    //   5138: invokestatic floatToIntBits : (F)I
    //   5141: ldc_w 2133777215
    //   5144: ixor
    //   5145: invokestatic intBitsToFloat : (I)F
    //   5148: fdiv
    //   5149: ldc_w 0.85115993
    //   5152: invokestatic floatToIntBits : (F)I
    //   5155: ldc_w 2131814981
    //   5158: ixor
    //   5159: invokestatic intBitsToFloat : (I)F
    //   5162: fmul
    //   5163: getstatic Perryc.c : I
    //   5166: iflt -> 5180
    //   5169: ldc2_w -152008926
    //   5172: l2i
    //   5173: ldc_w -419254202
    //   5176: ixor
    //   5177: goto -> 5188
    //   5180: ldc2_w -1014150381
    //   5183: l2i
    //   5184: ldc_w 1106441935
    //   5187: ixor
    //   5188: ldc2_w -542962875
    //   5191: l2i
    //   5192: ldc_w -62169675
    //   5195: ixor
    //   5196: ixor
    //   5197: lookupswitch default -> 5224, 840589716 -> 24568, 1229286634 -> 5180
    //   5224: goto -> 5228
    //   5227: athrow
    //   5228: invokestatic func_76126_a : (F)F
    //   5231: goto -> 5235
    //   5234: athrow
    //   5235: ldc_w 9.813422
    //   5238: invokestatic floatToIntBits : (F)I
    //   5241: ldc_w 2134824141
    //   5244: ixor
    //   5245: invokestatic intBitsToFloat : (I)F
    //   5248: fmul
    //   5249: f2d
    //   5250: dsub
    //   5251: getstatic Perryc.c : I
    //   5254: iflt -> 5268
    //   5257: ldc2_w -536105910
    //   5260: l2i
    //   5261: ldc_w 1945428393
    //   5264: ixor
    //   5265: goto -> 5276
    //   5268: ldc2_w -439130306
    //   5271: l2i
    //   5272: ldc_w -1103093838
    //   5275: ixor
    //   5276: ldc2_w -761778436
    //   5279: l2i
    //   5280: ldc_w 2021704543
    //   5283: ixor
    //   5284: ixor
    //   5285: lookupswitch default -> 24608, -242510545 -> 5312, 971481152 -> 5268
    //   5312: dstore #14
    //   5314: getstatic Perryc.c : I
    //   5317: iflt -> 5331
    //   5320: ldc2_w -810064389
    //   5323: l2i
    //   5324: ldc_w 928744750
    //   5327: ixor
    //   5328: goto -> 5339
    //   5331: ldc2_w -267458480
    //   5334: l2i
    //   5335: ldc_w 854726685
    //   5338: ixor
    //   5339: ldc2_w -1089966278
    //   5342: l2i
    //   5343: ldc_w 1507938595
    //   5346: ixor
    //   5347: ixor
    //   5348: lookupswitch default -> 24744, 503701196 -> 5331, 605408852 -> 5376
    //   5376: aload_1
    //   5377: getstatic Perryc.0 : I
    //   5380: ifle -> 5394
    //   5383: ldc2_w 1608889058
    //   5386: l2i
    //   5387: ldc_w 608302873
    //   5390: ixor
    //   5391: goto -> 5402
    //   5394: ldc2_w -571688288
    //   5397: l2i
    //   5398: ldc_w 622251007
    //   5401: ixor
    //   5402: ldc2_w 1881186722
    //   5405: l2i
    //   5406: ldc_w -973371342
    //   5409: ixor
    //   5410: ixor
    //   5411: lookupswitch default -> 25020, -830509973 -> 5394, 1294031055 -> 5436
    //   5436: getfield field_70177_z : F
    //   5439: ldc_w 0.05354498
    //   5442: invokestatic floatToIntBits : (F)I
    //   5445: ldc_w 2121224699
    //   5448: ixor
    //   5449: invokestatic intBitsToFloat : (I)F
    //   5452: fdiv
    //   5453: ldc_w 0.7100775
    //   5456: invokestatic floatToIntBits : (F)I
    //   5459: ldc_w 2138884223
    //   5462: ixor
    //   5463: invokestatic intBitsToFloat : (I)F
    //   5466: fmul
    //   5467: getstatic Perryc.c : I
    //   5470: iflt -> 5484
    //   5473: ldc2_w -487345931
    //   5476: l2i
    //   5477: ldc_w 1366824291
    //   5480: ixor
    //   5481: goto -> 5492
    //   5484: ldc2_w -842284232
    //   5487: l2i
    //   5488: ldc_w -567823099
    //   5491: ixor
    //   5492: ldc2_w 1500922878
    //   5495: l2i
    //   5496: ldc_w 794635981
    //   5499: ixor
    //   5500: ixor
    //   5501: lookupswitch default -> 5528, -979318619 -> 24700, -84726610 -> 5484
    //   5528: goto -> 5532
    //   5531: athrow
    //   5532: invokestatic func_76126_a : (F)F
    //   5535: goto -> 5539
    //   5538: athrow
    //   5539: fneg
    //   5540: getstatic Perryc.1 : I
    //   5543: ifeq -> 5557
    //   5546: ldc2_w 1376858719
    //   5549: l2i
    //   5550: ldc_w -1942846073
    //   5553: ixor
    //   5554: goto -> 5565
    //   5557: ldc2_w 756858755
    //   5560: l2i
    //   5561: ldc_w 492057862
    //   5564: ixor
    //   5565: ldc2_w 678883650
    //   5568: l2i
    //   5569: ldc_w 902361393
    //   5572: ixor
    //   5573: ixor
    //   5574: lookupswitch default -> 5600, -1013074005 -> 24662, 603100556 -> 5557
    //   5600: aload_1
    //   5601: getstatic Perryc.c : I
    //   5604: iflt -> 5618
    //   5607: ldc2_w -757080395
    //   5610: l2i
    //   5611: ldc_w 284944573
    //   5614: ixor
    //   5615: goto -> 5626
    //   5618: ldc2_w 1138418365
    //   5621: l2i
    //   5622: ldc_w -260211021
    //   5625: ixor
    //   5626: ldc2_w -1697128618
    //   5629: l2i
    //   5630: ldc_w 1907953738
    //   5633: ixor
    //   5634: ixor
    //   5635: lookupswitch default -> 5660, 692779284 -> 24802, 2054567484 -> 5618
    //   5660: getfield field_70125_A : F
    //   5663: ldc_w 0.11766755
    //   5666: invokestatic floatToIntBits : (F)I
    //   5669: ldc_w 2126838703
    //   5672: ixor
    //   5673: invokestatic intBitsToFloat : (I)F
    //   5676: fdiv
    //   5677: ldc_w 0.8438808
    //   5680: invokestatic floatToIntBits : (F)I
    //   5683: ldc_w 2131822409
    //   5686: ixor
    //   5687: invokestatic intBitsToFloat : (I)F
    //   5690: fmul
    //   5691: getstatic Perryc.1 : I
    //   5694: ifeq -> 5708
    //   5697: ldc2_w 1191036338
    //   5700: l2i
    //   5701: ldc_w 1992061063
    //   5704: ixor
    //   5705: goto -> 5716
    //   5708: ldc2_w 238895065
    //   5711: l2i
    //   5712: ldc_w 550855780
    //   5715: ixor
    //   5716: ldc2_w 420677610
    //   5719: l2i
    //   5720: ldc_w -76425140
    //   5723: ixor
    //   5724: ixor
    //   5725: lookupswitch default -> 5752, -1514520451 -> 5708, -769430893 -> 25062
    //   5752: goto -> 5756
    //   5755: athrow
    //   5756: invokestatic func_76134_b : (F)F
    //   5759: goto -> 5763
    //   5762: athrow
    //   5763: fmul
    //   5764: f2d
    //   5765: getstatic Perryc.1 : I
    //   5768: ifeq -> 5782
    //   5771: ldc2_w -1403328387
    //   5774: l2i
    //   5775: ldc_w -692699162
    //   5778: ixor
    //   5779: goto -> 5790
    //   5782: ldc2_w -1484354478
    //   5785: l2i
    //   5786: ldc_w 2135234910
    //   5789: ixor
    //   5790: ldc2_w -388358366
    //   5793: l2i
    //   5794: ldc_w 1754006335
    //   5797: ixor
    //   5798: ixor
    //   5799: lookupswitch default -> 5824, -88421498 -> 24634, -84542774 -> 5782
    //   5824: aload #9
    //   5826: instanceof net/minecraft/item/ItemBow
    //   5829: ifeq -> 5843
    //   5832: ldc2_w -256032921
    //   5835: l2i
    //   5836: ldc_w 1922324051
    //   5839: ixor
    //   5840: goto -> 5851
    //   5843: ldc2_w -1501331737
    //   5846: l2i
    //   5847: ldc_w 615126996
    //   5850: ixor
    //   5851: ldc2_w 1851411351
    //   5854: l2i
    //   5855: ldc_w -403493480
    //   5858: ixor
    //   5859: ixor
    //   5860: tableswitch default -> 5832, 192941883 -> 5884, 192941884 -> 5900
    //   5884: ldc2_w 4.639118369858603
    //   5887: invokestatic doubleToLongBits : (D)J
    //   5890: ldc2_w 9215084420913120027
    //   5893: lxor
    //   5894: invokestatic longBitsToDouble : (J)D
    //   5897: goto -> 5913
    //   5900: ldc2_w 105.55554849688322
    //   5903: invokestatic doubleToLongBits : (D)J
    //   5906: ldc2_w 9188462643651921087
    //   5909: lxor
    //   5910: invokestatic longBitsToDouble : (J)D
    //   5913: dmul
    //   5914: getstatic Perryc.1 : I
    //   5917: ifeq -> 5931
    //   5920: ldc2_w -82949062
    //   5923: l2i
    //   5924: ldc_w -1506278603
    //   5927: ixor
    //   5928: goto -> 5939
    //   5931: ldc2_w 1984918737
    //   5934: l2i
    //   5935: ldc_w -1593410732
    //   5938: ixor
    //   5939: ldc2_w 1955050789
    //   5942: l2i
    //   5943: ldc_w -940619660
    //   5946: ixor
    //   5947: ixor
    //   5948: lookupswitch default -> 24602, -295783842 -> 5931, 1679946452 -> 5976
    //   5976: dstore #16
    //   5978: getstatic Perryc.0 : I
    //   5981: ifle -> 5995
    //   5984: ldc2_w 995342562
    //   5987: l2i
    //   5988: ldc_w -2134940330
    //   5991: ixor
    //   5992: goto -> 6003
    //   5995: ldc2_w -2132635384
    //   5998: l2i
    //   5999: ldc_w -936785578
    //   6002: ixor
    //   6003: ldc2_w -349996850
    //   6006: l2i
    //   6007: ldc_w 1902731458
    //   6010: ixor
    //   6011: ixor
    //   6012: lookupswitch default -> 6040, 564577720 -> 24598, 716011016 -> 5995
    //   6040: aload_1
    //   6041: getstatic Perryc.1 : I
    //   6044: ifeq -> 6058
    //   6047: ldc2_w -358162258
    //   6050: l2i
    //   6051: ldc_w -2046733166
    //   6054: ixor
    //   6055: goto -> 6066
    //   6058: ldc2_w -574476143
    //   6061: l2i
    //   6062: ldc_w 1231209235
    //   6065: ixor
    //   6066: ldc2_w 1922302041
    //   6069: l2i
    //   6070: ldc_w 861636142
    //   6073: ixor
    //   6074: ixor
    //   6075: lookupswitch default -> 6100, -426266776 -> 6058, 761803339 -> 24642
    //   6100: getfield field_70125_A : F
    //   6103: ldc_w 0.4277422
    //   6106: invokestatic floatToIntBits : (F)I
    //   6109: ldc_w 2112815367
    //   6112: ixor
    //   6113: invokestatic intBitsToFloat : (I)F
    //   6116: fdiv
    //   6117: ldc_w 0.5769552
    //   6120: invokestatic floatToIntBits : (F)I
    //   6123: ldc_w 2136652941
    //   6126: ixor
    //   6127: invokestatic intBitsToFloat : (I)F
    //   6130: fmul
    //   6131: getstatic Perryc.c : I
    //   6134: iflt -> 6148
    //   6137: ldc2_w -1348494007
    //   6140: l2i
    //   6141: ldc_w 1110791626
    //   6144: ixor
    //   6145: goto -> 6156
    //   6148: ldc2_w 890072351
    //   6151: l2i
    //   6152: ldc_w -2057909005
    //   6155: ixor
    //   6156: ldc2_w 212986972
    //   6159: l2i
    //   6160: ldc_w 1119929512
    //   6163: ixor
    //   6164: ixor
    //   6165: lookupswitch default -> 24682, -1545871241 -> 6148, -30766824 -> 6192
    //   6192: goto -> 6196
    //   6195: athrow
    //   6196: invokestatic func_76126_a : (F)F
    //   6199: goto -> 6203
    //   6202: athrow
    //   6203: fneg
    //   6204: f2d
    //   6205: getstatic Perryc.0 : I
    //   6208: ifle -> 6222
    //   6211: ldc2_w -140822698
    //   6214: l2i
    //   6215: ldc_w 2054178216
    //   6218: ixor
    //   6219: goto -> 6230
    //   6222: ldc2_w -1658889827
    //   6225: l2i
    //   6226: ldc_w -778248231
    //   6229: ixor
    //   6230: ldc2_w 1138169778
    //   6233: l2i
    //   6234: ldc_w 1088356249
    //   6237: ixor
    //   6238: ixor
    //   6239: lookupswitch default -> 24872, -1897751851 -> 6222, 1334472303 -> 6264
    //   6264: aload #9
    //   6266: instanceof net/minecraft/item/ItemBow
    //   6269: ifeq -> 6283
    //   6272: ldc2_w 1946668710
    //   6275: l2i
    //   6276: ldc_w -938381798
    //   6279: ixor
    //   6280: goto -> 6291
    //   6283: ldc2_w 1077203909
    //   6286: l2i
    //   6287: ldc_w -64851080
    //   6290: ixor
    //   6291: ldc2_w 1949517743
    //   6294: l2i
    //   6295: ldc_w -588808389
    //   6298: ixor
    //   6299: ixor
    //   6300: tableswitch default -> 6272, 348297256 -> 6324, 348297257 -> 6340
    //   6324: ldc2_w 11.624139770031212
    //   6327: invokestatic doubleToLongBits : (D)J
    //   6330: ldc2_w 9211901447287395715
    //   6333: lxor
    //   6334: invokestatic longBitsToDouble : (J)D
    //   6337: goto -> 6353
    //   6340: ldc2_w 25.055705625087874
    //   6343: invokestatic doubleToLongBits : (D)J
    //   6346: ldc2_w 9214531805004459324
    //   6349: lxor
    //   6350: invokestatic longBitsToDouble : (J)D
    //   6353: dmul
    //   6354: getstatic Perryc.0 : I
    //   6357: ifle -> 6371
    //   6360: ldc2_w -730856382
    //   6363: l2i
    //   6364: ldc_w -300567433
    //   6367: ixor
    //   6368: goto -> 6379
    //   6371: ldc2_w -95416176
    //   6374: l2i
    //   6375: ldc_w -680914510
    //   6378: ixor
    //   6379: ldc2_w -1032003581
    //   6382: l2i
    //   6383: ldc_w -102386668
    //   6386: ixor
    //   6387: ixor
    //   6388: lookupswitch default -> 24722, 33350690 -> 6371, 379802933 -> 6416
    //   6416: dstore #18
    //   6418: getstatic Perryc.c : I
    //   6421: iflt -> 6435
    //   6424: ldc2_w 2131813973
    //   6427: l2i
    //   6428: ldc_w 817721120
    //   6431: ixor
    //   6432: goto -> 6443
    //   6435: ldc2_w 1493840191
    //   6438: l2i
    //   6439: ldc_w 526658765
    //   6442: ixor
    //   6443: ldc2_w 160579740
    //   6446: l2i
    //   6447: ldc_w -1865331324
    //   6450: ixor
    //   6451: ixor
    //   6452: lookupswitch default -> 6480, -689011603 -> 24854, 412588755 -> 6435
    //   6480: aload_1
    //   6481: getstatic Perryc.c : I
    //   6484: iflt -> 6498
    //   6487: ldc2_w 1513761619
    //   6490: l2i
    //   6491: ldc_w 2136474585
    //   6494: ixor
    //   6495: goto -> 6506
    //   6498: ldc2_w 1955054754
    //   6501: l2i
    //   6502: ldc_w 604622330
    //   6505: ixor
    //   6506: ldc2_w -1100338754
    //   6509: l2i
    //   6510: ldc_w -1546582644
    //   6513: ixor
    //   6514: ixor
    //   6515: lookupswitch default -> 6540, -1895269140 -> 6498, 953746616 -> 24716
    //   6540: getfield field_70177_z : F
    //   6543: ldc_w 0.109009914
    //   6546: invokestatic floatToIntBits : (F)I
    //   6549: ldc_w 2129346711
    //   6552: ixor
    //   6553: invokestatic intBitsToFloat : (I)F
    //   6556: fdiv
    //   6557: ldc_w 0.0869104
    //   6560: invokestatic floatToIntBits : (F)I
    //   6563: ldc_w 2113466831
    //   6566: ixor
    //   6567: invokestatic intBitsToFloat : (I)F
    //   6570: fmul
    //   6571: getstatic Perryc.1 : I
    //   6574: ifeq -> 6588
    //   6577: ldc2_w -2098220168
    //   6580: l2i
    //   6581: ldc_w 2084043376
    //   6584: ixor
    //   6585: goto -> 6596
    //   6588: ldc2_w 1129783943
    //   6591: l2i
    //   6592: ldc_w 1673398280
    //   6595: ixor
    //   6596: ldc2_w -1241516293
    //   6599: l2i
    //   6600: ldc_w 1764862863
    //   6603: ixor
    //   6604: ixor
    //   6605: lookupswitch default -> 6632, 571872380 -> 24910, 1694454051 -> 6588
    //   6632: goto -> 6636
    //   6635: athrow
    //   6636: invokestatic func_76134_b : (F)F
    //   6639: goto -> 6643
    //   6642: athrow
    //   6643: getstatic Perryc.0 : I
    //   6646: ifle -> 6660
    //   6649: ldc2_w -750931993
    //   6652: l2i
    //   6653: ldc_w 587685731
    //   6656: ixor
    //   6657: goto -> 6668
    //   6660: ldc2_w -1908008444
    //   6663: l2i
    //   6664: ldc_w 80846490
    //   6667: ixor
    //   6668: ldc2_w -2097330343
    //   6671: l2i
    //   6672: ldc_w 238692381
    //   6675: ixor
    //   6676: ixor
    //   6677: lookupswitch default -> 25058, 105966554 -> 6704, 2096996288 -> 6660
    //   6704: aload_1
    //   6705: getstatic Perryc.0 : I
    //   6708: ifle -> 6722
    //   6711: ldc2_w -1623220389
    //   6714: l2i
    //   6715: ldc_w 1866699394
    //   6718: ixor
    //   6719: goto -> 6730
    //   6722: ldc2_w -1152463848
    //   6725: l2i
    //   6726: ldc_w -301604138
    //   6729: ixor
    //   6730: ldc2_w 2143514313
    //   6733: l2i
    //   6734: ldc_w 1126883197
    //   6737: ixor
    //   6738: ixor
    //   6739: lookupswitch default -> 6764, -862602131 -> 24724, 407540407 -> 6722
    //   6764: getfield field_70125_A : F
    //   6767: ldc_w 0.014398994
    //   6770: invokestatic floatToIntBits : (F)I
    //   6773: ldc_w 2136992194
    //   6776: ixor
    //   6777: invokestatic intBitsToFloat : (I)F
    //   6780: fdiv
    //   6781: ldc_w 0.39086306
    //   6784: invokestatic floatToIntBits : (F)I
    //   6787: ldc_w 2122387695
    //   6790: ixor
    //   6791: invokestatic intBitsToFloat : (I)F
    //   6794: fmul
    //   6795: getstatic Perryc.1 : I
    //   6798: ifeq -> 6812
    //   6801: ldc2_w -400462230
    //   6804: l2i
    //   6805: ldc_w 1113749098
    //   6808: ixor
    //   6809: goto -> 6820
    //   6812: ldc2_w -468111262
    //   6815: l2i
    //   6816: ldc_w 1100352678
    //   6819: ixor
    //   6820: ldc2_w -1604473345
    //   6823: l2i
    //   6824: ldc_w 236760087
    //   6827: ixor
    //   6828: ixor
    //   6829: lookupswitch default -> 6856, -1315005451 -> 6812, 67246568 -> 24888
    //   6856: goto -> 6860
    //   6859: athrow
    //   6860: invokestatic func_76134_b : (F)F
    //   6863: goto -> 6867
    //   6866: athrow
    //   6867: fmul
    //   6868: f2d
    //   6869: getstatic Perryc.0 : I
    //   6872: ifle -> 6886
    //   6875: ldc2_w 899646057
    //   6878: l2i
    //   6879: ldc_w -1158743160
    //   6882: ixor
    //   6883: goto -> 6894
    //   6886: ldc2_w 1282352351
    //   6889: l2i
    //   6890: ldc_w 1550279005
    //   6893: ixor
    //   6894: ldc2_w -961164789
    //   6897: l2i
    //   6898: ldc_w -192122113
    //   6901: ixor
    //   6902: ixor
    //   6903: lookupswitch default -> 6928, -1119305451 -> 24982, 859697618 -> 6886
    //   6928: aload #9
    //   6930: instanceof net/minecraft/item/ItemBow
    //   6933: ifeq -> 6947
    //   6936: ldc2_w -207848566
    //   6939: l2i
    //   6940: ldc_w -1890867251
    //   6943: ixor
    //   6944: goto -> 6955
    //   6947: ldc2_w 433735048
    //   6950: l2i
    //   6951: ldc_w 1695390158
    //   6954: ixor
    //   6955: ldc2_w -1908737274
    //   6958: l2i
    //   6959: ldc_w -613460165
    //   6962: ixor
    //   6963: ixor
    //   6964: tableswitch default -> 6936, 696414330 -> 6988, 696414331 -> 7004
    //   6988: ldc2_w 10.61979094511984
    //   6991: invokestatic doubleToLongBits : (D)J
    //   6994: ldc2_w 9211336049163193109
    //   6997: lxor
    //   6998: invokestatic longBitsToDouble : (J)D
    //   7001: goto -> 7017
    //   7004: ldc2_w 30.752192027970334
    //   7007: invokestatic doubleToLongBits : (D)J
    //   7010: ldc2_w 9216433114295429201
    //   7013: lxor
    //   7014: invokestatic longBitsToDouble : (J)D
    //   7017: dmul
    //   7018: getstatic Perryc.0 : I
    //   7021: ifle -> 7035
    //   7024: ldc2_w -1129182066
    //   7027: l2i
    //   7028: ldc_w 1608193691
    //   7031: ixor
    //   7032: goto -> 7043
    //   7035: ldc2_w -1338389113
    //   7038: l2i
    //   7039: ldc_w -1231386444
    //   7042: ixor
    //   7043: ldc2_w 1923828906
    //   7046: l2i
    //   7047: ldc_w -1888198890
    //   7050: ixor
    //   7051: ixor
    //   7052: lookupswitch default -> 7080, -111527517 -> 7035, 515246505 -> 24488
    //   7080: dstore #20
    //   7082: ldc2_w 2087298209
    //   7085: l2i
    //   7086: ldc_w 2087239137
    //   7089: ixor
    //   7090: getstatic Perryc.1 : I
    //   7093: ifeq -> 7107
    //   7096: ldc2_w 1555137244
    //   7099: l2i
    //   7100: ldc_w -466855024
    //   7103: ixor
    //   7104: goto -> 7115
    //   7107: ldc2_w 694033864
    //   7110: l2i
    //   7111: ldc_w 1830264514
    //   7114: ixor
    //   7115: ldc2_w -1900570251
    //   7118: l2i
    //   7119: ldc_w 1809321278
    //   7122: ixor
    //   7123: ixor
    //   7124: lookupswitch default -> 24498, -1591339199 -> 7152, 1576160519 -> 7107
    //   7152: aload_1
    //   7153: getstatic Perryc.c : I
    //   7156: iflt -> 7170
    //   7159: ldc2_w -1142030413
    //   7162: l2i
    //   7163: ldc_w 999484504
    //   7166: ixor
    //   7167: goto -> 7178
    //   7170: ldc2_w 375272583
    //   7173: l2i
    //   7174: ldc_w 1035884700
    //   7177: ixor
    //   7178: ldc2_w -1009320848
    //   7181: l2i
    //   7182: ldc_w 1253059009
    //   7185: ixor
    //   7186: ixor
    //   7187: lookupswitch default -> 7212, 152684122 -> 24580, 593438612 -> 7170
    //   7212: goto -> 7216
    //   7215: athrow
    //   7216: invokevirtual func_184605_cv : ()I
    //   7219: goto -> 7223
    //   7222: athrow
    //   7223: isub
    //   7224: getstatic Perryc.1 : I
    //   7227: ifeq -> 7241
    //   7230: ldc2_w 2128244956
    //   7233: l2i
    //   7234: ldc_w 186670897
    //   7237: ixor
    //   7238: goto -> 7249
    //   7241: ldc2_w 1484279256
    //   7244: l2i
    //   7245: ldc_w -1456958859
    //   7248: ixor
    //   7249: ldc2_w -688230895
    //   7252: l2i
    //   7253: ldc_w 205408721
    //   7256: ixor
    //   7257: ixor
    //   7258: lookupswitch default -> 7284, -1354889171 -> 24762, 842813132 -> 7241
    //   7284: istore #22
    //   7286: getstatic Perryc.0 : I
    //   7289: ifle -> 7303
    //   7292: ldc2_w 416858184
    //   7295: l2i
    //   7296: ldc_w 1738027546
    //   7299: ixor
    //   7300: goto -> 7311
    //   7303: ldc2_w 1299400343
    //   7306: l2i
    //   7307: ldc_w -1839868884
    //   7310: ixor
    //   7311: ldc2_w -1445650953
    //   7314: l2i
    //   7315: ldc_w -1035285422
    //   7318: ixor
    //   7319: ixor
    //   7320: lookupswitch default -> 7348, 350168055 -> 24792, 492037994 -> 7303
    //   7348: iload #22
    //   7350: i2f
    //   7351: ldc_w 0.059121843
    //   7354: invokestatic floatToIntBits : (F)I
    //   7357: ldc_w 2094148031
    //   7360: ixor
    //   7361: invokestatic intBitsToFloat : (I)F
    //   7364: fdiv
    //   7365: getstatic Perryc.0 : I
    //   7368: ifle -> 7382
    //   7371: ldc2_w 287992323
    //   7374: l2i
    //   7375: ldc_w 1460179041
    //   7378: ixor
    //   7379: goto -> 7390
    //   7382: ldc2_w 132042422
    //   7385: l2i
    //   7386: ldc_w -1438770006
    //   7389: ixor
    //   7390: ldc2_w 2002863399
    //   7393: l2i
    //   7394: ldc_w -1376092604
    //   7397: ixor
    //   7398: ixor
    //   7399: lookupswitch default -> 24582, -1665548031 -> 7382, 2004609407 -> 7424
    //   7424: fstore #23
    //   7426: getstatic Perryc.c : I
    //   7429: iflt -> 7443
    //   7432: ldc2_w 34084303
    //   7435: l2i
    //   7436: ldc_w 2137077079
    //   7439: ixor
    //   7440: goto -> 7451
    //   7443: ldc2_w 1162271007
    //   7446: l2i
    //   7447: ldc_w -798183037
    //   7450: ixor
    //   7451: ldc2_w 168970543
    //   7454: l2i
    //   7455: ldc_w 773595621
    //   7458: ixor
    //   7459: ixor
    //   7460: lookupswitch default -> 24832, -1323040682 -> 7488, 1499940946 -> 7443
    //   7488: fload #23
    //   7490: getstatic Perryc.c : I
    //   7493: iflt -> 7507
    //   7496: ldc2_w 2090218097
    //   7499: l2i
    //   7500: ldc_w 368239737
    //   7503: ixor
    //   7504: goto -> 7515
    //   7507: ldc2_w -1245651469
    //   7510: l2i
    //   7511: ldc_w -1594058299
    //   7514: ixor
    //   7515: ldc2_w 1326854913
    //   7518: l2i
    //   7519: ldc_w 2067101431
    //   7522: ixor
    //   7523: ixor
    //   7524: lookupswitch default -> 7552, 1555252752 -> 7507, 1564972030 -> 24534
    //   7552: fload #23
    //   7554: fmul
    //   7555: getstatic Perryc.c : I
    //   7558: iflt -> 7572
    //   7561: ldc2_w 199449302
    //   7564: l2i
    //   7565: ldc_w -1638683797
    //   7568: ixor
    //   7569: goto -> 7580
    //   7572: ldc2_w 577879982
    //   7575: l2i
    //   7576: ldc_w -507225105
    //   7579: ixor
    //   7580: ldc2_w 317076603
    //   7583: l2i
    //   7584: ldc_w -320330663
    //   7587: ixor
    //   7588: ixor
    //   7589: lookupswitch default -> 25028, 1035727971 -> 7616, 1807671711 -> 7572
    //   7616: fload #23
    //   7618: ldc_w 0.6436519
    //   7621: invokestatic floatToIntBits : (F)I
    //   7624: ldc_w 2133116511
    //   7627: ixor
    //   7628: invokestatic intBitsToFloat : (I)F
    //   7631: fmul
    //   7632: fadd
    //   7633: ldc_w 0.7945286
    //   7636: invokestatic floatToIntBits : (F)I
    //   7639: ldc_w 2131453498
    //   7642: ixor
    //   7643: invokestatic intBitsToFloat : (I)F
    //   7646: fdiv
    //   7647: getstatic Perryc.0 : I
    //   7650: ifle -> 7664
    //   7653: ldc2_w -1311311391
    //   7656: l2i
    //   7657: ldc_w 181282285
    //   7660: ixor
    //   7661: goto -> 7672
    //   7664: ldc2_w -815303228
    //   7667: l2i
    //   7668: ldc_w -1533068671
    //   7671: ixor
    //   7672: ldc2_w -1651556175
    //   7675: l2i
    //   7676: ldc_w -1854765693
    //   7679: ixor
    //   7680: ixor
    //   7681: lookupswitch default -> 25008, -1209722562 -> 7664, 1728416375 -> 7708
    //   7708: fstore #23
    //   7710: getstatic Perryc.0 : I
    //   7713: ifle -> 7727
    //   7716: ldc2_w -909816452
    //   7719: l2i
    //   7720: ldc_w -360440910
    //   7723: ixor
    //   7724: goto -> 7735
    //   7727: ldc2_w 685114130
    //   7730: l2i
    //   7731: ldc_w -1196462927
    //   7734: ixor
    //   7735: ldc2_w 529085765
    //   7738: l2i
    //   7739: ldc_w 1931738072
    //   7742: ixor
    //   7743: ixor
    //   7744: lookupswitch default -> 25072, -53239490 -> 7772, 1340840019 -> 7727
    //   7772: fload #23
    //   7774: ldc_w 9.507812
    //   7777: invokestatic floatToIntBits : (F)I
    //   7780: ldc_w 2123898879
    //   7783: ixor
    //   7784: invokestatic intBitsToFloat : (I)F
    //   7787: fcmpl
    //   7788: ifle -> 7802
    //   7791: ldc2_w -1962390168
    //   7794: l2i
    //   7795: ldc_w 1272937812
    //   7798: ixor
    //   7799: goto -> 7810
    //   7802: ldc2_w -605519571
    //   7805: l2i
    //   7806: ldc_w 457158934
    //   7809: ixor
    //   7810: ldc2_w -2038692569
    //   7813: l2i
    //   7814: ldc_w 233931424
    //   7817: ixor
    //   7818: ixor
    //   7819: tableswitch default -> 7791, 1264236475 -> 7840, 1264236476 -> 7914
    //   7840: ldc_w 4.8631587
    //   7843: invokestatic floatToIntBits : (F)I
    //   7846: ldc_w 2132516607
    //   7849: ixor
    //   7850: invokestatic intBitsToFloat : (I)F
    //   7853: getstatic Perryc.1 : I
    //   7856: ifeq -> 7870
    //   7859: ldc2_w -1428068949
    //   7862: l2i
    //   7863: ldc_w 1559635746
    //   7866: ixor
    //   7867: goto -> 7878
    //   7870: ldc2_w -1791805843
    //   7873: l2i
    //   7874: ldc_w 782744409
    //   7877: ixor
    //   7878: ldc2_w -695095122
    //   7881: l2i
    //   7882: ldc_w 1364036760
    //   7885: ixor
    //   7886: ixor
    //   7887: lookupswitch default -> 7912, 203506361 -> 7870, 1909161663 -> 24644
    //   7912: fstore #23
    //   7914: getstatic Perryc.1 : I
    //   7917: ifeq -> 7931
    //   7920: ldc2_w -1383294027
    //   7923: l2i
    //   7924: ldc_w 518560110
    //   7927: ixor
    //   7928: goto -> 7939
    //   7931: ldc2_w -1129739504
    //   7934: l2i
    //   7935: ldc_w 856018244
    //   7938: ixor
    //   7939: ldc2_w -2129747713
    //   7942: l2i
    //   7943: ldc_w 551944719
    //   7946: ixor
    //   7947: ixor
    //   7948: lookupswitch default -> 24710, 311205931 -> 7931, 776266916 -> 7976
    //   7976: dload #16
    //   7978: getstatic Perryc.c : I
    //   7981: iflt -> 7995
    //   7984: ldc2_w -1968334763
    //   7987: l2i
    //   7988: ldc_w -879674195
    //   7991: ixor
    //   7992: goto -> 8003
    //   7995: ldc2_w -2054247625
    //   7998: l2i
    //   7999: ldc_w 646666476
    //   8002: ixor
    //   8003: ldc2_w 1481298112
    //   8006: l2i
    //   8007: ldc_w -1030326320
    //   8010: ixor
    //   8011: ixor
    //   8012: lookupswitch default -> 8040, -606075928 -> 24600, 584571135 -> 7995
    //   8040: dload #16
    //   8042: dmul
    //   8043: getstatic Perryc.c : I
    //   8046: iflt -> 8060
    //   8049: ldc2_w -1299108960
    //   8052: l2i
    //   8053: ldc_w -321291776
    //   8056: ixor
    //   8057: goto -> 8068
    //   8060: ldc2_w -1120942041
    //   8063: l2i
    //   8064: ldc_w 269764314
    //   8067: ixor
    //   8068: ldc2_w -870139233
    //   8071: l2i
    //   8072: ldc_w -1222665500
    //   8075: ixor
    //   8076: ixor
    //   8077: lookupswitch default -> 24818, -704205178 -> 8104, 628453851 -> 8060
    //   8104: dload #18
    //   8106: getstatic Perryc.0 : I
    //   8109: ifle -> 8123
    //   8112: ldc2_w 1653776792
    //   8115: l2i
    //   8116: ldc_w -764722706
    //   8119: ixor
    //   8120: goto -> 8131
    //   8123: ldc2_w 192286966
    //   8126: l2i
    //   8127: ldc_w -1220778886
    //   8130: ixor
    //   8131: ldc2_w -553773402
    //   8134: l2i
    //   8135: ldc_w 1693842133
    //   8138: ixor
    //   8139: ixor
    //   8140: lookupswitch default -> 24758, 104962303 -> 8168, 183634949 -> 8123
    //   8168: dload #18
    //   8170: dmul
    //   8171: dadd
    //   8172: getstatic Perryc.c : I
    //   8175: iflt -> 8189
    //   8178: ldc2_w -286070323
    //   8181: l2i
    //   8182: ldc_w 1208512051
    //   8185: ixor
    //   8186: goto -> 8197
    //   8189: ldc2_w -823987009
    //   8192: l2i
    //   8193: ldc_w -111500025
    //   8196: ixor
    //   8197: ldc2_w -1344504906
    //   8200: l2i
    //   8201: ldc_w 1282294487
    //   8204: ixor
    //   8205: ixor
    //   8206: lookupswitch default -> 8232, -2037216254 -> 8189, 1162395295 -> 25010
    //   8232: dload #20
    //   8234: getstatic Perryc.0 : I
    //   8237: ifle -> 8251
    //   8240: ldc2_w -1328151092
    //   8243: l2i
    //   8244: ldc_w -756503258
    //   8247: ixor
    //   8248: goto -> 8259
    //   8251: ldc2_w 1929613216
    //   8254: l2i
    //   8255: ldc_w -1642971498
    //   8258: ixor
    //   8259: ldc2_w -1952191701
    //   8262: l2i
    //   8263: ldc_w -1343676441
    //   8266: ixor
    //   8267: ixor
    //   8268: lookupswitch default -> 24836, -916765190 -> 8296, 1182030886 -> 8251
    //   8296: dload #20
    //   8298: dmul
    //   8299: dadd
    //   8300: getstatic Perryc.c : I
    //   8303: iflt -> 8317
    //   8306: ldc2_w -1181068894
    //   8309: l2i
    //   8310: ldc_w -56715031
    //   8313: ixor
    //   8314: goto -> 8325
    //   8317: ldc2_w 762384297
    //   8320: l2i
    //   8321: ldc_w 2055131517
    //   8324: ixor
    //   8325: ldc2_w 139846674
    //   8328: l2i
    //   8329: ldc_w 269252969
    //   8332: ixor
    //   8333: ixor
    //   8334: lookupswitch default -> 24484, 1331053487 -> 8360, 1566397488 -> 8317
    //   8360: goto -> 8364
    //   8363: athrow
    //   8364: invokestatic func_76133_a : (D)F
    //   8367: goto -> 8371
    //   8370: athrow
    //   8371: getstatic Perryc.1 : I
    //   8374: ifeq -> 8388
    //   8377: ldc2_w 1794642431
    //   8380: l2i
    //   8381: ldc_w 1675598243
    //   8384: ixor
    //   8385: goto -> 8396
    //   8388: ldc2_w 1289412320
    //   8391: l2i
    //   8392: ldc_w -46639474
    //   8395: ixor
    //   8396: ldc2_w 1617482735
    //   8399: l2i
    //   8400: ldc_w -302680104
    //   8403: ixor
    //   8404: ixor
    //   8405: lookupswitch default -> 8432, -2068173717 -> 24470, 1242396306 -> 8388
    //   8432: fstore #24
    //   8434: getstatic Perryc.c : I
    //   8437: iflt -> 8451
    //   8440: ldc2_w -841005147
    //   8443: l2i
    //   8444: ldc_w 1798212820
    //   8447: ixor
    //   8448: goto -> 8459
    //   8451: ldc2_w -918851823
    //   8454: l2i
    //   8455: ldc_w -1995722059
    //   8458: ixor
    //   8459: ldc2_w -1036925725
    //   8462: l2i
    //   8463: ldc_w 148319902
    //   8466: ixor
    //   8467: ixor
    //   8468: lookupswitch default -> 24510, -1965672487 -> 8496, 1813455116 -> 8451
    //   8496: dload #16
    //   8498: getstatic Perryc.0 : I
    //   8501: ifle -> 8515
    //   8504: ldc2_w -78130463
    //   8507: l2i
    //   8508: ldc_w -1267747754
    //   8511: ixor
    //   8512: goto -> 8523
    //   8515: ldc2_w 1911757811
    //   8518: l2i
    //   8519: ldc_w 1418080281
    //   8522: ixor
    //   8523: ldc2_w 1551591752
    //   8526: l2i
    //   8527: ldc_w -1244418241
    //   8530: ixor
    //   8531: ixor
    //   8532: lookupswitch default -> 24782, -1500471104 -> 8515, -857870947 -> 8560
    //   8560: fload #24
    //   8562: f2d
    //   8563: ddiv
    //   8564: getstatic Perryc.1 : I
    //   8567: ifeq -> 8581
    //   8570: ldc2_w -1080776260
    //   8573: l2i
    //   8574: ldc_w -1650014890
    //   8577: ixor
    //   8578: goto -> 8589
    //   8581: ldc2_w -2045733919
    //   8584: l2i
    //   8585: ldc_w -754293814
    //   8588: ixor
    //   8589: ldc2_w 880701561
    //   8592: l2i
    //   8593: ldc_w -818981047
    //   8596: ixor
    //   8597: ixor
    //   8598: lookupswitch default -> 24538, -1370761445 -> 8624, -647803942 -> 8581
    //   8624: dstore #16
    //   8626: getstatic Perryc.1 : I
    //   8629: ifeq -> 8643
    //   8632: ldc2_w 1754263542
    //   8635: l2i
    //   8636: ldc_w -1024143107
    //   8639: ixor
    //   8640: goto -> 8651
    //   8643: ldc2_w 1012136861
    //   8646: l2i
    //   8647: ldc_w -131634255
    //   8650: ixor
    //   8651: ldc2_w 1038249886
    //   8654: l2i
    //   8655: ldc_w -1617082183
    //   8658: ixor
    //   8659: ixor
    //   8660: lookupswitch default -> 24504, 134486060 -> 8643, 1712043787 -> 8688
    //   8688: dload #18
    //   8690: getstatic Perryc.c : I
    //   8693: iflt -> 8707
    //   8696: ldc2_w -1331938213
    //   8699: l2i
    //   8700: ldc_w 1308350756
    //   8703: ixor
    //   8704: goto -> 8715
    //   8707: ldc2_w -246037981
    //   8710: l2i
    //   8711: ldc_w -308232701
    //   8714: ixor
    //   8715: ldc2_w -2107074259
    //   8718: l2i
    //   8719: ldc_w 778614822
    //   8722: ixor
    //   8723: ixor
    //   8724: lookupswitch default -> 8752, -1274109645 -> 8707, 1365754996 -> 25006
    //   8752: fload #24
    //   8754: f2d
    //   8755: ddiv
    //   8756: getstatic Perryc.c : I
    //   8759: iflt -> 8773
    //   8762: ldc2_w -1031361869
    //   8765: l2i
    //   8766: ldc_w -273273888
    //   8769: ixor
    //   8770: goto -> 8781
    //   8773: ldc2_w -873369287
    //   8776: l2i
    //   8777: ldc_w 756977298
    //   8780: ixor
    //   8781: ldc2_w 926169618
    //   8784: l2i
    //   8785: ldc_w 729206650
    //   8788: ixor
    //   8789: ixor
    //   8790: lookupswitch default -> 25056, -89322813 -> 8816, 829584443 -> 8773
    //   8816: dstore #18
    //   8818: getstatic Perryc.0 : I
    //   8821: ifle -> 8835
    //   8824: ldc2_w -1522763554
    //   8827: l2i
    //   8828: ldc_w 491977733
    //   8831: ixor
    //   8832: goto -> 8843
    //   8835: ldc2_w 1796747361
    //   8838: l2i
    //   8839: ldc_w 1570821557
    //   8842: ixor
    //   8843: ldc2_w 2072766975
    //   8846: l2i
    //   8847: ldc_w 1772038875
    //   8850: ixor
    //   8851: ixor
    //   8852: lookupswitch default -> 24848, -1434826753 -> 8835, 615261936 -> 8880
    //   8880: dload #20
    //   8882: getstatic Perryc.c : I
    //   8885: iflt -> 8899
    //   8888: ldc2_w -1947754106
    //   8891: l2i
    //   8892: ldc_w 659767978
    //   8895: ixor
    //   8896: goto -> 8907
    //   8899: ldc2_w 1596027838
    //   8902: l2i
    //   8903: ldc_w 530012853
    //   8906: ixor
    //   8907: ldc2_w 1880529421
    //   8910: l2i
    //   8911: ldc_w 690773430
    //   8914: ixor
    //   8915: ixor
    //   8916: lookupswitch default -> 8944, -975400305 -> 8899, -175233897 -> 24908
    //   8944: fload #24
    //   8946: f2d
    //   8947: ddiv
    //   8948: getstatic Perryc.0 : I
    //   8951: ifle -> 8965
    //   8954: ldc2_w -967760920
    //   8957: l2i
    //   8958: ldc_w 1339960644
    //   8961: ixor
    //   8962: goto -> 8973
    //   8965: ldc2_w 692242422
    //   8968: l2i
    //   8969: ldc_w -1361745506
    //   8972: ixor
    //   8973: ldc2_w -25550865
    //   8976: l2i
    //   8977: ldc_w 818807745
    //   8980: ixor
    //   8981: ixor
    //   8982: lookupswitch default -> 9008, -1241380894 -> 8965, 1195053698 -> 24800
    //   9008: dstore #20
    //   9010: getstatic Perryc.0 : I
    //   9013: ifle -> 9027
    //   9016: ldc2_w -77948180
    //   9019: l2i
    //   9020: ldc_w -889169667
    //   9023: ixor
    //   9024: goto -> 9035
    //   9027: ldc2_w 506276414
    //   9030: l2i
    //   9031: ldc_w 1749461654
    //   9034: ixor
    //   9035: ldc2_w 2102848496
    //   9038: l2i
    //   9039: ldc_w -385360319
    //   9042: ixor
    //   9043: ixor
    //   9044: lookupswitch default -> 9072, -1542719584 -> 24554, -987894657 -> 9027
    //   9072: aload #9
    //   9074: instanceof net/minecraft/item/ItemBow
    //   9077: ifeq -> 9091
    //   9080: ldc2_w -1377940563
    //   9083: l2i
    //   9084: ldc_w 1051025310
    //   9087: ixor
    //   9088: goto -> 9099
    //   9091: ldc2_w -1328266550
    //   9094: l2i
    //   9095: ldc_w 598693630
    //   9098: ixor
    //   9099: ldc2_w 952237633
    //   9102: l2i
    //   9103: ldc_w -1103355591
    //   9106: ixor
    //   9107: ixor
    //   9108: tableswitch default -> 9080, 361155403 -> 9132, 361155404 -> 9211
    //   9132: getstatic Perryc.1 : I
    //   9135: ifeq -> 9149
    //   9138: ldc2_w -40883356
    //   9141: l2i
    //   9142: ldc_w -136001869
    //   9145: ixor
    //   9146: goto -> 9157
    //   9149: ldc2_w 81884014
    //   9152: l2i
    //   9153: ldc_w 61458458
    //   9156: ixor
    //   9157: ldc2_w 1147964495
    //   9160: l2i
    //   9161: ldc_w -1988707478
    //   9164: ixor
    //   9165: ixor
    //   9166: lookupswitch default -> 9192, -1863065494 -> 9149, -949036302 -> 24772
    //   9192: fload #23
    //   9194: ldc_w 0.59366393
    //   9197: invokestatic floatToIntBits : (F)I
    //   9200: ldc_w 2132277852
    //   9203: ixor
    //   9204: invokestatic intBitsToFloat : (I)F
    //   9207: fmul
    //   9208: goto -> 9761
    //   9211: getstatic Perryc.0 : I
    //   9214: ifle -> 9228
    //   9217: ldc2_w 485207346
    //   9220: l2i
    //   9221: ldc_w -624565463
    //   9224: ixor
    //   9225: goto -> 9236
    //   9228: ldc2_w -1589877594
    //   9231: l2i
    //   9232: ldc_w 1234506570
    //   9235: ixor
    //   9236: ldc2_w -28018456
    //   9239: l2i
    //   9240: ldc_w 175273421
    //   9243: ixor
    //   9244: ixor
    //   9245: lookupswitch default -> 24900, 479165129 -> 9272, 839402302 -> 9228
    //   9272: aload #9
    //   9274: instanceof net/minecraft/item/ItemFishingRod
    //   9277: ifeq -> 9291
    //   9280: ldc2_w 982550528
    //   9283: l2i
    //   9284: ldc_w -1001719632
    //   9287: ixor
    //   9288: goto -> 9299
    //   9291: ldc2_w 2087582232
    //   9294: l2i
    //   9295: ldc_w -2101900629
    //   9298: ixor
    //   9299: ldc2_w 2072217388
    //   9302: l2i
    //   9303: ldc_w 1278103405
    //   9306: ixor
    //   9307: ixor
    //   9308: tableswitch default -> 9280, -914900751 -> 9332, -914900750 -> 9348
    //   9332: ldc_w 15.533149
    //   9335: invokestatic floatToIntBits : (F)I
    //   9338: ldc_w 2128119751
    //   9341: ixor
    //   9342: invokestatic intBitsToFloat : (I)F
    //   9345: goto -> 9761
    //   9348: getstatic Perryc.c : I
    //   9351: iflt -> 9365
    //   9354: ldc2_w 1589319776
    //   9357: l2i
    //   9358: ldc_w -1087264098
    //   9361: ixor
    //   9362: goto -> 9373
    //   9365: ldc2_w -1805920821
    //   9368: l2i
    //   9369: ldc_w -865904342
    //   9372: ixor
    //   9373: ldc2_w 393769083
    //   9376: l2i
    //   9377: ldc_w 922799798
    //   9380: ixor
    //   9381: ixor
    //   9382: lookupswitch default -> 24786, -1041101773 -> 9365, 2017473068 -> 9408
    //   9408: aload_1
    //   9409: getstatic Perryc.c : I
    //   9412: iflt -> 9426
    //   9415: ldc2_w -274951014
    //   9418: l2i
    //   9419: ldc_w 206712788
    //   9422: ixor
    //   9423: goto -> 9434
    //   9426: ldc2_w -2007750811
    //   9429: l2i
    //   9430: ldc_w 1248776383
    //   9433: ixor
    //   9434: ldc2_w 805118908
    //   9437: l2i
    //   9438: ldc_w -689524173
    //   9441: ixor
    //   9442: ixor
    //   9443: lookupswitch default -> 9468, 450177729 -> 25060, 1891493131 -> 9426
    //   9468: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   9471: getstatic Perryc.0 : I
    //   9474: ifle -> 9488
    //   9477: ldc2_w -1592907558
    //   9480: l2i
    //   9481: ldc_w 1027798880
    //   9484: ixor
    //   9485: goto -> 9496
    //   9488: ldc2_w -196999268
    //   9491: l2i
    //   9492: ldc_w -1010743859
    //   9495: ixor
    //   9496: ldc2_w -1192578777
    //   9499: l2i
    //   9500: ldc_w -1048689954
    //   9503: ixor
    //   9504: ixor
    //   9505: lookupswitch default -> 9532, -778996778 -> 9488, -438817725 -> 24518
    //   9532: goto -> 9536
    //   9535: athrow
    //   9536: invokevirtual func_184586_b : (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
    //   9539: goto -> 9543
    //   9542: athrow
    //   9543: getstatic Perryc.1 : I
    //   9546: ifeq -> 9560
    //   9549: ldc2_w -562032039
    //   9552: l2i
    //   9553: ldc_w 208431906
    //   9556: ixor
    //   9557: goto -> 9568
    //   9560: ldc2_w 1822121003
    //   9563: l2i
    //   9564: ldc_w -998167961
    //   9567: ixor
    //   9568: ldc2_w 783121348
    //   9571: l2i
    //   9572: ldc_w 783490004
    //   9575: ixor
    //   9576: ixor
    //   9577: lookupswitch default -> 24612, -1476127140 -> 9604, -755885717 -> 9560
    //   9604: goto -> 9608
    //   9607: athrow
    //   9608: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   9611: goto -> 9615
    //   9614: athrow
    //   9615: getstatic Perryc.0 : I
    //   9618: ifle -> 9632
    //   9621: ldc2_w -643593178
    //   9624: l2i
    //   9625: ldc_w 853329173
    //   9628: ixor
    //   9629: goto -> 9640
    //   9632: ldc2_w 1875449067
    //   9635: l2i
    //   9636: ldc_w -1522869614
    //   9639: ixor
    //   9640: ldc2_w -1535124699
    //   9643: l2i
    //   9644: ldc_w -1233422618
    //   9647: ixor
    //   9648: ixor
    //   9649: lookupswitch default -> 9676, -824177293 -> 9632, -109320976 -> 24620
    //   9676: getstatic net/minecraft/init/Items.field_151062_by : Lnet/minecraft/item/Item;
    //   9679: if_acmpne -> 9693
    //   9682: ldc2_w 1165948723
    //   9685: l2i
    //   9686: ldc_w -904545842
    //   9689: ixor
    //   9690: goto -> 9701
    //   9693: ldc2_w -788218053
    //   9696: l2i
    //   9697: ldc_w 1584394695
    //   9700: ixor
    //   9701: ldc2_w 1952406869
    //   9704: l2i
    //   9705: ldc_w 167149322
    //   9708: ixor
    //   9709: ixor
    //   9710: tableswitch default -> 9682, -222139230 -> 9732, -222139229 -> 9748
    //   9732: ldc_w 42.535007
    //   9735: invokestatic floatToIntBits : (F)I
    //   9738: ldc_w 2102150591
    //   9741: ixor
    //   9742: invokestatic intBitsToFloat : (I)F
    //   9745: goto -> 9761
    //   9748: ldc_w 5.8184905
    //   9751: invokestatic floatToIntBits : (F)I
    //   9754: ldc_w 2134520083
    //   9757: ixor
    //   9758: invokestatic intBitsToFloat : (I)F
    //   9761: getstatic Perryc.0 : I
    //   9764: ifle -> 9778
    //   9767: ldc2_w 198917730
    //   9770: l2i
    //   9771: ldc_w -459778596
    //   9774: ixor
    //   9775: goto -> 9786
    //   9778: ldc2_w -257919062
    //   9781: l2i
    //   9782: ldc_w 308681019
    //   9785: ixor
    //   9786: ldc2_w -1233329127
    //   9789: l2i
    //   9790: ldc_w -1389407147
    //   9793: ixor
    //   9794: ixor
    //   9795: lookupswitch default -> 9820, -200221710 -> 24976, 886945119 -> 9778
    //   9820: fstore #25
    //   9822: getstatic Perryc.c : I
    //   9825: iflt -> 9839
    //   9828: ldc2_w 1114978391
    //   9831: l2i
    //   9832: ldc_w -967151759
    //   9835: ixor
    //   9836: goto -> 9847
    //   9839: ldc2_w -1605941804
    //   9842: l2i
    //   9843: ldc_w -1142611271
    //   9846: ixor
    //   9847: ldc2_w 400773815
    //   9850: l2i
    //   9851: ldc_w 884853416
    //   9854: ixor
    //   9855: ixor
    //   9856: lookupswitch default -> 9884, -2056550929 -> 9839, -1485713607 -> 24530
    //   9884: dload #16
    //   9886: getstatic Perryc.c : I
    //   9889: iflt -> 9903
    //   9892: ldc2_w 1115293746
    //   9895: l2i
    //   9896: ldc_w -1046101684
    //   9899: ixor
    //   9900: goto -> 9911
    //   9903: ldc2_w 645766314
    //   9906: l2i
    //   9907: ldc_w 583818024
    //   9910: ixor
    //   9911: ldc2_w 1819316335
    //   9914: l2i
    //   9915: ldc_w -849785477
    //   9918: ixor
    //   9919: ixor
    //   9920: lookupswitch default -> 9948, 586552426 -> 24492, 1509794000 -> 9903
    //   9948: fload #25
    //   9950: getstatic Perryc.1 : I
    //   9953: ifeq -> 9967
    //   9956: ldc2_w -1422948963
    //   9959: l2i
    //   9960: ldc_w 2005361650
    //   9963: ixor
    //   9964: goto -> 9975
    //   9967: ldc2_w -1621312119
    //   9970: l2i
    //   9971: ldc_w 570969152
    //   9974: ixor
    //   9975: ldc2_w -1629787549
    //   9978: l2i
    //   9979: ldc_w 1506268250
    //   9982: ixor
    //   9983: ixor
    //   9984: lookupswitch default -> 24874, 464803926 -> 9967, 2051559408 -> 10012
    //   10012: aload #9
    //   10014: instanceof net/minecraft/item/ItemFishingRod
    //   10017: ifeq -> 10031
    //   10020: ldc2_w 1126034167
    //   10023: l2i
    //   10024: ldc_w 1813197979
    //   10027: ixor
    //   10028: goto -> 10039
    //   10031: ldc2_w -2087529409
    //   10034: l2i
    //   10035: ldc_w -1399059886
    //   10038: ixor
    //   10039: ldc2_w -1211656903
    //   10042: l2i
    //   10043: ldc_w -1236135655
    //   10046: ixor
    //   10047: ixor
    //   10048: tableswitch default -> 10020, 781933132 -> 10072, 781933133 -> 10088
    //   10072: ldc_w 2.8424294
    //   10075: invokestatic floatToIntBits : (F)I
    //   10078: ldc_w 2138434141
    //   10081: ixor
    //   10082: invokestatic intBitsToFloat : (I)F
    //   10085: goto -> 10501
    //   10088: getstatic Perryc.1 : I
    //   10091: ifeq -> 10105
    //   10094: ldc2_w 381590897
    //   10097: l2i
    //   10098: ldc_w 1508714675
    //   10101: ixor
    //   10102: goto -> 10113
    //   10105: ldc2_w -1589401447
    //   10108: l2i
    //   10109: ldc_w 316778909
    //   10112: ixor
    //   10113: ldc2_w -1011618834
    //   10116: l2i
    //   10117: ldc_w -1614868493
    //   10120: ixor
    //   10121: ixor
    //   10122: lookupswitch default -> 10148, -251277439 -> 10105, 325013983 -> 24734
    //   10148: aload_1
    //   10149: getstatic Perryc.c : I
    //   10152: iflt -> 10166
    //   10155: ldc2_w 1924184934
    //   10158: l2i
    //   10159: ldc_w -763953155
    //   10162: ixor
    //   10163: goto -> 10174
    //   10166: ldc2_w -1926800075
    //   10169: l2i
    //   10170: ldc_w 2136631034
    //   10173: ixor
    //   10174: ldc2_w 68013283
    //   10177: l2i
    //   10178: ldc_w -1655891755
    //   10181: ixor
    //   10182: ixor
    //   10183: lookupswitch default -> 24812, 965120173 -> 10166, 1799221241 -> 10208
    //   10208: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   10211: getstatic Perryc.c : I
    //   10214: iflt -> 10228
    //   10217: ldc2_w -1759129947
    //   10220: l2i
    //   10221: ldc_w 181167480
    //   10224: ixor
    //   10225: goto -> 10236
    //   10228: ldc2_w 131017713
    //   10231: l2i
    //   10232: ldc_w 1642992238
    //   10235: ixor
    //   10236: ldc2_w 938037406
    //   10239: l2i
    //   10240: ldc_w -1476408293
    //   10243: ixor
    //   10244: ixor
    //   10245: lookupswitch default -> 24594, -164125414 -> 10272, 234829656 -> 10228
    //   10272: goto -> 10276
    //   10275: athrow
    //   10276: invokevirtual func_184586_b : (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
    //   10279: goto -> 10283
    //   10282: athrow
    //   10283: getstatic Perryc.c : I
    //   10286: iflt -> 10300
    //   10289: ldc2_w 1138078041
    //   10292: l2i
    //   10293: ldc_w -2119144215
    //   10296: ixor
    //   10297: goto -> 10308
    //   10300: ldc2_w -414501542
    //   10303: l2i
    //   10304: ldc_w 536086796
    //   10307: ixor
    //   10308: ldc2_w -1141368883
    //   10311: l2i
    //   10312: ldc_w 1753321162
    //   10315: ixor
    //   10316: ixor
    //   10317: lookupswitch default -> 10344, -672313312 -> 10300, 287065271 -> 24736
    //   10344: goto -> 10348
    //   10347: athrow
    //   10348: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   10351: goto -> 10355
    //   10354: athrow
    //   10355: getstatic Perryc.1 : I
    //   10358: ifeq -> 10372
    //   10361: ldc2_w -2021645803
    //   10364: l2i
    //   10365: ldc_w 2098947287
    //   10368: ixor
    //   10369: goto -> 10380
    //   10372: ldc2_w 1080395185
    //   10375: l2i
    //   10376: ldc_w -197922738
    //   10379: ixor
    //   10380: ldc2_w -1674562362
    //   10383: l2i
    //   10384: ldc_w -499889758
    //   10387: ixor
    //   10388: ixor
    //   10389: lookupswitch default -> 10416, -2069939290 -> 25012, 1176618980 -> 10372
    //   10416: getstatic net/minecraft/init/Items.field_151062_by : Lnet/minecraft/item/Item;
    //   10419: if_acmpne -> 10433
    //   10422: ldc2_w 136645559
    //   10425: l2i
    //   10426: ldc_w -632746502
    //   10429: ixor
    //   10430: goto -> 10441
    //   10433: ldc2_w -1563506374
    //   10436: l2i
    //   10437: ldc_w 1889718132
    //   10440: ixor
    //   10441: ldc2_w -352656120
    //   10444: l2i
    //   10445: ldc_w -850584060
    //   10448: ixor
    //   10449: ixor
    //   10450: tableswitch default -> 10422, -170132159 -> 10472, -170132158 -> 10488
    //   10472: ldc_w 23.272135
    //   10475: invokestatic floatToIntBits : (F)I
    //   10478: ldc_w 2130324821
    //   10481: ixor
    //   10482: invokestatic intBitsToFloat : (I)F
    //   10485: goto -> 10501
    //   10488: ldc_w 11.350156
    //   10491: invokestatic floatToIntBits : (F)I
    //   10494: ldc_w 2130025021
    //   10497: ixor
    //   10498: invokestatic intBitsToFloat : (I)F
    //   10501: fmul
    //   10502: f2d
    //   10503: dmul
    //   10504: getstatic Perryc.c : I
    //   10507: iflt -> 10521
    //   10510: ldc2_w -1507827997
    //   10513: l2i
    //   10514: ldc_w 1826187478
    //   10517: ixor
    //   10518: goto -> 10529
    //   10521: ldc2_w -14189877
    //   10524: l2i
    //   10525: ldc_w 1725500615
    //   10528: ixor
    //   10529: ldc2_w 499330637
    //   10532: l2i
    //   10533: ldc_w -1456697186
    //   10536: ixor
    //   10537: ixor
    //   10538: lookupswitch default -> 10564, 306676653 -> 10521, 2115406054 -> 24684
    //   10564: dstore #16
    //   10566: getstatic Perryc.0 : I
    //   10569: ifle -> 10583
    //   10572: ldc2_w -1589296063
    //   10575: l2i
    //   10576: ldc_w 837991037
    //   10579: ixor
    //   10580: goto -> 10591
    //   10583: ldc2_w 132820163
    //   10586: l2i
    //   10587: ldc_w -1084356872
    //   10590: ixor
    //   10591: ldc2_w -1701728717
    //   10594: l2i
    //   10595: ldc_w -1634285083
    //   10598: ixor
    //   10599: ixor
    //   10600: lookupswitch default -> 24850, -1800365590 -> 10583, -1129067027 -> 10628
    //   10628: dload #18
    //   10630: getstatic Perryc.0 : I
    //   10633: ifle -> 10647
    //   10636: ldc2_w -1932071191
    //   10639: l2i
    //   10640: ldc_w -2107540124
    //   10643: ixor
    //   10644: goto -> 10655
    //   10647: ldc2_w -1023828052
    //   10650: l2i
    //   10651: ldc_w -1685165388
    //   10654: ixor
    //   10655: ldc2_w -2017865498
    //   10658: l2i
    //   10659: ldc_w 2038735001
    //   10662: ixor
    //   10663: ixor
    //   10664: lookupswitch default -> 24574, -1488288409 -> 10692, -259333134 -> 10647
    //   10692: fload #25
    //   10694: getstatic Perryc.c : I
    //   10697: iflt -> 10711
    //   10700: ldc2_w 583267121
    //   10703: l2i
    //   10704: ldc_w 1983958378
    //   10707: ixor
    //   10708: goto -> 10719
    //   10711: ldc2_w -2114826952
    //   10714: l2i
    //   10715: ldc_w 1052461764
    //   10718: ixor
    //   10719: ldc2_w 1925127397
    //   10722: l2i
    //   10723: ldc_w 389584170
    //   10726: ixor
    //   10727: ixor
    //   10728: lookupswitch default -> 10756, 659297818 -> 10711, 822392724 -> 24760
    //   10756: aload #9
    //   10758: instanceof net/minecraft/item/ItemFishingRod
    //   10761: ifeq -> 10775
    //   10764: ldc2_w 783385511
    //   10767: l2i
    //   10768: ldc_w 300039226
    //   10771: ixor
    //   10772: goto -> 10783
    //   10775: ldc2_w 1320962169
    //   10778: l2i
    //   10779: ldc_w 1911551971
    //   10782: ixor
    //   10783: ldc2_w -378946757
    //   10786: l2i
    //   10787: ldc_w 349864749
    //   10790: ixor
    //   10791: ixor
    //   10792: tableswitch default -> 10764, -1025472629 -> 10816, -1025472628 -> 10832
    //   10816: ldc_w 3.9191964
    //   10819: invokestatic floatToIntBits : (F)I
    //   10822: ldc_w 2134561821
    //   10825: ixor
    //   10826: invokestatic intBitsToFloat : (I)F
    //   10829: goto -> 11245
    //   10832: getstatic Perryc.1 : I
    //   10835: ifeq -> 10849
    //   10838: ldc2_w 1671218760
    //   10841: l2i
    //   10842: ldc_w -1283689915
    //   10845: ixor
    //   10846: goto -> 10857
    //   10849: ldc2_w -755133453
    //   10852: l2i
    //   10853: ldc_w 344001580
    //   10856: ixor
    //   10857: ldc2_w 581434397
    //   10860: l2i
    //   10861: ldc_w -1977861400
    //   10864: ixor
    //   10865: ixor
    //   10866: lookupswitch default -> 10892, -471749221 -> 10849, 2019259128 -> 25016
    //   10892: aload_1
    //   10893: getstatic Perryc.c : I
    //   10896: iflt -> 10910
    //   10899: ldc2_w -2098917204
    //   10902: l2i
    //   10903: ldc_w 5289007
    //   10906: ixor
    //   10907: goto -> 10918
    //   10910: ldc2_w 1580133470
    //   10913: l2i
    //   10914: ldc_w -283853965
    //   10917: ixor
    //   10918: ldc2_w 16819370
    //   10921: l2i
    //   10922: ldc_w -566328135
    //   10925: ixor
    //   10926: ixor
    //   10927: lookupswitch default -> 10952, -1675780237 -> 10910, 1569424528 -> 24706
    //   10952: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   10955: getstatic Perryc.1 : I
    //   10958: ifeq -> 10972
    //   10961: ldc2_w -1644563955
    //   10964: l2i
    //   10965: ldc_w 461738013
    //   10968: ixor
    //   10969: goto -> 10980
    //   10972: ldc2_w -1413192073
    //   10975: l2i
    //   10976: ldc_w 1995138907
    //   10979: ixor
    //   10980: ldc2_w 534265637
    //   10983: l2i
    //   10984: ldc_w -1696917292
    //   10987: ixor
    //   10988: ixor
    //   10989: lookupswitch default -> 11016, -158292390 -> 10972, 58672609 -> 24652
    //   11016: goto -> 11020
    //   11019: athrow
    //   11020: invokevirtual func_184586_b : (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
    //   11023: goto -> 11027
    //   11026: athrow
    //   11027: getstatic Perryc.1 : I
    //   11030: ifeq -> 11044
    //   11033: ldc2_w 2114178726
    //   11036: l2i
    //   11037: ldc_w 1059143661
    //   11040: ixor
    //   11041: goto -> 11052
    //   11044: ldc2_w -631612728
    //   11047: l2i
    //   11048: ldc_w -310187882
    //   11051: ixor
    //   11052: ldc2_w -1892597719
    //   11055: l2i
    //   11056: ldc_w 2041332351
    //   11059: ixor
    //   11060: ixor
    //   11061: lookupswitch default -> 11088, -1212157155 -> 24556, 1658233194 -> 11044
    //   11088: goto -> 11092
    //   11091: athrow
    //   11092: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   11095: goto -> 11099
    //   11098: athrow
    //   11099: getstatic Perryc.1 : I
    //   11102: ifeq -> 11116
    //   11105: ldc2_w -859699185
    //   11108: l2i
    //   11109: ldc_w -822661996
    //   11112: ixor
    //   11113: goto -> 11124
    //   11116: ldc2_w -84113437
    //   11119: l2i
    //   11120: ldc_w -807013195
    //   11123: ixor
    //   11124: ldc2_w -371819607
    //   11127: l2i
    //   11128: ldc_w 560897225
    //   11131: ixor
    //   11132: ixor
    //   11133: lookupswitch default -> 24862, -896678917 -> 11116, -39742410 -> 11160
    //   11160: getstatic net/minecraft/init/Items.field_151062_by : Lnet/minecraft/item/Item;
    //   11163: if_acmpne -> 11177
    //   11166: ldc2_w -156741680
    //   11169: l2i
    //   11170: ldc_w 2014972561
    //   11173: ixor
    //   11174: goto -> 11185
    //   11177: ldc2_w -13312928
    //   11180: l2i
    //   11181: ldc_w 1904646432
    //   11184: ixor
    //   11185: ldc2_w -1070746300
    //   11188: l2i
    //   11189: ldc_w 1177461693
    //   11192: ixor
    //   11193: ixor
    //   11194: tableswitch default -> 11166, 145839032 -> 11216, 145839033 -> 11232
    //   11216: ldc_w 2.962917
    //   11219: invokestatic floatToIntBits : (F)I
    //   11222: ldc_w 2138939503
    //   11225: ixor
    //   11226: invokestatic intBitsToFloat : (I)F
    //   11229: goto -> 11245
    //   11232: ldc_w 24.867414
    //   11235: invokestatic floatToIntBits : (F)I
    //   11238: ldc_w 2114383991
    //   11241: ixor
    //   11242: invokestatic intBitsToFloat : (I)F
    //   11245: fmul
    //   11246: f2d
    //   11247: dmul
    //   11248: getstatic Perryc.0 : I
    //   11251: ifle -> 11265
    //   11254: ldc2_w 968415207
    //   11257: l2i
    //   11258: ldc_w 1001260252
    //   11261: ixor
    //   11262: goto -> 11273
    //   11265: ldc2_w 2062855690
    //   11268: l2i
    //   11269: ldc_w -1193148542
    //   11272: ixor
    //   11273: ldc2_w -915595652
    //   11276: l2i
    //   11277: ldc_w -1813302690
    //   11280: ixor
    //   11281: ixor
    //   11282: lookupswitch default -> 11308, 1485897497 -> 24614, 1793531814 -> 11265
    //   11308: dstore #18
    //   11310: getstatic Perryc.c : I
    //   11313: iflt -> 11327
    //   11316: ldc2_w 1457631634
    //   11319: l2i
    //   11320: ldc_w 397297922
    //   11323: ixor
    //   11324: goto -> 11335
    //   11327: ldc2_w 874037279
    //   11330: l2i
    //   11331: ldc_w 991913625
    //   11334: ixor
    //   11335: ldc2_w -1068518565
    //   11338: l2i
    //   11339: ldc_w -118294273
    //   11342: ixor
    //   11343: ixor
    //   11344: lookupswitch default -> 25078, 934997282 -> 11372, 2045948724 -> 11327
    //   11372: dload #20
    //   11374: getstatic Perryc.0 : I
    //   11377: ifle -> 11391
    //   11380: ldc2_w -204079236
    //   11383: l2i
    //   11384: ldc_w -692027977
    //   11387: ixor
    //   11388: goto -> 11399
    //   11391: ldc2_w 2130209207
    //   11394: l2i
    //   11395: ldc_w 1618529838
    //   11398: ixor
    //   11399: ldc2_w -1417355384
    //   11402: l2i
    //   11403: ldc_w 291046366
    //   11406: ixor
    //   11407: ixor
    //   11408: lookupswitch default -> 11436, -1614258531 -> 24750, 789267948 -> 11391
    //   11436: fload #25
    //   11438: getstatic Perryc.c : I
    //   11441: iflt -> 11455
    //   11444: ldc2_w -524411372
    //   11447: l2i
    //   11448: ldc_w -1863285235
    //   11451: ixor
    //   11452: goto -> 11463
    //   11455: ldc2_w 379191108
    //   11458: l2i
    //   11459: ldc_w 830189209
    //   11462: ixor
    //   11463: ldc2_w 310566792
    //   11466: l2i
    //   11467: ldc_w -541227545
    //   11470: ixor
    //   11471: ixor
    //   11472: lookupswitch default -> 24562, -1116618122 -> 11455, -354612302 -> 11500
    //   11500: aload #9
    //   11502: instanceof net/minecraft/item/ItemFishingRod
    //   11505: ifeq -> 11519
    //   11508: ldc2_w -631102787
    //   11511: l2i
    //   11512: ldc_w -1980950183
    //   11515: ixor
    //   11516: goto -> 11527
    //   11519: ldc2_w -970907946
    //   11522: l2i
    //   11523: ldc_w -1783749327
    //   11526: ixor
    //   11527: ldc2_w -1976503694
    //   11530: l2i
    //   11531: ldc_w 1355127467
    //   11534: ixor
    //   11535: ixor
    //   11536: tableswitch default -> 11508, -1988472003 -> 11560, -1988472002 -> 11576
    //   11560: ldc_w 2.8169277
    //   11563: invokestatic floatToIntBits : (F)I
    //   11566: ldc_w 2138327179
    //   11569: ixor
    //   11570: invokestatic intBitsToFloat : (I)F
    //   11573: goto -> 11989
    //   11576: getstatic Perryc.0 : I
    //   11579: ifle -> 11593
    //   11582: ldc2_w -1068180089
    //   11585: l2i
    //   11586: ldc_w 1064636465
    //   11589: ixor
    //   11590: goto -> 11601
    //   11593: ldc2_w -1893810466
    //   11596: l2i
    //   11597: ldc_w 2135679112
    //   11600: ixor
    //   11601: ldc2_w -1128219730
    //   11604: l2i
    //   11605: ldc_w -469607323
    //   11608: ixor
    //   11609: ixor
    //   11610: lookupswitch default -> 24570, -1478284675 -> 11593, -1466451555 -> 11636
    //   11636: aload_1
    //   11637: getstatic Perryc.c : I
    //   11640: iflt -> 11654
    //   11643: ldc2_w -2072592828
    //   11646: l2i
    //   11647: ldc_w -1977108189
    //   11650: ixor
    //   11651: goto -> 11662
    //   11654: ldc2_w 530501758
    //   11657: l2i
    //   11658: ldc_w -1810773378
    //   11661: ixor
    //   11662: ldc2_w -873281088
    //   11665: l2i
    //   11666: ldc_w -1664961105
    //   11669: ixor
    //   11670: ixor
    //   11671: lookupswitch default -> 11696, -320336604 -> 11654, 1499560712 -> 24584
    //   11696: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   11699: getstatic Perryc.c : I
    //   11702: iflt -> 11716
    //   11705: ldc2_w -902278402
    //   11708: l2i
    //   11709: ldc_w 590521263
    //   11712: ixor
    //   11713: goto -> 11724
    //   11716: ldc2_w -197501553
    //   11719: l2i
    //   11720: ldc_w 858736300
    //   11723: ixor
    //   11724: ldc2_w 1751347147
    //   11727: l2i
    //   11728: ldc_w 399872854
    //   11731: ixor
    //   11732: ixor
    //   11733: lookupswitch default -> 25030, -1766060596 -> 11716, -1197217858 -> 11760
    //   11760: goto -> 11764
    //   11763: athrow
    //   11764: invokevirtual func_184586_b : (Lnet/minecraft/util/EnumHand;)Lnet/minecraft/item/ItemStack;
    //   11767: goto -> 11771
    //   11770: athrow
    //   11771: getstatic Perryc.1 : I
    //   11774: ifeq -> 11788
    //   11777: ldc2_w 1530707576
    //   11780: l2i
    //   11781: ldc_w 2019522519
    //   11784: ixor
    //   11785: goto -> 11796
    //   11788: ldc2_w 1794569308
    //   11791: l2i
    //   11792: ldc_w 32898277
    //   11795: ixor
    //   11796: ldc2_w -963062788
    //   11799: l2i
    //   11800: ldc_w 2121572079
    //   11803: ixor
    //   11804: ixor
    //   11805: lookupswitch default -> 24526, -1685093188 -> 11788, -739293782 -> 11832
    //   11832: goto -> 11836
    //   11835: athrow
    //   11836: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   11839: goto -> 11843
    //   11842: athrow
    //   11843: getstatic Perryc.0 : I
    //   11846: ifle -> 11860
    //   11849: ldc2_w 1795719444
    //   11852: l2i
    //   11853: ldc_w 542766579
    //   11856: ixor
    //   11857: goto -> 11868
    //   11860: ldc2_w -1518878242
    //   11863: l2i
    //   11864: ldc_w -861140022
    //   11867: ixor
    //   11868: ldc2_w -1718729669
    //   11871: l2i
    //   11872: ldc_w 470448608
    //   11875: ixor
    //   11876: ixor
    //   11877: lookupswitch default -> 11904, -824882884 -> 24622, -659656379 -> 11860
    //   11904: getstatic net/minecraft/init/Items.field_151062_by : Lnet/minecraft/item/Item;
    //   11907: if_acmpne -> 11921
    //   11910: ldc2_w 2075967320
    //   11913: l2i
    //   11914: ldc_w -1575282104
    //   11917: ixor
    //   11918: goto -> 11929
    //   11921: ldc2_w 1928648779
    //   11924: l2i
    //   11925: ldc_w -1420591804
    //   11928: ixor
    //   11929: ldc2_w 868075446
    //   11932: l2i
    //   11933: ldc_w -1539991799
    //   11936: ixor
    //   11937: ixor
    //   11938: tableswitch default -> 11910, 1311765935 -> 11960, 1311765936 -> 11976
    //   11960: ldc_w 2.3724134
    //   11963: invokestatic floatToIntBits : (F)I
    //   11966: ldc_w 2136462751
    //   11969: ixor
    //   11970: invokestatic intBitsToFloat : (I)F
    //   11973: goto -> 11989
    //   11976: ldc_w 57.624264
    //   11979: invokestatic floatToIntBits : (F)I
    //   11982: ldc_w 2108063551
    //   11985: ixor
    //   11986: invokestatic intBitsToFloat : (I)F
    //   11989: fmul
    //   11990: f2d
    //   11991: dmul
    //   11992: getstatic Perryc.c : I
    //   11995: iflt -> 12009
    //   11998: ldc2_w 625770624
    //   12001: l2i
    //   12002: ldc_w -71179004
    //   12005: ixor
    //   12006: goto -> 12017
    //   12009: ldc2_w 1495087935
    //   12012: l2i
    //   12013: ldc_w -1562154537
    //   12016: ixor
    //   12017: ldc2_w 1486200694
    //   12020: l2i
    //   12021: ldc_w -845819749
    //   12024: ixor
    //   12025: ixor
    //   12026: lookupswitch default -> 24544, 1267542633 -> 12009, 1862147333 -> 12052
    //   12052: dstore #20
    //   12054: getstatic Perryc.1 : I
    //   12057: ifeq -> 12071
    //   12060: ldc2_w 1173280470
    //   12063: l2i
    //   12064: ldc_w -1186579998
    //   12067: ixor
    //   12068: goto -> 12079
    //   12071: ldc2_w -1122574463
    //   12074: l2i
    //   12075: ldc_w 1201165469
    //   12078: ixor
    //   12079: ldc2_w -424051176
    //   12082: l2i
    //   12083: ldc_w -815130235
    //   12086: ixor
    //   12087: ixor
    //   12088: lookupswitch default -> 12116, -713324375 -> 24826, 1431610031 -> 12071
    //   12116: aload_0
    //   12117: ldc_w 0.8345144
    //   12120: invokestatic floatToIntBits : (F)I
    //   12123: ldc_w 2136318652
    //   12126: ixor
    //   12127: invokestatic intBitsToFloat : (I)F
    //   12130: getstatic Perryc.c : I
    //   12133: iflt -> 12147
    //   12136: ldc2_w 970315127
    //   12139: l2i
    //   12140: ldc_w 1805173599
    //   12143: ixor
    //   12144: goto -> 12155
    //   12147: ldc2_w -933637218
    //   12150: l2i
    //   12151: ldc_w 61107059
    //   12154: ixor
    //   12155: ldc2_w 2081898868
    //   12158: l2i
    //   12159: ldc_w -1155543010
    //   12162: ixor
    //   12163: ixor
    //   12164: lookupswitch default -> 24970, -1790605502 -> 12147, 217393543 -> 12192
    //   12192: goto -> 12196
    //   12195: athrow
    //   12196: invokevirtual enableGL3D : (F)V
    //   12199: goto -> 12203
    //   12202: athrow
    //   12203: getstatic Perryc.0 : I
    //   12206: ifle -> 12220
    //   12209: ldc2_w -984487819
    //   12212: l2i
    //   12213: ldc_w 530370556
    //   12216: ixor
    //   12217: goto -> 12228
    //   12220: ldc2_w 1270029803
    //   12223: l2i
    //   12224: ldc_w 1494222027
    //   12227: ixor
    //   12228: ldc2_w 1384229502
    //   12231: l2i
    //   12232: ldc_w -1814315292
    //   12235: ixor
    //   12236: ixor
    //   12237: lookupswitch default -> 24882, -738652742 -> 12264, 462893843 -> 12220
    //   12264: fload #23
    //   12266: ldc_w 2.0334997
    //   12269: invokestatic floatToIntBits : (F)I
    //   12272: ldc_w 2132524358
    //   12275: ixor
    //   12276: invokestatic intBitsToFloat : (I)F
    //   12279: fcmpl
    //   12280: ifle -> 12294
    //   12283: ldc2_w -457797679
    //   12286: l2i
    //   12287: ldc_w 202709966
    //   12290: ixor
    //   12291: goto -> 12302
    //   12294: ldc2_w 125182034
    //   12297: l2i
    //   12298: ldc_w -271207350
    //   12301: ixor
    //   12302: ldc2_w 1410675993
    //   12305: l2i
    //   12306: ldc_w -639630851
    //   12309: ixor
    //   12310: ixor
    //   12311: tableswitch default -> 12283, 1700176123 -> 12332, 1700176124 -> 12458
    //   12332: ldc_w 1.895775E38
    //   12335: invokestatic floatToIntBits : (F)I
    //   12338: ldc_w 2131664716
    //   12341: ixor
    //   12342: invokestatic intBitsToFloat : (I)F
    //   12345: ldc_w 19.025747
    //   12348: invokestatic floatToIntBits : (F)I
    //   12351: ldc_w 2115515579
    //   12354: ixor
    //   12355: invokestatic intBitsToFloat : (I)F
    //   12358: ldc_w 2.0096196E37
    //   12361: invokestatic floatToIntBits : (F)I
    //   12364: ldc_w 2104616495
    //   12367: ixor
    //   12368: invokestatic intBitsToFloat : (I)F
    //   12371: ldc_w 5.539037
    //   12374: invokestatic floatToIntBits : (F)I
    //   12377: ldc_w 2133934027
    //   12380: ixor
    //   12381: invokestatic intBitsToFloat : (I)F
    //   12384: getstatic Perryc.1 : I
    //   12387: ifeq -> 12401
    //   12390: ldc2_w 789378030
    //   12393: l2i
    //   12394: ldc_w 670606841
    //   12397: ixor
    //   12398: goto -> 12409
    //   12401: ldc2_w -1707126309
    //   12404: l2i
    //   12405: ldc_w -559550731
    //   12408: ixor
    //   12409: ldc2_w -1997911698
    //   12412: l2i
    //   12413: ldc_w -2012379845
    //   12416: ixor
    //   12417: ixor
    //   12418: lookupswitch default -> 12444, -1316249242 -> 12401, 135502402 -> 24694
    //   12444: goto -> 12448
    //   12447: athrow
    //   12448: invokestatic func_179131_c : (FFFF)V
    //   12451: goto -> 12455
    //   12454: athrow
    //   12455: goto -> 12583
    //   12458: ldc_w 9.832399
    //   12461: invokestatic floatToIntBits : (F)I
    //   12464: ldc_w 2119277903
    //   12467: ixor
    //   12468: invokestatic intBitsToFloat : (I)F
    //   12471: ldc_w 11.573703
    //   12474: invokestatic floatToIntBits : (F)I
    //   12477: ldc_w 2117676515
    //   12480: ixor
    //   12481: invokestatic intBitsToFloat : (I)F
    //   12484: ldc_w 2.9220953E38
    //   12487: invokestatic floatToIntBits : (F)I
    //   12490: ldc_w 2136724866
    //   12493: ixor
    //   12494: invokestatic intBitsToFloat : (I)F
    //   12497: ldc_w 4.066167
    //   12500: invokestatic floatToIntBits : (F)I
    //   12503: ldc_w 2130845194
    //   12506: ixor
    //   12507: invokestatic intBitsToFloat : (I)F
    //   12510: getstatic Perryc.0 : I
    //   12513: ifle -> 12527
    //   12516: ldc2_w 618000137
    //   12519: l2i
    //   12520: ldc_w -432591037
    //   12523: ixor
    //   12524: goto -> 12535
    //   12527: ldc2_w -427260606
    //   12530: l2i
    //   12531: ldc_w -656266423
    //   12534: ixor
    //   12535: ldc2_w -1951016143
    //   12538: l2i
    //   12539: ldc_w -1526941638
    //   12542: ixor
    //   12543: ixor
    //   12544: lookupswitch default -> 25076, -307518655 -> 12527, 287558912 -> 12572
    //   12572: goto -> 12576
    //   12575: athrow
    //   12576: invokestatic func_179131_c : (FFFF)V
    //   12579: goto -> 12583
    //   12582: athrow
    //   12583: ldc2_w 753995690
    //   12586: l2i
    //   12587: ldc_w 753992842
    //   12590: ixor
    //   12591: getstatic Perryc.c : I
    //   12594: iflt -> 12608
    //   12597: ldc2_w -469437383
    //   12600: l2i
    //   12601: ldc_w 1659512680
    //   12604: ixor
    //   12605: goto -> 12616
    //   12608: ldc2_w -302334567
    //   12611: l2i
    //   12612: ldc_w -1131445092
    //   12615: ixor
    //   12616: ldc2_w -609215679
    //   12619: l2i
    //   12620: ldc_w 299019159
    //   12623: ixor
    //   12624: ixor
    //   12625: lookupswitch default -> 12652, 208086850 -> 12608, 1284268935 -> 24528
    //   12652: goto -> 12656
    //   12655: athrow
    //   12656: invokestatic glEnable : (I)V
    //   12659: goto -> 12663
    //   12662: athrow
    //   12663: getstatic Perryc.1 : I
    //   12666: ifeq -> 12680
    //   12669: ldc2_w 570099752
    //   12672: l2i
    //   12673: ldc_w -1238050981
    //   12676: ixor
    //   12677: goto -> 12688
    //   12680: ldc2_w -640627182
    //   12683: l2i
    //   12684: ldc_w 646986569
    //   12687: ixor
    //   12688: ldc2_w -1213031663
    //   12691: l2i
    //   12692: ldc_w 59801621
    //   12695: ixor
    //   12696: ixor
    //   12697: lookupswitch default -> 24752, 602784887 -> 12680, 1264774751 -> 12724
    //   12724: aload #9
    //   12726: instanceof net/minecraft/item/ItemBow
    //   12729: ifeq -> 12743
    //   12732: ldc2_w 948328252
    //   12735: l2i
    //   12736: ldc_w -617749001
    //   12739: ixor
    //   12740: goto -> 12751
    //   12743: ldc2_w -1109694136
    //   12746: l2i
    //   12747: ldc_w 1584454530
    //   12750: ixor
    //   12751: ldc2_w 1413318703
    //   12754: l2i
    //   12755: ldc_w -1715312558
    //   12758: ixor
    //   12759: ixor
    //   12760: tableswitch default -> 12732, 777278134 -> 12784, 777278135 -> 12800
    //   12784: ldc2_w 18.470946696043857
    //   12787: invokestatic doubleToLongBits : (D)J
    //   12790: ldc2_w 9214729586712156634
    //   12793: lxor
    //   12794: invokestatic longBitsToDouble : (J)D
    //   12797: goto -> 12813
    //   12800: ldc2_w 500.0843060121187
    //   12803: invokestatic doubleToLongBits : (D)J
    //   12806: ldc2_w 9200644415612440191
    //   12809: lxor
    //   12810: invokestatic longBitsToDouble : (J)D
    //   12813: d2f
    //   12814: getstatic Perryc.c : I
    //   12817: iflt -> 12831
    //   12820: ldc2_w 398816194
    //   12823: l2i
    //   12824: ldc_w 16751950
    //   12827: ixor
    //   12828: goto -> 12839
    //   12831: ldc2_w -1681283573
    //   12834: l2i
    //   12835: ldc_w 1627234980
    //   12838: ixor
    //   12839: ldc2_w -395614072
    //   12842: l2i
    //   12843: ldc_w -77873910
    //   12846: ixor
    //   12847: ixor
    //   12848: lookupswitch default -> 24472, -402337491 -> 12876, 67779342 -> 12831
    //   12876: fstore #26
    //   12878: ldc2_w 2117475157
    //   12881: l2i
    //   12882: ldc_w 2117475157
    //   12885: ixor
    //   12886: getstatic Perryc.0 : I
    //   12889: ifle -> 12903
    //   12892: ldc2_w 328880872
    //   12895: l2i
    //   12896: ldc_w -1934552193
    //   12899: ixor
    //   12900: goto -> 12911
    //   12903: ldc2_w -910840618
    //   12906: l2i
    //   12907: ldc_w 1163805143
    //   12910: ixor
    //   12911: ldc2_w -190234509
    //   12914: l2i
    //   12915: ldc_w 1426822480
    //   12918: ixor
    //   12919: ixor
    //   12920: lookupswitch default -> 12948, -1342563115 -> 12903, 1049203892 -> 24572
    //   12948: istore #27
    //   12950: aconst_null
    //   12951: getstatic Perryc.0 : I
    //   12954: ifle -> 12968
    //   12957: ldc2_w -423998312
    //   12960: l2i
    //   12961: ldc_w 658049674
    //   12964: ixor
    //   12965: goto -> 12976
    //   12968: ldc2_w -1679251276
    //   12971: l2i
    //   12972: ldc_w -1741009083
    //   12975: ixor
    //   12976: ldc2_w 2078239420
    //   12979: l2i
    //   12980: ldc_w 250808756
    //   12983: ixor
    //   12984: ixor
    //   12985: lookupswitch default -> 13012, -1263590118 -> 24522, 1333572655 -> 12968
    //   13012: astore #28
    //   13014: aconst_null
    //   13015: getstatic Perryc.1 : I
    //   13018: ifeq -> 13032
    //   13021: ldc2_w 257760486
    //   13024: l2i
    //   13025: ldc_w 849081364
    //   13028: ixor
    //   13029: goto -> 13040
    //   13032: ldc2_w -1481171443
    //   13035: l2i
    //   13036: ldc_w -974910583
    //   13039: ixor
    //   13040: ldc2_w -1241607389
    //   13043: l2i
    //   13044: ldc_w 1767625472
    //   13047: ixor
    //   13048: ixor
    //   13049: lookupswitch default -> 13076, -1242008132 -> 13032, -513562415 -> 24990
    //   13076: astore #29
    //   13078: getstatic Perryc.1 : I
    //   13081: ifeq -> 13095
    //   13084: ldc2_w 209937496
    //   13087: l2i
    //   13088: ldc_w -1376637459
    //   13091: ixor
    //   13092: goto -> 13103
    //   13095: ldc2_w 600242016
    //   13098: l2i
    //   13099: ldc_w -96761920
    //   13102: ixor
    //   13103: ldc2_w 1136159068
    //   13106: l2i
    //   13107: ldc_w -656018886
    //   13110: ixor
    //   13111: ixor
    //   13112: lookupswitch default -> 13140, 976016083 -> 24830, 1420911104 -> 13095
    //   13140: iload #27
    //   13142: ifne -> 13156
    //   13145: ldc2_w 7653450
    //   13148: l2i
    //   13149: ldc_w 270838877
    //   13152: ixor
    //   13153: goto -> 13164
    //   13156: ldc2_w -58325353
    //   13159: l2i
    //   13160: ldc_w -321494393
    //   13163: ixor
    //   13164: ldc2_w -869580977
    //   13167: l2i
    //   13168: ldc_w 1731642235
    //   13171: ixor
    //   13172: ixor
    //   13173: tableswitch default -> 13145, -1152542685 -> 13196, -1152542684 -> 20857
    //   13196: getstatic Perryc.c : I
    //   13199: iflt -> 13213
    //   13202: ldc2_w 1075208349
    //   13205: l2i
    //   13206: ldc_w 27615346
    //   13209: ixor
    //   13210: goto -> 13221
    //   13213: ldc2_w 1013437020
    //   13216: l2i
    //   13217: ldc_w 1196931691
    //   13220: ixor
    //   13221: ldc2_w -1561046711
    //   13224: l2i
    //   13225: ldc_w -323890729
    //   13228: ixor
    //   13229: ixor
    //   13230: lookupswitch default -> 13256, 252274761 -> 13213, 267812977 -> 24820
    //   13256: dload #12
    //   13258: ldc2_w 4.1945940114449735E307
    //   13261: invokestatic doubleToLongBits : (D)J
    //   13264: ldc2_w 9209260711318744459
    //   13267: lxor
    //   13268: invokestatic longBitsToDouble : (J)D
    //   13271: dcmpl
    //   13272: ifle -> 13286
    //   13275: ldc2_w 1353173208
    //   13278: l2i
    //   13279: ldc_w -2083913257
    //   13282: ixor
    //   13283: goto -> 13294
    //   13286: ldc2_w -1505568004
    //   13289: l2i
    //   13290: ldc_w 1966019572
    //   13293: ixor
    //   13294: ldc2_w -503407595
    //   13297: l2i
    //   13298: ldc_w 329723969
    //   13301: ixor
    //   13302: ixor
    //   13303: tableswitch default -> 13275, 557081947 -> 13324, 557081948 -> 20857
    //   13324: new net/minecraft/util/math/Vec3d
    //   13327: dup
    //   13328: getstatic Perryc.0 : I
    //   13331: ifle -> 13345
    //   13334: ldc2_w 987930243
    //   13337: l2i
    //   13338: ldc_w 2049614126
    //   13341: ixor
    //   13342: goto -> 13353
    //   13345: ldc2_w 287014528
    //   13348: l2i
    //   13349: ldc_w -2022214010
    //   13352: ixor
    //   13353: ldc2_w 602484631
    //   13356: l2i
    //   13357: ldc_w 783214108
    //   13360: ixor
    //   13361: ixor
    //   13362: lookupswitch default -> 24680, -1691631219 -> 13388, 1301280294 -> 13345
    //   13388: dload #10
    //   13390: getstatic Perryc.1 : I
    //   13393: ifeq -> 13407
    //   13396: ldc2_w 1338382950
    //   13399: l2i
    //   13400: ldc_w 1361821013
    //   13403: ixor
    //   13404: goto -> 13415
    //   13407: ldc2_w 1738396244
    //   13410: l2i
    //   13411: ldc_w 270816636
    //   13414: ixor
    //   13415: ldc2_w -1685521338
    //   13418: l2i
    //   13419: ldc_w 257522498
    //   13422: ixor
    //   13423: ixor
    //   13424: lookupswitch default -> 24638, -1975771081 -> 13407, -479723476 -> 13452
    //   13452: dload #12
    //   13454: getstatic Perryc.0 : I
    //   13457: ifle -> 13471
    //   13460: ldc2_w 1885695475
    //   13463: l2i
    //   13464: ldc_w -441799718
    //   13467: ixor
    //   13468: goto -> 13479
    //   13471: ldc2_w -1163861196
    //   13474: l2i
    //   13475: ldc_w 2011731121
    //   13478: ixor
    //   13479: ldc2_w -1420712103
    //   13482: l2i
    //   13483: ldc_w 663046141
    //   13486: ixor
    //   13487: ixor
    //   13488: lookupswitch default -> 13516, -20711423 -> 13471, 421209741 -> 24816
    //   13516: dload #14
    //   13518: getstatic Perryc.0 : I
    //   13521: ifle -> 13535
    //   13524: ldc2_w -2103916085
    //   13527: l2i
    //   13528: ldc_w -295180473
    //   13531: ixor
    //   13532: goto -> 13543
    //   13535: ldc2_w -661989022
    //   13538: l2i
    //   13539: ldc_w 39029210
    //   13542: ixor
    //   13543: ldc2_w -1055239313
    //   13546: l2i
    //   13547: ldc_w -1313265798
    //   13550: ixor
    //   13551: ixor
    //   13552: lookupswitch default -> 24922, -1434835795 -> 13580, 475814553 -> 13535
    //   13580: goto -> 13584
    //   13583: athrow
    //   13584: invokespecial <init> : (DDD)V
    //   13587: goto -> 13591
    //   13590: athrow
    //   13591: getstatic Perryc.c : I
    //   13594: iflt -> 13608
    //   13597: ldc2_w -1926822549
    //   13600: l2i
    //   13601: ldc_w 930252676
    //   13604: ixor
    //   13605: goto -> 13616
    //   13608: ldc2_w 549718095
    //   13611: l2i
    //   13612: ldc_w 1866038232
    //   13615: ixor
    //   13616: ldc2_w -602018947
    //   13619: l2i
    //   13620: ldc_w 1871691485
    //   13623: ixor
    //   13624: ixor
    //   13625: lookupswitch default -> 24956, -59824585 -> 13652, 164091727 -> 13608
    //   13652: astore #30
    //   13654: new net/minecraft/util/math/Vec3d
    //   13657: dup
    //   13658: getstatic Perryc.c : I
    //   13661: iflt -> 13675
    //   13664: ldc2_w 1728900327
    //   13667: l2i
    //   13668: ldc_w 755939423
    //   13671: ixor
    //   13672: goto -> 13683
    //   13675: ldc2_w 1676452759
    //   13678: l2i
    //   13679: ldc_w -761218522
    //   13682: ixor
    //   13683: ldc2_w -1248640097
    //   13686: l2i
    //   13687: ldc_w -864394464
    //   13690: ixor
    //   13691: ixor
    //   13692: lookupswitch default -> 24726, -928696050 -> 13720, 871068679 -> 13675
    //   13720: dload #10
    //   13722: getstatic Perryc.1 : I
    //   13725: ifeq -> 13739
    //   13728: ldc2_w -2129237494
    //   13731: l2i
    //   13732: ldc_w 1818558692
    //   13735: ixor
    //   13736: goto -> 13747
    //   13739: ldc2_w 2146920044
    //   13742: l2i
    //   13743: ldc_w 842624135
    //   13746: ixor
    //   13747: ldc2_w 1939160986
    //   13750: l2i
    //   13751: ldc_w -990995491
    //   13754: ixor
    //   13755: ixor
    //   13756: lookupswitch default -> 13784, -50692492 -> 13739, 1510526633 -> 24586
    //   13784: dload #16
    //   13786: dadd
    //   13787: getstatic Perryc.0 : I
    //   13790: ifle -> 13804
    //   13793: ldc2_w -479005748
    //   13796: l2i
    //   13797: ldc_w 2050181792
    //   13800: ixor
    //   13801: goto -> 13812
    //   13804: ldc2_w -848217373
    //   13807: l2i
    //   13808: ldc_w 920431874
    //   13811: ixor
    //   13812: ldc2_w 1622961675
    //   13815: l2i
    //   13816: ldc_w 1552368652
    //   13819: ixor
    //   13820: ixor
    //   13821: lookupswitch default -> 13848, -1518693525 -> 24546, -948462824 -> 13804
    //   13848: dload #12
    //   13850: getstatic Perryc.1 : I
    //   13853: ifeq -> 13867
    //   13856: ldc2_w 639250106
    //   13859: l2i
    //   13860: ldc_w 1946507061
    //   13863: ixor
    //   13864: goto -> 13875
    //   13867: ldc2_w -1241114322
    //   13870: l2i
    //   13871: ldc_w -602761841
    //   13874: ixor
    //   13875: ldc2_w 996471352
    //   13878: l2i
    //   13879: ldc_w -484522115
    //   13882: ixor
    //   13883: ixor
    //   13884: lookupswitch default -> 24590, -1973072694 -> 13867, -1301366300 -> 13912
    //   13912: dload #18
    //   13914: dadd
    //   13915: getstatic Perryc.c : I
    //   13918: iflt -> 13932
    //   13921: ldc2_w 1620165829
    //   13924: l2i
    //   13925: ldc_w -1013137002
    //   13928: ixor
    //   13929: goto -> 13940
    //   13932: ldc2_w -307204840
    //   13935: l2i
    //   13936: ldc_w -208329631
    //   13939: ixor
    //   13940: ldc2_w -196480540
    //   13943: l2i
    //   13944: ldc_w -118220883
    //   13947: ixor
    //   13948: ixor
    //   13949: lookupswitch default -> 24806, -1347362022 -> 13932, 311996208 -> 13976
    //   13976: dload #14
    //   13978: getstatic Perryc.1 : I
    //   13981: ifeq -> 13995
    //   13984: ldc2_w 841802403
    //   13987: l2i
    //   13988: ldc_w 153531654
    //   13991: ixor
    //   13992: goto -> 14003
    //   13995: ldc2_w 1720282895
    //   13998: l2i
    //   13999: ldc_w -995683225
    //   14002: ixor
    //   14003: ldc2_w 664613928
    //   14006: l2i
    //   14007: ldc_w -1465616237
    //   14010: ixor
    //   14011: ixor
    //   14012: lookupswitch default -> 25044, -1271719138 -> 13995, 756496339 -> 14040
    //   14040: dload #20
    //   14042: dadd
    //   14043: getstatic Perryc.c : I
    //   14046: iflt -> 14060
    //   14049: ldc2_w 334691159
    //   14052: l2i
    //   14053: ldc_w -1429462333
    //   14056: ixor
    //   14057: goto -> 14068
    //   14060: ldc2_w -1128691040
    //   14063: l2i
    //   14064: ldc_w 361290569
    //   14067: ixor
    //   14068: ldc2_w 170440338
    //   14071: l2i
    //   14072: ldc_w 1239052563
    //   14075: ixor
    //   14076: ixor
    //   14077: lookupswitch default -> 24774, -356280728 -> 14104, -87286251 -> 14060
    //   14104: goto -> 14108
    //   14107: athrow
    //   14108: invokespecial <init> : (DDD)V
    //   14111: goto -> 14115
    //   14114: athrow
    //   14115: getstatic Perryc.1 : I
    //   14118: ifeq -> 14132
    //   14121: ldc2_w -1384482061
    //   14124: l2i
    //   14125: ldc_w -1991434478
    //   14128: ixor
    //   14129: goto -> 14140
    //   14132: ldc2_w -1165681454
    //   14135: l2i
    //   14136: ldc_w 1758687853
    //   14139: ixor
    //   14140: ldc2_w 1034769295
    //   14143: l2i
    //   14144: ldc_w -982655246
    //   14147: ixor
    //   14148: ixor
    //   14149: lookupswitch default -> 14176, -587906740 -> 14132, -587732836 -> 25024
    //   14176: astore #31
    //   14178: getstatic Perryc.c : I
    //   14181: iflt -> 14195
    //   14184: ldc2_w 438703336
    //   14187: l2i
    //   14188: ldc_w -310238449
    //   14191: ixor
    //   14192: goto -> 14203
    //   14195: ldc2_w 1951752665
    //   14198: l2i
    //   14199: ldc_w -1573033605
    //   14202: ixor
    //   14203: ldc2_w -1724854971
    //   14206: l2i
    //   14207: ldc_w 1003388383
    //   14210: ixor
    //   14211: ixor
    //   14212: lookupswitch default -> 14240, -1362589247 -> 14195, 1431996285 -> 24864
    //   14240: getstatic bigname/zprestige/webhack/features/modules/Render/Trajectories.mc : Lnet/minecraft/client/Minecraft;
    //   14243: getstatic Perryc.c : I
    //   14246: iflt -> 14260
    //   14249: ldc2_w -1931530576
    //   14252: l2i
    //   14253: ldc_w -1577026160
    //   14256: ixor
    //   14257: goto -> 14268
    //   14260: ldc2_w -642888656
    //   14263: l2i
    //   14264: ldc_w 1958537649
    //   14267: ixor
    //   14268: ldc2_w 265545778
    //   14271: l2i
    //   14272: ldc_w 950962702
    //   14275: ixor
    //   14276: ixor
    //   14277: lookupswitch default -> 25066, -1703950403 -> 14304, 430059804 -> 14260
    //   14304: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   14307: getstatic Perryc.c : I
    //   14310: iflt -> 14324
    //   14313: ldc2_w -933018334
    //   14316: l2i
    //   14317: ldc_w 10502687
    //   14320: ixor
    //   14321: goto -> 14332
    //   14324: ldc2_w 1864050097
    //   14327: l2i
    //   14328: ldc_w -1475948828
    //   14331: ixor
    //   14332: ldc2_w -1877881610
    //   14335: l2i
    //   14336: ldc_w 399657876
    //   14339: ixor
    //   14340: ixor
    //   14341: lookupswitch default -> 24692, 1088318519 -> 14368, 1325432927 -> 14324
    //   14368: aload #30
    //   14370: getstatic Perryc.c : I
    //   14373: iflt -> 14387
    //   14376: ldc2_w -802239140
    //   14379: l2i
    //   14380: ldc_w 756735084
    //   14383: ixor
    //   14384: goto -> 14395
    //   14387: ldc2_w 1000604202
    //   14390: l2i
    //   14391: ldc_w 562622604
    //   14394: ixor
    //   14395: ldc2_w -433929062
    //   14398: l2i
    //   14399: ldc_w 1268440037
    //   14402: ixor
    //   14403: ixor
    //   14404: lookupswitch default -> 14432, 1351355983 -> 24702, 1925417824 -> 14387
    //   14432: aload #31
    //   14434: ldc2_w -1207784387
    //   14437: l2i
    //   14438: ldc_w -1207784387
    //   14441: ixor
    //   14442: ldc2_w -2045264742
    //   14445: l2i
    //   14446: ldc_w -2045264741
    //   14449: ixor
    //   14450: ldc2_w -154674260
    //   14453: l2i
    //   14454: ldc_w -154674260
    //   14457: ixor
    //   14458: getstatic Perryc.c : I
    //   14461: iflt -> 14475
    //   14464: ldc2_w -180469872
    //   14467: l2i
    //   14468: ldc_w 564201473
    //   14471: ixor
    //   14472: goto -> 14483
    //   14475: ldc2_w 1163484073
    //   14478: l2i
    //   14479: ldc_w -679758445
    //   14482: ixor
    //   14483: ldc2_w 112910495
    //   14486: l2i
    //   14487: ldc_w 751543597
    //   14490: ixor
    //   14491: ixor
    //   14492: lookupswitch default -> 14520, -17927645 -> 24934, 98872304 -> 14475
    //   14520: goto -> 14524
    //   14523: athrow
    //   14524: invokevirtual func_147447_a : (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;ZZZ)Lnet/minecraft/util/math/RayTraceResult;
    //   14527: goto -> 14531
    //   14530: athrow
    //   14531: getstatic Perryc.1 : I
    //   14534: ifeq -> 14548
    //   14537: ldc2_w 1059651423
    //   14540: l2i
    //   14541: ldc_w 297642967
    //   14544: ixor
    //   14545: goto -> 14556
    //   14548: ldc2_w -1913980726
    //   14551: l2i
    //   14552: ldc_w 1382794169
    //   14555: ixor
    //   14556: ldc2_w -871556758
    //   14559: l2i
    //   14560: ldc_w 347670617
    //   14563: ixor
    //   14564: ixor
    //   14565: lookupswitch default -> 14592, -165591621 -> 24754, 387101503 -> 14548
    //   14592: astore #32
    //   14594: getstatic Perryc.c : I
    //   14597: iflt -> 14611
    //   14600: ldc2_w 354042305
    //   14603: l2i
    //   14604: ldc_w 342069454
    //   14607: ixor
    //   14608: goto -> 14619
    //   14611: ldc2_w -1581457802
    //   14614: l2i
    //   14615: ldc_w 2032132034
    //   14618: ixor
    //   14619: ldc2_w 2018122430
    //   14622: l2i
    //   14623: ldc_w -1530270542
    //   14626: ixor
    //   14627: ixor
    //   14628: lookupswitch default -> 14656, -570808573 -> 24740, 453814595 -> 14611
    //   14656: aload #32
    //   14658: ifnull -> 14672
    //   14661: ldc2_w -1733948533
    //   14664: l2i
    //   14665: ldc_w 516076736
    //   14668: ixor
    //   14669: goto -> 14680
    //   14672: ldc2_w -2041179138
    //   14675: l2i
    //   14676: ldc_w 3321014
    //   14679: ixor
    //   14680: ldc2_w -2020679580
    //   14683: l2i
    //   14684: ldc_w 1612269046
    //   14687: ixor
    //   14688: ixor
    //   14689: tableswitch default -> 14661, 1643322073 -> 14712, 1643322074 -> 15154
    //   14712: getstatic Perryc.0 : I
    //   14715: ifle -> 14729
    //   14718: ldc2_w 1080294776
    //   14721: l2i
    //   14722: ldc_w -1286099159
    //   14725: ixor
    //   14726: goto -> 14737
    //   14729: ldc2_w 2100610503
    //   14732: l2i
    //   14733: ldc_w 437049052
    //   14736: ixor
    //   14737: ldc2_w 1985126388
    //   14740: l2i
    //   14741: ldc_w 844337619
    //   14744: ixor
    //   14745: ixor
    //   14746: lookupswitch default -> 24846, -1221239690 -> 14729, 590945596 -> 14772
    //   14772: aload #32
    //   14774: getstatic Perryc.1 : I
    //   14777: ifeq -> 14791
    //   14780: ldc2_w -161659800
    //   14783: l2i
    //   14784: ldc_w -1463103267
    //   14787: ixor
    //   14788: goto -> 14799
    //   14791: ldc2_w -1583021910
    //   14794: l2i
    //   14795: ldc_w -248077453
    //   14798: ixor
    //   14799: ldc2_w -621730101
    //   14802: l2i
    //   14803: ldc_w -352583886
    //   14806: ixor
    //   14807: ixor
    //   14808: lookupswitch default -> 24512, 1620671008 -> 14836, 1855802700 -> 14791
    //   14836: getfield field_72313_a : Lnet/minecraft/util/math/RayTraceResult$Type;
    //   14839: getstatic Perryc.c : I
    //   14842: iflt -> 14856
    //   14845: ldc2_w 1054498136
    //   14848: l2i
    //   14849: ldc_w -501257472
    //   14852: ixor
    //   14853: goto -> 14864
    //   14856: ldc2_w 398674154
    //   14859: l2i
    //   14860: ldc_w -854248197
    //   14863: ixor
    //   14864: ldc2_w -1612580254
    //   14867: l2i
    //   14868: ldc_w 1010027924
    //   14871: ixor
    //   14872: ixor
    //   14873: lookupswitch default -> 24892, 2030324711 -> 14900, 2132214190 -> 14856
    //   14900: getstatic net/minecraft/util/math/RayTraceResult$Type.MISS : Lnet/minecraft/util/math/RayTraceResult$Type;
    //   14903: if_acmpeq -> 14917
    //   14906: ldc2_w -393103226
    //   14909: l2i
    //   14910: ldc_w 1332995896
    //   14913: ixor
    //   14914: goto -> 14925
    //   14917: ldc2_w 237622028
    //   14920: l2i
    //   14921: ldc_w -1446277965
    //   14924: ixor
    //   14925: ldc2_w 73023693
    //   14928: l2i
    //   14929: ldc_w -1329180075
    //   14932: ixor
    //   14933: ixor
    //   14934: tableswitch default -> 14906, 327044390 -> 14956, 327044391 -> 15154
    //   14956: getstatic Perryc.0 : I
    //   14959: ifle -> 14973
    //   14962: ldc2_w -51651043
    //   14965: l2i
    //   14966: ldc_w 414392883
    //   14969: ixor
    //   14970: goto -> 14981
    //   14973: ldc2_w -63242865
    //   14976: l2i
    //   14977: ldc_w -1911239266
    //   14980: ixor
    //   14981: ldc2_w -324327447
    //   14984: l2i
    //   14985: ldc_w -1903270252
    //   14988: ixor
    //   14989: ixor
    //   14990: lookupswitch default -> 15016, -2038579885 -> 24536, 231944113 -> 14973
    //   15016: aload #32
    //   15018: getstatic Perryc.c : I
    //   15021: iflt -> 15035
    //   15024: ldc2_w 1679429053
    //   15027: l2i
    //   15028: ldc_w -1996404083
    //   15031: ixor
    //   15032: goto -> 15043
    //   15035: ldc2_w -1748333206
    //   15038: l2i
    //   15039: ldc_w 1334743069
    //   15042: ixor
    //   15043: ldc2_w 106783328
    //   15046: l2i
    //   15047: ldc_w 449217896
    //   15050: ixor
    //   15051: ixor
    //   15052: lookupswitch default -> 24478, -991954305 -> 15080, -243228616 -> 15035
    //   15080: astore #29
    //   15082: ldc2_w 1504660828
    //   15085: l2i
    //   15086: ldc_w 1504660829
    //   15089: ixor
    //   15090: getstatic Perryc.1 : I
    //   15093: ifeq -> 15107
    //   15096: ldc2_w -1851427746
    //   15099: l2i
    //   15100: ldc_w -2090705016
    //   15103: ixor
    //   15104: goto -> 15115
    //   15107: ldc2_w -1742029627
    //   15110: l2i
    //   15111: ldc_w -1594332145
    //   15114: ixor
    //   15115: ldc2_w -1449224317
    //   15118: l2i
    //   15119: ldc_w 449207618
    //   15122: ixor
    //   15123: ixor
    //   15124: lookupswitch default -> 15152, -1935148810 -> 15107, -1583357673 -> 24968
    //   15152: istore #27
    //   15154: new net/minecraft/util/math/AxisAlignedBB
    //   15157: dup
    //   15158: getstatic Perryc.1 : I
    //   15161: ifeq -> 15175
    //   15164: ldc2_w -1815419940
    //   15167: l2i
    //   15168: ldc_w -933109012
    //   15171: ixor
    //   15172: goto -> 15183
    //   15175: ldc2_w 1319882894
    //   15178: l2i
    //   15179: ldc_w 773161812
    //   15182: ixor
    //   15183: ldc2_w 1025345245
    //   15186: l2i
    //   15187: ldc_w -723717758
    //   15190: ixor
    //   15191: ixor
    //   15192: lookupswitch default -> 24704, -1988156283 -> 15220, -1301645713 -> 15175
    //   15220: dload #10
    //   15222: getstatic Perryc.1 : I
    //   15225: ifeq -> 15239
    //   15228: ldc2_w 1451342015
    //   15231: l2i
    //   15232: ldc_w -65322900
    //   15235: ixor
    //   15236: goto -> 15247
    //   15239: ldc2_w 192602027
    //   15242: l2i
    //   15243: ldc_w -50334141
    //   15246: ixor
    //   15247: ldc2_w -1952028881
    //   15250: l2i
    //   15251: ldc_w 16922982
    //   15254: ixor
    //   15255: ixor
    //   15256: lookupswitch default -> 15284, -1879761432 -> 15239, 540976794 -> 24856
    //   15284: fload #26
    //   15286: f2d
    //   15287: dsub
    //   15288: getstatic Perryc.c : I
    //   15291: iflt -> 15305
    //   15294: ldc2_w -599725631
    //   15297: l2i
    //   15298: ldc_w -112496880
    //   15301: ixor
    //   15302: goto -> 15313
    //   15305: ldc2_w 1948849449
    //   15308: l2i
    //   15309: ldc_w -183706427
    //   15312: ixor
    //   15313: ldc2_w -396653261
    //   15316: l2i
    //   15317: ldc_w -416489671
    //   15320: ixor
    //   15321: ixor
    //   15322: lookupswitch default -> 15348, -559074985 -> 15305, 712824027 -> 24814
    //   15348: dload #12
    //   15350: getstatic Perryc.0 : I
    //   15353: ifle -> 15367
    //   15356: ldc2_w -2144526428
    //   15359: l2i
    //   15360: ldc_w -1210477376
    //   15363: ixor
    //   15364: goto -> 15375
    //   15367: ldc2_w -1959155406
    //   15370: l2i
    //   15371: ldc_w -328899891
    //   15374: ixor
    //   15375: ldc2_w -699883073
    //   15378: l2i
    //   15379: ldc_w -767523493
    //   15382: ixor
    //   15383: ixor
    //   15384: lookupswitch default -> 15412, 80092927 -> 15367, 872198016 -> 25088
    //   15412: fload #26
    //   15414: f2d
    //   15415: dsub
    //   15416: getstatic Perryc.1 : I
    //   15419: ifeq -> 15433
    //   15422: ldc2_w 1497524528
    //   15425: l2i
    //   15426: ldc_w 157696534
    //   15429: ixor
    //   15430: goto -> 15441
    //   15433: ldc2_w 1027554134
    //   15436: l2i
    //   15437: ldc_w -1125273852
    //   15440: ixor
    //   15441: ldc2_w -2004271975
    //   15444: l2i
    //   15445: ldc_w 1753067724
    //   15448: ixor
    //   15449: ixor
    //   15450: lookupswitch default -> 15476, -1328502925 -> 25050, -80275132 -> 15433
    //   15476: dload #14
    //   15478: getstatic Perryc.c : I
    //   15481: iflt -> 15495
    //   15484: ldc2_w -907616724
    //   15487: l2i
    //   15488: ldc_w -143612002
    //   15491: ixor
    //   15492: goto -> 15503
    //   15495: ldc2_w -768413420
    //   15498: l2i
    //   15499: ldc_w -885634044
    //   15502: ixor
    //   15503: ldc2_w -415672663
    //   15506: l2i
    //   15507: ldc_w -1912909636
    //   15510: ixor
    //   15511: ixor
    //   15512: lookupswitch default -> 24542, 1414823847 -> 15495, 1942403845 -> 15540
    //   15540: fload #26
    //   15542: f2d
    //   15543: dsub
    //   15544: getstatic Perryc.c : I
    //   15547: iflt -> 15561
    //   15550: ldc2_w 873582444
    //   15553: l2i
    //   15554: ldc_w 1032712222
    //   15557: ixor
    //   15558: goto -> 15569
    //   15561: ldc2_w 111362968
    //   15564: l2i
    //   15565: ldc_w -1394268379
    //   15568: ixor
    //   15569: ldc2_w 1556908174
    //   15572: l2i
    //   15573: ldc_w -1677298612
    //   15576: ixor
    //   15577: ixor
    //   15578: lookupswitch default -> 15604, -917060688 -> 24630, 1243573121 -> 15561
    //   15604: dload #10
    //   15606: getstatic Perryc.1 : I
    //   15609: ifeq -> 15623
    //   15612: ldc2_w 1316865099
    //   15615: l2i
    //   15616: ldc_w -99981295
    //   15619: ixor
    //   15620: goto -> 15631
    //   15623: ldc2_w -788703070
    //   15626: l2i
    //   15627: ldc_w -493633952
    //   15630: ixor
    //   15631: ldc2_w -947289468
    //   15634: l2i
    //   15635: ldc_w -1109543342
    //   15638: ixor
    //   15639: ixor
    //   15640: lookupswitch default -> 24640, -836527988 -> 15623, 1211814420 -> 15668
    //   15668: fload #26
    //   15670: f2d
    //   15671: dadd
    //   15672: getstatic Perryc.c : I
    //   15675: iflt -> 15689
    //   15678: ldc2_w -845063435
    //   15681: l2i
    //   15682: ldc_w 139462153
    //   15685: ixor
    //   15686: goto -> 15697
    //   15689: ldc2_w -591317314
    //   15692: l2i
    //   15693: ldc_w -1687524970
    //   15696: ixor
    //   15697: ldc2_w 766433139
    //   15700: l2i
    //   15701: ldc_w -1764660239
    //   15704: ixor
    //   15705: ixor
    //   15706: lookupswitch default -> 25082, -53156950 -> 15732, 2123292798 -> 15689
    //   15732: dload #12
    //   15734: getstatic Perryc.1 : I
    //   15737: ifeq -> 15751
    //   15740: ldc2_w -1564488891
    //   15743: l2i
    //   15744: ldc_w -242676678
    //   15747: ixor
    //   15748: goto -> 15759
    //   15751: ldc2_w -170802479
    //   15754: l2i
    //   15755: ldc_w -1145094518
    //   15758: ixor
    //   15759: ldc2_w -321961252
    //   15762: l2i
    //   15763: ldc_w -1687580879
    //   15766: ixor
    //   15767: ixor
    //   15768: lookupswitch default -> 15796, -543057889 -> 15751, 613419666 -> 24988
    //   15796: fload #26
    //   15798: f2d
    //   15799: dadd
    //   15800: getstatic Perryc.0 : I
    //   15803: ifle -> 15817
    //   15806: ldc2_w -1952422827
    //   15809: l2i
    //   15810: ldc_w -904069657
    //   15813: ixor
    //   15814: goto -> 15825
    //   15817: ldc2_w -1330381433
    //   15820: l2i
    //   15821: ldc_w 1367884990
    //   15824: ixor
    //   15825: ldc2_w -1378748381
    //   15828: l2i
    //   15829: ldc_w 1766111001
    //   15832: ixor
    //   15833: ixor
    //   15834: lookupswitch default -> 15860, -2060855672 -> 24508, 1491311984 -> 15817
    //   15860: dload #14
    //   15862: getstatic Perryc.1 : I
    //   15865: ifeq -> 15879
    //   15868: ldc2_w 2094643462
    //   15871: l2i
    //   15872: ldc_w -498318718
    //   15875: ixor
    //   15876: goto -> 15887
    //   15879: ldc2_w 1737556541
    //   15882: l2i
    //   15883: ldc_w 1842522773
    //   15886: ixor
    //   15887: ldc2_w -1073665827
    //   15890: l2i
    //   15891: ldc_w -359507984
    //   15894: ixor
    //   15895: ixor
    //   15896: lookupswitch default -> 24668, -1274641239 -> 15879, 550557573 -> 15924
    //   15924: fload #26
    //   15926: f2d
    //   15927: dadd
    //   15928: getstatic Perryc.c : I
    //   15931: iflt -> 15945
    //   15934: ldc2_w 1601588224
    //   15937: l2i
    //   15938: ldc_w 2026154460
    //   15941: ixor
    //   15942: goto -> 15953
    //   15945: ldc2_w -722455797
    //   15948: l2i
    //   15949: ldc_w -970943844
    //   15952: ixor
    //   15953: ldc2_w 701479274
    //   15956: l2i
    //   15957: ldc_w -1816118596
    //   15960: ixor
    //   15961: ixor
    //   15962: lookupswitch default -> 24902, -1648531958 -> 15945, -1461771711 -> 15988
    //   15988: goto -> 15992
    //   15991: athrow
    //   15992: invokespecial <init> : (DDDDDD)V
    //   15995: goto -> 15999
    //   15998: athrow
    //   15999: getstatic Perryc.c : I
    //   16002: iflt -> 16016
    //   16005: ldc2_w 755469102
    //   16008: l2i
    //   16009: ldc_w 1356263518
    //   16012: ixor
    //   16013: goto -> 16024
    //   16016: ldc2_w -681792205
    //   16019: l2i
    //   16020: ldc_w -1176978417
    //   16023: ixor
    //   16024: ldc2_w -328629373
    //   16027: l2i
    //   16028: ldc_w 912378830
    //   16031: ixor
    //   16032: ixor
    //   16033: lookupswitch default -> 16060, -1478937795 -> 24894, -403855202 -> 16016
    //   16060: astore #33
    //   16062: getstatic Perryc.c : I
    //   16065: iflt -> 16079
    //   16068: ldc2_w 1122641679
    //   16071: l2i
    //   16072: ldc_w 1197710131
    //   16075: ixor
    //   16076: goto -> 16087
    //   16079: ldc2_w 1647190641
    //   16082: l2i
    //   16083: ldc_w 1678724840
    //   16086: ixor
    //   16087: ldc2_w -1846890447
    //   16090: l2i
    //   16091: ldc_w 380428234
    //   16094: ixor
    //   16095: ixor
    //   16096: lookupswitch default -> 24912, -2123955358 -> 16124, -2100309049 -> 16079
    //   16124: aload_0
    //   16125: getstatic Perryc.1 : I
    //   16128: ifeq -> 16142
    //   16131: ldc2_w -180442787
    //   16134: l2i
    //   16135: ldc_w -1098245363
    //   16138: ixor
    //   16139: goto -> 16150
    //   16142: ldc2_w -1979109909
    //   16145: l2i
    //   16146: ldc_w -2093106111
    //   16149: ixor
    //   16150: ldc2_w -1116530186
    //   16153: l2i
    //   16154: ldc_w -62598371
    //   16157: ixor
    //   16158: ixor
    //   16159: lookupswitch default -> 16184, -1215161624 -> 16142, 176388283 -> 24464
    //   16184: aload #33
    //   16186: getstatic Perryc.c : I
    //   16189: iflt -> 16203
    //   16192: ldc2_w -1253475599
    //   16195: l2i
    //   16196: ldc_w 403991847
    //   16199: ixor
    //   16200: goto -> 16211
    //   16203: ldc2_w 979965715
    //   16206: l2i
    //   16207: ldc_w 1315106454
    //   16210: ixor
    //   16211: ldc2_w -355841300
    //   16214: l2i
    //   16215: ldc_w -1972162927
    //   16218: ixor
    //   16219: ixor
    //   16220: lookupswitch default -> 16248, -840666197 -> 24604, -192666531 -> 16203
    //   16248: dload #16
    //   16250: getstatic Perryc.0 : I
    //   16253: ifle -> 16267
    //   16256: ldc2_w -1857942995
    //   16259: l2i
    //   16260: ldc_w -1285959915
    //   16263: ixor
    //   16264: goto -> 16275
    //   16267: ldc2_w -474231229
    //   16270: l2i
    //   16271: ldc_w 2012616646
    //   16274: ixor
    //   16275: ldc2_w -894945450
    //   16278: l2i
    //   16279: ldc_w -284461193
    //   16282: ixor
    //   16283: ixor
    //   16284: lookupswitch default -> 16312, 129533209 -> 24972, 149482466 -> 16267
    //   16312: dload #18
    //   16314: getstatic Perryc.1 : I
    //   16317: ifeq -> 16331
    //   16320: ldc2_w -2011622573
    //   16323: l2i
    //   16324: ldc_w 1534208604
    //   16327: ixor
    //   16328: goto -> 16339
    //   16331: ldc2_w 834350123
    //   16334: l2i
    //   16335: ldc_w -2035219674
    //   16338: ixor
    //   16339: ldc2_w 156925502
    //   16342: l2i
    //   16343: ldc_w 1263700733
    //   16346: ixor
    //   16347: ixor
    //   16348: lookupswitch default -> 16376, -1855730228 -> 24738, 1766106163 -> 16331
    //   16376: dload #20
    //   16378: getstatic Perryc.1 : I
    //   16381: ifeq -> 16395
    //   16384: ldc2_w 306826232
    //   16387: l2i
    //   16388: ldc_w 1866030810
    //   16391: ixor
    //   16392: goto -> 16403
    //   16395: ldc2_w 1789747723
    //   16398: l2i
    //   16399: ldc_w 2096939170
    //   16402: ixor
    //   16403: ldc2_w -1627009238
    //   16406: l2i
    //   16407: ldc_w -1437774261
    //   16410: ixor
    //   16411: ixor
    //   16412: lookupswitch default -> 24898, 588850120 -> 16440, 1211634755 -> 16395
    //   16440: goto -> 16444
    //   16443: athrow
    //   16444: invokevirtual func_72317_d : (DDD)Lnet/minecraft/util/math/AxisAlignedBB;
    //   16447: goto -> 16451
    //   16450: athrow
    //   16451: ldc2_w 287.8013965898462
    //   16454: invokestatic doubleToLongBits : (D)J
    //   16457: ldc2_w 9187902695921092671
    //   16460: lxor
    //   16461: invokestatic longBitsToDouble : (J)D
    //   16464: ldc2_w 5.478618526882536
    //   16467: invokestatic doubleToLongBits : (D)J
    //   16470: ldc2_w 9216029614061707641
    //   16473: lxor
    //   16474: invokestatic longBitsToDouble : (J)D
    //   16477: ldc2_w 2680.035669235978
    //   16480: invokestatic doubleToLongBits : (D)J
    //   16483: ldc2_w 9175222302088688639
    //   16486: lxor
    //   16487: invokestatic longBitsToDouble : (J)D
    //   16490: getstatic Perryc.1 : I
    //   16493: ifeq -> 16507
    //   16496: ldc2_w -82318556
    //   16499: l2i
    //   16500: ldc_w -149755177
    //   16503: ixor
    //   16504: goto -> 16515
    //   16507: ldc2_w 1911780351
    //   16510: l2i
    //   16511: ldc_w 131979429
    //   16514: ixor
    //   16515: ldc2_w -1937648902
    //   16518: l2i
    //   16519: ldc_w -753914450
    //   16522: ixor
    //   16523: ixor
    //   16524: lookupswitch default -> 16552, 1402273447 -> 25086, 1963075988 -> 16507
    //   16552: goto -> 16556
    //   16555: athrow
    //   16556: invokevirtual func_72321_a : (DDD)Lnet/minecraft/util/math/AxisAlignedBB;
    //   16559: goto -> 16563
    //   16562: athrow
    //   16563: getstatic Perryc.0 : I
    //   16566: ifle -> 16580
    //   16569: ldc2_w -1385399785
    //   16572: l2i
    //   16573: ldc_w 18555824
    //   16576: ixor
    //   16577: goto -> 16588
    //   16580: ldc2_w -1728147016
    //   16583: l2i
    //   16584: ldc_w -814889068
    //   16587: ixor
    //   16588: ldc2_w -1507397867
    //   16591: l2i
    //   16592: ldc_w -1196442364
    //   16595: ixor
    //   16596: ixor
    //   16597: lookupswitch default -> 24942, -1291973706 -> 16580, 1226441789 -> 16624
    //   16624: goto -> 16628
    //   16627: athrow
    //   16628: invokespecial getEntitiesWithinAABB : (Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
    //   16631: goto -> 16635
    //   16634: athrow
    //   16635: getstatic Perryc.1 : I
    //   16638: ifeq -> 16652
    //   16641: ldc2_w 1755180664
    //   16644: l2i
    //   16645: ldc_w -758679786
    //   16648: ixor
    //   16649: goto -> 16660
    //   16652: ldc2_w -1250189650
    //   16655: l2i
    //   16656: ldc_w -1829566298
    //   16659: ixor
    //   16660: ldc2_w -1742170714
    //   16663: l2i
    //   16664: ldc_w -1025011868
    //   16667: ixor
    //   16668: ixor
    //   16669: lookupswitch default -> 16696, -527072340 -> 24962, 1070358083 -> 16652
    //   16696: astore #34
    //   16698: getstatic Perryc.0 : I
    //   16701: ifle -> 16715
    //   16704: ldc2_w 1637358181
    //   16707: l2i
    //   16708: ldc_w 713035336
    //   16711: ixor
    //   16712: goto -> 16723
    //   16715: ldc2_w 1372007459
    //   16718: l2i
    //   16719: ldc_w 1297859999
    //   16722: ixor
    //   16723: ldc2_w 1156691624
    //   16726: l2i
    //   16727: ldc_w -736933212
    //   16730: ixor
    //   16731: ixor
    //   16732: lookupswitch default -> 24520, -1937893968 -> 16760, -604313567 -> 16715
    //   16760: aload #34
    //   16762: getstatic Perryc.c : I
    //   16765: iflt -> 16779
    //   16768: ldc2_w 1907396978
    //   16771: l2i
    //   16772: ldc_w -1401058379
    //   16775: ixor
    //   16776: goto -> 16787
    //   16779: ldc2_w -775265996
    //   16782: l2i
    //   16783: ldc_w -1731720657
    //   16786: ixor
    //   16787: ldc2_w 740568214
    //   16790: l2i
    //   16791: ldc_w 29057050
    //   16794: ixor
    //   16795: ixor
    //   16796: lookupswitch default -> 24980, -263039413 -> 16779, 1688020887 -> 16824
    //   16824: goto -> 16828
    //   16827: athrow
    //   16828: invokeinterface iterator : ()Ljava/util/Iterator;
    //   16833: goto -> 16837
    //   16836: athrow
    //   16837: getstatic Perryc.c : I
    //   16840: iflt -> 16854
    //   16843: ldc2_w -1345655333
    //   16846: l2i
    //   16847: ldc_w 199726609
    //   16850: ixor
    //   16851: goto -> 16862
    //   16854: ldc2_w -1361608705
    //   16857: l2i
    //   16858: ldc_w -1915098714
    //   16861: ixor
    //   16862: ldc2_w -170311877
    //   16865: l2i
    //   16866: ldc_w -1943537366
    //   16869: ixor
    //   16870: ixor
    //   16871: lookupswitch default -> 24588, -573325861 -> 16854, 1525698632 -> 16896
    //   16896: astore #35
    //   16898: getstatic Perryc.c : I
    //   16901: iflt -> 16915
    //   16904: ldc2_w -1702728457
    //   16907: l2i
    //   16908: ldc_w 74694754
    //   16911: ixor
    //   16912: goto -> 16923
    //   16915: ldc2_w -1933019846
    //   16918: l2i
    //   16919: ldc_w 1004619405
    //   16922: ixor
    //   16923: ldc2_w 831442669
    //   16926: l2i
    //   16927: ldc_w -688018230
    //   16930: ixor
    //   16931: ixor
    //   16932: lookupswitch default -> 24960, 1348096400 -> 16960, 2038615730 -> 16915
    //   16960: aload #35
    //   16962: getstatic Perryc.1 : I
    //   16965: ifeq -> 16979
    //   16968: ldc2_w -1668476325
    //   16971: l2i
    //   16972: ldc_w -666742943
    //   16975: ixor
    //   16976: goto -> 16987
    //   16979: ldc2_w -1710674102
    //   16982: l2i
    //   16983: ldc_w -474309311
    //   16986: ixor
    //   16987: ldc2_w 2092190
    //   16990: l2i
    //   16991: ldc_w 1951941848
    //   16994: ixor
    //   16995: ixor
    //   16996: lookupswitch default -> 25000, 234101325 -> 17024, 814282108 -> 16979
    //   17024: goto -> 17028
    //   17027: athrow
    //   17028: invokeinterface hasNext : ()Z
    //   17033: goto -> 17037
    //   17036: athrow
    //   17037: ifeq -> 17051
    //   17040: ldc2_w -616704290
    //   17043: l2i
    //   17044: ldc_w -1494803596
    //   17047: ixor
    //   17048: goto -> 17059
    //   17051: ldc2_w -1193462321
    //   17054: l2i
    //   17055: ldc_w -989333402
    //   17058: ixor
    //   17059: ldc2_w 1229059442
    //   17062: l2i
    //   17063: ldc_w -405529359
    //   17066: ixor
    //   17067: ixor
    //   17068: tableswitch default -> 17040, -749788119 -> 17092, -749788118 -> 19109
    //   17092: getstatic Perryc.c : I
    //   17095: iflt -> 17109
    //   17098: ldc2_w 1427422889
    //   17101: l2i
    //   17102: ldc_w 1710747054
    //   17105: ixor
    //   17106: goto -> 17117
    //   17109: ldc2_w -1064112044
    //   17112: l2i
    //   17113: ldc_w 645367810
    //   17116: ixor
    //   17117: ldc2_w 1508839182
    //   17120: l2i
    //   17121: ldc_w -1503844242
    //   17124: ixor
    //   17125: ixor
    //   17126: lookupswitch default -> 24918, -816745369 -> 17109, 425156406 -> 17152
    //   17152: aload #35
    //   17154: getstatic Perryc.c : I
    //   17157: iflt -> 17171
    //   17160: ldc2_w -150053996
    //   17163: l2i
    //   17164: ldc_w -1818807980
    //   17167: ixor
    //   17168: goto -> 17179
    //   17171: ldc2_w -1370332069
    //   17174: l2i
    //   17175: ldc_w -1997584601
    //   17178: ixor
    //   17179: ldc2_w 1055017436
    //   17182: l2i
    //   17183: ldc_w -1132653031
    //   17186: ixor
    //   17187: ixor
    //   17188: lookupswitch default -> 17216, -435800827 -> 24480, 1366834994 -> 17171
    //   17216: goto -> 17220
    //   17219: athrow
    //   17220: invokeinterface next : ()Ljava/lang/Object;
    //   17225: goto -> 17229
    //   17228: athrow
    //   17229: getstatic Perryc.c : I
    //   17232: iflt -> 17246
    //   17235: ldc2_w -1192269967
    //   17238: l2i
    //   17239: ldc_w -537855942
    //   17242: ixor
    //   17243: goto -> 17254
    //   17246: ldc2_w 675459346
    //   17249: l2i
    //   17250: ldc_w -1762941647
    //   17253: ixor
    //   17254: ldc2_w 163963506
    //   17257: l2i
    //   17258: ldc_w 942785866
    //   17261: ixor
    //   17262: ixor
    //   17263: lookupswitch default -> 17288, 92835331 -> 17246, 1458288755 -> 24696
    //   17288: astore #36
    //   17290: getstatic Perryc.0 : I
    //   17293: ifle -> 17307
    //   17296: ldc2_w 405285980
    //   17299: l2i
    //   17300: ldc_w 1772295229
    //   17303: ixor
    //   17304: goto -> 17315
    //   17307: ldc2_w -1019840402
    //   17310: l2i
    //   17311: ldc_w -1057108598
    //   17314: ixor
    //   17315: ldc2_w -201750277
    //   17318: l2i
    //   17319: ldc_w 1674859022
    //   17322: ixor
    //   17323: ixor
    //   17324: lookupswitch default -> 24610, -1813614831 -> 17352, -509156716 -> 17307
    //   17352: aload #36
    //   17354: checkcast net/minecraft/entity/Entity
    //   17357: getstatic Perryc.c : I
    //   17360: iflt -> 17374
    //   17363: ldc2_w 1972106360
    //   17366: l2i
    //   17367: ldc_w -1312339243
    //   17370: ixor
    //   17371: goto -> 17382
    //   17374: ldc2_w 1774929681
    //   17377: l2i
    //   17378: ldc_w -429626075
    //   17381: ixor
    //   17382: ldc2_w 1799140019
    //   17385: l2i
    //   17386: ldc_w 1426833441
    //   17389: ixor
    //   17390: ixor
    //   17391: lookupswitch default -> 17416, -1672989334 -> 17374, -92550081 -> 24914
    //   17416: astore #37
    //   17418: getstatic Perryc.c : I
    //   17421: iflt -> 17435
    //   17424: ldc2_w -1747363726
    //   17427: l2i
    //   17428: ldc_w -504923968
    //   17431: ixor
    //   17432: goto -> 17443
    //   17435: ldc2_w -1145479185
    //   17438: l2i
    //   17439: ldc_w 898871654
    //   17442: ixor
    //   17443: ldc2_w 49430296
    //   17446: l2i
    //   17447: ldc_w -418464797
    //   17450: ixor
    //   17451: ixor
    //   17452: lookupswitch default -> 17480, -1815960503 -> 24890, 1362442408 -> 17435
    //   17480: aload #37
    //   17482: getstatic Perryc.0 : I
    //   17485: ifle -> 17499
    //   17488: ldc2_w -1642750558
    //   17491: l2i
    //   17492: ldc_w 1331098056
    //   17495: ixor
    //   17496: goto -> 17507
    //   17499: ldc2_w -458816061
    //   17502: l2i
    //   17503: ldc_w -127129796
    //   17506: ixor
    //   17507: ldc2_w 1526514730
    //   17510: l2i
    //   17511: ldc_w 1459908513
    //   17514: ixor
    //   17515: ixor
    //   17516: lookupswitch default -> 17544, -591673375 -> 24906, 2128457906 -> 17499
    //   17544: goto -> 17548
    //   17547: athrow
    //   17548: invokevirtual func_70067_L : ()Z
    //   17551: goto -> 17555
    //   17554: athrow
    //   17555: ifeq -> 17569
    //   17558: ldc2_w -1412736023
    //   17561: l2i
    //   17562: ldc_w 1592833742
    //   17565: ixor
    //   17566: goto -> 17577
    //   17569: ldc2_w -2060109048
    //   17572: l2i
    //   17573: ldc_w 1880020526
    //   17576: ixor
    //   17577: ldc2_w 1989718484
    //   17580: l2i
    //   17581: ldc_w 1863060067
    //   17584: ixor
    //   17585: ixor
    //   17586: tableswitch default -> 17558, -324053360 -> 17608, -324053359 -> 16898
    //   17608: getstatic Perryc.c : I
    //   17611: iflt -> 17625
    //   17614: ldc2_w 1813875220
    //   17617: l2i
    //   17618: ldc_w 727623752
    //   17621: ixor
    //   17622: goto -> 17633
    //   17625: ldc2_w 748871184
    //   17628: l2i
    //   17629: ldc_w -1202421276
    //   17632: ixor
    //   17633: ldc2_w -1308282988
    //   17636: l2i
    //   17637: ldc_w -835281717
    //   17640: ixor
    //   17641: ixor
    //   17642: lookupswitch default -> 17668, 997232899 -> 24978, 1709998086 -> 17625
    //   17668: aload #37
    //   17670: getstatic Perryc.1 : I
    //   17673: ifeq -> 17687
    //   17676: ldc2_w 2139348149
    //   17679: l2i
    //   17680: ldc_w -838119488
    //   17683: ixor
    //   17684: goto -> 17695
    //   17687: ldc2_w 593836048
    //   17690: l2i
    //   17691: ldc_w 1108391703
    //   17694: ixor
    //   17695: ldc2_w -1500273081
    //   17698: l2i
    //   17699: ldc_w 433735988
    //   17702: ixor
    //   17703: ixor
    //   17704: lookupswitch default -> 24676, -566468492 -> 17732, 247561222 -> 17687
    //   17732: aload_1
    //   17733: if_acmpne -> 17747
    //   17736: ldc2_w 760660050
    //   17739: l2i
    //   17740: ldc_w -921824523
    //   17743: ixor
    //   17744: goto -> 17755
    //   17747: ldc2_w -1293434858
    //   17750: l2i
    //   17751: ldc_w 1455362736
    //   17754: ixor
    //   17755: ldc2_w 167501863
    //   17758: l2i
    //   17759: ldc_w 629618476
    //   17762: ixor
    //   17763: ixor
    //   17764: tableswitch default -> 17736, -937163348 -> 17788, -937163347 -> 17791
    //   17788: goto -> 16898
    //   17791: ldc_w 23.38843
    //   17794: invokestatic floatToIntBits : (F)I
    //   17797: ldc_w 2132967963
    //   17800: ixor
    //   17801: invokestatic intBitsToFloat : (I)F
    //   17804: getstatic Perryc.1 : I
    //   17807: ifeq -> 17821
    //   17810: ldc2_w 653063360
    //   17813: l2i
    //   17814: ldc_w 628873376
    //   17817: ixor
    //   17818: goto -> 17829
    //   17821: ldc2_w 2074243746
    //   17824: l2i
    //   17825: ldc_w 1406688398
    //   17828: ixor
    //   17829: ldc2_w -805398545
    //   17832: l2i
    //   17833: ldc_w -311685606
    //   17836: ixor
    //   17837: ixor
    //   17838: lookupswitch default -> 24866, 183023577 -> 17864, 554022293 -> 17821
    //   17864: fstore #38
    //   17866: getstatic Perryc.c : I
    //   17869: iflt -> 17883
    //   17872: ldc2_w 1116210682
    //   17875: l2i
    //   17876: ldc_w 1875067593
    //   17879: ixor
    //   17880: goto -> 17891
    //   17883: ldc2_w 270923192
    //   17886: l2i
    //   17887: ldc_w 592736210
    //   17890: ixor
    //   17891: ldc2_w 685273228
    //   17894: l2i
    //   17895: ldc_w -653137884
    //   17898: ixor
    //   17899: ixor
    //   17900: lookupswitch default -> 17928, -595402853 -> 24852, 1754758525 -> 17883
    //   17928: aload #37
    //   17930: getstatic Perryc.1 : I
    //   17933: ifeq -> 17947
    //   17936: ldc2_w -1425749536
    //   17939: l2i
    //   17940: ldc_w 1559437766
    //   17943: ixor
    //   17944: goto -> 17955
    //   17947: ldc2_w 1081027274
    //   17950: l2i
    //   17951: ldc_w 397723357
    //   17954: ixor
    //   17955: ldc2_w -1638275868
    //   17958: l2i
    //   17959: ldc_w 1278338443
    //   17962: ixor
    //   17963: ixor
    //   17964: lookupswitch default -> 25052, -2051805832 -> 17992, 631236937 -> 17947
    //   17992: goto -> 17996
    //   17995: athrow
    //   17996: invokevirtual func_174813_aQ : ()Lnet/minecraft/util/math/AxisAlignedBB;
    //   17999: goto -> 18003
    //   18002: athrow
    //   18003: getstatic Perryc.c : I
    //   18006: iflt -> 18020
    //   18009: ldc2_w -1844699752
    //   18012: l2i
    //   18013: ldc_w 1715080228
    //   18016: ixor
    //   18017: goto -> 18028
    //   18020: ldc2_w -1238992424
    //   18023: l2i
    //   18024: ldc_w 1845127608
    //   18027: ixor
    //   18028: ldc2_w -2086504449
    //   18031: l2i
    //   18032: ldc_w -105417946
    //   18035: ixor
    //   18036: ixor
    //   18037: lookupswitch default -> 18064, -1910303387 -> 24624, -1337852781 -> 18020
    //   18064: fload #38
    //   18066: f2d
    //   18067: getstatic Perryc.1 : I
    //   18070: ifeq -> 18084
    //   18073: ldc2_w 1504594540
    //   18076: l2i
    //   18077: ldc_w -1181820316
    //   18080: ixor
    //   18081: goto -> 18092
    //   18084: ldc2_w 446422884
    //   18087: l2i
    //   18088: ldc_w -962408788
    //   18091: ixor
    //   18092: ldc2_w 1372424178
    //   18095: l2i
    //   18096: ldc_w -870521024
    //   18099: ixor
    //   18100: ixor
    //   18101: lookupswitch default -> 18128, -1787530937 -> 18084, 2113007802 -> 24784
    //   18128: fload #38
    //   18130: f2d
    //   18131: getstatic Perryc.1 : I
    //   18134: ifeq -> 18148
    //   18137: ldc2_w 840080431
    //   18140: l2i
    //   18141: ldc_w -1989726707
    //   18144: ixor
    //   18145: goto -> 18156
    //   18148: ldc2_w 1784895687
    //   18151: l2i
    //   18152: ldc_w 1344903715
    //   18155: ixor
    //   18156: ldc2_w 76569289
    //   18159: l2i
    //   18160: ldc_w -1267602784
    //   18163: ixor
    //   18164: ixor
    //   18165: lookupswitch default -> 18192, 194249291 -> 24868, 1302959097 -> 18148
    //   18192: fload #38
    //   18194: f2d
    //   18195: getstatic Perryc.c : I
    //   18198: iflt -> 18212
    //   18201: ldc2_w -1026462205
    //   18204: l2i
    //   18205: ldc_w 1261155058
    //   18208: ixor
    //   18209: goto -> 18220
    //   18212: ldc2_w -435398501
    //   18215: l2i
    //   18216: ldc_w -313750005
    //   18219: ixor
    //   18220: ldc2_w 1623249524
    //   18223: l2i
    //   18224: ldc_w 1341600592
    //   18227: ixor
    //   18228: ixor
    //   18229: lookupswitch default -> 24924, -1496498731 -> 18212, 611792820 -> 18256
    //   18256: goto -> 18260
    //   18259: athrow
    //   18260: invokevirtual func_72321_a : (DDD)Lnet/minecraft/util/math/AxisAlignedBB;
    //   18263: goto -> 18267
    //   18266: athrow
    //   18267: getstatic Perryc.1 : I
    //   18270: ifeq -> 18284
    //   18273: ldc2_w 857657212
    //   18276: l2i
    //   18277: ldc_w -57202742
    //   18280: ixor
    //   18281: goto -> 18292
    //   18284: ldc2_w 1789164423
    //   18287: l2i
    //   18288: ldc_w 1882459855
    //   18291: ixor
    //   18292: ldc2_w 820804882
    //   18295: l2i
    //   18296: ldc_w 2100200723
    //   18299: ixor
    //   18300: ixor
    //   18301: lookupswitch default -> 18328, -2109009737 -> 25054, -1123306200 -> 18284
    //   18328: astore #39
    //   18330: getstatic Perryc.c : I
    //   18333: iflt -> 18347
    //   18336: ldc2_w -1552671872
    //   18339: l2i
    //   18340: ldc_w 1837458943
    //   18343: ixor
    //   18344: goto -> 18355
    //   18347: ldc2_w 1007069326
    //   18350: l2i
    //   18351: ldc_w -886368295
    //   18354: ixor
    //   18355: ldc2_w 907410622
    //   18358: l2i
    //   18359: ldc_w -1014287896
    //   18362: ixor
    //   18363: ixor
    //   18364: lookupswitch default -> 18392, 997176105 -> 24974, 1429282666 -> 18347
    //   18392: aload #39
    //   18394: getstatic Perryc.0 : I
    //   18397: ifle -> 18411
    //   18400: ldc2_w -1929390275
    //   18403: l2i
    //   18404: ldc_w 1119380693
    //   18407: ixor
    //   18408: goto -> 18419
    //   18411: ldc2_w -902298339
    //   18414: l2i
    //   18415: ldc_w -734816676
    //   18418: ixor
    //   18419: ldc2_w 1165495816
    //   18422: l2i
    //   18423: ldc_w 122501811
    //   18426: ixor
    //   18427: ixor
    //   18428: lookupswitch default -> 18456, -1938651309 -> 24592, 2107607892 -> 18411
    //   18456: aload #30
    //   18458: getstatic Perryc.0 : I
    //   18461: ifle -> 18475
    //   18464: ldc2_w -479892681
    //   18467: l2i
    //   18468: ldc_w 1793028001
    //   18471: ixor
    //   18472: goto -> 18483
    //   18475: ldc2_w 286044199
    //   18478: l2i
    //   18479: ldc_w -342633814
    //   18482: ixor
    //   18483: ldc2_w 1603781328
    //   18486: l2i
    //   18487: ldc_w -1575439128
    //   18490: ixor
    //   18491: ixor
    //   18492: lookupswitch default -> 24840, 118494389 -> 18520, 1949659822 -> 18475
    //   18520: aload #31
    //   18522: getstatic Perryc.1 : I
    //   18525: ifeq -> 18539
    //   18528: ldc2_w -290296103
    //   18531: l2i
    //   18532: ldc_w -1921132298
    //   18535: ixor
    //   18536: goto -> 18547
    //   18539: ldc2_w -1351061341
    //   18542: l2i
    //   18543: ldc_w -1851752878
    //   18546: ixor
    //   18547: ldc2_w 109644380
    //   18550: l2i
    //   18551: ldc_w -382054889
    //   18554: ixor
    //   18555: ixor
    //   18556: lookupswitch default -> 25026, -1937968540 -> 18539, -781497670 -> 18584
    //   18584: goto -> 18588
    //   18587: athrow
    //   18588: invokevirtual func_72327_a : (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;
    //   18591: goto -> 18595
    //   18594: athrow
    //   18595: getstatic Perryc.1 : I
    //   18598: ifeq -> 18612
    //   18601: ldc2_w 1366586512
    //   18604: l2i
    //   18605: ldc_w -1262497928
    //   18608: ixor
    //   18609: goto -> 18620
    //   18612: ldc2_w -813363526
    //   18615: l2i
    //   18616: ldc_w -1061676251
    //   18619: ixor
    //   18620: ldc2_w -1785905042
    //   18623: l2i
    //   18624: ldc_w -1227207273
    //   18627: ixor
    //   18628: ixor
    //   18629: lookupswitch default -> 24756, -962808303 -> 18612, 745150566 -> 18656
    //   18656: astore #40
    //   18658: getstatic Perryc.0 : I
    //   18661: ifle -> 18675
    //   18664: ldc2_w 2038641957
    //   18667: l2i
    //   18668: ldc_w 362307596
    //   18671: ixor
    //   18672: goto -> 18683
    //   18675: ldc2_w 1966711877
    //   18678: l2i
    //   18679: ldc_w -1340639036
    //   18682: ixor
    //   18683: ldc2_w -1822097909
    //   18686: l2i
    //   18687: ldc_w -575128685
    //   18690: ixor
    //   18691: ixor
    //   18692: lookupswitch default -> 18720, -1275299380 -> 18675, 583504049 -> 24764
    //   18720: aload #40
    //   18722: ifnonnull -> 18736
    //   18725: ldc2_w 1432363897
    //   18728: l2i
    //   18729: ldc_w 1364826894
    //   18732: ixor
    //   18733: goto -> 18744
    //   18736: ldc2_w 1059863128
    //   18739: l2i
    //   18740: ldc_w 991265326
    //   18743: ixor
    //   18744: ldc2_w -928093780
    //   18747: l2i
    //   18748: ldc_w -1480431377
    //   18751: ixor
    //   18752: ixor
    //   18753: tableswitch default -> 18725, 1800780084 -> 18776, 1800780085 -> 18779
    //   18776: goto -> 16898
    //   18779: ldc2_w -2118196966
    //   18782: l2i
    //   18783: ldc_w -2118196965
    //   18786: ixor
    //   18787: getstatic Perryc.0 : I
    //   18790: ifle -> 18804
    //   18793: ldc2_w 731523446
    //   18796: l2i
    //   18797: ldc_w -1240839037
    //   18800: ixor
    //   18801: goto -> 18812
    //   18804: ldc2_w 416898512
    //   18807: l2i
    //   18808: ldc_w 926295777
    //   18811: ixor
    //   18812: ldc2_w 228189417
    //   18815: l2i
    //   18816: ldc_w 1036817251
    //   18819: ixor
    //   18820: ixor
    //   18821: lookupswitch default -> 24884, -1379593601 -> 18804, 532286651 -> 18848
    //   18848: istore #27
    //   18850: getstatic Perryc.c : I
    //   18853: iflt -> 18867
    //   18856: ldc2_w 796403871
    //   18859: l2i
    //   18860: ldc_w 928869532
    //   18863: ixor
    //   18864: goto -> 18875
    //   18867: ldc2_w -1426441161
    //   18870: l2i
    //   18871: ldc_w -1586347277
    //   18874: ixor
    //   18875: ldc2_w -1112989709
    //   18878: l2i
    //   18879: ldc_w 1654971156
    //   18882: ixor
    //   18883: ixor
    //   18884: lookupswitch default -> 18912, -953646876 -> 25090, 26104319 -> 18867
    //   18912: aload #37
    //   18914: getstatic Perryc.0 : I
    //   18917: ifle -> 18931
    //   18920: ldc2_w 2122829
    //   18923: l2i
    //   18924: ldc_w 1473401
    //   18927: ixor
    //   18928: goto -> 18939
    //   18931: ldc2_w -1495138206
    //   18934: l2i
    //   18935: ldc_w 1000641434
    //   18938: ixor
    //   18939: ldc2_w 503576130
    //   18942: l2i
    //   18943: ldc_w 549103933
    //   18946: ixor
    //   18947: ixor
    //   18948: lookupswitch default -> 24532, -1543517049 -> 18976, 1049575499 -> 18931
    //   18976: astore #28
    //   18978: getstatic Perryc.0 : I
    //   18981: ifle -> 18995
    //   18984: ldc2_w 382616042
    //   18987: l2i
    //   18988: ldc_w -1925468524
    //   18991: ixor
    //   18992: goto -> 19003
    //   18995: ldc2_w -2074195229
    //   18998: l2i
    //   18999: ldc_w 1885556011
    //   19002: ixor
    //   19003: ldc2_w 1400000027
    //   19006: l2i
    //   19007: ldc_w 893527027
    //   19010: ixor
    //   19011: ixor
    //   19012: lookupswitch default -> 24626, -1844614624 -> 19040, -37387626 -> 18995
    //   19040: aload #40
    //   19042: getstatic Perryc.1 : I
    //   19045: ifeq -> 19059
    //   19048: ldc2_w -2142698369
    //   19051: l2i
    //   19052: ldc_w -2068385552
    //   19055: ixor
    //   19056: goto -> 19067
    //   19059: ldc2_w 592348530
    //   19062: l2i
    //   19063: ldc_w -1421419878
    //   19066: ixor
    //   19067: ldc2_w -899495302
    //   19070: l2i
    //   19071: ldc_w 2060539835
    //   19074: ixor
    //   19075: ixor
    //   19076: lookupswitch default -> 24564, -1270060722 -> 19059, 951829033 -> 19104
    //   19104: astore #29
    //   19106: goto -> 16898
    //   19109: getstatic Perryc.c : I
    //   19112: iflt -> 19126
    //   19115: ldc2_w -1373082534
    //   19118: l2i
    //   19119: ldc_w 1161430693
    //   19122: ixor
    //   19123: goto -> 19134
    //   19126: ldc2_w -617837659
    //   19129: l2i
    //   19130: ldc_w -1152035768
    //   19133: ixor
    //   19134: ldc2_w -940426554
    //   19137: l2i
    //   19138: ldc_w 998910332
    //   19141: ixor
    //   19142: ixor
    //   19143: lookupswitch default -> 19168, -32580772 -> 19126, 392853829 -> 24776
    //   19168: aload #28
    //   19170: ifnull -> 19184
    //   19173: ldc2_w 542399651
    //   19176: l2i
    //   19177: ldc_w -1318642863
    //   19180: ixor
    //   19181: goto -> 19192
    //   19184: ldc2_w 1336316592
    //   19187: l2i
    //   19188: ldc_w -560605885
    //   19191: ixor
    //   19192: ldc2_w 214208229
    //   19195: l2i
    //   19196: ldc_w 1516868671
    //   19199: ixor
    //   19200: ixor
    //   19201: tableswitch default -> 19173, -945922776 -> 19224, -945922775 -> 19347
    //   19224: ldc_w 23.638746
    //   19227: invokestatic floatToIntBits : (F)I
    //   19230: ldc_w 2117934119
    //   19233: ixor
    //   19234: invokestatic intBitsToFloat : (I)F
    //   19237: ldc_w 3.015135E38
    //   19240: invokestatic floatToIntBits : (F)I
    //   19243: ldc_w 2137183587
    //   19246: ixor
    //   19247: invokestatic intBitsToFloat : (I)F
    //   19250: ldc_w 7.761305E37
    //   19253: invokestatic floatToIntBits : (F)I
    //   19256: ldc_w 2120847083
    //   19259: ixor
    //   19260: invokestatic intBitsToFloat : (I)F
    //   19263: ldc_w 4.647226
    //   19266: invokestatic floatToIntBits : (F)I
    //   19269: ldc_w 2132063763
    //   19272: ixor
    //   19273: invokestatic intBitsToFloat : (I)F
    //   19276: getstatic Perryc.1 : I
    //   19279: ifeq -> 19293
    //   19282: ldc2_w -613298907
    //   19285: l2i
    //   19286: ldc_w 1503715637
    //   19289: ixor
    //   19290: goto -> 19301
    //   19293: ldc2_w -1364650313
    //   19296: l2i
    //   19297: ldc_w 845962692
    //   19300: ixor
    //   19301: ldc2_w -1144747901
    //   19304: l2i
    //   19305: ldc_w -1053585997
    //   19308: ixor
    //   19309: ixor
    //   19310: lookupswitch default -> 25040, -432910781 -> 19336, -131716832 -> 19293
    //   19336: goto -> 19340
    //   19339: athrow
    //   19340: invokestatic func_179131_c : (FFFF)V
    //   19343: goto -> 19347
    //   19346: athrow
    //   19347: getstatic Perryc.1 : I
    //   19350: ifeq -> 19364
    //   19353: ldc2_w -919892550
    //   19356: l2i
    //   19357: ldc_w -1423028176
    //   19360: ixor
    //   19361: goto -> 19372
    //   19364: ldc2_w 1992827845
    //   19367: l2i
    //   19368: ldc_w 358885704
    //   19371: ixor
    //   19372: ldc2_w -1293661152
    //   19375: l2i
    //   19376: ldc_w -931796182
    //   19379: ixor
    //   19380: ixor
    //   19381: lookupswitch default -> 25036, 412383872 -> 19364, 423472519 -> 19408
    //   19408: dload #10
    //   19410: getstatic Perryc.c : I
    //   19413: iflt -> 19427
    //   19416: ldc2_w 1645758839
    //   19419: l2i
    //   19420: ldc_w -139712947
    //   19423: ixor
    //   19424: goto -> 19435
    //   19427: ldc2_w -1607039864
    //   19430: l2i
    //   19431: ldc_w -1908179788
    //   19434: ixor
    //   19435: ldc2_w 983628730
    //   19438: l2i
    //   19439: ldc_w 1545386879
    //   19442: ixor
    //   19443: ixor
    //   19444: lookupswitch default -> 25046, -217567233 -> 19427, 1221179641 -> 19472
    //   19472: dload #16
    //   19474: dadd
    //   19475: getstatic Perryc.c : I
    //   19478: iflt -> 19492
    //   19481: ldc2_w 500385978
    //   19484: l2i
    //   19485: ldc_w 2088333896
    //   19488: ixor
    //   19489: goto -> 19500
    //   19492: ldc2_w 951865016
    //   19495: l2i
    //   19496: ldc_w -532840189
    //   19499: ixor
    //   19500: ldc2_w -1161023316
    //   19503: l2i
    //   19504: ldc_w -62259331
    //   19507: ixor
    //   19508: ixor
    //   19509: lookupswitch default -> 19536, -1145467752 -> 19492, 657454371 -> 24928
    //   19536: dstore #10
    //   19538: getstatic Perryc.0 : I
    //   19541: ifle -> 19555
    //   19544: ldc2_w 854765781
    //   19547: l2i
    //   19548: ldc_w -2129947188
    //   19551: ixor
    //   19552: goto -> 19563
    //   19555: ldc2_w 384206335
    //   19558: l2i
    //   19559: ldc_w 1337557481
    //   19562: ixor
    //   19563: ldc2_w -1369580573
    //   19566: l2i
    //   19567: ldc_w -1460407777
    //   19570: ixor
    //   19571: ixor
    //   19572: lookupswitch default -> 19600, -1782732011 -> 19555, -1252586267 -> 24810
    //   19600: dload #12
    //   19602: getstatic Perryc.1 : I
    //   19605: ifeq -> 19619
    //   19608: ldc2_w 213580944
    //   19611: l2i
    //   19612: ldc_w 714869550
    //   19615: ixor
    //   19616: goto -> 19627
    //   19619: ldc2_w -21763775
    //   19622: l2i
    //   19623: ldc_w -973841612
    //   19626: ixor
    //   19627: ldc2_w -450626419
    //   19630: l2i
    //   19631: ldc_w 305104860
    //   19634: ixor
    //   19635: ixor
    //   19636: lookupswitch default -> 19664, -785740561 -> 24828, 54430687 -> 19619
    //   19664: dload #18
    //   19666: dadd
    //   19667: getstatic Perryc.c : I
    //   19670: iflt -> 19684
    //   19673: ldc2_w 2050048522
    //   19676: l2i
    //   19677: ldc_w -1441839262
    //   19680: ixor
    //   19681: goto -> 19692
    //   19684: ldc2_w -2031557655
    //   19687: l2i
    //   19688: ldc_w 756023111
    //   19691: ixor
    //   19692: ldc2_w -1163671726
    //   19695: l2i
    //   19696: ldc_w -1744771734
    //   19699: ixor
    //   19700: ixor
    //   19701: lookupswitch default -> 19728, -1779492907 -> 19684, -224581808 -> 24686
    //   19728: dstore #12
    //   19730: getstatic Perryc.c : I
    //   19733: iflt -> 19747
    //   19736: ldc2_w 1288929268
    //   19739: l2i
    //   19740: ldc_w 430041450
    //   19743: ixor
    //   19744: goto -> 19755
    //   19747: ldc2_w -1701341686
    //   19750: l2i
    //   19751: ldc_w 569536066
    //   19754: ixor
    //   19755: ldc2_w -518406405
    //   19758: l2i
    //   19759: ldc_w -96674720
    //   19762: ixor
    //   19763: ixor
    //   19764: lookupswitch default -> 19792, -1472607757 -> 19747, 1314386949 -> 24904
    //   19792: dload #14
    //   19794: getstatic Perryc.c : I
    //   19797: iflt -> 19811
    //   19800: ldc2_w -1330992960
    //   19803: l2i
    //   19804: ldc_w 857266246
    //   19807: ixor
    //   19808: goto -> 19819
    //   19811: ldc2_w -1180858576
    //   19814: l2i
    //   19815: ldc_w 1217468086
    //   19818: ixor
    //   19819: ldc2_w -58484639
    //   19822: l2i
    //   19823: ldc_w -299336380
    //   19826: ixor
    //   19827: ixor
    //   19828: lookupswitch default -> 24858, -1860594269 -> 19811, -475564893 -> 19856
    //   19856: dload #20
    //   19858: dadd
    //   19859: getstatic Perryc.1 : I
    //   19862: ifeq -> 19876
    //   19865: ldc2_w 1839935224
    //   19868: l2i
    //   19869: ldc_w 1944687126
    //   19872: ixor
    //   19873: goto -> 19884
    //   19876: ldc2_w 1628285157
    //   19879: l2i
    //   19880: ldc_w -1264559435
    //   19883: ixor
    //   19884: ldc2_w -1187295616
    //   19887: l2i
    //   19888: ldc_w -418672514
    //   19891: ixor
    //   19892: ixor
    //   19893: lookupswitch default -> 19920, 1081238032 -> 25048, 1564776817 -> 19876
    //   19920: dstore #14
    //   19922: ldc_w 125.44271
    //   19925: invokestatic floatToIntBits : (F)I
    //   19928: ldc_w 2106036751
    //   19931: ixor
    //   19932: invokestatic intBitsToFloat : (I)F
    //   19935: getstatic Perryc.1 : I
    //   19938: ifeq -> 19952
    //   19941: ldc2_w 862140637
    //   19944: l2i
    //   19945: ldc_w 2043902561
    //   19948: ixor
    //   19949: goto -> 19960
    //   19952: ldc2_w 1330110622
    //   19955: l2i
    //   19956: ldc_w -1469750435
    //   19959: ixor
    //   19960: ldc2_w 2092937826
    //   19963: l2i
    //   19964: ldc_w -1649432264
    //   19967: ixor
    //   19968: ixor
    //   19969: lookupswitch default -> 19996, -1415554586 -> 24954, 339906648 -> 19952
    //   19996: fstore #35
    //   19998: getstatic Perryc.1 : I
    //   20001: ifeq -> 20015
    //   20004: ldc2_w 1451272751
    //   20007: l2i
    //   20008: ldc_w 2058970712
    //   20011: ixor
    //   20012: goto -> 20023
    //   20015: ldc2_w -1074755060
    //   20018: l2i
    //   20019: ldc_w -1223944607
    //   20022: ixor
    //   20023: ldc2_w 1072347890
    //   20026: l2i
    //   20027: ldc_w -1681225367
    //   20030: ixor
    //   20031: ixor
    //   20032: lookupswitch default -> 20060, -2011562004 -> 24648, 147611468 -> 20015
    //   20060: dload #16
    //   20062: getstatic Perryc.1 : I
    //   20065: ifeq -> 20079
    //   20068: ldc2_w 1527143128
    //   20071: l2i
    //   20072: ldc_w -1763178117
    //   20075: ixor
    //   20076: goto -> 20087
    //   20079: ldc2_w -53413223
    //   20082: l2i
    //   20083: ldc_w 266263554
    //   20086: ixor
    //   20087: ldc2_w 135631854
    //   20090: l2i
    //   20091: ldc_w 1173838971
    //   20094: ixor
    //   20095: ixor
    //   20096: lookupswitch default -> 24870, -2146657226 -> 20079, -1091770098 -> 20124
    //   20124: fload #35
    //   20126: f2d
    //   20127: dmul
    //   20128: getstatic Perryc.1 : I
    //   20131: ifeq -> 20145
    //   20134: ldc2_w -1306192600
    //   20137: l2i
    //   20138: ldc_w -1779393537
    //   20141: ixor
    //   20142: goto -> 20153
    //   20145: ldc2_w 2111915047
    //   20148: l2i
    //   20149: ldc_w -1187688596
    //   20152: ixor
    //   20153: ldc2_w -434497
    //   20156: l2i
    //   20157: ldc_w -757977988
    //   20160: ixor
    //   20161: ixor
    //   20162: lookupswitch default -> 24804, -369133176 -> 20188, 184482836 -> 20145
    //   20188: dstore #16
    //   20190: getstatic Perryc.c : I
    //   20193: iflt -> 20207
    //   20196: ldc2_w -1547960302
    //   20199: l2i
    //   20200: ldc_w 1372208577
    //   20203: ixor
    //   20204: goto -> 20215
    //   20207: ldc2_w -1981913475
    //   20210: l2i
    //   20211: ldc_w 1628995476
    //   20214: ixor
    //   20215: ldc2_w -1795471917
    //   20218: l2i
    //   20219: ldc_w 2104325359
    //   20222: ixor
    //   20223: ixor
    //   20224: lookupswitch default -> 24462, 22030549 -> 20252, 467668207 -> 20207
    //   20252: dload #18
    //   20254: getstatic Perryc.1 : I
    //   20257: ifeq -> 20271
    //   20260: ldc2_w -500649634
    //   20263: l2i
    //   20264: ldc_w 325367856
    //   20267: ixor
    //   20268: goto -> 20279
    //   20271: ldc2_w -1924193717
    //   20274: l2i
    //   20275: ldc_w 1276737984
    //   20278: ixor
    //   20279: ldc2_w 1844441663
    //   20282: l2i
    //   20283: ldc_w -123882875
    //   20286: ixor
    //   20287: ixor
    //   20288: lookupswitch default -> 24540, 1411652401 -> 20316, 1681803732 -> 20271
    //   20316: fload #35
    //   20318: f2d
    //   20319: dmul
    //   20320: getstatic Perryc.c : I
    //   20323: iflt -> 20337
    //   20326: ldc2_w 626845619
    //   20329: l2i
    //   20330: ldc_w -1070433260
    //   20333: ixor
    //   20334: goto -> 20345
    //   20337: ldc2_w 394284741
    //   20340: l2i
    //   20341: ldc_w -2141647718
    //   20344: ixor
    //   20345: ldc2_w -118323461
    //   20348: l2i
    //   20349: ldc_w -1438822721
    //   20352: ixor
    //   20353: ixor
    //   20354: lookupswitch default -> 20380, -1942583116 -> 20337, -1214163997 -> 24732
    //   20380: dstore #18
    //   20382: getstatic Perryc.0 : I
    //   20385: ifle -> 20399
    //   20388: ldc2_w 470367155
    //   20391: l2i
    //   20392: ldc_w -402695450
    //   20395: ixor
    //   20396: goto -> 20407
    //   20399: ldc2_w 1072859654
    //   20402: l2i
    //   20403: ldc_w 145089988
    //   20406: ixor
    //   20407: ldc2_w -1332096102
    //   20410: l2i
    //   20411: ldc_w 1721264039
    //   20414: ixor
    //   20415: ixor
    //   20416: lookupswitch default -> 24718, -514401281 -> 20444, 771216744 -> 20399
    //   20444: dload #20
    //   20446: getstatic Perryc.1 : I
    //   20449: ifeq -> 20463
    //   20452: ldc2_w -1661875041
    //   20455: l2i
    //   20456: ldc_w -630207414
    //   20459: ixor
    //   20460: goto -> 20471
    //   20463: ldc2_w -1468162558
    //   20466: l2i
    //   20467: ldc_w 938630620
    //   20470: ixor
    //   20471: ldc2_w 532836641
    //   20474: l2i
    //   20475: ldc_w -1950055405
    //   20478: ixor
    //   20479: ixor
    //   20480: lookupswitch default -> 20508, -1991530546 -> 20463, -761727513 -> 24514
    //   20508: fload #35
    //   20510: f2d
    //   20511: dmul
    //   20512: getstatic Perryc.c : I
    //   20515: iflt -> 20529
    //   20518: ldc2_w 1835557514
    //   20521: l2i
    //   20522: ldc_w 1090130650
    //   20525: ixor
    //   20526: goto -> 20537
    //   20529: ldc2_w -293456407
    //   20532: l2i
    //   20533: ldc_w -1894907545
    //   20536: ixor
    //   20537: ldc2_w 1382555598
    //   20540: l2i
    //   20541: ldc_w 1241052864
    //   20544: ixor
    //   20545: ixor
    //   20546: lookupswitch default -> 25068, 906139998 -> 20529, 2048712064 -> 20572
    //   20572: dstore #20
    //   20574: getstatic Perryc.1 : I
    //   20577: ifeq -> 20591
    //   20580: ldc2_w 264326664
    //   20583: l2i
    //   20584: ldc_w -762923512
    //   20587: ixor
    //   20588: goto -> 20599
    //   20591: ldc2_w 87133364
    //   20594: l2i
    //   20595: ldc_w 1457520717
    //   20598: ixor
    //   20599: ldc2_w 1480262457
    //   20602: l2i
    //   20603: ldc_w -457233619
    //   20606: ixor
    //   20607: ixor
    //   20608: lookupswitch default -> 24576, -279599891 -> 20636, 1640222740 -> 20591
    //   20636: dload #18
    //   20638: getstatic Perryc.1 : I
    //   20641: ifeq -> 20655
    //   20644: ldc2_w 415612728
    //   20647: l2i
    //   20648: ldc_w -1043597351
    //   20651: ixor
    //   20652: goto -> 20663
    //   20655: ldc2_w 191968587
    //   20658: l2i
    //   20659: ldc_w 171790182
    //   20662: ixor
    //   20663: ldc2_w -1354329361
    //   20666: l2i
    //   20667: ldc_w -1872601067
    //   20670: ixor
    //   20671: ixor
    //   20672: lookupswitch default -> 24946, -433407461 -> 20655, 1047038167 -> 20700
    //   20700: aload #9
    //   20702: instanceof net/minecraft/item/ItemBow
    //   20705: ifeq -> 20719
    //   20708: ldc2_w 959447983
    //   20711: l2i
    //   20712: ldc_w -121895753
    //   20715: ixor
    //   20716: goto -> 20727
    //   20719: ldc2_w 598156605
    //   20722: l2i
    //   20723: ldc_w -500489690
    //   20726: ixor
    //   20727: ldc2_w 1699183212
    //   20730: l2i
    //   20731: ldc_w -531005555
    //   20734: ixor
    //   20735: ixor
    //   20736: tableswitch default -> 20708, 1150419705 -> 20760, 1150419706 -> 20776
    //   20760: ldc2_w 59.10354306191611
    //   20763: invokestatic doubleToLongBits : (D)J
    //   20766: ldc2_w 9215513661889695164
    //   20769: lxor
    //   20770: invokestatic longBitsToDouble : (J)D
    //   20773: goto -> 20789
    //   20776: ldc2_w 9.478026523904687
    //   20779: invokestatic doubleToLongBits : (D)J
    //   20782: ldc2_w 9204316323792325551
    //   20785: lxor
    //   20786: invokestatic longBitsToDouble : (J)D
    //   20789: dsub
    //   20790: getstatic Perryc.0 : I
    //   20793: ifle -> 20807
    //   20796: ldc2_w -1028750184
    //   20799: l2i
    //   20800: ldc_w -1398258642
    //   20803: ixor
    //   20804: goto -> 20815
    //   20807: ldc2_w -1925849
    //   20810: l2i
    //   20811: ldc_w -905280933
    //   20814: ixor
    //   20815: ldc2_w -308744087
    //   20818: l2i
    //   20819: ldc_w 1056501522
    //   20822: ixor
    //   20823: ixor
    //   20824: lookupswitch default -> 25032, -1117331507 -> 20807, -427294713 -> 20852
    //   20852: dstore #18
    //   20854: goto -> 13078
    //   20857: getstatic Perryc.c : I
    //   20860: iflt -> 20874
    //   20863: ldc2_w -249515413
    //   20866: l2i
    //   20867: ldc_w 1879031791
    //   20870: ixor
    //   20871: goto -> 20882
    //   20874: ldc2_w 902295596
    //   20877: l2i
    //   20878: ldc_w -1048699260
    //   20881: ixor
    //   20882: ldc2_w -104092043
    //   20885: l2i
    //   20886: ldc_w -628108357
    //   20889: ixor
    //   20890: ixor
    //   20891: lookupswitch default -> 20916, -1650931221 -> 20874, -1113886646 -> 24708
    //   20916: aload #29
    //   20918: ifnull -> 20932
    //   20921: ldc2_w 372732622
    //   20924: l2i
    //   20925: ldc_w -1628648681
    //   20928: ixor
    //   20929: goto -> 20940
    //   20932: ldc2_w 1141695426
    //   20935: l2i
    //   20936: ldc_w -858301926
    //   20939: ixor
    //   20940: ldc2_w -825664895
    //   20943: l2i
    //   20944: ldc_w -785016572
    //   20947: ixor
    //   20948: ixor
    //   20949: tableswitch default -> 20921, -1759020452 -> 20972, -1759020451 -> 24255
    //   20972: getstatic Perryc.0 : I
    //   20975: ifle -> 20989
    //   20978: ldc2_w 2034341742
    //   20981: l2i
    //   20982: ldc_w -1687538148
    //   20985: ixor
    //   20986: goto -> 20997
    //   20989: ldc2_w 1978204130
    //   20992: l2i
    //   20993: ldc_w 556939432
    //   20996: ixor
    //   20997: ldc2_w 498984298
    //   21000: l2i
    //   21001: ldc_w -817919963
    //   21004: ixor
    //   21005: ixor
    //   21006: lookupswitch default -> 21032, 816434237 -> 25038, 1603753433 -> 20989
    //   21032: aload #29
    //   21034: getstatic Perryc.1 : I
    //   21037: ifeq -> 21051
    //   21040: ldc2_w -61933558
    //   21043: l2i
    //   21044: ldc_w -2016437782
    //   21047: ixor
    //   21048: goto -> 21059
    //   21051: ldc2_w 1374079341
    //   21054: l2i
    //   21055: ldc_w -818276069
    //   21058: ixor
    //   21059: ldc2_w 1637812289
    //   21062: l2i
    //   21063: ldc_w -841441341
    //   21066: ixor
    //   21067: ixor
    //   21068: lookupswitch default -> 21096, -854197414 -> 21051, -674826654 -> 24558
    //   21096: getfield field_72313_a : Lnet/minecraft/util/math/RayTraceResult$Type;
    //   21099: getstatic Perryc.0 : I
    //   21102: ifle -> 21116
    //   21105: ldc2_w 880340756
    //   21108: l2i
    //   21109: ldc_w -156999429
    //   21112: ixor
    //   21113: goto -> 21124
    //   21116: ldc2_w -629477013
    //   21119: l2i
    //   21120: ldc_w 1255335326
    //   21123: ixor
    //   21124: ldc2_w -1644022595
    //   21127: l2i
    //   21128: ldc_w -1020375611
    //   21131: ixor
    //   21132: ixor
    //   21133: lookupswitch default -> 25070, -1611598185 -> 21116, -846959219 -> 21160
    //   21160: getstatic net/minecraft/util/math/RayTraceResult$Type.BLOCK : Lnet/minecraft/util/math/RayTraceResult$Type;
    //   21163: if_acmpne -> 21177
    //   21166: ldc2_w -561199054
    //   21169: l2i
    //   21170: ldc_w -1502626644
    //   21173: ixor
    //   21174: goto -> 21185
    //   21177: ldc2_w 127254236
    //   21180: l2i
    //   21181: ldc_w 2138491459
    //   21184: ixor
    //   21185: ldc2_w 558683724
    //   21188: l2i
    //   21189: ldc_w -1803138520
    //   21192: ixor
    //   21193: ixor
    //   21194: tableswitch default -> 21166, -852891398 -> 21216, -852891397 -> 24255
    //   21216: getstatic Perryc.c : I
    //   21219: iflt -> 21233
    //   21222: ldc2_w -1770487845
    //   21225: l2i
    //   21226: ldc_w -1667647392
    //   21229: ixor
    //   21230: goto -> 21241
    //   21233: ldc2_w -2075945103
    //   21236: l2i
    //   21237: ldc_w -1676538209
    //   21240: ixor
    //   21241: ldc2_w 784910557
    //   21244: l2i
    //   21245: ldc_w -916519656
    //   21248: ixor
    //   21249: ixor
    //   21250: lookupswitch default -> 24966, -311031170 -> 21233, -3779541 -> 21276
    //   21276: dload #10
    //   21278: getstatic Perryc.1 : I
    //   21281: ifeq -> 21295
    //   21284: ldc2_w -809287925
    //   21287: l2i
    //   21288: ldc_w -1216882185
    //   21291: ixor
    //   21292: goto -> 21303
    //   21295: ldc2_w -1271096753
    //   21298: l2i
    //   21299: ldc_w -2106448174
    //   21302: ixor
    //   21303: ldc2_w -329205049
    //   21306: l2i
    //   21307: ldc_w -180708309
    //   21310: ixor
    //   21311: ixor
    //   21312: lookupswitch default -> 25002, 789879409 -> 21340, 1643036688 -> 21295
    //   21340: dload_3
    //   21341: dsub
    //   21342: getstatic Perryc.1 : I
    //   21345: ifeq -> 21359
    //   21348: ldc2_w 727798067
    //   21351: l2i
    //   21352: ldc_w -1762342523
    //   21355: ixor
    //   21356: goto -> 21367
    //   21359: ldc2_w 97188487
    //   21362: l2i
    //   21363: ldc_w 1749705193
    //   21366: ixor
    //   21367: ldc2_w 54636224
    //   21370: l2i
    //   21371: ldc_w -2049774743
    //   21374: ixor
    //   21375: ixor
    //   21376: lookupswitch default -> 21404, 990305567 -> 24670, 1642824204 -> 21359
    //   21404: dload #12
    //   21406: getstatic Perryc.c : I
    //   21409: iflt -> 21423
    //   21412: ldc2_w -403237330
    //   21415: l2i
    //   21416: ldc_w 1275314259
    //   21419: ixor
    //   21420: goto -> 21431
    //   21423: ldc2_w -1247552245
    //   21426: l2i
    //   21427: ldc_w 1773716069
    //   21430: ixor
    //   21431: ldc2_w -625132053
    //   21434: l2i
    //   21435: ldc_w 1954282095
    //   21438: ixor
    //   21439: ixor
    //   21440: lookupswitch default -> 24494, 87167481 -> 21423, 1927141610 -> 21468
    //   21468: dload #5
    //   21470: dsub
    //   21471: getstatic Perryc.0 : I
    //   21474: ifle -> 21488
    //   21477: ldc2_w 2113251906
    //   21480: l2i
    //   21481: ldc_w -1336695956
    //   21484: ixor
    //   21485: goto -> 21496
    //   21488: ldc2_w -2063373439
    //   21491: l2i
    //   21492: ldc_w 1649636451
    //   21495: ixor
    //   21496: ldc2_w -263750854
    //   21499: l2i
    //   21500: ldc_w 2111247187
    //   21503: ixor
    //   21504: ixor
    //   21505: lookupswitch default -> 24728, 1077305671 -> 21488, 1790998411 -> 21532
    //   21532: dload #14
    //   21534: getstatic Perryc.1 : I
    //   21537: ifeq -> 21551
    //   21540: ldc2_w 110629413
    //   21543: l2i
    //   21544: ldc_w -1987424962
    //   21547: ixor
    //   21548: goto -> 21559
    //   21551: ldc2_w -2059728160
    //   21554: l2i
    //   21555: ldc_w -1477380560
    //   21558: ixor
    //   21559: ldc2_w 1451398113
    //   21562: l2i
    //   21563: ldc_w -1809247789
    //   21566: ixor
    //   21567: ixor
    //   21568: lookupswitch default -> 24672, -530546974 -> 21596, 1304026409 -> 21551
    //   21596: dload #7
    //   21598: dsub
    //   21599: getstatic Perryc.c : I
    //   21602: iflt -> 21616
    //   21605: ldc2_w 2065750294
    //   21608: l2i
    //   21609: ldc_w 133145710
    //   21612: ixor
    //   21613: goto -> 21624
    //   21616: ldc2_w 1221850220
    //   21619: l2i
    //   21620: ldc_w -65995054
    //   21623: ixor
    //   21624: ldc2_w -149051442
    //   21627: l2i
    //   21628: ldc_w -541750196
    //   21631: ixor
    //   21632: ixor
    //   21633: lookupswitch default -> 21660, -247872023 -> 21616, 1416058618 -> 25094
    //   21660: goto -> 21664
    //   21663: athrow
    //   21664: invokestatic func_179137_b : (DDD)V
    //   21667: goto -> 21671
    //   21670: athrow
    //   21671: getstatic Perryc.1 : I
    //   21674: ifeq -> 21688
    //   21677: ldc2_w -254173590
    //   21680: l2i
    //   21681: ldc_w -1787524742
    //   21684: ixor
    //   21685: goto -> 21696
    //   21688: ldc2_w 859516390
    //   21691: l2i
    //   21692: ldc_w 2141835185
    //   21695: ixor
    //   21696: ldc2_w 1986247249
    //   21699: l2i
    //   21700: ldc_w -1857742936
    //   21703: ixor
    //   21704: ixor
    //   21705: lookupswitch default -> 21732, -2104771863 -> 24998, -552994162 -> 21688
    //   21732: aload #29
    //   21734: getstatic Perryc.1 : I
    //   21737: ifeq -> 21751
    //   21740: ldc2_w 765313299
    //   21743: l2i
    //   21744: ldc_w -473357608
    //   21747: ixor
    //   21748: goto -> 21759
    //   21751: ldc2_w 539269430
    //   21754: l2i
    //   21755: ldc_w -956679251
    //   21758: ixor
    //   21759: ldc2_w -1950293883
    //   21762: l2i
    //   21763: ldc_w -1466192649
    //   21766: ixor
    //   21767: ixor
    //   21768: lookupswitch default -> 24650, -981078295 -> 21796, -317739079 -> 21751
    //   21796: getfield field_178784_b : Lnet/minecraft/util/EnumFacing;
    //   21799: getstatic Perryc.0 : I
    //   21802: ifle -> 21816
    //   21805: ldc2_w -1944537486
    //   21808: l2i
    //   21809: ldc_w -245772465
    //   21812: ixor
    //   21813: goto -> 21824
    //   21816: ldc2_w 70946544
    //   21819: l2i
    //   21820: ldc_w 1591450061
    //   21823: ixor
    //   21824: ldc2_w 849122550
    //   21827: l2i
    //   21828: ldc_w -1514522239
    //   21831: ixor
    //   21832: ixor
    //   21833: lookupswitch default -> 24742, -842548662 -> 21860, -362294198 -> 21816
    //   21860: goto -> 21864
    //   21863: athrow
    //   21864: invokevirtual func_176745_a : ()I
    //   21867: goto -> 21871
    //   21870: athrow
    //   21871: getstatic Perryc.c : I
    //   21874: iflt -> 21888
    //   21877: ldc2_w 2133450240
    //   21880: l2i
    //   21881: ldc_w 1010803109
    //   21884: ixor
    //   21885: goto -> 21896
    //   21888: ldc2_w -538585441
    //   21891: l2i
    //   21892: ldc_w 610998251
    //   21895: ixor
    //   21896: ldc2_w -446151565
    //   21899: l2i
    //   21900: ldc_w -350098545
    //   21903: ixor
    //   21904: ixor
    //   21905: lookupswitch default -> 21932, 1298124889 -> 24766, 2018738615 -> 21888
    //   21932: istore #30
    //   21934: getstatic Perryc.0 : I
    //   21937: ifle -> 21951
    //   21940: ldc2_w 785350982
    //   21943: l2i
    //   21944: ldc_w 449106289
    //   21947: ixor
    //   21948: goto -> 21959
    //   21951: ldc2_w 1815363874
    //   21954: l2i
    //   21955: ldc_w -987424991
    //   21958: ixor
    //   21959: ldc2_w -1734033549
    //   21962: l2i
    //   21963: ldc_w -1241441736
    //   21966: ixor
    //   21967: ixor
    //   21968: lookupswitch default -> 24460, -2018184376 -> 21996, 447673724 -> 21951
    //   21996: iload #30
    //   21998: ldc2_w -2043263725
    //   22001: l2i
    //   22002: ldc_w -2043263727
    //   22005: ixor
    //   22006: if_icmpne -> 22020
    //   22009: ldc2_w 600902575
    //   22012: l2i
    //   22013: ldc_w 96482782
    //   22016: ixor
    //   22017: goto -> 22028
    //   22020: ldc2_w -1558110436
    //   22023: l2i
    //   22024: ldc_w -2060443286
    //   22027: ixor
    //   22028: ldc2_w 358953148
    //   22031: l2i
    //   22032: ldc_w -401752154
    //   22035: ixor
    //   22036: ixor
    //   22037: tableswitch default -> 22009, -612781717 -> 22060, -612781716 -> 22186
    //   22060: ldc_w 0.097691216
    //   22063: invokestatic floatToIntBits : (F)I
    //   22066: ldc_w 2138837589
    //   22069: ixor
    //   22070: invokestatic intBitsToFloat : (I)F
    //   22073: ldc_w 7.47698
    //   22076: invokestatic floatToIntBits : (F)I
    //   22079: ldc_w 2137998188
    //   22082: ixor
    //   22083: invokestatic intBitsToFloat : (I)F
    //   22086: ldc_w 2.3822187E38
    //   22089: invokestatic floatToIntBits : (F)I
    //   22092: ldc_w 2134063069
    //   22095: ixor
    //   22096: invokestatic intBitsToFloat : (I)F
    //   22099: ldc_w 5.442405E37
    //   22102: invokestatic floatToIntBits : (F)I
    //   22105: ldc_w 2116273859
    //   22108: ixor
    //   22109: invokestatic intBitsToFloat : (I)F
    //   22112: getstatic Perryc.c : I
    //   22115: iflt -> 22129
    //   22118: ldc2_w -816965609
    //   22121: l2i
    //   22122: ldc_w 1011593659
    //   22125: ixor
    //   22126: goto -> 22137
    //   22129: ldc2_w 590063888
    //   22132: l2i
    //   22133: ldc_w 1082307919
    //   22136: ixor
    //   22137: ldc2_w -1303199115
    //   22140: l2i
    //   22141: ldc_w 420350741
    //   22144: ixor
    //   22145: ixor
    //   22146: lookupswitch default -> 24616, -923413185 -> 22172, 1482252492 -> 22129
    //   22172: goto -> 22176
    //   22175: athrow
    //   22176: invokestatic func_179114_b : (FFFF)V
    //   22179: goto -> 22183
    //   22182: athrow
    //   22183: goto -> 22939
    //   22186: getstatic Perryc.c : I
    //   22189: iflt -> 22203
    //   22192: ldc2_w -337297756
    //   22195: l2i
    //   22196: ldc_w -1731025369
    //   22199: ixor
    //   22200: goto -> 22211
    //   22203: ldc2_w -1603687052
    //   22206: l2i
    //   22207: ldc_w -1692155988
    //   22210: ixor
    //   22211: ldc2_w 786555825
    //   22214: l2i
    //   22215: ldc_w -1488996645
    //   22218: ixor
    //   22219: ixor
    //   22220: lookupswitch default -> 22248, -270023578 -> 22203, -85340695 -> 24996
    //   22248: iload #30
    //   22250: ldc2_w 1541557257
    //   22253: l2i
    //   22254: ldc_w 1541557258
    //   22257: ixor
    //   22258: if_icmpne -> 22272
    //   22261: ldc2_w -317984653
    //   22264: l2i
    //   22265: ldc_w 1978451430
    //   22268: ixor
    //   22269: goto -> 22280
    //   22272: ldc2_w 1774779384
    //   22275: l2i
    //   22276: ldc_w -248525202
    //   22279: ixor
    //   22280: ldc2_w -1768362539
    //   22283: l2i
    //   22284: ldc_w 1929656325
    //   22287: ixor
    //   22288: ixor
    //   22289: tableswitch default -> 22261, 2105270341 -> 22312, 2105270342 -> 22438
    //   22312: ldc_w 0.06592159
    //   22315: invokestatic floatToIntBits : (F)I
    //   22318: ldc_w 2134049254
    //   22321: ixor
    //   22322: invokestatic intBitsToFloat : (I)F
    //   22325: ldc_w 10.679643
    //   22328: invokestatic floatToIntBits : (F)I
    //   22331: ldc_w 2125127633
    //   22334: ixor
    //   22335: invokestatic intBitsToFloat : (I)F
    //   22338: ldc_w 2.5401657E38
    //   22341: invokestatic floatToIntBits : (F)I
    //   22344: ldc_w 2134841808
    //   22347: ixor
    //   22348: invokestatic intBitsToFloat : (I)F
    //   22351: ldc_w 4.3310606E37
    //   22354: invokestatic floatToIntBits : (F)I
    //   22357: ldc_w 2114082119
    //   22360: ixor
    //   22361: invokestatic intBitsToFloat : (I)F
    //   22364: getstatic Perryc.c : I
    //   22367: iflt -> 22381
    //   22370: ldc2_w -2119606623
    //   22373: l2i
    //   22374: ldc_w -791707817
    //   22377: ixor
    //   22378: goto -> 22389
    //   22381: ldc2_w -1918957627
    //   22384: l2i
    //   22385: ldc_w -1806466419
    //   22388: ixor
    //   22389: ldc2_w 1765721621
    //   22392: l2i
    //   22393: ldc_w 1825577152
    //   22396: ixor
    //   22397: ixor
    //   22398: lookupswitch default -> 24698, 472013725 -> 22424, 1418264355 -> 22381
    //   22424: goto -> 22428
    //   22427: athrow
    //   22428: invokestatic func_179114_b : (FFFF)V
    //   22431: goto -> 22435
    //   22434: athrow
    //   22435: goto -> 22939
    //   22438: getstatic Perryc.0 : I
    //   22441: ifle -> 22455
    //   22444: ldc2_w 283507220
    //   22447: l2i
    //   22448: ldc_w 2088523976
    //   22451: ixor
    //   22452: goto -> 22463
    //   22455: ldc2_w -297563141
    //   22458: l2i
    //   22459: ldc_w 1854775608
    //   22462: ixor
    //   22463: ldc2_w -362743536
    //   22466: l2i
    //   22467: ldc_w 2048441128
    //   22470: ixor
    //   22471: ixor
    //   22472: lookupswitch default -> 22500, -674421087 -> 22455, -52305692 -> 24938
    //   22500: iload #30
    //   22502: ldc2_w -1633835301
    //   22505: l2i
    //   22506: ldc_w -1633835297
    //   22509: ixor
    //   22510: if_icmpne -> 22524
    //   22513: ldc2_w -2073572707
    //   22516: l2i
    //   22517: ldc_w -786104718
    //   22520: ixor
    //   22521: goto -> 22532
    //   22524: ldc2_w 1546362030
    //   22527: l2i
    //   22528: ldc_w 157853774
    //   22531: ixor
    //   22532: ldc2_w 90303592
    //   22535: l2i
    //   22536: ldc_w 2079947584
    //   22539: ixor
    //   22540: ixor
    //   22541: tableswitch default -> 22513, 735814599 -> 22564, 735814600 -> 22690
    //   22564: ldc_w 0.066753276
    //   22567: invokestatic floatToIntBits : (F)I
    //   22570: ldc_w 2134685169
    //   22573: ixor
    //   22574: invokestatic intBitsToFloat : (I)F
    //   22577: ldc_w 2.9900148E38
    //   22580: invokestatic floatToIntBits : (F)I
    //   22583: ldc_w 2137059735
    //   22586: ixor
    //   22587: invokestatic intBitsToFloat : (I)F
    //   22590: ldc_w 1.544691E38
    //   22593: invokestatic floatToIntBits : (F)I
    //   22596: ldc_w 2129161045
    //   22599: ixor
    //   22600: invokestatic intBitsToFloat : (I)F
    //   22603: ldc_w 7.286117
    //   22606: invokestatic floatToIntBits : (F)I
    //   22609: ldc_w 2137597919
    //   22612: ixor
    //   22613: invokestatic intBitsToFloat : (I)F
    //   22616: getstatic Perryc.0 : I
    //   22619: ifle -> 22633
    //   22622: ldc2_w 1164914412
    //   22625: l2i
    //   22626: ldc_w 814548229
    //   22629: ixor
    //   22630: goto -> 22641
    //   22633: ldc2_w -1851642943
    //   22636: l2i
    //   22637: ldc_w -117081783
    //   22640: ixor
    //   22641: ldc2_w -1709322977
    //   22644: l2i
    //   22645: ldc_w -860518647
    //   22648: ixor
    //   22649: ixor
    //   22650: lookupswitch default -> 22676, 454528888 -> 22633, 592077311 -> 25064
    //   22676: goto -> 22680
    //   22679: athrow
    //   22680: invokestatic func_179114_b : (FFFF)V
    //   22683: goto -> 22687
    //   22686: athrow
    //   22687: goto -> 22939
    //   22690: getstatic Perryc.0 : I
    //   22693: ifle -> 22707
    //   22696: ldc2_w 960377217
    //   22699: l2i
    //   22700: ldc_w -459438919
    //   22703: ixor
    //   22704: goto -> 22715
    //   22707: ldc2_w -1200221623
    //   22710: l2i
    //   22711: ldc_w -1781373148
    //   22714: ixor
    //   22715: ldc2_w -1531718522
    //   22718: l2i
    //   22719: ldc_w 1668710149
    //   22722: ixor
    //   22723: ixor
    //   22724: lookupswitch default -> 25022, -362684690 -> 22752, 442900155 -> 22707
    //   22752: iload #30
    //   22754: ldc2_w -1050304623
    //   22757: l2i
    //   22758: ldc_w -1050304620
    //   22761: ixor
    //   22762: if_icmpne -> 22776
    //   22765: ldc2_w -1964586564
    //   22768: l2i
    //   22769: ldc_w 198959744
    //   22772: ixor
    //   22773: goto -> 22784
    //   22776: ldc2_w -578270424
    //   22779: l2i
    //   22780: ldc_w 1555390491
    //   22783: ixor
    //   22784: ldc2_w 770037595
    //   22787: l2i
    //   22788: ldc_w -767665376
    //   22791: ixor
    //   22792: ixor
    //   22793: tableswitch default -> 22765, 2129045319 -> 22816, 2129045320 -> 22939
    //   22816: ldc_w 0.09969406
    //   22819: invokestatic floatToIntBits : (F)I
    //   22822: ldc_w 2138582118
    //   22825: ixor
    //   22826: invokestatic intBitsToFloat : (I)F
    //   22829: ldc_w 3.371259E38
    //   22832: invokestatic floatToIntBits : (F)I
    //   22835: ldc_w 2138939414
    //   22838: ixor
    //   22839: invokestatic intBitsToFloat : (I)F
    //   22842: ldc_w 2.3216236E38
    //   22845: invokestatic floatToIntBits : (F)I
    //   22848: ldc_w 2133764312
    //   22851: ixor
    //   22852: invokestatic intBitsToFloat : (I)F
    //   22855: ldc_w 76.023674
    //   22858: invokestatic floatToIntBits : (F)I
    //   22861: ldc_w 2098727967
    //   22864: ixor
    //   22865: invokestatic intBitsToFloat : (I)F
    //   22868: getstatic Perryc.0 : I
    //   22871: ifle -> 22885
    //   22874: ldc2_w -72359282
    //   22877: l2i
    //   22878: ldc_w 1821820052
    //   22881: ixor
    //   22882: goto -> 22893
    //   22885: ldc2_w -1577614772
    //   22888: l2i
    //   22889: ldc_w 704386669
    //   22892: ixor
    //   22893: ldc2_w 1226373666
    //   22896: l2i
    //   22897: ldc_w 71636836
    //   22900: ixor
    //   22901: ixor
    //   22902: lookupswitch default -> 24618, -984188569 -> 22928, -630928548 -> 22885
    //   22928: goto -> 22932
    //   22931: athrow
    //   22932: invokestatic func_179114_b : (FFFF)V
    //   22935: goto -> 22939
    //   22938: athrow
    //   22939: new org/lwjgl/util/glu/Cylinder
    //   22942: dup
    //   22943: getstatic Perryc.1 : I
    //   22946: ifeq -> 22960
    //   22949: ldc2_w -1986083094
    //   22952: l2i
    //   22953: ldc_w -1497637407
    //   22956: ixor
    //   22957: goto -> 22968
    //   22960: ldc2_w 2132434641
    //   22963: l2i
    //   22964: ldc_w 44033121
    //   22967: ixor
    //   22968: ldc2_w 1200985141
    //   22971: l2i
    //   22972: ldc_w -767585375
    //   22975: ixor
    //   22976: ixor
    //   22977: lookupswitch default -> 24496, -1165026145 -> 22960, -399524572 -> 23004
    //   23004: goto -> 23008
    //   23007: athrow
    //   23008: invokespecial <init> : ()V
    //   23011: goto -> 23015
    //   23014: athrow
    //   23015: getstatic Perryc.0 : I
    //   23018: ifle -> 23032
    //   23021: ldc2_w -781258590
    //   23024: l2i
    //   23025: ldc_w -1050963004
    //   23028: ixor
    //   23029: goto -> 23040
    //   23032: ldc2_w -1672900130
    //   23035: l2i
    //   23036: ldc_w 1499094559
    //   23039: ixor
    //   23040: ldc2_w -1304577359
    //   23043: l2i
    //   23044: ldc_w -201480106
    //   23047: ixor
    //   23048: ixor
    //   23049: lookupswitch default -> 24958, -2066490074 -> 23076, 1375039873 -> 23032
    //   23076: astore #31
    //   23078: ldc_w -1.0260676
    //   23081: invokestatic floatToIntBits : (F)I
    //   23084: ldc_w 2100778543
    //   23087: ixor
    //   23088: invokestatic intBitsToFloat : (I)F
    //   23091: ldc_w 27.503988
    //   23094: invokestatic floatToIntBits : (F)I
    //   23097: ldc_w 2119960619
    //   23100: ixor
    //   23101: invokestatic intBitsToFloat : (I)F
    //   23104: ldc_w 2.8589539E38
    //   23107: invokestatic floatToIntBits : (F)I
    //   23110: ldc_w 2136413555
    //   23113: ixor
    //   23114: invokestatic intBitsToFloat : (I)F
    //   23117: ldc_w 5.793684E37
    //   23120: invokestatic floatToIntBits : (F)I
    //   23123: ldc_w 2116966635
    //   23126: ixor
    //   23127: invokestatic intBitsToFloat : (I)F
    //   23130: getstatic Perryc.1 : I
    //   23133: ifeq -> 23147
    //   23136: ldc2_w 2111123931
    //   23139: l2i
    //   23140: ldc_w -1774705998
    //   23143: ixor
    //   23144: goto -> 23155
    //   23147: ldc2_w -311833223
    //   23150: l2i
    //   23151: ldc_w -2071322263
    //   23154: ixor
    //   23155: ldc2_w -1860352774
    //   23158: l2i
    //   23159: ldc_w 239208573
    //   23162: ixor
    //   23163: ixor
    //   23164: lookupswitch default -> 23192, -780614820 -> 23147, 1957847022 -> 24482
    //   23192: goto -> 23196
    //   23195: athrow
    //   23196: invokestatic func_179114_b : (FFFF)V
    //   23199: goto -> 23203
    //   23202: athrow
    //   23203: getstatic Perryc.c : I
    //   23206: iflt -> 23220
    //   23209: ldc2_w -547925050
    //   23212: l2i
    //   23213: ldc_w 708522729
    //   23216: ixor
    //   23217: goto -> 23228
    //   23220: ldc2_w -374616902
    //   23223: l2i
    //   23224: ldc_w -1943918596
    //   23227: ixor
    //   23228: ldc2_w -196428143
    //   23231: l2i
    //   23232: ldc_w -1880590425
    //   23235: ixor
    //   23236: ixor
    //   23237: lookupswitch default -> 24876, -1899059175 -> 23220, 506143344 -> 23264
    //   23264: aload #31
    //   23266: ldc2_w 1967350681
    //   23269: l2i
    //   23270: ldc_w 1967318322
    //   23273: ixor
    //   23274: getstatic Perryc.c : I
    //   23277: iflt -> 23291
    //   23280: ldc2_w -491405874
    //   23283: l2i
    //   23284: ldc_w -565141677
    //   23287: ixor
    //   23288: goto -> 23299
    //   23291: ldc2_w 192922796
    //   23294: l2i
    //   23295: ldc_w -385792134
    //   23298: ixor
    //   23299: ldc2_w -783114779
    //   23302: l2i
    //   23303: ldc_w 1584552506
    //   23306: ixor
    //   23307: ixor
    //   23308: lookupswitch default -> 24674, -1278876350 -> 23291, 1834894345 -> 23336
    //   23336: goto -> 23340
    //   23339: athrow
    //   23340: invokevirtual setDrawStyle : (I)V
    //   23343: goto -> 23347
    //   23346: athrow
    //   23347: getstatic Perryc.0 : I
    //   23350: ifle -> 23364
    //   23353: ldc2_w -14741389
    //   23356: l2i
    //   23357: ldc_w 1579771332
    //   23360: ixor
    //   23361: goto -> 23372
    //   23364: ldc2_w 323397675
    //   23367: l2i
    //   23368: ldc_w 849621733
    //   23371: ixor
    //   23372: ldc2_w -2049336686
    //   23375: l2i
    //   23376: ldc_w -766109093
    //   23379: ixor
    //   23380: ixor
    //   23381: lookupswitch default -> 24886, -155585154 -> 23364, 1986861575 -> 23408
    //   23408: aload #28
    //   23410: ifnull -> 23424
    //   23413: ldc2_w 730606368
    //   23416: l2i
    //   23417: ldc_w -848946840
    //   23420: ixor
    //   23421: goto -> 23432
    //   23424: ldc2_w -78477249
    //   23427: l2i
    //   23428: ldc_w 498645620
    //   23431: ixor
    //   23432: ldc2_w -460975667
    //   23435: l2i
    //   23436: ldc_w 942808276
    //   23439: ixor
    //   23440: ixor
    //   23441: tableswitch default -> 23413, 979255121 -> 23464, 979255122 -> 24067
    //   23464: ldc_w 1.941891E38
    //   23467: invokestatic floatToIntBits : (F)I
    //   23470: ldc_w 2131892086
    //   23473: ixor
    //   23474: invokestatic intBitsToFloat : (I)F
    //   23477: ldc_w 2.3469752E38
    //   23480: invokestatic floatToIntBits : (F)I
    //   23483: ldc_w 2133889305
    //   23486: ixor
    //   23487: invokestatic intBitsToFloat : (I)F
    //   23490: ldc_w 7.780687E37
    //   23493: invokestatic floatToIntBits : (F)I
    //   23496: ldc_w 2120885307
    //   23499: ixor
    //   23500: invokestatic intBitsToFloat : (I)F
    //   23503: ldc_w 27.585737
    //   23506: invokestatic floatToIntBits : (F)I
    //   23509: ldc_w 2120003479
    //   23512: ixor
    //   23513: invokestatic intBitsToFloat : (I)F
    //   23516: getstatic Perryc.1 : I
    //   23519: ifeq -> 23533
    //   23522: ldc2_w 1144063024
    //   23525: l2i
    //   23526: ldc_w 396129745
    //   23529: ixor
    //   23530: goto -> 23541
    //   23533: ldc2_w 641856165
    //   23536: l2i
    //   23537: ldc_w 2111294919
    //   23540: ixor
    //   23541: ldc2_w 1022328538
    //   23544: l2i
    //   23545: ldc_w -172071152
    //   23548: ixor
    //   23549: ixor
    //   23550: lookupswitch default -> 24780, -1832442200 -> 23576, -1694734293 -> 23533
    //   23576: goto -> 23580
    //   23579: athrow
    //   23580: invokestatic func_179131_c : (FFFF)V
    //   23583: goto -> 23587
    //   23586: athrow
    //   23587: ldc_w 0.36387822
    //   23590: invokestatic floatToIntBits : (F)I
    //   23593: ldc_w 2124041791
    //   23596: ixor
    //   23597: invokestatic intBitsToFloat : (I)F
    //   23600: getstatic Perryc.c : I
    //   23603: iflt -> 23617
    //   23606: ldc2_w -2056308024
    //   23609: l2i
    //   23610: ldc_w -691388349
    //   23613: ixor
    //   23614: goto -> 23625
    //   23617: ldc2_w 377812579
    //   23620: l2i
    //   23621: ldc_w -1866723283
    //   23624: ixor
    //   23625: ldc2_w -328222791
    //   23628: l2i
    //   23629: ldc_w -667043489
    //   23632: ixor
    //   23633: ixor
    //   23634: lookupswitch default -> 24636, -1301616472 -> 23660, 1744270445 -> 23617
    //   23660: goto -> 23664
    //   23663: athrow
    //   23664: invokestatic glLineWidth : (F)V
    //   23667: goto -> 23671
    //   23670: athrow
    //   23671: getstatic Perryc.1 : I
    //   23674: ifeq -> 23688
    //   23677: ldc2_w -87720294
    //   23680: l2i
    //   23681: ldc_w -1937845636
    //   23684: ixor
    //   23685: goto -> 23696
    //   23688: ldc2_w -953809844
    //   23691: l2i
    //   23692: ldc_w 1915286874
    //   23695: ixor
    //   23696: ldc2_w -1592293869
    //   23699: l2i
    //   23700: ldc_w -540906984
    //   23703: ixor
    //   23704: ixor
    //   23705: lookupswitch default -> 24794, -874832611 -> 23732, 141443309 -> 23688
    //   23732: aload #31
    //   23734: ldc_w 17.875952
    //   23737: invokestatic floatToIntBits : (F)I
    //   23740: ldc_w 2123798633
    //   23743: ixor
    //   23744: invokestatic intBitsToFloat : (I)F
    //   23747: ldc_w 7.7979264
    //   23750: invokestatic floatToIntBits : (F)I
    //   23753: ldc_w 2120225031
    //   23756: ixor
    //   23757: invokestatic intBitsToFloat : (I)F
    //   23760: ldc_w 3.3827202E38
    //   23763: invokestatic floatToIntBits : (F)I
    //   23766: ldc_w 2138995922
    //   23769: ixor
    //   23770: invokestatic intBitsToFloat : (I)F
    //   23773: ldc2_w 490286295
    //   23776: l2i
    //   23777: ldc_w 490286291
    //   23780: ixor
    //   23781: ldc2_w -1641866485
    //   23784: l2i
    //   23785: ldc_w -1641866486
    //   23788: ixor
    //   23789: getstatic Perryc.1 : I
    //   23792: ifeq -> 23806
    //   23795: ldc2_w 200616569
    //   23798: l2i
    //   23799: ldc_w 1675272763
    //   23802: ixor
    //   23803: goto -> 23814
    //   23806: ldc2_w -1840860840
    //   23809: l2i
    //   23810: ldc_w -555272670
    //   23813: ixor
    //   23814: ldc2_w -253375812
    //   23817: l2i
    //   23818: ldc_w -1286494273
    //   23821: ixor
    //   23822: ixor
    //   23823: lookupswitch default -> 24720, 253094521 -> 23848, 731637057 -> 23806
    //   23848: goto -> 23852
    //   23851: athrow
    //   23852: invokevirtual draw : (FFFII)V
    //   23855: goto -> 23859
    //   23858: athrow
    //   23859: ldc_w 86.306244
    //   23862: invokestatic floatToIntBits : (F)I
    //   23865: ldc_w 2137018369
    //   23868: ixor
    //   23869: invokestatic intBitsToFloat : (I)F
    //   23872: getstatic Perryc.c : I
    //   23875: iflt -> 23889
    //   23878: ldc2_w 844177455
    //   23881: l2i
    //   23882: ldc_w 732265142
    //   23885: ixor
    //   23886: goto -> 23897
    //   23889: ldc2_w 2070101034
    //   23892: l2i
    //   23893: ldc_w 1983732518
    //   23896: ixor
    //   23897: ldc2_w -30741200
    //   23900: l2i
    //   23901: ldc_w 1804040089
    //   23904: ixor
    //   23905: ixor
    //   23906: lookupswitch default -> 24712, -1940275152 -> 23889, -1728840283 -> 23932
    //   23932: goto -> 23936
    //   23935: athrow
    //   23936: invokestatic glLineWidth : (F)V
    //   23939: goto -> 23943
    //   23942: athrow
    //   23943: ldc_w 5.569619
    //   23946: invokestatic floatToIntBits : (F)I
    //   23949: ldc_w 2133998162
    //   23952: ixor
    //   23953: invokestatic intBitsToFloat : (I)F
    //   23956: ldc_w 8.2394363E37
    //   23959: invokestatic floatToIntBits : (F)I
    //   23962: ldc_w 2121790031
    //   23965: ixor
    //   23966: invokestatic intBitsToFloat : (I)F
    //   23969: ldc_w 3.4008974E38
    //   23972: invokestatic floatToIntBits : (F)I
    //   23975: ldc_w 2139085543
    //   23978: ixor
    //   23979: invokestatic intBitsToFloat : (I)F
    //   23982: ldc_w 6.1008725
    //   23985: invokestatic floatToIntBits : (F)I
    //   23988: ldc_w 2135112281
    //   23991: ixor
    //   23992: invokestatic intBitsToFloat : (I)F
    //   23995: getstatic Perryc.c : I
    //   23998: iflt -> 24012
    //   24001: ldc2_w 1874531177
    //   24004: l2i
    //   24005: ldc_w -575815829
    //   24008: ixor
    //   24009: goto -> 24020
    //   24012: ldc2_w -2049233537
    //   24015: l2i
    //   24016: ldc_w 724199887
    //   24019: ixor
    //   24020: ldc2_w -12940308
    //   24023: l2i
    //   24024: ldc_w 1112645252
    //   24027: ixor
    //   24028: ixor
    //   24029: lookupswitch default -> 24056, 204562776 -> 24012, 259897706 -> 24778
    //   24056: goto -> 24060
    //   24059: athrow
    //   24060: invokestatic func_179131_c : (FFFF)V
    //   24063: goto -> 24067
    //   24066: athrow
    //   24067: getstatic Perryc.c : I
    //   24070: iflt -> 24084
    //   24073: ldc2_w -1014901711
    //   24076: l2i
    //   24077: ldc_w -537516985
    //   24080: ixor
    //   24081: goto -> 24092
    //   24084: ldc2_w 1342590596
    //   24087: l2i
    //   24088: ldc_w -331924915
    //   24091: ixor
    //   24092: ldc2_w -628027192
    //   24095: l2i
    //   24096: ldc_w 1467141741
    //   24099: ixor
    //   24100: ixor
    //   24101: lookupswitch default -> 24770, -1852559661 -> 24084, 835889772 -> 24128
    //   24128: aload #31
    //   24130: ldc_w 3.367008
    //   24133: invokestatic floatToIntBits : (F)I
    //   24136: ldc_w 2135876757
    //   24139: ixor
    //   24140: invokestatic intBitsToFloat : (I)F
    //   24143: ldc_w 29.81478
    //   24146: invokestatic floatToIntBits : (F)I
    //   24149: ldc_w 2138512689
    //   24152: ixor
    //   24153: invokestatic intBitsToFloat : (I)F
    //   24156: ldc_w 3.2061464E38
    //   24159: invokestatic floatToIntBits : (F)I
    //   24162: ldc_w 2138125346
    //   24165: ixor
    //   24166: invokestatic intBitsToFloat : (I)F
    //   24169: ldc2_w 127409263
    //   24172: l2i
    //   24173: ldc_w 127409259
    //   24176: ixor
    //   24177: ldc2_w 963806193
    //   24180: l2i
    //   24181: ldc_w 963806192
    //   24184: ixor
    //   24185: getstatic Perryc.1 : I
    //   24188: ifeq -> 24202
    //   24191: ldc2_w -18289429
    //   24194: l2i
    //   24195: ldc_w 1310027152
    //   24198: ixor
    //   24199: goto -> 24210
    //   24202: ldc2_w 1032753007
    //   24205: l2i
    //   24206: ldc_w -2066832775
    //   24209: ixor
    //   24210: ldc2_w -1605699744
    //   24213: l2i
    //   24214: ldc_w 151073341
    //   24217: ixor
    //   24218: ixor
    //   24219: lookupswitch default -> 24944, 269215819 -> 24244, 431375398 -> 24202
    //   24244: goto -> 24248
    //   24247: athrow
    //   24248: invokevirtual draw : (FFFII)V
    //   24251: goto -> 24255
    //   24254: athrow
    //   24255: getstatic Perryc.1 : I
    //   24258: ifeq -> 24272
    //   24261: ldc2_w -729816986
    //   24264: l2i
    //   24265: ldc_w -1619033154
    //   24268: ixor
    //   24269: goto -> 24280
    //   24272: ldc2_w 1436403081
    //   24275: l2i
    //   24276: ldc_w 81205026
    //   24279: ixor
    //   24280: ldc2_w -769763126
    //   24283: l2i
    //   24284: ldc_w 194824778
    //   24287: ixor
    //   24288: ixor
    //   24289: lookupswitch default -> 24566, -2000142293 -> 24316, -1836912296 -> 24272
    //   24316: aload_0
    //   24317: getstatic Perryc.c : I
    //   24320: iflt -> 24334
    //   24323: ldc2_w 1513319557
    //   24326: l2i
    //   24327: ldc_w 1437596459
    //   24330: ixor
    //   24331: goto -> 24342
    //   24334: ldc2_w -449832116
    //   24337: l2i
    //   24338: ldc_w 266797573
    //   24341: ixor
    //   24342: ldc2_w 2073863249
    //   24345: l2i
    //   24346: ldc_w 776723158
    //   24349: ixor
    //   24350: ixor
    //   24351: lookupswitch default -> 25080, -1090492466 -> 24376, 1514924329 -> 24334
    //   24376: goto -> 24380
    //   24379: athrow
    //   24380: invokevirtual disableGL3D : ()V
    //   24383: goto -> 24387
    //   24386: athrow
    //   24387: getstatic Perryc.1 : I
    //   24390: ifeq -> 24404
    //   24393: ldc2_w -1493160933
    //   24396: l2i
    //   24397: ldc_w -1797594942
    //   24400: ixor
    //   24401: goto -> 24412
    //   24404: ldc2_w -306331074
    //   24407: l2i
    //   24408: ldc_w -1548825815
    //   24411: ixor
    //   24412: ldc2_w 1294126605
    //   24415: l2i
    //   24416: ldc_w -611275036
    //   24419: ixor
    //   24420: ixor
    //   24421: lookupswitch default -> 24798, -1519866832 -> 24404, -660510210 -> 24448
    //   24448: goto -> 24452
    //   24451: athrow
    //   24452: invokestatic glPopMatrix : ()V
    //   24455: goto -> 24459
    //   24458: athrow
    //   24459: return
    //   24460: aconst_null
    //   24461: athrow
    //   24462: aconst_null
    //   24463: athrow
    //   24464: aconst_null
    //   24465: athrow
    //   24466: aconst_null
    //   24467: athrow
    //   24468: aconst_null
    //   24469: athrow
    //   24470: aconst_null
    //   24471: athrow
    //   24472: aconst_null
    //   24473: athrow
    //   24474: aconst_null
    //   24475: athrow
    //   24476: aconst_null
    //   24477: athrow
    //   24478: aconst_null
    //   24479: athrow
    //   24480: aconst_null
    //   24481: athrow
    //   24482: aconst_null
    //   24483: athrow
    //   24484: aconst_null
    //   24485: athrow
    //   24486: aconst_null
    //   24487: athrow
    //   24488: aconst_null
    //   24489: athrow
    //   24490: aconst_null
    //   24491: athrow
    //   24492: aconst_null
    //   24493: athrow
    //   24494: aconst_null
    //   24495: athrow
    //   24496: aconst_null
    //   24497: athrow
    //   24498: aconst_null
    //   24499: athrow
    //   24500: aconst_null
    //   24501: athrow
    //   24502: aconst_null
    //   24503: athrow
    //   24504: aconst_null
    //   24505: athrow
    //   24506: aconst_null
    //   24507: athrow
    //   24508: aconst_null
    //   24509: athrow
    //   24510: aconst_null
    //   24511: athrow
    //   24512: aconst_null
    //   24513: athrow
    //   24514: aconst_null
    //   24515: athrow
    //   24516: aconst_null
    //   24517: athrow
    //   24518: aconst_null
    //   24519: athrow
    //   24520: aconst_null
    //   24521: athrow
    //   24522: aconst_null
    //   24523: athrow
    //   24524: aconst_null
    //   24525: athrow
    //   24526: aconst_null
    //   24527: athrow
    //   24528: aconst_null
    //   24529: athrow
    //   24530: aconst_null
    //   24531: athrow
    //   24532: aconst_null
    //   24533: athrow
    //   24534: aconst_null
    //   24535: athrow
    //   24536: aconst_null
    //   24537: athrow
    //   24538: aconst_null
    //   24539: athrow
    //   24540: aconst_null
    //   24541: athrow
    //   24542: aconst_null
    //   24543: athrow
    //   24544: aconst_null
    //   24545: athrow
    //   24546: aconst_null
    //   24547: athrow
    //   24548: aconst_null
    //   24549: athrow
    //   24550: aconst_null
    //   24551: athrow
    //   24552: aconst_null
    //   24553: athrow
    //   24554: aconst_null
    //   24555: athrow
    //   24556: aconst_null
    //   24557: athrow
    //   24558: aconst_null
    //   24559: athrow
    //   24560: aconst_null
    //   24561: athrow
    //   24562: aconst_null
    //   24563: athrow
    //   24564: aconst_null
    //   24565: athrow
    //   24566: aconst_null
    //   24567: athrow
    //   24568: aconst_null
    //   24569: athrow
    //   24570: aconst_null
    //   24571: athrow
    //   24572: aconst_null
    //   24573: athrow
    //   24574: aconst_null
    //   24575: athrow
    //   24576: aconst_null
    //   24577: athrow
    //   24578: aconst_null
    //   24579: athrow
    //   24580: aconst_null
    //   24581: athrow
    //   24582: aconst_null
    //   24583: athrow
    //   24584: aconst_null
    //   24585: athrow
    //   24586: aconst_null
    //   24587: athrow
    //   24588: aconst_null
    //   24589: athrow
    //   24590: aconst_null
    //   24591: athrow
    //   24592: aconst_null
    //   24593: athrow
    //   24594: aconst_null
    //   24595: athrow
    //   24596: aconst_null
    //   24597: athrow
    //   24598: aconst_null
    //   24599: athrow
    //   24600: aconst_null
    //   24601: athrow
    //   24602: aconst_null
    //   24603: athrow
    //   24604: aconst_null
    //   24605: athrow
    //   24606: aconst_null
    //   24607: athrow
    //   24608: aconst_null
    //   24609: athrow
    //   24610: aconst_null
    //   24611: athrow
    //   24612: aconst_null
    //   24613: athrow
    //   24614: aconst_null
    //   24615: athrow
    //   24616: aconst_null
    //   24617: athrow
    //   24618: aconst_null
    //   24619: athrow
    //   24620: aconst_null
    //   24621: athrow
    //   24622: aconst_null
    //   24623: athrow
    //   24624: aconst_null
    //   24625: athrow
    //   24626: aconst_null
    //   24627: athrow
    //   24628: aconst_null
    //   24629: athrow
    //   24630: aconst_null
    //   24631: athrow
    //   24632: aconst_null
    //   24633: athrow
    //   24634: aconst_null
    //   24635: athrow
    //   24636: aconst_null
    //   24637: athrow
    //   24638: aconst_null
    //   24639: athrow
    //   24640: aconst_null
    //   24641: athrow
    //   24642: aconst_null
    //   24643: athrow
    //   24644: aconst_null
    //   24645: athrow
    //   24646: aconst_null
    //   24647: athrow
    //   24648: aconst_null
    //   24649: athrow
    //   24650: aconst_null
    //   24651: athrow
    //   24652: aconst_null
    //   24653: athrow
    //   24654: aconst_null
    //   24655: athrow
    //   24656: aconst_null
    //   24657: athrow
    //   24658: aconst_null
    //   24659: athrow
    //   24660: aconst_null
    //   24661: athrow
    //   24662: aconst_null
    //   24663: athrow
    //   24664: aconst_null
    //   24665: athrow
    //   24666: aconst_null
    //   24667: athrow
    //   24668: aconst_null
    //   24669: athrow
    //   24670: aconst_null
    //   24671: athrow
    //   24672: aconst_null
    //   24673: athrow
    //   24674: aconst_null
    //   24675: athrow
    //   24676: aconst_null
    //   24677: athrow
    //   24678: aconst_null
    //   24679: athrow
    //   24680: aconst_null
    //   24681: athrow
    //   24682: aconst_null
    //   24683: athrow
    //   24684: aconst_null
    //   24685: athrow
    //   24686: aconst_null
    //   24687: athrow
    //   24688: aconst_null
    //   24689: athrow
    //   24690: aconst_null
    //   24691: athrow
    //   24692: aconst_null
    //   24693: athrow
    //   24694: aconst_null
    //   24695: athrow
    //   24696: aconst_null
    //   24697: athrow
    //   24698: aconst_null
    //   24699: athrow
    //   24700: aconst_null
    //   24701: athrow
    //   24702: aconst_null
    //   24703: athrow
    //   24704: aconst_null
    //   24705: athrow
    //   24706: aconst_null
    //   24707: athrow
    //   24708: aconst_null
    //   24709: athrow
    //   24710: aconst_null
    //   24711: athrow
    //   24712: aconst_null
    //   24713: athrow
    //   24714: aconst_null
    //   24715: athrow
    //   24716: aconst_null
    //   24717: athrow
    //   24718: aconst_null
    //   24719: athrow
    //   24720: aconst_null
    //   24721: athrow
    //   24722: aconst_null
    //   24723: athrow
    //   24724: aconst_null
    //   24725: athrow
    //   24726: aconst_null
    //   24727: athrow
    //   24728: aconst_null
    //   24729: athrow
    //   24730: aconst_null
    //   24731: athrow
    //   24732: aconst_null
    //   24733: athrow
    //   24734: aconst_null
    //   24735: athrow
    //   24736: aconst_null
    //   24737: athrow
    //   24738: aconst_null
    //   24739: athrow
    //   24740: aconst_null
    //   24741: athrow
    //   24742: aconst_null
    //   24743: athrow
    //   24744: aconst_null
    //   24745: athrow
    //   24746: aconst_null
    //   24747: athrow
    //   24748: aconst_null
    //   24749: athrow
    //   24750: aconst_null
    //   24751: athrow
    //   24752: aconst_null
    //   24753: athrow
    //   24754: aconst_null
    //   24755: athrow
    //   24756: aconst_null
    //   24757: athrow
    //   24758: aconst_null
    //   24759: athrow
    //   24760: aconst_null
    //   24761: athrow
    //   24762: aconst_null
    //   24763: athrow
    //   24764: aconst_null
    //   24765: athrow
    //   24766: aconst_null
    //   24767: athrow
    //   24768: aconst_null
    //   24769: athrow
    //   24770: aconst_null
    //   24771: athrow
    //   24772: aconst_null
    //   24773: athrow
    //   24774: aconst_null
    //   24775: athrow
    //   24776: aconst_null
    //   24777: athrow
    //   24778: aconst_null
    //   24779: athrow
    //   24780: aconst_null
    //   24781: athrow
    //   24782: aconst_null
    //   24783: athrow
    //   24784: aconst_null
    //   24785: athrow
    //   24786: aconst_null
    //   24787: athrow
    //   24788: aconst_null
    //   24789: athrow
    //   24790: aconst_null
    //   24791: athrow
    //   24792: aconst_null
    //   24793: athrow
    //   24794: aconst_null
    //   24795: athrow
    //   24796: aconst_null
    //   24797: athrow
    //   24798: aconst_null
    //   24799: athrow
    //   24800: aconst_null
    //   24801: athrow
    //   24802: aconst_null
    //   24803: athrow
    //   24804: aconst_null
    //   24805: athrow
    //   24806: aconst_null
    //   24807: athrow
    //   24808: aconst_null
    //   24809: athrow
    //   24810: aconst_null
    //   24811: athrow
    //   24812: aconst_null
    //   24813: athrow
    //   24814: aconst_null
    //   24815: athrow
    //   24816: aconst_null
    //   24817: athrow
    //   24818: aconst_null
    //   24819: athrow
    //   24820: aconst_null
    //   24821: athrow
    //   24822: aconst_null
    //   24823: athrow
    //   24824: aconst_null
    //   24825: athrow
    //   24826: aconst_null
    //   24827: athrow
    //   24828: aconst_null
    //   24829: athrow
    //   24830: aconst_null
    //   24831: athrow
    //   24832: aconst_null
    //   24833: athrow
    //   24834: aconst_null
    //   24835: athrow
    //   24836: aconst_null
    //   24837: athrow
    //   24838: aconst_null
    //   24839: athrow
    //   24840: aconst_null
    //   24841: athrow
    //   24842: aconst_null
    //   24843: athrow
    //   24844: aconst_null
    //   24845: athrow
    //   24846: aconst_null
    //   24847: athrow
    //   24848: aconst_null
    //   24849: athrow
    //   24850: aconst_null
    //   24851: athrow
    //   24852: aconst_null
    //   24853: athrow
    //   24854: aconst_null
    //   24855: athrow
    //   24856: aconst_null
    //   24857: athrow
    //   24858: aconst_null
    //   24859: athrow
    //   24860: aconst_null
    //   24861: athrow
    //   24862: aconst_null
    //   24863: athrow
    //   24864: aconst_null
    //   24865: athrow
    //   24866: aconst_null
    //   24867: athrow
    //   24868: aconst_null
    //   24869: athrow
    //   24870: aconst_null
    //   24871: athrow
    //   24872: aconst_null
    //   24873: athrow
    //   24874: aconst_null
    //   24875: athrow
    //   24876: aconst_null
    //   24877: athrow
    //   24878: aconst_null
    //   24879: athrow
    //   24880: aconst_null
    //   24881: athrow
    //   24882: aconst_null
    //   24883: athrow
    //   24884: aconst_null
    //   24885: athrow
    //   24886: aconst_null
    //   24887: athrow
    //   24888: aconst_null
    //   24889: athrow
    //   24890: aconst_null
    //   24891: athrow
    //   24892: aconst_null
    //   24893: athrow
    //   24894: aconst_null
    //   24895: athrow
    //   24896: aconst_null
    //   24897: athrow
    //   24898: aconst_null
    //   24899: athrow
    //   24900: aconst_null
    //   24901: athrow
    //   24902: aconst_null
    //   24903: athrow
    //   24904: aconst_null
    //   24905: athrow
    //   24906: aconst_null
    //   24907: athrow
    //   24908: aconst_null
    //   24909: athrow
    //   24910: aconst_null
    //   24911: athrow
    //   24912: aconst_null
    //   24913: athrow
    //   24914: aconst_null
    //   24915: athrow
    //   24916: aconst_null
    //   24917: athrow
    //   24918: aconst_null
    //   24919: athrow
    //   24920: aconst_null
    //   24921: athrow
    //   24922: aconst_null
    //   24923: athrow
    //   24924: aconst_null
    //   24925: athrow
    //   24926: aconst_null
    //   24927: athrow
    //   24928: aconst_null
    //   24929: athrow
    //   24930: aconst_null
    //   24931: athrow
    //   24932: aconst_null
    //   24933: athrow
    //   24934: aconst_null
    //   24935: athrow
    //   24936: aconst_null
    //   24937: athrow
    //   24938: aconst_null
    //   24939: athrow
    //   24940: aconst_null
    //   24941: athrow
    //   24942: aconst_null
    //   24943: athrow
    //   24944: aconst_null
    //   24945: athrow
    //   24946: aconst_null
    //   24947: athrow
    //   24948: aconst_null
    //   24949: athrow
    //   24950: aconst_null
    //   24951: athrow
    //   24952: aconst_null
    //   24953: athrow
    //   24954: aconst_null
    //   24955: athrow
    //   24956: aconst_null
    //   24957: athrow
    //   24958: aconst_null
    //   24959: athrow
    //   24960: aconst_null
    //   24961: athrow
    //   24962: aconst_null
    //   24963: athrow
    //   24964: aconst_null
    //   24965: athrow
    //   24966: aconst_null
    //   24967: athrow
    //   24968: aconst_null
    //   24969: athrow
    //   24970: aconst_null
    //   24971: athrow
    //   24972: aconst_null
    //   24973: athrow
    //   24974: aconst_null
    //   24975: athrow
    //   24976: aconst_null
    //   24977: athrow
    //   24978: aconst_null
    //   24979: athrow
    //   24980: aconst_null
    //   24981: athrow
    //   24982: aconst_null
    //   24983: athrow
    //   24984: aconst_null
    //   24985: athrow
    //   24986: aconst_null
    //   24987: athrow
    //   24988: aconst_null
    //   24989: athrow
    //   24990: aconst_null
    //   24991: athrow
    //   24992: aconst_null
    //   24993: athrow
    //   24994: aconst_null
    //   24995: athrow
    //   24996: aconst_null
    //   24997: athrow
    //   24998: aconst_null
    //   24999: athrow
    //   25000: aconst_null
    //   25001: athrow
    //   25002: aconst_null
    //   25003: athrow
    //   25004: aconst_null
    //   25005: athrow
    //   25006: aconst_null
    //   25007: athrow
    //   25008: aconst_null
    //   25009: athrow
    //   25010: aconst_null
    //   25011: athrow
    //   25012: aconst_null
    //   25013: athrow
    //   25014: aconst_null
    //   25015: athrow
    //   25016: aconst_null
    //   25017: athrow
    //   25018: aconst_null
    //   25019: athrow
    //   25020: aconst_null
    //   25021: athrow
    //   25022: aconst_null
    //   25023: athrow
    //   25024: aconst_null
    //   25025: athrow
    //   25026: aconst_null
    //   25027: athrow
    //   25028: aconst_null
    //   25029: athrow
    //   25030: aconst_null
    //   25031: athrow
    //   25032: aconst_null
    //   25033: athrow
    //   25034: aconst_null
    //   25035: athrow
    //   25036: aconst_null
    //   25037: athrow
    //   25038: aconst_null
    //   25039: athrow
    //   25040: aconst_null
    //   25041: athrow
    //   25042: aconst_null
    //   25043: athrow
    //   25044: aconst_null
    //   25045: athrow
    //   25046: aconst_null
    //   25047: athrow
    //   25048: aconst_null
    //   25049: athrow
    //   25050: aconst_null
    //   25051: athrow
    //   25052: aconst_null
    //   25053: athrow
    //   25054: aconst_null
    //   25055: athrow
    //   25056: aconst_null
    //   25057: athrow
    //   25058: aconst_null
    //   25059: athrow
    //   25060: aconst_null
    //   25061: athrow
    //   25062: aconst_null
    //   25063: athrow
    //   25064: aconst_null
    //   25065: athrow
    //   25066: aconst_null
    //   25067: athrow
    //   25068: aconst_null
    //   25069: athrow
    //   25070: aconst_null
    //   25071: athrow
    //   25072: aconst_null
    //   25073: athrow
    //   25074: aconst_null
    //   25075: athrow
    //   25076: aconst_null
    //   25077: athrow
    //   25078: aconst_null
    //   25079: athrow
    //   25080: aconst_null
    //   25081: athrow
    //   25082: aconst_null
    //   25083: athrow
    //   25084: aconst_null
    //   25085: athrow
    //   25086: aconst_null
    //   25087: athrow
    //   25088: aconst_null
    //   25089: athrow
    //   25090: aconst_null
    //   25091: athrow
    //   25092: aconst_null
    //   25093: athrow
    //   25094: aconst_null
    //   25095: athrow
    //   25096: pop
    //   25097: goto -> 24
    //   25100: pop
    //   25101: aconst_null
    //   25102: goto -> 25096
    //   25105: dup
    //   25106: ifnull -> 25096
    //   25109: checkcast java/lang/Throwable
    //   25112: athrow
    //   25113: dup
    //   25114: ifnull -> 25100
    //   25117: checkcast java/lang/Throwable
    //   25120: athrow
    //   25121: aconst_null
    //   25122: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   17418	1688	37	boundingBox	Lnet/minecraft/entity/Entity;
    //   17866	1240	38	var7	F
    //   18330	776	39	var8	Lnet/minecraft/util/math/AxisAlignedBB;
    //   18658	448	40	possibleEntityLanding	Lnet/minecraft/util/math/RayTraceResult;
    //   17290	1816	36	entity	Ljava/lang/Object;
    //   13654	7200	30	present	Lnet/minecraft/util/math/Vec3d;
    //   14178	6676	31	future	Lnet/minecraft/util/math/Vec3d;
    //   14594	6260	32	possibleLandingStrip	Lnet/minecraft/util/math/RayTraceResult;
    //   16062	4792	33	arrowBox	Lnet/minecraft/util/math/AxisAlignedBB;
    //   16698	4156	34	entities	Ljava/util/List;
    //   19998	856	35	motionAdjustment	F
    //   21934	2321	30	side	I
    //   23078	1177	31	c	Lorg/lwjgl/util/glu/Cylinder;
    //   24	24436	0	this	Lbigname/zprestige/webhack/features/modules/Render/Trajectories;
    //   24	24436	1	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   24	24436	2	partialTicks	F
    //   521	23939	3	renderPosX	D
    //   1018	23442	5	renderPosY	D
    //   1518	22942	7	renderPosZ	D
    //   4306	20154	9	item	Lnet/minecraft/item/Item;
    //   4670	19790	10	posX	D
    //   4946	19514	12	posY	D
    //   5314	19146	14	posZ	D
    //   5978	18482	16	motionX	D
    //   6418	18042	18	motionY	D
    //   7082	17378	20	motionZ	D
    //   7286	17174	22	var6	I
    //   7426	17034	23	power	F
    //   8434	16026	24	distance	F
    //   9822	14638	25	pow	F
    //   12878	11582	26	size	F
    //   12950	11510	27	hasLanded	Z
    //   13014	11446	28	landingOnEntity	Lnet/minecraft/entity/Entity;
    //   13078	11382	29	landingPosition	Lnet/minecraft/util/math/RayTraceResult;
    // Exception table:
    //   from	to	target	type
    //   8	20	25105	java/lang/IndexOutOfBoundsException
    //   1707	1714	1714	finally
    //   1707	1714	1707	java/lang/IllegalStateException
    //   1707	1714	3	finally
    //   1708	1714	1707	java/util/NoSuchElementException
    //   1708	1714	1714	java/util/NoSuchElementException
    //   2147	2154	2154	finally
    //   2147	2154	3	finally
    //   2147	2154	2147	finally
    //   2147	2154	3	finally
    //   2148	2154	2154	finally
    //   2219	2226	2226	finally
    //   2219	2226	2219	java/lang/IllegalStateException
    //   2219	2226	3	finally
    //   2219	2226	3	finally
    //   2220	2226	3	java/util/ConcurrentModificationException
    //   2471	2478	2478	finally
    //   2471	2478	2471	java/lang/EnumConstantNotPresentException
    //   2471	2478	2471	java/lang/ArrayIndexOutOfBoundsException
    //   2471	2478	2478	java/util/NoSuchElementException
    //   2472	2478	3	finally
    //   2543	2550	2550	finally
    //   2543	2550	2550	java/lang/NegativeArraySizeException
    //   2543	2550	2543	java/lang/StringIndexOutOfBoundsException
    //   2543	2550	2550	finally
    //   2544	2550	2543	java/lang/AssertionError
    //   2795	2802	2802	finally
    //   2795	2802	2802	java/lang/NegativeArraySizeException
    //   2795	2802	2795	java/lang/ClassCastException
    //   2795	2802	2795	finally
    //   2796	2802	2795	finally
    //   2867	2874	2874	finally
    //   2867	2874	2867	finally
    //   2867	2874	3	finally
    //   2867	2874	2867	java/lang/ArithmeticException
    //   2868	2874	2874	java/lang/ArrayIndexOutOfBoundsException
    //   3119	3126	3126	finally
    //   3119	3126	3	finally
    //   3119	3126	3119	finally
    //   3119	3126	3119	finally
    //   3119	3126	3119	java/lang/ArithmeticException
    //   3191	3198	3198	finally
    //   3191	3198	3198	java/lang/RuntimeException
    //   3191	3198	3191	finally
    //   3192	3198	3191	java/util/ConcurrentModificationException
    //   3192	3198	3198	java/lang/NegativeArraySizeException
    //   3443	3450	3450	finally
    //   3444	3450	3443	finally
    //   3444	3450	3443	finally
    //   3444	3450	3443	finally
    //   3444	3450	3	finally
    //   3515	3522	3522	finally
    //   3515	3522	3515	java/lang/ArithmeticException
    //   3515	3522	3515	finally
    //   3516	3522	3	java/lang/RuntimeException
    //   3516	3522	3522	finally
    //   3767	3774	3774	finally
    //   3767	3774	3774	finally
    //   3767	3774	3774	finally
    //   3767	3774	3767	java/lang/AssertionError
    //   3768	3774	3767	finally
    //   3840	3846	3846	finally
    //   3840	3846	3846	java/lang/IllegalArgumentException
    //   3840	3846	3	finally
    //   3840	3846	3	java/lang/NullPointerException
    //   3840	3846	3	finally
    //   3967	3974	3974	finally
    //   3967	3974	3967	finally
    //   3968	3974	3967	finally
    //   3968	3974	3974	finally
    //   3968	3974	3967	finally
    //   4163	4170	4170	finally
    //   4163	4170	4163	finally
    //   4163	4170	4163	finally
    //   4163	4170	4170	finally
    //   4164	4170	4163	java/lang/RuntimeException
    //   4235	4242	4242	finally
    //   4235	4242	4242	finally
    //   4235	4242	3	finally
    //   4235	4242	4235	java/lang/RuntimeException
    //   4236	4242	3	finally
    //   4583	4590	4590	finally
    //   4583	4590	4590	finally
    //   4584	4590	3	finally
    //   4584	4590	3	finally
    //   4584	4590	4583	java/lang/ClassCastException
    //   4859	4866	4866	finally
    //   4859	4866	4859	java/lang/NullPointerException
    //   4859	4866	4859	java/lang/IllegalArgumentException
    //   4859	4866	3	finally
    //   4860	4866	4859	finally
    //   5228	5234	5234	finally
    //   5228	5234	5234	finally
    //   5228	5234	5234	finally
    //   5228	5234	5234	finally
    //   5228	5234	3	java/lang/UnsupportedOperationException
    //   5531	5538	5538	finally
    //   5531	5538	5538	java/lang/StringIndexOutOfBoundsException
    //   5531	5538	3	finally
    //   5531	5538	5531	java/lang/EnumConstantNotPresentException
    //   5532	5538	5538	java/lang/IllegalStateException
    //   5755	5762	5762	finally
    //   5755	5762	5755	java/lang/AssertionError
    //   5755	5762	5762	finally
    //   5755	5762	3	java/lang/IllegalArgumentException
    //   5756	5762	3	java/lang/UnsupportedOperationException
    //   6195	6202	6202	finally
    //   6195	6202	3	finally
    //   6195	6202	6195	finally
    //   6195	6202	6202	finally
    //   6196	6202	6195	java/lang/AssertionError
    //   6635	6642	6642	finally
    //   6635	6642	3	finally
    //   6635	6642	6635	java/lang/UnsupportedOperationException
    //   6635	6642	6635	java/lang/StringIndexOutOfBoundsException
    //   6636	6642	3	java/lang/NegativeArraySizeException
    //   6859	6866	6866	finally
    //   6860	6866	3	java/lang/AssertionError
    //   6860	6866	6859	finally
    //   6860	6866	3	finally
    //   6860	6866	6859	finally
    //   7215	7222	7222	finally
    //   7215	7222	7215	finally
    //   7216	7222	3	finally
    //   7216	7222	7215	finally
    //   7216	7222	7215	finally
    //   8363	8370	8370	finally
    //   8363	8370	3	finally
    //   8363	8370	3	finally
    //   8364	8370	8363	finally
    //   8364	8370	3	java/lang/IndexOutOfBoundsException
    //   9535	9542	9542	finally
    //   9536	9542	9535	java/lang/AssertionError
    //   9536	9542	9535	java/lang/AssertionError
    //   9536	9542	9535	finally
    //   9536	9542	3	finally
    //   9607	9614	9614	finally
    //   9607	9614	9607	java/lang/StringIndexOutOfBoundsException
    //   9607	9614	9607	java/lang/EnumConstantNotPresentException
    //   9607	9614	9614	finally
    //   9608	9614	9607	java/lang/ClassCastException
    //   10275	10282	10282	finally
    //   10275	10282	10275	java/lang/StringIndexOutOfBoundsException
    //   10276	10282	10275	java/lang/ArrayIndexOutOfBoundsException
    //   10276	10282	10282	java/lang/IllegalArgumentException
    //   10276	10282	10282	java/lang/ArrayIndexOutOfBoundsException
    //   10348	10354	10354	finally
    //   10348	10354	10354	java/lang/ClassCastException
    //   10348	10354	3	finally
    //   10348	10354	10354	finally
    //   10348	10354	10354	java/lang/RuntimeException
    //   11019	11026	11026	finally
    //   11019	11026	3	java/lang/ArrayIndexOutOfBoundsException
    //   11019	11026	11019	finally
    //   11020	11026	3	finally
    //   11020	11026	11019	finally
    //   11091	11098	11098	finally
    //   11091	11098	11091	finally
    //   11091	11098	11091	finally
    //   11092	11098	11098	finally
    //   11092	11098	3	finally
    //   11764	11770	11770	finally
    //   11764	11770	3	finally
    //   11764	11770	11770	java/lang/IndexOutOfBoundsException
    //   11764	11770	11770	java/lang/ArithmeticException
    //   11764	11770	3	java/lang/NullPointerException
    //   11836	11842	11842	finally
    //   11836	11842	11842	finally
    //   11836	11842	11842	finally
    //   11836	11842	11842	finally
    //   11836	11842	11842	java/util/NoSuchElementException
    //   12195	12202	12202	finally
    //   12195	12202	12202	finally
    //   12196	12202	3	java/lang/EnumConstantNotPresentException
    //   12196	12202	12195	java/lang/ArithmeticException
    //   12196	12202	12195	finally
    //   12447	12454	12454	finally
    //   12447	12454	12447	java/lang/ArrayIndexOutOfBoundsException
    //   12447	12454	12454	java/util/ConcurrentModificationException
    //   12447	12454	3	finally
    //   12448	12454	12447	finally
    //   12575	12582	12582	finally
    //   12575	12582	12582	finally
    //   12575	12582	12582	java/lang/IndexOutOfBoundsException
    //   12575	12582	12575	java/lang/NullPointerException
    //   12576	12582	12575	java/util/ConcurrentModificationException
    //   12655	12662	12662	finally
    //   12655	12662	12655	java/lang/IllegalArgumentException
    //   12655	12662	3	java/lang/ClassCastException
    //   12656	12662	3	finally
    //   12656	12662	12655	java/lang/EnumConstantNotPresentException
    //   13583	13590	13590	finally
    //   13584	13590	3	java/lang/NegativeArraySizeException
    //   13584	13590	13583	java/lang/NullPointerException
    //   13584	13590	3	java/lang/StringIndexOutOfBoundsException
    //   13584	13590	13583	finally
    //   14107	14114	14114	finally
    //   14107	14114	14114	finally
    //   14107	14114	3	java/lang/IndexOutOfBoundsException
    //   14108	14114	14107	finally
    //   14108	14114	14114	finally
    //   14523	14530	14530	finally
    //   14523	14530	14523	java/lang/IllegalStateException
    //   14524	14530	14523	finally
    //   14524	14530	3	finally
    //   14524	14530	14523	finally
    //   15991	15998	15998	finally
    //   15991	15998	3	finally
    //   15991	15998	15998	finally
    //   15991	15998	15991	finally
    //   15992	15998	15991	java/lang/AssertionError
    //   16444	16450	16450	finally
    //   16444	16450	3	finally
    //   16444	16450	16450	finally
    //   16444	16450	3	finally
    //   16444	16450	3	java/lang/NegativeArraySizeException
    //   16556	16562	16562	finally
    //   16556	16562	16562	java/lang/IllegalArgumentException
    //   16556	16562	16562	java/lang/UnsupportedOperationException
    //   16556	16562	3	finally
    //   16556	16562	3	java/lang/EnumConstantNotPresentException
    //   16627	16634	16634	finally
    //   16627	16634	16627	java/lang/NullPointerException
    //   16627	16634	16627	java/lang/ArrayIndexOutOfBoundsException
    //   16628	16634	16627	finally
    //   16628	16634	3	java/lang/ArithmeticException
    //   16827	16836	16836	finally
    //   16827	16836	16836	finally
    //   16827	16836	16836	java/lang/EnumConstantNotPresentException
    //   16828	16836	3	java/lang/UnsupportedOperationException
    //   16828	16836	16827	java/util/NoSuchElementException
    //   17027	17036	17036	finally
    //   17027	17036	17027	finally
    //   17028	17036	17027	java/lang/AssertionError
    //   17028	17036	17036	finally
    //   17028	17036	17027	java/lang/ArrayIndexOutOfBoundsException
    //   17219	17228	17228	finally
    //   17219	17228	17219	java/lang/StringIndexOutOfBoundsException
    //   17220	17228	17219	finally
    //   17220	17228	17228	java/util/NoSuchElementException
    //   17220	17228	3	java/lang/ArrayIndexOutOfBoundsException
    //   17547	17554	17554	finally
    //   17547	17554	17547	java/lang/RuntimeException
    //   17547	17554	17547	java/lang/NullPointerException
    //   17548	17554	17554	java/lang/IndexOutOfBoundsException
    //   17548	17554	3	java/lang/NullPointerException
    //   17996	18002	18002	finally
    //   17996	18002	18002	java/util/ConcurrentModificationException
    //   17996	18002	3	finally
    //   17996	18002	3	java/lang/NegativeArraySizeException
    //   17996	18002	18002	finally
    //   18259	18266	18266	finally
    //   18259	18266	3	java/lang/NegativeArraySizeException
    //   18259	18266	3	finally
    //   18259	18266	18259	java/lang/NullPointerException
    //   18260	18266	18266	finally
    //   18587	18594	18594	finally
    //   18587	18594	18594	java/lang/RuntimeException
    //   18588	18594	18587	finally
    //   18588	18594	3	java/lang/ClassCastException
    //   18588	18594	18594	finally
    //   19339	19346	19346	finally
    //   19339	19346	19339	java/util/NoSuchElementException
    //   19340	19346	19339	java/lang/StringIndexOutOfBoundsException
    //   19340	19346	3	finally
    //   19340	19346	19339	finally
    //   21663	21670	21670	finally
    //   21664	21670	3	finally
    //   21664	21670	21670	java/lang/NumberFormatException
    //   21664	21670	21663	finally
    //   21664	21670	21670	finally
    //   21863	21870	21870	finally
    //   21863	21870	3	finally
    //   21864	21870	21870	java/lang/NullPointerException
    //   21864	21870	21870	java/util/NoSuchElementException
    //   21864	21870	21863	java/lang/RuntimeException
    //   22176	22182	22182	finally
    //   22176	22182	3	finally
    //   22176	22182	22182	finally
    //   22176	22182	3	java/lang/IllegalArgumentException
    //   22176	22182	22182	java/lang/IllegalStateException
    //   22427	22434	22434	finally
    //   22427	22434	3	finally
    //   22428	22434	22427	java/lang/NumberFormatException
    //   22428	22434	3	java/util/ConcurrentModificationException
    //   22428	22434	22434	finally
    //   22679	22686	22686	finally
    //   22679	22686	22679	java/lang/IllegalArgumentException
    //   22679	22686	3	java/lang/IndexOutOfBoundsException
    //   22679	22686	3	finally
    //   22680	22686	3	finally
    //   22931	22938	22938	finally
    //   22931	22938	22938	java/lang/NumberFormatException
    //   22931	22938	22938	finally
    //   22932	22938	22938	java/lang/AssertionError
    //   22932	22938	22931	java/lang/StringIndexOutOfBoundsException
    //   23008	23014	23014	finally
    //   23008	23014	23014	java/lang/RuntimeException
    //   23008	23014	23014	finally
    //   23008	23014	3	finally
    //   23008	23014	23014	finally
    //   23195	23202	23202	finally
    //   23195	23202	23195	java/lang/EnumConstantNotPresentException
    //   23196	23202	3	java/lang/StringIndexOutOfBoundsException
    //   23196	23202	23202	java/lang/ClassCastException
    //   23196	23202	23202	java/lang/StringIndexOutOfBoundsException
    //   23339	23346	23346	finally
    //   23339	23346	23339	finally
    //   23339	23346	3	java/lang/AssertionError
    //   23339	23346	3	finally
    //   23340	23346	23339	finally
    //   23579	23586	23586	finally
    //   23579	23586	23579	finally
    //   23580	23586	23579	finally
    //   23580	23586	23586	java/lang/AssertionError
    //   23580	23586	3	java/lang/NumberFormatException
    //   23663	23670	23670	finally
    //   23663	23670	3	finally
    //   23663	23670	23663	finally
    //   23663	23670	3	finally
    //   23664	23670	23670	java/lang/AssertionError
    //   23852	23858	23858	finally
    //   23852	23858	3	java/lang/IndexOutOfBoundsException
    //   23852	23858	23858	finally
    //   23852	23858	23858	java/lang/IllegalArgumentException
    //   23852	23858	3	finally
    //   23935	23942	23942	finally
    //   23935	23942	3	finally
    //   23935	23942	23935	java/lang/StringIndexOutOfBoundsException
    //   23936	23942	23942	java/lang/EnumConstantNotPresentException
    //   23936	23942	23942	finally
    //   24060	24066	24066	finally
    //   24060	24066	3	java/lang/NumberFormatException
    //   24060	24066	24066	finally
    //   24060	24066	3	finally
    //   24060	24066	3	finally
    //   24247	24254	24254	finally
    //   24247	24254	24254	java/lang/ArithmeticException
    //   24248	24254	24247	java/lang/IndexOutOfBoundsException
    //   24248	24254	24254	finally
    //   24248	24254	3	finally
    //   24379	24386	24386	finally
    //   24379	24386	24386	finally
    //   24379	24386	24379	finally
    //   24379	24386	3	finally
    //   24379	24386	24386	java/lang/ClassCastException
    //   24451	24458	24458	finally
    //   24451	24458	24451	finally
    //   24451	24458	3	java/lang/NegativeArraySizeException
    //   24452	24458	24458	java/lang/IllegalStateException
    //   24452	24458	24451	java/lang/EnumConstantNotPresentException
    //   25105	25113	25105	finally
    //   25121	25123	3	finally
  }
  
  public void enableGL3D(float paramFloat) {
    Perry1.0Z(this, (int)306730754L ^ 0x22E8E034, paramFloat);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public List getEntitiesWithinAABB(AxisAlignedBB bb) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3213
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 3205
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3197
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.0 : I
    //   31: ifle -> 45
    //   34: ldc2_w 548816710
    //   37: l2i
    //   38: ldc_w -761969060
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 581629748
    //   48: l2i
    //   49: ldc_w -519469650
    //   52: ixor
    //   53: ldc2_w 1114841327
    //   56: l2i
    //   57: ldc_w 1438213355
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -437697250 -> 3156, 1745930300 -> 45
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.1 : I
    //   102: ifeq -> 116
    //   105: ldc2_w -1998904725
    //   108: l2i
    //   109: ldc_w 751728983
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w -1741415044
    //   119: l2i
    //   120: ldc_w 1572569635
    //   123: ixor
    //   124: ldc2_w 1090951375
    //   127: l2i
    //   128: ldc_w -501686554
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 160, 118168853 -> 3124, 937653532 -> 116
    //   160: astore_2
    //   161: getstatic Perryc.c : I
    //   164: iflt -> 178
    //   167: ldc2_w -284561099
    //   170: l2i
    //   171: ldc_w -1422411442
    //   174: ixor
    //   175: goto -> 186
    //   178: ldc2_w 1631152760
    //   181: l2i
    //   182: ldc_w -2096307133
    //   185: ixor
    //   186: ldc2_w 1038248036
    //   189: l2i
    //   190: ldc_w -535291584
    //   193: ixor
    //   194: ixor
    //   195: lookupswitch default -> 220, -2004008337 -> 178, -1715193505 -> 3162
    //   220: aload_1
    //   221: getstatic Perryc.0 : I
    //   224: ifle -> 238
    //   227: ldc2_w 1415203428
    //   230: l2i
    //   231: ldc_w -496016387
    //   234: ixor
    //   235: goto -> 246
    //   238: ldc2_w -897694999
    //   241: l2i
    //   242: ldc_w 1630090449
    //   245: ixor
    //   246: ldc2_w 825984153
    //   249: l2i
    //   250: ldc_w -2093304786
    //   253: ixor
    //   254: ixor
    //   255: lookupswitch default -> 280, 70523182 -> 3152, 2078839354 -> 238
    //   280: getfield field_72340_a : D
    //   283: ldc2_w 0.9237170204878409
    //   286: invokestatic doubleToLongBits : (D)J
    //   289: ldc2_w 9218181341231193970
    //   292: lxor
    //   293: invokestatic longBitsToDouble : (J)D
    //   296: dsub
    //   297: ldc2_w 0.9622434378326837
    //   300: invokestatic doubleToLongBits : (D)J
    //   303: ldc2_w 9214024756721419783
    //   306: lxor
    //   307: invokestatic longBitsToDouble : (J)D
    //   310: ddiv
    //   311: getstatic Perryc.c : I
    //   314: iflt -> 328
    //   317: ldc2_w -751001223
    //   320: l2i
    //   321: ldc_w 1898280254
    //   324: ixor
    //   325: goto -> 336
    //   328: ldc2_w 812941472
    //   331: l2i
    //   332: ldc_w -404194294
    //   335: ixor
    //   336: ldc2_w -1916986879
    //   339: l2i
    //   340: ldc_w -1308503464
    //   343: ixor
    //   344: ixor
    //   345: lookupswitch default -> 3132, -1650123746 -> 328, -400542477 -> 372
    //   372: goto -> 376
    //   375: athrow
    //   376: invokestatic func_76128_c : (D)I
    //   379: goto -> 383
    //   382: athrow
    //   383: getstatic Perryc.1 : I
    //   386: ifeq -> 400
    //   389: ldc2_w 1106188131
    //   392: l2i
    //   393: ldc_w 1092307040
    //   396: ixor
    //   397: goto -> 408
    //   400: ldc2_w -1847936793
    //   403: l2i
    //   404: ldc_w -1759965494
    //   407: ixor
    //   408: ldc2_w -1740782844
    //   411: l2i
    //   412: ldc_w -499417382
    //   415: ixor
    //   416: ixor
    //   417: lookupswitch default -> 3178, 2062738141 -> 400, 2093288435 -> 444
    //   444: istore_3
    //   445: getstatic Perryc.1 : I
    //   448: ifeq -> 462
    //   451: ldc2_w 497063152
    //   454: l2i
    //   455: ldc_w 359427115
    //   458: ixor
    //   459: goto -> 470
    //   462: ldc2_w -1592011169
    //   465: l2i
    //   466: ldc_w 898884849
    //   469: ixor
    //   470: ldc2_w 2092436289
    //   473: l2i
    //   474: ldc_w 554147221
    //   477: ixor
    //   478: ixor
    //   479: lookupswitch default -> 504, 1025480615 -> 462, 1433628175 -> 3142
    //   504: aload_1
    //   505: getstatic Perryc.c : I
    //   508: iflt -> 522
    //   511: ldc2_w 907449240
    //   514: l2i
    //   515: ldc_w 679718534
    //   518: ixor
    //   519: goto -> 530
    //   522: ldc2_w 1216452309
    //   525: l2i
    //   526: ldc_w -109270606
    //   529: ixor
    //   530: ldc2_w 1872422485
    //   533: l2i
    //   534: ldc_w 1647570031
    //   537: ixor
    //   538: ixor
    //   539: lookupswitch default -> 564, -1795272064 -> 522, 322713380 -> 3126
    //   564: getfield field_72336_d : D
    //   567: ldc2_w 0.015183800972505044
    //   570: invokestatic doubleToLongBits : (D)J
    //   573: ldc2_w 9191592505539877055
    //   576: lxor
    //   577: invokestatic longBitsToDouble : (J)D
    //   580: dadd
    //   581: ldc2_w 0.011345515396797635
    //   584: invokestatic doubleToLongBits : (D)J
    //   587: ldc2_w 9202890683431460871
    //   590: lxor
    //   591: invokestatic longBitsToDouble : (J)D
    //   594: ddiv
    //   595: getstatic Perryc.1 : I
    //   598: ifeq -> 612
    //   601: ldc2_w -1372318077
    //   604: l2i
    //   605: ldc_w -2073512234
    //   608: ixor
    //   609: goto -> 620
    //   612: ldc2_w 1822262054
    //   615: l2i
    //   616: ldc_w -529066311
    //   619: ixor
    //   620: ldc2_w 439604383
    //   623: l2i
    //   624: ldc_w -368409350
    //   627: ixor
    //   628: ixor
    //   629: lookupswitch default -> 656, -632835281 -> 612, -630853584 -> 3120
    //   656: goto -> 660
    //   659: athrow
    //   660: invokestatic func_76128_c : (D)I
    //   663: goto -> 667
    //   666: athrow
    //   667: getstatic Perryc.1 : I
    //   670: ifeq -> 684
    //   673: ldc2_w -304772466
    //   676: l2i
    //   677: ldc_w -1708769054
    //   680: ixor
    //   681: goto -> 692
    //   684: ldc2_w 1918150929
    //   687: l2i
    //   688: ldc_w -1151452366
    //   691: ixor
    //   692: ldc2_w 1832592789
    //   695: l2i
    //   696: ldc_w -787857711
    //   699: ixor
    //   700: ixor
    //   701: lookupswitch default -> 3114, -876424920 -> 684, 1966836071 -> 728
    //   728: istore #4
    //   730: getstatic Perryc.c : I
    //   733: iflt -> 747
    //   736: ldc2_w 633774016
    //   739: l2i
    //   740: ldc_w -1066747591
    //   743: ixor
    //   744: goto -> 755
    //   747: ldc2_w 1648721532
    //   750: l2i
    //   751: ldc_w 1268158631
    //   754: ixor
    //   755: ldc2_w -1329566974
    //   758: l2i
    //   759: ldc_w -90589811
    //   762: ixor
    //   763: ixor
    //   764: lookupswitch default -> 3122, -1342834570 -> 747, 1670000724 -> 792
    //   792: aload_1
    //   793: getstatic Perryc.0 : I
    //   796: ifle -> 810
    //   799: ldc2_w -1378880676
    //   802: l2i
    //   803: ldc_w -130083174
    //   806: ixor
    //   807: goto -> 818
    //   810: ldc2_w -2056281467
    //   813: l2i
    //   814: ldc_w -1025358210
    //   817: ixor
    //   818: ldc2_w -1037351753
    //   821: l2i
    //   822: ldc_w 1990867138
    //   825: ixor
    //   826: ixor
    //   827: lookupswitch default -> 852, -512648781 -> 3106, 455990158 -> 810
    //   852: getfield field_72339_c : D
    //   855: ldc2_w 0.8078892901641486
    //   858: invokestatic doubleToLongBits : (D)J
    //   861: ldc2_w 9217138057784944068
    //   864: lxor
    //   865: invokestatic longBitsToDouble : (J)D
    //   868: dsub
    //   869: ldc2_w 0.010460461340067615
    //   872: invokestatic doubleToLongBits : (D)J
    //   875: ldc2_w 9202380484504089087
    //   878: lxor
    //   879: invokestatic longBitsToDouble : (J)D
    //   882: ddiv
    //   883: getstatic Perryc.1 : I
    //   886: ifeq -> 900
    //   889: ldc2_w 1462309262
    //   892: l2i
    //   893: ldc_w 2076206903
    //   896: ixor
    //   897: goto -> 908
    //   900: ldc2_w -399902439
    //   903: l2i
    //   904: ldc_w -2095013465
    //   907: ixor
    //   908: ldc2_w -11307019
    //   911: l2i
    //   912: ldc_w 750069419
    //   915: ixor
    //   916: ixor
    //   917: lookupswitch default -> 3128, -1192293920 -> 944, -15783961 -> 900
    //   944: goto -> 948
    //   947: athrow
    //   948: invokestatic func_76128_c : (D)I
    //   951: goto -> 955
    //   954: athrow
    //   955: getstatic Perryc.0 : I
    //   958: ifle -> 972
    //   961: ldc2_w 733103154
    //   964: l2i
    //   965: ldc_w -1788265080
    //   968: ixor
    //   969: goto -> 980
    //   972: ldc2_w -779904
    //   975: l2i
    //   976: ldc_w 326124563
    //   979: ixor
    //   980: ldc2_w 1401761428
    //   983: l2i
    //   984: ldc_w -507995843
    //   987: ixor
    //   988: ixor
    //   989: lookupswitch default -> 1016, -548163828 -> 972, 216976915 -> 3166
    //   1016: istore #5
    //   1018: getstatic Perryc.0 : I
    //   1021: ifle -> 1035
    //   1024: ldc2_w -1976569646
    //   1027: l2i
    //   1028: ldc_w -2029850489
    //   1031: ixor
    //   1032: goto -> 1043
    //   1035: ldc2_w -680450326
    //   1038: l2i
    //   1039: ldc_w 1418386517
    //   1042: ixor
    //   1043: ldc2_w -1239993315
    //   1046: l2i
    //   1047: ldc_w 1505370909
    //   1050: ixor
    //   1051: ixor
    //   1052: lookupswitch default -> 3172, -494921899 -> 1035, 1817636287 -> 1080
    //   1080: aload_1
    //   1081: getstatic Perryc.1 : I
    //   1084: ifeq -> 1098
    //   1087: ldc2_w 1553229029
    //   1090: l2i
    //   1091: ldc_w -320602323
    //   1094: ixor
    //   1095: goto -> 1106
    //   1098: ldc2_w -1666229784
    //   1101: l2i
    //   1102: ldc_w 475305846
    //   1105: ixor
    //   1106: ldc2_w 1006641895
    //   1109: l2i
    //   1110: ldc_w 891411926
    //   1113: ixor
    //   1114: ixor
    //   1115: lookupswitch default -> 3138, -1982189137 -> 1140, -1185520391 -> 1098
    //   1140: getfield field_72334_f : D
    //   1143: ldc2_w 0.2094586457307713
    //   1146: invokestatic doubleToLongBits : (D)J
    //   1149: ldc2_w 9208400581748824371
    //   1152: lxor
    //   1153: invokestatic longBitsToDouble : (J)D
    //   1156: dadd
    //   1157: ldc2_w 1.346633729374094
    //   1160: invokestatic doubleToLongBits : (D)J
    //   1163: ldc2_w 9206918737879737039
    //   1166: lxor
    //   1167: invokestatic longBitsToDouble : (J)D
    //   1170: ddiv
    //   1171: getstatic Perryc.c : I
    //   1174: iflt -> 1188
    //   1177: ldc2_w 168483736
    //   1180: l2i
    //   1181: ldc_w -2104596553
    //   1184: ixor
    //   1185: goto -> 1196
    //   1188: ldc2_w 644789579
    //   1191: l2i
    //   1192: ldc_w -829838042
    //   1195: ixor
    //   1196: ldc2_w 409779166
    //   1199: l2i
    //   1200: ldc_w 1772663604
    //   1203: ixor
    //   1204: ixor
    //   1205: lookupswitch default -> 3130, -1725755257 -> 1232, -113199931 -> 1188
    //   1232: goto -> 1236
    //   1235: athrow
    //   1236: invokestatic func_76128_c : (D)I
    //   1239: goto -> 1243
    //   1242: athrow
    //   1243: getstatic Perryc.1 : I
    //   1246: ifeq -> 1260
    //   1249: ldc2_w -700051898
    //   1252: l2i
    //   1253: ldc_w 1090414533
    //   1256: ixor
    //   1257: goto -> 1268
    //   1260: ldc2_w 1085449658
    //   1263: l2i
    //   1264: ldc_w -614877909
    //   1267: ixor
    //   1268: ldc2_w 369837142
    //   1271: l2i
    //   1272: ldc_w 1808078875
    //   1275: ixor
    //   1276: ixor
    //   1277: lookupswitch default -> 3102, -433763108 -> 1304, -344574514 -> 1260
    //   1304: istore #6
    //   1306: getstatic Perryc.0 : I
    //   1309: ifle -> 1323
    //   1312: ldc2_w 367720580
    //   1315: l2i
    //   1316: ldc_w -329837574
    //   1319: ixor
    //   1320: goto -> 1331
    //   1323: ldc2_w -488742039
    //   1326: l2i
    //   1327: ldc_w -1650899827
    //   1330: ixor
    //   1331: ldc2_w -1324934118
    //   1334: l2i
    //   1335: ldc_w -1371196494
    //   1338: ixor
    //   1339: ixor
    //   1340: lookupswitch default -> 1368, -419445546 -> 3184, 1736145752 -> 1323
    //   1368: iload_3
    //   1369: getstatic Perryc.1 : I
    //   1372: ifeq -> 1386
    //   1375: ldc2_w -823629359
    //   1378: l2i
    //   1379: ldc_w 773545929
    //   1382: ixor
    //   1383: goto -> 1394
    //   1386: ldc2_w -1084267548
    //   1389: l2i
    //   1390: ldc_w -2144131150
    //   1393: ixor
    //   1394: ldc2_w 2144554736
    //   1397: l2i
    //   1398: ldc_w -266143577
    //   1401: ixor
    //   1402: ixor
    //   1403: lookupswitch default -> 3136, -1331826175 -> 1428, 1862434895 -> 1386
    //   1428: istore #7
    //   1430: getstatic Perryc.c : I
    //   1433: iflt -> 1447
    //   1436: ldc2_w -1968733696
    //   1439: l2i
    //   1440: ldc_w 2129788329
    //   1443: ixor
    //   1444: goto -> 1455
    //   1447: ldc2_w 447355908
    //   1450: l2i
    //   1451: ldc_w 2053340600
    //   1454: ixor
    //   1455: ldc2_w -685832683
    //   1458: l2i
    //   1459: ldc_w 1851347927
    //   1462: ixor
    //   1463: ixor
    //   1464: lookupswitch default -> 3140, -644926338 -> 1492, 1292905067 -> 1447
    //   1492: iload #7
    //   1494: getstatic Perryc.1 : I
    //   1497: ifeq -> 1511
    //   1500: ldc2_w 1822178524
    //   1503: l2i
    //   1504: ldc_w -449628707
    //   1507: ixor
    //   1508: goto -> 1519
    //   1511: ldc2_w 256197274
    //   1514: l2i
    //   1515: ldc_w -447055663
    //   1518: ixor
    //   1519: ldc2_w 598209403
    //   1522: l2i
    //   1523: ldc_w -967722852
    //   1526: ixor
    //   1527: ixor
    //   1528: lookupswitch default -> 3174, 266957228 -> 1556, 1817789158 -> 1511
    //   1556: iload #4
    //   1558: if_icmpgt -> 1572
    //   1561: ldc2_w 1280642833
    //   1564: l2i
    //   1565: ldc_w -1143790468
    //   1568: ixor
    //   1569: goto -> 1580
    //   1572: ldc2_w -1753871571
    //   1575: l2i
    //   1576: ldc_w 1626349633
    //   1579: ixor
    //   1580: ldc2_w 1394168963
    //   1583: l2i
    //   1584: ldc_w 1598679236
    //   1587: ixor
    //   1588: ixor
    //   1589: tableswitch default -> 1561, -69822678 -> 1612, -69822677 -> 3039
    //   1612: getstatic Perryc.1 : I
    //   1615: ifeq -> 1629
    //   1618: ldc2_w -549019305
    //   1621: l2i
    //   1622: ldc_w 1654204004
    //   1625: ixor
    //   1626: goto -> 1637
    //   1629: ldc2_w 1392738553
    //   1632: l2i
    //   1633: ldc_w 1919699073
    //   1636: ixor
    //   1637: ldc2_w -602874946
    //   1640: l2i
    //   1641: ldc_w 1580515052
    //   1644: ixor
    //   1645: ixor
    //   1646: lookupswitch default -> 1672, -880090847 -> 1629, 1073472097 -> 3146
    //   1672: iload #5
    //   1674: getstatic Perryc.1 : I
    //   1677: ifeq -> 1691
    //   1680: ldc2_w 27524808
    //   1683: l2i
    //   1684: ldc_w -607748474
    //   1687: ixor
    //   1688: goto -> 1699
    //   1691: ldc2_w -1116528577
    //   1694: l2i
    //   1695: ldc_w 574209913
    //   1698: ixor
    //   1699: ldc2_w -1143918959
    //   1702: l2i
    //   1703: ldc_w -2112344128
    //   1706: ixor
    //   1707: ixor
    //   1708: lookupswitch default -> 3116, -1501323753 -> 1736, -475234017 -> 1691
    //   1736: istore #8
    //   1738: getstatic Perryc.1 : I
    //   1741: ifeq -> 1755
    //   1744: ldc2_w -1787858904
    //   1747: l2i
    //   1748: ldc_w -1377451700
    //   1751: ixor
    //   1752: goto -> 1763
    //   1755: ldc2_w 1077883522
    //   1758: l2i
    //   1759: ldc_w -1029994777
    //   1762: ixor
    //   1763: ldc2_w 1832416498
    //   1766: l2i
    //   1767: ldc_w 503436455
    //   1770: ixor
    //   1771: ixor
    //   1772: lookupswitch default -> 1800, -1208918426 -> 1755, 1270026545 -> 3150
    //   1800: iload #8
    //   1802: getstatic Perryc.0 : I
    //   1805: ifle -> 1819
    //   1808: ldc2_w -804619673
    //   1811: l2i
    //   1812: ldc_w -1831526983
    //   1815: ixor
    //   1816: goto -> 1827
    //   1819: ldc2_w 1583526993
    //   1822: l2i
    //   1823: ldc_w 2006192151
    //   1826: ixor
    //   1827: ldc2_w -1609233932
    //   1830: l2i
    //   1831: ldc_w -1762405628
    //   1834: ixor
    //   1835: ixor
    //   1836: lookupswitch default -> 1864, -137637411 -> 1819, 1949941038 -> 3180
    //   1864: iload #6
    //   1866: if_icmpgt -> 1880
    //   1869: ldc2_w 1851080496
    //   1872: l2i
    //   1873: ldc_w 1538249112
    //   1876: ixor
    //   1877: goto -> 1888
    //   1880: ldc2_w -1571666677
    //   1883: l2i
    //   1884: ldc_w -1750553668
    //   1887: ixor
    //   1888: ldc2_w -594623210
    //   1891: l2i
    //   1892: ldc_w 1021726929
    //   1895: ixor
    //   1896: ixor
    //   1897: tableswitch default -> 1869, -711820433 -> 1920, -711820432 -> 3033
    //   1920: getstatic Perryc.c : I
    //   1923: iflt -> 1937
    //   1926: ldc2_w 1058007223
    //   1929: l2i
    //   1930: ldc_w 1648749723
    //   1933: ixor
    //   1934: goto -> 1945
    //   1937: ldc2_w 1391872497
    //   1940: l2i
    //   1941: ldc_w 9593925
    //   1944: ixor
    //   1945: ldc2_w -563569821
    //   1948: l2i
    //   1949: ldc_w 1537858586
    //   1952: ixor
    //   1953: ixor
    //   1954: lookupswitch default -> 3144, -677025075 -> 1980, -661961899 -> 1937
    //   1980: getstatic bigname/zprestige/webhack/features/modules/Render/Trajectories.mc : Lnet/minecraft/client/Minecraft;
    //   1983: getstatic Perryc.c : I
    //   1986: iflt -> 2000
    //   1989: ldc2_w 1078333863
    //   1992: l2i
    //   1993: ldc_w -316238531
    //   1996: ixor
    //   1997: goto -> 2008
    //   2000: ldc2_w -1891349108
    //   2003: l2i
    //   2004: ldc_w -1335459068
    //   2007: ixor
    //   2008: ldc2_w -1262820828
    //   2011: l2i
    //   2012: ldc_w -1393297003
    //   2015: ixor
    //   2016: ixor
    //   2017: lookupswitch default -> 2044, -1255563477 -> 3164, 532769237 -> 2000
    //   2044: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   2047: getstatic Perryc.1 : I
    //   2050: ifeq -> 2064
    //   2053: ldc2_w 1047325706
    //   2056: l2i
    //   2057: ldc_w -1207258967
    //   2060: ixor
    //   2061: goto -> 2072
    //   2064: ldc2_w -1683456738
    //   2067: l2i
    //   2068: ldc_w -312519719
    //   2071: ixor
    //   2072: ldc2_w 577637293
    //   2075: l2i
    //   2076: ldc_w 1237569349
    //   2079: ixor
    //   2080: ixor
    //   2081: lookupswitch default -> 3108, -305424309 -> 2064, 492497455 -> 2108
    //   2108: goto -> 2112
    //   2111: athrow
    //   2112: invokevirtual func_72863_F : ()Lnet/minecraft/client/multiplayer/ChunkProviderClient;
    //   2115: goto -> 2119
    //   2118: athrow
    //   2119: getstatic Perryc.c : I
    //   2122: iflt -> 2136
    //   2125: ldc2_w 488194194
    //   2128: l2i
    //   2129: ldc_w -1262345675
    //   2132: ixor
    //   2133: goto -> 2144
    //   2136: ldc2_w -1872959781
    //   2139: l2i
    //   2140: ldc_w -1289701493
    //   2143: ixor
    //   2144: ldc2_w 955217735
    //   2147: l2i
    //   2148: ldc_w -1527708053
    //   2151: ixor
    //   2152: ixor
    //   2153: lookupswitch default -> 3176, -1084088196 -> 2180, 902108043 -> 2136
    //   2180: iload #7
    //   2182: getstatic Perryc.0 : I
    //   2185: ifle -> 2199
    //   2188: ldc2_w 1580121675
    //   2191: l2i
    //   2192: ldc_w 1899661251
    //   2195: ixor
    //   2196: goto -> 2207
    //   2199: ldc2_w 434654581
    //   2202: l2i
    //   2203: ldc_w 2021276306
    //   2206: ixor
    //   2207: ldc2_w 1966976477
    //   2210: l2i
    //   2211: ldc_w 903623918
    //   2214: ixor
    //   2215: ixor
    //   2216: lookupswitch default -> 3182, 561245908 -> 2244, 1878368443 -> 2199
    //   2244: iload #8
    //   2246: getstatic Perryc.c : I
    //   2249: iflt -> 2263
    //   2252: ldc2_w -587059981
    //   2255: l2i
    //   2256: ldc_w -448049656
    //   2259: ixor
    //   2260: goto -> 2271
    //   2263: ldc2_w -786915472
    //   2266: l2i
    //   2267: ldc_w 281064688
    //   2270: ixor
    //   2271: ldc2_w 865810623
    //   2274: l2i
    //   2275: ldc_w -138705053
    //   2278: ixor
    //   2279: ixor
    //   2280: lookupswitch default -> 3160, -60170969 -> 2263, 100176988 -> 2308
    //   2308: goto -> 2312
    //   2311: athrow
    //   2312: invokevirtual func_186026_b : (II)Lnet/minecraft/world/chunk/Chunk;
    //   2315: goto -> 2319
    //   2318: athrow
    //   2319: ifnonnull -> 2333
    //   2322: ldc2_w 1497310188
    //   2325: l2i
    //   2326: ldc_w 1331894909
    //   2329: ixor
    //   2330: goto -> 2341
    //   2333: ldc2_w -1413070464
    //   2336: l2i
    //   2337: ldc_w -1113950192
    //   2340: ixor
    //   2341: ldc2_w 1320718972
    //   2344: l2i
    //   2345: ldc_w -1625679571
    //   2348: ixor
    //   2349: ixor
    //   2350: tableswitch default -> 2322, -939609408 -> 2372, -939609407 -> 2375
    //   2372: goto -> 3027
    //   2375: getstatic Perryc.1 : I
    //   2378: ifeq -> 2392
    //   2381: ldc2_w -914627948
    //   2384: l2i
    //   2385: ldc_w 1506975963
    //   2388: ixor
    //   2389: goto -> 2400
    //   2392: ldc2_w 1354742883
    //   2395: l2i
    //   2396: ldc_w 1701090821
    //   2399: ixor
    //   2400: ldc2_w -1272300777
    //   2403: l2i
    //   2404: ldc_w 2074825127
    //   2407: ixor
    //   2408: ixor
    //   2409: lookupswitch default -> 3158, -94748458 -> 2436, 1596467455 -> 2392
    //   2436: getstatic bigname/zprestige/webhack/features/modules/Render/Trajectories.mc : Lnet/minecraft/client/Minecraft;
    //   2439: getstatic Perryc.1 : I
    //   2442: ifeq -> 2456
    //   2445: ldc2_w 69081790
    //   2448: l2i
    //   2449: ldc_w 538477545
    //   2452: ixor
    //   2453: goto -> 2464
    //   2456: ldc2_w -293024271
    //   2459: l2i
    //   2460: ldc_w 1344145839
    //   2463: ixor
    //   2464: ldc2_w -2102474967
    //   2467: l2i
    //   2468: ldc_w -1788938382
    //   2471: ixor
    //   2472: ixor
    //   2473: lookupswitch default -> 2500, 704599324 -> 2456, 871803148 -> 3186
    //   2500: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   2503: getstatic Perryc.1 : I
    //   2506: ifeq -> 2520
    //   2509: ldc2_w 355768601
    //   2512: l2i
    //   2513: ldc_w 1295248373
    //   2516: ixor
    //   2517: goto -> 2528
    //   2520: ldc2_w -1454184566
    //   2523: l2i
    //   2524: ldc_w 1397443992
    //   2527: ixor
    //   2528: ldc2_w -1517924566
    //   2531: l2i
    //   2532: ldc_w 753413474
    //   2535: ixor
    //   2536: ixor
    //   2537: lookupswitch default -> 2564, -2005408783 -> 2520, -781643612 -> 3104
    //   2564: iload #7
    //   2566: getstatic Perryc.0 : I
    //   2569: ifle -> 2583
    //   2572: ldc2_w 2033810628
    //   2575: l2i
    //   2576: ldc_w -838152646
    //   2579: ixor
    //   2580: goto -> 2591
    //   2583: ldc2_w 1554254560
    //   2586: l2i
    //   2587: ldc_w -371633001
    //   2590: ixor
    //   2591: ldc2_w 1354773459
    //   2594: l2i
    //   2595: ldc_w -340467253
    //   2598: ixor
    //   2599: ixor
    //   2600: lookupswitch default -> 3148, 206004454 -> 2583, 235506799 -> 2628
    //   2628: iload #8
    //   2630: getstatic Perryc.c : I
    //   2633: iflt -> 2647
    //   2636: ldc2_w 15920858
    //   2639: l2i
    //   2640: ldc_w -573376123
    //   2643: ixor
    //   2644: goto -> 2655
    //   2647: ldc2_w 1249070369
    //   2650: l2i
    //   2651: ldc_w -1708808289
    //   2654: ixor
    //   2655: ldc2_w 998392854
    //   2658: l2i
    //   2659: ldc_w 1052445448
    //   2662: ixor
    //   2663: ixor
    //   2664: lookupswitch default -> 2692, -1877847177 -> 2647, -669427647 -> 3134
    //   2692: goto -> 2696
    //   2695: athrow
    //   2696: invokevirtual func_72964_e : (II)Lnet/minecraft/world/chunk/Chunk;
    //   2699: goto -> 2703
    //   2702: athrow
    //   2703: getstatic Perryc.1 : I
    //   2706: ifeq -> 2720
    //   2709: ldc2_w -1134026325
    //   2712: l2i
    //   2713: ldc_w -1452308635
    //   2716: ixor
    //   2717: goto -> 2728
    //   2720: ldc2_w 1906273924
    //   2723: l2i
    //   2724: ldc_w -1919389175
    //   2727: ixor
    //   2728: ldc2_w 589096247
    //   2731: l2i
    //   2732: ldc_w 1300646972
    //   2735: ixor
    //   2736: ixor
    //   2737: lookupswitch default -> 2764, -1960429487 -> 2720, 2073890757 -> 3110
    //   2764: getstatic bigname/zprestige/webhack/features/modules/Render/Trajectories.mc : Lnet/minecraft/client/Minecraft;
    //   2767: getstatic Perryc.1 : I
    //   2770: ifeq -> 2784
    //   2773: ldc2_w -1604998159
    //   2776: l2i
    //   2777: ldc_w -1480254711
    //   2780: ixor
    //   2781: goto -> 2792
    //   2784: ldc2_w -1819120222
    //   2787: l2i
    //   2788: ldc_w -1656107410
    //   2791: ixor
    //   2792: ldc2_w 2071302199
    //   2795: l2i
    //   2796: ldc_w 1825202980
    //   2799: ixor
    //   2800: ixor
    //   2801: lookupswitch default -> 3170, 271533035 -> 2784, 426004703 -> 2828
    //   2828: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2831: getstatic Perryc.0 : I
    //   2834: ifle -> 2848
    //   2837: ldc2_w 1673302011
    //   2840: l2i
    //   2841: ldc_w -602577608
    //   2844: ixor
    //   2845: goto -> 2856
    //   2848: ldc2_w 2124799950
    //   2851: l2i
    //   2852: ldc_w -1077703633
    //   2855: ixor
    //   2856: ldc2_w 2023229168
    //   2859: l2i
    //   2860: ldc_w 2003756683
    //   2863: ixor
    //   2864: ixor
    //   2865: lookupswitch default -> 3112, -1335948616 -> 2848, -829377638 -> 2892
    //   2892: aload_1
    //   2893: getstatic Perryc.c : I
    //   2896: iflt -> 2910
    //   2899: ldc2_w 260920518
    //   2902: l2i
    //   2903: ldc_w -312847353
    //   2906: ixor
    //   2907: goto -> 2918
    //   2910: ldc2_w -1423709357
    //   2913: l2i
    //   2914: ldc_w -700211744
    //   2917: ixor
    //   2918: ldc2_w -1424081569
    //   2921: l2i
    //   2922: ldc_w -89311928
    //   2925: ixor
    //   2926: ixor
    //   2927: lookupswitch default -> 2952, -1285289770 -> 3168, -73596089 -> 2910
    //   2952: aload_2
    //   2953: aconst_null
    //   2954: getstatic Perryc.1 : I
    //   2957: ifeq -> 2971
    //   2960: ldc2_w -41097231
    //   2963: l2i
    //   2964: ldc_w 30070546
    //   2967: ixor
    //   2968: goto -> 2979
    //   2971: ldc2_w 1515236609
    //   2974: l2i
    //   2975: ldc_w 1742272765
    //   2978: ixor
    //   2979: ldc2_w -75730538
    //   2982: l2i
    //   2983: ldc_w -2077390874
    //   2986: ixor
    //   2987: ixor
    //   2988: lookupswitch default -> 3016, -2095593837 -> 3118, -60138901 -> 2971
    //   3016: goto -> 3020
    //   3019: athrow
    //   3020: invokevirtual func_177414_a : (Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;Ljava/util/List;Lcom/google/common/base/Predicate;)V
    //   3023: goto -> 3027
    //   3026: athrow
    //   3027: iinc #8, 1
    //   3030: goto -> 1738
    //   3033: iinc #7, 1
    //   3036: goto -> 1430
    //   3039: getstatic Perryc.c : I
    //   3042: iflt -> 3056
    //   3045: ldc2_w 1628646686
    //   3048: l2i
    //   3049: ldc_w -1760200274
    //   3052: ixor
    //   3053: goto -> 3064
    //   3056: ldc2_w 353191158
    //   3059: l2i
    //   3060: ldc_w 325094462
    //   3063: ixor
    //   3064: ldc2_w -307812720
    //   3067: l2i
    //   3068: ldc_w 1226843039
    //   3071: ixor
    //   3072: ixor
    //   3073: lookupswitch default -> 3154, -1561670201 -> 3100, 1384206783 -> 3056
    //   3100: aload_2
    //   3101: areturn
    //   3102: aconst_null
    //   3103: athrow
    //   3104: aconst_null
    //   3105: athrow
    //   3106: aconst_null
    //   3107: athrow
    //   3108: aconst_null
    //   3109: athrow
    //   3110: aconst_null
    //   3111: athrow
    //   3112: aconst_null
    //   3113: athrow
    //   3114: aconst_null
    //   3115: athrow
    //   3116: aconst_null
    //   3117: athrow
    //   3118: aconst_null
    //   3119: athrow
    //   3120: aconst_null
    //   3121: athrow
    //   3122: aconst_null
    //   3123: athrow
    //   3124: aconst_null
    //   3125: athrow
    //   3126: aconst_null
    //   3127: athrow
    //   3128: aconst_null
    //   3129: athrow
    //   3130: aconst_null
    //   3131: athrow
    //   3132: aconst_null
    //   3133: athrow
    //   3134: aconst_null
    //   3135: athrow
    //   3136: aconst_null
    //   3137: athrow
    //   3138: aconst_null
    //   3139: athrow
    //   3140: aconst_null
    //   3141: athrow
    //   3142: aconst_null
    //   3143: athrow
    //   3144: aconst_null
    //   3145: athrow
    //   3146: aconst_null
    //   3147: athrow
    //   3148: aconst_null
    //   3149: athrow
    //   3150: aconst_null
    //   3151: athrow
    //   3152: aconst_null
    //   3153: athrow
    //   3154: aconst_null
    //   3155: athrow
    //   3156: aconst_null
    //   3157: athrow
    //   3158: aconst_null
    //   3159: athrow
    //   3160: aconst_null
    //   3161: athrow
    //   3162: aconst_null
    //   3163: athrow
    //   3164: aconst_null
    //   3165: athrow
    //   3166: aconst_null
    //   3167: athrow
    //   3168: aconst_null
    //   3169: athrow
    //   3170: aconst_null
    //   3171: athrow
    //   3172: aconst_null
    //   3173: athrow
    //   3174: aconst_null
    //   3175: athrow
    //   3176: aconst_null
    //   3177: athrow
    //   3178: aconst_null
    //   3179: athrow
    //   3180: aconst_null
    //   3181: athrow
    //   3182: aconst_null
    //   3183: athrow
    //   3184: aconst_null
    //   3185: athrow
    //   3186: aconst_null
    //   3187: athrow
    //   3188: pop
    //   3189: goto -> 24
    //   3192: pop
    //   3193: aconst_null
    //   3194: goto -> 3188
    //   3197: dup
    //   3198: ifnull -> 3188
    //   3201: checkcast java/lang/Throwable
    //   3204: athrow
    //   3205: dup
    //   3206: ifnull -> 3192
    //   3209: checkcast java/lang/Throwable
    //   3212: athrow
    //   3213: aconst_null
    //   3214: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1738	1295	8	z	I
    //   1430	1609	7	x	I
    //   24	3078	0	this	Lbigname/zprestige/webhack/features/modules/Render/Trajectories;
    //   24	3078	1	bb	Lnet/minecraft/util/math/AxisAlignedBB;
    //   161	2941	2	list	Ljava/util/ArrayList;
    //   445	2657	3	chunkMinX	I
    //   730	2372	4	chunkMaxX	I
    //   1018	2084	5	chunkMinZ	I
    //   1306	1796	6	chunkMaxZ	I
    // Exception table:
    //   from	to	target	type
    //   8	20	3197	java/lang/NegativeArraySizeException
    //   91	98	98	finally
    //   91	98	3	finally
    //   91	98	91	finally
    //   92	98	91	java/util/ConcurrentModificationException
    //   92	98	91	java/lang/EnumConstantNotPresentException
    //   375	382	382	finally
    //   375	382	375	finally
    //   375	382	382	finally
    //   375	382	375	java/lang/RuntimeException
    //   376	382	382	java/util/ConcurrentModificationException
    //   659	666	666	finally
    //   659	666	659	java/lang/ArrayIndexOutOfBoundsException
    //   659	666	3	java/lang/UnsupportedOperationException
    //   660	666	666	java/lang/NullPointerException
    //   660	666	659	java/lang/EnumConstantNotPresentException
    //   947	954	954	finally
    //   947	954	3	java/lang/NegativeArraySizeException
    //   947	954	3	finally
    //   948	954	947	java/lang/RuntimeException
    //   948	954	3	java/lang/NullPointerException
    //   1235	1242	1242	finally
    //   1235	1242	3	java/util/NoSuchElementException
    //   1236	1242	1235	java/lang/AssertionError
    //   1236	1242	1235	java/lang/IllegalArgumentException
    //   1236	1242	3	java/lang/ArithmeticException
    //   2111	2118	2118	finally
    //   2111	2118	2111	finally
    //   2111	2118	3	finally
    //   2112	2118	2111	finally
    //   2112	2118	3	finally
    //   2312	2318	2318	finally
    //   2312	2318	2318	finally
    //   2312	2318	3	finally
    //   2312	2318	3	java/util/NoSuchElementException
    //   2312	2318	3	java/lang/AssertionError
    //   2695	2702	2702	finally
    //   2695	2702	2695	java/util/ConcurrentModificationException
    //   2695	2702	3	finally
    //   2696	2702	2702	finally
    //   2696	2702	2695	finally
    //   3019	3026	3026	finally
    //   3019	3026	3019	finally
    //   3020	3026	3026	finally
    //   3020	3026	3026	finally
    //   3020	3026	3	java/lang/UnsupportedOperationException
    //   3197	3205	3197	java/lang/NegativeArraySizeException
    //   3213	3215	3	finally
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Render\Trajectories.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */