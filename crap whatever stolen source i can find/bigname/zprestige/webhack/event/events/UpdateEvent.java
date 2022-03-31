package bigname.zprestige.webhack.event.events;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.EventStage;
import net.minecraft.client.entity.EntityPlayerSP;

public class UpdateEvent extends EventStage {
  public EntityPlayerSP player;
  
  public boolean onGround;
  
  public double x;
  
  public EventType type;
  
  public int stage;
  
  public double z;
  
  public double y;
  
  public float pitch;
  
  public float yaw;
  
  public EntityPlayerSP getPlayer() {
    return Perry1.4Z(this, (int)647960453L ^ 0x7F49BB03);
  }
  
  public void setZ(double paramDouble) {
    Perry1.4K(this, (int)-961680451L ^ 0xBDC7048B, paramDouble);
  }
  
  public double getY() {
    return Perry1.2A(this, (int)-1259831317L ^ 0x9C04D886);
  }
  
  public UpdateEvent(int stage) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w -807544837
    //   9: l2i
    //   10: ldc -399186781
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 658311682
    //   19: l2i
    //   20: ldc 1657194517
    //   22: ixor
    //   23: ldc2_w -337043829
    //   26: l2i
    //   27: ldc -1215100497
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 306, 427939123 -> 56, 2073240700 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w 463453630
    //   66: l2i
    //   67: ldc -1367544565
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -1160900097
    //   76: l2i
    //   77: ldc -1053382498
    //   79: ixor
    //   80: ldc2_w 475225437
    //   83: l2i
    //   84: ldc 184536703
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1555053673 -> 308, 567477560 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.0 : I
    //   122: ifle -> 135
    //   125: ldc2_w -1245942211
    //   128: l2i
    //   129: ldc -2050783838
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -849895143
    //   138: l2i
    //   139: ldc -197478813
    //   141: ixor
    //   142: ldc2_w -2091570371
    //   145: l2i
    //   146: ldc -87879396
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 300, 1090202971 -> 176, 1240060350 -> 135
    //   176: aload_0
    //   177: getstatic Perryc.c : I
    //   180: iflt -> 193
    //   183: ldc2_w -891879419
    //   186: l2i
    //   187: ldc -887760992
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w 1817266575
    //   196: l2i
    //   197: ldc -1193464934
    //   199: ixor
    //   200: ldc2_w -613841002
    //   203: l2i
    //   204: ldc -2001713020
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 304, -2024428281 -> 236, 1377507511 -> 193
    //   236: iload_1
    //   237: getstatic Perryc.0 : I
    //   240: ifle -> 253
    //   243: ldc2_w -1017711502
    //   246: l2i
    //   247: ldc 1555439438
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w -996284389
    //   256: l2i
    //   257: ldc -2023198013
    //   259: ixor
    //   260: ldc2_w 431157619
    //   263: l2i
    //   264: ldc -1263076743
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 302, -286158382 -> 296, 853860406 -> 253
    //   296: putfield stage : I
    //   299: return
    //   300: aconst_null
    //   301: athrow
    //   302: aconst_null
    //   303: athrow
    //   304: aconst_null
    //   305: athrow
    //   306: aconst_null
    //   307: athrow
    //   308: aconst_null
    //   309: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	300	0	this	Lbigname/zprestige/webhack/event/events/UpdateEvent;
    //   0	300	1	stage	I
  }
  
  public UpdateEvent() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 646800827
    //   9: l2i
    //   10: ldc 1346313262
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -554908106
    //   19: l2i
    //   20: ldc 1471954097
    //   22: ixor
    //   23: ldc2_w 1470729086
    //   26: l2i
    //   27: ldc -1298380409
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 308, -1819821204 -> 16, 1818572926 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w -909613949
    //   66: l2i
    //   67: ldc 968780824
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -2104024582
    //   76: l2i
    //   77: ldc 1616001114
    //   79: ixor
    //   80: ldc2_w 1568332686
    //   83: l2i
    //   84: ldc -1366782309
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1965789741 -> 73, 59006350 -> 302
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.0 : I
    //   122: ifle -> 135
    //   125: ldc2_w -199519631
    //   128: l2i
    //   129: ldc -1952862201
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w 307940196
    //   138: l2i
    //   139: ldc -1437402092
    //   141: ixor
    //   142: ldc2_w 1725560126
    //   145: l2i
    //   146: ldc -1806712920
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, -1928042272 -> 300, 216940681 -> 135
    //   176: aload_0
    //   177: getstatic Perryc.1 : I
    //   180: ifeq -> 193
    //   183: ldc2_w 1541923166
    //   186: l2i
    //   187: ldc 1257540913
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w -1009838904
    //   196: l2i
    //   197: ldc -427521933
    //   199: ixor
    //   200: ldc2_w 1513838837
    //   203: l2i
    //   204: ldc 1799202934
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 304, 340618296 -> 236, 538287340 -> 193
    //   236: getstatic bigname/zprestige/webhack/event/events/EventType.POST : Lbigname/zprestige/webhack/event/events/EventType;
    //   239: getstatic Perryc.c : I
    //   242: iflt -> 255
    //   245: ldc2_w -1705605221
    //   248: l2i
    //   249: ldc -1217619706
    //   251: ixor
    //   252: goto -> 262
    //   255: ldc2_w 655948681
    //   258: l2i
    //   259: ldc 776681091
    //   261: ixor
    //   262: ldc2_w 824164995
    //   265: l2i
    //   266: ldc -1603356342
    //   268: ixor
    //   269: ixor
    //   270: lookupswitch default -> 296, -1135909548 -> 306, 453725613 -> 255
    //   296: putfield type : Lbigname/zprestige/webhack/event/events/EventType;
    //   299: return
    //   300: aconst_null
    //   301: athrow
    //   302: aconst_null
    //   303: athrow
    //   304: aconst_null
    //   305: athrow
    //   306: aconst_null
    //   307: athrow
    //   308: aconst_null
    //   309: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	300	0	this	Lbigname/zprestige/webhack/event/events/UpdateEvent;
  }
  
  public boolean isOnGround() {
    return Perry1.4x(this, (int)1509725404L ^ 0x123FB561);
  }
  
  public void setYaw(float paramFloat) {
    Perry1.0Z(this, (int)-1409878815L ^ 0x9B5643D8, paramFloat);
  }
  
  public double getX() {
    return Perry1.2H(this, (int)261823648L ^ 0x68F9FFD5);
  }
  
  public EventType getType() {
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
  
  public void setOnGround(boolean paramBoolean) {
    Perry1.63(this, (int)1797348865L ^ 0x56651F2A, paramBoolean);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void setPitch(float paramFloat) {
    Perry1.0Y(this, (int)-1916785735L ^ 0xE35A5CC2, paramFloat);
  }
  
  public void setPlayer(EntityPlayerSP player) {
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
  
  public float getYaw() {
    return Perry1.2J(this, (int)-454889559L ^ 0xB4FD8EE6);
  }
  
  public void setType(EventType type) {
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
  
  public float getPitch() {
    return Perry1.2J(this, (int)-150611066L ^ 0xA71ABAC8);
  }
  
  public double getZ() {
    return Perry1.2z(this, (int)1799177062L ^ 0x14FC3078);
  }
  
  public int getStage() {
    return Perry1.2Z(this, (int)163464153L ^ 0x4B8DE7D8);
  }
  
  public void setY(double paramDouble) {
    Perry1.4L(this, (int)103194755L ^ 0x2A4A5A9, paramDouble);
  }
  
  public void setX(double paramDouble) {
    Perry1.4K(this, (int)2040890085L ^ 0x2CF6DD0, paramDouble);
  }
  
  public UpdateEvent(EventType type, EntityPlayerSP player, float yaw, float pitch, double x, double y, double z, boolean onGround) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w -695707144
    //   9: l2i
    //   10: ldc_w -1670936435
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -2012312033
    //   20: l2i
    //   21: ldc_w -289527011
    //   24: ixor
    //   25: ldc2_w -665467714
    //   28: l2i
    //   29: ldc_w -569894140
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, 646620518 -> 17, 1286737615 -> 1648
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w 713318499
    //   70: l2i
    //   71: ldc_w -336176559
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -181279703
    //   81: l2i
    //   82: ldc_w 148317283
    //   85: ixor
    //   86: ldc2_w -192588955
    //   89: l2i
    //   90: ldc_w -354582682
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 1624, -550889935 -> 78, -474026935 -> 120
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 140
    //   129: ldc2_w 1833340456
    //   132: l2i
    //   133: ldc_w 782016369
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w -135995702
    //   143: l2i
    //   144: ldc_w -1092885975
    //   147: ixor
    //   148: ldc2_w -2146784053
    //   151: l2i
    //   152: ldc_w -950945894
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 1628, 75565576 -> 140, 241444786 -> 184
    //   184: aload_0
    //   185: getstatic Perryc.0 : I
    //   188: ifle -> 202
    //   191: ldc2_w -204433620
    //   194: l2i
    //   195: ldc_w -1394744147
    //   198: ixor
    //   199: goto -> 210
    //   202: ldc2_w -1862583525
    //   205: l2i
    //   206: ldc_w -1336441641
    //   209: ixor
    //   210: ldc2_w 2109045372
    //   213: l2i
    //   214: ldc_w -415158481
    //   217: ixor
    //   218: ixor
    //   219: lookupswitch default -> 244, -1167765777 -> 202, -973527342 -> 1652
    //   244: aload_1
    //   245: getstatic Perryc.c : I
    //   248: iflt -> 262
    //   251: ldc2_w -1485489425
    //   254: l2i
    //   255: ldc_w 231944749
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w -1880988641
    //   265: l2i
    //   266: ldc_w -412566261
    //   269: ixor
    //   270: ldc2_w 585452515
    //   273: l2i
    //   274: ldc_w 2000259619
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 1664, -8730366 -> 262, 1029052628 -> 304
    //   304: putfield type : Lbigname/zprestige/webhack/event/events/EventType;
    //   307: getstatic Perryc.1 : I
    //   310: ifeq -> 324
    //   313: ldc2_w -411958287
    //   316: l2i
    //   317: ldc_w 1171275940
    //   320: ixor
    //   321: goto -> 332
    //   324: ldc2_w 1753868356
    //   327: l2i
    //   328: ldc_w 765740137
    //   331: ixor
    //   332: ldc2_w 1295795756
    //   335: l2i
    //   336: ldc_w -1973646200
    //   339: ixor
    //   340: ixor
    //   341: lookupswitch default -> 368, 752936180 -> 324, 1707248113 -> 1666
    //   368: aload_0
    //   369: getstatic Perryc.c : I
    //   372: iflt -> 386
    //   375: ldc2_w 50653065
    //   378: l2i
    //   379: ldc_w 1885479105
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w 1973539263
    //   389: l2i
    //   390: ldc_w -1695902681
    //   393: ixor
    //   394: ldc2_w 190041942
    //   397: l2i
    //   398: ldc_w 355776399
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 1636, -248758975 -> 428, 1828831121 -> 386
    //   428: aload_2
    //   429: getstatic Perryc.c : I
    //   432: iflt -> 446
    //   435: ldc2_w 516711984
    //   438: l2i
    //   439: ldc_w -44216218
    //   442: ixor
    //   443: goto -> 454
    //   446: ldc2_w -538326295
    //   449: l2i
    //   450: ldc_w -955740915
    //   453: ixor
    //   454: ldc2_w 1451696928
    //   457: l2i
    //   458: ldc_w -1532009046
    //   461: ixor
    //   462: ixor
    //   463: lookupswitch default -> 488, 297365724 -> 1616, 1434121956 -> 446
    //   488: putfield player : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   491: getstatic Perryc.1 : I
    //   494: ifeq -> 508
    //   497: ldc2_w 1059047787
    //   500: l2i
    //   501: ldc_w -1056726507
    //   504: ixor
    //   505: goto -> 516
    //   508: ldc2_w -725797706
    //   511: l2i
    //   512: ldc_w 1168102882
    //   515: ixor
    //   516: ldc2_w -636685399
    //   519: l2i
    //   520: ldc_w -478784329
    //   523: ixor
    //   524: ixor
    //   525: lookupswitch default -> 1658, -1470609846 -> 552, -949564320 -> 508
    //   552: aload_0
    //   553: getstatic Perryc.0 : I
    //   556: ifle -> 570
    //   559: ldc2_w -960735217
    //   562: l2i
    //   563: ldc_w -1814137213
    //   566: ixor
    //   567: goto -> 578
    //   570: ldc2_w -280481067
    //   573: l2i
    //   574: ldc_w -1819546824
    //   577: ixor
    //   578: ldc2_w 1461338770
    //   581: l2i
    //   582: ldc_w 441794231
    //   585: ixor
    //   586: ixor
    //   587: lookupswitch default -> 1618, 405623465 -> 570, 831301064 -> 612
    //   612: fload_3
    //   613: getstatic Perryc.1 : I
    //   616: ifeq -> 630
    //   619: ldc2_w -1603178718
    //   622: l2i
    //   623: ldc_w 1858495239
    //   626: ixor
    //   627: goto -> 638
    //   630: ldc2_w 842036222
    //   633: l2i
    //   634: ldc_w 1070326158
    //   637: ixor
    //   638: ldc2_w 432464715
    //   641: l2i
    //   642: ldc_w -422051408
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 1626, -219844469 -> 672, 833220318 -> 630
    //   672: putfield yaw : F
    //   675: getstatic Perryc.c : I
    //   678: iflt -> 692
    //   681: ldc2_w -1181812097
    //   684: l2i
    //   685: ldc_w 1684370327
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w -1015420527
    //   695: l2i
    //   696: ldc_w 816889177
    //   699: ixor
    //   700: ldc2_w -332604849
    //   703: l2i
    //   704: ldc_w 361705597
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 736, -1921265330 -> 692, 608723930 -> 1660
    //   736: aload_0
    //   737: getstatic Perryc.1 : I
    //   740: ifeq -> 754
    //   743: ldc2_w 1727490734
    //   746: l2i
    //   747: ldc_w -2095699090
    //   750: ixor
    //   751: goto -> 762
    //   754: ldc2_w -1429292437
    //   757: l2i
    //   758: ldc_w -1959877366
    //   761: ixor
    //   762: ldc2_w -1018906226
    //   765: l2i
    //   766: ldc_w -1041300829
    //   769: ixor
    //   770: ixor
    //   771: lookupswitch default -> 796, -1678736186 -> 754, -414516499 -> 1638
    //   796: fload #4
    //   798: getstatic Perryc.1 : I
    //   801: ifeq -> 815
    //   804: ldc2_w 2048318950
    //   807: l2i
    //   808: ldc_w 1629931976
    //   811: ixor
    //   812: goto -> 823
    //   815: ldc2_w 229378100
    //   818: l2i
    //   819: ldc_w -71716784
    //   822: ixor
    //   823: ldc2_w 1316433269
    //   826: l2i
    //   827: ldc_w 360665410
    //   830: ixor
    //   831: ixor
    //   832: lookupswitch default -> 1646, -1390558125 -> 860, 1077438489 -> 815
    //   860: putfield pitch : F
    //   863: getstatic Perryc.1 : I
    //   866: ifeq -> 880
    //   869: ldc2_w -237789224
    //   872: l2i
    //   873: ldc_w -368268512
    //   876: ixor
    //   877: goto -> 888
    //   880: ldc2_w 1219137916
    //   883: l2i
    //   884: ldc_w 1402844427
    //   887: ixor
    //   888: ldc2_w -279694890
    //   891: l2i
    //   892: ldc_w 1998655389
    //   895: ixor
    //   896: ixor
    //   897: lookupswitch default -> 924, -2086008141 -> 1642, -1773934216 -> 880
    //   924: aload_0
    //   925: getstatic Perryc.c : I
    //   928: iflt -> 942
    //   931: ldc2_w 504548504
    //   934: l2i
    //   935: ldc_w -2099625726
    //   938: ixor
    //   939: goto -> 950
    //   942: ldc2_w -716582747
    //   945: l2i
    //   946: ldc_w 1543115615
    //   949: ixor
    //   950: ldc2_w 1502506920
    //   953: l2i
    //   954: ldc_w 1872358812
    //   957: ixor
    //   958: ixor
    //   959: lookupswitch default -> 984, -1428222034 -> 1650, 492509097 -> 942
    //   984: dload #5
    //   986: getstatic Perryc.c : I
    //   989: iflt -> 1003
    //   992: ldc2_w -1252649382
    //   995: l2i
    //   996: ldc_w -1033887001
    //   999: ixor
    //   1000: goto -> 1011
    //   1003: ldc2_w -1218572476
    //   1006: l2i
    //   1007: ldc_w 1346681307
    //   1010: ixor
    //   1011: ldc2_w 1525779445
    //   1014: l2i
    //   1015: ldc_w 2028966962
    //   1018: ixor
    //   1019: ixor
    //   1020: lookupswitch default -> 1662, -989550248 -> 1048, 1428695930 -> 1003
    //   1048: putfield x : D
    //   1051: getstatic Perryc.0 : I
    //   1054: ifle -> 1068
    //   1057: ldc2_w 1479575707
    //   1060: l2i
    //   1061: ldc_w 1805617811
    //   1064: ixor
    //   1065: goto -> 1076
    //   1068: ldc2_w -742708423
    //   1071: l2i
    //   1072: ldc_w -1091395484
    //   1075: ixor
    //   1076: ldc2_w 2091049424
    //   1079: l2i
    //   1080: ldc_w -122145249
    //   1083: ixor
    //   1084: ixor
    //   1085: lookupswitch default -> 1112, -1428098348 -> 1068, -1212820025 -> 1622
    //   1112: aload_0
    //   1113: getstatic Perryc.c : I
    //   1116: iflt -> 1130
    //   1119: ldc2_w -283671222
    //   1122: l2i
    //   1123: ldc_w -1323108323
    //   1126: ixor
    //   1127: goto -> 1138
    //   1130: ldc2_w 599847842
    //   1133: l2i
    //   1134: ldc_w 349376509
    //   1137: ixor
    //   1138: ldc2_w -1480770058
    //   1141: l2i
    //   1142: ldc_w 977488698
    //   1145: ixor
    //   1146: ixor
    //   1147: lookupswitch default -> 1172, -1010103397 -> 1630, 1263430412 -> 1130
    //   1172: dload #7
    //   1174: getstatic Perryc.1 : I
    //   1177: ifeq -> 1191
    //   1180: ldc2_w -1542648743
    //   1183: l2i
    //   1184: ldc_w 1158728641
    //   1187: ixor
    //   1188: goto -> 1199
    //   1191: ldc2_w 881414720
    //   1194: l2i
    //   1195: ldc_w -2118288185
    //   1198: ixor
    //   1199: ldc2_w 1392368145
    //   1202: l2i
    //   1203: ldc_w 1882543021
    //   1206: ixor
    //   1207: ixor
    //   1208: lookupswitch default -> 1632, -1745049797 -> 1236, -1009431004 -> 1191
    //   1236: putfield y : D
    //   1239: getstatic Perryc.c : I
    //   1242: iflt -> 1256
    //   1245: ldc2_w 874956771
    //   1248: l2i
    //   1249: ldc_w -34726598
    //   1252: ixor
    //   1253: goto -> 1264
    //   1256: ldc2_w 957076268
    //   1259: l2i
    //   1260: ldc_w 1304887830
    //   1263: ixor
    //   1264: ldc2_w -1449489516
    //   1267: l2i
    //   1268: ldc_w 1618413588
    //   1271: ixor
    //   1272: ixor
    //   1273: lookupswitch default -> 1620, -1121889606 -> 1300, 2447705 -> 1256
    //   1300: aload_0
    //   1301: getstatic Perryc.c : I
    //   1304: iflt -> 1318
    //   1307: ldc2_w -1622410440
    //   1310: l2i
    //   1311: ldc_w 1467268898
    //   1314: ixor
    //   1315: goto -> 1326
    //   1318: ldc2_w 2047600259
    //   1321: l2i
    //   1322: ldc_w 611544952
    //   1325: ixor
    //   1326: ldc2_w -1841109279
    //   1329: l2i
    //   1330: ldc_w 530809412
    //   1333: ixor
    //   1334: ixor
    //   1335: lookupswitch default -> 1644, -744886946 -> 1360, 1172185279 -> 1318
    //   1360: dload #9
    //   1362: getstatic Perryc.c : I
    //   1365: iflt -> 1379
    //   1368: ldc2_w -1581821100
    //   1371: l2i
    //   1372: ldc_w 1180055386
    //   1375: ixor
    //   1376: goto -> 1387
    //   1379: ldc2_w -1369159125
    //   1382: l2i
    //   1383: ldc_w -104906374
    //   1386: ixor
    //   1387: ldc2_w -443485757
    //   1390: l2i
    //   1391: ldc_w -351392802
    //   1394: ixor
    //   1395: ixor
    //   1396: lookupswitch default -> 1654, -377504237 -> 1379, 1497747788 -> 1424
    //   1424: putfield z : D
    //   1427: getstatic Perryc.1 : I
    //   1430: ifeq -> 1444
    //   1433: ldc2_w 135216652
    //   1436: l2i
    //   1437: ldc_w -1153055695
    //   1440: ixor
    //   1441: goto -> 1452
    //   1444: ldc2_w 1756330321
    //   1447: l2i
    //   1448: ldc_w -1013676553
    //   1451: ixor
    //   1452: ldc2_w 1071312692
    //   1455: l2i
    //   1456: ldc_w 1111966454
    //   1459: ixor
    //   1460: ixor
    //   1461: lookupswitch default -> 1640, -824748033 -> 1444, -693743260 -> 1488
    //   1488: aload_0
    //   1489: getstatic Perryc.c : I
    //   1492: iflt -> 1506
    //   1495: ldc2_w -188493866
    //   1498: l2i
    //   1499: ldc_w -352995132
    //   1502: ixor
    //   1503: goto -> 1514
    //   1506: ldc2_w 781035875
    //   1509: l2i
    //   1510: ldc_w -603821974
    //   1513: ixor
    //   1514: ldc2_w -1685485560
    //   1517: l2i
    //   1518: ldc_w -958173581
    //   1521: ixor
    //   1522: ixor
    //   1523: lookupswitch default -> 1656, -1343936654 -> 1548, 1130140009 -> 1506
    //   1548: iload #11
    //   1550: getstatic Perryc.0 : I
    //   1553: ifle -> 1567
    //   1556: ldc2_w 362849500
    //   1559: l2i
    //   1560: ldc_w 484045189
    //   1563: ixor
    //   1564: goto -> 1575
    //   1567: ldc2_w 257971895
    //   1570: l2i
    //   1571: ldc_w 1077603265
    //   1574: ixor
    //   1575: ldc2_w -1659782227
    //   1578: l2i
    //   1579: ldc_w -693594164
    //   1582: ixor
    //   1583: ixor
    //   1584: lookupswitch default -> 1634, 82022679 -> 1612, 1119910200 -> 1567
    //   1612: putfield onGround : Z
    //   1615: return
    //   1616: aconst_null
    //   1617: athrow
    //   1618: aconst_null
    //   1619: athrow
    //   1620: aconst_null
    //   1621: athrow
    //   1622: aconst_null
    //   1623: athrow
    //   1624: aconst_null
    //   1625: athrow
    //   1626: aconst_null
    //   1627: athrow
    //   1628: aconst_null
    //   1629: athrow
    //   1630: aconst_null
    //   1631: athrow
    //   1632: aconst_null
    //   1633: athrow
    //   1634: aconst_null
    //   1635: athrow
    //   1636: aconst_null
    //   1637: athrow
    //   1638: aconst_null
    //   1639: athrow
    //   1640: aconst_null
    //   1641: athrow
    //   1642: aconst_null
    //   1643: athrow
    //   1644: aconst_null
    //   1645: athrow
    //   1646: aconst_null
    //   1647: athrow
    //   1648: aconst_null
    //   1649: athrow
    //   1650: aconst_null
    //   1651: athrow
    //   1652: aconst_null
    //   1653: athrow
    //   1654: aconst_null
    //   1655: athrow
    //   1656: aconst_null
    //   1657: athrow
    //   1658: aconst_null
    //   1659: athrow
    //   1660: aconst_null
    //   1661: athrow
    //   1662: aconst_null
    //   1663: athrow
    //   1664: aconst_null
    //   1665: athrow
    //   1666: aconst_null
    //   1667: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1616	0	this	Lbigname/zprestige/webhack/event/events/UpdateEvent;
    //   0	1616	1	type	Lbigname/zprestige/webhack/event/events/EventType;
    //   0	1616	2	player	Lnet/minecraft/client/entity/EntityPlayerSP;
    //   0	1616	3	yaw	F
    //   0	1616	4	pitch	F
    //   0	1616	5	x	D
    //   0	1616	7	y	D
    //   0	1616	9	z	D
    //   0	1616	11	onGround	Z
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\UpdateEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */