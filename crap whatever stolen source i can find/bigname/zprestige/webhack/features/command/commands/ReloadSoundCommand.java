package bigname.zprestige.webhack.features.command.commands;

import bigname.zprestige.webhack.features.command.Command;

public class ReloadSoundCommand extends Command {
  public void execute(String[] commands) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2629
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 2621
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2613
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: ldc net/minecraft/client/audio/SoundHandler
    //   26: getstatic Perryc.0 : I
    //   29: ifle -> 42
    //   32: ldc2_w -1940768901
    //   35: l2i
    //   36: ldc -1120659244
    //   38: ixor
    //   39: goto -> 49
    //   42: ldc2_w -1538457478
    //   45: l2i
    //   46: ldc -292353720
    //   48: ixor
    //   49: ldc2_w 383702256
    //   52: l2i
    //   53: ldc -1430445057
    //   55: ixor
    //   56: ixor
    //   57: lookupswitch default -> 84, -1928996704 -> 2548, 2136323538 -> 42
    //   84: getstatic bigname/zprestige/webhack/features/command/commands/ReloadSoundCommand.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.c : I
    //   90: iflt -> 103
    //   93: ldc2_w 2052124324
    //   96: l2i
    //   97: ldc 120021042
    //   99: ixor
    //   100: goto -> 110
    //   103: ldc2_w 207075758
    //   106: l2i
    //   107: ldc 1609501686
    //   109: ixor
    //   110: ldc2_w 532456557
    //   113: l2i
    //   114: ldc 1447385100
    //   116: ixor
    //   117: ixor
    //   118: lookupswitch default -> 2564, 440487481 -> 144, 881750775 -> 103
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual func_147118_V : ()Lnet/minecraft/client/audio/SoundHandler;
    //   151: goto -> 155
    //   154: athrow
    //   155: ldc2_w -1369554258
    //   158: l2i
    //   159: ldc -1369554260
    //   161: ixor
    //   162: anewarray java/lang/String
    //   165: dup
    //   166: ldc2_w 638089652
    //   169: l2i
    //   170: ldc 638089652
    //   172: ixor
    //   173: ldc 'Ή㌝ϼ좝먟๸縸筡'
    //   175: getstatic Perryc.0 : I
    //   178: ifle -> 191
    //   181: ldc2_w 1432666505
    //   184: l2i
    //   185: ldc -71218822
    //   187: ixor
    //   188: goto -> 198
    //   191: ldc2_w -539600927
    //   194: l2i
    //   195: ldc -217951084
    //   197: ixor
    //   198: ldc2_w -1756851029
    //   201: l2i
    //   202: ldc 111481708
    //   204: ixor
    //   205: ixor
    //   206: lookupswitch default -> 232, -377698955 -> 191, 1061687092 -> 2570
    //   232: goto -> 236
    //   235: athrow
    //   236: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   239: goto -> 243
    //   242: athrow
    //   243: aastore
    //   244: dup
    //   245: ldc2_w 2022537797
    //   248: l2i
    //   249: ldc 2022537796
    //   251: ixor
    //   252: ldc 'Ή㌝ϼ좝먟๸縸筡'
    //   254: getstatic Perryc.1 : I
    //   257: ifeq -> 270
    //   260: ldc2_w -617832879
    //   263: l2i
    //   264: ldc 443578984
    //   266: ixor
    //   267: goto -> 277
    //   270: ldc2_w 1990744060
    //   273: l2i
    //   274: ldc 1211005833
    //   276: ixor
    //   277: ldc2_w 480328940
    //   280: l2i
    //   281: ldc -259069170
    //   283: ixor
    //   284: ixor
    //   285: lookupswitch default -> 312, 762524635 -> 2556, 1328081642 -> 270
    //   312: goto -> 316
    //   315: athrow
    //   316: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   319: goto -> 323
    //   322: athrow
    //   323: aastore
    //   324: getstatic Perryc.1 : I
    //   327: ifeq -> 340
    //   330: ldc2_w -1253174349
    //   333: l2i
    //   334: ldc 1957126448
    //   336: ixor
    //   337: goto -> 347
    //   340: ldc2_w -162667237
    //   343: l2i
    //   344: ldc 1860071692
    //   346: ixor
    //   347: ldc2_w -330530441
    //   350: l2i
    //   351: ldc -103651430
    //   353: ixor
    //   354: ixor
    //   355: lookupswitch default -> 380, -1357713511 -> 340, -730360722 -> 2540
    //   380: goto -> 384
    //   383: athrow
    //   384: invokestatic getPrivateValue : (Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;
    //   387: goto -> 391
    //   390: athrow
    //   391: checkcast net/minecraft/client/audio/SoundManager
    //   394: getstatic Perryc.0 : I
    //   397: ifle -> 410
    //   400: ldc2_w -349635950
    //   403: l2i
    //   404: ldc 159855108
    //   406: ixor
    //   407: goto -> 417
    //   410: ldc2_w -1917115045
    //   413: l2i
    //   414: ldc 1038692023
    //   416: ixor
    //   417: ldc2_w -784124277
    //   420: l2i
    //   421: ldc 810170175
    //   423: ixor
    //   424: ixor
    //   425: lookupswitch default -> 452, 61262114 -> 2574, 1714755848 -> 410
    //   452: astore_2
    //   453: getstatic Perryc.1 : I
    //   456: ifeq -> 469
    //   459: ldc2_w -753655052
    //   462: l2i
    //   463: ldc -1248252882
    //   465: ixor
    //   466: goto -> 476
    //   469: ldc2_w -2126350021
    //   472: l2i
    //   473: ldc 1282549377
    //   475: ixor
    //   476: ldc2_w 249714674
    //   479: l2i
    //   480: ldc 1262329684
    //   482: ixor
    //   483: ixor
    //   484: lookupswitch default -> 2594, -1997564132 -> 512, 592627324 -> 469
    //   512: aload_2
    //   513: getstatic Perryc.1 : I
    //   516: ifeq -> 529
    //   519: ldc2_w 1785766485
    //   522: l2i
    //   523: ldc 724941415
    //   525: ixor
    //   526: goto -> 536
    //   529: ldc2_w 1493067132
    //   532: l2i
    //   533: ldc -1319208958
    //   535: ixor
    //   536: ldc2_w 566578538
    //   539: l2i
    //   540: ldc -1050869999
    //   542: ixor
    //   543: ixor
    //   544: lookupswitch default -> 2588, -1579374007 -> 529, 154775301 -> 572
    //   572: goto -> 576
    //   575: athrow
    //   576: invokevirtual func_148596_a : ()V
    //   579: goto -> 583
    //   582: athrow
    //   583: new java/lang/StringBuilder
    //   586: dup
    //   587: getstatic Perryc.0 : I
    //   590: ifle -> 603
    //   593: ldc2_w 752072299
    //   596: l2i
    //   597: ldc -81975635
    //   599: ixor
    //   600: goto -> 610
    //   603: ldc2_w -1804889139
    //   606: l2i
    //   607: ldc 2120544646
    //   609: ixor
    //   610: ldc2_w -319624950
    //   613: l2i
    //   614: ldc 1177500939
    //   616: ixor
    //   617: ixor
    //   618: lookupswitch default -> 2572, 1087551050 -> 644, 2098414791 -> 603
    //   644: goto -> 648
    //   647: athrow
    //   648: invokespecial <init> : ()V
    //   651: goto -> 655
    //   654: athrow
    //   655: getstatic Perryc.c : I
    //   658: iflt -> 671
    //   661: ldc2_w -41420772
    //   664: l2i
    //   665: ldc 1234663377
    //   667: ixor
    //   668: goto -> 678
    //   671: ldc2_w -1038770375
    //   674: l2i
    //   675: ldc -1413036657
    //   677: ixor
    //   678: ldc2_w -1721541099
    //   681: l2i
    //   682: ldc 723208530
    //   684: ixor
    //   685: ixor
    //   686: lookupswitch default -> 712, 107518090 -> 2600, 382654268 -> 671
    //   712: getstatic com/mojang/realmsclient/gui/ChatFormatting.GREEN : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   715: getstatic Perryc.0 : I
    //   718: ifle -> 731
    //   721: ldc2_w 64981487
    //   724: l2i
    //   725: ldc -25848158
    //   727: ixor
    //   728: goto -> 738
    //   731: ldc2_w 2056689042
    //   734: l2i
    //   735: ldc 1464814212
    //   737: ixor
    //   738: ldc2_w -1536616058
    //   741: l2i
    //   742: ldc -1367163616
    //   744: ixor
    //   745: ixor
    //   746: lookupswitch default -> 772, -1996055138 -> 731, -146686997 -> 2602
    //   772: goto -> 776
    //   775: athrow
    //   776: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   779: goto -> 783
    //   782: athrow
    //   783: ldc 'Ψ㌖ϴ좿먟๼縻笤뭎ਲ칄葢扖黌辆?剽ꜳ豼俿'
    //   785: getstatic Perryc.c : I
    //   788: iflt -> 801
    //   791: ldc2_w 2070913397
    //   794: l2i
    //   795: ldc 119877582
    //   797: ixor
    //   798: goto -> 808
    //   801: ldc2_w -1215352427
    //   804: l2i
    //   805: ldc -1307357769
    //   807: ixor
    //   808: ldc2_w 2084305397
    //   811: l2i
    //   812: ldc 636805317
    //   814: ixor
    //   815: ixor
    //   816: lookupswitch default -> 844, 629512075 -> 2544, 1913877181 -> 801
    //   844: goto -> 848
    //   847: athrow
    //   848: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   851: goto -> 855
    //   854: athrow
    //   855: getstatic Perryc.0 : I
    //   858: ifle -> 871
    //   861: ldc2_w 1508821701
    //   864: l2i
    //   865: ldc 55518883
    //   867: ixor
    //   868: goto -> 878
    //   871: ldc2_w -271457053
    //   874: l2i
    //   875: ldc -617199154
    //   877: ixor
    //   878: ldc2_w 1734477213
    //   881: l2i
    //   882: ldc 2087356416
    //   884: ixor
    //   885: ixor
    //   886: lookupswitch default -> 2580, 804200624 -> 912, 1101619707 -> 871
    //   912: goto -> 916
    //   915: athrow
    //   916: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   919: goto -> 923
    //   922: athrow
    //   923: getstatic Perryc.c : I
    //   926: iflt -> 939
    //   929: ldc2_w 1627794929
    //   932: l2i
    //   933: ldc 560879849
    //   935: ixor
    //   936: goto -> 946
    //   939: ldc2_w 1887419404
    //   942: l2i
    //   943: ldc 339565717
    //   945: ixor
    //   946: ldc2_w -1537163346
    //   949: l2i
    //   950: ldc -1246853665
    //   952: ixor
    //   953: ixor
    //   954: lookupswitch default -> 2584, 1369853801 -> 939, 1972165352 -> 980
    //   980: goto -> 984
    //   983: athrow
    //   984: invokevirtual toString : ()Ljava/lang/String;
    //   987: goto -> 991
    //   990: athrow
    //   991: getstatic Perryc.1 : I
    //   994: ifeq -> 1007
    //   997: ldc2_w -65648198
    //   1000: l2i
    //   1001: ldc 599589022
    //   1003: ixor
    //   1004: goto -> 1014
    //   1007: ldc2_w -1937886602
    //   1010: l2i
    //   1011: ldc 1870209235
    //   1013: ixor
    //   1014: ldc2_w 709899795
    //   1017: l2i
    //   1018: ldc 449647341
    //   1020: ixor
    //   1021: ixor
    //   1022: lookupswitch default -> 1048, -281645606 -> 2542, 2064368465 -> 1007
    //   1048: goto -> 1052
    //   1051: athrow
    //   1052: invokestatic sendMessage : (Ljava/lang/String;)V
    //   1055: goto -> 1059
    //   1058: athrow
    //   1059: goto -> 2531
    //   1062: getstatic Perryc.c : I
    //   1065: iflt -> 1079
    //   1068: ldc2_w -1612273639
    //   1071: l2i
    //   1072: ldc_w 752740640
    //   1075: ixor
    //   1076: goto -> 1087
    //   1079: ldc2_w 902869887
    //   1082: l2i
    //   1083: ldc_w 1406648776
    //   1086: ixor
    //   1087: ldc2_w 1148520638
    //   1090: l2i
    //   1091: ldc_w -2106084975
    //   1094: ixor
    //   1095: ixor
    //   1096: lookupswitch default -> 1124, -961365455 -> 1079, 1966733334 -> 2536
    //   1124: astore_2
    //   1125: getstatic Perryc.c : I
    //   1128: iflt -> 1142
    //   1131: ldc2_w -556660512
    //   1134: l2i
    //   1135: ldc_w 992846204
    //   1138: ixor
    //   1139: goto -> 1150
    //   1142: ldc2_w -984988379
    //   1145: l2i
    //   1146: ldc_w 625717059
    //   1149: ixor
    //   1150: ldc2_w -644614103
    //   1153: l2i
    //   1154: ldc_w 1418187713
    //   1157: ixor
    //   1158: ixor
    //   1159: lookupswitch default -> 1184, 1715234044 -> 1142, 1760264820 -> 2578
    //   1184: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   1187: new java/lang/StringBuilder
    //   1190: dup
    //   1191: getstatic Perryc.0 : I
    //   1194: ifle -> 1208
    //   1197: ldc2_w -943914489
    //   1200: l2i
    //   1201: ldc_w 1079636127
    //   1204: ixor
    //   1205: goto -> 1216
    //   1208: ldc2_w -2101824768
    //   1211: l2i
    //   1212: ldc_w 1115973680
    //   1215: ixor
    //   1216: ldc2_w -2098709059
    //   1219: l2i
    //   1220: ldc_w 1156862504
    //   1223: ixor
    //   1224: ixor
    //   1225: lookupswitch default -> 1252, 931680141 -> 1208, 1106812173 -> 2598
    //   1252: goto -> 1256
    //   1255: athrow
    //   1256: invokespecial <init> : ()V
    //   1259: goto -> 1263
    //   1262: athrow
    //   1263: getstatic Perryc.c : I
    //   1266: iflt -> 1280
    //   1269: ldc2_w -239383376
    //   1272: l2i
    //   1273: ldc_w -1288633052
    //   1276: ixor
    //   1277: goto -> 1288
    //   1280: ldc2_w 916060403
    //   1283: l2i
    //   1284: ldc_w 1913943783
    //   1287: ixor
    //   1288: ldc2_w -1229134806
    //   1291: l2i
    //   1292: ldc_w 560981376
    //   1295: ixor
    //   1296: ixor
    //   1297: lookupswitch default -> 1324, -715569090 -> 2582, 1536833439 -> 1280
    //   1324: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   1327: getstatic Perryc.c : I
    //   1330: iflt -> 1344
    //   1333: ldc2_w -909613908
    //   1336: l2i
    //   1337: ldc_w -868536219
    //   1340: ixor
    //   1341: goto -> 1352
    //   1344: ldc2_w -1469322282
    //   1347: l2i
    //   1348: ldc_w -309456588
    //   1351: ixor
    //   1352: ldc2_w -109386851
    //   1355: l2i
    //   1356: ldc_w -316079423
    //   1359: ixor
    //   1360: ixor
    //   1361: lookupswitch default -> 2586, 295744917 -> 1344, 1370889150 -> 1388
    //   1388: goto -> 1392
    //   1391: athrow
    //   1392: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1395: goto -> 1399
    //   1398: athrow
    //   1399: ldc_w 'ι㌜ϭ좼먚๷縰筰뭓ਢ칙葲戗黭辋?剺ꜹ豤便돹垦ᣀꚐ?槬曏搯敢'
    //   1402: getstatic Perryc.c : I
    //   1405: iflt -> 1419
    //   1408: ldc2_w 2126503221
    //   1411: l2i
    //   1412: ldc_w 1443814666
    //   1415: ixor
    //   1416: goto -> 1427
    //   1419: ldc2_w -807559210
    //   1422: l2i
    //   1423: ldc_w 835338569
    //   1426: ixor
    //   1427: ldc2_w 1680787717
    //   1430: l2i
    //   1431: ldc_w -67924071
    //   1434: ixor
    //   1435: ixor
    //   1436: lookupswitch default -> 1464, -1689740800 -> 1419, -1217640797 -> 2590
    //   1464: goto -> 1468
    //   1467: athrow
    //   1468: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1471: goto -> 1475
    //   1474: athrow
    //   1475: getstatic Perryc.1 : I
    //   1478: ifeq -> 1492
    //   1481: ldc2_w -1148932592
    //   1484: l2i
    //   1485: ldc_w 1318009453
    //   1488: ixor
    //   1489: goto -> 1500
    //   1492: ldc2_w 1906926214
    //   1495: l2i
    //   1496: ldc_w 379514145
    //   1499: ixor
    //   1500: ldc2_w 971250022
    //   1503: l2i
    //   1504: ldc_w 677348526
    //   1507: ixor
    //   1508: ixor
    //   1509: lookupswitch default -> 1536, -458225227 -> 2538, 1997639112 -> 1492
    //   1536: goto -> 1540
    //   1539: athrow
    //   1540: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1543: goto -> 1547
    //   1546: athrow
    //   1547: getstatic Perryc.0 : I
    //   1550: ifle -> 1564
    //   1553: ldc2_w -621660701
    //   1556: l2i
    //   1557: ldc_w 589116385
    //   1560: ixor
    //   1561: goto -> 1572
    //   1564: ldc2_w 123638301
    //   1567: l2i
    //   1568: ldc_w -206031866
    //   1571: ixor
    //   1572: ldc2_w -1573278730
    //   1575: l2i
    //   1576: ldc_w -1477763148
    //   1579: ixor
    //   1580: ixor
    //   1581: lookupswitch default -> 2576, -248245671 -> 1608, -63065536 -> 1564
    //   1608: aload_2
    //   1609: getstatic Perryc.1 : I
    //   1612: ifeq -> 1626
    //   1615: ldc2_w -505098244
    //   1618: l2i
    //   1619: ldc_w 1477652435
    //   1622: ixor
    //   1623: goto -> 1634
    //   1626: ldc2_w 86996740
    //   1629: l2i
    //   1630: ldc_w -464914038
    //   1633: ixor
    //   1634: ldc2_w 2012145944
    //   1637: l2i
    //   1638: ldc_w -446605765
    //   1641: ixor
    //   1642: ixor
    //   1643: lookupswitch default -> 1668, 246114363 -> 1626, 729308940 -> 2592
    //   1668: goto -> 1672
    //   1671: athrow
    //   1672: invokevirtual toString : ()Ljava/lang/String;
    //   1675: goto -> 1679
    //   1678: athrow
    //   1679: getstatic Perryc.1 : I
    //   1682: ifeq -> 1696
    //   1685: ldc2_w 615060737
    //   1688: l2i
    //   1689: ldc_w -1163671345
    //   1692: ixor
    //   1693: goto -> 1704
    //   1696: ldc2_w 1174553215
    //   1699: l2i
    //   1700: ldc_w 1995054808
    //   1703: ixor
    //   1704: ldc2_w -380349813
    //   1707: l2i
    //   1708: ldc_w -1794841730
    //   1711: ixor
    //   1712: ixor
    //   1713: lookupswitch default -> 1740, -497390533 -> 2596, -401195326 -> 1696
    //   1740: goto -> 1744
    //   1743: athrow
    //   1744: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1747: goto -> 1751
    //   1750: athrow
    //   1751: getstatic Perryc.1 : I
    //   1754: ifeq -> 1768
    //   1757: ldc2_w -1207239770
    //   1760: l2i
    //   1761: ldc_w -76728854
    //   1764: ixor
    //   1765: goto -> 1776
    //   1768: ldc2_w -885434662
    //   1771: l2i
    //   1772: ldc_w 643271005
    //   1775: ixor
    //   1776: ldc2_w -1685444069
    //   1779: l2i
    //   1780: ldc_w -629067014
    //   1783: ixor
    //   1784: ixor
    //   1785: lookupswitch default -> 1812, 30313787 -> 1768, 40687277 -> 2558
    //   1812: goto -> 1816
    //   1815: athrow
    //   1816: invokevirtual toString : ()Ljava/lang/String;
    //   1819: goto -> 1823
    //   1822: athrow
    //   1823: getstatic Perryc.c : I
    //   1826: iflt -> 1840
    //   1829: ldc2_w -832351081
    //   1832: l2i
    //   1833: ldc_w -387317222
    //   1836: ixor
    //   1837: goto -> 1848
    //   1840: ldc2_w 2082981440
    //   1843: l2i
    //   1844: ldc_w -414040346
    //   1847: ixor
    //   1848: ldc2_w -1989926202
    //   1851: l2i
    //   1852: ldc_w -435114658
    //   1855: ixor
    //   1856: ixor
    //   1857: lookupswitch default -> 2552, -201230530 -> 1884, 1241372949 -> 1840
    //   1884: goto -> 1888
    //   1887: athrow
    //   1888: invokevirtual println : (Ljava/lang/String;)V
    //   1891: goto -> 1895
    //   1894: athrow
    //   1895: getstatic Perryc.c : I
    //   1898: iflt -> 1912
    //   1901: ldc2_w 1692578692
    //   1904: l2i
    //   1905: ldc_w 408767430
    //   1908: ixor
    //   1909: goto -> 1920
    //   1912: ldc2_w 543625940
    //   1915: l2i
    //   1916: ldc_w -752698234
    //   1919: ixor
    //   1920: ldc2_w 1464002237
    //   1923: l2i
    //   1924: ldc_w 1367673003
    //   1927: ixor
    //   1928: ixor
    //   1929: lookupswitch default -> 1956, -322985589 -> 1912, 2054690388 -> 2534
    //   1956: aload_2
    //   1957: getstatic Perryc.1 : I
    //   1960: ifeq -> 1974
    //   1963: ldc2_w -1263258686
    //   1966: l2i
    //   1967: ldc_w 1878172322
    //   1970: ixor
    //   1971: goto -> 1982
    //   1974: ldc2_w 2052048746
    //   1977: l2i
    //   1978: ldc_w -2036718576
    //   1981: ixor
    //   1982: ldc2_w 544267547
    //   1985: l2i
    //   1986: ldc_w -781911004
    //   1989: ixor
    //   1990: ixor
    //   1991: lookupswitch default -> 2016, -1154596509 -> 1974, 710062175 -> 2554
    //   2016: goto -> 2020
    //   2019: athrow
    //   2020: invokevirtual printStackTrace : ()V
    //   2023: goto -> 2027
    //   2026: athrow
    //   2027: new java/lang/StringBuilder
    //   2030: dup
    //   2031: getstatic Perryc.c : I
    //   2034: iflt -> 2048
    //   2037: ldc2_w -1521541391
    //   2040: l2i
    //   2041: ldc_w -674853020
    //   2044: ixor
    //   2045: goto -> 2056
    //   2048: ldc2_w -1983377583
    //   2051: l2i
    //   2052: ldc_w -2136165972
    //   2055: ixor
    //   2056: ldc2_w -103324355
    //   2059: l2i
    //   2060: ldc_w -1982984500
    //   2063: ixor
    //   2064: ixor
    //   2065: lookupswitch default -> 2092, 43055716 -> 2560, 495146921 -> 2048
    //   2092: goto -> 2096
    //   2095: athrow
    //   2096: invokespecial <init> : ()V
    //   2099: goto -> 2103
    //   2102: athrow
    //   2103: getstatic Perryc.1 : I
    //   2106: ifeq -> 2120
    //   2109: ldc2_w 1848663726
    //   2112: l2i
    //   2113: ldc_w 1857631921
    //   2116: ixor
    //   2117: goto -> 2128
    //   2120: ldc2_w 1710394389
    //   2123: l2i
    //   2124: ldc_w -783220645
    //   2127: ixor
    //   2128: ldc2_w -1338349255
    //   2131: l2i
    //   2132: ldc_w 2094768306
    //   2135: ixor
    //   2136: ixor
    //   2137: lookupswitch default -> 2532, -865558124 -> 2120, 2017609157 -> 2164
    //   2164: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   2167: getstatic Perryc.c : I
    //   2170: iflt -> 2184
    //   2173: ldc2_w 722405
    //   2176: l2i
    //   2177: ldc_w -1894507276
    //   2180: ixor
    //   2181: goto -> 2192
    //   2184: ldc2_w -111305405
    //   2187: l2i
    //   2188: ldc_w 345019615
    //   2191: ixor
    //   2192: ldc2_w 587012659
    //   2195: l2i
    //   2196: ldc_w 1035951952
    //   2199: ixor
    //   2200: ixor
    //   2201: lookupswitch default -> 2546, -1872929678 -> 2184, -225489665 -> 2228
    //   2228: goto -> 2232
    //   2231: athrow
    //   2232: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   2235: goto -> 2239
    //   2238: athrow
    //   2239: ldc_w 'ι㌜ϭ좼먚๭繿策뭍ਨ칋葢扖黌辐?剧Ꜳ谱侂뎪垢ᣃꛐ'
    //   2242: getstatic Perryc.0 : I
    //   2245: ifle -> 2259
    //   2248: ldc2_w -807483085
    //   2251: l2i
    //   2252: ldc_w -1503087274
    //   2255: ixor
    //   2256: goto -> 2267
    //   2259: ldc2_w 67768326
    //   2262: l2i
    //   2263: ldc_w -934994585
    //   2266: ixor
    //   2267: ldc2_w -1929481071
    //   2270: l2i
    //   2271: ldc_w 1819911455
    //   2274: ixor
    //   2275: ixor
    //   2276: lookupswitch default -> 2304, -1993232917 -> 2568, -1809417787 -> 2259
    //   2304: goto -> 2308
    //   2307: athrow
    //   2308: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2311: goto -> 2315
    //   2314: athrow
    //   2315: getstatic Perryc.1 : I
    //   2318: ifeq -> 2332
    //   2321: ldc2_w -1166958391
    //   2324: l2i
    //   2325: ldc_w 1407533392
    //   2328: ixor
    //   2329: goto -> 2340
    //   2332: ldc2_w 881045164
    //   2335: l2i
    //   2336: ldc_w -800970423
    //   2339: ixor
    //   2340: ldc2_w -1307196710
    //   2343: l2i
    //   2344: ldc_w -209118316
    //   2347: ixor
    //   2348: ixor
    //   2349: lookupswitch default -> 2550, -1520607573 -> 2376, -1475856169 -> 2332
    //   2376: goto -> 2380
    //   2379: athrow
    //   2380: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2383: goto -> 2387
    //   2386: athrow
    //   2387: getstatic Perryc.c : I
    //   2390: iflt -> 2404
    //   2393: ldc2_w 1476269879
    //   2396: l2i
    //   2397: ldc_w 856562366
    //   2400: ixor
    //   2401: goto -> 2412
    //   2404: ldc2_w -1265251869
    //   2407: l2i
    //   2408: ldc_w -722269434
    //   2411: ixor
    //   2412: ldc2_w -74848893
    //   2415: l2i
    //   2416: ldc_w -232272310
    //   2419: ixor
    //   2420: ixor
    //   2421: lookupswitch default -> 2562, 1774774572 -> 2448, 1834886720 -> 2404
    //   2448: goto -> 2452
    //   2451: athrow
    //   2452: invokevirtual toString : ()Ljava/lang/String;
    //   2455: goto -> 2459
    //   2458: athrow
    //   2459: getstatic Perryc.1 : I
    //   2462: ifeq -> 2476
    //   2465: ldc2_w -1526633562
    //   2468: l2i
    //   2469: ldc_w -1368001375
    //   2472: ixor
    //   2473: goto -> 2484
    //   2476: ldc2_w -392955473
    //   2479: l2i
    //   2480: ldc_w 2034906832
    //   2483: ixor
    //   2484: ldc2_w -1366472002
    //   2487: l2i
    //   2488: ldc_w -252176544
    //   2491: ixor
    //   2492: ixor
    //   2493: lookupswitch default -> 2520, -1745444294 -> 2476, 1426178777 -> 2566
    //   2520: goto -> 2524
    //   2523: athrow
    //   2524: invokestatic sendMessage : (Ljava/lang/String;)V
    //   2527: goto -> 2531
    //   2530: athrow
    //   2531: return
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
    //   2576: aconst_null
    //   2577: athrow
    //   2578: aconst_null
    //   2579: athrow
    //   2580: aconst_null
    //   2581: athrow
    //   2582: aconst_null
    //   2583: athrow
    //   2584: aconst_null
    //   2585: athrow
    //   2586: aconst_null
    //   2587: athrow
    //   2588: aconst_null
    //   2589: athrow
    //   2590: aconst_null
    //   2591: athrow
    //   2592: aconst_null
    //   2593: athrow
    //   2594: aconst_null
    //   2595: athrow
    //   2596: aconst_null
    //   2597: athrow
    //   2598: aconst_null
    //   2599: athrow
    //   2600: aconst_null
    //   2601: athrow
    //   2602: aconst_null
    //   2603: athrow
    //   2604: pop
    //   2605: goto -> 24
    //   2608: pop
    //   2609: aconst_null
    //   2610: goto -> 2604
    //   2613: dup
    //   2614: ifnull -> 2604
    //   2617: checkcast java/lang/Throwable
    //   2620: athrow
    //   2621: dup
    //   2622: ifnull -> 2608
    //   2625: checkcast java/lang/Throwable
    //   2628: athrow
    //   2629: aconst_null
    //   2630: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   453	606	2	sndManager	Lnet/minecraft/client/audio/SoundManager;
    //   1125	1406	2	e	Ljava/lang/Exception;
    //   24	2508	0	this	Lbigname/zprestige/webhack/features/command/commands/ReloadSoundCommand;
    //   24	2508	1	commands	[Ljava/lang/String;
    // Exception table:
    //   from	to	target	type
    //   8	20	2613	java/lang/ArrayIndexOutOfBoundsException
    //   24	1059	1062	java/lang/Exception
    //   147	154	154	finally
    //   147	154	154	finally
    //   147	154	154	java/lang/ArrayIndexOutOfBoundsException
    //   147	154	3	finally
    //   148	154	147	java/lang/ArithmeticException
    //   235	242	242	finally
    //   235	242	3	java/lang/ArithmeticException
    //   236	242	235	finally
    //   236	242	3	java/lang/NumberFormatException
    //   236	242	235	finally
    //   315	322	322	finally
    //   315	322	3	finally
    //   315	322	315	finally
    //   316	322	3	java/lang/IllegalArgumentException
    //   316	322	3	finally
    //   383	390	390	finally
    //   383	390	390	java/lang/IllegalStateException
    //   384	390	383	finally
    //   384	390	383	java/lang/ArrayIndexOutOfBoundsException
    //   384	390	3	finally
    //   575	582	582	finally
    //   575	582	3	finally
    //   575	582	575	finally
    //   575	582	3	java/lang/ClassCastException
    //   575	582	582	java/lang/ClassCastException
    //   647	654	654	finally
    //   647	654	647	finally
    //   647	654	3	java/lang/RuntimeException
    //   648	654	654	finally
    //   648	654	654	finally
    //   775	782	782	finally
    //   775	782	775	finally
    //   775	782	782	finally
    //   776	782	782	java/util/ConcurrentModificationException
    //   776	782	3	finally
    //   847	854	854	finally
    //   847	854	854	finally
    //   847	854	847	java/lang/NumberFormatException
    //   848	854	854	java/lang/EnumConstantNotPresentException
    //   848	854	3	finally
    //   915	922	922	finally
    //   915	922	915	java/lang/NumberFormatException
    //   916	922	915	java/lang/ArithmeticException
    //   916	922	3	finally
    //   916	922	3	java/lang/StringIndexOutOfBoundsException
    //   983	990	990	finally
    //   983	990	990	java/lang/ArrayIndexOutOfBoundsException
    //   983	990	983	finally
    //   984	990	983	java/lang/NegativeArraySizeException
    //   984	990	3	java/lang/NegativeArraySizeException
    //   1051	1058	1058	finally
    //   1051	1058	1051	java/lang/EnumConstantNotPresentException
    //   1051	1058	1058	finally
    //   1051	1058	1058	finally
    //   1052	1058	1058	finally
    //   1255	1262	1262	finally
    //   1255	1262	1262	finally
    //   1255	1262	1262	java/lang/RuntimeException
    //   1256	1262	1255	finally
    //   1256	1262	1255	java/lang/NumberFormatException
    //   1391	1398	1398	finally
    //   1391	1398	1398	finally
    //   1391	1398	1398	java/lang/NumberFormatException
    //   1392	1398	1398	java/lang/UnsupportedOperationException
    //   1392	1398	1391	finally
    //   1467	1474	1474	finally
    //   1467	1474	3	java/lang/StringIndexOutOfBoundsException
    //   1467	1474	3	finally
    //   1467	1474	1474	java/lang/EnumConstantNotPresentException
    //   1468	1474	1467	finally
    //   1539	1546	1546	finally
    //   1539	1546	1546	java/lang/ClassCastException
    //   1539	1546	1546	finally
    //   1539	1546	3	finally
    //   1539	1546	1539	finally
    //   1671	1678	1678	finally
    //   1671	1678	3	java/lang/ClassCastException
    //   1672	1678	1671	java/lang/IllegalArgumentException
    //   1672	1678	1671	finally
    //   1672	1678	1678	finally
    //   1743	1750	1750	finally
    //   1743	1750	1743	finally
    //   1743	1750	1743	java/lang/ArrayIndexOutOfBoundsException
    //   1743	1750	3	java/util/ConcurrentModificationException
    //   1744	1750	3	java/util/NoSuchElementException
    //   1815	1822	1822	finally
    //   1815	1822	3	finally
    //   1815	1822	3	finally
    //   1816	1822	1815	finally
    //   1816	1822	1822	finally
    //   1888	1894	1894	finally
    //   1888	1894	3	finally
    //   1888	1894	1894	java/lang/ArrayIndexOutOfBoundsException
    //   1888	1894	3	finally
    //   1888	1894	3	finally
    //   2019	2026	2026	finally
    //   2019	2026	2019	finally
    //   2019	2026	3	finally
    //   2020	2026	2019	java/lang/EnumConstantNotPresentException
    //   2020	2026	3	java/lang/EnumConstantNotPresentException
    //   2096	2102	2102	finally
    //   2096	2102	2102	java/lang/StringIndexOutOfBoundsException
    //   2096	2102	3	java/lang/NegativeArraySizeException
    //   2096	2102	3	finally
    //   2096	2102	3	finally
    //   2231	2238	2238	finally
    //   2231	2238	3	finally
    //   2232	2238	2231	java/lang/IllegalArgumentException
    //   2232	2238	3	java/lang/UnsupportedOperationException
    //   2232	2238	2231	java/lang/RuntimeException
    //   2307	2314	2314	finally
    //   2307	2314	3	java/util/ConcurrentModificationException
    //   2307	2314	3	java/lang/IllegalStateException
    //   2307	2314	2314	finally
    //   2308	2314	2307	java/lang/IllegalStateException
    //   2379	2386	2386	finally
    //   2379	2386	3	java/lang/ArrayIndexOutOfBoundsException
    //   2379	2386	2379	java/lang/EnumConstantNotPresentException
    //   2380	2386	3	finally
    //   2380	2386	3	java/lang/StringIndexOutOfBoundsException
    //   2451	2458	2458	finally
    //   2452	2458	2451	java/lang/ClassCastException
    //   2452	2458	3	java/util/ConcurrentModificationException
    //   2452	2458	2458	java/lang/UnsupportedOperationException
    //   2452	2458	2451	finally
    //   2524	2530	2530	finally
    //   2524	2530	2530	finally
    //   2524	2530	3	finally
    //   2524	2530	2530	java/util/ConcurrentModificationException
    //   2524	2530	3	java/lang/AssertionError
    //   2613	2621	2613	java/lang/UnsupportedOperationException
    //   2629	2631	3	finally
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public ReloadSoundCommand() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w -807834150
    //   9: l2i
    //   10: ldc_w -1124497350
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1403173890
    //   20: l2i
    //   21: ldc_w -2001475027
    //   24: ixor
    //   25: ldc2_w 1477521812
    //   28: l2i
    //   29: ldc_w -984492187
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1098241566 -> 17, -295697647 -> 208
    //   60: aload_0
    //   61: ldc_w 'Ή㌜ϭ㶹꼕'
    //   64: getstatic Perryc.1 : I
    //   67: ifeq -> 81
    //   70: ldc2_w -497359765
    //   73: l2i
    //   74: ldc_w 913596641
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -1374943508
    //   84: l2i
    //   85: ldc_w -803219346
    //   88: ixor
    //   89: ldc2_w -1468512560
    //   92: l2i
    //   93: ldc_w 1441499373
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 206, -2088759105 -> 124, 700271287 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc2_w 485573618
    //   130: l2i
    //   131: ldc_w 485573618
    //   134: ixor
    //   135: anewarray java/lang/String
    //   138: getstatic Perryc.c : I
    //   141: iflt -> 155
    //   144: ldc2_w -954655465
    //   147: l2i
    //   148: ldc_w -1051318749
    //   151: ixor
    //   152: goto -> 163
    //   155: ldc2_w -673384271
    //   158: l2i
    //   159: ldc_w 252597176
    //   162: ixor
    //   163: ldc2_w 776364353
    //   166: l2i
    //   167: ldc_w 2006575510
    //   170: ixor
    //   171: ixor
    //   172: lookupswitch default -> 200, 1319278427 -> 155, 1603318755 -> 204
    //   200: invokespecial <init> : (Ljava/lang/String;[Ljava/lang/String;)V
    //   203: return
    //   204: aconst_null
    //   205: athrow
    //   206: aconst_null
    //   207: athrow
    //   208: aconst_null
    //   209: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	204	0	this	Lbigname/zprestige/webhack/features/command/commands/ReloadSoundCommand;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\command\commands\ReloadSoundCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */