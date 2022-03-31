package bigname.zprestige.webhack.manager;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.Feature;
import java.util.HashMap;
import net.minecraft.entity.player.EntityPlayer;

public class SpeedManager extends Feature {
  public HashMap<EntityPlayer, Double> playerSpeeds;
  
  public double jumpSpeedChanged;
  
  public int distancer;
  
  public static double LAST_JUMP_INFO_DURATION_DEFAULT;
  
  public double percentJumpSpeedChanged;
  
  public double lastJumpSpeed;
  
  public long jumpInfoStartTime;
  
  public static boolean isJumping;
  
  public double speedometerCurrentSpeed;
  
  public boolean didJumpLastTick;
  
  public static boolean didJumpThisTick;
  
  public double firstJumpSpeed;
  
  public boolean wasFirstJump;
  
  public double getSpeedKpH() {
    return Perry1.2C(this, (int)-1375253243L ^ 0xB95453DA);
  }
  
  public void updatePlayers() {
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
  
  public double turnIntoKpH(double paramDouble) {
    return Perry1.1r(this, (int)1706336807L ^ 0x39E9B49F, paramDouble);
  }
  
  public void updateValues() {
    Perry1.3y(this, (int)-231331096L ^ 0x87B21CE3);
  }
  
  public double getSpeedMpS() {
    return Perry1.2C(this, (int)-100780193L ^ 0xEEAD2981);
  }
  
  public float lastJumpInfoTimeRemaining() {
    return Perry1.2N(this, (int)-2074618802L ^ 0xF0B56A14);
  }
  
  public SpeedManager() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w 733647727
    //   9: l2i
    //   10: ldc_w 1060568459
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 687902819
    //   20: l2i
    //   21: ldc_w 121489531
    //   24: ixor
    //   25: ldc2_w 1474262380
    //   28: l2i
    //   29: ldc_w -1223916315
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -195059859 -> 1706, -76864716 -> 17
    //   60: aload_0
    //   61: ldc2_w 23230284
    //   64: l2i
    //   65: ldc_w 23230296
    //   68: ixor
    //   69: getstatic Perryc.0 : I
    //   72: ifle -> 86
    //   75: ldc2_w -1650304405
    //   78: l2i
    //   79: ldc_w 999551116
    //   82: ixor
    //   83: goto -> 94
    //   86: ldc2_w 1786253928
    //   89: l2i
    //   90: ldc_w -51987519
    //   93: ixor
    //   94: ldc2_w 409087316
    //   97: l2i
    //   98: ldc_w -154424157
    //   101: ixor
    //   102: ixor
    //   103: lookupswitch default -> 1688, 1217932048 -> 86, 2016880734 -> 128
    //   128: putfield distancer : I
    //   131: getstatic Perryc.0 : I
    //   134: ifle -> 148
    //   137: ldc2_w -1110893745
    //   140: l2i
    //   141: ldc_w 327156014
    //   144: ixor
    //   145: goto -> 156
    //   148: ldc2_w -986389213
    //   151: l2i
    //   152: ldc_w -1925402964
    //   155: ixor
    //   156: ldc2_w 1529332704
    //   159: l2i
    //   160: ldc_w 1941705058
    //   163: ixor
    //   164: ixor
    //   165: lookupswitch default -> 1692, -2033006365 -> 148, 1620285709 -> 192
    //   192: aload_0
    //   193: getstatic Perryc.1 : I
    //   196: ifeq -> 210
    //   199: ldc2_w 575543596
    //   202: l2i
    //   203: ldc_w 1614473597
    //   206: ixor
    //   207: goto -> 218
    //   210: ldc2_w -488693761
    //   213: l2i
    //   214: ldc_w -1907021806
    //   217: ixor
    //   218: ldc2_w 1674110053
    //   221: l2i
    //   222: ldc_w -786457130
    //   225: ixor
    //   226: ixor
    //   227: lookupswitch default -> 252, -257717790 -> 1678, 1482483999 -> 210
    //   252: invokespecial <init> : ()V
    //   255: getstatic Perryc.0 : I
    //   258: ifle -> 272
    //   261: ldc2_w -1255973365
    //   264: l2i
    //   265: ldc_w -2061008508
    //   268: ixor
    //   269: goto -> 280
    //   272: ldc2_w 1957599654
    //   275: l2i
    //   276: ldc_w 343565690
    //   279: ixor
    //   280: ldc2_w -1782010490
    //   283: l2i
    //   284: ldc_w -1337658728
    //   287: ixor
    //   288: ixor
    //   289: lookupswitch default -> 1720, 361267345 -> 272, 1163436994 -> 316
    //   316: aload_0
    //   317: ldc2_w 171035655
    //   320: l2i
    //   321: ldc_w 171035667
    //   324: ixor
    //   325: getstatic Perryc.1 : I
    //   328: ifeq -> 342
    //   331: ldc2_w 1135224674
    //   334: l2i
    //   335: ldc_w 653043240
    //   338: ixor
    //   339: goto -> 350
    //   342: ldc2_w 425730619
    //   345: l2i
    //   346: ldc_w -61766102
    //   349: ixor
    //   350: ldc2_w -1919493811
    //   353: l2i
    //   354: ldc_w 1608952114
    //   357: ixor
    //   358: ixor
    //   359: lookupswitch default -> 384, -1913016098 -> 342, -1221136075 -> 1680
    //   384: putfield distancer : I
    //   387: getstatic Perryc.1 : I
    //   390: ifeq -> 404
    //   393: ldc2_w 948101206
    //   396: l2i
    //   397: ldc_w 1318598796
    //   400: ixor
    //   401: goto -> 412
    //   404: ldc2_w 943945904
    //   407: l2i
    //   408: ldc_w -69874788
    //   411: ixor
    //   412: ldc2_w -1777175005
    //   415: l2i
    //   416: ldc_w -75865235
    //   419: ixor
    //   420: ixor
    //   421: lookupswitch default -> 1698, -1359042974 -> 448, 460508564 -> 404
    //   448: aload_0
    //   449: ldc2_w 1.5519973885808162E308
    //   452: invokestatic doubleToLongBits : (D)J
    //   455: ldc2_w 9217637398125189877
    //   458: lxor
    //   459: invokestatic longBitsToDouble : (J)D
    //   462: getstatic Perryc.0 : I
    //   465: ifle -> 479
    //   468: ldc2_w 1348007563
    //   471: l2i
    //   472: ldc_w -1439534145
    //   475: ixor
    //   476: goto -> 487
    //   479: ldc2_w 174916168
    //   482: l2i
    //   483: ldc_w 1284921706
    //   486: ixor
    //   487: ldc2_w -1776678593
    //   490: l2i
    //   491: ldc_w -318976937
    //   494: ixor
    //   495: ixor
    //   496: lookupswitch default -> 524, -2138292132 -> 1710, 1622116840 -> 479
    //   524: putfield firstJumpSpeed : D
    //   527: getstatic Perryc.0 : I
    //   530: ifle -> 544
    //   533: ldc2_w 1045178740
    //   536: l2i
    //   537: ldc_w -1380907587
    //   540: ixor
    //   541: goto -> 552
    //   544: ldc2_w 210329522
    //   547: l2i
    //   548: ldc_w 1043834079
    //   551: ixor
    //   552: ldc2_w -1815690560
    //   555: l2i
    //   556: ldc_w 112363392
    //   559: ixor
    //   560: ixor
    //   561: lookupswitch default -> 1694, -1479885267 -> 588, 109668745 -> 544
    //   588: aload_0
    //   589: ldc2_w 1.7473492371907772E308
    //   592: invokestatic doubleToLongBits : (D)J
    //   595: ldc2_w 9218616193110323244
    //   598: lxor
    //   599: invokestatic longBitsToDouble : (J)D
    //   602: getstatic Perryc.0 : I
    //   605: ifle -> 619
    //   608: ldc2_w -200673747
    //   611: l2i
    //   612: ldc_w -1793047789
    //   615: ixor
    //   616: goto -> 627
    //   619: ldc2_w -492160086
    //   622: l2i
    //   623: ldc_w -1688065608
    //   626: ixor
    //   627: ldc2_w -442203609
    //   630: l2i
    //   631: ldc_w 954941409
    //   634: ixor
    //   635: ixor
    //   636: lookupswitch default -> 1724, -1534611500 -> 664, -1134163720 -> 619
    //   664: putfield lastJumpSpeed : D
    //   667: getstatic Perryc.c : I
    //   670: iflt -> 684
    //   673: ldc2_w 2111395603
    //   676: l2i
    //   677: ldc_w -689049783
    //   680: ixor
    //   681: goto -> 692
    //   684: ldc2_w -1929955459
    //   687: l2i
    //   688: ldc_w -1414327982
    //   691: ixor
    //   692: ldc2_w -1276354342
    //   695: l2i
    //   696: ldc_w -1754324780
    //   699: ixor
    //   700: ixor
    //   701: lookupswitch default -> 1708, -1883768748 -> 684, 63399457 -> 728
    //   728: aload_0
    //   729: ldc2_w 6.847900206733018E307
    //   732: invokestatic doubleToLongBits : (D)J
    //   735: ldc2_w 9212219810808710433
    //   738: lxor
    //   739: invokestatic longBitsToDouble : (J)D
    //   742: getstatic Perryc.0 : I
    //   745: ifle -> 759
    //   748: ldc2_w 612599827
    //   751: l2i
    //   752: ldc_w 464135768
    //   755: ixor
    //   756: goto -> 767
    //   759: ldc2_w -1432842952
    //   762: l2i
    //   763: ldc_w 965841194
    //   766: ixor
    //   767: ldc2_w -243605235
    //   770: l2i
    //   771: ldc_w -620187839
    //   774: ixor
    //   775: ixor
    //   776: lookupswitch default -> 804, -1717765211 -> 759, 358342663 -> 1686
    //   804: putfield percentJumpSpeedChanged : D
    //   807: getstatic Perryc.1 : I
    //   810: ifeq -> 824
    //   813: ldc2_w 613072691
    //   816: l2i
    //   817: ldc_w -506776226
    //   820: ixor
    //   821: goto -> 832
    //   824: ldc2_w -568927446
    //   827: l2i
    //   828: ldc_w 1563353793
    //   831: ixor
    //   832: ldc2_w -1948426522
    //   835: l2i
    //   836: ldc_w -830270626
    //   839: ixor
    //   840: ixor
    //   841: lookupswitch default -> 868, -2145400875 -> 1716, -2005603675 -> 824
    //   868: aload_0
    //   869: ldc2_w 1.789368880819564E308
    //   872: invokestatic doubleToLongBits : (D)J
    //   875: ldc2_w 9218826729210972412
    //   878: lxor
    //   879: invokestatic longBitsToDouble : (J)D
    //   882: getstatic Perryc.c : I
    //   885: iflt -> 899
    //   888: ldc2_w -1386367494
    //   891: l2i
    //   892: ldc_w -234998474
    //   895: ixor
    //   896: goto -> 907
    //   899: ldc2_w 1202864301
    //   902: l2i
    //   903: ldc_w -2145299172
    //   906: ixor
    //   907: ldc2_w -1314743441
    //   910: l2i
    //   911: ldc_w 331291461
    //   914: ixor
    //   915: ixor
    //   916: lookupswitch default -> 1712, -21102362 -> 899, 1703843227 -> 944
    //   944: putfield jumpSpeedChanged : D
    //   947: getstatic Perryc.0 : I
    //   950: ifle -> 964
    //   953: ldc2_w -492107317
    //   956: l2i
    //   957: ldc_w 1958611782
    //   960: ixor
    //   961: goto -> 972
    //   964: ldc2_w 1968503916
    //   967: l2i
    //   968: ldc_w 1065606809
    //   971: ixor
    //   972: ldc2_w -1822262333
    //   975: l2i
    //   976: ldc_w 1317788157
    //   979: ixor
    //   980: ixor
    //   981: lookupswitch default -> 1008, -764654769 -> 964, 1274847411 -> 1682
    //   1008: aload_0
    //   1009: ldc2_w -1590955112
    //   1012: l2i
    //   1013: ldc_w -1590955112
    //   1016: ixor
    //   1017: getstatic Perryc.c : I
    //   1020: iflt -> 1034
    //   1023: ldc2_w -573872929
    //   1026: l2i
    //   1027: ldc_w -422405009
    //   1030: ixor
    //   1031: goto -> 1042
    //   1034: ldc2_w -1017942746
    //   1037: l2i
    //   1038: ldc_w -832615273
    //   1041: ixor
    //   1042: ldc2_w 242828150
    //   1045: l2i
    //   1046: ldc_w -130130915
    //   1049: ixor
    //   1050: ixor
    //   1051: lookupswitch default -> 1700, -849418277 -> 1034, -78954790 -> 1076
    //   1076: putfield didJumpLastTick : Z
    //   1079: getstatic Perryc.1 : I
    //   1082: ifeq -> 1096
    //   1085: ldc2_w -512136089
    //   1088: l2i
    //   1089: ldc_w 2095782564
    //   1092: ixor
    //   1093: goto -> 1104
    //   1096: ldc2_w -73726748
    //   1099: l2i
    //   1100: ldc_w 84288556
    //   1103: ixor
    //   1104: ldc2_w -1176510668
    //   1107: l2i
    //   1108: ldc_w 2067396485
    //   1111: ixor
    //   1112: ixor
    //   1113: lookupswitch default -> 1140, -1952944442 -> 1096, 1601461874 -> 1714
    //   1140: aload_0
    //   1141: ldc_w -1738145204
    //   1144: i2l
    //   1145: ldc2_w -1738145204
    //   1148: lxor
    //   1149: getstatic Perryc.0 : I
    //   1152: ifle -> 1166
    //   1155: ldc2_w -1994625022
    //   1158: l2i
    //   1159: ldc_w 217148690
    //   1162: ixor
    //   1163: goto -> 1174
    //   1166: ldc2_w -1691246361
    //   1169: l2i
    //   1170: ldc_w 991151987
    //   1173: ixor
    //   1174: ldc2_w -670767977
    //   1177: l2i
    //   1178: ldc_w -1788745968
    //   1181: ixor
    //   1182: ixor
    //   1183: lookupswitch default -> 1676, -930603369 -> 1166, -314088429 -> 1208
    //   1208: putfield jumpInfoStartTime : J
    //   1211: getstatic Perryc.1 : I
    //   1214: ifeq -> 1228
    //   1217: ldc2_w 753137722
    //   1220: l2i
    //   1221: ldc_w 1354860550
    //   1224: ixor
    //   1225: goto -> 1236
    //   1228: ldc2_w 1414986004
    //   1231: l2i
    //   1232: ldc_w -1789480641
    //   1235: ixor
    //   1236: ldc2_w -572503467
    //   1239: l2i
    //   1240: ldc_w -1525458397
    //   1243: ixor
    //   1244: ixor
    //   1245: lookupswitch default -> 1272, 80830538 -> 1722, 1296256432 -> 1228
    //   1272: aload_0
    //   1273: ldc2_w 890229715
    //   1276: l2i
    //   1277: ldc_w 890229714
    //   1280: ixor
    //   1281: getstatic Perryc.c : I
    //   1284: iflt -> 1298
    //   1287: ldc2_w -1819268969
    //   1290: l2i
    //   1291: ldc_w 984524946
    //   1294: ixor
    //   1295: goto -> 1306
    //   1298: ldc2_w 564642755
    //   1301: l2i
    //   1302: ldc_w 2050402011
    //   1305: ixor
    //   1306: ldc2_w -1282664856
    //   1309: l2i
    //   1310: ldc_w 1586037204
    //   1313: ixor
    //   1314: ixor
    //   1315: lookupswitch default -> 1340, 1144756153 -> 1704, 1969377986 -> 1298
    //   1340: putfield wasFirstJump : Z
    //   1343: getstatic Perryc.0 : I
    //   1346: ifle -> 1360
    //   1349: ldc2_w -1796780937
    //   1352: l2i
    //   1353: ldc_w 1314360718
    //   1356: ixor
    //   1357: goto -> 1368
    //   1360: ldc2_w -782440111
    //   1363: l2i
    //   1364: ldc_w -1909923946
    //   1367: ixor
    //   1368: ldc2_w -1613478580
    //   1371: l2i
    //   1372: ldc_w 687763658
    //   1375: ixor
    //   1376: ixor
    //   1377: lookupswitch default -> 1404, 565735490 -> 1360, 1838871679 -> 1684
    //   1404: aload_0
    //   1405: ldc2_w 9.7737501717979E307
    //   1408: invokestatic doubleToLongBits : (D)J
    //   1411: ldc2_w 9214758298185901723
    //   1414: lxor
    //   1415: invokestatic longBitsToDouble : (J)D
    //   1418: getstatic Perryc.0 : I
    //   1421: ifle -> 1435
    //   1424: ldc2_w 464805087
    //   1427: l2i
    //   1428: ldc_w -1496026860
    //   1431: ixor
    //   1432: goto -> 1443
    //   1435: ldc2_w -501787541
    //   1438: l2i
    //   1439: ldc_w -267407206
    //   1442: ixor
    //   1443: ldc2_w 86583359
    //   1446: l2i
    //   1447: ldc_w 347028634
    //   1450: ixor
    //   1451: ixor
    //   1452: lookupswitch default -> 1480, -1394198162 -> 1702, -113202277 -> 1435
    //   1480: putfield speedometerCurrentSpeed : D
    //   1483: getstatic Perryc.1 : I
    //   1486: ifeq -> 1500
    //   1489: ldc2_w 1838083997
    //   1492: l2i
    //   1493: ldc_w 935257598
    //   1496: ixor
    //   1497: goto -> 1508
    //   1500: ldc2_w 178527757
    //   1503: l2i
    //   1504: ldc_w 614590842
    //   1507: ixor
    //   1508: ldc2_w -1799459612
    //   1511: l2i
    //   1512: ldc_w -1592471355
    //   1515: ixor
    //   1516: ixor
    //   1517: lookupswitch default -> 1544, 221947782 -> 1500, 1872410178 -> 1696
    //   1544: aload_0
    //   1545: new java/util/HashMap
    //   1548: dup
    //   1549: getstatic Perryc.0 : I
    //   1552: ifle -> 1566
    //   1555: ldc2_w -235617900
    //   1558: l2i
    //   1559: ldc_w -555255494
    //   1562: ixor
    //   1563: goto -> 1574
    //   1566: ldc2_w 1145912645
    //   1569: l2i
    //   1570: ldc_w 1072769151
    //   1573: ixor
    //   1574: ldc2_w -1744119755
    //   1577: l2i
    //   1578: ldc_w 284700431
    //   1581: ixor
    //   1582: ixor
    //   1583: lookupswitch default -> 1718, -1478406252 -> 1566, -212934144 -> 1608
    //   1608: invokespecial <init> : ()V
    //   1611: getstatic Perryc.0 : I
    //   1614: ifle -> 1628
    //   1617: ldc2_w 1926976819
    //   1620: l2i
    //   1621: ldc_w 969867155
    //   1624: ixor
    //   1625: goto -> 1636
    //   1628: ldc2_w 1435251047
    //   1631: l2i
    //   1632: ldc_w 236912817
    //   1635: ixor
    //   1636: ldc2_w 81555593
    //   1639: l2i
    //   1640: ldc_w 975400310
    //   1643: ixor
    //   1644: ixor
    //   1645: lookupswitch default -> 1672, -1067196039 -> 1628, 1978316639 -> 1690
    //   1672: putfield playerSpeeds : Ljava/util/HashMap;
    //   1675: return
    //   1676: aconst_null
    //   1677: athrow
    //   1678: aconst_null
    //   1679: athrow
    //   1680: aconst_null
    //   1681: athrow
    //   1682: aconst_null
    //   1683: athrow
    //   1684: aconst_null
    //   1685: athrow
    //   1686: aconst_null
    //   1687: athrow
    //   1688: aconst_null
    //   1689: athrow
    //   1690: aconst_null
    //   1691: athrow
    //   1692: aconst_null
    //   1693: athrow
    //   1694: aconst_null
    //   1695: athrow
    //   1696: aconst_null
    //   1697: athrow
    //   1698: aconst_null
    //   1699: athrow
    //   1700: aconst_null
    //   1701: athrow
    //   1702: aconst_null
    //   1703: athrow
    //   1704: aconst_null
    //   1705: athrow
    //   1706: aconst_null
    //   1707: athrow
    //   1708: aconst_null
    //   1709: athrow
    //   1710: aconst_null
    //   1711: athrow
    //   1712: aconst_null
    //   1713: athrow
    //   1714: aconst_null
    //   1715: athrow
    //   1716: aconst_null
    //   1717: athrow
    //   1718: aconst_null
    //   1719: athrow
    //   1720: aconst_null
    //   1721: athrow
    //   1722: aconst_null
    //   1723: athrow
    //   1724: aconst_null
    //   1725: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   131	1545	0	this	Lbigname/zprestige/webhack/manager/SpeedManager;
  }
  
  public double getPlayerSpeed(EntityPlayer player) {
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
  
  static {
    // Byte code:
    //   0: ldc2_w 0.6637023792855827
    //   3: invokestatic doubleToLongBits : (D)J
    //   6: ldc2_w 9218091137362420492
    //   9: lxor
    //   10: invokestatic longBitsToDouble : (J)D
    //   13: getstatic Perryc.0 : I
    //   16: ifle -> 30
    //   19: ldc2_w -942294813
    //   22: l2i
    //   23: ldc_w -1861908669
    //   26: ixor
    //   27: goto -> 38
    //   30: ldc2_w -24110845
    //   33: l2i
    //   34: ldc_w -1386595311
    //   37: ixor
    //   38: ldc2_w 378877159
    //   41: l2i
    //   42: ldc_w 1988996598
    //   45: ixor
    //   46: ixor
    //   47: lookupswitch default -> 72, -1385440568 -> 30, 919119537 -> 222
    //   72: putstatic bigname/zprestige/webhack/manager/SpeedManager.LAST_JUMP_INFO_DURATION_DEFAULT : D
    //   75: ldc2_w -156033771
    //   78: l2i
    //   79: ldc_w -156033771
    //   82: ixor
    //   83: getstatic Perryc.c : I
    //   86: iflt -> 100
    //   89: ldc2_w 134259309
    //   92: l2i
    //   93: ldc_w 139893674
    //   96: ixor
    //   97: goto -> 108
    //   100: ldc2_w -635530630
    //   103: l2i
    //   104: ldc_w 254769803
    //   107: ixor
    //   108: ldc2_w -388253072
    //   111: l2i
    //   112: ldc_w 474401778
    //   115: ixor
    //   116: ixor
    //   117: lookupswitch default -> 144, -188004283 -> 220, 829364533 -> 100
    //   144: putstatic bigname/zprestige/webhack/manager/SpeedManager.didJumpThisTick : Z
    //   147: ldc2_w -426995653
    //   150: l2i
    //   151: ldc_w -426995653
    //   154: ixor
    //   155: getstatic Perryc.1 : I
    //   158: ifeq -> 172
    //   161: ldc2_w 1161347522
    //   164: l2i
    //   165: ldc_w -997955279
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w 1420769521
    //   175: l2i
    //   176: ldc_w -879752929
    //   179: ixor
    //   180: ldc2_w -892381135
    //   183: l2i
    //   184: ldc_w 1783387680
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 216, -132180652 -> 172, 557819618 -> 224
    //   216: putstatic bigname/zprestige/webhack/manager/SpeedManager.isJumping : Z
    //   219: return
    //   220: aconst_null
    //   221: athrow
    //   222: aconst_null
    //   223: athrow
    //   224: aconst_null
    //   225: athrow
  }
  
  public static void setIsJumping(boolean paramBoolean) {
    Perry1.62(null, (int)-516683138L ^ 0xF38AC570, paramBoolean);
  }
  
  public static void setDidJumpThisTick(boolean paramBoolean) {
    Perry1.64(null, (int)754327022L ^ 0x1C036485, paramBoolean);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\SpeedManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */