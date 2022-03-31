package bigname.zprestige.webhack.features.modules.Combat;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.util.InventoryUtil;
import bigname.zprestige.webhack.util.Timer;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import net.minecraft.entity.player.EntityPlayer;

public class AutoArmor extends Module {
  public Queue<InventoryUtil.Task> taskList;
  
  public Integer repair;
  
  public Setting<Integer> delay;
  
  public boolean useless;
  
  public boolean flag;
  
  public static AutoArmor INSTANCE;
  
  public Integer closestEnemy;
  
  public List<Integer> doneSlots;
  
  public Timer timer;
  
  public boolean curse;
  
  public Integer actions;
  
  public boolean lambda$onTick$0(EntityPlayer paramEntityPlayer) {
    return Perry1.0e(this, (int)-1394518852L ^ 0x9270E862, paramEntityPlayer);
  }
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Combat/AutoArmor
    //   3: dup
    //   4: getstatic Perryc.1 : I
    //   7: ifeq -> 20
    //   10: ldc2_w 881258308
    //   13: l2i
    //   14: ldc -1287733554
    //   16: ixor
    //   17: goto -> 27
    //   20: ldc2_w -853524089
    //   23: l2i
    //   24: ldc -415439378
    //   26: ixor
    //   27: ldc2_w 639931399
    //   30: l2i
    //   31: ldc -1318044313
    //   33: ixor
    //   34: ixor
    //   35: lookupswitch default -> 60, 283965674 -> 126, 1998548782 -> 20
    //   60: invokespecial <init> : ()V
    //   63: getstatic Perryc.1 : I
    //   66: ifeq -> 79
    //   69: ldc2_w 1232714172
    //   72: l2i
    //   73: ldc 2083003988
    //   75: ixor
    //   76: goto -> 86
    //   79: ldc2_w -659601005
    //   82: l2i
    //   83: ldc 499599653
    //   85: ixor
    //   86: ldc2_w -1478607432
    //   89: l2i
    //   90: ldc -1864268174
    //   92: ixor
    //   93: ixor
    //   94: lookupswitch default -> 120, 40770594 -> 124, 878142160 -> 79
    //   120: putstatic bigname/zprestige/webhack/features/modules/Combat/AutoArmor.INSTANCE : Lbigname/zprestige/webhack/features/modules/Combat/AutoArmor;
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
  }
  
  public void setInstance() {
    Perry1.4k(this, (int)377508314L ^ 0x1A802E35);
  }
  
  public Map getArmor() {
    if (Perryc.c < 0) {
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
  
  public Map getInventorySlots(int current, int last) {
    if (Perryc.c < 0) {
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
  
  public void onLogout() {
    Perry1.3j(this, (int)202343158L ^ 0x2F95FCCE);
  }
  
  public void takeOffSlot(int slot) {
    if (Perryc.c < 0) {
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
  
  public void getSlotOn(int slot, int target) {
    if (Perryc.c < 0) {
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
  
  public void onLogin() {
    Perry1.41(this, (int)-1904640519L ^ 0x9298F849);
  }
  
  public void onDisable() {
    Perry1.3u(this, (int)1234386030L ^ 0x101744DD);
  }
  
  public AutoArmor() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w 666043130
    //   9: l2i
    //   10: ldc_w -778675793
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -696758413
    //   20: l2i
    //   21: ldc_w -305634372
    //   24: ixor
    //   25: ldc2_w 2140057055
    //   28: l2i
    //   29: ldc_w -549702313
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 2566, -1694321593 -> 60, 1452786653 -> 17
    //   60: aload_0
    //   61: ldc_w '汆㌆氙㶸?苉๴ᇅ蹱'
    //   64: getstatic Perryc.c : I
    //   67: iflt -> 81
    //   70: ldc2_w -647812491
    //   73: l2i
    //   74: ldc_w 978639041
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 159329642
    //   84: l2i
    //   85: ldc_w 1669081062
    //   88: ixor
    //   89: ldc2_w 1778543574
    //   92: l2i
    //   93: ldc_w 834507686
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, -1199043900 -> 2544, 907261658 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '汗㌆氙㶤?苺๫ᇇ蹬蜨퓼ਨꆱ無ϊ辍됪ꝷ웣俿'
    //   130: getstatic Perryc.0 : I
    //   133: ifle -> 147
    //   136: ldc2_w 1181052108
    //   139: l2i
    //   140: ldc_w -1239116281
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w 1023426259
    //   150: l2i
    //   151: ldc_w 700680274
    //   154: ixor
    //   155: ldc2_w -1256733417
    //   158: l2i
    //   159: ldc_w 1152454988
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 2564, -446340390 -> 192, 31927952 -> 147
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w 1440566558
    //   204: l2i
    //   205: ldc_w -687340478
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w 965342089
    //   215: l2i
    //   216: ldc_w 1239794841
    //   219: ixor
    //   220: ldc2_w -250016823
    //   223: l2i
    //   224: ldc_w -805910762
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 256, -1137015421 -> 2514, -1113807259 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -646507414
    //   262: l2i
    //   263: ldc_w -646507413
    //   266: ixor
    //   267: ldc2_w -1326761931
    //   270: l2i
    //   271: ldc_w -1326761931
    //   274: ixor
    //   275: ldc2_w -297142054
    //   278: l2i
    //   279: ldc_w -297142054
    //   282: ixor
    //   283: getstatic Perryc.0 : I
    //   286: ifle -> 300
    //   289: ldc2_w -974238974
    //   292: l2i
    //   293: ldc_w -1951020750
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -1262736040
    //   303: l2i
    //   304: ldc_w 408076685
    //   307: ixor
    //   308: ldc2_w -1341845633
    //   311: l2i
    //   312: ldc_w -362184484
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 2500, -159227018 -> 344, 339152275 -> 300
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.c : I
    //   350: iflt -> 364
    //   353: ldc2_w -199670850
    //   356: l2i
    //   357: ldc_w 140614678
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w 420128113
    //   367: l2i
    //   368: ldc_w -1104764074
    //   371: ixor
    //   372: ldc2_w -250237405
    //   375: l2i
    //   376: ldc_w 1676862588
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, 1855952375 -> 2526, 1994649827 -> 364
    //   408: aload_0
    //   409: getstatic Perryc.c : I
    //   412: iflt -> 426
    //   415: ldc2_w 1115647424
    //   418: l2i
    //   419: ldc_w -2010118311
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -1757730606
    //   429: l2i
    //   430: ldc_w -1400636037
    //   433: ixor
    //   434: ldc2_w -1513051981
    //   437: l2i
    //   438: ldc_w -935744832
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -1482266390 -> 2558, 47268129 -> 426
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '汃㌖氁㶶?'
    //   476: getstatic Perryc.c : I
    //   479: iflt -> 493
    //   482: ldc2_w -1305878001
    //   485: l2i
    //   486: ldc_w -580393006
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w -645896741
    //   496: l2i
    //   497: ldc_w 335544276
    //   500: ixor
    //   501: ldc2_w -9632605
    //   504: l2i
    //   505: ldc_w -909522220
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 2522, -52734856 -> 536, 1508559786 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w 1578102354
    //   542: l2i
    //   543: ldc_w 1578102368
    //   546: ixor
    //   547: getstatic Perryc.0 : I
    //   550: ifle -> 564
    //   553: ldc2_w 132847854
    //   556: l2i
    //   557: ldc_w -1960866311
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w -1312686270
    //   567: l2i
    //   568: ldc_w -2028007523
    //   571: ixor
    //   572: ldc2_w 1075970076
    //   575: l2i
    //   576: ldc_w 1950165287
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 608, -1192510420 -> 2552, 1782674038 -> 564
    //   608: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   611: ldc2_w -1413394719
    //   614: l2i
    //   615: ldc_w -1413394719
    //   618: ixor
    //   619: getstatic Perryc.1 : I
    //   622: ifeq -> 636
    //   625: ldc2_w 1350579505
    //   628: l2i
    //   629: ldc_w 349099032
    //   632: ixor
    //   633: goto -> 644
    //   636: ldc2_w 1388185315
    //   639: l2i
    //   640: ldc_w -212050382
    //   643: ixor
    //   644: ldc2_w -1794079152
    //   647: l2i
    //   648: ldc_w -370847670
    //   651: ixor
    //   652: ixor
    //   653: lookupswitch default -> 680, 951793459 -> 2504, 1120160958 -> 636
    //   680: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   683: ldc2_w -821491125
    //   686: l2i
    //   687: ldc_w -821490753
    //   690: ixor
    //   691: getstatic Perryc.0 : I
    //   694: ifle -> 708
    //   697: ldc2_w 40137582
    //   700: l2i
    //   701: ldc_w -1913447727
    //   704: ixor
    //   705: goto -> 716
    //   708: ldc2_w -1323139101
    //   711: l2i
    //   712: ldc_w 170358533
    //   715: ixor
    //   716: ldc2_w -1731489903
    //   719: l2i
    //   720: ldc_w 1669331543
    //   723: ixor
    //   724: ixor
    //   725: lookupswitch default -> 752, -1813638541 -> 708, 1948458105 -> 2568
    //   752: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   755: getstatic Perryc.c : I
    //   758: iflt -> 772
    //   761: ldc2_w 1102395167
    //   764: l2i
    //   765: ldc_w 455138850
    //   768: ixor
    //   769: goto -> 780
    //   772: ldc2_w 1259137169
    //   775: l2i
    //   776: ldc_w 2070535719
    //   779: ixor
    //   780: ldc2_w -318322853
    //   783: l2i
    //   784: ldc_w -87397565
    //   787: ixor
    //   788: ixor
    //   789: lookupswitch default -> 2520, 665426606 -> 816, 1297696037 -> 772
    //   816: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   819: getstatic Perryc.0 : I
    //   822: ifle -> 836
    //   825: ldc2_w 1624800909
    //   828: l2i
    //   829: ldc_w 470500249
    //   832: ixor
    //   833: goto -> 844
    //   836: ldc2_w -1986778623
    //   839: l2i
    //   840: ldc_w 1999788120
    //   843: ixor
    //   844: ldc2_w -1790363374
    //   847: l2i
    //   848: ldc_w 735551145
    //   851: ixor
    //   852: ixor
    //   853: lookupswitch default -> 880, -1035101521 -> 2556, 1392795138 -> 836
    //   880: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   883: getstatic Perryc.1 : I
    //   886: ifeq -> 900
    //   889: ldc2_w -1689509629
    //   892: l2i
    //   893: ldc_w -1754571104
    //   896: ixor
    //   897: goto -> 908
    //   900: ldc2_w 1253729899
    //   903: l2i
    //   904: ldc_w -2029308624
    //   907: ixor
    //   908: ldc2_w 506977830
    //   911: l2i
    //   912: ldc_w 1524572768
    //   915: ixor
    //   916: ixor
    //   917: lookupswitch default -> 944, 164765400 -> 900, 1221559269 -> 2512
    //   944: putfield delay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   947: getstatic Perryc.1 : I
    //   950: ifeq -> 964
    //   953: ldc2_w 500635958
    //   956: l2i
    //   957: ldc_w -149167851
    //   960: ixor
    //   961: goto -> 972
    //   964: ldc2_w -737788101
    //   967: l2i
    //   968: ldc_w -531502040
    //   971: ixor
    //   972: ldc2_w -1358963571
    //   975: l2i
    //   976: ldc_w -372849086
    //   979: ixor
    //   980: ixor
    //   981: lookupswitch default -> 1008, -1376394516 -> 2570, 832957651 -> 964
    //   1008: aload_0
    //   1009: new bigname/zprestige/webhack/util/Timer
    //   1012: dup
    //   1013: getstatic Perryc.0 : I
    //   1016: ifle -> 1030
    //   1019: ldc2_w -34752300
    //   1022: l2i
    //   1023: ldc_w 1339952405
    //   1026: ixor
    //   1027: goto -> 1038
    //   1030: ldc2_w -836089453
    //   1033: l2i
    //   1034: ldc_w 1408163314
    //   1037: ixor
    //   1038: ldc2_w 1099149331
    //   1041: l2i
    //   1042: ldc_w 1160854202
    //   1045: ixor
    //   1046: ixor
    //   1047: lookupswitch default -> 2540, -1720312120 -> 1072, -1233043608 -> 1030
    //   1072: invokespecial <init> : ()V
    //   1075: getstatic Perryc.0 : I
    //   1078: ifle -> 1092
    //   1081: ldc2_w -1545890196
    //   1084: l2i
    //   1085: ldc_w -314904241
    //   1088: ixor
    //   1089: goto -> 1100
    //   1092: ldc2_w -120418994
    //   1095: l2i
    //   1096: ldc_w -126972930
    //   1099: ixor
    //   1100: ldc2_w 452241692
    //   1103: l2i
    //   1104: ldc_w 1135764026
    //   1107: ixor
    //   1108: ixor
    //   1109: lookupswitch default -> 2502, 396864517 -> 1092, 1509608854 -> 1136
    //   1136: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   1139: getstatic Perryc.0 : I
    //   1142: ifle -> 1156
    //   1145: ldc2_w 808097657
    //   1148: l2i
    //   1149: ldc_w 1641519136
    //   1152: ixor
    //   1153: goto -> 1164
    //   1156: ldc2_w 717330525
    //   1159: l2i
    //   1160: ldc_w -76987432
    //   1163: ixor
    //   1164: ldc2_w 1679737911
    //   1167: l2i
    //   1168: ldc_w -1718792361
    //   1171: ixor
    //   1172: ixor
    //   1173: lookupswitch default -> 1200, -1402043335 -> 2560, 1216834827 -> 1156
    //   1200: aload_0
    //   1201: new java/util/concurrent/ConcurrentLinkedQueue
    //   1204: dup
    //   1205: getstatic Perryc.c : I
    //   1208: iflt -> 1222
    //   1211: ldc2_w -851791718
    //   1214: l2i
    //   1215: ldc_w 330058117
    //   1218: ixor
    //   1219: goto -> 1230
    //   1222: ldc2_w 683925805
    //   1225: l2i
    //   1226: ldc_w 1424131773
    //   1229: ixor
    //   1230: ldc2_w 859849247
    //   1233: l2i
    //   1234: ldc_w 1756804282
    //   1237: ixor
    //   1238: ixor
    //   1239: lookupswitch default -> 2542, -2057302086 -> 1222, 668438837 -> 1264
    //   1264: invokespecial <init> : ()V
    //   1267: getstatic Perryc.0 : I
    //   1270: ifle -> 1284
    //   1273: ldc2_w -678493613
    //   1276: l2i
    //   1277: ldc_w -609952521
    //   1280: ixor
    //   1281: goto -> 1292
    //   1284: ldc2_w 3823734
    //   1287: l2i
    //   1288: ldc_w 1733139880
    //   1291: ixor
    //   1292: ldc2_w -723189161
    //   1295: l2i
    //   1296: ldc_w -1084414974
    //   1299: ixor
    //   1300: ixor
    //   1301: lookupswitch default -> 1328, 165286124 -> 1284, 1737750769 -> 2562
    //   1328: putfield taskList : Ljava/util/Queue;
    //   1331: getstatic Perryc.c : I
    //   1334: iflt -> 1348
    //   1337: ldc2_w 1940798958
    //   1340: l2i
    //   1341: ldc_w 1696736694
    //   1344: ixor
    //   1345: goto -> 1356
    //   1348: ldc2_w 903056697
    //   1351: l2i
    //   1352: ldc_w 667901703
    //   1355: ixor
    //   1356: ldc2_w -591289801
    //   1359: l2i
    //   1360: ldc_w -758309122
    //   1363: ixor
    //   1364: ixor
    //   1365: lookupswitch default -> 1392, -1368488487 -> 1348, 411083921 -> 2506
    //   1392: aload_0
    //   1393: new java/util/ArrayList
    //   1396: dup
    //   1397: getstatic Perryc.c : I
    //   1400: iflt -> 1414
    //   1403: ldc2_w 1476535229
    //   1406: l2i
    //   1407: ldc_w 699027524
    //   1410: ixor
    //   1411: goto -> 1422
    //   1414: ldc2_w 1848481181
    //   1417: l2i
    //   1418: ldc_w -1219507530
    //   1421: ixor
    //   1422: ldc2_w 207940401
    //   1425: l2i
    //   1426: ldc_w -2068115193
    //   1429: ixor
    //   1430: ixor
    //   1431: lookupswitch default -> 2574, -109606449 -> 1414, 1371383069 -> 1456
    //   1456: invokespecial <init> : ()V
    //   1459: getstatic Perryc.c : I
    //   1462: iflt -> 1476
    //   1465: ldc2_w 1238994129
    //   1468: l2i
    //   1469: ldc_w -1442298140
    //   1472: ixor
    //   1473: goto -> 1484
    //   1476: ldc2_w -1080783493
    //   1479: l2i
    //   1480: ldc_w 2060516590
    //   1483: ixor
    //   1484: ldc2_w 571331529
    //   1487: l2i
    //   1488: ldc_w 157390996
    //   1491: ixor
    //   1492: ixor
    //   1493: lookupswitch default -> 2516, -927104664 -> 1476, -299353400 -> 1520
    //   1520: putfield doneSlots : Ljava/util/List;
    //   1523: getstatic Perryc.1 : I
    //   1526: ifeq -> 1540
    //   1529: ldc2_w 1954971514
    //   1532: l2i
    //   1533: ldc_w -1658948688
    //   1536: ixor
    //   1537: goto -> 1548
    //   1540: ldc2_w 1064172605
    //   1543: l2i
    //   1544: ldc_w -870859237
    //   1547: ixor
    //   1548: ldc2_w -2035426969
    //   1551: l2i
    //   1552: ldc_w -345827396
    //   1555: ixor
    //   1556: ixor
    //   1557: lookupswitch default -> 1584, -2074689007 -> 2548, -583698871 -> 1540
    //   1584: aload_0
    //   1585: ldc2_w -821004089
    //   1588: l2i
    //   1589: ldc_w -821004089
    //   1592: ixor
    //   1593: getstatic Perryc.c : I
    //   1596: iflt -> 1610
    //   1599: ldc2_w 2127400805
    //   1602: l2i
    //   1603: ldc_w 366010590
    //   1606: ixor
    //   1607: goto -> 1618
    //   1610: ldc2_w 1199238771
    //   1613: l2i
    //   1614: ldc_w 916436443
    //   1617: ixor
    //   1618: ldc2_w 654091757
    //   1621: l2i
    //   1622: ldc_w -651462680
    //   1625: ixor
    //   1626: ixor
    //   1627: lookupswitch default -> 1652, -1798652482 -> 2550, 21398039 -> 1610
    //   1652: putfield curse : Z
    //   1655: getstatic Perryc.0 : I
    //   1658: ifle -> 1672
    //   1661: ldc2_w 747202517
    //   1664: l2i
    //   1665: ldc_w -751230349
    //   1668: ixor
    //   1669: goto -> 1680
    //   1672: ldc2_w -1693168525
    //   1675: l2i
    //   1676: ldc_w -1979443264
    //   1679: ixor
    //   1680: ldc2_w 107125933
    //   1683: l2i
    //   1684: ldc_w 2064616307
    //   1687: ixor
    //   1688: ixor
    //   1689: lookupswitch default -> 2508, -2099424648 -> 1672, 1820150893 -> 1716
    //   1716: aload_0
    //   1717: ldc2_w -112517179
    //   1720: l2i
    //   1721: ldc_w -112517179
    //   1724: ixor
    //   1725: getstatic Perryc.0 : I
    //   1728: ifle -> 1742
    //   1731: ldc2_w -2054937163
    //   1734: l2i
    //   1735: ldc_w -835729221
    //   1738: ixor
    //   1739: goto -> 1750
    //   1742: ldc2_w -55372672
    //   1745: l2i
    //   1746: ldc_w 1322468769
    //   1749: ixor
    //   1750: ldc2_w 802154694
    //   1753: l2i
    //   1754: ldc_w 2005251681
    //   1757: ixor
    //   1758: ixor
    //   1759: lookupswitch default -> 2554, -366342266 -> 1784, 333558697 -> 1742
    //   1784: putfield useless : Z
    //   1787: getstatic Perryc.0 : I
    //   1790: ifle -> 1804
    //   1793: ldc2_w -211696367
    //   1796: l2i
    //   1797: ldc_w 1609346073
    //   1800: ixor
    //   1801: goto -> 1812
    //   1804: ldc2_w -99050033
    //   1807: l2i
    //   1808: ldc_w 1846412284
    //   1811: ixor
    //   1812: ldc2_w -1125358580
    //   1815: l2i
    //   1816: ldc_w -2029728428
    //   1819: ixor
    //   1820: ixor
    //   1821: lookupswitch default -> 1848, -1754939312 -> 2524, 792391941 -> 1804
    //   1848: aload_0
    //   1849: ldc2_w 610301760
    //   1852: l2i
    //   1853: ldc_w 610301732
    //   1856: ixor
    //   1857: getstatic Perryc.0 : I
    //   1860: ifle -> 1874
    //   1863: ldc2_w -1122019925
    //   1866: l2i
    //   1867: ldc_w -1871674184
    //   1870: ixor
    //   1871: goto -> 1882
    //   1874: ldc2_w 346413728
    //   1877: l2i
    //   1878: ldc_w 539231821
    //   1881: ixor
    //   1882: ldc2_w 896695114
    //   1885: l2i
    //   1886: ldc_w 1689912254
    //   1889: ixor
    //   1890: ixor
    //   1891: lookupswitch default -> 1916, -330758190 -> 1874, 2091362791 -> 2530
    //   1916: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1919: getstatic Perryc.c : I
    //   1922: iflt -> 1936
    //   1925: ldc2_w -1002979634
    //   1928: l2i
    //   1929: ldc_w -995579340
    //   1932: ixor
    //   1933: goto -> 1944
    //   1936: ldc2_w -420189379
    //   1939: l2i
    //   1940: ldc_w -1421999357
    //   1943: ixor
    //   1944: ldc2_w -1906715682
    //   1947: l2i
    //   1948: ldc_w -1227651091
    //   1951: ixor
    //   1952: ixor
    //   1953: lookupswitch default -> 2572, 940916937 -> 1936, 1967143949 -> 1980
    //   1980: putfield closestEnemy : Ljava/lang/Integer;
    //   1983: getstatic Perryc.c : I
    //   1986: iflt -> 2000
    //   1989: ldc2_w -1850021798
    //   1992: l2i
    //   1993: ldc_w 2035778436
    //   1996: ixor
    //   1997: goto -> 2008
    //   2000: ldc2_w -239743244
    //   2003: l2i
    //   2004: ldc_w -2037622992
    //   2007: ixor
    //   2008: ldc2_w -2039130349
    //   2011: l2i
    //   2012: ldc_w 1513412028
    //   2015: ixor
    //   2016: ixor
    //   2017: lookupswitch default -> 2510, -1418192021 -> 2044, 883747185 -> 2000
    //   2044: aload_0
    //   2045: ldc2_w -1120020470
    //   2048: l2i
    //   2049: ldc_w -1120020470
    //   2052: ixor
    //   2053: getstatic Perryc.0 : I
    //   2056: ifle -> 2070
    //   2059: ldc2_w -1294984632
    //   2062: l2i
    //   2063: ldc_w -789084628
    //   2066: ixor
    //   2067: goto -> 2078
    //   2070: ldc2_w 1317726900
    //   2073: l2i
    //   2074: ldc_w -614997843
    //   2077: ixor
    //   2078: ldc2_w 2077502699
    //   2081: l2i
    //   2082: ldc_w 1676412048
    //   2085: ixor
    //   2086: ixor
    //   2087: lookupswitch default -> 2538, -1914363294 -> 2112, 2048898079 -> 2070
    //   2112: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2115: getstatic Perryc.1 : I
    //   2118: ifeq -> 2132
    //   2121: ldc2_w 2064388879
    //   2124: l2i
    //   2125: ldc_w -1975840078
    //   2128: ixor
    //   2129: goto -> 2140
    //   2132: ldc2_w -1810835646
    //   2135: l2i
    //   2136: ldc_w -313722502
    //   2139: ixor
    //   2140: ldc2_w 1645672774
    //   2143: l2i
    //   2144: ldc_w 615735672
    //   2147: ixor
    //   2148: ixor
    //   2149: lookupswitch default -> 2176, -1830724057 -> 2132, -1215129213 -> 2532
    //   2176: putfield repair : Ljava/lang/Integer;
    //   2179: getstatic Perryc.0 : I
    //   2182: ifle -> 2196
    //   2185: ldc2_w 1984959242
    //   2188: l2i
    //   2189: ldc_w 2064225295
    //   2192: ixor
    //   2193: goto -> 2204
    //   2196: ldc2_w -818461430
    //   2199: l2i
    //   2200: ldc_w -360010236
    //   2203: ixor
    //   2204: ldc2_w -2067747562
    //   2207: l2i
    //   2208: ldc_w 669858721
    //   2211: ixor
    //   2212: ixor
    //   2213: lookupswitch default -> 2240, -1368125006 -> 2528, 1884314060 -> 2196
    //   2240: aload_0
    //   2241: ldc2_w 842222759
    //   2244: l2i
    //   2245: ldc_w 842222756
    //   2248: ixor
    //   2249: getstatic Perryc.1 : I
    //   2252: ifeq -> 2266
    //   2255: ldc2_w 1152197839
    //   2258: l2i
    //   2259: ldc_w -291857627
    //   2262: ixor
    //   2263: goto -> 2274
    //   2266: ldc2_w 1820319276
    //   2269: l2i
    //   2270: ldc_w -1303982575
    //   2273: ixor
    //   2274: ldc2_w -2034329871
    //   2277: l2i
    //   2278: ldc_w -2139283716
    //   2281: ixor
    //   2282: ixor
    //   2283: lookupswitch default -> 2308, -1393281049 -> 2534, -1360171730 -> 2266
    //   2308: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2311: getstatic Perryc.1 : I
    //   2314: ifeq -> 2328
    //   2317: ldc2_w 1999952807
    //   2320: l2i
    //   2321: ldc_w -1997174595
    //   2324: ixor
    //   2325: goto -> 2336
    //   2328: ldc2_w -1664877232
    //   2331: l2i
    //   2332: ldc_w -1829039275
    //   2335: ixor
    //   2336: ldc2_w -352530065
    //   2339: l2i
    //   2340: ldc_w -1600707742
    //   2343: ixor
    //   2344: ixor
    //   2345: lookupswitch default -> 2372, -1682269976 -> 2328, -1247108841 -> 2546
    //   2372: putfield actions : Ljava/lang/Integer;
    //   2375: getstatic Perryc.c : I
    //   2378: iflt -> 2392
    //   2381: ldc2_w -1146080974
    //   2384: l2i
    //   2385: ldc_w 2136079490
    //   2388: ixor
    //   2389: goto -> 2400
    //   2392: ldc2_w -488421275
    //   2395: l2i
    //   2396: ldc_w 74092046
    //   2399: ixor
    //   2400: ldc2_w -1119968130
    //   2403: l2i
    //   2404: ldc_w -1566738617
    //   2407: ixor
    //   2408: ixor
    //   2409: lookupswitch default -> 2436, -616423799 -> 2518, 1275193756 -> 2392
    //   2436: aload_0
    //   2437: getstatic Perryc.1 : I
    //   2440: ifeq -> 2454
    //   2443: ldc2_w -1679000221
    //   2446: l2i
    //   2447: ldc_w -1391778834
    //   2450: ixor
    //   2451: goto -> 2462
    //   2454: ldc2_w -2275847
    //   2457: l2i
    //   2458: ldc_w -1335266576
    //   2461: ixor
    //   2462: ldc2_w 651965715
    //   2465: l2i
    //   2466: ldc_w 2002956116
    //   2469: ixor
    //   2470: ixor
    //   2471: lookupswitch default -> 2536, 504016206 -> 2496, 1733936330 -> 2454
    //   2496: invokespecial setInstance : ()V
    //   2499: return
    //   2500: aconst_null
    //   2501: athrow
    //   2502: aconst_null
    //   2503: athrow
    //   2504: aconst_null
    //   2505: athrow
    //   2506: aconst_null
    //   2507: athrow
    //   2508: aconst_null
    //   2509: athrow
    //   2510: aconst_null
    //   2511: athrow
    //   2512: aconst_null
    //   2513: athrow
    //   2514: aconst_null
    //   2515: athrow
    //   2516: aconst_null
    //   2517: athrow
    //   2518: aconst_null
    //   2519: athrow
    //   2520: aconst_null
    //   2521: athrow
    //   2522: aconst_null
    //   2523: athrow
    //   2524: aconst_null
    //   2525: athrow
    //   2526: aconst_null
    //   2527: athrow
    //   2528: aconst_null
    //   2529: athrow
    //   2530: aconst_null
    //   2531: athrow
    //   2532: aconst_null
    //   2533: athrow
    //   2534: aconst_null
    //   2535: athrow
    //   2536: aconst_null
    //   2537: athrow
    //   2538: aconst_null
    //   2539: athrow
    //   2540: aconst_null
    //   2541: athrow
    //   2542: aconst_null
    //   2543: athrow
    //   2544: aconst_null
    //   2545: athrow
    //   2546: aconst_null
    //   2547: athrow
    //   2548: aconst_null
    //   2549: athrow
    //   2550: aconst_null
    //   2551: athrow
    //   2552: aconst_null
    //   2553: athrow
    //   2554: aconst_null
    //   2555: athrow
    //   2556: aconst_null
    //   2557: athrow
    //   2558: aconst_null
    //   2559: athrow
    //   2560: aconst_null
    //   2561: athrow
    //   2562: aconst_null
    //   2563: athrow
    //   2564: aconst_null
    //   2565: athrow
    //   2566: aconst_null
    //   2567: athrow
    //   2568: aconst_null
    //   2569: athrow
    //   2570: aconst_null
    //   2571: athrow
    //   2572: aconst_null
    //   2573: athrow
    //   2574: aconst_null
    //   2575: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	2500	0	this	Lbigname/zprestige/webhack/features/modules/Combat/AutoArmor;
  }
  
  public void onTick() {
    if (Perryc.c < 0) {
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
  
  public static AutoArmor getInstance() {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\AutoArmor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */