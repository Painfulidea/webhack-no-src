package bigname.zprestige.webhack.features.modules.Movement;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.MoveEvent;
import bigname.zprestige.webhack.event.events.PacketEvent;
import bigname.zprestige.webhack.event.events.UpdateWalkingPlayerEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.util.Timer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Strafe extends Module {
  public Setting<Boolean> setPos;
  
  public Setting<Boolean> setGroundNoLag;
  
  public Setting<Boolean> noLag;
  
  public Setting<Integer> groundFactor;
  
  public Setting<Boolean> potion;
  
  public Setting<Boolean> limiter2;
  
  public Timer timer;
  
  public Setting<Boolean> bhop2;
  
  public double lastDist;
  
  public static Strafe INSTANCE;
  
  public Setting<Float> speedLimit2;
  
  public Setting<Integer> step;
  
  public boolean hidesetting;
  
  public Setting<Integer> yOffset;
  
  public Setting<Boolean> wait;
  
  public Setting<Integer> dFactor;
  
  public Setting<Integer> startStage;
  
  public Setting<Boolean> limiter;
  
  public Setting<Integer> setGroundLimit;
  
  public Setting<Integer> acceleration;
  
  public Setting<Boolean> hopWait;
  
  public Setting<Float> speedLimit;
  
  public Setting<Integer> potionSpeed;
  
  public int stage;
  
  public Setting<Integer> potionSpeed2;
  
  public double moveSpeed;
  
  public Setting<Strafe$Mode> mode;
  
  public Setting<Boolean> setNull;
  
  public boolean waitForGround;
  
  public Setting<Integer> specialMoveSpeed;
  
  public int cooldownHops;
  
  public int hops;
  
  public boolean lambda$new$7(Integer paramInteger) {
    return Perry1.5t(this, (int)1371436062L ^ 0x44F4859D, paramInteger);
  }
  
  public boolean lambda$new$4(Boolean paramBoolean) {
    return Perry1.2t(this, (int)-1054161729L ^ 0xD753E6BC, paramBoolean);
  }
  
  public float getMultiplier() {
    return Perry1.2I(this, (int)1878562961L ^ 0x5C621454);
  }
  
  public boolean lambda$new$11(Float paramFloat) {
    return Perry1.I(this, (int)-675523267L ^ 0xEA47528A, paramFloat);
  }
  
  public boolean lambda$new$15(Boolean paramBoolean) {
    return Perry1.2l(this, (int)700041493L ^ 0x122F25EE, paramBoolean);
  }
  
  public static Strafe getInstance() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 357
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 349
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 341
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 40
    //   30: ldc2_w 1588175490
    //   33: l2i
    //   34: ldc -1754638745
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -1135105232
    //   43: l2i
    //   44: ldc -2076855410
    //   46: ixor
    //   47: ldc2_w -1493618083
    //   50: l2i
    //   51: ldc -48036022
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 80, -1843805710 -> 324, -1331735506 -> 40
    //   80: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.INSTANCE : Lbigname/zprestige/webhack/features/modules/Movement/Strafe;
    //   83: ifnonnull -> 96
    //   86: ldc2_w 613067070
    //   89: l2i
    //   90: ldc -1115529343
    //   92: ixor
    //   93: goto -> 103
    //   96: ldc2_w -464360431
    //   99: l2i
    //   100: ldc 2103089839
    //   102: ixor
    //   103: ldc2_w -2093198213
    //   106: l2i
    //   107: ldc -603212558
    //   109: ixor
    //   110: ixor
    //   111: tableswitch default -> 86, -968944074 -> 132, -968944073 -> 263
    //   132: new bigname/zprestige/webhack/features/modules/Movement/Strafe
    //   135: dup
    //   136: getstatic Perryc.c : I
    //   139: iflt -> 152
    //   142: ldc2_w -1946823513
    //   145: l2i
    //   146: ldc -1129018821
    //   148: ixor
    //   149: goto -> 159
    //   152: ldc2_w 526032639
    //   155: l2i
    //   156: ldc 1700888114
    //   158: ixor
    //   159: ldc2_w -357578829
    //   162: l2i
    //   163: ldc -335301340
    //   165: ixor
    //   166: ixor
    //   167: lookupswitch default -> 328, 837626891 -> 152, 2090308186 -> 192
    //   192: goto -> 196
    //   195: athrow
    //   196: invokespecial <init> : ()V
    //   199: goto -> 203
    //   202: athrow
    //   203: getstatic Perryc.c : I
    //   206: iflt -> 219
    //   209: ldc2_w -1564180630
    //   212: l2i
    //   213: ldc -152920517
    //   215: ixor
    //   216: goto -> 226
    //   219: ldc2_w -989962202
    //   222: l2i
    //   223: ldc 814672190
    //   225: ixor
    //   226: ldc2_w -1098600886
    //   229: l2i
    //   230: ldc -1676018982
    //   232: ixor
    //   233: ixor
    //   234: lookupswitch default -> 330, -689054328 -> 260, 1992013249 -> 219
    //   260: putstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.INSTANCE : Lbigname/zprestige/webhack/features/modules/Movement/Strafe;
    //   263: getstatic Perryc.c : I
    //   266: iflt -> 279
    //   269: ldc2_w 473631421
    //   272: l2i
    //   273: ldc -59878364
    //   275: ixor
    //   276: goto -> 286
    //   279: ldc2_w 969117609
    //   282: l2i
    //   283: ldc 144806588
    //   285: ixor
    //   286: ldc2_w 1840646740
    //   289: l2i
    //   290: ldc -1029187632
    //   292: ixor
    //   293: ixor
    //   294: lookupswitch default -> 326, -1636581231 -> 320, 1329890077 -> 279
    //   320: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.INSTANCE : Lbigname/zprestige/webhack/features/modules/Movement/Strafe;
    //   323: areturn
    //   324: aconst_null
    //   325: athrow
    //   326: aconst_null
    //   327: athrow
    //   328: aconst_null
    //   329: athrow
    //   330: aconst_null
    //   331: athrow
    //   332: pop
    //   333: goto -> 24
    //   336: pop
    //   337: aconst_null
    //   338: goto -> 332
    //   341: dup
    //   342: ifnull -> 332
    //   345: checkcast java/lang/Throwable
    //   348: athrow
    //   349: dup
    //   350: ifnull -> 336
    //   353: checkcast java/lang/Throwable
    //   356: athrow
    //   357: aconst_null
    //   358: athrow
    // Exception table:
    //   from	to	target	type
    //   8	20	341	java/lang/ArithmeticException
    //   195	202	202	finally
    //   195	202	195	finally
    //   195	202	3	finally
    //   196	202	195	finally
    //   196	202	202	finally
    //   341	349	341	java/lang/ArrayIndexOutOfBoundsException
    //   357	359	3	finally
  }
  
  public boolean lambda$new$20(Integer paramInteger) {
    return Perry1.5j(this, (int)1008266710L ^ 0xD4197DF, paramInteger);
  }
  
  public boolean lambda$new$0(Strafe$Mode v) {
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
  
  public boolean lambda$new$19(Integer paramInteger) {
    return Perry1.5m(this, (int)400518948L ^ 0x1FC33EE9, paramInteger);
  }
  
  public boolean lambda$new$14(Boolean paramBoolean) {
    return Perry1.2y(this, (int)1333311693L ^ 0x37424838, paramBoolean);
  }
  
  public String getDisplayInfo() {
    return Perry1.i(this, (int)-581266883L ^ 0x822EDE0C);
  }
  
  public boolean lambda$new$3(Boolean paramBoolean) {
    return Perry1.2w(this, (int)-42646070L ^ 0xA8E6437E, paramBoolean);
  }
  
  public boolean lambda$new$17(Boolean paramBoolean) {
    return Perry1.2o(this, (int)-1205576878L ^ 0xBF49DCC2, paramBoolean);
  }
  
  public boolean lambda$new$10(Float paramFloat) {
    return Perry1.J(this, (int)100068285L ^ 0x16FE084D, paramFloat);
  }
  
  public boolean lambda$new$8(Integer paramInteger) {
    return Perry1.5y(this, (int)1314441110L ^ 0x2B029FB9, paramInteger);
  }
  
  @SubscribeEvent
  public void onPacketReceive(PacketEvent.Receive event) {
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
  
  public boolean lambda$new$12(Integer paramInteger) {
    return Perry1.5q(this, (int)186194724L ^ 0x9A356AF, paramInteger);
  }
  
  public boolean lambda$new$6(Integer paramInteger) {
    return Perry1.5n(this, (int)26512390L ^ 0x448EC217, paramInteger);
  }
  
  public boolean lambda$new$21(Object paramObject) {
    return Perry1.20(this, (int)-1484484372L ^ 0xFD32DAFC, paramObject);
  }
  
  public Strafe() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -672138454
    //   9: l2i
    //   10: ldc_w -611844287
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1580996908
    //   20: l2i
    //   21: ldc_w 1589967631
    //   24: ixor
    //   25: ldc2_w 1305567478
    //   28: l2i
    //   29: ldc_w 662922436
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 15562, -1789584919 -> 60, 1715077209 -> 17
    //   60: aload_0
    //   61: ldc_w '௶㌇஽㶶뜤'
    //   64: getstatic Perryc.c : I
    //   67: iflt -> 81
    //   70: ldc2_w 1842079494
    //   73: l2i
    //   74: ldc_w -1565855526
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -1482729662
    //   84: l2i
    //   85: ldc_w -597670839
    //   88: ixor
    //   89: ldc2_w 1239429273
    //   92: l2i
    //   93: ldc_w -32468693
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 15472, -871386439 -> 124, 2022815342 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '௤㌚஽㶔뜭๭発蹬덞ਢ옉煢潤'
    //   130: getstatic Perryc.c : I
    //   133: iflt -> 147
    //   136: ldc2_w -463910610
    //   139: l2i
    //   140: ldc_w 1727984442
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w -1145575200
    //   150: l2i
    //   151: ldc_w 960579129
    //   154: ixor
    //   155: ldc2_w -1714814055
    //   158: l2i
    //   159: ldc_w -1863034352
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 192, -1952848995 -> 15358, 1326410989 -> 147
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.1 : I
    //   198: ifeq -> 212
    //   201: ldc2_w -730406079
    //   204: l2i
    //   205: ldc_w 1540552649
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -1933816381
    //   215: l2i
    //   216: ldc_w 2030128440
    //   219: ixor
    //   220: ldc2_w -909378146
    //   223: l2i
    //   224: ldc_w -655488446
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 15270, -1635654828 -> 212, -459737305 -> 256
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.MOVEMENT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -2086031172
    //   262: l2i
    //   263: ldc_w -2086031171
    //   266: ixor
    //   267: ldc2_w -553124517
    //   270: l2i
    //   271: ldc_w -553124517
    //   274: ixor
    //   275: ldc2_w 2138089438
    //   278: l2i
    //   279: ldc_w 2138089438
    //   282: ixor
    //   283: getstatic Perryc.0 : I
    //   286: ifle -> 300
    //   289: ldc2_w 462749196
    //   292: l2i
    //   293: ldc_w -1884924202
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 552779722
    //   303: l2i
    //   304: ldc_w -1478282157
    //   307: ixor
    //   308: ldc2_w 1246051590
    //   311: l2i
    //   312: ldc_w 835002018
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 15434, -273511554 -> 300, -57563075 -> 344
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.c : I
    //   350: iflt -> 364
    //   353: ldc2_w -1111837656
    //   356: l2i
    //   357: ldc_w -811548770
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w 958708666
    //   367: l2i
    //   368: ldc_w 1769221943
    //   371: ixor
    //   372: ldc2_w 163981574
    //   375: l2i
    //   376: ldc_w -1948404078
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -268331998 -> 15478, 902482936 -> 364
    //   408: aload_0
    //   409: getstatic Perryc.0 : I
    //   412: ifle -> 426
    //   415: ldc2_w -1269480329
    //   418: l2i
    //   419: ldc_w -1143156811
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -1215368863
    //   429: l2i
    //   430: ldc_w 755000017
    //   433: ixor
    //   434: ldc2_w 2001079304
    //   437: l2i
    //   438: ldc_w 2081526474
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, 81663232 -> 15418, 148823399 -> 426
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '௨㌜஫㶲'
    //   476: getstatic Perryc.c : I
    //   479: iflt -> 493
    //   482: ldc2_w 900764986
    //   485: l2i
    //   486: ldc_w -755391457
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w -1055257537
    //   496: l2i
    //   497: ldc_w -405255170
    //   500: ixor
    //   501: ldc2_w -372616659
    //   504: l2i
    //   505: ldc_w 706107080
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 15262, -451001564 -> 536, 613758400 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: getstatic Perryc.c : I
    //   542: iflt -> 556
    //   545: ldc2_w -302984809
    //   548: l2i
    //   549: ldc_w -263665758
    //   552: ixor
    //   553: goto -> 564
    //   556: ldc2_w 772354673
    //   559: l2i
    //   560: ldc_w 1011009641
    //   563: ixor
    //   564: ldc2_w 1778071692
    //   567: l2i
    //   568: ldc_w 794050600
    //   571: ixor
    //   572: ixor
    //   573: lookupswitch default -> 15366, 1424261820 -> 600, 1528262289 -> 556
    //   600: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe$Mode.STRAFE : Lbigname/zprestige/webhack/features/modules/Movement/Strafe$Mode;
    //   603: getstatic Perryc.0 : I
    //   606: ifle -> 620
    //   609: ldc2_w -296978968
    //   612: l2i
    //   613: ldc_w 1033094205
    //   616: ixor
    //   617: goto -> 628
    //   620: ldc2_w -2019419345
    //   623: l2i
    //   624: ldc_w 715079555
    //   627: ixor
    //   628: ldc2_w -542711626
    //   631: l2i
    //   632: ldc_w -622274644
    //   635: ixor
    //   636: ixor
    //   637: lookupswitch default -> 15514, -1468853322 -> 664, -695105841 -> 620
    //   664: aload_0
    //   665: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   670: getstatic Perryc.c : I
    //   673: iflt -> 687
    //   676: ldc2_w -917580369
    //   679: l2i
    //   680: ldc_w 441056652
    //   683: ixor
    //   684: goto -> 695
    //   687: ldc2_w 1089278006
    //   690: l2i
    //   691: ldc_w 964014449
    //   694: ixor
    //   695: ldc2_w 1122413472
    //   698: l2i
    //   699: ldc_w -793212116
    //   702: ixor
    //   703: ixor
    //   704: lookupswitch default -> 15436, -339312181 -> 732, 1096353967 -> 687
    //   732: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   735: getstatic Perryc.1 : I
    //   738: ifeq -> 752
    //   741: ldc2_w 437923711
    //   744: l2i
    //   745: ldc_w -510744491
    //   748: ixor
    //   749: goto -> 760
    //   752: ldc2_w 1604224263
    //   755: l2i
    //   756: ldc_w -889023123
    //   759: ixor
    //   760: ldc2_w 93789183
    //   763: l2i
    //   764: ldc_w -2084709343
    //   767: ixor
    //   768: ixor
    //   769: lookupswitch default -> 15344, 313972660 -> 796, 2109620468 -> 752
    //   796: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   799: getstatic Perryc.c : I
    //   802: iflt -> 816
    //   805: ldc2_w 1109283847
    //   808: l2i
    //   809: ldc_w -1249656833
    //   812: ixor
    //   813: goto -> 824
    //   816: ldc2_w 730184271
    //   819: l2i
    //   820: ldc_w 141541566
    //   823: ixor
    //   824: ldc2_w 1661885811
    //   827: l2i
    //   828: ldc_w -403748763
    //   831: ixor
    //   832: ixor
    //   833: lookupswitch default -> 860, 1577979451 -> 816, 1937571566 -> 15554
    //   860: putfield mode : Lbigname/zprestige/webhack/features/setting/Setting;
    //   863: getstatic Perryc.0 : I
    //   866: ifle -> 880
    //   869: ldc2_w 1812193484
    //   872: l2i
    //   873: ldc_w 1110327213
    //   876: ixor
    //   877: goto -> 888
    //   880: ldc2_w -1742972249
    //   883: l2i
    //   884: ldc_w 195956524
    //   887: ixor
    //   888: ldc2_w 1466196152
    //   891: l2i
    //   892: ldc_w -2026989714
    //   895: ixor
    //   896: ixor
    //   897: lookupswitch default -> 15534, -26793801 -> 880, 1140367965 -> 924
    //   924: aload_0
    //   925: getstatic Perryc.0 : I
    //   928: ifle -> 942
    //   931: ldc2_w -225125148
    //   934: l2i
    //   935: ldc_w 931835661
    //   938: ixor
    //   939: goto -> 950
    //   942: ldc2_w -96604971
    //   945: l2i
    //   946: ldc_w -1046395102
    //   949: ixor
    //   950: ldc2_w 633084675
    //   953: l2i
    //   954: ldc_w 1669796230
    //   957: ixor
    //   958: ixor
    //   959: lookupswitch default -> 15264, -2094696084 -> 942, 2108137842 -> 984
    //   984: aload_0
    //   985: new bigname/zprestige/webhack/features/setting/Setting
    //   988: dup
    //   989: ldc_w '௶㌖஻㶐뜰๬癦蹧'
    //   992: getstatic Perryc.c : I
    //   995: iflt -> 1009
    //   998: ldc2_w -2038224285
    //   1001: l2i
    //   1002: ldc_w 243190159
    //   1005: ixor
    //   1006: goto -> 1017
    //   1009: ldc2_w 522708218
    //   1012: l2i
    //   1013: ldc_w 45493864
    //   1016: ixor
    //   1017: ldc2_w 1415933518
    //   1020: l2i
    //   1021: ldc_w -634611234
    //   1024: ixor
    //   1025: ixor
    //   1026: lookupswitch default -> 1052, -540503013 -> 1009, 112465020 -> 15438
    //   1052: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1055: ldc2_w -2095077002
    //   1058: l2i
    //   1059: ldc_w -2095077001
    //   1062: ixor
    //   1063: getstatic Perryc.0 : I
    //   1066: ifle -> 1080
    //   1069: ldc2_w 715516616
    //   1072: l2i
    //   1073: ldc_w 924658790
    //   1076: ixor
    //   1077: goto -> 1088
    //   1080: ldc2_w -2083525150
    //   1083: l2i
    //   1084: ldc_w -1483913570
    //   1087: ixor
    //   1088: ldc2_w -248218575
    //   1091: l2i
    //   1092: ldc_w 1317929258
    //   1095: ixor
    //   1096: ixor
    //   1097: lookupswitch default -> 1124, -1868282269 -> 1080, -1576879179 -> 15194
    //   1124: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1127: getstatic Perryc.c : I
    //   1130: iflt -> 1144
    //   1133: ldc2_w -1149905471
    //   1136: l2i
    //   1137: ldc_w -1152866851
    //   1140: ixor
    //   1141: goto -> 1152
    //   1144: ldc2_w -853362564
    //   1147: l2i
    //   1148: ldc_w -891552865
    //   1151: ixor
    //   1152: ldc2_w 133509321
    //   1155: l2i
    //   1156: ldc_w 1141660894
    //   1159: ixor
    //   1160: ixor
    //   1161: lookupswitch default -> 1188, 102627302 -> 1144, 1136925707 -> 15210
    //   1188: aload_0
    //   1189: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   1194: getstatic Perryc.c : I
    //   1197: iflt -> 1211
    //   1200: ldc2_w 1149025503
    //   1203: l2i
    //   1204: ldc_w 724596837
    //   1207: ixor
    //   1208: goto -> 1219
    //   1211: ldc2_w -70145650
    //   1214: l2i
    //   1215: ldc_w -1963345302
    //   1218: ixor
    //   1219: ldc2_w -920089544
    //   1222: l2i
    //   1223: ldc_w -2094678009
    //   1226: ixor
    //   1227: ixor
    //   1228: lookupswitch default -> 1256, -1503828116 -> 1211, 625051781 -> 15316
    //   1256: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   1259: getstatic Perryc.c : I
    //   1262: iflt -> 1276
    //   1265: ldc2_w 577734094
    //   1268: l2i
    //   1269: ldc_w 895585763
    //   1272: ixor
    //   1273: goto -> 1284
    //   1276: ldc2_w -303583911
    //   1279: l2i
    //   1280: ldc_w 104012424
    //   1283: ixor
    //   1284: ldc2_w 1277714896
    //   1287: l2i
    //   1288: ldc_w 1967444673
    //   1291: ixor
    //   1292: ixor
    //   1293: lookupswitch default -> 15548, -759692096 -> 1320, 778222396 -> 1276
    //   1320: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1323: getstatic Perryc.0 : I
    //   1326: ifle -> 1340
    //   1329: ldc2_w -769793670
    //   1332: l2i
    //   1333: ldc_w 1491071690
    //   1336: ixor
    //   1337: goto -> 1348
    //   1340: ldc2_w -1374916551
    //   1343: l2i
    //   1344: ldc_w -778279971
    //   1347: ixor
    //   1348: ldc2_w 907327142
    //   1351: l2i
    //   1352: ldc_w -189257979
    //   1355: ixor
    //   1356: ixor
    //   1357: lookupswitch default -> 1384, 632176270 -> 1340, 1215201811 -> 15250
    //   1384: putfield limiter : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1387: getstatic Perryc.1 : I
    //   1390: ifeq -> 1404
    //   1393: ldc2_w 150596721
    //   1396: l2i
    //   1397: ldc_w -1362561229
    //   1400: ixor
    //   1401: goto -> 1412
    //   1404: ldc2_w 738320367
    //   1407: l2i
    //   1408: ldc_w -798504292
    //   1411: ixor
    //   1412: ldc2_w -424958640
    //   1415: l2i
    //   1416: ldc_w 1446610099
    //   1419: ixor
    //   1420: ixor
    //   1421: lookupswitch default -> 1448, 379796129 -> 15332, 1377919318 -> 1404
    //   1448: aload_0
    //   1449: getstatic Perryc.c : I
    //   1452: iflt -> 1466
    //   1455: ldc2_w 1827052499
    //   1458: l2i
    //   1459: ldc_w 831717319
    //   1462: ixor
    //   1463: goto -> 1474
    //   1466: ldc2_w 1806904886
    //   1469: l2i
    //   1470: ldc_w 1090719989
    //   1473: ixor
    //   1474: ldc2_w 129535308
    //   1477: l2i
    //   1478: ldc_w -993776798
    //   1481: ixor
    //   1482: ixor
    //   1483: lookupswitch default -> 15224, -1643593158 -> 1466, -372467475 -> 1508
    //   1508: aload_0
    //   1509: new bigname/zprestige/webhack/features/setting/Setting
    //   1512: dup
    //   1513: ldc_w '௭㌜ி'
    //   1516: getstatic Perryc.0 : I
    //   1519: ifle -> 1533
    //   1522: ldc2_w 1568615537
    //   1525: l2i
    //   1526: ldc_w 1266437119
    //   1529: ixor
    //   1530: goto -> 1541
    //   1533: ldc2_w 1001945187
    //   1536: l2i
    //   1537: ldc_w 852473197
    //   1540: ixor
    //   1541: ldc2_w -1337106392
    //   1544: l2i
    //   1545: ldc_w 1749101591
    //   1548: ixor
    //   1549: ixor
    //   1550: lookupswitch default -> 15360, -837866575 -> 1533, -780435151 -> 1576
    //   1576: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1579: ldc2_w 1331596850
    //   1582: l2i
    //   1583: ldc_w 1331596851
    //   1586: ixor
    //   1587: getstatic Perryc.0 : I
    //   1590: ifle -> 1604
    //   1593: ldc2_w -750421345
    //   1596: l2i
    //   1597: ldc_w -288011161
    //   1600: ixor
    //   1601: goto -> 1612
    //   1604: ldc2_w 436517294
    //   1607: l2i
    //   1608: ldc_w -1527458607
    //   1611: ixor
    //   1612: ldc2_w -1591835959
    //   1615: l2i
    //   1616: ldc_w 2038057714
    //   1619: ixor
    //   1620: ixor
    //   1621: lookupswitch default -> 1648, -436928829 -> 15320, 1437410509 -> 1604
    //   1648: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1651: getstatic Perryc.0 : I
    //   1654: ifle -> 1668
    //   1657: ldc2_w -313432894
    //   1660: l2i
    //   1661: ldc_w -520990688
    //   1664: ixor
    //   1665: goto -> 1676
    //   1668: ldc2_w 1912137785
    //   1671: l2i
    //   1672: ldc_w 1810231029
    //   1675: ixor
    //   1676: ldc2_w -455349603
    //   1679: l2i
    //   1680: ldc_w 1397339003
    //   1683: ixor
    //   1684: ixor
    //   1685: lookupswitch default -> 15518, -1383112918 -> 1712, -1171165948 -> 1668
    //   1712: aload_0
    //   1713: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   1718: getstatic Perryc.c : I
    //   1721: iflt -> 1735
    //   1724: ldc2_w 126059195
    //   1727: l2i
    //   1728: ldc_w 1860167842
    //   1731: ixor
    //   1732: goto -> 1743
    //   1735: ldc2_w 771367637
    //   1738: l2i
    //   1739: ldc_w 532440780
    //   1742: ixor
    //   1743: ldc2_w -1924477462
    //   1746: l2i
    //   1747: ldc_w 267091832
    //   1750: ixor
    //   1751: ixor
    //   1752: lookupswitch default -> 1780, -335685493 -> 15538, 2082759169 -> 1735
    //   1780: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   1783: getstatic Perryc.1 : I
    //   1786: ifeq -> 1800
    //   1789: ldc2_w 1167052778
    //   1792: l2i
    //   1793: ldc_w -1609217713
    //   1796: ixor
    //   1797: goto -> 1808
    //   1800: ldc2_w 1118852437
    //   1803: l2i
    //   1804: ldc_w 1824255781
    //   1807: ixor
    //   1808: ldc2_w -1816702317
    //   1811: l2i
    //   1812: ldc_w 492521362
    //   1815: ixor
    //   1816: ixor
    //   1817: lookupswitch default -> 1844, -889904993 -> 1800, 1802933156 -> 15232
    //   1844: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1847: getstatic Perryc.0 : I
    //   1850: ifle -> 1864
    //   1853: ldc2_w 468443982
    //   1856: l2i
    //   1857: ldc_w -566327409
    //   1860: ixor
    //   1861: goto -> 1872
    //   1864: ldc2_w 346920103
    //   1867: l2i
    //   1868: ldc_w -897760239
    //   1871: ixor
    //   1872: ldc2_w 399635083
    //   1875: l2i
    //   1876: ldc_w 1099610751
    //   1879: ixor
    //   1880: ixor
    //   1881: lookupswitch default -> 1908, -1819399115 -> 15574, 313080793 -> 1864
    //   1908: putfield bhop2 : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1911: getstatic Perryc.0 : I
    //   1914: ifle -> 1928
    //   1917: ldc2_w 716063593
    //   1920: l2i
    //   1921: ldc_w 1658630705
    //   1924: ixor
    //   1925: goto -> 1936
    //   1928: ldc2_w 1966664329
    //   1931: l2i
    //   1932: ldc_w 1806494148
    //   1935: ixor
    //   1936: ldc2_w -290419604
    //   1939: l2i
    //   1940: ldc_w -1592515554
    //   1943: ixor
    //   1944: ixor
    //   1945: lookupswitch default -> 15198, 131488042 -> 1928, 1362144063 -> 1972
    //   1972: aload_0
    //   1973: getstatic Perryc.1 : I
    //   1976: ifeq -> 1990
    //   1979: ldc2_w 418895895
    //   1982: l2i
    //   1983: ldc_w 1370184400
    //   1986: ixor
    //   1987: goto -> 1998
    //   1990: ldc2_w -2057197243
    //   1993: l2i
    //   1994: ldc_w 1271859071
    //   1997: ixor
    //   1998: ldc2_w -1274147457
    //   2001: l2i
    //   2002: ldc_w 1342174078
    //   2005: ixor
    //   2006: ixor
    //   2007: lookupswitch default -> 15444, -1297253178 -> 1990, 895438907 -> 2032
    //   2032: aload_0
    //   2033: new bigname/zprestige/webhack/features/setting/Setting
    //   2036: dup
    //   2037: ldc_w '௧㌛஠㶧'
    //   2040: getstatic Perryc.c : I
    //   2043: iflt -> 2057
    //   2046: ldc2_w -166006503
    //   2049: l2i
    //   2050: ldc_w 1414736592
    //   2053: ixor
    //   2054: goto -> 2065
    //   2057: ldc2_w 24104835
    //   2060: l2i
    //   2061: ldc_w -1584096501
    //   2064: ixor
    //   2065: ldc2_w -1609856419
    //   2068: l2i
    //   2069: ldc_w -1708976348
    //   2072: ixor
    //   2073: ixor
    //   2074: lookupswitch default -> 2100, -1738455376 -> 15334, 592522750 -> 2057
    //   2100: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2103: ldc2_w 1223571123
    //   2106: l2i
    //   2107: ldc_w 1223571123
    //   2110: ixor
    //   2111: getstatic Perryc.0 : I
    //   2114: ifle -> 2128
    //   2117: ldc2_w 1628035155
    //   2120: l2i
    //   2121: ldc_w 903490728
    //   2124: ixor
    //   2125: goto -> 2136
    //   2128: ldc2_w -1813578841
    //   2131: l2i
    //   2132: ldc_w 313732987
    //   2135: ixor
    //   2136: ldc2_w -721913229
    //   2139: l2i
    //   2140: ldc_w -2076092810
    //   2143: ixor
    //   2144: ixor
    //   2145: lookupswitch default -> 15398, -772998951 -> 2172, 74111230 -> 2128
    //   2172: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2175: getstatic Perryc.0 : I
    //   2178: ifle -> 2192
    //   2181: ldc2_w -1362944561
    //   2184: l2i
    //   2185: ldc_w -1974605829
    //   2188: ixor
    //   2189: goto -> 2200
    //   2192: ldc2_w 1877987131
    //   2195: l2i
    //   2196: ldc_w -354029443
    //   2199: ixor
    //   2200: ldc2_w -2047245345
    //   2203: l2i
    //   2204: ldc_w -305504494
    //   2207: ixor
    //   2208: ixor
    //   2209: lookupswitch default -> 2236, 439058133 -> 2192, 1287464697 -> 15466
    //   2236: aload_0
    //   2237: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   2242: getstatic Perryc.c : I
    //   2245: iflt -> 2259
    //   2248: ldc2_w 1561547506
    //   2251: l2i
    //   2252: ldc_w -1173124795
    //   2255: ixor
    //   2256: goto -> 2267
    //   2259: ldc2_w -985042799
    //   2262: l2i
    //   2263: ldc_w -329482505
    //   2266: ixor
    //   2267: ldc2_w 1424424367
    //   2270: l2i
    //   2271: ldc_w 222741092
    //   2274: ixor
    //   2275: ixor
    //   2276: lookupswitch default -> 2304, -1096752004 -> 15296, -978656993 -> 2259
    //   2304: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   2307: getstatic Perryc.c : I
    //   2310: iflt -> 2324
    //   2313: ldc2_w 1279962583
    //   2316: l2i
    //   2317: ldc_w -725710234
    //   2320: ixor
    //   2321: goto -> 2332
    //   2324: ldc2_w -93042685
    //   2327: l2i
    //   2328: ldc_w -1313895457
    //   2331: ixor
    //   2332: ldc2_w 1500842832
    //   2335: l2i
    //   2336: ldc_w 1911351504
    //   2339: ixor
    //   2340: ixor
    //   2341: lookupswitch default -> 2368, -1334983631 -> 15480, -125011756 -> 2324
    //   2368: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2371: getstatic Perryc.1 : I
    //   2374: ifeq -> 2388
    //   2377: ldc2_w -1509895273
    //   2380: l2i
    //   2381: ldc_w -1694706038
    //   2384: ixor
    //   2385: goto -> 2396
    //   2388: ldc2_w -1349018644
    //   2391: l2i
    //   2392: ldc_w -134803289
    //   2395: ixor
    //   2396: ldc2_w -2065917535
    //   2399: l2i
    //   2400: ldc_w -1653236584
    //   2403: ixor
    //   2404: ixor
    //   2405: lookupswitch default -> 15566, 626327588 -> 2388, 1103728242 -> 2432
    //   2432: putfield limiter2 : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2435: getstatic Perryc.0 : I
    //   2438: ifle -> 2452
    //   2441: ldc2_w 242629739
    //   2444: l2i
    //   2445: ldc_w -275306905
    //   2448: ixor
    //   2449: goto -> 2460
    //   2452: ldc2_w 672629010
    //   2455: l2i
    //   2456: ldc_w 1007834848
    //   2459: ixor
    //   2460: ldc2_w -647652297
    //   2463: l2i
    //   2464: ldc_w 1162914497
    //   2467: ixor
    //   2468: ixor
    //   2469: lookupswitch default -> 2496, -543818784 -> 2452, 2111057146 -> 15450
    //   2496: aload_0
    //   2497: getstatic Perryc.0 : I
    //   2500: ifle -> 2514
    //   2503: ldc2_w 246780317
    //   2506: l2i
    //   2507: ldc_w 155854491
    //   2510: ixor
    //   2511: goto -> 2522
    //   2514: ldc2_w -761365062
    //   2517: l2i
    //   2518: ldc_w 814488958
    //   2521: ixor
    //   2522: ldc2_w 1635005326
    //   2525: l2i
    //   2526: ldc_w -821646224
    //   2529: ixor
    //   2530: ixor
    //   2531: lookupswitch default -> 15442, -1450366728 -> 2514, 1281425210 -> 2556
    //   2556: aload_0
    //   2557: new bigname/zprestige/webhack/features/setting/Setting
    //   2560: dup
    //   2561: ldc_w '௫㌜ஃ㶶뜥'
    //   2564: getstatic Perryc.c : I
    //   2567: iflt -> 2581
    //   2570: ldc2_w -1747658485
    //   2573: l2i
    //   2574: ldc_w -1752495104
    //   2577: ixor
    //   2578: goto -> 2589
    //   2581: ldc2_w -1913651037
    //   2584: l2i
    //   2585: ldc_w 1938897966
    //   2588: ixor
    //   2589: ldc2_w 1489436050
    //   2592: l2i
    //   2593: ldc_w 1338283787
    //   2596: ixor
    //   2597: ixor
    //   2598: lookupswitch default -> 15292, -379365868 -> 2624, 392019858 -> 2581
    //   2624: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2627: ldc2_w -1472727580
    //   2630: l2i
    //   2631: ldc_w -1472727579
    //   2634: ixor
    //   2635: getstatic Perryc.c : I
    //   2638: iflt -> 2652
    //   2641: ldc2_w -448926469
    //   2644: l2i
    //   2645: ldc_w 2146241093
    //   2648: ixor
    //   2649: goto -> 2660
    //   2652: ldc2_w -1574986482
    //   2655: l2i
    //   2656: ldc_w 1151153355
    //   2659: ixor
    //   2660: ldc2_w -673230010
    //   2663: l2i
    //   2664: ldc_w 20802007
    //   2667: ixor
    //   2668: ixor
    //   2669: lookupswitch default -> 2696, 742807698 -> 2652, 1278401583 -> 15326
    //   2696: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2699: getstatic Perryc.1 : I
    //   2702: ifeq -> 2716
    //   2705: ldc2_w -220693971
    //   2708: l2i
    //   2709: ldc_w -1413076231
    //   2712: ixor
    //   2713: goto -> 2724
    //   2716: ldc2_w 970950645
    //   2719: l2i
    //   2720: ldc_w 1165459278
    //   2723: ixor
    //   2724: ldc2_w -1504097832
    //   2727: l2i
    //   2728: ldc_w -1933204265
    //   2731: ixor
    //   2732: ixor
    //   2733: lookupswitch default -> 2760, 368240307 -> 2716, 1937948123 -> 15568
    //   2760: aload_0
    //   2761: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   2766: getstatic Perryc.1 : I
    //   2769: ifeq -> 2783
    //   2772: ldc2_w -1037032089
    //   2775: l2i
    //   2776: ldc_w -1717407947
    //   2779: ixor
    //   2780: goto -> 2791
    //   2783: ldc2_w -1062439443
    //   2786: l2i
    //   2787: ldc_w 1920578910
    //   2790: ixor
    //   2791: ldc2_w -145114457
    //   2794: l2i
    //   2795: ldc_w 2003940549
    //   2798: ixor
    //   2799: ixor
    //   2800: lookupswitch default -> 15170, -608549840 -> 2783, 855494353 -> 2828
    //   2828: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   2831: getstatic Perryc.c : I
    //   2834: iflt -> 2848
    //   2837: ldc2_w -2106134818
    //   2840: l2i
    //   2841: ldc_w 1229702908
    //   2844: ixor
    //   2845: goto -> 2856
    //   2848: ldc2_w -867219578
    //   2851: l2i
    //   2852: ldc_w -219071478
    //   2855: ixor
    //   2856: ldc2_w -1848145200
    //   2859: l2i
    //   2860: ldc_w 357372008
    //   2863: ixor
    //   2864: ixor
    //   2865: lookupswitch default -> 2892, -945699902 -> 2848, 1336390298 -> 15526
    //   2892: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2895: getstatic Perryc.0 : I
    //   2898: ifle -> 2912
    //   2901: ldc2_w 1742748888
    //   2904: l2i
    //   2905: ldc_w -1341488225
    //   2908: ixor
    //   2909: goto -> 2920
    //   2912: ldc2_w 1935067786
    //   2915: l2i
    //   2916: ldc_w 2002226296
    //   2919: ixor
    //   2920: ldc2_w -87544686
    //   2923: l2i
    //   2924: ldc_w -579321176
    //   2927: ixor
    //   2928: ixor
    //   2929: lookupswitch default -> 2956, -1799971098 -> 2912, -262483587 -> 15218
    //   2956: putfield noLag : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2959: getstatic Perryc.0 : I
    //   2962: ifle -> 2976
    //   2965: ldc2_w 2136667653
    //   2968: l2i
    //   2969: ldc_w -1595764337
    //   2972: ixor
    //   2973: goto -> 2984
    //   2976: ldc2_w -1371055862
    //   2979: l2i
    //   2980: ldc_w 198738483
    //   2983: ixor
    //   2984: ldc2_w 1110049693
    //   2987: l2i
    //   2988: ldc_w 797002180
    //   2991: ixor
    //   2992: ixor
    //   2993: lookupswitch default -> 15310, -1307365933 -> 2976, -936079008 -> 3020
    //   3020: aload_0
    //   3021: getstatic Perryc.c : I
    //   3024: iflt -> 3038
    //   3027: ldc2_w -2094129261
    //   3030: l2i
    //   3031: ldc_w -1024732436
    //   3034: ixor
    //   3035: goto -> 3046
    //   3038: ldc2_w 474443781
    //   3041: l2i
    //   3042: ldc_w 329339509
    //   3045: ixor
    //   3046: ldc2_w -1611365451
    //   3049: l2i
    //   3050: ldc_w 580949014
    //   3053: ixor
    //   3054: ixor
    //   3055: lookupswitch default -> 3080, -279896359 -> 3038, -57550116 -> 15128
    //   3080: aload_0
    //   3081: new bigname/zprestige/webhack/features/setting/Setting
    //   3084: dup
    //   3085: ldc_w '௶㌃ப㶲뜦'
    //   3088: getstatic Perryc.0 : I
    //   3091: ifle -> 3105
    //   3094: ldc2_w 1642150486
    //   3097: l2i
    //   3098: ldc_w 689128381
    //   3101: ixor
    //   3102: goto -> 3113
    //   3105: ldc2_w 1670794877
    //   3108: l2i
    //   3109: ldc_w 880161432
    //   3112: ixor
    //   3113: ldc2_w -1795150452
    //   3116: l2i
    //   3117: ldc_w 676142443
    //   3120: ixor
    //   3121: ixor
    //   3122: lookupswitch default -> 15322, -357741566 -> 3148, -172013300 -> 3105
    //   3148: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3151: ldc2_w 412420755
    //   3154: l2i
    //   3155: ldc_w 412420855
    //   3158: ixor
    //   3159: getstatic Perryc.c : I
    //   3162: iflt -> 3176
    //   3165: ldc2_w -1608257366
    //   3168: l2i
    //   3169: ldc_w 109500526
    //   3172: ixor
    //   3173: goto -> 3184
    //   3176: ldc2_w 1130011997
    //   3179: l2i
    //   3180: ldc_w 447968840
    //   3183: ixor
    //   3184: ldc2_w -1808540018
    //   3187: l2i
    //   3188: ldc_w -775034558
    //   3191: ixor
    //   3192: ixor
    //   3193: lookupswitch default -> 3220, -480567544 -> 15500, 589362004 -> 3176
    //   3220: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3223: ldc2_w 555755782
    //   3226: l2i
    //   3227: ldc_w 555755782
    //   3230: ixor
    //   3231: getstatic Perryc.0 : I
    //   3234: ifle -> 3248
    //   3237: ldc2_w 809436252
    //   3240: l2i
    //   3241: ldc_w 675391507
    //   3244: ixor
    //   3245: goto -> 3256
    //   3248: ldc2_w 510495548
    //   3251: l2i
    //   3252: ldc_w 622129586
    //   3255: ixor
    //   3256: ldc2_w 617095855
    //   3259: l2i
    //   3260: ldc_w -2094027524
    //   3263: ixor
    //   3264: ixor
    //   3265: lookupswitch default -> 3292, -1080483300 -> 15306, 1375323497 -> 3248
    //   3292: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3295: ldc2_w 85852004
    //   3298: l2i
    //   3299: ldc_w 85852146
    //   3302: ixor
    //   3303: getstatic Perryc.c : I
    //   3306: iflt -> 3320
    //   3309: ldc2_w -1126476001
    //   3312: l2i
    //   3313: ldc_w -509572028
    //   3316: ixor
    //   3317: goto -> 3328
    //   3320: ldc2_w 514780414
    //   3323: l2i
    //   3324: ldc_w 1394901589
    //   3327: ixor
    //   3328: ldc2_w -495001876
    //   3331: l2i
    //   3332: ldc_w 1757214466
    //   3335: ixor
    //   3336: ixor
    //   3337: lookupswitch default -> 3364, -1498485127 -> 3320, -675679563 -> 15282
    //   3364: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3367: getstatic Perryc.c : I
    //   3370: iflt -> 3384
    //   3373: ldc2_w 253875618
    //   3376: l2i
    //   3377: ldc_w -1947198840
    //   3380: ixor
    //   3381: goto -> 3392
    //   3384: ldc2_w 1866881807
    //   3387: l2i
    //   3388: ldc_w -1353436852
    //   3391: ixor
    //   3392: ldc2_w 732655822
    //   3395: l2i
    //   3396: ldc_w -1870983552
    //   3399: ixor
    //   3400: ixor
    //   3401: lookupswitch default -> 3428, 1057075556 -> 15522, 1915436520 -> 3384
    //   3428: aload_0
    //   3429: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   3434: getstatic Perryc.1 : I
    //   3437: ifeq -> 3451
    //   3440: ldc2_w -2072069160
    //   3443: l2i
    //   3444: ldc_w -807148735
    //   3447: ixor
    //   3448: goto -> 3459
    //   3451: ldc2_w 538196281
    //   3454: l2i
    //   3455: ldc_w 1850147012
    //   3458: ixor
    //   3459: ldc2_w -1321246929
    //   3462: l2i
    //   3463: ldc_w 970077445
    //   3466: ixor
    //   3467: ixor
    //   3468: lookupswitch default -> 3496, -1667765006 -> 3451, -1016057165 -> 15134
    //   3496: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   3499: getstatic Perryc.1 : I
    //   3502: ifeq -> 3516
    //   3505: ldc2_w -1433868482
    //   3508: l2i
    //   3509: ldc_w -1883423482
    //   3512: ixor
    //   3513: goto -> 3524
    //   3516: ldc2_w 54159810
    //   3519: l2i
    //   3520: ldc_w 1761572663
    //   3523: ixor
    //   3524: ldc2_w -2039985572
    //   3527: l2i
    //   3528: ldc_w -875201627
    //   3531: ixor
    //   3532: ixor
    //   3533: lookupswitch default -> 3560, 1753803713 -> 15484, 1968857028 -> 3516
    //   3560: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3563: getstatic Perryc.c : I
    //   3566: iflt -> 3580
    //   3569: ldc2_w -1308319035
    //   3572: l2i
    //   3573: ldc_w -803337195
    //   3576: ixor
    //   3577: goto -> 3588
    //   3580: ldc2_w -294931639
    //   3583: l2i
    //   3584: ldc_w -1328657829
    //   3587: ixor
    //   3588: ldc2_w 726012567
    //   3591: l2i
    //   3592: ldc_w 353364462
    //   3595: ixor
    //   3596: ixor
    //   3597: lookupswitch default -> 15370, 1548965289 -> 3580, 1626079851 -> 3624
    //   3624: putfield specialMoveSpeed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3627: getstatic Perryc.1 : I
    //   3630: ifeq -> 3644
    //   3633: ldc2_w 12087308
    //   3636: l2i
    //   3637: ldc_w -1415505585
    //   3640: ixor
    //   3641: goto -> 3652
    //   3644: ldc2_w 1008815959
    //   3647: l2i
    //   3648: ldc_w 1936681228
    //   3651: ixor
    //   3652: ldc2_w -338050673
    //   3655: l2i
    //   3656: ldc_w -1165856259
    //   3659: ixor
    //   3660: ixor
    //   3661: lookupswitch default -> 15428, -96282319 -> 3644, 504731177 -> 3688
    //   3688: aload_0
    //   3689: getstatic Perryc.0 : I
    //   3692: ifle -> 3706
    //   3695: ldc2_w 1295128292
    //   3698: l2i
    //   3699: ldc_w 82048785
    //   3702: ixor
    //   3703: goto -> 3714
    //   3706: ldc2_w -579210097
    //   3709: l2i
    //   3710: ldc_w 1770053482
    //   3713: ixor
    //   3714: ldc2_w -958384664
    //   3717: l2i
    //   3718: ldc_w -1970686453
    //   3721: ixor
    //   3722: ixor
    //   3723: lookupswitch default -> 15564, -124737530 -> 3748, 95969814 -> 3706
    //   3748: aload_0
    //   3749: new bigname/zprestige/webhack/features/setting/Setting
    //   3752: dup
    //   3753: ldc_w '௶㌃ப㶲뜦'
    //   3756: getstatic Perryc.c : I
    //   3759: iflt -> 3773
    //   3762: ldc2_w -194278050
    //   3765: l2i
    //   3766: ldc_w 1925913972
    //   3769: ixor
    //   3770: goto -> 3781
    //   3773: ldc2_w 1709305640
    //   3776: l2i
    //   3777: ldc_w 340204681
    //   3780: ixor
    //   3781: ldc2_w -2132156787
    //   3784: l2i
    //   3785: ldc_w -1781677676
    //   3788: ixor
    //   3789: ixor
    //   3790: lookupswitch default -> 3816, -1820029133 -> 15452, 290588298 -> 3773
    //   3816: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3819: ldc2_w -242367610
    //   3822: l2i
    //   3823: ldc_w -242367728
    //   3826: ixor
    //   3827: getstatic Perryc.c : I
    //   3830: iflt -> 3844
    //   3833: ldc2_w 2080411243
    //   3836: l2i
    //   3837: ldc_w 641922420
    //   3840: ixor
    //   3841: goto -> 3852
    //   3844: ldc2_w -1115800961
    //   3847: l2i
    //   3848: ldc_w -1639368458
    //   3851: ixor
    //   3852: ldc2_w 1676393860
    //   3855: l2i
    //   3856: ldc_w 300789741
    //   3859: ixor
    //   3860: ixor
    //   3861: lookupswitch default -> 15200, 675572086 -> 3844, 1362170080 -> 3888
    //   3888: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3891: ldc2_w -758632018
    //   3894: l2i
    //   3895: ldc_w -758632018
    //   3898: ixor
    //   3899: getstatic Perryc.c : I
    //   3902: iflt -> 3916
    //   3905: ldc2_w 1141026403
    //   3908: l2i
    //   3909: ldc_w 1293120046
    //   3912: ixor
    //   3913: goto -> 3924
    //   3916: ldc2_w 1357214205
    //   3919: l2i
    //   3920: ldc_w -1335680799
    //   3923: ixor
    //   3924: ldc2_w 1827014467
    //   3927: l2i
    //   3928: ldc_w -1598575830
    //   3931: ixor
    //   3932: ixor
    //   3933: lookupswitch default -> 15408, -985632732 -> 3916, 752352629 -> 3960
    //   3960: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3963: ldc2_w 373546938
    //   3966: l2i
    //   3967: ldc_w 373546796
    //   3970: ixor
    //   3971: getstatic Perryc.0 : I
    //   3974: ifle -> 3988
    //   3977: ldc2_w -633021203
    //   3980: l2i
    //   3981: ldc_w 1609018761
    //   3984: ixor
    //   3985: goto -> 3996
    //   3988: ldc2_w 2058866607
    //   3991: l2i
    //   3992: ldc_w 433293953
    //   3995: ixor
    //   3996: ldc2_w 336293079
    //   3999: l2i
    //   4000: ldc_w -2140247958
    //   4003: ixor
    //   4004: ixor
    //   4005: lookupswitch default -> 15256, -150912621 -> 4032, 298218969 -> 3988
    //   4032: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4035: getstatic Perryc.1 : I
    //   4038: ifeq -> 4052
    //   4041: ldc2_w -1082377971
    //   4044: l2i
    //   4045: ldc_w 550535667
    //   4048: ixor
    //   4049: goto -> 4060
    //   4052: ldc2_w -832042698
    //   4055: l2i
    //   4056: ldc_w -489946662
    //   4059: ixor
    //   4060: ldc2_w 327601827
    //   4063: l2i
    //   4064: ldc_w 1260404477
    //   4067: ixor
    //   4068: ixor
    //   4069: lookupswitch default -> 4096, -955627360 -> 15362, 1024063178 -> 4052
    //   4096: aload_0
    //   4097: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   4102: getstatic Perryc.c : I
    //   4105: iflt -> 4119
    //   4108: ldc2_w 1300856537
    //   4111: l2i
    //   4112: ldc_w -124711025
    //   4115: ixor
    //   4116: goto -> 4127
    //   4119: ldc2_w 1277686456
    //   4122: l2i
    //   4123: ldc_w -1409201712
    //   4126: ixor
    //   4127: ldc2_w -576038799
    //   4130: l2i
    //   4131: ldc_w 656740014
    //   4134: ixor
    //   4135: ixor
    //   4136: lookupswitch default -> 4164, -1491489443 -> 4119, 1335306121 -> 15550
    //   4164: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   4167: getstatic Perryc.1 : I
    //   4170: ifeq -> 4184
    //   4173: ldc2_w 350863598
    //   4176: l2i
    //   4177: ldc_w -1751316010
    //   4180: ixor
    //   4181: goto -> 4192
    //   4184: ldc2_w -1336294652
    //   4187: l2i
    //   4188: ldc_w 128746498
    //   4191: ixor
    //   4192: ldc2_w 1399971652
    //   4195: l2i
    //   4196: ldc_w 474208221
    //   4199: ixor
    //   4200: ixor
    //   4201: lookupswitch default -> 15420, -867778143 -> 4184, -121155681 -> 4228
    //   4228: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4231: getstatic Perryc.c : I
    //   4234: iflt -> 4248
    //   4237: ldc2_w 1139476206
    //   4240: l2i
    //   4241: ldc_w 1991657961
    //   4244: ixor
    //   4245: goto -> 4256
    //   4248: ldc2_w -1694871213
    //   4251: l2i
    //   4252: ldc_w 28056601
    //   4255: ixor
    //   4256: ldc2_w -1044753102
    //   4259: l2i
    //   4260: ldc_w -213534546
    //   4263: ixor
    //   4264: ixor
    //   4265: lookupswitch default -> 15178, -1448501034 -> 4292, 128098971 -> 4248
    //   4292: putfield potionSpeed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4295: getstatic Perryc.1 : I
    //   4298: ifeq -> 4312
    //   4301: ldc2_w -757046508
    //   4304: l2i
    //   4305: ldc_w -988918918
    //   4308: ixor
    //   4309: goto -> 4320
    //   4312: ldc2_w -776352090
    //   4315: l2i
    //   4316: ldc_w 1383439910
    //   4319: ixor
    //   4320: ldc2_w -1622395348
    //   4323: l2i
    //   4324: ldc_w 1878806815
    //   4327: ixor
    //   4328: ixor
    //   4329: lookupswitch default -> 4356, -1897643413 -> 4312, -413249699 -> 15506
    //   4356: aload_0
    //   4357: getstatic Perryc.c : I
    //   4360: iflt -> 4374
    //   4363: ldc2_w 1261436163
    //   4366: l2i
    //   4367: ldc_w 996038348
    //   4370: ixor
    //   4371: goto -> 4382
    //   4374: ldc2_w 1852949105
    //   4377: l2i
    //   4378: ldc_w -446309180
    //   4381: ixor
    //   4382: ldc2_w 1736045197
    //   4385: l2i
    //   4386: ldc_w 404489562
    //   4389: ixor
    //   4390: ixor
    //   4391: lookupswitch default -> 4416, -1460548837 -> 4374, 252992536 -> 15176
    //   4416: aload_0
    //   4417: new bigname/zprestige/webhack/features/setting/Setting
    //   4420: dup
    //   4421: ldc_w '௶㌃ப㶲뜦'
    //   4424: getstatic Perryc.1 : I
    //   4427: ifeq -> 4441
    //   4430: ldc2_w -1410245333
    //   4433: l2i
    //   4434: ldc_w -1507578755
    //   4437: ixor
    //   4438: goto -> 4449
    //   4441: ldc2_w -686088398
    //   4444: l2i
    //   4445: ldc_w 1960684298
    //   4448: ixor
    //   4449: ldc2_w -130983459
    //   4452: l2i
    //   4453: ldc_w 2139986164
    //   4456: ixor
    //   4457: ixor
    //   4458: lookupswitch default -> 15158, -1972785025 -> 4441, 612005137 -> 4484
    //   4484: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4487: ldc2_w 686245817
    //   4490: l2i
    //   4491: ldc_w 686245679
    //   4494: ixor
    //   4495: getstatic Perryc.c : I
    //   4498: iflt -> 4512
    //   4501: ldc2_w -1475860652
    //   4504: l2i
    //   4505: ldc_w 288687288
    //   4508: ixor
    //   4509: goto -> 4520
    //   4512: ldc2_w -1151183620
    //   4515: l2i
    //   4516: ldc_w 498589695
    //   4519: ixor
    //   4520: ldc2_w -1262305746
    //   4523: l2i
    //   4524: ldc_w 334439017
    //   4527: ixor
    //   4528: ixor
    //   4529: lookupswitch default -> 15390, 33036100 -> 4556, 504414123 -> 4512
    //   4556: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4559: ldc2_w -1527072384
    //   4562: l2i
    //   4563: ldc_w -1527072384
    //   4566: ixor
    //   4567: getstatic Perryc.c : I
    //   4570: iflt -> 4584
    //   4573: ldc2_w -2017391274
    //   4576: l2i
    //   4577: ldc_w 1321297212
    //   4580: ixor
    //   4581: goto -> 4592
    //   4584: ldc2_w -374006327
    //   4587: l2i
    //   4588: ldc_w -464104604
    //   4591: ixor
    //   4592: ldc2_w -232182631
    //   4595: l2i
    //   4596: ldc_w 147863891
    //   4599: ixor
    //   4600: ixor
    //   4601: lookupswitch default -> 4628, 871988640 -> 15136, 1967257007 -> 4584
    //   4628: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4631: ldc2_w 1451311390
    //   4634: l2i
    //   4635: ldc_w 1451311496
    //   4638: ixor
    //   4639: getstatic Perryc.c : I
    //   4642: iflt -> 4656
    //   4645: ldc2_w 724300724
    //   4648: l2i
    //   4649: ldc_w -149956411
    //   4652: ixor
    //   4653: goto -> 4664
    //   4656: ldc2_w -645165877
    //   4659: l2i
    //   4660: ldc_w -1168373275
    //   4663: ixor
    //   4664: ldc2_w 508695631
    //   4667: l2i
    //   4668: ldc_w -1801478434
    //   4671: ixor
    //   4672: ixor
    //   4673: lookupswitch default -> 4700, 1458151904 -> 15552, 1752706807 -> 4656
    //   4700: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   4703: getstatic Perryc.1 : I
    //   4706: ifeq -> 4720
    //   4709: ldc2_w -1099683463
    //   4712: l2i
    //   4713: ldc_w 428401015
    //   4716: ixor
    //   4717: goto -> 4728
    //   4720: ldc2_w -859729689
    //   4723: l2i
    //   4724: ldc_w 1510132290
    //   4727: ixor
    //   4728: ldc2_w 280900331
    //   4731: l2i
    //   4732: ldc_w 2018483673
    //   4735: ixor
    //   4736: ixor
    //   4737: lookupswitch default -> 15464, -821205188 -> 4720, -30214761 -> 4764
    //   4764: aload_0
    //   4765: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   4770: getstatic Perryc.1 : I
    //   4773: ifeq -> 4787
    //   4776: ldc2_w -1885924118
    //   4779: l2i
    //   4780: ldc_w 606039586
    //   4783: ixor
    //   4784: goto -> 4795
    //   4787: ldc2_w 1681819900
    //   4790: l2i
    //   4791: ldc_w 158648658
    //   4794: ixor
    //   4795: ldc2_w -1244573562
    //   4798: l2i
    //   4799: ldc_w 2047084240
    //   4802: ixor
    //   4803: ixor
    //   4804: lookupswitch default -> 4832, 1183420476 -> 4787, 1683827870 -> 15236
    //   4832: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   4835: getstatic Perryc.c : I
    //   4838: iflt -> 4852
    //   4841: ldc2_w -64808113
    //   4844: l2i
    //   4845: ldc_w -449651914
    //   4848: ixor
    //   4849: goto -> 4860
    //   4852: ldc2_w 1577584484
    //   4855: l2i
    //   4856: ldc_w -1909704364
    //   4859: ixor
    //   4860: ldc2_w -1352429769
    //   4863: l2i
    //   4864: ldc_w 1256056488
    //   4867: ixor
    //   4868: ixor
    //   4869: lookupswitch default -> 15258, -55596570 -> 4852, 899307439 -> 4896
    //   4896: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4899: getstatic Perryc.1 : I
    //   4902: ifeq -> 4916
    //   4905: ldc2_w 424748552
    //   4908: l2i
    //   4909: ldc_w -696545597
    //   4912: ixor
    //   4913: goto -> 4924
    //   4916: ldc2_w 245645398
    //   4919: l2i
    //   4920: ldc_w 688893012
    //   4923: ixor
    //   4924: ldc2_w 445185930
    //   4927: l2i
    //   4928: ldc_w -1713892894
    //   4931: ixor
    //   4932: ixor
    //   4933: lookupswitch default -> 4960, -1446188977 -> 4916, 1283081891 -> 15542
    //   4960: putfield potionSpeed2 : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4963: getstatic Perryc.0 : I
    //   4966: ifle -> 4980
    //   4969: ldc2_w 151872807
    //   4972: l2i
    //   4973: ldc_w 952697518
    //   4976: ixor
    //   4977: goto -> 4988
    //   4980: ldc2_w 1516927183
    //   4983: l2i
    //   4984: ldc_w 232142166
    //   4987: ixor
    //   4988: ldc2_w 1721936659
    //   4991: l2i
    //   4992: ldc_w 1540111637
    //   4995: ixor
    //   4996: ixor
    //   4997: lookupswitch default -> 5024, -135574576 -> 4980, 212529551 -> 15368
    //   5024: aload_0
    //   5025: getstatic Perryc.0 : I
    //   5028: ifle -> 5042
    //   5031: ldc2_w 975532854
    //   5034: l2i
    //   5035: ldc_w 887913272
    //   5038: ixor
    //   5039: goto -> 5050
    //   5042: ldc2_w -34683220
    //   5045: l2i
    //   5046: ldc_w 890530562
    //   5049: ixor
    //   5050: ldc2_w 108642999
    //   5053: l2i
    //   5054: ldc_w 1026241775
    //   5057: ixor
    //   5058: ixor
    //   5059: lookupswitch default -> 5084, 899415638 -> 15336, 1940954074 -> 5042
    //   5084: aload_0
    //   5085: new bigname/zprestige/webhack/features/setting/Setting
    //   5088: dup
    //   5089: ldc_w '௡㌵ம㶴뜶๫'
    //   5092: getstatic Perryc.1 : I
    //   5095: ifeq -> 5109
    //   5098: ldc2_w -2000476570
    //   5101: l2i
    //   5102: ldc_w 1269918982
    //   5105: ixor
    //   5106: goto -> 5117
    //   5109: ldc2_w 2099242435
    //   5112: l2i
    //   5113: ldc_w -730613191
    //   5116: ixor
    //   5117: ldc2_w 1676523960
    //   5120: l2i
    //   5121: ldc_w -2141249744
    //   5124: ixor
    //   5125: ixor
    //   5126: lookupswitch default -> 5152, -1642095762 -> 5109, 549514728 -> 15458
    //   5152: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5155: ldc2_w 612587788
    //   5158: l2i
    //   5159: ldc_w 612587972
    //   5162: ixor
    //   5163: getstatic Perryc.1 : I
    //   5166: ifeq -> 5180
    //   5169: ldc2_w 1172270050
    //   5172: l2i
    //   5173: ldc_w -2138340046
    //   5176: ixor
    //   5177: goto -> 5188
    //   5180: ldc2_w 622777109
    //   5183: l2i
    //   5184: ldc_w 784123960
    //   5187: ixor
    //   5188: ldc2_w -1980728483
    //   5191: l2i
    //   5192: ldc_w 616992417
    //   5195: ixor
    //   5196: ixor
    //   5197: lookupswitch default -> 15474, -1500188975 -> 5224, 1751259948 -> 5180
    //   5224: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5227: ldc2_w 947136776
    //   5230: l2i
    //   5231: ldc_w 947136876
    //   5234: ixor
    //   5235: getstatic Perryc.c : I
    //   5238: iflt -> 5252
    //   5241: ldc2_w -1891102366
    //   5244: l2i
    //   5245: ldc_w 1783661789
    //   5248: ixor
    //   5249: goto -> 5260
    //   5252: ldc2_w -1904657882
    //   5255: l2i
    //   5256: ldc_w -985152436
    //   5259: ixor
    //   5260: ldc2_w 1101901752
    //   5263: l2i
    //   5264: ldc_w 454308465
    //   5267: ixor
    //   5268: ixor
    //   5269: lookupswitch default -> 15516, -1079965578 -> 5252, 294085539 -> 5296
    //   5296: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5299: ldc2_w -1563322803
    //   5302: l2i
    //   5303: ldc_w -1563322747
    //   5306: ixor
    //   5307: getstatic Perryc.1 : I
    //   5310: ifeq -> 5324
    //   5313: ldc2_w 1023155534
    //   5316: l2i
    //   5317: ldc_w 606732523
    //   5320: ixor
    //   5321: goto -> 5332
    //   5324: ldc2_w 592533280
    //   5327: l2i
    //   5328: ldc_w -1469891020
    //   5331: ixor
    //   5332: ldc2_w 562931620
    //   5335: l2i
    //   5336: ldc_w 1305882865
    //   5339: ixor
    //   5340: ixor
    //   5341: lookupswitch default -> 15274, -412484031 -> 5368, 1955433200 -> 5324
    //   5368: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5371: getstatic Perryc.c : I
    //   5374: iflt -> 5388
    //   5377: ldc2_w 1935600997
    //   5380: l2i
    //   5381: ldc_w -1942906450
    //   5384: ixor
    //   5385: goto -> 5396
    //   5388: ldc2_w -1824999521
    //   5391: l2i
    //   5392: ldc_w 1665882962
    //   5395: ixor
    //   5396: ldc2_w -560241140
    //   5399: l2i
    //   5400: ldc_w 976949249
    //   5403: ixor
    //   5404: ixor
    //   5405: lookupswitch default -> 5432, -1470552108 -> 5388, 466551494 -> 15410
    //   5432: aload_0
    //   5433: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   5438: getstatic Perryc.1 : I
    //   5441: ifeq -> 5455
    //   5444: ldc2_w -33024622
    //   5447: l2i
    //   5448: ldc_w -943942941
    //   5451: ixor
    //   5452: goto -> 5463
    //   5455: ldc2_w -1344569036
    //   5458: l2i
    //   5459: ldc_w 1554619586
    //   5462: ixor
    //   5463: ldc2_w -1671899189
    //   5466: l2i
    //   5467: ldc_w -432097544
    //   5470: ixor
    //   5471: ixor
    //   5472: lookupswitch default -> 15476, -1995146043 -> 5500, 1137894978 -> 5455
    //   5500: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   5503: getstatic Perryc.0 : I
    //   5506: ifle -> 5520
    //   5509: ldc2_w 1921574328
    //   5512: l2i
    //   5513: ldc_w 176470480
    //   5516: ixor
    //   5517: goto -> 5528
    //   5520: ldc2_w 1035166663
    //   5523: l2i
    //   5524: ldc_w 78584639
    //   5527: ixor
    //   5528: ldc2_w -1078860630
    //   5531: l2i
    //   5532: ldc_w 1939748533
    //   5535: ixor
    //   5536: ixor
    //   5537: lookupswitch default -> 5564, -1272738185 -> 15300, -693050330 -> 5520
    //   5564: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5567: getstatic Perryc.0 : I
    //   5570: ifle -> 5584
    //   5573: ldc2_w 1070978573
    //   5576: l2i
    //   5577: ldc_w 2116210893
    //   5580: ixor
    //   5581: goto -> 5592
    //   5584: ldc2_w -248730238
    //   5587: l2i
    //   5588: ldc_w -2117284466
    //   5591: ixor
    //   5592: ldc2_w -1323176949
    //   5595: l2i
    //   5596: ldc_w 1482765649
    //   5599: ixor
    //   5600: ixor
    //   5601: lookupswitch default -> 5628, -1464344678 -> 15354, -64991005 -> 5584
    //   5628: putfield dFactor : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5631: getstatic Perryc.c : I
    //   5634: iflt -> 5648
    //   5637: ldc2_w -461374347
    //   5640: l2i
    //   5641: ldc_w 2112080469
    //   5644: ixor
    //   5645: goto -> 5656
    //   5648: ldc2_w 2135220928
    //   5651: l2i
    //   5652: ldc_w 325646297
    //   5655: ixor
    //   5656: ldc2_w -1590414693
    //   5659: l2i
    //   5660: ldc_w 1014368993
    //   5663: ixor
    //   5664: ixor
    //   5665: lookupswitch default -> 5692, 81661530 -> 15162, 2087304942 -> 5648
    //   5692: aload_0
    //   5693: getstatic Perryc.0 : I
    //   5696: ifle -> 5710
    //   5699: ldc2_w 688084680
    //   5702: l2i
    //   5703: ldc_w 1362596426
    //   5706: ixor
    //   5707: goto -> 5718
    //   5710: ldc2_w -1294377996
    //   5713: l2i
    //   5714: ldc_w -985763417
    //   5717: ixor
    //   5718: ldc2_w -1556095806
    //   5721: l2i
    //   5722: ldc_w 2135852360
    //   5725: ixor
    //   5726: ixor
    //   5727: lookupswitch default -> 5752, -1538941688 -> 15252, -1083192105 -> 5710
    //   5752: aload_0
    //   5753: new bigname/zprestige/webhack/features/setting/Setting
    //   5756: dup
    //   5757: ldc_w '௤㌐஬㶲뜮'
    //   5760: getstatic Perryc.0 : I
    //   5763: ifle -> 5777
    //   5766: ldc2_w 513884035
    //   5769: l2i
    //   5770: ldc_w 2140809033
    //   5773: ixor
    //   5774: goto -> 5785
    //   5777: ldc2_w 355154500
    //   5780: l2i
    //   5781: ldc_w -741107809
    //   5784: ixor
    //   5785: ldc2_w 36938650
    //   5788: l2i
    //   5789: ldc_w -2026397617
    //   5792: ixor
    //   5793: ixor
    //   5794: lookupswitch default -> 15468, -465626337 -> 5777, 1140633102 -> 5820
    //   5820: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5823: ldc2_w 883151970
    //   5826: l2i
    //   5827: ldc_w 883154172
    //   5830: ixor
    //   5831: getstatic Perryc.0 : I
    //   5834: ifle -> 5848
    //   5837: ldc2_w 1690820892
    //   5840: l2i
    //   5841: ldc_w -1769889482
    //   5844: ixor
    //   5845: goto -> 5856
    //   5848: ldc2_w 1617219124
    //   5851: l2i
    //   5852: ldc_w 1715060781
    //   5855: ixor
    //   5856: ldc2_w 311677814
    //   5859: l2i
    //   5860: ldc_w -386387745
    //   5863: ixor
    //   5864: ixor
    //   5865: lookupswitch default -> 5892, -1958428566 -> 5848, 137208707 -> 15230
    //   5892: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5895: ldc2_w 672994523
    //   5898: l2i
    //   5899: ldc_w 672995123
    //   5902: ixor
    //   5903: getstatic Perryc.1 : I
    //   5906: ifeq -> 5920
    //   5909: ldc2_w -703547781
    //   5912: l2i
    //   5913: ldc_w -699790763
    //   5916: ixor
    //   5917: goto -> 5928
    //   5920: ldc2_w -1337904364
    //   5923: l2i
    //   5924: ldc_w 422475002
    //   5927: ixor
    //   5928: ldc2_w -1695908629
    //   5931: l2i
    //   5932: ldc_w 1583798336
    //   5935: ixor
    //   5936: ixor
    //   5937: lookupswitch default -> 5964, -992601979 -> 15208, -75305658 -> 5920
    //   5964: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   5967: ldc2_w 76530739
    //   5970: l2i
    //   5971: ldc_w 76533239
    //   5974: ixor
    //   5975: getstatic Perryc.1 : I
    //   5978: ifeq -> 5992
    //   5981: ldc2_w -59691075
    //   5984: l2i
    //   5985: ldc_w 1373123490
    //   5988: ixor
    //   5989: goto -> 6000
    //   5992: ldc2_w -601109204
    //   5995: l2i
    //   5996: ldc_w -1395467607
    //   5999: ixor
    //   6000: ldc2_w 752218008
    //   6003: l2i
    //   6004: ldc_w 16331303
    //   6007: ixor
    //   6008: ixor
    //   6009: lookupswitch default -> 6036, -2121940576 -> 15228, 1593062342 -> 5992
    //   6036: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   6039: getstatic Perryc.c : I
    //   6042: iflt -> 6056
    //   6045: ldc2_w -66661618
    //   6048: l2i
    //   6049: ldc_w -835862468
    //   6052: ixor
    //   6053: goto -> 6064
    //   6056: ldc2_w 1787410017
    //   6059: l2i
    //   6060: ldc_w -2050451274
    //   6063: ixor
    //   6064: ldc2_w -511714080
    //   6067: l2i
    //   6068: ldc_w -1134061022
    //   6071: ixor
    //   6072: ixor
    //   6073: lookupswitch default -> 6100, -487988241 -> 6056, 1865635312 -> 15184
    //   6100: aload_0
    //   6101: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   6106: getstatic Perryc.1 : I
    //   6109: ifeq -> 6123
    //   6112: ldc2_w 745540864
    //   6115: l2i
    //   6116: ldc_w -1050845205
    //   6119: ixor
    //   6120: goto -> 6131
    //   6123: ldc2_w -868818706
    //   6126: l2i
    //   6127: ldc_w 836074232
    //   6130: ixor
    //   6131: ldc2_w -104120949
    //   6134: l2i
    //   6135: ldc_w 1486379582
    //   6138: ixor
    //   6139: ixor
    //   6140: lookupswitch default -> 6168, 1050205075 -> 6123, 1283339614 -> 15530
    //   6168: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   6171: getstatic Perryc.0 : I
    //   6174: ifle -> 6188
    //   6177: ldc2_w -1648761576
    //   6180: l2i
    //   6181: ldc_w -168770123
    //   6184: ixor
    //   6185: goto -> 6196
    //   6188: ldc2_w 386327046
    //   6191: l2i
    //   6192: ldc_w -179621135
    //   6195: ixor
    //   6196: ldc2_w 269411056
    //   6199: l2i
    //   6200: ldc_w -1130873127
    //   6203: ixor
    //   6204: ixor
    //   6205: lookupswitch default -> 6232, -991953788 -> 15460, 148219407 -> 6188
    //   6232: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6235: getstatic Perryc.c : I
    //   6238: iflt -> 6252
    //   6241: ldc2_w 884924453
    //   6244: l2i
    //   6245: ldc_w -1671535793
    //   6248: ixor
    //   6249: goto -> 6260
    //   6252: ldc2_w -1624130698
    //   6255: l2i
    //   6256: ldc_w -726850743
    //   6259: ixor
    //   6260: ldc2_w 362261252
    //   6263: l2i
    //   6264: ldc_w -1841070309
    //   6267: ixor
    //   6268: ixor
    //   6269: lookupswitch default -> 15286, -867677152 -> 6296, 791959413 -> 6252
    //   6296: putfield acceleration : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6299: getstatic Perryc.1 : I
    //   6302: ifeq -> 6316
    //   6305: ldc2_w -1798196140
    //   6308: l2i
    //   6309: ldc_w 1650508631
    //   6312: ixor
    //   6313: goto -> 6324
    //   6316: ldc2_w 649090603
    //   6319: l2i
    //   6320: ldc_w 1498855668
    //   6323: ixor
    //   6324: ldc2_w 1903466624
    //   6327: l2i
    //   6328: ldc_w -1970523844
    //   6331: ixor
    //   6332: ixor
    //   6333: lookupswitch default -> 6360, 222944959 -> 15454, 882030951 -> 6316
    //   6360: aload_0
    //   6361: getstatic Perryc.1 : I
    //   6364: ifeq -> 6378
    //   6367: ldc2_w 161836375
    //   6370: l2i
    //   6371: ldc_w 1636925001
    //   6374: ixor
    //   6375: goto -> 6386
    //   6378: ldc2_w -1568093629
    //   6381: l2i
    //   6382: ldc_w 689150210
    //   6385: ixor
    //   6386: ldc2_w -1031475124
    //   6389: l2i
    //   6390: ldc_w 403806228
    //   6393: ixor
    //   6394: ixor
    //   6395: lookupswitch default -> 15164, -1298039994 -> 6378, 1359887129 -> 6420
    //   6420: aload_0
    //   6421: new bigname/zprestige/webhack/features/setting/Setting
    //   6424: dup
    //   6425: ldc_w '௶㌃ப㶲뜦๰癥蹪'
    //   6428: getstatic Perryc.1 : I
    //   6431: ifeq -> 6445
    //   6434: ldc2_w 635867285
    //   6437: l2i
    //   6438: ldc_w 451782415
    //   6441: ixor
    //   6442: goto -> 6453
    //   6445: ldc2_w -799572606
    //   6448: l2i
    //   6449: ldc_w -809554061
    //   6452: ixor
    //   6453: ldc2_w 377015343
    //   6456: l2i
    //   6457: ldc_w -783334048
    //   6460: ixor
    //   6461: ixor
    //   6462: lookupswitch default -> 15294, -656417858 -> 6488, -130236715 -> 6445
    //   6488: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6491: ldc_w 1.2941226
    //   6494: invokestatic floatToIntBits : (F)I
    //   6497: ldc_w 2111153615
    //   6500: ixor
    //   6501: invokestatic intBitsToFloat : (I)F
    //   6504: getstatic Perryc.c : I
    //   6507: iflt -> 6521
    //   6510: ldc2_w 1240579051
    //   6513: l2i
    //   6514: ldc_w -1214980714
    //   6517: ixor
    //   6518: goto -> 6529
    //   6521: ldc2_w -1625191049
    //   6524: l2i
    //   6525: ldc_w 873658695
    //   6528: ixor
    //   6529: ldc2_w 473423462
    //   6532: l2i
    //   6533: ldc_w -2141284813
    //   6536: ixor
    //   6537: ixor
    //   6538: lookupswitch default -> 15346, 928660581 -> 6564, 1644965416 -> 6521
    //   6564: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6567: ldc_w 0.9392298
    //   6570: invokestatic floatToIntBits : (F)I
    //   6573: ldc_w 2127589725
    //   6576: ixor
    //   6577: invokestatic intBitsToFloat : (I)F
    //   6580: getstatic Perryc.1 : I
    //   6583: ifeq -> 6597
    //   6586: ldc2_w 415020784
    //   6589: l2i
    //   6590: ldc_w 1380885991
    //   6593: ixor
    //   6594: goto -> 6605
    //   6597: ldc2_w 519113581
    //   6600: l2i
    //   6601: ldc_w -1434698826
    //   6604: ixor
    //   6605: ldc2_w -35439207
    //   6608: l2i
    //   6609: ldc_w 1732795108
    //   6612: ixor
    //   6613: ixor
    //   6614: lookupswitch default -> 15404, -799443862 -> 6597, 774264742 -> 6640
    //   6640: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6643: ldc_w 0.06152118
    //   6646: invokestatic floatToIntBits : (F)I
    //   6649: ldc_w 2131492258
    //   6652: ixor
    //   6653: invokestatic intBitsToFloat : (I)F
    //   6656: getstatic Perryc.c : I
    //   6659: iflt -> 6673
    //   6662: ldc2_w 1380304933
    //   6665: l2i
    //   6666: ldc_w -1727516144
    //   6669: ixor
    //   6670: goto -> 6681
    //   6673: ldc2_w -326555912
    //   6676: l2i
    //   6677: ldc_w -1841807261
    //   6680: ixor
    //   6681: ldc2_w -1467375309
    //   6684: l2i
    //   6685: ldc_w -1018958376
    //   6688: ixor
    //   6689: ixor
    //   6690: lookupswitch default -> 6716, -1601718562 -> 15266, 382883062 -> 6673
    //   6716: invokestatic valueOf : (F)Ljava/lang/Float;
    //   6719: getstatic Perryc.1 : I
    //   6722: ifeq -> 6736
    //   6725: ldc2_w 630703448
    //   6728: l2i
    //   6729: ldc_w 66934673
    //   6732: ixor
    //   6733: goto -> 6744
    //   6736: ldc2_w 1177004091
    //   6739: l2i
    //   6740: ldc_w -1724551455
    //   6743: ixor
    //   6744: ldc2_w -742720982
    //   6747: l2i
    //   6748: ldc_w -1983956422
    //   6751: ixor
    //   6752: ixor
    //   6753: lookupswitch default -> 15348, -2062088502 -> 6780, 2087670489 -> 6736
    //   6780: aload_0
    //   6781: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   6786: getstatic Perryc.1 : I
    //   6789: ifeq -> 6803
    //   6792: ldc2_w 668806981
    //   6795: l2i
    //   6796: ldc_w 399209851
    //   6799: ixor
    //   6800: goto -> 6811
    //   6803: ldc2_w -171933208
    //   6806: l2i
    //   6807: ldc_w -122563280
    //   6810: ixor
    //   6811: ldc2_w 598903237
    //   6814: l2i
    //   6815: ldc_w -1535278156
    //   6818: ixor
    //   6819: ixor
    //   6820: lookupswitch default -> 15138, -1967235415 -> 6848, -1210494897 -> 6803
    //   6848: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   6851: getstatic Perryc.c : I
    //   6854: iflt -> 6868
    //   6857: ldc2_w 439028820
    //   6860: l2i
    //   6861: ldc_w -1674539319
    //   6864: ixor
    //   6865: goto -> 6876
    //   6868: ldc2_w -620675846
    //   6871: l2i
    //   6872: ldc_w -618157586
    //   6875: ixor
    //   6876: ldc2_w 1564933977
    //   6879: l2i
    //   6880: ldc_w -1150936890
    //   6883: ixor
    //   6884: ixor
    //   6885: lookupswitch default -> 15130, -435785077 -> 6912, 1614505218 -> 6868
    //   6912: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6915: getstatic Perryc.c : I
    //   6918: iflt -> 6932
    //   6921: ldc2_w -1148993863
    //   6924: l2i
    //   6925: ldc_w 2135531105
    //   6928: ixor
    //   6929: goto -> 6940
    //   6932: ldc2_w 1341996847
    //   6935: l2i
    //   6936: ldc_w -731874719
    //   6939: ixor
    //   6940: ldc2_w -1023877953
    //   6943: l2i
    //   6944: ldc_w 1085840614
    //   6947: ixor
    //   6948: ixor
    //   6949: lookupswitch default -> 6976, -1543210271 -> 6932, 1183473793 -> 15284
    //   6976: putfield speedLimit : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6979: getstatic Perryc.0 : I
    //   6982: ifle -> 6996
    //   6985: ldc2_w -493764416
    //   6988: l2i
    //   6989: ldc_w -169539146
    //   6992: ixor
    //   6993: goto -> 7004
    //   6996: ldc2_w -1731671416
    //   6999: l2i
    //   7000: ldc_w 268231660
    //   7003: ixor
    //   7004: ldc2_w 545135448
    //   7007: l2i
    //   7008: ldc_w -1948917898
    //   7011: ixor
    //   7012: ixor
    //   7013: lookupswitch default -> 7040, -1126232744 -> 15120, 1160855246 -> 6996
    //   7040: aload_0
    //   7041: getstatic Perryc.1 : I
    //   7044: ifeq -> 7058
    //   7047: ldc2_w 148988789
    //   7050: l2i
    //   7051: ldc_w -594404721
    //   7054: ixor
    //   7055: goto -> 7066
    //   7058: ldc2_w -539914284
    //   7061: l2i
    //   7062: ldc_w 671246532
    //   7065: ixor
    //   7066: ldc2_w -822877916
    //   7069: l2i
    //   7070: ldc_w 1300798421
    //   7073: ixor
    //   7074: ixor
    //   7075: lookupswitch default -> 7100, -1550725869 -> 7058, 1460142859 -> 15412
    //   7100: aload_0
    //   7101: new bigname/zprestige/webhack/features/setting/Setting
    //   7104: dup
    //   7105: ldc_w '௶㌃ப㶲뜦๰癥蹪덌'
    //   7108: getstatic Perryc.c : I
    //   7111: iflt -> 7125
    //   7114: ldc2_w 677043360
    //   7117: l2i
    //   7118: ldc_w 642378636
    //   7121: ixor
    //   7122: goto -> 7133
    //   7125: ldc2_w 543278233
    //   7128: l2i
    //   7129: ldc_w -1784782772
    //   7132: ixor
    //   7133: ldc2_w -1392495391
    //   7136: l2i
    //   7137: ldc_w 890881389
    //   7140: ixor
    //   7141: ixor
    //   7142: lookupswitch default -> 7168, -1938271391 -> 7125, -1777678688 -> 15154
    //   7168: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7171: ldc_w 0.0151470145
    //   7174: invokestatic floatToIntBits : (F)I
    //   7177: ldc_w 2114464559
    //   7180: ixor
    //   7181: invokestatic intBitsToFloat : (I)F
    //   7184: getstatic Perryc.0 : I
    //   7187: ifle -> 7201
    //   7190: ldc2_w -966801219
    //   7193: l2i
    //   7194: ldc_w -807824877
    //   7197: ixor
    //   7198: goto -> 7209
    //   7201: ldc2_w -850569803
    //   7204: l2i
    //   7205: ldc_w 485513539
    //   7208: ixor
    //   7209: ldc2_w -488735146
    //   7212: l2i
    //   7213: ldc_w 790303238
    //   7216: ixor
    //   7217: ixor
    //   7218: lookupswitch default -> 15142, -1002227970 -> 7201, 477651110 -> 7244
    //   7244: invokestatic valueOf : (F)Ljava/lang/Float;
    //   7247: ldc_w 0.34764495
    //   7250: invokestatic floatToIntBits : (F)I
    //   7253: ldc_w 2131885701
    //   7256: ixor
    //   7257: invokestatic intBitsToFloat : (I)F
    //   7260: getstatic Perryc.1 : I
    //   7263: ifeq -> 7277
    //   7266: ldc2_w 1016485445
    //   7269: l2i
    //   7270: ldc_w -1301354343
    //   7273: ixor
    //   7274: goto -> 7285
    //   7277: ldc2_w -937105140
    //   7280: l2i
    //   7281: ldc_w 1198856199
    //   7284: ixor
    //   7285: ldc2_w 1758387192
    //   7288: l2i
    //   7289: ldc_w -1467359016
    //   7292: ixor
    //   7293: ixor
    //   7294: lookupswitch default -> 7320, -50521311 -> 7277, 1321174524 -> 15276
    //   7320: invokestatic valueOf : (F)Ljava/lang/Float;
    //   7323: ldc_w 0.049317807
    //   7326: invokestatic floatToIntBits : (F)I
    //   7329: ldc_w 2134507896
    //   7332: ixor
    //   7333: invokestatic intBitsToFloat : (I)F
    //   7336: getstatic Perryc.1 : I
    //   7339: ifeq -> 7353
    //   7342: ldc2_w 155649243
    //   7345: l2i
    //   7346: ldc_w 1470861125
    //   7349: ixor
    //   7350: goto -> 7361
    //   7353: ldc2_w 875218658
    //   7356: l2i
    //   7357: ldc_w 2024756039
    //   7360: ixor
    //   7361: ldc2_w -1962081787
    //   7364: l2i
    //   7365: ldc_w -1829280592
    //   7368: ixor
    //   7369: ixor
    //   7370: lookupswitch default -> 15392, 1192684843 -> 7353, 1434448656 -> 7396
    //   7396: invokestatic valueOf : (F)Ljava/lang/Float;
    //   7399: getstatic Perryc.c : I
    //   7402: iflt -> 7416
    //   7405: ldc2_w 1928288074
    //   7408: l2i
    //   7409: ldc_w 106204745
    //   7412: ixor
    //   7413: goto -> 7424
    //   7416: ldc2_w 1828360859
    //   7419: l2i
    //   7420: ldc_w 240976762
    //   7423: ixor
    //   7424: ldc2_w 572998808
    //   7427: l2i
    //   7428: ldc_w -227691236
    //   7431: ixor
    //   7432: ixor
    //   7433: lookupswitch default -> 7460, -1527699321 -> 15216, 56788531 -> 7416
    //   7460: aload_0
    //   7461: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   7466: getstatic Perryc.1 : I
    //   7469: ifeq -> 7483
    //   7472: ldc2_w -746685020
    //   7475: l2i
    //   7476: ldc_w -1240718797
    //   7479: ixor
    //   7480: goto -> 7491
    //   7483: ldc2_w -312831513
    //   7486: l2i
    //   7487: ldc_w 1135707486
    //   7490: ixor
    //   7491: ldc2_w 754320385
    //   7494: l2i
    //   7495: ldc_w -1410194185
    //   7498: ixor
    //   7499: ixor
    //   7500: lookupswitch default -> 7528, -2077753003 -> 7483, -495550623 -> 15122
    //   7528: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   7531: getstatic Perryc.0 : I
    //   7534: ifle -> 7548
    //   7537: ldc2_w 67031740
    //   7540: l2i
    //   7541: ldc_w -1245846235
    //   7544: ixor
    //   7545: goto -> 7556
    //   7548: ldc2_w 1424053685
    //   7551: l2i
    //   7552: ldc_w -374247010
    //   7555: ixor
    //   7556: ldc2_w 2102599402
    //   7559: l2i
    //   7560: ldc_w -1513497762
    //   7563: ixor
    //   7564: ixor
    //   7565: lookupswitch default -> 7592, -1338736925 -> 7548, 1859777069 -> 15304
    //   7592: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7595: getstatic Perryc.0 : I
    //   7598: ifle -> 7612
    //   7601: ldc2_w -1472120633
    //   7604: l2i
    //   7605: ldc_w 1901846367
    //   7608: ixor
    //   7609: goto -> 7620
    //   7612: ldc2_w -775469382
    //   7615: l2i
    //   7616: ldc_w -1754675109
    //   7619: ixor
    //   7620: ldc2_w -384835681
    //   7623: l2i
    //   7624: ldc_w 480897521
    //   7627: ixor
    //   7628: ixor
    //   7629: lookupswitch default -> 15502, -1291274097 -> 7656, 750572022 -> 7612
    //   7656: putfield speedLimit2 : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7659: getstatic Perryc.1 : I
    //   7662: ifeq -> 7676
    //   7665: ldc2_w -1540728169
    //   7668: l2i
    //   7669: ldc_w -2139156590
    //   7672: ixor
    //   7673: goto -> 7684
    //   7676: ldc2_w -2007413703
    //   7679: l2i
    //   7680: ldc_w 997960601
    //   7683: ixor
    //   7684: ldc2_w 1080109440
    //   7687: l2i
    //   7688: ldc_w -2078903242
    //   7691: ixor
    //   7692: ixor
    //   7693: lookupswitch default -> 15168, -534640461 -> 7676, 2002106902 -> 7720
    //   7720: aload_0
    //   7721: getstatic Perryc.1 : I
    //   7724: ifeq -> 7738
    //   7727: ldc2_w 421533939
    //   7730: l2i
    //   7731: ldc_w 1696353459
    //   7734: ixor
    //   7735: goto -> 7746
    //   7738: ldc2_w -857283758
    //   7741: l2i
    //   7742: ldc_w 406124676
    //   7745: ixor
    //   7746: ldc2_w -528313562
    //   7749: l2i
    //   7750: ldc_w -379910490
    //   7753: ixor
    //   7754: ixor
    //   7755: lookupswitch default -> 15234, -586445226 -> 7780, 1977991616 -> 7738
    //   7780: aload_0
    //   7781: new bigname/zprestige/webhack/features/setting/Setting
    //   7784: dup
    //   7785: ldc_w '௼㌼ன㶱뜱๭'
    //   7788: getstatic Perryc.0 : I
    //   7791: ifle -> 7805
    //   7794: ldc2_w 1558954390
    //   7797: l2i
    //   7798: ldc_w 899306524
    //   7801: ixor
    //   7802: goto -> 7813
    //   7805: ldc2_w 518904838
    //   7808: l2i
    //   7809: ldc_w 839877887
    //   7812: ixor
    //   7813: ldc2_w -2006500441
    //   7816: l2i
    //   7817: ldc_w 359509920
    //   7820: ixor
    //   7821: ixor
    //   7822: lookupswitch default -> 7848, -193265267 -> 15204, 912354185 -> 7805
    //   7848: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7851: ldc2_w 450781760
    //   7854: l2i
    //   7855: ldc_w 450782160
    //   7858: ixor
    //   7859: getstatic Perryc.c : I
    //   7862: iflt -> 7876
    //   7865: ldc2_w 655170788
    //   7868: l2i
    //   7869: ldc_w -683180338
    //   7872: ixor
    //   7873: goto -> 7884
    //   7876: ldc2_w -1842780627
    //   7879: l2i
    //   7880: ldc_w 1172784325
    //   7883: ixor
    //   7884: ldc2_w 1628232673
    //   7887: l2i
    //   7888: ldc_w -580376334
    //   7891: ixor
    //   7892: ixor
    //   7893: lookupswitch default -> 15546, 1278120249 -> 7876, 1806356987 -> 7920
    //   7920: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7923: ldc2_w 190321693
    //   7926: l2i
    //   7927: ldc_w 190321987
    //   7930: ixor
    //   7931: getstatic Perryc.c : I
    //   7934: iflt -> 7948
    //   7937: ldc2_w 2064218337
    //   7940: l2i
    //   7941: ldc_w 1205578608
    //   7944: ixor
    //   7945: goto -> 7956
    //   7948: ldc2_w -1659378023
    //   7951: l2i
    //   7952: ldc_w 1955242001
    //   7955: ixor
    //   7956: ldc2_w -1144404730
    //   7959: l2i
    //   7960: ldc_w -2065484739
    //   7963: ixor
    //   7964: ixor
    //   7965: lookupswitch default -> 15290, -692602957 -> 7992, 66593450 -> 7948
    //   7992: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   7995: ldc2_w -844693931
    //   7998: l2i
    //   7999: ldc_w -844693599
    //   8002: ixor
    //   8003: getstatic Perryc.0 : I
    //   8006: ifle -> 8020
    //   8009: ldc2_w -937191549
    //   8012: l2i
    //   8013: ldc_w -1736236697
    //   8016: ixor
    //   8017: goto -> 8028
    //   8020: ldc2_w 85417540
    //   8023: l2i
    //   8024: ldc_w 1807963972
    //   8027: ixor
    //   8028: ldc2_w 1520432093
    //   8031: l2i
    //   8032: ldc_w -465597094
    //   8035: ixor
    //   8036: ixor
    //   8037: lookupswitch default -> 8064, -301938589 -> 15146, 1864511982 -> 8020
    //   8064: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   8067: getstatic Perryc.c : I
    //   8070: iflt -> 8084
    //   8073: ldc2_w -2122214706
    //   8076: l2i
    //   8077: ldc_w 326247630
    //   8080: ixor
    //   8081: goto -> 8092
    //   8084: ldc2_w 1768036557
    //   8087: l2i
    //   8088: ldc_w -203873032
    //   8091: ixor
    //   8092: ldc2_w 1987418978
    //   8095: l2i
    //   8096: ldc_w 410649640
    //   8099: ixor
    //   8100: ixor
    //   8101: lookupswitch default -> 15544, -189488257 -> 8128, -50583222 -> 8084
    //   8128: aload_0
    //   8129: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   8134: getstatic Perryc.0 : I
    //   8137: ifle -> 8151
    //   8140: ldc2_w -630917511
    //   8143: l2i
    //   8144: ldc_w -395064657
    //   8147: ixor
    //   8148: goto -> 8159
    //   8151: ldc2_w 644831056
    //   8154: l2i
    //   8155: ldc_w 1393409533
    //   8158: ixor
    //   8159: ldc2_w 1559070018
    //   8162: l2i
    //   8163: ldc_w 1837260155
    //   8166: ixor
    //   8167: ixor
    //   8168: lookupswitch default -> 8196, 58254575 -> 15406, 2046759668 -> 8151
    //   8196: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   8199: getstatic Perryc.0 : I
    //   8202: ifle -> 8216
    //   8205: ldc2_w -534025522
    //   8208: l2i
    //   8209: ldc_w 64026818
    //   8212: ixor
    //   8213: goto -> 8224
    //   8216: ldc2_w 1036859009
    //   8219: l2i
    //   8220: ldc_w -1574136537
    //   8223: ixor
    //   8224: ldc2_w -1007461449
    //   8227: l2i
    //   8228: ldc_w -782446397
    //   8231: ixor
    //   8232: ixor
    //   8233: lookupswitch default -> 15422, -1924257582 -> 8260, -246146696 -> 8216
    //   8260: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8263: getstatic Perryc.1 : I
    //   8266: ifeq -> 8280
    //   8269: ldc2_w 1447015861
    //   8272: l2i
    //   8273: ldc_w -680294327
    //   8276: ixor
    //   8277: goto -> 8288
    //   8280: ldc2_w 232039390
    //   8283: l2i
    //   8284: ldc_w 1030016744
    //   8287: ixor
    //   8288: ldc2_w -1620883720
    //   8291: l2i
    //   8292: ldc_w -174199269
    //   8295: ixor
    //   8296: ixor
    //   8297: lookupswitch default -> 8324, -340617953 -> 15174, -79013954 -> 8280
    //   8324: putfield yOffset : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8327: getstatic Perryc.0 : I
    //   8330: ifle -> 8344
    //   8333: ldc2_w 644749816
    //   8336: l2i
    //   8337: ldc_w 779205915
    //   8340: ixor
    //   8341: goto -> 8352
    //   8344: ldc2_w -988831819
    //   8347: l2i
    //   8348: ldc_w -1606419058
    //   8351: ixor
    //   8352: ldc2_w 801670378
    //   8355: l2i
    //   8356: ldc_w 472478228
    //   8359: ixor
    //   8360: ixor
    //   8361: lookupswitch default -> 15364, 1006522909 -> 8344, 1456575685 -> 8388
    //   8388: aload_0
    //   8389: getstatic Perryc.c : I
    //   8392: iflt -> 8406
    //   8395: ldc2_w -2106872617
    //   8398: l2i
    //   8399: ldc_w -1259828881
    //   8402: ixor
    //   8403: goto -> 8414
    //   8406: ldc2_w -1333441800
    //   8409: l2i
    //   8410: ldc_w 177385460
    //   8413: ixor
    //   8414: ldc2_w 613874314
    //   8417: l2i
    //   8418: ldc_w 1333215271
    //   8421: ixor
    //   8422: ixor
    //   8423: lookupswitch default -> 15172, -772382815 -> 8448, 1566744341 -> 8406
    //   8448: aload_0
    //   8449: new bigname/zprestige/webhack/features/setting/Setting
    //   8452: dup
    //   8453: ldc_w '௵㌜஻㶾뜭'
    //   8456: getstatic Perryc.1 : I
    //   8459: ifeq -> 8473
    //   8462: ldc2_w 2010925470
    //   8465: l2i
    //   8466: ldc_w 1819736540
    //   8469: ixor
    //   8470: goto -> 8481
    //   8473: ldc2_w 1007671692
    //   8476: l2i
    //   8477: ldc_w 490518655
    //   8480: ixor
    //   8481: ldc2_w -1148260455
    //   8484: l2i
    //   8485: ldc_w 291479980
    //   8488: ixor
    //   8489: ixor
    //   8490: lookupswitch default -> 8516, -1317273993 -> 15188, -1228780649 -> 8473
    //   8516: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8519: ldc2_w 1340491683
    //   8522: l2i
    //   8523: ldc_w 1340491682
    //   8526: ixor
    //   8527: getstatic Perryc.0 : I
    //   8530: ifle -> 8544
    //   8533: ldc2_w 706085536
    //   8536: l2i
    //   8537: ldc_w -1474714816
    //   8540: ixor
    //   8541: goto -> 8552
    //   8544: ldc2_w -559345724
    //   8547: l2i
    //   8548: ldc_w -1065582515
    //   8551: ixor
    //   8552: ldc2_w 2048701384
    //   8555: l2i
    //   8556: ldc_w 975958190
    //   8559: ixor
    //   8560: ixor
    //   8561: lookupswitch default -> 15532, -1036459386 -> 8544, 1591921903 -> 8588
    //   8588: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   8591: getstatic Perryc.1 : I
    //   8594: ifeq -> 8608
    //   8597: ldc2_w -883037256
    //   8600: l2i
    //   8601: ldc_w 686181011
    //   8604: ixor
    //   8605: goto -> 8616
    //   8608: ldc2_w 1046064096
    //   8611: l2i
    //   8612: ldc_w -291015086
    //   8615: ixor
    //   8616: ldc2_w -717682811
    //   8619: l2i
    //   8620: ldc_w 1472395281
    //   8623: ixor
    //   8624: ixor
    //   8625: lookupswitch default -> 8652, -1920456247 -> 8608, 1631608511 -> 15260
    //   8652: aload_0
    //   8653: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   8658: getstatic Perryc.1 : I
    //   8661: ifeq -> 8675
    //   8664: ldc2_w -15200564
    //   8667: l2i
    //   8668: ldc_w -1732978382
    //   8671: ixor
    //   8672: goto -> 8683
    //   8675: ldc2_w -1871856279
    //   8678: l2i
    //   8679: ldc_w -1776641382
    //   8682: ixor
    //   8683: ldc2_w 1759692947
    //   8686: l2i
    //   8687: ldc_w 1983163072
    //   8690: ixor
    //   8691: ixor
    //   8692: lookupswitch default -> 15190, 413222304 -> 8720, 2038085037 -> 8675
    //   8720: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   8723: getstatic Perryc.0 : I
    //   8726: ifle -> 8740
    //   8729: ldc2_w -2014082074
    //   8732: l2i
    //   8733: ldc_w -1434058832
    //   8736: ixor
    //   8737: goto -> 8748
    //   8740: ldc2_w 1755560179
    //   8743: l2i
    //   8744: ldc_w 335968700
    //   8747: ixor
    //   8748: ldc2_w -1591419352
    //   8751: l2i
    //   8752: ldc_w -323918302
    //   8755: ixor
    //   8756: ixor
    //   8757: lookupswitch default -> 8784, 1625541724 -> 15350, 2121780267 -> 8740
    //   8784: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8787: getstatic Perryc.c : I
    //   8790: iflt -> 8804
    //   8793: ldc2_w -1173444751
    //   8796: l2i
    //   8797: ldc_w 497803790
    //   8800: ixor
    //   8801: goto -> 8812
    //   8804: ldc2_w 1348030770
    //   8807: l2i
    //   8808: ldc_w -1225079507
    //   8811: ixor
    //   8812: ldc2_w -1200554358
    //   8815: l2i
    //   8816: ldc_w 721909601
    //   8819: ixor
    //   8820: ixor
    //   8821: lookupswitch default -> 15318, 886230164 -> 8804, 1976835572 -> 8848
    //   8848: putfield potion : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8851: getstatic Perryc.0 : I
    //   8854: ifle -> 8868
    //   8857: ldc2_w -1001030154
    //   8860: l2i
    //   8861: ldc_w 1336738256
    //   8864: ixor
    //   8865: goto -> 8876
    //   8868: ldc2_w 316207560
    //   8871: l2i
    //   8872: ldc_w -859095062
    //   8875: ixor
    //   8876: ldc2_w -393130043
    //   8879: l2i
    //   8880: ldc_w -1877453984
    //   8883: ixor
    //   8884: ixor
    //   8885: lookupswitch default -> 8912, -923001839 -> 8868, -210673533 -> 15520
    //   8912: aload_0
    //   8913: getstatic Perryc.0 : I
    //   8916: ifle -> 8930
    //   8919: ldc2_w -1723087998
    //   8922: l2i
    //   8923: ldc_w -106082633
    //   8926: ixor
    //   8927: goto -> 8938
    //   8930: ldc2_w -1671863030
    //   8933: l2i
    //   8934: ldc_w -775551884
    //   8937: ixor
    //   8938: ldc2_w -299151675
    //   8941: l2i
    //   8942: ldc_w -1131562403
    //   8945: ixor
    //   8946: ixor
    //   8947: lookupswitch default -> 15456, 523867622 -> 8972, 843086253 -> 8930
    //   8972: aload_0
    //   8973: new bigname/zprestige/webhack/features/setting/Setting
    //   8976: dup
    //   8977: ldc_w '௲㌒஦㶣'
    //   8980: getstatic Perryc.1 : I
    //   8983: ifeq -> 8997
    //   8986: ldc2_w -565166080
    //   8989: l2i
    //   8990: ldc_w -1230669744
    //   8993: ixor
    //   8994: goto -> 9005
    //   8997: ldc2_w -1916263936
    //   9000: l2i
    //   9001: ldc_w -195164682
    //   9004: ixor
    //   9005: ldc2_w -1273981885
    //   9008: l2i
    //   9009: ldc_w 2081896793
    //   9012: ixor
    //   9013: ixor
    //   9014: lookupswitch default -> 9040, -1594714806 -> 15528, 498841569 -> 8997
    //   9040: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9043: ldc2_w 1242763339
    //   9046: l2i
    //   9047: ldc_w 1242763338
    //   9050: ixor
    //   9051: getstatic Perryc.0 : I
    //   9054: ifle -> 9068
    //   9057: ldc2_w 1244057602
    //   9060: l2i
    //   9061: ldc_w -484241071
    //   9064: ixor
    //   9065: goto -> 9076
    //   9068: ldc2_w 283349737
    //   9071: l2i
    //   9072: ldc_w 853918127
    //   9075: ixor
    //   9076: ldc2_w -123798051
    //   9079: l2i
    //   9080: ldc_w -1853135896
    //   9083: ixor
    //   9084: ixor
    //   9085: lookupswitch default -> 9112, -1095332381 -> 9068, -1072668826 -> 15338
    //   9112: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   9115: getstatic Perryc.c : I
    //   9118: iflt -> 9132
    //   9121: ldc2_w 733545153
    //   9124: l2i
    //   9125: ldc_w -659395531
    //   9128: ixor
    //   9129: goto -> 9140
    //   9132: ldc2_w 334783562
    //   9135: l2i
    //   9136: ldc_w -687542184
    //   9139: ixor
    //   9140: ldc2_w 1365748883
    //   9143: l2i
    //   9144: ldc_w 1891209804
    //   9147: ixor
    //   9148: ixor
    //   9149: lookupswitch default -> 9176, -1564451246 -> 9132, -757772245 -> 15254
    //   9176: aload_0
    //   9177: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   9182: getstatic Perryc.c : I
    //   9185: iflt -> 9199
    //   9188: ldc2_w 274553504
    //   9191: l2i
    //   9192: ldc_w -550334717
    //   9195: ixor
    //   9196: goto -> 9207
    //   9199: ldc2_w 2039625426
    //   9202: l2i
    //   9203: ldc_w -1311755498
    //   9206: ixor
    //   9207: ldc2_w -478788020
    //   9210: l2i
    //   9211: ldc_w 670273061
    //   9214: ixor
    //   9215: ixor
    //   9216: lookupswitch default -> 9244, 199892426 -> 15148, 1435390724 -> 9199
    //   9244: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   9247: getstatic Perryc.c : I
    //   9250: iflt -> 9264
    //   9253: ldc2_w -865333978
    //   9256: l2i
    //   9257: ldc_w 2052146436
    //   9260: ixor
    //   9261: goto -> 9272
    //   9264: ldc2_w -851251621
    //   9267: l2i
    //   9268: ldc_w 609471123
    //   9271: ixor
    //   9272: ldc2_w -497236530
    //   9275: l2i
    //   9276: ldc_w 1598459780
    //   9279: ixor
    //   9280: ixor
    //   9281: lookupswitch default -> 9308, 187105896 -> 15220, 1240663989 -> 9264
    //   9308: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9311: getstatic Perryc.1 : I
    //   9314: ifeq -> 9328
    //   9317: ldc2_w 1862600061
    //   9320: l2i
    //   9321: ldc_w -1664815752
    //   9324: ixor
    //   9325: goto -> 9336
    //   9328: ldc2_w -1629714429
    //   9331: l2i
    //   9332: ldc_w -339764094
    //   9335: ixor
    //   9336: ldc2_w -1724403217
    //   9339: l2i
    //   9340: ldc_w -820064374
    //   9343: ixor
    //   9344: ixor
    //   9345: lookupswitch default -> 9372, -1511483808 -> 15298, 932799381 -> 9328
    //   9372: putfield wait : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9375: getstatic Perryc.0 : I
    //   9378: ifle -> 9392
    //   9381: ldc2_w -1521542171
    //   9384: l2i
    //   9385: ldc_w -236924576
    //   9388: ixor
    //   9389: goto -> 9400
    //   9392: ldc2_w -587946900
    //   9395: l2i
    //   9396: ldc_w -1400319668
    //   9399: ixor
    //   9400: ldc2_w -2055489584
    //   9403: l2i
    //   9404: ldc_w 1031994955
    //   9407: ixor
    //   9408: ixor
    //   9409: lookupswitch default -> 9436, -329874658 -> 15314, 139648629 -> 9392
    //   9436: aload_0
    //   9437: getstatic Perryc.1 : I
    //   9440: ifeq -> 9454
    //   9443: ldc2_w 1701718235
    //   9446: l2i
    //   9447: ldc_w 1841014128
    //   9450: ixor
    //   9451: goto -> 9462
    //   9454: ldc2_w -590653944
    //   9457: l2i
    //   9458: ldc_w -1682492302
    //   9461: ixor
    //   9462: ldc2_w -259888021
    //   9465: l2i
    //   9466: ldc_w -1034944120
    //   9469: ixor
    //   9470: ixor
    //   9471: lookupswitch default -> 15214, 973594696 -> 9454, 1974341529 -> 9496
    //   9496: aload_0
    //   9497: new bigname/zprestige/webhack/features/setting/Setting
    //   9500: dup
    //   9501: ldc_w '௭㌜ி㶀뜣๭'
    //   9504: getstatic Perryc.0 : I
    //   9507: ifle -> 9521
    //   9510: ldc2_w -1600955079
    //   9513: l2i
    //   9514: ldc_w -181433480
    //   9517: ixor
    //   9518: goto -> 9529
    //   9521: ldc2_w 951830758
    //   9524: l2i
    //   9525: ldc_w 506723863
    //   9528: ixor
    //   9529: ldc2_w -1566080729
    //   9532: l2i
    //   9533: ldc_w 389490019
    //   9536: ixor
    //   9537: ixor
    //   9538: lookupswitch default -> 15124, -1827106123 -> 9564, -533958139 -> 9521
    //   9564: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9567: ldc2_w 279154649
    //   9570: l2i
    //   9571: ldc_w 279154648
    //   9574: ixor
    //   9575: getstatic Perryc.1 : I
    //   9578: ifeq -> 9592
    //   9581: ldc2_w 391895726
    //   9584: l2i
    //   9585: ldc_w 229339609
    //   9588: ixor
    //   9589: goto -> 9600
    //   9592: ldc2_w -2082178541
    //   9595: l2i
    //   9596: ldc_w -490349033
    //   9599: ixor
    //   9600: ldc2_w -14328626
    //   9603: l2i
    //   9604: ldc_w 1379380593
    //   9607: ixor
    //   9608: ixor
    //   9609: lookupswitch default -> 15152, -1209902392 -> 9592, -869050949 -> 9636
    //   9636: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   9639: getstatic Perryc.0 : I
    //   9642: ifle -> 9656
    //   9645: ldc2_w -823158040
    //   9648: l2i
    //   9649: ldc_w -138088011
    //   9652: ixor
    //   9653: goto -> 9664
    //   9656: ldc2_w 52603542
    //   9659: l2i
    //   9660: ldc_w -538862113
    //   9663: ixor
    //   9664: ldc2_w -104663118
    //   9667: l2i
    //   9668: ldc_w -1498739787
    //   9671: ixor
    //   9672: ixor
    //   9673: lookupswitch default -> 15272, -2085958834 -> 9700, 1715640154 -> 9656
    //   9700: aload_0
    //   9701: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   9706: getstatic Perryc.1 : I
    //   9709: ifeq -> 9723
    //   9712: ldc2_w -1551699458
    //   9715: l2i
    //   9716: ldc_w -1584635446
    //   9719: ixor
    //   9720: goto -> 9731
    //   9723: ldc2_w 165902670
    //   9726: l2i
    //   9727: ldc_w -1419533014
    //   9730: ixor
    //   9731: ldc2_w -1007262599
    //   9734: l2i
    //   9735: ldc_w -464426579
    //   9738: ixor
    //   9739: ixor
    //   9740: lookupswitch default -> 15570, -2060987984 -> 9768, 631872992 -> 9723
    //   9768: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   9771: getstatic Perryc.c : I
    //   9774: iflt -> 9788
    //   9777: ldc2_w -1188064283
    //   9780: l2i
    //   9781: ldc_w 2019059743
    //   9784: ixor
    //   9785: goto -> 9796
    //   9788: ldc2_w 2043019482
    //   9791: l2i
    //   9792: ldc_w 896267347
    //   9795: ixor
    //   9796: ldc2_w -728373992
    //   9799: l2i
    //   9800: ldc_w 1144463077
    //   9803: ixor
    //   9804: ixor
    //   9805: lookupswitch default -> 9832, -494403932 -> 9788, 1372913671 -> 15278
    //   9832: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9835: getstatic Perryc.c : I
    //   9838: iflt -> 9852
    //   9841: ldc2_w 87998082
    //   9844: l2i
    //   9845: ldc_w -141883899
    //   9848: ixor
    //   9849: goto -> 9860
    //   9852: ldc2_w -19073168
    //   9855: l2i
    //   9856: ldc_w -1934469565
    //   9859: ixor
    //   9860: ldc2_w -1370581842
    //   9863: l2i
    //   9864: ldc_w 270816476
    //   9867: ixor
    //   9868: ixor
    //   9869: lookupswitch default -> 9896, 1289713909 -> 15376, 1843222045 -> 9852
    //   9896: putfield hopWait : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9899: getstatic Perryc.0 : I
    //   9902: ifle -> 9916
    //   9905: ldc2_w 304756021
    //   9908: l2i
    //   9909: ldc_w 735931173
    //   9912: ixor
    //   9913: goto -> 9924
    //   9916: ldc2_w -678186529
    //   9919: l2i
    //   9920: ldc_w -351567663
    //   9923: ixor
    //   9924: ldc2_w -430115854
    //   9927: l2i
    //   9928: ldc_w -424435086
    //   9931: ixor
    //   9932: ixor
    //   9933: lookupswitch default -> 15448, 957878160 -> 9916, 1014456462 -> 9960
    //   9960: aload_0
    //   9961: getstatic Perryc.0 : I
    //   9964: ifle -> 9978
    //   9967: ldc2_w -1002016478
    //   9970: l2i
    //   9971: ldc_w 689291795
    //   9974: ixor
    //   9975: goto -> 9986
    //   9978: ldc2_w -816260363
    //   9981: l2i
    //   9982: ldc_w -95692048
    //   9985: ixor
    //   9986: ldc2_w -72149806
    //   9989: l2i
    //   9990: ldc_w -1111808459
    //   9993: ixor
    //   9994: ixor
    //   9995: lookupswitch default -> 15400, -1420066346 -> 9978, 1931162338 -> 10020
    //   10020: aload_0
    //   10021: new bigname/zprestige/webhack/features/setting/Setting
    //   10024: dup
    //   10025: ldc_w '௶㌇ம㶰뜧'
    //   10028: getstatic Perryc.1 : I
    //   10031: ifeq -> 10045
    //   10034: ldc2_w -53739294
    //   10037: l2i
    //   10038: ldc_w -294996124
    //   10041: ixor
    //   10042: goto -> 10053
    //   10045: ldc2_w -912077125
    //   10048: l2i
    //   10049: ldc_w -207588985
    //   10052: ixor
    //   10053: ldc2_w 541117753
    //   10056: l2i
    //   10057: ldc_w -607066472
    //   10060: ixor
    //   10061: ixor
    //   10062: lookupswitch default -> 10088, -382297049 -> 15246, 1551467226 -> 10045
    //   10088: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10091: ldc2_w -268531526
    //   10094: l2i
    //   10095: ldc_w -268531522
    //   10098: ixor
    //   10099: getstatic Perryc.0 : I
    //   10102: ifle -> 10116
    //   10105: ldc2_w 2126273242
    //   10108: l2i
    //   10109: ldc_w 1822075618
    //   10112: ixor
    //   10113: goto -> 10124
    //   10116: ldc2_w 748310934
    //   10119: l2i
    //   10120: ldc_w 2096115249
    //   10123: ixor
    //   10124: ldc2_w -41641146
    //   10127: l2i
    //   10128: ldc_w -1416416421
    //   10131: ixor
    //   10132: ixor
    //   10133: lookupswitch default -> 10160, -1108758683 -> 10116, 1144084517 -> 15328
    //   10160: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10163: ldc2_w -415616384
    //   10166: l2i
    //   10167: ldc_w -415616384
    //   10170: ixor
    //   10171: getstatic Perryc.0 : I
    //   10174: ifle -> 10188
    //   10177: ldc2_w 1123384420
    //   10180: l2i
    //   10181: ldc_w 1591771379
    //   10184: ixor
    //   10185: goto -> 10196
    //   10188: ldc2_w 1529160455
    //   10191: l2i
    //   10192: ldc_w 56131490
    //   10195: ixor
    //   10196: ldc2_w 166731169
    //   10199: l2i
    //   10200: ldc_w 1729741702
    //   10203: ixor
    //   10204: ixor
    //   10205: lookupswitch default -> 10232, -911548378 -> 10188, 1929126576 -> 15470
    //   10232: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10235: ldc2_w 1251975867
    //   10238: l2i
    //   10239: ldc_w 1251975871
    //   10242: ixor
    //   10243: getstatic Perryc.0 : I
    //   10246: ifle -> 10260
    //   10249: ldc2_w 683244706
    //   10252: l2i
    //   10253: ldc_w -1175305861
    //   10256: ixor
    //   10257: goto -> 10268
    //   10260: ldc2_w -1289849165
    //   10263: l2i
    //   10264: ldc_w 481926284
    //   10267: ixor
    //   10268: ldc2_w 1354676469
    //   10271: l2i
    //   10272: ldc_w 524944557
    //   10275: ixor
    //   10276: ixor
    //   10277: lookupswitch default -> 15280, -557874815 -> 10260, -531409305 -> 10304
    //   10304: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10307: getstatic Perryc.0 : I
    //   10310: ifle -> 10324
    //   10313: ldc2_w -1270187497
    //   10316: l2i
    //   10317: ldc_w 2079486274
    //   10320: ixor
    //   10321: goto -> 10332
    //   10324: ldc2_w 294323243
    //   10327: l2i
    //   10328: ldc_w 716158159
    //   10331: ixor
    //   10332: ldc2_w 672380802
    //   10335: l2i
    //   10336: ldc_w -126807147
    //   10339: ixor
    //   10340: ixor
    //   10341: lookupswitch default -> 10368, 534425410 -> 15492, 771983314 -> 10324
    //   10368: aload_0
    //   10369: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   10374: getstatic Perryc.c : I
    //   10377: iflt -> 10391
    //   10380: ldc2_w 337888496
    //   10383: l2i
    //   10384: ldc_w 525822533
    //   10387: ixor
    //   10388: goto -> 10399
    //   10391: ldc2_w 770981388
    //   10394: l2i
    //   10395: ldc_w 1890876614
    //   10398: ixor
    //   10399: ldc2_w -1500439370
    //   10402: l2i
    //   10403: ldc_w 391089515
    //   10406: ixor
    //   10407: ixor
    //   10408: lookupswitch default -> 15396, -1163247768 -> 10391, -325135593 -> 10436
    //   10436: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   10439: getstatic Perryc.1 : I
    //   10442: ifeq -> 10456
    //   10445: ldc2_w 115688590
    //   10448: l2i
    //   10449: ldc_w 1867887753
    //   10452: ixor
    //   10453: goto -> 10464
    //   10456: ldc2_w -44794748
    //   10459: l2i
    //   10460: ldc_w -1517465502
    //   10463: ixor
    //   10464: ldc2_w 216708177
    //   10467: l2i
    //   10468: ldc_w -768963391
    //   10471: ixor
    //   10472: ixor
    //   10473: lookupswitch default -> 15308, -2045176714 -> 10500, -1217345385 -> 10456
    //   10500: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10503: getstatic Perryc.0 : I
    //   10506: ifle -> 10520
    //   10509: ldc2_w 2019263676
    //   10512: l2i
    //   10513: ldc_w 1036185203
    //   10516: ixor
    //   10517: goto -> 10528
    //   10520: ldc2_w 652527119
    //   10523: l2i
    //   10524: ldc_w -1090540402
    //   10527: ixor
    //   10528: ldc2_w 364194352
    //   10531: l2i
    //   10532: ldc_w 218893574
    //   10535: ixor
    //   10536: ixor
    //   10537: lookupswitch default -> 10564, -126532901 -> 10520, 1562398201 -> 15494
    //   10564: putfield startStage : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10567: getstatic Perryc.c : I
    //   10570: iflt -> 10584
    //   10573: ldc2_w -1681040895
    //   10576: l2i
    //   10577: ldc_w -1121500300
    //   10580: ixor
    //   10581: goto -> 10592
    //   10584: ldc2_w 1549970980
    //   10587: l2i
    //   10588: ldc_w -98624179
    //   10591: ixor
    //   10592: ldc2_w -2134567167
    //   10595: l2i
    //   10596: ldc_w 952923849
    //   10599: ixor
    //   10600: ixor
    //   10601: lookupswitch default -> 15182, -1629259587 -> 10584, 510972577 -> 10628
    //   10628: aload_0
    //   10629: getstatic Perryc.1 : I
    //   10632: ifeq -> 10646
    //   10635: ldc2_w 844544715
    //   10638: l2i
    //   10639: ldc_w 1621855246
    //   10642: ixor
    //   10643: goto -> 10654
    //   10646: ldc2_w -578735403
    //   10649: l2i
    //   10650: ldc_w -891611154
    //   10653: ixor
    //   10654: ldc2_w 850396557
    //   10657: l2i
    //   10658: ldc_w -757471072
    //   10661: ixor
    //   10662: ixor
    //   10663: lookupswitch default -> 10688, -1298867224 -> 15558, 649333231 -> 10646
    //   10688: aload_0
    //   10689: new bigname/zprestige/webhack/features/setting/Setting
    //   10692: dup
    //   10693: ldc_w '௶㌖஻㶇뜭'
    //   10696: getstatic Perryc.c : I
    //   10699: iflt -> 10713
    //   10702: ldc2_w -1161975621
    //   10705: l2i
    //   10706: ldc_w -1991699086
    //   10709: ixor
    //   10710: goto -> 10721
    //   10713: ldc2_w -342129391
    //   10716: l2i
    //   10717: ldc_w 1571476772
    //   10720: ixor
    //   10721: ldc2_w 1658072901
    //   10724: l2i
    //   10725: ldc_w 91252561
    //   10728: ixor
    //   10729: ixor
    //   10730: lookupswitch default -> 15156, -778758111 -> 10756, 1414591965 -> 10713
    //   10756: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10759: ldc2_w -885569800
    //   10762: l2i
    //   10763: ldc_w -885569799
    //   10766: ixor
    //   10767: getstatic Perryc.c : I
    //   10770: iflt -> 10784
    //   10773: ldc2_w -169985437
    //   10776: l2i
    //   10777: ldc_w 1571768664
    //   10780: ixor
    //   10781: goto -> 10792
    //   10784: ldc2_w 855245417
    //   10787: l2i
    //   10788: ldc_w 1461009670
    //   10791: ixor
    //   10792: ldc2_w 104645556
    //   10795: l2i
    //   10796: ldc_w 1538028544
    //   10799: ixor
    //   10800: ixor
    //   10801: lookupswitch default -> 15248, -169753457 -> 10784, 947882203 -> 10828
    //   10828: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   10831: getstatic Perryc.c : I
    //   10834: iflt -> 10848
    //   10837: ldc2_w -689795640
    //   10840: l2i
    //   10841: ldc_w 1830370809
    //   10844: ixor
    //   10845: goto -> 10856
    //   10848: ldc2_w -1452780199
    //   10851: l2i
    //   10852: ldc_w -639497988
    //   10855: ixor
    //   10856: ldc2_w -511243696
    //   10859: l2i
    //   10860: ldc_w 619740314
    //   10863: ixor
    //   10864: ixor
    //   10865: lookupswitch default -> 10892, 1148682169 -> 10848, 2123155195 -> 15424
    //   10892: aload_0
    //   10893: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   10898: getstatic Perryc.0 : I
    //   10901: ifle -> 10915
    //   10904: ldc2_w 735999569
    //   10907: l2i
    //   10908: ldc_w -249173034
    //   10911: ixor
    //   10912: goto -> 10923
    //   10915: ldc2_w -818201007
    //   10918: l2i
    //   10919: ldc_w 2141955153
    //   10922: ixor
    //   10923: ldc2_w 1102395377
    //   10926: l2i
    //   10927: ldc_w 983625469
    //   10930: ixor
    //   10931: ixor
    //   10932: lookupswitch default -> 15560, -1578220405 -> 10915, -880458996 -> 10960
    //   10960: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   10963: getstatic Perryc.1 : I
    //   10966: ifeq -> 10980
    //   10969: ldc2_w -1204440636
    //   10972: l2i
    //   10973: ldc_w 317964182
    //   10976: ixor
    //   10977: goto -> 10988
    //   10980: ldc2_w 288530669
    //   10983: l2i
    //   10984: ldc_w -1860550072
    //   10987: ixor
    //   10988: ldc2_w -1860702667
    //   10991: l2i
    //   10992: ldc_w -985961916
    //   10995: ixor
    //   10996: ixor
    //   10997: lookupswitch default -> 11024, -18183645 -> 15384, 846244237 -> 10980
    //   11024: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   11027: getstatic Perryc.1 : I
    //   11030: ifeq -> 11044
    //   11033: ldc2_w -1890690827
    //   11036: l2i
    //   11037: ldc_w 963301972
    //   11040: ixor
    //   11041: goto -> 11052
    //   11044: ldc2_w 1349275232
    //   11047: l2i
    //   11048: ldc_w -1519341466
    //   11051: ixor
    //   11052: ldc2_w -421619020
    //   11055: l2i
    //   11056: ldc_w 344499296
    //   11059: ixor
    //   11060: ixor
    //   11061: lookupswitch default -> 11088, -1587625448 -> 11044, 1148367989 -> 15510
    //   11088: putfield setPos : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11091: getstatic Perryc.0 : I
    //   11094: ifle -> 11108
    //   11097: ldc2_w -1809078888
    //   11100: l2i
    //   11101: ldc_w 450931686
    //   11104: ixor
    //   11105: goto -> 11116
    //   11108: ldc2_w 31992013
    //   11111: l2i
    //   11112: ldc_w -1578009669
    //   11115: ixor
    //   11116: ldc2_w 1013854735
    //   11119: l2i
    //   11120: ldc_w -874173621
    //   11123: ixor
    //   11124: ixor
    //   11125: lookupswitch default -> 11152, -240462816 -> 11108, 2034243386 -> 15572
    //   11152: aload_0
    //   11153: getstatic Perryc.0 : I
    //   11156: ifle -> 11170
    //   11159: ldc2_w 1789262735
    //   11162: l2i
    //   11163: ldc_w 1639823376
    //   11166: ixor
    //   11167: goto -> 11178
    //   11170: ldc2_w -1992572295
    //   11173: l2i
    //   11174: ldc_w -1522570532
    //   11177: ixor
    //   11178: ldc2_w 1705038056
    //   11181: l2i
    //   11182: ldc_w 610218187
    //   11185: ixor
    //   11186: ixor
    //   11187: lookupswitch default -> 11212, 1256694716 -> 15192, 1687181914 -> 11170
    //   11212: aload_0
    //   11213: new bigname/zprestige/webhack/features/setting/Setting
    //   11216: dup
    //   11217: ldc_w '௶㌖஻㶙뜷๵'
    //   11220: getstatic Perryc.0 : I
    //   11223: ifle -> 11237
    //   11226: ldc2_w -490838193
    //   11229: l2i
    //   11230: ldc_w 185281322
    //   11233: ixor
    //   11234: goto -> 11245
    //   11237: ldc2_w -308201189
    //   11240: l2i
    //   11241: ldc_w 628142812
    //   11244: ixor
    //   11245: ldc2_w 1268423694
    //   11248: l2i
    //   11249: ldc_w -1118946588
    //   11252: ixor
    //   11253: ixor
    //   11254: lookupswitch default -> 15496, 526510735 -> 11237, 1040526637 -> 11280
    //   11280: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   11283: ldc2_w -3779376
    //   11286: l2i
    //   11287: ldc_w -3779375
    //   11290: ixor
    //   11291: getstatic Perryc.0 : I
    //   11294: ifle -> 11308
    //   11297: ldc2_w 1675339002
    //   11300: l2i
    //   11301: ldc_w 1195115530
    //   11304: ixor
    //   11305: goto -> 11316
    //   11308: ldc2_w -1172083139
    //   11311: l2i
    //   11312: ldc_w -1609248620
    //   11315: ixor
    //   11316: ldc2_w -1281226116
    //   11319: l2i
    //   11320: ldc_w 1340650717
    //   11323: ixor
    //   11324: ixor
    //   11325: lookupswitch default -> 15556, -659743151 -> 11308, -428015608 -> 11352
    //   11352: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   11355: getstatic Perryc.1 : I
    //   11358: ifeq -> 11372
    //   11361: ldc2_w -777971649
    //   11364: l2i
    //   11365: ldc_w 529190931
    //   11368: ixor
    //   11369: goto -> 11380
    //   11372: ldc2_w 1140018764
    //   11375: l2i
    //   11376: ldc_w 69025822
    //   11379: ixor
    //   11380: ldc2_w -290605251
    //   11383: l2i
    //   11384: ldc_w -1551742997
    //   11387: ixor
    //   11388: ixor
    //   11389: lookupswitch default -> 11416, -2096875270 -> 15324, 578547513 -> 11372
    //   11416: aload_0
    //   11417: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   11422: getstatic Perryc.0 : I
    //   11425: ifle -> 11439
    //   11428: ldc2_w -557276484
    //   11431: l2i
    //   11432: ldc_w -537969907
    //   11435: ixor
    //   11436: goto -> 11447
    //   11439: ldc2_w 295472826
    //   11442: l2i
    //   11443: ldc_w -1699546380
    //   11446: ixor
    //   11447: ldc2_w -1139086021
    //   11450: l2i
    //   11451: ldc_w -1124419187
    //   11454: ixor
    //   11455: ixor
    //   11456: lookupswitch default -> 15462, -1949425416 -> 11484, 29871367 -> 11439
    //   11484: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   11487: getstatic Perryc.c : I
    //   11490: iflt -> 11504
    //   11493: ldc2_w -599738333
    //   11496: l2i
    //   11497: ldc_w -474494576
    //   11500: ixor
    //   11501: goto -> 11512
    //   11504: ldc2_w 2123238578
    //   11507: l2i
    //   11508: ldc_w -1519514986
    //   11511: ixor
    //   11512: ldc2_w 18864899
    //   11515: l2i
    //   11516: ldc_w -307743961
    //   11519: ixor
    //   11520: ixor
    //   11521: lookupswitch default -> 15340, -750741097 -> 11504, 928509440 -> 11548
    //   11548: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   11551: getstatic Perryc.c : I
    //   11554: iflt -> 11568
    //   11557: ldc2_w -1387070235
    //   11560: l2i
    //   11561: ldc_w 621243319
    //   11564: ixor
    //   11565: goto -> 11576
    //   11568: ldc2_w -159936154
    //   11571: l2i
    //   11572: ldc_w 800326704
    //   11575: ixor
    //   11576: ldc2_w -2094399497
    //   11579: l2i
    //   11580: ldc_w 8553628
    //   11583: ixor
    //   11584: ixor
    //   11585: lookupswitch default -> 15394, 201255993 -> 11568, 1516826173 -> 11612
    //   11612: putfield setNull : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11615: getstatic Perryc.0 : I
    //   11618: ifle -> 11632
    //   11621: ldc2_w 1321600920
    //   11624: l2i
    //   11625: ldc_w 1456155942
    //   11628: ixor
    //   11629: goto -> 11640
    //   11632: ldc2_w -985264621
    //   11635: l2i
    //   11636: ldc_w -1998394963
    //   11639: ixor
    //   11640: ldc2_w 652800082
    //   11643: l2i
    //   11644: ldc_w -1201892890
    //   11647: ixor
    //   11648: ixor
    //   11649: lookupswitch default -> 11676, -2034676982 -> 15372, 832208516 -> 11632
    //   11676: aload_0
    //   11677: getstatic Perryc.0 : I
    //   11680: ifle -> 11694
    //   11683: ldc2_w 1877877517
    //   11686: l2i
    //   11687: ldc_w -21734791
    //   11690: ixor
    //   11691: goto -> 11702
    //   11694: ldc2_w 20474876
    //   11697: l2i
    //   11698: ldc_w 1262082553
    //   11701: ixor
    //   11702: ldc2_w 1613485828
    //   11705: l2i
    //   11706: ldc_w -1542673166
    //   11709: ixor
    //   11710: ixor
    //   11711: lookupswitch default -> 15196, -1910060557 -> 11736, 1434256002 -> 11694
    //   11736: aload_0
    //   11737: new bigname/zprestige/webhack/features/setting/Setting
    //   11740: dup
    //   11741: ldc_w '௢㌁஠㶢뜬๕癡蹮댊'
    //   11744: getstatic Perryc.0 : I
    //   11747: ifle -> 11761
    //   11750: ldc2_w -97748
    //   11753: l2i
    //   11754: ldc_w -1597020545
    //   11757: ixor
    //   11758: goto -> 11769
    //   11761: ldc2_w -414333958
    //   11764: l2i
    //   11765: ldc_w 1110211891
    //   11768: ixor
    //   11769: ldc2_w -79046050
    //   11772: l2i
    //   11773: ldc_w -1446485084
    //   11776: ixor
    //   11777: ixor
    //   11778: lookupswitch default -> 11804, -534156936 -> 11761, 229662121 -> 15488
    //   11804: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   11807: ldc2_w 1674332681
    //   11810: l2i
    //   11811: ldc_w 1674332641
    //   11814: ixor
    //   11815: getstatic Perryc.1 : I
    //   11818: ifeq -> 11832
    //   11821: ldc2_w 2016101911
    //   11824: l2i
    //   11825: ldc_w -2072218635
    //   11828: ixor
    //   11829: goto -> 11840
    //   11832: ldc2_w -577500122
    //   11835: l2i
    //   11836: ldc_w 565228234
    //   11839: ixor
    //   11840: ldc2_w -882454683
    //   11843: l2i
    //   11844: ldc_w -1604817990
    //   11847: ixor
    //   11848: ixor
    //   11849: lookupswitch default -> 11876, -1754689219 -> 15150, 1562521496 -> 11832
    //   11876: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11879: ldc2_w -1162233653
    //   11882: l2i
    //   11883: ldc_w -1162233653
    //   11886: ixor
    //   11887: getstatic Perryc.1 : I
    //   11890: ifeq -> 11904
    //   11893: ldc2_w -1704558069
    //   11896: l2i
    //   11897: ldc_w -104242417
    //   11900: ixor
    //   11901: goto -> 11912
    //   11904: ldc2_w -412514811
    //   11907: l2i
    //   11908: ldc_w -2038526768
    //   11911: ixor
    //   11912: ldc2_w -321269826
    //   11915: l2i
    //   11916: ldc_w -1714571305
    //   11919: ixor
    //   11920: ixor
    //   11921: lookupswitch default -> 11948, -1203726952 -> 11904, 381393261 -> 15242
    //   11948: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11951: ldc2_w -1161104094
    //   11954: l2i
    //   11955: ldc_w -1161103670
    //   11958: ixor
    //   11959: getstatic Perryc.1 : I
    //   11962: ifeq -> 11976
    //   11965: ldc2_w -17523322
    //   11968: l2i
    //   11969: ldc_w 1501681510
    //   11972: ixor
    //   11973: goto -> 11984
    //   11976: ldc2_w 1854749263
    //   11979: l2i
    //   11980: ldc_w -1726493784
    //   11983: ixor
    //   11984: ldc2_w 254028547
    //   11987: l2i
    //   11988: ldc_w 150827473
    //   11991: ixor
    //   11992: ixor
    //   11993: lookupswitch default -> 12020, -1599336398 -> 15486, 1891584125 -> 11976
    //   12020: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12023: getstatic Perryc.c : I
    //   12026: iflt -> 12040
    //   12029: ldc2_w 1456446999
    //   12032: l2i
    //   12033: ldc_w -1509291139
    //   12036: ixor
    //   12037: goto -> 12048
    //   12040: ldc2_w -1047715298
    //   12043: l2i
    //   12044: ldc_w 331482993
    //   12047: ixor
    //   12048: ldc2_w -1640416469
    //   12051: l2i
    //   12052: ldc_w 447367734
    //   12055: ixor
    //   12056: ixor
    //   12057: lookupswitch default -> 12084, -1412474323 -> 12040, 1951851639 -> 15132
    //   12084: aload_0
    //   12085: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   12090: getstatic Perryc.c : I
    //   12093: iflt -> 12107
    //   12096: ldc2_w 805809429
    //   12099: l2i
    //   12100: ldc_w -1380950802
    //   12103: ixor
    //   12104: goto -> 12115
    //   12107: ldc2_w -977838614
    //   12110: l2i
    //   12111: ldc_w 861359843
    //   12114: ixor
    //   12115: ldc2_w -666294841
    //   12118: l2i
    //   12119: ldc_w 23079737
    //   12122: ixor
    //   12123: ixor
    //   12124: lookupswitch default -> 15356, 801709559 -> 12152, 1151270661 -> 12107
    //   12152: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   12155: getstatic Perryc.1 : I
    //   12158: ifeq -> 12172
    //   12161: ldc2_w 976904727
    //   12164: l2i
    //   12165: ldc_w 779110649
    //   12168: ixor
    //   12169: goto -> 12180
    //   12172: ldc2_w 1081069954
    //   12175: l2i
    //   12176: ldc_w -1890873548
    //   12179: ixor
    //   12180: ldc2_w -183609643
    //   12183: l2i
    //   12184: ldc_w 297549267
    //   12187: ixor
    //   12188: ixor
    //   12189: lookupswitch default -> 12216, -252165656 -> 15374, 436356777 -> 12172
    //   12216: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   12219: getstatic Perryc.1 : I
    //   12222: ifeq -> 12236
    //   12225: ldc2_w -92956319
    //   12228: l2i
    //   12229: ldc_w -399801774
    //   12232: ixor
    //   12233: goto -> 12244
    //   12236: ldc2_w -2104739833
    //   12239: l2i
    //   12240: ldc_w -627293270
    //   12243: ixor
    //   12244: ldc2_w -576707663
    //   12247: l2i
    //   12248: ldc_w 1817139770
    //   12251: ixor
    //   12252: ixor
    //   12253: lookupswitch default -> 12280, -1548655944 -> 15386, -1332448925 -> 12236
    //   12280: putfield setGroundLimit : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12283: getstatic Perryc.c : I
    //   12286: iflt -> 12300
    //   12289: ldc2_w -398202422
    //   12292: l2i
    //   12293: ldc_w 736249315
    //   12296: ixor
    //   12297: goto -> 12308
    //   12300: ldc2_w -2061184679
    //   12303: l2i
    //   12304: ldc_w 707475842
    //   12307: ixor
    //   12308: ldc2_w 1689979205
    //   12311: l2i
    //   12312: ldc_w 129565986
    //   12315: ixor
    //   12316: ixor
    //   12317: lookupswitch default -> 12344, -1657428333 -> 12300, -1599889330 -> 15512
    //   12344: aload_0
    //   12345: getstatic Perryc.c : I
    //   12348: iflt -> 12362
    //   12351: ldc2_w 554971807
    //   12354: l2i
    //   12355: ldc_w 1963208938
    //   12358: ixor
    //   12359: goto -> 12370
    //   12362: ldc2_w 955099308
    //   12365: l2i
    //   12366: ldc_w -22200028
    //   12369: ixor
    //   12370: ldc2_w -264264476
    //   12373: l2i
    //   12374: ldc_w 115717946
    //   12377: ixor
    //   12378: ixor
    //   12379: lookupswitch default -> 12404, -1563815509 -> 15490, 1900908211 -> 12362
    //   12404: aload_0
    //   12405: new bigname/zprestige/webhack/features/setting/Setting
    //   12408: dup
    //   12409: ldc_w '௢㌁஠㶢뜬๟癩蹠댑ਵ'
    //   12412: getstatic Perryc.c : I
    //   12415: iflt -> 12429
    //   12418: ldc2_w 163278324
    //   12421: l2i
    //   12422: ldc_w 1007530467
    //   12425: ixor
    //   12426: goto -> 12437
    //   12429: ldc2_w 213165333
    //   12432: l2i
    //   12433: ldc_w 2107575015
    //   12436: ixor
    //   12437: ldc2_w 600308000
    //   12440: l2i
    //   12441: ldc_w -2024007529
    //   12444: ixor
    //   12445: ixor
    //   12446: lookupswitch default -> 12472, -1859306080 -> 15382, 104925620 -> 12429
    //   12472: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   12475: ldc2_w 1931023942
    //   12478: l2i
    //   12479: ldc_w 1931023988
    //   12482: ixor
    //   12483: getstatic Perryc.1 : I
    //   12486: ifeq -> 12500
    //   12489: ldc2_w -1638073398
    //   12492: l2i
    //   12493: ldc_w -829252835
    //   12496: ixor
    //   12497: goto -> 12508
    //   12500: ldc2_w 1670465481
    //   12503: l2i
    //   12504: ldc_w 772673667
    //   12507: ixor
    //   12508: ldc2_w -1269304225
    //   12511: l2i
    //   12512: ldc_w 4311831
    //   12515: ixor
    //   12516: ixor
    //   12517: lookupswitch default -> 15430, -455581793 -> 12500, -108435454 -> 12544
    //   12544: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12547: ldc2_w 1007690743
    //   12550: l2i
    //   12551: ldc_w 1007690743
    //   12554: ixor
    //   12555: getstatic Perryc.1 : I
    //   12558: ifeq -> 12572
    //   12561: ldc2_w -1270442663
    //   12564: l2i
    //   12565: ldc_w -628952141
    //   12568: ixor
    //   12569: goto -> 12580
    //   12572: ldc2_w 918524851
    //   12575: l2i
    //   12576: ldc_w 983409649
    //   12579: ixor
    //   12580: ldc2_w -1336385604
    //   12583: l2i
    //   12584: ldc_w 542066959
    //   12587: ixor
    //   12588: ixor
    //   12589: lookupswitch default -> 12616, -19697575 -> 15498, 1793437853 -> 12572
    //   12616: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12619: ldc2_w -1688729945
    //   12622: l2i
    //   12623: ldc_w -1688729963
    //   12626: ixor
    //   12627: getstatic Perryc.c : I
    //   12630: iflt -> 12644
    //   12633: ldc2_w -387234389
    //   12636: l2i
    //   12637: ldc_w -379705171
    //   12640: ixor
    //   12641: goto -> 12652
    //   12644: ldc2_w 1943092387
    //   12647: l2i
    //   12648: ldc_w -1179306361
    //   12651: ixor
    //   12652: ldc2_w -212555707
    //   12655: l2i
    //   12656: ldc_w 1385493308
    //   12659: ixor
    //   12660: ixor
    //   12661: lookupswitch default -> 15504, -1602931073 -> 12644, 1805930845 -> 12688
    //   12688: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12691: getstatic Perryc.0 : I
    //   12694: ifle -> 12708
    //   12697: ldc2_w -764562590
    //   12700: l2i
    //   12701: ldc_w -632534637
    //   12704: ixor
    //   12705: goto -> 12716
    //   12708: ldc2_w -619988930
    //   12711: l2i
    //   12712: ldc_w -229941525
    //   12715: ixor
    //   12716: ldc2_w 1832378770
    //   12719: l2i
    //   12720: ldc_w -491671313
    //   12723: ixor
    //   12724: ixor
    //   12725: lookupswitch default -> 12752, -2019054708 -> 15126, -1439606178 -> 12708
    //   12752: aload_0
    //   12753: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   12758: getstatic Perryc.c : I
    //   12761: iflt -> 12775
    //   12764: ldc2_w 1708015982
    //   12767: l2i
    //   12768: ldc_w -1544064779
    //   12771: ixor
    //   12772: goto -> 12783
    //   12775: ldc2_w -625184928
    //   12778: l2i
    //   12779: ldc_w -43134073
    //   12782: ixor
    //   12783: ldc2_w 67118681
    //   12786: l2i
    //   12787: ldc_w 653206626
    //   12790: ixor
    //   12791: ixor
    //   12792: lookupswitch default -> 12820, -1862301808 -> 12775, -455724128 -> 15140
    //   12820: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   12823: getstatic Perryc.1 : I
    //   12826: ifeq -> 12840
    //   12829: ldc2_w -1058989745
    //   12832: l2i
    //   12833: ldc_w 2116946888
    //   12836: ixor
    //   12837: goto -> 12848
    //   12840: ldc2_w 297074364
    //   12843: l2i
    //   12844: ldc_w 1334855892
    //   12847: ixor
    //   12848: ldc2_w -2116592204
    //   12851: l2i
    //   12852: ldc_w 951877062
    //   12855: ixor
    //   12856: ixor
    //   12857: lookupswitch default -> 15402, -414214630 -> 12884, 128201461 -> 12840
    //   12884: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   12887: getstatic Perryc.0 : I
    //   12890: ifle -> 12904
    //   12893: ldc2_w 151467088
    //   12896: l2i
    //   12897: ldc_w 1618290013
    //   12900: ixor
    //   12901: goto -> 12912
    //   12904: ldc2_w 1043734005
    //   12907: l2i
    //   12908: ldc_w -739979278
    //   12911: ixor
    //   12912: ldc2_w -309892746
    //   12915: l2i
    //   12916: ldc_w -175717755
    //   12919: ixor
    //   12920: ixor
    //   12921: lookupswitch default -> 15238, -170690060 -> 12948, 1903409918 -> 12904
    //   12948: putfield groundFactor : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12951: getstatic Perryc.c : I
    //   12954: iflt -> 12968
    //   12957: ldc2_w 1389705214
    //   12960: l2i
    //   12961: ldc_w -149824704
    //   12964: ixor
    //   12965: goto -> 12976
    //   12968: ldc2_w 40491644
    //   12971: l2i
    //   12972: ldc_w 1631766489
    //   12975: ixor
    //   12976: ldc2_w -1968827051
    //   12979: l2i
    //   12980: ldc_w -2033016738
    //   12983: ixor
    //   12984: ixor
    //   12985: lookupswitch default -> 15540, -1448060491 -> 12968, 1868540078 -> 13012
    //   13012: aload_0
    //   13013: getstatic Perryc.0 : I
    //   13016: ifle -> 13030
    //   13019: ldc2_w -126438336
    //   13022: l2i
    //   13023: ldc_w -1472955520
    //   13026: ixor
    //   13027: goto -> 13038
    //   13030: ldc2_w -327931948
    //   13033: l2i
    //   13034: ldc_w 920721507
    //   13037: ixor
    //   13038: ldc2_w -333510005
    //   13041: l2i
    //   13042: ldc_w -613648501
    //   13045: ixor
    //   13046: ixor
    //   13047: lookupswitch default -> 15268, -303676745 -> 13072, 1731310272 -> 13030
    //   13072: aload_0
    //   13073: new bigname/zprestige/webhack/features/setting/Setting
    //   13076: dup
    //   13077: ldc_w '௶㌖஻㶄뜶๩'
    //   13080: getstatic Perryc.1 : I
    //   13083: ifeq -> 13097
    //   13086: ldc2_w 785827535
    //   13089: l2i
    //   13090: ldc_w 1289999926
    //   13093: ixor
    //   13094: goto -> 13105
    //   13097: ldc2_w 2057506385
    //   13100: l2i
    //   13101: ldc_w -1013442515
    //   13104: ixor
    //   13105: ldc2_w -1130144556
    //   13108: l2i
    //   13109: ldc_w 819747484
    //   13112: ixor
    //   13113: ixor
    //   13114: lookupswitch default -> 15160, -297134415 -> 13097, 893653044 -> 13140
    //   13140: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   13143: ldc2_w 874710102
    //   13146: l2i
    //   13147: ldc_w 874710102
    //   13150: ixor
    //   13151: getstatic Perryc.0 : I
    //   13154: ifle -> 13168
    //   13157: ldc2_w -1855000594
    //   13160: l2i
    //   13161: ldc_w 584880398
    //   13164: ixor
    //   13165: goto -> 13176
    //   13168: ldc2_w -1261197036
    //   13171: l2i
    //   13172: ldc_w 1967112753
    //   13175: ixor
    //   13176: ldc2_w 986435392
    //   13179: l2i
    //   13180: ldc_w -900807488
    //   13183: ixor
    //   13184: ixor
    //   13185: lookupswitch default -> 15144, 828989605 -> 13212, 1127708000 -> 13168
    //   13212: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13215: ldc2_w 1809222956
    //   13218: l2i
    //   13219: ldc_w 1809222956
    //   13222: ixor
    //   13223: getstatic Perryc.1 : I
    //   13226: ifeq -> 13240
    //   13229: ldc2_w -1011154515
    //   13232: l2i
    //   13233: ldc_w 1847722719
    //   13236: ixor
    //   13237: goto -> 13248
    //   13240: ldc2_w 116283150
    //   13243: l2i
    //   13244: ldc_w -1153978238
    //   13247: ixor
    //   13248: ldc2_w 788704406
    //   13251: l2i
    //   13252: ldc_w -478997627
    //   13255: ixor
    //   13256: ixor
    //   13257: lookupswitch default -> 13284, 1618455273 -> 13240, 1642642529 -> 15536
    //   13284: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13287: ldc2_w -13410892
    //   13290: l2i
    //   13291: ldc_w -13410890
    //   13294: ixor
    //   13295: getstatic Perryc.0 : I
    //   13298: ifle -> 13312
    //   13301: ldc2_w 299983280
    //   13304: l2i
    //   13305: ldc_w -203912770
    //   13308: ixor
    //   13309: goto -> 13320
    //   13312: ldc2_w -1858716619
    //   13315: l2i
    //   13316: ldc_w -677024848
    //   13319: ixor
    //   13320: ldc2_w 1026227114
    //   13323: l2i
    //   13324: ldc_w 363914172
    //   13327: ixor
    //   13328: ixor
    //   13329: lookupswitch default -> 13356, -895225832 -> 15482, 1192613100 -> 13312
    //   13356: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   13359: getstatic Perryc.0 : I
    //   13362: ifle -> 13376
    //   13365: ldc2_w -2094518268
    //   13368: l2i
    //   13369: ldc_w -1078391424
    //   13372: ixor
    //   13373: goto -> 13384
    //   13376: ldc2_w 1544592775
    //   13379: l2i
    //   13380: ldc_w -1645795298
    //   13383: ixor
    //   13384: ldc2_w 1749876100
    //   13387: l2i
    //   13388: ldc_w -773193462
    //   13391: ixor
    //   13392: ixor
    //   13393: lookupswitch default -> 13420, -2059943670 -> 15440, -818766011 -> 13376
    //   13420: aload_0
    //   13421: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   13426: getstatic Perryc.c : I
    //   13429: iflt -> 13443
    //   13432: ldc2_w -1786263831
    //   13435: l2i
    //   13436: ldc_w -440158528
    //   13439: ixor
    //   13440: goto -> 13451
    //   13443: ldc2_w 1956457861
    //   13446: l2i
    //   13447: ldc_w -919474631
    //   13450: ixor
    //   13451: ldc2_w -1765732043
    //   13454: l2i
    //   13455: ldc_w 1741414716
    //   13458: ixor
    //   13459: ixor
    //   13460: lookupswitch default -> 13488, -2125561824 -> 15416, -1674959396 -> 13443
    //   13488: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   13491: getstatic Perryc.c : I
    //   13494: iflt -> 13508
    //   13497: ldc2_w 158327253
    //   13500: l2i
    //   13501: ldc_w 931006084
    //   13504: ixor
    //   13505: goto -> 13516
    //   13508: ldc2_w -175463176
    //   13511: l2i
    //   13512: ldc_w 1609346823
    //   13515: ixor
    //   13516: ldc2_w 1320142486
    //   13519: l2i
    //   13520: ldc_w -1234234981
    //   13523: ixor
    //   13524: ixor
    //   13525: lookupswitch default -> 13552, -959369124 -> 15240, 673912437 -> 13508
    //   13552: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   13555: getstatic Perryc.0 : I
    //   13558: ifle -> 13572
    //   13561: ldc2_w -1436834380
    //   13564: l2i
    //   13565: ldc_w -1908142283
    //   13568: ixor
    //   13569: goto -> 13580
    //   13572: ldc2_w 2031972491
    //   13575: l2i
    //   13576: ldc_w -1186063271
    //   13579: ixor
    //   13580: ldc2_w 689678031
    //   13583: l2i
    //   13584: ldc_w -1757968544
    //   13587: ixor
    //   13588: ixor
    //   13589: lookupswitch default -> 13616, -1707898066 -> 15378, -645705886 -> 13572
    //   13616: putfield step : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13619: getstatic Perryc.c : I
    //   13622: iflt -> 13636
    //   13625: ldc2_w 762296499
    //   13628: l2i
    //   13629: ldc_w -1997234341
    //   13632: ixor
    //   13633: goto -> 13644
    //   13636: ldc2_w 2120291977
    //   13639: l2i
    //   13640: ldc_w 1666023192
    //   13643: ixor
    //   13644: ldc2_w 744664840
    //   13647: l2i
    //   13648: ldc_w 672308706
    //   13651: ixor
    //   13652: ixor
    //   13653: lookupswitch default -> 13680, -1578429182 -> 15380, -174718711 -> 13636
    //   13680: aload_0
    //   13681: getstatic Perryc.c : I
    //   13684: iflt -> 13698
    //   13687: ldc2_w 969062924
    //   13690: l2i
    //   13691: ldc_w -107052301
    //   13694: ixor
    //   13695: goto -> 13706
    //   13698: ldc2_w 890257634
    //   13701: l2i
    //   13702: ldc_w -1706225387
    //   13705: ixor
    //   13706: ldc2_w -913730321
    //   13709: l2i
    //   13710: ldc_w -239466370
    //   13713: ixor
    //   13714: ixor
    //   13715: lookupswitch default -> 15202, -1754346138 -> 13740, -126901138 -> 13698
    //   13740: aload_0
    //   13741: new bigname/zprestige/webhack/features/setting/Setting
    //   13744: dup
    //   13745: ldc_w '௫㌜ஈ㶥뜭๷癬蹏댙'
    //   13748: getstatic Perryc.1 : I
    //   13751: ifeq -> 13765
    //   13754: ldc2_w -1871094560
    //   13757: l2i
    //   13758: ldc_w 1576363977
    //   13761: ixor
    //   13762: goto -> 13773
    //   13765: ldc2_w -1406166794
    //   13768: l2i
    //   13769: ldc_w -2079527905
    //   13772: ixor
    //   13773: ldc2_w 1748050316
    //   13776: l2i
    //   13777: ldc_w 1630717514
    //   13780: ixor
    //   13781: ixor
    //   13782: lookupswitch default -> 13808, -997204753 -> 15508, 737467960 -> 13765
    //   13808: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   13811: ldc2_w -1269210333
    //   13814: l2i
    //   13815: ldc_w -1269210334
    //   13818: ixor
    //   13819: getstatic Perryc.c : I
    //   13822: iflt -> 13836
    //   13825: ldc2_w 277665656
    //   13828: l2i
    //   13829: ldc_w 1126919816
    //   13832: ixor
    //   13833: goto -> 13844
    //   13836: ldc2_w 873677625
    //   13839: l2i
    //   13840: ldc_w -198783939
    //   13843: ixor
    //   13844: ldc2_w 856782759
    //   13847: l2i
    //   13848: ldc_w -682751463
    //   13851: ixor
    //   13852: ixor
    //   13853: lookupswitch default -> 13880, -1208433586 -> 15302, 2007995564 -> 13836
    //   13880: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   13883: getstatic Perryc.1 : I
    //   13886: ifeq -> 13900
    //   13889: ldc2_w -835896590
    //   13892: l2i
    //   13893: ldc_w 800275074
    //   13896: ixor
    //   13897: goto -> 13908
    //   13900: ldc2_w 1501464208
    //   13903: l2i
    //   13904: ldc_w 1112925808
    //   13907: ixor
    //   13908: ldc2_w 2091264945
    //   13911: l2i
    //   13912: ldc_w 729128937
    //   13915: ixor
    //   13916: ixor
    //   13917: lookupswitch default -> 13944, -1236421592 -> 15288, 859351405 -> 13900
    //   13944: aload_0
    //   13945: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Movement/Strafe;)Ljava/util/function/Predicate;
    //   13950: getstatic Perryc.0 : I
    //   13953: ifle -> 13967
    //   13956: ldc2_w -1285649078
    //   13959: l2i
    //   13960: ldc_w 1698483807
    //   13963: ixor
    //   13964: goto -> 13975
    //   13967: ldc2_w 96283856
    //   13970: l2i
    //   13971: ldc_w -993810101
    //   13974: ixor
    //   13975: ldc2_w -1152365228
    //   13978: l2i
    //   13979: ldc_w -983106320
    //   13982: ixor
    //   13983: ixor
    //   13984: lookupswitch default -> 14012, -2126785809 -> 13967, -1470827855 -> 15186
    //   14012: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   14015: getstatic Perryc.1 : I
    //   14018: ifeq -> 14032
    //   14021: ldc2_w -1434954740
    //   14024: l2i
    //   14025: ldc_w 953635782
    //   14028: ixor
    //   14029: goto -> 14040
    //   14032: ldc2_w 1814826503
    //   14035: l2i
    //   14036: ldc_w -430093234
    //   14039: ixor
    //   14040: ldc2_w -1623356141
    //   14043: l2i
    //   14044: ldc_w -1836098011
    //   14047: ixor
    //   14048: ixor
    //   14049: lookupswitch default -> 14076, -1625434884 -> 15222, 1835724087 -> 14032
    //   14076: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   14079: getstatic Perryc.0 : I
    //   14082: ifle -> 14096
    //   14085: ldc2_w 2103629835
    //   14088: l2i
    //   14089: ldc_w -1820513074
    //   14092: ixor
    //   14093: goto -> 14104
    //   14096: ldc2_w 4696410
    //   14099: l2i
    //   14100: ldc_w -1504720163
    //   14103: ixor
    //   14104: ldc2_w -1482190007
    //   14107: l2i
    //   14108: ldc_w -802360693
    //   14111: ixor
    //   14112: ixor
    //   14113: lookupswitch default -> 15244, -1718315769 -> 14096, -779943355 -> 14140
    //   14140: putfield setGroundNoLag : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14143: getstatic Perryc.c : I
    //   14146: iflt -> 14160
    //   14149: ldc2_w 1848874823
    //   14152: l2i
    //   14153: ldc_w -1891064879
    //   14156: ixor
    //   14157: goto -> 14168
    //   14160: ldc2_w -1531451691
    //   14163: l2i
    //   14164: ldc_w -512369630
    //   14167: ixor
    //   14168: ldc2_w 1261874301
    //   14171: l2i
    //   14172: ldc_w 1426464261
    //   14175: ixor
    //   14176: ixor
    //   14177: lookupswitch default -> 14204, -11827474 -> 15206, 2017206186 -> 14160
    //   14204: aload_0
    //   14205: ldc2_w 2039830561
    //   14208: l2i
    //   14209: ldc_w 2039830561
    //   14212: ixor
    //   14213: getstatic Perryc.1 : I
    //   14216: ifeq -> 14230
    //   14219: ldc2_w 714731144
    //   14222: l2i
    //   14223: ldc_w -1904114983
    //   14226: ixor
    //   14227: goto -> 14238
    //   14230: ldc2_w -1812479090
    //   14233: l2i
    //   14234: ldc_w 1934423270
    //   14237: ixor
    //   14238: ldc2_w -259611983
    //   14241: l2i
    //   14242: ldc_w -1505152215
    //   14245: ixor
    //   14246: ixor
    //   14247: lookupswitch default -> 14272, -220725815 -> 15524, 1376322239 -> 14230
    //   14272: putfield hidesetting : Z
    //   14275: getstatic Perryc.0 : I
    //   14278: ifle -> 14292
    //   14281: ldc2_w -652459042
    //   14284: l2i
    //   14285: ldc_w -1930531749
    //   14288: ixor
    //   14289: goto -> 14300
    //   14292: ldc2_w -1840634550
    //   14295: l2i
    //   14296: ldc_w -392637839
    //   14299: ixor
    //   14300: ldc2_w 249030031
    //   14303: l2i
    //   14304: ldc_w 610495191
    //   14307: ixor
    //   14308: ixor
    //   14309: lookupswitch default -> 14336, -863052754 -> 14292, 2135335133 -> 15352
    //   14336: aload_0
    //   14337: ldc2_w 1384843186
    //   14340: l2i
    //   14341: ldc_w 1384843187
    //   14344: ixor
    //   14345: getstatic Perryc.0 : I
    //   14348: ifle -> 14362
    //   14351: ldc2_w 1074967716
    //   14354: l2i
    //   14355: ldc_w -1648987787
    //   14358: ixor
    //   14359: goto -> 14370
    //   14362: ldc2_w 588193346
    //   14365: l2i
    //   14366: ldc_w -1574776150
    //   14369: ixor
    //   14370: ldc2_w -148623466
    //   14373: l2i
    //   14374: ldc_w 119071796
    //   14377: ixor
    //   14378: ixor
    //   14379: lookupswitch default -> 14404, -1493600078 -> 14362, 764939891 -> 15446
    //   14404: putfield stage : I
    //   14407: getstatic Perryc.1 : I
    //   14410: ifeq -> 14424
    //   14413: ldc2_w -12528621
    //   14416: l2i
    //   14417: ldc_w 659414658
    //   14420: ixor
    //   14421: goto -> 14432
    //   14424: ldc2_w -1068840915
    //   14427: l2i
    //   14428: ldc_w 722090814
    //   14431: ixor
    //   14432: ldc2_w 1861900595
    //   14435: l2i
    //   14436: ldc_w 1861881269
    //   14439: ixor
    //   14440: ixor
    //   14441: lookupswitch default -> 14468, -855313203 -> 14424, -670212585 -> 15312
    //   14468: aload_0
    //   14469: ldc2_w 921583008
    //   14472: l2i
    //   14473: ldc_w 921583008
    //   14476: ixor
    //   14477: getstatic Perryc.1 : I
    //   14480: ifeq -> 14494
    //   14483: ldc2_w 953950822
    //   14486: l2i
    //   14487: ldc_w -1710414025
    //   14490: ixor
    //   14491: goto -> 14502
    //   14494: ldc2_w -1633723015
    //   14497: l2i
    //   14498: ldc_w 1634868561
    //   14501: ixor
    //   14502: ldc2_w -173952202
    //   14505: l2i
    //   14506: ldc_w 638120939
    //   14509: ixor
    //   14510: ixor
    //   14511: lookupswitch default -> 15212, 742654197 -> 14536, 1903707532 -> 14494
    //   14536: putfield cooldownHops : I
    //   14539: getstatic Perryc.c : I
    //   14542: iflt -> 14556
    //   14545: ldc2_w 1191955258
    //   14548: l2i
    //   14549: ldc_w -1901945519
    //   14552: ixor
    //   14553: goto -> 14564
    //   14556: ldc2_w -1550139791
    //   14559: l2i
    //   14560: ldc_w 785614614
    //   14563: ixor
    //   14564: ldc2_w 836542411
    //   14567: l2i
    //   14568: ldc_w -340434131
    //   14571: ixor
    //   14572: ixor
    //   14573: lookupswitch default -> 14600, -2073848362 -> 14556, 331393677 -> 15226
    //   14600: aload_0
    //   14601: ldc2_w -60549843
    //   14604: l2i
    //   14605: ldc_w -60549843
    //   14608: ixor
    //   14609: getstatic Perryc.1 : I
    //   14612: ifeq -> 14626
    //   14615: ldc2_w 291503565
    //   14618: l2i
    //   14619: ldc_w -1315394805
    //   14622: ixor
    //   14623: goto -> 14634
    //   14626: ldc2_w 116132636
    //   14629: l2i
    //   14630: ldc_w 2106115837
    //   14633: ixor
    //   14634: ldc2_w -1582789965
    //   14637: l2i
    //   14638: ldc_w -1737102820
    //   14641: ixor
    //   14642: ixor
    //   14643: lookupswitch default -> 15180, -1726335383 -> 14626, 1119464782 -> 14668
    //   14668: putfield waitForGround : Z
    //   14671: getstatic Perryc.c : I
    //   14674: iflt -> 14688
    //   14677: ldc2_w 85966029
    //   14680: l2i
    //   14681: ldc_w 909875307
    //   14684: ixor
    //   14685: goto -> 14696
    //   14688: ldc2_w 925238489
    //   14691: l2i
    //   14692: ldc_w -1443349265
    //   14695: ixor
    //   14696: ldc2_w 761633301
    //   14699: l2i
    //   14700: ldc_w -1521129062
    //   14703: ixor
    //   14704: ixor
    //   14705: lookupswitch default -> 14732, -1156262103 -> 15426, -911192151 -> 14688
    //   14732: aload_0
    //   14733: new bigname/zprestige/webhack/util/Timer
    //   14736: dup
    //   14737: getstatic Perryc.1 : I
    //   14740: ifeq -> 14754
    //   14743: ldc2_w -210302367
    //   14746: l2i
    //   14747: ldc_w -2020233921
    //   14750: ixor
    //   14751: goto -> 14762
    //   14754: ldc2_w -684659894
    //   14757: l2i
    //   14758: ldc_w -195865774
    //   14761: ixor
    //   14762: ldc2_w -1550356302
    //   14765: l2i
    //   14766: ldc_w 575243800
    //   14769: ixor
    //   14770: ixor
    //   14771: lookupswitch default -> 15342, -1564651854 -> 14796, -180596236 -> 14754
    //   14796: invokespecial <init> : ()V
    //   14799: getstatic Perryc.c : I
    //   14802: iflt -> 14816
    //   14805: ldc2_w -782761870
    //   14808: l2i
    //   14809: ldc_w 1275606405
    //   14812: ixor
    //   14813: goto -> 14824
    //   14816: ldc2_w -1729066205
    //   14819: l2i
    //   14820: ldc_w -333002600
    //   14823: ixor
    //   14824: ldc2_w -304393639
    //   14827: l2i
    //   14828: ldc_w -1814889000
    //   14831: ixor
    //   14832: ixor
    //   14833: lookupswitch default -> 14860, -1647351424 -> 14816, -480667018 -> 15166
    //   14860: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   14863: getstatic Perryc.1 : I
    //   14866: ifeq -> 14880
    //   14869: ldc2_w 2144478075
    //   14872: l2i
    //   14873: ldc_w 254740411
    //   14876: ixor
    //   14877: goto -> 14888
    //   14880: ldc2_w -557862285
    //   14883: l2i
    //   14884: ldc_w 1794374581
    //   14887: ixor
    //   14888: ldc2_w 343276738
    //   14891: l2i
    //   14892: ldc_w -2144259030
    //   14895: ixor
    //   14896: ixor
    //   14897: lookupswitch default -> 14924, -457577432 -> 15414, 816733155 -> 14880
    //   14924: aload_0
    //   14925: ldc2_w -1240233096
    //   14928: l2i
    //   14929: ldc_w -1240233096
    //   14932: ixor
    //   14933: getstatic Perryc.1 : I
    //   14936: ifeq -> 14950
    //   14939: ldc2_w 1051105675
    //   14942: l2i
    //   14943: ldc_w -1407304378
    //   14946: ixor
    //   14947: goto -> 14958
    //   14950: ldc2_w 1741761124
    //   14953: l2i
    //   14954: ldc_w 299988586
    //   14957: ixor
    //   14958: ldc2_w 1154672732
    //   14961: l2i
    //   14962: ldc_w -338848983
    //   14965: ixor
    //   14966: ixor
    //   14967: lookupswitch default -> 14992, -1436896761 -> 14950, 1034411960 -> 15388
    //   14992: putfield hops : I
    //   14995: getstatic Perryc.1 : I
    //   14998: ifeq -> 15012
    //   15001: ldc2_w 2098198005
    //   15004: l2i
    //   15005: ldc_w 327607889
    //   15008: ixor
    //   15009: goto -> 15020
    //   15012: ldc2_w 873648074
    //   15015: l2i
    //   15016: ldc_w -1869060132
    //   15019: ixor
    //   15020: ldc2_w 906829882
    //   15023: l2i
    //   15024: ldc_w -2092441369
    //   15027: ixor
    //   15028: ixor
    //   15029: lookupswitch default -> 15056, -607923335 -> 15432, 1096858280 -> 15012
    //   15056: aload_0
    //   15057: getstatic Perryc.0 : I
    //   15060: ifle -> 15074
    //   15063: ldc2_w 1669008954
    //   15066: l2i
    //   15067: ldc_w -1009972801
    //   15070: ixor
    //   15071: goto -> 15082
    //   15074: ldc2_w -946604684
    //   15077: l2i
    //   15078: ldc_w 968682935
    //   15081: ixor
    //   15082: ldc2_w 1807955613
    //   15085: l2i
    //   15086: ldc_w 1660340573
    //   15089: ixor
    //   15090: ixor
    //   15091: lookupswitch default -> 15116, -1450969019 -> 15330, -1138413376 -> 15074
    //   15116: putstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.INSTANCE : Lbigname/zprestige/webhack/features/modules/Movement/Strafe;
    //   15119: return
    //   15120: aconst_null
    //   15121: athrow
    //   15122: aconst_null
    //   15123: athrow
    //   15124: aconst_null
    //   15125: athrow
    //   15126: aconst_null
    //   15127: athrow
    //   15128: aconst_null
    //   15129: athrow
    //   15130: aconst_null
    //   15131: athrow
    //   15132: aconst_null
    //   15133: athrow
    //   15134: aconst_null
    //   15135: athrow
    //   15136: aconst_null
    //   15137: athrow
    //   15138: aconst_null
    //   15139: athrow
    //   15140: aconst_null
    //   15141: athrow
    //   15142: aconst_null
    //   15143: athrow
    //   15144: aconst_null
    //   15145: athrow
    //   15146: aconst_null
    //   15147: athrow
    //   15148: aconst_null
    //   15149: athrow
    //   15150: aconst_null
    //   15151: athrow
    //   15152: aconst_null
    //   15153: athrow
    //   15154: aconst_null
    //   15155: athrow
    //   15156: aconst_null
    //   15157: athrow
    //   15158: aconst_null
    //   15159: athrow
    //   15160: aconst_null
    //   15161: athrow
    //   15162: aconst_null
    //   15163: athrow
    //   15164: aconst_null
    //   15165: athrow
    //   15166: aconst_null
    //   15167: athrow
    //   15168: aconst_null
    //   15169: athrow
    //   15170: aconst_null
    //   15171: athrow
    //   15172: aconst_null
    //   15173: athrow
    //   15174: aconst_null
    //   15175: athrow
    //   15176: aconst_null
    //   15177: athrow
    //   15178: aconst_null
    //   15179: athrow
    //   15180: aconst_null
    //   15181: athrow
    //   15182: aconst_null
    //   15183: athrow
    //   15184: aconst_null
    //   15185: athrow
    //   15186: aconst_null
    //   15187: athrow
    //   15188: aconst_null
    //   15189: athrow
    //   15190: aconst_null
    //   15191: athrow
    //   15192: aconst_null
    //   15193: athrow
    //   15194: aconst_null
    //   15195: athrow
    //   15196: aconst_null
    //   15197: athrow
    //   15198: aconst_null
    //   15199: athrow
    //   15200: aconst_null
    //   15201: athrow
    //   15202: aconst_null
    //   15203: athrow
    //   15204: aconst_null
    //   15205: athrow
    //   15206: aconst_null
    //   15207: athrow
    //   15208: aconst_null
    //   15209: athrow
    //   15210: aconst_null
    //   15211: athrow
    //   15212: aconst_null
    //   15213: athrow
    //   15214: aconst_null
    //   15215: athrow
    //   15216: aconst_null
    //   15217: athrow
    //   15218: aconst_null
    //   15219: athrow
    //   15220: aconst_null
    //   15221: athrow
    //   15222: aconst_null
    //   15223: athrow
    //   15224: aconst_null
    //   15225: athrow
    //   15226: aconst_null
    //   15227: athrow
    //   15228: aconst_null
    //   15229: athrow
    //   15230: aconst_null
    //   15231: athrow
    //   15232: aconst_null
    //   15233: athrow
    //   15234: aconst_null
    //   15235: athrow
    //   15236: aconst_null
    //   15237: athrow
    //   15238: aconst_null
    //   15239: athrow
    //   15240: aconst_null
    //   15241: athrow
    //   15242: aconst_null
    //   15243: athrow
    //   15244: aconst_null
    //   15245: athrow
    //   15246: aconst_null
    //   15247: athrow
    //   15248: aconst_null
    //   15249: athrow
    //   15250: aconst_null
    //   15251: athrow
    //   15252: aconst_null
    //   15253: athrow
    //   15254: aconst_null
    //   15255: athrow
    //   15256: aconst_null
    //   15257: athrow
    //   15258: aconst_null
    //   15259: athrow
    //   15260: aconst_null
    //   15261: athrow
    //   15262: aconst_null
    //   15263: athrow
    //   15264: aconst_null
    //   15265: athrow
    //   15266: aconst_null
    //   15267: athrow
    //   15268: aconst_null
    //   15269: athrow
    //   15270: aconst_null
    //   15271: athrow
    //   15272: aconst_null
    //   15273: athrow
    //   15274: aconst_null
    //   15275: athrow
    //   15276: aconst_null
    //   15277: athrow
    //   15278: aconst_null
    //   15279: athrow
    //   15280: aconst_null
    //   15281: athrow
    //   15282: aconst_null
    //   15283: athrow
    //   15284: aconst_null
    //   15285: athrow
    //   15286: aconst_null
    //   15287: athrow
    //   15288: aconst_null
    //   15289: athrow
    //   15290: aconst_null
    //   15291: athrow
    //   15292: aconst_null
    //   15293: athrow
    //   15294: aconst_null
    //   15295: athrow
    //   15296: aconst_null
    //   15297: athrow
    //   15298: aconst_null
    //   15299: athrow
    //   15300: aconst_null
    //   15301: athrow
    //   15302: aconst_null
    //   15303: athrow
    //   15304: aconst_null
    //   15305: athrow
    //   15306: aconst_null
    //   15307: athrow
    //   15308: aconst_null
    //   15309: athrow
    //   15310: aconst_null
    //   15311: athrow
    //   15312: aconst_null
    //   15313: athrow
    //   15314: aconst_null
    //   15315: athrow
    //   15316: aconst_null
    //   15317: athrow
    //   15318: aconst_null
    //   15319: athrow
    //   15320: aconst_null
    //   15321: athrow
    //   15322: aconst_null
    //   15323: athrow
    //   15324: aconst_null
    //   15325: athrow
    //   15326: aconst_null
    //   15327: athrow
    //   15328: aconst_null
    //   15329: athrow
    //   15330: aconst_null
    //   15331: athrow
    //   15332: aconst_null
    //   15333: athrow
    //   15334: aconst_null
    //   15335: athrow
    //   15336: aconst_null
    //   15337: athrow
    //   15338: aconst_null
    //   15339: athrow
    //   15340: aconst_null
    //   15341: athrow
    //   15342: aconst_null
    //   15343: athrow
    //   15344: aconst_null
    //   15345: athrow
    //   15346: aconst_null
    //   15347: athrow
    //   15348: aconst_null
    //   15349: athrow
    //   15350: aconst_null
    //   15351: athrow
    //   15352: aconst_null
    //   15353: athrow
    //   15354: aconst_null
    //   15355: athrow
    //   15356: aconst_null
    //   15357: athrow
    //   15358: aconst_null
    //   15359: athrow
    //   15360: aconst_null
    //   15361: athrow
    //   15362: aconst_null
    //   15363: athrow
    //   15364: aconst_null
    //   15365: athrow
    //   15366: aconst_null
    //   15367: athrow
    //   15368: aconst_null
    //   15369: athrow
    //   15370: aconst_null
    //   15371: athrow
    //   15372: aconst_null
    //   15373: athrow
    //   15374: aconst_null
    //   15375: athrow
    //   15376: aconst_null
    //   15377: athrow
    //   15378: aconst_null
    //   15379: athrow
    //   15380: aconst_null
    //   15381: athrow
    //   15382: aconst_null
    //   15383: athrow
    //   15384: aconst_null
    //   15385: athrow
    //   15386: aconst_null
    //   15387: athrow
    //   15388: aconst_null
    //   15389: athrow
    //   15390: aconst_null
    //   15391: athrow
    //   15392: aconst_null
    //   15393: athrow
    //   15394: aconst_null
    //   15395: athrow
    //   15396: aconst_null
    //   15397: athrow
    //   15398: aconst_null
    //   15399: athrow
    //   15400: aconst_null
    //   15401: athrow
    //   15402: aconst_null
    //   15403: athrow
    //   15404: aconst_null
    //   15405: athrow
    //   15406: aconst_null
    //   15407: athrow
    //   15408: aconst_null
    //   15409: athrow
    //   15410: aconst_null
    //   15411: athrow
    //   15412: aconst_null
    //   15413: athrow
    //   15414: aconst_null
    //   15415: athrow
    //   15416: aconst_null
    //   15417: athrow
    //   15418: aconst_null
    //   15419: athrow
    //   15420: aconst_null
    //   15421: athrow
    //   15422: aconst_null
    //   15423: athrow
    //   15424: aconst_null
    //   15425: athrow
    //   15426: aconst_null
    //   15427: athrow
    //   15428: aconst_null
    //   15429: athrow
    //   15430: aconst_null
    //   15431: athrow
    //   15432: aconst_null
    //   15433: athrow
    //   15434: aconst_null
    //   15435: athrow
    //   15436: aconst_null
    //   15437: athrow
    //   15438: aconst_null
    //   15439: athrow
    //   15440: aconst_null
    //   15441: athrow
    //   15442: aconst_null
    //   15443: athrow
    //   15444: aconst_null
    //   15445: athrow
    //   15446: aconst_null
    //   15447: athrow
    //   15448: aconst_null
    //   15449: athrow
    //   15450: aconst_null
    //   15451: athrow
    //   15452: aconst_null
    //   15453: athrow
    //   15454: aconst_null
    //   15455: athrow
    //   15456: aconst_null
    //   15457: athrow
    //   15458: aconst_null
    //   15459: athrow
    //   15460: aconst_null
    //   15461: athrow
    //   15462: aconst_null
    //   15463: athrow
    //   15464: aconst_null
    //   15465: athrow
    //   15466: aconst_null
    //   15467: athrow
    //   15468: aconst_null
    //   15469: athrow
    //   15470: aconst_null
    //   15471: athrow
    //   15472: aconst_null
    //   15473: athrow
    //   15474: aconst_null
    //   15475: athrow
    //   15476: aconst_null
    //   15477: athrow
    //   15478: aconst_null
    //   15479: athrow
    //   15480: aconst_null
    //   15481: athrow
    //   15482: aconst_null
    //   15483: athrow
    //   15484: aconst_null
    //   15485: athrow
    //   15486: aconst_null
    //   15487: athrow
    //   15488: aconst_null
    //   15489: athrow
    //   15490: aconst_null
    //   15491: athrow
    //   15492: aconst_null
    //   15493: athrow
    //   15494: aconst_null
    //   15495: athrow
    //   15496: aconst_null
    //   15497: athrow
    //   15498: aconst_null
    //   15499: athrow
    //   15500: aconst_null
    //   15501: athrow
    //   15502: aconst_null
    //   15503: athrow
    //   15504: aconst_null
    //   15505: athrow
    //   15506: aconst_null
    //   15507: athrow
    //   15508: aconst_null
    //   15509: athrow
    //   15510: aconst_null
    //   15511: athrow
    //   15512: aconst_null
    //   15513: athrow
    //   15514: aconst_null
    //   15515: athrow
    //   15516: aconst_null
    //   15517: athrow
    //   15518: aconst_null
    //   15519: athrow
    //   15520: aconst_null
    //   15521: athrow
    //   15522: aconst_null
    //   15523: athrow
    //   15524: aconst_null
    //   15525: athrow
    //   15526: aconst_null
    //   15527: athrow
    //   15528: aconst_null
    //   15529: athrow
    //   15530: aconst_null
    //   15531: athrow
    //   15532: aconst_null
    //   15533: athrow
    //   15534: aconst_null
    //   15535: athrow
    //   15536: aconst_null
    //   15537: athrow
    //   15538: aconst_null
    //   15539: athrow
    //   15540: aconst_null
    //   15541: athrow
    //   15542: aconst_null
    //   15543: athrow
    //   15544: aconst_null
    //   15545: athrow
    //   15546: aconst_null
    //   15547: athrow
    //   15548: aconst_null
    //   15549: athrow
    //   15550: aconst_null
    //   15551: athrow
    //   15552: aconst_null
    //   15553: athrow
    //   15554: aconst_null
    //   15555: athrow
    //   15556: aconst_null
    //   15557: athrow
    //   15558: aconst_null
    //   15559: athrow
    //   15560: aconst_null
    //   15561: athrow
    //   15562: aconst_null
    //   15563: athrow
    //   15564: aconst_null
    //   15565: athrow
    //   15566: aconst_null
    //   15567: athrow
    //   15568: aconst_null
    //   15569: athrow
    //   15570: aconst_null
    //   15571: athrow
    //   15572: aconst_null
    //   15573: athrow
    //   15574: aconst_null
    //   15575: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	15120	0	this	Lbigname/zprestige/webhack/features/modules/Movement/Strafe;
  }
  
  public boolean lambda$new$18(Boolean paramBoolean) {
    return Perry1.2y(this, (int)1993769255L ^ 0xEEC71D1, paramBoolean);
  }
  
  public void onEnable() {
    Perry1.3R(this, (int)551177867L ^ 0x30038751);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public boolean lambda$new$2(Boolean paramBoolean) {
    return Perry1.2u(this, (int)-630199962L ^ 0xC0407176, paramBoolean);
  }
  
  public boolean lambda$new$1(Boolean paramBoolean) {
    return Perry1.2n(this, (int)301721436L ^ 0x65A3D5EB, paramBoolean);
  }
  
  public boolean lambda$new$13(Boolean paramBoolean) {
    return Perry1.2r(this, (int)-1224511543L ^ 0xD2FE9057, paramBoolean);
  }
  
  public boolean lambda$new$5(Integer paramInteger) {
    return Perry1.5u(this, (int)-546772940L ^ 0xC3F9DD53, paramInteger);
  }
  
  public boolean lambda$new$16(Integer paramInteger) {
    return Perry1.5l(this, (int)1296588427L ^ 0xF122BF1, paramInteger);
  }
  
  public void doNCP(MoveEvent paramMoveEvent) {
    Perry1.W(this, (int)1255315320L ^ 0x23602F7A, paramMoveEvent);
  }
  
  public boolean lambda$new$22(Boolean paramBoolean) {
    return Perry1.2v(this, (int)1326766266L ^ 0x7F6DA19, paramBoolean);
  }
  
  @SubscribeEvent
  public void onMove(MoveEvent event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 24213
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 24205
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 24197
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -460502997
    //   33: l2i
    //   34: ldc_w -1824476429
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 2130122102
    //   44: l2i
    //   45: ldc_w -1796992938
    //   48: ixor
    //   49: ldc2_w 1740027271
    //   52: l2i
    //   53: ldc_w 334676786
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1449567372 -> 41, 59346029 -> 23982
    //   84: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.0 : I
    //   90: ifle -> 104
    //   93: ldc2_w 284778456
    //   96: l2i
    //   97: ldc_w -1707252093
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w 496186776
    //   107: l2i
    //   108: ldc_w 636342730
    //   111: ixor
    //   112: ldc2_w 1755866200
    //   115: l2i
    //   116: ldc_w 178123180
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 23638, -386814801 -> 104, 1514893734 -> 148
    //   148: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   151: getstatic Perryc.c : I
    //   154: iflt -> 168
    //   157: ldc2_w 1476942390
    //   160: l2i
    //   161: ldc_w -949954801
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w 1377132446
    //   171: l2i
    //   172: ldc_w -499459609
    //   175: ixor
    //   176: ldc2_w 285645002
    //   179: l2i
    //   180: ldc_w 1631106678
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 212, -279534715 -> 23676, 768287282 -> 168
    //   212: getfield field_70122_E : Z
    //   215: ifne -> 229
    //   218: ldc2_w -134334082
    //   221: l2i
    //   222: ldc_w -959655409
    //   225: ixor
    //   226: goto -> 237
    //   229: ldc2_w 2040824835
    //   232: l2i
    //   233: ldc_w 1217818483
    //   236: ixor
    //   237: ldc2_w 1736581782
    //   240: l2i
    //   241: ldc_w 906664129
    //   244: ixor
    //   245: ixor
    //   246: tableswitch default -> 218, 1622823206 -> 268, 1622823207 -> 769
    //   268: getstatic Perryc.1 : I
    //   271: ifeq -> 285
    //   274: ldc2_w -180640345
    //   277: l2i
    //   278: ldc_w 1829673830
    //   281: ixor
    //   282: goto -> 293
    //   285: ldc2_w 41920919
    //   288: l2i
    //   289: ldc_w -1462613440
    //   292: ixor
    //   293: ldc2_w 1758037160
    //   296: l2i
    //   297: ldc_w 1979573616
    //   300: ixor
    //   301: ixor
    //   302: lookupswitch default -> 328, -2063507687 -> 24004, 1128420278 -> 285
    //   328: aload_0
    //   329: getstatic Perryc.0 : I
    //   332: ifle -> 346
    //   335: ldc2_w 1913154897
    //   338: l2i
    //   339: ldc_w 2068249265
    //   342: ixor
    //   343: goto -> 354
    //   346: ldc2_w -942330618
    //   349: l2i
    //   350: ldc_w -729637034
    //   353: ixor
    //   354: ldc2_w -1625490713
    //   357: l2i
    //   358: ldc_w -1219114474
    //   361: ixor
    //   362: ixor
    //   363: lookupswitch default -> 24126, 554149649 -> 346, 991855265 -> 388
    //   388: getfield wait : Lbigname/zprestige/webhack/features/setting/Setting;
    //   391: getstatic Perryc.1 : I
    //   394: ifeq -> 408
    //   397: ldc2_w 1695400318
    //   400: l2i
    //   401: ldc_w -1948733671
    //   404: ixor
    //   405: goto -> 416
    //   408: ldc2_w 972579005
    //   411: l2i
    //   412: ldc_w 770662585
    //   415: ixor
    //   416: ldc2_w 1088700925
    //   419: l2i
    //   420: ldc_w -1066006649
    //   423: ixor
    //   424: ixor
    //   425: lookupswitch default -> 452, -2111851060 -> 408, 1850157085 -> 24128
    //   452: goto -> 456
    //   455: athrow
    //   456: invokevirtual getValue : ()Ljava/lang/Object;
    //   459: goto -> 463
    //   462: athrow
    //   463: checkcast java/lang/Boolean
    //   466: getstatic Perryc.0 : I
    //   469: ifle -> 483
    //   472: ldc2_w 1198753166
    //   475: l2i
    //   476: ldc_w -1109449838
    //   479: ixor
    //   480: goto -> 491
    //   483: ldc2_w 1226818371
    //   486: l2i
    //   487: ldc_w -1004347752
    //   490: ixor
    //   491: ldc2_w 656489220
    //   494: l2i
    //   495: ldc_w 1679162472
    //   498: ixor
    //   499: ixor
    //   500: lookupswitch default -> 24088, -1181195920 -> 483, -838214985 -> 528
    //   528: goto -> 532
    //   531: athrow
    //   532: invokevirtual booleanValue : ()Z
    //   535: goto -> 539
    //   538: athrow
    //   539: ifeq -> 553
    //   542: ldc2_w 408906171
    //   545: l2i
    //   546: ldc_w -1974861013
    //   549: ixor
    //   550: goto -> 561
    //   553: ldc2_w -1155000160
    //   556: l2i
    //   557: ldc_w 691892785
    //   560: ixor
    //   561: ldc2_w -1402655408
    //   564: l2i
    //   565: ldc_w 816070924
    //   568: ixor
    //   569: ixor
    //   570: tableswitch default -> 542, 248776396 -> 592, 248776397 -> 899
    //   592: getstatic Perryc.c : I
    //   595: iflt -> 609
    //   598: ldc2_w 691757512
    //   601: l2i
    //   602: ldc_w 237656124
    //   605: ixor
    //   606: goto -> 617
    //   609: ldc2_w 2056507271
    //   612: l2i
    //   613: ldc_w 2107923863
    //   616: ixor
    //   617: ldc2_w -147095113
    //   620: l2i
    //   621: ldc_w -64912496
    //   624: ixor
    //   625: ixor
    //   626: lookupswitch default -> 652, -54297028 -> 609, 738933715 -> 23920
    //   652: aload_0
    //   653: getstatic Perryc.0 : I
    //   656: ifle -> 670
    //   659: ldc2_w -1638791290
    //   662: l2i
    //   663: ldc_w 1243654975
    //   666: ixor
    //   667: goto -> 678
    //   670: ldc2_w -1816410099
    //   673: l2i
    //   674: ldc_w -1155944763
    //   677: ixor
    //   678: ldc2_w -670591039
    //   681: l2i
    //   682: ldc_w 1509461371
    //   685: ixor
    //   686: ixor
    //   687: lookupswitch default -> 712, -1026568871 -> 670, 1435350531 -> 24186
    //   712: getfield waitForGround : Z
    //   715: ifeq -> 729
    //   718: ldc2_w 67318425
    //   721: l2i
    //   722: ldc_w 1966451346
    //   725: ixor
    //   726: goto -> 737
    //   729: ldc2_w 407866548
    //   732: l2i
    //   733: ldc_w 1769542846
    //   736: ixor
    //   737: ldc2_w -974357604
    //   740: l2i
    //   741: ldc_w 717684227
    //   744: ixor
    //   745: ixor
    //   746: tableswitch default -> 718, -1642324588 -> 768, -1642324587 -> 899
    //   768: return
    //   769: getstatic Perryc.0 : I
    //   772: ifle -> 786
    //   775: ldc2_w 510298726
    //   778: l2i
    //   779: ldc_w -1217310146
    //   782: ixor
    //   783: goto -> 794
    //   786: ldc2_w 243303395
    //   789: l2i
    //   790: ldc_w 46041285
    //   793: ixor
    //   794: ldc2_w -851226038
    //   797: l2i
    //   798: ldc_w -302227319
    //   801: ixor
    //   802: ixor
    //   803: lookupswitch default -> 23916, -1985680741 -> 786, 746666469 -> 828
    //   828: aload_0
    //   829: ldc2_w 1727348146
    //   832: l2i
    //   833: ldc_w 1727348146
    //   836: ixor
    //   837: getstatic Perryc.1 : I
    //   840: ifeq -> 854
    //   843: ldc2_w -1566864067
    //   846: l2i
    //   847: ldc_w -1369557084
    //   850: ixor
    //   851: goto -> 862
    //   854: ldc2_w -1101893531
    //   857: l2i
    //   858: ldc_w 1716176642
    //   861: ixor
    //   862: ldc2_w -203430282
    //   865: l2i
    //   866: ldc_w -582448176
    //   869: ixor
    //   870: ixor
    //   871: lookupswitch default -> 24156, -158344511 -> 896, 575854399 -> 854
    //   896: putfield waitForGround : Z
    //   899: getstatic Perryc.0 : I
    //   902: ifle -> 916
    //   905: ldc2_w -1474372373
    //   908: l2i
    //   909: ldc_w -205687639
    //   912: ixor
    //   913: goto -> 924
    //   916: ldc2_w 1771064152
    //   919: l2i
    //   920: ldc_w 1625507718
    //   923: ixor
    //   924: ldc2_w -1784065284
    //   927: l2i
    //   928: ldc_w -823339791
    //   931: ixor
    //   932: ixor
    //   933: lookupswitch default -> 960, 15085135 -> 23680, 1332621165 -> 916
    //   960: aload_0
    //   961: getstatic Perryc.1 : I
    //   964: ifeq -> 978
    //   967: ldc2_w -1149422570
    //   970: l2i
    //   971: ldc_w 1134830102
    //   974: ixor
    //   975: goto -> 986
    //   978: ldc2_w -429240396
    //   981: l2i
    //   982: ldc_w -1614442662
    //   985: ixor
    //   986: ldc2_w 1861958343
    //   989: l2i
    //   990: ldc_w -444305238
    //   993: ixor
    //   994: ixor
    //   995: lookupswitch default -> 1020, -736044971 -> 978, 1940282477 -> 23986
    //   1020: getfield mode : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1023: getstatic Perryc.c : I
    //   1026: iflt -> 1040
    //   1029: ldc2_w -433851379
    //   1032: l2i
    //   1033: ldc_w 689060276
    //   1036: ixor
    //   1037: goto -> 1048
    //   1040: ldc2_w -1195024679
    //   1043: l2i
    //   1044: ldc_w 1544295676
    //   1047: ixor
    //   1048: ldc2_w 1938530868
    //   1051: l2i
    //   1052: ldc_w -862120616
    //   1055: ixor
    //   1056: ixor
    //   1057: lookupswitch default -> 23934, 1541406025 -> 1084, 1881635541 -> 1040
    //   1084: goto -> 1088
    //   1087: athrow
    //   1088: invokevirtual getValue : ()Ljava/lang/Object;
    //   1091: goto -> 1095
    //   1094: athrow
    //   1095: getstatic Perryc.1 : I
    //   1098: ifeq -> 1112
    //   1101: ldc2_w 1784796771
    //   1104: l2i
    //   1105: ldc_w 1313096387
    //   1108: ixor
    //   1109: goto -> 1120
    //   1112: ldc2_w -95102553
    //   1115: l2i
    //   1116: ldc_w -332118484
    //   1119: ixor
    //   1120: ldc2_w -118333280
    //   1123: l2i
    //   1124: ldc_w -110916835
    //   1127: ixor
    //   1128: ixor
    //   1129: lookupswitch default -> 1156, -2006114951 -> 1112, 632586013 -> 24134
    //   1156: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe$Mode.NCP : Lbigname/zprestige/webhack/features/modules/Movement/Strafe$Mode;
    //   1159: if_acmpne -> 1173
    //   1162: ldc2_w 439185108
    //   1165: l2i
    //   1166: ldc_w -479761827
    //   1169: ixor
    //   1170: goto -> 1181
    //   1173: ldc2_w 22692438
    //   1176: l2i
    //   1177: ldc_w -133151010
    //   1180: ixor
    //   1181: ldc2_w 1885477680
    //   1184: l2i
    //   1185: ldc_w 943320195
    //   1188: ixor
    //   1189: ixor
    //   1190: tableswitch default -> 1162, -1324223686 -> 1212, -1324223685 -> 1406
    //   1212: getstatic Perryc.1 : I
    //   1215: ifeq -> 1229
    //   1218: ldc2_w -1544022717
    //   1221: l2i
    //   1222: ldc_w -925900712
    //   1225: ixor
    //   1226: goto -> 1237
    //   1229: ldc2_w 2133725599
    //   1232: l2i
    //   1233: ldc_w 2027259914
    //   1236: ixor
    //   1237: ldc2_w -210438754
    //   1240: l2i
    //   1241: ldc_w 1369277290
    //   1244: ixor
    //   1245: ixor
    //   1246: lookupswitch default -> 1272, -908164113 -> 23944, 174854411 -> 1229
    //   1272: aload_0
    //   1273: getstatic Perryc.c : I
    //   1276: iflt -> 1290
    //   1279: ldc2_w 622460135
    //   1282: l2i
    //   1283: ldc_w 918931721
    //   1286: ixor
    //   1287: goto -> 1298
    //   1290: ldc2_w 329510470
    //   1293: l2i
    //   1294: ldc_w 610135458
    //   1297: ixor
    //   1298: ldc2_w -1820823286
    //   1301: l2i
    //   1302: ldc_w -1974207357
    //   1305: ixor
    //   1306: ixor
    //   1307: lookupswitch default -> 23766, 184006759 -> 1290, 785747565 -> 1332
    //   1332: aload_1
    //   1333: getstatic Perryc.1 : I
    //   1336: ifeq -> 1350
    //   1339: ldc2_w -285514573
    //   1342: l2i
    //   1343: ldc_w -1170532488
    //   1346: ixor
    //   1347: goto -> 1358
    //   1350: ldc2_w -1943980377
    //   1353: l2i
    //   1354: ldc_w 1735116568
    //   1357: ixor
    //   1358: ldc2_w 2008827573
    //   1361: l2i
    //   1362: ldc_w -778102417
    //   1365: ixor
    //   1366: ixor
    //   1367: lookupswitch default -> 1392, -219993071 -> 23850, 1852262597 -> 1350
    //   1392: goto -> 1396
    //   1395: athrow
    //   1396: invokespecial doNCP : (Lbigname/zprestige/webhack/event/events/MoveEvent;)V
    //   1399: goto -> 1403
    //   1402: athrow
    //   1403: goto -> 23563
    //   1406: getstatic Perryc.c : I
    //   1409: iflt -> 1423
    //   1412: ldc2_w -2026219375
    //   1415: l2i
    //   1416: ldc_w -730713747
    //   1419: ixor
    //   1420: goto -> 1431
    //   1423: ldc2_w 1197665595
    //   1426: l2i
    //   1427: ldc_w 568651111
    //   1430: ixor
    //   1431: ldc2_w -917790191
    //   1434: l2i
    //   1435: ldc_w -917490178
    //   1438: ixor
    //   1439: ixor
    //   1440: lookupswitch default -> 23640, 1398013459 -> 1423, 1721604019 -> 1468
    //   1468: aload_0
    //   1469: getstatic Perryc.1 : I
    //   1472: ifeq -> 1486
    //   1475: ldc2_w -789273047
    //   1478: l2i
    //   1479: ldc_w 1966875928
    //   1482: ixor
    //   1483: goto -> 1494
    //   1486: ldc2_w -1571376193
    //   1489: l2i
    //   1490: ldc_w 1551197456
    //   1493: ixor
    //   1494: ldc2_w 1168966397
    //   1497: l2i
    //   1498: ldc_w 982819336
    //   1501: ixor
    //   1502: ixor
    //   1503: lookupswitch default -> 1528, -621730876 -> 23614, 389032981 -> 1486
    //   1528: getfield mode : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1531: getstatic Perryc.0 : I
    //   1534: ifle -> 1548
    //   1537: ldc2_w 1790876182
    //   1540: l2i
    //   1541: ldc_w 1115823410
    //   1544: ixor
    //   1545: goto -> 1556
    //   1548: ldc2_w -828941900
    //   1551: l2i
    //   1552: ldc_w 831942957
    //   1555: ixor
    //   1556: ldc2_w -1933076659
    //   1559: l2i
    //   1560: ldc_w -2100860053
    //   1563: ixor
    //   1564: ixor
    //   1565: lookupswitch default -> 1592, -1883874153 -> 1548, 641497858 -> 23846
    //   1592: goto -> 1596
    //   1595: athrow
    //   1596: invokevirtual getValue : ()Ljava/lang/Object;
    //   1599: goto -> 1603
    //   1602: athrow
    //   1603: getstatic Perryc.0 : I
    //   1606: ifle -> 1620
    //   1609: ldc2_w 1918372703
    //   1612: l2i
    //   1613: ldc_w -414473690
    //   1616: ixor
    //   1617: goto -> 1628
    //   1620: ldc2_w 564041342
    //   1623: l2i
    //   1624: ldc_w -914674956
    //   1627: ixor
    //   1628: ldc2_w 1789193121
    //   1631: l2i
    //   1632: ldc_w -1001785029
    //   1635: ixor
    //   1636: ixor
    //   1637: lookupswitch default -> 23870, 1006549987 -> 1620, 1174973968 -> 1664
    //   1664: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe$Mode.STRAFE : Lbigname/zprestige/webhack/features/modules/Movement/Strafe$Mode;
    //   1667: if_acmpne -> 1681
    //   1670: ldc2_w -1417062958
    //   1673: l2i
    //   1674: ldc_w -412688420
    //   1677: ixor
    //   1678: goto -> 1689
    //   1681: ldc2_w 1178636810
    //   1684: l2i
    //   1685: ldc_w 179247111
    //   1688: ixor
    //   1689: ldc2_w 777776038
    //   1692: l2i
    //   1693: ldc_w 36570321
    //   1696: ixor
    //   1697: ixor
    //   1698: tableswitch default -> 1670, 1620731257 -> 1720, 1620731258 -> 23563
    //   1720: getstatic Perryc.0 : I
    //   1723: ifle -> 1737
    //   1726: ldc2_w 2132900007
    //   1729: l2i
    //   1730: ldc_w -2053444193
    //   1733: ixor
    //   1734: goto -> 1745
    //   1737: ldc2_w 1140011029
    //   1740: l2i
    //   1741: ldc_w 136552891
    //   1744: ixor
    //   1745: ldc2_w 386598132
    //   1748: l2i
    //   1749: ldc_w -917735957
    //   1752: ixor
    //   1753: ixor
    //   1754: lookupswitch default -> 23732, -1785208655 -> 1780, 620553255 -> 1737
    //   1780: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   1783: getstatic Perryc.0 : I
    //   1786: ifle -> 1800
    //   1789: ldc2_w -581514596
    //   1792: l2i
    //   1793: ldc_w -1513225491
    //   1796: ixor
    //   1797: goto -> 1808
    //   1800: ldc2_w -1300098087
    //   1803: l2i
    //   1804: ldc_w 1740565303
    //   1807: ixor
    //   1808: ldc2_w -1117720318
    //   1811: l2i
    //   1812: ldc_w 2118027055
    //   1815: ixor
    //   1816: ixor
    //   1817: lookupswitch default -> 1844, -1144603044 -> 23712, 769373493 -> 1800
    //   1844: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1847: getstatic Perryc.0 : I
    //   1850: ifle -> 1864
    //   1853: ldc2_w 350570745
    //   1856: l2i
    //   1857: ldc_w -1476504458
    //   1860: ixor
    //   1861: goto -> 1872
    //   1864: ldc2_w 586026237
    //   1867: l2i
    //   1868: ldc_w 1038556655
    //   1871: ixor
    //   1872: ldc2_w -129708156
    //   1875: l2i
    //   1876: ldc_w -272655011
    //   1879: ixor
    //   1880: ixor
    //   1881: lookupswitch default -> 1908, -1528803754 -> 23842, -330076207 -> 1864
    //   1908: getfield field_71158_b : Lnet/minecraft/util/MovementInput;
    //   1911: getstatic Perryc.0 : I
    //   1914: ifle -> 1928
    //   1917: ldc2_w 237394635
    //   1920: l2i
    //   1921: ldc_w -1796496890
    //   1924: ixor
    //   1925: goto -> 1936
    //   1928: ldc2_w 1630394610
    //   1931: l2i
    //   1932: ldc_w -117171533
    //   1935: ixor
    //   1936: ldc2_w 310526542
    //   1939: l2i
    //   1940: ldc_w 795595903
    //   1943: ixor
    //   1944: ixor
    //   1945: lookupswitch default -> 1972, -1490784516 -> 24064, -845433931 -> 1928
    //   1972: getfield field_192832_b : F
    //   1975: getstatic Perryc.1 : I
    //   1978: ifeq -> 1992
    //   1981: ldc2_w 65132356
    //   1984: l2i
    //   1985: ldc_w 1727502589
    //   1988: ixor
    //   1989: goto -> 2000
    //   1992: ldc2_w -1882861255
    //   1995: l2i
    //   1996: ldc_w -704177037
    //   1999: ixor
    //   2000: ldc2_w -1230752263
    //   2003: l2i
    //   2004: ldc_w 10517653
    //   2007: ixor
    //   2008: ixor
    //   2009: lookupswitch default -> 23956, -753793323 -> 1992, -272202714 -> 2036
    //   2036: fstore_2
    //   2037: getstatic Perryc.0 : I
    //   2040: ifle -> 2054
    //   2043: ldc2_w 1358889144
    //   2046: l2i
    //   2047: ldc_w -1208097109
    //   2050: ixor
    //   2051: goto -> 2062
    //   2054: ldc2_w -262357450
    //   2057: l2i
    //   2058: ldc_w 1526676671
    //   2061: ixor
    //   2062: ldc2_w 400880086
    //   2065: l2i
    //   2066: ldc_w -641994875
    //   2069: ixor
    //   2070: ixor
    //   2071: lookupswitch default -> 2096, 694024256 -> 23836, 1818832425 -> 2054
    //   2096: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   2099: getstatic Perryc.1 : I
    //   2102: ifeq -> 2116
    //   2105: ldc2_w 1214715836
    //   2108: l2i
    //   2109: ldc_w -1031722828
    //   2112: ixor
    //   2113: goto -> 2124
    //   2116: ldc2_w 1740957045
    //   2119: l2i
    //   2120: ldc_w -994755714
    //   2123: ixor
    //   2124: ldc2_w 467124424
    //   2127: l2i
    //   2128: ldc_w 1526131877
    //   2131: ixor
    //   2132: ixor
    //   2133: lookupswitch default -> 23762, -876145819 -> 2116, -498011546 -> 2160
    //   2160: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2163: getstatic Perryc.c : I
    //   2166: iflt -> 2180
    //   2169: ldc2_w 1332279273
    //   2172: l2i
    //   2173: ldc_w -76545343
    //   2176: ixor
    //   2177: goto -> 2188
    //   2180: ldc2_w 762818178
    //   2183: l2i
    //   2184: ldc_w -706853794
    //   2187: ixor
    //   2188: ldc2_w 1318796295
    //   2191: l2i
    //   2192: ldc_w -1925953128
    //   2195: ixor
    //   2196: ixor
    //   2197: lookupswitch default -> 2224, 1693772241 -> 2180, 2008514743 -> 23718
    //   2224: getfield field_71158_b : Lnet/minecraft/util/MovementInput;
    //   2227: getstatic Perryc.0 : I
    //   2230: ifle -> 2244
    //   2233: ldc2_w -1495935892
    //   2236: l2i
    //   2237: ldc_w 1586919160
    //   2240: ixor
    //   2241: goto -> 2252
    //   2244: ldc2_w 1746704225
    //   2247: l2i
    //   2248: ldc_w -1209462352
    //   2251: ixor
    //   2252: ldc2_w 506556575
    //   2255: l2i
    //   2256: ldc_w -1239575603
    //   2259: ixor
    //   2260: ixor
    //   2261: lookupswitch default -> 23888, 1349468614 -> 2244, 2010736003 -> 2288
    //   2288: getfield field_78902_a : F
    //   2291: getstatic Perryc.c : I
    //   2294: iflt -> 2308
    //   2297: ldc2_w -1046284998
    //   2300: l2i
    //   2301: ldc_w -1683162667
    //   2304: ixor
    //   2305: goto -> 2316
    //   2308: ldc2_w 694452340
    //   2311: l2i
    //   2312: ldc_w 773904097
    //   2315: ixor
    //   2316: ldc2_w 290773254
    //   2319: l2i
    //   2320: ldc_w -229099332
    //   2323: ixor
    //   2324: ixor
    //   2325: lookupswitch default -> 2352, -1190990507 -> 23858, 847405583 -> 2308
    //   2352: fstore_3
    //   2353: getstatic Perryc.0 : I
    //   2356: ifle -> 2370
    //   2359: ldc2_w 1021246890
    //   2362: l2i
    //   2363: ldc_w 1344122114
    //   2366: ixor
    //   2367: goto -> 2378
    //   2370: ldc2_w 882032697
    //   2373: l2i
    //   2374: ldc_w -1575228852
    //   2377: ixor
    //   2378: ldc2_w 2089106347
    //   2381: l2i
    //   2382: ldc_w -1217986640
    //   2385: ixor
    //   2386: ixor
    //   2387: lookupswitch default -> 24016, -1491037005 -> 2370, 1567288942 -> 2412
    //   2412: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   2415: getstatic Perryc.0 : I
    //   2418: ifle -> 2432
    //   2421: ldc2_w 1788222646
    //   2424: l2i
    //   2425: ldc_w -107641870
    //   2428: ixor
    //   2429: goto -> 2440
    //   2432: ldc2_w -110422209
    //   2435: l2i
    //   2436: ldc_w 1957055118
    //   2439: ixor
    //   2440: ldc2_w -1121222929
    //   2443: l2i
    //   2444: ldc_w 159626452
    //   2447: ixor
    //   2448: ixor
    //   2449: lookupswitch default -> 23646, 665539967 -> 2432, 962959242 -> 2476
    //   2476: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2479: getstatic Perryc.1 : I
    //   2482: ifeq -> 2496
    //   2485: ldc2_w 626357426
    //   2488: l2i
    //   2489: ldc_w -2041717212
    //   2492: ixor
    //   2493: goto -> 2504
    //   2496: ldc2_w 1404886157
    //   2499: l2i
    //   2500: ldc_w 1390085445
    //   2503: ixor
    //   2504: ldc2_w 954521571
    //   2507: l2i
    //   2508: ldc_w -460359726
    //   2511: ixor
    //   2512: ixor
    //   2513: lookupswitch default -> 2540, -928804492 -> 2496, 2138245799 -> 23970
    //   2540: getfield field_70177_z : F
    //   2543: getstatic Perryc.0 : I
    //   2546: ifle -> 2560
    //   2549: ldc2_w -66398675
    //   2552: l2i
    //   2553: ldc_w -1535174346
    //   2556: ixor
    //   2557: goto -> 2568
    //   2560: ldc2_w 817715438
    //   2563: l2i
    //   2564: ldc_w 310542068
    //   2567: ixor
    //   2568: ldc2_w -1684726390
    //   2571: l2i
    //   2572: ldc_w -1127659100
    //   2575: ixor
    //   2576: ixor
    //   2577: lookupswitch default -> 2604, 1549349822 -> 2560, 2133433141 -> 23618
    //   2604: fstore #4
    //   2606: getstatic Perryc.1 : I
    //   2609: ifeq -> 2623
    //   2612: ldc2_w -827590753
    //   2615: l2i
    //   2616: ldc_w -1948480120
    //   2619: ixor
    //   2620: goto -> 2631
    //   2623: ldc2_w 1544739150
    //   2626: l2i
    //   2627: ldc_w -1206213844
    //   2630: ixor
    //   2631: ldc2_w 1054193098
    //   2634: l2i
    //   2635: ldc_w 822209044
    //   2638: ixor
    //   2639: ixor
    //   2640: lookupswitch default -> 23976, -337893956 -> 2668, 1252206025 -> 2623
    //   2668: aload_0
    //   2669: getstatic Perryc.1 : I
    //   2672: ifeq -> 2686
    //   2675: ldc2_w -1850960216
    //   2678: l2i
    //   2679: ldc_w -1713964373
    //   2682: ixor
    //   2683: goto -> 2694
    //   2686: ldc2_w 186601937
    //   2689: l2i
    //   2690: ldc_w 515410646
    //   2693: ixor
    //   2694: ldc2_w 1433207640
    //   2697: l2i
    //   2698: ldc_w 1243543383
    //   2701: ixor
    //   2702: ixor
    //   2703: lookupswitch default -> 2728, -818717638 -> 2686, 386504716 -> 23862
    //   2728: getfield step : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2731: getstatic Perryc.1 : I
    //   2734: ifeq -> 2748
    //   2737: ldc2_w 1636225759
    //   2740: l2i
    //   2741: ldc_w -338773600
    //   2744: ixor
    //   2745: goto -> 2756
    //   2748: ldc2_w 286627785
    //   2751: l2i
    //   2752: ldc_w 1792221793
    //   2755: ixor
    //   2756: ldc2_w 1703500747
    //   2759: l2i
    //   2760: ldc_w -1179009478
    //   2763: ixor
    //   2764: ixor
    //   2765: lookupswitch default -> 23774, -1477029799 -> 2792, 1450741390 -> 2748
    //   2792: goto -> 2796
    //   2795: athrow
    //   2796: invokevirtual getValue : ()Ljava/lang/Object;
    //   2799: goto -> 2803
    //   2802: athrow
    //   2803: checkcast java/lang/Integer
    //   2806: getstatic Perryc.c : I
    //   2809: iflt -> 2823
    //   2812: ldc2_w -330828575
    //   2815: l2i
    //   2816: ldc_w 2064976322
    //   2819: ixor
    //   2820: goto -> 2831
    //   2823: ldc2_w 479369477
    //   2826: l2i
    //   2827: ldc_w -1277278023
    //   2830: ixor
    //   2831: ldc2_w -446325535
    //   2834: l2i
    //   2835: ldc_w 65079733
    //   2838: ixor
    //   2839: ixor
    //   2840: lookupswitch default -> 24164, 1237861608 -> 2868, 1909876855 -> 2823
    //   2868: goto -> 2872
    //   2871: athrow
    //   2872: invokevirtual intValue : ()I
    //   2875: goto -> 2879
    //   2878: athrow
    //   2879: ldc2_w 452620272
    //   2882: l2i
    //   2883: ldc_w 452620273
    //   2886: ixor
    //   2887: if_icmpne -> 2901
    //   2890: ldc2_w 1875582962
    //   2893: l2i
    //   2894: ldc_w 8472685
    //   2897: ixor
    //   2898: goto -> 2909
    //   2901: ldc2_w -40589113
    //   2904: l2i
    //   2905: ldc_w -1830879401
    //   2908: ixor
    //   2909: ldc2_w 343320645
    //   2912: l2i
    //   2913: ldc_w -8702179
    //   2916: ixor
    //   2917: ixor
    //   2918: tableswitch default -> 2890, -2075670329 -> 2940, -2075670328 -> 3143
    //   2940: getstatic Perryc.1 : I
    //   2943: ifeq -> 2957
    //   2946: ldc2_w -541737263
    //   2949: l2i
    //   2950: ldc_w -786678909
    //   2953: ixor
    //   2954: goto -> 2965
    //   2957: ldc2_w -990543907
    //   2960: l2i
    //   2961: ldc_w -928932548
    //   2964: ixor
    //   2965: ldc2_w 46799759
    //   2968: l2i
    //   2969: ldc_w -1615148087
    //   2972: ixor
    //   2973: ixor
    //   2974: lookupswitch default -> 3000, -1814473452 -> 23790, 1508926623 -> 2957
    //   3000: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   3003: getstatic Perryc.c : I
    //   3006: iflt -> 3020
    //   3009: ldc2_w -1602180060
    //   3012: l2i
    //   3013: ldc_w 2053867267
    //   3016: ixor
    //   3017: goto -> 3028
    //   3020: ldc2_w -1110740304
    //   3023: l2i
    //   3024: ldc_w -51127120
    //   3027: ixor
    //   3028: ldc2_w 54603751
    //   3031: l2i
    //   3032: ldc_w 2015760330
    //   3035: ixor
    //   3036: ixor
    //   3037: lookupswitch default -> 24158, -1584657654 -> 3020, 979340845 -> 3064
    //   3064: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3067: ldc_w 25.685438
    //   3070: invokestatic floatToIntBits : (F)I
    //   3073: ldc_w 2127880797
    //   3076: ixor
    //   3077: invokestatic intBitsToFloat : (I)F
    //   3080: getstatic Perryc.0 : I
    //   3083: ifle -> 3097
    //   3086: ldc2_w -1976008755
    //   3089: l2i
    //   3090: ldc_w 1690384203
    //   3093: ixor
    //   3094: goto -> 3105
    //   3097: ldc2_w 2127334363
    //   3100: l2i
    //   3101: ldc_w -696436529
    //   3104: ixor
    //   3105: ldc2_w 1413922561
    //   3108: l2i
    //   3109: ldc_w -1625945364
    //   3112: ixor
    //   3113: ixor
    //   3114: lookupswitch default -> 3140, 206442612 -> 3097, 631897451 -> 23768
    //   3140: putfield field_70138_W : F
    //   3143: getstatic Perryc.1 : I
    //   3146: ifeq -> 3160
    //   3149: ldc2_w 1202261004
    //   3152: l2i
    //   3153: ldc_w 1030390073
    //   3156: ixor
    //   3157: goto -> 3168
    //   3160: ldc2_w 1643232434
    //   3163: l2i
    //   3164: ldc_w -921938015
    //   3167: ixor
    //   3168: ldc2_w 169696371
    //   3171: l2i
    //   3172: ldc_w -424575688
    //   3175: ixor
    //   3176: ixor
    //   3177: lookupswitch default -> 3204, -1771066242 -> 24024, 1003625830 -> 3160
    //   3204: aload_0
    //   3205: getstatic Perryc.0 : I
    //   3208: ifle -> 3222
    //   3211: ldc2_w -380381253
    //   3214: l2i
    //   3215: ldc_w 2053647535
    //   3218: ixor
    //   3219: goto -> 3230
    //   3222: ldc2_w 25359639
    //   3225: l2i
    //   3226: ldc_w 1953433360
    //   3229: ixor
    //   3230: ldc2_w -1411311852
    //   3233: l2i
    //   3234: ldc_w 43372467
    //   3237: ixor
    //   3238: ixor
    //   3239: lookupswitch default -> 3264, -902321357 -> 3222, 978265011 -> 23564
    //   3264: getfield limiter2 : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3267: getstatic Perryc.c : I
    //   3270: iflt -> 3284
    //   3273: ldc2_w 802300595
    //   3276: l2i
    //   3277: ldc_w -1931498773
    //   3280: ixor
    //   3281: goto -> 3292
    //   3284: ldc2_w -430691234
    //   3287: l2i
    //   3288: ldc_w 633956295
    //   3291: ixor
    //   3292: ldc2_w 1456451354
    //   3295: l2i
    //   3296: ldc_w -2119894310
    //   3299: ixor
    //   3300: ixor
    //   3301: lookupswitch default -> 24136, 351673945 -> 3328, 1952898456 -> 3284
    //   3328: goto -> 3332
    //   3331: athrow
    //   3332: invokevirtual getValue : ()Ljava/lang/Object;
    //   3335: goto -> 3339
    //   3338: athrow
    //   3339: checkcast java/lang/Boolean
    //   3342: getstatic Perryc.c : I
    //   3345: iflt -> 3359
    //   3348: ldc2_w 1388802899
    //   3351: l2i
    //   3352: ldc_w -311017613
    //   3355: ixor
    //   3356: goto -> 3367
    //   3359: ldc2_w -803892920
    //   3362: l2i
    //   3363: ldc_w 137145553
    //   3366: ixor
    //   3367: ldc2_w 365401599
    //   3370: l2i
    //   3371: ldc_w -1124642027
    //   3374: ixor
    //   3375: ixor
    //   3376: lookupswitch default -> 3404, -1023150549 -> 3359, 377588426 -> 23910
    //   3404: goto -> 3408
    //   3407: athrow
    //   3408: invokevirtual booleanValue : ()Z
    //   3411: goto -> 3415
    //   3414: athrow
    //   3415: ifeq -> 3429
    //   3418: ldc2_w -1786561193
    //   3421: l2i
    //   3422: ldc_w 977996069
    //   3425: ixor
    //   3426: goto -> 3437
    //   3429: ldc2_w 236549575
    //   3432: l2i
    //   3433: ldc_w -1580121678
    //   3436: ixor
    //   3437: ldc2_w -571452382
    //   3440: l2i
    //   3441: ldc_w -1420754205
    //   3444: ixor
    //   3445: ixor
    //   3446: tableswitch default -> 3418, -647404877 -> 3468, -647404876 -> 4307
    //   3468: getstatic Perryc.c : I
    //   3471: iflt -> 3485
    //   3474: ldc2_w 1016635534
    //   3477: l2i
    //   3478: ldc_w 2138818151
    //   3481: ixor
    //   3482: goto -> 3493
    //   3485: ldc2_w 1458799112
    //   3488: l2i
    //   3489: ldc_w 858042575
    //   3492: ixor
    //   3493: ldc2_w 785170149
    //   3496: l2i
    //   3497: ldc_w -288400569
    //   3500: ixor
    //   3501: ixor
    //   3502: lookupswitch default -> 23940, -2082438325 -> 3485, -1512777883 -> 3528
    //   3528: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   3531: getstatic Perryc.0 : I
    //   3534: ifle -> 3548
    //   3537: ldc2_w -8832838
    //   3540: l2i
    //   3541: ldc_w 1556454424
    //   3544: ixor
    //   3545: goto -> 3556
    //   3548: ldc2_w 1834442314
    //   3551: l2i
    //   3552: ldc_w 2034219573
    //   3555: ixor
    //   3556: ldc2_w 1973650147
    //   3559: l2i
    //   3560: ldc_w 1574858256
    //   3563: ixor
    //   3564: ixor
    //   3565: lookupswitch default -> 3592, -1950267311 -> 24184, 1518107933 -> 3548
    //   3592: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3595: getstatic Perryc.0 : I
    //   3598: ifle -> 3612
    //   3601: ldc2_w 559834131
    //   3604: l2i
    //   3605: ldc_w 1411731407
    //   3608: ixor
    //   3609: goto -> 3620
    //   3612: ldc2_w -2106716464
    //   3615: l2i
    //   3616: ldc_w 622834091
    //   3619: ixor
    //   3620: ldc2_w 1654835055
    //   3623: l2i
    //   3624: ldc_w 1068708398
    //   3627: ixor
    //   3628: ixor
    //   3629: lookupswitch default -> 23936, -94352838 -> 3656, 678092445 -> 3612
    //   3656: getfield field_70122_E : Z
    //   3659: ifeq -> 3673
    //   3662: ldc2_w -1230431997
    //   3665: l2i
    //   3666: ldc_w 1672802678
    //   3669: ixor
    //   3670: goto -> 3681
    //   3673: ldc2_w -1148411771
    //   3676: l2i
    //   3677: ldc_w 1855015159
    //   3680: ixor
    //   3681: ldc2_w -1125740008
    //   3684: l2i
    //   3685: ldc_w -1488433546
    //   3688: ixor
    //   3689: ixor
    //   3690: tableswitch default -> 3662, -827116517 -> 3712, -827116516 -> 4307
    //   3712: getstatic Perryc.c : I
    //   3715: iflt -> 3729
    //   3718: ldc2_w 447267638
    //   3721: l2i
    //   3722: ldc_w -1501881211
    //   3725: ixor
    //   3726: goto -> 3737
    //   3729: ldc2_w -2011120989
    //   3732: l2i
    //   3733: ldc_w 1575330956
    //   3736: ixor
    //   3737: ldc2_w 877835432
    //   3740: l2i
    //   3741: ldc_w -1073530995
    //   3744: ixor
    //   3745: ixor
    //   3746: lookupswitch default -> 24110, 563387658 -> 3772, 1216502934 -> 3729
    //   3772: getstatic bigname/zprestige/webhack/WebHack.speedManager : Lbigname/zprestige/webhack/manager/SpeedManager;
    //   3775: getstatic Perryc.1 : I
    //   3778: ifeq -> 3792
    //   3781: ldc2_w -219432042
    //   3784: l2i
    //   3785: ldc_w 96260860
    //   3788: ixor
    //   3789: goto -> 3800
    //   3792: ldc2_w 103655461
    //   3795: l2i
    //   3796: ldc_w -77570984
    //   3799: ixor
    //   3800: ldc2_w 1775234332
    //   3803: l2i
    //   3804: ldc_w -1872506007
    //   3807: ixor
    //   3808: ixor
    //   3809: lookupswitch default -> 3836, 251352863 -> 24006, 1872436299 -> 3792
    //   3836: goto -> 3840
    //   3839: athrow
    //   3840: invokevirtual getSpeedKpH : ()D
    //   3843: goto -> 3847
    //   3846: athrow
    //   3847: getstatic Perryc.0 : I
    //   3850: ifle -> 3864
    //   3853: ldc2_w 642787021
    //   3856: l2i
    //   3857: ldc_w 312669824
    //   3860: ixor
    //   3861: goto -> 3872
    //   3864: ldc2_w 1952928004
    //   3867: l2i
    //   3868: ldc_w 1572247081
    //   3871: ixor
    //   3872: ldc2_w 852489944
    //   3875: l2i
    //   3876: ldc_w -1605761523
    //   3879: ixor
    //   3880: ixor
    //   3881: lookupswitch default -> 3908, -1502142312 -> 23678, 1352434260 -> 3864
    //   3908: aload_0
    //   3909: getstatic Perryc.1 : I
    //   3912: ifeq -> 3926
    //   3915: ldc2_w -661034495
    //   3918: l2i
    //   3919: ldc_w -760157779
    //   3922: ixor
    //   3923: goto -> 3934
    //   3926: ldc2_w 156886166
    //   3929: l2i
    //   3930: ldc_w 1318020796
    //   3933: ixor
    //   3934: ldc2_w -1175109193
    //   3937: l2i
    //   3938: ldc_w 822818042
    //   3941: ixor
    //   3942: ixor
    //   3943: lookupswitch default -> 23962, -2099775775 -> 3926, -819398809 -> 3968
    //   3968: getfield speedLimit2 : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3971: getstatic Perryc.c : I
    //   3974: iflt -> 3988
    //   3977: ldc2_w 478598527
    //   3980: l2i
    //   3981: ldc_w -1727453680
    //   3984: ixor
    //   3985: goto -> 3996
    //   3988: ldc2_w -1404702219
    //   3991: l2i
    //   3992: ldc_w -966148412
    //   3995: ixor
    //   3996: ldc2_w -1973101022
    //   3999: l2i
    //   4000: ldc_w -833425002
    //   4003: ixor
    //   4004: ixor
    //   4005: lookupswitch default -> 23722, -1044783909 -> 3988, 773480581 -> 4032
    //   4032: goto -> 4036
    //   4035: athrow
    //   4036: invokevirtual getValue : ()Ljava/lang/Object;
    //   4039: goto -> 4043
    //   4042: athrow
    //   4043: checkcast java/lang/Float
    //   4046: getstatic Perryc.1 : I
    //   4049: ifeq -> 4063
    //   4052: ldc2_w 1908542574
    //   4055: l2i
    //   4056: ldc_w 565881614
    //   4059: ixor
    //   4060: goto -> 4071
    //   4063: ldc2_w 1293576325
    //   4066: l2i
    //   4067: ldc_w -45540468
    //   4070: ixor
    //   4071: ldc2_w 723316243
    //   4074: l2i
    //   4075: ldc_w -635405934
    //   4078: ixor
    //   4079: ixor
    //   4080: lookupswitch default -> 23616, -1589366559 -> 4063, 1097852040 -> 4108
    //   4108: goto -> 4112
    //   4111: athrow
    //   4112: invokevirtual floatValue : ()F
    //   4115: goto -> 4119
    //   4118: athrow
    //   4119: f2d
    //   4120: dcmpg
    //   4121: ifge -> 4135
    //   4124: ldc2_w -527260532
    //   4127: l2i
    //   4128: ldc_w -1340565246
    //   4131: ixor
    //   4132: goto -> 4143
    //   4135: ldc2_w 1815462883
    //   4138: l2i
    //   4139: ldc_w 1019215470
    //   4142: ixor
    //   4143: ldc2_w 1623667940
    //   4146: l2i
    //   4147: ldc_w 320878259
    //   4150: ixor
    //   4151: ixor
    //   4152: tableswitch default -> 4124, 594362329 -> 4176, 594362330 -> 4307
    //   4176: getstatic Perryc.c : I
    //   4179: iflt -> 4193
    //   4182: ldc2_w -2027491646
    //   4185: l2i
    //   4186: ldc_w 749521095
    //   4189: ixor
    //   4190: goto -> 4201
    //   4193: ldc2_w -1679090409
    //   4196: l2i
    //   4197: ldc_w 283858804
    //   4200: ixor
    //   4201: ldc2_w 221223787
    //   4204: l2i
    //   4205: ldc_w 472296892
    //   4208: ixor
    //   4209: ixor
    //   4210: lookupswitch default -> 4236, -1165815598 -> 24116, 1466931921 -> 4193
    //   4236: aload_0
    //   4237: ldc2_w -1979005023
    //   4240: l2i
    //   4241: ldc_w -1979005021
    //   4244: ixor
    //   4245: getstatic Perryc.1 : I
    //   4248: ifeq -> 4262
    //   4251: ldc2_w -1843986907
    //   4254: l2i
    //   4255: ldc_w 23217111
    //   4258: ixor
    //   4259: goto -> 4270
    //   4262: ldc2_w -7044818
    //   4265: l2i
    //   4266: ldc_w 602293142
    //   4269: ixor
    //   4270: ldc2_w -585973732
    //   4273: l2i
    //   4274: ldc_w 1263092879
    //   4277: ixor
    //   4278: ixor
    //   4279: lookupswitch default -> 23820, 86980961 -> 4262, 1244218923 -> 4304
    //   4304: putfield stage : I
    //   4307: getstatic Perryc.1 : I
    //   4310: ifeq -> 4324
    //   4313: ldc2_w 581425768
    //   4316: l2i
    //   4317: ldc_w 182485805
    //   4320: ixor
    //   4321: goto -> 4332
    //   4324: ldc2_w -1752522373
    //   4327: l2i
    //   4328: ldc_w 2018938663
    //   4331: ixor
    //   4332: ldc2_w -2057791441
    //   4335: l2i
    //   4336: ldc_w 1478331884
    //   4339: ixor
    //   4340: ixor
    //   4341: lookupswitch default -> 4368, -1490027974 -> 4324, -184398714 -> 23960
    //   4368: aload_0
    //   4369: getstatic Perryc.c : I
    //   4372: iflt -> 4386
    //   4375: ldc2_w -375565327
    //   4378: l2i
    //   4379: ldc_w 1517157022
    //   4382: ixor
    //   4383: goto -> 4394
    //   4386: ldc2_w -314024870
    //   4389: l2i
    //   4390: ldc_w -1520944393
    //   4393: ixor
    //   4394: ldc2_w -960457996
    //   4397: l2i
    //   4398: ldc_w 25944883
    //   4401: ixor
    //   4402: ixor
    //   4403: lookupswitch default -> 4428, 1609050892 -> 4386, 1958467752 -> 23902
    //   4428: getfield limiter : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4431: getstatic Perryc.c : I
    //   4434: iflt -> 4448
    //   4437: ldc2_w 428795857
    //   4440: l2i
    //   4441: ldc_w 76349481
    //   4444: ixor
    //   4445: goto -> 4456
    //   4448: ldc2_w 197383149
    //   4451: l2i
    //   4452: ldc_w 1277510140
    //   4455: ixor
    //   4456: ldc2_w -2044108774
    //   4459: l2i
    //   4460: ldc_w 28480598
    //   4463: ixor
    //   4464: ixor
    //   4465: lookupswitch default -> 4492, -1701309516 -> 23922, 1217228221 -> 4448
    //   4492: goto -> 4496
    //   4495: athrow
    //   4496: invokevirtual getValue : ()Ljava/lang/Object;
    //   4499: goto -> 4503
    //   4502: athrow
    //   4503: checkcast java/lang/Boolean
    //   4506: getstatic Perryc.1 : I
    //   4509: ifeq -> 4523
    //   4512: ldc2_w 1263903566
    //   4515: l2i
    //   4516: ldc_w -1525727456
    //   4519: ixor
    //   4520: goto -> 4531
    //   4523: ldc2_w -833948330
    //   4526: l2i
    //   4527: ldc_w 272367068
    //   4530: ixor
    //   4531: ldc2_w 9660504
    //   4534: l2i
    //   4535: ldc_w -94916655
    //   4538: ixor
    //   4539: ixor
    //   4540: lookupswitch default -> 24166, 345922535 -> 4523, 615894787 -> 4568
    //   4568: goto -> 4572
    //   4571: athrow
    //   4572: invokevirtual booleanValue : ()Z
    //   4575: goto -> 4579
    //   4578: athrow
    //   4579: ifeq -> 4593
    //   4582: ldc2_w -868521194
    //   4585: l2i
    //   4586: ldc_w 1288829702
    //   4589: ixor
    //   4590: goto -> 4601
    //   4593: ldc2_w 206745536
    //   4596: l2i
    //   4597: ldc_w -1934082095
    //   4600: ixor
    //   4601: ldc2_w -1362642499
    //   4604: l2i
    //   4605: ldc_w 601443211
    //   4608: ixor
    //   4609: ixor
    //   4610: tableswitch default -> 4582, 234119718 -> 4632, 234119719 -> 8591
    //   4632: getstatic Perryc.1 : I
    //   4635: ifeq -> 4649
    //   4638: ldc2_w 1100810919
    //   4641: l2i
    //   4642: ldc_w 1264245149
    //   4645: ixor
    //   4646: goto -> 4657
    //   4649: ldc2_w -863110430
    //   4652: l2i
    //   4653: ldc_w -744046969
    //   4656: ixor
    //   4657: ldc2_w 1217079124
    //   4660: l2i
    //   4661: ldc_w -2031733857
    //   4664: ixor
    //   4665: ixor
    //   4666: lookupswitch default -> 24174, -995440655 -> 4649, -783920978 -> 4692
    //   4692: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   4695: getstatic Perryc.c : I
    //   4698: iflt -> 4712
    //   4701: ldc2_w -1905394165
    //   4704: l2i
    //   4705: ldc_w 1100784059
    //   4708: ixor
    //   4709: goto -> 4720
    //   4712: ldc2_w -1793129106
    //   4715: l2i
    //   4716: ldc_w 57088508
    //   4719: ixor
    //   4720: ldc2_w 1263561005
    //   4723: l2i
    //   4724: ldc_w 1846619224
    //   4727: ixor
    //   4728: ixor
    //   4729: lookupswitch default -> 4756, -357557563 -> 24048, -129625456 -> 4712
    //   4756: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4759: getstatic Perryc.1 : I
    //   4762: ifeq -> 4776
    //   4765: ldc2_w -213107329
    //   4768: l2i
    //   4769: ldc_w -566820305
    //   4772: ixor
    //   4773: goto -> 4784
    //   4776: ldc2_w -669263962
    //   4779: l2i
    //   4780: ldc_w -504575190
    //   4783: ixor
    //   4784: ldc2_w 4630934
    //   4787: l2i
    //   4788: ldc_w -1072789435
    //   4791: ixor
    //   4792: ixor
    //   4793: lookupswitch default -> 4820, -1876344594 -> 4776, -315416957 -> 23880
    //   4820: getfield field_70163_u : D
    //   4823: getstatic Perryc.1 : I
    //   4826: ifeq -> 4840
    //   4829: ldc2_w -710369601
    //   4832: l2i
    //   4833: ldc_w -1611605534
    //   4836: ixor
    //   4837: goto -> 4848
    //   4840: ldc2_w -444542380
    //   4843: l2i
    //   4844: ldc_w 624798513
    //   4847: ixor
    //   4848: ldc2_w 1828789047
    //   4851: l2i
    //   4852: ldc_w 43959628
    //   4855: ixor
    //   4856: ixor
    //   4857: lookupswitch default -> 4884, -166279312 -> 4840, 633837862 -> 23808
    //   4884: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   4887: getstatic Perryc.1 : I
    //   4890: ifeq -> 4904
    //   4893: ldc2_w -1475734679
    //   4896: l2i
    //   4897: ldc_w -949745687
    //   4900: ixor
    //   4901: goto -> 4912
    //   4904: ldc2_w -2129234930
    //   4907: l2i
    //   4908: ldc_w -627031570
    //   4911: ixor
    //   4912: ldc2_w -946302667
    //   4915: l2i
    //   4916: ldc_w 670564333
    //   4919: ixor
    //   4920: ixor
    //   4921: lookupswitch default -> 23852, -1895728552 -> 4904, -1143383240 -> 4948
    //   4948: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4951: getstatic Perryc.c : I
    //   4954: iflt -> 4968
    //   4957: ldc2_w -221929207
    //   4960: l2i
    //   4961: ldc_w 612510194
    //   4964: ixor
    //   4965: goto -> 4976
    //   4968: ldc2_w -555200797
    //   4971: l2i
    //   4972: ldc_w 844448444
    //   4975: ixor
    //   4976: ldc2_w 1295351473
    //   4979: l2i
    //   4980: ldc_w -2110270043
    //   4983: ixor
    //   4984: ixor
    //   4985: lookupswitch default -> 5012, 423961583 -> 23892, 1815582848 -> 4968
    //   5012: getfield field_70163_u : D
    //   5015: d2i
    //   5016: i2d
    //   5017: dsub
    //   5018: ldc2_w 1038475737
    //   5021: l2i
    //   5022: ldc_w 1038475738
    //   5025: ixor
    //   5026: getstatic Perryc.1 : I
    //   5029: ifeq -> 5043
    //   5032: ldc2_w 917195213
    //   5035: l2i
    //   5036: ldc_w 1163946208
    //   5039: ixor
    //   5040: goto -> 5051
    //   5043: ldc2_w -745178233
    //   5046: l2i
    //   5047: ldc_w -868570335
    //   5050: ixor
    //   5051: ldc2_w -1108963527
    //   5054: l2i
    //   5055: ldc_w -1167907476
    //   5058: ixor
    //   5059: ixor
    //   5060: lookupswitch default -> 5088, 1577457207 -> 5043, 1951304568 -> 23744
    //   5088: goto -> 5092
    //   5091: athrow
    //   5092: invokestatic round : (DI)D
    //   5095: goto -> 5099
    //   5098: athrow
    //   5099: getstatic Perryc.0 : I
    //   5102: ifle -> 5116
    //   5105: ldc2_w -1163857930
    //   5108: l2i
    //   5109: ldc_w 1175095821
    //   5112: ixor
    //   5113: goto -> 5124
    //   5116: ldc2_w -26489601
    //   5119: l2i
    //   5120: ldc_w -36831614
    //   5123: ixor
    //   5124: ldc2_w 1406799622
    //   5127: l2i
    //   5128: ldc_w 291262550
    //   5131: ixor
    //   5132: ixor
    //   5133: lookupswitch default -> 23854, -1104397653 -> 5116, 1092644141 -> 5160
    //   5160: aload_0
    //   5161: getstatic Perryc.1 : I
    //   5164: ifeq -> 5178
    //   5167: ldc2_w -1445271084
    //   5170: l2i
    //   5171: ldc_w -1845382324
    //   5174: ixor
    //   5175: goto -> 5186
    //   5178: ldc2_w -1099367149
    //   5181: l2i
    //   5182: ldc_w -397504359
    //   5185: ixor
    //   5186: ldc2_w -17475530
    //   5189: l2i
    //   5190: ldc_w 2094939174
    //   5193: ixor
    //   5194: ixor
    //   5195: lookupswitch default -> 5220, -2041179333 -> 5178, -1175437688 -> 24012
    //   5220: getfield setGroundLimit : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5223: getstatic Perryc.c : I
    //   5226: iflt -> 5240
    //   5229: ldc2_w -698577671
    //   5232: l2i
    //   5233: ldc_w 244772699
    //   5236: ixor
    //   5237: goto -> 5248
    //   5240: ldc2_w -1189634242
    //   5243: l2i
    //   5244: ldc_w -180564143
    //   5247: ixor
    //   5248: ldc2_w -184483372
    //   5251: l2i
    //   5252: ldc_w -461430689
    //   5255: ixor
    //   5256: ixor
    //   5257: lookupswitch default -> 24144, -910933463 -> 5240, 1565880804 -> 5284
    //   5284: goto -> 5288
    //   5287: athrow
    //   5288: invokevirtual getValue : ()Ljava/lang/Object;
    //   5291: goto -> 5295
    //   5294: athrow
    //   5295: checkcast java/lang/Integer
    //   5298: getstatic Perryc.0 : I
    //   5301: ifle -> 5315
    //   5304: ldc2_w -665984177
    //   5307: l2i
    //   5308: ldc_w 1627399989
    //   5311: ixor
    //   5312: goto -> 5323
    //   5315: ldc2_w 538445867
    //   5318: l2i
    //   5319: ldc_w -728661739
    //   5322: ixor
    //   5323: ldc2_w 1602722813
    //   5326: l2i
    //   5327: ldc_w -1299057054
    //   5330: ixor
    //   5331: ixor
    //   5332: lookupswitch default -> 5360, 221665018 -> 5315, 1415293413 -> 24078
    //   5360: goto -> 5364
    //   5363: athrow
    //   5364: invokevirtual intValue : ()I
    //   5367: goto -> 5371
    //   5370: athrow
    //   5371: i2d
    //   5372: ldc2_w 0.0021937649614524692
    //   5375: invokestatic doubleToLongBits : (D)J
    //   5378: ldc2_w 9218508521525948309
    //   5381: lxor
    //   5382: invokestatic longBitsToDouble : (J)D
    //   5385: ddiv
    //   5386: ldc2_w 913902898
    //   5389: l2i
    //   5390: ldc_w 913902897
    //   5393: ixor
    //   5394: getstatic Perryc.1 : I
    //   5397: ifeq -> 5411
    //   5400: ldc2_w 271531038
    //   5403: l2i
    //   5404: ldc_w 748887116
    //   5407: ixor
    //   5408: goto -> 5419
    //   5411: ldc2_w 2093981464
    //   5414: l2i
    //   5415: ldc_w -1060033280
    //   5418: ixor
    //   5419: ldc2_w -603086140
    //   5422: l2i
    //   5423: ldc_w -1085238097
    //   5426: ixor
    //   5427: ixor
    //   5428: lookupswitch default -> 5456, -1849184686 -> 5411, 1607538233 -> 24176
    //   5456: goto -> 5460
    //   5459: athrow
    //   5460: invokestatic round : (DI)D
    //   5463: goto -> 5467
    //   5466: athrow
    //   5467: dcmpl
    //   5468: ifne -> 5482
    //   5471: ldc2_w 1988346715
    //   5474: l2i
    //   5475: ldc_w 1869295868
    //   5478: ixor
    //   5479: goto -> 5490
    //   5482: ldc2_w -783990897
    //   5485: l2i
    //   5486: ldc_w -928134101
    //   5489: ixor
    //   5490: ldc2_w -1624547784
    //   5493: l2i
    //   5494: ldc_w -1122517154
    //   5497: ixor
    //   5498: ixor
    //   5499: tableswitch default -> 5471, 1003754177 -> 5520, 1003754178 -> 8591
    //   5520: getstatic Perryc.0 : I
    //   5523: ifle -> 5537
    //   5526: ldc2_w -1606687559
    //   5529: l2i
    //   5530: ldc_w 1374234115
    //   5533: ixor
    //   5534: goto -> 5545
    //   5537: ldc2_w 561591245
    //   5540: l2i
    //   5541: ldc_w -462119702
    //   5544: ixor
    //   5545: ldc2_w -1764244609
    //   5548: l2i
    //   5549: ldc_w -452429548
    //   5552: ixor
    //   5553: ixor
    //   5554: lookupswitch default -> 24152, -2113046319 -> 5537, -1227745972 -> 5580
    //   5580: aload_0
    //   5581: getstatic Perryc.1 : I
    //   5584: ifeq -> 5598
    //   5587: ldc2_w 1699358221
    //   5590: l2i
    //   5591: ldc_w -1666437482
    //   5594: ixor
    //   5595: goto -> 5606
    //   5598: ldc2_w 668546083
    //   5601: l2i
    //   5602: ldc_w -1158343551
    //   5605: ixor
    //   5606: ldc2_w 1419713860
    //   5609: l2i
    //   5610: ldc_w -1673323739
    //   5613: ixor
    //   5614: ixor
    //   5615: lookupswitch default -> 5640, -1028831468 -> 5598, 825888506 -> 23848
    //   5640: getfield setGroundNoLag : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5643: getstatic Perryc.1 : I
    //   5646: ifeq -> 5660
    //   5649: ldc2_w 408791080
    //   5652: l2i
    //   5653: ldc_w -946273699
    //   5656: ixor
    //   5657: goto -> 5668
    //   5660: ldc2_w 1126535226
    //   5663: l2i
    //   5664: ldc_w -1289823556
    //   5667: ixor
    //   5668: ldc2_w -150908170
    //   5671: l2i
    //   5672: ldc_w 4146871
    //   5675: ixor
    //   5676: ixor
    //   5677: lookupswitch default -> 24160, 117792455 -> 5704, 687521332 -> 5660
    //   5704: goto -> 5708
    //   5707: athrow
    //   5708: invokevirtual getValue : ()Ljava/lang/Object;
    //   5711: goto -> 5715
    //   5714: athrow
    //   5715: checkcast java/lang/Boolean
    //   5718: getstatic Perryc.1 : I
    //   5721: ifeq -> 5735
    //   5724: ldc2_w 1860047174
    //   5727: l2i
    //   5728: ldc_w 851690679
    //   5731: ixor
    //   5732: goto -> 5743
    //   5735: ldc2_w -448158089
    //   5738: l2i
    //   5739: ldc_w -473510301
    //   5742: ixor
    //   5743: ldc2_w 1228360495
    //   5746: l2i
    //   5747: ldc_w -2115090773
    //   5750: ixor
    //   5751: ixor
    //   5752: lookupswitch default -> 5780, -1799038859 -> 24150, 1389671944 -> 5735
    //   5780: goto -> 5784
    //   5783: athrow
    //   5784: invokevirtual booleanValue : ()Z
    //   5787: goto -> 5791
    //   5790: athrow
    //   5791: ifeq -> 5805
    //   5794: ldc2_w -1006147985
    //   5797: l2i
    //   5798: ldc_w -1383535474
    //   5801: ixor
    //   5802: goto -> 5813
    //   5805: ldc2_w -413758686
    //   5808: l2i
    //   5809: ldc_w -1898380836
    //   5812: ixor
    //   5813: ldc2_w 64024740
    //   5816: l2i
    //   5817: ldc_w 426159370
    //   5820: ixor
    //   5821: ixor
    //   5822: tableswitch default -> 5794, 1933170511 -> 5844, 1933170512 -> 6096
    //   5844: getstatic Perryc.1 : I
    //   5847: ifeq -> 5861
    //   5850: ldc2_w -641838407
    //   5853: l2i
    //   5854: ldc_w 1988542529
    //   5857: ixor
    //   5858: goto -> 5869
    //   5861: ldc2_w 219604783
    //   5864: l2i
    //   5865: ldc_w -2067494985
    //   5868: ixor
    //   5869: ldc2_w 608675098
    //   5872: l2i
    //   5873: ldc_w -145150780
    //   5876: ixor
    //   5877: ixor
    //   5878: lookupswitch default -> 5904, -1961229949 -> 5861, 2082872102 -> 23812
    //   5904: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   5907: getstatic Perryc.0 : I
    //   5910: ifle -> 5924
    //   5913: ldc2_w -1649208720
    //   5916: l2i
    //   5917: ldc_w -1933891360
    //   5920: ixor
    //   5921: goto -> 5932
    //   5924: ldc2_w -321209261
    //   5927: l2i
    //   5928: ldc_w 1588897904
    //   5931: ixor
    //   5932: ldc2_w -488242810
    //   5935: l2i
    //   5936: ldc_w 1636216430
    //   5939: ixor
    //   5940: ixor
    //   5941: lookupswitch default -> 23750, -1838639752 -> 5924, 823049163 -> 5968
    //   5968: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   5971: getstatic Perryc.c : I
    //   5974: iflt -> 5988
    //   5977: ldc2_w 1202506718
    //   5980: l2i
    //   5981: ldc_w 190220890
    //   5984: ixor
    //   5985: goto -> 5996
    //   5988: ldc2_w 396546294
    //   5991: l2i
    //   5992: ldc_w -750977366
    //   5995: ixor
    //   5996: ldc2_w -794413410
    //   5999: l2i
    //   6000: ldc_w 1512762968
    //   6003: ixor
    //   6004: ixor
    //   6005: lookupswitch default -> 23974, -965306046 -> 5988, 1309865626 -> 6032
    //   6032: goto -> 6036
    //   6035: athrow
    //   6036: invokestatic isEntityMoving : (Lnet/minecraft/entity/Entity;)Z
    //   6039: goto -> 6043
    //   6042: athrow
    //   6043: ifeq -> 6057
    //   6046: ldc2_w -1407044390
    //   6049: l2i
    //   6050: ldc_w -371863273
    //   6053: ixor
    //   6054: goto -> 6065
    //   6057: ldc2_w 1616473214
    //   6060: l2i
    //   6061: ldc_w 632195506
    //   6064: ixor
    //   6065: ldc2_w -1101170234
    //   6068: l2i
    //   6069: ldc_w -1169702391
    //   6072: ixor
    //   6073: ixor
    //   6074: tableswitch default -> 6046, 1106075138 -> 6096, 1106075139 -> 8591
    //   6096: getstatic Perryc.0 : I
    //   6099: ifle -> 6113
    //   6102: ldc2_w -1566480193
    //   6105: l2i
    //   6106: ldc_w -24787988
    //   6109: ixor
    //   6110: goto -> 6121
    //   6113: ldc2_w -367563001
    //   6116: l2i
    //   6117: ldc_w 2101860513
    //   6120: ixor
    //   6121: ldc2_w -911725642
    //   6124: l2i
    //   6125: ldc_w -78488472
    //   6128: ixor
    //   6129: ixor
    //   6130: lookupswitch default -> 6156, -1154170362 -> 6113, 1860099213 -> 23838
    //   6156: aload_0
    //   6157: getstatic Perryc.0 : I
    //   6160: ifle -> 6174
    //   6163: ldc2_w 1061901634
    //   6166: l2i
    //   6167: ldc_w 432565607
    //   6170: ixor
    //   6171: goto -> 6182
    //   6174: ldc2_w -126254530
    //   6177: l2i
    //   6178: ldc_w 1474061079
    //   6181: ixor
    //   6182: ldc2_w -2101982430
    //   6185: l2i
    //   6186: ldc_w -1038949225
    //   6189: ixor
    //   6190: ixor
    //   6191: lookupswitch default -> 23778, -285127012 -> 6216, 1713870736 -> 6174
    //   6216: getfield setNull : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6219: getstatic Perryc.c : I
    //   6222: iflt -> 6236
    //   6225: ldc2_w -1611232559
    //   6228: l2i
    //   6229: ldc_w -451150161
    //   6232: ixor
    //   6233: goto -> 6244
    //   6236: ldc2_w 1058372160
    //   6239: l2i
    //   6240: ldc_w -1273692176
    //   6243: ixor
    //   6244: ldc2_w -1470572133
    //   6247: l2i
    //   6248: ldc_w 596175989
    //   6251: ixor
    //   6252: ixor
    //   6253: lookupswitch default -> 6280, -247643760 -> 24112, 1866085358 -> 6236
    //   6280: goto -> 6284
    //   6283: athrow
    //   6284: invokevirtual getValue : ()Ljava/lang/Object;
    //   6287: goto -> 6291
    //   6290: athrow
    //   6291: checkcast java/lang/Boolean
    //   6294: getstatic Perryc.c : I
    //   6297: iflt -> 6311
    //   6300: ldc2_w 584647088
    //   6303: l2i
    //   6304: ldc_w -1723962728
    //   6307: ixor
    //   6308: goto -> 6319
    //   6311: ldc2_w 1098945168
    //   6314: l2i
    //   6315: ldc_w 1080006851
    //   6318: ixor
    //   6319: ldc2_w -1639820959
    //   6322: l2i
    //   6323: ldc_w -1976421964
    //   6326: ixor
    //   6327: ixor
    //   6328: lookupswitch default -> 24096, -1349055491 -> 6311, 363817606 -> 6356
    //   6356: goto -> 6360
    //   6359: athrow
    //   6360: invokevirtual booleanValue : ()Z
    //   6363: goto -> 6367
    //   6366: athrow
    //   6367: ifeq -> 6381
    //   6370: ldc2_w 1856541182
    //   6373: l2i
    //   6374: ldc_w -2023890948
    //   6377: ixor
    //   6378: goto -> 6389
    //   6381: ldc2_w -930356023
    //   6384: l2i
    //   6385: ldc_w 561949380
    //   6388: ixor
    //   6389: ldc2_w -168210600
    //   6392: l2i
    //   6393: ldc_w -1689805443
    //   6396: ixor
    //   6397: ixor
    //   6398: tableswitch default -> 6370, -2025087961 -> 6420, -2025087960 -> 6626
    //   6420: getstatic Perryc.0 : I
    //   6423: ifle -> 6437
    //   6426: ldc2_w 1925451676
    //   6429: l2i
    //   6430: ldc_w -287259149
    //   6433: ixor
    //   6434: goto -> 6445
    //   6437: ldc2_w 1204644497
    //   6440: l2i
    //   6441: ldc_w -1040774982
    //   6444: ixor
    //   6445: ldc2_w -1632933430
    //   6448: l2i
    //   6449: ldc_w 606789819
    //   6452: ixor
    //   6453: ixor
    //   6454: lookupswitch default -> 23822, 648364830 -> 6437, 1018948442 -> 6480
    //   6480: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   6483: getstatic Perryc.1 : I
    //   6486: ifeq -> 6500
    //   6489: ldc2_w 1151392231
    //   6492: l2i
    //   6493: ldc_w -1435575681
    //   6496: ixor
    //   6497: goto -> 6508
    //   6500: ldc2_w -1417875848
    //   6503: l2i
    //   6504: ldc_w -250006128
    //   6507: ixor
    //   6508: ldc2_w -1195365401
    //   6511: l2i
    //   6512: ldc_w -97237525
    //   6515: ixor
    //   6516: ixor
    //   6517: lookupswitch default -> 6544, -1405457004 -> 23932, -98648539 -> 6500
    //   6544: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6547: ldc2_w 1.2102449797116705E308
    //   6550: invokestatic doubleToLongBits : (D)J
    //   6553: ldc2_w 9215925074713158898
    //   6556: lxor
    //   6557: invokestatic longBitsToDouble : (J)D
    //   6560: getstatic Perryc.0 : I
    //   6563: ifle -> 6577
    //   6566: ldc2_w -122750220
    //   6569: l2i
    //   6570: ldc_w -1453169142
    //   6573: ixor
    //   6574: goto -> 6585
    //   6577: ldc2_w 123643724
    //   6580: l2i
    //   6581: ldc_w 1236527918
    //   6584: ixor
    //   6585: ldc2_w -689647848
    //   6588: l2i
    //   6589: ldc_w 1183370822
    //   6592: ixor
    //   6593: ixor
    //   6594: lookupswitch default -> 24122, -1046438496 -> 6577, -561951428 -> 6620
    //   6620: putfield field_70181_x : D
    //   6623: goto -> 8591
    //   6626: getstatic Perryc.0 : I
    //   6629: ifle -> 6643
    //   6632: ldc2_w 1085855703
    //   6635: l2i
    //   6636: ldc_w -324251882
    //   6639: ixor
    //   6640: goto -> 6651
    //   6643: ldc2_w -2010377388
    //   6646: l2i
    //   6647: ldc_w 1338020129
    //   6650: ixor
    //   6651: ldc2_w 978889742
    //   6654: l2i
    //   6655: ldc_w 1699094260
    //   6658: ixor
    //   6659: ixor
    //   6660: lookupswitch default -> 6688, -217437637 -> 23660, 1575614738 -> 6643
    //   6688: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   6691: getstatic Perryc.0 : I
    //   6694: ifle -> 6708
    //   6697: ldc2_w -53265754
    //   6700: l2i
    //   6701: ldc_w 394976164
    //   6704: ixor
    //   6705: goto -> 6716
    //   6708: ldc2_w -931998234
    //   6711: l2i
    //   6712: ldc_w -1664304238
    //   6715: ixor
    //   6716: ldc2_w -786970166
    //   6719: l2i
    //   6720: ldc_w -1169096290
    //   6723: ixor
    //   6724: ixor
    //   6725: lookupswitch default -> 23810, -2145441450 -> 6708, 1073260064 -> 6752
    //   6752: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6755: dup
    //   6756: getstatic Perryc.1 : I
    //   6759: ifeq -> 6773
    //   6762: ldc2_w 1432054436
    //   6765: l2i
    //   6766: ldc_w -960606316
    //   6769: ixor
    //   6770: goto -> 6781
    //   6773: ldc2_w -570066742
    //   6776: l2i
    //   6777: ldc_w -1292001530
    //   6780: ixor
    //   6781: ldc2_w 1090933419
    //   6784: l2i
    //   6785: ldc_w -370151329
    //   6788: ixor
    //   6789: ixor
    //   6790: lookupswitch default -> 6816, -1627022060 -> 6773, 990676932 -> 23632
    //   6816: getfield field_70181_x : D
    //   6819: getstatic Perryc.0 : I
    //   6822: ifle -> 6836
    //   6825: ldc2_w -445747349
    //   6828: l2i
    //   6829: ldc_w 2079552553
    //   6832: ixor
    //   6833: goto -> 6844
    //   6836: ldc2_w 844967410
    //   6839: l2i
    //   6840: ldc_w -2036681281
    //   6843: ixor
    //   6844: ldc2_w 771776580
    //   6847: l2i
    //   6848: ldc_w 2080824148
    //   6851: ixor
    //   6852: ixor
    //   6853: lookupswitch default -> 24162, -862216110 -> 6836, -423550115 -> 6880
    //   6880: aload_0
    //   6881: getstatic Perryc.1 : I
    //   6884: ifeq -> 6898
    //   6887: ldc2_w 1734280322
    //   6890: l2i
    //   6891: ldc_w -2101952585
    //   6894: ixor
    //   6895: goto -> 6906
    //   6898: ldc2_w -1702798372
    //   6901: l2i
    //   6902: ldc_w -560449200
    //   6905: ixor
    //   6906: ldc2_w 793093525
    //   6909: l2i
    //   6910: ldc_w -906191354
    //   6913: ixor
    //   6914: ixor
    //   6915: lookupswitch default -> 6940, 55607462 -> 23798, 1469986416 -> 6898
    //   6940: getfield groundFactor : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6943: getstatic Perryc.c : I
    //   6946: iflt -> 6960
    //   6949: ldc2_w -1349152496
    //   6952: l2i
    //   6953: ldc_w 1774246395
    //   6956: ixor
    //   6957: goto -> 6968
    //   6960: ldc2_w 25151781
    //   6963: l2i
    //   6964: ldc_w 612552826
    //   6967: ixor
    //   6968: ldc2_w -1541886015
    //   6971: l2i
    //   6972: ldc_w 167809779
    //   6975: ixor
    //   6976: ixor
    //   6977: lookupswitch default -> 23746, -1947917203 -> 7004, 1749906905 -> 6960
    //   7004: goto -> 7008
    //   7007: athrow
    //   7008: invokevirtual getValue : ()Ljava/lang/Object;
    //   7011: goto -> 7015
    //   7014: athrow
    //   7015: checkcast java/lang/Integer
    //   7018: getstatic Perryc.c : I
    //   7021: iflt -> 7035
    //   7024: ldc2_w 164185813
    //   7027: l2i
    //   7028: ldc_w -207203193
    //   7031: ixor
    //   7032: goto -> 7043
    //   7035: ldc2_w -900226860
    //   7038: l2i
    //   7039: ldc_w 994830452
    //   7042: ixor
    //   7043: ldc2_w -845600178
    //   7046: l2i
    //   7047: ldc_w -1973963239
    //   7050: ixor
    //   7051: ixor
    //   7052: lookupswitch default -> 23824, -1227696905 -> 7080, -1113485819 -> 7035
    //   7080: goto -> 7084
    //   7083: athrow
    //   7084: invokevirtual intValue : ()I
    //   7087: goto -> 7091
    //   7090: athrow
    //   7091: i2d
    //   7092: ldc2_w 0.08564335743510205
    //   7095: invokestatic doubleToLongBits : (D)J
    //   7098: ldc2_w 9218002817091742653
    //   7101: lxor
    //   7102: invokestatic longBitsToDouble : (J)D
    //   7105: ddiv
    //   7106: dsub
    //   7107: getstatic Perryc.0 : I
    //   7110: ifle -> 7124
    //   7113: ldc2_w -1704772879
    //   7116: l2i
    //   7117: ldc_w -1545308998
    //   7120: ixor
    //   7121: goto -> 7132
    //   7124: ldc2_w 1633363969
    //   7127: l2i
    //   7128: ldc_w 2101158298
    //   7131: ixor
    //   7132: ldc2_w 596009196
    //   7135: l2i
    //   7136: ldc_w 385577623
    //   7139: ixor
    //   7140: ixor
    //   7141: lookupswitch default -> 24056, 217734192 -> 7124, 689642464 -> 7168
    //   7168: putfield field_70181_x : D
    //   7171: getstatic Perryc.c : I
    //   7174: iflt -> 7188
    //   7177: ldc2_w -2069269534
    //   7180: l2i
    //   7181: ldc_w 492708194
    //   7184: ixor
    //   7185: goto -> 7196
    //   7188: ldc2_w 175850046
    //   7191: l2i
    //   7192: ldc_w 916476576
    //   7195: ixor
    //   7196: ldc2_w -52750830
    //   7199: l2i
    //   7200: ldc_w 807414232
    //   7203: ixor
    //   7204: ixor
    //   7205: lookupswitch default -> 23792, -266326188 -> 7232, 1426877770 -> 7188
    //   7232: aload_1
    //   7233: getstatic Perryc.0 : I
    //   7236: ifle -> 7250
    //   7239: ldc2_w 290647090
    //   7242: l2i
    //   7243: ldc_w -1960398298
    //   7246: ixor
    //   7247: goto -> 7258
    //   7250: ldc2_w -266739622
    //   7253: l2i
    //   7254: ldc_w -459845749
    //   7257: ixor
    //   7258: ldc2_w -1212978165
    //   7261: l2i
    //   7262: ldc_w -1501753838
    //   7265: ixor
    //   7266: ixor
    //   7267: lookupswitch default -> 7292, -1950729203 -> 24106, -1363750940 -> 7250
    //   7292: aload_1
    //   7293: getstatic Perryc.1 : I
    //   7296: ifeq -> 7310
    //   7299: ldc2_w -1133873012
    //   7302: l2i
    //   7303: ldc_w 862071351
    //   7306: ixor
    //   7307: goto -> 7318
    //   7310: ldc2_w -1752244207
    //   7313: l2i
    //   7314: ldc_w -1683059550
    //   7317: ixor
    //   7318: ldc2_w 1563163689
    //   7321: l2i
    //   7322: ldc_w 2056832861
    //   7325: ixor
    //   7326: ixor
    //   7327: lookupswitch default -> 7352, -1464112689 -> 23600, 2133453289 -> 7310
    //   7352: goto -> 7356
    //   7355: athrow
    //   7356: invokevirtual getY : ()D
    //   7359: goto -> 7363
    //   7362: athrow
    //   7363: getstatic Perryc.1 : I
    //   7366: ifeq -> 7380
    //   7369: ldc2_w 1086153851
    //   7372: l2i
    //   7373: ldc_w -2020614107
    //   7376: ixor
    //   7377: goto -> 7388
    //   7380: ldc2_w -1310026905
    //   7383: l2i
    //   7384: ldc_w 786849787
    //   7387: ixor
    //   7388: ldc2_w -363265887
    //   7391: l2i
    //   7392: ldc_w 1078266136
    //   7395: ixor
    //   7396: ixor
    //   7397: lookupswitch default -> 7424, -142013240 -> 7380, 1831767527 -> 24170
    //   7424: aload_0
    //   7425: getstatic Perryc.1 : I
    //   7428: ifeq -> 7442
    //   7431: ldc2_w -1020138003
    //   7434: l2i
    //   7435: ldc_w 10541688
    //   7438: ixor
    //   7439: goto -> 7450
    //   7442: ldc2_w 1791847049
    //   7445: l2i
    //   7446: ldc_w 1526731227
    //   7449: ixor
    //   7450: ldc2_w -1244337396
    //   7453: l2i
    //   7454: ldc_w 1324847402
    //   7457: ixor
    //   7458: ixor
    //   7459: lookupswitch default -> 23952, -890371724 -> 7484, 951209395 -> 7442
    //   7484: getfield groundFactor : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7487: getstatic Perryc.0 : I
    //   7490: ifle -> 7504
    //   7493: ldc2_w 1774226018
    //   7496: l2i
    //   7497: ldc_w -413879635
    //   7500: ixor
    //   7501: goto -> 7512
    //   7504: ldc2_w 677391824
    //   7507: l2i
    //   7508: ldc_w -1619834762
    //   7511: ixor
    //   7512: ldc2_w 155475705
    //   7515: l2i
    //   7516: ldc_w 860588774
    //   7519: ixor
    //   7520: ixor
    //   7521: lookupswitch default -> 23816, -1927499335 -> 7548, -1264849712 -> 7504
    //   7548: goto -> 7552
    //   7551: athrow
    //   7552: invokevirtual getValue : ()Ljava/lang/Object;
    //   7555: goto -> 7559
    //   7558: athrow
    //   7559: checkcast java/lang/Integer
    //   7562: getstatic Perryc.1 : I
    //   7565: ifeq -> 7579
    //   7568: ldc2_w 1103562646
    //   7571: l2i
    //   7572: ldc_w 966676936
    //   7575: ixor
    //   7576: goto -> 7587
    //   7579: ldc2_w -1802586892
    //   7582: l2i
    //   7583: ldc_w -1311372018
    //   7586: ixor
    //   7587: ldc2_w -1673538233
    //   7590: l2i
    //   7591: ldc_w -415036925
    //   7594: ixor
    //   7595: ixor
    //   7596: lookupswitch default -> 7624, 52791578 -> 23926, 2080702812 -> 7579
    //   7624: goto -> 7628
    //   7627: athrow
    //   7628: invokevirtual intValue : ()I
    //   7631: goto -> 7635
    //   7634: athrow
    //   7635: i2d
    //   7636: ldc2_w 0.010699173414349923
    //   7639: invokestatic doubleToLongBits : (D)J
    //   7642: ldc2_w 9213495616737729361
    //   7645: lxor
    //   7646: invokestatic longBitsToDouble : (J)D
    //   7649: ddiv
    //   7650: dsub
    //   7651: getstatic Perryc.1 : I
    //   7654: ifeq -> 7668
    //   7657: ldc2_w -1981780887
    //   7660: l2i
    //   7661: ldc_w 1030532558
    //   7664: ixor
    //   7665: goto -> 7676
    //   7668: ldc2_w -77706761
    //   7671: l2i
    //   7672: ldc_w 1601309022
    //   7675: ixor
    //   7676: ldc2_w -428992481
    //   7679: l2i
    //   7680: ldc_w -1665610982
    //   7683: ixor
    //   7684: ixor
    //   7685: lookupswitch default -> 7712, -1784027307 -> 7668, -832957790 -> 23998
    //   7712: goto -> 7716
    //   7715: athrow
    //   7716: invokevirtual setY : (D)V
    //   7719: goto -> 7723
    //   7722: athrow
    //   7723: getstatic Perryc.c : I
    //   7726: iflt -> 7740
    //   7729: ldc2_w -405504753
    //   7732: l2i
    //   7733: ldc_w -138640940
    //   7736: ixor
    //   7737: goto -> 7748
    //   7740: ldc2_w -1210348966
    //   7743: l2i
    //   7744: ldc_w -2134330393
    //   7747: ixor
    //   7748: ldc2_w 37410438
    //   7751: l2i
    //   7752: ldc_w -627090479
    //   7755: ixor
    //   7756: ixor
    //   7757: lookupswitch default -> 24044, -926060148 -> 7740, -273238806 -> 7784
    //   7784: aload_0
    //   7785: getstatic Perryc.c : I
    //   7788: iflt -> 7802
    //   7791: ldc2_w 831761171
    //   7794: l2i
    //   7795: ldc_w -294595962
    //   7798: ixor
    //   7799: goto -> 7810
    //   7802: ldc2_w 371996619
    //   7805: l2i
    //   7806: ldc_w 1203680520
    //   7809: ixor
    //   7810: ldc2_w -2011357591
    //   7813: l2i
    //   7814: ldc_w 1097706648
    //   7817: ixor
    //   7818: ixor
    //   7819: lookupswitch default -> 7844, 378784612 -> 23876, 550224102 -> 7802
    //   7844: getfield setPos : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7847: getstatic Perryc.0 : I
    //   7850: ifle -> 7864
    //   7853: ldc2_w 303397832
    //   7856: l2i
    //   7857: ldc_w -806032650
    //   7860: ixor
    //   7861: goto -> 7872
    //   7864: ldc2_w -1462305616
    //   7867: l2i
    //   7868: ldc_w -485197828
    //   7871: ixor
    //   7872: ldc2_w 337751380
    //   7875: l2i
    //   7876: ldc_w 70853437
    //   7879: ixor
    //   7880: ixor
    //   7881: lookupswitch default -> 7908, -839311529 -> 24058, 1125627193 -> 7864
    //   7908: goto -> 7912
    //   7911: athrow
    //   7912: invokevirtual getValue : ()Ljava/lang/Object;
    //   7915: goto -> 7919
    //   7918: athrow
    //   7919: checkcast java/lang/Boolean
    //   7922: getstatic Perryc.1 : I
    //   7925: ifeq -> 7939
    //   7928: ldc2_w 1902946045
    //   7931: l2i
    //   7932: ldc_w 1992913167
    //   7935: ixor
    //   7936: goto -> 7947
    //   7939: ldc2_w -1568429530
    //   7942: l2i
    //   7943: ldc_w -724660300
    //   7946: ixor
    //   7947: ldc2_w -520815865
    //   7950: l2i
    //   7951: ldc_w 327235356
    //   7954: ixor
    //   7955: ixor
    //   7956: lookupswitch default -> 23990, -2059867767 -> 7984, -187687959 -> 7939
    //   7984: goto -> 7988
    //   7987: athrow
    //   7988: invokevirtual booleanValue : ()Z
    //   7991: goto -> 7995
    //   7994: athrow
    //   7995: ifeq -> 8009
    //   7998: ldc2_w 129016126
    //   8001: l2i
    //   8002: ldc_w 1782522167
    //   8005: ixor
    //   8006: goto -> 8017
    //   8009: ldc2_w 1554445375
    //   8012: l2i
    //   8013: ldc_w 824800309
    //   8016: ixor
    //   8017: ldc2_w 1646349038
    //   8020: l2i
    //   8021: ldc_w -1775504242
    //   8024: ixor
    //   8025: ixor
    //   8026: tableswitch default -> 7998, -1719320983 -> 8048, -1719320982 -> 8591
    //   8048: getstatic Perryc.0 : I
    //   8051: ifle -> 8065
    //   8054: ldc2_w -1437502573
    //   8057: l2i
    //   8058: ldc_w -1313719214
    //   8061: ixor
    //   8062: goto -> 8073
    //   8065: ldc2_w -1250104555
    //   8068: l2i
    //   8069: ldc_w 1180422602
    //   8072: ixor
    //   8073: ldc2_w 1008811333
    //   8076: l2i
    //   8077: ldc_w -1006279654
    //   8080: ixor
    //   8081: ixor
    //   8082: lookupswitch default -> 24032, -473491810 -> 8065, 184771456 -> 8108
    //   8108: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   8111: getstatic Perryc.1 : I
    //   8114: ifeq -> 8128
    //   8117: ldc2_w 2015172959
    //   8120: l2i
    //   8121: ldc_w -179119040
    //   8124: ixor
    //   8125: goto -> 8136
    //   8128: ldc2_w -1993423367
    //   8131: l2i
    //   8132: ldc_w 2064076988
    //   8135: ixor
    //   8136: ldc2_w 1157594918
    //   8139: l2i
    //   8140: ldc_w -577990460
    //   8143: ixor
    //   8144: ixor
    //   8145: lookupswitch default -> 8172, 339487485 -> 23882, 1884468218 -> 8128
    //   8172: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   8175: dup
    //   8176: getstatic Perryc.0 : I
    //   8179: ifle -> 8193
    //   8182: ldc2_w 591100592
    //   8185: l2i
    //   8186: ldc_w -542604332
    //   8189: ixor
    //   8190: goto -> 8201
    //   8193: ldc2_w 1712566634
    //   8196: l2i
    //   8197: ldc_w -766977686
    //   8200: ixor
    //   8201: ldc2_w 1809010746
    //   8204: l2i
    //   8205: ldc_w -1790150939
    //   8208: ixor
    //   8209: ixor
    //   8210: lookupswitch default -> 23682, 34398139 -> 8193, 1254379231 -> 8236
    //   8236: getfield field_70163_u : D
    //   8239: getstatic Perryc.1 : I
    //   8242: ifeq -> 8256
    //   8245: ldc2_w 782109464
    //   8248: l2i
    //   8249: ldc_w 1435840287
    //   8252: ixor
    //   8253: goto -> 8264
    //   8256: ldc2_w 1036828874
    //   8259: l2i
    //   8260: ldc_w 1281997719
    //   8263: ixor
    //   8264: ldc2_w 1488157440
    //   8267: l2i
    //   8268: ldc_w -1368399482
    //   8271: ixor
    //   8272: ixor
    //   8273: lookupswitch default -> 8300, -1915240831 -> 23696, -519958502 -> 8256
    //   8300: aload_0
    //   8301: getstatic Perryc.c : I
    //   8304: iflt -> 8318
    //   8307: ldc2_w -1433074107
    //   8310: l2i
    //   8311: ldc_w -219054855
    //   8314: ixor
    //   8315: goto -> 8326
    //   8318: ldc2_w 786650579
    //   8321: l2i
    //   8322: ldc_w -1583276672
    //   8325: ixor
    //   8326: ldc2_w 1591706982
    //   8329: l2i
    //   8330: ldc_w 641886616
    //   8333: ixor
    //   8334: ixor
    //   8335: lookupswitch default -> 8360, 520438525 -> 8318, 553227842 -> 23606
    //   8360: getfield groundFactor : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8363: getstatic Perryc.0 : I
    //   8366: ifle -> 8380
    //   8369: ldc2_w -1027492085
    //   8372: l2i
    //   8373: ldc_w 1676983927
    //   8376: ixor
    //   8377: goto -> 8388
    //   8380: ldc2_w 1328117871
    //   8383: l2i
    //   8384: ldc_w 1262943343
    //   8387: ixor
    //   8388: ldc2_w -887487902
    //   8391: l2i
    //   8392: ldc_w -1732901557
    //   8395: ixor
    //   8396: ixor
    //   8397: lookupswitch default -> 8424, -224850347 -> 23898, 1415513989 -> 8380
    //   8424: goto -> 8428
    //   8427: athrow
    //   8428: invokevirtual getValue : ()Ljava/lang/Object;
    //   8431: goto -> 8435
    //   8434: athrow
    //   8435: checkcast java/lang/Integer
    //   8438: getstatic Perryc.c : I
    //   8441: iflt -> 8455
    //   8444: ldc2_w 614827608
    //   8447: l2i
    //   8448: ldc_w -1735951663
    //   8451: ixor
    //   8452: goto -> 8463
    //   8455: ldc2_w 437080888
    //   8458: l2i
    //   8459: ldc_w 225516213
    //   8462: ixor
    //   8463: ldc2_w 1027812063
    //   8466: l2i
    //   8467: ldc_w 798041998
    //   8470: ixor
    //   8471: ixor
    //   8472: lookupswitch default -> 8500, -1359941160 -> 24130, -177743767 -> 8455
    //   8500: goto -> 8504
    //   8503: athrow
    //   8504: invokevirtual intValue : ()I
    //   8507: goto -> 8511
    //   8510: athrow
    //   8511: i2d
    //   8512: ldc2_w 0.08251054578177451
    //   8515: invokestatic doubleToLongBits : (D)J
    //   8518: ldc2_w 9217777074221429887
    //   8521: lxor
    //   8522: invokestatic longBitsToDouble : (J)D
    //   8525: ddiv
    //   8526: dsub
    //   8527: getstatic Perryc.1 : I
    //   8530: ifeq -> 8544
    //   8533: ldc2_w -975639151
    //   8536: l2i
    //   8537: ldc_w 52270695
    //   8540: ixor
    //   8541: goto -> 8552
    //   8544: ldc2_w 2015165413
    //   8547: l2i
    //   8548: ldc_w 446712437
    //   8551: ixor
    //   8552: ldc2_w -1418478005
    //   8555: l2i
    //   8556: ldc_w -761121007
    //   8559: ixor
    //   8560: ixor
    //   8561: lookupswitch default -> 8588, -1201177459 -> 8544, -1089146196 -> 24050
    //   8588: putfield field_70163_u : D
    //   8591: getstatic Perryc.1 : I
    //   8594: ifeq -> 8608
    //   8597: ldc2_w -712373917
    //   8600: l2i
    //   8601: ldc_w -1051626290
    //   8604: ixor
    //   8605: goto -> 8616
    //   8608: ldc2_w -1251848390
    //   8611: l2i
    //   8612: ldc_w 622782841
    //   8615: ixor
    //   8616: ldc2_w -707778715
    //   8619: l2i
    //   8620: ldc_w 1214808696
    //   8623: ixor
    //   8624: ixor
    //   8625: lookupswitch default -> 23666, -1989945168 -> 8608, 230949726 -> 8652
    //   8652: aload_0
    //   8653: getstatic Perryc.1 : I
    //   8656: ifeq -> 8670
    //   8659: ldc2_w 155419041
    //   8662: l2i
    //   8663: ldc_w 103215178
    //   8666: ixor
    //   8667: goto -> 8678
    //   8670: ldc2_w -1173402094
    //   8673: l2i
    //   8674: ldc_w -363005112
    //   8677: ixor
    //   8678: ldc2_w 1825140170
    //   8681: l2i
    //   8682: ldc_w -662655376
    //   8685: ixor
    //   8686: ixor
    //   8687: lookupswitch default -> 8712, -1154698671 -> 24102, 2143035909 -> 8670
    //   8712: getfield stage : I
    //   8715: ldc2_w 1553919381
    //   8718: l2i
    //   8719: ldc_w 1553919380
    //   8722: ixor
    //   8723: if_icmpne -> 8737
    //   8726: ldc2_w -1255056665
    //   8729: l2i
    //   8730: ldc_w -869506023
    //   8733: ixor
    //   8734: goto -> 8745
    //   8737: ldc2_w 70594487
    //   8740: l2i
    //   8741: ldc_w 2099777864
    //   8744: ixor
    //   8745: ldc2_w 1367144171
    //   8748: l2i
    //   8749: ldc_w -179132587
    //   8752: ixor
    //   8753: ixor
    //   8754: tableswitch default -> 8726, -583831744 -> 8776, -583831743 -> 9378
    //   8776: getstatic Perryc.0 : I
    //   8779: ifle -> 8793
    //   8782: ldc2_w -1019237940
    //   8785: l2i
    //   8786: ldc_w 997322527
    //   8789: ixor
    //   8790: goto -> 8801
    //   8793: ldc2_w -399299217
    //   8796: l2i
    //   8797: ldc_w 1328506955
    //   8800: ixor
    //   8801: ldc2_w -1471001269
    //   8804: l2i
    //   8805: ldc_w -1540224279
    //   8808: ixor
    //   8809: ixor
    //   8810: lookupswitch default -> 23668, -1417936250 -> 8836, -198311567 -> 8793
    //   8836: goto -> 8840
    //   8839: athrow
    //   8840: invokestatic isMoving : ()Z
    //   8843: goto -> 8847
    //   8846: athrow
    //   8847: ifeq -> 8861
    //   8850: ldc2_w -237705348
    //   8853: l2i
    //   8854: ldc_w 1444289752
    //   8857: ixor
    //   8858: goto -> 8869
    //   8861: ldc2_w 408042470
    //   8864: l2i
    //   8865: ldc_w -1081032637
    //   8868: ixor
    //   8869: ldc2_w -151676338
    //   8872: l2i
    //   8873: ldc_w 2086747876
    //   8876: ixor
    //   8877: ixor
    //   8878: tableswitch default -> 8850, 760635150 -> 8900, 760635151 -> 9378
    //   8900: getstatic Perryc.0 : I
    //   8903: ifle -> 8917
    //   8906: ldc2_w -1997586727
    //   8909: l2i
    //   8910: ldc_w -2027293068
    //   8913: ixor
    //   8914: goto -> 8925
    //   8917: ldc2_w 101631174
    //   8920: l2i
    //   8921: ldc_w 1145097643
    //   8924: ixor
    //   8925: ldc2_w -694138670
    //   8928: l2i
    //   8929: ldc_w -1322519900
    //   8932: ixor
    //   8933: ixor
    //   8934: lookupswitch default -> 8960, -1817806943 -> 8917, 1749906139 -> 23706
    //   8960: aload_0
    //   8961: ldc2_w 448262410
    //   8964: l2i
    //   8965: ldc_w 448262408
    //   8968: ixor
    //   8969: getstatic Perryc.c : I
    //   8972: iflt -> 8986
    //   8975: ldc2_w 417207075
    //   8978: l2i
    //   8979: ldc_w -1290438802
    //   8982: ixor
    //   8983: goto -> 8994
    //   8986: ldc2_w 62626238
    //   8989: l2i
    //   8990: ldc_w -1361510082
    //   8993: ixor
    //   8994: ldc2_w -1871564671
    //   8997: l2i
    //   8998: ldc_w -852453128
    //   9001: ixor
    //   9002: ixor
    //   9003: lookupswitch default -> 9028, -158741452 -> 23730, 1797547398 -> 8986
    //   9028: putfield stage : I
    //   9031: getstatic Perryc.1 : I
    //   9034: ifeq -> 9048
    //   9037: ldc2_w 1365553096
    //   9040: l2i
    //   9041: ldc_w -1577370586
    //   9044: ixor
    //   9045: goto -> 9056
    //   9048: ldc2_w -604502460
    //   9051: l2i
    //   9052: ldc_w -68570987
    //   9055: ixor
    //   9056: ldc2_w -2121075031
    //   9059: l2i
    //   9060: ldc_w 796668382
    //   9063: ixor
    //   9064: ixor
    //   9065: lookupswitch default -> 9092, -276052534 -> 9048, 1584485529 -> 24022
    //   9092: aload_0
    //   9093: getstatic Perryc.1 : I
    //   9096: ifeq -> 9110
    //   9099: ldc2_w -815184297
    //   9102: l2i
    //   9103: ldc_w -314739621
    //   9106: ixor
    //   9107: goto -> 9118
    //   9110: ldc2_w 1583867771
    //   9113: l2i
    //   9114: ldc_w 28942115
    //   9117: ixor
    //   9118: ldc2_w 511861545
    //   9121: l2i
    //   9122: ldc_w -1549250261
    //   9125: ixor
    //   9126: ixor
    //   9127: lookupswitch default -> 23642, -1619132402 -> 9110, -487306662 -> 9152
    //   9152: aload_0
    //   9153: getstatic Perryc.0 : I
    //   9156: ifle -> 9170
    //   9159: ldc2_w -1303200463
    //   9162: l2i
    //   9163: ldc_w 2039386360
    //   9166: ixor
    //   9167: goto -> 9178
    //   9170: ldc2_w 1879353013
    //   9173: l2i
    //   9174: ldc_w -1005430175
    //   9177: ixor
    //   9178: ldc2_w -33493812
    //   9181: l2i
    //   9182: ldc_w 1084476587
    //   9185: ixor
    //   9186: ixor
    //   9187: lookupswitch default -> 9212, 1128199590 -> 9170, 1971260846 -> 23656
    //   9212: goto -> 9216
    //   9215: athrow
    //   9216: invokespecial getMultiplier : ()F
    //   9219: goto -> 9223
    //   9222: athrow
    //   9223: f2d
    //   9224: getstatic Perryc.0 : I
    //   9227: ifle -> 9241
    //   9230: ldc2_w -1554135920
    //   9233: l2i
    //   9234: ldc_w -101243401
    //   9237: ixor
    //   9238: goto -> 9249
    //   9241: ldc2_w 620108711
    //   9244: l2i
    //   9245: ldc_w 1990683961
    //   9248: ixor
    //   9249: ldc2_w -1716798878
    //   9252: l2i
    //   9253: ldc_w 1313972155
    //   9256: ixor
    //   9257: ixor
    //   9258: lookupswitch default -> 9284, -1924086594 -> 24148, 1305023000 -> 9241
    //   9284: goto -> 9288
    //   9287: athrow
    //   9288: invokestatic getBaseMoveSpeed : ()D
    //   9291: goto -> 9295
    //   9294: athrow
    //   9295: dmul
    //   9296: ldc2_w 84.26195066639204
    //   9299: invokestatic doubleToLongBits : (D)J
    //   9302: ldc2_w 9210259409544167445
    //   9305: lxor
    //   9306: invokestatic longBitsToDouble : (J)D
    //   9309: dsub
    //   9310: getstatic Perryc.1 : I
    //   9313: ifeq -> 9327
    //   9316: ldc2_w 1043206885
    //   9319: l2i
    //   9320: ldc_w 545676829
    //   9323: ixor
    //   9324: goto -> 9335
    //   9327: ldc2_w -1453804649
    //   9330: l2i
    //   9331: ldc_w -177657342
    //   9334: ixor
    //   9335: ldc2_w 962346980
    //   9338: l2i
    //   9339: ldc_w -1681238492
    //   9342: ixor
    //   9343: ixor
    //   9344: lookupswitch default -> 9372, -1622624632 -> 9327, -1136777928 -> 23596
    //   9372: putfield moveSpeed : D
    //   9375: goto -> 16635
    //   9378: getstatic Perryc.0 : I
    //   9381: ifle -> 9395
    //   9384: ldc2_w -860067681
    //   9387: l2i
    //   9388: ldc_w 2102986242
    //   9391: ixor
    //   9392: goto -> 9403
    //   9395: ldc2_w -2143199261
    //   9398: l2i
    //   9399: ldc_w 728129044
    //   9402: ixor
    //   9403: ldc2_w 558987482
    //   9406: l2i
    //   9407: ldc_w 904814554
    //   9410: ixor
    //   9411: ixor
    //   9412: lookupswitch default -> 9440, -1520809571 -> 23978, 479723012 -> 9395
    //   9440: aload_0
    //   9441: getstatic Perryc.0 : I
    //   9444: ifle -> 9458
    //   9447: ldc2_w 1173374130
    //   9450: l2i
    //   9451: ldc_w -1054541233
    //   9454: ixor
    //   9455: goto -> 9466
    //   9458: ldc2_w -1835953949
    //   9461: l2i
    //   9462: ldc_w -1094202462
    //   9465: ixor
    //   9466: ldc2_w -38713958
    //   9469: l2i
    //   9470: ldc_w 432039183
    //   9473: ixor
    //   9474: ixor
    //   9475: lookupswitch default -> 9500, 788970782 -> 9458, 1621466728 -> 23992
    //   9500: getfield stage : I
    //   9503: ldc2_w -737041141
    //   9506: l2i
    //   9507: ldc_w -737041143
    //   9510: ixor
    //   9511: if_icmpne -> 9525
    //   9514: ldc2_w 787249406
    //   9517: l2i
    //   9518: ldc_w 398934405
    //   9521: ixor
    //   9522: goto -> 9533
    //   9525: ldc2_w 1341614461
    //   9528: l2i
    //   9529: ldc_w 1994149895
    //   9532: ixor
    //   9533: ldc2_w -1396461139
    //   9536: l2i
    //   9537: ldc_w -969725550
    //   9540: ixor
    //   9541: ixor
    //   9542: tableswitch default -> 9514, 1406902596 -> 9564, 1406902597 -> 12254
    //   9564: getstatic Perryc.0 : I
    //   9567: ifle -> 9581
    //   9570: ldc2_w 347177256
    //   9573: l2i
    //   9574: ldc_w -660887678
    //   9577: ixor
    //   9578: goto -> 9589
    //   9581: ldc2_w -1968152797
    //   9584: l2i
    //   9585: ldc_w -280538123
    //   9588: ixor
    //   9589: ldc2_w 235375401
    //   9592: l2i
    //   9593: ldc_w 2048528879
    //   9596: ixor
    //   9597: ixor
    //   9598: lookupswitch default -> 24140, -1204306836 -> 9581, 300586512 -> 9624
    //   9624: goto -> 9628
    //   9627: athrow
    //   9628: invokestatic isMoving : ()Z
    //   9631: goto -> 9635
    //   9634: athrow
    //   9635: ifeq -> 9649
    //   9638: ldc2_w 1611398941
    //   9641: l2i
    //   9642: ldc_w 1281605233
    //   9645: ixor
    //   9646: goto -> 9657
    //   9649: ldc2_w 1123197226
    //   9652: l2i
    //   9653: ldc_w 1855643717
    //   9656: ixor
    //   9657: ldc2_w -2019111489
    //   9660: l2i
    //   9661: ldc_w -323611270
    //   9664: ixor
    //   9665: ixor
    //   9666: tableswitch default -> 9638, 1199085993 -> 9688, 1199085994 -> 12254
    //   9688: getstatic Perryc.0 : I
    //   9691: ifle -> 9705
    //   9694: ldc2_w 1239711089
    //   9697: l2i
    //   9698: ldc_w 1108556228
    //   9701: ixor
    //   9702: goto -> 9713
    //   9705: ldc2_w -534523021
    //   9708: l2i
    //   9709: ldc_w 343096211
    //   9712: ixor
    //   9713: ldc2_w -820938539
    //   9716: l2i
    //   9717: ldc_w -1893061890
    //   9720: ixor
    //   9721: ixor
    //   9722: lookupswitch default -> 23592, -1268008245 -> 9748, 1271666334 -> 9705
    //   9748: aload_0
    //   9749: ldc2_w 568774248
    //   9752: l2i
    //   9753: ldc_w 568774251
    //   9756: ixor
    //   9757: getstatic Perryc.c : I
    //   9760: iflt -> 9774
    //   9763: ldc2_w -939249668
    //   9766: l2i
    //   9767: ldc_w -310740050
    //   9770: ixor
    //   9771: goto -> 9782
    //   9774: ldc2_w -1318292822
    //   9777: l2i
    //   9778: ldc_w -1288956528
    //   9781: ixor
    //   9782: ldc2_w 42587411
    //   9785: l2i
    //   9786: ldc_w -1786337164
    //   9789: ixor
    //   9790: ixor
    //   9791: lookupswitch default -> 9816, -1301206731 -> 23708, 11957462 -> 9774
    //   9816: putfield stage : I
    //   9819: getstatic Perryc.0 : I
    //   9822: ifle -> 9836
    //   9825: ldc2_w 1667426491
    //   9828: l2i
    //   9829: ldc_w 516629801
    //   9832: ixor
    //   9833: goto -> 9844
    //   9836: ldc2_w 1813444134
    //   9839: l2i
    //   9840: ldc_w 605877896
    //   9843: ixor
    //   9844: ldc2_w -648453079
    //   9847: l2i
    //   9848: ldc_w 731789698
    //   9851: ixor
    //   9852: ixor
    //   9853: lookupswitch default -> 9880, -1888579527 -> 23620, -1515773952 -> 9836
    //   9880: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   9883: getstatic Perryc.1 : I
    //   9886: ifeq -> 9900
    //   9889: ldc2_w -1940454267
    //   9892: l2i
    //   9893: ldc_w 1284330602
    //   9896: ixor
    //   9897: goto -> 9908
    //   9900: ldc2_w -1927381682
    //   9903: l2i
    //   9904: ldc_w 1515867226
    //   9907: ixor
    //   9908: ldc2_w -415578000
    //   9911: l2i
    //   9912: ldc_w -208498001
    //   9915: ixor
    //   9916: ixor
    //   9917: lookupswitch default -> 9944, -2100886365 -> 9900, -730723792 -> 23628
    //   9944: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   9947: getstatic Perryc.0 : I
    //   9950: ifle -> 9964
    //   9953: ldc2_w 39431137
    //   9956: l2i
    //   9957: ldc_w -1736356754
    //   9960: ixor
    //   9961: goto -> 9972
    //   9964: ldc2_w 968766356
    //   9967: l2i
    //   9968: ldc_w -855163006
    //   9971: ixor
    //   9972: ldc2_w -450624619
    //   9975: l2i
    //   9976: ldc_w 1991136836
    //   9979: ixor
    //   9980: ixor
    //   9981: lookupswitch default -> 23964, 156414558 -> 9964, 1731418567 -> 10008
    //   10008: aload_0
    //   10009: getstatic Perryc.0 : I
    //   10012: ifle -> 10026
    //   10015: ldc2_w -1812911995
    //   10018: l2i
    //   10019: ldc_w 1297056606
    //   10022: ixor
    //   10023: goto -> 10034
    //   10026: ldc2_w 343404176
    //   10029: l2i
    //   10030: ldc_w -132651691
    //   10033: ixor
    //   10034: ldc2_w -1269900033
    //   10037: l2i
    //   10038: ldc_w 855839822
    //   10041: ixor
    //   10042: ixor
    //   10043: lookupswitch default -> 10068, -1114655264 -> 10026, 1509122922 -> 23690
    //   10068: getfield yOffset : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10071: getstatic Perryc.c : I
    //   10074: iflt -> 10088
    //   10077: ldc2_w -681753957
    //   10080: l2i
    //   10081: ldc_w -2113993562
    //   10084: ixor
    //   10085: goto -> 10096
    //   10088: ldc2_w 1754096220
    //   10091: l2i
    //   10092: ldc_w 2084872916
    //   10095: ixor
    //   10096: ldc2_w 1202068773
    //   10099: l2i
    //   10100: ldc_w -177497538
    //   10103: ixor
    //   10104: ixor
    //   10105: lookupswitch default -> 10132, -462438106 -> 23980, 1651192400 -> 10088
    //   10132: goto -> 10136
    //   10135: athrow
    //   10136: invokevirtual getValue : ()Ljava/lang/Object;
    //   10139: goto -> 10143
    //   10142: athrow
    //   10143: checkcast java/lang/Integer
    //   10146: getstatic Perryc.c : I
    //   10149: iflt -> 10163
    //   10152: ldc2_w -756570062
    //   10155: l2i
    //   10156: ldc_w -1414887015
    //   10159: ixor
    //   10160: goto -> 10171
    //   10163: ldc2_w -2076416862
    //   10166: l2i
    //   10167: ldc_w -1734224189
    //   10170: ixor
    //   10171: ldc2_w 1806690619
    //   10174: l2i
    //   10175: ldc_w 1414615922
    //   10178: ixor
    //   10179: ixor
    //   10180: lookupswitch default -> 10208, 1026437020 -> 10163, 1186175970 -> 23904
    //   10208: goto -> 10212
    //   10211: athrow
    //   10212: invokevirtual intValue : ()I
    //   10215: goto -> 10219
    //   10218: athrow
    //   10219: i2d
    //   10220: ldc2_w 0.0015359676929899582
    //   10223: invokestatic doubleToLongBits : (D)J
    //   10226: ldc2_w 9211666982893857481
    //   10229: lxor
    //   10230: invokestatic longBitsToDouble : (J)D
    //   10233: ddiv
    //   10234: getstatic Perryc.c : I
    //   10237: iflt -> 10251
    //   10240: ldc2_w 524262882
    //   10243: l2i
    //   10244: ldc_w 1589317839
    //   10247: ixor
    //   10248: goto -> 10259
    //   10251: ldc2_w 705475282
    //   10254: l2i
    //   10255: ldc_w -2009665436
    //   10258: ixor
    //   10259: ldc2_w -1009091409
    //   10262: l2i
    //   10263: ldc_w -1669244568
    //   10266: ixor
    //   10267: ixor
    //   10268: lookupswitch default -> 23752, -43948175 -> 10296, 517974250 -> 10251
    //   10296: putfield field_70181_x : D
    //   10299: getstatic Perryc.c : I
    //   10302: iflt -> 10316
    //   10305: ldc2_w 2006880147
    //   10308: l2i
    //   10309: ldc_w -1588932599
    //   10312: ixor
    //   10313: goto -> 10324
    //   10316: ldc2_w 1148328282
    //   10319: l2i
    //   10320: ldc_w -1101580197
    //   10323: ixor
    //   10324: ldc2_w 498513069
    //   10327: l2i
    //   10328: ldc_w 1588156206
    //   10331: ixor
    //   10332: ixor
    //   10333: lookupswitch default -> 23740, -1781810151 -> 10316, -1187331454 -> 10360
    //   10360: aload_1
    //   10361: getstatic Perryc.0 : I
    //   10364: ifle -> 10378
    //   10367: ldc2_w 1335748823
    //   10370: l2i
    //   10371: ldc_w -1741155676
    //   10374: ixor
    //   10375: goto -> 10386
    //   10378: ldc2_w -946026132
    //   10381: l2i
    //   10382: ldc_w 596258337
    //   10385: ixor
    //   10386: ldc2_w -444119653
    //   10389: l2i
    //   10390: ldc_w 1090101547
    //   10393: ixor
    //   10394: ixor
    //   10395: lookupswitch default -> 10420, -1339696317 -> 10378, 1926962883 -> 23636
    //   10420: aload_0
    //   10421: getstatic Perryc.0 : I
    //   10424: ifle -> 10438
    //   10427: ldc2_w -977339105
    //   10430: l2i
    //   10431: ldc_w -379436914
    //   10434: ixor
    //   10435: goto -> 10446
    //   10438: ldc2_w 1730091702
    //   10441: l2i
    //   10442: ldc_w -278563546
    //   10445: ixor
    //   10446: ldc2_w 454624226
    //   10449: l2i
    //   10450: ldc_w 1900698830
    //   10453: ixor
    //   10454: ixor
    //   10455: lookupswitch default -> 23896, -500617028 -> 10480, 1183834813 -> 10438
    //   10480: getfield yOffset : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10483: getstatic Perryc.1 : I
    //   10486: ifeq -> 10500
    //   10489: ldc2_w 83679382
    //   10492: l2i
    //   10493: ldc_w -1003031932
    //   10496: ixor
    //   10497: goto -> 10508
    //   10500: ldc2_w 303149037
    //   10503: l2i
    //   10504: ldc_w -197674287
    //   10507: ixor
    //   10508: ldc2_w -1536498766
    //   10511: l2i
    //   10512: ldc_w -1362241524
    //   10515: ixor
    //   10516: ixor
    //   10517: lookupswitch default -> 10544, -898821716 -> 23692, 1775326401 -> 10500
    //   10544: goto -> 10548
    //   10547: athrow
    //   10548: invokevirtual getValue : ()Ljava/lang/Object;
    //   10551: goto -> 10555
    //   10554: athrow
    //   10555: checkcast java/lang/Integer
    //   10558: getstatic Perryc.c : I
    //   10561: iflt -> 10575
    //   10564: ldc2_w 1535901947
    //   10567: l2i
    //   10568: ldc_w 1554721831
    //   10571: ixor
    //   10572: goto -> 10583
    //   10575: ldc2_w 1458552379
    //   10578: l2i
    //   10579: ldc_w 806722784
    //   10582: ixor
    //   10583: ldc2_w 370181063
    //   10586: l2i
    //   10587: ldc_w 1703773460
    //   10590: ixor
    //   10591: ixor
    //   10592: lookupswitch default -> 23742, 359080968 -> 10620, 1958357519 -> 10575
    //   10620: goto -> 10624
    //   10623: athrow
    //   10624: invokevirtual intValue : ()I
    //   10627: goto -> 10631
    //   10630: athrow
    //   10631: i2d
    //   10632: ldc2_w 0.002150060231104376
    //   10635: invokestatic doubleToLongBits : (D)J
    //   10638: ldc2_w 9218548482767360917
    //   10641: lxor
    //   10642: invokestatic longBitsToDouble : (J)D
    //   10645: ddiv
    //   10646: getstatic Perryc.c : I
    //   10649: iflt -> 10663
    //   10652: ldc2_w -1051718591
    //   10655: l2i
    //   10656: ldc_w -1019493267
    //   10659: ixor
    //   10660: goto -> 10671
    //   10663: ldc2_w -430871940
    //   10666: l2i
    //   10667: ldc_w 169915504
    //   10670: ixor
    //   10671: ldc2_w 205758724
    //   10674: l2i
    //   10675: ldc_w -505453574
    //   10678: ixor
    //   10679: ixor
    //   10680: lookupswitch default -> 24118, -269022510 -> 10663, 32316658 -> 10708
    //   10708: goto -> 10712
    //   10711: athrow
    //   10712: invokevirtual setY : (D)V
    //   10715: goto -> 10719
    //   10718: athrow
    //   10719: getstatic Perryc.1 : I
    //   10722: ifeq -> 10736
    //   10725: ldc2_w -1907589290
    //   10728: l2i
    //   10729: ldc_w -572407334
    //   10732: ixor
    //   10733: goto -> 10744
    //   10736: ldc2_w 695104735
    //   10739: l2i
    //   10740: ldc_w 1648735527
    //   10743: ixor
    //   10744: ldc2_w -102485608
    //   10747: l2i
    //   10748: ldc_w -1062210198
    //   10751: ixor
    //   10752: ixor
    //   10753: lookupswitch default -> 23650, 1793489534 -> 10736, 1918895370 -> 10780
    //   10780: aload_0
    //   10781: getstatic Perryc.c : I
    //   10784: iflt -> 10798
    //   10787: ldc2_w -1976074538
    //   10790: l2i
    //   10791: ldc_w 2005576894
    //   10794: ixor
    //   10795: goto -> 10806
    //   10798: ldc2_w 1853148743
    //   10801: l2i
    //   10802: ldc_w 531382106
    //   10805: ixor
    //   10806: ldc2_w -1944255223
    //   10809: l2i
    //   10810: ldc_w -1681519962
    //   10813: ixor
    //   10814: ixor
    //   10815: lookupswitch default -> 23716, -362357305 -> 10798, 1711537842 -> 10840
    //   10840: getfield cooldownHops : I
    //   10843: ifle -> 10857
    //   10846: ldc2_w -653011479
    //   10849: l2i
    //   10850: ldc_w -1677219676
    //   10853: ixor
    //   10854: goto -> 10865
    //   10857: ldc2_w 1004625415
    //   10860: l2i
    //   10861: ldc_w 2129994571
    //   10864: ixor
    //   10865: ldc2_w -1555698336
    //   10868: l2i
    //   10869: ldc_w -445252915
    //   10872: ixor
    //   10873: ixor
    //   10874: tableswitch default -> 10846, 52718304 -> 10896, 52718305 -> 11095
    //   10896: getstatic Perryc.c : I
    //   10899: iflt -> 10913
    //   10902: ldc2_w 529141845
    //   10905: l2i
    //   10906: ldc_w -686900119
    //   10909: ixor
    //   10910: goto -> 10921
    //   10913: ldc2_w 331910091
    //   10916: l2i
    //   10917: ldc_w -1312794932
    //   10920: ixor
    //   10921: ldc2_w -2072627487
    //   10924: l2i
    //   10925: ldc_w -750574191
    //   10928: ixor
    //   10929: ixor
    //   10930: lookupswitch default -> 10956, -1615741108 -> 23574, 1018203900 -> 10913
    //   10956: aload_0
    //   10957: dup
    //   10958: getstatic Perryc.1 : I
    //   10961: ifeq -> 10975
    //   10964: ldc2_w 119424772
    //   10967: l2i
    //   10968: ldc_w 121293906
    //   10971: ixor
    //   10972: goto -> 10983
    //   10975: ldc2_w -827958956
    //   10978: l2i
    //   10979: ldc_w -2055052277
    //   10982: ixor
    //   10983: ldc2_w -145348131
    //   10986: l2i
    //   10987: ldc_w -1070844583
    //   10990: ixor
    //   10991: ixor
    //   10992: lookupswitch default -> 23582, 928946130 -> 10975, 2086543835 -> 11020
    //   11020: getfield cooldownHops : I
    //   11023: ldc2_w -186023519
    //   11026: l2i
    //   11027: ldc_w -186023520
    //   11030: ixor
    //   11031: isub
    //   11032: getstatic Perryc.0 : I
    //   11035: ifle -> 11049
    //   11038: ldc2_w -2059737262
    //   11041: l2i
    //   11042: ldc_w 360568260
    //   11045: ixor
    //   11046: goto -> 11057
    //   11049: ldc2_w -2146208332
    //   11052: l2i
    //   11053: ldc_w 1637908541
    //   11056: ixor
    //   11057: ldc2_w 298378576
    //   11060: l2i
    //   11061: ldc_w -2030317067
    //   11064: ixor
    //   11065: ixor
    //   11066: lookupswitch default -> 11092, -63420579 -> 11049, 125044275 -> 23884
    //   11092: putfield cooldownHops : I
    //   11095: getstatic Perryc.0 : I
    //   11098: ifle -> 11112
    //   11101: ldc2_w -1758557214
    //   11104: l2i
    //   11105: ldc_w 422476650
    //   11108: ixor
    //   11109: goto -> 11120
    //   11112: ldc2_w -1386668704
    //   11115: l2i
    //   11116: ldc_w -1957640936
    //   11119: ixor
    //   11120: ldc2_w 841372903
    //   11123: l2i
    //   11124: ldc_w 2088549389
    //   11127: ixor
    //   11128: ixor
    //   11129: lookupswitch default -> 11156, -1260460209 -> 11112, -1067837342 -> 23760
    //   11156: aload_0
    //   11157: dup
    //   11158: getstatic Perryc.0 : I
    //   11161: ifle -> 11175
    //   11164: ldc2_w -204115331
    //   11167: l2i
    //   11168: ldc_w 245734490
    //   11171: ixor
    //   11172: goto -> 11183
    //   11175: ldc2_w 1688278143
    //   11178: l2i
    //   11179: ldc_w -1772011194
    //   11182: ixor
    //   11183: ldc2_w 578408993
    //   11186: l2i
    //   11187: ldc_w -716526217
    //   11190: ixor
    //   11191: ixor
    //   11192: lookupswitch default -> 24026, 99822191 -> 11220, 172200305 -> 11175
    //   11220: getfield hops : I
    //   11223: ldc2_w -1537707113
    //   11226: l2i
    //   11227: ldc_w -1537707114
    //   11230: ixor
    //   11231: iadd
    //   11232: getstatic Perryc.0 : I
    //   11235: ifle -> 11249
    //   11238: ldc2_w -1232508589
    //   11241: l2i
    //   11242: ldc_w -1117663081
    //   11245: ixor
    //   11246: goto -> 11257
    //   11249: ldc2_w 219332537
    //   11252: l2i
    //   11253: ldc_w -191145700
    //   11256: ixor
    //   11257: ldc2_w -1350441074
    //   11260: l2i
    //   11261: ldc_w -1372620935
    //   11264: ixor
    //   11265: ixor
    //   11266: lookupswitch default -> 11292, 172370227 -> 24052, 310675425 -> 11249
    //   11292: putfield hops : I
    //   11295: getstatic Perryc.1 : I
    //   11298: ifeq -> 11312
    //   11301: ldc2_w 1787740333
    //   11304: l2i
    //   11305: ldc_w -992931566
    //   11308: ixor
    //   11309: goto -> 11320
    //   11312: ldc2_w -1803774614
    //   11315: l2i
    //   11316: ldc_w -845955751
    //   11319: ixor
    //   11320: ldc2_w -1165312646
    //   11323: l2i
    //   11324: ldc_w -813165062
    //   11327: ixor
    //   11328: ixor
    //   11329: lookupswitch default -> 24074, -614631105 -> 11312, 753762483 -> 11356
    //   11356: aload_0
    //   11357: getstatic Perryc.c : I
    //   11360: iflt -> 11374
    //   11363: ldc2_w 241095206
    //   11366: l2i
    //   11367: ldc_w 835151248
    //   11370: ixor
    //   11371: goto -> 11382
    //   11374: ldc2_w 1251193080
    //   11377: l2i
    //   11378: ldc_w -801256502
    //   11381: ixor
    //   11382: ldc2_w 815868019
    //   11385: l2i
    //   11386: ldc_w -616879727
    //   11389: ixor
    //   11390: ixor
    //   11391: lookupswitch default -> 24030, -737954220 -> 11374, 1899264720 -> 11416
    //   11416: getfield acceleration : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11419: getstatic Perryc.0 : I
    //   11422: ifle -> 11436
    //   11425: ldc2_w 1612761623
    //   11428: l2i
    //   11429: ldc_w -144528609
    //   11432: ixor
    //   11433: goto -> 11444
    //   11436: ldc2_w 217287866
    //   11439: l2i
    //   11440: ldc_w -1419646191
    //   11443: ixor
    //   11444: ldc2_w -721265625
    //   11447: l2i
    //   11448: ldc_w -971412042
    //   11451: ixor
    //   11452: ixor
    //   11453: lookupswitch default -> 23994, -2074521447 -> 11436, -1266067910 -> 11480
    //   11480: goto -> 11484
    //   11483: athrow
    //   11484: invokevirtual getValue : ()Ljava/lang/Object;
    //   11487: goto -> 11491
    //   11490: athrow
    //   11491: checkcast java/lang/Integer
    //   11494: getstatic Perryc.1 : I
    //   11497: ifeq -> 11511
    //   11500: ldc2_w -858825008
    //   11503: l2i
    //   11504: ldc_w -1192897148
    //   11507: ixor
    //   11508: goto -> 11519
    //   11511: ldc2_w 1760043117
    //   11514: l2i
    //   11515: ldc_w -370210776
    //   11518: ixor
    //   11519: ldc2_w 752476575
    //   11522: l2i
    //   11523: ldc_w -133003499
    //   11526: ixor
    //   11527: ixor
    //   11528: lookupswitch default -> 23570, -1595806242 -> 11511, 1439452879 -> 11556
    //   11556: goto -> 11560
    //   11559: athrow
    //   11560: invokevirtual intValue : ()I
    //   11563: goto -> 11567
    //   11566: athrow
    //   11567: ldc2_w 450382477
    //   11570: l2i
    //   11571: ldc_w 450380520
    //   11574: ixor
    //   11575: if_icmpne -> 11589
    //   11578: ldc2_w 1745581582
    //   11581: l2i
    //   11582: ldc_w 83485157
    //   11585: ixor
    //   11586: goto -> 11597
    //   11589: ldc2_w 1053218933
    //   11592: l2i
    //   11593: ldc_w 1379159969
    //   11596: ixor
    //   11597: ldc2_w -1180542896
    //   11600: l2i
    //   11601: ldc_w -299633564
    //   11604: ixor
    //   11605: ixor
    //   11606: tableswitch default -> 11578, 997407711 -> 11628, 997407712 -> 11644
    //   11628: ldc2_w 0.42749193178836914
    //   11631: invokestatic doubleToLongBits : (D)J
    //   11634: ldc2_w 9212797812247523309
    //   11637: lxor
    //   11638: invokestatic longBitsToDouble : (J)D
    //   11641: goto -> 11930
    //   11644: getstatic Perryc.1 : I
    //   11647: ifeq -> 11661
    //   11650: ldc2_w -1860833016
    //   11653: l2i
    //   11654: ldc_w 1322225654
    //   11657: ixor
    //   11658: goto -> 11669
    //   11661: ldc2_w 986462175
    //   11664: l2i
    //   11665: ldc_w -564080579
    //   11668: ixor
    //   11669: ldc2_w -595370032
    //   11672: l2i
    //   11673: ldc_w -1822179343
    //   11676: ixor
    //   11677: ixor
    //   11678: lookupswitch default -> 11704, -1875206433 -> 24138, 658442590 -> 11661
    //   11704: aload_0
    //   11705: getstatic Perryc.0 : I
    //   11708: ifle -> 11722
    //   11711: ldc2_w -1899572305
    //   11714: l2i
    //   11715: ldc_w 409090697
    //   11718: ixor
    //   11719: goto -> 11730
    //   11722: ldc2_w -597317988
    //   11725: l2i
    //   11726: ldc_w 1924448134
    //   11729: ixor
    //   11730: ldc2_w 907575803
    //   11733: l2i
    //   11734: ldc_w -1948446266
    //   11737: ixor
    //   11738: ixor
    //   11739: lookupswitch default -> 11764, 727808283 -> 24066, 1065723158 -> 11722
    //   11764: getfield acceleration : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11767: getstatic Perryc.c : I
    //   11770: iflt -> 11784
    //   11773: ldc2_w -161754798
    //   11776: l2i
    //   11777: ldc_w -623693300
    //   11780: ixor
    //   11781: goto -> 11792
    //   11784: ldc2_w -1501368389
    //   11787: l2i
    //   11788: ldc_w -1618344069
    //   11791: ixor
    //   11792: ldc2_w -483125858
    //   11795: l2i
    //   11796: ldc_w 217481987
    //   11799: ixor
    //   11800: ixor
    //   11801: lookupswitch default -> 23686, -1018530365 -> 11784, -691372451 -> 11828
    //   11828: goto -> 11832
    //   11831: athrow
    //   11832: invokevirtual getValue : ()Ljava/lang/Object;
    //   11835: goto -> 11839
    //   11838: athrow
    //   11839: checkcast java/lang/Integer
    //   11842: getstatic Perryc.1 : I
    //   11845: ifeq -> 11859
    //   11848: ldc2_w 1782734782
    //   11851: l2i
    //   11852: ldc_w -1832881231
    //   11855: ixor
    //   11856: goto -> 11867
    //   11859: ldc2_w -1584416179
    //   11862: l2i
    //   11863: ldc_w 1999260543
    //   11866: ixor
    //   11867: ldc2_w 1658491352
    //   11870: l2i
    //   11871: ldc_w -2142481176
    //   11874: ixor
    //   11875: ixor
    //   11876: lookupswitch default -> 11904, -568940669 -> 11859, 437578047 -> 24114
    //   11904: goto -> 11908
    //   11907: athrow
    //   11908: invokevirtual intValue : ()I
    //   11911: goto -> 11915
    //   11914: athrow
    //   11915: i2d
    //   11916: ldc2_w 9.479757616969773E-4
    //   11919: invokestatic doubleToLongBits : (D)J
    //   11922: ldc2_w 9205445815943493159
    //   11925: lxor
    //   11926: invokestatic longBitsToDouble : (J)D
    //   11929: ddiv
    //   11930: getstatic Perryc.1 : I
    //   11933: ifeq -> 11947
    //   11936: ldc2_w 1078097795
    //   11939: l2i
    //   11940: ldc_w 1823880394
    //   11943: ixor
    //   11944: goto -> 11955
    //   11947: ldc2_w -1407502080
    //   11950: l2i
    //   11951: ldc_w -609792497
    //   11954: ixor
    //   11955: ldc2_w -474322013
    //   11958: l2i
    //   11959: ldc_w -1732576920
    //   11962: ixor
    //   11963: ixor
    //   11964: lookupswitch default -> 11992, -1318424713 -> 11947, 1475662210 -> 23644
    //   11992: dstore #5
    //   11994: getstatic Perryc.c : I
    //   11997: iflt -> 12011
    //   12000: ldc2_w -270542150
    //   12003: l2i
    //   12004: ldc_w -1476494135
    //   12007: ixor
    //   12008: goto -> 12019
    //   12011: ldc2_w 1869721170
    //   12014: l2i
    //   12015: ldc_w -382385095
    //   12018: ixor
    //   12019: ldc2_w 73264681
    //   12022: l2i
    //   12023: ldc_w 232533176
    //   12026: ixor
    //   12027: ixor
    //   12028: lookupswitch default -> 23688, -1882904326 -> 12056, 1101030626 -> 12011
    //   12056: aload_0
    //   12057: dup
    //   12058: getstatic Perryc.c : I
    //   12061: iflt -> 12075
    //   12064: ldc2_w 1582274594
    //   12067: l2i
    //   12068: ldc_w 1391786321
    //   12071: ixor
    //   12072: goto -> 12083
    //   12075: ldc2_w 1010841212
    //   12078: l2i
    //   12079: ldc_w 1441265061
    //   12082: ixor
    //   12083: ldc2_w -1036867705
    //   12086: l2i
    //   12087: ldc_w 1236032813
    //   12090: ixor
    //   12091: ixor
    //   12092: lookupswitch default -> 12120, -2027578407 -> 23714, -37596122 -> 12075
    //   12120: getfield moveSpeed : D
    //   12123: getstatic Perryc.c : I
    //   12126: iflt -> 12140
    //   12129: ldc2_w 80207786
    //   12132: l2i
    //   12133: ldc_w 1977607533
    //   12136: ixor
    //   12137: goto -> 12148
    //   12140: ldc2_w 348020449
    //   12143: l2i
    //   12144: ldc_w 2138891856
    //   12147: ixor
    //   12148: ldc2_w 384492697
    //   12151: l2i
    //   12152: ldc_w -1205920646
    //   12155: ixor
    //   12156: ixor
    //   12157: lookupswitch default -> 12184, -538066396 -> 23602, 352864583 -> 12140
    //   12184: dload #5
    //   12186: dmul
    //   12187: getstatic Perryc.c : I
    //   12190: iflt -> 12204
    //   12193: ldc2_w -827736453
    //   12196: l2i
    //   12197: ldc_w -569025881
    //   12200: ixor
    //   12201: goto -> 12212
    //   12204: ldc2_w 2101902872
    //   12207: l2i
    //   12208: ldc_w -1344140992
    //   12211: ixor
    //   12212: ldc2_w -1613235329
    //   12215: l2i
    //   12216: ldc_w 857861556
    //   12219: ixor
    //   12220: ixor
    //   12221: lookupswitch default -> 23608, -1135939049 -> 12204, 2119983507 -> 12248
    //   12248: putfield moveSpeed : D
    //   12251: goto -> 16635
    //   12254: getstatic Perryc.0 : I
    //   12257: ifle -> 12271
    //   12260: ldc2_w 142307115
    //   12263: l2i
    //   12264: ldc_w -1554998881
    //   12267: ixor
    //   12268: goto -> 12279
    //   12271: ldc2_w -2021138432
    //   12274: l2i
    //   12275: ldc_w -1306550148
    //   12278: ixor
    //   12279: ldc2_w 453249541
    //   12282: l2i
    //   12283: ldc_w 341225009
    //   12286: ixor
    //   12287: ixor
    //   12288: lookupswitch default -> 23674, -1535552896 -> 12271, 986375240 -> 12316
    //   12316: aload_0
    //   12317: getstatic Perryc.c : I
    //   12320: iflt -> 12334
    //   12323: ldc2_w -1956713927
    //   12326: l2i
    //   12327: ldc_w 983783593
    //   12330: ixor
    //   12331: goto -> 12342
    //   12334: ldc2_w 1119791480
    //   12337: l2i
    //   12338: ldc_w -2146048300
    //   12341: ixor
    //   12342: ldc2_w 9078310
    //   12345: l2i
    //   12346: ldc_w 1286546148
    //   12349: ixor
    //   12350: ixor
    //   12351: lookupswitch default -> 12376, -2029204367 -> 12334, -36170158 -> 23736
    //   12376: getfield stage : I
    //   12379: ldc2_w -79298468
    //   12382: l2i
    //   12383: ldc_w -79298465
    //   12386: ixor
    //   12387: if_icmpne -> 12401
    //   12390: ldc2_w 2009480041
    //   12393: l2i
    //   12394: ldc_w -888430674
    //   12397: ixor
    //   12398: goto -> 12409
    //   12401: ldc2_w -107035413
    //   12404: l2i
    //   12405: ldc_w 1163092019
    //   12408: ixor
    //   12409: ldc2_w 2657275
    //   12412: l2i
    //   12413: ldc_w 1643755539
    //   12416: ixor
    //   12417: ixor
    //   12418: tableswitch default -> 12390, -585328849 -> 12440, -585328848 -> 13158
    //   12440: getstatic Perryc.1 : I
    //   12443: ifeq -> 12457
    //   12446: ldc2_w -1866884994
    //   12449: l2i
    //   12450: ldc_w -202326331
    //   12453: ixor
    //   12454: goto -> 12465
    //   12457: ldc2_w -41468433
    //   12460: l2i
    //   12461: ldc_w -2100501401
    //   12464: ixor
    //   12465: ldc2_w 1791603700
    //   12468: l2i
    //   12469: ldc_w -453594057
    //   12472: ixor
    //   12473: ixor
    //   12474: lookupswitch default -> 24038, -311025288 -> 12457, -243999157 -> 12500
    //   12500: aload_0
    //   12501: ldc2_w 554052684
    //   12504: l2i
    //   12505: ldc_w 554052680
    //   12508: ixor
    //   12509: getstatic Perryc.c : I
    //   12512: iflt -> 12526
    //   12515: ldc2_w 681825766
    //   12518: l2i
    //   12519: ldc_w 1298586609
    //   12522: ixor
    //   12523: goto -> 12534
    //   12526: ldc2_w 2077660319
    //   12529: l2i
    //   12530: ldc_w -2100388222
    //   12533: ixor
    //   12534: ldc2_w -1884764260
    //   12537: l2i
    //   12538: ldc_w 873222943
    //   12541: ixor
    //   12542: ixor
    //   12543: lookupswitch default -> 12568, -564028780 -> 24070, 491807746 -> 12526
    //   12568: putfield stage : I
    //   12571: ldc2_w 2.0674697288382107
    //   12574: invokestatic doubleToLongBits : (D)J
    //   12577: ldc2_w 9215935583381954834
    //   12580: lxor
    //   12581: invokestatic longBitsToDouble : (J)D
    //   12584: getstatic Perryc.0 : I
    //   12587: ifle -> 12601
    //   12590: ldc2_w 392111204
    //   12593: l2i
    //   12594: ldc_w -467207162
    //   12597: ixor
    //   12598: goto -> 12609
    //   12601: ldc2_w -1299918782
    //   12604: l2i
    //   12605: ldc_w -2109277216
    //   12608: ixor
    //   12609: ldc2_w -186091013
    //   12612: l2i
    //   12613: ldc_w -1978820141
    //   12616: ixor
    //   12617: ixor
    //   12618: lookupswitch default -> 12644, -1919141814 -> 23610, -900433664 -> 12601
    //   12644: aload_0
    //   12645: getstatic Perryc.c : I
    //   12648: iflt -> 12662
    //   12651: ldc2_w 2118826558
    //   12654: l2i
    //   12655: ldc_w 1074693765
    //   12658: ixor
    //   12659: goto -> 12670
    //   12662: ldc2_w 616635648
    //   12665: l2i
    //   12666: ldc_w -757540257
    //   12669: ixor
    //   12670: ldc2_w -836869347
    //   12673: l2i
    //   12674: ldc_w -1811559673
    //   12677: ixor
    //   12678: ixor
    //   12679: lookupswitch default -> 23890, -1409126587 -> 12704, 1683985569 -> 12662
    //   12704: getfield lastDist : D
    //   12707: getstatic Perryc.c : I
    //   12710: iflt -> 12724
    //   12713: ldc2_w 2092365207
    //   12716: l2i
    //   12717: ldc_w -738123137
    //   12720: ixor
    //   12721: goto -> 12732
    //   12724: ldc2_w 266142430
    //   12727: l2i
    //   12728: ldc_w 273806938
    //   12731: ixor
    //   12732: ldc2_w -1964696886
    //   12735: l2i
    //   12736: ldc_w 1727106923
    //   12739: ixor
    //   12740: ixor
    //   12741: lookupswitch default -> 12768, 441541852 -> 12724, 1151550025 -> 23906
    //   12768: goto -> 12772
    //   12771: athrow
    //   12772: invokestatic getBaseMoveSpeed : ()D
    //   12775: goto -> 12779
    //   12778: athrow
    //   12779: dsub
    //   12780: dmul
    //   12781: getstatic Perryc.0 : I
    //   12784: ifle -> 12798
    //   12787: ldc2_w -2087352947
    //   12790: l2i
    //   12791: ldc_w -2038774933
    //   12794: ixor
    //   12795: goto -> 12806
    //   12798: ldc2_w -864538202
    //   12801: l2i
    //   12802: ldc_w 1476383542
    //   12805: ixor
    //   12806: ldc2_w 1762578277
    //   12809: l2i
    //   12810: ldc_w -1875536427
    //   12813: ixor
    //   12814: ixor
    //   12815: lookupswitch default -> 23928, -53207978 -> 12798, 1656535072 -> 12840
    //   12840: dstore #5
    //   12842: getstatic Perryc.c : I
    //   12845: iflt -> 12859
    //   12848: ldc2_w -305620487
    //   12851: l2i
    //   12852: ldc_w 1075610566
    //   12855: ixor
    //   12856: goto -> 12867
    //   12859: ldc2_w -111797657
    //   12862: l2i
    //   12863: ldc_w 1653828521
    //   12866: ixor
    //   12867: ldc2_w 765799207
    //   12870: l2i
    //   12871: ldc_w 1978025271
    //   12874: ixor
    //   12875: ixor
    //   12876: lookupswitch default -> 24082, -1014620194 -> 12904, -174623697 -> 12859
    //   12904: aload_0
    //   12905: getstatic Perryc.1 : I
    //   12908: ifeq -> 12922
    //   12911: ldc2_w -1440273115
    //   12914: l2i
    //   12915: ldc_w -703480380
    //   12918: ixor
    //   12919: goto -> 12930
    //   12922: ldc2_w 1782290683
    //   12925: l2i
    //   12926: ldc_w 1923194226
    //   12929: ixor
    //   12930: ldc2_w 948753662
    //   12933: l2i
    //   12934: ldc_w 1143802172
    //   12937: ixor
    //   12938: ixor
    //   12939: lookupswitch default -> 23662, 9915683 -> 12922, 1681643595 -> 12964
    //   12964: aload_0
    //   12965: getstatic Perryc.c : I
    //   12968: iflt -> 12982
    //   12971: ldc2_w 2088419136
    //   12974: l2i
    //   12975: ldc_w -2111562107
    //   12978: ixor
    //   12979: goto -> 12990
    //   12982: ldc2_w 1620103315
    //   12985: l2i
    //   12986: ldc_w -1168018036
    //   12989: ixor
    //   12990: ldc2_w -1569115523
    //   12993: l2i
    //   12994: ldc_w 1459029552
    //   12997: ixor
    //   12998: ixor
    //   12999: lookupswitch default -> 13024, 181441928 -> 23814, 1427065110 -> 12982
    //   13024: getfield lastDist : D
    //   13027: getstatic Perryc.1 : I
    //   13030: ifeq -> 13044
    //   13033: ldc2_w -239989423
    //   13036: l2i
    //   13037: ldc_w 141983068
    //   13040: ixor
    //   13041: goto -> 13052
    //   13044: ldc2_w 49236898
    //   13047: l2i
    //   13048: ldc_w -1168029195
    //   13051: ixor
    //   13052: ldc2_w -776646144
    //   13055: l2i
    //   13056: ldc_w -1501022934
    //   13059: ixor
    //   13060: ixor
    //   13061: lookupswitch default -> 23622, -1896278233 -> 13044, -810326659 -> 13088
    //   13088: dload #5
    //   13090: dsub
    //   13091: getstatic Perryc.c : I
    //   13094: iflt -> 13108
    //   13097: ldc2_w -570883261
    //   13100: l2i
    //   13101: ldc_w 1330530201
    //   13104: ixor
    //   13105: goto -> 13116
    //   13108: ldc2_w 902733030
    //   13111: l2i
    //   13112: ldc_w 337162930
    //   13115: ixor
    //   13116: ldc2_w -663266775
    //   13119: l2i
    //   13120: ldc_w -217360554
    //   13123: ixor
    //   13124: ixor
    //   13125: lookupswitch default -> 23566, -1177859675 -> 13108, 178922283 -> 13152
    //   13152: putfield moveSpeed : D
    //   13155: goto -> 16635
    //   13158: getstatic Perryc.0 : I
    //   13161: ifle -> 13175
    //   13164: ldc2_w 1174561954
    //   13167: l2i
    //   13168: ldc_w -700657422
    //   13171: ixor
    //   13172: goto -> 13183
    //   13175: ldc2_w 346624371
    //   13178: l2i
    //   13179: ldc_w -1644959801
    //   13182: ixor
    //   13183: ldc2_w -134468107
    //   13186: l2i
    //   13187: ldc_w -2052171502
    //   13190: ixor
    //   13191: ixor
    //   13192: lookupswitch default -> 23780, -496189257 -> 13175, -83328429 -> 13220
    //   13220: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   13223: getstatic Perryc.1 : I
    //   13226: ifeq -> 13240
    //   13229: ldc2_w 427361429
    //   13232: l2i
    //   13233: ldc_w 245020876
    //   13236: ixor
    //   13237: goto -> 13248
    //   13240: ldc2_w 59111201
    //   13243: l2i
    //   13244: ldc_w -901488942
    //   13247: ixor
    //   13248: ldc2_w -1083133242
    //   13251: l2i
    //   13252: ldc_w 1715094211
    //   13255: ixor
    //   13256: ixor
    //   13257: lookupswitch default -> 13284, -827765668 -> 24068, 601348069 -> 13240
    //   13284: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   13287: getstatic Perryc.0 : I
    //   13290: ifle -> 13304
    //   13293: ldc2_w -1207249841
    //   13296: l2i
    //   13297: ldc_w -1796413402
    //   13300: ixor
    //   13301: goto -> 13312
    //   13304: ldc2_w -1672056611
    //   13307: l2i
    //   13308: ldc_w 466552689
    //   13311: ixor
    //   13312: ldc2_w -2090894394
    //   13315: l2i
    //   13316: ldc_w -1023839475
    //   13319: ixor
    //   13320: ixor
    //   13321: lookupswitch default -> 23878, -968917145 -> 13348, 1832924322 -> 13304
    //   13348: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   13351: getstatic Perryc.c : I
    //   13354: iflt -> 13368
    //   13357: ldc2_w 1629346617
    //   13360: l2i
    //   13361: ldc_w -788765121
    //   13364: ixor
    //   13365: goto -> 13376
    //   13368: ldc2_w 197140474
    //   13371: l2i
    //   13372: ldc_w -1312363997
    //   13375: ixor
    //   13376: ldc2_w 926661977
    //   13379: l2i
    //   13380: ldc_w 459023548
    //   13383: ixor
    //   13384: ixor
    //   13385: lookupswitch default -> 13412, -1652153117 -> 24104, -763276794 -> 13368
    //   13412: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   13415: getstatic Perryc.0 : I
    //   13418: ifle -> 13432
    //   13421: ldc2_w 494861930
    //   13424: l2i
    //   13425: ldc_w -1340959155
    //   13428: ixor
    //   13429: goto -> 13440
    //   13432: ldc2_w 1295725222
    //   13435: l2i
    //   13436: ldc_w 75197706
    //   13439: ixor
    //   13440: ldc2_w -2015908405
    //   13443: l2i
    //   13444: ldc_w 1183089443
    //   13447: ixor
    //   13448: ixor
    //   13449: lookupswitch default -> 13476, -162198556 -> 13432, 1816086223 -> 23624
    //   13476: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   13479: getstatic Perryc.1 : I
    //   13482: ifeq -> 13496
    //   13485: ldc2_w 362708923
    //   13488: l2i
    //   13489: ldc_w 398535432
    //   13492: ixor
    //   13493: goto -> 13504
    //   13496: ldc2_w -514928664
    //   13499: l2i
    //   13500: ldc_w -70199072
    //   13503: ixor
    //   13504: ldc2_w 412256404
    //   13507: l2i
    //   13508: ldc_w 248293572
    //   13511: ixor
    //   13512: ixor
    //   13513: lookupswitch default -> 23794, 213923672 -> 13540, 335639779 -> 13496
    //   13540: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   13543: getstatic Perryc.c : I
    //   13546: iflt -> 13560
    //   13549: ldc2_w -1448880465
    //   13552: l2i
    //   13553: ldc_w 1315443874
    //   13556: ixor
    //   13557: goto -> 13568
    //   13560: ldc2_w -1096270196
    //   13563: l2i
    //   13564: ldc_w 1323767389
    //   13567: ixor
    //   13568: ldc2_w -725071027
    //   13571: l2i
    //   13572: ldc_w 825721814
    //   13575: ixor
    //   13576: ixor
    //   13577: lookupswitch default -> 23886, 36965014 -> 13560, 363913290 -> 13604
    //   13604: goto -> 13608
    //   13607: athrow
    //   13608: invokevirtual func_174813_aQ : ()Lnet/minecraft/util/math/AxisAlignedBB;
    //   13611: goto -> 13615
    //   13614: athrow
    //   13615: ldc2_w 1.1970005696153327E307
    //   13618: invokestatic doubleToLongBits : (D)J
    //   13621: ldc2_w 9201148420427624367
    //   13624: lxor
    //   13625: invokestatic longBitsToDouble : (J)D
    //   13628: getstatic Perryc.c : I
    //   13631: iflt -> 13645
    //   13634: ldc2_w -213011188
    //   13637: l2i
    //   13638: ldc_w -728574860
    //   13641: ixor
    //   13642: goto -> 13653
    //   13645: ldc2_w 315120127
    //   13648: l2i
    //   13649: ldc_w -182697638
    //   13652: ixor
    //   13653: ldc2_w 1808284793
    //   13656: l2i
    //   13657: ldc_w 1113812919
    //   13660: ixor
    //   13661: ixor
    //   13662: lookupswitch default -> 13688, 242496182 -> 23576, 942774927 -> 13645
    //   13688: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   13691: getstatic Perryc.c : I
    //   13694: iflt -> 13708
    //   13697: ldc2_w 900642125
    //   13700: l2i
    //   13701: ldc_w 325583642
    //   13704: ixor
    //   13705: goto -> 13716
    //   13708: ldc2_w -754044537
    //   13711: l2i
    //   13712: ldc_w -2002654618
    //   13715: ixor
    //   13716: ldc2_w -1284202815
    //   13719: l2i
    //   13720: ldc_w 1789191663
    //   13723: ixor
    //   13724: ixor
    //   13725: lookupswitch default -> 23698, -2105564977 -> 13752, -15282823 -> 13708
    //   13752: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   13755: getstatic Perryc.1 : I
    //   13758: ifeq -> 13772
    //   13761: ldc2_w 1649415518
    //   13764: l2i
    //   13765: ldc_w 1775096555
    //   13768: ixor
    //   13769: goto -> 13780
    //   13772: ldc2_w 261667688
    //   13775: l2i
    //   13776: ldc_w 255878180
    //   13779: ixor
    //   13780: ldc2_w 948554960
    //   13783: l2i
    //   13784: ldc_w -471633266
    //   13787: ixor
    //   13788: ixor
    //   13789: lookupswitch default -> 13816, -1935632555 -> 13772, -789087765 -> 24092
    //   13816: getfield field_70181_x : D
    //   13819: ldc2_w 3.9496777680983645E307
    //   13822: invokestatic doubleToLongBits : (D)J
    //   13825: ldc2_w 9208769857932976927
    //   13828: lxor
    //   13829: invokestatic longBitsToDouble : (J)D
    //   13832: getstatic Perryc.1 : I
    //   13835: ifeq -> 13849
    //   13838: ldc2_w -329821529
    //   13841: l2i
    //   13842: ldc_w 1779779223
    //   13845: ixor
    //   13846: goto -> 13857
    //   13849: ldc2_w 2132475812
    //   13852: l2i
    //   13853: ldc_w -852320326
    //   13856: ixor
    //   13857: ldc2_w 1317190331
    //   13860: l2i
    //   13861: ldc_w 2086527703
    //   13864: ixor
    //   13865: ixor
    //   13866: lookupswitch default -> 13892, -1264759716 -> 23754, -792107786 -> 13849
    //   13892: goto -> 13896
    //   13895: athrow
    //   13896: invokevirtual func_72317_d : (DDD)Lnet/minecraft/util/math/AxisAlignedBB;
    //   13899: goto -> 13903
    //   13902: athrow
    //   13903: getstatic Perryc.0 : I
    //   13906: ifle -> 13920
    //   13909: ldc2_w -1089901331
    //   13912: l2i
    //   13913: ldc_w -2078441245
    //   13916: ixor
    //   13917: goto -> 13928
    //   13920: ldc2_w 210877361
    //   13923: l2i
    //   13924: ldc_w -1897423855
    //   13927: ixor
    //   13928: ldc2_w 893798926
    //   13931: l2i
    //   13932: ldc_w 2011576370
    //   13935: ixor
    //   13936: ixor
    //   13937: lookupswitch default -> 23568, -1059695204 -> 13964, 2041880114 -> 13920
    //   13964: goto -> 13968
    //   13967: athrow
    //   13968: invokevirtual func_184144_a : (Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
    //   13971: goto -> 13975
    //   13974: athrow
    //   13975: getstatic Perryc.1 : I
    //   13978: ifeq -> 13992
    //   13981: ldc2_w 2119788332
    //   13984: l2i
    //   13985: ldc_w 1693055256
    //   13988: ixor
    //   13989: goto -> 14000
    //   13992: ldc2_w 1981001335
    //   13995: l2i
    //   13996: ldc_w -2030060234
    //   13999: ixor
    //   14000: ldc2_w -27837884
    //   14003: l2i
    //   14004: ldc_w 1825822418
    //   14007: ixor
    //   14008: ixor
    //   14009: lookupswitch default -> 23710, -2009828702 -> 13992, 1651048407 -> 14036
    //   14036: goto -> 14040
    //   14039: athrow
    //   14040: invokeinterface size : ()I
    //   14045: goto -> 14049
    //   14048: athrow
    //   14049: ifgt -> 14063
    //   14052: ldc2_w -801025262
    //   14055: l2i
    //   14056: ldc_w 2044588499
    //   14059: ixor
    //   14060: goto -> 14071
    //   14063: ldc2_w 1908400737
    //   14066: l2i
    //   14067: ldc_w -668778333
    //   14070: ixor
    //   14071: ldc2_w -794633383
    //   14074: l2i
    //   14075: ldc_w 1661437133
    //   14078: ixor
    //   14079: ixor
    //   14080: tableswitch default -> 14052, 440008021 -> 14104, 440008022 -> 14524
    //   14104: getstatic Perryc.0 : I
    //   14107: ifle -> 14121
    //   14110: ldc2_w 218582540
    //   14113: l2i
    //   14114: ldc_w -1681980926
    //   14117: ixor
    //   14118: goto -> 14129
    //   14121: ldc2_w -767963990
    //   14124: l2i
    //   14125: ldc_w -1213385530
    //   14128: ixor
    //   14129: ldc2_w 1628685422
    //   14132: l2i
    //   14133: ldc_w -1351580178
    //   14136: ixor
    //   14137: ixor
    //   14138: lookupswitch default -> 23864, -1409828372 -> 14164, 1490750862 -> 14121
    //   14164: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   14167: getstatic Perryc.0 : I
    //   14170: ifle -> 14184
    //   14173: ldc2_w -788477182
    //   14176: l2i
    //   14177: ldc_w 601193385
    //   14180: ixor
    //   14181: goto -> 14192
    //   14184: ldc2_w 451957702
    //   14187: l2i
    //   14188: ldc_w 378000516
    //   14191: ixor
    //   14192: ldc2_w 1025523799
    //   14195: l2i
    //   14196: ldc_w -105622354
    //   14199: ixor
    //   14200: ixor
    //   14201: lookupswitch default -> 23578, -924609605 -> 14228, 910271570 -> 14184
    //   14228: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   14231: getstatic Perryc.c : I
    //   14234: iflt -> 14248
    //   14237: ldc2_w 1228315400
    //   14240: l2i
    //   14241: ldc_w 131073982
    //   14244: ixor
    //   14245: goto -> 14256
    //   14248: ldc2_w 1299285149
    //   14251: l2i
    //   14252: ldc_w 46548848
    //   14255: ixor
    //   14256: ldc2_w -1995525080
    //   14259: l2i
    //   14260: ldc_w -1679589284
    //   14263: ixor
    //   14264: ixor
    //   14265: lookupswitch default -> 14292, 1008698987 -> 14248, 1544267970 -> 24054
    //   14292: getfield field_70124_G : Z
    //   14295: ifeq -> 14309
    //   14298: ldc2_w -1449198217
    //   14301: l2i
    //   14302: ldc_w 881493267
    //   14305: ixor
    //   14306: goto -> 14317
    //   14309: ldc2_w -1962124972
    //   14312: l2i
    //   14313: ldc_w 370680115
    //   14316: ixor
    //   14317: ldc2_w -756294337
    //   14320: l2i
    //   14321: ldc_w 360267062
    //   14324: ixor
    //   14325: ixor
    //   14326: tableswitch default -> 14298, 1518770285 -> 14348, 1518770286 -> 15987
    //   14348: getstatic Perryc.c : I
    //   14351: iflt -> 14365
    //   14354: ldc2_w -1405966216
    //   14357: l2i
    //   14358: ldc_w -191700970
    //   14361: ixor
    //   14362: goto -> 14373
    //   14365: ldc2_w -1666090039
    //   14368: l2i
    //   14369: ldc_w 1251929665
    //   14372: ixor
    //   14373: ldc2_w -451333960
    //   14376: l2i
    //   14377: ldc_w -2098066397
    //   14380: ixor
    //   14381: ixor
    //   14382: lookupswitch default -> 14408, -1226947898 -> 14365, 1061909749 -> 23946
    //   14408: aload_0
    //   14409: getstatic Perryc.0 : I
    //   14412: ifle -> 14426
    //   14415: ldc2_w -1879581859
    //   14418: l2i
    //   14419: ldc_w 1927994992
    //   14422: ixor
    //   14423: goto -> 14434
    //   14426: ldc2_w -667897007
    //   14429: l2i
    //   14430: ldc_w -1549939211
    //   14433: ixor
    //   14434: ldc2_w -1790637268
    //   14437: l2i
    //   14438: ldc_w -1471749695
    //   14441: ixor
    //   14442: ixor
    //   14443: lookupswitch default -> 23594, -1071714368 -> 14426, 1185846345 -> 14468
    //   14468: getfield stage : I
    //   14471: ifle -> 14485
    //   14474: ldc2_w 468855602
    //   14477: l2i
    //   14478: ldc_w 1271049912
    //   14481: ixor
    //   14482: goto -> 14493
    //   14485: ldc2_w -158482895
    //   14488: l2i
    //   14489: ldc_w -1497547844
    //   14492: ixor
    //   14493: ldc2_w -1801680150
    //   14496: l2i
    //   14497: ldc_w 669493035
    //   14500: ixor
    //   14501: ixor
    //   14502: tableswitch default -> 14474, -481580981 -> 14524, -481580980 -> 15987
    //   14524: getstatic Perryc.c : I
    //   14527: iflt -> 14541
    //   14530: ldc2_w 1272399878
    //   14533: l2i
    //   14534: ldc_w -437622347
    //   14537: ixor
    //   14538: goto -> 14549
    //   14541: ldc2_w -1386625434
    //   14544: l2i
    //   14545: ldc_w -849680996
    //   14548: ixor
    //   14549: ldc2_w -1166193915
    //   14552: l2i
    //   14553: ldc_w -24086518
    //   14556: ixor
    //   14557: ixor
    //   14558: lookupswitch default -> 14584, -355462468 -> 24146, 1879399288 -> 14541
    //   14584: aload_0
    //   14585: getstatic Perryc.c : I
    //   14588: iflt -> 14602
    //   14591: ldc2_w 1086029236
    //   14594: l2i
    //   14595: ldc_w 1518218284
    //   14598: ixor
    //   14599: goto -> 14610
    //   14602: ldc2_w 631617553
    //   14605: l2i
    //   14606: ldc_w 112198278
    //   14609: ixor
    //   14610: ldc2_w -1697050078
    //   14613: l2i
    //   14614: ldc_w -2016542833
    //   14617: ixor
    //   14618: ixor
    //   14619: lookupswitch default -> 14644, -386099682 -> 14602, 131185717 -> 24034
    //   14644: aload_0
    //   14645: getstatic Perryc.0 : I
    //   14648: ifle -> 14662
    //   14651: ldc2_w 1408088935
    //   14654: l2i
    //   14655: ldc_w 1669057944
    //   14658: ixor
    //   14659: goto -> 14670
    //   14662: ldc2_w -621653971
    //   14665: l2i
    //   14666: ldc_w -1698496142
    //   14669: ixor
    //   14670: ldc2_w 1927070797
    //   14673: l2i
    //   14674: ldc_w 1582880367
    //   14677: ixor
    //   14678: ixor
    //   14679: lookupswitch default -> 23818, 470967517 -> 14662, 1823818621 -> 14704
    //   14704: getfield bhop2 : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14707: getstatic Perryc.1 : I
    //   14710: ifeq -> 14724
    //   14713: ldc2_w 1454810876
    //   14716: l2i
    //   14717: ldc_w -1297445921
    //   14720: ixor
    //   14721: goto -> 14732
    //   14724: ldc2_w 547604811
    //   14727: l2i
    //   14728: ldc_w -388495268
    //   14731: ixor
    //   14732: ldc2_w 109478492
    //   14735: l2i
    //   14736: ldc_w -1061708422
    //   14739: ixor
    //   14740: ixor
    //   14741: lookupswitch default -> 23872, 239787569 -> 14768, 573387269 -> 14724
    //   14768: goto -> 14772
    //   14771: athrow
    //   14772: invokevirtual getValue : ()Ljava/lang/Object;
    //   14775: goto -> 14779
    //   14778: athrow
    //   14779: checkcast java/lang/Boolean
    //   14782: getstatic Perryc.1 : I
    //   14785: ifeq -> 14799
    //   14788: ldc2_w -1790144708
    //   14791: l2i
    //   14792: ldc_w 992037075
    //   14795: ixor
    //   14796: goto -> 14807
    //   14799: ldc2_w 1831046414
    //   14802: l2i
    //   14803: ldc_w -1196380138
    //   14806: ixor
    //   14807: ldc2_w -201228509
    //   14810: l2i
    //   14811: ldc_w 1731302805
    //   14814: ixor
    //   14815: ixor
    //   14816: lookupswitch default -> 23828, 1029516633 -> 14799, 1185142702 -> 14844
    //   14844: goto -> 14848
    //   14847: athrow
    //   14848: invokevirtual booleanValue : ()Z
    //   14851: goto -> 14855
    //   14854: athrow
    //   14855: ifeq -> 14869
    //   14858: ldc2_w -1034451633
    //   14861: l2i
    //   14862: ldc_w 179073034
    //   14865: ixor
    //   14866: goto -> 14877
    //   14869: ldc2_w -1770708943
    //   14872: l2i
    //   14873: ldc_w 1586419061
    //   14876: ixor
    //   14877: ldc2_w -1948532996
    //   14880: l2i
    //   14881: ldc_w -1311992845
    //   14884: ixor
    //   14885: ixor
    //   14886: tableswitch default -> 14858, -219359158 -> 14908, -219359157 -> 15383
    //   14908: getstatic Perryc.1 : I
    //   14911: ifeq -> 14925
    //   14914: ldc2_w 2124124040
    //   14917: l2i
    //   14918: ldc_w -1379708625
    //   14921: ixor
    //   14922: goto -> 14933
    //   14925: ldc2_w -1663974776
    //   14928: l2i
    //   14929: ldc_w -859076128
    //   14932: ixor
    //   14933: ldc2_w -1237256241
    //   14936: l2i
    //   14937: ldc_w -1093595381
    //   14940: ixor
    //   14941: ixor
    //   14942: lookupswitch default -> 14968, -1945093107 -> 14925, -607574429 -> 23584
    //   14968: getstatic bigname/zprestige/webhack/WebHack.speedManager : Lbigname/zprestige/webhack/manager/SpeedManager;
    //   14971: getstatic Perryc.1 : I
    //   14974: ifeq -> 14988
    //   14977: ldc2_w -155411400
    //   14980: l2i
    //   14981: ldc_w -1977429508
    //   14984: ixor
    //   14985: goto -> 14996
    //   14988: ldc2_w -1661951555
    //   14991: l2i
    //   14992: ldc_w 1095855943
    //   14995: ixor
    //   14996: ldc2_w -1444288648
    //   14999: l2i
    //   15000: ldc_w -1521644655
    //   15003: ixor
    //   15004: ixor
    //   15005: lookupswitch default -> 15032, 1882857773 -> 23972, 1966714494 -> 14988
    //   15032: goto -> 15036
    //   15035: athrow
    //   15036: invokevirtual getSpeedKpH : ()D
    //   15039: goto -> 15043
    //   15042: athrow
    //   15043: getstatic Perryc.1 : I
    //   15046: ifeq -> 15060
    //   15049: ldc2_w -1985751257
    //   15052: l2i
    //   15053: ldc_w -1736109604
    //   15056: ixor
    //   15057: goto -> 15068
    //   15060: ldc2_w -2083974347
    //   15063: l2i
    //   15064: ldc_w -320229522
    //   15067: ixor
    //   15068: ldc2_w -660474974
    //   15071: l2i
    //   15072: ldc_w -2059774062
    //   15075: ixor
    //   15076: ixor
    //   15077: lookupswitch default -> 23930, 851122283 -> 15104, 1287480011 -> 15060
    //   15104: aload_0
    //   15105: getstatic Perryc.c : I
    //   15108: iflt -> 15122
    //   15111: ldc2_w -650372373
    //   15114: l2i
    //   15115: ldc_w -1395173207
    //   15118: ixor
    //   15119: goto -> 15130
    //   15122: ldc2_w -1707991806
    //   15125: l2i
    //   15126: ldc_w -1449638920
    //   15129: ixor
    //   15130: ldc2_w -257270462
    //   15133: l2i
    //   15134: ldc_w 2127940725
    //   15137: ixor
    //   15138: ixor
    //   15139: lookupswitch default -> 24036, -1110061107 -> 15164, -74132619 -> 15122
    //   15164: getfield speedLimit : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15167: getstatic Perryc.1 : I
    //   15170: ifeq -> 15184
    //   15173: ldc2_w 1676147651
    //   15176: l2i
    //   15177: ldc_w -549547839
    //   15180: ixor
    //   15181: goto -> 15192
    //   15184: ldc2_w -167558208
    //   15187: l2i
    //   15188: ldc_w -40614216
    //   15191: ixor
    //   15192: ldc2_w -797402851
    //   15195: l2i
    //   15196: ldc_w -840138806
    //   15199: ixor
    //   15200: ixor
    //   15201: lookupswitch default -> 24062, -1588752939 -> 15184, 369353647 -> 15228
    //   15228: goto -> 15232
    //   15231: athrow
    //   15232: invokevirtual getValue : ()Ljava/lang/Object;
    //   15235: goto -> 15239
    //   15238: athrow
    //   15239: checkcast java/lang/Float
    //   15242: getstatic Perryc.c : I
    //   15245: iflt -> 15259
    //   15248: ldc2_w 1021011809
    //   15251: l2i
    //   15252: ldc_w -1099870856
    //   15255: ixor
    //   15256: goto -> 15267
    //   15259: ldc2_w 1904707359
    //   15262: l2i
    //   15263: ldc_w -1581294553
    //   15266: ixor
    //   15267: ldc2_w 1126038749
    //   15270: l2i
    //   15271: ldc_w 1633913104
    //   15274: ixor
    //   15275: ixor
    //   15276: lookupswitch default -> 15304, -1596694572 -> 23950, -668943841 -> 15259
    //   15304: goto -> 15308
    //   15307: athrow
    //   15308: invokevirtual floatValue : ()F
    //   15311: goto -> 15315
    //   15314: athrow
    //   15315: f2d
    //   15316: dcmpl
    //   15317: iflt -> 15331
    //   15320: ldc2_w -2071643209
    //   15323: l2i
    //   15324: ldc_w 1304935870
    //   15327: ixor
    //   15328: goto -> 15339
    //   15331: ldc2_w 785184775
    //   15334: l2i
    //   15335: ldc_w -410091919
    //   15338: ixor
    //   15339: ldc2_w -1036991026
    //   15342: l2i
    //   15343: ldc_w -728067976
    //   15346: ixor
    //   15347: ixor
    //   15348: tableswitch default -> 15320, -538389569 -> 15372, -538389568 -> 15383
    //   15372: ldc2_w 1869523273
    //   15375: l2i
    //   15376: ldc_w 1869523273
    //   15379: ixor
    //   15380: goto -> 15923
    //   15383: getstatic Perryc.c : I
    //   15386: iflt -> 15400
    //   15389: ldc2_w -1269860377
    //   15392: l2i
    //   15393: ldc_w 1458936579
    //   15396: ixor
    //   15397: goto -> 15408
    //   15400: ldc2_w -1873749290
    //   15403: l2i
    //   15404: ldc_w -1945919967
    //   15407: ixor
    //   15408: ldc2_w 1438193580
    //   15411: l2i
    //   15412: ldc_w 1548963654
    //   15415: ixor
    //   15416: ixor
    //   15417: lookupswitch default -> 15444, -1496028051 -> 15400, -347032562 -> 23786
    //   15444: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   15447: getstatic Perryc.c : I
    //   15450: iflt -> 15464
    //   15453: ldc2_w -1923515986
    //   15456: l2i
    //   15457: ldc_w 63766331
    //   15460: ixor
    //   15461: goto -> 15472
    //   15464: ldc2_w 925029199
    //   15467: l2i
    //   15468: ldc_w 1031586756
    //   15471: ixor
    //   15472: ldc2_w 1411274586
    //   15475: l2i
    //   15476: ldc_w -1822820473
    //   15479: ixor
    //   15480: ixor
    //   15481: lookupswitch default -> 15508, -493081993 -> 15464, 1238509128 -> 24100
    //   15508: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   15511: getstatic Perryc.1 : I
    //   15514: ifeq -> 15528
    //   15517: ldc2_w -941347194
    //   15520: l2i
    //   15521: ldc_w -867658401
    //   15524: ixor
    //   15525: goto -> 15536
    //   15528: ldc2_w -1131797019
    //   15531: l2i
    //   15532: ldc_w 991258871
    //   15535: ixor
    //   15536: ldc2_w 1461144237
    //   15539: l2i
    //   15540: ldc_w 1698104161
    //   15543: ixor
    //   15544: ixor
    //   15545: lookupswitch default -> 24014, -1245772578 -> 15572, 965538325 -> 15528
    //   15572: getfield field_191988_bg : F
    //   15575: ldc_w 1.6540101E38
    //   15578: invokestatic floatToIntBits : (F)I
    //   15581: ldc_w 2130239015
    //   15584: ixor
    //   15585: invokestatic intBitsToFloat : (I)F
    //   15588: fcmpl
    //   15589: ifne -> 15603
    //   15592: ldc2_w -1738453747
    //   15595: l2i
    //   15596: ldc_w -265800633
    //   15599: ixor
    //   15600: goto -> 15611
    //   15603: ldc2_w -1425241267
    //   15606: l2i
    //   15607: ldc_w -1018826236
    //   15610: ixor
    //   15611: ldc2_w -1503402697
    //   15614: l2i
    //   15615: ldc_w 1303771596
    //   15618: ixor
    //   15619: ixor
    //   15620: tableswitch default -> 15592, -2086705743 -> 15644, -2086705742 -> 15904
    //   15644: getstatic Perryc.1 : I
    //   15647: ifeq -> 15661
    //   15650: ldc2_w -1890015687
    //   15653: l2i
    //   15654: ldc_w 2107529039
    //   15657: ixor
    //   15658: goto -> 15669
    //   15661: ldc2_w 1437086237
    //   15664: l2i
    //   15665: ldc_w -1412415442
    //   15668: ixor
    //   15669: ldc2_w -2061249426
    //   15672: l2i
    //   15673: ldc_w 669197198
    //   15676: ixor
    //   15677: ixor
    //   15678: lookupswitch default -> 24178, 1342572182 -> 15661, 1555596755 -> 15704
    //   15704: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   15707: getstatic Perryc.c : I
    //   15710: iflt -> 15724
    //   15713: ldc2_w 2017339143
    //   15716: l2i
    //   15717: ldc_w -1061460937
    //   15720: ixor
    //   15721: goto -> 15732
    //   15724: ldc2_w -372481438
    //   15727: l2i
    //   15728: ldc_w 1481606224
    //   15731: ixor
    //   15732: ldc2_w 613594427
    //   15735: l2i
    //   15736: ldc_w 2028036648
    //   15739: ixor
    //   15740: ixor
    //   15741: lookupswitch default -> 15768, -453602269 -> 24060, -202790291 -> 15724
    //   15768: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   15771: getstatic Perryc.0 : I
    //   15774: ifle -> 15788
    //   15777: ldc2_w 123551759
    //   15780: l2i
    //   15781: ldc_w -417093024
    //   15784: ixor
    //   15785: goto -> 15796
    //   15788: ldc2_w -442095297
    //   15791: l2i
    //   15792: ldc_w -937273070
    //   15795: ixor
    //   15796: ldc2_w -1082318986
    //   15799: l2i
    //   15800: ldc_w 2008881561
    //   15803: ixor
    //   15804: ixor
    //   15805: lookupswitch default -> 24046, -448497982 -> 15832, 683601024 -> 15788
    //   15832: getfield field_70702_br : F
    //   15835: ldc_w 2.8631406E38
    //   15838: invokestatic floatToIntBits : (F)I
    //   15841: ldc_w 2136434197
    //   15844: ixor
    //   15845: invokestatic intBitsToFloat : (I)F
    //   15848: fcmpl
    //   15849: ifeq -> 15863
    //   15852: ldc2_w 506223787
    //   15855: l2i
    //   15856: ldc_w -778346992
    //   15859: ixor
    //   15860: goto -> 15871
    //   15863: ldc2_w -424554200
    //   15866: l2i
    //   15867: ldc_w 688313232
    //   15870: ixor
    //   15871: ldc2_w -2079118219
    //   15874: l2i
    //   15875: ldc_w 1799984047
    //   15878: ixor
    //   15879: ixor
    //   15880: tableswitch default -> 15852, 552451425 -> 15904, 552451426 -> 15915
    //   15904: ldc2_w 240377130
    //   15907: l2i
    //   15908: ldc_w 240377131
    //   15911: ixor
    //   15912: goto -> 15923
    //   15915: ldc2_w -977187149
    //   15918: l2i
    //   15919: ldc_w -977187149
    //   15922: ixor
    //   15923: getstatic Perryc.0 : I
    //   15926: ifle -> 15940
    //   15929: ldc2_w 1386256129
    //   15932: l2i
    //   15933: ldc_w -387681134
    //   15936: ixor
    //   15937: goto -> 15948
    //   15940: ldc2_w -1655370995
    //   15943: l2i
    //   15944: ldc_w -1196675779
    //   15947: ixor
    //   15948: ldc2_w -2063354136
    //   15951: l2i
    //   15952: ldc_w -448727248
    //   15955: ixor
    //   15956: ixor
    //   15957: lookupswitch default -> 15984, -637033909 -> 24168, 200414762 -> 15940
    //   15984: putfield stage : I
    //   15987: getstatic Perryc.1 : I
    //   15990: ifeq -> 16004
    //   15993: ldc2_w 1565002245
    //   15996: l2i
    //   15997: ldc_w -486771371
    //   16000: ixor
    //   16001: goto -> 16012
    //   16004: ldc2_w 553273130
    //   16007: l2i
    //   16008: ldc_w -1531895721
    //   16011: ixor
    //   16012: ldc2_w 1346462044
    //   16015: l2i
    //   16016: ldc_w 1496097793
    //   16019: ixor
    //   16020: ixor
    //   16021: lookupswitch default -> 24076, -1926847968 -> 16048, -1227245043 -> 16004
    //   16048: aload_0
    //   16049: getstatic Perryc.c : I
    //   16052: iflt -> 16066
    //   16055: ldc2_w -330262892
    //   16058: l2i
    //   16059: ldc_w 1623546053
    //   16062: ixor
    //   16063: goto -> 16074
    //   16066: ldc2_w -1095954001
    //   16069: l2i
    //   16070: ldc_w 1651688987
    //   16073: ixor
    //   16074: ldc2_w 763669466
    //   16077: l2i
    //   16078: ldc_w 164801573
    //   16081: ixor
    //   16082: ixor
    //   16083: lookupswitch default -> 24180, -1463563858 -> 16066, -125185973 -> 16108
    //   16108: aload_0
    //   16109: getstatic Perryc.0 : I
    //   16112: ifle -> 16126
    //   16115: ldc2_w 1663378934
    //   16118: l2i
    //   16119: ldc_w -1313293770
    //   16122: ixor
    //   16123: goto -> 16134
    //   16126: ldc2_w 1591725184
    //   16129: l2i
    //   16130: ldc_w -898752077
    //   16133: ixor
    //   16134: ldc2_w 671624032
    //   16137: l2i
    //   16138: ldc_w -1688921412
    //   16141: ixor
    //   16142: ixor
    //   16143: lookupswitch default -> 23856, 669834479 -> 16168, 1640017436 -> 16126
    //   16168: getfield lastDist : D
    //   16171: getstatic Perryc.0 : I
    //   16174: ifle -> 16188
    //   16177: ldc2_w 881298094
    //   16180: l2i
    //   16181: ldc_w -1010136043
    //   16184: ixor
    //   16185: goto -> 16196
    //   16188: ldc2_w -44523842
    //   16191: l2i
    //   16192: ldc_w 1067601376
    //   16195: ixor
    //   16196: ldc2_w -2025589256
    //   16199: l2i
    //   16200: ldc_w 454387529
    //   16203: ixor
    //   16204: ixor
    //   16205: lookupswitch default -> 16232, -393940286 -> 16188, 1796969482 -> 23648
    //   16232: aload_0
    //   16233: getstatic Perryc.c : I
    //   16236: iflt -> 16250
    //   16239: ldc2_w -1639942477
    //   16242: l2i
    //   16243: ldc_w 49911962
    //   16246: ixor
    //   16247: goto -> 16258
    //   16250: ldc2_w -1994414421
    //   16253: l2i
    //   16254: ldc_w 1312579121
    //   16257: ixor
    //   16258: ldc2_w -1946907562
    //   16261: l2i
    //   16262: ldc_w -1940045938
    //   16265: ixor
    //   16266: ixor
    //   16267: lookupswitch default -> 23782, -1693426191 -> 16250, -1064678590 -> 16292
    //   16292: getfield lastDist : D
    //   16295: getstatic Perryc.1 : I
    //   16298: ifeq -> 16312
    //   16301: ldc2_w -1769123527
    //   16304: l2i
    //   16305: ldc_w -185927684
    //   16308: ixor
    //   16309: goto -> 16320
    //   16312: ldc2_w 1014630830
    //   16315: l2i
    //   16316: ldc_w -1528910474
    //   16319: ixor
    //   16320: ldc2_w -2078904965
    //   16323: l2i
    //   16324: ldc_w 1918856935
    //   16327: ixor
    //   16328: ixor
    //   16329: lookupswitch default -> 23586, -1808882343 -> 16312, 1861068612 -> 16356
    //   16356: aload_0
    //   16357: getstatic Perryc.0 : I
    //   16360: ifle -> 16374
    //   16363: ldc2_w 1288119437
    //   16366: l2i
    //   16367: ldc_w 1668869797
    //   16370: ixor
    //   16371: goto -> 16382
    //   16374: ldc2_w 1142899925
    //   16377: l2i
    //   16378: ldc_w 1633919673
    //   16381: ixor
    //   16382: ldc2_w 1559030622
    //   16385: l2i
    //   16386: ldc_w 341002156
    //   16389: ixor
    //   16390: ixor
    //   16391: lookupswitch default -> 23652, 1728079578 -> 16374, 1841515166 -> 16416
    //   16416: getfield dFactor : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16419: getstatic Perryc.0 : I
    //   16422: ifle -> 16436
    //   16425: ldc2_w 1561152329
    //   16428: l2i
    //   16429: ldc_w 1452373267
    //   16432: ixor
    //   16433: goto -> 16444
    //   16436: ldc2_w 1844538792
    //   16439: l2i
    //   16440: ldc_w 1473698504
    //   16443: ixor
    //   16444: ldc2_w -1457658778
    //   16447: l2i
    //   16448: ldc_w -613874411
    //   16451: ixor
    //   16452: ixor
    //   16453: lookupswitch default -> 23734, 1213421075 -> 16480, 2045304617 -> 16436
    //   16480: goto -> 16484
    //   16483: athrow
    //   16484: invokevirtual getValue : ()Ljava/lang/Object;
    //   16487: goto -> 16491
    //   16490: athrow
    //   16491: checkcast java/lang/Integer
    //   16494: getstatic Perryc.1 : I
    //   16497: ifeq -> 16511
    //   16500: ldc2_w -132955965
    //   16503: l2i
    //   16504: ldc_w 1505356550
    //   16507: ixor
    //   16508: goto -> 16519
    //   16511: ldc2_w -371406054
    //   16514: l2i
    //   16515: ldc_w 812271307
    //   16518: ixor
    //   16519: ldc2_w 911369198
    //   16522: l2i
    //   16523: ldc_w 348280798
    //   16526: ixor
    //   16527: ixor
    //   16528: lookupswitch default -> 23860, -2093309963 -> 16511, -81348127 -> 16556
    //   16556: goto -> 16560
    //   16559: athrow
    //   16560: invokevirtual intValue : ()I
    //   16563: goto -> 16567
    //   16566: athrow
    //   16567: i2d
    //   16568: ddiv
    //   16569: dsub
    //   16570: getstatic Perryc.0 : I
    //   16573: ifle -> 16587
    //   16576: ldc2_w 1443945551
    //   16579: l2i
    //   16580: ldc_w 545902602
    //   16583: ixor
    //   16584: goto -> 16595
    //   16587: ldc2_w 608157040
    //   16590: l2i
    //   16591: ldc_w -170624562
    //   16594: ixor
    //   16595: ldc2_w 1013102790
    //   16598: l2i
    //   16599: ldc_w -1339996928
    //   16602: ixor
    //   16603: ixor
    //   16604: lookupswitch default -> 16632, -86314621 -> 24124, 540082228 -> 16587
    //   16632: putfield moveSpeed : D
    //   16635: getstatic Perryc.0 : I
    //   16638: ifle -> 16652
    //   16641: ldc2_w 1292483072
    //   16644: l2i
    //   16645: ldc_w -2065588757
    //   16648: ixor
    //   16649: goto -> 16660
    //   16652: ldc2_w 495428658
    //   16655: l2i
    //   16656: ldc_w -127494364
    //   16659: ixor
    //   16660: ldc2_w -1558271697
    //   16663: l2i
    //   16664: ldc_w -419148440
    //   16667: ixor
    //   16668: ixor
    //   16669: lookupswitch default -> 23654, -1913470036 -> 16652, -1577330863 -> 16696
    //   16696: aload_0
    //   16697: getstatic Perryc.0 : I
    //   16700: ifle -> 16714
    //   16703: ldc2_w 820167133
    //   16706: l2i
    //   16707: ldc_w 326879176
    //   16710: ixor
    //   16711: goto -> 16722
    //   16714: ldc2_w 1253834213
    //   16717: l2i
    //   16718: ldc_w -178235437
    //   16721: ixor
    //   16722: ldc2_w 1553589667
    //   16725: l2i
    //   16726: ldc_w 1529496331
    //   16729: ixor
    //   16730: ixor
    //   16731: lookupswitch default -> 23658, -1201140578 -> 16756, 606773437 -> 16714
    //   16756: aload_0
    //   16757: getstatic Perryc.1 : I
    //   16760: ifeq -> 16774
    //   16763: ldc2_w 1478117237
    //   16766: l2i
    //   16767: ldc_w -40735636
    //   16770: ixor
    //   16771: goto -> 16782
    //   16774: ldc2_w 1424718670
    //   16777: l2i
    //   16778: ldc_w -1037652131
    //   16781: ixor
    //   16782: ldc2_w -602945485
    //   16785: l2i
    //   16786: ldc_w -1429411150
    //   16789: ixor
    //   16790: ixor
    //   16791: lookupswitch default -> 23918, -750057064 -> 16774, -535890286 -> 16816
    //   16816: getfield moveSpeed : D
    //   16819: getstatic Perryc.1 : I
    //   16822: ifeq -> 16836
    //   16825: ldc2_w -1990140823
    //   16828: l2i
    //   16829: ldc_w -1291660008
    //   16832: ixor
    //   16833: goto -> 16844
    //   16836: ldc2_w -819107885
    //   16839: l2i
    //   16840: ldc_w -375327244
    //   16843: ixor
    //   16844: ldc2_w 1001469520
    //   16847: l2i
    //   16848: ldc_w -1474735746
    //   16851: ixor
    //   16852: ixor
    //   16853: lookupswitch default -> 23672, -1446351265 -> 16836, -1255803639 -> 16880
    //   16880: goto -> 16884
    //   16883: athrow
    //   16884: invokestatic getBaseMoveSpeed : ()D
    //   16887: goto -> 16891
    //   16890: athrow
    //   16891: getstatic Perryc.0 : I
    //   16894: ifle -> 16908
    //   16897: ldc2_w 113577695
    //   16900: l2i
    //   16901: ldc_w 1066146684
    //   16904: ixor
    //   16905: goto -> 16916
    //   16908: ldc2_w 454347733
    //   16911: l2i
    //   16912: ldc_w -880522372
    //   16915: ixor
    //   16916: ldc2_w -993241979
    //   16919: l2i
    //   16920: ldc_w 1083466587
    //   16923: ixor
    //   16924: ixor
    //   16925: lookupswitch default -> 16952, -1122950531 -> 24084, 644907607 -> 16908
    //   16952: goto -> 16956
    //   16955: athrow
    //   16956: invokestatic max : (DD)D
    //   16959: goto -> 16963
    //   16962: athrow
    //   16963: getstatic Perryc.c : I
    //   16966: iflt -> 16980
    //   16969: ldc2_w -907228419
    //   16972: l2i
    //   16973: ldc_w 1561504836
    //   16976: ixor
    //   16977: goto -> 16988
    //   16980: ldc2_w -1089639545
    //   16983: l2i
    //   16984: ldc_w 1332738142
    //   16987: ixor
    //   16988: ldc2_w 188156973
    //   16991: l2i
    //   16992: ldc_w 1561438086
    //   16995: ixor
    //   16996: ixor
    //   16997: lookupswitch default -> 23832, -1505478542 -> 17024, -1025979118 -> 16980
    //   17024: putfield moveSpeed : D
    //   17027: getstatic Perryc.1 : I
    //   17030: ifeq -> 17044
    //   17033: ldc2_w -1559122714
    //   17036: l2i
    //   17037: ldc_w 222511693
    //   17040: ixor
    //   17041: goto -> 17052
    //   17044: ldc2_w 972515101
    //   17047: l2i
    //   17048: ldc_w -1816484632
    //   17051: ixor
    //   17052: ldc2_w -674893978
    //   17055: l2i
    //   17056: ldc_w -285220499
    //   17059: ixor
    //   17060: ixor
    //   17061: lookupswitch default -> 17088, -1754734432 -> 23784, 2013606695 -> 17044
    //   17088: aload_0
    //   17089: getstatic Perryc.0 : I
    //   17092: ifle -> 17106
    //   17095: ldc2_w -577098760
    //   17098: l2i
    //   17099: ldc_w -1065334390
    //   17102: ixor
    //   17103: goto -> 17114
    //   17106: ldc2_w 1431506469
    //   17109: l2i
    //   17110: ldc_w 1554266407
    //   17113: ixor
    //   17114: ldc2_w -1353225901
    //   17117: l2i
    //   17118: ldc_w 731830399
    //   17121: ixor
    //   17122: ixor
    //   17123: lookupswitch default -> 23572, -1925282258 -> 17148, -1714171042 -> 17106
    //   17148: getfield hopWait : Lbigname/zprestige/webhack/features/setting/Setting;
    //   17151: getstatic Perryc.1 : I
    //   17154: ifeq -> 17168
    //   17157: ldc2_w -7702127
    //   17160: l2i
    //   17161: ldc_w 594370139
    //   17164: ixor
    //   17165: goto -> 17176
    //   17168: ldc2_w 1525106137
    //   17171: l2i
    //   17172: ldc_w 1160721978
    //   17175: ixor
    //   17176: ldc2_w 1321209019
    //   17179: l2i
    //   17180: ldc_w 1482574429
    //   17183: ixor
    //   17184: ixor
    //   17185: lookupswitch default -> 17212, -898014932 -> 23834, 1856923547 -> 17168
    //   17212: goto -> 17216
    //   17215: athrow
    //   17216: invokevirtual getValue : ()Ljava/lang/Object;
    //   17219: goto -> 17223
    //   17222: athrow
    //   17223: checkcast java/lang/Boolean
    //   17226: getstatic Perryc.1 : I
    //   17229: ifeq -> 17243
    //   17232: ldc2_w -921842519
    //   17235: l2i
    //   17236: ldc_w -628407002
    //   17239: ixor
    //   17240: goto -> 17251
    //   17243: ldc2_w -62704774
    //   17246: l2i
    //   17247: ldc_w 1430252295
    //   17250: ixor
    //   17251: ldc2_w 627895193
    //   17254: l2i
    //   17255: ldc_w 1296039425
    //   17258: ixor
    //   17259: ixor
    //   17260: lookupswitch default -> 17288, 955236439 -> 17243, 2077596695 -> 24094
    //   17288: goto -> 17292
    //   17291: athrow
    //   17292: invokevirtual booleanValue : ()Z
    //   17295: goto -> 17299
    //   17298: athrow
    //   17299: ifeq -> 17313
    //   17302: ldc2_w 897914175
    //   17305: l2i
    //   17306: ldc_w 1930172599
    //   17309: ixor
    //   17310: goto -> 17321
    //   17313: ldc2_w -202640687
    //   17316: l2i
    //   17317: ldc_w -1251803304
    //   17320: ixor
    //   17321: ldc2_w -1403816372
    //   17324: l2i
    //   17325: ldc_w -63829214
    //   17328: ixor
    //   17329: ixor
    //   17330: tableswitch default -> 17302, 384332006 -> 17352, 384332007 -> 18055
    //   17352: getstatic Perryc.0 : I
    //   17355: ifle -> 17369
    //   17358: ldc2_w -1440685451
    //   17361: l2i
    //   17362: ldc_w 675636399
    //   17365: ixor
    //   17366: goto -> 17377
    //   17369: ldc2_w 1020600626
    //   17372: l2i
    //   17373: ldc_w -951691949
    //   17376: ixor
    //   17377: ldc2_w -386769188
    //   17380: l2i
    //   17381: ldc_w -236262900
    //   17384: ixor
    //   17385: ixor
    //   17386: lookupswitch default -> 17412, -1686294006 -> 24108, -624589628 -> 17369
    //   17412: aload_0
    //   17413: getstatic Perryc.0 : I
    //   17416: ifle -> 17430
    //   17419: ldc2_w 1147490980
    //   17422: l2i
    //   17423: ldc_w 98943973
    //   17426: ixor
    //   17427: goto -> 17438
    //   17430: ldc2_w -1871032743
    //   17433: l2i
    //   17434: ldc_w -46353147
    //   17437: ixor
    //   17438: ldc2_w 881703428
    //   17441: l2i
    //   17442: ldc_w -1042424497
    //   17445: ixor
    //   17446: ixor
    //   17447: lookupswitch default -> 17472, -1261373942 -> 24090, -462028474 -> 17430
    //   17472: getfield limiter2 : Lbigname/zprestige/webhack/features/setting/Setting;
    //   17475: getstatic Perryc.0 : I
    //   17478: ifle -> 17492
    //   17481: ldc2_w 329571290
    //   17484: l2i
    //   17485: ldc_w 1382826556
    //   17488: ixor
    //   17489: goto -> 17500
    //   17492: ldc2_w 1585079569
    //   17495: l2i
    //   17496: ldc_w 302712800
    //   17499: ixor
    //   17500: ldc2_w 1111825157
    //   17503: l2i
    //   17504: ldc_w -2015180612
    //   17507: ixor
    //   17508: ixor
    //   17509: lookupswitch default -> 17536, -2073081249 -> 24142, -67022576 -> 17492
    //   17536: goto -> 17540
    //   17539: athrow
    //   17540: invokevirtual getValue : ()Ljava/lang/Object;
    //   17543: goto -> 17547
    //   17546: athrow
    //   17547: checkcast java/lang/Boolean
    //   17550: getstatic Perryc.c : I
    //   17553: iflt -> 17567
    //   17556: ldc2_w 122439888
    //   17559: l2i
    //   17560: ldc_w -1591171557
    //   17563: ixor
    //   17564: goto -> 17575
    //   17567: ldc2_w 190550944
    //   17570: l2i
    //   17571: ldc_w 1357936546
    //   17574: ixor
    //   17575: ldc2_w -389273653
    //   17578: l2i
    //   17579: ldc_w 1952322424
    //   17582: ixor
    //   17583: ixor
    //   17584: lookupswitch default -> 17612, -1015820166 -> 17567, 989256312 -> 23588
    //   17612: goto -> 17616
    //   17615: athrow
    //   17616: invokevirtual booleanValue : ()Z
    //   17619: goto -> 17623
    //   17622: athrow
    //   17623: ifeq -> 17637
    //   17626: ldc2_w -140398002
    //   17629: l2i
    //   17630: ldc_w 2015644982
    //   17633: ixor
    //   17634: goto -> 17645
    //   17637: ldc2_w -1788105980
    //   17640: l2i
    //   17641: ldc_w 451826813
    //   17644: ixor
    //   17645: ldc2_w -1756592513
    //   17648: l2i
    //   17649: ldc_w -351749551
    //   17652: ixor
    //   17653: ixor
    //   17654: tableswitch default -> 17626, -205405354 -> 17676, -205405353 -> 18055
    //   17676: getstatic Perryc.c : I
    //   17679: iflt -> 17693
    //   17682: ldc2_w 1094438227
    //   17685: l2i
    //   17686: ldc_w 2031584723
    //   17689: ixor
    //   17690: goto -> 17701
    //   17693: ldc2_w 1930591831
    //   17696: l2i
    //   17697: ldc_w 1212832628
    //   17700: ixor
    //   17701: ldc2_w 1461045062
    //   17704: l2i
    //   17705: ldc_w 1107739562
    //   17708: ixor
    //   17709: ixor
    //   17710: lookupswitch default -> 17736, 759123052 -> 23604, 2130774239 -> 17693
    //   17736: aload_0
    //   17737: getstatic Perryc.0 : I
    //   17740: ifle -> 17754
    //   17743: ldc2_w -20558080
    //   17746: l2i
    //   17747: ldc_w 1912703106
    //   17750: ixor
    //   17751: goto -> 17762
    //   17754: ldc2_w -511577030
    //   17757: l2i
    //   17758: ldc_w -1900047265
    //   17761: ixor
    //   17762: ldc2_w -2065435993
    //   17765: l2i
    //   17766: ldc_w -198744476
    //   17769: ixor
    //   17770: ixor
    //   17771: lookupswitch default -> 17796, -1108642512 -> 17754, -66890943 -> 23788
    //   17796: getfield hops : I
    //   17799: ldc2_w 1154610486
    //   17802: l2i
    //   17803: ldc_w 1154610484
    //   17806: ixor
    //   17807: if_icmpge -> 17821
    //   17810: ldc2_w 43772288
    //   17813: l2i
    //   17814: ldc_w -1874331180
    //   17817: ixor
    //   17818: goto -> 17829
    //   17821: ldc2_w 567538852
    //   17824: l2i
    //   17825: ldc_w -1290803983
    //   17828: ixor
    //   17829: ldc2_w -220843273
    //   17832: l2i
    //   17833: ldc_w -1061007525
    //   17836: ixor
    //   17837: ixor
    //   17838: tableswitch default -> 17810, -1597477384 -> 17860, -1597477383 -> 18055
    //   17860: getstatic Perryc.0 : I
    //   17863: ifle -> 17877
    //   17866: ldc2_w 2051630919
    //   17869: l2i
    //   17870: ldc_w 1777474913
    //   17873: ixor
    //   17874: goto -> 17885
    //   17877: ldc2_w 1496453496
    //   17880: l2i
    //   17881: ldc_w 1131417612
    //   17884: ixor
    //   17885: ldc2_w 1681505844
    //   17888: l2i
    //   17889: ldc_w -1663209299
    //   17892: ixor
    //   17893: ixor
    //   17894: lookupswitch default -> 23912, -492384275 -> 17920, -346049345 -> 17877
    //   17920: aload_0
    //   17921: getstatic Perryc.0 : I
    //   17924: ifle -> 17938
    //   17927: ldc2_w -1363888312
    //   17930: l2i
    //   17931: ldc_w 2091552752
    //   17934: ixor
    //   17935: goto -> 17946
    //   17938: ldc2_w -655900278
    //   17941: l2i
    //   17942: ldc_w 1187217946
    //   17945: ixor
    //   17946: ldc2_w -2117457657
    //   17949: l2i
    //   17950: ldc_w -294697030
    //   17953: ixor
    //   17954: ixor
    //   17955: lookupswitch default -> 17980, -1111796219 -> 23800, 763838730 -> 17938
    //   17980: goto -> 17984
    //   17983: athrow
    //   17984: invokestatic getMaxSpeed : ()D
    //   17987: goto -> 17991
    //   17990: athrow
    //   17991: getstatic Perryc.1 : I
    //   17994: ifeq -> 18008
    //   17997: ldc2_w 1777735571
    //   18000: l2i
    //   18001: ldc_w -1326001416
    //   18004: ixor
    //   18005: goto -> 18016
    //   18008: ldc2_w -1331756208
    //   18011: l2i
    //   18012: ldc_w -2011902722
    //   18015: ixor
    //   18016: ldc2_w 388112746
    //   18019: l2i
    //   18020: ldc_w -61105620
    //   18023: ixor
    //   18024: ixor
    //   18025: lookupswitch default -> 18052, 210152095 -> 18008, 846822957 -> 24040
    //   18052: putfield moveSpeed : D
    //   18055: getstatic Perryc.1 : I
    //   18058: ifeq -> 18072
    //   18061: ldc2_w 1684479464
    //   18064: l2i
    //   18065: ldc_w 2013735268
    //   18068: ixor
    //   18069: goto -> 18080
    //   18072: ldc2_w 170104670
    //   18075: l2i
    //   18076: ldc_w -996326605
    //   18079: ixor
    //   18080: ldc2_w 748626454
    //   18083: l2i
    //   18084: ldc_w -590337325
    //   18087: ixor
    //   18088: ixor
    //   18089: lookupswitch default -> 18116, -332448695 -> 24072, 1972107258 -> 18072
    //   18116: fload_2
    //   18117: ldc_w 4.5013335E37
    //   18120: invokestatic floatToIntBits : (F)I
    //   18123: ldc_w 2114417923
    //   18126: ixor
    //   18127: invokestatic intBitsToFloat : (I)F
    //   18130: fcmpl
    //   18131: ifne -> 18145
    //   18134: ldc2_w 672098984
    //   18137: l2i
    //   18138: ldc_w -38922562
    //   18141: ixor
    //   18142: goto -> 18153
    //   18145: ldc2_w 1948171529
    //   18148: l2i
    //   18149: ldc_w -1581268706
    //   18152: ixor
    //   18153: ldc2_w 1796633374
    //   18156: l2i
    //   18157: ldc_w 1433008060
    //   18160: ixor
    //   18161: ixor
    //   18162: tableswitch default -> 18134, -337708876 -> 18184, -337708875 -> 18750
    //   18184: getstatic Perryc.c : I
    //   18187: iflt -> 18201
    //   18190: ldc2_w -733249037
    //   18193: l2i
    //   18194: ldc_w -1720026794
    //   18197: ixor
    //   18198: goto -> 18209
    //   18201: ldc2_w -1052862731
    //   18204: l2i
    //   18205: ldc_w -625286059
    //   18208: ixor
    //   18209: ldc2_w -1141801438
    //   18212: l2i
    //   18213: ldc_w 182529134
    //   18216: ixor
    //   18217: ixor
    //   18218: lookupswitch default -> 18244, -725295108 -> 18201, -64902423 -> 24028
    //   18244: fload_3
    //   18245: ldc_w 1.9489962E38
    //   18248: invokestatic floatToIntBits : (F)I
    //   18251: ldc_w 2131927117
    //   18254: ixor
    //   18255: invokestatic intBitsToFloat : (I)F
    //   18258: fcmpl
    //   18259: ifne -> 18273
    //   18262: ldc2_w 1219199117
    //   18265: l2i
    //   18266: ldc_w -1898508563
    //   18269: ixor
    //   18270: goto -> 18281
    //   18273: ldc2_w -1508930139
    //   18276: l2i
    //   18277: ldc_w 1618150338
    //   18280: ixor
    //   18281: ldc2_w -1237767091
    //   18284: l2i
    //   18285: ldc_w -538077866
    //   18288: ixor
    //   18289: ixor
    //   18290: tableswitch default -> 18262, -1347930245 -> 18312, -1347930244 -> 18750
    //   18312: getstatic Perryc.1 : I
    //   18315: ifeq -> 18329
    //   18318: ldc2_w 189867699
    //   18321: l2i
    //   18322: ldc_w -290701893
    //   18325: ixor
    //   18326: goto -> 18337
    //   18329: ldc2_w -1305011651
    //   18332: l2i
    //   18333: ldc_w 1948537386
    //   18336: ixor
    //   18337: ldc2_w -1502375837
    //   18340: l2i
    //   18341: ldc_w -201305863
    //   18344: ixor
    //   18345: ixor
    //   18346: lookupswitch default -> 18372, -1215374446 -> 23720, 408635884 -> 18329
    //   18372: aload_1
    //   18373: ldc2_w 1.402383895553638E308
    //   18376: invokestatic doubleToLongBits : (D)J
    //   18379: ldc2_w 9216887771552801143
    //   18382: lxor
    //   18383: invokestatic longBitsToDouble : (J)D
    //   18386: getstatic Perryc.c : I
    //   18389: iflt -> 18403
    //   18392: ldc2_w -1481498630
    //   18395: l2i
    //   18396: ldc_w -278571619
    //   18399: ixor
    //   18400: goto -> 18411
    //   18403: ldc2_w -566310085
    //   18406: l2i
    //   18407: ldc_w -215568988
    //   18410: ixor
    //   18411: ldc2_w 895129431
    //   18414: l2i
    //   18415: ldc_w 1389915622
    //   18418: ixor
    //   18419: ixor
    //   18420: lookupswitch default -> 18448, -1876404294 -> 18403, 794144982 -> 23664
    //   18448: goto -> 18452
    //   18451: athrow
    //   18452: invokevirtual setX : (D)V
    //   18455: goto -> 18459
    //   18458: athrow
    //   18459: getstatic Perryc.0 : I
    //   18462: ifle -> 18476
    //   18465: ldc2_w -342671784
    //   18468: l2i
    //   18469: ldc_w -708538964
    //   18472: ixor
    //   18473: goto -> 18484
    //   18476: ldc2_w 1114063810
    //   18479: l2i
    //   18480: ldc_w -2146251129
    //   18483: ixor
    //   18484: ldc2_w -1016207134
    //   18487: l2i
    //   18488: ldc_w -1745496195
    //   18491: ixor
    //   18492: ixor
    //   18493: lookupswitch default -> 18520, 724189376 -> 18476, 1791986795 -> 23702
    //   18520: aload_1
    //   18521: ldc2_w 1.5811777417444862E308
    //   18524: invokestatic doubleToLongBits : (D)J
    //   18527: ldc2_w 9217783603976551165
    //   18530: lxor
    //   18531: invokestatic longBitsToDouble : (J)D
    //   18534: getstatic Perryc.0 : I
    //   18537: ifle -> 18551
    //   18540: ldc2_w -454647679
    //   18543: l2i
    //   18544: ldc_w 1710746898
    //   18547: ixor
    //   18548: goto -> 18559
    //   18551: ldc2_w 2099534166
    //   18554: l2i
    //   18555: ldc_w 932759443
    //   18558: ixor
    //   18559: ldc2_w -1386940475
    //   18562: l2i
    //   18563: ldc_w 1073461446
    //   18566: ixor
    //   18567: ixor
    //   18568: lookupswitch default -> 18596, 331219600 -> 24020, 2016827719 -> 18551
    //   18596: goto -> 18600
    //   18599: athrow
    //   18600: invokevirtual setZ : (D)V
    //   18603: goto -> 18607
    //   18606: athrow
    //   18607: getstatic Perryc.0 : I
    //   18610: ifle -> 18624
    //   18613: ldc2_w -1320188224
    //   18616: l2i
    //   18617: ldc_w 199960683
    //   18620: ixor
    //   18621: goto -> 18632
    //   18624: ldc2_w -315404185
    //   18627: l2i
    //   18628: ldc_w 1998153156
    //   18631: ixor
    //   18632: ldc2_w 1683199740
    //   18635: l2i
    //   18636: ldc_w 818099005
    //   18639: ixor
    //   18640: ixor
    //   18641: lookupswitch default -> 18668, -1280916043 -> 18624, -298579094 -> 23874
    //   18668: aload_0
    //   18669: ldc2_w 1.1387085911820287E308
    //   18672: invokestatic doubleToLongBits : (D)J
    //   18675: ldc2_w 9215566647296957856
    //   18678: lxor
    //   18679: invokestatic longBitsToDouble : (J)D
    //   18682: getstatic Perryc.1 : I
    //   18685: ifeq -> 18699
    //   18688: ldc2_w -234822481
    //   18691: l2i
    //   18692: ldc_w 753672819
    //   18695: ixor
    //   18696: goto -> 18707
    //   18699: ldc2_w -663688569
    //   18702: l2i
    //   18703: ldc_w 1577294418
    //   18706: ixor
    //   18707: ldc2_w 1768629717
    //   18710: l2i
    //   18711: ldc_w -1976759294
    //   18714: ixor
    //   18715: ixor
    //   18716: lookupswitch default -> 24182, 1034612491 -> 18699, 1697995010 -> 18744
    //   18744: putfield moveSpeed : D
    //   18747: goto -> 20265
    //   18750: getstatic Perryc.c : I
    //   18753: iflt -> 18767
    //   18756: ldc2_w -1318199466
    //   18759: l2i
    //   18760: ldc_w 347621115
    //   18763: ixor
    //   18764: goto -> 18775
    //   18767: ldc2_w 1321377027
    //   18770: l2i
    //   18771: ldc_w 1836484457
    //   18774: ixor
    //   18775: ldc2_w 587433854
    //   18778: l2i
    //   18779: ldc_w -1319567366
    //   18782: ixor
    //   18783: ixor
    //   18784: lookupswitch default -> 23868, -1309711634 -> 18812, 932110633 -> 18767
    //   18812: fload_2
    //   18813: ldc_w 1.9404556E38
    //   18816: invokestatic floatToIntBits : (F)I
    //   18819: ldc_w 2131885009
    //   18822: ixor
    //   18823: invokestatic intBitsToFloat : (I)F
    //   18826: fcmpl
    //   18827: ifeq -> 18841
    //   18830: ldc2_w 263552192
    //   18833: l2i
    //   18834: ldc_w 583313023
    //   18837: ixor
    //   18838: goto -> 18849
    //   18841: ldc2_w -697276465
    //   18844: l2i
    //   18845: ldc_w -83772081
    //   18848: ixor
    //   18849: ldc2_w -844981054
    //   18852: l2i
    //   18853: ldc_w -1231282526
    //   18856: ixor
    //   18857: ixor
    //   18858: tableswitch default -> 18830, 1448040671 -> 18880, 1448040672 -> 20265
    //   18880: getstatic Perryc.0 : I
    //   18883: ifle -> 18897
    //   18886: ldc2_w 476178558
    //   18889: l2i
    //   18890: ldc_w 1591718604
    //   18893: ixor
    //   18894: goto -> 18905
    //   18897: ldc2_w 1561063558
    //   18900: l2i
    //   18901: ldc_w -98899773
    //   18904: ixor
    //   18905: ldc2_w -1606743427
    //   18908: l2i
    //   18909: ldc_w -1403483615
    //   18912: ixor
    //   18913: ixor
    //   18914: lookupswitch default -> 23830, -1418553319 -> 18940, 1323162350 -> 18897
    //   18940: fload_3
    //   18941: ldc_w 4.216729
    //   18944: invokestatic floatToIntBits : (F)I
    //   18947: ldc_w 2131160946
    //   18950: ixor
    //   18951: invokestatic intBitsToFloat : (I)F
    //   18954: fcmpl
    //   18955: iflt -> 18969
    //   18958: ldc2_w 1134335913
    //   18961: l2i
    //   18962: ldc_w -757660201
    //   18965: ixor
    //   18966: goto -> 18977
    //   18969: ldc2_w -1012457597
    //   18972: l2i
    //   18973: ldc_w 1391234556
    //   18976: ixor
    //   18977: ldc2_w -616346181
    //   18980: l2i
    //   18981: ldc_w 1960121867
    //   18984: ixor
    //   18985: ixor
    //   18986: tableswitch default -> 18958, 1054722510 -> 19008, 1054722511 -> 19372
    //   19008: getstatic Perryc.1 : I
    //   19011: ifeq -> 19025
    //   19014: ldc2_w 759192145
    //   19017: l2i
    //   19018: ldc_w 2067534142
    //   19021: ixor
    //   19022: goto -> 19033
    //   19025: ldc2_w 1132862007
    //   19028: l2i
    //   19029: ldc_w -1332830364
    //   19032: ixor
    //   19033: ldc2_w 57569188
    //   19036: l2i
    //   19037: ldc_w -956000010
    //   19040: ixor
    //   19041: ixor
    //   19042: lookupswitch default -> 19068, -1844003779 -> 23580, 1814814560 -> 19025
    //   19068: fload #4
    //   19070: getstatic Perryc.c : I
    //   19073: iflt -> 19087
    //   19076: ldc2_w 675286907
    //   19079: l2i
    //   19080: ldc_w -924287219
    //   19083: ixor
    //   19084: goto -> 19095
    //   19087: ldc2_w -1902236860
    //   19090: l2i
    //   19091: ldc_w -928831437
    //   19094: ixor
    //   19095: ldc2_w 920348009
    //   19098: l2i
    //   19099: ldc_w -671689209
    //   19102: ixor
    //   19103: ixor
    //   19104: lookupswitch default -> 19132, 25543448 -> 23958, 98754623 -> 19087
    //   19132: fload_2
    //   19133: ldc_w 2.5611264E38
    //   19136: invokestatic floatToIntBits : (F)I
    //   19139: ldc_w 2134945152
    //   19142: ixor
    //   19143: invokestatic intBitsToFloat : (I)F
    //   19146: fcmpl
    //   19147: ifle -> 19161
    //   19150: ldc2_w 819935309
    //   19153: l2i
    //   19154: ldc_w -180386619
    //   19157: ixor
    //   19158: goto -> 19169
    //   19161: ldc2_w 972376005
    //   19164: l2i
    //   19165: ldc_w -65668276
    //   19168: ixor
    //   19169: ldc2_w 1237962585
    //   19172: l2i
    //   19173: ldc_w -336301279
    //   19176: ixor
    //   19177: ixor
    //   19178: tableswitch default -> 19150, 1742536944 -> 19200, 1742536945 -> 19216
    //   19200: ldc_w -0.027618999
    //   19203: invokestatic floatToIntBits : (F)I
    //   19206: ldc_w 2127970621
    //   19209: ixor
    //   19210: invokestatic intBitsToFloat : (I)F
    //   19213: goto -> 19229
    //   19216: ldc_w 0.047166154
    //   19219: invokestatic floatToIntBits : (F)I
    //   19222: ldc_w 2138386764
    //   19225: ixor
    //   19226: invokestatic intBitsToFloat : (I)F
    //   19229: fadd
    //   19230: getstatic Perryc.c : I
    //   19233: iflt -> 19247
    //   19236: ldc2_w 458608735
    //   19239: l2i
    //   19240: ldc_w -165169956
    //   19243: ixor
    //   19244: goto -> 19255
    //   19247: ldc2_w 2073687925
    //   19250: l2i
    //   19251: ldc_w 279757126
    //   19254: ixor
    //   19255: ldc2_w 1405442530
    //   19258: l2i
    //   19259: ldc_w -426460752
    //   19262: ixor
    //   19263: ixor
    //   19264: lookupswitch default -> 24172, -563816863 -> 19292, 1478722769 -> 19247
    //   19292: fstore #4
    //   19294: ldc_w 3.7890033E37
    //   19297: invokestatic floatToIntBits : (F)I
    //   19300: ldc_w 2112096983
    //   19303: ixor
    //   19304: invokestatic intBitsToFloat : (I)F
    //   19307: getstatic Perryc.0 : I
    //   19310: ifle -> 19324
    //   19313: ldc2_w -760529925
    //   19316: l2i
    //   19317: ldc_w 2006464212
    //   19320: ixor
    //   19321: goto -> 19332
    //   19324: ldc2_w 184901599
    //   19327: l2i
    //   19328: ldc_w -1294482849
    //   19331: ixor
    //   19332: ldc2_w 774223911
    //   19335: l2i
    //   19336: ldc_w -1776347289
    //   19339: ixor
    //   19340: ixor
    //   19341: lookupswitch default -> 19368, -1888948477 -> 19324, 487170671 -> 23948
    //   19368: fstore_3
    //   19369: goto -> 19861
    //   19372: getstatic Perryc.c : I
    //   19375: iflt -> 19389
    //   19378: ldc2_w 1142189340
    //   19381: l2i
    //   19382: ldc_w 1200911207
    //   19385: ixor
    //   19386: goto -> 19397
    //   19389: ldc2_w 411509962
    //   19392: l2i
    //   19393: ldc_w 1285079734
    //   19396: ixor
    //   19397: ldc2_w -1739198325
    //   19400: l2i
    //   19401: ldc_w 374130427
    //   19404: ixor
    //   19405: ixor
    //   19406: lookupswitch default -> 23988, -1919342581 -> 19389, -637087732 -> 19432
    //   19432: fload_3
    //   19433: ldc_w -4.2448273
    //   19436: invokestatic floatToIntBits : (F)I
    //   19439: ldc_w 2131219872
    //   19442: ixor
    //   19443: invokestatic intBitsToFloat : (I)F
    //   19446: fcmpg
    //   19447: ifgt -> 19461
    //   19450: ldc2_w -2144424240
    //   19453: l2i
    //   19454: ldc_w 2041255675
    //   19457: ixor
    //   19458: goto -> 19469
    //   19461: ldc2_w 1272820404
    //   19464: l2i
    //   19465: ldc_w -1302852960
    //   19468: ixor
    //   19469: ldc2_w -1596797572
    //   19472: l2i
    //   19473: ldc_w 653129672
    //   19476: ixor
    //   19477: ixor
    //   19478: tableswitch default -> 19450, 2142929567 -> 19500, 2142929568 -> 19861
    //   19500: getstatic Perryc.1 : I
    //   19503: ifeq -> 19517
    //   19506: ldc2_w -1739295879
    //   19509: l2i
    //   19510: ldc_w 1203435920
    //   19513: ixor
    //   19514: goto -> 19525
    //   19517: ldc2_w -1393367113
    //   19520: l2i
    //   19521: ldc_w -1758679955
    //   19524: ixor
    //   19525: ldc2_w -734015993
    //   19528: l2i
    //   19529: ldc_w 1956486773
    //   19532: ixor
    //   19533: ixor
    //   19534: lookupswitch default -> 23726, -1686365272 -> 19560, 2135743131 -> 19517
    //   19560: fload #4
    //   19562: getstatic Perryc.0 : I
    //   19565: ifle -> 19579
    //   19568: ldc2_w 227397301
    //   19571: l2i
    //   19572: ldc_w 1578067827
    //   19575: ixor
    //   19576: goto -> 19587
    //   19579: ldc2_w -1608600142
    //   19582: l2i
    //   19583: ldc_w 867414194
    //   19586: ixor
    //   19587: ldc2_w -1829143603
    //   19590: l2i
    //   19591: ldc_w 1286010709
    //   19594: ixor
    //   19595: ixor
    //   19596: lookupswitch default -> 23630, -1914886818 -> 19579, 1307740568 -> 19624
    //   19624: fload_2
    //   19625: ldc_w 3.2357824E37
    //   19628: invokestatic floatToIntBits : (F)I
    //   19631: ldc_w 2109914911
    //   19634: ixor
    //   19635: invokestatic intBitsToFloat : (I)F
    //   19638: fcmpl
    //   19639: ifle -> 19653
    //   19642: ldc2_w 753513519
    //   19645: l2i
    //   19646: ldc_w 639381538
    //   19649: ixor
    //   19650: goto -> 19661
    //   19653: ldc2_w 63460839
    //   19656: l2i
    //   19657: ldc_w 155046377
    //   19660: ixor
    //   19661: ldc2_w -1932518338
    //   19664: l2i
    //   19665: ldc_w -1032132634
    //   19668: ixor
    //   19669: ixor
    //   19670: tableswitch default -> 19642, 1147109333 -> 19692, 1147109334 -> 19708
    //   19692: ldc_w 0.01516893
    //   19695: invokestatic floatToIntBits : (F)I
    //   19698: ldc_w 2118944539
    //   19701: ixor
    //   19702: invokestatic intBitsToFloat : (I)F
    //   19705: goto -> 19721
    //   19708: ldc_w -0.023648987
    //   19711: invokestatic floatToIntBits : (F)I
    //   19714: ldc_w 2130033541
    //   19717: ixor
    //   19718: invokestatic intBitsToFloat : (I)F
    //   19721: fadd
    //   19722: getstatic Perryc.0 : I
    //   19725: ifle -> 19739
    //   19728: ldc2_w -617261638
    //   19731: l2i
    //   19732: ldc_w 284174758
    //   19735: ixor
    //   19736: goto -> 19747
    //   19739: ldc2_w -664285528
    //   19742: l2i
    //   19743: ldc_w -1384050592
    //   19746: ixor
    //   19747: ldc2_w -928095866
    //   19750: l2i
    //   19751: ldc_w -1191176804
    //   19754: ixor
    //   19755: ixor
    //   19756: lookupswitch default -> 19784, -1167390714 -> 23984, 291082348 -> 19739
    //   19784: fstore #4
    //   19786: ldc_w 2.0525172E38
    //   19789: invokestatic floatToIntBits : (F)I
    //   19792: ldc_w 2132437515
    //   19795: ixor
    //   19796: invokestatic intBitsToFloat : (I)F
    //   19799: getstatic Perryc.0 : I
    //   19802: ifle -> 19816
    //   19805: ldc2_w -1170986864
    //   19808: l2i
    //   19809: ldc_w -323626319
    //   19812: ixor
    //   19813: goto -> 19824
    //   19816: ldc2_w 1857483021
    //   19819: l2i
    //   19820: ldc_w -2123032385
    //   19823: ixor
    //   19824: ldc2_w -170167602
    //   19827: l2i
    //   19828: ldc_w -97133703
    //   19831: ixor
    //   19832: ixor
    //   19833: lookupswitch default -> 19860, -1442019487 -> 19816, 1500470166 -> 23684
    //   19860: fstore_3
    //   19861: getstatic Perryc.0 : I
    //   19864: ifle -> 19878
    //   19867: ldc2_w 519304420
    //   19870: l2i
    //   19871: ldc_w -687899612
    //   19874: ixor
    //   19875: goto -> 19886
    //   19878: ldc2_w 760070516
    //   19881: l2i
    //   19882: ldc_w -1342703967
    //   19885: ixor
    //   19886: ldc2_w -272941625
    //   19889: l2i
    //   19890: ldc_w -516940078
    //   19893: ixor
    //   19894: ixor
    //   19895: lookupswitch default -> 24098, -1942940480 -> 19920, -964187179 -> 19878
    //   19920: fload_2
    //   19921: ldc_w 9.890915E37
    //   19924: invokestatic floatToIntBits : (F)I
    //   19927: ldc_w 2123682411
    //   19930: ixor
    //   19931: invokestatic intBitsToFloat : (I)F
    //   19934: fcmpl
    //   19935: ifle -> 19949
    //   19938: ldc2_w 652072276
    //   19941: l2i
    //   19942: ldc_w -302772921
    //   19945: ixor
    //   19946: goto -> 19957
    //   19949: ldc2_w 1474310452
    //   19952: l2i
    //   19953: ldc_w -1664489178
    //   19956: ixor
    //   19957: ldc2_w 1585988692
    //   19960: l2i
    //   19961: ldc_w 2072824899
    //   19964: ixor
    //   19965: ixor
    //   19966: tableswitch default -> 19938, -299020284 -> 19988, -299020283 -> 20064
    //   19988: ldc_w 101.99108
    //   19991: invokestatic floatToIntBits : (F)I
    //   19994: ldc_w 2102131567
    //   19997: ixor
    //   19998: invokestatic intBitsToFloat : (I)F
    //   20001: getstatic Perryc.0 : I
    //   20004: ifle -> 20018
    //   20007: ldc2_w -761793569
    //   20010: l2i
    //   20011: ldc_w -1827889397
    //   20014: ixor
    //   20015: goto -> 20026
    //   20018: ldc2_w -309149211
    //   20021: l2i
    //   20022: ldc_w 1617293288
    //   20025: ixor
    //   20026: ldc2_w -1461867585
    //   20029: l2i
    //   20030: ldc_w -300738897
    //   20033: ixor
    //   20034: ixor
    //   20035: lookupswitch default -> 20060, 123064772 -> 23728, 777104690 -> 20018
    //   20060: fstore_2
    //   20061: goto -> 20265
    //   20064: getstatic Perryc.0 : I
    //   20067: ifle -> 20081
    //   20070: ldc2_w -517793670
    //   20073: l2i
    //   20074: ldc_w -334951825
    //   20077: ixor
    //   20078: goto -> 20089
    //   20081: ldc2_w 211238616
    //   20084: l2i
    //   20085: ldc_w 1647836639
    //   20088: ixor
    //   20089: ldc2_w -417981902
    //   20092: l2i
    //   20093: ldc_w 449637416
    //   20096: ixor
    //   20097: ixor
    //   20098: lookupswitch default -> 23954, -1820707555 -> 20124, -252648433 -> 20081
    //   20124: fload_2
    //   20125: ldc_w 1.3130026E38
    //   20128: invokestatic floatToIntBits : (F)I
    //   20131: ldc_w 2126876421
    //   20134: ixor
    //   20135: invokestatic intBitsToFloat : (I)F
    //   20138: fcmpg
    //   20139: ifge -> 20153
    //   20142: ldc2_w 236410025
    //   20145: l2i
    //   20146: ldc_w -127780549
    //   20149: ixor
    //   20150: goto -> 20161
    //   20153: ldc2_w -779067739
    //   20156: l2i
    //   20157: ldc_w 669332276
    //   20160: ixor
    //   20161: ldc2_w 798691098
    //   20164: l2i
    //   20165: ldc_w -1622145211
    //   20168: ixor
    //   20169: ixor
    //   20170: tableswitch default -> 20142, 1186883021 -> 20192, 1186883022 -> 20265
    //   20192: ldc_w -9.046855
    //   20195: invokestatic floatToIntBits : (F)I
    //   20198: ldc_w 2123415531
    //   20201: ixor
    //   20202: invokestatic intBitsToFloat : (I)F
    //   20205: getstatic Perryc.0 : I
    //   20208: ifle -> 20222
    //   20211: ldc2_w 1882253798
    //   20214: l2i
    //   20215: ldc_w -220639727
    //   20218: ixor
    //   20219: goto -> 20230
    //   20222: ldc2_w -1585244499
    //   20225: l2i
    //   20226: ldc_w -595227965
    //   20229: ixor
    //   20230: ldc2_w -236520957
    //   20233: l2i
    //   20234: ldc_w 28862008
    //   20237: ixor
    //   20238: ixor
    //   20239: lookupswitch default -> 23924, -1923612587 -> 20264, 1924611020 -> 20222
    //   20264: fstore_2
    //   20265: getstatic Perryc.c : I
    //   20268: iflt -> 20282
    //   20271: ldc2_w -1736167715
    //   20274: l2i
    //   20275: ldc_w 376044725
    //   20278: ixor
    //   20279: goto -> 20290
    //   20282: ldc2_w 294968078
    //   20285: l2i
    //   20286: ldc_w 1151022082
    //   20289: ixor
    //   20290: ldc2_w 969508881
    //   20293: l2i
    //   20294: ldc_w 2131183630
    //   20297: ixor
    //   20298: ixor
    //   20299: lookupswitch default -> 20324, -937225609 -> 23806, 2127926191 -> 20282
    //   20324: fload #4
    //   20326: ldc_w 0.07572797
    //   20329: invokestatic floatToIntBits : (F)I
    //   20332: ldc_w 2133792580
    //   20335: ixor
    //   20336: invokestatic intBitsToFloat : (I)F
    //   20339: fadd
    //   20340: f2d
    //   20341: getstatic Perryc.1 : I
    //   20344: ifeq -> 20358
    //   20347: ldc2_w -1348659442
    //   20350: l2i
    //   20351: ldc_w 1332941689
    //   20354: ixor
    //   20355: goto -> 20366
    //   20358: ldc2_w -417505688
    //   20361: l2i
    //   20362: ldc_w -650493845
    //   20365: ixor
    //   20366: ldc2_w -1463479497
    //   20369: l2i
    //   20370: ldc_w 1012001681
    //   20373: ixor
    //   20374: ixor
    //   20375: lookupswitch default -> 20400, 1476829836 -> 20358, 1954217169 -> 24010
    //   20400: goto -> 20404
    //   20403: athrow
    //   20404: invokestatic toRadians : (D)D
    //   20407: goto -> 20411
    //   20410: athrow
    //   20411: getstatic Perryc.1 : I
    //   20414: ifeq -> 20428
    //   20417: ldc2_w 1934504202
    //   20420: l2i
    //   20421: ldc_w 1418461688
    //   20424: ixor
    //   20425: goto -> 20436
    //   20428: ldc2_w -447015030
    //   20431: l2i
    //   20432: ldc_w 1935958028
    //   20435: ixor
    //   20436: ldc2_w -206717647
    //   20439: l2i
    //   20440: ldc_w -1883974446
    //   20443: ixor
    //   20444: ixor
    //   20445: lookupswitch default -> 20472, 1541101841 -> 24000, 1653249606 -> 20428
    //   20472: goto -> 20476
    //   20475: athrow
    //   20476: invokestatic cos : (D)D
    //   20479: goto -> 20483
    //   20482: athrow
    //   20483: getstatic Perryc.c : I
    //   20486: iflt -> 20500
    //   20489: ldc2_w -1478734472
    //   20492: l2i
    //   20493: ldc_w 594770616
    //   20496: ixor
    //   20497: goto -> 20508
    //   20500: ldc2_w -80820788
    //   20503: l2i
    //   20504: ldc_w 509125707
    //   20507: ixor
    //   20508: ldc2_w -1697832766
    //   20511: l2i
    //   20512: ldc_w -168128327
    //   20515: ixor
    //   20516: ixor
    //   20517: lookupswitch default -> 24080, -1975397892 -> 20544, -342325317 -> 20500
    //   20544: dstore #5
    //   20546: getstatic Perryc.0 : I
    //   20549: ifle -> 20563
    //   20552: ldc2_w -67448747
    //   20555: l2i
    //   20556: ldc_w 1090276757
    //   20559: ixor
    //   20560: goto -> 20571
    //   20563: ldc2_w 1230310154
    //   20566: l2i
    //   20567: ldc_w 1694493306
    //   20570: ixor
    //   20571: ldc2_w -1147185671
    //   20574: l2i
    //   20575: ldc_w 2039502171
    //   20578: ixor
    //   20579: ixor
    //   20580: lookupswitch default -> 20608, -675897147 -> 20563, 2030673250 -> 23770
    //   20608: fload #4
    //   20610: ldc_w 0.06512856
    //   20613: invokestatic floatToIntBits : (F)I
    //   20616: ldc_w 2133942815
    //   20619: ixor
    //   20620: invokestatic intBitsToFloat : (I)F
    //   20623: fadd
    //   20624: f2d
    //   20625: getstatic Perryc.c : I
    //   20628: iflt -> 20642
    //   20631: ldc2_w 987238466
    //   20634: l2i
    //   20635: ldc_w 1552842138
    //   20638: ixor
    //   20639: goto -> 20650
    //   20642: ldc2_w -1721103549
    //   20645: l2i
    //   20646: ldc_w 2064585821
    //   20649: ixor
    //   20650: ldc2_w -1208441678
    //   20653: l2i
    //   20654: ldc_w 32527269
    //   20657: ixor
    //   20658: ixor
    //   20659: lookupswitch default -> 23914, -799106353 -> 20642, 1416488969 -> 20684
    //   20684: goto -> 20688
    //   20687: athrow
    //   20688: invokestatic toRadians : (D)D
    //   20691: goto -> 20695
    //   20694: athrow
    //   20695: getstatic Perryc.1 : I
    //   20698: ifeq -> 20712
    //   20701: ldc2_w 1568963282
    //   20704: l2i
    //   20705: ldc_w 341197267
    //   20708: ixor
    //   20709: goto -> 20720
    //   20712: ldc2_w -19450088
    //   20715: l2i
    //   20716: ldc_w 1913987754
    //   20719: ixor
    //   20720: ldc2_w -2091616259
    //   20723: l2i
    //   20724: ldc_w 187422181
    //   20727: ixor
    //   20728: ixor
    //   20729: lookupswitch default -> 20756, -1414942450 -> 20712, -1045587687 -> 23776
    //   20756: goto -> 20760
    //   20759: athrow
    //   20760: invokestatic sin : (D)D
    //   20763: goto -> 20767
    //   20766: athrow
    //   20767: getstatic Perryc.1 : I
    //   20770: ifeq -> 20784
    //   20773: ldc2_w -48298382
    //   20776: l2i
    //   20777: ldc_w 269707664
    //   20780: ixor
    //   20781: goto -> 20792
    //   20784: ldc2_w -1031026085
    //   20787: l2i
    //   20788: ldc_w 1175196136
    //   20791: ixor
    //   20792: ldc2_w 19985542
    //   20795: l2i
    //   20796: ldc_w -1444623857
    //   20799: ixor
    //   20800: ixor
    //   20801: lookupswitch default -> 23700, 743695674 -> 20828, 1171804523 -> 20784
    //   20828: dstore #7
    //   20830: getstatic Perryc.0 : I
    //   20833: ifle -> 20847
    //   20836: ldc2_w -1622854598
    //   20839: l2i
    //   20840: ldc_w 621584530
    //   20843: ixor
    //   20844: goto -> 20855
    //   20847: ldc2_w 2097029195
    //   20850: l2i
    //   20851: ldc_w 294494760
    //   20854: ixor
    //   20855: ldc2_w -1423648927
    //   20858: l2i
    //   20859: ldc_w 1156893177
    //   20862: ixor
    //   20863: ixor
    //   20864: lookupswitch default -> 23772, -2103206661 -> 20892, 1436125744 -> 20847
    //   20892: aload_0
    //   20893: getstatic Perryc.0 : I
    //   20896: ifle -> 20910
    //   20899: ldc2_w 965459780
    //   20902: l2i
    //   20903: ldc_w -1637895584
    //   20906: ixor
    //   20907: goto -> 20918
    //   20910: ldc2_w 1504037340
    //   20913: l2i
    //   20914: ldc_w 532772720
    //   20917: ixor
    //   20918: ldc2_w 1887879225
    //   20921: l2i
    //   20922: ldc_w -195945473
    //   20925: ixor
    //   20926: ixor
    //   20927: lookupswitch default -> 20952, -1027235411 -> 20910, 587257570 -> 23598
    //   20952: getfield cooldownHops : I
    //   20955: ifne -> 20969
    //   20958: ldc2_w 2077793412
    //   20961: l2i
    //   20962: ldc_w 95886553
    //   20965: ixor
    //   20966: goto -> 20977
    //   20969: ldc2_w -1844636481
    //   20972: l2i
    //   20973: ldc_w -329083675
    //   20976: ixor
    //   20977: ldc2_w -971793870
    //   20980: l2i
    //   20981: ldc_w 2092594940
    //   20984: ixor
    //   20985: ixor
    //   20986: tableswitch default -> 20958, -993629037 -> 21008, -993629036 -> 22279
    //   21008: getstatic Perryc.c : I
    //   21011: iflt -> 21025
    //   21014: ldc2_w -481171558
    //   21017: l2i
    //   21018: ldc_w 56513785
    //   21021: ixor
    //   21022: goto -> 21033
    //   21025: ldc2_w 554363362
    //   21028: l2i
    //   21029: ldc_w 40875176
    //   21032: ixor
    //   21033: ldc2_w -32537067
    //   21036: l2i
    //   21037: ldc_w -1940303108
    //   21040: ixor
    //   21041: ixor
    //   21042: lookupswitch default -> 24008, -1839634550 -> 21025, 1362332067 -> 21068
    //   21068: aload_1
    //   21069: getstatic Perryc.0 : I
    //   21072: ifle -> 21086
    //   21075: ldc2_w 630476506
    //   21078: l2i
    //   21079: ldc_w 445487537
    //   21082: ixor
    //   21083: goto -> 21094
    //   21086: ldc2_w 1973608849
    //   21089: l2i
    //   21090: ldc_w 1057902866
    //   21093: ixor
    //   21094: ldc2_w -890733002
    //   21097: l2i
    //   21098: ldc_w -1534208646
    //   21101: ixor
    //   21102: ixor
    //   21103: lookupswitch default -> 21128, -156951504 -> 21086, 1367112743 -> 23996
    //   21128: fload_2
    //   21129: f2d
    //   21130: getstatic Perryc.c : I
    //   21133: iflt -> 21147
    //   21136: ldc2_w 1061395968
    //   21139: l2i
    //   21140: ldc_w -206374736
    //   21143: ixor
    //   21144: goto -> 21155
    //   21147: ldc2_w 1814339777
    //   21150: l2i
    //   21151: ldc_w -1724008899
    //   21154: ixor
    //   21155: ldc2_w 1343862573
    //   21158: l2i
    //   21159: ldc_w -1525768309
    //   21162: ixor
    //   21163: ixor
    //   21164: lookupswitch default -> 23704, 933466 -> 21192, 971394582 -> 21147
    //   21192: aload_0
    //   21193: getstatic Perryc.1 : I
    //   21196: ifeq -> 21210
    //   21199: ldc2_w -945573088
    //   21202: l2i
    //   21203: ldc_w 2091012309
    //   21206: ixor
    //   21207: goto -> 21218
    //   21210: ldc2_w 2143981808
    //   21213: l2i
    //   21214: ldc_w 1552689142
    //   21217: ixor
    //   21218: ldc2_w 685187947
    //   21221: l2i
    //   21222: ldc_w -1539815793
    //   21225: ixor
    //   21226: ixor
    //   21227: lookupswitch default -> 21252, -1953897077 -> 21210, 938378769 -> 23802
    //   21252: getfield moveSpeed : D
    //   21255: dmul
    //   21256: getstatic Perryc.0 : I
    //   21259: ifle -> 21273
    //   21262: ldc2_w -936764014
    //   21265: l2i
    //   21266: ldc_w -2074393960
    //   21269: ixor
    //   21270: goto -> 21281
    //   21273: ldc2_w -999241417
    //   21276: l2i
    //   21277: ldc_w 1626590001
    //   21280: ixor
    //   21281: ldc2_w 1046195910
    //   21284: l2i
    //   21285: ldc_w 548318095
    //   21288: ixor
    //   21289: ixor
    //   21290: lookupswitch default -> 21316, -1118593078 -> 21273, 1384405571 -> 23724
    //   21316: dload #5
    //   21318: dmul
    //   21319: getstatic Perryc.c : I
    //   21322: iflt -> 21336
    //   21325: ldc2_w -1437030362
    //   21328: l2i
    //   21329: ldc_w 1074654581
    //   21332: ixor
    //   21333: goto -> 21344
    //   21336: ldc2_w -1610212907
    //   21339: l2i
    //   21340: ldc_w -1756831989
    //   21343: ixor
    //   21344: ldc2_w -1742762617
    //   21347: l2i
    //   21348: ldc_w 1517101162
    //   21351: ixor
    //   21352: ixor
    //   21353: lookupswitch default -> 21380, 673704126 -> 23670, 1199923425 -> 21336
    //   21380: fload_3
    //   21381: f2d
    //   21382: getstatic Perryc.c : I
    //   21385: iflt -> 21399
    //   21388: ldc2_w 1481256490
    //   21391: l2i
    //   21392: ldc_w -1485353362
    //   21395: ixor
    //   21396: goto -> 21407
    //   21399: ldc2_w 1346916372
    //   21402: l2i
    //   21403: ldc_w -569631764
    //   21406: ixor
    //   21407: ldc2_w -2077029829
    //   21410: l2i
    //   21411: ldc_w -1781269118
    //   21414: ixor
    //   21415: ixor
    //   21416: lookupswitch default -> 21444, -425647543 -> 21399, -287467523 -> 23694
    //   21444: aload_0
    //   21445: getstatic Perryc.1 : I
    //   21448: ifeq -> 21462
    //   21451: ldc2_w 1784165660
    //   21454: l2i
    //   21455: ldc_w 1605848714
    //   21458: ixor
    //   21459: goto -> 21470
    //   21462: ldc2_w -538160331
    //   21465: l2i
    //   21466: ldc_w 876981044
    //   21469: ixor
    //   21470: ldc2_w -1735640051
    //   21473: l2i
    //   21474: ldc_w -563968782
    //   21477: ixor
    //   21478: ixor
    //   21479: lookupswitch default -> 21504, -1741911050 -> 21462, 1929495401 -> 23866
    //   21504: getfield moveSpeed : D
    //   21507: dmul
    //   21508: getstatic Perryc.1 : I
    //   21511: ifeq -> 21525
    //   21514: ldc2_w -1502266457
    //   21517: l2i
    //   21518: ldc_w 1509288549
    //   21521: ixor
    //   21522: goto -> 21533
    //   21525: ldc2_w -1303079215
    //   21528: l2i
    //   21529: ldc_w 175759348
    //   21532: ixor
    //   21533: ldc2_w 1206609991
    //   21536: l2i
    //   21537: ldc_w -1517211700
    //   21540: ixor
    //   21541: ixor
    //   21542: lookupswitch default -> 21568, -1837046992 -> 21525, 502961737 -> 23764
    //   21568: dload #7
    //   21570: dmul
    //   21571: dadd
    //   21572: getstatic Perryc.1 : I
    //   21575: ifeq -> 21589
    //   21578: ldc2_w -230802156
    //   21581: l2i
    //   21582: ldc_w -2146565513
    //   21585: ixor
    //   21586: goto -> 21597
    //   21589: ldc2_w -344941404
    //   21592: l2i
    //   21593: ldc_w -1097476491
    //   21596: ixor
    //   21597: ldc2_w -193220692
    //   21600: l2i
    //   21601: ldc_w -25148990
    //   21604: ixor
    //   21605: ixor
    //   21606: lookupswitch default -> 21632, -433810395 -> 21589, 2026623245 -> 23900
    //   21632: goto -> 21636
    //   21635: athrow
    //   21636: invokevirtual setX : (D)V
    //   21639: goto -> 21643
    //   21642: athrow
    //   21643: getstatic Perryc.c : I
    //   21646: iflt -> 21660
    //   21649: ldc2_w -124822448
    //   21652: l2i
    //   21653: ldc_w 1478492297
    //   21656: ixor
    //   21657: goto -> 21668
    //   21660: ldc2_w 527267479
    //   21663: l2i
    //   21664: ldc_w 226455513
    //   21667: ixor
    //   21668: ldc2_w 1458678818
    //   21671: l2i
    //   21672: ldc_w -94670878
    //   21675: ixor
    //   21676: ixor
    //   21677: lookupswitch default -> 23756, -1095181682 -> 21704, 201695001 -> 21660
    //   21704: aload_1
    //   21705: getstatic Perryc.0 : I
    //   21708: ifle -> 21722
    //   21711: ldc2_w 64333593
    //   21714: l2i
    //   21715: ldc_w -2013804650
    //   21718: ixor
    //   21719: goto -> 21730
    //   21722: ldc2_w -1291671269
    //   21725: l2i
    //   21726: ldc_w -1607890145
    //   21729: ixor
    //   21730: ldc2_w -2021214481
    //   21733: l2i
    //   21734: ldc_w 1964768600
    //   21737: ixor
    //   21738: ixor
    //   21739: lookupswitch default -> 21764, 1677361781 -> 21722, 1992239928 -> 23748
    //   21764: fload_2
    //   21765: f2d
    //   21766: getstatic Perryc.0 : I
    //   21769: ifle -> 21783
    //   21772: ldc2_w 148686571
    //   21775: l2i
    //   21776: ldc_w -2013767943
    //   21779: ixor
    //   21780: goto -> 21791
    //   21783: ldc2_w 1115552046
    //   21786: l2i
    //   21787: ldc_w -1158612436
    //   21790: ixor
    //   21791: ldc2_w 2041054198
    //   21794: l2i
    //   21795: ldc_w -622838325
    //   21798: ixor
    //   21799: ixor
    //   21800: lookupswitch default -> 21828, -2054443450 -> 21783, 745319983 -> 24132
    //   21828: aload_0
    //   21829: getstatic Perryc.c : I
    //   21832: iflt -> 21846
    //   21835: ldc2_w -1039594419
    //   21838: l2i
    //   21839: ldc_w 1018026473
    //   21842: ixor
    //   21843: goto -> 21854
    //   21846: ldc2_w 103960216
    //   21849: l2i
    //   21850: ldc_w 1869517444
    //   21853: ixor
    //   21854: ldc2_w 445625453
    //   21857: l2i
    //   21858: ldc_w 623906762
    //   21861: ixor
    //   21862: ixor
    //   21863: lookupswitch default -> 23804, -1055166973 -> 21846, 1457743803 -> 21888
    //   21888: getfield moveSpeed : D
    //   21891: dmul
    //   21892: getstatic Perryc.1 : I
    //   21895: ifeq -> 21909
    //   21898: ldc2_w -753635573
    //   21901: l2i
    //   21902: ldc_w -397985594
    //   21905: ixor
    //   21906: goto -> 21917
    //   21909: ldc2_w -1090809400
    //   21912: l2i
    //   21913: ldc_w -1732459173
    //   21916: ixor
    //   21917: ldc2_w 148630394
    //   21920: l2i
    //   21921: ldc_w 691011571
    //   21924: ixor
    //   21925: ixor
    //   21926: lookupswitch default -> 21952, -1176414901 -> 21909, 447169348 -> 23942
    //   21952: dload #7
    //   21954: dmul
    //   21955: getstatic Perryc.c : I
    //   21958: iflt -> 21972
    //   21961: ldc2_w -1815020468
    //   21964: l2i
    //   21965: ldc_w 662426752
    //   21968: ixor
    //   21969: goto -> 21980
    //   21972: ldc2_w -1977133416
    //   21975: l2i
    //   21976: ldc_w -1487885638
    //   21979: ixor
    //   21980: ldc2_w -528012427
    //   21983: l2i
    //   21984: ldc_w -456388871
    //   21987: ixor
    //   21988: ixor
    //   21989: lookupswitch default -> 22016, -1327493824 -> 23634, 1231008226 -> 21972
    //   22016: fload_3
    //   22017: f2d
    //   22018: getstatic Perryc.0 : I
    //   22021: ifle -> 22035
    //   22024: ldc2_w -945270001
    //   22027: l2i
    //   22028: ldc_w -433769806
    //   22031: ixor
    //   22032: goto -> 22043
    //   22035: ldc2_w 1470259855
    //   22038: l2i
    //   22039: ldc_w -2096683436
    //   22042: ixor
    //   22043: ldc2_w -984364499
    //   22046: l2i
    //   22047: ldc_w -1372129347
    //   22050: ixor
    //   22051: ixor
    //   22052: lookupswitch default -> 23938, -1077905077 -> 22080, 1256741933 -> 22035
    //   22080: aload_0
    //   22081: getstatic Perryc.c : I
    //   22084: iflt -> 22098
    //   22087: ldc2_w -1902875997
    //   22090: l2i
    //   22091: ldc_w -424471520
    //   22094: ixor
    //   22095: goto -> 22106
    //   22098: ldc2_w -380739446
    //   22101: l2i
    //   22102: ldc_w -849816750
    //   22105: ixor
    //   22106: ldc2_w -1937883851
    //   22109: l2i
    //   22110: ldc_w -710687815
    //   22113: ixor
    //   22114: ixor
    //   22115: lookupswitch default -> 23612, 838500367 -> 22098, 2110475604 -> 22140
    //   22140: getfield moveSpeed : D
    //   22143: dmul
    //   22144: getstatic Perryc.1 : I
    //   22147: ifeq -> 22161
    //   22150: ldc2_w 1047913612
    //   22153: l2i
    //   22154: ldc_w 1479881423
    //   22157: ixor
    //   22158: goto -> 22169
    //   22161: ldc2_w -1328094605
    //   22164: l2i
    //   22165: ldc_w 1745897338
    //   22168: ixor
    //   22169: ldc2_w 15526903
    //   22172: l2i
    //   22173: ldc_w -99371443
    //   22176: ixor
    //   22177: ixor
    //   22178: lookupswitch default -> 22204, -1665168391 -> 23590, -184018465 -> 22161
    //   22204: dload #5
    //   22206: dmul
    //   22207: dsub
    //   22208: getstatic Perryc.c : I
    //   22211: iflt -> 22225
    //   22214: ldc2_w 1912799793
    //   22217: l2i
    //   22218: ldc_w 240753700
    //   22221: ixor
    //   22222: goto -> 22233
    //   22225: ldc2_w -2005872737
    //   22228: l2i
    //   22229: ldc_w -2021884666
    //   22232: ixor
    //   22233: ldc2_w -4137934
    //   22236: l2i
    //   22237: ldc_w 20294086
    //   22240: ixor
    //   22241: ixor
    //   22242: lookupswitch default -> 22268, -2102400031 -> 24086, -2048584111 -> 22225
    //   22268: goto -> 22272
    //   22271: athrow
    //   22272: invokevirtual setZ : (D)V
    //   22275: goto -> 22279
    //   22278: athrow
    //   22279: getstatic Perryc.c : I
    //   22282: iflt -> 22296
    //   22285: ldc2_w -1449422485
    //   22288: l2i
    //   22289: ldc_w 372821093
    //   22292: ixor
    //   22293: goto -> 22304
    //   22296: ldc2_w 890240130
    //   22299: l2i
    //   22300: ldc_w -909677373
    //   22303: ixor
    //   22304: ldc2_w 1358058233
    //   22307: l2i
    //   22308: ldc_w 1770200019
    //   22311: ixor
    //   22312: ixor
    //   22313: lookupswitch default -> 22340, -2033052636 -> 23844, 475253137 -> 22296
    //   22340: aload_0
    //   22341: getstatic Perryc.1 : I
    //   22344: ifeq -> 22358
    //   22347: ldc2_w 1573130274
    //   22350: l2i
    //   22351: ldc_w 1731212438
    //   22354: ixor
    //   22355: goto -> 22366
    //   22358: ldc2_w 2034878258
    //   22361: l2i
    //   22362: ldc_w 1874868919
    //   22365: ixor
    //   22366: ldc2_w -340317518
    //   22369: l2i
    //   22370: ldc_w 1468994374
    //   22373: ixor
    //   22374: ixor
    //   22375: lookupswitch default -> 24002, -2033443520 -> 22358, -1431190415 -> 22400
    //   22400: getfield step : Lbigname/zprestige/webhack/features/setting/Setting;
    //   22403: getstatic Perryc.0 : I
    //   22406: ifle -> 22420
    //   22409: ldc2_w -336575160
    //   22412: l2i
    //   22413: ldc_w -36628092
    //   22416: ixor
    //   22417: goto -> 22428
    //   22420: ldc2_w 195481834
    //   22423: l2i
    //   22424: ldc_w 366978098
    //   22427: ixor
    //   22428: ldc2_w 1531624451
    //   22431: l2i
    //   22432: ldc_w -311731172
    //   22435: ixor
    //   22436: ixor
    //   22437: lookupswitch default -> 22464, -1610564397 -> 23894, 535237949 -> 22420
    //   22464: goto -> 22468
    //   22467: athrow
    //   22468: invokevirtual getValue : ()Ljava/lang/Object;
    //   22471: goto -> 22475
    //   22474: athrow
    //   22475: checkcast java/lang/Integer
    //   22478: getstatic Perryc.1 : I
    //   22481: ifeq -> 22495
    //   22484: ldc2_w 1103434962
    //   22487: l2i
    //   22488: ldc_w -1891678802
    //   22491: ixor
    //   22492: goto -> 22503
    //   22495: ldc2_w -415883157
    //   22498: l2i
    //   22499: ldc_w -932205252
    //   22502: ixor
    //   22503: ldc2_w -787340854
    //   22506: l2i
    //   22507: ldc_w -346921173
    //   22510: ixor
    //   22511: ixor
    //   22512: lookupswitch default -> 22540, -189130851 -> 23840, 1940502331 -> 22495
    //   22540: goto -> 22544
    //   22543: athrow
    //   22544: invokevirtual intValue : ()I
    //   22547: goto -> 22551
    //   22550: athrow
    //   22551: ldc2_w -1112688123
    //   22554: l2i
    //   22555: ldc_w -1112688121
    //   22558: ixor
    //   22559: if_icmpne -> 22573
    //   22562: ldc2_w 1372181485
    //   22565: l2i
    //   22566: ldc_w -1050134317
    //   22569: ixor
    //   22570: goto -> 22581
    //   22573: ldc2_w -569770985
    //   22576: l2i
    //   22577: ldc_w 1319638824
    //   22580: ixor
    //   22581: ldc2_w -1560455487
    //   22584: l2i
    //   22585: ldc_w 1726685567
    //   22588: ixor
    //   22589: ixor
    //   22590: tableswitch default -> 22562, 1421319296 -> 22612, 1421319297 -> 22815
    //   22612: getstatic Perryc.c : I
    //   22615: iflt -> 22629
    //   22618: ldc2_w 1233821954
    //   22621: l2i
    //   22622: ldc_w 571406096
    //   22625: ixor
    //   22626: goto -> 22637
    //   22629: ldc2_w 1462707763
    //   22632: l2i
    //   22633: ldc_w 1431366291
    //   22636: ixor
    //   22637: ldc2_w -218917499
    //   22640: l2i
    //   22641: ldc_w -956285434
    //   22644: ixor
    //   22645: ixor
    //   22646: lookupswitch default -> 23968, 931948323 -> 22672, 1584922001 -> 22629
    //   22672: getstatic bigname/zprestige/webhack/features/modules/Movement/Strafe.mc : Lnet/minecraft/client/Minecraft;
    //   22675: getstatic Perryc.1 : I
    //   22678: ifeq -> 22692
    //   22681: ldc2_w -1511730269
    //   22684: l2i
    //   22685: ldc_w -2025076905
    //   22688: ixor
    //   22689: goto -> 22700
    //   22692: ldc2_w 2096409547
    //   22695: l2i
    //   22696: ldc_w -330117413
    //   22699: ixor
    //   22700: ldc2_w 683405428
    //   22703: l2i
    //   22704: ldc_w 1073997360
    //   22707: ixor
    //   22708: ixor
    //   22709: lookupswitch default -> 22736, -1667753976 -> 22692, 1243022000 -> 23758
    //   22736: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   22739: ldc_w 2.515244
    //   22742: invokestatic floatToIntBits : (F)I
    //   22745: ldc_w 2134466648
    //   22748: ixor
    //   22749: invokestatic intBitsToFloat : (I)F
    //   22752: getstatic Perryc.0 : I
    //   22755: ifle -> 22769
    //   22758: ldc2_w -142550306
    //   22761: l2i
    //   22762: ldc_w 1022577774
    //   22765: ixor
    //   22766: goto -> 22777
    //   22769: ldc2_w 875263228
    //   22772: l2i
    //   22773: ldc_w 1043494376
    //   22776: ixor
    //   22777: ldc2_w -890205098
    //   22780: l2i
    //   22781: ldc_w -1322157807
    //   22784: ixor
    //   22785: ixor
    //   22786: lookupswitch default -> 22812, -1330486281 -> 23796, 1290410581 -> 22769
    //   22812: putfield field_70138_W : F
    //   22815: getstatic Perryc.1 : I
    //   22818: ifeq -> 22832
    //   22821: ldc2_w 2071932838
    //   22824: l2i
    //   22825: ldc_w -1262467938
    //   22828: ixor
    //   22829: goto -> 22840
    //   22832: ldc2_w 95253027
    //   22835: l2i
    //   22836: ldc_w 1225579580
    //   22839: ixor
    //   22840: ldc2_w -152524863
    //   22843: l2i
    //   22844: ldc_w -525858221
    //   22847: ixor
    //   22848: ixor
    //   22849: lookupswitch default -> 24042, -637548886 -> 22832, 1524695949 -> 22876
    //   22876: fload_2
    //   22877: ldc_w 3.301941E38
    //   22880: invokestatic floatToIntBits : (F)I
    //   22883: ldc_w 2138597650
    //   22886: ixor
    //   22887: invokestatic intBitsToFloat : (I)F
    //   22890: fcmpl
    //   22891: ifne -> 22905
    //   22894: ldc2_w 1106551871
    //   22897: l2i
    //   22898: ldc_w 151479970
    //   22901: ixor
    //   22902: goto -> 22913
    //   22905: ldc2_w 858821388
    //   22908: l2i
    //   22909: ldc_w 2076397968
    //   22912: ixor
    //   22913: ldc2_w -1134483051
    //   22916: l2i
    //   22917: ldc_w 592918244
    //   22920: ixor
    //   22921: ixor
    //   22922: tableswitch default -> 22894, -674898452 -> 22944, -674898451 -> 23563
    //   22944: getstatic Perryc.c : I
    //   22947: iflt -> 22961
    //   22950: ldc2_w -390776425
    //   22953: l2i
    //   22954: ldc_w -415877392
    //   22957: ixor
    //   22958: goto -> 22969
    //   22961: ldc2_w -143820215
    //   22964: l2i
    //   22965: ldc_w 879402010
    //   22968: ixor
    //   22969: ldc2_w 791956025
    //   22972: l2i
    //   22973: ldc_w -1737604456
    //   22976: ixor
    //   22977: ixor
    //   22978: lookupswitch default -> 23004, -1193736250 -> 23966, -1017216286 -> 22961
    //   23004: fload_3
    //   23005: ldc_w 2.4578222E35
    //   23008: invokestatic floatToIntBits : (F)I
    //   23011: ldc_w 2050840575
    //   23014: ixor
    //   23015: invokestatic intBitsToFloat : (I)F
    //   23018: fcmpl
    //   23019: ifne -> 23033
    //   23022: ldc2_w 1182246237
    //   23025: l2i
    //   23026: ldc_w -373794700
    //   23029: ixor
    //   23030: goto -> 23041
    //   23033: ldc2_w -1372395787
    //   23036: l2i
    //   23037: ldc_w 33364957
    //   23040: ixor
    //   23041: ldc2_w -357346927
    //   23044: l2i
    //   23045: ldc_w -161600070
    //   23048: ixor
    //   23049: ixor
    //   23050: tableswitch default -> 23022, -1289584382 -> 23072, -1289584381 -> 23563
    //   23072: getstatic Perryc.c : I
    //   23075: iflt -> 23089
    //   23078: ldc2_w 597340449
    //   23081: l2i
    //   23082: ldc_w -1547172552
    //   23085: ixor
    //   23086: goto -> 23097
    //   23089: ldc2_w 164871919
    //   23092: l2i
    //   23093: ldc_w -791880855
    //   23096: ixor
    //   23097: ldc2_w -1157909151
    //   23100: l2i
    //   23101: ldc_w -1209071551
    //   23104: ixor
    //   23105: ixor
    //   23106: lookupswitch default -> 23738, -1924789959 -> 23089, -737421146 -> 23132
    //   23132: aload_0
    //   23133: getstatic Perryc.1 : I
    //   23136: ifeq -> 23150
    //   23139: ldc2_w -1606910678
    //   23142: l2i
    //   23143: ldc_w 558683840
    //   23146: ixor
    //   23147: goto -> 23158
    //   23150: ldc2_w -2031668253
    //   23153: l2i
    //   23154: ldc_w -1359022729
    //   23157: ixor
    //   23158: ldc2_w 1147855893
    //   23161: l2i
    //   23162: ldc_w -2106680965
    //   23165: ixor
    //   23166: ixor
    //   23167: lookupswitch default -> 23192, 828437037 -> 23150, 1198577284 -> 24154
    //   23192: getfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   23195: getstatic Perryc.1 : I
    //   23198: ifeq -> 23212
    //   23201: ldc2_w 1743265719
    //   23204: l2i
    //   23205: ldc_w 1001704479
    //   23208: ixor
    //   23209: goto -> 23220
    //   23212: ldc2_w 1887622715
    //   23215: l2i
    //   23216: ldc_w 663956021
    //   23219: ixor
    //   23220: ldc2_w -1134012459
    //   23223: l2i
    //   23224: ldc_w -183140369
    //   23227: ixor
    //   23228: ixor
    //   23229: lookupswitch default -> 23256, 197451608 -> 23212, 354548626 -> 24018
    //   23256: goto -> 23260
    //   23259: athrow
    //   23260: invokevirtual reset : ()Lbigname/zprestige/webhack/util/Timer;
    //   23263: goto -> 23267
    //   23266: athrow
    //   23267: pop
    //   23268: getstatic Perryc.0 : I
    //   23271: ifle -> 23285
    //   23274: ldc2_w -2027982173
    //   23277: l2i
    //   23278: ldc_w -234910614
    //   23281: ixor
    //   23282: goto -> 23293
    //   23285: ldc2_w 1670174619
    //   23288: l2i
    //   23289: ldc_w -731031156
    //   23292: ixor
    //   23293: ldc2_w 1410634263
    //   23296: l2i
    //   23297: ldc_w -89415249
    //   23300: ixor
    //   23301: ixor
    //   23302: lookupswitch default -> 24120, -664810127 -> 23285, 425639343 -> 23328
    //   23328: aload_1
    //   23329: ldc2_w 1.5935958469577922E308
    //   23332: invokestatic doubleToLongBits : (D)J
    //   23335: ldc2_w 9217845823910450591
    //   23338: lxor
    //   23339: invokestatic longBitsToDouble : (J)D
    //   23342: getstatic Perryc.1 : I
    //   23345: ifeq -> 23359
    //   23348: ldc2_w -545948596
    //   23351: l2i
    //   23352: ldc_w 904465144
    //   23355: ixor
    //   23356: goto -> 23367
    //   23359: ldc2_w 1732767282
    //   23362: l2i
    //   23363: ldc_w -1220076760
    //   23366: ixor
    //   23367: ldc2_w 474034167
    //   23370: l2i
    //   23371: ldc_w 694743923
    //   23374: ixor
    //   23375: ixor
    //   23376: lookupswitch default -> 23626, -541742544 -> 23359, -450287202 -> 23404
    //   23404: goto -> 23408
    //   23407: athrow
    //   23408: invokevirtual setX : (D)V
    //   23411: goto -> 23415
    //   23414: athrow
    //   23415: getstatic Perryc.c : I
    //   23418: iflt -> 23432
    //   23421: ldc2_w -2084328166
    //   23424: l2i
    //   23425: ldc_w 1817720148
    //   23428: ixor
    //   23429: goto -> 23440
    //   23432: ldc2_w 307400184
    //   23435: l2i
    //   23436: ldc_w -216403446
    //   23439: ixor
    //   23440: ldc2_w -492210726
    //   23443: l2i
    //   23444: ldc_w -1194582300
    //   23447: ixor
    //   23448: ixor
    //   23449: lookupswitch default -> 23476, -1241582736 -> 23826, 626255227 -> 23432
    //   23476: aload_1
    //   23477: ldc2_w 1.0439375173858213E308
    //   23480: invokestatic doubleToLongBits : (D)J
    //   23483: ldc2_w 9215091804328091770
    //   23486: lxor
    //   23487: invokestatic longBitsToDouble : (J)D
    //   23490: getstatic Perryc.0 : I
    //   23493: ifle -> 23507
    //   23496: ldc2_w 899227770
    //   23499: l2i
    //   23500: ldc_w -32939905
    //   23503: ixor
    //   23504: goto -> 23515
    //   23507: ldc2_w -24656982
    //   23510: l2i
    //   23511: ldc_w -1364742958
    //   23514: ixor
    //   23515: ldc2_w 1202121362
    //   23518: l2i
    //   23519: ldc_w 581028740
    //   23522: ixor
    //   23523: ixor
    //   23524: lookupswitch default -> 23908, -1365810925 -> 23507, 891768430 -> 23552
    //   23552: goto -> 23556
    //   23555: athrow
    //   23556: invokevirtual setZ : (D)V
    //   23559: goto -> 23563
    //   23562: athrow
    //   23563: return
    //   23564: aconst_null
    //   23565: athrow
    //   23566: aconst_null
    //   23567: athrow
    //   23568: aconst_null
    //   23569: athrow
    //   23570: aconst_null
    //   23571: athrow
    //   23572: aconst_null
    //   23573: athrow
    //   23574: aconst_null
    //   23575: athrow
    //   23576: aconst_null
    //   23577: athrow
    //   23578: aconst_null
    //   23579: athrow
    //   23580: aconst_null
    //   23581: athrow
    //   23582: aconst_null
    //   23583: athrow
    //   23584: aconst_null
    //   23585: athrow
    //   23586: aconst_null
    //   23587: athrow
    //   23588: aconst_null
    //   23589: athrow
    //   23590: aconst_null
    //   23591: athrow
    //   23592: aconst_null
    //   23593: athrow
    //   23594: aconst_null
    //   23595: athrow
    //   23596: aconst_null
    //   23597: athrow
    //   23598: aconst_null
    //   23599: athrow
    //   23600: aconst_null
    //   23601: athrow
    //   23602: aconst_null
    //   23603: athrow
    //   23604: aconst_null
    //   23605: athrow
    //   23606: aconst_null
    //   23607: athrow
    //   23608: aconst_null
    //   23609: athrow
    //   23610: aconst_null
    //   23611: athrow
    //   23612: aconst_null
    //   23613: athrow
    //   23614: aconst_null
    //   23615: athrow
    //   23616: aconst_null
    //   23617: athrow
    //   23618: aconst_null
    //   23619: athrow
    //   23620: aconst_null
    //   23621: athrow
    //   23622: aconst_null
    //   23623: athrow
    //   23624: aconst_null
    //   23625: athrow
    //   23626: aconst_null
    //   23627: athrow
    //   23628: aconst_null
    //   23629: athrow
    //   23630: aconst_null
    //   23631: athrow
    //   23632: aconst_null
    //   23633: athrow
    //   23634: aconst_null
    //   23635: athrow
    //   23636: aconst_null
    //   23637: athrow
    //   23638: aconst_null
    //   23639: athrow
    //   23640: aconst_null
    //   23641: athrow
    //   23642: aconst_null
    //   23643: athrow
    //   23644: aconst_null
    //   23645: athrow
    //   23646: aconst_null
    //   23647: athrow
    //   23648: aconst_null
    //   23649: athrow
    //   23650: aconst_null
    //   23651: athrow
    //   23652: aconst_null
    //   23653: athrow
    //   23654: aconst_null
    //   23655: athrow
    //   23656: aconst_null
    //   23657: athrow
    //   23658: aconst_null
    //   23659: athrow
    //   23660: aconst_null
    //   23661: athrow
    //   23662: aconst_null
    //   23663: athrow
    //   23664: aconst_null
    //   23665: athrow
    //   23666: aconst_null
    //   23667: athrow
    //   23668: aconst_null
    //   23669: athrow
    //   23670: aconst_null
    //   23671: athrow
    //   23672: aconst_null
    //   23673: athrow
    //   23674: aconst_null
    //   23675: athrow
    //   23676: aconst_null
    //   23677: athrow
    //   23678: aconst_null
    //   23679: athrow
    //   23680: aconst_null
    //   23681: athrow
    //   23682: aconst_null
    //   23683: athrow
    //   23684: aconst_null
    //   23685: athrow
    //   23686: aconst_null
    //   23687: athrow
    //   23688: aconst_null
    //   23689: athrow
    //   23690: aconst_null
    //   23691: athrow
    //   23692: aconst_null
    //   23693: athrow
    //   23694: aconst_null
    //   23695: athrow
    //   23696: aconst_null
    //   23697: athrow
    //   23698: aconst_null
    //   23699: athrow
    //   23700: aconst_null
    //   23701: athrow
    //   23702: aconst_null
    //   23703: athrow
    //   23704: aconst_null
    //   23705: athrow
    //   23706: aconst_null
    //   23707: athrow
    //   23708: aconst_null
    //   23709: athrow
    //   23710: aconst_null
    //   23711: athrow
    //   23712: aconst_null
    //   23713: athrow
    //   23714: aconst_null
    //   23715: athrow
    //   23716: aconst_null
    //   23717: athrow
    //   23718: aconst_null
    //   23719: athrow
    //   23720: aconst_null
    //   23721: athrow
    //   23722: aconst_null
    //   23723: athrow
    //   23724: aconst_null
    //   23725: athrow
    //   23726: aconst_null
    //   23727: athrow
    //   23728: aconst_null
    //   23729: athrow
    //   23730: aconst_null
    //   23731: athrow
    //   23732: aconst_null
    //   23733: athrow
    //   23734: aconst_null
    //   23735: athrow
    //   23736: aconst_null
    //   23737: athrow
    //   23738: aconst_null
    //   23739: athrow
    //   23740: aconst_null
    //   23741: athrow
    //   23742: aconst_null
    //   23743: athrow
    //   23744: aconst_null
    //   23745: athrow
    //   23746: aconst_null
    //   23747: athrow
    //   23748: aconst_null
    //   23749: athrow
    //   23750: aconst_null
    //   23751: athrow
    //   23752: aconst_null
    //   23753: athrow
    //   23754: aconst_null
    //   23755: athrow
    //   23756: aconst_null
    //   23757: athrow
    //   23758: aconst_null
    //   23759: athrow
    //   23760: aconst_null
    //   23761: athrow
    //   23762: aconst_null
    //   23763: athrow
    //   23764: aconst_null
    //   23765: athrow
    //   23766: aconst_null
    //   23767: athrow
    //   23768: aconst_null
    //   23769: athrow
    //   23770: aconst_null
    //   23771: athrow
    //   23772: aconst_null
    //   23773: athrow
    //   23774: aconst_null
    //   23775: athrow
    //   23776: aconst_null
    //   23777: athrow
    //   23778: aconst_null
    //   23779: athrow
    //   23780: aconst_null
    //   23781: athrow
    //   23782: aconst_null
    //   23783: athrow
    //   23784: aconst_null
    //   23785: athrow
    //   23786: aconst_null
    //   23787: athrow
    //   23788: aconst_null
    //   23789: athrow
    //   23790: aconst_null
    //   23791: athrow
    //   23792: aconst_null
    //   23793: athrow
    //   23794: aconst_null
    //   23795: athrow
    //   23796: aconst_null
    //   23797: athrow
    //   23798: aconst_null
    //   23799: athrow
    //   23800: aconst_null
    //   23801: athrow
    //   23802: aconst_null
    //   23803: athrow
    //   23804: aconst_null
    //   23805: athrow
    //   23806: aconst_null
    //   23807: athrow
    //   23808: aconst_null
    //   23809: athrow
    //   23810: aconst_null
    //   23811: athrow
    //   23812: aconst_null
    //   23813: athrow
    //   23814: aconst_null
    //   23815: athrow
    //   23816: aconst_null
    //   23817: athrow
    //   23818: aconst_null
    //   23819: athrow
    //   23820: aconst_null
    //   23821: athrow
    //   23822: aconst_null
    //   23823: athrow
    //   23824: aconst_null
    //   23825: athrow
    //   23826: aconst_null
    //   23827: athrow
    //   23828: aconst_null
    //   23829: athrow
    //   23830: aconst_null
    //   23831: athrow
    //   23832: aconst_null
    //   23833: athrow
    //   23834: aconst_null
    //   23835: athrow
    //   23836: aconst_null
    //   23837: athrow
    //   23838: aconst_null
    //   23839: athrow
    //   23840: aconst_null
    //   23841: athrow
    //   23842: aconst_null
    //   23843: athrow
    //   23844: aconst_null
    //   23845: athrow
    //   23846: aconst_null
    //   23847: athrow
    //   23848: aconst_null
    //   23849: athrow
    //   23850: aconst_null
    //   23851: athrow
    //   23852: aconst_null
    //   23853: athrow
    //   23854: aconst_null
    //   23855: athrow
    //   23856: aconst_null
    //   23857: athrow
    //   23858: aconst_null
    //   23859: athrow
    //   23860: aconst_null
    //   23861: athrow
    //   23862: aconst_null
    //   23863: athrow
    //   23864: aconst_null
    //   23865: athrow
    //   23866: aconst_null
    //   23867: athrow
    //   23868: aconst_null
    //   23869: athrow
    //   23870: aconst_null
    //   23871: athrow
    //   23872: aconst_null
    //   23873: athrow
    //   23874: aconst_null
    //   23875: athrow
    //   23876: aconst_null
    //   23877: athrow
    //   23878: aconst_null
    //   23879: athrow
    //   23880: aconst_null
    //   23881: athrow
    //   23882: aconst_null
    //   23883: athrow
    //   23884: aconst_null
    //   23885: athrow
    //   23886: aconst_null
    //   23887: athrow
    //   23888: aconst_null
    //   23889: athrow
    //   23890: aconst_null
    //   23891: athrow
    //   23892: aconst_null
    //   23893: athrow
    //   23894: aconst_null
    //   23895: athrow
    //   23896: aconst_null
    //   23897: athrow
    //   23898: aconst_null
    //   23899: athrow
    //   23900: aconst_null
    //   23901: athrow
    //   23902: aconst_null
    //   23903: athrow
    //   23904: aconst_null
    //   23905: athrow
    //   23906: aconst_null
    //   23907: athrow
    //   23908: aconst_null
    //   23909: athrow
    //   23910: aconst_null
    //   23911: athrow
    //   23912: aconst_null
    //   23913: athrow
    //   23914: aconst_null
    //   23915: athrow
    //   23916: aconst_null
    //   23917: athrow
    //   23918: aconst_null
    //   23919: athrow
    //   23920: aconst_null
    //   23921: athrow
    //   23922: aconst_null
    //   23923: athrow
    //   23924: aconst_null
    //   23925: athrow
    //   23926: aconst_null
    //   23927: athrow
    //   23928: aconst_null
    //   23929: athrow
    //   23930: aconst_null
    //   23931: athrow
    //   23932: aconst_null
    //   23933: athrow
    //   23934: aconst_null
    //   23935: athrow
    //   23936: aconst_null
    //   23937: athrow
    //   23938: aconst_null
    //   23939: athrow
    //   23940: aconst_null
    //   23941: athrow
    //   23942: aconst_null
    //   23943: athrow
    //   23944: aconst_null
    //   23945: athrow
    //   23946: aconst_null
    //   23947: athrow
    //   23948: aconst_null
    //   23949: athrow
    //   23950: aconst_null
    //   23951: athrow
    //   23952: aconst_null
    //   23953: athrow
    //   23954: aconst_null
    //   23955: athrow
    //   23956: aconst_null
    //   23957: athrow
    //   23958: aconst_null
    //   23959: athrow
    //   23960: aconst_null
    //   23961: athrow
    //   23962: aconst_null
    //   23963: athrow
    //   23964: aconst_null
    //   23965: athrow
    //   23966: aconst_null
    //   23967: athrow
    //   23968: aconst_null
    //   23969: athrow
    //   23970: aconst_null
    //   23971: athrow
    //   23972: aconst_null
    //   23973: athrow
    //   23974: aconst_null
    //   23975: athrow
    //   23976: aconst_null
    //   23977: athrow
    //   23978: aconst_null
    //   23979: athrow
    //   23980: aconst_null
    //   23981: athrow
    //   23982: aconst_null
    //   23983: athrow
    //   23984: aconst_null
    //   23985: athrow
    //   23986: aconst_null
    //   23987: athrow
    //   23988: aconst_null
    //   23989: athrow
    //   23990: aconst_null
    //   23991: athrow
    //   23992: aconst_null
    //   23993: athrow
    //   23994: aconst_null
    //   23995: athrow
    //   23996: aconst_null
    //   23997: athrow
    //   23998: aconst_null
    //   23999: athrow
    //   24000: aconst_null
    //   24001: athrow
    //   24002: aconst_null
    //   24003: athrow
    //   24004: aconst_null
    //   24005: athrow
    //   24006: aconst_null
    //   24007: athrow
    //   24008: aconst_null
    //   24009: athrow
    //   24010: aconst_null
    //   24011: athrow
    //   24012: aconst_null
    //   24013: athrow
    //   24014: aconst_null
    //   24015: athrow
    //   24016: aconst_null
    //   24017: athrow
    //   24018: aconst_null
    //   24019: athrow
    //   24020: aconst_null
    //   24021: athrow
    //   24022: aconst_null
    //   24023: athrow
    //   24024: aconst_null
    //   24025: athrow
    //   24026: aconst_null
    //   24027: athrow
    //   24028: aconst_null
    //   24029: athrow
    //   24030: aconst_null
    //   24031: athrow
    //   24032: aconst_null
    //   24033: athrow
    //   24034: aconst_null
    //   24035: athrow
    //   24036: aconst_null
    //   24037: athrow
    //   24038: aconst_null
    //   24039: athrow
    //   24040: aconst_null
    //   24041: athrow
    //   24042: aconst_null
    //   24043: athrow
    //   24044: aconst_null
    //   24045: athrow
    //   24046: aconst_null
    //   24047: athrow
    //   24048: aconst_null
    //   24049: athrow
    //   24050: aconst_null
    //   24051: athrow
    //   24052: aconst_null
    //   24053: athrow
    //   24054: aconst_null
    //   24055: athrow
    //   24056: aconst_null
    //   24057: athrow
    //   24058: aconst_null
    //   24059: athrow
    //   24060: aconst_null
    //   24061: athrow
    //   24062: aconst_null
    //   24063: athrow
    //   24064: aconst_null
    //   24065: athrow
    //   24066: aconst_null
    //   24067: athrow
    //   24068: aconst_null
    //   24069: athrow
    //   24070: aconst_null
    //   24071: athrow
    //   24072: aconst_null
    //   24073: athrow
    //   24074: aconst_null
    //   24075: athrow
    //   24076: aconst_null
    //   24077: athrow
    //   24078: aconst_null
    //   24079: athrow
    //   24080: aconst_null
    //   24081: athrow
    //   24082: aconst_null
    //   24083: athrow
    //   24084: aconst_null
    //   24085: athrow
    //   24086: aconst_null
    //   24087: athrow
    //   24088: aconst_null
    //   24089: athrow
    //   24090: aconst_null
    //   24091: athrow
    //   24092: aconst_null
    //   24093: athrow
    //   24094: aconst_null
    //   24095: athrow
    //   24096: aconst_null
    //   24097: athrow
    //   24098: aconst_null
    //   24099: athrow
    //   24100: aconst_null
    //   24101: athrow
    //   24102: aconst_null
    //   24103: athrow
    //   24104: aconst_null
    //   24105: athrow
    //   24106: aconst_null
    //   24107: athrow
    //   24108: aconst_null
    //   24109: athrow
    //   24110: aconst_null
    //   24111: athrow
    //   24112: aconst_null
    //   24113: athrow
    //   24114: aconst_null
    //   24115: athrow
    //   24116: aconst_null
    //   24117: athrow
    //   24118: aconst_null
    //   24119: athrow
    //   24120: aconst_null
    //   24121: athrow
    //   24122: aconst_null
    //   24123: athrow
    //   24124: aconst_null
    //   24125: athrow
    //   24126: aconst_null
    //   24127: athrow
    //   24128: aconst_null
    //   24129: athrow
    //   24130: aconst_null
    //   24131: athrow
    //   24132: aconst_null
    //   24133: athrow
    //   24134: aconst_null
    //   24135: athrow
    //   24136: aconst_null
    //   24137: athrow
    //   24138: aconst_null
    //   24139: athrow
    //   24140: aconst_null
    //   24141: athrow
    //   24142: aconst_null
    //   24143: athrow
    //   24144: aconst_null
    //   24145: athrow
    //   24146: aconst_null
    //   24147: athrow
    //   24148: aconst_null
    //   24149: athrow
    //   24150: aconst_null
    //   24151: athrow
    //   24152: aconst_null
    //   24153: athrow
    //   24154: aconst_null
    //   24155: athrow
    //   24156: aconst_null
    //   24157: athrow
    //   24158: aconst_null
    //   24159: athrow
    //   24160: aconst_null
    //   24161: athrow
    //   24162: aconst_null
    //   24163: athrow
    //   24164: aconst_null
    //   24165: athrow
    //   24166: aconst_null
    //   24167: athrow
    //   24168: aconst_null
    //   24169: athrow
    //   24170: aconst_null
    //   24171: athrow
    //   24172: aconst_null
    //   24173: athrow
    //   24174: aconst_null
    //   24175: athrow
    //   24176: aconst_null
    //   24177: athrow
    //   24178: aconst_null
    //   24179: athrow
    //   24180: aconst_null
    //   24181: athrow
    //   24182: aconst_null
    //   24183: athrow
    //   24184: aconst_null
    //   24185: athrow
    //   24186: aconst_null
    //   24187: athrow
    //   24188: pop
    //   24189: goto -> 24
    //   24192: pop
    //   24193: aconst_null
    //   24194: goto -> 24188
    //   24197: dup
    //   24198: ifnull -> 24188
    //   24201: checkcast java/lang/Throwable
    //   24204: athrow
    //   24205: dup
    //   24206: ifnull -> 24192
    //   24209: checkcast java/lang/Throwable
    //   24212: athrow
    //   24213: aconst_null
    //   24214: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   11994	257	5	accel	D
    //   12842	313	5	difference	D
    //   2037	21526	2	moveForward	F
    //   2353	21210	3	moveStrafe	F
    //   2606	20957	4	rotationYaw	F
    //   20546	3017	5	motionX	D
    //   20830	2733	7	motionZ	D
    //   24	23540	0	this	Lbigname/zprestige/webhack/features/modules/Movement/Strafe;
    //   24	23540	1	event	Lbigname/zprestige/webhack/event/events/MoveEvent;
    // Exception table:
    //   from	to	target	type
    //   8	20	24197	java/lang/AssertionError
    //   455	462	462	finally
    //   455	462	3	finally
    //   455	462	455	finally
    //   456	462	462	finally
    //   456	462	3	java/util/ConcurrentModificationException
    //   531	538	538	finally
    //   531	538	538	finally
    //   531	538	3	finally
    //   532	538	531	java/lang/NumberFormatException
    //   532	538	538	finally
    //   1087	1094	1094	finally
    //   1087	1094	1087	java/lang/EnumConstantNotPresentException
    //   1088	1094	1094	java/lang/EnumConstantNotPresentException
    //   1088	1094	1087	java/lang/ClassCastException
    //   1088	1094	1087	java/lang/StringIndexOutOfBoundsException
    //   1395	1402	1402	finally
    //   1396	1402	1395	java/util/ConcurrentModificationException
    //   1396	1402	1402	java/lang/RuntimeException
    //   1396	1402	1402	finally
    //   1396	1402	1402	java/lang/StringIndexOutOfBoundsException
    //   1595	1602	1602	finally
    //   1595	1602	3	finally
    //   1596	1602	1595	finally
    //   1596	1602	3	finally
    //   1596	1602	1595	finally
    //   2795	2802	2802	finally
    //   2795	2802	2802	finally
    //   2795	2802	3	java/lang/NegativeArraySizeException
    //   2795	2802	2795	java/lang/NumberFormatException
    //   2796	2802	2802	java/lang/ClassCastException
    //   2871	2878	2878	finally
    //   2871	2878	2871	java/lang/IndexOutOfBoundsException
    //   2871	2878	3	java/util/NoSuchElementException
    //   2872	2878	2878	java/lang/NegativeArraySizeException
    //   2872	2878	2871	finally
    //   3331	3338	3338	finally
    //   3331	3338	3338	finally
    //   3331	3338	3331	java/util/ConcurrentModificationException
    //   3331	3338	3331	java/lang/ArrayIndexOutOfBoundsException
    //   3332	3338	3	finally
    //   3407	3414	3414	finally
    //   3407	3414	3407	finally
    //   3408	3414	3414	finally
    //   3408	3414	3	java/util/ConcurrentModificationException
    //   3408	3414	3407	finally
    //   3839	3846	3846	finally
    //   3839	3846	3839	java/lang/EnumConstantNotPresentException
    //   3839	3846	3839	finally
    //   3840	3846	3839	java/lang/EnumConstantNotPresentException
    //   3840	3846	3839	finally
    //   4035	4042	4042	finally
    //   4035	4042	4035	finally
    //   4035	4042	4042	java/lang/UnsupportedOperationException
    //   4035	4042	4042	java/lang/IllegalStateException
    //   4036	4042	3	java/util/ConcurrentModificationException
    //   4112	4118	4118	finally
    //   4112	4118	3	java/lang/IllegalArgumentException
    //   4112	4118	4118	java/lang/IllegalStateException
    //   4112	4118	4118	finally
    //   4112	4118	4118	finally
    //   4495	4502	4502	finally
    //   4495	4502	3	finally
    //   4495	4502	3	java/util/ConcurrentModificationException
    //   4496	4502	4495	java/lang/UnsupportedOperationException
    //   4496	4502	3	java/lang/ArrayIndexOutOfBoundsException
    //   4571	4578	4578	finally
    //   4571	4578	4578	finally
    //   4571	4578	4571	java/lang/RuntimeException
    //   4571	4578	4571	java/lang/ClassCastException
    //   4571	4578	4578	java/lang/NegativeArraySizeException
    //   5091	5098	5098	finally
    //   5092	5098	3	finally
    //   5092	5098	5091	finally
    //   5092	5098	5098	finally
    //   5092	5098	3	java/lang/AssertionError
    //   5287	5294	5294	finally
    //   5288	5294	5287	java/lang/StringIndexOutOfBoundsException
    //   5288	5294	5294	java/util/ConcurrentModificationException
    //   5288	5294	3	finally
    //   5288	5294	3	java/lang/NumberFormatException
    //   5364	5370	5370	finally
    //   5364	5370	3	finally
    //   5364	5370	3	java/lang/AssertionError
    //   5364	5370	3	finally
    //   5364	5370	5370	finally
    //   5459	5466	5466	finally
    //   5459	5466	3	java/lang/NullPointerException
    //   5459	5466	3	java/util/NoSuchElementException
    //   5460	5466	5459	finally
    //   5460	5466	3	finally
    //   5707	5714	5714	finally
    //   5707	5714	5714	finally
    //   5707	5714	5707	java/lang/RuntimeException
    //   5707	5714	3	java/lang/NullPointerException
    //   5708	5714	3	java/lang/NullPointerException
    //   5783	5790	5790	finally
    //   5784	5790	5790	finally
    //   5784	5790	3	finally
    //   5784	5790	5790	finally
    //   5784	5790	5783	java/lang/NumberFormatException
    //   6035	6042	6042	finally
    //   6035	6042	6035	finally
    //   6035	6042	3	java/lang/NullPointerException
    //   6036	6042	6042	finally
    //   6036	6042	6042	java/lang/RuntimeException
    //   6284	6290	6290	finally
    //   6284	6290	3	finally
    //   6284	6290	6290	java/util/NoSuchElementException
    //   6284	6290	3	java/lang/NullPointerException
    //   6284	6290	3	java/lang/StringIndexOutOfBoundsException
    //   6359	6366	6366	finally
    //   6359	6366	6359	finally
    //   6359	6366	3	finally
    //   6360	6366	6359	java/lang/ClassCastException
    //   6360	6366	3	finally
    //   7007	7014	7014	finally
    //   7007	7014	3	finally
    //   7007	7014	7014	finally
    //   7007	7014	7007	java/lang/NullPointerException
    //   7008	7014	7007	java/lang/IllegalArgumentException
    //   7083	7090	7090	finally
    //   7083	7090	7090	java/lang/IllegalArgumentException
    //   7083	7090	7083	finally
    //   7083	7090	3	java/lang/StringIndexOutOfBoundsException
    //   7083	7090	7090	java/util/ConcurrentModificationException
    //   7355	7362	7362	finally
    //   7355	7362	7362	java/lang/NullPointerException
    //   7355	7362	3	java/lang/NullPointerException
    //   7356	7362	7355	finally
    //   7356	7362	7355	finally
    //   7552	7558	7558	finally
    //   7552	7558	7558	finally
    //   7552	7558	7558	finally
    //   7552	7558	3	finally
    //   7552	7558	7558	java/lang/ClassCastException
    //   7627	7634	7634	finally
    //   7627	7634	7627	java/util/ConcurrentModificationException
    //   7627	7634	7627	java/lang/NumberFormatException
    //   7628	7634	7634	java/lang/EnumConstantNotPresentException
    //   7628	7634	3	finally
    //   7715	7722	7722	finally
    //   7715	7722	7722	finally
    //   7716	7722	7715	finally
    //   7716	7722	7722	finally
    //   7716	7722	3	finally
    //   7911	7918	7918	finally
    //   7911	7918	7911	finally
    //   7911	7918	7918	java/lang/NegativeArraySizeException
    //   7912	7918	3	finally
    //   7912	7918	7918	finally
    //   7987	7994	7994	finally
    //   7987	7994	3	finally
    //   7987	7994	3	java/util/NoSuchElementException
    //   7988	7994	7987	finally
    //   7988	7994	7987	finally
    //   8427	8434	8434	finally
    //   8427	8434	8427	finally
    //   8427	8434	8434	finally
    //   8428	8434	3	finally
    //   8428	8434	8427	java/lang/ArrayIndexOutOfBoundsException
    //   8503	8510	8510	finally
    //   8503	8510	3	finally
    //   8503	8510	8503	finally
    //   8503	8510	3	java/lang/StringIndexOutOfBoundsException
    //   8504	8510	8510	java/lang/AssertionError
    //   8839	8846	8846	finally
    //   8839	8846	3	java/lang/IllegalStateException
    //   8839	8846	8839	java/lang/IndexOutOfBoundsException
    //   8839	8846	8839	java/lang/IllegalArgumentException
    //   8840	8846	8846	finally
    //   9215	9222	9222	finally
    //   9215	9222	9215	finally
    //   9215	9222	9222	finally
    //   9216	9222	9215	finally
    //   9216	9222	3	finally
    //   9288	9294	9294	finally
    //   9288	9294	3	java/util/NoSuchElementException
    //   9288	9294	9294	java/lang/ClassCastException
    //   9288	9294	3	finally
    //   9288	9294	3	finally
    //   9627	9634	9634	finally
    //   9627	9634	9627	java/lang/NegativeArraySizeException
    //   9627	9634	3	java/lang/UnsupportedOperationException
    //   9628	9634	9627	finally
    //   9628	9634	9634	java/lang/NullPointerException
    //   10135	10142	10142	finally
    //   10135	10142	10135	finally
    //   10135	10142	3	java/lang/NegativeArraySizeException
    //   10135	10142	10135	java/lang/IllegalStateException
    //   10136	10142	3	finally
    //   10211	10218	10218	finally
    //   10212	10218	3	java/lang/IndexOutOfBoundsException
    //   10212	10218	10211	java/util/NoSuchElementException
    //   10212	10218	10211	finally
    //   10212	10218	10211	finally
    //   10547	10554	10554	finally
    //   10547	10554	3	java/lang/ClassCastException
    //   10548	10554	10554	finally
    //   10548	10554	3	java/lang/ArithmeticException
    //   10548	10554	10547	finally
    //   10623	10630	10630	finally
    //   10623	10630	10623	java/lang/NullPointerException
    //   10623	10630	10630	java/lang/UnsupportedOperationException
    //   10624	10630	10630	java/lang/StringIndexOutOfBoundsException
    //   10624	10630	3	finally
    //   10711	10718	10718	finally
    //   10711	10718	3	finally
    //   10711	10718	10711	java/lang/IndexOutOfBoundsException
    //   10711	10718	10718	finally
    //   10712	10718	3	java/lang/UnsupportedOperationException
    //   11483	11490	11490	finally
    //   11483	11490	11490	java/lang/ClassCastException
    //   11484	11490	11483	finally
    //   11484	11490	3	finally
    //   11484	11490	3	java/lang/StringIndexOutOfBoundsException
    //   11560	11566	11566	finally
    //   11560	11566	3	finally
    //   11560	11566	11566	finally
    //   11560	11566	11566	java/util/ConcurrentModificationException
    //   11560	11566	3	java/lang/EnumConstantNotPresentException
    //   11831	11838	11838	finally
    //   11831	11838	11831	java/lang/ArrayIndexOutOfBoundsException
    //   11831	11838	11831	java/lang/NumberFormatException
    //   11832	11838	11838	finally
    //   11832	11838	3	finally
    //   11907	11914	11914	finally
    //   11907	11914	11907	finally
    //   11907	11914	3	finally
    //   11907	11914	11907	java/util/NoSuchElementException
    //   11908	11914	3	finally
    //   12771	12778	12778	finally
    //   12771	12778	12771	finally
    //   12772	12778	12771	java/lang/EnumConstantNotPresentException
    //   12772	12778	12771	java/lang/EnumConstantNotPresentException
    //   12772	12778	3	finally
    //   13607	13614	13614	finally
    //   13607	13614	13614	java/lang/ClassCastException
    //   13607	13614	13607	java/lang/IllegalArgumentException
    //   13607	13614	3	java/util/NoSuchElementException
    //   13608	13614	3	java/lang/RuntimeException
    //   13895	13902	13902	finally
    //   13896	13902	3	finally
    //   13896	13902	13895	finally
    //   13896	13902	13895	java/lang/StringIndexOutOfBoundsException
    //   13896	13902	3	java/lang/AssertionError
    //   13968	13974	13974	finally
    //   13968	13974	3	java/lang/IllegalStateException
    //   13968	13974	3	finally
    //   13968	13974	3	java/lang/UnsupportedOperationException
    //   13968	13974	13974	java/lang/NullPointerException
    //   14040	14048	14048	finally
    //   14040	14048	14048	finally
    //   14040	14048	3	finally
    //   14040	14048	14048	java/lang/UnsupportedOperationException
    //   14040	14048	3	finally
    //   14771	14778	14778	finally
    //   14771	14778	3	java/lang/ClassCastException
    //   14771	14778	14771	java/util/ConcurrentModificationException
    //   14771	14778	14778	java/util/NoSuchElementException
    //   14772	14778	14778	finally
    //   14847	14854	14854	finally
    //   14847	14854	3	java/lang/AssertionError
    //   14848	14854	14847	java/util/ConcurrentModificationException
    //   14848	14854	14854	finally
    //   14848	14854	3	finally
    //   15035	15042	15042	finally
    //   15035	15042	15035	java/lang/AssertionError
    //   15035	15042	15042	finally
    //   15036	15042	3	java/lang/AssertionError
    //   15036	15042	15042	java/lang/NullPointerException
    //   15231	15238	15238	finally
    //   15231	15238	15231	java/lang/IllegalStateException
    //   15231	15238	3	finally
    //   15231	15238	15238	finally
    //   15232	15238	15231	finally
    //   15307	15314	15314	finally
    //   15307	15314	15307	finally
    //   15307	15314	15307	finally
    //   15307	15314	15314	finally
    //   15308	15314	15314	java/lang/RuntimeException
    //   16483	16490	16490	finally
    //   16483	16490	16483	java/lang/AssertionError
    //   16483	16490	3	java/lang/UnsupportedOperationException
    //   16483	16490	16483	java/lang/IllegalArgumentException
    //   16484	16490	3	finally
    //   16559	16566	16566	finally
    //   16559	16566	16559	finally
    //   16559	16566	16559	finally
    //   16559	16566	16559	finally
    //   16559	16566	16566	java/lang/UnsupportedOperationException
    //   16883	16890	16890	finally
    //   16883	16890	16890	java/lang/ClassCastException
    //   16883	16890	16883	java/lang/StringIndexOutOfBoundsException
    //   16884	16890	16883	finally
    //   16884	16890	16890	finally
    //   16955	16962	16962	finally
    //   16955	16962	16955	finally
    //   16956	16962	16962	java/lang/ClassCastException
    //   16956	16962	16962	java/lang/RuntimeException
    //   16956	16962	3	java/lang/IndexOutOfBoundsException
    //   17215	17222	17222	finally
    //   17215	17222	3	java/lang/AssertionError
    //   17215	17222	17215	finally
    //   17215	17222	17222	java/util/NoSuchElementException
    //   17216	17222	17222	finally
    //   17291	17298	17298	finally
    //   17291	17298	17298	finally
    //   17291	17298	17298	finally
    //   17291	17298	17291	java/lang/ClassCastException
    //   17291	17298	3	finally
    //   17539	17546	17546	finally
    //   17539	17546	17546	java/util/NoSuchElementException
    //   17540	17546	17546	finally
    //   17540	17546	17539	finally
    //   17540	17546	17539	finally
    //   17615	17622	17622	finally
    //   17615	17622	17622	finally
    //   17615	17622	17615	finally
    //   17615	17622	17615	finally
    //   17616	17622	3	finally
    //   17984	17990	17990	finally
    //   17984	17990	17990	finally
    //   17984	17990	3	java/lang/ArithmeticException
    //   17984	17990	3	finally
    //   17984	17990	3	java/lang/UnsupportedOperationException
    //   18451	18458	18458	finally
    //   18451	18458	3	java/util/ConcurrentModificationException
    //   18452	18458	18451	java/lang/RuntimeException
    //   18452	18458	18458	finally
    //   18452	18458	18451	java/lang/ArrayIndexOutOfBoundsException
    //   18599	18606	18606	finally
    //   18599	18606	18599	java/lang/RuntimeException
    //   18599	18606	18599	finally
    //   18599	18606	3	finally
    //   18600	18606	3	java/lang/AssertionError
    //   20403	20410	20410	finally
    //   20403	20410	3	java/lang/IllegalArgumentException
    //   20403	20410	3	java/lang/UnsupportedOperationException
    //   20404	20410	20410	finally
    //   20404	20410	20403	java/lang/UnsupportedOperationException
    //   20475	20482	20482	finally
    //   20475	20482	20482	finally
    //   20475	20482	3	java/lang/UnsupportedOperationException
    //   20476	20482	20475	finally
    //   20476	20482	3	java/lang/UnsupportedOperationException
    //   20687	20694	20694	finally
    //   20687	20694	3	java/util/NoSuchElementException
    //   20687	20694	20687	finally
    //   20687	20694	20687	finally
    //   20687	20694	20694	java/lang/NumberFormatException
    //   20759	20766	20766	finally
    //   20759	20766	3	java/lang/NullPointerException
    //   20759	20766	20766	java/lang/StringIndexOutOfBoundsException
    //   20760	20766	20759	java/lang/RuntimeException
    //   20760	20766	20766	finally
    //   21635	21642	21642	finally
    //   21635	21642	21642	finally
    //   21636	21642	21635	finally
    //   21636	21642	21642	finally
    //   21636	21642	21635	finally
    //   22271	22278	22278	finally
    //   22271	22278	3	java/lang/RuntimeException
    //   22272	22278	22278	finally
    //   22272	22278	22271	java/util/ConcurrentModificationException
    //   22272	22278	22271	finally
    //   22467	22474	22474	finally
    //   22467	22474	22474	finally
    //   22467	22474	22474	finally
    //   22467	22474	22467	java/lang/UnsupportedOperationException
    //   22467	22474	3	java/lang/AssertionError
    //   22543	22550	22550	finally
    //   22543	22550	22543	java/util/NoSuchElementException
    //   22543	22550	22550	java/lang/UnsupportedOperationException
    //   22543	22550	3	finally
    //   22543	22550	22543	finally
    //   23259	23266	23266	finally
    //   23259	23266	3	finally
    //   23260	23266	23259	java/lang/NullPointerException
    //   23260	23266	3	java/lang/ArrayIndexOutOfBoundsException
    //   23260	23266	23266	finally
    //   23408	23414	23414	finally
    //   23408	23414	23414	finally
    //   23408	23414	23414	finally
    //   23408	23414	23414	java/util/NoSuchElementException
    //   23408	23414	3	java/lang/EnumConstantNotPresentException
    //   23555	23562	23562	finally
    //   23555	23562	23562	java/lang/RuntimeException
    //   23555	23562	23555	java/lang/EnumConstantNotPresentException
    //   23556	23562	23555	finally
    //   23556	23562	23562	java/lang/ClassCastException
    //   24197	24205	24197	finally
    //   24213	24215	3	finally
  }
  
  public void onDisable() {
    Perry1.4i(this, (int)1329029170L ^ 0x3E151BB6);
  }
  
  @SubscribeEvent
  public void onUpdateWalkingPlayer(UpdateWalkingPlayerEvent paramUpdateWalkingPlayerEvent) {
    Perry1.0D(this, (int)-1974320203L ^ 0xD5A4988E, paramUpdateWalkingPlayerEvent);
  }
  
  public static double round(double value, int places) {
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
    //   27: ifle -> 41
    //   30: ldc2_w 243636912
    //   33: l2i
    //   34: ldc_w -2083999935
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -207355367
    //   44: l2i
    //   45: ldc_w -355577040
    //   48: ixor
    //   49: ldc2_w -1092603692
    //   52: l2i
    //   53: ldc_w -1343057404
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 740, -1671456991 -> 41, 142144505 -> 84
    //   84: iload_2
    //   85: ifge -> 99
    //   88: ldc2_w 542730515
    //   91: l2i
    //   92: ldc_w 1128782022
    //   95: ixor
    //   96: goto -> 107
    //   99: ldc2_w 1805107283
    //   102: l2i
    //   103: ldc_w 143225223
    //   106: ixor
    //   107: ldc2_w 1606762223
    //   110: l2i
    //   111: ldc_w 1945800406
    //   114: ixor
    //   115: ixor
    //   116: tableswitch default -> 88, 1327563244 -> 140, 1327563245 -> 216
    //   140: new java/lang/IllegalArgumentException
    //   143: dup
    //   144: getstatic Perryc.c : I
    //   147: iflt -> 161
    //   150: ldc2_w -1347084046
    //   153: l2i
    //   154: ldc_w -639675280
    //   157: ixor
    //   158: goto -> 169
    //   161: ldc2_w 95444487
    //   164: l2i
    //   165: ldc_w 597808302
    //   168: ixor
    //   169: ldc2_w -1933444569
    //   172: l2i
    //   173: ldc_w -641847282
    //   176: ixor
    //   177: ixor
    //   178: lookupswitch default -> 750, 588627627 -> 161, 1936605312 -> 204
    //   204: goto -> 208
    //   207: athrow
    //   208: invokespecial <init> : ()V
    //   211: goto -> 215
    //   214: athrow
    //   215: athrow
    //   216: new java/math/BigDecimal
    //   219: dup
    //   220: getstatic Perryc.1 : I
    //   223: ifeq -> 237
    //   226: ldc2_w -1638374146
    //   229: l2i
    //   230: ldc_w 791447947
    //   233: ixor
    //   234: goto -> 245
    //   237: ldc2_w 1145176346
    //   240: l2i
    //   241: ldc_w -1511406326
    //   244: ixor
    //   245: ldc2_w -1971824277
    //   248: l2i
    //   249: ldc_w 460976528
    //   252: ixor
    //   253: ixor
    //   254: lookupswitch default -> 752, 544556430 -> 237, 1890217195 -> 280
    //   280: dload_0
    //   281: getstatic Perryc.c : I
    //   284: iflt -> 298
    //   287: ldc2_w 560125786
    //   290: l2i
    //   291: ldc_w 1513267133
    //   294: ixor
    //   295: goto -> 306
    //   298: ldc2_w 1413182413
    //   301: l2i
    //   302: ldc_w 1051026695
    //   305: ixor
    //   306: ldc2_w 2005565214
    //   309: l2i
    //   310: ldc_w -1024277854
    //   313: ixor
    //   314: ixor
    //   315: lookupswitch default -> 340, -836176549 -> 754, 856135892 -> 298
    //   340: goto -> 344
    //   343: athrow
    //   344: invokespecial <init> : (D)V
    //   347: goto -> 351
    //   350: athrow
    //   351: getstatic Perryc.1 : I
    //   354: ifeq -> 368
    //   357: ldc2_w -756402898
    //   360: l2i
    //   361: ldc_w -748521405
    //   364: ixor
    //   365: goto -> 376
    //   368: ldc2_w -213334461
    //   371: l2i
    //   372: ldc_w 368314749
    //   375: ixor
    //   376: ldc2_w 1498972869
    //   379: l2i
    //   380: ldc_w -392237083
    //   383: ixor
    //   384: ixor
    //   385: lookupswitch default -> 744, -1337057203 -> 368, 1467654686 -> 412
    //   412: iload_2
    //   413: getstatic Perryc.c : I
    //   416: iflt -> 430
    //   419: ldc2_w 1929150384
    //   422: l2i
    //   423: ldc_w 895889889
    //   426: ixor
    //   427: goto -> 438
    //   430: ldc2_w 158079510
    //   433: l2i
    //   434: ldc_w 1833101986
    //   437: ixor
    //   438: ldc2_w 1208172135
    //   441: l2i
    //   442: ldc_w -1780895274
    //   445: ixor
    //   446: ixor
    //   447: lookupswitch default -> 758, -1707032096 -> 430, -1175159035 -> 472
    //   472: getstatic java/math/RoundingMode.HALF_UP : Ljava/math/RoundingMode;
    //   475: getstatic Perryc.0 : I
    //   478: ifle -> 492
    //   481: ldc2_w -1385349988
    //   484: l2i
    //   485: ldc_w -1461119521
    //   488: ixor
    //   489: goto -> 500
    //   492: ldc2_w 233554071
    //   495: l2i
    //   496: ldc_w -1615630090
    //   499: ixor
    //   500: ldc2_w -1200878608
    //   503: l2i
    //   504: ldc_w 1142953064
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 756, -104319269 -> 492, 1846849529 -> 536
    //   536: goto -> 540
    //   539: athrow
    //   540: invokevirtual setScale : (ILjava/math/RoundingMode;)Ljava/math/BigDecimal;
    //   543: goto -> 547
    //   546: athrow
    //   547: getstatic Perryc.1 : I
    //   550: ifeq -> 564
    //   553: ldc2_w 129238719
    //   556: l2i
    //   557: ldc_w 431843078
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w 1246111291
    //   567: l2i
    //   568: ldc_w -857855881
    //   571: ixor
    //   572: ldc2_w -1529930707
    //   575: l2i
    //   576: ldc_w 696201343
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 746, -1816572437 -> 564, 187179550 -> 608
    //   608: astore_3
    //   609: getstatic Perryc.1 : I
    //   612: ifeq -> 626
    //   615: ldc2_w -1965134106
    //   618: l2i
    //   619: ldc_w -430093939
    //   622: ixor
    //   623: goto -> 634
    //   626: ldc2_w -207889075
    //   629: l2i
    //   630: ldc_w -454782945
    //   633: ixor
    //   634: ldc2_w 1624627466
    //   637: l2i
    //   638: ldc_w 1276436623
    //   641: ixor
    //   642: ixor
    //   643: lookupswitch default -> 668, 838049097 -> 626, 1078075118 -> 742
    //   668: aload_3
    //   669: getstatic Perryc.1 : I
    //   672: ifeq -> 686
    //   675: ldc2_w -1569268605
    //   678: l2i
    //   679: ldc_w -1524353768
    //   682: ixor
    //   683: goto -> 694
    //   686: ldc2_w 1946551697
    //   689: l2i
    //   690: ldc_w 2116898550
    //   693: ixor
    //   694: ldc2_w -2139416648
    //   697: l2i
    //   698: ldc_w -323914801
    //   701: ixor
    //   702: ixor
    //   703: lookupswitch default -> 748, 1726033680 -> 728, 1805159916 -> 686
    //   728: goto -> 732
    //   731: athrow
    //   732: invokevirtual doubleValue : ()D
    //   735: goto -> 739
    //   738: athrow
    //   739: dreturn
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
    //   24	716	0	value	D
    //   24	716	2	places	I
    //   609	131	3	bigDecimal	Ljava/math/BigDecimal;
    // Exception table:
    //   from	to	target	type
    //   8	20	769	finally
    //   207	214	214	finally
    //   207	214	214	java/lang/IllegalStateException
    //   207	214	207	java/lang/EnumConstantNotPresentException
    //   208	214	207	finally
    //   208	214	3	finally
    //   344	350	350	finally
    //   344	350	350	finally
    //   344	350	350	finally
    //   344	350	3	java/lang/IllegalStateException
    //   344	350	350	java/lang/UnsupportedOperationException
    //   539	546	546	finally
    //   539	546	3	finally
    //   539	546	539	finally
    //   540	546	546	java/lang/ArrayIndexOutOfBoundsException
    //   540	546	3	java/lang/IndexOutOfBoundsException
    //   731	738	738	finally
    //   731	738	731	finally
    //   731	738	3	finally
    //   732	738	738	java/lang/RuntimeException
    //   732	738	3	java/lang/ArrayIndexOutOfBoundsException
    //   769	777	769	finally
    //   785	787	3	finally
  }
  
  public static double getBaseMoveSpeed() {
    return Perry1.2z(null, (int)-377971693L ^ 0x96B9EF0A);
  }
  
  public boolean lambda$new$9(Integer paramInteger) {
    return Perry1.5k(this, (int)-1704737353L ^ 0xAF29AB21, paramInteger);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Movement\Strafe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */