package bigname.zprestige.webhack.features.modules.Player;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;

public class Burrow extends Module {
  public int oldSlot;
  
  public Setting<Integer> offset;
  
  public BlockPos originalPos;
  
  public Block returnBlock;
  
  public Setting<Boolean> rotate;
  
  public static Burrow INSTANCE;
  
  public EntityPlayer target;
  
  public Burrow() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 221235453
    //   9: l2i
    //   10: ldc 1527498000
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1427397431
    //   19: l2i
    //   20: ldc -1647075433
    //   22: ixor
    //   23: ldc2_w -1947299605
    //   26: l2i
    //   27: ldc 873239404
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1374464407 -> 16, -372896150 -> 1736
    //   56: aload_0
    //   57: ldc 'ァ㌆〃㶥뿷?'
    //   59: getstatic Perryc.c : I
    //   62: iflt -> 75
    //   65: ldc2_w -1172939485
    //   68: l2i
    //   69: ldc 804368912
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -190414536
    //   78: l2i
    //   79: ldc -273826932
    //   81: ixor
    //   82: ldc2_w -159824707
    //   85: l2i
    //   86: ldc -640538210
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 1738, -1169391088 -> 75, 882923415 -> 116
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc 'シ㌣。㷷뿡?๬䶖蹪行ਨ﷣煠枰귤输ꝭꋛ'
    //   121: getstatic Perryc.0 : I
    //   124: ifle -> 137
    //   127: ldc2_w 454102791
    //   130: l2i
    //   131: ldc -346170623
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w -387117111
    //   140: l2i
    //   141: ldc 2086403166
    //   143: ixor
    //   144: ldc2_w 796723900
    //   147: l2i
    //   148: ldc 1751656230
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 180, -1218840164 -> 1760, -562497973 -> 137
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.1 : I
    //   186: ifeq -> 199
    //   189: ldc2_w 28851635
    //   192: l2i
    //   193: ldc -399255251
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w 693093915
    //   202: l2i
    //   203: ldc -1664450915
    //   205: ixor
    //   206: ldc2_w 825388410
    //   209: l2i
    //   210: ldc 885890900
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 1752, -1334162776 -> 240, -327936336 -> 199
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.PLAYER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w -242734806
    //   246: l2i
    //   247: ldc -242734805
    //   249: ixor
    //   250: ldc2_w 1078004828
    //   253: l2i
    //   254: ldc 1078004828
    //   256: ixor
    //   257: ldc2_w 532090598
    //   260: l2i
    //   261: ldc 532090598
    //   263: ixor
    //   264: getstatic Perryc.c : I
    //   267: iflt -> 280
    //   270: ldc2_w 1583111448
    //   273: l2i
    //   274: ldc -2043038053
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w -1796370041
    //   283: l2i
    //   284: ldc -504156459
    //   286: ixor
    //   287: ldc2_w 119750905
    //   290: l2i
    //   291: ldc -1675923184
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 1768, -299462981 -> 320, 1130224234 -> 280
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.1 : I
    //   326: ifeq -> 339
    //   329: ldc2_w -1733477139
    //   332: l2i
    //   333: ldc -1022238478
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w -1933433137
    //   342: l2i
    //   343: ldc 419334286
    //   345: ixor
    //   346: ldc2_w -1483852672
    //   349: l2i
    //   350: ldc -460691748
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 380, -1890920061 -> 339, 414748227 -> 1772
    //   380: aload_0
    //   381: getstatic Perryc.0 : I
    //   384: ifle -> 397
    //   387: ldc2_w 705935664
    //   390: l2i
    //   391: ldc 243444603
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w 535059339
    //   400: l2i
    //   401: ldc 381320808
    //   403: ixor
    //   404: ldc2_w 1265096652
    //   407: l2i
    //   408: ldc 231533679
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 1740, 1341464128 -> 440, 1647978984 -> 397
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc 'ガ㌕〗㶤뿽?'
    //   447: getstatic Perryc.c : I
    //   450: iflt -> 463
    //   453: ldc2_w 1051702857
    //   456: l2i
    //   457: ldc -608983994
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w 1530521678
    //   466: l2i
    //   467: ldc -1074256895
    //   469: ixor
    //   470: ldc2_w -790027571
    //   473: l2i
    //   474: ldc -2096383595
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 1762, -1224832681 -> 463, -1222420713 -> 504
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc2_w 1399707921
    //   510: l2i
    //   511: ldc 1399707922
    //   513: ixor
    //   514: getstatic Perryc.1 : I
    //   517: ifeq -> 530
    //   520: ldc2_w 78083040
    //   523: l2i
    //   524: ldc 1849327515
    //   526: ixor
    //   527: goto -> 537
    //   530: ldc2_w -580700919
    //   533: l2i
    //   534: ldc 684923232
    //   536: ixor
    //   537: ldc2_w 579114933
    //   540: l2i
    //   541: ldc 311566445
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 1732, -978936911 -> 572, 1519106979 -> 530
    //   572: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   575: ldc2_w 886211386
    //   578: l2i
    //   579: ldc -886211391
    //   581: ixor
    //   582: getstatic Perryc.1 : I
    //   585: ifeq -> 598
    //   588: ldc2_w 1720606362
    //   591: l2i
    //   592: ldc -678162164
    //   594: ixor
    //   595: goto -> 605
    //   598: ldc2_w 1693696639
    //   601: l2i
    //   602: ldc 1502306071
    //   604: ixor
    //   605: ldc2_w -1514037673
    //   608: l2i
    //   609: ldc 915387571
    //   611: ixor
    //   612: ixor
    //   613: lookupswitch default -> 1748, -1372145780 -> 640, 575956338 -> 598
    //   640: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   643: ldc2_w -1704737878
    //   646: l2i
    //   647: ldc -1704737873
    //   649: ixor
    //   650: getstatic Perryc.c : I
    //   653: iflt -> 666
    //   656: ldc2_w -1868070801
    //   659: l2i
    //   660: ldc -1931255227
    //   662: ixor
    //   663: goto -> 673
    //   666: ldc2_w 1341033657
    //   669: l2i
    //   670: ldc -1516036204
    //   672: ixor
    //   673: ldc2_w 2096303482
    //   676: l2i
    //   677: ldc -1297698635
    //   679: ixor
    //   680: ixor
    //   681: lookupswitch default -> 708, -770613275 -> 1758, 1449842299 -> 666
    //   708: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   711: getstatic Perryc.1 : I
    //   714: ifeq -> 727
    //   717: ldc2_w -689861136
    //   720: l2i
    //   721: ldc 1176502557
    //   723: ixor
    //   724: goto -> 734
    //   727: ldc2_w -891809786
    //   730: l2i
    //   731: ldc -1913174938
    //   733: ixor
    //   734: ldc2_w -1554540577
    //   737: l2i
    //   738: ldc 454090040
    //   740: ixor
    //   741: ixor
    //   742: lookupswitch default -> 1766, -9953657 -> 768, 679921162 -> 727
    //   768: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   771: getstatic Perryc.c : I
    //   774: iflt -> 787
    //   777: ldc2_w 93494037
    //   780: l2i
    //   781: ldc -1608692021
    //   783: ixor
    //   784: goto -> 794
    //   787: ldc2_w 42184120
    //   790: l2i
    //   791: ldc 1765066588
    //   793: ixor
    //   794: ldc2_w -271458170
    //   797: l2i
    //   798: ldc 1244060873
    //   800: ixor
    //   801: ixor
    //   802: lookupswitch default -> 828, -2085099723 -> 787, 7924113 -> 1750
    //   828: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   831: getstatic Perryc.c : I
    //   834: iflt -> 847
    //   837: ldc2_w 327190699
    //   840: l2i
    //   841: ldc 1757532524
    //   843: ixor
    //   844: goto -> 854
    //   847: ldc2_w 736510386
    //   850: l2i
    //   851: ldc -294017517
    //   853: ixor
    //   854: ldc2_w -1610746741
    //   857: l2i
    //   858: ldc 2119668097
    //   860: ixor
    //   861: ixor
    //   862: lookupswitch default -> 1754, -1695859507 -> 847, 607486635 -> 888
    //   888: putfield offset : Lbigname/zprestige/webhack/features/setting/Setting;
    //   891: getstatic Perryc.0 : I
    //   894: ifle -> 907
    //   897: ldc2_w 1078398045
    //   900: l2i
    //   901: ldc 621997680
    //   903: ixor
    //   904: goto -> 914
    //   907: ldc2_w 1167510983
    //   910: l2i
    //   911: ldc 671079189
    //   913: ixor
    //   914: ldc2_w -1504394016
    //   917: l2i
    //   918: ldc 1981046323
    //   920: ixor
    //   921: ixor
    //   922: lookupswitch default -> 948, -2077134844 -> 907, -1256883970 -> 1746
    //   948: aload_0
    //   949: getstatic Perryc.c : I
    //   952: iflt -> 965
    //   955: ldc2_w 2125507134
    //   958: l2i
    //   959: ldc 376079111
    //   961: ixor
    //   962: goto -> 972
    //   965: ldc2_w 1502266916
    //   968: l2i
    //   969: ldc 619607477
    //   971: ixor
    //   972: ldc2_w 1205011232
    //   975: l2i
    //   976: ldc -30325139
    //   978: ixor
    //   979: ixor
    //   980: lookupswitch default -> 1742, -997787940 -> 1008, -784831372 -> 965
    //   1008: aload_0
    //   1009: new bigname/zprestige/webhack/features/setting/Setting
    //   1012: dup
    //   1013: ldc 'ケ㌜々㶶뿬?'
    //   1015: getstatic Perryc.c : I
    //   1018: iflt -> 1031
    //   1021: ldc2_w -122054060
    //   1024: l2i
    //   1025: ldc 1082948294
    //   1027: ixor
    //   1028: goto -> 1038
    //   1031: ldc2_w -1840739538
    //   1034: l2i
    //   1035: ldc 1332762493
    //   1037: ixor
    //   1038: ldc2_w -195790186
    //   1041: l2i
    //   1042: ldc 1599313302
    //   1044: ixor
    //   1045: ixor
    //   1046: lookupswitch default -> 1072, -1677375310 -> 1031, 322047890 -> 1744
    //   1072: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1075: ldc2_w 1885102479
    //   1078: l2i
    //   1079: ldc 1885102479
    //   1081: ixor
    //   1082: getstatic Perryc.1 : I
    //   1085: ifeq -> 1098
    //   1088: ldc2_w -1346172551
    //   1091: l2i
    //   1092: ldc -768426485
    //   1094: ixor
    //   1095: goto -> 1105
    //   1098: ldc2_w 1533433048
    //   1101: l2i
    //   1102: ldc 80496311
    //   1104: ixor
    //   1105: ldc2_w -1932125598
    //   1108: l2i
    //   1109: ldc -127389359
    //   1111: ixor
    //   1112: ixor
    //   1113: lookupswitch default -> 1140, -1802505451 -> 1098, 156212289 -> 1756
    //   1140: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1143: getstatic Perryc.c : I
    //   1146: iflt -> 1160
    //   1149: ldc2_w 7013993
    //   1152: l2i
    //   1153: ldc_w 603348303
    //   1156: ixor
    //   1157: goto -> 1168
    //   1160: ldc2_w -1070402146
    //   1163: l2i
    //   1164: ldc_w -949076459
    //   1167: ixor
    //   1168: ldc2_w -2090740931
    //   1171: l2i
    //   1172: ldc_w -51068390
    //   1175: ixor
    //   1176: ixor
    //   1177: lookupswitch default -> 1204, 1123046440 -> 1160, 1544047105 -> 1728
    //   1204: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1207: getstatic Perryc.0 : I
    //   1210: ifle -> 1224
    //   1213: ldc2_w 940178330
    //   1216: l2i
    //   1217: ldc_w -1461838185
    //   1220: ixor
    //   1221: goto -> 1232
    //   1224: ldc2_w -316228652
    //   1227: l2i
    //   1228: ldc_w 663424161
    //   1231: ixor
    //   1232: ldc2_w 1520338209
    //   1235: l2i
    //   1236: ldc_w -814035626
    //   1239: ixor
    //   1240: ixor
    //   1241: lookupswitch default -> 1720, 87272826 -> 1224, 1598684930 -> 1268
    //   1268: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1271: getstatic Perryc.0 : I
    //   1274: ifle -> 1288
    //   1277: ldc2_w 248801764
    //   1280: l2i
    //   1281: ldc_w 1227207645
    //   1284: ixor
    //   1285: goto -> 1296
    //   1288: ldc2_w 459605855
    //   1291: l2i
    //   1292: ldc_w -1940835706
    //   1295: ixor
    //   1296: ldc2_w -2133355848
    //   1299: l2i
    //   1300: ldc_w 819490138
    //   1303: ixor
    //   1304: ixor
    //   1305: lookupswitch default -> 1770, -134339109 -> 1288, 658229819 -> 1332
    //   1332: putfield rotate : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1335: getstatic Perryc.c : I
    //   1338: iflt -> 1352
    //   1341: ldc2_w 1666430978
    //   1344: l2i
    //   1345: ldc_w 538845770
    //   1348: ixor
    //   1349: goto -> 1360
    //   1352: ldc2_w 627521712
    //   1355: l2i
    //   1356: ldc_w 1409887048
    //   1359: ixor
    //   1360: ldc2_w 1556984886
    //   1363: l2i
    //   1364: ldc_w 1272800127
    //   1367: ixor
    //   1368: ixor
    //   1369: lookupswitch default -> 1396, 1415400705 -> 1734, 2129294641 -> 1352
    //   1396: aload_0
    //   1397: getstatic Perryc.1 : I
    //   1400: ifeq -> 1414
    //   1403: ldc2_w 743710622
    //   1406: l2i
    //   1407: ldc_w 469512363
    //   1410: ixor
    //   1411: goto -> 1422
    //   1414: ldc2_w -872948690
    //   1417: l2i
    //   1418: ldc_w 706440856
    //   1421: ixor
    //   1422: ldc2_w -1928444648
    //   1425: l2i
    //   1426: ldc_w -312912029
    //   1429: ixor
    //   1430: ixor
    //   1431: lookupswitch default -> 1724, -2118410035 -> 1456, 1476345166 -> 1414
    //   1456: invokespecial setInstance : ()V
    //   1459: getstatic Perryc.c : I
    //   1462: iflt -> 1476
    //   1465: ldc2_w 401085687
    //   1468: l2i
    //   1469: ldc_w -1146351770
    //   1472: ixor
    //   1473: goto -> 1484
    //   1476: ldc2_w -348041517
    //   1479: l2i
    //   1480: ldc_w -1299345228
    //   1483: ixor
    //   1484: ldc2_w -1597070953
    //   1487: l2i
    //   1488: ldc_w 1135561173
    //   1491: ixor
    //   1492: ixor
    //   1493: lookupswitch default -> 1764, -1163053531 -> 1520, 1327887315 -> 1476
    //   1520: aload_0
    //   1521: ldc2_w -1705246173
    //   1524: l2i
    //   1525: ldc_w 1705246172
    //   1528: ixor
    //   1529: getstatic Perryc.c : I
    //   1532: iflt -> 1546
    //   1535: ldc2_w 1302376294
    //   1538: l2i
    //   1539: ldc_w 1571737803
    //   1542: ixor
    //   1543: goto -> 1554
    //   1546: ldc2_w -1137183421
    //   1549: l2i
    //   1550: ldc_w 1198222879
    //   1553: ixor
    //   1554: ldc2_w -64906485
    //   1557: l2i
    //   1558: ldc_w -746662160
    //   1561: ixor
    //   1562: ixor
    //   1563: lookupswitch default -> 1588, -1955016867 -> 1546, 1062285910 -> 1722
    //   1588: putfield oldSlot : I
    //   1591: getstatic Perryc.1 : I
    //   1594: ifeq -> 1608
    //   1597: ldc2_w -1742895759
    //   1600: l2i
    //   1601: ldc_w -466201866
    //   1604: ixor
    //   1605: goto -> 1616
    //   1608: ldc2_w 1363769430
    //   1611: l2i
    //   1612: ldc_w -2068045278
    //   1615: ixor
    //   1616: ldc2_w 1279267759
    //   1619: l2i
    //   1620: ldc_w 1668565544
    //   1623: ixor
    //   1624: ixor
    //   1625: lookupswitch default -> 1726, -88013837 -> 1652, 1394576896 -> 1608
    //   1652: aload_0
    //   1653: aconst_null
    //   1654: getstatic Perryc.1 : I
    //   1657: ifeq -> 1671
    //   1660: ldc2_w -683502878
    //   1663: l2i
    //   1664: ldc_w -1687896910
    //   1667: ixor
    //   1668: goto -> 1679
    //   1671: ldc2_w -2092063206
    //   1674: l2i
    //   1675: ldc_w 692912483
    //   1678: ixor
    //   1679: ldc2_w 931763014
    //   1682: l2i
    //   1683: ldc_w 1747842574
    //   1686: ixor
    //   1687: ixor
    //   1688: lookupswitch default -> 1730, -173751759 -> 1716, 327306008 -> 1671
    //   1716: putfield returnBlock : Lnet/minecraft/block/Block;
    //   1719: return
    //   1720: aconst_null
    //   1721: athrow
    //   1722: aconst_null
    //   1723: athrow
    //   1724: aconst_null
    //   1725: athrow
    //   1726: aconst_null
    //   1727: athrow
    //   1728: aconst_null
    //   1729: athrow
    //   1730: aconst_null
    //   1731: athrow
    //   1732: aconst_null
    //   1733: athrow
    //   1734: aconst_null
    //   1735: athrow
    //   1736: aconst_null
    //   1737: athrow
    //   1738: aconst_null
    //   1739: athrow
    //   1740: aconst_null
    //   1741: athrow
    //   1742: aconst_null
    //   1743: athrow
    //   1744: aconst_null
    //   1745: athrow
    //   1746: aconst_null
    //   1747: athrow
    //   1748: aconst_null
    //   1749: athrow
    //   1750: aconst_null
    //   1751: athrow
    //   1752: aconst_null
    //   1753: athrow
    //   1754: aconst_null
    //   1755: athrow
    //   1756: aconst_null
    //   1757: athrow
    //   1758: aconst_null
    //   1759: athrow
    //   1760: aconst_null
    //   1761: athrow
    //   1762: aconst_null
    //   1763: athrow
    //   1764: aconst_null
    //   1765: athrow
    //   1766: aconst_null
    //   1767: athrow
    //   1768: aconst_null
    //   1769: athrow
    //   1770: aconst_null
    //   1771: athrow
    //   1772: aconst_null
    //   1773: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1720	0	this	Lbigname/zprestige/webhack/features/modules/Player/Burrow;
  }
  
  public void setInstance() {
    Perry1.3B(this, (int)-1996981821L ^ 0xF91B4CAE);
  }
  
  public static Burrow getInstance() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 377
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 369
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 361
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -351493090
    //   33: l2i
    //   34: ldc_w 1742668021
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1723751063
    //   44: l2i
    //   45: ldc_w 1237470961
    //   48: ixor
    //   49: ldc2_w -1880933741
    //   52: l2i
    //   53: ldc_w 1514510923
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 346, 86330176 -> 84, 1500841011 -> 41
    //   84: getstatic bigname/zprestige/webhack/features/modules/Player/Burrow.INSTANCE : Lbigname/zprestige/webhack/features/modules/Player/Burrow;
    //   87: ifnonnull -> 101
    //   90: ldc2_w -518770110
    //   93: l2i
    //   94: ldc_w 2097535494
    //   97: ixor
    //   98: goto -> 109
    //   101: ldc2_w -625160207
    //   104: l2i
    //   105: ldc_w 1185753010
    //   108: ixor
    //   109: ldc2_w -1508344445
    //   112: l2i
    //   113: ldc_w 1287511012
    //   116: ixor
    //   117: ixor
    //   118: tableswitch default -> 90, 1991527971 -> 140, 1991527972 -> 279
    //   140: new bigname/zprestige/webhack/features/modules/Player/Burrow
    //   143: dup
    //   144: getstatic Perryc.1 : I
    //   147: ifeq -> 161
    //   150: ldc2_w 2098607628
    //   153: l2i
    //   154: ldc_w -134241546
    //   157: ixor
    //   158: goto -> 169
    //   161: ldc2_w -2098811000
    //   164: l2i
    //   165: ldc_w 430930460
    //   168: ixor
    //   169: ldc2_w -1486549156
    //   172: l2i
    //   173: ldc_w 874267889
    //   176: ixor
    //   177: ixor
    //   178: lookupswitch default -> 348, 137403961 -> 204, 428924759 -> 161
    //   204: goto -> 208
    //   207: athrow
    //   208: invokespecial <init> : ()V
    //   211: goto -> 215
    //   214: athrow
    //   215: getstatic Perryc.c : I
    //   218: iflt -> 232
    //   221: ldc2_w 60682972
    //   224: l2i
    //   225: ldc_w 824230382
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w -1741769472
    //   235: l2i
    //   236: ldc_w 474171525
    //   239: ixor
    //   240: ldc2_w -64659698
    //   243: l2i
    //   244: ldc_w -1030998938
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 350, -1161521427 -> 276, 202659930 -> 232
    //   276: putstatic bigname/zprestige/webhack/features/modules/Player/Burrow.INSTANCE : Lbigname/zprestige/webhack/features/modules/Player/Burrow;
    //   279: getstatic Perryc.1 : I
    //   282: ifeq -> 296
    //   285: ldc2_w 1614520746
    //   288: l2i
    //   289: ldc_w -532713684
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w 508168673
    //   299: l2i
    //   300: ldc_w -1889285482
    //   303: ixor
    //   304: ldc2_w 830728318
    //   307: l2i
    //   308: ldc_w -1181902043
    //   311: ixor
    //   312: ixor
    //   313: lookupswitch default -> 340, -295597786 -> 296, 134921693 -> 344
    //   340: getstatic bigname/zprestige/webhack/features/modules/Player/Burrow.INSTANCE : Lbigname/zprestige/webhack/features/modules/Player/Burrow;
    //   343: areturn
    //   344: aconst_null
    //   345: athrow
    //   346: aconst_null
    //   347: athrow
    //   348: aconst_null
    //   349: athrow
    //   350: aconst_null
    //   351: athrow
    //   352: pop
    //   353: goto -> 24
    //   356: pop
    //   357: aconst_null
    //   358: goto -> 352
    //   361: dup
    //   362: ifnull -> 352
    //   365: checkcast java/lang/Throwable
    //   368: athrow
    //   369: dup
    //   370: ifnull -> 356
    //   373: checkcast java/lang/Throwable
    //   376: athrow
    //   377: aconst_null
    //   378: athrow
    // Exception table:
    //   from	to	target	type
    //   8	20	361	java/lang/NegativeArraySizeException
    //   208	214	214	finally
    //   208	214	3	finally
    //   208	214	3	finally
    //   208	214	214	java/lang/AssertionError
    //   208	214	214	java/lang/AssertionError
    //   361	369	361	java/lang/IllegalArgumentException
    //   377	379	3	java/lang/AssertionError
  }
  
  public void onEnable() {
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
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Player/Burrow
    //   3: dup
    //   4: getstatic Perryc.c : I
    //   7: iflt -> 21
    //   10: ldc2_w -1748658006
    //   13: l2i
    //   14: ldc_w 444333132
    //   17: ixor
    //   18: goto -> 29
    //   21: ldc2_w 636647220
    //   24: l2i
    //   25: ldc_w 848443491
    //   28: ixor
    //   29: ldc2_w 1132537256
    //   32: l2i
    //   33: ldc_w -51319138
    //   36: ixor
    //   37: ixor
    //   38: lookupswitch default -> 64, -831513421 -> 21, 852471760 -> 134
    //   64: invokespecial <init> : ()V
    //   67: getstatic Perryc.c : I
    //   70: iflt -> 84
    //   73: ldc2_w -1191198494
    //   76: l2i
    //   77: ldc_w -202729349
    //   80: ixor
    //   81: goto -> 92
    //   84: ldc2_w -1909387691
    //   87: l2i
    //   88: ldc_w 1831111381
    //   91: ixor
    //   92: ldc2_w -1012757528
    //   95: l2i
    //   96: ldc_w 1283863562
    //   99: ixor
    //   100: ixor
    //   101: lookupswitch default -> 128, -1003362437 -> 132, -472743666 -> 84
    //   128: putstatic bigname/zprestige/webhack/features/modules/Player/Burrow.INSTANCE : Lbigname/zprestige/webhack/features/modules/Player/Burrow;
    //   131: return
    //   132: aconst_null
    //   133: athrow
    //   134: aconst_null
    //   135: athrow
  }
  
  public void onUpdate() {
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
  
  public boolean intersectsWithEntity(BlockPos pos) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Player\Burrow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */