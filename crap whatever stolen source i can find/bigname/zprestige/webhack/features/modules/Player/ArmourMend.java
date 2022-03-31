package bigname.zprestige.webhack.features.modules.Player;

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

public class ArmourMend extends Module {
  public boolean flag;
  
  public Setting<Integer> repair;
  
  public Timer timer;
  
  public boolean curse;
  
  public List<Integer> doneSlots;
  
  public int zprestigeproarmormanezmadcopennwhyuread;
  
  public boolean mendingTakeOff;
  
  public Integer actions;
  
  public Setting<Integer> closestEnemy;
  
  public Queue<InventoryUtil.Task> taskList;
  
  public void onTick() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 15452
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 15444
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 15436
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 40
    //   30: ldc2_w -1099944882
    //   33: l2i
    //   34: ldc -1528996694
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 1463020886
    //   43: l2i
    //   44: ldc -1355225914
    //   46: ixor
    //   47: ldc2_w 1272238783
    //   50: l2i
    //   51: ldc -987176725
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 15407, -1806613840 -> 40, 1995914180 -> 80
    //   80: goto -> 84
    //   83: athrow
    //   84: invokestatic fullNullCheck : ()Z
    //   87: goto -> 91
    //   90: athrow
    //   91: ifne -> 104
    //   94: ldc2_w -1558021116
    //   97: l2i
    //   98: ldc 414194668
    //   100: ixor
    //   101: goto -> 111
    //   104: ldc2_w 285604703
    //   107: l2i
    //   108: ldc -1432904522
    //   110: ixor
    //   111: ldc2_w 430753371
    //   114: l2i
    //   115: ldc -722647467
    //   117: ixor
    //   118: ixor
    //   119: tableswitch default -> 94, 1993598950 -> 140, 1993598951 -> 484
    //   140: getstatic Perryc.0 : I
    //   143: ifle -> 156
    //   146: ldc2_w -1585216313
    //   149: l2i
    //   150: ldc 221174545
    //   152: ixor
    //   153: goto -> 163
    //   156: ldc2_w 1896265821
    //   159: l2i
    //   160: ldc 1999483316
    //   162: ixor
    //   163: ldc2_w -516865976
    //   166: l2i
    //   167: ldc 592926769
    //   169: ixor
    //   170: ixor
    //   171: lookupswitch default -> 15233, -1001582192 -> 196, 1858815919 -> 156
    //   196: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoArmor.mc : Lnet/minecraft/client/Minecraft;
    //   199: getstatic Perryc.1 : I
    //   202: ifeq -> 215
    //   205: ldc2_w 1902775828
    //   208: l2i
    //   209: ldc -1070636853
    //   211: ixor
    //   212: goto -> 222
    //   215: ldc2_w -76560318
    //   218: l2i
    //   219: ldc -625305187
    //   221: ixor
    //   222: ldc2_w -1486520415
    //   225: l2i
    //   226: ldc 665884226
    //   228: ixor
    //   229: ixor
    //   230: lookupswitch default -> 256, 831555388 -> 15109, 1489952015 -> 215
    //   256: getfield field_71462_r : Lnet/minecraft/client/gui/GuiScreen;
    //   259: instanceof net/minecraft/client/gui/inventory/GuiContainer
    //   262: ifeq -> 275
    //   265: ldc2_w -2116170901
    //   268: l2i
    //   269: ldc 2059485444
    //   271: ixor
    //   272: goto -> 282
    //   275: ldc2_w 1196162850
    //   278: l2i
    //   279: ldc -1135119026
    //   281: ixor
    //   282: ldc2_w -1551553186
    //   285: l2i
    //   286: ldc 902282792
    //   288: ixor
    //   289: ixor
    //   290: tableswitch default -> 265, 1834883353 -> 312, 1834883354 -> 485
    //   312: getstatic Perryc.c : I
    //   315: iflt -> 328
    //   318: ldc2_w 1832977567
    //   321: l2i
    //   322: ldc -598370396
    //   324: ixor
    //   325: goto -> 335
    //   328: ldc2_w -1651766461
    //   331: l2i
    //   332: ldc -1551883262
    //   334: ixor
    //   335: ldc2_w 1185656304
    //   338: l2i
    //   339: ldc 737070565
    //   341: ixor
    //   342: ixor
    //   343: lookupswitch default -> 368, -598609106 -> 15077, 398523025 -> 328
    //   368: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoArmor.mc : Lnet/minecraft/client/Minecraft;
    //   371: getstatic Perryc.c : I
    //   374: iflt -> 387
    //   377: ldc2_w 875210029
    //   380: l2i
    //   381: ldc -959943975
    //   383: ixor
    //   384: goto -> 394
    //   387: ldc2_w 886647750
    //   390: l2i
    //   391: ldc 421565881
    //   393: ixor
    //   394: ldc2_w 673640633
    //   397: l2i
    //   398: ldc -1600354034
    //   400: ixor
    //   401: ixor
    //   402: lookupswitch default -> 428, 1959901570 -> 387, 2052634179 -> 15137
    //   428: getfield field_71462_r : Lnet/minecraft/client/gui/GuiScreen;
    //   431: instanceof net/minecraft/client/gui/inventory/GuiInventory
    //   434: ifne -> 447
    //   437: ldc2_w -1032263074
    //   440: l2i
    //   441: ldc -1376544226
    //   443: ixor
    //   444: goto -> 454
    //   447: ldc2_w 718284591
    //   450: l2i
    //   451: ldc 1163614056
    //   453: ixor
    //   454: ldc2_w -1670295647
    //   457: l2i
    //   458: ldc 2003438058
    //   460: ixor
    //   461: ixor
    //   462: tableswitch default -> 437, -2070923765 -> 484, -2070923764 -> 485
    //   484: return
    //   485: getstatic Perryc.1 : I
    //   488: ifeq -> 501
    //   491: ldc2_w 226484251
    //   494: l2i
    //   495: ldc 891938030
    //   497: ixor
    //   498: goto -> 508
    //   501: ldc2_w 487396648
    //   504: l2i
    //   505: ldc 112617368
    //   507: ixor
    //   508: ldc2_w -1094311851
    //   511: l2i
    //   512: ldc -332364662
    //   514: ixor
    //   515: ixor
    //   516: lookupswitch default -> 544, -1010858527 -> 501, 1788911658 -> 15151
    //   544: aload_0
    //   545: getstatic Perryc.0 : I
    //   548: ifle -> 561
    //   551: ldc2_w -1003555782
    //   554: l2i
    //   555: ldc -741346507
    //   557: ixor
    //   558: goto -> 568
    //   561: ldc2_w 886610194
    //   564: l2i
    //   565: ldc 626997911
    //   567: ixor
    //   568: ldc2_w -865899685
    //   571: l2i
    //   572: ldc 1351670403
    //   574: ixor
    //   575: ixor
    //   576: lookupswitch default -> 604, -1961707817 -> 15417, -403712641 -> 561
    //   604: getfield taskList : Ljava/util/Queue;
    //   607: getstatic Perryc.1 : I
    //   610: ifeq -> 623
    //   613: ldc2_w 425391296
    //   616: l2i
    //   617: ldc -893910306
    //   619: ixor
    //   620: goto -> 630
    //   623: ldc2_w 695441152
    //   626: l2i
    //   627: ldc -2061640941
    //   629: ixor
    //   630: ldc2_w 1132914681
    //   633: l2i
    //   634: ldc 269891833
    //   636: ixor
    //   637: ixor
    //   638: lookupswitch default -> 15099, -2140002018 -> 623, -93421 -> 664
    //   664: goto -> 668
    //   667: athrow
    //   668: invokeinterface isEmpty : ()Z
    //   673: goto -> 677
    //   676: athrow
    //   677: ifeq -> 690
    //   680: ldc2_w -223880331
    //   683: l2i
    //   684: ldc 592188833
    //   686: ixor
    //   687: goto -> 697
    //   690: ldc2_w -2144399950
    //   693: l2i
    //   694: ldc 1371849569
    //   696: ixor
    //   697: ldc2_w 1766346051
    //   700: l2i
    //   701: ldc -855471300
    //   703: ixor
    //   704: ixor
    //   705: tableswitch default -> 680, 1973487787 -> 728, 1973487788 -> 13283
    //   728: getstatic Perryc.c : I
    //   731: iflt -> 744
    //   734: ldc2_w 328773828
    //   737: l2i
    //   738: ldc 1003329296
    //   740: ixor
    //   741: goto -> 751
    //   744: ldc2_w 362023013
    //   747: l2i
    //   748: ldc -1397240835
    //   750: ixor
    //   751: ldc2_w 543853737
    //   754: l2i
    //   755: ldc 1166291544
    //   757: ixor
    //   758: ixor
    //   759: lookupswitch default -> 784, 1304140069 -> 15145, 1657000870 -> 744
    //   784: aload_0
    //   785: getstatic Perryc.0 : I
    //   788: ifle -> 801
    //   791: ldc2_w -230341911
    //   794: l2i
    //   795: ldc -1683668048
    //   797: ixor
    //   798: goto -> 808
    //   801: ldc2_w 1259185634
    //   804: l2i
    //   805: ldc 802925313
    //   807: ixor
    //   808: ldc2_w 2135455697
    //   811: l2i
    //   812: ldc 711420059
    //   814: ixor
    //   815: ixor
    //   816: lookupswitch default -> 844, -682245339 -> 801, 1020206611 -> 15159
    //   844: getfield mendingTakeOff : Z
    //   847: ifeq -> 860
    //   850: ldc2_w 22663602
    //   853: l2i
    //   854: ldc -1611948946
    //   856: ixor
    //   857: goto -> 867
    //   860: ldc2_w 629678479
    //   863: l2i
    //   864: ldc -1153799124
    //   866: ixor
    //   867: ldc2_w 1868377499
    //   870: l2i
    //   871: ldc -1061464072
    //   873: ixor
    //   874: ixor
    //   875: tableswitch default -> 850, 827602879 -> 896, 827602880 -> 13153
    //   896: ldc net/minecraft/item/ItemExpBottle
    //   898: getstatic Perryc.1 : I
    //   901: ifeq -> 914
    //   904: ldc2_w -434590022
    //   907: l2i
    //   908: ldc -1655771600
    //   910: ixor
    //   911: goto -> 921
    //   914: ldc2_w -978880654
    //   917: l2i
    //   918: ldc -99577144
    //   920: ixor
    //   921: ldc2_w -75427265
    //   924: l2i
    //   925: ldc -1538906173
    //   927: ixor
    //   928: ixor
    //   929: lookupswitch default -> 956, 613512566 -> 15357, 2116280859 -> 914
    //   956: goto -> 960
    //   959: athrow
    //   960: invokestatic holdingItem : (Ljava/lang/Class;)Z
    //   963: goto -> 967
    //   966: athrow
    //   967: ifeq -> 981
    //   970: ldc2_w -324040698
    //   973: l2i
    //   974: ldc_w -1593543310
    //   977: ixor
    //   978: goto -> 989
    //   981: ldc2_w 1624664923
    //   984: l2i
    //   985: ldc_w 763205164
    //   988: ixor
    //   989: ldc2_w -1005557350
    //   992: l2i
    //   993: ldc_w 777671399
    //   996: ixor
    //   997: ixor
    //   998: tableswitch default -> 970, -1478375927 -> 1020, -1478375926 -> 13153
    //   1020: getstatic Perryc.0 : I
    //   1023: ifle -> 1037
    //   1026: ldc2_w 422889618
    //   1029: l2i
    //   1030: ldc_w 154847133
    //   1033: ixor
    //   1034: goto -> 1045
    //   1037: ldc2_w 621437171
    //   1040: l2i
    //   1041: ldc_w 1107061627
    //   1044: ixor
    //   1045: ldc2_w -1330731906
    //   1048: l2i
    //   1049: ldc_w 530783205
    //   1052: ixor
    //   1053: ixor
    //   1054: lookupswitch default -> 1080, -1090277228 -> 15241, 1007686300 -> 1037
    //   1080: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoArmor.mc : Lnet/minecraft/client/Minecraft;
    //   1083: getstatic Perryc.1 : I
    //   1086: ifeq -> 1100
    //   1089: ldc2_w 192403932
    //   1092: l2i
    //   1093: ldc_w 522215168
    //   1096: ixor
    //   1097: goto -> 1108
    //   1100: ldc2_w -1994121341
    //   1103: l2i
    //   1104: ldc_w 1489410648
    //   1107: ixor
    //   1108: ldc2_w 1730182489
    //   1111: l2i
    //   1112: ldc_w -216464388
    //   1115: ixor
    //   1116: ixor
    //   1117: lookupswitch default -> 15371, -2140211079 -> 1100, 1172044670 -> 1144
    //   1144: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   1147: getstatic Perryc.c : I
    //   1150: iflt -> 1164
    //   1153: ldc2_w 1351738480
    //   1156: l2i
    //   1157: ldc_w -188411425
    //   1160: ixor
    //   1161: goto -> 1172
    //   1164: ldc2_w 1184973065
    //   1167: l2i
    //   1168: ldc_w -1706861132
    //   1171: ixor
    //   1172: ldc2_w -632588657
    //   1175: l2i
    //   1176: ldc_w -1921511370
    //   1179: ixor
    //   1180: ixor
    //   1181: lookupswitch default -> 1208, -211315946 -> 15309, 407795748 -> 1164
    //   1208: getfield field_74313_G : Lnet/minecraft/client/settings/KeyBinding;
    //   1211: getstatic Perryc.c : I
    //   1214: iflt -> 1228
    //   1217: ldc2_w 1344149400
    //   1220: l2i
    //   1221: ldc_w -2082113724
    //   1224: ixor
    //   1225: goto -> 1236
    //   1228: ldc2_w -988872217
    //   1231: l2i
    //   1232: ldc_w 754810225
    //   1235: ixor
    //   1236: ldc2_w 24870972
    //   1239: l2i
    //   1240: ldc_w 1883853627
    //   1243: ixor
    //   1244: ixor
    //   1245: lookupswitch default -> 1272, -1563839525 -> 15027, 313357132 -> 1228
    //   1272: goto -> 1276
    //   1275: athrow
    //   1276: invokevirtual func_151470_d : ()Z
    //   1279: goto -> 1283
    //   1282: athrow
    //   1283: ifeq -> 1297
    //   1286: ldc2_w -2047127304
    //   1289: l2i
    //   1290: ldc_w 929458136
    //   1293: ixor
    //   1294: goto -> 1305
    //   1297: ldc2_w -119945310
    //   1300: l2i
    //   1301: ldc_w 1246032003
    //   1304: ixor
    //   1305: ldc2_w -1258388531
    //   1308: l2i
    //   1309: ldc_w 176940811
    //   1312: ixor
    //   1313: ixor
    //   1314: tableswitch default -> 1286, 216552422 -> 1336, 216552423 -> 13153
    //   1336: getstatic Perryc.1 : I
    //   1339: ifeq -> 1353
    //   1342: ldc2_w 1717908265
    //   1345: l2i
    //   1346: ldc_w -1268444687
    //   1349: ixor
    //   1350: goto -> 1361
    //   1353: ldc2_w -567327337
    //   1356: l2i
    //   1357: ldc_w -532240685
    //   1360: ixor
    //   1361: ldc2_w -861582147
    //   1364: l2i
    //   1365: ldc_w 1941146219
    //   1368: ixor
    //   1369: ixor
    //   1370: lookupswitch default -> 1396, 1582814193 -> 1353, 1830216718 -> 15377
    //   1396: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoArmor.mc : Lnet/minecraft/client/Minecraft;
    //   1399: getstatic Perryc.c : I
    //   1402: iflt -> 1416
    //   1405: ldc2_w -664896924
    //   1408: l2i
    //   1409: ldc_w 496322883
    //   1412: ixor
    //   1413: goto -> 1424
    //   1416: ldc2_w 963148286
    //   1419: l2i
    //   1420: ldc_w 1713456439
    //   1423: ixor
    //   1424: ldc2_w 1649365934
    //   1427: l2i
    //   1428: ldc_w 1144092913
    //   1431: ixor
    //   1432: ixor
    //   1433: lookupswitch default -> 1460, -474670984 -> 15173, 1162551244 -> 1416
    //   1460: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1463: getstatic Perryc.1 : I
    //   1466: ifeq -> 1480
    //   1469: ldc2_w -781612435
    //   1472: l2i
    //   1473: ldc_w -306268394
    //   1476: ixor
    //   1477: goto -> 1488
    //   1480: ldc2_w 1011107726
    //   1483: l2i
    //   1484: ldc_w -1922852585
    //   1487: ixor
    //   1488: ldc2_w 11939673
    //   1491: l2i
    //   1492: ldc_w 2120546967
    //   1495: ixor
    //   1496: ixor
    //   1497: lookupswitch default -> 15095, -806024361 -> 1524, 1107683509 -> 1480
    //   1524: getfield field_73010_i : Ljava/util/List;
    //   1527: getstatic Perryc.0 : I
    //   1530: ifle -> 1544
    //   1533: ldc2_w -702624264
    //   1536: l2i
    //   1537: ldc_w 1510476760
    //   1540: ixor
    //   1541: goto -> 1552
    //   1544: ldc2_w -1762097264
    //   1547: l2i
    //   1548: ldc_w -546007737
    //   1551: ixor
    //   1552: ldc2_w -353792283
    //   1555: l2i
    //   1556: ldc_w -2109231443
    //   1559: ixor
    //   1560: ixor
    //   1561: lookupswitch default -> 15265, -457644440 -> 1544, 555889311 -> 1588
    //   1588: goto -> 1592
    //   1591: athrow
    //   1592: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   1597: goto -> 1601
    //   1600: athrow
    //   1601: getstatic Perryc.c : I
    //   1604: iflt -> 1618
    //   1607: ldc2_w 1707759131
    //   1610: l2i
    //   1611: ldc_w -86446547
    //   1614: ixor
    //   1615: goto -> 1626
    //   1618: ldc2_w -2061036302
    //   1621: l2i
    //   1622: ldc_w 672910805
    //   1625: ixor
    //   1626: ldc2_w 537874410
    //   1629: l2i
    //   1630: ldc_w -1828483610
    //   1633: ixor
    //   1634: ixor
    //   1635: lookupswitch default -> 15385, 506469163 -> 1660, 740194874 -> 1618
    //   1660: aload_0
    //   1661: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/ArmourMend;)Ljava/util/function/Predicate;
    //   1666: getstatic Perryc.1 : I
    //   1669: ifeq -> 1683
    //   1672: ldc2_w 1148054945
    //   1675: l2i
    //   1676: ldc_w 223218177
    //   1679: ixor
    //   1680: goto -> 1691
    //   1683: ldc2_w 1115855214
    //   1686: l2i
    //   1687: ldc_w -1693034625
    //   1690: ixor
    //   1691: ldc2_w 2131759094
    //   1694: l2i
    //   1695: ldc_w 580952
    //   1698: ixor
    //   1699: ixor
    //   1700: lookupswitch default -> 15335, -1500767041 -> 1728, 909849870 -> 1683
    //   1728: goto -> 1732
    //   1731: athrow
    //   1732: invokeinterface noneMatch : (Ljava/util/function/Predicate;)Z
    //   1737: goto -> 1741
    //   1740: athrow
    //   1741: ifeq -> 1755
    //   1744: ldc2_w 395198895
    //   1747: l2i
    //   1748: ldc_w 675216030
    //   1751: ixor
    //   1752: goto -> 1763
    //   1755: ldc2_w -452617422
    //   1758: l2i
    //   1759: ldc_w -625663998
    //   1762: ixor
    //   1763: ldc2_w 78446435
    //   1766: l2i
    //   1767: ldc_w 417373352
    //   1770: ixor
    //   1771: ixor
    //   1772: tableswitch default -> 1744, 603773178 -> 1796, 603773179 -> 13153
    //   1796: getstatic Perryc.0 : I
    //   1799: ifle -> 1813
    //   1802: ldc2_w -183591284
    //   1805: l2i
    //   1806: ldc_w 1665398561
    //   1809: ixor
    //   1810: goto -> 1821
    //   1813: ldc2_w 515302410
    //   1816: l2i
    //   1817: ldc_w -1693135399
    //   1820: ixor
    //   1821: ldc2_w 566038813
    //   1824: l2i
    //   1825: ldc_w -799102155
    //   1828: ixor
    //   1829: ixor
    //   1830: lookupswitch default -> 15201, 1739510661 -> 1813, 1950454779 -> 1856
    //   1856: aload_0
    //   1857: getstatic Perryc.0 : I
    //   1860: ifle -> 1874
    //   1863: ldc2_w 1878276147
    //   1866: l2i
    //   1867: ldc_w -1387085386
    //   1870: ixor
    //   1871: goto -> 1882
    //   1874: ldc2_w -1677478272
    //   1877: l2i
    //   1878: ldc_w -321235023
    //   1881: ixor
    //   1882: ldc2_w -1870110721
    //   1885: l2i
    //   1886: ldc_w 955740502
    //   1889: ixor
    //   1890: ixor
    //   1891: lookupswitch default -> 15379, -660156520 -> 1916, 1792661292 -> 1874
    //   1916: getfield flag : Z
    //   1919: ifne -> 1933
    //   1922: ldc2_w 2104960978
    //   1925: l2i
    //   1926: ldc_w 348551259
    //   1929: ixor
    //   1930: goto -> 1941
    //   1933: ldc2_w 2137298397
    //   1936: l2i
    //   1937: ldc_w 383109715
    //   1940: ixor
    //   1941: ldc2_w -1164659156
    //   1944: l2i
    //   1945: ldc_w -2017328266
    //   1948: ixor
    //   1949: ixor
    //   1950: tableswitch default -> 1922, 1424485075 -> 1972, 1424485076 -> 13153
    //   1972: ldc2_w -715674015
    //   1975: l2i
    //   1976: ldc_w -715674015
    //   1979: ixor
    //   1980: getstatic Perryc.1 : I
    //   1983: ifeq -> 1997
    //   1986: ldc2_w 1167350635
    //   1989: l2i
    //   1990: ldc_w -1773536311
    //   1993: ixor
    //   1994: goto -> 2005
    //   1997: ldc2_w -940666348
    //   2000: l2i
    //   2001: ldc_w -582417842
    //   2004: ixor
    //   2005: ldc2_w 379028519
    //   2008: l2i
    //   2009: ldc_w 827998547
    //   2012: ixor
    //   2013: ixor
    //   2014: lookupswitch default -> 2040, -200251946 -> 15333, -156498495 -> 1997
    //   2040: istore #10
    //   2042: getstatic Perryc.c : I
    //   2045: iflt -> 2059
    //   2048: ldc2_w -1460620009
    //   2051: l2i
    //   2052: ldc_w -1320687528
    //   2055: ixor
    //   2056: goto -> 2067
    //   2059: ldc2_w -598437587
    //   2062: l2i
    //   2063: ldc_w -29412100
    //   2066: ixor
    //   2067: ldc2_w -1716795546
    //   2070: l2i
    //   2071: ldc_w -1535974658
    //   2074: ixor
    //   2075: ixor
    //   2076: lookupswitch default -> 15283, 531791945 -> 2104, 611219671 -> 2059
    //   2104: goto -> 2108
    //   2107: athrow
    //   2108: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Combat/AutoArmor;
    //   2111: goto -> 2115
    //   2114: athrow
    //   2115: getstatic Perryc.0 : I
    //   2118: ifle -> 2132
    //   2121: ldc2_w 98472468
    //   2124: l2i
    //   2125: ldc_w 1426848993
    //   2128: ixor
    //   2129: goto -> 2140
    //   2132: ldc2_w 1051127187
    //   2135: l2i
    //   2136: ldc_w -1399205167
    //   2139: ixor
    //   2140: ldc2_w 752999449
    //   2143: l2i
    //   2144: ldc_w -695831228
    //   2147: ixor
    //   2148: ixor
    //   2149: lookupswitch default -> 15029, -1431124056 -> 2132, 1750636063 -> 2176
    //   2176: goto -> 2180
    //   2179: athrow
    //   2180: invokevirtual isEnabled : ()Z
    //   2183: goto -> 2187
    //   2186: athrow
    //   2187: ifeq -> 2201
    //   2190: ldc2_w -294917883
    //   2193: l2i
    //   2194: ldc_w -1597455263
    //   2197: ixor
    //   2198: goto -> 2209
    //   2201: ldc2_w -1269100902
    //   2204: l2i
    //   2205: ldc_w -84401155
    //   2208: ixor
    //   2209: ldc2_w 378085789
    //   2212: l2i
    //   2213: ldc_w 1977437292
    //   2216: ixor
    //   2217: ixor
    //   2218: tableswitch default -> 2190, 771178645 -> 2240, 771178646 -> 2700
    //   2240: getstatic Perryc.1 : I
    //   2243: ifeq -> 2257
    //   2246: ldc2_w -478560033
    //   2249: l2i
    //   2250: ldc_w 563246865
    //   2253: ixor
    //   2254: goto -> 2265
    //   2257: ldc2_w -282132411
    //   2260: l2i
    //   2261: ldc_w 1712880068
    //   2264: ixor
    //   2265: ldc2_w -135315595
    //   2268: l2i
    //   2269: ldc_w 512612646
    //   2272: ixor
    //   2273: ixor
    //   2274: lookupswitch default -> 2300, -393803377 -> 2257, 730419613 -> 15305
    //   2300: aload_0
    //   2301: getstatic Perryc.1 : I
    //   2304: ifeq -> 2318
    //   2307: ldc2_w 767773105
    //   2310: l2i
    //   2311: ldc_w 53445067
    //   2314: ixor
    //   2315: goto -> 2326
    //   2318: ldc2_w 904135827
    //   2321: l2i
    //   2322: ldc_w 1102227281
    //   2325: ixor
    //   2326: ldc2_w -1002313836
    //   2329: l2i
    //   2330: ldc_w 2069660719
    //   2333: ixor
    //   2334: ixor
    //   2335: lookupswitch default -> 2360, -1846432831 -> 15287, 1605374953 -> 2318
    //   2360: getfield flag : Z
    //   2363: ldc2_w 91487666
    //   2366: l2i
    //   2367: ldc_w 91487667
    //   2370: ixor
    //   2371: if_icmpne -> 2385
    //   2374: ldc2_w -1203807748
    //   2377: l2i
    //   2378: ldc_w 1949425186
    //   2381: ixor
    //   2382: goto -> 2393
    //   2385: ldc2_w -2036618836
    //   2388: l2i
    //   2389: ldc_w 1251290739
    //   2392: ixor
    //   2393: ldc2_w 305615598
    //   2396: l2i
    //   2397: ldc_w -396156562
    //   2400: ixor
    //   2401: ixor
    //   2402: tableswitch default -> 2374, 911930462 -> 2424, 911930463 -> 2700
    //   2424: getstatic Perryc.1 : I
    //   2427: ifeq -> 2441
    //   2430: ldc2_w 1527422353
    //   2433: l2i
    //   2434: ldc_w 888634088
    //   2437: ixor
    //   2438: goto -> 2449
    //   2441: ldc2_w -647340938
    //   2444: l2i
    //   2445: ldc_w -766538616
    //   2448: ixor
    //   2449: ldc2_w 1815680602
    //   2452: l2i
    //   2453: ldc_w -1158036417
    //   2456: ixor
    //   2457: ixor
    //   2458: lookupswitch default -> 15157, -1187171044 -> 2441, -572194149 -> 2484
    //   2484: goto -> 2488
    //   2487: athrow
    //   2488: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Combat/AutoArmor;
    //   2491: goto -> 2495
    //   2494: athrow
    //   2495: getstatic Perryc.1 : I
    //   2498: ifeq -> 2512
    //   2501: ldc2_w 1708544055
    //   2504: l2i
    //   2505: ldc_w -903559210
    //   2508: ixor
    //   2509: goto -> 2520
    //   2512: ldc2_w 1419949603
    //   2515: l2i
    //   2516: ldc_w 409480692
    //   2519: ixor
    //   2520: ldc2_w -1111835115
    //   2523: l2i
    //   2524: ldc_w -1222743639
    //   2527: ixor
    //   2528: ixor
    //   2529: lookupswitch default -> 15033, -1521074083 -> 2512, 1181633643 -> 2556
    //   2556: goto -> 2560
    //   2559: athrow
    //   2560: invokevirtual disable : ()V
    //   2563: goto -> 2567
    //   2566: athrow
    //   2567: getstatic Perryc.0 : I
    //   2570: ifle -> 2584
    //   2573: ldc2_w -528573976
    //   2576: l2i
    //   2577: ldc_w 1332977676
    //   2580: ixor
    //   2581: goto -> 2592
    //   2584: ldc2_w 689081206
    //   2587: l2i
    //   2588: ldc_w 1083478924
    //   2591: ixor
    //   2592: ldc2_w 1837295528
    //   2595: l2i
    //   2596: ldc_w -1220446558
    //   2599: ixor
    //   2600: ixor
    //   2601: lookupswitch default -> 15125, -1287288336 -> 2628, 1976477934 -> 2584
    //   2628: aload_0
    //   2629: ldc2_w 1612971087
    //   2632: l2i
    //   2633: ldc_w 1612971086
    //   2636: ixor
    //   2637: getstatic Perryc.1 : I
    //   2640: ifeq -> 2654
    //   2643: ldc2_w -456124610
    //   2646: l2i
    //   2647: ldc_w -270668043
    //   2650: ixor
    //   2651: goto -> 2662
    //   2654: ldc2_w 480929960
    //   2657: l2i
    //   2658: ldc_w 317184018
    //   2661: ixor
    //   2662: ldc2_w 1147346401
    //   2665: l2i
    //   2666: ldc_w -1587368923
    //   2669: ixor
    //   2670: ixor
    //   2671: lookupswitch default -> 2696, -301185009 -> 15189, 1800107881 -> 2654
    //   2696: putfield zprestigeproarmormanezmadcopennwhyuread : I
    //   2699: return
    //   2700: getstatic Perryc.1 : I
    //   2703: ifeq -> 2717
    //   2706: ldc2_w 1013061735
    //   2709: l2i
    //   2710: ldc_w -792566278
    //   2713: ixor
    //   2714: goto -> 2725
    //   2717: ldc2_w 1863484824
    //   2720: l2i
    //   2721: ldc_w 1740176055
    //   2724: ixor
    //   2725: ldc2_w -1432436733
    //   2728: l2i
    //   2729: ldc_w 271090492
    //   2732: ixor
    //   2733: ixor
    //   2734: lookupswitch default -> 15101, -1306772464 -> 2760, 1444298402 -> 2717
    //   2760: aload_0
    //   2761: getstatic Perryc.1 : I
    //   2764: ifeq -> 2778
    //   2767: ldc2_w -756372537
    //   2770: l2i
    //   2771: ldc_w -2094154081
    //   2774: ixor
    //   2775: goto -> 2786
    //   2778: ldc2_w 454571145
    //   2781: l2i
    //   2782: ldc_w 1607971221
    //   2785: ixor
    //   2786: ldc2_w -679284541
    //   2789: l2i
    //   2790: ldc_w 1841081768
    //   2793: ixor
    //   2794: ixor
    //   2795: lookupswitch default -> 2820, -1897590635 -> 2778, -335984589 -> 15161
    //   2820: goto -> 2824
    //   2823: athrow
    //   2824: invokespecial getArmor : ()Ljava/util/Map;
    //   2827: goto -> 2831
    //   2830: athrow
    //   2831: getstatic Perryc.c : I
    //   2834: iflt -> 2848
    //   2837: ldc2_w -796886066
    //   2840: l2i
    //   2841: ldc_w 178566396
    //   2844: ixor
    //   2845: goto -> 2856
    //   2848: ldc2_w -1948780902
    //   2851: l2i
    //   2852: ldc_w 1152030113
    //   2855: ixor
    //   2856: ldc2_w 1177219178
    //   2859: l2i
    //   2860: ldc_w 100004106
    //   2863: ixor
    //   2864: ixor
    //   2865: lookupswitch default -> 2892, -1711550894 -> 15123, -64679468 -> 2848
    //   2892: goto -> 2896
    //   2895: athrow
    //   2896: invokeinterface entrySet : ()Ljava/util/Set;
    //   2901: goto -> 2905
    //   2904: athrow
    //   2905: getstatic Perryc.1 : I
    //   2908: ifeq -> 2922
    //   2911: ldc2_w 1360343102
    //   2914: l2i
    //   2915: ldc_w -287731501
    //   2918: ixor
    //   2919: goto -> 2930
    //   2922: ldc2_w 950399771
    //   2925: l2i
    //   2926: ldc_w 1871459870
    //   2929: ixor
    //   2930: ldc2_w 665331557
    //   2933: l2i
    //   2934: ldc_w -1115244222
    //   2937: ixor
    //   2938: ixor
    //   2939: lookupswitch default -> 2964, 635584202 -> 15321, 1202339912 -> 2922
    //   2964: goto -> 2968
    //   2967: athrow
    //   2968: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2973: goto -> 2977
    //   2976: athrow
    //   2977: getstatic Perryc.1 : I
    //   2980: ifeq -> 2994
    //   2983: ldc2_w 1298564287
    //   2986: l2i
    //   2987: ldc_w -1213497782
    //   2990: ixor
    //   2991: goto -> 3002
    //   2994: ldc2_w -944296766
    //   2997: l2i
    //   2998: ldc_w -410647390
    //   3001: ixor
    //   3002: ldc2_w 1555428397
    //   3005: l2i
    //   3006: ldc_w -2087441120
    //   3009: ixor
    //   3010: ixor
    //   3011: lookupswitch default -> 3036, -166136846 -> 2994, 636232696 -> 15369
    //   3036: astore #11
    //   3038: getstatic Perryc.1 : I
    //   3041: ifeq -> 3055
    //   3044: ldc2_w 1471511009
    //   3047: l2i
    //   3048: ldc_w -1767768820
    //   3051: ixor
    //   3052: goto -> 3063
    //   3055: ldc2_w 1391725089
    //   3058: l2i
    //   3059: ldc_w 2011773063
    //   3062: ixor
    //   3063: ldc2_w 1662490197
    //   3066: l2i
    //   3067: ldc_w -1556647
    //   3070: ixor
    //   3071: ixor
    //   3072: lookupswitch default -> 15237, -1176331350 -> 3100, 1575693793 -> 3055
    //   3100: aload #11
    //   3102: getstatic Perryc.0 : I
    //   3105: ifle -> 3119
    //   3108: ldc2_w 1215422067
    //   3111: l2i
    //   3112: ldc_w -452539378
    //   3115: ixor
    //   3116: goto -> 3127
    //   3119: ldc2_w -2072167004
    //   3122: l2i
    //   3123: ldc_w 2089719964
    //   3126: ixor
    //   3127: ldc2_w -277157947
    //   3130: l2i
    //   3131: ldc_w -182334150
    //   3134: ixor
    //   3135: ixor
    //   3136: lookupswitch default -> 3164, -1221838718 -> 15085, 1893240466 -> 3119
    //   3164: goto -> 3168
    //   3167: athrow
    //   3168: invokeinterface hasNext : ()Z
    //   3173: goto -> 3177
    //   3176: athrow
    //   3177: ifeq -> 3191
    //   3180: ldc2_w -73502472
    //   3183: l2i
    //   3184: ldc_w -1864783525
    //   3187: ixor
    //   3188: goto -> 3199
    //   3191: ldc2_w 1723801459
    //   3194: l2i
    //   3195: ldc_w 234407633
    //   3198: ixor
    //   3199: ldc2_w 1249564866
    //   3202: l2i
    //   3203: ldc_w 796593733
    //   3206: ixor
    //   3207: ixor
    //   3208: tableswitch default -> 3180, 239472420 -> 3232, 239472421 -> 4789
    //   3232: getstatic Perryc.0 : I
    //   3235: ifle -> 3249
    //   3238: ldc2_w -1755116187
    //   3241: l2i
    //   3242: ldc_w 1553339193
    //   3245: ixor
    //   3246: goto -> 3257
    //   3249: ldc2_w -605999640
    //   3252: l2i
    //   3253: ldc_w 1738510460
    //   3256: ixor
    //   3257: ldc2_w 1506392844
    //   3260: l2i
    //   3261: ldc_w 1345803264
    //   3264: ixor
    //   3265: ixor
    //   3266: lookupswitch default -> 15249, -1249881448 -> 3292, -1039404720 -> 3249
    //   3292: aload #11
    //   3294: getstatic Perryc.1 : I
    //   3297: ifeq -> 3311
    //   3300: ldc2_w -358907718
    //   3303: l2i
    //   3304: ldc_w -1508403523
    //   3307: ixor
    //   3308: goto -> 3319
    //   3311: ldc2_w -972953312
    //   3314: l2i
    //   3315: ldc_w -1534042363
    //   3318: ixor
    //   3319: ldc2_w -2116875976
    //   3322: l2i
    //   3323: ldc_w -752481179
    //   3326: ixor
    //   3327: ixor
    //   3328: lookupswitch default -> 3356, -1091986267 -> 3311, 511251290 -> 15179
    //   3356: goto -> 3360
    //   3359: athrow
    //   3360: invokeinterface next : ()Ljava/lang/Object;
    //   3365: goto -> 3369
    //   3368: athrow
    //   3369: checkcast java/util/Map$Entry
    //   3372: getstatic Perryc.c : I
    //   3375: iflt -> 3389
    //   3378: ldc2_w -813557060
    //   3381: l2i
    //   3382: ldc_w -1752634439
    //   3385: ixor
    //   3386: goto -> 3397
    //   3389: ldc2_w 282360157
    //   3392: l2i
    //   3393: ldc_w 1081134845
    //   3396: ixor
    //   3397: ldc2_w -1875593387
    //   3400: l2i
    //   3401: ldc_w -1568987440
    //   3404: ixor
    //   3405: ixor
    //   3406: lookupswitch default -> 3432, -1094439642 -> 3389, 1782931584 -> 15143
    //   3432: astore #12
    //   3434: getstatic Perryc.c : I
    //   3437: iflt -> 3451
    //   3440: ldc2_w 393744378
    //   3443: l2i
    //   3444: ldc_w 2078290053
    //   3447: ixor
    //   3448: goto -> 3459
    //   3451: ldc2_w -1272953437
    //   3454: l2i
    //   3455: ldc_w 933392676
    //   3458: ixor
    //   3459: ldc2_w 805275334
    //   3462: l2i
    //   3463: ldc_w 1825645576
    //   3466: ixor
    //   3467: ixor
    //   3468: lookupswitch default -> 3496, -1530909772 -> 3451, 800497073 -> 15307
    //   3496: aload #12
    //   3498: getstatic Perryc.1 : I
    //   3501: ifeq -> 3515
    //   3504: ldc2_w -2063318195
    //   3507: l2i
    //   3508: ldc_w -1391234214
    //   3511: ixor
    //   3512: goto -> 3523
    //   3515: ldc2_w -847129111
    //   3518: l2i
    //   3519: ldc_w 753144567
    //   3522: ixor
    //   3523: ldc2_w 605198193
    //   3526: l2i
    //   3527: ldc_w -694222557
    //   3530: ixor
    //   3531: ixor
    //   3532: lookupswitch default -> 15221, -627399099 -> 3515, 333992268 -> 3560
    //   3560: goto -> 3564
    //   3563: athrow
    //   3564: invokeinterface getValue : ()Ljava/lang/Object;
    //   3569: goto -> 3573
    //   3572: athrow
    //   3573: checkcast net/minecraft/item/ItemStack
    //   3576: getstatic Perryc.1 : I
    //   3579: ifeq -> 3593
    //   3582: ldc2_w 2057697365
    //   3585: l2i
    //   3586: ldc_w 976952719
    //   3589: ixor
    //   3590: goto -> 3601
    //   3593: ldc2_w 1905981649
    //   3596: l2i
    //   3597: ldc_w -2095880094
    //   3600: ixor
    //   3601: ldc2_w -1492531
    //   3604: l2i
    //   3605: ldc_w 434773406
    //   3608: ixor
    //   3609: ixor
    //   3610: lookupswitch default -> 3636, -1499610743 -> 15069, 435876370 -> 3593
    //   3636: astore #13
    //   3638: getstatic Perryc.1 : I
    //   3641: ifeq -> 3655
    //   3644: ldc2_w 1275497596
    //   3647: l2i
    //   3648: ldc_w -994799498
    //   3651: ixor
    //   3652: goto -> 3663
    //   3655: ldc2_w -1741340592
    //   3658: l2i
    //   3659: ldc_w -206754727
    //   3662: ixor
    //   3663: ldc2_w -65167772
    //   3666: l2i
    //   3667: ldc_w 1191260084
    //   3670: ixor
    //   3671: ixor
    //   3672: lookupswitch default -> 3700, 867085786 -> 15139, 2144100992 -> 3655
    //   3700: aload_0
    //   3701: getstatic Perryc.0 : I
    //   3704: ifle -> 3718
    //   3707: ldc2_w -1308751195
    //   3710: l2i
    //   3711: ldc_w -305034183
    //   3714: ixor
    //   3715: goto -> 3726
    //   3718: ldc2_w 1576431513
    //   3721: l2i
    //   3722: ldc_w -1713472910
    //   3725: ixor
    //   3726: ldc2_w -1855933635
    //   3729: l2i
    //   3730: ldc_w -2068556547
    //   3733: ixor
    //   3734: ixor
    //   3735: lookupswitch default -> 3760, 1241211228 -> 15291, 1616926655 -> 3718
    //   3760: getfield repair : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3763: getstatic Perryc.1 : I
    //   3766: ifeq -> 3780
    //   3769: ldc2_w -1879798933
    //   3772: l2i
    //   3773: ldc_w 170846323
    //   3776: ixor
    //   3777: goto -> 3788
    //   3780: ldc2_w 2143133667
    //   3783: l2i
    //   3784: ldc_w -989049418
    //   3787: ixor
    //   3788: ldc2_w -762487147
    //   3791: l2i
    //   3792: ldc_w 822827992
    //   3795: ixor
    //   3796: ixor
    //   3797: lookupswitch default -> 15115, 1496831768 -> 3824, 1717331541 -> 3780
    //   3824: goto -> 3828
    //   3827: athrow
    //   3828: invokevirtual getValue : ()Ljava/lang/Object;
    //   3831: goto -> 3835
    //   3834: athrow
    //   3835: checkcast java/lang/Integer
    //   3838: getstatic Perryc.c : I
    //   3841: iflt -> 3855
    //   3844: ldc2_w -1723792584
    //   3847: l2i
    //   3848: ldc_w -143233255
    //   3851: ixor
    //   3852: goto -> 3863
    //   3855: ldc2_w 447525160
    //   3858: l2i
    //   3859: ldc_w 1329743789
    //   3862: ixor
    //   3863: ldc2_w -1022445104
    //   3866: l2i
    //   3867: ldc_w -1979374974
    //   3870: ixor
    //   3871: ixor
    //   3872: lookupswitch default -> 15035, 484797911 -> 3900, 658306931 -> 3855
    //   3900: goto -> 3904
    //   3903: athrow
    //   3904: invokevirtual intValue : ()I
    //   3907: goto -> 3911
    //   3910: athrow
    //   3911: i2f
    //   3912: ldc_w 0.7340755
    //   3915: invokestatic floatToIntBits : (F)I
    //   3918: ldc_w 2113137759
    //   3921: ixor
    //   3922: invokestatic intBitsToFloat : (I)F
    //   3925: fdiv
    //   3926: getstatic Perryc.1 : I
    //   3929: ifeq -> 3943
    //   3932: ldc2_w -1484059569
    //   3935: l2i
    //   3936: ldc_w 2013709576
    //   3939: ixor
    //   3940: goto -> 3951
    //   3943: ldc2_w -417160326
    //   3946: l2i
    //   3947: ldc_w 1626665961
    //   3950: ixor
    //   3951: ldc2_w -1737051488
    //   3954: l2i
    //   3955: ldc_w 1205070774
    //   3958: ixor
    //   3959: ixor
    //   3960: lookupswitch default -> 3988, -716991208 -> 3943, 2658385 -> 15051
    //   3988: fstore #14
    //   3990: getstatic Perryc.1 : I
    //   3993: ifeq -> 4007
    //   3996: ldc2_w 1930931772
    //   3999: l2i
    //   4000: ldc_w 421371448
    //   4003: ixor
    //   4004: goto -> 4015
    //   4007: ldc2_w -380296235
    //   4010: l2i
    //   4011: ldc_w 60522096
    //   4014: ixor
    //   4015: ldc2_w 1157792304
    //   4018: l2i
    //   4019: ldc_w 1547110667
    //   4022: ixor
    //   4023: ixor
    //   4024: lookupswitch default -> 15337, -201599330 -> 4052, 1933556543 -> 4007
    //   4052: aload #13
    //   4054: getstatic Perryc.1 : I
    //   4057: ifeq -> 4071
    //   4060: ldc2_w 169548880
    //   4063: l2i
    //   4064: ldc_w 1140686015
    //   4067: ixor
    //   4068: goto -> 4079
    //   4071: ldc2_w 1942477418
    //   4074: l2i
    //   4075: ldc_w 693328110
    //   4078: ixor
    //   4079: ldc2_w 1546061735
    //   4082: l2i
    //   4083: ldc_w -851310586
    //   4086: ixor
    //   4087: ixor
    //   4088: lookupswitch default -> 15261, -873362139 -> 4116, -662474930 -> 4071
    //   4116: goto -> 4120
    //   4119: athrow
    //   4120: invokevirtual func_77958_k : ()I
    //   4123: goto -> 4127
    //   4126: athrow
    //   4127: i2f
    //   4128: getstatic Perryc.c : I
    //   4131: iflt -> 4145
    //   4134: ldc2_w 1904735032
    //   4137: l2i
    //   4138: ldc_w -78734104
    //   4141: ixor
    //   4142: goto -> 4153
    //   4145: ldc2_w -902798398
    //   4148: l2i
    //   4149: ldc_w -335699150
    //   4152: ixor
    //   4153: ldc2_w 1477158975
    //   4156: l2i
    //   4157: ldc_w 2109807832
    //   4160: ixor
    //   4161: ixor
    //   4162: lookupswitch default -> 15225, -1358701769 -> 4145, 67597335 -> 4188
    //   4188: fload #14
    //   4190: fmul
    //   4191: getstatic Perryc.1 : I
    //   4194: ifeq -> 4208
    //   4197: ldc2_w 2095903828
    //   4200: l2i
    //   4201: ldc_w 1505967911
    //   4204: ixor
    //   4205: goto -> 4216
    //   4208: ldc2_w -1777848550
    //   4211: l2i
    //   4212: ldc_w -62191596
    //   4215: ixor
    //   4216: ldc2_w -940739048
    //   4219: l2i
    //   4220: ldc_w 914328710
    //   4223: ixor
    //   4224: ixor
    //   4225: lookupswitch default -> 15327, -1680745072 -> 4252, -725798419 -> 4208
    //   4252: goto -> 4256
    //   4255: athrow
    //   4256: invokestatic round : (F)I
    //   4259: goto -> 4263
    //   4262: athrow
    //   4263: getstatic Perryc.1 : I
    //   4266: ifeq -> 4280
    //   4269: ldc2_w -973608727
    //   4272: l2i
    //   4273: ldc_w -109304135
    //   4276: ixor
    //   4277: goto -> 4288
    //   4280: ldc2_w 850059473
    //   4283: l2i
    //   4284: ldc_w 1682768823
    //   4287: ixor
    //   4288: ldc2_w -247386589
    //   4291: l2i
    //   4292: ldc_w -1670615621
    //   4295: ixor
    //   4296: ixor
    //   4297: lookupswitch default -> 4324, 1369869768 -> 15205, 1871288496 -> 4280
    //   4324: istore #9
    //   4326: getstatic Perryc.c : I
    //   4329: iflt -> 4343
    //   4332: ldc2_w 220979974
    //   4335: l2i
    //   4336: ldc_w -1756663717
    //   4339: ixor
    //   4340: goto -> 4351
    //   4343: ldc2_w -1100111473
    //   4346: l2i
    //   4347: ldc_w -847137024
    //   4350: ixor
    //   4351: ldc2_w -771401583
    //   4354: l2i
    //   4355: ldc_w -415549867
    //   4358: ixor
    //   4359: ixor
    //   4360: lookupswitch default -> 4388, -1352729191 -> 15393, 1352705307 -> 4343
    //   4388: iload #9
    //   4390: getstatic Perryc.1 : I
    //   4393: ifeq -> 4407
    //   4396: ldc2_w -542920309
    //   4399: l2i
    //   4400: ldc_w -820004302
    //   4403: ixor
    //   4404: goto -> 4415
    //   4407: ldc2_w -708029441
    //   4410: l2i
    //   4411: ldc_w -252776244
    //   4414: ixor
    //   4415: ldc2_w 681434481
    //   4418: l2i
    //   4419: ldc_w -351415858
    //   4422: ixor
    //   4423: ixor
    //   4424: lookupswitch default -> 15331, -752089338 -> 4407, -424497268 -> 4452
    //   4452: aload #13
    //   4454: getstatic Perryc.0 : I
    //   4457: ifle -> 4471
    //   4460: ldc2_w -894639186
    //   4463: l2i
    //   4464: ldc_w 1499700468
    //   4467: ixor
    //   4468: goto -> 4479
    //   4471: ldc2_w -1349558906
    //   4474: l2i
    //   4475: ldc_w -1828743855
    //   4478: ixor
    //   4479: ldc2_w -536417117
    //   4482: l2i
    //   4483: ldc_w -1326529774
    //   4486: ixor
    //   4487: ixor
    //   4488: lookupswitch default -> 4516, -1301374222 -> 4471, -1020833557 -> 15345
    //   4516: goto -> 4520
    //   4519: athrow
    //   4520: invokevirtual func_77958_k : ()I
    //   4523: goto -> 4527
    //   4526: athrow
    //   4527: getstatic Perryc.c : I
    //   4530: iflt -> 4544
    //   4533: ldc2_w 1534623142
    //   4536: l2i
    //   4537: ldc_w 606137558
    //   4540: ixor
    //   4541: goto -> 4552
    //   4544: ldc2_w -1169471026
    //   4547: l2i
    //   4548: ldc_w 1382868223
    //   4551: ixor
    //   4552: ldc2_w -811210759
    //   4555: l2i
    //   4556: ldc_w -868000503
    //   4559: ixor
    //   4560: ixor
    //   4561: lookupswitch default -> 4588, -1707224955 -> 4544, 2092837760 -> 15295
    //   4588: aload #13
    //   4590: getstatic Perryc.c : I
    //   4593: iflt -> 4607
    //   4596: ldc2_w -1264064502
    //   4599: l2i
    //   4600: ldc_w 497038197
    //   4603: ixor
    //   4604: goto -> 4615
    //   4607: ldc2_w -231749367
    //   4610: l2i
    //   4611: ldc_w 839711551
    //   4614: ixor
    //   4615: ldc2_w -1971633969
    //   4618: l2i
    //   4619: ldc_w 54931210
    //   4622: ixor
    //   4623: ixor
    //   4624: lookupswitch default -> 15325, 540718266 -> 4607, 1226726899 -> 4652
    //   4652: goto -> 4656
    //   4655: athrow
    //   4656: invokevirtual func_77952_i : ()I
    //   4659: goto -> 4663
    //   4662: athrow
    //   4663: isub
    //   4664: dup
    //   4665: getstatic Perryc.c : I
    //   4668: iflt -> 4682
    //   4671: ldc2_w -709008441
    //   4674: l2i
    //   4675: ldc_w 369361294
    //   4678: ixor
    //   4679: goto -> 4690
    //   4682: ldc2_w 1928945049
    //   4685: l2i
    //   4686: ldc_w 569504092
    //   4689: ixor
    //   4690: ldc2_w 313990979
    //   4693: l2i
    //   4694: ldc_w -1135284941
    //   4697: ixor
    //   4698: ixor
    //   4699: lookupswitch default -> 15395, -34906443 -> 4724, 1834651705 -> 4682
    //   4724: istore #8
    //   4726: if_icmplt -> 4740
    //   4729: ldc2_w -518856786
    //   4732: l2i
    //   4733: ldc_w 1298940158
    //   4736: ixor
    //   4737: goto -> 4748
    //   4740: ldc2_w 200044840
    //   4743: l2i
    //   4744: ldc_w -1483542919
    //   4747: ixor
    //   4748: ldc2_w -1273504015
    //   4751: l2i
    //   4752: ldc_w 1837522449
    //   4755: ixor
    //   4756: ixor
    //   4757: tableswitch default -> 4729, 1978605488 -> 4780, 1978605489 -> 4783
    //   4780: goto -> 3038
    //   4783: iinc #10, 1
    //   4786: goto -> 3038
    //   4789: getstatic Perryc.1 : I
    //   4792: ifeq -> 4806
    //   4795: ldc2_w -2101707269
    //   4798: l2i
    //   4799: ldc_w 1498845753
    //   4802: ixor
    //   4803: goto -> 4814
    //   4806: ldc2_w -130243167
    //   4809: l2i
    //   4810: ldc_w 1638316110
    //   4813: ixor
    //   4814: ldc2_w 320374589
    //   4817: l2i
    //   4818: ldc_w 940623127
    //   4821: ixor
    //   4822: ixor
    //   4823: lookupswitch default -> 15185, -1299030075 -> 4848, -253448728 -> 4806
    //   4848: iload #10
    //   4850: ldc2_w -2145099574
    //   4853: l2i
    //   4854: ldc_w -2145099570
    //   4857: ixor
    //   4858: if_icmpne -> 4872
    //   4861: ldc2_w -468357502
    //   4864: l2i
    //   4865: ldc_w 1949813630
    //   4868: ixor
    //   4869: goto -> 4880
    //   4872: ldc2_w 325631906
    //   4875: l2i
    //   4876: ldc_w -2092295591
    //   4879: ixor
    //   4880: ldc2_w 647312541
    //   4883: l2i
    //   4884: ldc_w -1737533766
    //   4887: ixor
    //   4888: ixor
    //   4889: tableswitch default -> 4861, 785958875 -> 4912, 785958876 -> 5043
    //   4912: getstatic Perryc.1 : I
    //   4915: ifeq -> 4929
    //   4918: ldc2_w -1476262734
    //   4921: l2i
    //   4922: ldc_w -1687881344
    //   4925: ixor
    //   4926: goto -> 4937
    //   4929: ldc2_w 441480826
    //   4932: l2i
    //   4933: ldc_w 901059621
    //   4936: ixor
    //   4937: ldc2_w -490638020
    //   4940: l2i
    //   4941: ldc_w -121237714
    //   4944: ixor
    //   4945: ixor
    //   4946: lookupswitch default -> 15055, 694257440 -> 4929, 904009805 -> 4972
    //   4972: aload_0
    //   4973: ldc2_w 138336105
    //   4976: l2i
    //   4977: ldc_w 138336104
    //   4980: ixor
    //   4981: getstatic Perryc.c : I
    //   4984: iflt -> 4998
    //   4987: ldc2_w -1610769879
    //   4990: l2i
    //   4991: ldc_w -1802541535
    //   4994: ixor
    //   4995: goto -> 5006
    //   4998: ldc2_w -1377103629
    //   5001: l2i
    //   5002: ldc_w 1451793375
    //   5005: ixor
    //   5006: ldc2_w 840709214
    //   5009: l2i
    //   5010: ldc_w -245064123
    //   5013: ixor
    //   5014: ixor
    //   5015: lookupswitch default -> 15367, -938846701 -> 4998, 941302071 -> 5040
    //   5040: putfield flag : Z
    //   5043: getstatic Perryc.c : I
    //   5046: iflt -> 5060
    //   5049: ldc2_w -2066125412
    //   5052: l2i
    //   5053: ldc_w 1596977077
    //   5056: ixor
    //   5057: goto -> 5068
    //   5060: ldc2_w 1511984103
    //   5063: l2i
    //   5064: ldc_w 1564283301
    //   5067: ixor
    //   5068: ldc2_w -2077557749
    //   5071: l2i
    //   5072: ldc_w 1499352449
    //   5075: ixor
    //   5076: ixor
    //   5077: lookupswitch default -> 15259, -631854136 -> 5104, 109196195 -> 5060
    //   5104: aload_0
    //   5105: getstatic Perryc.c : I
    //   5108: iflt -> 5122
    //   5111: ldc2_w 115446354
    //   5114: l2i
    //   5115: ldc_w -798733645
    //   5118: ixor
    //   5119: goto -> 5130
    //   5122: ldc2_w -867251172
    //   5125: l2i
    //   5126: ldc_w 873516797
    //   5129: ixor
    //   5130: ldc2_w -979870451
    //   5133: l2i
    //   5134: ldc_w -1978601473
    //   5137: ixor
    //   5138: ixor
    //   5139: lookupswitch default -> 15153, -1727174125 -> 5122, -1210666989 -> 5164
    //   5164: getfield flag : Z
    //   5167: ifne -> 5181
    //   5170: ldc2_w 1604880198
    //   5173: l2i
    //   5174: ldc_w -390620267
    //   5177: ixor
    //   5178: goto -> 5189
    //   5181: ldc2_w -1698426544
    //   5184: l2i
    //   5185: ldc_w 769330562
    //   5188: ixor
    //   5189: ldc2_w -2004407550
    //   5192: l2i
    //   5193: ldc_w 158162163
    //   5196: ixor
    //   5197: ixor
    //   5198: tableswitch default -> 5170, 922053410 -> 5220, 922053411 -> 12691
    //   5220: getstatic Perryc.1 : I
    //   5223: ifeq -> 5237
    //   5226: ldc2_w -341699075
    //   5229: l2i
    //   5230: ldc_w -113804441
    //   5233: ixor
    //   5234: goto -> 5245
    //   5237: ldc2_w -1444814576
    //   5240: l2i
    //   5241: ldc_w -1450941238
    //   5244: ixor
    //   5245: ldc2_w -331549195
    //   5248: l2i
    //   5249: ldc_w -1277794192
    //   5252: ixor
    //   5253: ixor
    //   5254: lookupswitch default -> 5280, 732045844 -> 5237, 1300230943 -> 15119
    //   5280: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoArmor.mc : Lnet/minecraft/client/Minecraft;
    //   5283: getstatic Perryc.1 : I
    //   5286: ifeq -> 5300
    //   5289: ldc2_w 744454629
    //   5292: l2i
    //   5293: ldc_w 1018082895
    //   5296: ixor
    //   5297: goto -> 5308
    //   5300: ldc2_w -65981401
    //   5303: l2i
    //   5304: ldc_w -297148828
    //   5307: ixor
    //   5308: ldc2_w -1684689460
    //   5311: l2i
    //   5312: ldc_w -299087489
    //   5315: ixor
    //   5316: ixor
    //   5317: lookupswitch default -> 5344, -499150416 -> 5300, 1699228441 -> 15275
    //   5344: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   5347: getstatic Perryc.0 : I
    //   5350: ifle -> 5364
    //   5353: ldc2_w -561589885
    //   5356: l2i
    //   5357: ldc_w -1568607935
    //   5360: ixor
    //   5361: goto -> 5372
    //   5364: ldc2_w 1585954810
    //   5367: l2i
    //   5368: ldc_w 259504894
    //   5371: ixor
    //   5372: ldc2_w -1937665769
    //   5375: l2i
    //   5376: ldc_w -941154502
    //   5379: ixor
    //   5380: ixor
    //   5381: lookupswitch default -> 15239, 446073641 -> 5408, 929083119 -> 5364
    //   5408: getfield field_71069_bz : Lnet/minecraft/inventory/Container;
    //   5411: ldc2_w 2019069918
    //   5414: l2i
    //   5415: ldc_w 2019069915
    //   5418: ixor
    //   5419: getstatic Perryc.0 : I
    //   5422: ifle -> 5436
    //   5425: ldc2_w 1658629424
    //   5428: l2i
    //   5429: ldc_w 159861576
    //   5432: ixor
    //   5433: goto -> 5444
    //   5436: ldc2_w 613809595
    //   5439: l2i
    //   5440: ldc_w 1512063806
    //   5443: ixor
    //   5444: ldc2_w 1778486890
    //   5447: l2i
    //   5448: ldc_w 435345832
    //   5451: ixor
    //   5452: ixor
    //   5453: lookupswitch default -> 5480, 238110428 -> 5436, 413708730 -> 15147
    //   5480: goto -> 5484
    //   5483: athrow
    //   5484: invokevirtual func_75139_a : (I)Lnet/minecraft/inventory/Slot;
    //   5487: goto -> 5491
    //   5490: athrow
    //   5491: getstatic Perryc.c : I
    //   5494: iflt -> 5508
    //   5497: ldc2_w 553393440
    //   5500: l2i
    //   5501: ldc_w 960779275
    //   5504: ixor
    //   5505: goto -> 5516
    //   5508: ldc2_w -1341989891
    //   5511: l2i
    //   5512: ldc_w -1489724940
    //   5515: ixor
    //   5516: ldc2_w -679574060
    //   5519: l2i
    //   5520: ldc_w 1198737193
    //   5523: ixor
    //   5524: ixor
    //   5525: lookupswitch default -> 5552, -1984590890 -> 15235, 1010414193 -> 5508
    //   5552: goto -> 5556
    //   5555: athrow
    //   5556: invokevirtual func_75211_c : ()Lnet/minecraft/item/ItemStack;
    //   5559: goto -> 5563
    //   5562: athrow
    //   5563: getstatic Perryc.1 : I
    //   5566: ifeq -> 5580
    //   5569: ldc2_w 759267908
    //   5572: l2i
    //   5573: ldc_w -353188412
    //   5576: ixor
    //   5577: goto -> 5588
    //   5580: ldc2_w 567437584
    //   5583: l2i
    //   5584: ldc_w 1562447629
    //   5587: ixor
    //   5588: ldc2_w -783613505
    //   5591: l2i
    //   5592: ldc_w 245164057
    //   5595: ixor
    //   5596: ixor
    //   5597: lookupswitch default -> 15215, -1557884997 -> 5624, 409251366 -> 5580
    //   5624: astore #11
    //   5626: getstatic Perryc.c : I
    //   5629: iflt -> 5643
    //   5632: ldc2_w 906407455
    //   5635: l2i
    //   5636: ldc_w 1514412037
    //   5639: ixor
    //   5640: goto -> 5651
    //   5643: ldc2_w -646806393
    //   5646: l2i
    //   5647: ldc_w -241856377
    //   5650: ixor
    //   5651: ldc2_w 284975167
    //   5654: l2i
    //   5655: ldc_w -1656883955
    //   5658: ixor
    //   5659: ixor
    //   5660: lookupswitch default -> 15049, -1524203214 -> 5688, -511499480 -> 5643
    //   5688: aload #11
    //   5690: getstatic Perryc.1 : I
    //   5693: ifeq -> 5707
    //   5696: ldc2_w -988016200
    //   5699: l2i
    //   5700: ldc_w -684622811
    //   5703: ixor
    //   5704: goto -> 5715
    //   5707: ldc2_w -1713488020
    //   5710: l2i
    //   5711: ldc_w 61284351
    //   5714: ixor
    //   5715: ldc2_w -2080292223
    //   5718: l2i
    //   5719: ldc_w 593414475
    //   5722: ixor
    //   5723: ixor
    //   5724: lookupswitch default -> 15165, -1250761129 -> 5707, 1025944409 -> 5752
    //   5752: getfield field_190928_g : Z
    //   5755: ifne -> 5769
    //   5758: ldc2_w -1670028025
    //   5761: l2i
    //   5762: ldc_w -1768111781
    //   5765: ixor
    //   5766: goto -> 5777
    //   5769: ldc2_w 1411435048
    //   5772: l2i
    //   5773: ldc_w 1590259315
    //   5776: ixor
    //   5777: ldc2_w 172221345
    //   5780: l2i
    //   5781: ldc_w 668415430
    //   5784: ixor
    //   5785: ixor
    //   5786: tableswitch default -> 5758, 662532667 -> 5808, 662532668 -> 7087
    //   5808: getstatic Perryc.0 : I
    //   5811: ifle -> 5825
    //   5814: ldc2_w -2118475256
    //   5817: l2i
    //   5818: ldc_w 963590873
    //   5821: ixor
    //   5822: goto -> 5833
    //   5825: ldc2_w 789671624
    //   5828: l2i
    //   5829: ldc_w -167284671
    //   5832: ixor
    //   5833: ldc2_w 813521149
    //   5836: l2i
    //   5837: ldc_w 635109417
    //   5840: ixor
    //   5841: ixor
    //   5842: lookupswitch default -> 5868, -1384923131 -> 15323, -1094874782 -> 5825
    //   5868: aload_0
    //   5869: getstatic Perryc.1 : I
    //   5872: ifeq -> 5886
    //   5875: ldc2_w -1121194152
    //   5878: l2i
    //   5879: ldc_w 140642359
    //   5882: ixor
    //   5883: goto -> 5894
    //   5886: ldc2_w 883828680
    //   5889: l2i
    //   5890: ldc_w -925143750
    //   5893: ixor
    //   5894: ldc2_w -1339060347
    //   5897: l2i
    //   5898: ldc_w -1929690650
    //   5901: ixor
    //   5902: ixor
    //   5903: lookupswitch default -> 5928, -1986189044 -> 15195, 1544879681 -> 5886
    //   5928: getfield repair : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5931: getstatic Perryc.0 : I
    //   5934: ifle -> 5948
    //   5937: ldc2_w 1299921183
    //   5940: l2i
    //   5941: ldc_w -93720461
    //   5944: ixor
    //   5945: goto -> 5956
    //   5948: ldc2_w 1085437539
    //   5951: l2i
    //   5952: ldc_w 1064111836
    //   5955: ixor
    //   5956: ldc2_w 1544887649
    //   5959: l2i
    //   5960: ldc_w -1978702990
    //   5963: ixor
    //   5964: ixor
    //   5965: lookupswitch default -> 15169, -1446705492 -> 5992, 1627961215 -> 5948
    //   5992: goto -> 5996
    //   5995: athrow
    //   5996: invokevirtual getValue : ()Ljava/lang/Object;
    //   5999: goto -> 6003
    //   6002: athrow
    //   6003: checkcast java/lang/Integer
    //   6006: getstatic Perryc.0 : I
    //   6009: ifle -> 6023
    //   6012: ldc2_w 1956695839
    //   6015: l2i
    //   6016: ldc_w -398408554
    //   6019: ixor
    //   6020: goto -> 6031
    //   6023: ldc2_w 425715265
    //   6026: l2i
    //   6027: ldc_w -1206298072
    //   6030: ixor
    //   6031: ldc2_w -847451819
    //   6034: l2i
    //   6035: ldc_w 1363666247
    //   6038: ixor
    //   6039: ixor
    //   6040: lookupswitch default -> 15343, 14354331 -> 6023, 1031647355 -> 6068
    //   6068: goto -> 6072
    //   6071: athrow
    //   6072: invokevirtual intValue : ()I
    //   6075: goto -> 6079
    //   6078: athrow
    //   6079: i2f
    //   6080: ldc_w 0.009265213
    //   6083: invokestatic floatToIntBits : (F)I
    //   6086: ldc_w 2128596255
    //   6089: ixor
    //   6090: invokestatic intBitsToFloat : (I)F
    //   6093: fdiv
    //   6094: getstatic Perryc.c : I
    //   6097: iflt -> 6111
    //   6100: ldc2_w 566280892
    //   6103: l2i
    //   6104: ldc_w 2093294289
    //   6107: ixor
    //   6108: goto -> 6119
    //   6111: ldc2_w 764730509
    //   6114: l2i
    //   6115: ldc_w 549785390
    //   6118: ixor
    //   6119: ldc2_w 1411350284
    //   6122: l2i
    //   6123: ldc_w 745941676
    //   6126: ixor
    //   6127: ixor
    //   6128: lookupswitch default -> 6156, 627881421 -> 15387, 1920077381 -> 6111
    //   6156: fstore #13
    //   6158: getstatic Perryc.1 : I
    //   6161: ifeq -> 6175
    //   6164: ldc2_w 686457989
    //   6167: l2i
    //   6168: ldc_w 1392156511
    //   6171: ixor
    //   6172: goto -> 6183
    //   6175: ldc2_w 2134960233
    //   6178: l2i
    //   6179: ldc_w -955495305
    //   6182: ixor
    //   6183: ldc2_w -367441770
    //   6186: l2i
    //   6187: ldc_w -1339839408
    //   6190: ixor
    //   6191: ixor
    //   6192: lookupswitch default -> 15351, -495566632 -> 6220, 539688732 -> 6175
    //   6220: aload #11
    //   6222: getstatic Perryc.0 : I
    //   6225: ifle -> 6239
    //   6228: ldc2_w -312258079
    //   6231: l2i
    //   6232: ldc_w 419374653
    //   6235: ixor
    //   6236: goto -> 6247
    //   6239: ldc2_w -2110602545
    //   6242: l2i
    //   6243: ldc_w -1890296860
    //   6246: ixor
    //   6247: ldc2_w -1755922055
    //   6250: l2i
    //   6251: ldc_w -1592586349
    //   6254: ixor
    //   6255: ixor
    //   6256: lookupswitch default -> 6284, -1926257504 -> 6239, -1009141450 -> 15423
    //   6284: goto -> 6288
    //   6287: athrow
    //   6288: invokevirtual func_77958_k : ()I
    //   6291: goto -> 6295
    //   6294: athrow
    //   6295: i2f
    //   6296: getstatic Perryc.c : I
    //   6299: iflt -> 6313
    //   6302: ldc2_w -1130510828
    //   6305: l2i
    //   6306: ldc_w 783403886
    //   6309: ixor
    //   6310: goto -> 6321
    //   6313: ldc2_w -1264816627
    //   6316: l2i
    //   6317: ldc_w -17234465
    //   6320: ixor
    //   6321: ldc2_w -285450983
    //   6324: l2i
    //   6325: ldc_w -186420785
    //   6328: ixor
    //   6329: ixor
    //   6330: lookupswitch default -> 6356, -2009914964 -> 15045, -1811702439 -> 6313
    //   6356: fload #13
    //   6358: fmul
    //   6359: getstatic Perryc.c : I
    //   6362: iflt -> 6376
    //   6365: ldc2_w -1534658380
    //   6368: l2i
    //   6369: ldc_w 1122688267
    //   6372: ixor
    //   6373: goto -> 6384
    //   6376: ldc2_w -446027840
    //   6379: l2i
    //   6380: ldc_w 1596680753
    //   6383: ixor
    //   6384: ldc2_w 443219775
    //   6387: l2i
    //   6388: ldc_w -1472742317
    //   6391: ixor
    //   6392: ixor
    //   6393: lookupswitch default -> 6420, -343198691 -> 6376, 1412523731 -> 15285
    //   6420: goto -> 6424
    //   6423: athrow
    //   6424: invokestatic round : (F)I
    //   6427: goto -> 6431
    //   6430: athrow
    //   6431: getstatic Perryc.1 : I
    //   6434: ifeq -> 6448
    //   6437: ldc2_w -2136286607
    //   6440: l2i
    //   6441: ldc_w -1944480267
    //   6444: ixor
    //   6445: goto -> 6456
    //   6448: ldc2_w 1825026
    //   6451: l2i
    //   6452: ldc_w 1593952419
    //   6455: ixor
    //   6456: ldc2_w -544000891
    //   6459: l2i
    //   6460: ldc_w 818535419
    //   6463: ixor
    //   6464: ixor
    //   6465: lookupswitch default -> 15347, -1337917729 -> 6492, -471228166 -> 6448
    //   6492: istore #14
    //   6494: getstatic Perryc.0 : I
    //   6497: ifle -> 6511
    //   6500: ldc2_w 1267087097
    //   6503: l2i
    //   6504: ldc_w 311261100
    //   6507: ixor
    //   6508: goto -> 6519
    //   6511: ldc2_w -722303149
    //   6514: l2i
    //   6515: ldc_w 1732341809
    //   6518: ixor
    //   6519: ldc2_w -1693654999
    //   6522: l2i
    //   6523: ldc_w 837779014
    //   6526: ixor
    //   6527: ixor
    //   6528: lookupswitch default -> 6556, -987567809 -> 6511, -202842310 -> 15319
    //   6556: iload #14
    //   6558: getstatic Perryc.c : I
    //   6561: iflt -> 6575
    //   6564: ldc2_w -1797633301
    //   6567: l2i
    //   6568: ldc_w 1943059928
    //   6571: ixor
    //   6572: goto -> 6583
    //   6575: ldc2_w -1167303903
    //   6578: l2i
    //   6579: ldc_w 1532205212
    //   6582: ixor
    //   6583: ldc2_w -1751622106
    //   6586: l2i
    //   6587: ldc_w -236169178
    //   6590: ixor
    //   6591: ixor
    //   6592: lookupswitch default -> 15267, -2122387149 -> 6575, -2025077315 -> 6620
    //   6620: aload #11
    //   6622: getstatic Perryc.c : I
    //   6625: iflt -> 6639
    //   6628: ldc2_w -759792316
    //   6631: l2i
    //   6632: ldc_w -64185061
    //   6635: ixor
    //   6636: goto -> 6647
    //   6639: ldc2_w 1397864620
    //   6642: l2i
    //   6643: ldc_w 972015643
    //   6646: ixor
    //   6647: ldc2_w 2084131498
    //   6650: l2i
    //   6651: ldc_w 277547399
    //   6654: ixor
    //   6655: ixor
    //   6656: lookupswitch default -> 15339, 101460890 -> 6684, 1109965682 -> 6639
    //   6684: goto -> 6688
    //   6687: athrow
    //   6688: invokevirtual func_77958_k : ()I
    //   6691: goto -> 6695
    //   6694: athrow
    //   6695: getstatic Perryc.1 : I
    //   6698: ifeq -> 6712
    //   6701: ldc2_w -1944312907
    //   6704: l2i
    //   6705: ldc_w 714693892
    //   6708: ixor
    //   6709: goto -> 6720
    //   6712: ldc2_w 2019360136
    //   6715: l2i
    //   6716: ldc_w 1336998002
    //   6719: ixor
    //   6720: ldc2_w -2070897573
    //   6723: l2i
    //   6724: ldc_w -854925500
    //   6727: ixor
    //   6728: ixor
    //   6729: lookupswitch default -> 15191, -283165266 -> 6712, 2121680613 -> 6756
    //   6756: aload #11
    //   6758: getstatic Perryc.c : I
    //   6761: iflt -> 6775
    //   6764: ldc2_w 211904645
    //   6767: l2i
    //   6768: ldc_w -702974075
    //   6771: ixor
    //   6772: goto -> 6783
    //   6775: ldc2_w 1312491966
    //   6778: l2i
    //   6779: ldc_w -2105921206
    //   6782: ixor
    //   6783: ldc2_w 348275663
    //   6786: l2i
    //   6787: ldc_w -1365739477
    //   6790: ixor
    //   6791: ixor
    //   6792: lookupswitch default -> 6820, -1125623619 -> 6775, 1625433316 -> 15031
    //   6820: goto -> 6824
    //   6823: athrow
    //   6824: invokevirtual func_77952_i : ()I
    //   6827: goto -> 6831
    //   6830: athrow
    //   6831: isub
    //   6832: dup
    //   6833: getstatic Perryc.c : I
    //   6836: iflt -> 6850
    //   6839: ldc2_w 625134081
    //   6842: l2i
    //   6843: ldc_w -429811905
    //   6846: ixor
    //   6847: goto -> 6858
    //   6850: ldc2_w -1910500476
    //   6853: l2i
    //   6854: ldc_w 278698211
    //   6857: ixor
    //   6858: ldc2_w 1522812254
    //   6861: l2i
    //   6862: ldc_w -1671379968
    //   6865: ixor
    //   6866: ixor
    //   6867: lookupswitch default -> 6892, -1250215688 -> 6850, 92789856 -> 15381
    //   6892: istore #12
    //   6894: if_icmpge -> 6908
    //   6897: ldc2_w 2086310957
    //   6900: l2i
    //   6901: ldc_w -1442530639
    //   6904: ixor
    //   6905: goto -> 6916
    //   6908: ldc2_w -23075970
    //   6911: l2i
    //   6912: ldc_w 683789793
    //   6915: ixor
    //   6916: ldc2_w 450376306
    //   6919: l2i
    //   6920: ldc_w -1318466817
    //   6923: ixor
    //   6924: ixor
    //   6925: tableswitch default -> 6897, 2112869905 -> 6948, 2112869906 -> 7087
    //   6948: getstatic Perryc.0 : I
    //   6951: ifle -> 6965
    //   6954: ldc2_w 999973245
    //   6957: l2i
    //   6958: ldc_w -1233308284
    //   6961: ixor
    //   6962: goto -> 6973
    //   6965: ldc2_w 1193111981
    //   6968: l2i
    //   6969: ldc_w 405895895
    //   6972: ixor
    //   6973: ldc2_w 2111200250
    //   6976: l2i
    //   6977: ldc_w -937819113
    //   6980: ixor
    //   6981: ixor
    //   6982: lookupswitch default -> 7008, 447314821 -> 6965, 942344980 -> 15121
    //   7008: aload_0
    //   7009: ldc2_w 644117241
    //   7012: l2i
    //   7013: ldc_w 644117244
    //   7016: ixor
    //   7017: getstatic Perryc.1 : I
    //   7020: ifeq -> 7034
    //   7023: ldc2_w -973672805
    //   7026: l2i
    //   7027: ldc_w -1012597846
    //   7030: ixor
    //   7031: goto -> 7042
    //   7034: ldc2_w -1751954646
    //   7037: l2i
    //   7038: ldc_w -976313251
    //   7041: ixor
    //   7042: ldc2_w -376860314
    //   7045: l2i
    //   7046: ldc_w -253280804
    //   7049: ixor
    //   7050: ixor
    //   7051: lookupswitch default -> 7076, 524073355 -> 15251, 1469028785 -> 7034
    //   7076: goto -> 7080
    //   7079: athrow
    //   7080: invokespecial takeOffSlot : (I)V
    //   7083: goto -> 7087
    //   7086: athrow
    //   7087: getstatic Perryc.1 : I
    //   7090: ifeq -> 7104
    //   7093: ldc2_w -57401143
    //   7096: l2i
    //   7097: ldc_w -1486817233
    //   7100: ixor
    //   7101: goto -> 7112
    //   7104: ldc2_w 1871588920
    //   7107: l2i
    //   7108: ldc_w 1604600823
    //   7111: ixor
    //   7112: ldc2_w -1184638325
    //   7115: l2i
    //   7116: ldc_w 2085966138
    //   7119: ixor
    //   7120: ixor
    //   7121: lookupswitch default -> 15349, -1631431849 -> 7104, -182655362 -> 7148
    //   7148: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoArmor.mc : Lnet/minecraft/client/Minecraft;
    //   7151: getstatic Perryc.c : I
    //   7154: iflt -> 7168
    //   7157: ldc2_w 1736742033
    //   7160: l2i
    //   7161: ldc_w -307033752
    //   7164: ixor
    //   7165: goto -> 7176
    //   7168: ldc2_w -1998845413
    //   7171: l2i
    //   7172: ldc_w -1240508923
    //   7175: ixor
    //   7176: ldc2_w -630246990
    //   7179: l2i
    //   7180: ldc_w -880188715
    //   7183: ixor
    //   7184: ixor
    //   7185: lookupswitch default -> 7212, -1680748898 -> 15383, 822126744 -> 7168
    //   7212: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   7215: getstatic Perryc.1 : I
    //   7218: ifeq -> 7232
    //   7221: ldc2_w -449077302
    //   7224: l2i
    //   7225: ldc_w 1804131397
    //   7228: ixor
    //   7229: goto -> 7240
    //   7232: ldc2_w 642832112
    //   7235: l2i
    //   7236: ldc_w 660338566
    //   7239: ixor
    //   7240: ldc2_w -1302365897
    //   7243: l2i
    //   7244: ldc_w 319985410
    //   7247: ixor
    //   7248: ixor
    //   7249: lookupswitch default -> 7276, -739407071 -> 7232, 805219770 -> 15247
    //   7276: getfield field_71069_bz : Lnet/minecraft/inventory/Container;
    //   7279: ldc2_w 133236694
    //   7282: l2i
    //   7283: ldc_w 133236688
    //   7286: ixor
    //   7287: getstatic Perryc.0 : I
    //   7290: ifle -> 7304
    //   7293: ldc2_w 17828537
    //   7296: l2i
    //   7297: ldc_w 1441850934
    //   7300: ixor
    //   7301: goto -> 7312
    //   7304: ldc2_w 1003594986
    //   7307: l2i
    //   7308: ldc_w -494878109
    //   7311: ixor
    //   7312: ldc2_w 441925510
    //   7315: l2i
    //   7316: ldc_w -1106420621
    //   7319: ixor
    //   7320: ixor
    //   7321: lookupswitch default -> 7348, -256209030 -> 15113, 1003484281 -> 7304
    //   7348: goto -> 7352
    //   7351: athrow
    //   7352: invokevirtual func_75139_a : (I)Lnet/minecraft/inventory/Slot;
    //   7355: goto -> 7359
    //   7358: athrow
    //   7359: getstatic Perryc.0 : I
    //   7362: ifle -> 7376
    //   7365: ldc2_w -1114859128
    //   7368: l2i
    //   7369: ldc_w -215234807
    //   7372: ixor
    //   7373: goto -> 7384
    //   7376: ldc2_w 1226085965
    //   7379: l2i
    //   7380: ldc_w 1714906136
    //   7383: ixor
    //   7384: ldc2_w -1460085322
    //   7387: l2i
    //   7388: ldc_w 564305221
    //   7391: ixor
    //   7392: ixor
    //   7393: lookupswitch default -> 15117, -1501973850 -> 7420, -939712910 -> 7376
    //   7420: goto -> 7424
    //   7423: athrow
    //   7424: invokevirtual func_75211_c : ()Lnet/minecraft/item/ItemStack;
    //   7427: goto -> 7431
    //   7430: athrow
    //   7431: getstatic Perryc.1 : I
    //   7434: ifeq -> 7448
    //   7437: ldc2_w -1414323356
    //   7440: l2i
    //   7441: ldc_w -118159608
    //   7444: ixor
    //   7445: goto -> 7456
    //   7448: ldc2_w -1384807994
    //   7451: l2i
    //   7452: ldc_w 1001271406
    //   7455: ixor
    //   7456: ldc2_w 735588112
    //   7459: l2i
    //   7460: ldc_w 1881030922
    //   7463: ixor
    //   7464: ixor
    //   7465: lookupswitch default -> 7492, 142625398 -> 15297, 1472840870 -> 7448
    //   7492: astore #12
    //   7494: getstatic Perryc.0 : I
    //   7497: ifle -> 7511
    //   7500: ldc2_w -1906142964
    //   7503: l2i
    //   7504: ldc_w 1060797503
    //   7507: ixor
    //   7508: goto -> 7519
    //   7511: ldc2_w 2143448957
    //   7514: l2i
    //   7515: ldc_w 890528981
    //   7518: ixor
    //   7519: ldc2_w 93133492
    //   7522: l2i
    //   7523: ldc_w 1339557847
    //   7526: ixor
    //   7527: ixor
    //   7528: lookupswitch default -> 7556, -382138242 -> 7511, -82972592 -> 15353
    //   7556: aload #12
    //   7558: getstatic Perryc.0 : I
    //   7561: ifle -> 7575
    //   7564: ldc2_w 107830021
    //   7567: l2i
    //   7568: ldc_w -369399050
    //   7571: ixor
    //   7572: goto -> 7583
    //   7575: ldc2_w 738150049
    //   7578: l2i
    //   7579: ldc_w 1987806256
    //   7582: ixor
    //   7583: ldc2_w -494490637
    //   7586: l2i
    //   7587: ldc_w 1124888804
    //   7590: ixor
    //   7591: ixor
    //   7592: lookupswitch default -> 7620, 543197784 -> 7575, 1310517988 -> 15403
    //   7620: getfield field_190928_g : Z
    //   7623: ifne -> 7637
    //   7626: ldc2_w 2116413479
    //   7629: l2i
    //   7630: ldc_w 1743352555
    //   7633: ixor
    //   7634: goto -> 7645
    //   7637: ldc2_w 33739421
    //   7640: l2i
    //   7641: ldc_w 466503790
    //   7644: ixor
    //   7645: ldc2_w 1250191338
    //   7648: l2i
    //   7649: ldc_w 294621177
    //   7652: ixor
    //   7653: ixor
    //   7654: tableswitch default -> 7626, 1120367327 -> 7676, 1120367328 -> 8955
    //   7676: getstatic Perryc.1 : I
    //   7679: ifeq -> 7693
    //   7682: ldc2_w -678486306
    //   7685: l2i
    //   7686: ldc_w -574837639
    //   7689: ixor
    //   7690: goto -> 7701
    //   7693: ldc2_w -1266265617
    //   7696: l2i
    //   7697: ldc_w -1059597832
    //   7700: ixor
    //   7701: ldc2_w 193512258
    //   7704: l2i
    //   7705: ldc_w 1709142917
    //   7708: ixor
    //   7709: ixor
    //   7710: lookupswitch default -> 7736, -1781901450 -> 7693, 1684275808 -> 15079
    //   7736: aload_0
    //   7737: getstatic Perryc.0 : I
    //   7740: ifle -> 7754
    //   7743: ldc2_w -1931949234
    //   7746: l2i
    //   7747: ldc_w -999984243
    //   7750: ixor
    //   7751: goto -> 7762
    //   7754: ldc2_w -111536372
    //   7757: l2i
    //   7758: ldc_w -85840734
    //   7761: ixor
    //   7762: ldc2_w -170335328
    //   7765: l2i
    //   7766: ldc_w 1687219220
    //   7769: ixor
    //   7770: ixor
    //   7771: lookupswitch default -> 15269, -1829751782 -> 7796, -638208137 -> 7754
    //   7796: getfield repair : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7799: getstatic Perryc.0 : I
    //   7802: ifle -> 7816
    //   7805: ldc2_w -231186432
    //   7808: l2i
    //   7809: ldc_w 1232999642
    //   7812: ixor
    //   7813: goto -> 7824
    //   7816: ldc2_w 1561324745
    //   7819: l2i
    //   7820: ldc_w -336767021
    //   7823: ixor
    //   7824: ldc2_w 2134409911
    //   7827: l2i
    //   7828: ldc_w -1322995931
    //   7831: ixor
    //   7832: ixor
    //   7833: lookupswitch default -> 7860, 1794820169 -> 7816, 1968855368 -> 15425
    //   7860: goto -> 7864
    //   7863: athrow
    //   7864: invokevirtual getValue : ()Ljava/lang/Object;
    //   7867: goto -> 7871
    //   7870: athrow
    //   7871: checkcast java/lang/Integer
    //   7874: getstatic Perryc.0 : I
    //   7877: ifle -> 7891
    //   7880: ldc2_w -469017003
    //   7883: l2i
    //   7884: ldc_w 111568436
    //   7887: ixor
    //   7888: goto -> 7899
    //   7891: ldc2_w 423552012
    //   7894: l2i
    //   7895: ldc_w -702180478
    //   7898: ixor
    //   7899: ldc2_w -1722208868
    //   7902: l2i
    //   7903: ldc_w 118292326
    //   7906: ixor
    //   7907: ixor
    //   7908: lookupswitch default -> 7936, -481338470 -> 7891, 2096687771 -> 15315
    //   7936: goto -> 7940
    //   7939: athrow
    //   7940: invokevirtual intValue : ()I
    //   7943: goto -> 7947
    //   7946: athrow
    //   7947: i2f
    //   7948: ldc_w 0.009285779
    //   7951: invokestatic floatToIntBits : (F)I
    //   7954: ldc_w 2127569761
    //   7957: ixor
    //   7958: invokestatic intBitsToFloat : (I)F
    //   7961: fdiv
    //   7962: getstatic Perryc.1 : I
    //   7965: ifeq -> 7979
    //   7968: ldc2_w 1686426550
    //   7971: l2i
    //   7972: ldc_w -460711161
    //   7975: ixor
    //   7976: goto -> 7987
    //   7979: ldc2_w 1691796756
    //   7982: l2i
    //   7983: ldc_w -2119812428
    //   7986: ixor
    //   7987: ldc2_w -597219062
    //   7990: l2i
    //   7991: ldc_w 1154320161
    //   7994: ixor
    //   7995: ixor
    //   7996: lookupswitch default -> 15093, 413427354 -> 7979, 2111459723 -> 8024
    //   8024: fstore #14
    //   8026: getstatic Perryc.0 : I
    //   8029: ifle -> 8043
    //   8032: ldc2_w -639783929
    //   8035: l2i
    //   8036: ldc_w -300638111
    //   8039: ixor
    //   8040: goto -> 8051
    //   8043: ldc2_w -1811170345
    //   8046: l2i
    //   8047: ldc_w 39188186
    //   8050: ixor
    //   8051: ldc2_w -506304640
    //   8054: l2i
    //   8055: ldc_w -636185027
    //   8058: ixor
    //   8059: ixor
    //   8060: lookupswitch default -> 8088, -1393373169 -> 8043, 202374619 -> 15053
    //   8088: aload #12
    //   8090: getstatic Perryc.c : I
    //   8093: iflt -> 8107
    //   8096: ldc2_w 867375887
    //   8099: l2i
    //   8100: ldc_w -822081296
    //   8103: ixor
    //   8104: goto -> 8115
    //   8107: ldc2_w -1632169720
    //   8110: l2i
    //   8111: ldc_w 55383490
    //   8114: ixor
    //   8115: ldc2_w 77894555
    //   8118: l2i
    //   8119: ldc_w -1846161117
    //   8122: ixor
    //   8123: ixor
    //   8124: lookupswitch default -> 8152, 716041714 -> 8107, 1776439623 -> 15413
    //   8152: goto -> 8156
    //   8155: athrow
    //   8156: invokevirtual func_77958_k : ()I
    //   8159: goto -> 8163
    //   8162: athrow
    //   8163: i2f
    //   8164: getstatic Perryc.0 : I
    //   8167: ifle -> 8181
    //   8170: ldc2_w -291830621
    //   8173: l2i
    //   8174: ldc_w -1573831792
    //   8177: ixor
    //   8178: goto -> 8189
    //   8181: ldc2_w 896427845
    //   8184: l2i
    //   8185: ldc_w -776716580
    //   8188: ixor
    //   8189: ldc2_w 938737010
    //   8192: l2i
    //   8193: ldc_w 1190260432
    //   8196: ixor
    //   8197: ixor
    //   8198: lookupswitch default -> 15271, -1780987333 -> 8224, 1034431633 -> 8181
    //   8224: fload #14
    //   8226: fmul
    //   8227: getstatic Perryc.1 : I
    //   8230: ifeq -> 8244
    //   8233: ldc2_w -1495321233
    //   8236: l2i
    //   8237: ldc_w 1083619572
    //   8240: ixor
    //   8241: goto -> 8252
    //   8244: ldc2_w 1724162233
    //   8247: l2i
    //   8248: ldc_w 1186215760
    //   8251: ixor
    //   8252: ldc2_w -1755869992
    //   8255: l2i
    //   8256: ldc_w 418193950
    //   8259: ixor
    //   8260: ixor
    //   8261: lookupswitch default -> 15129, -1345701585 -> 8288, 1777541981 -> 8244
    //   8288: goto -> 8292
    //   8291: athrow
    //   8292: invokestatic round : (F)I
    //   8295: goto -> 8299
    //   8298: athrow
    //   8299: getstatic Perryc.0 : I
    //   8302: ifle -> 8316
    //   8305: ldc2_w -1392833914
    //   8308: l2i
    //   8309: ldc_w 1460570453
    //   8312: ixor
    //   8313: goto -> 8324
    //   8316: ldc2_w -468966280
    //   8319: l2i
    //   8320: ldc_w 1044430795
    //   8323: ixor
    //   8324: ldc2_w 586874688
    //   8327: l2i
    //   8328: ldc_w -529371652
    //   8331: ixor
    //   8332: ixor
    //   8333: lookupswitch default -> 15227, 415500559 -> 8360, 964497775 -> 8316
    //   8360: istore #15
    //   8362: getstatic Perryc.0 : I
    //   8365: ifle -> 8379
    //   8368: ldc2_w -1125407196
    //   8371: l2i
    //   8372: ldc_w -695235101
    //   8375: ixor
    //   8376: goto -> 8387
    //   8379: ldc2_w -1999723153
    //   8382: l2i
    //   8383: ldc_w 1199647151
    //   8386: ixor
    //   8387: ldc2_w 324431733
    //   8390: l2i
    //   8391: ldc_w -1239404916
    //   8394: ixor
    //   8395: ixor
    //   8396: lookupswitch default -> 8424, -1371744598 -> 8379, -820876738 -> 15223
    //   8424: iload #15
    //   8426: getstatic Perryc.0 : I
    //   8429: ifle -> 8443
    //   8432: ldc2_w -1228264817
    //   8435: l2i
    //   8436: ldc_w -44546115
    //   8439: ixor
    //   8440: goto -> 8451
    //   8443: ldc2_w 1342787644
    //   8446: l2i
    //   8447: ldc_w -1534846571
    //   8450: ixor
    //   8451: ldc2_w -1201616074
    //   8454: l2i
    //   8455: ldc_w -861200698
    //   8458: ixor
    //   8459: ixor
    //   8460: lookupswitch default -> 15213, -2142856103 -> 8488, 1062844610 -> 8443
    //   8488: aload #12
    //   8490: getstatic Perryc.c : I
    //   8493: iflt -> 8507
    //   8496: ldc2_w -1014083936
    //   8499: l2i
    //   8500: ldc_w -1262150952
    //   8503: ixor
    //   8504: goto -> 8515
    //   8507: ldc2_w -648506057
    //   8510: l2i
    //   8511: ldc_w 1404595397
    //   8514: ixor
    //   8515: ldc2_w -1948273784
    //   8518: l2i
    //   8519: ldc_w -1899419552
    //   8522: ixor
    //   8523: ixor
    //   8524: lookupswitch default -> 8552, 645866038 -> 8507, 1918750608 -> 15355
    //   8552: goto -> 8556
    //   8555: athrow
    //   8556: invokevirtual func_77958_k : ()I
    //   8559: goto -> 8563
    //   8562: athrow
    //   8563: getstatic Perryc.c : I
    //   8566: iflt -> 8580
    //   8569: ldc2_w -794328421
    //   8572: l2i
    //   8573: ldc_w 639838977
    //   8576: ixor
    //   8577: goto -> 8588
    //   8580: ldc2_w 935383419
    //   8583: l2i
    //   8584: ldc_w 991496259
    //   8587: ixor
    //   8588: ldc2_w -1071124057
    //   8591: l2i
    //   8592: ldc_w -161075429
    //   8595: ixor
    //   8596: ixor
    //   8597: lookupswitch default -> 8624, -1985182270 -> 8580, -1060800730 -> 15127
    //   8624: aload #12
    //   8626: getstatic Perryc.0 : I
    //   8629: ifle -> 8643
    //   8632: ldc2_w -1358418662
    //   8635: l2i
    //   8636: ldc_w -1734874771
    //   8639: ixor
    //   8640: goto -> 8651
    //   8643: ldc2_w 601198098
    //   8646: l2i
    //   8647: ldc_w 1608103356
    //   8650: ixor
    //   8651: ldc2_w -500881831
    //   8654: l2i
    //   8655: ldc_w -1864665180
    //   8658: ixor
    //   8659: ixor
    //   8660: lookupswitch default -> 15299, 250767955 -> 8688, 1164023178 -> 8643
    //   8688: goto -> 8692
    //   8691: athrow
    //   8692: invokevirtual func_77952_i : ()I
    //   8695: goto -> 8699
    //   8698: athrow
    //   8699: isub
    //   8700: dup
    //   8701: getstatic Perryc.1 : I
    //   8704: ifeq -> 8718
    //   8707: ldc2_w 2078346058
    //   8710: l2i
    //   8711: ldc_w 840836259
    //   8714: ixor
    //   8715: goto -> 8726
    //   8718: ldc2_w -819609127
    //   8721: l2i
    //   8722: ldc_w -1576150188
    //   8725: ixor
    //   8726: ldc2_w -623053745
    //   8729: l2i
    //   8730: ldc_w 1811778728
    //   8733: ixor
    //   8734: ixor
    //   8735: lookupswitch default -> 8760, -119646450 -> 15211, 87406002 -> 8718
    //   8760: istore #13
    //   8762: if_icmpge -> 8776
    //   8765: ldc2_w 2078848384
    //   8768: l2i
    //   8769: ldc_w 157962335
    //   8772: ixor
    //   8773: goto -> 8784
    //   8776: ldc2_w 1854734658
    //   8779: l2i
    //   8780: ldc_w 470803612
    //   8783: ixor
    //   8784: ldc2_w -1619742322
    //   8787: l2i
    //   8788: ldc_w 26933151
    //   8791: ixor
    //   8792: ixor
    //   8793: tableswitch default -> 8765, -328424498 -> 8816, -328424497 -> 8955
    //   8816: getstatic Perryc.c : I
    //   8819: iflt -> 8833
    //   8822: ldc2_w 482818102
    //   8825: l2i
    //   8826: ldc_w 881923250
    //   8829: ixor
    //   8830: goto -> 8841
    //   8833: ldc2_w -997327896
    //   8836: l2i
    //   8837: ldc_w -209262309
    //   8840: ixor
    //   8841: ldc2_w 1885815843
    //   8844: l2i
    //   8845: ldc_w -600992660
    //   8848: ixor
    //   8849: ixor
    //   8850: lookupswitch default -> 15397, -2078475061 -> 8833, -1690189124 -> 8876
    //   8876: aload_0
    //   8877: ldc2_w -314979489
    //   8880: l2i
    //   8881: ldc_w -314979495
    //   8884: ixor
    //   8885: getstatic Perryc.c : I
    //   8888: iflt -> 8902
    //   8891: ldc2_w 1393924208
    //   8894: l2i
    //   8895: ldc_w 648935720
    //   8898: ixor
    //   8899: goto -> 8910
    //   8902: ldc2_w -1838822759
    //   8905: l2i
    //   8906: ldc_w 2119653972
    //   8909: ixor
    //   8910: ldc2_w -517147813
    //   8913: l2i
    //   8914: ldc_w 314266788
    //   8917: ixor
    //   8918: ixor
    //   8919: lookupswitch default -> 8944, -2043689305 -> 15303, 1255571684 -> 8902
    //   8944: goto -> 8948
    //   8947: athrow
    //   8948: invokespecial takeOffSlot : (I)V
    //   8951: goto -> 8955
    //   8954: athrow
    //   8955: getstatic Perryc.1 : I
    //   8958: ifeq -> 8972
    //   8961: ldc2_w 522111792
    //   8964: l2i
    //   8965: ldc_w 1091554730
    //   8968: ixor
    //   8969: goto -> 8980
    //   8972: ldc2_w -1812269058
    //   8975: l2i
    //   8976: ldc_w -1683228465
    //   8979: ixor
    //   8980: ldc2_w 118649932
    //   8983: l2i
    //   8984: ldc_w -575693933
    //   8987: ixor
    //   8988: ixor
    //   8989: lookupswitch default -> 9016, -2069042875 -> 15279, -1088939533 -> 8972
    //   9016: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoArmor.mc : Lnet/minecraft/client/Minecraft;
    //   9019: getstatic Perryc.0 : I
    //   9022: ifle -> 9036
    //   9025: ldc2_w -169937711
    //   9028: l2i
    //   9029: ldc_w 1739813877
    //   9032: ixor
    //   9033: goto -> 9044
    //   9036: ldc2_w -1019567384
    //   9039: l2i
    //   9040: ldc_w -1969280181
    //   9043: ixor
    //   9044: ldc2_w -1461425826
    //   9047: l2i
    //   9048: ldc_w 760366541
    //   9051: ixor
    //   9052: ixor
    //   9053: lookupswitch default -> 15361, -871127760 -> 9080, 400272311 -> 9036
    //   9080: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   9083: getstatic Perryc.1 : I
    //   9086: ifeq -> 9100
    //   9089: ldc2_w 1504649640
    //   9092: l2i
    //   9093: ldc_w -799696866
    //   9096: ixor
    //   9097: goto -> 9108
    //   9100: ldc2_w -682206160
    //   9103: l2i
    //   9104: ldc_w 539749349
    //   9107: ixor
    //   9108: ldc2_w -851410873
    //   9111: l2i
    //   9112: ldc_w -864956469
    //   9115: ixor
    //   9116: ixor
    //   9117: lookupswitch default -> 15317, -1999899078 -> 9100, -162727847 -> 9144
    //   9144: getfield field_71069_bz : Lnet/minecraft/inventory/Container;
    //   9147: ldc2_w -1497619690
    //   9150: l2i
    //   9151: ldc_w -1497619695
    //   9154: ixor
    //   9155: getstatic Perryc.c : I
    //   9158: iflt -> 9172
    //   9161: ldc2_w 1902116313
    //   9164: l2i
    //   9165: ldc_w -270079422
    //   9168: ixor
    //   9169: goto -> 9180
    //   9172: ldc2_w 355565298
    //   9175: l2i
    //   9176: ldc_w -899285489
    //   9179: ixor
    //   9180: ldc2_w 943880647
    //   9183: l2i
    //   9184: ldc_w 1897939773
    //   9187: ixor
    //   9188: ixor
    //   9189: lookupswitch default -> 9216, -1136067495 -> 9172, -673501855 -> 15107
    //   9216: goto -> 9220
    //   9219: athrow
    //   9220: invokevirtual func_75139_a : (I)Lnet/minecraft/inventory/Slot;
    //   9223: goto -> 9227
    //   9226: athrow
    //   9227: getstatic Perryc.1 : I
    //   9230: ifeq -> 9244
    //   9233: ldc2_w -1803613567
    //   9236: l2i
    //   9237: ldc_w -1021601352
    //   9240: ixor
    //   9241: goto -> 9252
    //   9244: ldc2_w -1962446819
    //   9247: l2i
    //   9248: ldc_w 1764426671
    //   9251: ixor
    //   9252: ldc2_w 2096859547
    //   9255: l2i
    //   9256: ldc_w 1085384072
    //   9259: ixor
    //   9260: ixor
    //   9261: lookupswitch default -> 9288, -2079559065 -> 9244, 1798225706 -> 15399
    //   9288: goto -> 9292
    //   9291: athrow
    //   9292: invokevirtual func_75211_c : ()Lnet/minecraft/item/ItemStack;
    //   9295: goto -> 9299
    //   9298: athrow
    //   9299: getstatic Perryc.c : I
    //   9302: iflt -> 9316
    //   9305: ldc2_w -1079079527
    //   9308: l2i
    //   9309: ldc_w -39827886
    //   9312: ixor
    //   9313: goto -> 9324
    //   9316: ldc2_w -1538413899
    //   9319: l2i
    //   9320: ldc_w 403445707
    //   9323: ixor
    //   9324: ldc2_w -1723854594
    //   9327: l2i
    //   9328: ldc_w 1098241593
    //   9331: ixor
    //   9332: ixor
    //   9333: lookupswitch default -> 15103, -1707406068 -> 9316, 1685355449 -> 9360
    //   9360: astore #13
    //   9362: getstatic Perryc.1 : I
    //   9365: ifeq -> 9379
    //   9368: ldc2_w -1563801336
    //   9371: l2i
    //   9372: ldc_w 769190988
    //   9375: ixor
    //   9376: goto -> 9387
    //   9379: ldc2_w -763997281
    //   9382: l2i
    //   9383: ldc_w -669698828
    //   9386: ixor
    //   9387: ldc2_w 2141091030
    //   9390: l2i
    //   9391: ldc_w -523642661
    //   9394: ixor
    //   9395: ixor
    //   9396: lookupswitch default -> 9424, -248262937 -> 9379, 272959817 -> 15207
    //   9424: aload #13
    //   9426: getstatic Perryc.c : I
    //   9429: iflt -> 9443
    //   9432: ldc2_w 692143597
    //   9435: l2i
    //   9436: ldc_w 62080046
    //   9439: ixor
    //   9440: goto -> 9451
    //   9443: ldc2_w -238818170
    //   9446: l2i
    //   9447: ldc_w 647445307
    //   9450: ixor
    //   9451: ldc2_w 993167217
    //   9454: l2i
    //   9455: ldc_w -30453632
    //   9458: ixor
    //   9459: ixor
    //   9460: lookupswitch default -> 9488, -269494734 -> 15419, 884042922 -> 9443
    //   9488: getfield field_190928_g : Z
    //   9491: ifne -> 9505
    //   9494: ldc2_w -1018723666
    //   9497: l2i
    //   9498: ldc_w 771697167
    //   9501: ixor
    //   9502: goto -> 9513
    //   9505: ldc2_w 789829559
    //   9508: l2i
    //   9509: ldc_w -1045725417
    //   9512: ixor
    //   9513: ldc2_w -2065831347
    //   9516: l2i
    //   9517: ldc_w -276306562
    //   9520: ixor
    //   9521: ixor
    //   9522: tableswitch default -> 9494, -2048743534 -> 9544, -2048743533 -> 10823
    //   9544: getstatic Perryc.c : I
    //   9547: iflt -> 9561
    //   9550: ldc2_w -433568311
    //   9553: l2i
    //   9554: ldc_w 1411529222
    //   9557: ixor
    //   9558: goto -> 9569
    //   9561: ldc2_w 1318504177
    //   9564: l2i
    //   9565: ldc_w 1216346920
    //   9568: ixor
    //   9569: ldc2_w -1477382828
    //   9572: l2i
    //   9573: ldc_w -1548311162
    //   9576: ixor
    //   9577: ixor
    //   9578: lookupswitch default -> 15253, -1236519139 -> 9561, 45053195 -> 9604
    //   9604: aload_0
    //   9605: getstatic Perryc.1 : I
    //   9608: ifeq -> 9622
    //   9611: ldc2_w 538214432
    //   9614: l2i
    //   9615: ldc_w 1164724960
    //   9618: ixor
    //   9619: goto -> 9630
    //   9622: ldc2_w -1079751193
    //   9625: l2i
    //   9626: ldc_w -1207363907
    //   9629: ixor
    //   9630: ldc2_w 1995811505
    //   9633: l2i
    //   9634: ldc_w -155910852
    //   9637: ixor
    //   9638: ixor
    //   9639: lookupswitch default -> 15263, -2014573353 -> 9664, -449209011 -> 9622
    //   9664: getfield repair : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9667: getstatic Perryc.0 : I
    //   9670: ifle -> 9684
    //   9673: ldc2_w 846447296
    //   9676: l2i
    //   9677: ldc_w -1006475830
    //   9680: ixor
    //   9681: goto -> 9692
    //   9684: ldc2_w 116717862
    //   9687: l2i
    //   9688: ldc_w 1468812857
    //   9691: ixor
    //   9692: ldc2_w 1451982126
    //   9695: l2i
    //   9696: ldc_w -289418857
    //   9699: ixor
    //   9700: ixor
    //   9701: lookupswitch default -> 9728, -1642124464 -> 9684, 1313147827 -> 15373
    //   9728: goto -> 9732
    //   9731: athrow
    //   9732: invokevirtual getValue : ()Ljava/lang/Object;
    //   9735: goto -> 9739
    //   9738: athrow
    //   9739: checkcast java/lang/Integer
    //   9742: getstatic Perryc.0 : I
    //   9745: ifle -> 9759
    //   9748: ldc2_w 410620497
    //   9751: l2i
    //   9752: ldc_w -649381021
    //   9755: ixor
    //   9756: goto -> 9767
    //   9759: ldc2_w -441208999
    //   9762: l2i
    //   9763: ldc_w -1564472983
    //   9766: ixor
    //   9767: ldc2_w -1542158943
    //   9770: l2i
    //   9771: ldc_w 798957576
    //   9774: ixor
    //   9775: ixor
    //   9776: lookupswitch default -> 9804, 677965761 -> 9759, 1253641371 -> 15111
    //   9804: goto -> 9808
    //   9807: athrow
    //   9808: invokevirtual intValue : ()I
    //   9811: goto -> 9815
    //   9814: athrow
    //   9815: i2f
    //   9816: ldc_w 0.0676103
    //   9819: invokestatic floatToIntBits : (F)I
    //   9822: ldc_w 2135062341
    //   9825: ixor
    //   9826: invokestatic intBitsToFloat : (I)F
    //   9829: fdiv
    //   9830: getstatic Perryc.1 : I
    //   9833: ifeq -> 9847
    //   9836: ldc2_w 2052194222
    //   9839: l2i
    //   9840: ldc_w -1627267156
    //   9843: ixor
    //   9844: goto -> 9855
    //   9847: ldc2_w -712783960
    //   9850: l2i
    //   9851: ldc_w -167077791
    //   9854: ixor
    //   9855: ldc2_w -926132629
    //   9858: l2i
    //   9859: ldc_w 755135885
    //   9862: ixor
    //   9863: ixor
    //   9864: lookupswitch default -> 15277, -968393681 -> 9892, 10355684 -> 9847
    //   9892: fstore #14
    //   9894: getstatic Perryc.0 : I
    //   9897: ifle -> 9911
    //   9900: ldc2_w 1216239479
    //   9903: l2i
    //   9904: ldc_w -2020281954
    //   9907: ixor
    //   9908: goto -> 9919
    //   9911: ldc2_w -212085853
    //   9914: l2i
    //   9915: ldc_w 1540408273
    //   9918: ixor
    //   9919: ldc2_w 1170506447
    //   9922: l2i
    //   9923: ldc_w 1489317618
    //   9926: ixor
    //   9927: ixor
    //   9928: lookupswitch default -> 15037, -1249199025 -> 9956, -756348204 -> 9911
    //   9956: aload #13
    //   9958: getstatic Perryc.1 : I
    //   9961: ifeq -> 9975
    //   9964: ldc2_w 1898279311
    //   9967: l2i
    //   9968: ldc_w -479914230
    //   9971: ixor
    //   9972: goto -> 9983
    //   9975: ldc2_w -1807197282
    //   9978: l2i
    //   9979: ldc_w -2121064520
    //   9982: ixor
    //   9983: ldc2_w 1102321331
    //   9986: l2i
    //   9987: ldc_w 186141229
    //   9990: ixor
    //   9991: ixor
    //   9992: lookupswitch default -> 15257, -655607269 -> 9975, 1601640632 -> 10020
    //   10020: goto -> 10024
    //   10023: athrow
    //   10024: invokevirtual func_77958_k : ()I
    //   10027: goto -> 10031
    //   10030: athrow
    //   10031: i2f
    //   10032: getstatic Perryc.c : I
    //   10035: iflt -> 10049
    //   10038: ldc2_w -155560241
    //   10041: l2i
    //   10042: ldc_w 306552428
    //   10045: ixor
    //   10046: goto -> 10057
    //   10049: ldc2_w -1154392425
    //   10052: l2i
    //   10053: ldc_w 533264752
    //   10056: ixor
    //   10057: ldc2_w 2101158682
    //   10060: l2i
    //   10061: ldc_w 180307675
    //   10064: ixor
    //   10065: ixor
    //   10066: lookupswitch default -> 15171, -1820480158 -> 10049, -746864090 -> 10092
    //   10092: fload #14
    //   10094: fmul
    //   10095: getstatic Perryc.c : I
    //   10098: iflt -> 10112
    //   10101: ldc2_w -1598948834
    //   10104: l2i
    //   10105: ldc_w 434745423
    //   10108: ixor
    //   10109: goto -> 10120
    //   10112: ldc2_w -476349084
    //   10115: l2i
    //   10116: ldc_w -694678666
    //   10119: ixor
    //   10120: ldc2_w -1885264858
    //   10123: l2i
    //   10124: ldc_w 1206361924
    //   10127: ixor
    //   10128: ixor
    //   10129: lookupswitch default -> 10156, 267109021 -> 10112, 1897853235 -> 15329
    //   10156: goto -> 10160
    //   10159: athrow
    //   10160: invokestatic round : (F)I
    //   10163: goto -> 10167
    //   10166: athrow
    //   10167: getstatic Perryc.c : I
    //   10170: iflt -> 10184
    //   10173: ldc2_w -1537375490
    //   10176: l2i
    //   10177: ldc_w 1610896027
    //   10180: ixor
    //   10181: goto -> 10192
    //   10184: ldc2_w 478112190
    //   10187: l2i
    //   10188: ldc_w 1441092672
    //   10191: ixor
    //   10192: ldc2_w -1831267340
    //   10195: l2i
    //   10196: ldc_w -2017115664
    //   10199: ixor
    //   10200: ixor
    //   10201: lookupswitch default -> 10228, -828226912 -> 10184, -783973791 -> 15197
    //   10228: istore #9
    //   10230: getstatic Perryc.1 : I
    //   10233: ifeq -> 10247
    //   10236: ldc2_w 20633184
    //   10239: l2i
    //   10240: ldc_w 867038088
    //   10243: ixor
    //   10244: goto -> 10255
    //   10247: ldc2_w 427084459
    //   10250: l2i
    //   10251: ldc_w -1164653100
    //   10254: ixor
    //   10255: ldc2_w 1980435555
    //   10258: l2i
    //   10259: ldc_w 1368664409
    //   10262: ixor
    //   10263: ixor
    //   10264: lookupswitch default -> 10292, 352846034 -> 15057, 2111789677 -> 10247
    //   10292: iload #9
    //   10294: getstatic Perryc.0 : I
    //   10297: ifle -> 10311
    //   10300: ldc2_w 594471674
    //   10303: l2i
    //   10304: ldc_w -241348294
    //   10307: ixor
    //   10308: goto -> 10319
    //   10311: ldc2_w -1001768607
    //   10314: l2i
    //   10315: ldc_w 1820058463
    //   10318: ixor
    //   10319: ldc2_w 1338948090
    //   10322: l2i
    //   10323: ldc_w -443882560
    //   10326: ixor
    //   10327: ixor
    //   10328: lookupswitch default -> 10356, 2025316858 -> 15217, 2144148740 -> 10311
    //   10356: aload #13
    //   10358: getstatic Perryc.1 : I
    //   10361: ifeq -> 10375
    //   10364: ldc2_w -1096333884
    //   10367: l2i
    //   10368: ldc_w -546584300
    //   10371: ixor
    //   10372: goto -> 10383
    //   10375: ldc2_w -1676100190
    //   10378: l2i
    //   10379: ldc_w 2110026478
    //   10382: ixor
    //   10383: ldc2_w -1447476831
    //   10386: l2i
    //   10387: ldc_w 818322960
    //   10390: ixor
    //   10391: ixor
    //   10392: lookupswitch default -> 10420, -122465439 -> 15363, 838156902 -> 10375
    //   10420: goto -> 10424
    //   10423: athrow
    //   10424: invokevirtual func_77958_k : ()I
    //   10427: goto -> 10431
    //   10430: athrow
    //   10431: getstatic Perryc.1 : I
    //   10434: ifeq -> 10448
    //   10437: ldc2_w -1307588223
    //   10440: l2i
    //   10441: ldc_w 1124842859
    //   10444: ixor
    //   10445: goto -> 10456
    //   10448: ldc2_w 232288295
    //   10451: l2i
    //   10452: ldc_w 1354642418
    //   10455: ixor
    //   10456: ldc2_w 2128578752
    //   10459: l2i
    //   10460: ldc_w -2090932636
    //   10463: ixor
    //   10464: ixor
    //   10465: lookupswitch default -> 10492, -1294980676 -> 10448, 210049614 -> 15105
    //   10492: aload #13
    //   10494: getstatic Perryc.0 : I
    //   10497: ifle -> 10511
    //   10500: ldc2_w -307447451
    //   10503: l2i
    //   10504: ldc_w -214674365
    //   10507: ixor
    //   10508: goto -> 10519
    //   10511: ldc2_w 192033835
    //   10514: l2i
    //   10515: ldc_w -1039091212
    //   10518: ixor
    //   10519: ldc2_w -510467743
    //   10522: l2i
    //   10523: ldc_w 624109699
    //   10526: ixor
    //   10527: ixor
    //   10528: lookupswitch default -> 10556, -633789244 -> 15087, -51770811 -> 10511
    //   10556: goto -> 10560
    //   10559: athrow
    //   10560: invokevirtual func_77952_i : ()I
    //   10563: goto -> 10567
    //   10566: athrow
    //   10567: isub
    //   10568: dup
    //   10569: getstatic Perryc.c : I
    //   10572: iflt -> 10586
    //   10575: ldc2_w 35293192
    //   10578: l2i
    //   10579: ldc_w 925792315
    //   10582: ixor
    //   10583: goto -> 10594
    //   10586: ldc2_w 1901171838
    //   10589: l2i
    //   10590: ldc_w 820000708
    //   10593: ixor
    //   10594: ldc2_w 369700938
    //   10597: l2i
    //   10598: ldc_w -1805404566
    //   10601: ixor
    //   10602: ixor
    //   10603: lookupswitch default -> 10628, -1218546157 -> 15359, 162274282 -> 10586
    //   10628: istore #8
    //   10630: if_icmpge -> 10644
    //   10633: ldc2_w 472597178
    //   10636: l2i
    //   10637: ldc_w -1292404018
    //   10640: ixor
    //   10641: goto -> 10652
    //   10644: ldc2_w 923334476
    //   10647: l2i
    //   10648: ldc_w -1714106561
    //   10651: ixor
    //   10652: ldc2_w -2095407991
    //   10655: l2i
    //   10656: ldc_w -1550951354
    //   10659: ixor
    //   10660: ixor
    //   10661: tableswitch default -> 10633, -1907820357 -> 10684, -1907820356 -> 10823
    //   10684: getstatic Perryc.c : I
    //   10687: iflt -> 10701
    //   10690: ldc2_w -1870756849
    //   10693: l2i
    //   10694: ldc_w -441599043
    //   10697: ixor
    //   10698: goto -> 10709
    //   10701: ldc2_w 461760428
    //   10704: l2i
    //   10705: ldc_w 1840749820
    //   10708: ixor
    //   10709: ldc2_w -1695634594
    //   10712: l2i
    //   10713: ldc_w 792068344
    //   10716: ixor
    //   10717: ixor
    //   10718: lookupswitch default -> 15409, -1072983020 -> 10701, -1008021258 -> 10744
    //   10744: aload_0
    //   10745: ldc2_w -697122549
    //   10748: l2i
    //   10749: ldc_w -697122548
    //   10752: ixor
    //   10753: getstatic Perryc.0 : I
    //   10756: ifle -> 10770
    //   10759: ldc2_w -747977568
    //   10762: l2i
    //   10763: ldc_w -1811643178
    //   10766: ixor
    //   10767: goto -> 10778
    //   10770: ldc2_w -1461837928
    //   10773: l2i
    //   10774: ldc_w -1474877544
    //   10777: ixor
    //   10778: ldc2_w -1769160104
    //   10781: l2i
    //   10782: ldc_w 1019848818
    //   10785: ixor
    //   10786: ixor
    //   10787: lookupswitch default -> 10812, -315938212 -> 15245, 374740773 -> 10770
    //   10812: goto -> 10816
    //   10815: athrow
    //   10816: invokespecial takeOffSlot : (I)V
    //   10819: goto -> 10823
    //   10822: athrow
    //   10823: getstatic Perryc.1 : I
    //   10826: ifeq -> 10840
    //   10829: ldc2_w 1405422806
    //   10832: l2i
    //   10833: ldc_w 771659844
    //   10836: ixor
    //   10837: goto -> 10848
    //   10840: ldc2_w 2058484577
    //   10843: l2i
    //   10844: ldc_w 222423929
    //   10847: ixor
    //   10848: ldc2_w 1412004617
    //   10851: l2i
    //   10852: ldc_w -423134774
    //   10855: ixor
    //   10856: ixor
    //   10857: lookupswitch default -> 15041, -987884837 -> 10884, -858417583 -> 10840
    //   10884: getstatic bigname/zprestige/webhack/features/modules/Combat/AutoArmor.mc : Lnet/minecraft/client/Minecraft;
    //   10887: getstatic Perryc.0 : I
    //   10890: ifle -> 10904
    //   10893: ldc2_w -1832054732
    //   10896: l2i
    //   10897: ldc_w -2136275585
    //   10900: ixor
    //   10901: goto -> 10912
    //   10904: ldc2_w -558890213
    //   10907: l2i
    //   10908: ldc_w -167668894
    //   10911: ixor
    //   10912: ldc2_w -1479272243
    //   10915: l2i
    //   10916: ldc_w 2074502344
    //   10919: ixor
    //   10920: ixor
    //   10921: lookupswitch default -> 15073, -837523122 -> 10904, -188486532 -> 10948
    //   10948: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   10951: getstatic Perryc.0 : I
    //   10954: ifle -> 10968
    //   10957: ldc2_w 1117730977
    //   10960: l2i
    //   10961: ldc_w 1037468078
    //   10964: ixor
    //   10965: goto -> 10976
    //   10968: ldc2_w -782835378
    //   10971: l2i
    //   10972: ldc_w -918635513
    //   10975: ixor
    //   10976: ldc2_w 529285081
    //   10979: l2i
    //   10980: ldc_w -253433538
    //   10983: ixor
    //   10984: ixor
    //   10985: lookupswitch default -> 15405, -1876856856 -> 10968, -150959186 -> 11012
    //   11012: getfield field_71069_bz : Lnet/minecraft/inventory/Container;
    //   11015: ldc2_w -1679396478
    //   11018: l2i
    //   11019: ldc_w -1679396470
    //   11022: ixor
    //   11023: getstatic Perryc.0 : I
    //   11026: ifle -> 11040
    //   11029: ldc2_w 299709161
    //   11032: l2i
    //   11033: ldc_w 1294035792
    //   11036: ixor
    //   11037: goto -> 11048
    //   11040: ldc2_w 1137125048
    //   11043: l2i
    //   11044: ldc_w -1855061946
    //   11047: ixor
    //   11048: ldc2_w 7785374
    //   11051: l2i
    //   11052: ldc_w -1716009543
    //   11055: ixor
    //   11056: ixor
    //   11057: lookupswitch default -> 15229, -985835618 -> 11040, 1265117401 -> 11084
    //   11084: goto -> 11088
    //   11087: athrow
    //   11088: invokevirtual func_75139_a : (I)Lnet/minecraft/inventory/Slot;
    //   11091: goto -> 11095
    //   11094: athrow
    //   11095: getstatic Perryc.1 : I
    //   11098: ifeq -> 11112
    //   11101: ldc2_w -460575346
    //   11104: l2i
    //   11105: ldc_w -1251097455
    //   11108: ixor
    //   11109: goto -> 11120
    //   11112: ldc2_w -2116095503
    //   11115: l2i
    //   11116: ldc_w -1515616889
    //   11119: ixor
    //   11120: ldc2_w 839052941
    //   11123: l2i
    //   11124: ldc_w 600339857
    //   11127: ixor
    //   11128: ixor
    //   11129: lookupswitch default -> 11156, -2070619889 -> 11112, 1076589059 -> 15163
    //   11156: goto -> 11160
    //   11159: athrow
    //   11160: invokevirtual func_75211_c : ()Lnet/minecraft/item/ItemStack;
    //   11163: goto -> 11167
    //   11166: athrow
    //   11167: getstatic Perryc.c : I
    //   11170: iflt -> 11184
    //   11173: ldc2_w -137980728
    //   11176: l2i
    //   11177: ldc_w -1651734545
    //   11180: ixor
    //   11181: goto -> 11192
    //   11184: ldc2_w 1884597598
    //   11187: l2i
    //   11188: ldc_w -205262764
    //   11191: ixor
    //   11192: ldc2_w 918669628
    //   11195: l2i
    //   11196: ldc_w -2131407158
    //   11199: ixor
    //   11200: ixor
    //   11201: lookupswitch default -> 11228, -595684143 -> 15089, 2075563833 -> 11184
    //   11228: astore #14
    //   11230: getstatic Perryc.1 : I
    //   11233: ifeq -> 11247
    //   11236: ldc2_w -1514951922
    //   11239: l2i
    //   11240: ldc_w 1479400303
    //   11243: ixor
    //   11244: goto -> 11255
    //   11247: ldc2_w 456199374
    //   11250: l2i
    //   11251: ldc_w 1778366696
    //   11254: ixor
    //   11255: ldc2_w -579884253
    //   11258: l2i
    //   11259: ldc_w -1612388406
    //   11262: ixor
    //   11263: ixor
    //   11264: lookupswitch default -> 15375, -1089127288 -> 11247, 809892047 -> 11292
    //   11292: aload #14
    //   11294: getstatic Perryc.0 : I
    //   11297: ifle -> 11311
    //   11300: ldc2_w -1273469567
    //   11303: l2i
    //   11304: ldc_w 1475943456
    //   11307: ixor
    //   11308: goto -> 11319
    //   11311: ldc2_w 577097325
    //   11314: l2i
    //   11315: ldc_w -1746433847
    //   11318: ixor
    //   11319: ldc2_w 45692808
    //   11322: l2i
    //   11323: ldc_w 2135479997
    //   11326: ixor
    //   11327: ixor
    //   11328: lookupswitch default -> 15209, -1643079532 -> 11311, -931944559 -> 11356
    //   11356: getfield field_190928_g : Z
    //   11359: ifne -> 11373
    //   11362: ldc2_w -1444410415
    //   11365: l2i
    //   11366: ldc_w -1173119101
    //   11369: ixor
    //   11370: goto -> 11381
    //   11373: ldc2_w 1972954083
    //   11376: l2i
    //   11377: ldc_w 1717794750
    //   11380: ixor
    //   11381: ldc2_w 72646164
    //   11384: l2i
    //   11385: ldc_w -1064100079
    //   11388: ixor
    //   11389: ixor
    //   11390: tableswitch default -> 11362, -683870889 -> 11412, -683870888 -> 12691
    //   11412: getstatic Perryc.c : I
    //   11415: iflt -> 11429
    //   11418: ldc2_w 1741987476
    //   11421: l2i
    //   11422: ldc_w 1344100157
    //   11425: ixor
    //   11426: goto -> 11437
    //   11429: ldc2_w -2078045777
    //   11432: l2i
    //   11433: ldc_w -1873468723
    //   11436: ixor
    //   11437: ldc2_w 141110314
    //   11440: l2i
    //   11441: ldc_w 1212822875
    //   11444: ixor
    //   11445: ixor
    //   11446: lookupswitch default -> 11472, -1848783188 -> 11429, 2011877592 -> 15063
    //   11472: aload_0
    //   11473: getstatic Perryc.c : I
    //   11476: iflt -> 11490
    //   11479: ldc2_w -1013085270
    //   11482: l2i
    //   11483: ldc_w 1886233901
    //   11486: ixor
    //   11487: goto -> 11498
    //   11490: ldc2_w -168285727
    //   11493: l2i
    //   11494: ldc_w -1828858618
    //   11497: ixor
    //   11498: ldc2_w 596717364
    //   11501: l2i
    //   11502: ldc_w 1321521763
    //   11505: ixor
    //   11506: ixor
    //   11507: lookupswitch default -> 11532, -559557680 -> 15043, 843163856 -> 11490
    //   11532: getfield repair : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11535: getstatic Perryc.c : I
    //   11538: iflt -> 11552
    //   11541: ldc2_w 1509932852
    //   11544: l2i
    //   11545: ldc_w 1922857191
    //   11548: ixor
    //   11549: goto -> 11560
    //   11552: ldc2_w -781845234
    //   11555: l2i
    //   11556: ldc_w -281877651
    //   11559: ixor
    //   11560: ldc2_w 986265285
    //   11563: l2i
    //   11564: ldc_w -1521596065
    //   11567: ixor
    //   11568: ixor
    //   11569: lookupswitch default -> 11596, -1260079031 -> 15097, 393377664 -> 11552
    //   11596: goto -> 11600
    //   11599: athrow
    //   11600: invokevirtual getValue : ()Ljava/lang/Object;
    //   11603: goto -> 11607
    //   11606: athrow
    //   11607: checkcast java/lang/Integer
    //   11610: getstatic Perryc.c : I
    //   11613: iflt -> 11627
    //   11616: ldc2_w 486677980
    //   11619: l2i
    //   11620: ldc_w 1068635834
    //   11623: ixor
    //   11624: goto -> 11635
    //   11627: ldc2_w -861573796
    //   11630: l2i
    //   11631: ldc_w 1726973443
    //   11634: ixor
    //   11635: ldc2_w -1241205095
    //   11638: l2i
    //   11639: ldc_w 1681336967
    //   11642: ixor
    //   11643: ixor
    //   11644: lookupswitch default -> 15141, -259811464 -> 11627, 2021226305 -> 11672
    //   11672: goto -> 11676
    //   11675: athrow
    //   11676: invokevirtual intValue : ()I
    //   11679: goto -> 11683
    //   11682: athrow
    //   11683: i2f
    //   11684: ldc_w 0.10023192
    //   11687: invokestatic floatToIntBits : (F)I
    //   11690: ldc_w 2131052133
    //   11693: ixor
    //   11694: invokestatic intBitsToFloat : (I)F
    //   11697: fdiv
    //   11698: getstatic Perryc.0 : I
    //   11701: ifle -> 11715
    //   11704: ldc2_w 957204112
    //   11707: l2i
    //   11708: ldc_w -1816220378
    //   11711: ixor
    //   11712: goto -> 11723
    //   11715: ldc2_w 455424048
    //   11718: l2i
    //   11719: ldc_w 314426878
    //   11722: ixor
    //   11723: ldc2_w -1647629505
    //   11726: l2i
    //   11727: ldc_w -1083074287
    //   11730: ixor
    //   11731: ixor
    //   11732: lookupswitch default -> 11760, -2012620392 -> 15401, -1697169188 -> 11715
    //   11760: fstore #16
    //   11762: getstatic Perryc.c : I
    //   11765: iflt -> 11779
    //   11768: ldc2_w 1831084261
    //   11771: l2i
    //   11772: ldc_w -435393030
    //   11775: ixor
    //   11776: goto -> 11787
    //   11779: ldc2_w -1937086595
    //   11782: l2i
    //   11783: ldc_w 2034583815
    //   11786: ixor
    //   11787: ldc2_w 1168926084
    //   11790: l2i
    //   11791: ldc_w 595592894
    //   11794: ixor
    //   11795: ixor
    //   11796: lookupswitch default -> 15177, -1813820096 -> 11824, -318493147 -> 11779
    //   11824: aload #14
    //   11826: getstatic Perryc.c : I
    //   11829: iflt -> 11843
    //   11832: ldc2_w -545666735
    //   11835: l2i
    //   11836: ldc_w -634196596
    //   11839: ixor
    //   11840: goto -> 11851
    //   11843: ldc2_w -1073501459
    //   11846: l2i
    //   11847: ldc_w 1847096517
    //   11850: ixor
    //   11851: ldc2_w 1021553127
    //   11854: l2i
    //   11855: ldc_w 1547768372
    //   11858: ixor
    //   11859: ixor
    //   11860: lookupswitch default -> 15301, -826710533 -> 11888, 1709809422 -> 11843
    //   11888: goto -> 11892
    //   11891: athrow
    //   11892: invokevirtual func_77958_k : ()I
    //   11895: goto -> 11899
    //   11898: athrow
    //   11899: i2f
    //   11900: getstatic Perryc.c : I
    //   11903: iflt -> 11917
    //   11906: ldc2_w 923088332
    //   11909: l2i
    //   11910: ldc_w -1742700096
    //   11913: ixor
    //   11914: goto -> 11925
    //   11917: ldc2_w 1463231636
    //   11920: l2i
    //   11921: ldc_w 345430968
    //   11924: ixor
    //   11925: ldc2_w -1966213158
    //   11928: l2i
    //   11929: ldc_w 1291032915
    //   11932: ixor
    //   11933: ixor
    //   11934: lookupswitch default -> 15187, -2053140059 -> 11960, 1763433093 -> 11917
    //   11960: fload #16
    //   11962: fmul
    //   11963: getstatic Perryc.0 : I
    //   11966: ifle -> 11980
    //   11969: ldc2_w 796657478
    //   11972: l2i
    //   11973: ldc_w 818118959
    //   11976: ixor
    //   11977: goto -> 11988
    //   11980: ldc2_w -437427749
    //   11983: l2i
    //   11984: ldc_w 1629729790
    //   11987: ixor
    //   11988: ldc2_w -1533003522
    //   11991: l2i
    //   11992: ldc_w -1992227942
    //   11995: ixor
    //   11996: ixor
    //   11997: lookupswitch default -> 12024, -1762703267 -> 11980, 845069581 -> 15131
    //   12024: goto -> 12028
    //   12027: athrow
    //   12028: invokestatic round : (F)I
    //   12031: goto -> 12035
    //   12034: athrow
    //   12035: getstatic Perryc.0 : I
    //   12038: ifle -> 12052
    //   12041: ldc2_w 740114947
    //   12044: l2i
    //   12045: ldc_w -1149123508
    //   12048: ixor
    //   12049: goto -> 12060
    //   12052: ldc2_w -34784716
    //   12055: l2i
    //   12056: ldc_w -1934523568
    //   12059: ixor
    //   12060: ldc2_w 1575647014
    //   12063: l2i
    //   12064: ldc_w 865105036
    //   12067: ixor
    //   12068: ixor
    //   12069: lookupswitch default -> 15167, -102332955 -> 12052, 522631886 -> 12096
    //   12096: istore #17
    //   12098: getstatic Perryc.c : I
    //   12101: iflt -> 12115
    //   12104: ldc2_w 1353224064
    //   12107: l2i
    //   12108: ldc_w 518666204
    //   12111: ixor
    //   12112: goto -> 12123
    //   12115: ldc2_w 301274396
    //   12118: l2i
    //   12119: ldc_w 1888985338
    //   12122: ixor
    //   12123: ldc2_w -1013540241
    //   12126: l2i
    //   12127: ldc_w -168522150
    //   12130: ixor
    //   12131: ixor
    //   12132: lookupswitch default -> 15219, 1459659219 -> 12160, 2015407209 -> 12115
    //   12160: iload #17
    //   12162: getstatic Perryc.0 : I
    //   12165: ifle -> 12179
    //   12168: ldc2_w -628727767
    //   12171: l2i
    //   12172: ldc_w 1732112300
    //   12175: ixor
    //   12176: goto -> 12187
    //   12179: ldc2_w 617521782
    //   12182: l2i
    //   12183: ldc_w 864204763
    //   12186: ixor
    //   12187: ldc2_w -930653839
    //   12190: l2i
    //   12191: ldc_w 1987797993
    //   12194: ixor
    //   12195: ixor
    //   12196: lookupswitch default -> 15175, -1448071371 -> 12224, 55031069 -> 12179
    //   12224: aload #14
    //   12226: getstatic Perryc.c : I
    //   12229: iflt -> 12243
    //   12232: ldc2_w -1239523808
    //   12235: l2i
    //   12236: ldc_w 1476442742
    //   12239: ixor
    //   12240: goto -> 12251
    //   12243: ldc2_w -29600138
    //   12246: l2i
    //   12247: ldc_w 1712187864
    //   12250: ixor
    //   12251: ldc2_w -1627348936
    //   12254: l2i
    //   12255: ldc_w -848698471
    //   12258: ixor
    //   12259: ixor
    //   12260: lookupswitch default -> 12288, -2022578474 -> 12243, -1133008905 -> 15081
    //   12288: goto -> 12292
    //   12291: athrow
    //   12292: invokevirtual func_77958_k : ()I
    //   12295: goto -> 12299
    //   12298: athrow
    //   12299: getstatic Perryc.c : I
    //   12302: iflt -> 12316
    //   12305: ldc2_w 1122317273
    //   12308: l2i
    //   12309: ldc_w 908836059
    //   12312: ixor
    //   12313: goto -> 12324
    //   12316: ldc2_w -725999624
    //   12319: l2i
    //   12320: ldc_w -1130882903
    //   12323: ixor
    //   12324: ldc2_w -1017801792
    //   12327: l2i
    //   12328: ldc_w -319885357
    //   12331: ixor
    //   12332: ixor
    //   12333: lookupswitch default -> 12360, 1534456593 -> 15039, 1828263471 -> 12316
    //   12360: aload #14
    //   12362: getstatic Perryc.0 : I
    //   12365: ifle -> 12379
    //   12368: ldc2_w 1491251189
    //   12371: l2i
    //   12372: ldc_w -940522555
    //   12375: ixor
    //   12376: goto -> 12387
    //   12379: ldc2_w -271041224
    //   12382: l2i
    //   12383: ldc_w -1695356457
    //   12386: ixor
    //   12387: ldc2_w -1650336282
    //   12390: l2i
    //   12391: ldc_w 671989737
    //   12394: ixor
    //   12395: ixor
    //   12396: lookupswitch default -> 12424, -737536509 -> 12379, 717098559 -> 15311
    //   12424: goto -> 12428
    //   12427: athrow
    //   12428: invokevirtual func_77952_i : ()I
    //   12431: goto -> 12435
    //   12434: athrow
    //   12435: isub
    //   12436: dup
    //   12437: getstatic Perryc.0 : I
    //   12440: ifle -> 12454
    //   12443: ldc2_w 657896856
    //   12446: l2i
    //   12447: ldc_w -559364694
    //   12450: ixor
    //   12451: goto -> 12462
    //   12454: ldc2_w 1782744825
    //   12457: l2i
    //   12458: ldc_w 164552413
    //   12461: ixor
    //   12462: ldc2_w -1245717265
    //   12465: l2i
    //   12466: ldc_w 436642312
    //   12469: ixor
    //   12470: ixor
    //   12471: lookupswitch default -> 12496, 1093012563 -> 12454, 1445400277 -> 15389
    //   12496: istore #15
    //   12498: if_icmpge -> 12512
    //   12501: ldc2_w 2075503903
    //   12504: l2i
    //   12505: ldc_w 1332719467
    //   12508: ixor
    //   12509: goto -> 12520
    //   12512: ldc2_w 220556664
    //   12515: l2i
    //   12516: ldc_w 973041421
    //   12519: ixor
    //   12520: ldc2_w -1677610792
    //   12523: l2i
    //   12524: ldc_w -230560446
    //   12527: ixor
    //   12528: ixor
    //   12529: tableswitch default -> 12501, 1520066542 -> 12552, 1520066543 -> 12691
    //   12552: getstatic Perryc.c : I
    //   12555: iflt -> 12569
    //   12558: ldc2_w 1831235356
    //   12561: l2i
    //   12562: ldc_w 1716084463
    //   12565: ixor
    //   12566: goto -> 12577
    //   12569: ldc2_w 657343448
    //   12572: l2i
    //   12573: ldc_w -428834421
    //   12576: ixor
    //   12577: ldc2_w 468459298
    //   12580: l2i
    //   12581: ldc_w -1459445186
    //   12584: ixor
    //   12585: ixor
    //   12586: lookupswitch default -> 12612, -1182692113 -> 15071, -424319047 -> 12569
    //   12612: aload_0
    //   12613: ldc2_w -323899091
    //   12616: l2i
    //   12617: ldc_w -323899099
    //   12620: ixor
    //   12621: getstatic Perryc.1 : I
    //   12624: ifeq -> 12638
    //   12627: ldc2_w -109048346
    //   12630: l2i
    //   12631: ldc_w -1474835255
    //   12634: ixor
    //   12635: goto -> 12646
    //   12638: ldc2_w -1172263068
    //   12641: l2i
    //   12642: ldc_w 1072670956
    //   12645: ixor
    //   12646: ldc2_w -837378618
    //   12649: l2i
    //   12650: ldc_w 307040144
    //   12653: ixor
    //   12654: ixor
    //   12655: lookupswitch default -> 12680, -1915989127 -> 15083, 1149090806 -> 12638
    //   12680: goto -> 12684
    //   12683: athrow
    //   12684: invokespecial takeOffSlot : (I)V
    //   12687: goto -> 12691
    //   12690: athrow
    //   12691: getstatic Perryc.1 : I
    //   12694: ifeq -> 12708
    //   12697: ldc2_w 1808881951
    //   12700: l2i
    //   12701: ldc_w -514347729
    //   12704: ixor
    //   12705: goto -> 12716
    //   12708: ldc2_w 366090308
    //   12711: l2i
    //   12712: ldc_w -2040024349
    //   12715: ixor
    //   12716: ldc2_w -34191070
    //   12719: l2i
    //   12720: ldc_w 1112082631
    //   12723: ixor
    //   12724: ixor
    //   12725: lookupswitch default -> 12752, -536253315 -> 12708, 892974549 -> 15181
    //   12752: aload_0
    //   12753: getstatic Perryc.c : I
    //   12756: iflt -> 12770
    //   12759: ldc2_w -1186136202
    //   12762: l2i
    //   12763: ldc_w -720993160
    //   12766: ixor
    //   12767: goto -> 12778
    //   12770: ldc2_w -1124711248
    //   12773: l2i
    //   12774: ldc_w 1325359933
    //   12777: ixor
    //   12778: ldc2_w -153569143
    //   12781: l2i
    //   12782: ldc_w 498371405
    //   12785: ixor
    //   12786: ixor
    //   12787: lookupswitch default -> 12812, -2027534134 -> 15155, 957852277 -> 12770
    //   12812: getfield zprestigeproarmormanezmadcopennwhyuread : I
    //   12815: ldc2_w -151718353
    //   12818: l2i
    //   12819: ldc_w -151718354
    //   12822: ixor
    //   12823: if_icmpne -> 12837
    //   12826: ldc2_w 412726271
    //   12829: l2i
    //   12830: ldc_w 2052255686
    //   12833: ixor
    //   12834: goto -> 12845
    //   12837: ldc2_w 1853382759
    //   12840: l2i
    //   12841: ldc_w 213072989
    //   12844: ixor
    //   12845: ldc2_w 238095704
    //   12848: l2i
    //   12849: ldc_w 779892692
    //   12852: ixor
    //   12853: ixor
    //   12854: tableswitch default -> 12826, 1116104373 -> 12876, 1116104374 -> 13152
    //   12876: getstatic Perryc.0 : I
    //   12879: ifle -> 12893
    //   12882: ldc2_w -2066355262
    //   12885: l2i
    //   12886: ldc_w -1533265600
    //   12889: ixor
    //   12890: goto -> 12901
    //   12893: ldc2_w 551449576
    //   12896: l2i
    //   12897: ldc_w 1219775236
    //   12900: ixor
    //   12901: ldc2_w -989600355
    //   12904: l2i
    //   12905: ldc_w 413895885
    //   12908: ixor
    //   12909: ixor
    //   12910: lookupswitch default -> 12936, -35537966 -> 15273, 348146992 -> 12893
    //   12936: goto -> 12940
    //   12939: athrow
    //   12940: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Combat/AutoArmor;
    //   12943: goto -> 12947
    //   12946: athrow
    //   12947: getstatic Perryc.1 : I
    //   12950: ifeq -> 12964
    //   12953: ldc2_w 199862918
    //   12956: l2i
    //   12957: ldc_w 1395677069
    //   12960: ixor
    //   12961: goto -> 12972
    //   12964: ldc2_w 1898820003
    //   12967: l2i
    //   12968: ldc_w 572068738
    //   12971: ixor
    //   12972: ldc2_w -1826529770
    //   12975: l2i
    //   12976: ldc_w 668637491
    //   12979: ixor
    //   12980: ixor
    //   12981: lookupswitch default -> 13008, -2135915083 -> 12964, -333301202 -> 15411
    //   13008: goto -> 13012
    //   13011: athrow
    //   13012: invokevirtual enable : ()V
    //   13015: goto -> 13019
    //   13018: athrow
    //   13019: getstatic Perryc.0 : I
    //   13022: ifle -> 13036
    //   13025: ldc2_w -1015478416
    //   13028: l2i
    //   13029: ldc_w -1176490302
    //   13032: ixor
    //   13033: goto -> 13044
    //   13036: ldc2_w -305948618
    //   13039: l2i
    //   13040: ldc_w 1691336395
    //   13043: ixor
    //   13044: ldc2_w 620482379
    //   13047: l2i
    //   13048: ldc_w 1404829183
    //   13051: ixor
    //   13052: ixor
    //   13053: lookupswitch default -> 15061, -28568503 -> 13080, 232332038 -> 13036
    //   13080: aload_0
    //   13081: ldc2_w 197251752
    //   13084: l2i
    //   13085: ldc_w 197251752
    //   13088: ixor
    //   13089: getstatic Perryc.c : I
    //   13092: iflt -> 13106
    //   13095: ldc2_w 326074165
    //   13098: l2i
    //   13099: ldc_w 177098849
    //   13102: ixor
    //   13103: goto -> 13114
    //   13106: ldc2_w 1152121589
    //   13109: l2i
    //   13110: ldc_w 1376157189
    //   13113: ixor
    //   13114: ldc2_w -1216896405
    //   13117: l2i
    //   13118: ldc_w -1862105631
    //   13121: ixor
    //   13122: ixor
    //   13123: lookupswitch default -> 15047, 819503994 -> 13148, 1066666206 -> 13106
    //   13148: putfield zprestigeproarmormanezmadcopennwhyuread : I
    //   13151: return
    //   13152: return
    //   13153: getstatic Perryc.0 : I
    //   13156: ifle -> 13170
    //   13159: ldc2_w 443213802
    //   13162: l2i
    //   13163: ldc_w -314491057
    //   13166: ixor
    //   13167: goto -> 13178
    //   13170: ldc2_w 634072124
    //   13173: l2i
    //   13174: ldc_w -574165004
    //   13177: ixor
    //   13178: ldc2_w 661737197
    //   13181: l2i
    //   13182: ldc_w -1251311301
    //   13185: ixor
    //   13186: ixor
    //   13187: lookupswitch default -> 15065, 1697650547 -> 13170, 1779829790 -> 13212
    //   13212: aload_0
    //   13213: ldc2_w -986103048
    //   13216: l2i
    //   13217: ldc_w -986103048
    //   13220: ixor
    //   13221: getstatic Perryc.1 : I
    //   13224: ifeq -> 13238
    //   13227: ldc2_w 1670237692
    //   13230: l2i
    //   13231: ldc_w -1946879593
    //   13234: ixor
    //   13235: goto -> 13246
    //   13238: ldc2_w -601966112
    //   13241: l2i
    //   13242: ldc_w 580196651
    //   13245: ixor
    //   13246: ldc2_w -1419326182
    //   13249: l2i
    //   13250: ldc_w -430508313
    //   13253: ixor
    //   13254: ixor
    //   13255: lookupswitch default -> 13280, -1521938538 -> 15391, -710016265 -> 13238
    //   13280: putfield flag : Z
    //   13283: getstatic Perryc.0 : I
    //   13286: ifle -> 13300
    //   13289: ldc2_w 1990081746
    //   13292: l2i
    //   13293: ldc_w 268206077
    //   13296: ixor
    //   13297: goto -> 13308
    //   13300: ldc2_w -212338388
    //   13303: l2i
    //   13304: ldc_w -190818700
    //   13307: ixor
    //   13308: ldc2_w 687579839
    //   13311: l2i
    //   13312: ldc_w -1144130571
    //   13315: ixor
    //   13316: ixor
    //   13317: lookupswitch default -> 15193, -1799225838 -> 13344, -363589019 -> 13300
    //   13344: aload_0
    //   13345: getstatic Perryc.0 : I
    //   13348: ifle -> 13362
    //   13351: ldc2_w -123489417
    //   13354: l2i
    //   13355: ldc_w 1343194463
    //   13358: ixor
    //   13359: goto -> 13370
    //   13362: ldc2_w 1747597249
    //   13365: l2i
    //   13366: ldc_w 859059871
    //   13369: ixor
    //   13370: ldc2_w 1963780424
    //   13373: l2i
    //   13374: ldc_w 1508183543
    //   13377: ixor
    //   13378: ixor
    //   13379: lookupswitch default -> 15075, -2075798889 -> 13362, 2012734945 -> 13404
    //   13404: getfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   13407: ldc_w 0.01708096
    //   13410: invokestatic floatToIntBits : (F)I
    //   13413: ldc_w 2126769503
    //   13416: ixor
    //   13417: invokestatic intBitsToFloat : (I)F
    //   13420: getstatic Perryc.0 : I
    //   13423: ifle -> 13437
    //   13426: ldc2_w 1989318084
    //   13429: l2i
    //   13430: ldc_w 367221625
    //   13433: ixor
    //   13434: goto -> 13445
    //   13437: ldc2_w -1348951058
    //   13440: l2i
    //   13441: ldc_w 925149881
    //   13444: ixor
    //   13445: ldc2_w 723600333
    //   13448: l2i
    //   13449: ldc_w 583059058
    //   13452: ixor
    //   13453: ixor
    //   13454: lookupswitch default -> 13480, 626346725 -> 13437, 1787841282 -> 15067
    //   13480: getstatic bigname/zprestige/webhack/WebHack.serverManager : Lbigname/zprestige/webhack/manager/ServerManager;
    //   13483: getstatic Perryc.c : I
    //   13486: iflt -> 13500
    //   13489: ldc2_w -2065329601
    //   13492: l2i
    //   13493: ldc_w 586139080
    //   13496: ixor
    //   13497: goto -> 13508
    //   13500: ldc2_w -1076739127
    //   13503: l2i
    //   13504: ldc_w 225372148
    //   13507: ixor
    //   13508: ldc2_w 788648100
    //   13511: l2i
    //   13512: ldc_w 1395283316
    //   13515: ixor
    //   13516: ixor
    //   13517: lookupswitch default -> 13544, -1277595288 -> 13500, -635317721 -> 15255
    //   13544: goto -> 13548
    //   13547: athrow
    //   13548: invokevirtual getTpsFactor : ()F
    //   13551: goto -> 13555
    //   13554: athrow
    //   13555: fmul
    //   13556: f2i
    //   13557: i2l
    //   13558: getstatic Perryc.c : I
    //   13561: iflt -> 13575
    //   13564: ldc2_w 2016097884
    //   13567: l2i
    //   13568: ldc_w -1799284594
    //   13571: ixor
    //   13572: goto -> 13583
    //   13575: ldc2_w 525317405
    //   13578: l2i
    //   13579: ldc_w -1020350641
    //   13582: ixor
    //   13583: ldc2_w -435660780
    //   13586: l2i
    //   13587: ldc_w 1233422647
    //   13590: ixor
    //   13591: ixor
    //   13592: lookupswitch default -> 13620, -530524343 -> 13575, 1130823665 -> 15135
    //   13620: goto -> 13624
    //   13623: athrow
    //   13624: invokevirtual passedMs : (J)Z
    //   13627: goto -> 13631
    //   13630: athrow
    //   13631: ifeq -> 13645
    //   13634: ldc2_w 186546658
    //   13637: l2i
    //   13638: ldc_w 519258877
    //   13641: ixor
    //   13642: goto -> 13653
    //   13645: ldc2_w 227885514
    //   13648: l2i
    //   13649: ldc_w 410548950
    //   13652: ixor
    //   13653: ldc2_w 1864014118
    //   13656: l2i
    //   13657: ldc_w -1377525748
    //   13660: ixor
    //   13661: ixor
    //   13662: tableswitch default -> 13634, -686620107 -> 13684, -686620106 -> 15024
    //   13684: getstatic Perryc.0 : I
    //   13687: ifle -> 13701
    //   13690: ldc2_w -1190767529
    //   13693: l2i
    //   13694: ldc_w -2142430517
    //   13697: ixor
    //   13698: goto -> 13709
    //   13701: ldc2_w 695481381
    //   13704: l2i
    //   13705: ldc_w 1202500468
    //   13708: ixor
    //   13709: ldc2_w 1310185755
    //   13712: l2i
    //   13713: ldc_w -2533876
    //   13716: ixor
    //   13717: ixor
    //   13718: lookupswitch default -> 15183, -2004500085 -> 13701, -552204218 -> 13744
    //   13744: aload_0
    //   13745: getstatic Perryc.c : I
    //   13748: iflt -> 13762
    //   13751: ldc2_w 138368287
    //   13754: l2i
    //   13755: ldc_w 1183725509
    //   13758: ixor
    //   13759: goto -> 13770
    //   13762: ldc2_w -823808065
    //   13765: l2i
    //   13766: ldc_w -998822734
    //   13769: ixor
    //   13770: ldc2_w -727548719
    //   13773: l2i
    //   13774: ldc_w -330877025
    //   13777: ixor
    //   13778: ixor
    //   13779: lookupswitch default -> 13804, -1727036985 -> 13762, 1985227156 -> 15243
    //   13804: getfield taskList : Ljava/util/Queue;
    //   13807: getstatic Perryc.1 : I
    //   13810: ifeq -> 13824
    //   13813: ldc2_w -863305523
    //   13816: l2i
    //   13817: ldc_w -633859082
    //   13820: ixor
    //   13821: goto -> 13832
    //   13824: ldc2_w 1856829409
    //   13827: l2i
    //   13828: ldc_w -1632099957
    //   13831: ixor
    //   13832: ldc2_w 2119536657
    //   13835: l2i
    //   13836: ldc_w -103407899
    //   13839: ixor
    //   13840: ixor
    //   13841: lookupswitch default -> 15091, -1859084849 -> 13824, 2006407326 -> 13868
    //   13868: goto -> 13872
    //   13871: athrow
    //   13872: invokeinterface isEmpty : ()Z
    //   13877: goto -> 13881
    //   13880: athrow
    //   13881: ifne -> 13895
    //   13884: ldc2_w 2125803996
    //   13887: l2i
    //   13888: ldc_w -1082676230
    //   13891: ixor
    //   13892: goto -> 13903
    //   13895: ldc2_w -2119706564
    //   13898: l2i
    //   13899: ldc_w 1080377885
    //   13902: ixor
    //   13903: ldc2_w 1376597503
    //   13906: l2i
    //   13907: ldc_w -1126547654
    //   13910: ixor
    //   13911: ixor
    //   13912: tableswitch default -> 13884, 789942499 -> 13936, 789942500 -> 14829
    //   13936: ldc2_w -1228259703
    //   13939: l2i
    //   13940: ldc_w -1228259703
    //   13943: ixor
    //   13944: getstatic Perryc.1 : I
    //   13947: ifeq -> 13961
    //   13950: ldc2_w -1722426386
    //   13953: l2i
    //   13954: ldc_w 2001324395
    //   13957: ixor
    //   13958: goto -> 13969
    //   13961: ldc2_w -1936670817
    //   13964: l2i
    //   13965: ldc_w 385571093
    //   13968: ixor
    //   13969: ldc2_w 1176520288
    //   13972: l2i
    //   13973: ldc_w 1341665808
    //   13976: ixor
    //   13977: ixor
    //   13978: lookupswitch default -> 15421, -1816947974 -> 14004, -406558987 -> 13961
    //   14004: istore_1
    //   14005: getstatic Perryc.0 : I
    //   14008: ifle -> 14022
    //   14011: ldc2_w 338039288
    //   14014: l2i
    //   14015: ldc_w 300961540
    //   14018: ixor
    //   14019: goto -> 14030
    //   14022: ldc2_w 2045504213
    //   14025: l2i
    //   14026: ldc_w -150595122
    //   14029: ixor
    //   14030: ldc2_w 1849804842
    //   14033: l2i
    //   14034: ldc_w -529026736
    //   14037: ixor
    //   14038: ixor
    //   14039: lookupswitch default -> 15365, -1948244090 -> 14022, 14387809 -> 14064
    //   14064: iload_1
    //   14065: getstatic Perryc.1 : I
    //   14068: ifeq -> 14082
    //   14071: ldc2_w 430009929
    //   14074: l2i
    //   14075: ldc_w 287388104
    //   14078: ixor
    //   14079: goto -> 14090
    //   14082: ldc2_w 735166962
    //   14085: l2i
    //   14086: ldc_w -339823287
    //   14089: ixor
    //   14090: ldc2_w -1100585799
    //   14093: l2i
    //   14094: ldc_w 1516846642
    //   14097: ixor
    //   14098: ixor
    //   14099: lookupswitch default -> 14124, -853287032 -> 14082, -326171382 -> 15289
    //   14124: aload_0
    //   14125: getstatic Perryc.0 : I
    //   14128: ifle -> 14142
    //   14131: ldc2_w 365279987
    //   14134: l2i
    //   14135: ldc_w -1329033847
    //   14138: ixor
    //   14139: goto -> 14150
    //   14142: ldc2_w -138433721
    //   14145: l2i
    //   14146: ldc_w -43626909
    //   14149: ixor
    //   14150: ldc2_w -1385749952
    //   14153: l2i
    //   14154: ldc_w -912791509
    //   14157: ixor
    //   14158: ixor
    //   14159: lookupswitch default -> 14184, -1467732629 -> 14142, -1040319215 -> 15199
    //   14184: getfield actions : Ljava/lang/Integer;
    //   14187: getstatic Perryc.1 : I
    //   14190: ifeq -> 14204
    //   14193: ldc2_w 717725606
    //   14196: l2i
    //   14197: ldc_w -529441594
    //   14200: ixor
    //   14201: goto -> 14212
    //   14204: ldc2_w 2003170342
    //   14207: l2i
    //   14208: ldc_w -1668347293
    //   14211: ixor
    //   14212: ldc2_w -203433144
    //   14215: l2i
    //   14216: ldc_w -129478368
    //   14219: ixor
    //   14220: ixor
    //   14221: lookupswitch default -> 15203, -1054783224 -> 14204, -528649171 -> 14248
    //   14248: goto -> 14252
    //   14251: athrow
    //   14252: invokevirtual intValue : ()I
    //   14255: goto -> 14259
    //   14258: athrow
    //   14259: if_icmpge -> 14273
    //   14262: ldc2_w -550251929
    //   14265: l2i
    //   14266: ldc_w -710998686
    //   14269: ixor
    //   14270: goto -> 14281
    //   14273: ldc2_w -1763656638
    //   14276: l2i
    //   14277: ldc_w -1672713402
    //   14280: ixor
    //   14281: ldc2_w -1394099406
    //   14284: l2i
    //   14285: ldc_w 1451462961
    //   14288: ixor
    //   14289: ixor
    //   14290: tableswitch default -> 14262, -255263482 -> 14312, -255263481 -> 14829
    //   14312: getstatic Perryc.0 : I
    //   14315: ifle -> 14329
    //   14318: ldc2_w 1347946002
    //   14321: l2i
    //   14322: ldc_w 688213201
    //   14325: ixor
    //   14326: goto -> 14337
    //   14329: ldc2_w 2037811906
    //   14332: l2i
    //   14333: ldc_w 1025220119
    //   14336: ixor
    //   14337: ldc2_w -1833806456
    //   14340: l2i
    //   14341: ldc_w 1257122920
    //   14344: ixor
    //   14345: ixor
    //   14346: lookupswitch default -> 14372, -1593756893 -> 15059, 1633639871 -> 14329
    //   14372: aload_0
    //   14373: getstatic Perryc.c : I
    //   14376: iflt -> 14390
    //   14379: ldc2_w -194269200
    //   14382: l2i
    //   14383: ldc_w 862672026
    //   14386: ixor
    //   14387: goto -> 14398
    //   14390: ldc2_w -1217517722
    //   14393: l2i
    //   14394: ldc_w 2085349062
    //   14397: ixor
    //   14398: ldc2_w -1596017798
    //   14401: l2i
    //   14402: ldc_w 1650377980
    //   14405: ixor
    //   14406: ixor
    //   14407: lookupswitch default -> 14432, 92310764 -> 15025, 460074686 -> 14390
    //   14432: getfield taskList : Ljava/util/Queue;
    //   14435: getstatic Perryc.0 : I
    //   14438: ifle -> 14452
    //   14441: ldc2_w -1936880839
    //   14444: l2i
    //   14445: ldc_w -1754463886
    //   14448: ixor
    //   14449: goto -> 14460
    //   14452: ldc2_w 1186048766
    //   14455: l2i
    //   14456: ldc_w -667389947
    //   14459: ixor
    //   14460: ldc2_w 837676084
    //   14463: l2i
    //   14464: ldc_w -1715918885
    //   14467: ixor
    //   14468: ixor
    //   14469: lookupswitch default -> 15293, -1280032348 -> 14452, 920457492 -> 14496
    //   14496: goto -> 14500
    //   14499: athrow
    //   14500: invokeinterface poll : ()Ljava/lang/Object;
    //   14505: goto -> 14509
    //   14508: athrow
    //   14509: checkcast bigname/zprestige/webhack/util/InventoryUtil$Task
    //   14512: getstatic Perryc.c : I
    //   14515: iflt -> 14529
    //   14518: ldc2_w 1603043205
    //   14521: l2i
    //   14522: ldc_w -447773508
    //   14525: ixor
    //   14526: goto -> 14537
    //   14529: ldc2_w -447485302
    //   14532: l2i
    //   14533: ldc_w -861145764
    //   14536: ixor
    //   14537: ldc2_w -289869690
    //   14540: l2i
    //   14541: ldc_w 1852142779
    //   14544: ixor
    //   14545: ixor
    //   14546: lookupswitch default -> 14572, 975077124 -> 15313, 1745303840 -> 14529
    //   14572: astore_2
    //   14573: getstatic Perryc.c : I
    //   14576: iflt -> 14590
    //   14579: ldc2_w -459146343
    //   14582: l2i
    //   14583: ldc_w 1579404266
    //   14586: ixor
    //   14587: goto -> 14598
    //   14590: ldc2_w 899357058
    //   14593: l2i
    //   14594: ldc_w 1103031929
    //   14597: ixor
    //   14598: ldc2_w -678972628
    //   14601: l2i
    //   14602: ldc_w -683686494
    //   14605: ixor
    //   14606: ixor
    //   14607: lookupswitch default -> 15281, -1170585859 -> 14590, 1956479349 -> 14632
    //   14632: aload_2
    //   14633: ifnonnull -> 14647
    //   14636: ldc2_w -1085219947
    //   14639: l2i
    //   14640: ldc_w -1011269429
    //   14643: ixor
    //   14644: goto -> 14655
    //   14647: ldc2_w -1694016674
    //   14650: l2i
    //   14651: ldc_w -403783679
    //   14654: ixor
    //   14655: ldc2_w -1821700252
    //   14658: l2i
    //   14659: ldc_w -1208290242
    //   14662: ixor
    //   14663: ixor
    //   14664: tableswitch default -> 14636, 1484283908 -> 14688, 1484283909 -> 14691
    //   14688: goto -> 14823
    //   14691: getstatic Perryc.0 : I
    //   14694: ifle -> 14708
    //   14697: ldc2_w 711771476
    //   14700: l2i
    //   14701: ldc_w 1093524701
    //   14704: ixor
    //   14705: goto -> 14716
    //   14708: ldc2_w -1557517876
    //   14711: l2i
    //   14712: ldc_w 2138376404
    //   14715: ixor
    //   14716: ldc2_w 110992564
    //   14719: l2i
    //   14720: ldc_w 339141118
    //   14723: ixor
    //   14724: ixor
    //   14725: lookupswitch default -> 14752, -1939438624 -> 14708, 2045404355 -> 15149
    //   14752: aload_2
    //   14753: getstatic Perryc.1 : I
    //   14756: ifeq -> 14770
    //   14759: ldc2_w -1756009790
    //   14762: l2i
    //   14763: ldc_w 1248692760
    //   14766: ixor
    //   14767: goto -> 14778
    //   14770: ldc2_w -437091006
    //   14773: l2i
    //   14774: ldc_w 687455454
    //   14777: ixor
    //   14778: ldc2_w -841168786
    //   14781: l2i
    //   14782: ldc_w -997550877
    //   14785: ixor
    //   14786: ixor
    //   14787: lookupswitch default -> 15341, -1000512239 -> 14812, -730940329 -> 14770
    //   14812: goto -> 14816
    //   14815: athrow
    //   14816: invokevirtual run : ()V
    //   14819: goto -> 14823
    //   14822: athrow
    //   14823: iinc #1, 1
    //   14826: goto -> 14005
    //   14829: getstatic Perryc.0 : I
    //   14832: ifle -> 14846
    //   14835: ldc2_w 1971394121
    //   14838: l2i
    //   14839: ldc_w -946713354
    //   14842: ixor
    //   14843: goto -> 14854
    //   14846: ldc2_w -42218505
    //   14849: l2i
    //   14850: ldc_w 1230823925
    //   14853: ixor
    //   14854: ldc2_w -660863617
    //   14857: l2i
    //   14858: ldc_w -1040696459
    //   14861: ixor
    //   14862: ixor
    //   14863: lookupswitch default -> 15415, -1418238795 -> 14846, -1388112888 -> 14888
    //   14888: aload_0
    //   14889: getstatic Perryc.c : I
    //   14892: iflt -> 14906
    //   14895: ldc2_w -1569862574
    //   14898: l2i
    //   14899: ldc_w -114263136
    //   14902: ixor
    //   14903: goto -> 14914
    //   14906: ldc2_w -1298624332
    //   14909: l2i
    //   14910: ldc_w 404875250
    //   14913: ixor
    //   14914: ldc2_w 615150584
    //   14917: l2i
    //   14918: ldc_w -720781109
    //   14921: ixor
    //   14922: ixor
    //   14923: lookupswitch default -> 15133, -1426193215 -> 14906, 1528480885 -> 14948
    //   14948: getfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   14951: getstatic Perryc.1 : I
    //   14954: ifeq -> 14968
    //   14957: ldc2_w 31440840
    //   14960: l2i
    //   14961: ldc_w 2138343979
    //   14964: ixor
    //   14965: goto -> 14976
    //   14968: ldc2_w 860082422
    //   14971: l2i
    //   14972: ldc_w -712885796
    //   14975: ixor
    //   14976: ldc2_w 2085164551
    //   14979: l2i
    //   14980: ldc_w -2121619820
    //   14983: ixor
    //   14984: ixor
    //   14985: lookupswitch default -> 15231, -2090302096 -> 14968, 453138873 -> 15012
    //   15012: goto -> 15016
    //   15015: athrow
    //   15016: invokevirtual reset : ()Lbigname/zprestige/webhack/util/Timer;
    //   15019: goto -> 15023
    //   15022: athrow
    //   15023: pop
    //   15024: return
    //   15025: aconst_null
    //   15026: athrow
    //   15027: aconst_null
    //   15028: athrow
    //   15029: aconst_null
    //   15030: athrow
    //   15031: aconst_null
    //   15032: athrow
    //   15033: aconst_null
    //   15034: athrow
    //   15035: aconst_null
    //   15036: athrow
    //   15037: aconst_null
    //   15038: athrow
    //   15039: aconst_null
    //   15040: athrow
    //   15041: aconst_null
    //   15042: athrow
    //   15043: aconst_null
    //   15044: athrow
    //   15045: aconst_null
    //   15046: athrow
    //   15047: aconst_null
    //   15048: athrow
    //   15049: aconst_null
    //   15050: athrow
    //   15051: aconst_null
    //   15052: athrow
    //   15053: aconst_null
    //   15054: athrow
    //   15055: aconst_null
    //   15056: athrow
    //   15057: aconst_null
    //   15058: athrow
    //   15059: aconst_null
    //   15060: athrow
    //   15061: aconst_null
    //   15062: athrow
    //   15063: aconst_null
    //   15064: athrow
    //   15065: aconst_null
    //   15066: athrow
    //   15067: aconst_null
    //   15068: athrow
    //   15069: aconst_null
    //   15070: athrow
    //   15071: aconst_null
    //   15072: athrow
    //   15073: aconst_null
    //   15074: athrow
    //   15075: aconst_null
    //   15076: athrow
    //   15077: aconst_null
    //   15078: athrow
    //   15079: aconst_null
    //   15080: athrow
    //   15081: aconst_null
    //   15082: athrow
    //   15083: aconst_null
    //   15084: athrow
    //   15085: aconst_null
    //   15086: athrow
    //   15087: aconst_null
    //   15088: athrow
    //   15089: aconst_null
    //   15090: athrow
    //   15091: aconst_null
    //   15092: athrow
    //   15093: aconst_null
    //   15094: athrow
    //   15095: aconst_null
    //   15096: athrow
    //   15097: aconst_null
    //   15098: athrow
    //   15099: aconst_null
    //   15100: athrow
    //   15101: aconst_null
    //   15102: athrow
    //   15103: aconst_null
    //   15104: athrow
    //   15105: aconst_null
    //   15106: athrow
    //   15107: aconst_null
    //   15108: athrow
    //   15109: aconst_null
    //   15110: athrow
    //   15111: aconst_null
    //   15112: athrow
    //   15113: aconst_null
    //   15114: athrow
    //   15115: aconst_null
    //   15116: athrow
    //   15117: aconst_null
    //   15118: athrow
    //   15119: aconst_null
    //   15120: athrow
    //   15121: aconst_null
    //   15122: athrow
    //   15123: aconst_null
    //   15124: athrow
    //   15125: aconst_null
    //   15126: athrow
    //   15127: aconst_null
    //   15128: athrow
    //   15129: aconst_null
    //   15130: athrow
    //   15131: aconst_null
    //   15132: athrow
    //   15133: aconst_null
    //   15134: athrow
    //   15135: aconst_null
    //   15136: athrow
    //   15137: aconst_null
    //   15138: athrow
    //   15139: aconst_null
    //   15140: athrow
    //   15141: aconst_null
    //   15142: athrow
    //   15143: aconst_null
    //   15144: athrow
    //   15145: aconst_null
    //   15146: athrow
    //   15147: aconst_null
    //   15148: athrow
    //   15149: aconst_null
    //   15150: athrow
    //   15151: aconst_null
    //   15152: athrow
    //   15153: aconst_null
    //   15154: athrow
    //   15155: aconst_null
    //   15156: athrow
    //   15157: aconst_null
    //   15158: athrow
    //   15159: aconst_null
    //   15160: athrow
    //   15161: aconst_null
    //   15162: athrow
    //   15163: aconst_null
    //   15164: athrow
    //   15165: aconst_null
    //   15166: athrow
    //   15167: aconst_null
    //   15168: athrow
    //   15169: aconst_null
    //   15170: athrow
    //   15171: aconst_null
    //   15172: athrow
    //   15173: aconst_null
    //   15174: athrow
    //   15175: aconst_null
    //   15176: athrow
    //   15177: aconst_null
    //   15178: athrow
    //   15179: aconst_null
    //   15180: athrow
    //   15181: aconst_null
    //   15182: athrow
    //   15183: aconst_null
    //   15184: athrow
    //   15185: aconst_null
    //   15186: athrow
    //   15187: aconst_null
    //   15188: athrow
    //   15189: aconst_null
    //   15190: athrow
    //   15191: aconst_null
    //   15192: athrow
    //   15193: aconst_null
    //   15194: athrow
    //   15195: aconst_null
    //   15196: athrow
    //   15197: aconst_null
    //   15198: athrow
    //   15199: aconst_null
    //   15200: athrow
    //   15201: aconst_null
    //   15202: athrow
    //   15203: aconst_null
    //   15204: athrow
    //   15205: aconst_null
    //   15206: athrow
    //   15207: aconst_null
    //   15208: athrow
    //   15209: aconst_null
    //   15210: athrow
    //   15211: aconst_null
    //   15212: athrow
    //   15213: aconst_null
    //   15214: athrow
    //   15215: aconst_null
    //   15216: athrow
    //   15217: aconst_null
    //   15218: athrow
    //   15219: aconst_null
    //   15220: athrow
    //   15221: aconst_null
    //   15222: athrow
    //   15223: aconst_null
    //   15224: athrow
    //   15225: aconst_null
    //   15226: athrow
    //   15227: aconst_null
    //   15228: athrow
    //   15229: aconst_null
    //   15230: athrow
    //   15231: aconst_null
    //   15232: athrow
    //   15233: aconst_null
    //   15234: athrow
    //   15235: aconst_null
    //   15236: athrow
    //   15237: aconst_null
    //   15238: athrow
    //   15239: aconst_null
    //   15240: athrow
    //   15241: aconst_null
    //   15242: athrow
    //   15243: aconst_null
    //   15244: athrow
    //   15245: aconst_null
    //   15246: athrow
    //   15247: aconst_null
    //   15248: athrow
    //   15249: aconst_null
    //   15250: athrow
    //   15251: aconst_null
    //   15252: athrow
    //   15253: aconst_null
    //   15254: athrow
    //   15255: aconst_null
    //   15256: athrow
    //   15257: aconst_null
    //   15258: athrow
    //   15259: aconst_null
    //   15260: athrow
    //   15261: aconst_null
    //   15262: athrow
    //   15263: aconst_null
    //   15264: athrow
    //   15265: aconst_null
    //   15266: athrow
    //   15267: aconst_null
    //   15268: athrow
    //   15269: aconst_null
    //   15270: athrow
    //   15271: aconst_null
    //   15272: athrow
    //   15273: aconst_null
    //   15274: athrow
    //   15275: aconst_null
    //   15276: athrow
    //   15277: aconst_null
    //   15278: athrow
    //   15279: aconst_null
    //   15280: athrow
    //   15281: aconst_null
    //   15282: athrow
    //   15283: aconst_null
    //   15284: athrow
    //   15285: aconst_null
    //   15286: athrow
    //   15287: aconst_null
    //   15288: athrow
    //   15289: aconst_null
    //   15290: athrow
    //   15291: aconst_null
    //   15292: athrow
    //   15293: aconst_null
    //   15294: athrow
    //   15295: aconst_null
    //   15296: athrow
    //   15297: aconst_null
    //   15298: athrow
    //   15299: aconst_null
    //   15300: athrow
    //   15301: aconst_null
    //   15302: athrow
    //   15303: aconst_null
    //   15304: athrow
    //   15305: aconst_null
    //   15306: athrow
    //   15307: aconst_null
    //   15308: athrow
    //   15309: aconst_null
    //   15310: athrow
    //   15311: aconst_null
    //   15312: athrow
    //   15313: aconst_null
    //   15314: athrow
    //   15315: aconst_null
    //   15316: athrow
    //   15317: aconst_null
    //   15318: athrow
    //   15319: aconst_null
    //   15320: athrow
    //   15321: aconst_null
    //   15322: athrow
    //   15323: aconst_null
    //   15324: athrow
    //   15325: aconst_null
    //   15326: athrow
    //   15327: aconst_null
    //   15328: athrow
    //   15329: aconst_null
    //   15330: athrow
    //   15331: aconst_null
    //   15332: athrow
    //   15333: aconst_null
    //   15334: athrow
    //   15335: aconst_null
    //   15336: athrow
    //   15337: aconst_null
    //   15338: athrow
    //   15339: aconst_null
    //   15340: athrow
    //   15341: aconst_null
    //   15342: athrow
    //   15343: aconst_null
    //   15344: athrow
    //   15345: aconst_null
    //   15346: athrow
    //   15347: aconst_null
    //   15348: athrow
    //   15349: aconst_null
    //   15350: athrow
    //   15351: aconst_null
    //   15352: athrow
    //   15353: aconst_null
    //   15354: athrow
    //   15355: aconst_null
    //   15356: athrow
    //   15357: aconst_null
    //   15358: athrow
    //   15359: aconst_null
    //   15360: athrow
    //   15361: aconst_null
    //   15362: athrow
    //   15363: aconst_null
    //   15364: athrow
    //   15365: aconst_null
    //   15366: athrow
    //   15367: aconst_null
    //   15368: athrow
    //   15369: aconst_null
    //   15370: athrow
    //   15371: aconst_null
    //   15372: athrow
    //   15373: aconst_null
    //   15374: athrow
    //   15375: aconst_null
    //   15376: athrow
    //   15377: aconst_null
    //   15378: athrow
    //   15379: aconst_null
    //   15380: athrow
    //   15381: aconst_null
    //   15382: athrow
    //   15383: aconst_null
    //   15384: athrow
    //   15385: aconst_null
    //   15386: athrow
    //   15387: aconst_null
    //   15388: athrow
    //   15389: aconst_null
    //   15390: athrow
    //   15391: aconst_null
    //   15392: athrow
    //   15393: aconst_null
    //   15394: athrow
    //   15395: aconst_null
    //   15396: athrow
    //   15397: aconst_null
    //   15398: athrow
    //   15399: aconst_null
    //   15400: athrow
    //   15401: aconst_null
    //   15402: athrow
    //   15403: aconst_null
    //   15404: athrow
    //   15405: aconst_null
    //   15406: athrow
    //   15407: aconst_null
    //   15408: athrow
    //   15409: aconst_null
    //   15410: athrow
    //   15411: aconst_null
    //   15412: athrow
    //   15413: aconst_null
    //   15414: athrow
    //   15415: aconst_null
    //   15416: athrow
    //   15417: aconst_null
    //   15418: athrow
    //   15419: aconst_null
    //   15420: athrow
    //   15421: aconst_null
    //   15422: athrow
    //   15423: aconst_null
    //   15424: athrow
    //   15425: aconst_null
    //   15426: athrow
    //   15427: pop
    //   15428: goto -> 24
    //   15431: pop
    //   15432: aconst_null
    //   15433: goto -> 15427
    //   15436: dup
    //   15437: ifnull -> 15427
    //   15440: checkcast java/lang/Throwable
    //   15443: athrow
    //   15444: dup
    //   15445: ifnull -> 15431
    //   15448: checkcast java/lang/Throwable
    //   15451: athrow
    //   15452: aconst_null
    //   15453: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   3638	1148	13	stack	Lnet/minecraft/item/ItemStack;
    //   3990	796	14	percent	F
    //   3434	1352	12	armorSlot	Ljava/util/Map$Entry;
    //   4726	63	8	goods	I
    //   4326	463	9	dam	I
    //   6894	193	12	goods2	I
    //   6158	929	13	percent	F
    //   6494	593	14	dam2	I
    //   8762	193	13	goods3	I
    //   8026	929	14	percent	F
    //   8362	593	15	dam3	I
    //   9894	929	14	percent	F
    //   10630	193	8	goods	I
    //   10230	593	9	dam	I
    //   12498	193	15	goods4	I
    //   11762	929	16	percent	F
    //   12098	593	17	dam4	I
    //   5626	7065	11	itemStack1	Lnet/minecraft/item/ItemStack;
    //   7494	5197	12	itemStack2	Lnet/minecraft/item/ItemStack;
    //   9362	3329	13	itemStack3	Lnet/minecraft/item/ItemStack;
    //   11230	1461	14	itemStack4	Lnet/minecraft/item/ItemStack;
    //   2042	11111	10	takeOff	I
    //   14573	250	2	task	Lbigname/zprestige/webhack/util/InventoryUtil$Task;
    //   14005	824	1	i	I
    //   24	15001	0	this	Lbigname/zprestige/webhack/features/modules/Player/ArmourMend;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   3434	1352	12	armorSlot	Ljava/util/Map$Entry<Ljava/lang/Integer;Lnet/minecraft/item/ItemStack;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	15436	java/lang/AssertionError
    //   84	90	90	finally
    //   84	90	90	finally
    //   84	90	90	java/lang/AssertionError
    //   84	90	3	finally
    //   84	90	3	java/lang/NegativeArraySizeException
    //   667	676	676	finally
    //   667	676	667	java/lang/ArithmeticException
    //   667	676	676	java/lang/ArithmeticException
    //   667	676	3	java/lang/UnsupportedOperationException
    //   668	676	676	java/lang/IllegalArgumentException
    //   959	966	966	finally
    //   959	966	966	finally
    //   960	966	959	java/lang/ArrayIndexOutOfBoundsException
    //   960	966	966	finally
    //   960	966	966	java/lang/NumberFormatException
    //   1275	1282	1282	finally
    //   1275	1282	3	java/lang/IllegalArgumentException
    //   1275	1282	1282	java/lang/AssertionError
    //   1275	1282	3	finally
    //   1276	1282	1275	java/lang/NumberFormatException
    //   1591	1600	1600	finally
    //   1592	1600	1591	finally
    //   1592	1600	3	java/lang/IndexOutOfBoundsException
    //   1592	1600	3	finally
    //   1592	1600	1600	finally
    //   1731	1740	1740	finally
    //   1731	1740	3	finally
    //   1731	1740	1731	java/lang/EnumConstantNotPresentException
    //   1732	1740	3	java/lang/UnsupportedOperationException
    //   1732	1740	1740	finally
    //   2107	2114	2114	finally
    //   2107	2114	2114	finally
    //   2107	2114	2107	finally
    //   2107	2114	3	finally
    //   2107	2114	3	finally
    //   2179	2186	2186	finally
    //   2179	2186	2186	java/lang/RuntimeException
    //   2179	2186	2179	java/lang/ArithmeticException
    //   2180	2186	2179	java/util/ConcurrentModificationException
    //   2180	2186	2179	java/lang/EnumConstantNotPresentException
    //   2487	2494	2494	finally
    //   2487	2494	3	java/lang/ClassCastException
    //   2487	2494	3	java/lang/RuntimeException
    //   2487	2494	2487	finally
    //   2488	2494	2487	java/lang/ClassCastException
    //   2560	2566	2566	finally
    //   2560	2566	2566	java/util/NoSuchElementException
    //   2560	2566	3	finally
    //   2560	2566	2566	finally
    //   2560	2566	2566	finally
    //   2823	2830	2830	finally
    //   2823	2830	2823	java/util/NoSuchElementException
    //   2823	2830	2823	finally
    //   2823	2830	2830	java/lang/StringIndexOutOfBoundsException
    //   2824	2830	2830	finally
    //   2895	2904	2904	finally
    //   2895	2904	2895	finally
    //   2895	2904	3	java/lang/EnumConstantNotPresentException
    //   2895	2904	3	java/lang/ArrayIndexOutOfBoundsException
    //   2896	2904	2895	finally
    //   2967	2976	2976	finally
    //   2967	2976	2967	finally
    //   2967	2976	2976	finally
    //   2968	2976	3	java/lang/IllegalArgumentException
    //   2968	2976	3	finally
    //   3167	3176	3176	finally
    //   3167	3176	3	finally
    //   3167	3176	3167	finally
    //   3168	3176	3176	finally
    //   3168	3176	3176	java/lang/NumberFormatException
    //   3359	3368	3368	finally
    //   3359	3368	3	java/lang/AssertionError
    //   3360	3368	3	finally
    //   3360	3368	3359	java/lang/AssertionError
    //   3360	3368	3368	java/util/ConcurrentModificationException
    //   3563	3572	3572	finally
    //   3563	3572	3	finally
    //   3563	3572	3	finally
    //   3564	3572	3563	java/lang/EnumConstantNotPresentException
    //   3564	3572	3	java/lang/ArrayIndexOutOfBoundsException
    //   3827	3834	3834	finally
    //   3827	3834	3834	java/util/ConcurrentModificationException
    //   3827	3834	3827	java/lang/IllegalStateException
    //   3827	3834	3834	java/lang/IndexOutOfBoundsException
    //   3827	3834	3834	java/lang/IndexOutOfBoundsException
    //   3903	3910	3910	finally
    //   3903	3910	3903	finally
    //   3903	3910	3910	java/lang/RuntimeException
    //   3904	3910	3903	java/lang/UnsupportedOperationException
    //   3904	3910	3903	finally
    //   4119	4126	4126	finally
    //   4119	4126	3	finally
    //   4120	4126	4126	finally
    //   4120	4126	4119	java/util/ConcurrentModificationException
    //   4120	4126	3	java/util/ConcurrentModificationException
    //   4255	4262	4262	finally
    //   4255	4262	4255	java/lang/NegativeArraySizeException
    //   4255	4262	4255	finally
    //   4255	4262	3	finally
    //   4256	4262	4262	finally
    //   4520	4526	4526	finally
    //   4520	4526	3	java/util/NoSuchElementException
    //   4520	4526	4526	finally
    //   4520	4526	3	java/util/ConcurrentModificationException
    //   4520	4526	3	finally
    //   4656	4662	4662	finally
    //   4656	4662	3	java/lang/NumberFormatException
    //   4656	4662	3	java/lang/StringIndexOutOfBoundsException
    //   4656	4662	4662	finally
    //   4656	4662	3	finally
    //   5483	5490	5490	finally
    //   5483	5490	5490	java/lang/ArithmeticException
    //   5483	5490	5483	finally
    //   5484	5490	3	finally
    //   5484	5490	3	java/lang/IndexOutOfBoundsException
    //   5556	5562	5562	finally
    //   5556	5562	3	java/util/ConcurrentModificationException
    //   5556	5562	5562	finally
    //   5556	5562	5562	java/util/NoSuchElementException
    //   5556	5562	3	java/lang/NumberFormatException
    //   5995	6002	6002	finally
    //   5995	6002	5995	finally
    //   5996	6002	6002	finally
    //   5996	6002	6002	java/lang/ArrayIndexOutOfBoundsException
    //   5996	6002	5995	java/lang/NumberFormatException
    //   6071	6078	6078	finally
    //   6071	6078	6078	java/util/NoSuchElementException
    //   6072	6078	6071	finally
    //   6072	6078	3	java/lang/AssertionError
    //   6072	6078	6078	finally
    //   6288	6294	6294	finally
    //   6288	6294	3	finally
    //   6288	6294	6294	finally
    //   6288	6294	3	finally
    //   6288	6294	6294	java/lang/NegativeArraySizeException
    //   6423	6430	6430	finally
    //   6423	6430	6423	finally
    //   6423	6430	6430	finally
    //   6424	6430	6430	finally
    //   6424	6430	3	finally
    //   6688	6694	6694	finally
    //   6688	6694	3	java/lang/AssertionError
    //   6688	6694	6694	finally
    //   6688	6694	3	java/lang/ArrayIndexOutOfBoundsException
    //   6688	6694	6694	java/lang/ArrayIndexOutOfBoundsException
    //   6823	6830	6830	finally
    //   6823	6830	6830	finally
    //   6823	6830	6823	java/util/NoSuchElementException
    //   6823	6830	3	finally
    //   6824	6830	6823	java/lang/NegativeArraySizeException
    //   7079	7086	7086	finally
    //   7079	7086	3	finally
    //   7079	7086	7086	java/lang/StringIndexOutOfBoundsException
    //   7080	7086	7079	finally
    //   7080	7086	7079	java/lang/NegativeArraySizeException
    //   7351	7358	7358	finally
    //   7351	7358	7351	finally
    //   7352	7358	7351	finally
    //   7352	7358	3	java/lang/ArrayIndexOutOfBoundsException
    //   7352	7358	7351	finally
    //   7423	7430	7430	finally
    //   7423	7430	7423	finally
    //   7423	7430	7423	finally
    //   7423	7430	7423	java/lang/EnumConstantNotPresentException
    //   7424	7430	7423	java/lang/ArrayIndexOutOfBoundsException
    //   7863	7870	7870	finally
    //   7863	7870	3	finally
    //   7863	7870	7870	java/util/NoSuchElementException
    //   7863	7870	7863	finally
    //   7864	7870	7863	java/lang/EnumConstantNotPresentException
    //   7939	7946	7946	finally
    //   7939	7946	7939	java/lang/NullPointerException
    //   7940	7946	7946	finally
    //   7940	7946	7946	java/lang/NumberFormatException
    //   7940	7946	7939	java/lang/NumberFormatException
    //   8155	8162	8162	finally
    //   8155	8162	8155	java/lang/IllegalStateException
    //   8155	8162	8155	finally
    //   8156	8162	8155	java/util/NoSuchElementException
    //   8156	8162	8162	finally
    //   8291	8298	8298	finally
    //   8291	8298	8291	finally
    //   8291	8298	8298	finally
    //   8292	8298	8291	java/lang/ArrayIndexOutOfBoundsException
    //   8292	8298	8291	java/lang/IndexOutOfBoundsException
    //   8555	8562	8562	finally
    //   8555	8562	8555	finally
    //   8556	8562	8555	java/lang/RuntimeException
    //   8556	8562	8562	java/lang/StringIndexOutOfBoundsException
    //   8556	8562	8555	finally
    //   8691	8698	8698	finally
    //   8691	8698	8691	finally
    //   8691	8698	8691	finally
    //   8691	8698	8698	finally
    //   8692	8698	8698	finally
    //   8947	8954	8954	finally
    //   8947	8954	8947	finally
    //   8947	8954	8954	java/lang/IllegalStateException
    //   8947	8954	8954	finally
    //   8948	8954	8947	finally
    //   9220	9226	9226	finally
    //   9220	9226	3	finally
    //   9220	9226	9226	finally
    //   9220	9226	9226	finally
    //   9220	9226	9226	finally
    //   9291	9298	9298	finally
    //   9291	9298	9298	finally
    //   9291	9298	3	finally
    //   9292	9298	9298	java/lang/IllegalArgumentException
    //   9292	9298	9291	java/lang/NegativeArraySizeException
    //   9731	9738	9738	finally
    //   9731	9738	9738	java/lang/AssertionError
    //   9731	9738	3	java/lang/ArrayIndexOutOfBoundsException
    //   9731	9738	3	finally
    //   9731	9738	9731	java/lang/NegativeArraySizeException
    //   9807	9814	9814	finally
    //   9807	9814	3	finally
    //   9807	9814	9807	finally
    //   9807	9814	9814	finally
    //   9808	9814	9814	finally
    //   10023	10030	10030	finally
    //   10023	10030	10023	finally
    //   10023	10030	10023	java/lang/AssertionError
    //   10024	10030	10030	java/lang/AssertionError
    //   10024	10030	10030	java/lang/RuntimeException
    //   10159	10166	10166	finally
    //   10159	10166	10166	java/lang/UnsupportedOperationException
    //   10159	10166	10159	finally
    //   10160	10166	10159	finally
    //   10160	10166	10159	java/lang/IndexOutOfBoundsException
    //   10423	10430	10430	finally
    //   10423	10430	10423	java/lang/ArithmeticException
    //   10423	10430	3	finally
    //   10424	10430	10430	java/lang/AssertionError
    //   10424	10430	10430	finally
    //   10559	10566	10566	finally
    //   10559	10566	10566	finally
    //   10559	10566	3	finally
    //   10559	10566	10559	finally
    //   10560	10566	3	finally
    //   10815	10822	10822	finally
    //   10816	10822	10822	finally
    //   10816	10822	10815	java/lang/UnsupportedOperationException
    //   10816	10822	3	finally
    //   10816	10822	3	finally
    //   11088	11094	11094	finally
    //   11088	11094	3	java/lang/AssertionError
    //   11088	11094	11094	finally
    //   11088	11094	3	java/lang/IllegalArgumentException
    //   11088	11094	11094	finally
    //   11160	11166	11166	finally
    //   11160	11166	3	java/util/NoSuchElementException
    //   11160	11166	3	java/lang/StringIndexOutOfBoundsException
    //   11160	11166	3	finally
    //   11160	11166	3	java/lang/UnsupportedOperationException
    //   11600	11606	11606	finally
    //   11600	11606	3	finally
    //   11600	11606	11606	java/lang/NegativeArraySizeException
    //   11600	11606	3	java/lang/AssertionError
    //   11600	11606	3	finally
    //   11675	11682	11682	finally
    //   11675	11682	11675	finally
    //   11675	11682	11682	java/lang/IllegalArgumentException
    //   11675	11682	11682	java/util/ConcurrentModificationException
    //   11676	11682	11675	finally
    //   11891	11898	11898	finally
    //   11891	11898	3	java/lang/RuntimeException
    //   11892	11898	3	java/lang/IllegalArgumentException
    //   11892	11898	11898	finally
    //   11892	11898	11891	java/lang/NumberFormatException
    //   12027	12034	12034	finally
    //   12027	12034	12027	java/util/ConcurrentModificationException
    //   12028	12034	3	java/lang/NullPointerException
    //   12028	12034	12034	java/lang/IllegalArgumentException
    //   12028	12034	3	finally
    //   12291	12298	12298	finally
    //   12291	12298	3	finally
    //   12291	12298	12298	java/lang/NegativeArraySizeException
    //   12291	12298	12298	finally
    //   12292	12298	12291	java/lang/AssertionError
    //   12428	12434	12434	finally
    //   12428	12434	3	finally
    //   12428	12434	12434	finally
    //   12428	12434	3	java/lang/NullPointerException
    //   12428	12434	3	java/lang/ArrayIndexOutOfBoundsException
    //   12683	12690	12690	finally
    //   12683	12690	12690	java/lang/ArrayIndexOutOfBoundsException
    //   12684	12690	12683	finally
    //   12684	12690	12683	finally
    //   12684	12690	12690	java/lang/IndexOutOfBoundsException
    //   12940	12946	12946	finally
    //   12940	12946	3	finally
    //   12940	12946	12946	java/lang/RuntimeException
    //   12940	12946	12946	java/lang/EnumConstantNotPresentException
    //   12940	12946	12946	java/lang/ArrayIndexOutOfBoundsException
    //   13011	13018	13018	finally
    //   13011	13018	13018	finally
    //   13011	13018	13018	finally
    //   13012	13018	13011	java/lang/IndexOutOfBoundsException
    //   13012	13018	13018	finally
    //   13547	13554	13554	finally
    //   13547	13554	3	finally
    //   13547	13554	13547	java/lang/NegativeArraySizeException
    //   13547	13554	13547	finally
    //   13548	13554	13547	finally
    //   13623	13630	13630	finally
    //   13623	13630	13623	java/lang/IndexOutOfBoundsException
    //   13623	13630	13630	finally
    //   13624	13630	13623	java/lang/AssertionError
    //   13624	13630	13623	finally
    //   13871	13880	13880	finally
    //   13871	13880	3	java/lang/IllegalStateException
    //   13871	13880	3	finally
    //   13872	13880	13880	java/lang/AssertionError
    //   13872	13880	13871	java/lang/AssertionError
    //   14252	14258	14258	finally
    //   14252	14258	3	finally
    //   14252	14258	3	finally
    //   14252	14258	3	java/lang/NullPointerException
    //   14252	14258	3	java/lang/AssertionError
    //   14499	14508	14508	finally
    //   14499	14508	14499	java/lang/UnsupportedOperationException
    //   14500	14508	14499	java/lang/RuntimeException
    //   14500	14508	14508	finally
    //   14500	14508	3	finally
    //   14815	14822	14822	finally
    //   14815	14822	14815	finally
    //   14815	14822	3	finally
    //   14816	14822	14822	java/util/NoSuchElementException
    //   14816	14822	14822	java/lang/RuntimeException
    //   15015	15022	15022	finally
    //   15016	15022	15015	finally
    //   15016	15022	15022	finally
    //   15016	15022	3	java/lang/AssertionError
    //   15016	15022	3	java/lang/EnumConstantNotPresentException
    //   15436	15444	15436	java/lang/ArithmeticException
    //   15452	15454	3	finally
  }
  
  public Map getArmor() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 201
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 193
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 185
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 2099279662
    //   33: l2i
    //   34: ldc_w -2089549725
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1527094220
    //   44: l2i
    //   45: ldc_w -1791404251
    //   48: ixor
    //   49: ldc2_w -1733979536
    //   52: l2i
    //   53: ldc_w -2133719351
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 174, -433855500 -> 41, 699705256 -> 84
    //   84: aload_0
    //   85: ldc2_w -1642699542
    //   88: l2i
    //   89: ldc_w -1642699537
    //   92: ixor
    //   93: ldc2_w -760610898
    //   96: l2i
    //   97: ldc_w -760610906
    //   100: ixor
    //   101: getstatic Perryc.1 : I
    //   104: ifeq -> 118
    //   107: ldc2_w 1696611710
    //   110: l2i
    //   111: ldc_w -1310491464
    //   114: ixor
    //   115: goto -> 126
    //   118: ldc2_w -703266649
    //   121: l2i
    //   122: ldc_w 2137077121
    //   125: ixor
    //   126: ldc2_w 1528911324
    //   129: l2i
    //   130: ldc_w 353487843
    //   133: ixor
    //   134: ixor
    //   135: lookupswitch default -> 160, -1894071229 -> 118, -1695293447 -> 172
    //   160: goto -> 164
    //   163: athrow
    //   164: invokespecial getInventorySlots : (II)Ljava/util/Map;
    //   167: goto -> 171
    //   170: athrow
    //   171: areturn
    //   172: aconst_null
    //   173: athrow
    //   174: aconst_null
    //   175: athrow
    //   176: pop
    //   177: goto -> 24
    //   180: pop
    //   181: aconst_null
    //   182: goto -> 176
    //   185: dup
    //   186: ifnull -> 176
    //   189: checkcast java/lang/Throwable
    //   192: athrow
    //   193: dup
    //   194: ifnull -> 180
    //   197: checkcast java/lang/Throwable
    //   200: athrow
    //   201: aconst_null
    //   202: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	148	0	this	Lbigname/zprestige/webhack/features/modules/Player/ArmourMend;
    // Exception table:
    //   from	to	target	type
    //   8	20	185	finally
    //   163	170	170	finally
    //   163	170	3	finally
    //   163	170	163	finally
    //   164	170	3	java/lang/AssertionError
    //   164	170	163	finally
    //   185	193	185	finally
    //   201	203	3	finally
  }
  
  public boolean lambda$onTick$0(EntityPlayer paramEntityPlayer) {
    return Perry1.08(this, (int)-2070194237L ^ 0x9F98C613, paramEntityPlayer);
  }
  
  public void onDisable() {
    Perry1.3r(this, (int)1595943876L ^ 0x7219AEDF);
  }
  
  public void takeOffSlot(int slot) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3040
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 3032
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3024
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 1898447778
    //   33: l2i
    //   34: ldc_w -2044227857
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 6582698
    //   44: l2i
    //   45: ldc_w -1773102214
    //   48: ixor
    //   49: ldc2_w -1533813145
    //   52: l2i
    //   53: ldc_w 1472735896
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 2999, 72645042 -> 41, 1701781039 -> 84
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w 20011928
    //   94: l2i
    //   95: ldc_w 1005905804
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w 382173245
    //   105: l2i
    //   106: ldc_w -723735449
    //   109: ixor
    //   110: ldc2_w -1982927919
    //   113: l2i
    //   114: ldc_w -564321562
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 2949, -1786190483 -> 144, 1834382627 -> 102
    //   144: getfield taskList : Ljava/util/Queue;
    //   147: getstatic Perryc.c : I
    //   150: iflt -> 164
    //   153: ldc2_w 645689679
    //   156: l2i
    //   157: ldc_w -1109012783
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w 932558591
    //   167: l2i
    //   168: ldc_w 308986227
    //   171: ixor
    //   172: ldc2_w -10445810
    //   175: l2i
    //   176: ldc_w -1033315507
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 2943, -1500383011 -> 164, 418853071 -> 208
    //   208: goto -> 212
    //   211: athrow
    //   212: invokeinterface isEmpty : ()Z
    //   217: goto -> 221
    //   220: athrow
    //   221: ifeq -> 235
    //   224: ldc2_w 177888348
    //   227: l2i
    //   228: ldc_w 1280244645
    //   231: ixor
    //   232: goto -> 243
    //   235: ldc2_w -300863312
    //   238: l2i
    //   239: ldc_w -1463445690
    //   242: ixor
    //   243: ldc2_w -1581677877
    //   246: l2i
    //   247: ldc_w -1735195563
    //   250: ixor
    //   251: ixor
    //   252: tableswitch default -> 224, 2147361127 -> 276, 2147361128 -> 2934
    //   276: ldc2_w -1786596201
    //   279: l2i
    //   280: ldc_w 1786596200
    //   283: ixor
    //   284: getstatic Perryc.1 : I
    //   287: ifeq -> 301
    //   290: ldc2_w -437623719
    //   293: l2i
    //   294: ldc_w -387207842
    //   297: ixor
    //   298: goto -> 309
    //   301: ldc2_w 136242421
    //   304: l2i
    //   305: ldc_w 1392686090
    //   308: ixor
    //   309: ldc2_w 1586282942
    //   312: l2i
    //   313: ldc_w 1567994070
    //   316: ixor
    //   317: ixor
    //   318: lookupswitch default -> 2957, 251181167 -> 301, 1491411351 -> 344
    //   344: istore_2
    //   345: ldc2_w 1376250020
    //   348: l2i
    //   349: ldc_w 1376250021
    //   352: ixor
    //   353: getstatic Perryc.c : I
    //   356: iflt -> 370
    //   359: ldc2_w -578164695
    //   362: l2i
    //   363: ldc_w -1745601047
    //   366: ixor
    //   367: goto -> 378
    //   370: ldc2_w -1563816418
    //   373: l2i
    //   374: ldc_w -106465039
    //   377: ixor
    //   378: ldc2_w 592327642
    //   381: l2i
    //   382: ldc_w 2110548597
    //   385: ixor
    //   386: ixor
    //   387: lookupswitch default -> 2997, 99561280 -> 412, 352291951 -> 370
    //   412: goto -> 416
    //   415: athrow
    //   416: invokestatic findEmptySlots : (Z)Ljava/util/List;
    //   419: goto -> 423
    //   422: athrow
    //   423: getstatic Perryc.1 : I
    //   426: ifeq -> 440
    //   429: ldc2_w -411138240
    //   432: l2i
    //   433: ldc_w 758947814
    //   436: ixor
    //   437: goto -> 448
    //   440: ldc2_w -1511238463
    //   443: l2i
    //   444: ldc_w 1874855736
    //   447: ixor
    //   448: ldc2_w 1871725098
    //   451: l2i
    //   452: ldc_w -1068440408
    //   455: ixor
    //   456: ixor
    //   457: lookupswitch default -> 2975, 1703067172 -> 440, 1710028155 -> 484
    //   484: goto -> 488
    //   487: athrow
    //   488: invokeinterface iterator : ()Ljava/util/Iterator;
    //   493: goto -> 497
    //   496: athrow
    //   497: getstatic Perryc.0 : I
    //   500: ifle -> 514
    //   503: ldc2_w -1309558416
    //   506: l2i
    //   507: ldc_w -1085256150
    //   510: ixor
    //   511: goto -> 522
    //   514: ldc2_w -1122300793
    //   517: l2i
    //   518: ldc_w 1325790899
    //   521: ixor
    //   522: ldc2_w -900526965
    //   525: l2i
    //   526: ldc_w 1068843791
    //   529: ixor
    //   530: ixor
    //   531: lookupswitch default -> 2993, -79185698 -> 514, 133739952 -> 556
    //   556: astore_3
    //   557: getstatic Perryc.0 : I
    //   560: ifle -> 574
    //   563: ldc2_w 647520823
    //   566: l2i
    //   567: ldc_w 2134459448
    //   570: ixor
    //   571: goto -> 582
    //   574: ldc2_w -472490547
    //   577: l2i
    //   578: ldc_w 413937953
    //   581: ixor
    //   582: ldc2_w -682285570
    //   585: l2i
    //   586: ldc_w 1846076623
    //   589: ixor
    //   590: ixor
    //   591: lookupswitch default -> 616, -2136667161 -> 574, -520296642 -> 3013
    //   616: aload_3
    //   617: getstatic Perryc.c : I
    //   620: iflt -> 634
    //   623: ldc2_w 122744674
    //   626: l2i
    //   627: ldc_w -1285299250
    //   630: ixor
    //   631: goto -> 642
    //   634: ldc2_w 2013408532
    //   637: l2i
    //   638: ldc_w -1856107199
    //   641: ixor
    //   642: ldc2_w 1662234573
    //   645: l2i
    //   646: ldc_w 1691975203
    //   649: ixor
    //   650: ixor
    //   651: lookupswitch default -> 676, -1275470526 -> 3001, 2105281749 -> 634
    //   676: goto -> 680
    //   679: athrow
    //   680: invokeinterface hasNext : ()Z
    //   685: goto -> 689
    //   688: athrow
    //   689: ifeq -> 703
    //   692: ldc2_w 992022677
    //   695: l2i
    //   696: ldc_w 991343853
    //   699: ixor
    //   700: goto -> 711
    //   703: ldc2_w -1160983271
    //   706: l2i
    //   707: ldc_w -1157928608
    //   710: ixor
    //   711: ldc2_w 1091349915
    //   714: l2i
    //   715: ldc_w 1116550113
    //   718: ixor
    //   719: ixor
    //   720: tableswitch default -> 692, 62274050 -> 744, 62274051 -> 1865
    //   744: getstatic Perryc.c : I
    //   747: iflt -> 761
    //   750: ldc2_w -911886932
    //   753: l2i
    //   754: ldc_w -470427267
    //   757: ixor
    //   758: goto -> 769
    //   761: ldc2_w 1190505675
    //   764: l2i
    //   765: ldc_w -1611293969
    //   768: ixor
    //   769: ldc2_w 533507992
    //   772: l2i
    //   773: ldc_w -1391277210
    //   776: ixor
    //   777: ixor
    //   778: lookupswitch default -> 804, -1994633896 -> 761, -1735522257 -> 2981
    //   804: aload_3
    //   805: getstatic Perryc.1 : I
    //   808: ifeq -> 822
    //   811: ldc2_w -400788343
    //   814: l2i
    //   815: ldc_w -2032709814
    //   818: ixor
    //   819: goto -> 830
    //   822: ldc2_w -1822158525
    //   825: l2i
    //   826: ldc_w 1143294862
    //   829: ixor
    //   830: ldc2_w -950340380
    //   833: l2i
    //   834: ldc_w 623809388
    //   837: ixor
    //   838: ixor
    //   839: lookupswitch default -> 2995, -1933616053 -> 822, 892681541 -> 864
    //   864: goto -> 868
    //   867: athrow
    //   868: invokeinterface next : ()Ljava/lang/Object;
    //   873: goto -> 877
    //   876: athrow
    //   877: checkcast java/lang/Integer
    //   880: getstatic Perryc.1 : I
    //   883: ifeq -> 897
    //   886: ldc2_w 979778255
    //   889: l2i
    //   890: ldc_w 572190711
    //   893: ixor
    //   894: goto -> 905
    //   897: ldc2_w 1553916019
    //   900: l2i
    //   901: ldc_w 1416576961
    //   904: ixor
    //   905: ldc2_w -1588209182
    //   908: l2i
    //   909: ldc_w 208944777
    //   912: ixor
    //   913: ixor
    //   914: lookupswitch default -> 940, -1252183469 -> 2965, -541476190 -> 897
    //   940: goto -> 944
    //   943: athrow
    //   944: invokevirtual intValue : ()I
    //   947: goto -> 951
    //   950: athrow
    //   951: getstatic Perryc.c : I
    //   954: iflt -> 968
    //   957: ldc2_w -1240801298
    //   960: l2i
    //   961: ldc_w 1000605918
    //   964: ixor
    //   965: goto -> 976
    //   968: ldc2_w 1112680685
    //   971: l2i
    //   972: ldc_w -269323095
    //   975: ixor
    //   976: ldc2_w 569087921
    //   979: l2i
    //   980: ldc_w -1815719950
    //   983: ixor
    //   984: ixor
    //   985: lookupswitch default -> 3009, 529368071 -> 1012, 1065553779 -> 968
    //   1012: istore #4
    //   1014: getstatic Perryc.c : I
    //   1017: iflt -> 1031
    //   1020: ldc2_w -441720455
    //   1023: l2i
    //   1024: ldc_w 1282633085
    //   1027: ixor
    //   1028: goto -> 1039
    //   1031: ldc2_w -205689060
    //   1034: l2i
    //   1035: ldc_w 306661767
    //   1038: ixor
    //   1039: ldc2_w 1817977248
    //   1042: l2i
    //   1043: ldc_w 1883380515
    //   1046: ixor
    //   1047: ixor
    //   1048: lookupswitch default -> 1076, -1245268345 -> 2983, 90407307 -> 1031
    //   1076: aload_0
    //   1077: getstatic Perryc.1 : I
    //   1080: ifeq -> 1094
    //   1083: ldc2_w -524572037
    //   1086: l2i
    //   1087: ldc_w -1180860496
    //   1090: ixor
    //   1091: goto -> 1102
    //   1094: ldc2_w -787994540
    //   1097: l2i
    //   1098: ldc_w -1108754941
    //   1101: ixor
    //   1102: ldc2_w 1680838475
    //   1105: l2i
    //   1106: ldc_w 74158457
    //   1109: ixor
    //   1110: ixor
    //   1111: lookupswitch default -> 3003, 212174949 -> 1136, 962776057 -> 1094
    //   1136: getfield doneSlots : Ljava/util/List;
    //   1139: getstatic Perryc.0 : I
    //   1142: ifle -> 1156
    //   1145: ldc2_w -1131953628
    //   1148: l2i
    //   1149: ldc_w -1467365632
    //   1152: ixor
    //   1153: goto -> 1164
    //   1156: ldc2_w 1703230296
    //   1159: l2i
    //   1160: ldc_w -802272875
    //   1163: ixor
    //   1164: ldc2_w 261931426
    //   1167: l2i
    //   1168: ldc_w 1576260428
    //   1171: ixor
    //   1172: ixor
    //   1173: lookupswitch default -> 2953, -406560733 -> 1200, 1180768202 -> 1156
    //   1200: iload_2
    //   1201: getstatic Perryc.0 : I
    //   1204: ifle -> 1218
    //   1207: ldc2_w -205402384
    //   1210: l2i
    //   1211: ldc_w 1731798637
    //   1214: ixor
    //   1215: goto -> 1226
    //   1218: ldc2_w -1533459874
    //   1221: l2i
    //   1222: ldc_w 1719426574
    //   1225: ixor
    //   1226: ldc2_w -88542677
    //   1229: l2i
    //   1230: ldc_w 1870025848
    //   1233: ixor
    //   1234: ixor
    //   1235: lookupswitch default -> 2945, 20336334 -> 1218, 1462483459 -> 1260
    //   1260: goto -> 1264
    //   1263: athrow
    //   1264: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1267: goto -> 1271
    //   1270: athrow
    //   1271: getstatic Perryc.1 : I
    //   1274: ifeq -> 1288
    //   1277: ldc2_w 718527587
    //   1280: l2i
    //   1281: ldc_w 317388631
    //   1284: ixor
    //   1285: goto -> 1296
    //   1288: ldc2_w -1572432334
    //   1291: l2i
    //   1292: ldc_w 1202225490
    //   1295: ixor
    //   1296: ldc2_w -859132898
    //   1299: l2i
    //   1300: ldc_w -1771063932
    //   1303: ixor
    //   1304: ixor
    //   1305: lookupswitch default -> 1332, 972771689 -> 1288, 1654403758 -> 2989
    //   1332: goto -> 1336
    //   1335: athrow
    //   1336: invokeinterface contains : (Ljava/lang/Object;)Z
    //   1341: goto -> 1345
    //   1344: athrow
    //   1345: ifeq -> 1359
    //   1348: ldc2_w 1597510343
    //   1351: l2i
    //   1352: ldc_w 1049928020
    //   1355: ixor
    //   1356: goto -> 1367
    //   1359: ldc2_w 465802900
    //   1362: l2i
    //   1363: ldc_w 2054104320
    //   1366: ixor
    //   1367: ldc2_w 1800934897
    //   1370: l2i
    //   1371: ldc_w -1663540967
    //   1374: ixor
    //   1375: ixor
    //   1376: tableswitch default -> 1348, -1775450245 -> 1400, -1775450244 -> 1403
    //   1400: goto -> 557
    //   1403: getstatic Perryc.0 : I
    //   1406: ifle -> 1420
    //   1409: ldc2_w 162584936
    //   1412: l2i
    //   1413: ldc_w -131376355
    //   1416: ixor
    //   1417: goto -> 1428
    //   1420: ldc2_w 906363343
    //   1423: l2i
    //   1424: ldc_w 423951013
    //   1427: ixor
    //   1428: ldc2_w 580202519
    //   1431: l2i
    //   1432: ldc_w -1802942890
    //   1435: ixor
    //   1436: ixor
    //   1437: lookupswitch default -> 2985, -1721856725 -> 1464, 1200092212 -> 1420
    //   1464: iload #4
    //   1466: getstatic Perryc.c : I
    //   1469: iflt -> 1483
    //   1472: ldc2_w -623527315
    //   1475: l2i
    //   1476: ldc_w -1113001588
    //   1479: ixor
    //   1480: goto -> 1491
    //   1483: ldc2_w 1870747222
    //   1486: l2i
    //   1487: ldc_w 754683665
    //   1490: ixor
    //   1491: ldc2_w 1783436074
    //   1494: l2i
    //   1495: ldc_w -779866281
    //   1498: ixor
    //   1499: ixor
    //   1500: lookupswitch default -> 1528, -1323623495 -> 1483, -592152676 -> 2987
    //   1528: istore_2
    //   1529: getstatic Perryc.c : I
    //   1532: iflt -> 1546
    //   1535: ldc2_w -1746619250
    //   1538: l2i
    //   1539: ldc_w 1515043108
    //   1542: ixor
    //   1543: goto -> 1554
    //   1546: ldc2_w -929267835
    //   1549: l2i
    //   1550: ldc_w -2005179389
    //   1553: ixor
    //   1554: ldc2_w 926550433
    //   1557: l2i
    //   1558: ldc_w -1964309937
    //   1561: ixor
    //   1562: ixor
    //   1563: lookupswitch default -> 1588, -75707023 -> 1546, 1886914116 -> 3007
    //   1588: aload_0
    //   1589: getstatic Perryc.1 : I
    //   1592: ifeq -> 1606
    //   1595: ldc2_w -638802446
    //   1598: l2i
    //   1599: ldc_w -1297316711
    //   1602: ixor
    //   1603: goto -> 1614
    //   1606: ldc2_w 1632909753
    //   1609: l2i
    //   1610: ldc_w -4447522
    //   1613: ixor
    //   1614: ldc2_w -628128220
    //   1617: l2i
    //   1618: ldc_w 245079354
    //   1621: ixor
    //   1622: ixor
    //   1623: lookupswitch default -> 3005, -1084999051 -> 1606, 1258029177 -> 1648
    //   1648: getfield doneSlots : Ljava/util/List;
    //   1651: getstatic Perryc.1 : I
    //   1654: ifeq -> 1668
    //   1657: ldc2_w -432661905
    //   1660: l2i
    //   1661: ldc_w -1196967022
    //   1664: ixor
    //   1665: goto -> 1676
    //   1668: ldc2_w -30575079
    //   1671: l2i
    //   1672: ldc_w 427370825
    //   1675: ixor
    //   1676: ldc2_w 364987774
    //   1679: l2i
    //   1680: ldc_w 1752111756
    //   1683: ixor
    //   1684: ixor
    //   1685: lookupswitch default -> 2967, -1694891870 -> 1712, 591396367 -> 1668
    //   1712: iload #4
    //   1714: getstatic Perryc.1 : I
    //   1717: ifeq -> 1731
    //   1720: ldc2_w 64588382
    //   1723: l2i
    //   1724: ldc_w -1508548034
    //   1727: ixor
    //   1728: goto -> 1739
    //   1731: ldc2_w -201755190
    //   1734: l2i
    //   1735: ldc_w 598239510
    //   1738: ixor
    //   1739: ldc2_w -30765501
    //   1742: l2i
    //   1743: ldc_w -236161451
    //   1746: ixor
    //   1747: ixor
    //   1748: lookupswitch default -> 2979, -1442181002 -> 1731, -543693622 -> 1776
    //   1776: goto -> 1780
    //   1779: athrow
    //   1780: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1783: goto -> 1787
    //   1786: athrow
    //   1787: getstatic Perryc.0 : I
    //   1790: ifle -> 1804
    //   1793: ldc2_w -1360008863
    //   1796: l2i
    //   1797: ldc_w -2102848613
    //   1800: ixor
    //   1801: goto -> 1812
    //   1804: ldc2_w 1879817933
    //   1807: l2i
    //   1808: ldc_w 2100471915
    //   1811: ixor
    //   1812: ldc2_w -1833750737
    //   1815: l2i
    //   1816: ldc_w -1228951170
    //   1819: ixor
    //   1820: ixor
    //   1821: lookupswitch default -> 1848, -925863135 -> 1804, 139093163 -> 2951
    //   1848: goto -> 1852
    //   1851: athrow
    //   1852: invokeinterface add : (Ljava/lang/Object;)Z
    //   1857: goto -> 1861
    //   1860: athrow
    //   1861: pop
    //   1862: goto -> 557
    //   1865: getstatic Perryc.c : I
    //   1868: iflt -> 1882
    //   1871: ldc2_w -64704921
    //   1874: l2i
    //   1875: ldc_w 2062926635
    //   1878: ixor
    //   1879: goto -> 1890
    //   1882: ldc2_w -112876848
    //   1885: l2i
    //   1886: ldc_w -1355002441
    //   1889: ixor
    //   1890: ldc2_w -388501734
    //   1893: l2i
    //   1894: ldc_w -1779166999
    //   1897: ixor
    //   1898: ixor
    //   1899: lookupswitch default -> 1924, -67988801 -> 2969, 115015033 -> 1882
    //   1924: iload_2
    //   1925: ldc2_w 1988048838
    //   1928: l2i
    //   1929: ldc_w -1988048839
    //   1932: ixor
    //   1933: if_icmpeq -> 1947
    //   1936: ldc2_w 804387376
    //   1939: l2i
    //   1940: ldc_w 1267698890
    //   1943: ixor
    //   1944: goto -> 1955
    //   1947: ldc2_w 964820830
    //   1950: l2i
    //   1951: ldc_w 1577028005
    //   1954: ixor
    //   1955: ldc2_w -685562073
    //   1958: l2i
    //   1959: ldc_w 1761602491
    //   1962: ixor
    //   1963: ixor
    //   1964: tableswitch default -> 1936, -610092442 -> 1988, -610092441 -> 2934
    //   1988: getstatic Perryc.c : I
    //   1991: iflt -> 2005
    //   1994: ldc2_w 929985368
    //   1997: l2i
    //   1998: ldc_w 30237690
    //   2001: ixor
    //   2002: goto -> 2013
    //   2005: ldc2_w -1255640839
    //   2008: l2i
    //   2009: ldc_w -2085665507
    //   2012: ixor
    //   2013: ldc2_w -1828153072
    //   2016: l2i
    //   2017: ldc_w -1928777392
    //   2020: ixor
    //   2021: ixor
    //   2022: lookupswitch default -> 2048, -2105785465 -> 2005, 681752802 -> 2971
    //   2048: aload_0
    //   2049: getstatic Perryc.1 : I
    //   2052: ifeq -> 2066
    //   2055: ldc2_w -1090294482
    //   2058: l2i
    //   2059: ldc_w -1336715560
    //   2062: ixor
    //   2063: goto -> 2074
    //   2066: ldc2_w 1414583169
    //   2069: l2i
    //   2070: ldc_w -1686713372
    //   2073: ixor
    //   2074: ldc2_w 407408375
    //   2077: l2i
    //   2078: ldc_w 1538799953
    //   2081: ixor
    //   2082: ixor
    //   2083: lookupswitch default -> 2935, -1932087357 -> 2108, 1285590096 -> 2066
    //   2108: getfield taskList : Ljava/util/Queue;
    //   2111: new bigname/zprestige/webhack/util/InventoryUtil$Task
    //   2114: dup
    //   2115: getstatic Perryc.1 : I
    //   2118: ifeq -> 2132
    //   2121: ldc2_w -1467100980
    //   2124: l2i
    //   2125: ldc_w 719360173
    //   2128: ixor
    //   2129: goto -> 2140
    //   2132: ldc2_w -1729212319
    //   2135: l2i
    //   2136: ldc_w 1328767972
    //   2139: ixor
    //   2140: ldc2_w 1123694780
    //   2143: l2i
    //   2144: ldc_w 1557853808
    //   2147: ixor
    //   2148: ixor
    //   2149: lookupswitch default -> 2973, -1672638803 -> 2132, -906101431 -> 2176
    //   2176: iload_1
    //   2177: getstatic Perryc.0 : I
    //   2180: ifle -> 2194
    //   2183: ldc2_w -1473620999
    //   2186: l2i
    //   2187: ldc_w 39217853
    //   2190: ixor
    //   2191: goto -> 2202
    //   2194: ldc2_w 1885320830
    //   2197: l2i
    //   2198: ldc_w -962646616
    //   2201: ixor
    //   2202: ldc2_w 607577732
    //   2205: l2i
    //   2206: ldc_w -358809840
    //   2209: ixor
    //   2210: ixor
    //   2211: lookupswitch default -> 2947, 1691754704 -> 2194, 2020246082 -> 2236
    //   2236: goto -> 2240
    //   2239: athrow
    //   2240: invokespecial <init> : (I)V
    //   2243: goto -> 2247
    //   2246: athrow
    //   2247: getstatic Perryc.c : I
    //   2250: iflt -> 2264
    //   2253: ldc2_w 2058636505
    //   2256: l2i
    //   2257: ldc_w -505385838
    //   2260: ixor
    //   2261: goto -> 2272
    //   2264: ldc2_w -134907488
    //   2267: l2i
    //   2268: ldc_w 275618026
    //   2271: ixor
    //   2272: ldc2_w -176827049
    //   2275: l2i
    //   2276: ldc_w -487693711
    //   2279: ixor
    //   2280: ixor
    //   2281: lookupswitch default -> 2308, -1932552339 -> 2941, 1371520269 -> 2264
    //   2308: goto -> 2312
    //   2311: athrow
    //   2312: invokeinterface add : (Ljava/lang/Object;)Z
    //   2317: goto -> 2321
    //   2320: athrow
    //   2321: pop
    //   2322: getstatic Perryc.1 : I
    //   2325: ifeq -> 2339
    //   2328: ldc2_w 271403039
    //   2331: l2i
    //   2332: ldc_w -1941936974
    //   2335: ixor
    //   2336: goto -> 2347
    //   2339: ldc2_w -86869622
    //   2342: l2i
    //   2343: ldc_w -1385537873
    //   2346: ixor
    //   2347: ldc2_w -2007256418
    //   2350: l2i
    //   2351: ldc_w -756461335
    //   2354: ixor
    //   2355: ixor
    //   2356: lookupswitch default -> 2959, -958411046 -> 2339, 218809682 -> 2384
    //   2384: aload_0
    //   2385: getstatic Perryc.c : I
    //   2388: iflt -> 2402
    //   2391: ldc2_w -1995520984
    //   2394: l2i
    //   2395: ldc_w 554269720
    //   2398: ixor
    //   2399: goto -> 2410
    //   2402: ldc2_w 1783588994
    //   2405: l2i
    //   2406: ldc_w 2043049440
    //   2409: ixor
    //   2410: ldc2_w 1797084710
    //   2413: l2i
    //   2414: ldc_w -797548203
    //   2417: ixor
    //   2418: ixor
    //   2419: lookupswitch default -> 3011, -1461573103 -> 2444, 325881667 -> 2402
    //   2444: getfield taskList : Ljava/util/Queue;
    //   2447: new bigname/zprestige/webhack/util/InventoryUtil$Task
    //   2450: dup
    //   2451: getstatic Perryc.c : I
    //   2454: iflt -> 2468
    //   2457: ldc2_w 1084074833
    //   2460: l2i
    //   2461: ldc_w -1734285240
    //   2464: ixor
    //   2465: goto -> 2476
    //   2468: ldc2_w -717779678
    //   2471: l2i
    //   2472: ldc_w -878893894
    //   2475: ixor
    //   2476: ldc2_w 1639665216
    //   2479: l2i
    //   2480: ldc_w 709851327
    //   2483: ixor
    //   2484: ixor
    //   2485: lookupswitch default -> 2955, -1815513626 -> 2468, 1432264551 -> 2512
    //   2512: iload_2
    //   2513: getstatic Perryc.0 : I
    //   2516: ifle -> 2530
    //   2519: ldc2_w -1367012041
    //   2522: l2i
    //   2523: ldc_w -1701624187
    //   2526: ixor
    //   2527: goto -> 2538
    //   2530: ldc2_w -2017889890
    //   2533: l2i
    //   2534: ldc_w 232627526
    //   2537: ixor
    //   2538: ldc2_w 822616863
    //   2541: l2i
    //   2542: ldc_w 775544073
    //   2545: ixor
    //   2546: ixor
    //   2547: lookupswitch default -> 2572, 724022692 -> 2991, 1356343564 -> 2530
    //   2572: goto -> 2576
    //   2575: athrow
    //   2576: invokespecial <init> : (I)V
    //   2579: goto -> 2583
    //   2582: athrow
    //   2583: getstatic Perryc.c : I
    //   2586: iflt -> 2600
    //   2589: ldc2_w -1585497106
    //   2592: l2i
    //   2593: ldc_w -141683285
    //   2596: ixor
    //   2597: goto -> 2608
    //   2600: ldc2_w 1268308137
    //   2603: l2i
    //   2604: ldc_w 1774807401
    //   2607: ixor
    //   2608: ldc2_w 1967464487
    //   2611: l2i
    //   2612: ldc_w -165892222
    //   2615: ixor
    //   2616: ixor
    //   2617: lookupswitch default -> 2644, -856109237 -> 2600, -710368800 -> 2939
    //   2644: goto -> 2648
    //   2647: athrow
    //   2648: invokeinterface add : (Ljava/lang/Object;)Z
    //   2653: goto -> 2657
    //   2656: athrow
    //   2657: pop
    //   2658: getstatic Perryc.c : I
    //   2661: iflt -> 2675
    //   2664: ldc2_w -1251617422
    //   2667: l2i
    //   2668: ldc_w 569374910
    //   2671: ixor
    //   2672: goto -> 2683
    //   2675: ldc2_w -705613509
    //   2678: l2i
    //   2679: ldc_w -2021504504
    //   2682: ixor
    //   2683: ldc2_w -1352746669
    //   2686: l2i
    //   2687: ldc_w 1074754179
    //   2690: ixor
    //   2691: ixor
    //   2692: lookupswitch default -> 2963, -1121799965 -> 2720, 2078008860 -> 2675
    //   2720: aload_0
    //   2721: getstatic Perryc.0 : I
    //   2724: ifle -> 2738
    //   2727: ldc2_w -506986741
    //   2730: l2i
    //   2731: ldc_w 1005373619
    //   2734: ixor
    //   2735: goto -> 2746
    //   2738: ldc2_w 1950359754
    //   2741: l2i
    //   2742: ldc_w 481409440
    //   2745: ixor
    //   2746: ldc2_w 681740298
    //   2749: l2i
    //   2750: ldc_w 949811070
    //   2753: ixor
    //   2754: ixor
    //   2755: lookupswitch default -> 2937, -904574772 -> 2738, 2026890782 -> 2780
    //   2780: getfield taskList : Ljava/util/Queue;
    //   2783: new bigname/zprestige/webhack/util/InventoryUtil$Task
    //   2786: dup
    //   2787: getstatic Perryc.1 : I
    //   2790: ifeq -> 2804
    //   2793: ldc2_w 1035053412
    //   2796: l2i
    //   2797: ldc_w 1154039705
    //   2800: ixor
    //   2801: goto -> 2812
    //   2804: ldc2_w -773913798
    //   2807: l2i
    //   2808: ldc_w 888418794
    //   2811: ixor
    //   2812: ldc2_w 426697602
    //   2815: l2i
    //   2816: ldc_w 1103355280
    //   2819: ixor
    //   2820: ixor
    //   2821: lookupswitch default -> 2961, -1115288382 -> 2848, 567650543 -> 2804
    //   2848: goto -> 2852
    //   2851: athrow
    //   2852: invokespecial <init> : ()V
    //   2855: goto -> 2859
    //   2858: athrow
    //   2859: getstatic Perryc.0 : I
    //   2862: ifle -> 2876
    //   2865: ldc2_w 579840512
    //   2868: l2i
    //   2869: ldc_w -1633666992
    //   2872: ixor
    //   2873: goto -> 2884
    //   2876: ldc2_w -633632544
    //   2879: l2i
    //   2880: ldc_w 1370884503
    //   2883: ixor
    //   2884: ldc2_w -247422724
    //   2887: l2i
    //   2888: ldc_w 2054809650
    //   2891: ixor
    //   2892: ixor
    //   2893: lookupswitch default -> 2977, 11848121 -> 2920, 924244638 -> 2876
    //   2920: goto -> 2924
    //   2923: athrow
    //   2924: invokeinterface add : (Ljava/lang/Object;)Z
    //   2929: goto -> 2933
    //   2932: athrow
    //   2933: pop
    //   2934: return
    //   2935: aconst_null
    //   2936: athrow
    //   2937: aconst_null
    //   2938: athrow
    //   2939: aconst_null
    //   2940: athrow
    //   2941: aconst_null
    //   2942: athrow
    //   2943: aconst_null
    //   2944: athrow
    //   2945: aconst_null
    //   2946: athrow
    //   2947: aconst_null
    //   2948: athrow
    //   2949: aconst_null
    //   2950: athrow
    //   2951: aconst_null
    //   2952: athrow
    //   2953: aconst_null
    //   2954: athrow
    //   2955: aconst_null
    //   2956: athrow
    //   2957: aconst_null
    //   2958: athrow
    //   2959: aconst_null
    //   2960: athrow
    //   2961: aconst_null
    //   2962: athrow
    //   2963: aconst_null
    //   2964: athrow
    //   2965: aconst_null
    //   2966: athrow
    //   2967: aconst_null
    //   2968: athrow
    //   2969: aconst_null
    //   2970: athrow
    //   2971: aconst_null
    //   2972: athrow
    //   2973: aconst_null
    //   2974: athrow
    //   2975: aconst_null
    //   2976: athrow
    //   2977: aconst_null
    //   2978: athrow
    //   2979: aconst_null
    //   2980: athrow
    //   2981: aconst_null
    //   2982: athrow
    //   2983: aconst_null
    //   2984: athrow
    //   2985: aconst_null
    //   2986: athrow
    //   2987: aconst_null
    //   2988: athrow
    //   2989: aconst_null
    //   2990: athrow
    //   2991: aconst_null
    //   2992: athrow
    //   2993: aconst_null
    //   2994: athrow
    //   2995: aconst_null
    //   2996: athrow
    //   2997: aconst_null
    //   2998: athrow
    //   2999: aconst_null
    //   3000: athrow
    //   3001: aconst_null
    //   3002: athrow
    //   3003: aconst_null
    //   3004: athrow
    //   3005: aconst_null
    //   3006: athrow
    //   3007: aconst_null
    //   3008: athrow
    //   3009: aconst_null
    //   3010: athrow
    //   3011: aconst_null
    //   3012: athrow
    //   3013: aconst_null
    //   3014: athrow
    //   3015: pop
    //   3016: goto -> 24
    //   3019: pop
    //   3020: aconst_null
    //   3021: goto -> 3015
    //   3024: dup
    //   3025: ifnull -> 3015
    //   3028: checkcast java/lang/Throwable
    //   3031: athrow
    //   3032: dup
    //   3033: ifnull -> 3019
    //   3036: checkcast java/lang/Throwable
    //   3039: athrow
    //   3040: aconst_null
    //   3041: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   1014	848	4	i	I
    //   345	2589	2	target	I
    //   24	2911	0	this	Lbigname/zprestige/webhack/features/modules/Player/ArmourMend;
    //   24	2911	1	slot	I
    // Exception table:
    //   from	to	target	type
    //   8	20	3024	java/lang/ArithmeticException
    //   212	220	220	finally
    //   212	220	220	java/lang/EnumConstantNotPresentException
    //   212	220	220	java/util/NoSuchElementException
    //   212	220	3	finally
    //   212	220	3	finally
    //   415	422	422	finally
    //   415	422	3	java/lang/EnumConstantNotPresentException
    //   415	422	415	finally
    //   416	422	415	java/lang/IllegalStateException
    //   416	422	422	java/lang/EnumConstantNotPresentException
    //   487	496	496	finally
    //   487	496	487	java/lang/StringIndexOutOfBoundsException
    //   487	496	3	java/lang/EnumConstantNotPresentException
    //   487	496	487	finally
    //   488	496	3	finally
    //   679	688	688	finally
    //   679	688	679	finally
    //   680	688	3	finally
    //   680	688	3	finally
    //   680	688	3	java/lang/ArithmeticException
    //   867	876	876	finally
    //   867	876	876	java/lang/IllegalStateException
    //   867	876	867	java/lang/RuntimeException
    //   868	876	876	java/lang/AssertionError
    //   868	876	876	finally
    //   943	950	950	finally
    //   943	950	943	java/lang/ClassCastException
    //   944	950	3	finally
    //   944	950	943	finally
    //   944	950	950	java/lang/EnumConstantNotPresentException
    //   1263	1270	1270	finally
    //   1263	1270	1263	finally
    //   1263	1270	1270	java/lang/NegativeArraySizeException
    //   1264	1270	1263	finally
    //   1264	1270	1270	java/lang/EnumConstantNotPresentException
    //   1335	1344	1344	finally
    //   1335	1344	3	finally
    //   1335	1344	1344	java/lang/IndexOutOfBoundsException
    //   1335	1344	1344	finally
    //   1336	1344	1335	finally
    //   1779	1786	1786	finally
    //   1779	1786	3	finally
    //   1779	1786	3	java/lang/IllegalStateException
    //   1779	1786	1779	finally
    //   1780	1786	1786	finally
    //   1851	1860	1860	finally
    //   1851	1860	3	java/lang/AssertionError
    //   1851	1860	3	java/lang/NegativeArraySizeException
    //   1851	1860	1851	java/lang/RuntimeException
    //   1852	1860	3	java/lang/NegativeArraySizeException
    //   2239	2246	2246	finally
    //   2239	2246	3	java/lang/AssertionError
    //   2239	2246	2239	java/util/ConcurrentModificationException
    //   2240	2246	2239	java/lang/NegativeArraySizeException
    //   2240	2246	3	finally
    //   2311	2320	2320	finally
    //   2311	2320	2320	java/lang/ArrayIndexOutOfBoundsException
    //   2311	2320	2311	finally
    //   2312	2320	2320	finally
    //   2312	2320	2311	finally
    //   2575	2582	2582	finally
    //   2575	2582	2582	finally
    //   2575	2582	3	finally
    //   2575	2582	3	java/util/NoSuchElementException
    //   2576	2582	2575	finally
    //   2647	2656	2656	finally
    //   2647	2656	3	java/lang/ClassCastException
    //   2647	2656	2647	finally
    //   2647	2656	2656	java/lang/ClassCastException
    //   2648	2656	2647	java/lang/NullPointerException
    //   2852	2858	2858	finally
    //   2852	2858	3	finally
    //   2852	2858	2858	java/lang/EnumConstantNotPresentException
    //   2852	2858	3	finally
    //   2852	2858	2858	java/lang/ArrayIndexOutOfBoundsException
    //   2923	2932	2932	finally
    //   2923	2932	2923	finally
    //   2923	2932	2923	finally
    //   2923	2932	2932	finally
    //   2924	2932	3	finally
    //   3024	3032	3024	java/lang/ArrayIndexOutOfBoundsException
    //   3040	3042	3	finally
  }
  
  public void onLogout() {
    Perry1.3p(this, (int)-1823210105L ^ 0x9DA8153A);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public ArmourMend() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -1463115739
    //   9: l2i
    //   10: ldc_w -1446157026
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1877606452
    //   20: l2i
    //   21: ldc_w 978031293
    //   24: ixor
    //   25: ldc2_w 207866833
    //   28: l2i
    //   29: ldc_w 955335091
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1691152044 -> 17, 898977625 -> 2774
    //   60: aload_0
    //   61: ldc_w '䅇㌁䄁㶸꿈๔㳎蹭눿'
    //   64: getstatic Perryc.c : I
    //   67: iflt -> 81
    //   70: ldc2_w 251995098
    //   73: l2i
    //   74: ldc_w 1719946942
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -1423542290
    //   84: l2i
    //   85: ldc_w -1794219218
    //   88: ixor
    //   89: ldc2_w -1381233053
    //   92: l2i
    //   93: ldc_w 1434507692
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 2722, -1850885461 -> 81, -972766449 -> 124
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '䅫㌖䄂㶳'
    //   130: getstatic Perryc.c : I
    //   133: iflt -> 147
    //   136: ldc2_w -1015553598
    //   139: l2i
    //   140: ldc_w 1595228659
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w -359412416
    //   150: l2i
    //   151: ldc_w 706426353
    //   154: ixor
    //   155: ldc2_w 1370561094
    //   158: l2i
    //   159: ldc_w 1625107954
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 2780, -1391552635 -> 147, -236663035 -> 192
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.1 : I
    //   198: ifeq -> 212
    //   201: ldc2_w 1139014749
    //   204: l2i
    //   205: ldc_w -38498923
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w 740700051
    //   215: l2i
    //   216: ldc_w -1849080387
    //   219: ixor
    //   220: ldc2_w 1795461822
    //   223: l2i
    //   224: ldc_w 922818013
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 2726, -504697523 -> 256, -497879381 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.PLAYER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -1951576706
    //   262: l2i
    //   263: ldc_w -1951576705
    //   266: ixor
    //   267: ldc2_w -1075067820
    //   270: l2i
    //   271: ldc_w -1075067820
    //   274: ixor
    //   275: ldc2_w 2134657042
    //   278: l2i
    //   279: ldc_w 2134657042
    //   282: ixor
    //   283: getstatic Perryc.1 : I
    //   286: ifeq -> 300
    //   289: ldc2_w -1082327652
    //   292: l2i
    //   293: ldc_w -1486364776
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 953279957
    //   303: l2i
    //   304: ldc_w -1364859748
    //   307: ixor
    //   308: ldc2_w 596531521
    //   311: l2i
    //   312: ldc_w -1096208702
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 344, -2059643513 -> 2756, -171757919 -> 300
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.0 : I
    //   350: ifle -> 364
    //   353: ldc2_w 904751394
    //   356: l2i
    //   357: ldc_w -117161932
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w 1509451918
    //   367: l2i
    //   368: ldc_w -757143476
    //   371: ixor
    //   372: ldc2_w 849857913
    //   375: l2i
    //   376: ldc_w -1655786642
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -725541185 -> 364, 1660966657 -> 2794
    //   408: aload_0
    //   409: getstatic Perryc.1 : I
    //   412: ifeq -> 426
    //   415: ldc2_w 1584147596
    //   418: l2i
    //   419: ldc_w 152858589
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w 1986148456
    //   429: l2i
    //   430: ldc_w -2035694255
    //   433: ixor
    //   434: ldc2_w -970770136
    //   437: l2i
    //   438: ldc_w -1778421793
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -39304691 -> 426, 78386598 -> 2758
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '䅃㌝䄉㶺꾚๋㳊蹭눼隸'
    //   476: getstatic Perryc.1 : I
    //   479: ifeq -> 493
    //   482: ldc2_w -842532254
    //   485: l2i
    //   486: ldc_w 1965070674
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w 1644663978
    //   496: l2i
    //   497: ldc_w 1556249656
    //   500: ixor
    //   501: ldc2_w 363225279
    //   504: l2i
    //   505: ldc_w -1939784071
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 2776, -1492994476 -> 536, 555761142 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w 530121000
    //   542: l2i
    //   543: ldc_w 530120994
    //   546: ixor
    //   547: getstatic Perryc.0 : I
    //   550: ifle -> 564
    //   553: ldc2_w 2131846217
    //   556: l2i
    //   557: ldc_w -8802645
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w -992011564
    //   567: l2i
    //   568: ldc_w -1046287637
    //   571: ixor
    //   572: ldc2_w -133332887
    //   575: l2i
    //   576: ldc_w 602280040
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 608, -1043622721 -> 564, 1535335139 -> 2768
    //   608: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   611: ldc2_w -1599782385
    //   614: l2i
    //   615: ldc_w -1599782386
    //   618: ixor
    //   619: getstatic Perryc.1 : I
    //   622: ifeq -> 636
    //   625: ldc2_w 1757176526
    //   628: l2i
    //   629: ldc_w 229940855
    //   632: ixor
    //   633: goto -> 644
    //   636: ldc2_w -1283738340
    //   639: l2i
    //   640: ldc_w 1692675371
    //   643: ixor
    //   644: ldc2_w -767637568
    //   647: l2i
    //   648: ldc_w 1649212641
    //   651: ixor
    //   652: ixor
    //   653: lookupswitch default -> 680, -713373800 -> 2716, 1157731932 -> 636
    //   680: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   683: ldc2_w 805949984
    //   686: l2i
    //   687: ldc_w 805950004
    //   690: ixor
    //   691: getstatic Perryc.c : I
    //   694: iflt -> 708
    //   697: ldc2_w 161847285
    //   700: l2i
    //   701: ldc_w 1942240176
    //   704: ixor
    //   705: goto -> 716
    //   708: ldc2_w 1565261456
    //   711: l2i
    //   712: ldc_w 1743245806
    //   715: ixor
    //   716: ldc2_w -1962445875
    //   719: l2i
    //   720: ldc_w -1400162343
    //   723: ixor
    //   724: ixor
    //   725: lookupswitch default -> 752, -298370347 -> 708, 1575872593 -> 2720
    //   752: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   755: getstatic Perryc.c : I
    //   758: iflt -> 772
    //   761: ldc2_w 659411210
    //   764: l2i
    //   765: ldc_w 1893305016
    //   768: ixor
    //   769: goto -> 780
    //   772: ldc2_w 1434643598
    //   775: l2i
    //   776: ldc_w -1530263633
    //   779: ixor
    //   780: ldc2_w -203257348
    //   783: l2i
    //   784: ldc_w -615269523
    //   787: ixor
    //   788: ixor
    //   789: lookupswitch default -> 2740, -637937232 -> 816, 2133158179 -> 772
    //   816: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   819: getstatic Perryc.c : I
    //   822: iflt -> 836
    //   825: ldc2_w 1235213868
    //   828: l2i
    //   829: ldc_w 793329453
    //   832: ixor
    //   833: goto -> 844
    //   836: ldc2_w 1952103395
    //   839: l2i
    //   840: ldc_w -789712933
    //   843: ixor
    //   844: ldc2_w 412099861
    //   847: l2i
    //   848: ldc_w 78024004
    //   851: ixor
    //   852: ixor
    //   853: lookupswitch default -> 2766, -1199440791 -> 880, 2061519184 -> 836
    //   880: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   883: getstatic Perryc.c : I
    //   886: iflt -> 900
    //   889: ldc2_w -1124735963
    //   892: l2i
    //   893: ldc_w -604567670
    //   896: ixor
    //   897: goto -> 908
    //   900: ldc2_w 1585870760
    //   903: l2i
    //   904: ldc_w -1868993998
    //   907: ixor
    //   908: ldc2_w -246525066
    //   911: l2i
    //   912: ldc_w -645073560
    //   915: ixor
    //   916: ixor
    //   917: lookupswitch default -> 2734, -421676156 -> 944, 1338000817 -> 900
    //   944: putfield closestEnemy : Lbigname/zprestige/webhack/features/setting/Setting;
    //   947: getstatic Perryc.1 : I
    //   950: ifeq -> 964
    //   953: ldc2_w -132427743
    //   956: l2i
    //   957: ldc_w -1481336897
    //   960: ixor
    //   961: goto -> 972
    //   964: ldc2_w -1381391570
    //   967: l2i
    //   968: ldc_w 2042296485
    //   971: ixor
    //   972: ldc2_w 1251225051
    //   975: l2i
    //   976: ldc_w -2097676779
    //   979: ixor
    //   980: ixor
    //   981: lookupswitch default -> 1008, -1748233136 -> 2736, 299794261 -> 964
    //   1008: aload_0
    //   1009: getstatic Perryc.c : I
    //   1012: iflt -> 1026
    //   1015: ldc2_w 358002341
    //   1018: l2i
    //   1019: ldc_w 1631952559
    //   1022: ixor
    //   1023: goto -> 1034
    //   1026: ldc2_w 1486943313
    //   1029: l2i
    //   1030: ldc_w 1724124285
    //   1033: ixor
    //   1034: ldc2_w -1421221073
    //   1037: l2i
    //   1038: ldc_w -1052567382
    //   1041: ixor
    //   1042: ixor
    //   1043: lookupswitch default -> 1068, -1602227574 -> 1026, 505006991 -> 2760
    //   1068: aload_0
    //   1069: new bigname/zprestige/webhack/features/setting/Setting
    //   1072: dup
    //   1073: ldc_w '䅒㌒䄇㶲꿜๿㲋踦'
    //   1076: getstatic Perryc.1 : I
    //   1079: ifeq -> 1093
    //   1082: ldc2_w -2004109588
    //   1085: l2i
    //   1086: ldc_w 38176936
    //   1089: ixor
    //   1090: goto -> 1101
    //   1093: ldc2_w 633947394
    //   1096: l2i
    //   1097: ldc_w 1766210828
    //   1100: ixor
    //   1101: ldc2_w 363582817
    //   1104: l2i
    //   1105: ldc_w -560748979
    //   1108: ixor
    //   1109: ixor
    //   1110: lookupswitch default -> 2786, -2018047198 -> 1136, 1106595176 -> 1093
    //   1136: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1139: ldc2_w 876724519
    //   1142: l2i
    //   1143: ldc_w 876724599
    //   1146: ixor
    //   1147: getstatic Perryc.0 : I
    //   1150: ifle -> 1164
    //   1153: ldc2_w 1636025473
    //   1156: l2i
    //   1157: ldc_w -1783153085
    //   1160: ixor
    //   1161: goto -> 1172
    //   1164: ldc2_w -1383234541
    //   1167: l2i
    //   1168: ldc_w -382150611
    //   1171: ixor
    //   1172: ldc2_w -1969165977
    //   1175: l2i
    //   1176: ldc_w -1544854991
    //   1179: ixor
    //   1180: ixor
    //   1181: lookupswitch default -> 1208, -578850412 -> 2778, -537553499 -> 1164
    //   1208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1211: ldc2_w 996311731
    //   1214: l2i
    //   1215: ldc_w 996311730
    //   1218: ixor
    //   1219: getstatic Perryc.0 : I
    //   1222: ifle -> 1236
    //   1225: ldc2_w -1069467202
    //   1228: l2i
    //   1229: ldc_w -461976632
    //   1232: ixor
    //   1233: goto -> 1244
    //   1236: ldc2_w -1472365642
    //   1239: l2i
    //   1240: ldc_w -431045624
    //   1243: ixor
    //   1244: ldc2_w -1125798826
    //   1247: l2i
    //   1248: ldc_w -469935037
    //   1251: ixor
    //   1252: ixor
    //   1253: lookupswitch default -> 1280, -424196191 -> 1236, 2066678371 -> 2762
    //   1280: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1283: ldc2_w 676222264
    //   1286: l2i
    //   1287: ldc_w 676222300
    //   1290: ixor
    //   1291: getstatic Perryc.1 : I
    //   1294: ifeq -> 1308
    //   1297: ldc2_w 1418438564
    //   1300: l2i
    //   1301: ldc_w 1565337871
    //   1304: ixor
    //   1305: goto -> 1316
    //   1308: ldc2_w 44081393
    //   1311: l2i
    //   1312: ldc_w -488063882
    //   1315: ixor
    //   1316: ldc2_w -1390627652
    //   1319: l2i
    //   1320: ldc_w -1545864633
    //   1323: ixor
    //   1324: ixor
    //   1325: lookupswitch default -> 1352, -983890157 -> 1308, 117555280 -> 2788
    //   1352: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1355: getstatic Perryc.0 : I
    //   1358: ifle -> 1372
    //   1361: ldc2_w -277188664
    //   1364: l2i
    //   1365: ldc_w -1869896424
    //   1368: ixor
    //   1369: goto -> 1380
    //   1372: ldc2_w 139255073
    //   1375: l2i
    //   1376: ldc_w 2068979435
    //   1379: ixor
    //   1380: ldc2_w 1471844463
    //   1383: l2i
    //   1384: ldc_w -39527115
    //   1387: ixor
    //   1388: ixor
    //   1389: lookupswitch default -> 1416, -705722486 -> 2764, 1666405216 -> 1372
    //   1416: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1419: getstatic Perryc.c : I
    //   1422: iflt -> 1436
    //   1425: ldc2_w -1429410460
    //   1428: l2i
    //   1429: ldc_w 1109373817
    //   1432: ixor
    //   1433: goto -> 1444
    //   1436: ldc2_w 752310512
    //   1439: l2i
    //   1440: ldc_w -1982648309
    //   1443: ixor
    //   1444: ldc2_w -1534805391
    //   1447: l2i
    //   1448: ldc_w 355246631
    //   1451: ixor
    //   1452: ixor
    //   1453: lookupswitch default -> 1480, -2103135610 -> 1436, 1501251147 -> 2790
    //   1480: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1483: getstatic Perryc.0 : I
    //   1486: ifle -> 1500
    //   1489: ldc2_w 101790632
    //   1492: l2i
    //   1493: ldc_w 1088604744
    //   1496: ixor
    //   1497: goto -> 1508
    //   1500: ldc2_w -1434714796
    //   1503: l2i
    //   1504: ldc_w -1102604470
    //   1507: ixor
    //   1508: ldc2_w -1336977723
    //   1511: l2i
    //   1512: ldc_w 1638702953
    //   1515: ixor
    //   1516: ixor
    //   1517: lookupswitch default -> 2732, -1760546740 -> 1500, -975199310 -> 1544
    //   1544: putfield repair : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1547: getstatic Perryc.0 : I
    //   1550: ifle -> 1564
    //   1553: ldc2_w -147644875
    //   1556: l2i
    //   1557: ldc_w 223351611
    //   1560: ixor
    //   1561: goto -> 1572
    //   1564: ldc2_w 206991002
    //   1567: l2i
    //   1568: ldc_w 1885900188
    //   1571: ixor
    //   1572: ldc2_w 964686720
    //   1575: l2i
    //   1576: ldc_w -1331619293
    //   1579: ixor
    //   1580: ixor
    //   1581: lookupswitch default -> 1608, 1941824685 -> 2754, 2069208344 -> 1564
    //   1608: aload_0
    //   1609: new bigname/zprestige/webhack/util/Timer
    //   1612: dup
    //   1613: getstatic Perryc.0 : I
    //   1616: ifle -> 1630
    //   1619: ldc2_w -330921901
    //   1622: l2i
    //   1623: ldc_w -239759921
    //   1626: ixor
    //   1627: goto -> 1638
    //   1630: ldc2_w 2135943576
    //   1633: l2i
    //   1634: ldc_w 554490974
    //   1637: ixor
    //   1638: ldc2_w -511996125
    //   1641: l2i
    //   1642: ldc_w 451514736
    //   1645: ixor
    //   1646: ixor
    //   1647: lookupswitch default -> 1672, -1524065628 -> 1630, -429843505 -> 2782
    //   1672: invokespecial <init> : ()V
    //   1675: getstatic Perryc.1 : I
    //   1678: ifeq -> 1692
    //   1681: ldc2_w 238040308
    //   1684: l2i
    //   1685: ldc_w 1511513781
    //   1688: ixor
    //   1689: goto -> 1700
    //   1692: ldc2_w 344928259
    //   1695: l2i
    //   1696: ldc_w -2144674102
    //   1699: ixor
    //   1700: ldc2_w 196209892
    //   1703: l2i
    //   1704: ldc_w -1593095967
    //   1707: ixor
    //   1708: ixor
    //   1709: lookupswitch default -> 1736, -1278987063 -> 1692, -23245244 -> 2744
    //   1736: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   1739: getstatic Perryc.0 : I
    //   1742: ifle -> 1756
    //   1745: ldc2_w -1279673675
    //   1748: l2i
    //   1749: ldc_w -1157262697
    //   1752: ixor
    //   1753: goto -> 1764
    //   1756: ldc2_w 1284227842
    //   1759: l2i
    //   1760: ldc_w -699555225
    //   1763: ixor
    //   1764: ldc2_w -269969503
    //   1767: l2i
    //   1768: ldc_w 1711907589
    //   1771: ixor
    //   1772: ixor
    //   1773: lookupswitch default -> 1800, -2124604282 -> 2718, 1711307054 -> 1756
    //   1800: aload_0
    //   1801: ldc2_w -2087558993
    //   1804: l2i
    //   1805: ldc_w -2087558994
    //   1808: ixor
    //   1809: getstatic Perryc.c : I
    //   1812: iflt -> 1826
    //   1815: ldc2_w 99432720
    //   1818: l2i
    //   1819: ldc_w 1246100585
    //   1822: ixor
    //   1823: goto -> 1834
    //   1826: ldc2_w 464458223
    //   1829: l2i
    //   1830: ldc_w 2055124377
    //   1833: ixor
    //   1834: ldc2_w -2052930359
    //   1837: l2i
    //   1838: ldc_w -1395291550
    //   1841: ixor
    //   1842: ixor
    //   1843: lookupswitch default -> 1868, 1725926354 -> 2738, 1810224802 -> 1826
    //   1868: putfield mendingTakeOff : Z
    //   1871: getstatic Perryc.c : I
    //   1874: iflt -> 1888
    //   1877: ldc2_w 278075309
    //   1880: l2i
    //   1881: ldc_w 1409857160
    //   1884: ixor
    //   1885: goto -> 1896
    //   1888: ldc2_w -636175502
    //   1891: l2i
    //   1892: ldc_w 1440674009
    //   1895: ixor
    //   1896: ldc2_w -583703377
    //   1899: l2i
    //   1900: ldc_w -957906785
    //   1903: ixor
    //   1904: ixor
    //   1905: lookupswitch default -> 2770, -1810321509 -> 1932, 1598637333 -> 1888
    //   1932: aload_0
    //   1933: ldc2_w 213182509
    //   1936: l2i
    //   1937: ldc_w 213182510
    //   1940: ixor
    //   1941: getstatic Perryc.0 : I
    //   1944: ifle -> 1958
    //   1947: ldc2_w -1854734095
    //   1950: l2i
    //   1951: ldc_w -889746936
    //   1954: ixor
    //   1955: goto -> 1966
    //   1958: ldc2_w -1067965710
    //   1961: l2i
    //   1962: ldc_w -841149604
    //   1965: ixor
    //   1966: ldc2_w -294480280
    //   1969: l2i
    //   1970: ldc_w -733983611
    //   1973: ixor
    //   1974: ixor
    //   1975: lookupswitch default -> 2000, -2056700933 -> 1958, 1639338004 -> 2742
    //   2000: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2003: getstatic Perryc.1 : I
    //   2006: ifeq -> 2020
    //   2009: ldc2_w 1340485508
    //   2012: l2i
    //   2013: ldc_w 2092002538
    //   2016: ixor
    //   2017: goto -> 2028
    //   2020: ldc2_w 1559237613
    //   2023: l2i
    //   2024: ldc_w 1021309731
    //   2027: ixor
    //   2028: ldc2_w 949651253
    //   2031: l2i
    //   2032: ldc_w 596498531
    //   2035: ixor
    //   2036: ixor
    //   2037: lookupswitch default -> 2784, 675290168 -> 2020, 2067316632 -> 2064
    //   2064: putfield actions : Ljava/lang/Integer;
    //   2067: getstatic Perryc.1 : I
    //   2070: ifeq -> 2084
    //   2073: ldc2_w -1358355201
    //   2076: l2i
    //   2077: ldc_w -1616457798
    //   2080: ixor
    //   2081: goto -> 2092
    //   2084: ldc2_w 1261841568
    //   2087: l2i
    //   2088: ldc_w 531734810
    //   2091: ixor
    //   2092: ldc2_w 1758113170
    //   2095: l2i
    //   2096: ldc_w 131835652
    //   2099: ixor
    //   2100: ixor
    //   2101: lookupswitch default -> 2746, 999720748 -> 2128, 1606345171 -> 2084
    //   2128: aload_0
    //   2129: ldc2_w 1689732013
    //   2132: l2i
    //   2133: ldc_w 1689732012
    //   2136: ixor
    //   2137: getstatic Perryc.1 : I
    //   2140: ifeq -> 2154
    //   2143: ldc2_w -1009083100
    //   2146: l2i
    //   2147: ldc_w -1559927832
    //   2150: ixor
    //   2151: goto -> 2162
    //   2154: ldc2_w -2127950106
    //   2157: l2i
    //   2158: ldc_w 1548087586
    //   2161: ixor
    //   2162: ldc2_w -1132407466
    //   2165: l2i
    //   2166: ldc_w 1878004002
    //   2169: ixor
    //   2170: ixor
    //   2171: lookupswitch default -> 2750, -1280361800 -> 2154, 236927920 -> 2196
    //   2196: putfield curse : Z
    //   2199: getstatic Perryc.1 : I
    //   2202: ifeq -> 2216
    //   2205: ldc2_w 429945668
    //   2208: l2i
    //   2209: ldc_w -1938623770
    //   2212: ixor
    //   2213: goto -> 2224
    //   2216: ldc2_w -2025780637
    //   2219: l2i
    //   2220: ldc_w -104994073
    //   2223: ixor
    //   2224: ldc2_w -1482271175
    //   2227: l2i
    //   2228: ldc_w -260004347
    //   2231: ixor
    //   2232: ixor
    //   2233: lookupswitch default -> 2260, -1024167522 -> 2724, 1332483833 -> 2216
    //   2260: aload_0
    //   2261: ldc2_w -1825798755
    //   2264: l2i
    //   2265: ldc_w -1825798755
    //   2268: ixor
    //   2269: getstatic Perryc.c : I
    //   2272: iflt -> 2286
    //   2275: ldc2_w 1642520509
    //   2278: l2i
    //   2279: ldc_w 1051766290
    //   2282: ixor
    //   2283: goto -> 2294
    //   2286: ldc2_w -778974763
    //   2289: l2i
    //   2290: ldc_w 655201931
    //   2293: ixor
    //   2294: ldc2_w -1345944805
    //   2297: l2i
    //   2298: ldc_w -1432256302
    //   2301: ixor
    //   2302: ixor
    //   2303: lookupswitch default -> 2772, -201630569 -> 2328, 1513189990 -> 2286
    //   2328: putfield zprestigeproarmormanezmadcopennwhyuread : I
    //   2331: getstatic Perryc.0 : I
    //   2334: ifle -> 2348
    //   2337: ldc2_w -1683958473
    //   2340: l2i
    //   2341: ldc_w 1159074104
    //   2344: ixor
    //   2345: goto -> 2356
    //   2348: ldc2_w 2114010610
    //   2351: l2i
    //   2352: ldc_w 1938663338
    //   2355: ixor
    //   2356: ldc2_w 1001935213
    //   2359: l2i
    //   2360: ldc_w 1568246593
    //   2363: ixor
    //   2364: ixor
    //   2365: lookupswitch default -> 2392, -1200153053 -> 2728, 101941378 -> 2348
    //   2392: aload_0
    //   2393: new java/util/concurrent/ConcurrentLinkedQueue
    //   2396: dup
    //   2397: getstatic Perryc.1 : I
    //   2400: ifeq -> 2414
    //   2403: ldc2_w -1290083573
    //   2406: l2i
    //   2407: ldc_w -1977168306
    //   2410: ixor
    //   2411: goto -> 2422
    //   2414: ldc2_w 1299808981
    //   2417: l2i
    //   2418: ldc_w 1986354585
    //   2421: ixor
    //   2422: ldc2_w 783887223
    //   2425: l2i
    //   2426: ldc_w -601460384
    //   2429: ixor
    //   2430: ixor
    //   2431: lookupswitch default -> 2792, -914127525 -> 2456, -878479534 -> 2414
    //   2456: invokespecial <init> : ()V
    //   2459: getstatic Perryc.1 : I
    //   2462: ifeq -> 2476
    //   2465: ldc2_w 1642696596
    //   2468: l2i
    //   2469: ldc_w 1098917766
    //   2472: ixor
    //   2473: goto -> 2484
    //   2476: ldc2_w -896471016
    //   2479: l2i
    //   2480: ldc_w 1288285572
    //   2483: ixor
    //   2484: ldc2_w 1341165186
    //   2487: l2i
    //   2488: ldc_w -2066623474
    //   2491: ixor
    //   2492: ixor
    //   2493: lookupswitch default -> 2520, -1754790252 -> 2476, -347540834 -> 2748
    //   2520: putfield taskList : Ljava/util/Queue;
    //   2523: getstatic Perryc.0 : I
    //   2526: ifle -> 2540
    //   2529: ldc2_w 2037729389
    //   2532: l2i
    //   2533: ldc_w -1487170551
    //   2536: ixor
    //   2537: goto -> 2548
    //   2540: ldc2_w 1806703924
    //   2543: l2i
    //   2544: ldc_w 1557939373
    //   2547: ixor
    //   2548: ldc2_w 652186234
    //   2551: l2i
    //   2552: ldc_w 1628847673
    //   2555: ixor
    //   2556: ixor
    //   2557: lookupswitch default -> 2584, -1712885721 -> 2752, 1808491069 -> 2540
    //   2584: aload_0
    //   2585: new java/util/ArrayList
    //   2588: dup
    //   2589: getstatic Perryc.0 : I
    //   2592: ifle -> 2606
    //   2595: ldc2_w -464087775
    //   2598: l2i
    //   2599: ldc_w 484202208
    //   2602: ixor
    //   2603: goto -> 2614
    //   2606: ldc2_w -1070640955
    //   2609: l2i
    //   2610: ldc_w 709661713
    //   2613: ixor
    //   2614: ldc2_w 1184818281
    //   2617: l2i
    //   2618: ldc_w 1800366044
    //   2621: ixor
    //   2622: ixor
    //   2623: lookupswitch default -> 2730, -944617631 -> 2648, -715440012 -> 2606
    //   2648: invokespecial <init> : ()V
    //   2651: getstatic Perryc.c : I
    //   2654: iflt -> 2668
    //   2657: ldc2_w 1307124814
    //   2660: l2i
    //   2661: ldc_w -2052528307
    //   2664: ixor
    //   2665: goto -> 2676
    //   2668: ldc2_w -380632999
    //   2671: l2i
    //   2672: ldc_w 187184658
    //   2675: ixor
    //   2676: ldc2_w 1951056798
    //   2679: l2i
    //   2680: ldc_w 1391992558
    //   2683: ixor
    //   2684: ixor
    //   2685: lookupswitch default -> 2796, -993334469 -> 2712, -286056845 -> 2668
    //   2712: putfield doneSlots : Ljava/util/List;
    //   2715: return
    //   2716: aconst_null
    //   2717: athrow
    //   2718: aconst_null
    //   2719: athrow
    //   2720: aconst_null
    //   2721: athrow
    //   2722: aconst_null
    //   2723: athrow
    //   2724: aconst_null
    //   2725: athrow
    //   2726: aconst_null
    //   2727: athrow
    //   2728: aconst_null
    //   2729: athrow
    //   2730: aconst_null
    //   2731: athrow
    //   2732: aconst_null
    //   2733: athrow
    //   2734: aconst_null
    //   2735: athrow
    //   2736: aconst_null
    //   2737: athrow
    //   2738: aconst_null
    //   2739: athrow
    //   2740: aconst_null
    //   2741: athrow
    //   2742: aconst_null
    //   2743: athrow
    //   2744: aconst_null
    //   2745: athrow
    //   2746: aconst_null
    //   2747: athrow
    //   2748: aconst_null
    //   2749: athrow
    //   2750: aconst_null
    //   2751: athrow
    //   2752: aconst_null
    //   2753: athrow
    //   2754: aconst_null
    //   2755: athrow
    //   2756: aconst_null
    //   2757: athrow
    //   2758: aconst_null
    //   2759: athrow
    //   2760: aconst_null
    //   2761: athrow
    //   2762: aconst_null
    //   2763: athrow
    //   2764: aconst_null
    //   2765: athrow
    //   2766: aconst_null
    //   2767: athrow
    //   2768: aconst_null
    //   2769: athrow
    //   2770: aconst_null
    //   2771: athrow
    //   2772: aconst_null
    //   2773: athrow
    //   2774: aconst_null
    //   2775: athrow
    //   2776: aconst_null
    //   2777: athrow
    //   2778: aconst_null
    //   2779: athrow
    //   2780: aconst_null
    //   2781: athrow
    //   2782: aconst_null
    //   2783: athrow
    //   2784: aconst_null
    //   2785: athrow
    //   2786: aconst_null
    //   2787: athrow
    //   2788: aconst_null
    //   2789: athrow
    //   2790: aconst_null
    //   2791: athrow
    //   2792: aconst_null
    //   2793: athrow
    //   2794: aconst_null
    //   2795: athrow
    //   2796: aconst_null
    //   2797: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	2716	0	this	Lbigname/zprestige/webhack/features/modules/Player/ArmourMend;
  }
  
  public void onLogin() {
    Perry1.3m(this, (int)-1926972520L ^ 0xE8CD9C65);
  }
  
  public Map getInventorySlots(int current, int last) {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Player\ArmourMend.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */