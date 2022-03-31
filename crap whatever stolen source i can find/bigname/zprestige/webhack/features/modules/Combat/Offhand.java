package bigname.zprestige.webhack.features.modules.Combat;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.PacketEvent;
import bigname.zprestige.webhack.event.events.ProcessRightClickBlockEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.util.InventoryUtil;
import bigname.zprestige.webhack.util.Timer;
import java.util.Queue;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Offhand extends Module {
  public Setting<Float> crystalHoleHealth;
  
  public Timer secondTimer;
  
  public boolean holdingCrystal;
  
  public int lastCrystalSlot;
  
  public int lastObbySlot;
  
  public Offhand$Mode2 currentMode;
  
  public Setting<Float> crystalHealth;
  
  public Setting<Integer> actions;
  
  public boolean didSwitchThisTick;
  
  public Timer timer;
  
  public Setting<Boolean> gapple;
  
  public int totems;
  
  public int crystals;
  
  public int lastTotemSlot;
  
  public int lastGappleSlot;
  
  public Queue<InventoryUtil.Task> taskList;
  
  public boolean switchedForHealthReason;
  
  public boolean holdingTotem;
  
  public Setting<Boolean> armorCheck;
  
  public static Offhand instance;
  
  public int lastWebSlot;
  
  public boolean second;
  
  public boolean holdingGapple;
  
  public Setting<Boolean> crystal;
  
  public int gapples;
  
  public void doSwitch() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 17279
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 17271
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 17263
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w -1514722366
    //   33: l2i
    //   34: ldc 1069257449
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 2061185828
    //   43: l2i
    //   44: ldc -1017144612
    //   46: ixor
    //   47: ldc2_w -203551641
    //   50: l2i
    //   51: ldc 1401519450
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 17086, 433313989 -> 80, 979093526 -> 40
    //   80: aload_0
    //   81: getstatic Perryc.1 : I
    //   84: ifeq -> 97
    //   87: ldc2_w -216900880
    //   90: l2i
    //   91: ldc -1242303778
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w 592511429
    //   100: l2i
    //   101: ldc 527526372
    //   103: ixor
    //   104: ldc2_w 75943102
    //   107: l2i
    //   108: ldc 161356366
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, -1146604100 -> 97, 1274642142 -> 17040
    //   140: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2.TOTEMS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   143: getstatic Perryc.c : I
    //   146: iflt -> 159
    //   149: ldc2_w 947762301
    //   152: l2i
    //   153: ldc 234924370
    //   155: ixor
    //   156: goto -> 166
    //   159: ldc2_w -646516231
    //   162: l2i
    //   163: ldc 912530472
    //   165: ixor
    //   166: ldc2_w -709386933
    //   169: l2i
    //   170: ldc 1688277821
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 16894, -2022993063 -> 159, 1577345959 -> 200
    //   200: putfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   203: getstatic Perryc.1 : I
    //   206: ifeq -> 219
    //   209: ldc2_w 161573699
    //   212: l2i
    //   213: ldc 1149037878
    //   215: ixor
    //   216: goto -> 226
    //   219: ldc2_w -1511553715
    //   222: l2i
    //   223: ldc 70873717
    //   225: ixor
    //   226: ldc2_w 1471295308
    //   229: l2i
    //   230: ldc 734013720
    //   232: ixor
    //   233: ixor
    //   234: lookupswitch default -> 260, -534872848 -> 219, 833585185 -> 16936
    //   260: aload_0
    //   261: getstatic Perryc.c : I
    //   264: iflt -> 277
    //   267: ldc2_w -531241524
    //   270: l2i
    //   271: ldc -1821320499
    //   273: ixor
    //   274: goto -> 284
    //   277: ldc2_w -1352560355
    //   280: l2i
    //   281: ldc -1403228504
    //   283: ixor
    //   284: ldc2_w -713952272
    //   287: l2i
    //   288: ldc -1350696064
    //   290: ixor
    //   291: ixor
    //   292: lookupswitch default -> 17106, 153800561 -> 277, 2033323973 -> 320
    //   320: getfield gapple : Lbigname/zprestige/webhack/features/setting/Setting;
    //   323: getstatic Perryc.1 : I
    //   326: ifeq -> 339
    //   329: ldc2_w 1151739639
    //   332: l2i
    //   333: ldc -925198166
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w 488275721
    //   342: l2i
    //   343: ldc 1929399885
    //   345: ixor
    //   346: ldc2_w -2000800732
    //   349: l2i
    //   350: ldc 142686055
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 380, -547889747 -> 339, 205765918 -> 17150
    //   380: goto -> 384
    //   383: athrow
    //   384: invokevirtual getValue : ()Ljava/lang/Object;
    //   387: goto -> 391
    //   390: athrow
    //   391: checkcast java/lang/Boolean
    //   394: getstatic Perryc.0 : I
    //   397: ifle -> 410
    //   400: ldc2_w 847630162
    //   403: l2i
    //   404: ldc 2054727374
    //   406: ixor
    //   407: goto -> 417
    //   410: ldc2_w -802616946
    //   413: l2i
    //   414: ldc 1357611304
    //   416: ixor
    //   417: ldc2_w -1567637241
    //   420: l2i
    //   421: ldc -165147274
    //   423: ixor
    //   424: ixor
    //   425: lookupswitch default -> 16930, -731560745 -> 452, 475702765 -> 410
    //   452: goto -> 456
    //   455: athrow
    //   456: invokevirtual booleanValue : ()Z
    //   459: goto -> 463
    //   462: athrow
    //   463: ifeq -> 476
    //   466: ldc2_w -2063816169
    //   469: l2i
    //   470: ldc -157135576
    //   472: ixor
    //   473: goto -> 483
    //   476: ldc2_w 624801742
    //   479: l2i
    //   480: ldc 1466126578
    //   482: ixor
    //   483: ldc2_w 1969199
    //   486: l2i
    //   487: ldc 46724137
    //   489: ixor
    //   490: ixor
    //   491: tableswitch default -> 466, 1887969081 -> 512, 1887969082 -> 1326
    //   512: getstatic Perryc.c : I
    //   515: iflt -> 528
    //   518: ldc2_w 643699892
    //   521: l2i
    //   522: ldc -414511059
    //   524: ixor
    //   525: goto -> 535
    //   528: ldc2_w 1386016001
    //   531: l2i
    //   532: ldc 1278170401
    //   534: ixor
    //   535: ldc2_w -813325010
    //   538: l2i
    //   539: ldc 1093237991
    //   541: ixor
    //   542: ixor
    //   543: lookupswitch default -> 17210, -1876991511 -> 568, 1337580880 -> 528
    //   568: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   571: getstatic Perryc.c : I
    //   574: iflt -> 587
    //   577: ldc2_w 84033211
    //   580: l2i
    //   581: ldc 705030727
    //   583: ixor
    //   584: goto -> 594
    //   587: ldc2_w -62521822
    //   590: l2i
    //   591: ldc 460157319
    //   593: ixor
    //   594: ldc2_w 1584271197
    //   597: l2i
    //   598: ldc -725385698
    //   600: ixor
    //   601: ixor
    //   602: lookupswitch default -> 17118, -1515543105 -> 587, 1837498086 -> 628
    //   628: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   631: getstatic Perryc.1 : I
    //   634: ifeq -> 647
    //   637: ldc2_w 189650068
    //   640: l2i
    //   641: ldc 1457815566
    //   643: ixor
    //   644: goto -> 654
    //   647: ldc2_w -1549319708
    //   650: l2i
    //   651: ldc 276990712
    //   653: ixor
    //   654: ldc2_w -1557822187
    //   657: l2i
    //   658: ldc 757494237
    //   660: ixor
    //   661: ixor
    //   662: lookupswitch default -> 688, -832895435 -> 647, -743792558 -> 16876
    //   688: goto -> 692
    //   691: athrow
    //   692: invokevirtual func_184614_ca : ()Lnet/minecraft/item/ItemStack;
    //   695: goto -> 699
    //   698: athrow
    //   699: getstatic Perryc.c : I
    //   702: iflt -> 715
    //   705: ldc2_w -640466355
    //   708: l2i
    //   709: ldc 418985480
    //   711: ixor
    //   712: goto -> 722
    //   715: ldc2_w 1429539215
    //   718: l2i
    //   719: ldc -2092159222
    //   721: ixor
    //   722: ldc2_w 527266105
    //   725: l2i
    //   726: ldc 1874626544
    //   728: ixor
    //   729: ixor
    //   730: lookupswitch default -> 16806, -1498886068 -> 756, -1308917108 -> 715
    //   756: goto -> 760
    //   759: athrow
    //   760: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   763: goto -> 767
    //   766: athrow
    //   767: instanceof net/minecraft/item/ItemSword
    //   770: ifeq -> 783
    //   773: ldc2_w 1643975061
    //   776: l2i
    //   777: ldc 1157888098
    //   779: ixor
    //   780: goto -> 790
    //   783: ldc2_w -1483683861
    //   786: l2i
    //   787: ldc -2089931235
    //   789: ixor
    //   790: ldc2_w 348618131
    //   793: l2i
    //   794: ldc -1601046648
    //   796: ixor
    //   797: ixor
    //   798: tableswitch default -> 773, -1868012564 -> 820, -1868012563 -> 1326
    //   820: getstatic Perryc.1 : I
    //   823: ifeq -> 836
    //   826: ldc2_w 1401229513
    //   829: l2i
    //   830: ldc 1054222510
    //   832: ixor
    //   833: goto -> 844
    //   836: ldc2_w -1756463246
    //   839: l2i
    //   840: ldc_w 221129418
    //   843: ixor
    //   844: ldc2_w 1117445895
    //   847: l2i
    //   848: ldc_w -1591456160
    //   851: ixor
    //   852: ixor
    //   853: lookupswitch default -> 16844, -1897027328 -> 836, 2044642527 -> 880
    //   880: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   883: getstatic Perryc.1 : I
    //   886: ifeq -> 900
    //   889: ldc2_w -611939104
    //   892: l2i
    //   893: ldc_w -1846834278
    //   896: ixor
    //   897: goto -> 908
    //   900: ldc2_w -1598351731
    //   903: l2i
    //   904: ldc_w -1528491191
    //   907: ixor
    //   908: ldc2_w 1873798648
    //   911: l2i
    //   912: ldc_w 976938713
    //   915: ixor
    //   916: ixor
    //   917: lookupswitch default -> 16974, 536347739 -> 900, 1372260069 -> 944
    //   944: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   947: getstatic Perryc.c : I
    //   950: iflt -> 964
    //   953: ldc2_w 782136106
    //   956: l2i
    //   957: ldc_w 1953338227
    //   960: ixor
    //   961: goto -> 972
    //   964: ldc2_w 810636221
    //   967: l2i
    //   968: ldc_w -1848191321
    //   971: ixor
    //   972: ldc2_w 44847477
    //   975: l2i
    //   976: ldc_w 810165933
    //   979: ixor
    //   980: ixor
    //   981: lookupswitch default -> 1008, -1309423650 -> 964, 1746245505 -> 16948
    //   1008: getfield field_74313_G : Lnet/minecraft/client/settings/KeyBinding;
    //   1011: getstatic Perryc.1 : I
    //   1014: ifeq -> 1028
    //   1017: ldc2_w 1303889572
    //   1020: l2i
    //   1021: ldc_w -187792304
    //   1024: ixor
    //   1025: goto -> 1036
    //   1028: ldc2_w -373006961
    //   1031: l2i
    //   1032: ldc_w 825417456
    //   1035: ixor
    //   1036: ldc2_w -234648491
    //   1039: l2i
    //   1040: ldc_w -1996788265
    //   1043: ixor
    //   1044: ixor
    //   1045: lookupswitch default -> 1072, -1014914186 -> 16980, 2103156016 -> 1028
    //   1072: goto -> 1076
    //   1075: athrow
    //   1076: invokevirtual func_151470_d : ()Z
    //   1079: goto -> 1083
    //   1082: athrow
    //   1083: ifeq -> 1097
    //   1086: ldc2_w -672101671
    //   1089: l2i
    //   1090: ldc_w -288328150
    //   1093: ixor
    //   1094: goto -> 1105
    //   1097: ldc2_w 1740014972
    //   1100: l2i
    //   1101: ldc_w 1586919816
    //   1104: ixor
    //   1105: ldc2_w -1308934773
    //   1108: l2i
    //   1109: ldc_w 163389299
    //   1112: ixor
    //   1113: ixor
    //   1114: tableswitch default -> 1086, -2123964917 -> 1136, -2123964916 -> 1326
    //   1136: getstatic Perryc.c : I
    //   1139: iflt -> 1153
    //   1142: ldc2_w -2072428960
    //   1145: l2i
    //   1146: ldc_w -410270956
    //   1149: ixor
    //   1150: goto -> 1161
    //   1153: ldc2_w -473365385
    //   1156: l2i
    //   1157: ldc_w 1543303822
    //   1160: ixor
    //   1161: ldc2_w 532332535
    //   1164: l2i
    //   1165: ldc_w -679664537
    //   1168: ixor
    //   1169: ixor
    //   1170: lookupswitch default -> 17198, -1422563612 -> 1153, 1894935913 -> 1196
    //   1196: aload_0
    //   1197: getstatic Perryc.c : I
    //   1200: iflt -> 1214
    //   1203: ldc2_w 1602740938
    //   1206: l2i
    //   1207: ldc_w -733302438
    //   1210: ixor
    //   1211: goto -> 1222
    //   1214: ldc2_w -1459406929
    //   1217: l2i
    //   1218: ldc_w -2097562090
    //   1221: ixor
    //   1222: ldc2_w 1038376179
    //   1225: l2i
    //   1226: ldc_w 1367952808
    //   1229: ixor
    //   1230: ixor
    //   1231: lookupswitch default -> 17164, -408927541 -> 1214, 1201117410 -> 1256
    //   1256: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2.GAPPLES : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   1259: getstatic Perryc.0 : I
    //   1262: ifle -> 1276
    //   1265: ldc2_w 2035072872
    //   1268: l2i
    //   1269: ldc_w -426628768
    //   1272: ixor
    //   1273: goto -> 1284
    //   1276: ldc2_w 1230921466
    //   1279: l2i
    //   1280: ldc_w 909979005
    //   1283: ixor
    //   1284: ldc2_w -904684373
    //   1287: l2i
    //   1288: ldc_w 563310787
    //   1291: ixor
    //   1292: ixor
    //   1293: lookupswitch default -> 17244, -1797021713 -> 1320, 1952348768 -> 1276
    //   1320: putfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   1323: goto -> 3411
    //   1326: getstatic Perryc.0 : I
    //   1329: ifle -> 1343
    //   1332: ldc2_w 1889374895
    //   1335: l2i
    //   1336: ldc_w -1636505412
    //   1339: ixor
    //   1340: goto -> 1351
    //   1343: ldc2_w -1657317450
    //   1346: l2i
    //   1347: ldc_w 783839665
    //   1350: ixor
    //   1351: ldc2_w 1255730522
    //   1354: l2i
    //   1355: ldc_w 1282040692
    //   1358: ixor
    //   1359: ixor
    //   1360: lookupswitch default -> 1388, -497183577 -> 1343, -396626883 -> 17230
    //   1388: aload_0
    //   1389: getstatic Perryc.1 : I
    //   1392: ifeq -> 1406
    //   1395: ldc2_w 141563133
    //   1398: l2i
    //   1399: ldc_w 2080824138
    //   1402: ixor
    //   1403: goto -> 1414
    //   1406: ldc2_w -960200025
    //   1409: l2i
    //   1410: ldc_w -1147162927
    //   1413: ixor
    //   1414: ldc2_w -688283063
    //   1417: l2i
    //   1418: ldc_w 441313105
    //   1421: ixor
    //   1422: ixor
    //   1423: lookupswitch default -> 16914, -1309709970 -> 1448, -1195210065 -> 1406
    //   1448: getfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   1451: getstatic Perryc.c : I
    //   1454: iflt -> 1468
    //   1457: ldc2_w 386164775
    //   1460: l2i
    //   1461: ldc_w 25842852
    //   1464: ixor
    //   1465: goto -> 1476
    //   1468: ldc2_w 158169797
    //   1471: l2i
    //   1472: ldc_w 427370626
    //   1475: ixor
    //   1476: ldc2_w -681826053
    //   1479: l2i
    //   1480: ldc_w -14054339
    //   1483: ixor
    //   1484: ixor
    //   1485: lookupswitch default -> 17134, 945944193 -> 1512, 1056675909 -> 1468
    //   1512: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2.CRYSTALS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   1515: if_acmpeq -> 1529
    //   1518: ldc2_w -1474665542
    //   1521: l2i
    //   1522: ldc_w -708048708
    //   1525: ixor
    //   1526: goto -> 1537
    //   1529: ldc2_w 1974622669
    //   1532: l2i
    //   1533: ldc_w 140784330
    //   1536: ixor
    //   1537: ldc2_w 1069198584
    //   1540: l2i
    //   1541: ldc_w 304637954
    //   1544: ixor
    //   1545: ixor
    //   1546: tableswitch default -> 1518, 1346678780 -> 1568, 1346678781 -> 3411
    //   1568: getstatic Perryc.1 : I
    //   1571: ifeq -> 1585
    //   1574: ldc2_w -1209714157
    //   1577: l2i
    //   1578: ldc_w -1510108100
    //   1581: ixor
    //   1582: goto -> 1593
    //   1585: ldc2_w 1294925744
    //   1588: l2i
    //   1589: ldc_w 1795803275
    //   1592: ixor
    //   1593: ldc2_w -305747196
    //   1596: l2i
    //   1597: ldc_w 851277157
    //   1600: ixor
    //   1601: ixor
    //   1602: lookupswitch default -> 1628, -1203822865 -> 1585, -849121202 -> 16864
    //   1628: aload_0
    //   1629: getstatic Perryc.1 : I
    //   1632: ifeq -> 1646
    //   1635: ldc2_w -25029936
    //   1638: l2i
    //   1639: ldc_w 1231523698
    //   1642: ixor
    //   1643: goto -> 1654
    //   1646: ldc2_w -1534911461
    //   1649: l2i
    //   1650: ldc_w 1350364879
    //   1653: ixor
    //   1654: ldc2_w -1008234762
    //   1657: l2i
    //   1658: ldc_w -82099347
    //   1661: ixor
    //   1662: ixor
    //   1663: lookupswitch default -> 1688, -1894166471 -> 16916, -1437579482 -> 1646
    //   1688: getfield crystal : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1691: getstatic Perryc.c : I
    //   1694: iflt -> 1708
    //   1697: ldc2_w 2111259629
    //   1700: l2i
    //   1701: ldc_w -1349678845
    //   1704: ixor
    //   1705: goto -> 1716
    //   1708: ldc2_w 1038040830
    //   1711: l2i
    //   1712: ldc_w -2099708156
    //   1715: ixor
    //   1716: ldc2_w 1692247328
    //   1719: l2i
    //   1720: ldc_w 2112016235
    //   1723: ixor
    //   1724: ixor
    //   1725: lookupswitch default -> 17102, -1506235471 -> 1752, -882532187 -> 1708
    //   1752: goto -> 1756
    //   1755: athrow
    //   1756: invokevirtual getValue : ()Ljava/lang/Object;
    //   1759: goto -> 1763
    //   1762: athrow
    //   1763: checkcast java/lang/Boolean
    //   1766: getstatic Perryc.c : I
    //   1769: iflt -> 1783
    //   1772: ldc2_w 129303039
    //   1775: l2i
    //   1776: ldc_w -2013373304
    //   1779: ixor
    //   1780: goto -> 1791
    //   1783: ldc2_w 1305636548
    //   1786: l2i
    //   1787: ldc_w -705192924
    //   1790: ixor
    //   1791: ldc2_w 64840987
    //   1794: l2i
    //   1795: ldc_w 1439448103
    //   1798: ixor
    //   1799: ixor
    //   1800: lookupswitch default -> 1828, -698743733 -> 17252, 174901639 -> 1783
    //   1828: goto -> 1832
    //   1831: athrow
    //   1832: invokevirtual booleanValue : ()Z
    //   1835: goto -> 1839
    //   1838: athrow
    //   1839: ifeq -> 1853
    //   1842: ldc2_w 1131005756
    //   1845: l2i
    //   1846: ldc_w -645183129
    //   1849: ixor
    //   1850: goto -> 1861
    //   1853: ldc2_w 1678148268
    //   1856: l2i
    //   1857: ldc_w -18608906
    //   1860: ixor
    //   1861: ldc2_w -545035984
    //   1864: l2i
    //   1865: ldc_w 1764974965
    //   1868: ixor
    //   1869: ixor
    //   1870: tableswitch default -> 1842, 743605790 -> 1892, 743605791 -> 3411
    //   1892: getstatic Perryc.c : I
    //   1895: iflt -> 1909
    //   1898: ldc2_w -651393978
    //   1901: l2i
    //   1902: ldc_w -896129461
    //   1905: ixor
    //   1906: goto -> 1917
    //   1909: ldc2_w 580646821
    //   1912: l2i
    //   1913: ldc_w -971867461
    //   1916: ixor
    //   1917: ldc2_w 1923839435
    //   1920: l2i
    //   1921: ldc_w 1474411758
    //   1924: ixor
    //   1925: ixor
    //   1926: lookupswitch default -> 1952, 921725736 -> 17188, 1785000310 -> 1909
    //   1952: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   1955: getstatic Perryc.1 : I
    //   1958: ifeq -> 1972
    //   1961: ldc2_w 991219813
    //   1964: l2i
    //   1965: ldc_w 860765410
    //   1968: ixor
    //   1969: goto -> 1980
    //   1972: ldc2_w 1444303079
    //   1975: l2i
    //   1976: ldc_w -1255596983
    //   1979: ixor
    //   1980: ldc2_w -1716388562
    //   1983: l2i
    //   1984: ldc_w -856418603
    //   1987: ixor
    //   1988: ixor
    //   1989: lookupswitch default -> 16994, -1233475755 -> 2016, 1562314620 -> 1972
    //   2016: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2019: ldc2_w -502247269
    //   2022: l2i
    //   2023: ldc_w 502247268
    //   2026: ixor
    //   2027: ldc2_w 1503591223
    //   2030: l2i
    //   2031: ldc_w 1503591223
    //   2034: ixor
    //   2035: getstatic Perryc.0 : I
    //   2038: ifle -> 2052
    //   2041: ldc2_w -1706620117
    //   2044: l2i
    //   2045: ldc_w -1471943372
    //   2048: ixor
    //   2049: goto -> 2060
    //   2052: ldc2_w -1462386474
    //   2055: l2i
    //   2056: ldc_w -983038742
    //   2059: ixor
    //   2060: ldc2_w 606680171
    //   2063: l2i
    //   2064: ldc_w -2044247491
    //   2067: ixor
    //   2068: ixor
    //   2069: lookupswitch default -> 17114, -1878355895 -> 2052, -810306966 -> 2096
    //   2096: goto -> 2100
    //   2099: athrow
    //   2100: invokestatic isSafe : (Lnet/minecraft/entity/Entity;IZ)Z
    //   2103: goto -> 2107
    //   2106: athrow
    //   2107: ifeq -> 2121
    //   2110: ldc2_w -530750160
    //   2113: l2i
    //   2114: ldc_w 542761021
    //   2117: ixor
    //   2118: goto -> 2129
    //   2121: ldc2_w 1308115405
    //   2124: l2i
    //   2125: ldc_w -1912814397
    //   2128: ixor
    //   2129: ldc2_w -1864451846
    //   2132: l2i
    //   2133: ldc_w 1664463034
    //   2136: ixor
    //   2137: ixor
    //   2138: tableswitch default -> 2110, 871337293 -> 2160, 871337294 -> 2692
    //   2160: getstatic Perryc.1 : I
    //   2163: ifeq -> 2177
    //   2166: ldc2_w 1127181961
    //   2169: l2i
    //   2170: ldc_w -1914272433
    //   2173: ixor
    //   2174: goto -> 2185
    //   2177: ldc2_w -1370004833
    //   2180: l2i
    //   2181: ldc_w -1229324023
    //   2184: ixor
    //   2185: ldc2_w 1301738984
    //   2188: l2i
    //   2189: ldc_w -1083085939
    //   2192: ixor
    //   2193: ixor
    //   2194: lookupswitch default -> 17050, -368378381 -> 2220, 1009677731 -> 2177
    //   2220: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   2223: getstatic Perryc.0 : I
    //   2226: ifle -> 2240
    //   2229: ldc2_w 2027723420
    //   2232: l2i
    //   2233: ldc_w 926360314
    //   2236: ixor
    //   2237: goto -> 2248
    //   2240: ldc2_w -1150181293
    //   2243: l2i
    //   2244: ldc_w -2099085559
    //   2247: ixor
    //   2248: ldc2_w -1598953260
    //   2251: l2i
    //   2252: ldc_w 1778546951
    //   2255: ixor
    //   2256: ixor
    //   2257: lookupswitch default -> 2284, -2057819723 -> 17132, -1121510852 -> 2240
    //   2284: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2287: ldc2_w -1951108070
    //   2290: l2i
    //   2291: ldc_w -1951108069
    //   2294: ixor
    //   2295: getstatic Perryc.1 : I
    //   2298: ifeq -> 2312
    //   2301: ldc2_w -693273896
    //   2304: l2i
    //   2305: ldc_w 486101698
    //   2308: ixor
    //   2309: goto -> 2320
    //   2312: ldc2_w -1774036859
    //   2315: l2i
    //   2316: ldc_w 1345892754
    //   2319: ixor
    //   2320: ldc2_w 935598713
    //   2323: l2i
    //   2324: ldc_w -310475418
    //   2327: ixor
    //   2328: ixor
    //   2329: lookupswitch default -> 17154, 284079877 -> 2312, 482375176 -> 2356
    //   2356: goto -> 2360
    //   2359: athrow
    //   2360: invokestatic getHealth : (Lnet/minecraft/entity/Entity;Z)F
    //   2363: goto -> 2367
    //   2366: athrow
    //   2367: getstatic Perryc.1 : I
    //   2370: ifeq -> 2384
    //   2373: ldc2_w 669649470
    //   2376: l2i
    //   2377: ldc_w -1571448254
    //   2380: ixor
    //   2381: goto -> 2392
    //   2384: ldc2_w -2027045284
    //   2387: l2i
    //   2388: ldc_w -511202456
    //   2391: ixor
    //   2392: ldc2_w -1260168519
    //   2395: l2i
    //   2396: ldc_w -574899505
    //   2399: ixor
    //   2400: ixor
    //   2401: lookupswitch default -> 17204, -320376822 -> 2384, 267580738 -> 2428
    //   2428: aload_0
    //   2429: getstatic Perryc.0 : I
    //   2432: ifle -> 2446
    //   2435: ldc2_w -106284183
    //   2438: l2i
    //   2439: ldc_w -1505631554
    //   2442: ixor
    //   2443: goto -> 2454
    //   2446: ldc2_w -1016740764
    //   2449: l2i
    //   2450: ldc_w 2139899225
    //   2453: ixor
    //   2454: ldc2_w -1500925247
    //   2457: l2i
    //   2458: ldc_w -730584627
    //   2461: ixor
    //   2462: ixor
    //   2463: lookupswitch default -> 16810, -837543375 -> 2488, 756433627 -> 2446
    //   2488: getfield crystalHoleHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2491: getstatic Perryc.c : I
    //   2494: iflt -> 2508
    //   2497: ldc2_w 1868904401
    //   2500: l2i
    //   2501: ldc_w 1574343881
    //   2504: ixor
    //   2505: goto -> 2516
    //   2508: ldc2_w 558720027
    //   2511: l2i
    //   2512: ldc_w 1092633015
    //   2515: ixor
    //   2516: ldc2_w 352748903
    //   2519: l2i
    //   2520: ldc_w -788757775
    //   2523: ixor
    //   2524: ixor
    //   2525: lookupswitch default -> 2552, -146168690 -> 17242, 991019646 -> 2508
    //   2552: goto -> 2556
    //   2555: athrow
    //   2556: invokevirtual getValue : ()Ljava/lang/Object;
    //   2559: goto -> 2563
    //   2562: athrow
    //   2563: checkcast java/lang/Float
    //   2566: getstatic Perryc.1 : I
    //   2569: ifeq -> 2583
    //   2572: ldc2_w 974352553
    //   2575: l2i
    //   2576: ldc_w -1539414738
    //   2579: ixor
    //   2580: goto -> 2591
    //   2583: ldc2_w -592337057
    //   2586: l2i
    //   2587: ldc_w 981487517
    //   2590: ixor
    //   2591: ldc2_w -185464356
    //   2594: l2i
    //   2595: ldc_w -11989563
    //   2598: ixor
    //   2599: ixor
    //   2600: lookupswitch default -> 2628, -1785327202 -> 17068, 2052339923 -> 2583
    //   2628: goto -> 2632
    //   2631: athrow
    //   2632: invokevirtual floatValue : ()F
    //   2635: goto -> 2639
    //   2638: athrow
    //   2639: fcmpl
    //   2640: ifgt -> 2654
    //   2643: ldc2_w -165332653
    //   2646: l2i
    //   2647: ldc_w 387473285
    //   2650: ixor
    //   2651: goto -> 2662
    //   2654: ldc2_w 1358262883
    //   2657: l2i
    //   2658: ldc_w -1312287564
    //   2661: ixor
    //   2662: ldc2_w 482262680
    //   2665: l2i
    //   2666: ldc_w -1242150592
    //   2669: ixor
    //   2670: ixor
    //   2671: tableswitch default -> 2643, 1215664398 -> 2692, 1215664399 -> 3224
    //   2692: getstatic Perryc.c : I
    //   2695: iflt -> 2709
    //   2698: ldc2_w 1909892092
    //   2701: l2i
    //   2702: ldc_w -1169679993
    //   2705: ixor
    //   2706: goto -> 2717
    //   2709: ldc2_w 397075698
    //   2712: l2i
    //   2713: ldc_w 350818805
    //   2716: ixor
    //   2717: ldc2_w -964293707
    //   2720: l2i
    //   2721: ldc_w 394675117
    //   2724: ixor
    //   2725: ixor
    //   2726: lookupswitch default -> 2752, 446624355 -> 17178, 1959053869 -> 2709
    //   2752: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   2755: getstatic Perryc.0 : I
    //   2758: ifle -> 2772
    //   2761: ldc2_w -340674740
    //   2764: l2i
    //   2765: ldc_w 1839895297
    //   2768: ixor
    //   2769: goto -> 2780
    //   2772: ldc2_w -1903608900
    //   2775: l2i
    //   2776: ldc_w -963653248
    //   2779: ixor
    //   2780: ldc2_w 1518989569
    //   2783: l2i
    //   2784: ldc_w -1110991873
    //   2787: ixor
    //   2788: ixor
    //   2789: lookupswitch default -> 17124, -1354202942 -> 2816, 1632980659 -> 2772
    //   2816: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2819: ldc2_w 1723406730
    //   2822: l2i
    //   2823: ldc_w 1723406731
    //   2826: ixor
    //   2827: getstatic Perryc.0 : I
    //   2830: ifle -> 2844
    //   2833: ldc2_w 1794694948
    //   2836: l2i
    //   2837: ldc_w 1064790765
    //   2840: ixor
    //   2841: goto -> 2852
    //   2844: ldc2_w 1898378464
    //   2847: l2i
    //   2848: ldc_w 274346911
    //   2851: ixor
    //   2852: ldc2_w -2014201820
    //   2855: l2i
    //   2856: ldc_w -2067222167
    //   2859: ixor
    //   2860: ixor
    //   2861: lookupswitch default -> 2888, 1454816388 -> 17048, 1950971030 -> 2844
    //   2888: goto -> 2892
    //   2891: athrow
    //   2892: invokestatic getHealth : (Lnet/minecraft/entity/Entity;Z)F
    //   2895: goto -> 2899
    //   2898: athrow
    //   2899: getstatic Perryc.1 : I
    //   2902: ifeq -> 2916
    //   2905: ldc2_w -1926304402
    //   2908: l2i
    //   2909: ldc_w 1499559289
    //   2912: ixor
    //   2913: goto -> 2924
    //   2916: ldc2_w -360028331
    //   2919: l2i
    //   2920: ldc_w -1610567090
    //   2923: ixor
    //   2924: ldc2_w 104471255
    //   2927: l2i
    //   2928: ldc_w -1480718609
    //   2931: ixor
    //   2932: ixor
    //   2933: lookupswitch default -> 2960, 1796555437 -> 2916, 1976271919 -> 17020
    //   2960: aload_0
    //   2961: getstatic Perryc.c : I
    //   2964: iflt -> 2978
    //   2967: ldc2_w -120433397
    //   2970: l2i
    //   2971: ldc_w 1049773602
    //   2974: ixor
    //   2975: goto -> 2986
    //   2978: ldc2_w -2002957304
    //   2981: l2i
    //   2982: ldc_w 980071265
    //   2985: ixor
    //   2986: ldc2_w 95921081
    //   2989: l2i
    //   2990: ldc_w 1347957263
    //   2993: ixor
    //   2994: ixor
    //   2995: lookupswitch default -> 16946, -1817214305 -> 2978, -417829153 -> 3020
    //   3020: getfield crystalHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3023: getstatic Perryc.c : I
    //   3026: iflt -> 3040
    //   3029: ldc2_w -141618801
    //   3032: l2i
    //   3033: ldc_w 1220806245
    //   3036: ixor
    //   3037: goto -> 3048
    //   3040: ldc2_w 903447893
    //   3043: l2i
    //   3044: ldc_w -334955689
    //   3047: ixor
    //   3048: ldc2_w 1531638897
    //   3051: l2i
    //   3052: ldc_w 1183608369
    //   3055: ixor
    //   3056: ixor
    //   3057: lookupswitch default -> 17060, -1567781462 -> 3040, -1005067198 -> 3084
    //   3084: goto -> 3088
    //   3087: athrow
    //   3088: invokevirtual getValue : ()Ljava/lang/Object;
    //   3091: goto -> 3095
    //   3094: athrow
    //   3095: checkcast java/lang/Float
    //   3098: getstatic Perryc.1 : I
    //   3101: ifeq -> 3115
    //   3104: ldc2_w -1225427016
    //   3107: l2i
    //   3108: ldc_w 1240566065
    //   3111: ixor
    //   3112: goto -> 3123
    //   3115: ldc2_w -1487825446
    //   3118: l2i
    //   3119: ldc_w 4785022
    //   3122: ixor
    //   3123: ldc2_w -1522421226
    //   3126: l2i
    //   3127: ldc_w -1638002791
    //   3130: ixor
    //   3131: ixor
    //   3132: lookupswitch default -> 17208, -1677251797 -> 3160, -1004846330 -> 3115
    //   3160: goto -> 3164
    //   3163: athrow
    //   3164: invokevirtual floatValue : ()F
    //   3167: goto -> 3171
    //   3170: athrow
    //   3171: fcmpl
    //   3172: ifle -> 3186
    //   3175: ldc2_w -1252649188
    //   3178: l2i
    //   3179: ldc_w 879419681
    //   3182: ixor
    //   3183: goto -> 3194
    //   3186: ldc2_w -21369356
    //   3189: l2i
    //   3190: ldc_w 2139429846
    //   3193: ixor
    //   3194: ldc2_w -1754578940
    //   3197: l2i
    //   3198: ldc_w 1407518326
    //   3201: ixor
    //   3202: ixor
    //   3203: tableswitch default -> 3175, 1169338447 -> 3224, 1169338448 -> 3411
    //   3224: getstatic Perryc.1 : I
    //   3227: ifeq -> 3241
    //   3230: ldc2_w 109884704
    //   3233: l2i
    //   3234: ldc_w 1664768587
    //   3237: ixor
    //   3238: goto -> 3249
    //   3241: ldc2_w 1395900539
    //   3244: l2i
    //   3245: ldc_w -1679863745
    //   3248: ixor
    //   3249: ldc2_w 703166427
    //   3252: l2i
    //   3253: ldc_w 1688504127
    //   3256: ixor
    //   3257: ixor
    //   3258: lookupswitch default -> 3284, 687546255 -> 17194, 1199184141 -> 3241
    //   3284: aload_0
    //   3285: getstatic Perryc.1 : I
    //   3288: ifeq -> 3302
    //   3291: ldc2_w -1083189273
    //   3294: l2i
    //   3295: ldc_w 1942193992
    //   3298: ixor
    //   3299: goto -> 3310
    //   3302: ldc2_w 493435603
    //   3305: l2i
    //   3306: ldc_w 1288097263
    //   3309: ixor
    //   3310: ldc2_w 537595909
    //   3313: l2i
    //   3314: ldc_w 588147485
    //   3317: ixor
    //   3318: ixor
    //   3319: lookupswitch default -> 16850, -810996809 -> 3302, 1386908708 -> 3344
    //   3344: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2.CRYSTALS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   3347: getstatic Perryc.c : I
    //   3350: iflt -> 3364
    //   3353: ldc2_w 1876164928
    //   3356: l2i
    //   3357: ldc_w 1103756413
    //   3360: ixor
    //   3361: goto -> 3372
    //   3364: ldc2_w -1035497416
    //   3367: l2i
    //   3368: ldc_w 1142673925
    //   3371: ixor
    //   3372: ldc2_w 1647256542
    //   3375: l2i
    //   3376: ldc_w 891630163
    //   3379: ixor
    //   3380: ixor
    //   3381: lookupswitch default -> 17216, -782871632 -> 3408, 2031611056 -> 3364
    //   3408: putfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   3411: getstatic Perryc.c : I
    //   3414: iflt -> 3428
    //   3417: ldc2_w 169233037
    //   3420: l2i
    //   3421: ldc_w 2003751285
    //   3424: ixor
    //   3425: goto -> 3436
    //   3428: ldc2_w -1879373297
    //   3431: l2i
    //   3432: ldc_w -1694719730
    //   3435: ixor
    //   3436: ldc2_w -1122475096
    //   3439: l2i
    //   3440: ldc_w 1707766896
    //   3443: ixor
    //   3444: ixor
    //   3445: lookupswitch default -> 17152, -1515549664 -> 3428, -841630503 -> 3472
    //   3472: aload_0
    //   3473: getstatic Perryc.c : I
    //   3476: iflt -> 3490
    //   3479: ldc2_w -1852966590
    //   3482: l2i
    //   3483: ldc_w -1533998868
    //   3486: ixor
    //   3487: goto -> 3498
    //   3490: ldc2_w -490470121
    //   3493: l2i
    //   3494: ldc_w 1223144389
    //   3497: ixor
    //   3498: ldc2_w -1891449213
    //   3501: l2i
    //   3502: ldc_w 2040604770
    //   3505: ixor
    //   3506: ixor
    //   3507: lookupswitch default -> 17092, -1006690481 -> 3490, 1556109363 -> 3532
    //   3532: getfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   3535: getstatic Perryc.c : I
    //   3538: iflt -> 3552
    //   3541: ldc2_w 509916351
    //   3544: l2i
    //   3545: ldc_w -1916025424
    //   3548: ixor
    //   3549: goto -> 3560
    //   3552: ldc2_w 1802258152
    //   3555: l2i
    //   3556: ldc_w 228257555
    //   3559: ixor
    //   3560: ldc2_w 137913582
    //   3563: l2i
    //   3564: ldc_w -1799890301
    //   3567: ixor
    //   3568: ixor
    //   3569: lookupswitch default -> 3596, -823234736 -> 3552, 253808482 -> 16988
    //   3596: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2.CRYSTALS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   3599: if_acmpne -> 3613
    //   3602: ldc2_w 910103232
    //   3605: l2i
    //   3606: ldc_w -38360662
    //   3609: ixor
    //   3610: goto -> 3621
    //   3613: ldc2_w -1798137318
    //   3616: l2i
    //   3617: ldc_w 1599807857
    //   3620: ixor
    //   3621: ldc2_w 1479871083
    //   3624: l2i
    //   3625: ldc_w 859086377
    //   3628: ixor
    //   3629: ixor
    //   3630: tableswitch default -> 3602, -1601687768 -> 3652, -1601687767 -> 4023
    //   3652: getstatic Perryc.1 : I
    //   3655: ifeq -> 3669
    //   3658: ldc2_w -2117451525
    //   3661: l2i
    //   3662: ldc_w 505400450
    //   3665: ixor
    //   3666: goto -> 3677
    //   3669: ldc2_w 39490036
    //   3672: l2i
    //   3673: ldc_w -1088357518
    //   3676: ixor
    //   3677: ldc2_w 1367282149
    //   3680: l2i
    //   3681: ldc_w -1583176706
    //   3684: ixor
    //   3685: ixor
    //   3686: lookupswitch default -> 3712, 1748804649 -> 3669, 1862811234 -> 16862
    //   3712: aload_0
    //   3713: getstatic Perryc.c : I
    //   3716: iflt -> 3730
    //   3719: ldc2_w -1600821868
    //   3722: l2i
    //   3723: ldc_w -96115900
    //   3726: ixor
    //   3727: goto -> 3738
    //   3730: ldc2_w -914956829
    //   3733: l2i
    //   3734: ldc_w 1603299901
    //   3737: ixor
    //   3738: ldc2_w -1534175122
    //   3741: l2i
    //   3742: ldc_w 1725649860
    //   3745: ixor
    //   3746: ixor
    //   3747: lookupswitch default -> 3772, -1736110726 -> 16896, -771334661 -> 3730
    //   3772: getfield crystals : I
    //   3775: ifne -> 3789
    //   3778: ldc2_w -1313680403
    //   3781: l2i
    //   3782: ldc_w 259432619
    //   3785: ixor
    //   3786: goto -> 3797
    //   3789: ldc2_w 424148263
    //   3792: l2i
    //   3793: ldc_w -1484550558
    //   3796: ixor
    //   3797: ldc2_w 829218362
    //   3800: l2i
    //   3801: ldc_w 929197321
    //   3804: ixor
    //   3805: ixor
    //   3806: tableswitch default -> 3778, -1194672011 -> 3828, -1194672010 -> 4023
    //   3828: getstatic Perryc.c : I
    //   3831: iflt -> 3845
    //   3834: ldc2_w 158746668
    //   3837: l2i
    //   3838: ldc_w -621487872
    //   3841: ixor
    //   3842: goto -> 3853
    //   3845: ldc2_w 1386160219
    //   3848: l2i
    //   3849: ldc_w -1840366487
    //   3852: ixor
    //   3853: ldc2_w -711410137
    //   3856: l2i
    //   3857: ldc_w 1486922608
    //   3860: ixor
    //   3861: ixor
    //   3862: lookupswitch default -> 16884, 1307115877 -> 3888, 1589283963 -> 3845
    //   3888: aload_0
    //   3889: getstatic Perryc.c : I
    //   3892: iflt -> 3906
    //   3895: ldc2_w 1607954333
    //   3898: l2i
    //   3899: ldc_w -1607182478
    //   3902: ixor
    //   3903: goto -> 3914
    //   3906: ldc2_w 1669389958
    //   3909: l2i
    //   3910: ldc_w -516587013
    //   3913: ixor
    //   3914: ldc2_w 539549667
    //   3917: l2i
    //   3918: ldc_w -489049817
    //   3921: ixor
    //   3922: ixor
    //   3923: lookupswitch default -> 17192, 1024611883 -> 3906, 1078211001 -> 3948
    //   3948: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2.TOTEMS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   3951: getstatic Perryc.1 : I
    //   3954: ifeq -> 3968
    //   3957: ldc2_w 71761465
    //   3960: l2i
    //   3961: ldc_w 664387216
    //   3964: ixor
    //   3965: goto -> 3976
    //   3968: ldc2_w 789676628
    //   3971: l2i
    //   3972: ldc_w -759815395
    //   3975: ixor
    //   3976: ldc2_w -1508309841
    //   3979: l2i
    //   3980: ldc_w -785337986
    //   3983: ixor
    //   3984: ixor
    //   3985: lookupswitch default -> 4012, -2036780965 -> 3968, 1425470840 -> 16892
    //   4012: goto -> 4016
    //   4015: athrow
    //   4016: invokevirtual setMode : (Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;)V
    //   4019: goto -> 4023
    //   4022: athrow
    //   4023: getstatic Perryc.c : I
    //   4026: iflt -> 4040
    //   4029: ldc2_w 125369550
    //   4032: l2i
    //   4033: ldc_w 2044187730
    //   4036: ixor
    //   4037: goto -> 4048
    //   4040: ldc2_w -312045032
    //   4043: l2i
    //   4044: ldc_w -180360216
    //   4047: ixor
    //   4048: ldc2_w -409257023
    //   4051: l2i
    //   4052: ldc_w -570537120
    //   4055: ixor
    //   4056: ixor
    //   4057: lookupswitch default -> 16828, 574359889 -> 4084, 1154111549 -> 4040
    //   4084: aload_0
    //   4085: getstatic Perryc.c : I
    //   4088: iflt -> 4102
    //   4091: ldc2_w 425597220
    //   4094: l2i
    //   4095: ldc_w -496126368
    //   4098: ixor
    //   4099: goto -> 4110
    //   4102: ldc2_w -678187956
    //   4105: l2i
    //   4106: ldc_w 379661383
    //   4109: ixor
    //   4110: ldc2_w 343543263
    //   4113: l2i
    //   4114: ldc_w 15516878
    //   4117: ixor
    //   4118: ixor
    //   4119: lookupswitch default -> 4144, -274373035 -> 16832, 1296240154 -> 4102
    //   4144: getfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   4147: getstatic Perryc.0 : I
    //   4150: ifle -> 4164
    //   4153: ldc2_w -1379349299
    //   4156: l2i
    //   4157: ldc_w 503206097
    //   4160: ixor
    //   4161: goto -> 4172
    //   4164: ldc2_w -1230154972
    //   4167: l2i
    //   4168: ldc_w -1509434170
    //   4171: ixor
    //   4172: ldc2_w 1933201730
    //   4175: l2i
    //   4176: ldc_w 365803689
    //   4179: ixor
    //   4180: ixor
    //   4181: lookupswitch default -> 4208, -691964425 -> 16922, -105995104 -> 4164
    //   4208: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2.CRYSTALS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   4211: if_acmpne -> 4225
    //   4214: ldc2_w -890458870
    //   4217: l2i
    //   4218: ldc_w -1442408816
    //   4221: ixor
    //   4222: goto -> 4233
    //   4225: ldc2_w 162080102
    //   4228: l2i
    //   4229: ldc_w 1766006515
    //   4232: ixor
    //   4233: ldc2_w 1129641050
    //   4236: l2i
    //   4237: ldc_w 682615975
    //   4240: ixor
    //   4241: ixor
    //   4242: tableswitch default -> 4214, 185674599 -> 4264, 185674600 -> 6163
    //   4264: getstatic Perryc.1 : I
    //   4267: ifeq -> 4281
    //   4270: ldc2_w -1172759633
    //   4273: l2i
    //   4274: ldc_w 72711148
    //   4277: ixor
    //   4278: goto -> 4289
    //   4281: ldc2_w -776799558
    //   4284: l2i
    //   4285: ldc_w 1812695655
    //   4288: ixor
    //   4289: ldc2_w -389810972
    //   4292: l2i
    //   4293: ldc_w -672149322
    //   4296: ixor
    //   4297: ixor
    //   4298: lookupswitch default -> 4324, -2124397551 -> 17238, -343496004 -> 4281
    //   4324: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   4327: getstatic Perryc.0 : I
    //   4330: ifle -> 4344
    //   4333: ldc2_w -720330756
    //   4336: l2i
    //   4337: ldc_w 1553051610
    //   4340: ixor
    //   4341: goto -> 4352
    //   4344: ldc2_w 1362857052
    //   4347: l2i
    //   4348: ldc_w -1154097998
    //   4351: ixor
    //   4352: ldc2_w -239316724
    //   4355: l2i
    //   4356: ldc_w -1345666105
    //   4359: ixor
    //   4360: ixor
    //   4361: lookupswitch default -> 4388, -671636755 -> 17012, 1876639390 -> 4344
    //   4388: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4391: ldc2_w -1611293991
    //   4394: l2i
    //   4395: ldc_w 1611293990
    //   4398: ixor
    //   4399: ldc2_w 329476335
    //   4402: l2i
    //   4403: ldc_w 329476335
    //   4406: ixor
    //   4407: getstatic Perryc.0 : I
    //   4410: ifle -> 4424
    //   4413: ldc2_w -1134991049
    //   4416: l2i
    //   4417: ldc_w 1020656692
    //   4420: ixor
    //   4421: goto -> 4432
    //   4424: ldc2_w 1986659123
    //   4427: l2i
    //   4428: ldc_w 1937657423
    //   4431: ixor
    //   4432: ldc2_w -1887679044
    //   4435: l2i
    //   4436: ldc_w 1409530297
    //   4439: ixor
    //   4440: ixor
    //   4441: lookupswitch default -> 4468, -1260774902 -> 4424, 1542676742 -> 16956
    //   4468: goto -> 4472
    //   4471: athrow
    //   4472: invokestatic isSafe : (Lnet/minecraft/entity/Entity;IZ)Z
    //   4475: goto -> 4479
    //   4478: athrow
    //   4479: ifne -> 4493
    //   4482: ldc2_w -24899224
    //   4485: l2i
    //   4486: ldc_w 187446572
    //   4489: ixor
    //   4490: goto -> 4501
    //   4493: ldc2_w -1370549835
    //   4496: l2i
    //   4497: ldc_w 1541879282
    //   4500: ixor
    //   4501: ldc2_w -1059011385
    //   4504: l2i
    //   4505: ldc_w 571218358
    //   4508: ixor
    //   4509: ixor
    //   4510: tableswitch default -> 4482, 390396213 -> 4532, 390396214 -> 5064
    //   4532: getstatic Perryc.c : I
    //   4535: iflt -> 4549
    //   4538: ldc2_w -532114381
    //   4541: l2i
    //   4542: ldc_w -47762127
    //   4545: ixor
    //   4546: goto -> 4557
    //   4549: ldc2_w -108918027
    //   4552: l2i
    //   4553: ldc_w 699413054
    //   4556: ixor
    //   4557: ldc2_w 562496741
    //   4560: l2i
    //   4561: ldc_w -2141086068
    //   4564: ixor
    //   4565: ixor
    //   4566: lookupswitch default -> 4592, -1131857045 -> 16840, -422834150 -> 4549
    //   4592: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   4595: getstatic Perryc.c : I
    //   4598: iflt -> 4612
    //   4601: ldc2_w -1610393016
    //   4604: l2i
    //   4605: ldc_w 1329207481
    //   4608: ixor
    //   4609: goto -> 4620
    //   4612: ldc2_w 530108596
    //   4615: l2i
    //   4616: ldc_w -618034981
    //   4619: ixor
    //   4620: ldc2_w 1814709567
    //   4623: l2i
    //   4624: ldc_w -1633894389
    //   4627: ixor
    //   4628: ixor
    //   4629: lookupswitch default -> 4656, -69434345 -> 4612, 495962053 -> 17058
    //   4656: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4659: ldc2_w 1934759501
    //   4662: l2i
    //   4663: ldc_w 1934759500
    //   4666: ixor
    //   4667: getstatic Perryc.1 : I
    //   4670: ifeq -> 4684
    //   4673: ldc2_w 821042483
    //   4676: l2i
    //   4677: ldc_w 127298392
    //   4680: ixor
    //   4681: goto -> 4692
    //   4684: ldc2_w 1615827699
    //   4687: l2i
    //   4688: ldc_w 1208671258
    //   4691: ixor
    //   4692: ldc2_w 871021499
    //   4695: l2i
    //   4696: ldc_w 428720740
    //   4699: ixor
    //   4700: ixor
    //   4701: lookupswitch default -> 4728, -1948488261 -> 4684, 486608820 -> 17094
    //   4728: goto -> 4732
    //   4731: athrow
    //   4732: invokestatic getHealth : (Lnet/minecraft/entity/Entity;Z)F
    //   4735: goto -> 4739
    //   4738: athrow
    //   4739: getstatic Perryc.c : I
    //   4742: iflt -> 4756
    //   4745: ldc2_w -218488358
    //   4748: l2i
    //   4749: ldc_w 101416227
    //   4752: ixor
    //   4753: goto -> 4764
    //   4756: ldc2_w 1408664225
    //   4759: l2i
    //   4760: ldc_w -1765841529
    //   4763: ixor
    //   4764: ldc2_w -1808913878
    //   4767: l2i
    //   4768: ldc_w -1093250543
    //   4771: ixor
    //   4772: ixor
    //   4773: lookupswitch default -> 16836, -569826110 -> 4756, -273572067 -> 4800
    //   4800: aload_0
    //   4801: getstatic Perryc.1 : I
    //   4804: ifeq -> 4818
    //   4807: ldc2_w 1430756073
    //   4810: l2i
    //   4811: ldc_w 1390859718
    //   4814: ixor
    //   4815: goto -> 4826
    //   4818: ldc2_w -1678159668
    //   4821: l2i
    //   4822: ldc_w 581485795
    //   4825: ixor
    //   4826: ldc2_w -852319938
    //   4829: l2i
    //   4830: ldc_w 1531125062
    //   4833: ixor
    //   4834: ixor
    //   4835: lookupswitch default -> 4860, -1848577193 -> 17174, -1417724670 -> 4818
    //   4860: getfield crystalHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4863: getstatic Perryc.c : I
    //   4866: iflt -> 4880
    //   4869: ldc2_w 1935908336
    //   4872: l2i
    //   4873: ldc_w 1630697368
    //   4876: ixor
    //   4877: goto -> 4888
    //   4880: ldc2_w -783632911
    //   4883: l2i
    //   4884: ldc_w 1124175723
    //   4887: ixor
    //   4888: ldc2_w 374088576
    //   4891: l2i
    //   4892: ldc_w 2061067566
    //   4895: ixor
    //   4896: ixor
    //   4897: lookupswitch default -> 4924, 584875157 -> 4880, 2126818502 -> 16940
    //   4924: goto -> 4928
    //   4927: athrow
    //   4928: invokevirtual getValue : ()Ljava/lang/Object;
    //   4931: goto -> 4935
    //   4934: athrow
    //   4935: checkcast java/lang/Float
    //   4938: getstatic Perryc.1 : I
    //   4941: ifeq -> 4955
    //   4944: ldc2_w -232056710
    //   4947: l2i
    //   4948: ldc_w 1737600440
    //   4951: ixor
    //   4952: goto -> 4963
    //   4955: ldc2_w -443416028
    //   4958: l2i
    //   4959: ldc_w -2116142786
    //   4962: ixor
    //   4963: ldc2_w -821412521
    //   4966: l2i
    //   4967: ldc_w 314264746
    //   4970: ixor
    //   4971: ixor
    //   4972: lookupswitch default -> 17016, -1174582553 -> 5000, 1208730687 -> 4955
    //   5000: goto -> 5004
    //   5003: athrow
    //   5004: invokevirtual floatValue : ()F
    //   5007: goto -> 5011
    //   5010: athrow
    //   5011: fcmpg
    //   5012: ifle -> 5026
    //   5015: ldc2_w 845668421
    //   5018: l2i
    //   5019: ldc_w -324454034
    //   5022: ixor
    //   5023: goto -> 5034
    //   5026: ldc2_w 1469492039
    //   5029: l2i
    //   5030: ldc_w -1990692243
    //   5033: ixor
    //   5034: ldc2_w -1527987018
    //   5037: l2i
    //   5038: ldc_w -188305023
    //   5041: ixor
    //   5042: ixor
    //   5043: tableswitch default -> 5015, -1897616356 -> 5064, -1897616355 -> 5596
    //   5064: getstatic Perryc.1 : I
    //   5067: ifeq -> 5081
    //   5070: ldc2_w -1947915395
    //   5073: l2i
    //   5074: ldc_w -821594487
    //   5077: ixor
    //   5078: goto -> 5089
    //   5081: ldc2_w 818658613
    //   5084: l2i
    //   5085: ldc_w -645987480
    //   5088: ixor
    //   5089: ldc2_w -1834120532
    //   5092: l2i
    //   5093: ldc_w 2133376651
    //   5096: ixor
    //   5097: ixor
    //   5098: lookupswitch default -> 16938, -1452840493 -> 5081, 70355578 -> 5124
    //   5124: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   5127: getstatic Perryc.1 : I
    //   5130: ifeq -> 5144
    //   5133: ldc2_w 1399755850
    //   5136: l2i
    //   5137: ldc_w -91274009
    //   5140: ixor
    //   5141: goto -> 5152
    //   5144: ldc2_w -1223639706
    //   5147: l2i
    //   5148: ldc_w 977786874
    //   5151: ixor
    //   5152: ldc2_w -683576523
    //   5155: l2i
    //   5156: ldc_w -1056183732
    //   5159: ixor
    //   5160: ixor
    //   5161: lookupswitch default -> 5188, -1079293484 -> 17090, -615010886 -> 5144
    //   5188: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   5191: ldc2_w -483862945
    //   5194: l2i
    //   5195: ldc_w -483862946
    //   5198: ixor
    //   5199: getstatic Perryc.c : I
    //   5202: iflt -> 5216
    //   5205: ldc2_w -1740373313
    //   5208: l2i
    //   5209: ldc_w 1032784745
    //   5212: ixor
    //   5213: goto -> 5224
    //   5216: ldc2_w 487137629
    //   5219: l2i
    //   5220: ldc_w -1627120825
    //   5223: ixor
    //   5224: ldc2_w 2041381429
    //   5227: l2i
    //   5228: ldc_w -1390777927
    //   5231: ixor
    //   5232: ixor
    //   5233: lookupswitch default -> 17126, 1455051158 -> 5260, 1903977050 -> 5216
    //   5260: goto -> 5264
    //   5263: athrow
    //   5264: invokestatic getHealth : (Lnet/minecraft/entity/Entity;Z)F
    //   5267: goto -> 5271
    //   5270: athrow
    //   5271: getstatic Perryc.1 : I
    //   5274: ifeq -> 5288
    //   5277: ldc2_w -575806203
    //   5280: l2i
    //   5281: ldc_w 118364158
    //   5284: ixor
    //   5285: goto -> 5296
    //   5288: ldc2_w 384924281
    //   5291: l2i
    //   5292: ldc_w 391024498
    //   5295: ixor
    //   5296: ldc2_w -188679375
    //   5299: l2i
    //   5300: ldc_w 673785629
    //   5303: ixor
    //   5304: ixor
    //   5305: lookupswitch default -> 5332, 105524951 -> 16890, 1113406281 -> 5288
    //   5332: aload_0
    //   5333: getstatic Perryc.0 : I
    //   5336: ifle -> 5350
    //   5339: ldc2_w -608829091
    //   5342: l2i
    //   5343: ldc_w -1744387396
    //   5346: ixor
    //   5347: goto -> 5358
    //   5350: ldc2_w 434305592
    //   5353: l2i
    //   5354: ldc_w -932851425
    //   5357: ixor
    //   5358: ldc2_w -320961141
    //   5361: l2i
    //   5362: ldc_w 2136269991
    //   5365: ixor
    //   5366: ixor
    //   5367: lookupswitch default -> 5392, -801463603 -> 17064, -191569885 -> 5350
    //   5392: getfield crystalHoleHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5395: getstatic Perryc.c : I
    //   5398: iflt -> 5412
    //   5401: ldc2_w -1169868417
    //   5404: l2i
    //   5405: ldc_w -804382521
    //   5408: ixor
    //   5409: goto -> 5420
    //   5412: ldc2_w -1683306464
    //   5415: l2i
    //   5416: ldc_w -421674322
    //   5419: ixor
    //   5420: ldc2_w 854396962
    //   5423: l2i
    //   5424: ldc_w -686345927
    //   5427: ixor
    //   5428: ixor
    //   5429: lookupswitch default -> 16818, -1884225373 -> 5412, -1735578731 -> 5456
    //   5456: goto -> 5460
    //   5459: athrow
    //   5460: invokevirtual getValue : ()Ljava/lang/Object;
    //   5463: goto -> 5467
    //   5466: athrow
    //   5467: checkcast java/lang/Float
    //   5470: getstatic Perryc.c : I
    //   5473: iflt -> 5487
    //   5476: ldc2_w -788484054
    //   5479: l2i
    //   5480: ldc_w 1588889782
    //   5483: ixor
    //   5484: goto -> 5495
    //   5487: ldc2_w -1134821249
    //   5490: l2i
    //   5491: ldc_w -343031439
    //   5494: ixor
    //   5495: ldc2_w -636592006
    //   5498: l2i
    //   5499: ldc_w -1447750738
    //   5502: ixor
    //   5503: ixor
    //   5504: lookupswitch default -> 5532, -66106552 -> 16858, 318519066 -> 5487
    //   5532: goto -> 5536
    //   5535: athrow
    //   5536: invokevirtual floatValue : ()F
    //   5539: goto -> 5543
    //   5542: athrow
    //   5543: fcmpg
    //   5544: ifgt -> 5558
    //   5547: ldc2_w 629941039
    //   5550: l2i
    //   5551: ldc_w -484024874
    //   5554: ixor
    //   5555: goto -> 5566
    //   5558: ldc2_w -1321641050
    //   5561: l2i
    //   5562: ldc_w 2006132062
    //   5565: ixor
    //   5566: ldc2_w 1936738596
    //   5569: l2i
    //   5570: ldc_w 295115987
    //   5573: ixor
    //   5574: ixor
    //   5575: tableswitch default -> 5547, -1538446578 -> 5596, -1538446577 -> 6163
    //   5596: getstatic Perryc.c : I
    //   5599: iflt -> 5613
    //   5602: ldc2_w 557117058
    //   5605: l2i
    //   5606: ldc_w 1623228108
    //   5609: ixor
    //   5610: goto -> 5621
    //   5613: ldc2_w -2120240839
    //   5616: l2i
    //   5617: ldc_w 651311717
    //   5620: ixor
    //   5621: ldc2_w -1549912488
    //   5624: l2i
    //   5625: ldc_w 1683015183
    //   5628: ixor
    //   5629: ixor
    //   5630: lookupswitch default -> 5656, -2042994663 -> 17108, 1313775260 -> 5613
    //   5656: aload_0
    //   5657: getstatic Perryc.c : I
    //   5660: iflt -> 5674
    //   5663: ldc2_w 2028890604
    //   5666: l2i
    //   5667: ldc_w -906291719
    //   5670: ixor
    //   5671: goto -> 5682
    //   5674: ldc2_w 455272543
    //   5677: l2i
    //   5678: ldc_w -1695882885
    //   5681: ixor
    //   5682: ldc2_w 1615417800
    //   5685: l2i
    //   5686: ldc_w 1399430707
    //   5689: ixor
    //   5690: ixor
    //   5691: lookupswitch default -> 5716, -2110409746 -> 17156, 102357187 -> 5674
    //   5716: getfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   5719: getstatic Perryc.c : I
    //   5722: iflt -> 5736
    //   5725: ldc2_w 259087279
    //   5728: l2i
    //   5729: ldc_w -769815135
    //   5732: ixor
    //   5733: goto -> 5744
    //   5736: ldc2_w 60832918
    //   5739: l2i
    //   5740: ldc_w -2132428566
    //   5743: ixor
    //   5744: ldc2_w -1001931688
    //   5747: l2i
    //   5748: ldc_w 1807695459
    //   5751: ixor
    //   5752: ixor
    //   5753: lookupswitch default -> 5780, 1902080036 -> 5736, 1922323509 -> 17024
    //   5780: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2.CRYSTALS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   5783: if_acmpne -> 5797
    //   5786: ldc2_w -209297345
    //   5789: l2i
    //   5790: ldc_w 713846552
    //   5793: ixor
    //   5794: goto -> 5805
    //   5797: ldc2_w 664318389
    //   5800: l2i
    //   5801: ldc_w -23937389
    //   5804: ixor
    //   5805: ldc2_w 1122380617
    //   5808: l2i
    //   5809: ldc_w -1142979524
    //   5812: ixor
    //   5813: ixor
    //   5814: tableswitch default -> 5786, 540254290 -> 5836, 540254291 -> 5967
    //   5836: getstatic Perryc.0 : I
    //   5839: ifle -> 5853
    //   5842: ldc2_w 2084539563
    //   5845: l2i
    //   5846: ldc_w 1431211461
    //   5849: ixor
    //   5850: goto -> 5861
    //   5853: ldc2_w -1056454539
    //   5856: l2i
    //   5857: ldc_w 851324448
    //   5860: ixor
    //   5861: ldc2_w 2137410539
    //   5864: l2i
    //   5865: ldc_w 1992959408
    //   5868: ixor
    //   5869: ixor
    //   5870: lookupswitch default -> 5896, -1452070025 -> 5853, 551382837 -> 16856
    //   5896: aload_0
    //   5897: ldc2_w 713438760
    //   5900: l2i
    //   5901: ldc_w 713438761
    //   5904: ixor
    //   5905: getstatic Perryc.c : I
    //   5908: iflt -> 5922
    //   5911: ldc2_w -366943093
    //   5914: l2i
    //   5915: ldc_w -208756934
    //   5918: ixor
    //   5919: goto -> 5930
    //   5922: ldc2_w 1223372847
    //   5925: l2i
    //   5926: ldc_w 2091954491
    //   5929: ixor
    //   5930: ldc2_w 312367638
    //   5933: l2i
    //   5934: ldc_w 440237966
    //   5937: ixor
    //   5938: ixor
    //   5939: lookupswitch default -> 5964, 286088745 -> 16978, 1008355195 -> 5922
    //   5964: putfield switchedForHealthReason : Z
    //   5967: getstatic Perryc.1 : I
    //   5970: ifeq -> 5984
    //   5973: ldc2_w -1716057894
    //   5976: l2i
    //   5977: ldc_w -210230318
    //   5980: ixor
    //   5981: goto -> 5992
    //   5984: ldc2_w 2094958743
    //   5987: l2i
    //   5988: ldc_w 961991578
    //   5991: ixor
    //   5992: ldc2_w -780333513
    //   5995: l2i
    //   5996: ldc_w 1551167513
    //   5999: ixor
    //   6000: ixor
    //   6001: lookupswitch default -> 6028, -406399706 -> 17076, 1059785991 -> 5984
    //   6028: aload_0
    //   6029: getstatic Perryc.1 : I
    //   6032: ifeq -> 6046
    //   6035: ldc2_w 1879733517
    //   6038: l2i
    //   6039: ldc_w -21952495
    //   6042: ixor
    //   6043: goto -> 6054
    //   6046: ldc2_w -610643361
    //   6049: l2i
    //   6050: ldc_w -1657725088
    //   6053: ixor
    //   6054: ldc2_w -1924965501
    //   6057: l2i
    //   6058: ldc_w 301905233
    //   6061: ixor
    //   6062: ixor
    //   6063: lookupswitch default -> 16966, -636050451 -> 6088, 302420942 -> 6046
    //   6088: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2.TOTEMS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   6091: getstatic Perryc.c : I
    //   6094: iflt -> 6108
    //   6097: ldc2_w 100514370
    //   6100: l2i
    //   6101: ldc_w -913455982
    //   6104: ixor
    //   6105: goto -> 6116
    //   6108: ldc2_w -470577070
    //   6111: l2i
    //   6112: ldc_w -1948630693
    //   6115: ixor
    //   6116: ldc2_w -904694331
    //   6119: l2i
    //   6120: ldc_w 1489086002
    //   6123: ixor
    //   6124: ixor
    //   6125: lookupswitch default -> 6152, 818650211 -> 6108, 1587719463 -> 16958
    //   6152: goto -> 6156
    //   6155: athrow
    //   6156: invokevirtual setMode : (Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;)V
    //   6159: goto -> 6163
    //   6162: athrow
    //   6163: getstatic Perryc.1 : I
    //   6166: ifeq -> 6180
    //   6169: ldc2_w -588635394
    //   6172: l2i
    //   6173: ldc_w -1903442567
    //   6176: ixor
    //   6177: goto -> 6188
    //   6180: ldc2_w -59760858
    //   6183: l2i
    //   6184: ldc_w 939454483
    //   6187: ixor
    //   6188: ldc2_w -878269866
    //   6191: l2i
    //   6192: ldc_w -581929666
    //   6195: ixor
    //   6196: ixor
    //   6197: lookupswitch default -> 16824, -579325859 -> 6224, 1150761199 -> 6180
    //   6224: aload_0
    //   6225: getstatic Perryc.0 : I
    //   6228: ifle -> 6242
    //   6231: ldc2_w 1138043682
    //   6234: l2i
    //   6235: ldc_w -809428229
    //   6238: ixor
    //   6239: goto -> 6250
    //   6242: ldc2_w 904765038
    //   6245: l2i
    //   6246: ldc_w -1041898825
    //   6249: ixor
    //   6250: ldc2_w -772585415
    //   6253: l2i
    //   6254: ldc_w -2015048802
    //   6257: ixor
    //   6258: ixor
    //   6259: lookupswitch default -> 17056, -1574961282 -> 6284, -637291906 -> 6242
    //   6284: getfield switchedForHealthReason : Z
    //   6287: ifeq -> 6301
    //   6290: ldc2_w 245111340
    //   6293: l2i
    //   6294: ldc_w 978501864
    //   6297: ixor
    //   6298: goto -> 6309
    //   6301: ldc2_w 2041651064
    //   6304: l2i
    //   6305: ldc_w 1300219325
    //   6308: ixor
    //   6309: ldc2_w 342410018
    //   6312: l2i
    //   6313: ldc_w -467797800
    //   6316: ixor
    //   6317: ixor
    //   6318: tableswitch default -> 6290, -994320066 -> 6340, -994320065 -> 7999
    //   6340: getstatic Perryc.1 : I
    //   6343: ifeq -> 6357
    //   6346: ldc2_w 579220554
    //   6349: l2i
    //   6350: ldc_w -343065413
    //   6353: ixor
    //   6354: goto -> 6365
    //   6357: ldc2_w -1733981024
    //   6360: l2i
    //   6361: ldc_w -274721508
    //   6364: ixor
    //   6365: ldc2_w -64000704
    //   6368: l2i
    //   6369: ldc_w -2109379640
    //   6372: ixor
    //   6373: ixor
    //   6374: lookupswitch default -> 6400, -1218376071 -> 16968, 2075160934 -> 6357
    //   6400: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   6403: getstatic Perryc.1 : I
    //   6406: ifeq -> 6420
    //   6409: ldc2_w 1348177125
    //   6412: l2i
    //   6413: ldc_w 1450229564
    //   6416: ixor
    //   6417: goto -> 6428
    //   6420: ldc2_w -1873432120
    //   6423: l2i
    //   6424: ldc_w 755271910
    //   6427: ixor
    //   6428: ldc2_w 1561446594
    //   6431: l2i
    //   6432: ldc_w -1033784632
    //   6435: ixor
    //   6436: ixor
    //   6437: lookupswitch default -> 17088, -1722070573 -> 6420, 572605220 -> 6464
    //   6464: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6467: ldc2_w 708848837
    //   6470: l2i
    //   6471: ldc_w -708848838
    //   6474: ixor
    //   6475: ldc2_w -2015863434
    //   6478: l2i
    //   6479: ldc_w -2015863434
    //   6482: ixor
    //   6483: getstatic Perryc.c : I
    //   6486: iflt -> 6500
    //   6489: ldc2_w -857664329
    //   6492: l2i
    //   6493: ldc_w 1621551377
    //   6496: ixor
    //   6497: goto -> 6508
    //   6500: ldc2_w -1924338799
    //   6503: l2i
    //   6504: ldc_w -1392596505
    //   6507: ixor
    //   6508: ldc2_w 1041299998
    //   6511: l2i
    //   6512: ldc_w 223866046
    //   6515: ixor
    //   6516: ixor
    //   6517: lookupswitch default -> 17250, -1627329786 -> 6500, 318067926 -> 6544
    //   6544: goto -> 6548
    //   6547: athrow
    //   6548: invokestatic isSafe : (Lnet/minecraft/entity/Entity;IZ)Z
    //   6551: goto -> 6555
    //   6554: athrow
    //   6555: ifeq -> 6569
    //   6558: ldc2_w 1949561370
    //   6561: l2i
    //   6562: ldc_w 1617817831
    //   6565: ixor
    //   6566: goto -> 6577
    //   6569: ldc2_w -418373054
    //   6572: l2i
    //   6573: ldc_w -212983618
    //   6576: ixor
    //   6577: ldc2_w 714543833
    //   6580: l2i
    //   6581: ldc_w 60780128
    //   6584: ixor
    //   6585: ixor
    //   6586: tableswitch default -> 6558, 1029078596 -> 6608, 1029078597 -> 7140
    //   6608: getstatic Perryc.1 : I
    //   6611: ifeq -> 6625
    //   6614: ldc2_w -157259439
    //   6617: l2i
    //   6618: ldc_w 1579910262
    //   6621: ixor
    //   6622: goto -> 6633
    //   6625: ldc2_w -1954961426
    //   6628: l2i
    //   6629: ldc_w 1804474143
    //   6632: ixor
    //   6633: ldc2_w 1965683194
    //   6636: l2i
    //   6637: ldc_w 842409206
    //   6640: ixor
    //   6641: ixor
    //   6642: lookupswitch default -> 6668, -645659619 -> 6625, -275498965 -> 17184
    //   6668: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   6671: getstatic Perryc.1 : I
    //   6674: ifeq -> 6688
    //   6677: ldc2_w 708704210
    //   6680: l2i
    //   6681: ldc_w 1897814695
    //   6684: ixor
    //   6685: goto -> 6696
    //   6688: ldc2_w 496111808
    //   6691: l2i
    //   6692: ldc_w 1443920593
    //   6695: ixor
    //   6696: ldc2_w 687923287
    //   6699: l2i
    //   6700: ldc_w 1699688887
    //   6703: ixor
    //   6704: ixor
    //   6705: lookupswitch default -> 6732, -626396633 -> 6688, 392985749 -> 16888
    //   6732: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   6735: ldc2_w 240509220
    //   6738: l2i
    //   6739: ldc_w 240509221
    //   6742: ixor
    //   6743: getstatic Perryc.0 : I
    //   6746: ifle -> 6760
    //   6749: ldc2_w 9689564
    //   6752: l2i
    //   6753: ldc_w -1085444634
    //   6756: ixor
    //   6757: goto -> 6768
    //   6760: ldc2_w 935191013
    //   6763: l2i
    //   6764: ldc_w 1337513586
    //   6767: ixor
    //   6768: ldc2_w -549956823
    //   6771: l2i
    //   6772: ldc_w 2074508279
    //   6775: ixor
    //   6776: ixor
    //   6777: lookupswitch default -> 16972, -593813687 -> 6804, 457219300 -> 6760
    //   6804: goto -> 6808
    //   6807: athrow
    //   6808: invokestatic getHealth : (Lnet/minecraft/entity/Entity;Z)F
    //   6811: goto -> 6815
    //   6814: athrow
    //   6815: getstatic Perryc.0 : I
    //   6818: ifle -> 6832
    //   6821: ldc2_w 1493446542
    //   6824: l2i
    //   6825: ldc_w -1925978773
    //   6828: ixor
    //   6829: goto -> 6840
    //   6832: ldc2_w -805963285
    //   6835: l2i
    //   6836: ldc_w -170616899
    //   6839: ixor
    //   6840: ldc2_w 2080096473
    //   6843: l2i
    //   6844: ldc_w -1377678134
    //   6847: ixor
    //   6848: ixor
    //   6849: lookupswitch default -> 6876, -1306487759 -> 6832, 36587254 -> 16920
    //   6876: aload_0
    //   6877: getstatic Perryc.c : I
    //   6880: iflt -> 6894
    //   6883: ldc2_w 677183019
    //   6886: l2i
    //   6887: ldc_w 1562964873
    //   6890: ixor
    //   6891: goto -> 6902
    //   6894: ldc2_w -190452776
    //   6897: l2i
    //   6898: ldc_w 184967946
    //   6901: ixor
    //   6902: ldc2_w 82939327
    //   6905: l2i
    //   6906: ldc_w 508680094
    //   6909: ixor
    //   6910: ixor
    //   6911: lookupswitch default -> 6936, -1452171225 -> 6894, 1876187011 -> 16814
    //   6936: getfield crystalHoleHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6939: getstatic Perryc.1 : I
    //   6942: ifeq -> 6956
    //   6945: ldc2_w 1020750200
    //   6948: l2i
    //   6949: ldc_w 1243818398
    //   6952: ixor
    //   6953: goto -> 6964
    //   6956: ldc2_w 965475639
    //   6959: l2i
    //   6960: ldc_w -1599179551
    //   6963: ixor
    //   6964: ldc2_w 1930109596
    //   6967: l2i
    //   6968: ldc_w -1829972025
    //   6971: ixor
    //   6972: ixor
    //   6973: lookupswitch default -> 7000, -1760315971 -> 16846, 2118716265 -> 6956
    //   7000: goto -> 7004
    //   7003: athrow
    //   7004: invokevirtual getValue : ()Ljava/lang/Object;
    //   7007: goto -> 7011
    //   7010: athrow
    //   7011: checkcast java/lang/Float
    //   7014: getstatic Perryc.0 : I
    //   7017: ifle -> 7031
    //   7020: ldc2_w 1827423505
    //   7023: l2i
    //   7024: ldc_w 1300485400
    //   7027: ixor
    //   7028: goto -> 7039
    //   7031: ldc2_w 1842303108
    //   7034: l2i
    //   7035: ldc_w 1832996655
    //   7038: ixor
    //   7039: ldc2_w -1007593227
    //   7042: l2i
    //   7043: ldc_w 187049001
    //   7046: ixor
    //   7047: ixor
    //   7048: lookupswitch default -> 16812, -933665929 -> 7076, -373756715 -> 7031
    //   7076: goto -> 7080
    //   7079: athrow
    //   7080: invokevirtual floatValue : ()F
    //   7083: goto -> 7087
    //   7086: athrow
    //   7087: fcmpl
    //   7088: ifgt -> 7102
    //   7091: ldc2_w -1393903761
    //   7094: l2i
    //   7095: ldc_w -1239419850
    //   7098: ixor
    //   7099: goto -> 7110
    //   7102: ldc2_w 20351704
    //   7105: l2i
    //   7106: ldc_w 465815936
    //   7109: ixor
    //   7110: ldc2_w -574201674
    //   7113: l2i
    //   7114: ldc_w -1829220313
    //   7117: ixor
    //   7118: ixor
    //   7119: tableswitch default -> 7091, 1439396808 -> 7140, 1439396809 -> 7672
    //   7140: getstatic Perryc.1 : I
    //   7143: ifeq -> 7157
    //   7146: ldc2_w -32412856
    //   7149: l2i
    //   7150: ldc_w -1221130375
    //   7153: ixor
    //   7154: goto -> 7165
    //   7157: ldc2_w 1539768817
    //   7160: l2i
    //   7161: ldc_w -2039274148
    //   7164: ixor
    //   7165: ldc2_w 394184775
    //   7168: l2i
    //   7169: ldc_w -961888628
    //   7172: ixor
    //   7173: ixor
    //   7174: lookupswitch default -> 17070, -1728963846 -> 7157, 207639142 -> 7200
    //   7200: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   7203: getstatic Perryc.c : I
    //   7206: iflt -> 7220
    //   7209: ldc2_w -2134003532
    //   7212: l2i
    //   7213: ldc_w -1853645993
    //   7216: ixor
    //   7217: goto -> 7228
    //   7220: ldc2_w 548773679
    //   7223: l2i
    //   7224: ldc_w -1582975886
    //   7227: ixor
    //   7228: ldc2_w -146896797
    //   7231: l2i
    //   7232: ldc_w 1126596772
    //   7235: ixor
    //   7236: ixor
    //   7237: lookupswitch default -> 16870, -1521081564 -> 7220, 889725850 -> 7264
    //   7264: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7267: ldc2_w 1067214648
    //   7270: l2i
    //   7271: ldc_w 1067214649
    //   7274: ixor
    //   7275: getstatic Perryc.c : I
    //   7278: iflt -> 7292
    //   7281: ldc2_w 1476016458
    //   7284: l2i
    //   7285: ldc_w 1196118815
    //   7288: ixor
    //   7289: goto -> 7300
    //   7292: ldc2_w -2076539513
    //   7295: l2i
    //   7296: ldc_w -84866707
    //   7299: ixor
    //   7300: ldc2_w -1264618002
    //   7303: l2i
    //   7304: ldc_w -84715645
    //   7307: ixor
    //   7308: ixor
    //   7309: lookupswitch default -> 7336, -1475547942 -> 7292, 1591560248 -> 16962
    //   7336: goto -> 7340
    //   7339: athrow
    //   7340: invokestatic getHealth : (Lnet/minecraft/entity/Entity;Z)F
    //   7343: goto -> 7347
    //   7346: athrow
    //   7347: getstatic Perryc.1 : I
    //   7350: ifeq -> 7364
    //   7353: ldc2_w -1217056866
    //   7356: l2i
    //   7357: ldc_w -1210535949
    //   7360: ixor
    //   7361: goto -> 7372
    //   7364: ldc2_w 1003399597
    //   7367: l2i
    //   7368: ldc_w -712705021
    //   7371: ixor
    //   7372: ldc2_w -840210492
    //   7375: l2i
    //   7376: ldc_w 291000495
    //   7379: ixor
    //   7380: ixor
    //   7381: lookupswitch default -> 17240, -601966842 -> 7364, 855204549 -> 7408
    //   7408: aload_0
    //   7409: getstatic Perryc.1 : I
    //   7412: ifeq -> 7426
    //   7415: ldc2_w -1326210916
    //   7418: l2i
    //   7419: ldc_w 1725292224
    //   7422: ixor
    //   7423: goto -> 7434
    //   7426: ldc2_w 2037229602
    //   7429: l2i
    //   7430: ldc_w -20883084
    //   7433: ixor
    //   7434: ldc2_w 2100192427
    //   7437: l2i
    //   7438: ldc_w 1155447199
    //   7441: ixor
    //   7442: ixor
    //   7443: lookupswitch default -> 16984, -1101255582 -> 7468, -271146136 -> 7426
    //   7468: getfield crystalHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7471: getstatic Perryc.1 : I
    //   7474: ifeq -> 7488
    //   7477: ldc2_w -403139393
    //   7480: l2i
    //   7481: ldc_w 1324790509
    //   7484: ixor
    //   7485: goto -> 7496
    //   7488: ldc2_w 953347598
    //   7491: l2i
    //   7492: ldc_w 119965176
    //   7495: ixor
    //   7496: ldc2_w -184696341
    //   7499: l2i
    //   7500: ldc_w 336375762
    //   7503: ixor
    //   7504: ixor
    //   7505: lookupswitch default -> 17182, -553318961 -> 7532, 1241466987 -> 7488
    //   7532: goto -> 7536
    //   7535: athrow
    //   7536: invokevirtual getValue : ()Ljava/lang/Object;
    //   7539: goto -> 7543
    //   7542: athrow
    //   7543: checkcast java/lang/Float
    //   7546: getstatic Perryc.c : I
    //   7549: iflt -> 7563
    //   7552: ldc2_w 1635021983
    //   7555: l2i
    //   7556: ldc_w -653660838
    //   7559: ixor
    //   7560: goto -> 7571
    //   7563: ldc2_w -1535097058
    //   7566: l2i
    //   7567: ldc_w 1531995129
    //   7570: ixor
    //   7571: ldc2_w 280515698
    //   7574: l2i
    //   7575: ldc_w -1479174854
    //   7578: ixor
    //   7579: ixor
    //   7580: lookupswitch default -> 7608, -1778579425 -> 7563, 252729485 -> 17222
    //   7608: goto -> 7612
    //   7611: athrow
    //   7612: invokevirtual floatValue : ()F
    //   7615: goto -> 7619
    //   7618: athrow
    //   7619: fcmpl
    //   7620: ifle -> 7634
    //   7623: ldc2_w 1543345748
    //   7626: l2i
    //   7627: ldc_w -436325405
    //   7630: ixor
    //   7631: goto -> 7642
    //   7634: ldc2_w -1916542296
    //   7637: l2i
    //   7638: ldc_w 868239120
    //   7641: ixor
    //   7642: ldc2_w 927352985
    //   7645: l2i
    //   7646: ldc_w -1073309303
    //   7649: ixor
    //   7650: ixor
    //   7651: tableswitch default -> 7623, 1229157543 -> 7672, 1229157544 -> 7999
    //   7672: getstatic Perryc.0 : I
    //   7675: ifle -> 7689
    //   7678: ldc2_w -237963224
    //   7681: l2i
    //   7682: ldc_w 342154111
    //   7685: ixor
    //   7686: goto -> 7697
    //   7689: ldc2_w -985311947
    //   7692: l2i
    //   7693: ldc_w 977106359
    //   7696: ixor
    //   7697: ldc2_w 1931507189
    //   7700: l2i
    //   7701: ldc_w 2097983870
    //   7704: ixor
    //   7705: ixor
    //   7706: lookupswitch default -> 7732, -342300708 -> 17226, -28198728 -> 7689
    //   7732: aload_0
    //   7733: getstatic Perryc.0 : I
    //   7736: ifle -> 7750
    //   7739: ldc2_w -1312045729
    //   7742: l2i
    //   7743: ldc_w 1843809959
    //   7746: ixor
    //   7747: goto -> 7758
    //   7750: ldc2_w 1464915737
    //   7753: l2i
    //   7754: ldc_w -778173226
    //   7757: ixor
    //   7758: ldc2_w -2055648916
    //   7761: l2i
    //   7762: ldc_w 1411873955
    //   7765: ixor
    //   7766: ixor
    //   7767: lookupswitch default -> 16880, 225689143 -> 7750, 1469113856 -> 7792
    //   7792: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2.CRYSTALS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   7795: getstatic Perryc.c : I
    //   7798: iflt -> 7812
    //   7801: ldc2_w 472375445
    //   7804: l2i
    //   7805: ldc_w 1152240050
    //   7808: ixor
    //   7809: goto -> 7820
    //   7812: ldc2_w 736925716
    //   7815: l2i
    //   7816: ldc_w -1878824613
    //   7819: ixor
    //   7820: ldc2_w -2101851478
    //   7823: l2i
    //   7824: ldc_w -1000488118
    //   7827: ixor
    //   7828: ixor
    //   7829: lookupswitch default -> 17110, -49645393 -> 7856, 510632135 -> 7812
    //   7856: goto -> 7860
    //   7859: athrow
    //   7860: invokevirtual setMode : (Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;)V
    //   7863: goto -> 7867
    //   7866: athrow
    //   7867: getstatic Perryc.1 : I
    //   7870: ifeq -> 7884
    //   7873: ldc2_w 251810003
    //   7876: l2i
    //   7877: ldc_w 946954040
    //   7880: ixor
    //   7881: goto -> 7892
    //   7884: ldc2_w -578040978
    //   7887: l2i
    //   7888: ldc_w -1698970251
    //   7891: ixor
    //   7892: ldc2_w 1801114202
    //   7895: l2i
    //   7896: ldc_w -212829408
    //   7899: ixor
    //   7900: ixor
    //   7901: lookupswitch default -> 17066, -1350981999 -> 7884, -549804191 -> 7928
    //   7928: aload_0
    //   7929: ldc2_w -2032251962
    //   7932: l2i
    //   7933: ldc_w -2032251962
    //   7936: ixor
    //   7937: getstatic Perryc.1 : I
    //   7940: ifeq -> 7954
    //   7943: ldc2_w 950655670
    //   7946: l2i
    //   7947: ldc_w 1151848520
    //   7950: ixor
    //   7951: goto -> 7962
    //   7954: ldc2_w 847590340
    //   7957: l2i
    //   7958: ldc_w 1150013255
    //   7961: ixor
    //   7962: ldc2_w 518180135
    //   7965: l2i
    //   7966: ldc_w -1228405920
    //   7969: ixor
    //   7970: ixor
    //   7971: lookupswitch default -> 7996, -735787847 -> 17030, 261479603 -> 7954
    //   7996: putfield switchedForHealthReason : Z
    //   7999: getstatic Perryc.0 : I
    //   8002: ifle -> 8016
    //   8005: ldc2_w -1330724456
    //   8008: l2i
    //   8009: ldc_w 240036109
    //   8012: ixor
    //   8013: goto -> 8024
    //   8016: ldc2_w -259795106
    //   8019: l2i
    //   8020: ldc_w 553367214
    //   8023: ixor
    //   8024: ldc2_w -1462706833
    //   8027: l2i
    //   8028: ldc_w 1823883981
    //   8031: ixor
    //   8032: ixor
    //   8033: lookupswitch default -> 16820, 337575506 -> 8060, 2055665463 -> 8016
    //   8060: aload_0
    //   8061: getstatic Perryc.1 : I
    //   8064: ifeq -> 8078
    //   8067: ldc2_w -1565630984
    //   8070: l2i
    //   8071: ldc_w -332854403
    //   8074: ixor
    //   8075: goto -> 8086
    //   8078: ldc2_w -2090523319
    //   8081: l2i
    //   8082: ldc_w 155534666
    //   8085: ixor
    //   8086: ldc2_w -706450525
    //   8089: l2i
    //   8090: ldc_w 1249155534
    //   8093: ixor
    //   8094: ixor
    //   8095: lookupswitch default -> 8120, -786979608 -> 17212, 1111951030 -> 8078
    //   8120: getfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   8123: getstatic Perryc.0 : I
    //   8126: ifle -> 8140
    //   8129: ldc2_w 1791284835
    //   8132: l2i
    //   8133: ldc_w 466616663
    //   8136: ixor
    //   8137: goto -> 8148
    //   8140: ldc2_w -1305756726
    //   8143: l2i
    //   8144: ldc_w -410268296
    //   8147: ixor
    //   8148: ldc2_w 1149210905
    //   8151: l2i
    //   8152: ldc_w 1043189182
    //   8155: ixor
    //   8156: ixor
    //   8157: lookupswitch default -> 8184, -442301925 -> 8140, 189172627 -> 17136
    //   8184: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2.CRYSTALS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   8187: if_acmpne -> 8201
    //   8190: ldc2_w 136933484
    //   8193: l2i
    //   8194: ldc_w -886068096
    //   8197: ixor
    //   8198: goto -> 8209
    //   8201: ldc2_w 956748992
    //   8204: l2i
    //   8205: ldc_w -100661203
    //   8208: ixor
    //   8209: ldc2_w 37362277
    //   8212: l2i
    //   8213: ldc_w -270906601
    //   8216: ixor
    //   8217: ixor
    //   8218: tableswitch default -> 8190, 786861470 -> 8240, 786861471 -> 10567
    //   8240: getstatic Perryc.0 : I
    //   8243: ifle -> 8257
    //   8246: ldc2_w 338072302
    //   8249: l2i
    //   8250: ldc_w -1118613940
    //   8253: ixor
    //   8254: goto -> 8265
    //   8257: ldc2_w 1983717356
    //   8260: l2i
    //   8261: ldc_w -637001440
    //   8264: ixor
    //   8265: ldc2_w 1207506116
    //   8268: l2i
    //   8269: ldc_w -13157905
    //   8272: ixor
    //   8273: ixor
    //   8274: lookupswitch default -> 16944, 297529737 -> 8257, 351998951 -> 8300
    //   8300: aload_0
    //   8301: getstatic Perryc.c : I
    //   8304: iflt -> 8318
    //   8307: ldc2_w 140053865
    //   8310: l2i
    //   8311: ldc_w 1739055758
    //   8314: ixor
    //   8315: goto -> 8326
    //   8318: ldc2_w 28313492
    //   8321: l2i
    //   8322: ldc_w -643301318
    //   8325: ixor
    //   8326: ldc2_w 498851068
    //   8329: l2i
    //   8330: ldc_w -306114160
    //   8333: ixor
    //   8334: ixor
    //   8335: lookupswitch default -> 17232, -1618730357 -> 8318, 677563074 -> 8360
    //   8360: getfield armorCheck : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8363: getstatic Perryc.c : I
    //   8366: iflt -> 8380
    //   8369: ldc2_w 2041853521
    //   8372: l2i
    //   8373: ldc_w -1172749888
    //   8376: ixor
    //   8377: goto -> 8388
    //   8380: ldc2_w 615024664
    //   8383: l2i
    //   8384: ldc_w -1698613894
    //   8387: ixor
    //   8388: ldc2_w -1947386003
    //   8391: l2i
    //   8392: ldc_w -578971881
    //   8395: ixor
    //   8396: ixor
    //   8397: lookupswitch default -> 8424, -1791107093 -> 17246, -349059870 -> 8380
    //   8424: goto -> 8428
    //   8427: athrow
    //   8428: invokevirtual getValue : ()Ljava/lang/Object;
    //   8431: goto -> 8435
    //   8434: athrow
    //   8435: checkcast java/lang/Boolean
    //   8438: getstatic Perryc.1 : I
    //   8441: ifeq -> 8455
    //   8444: ldc2_w -1119055593
    //   8447: l2i
    //   8448: ldc_w 699902498
    //   8451: ixor
    //   8452: goto -> 8463
    //   8455: ldc2_w 28333976
    //   8458: l2i
    //   8459: ldc_w -1478265645
    //   8462: ixor
    //   8463: ldc2_w 1327384509
    //   8466: l2i
    //   8467: ldc_w -990169883
    //   8470: ixor
    //   8471: ixor
    //   8472: lookupswitch default -> 8500, 522078317 -> 17084, 732608158 -> 8455
    //   8500: goto -> 8504
    //   8503: athrow
    //   8504: invokevirtual booleanValue : ()Z
    //   8507: goto -> 8511
    //   8510: athrow
    //   8511: ifeq -> 8525
    //   8514: ldc2_w 1687853288
    //   8517: l2i
    //   8518: ldc_w -1419690874
    //   8521: ixor
    //   8522: goto -> 8533
    //   8525: ldc2_w -478919567
    //   8528: l2i
    //   8529: ldc_w 747626524
    //   8532: ixor
    //   8533: ldc2_w 1761862865
    //   8536: l2i
    //   8537: ldc_w -963410666
    //   8540: ixor
    //   8541: ixor
    //   8542: tableswitch default -> 8514, 1617675689 -> 8564, 1617675690 -> 10567
    //   8564: getstatic Perryc.c : I
    //   8567: iflt -> 8581
    //   8570: ldc2_w 1428680865
    //   8573: l2i
    //   8574: ldc_w 551726337
    //   8577: ixor
    //   8578: goto -> 8589
    //   8581: ldc2_w -1048355346
    //   8584: l2i
    //   8585: ldc_w 33019340
    //   8588: ixor
    //   8589: ldc2_w 967557031
    //   8592: l2i
    //   8593: ldc_w 499853657
    //   8596: ixor
    //   8597: ixor
    //   8598: lookupswitch default -> 17014, -468443428 -> 8624, 1369819998 -> 8581
    //   8624: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   8627: getstatic Perryc.0 : I
    //   8630: ifle -> 8644
    //   8633: ldc2_w -595873740
    //   8636: l2i
    //   8637: ldc_w 1218766066
    //   8640: ixor
    //   8641: goto -> 8652
    //   8644: ldc2_w 624456729
    //   8647: l2i
    //   8648: ldc_w -1133136533
    //   8651: ixor
    //   8652: ldc2_w 535365149
    //   8655: l2i
    //   8656: ldc_w 820463943
    //   8659: ixor
    //   8660: ixor
    //   8661: lookupswitch default -> 17160, -1237086680 -> 8688, -1143923812 -> 8644
    //   8688: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   8691: getstatic Perryc.c : I
    //   8694: iflt -> 8708
    //   8697: ldc2_w 382151036
    //   8700: l2i
    //   8701: ldc_w -310339740
    //   8704: ixor
    //   8705: goto -> 8716
    //   8708: ldc2_w -2049818971
    //   8711: l2i
    //   8712: ldc_w 1215494474
    //   8715: ixor
    //   8716: ldc2_w 1661587944
    //   8719: l2i
    //   8720: ldc_w -968050104
    //   8723: ixor
    //   8724: ixor
    //   8725: lookupswitch default -> 16970, 1577244088 -> 8708, 1759882319 -> 8752
    //   8752: getstatic net/minecraft/inventory/EntityEquipmentSlot.CHEST : Lnet/minecraft/inventory/EntityEquipmentSlot;
    //   8755: getstatic Perryc.c : I
    //   8758: iflt -> 8772
    //   8761: ldc2_w -1497260957
    //   8764: l2i
    //   8765: ldc_w 1256825907
    //   8768: ixor
    //   8769: goto -> 8780
    //   8772: ldc2_w -94163958
    //   8775: l2i
    //   8776: ldc_w -1910937064
    //   8779: ixor
    //   8780: ldc2_w 1682352416
    //   8783: l2i
    //   8784: ldc_w -903675551
    //   8787: ixor
    //   8788: ixor
    //   8789: lookupswitch default -> 16942, -635441581 -> 8816, 1112379409 -> 8772
    //   8816: goto -> 8820
    //   8819: athrow
    //   8820: invokevirtual func_184582_a : (Lnet/minecraft/inventory/EntityEquipmentSlot;)Lnet/minecraft/item/ItemStack;
    //   8823: goto -> 8827
    //   8826: athrow
    //   8827: getstatic Perryc.0 : I
    //   8830: ifle -> 8844
    //   8833: ldc2_w 455806273
    //   8836: l2i
    //   8837: ldc_w -1202230718
    //   8840: ixor
    //   8841: goto -> 8852
    //   8844: ldc2_w 18450734
    //   8847: l2i
    //   8848: ldc_w -786796361
    //   8851: ixor
    //   8852: ldc2_w -1288587586
    //   8855: l2i
    //   8856: ldc_w -1907637743
    //   8859: ixor
    //   8860: ixor
    //   8861: lookupswitch default -> 8888, -1643768916 -> 17142, 2100916335 -> 8844
    //   8888: goto -> 8892
    //   8891: athrow
    //   8892: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   8895: goto -> 8899
    //   8898: athrow
    //   8899: getstatic Perryc.c : I
    //   8902: iflt -> 8916
    //   8905: ldc2_w -1502611700
    //   8908: l2i
    //   8909: ldc_w 420602673
    //   8912: ixor
    //   8913: goto -> 8924
    //   8916: ldc2_w -431674921
    //   8919: l2i
    //   8920: ldc_w -510637099
    //   8923: ixor
    //   8924: ldc2_w -782697041
    //   8927: l2i
    //   8928: ldc_w -448934410
    //   8931: ixor
    //   8932: ixor
    //   8933: lookupswitch default -> 8960, -1961155484 -> 17138, 674875767 -> 8916
    //   8960: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   8963: if_acmpeq -> 8977
    //   8966: ldc2_w -449458538
    //   8969: l2i
    //   8970: ldc_w -1689126990
    //   8973: ixor
    //   8974: goto -> 8985
    //   8977: ldc2_w 693974486
    //   8980: l2i
    //   8981: ldc_w 1463356659
    //   8984: ixor
    //   8985: ldc2_w 112903037
    //   8988: l2i
    //   8989: ldc_w -1672804275
    //   8992: ixor
    //   8993: ixor
    //   8994: tableswitch default -> 8966, -459935212 -> 9016, -459935211 -> 10372
    //   9016: getstatic Perryc.0 : I
    //   9019: ifle -> 9033
    //   9022: ldc2_w 772237981
    //   9025: l2i
    //   9026: ldc_w 1201398426
    //   9029: ixor
    //   9030: goto -> 9041
    //   9033: ldc2_w -1756498833
    //   9036: l2i
    //   9037: ldc_w -1714046843
    //   9040: ixor
    //   9041: ldc2_w -845633037
    //   9044: l2i
    //   9045: ldc_w -1854311723
    //   9048: ixor
    //   9049: ixor
    //   9050: lookupswitch default -> 16872, 897405729 -> 9033, 1383700428 -> 9076
    //   9076: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   9079: getstatic Perryc.c : I
    //   9082: iflt -> 9096
    //   9085: ldc2_w 2004070973
    //   9088: l2i
    //   9089: ldc_w -604786085
    //   9092: ixor
    //   9093: goto -> 9104
    //   9096: ldc2_w -1799130194
    //   9099: l2i
    //   9100: ldc_w 1462176147
    //   9103: ixor
    //   9104: ldc2_w 1190082072
    //   9107: l2i
    //   9108: ldc_w 301660985
    //   9111: ixor
    //   9112: ixor
    //   9113: lookupswitch default -> 9140, -74068665 -> 17170, 221739917 -> 9096
    //   9140: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   9143: getstatic Perryc.c : I
    //   9146: iflt -> 9160
    //   9149: ldc2_w 1561087803
    //   9152: l2i
    //   9153: ldc_w -1599018714
    //   9156: ixor
    //   9157: goto -> 9168
    //   9160: ldc2_w -1434776079
    //   9163: l2i
    //   9164: ldc_w -1960361235
    //   9167: ixor
    //   9168: ldc2_w -2092100821
    //   9171: l2i
    //   9172: ldc_w -1586771910
    //   9175: ixor
    //   9176: ixor
    //   9177: lookupswitch default -> 17078, -543523572 -> 9160, 58364941 -> 9204
    //   9204: getstatic net/minecraft/inventory/EntityEquipmentSlot.HEAD : Lnet/minecraft/inventory/EntityEquipmentSlot;
    //   9207: getstatic Perryc.0 : I
    //   9210: ifle -> 9224
    //   9213: ldc2_w 750799728
    //   9216: l2i
    //   9217: ldc_w 1368143595
    //   9220: ixor
    //   9221: goto -> 9232
    //   9224: ldc2_w 1907190461
    //   9227: l2i
    //   9228: ldc_w -273529823
    //   9231: ixor
    //   9232: ldc2_w -1090643737
    //   9235: l2i
    //   9236: ldc_w -1979247538
    //   9239: ixor
    //   9240: ixor
    //   9241: lookupswitch default -> 17146, -1427758539 -> 9268, 1236627762 -> 9224
    //   9268: goto -> 9272
    //   9271: athrow
    //   9272: invokevirtual func_184582_a : (Lnet/minecraft/inventory/EntityEquipmentSlot;)Lnet/minecraft/item/ItemStack;
    //   9275: goto -> 9279
    //   9278: athrow
    //   9279: getstatic Perryc.c : I
    //   9282: iflt -> 9296
    //   9285: ldc2_w -213250343
    //   9288: l2i
    //   9289: ldc_w 1242150159
    //   9292: ixor
    //   9293: goto -> 9304
    //   9296: ldc2_w -1718882550
    //   9299: l2i
    //   9300: ldc_w 1657810946
    //   9303: ixor
    //   9304: ldc2_w 1411432366
    //   9307: l2i
    //   9308: ldc_w 210590653
    //   9311: ixor
    //   9312: ixor
    //   9313: lookupswitch default -> 16926, -1544144101 -> 9340, -504471611 -> 9296
    //   9340: goto -> 9344
    //   9343: athrow
    //   9344: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   9347: goto -> 9351
    //   9350: athrow
    //   9351: getstatic Perryc.1 : I
    //   9354: ifeq -> 9368
    //   9357: ldc2_w -1638437773
    //   9360: l2i
    //   9361: ldc_w -1506099932
    //   9364: ixor
    //   9365: goto -> 9376
    //   9368: ldc2_w 141248184
    //   9371: l2i
    //   9372: ldc_w -2076958766
    //   9375: ixor
    //   9376: ldc2_w 1011954070
    //   9379: l2i
    //   9380: ldc_w 1443007850
    //   9383: ixor
    //   9384: ixor
    //   9385: lookupswitch default -> 16908, -435362410 -> 9412, 1379823019 -> 9368
    //   9412: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   9415: if_acmpeq -> 9429
    //   9418: ldc2_w -1532774960
    //   9421: l2i
    //   9422: ldc_w -886395017
    //   9425: ixor
    //   9426: goto -> 9437
    //   9429: ldc2_w 1476906212
    //   9432: l2i
    //   9433: ldc_w 932107842
    //   9436: ixor
    //   9437: ldc2_w 249224532
    //   9440: l2i
    //   9441: ldc_w -1617337499
    //   9444: ixor
    //   9445: ixor
    //   9446: tableswitch default -> 9418, -20274026 -> 9468, -20274025 -> 10372
    //   9468: getstatic Perryc.c : I
    //   9471: iflt -> 9485
    //   9474: ldc2_w -728515043
    //   9477: l2i
    //   9478: ldc_w 425583248
    //   9481: ixor
    //   9482: goto -> 9493
    //   9485: ldc2_w 17663581
    //   9488: l2i
    //   9489: ldc_w 1007758529
    //   9492: ixor
    //   9493: ldc2_w 1369690997
    //   9496: l2i
    //   9497: ldc_w -1435693446
    //   9500: ixor
    //   9501: ixor
    //   9502: lookupswitch default -> 9528, -1026048842 -> 9485, 906002818 -> 16990
    //   9528: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   9531: getstatic Perryc.0 : I
    //   9534: ifle -> 9548
    //   9537: ldc2_w -1057059524
    //   9540: l2i
    //   9541: ldc_w -1061745737
    //   9544: ixor
    //   9545: goto -> 9556
    //   9548: ldc2_w 566314734
    //   9551: l2i
    //   9552: ldc_w 845988533
    //   9555: ixor
    //   9556: ldc2_w 1771909025
    //   9559: l2i
    //   9560: ldc_w 269626985
    //   9563: ixor
    //   9564: ixor
    //   9565: lookupswitch default -> 9592, -734632313 -> 9548, 2043053891 -> 17120
    //   9592: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   9595: getstatic Perryc.1 : I
    //   9598: ifeq -> 9612
    //   9601: ldc2_w 1188646700
    //   9604: l2i
    //   9605: ldc_w -822674393
    //   9608: ixor
    //   9609: goto -> 9620
    //   9612: ldc2_w -1713871061
    //   9615: l2i
    //   9616: ldc_w 1602662866
    //   9619: ixor
    //   9620: ldc2_w 35091409
    //   9623: l2i
    //   9624: ldc_w -1394769070
    //   9627: ixor
    //   9628: ixor
    //   9629: lookupswitch default -> 9656, 652559240 -> 16906, 1127854744 -> 9612
    //   9656: getstatic net/minecraft/inventory/EntityEquipmentSlot.LEGS : Lnet/minecraft/inventory/EntityEquipmentSlot;
    //   9659: getstatic Perryc.1 : I
    //   9662: ifeq -> 9676
    //   9665: ldc2_w 1140331842
    //   9668: l2i
    //   9669: ldc_w 914243003
    //   9672: ixor
    //   9673: goto -> 9684
    //   9676: ldc2_w -254050561
    //   9679: l2i
    //   9680: ldc_w -1672457082
    //   9683: ixor
    //   9684: ldc2_w -1250468006
    //   9687: l2i
    //   9688: ldc_w 840902664
    //   9691: ixor
    //   9692: ixor
    //   9693: lookupswitch default -> 9720, -219258965 -> 17172, 1731190375 -> 9676
    //   9720: goto -> 9724
    //   9723: athrow
    //   9724: invokevirtual func_184582_a : (Lnet/minecraft/inventory/EntityEquipmentSlot;)Lnet/minecraft/item/ItemStack;
    //   9727: goto -> 9731
    //   9730: athrow
    //   9731: getstatic Perryc.1 : I
    //   9734: ifeq -> 9748
    //   9737: ldc2_w -747873987
    //   9740: l2i
    //   9741: ldc_w 908463163
    //   9744: ixor
    //   9745: goto -> 9756
    //   9748: ldc2_w 1600111810
    //   9751: l2i
    //   9752: ldc_w 1531633326
    //   9755: ixor
    //   9756: ldc2_w -1153062608
    //   9759: l2i
    //   9760: ldc_w 1703798673
    //   9763: ixor
    //   9764: ixor
    //   9765: lookupswitch default -> 9792, -715151235 -> 9748, 998382503 -> 17220
    //   9792: goto -> 9796
    //   9795: athrow
    //   9796: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   9799: goto -> 9803
    //   9802: athrow
    //   9803: getstatic Perryc.1 : I
    //   9806: ifeq -> 9820
    //   9809: ldc2_w -1766302623
    //   9812: l2i
    //   9813: ldc_w -806707795
    //   9816: ixor
    //   9817: goto -> 9828
    //   9820: ldc2_w -176625981
    //   9823: l2i
    //   9824: ldc_w 839991811
    //   9827: ixor
    //   9828: ldc2_w 1357319315
    //   9831: l2i
    //   9832: ldc_w 763192395
    //   9835: ixor
    //   9836: ixor
    //   9837: lookupswitch default -> 17052, -1158427624 -> 9864, 617130260 -> 9820
    //   9864: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   9867: if_acmpeq -> 9881
    //   9870: ldc2_w -264927561
    //   9873: l2i
    //   9874: ldc_w 2010820903
    //   9877: ixor
    //   9878: goto -> 9889
    //   9881: ldc2_w 279857479
    //   9884: l2i
    //   9885: ldc_w -1757315370
    //   9888: ixor
    //   9889: ldc2_w 38534893
    //   9892: l2i
    //   9893: ldc_w 1048734705
    //   9896: ixor
    //   9897: ixor
    //   9898: tableswitch default -> 9870, -1155095924 -> 9920, -1155095923 -> 10372
    //   9920: getstatic Perryc.0 : I
    //   9923: ifle -> 9937
    //   9926: ldc2_w 553353030
    //   9929: l2i
    //   9930: ldc_w 1338856578
    //   9933: ixor
    //   9934: goto -> 9945
    //   9937: ldc2_w 289924542
    //   9940: l2i
    //   9941: ldc_w -1296155642
    //   9944: ixor
    //   9945: ldc2_w 93905590
    //   9948: l2i
    //   9949: ldc_w 1486093045
    //   9952: ixor
    //   9953: ixor
    //   9954: lookupswitch default -> 16852, -17645061 -> 9980, 842871687 -> 9937
    //   9980: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   9983: getstatic Perryc.0 : I
    //   9986: ifle -> 10000
    //   9989: ldc2_w -901663186
    //   9992: l2i
    //   9993: ldc_w 1574369451
    //   9996: ixor
    //   9997: goto -> 10008
    //   10000: ldc2_w 187809761
    //   10003: l2i
    //   10004: ldc_w 1525012501
    //   10007: ixor
    //   10008: ldc2_w 656661395
    //   10011: l2i
    //   10012: ldc_w -1184438441
    //   10015: ixor
    //   10016: ixor
    //   10017: lookupswitch default -> 16854, -812557520 -> 10044, 164786753 -> 10000
    //   10044: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   10047: getstatic Perryc.1 : I
    //   10050: ifeq -> 10064
    //   10053: ldc2_w 353368703
    //   10056: l2i
    //   10057: ldc_w -1769051138
    //   10060: ixor
    //   10061: goto -> 10072
    //   10064: ldc2_w 1856046179
    //   10067: l2i
    //   10068: ldc_w -867107871
    //   10071: ixor
    //   10072: ldc2_w -861587709
    //   10075: l2i
    //   10076: ldc_w -290650672
    //   10079: ixor
    //   10080: ixor
    //   10081: lookupswitch default -> 10108, -1584815278 -> 16902, -104964801 -> 10064
    //   10108: getstatic net/minecraft/inventory/EntityEquipmentSlot.FEET : Lnet/minecraft/inventory/EntityEquipmentSlot;
    //   10111: getstatic Perryc.0 : I
    //   10114: ifle -> 10128
    //   10117: ldc2_w -1437042534
    //   10120: l2i
    //   10121: ldc_w 1393924541
    //   10124: ixor
    //   10125: goto -> 10136
    //   10128: ldc2_w 719859015
    //   10131: l2i
    //   10132: ldc_w 1621344748
    //   10135: ixor
    //   10136: ldc2_w -69325234
    //   10139: l2i
    //   10140: ldc_w -1368804463
    //   10143: ixor
    //   10144: ixor
    //   10145: lookupswitch default -> 10172, -1392870152 -> 16860, 1167803884 -> 10128
    //   10172: goto -> 10176
    //   10175: athrow
    //   10176: invokevirtual func_184582_a : (Lnet/minecraft/inventory/EntityEquipmentSlot;)Lnet/minecraft/item/ItemStack;
    //   10179: goto -> 10183
    //   10182: athrow
    //   10183: getstatic Perryc.c : I
    //   10186: iflt -> 10200
    //   10189: ldc2_w -2014358957
    //   10192: l2i
    //   10193: ldc_w 1407932196
    //   10196: ixor
    //   10197: goto -> 10208
    //   10200: ldc2_w 992467983
    //   10203: l2i
    //   10204: ldc_w -1972644560
    //   10207: ixor
    //   10208: ldc2_w -1616464843
    //   10211: l2i
    //   10212: ldc_w -574609317
    //   10215: ixor
    //   10216: ixor
    //   10217: lookupswitch default -> 16802, -1771923175 -> 10200, -215313071 -> 10244
    //   10244: goto -> 10248
    //   10247: athrow
    //   10248: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   10251: goto -> 10255
    //   10254: athrow
    //   10255: getstatic Perryc.c : I
    //   10258: iflt -> 10272
    //   10261: ldc2_w 391080362
    //   10264: l2i
    //   10265: ldc_w -1281787433
    //   10268: ixor
    //   10269: goto -> 10280
    //   10272: ldc2_w -59556333
    //   10275: l2i
    //   10276: ldc_w -1153209894
    //   10279: ixor
    //   10280: ldc2_w 862952541
    //   10283: l2i
    //   10284: ldc_w -402861252
    //   10287: ixor
    //   10288: ixor
    //   10289: lookupswitch default -> 10316, -776167046 -> 10272, 1883594524 -> 17176
    //   10316: getstatic net/minecraft/init/Items.field_190931_a : Lnet/minecraft/item/Item;
    //   10319: if_acmpne -> 10333
    //   10322: ldc2_w 2031017543
    //   10325: l2i
    //   10326: ldc_w -456261597
    //   10329: ixor
    //   10330: goto -> 10341
    //   10333: ldc2_w 222759751
    //   10336: l2i
    //   10337: ldc_w -1870146268
    //   10340: ixor
    //   10341: ldc2_w -1626172811
    //   10344: l2i
    //   10345: ldc_w -195527750
    //   10348: ixor
    //   10349: ixor
    //   10350: tableswitch default -> 10322, -158713941 -> 10372, -158713940 -> 10567
    //   10372: getstatic Perryc.c : I
    //   10375: iflt -> 10389
    //   10378: ldc2_w -348655679
    //   10381: l2i
    //   10382: ldc_w 1359732442
    //   10385: ixor
    //   10386: goto -> 10397
    //   10389: ldc2_w -622429253
    //   10392: l2i
    //   10393: ldc_w -464308017
    //   10396: ixor
    //   10397: ldc2_w -1076631920
    //   10400: l2i
    //   10401: ldc_w 133790557
    //   10404: ixor
    //   10405: ixor
    //   10406: lookupswitch default -> 10432, 35040470 -> 16964, 200999653 -> 10389
    //   10432: aload_0
    //   10433: getstatic Perryc.0 : I
    //   10436: ifle -> 10450
    //   10439: ldc2_w 2127249333
    //   10442: l2i
    //   10443: ldc_w -1716888244
    //   10446: ixor
    //   10447: goto -> 10458
    //   10450: ldc2_w -1172634439
    //   10453: l2i
    //   10454: ldc_w -6368280
    //   10457: ixor
    //   10458: ldc2_w 636897144
    //   10461: l2i
    //   10462: ldc_w 300718866
    //   10465: ixor
    //   10466: ixor
    //   10467: lookupswitch default -> 10492, -746865005 -> 16866, -646837346 -> 10450
    //   10492: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2.TOTEMS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   10495: getstatic Perryc.c : I
    //   10498: iflt -> 10512
    //   10501: ldc2_w -1336848412
    //   10504: l2i
    //   10505: ldc_w -2025857206
    //   10508: ixor
    //   10509: goto -> 10520
    //   10512: ldc2_w 638902515
    //   10515: l2i
    //   10516: ldc_w -1651792311
    //   10519: ixor
    //   10520: ldc2_w 2068705764
    //   10523: l2i
    //   10524: ldc_w 855642305
    //   10527: ixor
    //   10528: ixor
    //   10529: lookupswitch default -> 16868, -204298337 -> 10556, 2133029259 -> 10512
    //   10556: goto -> 10560
    //   10559: athrow
    //   10560: invokevirtual setMode : (Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;)V
    //   10563: goto -> 10567
    //   10566: athrow
    //   10567: getstatic Perryc.0 : I
    //   10570: ifle -> 10584
    //   10573: ldc2_w -2030262116
    //   10576: l2i
    //   10577: ldc_w -1930627042
    //   10580: ixor
    //   10581: goto -> 10592
    //   10584: ldc2_w 642838681
    //   10587: l2i
    //   10588: ldc_w 1234723032
    //   10591: ixor
    //   10592: ldc2_w 1855883626
    //   10595: l2i
    //   10596: ldc_w -834054121
    //   10599: ixor
    //   10600: ixor
    //   10601: lookupswitch default -> 10628, -1429765633 -> 17096, 1370715533 -> 10584
    //   10628: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   10631: getstatic Perryc.c : I
    //   10634: iflt -> 10648
    //   10637: ldc2_w 300081519
    //   10640: l2i
    //   10641: ldc_w -796358355
    //   10644: ixor
    //   10645: goto -> 10656
    //   10648: ldc2_w 100103904
    //   10651: l2i
    //   10652: ldc_w -501006926
    //   10655: ixor
    //   10656: ldc2_w -198498954
    //   10659: l2i
    //   10660: ldc_w 1952817259
    //   10663: ixor
    //   10664: ixor
    //   10665: lookupswitch default -> 17122, 1092939103 -> 10648, 1738198607 -> 10692
    //   10692: getfield field_71462_r : Lnet/minecraft/client/gui/GuiScreen;
    //   10695: instanceof net/minecraft/client/gui/inventory/GuiContainer
    //   10698: ifeq -> 10712
    //   10701: ldc2_w -288843002
    //   10704: l2i
    //   10705: ldc_w 1150628432
    //   10708: ixor
    //   10709: goto -> 10720
    //   10712: ldc2_w -326113204
    //   10715: l2i
    //   10716: ldc_w 1188184421
    //   10719: ixor
    //   10720: ldc2_w 809510322
    //   10723: l2i
    //   10724: ldc_w -545050277
    //   10727: ixor
    //   10728: ixor
    //   10729: tableswitch default -> 10701, 1168031167 -> 10752, 1168031168 -> 10937
    //   10752: getstatic Perryc.c : I
    //   10755: iflt -> 10769
    //   10758: ldc2_w -2009350629
    //   10761: l2i
    //   10762: ldc_w 144632151
    //   10765: ixor
    //   10766: goto -> 10777
    //   10769: ldc2_w -1130941484
    //   10772: l2i
    //   10773: ldc_w 205058153
    //   10776: ixor
    //   10777: ldc2_w 2022478117
    //   10780: l2i
    //   10781: ldc_w 1380758830
    //   10784: ixor
    //   10785: ixor
    //   10786: lookupswitch default -> 10812, -1436191929 -> 17044, 1621841648 -> 10769
    //   10812: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   10815: getstatic Perryc.1 : I
    //   10818: ifeq -> 10832
    //   10821: ldc2_w 1714117328
    //   10824: l2i
    //   10825: ldc_w -366062959
    //   10828: ixor
    //   10829: goto -> 10840
    //   10832: ldc2_w 1634093799
    //   10835: l2i
    //   10836: ldc_w -1338569053
    //   10839: ixor
    //   10840: ldc2_w -2020268265
    //   10843: l2i
    //   10844: ldc_w -1537517008
    //   10847: ixor
    //   10848: ixor
    //   10849: lookupswitch default -> 10876, -1498148867 -> 10832, -1345620634 -> 16900
    //   10876: getfield field_71462_r : Lnet/minecraft/client/gui/GuiScreen;
    //   10879: instanceof net/minecraft/client/gui/inventory/GuiInventory
    //   10882: ifne -> 10896
    //   10885: ldc2_w -1691569574
    //   10888: l2i
    //   10889: ldc_w 1990781186
    //   10892: ixor
    //   10893: goto -> 10904
    //   10896: ldc2_w 534438601
    //   10899: l2i
    //   10900: ldc_w -228673136
    //   10903: ixor
    //   10904: ldc2_w 713442946
    //   10907: l2i
    //   10908: ldc_w -1197126924
    //   10911: ixor
    //   10912: ixor
    //   10913: tableswitch default -> 10885, 2141673262 -> 10936, 2141673263 -> 10937
    //   10936: return
    //   10937: getstatic Perryc.1 : I
    //   10940: ifeq -> 10954
    //   10943: ldc2_w 1564136008
    //   10946: l2i
    //   10947: ldc_w 634452523
    //   10950: ixor
    //   10951: goto -> 10962
    //   10954: ldc2_w -1432850938
    //   10957: l2i
    //   10958: ldc_w -1309667717
    //   10961: ixor
    //   10962: ldc2_w 463417949
    //   10965: l2i
    //   10966: ldc_w 878452295
    //   10969: ixor
    //   10970: ixor
    //   10971: lookupswitch default -> 10996, 546977856 -> 10954, 1462305913 -> 17026
    //   10996: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.mc : Lnet/minecraft/client/Minecraft;
    //   10999: getstatic Perryc.0 : I
    //   11002: ifle -> 11016
    //   11005: ldc2_w -1686740520
    //   11008: l2i
    //   11009: ldc_w 1840836543
    //   11012: ixor
    //   11013: goto -> 11024
    //   11016: ldc2_w -1973706389
    //   11019: l2i
    //   11020: ldc_w -1121343299
    //   11023: ixor
    //   11024: ldc2_w -177234030
    //   11027: l2i
    //   11028: ldc_w -1620545666
    //   11031: ixor
    //   11032: ixor
    //   11033: lookupswitch default -> 11060, -1664516469 -> 16928, 523222934 -> 11016
    //   11060: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   11063: getstatic Perryc.1 : I
    //   11066: ifeq -> 11080
    //   11069: ldc2_w -1186712057
    //   11072: l2i
    //   11073: ldc_w 395845904
    //   11076: ixor
    //   11077: goto -> 11088
    //   11080: ldc2_w 144731179
    //   11083: l2i
    //   11084: ldc_w 1443159657
    //   11087: ixor
    //   11088: ldc2_w -643675194
    //   11091: l2i
    //   11092: ldc_w -1655601025
    //   11095: ixor
    //   11096: ixor
    //   11097: lookupswitch default -> 11124, -365964114 -> 16996, 1068753701 -> 11080
    //   11124: goto -> 11128
    //   11127: athrow
    //   11128: invokevirtual func_184592_cb : ()Lnet/minecraft/item/ItemStack;
    //   11131: goto -> 11135
    //   11134: athrow
    //   11135: getstatic Perryc.0 : I
    //   11138: ifle -> 11152
    //   11141: ldc2_w 1438258737
    //   11144: l2i
    //   11145: ldc_w 1380132582
    //   11148: ixor
    //   11149: goto -> 11160
    //   11152: ldc2_w 712481646
    //   11155: l2i
    //   11156: ldc_w -1820885063
    //   11159: ixor
    //   11160: ldc2_w 1056027234
    //   11163: l2i
    //   11164: ldc_w 865236542
    //   11167: ixor
    //   11168: ixor
    //   11169: lookupswitch default -> 16952, -1268572021 -> 11196, 177927307 -> 11152
    //   11196: goto -> 11200
    //   11199: athrow
    //   11200: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   11203: goto -> 11207
    //   11206: athrow
    //   11207: getstatic Perryc.c : I
    //   11210: iflt -> 11224
    //   11213: ldc2_w 1841748213
    //   11216: l2i
    //   11217: ldc_w -1908236263
    //   11220: ixor
    //   11221: goto -> 11232
    //   11224: ldc2_w -192249157
    //   11227: l2i
    //   11228: ldc_w -574393934
    //   11231: ixor
    //   11232: ldc2_w -950819566
    //   11235: l2i
    //   11236: ldc_w -1716563103
    //   11239: ixor
    //   11240: ixor
    //   11241: lookupswitch default -> 11268, -1810344331 -> 11224, -1116172641 -> 17034
    //   11268: astore_1
    //   11269: getstatic Perryc.c : I
    //   11272: iflt -> 11286
    //   11275: ldc2_w -992639263
    //   11278: l2i
    //   11279: ldc_w -10425371
    //   11282: ixor
    //   11283: goto -> 11294
    //   11286: ldc2_w -1544845066
    //   11289: l2i
    //   11290: ldc_w -142807901
    //   11293: ixor
    //   11294: ldc2_w -1001873329
    //   11297: l2i
    //   11298: ldc_w 473257129
    //   11301: ixor
    //   11302: ixor
    //   11303: lookupswitch default -> 16998, -1930784589 -> 11328, -473392670 -> 11286
    //   11328: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand$1.$SwitchMap$bigname$zprestige$webhack$features$modules$Combat$Offhand$Mode2 : [I
    //   11331: getstatic Perryc.c : I
    //   11334: iflt -> 11348
    //   11337: ldc2_w -1646142760
    //   11340: l2i
    //   11341: ldc_w 179885558
    //   11344: ixor
    //   11345: goto -> 11356
    //   11348: ldc2_w 1929506571
    //   11351: l2i
    //   11352: ldc_w 1395416308
    //   11355: ixor
    //   11356: ldc2_w -1231290330
    //   11359: l2i
    //   11360: ldc_w -1489677046
    //   11363: ixor
    //   11364: ixor
    //   11365: lookupswitch default -> 17218, -2031068670 -> 11348, 830793427 -> 11392
    //   11392: aload_0
    //   11393: getstatic Perryc.c : I
    //   11396: iflt -> 11410
    //   11399: ldc2_w -1097506546
    //   11402: l2i
    //   11403: ldc_w 1906575028
    //   11406: ixor
    //   11407: goto -> 11418
    //   11410: ldc2_w 1876482830
    //   11413: l2i
    //   11414: ldc_w -425627084
    //   11417: ixor
    //   11418: ldc2_w -1359734234
    //   11421: l2i
    //   11422: ldc_w -1993340233
    //   11425: ixor
    //   11426: ixor
    //   11427: lookupswitch default -> 17038, -1363297877 -> 11452, -386566357 -> 11410
    //   11452: getfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   11455: getstatic Perryc.0 : I
    //   11458: ifle -> 11472
    //   11461: ldc2_w 1355847065
    //   11464: l2i
    //   11465: ldc_w 464547137
    //   11468: ixor
    //   11469: goto -> 11480
    //   11472: ldc2_w 1674942110
    //   11475: l2i
    //   11476: ldc_w -17598889
    //   11479: ixor
    //   11480: ldc2_w 165112480
    //   11483: l2i
    //   11484: ldc_w 1861322665
    //   11487: ixor
    //   11488: ixor
    //   11489: lookupswitch default -> 17112, -100659776 -> 11516, 742790609 -> 11472
    //   11516: goto -> 11520
    //   11519: athrow
    //   11520: invokevirtual ordinal : ()I
    //   11523: goto -> 11527
    //   11526: athrow
    //   11527: iaload
    //   11528: lookupswitch default -> 14194, 1 -> 11556, 2 -> 12874
    //   11556: getstatic Perryc.1 : I
    //   11559: ifeq -> 11573
    //   11562: ldc2_w 1779286521
    //   11565: l2i
    //   11566: ldc_w 1313041572
    //   11569: ixor
    //   11570: goto -> 11581
    //   11573: ldc2_w 731883549
    //   11576: l2i
    //   11577: ldc_w -1699812729
    //   11580: ixor
    //   11581: ldc2_w 1763013576
    //   11584: l2i
    //   11585: ldc_w 373944045
    //   11588: ixor
    //   11589: ixor
    //   11590: lookupswitch default -> 11616, -126306432 -> 11573, 1527918712 -> 17162
    //   11616: aload_0
    //   11617: getstatic Perryc.0 : I
    //   11620: ifle -> 11634
    //   11623: ldc2_w 1814103326
    //   11626: l2i
    //   11627: ldc_w 1056538778
    //   11630: ixor
    //   11631: goto -> 11642
    //   11634: ldc2_w -1294157705
    //   11637: l2i
    //   11638: ldc_w 292773476
    //   11641: ixor
    //   11642: ldc2_w -1246790817
    //   11645: l2i
    //   11646: ldc_w -1482185779
    //   11649: ixor
    //   11650: ixor
    //   11651: lookupswitch default -> 11676, 1087397142 -> 16882, 1203753856 -> 11634
    //   11676: getfield totems : I
    //   11679: ifle -> 11693
    //   11682: ldc2_w -396586649
    //   11685: l2i
    //   11686: ldc_w 1760103275
    //   11689: ixor
    //   11690: goto -> 11701
    //   11693: ldc2_w 1574745727
    //   11696: l2i
    //   11697: ldc_w -580309902
    //   11700: ixor
    //   11701: ldc2_w -1723675070
    //   11704: l2i
    //   11705: ldc_w -43191034
    //   11708: ixor
    //   11709: ixor
    //   11710: tableswitch default -> 11682, -459562680 -> 11732, -459562679 -> 15511
    //   11732: getstatic Perryc.0 : I
    //   11735: ifle -> 11749
    //   11738: ldc2_w 2060531117
    //   11741: l2i
    //   11742: ldc_w 1570427402
    //   11745: ixor
    //   11746: goto -> 11757
    //   11749: ldc2_w -868208881
    //   11752: l2i
    //   11753: ldc_w -14465954
    //   11756: ixor
    //   11757: ldc2_w 2001803879
    //   11760: l2i
    //   11761: ldc_w 304089383
    //   11764: ixor
    //   11765: ixor
    //   11766: lookupswitch default -> 11792, -558494894 -> 11749, 1111160039 -> 17072
    //   11792: aload_0
    //   11793: getstatic Perryc.1 : I
    //   11796: ifeq -> 11810
    //   11799: ldc2_w -235412902
    //   11802: l2i
    //   11803: ldc_w 1007097339
    //   11806: ixor
    //   11807: goto -> 11818
    //   11810: ldc2_w -1949037379
    //   11813: l2i
    //   11814: ldc_w -1742435203
    //   11817: ixor
    //   11818: ldc2_w -545766821
    //   11821: l2i
    //   11822: ldc_w -245546957
    //   11825: ixor
    //   11826: ixor
    //   11827: lookupswitch default -> 17104, -472517175 -> 11810, 1037402792 -> 11852
    //   11852: getfield holdingTotem : Z
    //   11855: ifeq -> 11869
    //   11858: ldc2_w 58094136
    //   11861: l2i
    //   11862: ldc_w 1681084977
    //   11865: ixor
    //   11866: goto -> 11877
    //   11869: ldc2_w -1048713699
    //   11872: l2i
    //   11873: ldc_w -1506228715
    //   11876: ixor
    //   11877: ldc2_w 603313768
    //   11880: l2i
    //   11881: ldc_w 1345425213
    //   11884: ixor
    //   11885: ixor
    //   11886: tableswitch default -> 11858, 344029532 -> 11908, 344029533 -> 11911
    //   11908: goto -> 15511
    //   11911: getstatic Perryc.c : I
    //   11914: iflt -> 11928
    //   11917: ldc2_w 1433757136
    //   11920: l2i
    //   11921: ldc_w 477744180
    //   11924: ixor
    //   11925: goto -> 11936
    //   11928: ldc2_w -48048196
    //   11931: l2i
    //   11932: ldc_w 575851279
    //   11935: ixor
    //   11936: ldc2_w -1441189049
    //   11939: l2i
    //   11940: ldc_w 2114874121
    //   11943: ixor
    //   11944: ixor
    //   11945: lookupswitch default -> 16910, -1659113046 -> 11928, 191317245 -> 11972
    //   11972: aload_0
    //   11973: getstatic Perryc.1 : I
    //   11976: ifeq -> 11990
    //   11979: ldc2_w 358662470
    //   11982: l2i
    //   11983: ldc_w -333567197
    //   11986: ixor
    //   11987: goto -> 11998
    //   11990: ldc2_w -642440575
    //   11993: l2i
    //   11994: ldc_w 1991816633
    //   11997: ixor
    //   11998: ldc2_w -1094665081
    //   12001: l2i
    //   12002: ldc_w -1446478673
    //   12005: ixor
    //   12006: ixor
    //   12007: lookupswitch default -> 12032, -294245811 -> 17180, 885402349 -> 11990
    //   12032: getstatic net/minecraft/init/Items.field_190929_cY : Lnet/minecraft/item/Item;
    //   12035: ldc2_w -212753741
    //   12038: l2i
    //   12039: ldc_w -212753741
    //   12042: ixor
    //   12043: getstatic Perryc.0 : I
    //   12046: ifle -> 12060
    //   12049: ldc2_w -223421368
    //   12052: l2i
    //   12053: ldc_w -79812561
    //   12056: ixor
    //   12057: goto -> 12068
    //   12060: ldc2_w 1669835244
    //   12063: l2i
    //   12064: ldc_w -91695527
    //   12067: ixor
    //   12068: ldc2_w -2055964831
    //   12071: l2i
    //   12072: ldc_w -267568310
    //   12075: ixor
    //   12076: ixor
    //   12077: lookupswitch default -> 12104, -344223556 -> 12060, 2095691852 -> 17196
    //   12104: goto -> 12108
    //   12107: athrow
    //   12108: invokestatic findItemInventorySlot : (Lnet/minecraft/item/Item;Z)I
    //   12111: goto -> 12115
    //   12114: athrow
    //   12115: getstatic Perryc.c : I
    //   12118: iflt -> 12132
    //   12121: ldc2_w 640749029
    //   12124: l2i
    //   12125: ldc_w 405304007
    //   12128: ixor
    //   12129: goto -> 12140
    //   12132: ldc2_w -421764943
    //   12135: l2i
    //   12136: ldc_w 867313044
    //   12139: ixor
    //   12140: ldc2_w 781100156
    //   12143: l2i
    //   12144: ldc_w -1357881143
    //   12147: ixor
    //   12148: ixor
    //   12149: lookupswitch default -> 12176, -1081623657 -> 17082, 1923399969 -> 12132
    //   12176: putfield lastTotemSlot : I
    //   12179: getstatic Perryc.0 : I
    //   12182: ifle -> 12196
    //   12185: ldc2_w -366665796
    //   12188: l2i
    //   12189: ldc_w -719481880
    //   12192: ixor
    //   12193: goto -> 12204
    //   12196: ldc2_w -579718780
    //   12199: l2i
    //   12200: ldc_w 1844958906
    //   12203: ixor
    //   12204: ldc2_w -1019093037
    //   12207: l2i
    //   12208: ldc_w 1970246844
    //   12211: ixor
    //   12212: ixor
    //   12213: lookupswitch default -> 17140, -1994995909 -> 12196, 111914065 -> 12240
    //   12240: aload_0
    //   12241: getstatic Perryc.1 : I
    //   12244: ifeq -> 12258
    //   12247: ldc2_w 2138133112
    //   12250: l2i
    //   12251: ldc_w 1280266923
    //   12254: ixor
    //   12255: goto -> 12266
    //   12258: ldc2_w 121545337
    //   12261: l2i
    //   12262: ldc_w -1357455169
    //   12265: ixor
    //   12266: ldc2_w -1277685086
    //   12269: l2i
    //   12270: ldc_w 1005471555
    //   12273: ixor
    //   12274: ixor
    //   12275: lookupswitch default -> 17054, -1157081806 -> 12258, 538842919 -> 12300
    //   12300: aload_1
    //   12301: getstatic Perryc.1 : I
    //   12304: ifeq -> 12318
    //   12307: ldc2_w -759856812
    //   12310: l2i
    //   12311: ldc_w -1498930446
    //   12314: ixor
    //   12315: goto -> 12326
    //   12318: ldc2_w 188207351
    //   12321: l2i
    //   12322: ldc_w 2040800811
    //   12325: ixor
    //   12326: ldc2_w 1656713418
    //   12329: l2i
    //   12330: ldc_w 1875246437
    //   12333: ixor
    //   12334: ixor
    //   12335: lookupswitch default -> 16918, 2036805129 -> 12318, 2146007923 -> 12360
    //   12360: aload_0
    //   12361: getstatic Perryc.1 : I
    //   12364: ifeq -> 12378
    //   12367: ldc2_w 1149152739
    //   12370: l2i
    //   12371: ldc_w 1475336482
    //   12374: ixor
    //   12375: goto -> 12386
    //   12378: ldc2_w 1051256463
    //   12381: l2i
    //   12382: ldc_w -73898565
    //   12385: ixor
    //   12386: ldc2_w 1471835358
    //   12389: l2i
    //   12390: ldc_w -1406706703
    //   12393: ixor
    //   12394: ixor
    //   12395: lookupswitch default -> 12420, -401849362 -> 16898, 346793105 -> 12378
    //   12420: getfield lastTotemSlot : I
    //   12423: getstatic Perryc.c : I
    //   12426: iflt -> 12440
    //   12429: ldc2_w 1163036915
    //   12432: l2i
    //   12433: ldc_w -644427925
    //   12436: ixor
    //   12437: goto -> 12448
    //   12440: ldc2_w -1653040926
    //   12443: l2i
    //   12444: ldc_w 1455419559
    //   12447: ixor
    //   12448: ldc2_w 389557042
    //   12451: l2i
    //   12452: ldc_w -143295675
    //   12455: ixor
    //   12456: ixor
    //   12457: lookupswitch default -> 12484, 1649964383 -> 12440, 2089359343 -> 17128
    //   12484: goto -> 12488
    //   12487: athrow
    //   12488: invokespecial getLastSlot : (Lnet/minecraft/item/Item;I)I
    //   12491: goto -> 12495
    //   12494: athrow
    //   12495: getstatic Perryc.c : I
    //   12498: iflt -> 12512
    //   12501: ldc2_w 20234569
    //   12504: l2i
    //   12505: ldc_w 1059842108
    //   12508: ixor
    //   12509: goto -> 12520
    //   12512: ldc2_w -1854414456
    //   12515: l2i
    //   12516: ldc_w 1934208953
    //   12519: ixor
    //   12520: ldc2_w -1171340228
    //   12523: l2i
    //   12524: ldc_w 1282204216
    //   12527: ixor
    //   12528: ixor
    //   12529: lookupswitch default -> 17116, -933425295 -> 12512, 343697461 -> 12556
    //   12556: istore_2
    //   12557: getstatic Perryc.1 : I
    //   12560: ifeq -> 12574
    //   12563: ldc2_w -1685833436
    //   12566: l2i
    //   12567: ldc_w -2107060
    //   12570: ixor
    //   12571: goto -> 12582
    //   12574: ldc2_w 1817831237
    //   12577: l2i
    //   12578: ldc_w 667080974
    //   12581: ixor
    //   12582: ldc2_w 713832453
    //   12585: l2i
    //   12586: ldc_w -149530868
    //   12589: ixor
    //   12590: ixor
    //   12591: lookupswitch default -> 12616, -1178497183 -> 17200, -156205771 -> 12574
    //   12616: aload_0
    //   12617: getstatic Perryc.c : I
    //   12620: iflt -> 12634
    //   12623: ldc2_w -2112439681
    //   12626: l2i
    //   12627: ldc_w -1902021422
    //   12630: ixor
    //   12631: goto -> 12642
    //   12634: ldc2_w -1205141721
    //   12637: l2i
    //   12638: ldc_w -948398072
    //   12641: ixor
    //   12642: ldc2_w 619060044
    //   12645: l2i
    //   12646: ldc_w 1032593740
    //   12649: ixor
    //   12650: ixor
    //   12651: lookupswitch default -> 17046, 366867629 -> 12634, 1714969903 -> 12676
    //   12676: aload_0
    //   12677: getstatic Perryc.0 : I
    //   12680: ifle -> 12694
    //   12683: ldc2_w -1598546295
    //   12686: l2i
    //   12687: ldc_w -770600696
    //   12690: ixor
    //   12691: goto -> 12702
    //   12694: ldc2_w -1626052258
    //   12697: l2i
    //   12698: ldc_w -1084752564
    //   12701: ixor
    //   12702: ldc2_w 1487662946
    //   12705: l2i
    //   12706: ldc_w -406241236
    //   12709: ixor
    //   12710: ixor
    //   12711: lookupswitch default -> 17000, -1625212068 -> 12736, -842325809 -> 12694
    //   12736: getfield lastTotemSlot : I
    //   12739: getstatic Perryc.c : I
    //   12742: iflt -> 12756
    //   12745: ldc2_w -530921615
    //   12748: l2i
    //   12749: ldc_w 1210807183
    //   12752: ixor
    //   12753: goto -> 12764
    //   12756: ldc2_w -1270919360
    //   12759: l2i
    //   12760: ldc_w 1629699268
    //   12763: ixor
    //   12764: ldc2_w -539538334
    //   12767: l2i
    //   12768: ldc_w -2058169245
    //   12771: ixor
    //   12772: ixor
    //   12773: lookupswitch default -> 12800, -218878721 -> 16842, 1421077012 -> 12756
    //   12800: iload_2
    //   12801: getstatic Perryc.1 : I
    //   12804: ifeq -> 12818
    //   12807: ldc2_w 963930913
    //   12810: l2i
    //   12811: ldc_w -1442878554
    //   12814: ixor
    //   12815: goto -> 12826
    //   12818: ldc2_w 224372564
    //   12821: l2i
    //   12822: ldc_w -1250726702
    //   12825: ixor
    //   12826: ldc2_w 930120191
    //   12829: l2i
    //   12830: ldc_w 1945654793
    //   12833: ixor
    //   12834: ixor
    //   12835: lookupswitch default -> 16826, -737945743 -> 12818, -56353680 -> 12860
    //   12860: goto -> 12864
    //   12863: athrow
    //   12864: invokespecial putItemInOffhand : (II)V
    //   12867: goto -> 12871
    //   12870: athrow
    //   12871: goto -> 15511
    //   12874: getstatic Perryc.0 : I
    //   12877: ifle -> 12891
    //   12880: ldc2_w 69076494
    //   12883: l2i
    //   12884: ldc_w 604368706
    //   12887: ixor
    //   12888: goto -> 12899
    //   12891: ldc2_w -1423820507
    //   12894: l2i
    //   12895: ldc_w 683532639
    //   12898: ixor
    //   12899: ldc2_w -202450899
    //   12902: l2i
    //   12903: ldc_w -495410348
    //   12906: ixor
    //   12907: ixor
    //   12908: lookupswitch default -> 12936, -299203943 -> 12891, 831361589 -> 17228
    //   12936: aload_0
    //   12937: getstatic Perryc.c : I
    //   12940: iflt -> 12954
    //   12943: ldc2_w -1582631988
    //   12946: l2i
    //   12947: ldc_w 1273314100
    //   12950: ixor
    //   12951: goto -> 12962
    //   12954: ldc2_w 51670920
    //   12957: l2i
    //   12958: ldc_w -1591863726
    //   12961: ixor
    //   12962: ldc2_w 979161993
    //   12965: l2i
    //   12966: ldc_w 1034775134
    //   12969: ixor
    //   12970: ixor
    //   12971: lookupswitch default -> 12996, -306286289 -> 17190, 654489968 -> 12954
    //   12996: getfield gapples : I
    //   12999: ifle -> 13013
    //   13002: ldc2_w 916466169
    //   13005: l2i
    //   13006: ldc_w 1730935019
    //   13009: ixor
    //   13010: goto -> 13021
    //   13013: ldc2_w 1291149997
    //   13016: l2i
    //   13017: ldc_w 494842814
    //   13020: ixor
    //   13021: ldc2_w 516233495
    //   13024: l2i
    //   13025: ldc_w -1269738829
    //   13028: ixor
    //   13029: ixor
    //   13030: tableswitch default -> 13002, -81814858 -> 13052, -81814857 -> 15511
    //   13052: getstatic Perryc.0 : I
    //   13055: ifle -> 13069
    //   13058: ldc2_w -50787899
    //   13061: l2i
    //   13062: ldc_w -2134207027
    //   13065: ixor
    //   13066: goto -> 13077
    //   13069: ldc2_w 931121050
    //   13072: l2i
    //   13073: ldc_w 687938201
    //   13076: ixor
    //   13077: ldc2_w -1581681777
    //   13080: l2i
    //   13081: ldc_w 38292031
    //   13084: ixor
    //   13085: ixor
    //   13086: lookupswitch default -> 17236, -1114643277 -> 13112, -540891720 -> 13069
    //   13112: aload_0
    //   13113: getstatic Perryc.0 : I
    //   13116: ifle -> 13130
    //   13119: ldc2_w -835014228
    //   13122: l2i
    //   13123: ldc_w 803644310
    //   13126: ixor
    //   13127: goto -> 13138
    //   13130: ldc2_w -1508403852
    //   13133: l2i
    //   13134: ldc_w -1336158521
    //   13137: ixor
    //   13138: ldc2_w -1543344929
    //   13141: l2i
    //   13142: ldc_w 740996009
    //   13145: ixor
    //   13146: ixor
    //   13147: lookupswitch default -> 13172, -576220107 -> 13130, 1777651020 -> 17206
    //   13172: getfield holdingGapple : Z
    //   13175: ifeq -> 13189
    //   13178: ldc2_w 1057594476
    //   13181: l2i
    //   13182: ldc_w 1056634909
    //   13185: ixor
    //   13186: goto -> 13197
    //   13189: ldc2_w -2055960674
    //   13192: l2i
    //   13193: ldc_w -2071469074
    //   13196: ixor
    //   13197: ldc2_w -1391595243
    //   13200: l2i
    //   13201: ldc_w 203897508
    //   13204: ixor
    //   13205: ixor
    //   13206: tableswitch default -> 13178, -1596346432 -> 13228, -1596346431 -> 13231
    //   13228: goto -> 15511
    //   13231: getstatic Perryc.0 : I
    //   13234: ifle -> 13248
    //   13237: ldc2_w -1715389120
    //   13240: l2i
    //   13241: ldc_w 41151864
    //   13244: ixor
    //   13245: goto -> 13256
    //   13248: ldc2_w -252120303
    //   13251: l2i
    //   13252: ldc_w 603289592
    //   13255: ixor
    //   13256: ldc2_w 1402564877
    //   13259: l2i
    //   13260: ldc_w -713463448
    //   13263: ixor
    //   13264: ixor
    //   13265: lookupswitch default -> 13292, -326533498 -> 13248, 491964509 -> 16834
    //   13292: aload_0
    //   13293: getstatic Perryc.1 : I
    //   13296: ifeq -> 13310
    //   13299: ldc2_w -346864872
    //   13302: l2i
    //   13303: ldc_w -1118116929
    //   13306: ixor
    //   13307: goto -> 13318
    //   13310: ldc2_w -1138687874
    //   13313: l2i
    //   13314: ldc_w -847747230
    //   13317: ixor
    //   13318: ldc2_w -562372613
    //   13321: l2i
    //   13322: ldc_w -1824766115
    //   13325: ixor
    //   13326: ixor
    //   13327: lookupswitch default -> 13352, 458176513 -> 17006, 979661748 -> 13310
    //   13352: getstatic net/minecraft/init/Items.field_151153_ao : Lnet/minecraft/item/Item;
    //   13355: ldc2_w 922125074
    //   13358: l2i
    //   13359: ldc_w 922125074
    //   13362: ixor
    //   13363: getstatic Perryc.1 : I
    //   13366: ifeq -> 13380
    //   13369: ldc2_w -1053584370
    //   13372: l2i
    //   13373: ldc_w -1702200071
    //   13376: ixor
    //   13377: goto -> 13388
    //   13380: ldc2_w -1814264720
    //   13383: l2i
    //   13384: ldc_w 1485684532
    //   13387: ixor
    //   13388: ldc2_w 754055272
    //   13391: l2i
    //   13392: ldc_w -2040718653
    //   13395: ixor
    //   13396: ixor
    //   13397: lookupswitch default -> 17130, -250279332 -> 13380, 1644026351 -> 13424
    //   13424: goto -> 13428
    //   13427: athrow
    //   13428: invokestatic findItemInventorySlot : (Lnet/minecraft/item/Item;Z)I
    //   13431: goto -> 13435
    //   13434: athrow
    //   13435: getstatic Perryc.c : I
    //   13438: iflt -> 13452
    //   13441: ldc2_w -1060044732
    //   13444: l2i
    //   13445: ldc_w -1141450998
    //   13448: ixor
    //   13449: goto -> 13460
    //   13452: ldc2_w -1869273761
    //   13455: l2i
    //   13456: ldc_w -1192373529
    //   13459: ixor
    //   13460: ldc2_w 186413179
    //   13463: l2i
    //   13464: ldc_w 1236216815
    //   13467: ixor
    //   13468: ixor
    //   13469: lookupswitch default -> 13496, -1191297180 -> 13452, 966036698 -> 16816
    //   13496: putfield lastGappleSlot : I
    //   13499: getstatic Perryc.1 : I
    //   13502: ifeq -> 13516
    //   13505: ldc2_w -1601246341
    //   13508: l2i
    //   13509: ldc_w -503900892
    //   13512: ixor
    //   13513: goto -> 13524
    //   13516: ldc2_w 1645590381
    //   13519: l2i
    //   13520: ldc_w 602376142
    //   13523: ixor
    //   13524: ldc2_w -679327917
    //   13527: l2i
    //   13528: ldc_w 1656432536
    //   13531: ixor
    //   13532: ixor
    //   13533: lookupswitch default -> 13560, -197091692 -> 17018, -183814030 -> 13516
    //   13560: aload_0
    //   13561: getstatic Perryc.c : I
    //   13564: iflt -> 13578
    //   13567: ldc2_w 1375453572
    //   13570: l2i
    //   13571: ldc_w 1183309613
    //   13574: ixor
    //   13575: goto -> 13586
    //   13578: ldc2_w 234430798
    //   13581: l2i
    //   13582: ldc_w 517096872
    //   13585: ixor
    //   13586: ldc2_w -799753276
    //   13589: l2i
    //   13590: ldc_w 685485560
    //   13593: ixor
    //   13594: ixor
    //   13595: lookupswitch default -> 17062, -341544230 -> 13620, -269285227 -> 13578
    //   13620: aload_1
    //   13621: getstatic Perryc.0 : I
    //   13624: ifle -> 13638
    //   13627: ldc2_w -53305717
    //   13630: l2i
    //   13631: ldc_w 1587612269
    //   13634: ixor
    //   13635: goto -> 13646
    //   13638: ldc2_w -1329251633
    //   13641: l2i
    //   13642: ldc_w 1558925989
    //   13645: ixor
    //   13646: ldc2_w -42762231
    //   13649: l2i
    //   13650: ldc_w -1248083210
    //   13653: ixor
    //   13654: ixor
    //   13655: lookupswitch default -> 13680, -358885863 -> 17010, 373935312 -> 13638
    //   13680: aload_0
    //   13681: getstatic Perryc.1 : I
    //   13684: ifeq -> 13698
    //   13687: ldc2_w -1772514845
    //   13690: l2i
    //   13691: ldc_w -1757103621
    //   13694: ixor
    //   13695: goto -> 13706
    //   13698: ldc2_w 72082397
    //   13701: l2i
    //   13702: ldc_w -1986004757
    //   13705: ixor
    //   13706: ldc2_w 317563279
    //   13709: l2i
    //   13710: ldc_w -1258695904
    //   13713: ixor
    //   13714: ixor
    //   13715: lookupswitch default -> 17158, -1492559177 -> 13698, 734030233 -> 13740
    //   13740: getfield lastGappleSlot : I
    //   13743: getstatic Perryc.c : I
    //   13746: iflt -> 13760
    //   13749: ldc2_w -618809145
    //   13752: l2i
    //   13753: ldc_w 2100107277
    //   13756: ixor
    //   13757: goto -> 13768
    //   13760: ldc2_w 558102583
    //   13763: l2i
    //   13764: ldc_w 1731002435
    //   13767: ixor
    //   13768: ldc2_w 1699009242
    //   13771: l2i
    //   13772: ldc_w -1999930234
    //   13775: ixor
    //   13776: ixor
    //   13777: lookupswitch default -> 16804, -1411295704 -> 13804, 1270812310 -> 13760
    //   13804: goto -> 13808
    //   13807: athrow
    //   13808: invokespecial getLastSlot : (Lnet/minecraft/item/Item;I)I
    //   13811: goto -> 13815
    //   13814: athrow
    //   13815: getstatic Perryc.c : I
    //   13818: iflt -> 13832
    //   13821: ldc2_w 377517847
    //   13824: l2i
    //   13825: ldc_w -1780406587
    //   13828: ixor
    //   13829: goto -> 13840
    //   13832: ldc2_w 532929341
    //   13835: l2i
    //   13836: ldc_w -270352402
    //   13839: ixor
    //   13840: ldc2_w -1458992837
    //   13843: l2i
    //   13844: ldc_w -206579930
    //   13847: ixor
    //   13848: ixor
    //   13849: lookupswitch default -> 13876, -641265713 -> 16976, 1214015909 -> 13832
    //   13876: istore_2
    //   13877: getstatic Perryc.0 : I
    //   13880: ifle -> 13894
    //   13883: ldc2_w 387481931
    //   13886: l2i
    //   13887: ldc_w 804281415
    //   13890: ixor
    //   13891: goto -> 13902
    //   13894: ldc2_w -834517977
    //   13897: l2i
    //   13898: ldc_w 1435785727
    //   13901: ixor
    //   13902: ldc2_w -1650766110
    //   13905: l2i
    //   13906: ldc_w -974309715
    //   13909: ixor
    //   13910: ixor
    //   13911: lookupswitch default -> 16808, -1012898409 -> 13936, 1621009731 -> 13894
    //   13936: aload_0
    //   13937: getstatic Perryc.1 : I
    //   13940: ifeq -> 13954
    //   13943: ldc2_w 865507179
    //   13946: l2i
    //   13947: ldc_w -967314215
    //   13950: ixor
    //   13951: goto -> 13962
    //   13954: ldc2_w -1301740974
    //   13957: l2i
    //   13958: ldc_w 1483006226
    //   13961: ixor
    //   13962: ldc2_w 828811532
    //   13965: l2i
    //   13966: ldc_w 1627251542
    //   13969: ixor
    //   13970: ixor
    //   13971: lookupswitch default -> 13996, -1537594904 -> 17248, -234550633 -> 13954
    //   13996: aload_0
    //   13997: getstatic Perryc.c : I
    //   14000: iflt -> 14014
    //   14003: ldc2_w 711573043
    //   14006: l2i
    //   14007: ldc_w 1907244662
    //   14010: ixor
    //   14011: goto -> 14022
    //   14014: ldc2_w -1618745600
    //   14017: l2i
    //   14018: ldc_w 802359450
    //   14021: ixor
    //   14022: ldc2_w 461306665
    //   14025: l2i
    //   14026: ldc_w -1180461944
    //   14029: ixor
    //   14030: ixor
    //   14031: lookupswitch default -> 14056, -398486399 -> 14014, -115675164 -> 17148
    //   14056: getfield lastGappleSlot : I
    //   14059: getstatic Perryc.c : I
    //   14062: iflt -> 14076
    //   14065: ldc2_w -1689877647
    //   14068: l2i
    //   14069: ldc_w 1230597772
    //   14072: ixor
    //   14073: goto -> 14084
    //   14076: ldc2_w 1948453862
    //   14079: l2i
    //   14080: ldc_w -1838728944
    //   14083: ixor
    //   14084: ldc2_w -1302129670
    //   14087: l2i
    //   14088: ldc_w -1370781204
    //   14091: ixor
    //   14092: ixor
    //   14093: lookupswitch default -> 16960, -835225621 -> 14076, -93542176 -> 14120
    //   14120: iload_2
    //   14121: getstatic Perryc.0 : I
    //   14124: ifle -> 14138
    //   14127: ldc2_w -740123528
    //   14130: l2i
    //   14131: ldc_w 1757337520
    //   14134: ixor
    //   14135: goto -> 14146
    //   14138: ldc2_w 1100666344
    //   14141: l2i
    //   14142: ldc_w 278511709
    //   14145: ixor
    //   14146: ldc2_w 1779984064
    //   14149: l2i
    //   14150: ldc_w -83263433
    //   14153: ixor
    //   14154: ixor
    //   14155: lookupswitch default -> 17042, -1072499902 -> 14180, 709733695 -> 14138
    //   14180: goto -> 14184
    //   14183: athrow
    //   14184: invokespecial putItemInOffhand : (II)V
    //   14187: goto -> 14191
    //   14190: athrow
    //   14191: goto -> 15511
    //   14194: getstatic Perryc.0 : I
    //   14197: ifle -> 14211
    //   14200: ldc2_w 523216897
    //   14203: l2i
    //   14204: ldc_w -1035077431
    //   14207: ixor
    //   14208: goto -> 14219
    //   14211: ldc2_w 286704485
    //   14214: l2i
    //   14215: ldc_w -502562346
    //   14218: ixor
    //   14219: ldc2_w -63785456
    //   14222: l2i
    //   14223: ldc_w 473857635
    //   14226: ixor
    //   14227: ixor
    //   14228: lookupswitch default -> 17144, 319916736 -> 14256, 1030658235 -> 14211
    //   14256: aload_0
    //   14257: getstatic Perryc.0 : I
    //   14260: ifle -> 14274
    //   14263: ldc2_w -2121684885
    //   14266: l2i
    //   14267: ldc_w 593769582
    //   14270: ixor
    //   14271: goto -> 14282
    //   14274: ldc2_w 440573880
    //   14277: l2i
    //   14278: ldc_w 603216703
    //   14281: ixor
    //   14282: ldc2_w -1803305461
    //   14285: l2i
    //   14286: ldc_w -1155810046
    //   14289: ixor
    //   14290: ixor
    //   14291: lookupswitch default -> 14316, -1921671412 -> 17224, -1080106114 -> 14274
    //   14316: getfield crystals : I
    //   14319: ifle -> 14333
    //   14322: ldc2_w 1841859397
    //   14325: l2i
    //   14326: ldc_w -594704499
    //   14329: ixor
    //   14330: goto -> 14341
    //   14333: ldc2_w 1134523275
    //   14336: l2i
    //   14337: ldc_w -220561598
    //   14340: ixor
    //   14341: ldc2_w 2125587803
    //   14344: l2i
    //   14345: ldc_w -620152605
    //   14348: ixor
    //   14349: ixor
    //   14350: tableswitch default -> 14322, 352178544 -> 14372, 352178545 -> 15511
    //   14372: getstatic Perryc.0 : I
    //   14375: ifle -> 14389
    //   14378: ldc2_w 457469161
    //   14381: l2i
    //   14382: ldc_w 1759090445
    //   14385: ixor
    //   14386: goto -> 14397
    //   14389: ldc2_w 158294136
    //   14392: l2i
    //   14393: ldc_w -1920810617
    //   14396: ixor
    //   14397: ldc2_w 1802070050
    //   14400: l2i
    //   14401: ldc_w 1226677593
    //   14404: ixor
    //   14405: ixor
    //   14406: lookupswitch default -> 17166, -1499900796 -> 14432, 1374228127 -> 14389
    //   14432: aload_0
    //   14433: getstatic Perryc.0 : I
    //   14436: ifle -> 14450
    //   14439: ldc2_w -670537860
    //   14442: l2i
    //   14443: ldc_w 996419784
    //   14446: ixor
    //   14447: goto -> 14458
    //   14450: ldc2_w -1783017342
    //   14453: l2i
    //   14454: ldc_w -1686199183
    //   14457: ixor
    //   14458: ldc2_w -1534817365
    //   14461: l2i
    //   14462: ldc_w -1772219481
    //   14465: ixor
    //   14466: ixor
    //   14467: lookupswitch default -> 14492, -1205420627 -> 14450, -776546376 -> 17002
    //   14492: getfield holdingCrystal : Z
    //   14495: ifeq -> 14509
    //   14498: ldc2_w -544790967
    //   14501: l2i
    //   14502: ldc_w -434148013
    //   14505: ixor
    //   14506: goto -> 14517
    //   14509: ldc2_w 1452498430
    //   14512: l2i
    //   14513: ldc_w 1862997659
    //   14516: ixor
    //   14517: ldc2_w 1876126222
    //   14520: l2i
    //   14521: ldc_w 200951723
    //   14524: ixor
    //   14525: ixor
    //   14526: tableswitch default -> 14498, 1571907263 -> 14548, 1571907264 -> 14551
    //   14548: goto -> 15511
    //   14551: getstatic Perryc.1 : I
    //   14554: ifeq -> 14568
    //   14557: ldc2_w -1193607588
    //   14560: l2i
    //   14561: ldc_w -491833748
    //   14564: ixor
    //   14565: goto -> 14576
    //   14568: ldc2_w 123046194
    //   14571: l2i
    //   14572: ldc_w -131334436
    //   14575: ixor
    //   14576: ldc2_w -1040281653
    //   14579: l2i
    //   14580: ldc_w -1669320180
    //   14583: ixor
    //   14584: ixor
    //   14585: lookupswitch default -> 17032, -1577006551 -> 14612, 118191607 -> 14568
    //   14612: aload_0
    //   14613: getstatic Perryc.c : I
    //   14616: iflt -> 14630
    //   14619: ldc2_w -871486420
    //   14622: l2i
    //   14623: ldc_w 1894287188
    //   14626: ixor
    //   14627: goto -> 14638
    //   14630: ldc2_w 1299241198
    //   14633: l2i
    //   14634: ldc_w 1678741648
    //   14637: ixor
    //   14638: ldc2_w -1027263038
    //   14641: l2i
    //   14642: ldc_w -1569338674
    //   14645: ixor
    //   14646: ixor
    //   14647: lookupswitch default -> 14672, -1336390228 -> 14630, -598322060 -> 16986
    //   14672: getstatic net/minecraft/init/Items.field_185158_cP : Lnet/minecraft/item/Item;
    //   14675: ldc2_w -500183425
    //   14678: l2i
    //   14679: ldc_w -500183425
    //   14682: ixor
    //   14683: getstatic Perryc.0 : I
    //   14686: ifle -> 14700
    //   14689: ldc2_w 1571562785
    //   14692: l2i
    //   14693: ldc_w 584265609
    //   14696: ixor
    //   14697: goto -> 14708
    //   14700: ldc2_w 956467250
    //   14703: l2i
    //   14704: ldc_w -1069826565
    //   14707: ixor
    //   14708: ldc2_w -1607717701
    //   14711: l2i
    //   14712: ldc_w -490249985
    //   14715: ixor
    //   14716: ixor
    //   14717: lookupswitch default -> 14744, -544831149 -> 14700, 1033127660 -> 17186
    //   14744: goto -> 14748
    //   14747: athrow
    //   14748: invokestatic findItemInventorySlot : (Lnet/minecraft/item/Item;Z)I
    //   14751: goto -> 14755
    //   14754: athrow
    //   14755: getstatic Perryc.0 : I
    //   14758: ifle -> 14772
    //   14761: ldc2_w -684894493
    //   14764: l2i
    //   14765: ldc_w -767256958
    //   14768: ixor
    //   14769: goto -> 14780
    //   14772: ldc2_w 98866343
    //   14775: l2i
    //   14776: ldc_w 1527381204
    //   14779: ixor
    //   14780: ldc2_w 1343565143
    //   14783: l2i
    //   14784: ldc_w -622041073
    //   14787: ixor
    //   14788: ixor
    //   14789: lookupswitch default -> 16886, -1886354119 -> 14772, -736875221 -> 14816
    //   14816: putfield lastCrystalSlot : I
    //   14819: getstatic Perryc.c : I
    //   14822: iflt -> 14836
    //   14825: ldc2_w 1214088533
    //   14828: l2i
    //   14829: ldc_w 1225733156
    //   14832: ixor
    //   14833: goto -> 14844
    //   14836: ldc2_w -465188282
    //   14839: l2i
    //   14840: ldc_w -456661798
    //   14843: ixor
    //   14844: ldc2_w 52149797
    //   14847: l2i
    //   14848: ldc_w -1228756700
    //   14851: ixor
    //   14852: ixor
    //   14853: lookupswitch default -> 17004, -1265916304 -> 14836, -1252312675 -> 14880
    //   14880: aload_0
    //   14881: getstatic Perryc.c : I
    //   14884: iflt -> 14898
    //   14887: ldc2_w -1089309576
    //   14890: l2i
    //   14891: ldc_w 432947837
    //   14894: ixor
    //   14895: goto -> 14906
    //   14898: ldc2_w -853203756
    //   14901: l2i
    //   14902: ldc_w -151229581
    //   14905: ixor
    //   14906: ldc2_w -1186871253
    //   14909: l2i
    //   14910: ldc_w 596181328
    //   14913: ixor
    //   14914: ixor
    //   14915: lookupswitch default -> 14940, 962977099 -> 14898, 1008009086 -> 17022
    //   14940: aload_1
    //   14941: getstatic Perryc.c : I
    //   14944: iflt -> 14958
    //   14947: ldc2_w -377996343
    //   14950: l2i
    //   14951: ldc_w 1090326039
    //   14954: ixor
    //   14955: goto -> 14966
    //   14958: ldc2_w 871948901
    //   14961: l2i
    //   14962: ldc_w -1070849427
    //   14965: ixor
    //   14966: ldc2_w -1110093155
    //   14969: l2i
    //   14970: ldc_w 1861694356
    //   14973: ixor
    //   14974: ixor
    //   14975: lookupswitch default -> 17168, 553033985 -> 15000, 2057786583 -> 14958
    //   15000: aload_0
    //   15001: getstatic Perryc.1 : I
    //   15004: ifeq -> 15018
    //   15007: ldc2_w -1805869673
    //   15010: l2i
    //   15011: ldc_w -990128407
    //   15014: ixor
    //   15015: goto -> 15026
    //   15018: ldc2_w -1732620913
    //   15021: l2i
    //   15022: ldc_w -637856695
    //   15025: ixor
    //   15026: ldc2_w 1556125095
    //   15029: l2i
    //   15030: ldc_w 2008570358
    //   15033: ixor
    //   15034: ixor
    //   15035: lookupswitch default -> 15060, -2042676118 -> 15018, 2078246703 -> 17098
    //   15060: getfield lastCrystalSlot : I
    //   15063: getstatic Perryc.1 : I
    //   15066: ifeq -> 15080
    //   15069: ldc2_w -253861529
    //   15072: l2i
    //   15073: ldc_w -1796133070
    //   15076: ixor
    //   15077: goto -> 15088
    //   15080: ldc2_w -1774207086
    //   15083: l2i
    //   15084: ldc_w 1874054583
    //   15087: ixor
    //   15088: ldc2_w 209712734
    //   15091: l2i
    //   15092: ldc_w -2145021540
    //   15095: ixor
    //   15096: ixor
    //   15097: lookupswitch default -> 15124, -394974825 -> 17008, -155853810 -> 15080
    //   15124: goto -> 15128
    //   15127: athrow
    //   15128: invokespecial getLastSlot : (Lnet/minecraft/item/Item;I)I
    //   15131: goto -> 15135
    //   15134: athrow
    //   15135: getstatic Perryc.0 : I
    //   15138: ifle -> 15152
    //   15141: ldc2_w -2105137789
    //   15144: l2i
    //   15145: ldc_w 1743681435
    //   15148: ixor
    //   15149: goto -> 15160
    //   15152: ldc2_w -1725404249
    //   15155: l2i
    //   15156: ldc_w -541981827
    //   15159: ixor
    //   15160: ldc2_w -27841337
    //   15163: l2i
    //   15164: ldc_w -249826016
    //   15167: ixor
    //   15168: ixor
    //   15169: lookupswitch default -> 15196, -1376273687 -> 15152, -366703617 -> 16848
    //   15196: istore_2
    //   15197: getstatic Perryc.1 : I
    //   15200: ifeq -> 15214
    //   15203: ldc2_w -2010256003
    //   15206: l2i
    //   15207: ldc_w 410543990
    //   15210: ixor
    //   15211: goto -> 15222
    //   15214: ldc2_w -1005654654
    //   15217: l2i
    //   15218: ldc_w 1691363185
    //   15221: ixor
    //   15222: ldc2_w 1291342155
    //   15225: l2i
    //   15226: ldc_w 1672326661
    //   15229: ixor
    //   15230: ixor
    //   15231: lookupswitch default -> 16950, -1886702147 -> 15256, -1090489019 -> 15214
    //   15256: aload_0
    //   15257: getstatic Perryc.0 : I
    //   15260: ifle -> 15274
    //   15263: ldc2_w 2029267555
    //   15266: l2i
    //   15267: ldc_w 1539082202
    //   15270: ixor
    //   15271: goto -> 15282
    //   15274: ldc2_w 1269497376
    //   15277: l2i
    //   15278: ldc_w -1087759214
    //   15281: ixor
    //   15282: ldc2_w 1095498646
    //   15285: l2i
    //   15286: ldc_w 162887268
    //   15289: ixor
    //   15290: ixor
    //   15291: lookupswitch default -> 15316, -1111283176 -> 15274, 1807097931 -> 16924
    //   15316: aload_0
    //   15317: getstatic Perryc.1 : I
    //   15320: ifeq -> 15334
    //   15323: ldc2_w -2105189081
    //   15326: l2i
    //   15327: ldc_w 390376770
    //   15330: ixor
    //   15331: goto -> 15342
    //   15334: ldc2_w -378769678
    //   15337: l2i
    //   15338: ldc_w -1418678090
    //   15341: ixor
    //   15342: ldc2_w 1675323324
    //   15345: l2i
    //   15346: ldc_w 465247569
    //   15349: ixor
    //   15350: ixor
    //   15351: lookupswitch default -> 16878, -308180344 -> 15334, 981247145 -> 15376
    //   15376: getfield lastCrystalSlot : I
    //   15379: getstatic Perryc.0 : I
    //   15382: ifle -> 15396
    //   15385: ldc2_w -874055491
    //   15388: l2i
    //   15389: ldc_w 1137391811
    //   15392: ixor
    //   15393: goto -> 15404
    //   15396: ldc2_w -476436012
    //   15399: l2i
    //   15400: ldc_w -1462706415
    //   15403: ixor
    //   15404: ldc2_w -550629955
    //   15407: l2i
    //   15408: ldc_w 1717037637
    //   15411: ixor
    //   15412: ixor
    //   15413: lookupswitch default -> 15440, -98682830 -> 15396, 827598726 -> 16874
    //   15440: iload_2
    //   15441: getstatic Perryc.c : I
    //   15444: iflt -> 15458
    //   15447: ldc2_w 212160333
    //   15450: l2i
    //   15451: ldc_w 1072147726
    //   15454: ixor
    //   15455: goto -> 15466
    //   15458: ldc2_w -1686308198
    //   15461: l2i
    //   15462: ldc_w -755353977
    //   15465: ixor
    //   15466: ldc2_w 895094751
    //   15469: l2i
    //   15470: ldc_w 472120673
    //   15473: ixor
    //   15474: ixor
    //   15475: lookupswitch default -> 16912, 440078589 -> 15458, 1627340451 -> 15500
    //   15500: goto -> 15504
    //   15503: athrow
    //   15504: invokespecial putItemInOffhand : (II)V
    //   15507: goto -> 15511
    //   15510: athrow
    //   15511: ldc2_w 226656255
    //   15514: l2i
    //   15515: ldc_w 226656255
    //   15518: ixor
    //   15519: getstatic Perryc.1 : I
    //   15522: ifeq -> 15536
    //   15525: ldc2_w -1942854656
    //   15528: l2i
    //   15529: ldc_w 462438182
    //   15532: ixor
    //   15533: goto -> 15544
    //   15536: ldc2_w -1138974166
    //   15539: l2i
    //   15540: ldc_w -951559431
    //   15543: ixor
    //   15544: ldc2_w -1423539196
    //   15547: l2i
    //   15548: ldc_w 148312800
    //   15551: ixor
    //   15552: ixor
    //   15553: lookupswitch default -> 17234, -660246985 -> 15580, 877907394 -> 15536
    //   15580: istore_2
    //   15581: getstatic Perryc.c : I
    //   15584: iflt -> 15598
    //   15587: ldc2_w 356084869
    //   15590: l2i
    //   15591: ldc_w 1398025765
    //   15594: ixor
    //   15595: goto -> 15606
    //   15598: ldc2_w -546975391
    //   15601: l2i
    //   15602: ldc_w 1289597230
    //   15605: ixor
    //   15606: ldc2_w -225278882
    //   15609: l2i
    //   15610: ldc_w -2011068625
    //   15613: ixor
    //   15614: ixor
    //   15615: lookupswitch default -> 17202, -385129666 -> 15640, 1021198801 -> 15598
    //   15640: iload_2
    //   15641: getstatic Perryc.0 : I
    //   15644: ifle -> 15658
    //   15647: ldc2_w 675180617
    //   15650: l2i
    //   15651: ldc_w 2090912207
    //   15654: ixor
    //   15655: goto -> 15666
    //   15658: ldc2_w 1600320569
    //   15661: l2i
    //   15662: ldc_w -1974051765
    //   15665: ixor
    //   15666: ldc2_w 744150282
    //   15669: l2i
    //   15670: ldc_w 158211873
    //   15673: ixor
    //   15674: ixor
    //   15675: lookupswitch default -> 17100, -268410279 -> 15700, 1906996141 -> 15658
    //   15700: aload_0
    //   15701: getstatic Perryc.0 : I
    //   15704: ifle -> 15718
    //   15707: ldc2_w 718626126
    //   15710: l2i
    //   15711: ldc_w -945146647
    //   15714: ixor
    //   15715: goto -> 15726
    //   15718: ldc2_w -1619362979
    //   15721: l2i
    //   15722: ldc_w -222459789
    //   15725: ixor
    //   15726: ldc2_w -1494476612
    //   15729: l2i
    //   15730: ldc_w 1251085044
    //   15733: ixor
    //   15734: ixor
    //   15735: lookupswitch default -> 17074, -2118524570 -> 15760, 16874479 -> 15718
    //   15760: getfield actions : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15763: getstatic Perryc.1 : I
    //   15766: ifeq -> 15780
    //   15769: ldc2_w -1908286022
    //   15772: l2i
    //   15773: ldc_w -1072565499
    //   15776: ixor
    //   15777: goto -> 15788
    //   15780: ldc2_w -678298225
    //   15783: l2i
    //   15784: ldc_w -257808842
    //   15787: ixor
    //   15788: ldc2_w -1436050360
    //   15791: l2i
    //   15792: ldc_w 19393160
    //   15795: ixor
    //   15796: ixor
    //   15797: lookupswitch default -> 16982, -1938576007 -> 15824, -451913601 -> 15780
    //   15824: goto -> 15828
    //   15827: athrow
    //   15828: invokevirtual getValue : ()Ljava/lang/Object;
    //   15831: goto -> 15835
    //   15834: athrow
    //   15835: checkcast java/lang/Integer
    //   15838: getstatic Perryc.0 : I
    //   15841: ifle -> 15855
    //   15844: ldc2_w 1030666757
    //   15847: l2i
    //   15848: ldc_w -1139700582
    //   15851: ixor
    //   15852: goto -> 15863
    //   15855: ldc2_w -1767228177
    //   15858: l2i
    //   15859: ldc_w -1161515126
    //   15862: ixor
    //   15863: ldc2_w -1634966261
    //   15866: l2i
    //   15867: ldc_w 193616724
    //   15870: ixor
    //   15871: ixor
    //   15872: lookupswitch default -> 15900, 343476416 -> 17036, 1492370566 -> 15855
    //   15900: goto -> 15904
    //   15903: athrow
    //   15904: invokevirtual intValue : ()I
    //   15907: goto -> 15911
    //   15910: athrow
    //   15911: if_icmpge -> 15925
    //   15914: ldc2_w -2084017234
    //   15917: l2i
    //   15918: ldc_w -1686953771
    //   15921: ixor
    //   15922: goto -> 15933
    //   15925: ldc2_w -218394283
    //   15928: l2i
    //   15929: ldc_w -364848593
    //   15932: ixor
    //   15933: ldc2_w -1544429831
    //   15936: l2i
    //   15937: ldc_w -1931542548
    //   15940: ixor
    //   15941: ixor
    //   15942: tableswitch default -> 15914, 932473454 -> 15964, 932473455 -> 16801
    //   15964: getstatic Perryc.1 : I
    //   15967: ifeq -> 15981
    //   15970: ldc2_w -960910405
    //   15973: l2i
    //   15974: ldc_w 416016432
    //   15977: ixor
    //   15978: goto -> 15989
    //   15981: ldc2_w -482407885
    //   15984: l2i
    //   15985: ldc_w 1676928523
    //   15988: ixor
    //   15989: ldc2_w -1801690247
    //   15992: l2i
    //   15993: ldc_w -1078872034
    //   15996: ixor
    //   15997: ixor
    //   15998: lookupswitch default -> 16024, -991794845 -> 15981, -178284308 -> 16822
    //   16024: aload_0
    //   16025: getstatic Perryc.0 : I
    //   16028: ifle -> 16042
    //   16031: ldc2_w -1006857889
    //   16034: l2i
    //   16035: ldc_w -288909440
    //   16038: ixor
    //   16039: goto -> 16050
    //   16042: ldc2_w 1070840151
    //   16045: l2i
    //   16046: ldc_w 1927116305
    //   16049: ixor
    //   16050: ldc2_w -921362946
    //   16053: l2i
    //   16054: ldc_w -1640744537
    //   16057: ixor
    //   16058: ixor
    //   16059: lookupswitch default -> 16084, 850101937 -> 16042, 2048533126 -> 16954
    //   16084: getfield taskList : Ljava/util/Queue;
    //   16087: getstatic Perryc.0 : I
    //   16090: ifle -> 16104
    //   16093: ldc2_w 392869469
    //   16096: l2i
    //   16097: ldc_w 2026316820
    //   16100: ixor
    //   16101: goto -> 16112
    //   16104: ldc2_w 462387896
    //   16107: l2i
    //   16108: ldc_w -53389430
    //   16111: ixor
    //   16112: ldc2_w -1736763757
    //   16115: l2i
    //   16116: ldc_w -1736574226
    //   16119: ixor
    //   16120: ixor
    //   16121: lookupswitch default -> 16838, -413613745 -> 16148, 1873509940 -> 16104
    //   16148: goto -> 16152
    //   16151: athrow
    //   16152: invokeinterface poll : ()Ljava/lang/Object;
    //   16157: goto -> 16161
    //   16160: athrow
    //   16161: checkcast bigname/zprestige/webhack/util/InventoryUtil$Task
    //   16164: getstatic Perryc.c : I
    //   16167: iflt -> 16181
    //   16170: ldc2_w 1044913178
    //   16173: l2i
    //   16174: ldc_w -1992337908
    //   16177: ixor
    //   16178: goto -> 16189
    //   16181: ldc2_w 947222831
    //   16184: l2i
    //   16185: ldc_w -1257915129
    //   16188: ixor
    //   16189: ldc2_w -1000404841
    //   16192: l2i
    //   16193: ldc_w -810219366
    //   16196: ixor
    //   16197: ixor
    //   16198: lookupswitch default -> 16224, -1841965595 -> 16181, -1130542565 -> 16932
    //   16224: astore_3
    //   16225: getstatic Perryc.c : I
    //   16228: iflt -> 16242
    //   16231: ldc2_w -939828183
    //   16234: l2i
    //   16235: ldc_w -758564786
    //   16238: ixor
    //   16239: goto -> 16250
    //   16242: ldc2_w -1073569799
    //   16245: l2i
    //   16246: ldc_w 617842755
    //   16249: ixor
    //   16250: ldc2_w 411017470
    //   16253: l2i
    //   16254: ldc_w 1737622011
    //   16257: ixor
    //   16258: ixor
    //   16259: lookupswitch default -> 16284, 1793049954 -> 17028, 1904884322 -> 16242
    //   16284: aload_3
    //   16285: ifnonnull -> 16299
    //   16288: ldc2_w -547303136
    //   16291: l2i
    //   16292: ldc_w -1387596494
    //   16295: ixor
    //   16296: goto -> 16307
    //   16299: ldc2_w 805102219
    //   16302: l2i
    //   16303: ldc_w 1574356634
    //   16306: ixor
    //   16307: ldc2_w 711432619
    //   16310: l2i
    //   16311: ldc_w -86048244
    //   16314: ixor
    //   16315: ixor
    //   16316: tableswitch default -> 16288, -1567440971 -> 16340, -1567440970 -> 16343
    //   16340: goto -> 16795
    //   16343: getstatic Perryc.c : I
    //   16346: iflt -> 16360
    //   16349: ldc2_w 1772752259
    //   16352: l2i
    //   16353: ldc_w -798623256
    //   16356: ixor
    //   16357: goto -> 16368
    //   16360: ldc2_w 70209524
    //   16363: l2i
    //   16364: ldc_w -106975675
    //   16367: ixor
    //   16368: ldc2_w 1696045920
    //   16371: l2i
    //   16372: ldc_w 1698494531
    //   16375: ixor
    //   16376: ixor
    //   16377: lookupswitch default -> 16404, -1176201400 -> 16934, 1001586870 -> 16360
    //   16404: aload_3
    //   16405: getstatic Perryc.0 : I
    //   16408: ifle -> 16422
    //   16411: ldc2_w 125030329
    //   16414: l2i
    //   16415: ldc_w -1607257457
    //   16418: ixor
    //   16419: goto -> 16430
    //   16422: ldc2_w -426405486
    //   16425: l2i
    //   16426: ldc_w -476915917
    //   16429: ixor
    //   16430: ldc2_w 2091722002
    //   16433: l2i
    //   16434: ldc_w 1722003907
    //   16437: ixor
    //   16438: ixor
    //   16439: lookupswitch default -> 16830, -1118934553 -> 16422, 520737392 -> 16464
    //   16464: goto -> 16468
    //   16467: athrow
    //   16468: invokevirtual run : ()V
    //   16471: goto -> 16475
    //   16474: athrow
    //   16475: getstatic Perryc.0 : I
    //   16478: ifle -> 16492
    //   16481: ldc2_w 1807008465
    //   16484: l2i
    //   16485: ldc_w 663145963
    //   16488: ixor
    //   16489: goto -> 16500
    //   16492: ldc2_w 525977511
    //   16495: l2i
    //   16496: ldc_w 211126637
    //   16499: ixor
    //   16500: ldc2_w 123864305
    //   16503: l2i
    //   16504: ldc_w -608631882
    //   16507: ixor
    //   16508: ixor
    //   16509: lookupswitch default -> 17214, -1863776131 -> 16492, -820557427 -> 16536
    //   16536: aload_3
    //   16537: getstatic Perryc.1 : I
    //   16540: ifeq -> 16554
    //   16543: ldc2_w 1398552863
    //   16546: l2i
    //   16547: ldc_w 1531032762
    //   16550: ixor
    //   16551: goto -> 16562
    //   16554: ldc2_w -33433184
    //   16557: l2i
    //   16558: ldc_w -1764191262
    //   16561: ixor
    //   16562: ldc2_w -332964069
    //   16565: l2i
    //   16566: ldc_w -2058170648
    //   16569: ixor
    //   16570: ixor
    //   16571: lookupswitch default -> 17080, 28105649 -> 16596, 1634212950 -> 16554
    //   16596: goto -> 16600
    //   16599: athrow
    //   16600: invokevirtual isSwitching : ()Z
    //   16603: goto -> 16607
    //   16606: athrow
    //   16607: ifne -> 16621
    //   16610: ldc2_w 1805241176
    //   16613: l2i
    //   16614: ldc_w -1481585864
    //   16617: ixor
    //   16618: goto -> 16629
    //   16621: ldc2_w 1275694434
    //   16624: l2i
    //   16625: ldc_w -2145350399
    //   16628: ixor
    //   16629: ldc2_w 1487321339
    //   16632: l2i
    //   16633: ldc_w 347883330
    //   16636: ixor
    //   16637: ixor
    //   16638: tableswitch default -> 16610, -2144075815 -> 16660, -2144075814 -> 16663
    //   16660: goto -> 16795
    //   16663: getstatic Perryc.c : I
    //   16666: iflt -> 16680
    //   16669: ldc2_w 1712556607
    //   16672: l2i
    //   16673: ldc_w 36116787
    //   16676: ixor
    //   16677: goto -> 16688
    //   16680: ldc2_w 803712280
    //   16683: l2i
    //   16684: ldc_w -1946628419
    //   16687: ixor
    //   16688: ldc2_w 742490403
    //   16691: l2i
    //   16692: ldc_w 1548111838
    //   16695: ixor
    //   16696: ixor
    //   16697: lookupswitch default -> 16724, 338910705 -> 16904, 1064786726 -> 16680
    //   16724: aload_0
    //   16725: ldc2_w -801047524
    //   16728: l2i
    //   16729: ldc_w -801047523
    //   16732: ixor
    //   16733: getstatic Perryc.1 : I
    //   16736: ifeq -> 16750
    //   16739: ldc2_w -65211029
    //   16742: l2i
    //   16743: ldc_w 617489181
    //   16746: ixor
    //   16747: goto -> 16758
    //   16750: ldc2_w 1951555287
    //   16753: l2i
    //   16754: ldc_w -675737094
    //   16757: ixor
    //   16758: ldc2_w -717455874
    //   16761: l2i
    //   16762: ldc_w -875012916
    //   16765: ixor
    //   16766: ixor
    //   16767: lookupswitch default -> 16792, -969476284 -> 16992, 1838007518 -> 16750
    //   16792: putfield didSwitchThisTick : Z
    //   16795: iinc #2, 1
    //   16798: goto -> 15581
    //   16801: return
    //   16802: aconst_null
    //   16803: athrow
    //   16804: aconst_null
    //   16805: athrow
    //   16806: aconst_null
    //   16807: athrow
    //   16808: aconst_null
    //   16809: athrow
    //   16810: aconst_null
    //   16811: athrow
    //   16812: aconst_null
    //   16813: athrow
    //   16814: aconst_null
    //   16815: athrow
    //   16816: aconst_null
    //   16817: athrow
    //   16818: aconst_null
    //   16819: athrow
    //   16820: aconst_null
    //   16821: athrow
    //   16822: aconst_null
    //   16823: athrow
    //   16824: aconst_null
    //   16825: athrow
    //   16826: aconst_null
    //   16827: athrow
    //   16828: aconst_null
    //   16829: athrow
    //   16830: aconst_null
    //   16831: athrow
    //   16832: aconst_null
    //   16833: athrow
    //   16834: aconst_null
    //   16835: athrow
    //   16836: aconst_null
    //   16837: athrow
    //   16838: aconst_null
    //   16839: athrow
    //   16840: aconst_null
    //   16841: athrow
    //   16842: aconst_null
    //   16843: athrow
    //   16844: aconst_null
    //   16845: athrow
    //   16846: aconst_null
    //   16847: athrow
    //   16848: aconst_null
    //   16849: athrow
    //   16850: aconst_null
    //   16851: athrow
    //   16852: aconst_null
    //   16853: athrow
    //   16854: aconst_null
    //   16855: athrow
    //   16856: aconst_null
    //   16857: athrow
    //   16858: aconst_null
    //   16859: athrow
    //   16860: aconst_null
    //   16861: athrow
    //   16862: aconst_null
    //   16863: athrow
    //   16864: aconst_null
    //   16865: athrow
    //   16866: aconst_null
    //   16867: athrow
    //   16868: aconst_null
    //   16869: athrow
    //   16870: aconst_null
    //   16871: athrow
    //   16872: aconst_null
    //   16873: athrow
    //   16874: aconst_null
    //   16875: athrow
    //   16876: aconst_null
    //   16877: athrow
    //   16878: aconst_null
    //   16879: athrow
    //   16880: aconst_null
    //   16881: athrow
    //   16882: aconst_null
    //   16883: athrow
    //   16884: aconst_null
    //   16885: athrow
    //   16886: aconst_null
    //   16887: athrow
    //   16888: aconst_null
    //   16889: athrow
    //   16890: aconst_null
    //   16891: athrow
    //   16892: aconst_null
    //   16893: athrow
    //   16894: aconst_null
    //   16895: athrow
    //   16896: aconst_null
    //   16897: athrow
    //   16898: aconst_null
    //   16899: athrow
    //   16900: aconst_null
    //   16901: athrow
    //   16902: aconst_null
    //   16903: athrow
    //   16904: aconst_null
    //   16905: athrow
    //   16906: aconst_null
    //   16907: athrow
    //   16908: aconst_null
    //   16909: athrow
    //   16910: aconst_null
    //   16911: athrow
    //   16912: aconst_null
    //   16913: athrow
    //   16914: aconst_null
    //   16915: athrow
    //   16916: aconst_null
    //   16917: athrow
    //   16918: aconst_null
    //   16919: athrow
    //   16920: aconst_null
    //   16921: athrow
    //   16922: aconst_null
    //   16923: athrow
    //   16924: aconst_null
    //   16925: athrow
    //   16926: aconst_null
    //   16927: athrow
    //   16928: aconst_null
    //   16929: athrow
    //   16930: aconst_null
    //   16931: athrow
    //   16932: aconst_null
    //   16933: athrow
    //   16934: aconst_null
    //   16935: athrow
    //   16936: aconst_null
    //   16937: athrow
    //   16938: aconst_null
    //   16939: athrow
    //   16940: aconst_null
    //   16941: athrow
    //   16942: aconst_null
    //   16943: athrow
    //   16944: aconst_null
    //   16945: athrow
    //   16946: aconst_null
    //   16947: athrow
    //   16948: aconst_null
    //   16949: athrow
    //   16950: aconst_null
    //   16951: athrow
    //   16952: aconst_null
    //   16953: athrow
    //   16954: aconst_null
    //   16955: athrow
    //   16956: aconst_null
    //   16957: athrow
    //   16958: aconst_null
    //   16959: athrow
    //   16960: aconst_null
    //   16961: athrow
    //   16962: aconst_null
    //   16963: athrow
    //   16964: aconst_null
    //   16965: athrow
    //   16966: aconst_null
    //   16967: athrow
    //   16968: aconst_null
    //   16969: athrow
    //   16970: aconst_null
    //   16971: athrow
    //   16972: aconst_null
    //   16973: athrow
    //   16974: aconst_null
    //   16975: athrow
    //   16976: aconst_null
    //   16977: athrow
    //   16978: aconst_null
    //   16979: athrow
    //   16980: aconst_null
    //   16981: athrow
    //   16982: aconst_null
    //   16983: athrow
    //   16984: aconst_null
    //   16985: athrow
    //   16986: aconst_null
    //   16987: athrow
    //   16988: aconst_null
    //   16989: athrow
    //   16990: aconst_null
    //   16991: athrow
    //   16992: aconst_null
    //   16993: athrow
    //   16994: aconst_null
    //   16995: athrow
    //   16996: aconst_null
    //   16997: athrow
    //   16998: aconst_null
    //   16999: athrow
    //   17000: aconst_null
    //   17001: athrow
    //   17002: aconst_null
    //   17003: athrow
    //   17004: aconst_null
    //   17005: athrow
    //   17006: aconst_null
    //   17007: athrow
    //   17008: aconst_null
    //   17009: athrow
    //   17010: aconst_null
    //   17011: athrow
    //   17012: aconst_null
    //   17013: athrow
    //   17014: aconst_null
    //   17015: athrow
    //   17016: aconst_null
    //   17017: athrow
    //   17018: aconst_null
    //   17019: athrow
    //   17020: aconst_null
    //   17021: athrow
    //   17022: aconst_null
    //   17023: athrow
    //   17024: aconst_null
    //   17025: athrow
    //   17026: aconst_null
    //   17027: athrow
    //   17028: aconst_null
    //   17029: athrow
    //   17030: aconst_null
    //   17031: athrow
    //   17032: aconst_null
    //   17033: athrow
    //   17034: aconst_null
    //   17035: athrow
    //   17036: aconst_null
    //   17037: athrow
    //   17038: aconst_null
    //   17039: athrow
    //   17040: aconst_null
    //   17041: athrow
    //   17042: aconst_null
    //   17043: athrow
    //   17044: aconst_null
    //   17045: athrow
    //   17046: aconst_null
    //   17047: athrow
    //   17048: aconst_null
    //   17049: athrow
    //   17050: aconst_null
    //   17051: athrow
    //   17052: aconst_null
    //   17053: athrow
    //   17054: aconst_null
    //   17055: athrow
    //   17056: aconst_null
    //   17057: athrow
    //   17058: aconst_null
    //   17059: athrow
    //   17060: aconst_null
    //   17061: athrow
    //   17062: aconst_null
    //   17063: athrow
    //   17064: aconst_null
    //   17065: athrow
    //   17066: aconst_null
    //   17067: athrow
    //   17068: aconst_null
    //   17069: athrow
    //   17070: aconst_null
    //   17071: athrow
    //   17072: aconst_null
    //   17073: athrow
    //   17074: aconst_null
    //   17075: athrow
    //   17076: aconst_null
    //   17077: athrow
    //   17078: aconst_null
    //   17079: athrow
    //   17080: aconst_null
    //   17081: athrow
    //   17082: aconst_null
    //   17083: athrow
    //   17084: aconst_null
    //   17085: athrow
    //   17086: aconst_null
    //   17087: athrow
    //   17088: aconst_null
    //   17089: athrow
    //   17090: aconst_null
    //   17091: athrow
    //   17092: aconst_null
    //   17093: athrow
    //   17094: aconst_null
    //   17095: athrow
    //   17096: aconst_null
    //   17097: athrow
    //   17098: aconst_null
    //   17099: athrow
    //   17100: aconst_null
    //   17101: athrow
    //   17102: aconst_null
    //   17103: athrow
    //   17104: aconst_null
    //   17105: athrow
    //   17106: aconst_null
    //   17107: athrow
    //   17108: aconst_null
    //   17109: athrow
    //   17110: aconst_null
    //   17111: athrow
    //   17112: aconst_null
    //   17113: athrow
    //   17114: aconst_null
    //   17115: athrow
    //   17116: aconst_null
    //   17117: athrow
    //   17118: aconst_null
    //   17119: athrow
    //   17120: aconst_null
    //   17121: athrow
    //   17122: aconst_null
    //   17123: athrow
    //   17124: aconst_null
    //   17125: athrow
    //   17126: aconst_null
    //   17127: athrow
    //   17128: aconst_null
    //   17129: athrow
    //   17130: aconst_null
    //   17131: athrow
    //   17132: aconst_null
    //   17133: athrow
    //   17134: aconst_null
    //   17135: athrow
    //   17136: aconst_null
    //   17137: athrow
    //   17138: aconst_null
    //   17139: athrow
    //   17140: aconst_null
    //   17141: athrow
    //   17142: aconst_null
    //   17143: athrow
    //   17144: aconst_null
    //   17145: athrow
    //   17146: aconst_null
    //   17147: athrow
    //   17148: aconst_null
    //   17149: athrow
    //   17150: aconst_null
    //   17151: athrow
    //   17152: aconst_null
    //   17153: athrow
    //   17154: aconst_null
    //   17155: athrow
    //   17156: aconst_null
    //   17157: athrow
    //   17158: aconst_null
    //   17159: athrow
    //   17160: aconst_null
    //   17161: athrow
    //   17162: aconst_null
    //   17163: athrow
    //   17164: aconst_null
    //   17165: athrow
    //   17166: aconst_null
    //   17167: athrow
    //   17168: aconst_null
    //   17169: athrow
    //   17170: aconst_null
    //   17171: athrow
    //   17172: aconst_null
    //   17173: athrow
    //   17174: aconst_null
    //   17175: athrow
    //   17176: aconst_null
    //   17177: athrow
    //   17178: aconst_null
    //   17179: athrow
    //   17180: aconst_null
    //   17181: athrow
    //   17182: aconst_null
    //   17183: athrow
    //   17184: aconst_null
    //   17185: athrow
    //   17186: aconst_null
    //   17187: athrow
    //   17188: aconst_null
    //   17189: athrow
    //   17190: aconst_null
    //   17191: athrow
    //   17192: aconst_null
    //   17193: athrow
    //   17194: aconst_null
    //   17195: athrow
    //   17196: aconst_null
    //   17197: athrow
    //   17198: aconst_null
    //   17199: athrow
    //   17200: aconst_null
    //   17201: athrow
    //   17202: aconst_null
    //   17203: athrow
    //   17204: aconst_null
    //   17205: athrow
    //   17206: aconst_null
    //   17207: athrow
    //   17208: aconst_null
    //   17209: athrow
    //   17210: aconst_null
    //   17211: athrow
    //   17212: aconst_null
    //   17213: athrow
    //   17214: aconst_null
    //   17215: athrow
    //   17216: aconst_null
    //   17217: athrow
    //   17218: aconst_null
    //   17219: athrow
    //   17220: aconst_null
    //   17221: athrow
    //   17222: aconst_null
    //   17223: athrow
    //   17224: aconst_null
    //   17225: athrow
    //   17226: aconst_null
    //   17227: athrow
    //   17228: aconst_null
    //   17229: athrow
    //   17230: aconst_null
    //   17231: athrow
    //   17232: aconst_null
    //   17233: athrow
    //   17234: aconst_null
    //   17235: athrow
    //   17236: aconst_null
    //   17237: athrow
    //   17238: aconst_null
    //   17239: athrow
    //   17240: aconst_null
    //   17241: athrow
    //   17242: aconst_null
    //   17243: athrow
    //   17244: aconst_null
    //   17245: athrow
    //   17246: aconst_null
    //   17247: athrow
    //   17248: aconst_null
    //   17249: athrow
    //   17250: aconst_null
    //   17251: athrow
    //   17252: aconst_null
    //   17253: athrow
    //   17254: pop
    //   17255: goto -> 24
    //   17258: pop
    //   17259: aconst_null
    //   17260: goto -> 17254
    //   17263: dup
    //   17264: ifnull -> 17254
    //   17267: checkcast java/lang/Throwable
    //   17270: athrow
    //   17271: dup
    //   17272: ifnull -> 17258
    //   17275: checkcast java/lang/Throwable
    //   17278: athrow
    //   17279: aconst_null
    //   17280: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   12557	317	2	lastSlot	I
    //   13877	317	2	lastSlot	I
    //   15197	314	2	lastSlot	I
    //   16225	570	3	task	Lbigname/zprestige/webhack/util/InventoryUtil$Task;
    //   15581	1220	2	i	I
    //   24	16778	0	this	Lbigname/zprestige/webhack/features/modules/Combat/Offhand;
    //   11269	5533	1	currentOffhandItem	Lnet/minecraft/item/Item;
    // Exception table:
    //   from	to	target	type
    //   8	20	17263	finally
    //   383	390	390	finally
    //   383	390	3	finally
    //   384	390	383	java/lang/EnumConstantNotPresentException
    //   384	390	383	java/lang/ArithmeticException
    //   384	390	3	finally
    //   455	462	462	finally
    //   455	462	455	finally
    //   455	462	462	java/lang/IllegalArgumentException
    //   455	462	462	java/lang/AssertionError
    //   456	462	455	finally
    //   691	698	698	finally
    //   691	698	691	java/lang/NullPointerException
    //   691	698	691	java/lang/UnsupportedOperationException
    //   691	698	3	finally
    //   692	698	3	java/lang/ArithmeticException
    //   759	766	766	finally
    //   759	766	3	finally
    //   759	766	759	java/lang/IndexOutOfBoundsException
    //   760	766	759	finally
    //   760	766	3	finally
    //   1075	1082	1082	finally
    //   1075	1082	1075	finally
    //   1076	1082	3	java/lang/NegativeArraySizeException
    //   1076	1082	3	finally
    //   1076	1082	3	java/lang/NumberFormatException
    //   1755	1762	1762	finally
    //   1755	1762	3	java/lang/ArrayIndexOutOfBoundsException
    //   1756	1762	3	finally
    //   1756	1762	1755	java/lang/StringIndexOutOfBoundsException
    //   1756	1762	3	finally
    //   1831	1838	1838	finally
    //   1831	1838	1831	finally
    //   1831	1838	1831	finally
    //   1831	1838	3	finally
    //   1832	1838	1831	finally
    //   2099	2106	2106	finally
    //   2099	2106	2099	java/lang/NumberFormatException
    //   2100	2106	3	java/lang/UnsupportedOperationException
    //   2100	2106	2106	java/lang/IllegalStateException
    //   2100	2106	2099	finally
    //   2359	2366	2366	finally
    //   2359	2366	2359	finally
    //   2359	2366	2366	java/lang/IndexOutOfBoundsException
    //   2360	2366	3	java/util/ConcurrentModificationException
    //   2360	2366	3	java/lang/ArrayIndexOutOfBoundsException
    //   2555	2562	2562	finally
    //   2555	2562	2555	java/lang/NegativeArraySizeException
    //   2555	2562	3	java/lang/NumberFormatException
    //   2555	2562	3	java/lang/IllegalStateException
    //   2555	2562	2555	finally
    //   2631	2638	2638	finally
    //   2631	2638	2638	java/lang/ArrayIndexOutOfBoundsException
    //   2632	2638	2631	java/lang/IllegalArgumentException
    //   2632	2638	3	java/lang/IllegalStateException
    //   2632	2638	3	finally
    //   2891	2898	2898	finally
    //   2891	2898	2898	java/lang/IllegalArgumentException
    //   2891	2898	3	finally
    //   2891	2898	2891	java/util/NoSuchElementException
    //   2892	2898	3	java/lang/RuntimeException
    //   3087	3094	3094	finally
    //   3087	3094	3087	java/lang/ClassCastException
    //   3087	3094	3094	finally
    //   3088	3094	3087	java/lang/ClassCastException
    //   3088	3094	3087	finally
    //   3163	3170	3170	finally
    //   3163	3170	3170	finally
    //   3164	3170	3	java/lang/ClassCastException
    //   3164	3170	3170	java/lang/ClassCastException
    //   3164	3170	3163	java/lang/ArrayIndexOutOfBoundsException
    //   4015	4022	4022	finally
    //   4015	4022	4022	finally
    //   4015	4022	3	finally
    //   4015	4022	4015	finally
    //   4016	4022	4015	java/lang/NumberFormatException
    //   4471	4478	4478	finally
    //   4471	4478	4478	java/lang/AssertionError
    //   4471	4478	3	java/lang/UnsupportedOperationException
    //   4472	4478	3	finally
    //   4472	4478	4471	java/util/NoSuchElementException
    //   4731	4738	4738	finally
    //   4731	4738	3	java/lang/ClassCastException
    //   4731	4738	4738	java/lang/IndexOutOfBoundsException
    //   4731	4738	4731	java/lang/IndexOutOfBoundsException
    //   4732	4738	3	java/lang/ArrayIndexOutOfBoundsException
    //   4927	4934	4934	finally
    //   4927	4934	3	finally
    //   4928	4934	4927	java/lang/IndexOutOfBoundsException
    //   4928	4934	3	java/lang/AssertionError
    //   4928	4934	4934	finally
    //   5004	5010	5010	finally
    //   5004	5010	3	finally
    //   5004	5010	3	finally
    //   5004	5010	5010	java/lang/NegativeArraySizeException
    //   5004	5010	3	finally
    //   5263	5270	5270	finally
    //   5263	5270	5263	finally
    //   5264	5270	5263	finally
    //   5264	5270	3	finally
    //   5264	5270	5263	java/lang/NegativeArraySizeException
    //   5459	5466	5466	finally
    //   5459	5466	5459	finally
    //   5459	5466	5459	finally
    //   5460	5466	5466	finally
    //   5460	5466	5466	finally
    //   5536	5542	5542	finally
    //   5536	5542	3	java/util/ConcurrentModificationException
    //   5536	5542	3	finally
    //   5536	5542	3	java/util/NoSuchElementException
    //   5536	5542	3	java/lang/ArrayIndexOutOfBoundsException
    //   6156	6162	6162	finally
    //   6156	6162	6162	java/lang/NullPointerException
    //   6156	6162	3	java/lang/ClassCastException
    //   6156	6162	6162	finally
    //   6156	6162	3	finally
    //   6547	6554	6554	finally
    //   6547	6554	6547	java/lang/AssertionError
    //   6548	6554	6554	java/lang/NumberFormatException
    //   6548	6554	3	finally
    //   6548	6554	6554	finally
    //   6807	6814	6814	finally
    //   6807	6814	6807	finally
    //   6807	6814	6814	finally
    //   6808	6814	6807	finally
    //   6808	6814	6814	finally
    //   7003	7010	7010	finally
    //   7003	7010	7003	java/lang/ArithmeticException
    //   7004	7010	7003	finally
    //   7004	7010	7003	finally
    //   7004	7010	7003	java/lang/StringIndexOutOfBoundsException
    //   7079	7086	7086	finally
    //   7080	7086	7079	finally
    //   7080	7086	3	java/lang/AssertionError
    //   7080	7086	7086	finally
    //   7080	7086	3	java/lang/NullPointerException
    //   7339	7346	7346	finally
    //   7339	7346	7339	java/lang/AssertionError
    //   7339	7346	3	java/lang/ArithmeticException
    //   7340	7346	7339	finally
    //   7340	7346	3	java/lang/NullPointerException
    //   7535	7542	7542	finally
    //   7535	7542	7535	java/lang/NegativeArraySizeException
    //   7536	7542	3	java/lang/AssertionError
    //   7536	7542	3	finally
    //   7536	7542	3	java/lang/IllegalStateException
    //   7611	7618	7618	finally
    //   7611	7618	7611	java/lang/ArithmeticException
    //   7611	7618	7618	finally
    //   7611	7618	7618	finally
    //   7611	7618	3	java/lang/AssertionError
    //   7859	7866	7866	finally
    //   7859	7866	7859	java/util/NoSuchElementException
    //   7859	7866	7859	finally
    //   7859	7866	7859	finally
    //   7860	7866	7859	finally
    //   8427	8434	8434	finally
    //   8427	8434	3	finally
    //   8427	8434	3	java/lang/NegativeArraySizeException
    //   8427	8434	8434	java/lang/IllegalArgumentException
    //   8428	8434	8427	finally
    //   8503	8510	8510	finally
    //   8503	8510	8510	java/lang/IllegalArgumentException
    //   8503	8510	8503	finally
    //   8504	8510	8510	java/lang/NumberFormatException
    //   8504	8510	8503	java/lang/NegativeArraySizeException
    //   8819	8826	8826	finally
    //   8819	8826	3	java/lang/StringIndexOutOfBoundsException
    //   8819	8826	8826	finally
    //   8820	8826	8819	finally
    //   8820	8826	8826	java/util/ConcurrentModificationException
    //   8891	8898	8898	finally
    //   8891	8898	8891	finally
    //   8891	8898	8891	finally
    //   8892	8898	8891	java/lang/IllegalStateException
    //   8892	8898	3	java/lang/IllegalArgumentException
    //   9271	9278	9278	finally
    //   9271	9278	9278	finally
    //   9272	9278	9271	java/lang/AssertionError
    //   9272	9278	9278	finally
    //   9272	9278	3	java/lang/RuntimeException
    //   9344	9350	9350	finally
    //   9344	9350	9350	java/lang/AssertionError
    //   9344	9350	3	finally
    //   9344	9350	3	finally
    //   9344	9350	3	java/lang/ClassCastException
    //   9724	9730	9730	finally
    //   9724	9730	9730	finally
    //   9724	9730	3	java/util/NoSuchElementException
    //   9724	9730	9730	java/lang/RuntimeException
    //   9724	9730	3	java/lang/ClassCastException
    //   9795	9802	9802	finally
    //   9795	9802	9802	java/util/NoSuchElementException
    //   9796	9802	9802	java/lang/RuntimeException
    //   9796	9802	9795	java/lang/IllegalArgumentException
    //   9796	9802	3	java/lang/NumberFormatException
    //   10175	10182	10182	finally
    //   10175	10182	3	finally
    //   10175	10182	3	finally
    //   10175	10182	10175	finally
    //   10176	10182	10175	finally
    //   10248	10254	10254	finally
    //   10248	10254	3	java/lang/ClassCastException
    //   10248	10254	10254	java/lang/ArithmeticException
    //   10248	10254	3	finally
    //   10248	10254	10254	java/lang/ArrayIndexOutOfBoundsException
    //   10559	10566	10566	finally
    //   10559	10566	10559	finally
    //   10559	10566	3	java/lang/ArrayIndexOutOfBoundsException
    //   10560	10566	10559	finally
    //   10560	10566	3	java/lang/ClassCastException
    //   11127	11134	11134	finally
    //   11127	11134	11127	java/lang/IllegalArgumentException
    //   11127	11134	11134	finally
    //   11127	11134	11127	java/lang/AssertionError
    //   11128	11134	11134	finally
    //   11199	11206	11206	finally
    //   11199	11206	11199	finally
    //   11200	11206	3	java/util/ConcurrentModificationException
    //   11200	11206	11206	finally
    //   11200	11206	11199	java/lang/StringIndexOutOfBoundsException
    //   11519	11526	11526	finally
    //   11519	11526	11519	java/lang/IllegalArgumentException
    //   11519	11526	3	finally
    //   11519	11526	11526	java/lang/EnumConstantNotPresentException
    //   11520	11526	3	java/lang/ClassCastException
    //   12107	12114	12114	finally
    //   12108	12114	12107	finally
    //   12108	12114	3	java/lang/NumberFormatException
    //   12108	12114	12107	finally
    //   12108	12114	12107	java/lang/EnumConstantNotPresentException
    //   12487	12494	12494	finally
    //   12487	12494	3	java/lang/IllegalStateException
    //   12487	12494	12494	java/lang/NegativeArraySizeException
    //   12487	12494	3	finally
    //   12488	12494	12487	finally
    //   12863	12870	12870	finally
    //   12863	12870	12870	java/util/ConcurrentModificationException
    //   12864	12870	3	finally
    //   12864	12870	12863	finally
    //   12864	12870	12863	java/util/NoSuchElementException
    //   13427	13434	13434	finally
    //   13427	13434	13427	finally
    //   13427	13434	13427	java/lang/ArrayIndexOutOfBoundsException
    //   13427	13434	3	finally
    //   13428	13434	3	finally
    //   13807	13814	13814	finally
    //   13807	13814	3	finally
    //   13807	13814	13807	finally
    //   13808	13814	13814	java/lang/ClassCastException
    //   13808	13814	13814	java/lang/NumberFormatException
    //   14183	14190	14190	finally
    //   14183	14190	14183	finally
    //   14183	14190	3	finally
    //   14183	14190	3	java/lang/ClassCastException
    //   14184	14190	14190	finally
    //   14747	14754	14754	finally
    //   14747	14754	3	finally
    //   14747	14754	14747	java/lang/NullPointerException
    //   14748	14754	3	java/util/ConcurrentModificationException
    //   14748	14754	3	java/util/ConcurrentModificationException
    //   15127	15134	15134	finally
    //   15127	15134	15127	finally
    //   15127	15134	15127	finally
    //   15127	15134	3	java/lang/AssertionError
    //   15127	15134	15127	finally
    //   15504	15510	15510	finally
    //   15504	15510	3	java/lang/ArithmeticException
    //   15504	15510	3	java/lang/ArithmeticException
    //   15504	15510	15510	finally
    //   15504	15510	3	finally
    //   15827	15834	15834	finally
    //   15827	15834	3	java/util/ConcurrentModificationException
    //   15827	15834	15827	java/lang/StringIndexOutOfBoundsException
    //   15828	15834	15827	java/lang/IllegalStateException
    //   15828	15834	15834	java/lang/NegativeArraySizeException
    //   15903	15910	15910	finally
    //   15903	15910	3	finally
    //   15904	15910	15910	java/lang/UnsupportedOperationException
    //   15904	15910	15903	java/lang/AssertionError
    //   15904	15910	3	finally
    //   16151	16160	16160	finally
    //   16151	16160	3	java/lang/IllegalArgumentException
    //   16151	16160	16151	finally
    //   16152	16160	16160	java/lang/IllegalArgumentException
    //   16152	16160	16151	java/lang/UnsupportedOperationException
    //   16467	16474	16474	finally
    //   16467	16474	3	java/lang/RuntimeException
    //   16467	16474	16467	java/lang/NullPointerException
    //   16467	16474	16474	java/lang/AssertionError
    //   16468	16474	16474	finally
    //   16599	16606	16606	finally
    //   16599	16606	3	finally
    //   16600	16606	16599	java/lang/NegativeArraySizeException
    //   16600	16606	16599	finally
    //   16600	16606	16606	finally
    //   17263	17271	17263	finally
    //   17279	17281	3	finally
  }
  
  public static boolean lambda$doOffhand$3(ItemStack paramItemStack) {
    return Perry1.0w(null, (int)1611761136L ^ 0x36A8B87A, paramItemStack);
  }
  
  public static Offhand getInstance() {
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
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public Offhand() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w -1083822254
    //   9: l2i
    //   10: ldc_w -284364660
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 95285559
    //   20: l2i
    //   21: ldc_w -380151410
    //   24: ixor
    //   25: ldc2_w -27787042
    //   28: l2i
    //   29: ldc_w -219795609
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, 1417237719 -> 17, 1557459047 -> 6412
    //   60: aload_0
    //   61: ldc_w '㌆㶸喂ࢂ๭鮁蹮'
    //   64: getstatic Perryc.0 : I
    //   67: ifle -> 81
    //   70: ldc2_w -444039681
    //   73: l2i
    //   74: ldc_w -1726556068
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 482428324
    //   84: l2i
    //   85: ldc_w -1880819796
    //   88: ixor
    //   89: ldc2_w 918224046
    //   92: l2i
    //   93: ldc_w -1832694540
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 6340, -655944199 -> 81, 928776786 -> 124
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '㌟㶸喡ู࢞鮝蹬ढ़庪ਲ਼⯾無趭筃辖㸰ꝭ䢖榚侤ಮ䛾੹눃ᣛ䌸⤕虮荰摳肑㘶桦诞央'
    //   130: getstatic Perryc.c : I
    //   133: iflt -> 147
    //   136: ldc2_w -1629253215
    //   139: l2i
    //   140: ldc_w -393556615
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w -1017593770
    //   150: l2i
    //   151: ldc_w -56530112
    //   154: ixor
    //   155: ldc2_w 991663300
    //   158: l2i
    //   159: ldc_w 1280624387
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 192, 19271455 -> 6348, 1781243806 -> 147
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.c : I
    //   198: iflt -> 212
    //   201: ldc2_w 517749898
    //   204: l2i
    //   205: ldc_w 689540189
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w 1314895913
    //   215: l2i
    //   216: ldc_w 2046067866
    //   219: ixor
    //   220: ldc2_w -1650930448
    //   223: l2i
    //   224: ldc_w 2147013544
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 256, -838776721 -> 212, -710561905 -> 6308
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w 1623688958
    //   262: l2i
    //   263: ldc_w 1623688959
    //   266: ixor
    //   267: ldc2_w -1185514010
    //   270: l2i
    //   271: ldc_w -1185514009
    //   274: ixor
    //   275: ldc2_w 1579624159
    //   278: l2i
    //   279: ldc_w 1579624159
    //   282: ixor
    //   283: getstatic Perryc.c : I
    //   286: iflt -> 300
    //   289: ldc2_w -1552355434
    //   292: l2i
    //   293: ldc_w 2004192647
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w -1736829228
    //   303: l2i
    //   304: ldc_w -996154813
    //   307: ixor
    //   308: ldc2_w -956944430
    //   311: l2i
    //   312: ldc_w 797080401
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 344, 1031354002 -> 6436, 1284910549 -> 300
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.0 : I
    //   350: ifle -> 364
    //   353: ldc2_w -161138235
    //   356: l2i
    //   357: ldc_w 2030865342
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w 1528184635
    //   367: l2i
    //   368: ldc_w 1266669537
    //   371: ixor
    //   372: ldc2_w 1880308995
    //   375: l2i
    //   376: ldc_w -904546695
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, 416067597 -> 364, 896481537 -> 6366
    //   408: aload_0
    //   409: new java/util/concurrent/ConcurrentLinkedQueue
    //   412: dup
    //   413: getstatic Perryc.c : I
    //   416: iflt -> 430
    //   419: ldc2_w 1131576576
    //   422: l2i
    //   423: ldc_w 1045106390
    //   426: ixor
    //   427: goto -> 438
    //   430: ldc2_w 92467202
    //   433: l2i
    //   434: ldc_w -30829314
    //   437: ixor
    //   438: ldc2_w -266144602
    //   441: l2i
    //   442: ldc_w 2063540923
    //   445: ixor
    //   446: ixor
    //   447: lookupswitch default -> 472, -136010293 -> 6280, 1535620790 -> 430
    //   472: invokespecial <init> : ()V
    //   475: getstatic Perryc.0 : I
    //   478: ifle -> 492
    //   481: ldc2_w 1668530492
    //   484: l2i
    //   485: ldc_w -1796223089
    //   488: ixor
    //   489: goto -> 500
    //   492: ldc2_w -1128256304
    //   495: l2i
    //   496: ldc_w 1004198778
    //   499: ixor
    //   500: ldc2_w -1265717143
    //   503: l2i
    //   504: ldc_w 697988158
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 536, 1285564802 -> 492, 1787349732 -> 6336
    //   536: putfield taskList : Ljava/util/Queue;
    //   539: getstatic Perryc.0 : I
    //   542: ifle -> 556
    //   545: ldc2_w -797683875
    //   548: l2i
    //   549: ldc_w 2048293956
    //   552: ixor
    //   553: goto -> 564
    //   556: ldc2_w 1754262127
    //   559: l2i
    //   560: ldc_w 2121104512
    //   563: ixor
    //   564: ldc2_w 813311875
    //   567: l2i
    //   568: ldc_w 1160001326
    //   571: ixor
    //   572: ixor
    //   573: lookupswitch default -> 600, -549706828 -> 6328, 442019718 -> 556
    //   600: aload_0
    //   601: new bigname/zprestige/webhack/util/Timer
    //   604: dup
    //   605: getstatic Perryc.1 : I
    //   608: ifeq -> 622
    //   611: ldc2_w 1792007863
    //   614: l2i
    //   615: ldc_w 799227170
    //   618: ixor
    //   619: goto -> 630
    //   622: ldc2_w 1771602831
    //   625: l2i
    //   626: ldc_w 2146143617
    //   629: ixor
    //   630: ldc2_w 1013951568
    //   633: l2i
    //   634: ldc_w -1047743978
    //   637: ixor
    //   638: ixor
    //   639: lookupswitch default -> 664, -1198522925 -> 6312, -157015457 -> 622
    //   664: invokespecial <init> : ()V
    //   667: getstatic Perryc.c : I
    //   670: iflt -> 684
    //   673: ldc2_w 742762289
    //   676: l2i
    //   677: ldc_w -1230278309
    //   680: ixor
    //   681: goto -> 692
    //   684: ldc2_w 5753404
    //   687: l2i
    //   688: ldc_w 1388715211
    //   691: ixor
    //   692: ldc2_w -389284430
    //   695: l2i
    //   696: ldc_w -1114172920
    //   699: ixor
    //   700: ixor
    //   701: lookupswitch default -> 728, -1708310924 -> 684, -810403376 -> 6304
    //   728: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   731: getstatic Perryc.0 : I
    //   734: ifle -> 748
    //   737: ldc2_w -1530615393
    //   740: l2i
    //   741: ldc_w 531027499
    //   744: ixor
    //   745: goto -> 756
    //   748: ldc2_w -1002521752
    //   751: l2i
    //   752: ldc_w 307697913
    //   755: ixor
    //   756: ldc2_w 1563705977
    //   759: l2i
    //   760: ldc_w -39306493
    //   763: ixor
    //   764: ixor
    //   765: lookupswitch default -> 6332, 469632718 -> 748, 1995823851 -> 792
    //   792: aload_0
    //   793: new bigname/zprestige/webhack/util/Timer
    //   796: dup
    //   797: getstatic Perryc.0 : I
    //   800: ifle -> 814
    //   803: ldc2_w -2138379317
    //   806: l2i
    //   807: ldc_w -378030256
    //   810: ixor
    //   811: goto -> 822
    //   814: ldc2_w 593914910
    //   817: l2i
    //   818: ldc_w -687319252
    //   821: ixor
    //   822: ldc2_w -647508414
    //   825: l2i
    //   826: ldc_w -259015357
    //   829: ixor
    //   830: ixor
    //   831: lookupswitch default -> 856, -431933782 -> 814, 1075130266 -> 6438
    //   856: invokespecial <init> : ()V
    //   859: getstatic Perryc.0 : I
    //   862: ifle -> 876
    //   865: ldc2_w -730086973
    //   868: l2i
    //   869: ldc_w 1176894963
    //   872: ixor
    //   873: goto -> 884
    //   876: ldc2_w 1674930377
    //   879: l2i
    //   880: ldc_w 1235106731
    //   883: ixor
    //   884: ldc2_w 295466588
    //   887: l2i
    //   888: ldc_w 617950054
    //   891: ixor
    //   892: ixor
    //   893: lookupswitch default -> 920, -1491640054 -> 6384, 178291177 -> 876
    //   920: putfield secondTimer : Lbigname/zprestige/webhack/util/Timer;
    //   923: getstatic Perryc.0 : I
    //   926: ifle -> 940
    //   929: ldc2_w 44960507
    //   932: l2i
    //   933: ldc_w -1052766105
    //   936: ixor
    //   937: goto -> 948
    //   940: ldc2_w -749760755
    //   943: l2i
    //   944: ldc_w 336725013
    //   947: ixor
    //   948: ldc2_w -1591042264
    //   951: l2i
    //   952: ldc_w -1635177339
    //   955: ixor
    //   956: ixor
    //   957: lookupswitch default -> 6462, -117557067 -> 984, -62019279 -> 940
    //   984: aload_0
    //   985: getstatic Perryc.1 : I
    //   988: ifeq -> 1002
    //   991: ldc2_w -1513124272
    //   994: l2i
    //   995: ldc_w -288130216
    //   998: ixor
    //   999: goto -> 1010
    //   1002: ldc2_w 1827504566
    //   1005: l2i
    //   1006: ldc_w 156458966
    //   1009: ixor
    //   1010: ldc2_w 499282924
    //   1013: l2i
    //   1014: ldc_w 1418609536
    //   1017: ixor
    //   1018: ixor
    //   1019: lookupswitch default -> 6324, 38847844 -> 1002, 754118156 -> 1044
    //   1044: aload_0
    //   1045: new bigname/zprestige/webhack/features/setting/Setting
    //   1048: dup
    //   1049: ldc_w '㌁㶤喢ࢌ๵'
    //   1052: getstatic Perryc.c : I
    //   1055: iflt -> 1069
    //   1058: ldc2_w -1615950175
    //   1061: l2i
    //   1062: ldc_w 1869999345
    //   1065: ixor
    //   1066: goto -> 1077
    //   1069: ldc2_w -1858853412
    //   1072: l2i
    //   1073: ldc_w 1070854627
    //   1076: ixor
    //   1077: ldc2_w 857510521
    //   1080: l2i
    //   1081: ldc_w 568461873
    //   1084: ixor
    //   1085: ixor
    //   1086: lookupswitch default -> 6440, -1139192713 -> 1112, -500827624 -> 1069
    //   1112: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1115: ldc2_w -1206747849
    //   1118: l2i
    //   1119: ldc_w -1206747850
    //   1122: ixor
    //   1123: getstatic Perryc.c : I
    //   1126: iflt -> 1140
    //   1129: ldc2_w 1273620718
    //   1132: l2i
    //   1133: ldc_w -79539154
    //   1136: ixor
    //   1137: goto -> 1148
    //   1140: ldc2_w -1154493214
    //   1143: l2i
    //   1144: ldc_w -1313559470
    //   1147: ixor
    //   1148: ldc2_w -1983332629
    //   1151: l2i
    //   1152: ldc_w 845968989
    //   1155: ixor
    //   1156: ixor
    //   1157: lookupswitch default -> 6292, -1321226234 -> 1184, 185562230 -> 1140
    //   1184: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1187: getstatic Perryc.1 : I
    //   1190: ifeq -> 1204
    //   1193: ldc2_w -190050387
    //   1196: l2i
    //   1197: ldc_w 2046712885
    //   1200: ixor
    //   1201: goto -> 1212
    //   1204: ldc2_w -337867527
    //   1207: l2i
    //   1208: ldc_w 1351426928
    //   1211: ixor
    //   1212: ldc2_w -913231717
    //   1215: l2i
    //   1216: ldc_w -1005754140
    //   1219: ixor
    //   1220: ixor
    //   1221: lookupswitch default -> 1248, -2133980185 -> 6434, 894135215 -> 1204
    //   1248: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1251: getstatic Perryc.1 : I
    //   1254: ifeq -> 1268
    //   1257: ldc2_w -1974898853
    //   1260: l2i
    //   1261: ldc_w 1926451275
    //   1264: ixor
    //   1265: goto -> 1276
    //   1268: ldc2_w 1499275496
    //   1271: l2i
    //   1272: ldc_w -2092522776
    //   1275: ixor
    //   1276: ldc2_w -1988004448
    //   1279: l2i
    //   1280: ldc_w 689862547
    //   1283: ixor
    //   1284: ixor
    //   1285: lookupswitch default -> 6300, 1476738339 -> 1268, 2055503923 -> 1312
    //   1312: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1315: getstatic Perryc.1 : I
    //   1318: ifeq -> 1332
    //   1321: ldc2_w -968753634
    //   1324: l2i
    //   1325: ldc_w -277986481
    //   1328: ixor
    //   1329: goto -> 1340
    //   1332: ldc2_w 1692263273
    //   1335: l2i
    //   1336: ldc_w -710280812
    //   1339: ixor
    //   1340: ldc2_w -940490212
    //   1343: l2i
    //   1344: ldc_w 2015087319
    //   1347: ixor
    //   1348: ixor
    //   1349: lookupswitch default -> 6284, -1765460582 -> 1332, 245273142 -> 1376
    //   1376: putfield crystal : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1379: getstatic Perryc.0 : I
    //   1382: ifle -> 1396
    //   1385: ldc2_w -1847746186
    //   1388: l2i
    //   1389: ldc_w 1207974723
    //   1392: ixor
    //   1393: goto -> 1404
    //   1396: ldc2_w 1563348188
    //   1399: l2i
    //   1400: ldc_w -217916070
    //   1403: ixor
    //   1404: ldc2_w 1200573216
    //   1407: l2i
    //   1408: ldc_w 1901050464
    //   1411: ixor
    //   1412: ixor
    //   1413: lookupswitch default -> 6370, -1729306426 -> 1440, -283284619 -> 1396
    //   1440: aload_0
    //   1441: getstatic Perryc.1 : I
    //   1444: ifeq -> 1458
    //   1447: ldc2_w 544416531
    //   1450: l2i
    //   1451: ldc_w 1794269374
    //   1454: ixor
    //   1455: goto -> 1466
    //   1458: ldc2_w 1974308474
    //   1461: l2i
    //   1462: ldc_w -1339645449
    //   1465: ixor
    //   1466: ldc2_w -960736296
    //   1469: l2i
    //   1470: ldc_w -1348433288
    //   1473: ixor
    //   1474: ixor
    //   1475: lookupswitch default -> 1500, 597531149 -> 6388, 1130121800 -> 1458
    //   1500: aload_0
    //   1501: new bigname/zprestige/webhack/features/setting/Setting
    //   1504: dup
    //   1505: ldc_w '㌁㶤喢ࢌ๵鮬蹓'
    //   1508: getstatic Perryc.c : I
    //   1511: iflt -> 1525
    //   1514: ldc2_w -236988291
    //   1517: l2i
    //   1518: ldc_w 128000654
    //   1521: ixor
    //   1522: goto -> 1533
    //   1525: ldc2_w 1021026512
    //   1528: l2i
    //   1529: ldc_w -1540264284
    //   1532: ixor
    //   1533: ldc2_w 1434708751
    //   1536: l2i
    //   1537: ldc_w 1655349857
    //   1540: ixor
    //   1541: ixor
    //   1542: lookupswitch default -> 6358, -1346140390 -> 1568, -1051216995 -> 1525
    //   1568: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1571: ldc_w 0.2084117
    //   1574: invokestatic floatToIntBits : (F)I
    //   1577: ldc_w 2131061216
    //   1580: ixor
    //   1581: invokestatic intBitsToFloat : (I)F
    //   1584: getstatic Perryc.1 : I
    //   1587: ifeq -> 1601
    //   1590: ldc2_w -508817326
    //   1593: l2i
    //   1594: ldc_w 959155046
    //   1597: ixor
    //   1598: goto -> 1609
    //   1601: ldc2_w -1146667706
    //   1604: l2i
    //   1605: ldc_w 1410501805
    //   1608: ixor
    //   1609: ldc2_w -783975266
    //   1612: l2i
    //   1613: ldc_w 2039543701
    //   1616: ixor
    //   1617: ixor
    //   1618: lookupswitch default -> 6276, 1197488864 -> 1644, 1884426303 -> 1601
    //   1644: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1647: ldc_w 100.15918
    //   1650: invokestatic floatToIntBits : (F)I
    //   1653: ldc_w 2131008845
    //   1656: ixor
    //   1657: invokestatic intBitsToFloat : (I)F
    //   1660: getstatic Perryc.1 : I
    //   1663: ifeq -> 1677
    //   1666: ldc2_w 786805344
    //   1669: l2i
    //   1670: ldc_w 582092466
    //   1673: ixor
    //   1674: goto -> 1685
    //   1677: ldc2_w 1227302423
    //   1680: l2i
    //   1681: ldc_w 1736858494
    //   1684: ixor
    //   1685: ldc2_w 695687274
    //   1688: l2i
    //   1689: ldc_w -574172213
    //   1692: ixor
    //   1693: ixor
    //   1694: lookupswitch default -> 6360, -636422456 -> 1720, -119128205 -> 1677
    //   1720: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1723: ldc_w 1.4027213
    //   1726: invokestatic floatToIntBits : (F)I
    //   1729: ldc_w 2107870303
    //   1732: ixor
    //   1733: invokestatic intBitsToFloat : (I)F
    //   1736: getstatic Perryc.1 : I
    //   1739: ifeq -> 1753
    //   1742: ldc2_w 22360775
    //   1745: l2i
    //   1746: ldc_w 1088981015
    //   1749: ixor
    //   1750: goto -> 1761
    //   1753: ldc2_w -317893892
    //   1756: l2i
    //   1757: ldc_w -1525908617
    //   1760: ixor
    //   1761: ldc2_w 1368907776
    //   1764: l2i
    //   1765: ldc_w 743635343
    //   1768: ixor
    //   1769: ixor
    //   1770: lookupswitch default -> 6338, 902049796 -> 1796, 1014539103 -> 1753
    //   1796: invokestatic valueOf : (F)Ljava/lang/Float;
    //   1799: getstatic Perryc.c : I
    //   1802: iflt -> 1816
    //   1805: ldc2_w -2103871361
    //   1808: l2i
    //   1809: ldc_w 273062348
    //   1812: ixor
    //   1813: goto -> 1824
    //   1816: ldc2_w -193986413
    //   1819: l2i
    //   1820: ldc_w -1434152767
    //   1823: ixor
    //   1824: ldc2_w -1877570852
    //   1827: l2i
    //   1828: ldc_w -1436945301
    //   1831: ixor
    //   1832: ixor
    //   1833: lookupswitch default -> 6330, -1466917116 -> 1816, 1690037989 -> 1860
    //   1860: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1863: getstatic Perryc.0 : I
    //   1866: ifle -> 1880
    //   1869: ldc2_w -1851862278
    //   1872: l2i
    //   1873: ldc_w 673081067
    //   1876: ixor
    //   1877: goto -> 1888
    //   1880: ldc2_w -1970268332
    //   1883: l2i
    //   1884: ldc_w 1624006193
    //   1887: ixor
    //   1888: ldc2_w 1533470908
    //   1891: l2i
    //   1892: ldc_w -1229980360
    //   1895: ixor
    //   1896: ixor
    //   1897: lookupswitch default -> 1924, 1414111637 -> 6310, 1998703551 -> 1880
    //   1924: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1927: getstatic Perryc.1 : I
    //   1930: ifeq -> 1944
    //   1933: ldc2_w 533270690
    //   1936: l2i
    //   1937: ldc_w 1112101597
    //   1940: ixor
    //   1941: goto -> 1952
    //   1944: ldc2_w 667068977
    //   1947: l2i
    //   1948: ldc_w 298555760
    //   1951: ixor
    //   1952: ldc2_w -1453980446
    //   1955: l2i
    //   1956: ldc_w 642754705
    //   1959: ixor
    //   1960: ixor
    //   1961: lookupswitch default -> 6396, -1190093006 -> 1988, -761663988 -> 1944
    //   1988: putfield crystalHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1991: getstatic Perryc.1 : I
    //   1994: ifeq -> 2008
    //   1997: ldc2_w 2038329108
    //   2000: l2i
    //   2001: ldc_w -2060349060
    //   2004: ixor
    //   2005: goto -> 2016
    //   2008: ldc2_w -1828751936
    //   2011: l2i
    //   2012: ldc_w 1150255769
    //   2015: ixor
    //   2016: ldc2_w -1800950055
    //   2019: l2i
    //   2020: ldc_w -205675178
    //   2023: ixor
    //   2024: ixor
    //   2025: lookupswitch default -> 6368, -1688865305 -> 2008, -1318388522 -> 2052
    //   2052: aload_0
    //   2053: getstatic Perryc.c : I
    //   2056: iflt -> 2070
    //   2059: ldc2_w 15501776
    //   2062: l2i
    //   2063: ldc_w 2055928904
    //   2066: ixor
    //   2067: goto -> 2078
    //   2070: ldc2_w -912964667
    //   2073: l2i
    //   2074: ldc_w 455126659
    //   2077: ixor
    //   2078: ldc2_w 2069969225
    //   2081: l2i
    //   2082: ldc_w 480133226
    //   2085: ixor
    //   2086: ixor
    //   2087: lookupswitch default -> 2112, 181246209 -> 2070, 496569531 -> 6444
    //   2112: aload_0
    //   2113: new bigname/zprestige/webhack/features/setting/Setting
    //   2116: dup
    //   2117: ldc_w '㌁㶤喢ࢌ๵鮬蹬ॄ廯ਏ⯁'
    //   2120: getstatic Perryc.0 : I
    //   2123: ifle -> 2137
    //   2126: ldc2_w 888843545
    //   2129: l2i
    //   2130: ldc_w 586896438
    //   2133: ixor
    //   2134: goto -> 2145
    //   2137: ldc2_w 1173983426
    //   2140: l2i
    //   2141: ldc_w 1867947051
    //   2144: ixor
    //   2145: ldc2_w -1895543321
    //   2148: l2i
    //   2149: ldc_w -995431496
    //   2152: ixor
    //   2153: ixor
    //   2154: lookupswitch default -> 6420, 1571774320 -> 2137, 1627499190 -> 2180
    //   2180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2183: ldc_w 0.59584016
    //   2186: invokestatic floatToIntBits : (F)I
    //   2189: ldc_w 2138605819
    //   2192: ixor
    //   2193: invokestatic intBitsToFloat : (I)F
    //   2196: getstatic Perryc.1 : I
    //   2199: ifeq -> 2213
    //   2202: ldc2_w 13697759
    //   2205: l2i
    //   2206: ldc_w 1592434531
    //   2209: ixor
    //   2210: goto -> 2221
    //   2213: ldc2_w 1957834392
    //   2216: l2i
    //   2217: ldc_w 1567620493
    //   2220: ixor
    //   2221: ldc2_w -751290797
    //   2224: l2i
    //   2225: ldc_w -981157086
    //   2228: ixor
    //   2229: ixor
    //   2230: lookupswitch default -> 2256, 702595629 -> 2213, 1216811213 -> 6410
    //   2256: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2259: ldc_w 83.485985
    //   2262: invokestatic floatToIntBits : (F)I
    //   2265: ldc_w 2137666590
    //   2268: ixor
    //   2269: invokestatic intBitsToFloat : (I)F
    //   2272: getstatic Perryc.1 : I
    //   2275: ifeq -> 2289
    //   2278: ldc2_w 1986195911
    //   2281: l2i
    //   2282: ldc_w 2092107070
    //   2285: ixor
    //   2286: goto -> 2297
    //   2289: ldc2_w -1333377885
    //   2292: l2i
    //   2293: ldc_w -1400408773
    //   2296: ixor
    //   2297: ldc2_w 791960159
    //   2300: l2i
    //   2301: ldc_w -790795192
    //   2304: ixor
    //   2305: ixor
    //   2306: lookupswitch default -> 2332, -180829458 -> 6342, -64162427 -> 2289
    //   2332: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2335: ldc_w 0.046998587
    //   2338: invokestatic floatToIntBits : (F)I
    //   2341: ldc_w 2135982487
    //   2344: ixor
    //   2345: invokestatic intBitsToFloat : (I)F
    //   2348: getstatic Perryc.c : I
    //   2351: iflt -> 2365
    //   2354: ldc2_w 1662117993
    //   2357: l2i
    //   2358: ldc_w -636320104
    //   2361: ixor
    //   2362: goto -> 2373
    //   2365: ldc2_w -1447680840
    //   2368: l2i
    //   2369: ldc_w -1235368157
    //   2372: ixor
    //   2373: ldc2_w -2026056712
    //   2376: l2i
    //   2377: ldc_w 303583836
    //   2380: ixor
    //   2381: ixor
    //   2382: lookupswitch default -> 6286, -1966120385 -> 2408, 740814677 -> 2365
    //   2408: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2411: getstatic Perryc.c : I
    //   2414: iflt -> 2428
    //   2417: ldc2_w -1502369770
    //   2420: l2i
    //   2421: ldc_w -852454022
    //   2424: ixor
    //   2425: goto -> 2436
    //   2428: ldc2_w -1940097686
    //   2431: l2i
    //   2432: ldc_w -1529460145
    //   2435: ixor
    //   2436: ldc2_w 847220055
    //   2439: l2i
    //   2440: ldc_w 245145850
    //   2443: ixor
    //   2444: ixor
    //   2445: lookupswitch default -> 6296, 342430344 -> 2472, 1470107841 -> 2428
    //   2472: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   2475: getstatic Perryc.0 : I
    //   2478: ifle -> 2492
    //   2481: ldc2_w -2063621178
    //   2484: l2i
    //   2485: ldc_w 1711167835
    //   2488: ixor
    //   2489: goto -> 2500
    //   2492: ldc2_w -2109928021
    //   2495: l2i
    //   2496: ldc_w 1406945839
    //   2499: ixor
    //   2500: ldc2_w 514496033
    //   2503: l2i
    //   2504: ldc_w -897442859
    //   2507: ixor
    //   2508: ixor
    //   2509: lookupswitch default -> 2536, -668706978 -> 2492, 891909993 -> 6418
    //   2536: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2539: getstatic Perryc.0 : I
    //   2542: ifle -> 2556
    //   2545: ldc2_w 1795982128
    //   2548: l2i
    //   2549: ldc_w 221660259
    //   2552: ixor
    //   2553: goto -> 2564
    //   2556: ldc2_w 270439470
    //   2559: l2i
    //   2560: ldc_w -1670161580
    //   2563: ixor
    //   2564: ldc2_w -1652110096
    //   2567: l2i
    //   2568: ldc_w -1171233826
    //   2571: ixor
    //   2572: ixor
    //   2573: lookupswitch default -> 2600, 1099720829 -> 6382, 1623451048 -> 2556
    //   2600: putfield crystalHoleHealth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2603: getstatic Perryc.1 : I
    //   2606: ifeq -> 2620
    //   2609: ldc2_w 161779838
    //   2612: l2i
    //   2613: ldc_w -1779843753
    //   2616: ixor
    //   2617: goto -> 2628
    //   2620: ldc2_w -1078790269
    //   2623: l2i
    //   2624: ldc_w -1916991135
    //   2627: ixor
    //   2628: ldc2_w -738800521
    //   2631: l2i
    //   2632: ldc_w -115508500
    //   2635: ixor
    //   2636: ixor
    //   2637: lookupswitch default -> 2664, -2136867943 -> 2620, -1230595150 -> 6386
    //   2664: aload_0
    //   2665: getstatic Perryc.1 : I
    //   2668: ifeq -> 2682
    //   2671: ldc2_w 1082678507
    //   2674: l2i
    //   2675: ldc_w 1285861814
    //   2678: ixor
    //   2679: goto -> 2690
    //   2682: ldc2_w -656874465
    //   2685: l2i
    //   2686: ldc_w 1293264183
    //   2689: ixor
    //   2690: ldc2_w -578322068
    //   2693: l2i
    //   2694: ldc_w -692042851
    //   2697: ixor
    //   2698: ixor
    //   2699: lookupswitch default -> 6290, -1635089447 -> 2724, 124465068 -> 2682
    //   2724: aload_0
    //   2725: new bigname/zprestige/webhack/features/setting/Setting
    //   2728: dup
    //   2729: ldc_w '㌒㶧喺࢈'
    //   2732: getstatic Perryc.0 : I
    //   2735: ifle -> 2749
    //   2738: ldc2_w 806061690
    //   2741: l2i
    //   2742: ldc_w -1847023451
    //   2745: ixor
    //   2746: goto -> 2757
    //   2749: ldc2_w -2106496794
    //   2752: l2i
    //   2753: ldc_w 1955052588
    //   2756: ixor
    //   2757: ldc2_w -179084755
    //   2760: l2i
    //   2761: ldc_w 834069595
    //   2764: ixor
    //   2765: ixor
    //   2766: lookupswitch default -> 2792, 1290099307 -> 2749, 1694935209 -> 6456
    //   2792: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2795: ldc2_w 945012715
    //   2798: l2i
    //   2799: ldc_w 945012714
    //   2802: ixor
    //   2803: getstatic Perryc.c : I
    //   2806: iflt -> 2820
    //   2809: ldc2_w -1943378410
    //   2812: l2i
    //   2813: ldc_w -1901828048
    //   2816: ixor
    //   2817: goto -> 2828
    //   2820: ldc2_w 478421589
    //   2823: l2i
    //   2824: ldc_w -1309654032
    //   2827: ixor
    //   2828: ldc2_w 941695618
    //   2831: l2i
    //   2832: ldc_w 1621578264
    //   2835: ixor
    //   2836: ixor
    //   2837: lookupswitch default -> 2864, -1764343289 -> 2820, 1510506172 -> 6344
    //   2864: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2867: getstatic Perryc.0 : I
    //   2870: ifle -> 2884
    //   2873: ldc2_w -190738753
    //   2876: l2i
    //   2877: ldc_w 1430670129
    //   2880: ixor
    //   2881: goto -> 2892
    //   2884: ldc2_w 266214668
    //   2887: l2i
    //   2888: ldc_w -1671274936
    //   2891: ixor
    //   2892: ldc2_w -1237253346
    //   2895: l2i
    //   2896: ldc_w -186558073
    //   2899: ixor
    //   2900: ixor
    //   2901: lookupswitch default -> 2928, -1662524621 -> 2884, -481845481 -> 6406
    //   2928: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2931: getstatic Perryc.1 : I
    //   2934: ifeq -> 2948
    //   2937: ldc2_w 28757655
    //   2940: l2i
    //   2941: ldc_w 423256090
    //   2944: ixor
    //   2945: goto -> 2956
    //   2948: ldc2_w -2032603430
    //   2951: l2i
    //   2952: ldc_w -868136952
    //   2955: ixor
    //   2956: ldc2_w 259847420
    //   2959: l2i
    //   2960: ldc_w 1392979041
    //   2963: ixor
    //   2964: ixor
    //   2965: lookupswitch default -> 2992, -1227587346 -> 2948, 1157068304 -> 6392
    //   2992: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2995: getstatic Perryc.c : I
    //   2998: iflt -> 3012
    //   3001: ldc2_w 1820438834
    //   3004: l2i
    //   3005: ldc_w 1212935306
    //   3008: ixor
    //   3009: goto -> 3020
    //   3012: ldc2_w 279294069
    //   3015: l2i
    //   3016: ldc_w -725943455
    //   3019: ixor
    //   3020: ldc2_w -317690593
    //   3023: l2i
    //   3024: ldc_w 186537545
    //   3027: ixor
    //   3028: ixor
    //   3029: lookupswitch default -> 3056, -1678094357 -> 3012, -1027315986 -> 6458
    //   3056: putfield gapple : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3059: getstatic Perryc.1 : I
    //   3062: ifeq -> 3076
    //   3065: ldc2_w 236614308
    //   3068: l2i
    //   3069: ldc_w 2019121066
    //   3072: ixor
    //   3073: goto -> 3084
    //   3076: ldc2_w 1498351206
    //   3079: l2i
    //   3080: ldc_w 360003523
    //   3083: ixor
    //   3084: ldc2_w 1406094323
    //   3087: l2i
    //   3088: ldc_w -790896216
    //   3091: ixor
    //   3092: ixor
    //   3093: lookupswitch default -> 6354, -819028994 -> 3120, -178811051 -> 3076
    //   3120: aload_0
    //   3121: getstatic Perryc.1 : I
    //   3124: ifeq -> 3138
    //   3127: ldc2_w 188354531
    //   3130: l2i
    //   3131: ldc_w 1259312900
    //   3134: ixor
    //   3135: goto -> 3146
    //   3138: ldc2_w -1919477972
    //   3141: l2i
    //   3142: ldc_w -559049248
    //   3145: ixor
    //   3146: ldc2_w 2513120
    //   3149: l2i
    //   3150: ldc_w -738332561
    //   3153: ixor
    //   3154: ixor
    //   3155: lookupswitch default -> 3180, -1813106584 -> 6450, -102399545 -> 3138
    //   3180: aload_0
    //   3181: new bigname/zprestige/webhack/features/setting/Setting
    //   3184: dup
    //   3185: ldc_w '㌁㶸喤ࢮ๱鮁蹠ृ'
    //   3188: getstatic Perryc.1 : I
    //   3191: ifeq -> 3205
    //   3194: ldc2_w 1088127769
    //   3197: l2i
    //   3198: ldc_w -1049010729
    //   3201: ixor
    //   3202: goto -> 3213
    //   3205: ldc2_w -280634808
    //   3208: l2i
    //   3209: ldc_w -907027119
    //   3212: ixor
    //   3213: ldc2_w 1554119598
    //   3216: l2i
    //   3217: ldc_w -528653896
    //   3220: ixor
    //   3221: ixor
    //   3222: lookupswitch default -> 6390, -1703502577 -> 3248, 1031685336 -> 3205
    //   3248: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3251: ldc2_w 161582279
    //   3254: l2i
    //   3255: ldc_w 161582278
    //   3258: ixor
    //   3259: getstatic Perryc.c : I
    //   3262: iflt -> 3276
    //   3265: ldc2_w -703400507
    //   3268: l2i
    //   3269: ldc_w -1282624990
    //   3272: ixor
    //   3273: goto -> 3284
    //   3276: ldc2_w 371143312
    //   3279: l2i
    //   3280: ldc_w 1589173875
    //   3283: ixor
    //   3284: ldc2_w -801928508
    //   3287: l2i
    //   3288: ldc_w -440791978
    //   3291: ixor
    //   3292: ixor
    //   3293: lookupswitch default -> 3320, -1461467445 -> 3276, 1343734133 -> 6426
    //   3320: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3323: getstatic Perryc.0 : I
    //   3326: ifle -> 3340
    //   3329: ldc2_w 1315535404
    //   3332: l2i
    //   3333: ldc_w -1066739520
    //   3336: ixor
    //   3337: goto -> 3348
    //   3340: ldc2_w 982536888
    //   3343: l2i
    //   3344: ldc_w -32336205
    //   3347: ixor
    //   3348: ldc2_w 702102144
    //   3351: l2i
    //   3352: ldc_w -1064863648
    //   3355: ixor
    //   3356: ixor
    //   3357: lookupswitch default -> 6448, 769427179 -> 3384, 1734205452 -> 3340
    //   3384: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   3387: getstatic Perryc.1 : I
    //   3390: ifeq -> 3404
    //   3393: ldc2_w -1824925185
    //   3396: l2i
    //   3397: ldc_w -1333777612
    //   3400: ixor
    //   3401: goto -> 3412
    //   3404: ldc2_w -1532904475
    //   3407: l2i
    //   3408: ldc_w 285270132
    //   3411: ixor
    //   3412: ldc2_w -1173907616
    //   3415: l2i
    //   3416: ldc_w -792620793
    //   3419: ixor
    //   3420: ixor
    //   3421: lookupswitch default -> 3448, -110865138 -> 3404, 1233122476 -> 6408
    //   3448: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3451: getstatic Perryc.0 : I
    //   3454: ifle -> 3468
    //   3457: ldc2_w -866331697
    //   3460: l2i
    //   3461: ldc_w -1735555611
    //   3464: ixor
    //   3465: goto -> 3476
    //   3468: ldc2_w 676847468
    //   3471: l2i
    //   3472: ldc_w -1015032683
    //   3475: ixor
    //   3476: ldc2_w -1905620221
    //   3479: l2i
    //   3480: ldc_w 667611112
    //   3483: ixor
    //   3484: ixor
    //   3485: lookupswitch default -> 3512, -42913087 -> 6352, 1756598682 -> 3468
    //   3512: putfield armorCheck : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3515: getstatic Perryc.1 : I
    //   3518: ifeq -> 3532
    //   3521: ldc2_w -1856744890
    //   3524: l2i
    //   3525: ldc_w -430551150
    //   3528: ixor
    //   3529: goto -> 3540
    //   3532: ldc2_w 599179916
    //   3535: l2i
    //   3536: ldc_w -87114674
    //   3539: ixor
    //   3540: ldc2_w -1096245640
    //   3543: l2i
    //   3544: ldc_w 64550164
    //   3547: ixor
    //   3548: ixor
    //   3549: lookupswitch default -> 6298, -898468168 -> 3532, 1678251438 -> 3576
    //   3576: aload_0
    //   3577: getstatic Perryc.0 : I
    //   3580: ifle -> 3594
    //   3583: ldc2_w 1227763618
    //   3586: l2i
    //   3587: ldc_w -715509743
    //   3590: ixor
    //   3591: goto -> 3602
    //   3594: ldc2_w -1529722551
    //   3597: l2i
    //   3598: ldc_w 145018686
    //   3601: ixor
    //   3602: ldc2_w -501908086
    //   3605: l2i
    //   3606: ldc_w -1520580160
    //   3609: ixor
    //   3610: ixor
    //   3611: lookupswitch default -> 3636, -616780807 -> 6432, 581099441 -> 3594
    //   3636: aload_0
    //   3637: new bigname/zprestige/webhack/features/setting/Setting
    //   3640: dup
    //   3641: ldc_w '㌒㶼喳࢙๪'
    //   3644: getstatic Perryc.c : I
    //   3647: iflt -> 3661
    //   3650: ldc2_w 359048185
    //   3653: l2i
    //   3654: ldc_w 30604277
    //   3657: ixor
    //   3658: goto -> 3669
    //   3661: ldc2_w -177764658
    //   3664: l2i
    //   3665: ldc_w -1084598312
    //   3668: ixor
    //   3669: ldc2_w -1988621215
    //   3672: l2i
    //   3673: ldc_w 988803519
    //   3676: ixor
    //   3677: ixor
    //   3678: lookupswitch default -> 6320, -1490836014 -> 3661, -106287928 -> 3704
    //   3704: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3707: ldc2_w 76501111
    //   3710: l2i
    //   3711: ldc_w 76501107
    //   3714: ixor
    //   3715: getstatic Perryc.1 : I
    //   3718: ifeq -> 3732
    //   3721: ldc2_w 409864168
    //   3724: l2i
    //   3725: ldc_w 2092595506
    //   3728: ixor
    //   3729: goto -> 3740
    //   3732: ldc2_w 700808751
    //   3735: l2i
    //   3736: ldc_w -317300122
    //   3739: ixor
    //   3740: ldc2_w 1253308984
    //   3743: l2i
    //   3744: ldc_w 1297406007
    //   3747: ixor
    //   3748: ixor
    //   3749: lookupswitch default -> 3776, -425996705 -> 3732, 1664310485 -> 6376
    //   3776: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3779: ldc2_w -904037403
    //   3782: l2i
    //   3783: ldc_w -904037404
    //   3786: ixor
    //   3787: getstatic Perryc.1 : I
    //   3790: ifeq -> 3804
    //   3793: ldc2_w 1340486730
    //   3796: l2i
    //   3797: ldc_w 1150064699
    //   3800: ixor
    //   3801: goto -> 3812
    //   3804: ldc2_w 1822203163
    //   3807: l2i
    //   3808: ldc_w 2086575318
    //   3811: ixor
    //   3812: ldc2_w -216042294
    //   3815: l2i
    //   3816: ldc_w 686949976
    //   3819: ixor
    //   3820: ixor
    //   3821: lookupswitch default -> 3848, -796401949 -> 6464, 1642213394 -> 3804
    //   3848: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3851: ldc2_w 2106407437
    //   3854: l2i
    //   3855: ldc_w 2106407433
    //   3858: ixor
    //   3859: getstatic Perryc.0 : I
    //   3862: ifle -> 3876
    //   3865: ldc2_w 133839807
    //   3868: l2i
    //   3869: ldc_w -1440645474
    //   3872: ixor
    //   3873: goto -> 3884
    //   3876: ldc2_w 361671682
    //   3879: l2i
    //   3880: ldc_w -833339387
    //   3883: ixor
    //   3884: ldc2_w -1918589949
    //   3887: l2i
    //   3888: ldc_w -1282371838
    //   3891: ixor
    //   3892: ixor
    //   3893: lookupswitch default -> 6372, -1813025248 -> 3876, -437336314 -> 3920
    //   3920: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   3923: getstatic Perryc.1 : I
    //   3926: ifeq -> 3940
    //   3929: ldc2_w -1578949237
    //   3932: l2i
    //   3933: ldc_w -609546950
    //   3936: ixor
    //   3937: goto -> 3948
    //   3940: ldc2_w -122901519
    //   3943: l2i
    //   3944: ldc_w 2112463164
    //   3947: ixor
    //   3948: ldc2_w 152676293
    //   3951: l2i
    //   3952: ldc_w -1449222996
    //   3955: ixor
    //   3956: ixor
    //   3957: lookupswitch default -> 3984, -1721203428 -> 3940, -623963176 -> 6346
    //   3984: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   3987: getstatic Perryc.c : I
    //   3990: iflt -> 4004
    //   3993: ldc2_w 774286727
    //   3996: l2i
    //   3997: ldc_w -950095429
    //   4000: ixor
    //   4001: goto -> 4012
    //   4004: ldc2_w 2004060519
    //   4007: l2i
    //   4008: ldc_w -648710234
    //   4011: ixor
    //   4012: ldc2_w -180477131
    //   4015: l2i
    //   4016: ldc_w -1299103750
    //   4019: ixor
    //   4020: ixor
    //   4021: lookupswitch default -> 6374, -1361641229 -> 4004, -376839666 -> 4048
    //   4048: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4051: getstatic Perryc.c : I
    //   4054: iflt -> 4068
    //   4057: ldc2_w 1169396467
    //   4060: l2i
    //   4061: ldc_w -609194442
    //   4064: ixor
    //   4065: goto -> 4076
    //   4068: ldc2_w -1307128171
    //   4071: l2i
    //   4072: ldc_w 1318604943
    //   4075: ixor
    //   4076: ldc2_w 1997159275
    //   4079: l2i
    //   4080: ldc_w -40835275
    //   4083: ixor
    //   4084: ixor
    //   4085: lookupswitch default -> 6400, 345579675 -> 4068, 1981039172 -> 4112
    //   4112: putfield actions : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4115: getstatic Perryc.c : I
    //   4118: iflt -> 4132
    //   4121: ldc2_w 450804115
    //   4124: l2i
    //   4125: ldc_w -776686502
    //   4128: ixor
    //   4129: goto -> 4140
    //   4132: ldc2_w 1150066284
    //   4135: l2i
    //   4136: ldc_w 1746438642
    //   4139: ixor
    //   4140: ldc2_w 692383378
    //   4143: l2i
    //   4144: ldc_w 59959218
    //   4147: ixor
    //   4148: ixor
    //   4149: lookupswitch default -> 4176, -1784640775 -> 4132, -507771671 -> 6364
    //   4176: aload_0
    //   4177: getstatic Perryc.c : I
    //   4180: iflt -> 4194
    //   4183: ldc2_w 1531990771
    //   4186: l2i
    //   4187: ldc_w -299630377
    //   4190: ixor
    //   4191: goto -> 4202
    //   4194: ldc2_w 274030190
    //   4197: l2i
    //   4198: ldc_w 1993088825
    //   4201: ixor
    //   4202: ldc2_w -1689861435
    //   4205: l2i
    //   4206: ldc_w 1827550713
    //   4209: ixor
    //   4210: ixor
    //   4211: lookupswitch default -> 4236, -1820238620 -> 4194, 1121756440 -> 6460
    //   4236: getstatic bigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2.TOTEMS : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   4239: getstatic Perryc.c : I
    //   4242: iflt -> 4256
    //   4245: ldc2_w 1796097417
    //   4248: l2i
    //   4249: ldc_w -363718082
    //   4252: ixor
    //   4253: goto -> 4264
    //   4256: ldc2_w -691213389
    //   4259: l2i
    //   4260: ldc_w 473351530
    //   4263: ixor
    //   4264: ldc2_w -1605832409
    //   4267: l2i
    //   4268: ldc_w 700895444
    //   4271: ixor
    //   4272: ixor
    //   4273: lookupswitch default -> 4300, 148012612 -> 6302, 1485859141 -> 4256
    //   4300: putfield currentMode : Lbigname/zprestige/webhack/features/modules/Combat/Offhand$Mode2;
    //   4303: getstatic Perryc.c : I
    //   4306: iflt -> 4320
    //   4309: ldc2_w -833695214
    //   4312: l2i
    //   4313: ldc_w 1668456955
    //   4316: ixor
    //   4317: goto -> 4328
    //   4320: ldc2_w -938778757
    //   4323: l2i
    //   4324: ldc_w 1817960842
    //   4327: ixor
    //   4328: ldc2_w 1279035429
    //   4331: l2i
    //   4332: ldc_w -1703473331
    //   4335: ixor
    //   4336: ixor
    //   4337: lookupswitch default -> 6428, 1914386841 -> 4364, 2071458945 -> 4320
    //   4364: aload_0
    //   4365: ldc2_w 1654760968
    //   4368: l2i
    //   4369: ldc_w 1654760968
    //   4372: ixor
    //   4373: getstatic Perryc.c : I
    //   4376: iflt -> 4390
    //   4379: ldc2_w -735574743
    //   4382: l2i
    //   4383: ldc_w -177575822
    //   4386: ixor
    //   4387: goto -> 4398
    //   4390: ldc2_w 1092704891
    //   4393: l2i
    //   4394: ldc_w -1788225929
    //   4397: ixor
    //   4398: ldc2_w -96880578
    //   4401: l2i
    //   4402: ldc_w 2077031191
    //   4405: ixor
    //   4406: ixor
    //   4407: lookupswitch default -> 6430, -1598607758 -> 4390, 1438502693 -> 4432
    //   4432: putfield totems : I
    //   4435: getstatic Perryc.1 : I
    //   4438: ifeq -> 4452
    //   4441: ldc2_w 2076119997
    //   4444: l2i
    //   4445: ldc_w 908971134
    //   4448: ixor
    //   4449: goto -> 4460
    //   4452: ldc2_w -1674604287
    //   4455: l2i
    //   4456: ldc_w -1072240182
    //   4459: ixor
    //   4460: ldc2_w -552367621
    //   4463: l2i
    //   4464: ldc_w 1891917134
    //   4467: ixor
    //   4468: ixor
    //   4469: lookupswitch default -> 6402, -498791562 -> 4452, -202462082 -> 4496
    //   4496: aload_0
    //   4497: ldc2_w 1449597411
    //   4500: l2i
    //   4501: ldc_w 1449597411
    //   4504: ixor
    //   4505: getstatic Perryc.c : I
    //   4508: iflt -> 4522
    //   4511: ldc2_w 51049620
    //   4514: l2i
    //   4515: ldc_w -779681568
    //   4518: ixor
    //   4519: goto -> 4530
    //   4522: ldc2_w 605535554
    //   4525: l2i
    //   4526: ldc_w 929329374
    //   4529: ixor
    //   4530: ldc2_w 1042928568
    //   4533: l2i
    //   4534: ldc_w -1047840290
    //   4537: ixor
    //   4538: ixor
    //   4539: lookupswitch default -> 6452, -321837062 -> 4564, 758062610 -> 4522
    //   4564: putfield crystals : I
    //   4567: getstatic Perryc.0 : I
    //   4570: ifle -> 4584
    //   4573: ldc2_w -922729546
    //   4576: l2i
    //   4577: ldc_w 961203607
    //   4580: ixor
    //   4581: goto -> 4592
    //   4584: ldc2_w 621588833
    //   4587: l2i
    //   4588: ldc_w 1526386723
    //   4591: ixor
    //   4592: ldc2_w 1167022692
    //   4595: l2i
    //   4596: ldc_w 846703360
    //   4599: ixor
    //   4600: ixor
    //   4601: lookupswitch default -> 4628, -2018345147 -> 6278, -562230875 -> 4584
    //   4628: aload_0
    //   4629: ldc2_w 1977648255
    //   4632: l2i
    //   4633: ldc_w 1977648255
    //   4636: ixor
    //   4637: getstatic Perryc.0 : I
    //   4640: ifle -> 4654
    //   4643: ldc2_w 1233985029
    //   4646: l2i
    //   4647: ldc_w 1033421797
    //   4650: ixor
    //   4651: goto -> 4662
    //   4654: ldc2_w -1512115632
    //   4657: l2i
    //   4658: ldc_w -968697244
    //   4661: ixor
    //   4662: ldc2_w -1276236121
    //   4665: l2i
    //   4666: ldc_w 271328646
    //   4669: ixor
    //   4670: ixor
    //   4671: lookupswitch default -> 6316, -1067572459 -> 4696, -673720639 -> 4654
    //   4696: putfield gapples : I
    //   4699: getstatic Perryc.c : I
    //   4702: iflt -> 4716
    //   4705: ldc2_w 1346310230
    //   4708: l2i
    //   4709: ldc_w -1563281653
    //   4712: ixor
    //   4713: goto -> 4724
    //   4716: ldc2_w 458722324
    //   4719: l2i
    //   4720: ldc_w -555250888
    //   4723: ixor
    //   4724: ldc2_w 1362150604
    //   4727: l2i
    //   4728: ldc_w 1466401219
    //   4731: ixor
    //   4732: ixor
    //   4733: lookupswitch default -> 6398, -1008254429 -> 4760, -189111726 -> 4716
    //   4760: aload_0
    //   4761: ldc2_w 1518377671
    //   4764: l2i
    //   4765: ldc_w -1518377672
    //   4768: ixor
    //   4769: getstatic Perryc.1 : I
    //   4772: ifeq -> 4786
    //   4775: ldc2_w 1722076889
    //   4778: l2i
    //   4779: ldc_w 903155970
    //   4782: ixor
    //   4783: goto -> 4794
    //   4786: ldc2_w 2001260840
    //   4789: l2i
    //   4790: ldc_w -757715161
    //   4793: ixor
    //   4794: ldc2_w -1504989100
    //   4797: l2i
    //   4798: ldc_w 1751669595
    //   4801: ixor
    //   4802: ixor
    //   4803: lookupswitch default -> 4828, -1655556908 -> 6454, 1629676380 -> 4786
    //   4828: putfield lastTotemSlot : I
    //   4831: getstatic Perryc.0 : I
    //   4834: ifle -> 4848
    //   4837: ldc2_w -522056554
    //   4840: l2i
    //   4841: ldc_w -521173754
    //   4844: ixor
    //   4845: goto -> 4856
    //   4848: ldc2_w -322167105
    //   4851: l2i
    //   4852: ldc_w -1583746960
    //   4855: ixor
    //   4856: ldc2_w -995091254
    //   4859: l2i
    //   4860: ldc_w 316896093
    //   4863: ixor
    //   4864: ixor
    //   4865: lookupswitch default -> 4892, -698423801 -> 6350, 213118752 -> 4848
    //   4892: aload_0
    //   4893: ldc2_w -6537236
    //   4896: l2i
    //   4897: ldc_w 6537235
    //   4900: ixor
    //   4901: getstatic Perryc.c : I
    //   4904: iflt -> 4918
    //   4907: ldc2_w 1689730285
    //   4910: l2i
    //   4911: ldc_w -550314013
    //   4914: ixor
    //   4915: goto -> 4926
    //   4918: ldc2_w 391294611
    //   4921: l2i
    //   4922: ldc_w 5463483
    //   4925: ixor
    //   4926: ldc2_w -506632130
    //   4929: l2i
    //   4930: ldc_w 716174891
    //   4933: ixor
    //   4934: ixor
    //   4935: lookupswitch default -> 6362, -597463747 -> 4960, 1894219035 -> 4918
    //   4960: putfield lastGappleSlot : I
    //   4963: getstatic Perryc.c : I
    //   4966: iflt -> 4980
    //   4969: ldc2_w -1930737007
    //   4972: l2i
    //   4973: ldc_w 2063599181
    //   4976: ixor
    //   4977: goto -> 4988
    //   4980: ldc2_w -976340384
    //   4983: l2i
    //   4984: ldc_w 899985809
    //   4987: ixor
    //   4988: ldc2_w -1365669938
    //   4991: l2i
    //   4992: ldc_w -713768580
    //   4995: ixor
    //   4996: ixor
    //   4997: lookupswitch default -> 6334, -1954034365 -> 5024, -1945761170 -> 4980
    //   5024: aload_0
    //   5025: ldc2_w 2048722494
    //   5028: l2i
    //   5029: ldc_w -2048722495
    //   5032: ixor
    //   5033: getstatic Perryc.1 : I
    //   5036: ifeq -> 5050
    //   5039: ldc2_w 1773342143
    //   5042: l2i
    //   5043: ldc_w -1884515779
    //   5046: ixor
    //   5047: goto -> 5058
    //   5050: ldc2_w -682464553
    //   5053: l2i
    //   5054: ldc_w 765539189
    //   5057: ixor
    //   5058: ldc2_w 1372784880
    //   5061: l2i
    //   5062: ldc_w 1166443573
    //   5065: ixor
    //   5066: ixor
    //   5067: lookupswitch default -> 6322, -291056281 -> 5092, -230026425 -> 5050
    //   5092: putfield lastCrystalSlot : I
    //   5095: getstatic Perryc.c : I
    //   5098: iflt -> 5112
    //   5101: ldc2_w 1940110040
    //   5104: l2i
    //   5105: ldc_w -1493019535
    //   5108: ixor
    //   5109: goto -> 5120
    //   5112: ldc2_w 834385629
    //   5115: l2i
    //   5116: ldc_w -118486171
    //   5119: ixor
    //   5120: ldc2_w 1932087756
    //   5123: l2i
    //   5124: ldc_w -1648157866
    //   5127: ixor
    //   5128: ixor
    //   5129: lookupswitch default -> 6314, 664925986 -> 5156, 978035763 -> 5112
    //   5156: aload_0
    //   5157: ldc2_w 2088316959
    //   5160: l2i
    //   5161: ldc_w -2088316960
    //   5164: ixor
    //   5165: getstatic Perryc.c : I
    //   5168: iflt -> 5182
    //   5171: ldc2_w -1754657400
    //   5174: l2i
    //   5175: ldc_w 1790432599
    //   5178: ixor
    //   5179: goto -> 5190
    //   5182: ldc2_w -443593436
    //   5185: l2i
    //   5186: ldc_w 2067746747
    //   5189: ixor
    //   5190: ldc2_w 1092603272
    //   5193: l2i
    //   5194: ldc_w 745436116
    //   5197: ixor
    //   5198: ixor
    //   5199: lookupswitch default -> 6326, -1867749757 -> 5182, -205407037 -> 5224
    //   5224: putfield lastObbySlot : I
    //   5227: getstatic Perryc.c : I
    //   5230: iflt -> 5244
    //   5233: ldc2_w 606028184
    //   5236: l2i
    //   5237: ldc_w -1544139184
    //   5240: ixor
    //   5241: goto -> 5252
    //   5244: ldc2_w 1483999435
    //   5247: l2i
    //   5248: ldc_w 643050462
    //   5251: ixor
    //   5252: ldc2_w 2135723214
    //   5255: l2i
    //   5256: ldc_w -436116879
    //   5259: ixor
    //   5260: ixor
    //   5261: lookupswitch default -> 6446, -412234326 -> 5288, 514122103 -> 5244
    //   5288: aload_0
    //   5289: ldc2_w 968939027
    //   5292: l2i
    //   5293: ldc_w -968939028
    //   5296: ixor
    //   5297: getstatic Perryc.0 : I
    //   5300: ifle -> 5314
    //   5303: ldc2_w 1351657947
    //   5306: l2i
    //   5307: ldc_w 746924586
    //   5310: ixor
    //   5311: goto -> 5322
    //   5314: ldc2_w -148571107
    //   5317: l2i
    //   5318: ldc_w -1731056221
    //   5321: ixor
    //   5322: ldc2_w 1446232457
    //   5325: l2i
    //   5326: ldc_w 1038827581
    //   5329: ixor
    //   5330: ixor
    //   5331: lookupswitch default -> 6414, 70144010 -> 5356, 399311429 -> 5314
    //   5356: putfield lastWebSlot : I
    //   5359: getstatic Perryc.0 : I
    //   5362: ifle -> 5376
    //   5365: ldc2_w 2086538794
    //   5368: l2i
    //   5369: ldc_w -1634859258
    //   5372: ixor
    //   5373: goto -> 5384
    //   5376: ldc2_w -306684879
    //   5379: l2i
    //   5380: ldc_w -523577556
    //   5383: ixor
    //   5384: ldc2_w -1142272787
    //   5387: l2i
    //   5388: ldc_w -932957301
    //   5391: ixor
    //   5392: ixor
    //   5393: lookupswitch default -> 5420, -1856080310 -> 6422, 987005878 -> 5376
    //   5420: aload_0
    //   5421: ldc2_w 75746447
    //   5424: l2i
    //   5425: ldc_w 75746447
    //   5428: ixor
    //   5429: getstatic Perryc.1 : I
    //   5432: ifeq -> 5446
    //   5435: ldc2_w -1208029031
    //   5438: l2i
    //   5439: ldc_w -1419550692
    //   5442: ixor
    //   5443: goto -> 5454
    //   5446: ldc2_w 1367246030
    //   5449: l2i
    //   5450: ldc_w -806159129
    //   5453: ixor
    //   5454: ldc2_w 1202322016
    //   5457: l2i
    //   5458: ldc_w -666579263
    //   5461: ixor
    //   5462: ixor
    //   5463: lookupswitch default -> 5488, -2089769948 -> 6394, -1609371031 -> 5446
    //   5488: putfield holdingCrystal : Z
    //   5491: getstatic Perryc.0 : I
    //   5494: ifle -> 5508
    //   5497: ldc2_w -1101122999
    //   5500: l2i
    //   5501: ldc_w 1290291163
    //   5504: ixor
    //   5505: goto -> 5516
    //   5508: ldc2_w 566410359
    //   5511: l2i
    //   5512: ldc_w 1899559829
    //   5515: ixor
    //   5516: ldc2_w -637134176
    //   5519: l2i
    //   5520: ldc_w 41158029
    //   5523: ixor
    //   5524: ixor
    //   5525: lookupswitch default -> 6424, -2004330289 -> 5552, 717515455 -> 5508
    //   5552: aload_0
    //   5553: ldc2_w -1925542206
    //   5556: l2i
    //   5557: ldc_w -1925542206
    //   5560: ixor
    //   5561: getstatic Perryc.1 : I
    //   5564: ifeq -> 5578
    //   5567: ldc2_w 809206540
    //   5570: l2i
    //   5571: ldc_w 1759397603
    //   5574: ixor
    //   5575: goto -> 5586
    //   5578: ldc2_w -16512994
    //   5581: l2i
    //   5582: ldc_w -967176738
    //   5585: ixor
    //   5586: ldc2_w -1013211405
    //   5589: l2i
    //   5590: ldc_w -751229461
    //   5593: ixor
    //   5594: ixor
    //   5595: lookupswitch default -> 6356, 704429784 -> 5620, 1212645111 -> 5578
    //   5620: putfield holdingTotem : Z
    //   5623: getstatic Perryc.0 : I
    //   5626: ifle -> 5640
    //   5629: ldc2_w 776806467
    //   5632: l2i
    //   5633: ldc_w -577915614
    //   5636: ixor
    //   5637: goto -> 5648
    //   5640: ldc2_w -1837276887
    //   5643: l2i
    //   5644: ldc_w 1674233724
    //   5647: ixor
    //   5648: ldc2_w 1639517569
    //   5651: l2i
    //   5652: ldc_w 876896466
    //   5655: ixor
    //   5656: ixor
    //   5657: lookupswitch default -> 6416, -1538602234 -> 5684, -1505888206 -> 5640
    //   5684: aload_0
    //   5685: ldc2_w -1677125712
    //   5688: l2i
    //   5689: ldc_w -1677125712
    //   5692: ixor
    //   5693: getstatic Perryc.1 : I
    //   5696: ifeq -> 5710
    //   5699: ldc2_w -1925824145
    //   5702: l2i
    //   5703: ldc_w -1764679472
    //   5706: ixor
    //   5707: goto -> 5718
    //   5710: ldc2_w 189026967
    //   5713: l2i
    //   5714: ldc_w -165991381
    //   5717: ixor
    //   5718: ldc2_w 1806526599
    //   5721: l2i
    //   5722: ldc_w 1696478225
    //   5725: ixor
    //   5726: ixor
    //   5727: lookupswitch default -> 5752, -678624143 -> 5710, 357842217 -> 6378
    //   5752: putfield holdingGapple : Z
    //   5755: getstatic Perryc.1 : I
    //   5758: ifeq -> 5772
    //   5761: ldc2_w 1569421672
    //   5764: l2i
    //   5765: ldc_w -598639869
    //   5768: ixor
    //   5769: goto -> 5780
    //   5772: ldc2_w 452173362
    //   5775: l2i
    //   5776: ldc_w -781960607
    //   5779: ixor
    //   5780: ldc2_w -665877890
    //   5783: l2i
    //   5784: ldc_w 1946684727
    //   5787: ixor
    //   5788: ixor
    //   5789: lookupswitch default -> 6288, 765300002 -> 5772, 1741695770 -> 5816
    //   5816: aload_0
    //   5817: ldc2_w -349957154
    //   5820: l2i
    //   5821: ldc_w -349957154
    //   5824: ixor
    //   5825: getstatic Perryc.0 : I
    //   5828: ifle -> 5842
    //   5831: ldc2_w 928279304
    //   5834: l2i
    //   5835: ldc_w -1164890078
    //   5838: ixor
    //   5839: goto -> 5850
    //   5842: ldc2_w -827678302
    //   5845: l2i
    //   5846: ldc_w -590065086
    //   5849: ixor
    //   5850: ldc2_w -1181333366
    //   5853: l2i
    //   5854: ldc_w -1581712784
    //   5857: ixor
    //   5858: ixor
    //   5859: lookupswitch default -> 6404, -1779701296 -> 5842, 173031706 -> 5884
    //   5884: putfield didSwitchThisTick : Z
    //   5887: getstatic Perryc.1 : I
    //   5890: ifeq -> 5904
    //   5893: ldc2_w -1397410456
    //   5896: l2i
    //   5897: ldc_w 462219021
    //   5900: ixor
    //   5901: goto -> 5912
    //   5904: ldc2_w 261339866
    //   5907: l2i
    //   5908: ldc_w 1067866367
    //   5911: ixor
    //   5912: ldc2_w 393695967
    //   5915: l2i
    //   5916: ldc_w -411336566
    //   5919: ixor
    //   5920: ixor
    //   5921: lookupswitch default -> 6282, -1069993872 -> 5948, 1194655792 -> 5904
    //   5948: aload_0
    //   5949: ldc2_w -97059963
    //   5952: l2i
    //   5953: ldc_w -97059963
    //   5956: ixor
    //   5957: getstatic Perryc.0 : I
    //   5960: ifle -> 5974
    //   5963: ldc2_w -142424832
    //   5966: l2i
    //   5967: ldc_w 1291879891
    //   5970: ixor
    //   5971: goto -> 5982
    //   5974: ldc2_w 1509695411
    //   5977: l2i
    //   5978: ldc_w -175287424
    //   5981: ixor
    //   5982: ldc2_w -1047993925
    //   5985: l2i
    //   5986: ldc_w -1900224730
    //   5989: ixor
    //   5990: ixor
    //   5991: lookupswitch default -> 6318, -481987922 -> 6016, -172589490 -> 5974
    //   6016: putfield second : Z
    //   6019: getstatic Perryc.1 : I
    //   6022: ifeq -> 6036
    //   6025: ldc2_w -1286199794
    //   6028: l2i
    //   6029: ldc_w -2135960587
    //   6032: ixor
    //   6033: goto -> 6044
    //   6036: ldc2_w 1873979602
    //   6039: l2i
    //   6040: ldc_w -622260710
    //   6043: ixor
    //   6044: ldc2_w -1187938476
    //   6047: l2i
    //   6048: ldc_w -1171271462
    //   6051: ixor
    //   6052: ixor
    //   6053: lookupswitch default -> 6442, -1236989626 -> 6080, 820468341 -> 6036
    //   6080: aload_0
    //   6081: ldc2_w -1308504133
    //   6084: l2i
    //   6085: ldc_w -1308504133
    //   6088: ixor
    //   6089: getstatic Perryc.c : I
    //   6092: iflt -> 6106
    //   6095: ldc2_w 1128580607
    //   6098: l2i
    //   6099: ldc_w 351476750
    //   6102: ixor
    //   6103: goto -> 6114
    //   6106: ldc2_w 893113159
    //   6109: l2i
    //   6110: ldc_w 1417491260
    //   6113: ixor
    //   6114: ldc2_w -21633454
    //   6117: l2i
    //   6118: ldc_w 131252110
    //   6121: ixor
    //   6122: ixor
    //   6123: lookupswitch default -> 6148, -1362067411 -> 6294, -816026777 -> 6106
    //   6148: putfield switchedForHealthReason : Z
    //   6151: getstatic Perryc.0 : I
    //   6154: ifle -> 6168
    //   6157: ldc2_w 938408477
    //   6160: l2i
    //   6161: ldc_w -1881541887
    //   6164: ixor
    //   6165: goto -> 6176
    //   6168: ldc2_w -1324765701
    //   6171: l2i
    //   6172: ldc_w -1477564207
    //   6175: ixor
    //   6176: ldc2_w -873380526
    //   6179: l2i
    //   6180: ldc_w 1941613058
    //   6183: ixor
    //   6184: ixor
    //   6185: lookupswitch default -> 6212, 8185420 -> 6306, 432739063 -> 6168
    //   6212: aload_0
    //   6213: getstatic Perryc.0 : I
    //   6216: ifle -> 6230
    //   6219: ldc2_w 950226349
    //   6222: l2i
    //   6223: ldc_w -788787385
    //   6226: ixor
    //   6227: goto -> 6238
    //   6230: ldc2_w -878575025
    //   6233: l2i
    //   6234: ldc_w -478625469
    //   6237: ixor
    //   6238: ldc2_w -333187276
    //   6241: l2i
    //   6242: ldc_w -835919058
    //   6245: ixor
    //   6246: ixor
    //   6247: lookupswitch default -> 6272, -900704528 -> 6380, -227604098 -> 6230
    //   6272: putstatic bigname/zprestige/webhack/features/modules/Combat/Offhand.instance : Lbigname/zprestige/webhack/features/modules/Combat/Offhand;
    //   6275: return
    //   6276: aconst_null
    //   6277: athrow
    //   6278: aconst_null
    //   6279: athrow
    //   6280: aconst_null
    //   6281: athrow
    //   6282: aconst_null
    //   6283: athrow
    //   6284: aconst_null
    //   6285: athrow
    //   6286: aconst_null
    //   6287: athrow
    //   6288: aconst_null
    //   6289: athrow
    //   6290: aconst_null
    //   6291: athrow
    //   6292: aconst_null
    //   6293: athrow
    //   6294: aconst_null
    //   6295: athrow
    //   6296: aconst_null
    //   6297: athrow
    //   6298: aconst_null
    //   6299: athrow
    //   6300: aconst_null
    //   6301: athrow
    //   6302: aconst_null
    //   6303: athrow
    //   6304: aconst_null
    //   6305: athrow
    //   6306: aconst_null
    //   6307: athrow
    //   6308: aconst_null
    //   6309: athrow
    //   6310: aconst_null
    //   6311: athrow
    //   6312: aconst_null
    //   6313: athrow
    //   6314: aconst_null
    //   6315: athrow
    //   6316: aconst_null
    //   6317: athrow
    //   6318: aconst_null
    //   6319: athrow
    //   6320: aconst_null
    //   6321: athrow
    //   6322: aconst_null
    //   6323: athrow
    //   6324: aconst_null
    //   6325: athrow
    //   6326: aconst_null
    //   6327: athrow
    //   6328: aconst_null
    //   6329: athrow
    //   6330: aconst_null
    //   6331: athrow
    //   6332: aconst_null
    //   6333: athrow
    //   6334: aconst_null
    //   6335: athrow
    //   6336: aconst_null
    //   6337: athrow
    //   6338: aconst_null
    //   6339: athrow
    //   6340: aconst_null
    //   6341: athrow
    //   6342: aconst_null
    //   6343: athrow
    //   6344: aconst_null
    //   6345: athrow
    //   6346: aconst_null
    //   6347: athrow
    //   6348: aconst_null
    //   6349: athrow
    //   6350: aconst_null
    //   6351: athrow
    //   6352: aconst_null
    //   6353: athrow
    //   6354: aconst_null
    //   6355: athrow
    //   6356: aconst_null
    //   6357: athrow
    //   6358: aconst_null
    //   6359: athrow
    //   6360: aconst_null
    //   6361: athrow
    //   6362: aconst_null
    //   6363: athrow
    //   6364: aconst_null
    //   6365: athrow
    //   6366: aconst_null
    //   6367: athrow
    //   6368: aconst_null
    //   6369: athrow
    //   6370: aconst_null
    //   6371: athrow
    //   6372: aconst_null
    //   6373: athrow
    //   6374: aconst_null
    //   6375: athrow
    //   6376: aconst_null
    //   6377: athrow
    //   6378: aconst_null
    //   6379: athrow
    //   6380: aconst_null
    //   6381: athrow
    //   6382: aconst_null
    //   6383: athrow
    //   6384: aconst_null
    //   6385: athrow
    //   6386: aconst_null
    //   6387: athrow
    //   6388: aconst_null
    //   6389: athrow
    //   6390: aconst_null
    //   6391: athrow
    //   6392: aconst_null
    //   6393: athrow
    //   6394: aconst_null
    //   6395: athrow
    //   6396: aconst_null
    //   6397: athrow
    //   6398: aconst_null
    //   6399: athrow
    //   6400: aconst_null
    //   6401: athrow
    //   6402: aconst_null
    //   6403: athrow
    //   6404: aconst_null
    //   6405: athrow
    //   6406: aconst_null
    //   6407: athrow
    //   6408: aconst_null
    //   6409: athrow
    //   6410: aconst_null
    //   6411: athrow
    //   6412: aconst_null
    //   6413: athrow
    //   6414: aconst_null
    //   6415: athrow
    //   6416: aconst_null
    //   6417: athrow
    //   6418: aconst_null
    //   6419: athrow
    //   6420: aconst_null
    //   6421: athrow
    //   6422: aconst_null
    //   6423: athrow
    //   6424: aconst_null
    //   6425: athrow
    //   6426: aconst_null
    //   6427: athrow
    //   6428: aconst_null
    //   6429: athrow
    //   6430: aconst_null
    //   6431: athrow
    //   6432: aconst_null
    //   6433: athrow
    //   6434: aconst_null
    //   6435: athrow
    //   6436: aconst_null
    //   6437: athrow
    //   6438: aconst_null
    //   6439: athrow
    //   6440: aconst_null
    //   6441: athrow
    //   6442: aconst_null
    //   6443: athrow
    //   6444: aconst_null
    //   6445: athrow
    //   6446: aconst_null
    //   6447: athrow
    //   6448: aconst_null
    //   6449: athrow
    //   6450: aconst_null
    //   6451: athrow
    //   6452: aconst_null
    //   6453: athrow
    //   6454: aconst_null
    //   6455: athrow
    //   6456: aconst_null
    //   6457: athrow
    //   6458: aconst_null
    //   6459: athrow
    //   6460: aconst_null
    //   6461: athrow
    //   6462: aconst_null
    //   6463: athrow
    //   6464: aconst_null
    //   6465: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	6276	0	this	Lbigname/zprestige/webhack/features/modules/Combat/Offhand;
  }
  
  public static boolean lambda$doOffhand$0(ItemStack paramItemStack) {
    return Perry1.0x(null, (int)463774136L ^ 0x24C13248, paramItemStack);
  }
  
  public static boolean lambda$doOffhand$2(ItemStack paramItemStack) {
    return Perry1.0z(null, (int)-96584999L ^ 0xCC2E487A, paramItemStack);
  }
  
  public void setMode(Offhand$Mode2 mode) {
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
  
  public void onUpdate() {
    Perry1.3z(this, (int)-510791649L ^ 0xF19C47E8);
  }
  
  @SubscribeEvent
  public void onUpdateWalkingPlayer(ProcessRightClickBlockEvent paramProcessRightClickBlockEvent) {
    Perry1.15(this, (int)1058024503L ^ 0xDDD0CF6, paramProcessRightClickBlockEvent);
  }
  
  @SubscribeEvent
  public void onPacketSend(PacketEvent.Send event) {
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
  
  public static boolean lambda$doOffhand$4(ItemStack paramItemStack) {
    return Perry1.0y(null, (int)181343652L ^ 0x1FF23304, paramItemStack);
  }
  
  public static boolean lambda$doOffhand$5(ItemStack paramItemStack) {
    return Perry1.0x(null, (int)-1905321956L ^ 0xB10A8BED, paramItemStack);
  }
  
  public void putItemInOffhand(int slotIn, int slotOut) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1700
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 1692
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1684
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -892638738
    //   33: l2i
    //   34: ldc_w -1928028431
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 273634831
    //   44: l2i
    //   45: ldc_w -969523163
    //   48: ixor
    //   49: ldc2_w 2095087384
    //   52: l2i
    //   53: ldc_w -1895507499
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 1667, -1271180846 -> 41, 631091431 -> 84
    //   84: iload_1
    //   85: ldc2_w 251748233
    //   88: l2i
    //   89: ldc_w -251748234
    //   92: ixor
    //   93: if_icmpeq -> 107
    //   96: ldc2_w -823023325
    //   99: l2i
    //   100: ldc_w 2025249224
    //   103: ixor
    //   104: goto -> 115
    //   107: ldc2_w -257357306
    //   110: l2i
    //   111: ldc_w 1190034146
    //   114: ixor
    //   115: ldc2_w -1712749435
    //   118: l2i
    //   119: ldc_w -1340015639
    //   122: ixor
    //   123: ixor
    //   124: tableswitch default -> 96, -1618079865 -> 148, -1618079864 -> 1630
    //   148: getstatic Perryc.1 : I
    //   151: ifeq -> 165
    //   154: ldc2_w 1260120581
    //   157: l2i
    //   158: ldc_w 1202500448
    //   161: ixor
    //   162: goto -> 173
    //   165: ldc2_w -1155100403
    //   168: l2i
    //   169: ldc_w -1040333833
    //   172: ixor
    //   173: ldc2_w -1601277790
    //   176: l2i
    //   177: ldc_w 1515459209
    //   180: ixor
    //   181: ixor
    //   182: lookupswitch default -> 1659, -2147405615 -> 208, -160613554 -> 165
    //   208: aload_0
    //   209: getstatic Perryc.c : I
    //   212: iflt -> 226
    //   215: ldc2_w -328875038
    //   218: l2i
    //   219: ldc_w 98151839
    //   222: ixor
    //   223: goto -> 234
    //   226: ldc2_w -1023976497
    //   229: l2i
    //   230: ldc_w -7024192
    //   233: ixor
    //   234: ldc2_w -1134841460
    //   237: l2i
    //   238: ldc_w 764624651
    //   241: ixor
    //   242: ixor
    //   243: lookupswitch default -> 1661, -1398078328 -> 268, 2020925690 -> 226
    //   268: getfield taskList : Ljava/util/Queue;
    //   271: getstatic Perryc.c : I
    //   274: iflt -> 288
    //   277: ldc2_w -1109610878
    //   280: l2i
    //   281: ldc_w -641513911
    //   284: ixor
    //   285: goto -> 296
    //   288: ldc2_w 1738593828
    //   291: l2i
    //   292: ldc_w -1609419536
    //   295: ixor
    //   296: ldc2_w -1650394504
    //   299: l2i
    //   300: ldc_w -106263154
    //   303: ixor
    //   304: ixor
    //   305: lookupswitch default -> 332, 1417021 -> 1665, 1706248023 -> 288
    //   332: goto -> 336
    //   335: athrow
    //   336: invokeinterface isEmpty : ()Z
    //   341: goto -> 345
    //   344: athrow
    //   345: ifeq -> 359
    //   348: ldc2_w 524584
    //   351: l2i
    //   352: ldc_w 1638500624
    //   355: ixor
    //   356: goto -> 367
    //   359: ldc2_w 1456773602
    //   362: l2i
    //   363: ldc_w 930419165
    //   366: ixor
    //   367: ldc2_w 413122297
    //   370: l2i
    //   371: ldc_w 617152322
    //   374: ixor
    //   375: ixor
    //   376: tableswitch default -> 348, 1576454531 -> 400, 1576454532 -> 1630
    //   400: getstatic Perryc.c : I
    //   403: iflt -> 417
    //   406: ldc2_w 2027260352
    //   409: l2i
    //   410: ldc_w 2141789306
    //   413: ixor
    //   414: goto -> 425
    //   417: ldc2_w 263496243
    //   420: l2i
    //   421: ldc_w 1458819917
    //   424: ixor
    //   425: ldc2_w -586459106
    //   428: l2i
    //   429: ldc_w 43755616
    //   432: ixor
    //   433: ixor
    //   434: lookupswitch default -> 1671, -2032697088 -> 460, -655596092 -> 417
    //   460: aload_0
    //   461: getstatic Perryc.c : I
    //   464: iflt -> 478
    //   467: ldc2_w -516385919
    //   470: l2i
    //   471: ldc_w 147503065
    //   474: ixor
    //   475: goto -> 486
    //   478: ldc2_w -1282496132
    //   481: l2i
    //   482: ldc_w 795848715
    //   485: ixor
    //   486: ldc2_w -1857974073
    //   489: l2i
    //   490: ldc_w -2016480940
    //   493: ixor
    //   494: ixor
    //   495: lookupswitch default -> 520, -1276550590 -> 478, -8567349 -> 1643
    //   520: getfield taskList : Ljava/util/Queue;
    //   523: new bigname/zprestige/webhack/util/InventoryUtil$Task
    //   526: dup
    //   527: getstatic Perryc.c : I
    //   530: iflt -> 544
    //   533: ldc2_w -859229898
    //   536: l2i
    //   537: ldc_w -986778011
    //   540: ixor
    //   541: goto -> 552
    //   544: ldc2_w 2112154269
    //   547: l2i
    //   548: ldc_w -2105857811
    //   551: ixor
    //   552: ldc2_w -964875297
    //   555: l2i
    //   556: ldc_w -1964184767
    //   559: ixor
    //   560: ixor
    //   561: lookupswitch default -> 588, 1165363149 -> 1649, 1983729597 -> 544
    //   588: iload_1
    //   589: getstatic Perryc.c : I
    //   592: iflt -> 606
    //   595: ldc2_w 1399007239
    //   598: l2i
    //   599: ldc_w 1716347575
    //   602: ixor
    //   603: goto -> 614
    //   606: ldc2_w -1973867349
    //   609: l2i
    //   610: ldc_w -155840109
    //   613: ixor
    //   614: ldc2_w 122688655
    //   617: l2i
    //   618: ldc_w -2005001093
    //   621: ixor
    //   622: ixor
    //   623: lookupswitch default -> 648, -1174388156 -> 1651, 16129352 -> 606
    //   648: goto -> 652
    //   651: athrow
    //   652: invokespecial <init> : (I)V
    //   655: goto -> 659
    //   658: athrow
    //   659: getstatic Perryc.1 : I
    //   662: ifeq -> 676
    //   665: ldc2_w 1320530154
    //   668: l2i
    //   669: ldc_w -928031747
    //   672: ixor
    //   673: goto -> 684
    //   676: ldc2_w 1240017942
    //   679: l2i
    //   680: ldc_w 212265762
    //   683: ixor
    //   684: ldc2_w 835108480
    //   687: l2i
    //   688: ldc_w 901178879
    //   691: ixor
    //   692: ixor
    //   693: lookupswitch default -> 1655, -2106937240 -> 676, 1094687819 -> 720
    //   720: goto -> 724
    //   723: athrow
    //   724: invokeinterface add : (Ljava/lang/Object;)Z
    //   729: goto -> 733
    //   732: athrow
    //   733: pop
    //   734: getstatic Perryc.0 : I
    //   737: ifle -> 751
    //   740: ldc2_w -1325569048
    //   743: l2i
    //   744: ldc_w 68308042
    //   747: ixor
    //   748: goto -> 759
    //   751: ldc2_w -2027833448
    //   754: l2i
    //   755: ldc_w -1016898378
    //   758: ixor
    //   759: ldc2_w 182333551
    //   762: l2i
    //   763: ldc_w 1443504496
    //   766: ixor
    //   767: ixor
    //   768: lookupswitch default -> 796, -398772547 -> 1663, 691654494 -> 751
    //   796: aload_0
    //   797: getstatic Perryc.0 : I
    //   800: ifle -> 814
    //   803: ldc2_w 238816900
    //   806: l2i
    //   807: ldc_w 510931480
    //   810: ixor
    //   811: goto -> 822
    //   814: ldc2_w 925638227
    //   817: l2i
    //   818: ldc_w 1368573793
    //   821: ixor
    //   822: ldc2_w -459075979
    //   825: l2i
    //   826: ldc_w 422736080
    //   829: ixor
    //   830: ixor
    //   831: lookupswitch default -> 856, -304528839 -> 1657, 1876443915 -> 814
    //   856: getfield taskList : Ljava/util/Queue;
    //   859: new bigname/zprestige/webhack/util/InventoryUtil$Task
    //   862: dup
    //   863: ldc2_w -630832218
    //   866: l2i
    //   867: ldc_w -630832245
    //   870: ixor
    //   871: getstatic Perryc.1 : I
    //   874: ifeq -> 888
    //   877: ldc2_w 1579970251
    //   880: l2i
    //   881: ldc_w -1063549412
    //   884: ixor
    //   885: goto -> 896
    //   888: ldc2_w 934426549
    //   891: l2i
    //   892: ldc_w 2099157963
    //   895: ixor
    //   896: ldc2_w 1258955717
    //   899: l2i
    //   900: ldc_w -1485227204
    //   903: ixor
    //   904: ixor
    //   905: lookupswitch default -> 932, 1776065485 -> 888, 1925509166 -> 1641
    //   932: goto -> 936
    //   935: athrow
    //   936: invokespecial <init> : (I)V
    //   939: goto -> 943
    //   942: athrow
    //   943: getstatic Perryc.c : I
    //   946: iflt -> 960
    //   949: ldc2_w -1099903558
    //   952: l2i
    //   953: ldc_w 1416185730
    //   956: ixor
    //   957: goto -> 968
    //   960: ldc2_w -1103198509
    //   963: l2i
    //   964: ldc_w 425033166
    //   967: ixor
    //   968: ldc2_w -354639941
    //   971: l2i
    //   972: ldc_w 50065673
    //   975: ixor
    //   976: ixor
    //   977: lookupswitch default -> 1633, 37676170 -> 960, 1330419119 -> 1004
    //   1004: goto -> 1008
    //   1007: athrow
    //   1008: invokeinterface add : (Ljava/lang/Object;)Z
    //   1013: goto -> 1017
    //   1016: athrow
    //   1017: pop
    //   1018: getstatic Perryc.1 : I
    //   1021: ifeq -> 1035
    //   1024: ldc2_w -2096927631
    //   1027: l2i
    //   1028: ldc_w -748802626
    //   1031: ixor
    //   1032: goto -> 1043
    //   1035: ldc2_w -899551998
    //   1038: l2i
    //   1039: ldc_w 1982360024
    //   1042: ixor
    //   1043: ldc2_w -938101029
    //   1046: l2i
    //   1047: ldc_w -1017035176
    //   1050: ixor
    //   1051: ixor
    //   1052: lookupswitch default -> 1080, -586052344 -> 1035, 1529459020 -> 1645
    //   1080: aload_0
    //   1081: getstatic Perryc.0 : I
    //   1084: ifle -> 1098
    //   1087: ldc2_w 1643231907
    //   1090: l2i
    //   1091: ldc_w -1852966722
    //   1094: ixor
    //   1095: goto -> 1106
    //   1098: ldc2_w -1757710600
    //   1101: l2i
    //   1102: ldc_w 253836316
    //   1105: ixor
    //   1106: ldc2_w 342698455
    //   1109: l2i
    //   1110: ldc_w 1128818733
    //   1113: ixor
    //   1114: ixor
    //   1115: lookupswitch default -> 1653, -1487338521 -> 1098, -817951970 -> 1140
    //   1140: getfield taskList : Ljava/util/Queue;
    //   1143: new bigname/zprestige/webhack/util/InventoryUtil$Task
    //   1146: dup
    //   1147: getstatic Perryc.1 : I
    //   1150: ifeq -> 1164
    //   1153: ldc2_w -213620365
    //   1156: l2i
    //   1157: ldc_w -1690315151
    //   1160: ixor
    //   1161: goto -> 1172
    //   1164: ldc2_w 1261070178
    //   1167: l2i
    //   1168: ldc_w -1123346295
    //   1171: ixor
    //   1172: ldc2_w 880620109
    //   1175: l2i
    //   1176: ldc_w -1430265177
    //   1179: ixor
    //   1180: ixor
    //   1181: lookupswitch default -> 1208, -457136202 -> 1164, -155619352 -> 1639
    //   1208: iload_2
    //   1209: getstatic Perryc.1 : I
    //   1212: ifeq -> 1226
    //   1215: ldc2_w 1181033103
    //   1218: l2i
    //   1219: ldc_w 412044165
    //   1222: ixor
    //   1223: goto -> 1234
    //   1226: ldc2_w -1762127450
    //   1229: l2i
    //   1230: ldc_w 709461828
    //   1233: ixor
    //   1234: ldc2_w -352293994
    //   1237: l2i
    //   1238: ldc_w 917147332
    //   1241: ixor
    //   1242: ixor
    //   1243: lookupswitch default -> 1631, -2092921768 -> 1226, 1629189040 -> 1268
    //   1268: goto -> 1272
    //   1271: athrow
    //   1272: invokespecial <init> : (I)V
    //   1275: goto -> 1279
    //   1278: athrow
    //   1279: getstatic Perryc.1 : I
    //   1282: ifeq -> 1296
    //   1285: ldc2_w 101035035
    //   1288: l2i
    //   1289: ldc_w -2076767727
    //   1292: ixor
    //   1293: goto -> 1304
    //   1296: ldc2_w 223769111
    //   1299: l2i
    //   1300: ldc_w 1553521976
    //   1303: ixor
    //   1304: ldc2_w -78131696
    //   1307: l2i
    //   1308: ldc_w -1168332585
    //   1311: ixor
    //   1312: ixor
    //   1313: lookupswitch default -> 1669, -1019625267 -> 1296, 281397736 -> 1340
    //   1340: goto -> 1344
    //   1343: athrow
    //   1344: invokeinterface add : (Ljava/lang/Object;)Z
    //   1349: goto -> 1353
    //   1352: athrow
    //   1353: pop
    //   1354: getstatic Perryc.1 : I
    //   1357: ifeq -> 1371
    //   1360: ldc2_w 1434778538
    //   1363: l2i
    //   1364: ldc_w -1843073647
    //   1367: ixor
    //   1368: goto -> 1379
    //   1371: ldc2_w -1437127671
    //   1374: l2i
    //   1375: ldc_w 211767363
    //   1378: ixor
    //   1379: ldc2_w 1812933656
    //   1382: l2i
    //   1383: ldc_w -266923416
    //   1386: ixor
    //   1387: ixor
    //   1388: lookupswitch default -> 1635, 986726970 -> 1416, 1538795595 -> 1371
    //   1416: aload_0
    //   1417: getstatic Perryc.1 : I
    //   1420: ifeq -> 1434
    //   1423: ldc2_w -1586423274
    //   1426: l2i
    //   1427: ldc_w 709411520
    //   1430: ixor
    //   1431: goto -> 1442
    //   1434: ldc2_w -313170605
    //   1437: l2i
    //   1438: ldc_w -343964356
    //   1441: ixor
    //   1442: ldc2_w -300478348
    //   1445: l2i
    //   1446: ldc_w -947735057
    //   1449: ixor
    //   1450: ixor
    //   1451: lookupswitch default -> 1476, -1565754035 -> 1673, -255517688 -> 1434
    //   1476: getfield taskList : Ljava/util/Queue;
    //   1479: new bigname/zprestige/webhack/util/InventoryUtil$Task
    //   1482: dup
    //   1483: getstatic Perryc.c : I
    //   1486: iflt -> 1500
    //   1489: ldc2_w 1859232017
    //   1492: l2i
    //   1493: ldc_w 1947446037
    //   1496: ixor
    //   1497: goto -> 1508
    //   1500: ldc2_w 1194209277
    //   1503: l2i
    //   1504: ldc_w 1390477886
    //   1507: ixor
    //   1508: ldc2_w 1323033718
    //   1511: l2i
    //   1512: ldc_w -588933882
    //   1515: ixor
    //   1516: ixor
    //   1517: lookupswitch default -> 1544, -1996719244 -> 1647, 861537123 -> 1500
    //   1544: goto -> 1548
    //   1547: athrow
    //   1548: invokespecial <init> : ()V
    //   1551: goto -> 1555
    //   1554: athrow
    //   1555: getstatic Perryc.0 : I
    //   1558: ifle -> 1572
    //   1561: ldc2_w -1375843049
    //   1564: l2i
    //   1565: ldc_w -407841324
    //   1568: ixor
    //   1569: goto -> 1580
    //   1572: ldc2_w -915803772
    //   1575: l2i
    //   1576: ldc_w -2067493666
    //   1579: ixor
    //   1580: ldc2_w 1225678867
    //   1583: l2i
    //   1584: ldc_w 331618420
    //   1587: ixor
    //   1588: ixor
    //   1589: lookupswitch default -> 1637, 277143716 -> 1572, 392627517 -> 1616
    //   1616: goto -> 1620
    //   1619: athrow
    //   1620: invokeinterface add : (Ljava/lang/Object;)Z
    //   1625: goto -> 1629
    //   1628: athrow
    //   1629: pop
    //   1630: return
    //   1631: aconst_null
    //   1632: athrow
    //   1633: aconst_null
    //   1634: athrow
    //   1635: aconst_null
    //   1636: athrow
    //   1637: aconst_null
    //   1638: athrow
    //   1639: aconst_null
    //   1640: athrow
    //   1641: aconst_null
    //   1642: athrow
    //   1643: aconst_null
    //   1644: athrow
    //   1645: aconst_null
    //   1646: athrow
    //   1647: aconst_null
    //   1648: athrow
    //   1649: aconst_null
    //   1650: athrow
    //   1651: aconst_null
    //   1652: athrow
    //   1653: aconst_null
    //   1654: athrow
    //   1655: aconst_null
    //   1656: athrow
    //   1657: aconst_null
    //   1658: athrow
    //   1659: aconst_null
    //   1660: athrow
    //   1661: aconst_null
    //   1662: athrow
    //   1663: aconst_null
    //   1664: athrow
    //   1665: aconst_null
    //   1666: athrow
    //   1667: aconst_null
    //   1668: athrow
    //   1669: aconst_null
    //   1670: athrow
    //   1671: aconst_null
    //   1672: athrow
    //   1673: aconst_null
    //   1674: athrow
    //   1675: pop
    //   1676: goto -> 24
    //   1679: pop
    //   1680: aconst_null
    //   1681: goto -> 1675
    //   1684: dup
    //   1685: ifnull -> 1675
    //   1688: checkcast java/lang/Throwable
    //   1691: athrow
    //   1692: dup
    //   1693: ifnull -> 1679
    //   1696: checkcast java/lang/Throwable
    //   1699: athrow
    //   1700: aconst_null
    //   1701: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1607	0	this	Lbigname/zprestige/webhack/features/modules/Combat/Offhand;
    //   24	1607	1	slotIn	I
    //   24	1607	2	slotOut	I
    // Exception table:
    //   from	to	target	type
    //   8	20	1684	finally
    //   336	344	344	finally
    //   336	344	3	finally
    //   336	344	344	java/lang/NumberFormatException
    //   336	344	344	finally
    //   336	344	3	java/util/NoSuchElementException
    //   651	658	658	finally
    //   651	658	651	finally
    //   651	658	651	finally
    //   651	658	658	finally
    //   652	658	658	finally
    //   723	732	732	finally
    //   723	732	732	java/lang/UnsupportedOperationException
    //   724	732	3	finally
    //   724	732	723	java/lang/NullPointerException
    //   724	732	732	finally
    //   935	942	942	finally
    //   935	942	3	finally
    //   935	942	935	java/lang/IndexOutOfBoundsException
    //   936	942	935	finally
    //   936	942	942	java/lang/IndexOutOfBoundsException
    //   1007	1016	1016	finally
    //   1007	1016	3	finally
    //   1007	1016	1007	java/lang/ArithmeticException
    //   1008	1016	1007	finally
    //   1008	1016	3	finally
    //   1271	1278	1278	finally
    //   1271	1278	1271	java/lang/StringIndexOutOfBoundsException
    //   1271	1278	1271	java/lang/IllegalArgumentException
    //   1272	1278	1278	java/lang/ArrayIndexOutOfBoundsException
    //   1272	1278	1271	java/lang/NullPointerException
    //   1343	1352	1352	finally
    //   1343	1352	3	finally
    //   1343	1352	1343	java/lang/StringIndexOutOfBoundsException
    //   1343	1352	1352	finally
    //   1343	1352	3	finally
    //   1547	1554	1554	finally
    //   1547	1554	3	finally
    //   1547	1554	3	finally
    //   1548	1554	1547	finally
    //   1548	1554	3	java/lang/StringIndexOutOfBoundsException
    //   1619	1628	1628	finally
    //   1620	1628	1619	finally
    //   1620	1628	1628	java/lang/AssertionError
    //   1620	1628	1619	java/lang/NumberFormatException
    //   1620	1628	1619	java/lang/ArithmeticException
    //   1684	1692	1684	java/lang/UnsupportedOperationException
    //   1700	1702	3	java/lang/NullPointerException
  }
  
  public String getDisplayInfo() {
    return Perry1.h(this, (int)-1474996419L ^ 0xBD1B197B);
  }
  
  public int getLastSlot(Item paramItem, int paramInt) {
    return Perry1.6v(this, (int)945280948L ^ 0x5AA33861, paramItem, paramInt);
  }
  
  public void doOffhand() {
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
  
  public static boolean lambda$doOffhand$1(ItemStack paramItemStack) {
    return Perry1.0y(null, (int)128060650L ^ 0x129F2A4B, paramItemStack);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\Offhand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */