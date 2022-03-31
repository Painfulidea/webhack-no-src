package bigname.zprestige.webhack.features.modules;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.Render2DEvent;
import bigname.zprestige.webhack.event.events.Render3DEvent;
import bigname.zprestige.webhack.features.Feature;
import bigname.zprestige.webhack.features.setting.Bind;
import bigname.zprestige.webhack.features.setting.Setting;

public class Module extends Feature {
  public float offset;
  
  public float arrayListOffset;
  
  public float arrayListVOffset;
  
  public boolean alwaysListening;
  
  public boolean sliding;
  
  public float vOffset;
  
  public Module$Category category;
  
  public Setting<Boolean> enabled;
  
  public Setting<Bind> bind;
  
  public boolean hasListener;
  
  public boolean hidden;
  
  public Setting<String> displayName;
  
  public String description;
  
  public Setting<Boolean> drawn;
  
  public void setEnabled(boolean paramBoolean) {
    Perry1.66(this, (int)-846687261L ^ 0xDB061607, paramBoolean);
  }
  
  public void onRender3D(Render3DEvent event) {
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
  
  public void onRender2D(Render2DEvent paramRender2DEvent) {
    Perry1.T(this, (int)1653178674L ^ 0x6B6724D7, paramRender2DEvent);
  }
  
  public void onDisable() {
    Perry1.3U(this, (int)-1189870957L ^ 0xE2896DA7);
  }
  
  public void setBind(int key) {
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
  
  public void disable() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2923
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 2915
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2907
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w 99761121
    //   33: l2i
    //   34: ldc 133101504
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -226297036
    //   43: l2i
    //   44: ldc 1615892296
    //   46: ixor
    //   47: ldc2_w -1682223840
    //   50: l2i
    //   51: ldc -978998821
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 2886, -859008889 -> 80, 1543645402 -> 40
    //   80: aload_0
    //   81: getstatic Perryc.1 : I
    //   84: ifeq -> 97
    //   87: ldc2_w -1708922779
    //   90: l2i
    //   91: ldc -1044706735
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w 1860231424
    //   100: l2i
    //   101: ldc -1382006741
    //   103: ixor
    //   104: ldc2_w -1043425805
    //   107: l2i
    //   108: ldc 205233011
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, -1791578024 -> 97, -1771180876 -> 2842
    //   140: getfield hasListener : Z
    //   143: ifeq -> 156
    //   146: ldc2_w -2035554162
    //   149: l2i
    //   150: ldc 1658289164
    //   152: ixor
    //   153: goto -> 163
    //   156: ldc2_w 1901786758
    //   159: l2i
    //   160: ldc -1792646651
    //   162: ixor
    //   163: ldc2_w 1627621885
    //   166: l2i
    //   167: ldc 882143493
    //   169: ixor
    //   170: ixor
    //   171: tableswitch default -> 146, -1309971334 -> 192, -1309971333 -> 547
    //   192: getstatic Perryc.0 : I
    //   195: ifle -> 208
    //   198: ldc2_w 780143743
    //   201: l2i
    //   202: ldc -1615224352
    //   204: ixor
    //   205: goto -> 215
    //   208: ldc2_w 966470882
    //   211: l2i
    //   212: ldc 219478931
    //   214: ixor
    //   215: ldc2_w -2017419230
    //   218: l2i
    //   219: ldc 346195418
    //   221: ixor
    //   222: ixor
    //   223: lookupswitch default -> 2878, -1477578103 -> 248, 576424039 -> 208
    //   248: aload_0
    //   249: getstatic Perryc.0 : I
    //   252: ifle -> 265
    //   255: ldc2_w 1661837285
    //   258: l2i
    //   259: ldc -658911247
    //   261: ixor
    //   262: goto -> 272
    //   265: ldc2_w -1943636215
    //   268: l2i
    //   269: ldc 1897249606
    //   271: ixor
    //   272: ldc2_w 951574017
    //   275: l2i
    //   276: ldc -1362433171
    //   278: ixor
    //   279: ixor
    //   280: lookupswitch default -> 2880, 768173432 -> 265, 1800337699 -> 308
    //   308: getfield alwaysListening : Z
    //   311: ifne -> 324
    //   314: ldc2_w 1017528726
    //   317: l2i
    //   318: ldc -1643203377
    //   320: ixor
    //   321: goto -> 331
    //   324: ldc2_w -1793813963
    //   327: l2i
    //   328: ldc 935094125
    //   330: ixor
    //   331: ldc2_w -942192619
    //   334: l2i
    //   335: ldc 1357483370
    //   337: ixor
    //   338: ixor
    //   339: tableswitch default -> 314, 899035174 -> 360, 899035175 -> 547
    //   360: getstatic Perryc.0 : I
    //   363: ifle -> 376
    //   366: ldc2_w -1338494063
    //   369: l2i
    //   370: ldc 643755472
    //   372: ixor
    //   373: goto -> 383
    //   376: ldc2_w 1952060744
    //   379: l2i
    //   380: ldc 975824811
    //   382: ixor
    //   383: ldc2_w -522742107
    //   386: l2i
    //   387: ldc -339499810
    //   389: ixor
    //   390: ixor
    //   391: lookupswitch default -> 416, -1653412806 -> 2854, -897089495 -> 376
    //   416: getstatic net/minecraftforge/common/MinecraftForge.EVENT_BUS : Lnet/minecraftforge/fml/common/eventhandler/EventBus;
    //   419: getstatic Perryc.1 : I
    //   422: ifeq -> 435
    //   425: ldc2_w -1887354928
    //   428: l2i
    //   429: ldc -1782247693
    //   431: ixor
    //   432: goto -> 442
    //   435: ldc2_w -2120443859
    //   438: l2i
    //   439: ldc 831837717
    //   441: ixor
    //   442: ldc2_w 424128292
    //   445: l2i
    //   446: ldc 212125334
    //   448: ixor
    //   449: ixor
    //   450: lookupswitch default -> 476, -1170956691 -> 435, 262625425 -> 2888
    //   476: aload_0
    //   477: getstatic Perryc.1 : I
    //   480: ifeq -> 493
    //   483: ldc2_w 68063304
    //   486: l2i
    //   487: ldc 34083723
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w -912316015
    //   496: l2i
    //   497: ldc_w 516900156
    //   500: ixor
    //   501: ldc2_w -1528350423
    //   504: l2i
    //   505: ldc_w 1987315224
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 2858, -728384270 -> 493, 96687004 -> 536
    //   536: goto -> 540
    //   539: athrow
    //   540: invokevirtual unregister : (Ljava/lang/Object;)V
    //   543: goto -> 547
    //   546: athrow
    //   547: getstatic Perryc.c : I
    //   550: iflt -> 564
    //   553: ldc2_w 1143010754
    //   556: l2i
    //   557: ldc_w -1844433171
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w 1191704871
    //   567: l2i
    //   568: ldc_w 935548821
    //   571: ixor
    //   572: ldc2_w 219862157
    //   575: l2i
    //   576: ldc_w -1195908449
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 2830, -982935392 -> 608, 1671294269 -> 564
    //   608: aload_0
    //   609: getstatic Perryc.1 : I
    //   612: ifeq -> 626
    //   615: ldc2_w -346549068
    //   618: l2i
    //   619: ldc_w -332645207
    //   622: ixor
    //   623: goto -> 634
    //   626: ldc2_w 2056571844
    //   629: l2i
    //   630: ldc_w -2130985776
    //   633: ixor
    //   634: ldc2_w -1521131543
    //   637: l2i
    //   638: ldc_w 1140323019
    //   641: ixor
    //   642: ixor
    //   643: lookupswitch default -> 668, -506034881 -> 2828, 603612491 -> 626
    //   668: getfield enabled : Lbigname/zprestige/webhack/features/setting/Setting;
    //   671: ldc2_w 820010614
    //   674: l2i
    //   675: ldc_w 820010614
    //   678: ixor
    //   679: getstatic Perryc.0 : I
    //   682: ifle -> 696
    //   685: ldc2_w -698208831
    //   688: l2i
    //   689: ldc_w -1773361317
    //   692: ixor
    //   693: goto -> 704
    //   696: ldc2_w 1828958100
    //   699: l2i
    //   700: ldc_w -2053110675
    //   703: ixor
    //   704: ldc2_w -581955440
    //   707: l2i
    //   708: ldc_w -407910772
    //   711: ixor
    //   712: ixor
    //   713: lookupswitch default -> 2850, -765690395 -> 740, 2060541062 -> 696
    //   740: goto -> 744
    //   743: athrow
    //   744: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   747: goto -> 751
    //   750: athrow
    //   751: getstatic Perryc.1 : I
    //   754: ifeq -> 768
    //   757: ldc2_w 1694470612
    //   760: l2i
    //   761: ldc_w -292135131
    //   764: ixor
    //   765: goto -> 776
    //   768: ldc2_w 1255200172
    //   771: l2i
    //   772: ldc_w 1564386765
    //   775: ixor
    //   776: ldc2_w -555300631
    //   779: l2i
    //   780: ldc_w -1885667901
    //   783: ixor
    //   784: ixor
    //   785: lookupswitch default -> 2866, -619316261 -> 768, 1183991115 -> 812
    //   812: goto -> 816
    //   815: athrow
    //   816: invokevirtual setValue : (Ljava/lang/Object;)V
    //   819: goto -> 823
    //   822: athrow
    //   823: getstatic Perryc.1 : I
    //   826: ifeq -> 840
    //   829: ldc2_w -2125535436
    //   832: l2i
    //   833: ldc_w 820330329
    //   836: ixor
    //   837: goto -> 848
    //   840: ldc2_w 530611203
    //   843: l2i
    //   844: ldc_w 2099839701
    //   847: ixor
    //   848: ldc2_w 2041279731
    //   851: l2i
    //   852: ldc_w -888327669
    //   855: ixor
    //   856: ixor
    //   857: lookupswitch default -> 884, 51224213 -> 2848, 1776218583 -> 840
    //   884: goto -> 888
    //   887: athrow
    //   888: invokestatic getInstance : ()Lbigname/zprestige/webhack/features/modules/Client/Notify;
    //   891: goto -> 895
    //   894: athrow
    //   895: getstatic Perryc.0 : I
    //   898: ifle -> 912
    //   901: ldc2_w -2092989726
    //   904: l2i
    //   905: ldc_w 612428340
    //   908: ixor
    //   909: goto -> 920
    //   912: ldc2_w -1156052658
    //   915: l2i
    //   916: ldc_w -562976281
    //   919: ixor
    //   920: ldc2_w -421152892
    //   923: l2i
    //   924: ldc_w -544383621
    //   927: ixor
    //   928: ixor
    //   929: lookupswitch default -> 2890, -1630043607 -> 912, 1543588438 -> 956
    //   956: getfield moduleMessage : Lbigname/zprestige/webhack/features/setting/Setting;
    //   959: getstatic Perryc.0 : I
    //   962: ifle -> 976
    //   965: ldc2_w -919540392
    //   968: l2i
    //   969: ldc_w -686103811
    //   972: ixor
    //   973: goto -> 984
    //   976: ldc2_w -1135706668
    //   979: l2i
    //   980: ldc_w 899603220
    //   983: ixor
    //   984: ldc2_w -1645987636
    //   987: l2i
    //   988: ldc_w 521622841
    //   991: ixor
    //   992: ixor
    //   993: lookupswitch default -> 1020, -1663475120 -> 2870, -1301392094 -> 976
    //   1020: goto -> 1024
    //   1023: athrow
    //   1024: invokevirtual getValue : ()Ljava/lang/Object;
    //   1027: goto -> 1031
    //   1030: athrow
    //   1031: checkcast java/lang/Boolean
    //   1034: getstatic Perryc.c : I
    //   1037: iflt -> 1051
    //   1040: ldc2_w -1017620747
    //   1043: l2i
    //   1044: ldc_w -626551080
    //   1047: ixor
    //   1048: goto -> 1059
    //   1051: ldc2_w 1945560415
    //   1054: l2i
    //   1055: ldc_w -1031206341
    //   1058: ixor
    //   1059: ldc2_w 830189114
    //   1062: l2i
    //   1063: ldc_w 1666444039
    //   1066: ixor
    //   1067: ixor
    //   1068: lookupswitch default -> 2894, -480794023 -> 1096, 1272415504 -> 1051
    //   1096: goto -> 1100
    //   1099: athrow
    //   1100: invokevirtual booleanValue : ()Z
    //   1103: goto -> 1107
    //   1106: athrow
    //   1107: ifeq -> 1121
    //   1110: ldc2_w -707374419
    //   1113: l2i
    //   1114: ldc_w 187961672
    //   1117: ixor
    //   1118: goto -> 1129
    //   1121: ldc2_w 161786000
    //   1124: l2i
    //   1125: ldc_w -683218058
    //   1128: ixor
    //   1129: ldc2_w -971814206
    //   1132: l2i
    //   1133: ldc_w 1360460386
    //   1136: ixor
    //   1137: ixor
    //   1138: tableswitch default -> 1110, 1239937861 -> 1160, 1239937862 -> 2555
    //   1160: new net/minecraft/util/text/TextComponentString
    //   1163: dup
    //   1164: new java/lang/StringBuilder
    //   1167: dup
    //   1168: getstatic Perryc.c : I
    //   1171: iflt -> 1185
    //   1174: ldc2_w -1198478169
    //   1177: l2i
    //   1178: ldc_w 1975948002
    //   1181: ixor
    //   1182: goto -> 1193
    //   1185: ldc2_w 1598590788
    //   1188: l2i
    //   1189: ldc_w 1262264265
    //   1192: ixor
    //   1193: ldc2_w 367203748
    //   1196: l2i
    //   1197: ldc_w -1994277063
    //   1200: ixor
    //   1201: ixor
    //   1202: lookupswitch default -> 1228, -372724178 -> 1185, 1368691928 -> 2884
    //   1228: goto -> 1232
    //   1231: athrow
    //   1232: invokespecial <init> : ()V
    //   1235: goto -> 1239
    //   1238: athrow
    //   1239: getstatic Perryc.0 : I
    //   1242: ifle -> 1256
    //   1245: ldc2_w 559116037
    //   1248: l2i
    //   1249: ldc_w -943176854
    //   1252: ixor
    //   1253: goto -> 1264
    //   1256: ldc2_w -896224413
    //   1259: l2i
    //   1260: ldc_w 438136491
    //   1263: ixor
    //   1264: ldc2_w -1929838524
    //   1267: l2i
    //   1268: ldc_w 65649348
    //   1271: ixor
    //   1272: ixor
    //   1273: lookupswitch default -> 2846, 1603888968 -> 1300, 1770755823 -> 1256
    //   1300: getstatic bigname/zprestige/webhack/WebHack.commandManager : Lbigname/zprestige/webhack/manager/CommandManager;
    //   1303: getstatic Perryc.1 : I
    //   1306: ifeq -> 1320
    //   1309: ldc2_w 2086043438
    //   1312: l2i
    //   1313: ldc_w 909677619
    //   1316: ixor
    //   1317: goto -> 1328
    //   1320: ldc2_w 1412934141
    //   1323: l2i
    //   1324: ldc_w 1753581862
    //   1327: ixor
    //   1328: ldc2_w 1922958113
    //   1331: l2i
    //   1332: ldc_w 62285241
    //   1335: ixor
    //   1336: ixor
    //   1337: lookupswitch default -> 1364, -195138223 -> 1320, 994479493 -> 2862
    //   1364: goto -> 1368
    //   1367: athrow
    //   1368: invokevirtual getClientMessage : ()Ljava/lang/String;
    //   1371: goto -> 1375
    //   1374: athrow
    //   1375: getstatic Perryc.1 : I
    //   1378: ifeq -> 1392
    //   1381: ldc2_w -2080978584
    //   1384: l2i
    //   1385: ldc_w -330554116
    //   1388: ixor
    //   1389: goto -> 1400
    //   1392: ldc2_w 1345664579
    //   1395: l2i
    //   1396: ldc_w 605634891
    //   1399: ixor
    //   1400: ldc2_w 274277094
    //   1403: l2i
    //   1404: ldc_w -172017059
    //   1407: ixor
    //   1408: ixor
    //   1409: lookupswitch default -> 2852, -1973619409 -> 1392, -1849004109 -> 1436
    //   1436: goto -> 1440
    //   1439: athrow
    //   1440: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1443: goto -> 1447
    //   1446: athrow
    //   1447: ldc_w ' '
    //   1450: getstatic Perryc.1 : I
    //   1453: ifeq -> 1467
    //   1456: ldc2_w 462797644
    //   1459: l2i
    //   1460: ldc_w 2078351991
    //   1463: ixor
    //   1464: goto -> 1475
    //   1467: ldc2_w 2063732049
    //   1470: l2i
    //   1471: ldc_w -1343347126
    //   1474: ixor
    //   1475: ldc2_w -1397001137
    //   1478: l2i
    //   1479: ldc_w -322718982
    //   1482: ixor
    //   1483: ixor
    //   1484: lookupswitch default -> 2836, -1802179154 -> 1512, 537681806 -> 1467
    //   1512: goto -> 1516
    //   1515: athrow
    //   1516: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1519: goto -> 1523
    //   1522: athrow
    //   1523: getstatic Perryc.c : I
    //   1526: iflt -> 1540
    //   1529: ldc2_w 919719369
    //   1532: l2i
    //   1533: ldc_w 1465250883
    //   1536: ixor
    //   1537: goto -> 1548
    //   1540: ldc2_w 1831909313
    //   1543: l2i
    //   1544: ldc_w 383807587
    //   1547: ixor
    //   1548: ldc2_w -1868190989
    //   1551: l2i
    //   1552: ldc_w 565863852
    //   1555: ixor
    //   1556: ixor
    //   1557: lookupswitch default -> 2820, -892401411 -> 1584, -795085099 -> 1540
    //   1584: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   1587: getstatic Perryc.0 : I
    //   1590: ifle -> 1604
    //   1593: ldc2_w -1755528544
    //   1596: l2i
    //   1597: ldc_w -1491240817
    //   1600: ixor
    //   1601: goto -> 1612
    //   1604: ldc2_w 1158436070
    //   1607: l2i
    //   1608: ldc_w 66536020
    //   1611: ixor
    //   1612: ldc2_w -207796252
    //   1615: l2i
    //   1616: ldc_w 91625587
    //   1619: ixor
    //   1620: ixor
    //   1621: lookupswitch default -> 2872, -1341109979 -> 1648, -961878600 -> 1604
    //   1648: goto -> 1652
    //   1651: athrow
    //   1652: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1655: goto -> 1659
    //   1658: athrow
    //   1659: getstatic Perryc.c : I
    //   1662: iflt -> 1676
    //   1665: ldc2_w 239397828
    //   1668: l2i
    //   1669: ldc_w 274309032
    //   1672: ixor
    //   1673: goto -> 1684
    //   1676: ldc2_w 1270873060
    //   1679: l2i
    //   1680: ldc_w -1333137739
    //   1683: ixor
    //   1684: ldc2_w -1839841487
    //   1687: l2i
    //   1688: ldc_w -1565220172
    //   1691: ixor
    //   1692: ixor
    //   1693: lookupswitch default -> 2822, -875263788 -> 1720, 788523497 -> 1676
    //   1720: aload_0
    //   1721: getstatic Perryc.c : I
    //   1724: iflt -> 1738
    //   1727: ldc2_w -929798977
    //   1730: l2i
    //   1731: ldc_w -1373153096
    //   1734: ixor
    //   1735: goto -> 1746
    //   1738: ldc2_w 793910475
    //   1741: l2i
    //   1742: ldc_w -100396795
    //   1745: ixor
    //   1746: ldc2_w 1364362085
    //   1749: l2i
    //   1750: ldc_w 1542523914
    //   1753: ixor
    //   1754: ixor
    //   1755: lookupswitch default -> 1780, 1813033832 -> 2860, 2121710432 -> 1738
    //   1780: goto -> 1784
    //   1783: athrow
    //   1784: invokevirtual getDisplayName : ()Ljava/lang/String;
    //   1787: goto -> 1791
    //   1790: athrow
    //   1791: getstatic Perryc.0 : I
    //   1794: ifle -> 1808
    //   1797: ldc2_w -866999536
    //   1800: l2i
    //   1801: ldc_w 861165312
    //   1804: ixor
    //   1805: goto -> 1816
    //   1808: ldc2_w 2047337334
    //   1811: l2i
    //   1812: ldc_w -1692142059
    //   1815: ixor
    //   1816: ldc2_w 44879113
    //   1819: l2i
    //   1820: ldc_w -2043424143
    //   1823: ixor
    //   1824: ixor
    //   1825: lookupswitch default -> 2844, 1706756635 -> 1852, 2073684840 -> 1808
    //   1852: goto -> 1856
    //   1855: athrow
    //   1856: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1859: goto -> 1863
    //   1862: athrow
    //   1863: ldc_w '혙㌇혴ᴪ萯㣩๼꯸꺹?溄ਡᯇ'
    //   1866: getstatic Perryc.1 : I
    //   1869: ifeq -> 1883
    //   1872: ldc2_w 1098385503
    //   1875: l2i
    //   1876: ldc_w -500227876
    //   1879: ixor
    //   1880: goto -> 1891
    //   1883: ldc2_w 1367602414
    //   1886: l2i
    //   1887: ldc_w -1225599761
    //   1890: ixor
    //   1891: ldc2_w 2035858704
    //   1894: l2i
    //   1895: ldc_w 1229382647
    //   1898: ixor
    //   1899: ixor
    //   1900: lookupswitch default -> 2838, -1823902108 -> 1883, -680558874 -> 1928
    //   1928: goto -> 1932
    //   1931: athrow
    //   1932: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1935: goto -> 1939
    //   1938: athrow
    //   1939: getstatic Perryc.c : I
    //   1942: iflt -> 1956
    //   1945: ldc2_w -851350653
    //   1948: l2i
    //   1949: ldc_w 1213803258
    //   1952: ixor
    //   1953: goto -> 1964
    //   1956: ldc2_w 646947721
    //   1959: l2i
    //   1960: ldc_w -201049614
    //   1963: ixor
    //   1964: ldc2_w -340571779
    //   1967: l2i
    //   1968: ldc_w 1397008408
    //   1971: ixor
    //   1972: ixor
    //   1973: lookupswitch default -> 2000, 153109958 -> 1956, 1039114268 -> 2892
    //   2000: goto -> 2004
    //   2003: athrow
    //   2004: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2007: goto -> 2011
    //   2010: athrow
    //   2011: getstatic Perryc.1 : I
    //   2014: ifeq -> 2028
    //   2017: ldc2_w -1940171926
    //   2020: l2i
    //   2021: ldc_w 441635438
    //   2024: ixor
    //   2025: goto -> 2036
    //   2028: ldc2_w 284778776
    //   2031: l2i
    //   2032: ldc_w -1990549253
    //   2035: ixor
    //   2036: ldc2_w 1972190775
    //   2039: l2i
    //   2040: ldc_w -1051731185
    //   2043: ixor
    //   2044: ixor
    //   2045: lookupswitch default -> 2072, -1724103312 -> 2028, 583754812 -> 2868
    //   2072: goto -> 2076
    //   2075: athrow
    //   2076: invokevirtual toString : ()Ljava/lang/String;
    //   2079: goto -> 2083
    //   2082: athrow
    //   2083: getstatic Perryc.1 : I
    //   2086: ifeq -> 2100
    //   2089: ldc2_w -1180523797
    //   2092: l2i
    //   2093: ldc_w 1896280650
    //   2096: ixor
    //   2097: goto -> 2108
    //   2100: ldc2_w 110144588
    //   2103: l2i
    //   2104: ldc_w 1787031390
    //   2107: ixor
    //   2108: ldc2_w 58407045
    //   2111: l2i
    //   2112: ldc_w 1934199476
    //   2115: ixor
    //   2116: ixor
    //   2117: lookupswitch default -> 2144, -1198071152 -> 2824, -314038262 -> 2100
    //   2144: goto -> 2148
    //   2147: athrow
    //   2148: invokespecial <init> : (Ljava/lang/String;)V
    //   2151: goto -> 2155
    //   2154: athrow
    //   2155: getstatic Perryc.0 : I
    //   2158: ifle -> 2172
    //   2161: ldc2_w 1082631548
    //   2164: l2i
    //   2165: ldc_w -627037510
    //   2168: ixor
    //   2169: goto -> 2180
    //   2172: ldc2_w -522306257
    //   2175: l2i
    //   2176: ldc_w -1372091043
    //   2179: ixor
    //   2180: ldc2_w 366025150
    //   2183: l2i
    //   2184: ldc_w 1311176610
    //   2187: ixor
    //   2188: ixor
    //   2189: lookupswitch default -> 2216, -1043308070 -> 2874, -137177745 -> 2172
    //   2216: astore_1
    //   2217: getstatic Perryc.0 : I
    //   2220: ifle -> 2234
    //   2223: ldc2_w 222755379
    //   2226: l2i
    //   2227: ldc_w 468470104
    //   2230: ixor
    //   2231: goto -> 2242
    //   2234: ldc2_w 834052708
    //   2237: l2i
    //   2238: ldc_w 1849791742
    //   2241: ixor
    //   2242: ldc2_w -957545105
    //   2245: l2i
    //   2246: ldc_w 2135471749
    //   2249: ixor
    //   2250: ixor
    //   2251: lookupswitch default -> 2276, -1357971327 -> 2826, 731686040 -> 2234
    //   2276: getstatic bigname/zprestige/webhack/features/modules/Module.mc : Lnet/minecraft/client/Minecraft;
    //   2279: getstatic Perryc.0 : I
    //   2282: ifle -> 2296
    //   2285: ldc2_w -1797552275
    //   2288: l2i
    //   2289: ldc_w -2006732327
    //   2292: ixor
    //   2293: goto -> 2304
    //   2296: ldc2_w -613780513
    //   2299: l2i
    //   2300: ldc_w 1440648733
    //   2303: ixor
    //   2304: ldc2_w 995749376
    //   2307: l2i
    //   2308: ldc_w 848144387
    //   2311: ixor
    //   2312: ixor
    //   2313: lookupswitch default -> 2832, -2023703615 -> 2340, 359428279 -> 2296
    //   2340: getfield field_71456_v : Lnet/minecraft/client/gui/GuiIngame;
    //   2343: getstatic Perryc.c : I
    //   2346: iflt -> 2360
    //   2349: ldc2_w 1342358381
    //   2352: l2i
    //   2353: ldc_w -74531759
    //   2356: ixor
    //   2357: goto -> 2368
    //   2360: ldc2_w -29139416
    //   2363: l2i
    //   2364: ldc_w -952440020
    //   2367: ixor
    //   2368: ldc2_w -1421759018
    //   2371: l2i
    //   2372: ldc_w -160093384
    //   2375: ixor
    //   2376: ixor
    //   2377: lookupswitch default -> 2404, -155649582 -> 2834, 1960172816 -> 2360
    //   2404: goto -> 2408
    //   2407: athrow
    //   2408: invokevirtual func_146158_b : ()Lnet/minecraft/client/gui/GuiNewChat;
    //   2411: goto -> 2415
    //   2414: athrow
    //   2415: getstatic Perryc.0 : I
    //   2418: ifle -> 2432
    //   2421: ldc2_w 1011295589
    //   2424: l2i
    //   2425: ldc_w -236415000
    //   2428: ixor
    //   2429: goto -> 2440
    //   2432: ldc2_w 413734246
    //   2435: l2i
    //   2436: ldc_w -663668461
    //   2439: ixor
    //   2440: ldc2_w -189975101
    //   2443: l2i
    //   2444: ldc_w 1431470776
    //   2447: ixor
    //   2448: ixor
    //   2449: lookupswitch default -> 2476, -518931177 -> 2432, 1817183734 -> 2896
    //   2476: aload_1
    //   2477: ldc2_w -651010795
    //   2480: l2i
    //   2481: ldc_w -651010796
    //   2484: ixor
    //   2485: getstatic Perryc.0 : I
    //   2488: ifle -> 2502
    //   2491: ldc2_w 609788516
    //   2494: l2i
    //   2495: ldc_w 1393677049
    //   2498: ixor
    //   2499: goto -> 2510
    //   2502: ldc2_w -273048730
    //   2505: l2i
    //   2506: ldc_w -2107179693
    //   2509: ixor
    //   2510: ldc2_w 1918562084
    //   2513: l2i
    //   2514: ldc_w 1107895777
    //   2517: ixor
    //   2518: ixor
    //   2519: lookupswitch default -> 2856, 1192933976 -> 2502, 1569500400 -> 2544
    //   2544: goto -> 2548
    //   2547: athrow
    //   2548: invokevirtual func_146234_a : (Lnet/minecraft/util/text/ITextComponent;I)V
    //   2551: goto -> 2555
    //   2554: athrow
    //   2555: getstatic Perryc.c : I
    //   2558: iflt -> 2572
    //   2561: ldc2_w -2137668473
    //   2564: l2i
    //   2565: ldc_w -2036632268
    //   2568: ixor
    //   2569: goto -> 2580
    //   2572: ldc2_w -199831562
    //   2575: l2i
    //   2576: ldc_w 1412618817
    //   2579: ixor
    //   2580: ldc2_w -1192445467
    //   2583: l2i
    //   2584: ldc_w 555332070
    //   2587: ixor
    //   2588: ixor
    //   2589: lookupswitch default -> 2882, -1610892880 -> 2572, 970005940 -> 2616
    //   2616: aload_0
    //   2617: getstatic Perryc.1 : I
    //   2620: ifeq -> 2634
    //   2623: ldc2_w -1338049865
    //   2626: l2i
    //   2627: ldc_w 1026050144
    //   2630: ixor
    //   2631: goto -> 2642
    //   2634: ldc2_w 2061434136
    //   2637: l2i
    //   2638: ldc_w -1172681445
    //   2641: ixor
    //   2642: ldc2_w -853680286
    //   2645: l2i
    //   2646: ldc_w -1793519874
    //   2649: ixor
    //   2650: ixor
    //   2651: lookupswitch default -> 2840, -1732222561 -> 2676, -720215221 -> 2634
    //   2676: goto -> 2680
    //   2679: athrow
    //   2680: invokevirtual onToggle : ()V
    //   2683: goto -> 2687
    //   2686: athrow
    //   2687: getstatic Perryc.1 : I
    //   2690: ifeq -> 2704
    //   2693: ldc2_w -406947318
    //   2696: l2i
    //   2697: ldc_w -2117854857
    //   2700: ixor
    //   2701: goto -> 2712
    //   2704: ldc2_w 30128819
    //   2707: l2i
    //   2708: ldc_w -404516354
    //   2711: ixor
    //   2712: ldc2_w -1764881772
    //   2715: l2i
    //   2716: ldc_w 580318153
    //   2719: ixor
    //   2720: ixor
    //   2721: lookupswitch default -> 2864, -769484256 -> 2704, 1383125520 -> 2748
    //   2748: aload_0
    //   2749: getstatic Perryc.c : I
    //   2752: iflt -> 2766
    //   2755: ldc2_w 25925211
    //   2758: l2i
    //   2759: ldc_w -1985134389
    //   2762: ixor
    //   2763: goto -> 2774
    //   2766: ldc2_w -1816193995
    //   2769: l2i
    //   2770: ldc_w -981124422
    //   2773: ixor
    //   2774: ldc2_w 1119595198
    //   2777: l2i
    //   2778: ldc_w 2012909724
    //   2781: ixor
    //   2782: ixor
    //   2783: lookupswitch default -> 2876, -1117262670 -> 2766, 1669010605 -> 2808
    //   2808: goto -> 2812
    //   2811: athrow
    //   2812: invokevirtual onDisable : ()V
    //   2815: goto -> 2819
    //   2818: athrow
    //   2819: return
    //   2820: aconst_null
    //   2821: athrow
    //   2822: aconst_null
    //   2823: athrow
    //   2824: aconst_null
    //   2825: athrow
    //   2826: aconst_null
    //   2827: athrow
    //   2828: aconst_null
    //   2829: athrow
    //   2830: aconst_null
    //   2831: athrow
    //   2832: aconst_null
    //   2833: athrow
    //   2834: aconst_null
    //   2835: athrow
    //   2836: aconst_null
    //   2837: athrow
    //   2838: aconst_null
    //   2839: athrow
    //   2840: aconst_null
    //   2841: athrow
    //   2842: aconst_null
    //   2843: athrow
    //   2844: aconst_null
    //   2845: athrow
    //   2846: aconst_null
    //   2847: athrow
    //   2848: aconst_null
    //   2849: athrow
    //   2850: aconst_null
    //   2851: athrow
    //   2852: aconst_null
    //   2853: athrow
    //   2854: aconst_null
    //   2855: athrow
    //   2856: aconst_null
    //   2857: athrow
    //   2858: aconst_null
    //   2859: athrow
    //   2860: aconst_null
    //   2861: athrow
    //   2862: aconst_null
    //   2863: athrow
    //   2864: aconst_null
    //   2865: athrow
    //   2866: aconst_null
    //   2867: athrow
    //   2868: aconst_null
    //   2869: athrow
    //   2870: aconst_null
    //   2871: athrow
    //   2872: aconst_null
    //   2873: athrow
    //   2874: aconst_null
    //   2875: athrow
    //   2876: aconst_null
    //   2877: athrow
    //   2878: aconst_null
    //   2879: athrow
    //   2880: aconst_null
    //   2881: athrow
    //   2882: aconst_null
    //   2883: athrow
    //   2884: aconst_null
    //   2885: athrow
    //   2886: aconst_null
    //   2887: athrow
    //   2888: aconst_null
    //   2889: athrow
    //   2890: aconst_null
    //   2891: athrow
    //   2892: aconst_null
    //   2893: athrow
    //   2894: aconst_null
    //   2895: athrow
    //   2896: aconst_null
    //   2897: athrow
    //   2898: pop
    //   2899: goto -> 24
    //   2902: pop
    //   2903: aconst_null
    //   2904: goto -> 2898
    //   2907: dup
    //   2908: ifnull -> 2898
    //   2911: checkcast java/lang/Throwable
    //   2914: athrow
    //   2915: dup
    //   2916: ifnull -> 2902
    //   2919: checkcast java/lang/Throwable
    //   2922: athrow
    //   2923: aconst_null
    //   2924: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2217	338	1	text	Lnet/minecraft/util/text/TextComponentString;
    //   24	2796	0	this	Lbigname/zprestige/webhack/features/modules/Module;
    // Exception table:
    //   from	to	target	type
    //   8	20	2907	finally
    //   539	546	546	finally
    //   539	546	546	finally
    //   539	546	539	finally
    //   539	546	3	finally
    //   540	546	539	java/lang/AssertionError
    //   743	750	750	finally
    //   743	750	743	finally
    //   744	750	3	finally
    //   744	750	750	finally
    //   744	750	743	finally
    //   815	822	822	finally
    //   815	822	3	finally
    //   815	822	822	finally
    //   816	822	815	java/lang/NegativeArraySizeException
    //   816	822	822	java/lang/IllegalStateException
    //   887	894	894	finally
    //   887	894	3	java/lang/RuntimeException
    //   887	894	3	finally
    //   888	894	894	finally
    //   888	894	887	finally
    //   1023	1030	1030	finally
    //   1023	1030	3	finally
    //   1024	1030	3	finally
    //   1024	1030	1030	java/lang/IllegalArgumentException
    //   1024	1030	1023	finally
    //   1099	1106	1106	finally
    //   1099	1106	1099	java/lang/EnumConstantNotPresentException
    //   1099	1106	1099	finally
    //   1100	1106	1099	finally
    //   1100	1106	1106	java/lang/ClassCastException
    //   1231	1238	1238	finally
    //   1231	1238	1238	finally
    //   1231	1238	3	finally
    //   1232	1238	1231	java/lang/ClassCastException
    //   1232	1238	1238	finally
    //   1367	1374	1374	finally
    //   1367	1374	1374	java/lang/UnsupportedOperationException
    //   1367	1374	3	java/lang/NullPointerException
    //   1368	1374	1367	java/lang/EnumConstantNotPresentException
    //   1368	1374	1367	finally
    //   1439	1446	1446	finally
    //   1439	1446	3	java/lang/NegativeArraySizeException
    //   1439	1446	1439	java/lang/IllegalStateException
    //   1439	1446	1439	finally
    //   1440	1446	3	java/lang/AssertionError
    //   1516	1522	1522	finally
    //   1516	1522	3	java/lang/IndexOutOfBoundsException
    //   1516	1522	3	java/lang/StringIndexOutOfBoundsException
    //   1516	1522	3	java/lang/ArithmeticException
    //   1516	1522	3	java/lang/IllegalStateException
    //   1651	1658	1658	finally
    //   1651	1658	1651	java/lang/StringIndexOutOfBoundsException
    //   1651	1658	3	finally
    //   1651	1658	1651	finally
    //   1651	1658	3	java/lang/StringIndexOutOfBoundsException
    //   1783	1790	1790	finally
    //   1783	1790	1790	java/lang/ArithmeticException
    //   1783	1790	1790	finally
    //   1783	1790	3	java/lang/ArithmeticException
    //   1784	1790	1783	java/lang/AssertionError
    //   1856	1862	1862	finally
    //   1856	1862	3	finally
    //   1856	1862	3	java/lang/EnumConstantNotPresentException
    //   1856	1862	3	finally
    //   1856	1862	1862	java/lang/UnsupportedOperationException
    //   1931	1938	1938	finally
    //   1931	1938	1931	java/lang/RuntimeException
    //   1931	1938	1938	finally
    //   1932	1938	3	finally
    //   1932	1938	3	finally
    //   2003	2010	2010	finally
    //   2003	2010	2010	java/lang/IllegalStateException
    //   2004	2010	2003	java/lang/EnumConstantNotPresentException
    //   2004	2010	3	finally
    //   2004	2010	2003	java/lang/RuntimeException
    //   2075	2082	2082	finally
    //   2075	2082	2075	finally
    //   2075	2082	2075	java/lang/ArrayIndexOutOfBoundsException
    //   2075	2082	2082	java/lang/ArithmeticException
    //   2076	2082	2075	finally
    //   2147	2154	2154	finally
    //   2147	2154	2154	java/lang/ArithmeticException
    //   2147	2154	3	finally
    //   2147	2154	2154	finally
    //   2148	2154	2147	java/lang/AssertionError
    //   2408	2414	2414	finally
    //   2408	2414	2414	java/lang/RuntimeException
    //   2408	2414	2414	java/util/ConcurrentModificationException
    //   2408	2414	2414	java/lang/RuntimeException
    //   2408	2414	2414	java/lang/RuntimeException
    //   2547	2554	2554	finally
    //   2547	2554	2554	java/lang/NumberFormatException
    //   2547	2554	2547	java/lang/UnsupportedOperationException
    //   2548	2554	3	finally
    //   2548	2554	3	finally
    //   2679	2686	2686	finally
    //   2679	2686	3	finally
    //   2680	2686	3	finally
    //   2680	2686	2686	java/lang/ClassCastException
    //   2680	2686	2679	java/lang/UnsupportedOperationException
    //   2811	2818	2818	finally
    //   2811	2818	2818	java/lang/ClassCastException
    //   2811	2818	2811	finally
    //   2811	2818	3	finally
    //   2812	2818	2818	finally
    //   2907	2915	2907	java/lang/ClassCastException
    //   2923	2925	3	finally
  }
  
  public void onUpdate() {
    Perry1.3J(this, (int)1018169273L ^ 0x7B9EB6BD);
  }
  
  public String getInfo() {
    return Perry1.p(this, (int)-1002331392L ^ 0x84FE72E8);
  }
  
  public boolean listening() {
    return Perry1.4C(this, (int)-590436286L ^ 0xA306DEF6);
  }
  
  public void onUnload() {
    Perry1.3R(this, (int)1873170976L ^ 0x7F7F9BFB);
  }
  
  public void onLogout() {
    Perry1.3r(this, (int)-874595859L ^ 0xE6E73CF7);
  }
  
  public Bind getBind() {
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
  
  public String getFullArrayString() {
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
  
  public String getDescription() {
    return Perry1.g(this, (int)938411892L ^ 0x6FB42CDC);
  }
  
  public void setDisplayName(String name) {
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
  
  public boolean isSliding() {
    return Perry1.4w(this, (int)60925532L ^ 0xF56CE56);
  }
  
  public String getDisplayName() {
    return Perry1.n(this, (int)312263463L ^ 0x33C89E0);
  }
  
  public Module$Category getCategory() {
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
  
  public void onLogin() {
    Perry1.3K(this, (int)-1055871929L ^ 0xB2167794);
  }
  
  public void onLoad() {
    Perry1.4f(this, (int)340364453L ^ 0x53115CBC);
  }
  
  public boolean isOn() {
    return Perry1.4q(this, (int)1212260170L ^ 0x66A3984F);
  }
  
  public Module(String name, String description, Module$Category category, boolean hasListener, boolean hidden, boolean alwaysListening) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w 1324435726
    //   9: l2i
    //   10: ldc_w -915813308
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 221258981
    //   20: l2i
    //   21: ldc_w -260959299
    //   24: ixor
    //   25: ldc2_w -718150762
    //   28: l2i
    //   29: ldc_w -1248937530
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -416817382 -> 3248, 1961438477 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.0 : I
    //   64: ifle -> 78
    //   67: ldc2_w 132472353
    //   70: l2i
    //   71: ldc_w 1541384768
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -919509957
    //   81: l2i
    //   82: ldc_w -1617292102
    //   85: ixor
    //   86: ldc2_w 1278515557
    //   89: l2i
    //   90: ldc_w 448965728
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -393406554 -> 78, 181191012 -> 3274
    //   120: aload_1
    //   121: getstatic Perryc.c : I
    //   124: iflt -> 138
    //   127: ldc2_w 1059576837
    //   130: l2i
    //   131: ldc_w -1612251370
    //   134: ixor
    //   135: goto -> 146
    //   138: ldc2_w 17915123
    //   141: l2i
    //   142: ldc_w -1734071001
    //   145: ixor
    //   146: ldc2_w 52761265
    //   149: l2i
    //   150: ldc_w -1976188178
    //   153: ixor
    //   154: ixor
    //   155: lookupswitch default -> 3300, 279290251 -> 180, 701625164 -> 138
    //   180: invokespecial <init> : (Ljava/lang/String;)V
    //   183: getstatic Perryc.c : I
    //   186: iflt -> 200
    //   189: ldc2_w 2028267044
    //   192: l2i
    //   193: ldc_w 304862300
    //   196: ixor
    //   197: goto -> 208
    //   200: ldc2_w -1024888140
    //   203: l2i
    //   204: ldc_w 1116063718
    //   207: ixor
    //   208: ldc2_w -722064859
    //   211: l2i
    //   212: ldc_w -291631637
    //   215: ixor
    //   216: ixor
    //   217: lookupswitch default -> 244, -589217608 -> 200, 1353127350 -> 3220
    //   244: aload_0
    //   245: getstatic Perryc.c : I
    //   248: iflt -> 262
    //   251: ldc2_w 86402068
    //   254: l2i
    //   255: ldc_w 1022957865
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w 646682537
    //   265: l2i
    //   266: ldc_w 1349840728
    //   269: ixor
    //   270: ldc2_w -1669019374
    //   273: l2i
    //   274: ldc_w 556670
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 304, -1521235375 -> 3278, 567192689 -> 262
    //   304: aload_0
    //   305: new bigname/zprestige/webhack/features/setting/Setting
    //   308: dup
    //   309: ldc_w '홼㌝혺㶵旒㣠๽'
    //   312: getstatic Perryc.c : I
    //   315: iflt -> 329
    //   318: ldc2_w 961568126
    //   321: l2i
    //   322: ldc_w 18981664
    //   325: ixor
    //   326: goto -> 337
    //   329: ldc2_w -1315356810
    //   332: l2i
    //   333: ldc_w -1346446968
    //   336: ixor
    //   337: ldc2_w -852626491
    //   340: l2i
    //   341: ldc_w -1452266116
    //   344: ixor
    //   345: ixor
    //   346: lookupswitch default -> 3270, 1546395879 -> 329, 2054830151 -> 372
    //   372: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   375: ldc2_w 1036836285
    //   378: l2i
    //   379: ldc_w 1036836285
    //   382: ixor
    //   383: getstatic Perryc.1 : I
    //   386: ifeq -> 400
    //   389: ldc2_w 696913617
    //   392: l2i
    //   393: ldc_w -1887985343
    //   396: ixor
    //   397: goto -> 408
    //   400: ldc2_w 1378257967
    //   403: l2i
    //   404: ldc_w -1320685740
    //   407: ixor
    //   408: ldc2_w 2020452712
    //   411: l2i
    //   412: ldc_w 545984248
    //   415: ixor
    //   416: ixor
    //   417: lookupswitch default -> 444, -31782912 -> 3294, 1539838222 -> 400
    //   444: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   447: getstatic Perryc.0 : I
    //   450: ifle -> 464
    //   453: ldc2_w -1731946333
    //   456: l2i
    //   457: ldc_w -679915652
    //   460: ixor
    //   461: goto -> 472
    //   464: ldc2_w 934253539
    //   467: l2i
    //   468: ldc_w -2047296060
    //   471: ixor
    //   472: ldc2_w 1242851017
    //   475: l2i
    //   476: ldc_w -318065817
    //   479: ixor
    //   480: ixor
    //   481: lookupswitch default -> 508, -391970191 -> 3240, -340446076 -> 464
    //   508: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   511: getstatic Perryc.0 : I
    //   514: ifle -> 528
    //   517: ldc2_w -785654635
    //   520: l2i
    //   521: ldc_w 1979254391
    //   524: ixor
    //   525: goto -> 536
    //   528: ldc2_w 1873807109
    //   531: l2i
    //   532: ldc_w 2112892514
    //   535: ixor
    //   536: ldc2_w 547097163
    //   539: l2i
    //   540: ldc_w -1135735248
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 3246, -1903022820 -> 572, 939581081 -> 528
    //   572: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   575: getstatic Perryc.1 : I
    //   578: ifeq -> 592
    //   581: ldc2_w -1467197481
    //   584: l2i
    //   585: ldc_w -71756924
    //   588: ixor
    //   589: goto -> 600
    //   592: ldc2_w -1067329576
    //   595: l2i
    //   596: ldc_w -1833447091
    //   599: ixor
    //   600: ldc2_w -1098798056
    //   603: l2i
    //   604: ldc_w -2050565683
    //   607: ixor
    //   608: ixor
    //   609: lookupswitch default -> 3296, 1752314246 -> 592, 1771139904 -> 636
    //   636: putfield enabled : Lbigname/zprestige/webhack/features/setting/Setting;
    //   639: getstatic Perryc.0 : I
    //   642: ifle -> 656
    //   645: ldc2_w 1668682315
    //   648: l2i
    //   649: ldc_w 1105439865
    //   652: ixor
    //   653: goto -> 664
    //   656: ldc2_w 1219568430
    //   659: l2i
    //   660: ldc_w -2093339471
    //   663: ixor
    //   664: ldc2_w 2126758566
    //   667: l2i
    //   668: ldc_w -114549205
    //   671: ixor
    //   672: ixor
    //   673: lookupswitch default -> 700, -1518705985 -> 3304, 591463084 -> 656
    //   700: aload_0
    //   701: getstatic Perryc.0 : I
    //   704: ifle -> 718
    //   707: ldc2_w -2082890394
    //   710: l2i
    //   711: ldc_w 1852454558
    //   714: ixor
    //   715: goto -> 726
    //   718: ldc2_w 855994610
    //   721: l2i
    //   722: ldc_w -233264390
    //   725: ixor
    //   726: ldc2_w 1821917059
    //   729: l2i
    //   730: ldc_w -770577589
    //   733: ixor
    //   734: ixor
    //   735: lookupswitch default -> 760, 237617692 -> 718, 1396342576 -> 3256
    //   760: aload_0
    //   761: new bigname/zprestige/webhack/features/setting/Setting
    //   764: dup
    //   765: ldc_w '홽㌁혺㶠旐'
    //   768: getstatic Perryc.1 : I
    //   771: ifeq -> 785
    //   774: ldc2_w 1930232216
    //   777: l2i
    //   778: ldc_w 1648089415
    //   781: ixor
    //   782: goto -> 793
    //   785: ldc2_w -1331955280
    //   788: l2i
    //   789: ldc_w 309314725
    //   792: ixor
    //   793: ldc2_w -2085666550
    //   796: l2i
    //   797: ldc_w -1352995447
    //   800: ixor
    //   801: ixor
    //   802: lookupswitch default -> 828, 1036219484 -> 3244, 1377700168 -> 785
    //   828: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   831: ldc2_w 1390671816
    //   834: l2i
    //   835: ldc_w 1390671817
    //   838: ixor
    //   839: getstatic Perryc.1 : I
    //   842: ifeq -> 856
    //   845: ldc2_w 1258255250
    //   848: l2i
    //   849: ldc_w -1604664061
    //   852: ixor
    //   853: goto -> 864
    //   856: ldc2_w -142406064
    //   859: l2i
    //   860: ldc_w 960471218
    //   863: ixor
    //   864: ldc2_w 1661058244
    //   867: l2i
    //   868: ldc_w 134231994
    //   871: ixor
    //   872: ixor
    //   873: lookupswitch default -> 3286, -2119942673 -> 856, -1514330724 -> 900
    //   900: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   903: getstatic Perryc.0 : I
    //   906: ifle -> 920
    //   909: ldc2_w -336734191
    //   912: l2i
    //   913: ldc_w -905839789
    //   916: ixor
    //   917: goto -> 928
    //   920: ldc2_w -1765796663
    //   923: l2i
    //   924: ldc_w -685637924
    //   927: ixor
    //   928: ldc2_w 1971095993
    //   931: l2i
    //   932: ldc_w -5720996
    //   935: ixor
    //   936: ixor
    //   937: lookupswitch default -> 964, -2039561787 -> 920, -1422385497 -> 3266
    //   964: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   967: getstatic Perryc.1 : I
    //   970: ifeq -> 984
    //   973: ldc2_w -681144447
    //   976: l2i
    //   977: ldc_w 1870012707
    //   980: ixor
    //   981: goto -> 992
    //   984: ldc2_w 75345108
    //   987: l2i
    //   988: ldc_w -589542583
    //   991: ixor
    //   992: ldc2_w -1899493168
    //   995: l2i
    //   996: ldc_w -842191719
    //   999: ixor
    //   1000: ixor
    //   1001: lookupswitch default -> 1028, -82474261 -> 3290, 17177769 -> 984
    //   1028: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1031: getstatic Perryc.0 : I
    //   1034: ifle -> 1048
    //   1037: ldc2_w 1567215754
    //   1040: l2i
    //   1041: ldc_w -1031383195
    //   1044: ixor
    //   1045: goto -> 1056
    //   1048: ldc2_w 112230093
    //   1051: l2i
    //   1052: ldc_w -937228240
    //   1055: ixor
    //   1056: ldc2_w -2053472571
    //   1059: l2i
    //   1060: ldc_w 1402334919
    //   1063: ixor
    //   1064: ixor
    //   1065: lookupswitch default -> 1092, 1239422957 -> 3216, 1389206845 -> 1048
    //   1092: putfield drawn : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1095: getstatic Perryc.c : I
    //   1098: iflt -> 1112
    //   1101: ldc2_w 1923156305
    //   1104: l2i
    //   1105: ldc_w 558287897
    //   1108: ixor
    //   1109: goto -> 1120
    //   1112: ldc2_w -411832441
    //   1115: l2i
    //   1116: ldc_w -1593874178
    //   1119: ixor
    //   1120: ldc2_w -1580541752
    //   1123: l2i
    //   1124: ldc_w -1156985178
    //   1127: ixor
    //   1128: ixor
    //   1129: lookupswitch default -> 1156, 261199856 -> 1112, 1227150118 -> 3222
    //   1156: aload_0
    //   1157: getstatic Perryc.c : I
    //   1160: iflt -> 1174
    //   1163: ldc2_w -884380599
    //   1166: l2i
    //   1167: ldc_w -737535856
    //   1170: ixor
    //   1171: goto -> 1182
    //   1174: ldc2_w 1770228326
    //   1177: l2i
    //   1178: ldc_w -1800880656
    //   1181: ixor
    //   1182: ldc2_w -818049576
    //   1185: l2i
    //   1186: ldc_w 1884114523
    //   1189: ixor
    //   1190: ixor
    //   1191: lookupswitch default -> 1216, -1607223462 -> 3226, 1762767256 -> 1174
    //   1216: aload_0
    //   1217: new bigname/zprestige/webhack/features/setting/Setting
    //   1220: dup
    //   1221: ldc_w '홲㌖혢㶵旗㣫๽'
    //   1224: getstatic Perryc.0 : I
    //   1227: ifle -> 1241
    //   1230: ldc2_w -513047275
    //   1233: l2i
    //   1234: ldc_w 270348306
    //   1237: ixor
    //   1238: goto -> 1249
    //   1241: ldc2_w 1686771605
    //   1244: l2i
    //   1245: ldc_w -1420950408
    //   1248: ixor
    //   1249: ldc2_w -1895398805
    //   1252: l2i
    //   1253: ldc_w -1961869683
    //   1256: ixor
    //   1257: ixor
    //   1258: lookupswitch default -> 1284, -2101869779 -> 1241, -178255391 -> 3284
    //   1284: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1287: new bigname/zprestige/webhack/features/setting/Bind
    //   1290: dup
    //   1291: ldc2_w -1756829210
    //   1294: l2i
    //   1295: ldc_w 1756829209
    //   1298: ixor
    //   1299: getstatic Perryc.1 : I
    //   1302: ifeq -> 1316
    //   1305: ldc2_w 344207074
    //   1308: l2i
    //   1309: ldc_w -1630163581
    //   1312: ixor
    //   1313: goto -> 1324
    //   1316: ldc2_w -357193060
    //   1319: l2i
    //   1320: ldc_w -1850630761
    //   1323: ixor
    //   1324: ldc2_w 1809653463
    //   1327: l2i
    //   1328: ldc_w 989153137
    //   1331: ixor
    //   1332: ixor
    //   1333: lookupswitch default -> 1360, -612771129 -> 3252, 1586550306 -> 1316
    //   1360: invokespecial <init> : (I)V
    //   1363: getstatic Perryc.0 : I
    //   1366: ifle -> 1380
    //   1369: ldc2_w 520116970
    //   1372: l2i
    //   1373: ldc_w -816281114
    //   1376: ixor
    //   1377: goto -> 1388
    //   1380: ldc2_w 2128402683
    //   1383: l2i
    //   1384: ldc_w -2040382986
    //   1387: ixor
    //   1388: ldc2_w -1347522882
    //   1391: l2i
    //   1392: ldc_w -872355582
    //   1395: ixor
    //   1396: ixor
    //   1397: lookupswitch default -> 3288, -1693423951 -> 1424, -1275702096 -> 1380
    //   1424: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1427: getstatic Perryc.1 : I
    //   1430: ifeq -> 1444
    //   1433: ldc2_w 905609267
    //   1436: l2i
    //   1437: ldc_w 1287427637
    //   1440: ixor
    //   1441: goto -> 1452
    //   1444: ldc2_w -985961273
    //   1447: l2i
    //   1448: ldc_w -507258758
    //   1451: ixor
    //   1452: ldc2_w -246043215
    //   1455: l2i
    //   1456: ldc_w 1147004665
    //   1459: ixor
    //   1460: ixor
    //   1461: lookupswitch default -> 3218, -1846476811 -> 1488, -867279538 -> 1444
    //   1488: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1491: getstatic Perryc.c : I
    //   1494: iflt -> 1508
    //   1497: ldc2_w -1462104233
    //   1500: l2i
    //   1501: ldc_w -250618788
    //   1504: ixor
    //   1505: goto -> 1516
    //   1508: ldc2_w 348506225
    //   1511: l2i
    //   1512: ldc_w 1093262284
    //   1515: ixor
    //   1516: ldc2_w -1446989509
    //   1519: l2i
    //   1520: ldc_w 74717152
    //   1523: ixor
    //   1524: ixor
    //   1525: lookupswitch default -> 1552, -194939440 -> 3298, 1114177751 -> 1508
    //   1552: putfield bind : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1555: getstatic Perryc.1 : I
    //   1558: ifeq -> 1572
    //   1561: ldc2_w 57221144
    //   1564: l2i
    //   1565: ldc_w 796650982
    //   1568: ixor
    //   1569: goto -> 1580
    //   1572: ldc2_w -1825036232
    //   1575: l2i
    //   1576: ldc_w -221616203
    //   1579: ixor
    //   1580: ldc2_w -576722940
    //   1583: l2i
    //   1584: ldc_w 1758012406
    //   1587: ixor
    //   1588: ixor
    //   1589: lookupswitch default -> 1616, -1723595252 -> 3212, -1471478763 -> 1572
    //   1616: aload_0
    //   1617: ldc_w 2.370796E38
    //   1620: invokestatic floatToIntBits : (F)I
    //   1623: ldc_w 2134006751
    //   1626: ixor
    //   1627: invokestatic intBitsToFloat : (I)F
    //   1630: getstatic Perryc.0 : I
    //   1633: ifle -> 1647
    //   1636: ldc2_w 1433918410
    //   1639: l2i
    //   1640: ldc_w -904628801
    //   1643: ixor
    //   1644: goto -> 1655
    //   1647: ldc2_w 1427698427
    //   1650: l2i
    //   1651: ldc_w 1448165886
    //   1654: ixor
    //   1655: ldc2_w -2114092221
    //   1658: l2i
    //   1659: ldc_w -923637949
    //   1662: ixor
    //   1663: ixor
    //   1664: lookupswitch default -> 3308, -697546123 -> 1647, 1246123781 -> 1692
    //   1692: putfield arrayListOffset : F
    //   1695: getstatic Perryc.c : I
    //   1698: iflt -> 1712
    //   1701: ldc2_w -1657966012
    //   1704: l2i
    //   1705: ldc_w -602951223
    //   1708: ixor
    //   1709: goto -> 1720
    //   1712: ldc2_w 1994759754
    //   1715: l2i
    //   1716: ldc_w 929817812
    //   1719: ixor
    //   1720: ldc2_w 534827087
    //   1723: l2i
    //   1724: ldc_w -247967887
    //   1727: ixor
    //   1728: ixor
    //   1729: lookupswitch default -> 1756, -1952520112 -> 1712, -1342546765 -> 3232
    //   1756: aload_0
    //   1757: ldc_w 1.7342878E36
    //   1760: invokestatic floatToIntBits : (F)I
    //   1763: ldc_w 2074542463
    //   1766: ixor
    //   1767: invokestatic intBitsToFloat : (I)F
    //   1770: getstatic Perryc.0 : I
    //   1773: ifle -> 1787
    //   1776: ldc2_w 869890858
    //   1779: l2i
    //   1780: ldc_w 708300909
    //   1783: ixor
    //   1784: goto -> 1795
    //   1787: ldc2_w -921698813
    //   1790: l2i
    //   1791: ldc_w -1868861119
    //   1794: ixor
    //   1795: ldc2_w -2054812614
    //   1798: l2i
    //   1799: ldc_w 1717167679
    //   1802: ixor
    //   1803: ixor
    //   1804: lookupswitch default -> 3310, -1169463993 -> 1832, -97435326 -> 1787
    //   1832: putfield arrayListVOffset : F
    //   1835: getstatic Perryc.1 : I
    //   1838: ifeq -> 1852
    //   1841: ldc2_w 248848523
    //   1844: l2i
    //   1845: ldc_w -794234538
    //   1848: ixor
    //   1849: goto -> 1860
    //   1852: ldc2_w 1684569976
    //   1855: l2i
    //   1856: ldc_w 1413193682
    //   1859: ixor
    //   1860: ldc2_w -511533209
    //   1863: l2i
    //   1864: ldc_w -286608497
    //   1867: ixor
    //   1868: ixor
    //   1869: lookupswitch default -> 1896, -787088075 -> 3224, -527180296 -> 1852
    //   1896: aload_0
    //   1897: getstatic Perryc.c : I
    //   1900: iflt -> 1914
    //   1903: ldc2_w 672034222
    //   1906: l2i
    //   1907: ldc_w -991114106
    //   1910: ixor
    //   1911: goto -> 1922
    //   1914: ldc2_w 719575571
    //   1917: l2i
    //   1918: ldc_w 1589888121
    //   1921: ixor
    //   1922: ldc2_w -388861405
    //   1925: l2i
    //   1926: ldc_w -258887480
    //   1929: ixor
    //   1930: ixor
    //   1931: lookupswitch default -> 3268, -190749757 -> 1914, 1818483841 -> 1956
    //   1956: aload_0
    //   1957: new bigname/zprestige/webhack/features/setting/Setting
    //   1960: dup
    //   1961: ldc_w '홽㌚혨㶧旒㣤๠ꯒ蹢㤭溇'
    //   1964: getstatic Perryc.c : I
    //   1967: iflt -> 1981
    //   1970: ldc2_w -1167405238
    //   1973: l2i
    //   1974: ldc_w 1589749065
    //   1977: ixor
    //   1978: goto -> 1989
    //   1981: ldc2_w -1934518874
    //   1984: l2i
    //   1985: ldc_w 1216090093
    //   1988: ixor
    //   1989: ldc2_w 499697862
    //   1992: l2i
    //   1993: ldc_w -1535718988
    //   1996: ixor
    //   1997: ixor
    //   1998: lookupswitch default -> 2024, 1561684849 -> 3282, 1948256883 -> 1981
    //   2024: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2027: getstatic Perryc.0 : I
    //   2030: ifle -> 2044
    //   2033: ldc2_w -1896392649
    //   2036: l2i
    //   2037: ldc_w 1522989070
    //   2040: ixor
    //   2041: goto -> 2052
    //   2044: ldc2_w 898845155
    //   2047: l2i
    //   2048: ldc_w 29570808
    //   2051: ixor
    //   2052: ldc2_w -1150208085
    //   2055: l2i
    //   2056: ldc_w -1987108034
    //   2059: ixor
    //   2060: ixor
    //   2061: lookupswitch default -> 3272, -422595412 -> 2044, 112094094 -> 2088
    //   2088: aload_1
    //   2089: getstatic Perryc.1 : I
    //   2092: ifeq -> 2106
    //   2095: ldc2_w -1862881337
    //   2098: l2i
    //   2099: ldc_w -34408563
    //   2102: ixor
    //   2103: goto -> 2114
    //   2106: ldc2_w 1124781323
    //   2109: l2i
    //   2110: ldc_w -1020305539
    //   2113: ixor
    //   2114: ldc2_w 1776058551
    //   2117: l2i
    //   2118: ldc_w -2098820356
    //   2121: ixor
    //   2122: ixor
    //   2123: lookupswitch default -> 3230, -2042736127 -> 2106, 1797232701 -> 2148
    //   2148: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2151: getstatic Perryc.1 : I
    //   2154: ifeq -> 2168
    //   2157: ldc2_w 1899095208
    //   2160: l2i
    //   2161: ldc_w -329675887
    //   2164: ixor
    //   2165: goto -> 2176
    //   2168: ldc2_w 1811499700
    //   2171: l2i
    //   2172: ldc_w 1105304970
    //   2175: ixor
    //   2176: ldc2_w -742896311
    //   2179: l2i
    //   2180: ldc_w 1951662627
    //   2183: ixor
    //   2184: ixor
    //   2185: lookupswitch default -> 3280, -1913350060 -> 2212, 981737555 -> 2168
    //   2212: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2215: getstatic Perryc.1 : I
    //   2218: ifeq -> 2232
    //   2221: ldc2_w 1609535533
    //   2224: l2i
    //   2225: ldc_w 1652189431
    //   2228: ixor
    //   2229: goto -> 2240
    //   2232: ldc2_w -1776997576
    //   2235: l2i
    //   2236: ldc_w -1397264844
    //   2239: ixor
    //   2240: ldc2_w -547907999
    //   2243: l2i
    //   2244: ldc_w 2038147103
    //   2247: ixor
    //   2248: ixor
    //   2249: lookupswitch default -> 2276, -1682323804 -> 3262, -425520855 -> 2232
    //   2276: putfield displayName : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2279: getstatic Perryc.1 : I
    //   2282: ifeq -> 2296
    //   2285: ldc2_w -1478603144
    //   2288: l2i
    //   2289: ldc_w -573615959
    //   2292: ixor
    //   2293: goto -> 2304
    //   2296: ldc2_w 267735988
    //   2299: l2i
    //   2300: ldc_w -1195264145
    //   2303: ixor
    //   2304: ldc2_w -357545285
    //   2307: l2i
    //   2308: ldc_w 1690719996
    //   2311: ixor
    //   2312: ixor
    //   2313: lookupswitch default -> 2340, -717053530 -> 2296, -194575722 -> 3292
    //   2340: aload_0
    //   2341: getstatic Perryc.0 : I
    //   2344: ifle -> 2358
    //   2347: ldc2_w 1888857193
    //   2350: l2i
    //   2351: ldc_w -353802626
    //   2354: ixor
    //   2355: goto -> 2366
    //   2358: ldc2_w 197481554
    //   2361: l2i
    //   2362: ldc_w -1308209065
    //   2365: ixor
    //   2366: ldc2_w -471666789
    //   2369: l2i
    //   2370: ldc_w -1191073803
    //   2373: ixor
    //   2374: ixor
    //   2375: lookupswitch default -> 3236, -1063288199 -> 2358, -484422549 -> 2400
    //   2400: aload_2
    //   2401: getstatic Perryc.1 : I
    //   2404: ifeq -> 2418
    //   2407: ldc2_w 266016676
    //   2410: l2i
    //   2411: ldc_w -569976604
    //   2414: ixor
    //   2415: goto -> 2426
    //   2418: ldc2_w 449443507
    //   2421: l2i
    //   2422: ldc_w 186322479
    //   2425: ixor
    //   2426: ldc2_w -268334327
    //   2429: l2i
    //   2430: ldc_w -898896425
    //   2433: ixor
    //   2434: ixor
    //   2435: lookupswitch default -> 2460, -340285026 -> 3234, -156125987 -> 2418
    //   2460: putfield description : Ljava/lang/String;
    //   2463: getstatic Perryc.c : I
    //   2466: iflt -> 2480
    //   2469: ldc2_w 1328528856
    //   2472: l2i
    //   2473: ldc_w 1352191419
    //   2476: ixor
    //   2477: goto -> 2488
    //   2480: ldc2_w 1257058902
    //   2483: l2i
    //   2484: ldc_w 1461118909
    //   2487: ixor
    //   2488: ldc2_w -1220800102
    //   2491: l2i
    //   2492: ldc_w 1956439921
    //   2495: ixor
    //   2496: ixor
    //   2497: lookupswitch default -> 2524, -602438008 -> 3250, 275415638 -> 2480
    //   2524: aload_0
    //   2525: getstatic Perryc.0 : I
    //   2528: ifle -> 2542
    //   2531: ldc2_w 1330170847
    //   2534: l2i
    //   2535: ldc_w -2129344821
    //   2538: ixor
    //   2539: goto -> 2550
    //   2542: ldc2_w 1274080563
    //   2545: l2i
    //   2546: ldc_w 1809393409
    //   2549: ixor
    //   2550: ldc2_w -153480117
    //   2553: l2i
    //   2554: ldc_w -1072061831
    //   2557: ixor
    //   2558: ixor
    //   2559: lookupswitch default -> 3302, -123749594 -> 2542, 384465920 -> 2584
    //   2584: aload_3
    //   2585: getstatic Perryc.1 : I
    //   2588: ifeq -> 2602
    //   2591: ldc2_w -1507254806
    //   2594: l2i
    //   2595: ldc_w -1205773011
    //   2598: ixor
    //   2599: goto -> 2610
    //   2602: ldc2_w -1062569066
    //   2605: l2i
    //   2606: ldc_w -1399009398
    //   2609: ixor
    //   2610: ldc2_w 2089381315
    //   2613: l2i
    //   2614: ldc_w 472757318
    //   2617: ixor
    //   2618: ixor
    //   2619: lookupswitch default -> 2644, 803728493 -> 2602, 2125240642 -> 3214
    //   2644: putfield category : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   2647: getstatic Perryc.c : I
    //   2650: iflt -> 2664
    //   2653: ldc2_w 1385734216
    //   2656: l2i
    //   2657: ldc_w -43433788
    //   2660: ixor
    //   2661: goto -> 2672
    //   2664: ldc2_w -1838167907
    //   2667: l2i
    //   2668: ldc_w -1280705562
    //   2671: ixor
    //   2672: ldc2_w -1204431692
    //   2675: l2i
    //   2676: ldc_w 1115312332
    //   2679: ixor
    //   2680: ixor
    //   2681: lookupswitch default -> 3258, -611731709 -> 2708, 1438541044 -> 2664
    //   2708: aload_0
    //   2709: getstatic Perryc.1 : I
    //   2712: ifeq -> 2726
    //   2715: ldc2_w -2091560603
    //   2718: l2i
    //   2719: ldc_w 1247920577
    //   2722: ixor
    //   2723: goto -> 2734
    //   2726: ldc2_w 753586705
    //   2729: l2i
    //   2730: ldc_w 1645983695
    //   2733: ixor
    //   2734: ldc2_w 1447698191
    //   2737: l2i
    //   2738: ldc_w 1102354922
    //   2741: ixor
    //   2742: ixor
    //   2743: lookupswitch default -> 2768, -557181375 -> 3228, -417569911 -> 2726
    //   2768: iload #4
    //   2770: getstatic Perryc.0 : I
    //   2773: ifle -> 2787
    //   2776: ldc2_w 1444119043
    //   2779: l2i
    //   2780: ldc_w 1692959828
    //   2783: ixor
    //   2784: goto -> 2795
    //   2787: ldc2_w 1679253141
    //   2790: l2i
    //   2791: ldc_w 1879437077
    //   2794: ixor
    //   2795: ldc2_w 1453886289
    //   2798: l2i
    //   2799: ldc_w -217077111
    //   2802: ixor
    //   2803: ixor
    //   2804: lookupswitch default -> 2832, -1755568241 -> 3238, -1324062095 -> 2787
    //   2832: putfield hasListener : Z
    //   2835: getstatic Perryc.c : I
    //   2838: iflt -> 2852
    //   2841: ldc2_w 1551692795
    //   2844: l2i
    //   2845: ldc_w -1243747756
    //   2848: ixor
    //   2849: goto -> 2860
    //   2852: ldc2_w 866216140
    //   2855: l2i
    //   2856: ldc_w -546575808
    //   2859: ixor
    //   2860: ldc2_w -692068778
    //   2863: l2i
    //   2864: ldc_w 327223760
    //   2867: ixor
    //   2868: ixor
    //   2869: lookupswitch default -> 2896, -258211245 -> 2852, 748670505 -> 3306
    //   2896: aload_0
    //   2897: getstatic Perryc.0 : I
    //   2900: ifle -> 2914
    //   2903: ldc2_w 1086507408
    //   2906: l2i
    //   2907: ldc_w -474517259
    //   2910: ixor
    //   2911: goto -> 2922
    //   2914: ldc2_w 1007497917
    //   2917: l2i
    //   2918: ldc_w -969428690
    //   2921: ixor
    //   2922: ldc2_w -1287060044
    //   2925: l2i
    //   2926: ldc_w -1733278322
    //   2929: ixor
    //   2930: ixor
    //   2931: lookupswitch default -> 3254, -2004027041 -> 2914, -775699543 -> 2956
    //   2956: iload #5
    //   2958: getstatic Perryc.1 : I
    //   2961: ifeq -> 2975
    //   2964: ldc2_w -2112108926
    //   2967: l2i
    //   2968: ldc_w -504729585
    //   2971: ixor
    //   2972: goto -> 2983
    //   2975: ldc2_w 361086336
    //   2978: l2i
    //   2979: ldc_w -521076875
    //   2982: ixor
    //   2983: ldc2_w 253364776
    //   2986: l2i
    //   2987: ldc_w 2055872761
    //   2990: ixor
    //   2991: ixor
    //   2992: lookupswitch default -> 3242, -2132449244 -> 3020, 375495772 -> 2975
    //   3020: putfield hidden : Z
    //   3023: getstatic Perryc.0 : I
    //   3026: ifle -> 3040
    //   3029: ldc2_w -1690664594
    //   3032: l2i
    //   3033: ldc_w 974932674
    //   3036: ixor
    //   3037: goto -> 3048
    //   3040: ldc2_w -1331714770
    //   3043: l2i
    //   3044: ldc_w 897295411
    //   3047: ixor
    //   3048: ldc2_w -1923236436
    //   3051: l2i
    //   3052: ldc_w -1972847616
    //   3055: ixor
    //   3056: ixor
    //   3057: lookupswitch default -> 3084, -1508652544 -> 3260, 455521077 -> 3040
    //   3084: aload_0
    //   3085: getstatic Perryc.1 : I
    //   3088: ifeq -> 3102
    //   3091: ldc2_w 2078958711
    //   3094: l2i
    //   3095: ldc_w 351707040
    //   3098: ixor
    //   3099: goto -> 3110
    //   3102: ldc2_w 735118953
    //   3105: l2i
    //   3106: ldc_w -1758062227
    //   3109: ixor
    //   3110: ldc2_w 324702115
    //   3113: l2i
    //   3114: ldc_w 1014554059
    //   3117: ixor
    //   3118: ixor
    //   3119: lookupswitch default -> 3144, -1988212922 -> 3102, 1077848511 -> 3264
    //   3144: iload #6
    //   3146: getstatic Perryc.1 : I
    //   3149: ifeq -> 3163
    //   3152: ldc2_w -1849068842
    //   3155: l2i
    //   3156: ldc_w -621615838
    //   3159: ixor
    //   3160: goto -> 3171
    //   3163: ldc2_w 696867541
    //   3166: l2i
    //   3167: ldc_w 742863098
    //   3170: ixor
    //   3171: ldc2_w -266653330
    //   3174: l2i
    //   3175: ldc_w -392680719
    //   3178: ixor
    //   3179: ixor
    //   3180: lookupswitch default -> 3208, -174849223 -> 3163, 1404603499 -> 3276
    //   3208: putfield alwaysListening : Z
    //   3211: return
    //   3212: aconst_null
    //   3213: athrow
    //   3214: aconst_null
    //   3215: athrow
    //   3216: aconst_null
    //   3217: athrow
    //   3218: aconst_null
    //   3219: athrow
    //   3220: aconst_null
    //   3221: athrow
    //   3222: aconst_null
    //   3223: athrow
    //   3224: aconst_null
    //   3225: athrow
    //   3226: aconst_null
    //   3227: athrow
    //   3228: aconst_null
    //   3229: athrow
    //   3230: aconst_null
    //   3231: athrow
    //   3232: aconst_null
    //   3233: athrow
    //   3234: aconst_null
    //   3235: athrow
    //   3236: aconst_null
    //   3237: athrow
    //   3238: aconst_null
    //   3239: athrow
    //   3240: aconst_null
    //   3241: athrow
    //   3242: aconst_null
    //   3243: athrow
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
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	3212	0	this	Lbigname/zprestige/webhack/features/modules/Module;
    //   0	3212	1	name	Ljava/lang/String;
    //   0	3212	2	description	Ljava/lang/String;
    //   0	3212	3	category	Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   0	3212	4	hasListener	Z
    //   0	3212	5	hidden	Z
    //   0	3212	6	alwaysListening	Z
  }
  
  public void onEnable() {
    Perry1.4g(this, (int)1893836689L ^ 0x42E57850);
  }
  
  public void onTick() {
    Perry1.4j(this, (int)587229506L ^ 0x5AA3F10E);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void setDrawn(boolean paramBoolean) {
    Perry1.62(this, (int)-1868286652L ^ 0x821AFA49, paramBoolean);
  }
  
  public void onToggle() {
    Perry1.3D(this, (int)-171957642L ^ 0x93163358);
  }
  
  public void toggle() {
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
  
  public String getDisplayInfo() {
    return Perry1.7(this, (int)-2045561336L ^ 0xA46ECDA9);
  }
  
  public void enable() {
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
  
  public boolean isDrawn() {
    return Perry1.4o(this, (int)-1660624527L ^ 0xBC12B517);
  }
  
  public boolean isOff() {
    return Perry1.4A(this, (int)-569686747L ^ 0xED4B6930);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Module.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */