package bigname.zprestige.webhack.features.modules.Combat;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class Flatten extends Module {
  public int oldSlot;
  
  public Vec3d[] offsetsDefault;
  
  public Setting<Integer> blocksPerTick;
  
  public Setting<Boolean> packet;
  
  public Setting<Boolean> autoDisable;
  
  public Setting<Boolean> rotate;
  
  public int offsetStep;
  
  public EntityPlayer target;
  
  public boolean placing;
  
  public Flatten() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 459875048
    //   9: l2i
    //   10: ldc 1909901667
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1596710688
    //   19: l2i
    //   20: ldc -959668271
    //   22: ixor
    //   23: ldc2_w 1269107402
    //   26: l2i
    //   27: ldc 1698882173
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -618607146 -> 16, 1146618684 -> 3330
    //   56: aload_0
    //   57: ldc '◽㌟▸㶣酄쭢๷'
    //   59: getstatic Perryc.0 : I
    //   62: ifle -> 75
    //   65: ldc2_w -303638364
    //   68: l2i
    //   69: ldc 1446959710
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -376697245
    //   78: l2i
    //   79: ldc -1507180649
    //   81: ixor
    //   82: ldc2_w 1353802049
    //   85: l2i
    //   86: ldc -1232129669
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 116, -1605561405 -> 75, 1575375552 -> 3252
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '◽㌟▸㶣酄쭢๫堾蹷춦鴁਩焰䤁뢦辏ﶙꝽ谸ꩡ俥콝䚬컆燩ᣂ胔⤕䊠䂕摧䍯㘱겜䠹奥ಠ෎'
    //   121: getstatic Perryc.1 : I
    //   124: ifeq -> 137
    //   127: ldc2_w 1722137257
    //   130: l2i
    //   131: ldc -501091258
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 864426605
    //   140: l2i
    //   141: ldc 821510100
    //   143: ixor
    //   144: ldc2_w -1379957642
    //   147: l2i
    //   148: ldc -74574084
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 180, -759833499 -> 3304, 2033213718 -> 137
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.0 : I
    //   186: ifle -> 199
    //   189: ldc2_w -836265162
    //   192: l2i
    //   193: ldc -1817533163
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w 159347155
    //   202: l2i
    //   203: ldc -955234950
    //   205: ixor
    //   206: ldc2_w -314310178
    //   209: l2i
    //   210: ldc -606815994
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 240, 1668357565 -> 199, 1797097211 -> 3250
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.COMBAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w 1568141855
    //   246: l2i
    //   247: ldc 1568141854
    //   249: ixor
    //   250: ldc2_w 1552913874
    //   253: l2i
    //   254: ldc 1552913874
    //   256: ixor
    //   257: ldc2_w 910966298
    //   260: l2i
    //   261: ldc 910966298
    //   263: ixor
    //   264: getstatic Perryc.1 : I
    //   267: ifeq -> 280
    //   270: ldc2_w -1051683618
    //   273: l2i
    //   274: ldc -1284140384
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w 1407300499
    //   283: l2i
    //   284: ldc 21969525
    //   286: ixor
    //   287: ldc2_w -215467958
    //   290: l2i
    //   291: ldc -620248463
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 3290, 1510669381 -> 280, 2055304157 -> 320
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.c : I
    //   326: iflt -> 339
    //   329: ldc2_w -2038693478
    //   332: l2i
    //   333: ldc 940609180
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w -405888421
    //   342: l2i
    //   343: ldc 2069299993
    //   345: ixor
    //   346: ldc2_w -580973093
    //   349: l2i
    //   350: ldc -1386131331
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 3308, -833432928 -> 339, -324535068 -> 380
    //   380: aload_0
    //   381: getstatic Perryc.1 : I
    //   384: ifeq -> 397
    //   387: ldc2_w -351422765
    //   390: l2i
    //   391: ldc -917646456
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w -1754674675
    //   400: l2i
    //   401: ldc -663310906
    //   403: ixor
    //   404: ldc2_w -321226592
    //   407: l2i
    //   408: ldc 1933476917
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 440, -1831579971 -> 397, -1113286194 -> 3288
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc '◹㌟▶㶴酛쭴้塻蹱춚鴉ਤ'
    //   447: getstatic Perryc.1 : I
    //   450: ifeq -> 463
    //   453: ldc2_w 2010856482
    //   456: l2i
    //   457: ldc 159782914
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w -242391327
    //   466: l2i
    //   467: ldc -1536882948
    //   469: ixor
    //   470: ldc2_w -1887579300
    //   473: l2i
    //   474: ldc -791214495
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 3278, 172143904 -> 504, 569897245 -> 463
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc2_w 1092249698
    //   510: l2i
    //   511: ldc 1092249706
    //   513: ixor
    //   514: getstatic Perryc.0 : I
    //   517: ifle -> 530
    //   520: ldc2_w -563607652
    //   523: l2i
    //   524: ldc 773556659
    //   526: ixor
    //   527: goto -> 537
    //   530: ldc2_w -50939503
    //   533: l2i
    //   534: ldc 577644198
    //   536: ixor
    //   537: ldc2_w 1249871197
    //   540: l2i
    //   541: ldc -1511573547
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 572, 535510183 -> 3264, 981582744 -> 530
    //   572: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   575: ldc2_w -1267693478
    //   578: l2i
    //   579: ldc -1267693477
    //   581: ixor
    //   582: getstatic Perryc.c : I
    //   585: iflt -> 598
    //   588: ldc2_w 362384503
    //   591: l2i
    //   592: ldc -1654274407
    //   594: ixor
    //   595: goto -> 605
    //   598: ldc2_w 477969200
    //   601: l2i
    //   602: ldc -958054084
    //   604: ixor
    //   605: ldc2_w -749327946
    //   608: l2i
    //   609: ldc -809659064
    //   611: ixor
    //   612: ixor
    //   613: lookupswitch default -> 3284, -1810369008 -> 598, -965490958 -> 640
    //   640: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   643: ldc2_w -611578306
    //   646: l2i
    //   647: ldc -611578336
    //   649: ixor
    //   650: getstatic Perryc.1 : I
    //   653: ifeq -> 666
    //   656: ldc2_w 469861668
    //   659: l2i
    //   660: ldc -2110369722
    //   662: ixor
    //   663: goto -> 673
    //   666: ldc2_w -908323668
    //   669: l2i
    //   670: ldc -143789816
    //   672: ixor
    //   673: ldc2_w -1037813774
    //   676: l2i
    //   677: ldc 1237121039
    //   679: ixor
    //   680: ixor
    //   681: lookupswitch default -> 3256, -1255593383 -> 708, 363797151 -> 666
    //   708: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   711: getstatic Perryc.1 : I
    //   714: ifeq -> 727
    //   717: ldc2_w 1918357581
    //   720: l2i
    //   721: ldc -1404137586
    //   723: ixor
    //   724: goto -> 734
    //   727: ldc2_w 786057436
    //   730: l2i
    //   731: ldc -206854260
    //   733: ixor
    //   734: ldc2_w -1612621023
    //   737: l2i
    //   738: ldc 535711771
    //   740: ixor
    //   741: ixor
    //   742: lookupswitch default -> 3258, 1568597098 -> 768, 1578521849 -> 727
    //   768: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   771: getstatic Perryc.0 : I
    //   774: ifle -> 787
    //   777: ldc2_w 313065320
    //   780: l2i
    //   781: ldc -189018643
    //   783: ixor
    //   784: goto -> 794
    //   787: ldc2_w -1139804486
    //   790: l2i
    //   791: ldc -170460807
    //   793: ixor
    //   794: ldc2_w -1676537317
    //   797: l2i
    //   798: ldc 839890055
    //   800: ixor
    //   801: ixor
    //   802: lookupswitch default -> 3266, -406541985 -> 828, 1208914969 -> 787
    //   828: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   831: getstatic Perryc.0 : I
    //   834: ifle -> 847
    //   837: ldc2_w 833509271
    //   840: l2i
    //   841: ldc -52900648
    //   843: ixor
    //   844: goto -> 854
    //   847: ldc2_w 325775166
    //   850: l2i
    //   851: ldc 1080403967
    //   853: ixor
    //   854: ldc2_w 209062044
    //   857: l2i
    //   858: ldc 1516759109
    //   860: ixor
    //   861: ixor
    //   862: lookupswitch default -> 888, -1811882685 -> 847, -1687716970 -> 3310
    //   888: putfield blocksPerTick : Lbigname/zprestige/webhack/features/setting/Setting;
    //   891: getstatic Perryc.c : I
    //   894: iflt -> 907
    //   897: ldc2_w -1612744562
    //   900: l2i
    //   901: ldc 996526013
    //   903: ixor
    //   904: goto -> 914
    //   907: ldc2_w 1801837918
    //   910: l2i
    //   911: ldc 1919519855
    //   913: ixor
    //   914: ldc2_w 1543975008
    //   917: l2i
    //   918: ldc -716474406
    //   920: ixor
    //   921: ixor
    //   922: lookupswitch default -> 948, 771160201 -> 3254, 979210554 -> 907
    //   948: aload_0
    //   949: getstatic Perryc.1 : I
    //   952: ifeq -> 965
    //   955: ldc2_w 1788835197
    //   958: l2i
    //   959: ldc 365114181
    //   961: ixor
    //   962: goto -> 972
    //   965: ldc2_w -617605628
    //   968: l2i
    //   969: ldc -485000190
    //   971: ixor
    //   972: ldc2_w -318993414
    //   975: l2i
    //   976: ldc 1235340838
    //   978: ixor
    //   979: ixor
    //   980: lookupswitch default -> 1008, -637467676 -> 3328, -73801094 -> 965
    //   1008: aload_0
    //   1009: new bigname/zprestige/webhack/features/setting/Setting
    //   1012: dup
    //   1013: ldc '◩㌜▭㶶酄쭢'
    //   1015: getstatic Perryc.0 : I
    //   1018: ifle -> 1031
    //   1021: ldc2_w 837245594
    //   1024: l2i
    //   1025: ldc 559868361
    //   1027: ixor
    //   1028: goto -> 1038
    //   1031: ldc2_w -1286579778
    //   1034: l2i
    //   1035: ldc -907579105
    //   1037: ixor
    //   1038: ldc2_w -1218741300
    //   1041: l2i
    //   1042: ldc 473139042
    //   1044: ixor
    //   1045: ixor
    //   1046: lookupswitch default -> 3300, -1143910403 -> 1031, -773860337 -> 1072
    //   1072: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1075: ldc2_w 1502825315
    //   1078: l2i
    //   1079: ldc 1502825315
    //   1081: ixor
    //   1082: getstatic Perryc.c : I
    //   1085: iflt -> 1098
    //   1088: ldc2_w 1490771728
    //   1091: l2i
    //   1092: ldc -2108258434
    //   1094: ixor
    //   1095: goto -> 1105
    //   1098: ldc2_w 692062892
    //   1101: l2i
    //   1102: ldc 1492114929
    //   1104: ixor
    //   1105: ldc2_w 2025136211
    //   1108: l2i
    //   1109: ldc_w 2060297281
    //   1112: ixor
    //   1113: ixor
    //   1114: lookupswitch default -> 3268, -655008644 -> 1098, 1943491407 -> 1140
    //   1140: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1143: getstatic Perryc.1 : I
    //   1146: ifeq -> 1160
    //   1149: ldc2_w 664361477
    //   1152: l2i
    //   1153: ldc_w 1570300119
    //   1156: ixor
    //   1157: goto -> 1168
    //   1160: ldc2_w -410022312
    //   1163: l2i
    //   1164: ldc_w 1987851504
    //   1167: ixor
    //   1168: ldc2_w -1380987109
    //   1171: l2i
    //   1172: ldc_w 1193268306
    //   1175: ixor
    //   1176: ixor
    //   1177: lookupswitch default -> 1204, -1867406949 -> 3314, -1054990481 -> 1160
    //   1204: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1207: getstatic Perryc.1 : I
    //   1210: ifeq -> 1224
    //   1213: ldc2_w 973563703
    //   1216: l2i
    //   1217: ldc_w -943153408
    //   1220: ixor
    //   1221: goto -> 1232
    //   1224: ldc2_w -1842010828
    //   1227: l2i
    //   1228: ldc_w 643201164
    //   1231: ixor
    //   1232: ldc2_w 286213098
    //   1235: l2i
    //   1236: ldc_w 282265488
    //   1239: ixor
    //   1240: ixor
    //   1241: lookupswitch default -> 1268, -65815475 -> 3262, 1538615004 -> 1224
    //   1268: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1271: getstatic Perryc.1 : I
    //   1274: ifeq -> 1288
    //   1277: ldc2_w 198558724
    //   1280: l2i
    //   1281: ldc_w -1834817541
    //   1284: ixor
    //   1285: goto -> 1296
    //   1288: ldc2_w -104026370
    //   1291: l2i
    //   1292: ldc_w 760668076
    //   1295: ixor
    //   1296: ldc2_w -1141145135
    //   1299: l2i
    //   1300: ldc_w -577172350
    //   1303: ixor
    //   1304: ixor
    //   1305: lookupswitch default -> 1332, -739948078 -> 1288, -15356244 -> 3246
    //   1332: putfield rotate : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1335: getstatic Perryc.1 : I
    //   1338: ifeq -> 1352
    //   1341: ldc2_w -2010770083
    //   1344: l2i
    //   1345: ldc_w -1457188834
    //   1348: ixor
    //   1349: goto -> 1360
    //   1352: ldc2_w 9718565
    //   1355: l2i
    //   1356: ldc_w -1614969651
    //   1359: ixor
    //   1360: ldc2_w 1487057162
    //   1363: l2i
    //   1364: ldc_w 408420550
    //   1367: ixor
    //   1368: ixor
    //   1369: lookupswitch default -> 1396, 1643754639 -> 3280, 1645627045 -> 1352
    //   1396: aload_0
    //   1397: getstatic Perryc.0 : I
    //   1400: ifle -> 1414
    //   1403: ldc2_w 1975803270
    //   1406: l2i
    //   1407: ldc_w 31643965
    //   1410: ixor
    //   1411: goto -> 1422
    //   1414: ldc2_w -273135333
    //   1417: l2i
    //   1418: ldc_w 381010785
    //   1421: ixor
    //   1422: ldc2_w 1808835194
    //   1425: l2i
    //   1426: ldc_w 852292636
    //   1429: ixor
    //   1430: ixor
    //   1431: lookupswitch default -> 1456, -1102641119 -> 1414, 758829789 -> 3334
    //   1456: aload_0
    //   1457: new bigname/zprestige/webhack/features/setting/Setting
    //   1460: dup
    //   1461: ldc_w '◫㌒►㶼酕쭳้塲蹢춭鴅'
    //   1464: getstatic Perryc.c : I
    //   1467: iflt -> 1481
    //   1470: ldc2_w 401813064
    //   1473: l2i
    //   1474: ldc_w -783343477
    //   1477: ixor
    //   1478: goto -> 1489
    //   1481: ldc2_w -1323372011
    //   1484: l2i
    //   1485: ldc_w 1728196041
    //   1488: ixor
    //   1489: ldc2_w 935822646
    //   1492: l2i
    //   1493: ldc_w 896711918
    //   1496: ixor
    //   1497: ixor
    //   1498: lookupswitch default -> 1524, -1006029029 -> 3244, -387342038 -> 1481
    //   1524: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1527: ldc2_w -1796020349
    //   1530: l2i
    //   1531: ldc_w -1796020349
    //   1534: ixor
    //   1535: getstatic Perryc.c : I
    //   1538: iflt -> 1552
    //   1541: ldc2_w 391073666
    //   1544: l2i
    //   1545: ldc_w -1559194939
    //   1548: ixor
    //   1549: goto -> 1560
    //   1552: ldc2_w -1602564432
    //   1555: l2i
    //   1556: ldc_w 301297853
    //   1559: ixor
    //   1560: ldc2_w 888326373
    //   1563: l2i
    //   1564: ldc_w 1947771980
    //   1567: ixor
    //   1568: ixor
    //   1569: lookupswitch default -> 3324, -244985180 -> 1596, -189419026 -> 1552
    //   1596: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1599: getstatic Perryc.0 : I
    //   1602: ifle -> 1616
    //   1605: ldc2_w 1350100017
    //   1608: l2i
    //   1609: ldc_w -1082091326
    //   1612: ixor
    //   1613: goto -> 1624
    //   1616: ldc2_w -1965570266
    //   1619: l2i
    //   1620: ldc_w -466763093
    //   1623: ixor
    //   1624: ldc2_w 1233472895
    //   1627: l2i
    //   1628: ldc_w -1667806832
    //   1631: ixor
    //   1632: ixor
    //   1633: lookupswitch default -> 1660, -1904508532 -> 1616, 988444700 -> 3272
    //   1660: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1663: getstatic Perryc.0 : I
    //   1666: ifle -> 1680
    //   1669: ldc2_w -2013463096
    //   1672: l2i
    //   1673: ldc_w -1714801189
    //   1676: ixor
    //   1677: goto -> 1688
    //   1680: ldc2_w -1117801917
    //   1683: l2i
    //   1684: ldc_w -1084021480
    //   1687: ixor
    //   1688: ldc2_w -2032561162
    //   1691: l2i
    //   1692: ldc_w -1585288170
    //   1695: ixor
    //   1696: ixor
    //   1697: lookupswitch default -> 1724, 537086789 -> 1680, 963459059 -> 3302
    //   1724: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1727: getstatic Perryc.0 : I
    //   1730: ifle -> 1744
    //   1733: ldc2_w -134968802
    //   1736: l2i
    //   1737: ldc_w -1218019561
    //   1740: ixor
    //   1741: goto -> 1752
    //   1744: ldc2_w -1121572890
    //   1747: l2i
    //   1748: ldc_w 319307202
    //   1751: ixor
    //   1752: ldc2_w 629095989
    //   1755: l2i
    //   1756: ldc_w -323803436
    //   1759: ixor
    //   1760: ixor
    //   1761: lookupswitch default -> 3286, -1990267416 -> 1744, 1742865093 -> 1788
    //   1788: putfield packet : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1791: getstatic Perryc.c : I
    //   1794: iflt -> 1808
    //   1797: ldc2_w 704010254
    //   1800: l2i
    //   1801: ldc_w 1781701094
    //   1804: ixor
    //   1805: goto -> 1816
    //   1808: ldc2_w 862023584
    //   1811: l2i
    //   1812: ldc_w -1384085433
    //   1815: ixor
    //   1816: ldc2_w 1138572134
    //   1819: l2i
    //   1820: ldc_w -810811436
    //   1823: ixor
    //   1824: ixor
    //   1825: lookupswitch default -> 1852, -810416806 -> 3322, 1018931665 -> 1808
    //   1852: aload_0
    //   1853: getstatic Perryc.c : I
    //   1856: iflt -> 1870
    //   1859: ldc2_w -1187348562
    //   1862: l2i
    //   1863: ldc_w -1851652545
    //   1866: ixor
    //   1867: goto -> 1878
    //   1870: ldc2_w 1804791947
    //   1873: l2i
    //   1874: ldc_w 216630801
    //   1877: ixor
    //   1878: ldc2_w 1303253084
    //   1881: l2i
    //   1882: ldc_w 2002544375
    //   1885: ixor
    //   1886: ixor
    //   1887: lookupswitch default -> 1912, 308940602 -> 3326, 1016512353 -> 1870
    //   1912: aload_0
    //   1913: new bigname/zprestige/webhack/features/setting/Setting
    //   1916: dup
    //   1917: ldc_w '◺㌆▭㶸酴쭮๪塿蹡춢鴅'
    //   1920: getstatic Perryc.1 : I
    //   1923: ifeq -> 1937
    //   1926: ldc2_w 176927453
    //   1929: l2i
    //   1930: ldc_w 1117412539
    //   1933: ixor
    //   1934: goto -> 1945
    //   1937: ldc2_w 1536537541
    //   1940: l2i
    //   1941: ldc_w -392850684
    //   1944: ixor
    //   1945: ldc2_w -2089402578
    //   1948: l2i
    //   1949: ldc_w -547686020
    //   1952: ixor
    //   1953: ixor
    //   1954: lookupswitch default -> 3296, -282270061 -> 1980, 339552308 -> 1937
    //   1980: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1983: ldc2_w 1784892539
    //   1986: l2i
    //   1987: ldc_w 1784892538
    //   1990: ixor
    //   1991: getstatic Perryc.1 : I
    //   1994: ifeq -> 2008
    //   1997: ldc2_w 1008452443
    //   2000: l2i
    //   2001: ldc_w 1534029011
    //   2004: ixor
    //   2005: goto -> 2016
    //   2008: ldc2_w -296594325
    //   2011: l2i
    //   2012: ldc_w 1079349467
    //   2015: ixor
    //   2016: ldc2_w -1317785978
    //   2019: l2i
    //   2020: ldc_w 1928492606
    //   2023: ixor
    //   2024: ixor
    //   2025: lookupswitch default -> 2052, -1527580880 -> 3336, -1152360462 -> 2008
    //   2052: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2055: getstatic Perryc.0 : I
    //   2058: ifle -> 2072
    //   2061: ldc2_w 692396704
    //   2064: l2i
    //   2065: ldc_w 906886493
    //   2068: ixor
    //   2069: goto -> 2080
    //   2072: ldc2_w -798937350
    //   2075: l2i
    //   2076: ldc_w -879159468
    //   2079: ixor
    //   2080: ldc2_w -1956009937
    //   2083: l2i
    //   2084: ldc_w 1370244289
    //   2087: ixor
    //   2088: ixor
    //   2089: lookupswitch default -> 2116, -980602093 -> 3316, 1278493559 -> 2072
    //   2116: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2119: getstatic Perryc.0 : I
    //   2122: ifle -> 2136
    //   2125: ldc2_w 1137398202
    //   2128: l2i
    //   2129: ldc_w 1609083756
    //   2132: ixor
    //   2133: goto -> 2144
    //   2136: ldc2_w 142270022
    //   2139: l2i
    //   2140: ldc_w 1191895150
    //   2143: ixor
    //   2144: ldc2_w 557773614
    //   2147: l2i
    //   2148: ldc_w 923782518
    //   2151: ixor
    //   2152: ixor
    //   2153: lookupswitch default -> 2180, 169002126 -> 3282, 1219317988 -> 2136
    //   2180: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2183: getstatic Perryc.c : I
    //   2186: iflt -> 2200
    //   2189: ldc2_w -1502493942
    //   2192: l2i
    //   2193: ldc_w 1097905709
    //   2196: ixor
    //   2197: goto -> 2208
    //   2200: ldc2_w 1149655391
    //   2203: l2i
    //   2204: ldc_w -795143830
    //   2207: ixor
    //   2208: ldc2_w 1546956243
    //   2211: l2i
    //   2212: ldc_w -89753259
    //   2215: ixor
    //   2216: ixor
    //   2217: lookupswitch default -> 3306, 848272563 -> 2244, 1100194209 -> 2200
    //   2244: putfield autoDisable : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2247: getstatic Perryc.0 : I
    //   2250: ifle -> 2264
    //   2253: ldc2_w 1995356938
    //   2256: l2i
    //   2257: ldc_w -2000688869
    //   2260: ixor
    //   2261: goto -> 2272
    //   2264: ldc2_w 1841872726
    //   2267: l2i
    //   2268: ldc_w 1941565208
    //   2271: ixor
    //   2272: ldc2_w 557751558
    //   2275: l2i
    //   2276: ldc_w -322448961
    //   2279: ixor
    //   2280: ixor
    //   2281: lookupswitch default -> 2308, -1779027968 -> 2264, 866655912 -> 3312
    //   2308: aload_0
    //   2309: ldc2_w 324458450
    //   2312: l2i
    //   2313: ldc_w 324458454
    //   2316: ixor
    //   2317: anewarray net/minecraft/util/math/Vec3d
    //   2320: dup
    //   2321: ldc2_w -646545263
    //   2324: l2i
    //   2325: ldc_w -646545263
    //   2328: ixor
    //   2329: new net/minecraft/util/math/Vec3d
    //   2332: dup
    //   2333: ldc2_w 2.471296462699052E307
    //   2336: invokestatic doubleToLongBits : (D)J
    //   2339: ldc2_w 9205806932896666863
    //   2342: lxor
    //   2343: invokestatic longBitsToDouble : (J)D
    //   2346: ldc2_w 8.679392546305269E307
    //   2349: invokestatic doubleToLongBits : (D)J
    //   2352: ldc2_w 9214055120307995191
    //   2355: lxor
    //   2356: invokestatic longBitsToDouble : (J)D
    //   2359: ldc2_w -4.463733934451294
    //   2362: invokestatic doubleToLongBits : (D)J
    //   2365: ldc2_w 9214886955593633291
    //   2368: lxor
    //   2369: invokestatic longBitsToDouble : (J)D
    //   2372: getstatic Perryc.0 : I
    //   2375: ifle -> 2389
    //   2378: ldc2_w -1246241919
    //   2381: l2i
    //   2382: ldc_w -1651287695
    //   2385: ixor
    //   2386: goto -> 2397
    //   2389: ldc2_w 2115266646
    //   2392: l2i
    //   2393: ldc_w -1164104822
    //   2396: ixor
    //   2397: ldc2_w 2118670698
    //   2400: l2i
    //   2401: ldc_w 1594364875
    //   2404: ixor
    //   2405: ixor
    //   2406: lookupswitch default -> 3274, -439809667 -> 2432, 157599825 -> 2389
    //   2432: invokespecial <init> : (DDD)V
    //   2435: aastore
    //   2436: dup
    //   2437: ldc2_w 1749998479
    //   2440: l2i
    //   2441: ldc_w 1749998478
    //   2444: ixor
    //   2445: new net/minecraft/util/math/Vec3d
    //   2448: dup
    //   2449: ldc2_w 1.1100091931603683E308
    //   2452: invokestatic doubleToLongBits : (D)J
    //   2455: ldc2_w 9215422851233292066
    //   2458: lxor
    //   2459: invokestatic longBitsToDouble : (J)D
    //   2462: ldc2_w 1.564989272317953E308
    //   2465: invokestatic doubleToLongBits : (D)J
    //   2468: ldc2_w 9217702492930997089
    //   2471: lxor
    //   2472: invokestatic longBitsToDouble : (J)D
    //   2475: ldc2_w 7.584015769451065
    //   2478: invokestatic doubleToLongBits : (D)J
    //   2481: ldc2_w 9218400080620982265
    //   2484: lxor
    //   2485: invokestatic longBitsToDouble : (J)D
    //   2488: getstatic Perryc.1 : I
    //   2491: ifeq -> 2505
    //   2494: ldc2_w 115063036
    //   2497: l2i
    //   2498: ldc_w 121573494
    //   2501: ixor
    //   2502: goto -> 2513
    //   2505: ldc2_w -653345898
    //   2508: l2i
    //   2509: ldc_w 29936380
    //   2512: ixor
    //   2513: ldc2_w -286321557
    //   2516: l2i
    //   2517: ldc_w -1655512642
    //   2520: ixor
    //   2521: ixor
    //   2522: lookupswitch default -> 2548, 1701474198 -> 2505, 1918459231 -> 3318
    //   2548: invokespecial <init> : (DDD)V
    //   2551: aastore
    //   2552: dup
    //   2553: ldc2_w 370019358
    //   2556: l2i
    //   2557: ldc_w 370019356
    //   2560: ixor
    //   2561: new net/minecraft/util/math/Vec3d
    //   2564: dup
    //   2565: ldc2_w 10.363473318623955
    //   2568: invokestatic doubleToLongBits : (D)J
    //   2571: ldc2_w 9211191755167296189
    //   2574: lxor
    //   2575: invokestatic longBitsToDouble : (J)D
    //   2578: ldc2_w 1.0298320918219954E308
    //   2581: invokestatic doubleToLongBits : (D)J
    //   2584: ldc2_w 9215021130209043066
    //   2587: lxor
    //   2588: invokestatic longBitsToDouble : (J)D
    //   2591: ldc2_w 5.508401202953854E307
    //   2594: invokestatic doubleToLongBits : (D)J
    //   2597: ldc2_w 9210877520047891563
    //   2600: lxor
    //   2601: invokestatic longBitsToDouble : (J)D
    //   2604: getstatic Perryc.0 : I
    //   2607: ifle -> 2621
    //   2610: ldc2_w 1553016585
    //   2613: l2i
    //   2614: ldc_w 621899053
    //   2617: ixor
    //   2618: goto -> 2629
    //   2621: ldc2_w -16478913
    //   2624: l2i
    //   2625: ldc_w -1904263844
    //   2628: ixor
    //   2629: ldc2_w -375896796
    //   2632: l2i
    //   2633: ldc_w -791886767
    //   2636: ixor
    //   2637: ixor
    //   2638: lookupswitch default -> 3294, 1087687505 -> 2621, 1211052310 -> 2664
    //   2664: invokespecial <init> : (DDD)V
    //   2667: aastore
    //   2668: dup
    //   2669: ldc2_w 760507566
    //   2672: l2i
    //   2673: ldc_w 760507565
    //   2676: ixor
    //   2677: new net/minecraft/util/math/Vec3d
    //   2680: dup
    //   2681: ldc2_w -5.521336508866971
    //   2684: invokestatic doubleToLongBits : (D)J
    //   2687: ldc2_w 9216077710233644421
    //   2690: lxor
    //   2691: invokestatic longBitsToDouble : (J)D
    //   2694: ldc2_w 1.2646791332907163E308
    //   2697: invokestatic doubleToLongBits : (D)J
    //   2700: ldc2_w 9216197812733926380
    //   2703: lxor
    //   2704: invokestatic longBitsToDouble : (J)D
    //   2707: ldc2_w 1.2848154756941198E308
    //   2710: invokestatic doubleToLongBits : (D)J
    //   2713: ldc2_w 9216298704284754401
    //   2716: lxor
    //   2717: invokestatic longBitsToDouble : (J)D
    //   2720: getstatic Perryc.0 : I
    //   2723: ifle -> 2737
    //   2726: ldc2_w -42432935
    //   2729: l2i
    //   2730: ldc_w -1699873649
    //   2733: ixor
    //   2734: goto -> 2745
    //   2737: ldc2_w 340352548
    //   2740: l2i
    //   2741: ldc_w -731687526
    //   2744: ixor
    //   2745: ldc2_w -1536746989
    //   2748: l2i
    //   2749: ldc_w -1646399846
    //   2752: ixor
    //   2753: ixor
    //   2754: lookupswitch default -> 3248, -107937993 -> 2780, 1584369247 -> 2737
    //   2780: invokespecial <init> : (DDD)V
    //   2783: aastore
    //   2784: getstatic Perryc.c : I
    //   2787: iflt -> 2801
    //   2790: ldc2_w 1770051057
    //   2793: l2i
    //   2794: ldc_w -2094600931
    //   2797: ixor
    //   2798: goto -> 2809
    //   2801: ldc2_w -596658749
    //   2804: l2i
    //   2805: ldc_w 310608
    //   2808: ixor
    //   2809: ldc2_w -1683146773
    //   2812: l2i
    //   2813: ldc_w -136921892
    //   2816: ixor
    //   2817: ixor
    //   2818: lookupswitch default -> 2844, -2032290853 -> 3276, -1565527427 -> 2801
    //   2844: putfield offsetsDefault : [Lnet/minecraft/util/math/Vec3d;
    //   2847: getstatic Perryc.1 : I
    //   2850: ifeq -> 2864
    //   2853: ldc2_w -852346659
    //   2856: l2i
    //   2857: ldc_w 964328543
    //   2860: ixor
    //   2861: goto -> 2872
    //   2864: ldc2_w 1870270385
    //   2867: l2i
    //   2868: ldc_w 964291686
    //   2871: ixor
    //   2872: ldc2_w -1102368384
    //   2875: l2i
    //   2876: ldc_w -1221341370
    //   2879: ixor
    //   2880: ixor
    //   2881: lookupswitch default -> 2908, -1122574363 -> 2864, -47138236 -> 3332
    //   2908: aload_0
    //   2909: ldc2_w -760010967
    //   2912: l2i
    //   2913: ldc_w -760010967
    //   2916: ixor
    //   2917: getstatic Perryc.1 : I
    //   2920: ifeq -> 2934
    //   2923: ldc2_w -389542963
    //   2926: l2i
    //   2927: ldc_w -739508097
    //   2930: ixor
    //   2931: goto -> 2942
    //   2934: ldc2_w -339631049
    //   2937: l2i
    //   2938: ldc_w 1911633670
    //   2941: ixor
    //   2942: ldc2_w 929118184
    //   2945: l2i
    //   2946: ldc_w -1421989249
    //   2949: ixor
    //   2950: ixor
    //   2951: lookupswitch default -> 3260, -1485105627 -> 2934, 107974310 -> 2976
    //   2976: putfield offsetStep : I
    //   2979: getstatic Perryc.1 : I
    //   2982: ifeq -> 2996
    //   2985: ldc2_w 377292587
    //   2988: l2i
    //   2989: ldc_w 1776673994
    //   2992: ixor
    //   2993: goto -> 3004
    //   2996: ldc2_w 902105899
    //   2999: l2i
    //   3000: ldc_w 1207438513
    //   3003: ixor
    //   3004: ldc2_w -1972497539
    //   3007: l2i
    //   3008: ldc_w -1608110614
    //   3011: ixor
    //   3012: ixor
    //   3013: lookupswitch default -> 3270, 1439751542 -> 2996, 1484077325 -> 3040
    //   3040: aload_0
    //   3041: ldc2_w 314242514
    //   3044: l2i
    //   3045: ldc_w -314242515
    //   3048: ixor
    //   3049: getstatic Perryc.c : I
    //   3052: iflt -> 3066
    //   3055: ldc2_w -1594029479
    //   3058: l2i
    //   3059: ldc_w 362451690
    //   3062: ixor
    //   3063: goto -> 3074
    //   3066: ldc2_w -214421956
    //   3069: l2i
    //   3070: ldc_w 512798012
    //   3073: ixor
    //   3074: ldc2_w -1493220547
    //   3077: l2i
    //   3078: ldc_w 1975296177
    //   3081: ixor
    //   3082: ixor
    //   3083: lookupswitch default -> 3320, 1055613068 -> 3108, 1713666879 -> 3066
    //   3108: putfield oldSlot : I
    //   3111: getstatic Perryc.0 : I
    //   3114: ifle -> 3128
    //   3117: ldc2_w 1266972083
    //   3120: l2i
    //   3121: ldc_w -137139528
    //   3124: ixor
    //   3125: goto -> 3136
    //   3128: ldc2_w 1103823128
    //   3131: l2i
    //   3132: ldc_w -2102812403
    //   3135: ixor
    //   3136: ldc2_w 880622563
    //   3139: l2i
    //   3140: ldc_w 1921831569
    //   3143: ixor
    //   3144: ixor
    //   3145: lookupswitch default -> 3292, -2053944985 -> 3172, -89721223 -> 3128
    //   3172: aload_0
    //   3173: ldc2_w 252516899
    //   3176: l2i
    //   3177: ldc_w 252516899
    //   3180: ixor
    //   3181: getstatic Perryc.0 : I
    //   3184: ifle -> 3198
    //   3187: ldc2_w -1236929806
    //   3190: l2i
    //   3191: ldc_w 263697554
    //   3194: ixor
    //   3195: goto -> 3206
    //   3198: ldc2_w -959025087
    //   3201: l2i
    //   3202: ldc_w -986511494
    //   3205: ixor
    //   3206: ldc2_w 488216031
    //   3209: l2i
    //   3210: ldc_w -1982431139
    //   3213: ixor
    //   3214: ixor
    //   3215: lookupswitch default -> 3240, 758993890 -> 3298, 1404388893 -> 3198
    //   3240: putfield placing : Z
    //   3243: return
    //   3244: aconst_null
    //   3245: athrow
    //   3246: aconst_null
    //   3247: athrow
    //   3248: aconst_null
    //   3249: athrow
    //   3250: aconst_null
    //   3251: athrow
    //   3252: aconst_null
    //   3253: athrow
    //   3254: aconst_null
    //   3255: athrow
    //   3256: aconst_null
    //   3257: athrow
    //   3258: aconst_null
    //   3259: athrow
    //   3260: aconst_null
    //   3261: athrow
    //   3262: aconst_null
    //   3263: athrow
    //   3264: aconst_null
    //   3265: athrow
    //   3266: aconst_null
    //   3267: athrow
    //   3268: aconst_null
    //   3269: athrow
    //   3270: aconst_null
    //   3271: athrow
    //   3272: aconst_null
    //   3273: athrow
    //   3274: aconst_null
    //   3275: athrow
    //   3276: aconst_null
    //   3277: athrow
    //   3278: aconst_null
    //   3279: athrow
    //   3280: aconst_null
    //   3281: athrow
    //   3282: aconst_null
    //   3283: athrow
    //   3284: aconst_null
    //   3285: athrow
    //   3286: aconst_null
    //   3287: athrow
    //   3288: aconst_null
    //   3289: athrow
    //   3290: aconst_null
    //   3291: athrow
    //   3292: aconst_null
    //   3293: athrow
    //   3294: aconst_null
    //   3295: athrow
    //   3296: aconst_null
    //   3297: athrow
    //   3298: aconst_null
    //   3299: athrow
    //   3300: aconst_null
    //   3301: athrow
    //   3302: aconst_null
    //   3303: athrow
    //   3304: aconst_null
    //   3305: athrow
    //   3306: aconst_null
    //   3307: athrow
    //   3308: aconst_null
    //   3309: athrow
    //   3310: aconst_null
    //   3311: athrow
    //   3312: aconst_null
    //   3313: athrow
    //   3314: aconst_null
    //   3315: athrow
    //   3316: aconst_null
    //   3317: athrow
    //   3318: aconst_null
    //   3319: athrow
    //   3320: aconst_null
    //   3321: athrow
    //   3322: aconst_null
    //   3323: athrow
    //   3324: aconst_null
    //   3325: athrow
    //   3326: aconst_null
    //   3327: athrow
    //   3328: aconst_null
    //   3329: athrow
    //   3330: aconst_null
    //   3331: athrow
    //   3332: aconst_null
    //   3333: athrow
    //   3334: aconst_null
    //   3335: athrow
    //   3336: aconst_null
    //   3337: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	3244	0	this	Lbigname/zprestige/webhack/features/modules/Combat/Flatten;
  }
  
  public void onUpdate() {
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
  
  public EntityPlayer findClosestTarget() {
    return Perry1.2i(this, (int)1013986222L ^ 0x48DDC9A7);
  }
  
  public void onDisable() {
    Perry1.4d(this, (int)-235522313L ^ 0xFA3EA4B4);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void onEnable() {
    Perry1.3i(this, (int)-573905498L ^ 0x9C17CF18);
  }
  
  public void place(BlockPos pos, int slot, int oldSlot) {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\Flatten.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */