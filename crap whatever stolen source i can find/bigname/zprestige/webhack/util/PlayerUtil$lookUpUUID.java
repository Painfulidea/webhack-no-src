package bigname.zprestige.webhack.util;

import Perry1;
import java.util.UUID;
import net.minecraft.client.network.NetworkPlayerInfo;

public class PlayerUtil$lookUpUUID implements Runnable {
  public UUID uuid;
  
  public String name;
  
  public static boolean $assertionsDisabled;
  
  public boolean lambda$run$0(NetworkPlayerInfo paramNetworkPlayerInfo) {
    return Perry1.5M(this, (int)440607841L ^ 0x4223387B, paramNetworkPlayerInfo);
  }
  
  static {
    // Byte code:
    //   0: ldc bigname/zprestige/webhack/util/PlayerUtil
    //   2: getstatic Perryc.1 : I
    //   5: ifeq -> 18
    //   8: ldc2_w 688541612
    //   11: l2i
    //   12: ldc 168505569
    //   14: ixor
    //   15: goto -> 25
    //   18: ldc2_w -2034363703
    //   21: l2i
    //   22: ldc 1772219130
    //   24: ixor
    //   25: ldc2_w -1696846225
    //   28: l2i
    //   29: ldc -125142530
    //   31: ixor
    //   32: ixor
    //   33: lookupswitch default -> 194, -1924550750 -> 60, 1096231132 -> 18
    //   60: invokevirtual desiredAssertionStatus : ()Z
    //   63: ifne -> 76
    //   66: ldc2_w 492525551
    //   69: l2i
    //   70: ldc -425126999
    //   72: ixor
    //   73: goto -> 83
    //   76: ldc2_w 1307831793
    //   79: l2i
    //   80: ldc -1241405004
    //   82: ixor
    //   83: ldc2_w 1903353445
    //   86: l2i
    //   87: ldc 154555542
    //   89: ixor
    //   90: ixor
    //   91: tableswitch default -> 66, -2085171531 -> 112, -2085171530 -> 122
    //   112: ldc2_w 919389678
    //   115: l2i
    //   116: ldc 919389679
    //   118: ixor
    //   119: goto -> 129
    //   122: ldc2_w 84674986
    //   125: l2i
    //   126: ldc 84674986
    //   128: ixor
    //   129: getstatic Perryc.1 : I
    //   132: ifeq -> 145
    //   135: ldc2_w -1357301052
    //   138: l2i
    //   139: ldc 326113255
    //   141: ixor
    //   142: goto -> 152
    //   145: ldc2_w 7115340
    //   148: l2i
    //   149: ldc 1331258756
    //   151: ixor
    //   152: ldc2_w 54612884
    //   155: l2i
    //   156: ldc -1978468188
    //   158: ixor
    //   159: ixor
    //   160: lookupswitch default -> 188, 119538723 -> 145, 893027859 -> 192
    //   188: putstatic bigname/zprestige/webhack/util/PlayerUtil$lookUpUUID.$assertionsDisabled : Z
    //   191: return
    //   192: aconst_null
    //   193: athrow
    //   194: aconst_null
    //   195: athrow
  }
  
  public void run() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 5165
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 5157
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 5149
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.c : I
    //   31: iflt -> 44
    //   34: ldc2_w 1872216880
    //   37: l2i
    //   38: ldc 393236294
    //   40: ixor
    //   41: goto -> 51
    //   44: ldc2_w 1675691345
    //   47: l2i
    //   48: ldc -115468602
    //   50: ixor
    //   51: ldc2_w 1745300206
    //   54: l2i
    //   55: ldc -1614952798
    //   57: ixor
    //   58: ixor
    //   59: lookupswitch default -> 84, -1889705926 -> 5012, 1884213314 -> 44
    //   84: getstatic bigname/zprestige/webhack/util/Util.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.c : I
    //   90: iflt -> 103
    //   93: ldc2_w 2090873083
    //   96: l2i
    //   97: ldc 342268919
    //   99: ixor
    //   100: goto -> 110
    //   103: ldc2_w 423300499
    //   106: l2i
    //   107: ldc 1337444822
    //   109: ixor
    //   110: ldc2_w 2055027106
    //   113: l2i
    //   114: ldc -2079671131
    //   116: ixor
    //   117: ixor
    //   118: lookupswitch default -> 5052, -1766773237 -> 103, -1459928766 -> 144
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual func_147114_u : ()Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   151: goto -> 155
    //   154: athrow
    //   155: getstatic Perryc.1 : I
    //   158: ifeq -> 171
    //   161: ldc2_w 1070810680
    //   164: l2i
    //   165: ldc -982170608
    //   167: ixor
    //   168: goto -> 178
    //   171: ldc2_w -1742313364
    //   174: l2i
    //   175: ldc -1693829296
    //   177: ixor
    //   178: ldc2_w -1911140850
    //   181: l2i
    //   182: ldc -973127642
    //   184: ixor
    //   185: ixor
    //   186: lookupswitch default -> 212, -1320219648 -> 5134, -213918921 -> 171
    //   212: goto -> 216
    //   215: athrow
    //   216: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   219: goto -> 223
    //   222: athrow
    //   223: checkcast net/minecraft/client/network/NetHandlerPlayClient
    //   226: getstatic Perryc.1 : I
    //   229: ifeq -> 242
    //   232: ldc2_w 855010977
    //   235: l2i
    //   236: ldc -700244853
    //   238: ixor
    //   239: goto -> 249
    //   242: ldc2_w 729172511
    //   245: l2i
    //   246: ldc -1775177540
    //   248: ixor
    //   249: ldc2_w -415759284
    //   252: l2i
    //   253: ldc 1195363678
    //   255: ixor
    //   256: ixor
    //   257: lookupswitch default -> 284, 1152564024 -> 5102, 2123750409 -> 242
    //   284: goto -> 288
    //   287: athrow
    //   288: invokevirtual func_175106_d : ()Ljava/util/Collection;
    //   291: goto -> 295
    //   294: athrow
    //   295: getstatic Perryc.0 : I
    //   298: ifle -> 311
    //   301: ldc2_w 37000441
    //   304: l2i
    //   305: ldc 897133222
    //   307: ixor
    //   308: goto -> 318
    //   311: ldc2_w -1422711041
    //   314: l2i
    //   315: ldc -1718604547
    //   317: ixor
    //   318: ldc2_w 7353995
    //   321: l2i
    //   322: ldc 1702139200
    //   324: ixor
    //   325: ixor
    //   326: lookupswitch default -> 352, 248036221 -> 311, 1380523412 -> 5130
    //   352: goto -> 356
    //   355: athrow
    //   356: invokespecial <init> : (Ljava/util/Collection;)V
    //   359: goto -> 363
    //   362: athrow
    //   363: getstatic Perryc.1 : I
    //   366: ifeq -> 379
    //   369: ldc2_w -1308557149
    //   372: l2i
    //   373: ldc -1791756487
    //   375: ixor
    //   376: goto -> 386
    //   379: ldc2_w 1463795023
    //   382: l2i
    //   383: ldc 793436246
    //   385: ixor
    //   386: ldc2_w 5625542
    //   389: l2i
    //   390: ldc -1515504286
    //   392: ixor
    //   393: ixor
    //   394: lookupswitch default -> 420, -2100552642 -> 5064, -546815836 -> 379
    //   420: astore_2
    //   421: getstatic Perryc.1 : I
    //   424: ifeq -> 437
    //   427: ldc2_w -95543575
    //   430: l2i
    //   431: ldc -1127468731
    //   433: ixor
    //   434: goto -> 444
    //   437: ldc2_w 938056914
    //   440: l2i
    //   441: ldc 1463850935
    //   443: ixor
    //   444: ldc2_w 1151526008
    //   447: l2i
    //   448: ldc 2060066067
    //   450: ixor
    //   451: ixor
    //   452: lookupswitch default -> 5124, 1589768718 -> 480, 2028656327 -> 437
    //   480: aload_2
    //   481: getstatic Perryc.0 : I
    //   484: ifle -> 497
    //   487: ldc2_w -1900716393
    //   490: l2i
    //   491: ldc -1664430822
    //   493: ixor
    //   494: goto -> 504
    //   497: ldc2_w 841993891
    //   500: l2i
    //   501: ldc 1229285587
    //   503: ixor
    //   504: ldc2_w 991182521
    //   507: l2i
    //   508: ldc -354753246
    //   510: ixor
    //   511: ixor
    //   512: lookupswitch default -> 540, -1011791850 -> 5106, 1570321083 -> 497
    //   540: goto -> 544
    //   543: athrow
    //   544: invokevirtual stream : ()Ljava/util/stream/Stream;
    //   547: goto -> 551
    //   550: athrow
    //   551: getstatic Perryc.1 : I
    //   554: ifeq -> 567
    //   557: ldc2_w -1646890973
    //   560: l2i
    //   561: ldc 909381728
    //   563: ixor
    //   564: goto -> 574
    //   567: ldc2_w 193141788
    //   570: l2i
    //   571: ldc -26134707
    //   573: ixor
    //   574: ldc2_w 1655507957
    //   577: l2i
    //   578: ldc 545642923
    //   580: ixor
    //   581: ixor
    //   582: lookupswitch default -> 608, -372592099 -> 5116, 625875733 -> 567
    //   608: aload_0
    //   609: <illegal opcode> test : (Lbigname/zprestige/webhack/util/PlayerUtil$lookUpUUID;)Ljava/util/function/Predicate;
    //   614: getstatic Perryc.1 : I
    //   617: ifeq -> 630
    //   620: ldc2_w 630667852
    //   623: l2i
    //   624: ldc 1407571711
    //   626: ixor
    //   627: goto -> 638
    //   630: ldc2_w 1676196887
    //   633: l2i
    //   634: ldc_w -1091166355
    //   637: ixor
    //   638: ldc2_w -1841443434
    //   641: l2i
    //   642: ldc_w -1831899500
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 5018, -571735944 -> 672, 1988120497 -> 630
    //   672: goto -> 676
    //   675: athrow
    //   676: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   681: goto -> 685
    //   684: athrow
    //   685: getstatic Perryc.c : I
    //   688: iflt -> 702
    //   691: ldc2_w 71052755
    //   694: l2i
    //   695: ldc_w 1934052910
    //   698: ixor
    //   699: goto -> 710
    //   702: ldc2_w -1110090803
    //   705: l2i
    //   706: ldc_w 1998383929
    //   709: ixor
    //   710: ldc2_w 1041429987
    //   713: l2i
    //   714: ldc_w -980384380
    //   717: ixor
    //   718: ixor
    //   719: lookupswitch default -> 744, -1929833574 -> 5016, 159804462 -> 702
    //   744: goto -> 748
    //   747: athrow
    //   748: invokeinterface findFirst : ()Ljava/util/Optional;
    //   753: goto -> 757
    //   756: athrow
    //   757: aconst_null
    //   758: getstatic Perryc.c : I
    //   761: iflt -> 775
    //   764: ldc2_w 1069734096
    //   767: l2i
    //   768: ldc_w -2006665132
    //   771: ixor
    //   772: goto -> 783
    //   775: ldc2_w 1390452328
    //   778: l2i
    //   779: ldc_w 2012406559
    //   782: ixor
    //   783: ldc2_w 710073831
    //   786: l2i
    //   787: ldc_w 717756582
    //   790: ixor
    //   791: ixor
    //   792: lookupswitch default -> 5118, -1220762171 -> 775, 629717046 -> 820
    //   820: goto -> 824
    //   823: athrow
    //   824: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   827: goto -> 831
    //   830: athrow
    //   831: checkcast net/minecraft/client/network/NetworkPlayerInfo
    //   834: getstatic Perryc.1 : I
    //   837: ifeq -> 851
    //   840: ldc2_w 1351887971
    //   843: l2i
    //   844: ldc_w 1767287446
    //   847: ixor
    //   848: goto -> 859
    //   851: ldc2_w 1853721582
    //   854: l2i
    //   855: ldc_w -2088755035
    //   858: ixor
    //   859: ldc2_w -31891352
    //   862: l2i
    //   863: ldc_w 377455213
    //   866: ixor
    //   867: ixor
    //   868: lookupswitch default -> 5008, -777755408 -> 851, 94062926 -> 896
    //   896: astore_1
    //   897: getstatic Perryc.1 : I
    //   900: ifeq -> 914
    //   903: ldc2_w 138166243
    //   906: l2i
    //   907: ldc_w 1800540789
    //   910: ixor
    //   911: goto -> 922
    //   914: ldc2_w -830841468
    //   917: l2i
    //   918: ldc_w -1660850497
    //   921: ixor
    //   922: ldc2_w -152630798
    //   925: l2i
    //   926: ldc_w 340744620
    //   929: ixor
    //   930: ixor
    //   931: lookupswitch default -> 956, -2117698104 -> 5046, -2036723213 -> 914
    //   956: getstatic bigname/zprestige/webhack/util/PlayerUtil$lookUpUUID.$assertionsDisabled : Z
    //   959: ifne -> 973
    //   962: ldc2_w 1602135112
    //   965: l2i
    //   966: ldc_w 1219290456
    //   969: ixor
    //   970: goto -> 981
    //   973: ldc2_w 769470512
    //   976: l2i
    //   977: ldc_w 974090529
    //   980: ixor
    //   981: ldc2_w 462893803
    //   984: l2i
    //   985: ldc_w -235107069
    //   988: ixor
    //   989: ixor
    //   990: tableswitch default -> 962, -38142216 -> 1012, -38142215 -> 1204
    //   1012: getstatic Perryc.1 : I
    //   1015: ifeq -> 1029
    //   1018: ldc2_w 198472564
    //   1021: l2i
    //   1022: ldc_w 1478177724
    //   1025: ixor
    //   1026: goto -> 1037
    //   1029: ldc2_w -1662187983
    //   1032: l2i
    //   1033: ldc_w 1313508103
    //   1036: ixor
    //   1037: ldc2_w -2092676125
    //   1040: l2i
    //   1041: ldc_w 1667569942
    //   1044: ixor
    //   1045: ixor
    //   1046: lookupswitch default -> 1072, -1276243395 -> 5084, 1813440807 -> 1029
    //   1072: aload_1
    //   1073: ifnonnull -> 1087
    //   1076: ldc2_w -741472729
    //   1079: l2i
    //   1080: ldc_w -1611501572
    //   1083: ixor
    //   1084: goto -> 1095
    //   1087: ldc2_w -269110596
    //   1090: l2i
    //   1091: ldc_w -1547052188
    //   1094: ixor
    //   1095: ldc2_w -1297283584
    //   1098: l2i
    //   1099: ldc_w -694196234
    //   1102: ixor
    //   1103: ixor
    //   1104: tableswitch default -> 1076, 672008237 -> 1128, 672008238 -> 1204
    //   1128: new java/lang/AssertionError
    //   1131: dup
    //   1132: getstatic Perryc.c : I
    //   1135: iflt -> 1149
    //   1138: ldc2_w -22907194
    //   1141: l2i
    //   1142: ldc_w 325383746
    //   1145: ixor
    //   1146: goto -> 1157
    //   1149: ldc2_w -1928595637
    //   1152: l2i
    //   1153: ldc_w -182322350
    //   1156: ixor
    //   1157: ldc2_w 1363345446
    //   1160: l2i
    //   1161: ldc_w -609611702
    //   1164: ixor
    //   1165: ixor
    //   1166: lookupswitch default -> 5096, -222094219 -> 1192, 1731170536 -> 1149
    //   1192: goto -> 1196
    //   1195: athrow
    //   1196: invokespecial <init> : ()V
    //   1199: goto -> 1203
    //   1202: athrow
    //   1203: athrow
    //   1204: getstatic Perryc.c : I
    //   1207: iflt -> 1221
    //   1210: ldc2_w -676183538
    //   1213: l2i
    //   1214: ldc_w 2087081785
    //   1217: ixor
    //   1218: goto -> 1229
    //   1221: ldc2_w 1959290392
    //   1224: l2i
    //   1225: ldc_w -1871243942
    //   1228: ixor
    //   1229: ldc2_w -237709987
    //   1232: l2i
    //   1233: ldc_w 1152270295
    //   1236: ixor
    //   1237: ixor
    //   1238: lookupswitch default -> 5082, 514785213 -> 1221, 1371904456 -> 1264
    //   1264: aload_0
    //   1265: getstatic Perryc.c : I
    //   1268: iflt -> 1282
    //   1271: ldc2_w 1342240450
    //   1274: l2i
    //   1275: ldc_w 127652248
    //   1278: ixor
    //   1279: goto -> 1290
    //   1282: ldc2_w -1511150432
    //   1285: l2i
    //   1286: ldc_w 962427752
    //   1289: ixor
    //   1290: ldc2_w -1838574045
    //   1293: l2i
    //   1294: ldc_w -443206737
    //   1297: ixor
    //   1298: ixor
    //   1299: lookupswitch default -> 1324, 543654614 -> 5078, 1646852189 -> 1282
    //   1324: aload_1
    //   1325: getstatic Perryc.0 : I
    //   1328: ifle -> 1342
    //   1331: ldc2_w -154833807
    //   1334: l2i
    //   1335: ldc_w 1627301937
    //   1338: ixor
    //   1339: goto -> 1350
    //   1342: ldc2_w -574224494
    //   1345: l2i
    //   1346: ldc_w 753908208
    //   1349: ixor
    //   1350: ldc2_w -839978671
    //   1353: l2i
    //   1354: ldc_w 932651500
    //   1357: ixor
    //   1358: ixor
    //   1359: lookupswitch default -> 5086, 189820639 -> 1384, 1816270077 -> 1342
    //   1384: goto -> 1388
    //   1387: athrow
    //   1388: invokevirtual func_178845_a : ()Lcom/mojang/authlib/GameProfile;
    //   1391: goto -> 1395
    //   1394: athrow
    //   1395: getstatic Perryc.c : I
    //   1398: iflt -> 1412
    //   1401: ldc2_w 537937892
    //   1404: l2i
    //   1405: ldc_w -1048045982
    //   1408: ixor
    //   1409: goto -> 1420
    //   1412: ldc2_w 1317114227
    //   1415: l2i
    //   1416: ldc_w -472766023
    //   1419: ixor
    //   1420: ldc2_w -1848390715
    //   1423: l2i
    //   1424: ldc_w 1578665632
    //   1427: ixor
    //   1428: ixor
    //   1429: lookupswitch default -> 5112, 777198819 -> 1412, 1654191535 -> 1456
    //   1456: goto -> 1460
    //   1459: athrow
    //   1460: invokevirtual getId : ()Ljava/util/UUID;
    //   1463: goto -> 1467
    //   1466: athrow
    //   1467: getstatic Perryc.c : I
    //   1470: iflt -> 1484
    //   1473: ldc2_w 309517347
    //   1476: l2i
    //   1477: ldc_w -1838338044
    //   1480: ixor
    //   1481: goto -> 1492
    //   1484: ldc2_w -343327579
    //   1487: l2i
    //   1488: ldc_w 401621547
    //   1491: ixor
    //   1492: ldc2_w -1944084342
    //   1495: l2i
    //   1496: ldc_w -784678873
    //   1499: ixor
    //   1500: ixor
    //   1501: lookupswitch default -> 5072, -1587798493 -> 1528, -583365494 -> 1484
    //   1528: putfield uuid : Ljava/util/UUID;
    //   1531: goto -> 1661
    //   1534: getstatic Perryc.c : I
    //   1537: iflt -> 1551
    //   1540: ldc2_w 1631018923
    //   1543: l2i
    //   1544: ldc_w -830619306
    //   1547: ixor
    //   1548: goto -> 1559
    //   1551: ldc2_w -588511839
    //   1554: l2i
    //   1555: ldc_w 2133507134
    //   1558: ixor
    //   1559: ldc2_w 1703559284
    //   1562: l2i
    //   1563: ldc_w -1866184646
    //   1566: ixor
    //   1567: ixor
    //   1568: lookupswitch default -> 5058, 1451798993 -> 1596, 1510250163 -> 1551
    //   1596: astore_2
    //   1597: aconst_null
    //   1598: getstatic Perryc.c : I
    //   1601: iflt -> 1615
    //   1604: ldc2_w 774885256
    //   1607: l2i
    //   1608: ldc_w -1100727970
    //   1611: ixor
    //   1612: goto -> 1623
    //   1615: ldc2_w -1870875979
    //   1618: l2i
    //   1619: ldc_w -792170100
    //   1622: ixor
    //   1623: ldc2_w 1961428932
    //   1626: l2i
    //   1627: ldc_w 786615624
    //   1630: ixor
    //   1631: ixor
    //   1632: lookupswitch default -> 5088, -901759910 -> 1615, 448727477 -> 1660
    //   1660: astore_1
    //   1661: getstatic Perryc.c : I
    //   1664: iflt -> 1678
    //   1667: ldc2_w -1871554318
    //   1670: l2i
    //   1671: ldc_w 818614606
    //   1674: ixor
    //   1675: goto -> 1686
    //   1678: ldc2_w -381959100
    //   1681: l2i
    //   1682: ldc_w 1985580248
    //   1685: ixor
    //   1686: ldc2_w -279567235
    //   1689: l2i
    //   1690: ldc_w 1339343533
    //   1693: ixor
    //   1694: ixor
    //   1695: lookupswitch default -> 5092, 3911532 -> 1678, 1071689292 -> 1720
    //   1720: aload_1
    //   1721: ifnonnull -> 1735
    //   1724: ldc2_w -580134056
    //   1727: l2i
    //   1728: ldc_w -806256696
    //   1731: ixor
    //   1732: goto -> 1743
    //   1735: ldc2_w 482086863
    //   1738: l2i
    //   1739: ldc_w 237415262
    //   1742: ixor
    //   1743: ldc2_w -1316759346
    //   1746: l2i
    //   1747: ldc_w 1873264796
    //   1750: ixor
    //   1751: ixor
    //   1752: tableswitch default -> 1724, -859915070 -> 1776, -859915069 -> 5003
    //   1776: ldc_w '光㌟儚蕗ꔐ뿗ูⳕ㚉痢ਲ਼鳩즗紓찐辖襲ᾒ롳?依믩﹈靖Սᣀ釬盷㐮搵㟴軻飢㲶央硂'
    //   1779: getstatic Perryc.c : I
    //   1782: iflt -> 1796
    //   1785: ldc2_w -1280801811
    //   1788: l2i
    //   1789: ldc_w 124820138
    //   1792: ixor
    //   1793: goto -> 1804
    //   1796: ldc2_w 2005251350
    //   1799: l2i
    //   1800: ldc_w 2032006300
    //   1803: ixor
    //   1804: ldc2_w -1724047126
    //   1807: l2i
    //   1808: ldc_w 1745648480
    //   1811: ixor
    //   1812: ixor
    //   1813: lookupswitch default -> 5044, -5694976 -> 1840, 1172914893 -> 1796
    //   1840: goto -> 1844
    //   1843: athrow
    //   1844: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1847: goto -> 1851
    //   1850: athrow
    //   1851: getstatic Perryc.c : I
    //   1854: iflt -> 1868
    //   1857: ldc2_w 99117481
    //   1860: l2i
    //   1861: ldc_w -2094003706
    //   1864: ixor
    //   1865: goto -> 1876
    //   1868: ldc2_w -87075226
    //   1871: l2i
    //   1872: ldc_w -85996356
    //   1875: ixor
    //   1876: ldc2_w -628165143
    //   1879: l2i
    //   1880: ldc_w -1862320400
    //   1883: ixor
    //   1884: ixor
    //   1885: lookupswitch default -> 5132, -861296458 -> 1868, 1247891907 -> 1912
    //   1912: goto -> 1916
    //   1915: athrow
    //   1916: invokestatic sendMessage : (Ljava/lang/String;)V
    //   1919: goto -> 1923
    //   1922: athrow
    //   1923: new java/lang/StringBuilder
    //   1926: dup
    //   1927: getstatic Perryc.c : I
    //   1930: iflt -> 1944
    //   1933: ldc2_w 54694215
    //   1936: l2i
    //   1937: ldc_w 52462314
    //   1940: ixor
    //   1941: goto -> 1952
    //   1944: ldc2_w 2114330231
    //   1947: l2i
    //   1948: ldc_w -947070180
    //   1951: ixor
    //   1952: ldc2_w -28230492
    //   1955: l2i
    //   1956: ldc_w 102314058
    //   1959: ixor
    //   1960: ixor
    //   1961: lookupswitch default -> 1988, -131457213 -> 5108, 140784034 -> 1944
    //   1988: goto -> 1992
    //   1991: athrow
    //   1992: invokespecial <init> : ()V
    //   1995: goto -> 1999
    //   1998: athrow
    //   1999: ldc_w '兂㍑'
    //   2002: getstatic Perryc.0 : I
    //   2005: ifle -> 2019
    //   2008: ldc2_w -1897414583
    //   2011: l2i
    //   2012: ldc_w -1834227630
    //   2015: ixor
    //   2016: goto -> 2027
    //   2019: ldc2_w 579757999
    //   2022: l2i
    //   2023: ldc_w -1021960467
    //   2026: ixor
    //   2027: ldc2_w 701106726
    //   2030: l2i
    //   2031: ldc_w -83200809
    //   2034: ixor
    //   2035: ixor
    //   2036: lookupswitch default -> 5104, -829663510 -> 2019, 861407155 -> 2064
    //   2064: goto -> 2068
    //   2067: athrow
    //   2068: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2071: goto -> 2075
    //   2074: athrow
    //   2075: getstatic Perryc.c : I
    //   2078: iflt -> 2092
    //   2081: ldc2_w 1382002767
    //   2084: l2i
    //   2085: ldc_w -1155885481
    //   2088: ixor
    //   2089: goto -> 2100
    //   2092: ldc2_w -590830318
    //   2095: l2i
    //   2096: ldc_w 1980626391
    //   2099: ixor
    //   2100: ldc2_w -1957008182
    //   2103: l2i
    //   2104: ldc_w 811846960
    //   2107: ixor
    //   2108: ixor
    //   2109: lookupswitch default -> 5136, 301789503 -> 2136, 1383892962 -> 2092
    //   2136: goto -> 2140
    //   2139: athrow
    //   2140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2143: goto -> 2147
    //   2146: athrow
    //   2147: getstatic Perryc.1 : I
    //   2150: ifeq -> 2164
    //   2153: ldc2_w 876558344
    //   2156: l2i
    //   2157: ldc_w 363330244
    //   2160: ixor
    //   2161: goto -> 2172
    //   2164: ldc2_w 1897526408
    //   2167: l2i
    //   2168: ldc_w -17347708
    //   2171: ixor
    //   2172: ldc2_w 1369236716
    //   2175: l2i
    //   2176: ldc_w -243348672
    //   2179: ixor
    //   2180: ixor
    //   2181: lookupswitch default -> 5066, -2122650272 -> 2164, 789352608 -> 2208
    //   2208: aload_0
    //   2209: getstatic Perryc.1 : I
    //   2212: ifeq -> 2226
    //   2215: ldc2_w -1313690782
    //   2218: l2i
    //   2219: ldc_w -1500789855
    //   2222: ixor
    //   2223: goto -> 2234
    //   2226: ldc2_w -2013313513
    //   2229: l2i
    //   2230: ldc_w -991566420
    //   2233: ixor
    //   2234: ldc2_w -218677177
    //   2237: l2i
    //   2238: ldc_w -90062182
    //   2241: ixor
    //   2242: ixor
    //   2243: lookupswitch default -> 5074, 527428126 -> 2226, 1263280486 -> 2268
    //   2268: getfield name : Ljava/lang/String;
    //   2271: getstatic Perryc.0 : I
    //   2274: ifle -> 2288
    //   2277: ldc2_w 2061653911
    //   2280: l2i
    //   2281: ldc_w -1099012032
    //   2284: ixor
    //   2285: goto -> 2296
    //   2288: ldc2_w 1650914534
    //   2291: l2i
    //   2292: ldc_w -932230400
    //   2295: ixor
    //   2296: ldc2_w 868337860
    //   2299: l2i
    //   2300: ldc_w 1511098967
    //   2303: ixor
    //   2304: ixor
    //   2305: lookupswitch default -> 2332, -1387496124 -> 5076, 1043127934 -> 2288
    //   2332: goto -> 2336
    //   2335: athrow
    //   2336: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2339: goto -> 2343
    //   2342: athrow
    //   2343: ldc_w '儻㌮'
    //   2346: getstatic Perryc.c : I
    //   2349: iflt -> 2363
    //   2352: ldc2_w 1653925648
    //   2355: l2i
    //   2356: ldc_w 42921508
    //   2359: ixor
    //   2360: goto -> 2371
    //   2363: ldc2_w 401759753
    //   2366: l2i
    //   2367: ldc_w 1742031740
    //   2370: ixor
    //   2371: ldc2_w -195772549
    //   2374: l2i
    //   2375: ldc_w 1335555522
    //   2378: ixor
    //   2379: ixor
    //   2380: lookupswitch default -> 5022, -873898036 -> 2408, -606846067 -> 2363
    //   2408: goto -> 2412
    //   2411: athrow
    //   2412: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2415: goto -> 2419
    //   2418: athrow
    //   2419: getstatic Perryc.c : I
    //   2422: iflt -> 2436
    //   2425: ldc2_w 1423906609
    //   2428: l2i
    //   2429: ldc_w -1935590555
    //   2432: ixor
    //   2433: goto -> 2444
    //   2436: ldc2_w -1401946276
    //   2439: l2i
    //   2440: ldc_w 1305461762
    //   2443: ixor
    //   2444: ldc2_w -1986591868
    //   2447: l2i
    //   2448: ldc_w 1366456668
    //   2451: ixor
    //   2452: ixor
    //   2453: lookupswitch default -> 5122, 10180236 -> 2436, 960840070 -> 2480
    //   2480: goto -> 2484
    //   2483: athrow
    //   2484: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2487: goto -> 2491
    //   2490: athrow
    //   2491: getstatic Perryc.c : I
    //   2494: iflt -> 2508
    //   2497: ldc2_w -905711330
    //   2500: l2i
    //   2501: ldc_w -336470171
    //   2504: ixor
    //   2505: goto -> 2516
    //   2508: ldc2_w -1314877792
    //   2511: l2i
    //   2512: ldc_w -1526749217
    //   2515: ixor
    //   2516: ldc2_w 773705922
    //   2519: l2i
    //   2520: ldc_w 2139342695
    //   2523: ixor
    //   2524: ixor
    //   2525: lookupswitch default -> 2552, 1359521773 -> 2508, 1886140894 -> 5070
    //   2552: goto -> 2556
    //   2555: athrow
    //   2556: invokevirtual toString : ()Ljava/lang/String;
    //   2559: goto -> 2563
    //   2562: athrow
    //   2563: getstatic Perryc.1 : I
    //   2566: ifeq -> 2580
    //   2569: ldc2_w 1522695152
    //   2572: l2i
    //   2573: ldc_w -1175565712
    //   2576: ixor
    //   2577: goto -> 2588
    //   2580: ldc2_w 244370186
    //   2583: l2i
    //   2584: ldc_w -370848729
    //   2587: ixor
    //   2588: ldc2_w 322258618
    //   2591: l2i
    //   2592: ldc_w -1205124198
    //   2595: ixor
    //   2596: ixor
    //   2597: lookupswitch default -> 2624, 466353569 -> 2580, 1211249824 -> 5128
    //   2624: goto -> 2628
    //   2627: athrow
    //   2628: invokestatic requestIDs : (Ljava/lang/String;)Ljava/lang/String;
    //   2631: goto -> 2635
    //   2634: athrow
    //   2635: getstatic Perryc.c : I
    //   2638: iflt -> 2652
    //   2641: ldc2_w 993728841
    //   2644: l2i
    //   2645: ldc_w 1613115553
    //   2648: ixor
    //   2649: goto -> 2660
    //   2652: ldc2_w -1405224801
    //   2655: l2i
    //   2656: ldc_w 1534533719
    //   2659: ixor
    //   2660: ldc2_w -734089396
    //   2663: l2i
    //   2664: ldc_w 771066926
    //   2667: ixor
    //   2668: ixor
    //   2669: lookupswitch default -> 2696, -2116276044 -> 2652, -1563030902 -> 5028
    //   2696: astore_2
    //   2697: getstatic Perryc.0 : I
    //   2700: ifle -> 2714
    //   2703: ldc2_w 1130681736
    //   2706: l2i
    //   2707: ldc_w -357085167
    //   2710: ixor
    //   2711: goto -> 2722
    //   2714: ldc2_w -1989619938
    //   2717: l2i
    //   2718: ldc_w 1904158534
    //   2721: ixor
    //   2722: ldc2_w -1847787106
    //   2725: l2i
    //   2726: ldc_w -570200728
    //   2729: ixor
    //   2730: ixor
    //   2731: lookupswitch default -> 5036, -1211530066 -> 2756, -435295889 -> 2714
    //   2756: aload_2
    //   2757: ifnull -> 2771
    //   2760: ldc2_w 1681368340
    //   2763: l2i
    //   2764: ldc_w 518375398
    //   2767: ixor
    //   2768: goto -> 2779
    //   2771: ldc2_w 1956481417
    //   2774: l2i
    //   2775: ldc_w 240118648
    //   2778: ixor
    //   2779: ldc2_w 1854069756
    //   2782: l2i
    //   2783: ldc_w 2093149803
    //   2786: ixor
    //   2787: ixor
    //   2788: tableswitch default -> 2760, 1754421093 -> 2812, 1754421094 -> 2996
    //   2812: getstatic Perryc.c : I
    //   2815: iflt -> 2829
    //   2818: ldc2_w 316087463
    //   2821: l2i
    //   2822: ldc_w -215470336
    //   2825: ixor
    //   2826: goto -> 2837
    //   2829: ldc2_w 592446036
    //   2832: l2i
    //   2833: ldc_w -530470566
    //   2836: ixor
    //   2837: ldc2_w 833738342
    //   2840: l2i
    //   2841: ldc_w -1911531458
    //   2844: ixor
    //   2845: ixor
    //   2846: lookupswitch default -> 5120, 1583267327 -> 2829, 2089821526 -> 2872
    //   2872: aload_2
    //   2873: getstatic Perryc.0 : I
    //   2876: ifle -> 2890
    //   2879: ldc2_w -2124856998
    //   2882: l2i
    //   2883: ldc_w 108837505
    //   2886: ixor
    //   2887: goto -> 2898
    //   2890: ldc2_w 287316316
    //   2893: l2i
    //   2894: ldc_w -1996136407
    //   2897: ixor
    //   2898: ldc2_w 515721196
    //   2901: l2i
    //   2902: ldc_w -165305584
    //   2905: ixor
    //   2906: ixor
    //   2907: lookupswitch default -> 2932, -1650677165 -> 2890, 1874665255 -> 5024
    //   2932: goto -> 2936
    //   2935: athrow
    //   2936: invokevirtual isEmpty : ()Z
    //   2939: goto -> 2943
    //   2942: athrow
    //   2943: ifeq -> 2957
    //   2946: ldc2_w 1493216346
    //   2949: l2i
    //   2950: ldc_w -79614533
    //   2953: ixor
    //   2954: goto -> 2965
    //   2957: ldc2_w -1891699676
    //   2960: l2i
    //   2961: ldc_w 763327938
    //   2964: ixor
    //   2965: ldc2_w 1339632500
    //   2968: l2i
    //   2969: ldc_w -1677413442
    //   2972: ixor
    //   2973: ixor
    //   2974: tableswitch default -> 2946, 1906055467 -> 2996, 1906055468 -> 3146
    //   2996: ldc_w '党㌜儎蕂ꔑ뿋฾Ⳉ㛚吝਩鲭짘納찐辞襥ᾒ렯?侘믂︉廙եᣜ釬盻㐱摠㞁軍飄㲜奮砉따吝鄿攧ž鏰삽Ꮝ믏똜茭懿ڪ⮴ʅⶲ㐒늝萲셠銴鳀ẉ'
    //   2999: getstatic Perryc.c : I
    //   3002: iflt -> 3016
    //   3005: ldc2_w -506030391
    //   3008: l2i
    //   3009: ldc_w 1589785243
    //   3012: ixor
    //   3013: goto -> 3024
    //   3016: ldc2_w -413914399
    //   3019: l2i
    //   3020: ldc_w -2072719808
    //   3023: ixor
    //   3024: ldc2_w -1952052063
    //   3027: l2i
    //   3028: ldc_w -1451017429
    //   3031: ixor
    //   3032: ixor
    //   3033: lookupswitch default -> 3060, -1657695272 -> 5062, -152596373 -> 3016
    //   3060: goto -> 3064
    //   3063: athrow
    //   3064: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3067: goto -> 3071
    //   3070: athrow
    //   3071: getstatic Perryc.c : I
    //   3074: iflt -> 3088
    //   3077: ldc2_w 1974519976
    //   3080: l2i
    //   3081: ldc_w -1886012217
    //   3084: ixor
    //   3085: goto -> 3096
    //   3088: ldc2_w 701973756
    //   3091: l2i
    //   3092: ldc_w -566004660
    //   3095: ixor
    //   3096: ldc2_w -162451266
    //   3099: l2i
    //   3100: ldc_w 1536337243
    //   3103: ixor
    //   3104: ixor
    //   3105: lookupswitch default -> 3132, 1474748810 -> 5004, 1524140812 -> 3088
    //   3132: goto -> 3136
    //   3135: athrow
    //   3136: invokestatic sendMessage : (Ljava/lang/String;)V
    //   3139: goto -> 3143
    //   3142: athrow
    //   3143: goto -> 5003
    //   3146: new com/google/gson/JsonParser
    //   3149: dup
    //   3150: getstatic Perryc.0 : I
    //   3153: ifle -> 3167
    //   3156: ldc2_w 921462262
    //   3159: l2i
    //   3160: ldc_w -854409002
    //   3163: ixor
    //   3164: goto -> 3175
    //   3167: ldc2_w 2133618178
    //   3170: l2i
    //   3171: ldc_w 372543758
    //   3174: ixor
    //   3175: ldc2_w 1472645774
    //   3178: l2i
    //   3179: ldc_w 1515548038
    //   3182: ixor
    //   3183: ixor
    //   3184: lookupswitch default -> 5100, -160628184 -> 3167, 1686853636 -> 3212
    //   3212: goto -> 3216
    //   3215: athrow
    //   3216: invokespecial <init> : ()V
    //   3219: goto -> 3223
    //   3222: athrow
    //   3223: getstatic Perryc.c : I
    //   3226: iflt -> 3240
    //   3229: ldc2_w 632523458
    //   3232: l2i
    //   3233: ldc_w -1516855666
    //   3236: ixor
    //   3237: goto -> 3248
    //   3240: ldc2_w -1829009172
    //   3243: l2i
    //   3244: ldc_w -1651004273
    //   3247: ixor
    //   3248: ldc2_w -432761165
    //   3251: l2i
    //   3252: ldc_w -31871866
    //   3255: ixor
    //   3256: ixor
    //   3257: lookupswitch default -> 5006, -1744294279 -> 3240, 390143574 -> 3284
    //   3284: aload_2
    //   3285: getstatic Perryc.1 : I
    //   3288: ifeq -> 3302
    //   3291: ldc2_w 1943059441
    //   3294: l2i
    //   3295: ldc_w 1541067151
    //   3298: ixor
    //   3299: goto -> 3310
    //   3302: ldc2_w -1624288701
    //   3305: l2i
    //   3306: ldc_w -1004554454
    //   3309: ixor
    //   3310: ldc2_w -1176202194
    //   3313: l2i
    //   3314: ldc_w 354180878
    //   3317: ixor
    //   3318: ixor
    //   3319: lookupswitch default -> 3344, -2064473762 -> 5138, -2027115055 -> 3302
    //   3344: goto -> 3348
    //   3347: athrow
    //   3348: invokevirtual parse : (Ljava/lang/String;)Lcom/google/gson/JsonElement;
    //   3351: goto -> 3355
    //   3354: athrow
    //   3355: getstatic Perryc.1 : I
    //   3358: ifeq -> 3372
    //   3361: ldc2_w -1413167609
    //   3364: l2i
    //   3365: ldc_w 131216910
    //   3368: ixor
    //   3369: goto -> 3380
    //   3372: ldc2_w 698840259
    //   3375: l2i
    //   3376: ldc_w -1758564078
    //   3379: ixor
    //   3380: ldc2_w 1645952606
    //   3383: l2i
    //   3384: ldc_w -1815113959
    //   3387: ixor
    //   3388: ixor
    //   3389: lookupswitch default -> 5020, 1331541142 -> 3416, 1573011790 -> 3372
    //   3416: astore_3
    //   3417: getstatic Perryc.0 : I
    //   3420: ifle -> 3434
    //   3423: ldc2_w -717206675
    //   3426: l2i
    //   3427: ldc_w 1192562943
    //   3430: ixor
    //   3431: goto -> 3442
    //   3434: ldc2_w 2079790564
    //   3437: l2i
    //   3438: ldc_w -6765098
    //   3441: ixor
    //   3442: ldc2_w 1287232956
    //   3445: l2i
    //   3446: ldc_w -904274611
    //   3449: ixor
    //   3450: ixor
    //   3451: lookupswitch default -> 3476, 351607651 -> 5094, 1448883235 -> 3434
    //   3476: aload_3
    //   3477: getstatic Perryc.0 : I
    //   3480: ifle -> 3494
    //   3483: ldc2_w -198820171
    //   3486: l2i
    //   3487: ldc_w -2037111881
    //   3490: ixor
    //   3491: goto -> 3502
    //   3494: ldc2_w -1072716189
    //   3497: l2i
    //   3498: ldc_w -814163748
    //   3501: ixor
    //   3502: ldc2_w -1788118859
    //   3505: l2i
    //   3506: ldc_w 399314923
    //   3509: ixor
    //   3510: ixor
    //   3511: lookupswitch default -> 3536, -267097508 -> 5054, 1082612731 -> 3494
    //   3536: goto -> 3540
    //   3539: athrow
    //   3540: invokevirtual getAsJsonArray : ()Lcom/google/gson/JsonArray;
    //   3543: goto -> 3547
    //   3546: athrow
    //   3547: getstatic Perryc.0 : I
    //   3550: ifle -> 3564
    //   3553: ldc2_w -221707819
    //   3556: l2i
    //   3557: ldc_w 803122841
    //   3560: ixor
    //   3561: goto -> 3572
    //   3564: ldc2_w 1997393746
    //   3567: l2i
    //   3568: ldc_w 1354810676
    //   3571: ixor
    //   3572: ldc2_w -895896907
    //   3575: l2i
    //   3576: ldc_w 1698824008
    //   3579: ixor
    //   3580: ixor
    //   3581: lookupswitch default -> 3608, -1942387571 -> 3564, 1926226609 -> 5014
    //   3608: goto -> 3612
    //   3611: athrow
    //   3612: invokevirtual size : ()I
    //   3615: goto -> 3619
    //   3618: athrow
    //   3619: ifne -> 3633
    //   3622: ldc2_w -404381825
    //   3625: l2i
    //   3626: ldc_w 1888098409
    //   3629: ixor
    //   3630: goto -> 3641
    //   3633: ldc2_w 1023512115
    //   3636: l2i
    //   3637: ldc_w -1435629278
    //   3640: ixor
    //   3641: ldc2_w 8647042
    //   3644: l2i
    //   3645: ldc_w 1005336271
    //   3648: ixor
    //   3649: ixor
    //   3650: tableswitch default -> 3622, -1409269669 -> 3672, -1409269668 -> 3822
    //   3672: ldc_w '党㌜儎蕂ꔑ뿋฾Ⳉ㛚吝਩鲭짘納찐辞襥ᾒ렯?侘믂︉廙Ԍᢟ'
    //   3675: getstatic Perryc.1 : I
    //   3678: ifeq -> 3692
    //   3681: ldc2_w -349619430
    //   3684: l2i
    //   3685: ldc_w -1974838294
    //   3688: ixor
    //   3689: goto -> 3700
    //   3692: ldc2_w -2024026924
    //   3695: l2i
    //   3696: ldc_w 1316855641
    //   3699: ixor
    //   3700: ldc2_w 1314517065
    //   3703: l2i
    //   3704: ldc_w -593289195
    //   3707: ixor
    //   3708: ixor
    //   3709: lookupswitch default -> 5034, -208031572 -> 3692, 1541178321 -> 3736
    //   3736: goto -> 3740
    //   3739: athrow
    //   3740: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3743: goto -> 3747
    //   3746: athrow
    //   3747: getstatic Perryc.c : I
    //   3750: iflt -> 3764
    //   3753: ldc2_w 855348328
    //   3756: l2i
    //   3757: ldc_w -1143582621
    //   3760: ixor
    //   3761: goto -> 3772
    //   3764: ldc2_w -1971737377
    //   3767: l2i
    //   3768: ldc_w 219372530
    //   3771: ixor
    //   3772: ldc2_w -891702740
    //   3775: l2i
    //   3776: ldc_w -1313214734
    //   3779: ixor
    //   3780: ixor
    //   3781: lookupswitch default -> 3808, -229795627 -> 5026, -41300942 -> 3764
    //   3808: goto -> 3812
    //   3811: athrow
    //   3812: invokestatic sendMessage : (Ljava/lang/String;)V
    //   3815: goto -> 3819
    //   3818: athrow
    //   3819: goto -> 5003
    //   3822: getstatic Perryc.0 : I
    //   3825: ifle -> 3839
    //   3828: ldc2_w -1271342751
    //   3831: l2i
    //   3832: ldc_w -2065633581
    //   3835: ixor
    //   3836: goto -> 3847
    //   3839: ldc2_w 1879151068
    //   3842: l2i
    //   3843: ldc_w 1569361260
    //   3846: ixor
    //   3847: ldc2_w -1788612697
    //   3850: l2i
    //   3851: ldc_w 1700772197
    //   3854: ixor
    //   3855: ixor
    //   3856: lookupswitch default -> 5126, -1058774672 -> 3839, -575190414 -> 3884
    //   3884: aload_3
    //   3885: getstatic Perryc.c : I
    //   3888: iflt -> 3902
    //   3891: ldc2_w -916484843
    //   3894: l2i
    //   3895: ldc_w 1186336213
    //   3898: ixor
    //   3899: goto -> 3910
    //   3902: ldc2_w -578223791
    //   3905: l2i
    //   3906: ldc_w 1402164296
    //   3909: ixor
    //   3910: ldc2_w -984613003
    //   3913: l2i
    //   3914: ldc_w -813281520
    //   3917: ixor
    //   3918: ixor
    //   3919: lookupswitch default -> 3944, -2061487963 -> 5080, -1386206093 -> 3902
    //   3944: goto -> 3948
    //   3947: athrow
    //   3948: invokevirtual getAsJsonArray : ()Lcom/google/gson/JsonArray;
    //   3951: goto -> 3955
    //   3954: athrow
    //   3955: ldc2_w -890591503
    //   3958: l2i
    //   3959: ldc_w -890591503
    //   3962: ixor
    //   3963: getstatic Perryc.0 : I
    //   3966: ifle -> 3980
    //   3969: ldc2_w 1960868891
    //   3972: l2i
    //   3973: ldc_w 1189834733
    //   3976: ixor
    //   3977: goto -> 3988
    //   3980: ldc2_w 491423901
    //   3983: l2i
    //   3984: ldc_w -1853810355
    //   3987: ixor
    //   3988: ldc2_w -652252468
    //   3991: l2i
    //   3992: ldc_w -408535479
    //   3995: ixor
    //   3996: ixor
    //   3997: lookupswitch default -> 4024, 213010291 -> 5048, 719348030 -> 3980
    //   4024: goto -> 4028
    //   4027: athrow
    //   4028: invokevirtual get : (I)Lcom/google/gson/JsonElement;
    //   4031: goto -> 4035
    //   4034: athrow
    //   4035: getstatic Perryc.c : I
    //   4038: iflt -> 4052
    //   4041: ldc2_w -158833688
    //   4044: l2i
    //   4045: ldc_w -1017605379
    //   4048: ixor
    //   4049: goto -> 4060
    //   4052: ldc2_w -1672463192
    //   4055: l2i
    //   4056: ldc_w 983675400
    //   4059: ixor
    //   4060: ldc2_w -1615885211
    //   4063: l2i
    //   4064: ldc_w -816435016
    //   4067: ixor
    //   4068: ixor
    //   4069: lookupswitch default -> 4096, -1791655622 -> 4052, 1697205704 -> 5114
    //   4096: goto -> 4100
    //   4099: athrow
    //   4100: invokevirtual getAsJsonObject : ()Lcom/google/gson/JsonObject;
    //   4103: goto -> 4107
    //   4106: athrow
    //   4107: ldc_w '兰㌗'
    //   4110: getstatic Perryc.1 : I
    //   4113: ifeq -> 4127
    //   4116: ldc2_w 693107454
    //   4119: l2i
    //   4120: ldc_w 1153425352
    //   4123: ixor
    //   4124: goto -> 4135
    //   4127: ldc2_w -1704838914
    //   4130: l2i
    //   4131: ldc_w 421409510
    //   4134: ixor
    //   4135: ldc2_w -703724973
    //   4138: l2i
    //   4139: ldc_w 421439466
    //   4142: ixor
    //   4143: ixor
    //   4144: lookupswitch default -> 4172, -1965122302 -> 4127, -1562345329 -> 5090
    //   4172: goto -> 4176
    //   4175: athrow
    //   4176: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4179: goto -> 4183
    //   4182: athrow
    //   4183: getstatic Perryc.1 : I
    //   4186: ifeq -> 4200
    //   4189: ldc2_w -2034286725
    //   4192: l2i
    //   4193: ldc_w 726972651
    //   4196: ixor
    //   4197: goto -> 4208
    //   4200: ldc2_w 926419073
    //   4203: l2i
    //   4204: ldc_w 1661555944
    //   4207: ixor
    //   4208: ldc2_w -1548396794
    //   4211: l2i
    //   4212: ldc_w -674542791
    //   4215: ixor
    //   4216: ixor
    //   4217: lookupswitch default -> 4244, -644506705 -> 5050, 890363241 -> 4200
    //   4244: goto -> 4248
    //   4247: athrow
    //   4248: invokevirtual get : (Ljava/lang/String;)Lcom/google/gson/JsonElement;
    //   4251: goto -> 4255
    //   4254: athrow
    //   4255: getstatic Perryc.c : I
    //   4258: iflt -> 4272
    //   4261: ldc2_w -1490448573
    //   4264: l2i
    //   4265: ldc_w -2020811939
    //   4268: ixor
    //   4269: goto -> 4280
    //   4272: ldc2_w 59949184
    //   4275: l2i
    //   4276: ldc_w 1688482517
    //   4279: ixor
    //   4280: ldc2_w -565748260
    //   4283: l2i
    //   4284: ldc_w 844109756
    //   4287: ixor
    //   4288: ixor
    //   4289: lookupswitch default -> 5030, -1960724427 -> 4316, -860742018 -> 4272
    //   4316: goto -> 4320
    //   4319: athrow
    //   4320: invokevirtual getAsString : ()Ljava/lang/String;
    //   4323: goto -> 4327
    //   4326: athrow
    //   4327: getstatic Perryc.0 : I
    //   4330: ifle -> 4344
    //   4333: ldc2_w 1904976537
    //   4336: l2i
    //   4337: ldc_w -940779668
    //   4340: ixor
    //   4341: goto -> 4352
    //   4344: ldc2_w -1776616242
    //   4347: l2i
    //   4348: ldc_w 1961414548
    //   4351: ixor
    //   4352: ldc2_w -1723322325
    //   4355: l2i
    //   4356: ldc_w 668056945
    //   4359: ixor
    //   4360: ixor
    //   4361: lookupswitch default -> 4388, -420478228 -> 4344, 150927535 -> 5038
    //   4388: astore #4
    //   4390: getstatic Perryc.0 : I
    //   4393: ifle -> 4407
    //   4396: ldc2_w 1555770282
    //   4399: l2i
    //   4400: ldc_w -1979864287
    //   4403: ixor
    //   4404: goto -> 4415
    //   4407: ldc2_w 1730908272
    //   4410: l2i
    //   4411: ldc_w -364189008
    //   4414: ixor
    //   4415: ldc2_w -1509756290
    //   4418: l2i
    //   4419: ldc_w 1696443669
    //   4422: ixor
    //   4423: ixor
    //   4424: lookupswitch default -> 4452, 554988 -> 4407, 374988768 -> 5056
    //   4452: aload_0
    //   4453: getstatic Perryc.c : I
    //   4456: iflt -> 4470
    //   4459: ldc2_w 1179676233
    //   4462: l2i
    //   4463: ldc_w -630443795
    //   4466: ixor
    //   4467: goto -> 4478
    //   4470: ldc2_w -682040301
    //   4473: l2i
    //   4474: ldc_w -2104122966
    //   4477: ixor
    //   4478: ldc2_w 1525094626
    //   4481: l2i
    //   4482: ldc_w 867330169
    //   4485: ixor
    //   4486: ixor
    //   4487: lookupswitch default -> 4512, -177656257 -> 5040, 698658063 -> 4470
    //   4512: aload #4
    //   4514: getstatic Perryc.1 : I
    //   4517: ifeq -> 4531
    //   4520: ldc2_w -832660498
    //   4523: l2i
    //   4524: ldc_w 155323717
    //   4527: ixor
    //   4528: goto -> 4539
    //   4531: ldc2_w 1059519896
    //   4534: l2i
    //   4535: ldc_w -1479636881
    //   4538: ixor
    //   4539: ldc2_w -741039277
    //   4542: l2i
    //   4543: ldc_w -2140848066
    //   4546: ixor
    //   4547: ixor
    //   4548: lookupswitch default -> 5110, -1800571450 -> 4531, -883321190 -> 4576
    //   4576: goto -> 4580
    //   4579: athrow
    //   4580: invokestatic fromString : (Ljava/lang/String;)Ljava/util/UUID;
    //   4583: goto -> 4587
    //   4586: athrow
    //   4587: getstatic Perryc.1 : I
    //   4590: ifeq -> 4604
    //   4593: ldc2_w 794962960
    //   4596: l2i
    //   4597: ldc_w 1517712586
    //   4600: ixor
    //   4601: goto -> 4612
    //   4604: ldc2_w -1161893250
    //   4607: l2i
    //   4608: ldc_w -89609515
    //   4611: ixor
    //   4612: ldc2_w 1142829247
    //   4615: l2i
    //   4616: ldc_w 1281892692
    //   4619: ixor
    //   4620: ixor
    //   4621: lookupswitch default -> 5068, 1214271808 -> 4648, 2103593265 -> 4604
    //   4648: putfield uuid : Ljava/util/UUID;
    //   4651: goto -> 5003
    //   4654: getstatic Perryc.1 : I
    //   4657: ifeq -> 4671
    //   4660: ldc2_w 473714548
    //   4663: l2i
    //   4664: ldc_w 1328987309
    //   4667: ixor
    //   4668: goto -> 4679
    //   4671: ldc2_w 1117421648
    //   4674: l2i
    //   4675: ldc_w 252018052
    //   4678: ixor
    //   4679: ldc2_w -1573668979
    //   4682: l2i
    //   4683: ldc_w 1147124962
    //   4686: ixor
    //   4687: ixor
    //   4688: lookupswitch default -> 5060, -1410074949 -> 4716, -1251542858 -> 4671
    //   4716: astore #4
    //   4718: getstatic Perryc.c : I
    //   4721: iflt -> 4735
    //   4724: ldc2_w -1053181465
    //   4727: l2i
    //   4728: ldc_w -281725343
    //   4731: ixor
    //   4732: goto -> 4743
    //   4735: ldc2_w -252330480
    //   4738: l2i
    //   4739: ldc_w 1946136931
    //   4742: ixor
    //   4743: ldc2_w 2049517846
    //   4746: l2i
    //   4747: ldc_w 1868180563
    //   4750: ixor
    //   4751: ixor
    //   4752: lookupswitch default -> 5032, -1770452426 -> 4780, 998214339 -> 4735
    //   4780: aload #4
    //   4782: getstatic Perryc.1 : I
    //   4785: ifeq -> 4799
    //   4788: ldc2_w 1254034291
    //   4791: l2i
    //   4792: ldc_w -2063280972
    //   4795: ixor
    //   4796: goto -> 4807
    //   4799: ldc2_w -1793773379
    //   4802: l2i
    //   4803: ldc_w -2126664327
    //   4806: ixor
    //   4807: ldc2_w 384384889
    //   4810: l2i
    //   4811: ldc_w -1222939196
    //   4814: ixor
    //   4815: ixor
    //   4816: lookupswitch default -> 5042, -1243951239 -> 4844, 1850314106 -> 4799
    //   4844: goto -> 4848
    //   4847: athrow
    //   4848: invokevirtual printStackTrace : ()V
    //   4851: goto -> 4855
    //   4854: athrow
    //   4855: ldc_w '党㌜儎蕂ꔑ뿋฾Ⳉ㛚吝਩鲭짘納찐辞襥ᾒ렯?侘믂︉廙Ԍᢜ'
    //   4858: getstatic Perryc.0 : I
    //   4861: ifle -> 4875
    //   4864: ldc2_w -1478533047
    //   4867: l2i
    //   4868: ldc_w -472351531
    //   4871: ixor
    //   4872: goto -> 4883
    //   4875: ldc2_w 554582579
    //   4878: l2i
    //   4879: ldc_w 406157352
    //   4882: ixor
    //   4883: ldc2_w 1407425399
    //   4886: l2i
    //   4887: ldc_w 2103529149
    //   4890: ixor
    //   4891: ixor
    //   4892: lookupswitch default -> 4920, -559346594 -> 4875, 1787152726 -> 5098
    //   4920: goto -> 4924
    //   4923: athrow
    //   4924: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4927: goto -> 4931
    //   4930: athrow
    //   4931: getstatic Perryc.0 : I
    //   4934: ifle -> 4948
    //   4937: ldc2_w -1466618140
    //   4940: l2i
    //   4941: ldc_w 695486456
    //   4944: ixor
    //   4945: goto -> 4956
    //   4948: ldc2_w -164094671
    //   4951: l2i
    //   4952: ldc_w 130271767
    //   4955: ixor
    //   4956: ldc2_w 485395671
    //   4959: l2i
    //   4960: ldc_w -287708664
    //   4963: ixor
    //   4964: ixor
    //   4965: lookupswitch default -> 5010, 63746553 -> 4992, 1943408579 -> 4948
    //   4992: goto -> 4996
    //   4995: athrow
    //   4996: invokestatic sendMessage : (Ljava/lang/String;)V
    //   4999: goto -> 5003
    //   5002: athrow
    //   5003: return
    //   5004: aconst_null
    //   5005: athrow
    //   5006: aconst_null
    //   5007: athrow
    //   5008: aconst_null
    //   5009: athrow
    //   5010: aconst_null
    //   5011: athrow
    //   5012: aconst_null
    //   5013: athrow
    //   5014: aconst_null
    //   5015: athrow
    //   5016: aconst_null
    //   5017: athrow
    //   5018: aconst_null
    //   5019: athrow
    //   5020: aconst_null
    //   5021: athrow
    //   5022: aconst_null
    //   5023: athrow
    //   5024: aconst_null
    //   5025: athrow
    //   5026: aconst_null
    //   5027: athrow
    //   5028: aconst_null
    //   5029: athrow
    //   5030: aconst_null
    //   5031: athrow
    //   5032: aconst_null
    //   5033: athrow
    //   5034: aconst_null
    //   5035: athrow
    //   5036: aconst_null
    //   5037: athrow
    //   5038: aconst_null
    //   5039: athrow
    //   5040: aconst_null
    //   5041: athrow
    //   5042: aconst_null
    //   5043: athrow
    //   5044: aconst_null
    //   5045: athrow
    //   5046: aconst_null
    //   5047: athrow
    //   5048: aconst_null
    //   5049: athrow
    //   5050: aconst_null
    //   5051: athrow
    //   5052: aconst_null
    //   5053: athrow
    //   5054: aconst_null
    //   5055: athrow
    //   5056: aconst_null
    //   5057: athrow
    //   5058: aconst_null
    //   5059: athrow
    //   5060: aconst_null
    //   5061: athrow
    //   5062: aconst_null
    //   5063: athrow
    //   5064: aconst_null
    //   5065: athrow
    //   5066: aconst_null
    //   5067: athrow
    //   5068: aconst_null
    //   5069: athrow
    //   5070: aconst_null
    //   5071: athrow
    //   5072: aconst_null
    //   5073: athrow
    //   5074: aconst_null
    //   5075: athrow
    //   5076: aconst_null
    //   5077: athrow
    //   5078: aconst_null
    //   5079: athrow
    //   5080: aconst_null
    //   5081: athrow
    //   5082: aconst_null
    //   5083: athrow
    //   5084: aconst_null
    //   5085: athrow
    //   5086: aconst_null
    //   5087: athrow
    //   5088: aconst_null
    //   5089: athrow
    //   5090: aconst_null
    //   5091: athrow
    //   5092: aconst_null
    //   5093: athrow
    //   5094: aconst_null
    //   5095: athrow
    //   5096: aconst_null
    //   5097: athrow
    //   5098: aconst_null
    //   5099: athrow
    //   5100: aconst_null
    //   5101: athrow
    //   5102: aconst_null
    //   5103: athrow
    //   5104: aconst_null
    //   5105: athrow
    //   5106: aconst_null
    //   5107: athrow
    //   5108: aconst_null
    //   5109: athrow
    //   5110: aconst_null
    //   5111: athrow
    //   5112: aconst_null
    //   5113: athrow
    //   5114: aconst_null
    //   5115: athrow
    //   5116: aconst_null
    //   5117: athrow
    //   5118: aconst_null
    //   5119: athrow
    //   5120: aconst_null
    //   5121: athrow
    //   5122: aconst_null
    //   5123: athrow
    //   5124: aconst_null
    //   5125: athrow
    //   5126: aconst_null
    //   5127: athrow
    //   5128: aconst_null
    //   5129: athrow
    //   5130: aconst_null
    //   5131: athrow
    //   5132: aconst_null
    //   5133: athrow
    //   5134: aconst_null
    //   5135: athrow
    //   5136: aconst_null
    //   5137: athrow
    //   5138: aconst_null
    //   5139: athrow
    //   5140: pop
    //   5141: goto -> 24
    //   5144: pop
    //   5145: aconst_null
    //   5146: goto -> 5140
    //   5149: dup
    //   5150: ifnull -> 5140
    //   5153: checkcast java/lang/Throwable
    //   5156: athrow
    //   5157: dup
    //   5158: ifnull -> 5144
    //   5161: checkcast java/lang/Throwable
    //   5164: athrow
    //   5165: aconst_null
    //   5166: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   421	1110	2	infoMap	Ljava/util/ArrayList;
    //   897	637	1	profile	Lnet/minecraft/client/network/NetworkPlayerInfo;
    //   1597	64	2	e	Ljava/lang/Exception;
    //   4390	261	4	id	Ljava/lang/String;
    //   4718	285	4	e	Ljava/lang/Exception;
    //   3417	1586	3	element	Lcom/google/gson/JsonElement;
    //   2697	2306	2	s	Ljava/lang/String;
    //   24	4980	0	this	Lbigname/zprestige/webhack/util/PlayerUtil$lookUpUUID;
    //   1661	3343	1	profile	Lnet/minecraft/client/network/NetworkPlayerInfo;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   421	1110	2	infoMap	Ljava/util/ArrayList<Lnet/minecraft/client/network/NetworkPlayerInfo;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	5149	finally
    //   24	215	1534	java/lang/Exception
    //   147	154	154	finally
    //   147	154	154	java/lang/IndexOutOfBoundsException
    //   147	154	3	finally
    //   147	154	3	finally
    //   148	154	147	finally
    //   216	222	222	finally
    //   216	222	3	finally
    //   216	222	3	finally
    //   216	222	3	java/lang/ArrayIndexOutOfBoundsException
    //   216	222	3	java/lang/ClassCastException
    //   216	747	1534	java/lang/Exception
    //   287	294	294	finally
    //   287	294	287	java/lang/IllegalArgumentException
    //   288	294	294	java/lang/StringIndexOutOfBoundsException
    //   288	294	294	java/lang/NegativeArraySizeException
    //   288	294	3	finally
    //   355	362	362	finally
    //   355	362	362	finally
    //   356	362	355	finally
    //   356	362	362	finally
    //   356	362	362	java/lang/IndexOutOfBoundsException
    //   543	550	550	finally
    //   543	550	550	java/lang/NumberFormatException
    //   543	550	550	finally
    //   544	550	543	java/lang/RuntimeException
    //   544	550	3	java/lang/IndexOutOfBoundsException
    //   675	684	684	finally
    //   675	684	684	finally
    //   675	684	675	java/lang/IllegalArgumentException
    //   675	684	684	java/lang/ArithmeticException
    //   676	684	684	finally
    //   748	756	756	finally
    //   748	756	3	java/lang/NullPointerException
    //   748	756	3	finally
    //   748	756	756	java/lang/RuntimeException
    //   748	756	756	finally
    //   748	1531	1534	java/lang/Exception
    //   823	830	830	finally
    //   823	830	823	finally
    //   823	830	830	java/lang/AssertionError
    //   824	830	3	java/lang/UnsupportedOperationException
    //   824	830	830	finally
    //   1195	1202	1202	finally
    //   1195	1202	1195	java/util/ConcurrentModificationException
    //   1195	1202	3	java/lang/NumberFormatException
    //   1196	1202	1202	java/lang/NegativeArraySizeException
    //   1196	1202	1202	finally
    //   1387	1394	1394	finally
    //   1387	1394	1387	java/lang/NullPointerException
    //   1387	1394	1394	finally
    //   1388	1394	3	java/lang/RuntimeException
    //   1388	1394	3	java/util/ConcurrentModificationException
    //   1459	1466	1466	finally
    //   1459	1466	1459	java/lang/NegativeArraySizeException
    //   1459	1466	1466	finally
    //   1460	1466	1466	java/lang/IndexOutOfBoundsException
    //   1460	1466	3	finally
    //   1843	1850	1850	finally
    //   1843	1850	1850	java/util/NoSuchElementException
    //   1843	1850	3	finally
    //   1843	1850	3	java/lang/UnsupportedOperationException
    //   1843	1850	1843	java/util/NoSuchElementException
    //   1915	1922	1922	finally
    //   1915	1922	1922	finally
    //   1916	1922	1915	finally
    //   1916	1922	3	finally
    //   1916	1922	1922	finally
    //   1991	1998	1998	finally
    //   1991	1998	1991	finally
    //   1991	1998	1991	java/lang/ArrayIndexOutOfBoundsException
    //   1992	1998	1991	java/lang/IllegalArgumentException
    //   1992	1998	1998	finally
    //   2067	2074	2074	finally
    //   2067	2074	2067	finally
    //   2067	2074	2067	java/lang/NegativeArraySizeException
    //   2068	2074	3	finally
    //   2068	2074	3	finally
    //   2140	2146	2146	finally
    //   2140	2146	2146	finally
    //   2140	2146	2146	java/lang/RuntimeException
    //   2140	2146	3	java/lang/ArrayIndexOutOfBoundsException
    //   2140	2146	3	java/lang/ArithmeticException
    //   2335	2342	2342	finally
    //   2335	2342	3	finally
    //   2335	2342	3	java/lang/IndexOutOfBoundsException
    //   2336	2342	2342	finally
    //   2336	2342	2335	java/lang/EnumConstantNotPresentException
    //   2411	2418	2418	finally
    //   2411	2418	3	java/util/NoSuchElementException
    //   2412	2418	2418	finally
    //   2412	2418	2418	java/lang/IllegalStateException
    //   2412	2418	2411	java/lang/IndexOutOfBoundsException
    //   2483	2490	2490	finally
    //   2483	2490	3	java/lang/AssertionError
    //   2483	2490	2490	java/util/ConcurrentModificationException
    //   2484	2490	2490	java/util/NoSuchElementException
    //   2484	2490	2483	finally
    //   2556	2562	2562	finally
    //   2556	2562	3	finally
    //   2556	2562	2562	java/lang/NumberFormatException
    //   2556	2562	2562	java/lang/IllegalArgumentException
    //   2556	2562	2562	java/lang/ArrayIndexOutOfBoundsException
    //   2628	2634	2634	finally
    //   2628	2634	3	finally
    //   2628	2634	3	java/lang/EnumConstantNotPresentException
    //   2628	2634	3	finally
    //   2628	2634	3	finally
    //   2935	2942	2942	finally
    //   2935	2942	3	java/lang/ArrayIndexOutOfBoundsException
    //   2935	2942	2935	java/lang/ArithmeticException
    //   2935	2942	3	finally
    //   2936	2942	2935	finally
    //   3063	3070	3070	finally
    //   3063	3070	3	finally
    //   3064	3070	3063	finally
    //   3064	3070	3070	finally
    //   3064	3070	3070	finally
    //   3135	3142	3142	finally
    //   3135	3142	3	finally
    //   3135	3142	3135	finally
    //   3135	3142	3142	java/lang/IndexOutOfBoundsException
    //   3136	3142	3142	finally
    //   3215	3222	3222	finally
    //   3216	3222	3	finally
    //   3216	3222	3215	finally
    //   3216	3222	3215	java/lang/AssertionError
    //   3216	3222	3215	finally
    //   3347	3354	3354	finally
    //   3347	3354	3354	java/lang/StringIndexOutOfBoundsException
    //   3348	3354	3	java/util/ConcurrentModificationException
    //   3348	3354	3347	java/util/ConcurrentModificationException
    //   3348	3354	3354	java/lang/IllegalArgumentException
    //   3539	3546	3546	finally
    //   3539	3546	3539	java/lang/ArrayIndexOutOfBoundsException
    //   3540	3546	3539	finally
    //   3540	3546	3546	finally
    //   3540	3546	3546	finally
    //   3611	3618	3618	finally
    //   3611	3618	3611	java/lang/IndexOutOfBoundsException
    //   3611	3618	3611	java/lang/NumberFormatException
    //   3612	3618	3	finally
    //   3612	3618	3611	finally
    //   3739	3746	3746	finally
    //   3739	3746	3746	java/lang/AssertionError
    //   3739	3746	3746	finally
    //   3739	3746	3739	java/lang/AssertionError
    //   3740	3746	3746	finally
    //   3812	3818	3818	finally
    //   3812	3818	3	finally
    //   3812	3818	3818	java/lang/AssertionError
    //   3812	3818	3818	finally
    //   3812	3818	3818	java/lang/RuntimeException
    //   3822	4651	4654	java/lang/Exception
    //   3947	3954	3954	finally
    //   3947	3954	3947	finally
    //   3947	3954	3954	finally
    //   3947	3954	3947	finally
    //   3948	3954	3	java/lang/ArrayIndexOutOfBoundsException
    //   4027	4034	4034	finally
    //   4027	4034	4027	finally
    //   4027	4034	4034	finally
    //   4028	4034	4027	java/util/NoSuchElementException
    //   4028	4034	4027	java/lang/IllegalArgumentException
    //   4099	4106	4106	finally
    //   4099	4106	4099	java/lang/ClassCastException
    //   4100	4106	4099	java/lang/ArrayIndexOutOfBoundsException
    //   4100	4106	4106	java/lang/StringIndexOutOfBoundsException
    //   4100	4106	4106	java/lang/NegativeArraySizeException
    //   4175	4182	4182	finally
    //   4175	4182	4182	finally
    //   4175	4182	4175	java/util/NoSuchElementException
    //   4176	4182	4182	java/lang/NumberFormatException
    //   4176	4182	3	java/lang/UnsupportedOperationException
    //   4247	4254	4254	finally
    //   4247	4254	4247	finally
    //   4247	4254	4247	finally
    //   4248	4254	4254	java/lang/IndexOutOfBoundsException
    //   4248	4254	4254	java/lang/NumberFormatException
    //   4319	4326	4326	finally
    //   4319	4326	4319	java/lang/ArithmeticException
    //   4320	4326	4319	java/lang/IndexOutOfBoundsException
    //   4320	4326	4319	java/lang/IndexOutOfBoundsException
    //   4320	4326	3	finally
    //   4579	4586	4586	finally
    //   4579	4586	4586	java/lang/NullPointerException
    //   4580	4586	3	finally
    //   4580	4586	4586	java/lang/IndexOutOfBoundsException
    //   4580	4586	4579	java/lang/UnsupportedOperationException
    //   4847	4854	4854	finally
    //   4847	4854	4854	java/lang/IllegalStateException
    //   4847	4854	4847	finally
    //   4847	4854	4847	java/lang/AssertionError
    //   4848	4854	3	java/lang/ArrayIndexOutOfBoundsException
    //   4924	4930	4930	finally
    //   4924	4930	4930	finally
    //   4924	4930	4930	java/util/ConcurrentModificationException
    //   4924	4930	4930	finally
    //   4924	4930	4930	java/lang/NegativeArraySizeException
    //   4995	5002	5002	finally
    //   4995	5002	3	finally
    //   4995	5002	4995	finally
    //   4996	5002	3	java/lang/ArithmeticException
    //   4996	5002	3	java/util/ConcurrentModificationException
    //   5149	5157	5149	finally
    //   5165	5167	3	finally
  }
  
  public PlayerUtil$lookUpUUID(String name) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w 2118825531
    //   9: l2i
    //   10: ldc_w -478973120
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1928546712
    //   20: l2i
    //   21: ldc_w -692934322
    //   24: ixor
    //   25: ldc2_w 1665402053
    //   28: l2i
    //   29: ldc_w 1290466901
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1954691236 -> 17, -1298712597 -> 310
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w -1208873624
    //   70: l2i
    //   71: ldc_w 1465094626
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1360303263
    //   81: l2i
    //   82: ldc_w -498540218
    //   85: ixor
    //   86: ldc2_w 724654502
    //   89: l2i
    //   90: ldc_w 781167713
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 316, -450926259 -> 78, 1226670048 -> 120
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.1 : I
    //   126: ifeq -> 140
    //   129: ldc2_w 734425010
    //   132: l2i
    //   133: ldc_w -1559456651
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w 1839077656
    //   143: l2i
    //   144: ldc_w -729042109
    //   147: ixor
    //   148: ldc2_w -1820142422
    //   151: l2i
    //   152: ldc_w 1284709016
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 314, 1473983989 -> 140, 1711563881 -> 184
    //   184: aload_0
    //   185: getstatic Perryc.c : I
    //   188: iflt -> 202
    //   191: ldc2_w 1036877657
    //   194: l2i
    //   195: ldc_w 1445495210
    //   198: ixor
    //   199: goto -> 210
    //   202: ldc2_w -1266911464
    //   205: l2i
    //   206: ldc_w -440136254
    //   209: ixor
    //   210: ldc2_w 1742383340
    //   213: l2i
    //   214: ldc_w 150562299
    //   217: ixor
    //   218: ixor
    //   219: lookupswitch default -> 244, -279761528 -> 202, 80098276 -> 312
    //   244: aload_1
    //   245: getstatic Perryc.c : I
    //   248: iflt -> 262
    //   251: ldc2_w -2132491098
    //   254: l2i
    //   255: ldc_w 1312484548
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w -1961339669
    //   265: l2i
    //   266: ldc_w -1169150628
    //   269: ixor
    //   270: ldc2_w 1952420350
    //   273: l2i
    //   274: ldc_w -1981760315
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 308, -856206196 -> 304, 861996377 -> 262
    //   304: putfield name : Ljava/lang/String;
    //   307: return
    //   308: aconst_null
    //   309: athrow
    //   310: aconst_null
    //   311: athrow
    //   312: aconst_null
    //   313: athrow
    //   314: aconst_null
    //   315: athrow
    //   316: aconst_null
    //   317: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	308	0	this	Lbigname/zprestige/webhack/util/PlayerUtil$lookUpUUID;
    //   0	308	1	name	Ljava/lang/String;
  }
  
  public UUID getUUID() {
    return Perry1.1h(this, (int)126495500L ^ 0x47EC2A2);
  }
  
  public String getName() {
    return Perry1.m(this, (int)-866260058L ^ 0x868AFE6D);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\PlayerUtil$lookUpUUID.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */