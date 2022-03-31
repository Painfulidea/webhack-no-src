package bigname.zprestige.webhack.features.modules.Client;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.ClientEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FontMod extends Module {
  public Setting<Boolean> antiAlias;
  
  public Setting<Integer> fontSize;
  
  public Setting<Integer> fontStyle;
  
  public static FontMod INSTANCE;
  
  public Setting<String> fontName;
  
  public boolean reloadFont;
  
  public Setting<Boolean> fractionalMetrics;
  
  public FontMod() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 1894715244
    //   9: l2i
    //   10: ldc -1723124583
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1878644703
    //   19: l2i
    //   20: ldc 673324492
    //   22: ixor
    //   23: ldc2_w -1325318952
    //   26: l2i
    //   27: ldc 555643585
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 3462, -674986998 -> 56, 2042328556 -> 16
    //   56: aload_0
    //   57: ldc '䷾㌆䶤㶣凌ꍬ๟み蹭ꖰ'
    //   59: getstatic Perryc.1 : I
    //   62: ifeq -> 75
    //   65: ldc2_w 1178772478
    //   68: l2i
    //   69: ldc -1290318762
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w 312587346
    //   78: l2i
    //   79: ldc 662881824
    //   81: ixor
    //   82: ldc2_w 493390585
    //   85: l2i
    //   86: ldc -1489117985
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 3496, -1888082860 -> 116, 1325447566 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '䷾㌆䶤㶣凌ꍬ๟み蹭ꖰਡ耊煳ℒ킹输關Ꜯ숰俱Ꝟ䚶ꚉᦠᣍ⥜⪨⢔摡⭾㙷쒐″奸撴඄뫅鄨秎맓쾤?Ꮬꜫ໦?絜ڰ㝌멺뾷ㄕ㐚긤㲚鵫踖'
    //   121: getstatic Perryc.1 : I
    //   124: ifeq -> 137
    //   127: ldc2_w -1919160586
    //   130: l2i
    //   131: ldc 1340922884
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 1219322385
    //   140: l2i
    //   141: ldc 97538338
    //   143: ixor
    //   144: ldc2_w -594174960
    //   147: l2i
    //   148: ldc -91081039
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 3512, -462383021 -> 137, 1803196818 -> 180
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.c : I
    //   186: iflt -> 199
    //   189: ldc2_w -2085138969
    //   192: l2i
    //   193: ldc 1059868162
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w 1823770946
    //   202: l2i
    //   203: ldc 735718142
    //   205: ixor
    //   206: ldc2_w 854712226
    //   209: l2i
    //   210: ldc 1457742857
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 240, -662063026 -> 3518, 2029553732 -> 199
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.CLIENT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w 1220226254
    //   246: l2i
    //   247: ldc 1220226255
    //   249: ixor
    //   250: ldc2_w -1056474567
    //   253: l2i
    //   254: ldc -1056474568
    //   256: ixor
    //   257: ldc2_w -1291659560
    //   260: l2i
    //   261: ldc -1291659560
    //   263: ixor
    //   264: getstatic Perryc.c : I
    //   267: iflt -> 280
    //   270: ldc2_w -872081001
    //   273: l2i
    //   274: ldc -1312935630
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w -1387544937
    //   283: l2i
    //   284: ldc -1984390061
    //   286: ixor
    //   287: ldc2_w 1985980907
    //   290: l2i
    //   291: ldc 801716301
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 320, 606976259 -> 3470, 2044660722 -> 280
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.1 : I
    //   326: ifeq -> 339
    //   329: ldc2_w 903124565
    //   332: l2i
    //   333: ldc 1272045700
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w -1707297350
    //   342: l2i
    //   343: ldc 249947717
    //   345: ixor
    //   346: ldc2_w 670832905
    //   349: l2i
    //   350: ldc -1318399818
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 3482, -392970386 -> 339, 38771264 -> 380
    //   380: aload_0
    //   381: getstatic Perryc.c : I
    //   384: iflt -> 397
    //   387: ldc2_w -219516966
    //   390: l2i
    //   391: ldc -356249209
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w -1290286533
    //   400: l2i
    //   401: ldc -310896526
    //   403: ixor
    //   404: ldc2_w -1856732765
    //   407: l2i
    //   408: ldc -572444850
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 440, -1201940178 -> 397, 1419497648 -> 3480
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc '䷻㌜䶹㶣若ꍠ๴ふ'
    //   447: getstatic Perryc.0 : I
    //   450: ifle -> 463
    //   453: ldc2_w -636029938
    //   456: l2i
    //   457: ldc -793478592
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w -1757228846
    //   466: l2i
    //   467: ldc 2007521705
    //   469: ixor
    //   470: ldc2_w 356934900
    //   473: l2i
    //   474: ldc -1417696744
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 504, -1264893790 -> 3454, 327077071 -> 463
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc '䷼㌁䶾㶶稜'
    //   509: getstatic Perryc.0 : I
    //   512: ifle -> 525
    //   515: ldc2_w -1014859913
    //   518: l2i
    //   519: ldc -940616955
    //   521: ixor
    //   522: goto -> 532
    //   525: ldc2_w -1603646266
    //   528: l2i
    //   529: ldc -1227903169
    //   531: ixor
    //   532: ldc2_w 1267913742
    //   535: l2i
    //   536: ldc 1020818830
    //   538: ixor
    //   539: ixor
    //   540: lookupswitch default -> 3490, 1643070073 -> 568, 1931970034 -> 525
    //   568: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   571: ldc '䷳㌒䶺㶲駱ꍮ๿〰蹷ꖬ੧考煮⅜킬近'
    //   573: getstatic Perryc.1 : I
    //   576: ifeq -> 589
    //   579: ldc2_w 560806533
    //   582: l2i
    //   583: ldc 1609431425
    //   585: ixor
    //   586: goto -> 596
    //   589: ldc2_w 378865703
    //   592: l2i
    //   593: ldc -1375367301
    //   595: ixor
    //   596: ldc2_w 1447649770
    //   599: l2i
    //   600: ldc 1037802901
    //   602: ixor
    //   603: ixor
    //   604: lookupswitch default -> 632, 353517435 -> 3510, 1774209454 -> 589
    //   632: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   635: getstatic Perryc.1 : I
    //   638: ifeq -> 651
    //   641: ldc2_w 157041784
    //   644: l2i
    //   645: ldc 1666504111
    //   647: ixor
    //   648: goto -> 658
    //   651: ldc2_w 1654798653
    //   654: l2i
    //   655: ldc 2130319567
    //   657: ixor
    //   658: ldc2_w 2134056953
    //   661: l2i
    //   662: ldc 765477686
    //   664: ixor
    //   665: ixor
    //   666: lookupswitch default -> 3540, 949734680 -> 651, 1321958717 -> 692
    //   692: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    //   695: getstatic Perryc.1 : I
    //   698: ifeq -> 711
    //   701: ldc2_w -1564328102
    //   704: l2i
    //   705: ldc -1803169465
    //   707: ixor
    //   708: goto -> 718
    //   711: ldc2_w 337891665
    //   714: l2i
    //   715: ldc -619814008
    //   717: ixor
    //   718: ldc2_w 532491992
    //   721: l2i
    //   722: ldc -1364613257
    //   724: ixor
    //   725: ixor
    //   726: lookupswitch default -> 752, -2024577102 -> 3464, -966068739 -> 711
    //   752: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   755: getstatic Perryc.1 : I
    //   758: ifeq -> 771
    //   761: ldc2_w 659475104
    //   764: l2i
    //   765: ldc 1730013476
    //   767: ixor
    //   768: goto -> 778
    //   771: ldc2_w 993364439
    //   774: l2i
    //   775: ldc -917435412
    //   777: ixor
    //   778: ldc2_w -1799980988
    //   781: l2i
    //   782: ldc -821182977
    //   784: ixor
    //   785: ixor
    //   786: lookupswitch default -> 3498, -1444984960 -> 812, 468248127 -> 771
    //   812: putfield fontName : Lbigname/zprestige/webhack/features/setting/Setting;
    //   815: getstatic Perryc.c : I
    //   818: iflt -> 831
    //   821: ldc2_w -951084972
    //   824: l2i
    //   825: ldc 531909309
    //   827: ixor
    //   828: goto -> 838
    //   831: ldc2_w -1381789608
    //   834: l2i
    //   835: ldc 1477216250
    //   837: ixor
    //   838: ldc2_w -303305319
    //   841: l2i
    //   842: ldc 1187585783
    //   844: ixor
    //   845: ixor
    //   846: lookupswitch default -> 872, 185808403 -> 831, 1943609735 -> 3532
    //   872: aload_0
    //   873: getstatic Perryc.c : I
    //   876: iflt -> 889
    //   879: ldc2_w 2116373593
    //   882: l2i
    //   883: ldc -1204323247
    //   885: ixor
    //   886: goto -> 896
    //   889: ldc2_w 883519975
    //   892: l2i
    //   893: ldc 522843959
    //   895: ixor
    //   896: ldc2_w -160940071
    //   899: l2i
    //   900: ldc -246571515
    //   902: ixor
    //   903: ixor
    //   904: lookupswitch default -> 932, -1053322796 -> 3504, -228580180 -> 889
    //   932: aload_0
    //   933: new bigname/zprestige/webhack/features/setting/Setting
    //   936: dup
    //   937: ldc '䷼㌝䶣㶾糧ꍭ๰ぱ蹰'
    //   939: getstatic Perryc.1 : I
    //   942: ifeq -> 955
    //   945: ldc2_w -1409970525
    //   948: l2i
    //   949: ldc 1474430577
    //   951: ixor
    //   952: goto -> 962
    //   955: ldc2_w 746587745
    //   958: l2i
    //   959: ldc -1315033106
    //   961: ixor
    //   962: ldc2_w 2106147556
    //   965: l2i
    //   966: ldc 1742327861
    //   968: ixor
    //   969: ixor
    //   970: lookupswitch default -> 3494, -2024883362 -> 996, -431547901 -> 955
    //   996: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   999: ldc2_w -1049393852
    //   1002: l2i
    //   1003: ldc -1049393851
    //   1005: ixor
    //   1006: getstatic Perryc.c : I
    //   1009: iflt -> 1022
    //   1012: ldc2_w 1400808471
    //   1015: l2i
    //   1016: ldc 680588871
    //   1018: ixor
    //   1019: goto -> 1029
    //   1022: ldc2_w -1201275942
    //   1025: l2i
    //   1026: ldc -1843586194
    //   1028: ixor
    //   1029: ldc2_w 1502549745
    //   1032: l2i
    //   1033: ldc -1338540470
    //   1035: ixor
    //   1036: ixor
    //   1037: lookupswitch default -> 3442, -1839842581 -> 1022, -1010792433 -> 1064
    //   1064: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1067: ldc '䷮㌞䶸㶸漏ꍩ๼ぢ踣ꖢ਩耑焯'
    //   1069: getstatic Perryc.1 : I
    //   1072: ifeq -> 1085
    //   1075: ldc2_w 1962059005
    //   1078: l2i
    //   1079: ldc 1918871889
    //   1081: ixor
    //   1082: goto -> 1092
    //   1085: ldc2_w 1650702025
    //   1088: l2i
    //   1089: ldc -1275147081
    //   1091: ixor
    //   1092: ldc2_w -471787464
    //   1095: l2i
    //   1096: ldc 49412612
    //   1098: ixor
    //   1099: ixor
    //   1100: lookupswitch default -> 3458, -406982768 -> 1085, 814585922 -> 1128
    //   1128: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1131: getstatic Perryc.1 : I
    //   1134: ifeq -> 1147
    //   1137: ldc2_w 1195015255
    //   1140: l2i
    //   1141: ldc -1971588176
    //   1143: ixor
    //   1144: goto -> 1155
    //   1147: ldc2_w 1425846751
    //   1150: l2i
    //   1151: ldc_w -669856868
    //   1154: ixor
    //   1155: ldc2_w 22646817
    //   1158: l2i
    //   1159: ldc_w 1347349166
    //   1162: ixor
    //   1163: ixor
    //   1164: lookupswitch default -> 3506, -1672022680 -> 1147, -570883892 -> 1192
    //   1192: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    //   1195: getstatic Perryc.0 : I
    //   1198: ifle -> 1212
    //   1201: ldc2_w -1555693862
    //   1204: l2i
    //   1205: ldc_w -347616947
    //   1208: ixor
    //   1209: goto -> 1220
    //   1212: ldc2_w 612845183
    //   1215: l2i
    //   1216: ldc_w -772716383
    //   1219: ixor
    //   1220: ldc2_w 958106852
    //   1223: l2i
    //   1224: ldc_w -1410291283
    //   1227: ixor
    //   1228: ixor
    //   1229: lookupswitch default -> 3486, -622259490 -> 1212, 1738353559 -> 1256
    //   1256: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1259: getstatic Perryc.0 : I
    //   1262: ifle -> 1276
    //   1265: ldc2_w 1947950740
    //   1268: l2i
    //   1269: ldc_w -640929355
    //   1272: ixor
    //   1273: goto -> 1284
    //   1276: ldc2_w -381404517
    //   1279: l2i
    //   1280: ldc_w -470763953
    //   1283: ixor
    //   1284: ldc2_w -1056228716
    //   1287: l2i
    //   1288: ldc_w 730510238
    //   1291: ixor
    //   1292: ixor
    //   1293: lookupswitch default -> 1320, 687221275 -> 1276, 1196877355 -> 3528
    //   1320: putfield antiAlias : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1323: getstatic Perryc.0 : I
    //   1326: ifle -> 1340
    //   1329: ldc2_w -1215344816
    //   1332: l2i
    //   1333: ldc_w -501325224
    //   1336: ixor
    //   1337: goto -> 1348
    //   1340: ldc2_w 1362877959
    //   1343: l2i
    //   1344: ldc_w -1138272991
    //   1347: ixor
    //   1348: ldc2_w -537599708
    //   1351: l2i
    //   1352: ldc_w -554558499
    //   1355: ixor
    //   1356: ixor
    //   1357: lookupswitch default -> 1384, -1335654112 -> 1340, 1419237361 -> 3444
    //   1384: aload_0
    //   1385: getstatic Perryc.0 : I
    //   1388: ifle -> 1402
    //   1391: ldc2_w -1549809089
    //   1394: l2i
    //   1395: ldc_w -39120417
    //   1398: ixor
    //   1399: goto -> 1410
    //   1402: ldc2_w 536221999
    //   1405: l2i
    //   1406: ldc_w 1086402518
    //   1409: ixor
    //   1410: ldc2_w 2023672567
    //   1413: l2i
    //   1414: ldc_w -192004194
    //   1417: ixor
    //   1418: ixor
    //   1419: lookupswitch default -> 1444, -769380727 -> 3448, -499647503 -> 1402
    //   1444: aload_0
    //   1445: new bigname/zprestige/webhack/features/setting/Setting
    //   1448: dup
    //   1449: ldc_w '䷰㌖䶣㶥肋ꍢ๪'
    //   1452: getstatic Perryc.1 : I
    //   1455: ifeq -> 1469
    //   1458: ldc2_w 1253216881
    //   1461: l2i
    //   1462: ldc_w 1501839138
    //   1465: ixor
    //   1466: goto -> 1477
    //   1469: ldc2_w 214989426
    //   1472: l2i
    //   1473: ldc_w -283711452
    //   1476: ixor
    //   1477: ldc2_w -2105785930
    //   1480: l2i
    //   1481: ldc_w -425169354
    //   1484: ixor
    //   1485: ixor
    //   1486: lookupswitch default -> 3534, -2028814890 -> 1512, 2011333331 -> 1469
    //   1512: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1515: ldc2_w 946608687
    //   1518: l2i
    //   1519: ldc_w 946608686
    //   1522: ixor
    //   1523: getstatic Perryc.c : I
    //   1526: iflt -> 1540
    //   1529: ldc2_w -170166086
    //   1532: l2i
    //   1533: ldc_w 1376262591
    //   1536: ixor
    //   1537: goto -> 1548
    //   1540: ldc2_w 1480505800
    //   1543: l2i
    //   1544: ldc_w 2105832818
    //   1547: ixor
    //   1548: ldc2_w -448267186
    //   1551: l2i
    //   1552: ldc_w -1487991887
    //   1555: ixor
    //   1556: ixor
    //   1557: lookupswitch default -> 3440, -438593798 -> 1540, 1739733829 -> 1584
    //   1584: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1587: ldc_w '䷩㌛䶾㶹凜ꍤ๫〰蹥ꖫਲ਼聋'
    //   1590: getstatic Perryc.c : I
    //   1593: iflt -> 1607
    //   1596: ldc2_w -1278180459
    //   1599: l2i
    //   1600: ldc_w -622256587
    //   1603: ixor
    //   1604: goto -> 1615
    //   1607: ldc2_w 2053075258
    //   1610: l2i
    //   1611: ldc_w 1064665509
    //   1614: ixor
    //   1615: ldc2_w 1227904711
    //   1618: l2i
    //   1619: ldc_w 1430630499
    //   1622: ixor
    //   1623: ixor
    //   1624: lookupswitch default -> 3492, 1499403835 -> 1652, 1967946500 -> 1607
    //   1652: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1655: getstatic Perryc.1 : I
    //   1658: ifeq -> 1672
    //   1661: ldc2_w -1276311723
    //   1664: l2i
    //   1665: ldc_w 476259186
    //   1668: ixor
    //   1669: goto -> 1680
    //   1672: ldc2_w -614811510
    //   1675: l2i
    //   1676: ldc_w -820967670
    //   1679: ixor
    //   1680: ldc2_w -660893378
    //   1683: l2i
    //   1684: ldc_w -1625313043
    //   1687: ixor
    //   1688: ixor
    //   1689: lookupswitch default -> 1716, -401996300 -> 3524, 1643676482 -> 1672
    //   1716: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    //   1719: getstatic Perryc.0 : I
    //   1722: ifle -> 1736
    //   1725: ldc2_w 703493469
    //   1728: l2i
    //   1729: ldc_w -1604741209
    //   1732: ixor
    //   1733: goto -> 1744
    //   1736: ldc2_w -1608534105
    //   1739: l2i
    //   1740: ldc_w -1714497767
    //   1743: ixor
    //   1744: ldc2_w 604371034
    //   1747: l2i
    //   1748: ldc_w -1790096008
    //   1751: ixor
    //   1752: ixor
    //   1753: lookupswitch default -> 1780, 317688909 -> 1736, 956258264 -> 3472
    //   1780: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1783: getstatic Perryc.1 : I
    //   1786: ifeq -> 1800
    //   1789: ldc2_w 410934796
    //   1792: l2i
    //   1793: ldc_w -1345450358
    //   1796: ixor
    //   1797: goto -> 1808
    //   1800: ldc2_w 354635225
    //   1803: l2i
    //   1804: ldc_w 491634410
    //   1807: ixor
    //   1808: ldc2_w -901701853
    //   1811: l2i
    //   1812: ldc_w 1013066347
    //   1815: ixor
    //   1816: ixor
    //   1817: lookupswitch default -> 1844, 167822778 -> 1800, 1100178894 -> 3446
    //   1844: putfield fractionalMetrics : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1847: getstatic Perryc.c : I
    //   1850: iflt -> 1864
    //   1853: ldc2_w 858291107
    //   1856: l2i
    //   1857: ldc_w -1610175613
    //   1860: ixor
    //   1861: goto -> 1872
    //   1864: ldc2_w 1259874936
    //   1867: l2i
    //   1868: ldc_w -177567662
    //   1871: ixor
    //   1872: ldc2_w -1900851987
    //   1875: l2i
    //   1876: ldc_w -510237370
    //   1879: ixor
    //   1880: ixor
    //   1881: lookupswitch default -> 1908, -66324085 -> 3508, 638005754 -> 1864
    //   1908: aload_0
    //   1909: getstatic Perryc.c : I
    //   1912: iflt -> 1926
    //   1915: ldc2_w 199665441
    //   1918: l2i
    //   1919: ldc_w 871180130
    //   1922: ixor
    //   1923: goto -> 1934
    //   1926: ldc2_w -2038502216
    //   1929: l2i
    //   1930: ldc_w 826434266
    //   1933: ixor
    //   1934: ldc2_w 489887099
    //   1937: l2i
    //   1938: ldc_w 2060060610
    //   1941: ixor
    //   1942: ixor
    //   1943: lookupswitch default -> 3476, -792355621 -> 1968, 1609732858 -> 1926
    //   1968: aload_0
    //   1969: new bigname/zprestige/webhack/features/setting/Setting
    //   1972: dup
    //   1973: ldc_w '䷮㌚䶭㶲'
    //   1976: getstatic Perryc.0 : I
    //   1979: ifle -> 1993
    //   1982: ldc2_w -1261514204
    //   1985: l2i
    //   1986: ldc_w 299366516
    //   1989: ixor
    //   1990: goto -> 2001
    //   1993: ldc2_w -1919338733
    //   1996: l2i
    //   1997: ldc_w -1058288685
    //   2000: ixor
    //   2001: ldc2_w 474578726
    //   2004: l2i
    //   2005: ldc_w -1811397831
    //   2008: ixor
    //   2009: ixor
    //   2010: lookupswitch default -> 3450, -986464033 -> 2036, 760747599 -> 1993
    //   2036: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2039: ldc2_w -1010760991
    //   2042: l2i
    //   2043: ldc_w -1010760973
    //   2046: ixor
    //   2047: getstatic Perryc.c : I
    //   2050: iflt -> 2064
    //   2053: ldc2_w -332058118
    //   2056: l2i
    //   2057: ldc_w 1155103064
    //   2060: ixor
    //   2061: goto -> 2072
    //   2064: ldc2_w 2045261016
    //   2067: l2i
    //   2068: ldc_w 896579209
    //   2071: ixor
    //   2072: ldc2_w -1129059899
    //   2075: l2i
    //   2076: ldc_w -1272783481
    //   2079: ixor
    //   2080: ixor
    //   2081: lookupswitch default -> 3456, -1602388768 -> 2064, 1141487123 -> 2108
    //   2108: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2111: ldc2_w -1247747014
    //   2114: l2i
    //   2115: ldc_w -1247747018
    //   2118: ixor
    //   2119: getstatic Perryc.1 : I
    //   2122: ifeq -> 2136
    //   2125: ldc2_w 1673886179
    //   2128: l2i
    //   2129: ldc_w 967530350
    //   2132: ixor
    //   2133: goto -> 2144
    //   2136: ldc2_w 1619194904
    //   2139: l2i
    //   2140: ldc_w -1827858443
    //   2143: ixor
    //   2144: ldc2_w 502723918
    //   2147: l2i
    //   2148: ldc_w -648176753
    //   2151: ixor
    //   2152: ixor
    //   2153: lookupswitch default -> 2180, -1631240116 -> 3514, -448011464 -> 2136
    //   2180: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2183: ldc2_w 1825955578
    //   2186: l2i
    //   2187: ldc_w 1825955556
    //   2190: ixor
    //   2191: getstatic Perryc.0 : I
    //   2194: ifle -> 2208
    //   2197: ldc2_w -1736659321
    //   2200: l2i
    //   2201: ldc_w 119094413
    //   2204: ixor
    //   2205: goto -> 2216
    //   2208: ldc2_w -384105713
    //   2211: l2i
    //   2212: ldc_w -1141603950
    //   2215: ixor
    //   2216: ldc2_w -1517410494
    //   2219: l2i
    //   2220: ldc_w 1776573966
    //   2223: ixor
    //   2224: ixor
    //   2225: lookupswitch default -> 3522, -1635386415 -> 2252, 1393552198 -> 2208
    //   2252: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2255: ldc_w '䷮㌚䶭㶲駱ꍮ๿〰蹷ꖬ੧考煮⅜킬近'
    //   2258: getstatic Perryc.0 : I
    //   2261: ifle -> 2275
    //   2264: ldc2_w -665549618
    //   2267: l2i
    //   2268: ldc_w -464873612
    //   2271: ixor
    //   2272: goto -> 2283
    //   2275: ldc2_w 2115691023
    //   2278: l2i
    //   2279: ldc_w -1310499627
    //   2282: ixor
    //   2283: ldc2_w 1485528711
    //   2286: l2i
    //   2287: ldc_w -265820774
    //   2290: ixor
    //   2291: ixor
    //   2292: lookupswitch default -> 3530, -1800230745 -> 2275, 1733625287 -> 2320
    //   2320: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2323: getstatic Perryc.0 : I
    //   2326: ifle -> 2340
    //   2329: ldc2_w 1825710803
    //   2332: l2i
    //   2333: ldc_w -885257656
    //   2336: ixor
    //   2337: goto -> 2348
    //   2340: ldc2_w 1297333155
    //   2343: l2i
    //   2344: ldc_w -2040868090
    //   2347: ixor
    //   2348: ldc2_w -1668453179
    //   2351: l2i
    //   2352: ldc_w -206831276
    //   2355: ixor
    //   2356: ixor
    //   2357: lookupswitch default -> 3484, -1540881100 -> 2384, -925940470 -> 2340
    //   2384: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   2387: getstatic Perryc.0 : I
    //   2390: ifle -> 2404
    //   2393: ldc2_w 344848288
    //   2396: l2i
    //   2397: ldc_w -1522834703
    //   2400: ixor
    //   2401: goto -> 2412
    //   2404: ldc2_w -1274354594
    //   2407: l2i
    //   2408: ldc_w -765997764
    //   2411: ixor
    //   2412: ldc2_w 1177361165
    //   2415: l2i
    //   2416: ldc_w 778856055
    //   2419: ixor
    //   2420: ixor
    //   2421: lookupswitch default -> 2448, -1681073109 -> 2404, -638064597 -> 3468
    //   2448: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2451: getstatic Perryc.c : I
    //   2454: iflt -> 2468
    //   2457: ldc2_w 942103435
    //   2460: l2i
    //   2461: ldc_w -1347452041
    //   2464: ixor
    //   2465: goto -> 2476
    //   2468: ldc2_w 2050358108
    //   2471: l2i
    //   2472: ldc_w -149456818
    //   2475: ixor
    //   2476: ldc2_w 754142205
    //   2479: l2i
    //   2480: ldc_w 416876578
    //   2483: ixor
    //   2484: ixor
    //   2485: lookupswitch default -> 3526, -1549624541 -> 2468, -1190608691 -> 2512
    //   2512: putfield fontSize : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2515: getstatic Perryc.1 : I
    //   2518: ifeq -> 2532
    //   2521: ldc2_w -666923163
    //   2524: l2i
    //   2525: ldc_w 4378450
    //   2528: ixor
    //   2529: goto -> 2540
    //   2532: ldc2_w -169446401
    //   2535: l2i
    //   2536: ldc_w 454528142
    //   2539: ixor
    //   2540: ldc2_w -1106365343
    //   2543: l2i
    //   2544: ldc_w 780135908
    //   2547: ixor
    //   2548: ixor
    //   2549: lookupswitch default -> 3452, 1208785330 -> 2532, 2122327796 -> 2576
    //   2576: aload_0
    //   2577: getstatic Perryc.0 : I
    //   2580: ifle -> 2594
    //   2583: ldc2_w -1783799485
    //   2586: l2i
    //   2587: ldc_w 1553941874
    //   2590: ixor
    //   2591: goto -> 2602
    //   2594: ldc2_w -1542680701
    //   2597: l2i
    //   2598: ldc_w 1160620331
    //   2601: ixor
    //   2602: ldc2_w -492016431
    //   2605: l2i
    //   2606: ldc_w 2080409046
    //   2609: ixor
    //   2610: ixor
    //   2611: lookupswitch default -> 2636, 101071789 -> 2594, 1470025014 -> 3544
    //   2636: aload_0
    //   2637: new bigname/zprestige/webhack/features/setting/Setting
    //   2640: dup
    //   2641: ldc_w '䷮㌇䶮㶻寧'
    //   2644: getstatic Perryc.0 : I
    //   2647: ifle -> 2661
    //   2650: ldc2_w -17139462
    //   2653: l2i
    //   2654: ldc_w 595778549
    //   2657: ixor
    //   2658: goto -> 2669
    //   2661: ldc2_w -1460699469
    //   2664: l2i
    //   2665: ldc_w -4071823
    //   2668: ixor
    //   2669: ldc2_w 1549699249
    //   2672: l2i
    //   2673: ldc_w 1924664535
    //   2676: ixor
    //   2677: ixor
    //   2678: lookupswitch default -> 2704, -207739031 -> 3500, 1537783898 -> 2661
    //   2704: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2707: ldc2_w 448834130
    //   2710: l2i
    //   2711: ldc_w 448834131
    //   2714: ixor
    //   2715: getstatic Perryc.c : I
    //   2718: iflt -> 2732
    //   2721: ldc2_w -753580639
    //   2724: l2i
    //   2725: ldc_w 722770933
    //   2728: ixor
    //   2729: goto -> 2740
    //   2732: ldc2_w 1078568251
    //   2735: l2i
    //   2736: ldc_w -2037629792
    //   2739: ixor
    //   2740: ldc2_w -645767589
    //   2743: l2i
    //   2744: ldc_w -910411123
    //   2747: ixor
    //   2748: ixor
    //   2749: lookupswitch default -> 3502, -688128691 -> 2776, -398476670 -> 2732
    //   2776: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2779: ldc2_w -92584216
    //   2782: l2i
    //   2783: ldc_w -92584216
    //   2786: ixor
    //   2787: getstatic Perryc.c : I
    //   2790: iflt -> 2804
    //   2793: ldc2_w 625433059
    //   2796: l2i
    //   2797: ldc_w -867718889
    //   2800: ixor
    //   2801: goto -> 2812
    //   2804: ldc2_w -2006387750
    //   2807: l2i
    //   2808: ldc_w 1561432877
    //   2811: ixor
    //   2812: ldc2_w -1565242474
    //   2815: l2i
    //   2816: ldc_w -752128463
    //   2819: ixor
    //   2820: ixor
    //   2821: lookupswitch default -> 3538, -1734355629 -> 2804, -1528412848 -> 2848
    //   2848: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2851: ldc2_w 2115899810
    //   2854: l2i
    //   2855: ldc_w 2115899809
    //   2858: ixor
    //   2859: getstatic Perryc.1 : I
    //   2862: ifeq -> 2876
    //   2865: ldc2_w 64892280
    //   2868: l2i
    //   2869: ldc_w -1936520920
    //   2872: ixor
    //   2873: goto -> 2884
    //   2876: ldc2_w -1898733103
    //   2879: l2i
    //   2880: ldc_w -92537047
    //   2883: ixor
    //   2884: ldc2_w 1840906446
    //   2887: l2i
    //   2888: ldc_w -2084020281
    //   2891: ixor
    //   2892: ixor
    //   2893: lookupswitch default -> 2920, -2028833871 -> 2876, 1631550297 -> 3536
    //   2920: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   2923: ldc_w '䷮㌇䶮㶻寧ꌡ๶ぶ踣ꖰਢ聅照⅝킶辋閞'
    //   2926: getstatic Perryc.0 : I
    //   2929: ifle -> 2943
    //   2932: ldc2_w 1524277621
    //   2935: l2i
    //   2936: ldc_w -957451011
    //   2939: ixor
    //   2940: goto -> 2951
    //   2943: ldc2_w -1442251752
    //   2946: l2i
    //   2947: ldc_w -1966498052
    //   2950: ixor
    //   2951: ldc2_w -1945960163
    //   2954: l2i
    //   2955: ldc_w 1602543069
    //   2958: ixor
    //   2959: ixor
    //   2960: lookupswitch default -> 3488, -213467612 -> 2988, 1337133384 -> 2943
    //   2988: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2991: getstatic Perryc.1 : I
    //   2994: ifeq -> 3008
    //   2997: ldc2_w 918571204
    //   3000: l2i
    //   3001: ldc_w -1548852544
    //   3004: ixor
    //   3005: goto -> 3016
    //   3008: ldc2_w -865564412
    //   3011: l2i
    //   3012: ldc_w -475251083
    //   3015: ixor
    //   3016: ldc2_w 650927733
    //   3019: l2i
    //   3020: ldc_w 1550682351
    //   3023: ixor
    //   3024: ixor
    //   3025: lookupswitch default -> 3474, -271582050 -> 3008, 1432707563 -> 3052
    //   3052: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   3055: getstatic Perryc.c : I
    //   3058: iflt -> 3072
    //   3061: ldc2_w 1951670207
    //   3064: l2i
    //   3065: ldc_w 551055733
    //   3068: ixor
    //   3069: goto -> 3080
    //   3072: ldc2_w -1911924124
    //   3075: l2i
    //   3076: ldc_w 250982560
    //   3079: ixor
    //   3080: ldc2_w 853591595
    //   3083: l2i
    //   3084: ldc_w -159632157
    //   3087: ixor
    //   3088: ixor
    //   3089: lookupswitch default -> 3116, -1877959678 -> 3466, 2089918285 -> 3072
    //   3116: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3119: getstatic Perryc.1 : I
    //   3122: ifeq -> 3136
    //   3125: ldc2_w -1531300551
    //   3128: l2i
    //   3129: ldc_w -1319033065
    //   3132: ixor
    //   3133: goto -> 3144
    //   3136: ldc2_w 438733940
    //   3139: l2i
    //   3140: ldc_w 56492468
    //   3143: ixor
    //   3144: ldc2_w -1346830962
    //   3147: l2i
    //   3148: ldc_w 1701738517
    //   3151: ixor
    //   3152: ixor
    //   3153: lookupswitch default -> 3520, -743569317 -> 3180, -552757323 -> 3136
    //   3180: putfield fontStyle : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3183: getstatic Perryc.1 : I
    //   3186: ifeq -> 3200
    //   3189: ldc2_w 1255997805
    //   3192: l2i
    //   3193: ldc_w -1599722856
    //   3196: ixor
    //   3197: goto -> 3208
    //   3200: ldc2_w 967869781
    //   3203: l2i
    //   3204: ldc_w -1113339199
    //   3207: ixor
    //   3208: ldc2_w -1485631197
    //   3211: l2i
    //   3212: ldc_w -920593100
    //   3215: ixor
    //   3216: ixor
    //   3217: lookupswitch default -> 3244, -2077693982 -> 3478, 212646783 -> 3200
    //   3244: aload_0
    //   3245: ldc2_w -1069985964
    //   3248: l2i
    //   3249: ldc_w -1069985964
    //   3252: ixor
    //   3253: getstatic Perryc.1 : I
    //   3256: ifeq -> 3270
    //   3259: ldc2_w 1850247889
    //   3262: l2i
    //   3263: ldc_w -1358979677
    //   3266: ixor
    //   3267: goto -> 3278
    //   3270: ldc2_w -801905210
    //   3273: l2i
    //   3274: ldc_w -604693103
    //   3277: ixor
    //   3278: ldc2_w 1723237802
    //   3281: l2i
    //   3282: ldc_w 30588868
    //   3285: ixor
    //   3286: ixor
    //   3287: lookupswitch default -> 3542, -1479332580 -> 3270, 1822605881 -> 3312
    //   3312: putfield reloadFont : Z
    //   3315: getstatic Perryc.0 : I
    //   3318: ifle -> 3332
    //   3321: ldc2_w -1147029980
    //   3324: l2i
    //   3325: ldc_w 6908066
    //   3328: ixor
    //   3329: goto -> 3340
    //   3332: ldc2_w 410344901
    //   3335: l2i
    //   3336: ldc_w 1371320201
    //   3339: ixor
    //   3340: ldc2_w 703023526
    //   3343: l2i
    //   3344: ldc_w 460423648
    //   3347: ixor
    //   3348: ixor
    //   3349: lookupswitch default -> 3376, -1990322496 -> 3516, -1849707919 -> 3332
    //   3376: aload_0
    //   3377: getstatic Perryc.1 : I
    //   3380: ifeq -> 3394
    //   3383: ldc2_w 488159012
    //   3386: l2i
    //   3387: ldc_w 1554972991
    //   3390: ixor
    //   3391: goto -> 3402
    //   3394: ldc2_w -194595508
    //   3397: l2i
    //   3398: ldc_w -1659621195
    //   3401: ixor
    //   3402: ldc2_w 565363029
    //   3405: l2i
    //   3406: ldc_w -421849207
    //   3409: ixor
    //   3410: ixor
    //   3411: lookupswitch default -> 3460, -2032246585 -> 3394, -1373940955 -> 3436
    //   3436: putstatic bigname/zprestige/webhack/features/modules/Client/FontMod.INSTANCE : Lbigname/zprestige/webhack/features/modules/Client/FontMod;
    //   3439: return
    //   3440: aconst_null
    //   3441: athrow
    //   3442: aconst_null
    //   3443: athrow
    //   3444: aconst_null
    //   3445: athrow
    //   3446: aconst_null
    //   3447: athrow
    //   3448: aconst_null
    //   3449: athrow
    //   3450: aconst_null
    //   3451: athrow
    //   3452: aconst_null
    //   3453: athrow
    //   3454: aconst_null
    //   3455: athrow
    //   3456: aconst_null
    //   3457: athrow
    //   3458: aconst_null
    //   3459: athrow
    //   3460: aconst_null
    //   3461: athrow
    //   3462: aconst_null
    //   3463: athrow
    //   3464: aconst_null
    //   3465: athrow
    //   3466: aconst_null
    //   3467: athrow
    //   3468: aconst_null
    //   3469: athrow
    //   3470: aconst_null
    //   3471: athrow
    //   3472: aconst_null
    //   3473: athrow
    //   3474: aconst_null
    //   3475: athrow
    //   3476: aconst_null
    //   3477: athrow
    //   3478: aconst_null
    //   3479: athrow
    //   3480: aconst_null
    //   3481: athrow
    //   3482: aconst_null
    //   3483: athrow
    //   3484: aconst_null
    //   3485: athrow
    //   3486: aconst_null
    //   3487: athrow
    //   3488: aconst_null
    //   3489: athrow
    //   3490: aconst_null
    //   3491: athrow
    //   3492: aconst_null
    //   3493: athrow
    //   3494: aconst_null
    //   3495: athrow
    //   3496: aconst_null
    //   3497: athrow
    //   3498: aconst_null
    //   3499: athrow
    //   3500: aconst_null
    //   3501: athrow
    //   3502: aconst_null
    //   3503: athrow
    //   3504: aconst_null
    //   3505: athrow
    //   3506: aconst_null
    //   3507: athrow
    //   3508: aconst_null
    //   3509: athrow
    //   3510: aconst_null
    //   3511: athrow
    //   3512: aconst_null
    //   3513: athrow
    //   3514: aconst_null
    //   3515: athrow
    //   3516: aconst_null
    //   3517: athrow
    //   3518: aconst_null
    //   3519: athrow
    //   3520: aconst_null
    //   3521: athrow
    //   3522: aconst_null
    //   3523: athrow
    //   3524: aconst_null
    //   3525: athrow
    //   3526: aconst_null
    //   3527: athrow
    //   3528: aconst_null
    //   3529: athrow
    //   3530: aconst_null
    //   3531: athrow
    //   3532: aconst_null
    //   3533: athrow
    //   3534: aconst_null
    //   3535: athrow
    //   3536: aconst_null
    //   3537: athrow
    //   3538: aconst_null
    //   3539: athrow
    //   3540: aconst_null
    //   3541: athrow
    //   3542: aconst_null
    //   3543: athrow
    //   3544: aconst_null
    //   3545: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	3440	0	this	Lbigname/zprestige/webhack/features/modules/Client/FontMod;
  }
  
  public static FontMod getInstance() {
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
  
  public static boolean checkFont(String font, boolean message) {
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
  
  public void onTick() {
    Perry1.44(this, (int)-1522144375L ^ 0xC7DD98C4);
  }
  
  @SubscribeEvent
  public void onSettingChange(ClientEvent event) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Client\FontMod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */