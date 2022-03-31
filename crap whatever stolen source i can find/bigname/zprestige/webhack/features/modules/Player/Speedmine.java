package bigname.zprestige.webhack.features.modules.Player;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.BlockEvent;
import bigname.zprestige.webhack.event.events.PacketEvent;
import bigname.zprestige.webhack.event.events.Render3DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.util.Timer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Speedmine extends Module {
  public Setting<Boolean> doubleBreak;
  
  public BlockPos currentPos;
  
  public Setting<Boolean> illegal;
  
  public Setting<Integer> cGreen;
  
  public Setting<Boolean> noSwing;
  
  public Setting<Boolean> cRainbow;
  
  public BlockPos lastPos;
  
  public Timer timer;
  
  public Setting<Float> range;
  
  public Setting<Integer> alpha;
  
  public Setting<Boolean> box;
  
  public EnumFacing lastFacing;
  
  public static Speedmine INSTANCE;
  
  public Setting<Integer> cAlpha;
  
  public Setting<Boolean> allow;
  
  public Setting<Boolean> noDelay;
  
  public Setting<Boolean> outline;
  
  public Setting<Boolean> pickaxe;
  
  public Setting<Boolean> noTrace;
  
  public Setting<Integer> boxAlpha;
  
  public Setting<Integer> cBlue;
  
  public Setting<Integer> green;
  
  public Setting<Boolean> render;
  
  public Setting<Boolean> Rainbow;
  
  public Setting<Boolean> noBreakAnim;
  
  public Setting<Speedmine$Mode> mode;
  
  public Setting<Float> lineWidth;
  
  public Setting<Boolean> noGapTrace;
  
  public Setting<Float> damage;
  
  public Setting<Integer> cRed;
  
  public Setting<Boolean> silentSwitch;
  
  public Setting<Boolean> reset;
  
  public Setting<Integer> blue;
  
  public boolean isMining;
  
  public Setting<Boolean> webSwitch;
  
  public Setting<Boolean> tweaks;
  
  public IBlockState currentBlockState;
  
  public Setting<Integer> red;
  
  public boolean lambda$new$10(Integer paramInteger) {
    return Perry1.5k(this, (int)-1353016327L ^ 0x9A10F56C, paramInteger);
  }
  
  public boolean lambda$new$13(Object paramObject) {
    return Perry1.28(this, (int)265316083L ^ 0x69D4DAEC, paramObject);
  }
  
  public boolean lambda$new$7(Integer paramInteger) {
    return Perry1.5h(this, (int)-1404930265L ^ 0xDD8B4399, paramInteger);
  }
  
  public boolean lambda$new$11(Boolean paramBoolean) {
    return Perry1.2r(this, (int)-334470183L ^ 0x89ED9C46, paramBoolean);
  }
  
  public void onTick() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 5445
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 5437
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 5429
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 40
    //   30: ldc2_w 1820680837
    //   33: l2i
    //   34: ldc 1669702187
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 1112220897
    //   43: l2i
    //   44: ldc -2076997576
    //   46: ixor
    //   47: ldc2_w -1775893533
    //   50: l2i
    //   51: ldc -1130121886
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 80, -1804606561 -> 40, 629503535 -> 5390
    //   80: aload_0
    //   81: getstatic Perryc.c : I
    //   84: iflt -> 97
    //   87: ldc2_w -983044259
    //   90: l2i
    //   91: ldc -361964651
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w 1957648068
    //   100: l2i
    //   101: ldc 1305229685
    //   103: ixor
    //   104: ldc2_w 1835816068
    //   107: l2i
    //   108: ldc -1427716142
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, -436573064 -> 97, -394156130 -> 5364
    //   140: getfield currentPos : Lnet/minecraft/util/math/BlockPos;
    //   143: ifnull -> 156
    //   146: ldc2_w 831500947
    //   149: l2i
    //   150: ldc 934004227
    //   152: ixor
    //   153: goto -> 163
    //   156: ldc2_w -521867304
    //   159: l2i
    //   160: ldc -423584949
    //   162: ixor
    //   163: ldc2_w -2002716757
    //   166: l2i
    //   167: ldc 1514770702
    //   169: ixor
    //   170: ixor
    //   171: tableswitch default -> 146, -724757963 -> 192, -724757962 -> 5279
    //   192: getstatic Perryc.c : I
    //   195: iflt -> 208
    //   198: ldc2_w -1633410340
    //   201: l2i
    //   202: ldc -1970708102
    //   204: ixor
    //   205: goto -> 215
    //   208: ldc2_w -1217923972
    //   211: l2i
    //   212: ldc -1737384299
    //   214: ixor
    //   215: ldc2_w -1748326826
    //   218: l2i
    //   219: ldc -499398712
    //   221: ixor
    //   222: ixor
    //   223: lookupswitch default -> 248, 1613729451 -> 208, 1641816632 -> 5288
    //   248: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.mc : Lnet/minecraft/client/Minecraft;
    //   251: getstatic Perryc.1 : I
    //   254: ifeq -> 267
    //   257: ldc2_w -321034881
    //   260: l2i
    //   261: ldc -525749984
    //   263: ixor
    //   264: goto -> 274
    //   267: ldc2_w 216772924
    //   270: l2i
    //   271: ldc 385116063
    //   273: ixor
    //   274: ldc2_w 615177926
    //   277: l2i
    //   278: ldc -1662353745
    //   280: ixor
    //   281: ixor
    //   282: lookupswitch default -> 308, -1271630794 -> 5328, 2042810479 -> 267
    //   308: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   311: ifnull -> 324
    //   314: ldc2_w 287209054
    //   317: l2i
    //   318: ldc 635068855
    //   320: ixor
    //   321: goto -> 331
    //   324: ldc2_w -1734138816
    //   327: l2i
    //   328: ldc -1402522712
    //   330: ixor
    //   331: ldc2_w -1798731186
    //   334: l2i
    //   335: ldc -958103237
    //   337: ixor
    //   338: ixor
    //   339: tableswitch default -> 314, 1726553244 -> 360, 1726553245 -> 1320
    //   360: getstatic Perryc.c : I
    //   363: iflt -> 376
    //   366: ldc2_w -1289062176
    //   369: l2i
    //   370: ldc -1239123065
    //   372: ixor
    //   373: goto -> 383
    //   376: ldc2_w 782954186
    //   379: l2i
    //   380: ldc 415491205
    //   382: ixor
    //   383: ldc2_w 287644110
    //   386: l2i
    //   387: ldc -61340517
    //   389: ixor
    //   390: ixor
    //   391: lookupswitch default -> 5396, -619440358 -> 416, -395108814 -> 376
    //   416: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.mc : Lnet/minecraft/client/Minecraft;
    //   419: getstatic Perryc.0 : I
    //   422: ifle -> 435
    //   425: ldc2_w -1651938493
    //   428: l2i
    //   429: ldc 368028107
    //   431: ixor
    //   432: goto -> 442
    //   435: ldc2_w -1979829176
    //   438: l2i
    //   439: ldc -1492692769
    //   441: ixor
    //   442: ldc2_w 507868508
    //   445: l2i
    //   446: ldc 557723669
    //   448: ixor
    //   449: ixor
    //   450: lookupswitch default -> 5306, -1222801471 -> 435, 293741022 -> 476
    //   476: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   479: getstatic Perryc.0 : I
    //   482: ifle -> 495
    //   485: ldc2_w -147417219
    //   488: l2i
    //   489: ldc -642104061
    //   491: ixor
    //   492: goto -> 502
    //   495: ldc2_w -1273155982
    //   498: l2i
    //   499: ldc -791356952
    //   501: ixor
    //   502: ldc2_w 232315945
    //   505: l2i
    //   506: ldc 1438560295
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 536, -1093911486 -> 495, 1995095664 -> 5282
    //   536: aload_0
    //   537: getstatic Perryc.c : I
    //   540: iflt -> 553
    //   543: ldc2_w 960263184
    //   546: l2i
    //   547: ldc -1770202439
    //   549: ixor
    //   550: goto -> 560
    //   553: ldc2_w -78977135
    //   556: l2i
    //   557: ldc -718491689
    //   559: ixor
    //   560: ldc2_w 698598085
    //   563: l2i
    //   564: ldc 1723070795
    //   566: ixor
    //   567: ixor
    //   568: lookupswitch default -> 596, -1664270742 -> 553, -531589849 -> 5334
    //   596: getfield currentPos : Lnet/minecraft/util/math/BlockPos;
    //   599: getstatic Perryc.0 : I
    //   602: ifle -> 615
    //   605: ldc2_w 2062021581
    //   608: l2i
    //   609: ldc -20451090
    //   611: ixor
    //   612: goto -> 622
    //   615: ldc2_w -66247315
    //   618: l2i
    //   619: ldc -2045724368
    //   621: ixor
    //   622: ldc2_w -1466578947
    //   625: l2i
    //   626: ldc 1036096847
    //   628: ixor
    //   629: ixor
    //   630: lookupswitch default -> 656, 171107748 -> 615, 292835729 -> 5404
    //   656: goto -> 660
    //   659: athrow
    //   660: invokevirtual func_174818_b : (Lnet/minecraft/util/math/BlockPos;)D
    //   663: goto -> 667
    //   666: athrow
    //   667: getstatic Perryc.0 : I
    //   670: ifle -> 684
    //   673: ldc2_w 610503644
    //   676: l2i
    //   677: ldc_w -864300431
    //   680: ixor
    //   681: goto -> 692
    //   684: ldc2_w -1076566112
    //   687: l2i
    //   688: ldc_w -1568200661
    //   691: ixor
    //   692: ldc2_w -1062242663
    //   695: l2i
    //   696: ldc_w 648416755
    //   699: ixor
    //   700: ixor
    //   701: lookupswitch default -> 728, -1448423420 -> 684, 236004039 -> 5342
    //   728: aload_0
    //   729: getstatic Perryc.c : I
    //   732: iflt -> 746
    //   735: ldc2_w 1970298391
    //   738: l2i
    //   739: ldc_w -1016623364
    //   742: ixor
    //   743: goto -> 754
    //   746: ldc2_w 1562622757
    //   749: l2i
    //   750: ldc_w 1752010226
    //   753: ixor
    //   754: ldc2_w -258594130
    //   757: l2i
    //   758: ldc_w 234629806
    //   761: ixor
    //   762: ixor
    //   763: lookupswitch default -> 5380, -937150761 -> 788, 1266536683 -> 746
    //   788: getfield range : Lbigname/zprestige/webhack/features/setting/Setting;
    //   791: getstatic Perryc.0 : I
    //   794: ifle -> 808
    //   797: ldc2_w -1070323098
    //   800: l2i
    //   801: ldc_w 849194817
    //   804: ixor
    //   805: goto -> 816
    //   808: ldc2_w -174619536
    //   811: l2i
    //   812: ldc_w 2024244845
    //   815: ixor
    //   816: ldc2_w 831351495
    //   819: l2i
    //   820: ldc_w -1133484864
    //   823: ixor
    //   824: ixor
    //   825: lookupswitch default -> 852, -719950877 -> 808, 2136247072 -> 5410
    //   852: goto -> 856
    //   855: athrow
    //   856: invokevirtual getValue : ()Ljava/lang/Object;
    //   859: goto -> 863
    //   862: athrow
    //   863: checkcast java/lang/Float
    //   866: getstatic Perryc.1 : I
    //   869: ifeq -> 883
    //   872: ldc2_w 669204491
    //   875: l2i
    //   876: ldc_w -766507464
    //   879: ixor
    //   880: goto -> 891
    //   883: ldc2_w 1418848476
    //   886: l2i
    //   887: ldc_w 1405643263
    //   890: ixor
    //   891: ldc2_w 1111253369
    //   894: l2i
    //   895: ldc_w 641838996
    //   898: ixor
    //   899: ixor
    //   900: lookupswitch default -> 928, -1848735522 -> 5280, -1699455429 -> 883
    //   928: goto -> 932
    //   931: athrow
    //   932: invokevirtual floatValue : ()F
    //   935: goto -> 939
    //   938: athrow
    //   939: f2d
    //   940: getstatic Perryc.0 : I
    //   943: ifle -> 957
    //   946: ldc2_w 1348291298
    //   949: l2i
    //   950: ldc_w 492030767
    //   953: ixor
    //   954: goto -> 965
    //   957: ldc2_w 1462405574
    //   960: l2i
    //   961: ldc_w 512119166
    //   964: ixor
    //   965: ldc2_w 349597805
    //   968: l2i
    //   969: ldc_w -38827909
    //   972: ixor
    //   973: ixor
    //   974: lookupswitch default -> 5362, -1596645202 -> 1000, -1535673893 -> 957
    //   1000: goto -> 1004
    //   1003: athrow
    //   1004: invokestatic square : (D)D
    //   1007: goto -> 1011
    //   1010: athrow
    //   1011: dcmpl
    //   1012: ifle -> 1026
    //   1015: ldc2_w -458921168
    //   1018: l2i
    //   1019: ldc_w 2268947
    //   1022: ixor
    //   1023: goto -> 1034
    //   1026: ldc2_w 1503854448
    //   1029: l2i
    //   1030: ldc_w -1121645744
    //   1033: ixor
    //   1034: ldc2_w 630844997
    //   1037: l2i
    //   1038: ldc_w -374834925
    //   1041: ixor
    //   1042: ixor
    //   1043: tableswitch default -> 1015, 683041653 -> 1064, 683041654 -> 1320
    //   1064: getstatic Perryc.c : I
    //   1067: iflt -> 1081
    //   1070: ldc2_w -1133561690
    //   1073: l2i
    //   1074: ldc_w -827144037
    //   1077: ixor
    //   1078: goto -> 1089
    //   1081: ldc2_w 805465032
    //   1084: l2i
    //   1085: ldc_w 1679236605
    //   1088: ixor
    //   1089: ldc2_w -418341491
    //   1092: l2i
    //   1093: ldc_w 573236856
    //   1096: ixor
    //   1097: ixor
    //   1098: lookupswitch default -> 1124, -1209562168 -> 5352, 698958888 -> 1081
    //   1124: aload_0
    //   1125: aconst_null
    //   1126: getstatic Perryc.1 : I
    //   1129: ifeq -> 1143
    //   1132: ldc2_w 616079193
    //   1135: l2i
    //   1136: ldc_w -2025006840
    //   1139: ixor
    //   1140: goto -> 1151
    //   1143: ldc2_w 735017416
    //   1146: l2i
    //   1147: ldc_w 383525618
    //   1150: ixor
    //   1151: ldc2_w -717949222
    //   1154: l2i
    //   1155: ldc_w -2081228153
    //   1158: ixor
    //   1159: ixor
    //   1160: lookupswitch default -> 5294, -181253620 -> 1143, 1809143655 -> 1188
    //   1188: putfield currentPos : Lnet/minecraft/util/math/BlockPos;
    //   1191: getstatic Perryc.1 : I
    //   1194: ifeq -> 1208
    //   1197: ldc2_w 952685821
    //   1200: l2i
    //   1201: ldc_w -1761974904
    //   1204: ixor
    //   1205: goto -> 1216
    //   1208: ldc2_w 353380900
    //   1211: l2i
    //   1212: ldc_w 1377368160
    //   1215: ixor
    //   1216: ldc2_w -938908367
    //   1219: l2i
    //   1220: ldc_w -1301684800
    //   1223: ixor
    //   1224: ixor
    //   1225: lookupswitch default -> 1252, -2072735969 -> 1208, -732821116 -> 5284
    //   1252: aload_0
    //   1253: aconst_null
    //   1254: getstatic Perryc.1 : I
    //   1257: ifeq -> 1271
    //   1260: ldc2_w -1912489390
    //   1263: l2i
    //   1264: ldc_w -214968101
    //   1267: ixor
    //   1268: goto -> 1279
    //   1271: ldc2_w 1444598568
    //   1274: l2i
    //   1275: ldc_w 824543459
    //   1278: ixor
    //   1279: ldc2_w 1987017845
    //   1282: l2i
    //   1283: ldc_w -1623736961
    //   1286: ixor
    //   1287: ixor
    //   1288: lookupswitch default -> 5398, -1905812799 -> 1316, -1804164221 -> 1271
    //   1316: putfield currentBlockState : Lnet/minecraft/block/state/IBlockState;
    //   1319: return
    //   1320: getstatic Perryc.1 : I
    //   1323: ifeq -> 1337
    //   1326: ldc2_w 1949612727
    //   1329: l2i
    //   1330: ldc_w -1163590854
    //   1333: ixor
    //   1334: goto -> 1345
    //   1337: ldc2_w 2008976055
    //   1340: l2i
    //   1341: ldc_w 1650292365
    //   1344: ixor
    //   1345: ldc2_w -1152792898
    //   1348: l2i
    //   1349: ldc_w 503183260
    //   1352: ixor
    //   1353: ixor
    //   1354: lookupswitch default -> 5360, -1286091496 -> 1380, 1747290287 -> 1337
    //   1380: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.mc : Lnet/minecraft/client/Minecraft;
    //   1383: getstatic Perryc.0 : I
    //   1386: ifle -> 1400
    //   1389: ldc2_w 2099841733
    //   1392: l2i
    //   1393: ldc_w -548437662
    //   1396: ixor
    //   1397: goto -> 1408
    //   1400: ldc2_w 1532046486
    //   1403: l2i
    //   1404: ldc_w -878270631
    //   1407: ixor
    //   1408: ldc2_w 156140214
    //   1411: l2i
    //   1412: ldc_w -1868633920
    //   1415: ixor
    //   1416: ixor
    //   1417: lookupswitch default -> 5304, 153608633 -> 1444, 1001841105 -> 1400
    //   1444: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1447: ifnull -> 1461
    //   1450: ldc2_w -270019919
    //   1453: l2i
    //   1454: ldc_w -1327562310
    //   1457: ixor
    //   1458: goto -> 1469
    //   1461: ldc2_w 1998151831
    //   1464: l2i
    //   1465: ldc_w 673297309
    //   1468: ixor
    //   1469: ldc2_w -926752797
    //   1472: l2i
    //   1473: ldc_w 801505358
    //   1476: ixor
    //   1477: ixor
    //   1478: tableswitch default -> 1450, -1204024154 -> 1500, -1204024153 -> 2887
    //   1500: getstatic Perryc.0 : I
    //   1503: ifle -> 1517
    //   1506: ldc2_w -1230848007
    //   1509: l2i
    //   1510: ldc_w 743240113
    //   1513: ixor
    //   1514: goto -> 1525
    //   1517: ldc2_w -1844707428
    //   1520: l2i
    //   1521: ldc_w -566971633
    //   1524: ixor
    //   1525: ldc2_w -1501217039
    //   1528: l2i
    //   1529: ldc_w -529295795
    //   1532: ixor
    //   1533: ixor
    //   1534: lookupswitch default -> 1560, -602347788 -> 5408, 917163364 -> 1517
    //   1560: aload_0
    //   1561: getstatic Perryc.0 : I
    //   1564: ifle -> 1578
    //   1567: ldc2_w 1809237006
    //   1570: l2i
    //   1571: ldc_w 962327834
    //   1574: ixor
    //   1575: goto -> 1586
    //   1578: ldc2_w 1465496457
    //   1581: l2i
    //   1582: ldc_w -1979360899
    //   1585: ixor
    //   1586: ldc2_w -343715701
    //   1589: l2i
    //   1590: ldc_w 195711610
    //   1593: ixor
    //   1594: ixor
    //   1595: lookupswitch default -> 5314, -1297861659 -> 1578, 1031137285 -> 1620
    //   1620: getfield silentSwitch : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1623: getstatic Perryc.1 : I
    //   1626: ifeq -> 1640
    //   1629: ldc2_w 1347448300
    //   1632: l2i
    //   1633: ldc_w -1784201227
    //   1636: ixor
    //   1637: goto -> 1648
    //   1640: ldc2_w 858015845
    //   1643: l2i
    //   1644: ldc_w 577406859
    //   1647: ixor
    //   1648: ldc2_w 509486368
    //   1651: l2i
    //   1652: ldc_w -2097465735
    //   1655: ixor
    //   1656: ixor
    //   1657: lookupswitch default -> 5392, -1913922377 -> 1684, 1498562880 -> 1640
    //   1684: goto -> 1688
    //   1687: athrow
    //   1688: invokevirtual getValue : ()Ljava/lang/Object;
    //   1691: goto -> 1695
    //   1694: athrow
    //   1695: checkcast java/lang/Boolean
    //   1698: getstatic Perryc.0 : I
    //   1701: ifle -> 1715
    //   1704: ldc2_w -797776923
    //   1707: l2i
    //   1708: ldc_w 1722194675
    //   1711: ixor
    //   1712: goto -> 1723
    //   1715: ldc2_w -1002864678
    //   1718: l2i
    //   1719: ldc_w -690711052
    //   1722: ixor
    //   1723: ldc2_w 725335147
    //   1726: l2i
    //   1727: ldc_w 1664426277
    //   1730: ixor
    //   1731: ixor
    //   1732: lookupswitch default -> 5372, -19209128 -> 1715, 1524856672 -> 1760
    //   1760: goto -> 1764
    //   1763: athrow
    //   1764: invokevirtual booleanValue : ()Z
    //   1767: goto -> 1771
    //   1770: athrow
    //   1771: ifeq -> 1785
    //   1774: ldc2_w -1540729271
    //   1777: l2i
    //   1778: ldc_w 1634786074
    //   1781: ixor
    //   1782: goto -> 1793
    //   1785: ldc2_w -689278315
    //   1788: l2i
    //   1789: ldc_w 330366919
    //   1792: ixor
    //   1793: ldc2_w -1277720168
    //   1796: l2i
    //   1797: ldc_w 113307871
    //   1800: ixor
    //   1801: ixor
    //   1802: tableswitch default -> 1774, 1884156948 -> 1824, 1884156949 -> 2887
    //   1824: getstatic Perryc.1 : I
    //   1827: ifeq -> 1841
    //   1830: ldc2_w 1390597477
    //   1833: l2i
    //   1834: ldc_w 449427294
    //   1837: ixor
    //   1838: goto -> 1849
    //   1841: ldc2_w 10315850
    //   1844: l2i
    //   1845: ldc_w -340535916
    //   1848: ixor
    //   1849: ldc2_w 2105368870
    //   1852: l2i
    //   1853: ldc_w -592316774
    //   1856: ixor
    //   1857: ixor
    //   1858: lookupswitch default -> 1884, -370674297 -> 5302, 2005914814 -> 1841
    //   1884: aload_0
    //   1885: getstatic Perryc.1 : I
    //   1888: ifeq -> 1902
    //   1891: ldc2_w 1482513449
    //   1894: l2i
    //   1895: ldc_w -97136936
    //   1898: ixor
    //   1899: goto -> 1910
    //   1902: ldc2_w 178100655
    //   1905: l2i
    //   1906: ldc_w 557795390
    //   1909: ixor
    //   1910: ldc2_w 2015464587
    //   1913: l2i
    //   1914: ldc_w 1507221684
    //   1917: ixor
    //   1918: ixor
    //   1919: lookupswitch default -> 1944, -2086699314 -> 5350, 580399885 -> 1902
    //   1944: getfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   1947: ldc_w 0.0012648114
    //   1950: invokestatic floatToIntBits : (F)I
    //   1953: ldc_w 2120206343
    //   1956: ixor
    //   1957: invokestatic intBitsToFloat : (I)F
    //   1960: getstatic Perryc.1 : I
    //   1963: ifeq -> 1977
    //   1966: ldc2_w -153254988
    //   1969: l2i
    //   1970: ldc_w -1664178524
    //   1973: ixor
    //   1974: goto -> 1985
    //   1977: ldc2_w -668625745
    //   1980: l2i
    //   1981: ldc_w 2071458977
    //   1984: ixor
    //   1985: ldc2_w -642664850
    //   1988: l2i
    //   1989: ldc_w 1466173443
    //   1992: ixor
    //   1993: ixor
    //   1994: lookupswitch default -> 5300, -456746115 -> 1977, 763879011 -> 2020
    //   2020: getstatic bigname/zprestige/webhack/WebHack.serverManager : Lbigname/zprestige/webhack/manager/ServerManager;
    //   2023: getstatic Perryc.1 : I
    //   2026: ifeq -> 2040
    //   2029: ldc2_w -567514523
    //   2032: l2i
    //   2033: ldc_w -277029964
    //   2036: ixor
    //   2037: goto -> 2048
    //   2040: ldc2_w 427862165
    //   2043: l2i
    //   2044: ldc_w 478251996
    //   2047: ixor
    //   2048: ldc2_w 1224389459
    //   2051: l2i
    //   2052: ldc_w 818360375
    //   2055: ixor
    //   2056: ixor
    //   2057: lookupswitch default -> 5368, 1231893173 -> 2040, 2101125165 -> 2084
    //   2084: goto -> 2088
    //   2087: athrow
    //   2088: invokevirtual getTpsFactor : ()F
    //   2091: goto -> 2095
    //   2094: athrow
    //   2095: fmul
    //   2096: f2i
    //   2097: i2l
    //   2098: getstatic Perryc.0 : I
    //   2101: ifle -> 2115
    //   2104: ldc2_w -1036566376
    //   2107: l2i
    //   2108: ldc_w -15986220
    //   2111: ixor
    //   2112: goto -> 2123
    //   2115: ldc2_w -1542173355
    //   2118: l2i
    //   2119: ldc_w -1286363499
    //   2122: ixor
    //   2123: ldc2_w -1633360035
    //   2126: l2i
    //   2127: ldc_w -1746047334
    //   2130: ixor
    //   2131: ixor
    //   2132: lookupswitch default -> 2160, -1403659678 -> 2115, 879941771 -> 5382
    //   2160: goto -> 2164
    //   2163: athrow
    //   2164: invokevirtual passedMs : (J)Z
    //   2167: goto -> 2171
    //   2170: athrow
    //   2171: ifeq -> 2185
    //   2174: ldc2_w -77258018
    //   2177: l2i
    //   2178: ldc_w -1274118653
    //   2181: ixor
    //   2182: goto -> 2193
    //   2185: ldc2_w 2120158762
    //   2188: l2i
    //   2189: ldc_w 825512694
    //   2192: ixor
    //   2193: ldc2_w 943820360
    //   2196: l2i
    //   2197: ldc_w -132357957
    //   2200: ixor
    //   2201: ixor
    //   2202: tableswitch default -> 2174, -1892240850 -> 2224, -1892240849 -> 2887
    //   2224: getstatic Perryc.c : I
    //   2227: iflt -> 2241
    //   2230: ldc2_w 1930340007
    //   2233: l2i
    //   2234: ldc_w 1219474503
    //   2237: ixor
    //   2238: goto -> 2249
    //   2241: ldc2_w 723789992
    //   2244: l2i
    //   2245: ldc_w 395537318
    //   2248: ixor
    //   2249: ldc2_w -1247262363
    //   2252: l2i
    //   2253: ldc_w 1692580244
    //   2256: ixor
    //   2257: ixor
    //   2258: lookupswitch default -> 2284, -353639919 -> 5326, 812008904 -> 2241
    //   2284: aload_0
    //   2285: getstatic Perryc.c : I
    //   2288: iflt -> 2302
    //   2291: ldc2_w 1660372102
    //   2294: l2i
    //   2295: ldc_w -771871288
    //   2298: ixor
    //   2299: goto -> 2310
    //   2302: ldc2_w 119329463
    //   2305: l2i
    //   2306: ldc_w 357640451
    //   2309: ixor
    //   2310: ldc2_w 1739221733
    //   2313: l2i
    //   2314: ldc_w 1483569074
    //   2317: ixor
    //   2318: ixor
    //   2319: lookupswitch default -> 2344, -1932626919 -> 5290, -929007558 -> 2302
    //   2344: goto -> 2348
    //   2347: athrow
    //   2348: invokespecial getPickSlot : ()I
    //   2351: goto -> 2355
    //   2354: athrow
    //   2355: ldc2_w -565514131
    //   2358: l2i
    //   2359: ldc_w 565514130
    //   2362: ixor
    //   2363: if_icmpeq -> 2377
    //   2366: ldc2_w -1577835689
    //   2369: l2i
    //   2370: ldc_w 1891800921
    //   2373: ixor
    //   2374: goto -> 2385
    //   2377: ldc2_w 1637894870
    //   2380: l2i
    //   2381: ldc_w -1332281689
    //   2384: ixor
    //   2385: ldc2_w 30984658
    //   2388: l2i
    //   2389: ldc_w -107025565
    //   2392: ixor
    //   2393: ixor
    //   2394: tableswitch default -> 2366, 695244479 -> 2416, 695244480 -> 2887
    //   2416: getstatic Perryc.c : I
    //   2419: iflt -> 2433
    //   2422: ldc2_w -1328648670
    //   2425: l2i
    //   2426: ldc_w 83739583
    //   2429: ixor
    //   2430: goto -> 2441
    //   2433: ldc2_w 896233834
    //   2436: l2i
    //   2437: ldc_w -574940637
    //   2440: ixor
    //   2441: ldc2_w -488047913
    //   2444: l2i
    //   2445: ldc_w 1465396445
    //   2448: ixor
    //   2449: ixor
    //   2450: lookupswitch default -> 2476, 25394071 -> 5332, 768493724 -> 2433
    //   2476: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.mc : Lnet/minecraft/client/Minecraft;
    //   2479: getstatic Perryc.0 : I
    //   2482: ifle -> 2496
    //   2485: ldc2_w -1340679981
    //   2488: l2i
    //   2489: ldc_w 203391620
    //   2492: ixor
    //   2493: goto -> 2504
    //   2496: ldc2_w 1199163474
    //   2499: l2i
    //   2500: ldc_w 1620967342
    //   2503: ixor
    //   2504: ldc2_w 416007633
    //   2507: l2i
    //   2508: ldc_w -426740324
    //   2511: ixor
    //   2512: ixor
    //   2513: lookupswitch default -> 5384, -641759311 -> 2540, 1112730138 -> 2496
    //   2540: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2543: getstatic Perryc.c : I
    //   2546: iflt -> 2560
    //   2549: ldc2_w -1204041437
    //   2552: l2i
    //   2553: ldc_w -1931398427
    //   2556: ixor
    //   2557: goto -> 2568
    //   2560: ldc2_w -340854233
    //   2563: l2i
    //   2564: ldc_w 447625461
    //   2567: ixor
    //   2568: ldc2_w 1088007506
    //   2571: l2i
    //   2572: ldc_w 122317390
    //   2575: ixor
    //   2576: ixor
    //   2577: lookupswitch default -> 5308, -1231878706 -> 2604, 1934179546 -> 2560
    //   2604: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   2607: new net/minecraft/network/play/client/CPacketHeldItemChange
    //   2610: dup
    //   2611: getstatic Perryc.c : I
    //   2614: iflt -> 2628
    //   2617: ldc2_w -567459030
    //   2620: l2i
    //   2621: ldc_w 1367038537
    //   2624: ixor
    //   2625: goto -> 2636
    //   2628: ldc2_w 268484811
    //   2631: l2i
    //   2632: ldc_w 1577622212
    //   2635: ixor
    //   2636: ldc2_w -1549990583
    //   2639: l2i
    //   2640: ldc_w 1323712499
    //   2643: ixor
    //   2644: ixor
    //   2645: lookupswitch default -> 5286, -1552719691 -> 2672, 1647125465 -> 2628
    //   2672: aload_0
    //   2673: getstatic Perryc.c : I
    //   2676: iflt -> 2690
    //   2679: ldc2_w -1466773385
    //   2682: l2i
    //   2683: ldc_w 718978153
    //   2686: ixor
    //   2687: goto -> 2698
    //   2690: ldc2_w -248376901
    //   2693: l2i
    //   2694: ldc_w 956214864
    //   2697: ixor
    //   2698: ldc2_w -1764814065
    //   2701: l2i
    //   2702: ldc_w -1580232616
    //   2705: ixor
    //   2706: ixor
    //   2707: lookupswitch default -> 2732, -1460931729 -> 2690, -1253511351 -> 5418
    //   2732: goto -> 2736
    //   2735: athrow
    //   2736: invokespecial getPickSlot : ()I
    //   2739: goto -> 2743
    //   2742: athrow
    //   2743: getstatic Perryc.0 : I
    //   2746: ifle -> 2760
    //   2749: ldc2_w 476796583
    //   2752: l2i
    //   2753: ldc_w 783835
    //   2756: ixor
    //   2757: goto -> 2768
    //   2760: ldc2_w 901648311
    //   2763: l2i
    //   2764: ldc_w 580391060
    //   2767: ixor
    //   2768: ldc2_w 1099812866
    //   2771: l2i
    //   2772: ldc_w 680444582
    //   2775: ixor
    //   2776: ixor
    //   2777: lookupswitch default -> 5376, 1969467864 -> 2760, 2116357511 -> 2804
    //   2804: goto -> 2808
    //   2807: athrow
    //   2808: invokespecial <init> : (I)V
    //   2811: goto -> 2815
    //   2814: athrow
    //   2815: getstatic Perryc.0 : I
    //   2818: ifle -> 2832
    //   2821: ldc2_w 2076126321
    //   2824: l2i
    //   2825: ldc_w -600440880
    //   2828: ixor
    //   2829: goto -> 2840
    //   2832: ldc2_w -1612932154
    //   2835: l2i
    //   2836: ldc_w -798322509
    //   2839: ixor
    //   2840: ldc2_w -158377143
    //   2843: l2i
    //   2844: ldc_w -53145117
    //   2847: ixor
    //   2848: ixor
    //   2849: lookupswitch default -> 5402, -1378838261 -> 2832, 1173111263 -> 2876
    //   2876: goto -> 2880
    //   2879: athrow
    //   2880: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   2883: goto -> 2887
    //   2886: athrow
    //   2887: getstatic Perryc.0 : I
    //   2890: ifle -> 2904
    //   2893: ldc2_w -1195159298
    //   2896: l2i
    //   2897: ldc_w 2041708847
    //   2900: ixor
    //   2901: goto -> 2912
    //   2904: ldc2_w -1572200210
    //   2907: l2i
    //   2908: ldc_w -435478260
    //   2911: ixor
    //   2912: ldc2_w -1997310061
    //   2915: l2i
    //   2916: ldc_w -1322400815
    //   2919: ixor
    //   2920: ixor
    //   2921: lookupswitch default -> 5338, -122690157 -> 2904, 2107618720 -> 2948
    //   2948: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.mc : Lnet/minecraft/client/Minecraft;
    //   2951: getstatic Perryc.0 : I
    //   2954: ifle -> 2968
    //   2957: ldc2_w 274545175
    //   2960: l2i
    //   2961: ldc_w -416076733
    //   2964: ixor
    //   2965: goto -> 2976
    //   2968: ldc2_w -341310510
    //   2971: l2i
    //   2972: ldc_w 718104070
    //   2975: ixor
    //   2976: ldc2_w -1939030090
    //   2979: l2i
    //   2980: ldc_w 1204464455
    //   2983: ixor
    //   2984: ixor
    //   2985: lookupswitch default -> 5394, 180580645 -> 3012, 1019740837 -> 2968
    //   3012: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   3015: getstatic Perryc.0 : I
    //   3018: ifle -> 3032
    //   3021: ldc2_w 2107528184
    //   3024: l2i
    //   3025: ldc_w -145154593
    //   3028: ixor
    //   3029: goto -> 3040
    //   3032: ldc2_w 136883568
    //   3035: l2i
    //   3036: ldc_w 693571408
    //   3039: ixor
    //   3040: ldc2_w -169039209
    //   3043: l2i
    //   3044: ldc_w 799321043
    //   3047: ixor
    //   3048: ixor
    //   3049: lookupswitch default -> 5346, -80239772 -> 3076, 1351569251 -> 3032
    //   3076: aload_0
    //   3077: getstatic Perryc.c : I
    //   3080: iflt -> 3094
    //   3083: ldc2_w -211475731
    //   3086: l2i
    //   3087: ldc_w -1331546761
    //   3090: ixor
    //   3091: goto -> 3102
    //   3094: ldc2_w -849094382
    //   3097: l2i
    //   3098: ldc_w -586730631
    //   3101: ixor
    //   3102: ldc2_w -779905123
    //   3105: l2i
    //   3106: ldc_w -223357631
    //   3109: ixor
    //   3110: ixor
    //   3111: lookupswitch default -> 5322, 860399799 -> 3136, 1626035526 -> 3094
    //   3136: getfield currentPos : Lnet/minecraft/util/math/BlockPos;
    //   3139: getstatic Perryc.c : I
    //   3142: iflt -> 3156
    //   3145: ldc2_w 884121853
    //   3148: l2i
    //   3149: ldc_w -2048095965
    //   3152: ixor
    //   3153: goto -> 3164
    //   3156: ldc2_w -1785578472
    //   3159: l2i
    //   3160: ldc_w -74235718
    //   3163: ixor
    //   3164: ldc2_w -748666347
    //   3167: l2i
    //   3168: ldc_w 581116725
    //   3171: ixor
    //   3172: ixor
    //   3173: lookupswitch default -> 5324, -1614668414 -> 3200, 1084049662 -> 3156
    //   3200: goto -> 3204
    //   3203: athrow
    //   3204: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   3207: goto -> 3211
    //   3210: athrow
    //   3211: getstatic Perryc.c : I
    //   3214: iflt -> 3228
    //   3217: ldc2_w -1204276667
    //   3220: l2i
    //   3221: ldc_w -1722899550
    //   3224: ixor
    //   3225: goto -> 3236
    //   3228: ldc2_w -657018025
    //   3231: l2i
    //   3232: ldc_w 1754899188
    //   3235: ixor
    //   3236: ldc2_w -872674510
    //   3239: l2i
    //   3240: ldc_w 1019950606
    //   3243: ixor
    //   3244: ixor
    //   3245: lookupswitch default -> 5414, -700338981 -> 3228, 1199058079 -> 3272
    //   3272: aload_0
    //   3273: getstatic Perryc.c : I
    //   3276: iflt -> 3290
    //   3279: ldc2_w 709232506
    //   3282: l2i
    //   3283: ldc_w 2004073549
    //   3286: ixor
    //   3287: goto -> 3298
    //   3290: ldc2_w 2053889869
    //   3293: l2i
    //   3294: ldc_w -1378602080
    //   3297: ixor
    //   3298: ldc2_w -1202446699
    //   3301: l2i
    //   3302: ldc_w -1133498771
    //   3305: ixor
    //   3306: ixor
    //   3307: lookupswitch default -> 3332, 1494322127 -> 5340, 1885822921 -> 3290
    //   3332: getfield currentBlockState : Lnet/minecraft/block/state/IBlockState;
    //   3335: getstatic Perryc.0 : I
    //   3338: ifle -> 3352
    //   3341: ldc2_w 514350164
    //   3344: l2i
    //   3345: ldc_w -1609231328
    //   3348: ixor
    //   3349: goto -> 3360
    //   3352: ldc2_w -2098774211
    //   3355: l2i
    //   3356: ldc_w -968208432
    //   3359: ixor
    //   3360: ldc2_w 942946015
    //   3363: l2i
    //   3364: ldc_w 1471795790
    //   3367: ixor
    //   3368: ixor
    //   3369: lookupswitch default -> 3396, -785339163 -> 5330, 86912335 -> 3352
    //   3396: goto -> 3400
    //   3399: athrow
    //   3400: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3403: goto -> 3407
    //   3406: athrow
    //   3407: ifeq -> 3421
    //   3410: ldc2_w -957695838
    //   3413: l2i
    //   3414: ldc_w 256133702
    //   3417: ixor
    //   3418: goto -> 3429
    //   3421: ldc2_w 714950257
    //   3424: l2i
    //   3425: ldc_w -483150698
    //   3428: ixor
    //   3429: ldc2_w 1091190524
    //   3432: l2i
    //   3433: ldc_w 5715745
    //   3436: ixor
    //   3437: ixor
    //   3438: tableswitch default -> 3410, -1997276359 -> 3460, -1997276358 -> 3972
    //   3460: getstatic Perryc.0 : I
    //   3463: ifle -> 3477
    //   3466: ldc2_w 543838874
    //   3469: l2i
    //   3470: ldc_w 2099641405
    //   3473: ixor
    //   3474: goto -> 3485
    //   3477: ldc2_w -1913987003
    //   3480: l2i
    //   3481: ldc_w 1612698375
    //   3484: ixor
    //   3485: ldc2_w 54332764
    //   3488: l2i
    //   3489: ldc_w 1086662225
    //   3492: ixor
    //   3493: ixor
    //   3494: lookupswitch default -> 5320, -1374873521 -> 3520, 515343786 -> 3477
    //   3520: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.mc : Lnet/minecraft/client/Minecraft;
    //   3523: getstatic Perryc.c : I
    //   3526: iflt -> 3540
    //   3529: ldc2_w -500091929
    //   3532: l2i
    //   3533: ldc_w -1404724448
    //   3536: ixor
    //   3537: goto -> 3548
    //   3540: ldc2_w 1010759322
    //   3543: l2i
    //   3544: ldc_w 23042554
    //   3547: ixor
    //   3548: ldc2_w 1875517859
    //   3551: l2i
    //   3552: ldc_w -1029664463
    //   3555: ixor
    //   3556: ixor
    //   3557: lookupswitch default -> 3584, -652101704 -> 3540, -484566955 -> 5386
    //   3584: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   3587: getstatic Perryc.1 : I
    //   3590: ifeq -> 3604
    //   3593: ldc2_w -1154760798
    //   3596: l2i
    //   3597: ldc_w 676053664
    //   3600: ixor
    //   3601: goto -> 3612
    //   3604: ldc2_w -683146506
    //   3607: l2i
    //   3608: ldc_w -900238832
    //   3611: ixor
    //   3612: ldc2_w -1121171081
    //   3615: l2i
    //   3616: ldc_w 1582365409
    //   3619: ixor
    //   3620: ixor
    //   3621: lookupswitch default -> 5356, -27016336 -> 3648, 1880936084 -> 3604
    //   3648: aload_0
    //   3649: getstatic Perryc.0 : I
    //   3652: ifle -> 3666
    //   3655: ldc2_w -1504862455
    //   3658: l2i
    //   3659: ldc_w -1223438842
    //   3662: ixor
    //   3663: goto -> 3674
    //   3666: ldc2_w -1262417620
    //   3669: l2i
    //   3670: ldc_w -2027249737
    //   3673: ixor
    //   3674: ldc2_w -1113844108
    //   3677: l2i
    //   3678: ldc_w -1025243889
    //   3681: ixor
    //   3682: ixor
    //   3683: lookupswitch default -> 5312, 1284736480 -> 3708, 1848001140 -> 3666
    //   3708: getfield currentPos : Lnet/minecraft/util/math/BlockPos;
    //   3711: getstatic Perryc.1 : I
    //   3714: ifeq -> 3728
    //   3717: ldc2_w 79541417
    //   3720: l2i
    //   3721: ldc_w -624902048
    //   3724: ixor
    //   3725: goto -> 3736
    //   3728: ldc2_w -1964545349
    //   3731: l2i
    //   3732: ldc_w 2026454555
    //   3735: ixor
    //   3736: ldc2_w 994628169
    //   3739: l2i
    //   3740: ldc_w 1096833924
    //   3743: ixor
    //   3744: ixor
    //   3745: lookupswitch default -> 5316, -2012816019 -> 3772, -1537868540 -> 3728
    //   3772: goto -> 3776
    //   3775: athrow
    //   3776: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   3779: goto -> 3783
    //   3782: athrow
    //   3783: getstatic Perryc.c : I
    //   3786: iflt -> 3800
    //   3789: ldc2_w 957642937
    //   3792: l2i
    //   3793: ldc_w 211446276
    //   3796: ixor
    //   3797: goto -> 3808
    //   3800: ldc2_w 56200327
    //   3803: l2i
    //   3804: ldc_w -518057624
    //   3807: ixor
    //   3808: ldc2_w -2043808776
    //   3811: l2i
    //   3812: ldc_w -271006107
    //   3815: ixor
    //   3816: ixor
    //   3817: lookupswitch default -> 5406, -1951160206 -> 3844, 1551574816 -> 3800
    //   3844: goto -> 3848
    //   3847: athrow
    //   3848: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   3853: goto -> 3857
    //   3856: athrow
    //   3857: getstatic Perryc.0 : I
    //   3860: ifle -> 3874
    //   3863: ldc2_w 750492060
    //   3866: l2i
    //   3867: ldc_w 2101688030
    //   3870: ixor
    //   3871: goto -> 3882
    //   3874: ldc2_w 1453547222
    //   3877: l2i
    //   3878: ldc_w -324005143
    //   3881: ixor
    //   3882: ldc2_w -800202340
    //   3885: l2i
    //   3886: ldc_w 383959119
    //   3889: ixor
    //   3890: ixor
    //   3891: lookupswitch default -> 5318, -1756262767 -> 3874, 2092723692 -> 3916
    //   3916: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
    //   3919: if_acmpne -> 3933
    //   3922: ldc2_w 1427278224
    //   3925: l2i
    //   3926: ldc_w 936832955
    //   3929: ixor
    //   3930: goto -> 3941
    //   3933: ldc2_w -1438789627
    //   3936: l2i
    //   3937: ldc_w -923158993
    //   3940: ixor
    //   3941: ldc2_w 296729984
    //   3944: l2i
    //   3945: ldc_w 993598425
    //   3948: ixor
    //   3949: ixor
    //   3950: tableswitch default -> 3922, 1213382770 -> 3972, 1213382771 -> 4230
    //   3972: getstatic Perryc.c : I
    //   3975: iflt -> 3989
    //   3978: ldc2_w -1375945218
    //   3981: l2i
    //   3982: ldc_w -767213185
    //   3985: ixor
    //   3986: goto -> 3997
    //   3989: ldc2_w 720783387
    //   3992: l2i
    //   3993: ldc_w -731394201
    //   3996: ixor
    //   3997: ldc2_w -695370615
    //   4000: l2i
    //   4001: ldc_w 143936428
    //   4004: ixor
    //   4005: ixor
    //   4006: lookupswitch default -> 4032, -1583297628 -> 5400, 1980024974 -> 3989
    //   4032: aload_0
    //   4033: aconst_null
    //   4034: getstatic Perryc.0 : I
    //   4037: ifle -> 4051
    //   4040: ldc2_w 1378299370
    //   4043: l2i
    //   4044: ldc_w 1267380081
    //   4047: ixor
    //   4048: goto -> 4059
    //   4051: ldc2_w -210255002
    //   4054: l2i
    //   4055: ldc_w 327485685
    //   4058: ixor
    //   4059: ldc2_w 760083247
    //   4062: l2i
    //   4063: ldc_w -1619540143
    //   4066: ixor
    //   4067: ixor
    //   4068: lookupswitch default -> 5358, -1416120603 -> 4051, 1388904429 -> 4096
    //   4096: putfield currentPos : Lnet/minecraft/util/math/BlockPos;
    //   4099: getstatic Perryc.c : I
    //   4102: iflt -> 4116
    //   4105: ldc2_w 1339240390
    //   4108: l2i
    //   4109: ldc_w -422950439
    //   4112: ixor
    //   4113: goto -> 4124
    //   4116: ldc2_w -1146230880
    //   4119: l2i
    //   4120: ldc_w -698918845
    //   4123: ixor
    //   4124: ldc2_w 564985591
    //   4127: l2i
    //   4128: ldc_w -76978208
    //   4131: ixor
    //   4132: ixor
    //   4133: lookupswitch default -> 4160, -1247903805 -> 4116, 1943863048 -> 5296
    //   4160: aload_0
    //   4161: aconst_null
    //   4162: getstatic Perryc.c : I
    //   4165: iflt -> 4179
    //   4168: ldc2_w 373083504
    //   4171: l2i
    //   4172: ldc_w -1370995482
    //   4175: ixor
    //   4176: goto -> 4187
    //   4179: ldc2_w -1828965709
    //   4182: l2i
    //   4183: ldc_w -1501278167
    //   4186: ixor
    //   4187: ldc2_w 1858792893
    //   4190: l2i
    //   4191: ldc_w -550613805
    //   4194: ixor
    //   4195: ixor
    //   4196: lookupswitch default -> 5344, -2053323788 -> 4224, 160442616 -> 4179
    //   4224: putfield currentBlockState : Lnet/minecraft/block/state/IBlockState;
    //   4227: goto -> 5279
    //   4230: getstatic Perryc.1 : I
    //   4233: ifeq -> 4247
    //   4236: ldc2_w 745545618
    //   4239: l2i
    //   4240: ldc_w 1223886927
    //   4243: ixor
    //   4244: goto -> 4255
    //   4247: ldc2_w 1125515121
    //   4250: l2i
    //   4251: ldc_w -1259343871
    //   4254: ixor
    //   4255: ldc2_w -2041070036
    //   4258: l2i
    //   4259: ldc_w 200393574
    //   4262: ixor
    //   4263: ixor
    //   4264: lookupswitch default -> 4292, -383423849 -> 5374, 584350624 -> 4247
    //   4292: aload_0
    //   4293: getstatic Perryc.1 : I
    //   4296: ifeq -> 4310
    //   4299: ldc2_w -1410145293
    //   4302: l2i
    //   4303: ldc_w 1059118598
    //   4306: ixor
    //   4307: goto -> 4318
    //   4310: ldc2_w 1128993211
    //   4313: l2i
    //   4314: ldc_w -1739050863
    //   4317: ixor
    //   4318: ldc2_w -1263454889
    //   4321: l2i
    //   4322: ldc_w -833168743
    //   4325: ixor
    //   4326: ixor
    //   4327: lookupswitch default -> 4352, -749053563 -> 4310, -298462661 -> 5366
    //   4352: getfield webSwitch : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4355: getstatic Perryc.c : I
    //   4358: iflt -> 4372
    //   4361: ldc2_w 1606031939
    //   4364: l2i
    //   4365: ldc_w 1280211649
    //   4368: ixor
    //   4369: goto -> 4380
    //   4372: ldc2_w 898959398
    //   4375: l2i
    //   4376: ldc_w -800525435
    //   4379: ixor
    //   4380: ldc2_w -611976680
    //   4383: l2i
    //   4384: ldc_w -237750413
    //   4387: ixor
    //   4388: ixor
    //   4389: lookupswitch default -> 4416, 967159273 -> 5292, 1167966040 -> 4372
    //   4416: goto -> 4420
    //   4419: athrow
    //   4420: invokevirtual getValue : ()Ljava/lang/Object;
    //   4423: goto -> 4427
    //   4426: athrow
    //   4427: checkcast java/lang/Boolean
    //   4430: getstatic Perryc.c : I
    //   4433: iflt -> 4447
    //   4436: ldc2_w -781766814
    //   4439: l2i
    //   4440: ldc_w -308213194
    //   4443: ixor
    //   4444: goto -> 4455
    //   4447: ldc2_w 2006930591
    //   4450: l2i
    //   4451: ldc_w -1905366805
    //   4454: ixor
    //   4455: ldc2_w 995578641
    //   4458: l2i
    //   4459: ldc_w 1832357997
    //   4462: ixor
    //   4463: ixor
    //   4464: lookupswitch default -> 4492, 1684914846 -> 4447, 1789322792 -> 5310
    //   4492: goto -> 4496
    //   4495: athrow
    //   4496: invokevirtual booleanValue : ()Z
    //   4499: goto -> 4503
    //   4502: athrow
    //   4503: ifeq -> 4517
    //   4506: ldc2_w -1431967720
    //   4509: l2i
    //   4510: ldc_w -1004428767
    //   4513: ixor
    //   4514: goto -> 4525
    //   4517: ldc2_w -1584000327
    //   4520: l2i
    //   4521: ldc_w -820881273
    //   4524: ixor
    //   4525: ldc2_w 787784714
    //   4528: l2i
    //   4529: ldc_w -1000166800
    //   4532: ixor
    //   4533: ixor
    //   4534: tableswitch default -> 4506, -2079177661 -> 4556, -2079177660 -> 5279
    //   4556: getstatic Perryc.c : I
    //   4559: iflt -> 4573
    //   4562: ldc2_w -1690462237
    //   4565: l2i
    //   4566: ldc_w -1682035072
    //   4569: ixor
    //   4570: goto -> 4581
    //   4573: ldc2_w 897855570
    //   4576: l2i
    //   4577: ldc_w -884919586
    //   4580: ixor
    //   4581: ldc2_w 422348816
    //   4584: l2i
    //   4585: ldc_w -898881188
    //   4588: ixor
    //   4589: ixor
    //   4590: lookupswitch default -> 4616, -742189009 -> 5378, -591524247 -> 4573
    //   4616: aload_0
    //   4617: getstatic Perryc.1 : I
    //   4620: ifeq -> 4634
    //   4623: ldc2_w -1556265923
    //   4626: l2i
    //   4627: ldc_w -1020637670
    //   4630: ixor
    //   4631: goto -> 4642
    //   4634: ldc2_w 1998366711
    //   4637: l2i
    //   4638: ldc_w -1326378182
    //   4641: ixor
    //   4642: ldc2_w -1307788750
    //   4645: l2i
    //   4646: ldc_w 684027689
    //   4649: ixor
    //   4650: ixor
    //   4651: lookupswitch default -> 5388, -86057156 -> 4634, 1562665430 -> 4676
    //   4676: getfield currentBlockState : Lnet/minecraft/block/state/IBlockState;
    //   4679: getstatic Perryc.c : I
    //   4682: iflt -> 4696
    //   4685: ldc2_w -1919103415
    //   4688: l2i
    //   4689: ldc_w -449723216
    //   4692: ixor
    //   4693: goto -> 4704
    //   4696: ldc2_w -1247195260
    //   4699: l2i
    //   4700: ldc_w 1392965040
    //   4703: ixor
    //   4704: ldc2_w 1434095010
    //   4707: l2i
    //   4708: ldc_w 1039924001
    //   4711: ixor
    //   4712: ixor
    //   4713: lookupswitch default -> 5354, -1909535561 -> 4740, 2915450 -> 4696
    //   4740: goto -> 4744
    //   4743: athrow
    //   4744: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   4749: goto -> 4753
    //   4752: athrow
    //   4753: getstatic Perryc.1 : I
    //   4756: ifeq -> 4770
    //   4759: ldc2_w 1080325546
    //   4762: l2i
    //   4763: ldc_w 869367235
    //   4766: ixor
    //   4767: goto -> 4778
    //   4770: ldc2_w -1646396226
    //   4773: l2i
    //   4774: ldc_w 266300247
    //   4777: ixor
    //   4778: ldc2_w -1567553198
    //   4781: l2i
    //   4782: ldc_w -1333681936
    //   4785: ixor
    //   4786: ixor
    //   4787: lookupswitch default -> 4812, -1999094481 -> 4770, 1638244811 -> 5370
    //   4812: getstatic net/minecraft/init/Blocks.field_150321_G : Lnet/minecraft/block/Block;
    //   4815: if_acmpne -> 4829
    //   4818: ldc2_w -658049331
    //   4821: l2i
    //   4822: ldc_w -231435442
    //   4825: ixor
    //   4826: goto -> 4837
    //   4829: ldc2_w -671441192
    //   4832: l2i
    //   4833: ldc_w -49743014
    //   4836: ixor
    //   4837: ldc2_w 24703568
    //   4840: l2i
    //   4841: ldc_w 570839237
    //   4844: ixor
    //   4845: ixor
    //   4846: tableswitch default -> 4818, 160220950 -> 4868, 160220951 -> 5279
    //   4868: getstatic Perryc.1 : I
    //   4871: ifeq -> 4885
    //   4874: ldc2_w 154048363
    //   4877: l2i
    //   4878: ldc_w -718856618
    //   4881: ixor
    //   4882: goto -> 4893
    //   4885: ldc2_w 485035042
    //   4888: l2i
    //   4889: ldc_w -1939225000
    //   4892: ixor
    //   4893: ldc2_w -1837126764
    //   4896: l2i
    //   4897: ldc_w 1149693092
    //   4900: ixor
    //   4901: ixor
    //   4902: lookupswitch default -> 5348, 183553549 -> 4885, 1182371146 -> 4928
    //   4928: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.mc : Lnet/minecraft/client/Minecraft;
    //   4931: getstatic Perryc.c : I
    //   4934: iflt -> 4948
    //   4937: ldc2_w 1474207131
    //   4940: l2i
    //   4941: ldc_w 1031095201
    //   4944: ixor
    //   4945: goto -> 4956
    //   4948: ldc2_w -460448543
    //   4951: l2i
    //   4952: ldc_w 96036750
    //   4955: ixor
    //   4956: ldc2_w -1937918638
    //   4959: l2i
    //   4960: ldc_w -358576740
    //   4963: ixor
    //   4964: ixor
    //   4965: lookupswitch default -> 4992, -1551714309 -> 4948, 209118964 -> 5416
    //   4992: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4995: getstatic Perryc.0 : I
    //   4998: ifle -> 5012
    //   5001: ldc2_w 1101152372
    //   5004: l2i
    //   5005: ldc_w -1576918401
    //   5008: ixor
    //   5009: goto -> 5020
    //   5012: ldc2_w -1557771002
    //   5015: l2i
    //   5016: ldc_w 176396163
    //   5019: ixor
    //   5020: ldc2_w 2146852653
    //   5023: l2i
    //   5024: ldc_w 2128585003
    //   5027: ixor
    //   5028: ixor
    //   5029: lookupswitch default -> 5056, -563394047 -> 5012, -494298099 -> 5412
    //   5056: goto -> 5060
    //   5059: athrow
    //   5060: invokevirtual func_184614_ca : ()Lnet/minecraft/item/ItemStack;
    //   5063: goto -> 5067
    //   5066: athrow
    //   5067: getstatic Perryc.1 : I
    //   5070: ifeq -> 5084
    //   5073: ldc2_w 784851094
    //   5076: l2i
    //   5077: ldc_w 848504166
    //   5080: ixor
    //   5081: goto -> 5092
    //   5084: ldc2_w -219398467
    //   5087: l2i
    //   5088: ldc_w 50445767
    //   5091: ixor
    //   5092: ldc2_w 1807327931
    //   5095: l2i
    //   5096: ldc_w -1838382547
    //   5099: ixor
    //   5100: ixor
    //   5101: lookupswitch default -> 5128, -444471962 -> 5298, 1991736687 -> 5084
    //   5128: goto -> 5132
    //   5131: athrow
    //   5132: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   5135: goto -> 5139
    //   5138: athrow
    //   5139: instanceof net/minecraft/item/ItemPickaxe
    //   5142: ifeq -> 5156
    //   5145: ldc2_w -1396685716
    //   5148: l2i
    //   5149: ldc_w 1726247712
    //   5152: ixor
    //   5153: goto -> 5164
    //   5156: ldc2_w 864800366
    //   5159: l2i
    //   5160: ldc_w -105907933
    //   5163: ixor
    //   5164: ldc2_w 547909279
    //   5167: l2i
    //   5168: ldc_w -1113584019
    //   5171: ixor
    //   5172: ixor
    //   5173: tableswitch default -> 5145, 1462523838 -> 5196, 1462523839 -> 5279
    //   5196: ldc_w net/minecraft/item/ItemSword
    //   5199: ldc2_w -1346051780
    //   5202: l2i
    //   5203: ldc_w -1346051780
    //   5206: ixor
    //   5207: getstatic Perryc.1 : I
    //   5210: ifeq -> 5224
    //   5213: ldc2_w -255707691
    //   5216: l2i
    //   5217: ldc_w -988706502
    //   5220: ixor
    //   5221: goto -> 5232
    //   5224: ldc2_w 811913963
    //   5227: l2i
    //   5228: ldc_w -1102639962
    //   5231: ixor
    //   5232: ldc2_w -1903570012
    //   5235: l2i
    //   5236: ldc_w 703253655
    //   5239: ixor
    //   5240: ixor
    //   5241: lookupswitch default -> 5336, -1833917476 -> 5224, 692109694 -> 5268
    //   5268: goto -> 5272
    //   5271: athrow
    //   5272: invokestatic switchToHotbarSlot : (Ljava/lang/Class;Z)V
    //   5275: goto -> 5279
    //   5278: athrow
    //   5279: return
    //   5280: aconst_null
    //   5281: athrow
    //   5282: aconst_null
    //   5283: athrow
    //   5284: aconst_null
    //   5285: athrow
    //   5286: aconst_null
    //   5287: athrow
    //   5288: aconst_null
    //   5289: athrow
    //   5290: aconst_null
    //   5291: athrow
    //   5292: aconst_null
    //   5293: athrow
    //   5294: aconst_null
    //   5295: athrow
    //   5296: aconst_null
    //   5297: athrow
    //   5298: aconst_null
    //   5299: athrow
    //   5300: aconst_null
    //   5301: athrow
    //   5302: aconst_null
    //   5303: athrow
    //   5304: aconst_null
    //   5305: athrow
    //   5306: aconst_null
    //   5307: athrow
    //   5308: aconst_null
    //   5309: athrow
    //   5310: aconst_null
    //   5311: athrow
    //   5312: aconst_null
    //   5313: athrow
    //   5314: aconst_null
    //   5315: athrow
    //   5316: aconst_null
    //   5317: athrow
    //   5318: aconst_null
    //   5319: athrow
    //   5320: aconst_null
    //   5321: athrow
    //   5322: aconst_null
    //   5323: athrow
    //   5324: aconst_null
    //   5325: athrow
    //   5326: aconst_null
    //   5327: athrow
    //   5328: aconst_null
    //   5329: athrow
    //   5330: aconst_null
    //   5331: athrow
    //   5332: aconst_null
    //   5333: athrow
    //   5334: aconst_null
    //   5335: athrow
    //   5336: aconst_null
    //   5337: athrow
    //   5338: aconst_null
    //   5339: athrow
    //   5340: aconst_null
    //   5341: athrow
    //   5342: aconst_null
    //   5343: athrow
    //   5344: aconst_null
    //   5345: athrow
    //   5346: aconst_null
    //   5347: athrow
    //   5348: aconst_null
    //   5349: athrow
    //   5350: aconst_null
    //   5351: athrow
    //   5352: aconst_null
    //   5353: athrow
    //   5354: aconst_null
    //   5355: athrow
    //   5356: aconst_null
    //   5357: athrow
    //   5358: aconst_null
    //   5359: athrow
    //   5360: aconst_null
    //   5361: athrow
    //   5362: aconst_null
    //   5363: athrow
    //   5364: aconst_null
    //   5365: athrow
    //   5366: aconst_null
    //   5367: athrow
    //   5368: aconst_null
    //   5369: athrow
    //   5370: aconst_null
    //   5371: athrow
    //   5372: aconst_null
    //   5373: athrow
    //   5374: aconst_null
    //   5375: athrow
    //   5376: aconst_null
    //   5377: athrow
    //   5378: aconst_null
    //   5379: athrow
    //   5380: aconst_null
    //   5381: athrow
    //   5382: aconst_null
    //   5383: athrow
    //   5384: aconst_null
    //   5385: athrow
    //   5386: aconst_null
    //   5387: athrow
    //   5388: aconst_null
    //   5389: athrow
    //   5390: aconst_null
    //   5391: athrow
    //   5392: aconst_null
    //   5393: athrow
    //   5394: aconst_null
    //   5395: athrow
    //   5396: aconst_null
    //   5397: athrow
    //   5398: aconst_null
    //   5399: athrow
    //   5400: aconst_null
    //   5401: athrow
    //   5402: aconst_null
    //   5403: athrow
    //   5404: aconst_null
    //   5405: athrow
    //   5406: aconst_null
    //   5407: athrow
    //   5408: aconst_null
    //   5409: athrow
    //   5410: aconst_null
    //   5411: athrow
    //   5412: aconst_null
    //   5413: athrow
    //   5414: aconst_null
    //   5415: athrow
    //   5416: aconst_null
    //   5417: athrow
    //   5418: aconst_null
    //   5419: athrow
    //   5420: pop
    //   5421: goto -> 24
    //   5424: pop
    //   5425: aconst_null
    //   5426: goto -> 5420
    //   5429: dup
    //   5430: ifnull -> 5420
    //   5433: checkcast java/lang/Throwable
    //   5436: athrow
    //   5437: dup
    //   5438: ifnull -> 5424
    //   5441: checkcast java/lang/Throwable
    //   5444: athrow
    //   5445: aconst_null
    //   5446: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	5256	0	this	Lbigname/zprestige/webhack/features/modules/Player/Speedmine;
    // Exception table:
    //   from	to	target	type
    //   8	20	5429	finally
    //   659	666	666	finally
    //   659	666	659	finally
    //   659	666	659	java/lang/RuntimeException
    //   659	666	666	finally
    //   660	666	659	java/lang/StringIndexOutOfBoundsException
    //   855	862	862	finally
    //   855	862	862	java/lang/ArithmeticException
    //   855	862	855	finally
    //   856	862	855	finally
    //   856	862	3	finally
    //   931	938	938	finally
    //   932	938	931	finally
    //   932	938	931	java/lang/NegativeArraySizeException
    //   932	938	931	java/lang/RuntimeException
    //   932	938	3	finally
    //   1003	1010	1010	finally
    //   1003	1010	1010	java/lang/NumberFormatException
    //   1004	1010	1003	java/util/NoSuchElementException
    //   1004	1010	3	finally
    //   1004	1010	1003	finally
    //   1687	1694	1694	finally
    //   1688	1694	1694	java/lang/NullPointerException
    //   1688	1694	1687	finally
    //   1688	1694	3	finally
    //   1688	1694	1694	java/lang/UnsupportedOperationException
    //   1763	1770	1770	finally
    //   1763	1770	1770	java/lang/StringIndexOutOfBoundsException
    //   1763	1770	1763	finally
    //   1763	1770	1770	finally
    //   1764	1770	3	java/lang/IndexOutOfBoundsException
    //   2087	2094	2094	finally
    //   2087	2094	3	java/lang/RuntimeException
    //   2087	2094	3	finally
    //   2087	2094	2087	finally
    //   2088	2094	2087	java/lang/StringIndexOutOfBoundsException
    //   2163	2170	2170	finally
    //   2163	2170	3	java/lang/NegativeArraySizeException
    //   2163	2170	3	java/lang/IndexOutOfBoundsException
    //   2163	2170	3	finally
    //   2164	2170	2163	finally
    //   2347	2354	2354	finally
    //   2347	2354	2347	finally
    //   2347	2354	3	finally
    //   2347	2354	2354	java/lang/NegativeArraySizeException
    //   2347	2354	2354	java/lang/NullPointerException
    //   2735	2742	2742	finally
    //   2735	2742	2735	java/lang/IndexOutOfBoundsException
    //   2735	2742	2735	java/lang/RuntimeException
    //   2735	2742	2735	java/lang/ArithmeticException
    //   2736	2742	2735	finally
    //   2807	2814	2814	finally
    //   2807	2814	3	finally
    //   2807	2814	2807	finally
    //   2808	2814	3	java/lang/AssertionError
    //   2808	2814	2814	java/util/NoSuchElementException
    //   2879	2886	2886	finally
    //   2879	2886	2886	java/lang/IllegalStateException
    //   2880	2886	2886	java/lang/IndexOutOfBoundsException
    //   2880	2886	2879	java/lang/NumberFormatException
    //   2880	2886	2879	java/lang/IllegalArgumentException
    //   3204	3210	3210	finally
    //   3204	3210	3210	java/lang/ArrayIndexOutOfBoundsException
    //   3204	3210	3210	finally
    //   3204	3210	3210	finally
    //   3204	3210	3210	java/lang/IndexOutOfBoundsException
    //   3399	3406	3406	finally
    //   3399	3406	3	java/lang/IllegalArgumentException
    //   3399	3406	3	java/lang/EnumConstantNotPresentException
    //   3400	3406	3399	finally
    //   3400	3406	3399	java/lang/NumberFormatException
    //   3775	3782	3782	finally
    //   3775	3782	3	finally
    //   3775	3782	3775	java/lang/NullPointerException
    //   3775	3782	3782	java/lang/NumberFormatException
    //   3775	3782	3782	java/lang/NegativeArraySizeException
    //   3848	3856	3856	finally
    //   3848	3856	3856	java/lang/NegativeArraySizeException
    //   3848	3856	3	java/lang/AssertionError
    //   3848	3856	3856	java/lang/NullPointerException
    //   3848	3856	3	java/lang/ClassCastException
    //   4419	4426	4426	finally
    //   4419	4426	3	java/lang/NullPointerException
    //   4419	4426	4426	finally
    //   4419	4426	4419	finally
    //   4420	4426	3	finally
    //   4495	4502	4502	finally
    //   4496	4502	4495	java/lang/NumberFormatException
    //   4496	4502	4495	finally
    //   4496	4502	3	finally
    //   4496	4502	4495	java/lang/UnsupportedOperationException
    //   4744	4752	4752	finally
    //   4744	4752	3	finally
    //   4744	4752	4752	java/lang/ArithmeticException
    //   4744	4752	4752	java/lang/EnumConstantNotPresentException
    //   4744	4752	4752	java/util/NoSuchElementException
    //   5059	5066	5066	finally
    //   5059	5066	5066	java/lang/NegativeArraySizeException
    //   5060	5066	3	finally
    //   5060	5066	5059	java/lang/NegativeArraySizeException
    //   5060	5066	5059	finally
    //   5131	5138	5138	finally
    //   5131	5138	5138	java/lang/ArithmeticException
    //   5131	5138	5131	java/util/ConcurrentModificationException
    //   5131	5138	5131	finally
    //   5132	5138	5131	java/lang/IllegalArgumentException
    //   5271	5278	5278	finally
    //   5272	5278	5271	finally
    //   5272	5278	5278	java/lang/ArithmeticException
    //   5272	5278	5278	java/lang/RuntimeException
    //   5272	5278	5271	java/lang/NumberFormatException
    //   5429	5437	5429	java/lang/NumberFormatException
    //   5445	5447	3	finally
  }
  
  public Speedmine() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w 1319656111
    //   9: l2i
    //   10: ldc_w 433118238
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 910677082
    //   20: l2i
    //   21: ldc_w 947670825
    //   24: ixor
    //   25: ldc2_w 652630262
    //   28: l2i
    //   29: ldc_w -822341858
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1210206965 -> 17, -1084042919 -> 18472
    //   60: aload_0
    //   61: ldc_w '呭㌃吱㶲뫯๰⧽蹦'
    //   64: getstatic Perryc.1 : I
    //   67: ifeq -> 81
    //   70: ldc2_w -615515875
    //   73: l2i
    //   74: ldc_w -245636247
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w 229098841
    //   84: l2i
    //   85: ldc_w 566969605
    //   88: ixor
    //   89: ldc2_w 1449940117
    //   92: l2i
    //   93: ldc_w -731247707
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, -1475197628 -> 18360, 2067698431 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '呭㌃吱㶲뫱ู⧦蹳뽣ਮ馈煨㯛줼近'
    //   130: getstatic Perryc.c : I
    //   133: iflt -> 147
    //   136: ldc2_w 49454713
    //   139: l2i
    //   140: ldc_w -1953273571
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w 945277259
    //   150: l2i
    //   151: ldc_w -777360876
    //   154: ixor
    //   155: ldc2_w 1482632190
    //   158: l2i
    //   159: ldc_w -1093522746
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 192, 230911040 -> 147, 1877800540 -> 18522
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w -658621723
    //   204: l2i
    //   205: ldc_w -1280612663
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -850014151
    //   215: l2i
    //   216: ldc_w -1711046682
    //   219: ixor
    //   220: ldc2_w 718177335
    //   223: l2i
    //   224: ldc_w -342415683
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 18536, -1777398443 -> 256, -1437794650 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.PLAYER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w 959688029
    //   262: l2i
    //   263: ldc_w 959688028
    //   266: ixor
    //   267: ldc2_w 1351078131
    //   270: l2i
    //   271: ldc_w 1351078131
    //   274: ixor
    //   275: ldc2_w -666774193
    //   278: l2i
    //   279: ldc_w -666774193
    //   282: ixor
    //   283: getstatic Perryc.c : I
    //   286: iflt -> 300
    //   289: ldc2_w 157930945
    //   292: l2i
    //   293: ldc_w 1963413600
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 84427902
    //   303: l2i
    //   304: ldc_w 1713697050
    //   307: ixor
    //   308: ldc2_w -268691259
    //   311: l2i
    //   312: ldc_w -1162976314
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 18466, 691863202 -> 300, 914280039 -> 344
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.c : I
    //   350: iflt -> 364
    //   353: ldc2_w -1170041406
    //   356: l2i
    //   357: ldc_w -655315238
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -771152566
    //   367: l2i
    //   368: ldc_w -447495765
    //   371: ixor
    //   372: ldc2_w 1577448535
    //   375: l2i
    //   376: ldc_w -1513623939
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -1720704718 -> 18440, 1474439007 -> 364
    //   408: aload_0
    //   409: getstatic Perryc.c : I
    //   412: iflt -> 426
    //   415: ldc2_w -1569589231
    //   418: l2i
    //   419: ldc_w -1681932644
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w 1136397512
    //   429: l2i
    //   430: ldc_w 189750492
    //   433: ixor
    //   434: ldc2_w 918437660
    //   437: l2i
    //   438: ldc_w -1301061781
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -1123866886 -> 18330, 266912979 -> 426
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w '呬㌒吺㶰'
    //   476: getstatic Perryc.0 : I
    //   479: ifle -> 493
    //   482: ldc2_w -566072816
    //   485: l2i
    //   486: ldc_w 1182363206
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w -791038102
    //   496: l2i
    //   497: ldc_w 888053226
    //   500: ixor
    //   501: ldc2_w 1200885420
    //   504: l2i
    //   505: ldc_w -1983407050
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 18548, 711243802 -> 536, 1449694924 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc_w 0.010623037
    //   542: invokestatic floatToIntBits : (F)I
    //   545: ldc_w 2098072639
    //   548: ixor
    //   549: invokestatic intBitsToFloat : (I)F
    //   552: getstatic Perryc.1 : I
    //   555: ifeq -> 569
    //   558: ldc2_w 554076683
    //   561: l2i
    //   562: ldc_w -321698689
    //   565: ixor
    //   566: goto -> 577
    //   569: ldc2_w -1054783290
    //   572: l2i
    //   573: ldc_w -2076091282
    //   576: ixor
    //   577: ldc2_w -817142587
    //   580: l2i
    //   581: ldc_w 159005982
    //   584: ixor
    //   585: ixor
    //   586: lookupswitch default -> 18432, -2091823757 -> 612, 199530415 -> 569
    //   612: invokestatic valueOf : (F)Ljava/lang/Float;
    //   615: ldc_w 2.6135584E38
    //   618: invokestatic floatToIntBits : (F)I
    //   621: ldc_w 2135203662
    //   624: ixor
    //   625: invokestatic intBitsToFloat : (I)F
    //   628: getstatic Perryc.1 : I
    //   631: ifeq -> 645
    //   634: ldc2_w 109189959
    //   637: l2i
    //   638: ldc_w 1047379062
    //   641: ixor
    //   642: goto -> 653
    //   645: ldc2_w 1288317312
    //   648: l2i
    //   649: ldc_w 1041596576
    //   652: ixor
    //   653: ldc2_w 2053373347
    //   656: l2i
    //   657: ldc_w -1346159200
    //   660: ixor
    //   661: ixor
    //   662: lookupswitch default -> 688, -1466749350 -> 645, -313563342 -> 18408
    //   688: invokestatic valueOf : (F)Ljava/lang/Float;
    //   691: ldc_w 0.036135092
    //   694: invokestatic floatToIntBits : (F)I
    //   697: ldc_w 2136736356
    //   700: ixor
    //   701: invokestatic intBitsToFloat : (I)F
    //   704: getstatic Perryc.0 : I
    //   707: ifle -> 721
    //   710: ldc2_w 154616297
    //   713: l2i
    //   714: ldc_w -731786416
    //   717: ixor
    //   718: goto -> 729
    //   721: ldc2_w -1349100566
    //   724: l2i
    //   725: ldc_w -1425958844
    //   728: ixor
    //   729: ldc2_w 1452394239
    //   732: l2i
    //   733: ldc_w -1130213287
    //   736: ixor
    //   737: ixor
    //   738: lookupswitch default -> 18296, -291220216 -> 764, 929367071 -> 721
    //   764: invokestatic valueOf : (F)Ljava/lang/Float;
    //   767: getstatic Perryc.c : I
    //   770: iflt -> 784
    //   773: ldc2_w -230795671
    //   776: l2i
    //   777: ldc_w -564120063
    //   780: ixor
    //   781: goto -> 792
    //   784: ldc2_w 1529874293
    //   787: l2i
    //   788: ldc_w 54290140
    //   791: ixor
    //   792: ldc2_w 1721893851
    //   795: l2i
    //   796: ldc_w -71364051
    //   799: ixor
    //   800: ixor
    //   801: lookupswitch default -> 18218, -1320980066 -> 784, -988712865 -> 828
    //   828: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   831: getstatic Perryc.c : I
    //   834: iflt -> 848
    //   837: ldc2_w -1962993389
    //   840: l2i
    //   841: ldc_w -1103553829
    //   844: ixor
    //   845: goto -> 856
    //   848: ldc2_w -1479105642
    //   851: l2i
    //   852: ldc_w 1728877191
    //   855: ixor
    //   856: ldc2_w -1580937892
    //   859: l2i
    //   860: ldc_w -46851409
    //   863: ixor
    //   864: ixor
    //   865: lookupswitch default -> 892, 593534068 -> 848, 1748489275 -> 18564
    //   892: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   895: getstatic Perryc.0 : I
    //   898: ifle -> 912
    //   901: ldc2_w 182604164
    //   904: l2i
    //   905: ldc_w 617543208
    //   908: ixor
    //   909: goto -> 920
    //   912: ldc2_w -182260620
    //   915: l2i
    //   916: ldc_w 1870816147
    //   919: ixor
    //   920: ldc2_w 889257633
    //   923: l2i
    //   924: ldc_w -1527849901
    //   927: ixor
    //   928: ixor
    //   929: lookupswitch default -> 956, -1077770914 -> 18584, 1500265800 -> 912
    //   956: putfield range : Lbigname/zprestige/webhack/features/setting/Setting;
    //   959: getstatic Perryc.0 : I
    //   962: ifle -> 976
    //   965: ldc2_w -1358859438
    //   968: l2i
    //   969: ldc_w -1704114591
    //   972: ixor
    //   973: goto -> 984
    //   976: ldc2_w -1316894742
    //   979: l2i
    //   980: ldc_w -1326532803
    //   983: ixor
    //   984: ldc2_w 634009465
    //   987: l2i
    //   988: ldc_w -782935621
    //   991: ixor
    //   992: ixor
    //   993: lookupswitch default -> 18540, -1041015823 -> 976, -168813035 -> 1020
    //   1020: aload_0
    //   1021: new bigname/zprestige/webhack/util/Timer
    //   1024: dup
    //   1025: getstatic Perryc.0 : I
    //   1028: ifle -> 1042
    //   1031: ldc2_w -1789853761
    //   1034: l2i
    //   1035: ldc_w -870443609
    //   1038: ixor
    //   1039: goto -> 1050
    //   1042: ldc2_w -103759228
    //   1045: l2i
    //   1046: ldc_w -1162577271
    //   1049: ixor
    //   1050: ldc2_w 2092633610
    //   1053: l2i
    //   1054: ldc_w 216226852
    //   1057: ixor
    //   1058: ixor
    //   1059: lookupswitch default -> 1084, 642882196 -> 1042, 689354806 -> 18566
    //   1084: invokespecial <init> : ()V
    //   1087: getstatic Perryc.0 : I
    //   1090: ifle -> 1104
    //   1093: ldc2_w -1854221181
    //   1096: l2i
    //   1097: ldc_w 1413829737
    //   1100: ixor
    //   1101: goto -> 1112
    //   1104: ldc2_w 2090972315
    //   1107: l2i
    //   1108: ldc_w -720743918
    //   1111: ixor
    //   1112: ldc2_w 412089663
    //   1115: l2i
    //   1116: ldc_w -1098004297
    //   1119: ixor
    //   1120: ixor
    //   1121: lookupswitch default -> 18252, 262787841 -> 1148, 1664988514 -> 1104
    //   1148: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   1151: getstatic Perryc.1 : I
    //   1154: ifeq -> 1168
    //   1157: ldc2_w 1892448939
    //   1160: l2i
    //   1161: ldc_w 1437247870
    //   1164: ixor
    //   1165: goto -> 1176
    //   1168: ldc2_w 693569632
    //   1171: l2i
    //   1172: ldc_w -1834168532
    //   1175: ixor
    //   1176: ldc2_w 1778245044
    //   1179: l2i
    //   1180: ldc_w -851927351
    //   1183: ixor
    //   1184: ixor
    //   1185: lookupswitch default -> 18292, -2119987032 -> 1168, 524190769 -> 1212
    //   1212: aload_0
    //   1213: getstatic Perryc.1 : I
    //   1216: ifeq -> 1230
    //   1219: ldc2_w -440783450
    //   1222: l2i
    //   1223: ldc_w 202759985
    //   1226: ixor
    //   1227: goto -> 1238
    //   1230: ldc2_w -546365813
    //   1233: l2i
    //   1234: ldc_w -1851035975
    //   1237: ixor
    //   1238: ldc2_w -1438536477
    //   1241: l2i
    //   1242: ldc_w -704234340
    //   1245: ixor
    //   1246: ixor
    //   1247: lookupswitch default -> 18272, -1779932440 -> 1230, 847503437 -> 1272
    //   1272: aload_0
    //   1273: new bigname/zprestige/webhack/features/setting/Setting
    //   1276: dup
    //   1277: ldc_w '呪㌄吱㶶뫱'
    //   1280: getstatic Perryc.1 : I
    //   1283: ifeq -> 1297
    //   1286: ldc2_w 505525004
    //   1289: l2i
    //   1290: ldc_w -563392682
    //   1293: ixor
    //   1294: goto -> 1305
    //   1297: ldc2_w -1390268613
    //   1300: l2i
    //   1301: ldc_w -1261743780
    //   1304: ixor
    //   1305: ldc2_w -758862913
    //   1308: l2i
    //   1309: ldc_w 756661050
    //   1312: ixor
    //   1313: ixor
    //   1314: lookupswitch default -> 1340, 433708121 -> 1297, 1066921183 -> 18638
    //   1340: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1343: ldc2_w -1300882374
    //   1346: l2i
    //   1347: ldc_w -1300882373
    //   1350: ixor
    //   1351: getstatic Perryc.1 : I
    //   1354: ifeq -> 1368
    //   1357: ldc2_w -134150729
    //   1360: l2i
    //   1361: ldc_w 1067821913
    //   1364: ixor
    //   1365: goto -> 1376
    //   1368: ldc2_w 2068836303
    //   1371: l2i
    //   1372: ldc_w -297232640
    //   1375: ixor
    //   1376: ldc2_w -323896893
    //   1379: l2i
    //   1380: ldc_w -81580632
    //   1383: ixor
    //   1384: ixor
    //   1385: lookupswitch default -> 1412, -1020887717 -> 1368, -801752443 -> 18704
    //   1412: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1415: getstatic Perryc.0 : I
    //   1418: ifle -> 1432
    //   1421: ldc2_w -1319031979
    //   1424: l2i
    //   1425: ldc_w -1643667705
    //   1428: ixor
    //   1429: goto -> 1440
    //   1432: ldc2_w -127992625
    //   1435: l2i
    //   1436: ldc_w -67542448
    //   1439: ixor
    //   1440: ldc2_w 1144725407
    //   1443: l2i
    //   1444: ldc_w -2106200867
    //   1447: ixor
    //   1448: ixor
    //   1449: lookupswitch default -> 18336, -974557731 -> 1476, -383236336 -> 1432
    //   1476: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1479: getstatic Perryc.c : I
    //   1482: iflt -> 1496
    //   1485: ldc2_w 1425457430
    //   1488: l2i
    //   1489: ldc_w 2117471381
    //   1492: ixor
    //   1493: goto -> 1504
    //   1496: ldc2_w -1385368399
    //   1499: l2i
    //   1500: ldc_w 740581492
    //   1503: ixor
    //   1504: ldc2_w -1690622589
    //   1507: l2i
    //   1508: ldc_w -1413748835
    //   1511: ixor
    //   1512: ixor
    //   1513: lookupswitch default -> 1540, 440405917 -> 18618, 1285480915 -> 1496
    //   1540: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1543: getstatic Perryc.0 : I
    //   1546: ifle -> 1560
    //   1549: ldc2_w -1285737332
    //   1552: l2i
    //   1553: ldc_w 856240542
    //   1556: ixor
    //   1557: goto -> 1568
    //   1560: ldc2_w -364521011
    //   1563: l2i
    //   1564: ldc_w 1747388454
    //   1567: ixor
    //   1568: ldc2_w -1047078558
    //   1571: l2i
    //   1572: ldc_w 70079741
    //   1575: ixor
    //   1576: ixor
    //   1577: lookupswitch default -> 1604, -878003305 -> 1560, 1173325965 -> 18400
    //   1604: putfield tweaks : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1607: getstatic Perryc.c : I
    //   1610: iflt -> 1624
    //   1613: ldc2_w 1444919518
    //   1616: l2i
    //   1617: ldc_w -1429075049
    //   1620: ixor
    //   1621: goto -> 1632
    //   1624: ldc2_w 1018947171
    //   1627: l2i
    //   1628: ldc_w -147297001
    //   1631: ixor
    //   1632: ldc2_w 567227439
    //   1635: l2i
    //   1636: ldc_w 173920561
    //   1639: ixor
    //   1640: ixor
    //   1641: lookupswitch default -> 1668, -681617833 -> 18590, 677508244 -> 1624
    //   1668: aload_0
    //   1669: getstatic Perryc.0 : I
    //   1672: ifle -> 1686
    //   1675: ldc2_w -1386495237
    //   1678: l2i
    //   1679: ldc_w -2113542140
    //   1682: ixor
    //   1683: goto -> 1694
    //   1686: ldc2_w 501943145
    //   1689: l2i
    //   1690: ldc_w 1459394448
    //   1693: ixor
    //   1694: ldc2_w 1016968663
    //   1697: l2i
    //   1698: ldc_w -689146396
    //   1701: ixor
    //   1702: ixor
    //   1703: lookupswitch default -> 1728, -986715444 -> 18616, -633025823 -> 1686
    //   1728: aload_0
    //   1729: new bigname/zprestige/webhack/features/setting/Setting
    //   1732: dup
    //   1733: ldc_w '味㌜吰㶲'
    //   1736: getstatic Perryc.0 : I
    //   1739: ifle -> 1753
    //   1742: ldc2_w 1192810916
    //   1745: l2i
    //   1746: ldc_w -823106457
    //   1749: ixor
    //   1750: goto -> 1761
    //   1753: ldc2_w 793166399
    //   1756: l2i
    //   1757: ldc_w -2144325752
    //   1760: ixor
    //   1761: ldc2_w 551545623
    //   1764: l2i
    //   1765: ldc_w 1777846796
    //   1768: ixor
    //   1769: ixor
    //   1770: lookupswitch default -> 18586, -1061118760 -> 1753, -429994836 -> 1796
    //   1796: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1799: getstatic Perryc.0 : I
    //   1802: ifle -> 1816
    //   1805: ldc2_w -1344140282
    //   1808: l2i
    //   1809: ldc_w 1639278361
    //   1812: ixor
    //   1813: goto -> 1824
    //   1816: ldc2_w -356667704
    //   1819: l2i
    //   1820: ldc_w -2048828848
    //   1823: ixor
    //   1824: ldc2_w 1061113280
    //   1827: l2i
    //   1828: ldc_w -1623270048
    //   1831: ixor
    //   1832: ixor
    //   1833: lookupswitch default -> 1860, 247861208 -> 1816, 1851194303 -> 18606
    //   1860: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine$Mode.PACKET : Lbigname/zprestige/webhack/features/modules/Player/Speedmine$Mode;
    //   1863: getstatic Perryc.c : I
    //   1866: iflt -> 1880
    //   1869: ldc2_w 1140362326
    //   1872: l2i
    //   1873: ldc_w -821826455
    //   1876: ixor
    //   1877: goto -> 1888
    //   1880: ldc2_w 813304566
    //   1883: l2i
    //   1884: ldc_w 1289050034
    //   1887: ixor
    //   1888: ldc2_w 622703720
    //   1891: l2i
    //   1892: ldc_w -801471908
    //   1895: ixor
    //   1896: ixor
    //   1897: lookupswitch default -> 18370, -1987548304 -> 1924, 2044483083 -> 1880
    //   1924: aload_0
    //   1925: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   1930: getstatic Perryc.c : I
    //   1933: iflt -> 1947
    //   1936: ldc2_w 653385668
    //   1939: l2i
    //   1940: ldc_w -1022669635
    //   1943: ixor
    //   1944: goto -> 1955
    //   1947: ldc2_w 859789050
    //   1950: l2i
    //   1951: ldc_w -1490489572
    //   1954: ixor
    //   1955: ldc2_w 1737888169
    //   1958: l2i
    //   1959: ldc_w -2077093949
    //   1962: ixor
    //   1963: ixor
    //   1964: lookupswitch default -> 1992, 106859795 -> 18394, 528828635 -> 1947
    //   1992: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   1995: getstatic Perryc.0 : I
    //   1998: ifle -> 2012
    //   2001: ldc2_w 1316773032
    //   2004: l2i
    //   2005: ldc_w -1446974667
    //   2008: ixor
    //   2009: goto -> 2020
    //   2012: ldc2_w -498645025
    //   2015: l2i
    //   2016: ldc_w 239242637
    //   2019: ixor
    //   2020: ldc2_w -799877252
    //   2023: l2i
    //   2024: ldc_w 1044339875
    //   2027: ixor
    //   2028: ixor
    //   2029: lookupswitch default -> 18468, 40386957 -> 2056, 164707394 -> 2012
    //   2056: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2059: getstatic Perryc.1 : I
    //   2062: ifeq -> 2076
    //   2065: ldc2_w 428023211
    //   2068: l2i
    //   2069: ldc_w -1863803125
    //   2072: ixor
    //   2073: goto -> 2084
    //   2076: ldc2_w 1695228804
    //   2079: l2i
    //   2080: ldc_w -138513953
    //   2083: ixor
    //   2084: ldc2_w 903757311
    //   2087: l2i
    //   2088: ldc_w 579100321
    //   2091: ixor
    //   2092: ixor
    //   2093: lookupswitch default -> 2120, -1640898050 -> 18396, -639610962 -> 2076
    //   2120: putfield mode : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2123: getstatic Perryc.c : I
    //   2126: iflt -> 2140
    //   2129: ldc2_w 1723771559
    //   2132: l2i
    //   2133: ldc_w -1137205342
    //   2136: ixor
    //   2137: goto -> 2148
    //   2140: ldc2_w 745696561
    //   2143: l2i
    //   2144: ldc_w 697268880
    //   2147: ixor
    //   2148: ldc2_w 1478645853
    //   2151: l2i
    //   2152: ldc_w -471287404
    //   2155: ixor
    //   2156: ixor
    //   2157: lookupswitch default -> 18656, -1103628696 -> 2184, 1631835340 -> 2140
    //   2184: aload_0
    //   2185: getstatic Perryc.0 : I
    //   2188: ifle -> 2202
    //   2191: ldc2_w -1646454644
    //   2194: l2i
    //   2195: ldc_w -1851099859
    //   2198: ixor
    //   2199: goto -> 2210
    //   2202: ldc2_w 459126017
    //   2205: l2i
    //   2206: ldc_w -1004298634
    //   2209: ixor
    //   2210: ldc2_w -638800014
    //   2213: l2i
    //   2214: ldc_w -455641147
    //   2217: ixor
    //   2218: ixor
    //   2219: lookupswitch default -> 18646, -498732096 -> 2244, 827110678 -> 2202
    //   2244: aload_0
    //   2245: new bigname/zprestige/webhack/features/setting/Setting
    //   2248: dup
    //   2249: ldc_w '呬㌖吧㶲'
    //   2252: getstatic Perryc.0 : I
    //   2255: ifle -> 2269
    //   2258: ldc2_w -1858035061
    //   2261: l2i
    //   2262: ldc_w 78889194
    //   2265: ixor
    //   2266: goto -> 2277
    //   2269: ldc2_w 1950231127
    //   2272: l2i
    //   2273: ldc_w -1190714848
    //   2276: ixor
    //   2277: ldc2_w 1553520939
    //   2280: l2i
    //   2281: ldc_w 1566857539
    //   2284: ixor
    //   2285: ixor
    //   2286: lookupswitch default -> 2312, -1810898423 -> 18384, 703309369 -> 2269
    //   2312: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2315: ldc2_w -2123576843
    //   2318: l2i
    //   2319: ldc_w -2123576844
    //   2322: ixor
    //   2323: getstatic Perryc.1 : I
    //   2326: ifeq -> 2340
    //   2329: ldc2_w 376907668
    //   2332: l2i
    //   2333: ldc_w 1199410391
    //   2336: ixor
    //   2337: goto -> 2348
    //   2340: ldc2_w 1074352895
    //   2343: l2i
    //   2344: ldc_w -144422682
    //   2347: ixor
    //   2348: ldc2_w 1417217670
    //   2351: l2i
    //   2352: ldc_w 858282390
    //   2355: ixor
    //   2356: ixor
    //   2357: lookupswitch default -> 18578, -801356535 -> 2384, 911995987 -> 2340
    //   2384: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   2387: getstatic Perryc.1 : I
    //   2390: ifeq -> 2404
    //   2393: ldc2_w 1577215661
    //   2396: l2i
    //   2397: ldc_w -1989346837
    //   2400: ixor
    //   2401: goto -> 2412
    //   2404: ldc2_w 20645336
    //   2407: l2i
    //   2408: ldc_w 678810465
    //   2411: ixor
    //   2412: ldc2_w 1321889598
    //   2415: l2i
    //   2416: ldc_w 1111627062
    //   2419: ixor
    //   2420: ixor
    //   2421: lookupswitch default -> 2448, -605625010 -> 18492, -346450120 -> 2404
    //   2448: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   2451: getstatic Perryc.0 : I
    //   2454: ifle -> 2468
    //   2457: ldc2_w -966169442
    //   2460: l2i
    //   2461: ldc_w -542926844
    //   2464: ixor
    //   2465: goto -> 2476
    //   2468: ldc2_w -804006442
    //   2471: l2i
    //   2472: ldc_w -288081029
    //   2475: ixor
    //   2476: ldc2_w 4146282
    //   2479: l2i
    //   2480: ldc_w 795868846
    //   2483: ixor
    //   2484: ixor
    //   2485: lookupswitch default -> 18198, 295130217 -> 2512, 916082270 -> 2468
    //   2512: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   2515: getstatic Perryc.0 : I
    //   2518: ifle -> 2532
    //   2521: ldc2_w -820780722
    //   2524: l2i
    //   2525: ldc_w -2120205490
    //   2528: ixor
    //   2529: goto -> 2540
    //   2532: ldc2_w -2131028974
    //   2535: l2i
    //   2536: ldc_w -629013156
    //   2539: ixor
    //   2540: ldc2_w 1438201406
    //   2543: l2i
    //   2544: ldc_w 1841045470
    //   2547: ixor
    //   2548: ixor
    //   2549: lookupswitch default -> 18552, 1652308142 -> 2576, 1991701472 -> 2532
    //   2576: putfield reset : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2579: getstatic Perryc.0 : I
    //   2582: ifle -> 2596
    //   2585: ldc2_w -829695065
    //   2588: l2i
    //   2589: ldc_w 132635874
    //   2592: ixor
    //   2593: goto -> 2604
    //   2596: ldc2_w -198987142
    //   2599: l2i
    //   2600: ldc_w 142900729
    //   2603: ixor
    //   2604: ldc2_w 443655561
    //   2607: l2i
    //   2608: ldc_w -378235149
    //   2611: ixor
    //   2612: ixor
    //   2613: lookupswitch default -> 18426, 262339833 -> 2640, 979973183 -> 2596
    //   2640: aload_0
    //   2641: getstatic Perryc.0 : I
    //   2644: ifle -> 2658
    //   2647: ldc2_w -1174635612
    //   2650: l2i
    //   2651: ldc_w -1043753339
    //   2654: ixor
    //   2655: goto -> 2666
    //   2658: ldc2_w 230065543
    //   2661: l2i
    //   2662: ldc_w 179719690
    //   2665: ixor
    //   2666: ldc2_w 2086530348
    //   2669: l2i
    //   2670: ldc_w 1975288262
    //   2673: ixor
    //   2674: ixor
    //   2675: lookupswitch default -> 18236, 249669479 -> 2700, 1909752267 -> 2658
    //   2700: aload_0
    //   2701: new bigname/zprestige/webhack/features/setting/Setting
    //   2704: dup
    //   2705: ldc_w '呺㌒吹㶶뫧'
    //   2708: getstatic Perryc.1 : I
    //   2711: ifeq -> 2725
    //   2714: ldc2_w -649996024
    //   2717: l2i
    //   2718: ldc_w -808823354
    //   2721: ixor
    //   2722: goto -> 2733
    //   2725: ldc2_w 723181936
    //   2728: l2i
    //   2729: ldc_w 562859284
    //   2732: ixor
    //   2733: ldc2_w 1472502953
    //   2736: l2i
    //   2737: ldc_w -1854691152
    //   2740: ixor
    //   2741: ixor
    //   2742: lookupswitch default -> 18506, -870229891 -> 2768, -801326889 -> 2725
    //   2768: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   2771: ldc_w 114.36575
    //   2774: invokestatic floatToIntBits : (F)I
    //   2777: ldc_w 2111277175
    //   2780: ixor
    //   2781: invokestatic intBitsToFloat : (I)F
    //   2784: getstatic Perryc.1 : I
    //   2787: ifeq -> 2801
    //   2790: ldc2_w -2100761366
    //   2793: l2i
    //   2794: ldc_w 811123323
    //   2797: ixor
    //   2798: goto -> 2809
    //   2801: ldc2_w -1587245098
    //   2804: l2i
    //   2805: ldc_w -1180960819
    //   2808: ixor
    //   2809: ldc2_w 2070365426
    //   2812: l2i
    //   2813: ldc_w 1999862124
    //   2816: ixor
    //   2817: ixor
    //   2818: lookupswitch default -> 2844, -1094446321 -> 18442, 1260871405 -> 2801
    //   2844: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2847: ldc_w 1.6346163E38
    //   2850: invokestatic floatToIntBits : (F)I
    //   2853: ldc_w 2130047777
    //   2856: ixor
    //   2857: invokestatic intBitsToFloat : (I)F
    //   2860: getstatic Perryc.c : I
    //   2863: iflt -> 2877
    //   2866: ldc2_w 137379725
    //   2869: l2i
    //   2870: ldc_w -1990080377
    //   2873: ixor
    //   2874: goto -> 2885
    //   2877: ldc2_w -909992556
    //   2880: l2i
    //   2881: ldc_w -538033469
    //   2884: ixor
    //   2885: ldc2_w 1148326073
    //   2888: l2i
    //   2889: ldc_w 615478742
    //   2892: ixor
    //   2893: ixor
    //   2894: lookupswitch default -> 18340, -510881179 -> 2877, 1995553336 -> 2920
    //   2920: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2923: ldc_w 25.89565
    //   2926: invokestatic floatToIntBits : (F)I
    //   2929: ldc_w 2119117387
    //   2932: ixor
    //   2933: invokestatic intBitsToFloat : (I)F
    //   2936: getstatic Perryc.1 : I
    //   2939: ifeq -> 2953
    //   2942: ldc2_w -1264128385
    //   2945: l2i
    //   2946: ldc_w 1337498023
    //   2949: ixor
    //   2950: goto -> 2961
    //   2953: ldc2_w 1577030815
    //   2956: l2i
    //   2957: ldc_w 116329294
    //   2960: ixor
    //   2961: ldc2_w -1887763551
    //   2964: l2i
    //   2965: ldc_w 804505491
    //   2968: ixor
    //   2969: ixor
    //   2970: lookupswitch default -> 2996, -1200984179 -> 2953, 1536603114 -> 18354
    //   2996: invokestatic valueOf : (F)Ljava/lang/Float;
    //   2999: getstatic Perryc.0 : I
    //   3002: ifle -> 3016
    //   3005: ldc2_w -2038105708
    //   3008: l2i
    //   3009: ldc_w 1709507173
    //   3012: ixor
    //   3013: goto -> 3024
    //   3016: ldc2_w 505621071
    //   3019: l2i
    //   3020: ldc_w 48043457
    //   3023: ixor
    //   3024: ldc2_w -447108733
    //   3027: l2i
    //   3028: ldc_w 923595352
    //   3031: ixor
    //   3032: ixor
    //   3033: lookupswitch default -> 3060, 51127062 -> 3016, 825532458 -> 18226
    //   3060: aload_0
    //   3061: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   3066: getstatic Perryc.0 : I
    //   3069: ifle -> 3083
    //   3072: ldc2_w 1601781236
    //   3075: l2i
    //   3076: ldc_w 1164495967
    //   3079: ixor
    //   3080: goto -> 3091
    //   3083: ldc2_w -278558670
    //   3086: l2i
    //   3087: ldc_w 727000526
    //   3090: ixor
    //   3091: ldc2_w -558064112
    //   3094: l2i
    //   3095: ldc_w 2065296827
    //   3098: ixor
    //   3099: ixor
    //   3100: lookupswitch default -> 3128, -1791861782 -> 3083, -1078689280 -> 18592
    //   3128: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   3131: getstatic Perryc.c : I
    //   3134: iflt -> 3148
    //   3137: ldc2_w -1115373557
    //   3140: l2i
    //   3141: ldc_w 1934804898
    //   3144: ixor
    //   3145: goto -> 3156
    //   3148: ldc2_w 1942687925
    //   3151: l2i
    //   3152: ldc_w -2109712209
    //   3155: ixor
    //   3156: ldc2_w 1396445745
    //   3159: l2i
    //   3160: ldc_w 822381608
    //   3163: ixor
    //   3164: ixor
    //   3165: lookupswitch default -> 3192, -1393649232 -> 18610, 1020236110 -> 3148
    //   3192: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3195: getstatic Perryc.c : I
    //   3198: iflt -> 3212
    //   3201: ldc2_w 1571178976
    //   3204: l2i
    //   3205: ldc_w -503015540
    //   3208: ixor
    //   3209: goto -> 3220
    //   3212: ldc2_w 1568750587
    //   3215: l2i
    //   3216: ldc_w 1682223373
    //   3219: ixor
    //   3220: ldc2_w 1138392496
    //   3223: l2i
    //   3224: ldc_w 1571868355
    //   3227: ixor
    //   3228: ixor
    //   3229: lookupswitch default -> 3256, -1580700385 -> 18568, -530168168 -> 3212
    //   3256: putfield damage : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3259: getstatic Perryc.1 : I
    //   3262: ifeq -> 3276
    //   3265: ldc2_w -1423074683
    //   3268: l2i
    //   3269: ldc_w 766361542
    //   3272: ixor
    //   3273: goto -> 3284
    //   3276: ldc2_w -410220058
    //   3279: l2i
    //   3280: ldc_w -2057829943
    //   3283: ixor
    //   3284: ldc2_w -1557258048
    //   3287: l2i
    //   3288: ldc_w -339008852
    //   3291: ixor
    //   3292: ixor
    //   3293: lookupswitch default -> 18598, -832231633 -> 3276, 707889731 -> 3320
    //   3320: aload_0
    //   3321: getstatic Perryc.1 : I
    //   3324: ifeq -> 3338
    //   3327: ldc2_w -192190109
    //   3330: l2i
    //   3331: ldc_w -304214482
    //   3334: ixor
    //   3335: goto -> 3346
    //   3338: ldc2_w 506760407
    //   3341: l2i
    //   3342: ldc_w 1243944498
    //   3345: ixor
    //   3346: ldc2_w 53368250
    //   3349: l2i
    //   3350: ldc_w -2091335650
    //   3353: ixor
    //   3354: ixor
    //   3355: lookupswitch default -> 3380, -1725697303 -> 18554, 1968199817 -> 3338
    //   3380: aload_0
    //   3381: new bigname/zprestige/webhack/features/setting/Setting
    //   3384: dup
    //   3385: ldc_w '呰㌜吖㶥뫣๲⧒蹭뼪'
    //   3388: getstatic Perryc.c : I
    //   3391: iflt -> 3405
    //   3394: ldc2_w 1376948327
    //   3397: l2i
    //   3398: ldc_w -1814230979
    //   3401: ixor
    //   3402: goto -> 3413
    //   3405: ldc2_w 1516417386
    //   3408: l2i
    //   3409: ldc_w -715823234
    //   3412: ixor
    //   3413: ldc2_w 1863651784
    //   3416: l2i
    //   3417: ldc_w 819487497
    //   3420: ixor
    //   3421: ixor
    //   3422: lookupswitch default -> 18288, -1643976037 -> 3405, -788880171 -> 3448
    //   3448: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3451: ldc2_w -193732821
    //   3454: l2i
    //   3455: ldc_w -193732821
    //   3458: ixor
    //   3459: getstatic Perryc.1 : I
    //   3462: ifeq -> 3476
    //   3465: ldc2_w 175277315
    //   3468: l2i
    //   3469: ldc_w 1723180719
    //   3472: ixor
    //   3473: goto -> 3484
    //   3476: ldc2_w -957903437
    //   3479: l2i
    //   3480: ldc_w -869336906
    //   3483: ixor
    //   3484: ldc2_w -412425424
    //   3487: l2i
    //   3488: ldc_w 1050951512
    //   3491: ixor
    //   3492: ixor
    //   3493: lookupswitch default -> 18576, -1257635900 -> 3476, -754472595 -> 3520
    //   3520: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3523: getstatic Perryc.0 : I
    //   3526: ifle -> 3540
    //   3529: ldc2_w 1244567898
    //   3532: l2i
    //   3533: ldc_w -1590603929
    //   3536: ixor
    //   3537: goto -> 3548
    //   3540: ldc2_w 1693574711
    //   3543: l2i
    //   3544: ldc_w -1407251081
    //   3547: ixor
    //   3548: ldc2_w -122721200
    //   3551: l2i
    //   3552: ldc_w 1396870092
    //   3555: ixor
    //   3556: ixor
    //   3557: lookupswitch default -> 18634, 1089614241 -> 3540, 1661144284 -> 3584
    //   3584: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   3587: getstatic Perryc.0 : I
    //   3590: ifle -> 3604
    //   3593: ldc2_w 470655031
    //   3596: l2i
    //   3597: ldc_w 1117543996
    //   3600: ixor
    //   3601: goto -> 3612
    //   3604: ldc2_w -87039739
    //   3607: l2i
    //   3608: ldc_w -257454946
    //   3611: ixor
    //   3612: ldc2_w -1997686216
    //   3615: l2i
    //   3616: ldc_w -81468459
    //   3619: ixor
    //   3620: ixor
    //   3621: lookupswitch default -> 18484, 760784870 -> 3604, 2040607862 -> 3648
    //   3648: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   3651: getstatic Perryc.1 : I
    //   3654: ifeq -> 3668
    //   3657: ldc2_w -427360174
    //   3660: l2i
    //   3661: ldc_w 624471473
    //   3664: ixor
    //   3665: goto -> 3676
    //   3668: ldc2_w 1675495558
    //   3671: l2i
    //   3672: ldc_w 849035147
    //   3675: ixor
    //   3676: ldc2_w 1706604852
    //   3679: l2i
    //   3680: ldc_w -2035860776
    //   3683: ixor
    //   3684: ixor
    //   3685: lookupswitch default -> 3712, -7113915 -> 3668, 547368463 -> 18630
    //   3712: putfield noBreakAnim : Lbigname/zprestige/webhack/features/setting/Setting;
    //   3715: getstatic Perryc.1 : I
    //   3718: ifeq -> 3732
    //   3721: ldc2_w -1386459771
    //   3724: l2i
    //   3725: ldc_w 1154712667
    //   3728: ixor
    //   3729: goto -> 3740
    //   3732: ldc2_w -1352670200
    //   3735: l2i
    //   3736: ldc_w 1628536376
    //   3739: ixor
    //   3740: ldc2_w 2025998391
    //   3743: l2i
    //   3744: ldc_w 1300631089
    //   3747: ixor
    //   3748: ixor
    //   3749: lookupswitch default -> 3776, -590639144 -> 18412, 227993982 -> 3732
    //   3776: aload_0
    //   3777: getstatic Perryc.0 : I
    //   3780: ifle -> 3794
    //   3783: ldc2_w 2044951591
    //   3786: l2i
    //   3787: ldc_w 908620084
    //   3790: ixor
    //   3791: goto -> 3802
    //   3794: ldc2_w 573561633
    //   3797: l2i
    //   3798: ldc_w -35078725
    //   3801: ixor
    //   3802: ldc2_w 506581693
    //   3805: l2i
    //   3806: ldc_w -1389498034
    //   3809: ixor
    //   3810: ixor
    //   3811: lookupswitch default -> 18686, -53006624 -> 3794, 1826309481 -> 3836
    //   3836: aload_0
    //   3837: new bigname/zprestige/webhack/features/setting/Setting
    //   3840: dup
    //   3841: ldc_w '呰㌜吐㶲뫣๠'
    //   3844: getstatic Perryc.1 : I
    //   3847: ifeq -> 3861
    //   3850: ldc2_w 30037444
    //   3853: l2i
    //   3854: ldc_w 1692233457
    //   3857: ixor
    //   3858: goto -> 3869
    //   3861: ldc2_w -879208151
    //   3864: l2i
    //   3865: ldc_w -1232678487
    //   3868: ixor
    //   3869: ldc2_w -2001525603
    //   3872: l2i
    //   3873: ldc_w 1856796395
    //   3876: ixor
    //   3877: ixor
    //   3878: lookupswitch default -> 18594, -2096600765 -> 3861, -1694377226 -> 3904
    //   3904: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3907: ldc2_w 1499260051
    //   3910: l2i
    //   3911: ldc_w 1499260051
    //   3914: ixor
    //   3915: getstatic Perryc.c : I
    //   3918: iflt -> 3932
    //   3921: ldc2_w -1806581486
    //   3924: l2i
    //   3925: ldc_w -1900983440
    //   3928: ixor
    //   3929: goto -> 3940
    //   3932: ldc2_w -1381814275
    //   3935: l2i
    //   3936: ldc_w 1286157677
    //   3939: ixor
    //   3940: ldc2_w -1021270649
    //   3943: l2i
    //   3944: ldc_w 1833593237
    //   3947: ixor
    //   3948: ixor
    //   3949: lookupswitch default -> 18640, -1266006416 -> 3932, 1331746434 -> 3976
    //   3976: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   3979: getstatic Perryc.c : I
    //   3982: iflt -> 3996
    //   3985: ldc2_w 2071146028
    //   3988: l2i
    //   3989: ldc_w 1845499829
    //   3992: ixor
    //   3993: goto -> 4004
    //   3996: ldc2_w -390299081
    //   3999: l2i
    //   4000: ldc_w -177518538
    //   4003: ixor
    //   4004: ldc2_w -1582127036
    //   4007: l2i
    //   4008: ldc_w 764924723
    //   4011: ixor
    //   4012: ixor
    //   4013: lookupswitch default -> 18658, -1846365834 -> 4040, -1722400018 -> 3996
    //   4040: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   4043: getstatic Perryc.c : I
    //   4046: iflt -> 4060
    //   4049: ldc2_w -933636200
    //   4052: l2i
    //   4053: ldc_w -383714035
    //   4056: ixor
    //   4057: goto -> 4068
    //   4060: ldc2_w -1322040168
    //   4063: l2i
    //   4064: ldc_w -935231976
    //   4067: ixor
    //   4068: ldc2_w 527292925
    //   4071: l2i
    //   4072: ldc_w -496878753
    //   4075: ixor
    //   4076: ixor
    //   4077: lookupswitch default -> 4104, -596195273 -> 18464, 1882597279 -> 4060
    //   4104: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4107: getstatic Perryc.1 : I
    //   4110: ifeq -> 4124
    //   4113: ldc2_w 1725008001
    //   4116: l2i
    //   4117: ldc_w 1352097013
    //   4120: ixor
    //   4121: goto -> 4132
    //   4124: ldc2_w 853157937
    //   4127: l2i
    //   4128: ldc_w 1577907815
    //   4131: ixor
    //   4132: ldc2_w -1152556656
    //   4135: l2i
    //   4136: ldc_w 2040155523
    //   4139: ixor
    //   4140: ixor
    //   4141: lookupswitch default -> 18650, -1375604155 -> 4168, -191760281 -> 4124
    //   4168: putfield noDelay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4171: getstatic Perryc.0 : I
    //   4174: ifle -> 4188
    //   4177: ldc2_w 112772604
    //   4180: l2i
    //   4181: ldc_w 959926088
    //   4184: ixor
    //   4185: goto -> 4196
    //   4188: ldc2_w 925836849
    //   4191: l2i
    //   4192: ldc_w -918618110
    //   4195: ixor
    //   4196: ldc2_w 748420807
    //   4199: l2i
    //   4200: ldc_w -2004433049
    //   4203: ixor
    //   4204: ixor
    //   4205: lookupswitch default -> 4232, -1684884716 -> 18254, 1156639663 -> 4188
    //   4232: aload_0
    //   4233: getstatic Perryc.0 : I
    //   4236: ifle -> 4250
    //   4239: ldc2_w -326073471
    //   4242: l2i
    //   4243: ldc_w -1163551342
    //   4246: ixor
    //   4247: goto -> 4258
    //   4250: ldc2_w -1342779024
    //   4253: l2i
    //   4254: ldc_w 784730212
    //   4257: ixor
    //   4258: ldc2_w -603480188
    //   4261: l2i
    //   4262: ldc_w 1973996735
    //   4265: ixor
    //   4266: ixor
    //   4267: lookupswitch default -> 4292, -1082307634 -> 4250, -6664920 -> 18386
    //   4292: aload_0
    //   4293: new bigname/zprestige/webhack/features/setting/Setting
    //   4296: dup
    //   4297: ldc_w '呰㌜吇㶠뫬๾'
    //   4300: getstatic Perryc.1 : I
    //   4303: ifeq -> 4317
    //   4306: ldc2_w 1748855442
    //   4309: l2i
    //   4310: ldc_w -2043629306
    //   4313: ixor
    //   4314: goto -> 4325
    //   4317: ldc2_w -332373771
    //   4320: l2i
    //   4321: ldc_w 1107788681
    //   4324: ixor
    //   4325: ldc2_w 1755197411
    //   4328: l2i
    //   4329: ldc_w 920773807
    //   4332: ixor
    //   4333: ixor
    //   4334: lookupswitch default -> 4360, -1334701864 -> 18430, 1523465153 -> 4317
    //   4360: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4363: ldc2_w 910538423
    //   4366: l2i
    //   4367: ldc_w 910538423
    //   4370: ixor
    //   4371: getstatic Perryc.1 : I
    //   4374: ifeq -> 4388
    //   4377: ldc2_w -384874509
    //   4380: l2i
    //   4381: ldc_w 1404939536
    //   4384: ixor
    //   4385: goto -> 4396
    //   4388: ldc2_w 889978644
    //   4391: l2i
    //   4392: ldc_w 2140495896
    //   4395: ixor
    //   4396: ldc2_w 343204364
    //   4399: l2i
    //   4400: ldc_w 31798780
    //   4403: ixor
    //   4404: ixor
    //   4405: lookupswitch default -> 4432, -1356645101 -> 18348, 1727173060 -> 4388
    //   4432: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4435: getstatic Perryc.1 : I
    //   4438: ifeq -> 4452
    //   4441: ldc2_w -1164034510
    //   4444: l2i
    //   4445: ldc_w 577356935
    //   4448: ixor
    //   4449: goto -> 4460
    //   4452: ldc2_w -923486771
    //   4455: l2i
    //   4456: ldc_w 1882796125
    //   4459: ixor
    //   4460: ldc2_w -1751312447
    //   4463: l2i
    //   4464: ldc_w -2057624781
    //   4467: ixor
    //   4468: ixor
    //   4469: lookupswitch default -> 4496, -1976447417 -> 18510, -63732617 -> 4452
    //   4496: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   4499: getstatic Perryc.0 : I
    //   4502: ifle -> 4516
    //   4505: ldc2_w 1021118324
    //   4508: l2i
    //   4509: ldc_w -673275306
    //   4512: ixor
    //   4513: goto -> 4524
    //   4516: ldc2_w 1976884292
    //   4519: l2i
    //   4520: ldc_w 1481253063
    //   4523: ixor
    //   4524: ldc2_w -1666215389
    //   4527: l2i
    //   4528: ldc_w -420881099
    //   4531: ixor
    //   4532: ixor
    //   4533: lookupswitch default -> 4560, -1857689036 -> 18258, -1767032116 -> 4516
    //   4560: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   4563: getstatic Perryc.c : I
    //   4566: iflt -> 4580
    //   4569: ldc2_w 1652900935
    //   4572: l2i
    //   4573: ldc_w 1217988810
    //   4576: ixor
    //   4577: goto -> 4588
    //   4580: ldc2_w 1829940185
    //   4583: l2i
    //   4584: ldc_w -749427041
    //   4587: ixor
    //   4588: ldc2_w 3432198
    //   4591: l2i
    //   4592: ldc_w 1472602623
    //   4595: ixor
    //   4596: ixor
    //   4597: lookupswitch default -> 4624, -1204869474 -> 4580, 2112762484 -> 18298
    //   4624: putfield noSwing : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4627: getstatic Perryc.0 : I
    //   4630: ifle -> 4644
    //   4633: ldc2_w 1977314792
    //   4636: l2i
    //   4637: ldc_w 1301641983
    //   4640: ixor
    //   4641: goto -> 4652
    //   4644: ldc2_w -1097715111
    //   4647: l2i
    //   4648: ldc_w -1306107146
    //   4651: ixor
    //   4652: ldc2_w 102239210
    //   4655: l2i
    //   4656: ldc_w -938244072
    //   4659: ixor
    //   4660: ixor
    //   4661: lookupswitch default -> 18366, -1027615907 -> 4688, -163212059 -> 4644
    //   4688: aload_0
    //   4689: getstatic Perryc.c : I
    //   4692: iflt -> 4706
    //   4695: ldc2_w -1207724627
    //   4698: l2i
    //   4699: ldc_w -1009105503
    //   4702: ixor
    //   4703: goto -> 4714
    //   4706: ldc2_w 153671262
    //   4709: l2i
    //   4710: ldc_w 1988029630
    //   4713: ixor
    //   4714: ldc2_w -1730382596
    //   4717: l2i
    //   4718: ldc_w -1654534156
    //   4721: ixor
    //   4722: ixor
    //   4723: lookupswitch default -> 4748, -638651330 -> 4706, 2120510212 -> 18636
    //   4748: aload_0
    //   4749: new bigname/zprestige/webhack/features/setting/Setting
    //   4752: dup
    //   4753: ldc_w '呰㌜吀㶥뫡๼'
    //   4756: getstatic Perryc.c : I
    //   4759: iflt -> 4773
    //   4762: ldc2_w 1110298438
    //   4765: l2i
    //   4766: ldc_w 368146105
    //   4769: ixor
    //   4770: goto -> 4781
    //   4773: ldc2_w -36584600
    //   4776: l2i
    //   4777: ldc_w -980518845
    //   4780: ixor
    //   4781: ldc2_w 1820073045
    //   4784: l2i
    //   4785: ldc_w -1738391362
    //   4788: ixor
    //   4789: ixor
    //   4790: lookupswitch default -> 4816, -1547508460 -> 18498, -1160338748 -> 4773
    //   4816: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4819: ldc2_w -1069158868
    //   4822: l2i
    //   4823: ldc_w -1069158868
    //   4826: ixor
    //   4827: getstatic Perryc.c : I
    //   4830: iflt -> 4844
    //   4833: ldc2_w 1447320121
    //   4836: l2i
    //   4837: ldc_w -1130248713
    //   4840: ixor
    //   4841: goto -> 4852
    //   4844: ldc2_w -1002178924
    //   4847: l2i
    //   4848: ldc_w 353406142
    //   4851: ixor
    //   4852: ldc2_w 584989576
    //   4855: l2i
    //   4856: ldc_w 1335866138
    //   4859: ixor
    //   4860: ixor
    //   4861: lookupswitch default -> 4888, -2019289252 -> 18678, 496248508 -> 4844
    //   4888: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   4891: getstatic Perryc.c : I
    //   4894: iflt -> 4908
    //   4897: ldc2_w 1320719433
    //   4900: l2i
    //   4901: ldc_w 1792657220
    //   4904: ixor
    //   4905: goto -> 4916
    //   4908: ldc2_w -1064060252
    //   4911: l2i
    //   4912: ldc_w -295654432
    //   4915: ixor
    //   4916: ldc2_w -1366388955
    //   4919: l2i
    //   4920: ldc_w -952679739
    //   4923: ixor
    //   4924: ixor
    //   4925: lookupswitch default -> 18520, 1196088484 -> 4952, 1306042093 -> 4908
    //   4952: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   4955: getstatic Perryc.1 : I
    //   4958: ifeq -> 4972
    //   4961: ldc2_w -1011395427
    //   4964: l2i
    //   4965: ldc_w -188963192
    //   4968: ixor
    //   4969: goto -> 4980
    //   4972: ldc2_w 211421424
    //   4975: l2i
    //   4976: ldc_w 421975684
    //   4979: ixor
    //   4980: ldc2_w 1621180280
    //   4983: l2i
    //   4984: ldc_w 1099883769
    //   4987: ixor
    //   4988: ixor
    //   4989: lookupswitch default -> 18560, 371468692 -> 4972, 882050549 -> 5016
    //   5016: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5019: getstatic Perryc.0 : I
    //   5022: ifle -> 5036
    //   5025: ldc2_w 1759927125
    //   5028: l2i
    //   5029: ldc_w 875177527
    //   5032: ixor
    //   5033: goto -> 5044
    //   5036: ldc2_w 2014270956
    //   5039: l2i
    //   5040: ldc_w 1656970211
    //   5043: ixor
    //   5044: ldc2_w 38918693
    //   5047: l2i
    //   5048: ldc_w -1607469527
    //   5051: ixor
    //   5052: ixor
    //   5053: lookupswitch default -> 5080, -21868178 -> 18290, 1888770264 -> 5036
    //   5080: putfield noTrace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5083: getstatic Perryc.1 : I
    //   5086: ifeq -> 5100
    //   5089: ldc2_w -637629449
    //   5092: l2i
    //   5093: ldc_w -1584834892
    //   5096: ixor
    //   5097: goto -> 5108
    //   5100: ldc2_w -521749034
    //   5103: l2i
    //   5104: ldc_w -1051574476
    //   5107: ixor
    //   5108: ldc2_w 1270564047
    //   5111: l2i
    //   5112: ldc_w -1921801220
    //   5115: ixor
    //   5116: ixor
    //   5117: lookupswitch default -> 5144, -1479611162 -> 5100, -1094763920 -> 18266
    //   5144: aload_0
    //   5145: getstatic Perryc.0 : I
    //   5148: ifle -> 5162
    //   5151: ldc2_w 470844953
    //   5154: l2i
    //   5155: ldc_w -427920944
    //   5158: ixor
    //   5159: goto -> 5170
    //   5162: ldc2_w -895688876
    //   5165: l2i
    //   5166: ldc_w 1045236921
    //   5169: ixor
    //   5170: ldc2_w -1629565987
    //   5173: l2i
    //   5174: ldc_w -2021139049
    //   5177: ixor
    //   5178: ixor
    //   5179: lookupswitch default -> 5204, -1795519183 -> 5162, -482877053 -> 18652
    //   5204: aload_0
    //   5205: new bigname/zprestige/webhack/features/setting/Setting
    //   5208: dup
    //   5209: ldc_w '呰㌜吓㶶뫖๫⧲蹠뼦'
    //   5212: getstatic Perryc.1 : I
    //   5215: ifeq -> 5229
    //   5218: ldc2_w 1968731081
    //   5221: l2i
    //   5222: ldc_w 1567636479
    //   5225: ixor
    //   5226: goto -> 5237
    //   5229: ldc2_w -451084125
    //   5232: l2i
    //   5233: ldc_w 793421152
    //   5236: ixor
    //   5237: ldc2_w -561407779
    //   5240: l2i
    //   5241: ldc_w -1459851886
    //   5244: ixor
    //   5245: ixor
    //   5246: lookupswitch default -> 5272, -301405603 -> 5229, 1583201657 -> 18184
    //   5272: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5275: ldc2_w -1441157387
    //   5278: l2i
    //   5279: ldc_w -1441157387
    //   5282: ixor
    //   5283: getstatic Perryc.c : I
    //   5286: iflt -> 5300
    //   5289: ldc2_w -1434787147
    //   5292: l2i
    //   5293: ldc_w -1635446139
    //   5296: ixor
    //   5297: goto -> 5308
    //   5300: ldc2_w 683117483
    //   5303: l2i
    //   5304: ldc_w 981100195
    //   5307: ixor
    //   5308: ldc2_w 1080281884
    //   5311: l2i
    //   5312: ldc_w -1049256116
    //   5315: ixor
    //   5316: ixor
    //   5317: lookupswitch default -> 5344, -1242979232 -> 18648, -937808866 -> 5300
    //   5344: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   5347: getstatic Perryc.1 : I
    //   5350: ifeq -> 5364
    //   5353: ldc2_w 297086935
    //   5356: l2i
    //   5357: ldc_w 376806713
    //   5360: ixor
    //   5361: goto -> 5372
    //   5364: ldc2_w 311983334
    //   5367: l2i
    //   5368: ldc_w 2032695665
    //   5371: ixor
    //   5372: ldc2_w -1303349747
    //   5375: l2i
    //   5376: ldc_w 526288954
    //   5379: ixor
    //   5380: ixor
    //   5381: lookupswitch default -> 18684, -1429320487 -> 5364, -960562272 -> 5408
    //   5408: aload_0
    //   5409: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   5414: getstatic Perryc.c : I
    //   5417: iflt -> 5431
    //   5420: ldc2_w 591693641
    //   5423: l2i
    //   5424: ldc_w -1975621344
    //   5427: ixor
    //   5428: goto -> 5439
    //   5431: ldc2_w 914291652
    //   5434: l2i
    //   5435: ldc_w 1688742192
    //   5438: ixor
    //   5439: ldc2_w -1231558730
    //   5442: l2i
    //   5443: ldc_w 22548452
    //   5446: ixor
    //   5447: ixor
    //   5448: lookupswitch default -> 18300, -451331418 -> 5476, 515180091 -> 5431
    //   5476: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   5479: getstatic Perryc.1 : I
    //   5482: ifeq -> 5496
    //   5485: ldc2_w 1969354728
    //   5488: l2i
    //   5489: ldc_w 1875340021
    //   5492: ixor
    //   5493: goto -> 5504
    //   5496: ldc2_w -527570470
    //   5499: l2i
    //   5500: ldc_w 1472596510
    //   5503: ixor
    //   5504: ldc2_w 440328884
    //   5507: l2i
    //   5508: ldc_w -1963788246
    //   5511: ixor
    //   5512: ixor
    //   5513: lookupswitch default -> 5540, -1972729981 -> 18302, 678154318 -> 5496
    //   5540: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5543: getstatic Perryc.0 : I
    //   5546: ifle -> 5560
    //   5549: ldc2_w -1488051552
    //   5552: l2i
    //   5553: ldc_w -1567964530
    //   5556: ixor
    //   5557: goto -> 5568
    //   5560: ldc2_w -1194920721
    //   5563: l2i
    //   5564: ldc_w 425736246
    //   5567: ixor
    //   5568: ldc2_w 531551943
    //   5571: l2i
    //   5572: ldc_w 989723498
    //   5575: ixor
    //   5576: ixor
    //   5577: lookupswitch default -> 5604, 546819459 -> 18282, 855800383 -> 5560
    //   5604: putfield noGapTrace : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5607: getstatic Perryc.0 : I
    //   5610: ifle -> 5624
    //   5613: ldc2_w 2046036299
    //   5616: l2i
    //   5617: ldc_w 411535910
    //   5620: ixor
    //   5621: goto -> 5632
    //   5624: ldc2_w 1433855285
    //   5627: l2i
    //   5628: ldc_w 554612225
    //   5631: ixor
    //   5632: ldc2_w -1207703318
    //   5635: l2i
    //   5636: ldc_w 677373781
    //   5639: ixor
    //   5640: ixor
    //   5641: lookupswitch default -> 5668, -1235791105 -> 5624, -248541998 -> 18666
    //   5668: aload_0
    //   5669: getstatic Perryc.1 : I
    //   5672: ifeq -> 5686
    //   5675: ldc2_w -608686536
    //   5678: l2i
    //   5679: ldc_w -1708046377
    //   5682: ixor
    //   5683: goto -> 5694
    //   5686: ldc2_w 1171308482
    //   5689: l2i
    //   5690: ldc_w -665370526
    //   5693: ixor
    //   5694: ldc2_w -1864785008
    //   5697: l2i
    //   5698: ldc_w -1485315345
    //   5701: ixor
    //   5702: ixor
    //   5703: lookupswitch default -> 18620, -1440104737 -> 5728, 1982277776 -> 5686
    //   5728: aload_0
    //   5729: new bigname/zprestige/webhack/features/setting/Setting
    //   5732: dup
    //   5733: ldc_w '呿㌟吸㶸뫏๬⧿蹷뼪ਦ馕煪'
    //   5736: getstatic Perryc.0 : I
    //   5739: ifle -> 5753
    //   5742: ldc2_w 1147451777
    //   5745: l2i
    //   5746: ldc_w -894645071
    //   5749: ixor
    //   5750: goto -> 5761
    //   5753: ldc2_w -111750629
    //   5756: l2i
    //   5757: ldc_w 686616818
    //   5760: ixor
    //   5761: ldc2_w 2013689806
    //   5764: l2i
    //   5765: ldc_w 1891736860
    //   5768: ixor
    //   5769: ixor
    //   5770: lookupswitch default -> 18270, -2045796382 -> 5753, -646068165 -> 5796
    //   5796: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5799: ldc2_w -104165456
    //   5802: l2i
    //   5803: ldc_w -104165456
    //   5806: ixor
    //   5807: getstatic Perryc.1 : I
    //   5810: ifeq -> 5824
    //   5813: ldc2_w -1179367900
    //   5816: l2i
    //   5817: ldc_w -301252966
    //   5820: ixor
    //   5821: goto -> 5832
    //   5824: ldc2_w 600575074
    //   5827: l2i
    //   5828: ldc_w 1051307405
    //   5831: ixor
    //   5832: ldc2_w -1912052362
    //   5835: l2i
    //   5836: ldc_w 608733627
    //   5839: ixor
    //   5840: ixor
    //   5841: lookupswitch default -> 5868, -33581965 -> 18176, 1959924479 -> 5824
    //   5868: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   5871: getstatic Perryc.c : I
    //   5874: iflt -> 5888
    //   5877: ldc2_w -1724295848
    //   5880: l2i
    //   5881: ldc_w -612463046
    //   5884: ixor
    //   5885: goto -> 5896
    //   5888: ldc2_w -225373724
    //   5891: l2i
    //   5892: ldc_w 44860522
    //   5895: ixor
    //   5896: ldc2_w -1467305164
    //   5899: l2i
    //   5900: ldc_w 1726628939
    //   5903: ixor
    //   5904: ixor
    //   5905: lookupswitch default -> 5932, -1943589859 -> 18716, 1474468644 -> 5888
    //   5932: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   5935: getstatic Perryc.c : I
    //   5938: iflt -> 5952
    //   5941: ldc2_w -970551632
    //   5944: l2i
    //   5945: ldc_w 1919297238
    //   5948: ixor
    //   5949: goto -> 5960
    //   5952: ldc2_w 1919302917
    //   5955: l2i
    //   5956: ldc_w -1331340802
    //   5959: ixor
    //   5960: ldc2_w -2021210131
    //   5963: l2i
    //   5964: ldc_w 1311797913
    //   5967: ixor
    //   5968: ixor
    //   5969: lookupswitch default -> 5996, -324793693 -> 5952, 2113281298 -> 18612
    //   5996: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   5999: getstatic Perryc.1 : I
    //   6002: ifeq -> 6016
    //   6005: ldc2_w 1312651046
    //   6008: l2i
    //   6009: ldc_w -482851297
    //   6012: ixor
    //   6013: goto -> 6024
    //   6016: ldc2_w 1334160766
    //   6019: l2i
    //   6020: ldc_w -1723308398
    //   6023: ixor
    //   6024: ldc2_w 2072907094
    //   6027: l2i
    //   6028: ldc_w 2037536180
    //   6031: ixor
    //   6032: ixor
    //   6033: lookupswitch default -> 18490, -1342608933 -> 6016, -734948594 -> 6060
    //   6060: putfield allow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6063: getstatic Perryc.1 : I
    //   6066: ifeq -> 6080
    //   6069: ldc2_w -563862240
    //   6072: l2i
    //   6073: ldc_w 1006452856
    //   6076: ixor
    //   6077: goto -> 6088
    //   6080: ldc2_w -133278888
    //   6083: l2i
    //   6084: ldc_w 630666591
    //   6087: ixor
    //   6088: ldc2_w -796623478
    //   6091: l2i
    //   6092: ldc_w 474743211
    //   6095: ixor
    //   6096: ixor
    //   6097: lookupswitch default -> 18476, 290527782 -> 6124, 693180793 -> 6080
    //   6124: aload_0
    //   6125: getstatic Perryc.0 : I
    //   6128: ifle -> 6142
    //   6131: ldc2_w -1393289975
    //   6134: l2i
    //   6135: ldc_w -143648891
    //   6138: ixor
    //   6139: goto -> 6150
    //   6142: ldc2_w -1968332694
    //   6145: l2i
    //   6146: ldc_w 1983204957
    //   6149: ixor
    //   6150: ldc2_w 278451007
    //   6153: l2i
    //   6154: ldc_w 1508950645
    //   6157: ixor
    //   6158: ixor
    //   6159: lookupswitch default -> 6184, -1134940967 -> 6142, 317461446 -> 18530
    //   6184: aload_0
    //   6185: new bigname/zprestige/webhack/features/setting/Setting
    //   6188: dup
    //   6189: ldc_w '呮㌚吷㶼뫺๼'
    //   6192: getstatic Perryc.c : I
    //   6195: iflt -> 6209
    //   6198: ldc2_w 756238228
    //   6201: l2i
    //   6202: ldc_w 1848231121
    //   6205: ixor
    //   6206: goto -> 6217
    //   6209: ldc2_w -588620033
    //   6212: l2i
    //   6213: ldc_w -1057453646
    //   6216: ixor
    //   6217: ldc2_w -326025250
    //   6220: l2i
    //   6221: ldc_w -1455776192
    //   6224: ixor
    //   6225: ixor
    //   6226: lookupswitch default -> 6252, 110174939 -> 18406, 715260333 -> 6209
    //   6252: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6255: ldc2_w 644949518
    //   6258: l2i
    //   6259: ldc_w 644949519
    //   6262: ixor
    //   6263: getstatic Perryc.c : I
    //   6266: iflt -> 6280
    //   6269: ldc2_w -1921653036
    //   6272: l2i
    //   6273: ldc_w 1192621927
    //   6276: ixor
    //   6277: goto -> 6288
    //   6280: ldc2_w 1079588678
    //   6283: l2i
    //   6284: ldc_w -1194100478
    //   6287: ixor
    //   6288: ldc2_w -1759258588
    //   6291: l2i
    //   6292: ldc_w 709954449
    //   6295: ixor
    //   6296: ixor
    //   6297: lookupswitch default -> 6324, 1197336367 -> 6280, 1997718022 -> 18196
    //   6324: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   6327: getstatic Perryc.1 : I
    //   6330: ifeq -> 6344
    //   6333: ldc2_w 113492310
    //   6336: l2i
    //   6337: ldc_w -1631696842
    //   6340: ixor
    //   6341: goto -> 6352
    //   6344: ldc2_w -695353476
    //   6347: l2i
    //   6348: ldc_w 1440027560
    //   6351: ixor
    //   6352: ldc2_w -169341411
    //   6355: l2i
    //   6356: ldc_w -1444634589
    //   6359: ixor
    //   6360: ixor
    //   6361: lookupswitch default -> 6388, -1294245619 -> 6344, -999217314 -> 18200
    //   6388: aload_0
    //   6389: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   6394: getstatic Perryc.0 : I
    //   6397: ifle -> 6411
    //   6400: ldc2_w 383402654
    //   6403: l2i
    //   6404: ldc_w 1533083660
    //   6407: ixor
    //   6408: goto -> 6419
    //   6411: ldc2_w 1170453998
    //   6414: l2i
    //   6415: ldc_w 1411605091
    //   6418: ixor
    //   6419: ldc2_w -503519661
    //   6422: l2i
    //   6423: ldc_w -294357471
    //   6426: ixor
    //   6427: ixor
    //   6428: lookupswitch default -> 6456, -82932262 -> 6411, 1110692576 -> 18688
    //   6456: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   6459: getstatic Perryc.c : I
    //   6462: iflt -> 6476
    //   6465: ldc2_w 544721310
    //   6468: l2i
    //   6469: ldc_w -112666214
    //   6472: ixor
    //   6473: goto -> 6484
    //   6476: ldc2_w 946305321
    //   6479: l2i
    //   6480: ldc_w -1153084126
    //   6483: ixor
    //   6484: ldc2_w -1612167533
    //   6487: l2i
    //   6488: ldc_w -1861679271
    //   6491: ixor
    //   6492: ixor
    //   6493: lookupswitch default -> 6520, -673295922 -> 18392, 1816207078 -> 6476
    //   6520: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6523: getstatic Perryc.c : I
    //   6526: iflt -> 6540
    //   6529: ldc2_w -139760188
    //   6532: l2i
    //   6533: ldc_w 2095201204
    //   6536: ixor
    //   6537: goto -> 6548
    //   6540: ldc2_w -80102566
    //   6543: l2i
    //   6544: ldc_w 1826125178
    //   6547: ixor
    //   6548: ldc2_w -963107220
    //   6551: l2i
    //   6552: ldc_w 2143763651
    //   6555: ixor
    //   6556: ixor
    //   6557: lookupswitch default -> 18338, 784258191 -> 6584, 840322271 -> 6540
    //   6584: putfield pickaxe : Lbigname/zprestige/webhack/features/setting/Setting;
    //   6587: getstatic Perryc.0 : I
    //   6590: ifle -> 6604
    //   6593: ldc2_w -1851615541
    //   6596: l2i
    //   6597: ldc_w 1485082449
    //   6600: ixor
    //   6601: goto -> 6612
    //   6604: ldc2_w 612934319
    //   6607: l2i
    //   6608: ldc_w -1923487580
    //   6611: ixor
    //   6612: ldc2_w 693891078
    //   6615: l2i
    //   6616: ldc_w -1949678668
    //   6619: ixor
    //   6620: ixor
    //   6621: lookupswitch default -> 18608, 188807609 -> 6648, 1807198760 -> 6604
    //   6648: aload_0
    //   6649: getstatic Perryc.1 : I
    //   6652: ifeq -> 6666
    //   6655: ldc2_w -2058155484
    //   6658: l2i
    //   6659: ldc_w -828934384
    //   6662: ixor
    //   6663: goto -> 6674
    //   6666: ldc2_w -755870925
    //   6669: l2i
    //   6670: ldc_w 981573693
    //   6673: ixor
    //   6674: ldc2_w -911444516
    //   6677: l2i
    //   6678: ldc_w -2039511407
    //   6681: ixor
    //   6682: ixor
    //   6683: lookupswitch default -> 18344, -1481637821 -> 6708, 67604089 -> 6666
    //   6708: aload_0
    //   6709: new bigname/zprestige/webhack/features/setting/Setting
    //   6712: dup
    //   6713: ldc_w '呺㌜吡㶵뫧๛⧡蹦뼢'
    //   6716: getstatic Perryc.c : I
    //   6719: iflt -> 6733
    //   6722: ldc2_w 1949927182
    //   6725: l2i
    //   6726: ldc_w 374218269
    //   6729: ixor
    //   6730: goto -> 6741
    //   6733: ldc2_w -1500436012
    //   6736: l2i
    //   6737: ldc_w 166095459
    //   6740: ixor
    //   6741: ldc2_w -1622754270
    //   6744: l2i
    //   6745: ldc_w -911743798
    //   6748: ixor
    //   6749: ixor
    //   6750: lookupswitch default -> 18368, -107603105 -> 6776, 882295291 -> 6733
    //   6776: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6779: ldc2_w -1948661022
    //   6782: l2i
    //   6783: ldc_w -1948661022
    //   6786: ixor
    //   6787: getstatic Perryc.0 : I
    //   6790: ifle -> 6804
    //   6793: ldc2_w -1888329813
    //   6796: l2i
    //   6797: ldc_w -41020610
    //   6800: ixor
    //   6801: goto -> 6812
    //   6804: ldc2_w 398482510
    //   6807: l2i
    //   6808: ldc_w -154402518
    //   6811: ixor
    //   6812: ldc2_w 1060303493
    //   6815: l2i
    //   6816: ldc_w -1294918947
    //   6819: ixor
    //   6820: ixor
    //   6821: lookupswitch default -> 18260, -14703411 -> 6804, 1827648828 -> 6848
    //   6848: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   6851: getstatic Perryc.1 : I
    //   6854: ifeq -> 6868
    //   6857: ldc2_w -1900169950
    //   6860: l2i
    //   6861: ldc_w 971098275
    //   6864: ixor
    //   6865: goto -> 6876
    //   6868: ldc2_w -583199474
    //   6871: l2i
    //   6872: ldc_w -503358102
    //   6875: ixor
    //   6876: ldc2_w 1740605370
    //   6879: l2i
    //   6880: ldc_w -1718972460
    //   6883: ixor
    //   6884: ixor
    //   6885: lookupswitch default -> 18692, -1023983606 -> 6912, 1231648239 -> 6868
    //   6912: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   6915: getstatic Perryc.c : I
    //   6918: iflt -> 6932
    //   6921: ldc2_w 856634912
    //   6924: l2i
    //   6925: ldc_w 1523828839
    //   6928: ixor
    //   6929: goto -> 6940
    //   6932: ldc2_w 7727789
    //   6935: l2i
    //   6936: ldc_w -2145526641
    //   6939: ixor
    //   6940: ldc2_w 672718094
    //   6943: l2i
    //   6944: ldc_w -881138744
    //   6947: ixor
    //   6948: ixor
    //   6949: lookupswitch default -> 6976, -1967210367 -> 18434, 1971373583 -> 6932
    //   6976: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   6979: getstatic Perryc.c : I
    //   6982: iflt -> 6996
    //   6985: ldc2_w 439018013
    //   6988: l2i
    //   6989: ldc_w 230309653
    //   6992: ixor
    //   6993: goto -> 7004
    //   6996: ldc2_w 99436488
    //   6999: l2i
    //   7000: ldc_w -85249441
    //   7003: ixor
    //   7004: ldc2_w -1606627794
    //   7007: l2i
    //   7008: ldc_w -404510579
    //   7011: ixor
    //   7012: ixor
    //   7013: lookupswitch default -> 18346, -1193733324 -> 7040, 1347402667 -> 6996
    //   7040: putfield doubleBreak : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7043: getstatic Perryc.c : I
    //   7046: iflt -> 7060
    //   7049: ldc2_w 2116831179
    //   7052: l2i
    //   7053: ldc_w -1476256351
    //   7056: ixor
    //   7057: goto -> 7068
    //   7060: ldc2_w -1595938849
    //   7063: l2i
    //   7064: ldc_w 1126031399
    //   7067: ixor
    //   7068: ldc2_w 500657012
    //   7071: l2i
    //   7072: ldc_w -1335607291
    //   7075: ixor
    //   7076: ixor
    //   7077: lookupswitch default -> 7104, 1640245772 -> 7060, 2073915675 -> 18674
    //   7104: aload_0
    //   7105: getstatic Perryc.1 : I
    //   7108: ifeq -> 7122
    //   7111: ldc2_w 1087600499
    //   7114: l2i
    //   7115: ldc_w 1199217055
    //   7118: ixor
    //   7119: goto -> 7130
    //   7122: ldc2_w 1085530698
    //   7125: l2i
    //   7126: ldc_w 263212415
    //   7129: ixor
    //   7130: ldc2_w -1939541004
    //   7133: l2i
    //   7134: ldc_w 602304231
    //   7137: ixor
    //   7138: ixor
    //   7139: lookupswitch default -> 18508, -1473547265 -> 7122, -528403930 -> 7164
    //   7164: aload_0
    //   7165: new bigname/zprestige/webhack/features/setting/Setting
    //   7168: dup
    //   7169: ldc_w '呩㌖吶㶄뫫๭⧰蹫'
    //   7172: getstatic Perryc.c : I
    //   7175: iflt -> 7189
    //   7178: ldc2_w -87143274
    //   7181: l2i
    //   7182: ldc_w 69382342
    //   7185: ixor
    //   7186: goto -> 7197
    //   7189: ldc2_w 384622195
    //   7192: l2i
    //   7193: ldc_w 253019407
    //   7196: ixor
    //   7197: ldc2_w -1819560840
    //   7200: l2i
    //   7201: ldc_w -44163710
    //   7204: ixor
    //   7205: ixor
    //   7206: lookupswitch default -> 18356, -1875290710 -> 7189, 1999483526 -> 7232
    //   7232: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7235: ldc2_w 448070646
    //   7238: l2i
    //   7239: ldc_w 448070646
    //   7242: ixor
    //   7243: getstatic Perryc.1 : I
    //   7246: ifeq -> 7260
    //   7249: ldc2_w -1962250636
    //   7252: l2i
    //   7253: ldc_w 1637561447
    //   7256: ixor
    //   7257: goto -> 7268
    //   7260: ldc2_w 1765698214
    //   7263: l2i
    //   7264: ldc_w -2030931151
    //   7267: ixor
    //   7268: ldc2_w 749707385
    //   7271: l2i
    //   7272: ldc_w 1015725098
    //   7275: ixor
    //   7276: ixor
    //   7277: lookupswitch default -> 18178, -88848832 -> 7260, -1505852 -> 7304
    //   7304: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   7307: getstatic Perryc.1 : I
    //   7310: ifeq -> 7324
    //   7313: ldc2_w -1729395928
    //   7316: l2i
    //   7317: ldc_w 1467281851
    //   7320: ixor
    //   7321: goto -> 7332
    //   7324: ldc2_w -1016051618
    //   7327: l2i
    //   7328: ldc_w 701515283
    //   7331: ixor
    //   7332: ldc2_w 194713771
    //   7335: l2i
    //   7336: ldc_w -1413060793
    //   7339: ixor
    //   7340: ixor
    //   7341: lookupswitch default -> 18378, 1258123681 -> 7368, 1874988415 -> 7324
    //   7368: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   7371: getstatic Perryc.c : I
    //   7374: iflt -> 7388
    //   7377: ldc2_w -459949063
    //   7380: l2i
    //   7381: ldc_w 1783715091
    //   7384: ixor
    //   7385: goto -> 7396
    //   7388: ldc2_w -141738819
    //   7391: l2i
    //   7392: ldc_w 2050633358
    //   7395: ixor
    //   7396: ldc2_w 1816949697
    //   7399: l2i
    //   7400: ldc_w -1213003438
    //   7403: ixor
    //   7404: ixor
    //   7405: lookupswitch default -> 18714, 1429967993 -> 7388, 1447585952 -> 7432
    //   7432: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7435: getstatic Perryc.c : I
    //   7438: iflt -> 7452
    //   7441: ldc2_w 58888164
    //   7444: l2i
    //   7445: ldc_w -819661406
    //   7448: ixor
    //   7449: goto -> 7460
    //   7452: ldc2_w -292439182
    //   7455: l2i
    //   7456: ldc_w -1271931570
    //   7459: ixor
    //   7460: ldc2_w -1121058839
    //   7463: l2i
    //   7464: ldc_w -1017383493
    //   7467: ixor
    //   7468: ixor
    //   7469: lookupswitch default -> 7496, -1294962668 -> 18220, 241063677 -> 7452
    //   7496: putfield webSwitch : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7499: getstatic Perryc.c : I
    //   7502: iflt -> 7516
    //   7505: ldc2_w 1934390480
    //   7508: l2i
    //   7509: ldc_w -374798998
    //   7512: ixor
    //   7513: goto -> 7524
    //   7516: ldc2_w -939084345
    //   7519: l2i
    //   7520: ldc_w 1864533016
    //   7523: ixor
    //   7524: ldc2_w -671315530
    //   7527: l2i
    //   7528: ldc_w -668109604
    //   7531: ixor
    //   7532: ixor
    //   7533: lookupswitch default -> 18516, -1791718192 -> 7516, -1460286283 -> 7560
    //   7560: aload_0
    //   7561: getstatic Perryc.c : I
    //   7564: iflt -> 7578
    //   7567: ldc2_w 2081612456
    //   7570: l2i
    //   7571: ldc_w 95480625
    //   7574: ixor
    //   7575: goto -> 7586
    //   7578: ldc2_w 1103292981
    //   7581: l2i
    //   7582: ldc_w 241335917
    //   7585: ixor
    //   7586: ldc2_w -1381765713
    //   7589: l2i
    //   7590: ldc_w -1026441582
    //   7593: ixor
    //   7594: ixor
    //   7595: lookupswitch default -> 18698, 382753444 -> 7578, 550684517 -> 7620
    //   7620: aload_0
    //   7621: new bigname/zprestige/webhack/features/setting/Setting
    //   7624: dup
    //   7625: ldc_w '呭㌚吸㶲뫶๊⧤蹪뼷ਯ'
    //   7628: getstatic Perryc.1 : I
    //   7631: ifeq -> 7645
    //   7634: ldc2_w 1761128951
    //   7637: l2i
    //   7638: ldc_w 1595129665
    //   7641: ixor
    //   7642: goto -> 7653
    //   7645: ldc2_w 1992285792
    //   7648: l2i
    //   7649: ldc_w 2089014164
    //   7652: ixor
    //   7653: ldc2_w -1109109629
    //   7656: l2i
    //   7657: ldc_w 1870807521
    //   7660: ixor
    //   7661: ixor
    //   7662: lookupswitch default -> 18708, -665184106 -> 7688, -443737132 -> 7645
    //   7688: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7691: ldc2_w 1334321225
    //   7694: l2i
    //   7695: ldc_w 1334321225
    //   7698: ixor
    //   7699: getstatic Perryc.0 : I
    //   7702: ifle -> 7716
    //   7705: ldc2_w 1881981824
    //   7708: l2i
    //   7709: ldc_w 1916452033
    //   7712: ixor
    //   7713: goto -> 7724
    //   7716: ldc2_w 872894010
    //   7719: l2i
    //   7720: ldc_w 18710454
    //   7723: ixor
    //   7724: ldc2_w 2084036503
    //   7727: l2i
    //   7728: ldc_w -1651336239
    //   7731: ixor
    //   7732: ixor
    //   7733: lookupswitch default -> 18402, -725649974 -> 7760, -474793209 -> 7716
    //   7760: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   7763: getstatic Perryc.1 : I
    //   7766: ifeq -> 7780
    //   7769: ldc2_w 544500436
    //   7772: l2i
    //   7773: ldc_w 1828949446
    //   7776: ixor
    //   7777: goto -> 7788
    //   7780: ldc2_w 1774091286
    //   7783: l2i
    //   7784: ldc_w -1514732693
    //   7787: ixor
    //   7788: ldc2_w -1310824418
    //   7791: l2i
    //   7792: ldc_w -863888411
    //   7795: ixor
    //   7796: ixor
    //   7797: lookupswitch default -> 7824, -1289228813 -> 7780, 808162537 -> 18190
    //   7824: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   7827: getstatic Perryc.c : I
    //   7830: iflt -> 7844
    //   7833: ldc2_w 528193101
    //   7836: l2i
    //   7837: ldc_w 931573063
    //   7840: ixor
    //   7841: goto -> 7852
    //   7844: ldc2_w -266087820
    //   7847: l2i
    //   7848: ldc_w 1528585672
    //   7851: ixor
    //   7852: ldc2_w -1970587954
    //   7855: l2i
    //   7856: ldc_w 1400652696
    //   7859: ixor
    //   7860: ixor
    //   7861: lookupswitch default -> 7888, -1440357205 -> 7844, -250982820 -> 18474
    //   7888: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   7891: getstatic Perryc.0 : I
    //   7894: ifle -> 7908
    //   7897: ldc2_w -1709844327
    //   7900: l2i
    //   7901: ldc_w 593171780
    //   7904: ixor
    //   7905: goto -> 7916
    //   7908: ldc2_w 1093651184
    //   7911: l2i
    //   7912: ldc_w 1033323248
    //   7915: ixor
    //   7916: ldc2_w 2034931609
    //   7919: l2i
    //   7920: ldc_w -1399162567
    //   7923: ixor
    //   7924: ixor
    //   7925: lookupswitch default -> 7952, 1557738598 -> 7908, 1822303101 -> 18562
    //   7952: putfield silentSwitch : Lbigname/zprestige/webhack/features/setting/Setting;
    //   7955: getstatic Perryc.0 : I
    //   7958: ifle -> 7972
    //   7961: ldc2_w 600066018
    //   7964: l2i
    //   7965: ldc_w -324329588
    //   7968: ixor
    //   7969: goto -> 7980
    //   7972: ldc2_w -1795170294
    //   7975: l2i
    //   7976: ldc_w 1752250910
    //   7979: ixor
    //   7980: ldc2_w 349497388
    //   7983: l2i
    //   7984: ldc_w 1608829689
    //   7987: ixor
    //   7988: ixor
    //   7989: lookupswitch default -> 8016, -2074117445 -> 18448, -723927815 -> 7972
    //   8016: aload_0
    //   8017: getstatic Perryc.1 : I
    //   8020: ifeq -> 8034
    //   8023: ldc2_w -1086109191
    //   8026: l2i
    //   8027: ldc_w -851568926
    //   8030: ixor
    //   8031: goto -> 8042
    //   8034: ldc2_w 773927826
    //   8037: l2i
    //   8038: ldc_w 180001767
    //   8041: ixor
    //   8042: ldc2_w -1992872357
    //   8045: l2i
    //   8046: ldc_w -214400793
    //   8049: ixor
    //   8050: ixor
    //   8051: lookupswitch default -> 8076, -667504143 -> 8034, 141750695 -> 18240
    //   8076: aload_0
    //   8077: new bigname/zprestige/webhack/features/setting/Setting
    //   8080: dup
    //   8081: ldc_w '呷㌟吸㶲뫣๵⧞蹪뼭'
    //   8084: getstatic Perryc.0 : I
    //   8087: ifle -> 8101
    //   8090: ldc2_w 1924264256
    //   8093: l2i
    //   8094: ldc_w -823594146
    //   8097: ixor
    //   8098: goto -> 8109
    //   8101: ldc2_w -1439168851
    //   8104: l2i
    //   8105: ldc_w 659190404
    //   8108: ixor
    //   8109: ldc2_w -1386237141
    //   8112: l2i
    //   8113: ldc_w 4690812
    //   8116: ixor
    //   8117: ixor
    //   8118: lookupswitch default -> 18454, 289481289 -> 8101, 543839358 -> 8144
    //   8144: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8147: ldc2_w 1256765186
    //   8150: l2i
    //   8151: ldc_w 1256765186
    //   8154: ixor
    //   8155: getstatic Perryc.0 : I
    //   8158: ifle -> 8172
    //   8161: ldc2_w 705371979
    //   8164: l2i
    //   8165: ldc_w 1925578236
    //   8168: ixor
    //   8169: goto -> 8180
    //   8172: ldc2_w 2120456992
    //   8175: l2i
    //   8176: ldc_w 705558686
    //   8179: ixor
    //   8180: ldc2_w -610807482
    //   8183: l2i
    //   8184: ldc_w 624379385
    //   8187: ixor
    //   8188: ixor
    //   8189: lookupswitch default -> 18436, -1502710264 -> 8172, -1429276927 -> 8216
    //   8216: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   8219: getstatic Perryc.0 : I
    //   8222: ifle -> 8236
    //   8225: ldc2_w -2128478223
    //   8228: l2i
    //   8229: ldc_w -482137862
    //   8232: ixor
    //   8233: goto -> 8244
    //   8236: ldc2_w 777096726
    //   8239: l2i
    //   8240: ldc_w 1712329780
    //   8243: ixor
    //   8244: ldc2_w 281953164
    //   8247: l2i
    //   8248: ldc_w 1741444387
    //   8251: ixor
    //   8252: ixor
    //   8253: lookupswitch default -> 8280, 358662564 -> 18332, 623193273 -> 8236
    //   8280: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   8283: getstatic Perryc.0 : I
    //   8286: ifle -> 8300
    //   8289: ldc2_w -1087481217
    //   8292: l2i
    //   8293: ldc_w 1310926998
    //   8296: ixor
    //   8297: goto -> 8308
    //   8300: ldc2_w -1858548676
    //   8303: l2i
    //   8304: ldc_w -1471897566
    //   8307: ixor
    //   8308: ldc2_w -1864407340
    //   8311: l2i
    //   8312: ldc_w 104347133
    //   8315: ixor
    //   8316: ixor
    //   8317: lookupswitch default -> 18670, -1348780233 -> 8344, 1743397312 -> 8300
    //   8344: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8347: getstatic Perryc.0 : I
    //   8350: ifle -> 8364
    //   8353: ldc2_w 546053893
    //   8356: l2i
    //   8357: ldc_w -1483836918
    //   8360: ixor
    //   8361: goto -> 8372
    //   8364: ldc2_w 475736518
    //   8367: l2i
    //   8368: ldc_w 1094975675
    //   8371: ixor
    //   8372: ldc2_w -657345126
    //   8375: l2i
    //   8376: ldc_w -1373811923
    //   8379: ixor
    //   8380: ixor
    //   8381: lookupswitch default -> 18310, -238120008 -> 8364, 735303626 -> 8408
    //   8408: putfield illegal : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8411: getstatic Perryc.c : I
    //   8414: iflt -> 8428
    //   8417: ldc2_w 2136869390
    //   8420: l2i
    //   8421: ldc_w -937726273
    //   8424: ixor
    //   8425: goto -> 8436
    //   8428: ldc2_w -1571018604
    //   8431: l2i
    //   8432: ldc_w 1926029726
    //   8435: ixor
    //   8436: ldc2_w -83896734
    //   8439: l2i
    //   8440: ldc_w -1518223519
    //   8443: ixor
    //   8444: ixor
    //   8445: lookupswitch default -> 18202, -1880186871 -> 8472, -398783054 -> 8428
    //   8472: aload_0
    //   8473: getstatic Perryc.1 : I
    //   8476: ifeq -> 8490
    //   8479: ldc2_w -2109547614
    //   8482: l2i
    //   8483: ldc_w 1555547355
    //   8486: ixor
    //   8487: goto -> 8498
    //   8490: ldc2_w 626016374
    //   8493: l2i
    //   8494: ldc_w -1541134782
    //   8497: ixor
    //   8498: ldc2_w 622281944
    //   8501: l2i
    //   8502: ldc_w 636229115
    //   8505: ixor
    //   8506: ixor
    //   8507: lookupswitch default -> 8532, -1492416133 -> 8490, -569487782 -> 18170
    //   8532: aload_0
    //   8533: new bigname/zprestige/webhack/features/setting/Setting
    //   8536: dup
    //   8537: ldc_w '呬㌖吺㶳뫰'
    //   8540: getstatic Perryc.c : I
    //   8543: iflt -> 8557
    //   8546: ldc2_w 1853101287
    //   8549: l2i
    //   8550: ldc_w -224417512
    //   8553: ixor
    //   8554: goto -> 8565
    //   8557: ldc2_w -1891195172
    //   8560: l2i
    //   8561: ldc_w -1838928102
    //   8564: ixor
    //   8565: ldc2_w 1517140605
    //   8568: l2i
    //   8569: ldc_w 2004653699
    //   8572: ixor
    //   8573: ixor
    //   8574: lookupswitch default -> 8600, -1308978943 -> 18672, 1199993386 -> 8557
    //   8600: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8603: ldc2_w -109668176
    //   8606: l2i
    //   8607: ldc_w -109668176
    //   8610: ixor
    //   8611: getstatic Perryc.c : I
    //   8614: iflt -> 8628
    //   8617: ldc2_w -520329304
    //   8620: l2i
    //   8621: ldc_w 1533311436
    //   8624: ixor
    //   8625: goto -> 8636
    //   8628: ldc2_w 1088722251
    //   8631: l2i
    //   8632: ldc_w 1578676826
    //   8635: ixor
    //   8636: ldc2_w -1027192815
    //   8639: l2i
    //   8640: ldc_w -2115064458
    //   8643: ixor
    //   8644: ixor
    //   8645: lookupswitch default -> 18362, -122619133 -> 8628, 1574224502 -> 8672
    //   8672: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   8675: getstatic Perryc.1 : I
    //   8678: ifeq -> 8692
    //   8681: ldc2_w -1736027779
    //   8684: l2i
    //   8685: ldc_w 650790383
    //   8688: ixor
    //   8689: goto -> 8700
    //   8692: ldc2_w -948746649
    //   8695: l2i
    //   8696: ldc_w -1929320821
    //   8699: ixor
    //   8700: ldc2_w 1201884664
    //   8703: l2i
    //   8704: ldc_w -209101203
    //   8707: ixor
    //   8708: ixor
    //   8709: lookupswitch default -> 8736, 174458631 -> 18500, 212510370 -> 8692
    //   8736: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   8739: getstatic Perryc.1 : I
    //   8742: ifeq -> 8756
    //   8745: ldc2_w 1627816859
    //   8748: l2i
    //   8749: ldc_w 1089418237
    //   8752: ixor
    //   8753: goto -> 8764
    //   8756: ldc2_w 1270232922
    //   8759: l2i
    //   8760: ldc_w 965281084
    //   8763: ixor
    //   8764: ldc2_w 2146517547
    //   8767: l2i
    //   8768: ldc_w 777233914
    //   8771: ixor
    //   8772: ixor
    //   8773: lookupswitch default -> 8800, -1189953864 -> 8756, 1883985847 -> 18696
    //   8800: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   8803: getstatic Perryc.0 : I
    //   8806: ifle -> 8820
    //   8809: ldc2_w -1318379060
    //   8812: l2i
    //   8813: ldc_w 1269628322
    //   8816: ixor
    //   8817: goto -> 8828
    //   8820: ldc2_w -1076460050
    //   8823: l2i
    //   8824: ldc_w -1455786502
    //   8827: ixor
    //   8828: ldc2_w -2079988507
    //   8831: l2i
    //   8832: ldc_w -728216342
    //   8835: ixor
    //   8836: ixor
    //   8837: lookupswitch default -> 8864, -1436912543 -> 18274, -1383128102 -> 8820
    //   8864: putfield render : Lbigname/zprestige/webhack/features/setting/Setting;
    //   8867: getstatic Perryc.0 : I
    //   8870: ifle -> 8884
    //   8873: ldc2_w 204645761
    //   8876: l2i
    //   8877: ldc_w 553769570
    //   8880: ixor
    //   8881: goto -> 8892
    //   8884: ldc2_w 203556437
    //   8887: l2i
    //   8888: ldc_w 1366607134
    //   8891: ixor
    //   8892: ldc2_w 1947388574
    //   8895: l2i
    //   8896: ldc_w 1549757483
    //   8899: ixor
    //   8900: ixor
    //   8901: lookupswitch default -> 8928, -1029213369 -> 8884, 92199254 -> 18174
    //   8928: aload_0
    //   8929: getstatic Perryc.0 : I
    //   8932: ifle -> 8946
    //   8935: ldc2_w -652623875
    //   8938: l2i
    //   8939: ldc_w -48833884
    //   8942: ixor
    //   8943: goto -> 8954
    //   8946: ldc2_w -850706962
    //   8949: l2i
    //   8950: ldc_w 635111209
    //   8953: ixor
    //   8954: ldc2_w 1882731931
    //   8957: l2i
    //   8958: ldc_w 950067085
    //   8961: ixor
    //   8962: ixor
    //   8963: lookupswitch default -> 18428, -1610034991 -> 8988, 1821871951 -> 8946
    //   8988: aload_0
    //   8989: new bigname/zprestige/webhack/features/setting/Setting
    //   8992: dup
    //   8993: ldc_w '呼㌜听'
    //   8996: getstatic Perryc.1 : I
    //   8999: ifeq -> 9013
    //   9002: ldc2_w 584613793
    //   9005: l2i
    //   9006: ldc_w -1638545035
    //   9009: ixor
    //   9010: goto -> 9021
    //   9013: ldc2_w -834847057
    //   9016: l2i
    //   9017: ldc_w 222638834
    //   9020: ixor
    //   9021: ldc2_w 1018258808
    //   9024: l2i
    //   9025: ldc_w -36513411
    //   9028: ixor
    //   9029: ixor
    //   9030: lookupswitch default -> 18538, 35369048 -> 9056, 2112752337 -> 9013
    //   9056: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9059: ldc2_w -1472106243
    //   9062: l2i
    //   9063: ldc_w -1472106243
    //   9066: ixor
    //   9067: getstatic Perryc.1 : I
    //   9070: ifeq -> 9084
    //   9073: ldc2_w -820385315
    //   9076: l2i
    //   9077: ldc_w 1887560869
    //   9080: ixor
    //   9081: goto -> 9092
    //   9084: ldc2_w 627577730
    //   9087: l2i
    //   9088: ldc_w 1884143616
    //   9091: ixor
    //   9092: ldc2_w -1711692312
    //   9095: l2i
    //   9096: ldc_w 754984924
    //   9099: ixor
    //   9100: ixor
    //   9101: lookupswitch default -> 9128, -280995040 -> 9084, 190943052 -> 18328
    //   9128: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   9131: getstatic Perryc.0 : I
    //   9134: ifle -> 9148
    //   9137: ldc2_w 312347092
    //   9140: l2i
    //   9141: ldc_w 624134727
    //   9144: ixor
    //   9145: goto -> 9156
    //   9148: ldc2_w -2114180201
    //   9151: l2i
    //   9152: ldc_w -683555822
    //   9155: ixor
    //   9156: ldc2_w -506847123
    //   9159: l2i
    //   9160: ldc_w 56146758
    //   9163: ixor
    //   9164: ixor
    //   9165: lookupswitch default -> 9192, -717285192 -> 18422, 1236980638 -> 9148
    //   9192: aload_0
    //   9193: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   9198: getstatic Perryc.1 : I
    //   9201: ifeq -> 9215
    //   9204: ldc2_w -128425698
    //   9207: l2i
    //   9208: ldc_w -934208606
    //   9211: ixor
    //   9212: goto -> 9223
    //   9215: ldc2_w -1197895244
    //   9218: l2i
    //   9219: ldc_w -2030226110
    //   9222: ixor
    //   9223: ldc2_w 1786399442
    //   9226: l2i
    //   9227: ldc_w -120674870
    //   9230: ixor
    //   9231: ixor
    //   9232: lookupswitch default -> 9260, -1564633692 -> 18316, 1294271619 -> 9215
    //   9260: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   9263: getstatic Perryc.1 : I
    //   9266: ifeq -> 9280
    //   9269: ldc2_w 633457210
    //   9272: l2i
    //   9273: ldc_w -2009199674
    //   9276: ixor
    //   9277: goto -> 9288
    //   9280: ldc2_w 1457714169
    //   9283: l2i
    //   9284: ldc_w -65899829
    //   9287: ixor
    //   9288: ldc2_w 1936249133
    //   9291: l2i
    //   9292: ldc_w -1550962277
    //   9295: ixor
    //   9296: ixor
    //   9297: lookupswitch default -> 9324, 1995270040 -> 9280, 2098798922 -> 18602
    //   9324: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9327: getstatic Perryc.0 : I
    //   9330: ifle -> 9344
    //   9333: ldc2_w -1604255606
    //   9336: l2i
    //   9337: ldc_w 191881428
    //   9340: ixor
    //   9341: goto -> 9352
    //   9344: ldc2_w 24924416
    //   9347: l2i
    //   9348: ldc_w -610762692
    //   9351: ixor
    //   9352: ldc2_w 1685639210
    //   9355: l2i
    //   9356: ldc_w 326872231
    //   9359: ixor
    //   9360: ixor
    //   9361: lookupswitch default -> 9388, -603087661 -> 18680, 677743236 -> 9344
    //   9388: putfield box : Lbigname/zprestige/webhack/features/setting/Setting;
    //   9391: getstatic Perryc.0 : I
    //   9394: ifle -> 9408
    //   9397: ldc2_w -2104457831
    //   9400: l2i
    //   9401: ldc_w 51980905
    //   9404: ixor
    //   9405: goto -> 9416
    //   9408: ldc2_w 1041700313
    //   9411: l2i
    //   9412: ldc_w 1060108208
    //   9415: ixor
    //   9416: ldc2_w 1575365914
    //   9419: l2i
    //   9420: ldc_w 361895117
    //   9423: ixor
    //   9424: ixor
    //   9425: lookupswitch default -> 18388, -906127833 -> 9408, 1229773758 -> 9452
    //   9452: aload_0
    //   9453: getstatic Perryc.1 : I
    //   9456: ifeq -> 9470
    //   9459: ldc2_w -2048699651
    //   9462: l2i
    //   9463: ldc_w 849386882
    //   9466: ixor
    //   9467: goto -> 9478
    //   9470: ldc2_w 884781539
    //   9473: l2i
    //   9474: ldc_w -1842564728
    //   9477: ixor
    //   9478: ldc2_w -1337349523
    //   9481: l2i
    //   9482: ldc_w -734365860
    //   9485: ixor
    //   9486: ixor
    //   9487: lookupswitch default -> 18186, -1025254054 -> 9512, -751824306 -> 9470
    //   9512: aload_0
    //   9513: new bigname/zprestige/webhack/features/setting/Setting
    //   9516: dup
    //   9517: ldc_w '呬㌖吰'
    //   9520: getstatic Perryc.1 : I
    //   9523: ifeq -> 9537
    //   9526: ldc2_w -827778809
    //   9529: l2i
    //   9530: ldc_w 505711772
    //   9533: ixor
    //   9534: goto -> 9545
    //   9537: ldc2_w -1682691667
    //   9540: l2i
    //   9541: ldc_w -1663680615
    //   9544: ixor
    //   9545: ldc2_w 1879520263
    //   9548: l2i
    //   9549: ldc_w 1748621545
    //   9552: ixor
    //   9553: ixor
    //   9554: lookupswitch default -> 9580, -927762059 -> 18308, 2131033590 -> 9537
    //   9580: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   9583: ldc2_w -1019209222
    //   9586: l2i
    //   9587: ldc_w -1019209222
    //   9590: ixor
    //   9591: getstatic Perryc.0 : I
    //   9594: ifle -> 9608
    //   9597: ldc2_w 1760195485
    //   9600: l2i
    //   9601: ldc_w -1852900041
    //   9604: ixor
    //   9605: goto -> 9616
    //   9608: ldc2_w 2120321820
    //   9611: l2i
    //   9612: ldc_w -1554051517
    //   9615: ixor
    //   9616: ldc2_w 1816206370
    //   9619: l2i
    //   9620: ldc_w -1819043113
    //   9623: ixor
    //   9624: ixor
    //   9625: lookupswitch default -> 18188, 112592991 -> 9608, 585892778 -> 9652
    //   9652: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9655: ldc2_w -1431601116
    //   9658: l2i
    //   9659: ldc_w -1431601116
    //   9662: ixor
    //   9663: getstatic Perryc.1 : I
    //   9666: ifeq -> 9680
    //   9669: ldc2_w 2120399698
    //   9672: l2i
    //   9673: ldc_w -1248842603
    //   9676: ixor
    //   9677: goto -> 9688
    //   9680: ldc2_w -1867786311
    //   9683: l2i
    //   9684: ldc_w 1569511632
    //   9687: ixor
    //   9688: ldc2_w -1730686451
    //   9691: l2i
    //   9692: ldc_w -1107004284
    //   9695: ixor
    //   9696: ixor
    //   9697: lookupswitch default -> 18194, -336287264 -> 9724, -316591794 -> 9680
    //   9724: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9727: ldc2_w 987135080
    //   9730: l2i
    //   9731: ldc_w 987135127
    //   9734: ixor
    //   9735: getstatic Perryc.c : I
    //   9738: iflt -> 9752
    //   9741: ldc2_w 1702746997
    //   9744: l2i
    //   9745: ldc_w 24161043
    //   9748: ixor
    //   9749: goto -> 9760
    //   9752: ldc2_w 2077806937
    //   9755: l2i
    //   9756: ldc_w -507755190
    //   9759: ixor
    //   9760: ldc2_w -1040594887
    //   9763: l2i
    //   9764: ldc_w -1319753620
    //   9767: ixor
    //   9768: ixor
    //   9769: lookupswitch default -> 18278, -355765178 -> 9796, 346198067 -> 9752
    //   9796: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   9799: getstatic Perryc.1 : I
    //   9802: ifeq -> 9816
    //   9805: ldc2_w -1558055831
    //   9808: l2i
    //   9809: ldc_w -1034456599
    //   9812: ixor
    //   9813: goto -> 9824
    //   9816: ldc2_w 571011798
    //   9819: l2i
    //   9820: ldc_w -1620127185
    //   9823: ixor
    //   9824: ldc2_w -153377318
    //   9827: l2i
    //   9828: ldc_w -1133221049
    //   9831: ixor
    //   9832: ixor
    //   9833: lookupswitch default -> 18702, -137761180 -> 9860, 735660829 -> 9816
    //   9860: aload_0
    //   9861: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   9866: getstatic Perryc.1 : I
    //   9869: ifeq -> 9883
    //   9872: ldc2_w 1218371253
    //   9875: l2i
    //   9876: ldc_w 941005404
    //   9879: ixor
    //   9880: goto -> 9891
    //   9883: ldc2_w 1699530551
    //   9886: l2i
    //   9887: ldc_w -1216656611
    //   9890: ixor
    //   9891: ldc2_w 1272291360
    //   9894: l2i
    //   9895: ldc_w -871506871
    //   9898: ixor
    //   9899: ixor
    //   9900: lookupswitch default -> 18580, -145737600 -> 9883, 1441787971 -> 9928
    //   9928: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   9931: getstatic Perryc.c : I
    //   9934: iflt -> 9948
    //   9937: ldc2_w 1291866900
    //   9940: l2i
    //   9941: ldc_w -385785394
    //   9944: ixor
    //   9945: goto -> 9956
    //   9948: ldc2_w -1069838386
    //   9951: l2i
    //   9952: ldc_w 5038259
    //   9955: ixor
    //   9956: ldc2_w -1657302153
    //   9959: l2i
    //   9960: ldc_w 1018991123
    //   9963: ixor
    //   9964: ixor
    //   9965: lookupswitch default -> 18556, 92943294 -> 9948, 1643933209 -> 9992
    //   9992: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   9995: getstatic Perryc.0 : I
    //   9998: ifle -> 10012
    //   10001: ldc2_w 1290711261
    //   10004: l2i
    //   10005: ldc_w -1295201288
    //   10008: ixor
    //   10009: goto -> 10020
    //   10012: ldc2_w -552651980
    //   10015: l2i
    //   10016: ldc_w -1227845938
    //   10019: ixor
    //   10020: ldc2_w -1803446389
    //   10023: l2i
    //   10024: ldc_w -937206237
    //   10027: ixor
    //   10028: ixor
    //   10029: lookupswitch default -> 18572, -1568623987 -> 10012, 897414226 -> 10056
    //   10056: putfield red : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10059: getstatic Perryc.1 : I
    //   10062: ifeq -> 10076
    //   10065: ldc2_w -2069765822
    //   10068: l2i
    //   10069: ldc_w 2013185792
    //   10072: ixor
    //   10073: goto -> 10084
    //   10076: ldc2_w -929265317
    //   10079: l2i
    //   10080: ldc_w -1584509004
    //   10083: ixor
    //   10084: ldc2_w 1562534929
    //   10087: l2i
    //   10088: ldc_w -264008158
    //   10091: ixor
    //   10092: ixor
    //   10093: lookupswitch default -> 10120, 1581173873 -> 18644, 1754222662 -> 10076
    //   10120: aload_0
    //   10121: getstatic Perryc.1 : I
    //   10124: ifeq -> 10138
    //   10127: ldc2_w 343210710
    //   10130: l2i
    //   10131: ldc_w 207593733
    //   10134: ixor
    //   10135: goto -> 10146
    //   10138: ldc2_w 1018771658
    //   10141: l2i
    //   10142: ldc_w -14440796
    //   10145: ixor
    //   10146: ldc2_w -385633621
    //   10149: l2i
    //   10150: ldc_w -132871341
    //   10153: ixor
    //   10154: ixor
    //   10155: lookupswitch default -> 18456, -762468458 -> 10180, 154952235 -> 10138
    //   10180: aload_0
    //   10181: new bigname/zprestige/webhack/features/setting/Setting
    //   10184: dup
    //   10185: ldc_w '呹㌁吱㶲'
    //   10188: getstatic Perryc.c : I
    //   10191: iflt -> 10205
    //   10194: ldc2_w 342777854
    //   10197: l2i
    //   10198: ldc_w 1522303017
    //   10201: ixor
    //   10202: goto -> 10213
    //   10205: ldc2_w -716793684
    //   10208: l2i
    //   10209: ldc_w 1944121594
    //   10212: ixor
    //   10213: ldc2_w 1879351186
    //   10216: l2i
    //   10217: ldc_w 1364971524
    //   10220: ixor
    //   10221: ixor
    //   10222: lookupswitch default -> 10248, -1634755237 -> 10205, 1871548481 -> 18532
    //   10248: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10251: ldc2_w 357556495
    //   10254: l2i
    //   10255: ldc_w 357556720
    //   10258: ixor
    //   10259: getstatic Perryc.c : I
    //   10262: iflt -> 10276
    //   10265: ldc2_w -608738732
    //   10268: l2i
    //   10269: ldc_w -323758793
    //   10272: ixor
    //   10273: goto -> 10284
    //   10276: ldc2_w 403413733
    //   10279: l2i
    //   10280: ldc_w 32014190
    //   10283: ixor
    //   10284: ldc2_w 124087713
    //   10287: l2i
    //   10288: ldc_w 630727182
    //   10291: ixor
    //   10292: ixor
    //   10293: lookupswitch default -> 18382, 368703692 -> 10276, 991865380 -> 10320
    //   10320: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10323: ldc2_w 111709627
    //   10326: l2i
    //   10327: ldc_w 111709627
    //   10330: ixor
    //   10331: getstatic Perryc.c : I
    //   10334: iflt -> 10348
    //   10337: ldc2_w 1267505831
    //   10340: l2i
    //   10341: ldc_w -378965548
    //   10344: ixor
    //   10345: goto -> 10356
    //   10348: ldc2_w -1065175678
    //   10351: l2i
    //   10352: ldc_w -300302813
    //   10355: ixor
    //   10356: ldc2_w -186750143
    //   10359: l2i
    //   10360: ldc_w -582064406
    //   10363: ixor
    //   10364: ixor
    //   10365: lookupswitch default -> 18262, -1955207464 -> 10348, 118162954 -> 10392
    //   10392: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10395: ldc2_w 1355669349
    //   10398: l2i
    //   10399: ldc_w 1355669402
    //   10402: ixor
    //   10403: getstatic Perryc.1 : I
    //   10406: ifeq -> 10420
    //   10409: ldc2_w -1999826561
    //   10412: l2i
    //   10413: ldc_w 448049581
    //   10416: ixor
    //   10417: goto -> 10428
    //   10420: ldc2_w 1516973518
    //   10423: l2i
    //   10424: ldc_w 1486882444
    //   10427: ixor
    //   10428: ldc2_w 408349078
    //   10431: l2i
    //   10432: ldc_w -344366205
    //   10435: ixor
    //   10436: ixor
    //   10437: lookupswitch default -> 10464, 1015097265 -> 10420, 1633036999 -> 18550
    //   10464: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10467: getstatic Perryc.0 : I
    //   10470: ifle -> 10484
    //   10473: ldc2_w -1168939842
    //   10476: l2i
    //   10477: ldc_w 1368966817
    //   10480: ixor
    //   10481: goto -> 10492
    //   10484: ldc2_w -2004371734
    //   10487: l2i
    //   10488: ldc_w 1806853666
    //   10491: ixor
    //   10492: ldc2_w -1420455101
    //   10495: l2i
    //   10496: ldc_w 200068231
    //   10499: ixor
    //   10500: ixor
    //   10501: lookupswitch default -> 18528, 1133285132 -> 10528, 1265827291 -> 10484
    //   10528: aload_0
    //   10529: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   10534: getstatic Perryc.1 : I
    //   10537: ifeq -> 10551
    //   10540: ldc2_w -1877659693
    //   10543: l2i
    //   10544: ldc_w -1330338182
    //   10547: ixor
    //   10548: goto -> 10559
    //   10551: ldc2_w 155359970
    //   10554: l2i
    //   10555: ldc_w -1568220505
    //   10558: ixor
    //   10559: ldc2_w 1591654540
    //   10562: l2i
    //   10563: ldc_w -187570237
    //   10566: ixor
    //   10567: ixor
    //   10568: lookupswitch default -> 18626, -1968253210 -> 10551, 30088970 -> 10596
    //   10596: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   10599: getstatic Perryc.1 : I
    //   10602: ifeq -> 10616
    //   10605: ldc2_w -1372959473
    //   10608: l2i
    //   10609: ldc_w -1884506692
    //   10612: ixor
    //   10613: goto -> 10624
    //   10616: ldc2_w -551678382
    //   10619: l2i
    //   10620: ldc_w -1133993523
    //   10623: ixor
    //   10624: ldc2_w -353734174
    //   10627: l2i
    //   10628: ldc_w -788987643
    //   10631: ixor
    //   10632: ixor
    //   10633: lookupswitch default -> 10660, 462784596 -> 18364, 2128677960 -> 10616
    //   10660: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   10663: getstatic Perryc.0 : I
    //   10666: ifle -> 10680
    //   10669: ldc2_w 50051005
    //   10672: l2i
    //   10673: ldc_w -1716312630
    //   10676: ixor
    //   10677: goto -> 10688
    //   10680: ldc2_w -985032201
    //   10683: l2i
    //   10684: ldc_w -510968682
    //   10687: ixor
    //   10688: ldc2_w 1603652415
    //   10691: l2i
    //   10692: ldc_w 92433003
    //   10695: ixor
    //   10696: ixor
    //   10697: lookupswitch default -> 10724, -1050725597 -> 18320, 580952617 -> 10680
    //   10724: putfield green : Lbigname/zprestige/webhack/features/setting/Setting;
    //   10727: getstatic Perryc.1 : I
    //   10730: ifeq -> 10744
    //   10733: ldc2_w 365427277
    //   10736: l2i
    //   10737: ldc_w 765958841
    //   10740: ixor
    //   10741: goto -> 10752
    //   10744: ldc2_w -510730953
    //   10747: l2i
    //   10748: ldc_w 1303804391
    //   10751: ixor
    //   10752: ldc2_w -679887131
    //   10755: l2i
    //   10756: ldc_w 1076775437
    //   10759: ixor
    //   10760: ixor
    //   10761: lookupswitch default -> 18216, -1355312100 -> 10744, 997150776 -> 10788
    //   10788: aload_0
    //   10789: getstatic Perryc.0 : I
    //   10792: ifle -> 10806
    //   10795: ldc2_w 948894498
    //   10798: l2i
    //   10799: ldc_w -1537447105
    //   10802: ixor
    //   10803: goto -> 10814
    //   10806: ldc2_w 13251941
    //   10809: l2i
    //   10810: ldc_w 1660623222
    //   10813: ixor
    //   10814: ldc2_w -1310208259
    //   10817: l2i
    //   10818: ldc_w 955041582
    //   10821: ixor
    //   10822: ixor
    //   10823: lookupswitch default -> 10848, 366582222 -> 18690, 1941895118 -> 10806
    //   10848: aload_0
    //   10849: new bigname/zprestige/webhack/features/setting/Setting
    //   10852: dup
    //   10853: ldc_w '呼㌟吡㶲'
    //   10856: getstatic Perryc.1 : I
    //   10859: ifeq -> 10873
    //   10862: ldc2_w 836007843
    //   10865: l2i
    //   10866: ldc_w 151466281
    //   10869: ixor
    //   10870: goto -> 10881
    //   10873: ldc2_w -10674719
    //   10876: l2i
    //   10877: ldc_w -1013543519
    //   10880: ixor
    //   10881: ldc2_w 1382234783
    //   10884: l2i
    //   10885: ldc_w 1496123428
    //   10888: ixor
    //   10889: ixor
    //   10890: lookupswitch default -> 18504, 865956913 -> 10873, 931504891 -> 10916
    //   10916: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   10919: ldc2_w 552060830
    //   10922: l2i
    //   10923: ldc_w 552060830
    //   10926: ixor
    //   10927: getstatic Perryc.1 : I
    //   10930: ifeq -> 10944
    //   10933: ldc2_w -951824481
    //   10936: l2i
    //   10937: ldc_w -549797316
    //   10940: ixor
    //   10941: goto -> 10952
    //   10944: ldc2_w -1929624144
    //   10947: l2i
    //   10948: ldc_w 965456291
    //   10951: ixor
    //   10952: ldc2_w -2127941800
    //   10955: l2i
    //   10956: ldc_w -502233873
    //   10959: ixor
    //   10960: ixor
    //   10961: lookupswitch default -> 18268, -699572316 -> 10988, 2068063764 -> 10944
    //   10988: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   10991: ldc2_w -2066042365
    //   10994: l2i
    //   10995: ldc_w -2066042365
    //   10998: ixor
    //   10999: getstatic Perryc.0 : I
    //   11002: ifle -> 11016
    //   11005: ldc2_w 508729952
    //   11008: l2i
    //   11009: ldc_w 378108485
    //   11012: ixor
    //   11013: goto -> 11024
    //   11016: ldc2_w -670311882
    //   11019: l2i
    //   11020: ldc_w -694472694
    //   11023: ixor
    //   11024: ldc2_w -389582266
    //   11027: l2i
    //   11028: ldc_w -1594847145
    //   11031: ixor
    //   11032: ixor
    //   11033: lookupswitch default -> 18642, 1089208884 -> 11016, 1185351725 -> 11060
    //   11060: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11063: ldc2_w 21006967
    //   11066: l2i
    //   11067: ldc_w 21006984
    //   11070: ixor
    //   11071: getstatic Perryc.0 : I
    //   11074: ifle -> 11088
    //   11077: ldc2_w -2012761548
    //   11080: l2i
    //   11081: ldc_w -573549556
    //   11084: ixor
    //   11085: goto -> 11096
    //   11088: ldc2_w 638319529
    //   11091: l2i
    //   11092: ldc_w -853991704
    //   11095: ixor
    //   11096: ldc2_w 538284305
    //   11099: l2i
    //   11100: ldc_w -1837964751
    //   11103: ixor
    //   11104: ixor
    //   11105: lookupswitch default -> 11132, -407857896 -> 18210, -114473831 -> 11088
    //   11132: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   11135: getstatic Perryc.c : I
    //   11138: iflt -> 11152
    //   11141: ldc2_w -1151517419
    //   11144: l2i
    //   11145: ldc_w 1714115228
    //   11148: ixor
    //   11149: goto -> 11160
    //   11152: ldc2_w -512505615
    //   11155: l2i
    //   11156: ldc_w -399846527
    //   11159: ixor
    //   11160: ldc2_w 2099209754
    //   11163: l2i
    //   11164: ldc_w 658159871
    //   11167: ixor
    //   11168: ixor
    //   11169: lookupswitch default -> 11196, -2024558228 -> 18192, 435472138 -> 11152
    //   11196: aload_0
    //   11197: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   11202: getstatic Perryc.1 : I
    //   11205: ifeq -> 11219
    //   11208: ldc2_w -613087301
    //   11211: l2i
    //   11212: ldc_w -1815505134
    //   11215: ixor
    //   11216: goto -> 11227
    //   11219: ldc2_w 1009863418
    //   11222: l2i
    //   11223: ldc_w 1977554668
    //   11226: ixor
    //   11227: ldc2_w 1781591067
    //   11230: l2i
    //   11231: ldc_w -277232058
    //   11234: ixor
    //   11235: ixor
    //   11236: lookupswitch default -> 11264, -877853266 -> 11219, -839533836 -> 18654
    //   11264: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   11267: getstatic Perryc.c : I
    //   11270: iflt -> 11284
    //   11273: ldc2_w 657157069
    //   11276: l2i
    //   11277: ldc_w 1161742954
    //   11280: ixor
    //   11281: goto -> 11292
    //   11284: ldc2_w -1637496640
    //   11287: l2i
    //   11288: ldc_w -969647031
    //   11291: ixor
    //   11292: ldc2_w -1906240423
    //   11295: l2i
    //   11296: ldc_w 1867579990
    //   11299: ixor
    //   11300: ixor
    //   11301: lookupswitch default -> 11328, -2094680152 -> 18390, 1382462412 -> 11284
    //   11328: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   11331: getstatic Perryc.1 : I
    //   11334: ifeq -> 11348
    //   11337: ldc2_w 86101154
    //   11340: l2i
    //   11341: ldc_w 378310054
    //   11344: ixor
    //   11345: goto -> 11356
    //   11348: ldc2_w 565106238
    //   11351: l2i
    //   11352: ldc_w 785868264
    //   11355: ixor
    //   11356: ldc2_w 2006672371
    //   11359: l2i
    //   11360: ldc_w 815610563
    //   11363: ixor
    //   11364: ixor
    //   11365: lookupswitch default -> 11392, 1420498996 -> 18222, 1484841925 -> 11348
    //   11392: putfield blue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11395: getstatic Perryc.0 : I
    //   11398: ifle -> 11412
    //   11401: ldc2_w -377811781
    //   11404: l2i
    //   11405: ldc_w 349543257
    //   11408: ixor
    //   11409: goto -> 11420
    //   11412: ldc2_w -1426532476
    //   11415: l2i
    //   11416: ldc_w 1113869552
    //   11419: ixor
    //   11420: ldc2_w -754865652
    //   11423: l2i
    //   11424: ldc_w -94400532
    //   11427: ixor
    //   11428: ixor
    //   11429: lookupswitch default -> 18628, -1044201836 -> 11456, -722423294 -> 11412
    //   11456: aload_0
    //   11457: getstatic Perryc.0 : I
    //   11460: ifle -> 11474
    //   11463: ldc2_w 1714140602
    //   11466: l2i
    //   11467: ldc_w -1705038836
    //   11470: ixor
    //   11471: goto -> 11482
    //   11474: ldc2_w -1383949781
    //   11477: l2i
    //   11478: ldc_w -2087759352
    //   11481: ixor
    //   11482: ldc2_w -372071042
    //   11485: l2i
    //   11486: ldc_w -1439771356
    //   11489: ixor
    //   11490: ixor
    //   11491: lookupswitch default -> 11516, -1081546260 -> 18534, 2071008518 -> 11474
    //   11516: aload_0
    //   11517: new bigname/zprestige/webhack/features/setting/Setting
    //   11520: dup
    //   11521: ldc_w '呬㌒吽㶹뫭๮'
    //   11524: getstatic Perryc.0 : I
    //   11527: ifle -> 11541
    //   11530: ldc2_w -1154163804
    //   11533: l2i
    //   11534: ldc_w -1419680816
    //   11537: ixor
    //   11538: goto -> 11549
    //   11541: ldc2_w -848086121
    //   11544: l2i
    //   11545: ldc_w -830988433
    //   11548: ixor
    //   11549: ldc2_w -1183850094
    //   11552: l2i
    //   11553: ldc_w -2145987939
    //   11556: ixor
    //   11557: ixor
    //   11558: lookupswitch default -> 18182, 690785147 -> 11541, 980555767 -> 11584
    //   11584: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   11587: ldc2_w -1319625989
    //   11590: l2i
    //   11591: ldc_w -1319625989
    //   11594: ixor
    //   11595: getstatic Perryc.1 : I
    //   11598: ifeq -> 11612
    //   11601: ldc2_w -1880924763
    //   11604: l2i
    //   11605: ldc_w -1095150451
    //   11608: ixor
    //   11609: goto -> 11620
    //   11612: ldc2_w -2003556674
    //   11615: l2i
    //   11616: ldc_w 889064944
    //   11619: ixor
    //   11620: ldc2_w -1594843317
    //   11623: l2i
    //   11624: ldc_w 892231665
    //   11627: ixor
    //   11628: ixor
    //   11629: lookupswitch default -> 18256, -1534801518 -> 11612, 699722740 -> 11656
    //   11656: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   11659: getstatic Perryc.0 : I
    //   11662: ifle -> 11676
    //   11665: ldc2_w -497342683
    //   11668: l2i
    //   11669: ldc_w 1926240906
    //   11672: ixor
    //   11673: goto -> 11684
    //   11676: ldc2_w -357613111
    //   11679: l2i
    //   11680: ldc_w -714491967
    //   11683: ixor
    //   11684: ldc2_w 1742475095
    //   11687: l2i
    //   11688: ldc_w 2105743665
    //   11691: ixor
    //   11692: ixor
    //   11693: lookupswitch default -> 18446, -1965806647 -> 11676, 630841454 -> 11720
    //   11720: aload_0
    //   11721: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   11726: getstatic Perryc.c : I
    //   11729: iflt -> 11743
    //   11732: ldc2_w 1672509458
    //   11735: l2i
    //   11736: ldc_w 1800297661
    //   11739: ixor
    //   11740: goto -> 11751
    //   11743: ldc2_w 2109085054
    //   11746: l2i
    //   11747: ldc_w -1344397099
    //   11750: ixor
    //   11751: ldc2_w -1920763052
    //   11754: l2i
    //   11755: ldc_w -1990506426
    //   11758: ixor
    //   11759: ixor
    //   11760: lookupswitch default -> 18450, -693107015 -> 11788, 203823037 -> 11743
    //   11788: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   11791: getstatic Perryc.0 : I
    //   11794: ifle -> 11808
    //   11797: ldc2_w 142900893
    //   11800: l2i
    //   11801: ldc_w -940588378
    //   11804: ixor
    //   11805: goto -> 11816
    //   11808: ldc2_w -1313409411
    //   11811: l2i
    //   11812: ldc_w -1131254057
    //   11815: ixor
    //   11816: ldc2_w -1181786484
    //   11819: l2i
    //   11820: ldc_w 1160033233
    //   11823: ixor
    //   11824: ixor
    //   11825: lookupswitch default -> 11852, -1703044112 -> 11808, 868241766 -> 18242
    //   11852: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   11855: getstatic Perryc.0 : I
    //   11858: ifle -> 11872
    //   11861: ldc2_w 955789012
    //   11864: l2i
    //   11865: ldc_w -1939950287
    //   11868: ixor
    //   11869: goto -> 11880
    //   11872: ldc2_w -733803352
    //   11875: l2i
    //   11876: ldc_w 944413730
    //   11879: ixor
    //   11880: ldc2_w -1808909961
    //   11883: l2i
    //   11884: ldc_w -1284874956
    //   11887: ixor
    //   11888: ixor
    //   11889: lookupswitch default -> 11916, -1813839962 -> 18294, -1006041357 -> 11872
    //   11916: putfield Rainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   11919: getstatic Perryc.c : I
    //   11922: iflt -> 11936
    //   11925: ldc2_w -59613639
    //   11928: l2i
    //   11929: ldc_w 1523675859
    //   11932: ixor
    //   11933: goto -> 11944
    //   11936: ldc2_w 122944049
    //   11939: l2i
    //   11940: ldc_w -1745785807
    //   11943: ixor
    //   11944: ldc2_w 1212475662
    //   11947: l2i
    //   11948: ldc_w 1164350005
    //   11951: ixor
    //   11952: ixor
    //   11953: lookupswitch default -> 18452, -1652495045 -> 11980, -1417586735 -> 11936
    //   11980: aload_0
    //   11981: getstatic Perryc.0 : I
    //   11984: ifle -> 11998
    //   11987: ldc2_w 978073321
    //   11990: l2i
    //   11991: ldc_w 332599666
    //   11994: ixor
    //   11995: goto -> 12006
    //   11998: ldc2_w 1002280638
    //   12001: l2i
    //   12002: ldc_w -859244485
    //   12005: ixor
    //   12006: ldc2_w -148080541
    //   12009: l2i
    //   12010: ldc_w -1575687878
    //   12013: ixor
    //   12014: ixor
    //   12015: lookupswitch default -> 12040, 1158113466 -> 11998, 2091366082 -> 18710
    //   12040: aload_0
    //   12041: new bigname/zprestige/webhack/features/setting/Setting
    //   12044: dup
    //   12045: ldc_w '呿㌟吤㶿'
    //   12048: getstatic Perryc.c : I
    //   12051: iflt -> 12065
    //   12054: ldc2_w -166932038
    //   12057: l2i
    //   12058: ldc_w 1140378631
    //   12061: ixor
    //   12062: goto -> 12073
    //   12065: ldc2_w -1503640319
    //   12068: l2i
    //   12069: ldc_w 666700965
    //   12072: ixor
    //   12073: ldc2_w 194411729
    //   12076: l2i
    //   12077: ldc_w -1744512651
    //   12080: ixor
    //   12081: ixor
    //   12082: lookupswitch default -> 18614, 307227648 -> 12108, 644266009 -> 12065
    //   12108: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   12111: ldc2_w 1669873660
    //   12114: l2i
    //   12115: ldc_w 1669873411
    //   12118: ixor
    //   12119: getstatic Perryc.0 : I
    //   12122: ifle -> 12136
    //   12125: ldc2_w 771882060
    //   12128: l2i
    //   12129: ldc_w 1586095703
    //   12132: ixor
    //   12133: goto -> 12144
    //   12136: ldc2_w -1853734455
    //   12139: l2i
    //   12140: ldc_w -994935466
    //   12143: ixor
    //   12144: ldc2_w 1731115612
    //   12147: l2i
    //   12148: ldc_w -988436709
    //   12151: ixor
    //   12152: ixor
    //   12153: lookupswitch default -> 18418, -760019108 -> 12136, -150265384 -> 12180
    //   12180: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12183: ldc2_w -2129532698
    //   12186: l2i
    //   12187: ldc_w -2129532698
    //   12190: ixor
    //   12191: getstatic Perryc.1 : I
    //   12194: ifeq -> 12208
    //   12197: ldc2_w 256678398
    //   12200: l2i
    //   12201: ldc_w -1555227573
    //   12204: ixor
    //   12205: goto -> 12216
    //   12208: ldc2_w -1432401322
    //   12211: l2i
    //   12212: ldc_w 327700930
    //   12215: ixor
    //   12216: ldc2_w -1270269788
    //   12219: l2i
    //   12220: ldc_w -1260726419
    //   12223: ixor
    //   12224: ixor
    //   12225: lookupswitch default -> 18322, -1399690628 -> 12208, -1182469027 -> 12252
    //   12252: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12255: ldc2_w 1307110975
    //   12258: l2i
    //   12259: ldc_w 1307111104
    //   12262: ixor
    //   12263: getstatic Perryc.0 : I
    //   12266: ifle -> 12280
    //   12269: ldc2_w -1050006718
    //   12272: l2i
    //   12273: ldc_w 486847050
    //   12276: ixor
    //   12277: goto -> 12288
    //   12280: ldc2_w 78124009
    //   12283: l2i
    //   12284: ldc_w -243870910
    //   12287: ixor
    //   12288: ldc2_w -704263552
    //   12291: l2i
    //   12292: ldc_w 2123237498
    //   12295: ixor
    //   12296: ixor
    //   12297: lookupswitch default -> 18588, 1565852241 -> 12324, 1961188338 -> 12280
    //   12324: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12327: getstatic Perryc.1 : I
    //   12330: ifeq -> 12344
    //   12333: ldc2_w 826107425
    //   12336: l2i
    //   12337: ldc_w -33753806
    //   12340: ixor
    //   12341: goto -> 12352
    //   12344: ldc2_w -1025930475
    //   12347: l2i
    //   12348: ldc_w -67086013
    //   12351: ixor
    //   12352: ldc2_w -1353747541
    //   12355: l2i
    //   12356: ldc_w 482399078
    //   12359: ixor
    //   12360: ixor
    //   12361: lookupswitch default -> 12388, 1268626978 -> 12344, 2135831518 -> 18398
    //   12388: aload_0
    //   12389: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   12394: getstatic Perryc.0 : I
    //   12397: ifle -> 12411
    //   12400: ldc2_w -1989960875
    //   12403: l2i
    //   12404: ldc_w 461866541
    //   12407: ixor
    //   12408: goto -> 12419
    //   12411: ldc2_w -1777273693
    //   12414: l2i
    //   12415: ldc_w -949478242
    //   12418: ixor
    //   12419: ldc2_w 861461551
    //   12422: l2i
    //   12423: ldc_w 666779893
    //   12426: ixor
    //   12427: ixor
    //   12428: lookupswitch default -> 18404, -2046656094 -> 12411, 1168012519 -> 12456
    //   12456: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   12459: getstatic Perryc.1 : I
    //   12462: ifeq -> 12476
    //   12465: ldc2_w -1600011379
    //   12468: l2i
    //   12469: ldc_w 1519493768
    //   12472: ixor
    //   12473: goto -> 12484
    //   12476: ldc2_w 1674632402
    //   12479: l2i
    //   12480: ldc_w -2019072880
    //   12483: ixor
    //   12484: ldc2_w -1286431086
    //   12487: l2i
    //   12488: ldc_w 1376915934
    //   12491: ixor
    //   12492: ixor
    //   12493: lookupswitch default -> 12520, 460385865 -> 18502, 1656574695 -> 12476
    //   12520: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   12523: getstatic Perryc.c : I
    //   12526: iflt -> 12540
    //   12529: ldc2_w 1888371507
    //   12532: l2i
    //   12533: ldc_w 1748618026
    //   12536: ixor
    //   12537: goto -> 12548
    //   12540: ldc2_w -1405638226
    //   12543: l2i
    //   12544: ldc_w -1490326218
    //   12547: ixor
    //   12548: ldc2_w -1748627199
    //   12551: l2i
    //   12552: ldc_w 1671851864
    //   12555: ixor
    //   12556: ixor
    //   12557: lookupswitch default -> 12584, -321391040 -> 18416, 372447576 -> 12540
    //   12584: putfield alpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   12587: getstatic Perryc.1 : I
    //   12590: ifeq -> 12604
    //   12593: ldc2_w -919089800
    //   12596: l2i
    //   12597: ldc_w 86238510
    //   12600: ixor
    //   12601: goto -> 12612
    //   12604: ldc2_w -2113651322
    //   12607: l2i
    //   12608: ldc_w 901028118
    //   12611: ixor
    //   12612: ldc2_w -714412553
    //   12615: l2i
    //   12616: ldc_w 45214045
    //   12619: ixor
    //   12620: ixor
    //   12621: lookupswitch default -> 18488, 466562300 -> 12604, 1617666106 -> 12648
    //   12648: aload_0
    //   12649: getstatic Perryc.1 : I
    //   12652: ifeq -> 12666
    //   12655: ldc2_w 1671977692
    //   12658: l2i
    //   12659: ldc_w 847402552
    //   12662: ixor
    //   12663: goto -> 12674
    //   12666: ldc2_w -1398627876
    //   12669: l2i
    //   12670: ldc_w -192979116
    //   12673: ixor
    //   12674: ldc2_w 944910772
    //   12677: l2i
    //   12678: ldc_w -1851405510
    //   12681: ixor
    //   12682: ixor
    //   12683: lookupswitch default -> 12708, -119671190 -> 18350, 1921465846 -> 12666
    //   12708: aload_0
    //   12709: new bigname/zprestige/webhack/features/setting/Setting
    //   12712: dup
    //   12713: ldc_w '呼㌜听㶖뫲๱⧲'
    //   12716: getstatic Perryc.1 : I
    //   12719: ifeq -> 12733
    //   12722: ldc2_w 770909851
    //   12725: l2i
    //   12726: ldc_w 195157481
    //   12729: ixor
    //   12730: goto -> 12741
    //   12733: ldc2_w 1164888747
    //   12736: l2i
    //   12737: ldc_w 2013499140
    //   12740: ixor
    //   12741: ldc2_w -290539466
    //   12744: l2i
    //   12745: ldc_w -1082433581
    //   12748: ixor
    //   12749: ixor
    //   12750: lookupswitch default -> 12776, -1389278703 -> 12733, 2005343383 -> 18180
    //   12776: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   12779: ldc2_w -1292611697
    //   12782: l2i
    //   12783: ldc_w -1292611598
    //   12786: ixor
    //   12787: getstatic Perryc.c : I
    //   12790: iflt -> 12804
    //   12793: ldc2_w 245156887
    //   12796: l2i
    //   12797: ldc_w -771500792
    //   12800: ixor
    //   12801: goto -> 12812
    //   12804: ldc2_w 2051204298
    //   12807: l2i
    //   12808: ldc_w -227936076
    //   12811: ixor
    //   12812: ldc2_w -875457875
    //   12815: l2i
    //   12816: ldc_w 1053813835
    //   12819: ixor
    //   12820: ixor
    //   12821: lookupswitch default -> 12848, -597365392 -> 12804, 696346617 -> 18212
    //   12848: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12851: ldc2_w -1675361809
    //   12854: l2i
    //   12855: ldc_w -1675361809
    //   12858: ixor
    //   12859: getstatic Perryc.c : I
    //   12862: iflt -> 12876
    //   12865: ldc2_w 605997665
    //   12868: l2i
    //   12869: ldc_w -1384684907
    //   12872: ixor
    //   12873: goto -> 12884
    //   12876: ldc2_w -1074706325
    //   12879: l2i
    //   12880: ldc_w -1286127900
    //   12883: ixor
    //   12884: ldc2_w -1954841967
    //   12887: l2i
    //   12888: ldc_w 954722236
    //   12891: ixor
    //   12892: ixor
    //   12893: lookupswitch default -> 12920, 989148633 -> 18228, 1214892543 -> 12876
    //   12920: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12923: ldc2_w 1225399340
    //   12926: l2i
    //   12927: ldc_w 1225399507
    //   12930: ixor
    //   12931: getstatic Perryc.0 : I
    //   12934: ifle -> 12948
    //   12937: ldc2_w -1560109257
    //   12940: l2i
    //   12941: ldc_w -409413051
    //   12944: ixor
    //   12945: goto -> 12956
    //   12948: ldc2_w 791015981
    //   12951: l2i
    //   12952: ldc_w 603978543
    //   12955: ixor
    //   12956: ldc2_w -658199890
    //   12959: l2i
    //   12960: ldc_w -1272214567
    //   12963: ixor
    //   12964: ixor
    //   12965: lookupswitch default -> 12992, -359849403 -> 12948, 678781957 -> 18526
    //   12992: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   12995: getstatic Perryc.c : I
    //   12998: iflt -> 13012
    //   13001: ldc2_w 171090726
    //   13004: l2i
    //   13005: ldc_w -1065186309
    //   13008: ixor
    //   13009: goto -> 13020
    //   13012: ldc2_w 761353486
    //   13015: l2i
    //   13016: ldc_w 720447145
    //   13019: ixor
    //   13020: ldc2_w -223218428
    //   13023: l2i
    //   13024: ldc_w -750680269
    //   13027: ixor
    //   13028: ixor
    //   13029: lookupswitch default -> 13056, -1715630282 -> 13012, -348103958 -> 18214
    //   13056: aload_0
    //   13057: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   13062: getstatic Perryc.0 : I
    //   13065: ifle -> 13079
    //   13068: ldc2_w -1776713570
    //   13071: l2i
    //   13072: ldc_w -1858623618
    //   13075: ixor
    //   13076: goto -> 13087
    //   13079: ldc2_w 1443627405
    //   13082: l2i
    //   13083: ldc_w 1342834650
    //   13086: ixor
    //   13087: ldc2_w 1546660034
    //   13090: l2i
    //   13091: ldc_w 2008736042
    //   13094: ixor
    //   13095: ixor
    //   13096: lookupswitch default -> 13124, 749006344 -> 18280, 1605823890 -> 13079
    //   13124: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   13127: getstatic Perryc.0 : I
    //   13130: ifle -> 13144
    //   13133: ldc2_w -795831223
    //   13136: l2i
    //   13137: ldc_w 204987885
    //   13140: ixor
    //   13141: goto -> 13152
    //   13144: ldc2_w 257620478
    //   13147: l2i
    //   13148: ldc_w 441046581
    //   13151: ixor
    //   13152: ldc2_w 459313530
    //   13155: l2i
    //   13156: ldc_w 1800905520
    //   13159: ixor
    //   13160: ixor
    //   13161: lookupswitch default -> 18582, -1399817234 -> 13144, 1696865665 -> 13188
    //   13188: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   13191: getstatic Perryc.c : I
    //   13194: iflt -> 13208
    //   13197: ldc2_w -838376782
    //   13200: l2i
    //   13201: ldc_w -1968942795
    //   13204: ixor
    //   13205: goto -> 13216
    //   13208: ldc2_w -1908749806
    //   13211: l2i
    //   13212: ldc_w -1015070038
    //   13215: ixor
    //   13216: ldc2_w 1272510331
    //   13219: l2i
    //   13220: ldc_w 760205445
    //   13223: ixor
    //   13224: ixor
    //   13225: lookupswitch default -> 18632, 573838457 -> 13208, 735227718 -> 13252
    //   13252: putfield boxAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13255: getstatic Perryc.1 : I
    //   13258: ifeq -> 13272
    //   13261: ldc2_w -820452548
    //   13264: l2i
    //   13265: ldc_w -1784480892
    //   13268: ixor
    //   13269: goto -> 13280
    //   13272: ldc2_w -941744042
    //   13275: l2i
    //   13276: ldc_w -1738293627
    //   13279: ixor
    //   13280: ldc2_w -943630014
    //   13283: l2i
    //   13284: ldc_w -454326826
    //   13287: ixor
    //   13288: ixor
    //   13289: lookupswitch default -> 18482, 2039530540 -> 13272, 2090287687 -> 13316
    //   13316: aload_0
    //   13317: getstatic Perryc.c : I
    //   13320: iflt -> 13334
    //   13323: ldc2_w -2022347541
    //   13326: l2i
    //   13327: ldc_w 936781028
    //   13330: ixor
    //   13331: goto -> 13342
    //   13334: ldc2_w 2099380610
    //   13337: l2i
    //   13338: ldc_w 1233552278
    //   13341: ixor
    //   13342: ldc2_w 179454236
    //   13345: l2i
    //   13346: ldc_w 1259782927
    //   13349: ixor
    //   13350: ixor
    //   13351: lookupswitch default -> 13376, -251147748 -> 18558, 1142575941 -> 13334
    //   13376: aload_0
    //   13377: new bigname/zprestige/webhack/features/setting/Setting
    //   13380: dup
    //   13381: ldc_w '呱㌆吠㶻뫬๼'
    //   13384: getstatic Perryc.0 : I
    //   13387: ifle -> 13401
    //   13390: ldc2_w 325666668
    //   13393: l2i
    //   13394: ldc_w -546653091
    //   13397: ixor
    //   13398: goto -> 13409
    //   13401: ldc2_w 340885102
    //   13404: l2i
    //   13405: ldc_w -27055134
    //   13408: ixor
    //   13409: ldc2_w -7936322
    //   13412: l2i
    //   13413: ldc_w -212199384
    //   13416: ixor
    //   13417: ixor
    //   13418: lookupswitch default -> 18486, -1059125849 -> 13401, -420566246 -> 13444
    //   13444: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   13447: ldc2_w 312068716
    //   13450: l2i
    //   13451: ldc_w 312068716
    //   13454: ixor
    //   13455: getstatic Perryc.0 : I
    //   13458: ifle -> 13472
    //   13461: ldc2_w 1184165240
    //   13464: l2i
    //   13465: ldc_w 1900563496
    //   13468: ixor
    //   13469: goto -> 13480
    //   13472: ldc2_w -1385356359
    //   13475: l2i
    //   13476: ldc_w 2025799748
    //   13479: ixor
    //   13480: ldc2_w 1683655606
    //   13483: l2i
    //   13484: ldc_w -129373273
    //   13487: ixor
    //   13488: ixor
    //   13489: lookupswitch default -> 18604, -1412447935 -> 13472, 1237386220 -> 13516
    //   13516: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   13519: getstatic Perryc.1 : I
    //   13522: ifeq -> 13536
    //   13525: ldc2_w 503013725
    //   13528: l2i
    //   13529: ldc_w 1463481014
    //   13532: ixor
    //   13533: goto -> 13544
    //   13536: ldc2_w -822945602
    //   13539: l2i
    //   13540: ldc_w 255801524
    //   13543: ixor
    //   13544: ldc2_w 1927819242
    //   13547: l2i
    //   13548: ldc_w 914883924
    //   13551: ixor
    //   13552: ixor
    //   13553: lookupswitch default -> 18662, -2052207948 -> 13580, 245479765 -> 13536
    //   13580: aload_0
    //   13581: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   13586: getstatic Perryc.c : I
    //   13589: iflt -> 13603
    //   13592: ldc2_w -1084581378
    //   13595: l2i
    //   13596: ldc_w -394738397
    //   13599: ixor
    //   13600: goto -> 13611
    //   13603: ldc2_w -1495687272
    //   13606: l2i
    //   13607: ldc_w -1603086726
    //   13610: ixor
    //   13611: ldc2_w 1375236936
    //   13614: l2i
    //   13615: ldc_w 1538498005
    //   13618: ixor
    //   13619: ixor
    //   13620: lookupswitch default -> 13648, -1713922447 -> 13603, 1567208000 -> 18458
    //   13648: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   13651: getstatic Perryc.1 : I
    //   13654: ifeq -> 13668
    //   13657: ldc2_w 1358948325
    //   13660: l2i
    //   13661: ldc_w 1289100366
    //   13664: ixor
    //   13665: goto -> 13676
    //   13668: ldc2_w -1654319994
    //   13671: l2i
    //   13672: ldc_w 1311152767
    //   13675: ixor
    //   13676: ldc2_w 2028409225
    //   13679: l2i
    //   13680: ldc_w 945442231
    //   13683: ixor
    //   13684: ixor
    //   13685: lookupswitch default -> 13712, 117275400 -> 13668, 1553246101 -> 18204
    //   13712: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   13715: getstatic Perryc.1 : I
    //   13718: ifeq -> 13732
    //   13721: ldc2_w -8478487
    //   13724: l2i
    //   13725: ldc_w 645955624
    //   13728: ixor
    //   13729: goto -> 13740
    //   13732: ldc2_w -1395106928
    //   13735: l2i
    //   13736: ldc_w -1129372015
    //   13739: ixor
    //   13740: ldc2_w 519133094
    //   13743: l2i
    //   13744: ldc_w 2021443266
    //   13747: ixor
    //   13748: ixor
    //   13749: lookupswitch default -> 18318, -1082936923 -> 13732, 1996156005 -> 13776
    //   13776: putfield outline : Lbigname/zprestige/webhack/features/setting/Setting;
    //   13779: getstatic Perryc.c : I
    //   13782: iflt -> 13796
    //   13785: ldc2_w 615056983
    //   13788: l2i
    //   13789: ldc_w -429913567
    //   13792: ixor
    //   13793: goto -> 13804
    //   13796: ldc2_w 1348533996
    //   13799: l2i
    //   13800: ldc_w -970863167
    //   13803: ixor
    //   13804: ldc2_w -1617121650
    //   13807: l2i
    //   13808: ldc_w 1902900526
    //   13811: ixor
    //   13812: ixor
    //   13813: lookupswitch default -> 13840, -780482704 -> 13796, 742283222 -> 18352
    //   13840: aload_0
    //   13841: getstatic Perryc.0 : I
    //   13844: ifle -> 13858
    //   13847: ldc2_w 1200058104
    //   13850: l2i
    //   13851: ldc_w 968338228
    //   13854: ixor
    //   13855: goto -> 13866
    //   13858: ldc2_w -1966845845
    //   13861: l2i
    //   13862: ldc_w -1751982928
    //   13865: ixor
    //   13866: ldc2_w 1499865592
    //   13869: l2i
    //   13870: ldc_w -688390526
    //   13873: ixor
    //   13874: ixor
    //   13875: lookupswitch default -> 18206, -1832430687 -> 13900, -241100106 -> 13858
    //   13900: aload_0
    //   13901: new bigname/zprestige/webhack/features/setting/Setting
    //   13904: dup
    //   13905: ldc_w '呱㌿呹㶅뫦'
    //   13908: getstatic Perryc.0 : I
    //   13911: ifle -> 13925
    //   13914: ldc2_w -1459311103
    //   13917: l2i
    //   13918: ldc_w 1413462539
    //   13921: ixor
    //   13922: goto -> 13933
    //   13925: ldc2_w 1024526631
    //   13928: l2i
    //   13929: ldc_w 209091583
    //   13932: ixor
    //   13933: ldc2_w -845025553
    //   13936: l2i
    //   13937: ldc_w 756958381
    //   13940: ixor
    //   13941: ixor
    //   13942: lookupswitch default -> 18424, -774317926 -> 13968, 495238728 -> 13925
    //   13968: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   13971: ldc2_w -1458005873
    //   13974: l2i
    //   13975: ldc_w -1458005873
    //   13978: ixor
    //   13979: getstatic Perryc.c : I
    //   13982: iflt -> 13996
    //   13985: ldc2_w 362435180
    //   13988: l2i
    //   13989: ldc_w 501236465
    //   13992: ixor
    //   13993: goto -> 14004
    //   13996: ldc2_w -39064745
    //   13999: l2i
    //   14000: ldc_w 1248343854
    //   14003: ixor
    //   14004: ldc2_w -1947885669
    //   14007: l2i
    //   14008: ldc_w 756946910
    //   14011: ixor
    //   14012: ixor
    //   14013: lookupswitch default -> 18668, -1367238440 -> 13996, 288904252 -> 14040
    //   14040: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14043: ldc2_w 739223408
    //   14046: l2i
    //   14047: ldc_w 739223408
    //   14050: ixor
    //   14051: getstatic Perryc.1 : I
    //   14054: ifeq -> 14068
    //   14057: ldc2_w -2079790449
    //   14060: l2i
    //   14061: ldc_w -1995402909
    //   14064: ixor
    //   14065: goto -> 14076
    //   14068: ldc2_w -1488730727
    //   14071: l2i
    //   14072: ldc_w -890709882
    //   14075: ixor
    //   14076: ldc2_w -1346187549
    //   14079: l2i
    //   14080: ldc_w -1680158302
    //   14083: ixor
    //   14084: ixor
    //   14085: lookupswitch default -> 14112, -1732807533 -> 14068, 956327085 -> 18480
    //   14112: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14115: ldc2_w 1847997218
    //   14118: l2i
    //   14119: ldc_w 1847997405
    //   14122: ixor
    //   14123: getstatic Perryc.c : I
    //   14126: iflt -> 14140
    //   14129: ldc2_w 227703964
    //   14132: l2i
    //   14133: ldc_w -1828400309
    //   14136: ixor
    //   14137: goto -> 14148
    //   14140: ldc2_w 1688658136
    //   14143: l2i
    //   14144: ldc_w 189637431
    //   14147: ixor
    //   14148: ldc2_w -1905749858
    //   14151: l2i
    //   14152: ldc_w -1799967374
    //   14155: ixor
    //   14156: ixor
    //   14157: lookupswitch default -> 18312, -2075618757 -> 14140, 1966439939 -> 14184
    //   14184: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14187: getstatic Perryc.c : I
    //   14190: iflt -> 14204
    //   14193: ldc2_w -404904791
    //   14196: l2i
    //   14197: ldc_w 440613129
    //   14200: ixor
    //   14201: goto -> 14212
    //   14204: ldc2_w -1518300571
    //   14207: l2i
    //   14208: ldc_w 368481638
    //   14211: ixor
    //   14212: ldc2_w -1122424799
    //   14215: l2i
    //   14216: ldc_w -529221599
    //   14219: ixor
    //   14220: ixor
    //   14221: lookupswitch default -> 18478, -1594684000 -> 14204, -316958973 -> 14248
    //   14248: aload_0
    //   14249: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   14254: getstatic Perryc.1 : I
    //   14257: ifeq -> 14271
    //   14260: ldc2_w -434627621
    //   14263: l2i
    //   14264: ldc_w -1505948017
    //   14267: ixor
    //   14268: goto -> 14279
    //   14271: ldc2_w 720502197
    //   14274: l2i
    //   14275: ldc_w 823292855
    //   14278: ixor
    //   14279: ldc2_w 1603736892
    //   14282: l2i
    //   14283: ldc_w 852377257
    //   14286: ixor
    //   14287: ixor
    //   14288: lookupswitch default -> 18512, 763117249 -> 14271, 1991943575 -> 14316
    //   14316: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   14319: getstatic Perryc.1 : I
    //   14322: ifeq -> 14336
    //   14325: ldc2_w 1732394637
    //   14328: l2i
    //   14329: ldc_w 250064998
    //   14332: ixor
    //   14333: goto -> 14344
    //   14336: ldc2_w 607036998
    //   14339: l2i
    //   14340: ldc_w -99139941
    //   14343: ixor
    //   14344: ldc2_w -292608913
    //   14347: l2i
    //   14348: ldc_w 1772363017
    //   14351: ixor
    //   14352: ixor
    //   14353: lookupswitch default -> 14380, -1630823616 -> 14336, -292636787 -> 18324
    //   14380: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   14383: getstatic Perryc.0 : I
    //   14386: ifle -> 14400
    //   14389: ldc2_w -291451732
    //   14392: l2i
    //   14393: ldc_w 807997746
    //   14396: ixor
    //   14397: goto -> 14408
    //   14400: ldc2_w 1297025005
    //   14403: l2i
    //   14404: ldc_w 1015729803
    //   14407: ixor
    //   14408: ldc2_w -1394595697
    //   14411: l2i
    //   14412: ldc_w 817981759
    //   14415: ixor
    //   14416: ixor
    //   14417: lookupswitch default -> 18682, -303789866 -> 14444, 1118346286 -> 14400
    //   14444: putfield cRed : Lbigname/zprestige/webhack/features/setting/Setting;
    //   14447: getstatic Perryc.0 : I
    //   14450: ifle -> 14464
    //   14453: ldc2_w 482745291
    //   14456: l2i
    //   14457: ldc_w 1128427488
    //   14460: ixor
    //   14461: goto -> 14472
    //   14464: ldc2_w -147750535
    //   14467: l2i
    //   14468: ldc_w -1841365225
    //   14471: ixor
    //   14472: ldc2_w 894194955
    //   14475: l2i
    //   14476: ldc_w 1834854920
    //   14479: ixor
    //   14480: ixor
    //   14481: lookupswitch default -> 14508, 127241000 -> 18438, 797845156 -> 14464
    //   14508: aload_0
    //   14509: getstatic Perryc.1 : I
    //   14512: ifeq -> 14526
    //   14515: ldc2_w -729976547
    //   14518: l2i
    //   14519: ldc_w -1147160435
    //   14522: ixor
    //   14523: goto -> 14534
    //   14526: ldc2_w 986391231
    //   14529: l2i
    //   14530: ldc_w -1018714779
    //   14533: ixor
    //   14534: ldc2_w -984420553
    //   14537: l2i
    //   14538: ldc_w -2029013673
    //   14541: ixor
    //   14542: ixor
    //   14543: lookupswitch default -> 18600, -1143874118 -> 14568, 767529968 -> 14526
    //   14568: aload_0
    //   14569: new bigname/zprestige/webhack/features/setting/Setting
    //   14572: dup
    //   14573: ldc_w '呱㌿呹㶐뫧๼⧽'
    //   14576: getstatic Perryc.c : I
    //   14579: iflt -> 14593
    //   14582: ldc2_w 1527608706
    //   14585: l2i
    //   14586: ldc_w -2142005970
    //   14589: ixor
    //   14590: goto -> 14601
    //   14593: ldc2_w -710445073
    //   14596: l2i
    //   14597: ldc_w 1355767747
    //   14600: ixor
    //   14601: ldc2_w -2090966282
    //   14604: l2i
    //   14605: ldc_w 1594953404
    //   14608: ixor
    //   14609: ixor
    //   14610: lookupswitch default -> 18622, 118590694 -> 14593, 1495745638 -> 14636
    //   14636: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   14639: ldc2_w 1233563549
    //   14642: l2i
    //   14643: ldc_w 1233563549
    //   14646: ixor
    //   14647: getstatic Perryc.1 : I
    //   14650: ifeq -> 14664
    //   14653: ldc2_w 2046346475
    //   14656: l2i
    //   14657: ldc_w 808792680
    //   14660: ixor
    //   14661: goto -> 14672
    //   14664: ldc2_w 1102704763
    //   14667: l2i
    //   14668: ldc_w -1809091140
    //   14671: ixor
    //   14672: ldc2_w -1130027678
    //   14675: l2i
    //   14676: ldc_w 900311101
    //   14679: ixor
    //   14680: ixor
    //   14681: lookupswitch default -> 18410, -1061061668 -> 14664, 1553860760 -> 14708
    //   14708: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14711: ldc2_w 1243191974
    //   14714: l2i
    //   14715: ldc_w 1243191974
    //   14718: ixor
    //   14719: getstatic Perryc.0 : I
    //   14722: ifle -> 14736
    //   14725: ldc2_w 566877144
    //   14728: l2i
    //   14729: ldc_w 1616922975
    //   14732: ixor
    //   14733: goto -> 14744
    //   14736: ldc2_w -881507727
    //   14739: l2i
    //   14740: ldc_w 1585152419
    //   14743: ixor
    //   14744: ldc2_w -282763357
    //   14747: l2i
    //   14748: ldc_w 902425469
    //   14751: ixor
    //   14752: ixor
    //   14753: lookupswitch default -> 14780, -1689967015 -> 18494, -1094028662 -> 14736
    //   14780: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14783: ldc2_w 575448635
    //   14786: l2i
    //   14787: ldc_w 575448772
    //   14790: ixor
    //   14791: getstatic Perryc.c : I
    //   14794: iflt -> 14808
    //   14797: ldc2_w 1621190031
    //   14800: l2i
    //   14801: ldc_w -713399100
    //   14804: ixor
    //   14805: goto -> 14816
    //   14808: ldc2_w 91620482
    //   14811: l2i
    //   14812: ldc_w 858331073
    //   14815: ixor
    //   14816: ldc2_w 1889036593
    //   14819: l2i
    //   14820: ldc_w -1088279382
    //   14823: ixor
    //   14824: ixor
    //   14825: lookupswitch default -> 14852, -1259252123 -> 14808, 2053194960 -> 18238
    //   14852: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   14855: getstatic Perryc.0 : I
    //   14858: ifle -> 14872
    //   14861: ldc2_w -1015865851
    //   14864: l2i
    //   14865: ldc_w -853904658
    //   14868: ixor
    //   14869: goto -> 14880
    //   14872: ldc2_w 416283649
    //   14875: l2i
    //   14876: ldc_w -692251541
    //   14879: ixor
    //   14880: ldc2_w 1382229596
    //   14883: l2i
    //   14884: ldc_w -176013571
    //   14887: ixor
    //   14888: ixor
    //   14889: lookupswitch default -> 14916, -1993846993 -> 14872, -1450675126 -> 18700
    //   14916: aload_0
    //   14917: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   14922: getstatic Perryc.0 : I
    //   14925: ifle -> 14939
    //   14928: ldc2_w 2053225892
    //   14931: l2i
    //   14932: ldc_w -143119072
    //   14935: ixor
    //   14936: goto -> 14947
    //   14939: ldc2_w -973703641
    //   14942: l2i
    //   14943: ldc_w -1303057627
    //   14946: ixor
    //   14947: ldc2_w -1942034029
    //   14950: l2i
    //   14951: ldc_w -1386077713
    //   14954: ixor
    //   14955: ixor
    //   14956: lookupswitch default -> 14984, -1404741384 -> 18230, 360936059 -> 14939
    //   14984: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   14987: getstatic Perryc.c : I
    //   14990: iflt -> 15004
    //   14993: ldc2_w -126287177
    //   14996: l2i
    //   14997: ldc_w -2006685602
    //   15000: ixor
    //   15001: goto -> 15012
    //   15004: ldc2_w -1547671359
    //   15007: l2i
    //   15008: ldc_w 473677233
    //   15011: ixor
    //   15012: ldc2_w 1711996036
    //   15015: l2i
    //   15016: ldc_w 1289739208
    //   15019: ixor
    //   15020: ixor
    //   15021: lookupswitch default -> 18334, -1792085444 -> 15048, 1523076517 -> 15004
    //   15048: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   15051: getstatic Perryc.0 : I
    //   15054: ifle -> 15068
    //   15057: ldc2_w -1205321355
    //   15060: l2i
    //   15061: ldc_w -1912590428
    //   15064: ixor
    //   15065: goto -> 15076
    //   15068: ldc2_w 1233454340
    //   15071: l2i
    //   15072: ldc_w 851578564
    //   15075: ixor
    //   15076: ldc2_w -828799123
    //   15079: l2i
    //   15080: ldc_w -537209199
    //   15083: ixor
    //   15084: ixor
    //   15085: lookupswitch default -> 15112, -1686671161 -> 15068, 659242797 -> 18542
    //   15112: putfield cGreen : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15115: getstatic Perryc.1 : I
    //   15118: ifeq -> 15132
    //   15121: ldc2_w 1595166154
    //   15124: l2i
    //   15125: ldc_w 508919279
    //   15128: ixor
    //   15129: goto -> 15140
    //   15132: ldc2_w -570048884
    //   15135: l2i
    //   15136: ldc_w -161802758
    //   15139: ixor
    //   15140: ldc2_w 1022775915
    //   15143: l2i
    //   15144: ldc_w -2074211977
    //   15147: ixor
    //   15148: ixor
    //   15149: lookupswitch default -> 18248, -1862864790 -> 15176, -102143175 -> 15132
    //   15176: aload_0
    //   15177: getstatic Perryc.1 : I
    //   15180: ifeq -> 15194
    //   15183: ldc2_w -244961382
    //   15186: l2i
    //   15187: ldc_w -610368591
    //   15190: ixor
    //   15191: goto -> 15202
    //   15194: ldc2_w -803963278
    //   15197: l2i
    //   15198: ldc_w -1568344389
    //   15201: ixor
    //   15202: ldc2_w 584099998
    //   15205: l2i
    //   15206: ldc_w -1477298643
    //   15209: ixor
    //   15210: ixor
    //   15211: lookupswitch default -> 15236, -1344654696 -> 18276, -650957942 -> 15194
    //   15236: aload_0
    //   15237: new bigname/zprestige/webhack/features/setting/Setting
    //   15240: dup
    //   15241: ldc_w '呱㌿呹㶕뫷๼'
    //   15244: getstatic Perryc.0 : I
    //   15247: ifle -> 15261
    //   15250: ldc2_w 2116493904
    //   15253: l2i
    //   15254: ldc_w 621563670
    //   15257: ixor
    //   15258: goto -> 15269
    //   15261: ldc2_w -2044644679
    //   15264: l2i
    //   15265: ldc_w -580133396
    //   15268: ixor
    //   15269: ldc2_w 1075525512
    //   15272: l2i
    //   15273: ldc_w -607060729
    //   15276: ixor
    //   15277: ixor
    //   15278: lookupswitch default -> 18414, -1065277990 -> 15304, -1059018807 -> 15261
    //   15304: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   15307: ldc2_w 802200987
    //   15310: l2i
    //   15311: ldc_w 802200932
    //   15314: ixor
    //   15315: getstatic Perryc.0 : I
    //   15318: ifle -> 15332
    //   15321: ldc2_w -2089629669
    //   15324: l2i
    //   15325: ldc_w -1835628394
    //   15328: ixor
    //   15329: goto -> 15340
    //   15332: ldc2_w 238659776
    //   15335: l2i
    //   15336: ldc_w 149286649
    //   15339: ixor
    //   15340: ldc2_w -2131780136
    //   15343: l2i
    //   15344: ldc_w 1666250373
    //   15347: ixor
    //   15348: ixor
    //   15349: lookupswitch default -> 15376, -228906032 -> 18376, 836104212 -> 15332
    //   15376: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15379: ldc2_w -393113382
    //   15382: l2i
    //   15383: ldc_w -393113382
    //   15386: ixor
    //   15387: getstatic Perryc.0 : I
    //   15390: ifle -> 15404
    //   15393: ldc2_w -193244007
    //   15396: l2i
    //   15397: ldc_w -1442098479
    //   15400: ixor
    //   15401: goto -> 15412
    //   15404: ldc2_w -2018574580
    //   15407: l2i
    //   15408: ldc_w 53553641
    //   15411: ixor
    //   15412: ldc2_w 182728859
    //   15415: l2i
    //   15416: ldc_w -962173474
    //   15419: ixor
    //   15420: ixor
    //   15421: lookupswitch default -> 15448, -1842193651 -> 18234, -1264058022 -> 15404
    //   15448: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15451: ldc2_w 1367139585
    //   15454: l2i
    //   15455: ldc_w 1367139838
    //   15458: ixor
    //   15459: getstatic Perryc.0 : I
    //   15462: ifle -> 15476
    //   15465: ldc2_w 721719584
    //   15468: l2i
    //   15469: ldc_w -892023032
    //   15472: ixor
    //   15473: goto -> 15484
    //   15476: ldc2_w -216209682
    //   15479: l2i
    //   15480: ldc_w 1978277158
    //   15483: ixor
    //   15484: ldc2_w 2057831375
    //   15487: l2i
    //   15488: ldc_w -363963320
    //   15491: ixor
    //   15492: ixor
    //   15493: lookupswitch default -> 18326, 370189391 -> 15520, 1899364783 -> 15476
    //   15520: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   15523: getstatic Perryc.1 : I
    //   15526: ifeq -> 15540
    //   15529: ldc2_w -1585052951
    //   15532: l2i
    //   15533: ldc_w -2103957000
    //   15536: ixor
    //   15537: goto -> 15548
    //   15540: ldc2_w 226484205
    //   15543: l2i
    //   15544: ldc_w -1773697750
    //   15547: ixor
    //   15548: ldc2_w 762341672
    //   15551: l2i
    //   15552: ldc_w -634910485
    //   15555: ixor
    //   15556: ixor
    //   15557: lookupswitch default -> 18706, -733590830 -> 15540, 1818245892 -> 15584
    //   15584: aload_0
    //   15585: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   15590: getstatic Perryc.1 : I
    //   15593: ifeq -> 15607
    //   15596: ldc2_w -2089327650
    //   15599: l2i
    //   15600: ldc_w -513025970
    //   15603: ixor
    //   15604: goto -> 15615
    //   15607: ldc2_w 519374897
    //   15610: l2i
    //   15611: ldc_w 1844391260
    //   15614: ixor
    //   15615: ldc2_w 654773045
    //   15618: l2i
    //   15619: ldc_w -1313049370
    //   15622: ixor
    //   15623: ixor
    //   15624: lookupswitch default -> 18470, -442410306 -> 15652, -190331837 -> 15607
    //   15652: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   15655: getstatic Perryc.1 : I
    //   15658: ifeq -> 15672
    //   15661: ldc2_w -706107785
    //   15664: l2i
    //   15665: ldc_w 1830615054
    //   15668: ixor
    //   15669: goto -> 15680
    //   15672: ldc2_w -1540385109
    //   15675: l2i
    //   15676: ldc_w -2060403801
    //   15679: ixor
    //   15680: ldc2_w 1724109038
    //   15683: l2i
    //   15684: ldc_w 1716043479
    //   15687: ixor
    //   15688: ixor
    //   15689: lookupswitch default -> 15716, -1199689664 -> 18694, -567763244 -> 15672
    //   15716: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   15719: getstatic Perryc.c : I
    //   15722: iflt -> 15736
    //   15725: ldc2_w 2041184215
    //   15728: l2i
    //   15729: ldc_w -1194876566
    //   15732: ixor
    //   15733: goto -> 15744
    //   15736: ldc2_w -753668809
    //   15739: l2i
    //   15740: ldc_w 1211802589
    //   15743: ixor
    //   15744: ldc2_w -1931505817
    //   15747: l2i
    //   15748: ldc_w 1399370648
    //   15751: ixor
    //   15752: ixor
    //   15753: lookupswitch default -> 18372, 517562946 -> 15736, 1151234581 -> 15780
    //   15780: putfield cBlue : Lbigname/zprestige/webhack/features/setting/Setting;
    //   15783: getstatic Perryc.1 : I
    //   15786: ifeq -> 15800
    //   15789: ldc2_w 891668282
    //   15792: l2i
    //   15793: ldc_w 1710052475
    //   15796: ixor
    //   15797: goto -> 15808
    //   15800: ldc2_w -2094367792
    //   15803: l2i
    //   15804: ldc_w 1836659581
    //   15807: ixor
    //   15808: ldc2_w 547232325
    //   15811: l2i
    //   15812: ldc_w -1505315742
    //   15815: ixor
    //   15816: ixor
    //   15817: lookupswitch default -> 15844, -703578778 -> 18524, 2061292053 -> 15800
    //   15844: aload_0
    //   15845: getstatic Perryc.0 : I
    //   15848: ifle -> 15862
    //   15851: ldc2_w 1951627233
    //   15854: l2i
    //   15855: ldc_w -1287962422
    //   15858: ixor
    //   15859: goto -> 15870
    //   15862: ldc2_w 1254728195
    //   15865: l2i
    //   15866: ldc_w -1110214052
    //   15869: ixor
    //   15870: ldc2_w -873439384
    //   15873: l2i
    //   15874: ldc_w -805871613
    //   15877: ixor
    //   15878: ixor
    //   15879: lookupswitch default -> 18168, -1016133568 -> 15862, -216144076 -> 15904
    //   15904: aload_0
    //   15905: new bigname/zprestige/webhack/features/setting/Setting
    //   15908: dup
    //   15909: ldc_w '呱㌿呹㶅뫫๷⧱蹬뼴'
    //   15912: getstatic Perryc.1 : I
    //   15915: ifeq -> 15929
    //   15918: ldc2_w 1825006784
    //   15921: l2i
    //   15922: ldc_w -873101491
    //   15925: ixor
    //   15926: goto -> 15937
    //   15929: ldc2_w 1268747167
    //   15932: l2i
    //   15933: ldc_w 1586382796
    //   15936: ixor
    //   15937: ldc2_w 36293780
    //   15940: l2i
    //   15941: ldc_w -790346225
    //   15944: ixor
    //   15945: ixor
    //   15946: lookupswitch default -> 15972, -323512561 -> 15929, 1979672854 -> 18244
    //   15972: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   15975: ldc2_w -203121531
    //   15978: l2i
    //   15979: ldc_w -203121531
    //   15982: ixor
    //   15983: getstatic Perryc.1 : I
    //   15986: ifeq -> 16000
    //   15989: ldc2_w -89271953
    //   15992: l2i
    //   15993: ldc_w -455145991
    //   15996: ixor
    //   15997: goto -> 16008
    //   16000: ldc2_w -2043425318
    //   16003: l2i
    //   16004: ldc_w 1628033647
    //   16007: ixor
    //   16008: ldc2_w 1201896340
    //   16011: l2i
    //   16012: ldc_w -1914408176
    //   16015: ixor
    //   16016: ixor
    //   16017: lookupswitch default -> 16044, -734667758 -> 18264, 286783637 -> 16000
    //   16044: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   16047: getstatic Perryc.c : I
    //   16050: iflt -> 16064
    //   16053: ldc2_w -1363962753
    //   16056: l2i
    //   16057: ldc_w 1775432145
    //   16060: ixor
    //   16061: goto -> 16072
    //   16064: ldc2_w -445585880
    //   16067: l2i
    //   16068: ldc_w -1654961360
    //   16071: ixor
    //   16072: ldc2_w 533793599
    //   16075: l2i
    //   16076: ldc_w 1559109117
    //   16079: ixor
    //   16080: ixor
    //   16081: lookupswitch default -> 16108, -2074184852 -> 18250, 428638978 -> 16064
    //   16108: aload_0
    //   16109: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   16114: getstatic Perryc.1 : I
    //   16117: ifeq -> 16131
    //   16120: ldc2_w 1364295781
    //   16123: l2i
    //   16124: ldc_w 1545508033
    //   16127: ixor
    //   16128: goto -> 16139
    //   16131: ldc2_w 301965470
    //   16134: l2i
    //   16135: ldc_w -262574064
    //   16138: ixor
    //   16139: ldc2_w -168155845
    //   16142: l2i
    //   16143: ldc_w -1895305081
    //   16146: ixor
    //   16147: ixor
    //   16148: lookupswitch default -> 18546, -1688533710 -> 16176, 2008203544 -> 16131
    //   16176: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   16179: getstatic Perryc.c : I
    //   16182: iflt -> 16196
    //   16185: ldc2_w 388452979
    //   16188: l2i
    //   16189: ldc_w 579061728
    //   16192: ixor
    //   16193: goto -> 16204
    //   16196: ldc2_w 1070909005
    //   16199: l2i
    //   16200: ldc_w -260517321
    //   16203: ixor
    //   16204: ldc2_w -1925078996
    //   16207: l2i
    //   16208: ldc_w -2124745034
    //   16211: ixor
    //   16212: ixor
    //   16213: lookupswitch default -> 16240, 968868617 -> 18712, 1748169915 -> 16196
    //   16240: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   16243: getstatic Perryc.1 : I
    //   16246: ifeq -> 16260
    //   16249: ldc2_w -1921747375
    //   16252: l2i
    //   16253: ldc_w -340141147
    //   16256: ixor
    //   16257: goto -> 16268
    //   16260: ldc2_w -953583986
    //   16263: l2i
    //   16264: ldc_w -444187569
    //   16267: ixor
    //   16268: ldc2_w 624775005
    //   16271: l2i
    //   16272: ldc_w -1688925454
    //   16275: ixor
    //   16276: ixor
    //   16277: lookupswitch default -> 16304, -660215717 -> 18284, 530814524 -> 16260
    //   16304: putfield cRainbow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16307: getstatic Perryc.0 : I
    //   16310: ifle -> 16324
    //   16313: ldc2_w 1374218621
    //   16316: l2i
    //   16317: ldc_w -252240996
    //   16320: ixor
    //   16321: goto -> 16332
    //   16324: ldc2_w -1024669959
    //   16327: l2i
    //   16328: ldc_w 1937630127
    //   16331: ixor
    //   16332: ldc2_w -1825714125
    //   16335: l2i
    //   16336: ldc_w 546350573
    //   16339: ixor
    //   16340: ixor
    //   16341: lookupswitch default -> 16368, -1600102013 -> 16324, 312641343 -> 18286
    //   16368: aload_0
    //   16369: getstatic Perryc.1 : I
    //   16372: ifeq -> 16386
    //   16375: ldc2_w 968226502
    //   16378: l2i
    //   16379: ldc_w -598903471
    //   16382: ixor
    //   16383: goto -> 16394
    //   16386: ldc2_w 371379686
    //   16389: l2i
    //   16390: ldc_w -1771404598
    //   16393: ixor
    //   16394: ldc2_w -983510649
    //   16397: l2i
    //   16398: ldc_w 217988854
    //   16401: ixor
    //   16402: ixor
    //   16403: lookupswitch default -> 16428, 744910054 -> 18518, 1133697268 -> 16386
    //   16428: aload_0
    //   16429: new bigname/zprestige/webhack/features/setting/Setting
    //   16432: dup
    //   16433: ldc_w '呱㌿呹㶖뫲๱⧲'
    //   16436: getstatic Perryc.c : I
    //   16439: iflt -> 16453
    //   16442: ldc2_w 1520009180
    //   16445: l2i
    //   16446: ldc_w -155150528
    //   16449: ixor
    //   16450: goto -> 16461
    //   16453: ldc2_w 261873279
    //   16456: l2i
    //   16457: ldc_w 399634478
    //   16460: ixor
    //   16461: ldc2_w -1557658963
    //   16464: l2i
    //   16465: ldc_w -128224464
    //   16468: ixor
    //   16469: ixor
    //   16470: lookupswitch default -> 18172, -148203263 -> 16453, 1127833548 -> 16496
    //   16496: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   16499: ldc2_w 824712000
    //   16502: l2i
    //   16503: ldc_w 824712127
    //   16506: ixor
    //   16507: getstatic Perryc.0 : I
    //   16510: ifle -> 16524
    //   16513: ldc2_w 10588038
    //   16516: l2i
    //   16517: ldc_w -1536505438
    //   16520: ixor
    //   16521: goto -> 16532
    //   16524: ldc2_w -660629099
    //   16527: l2i
    //   16528: ldc_w 695612084
    //   16531: ixor
    //   16532: ldc2_w 277266003
    //   16535: l2i
    //   16536: ldc_w -2089000639
    //   16539: ixor
    //   16540: ixor
    //   16541: lookupswitch default -> 16568, 239264884 -> 16524, 925997366 -> 18374
    //   16568: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   16571: ldc2_w 918149785
    //   16574: l2i
    //   16575: ldc_w 918149785
    //   16578: ixor
    //   16579: getstatic Perryc.0 : I
    //   16582: ifle -> 16596
    //   16585: ldc2_w -1127109047
    //   16588: l2i
    //   16589: ldc_w -1794555073
    //   16592: ixor
    //   16593: goto -> 16604
    //   16596: ldc2_w -231593663
    //   16599: l2i
    //   16600: ldc_w 230478244
    //   16603: ixor
    //   16604: ldc2_w 1950717648
    //   16607: l2i
    //   16608: ldc_w 1775148972
    //   16611: ixor
    //   16612: ixor
    //   16613: lookupswitch default -> 16640, -1935146089 -> 16596, 877913098 -> 18246
    //   16640: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   16643: ldc2_w 1058713456
    //   16646: l2i
    //   16647: ldc_w 1058713487
    //   16650: ixor
    //   16651: getstatic Perryc.c : I
    //   16654: iflt -> 16668
    //   16657: ldc2_w -1519554998
    //   16660: l2i
    //   16661: ldc_w 1247151769
    //   16664: ixor
    //   16665: goto -> 16676
    //   16668: ldc2_w 965815569
    //   16671: l2i
    //   16672: ldc_w 94694257
    //   16675: ixor
    //   16676: ldc2_w -700337461
    //   16679: l2i
    //   16680: ldc_w 181546866
    //   16683: ixor
    //   16684: ixor
    //   16685: lookupswitch default -> 16712, -657331192 -> 16668, 866710890 -> 18514
    //   16712: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   16715: getstatic Perryc.1 : I
    //   16718: ifeq -> 16732
    //   16721: ldc2_w 720239065
    //   16724: l2i
    //   16725: ldc_w 2060003241
    //   16728: ixor
    //   16729: goto -> 16740
    //   16732: ldc2_w 1794435357
    //   16735: l2i
    //   16736: ldc_w -1121611693
    //   16739: ixor
    //   16740: ldc2_w -1122792283
    //   16743: l2i
    //   16744: ldc_w 480087321
    //   16747: ixor
    //   16748: ixor
    //   16749: lookupswitch default -> 18304, -240459828 -> 16732, 1985968370 -> 16776
    //   16776: aload_0
    //   16777: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   16782: getstatic Perryc.0 : I
    //   16785: ifle -> 16799
    //   16788: ldc2_w 1222893313
    //   16791: l2i
    //   16792: ldc_w -785070807
    //   16795: ixor
    //   16796: goto -> 16807
    //   16799: ldc2_w -695969911
    //   16802: l2i
    //   16803: ldc_w 1037587475
    //   16806: ixor
    //   16807: ldc2_w 345092365
    //   16810: l2i
    //   16811: ldc_w 1500388630
    //   16814: ixor
    //   16815: ixor
    //   16816: lookupswitch default -> 18544, -1499222143 -> 16844, -735529421 -> 16799
    //   16844: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   16847: getstatic Perryc.1 : I
    //   16850: ifeq -> 16864
    //   16853: ldc2_w 985188402
    //   16856: l2i
    //   16857: ldc_w -465231967
    //   16860: ixor
    //   16861: goto -> 16872
    //   16864: ldc2_w -385934639
    //   16867: l2i
    //   16868: ldc_w -287962576
    //   16871: ixor
    //   16872: ldc2_w 1138661480
    //   16875: l2i
    //   16876: ldc_w -577896024
    //   16879: ixor
    //   16880: ixor
    //   16881: lookupswitch default -> 16908, -2068525326 -> 16864, 1085099603 -> 18660
    //   16908: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   16911: getstatic Perryc.c : I
    //   16914: iflt -> 16928
    //   16917: ldc2_w 244435147
    //   16920: l2i
    //   16921: ldc_w -1622407550
    //   16924: ixor
    //   16925: goto -> 16936
    //   16928: ldc2_w -876189485
    //   16931: l2i
    //   16932: ldc_w 272854212
    //   16935: ixor
    //   16936: ldc2_w -1820043997
    //   16939: l2i
    //   16940: ldc_w 1114491107
    //   16943: ixor
    //   16944: ixor
    //   16945: lookupswitch default -> 18460, 174889431 -> 16972, 1077171081 -> 16928
    //   16972: putfield cAlpha : Lbigname/zprestige/webhack/features/setting/Setting;
    //   16975: getstatic Perryc.0 : I
    //   16978: ifle -> 16992
    //   16981: ldc2_w -640305020
    //   16984: l2i
    //   16985: ldc_w 1290051214
    //   16988: ixor
    //   16989: goto -> 17000
    //   16992: ldc2_w 1150001861
    //   16995: l2i
    //   16996: ldc_w -2143908672
    //   16999: ixor
    //   17000: ldc2_w -1308920814
    //   17003: l2i
    //   17004: ldc_w -1326684326
    //   17007: ixor
    //   17008: ixor
    //   17009: lookupswitch default -> 18664, -1809435326 -> 16992, -978698931 -> 17036
    //   17036: aload_0
    //   17037: getstatic Perryc.1 : I
    //   17040: ifeq -> 17054
    //   17043: ldc2_w -1223271675
    //   17046: l2i
    //   17047: ldc_w -218302135
    //   17050: ixor
    //   17051: goto -> 17062
    //   17054: ldc2_w 404555858
    //   17057: l2i
    //   17058: ldc_w -1639523744
    //   17061: ixor
    //   17062: ldc2_w 1744938614
    //   17065: l2i
    //   17066: ldc_w -1791332573
    //   17069: ixor
    //   17070: ixor
    //   17071: lookupswitch default -> 18380, -1194235111 -> 17054, 2069896039 -> 17096
    //   17096: aload_0
    //   17097: new bigname/zprestige/webhack/features/setting/Setting
    //   17100: dup
    //   17101: ldc_w '呲㌚吺㶲뫫๽⧧蹫'
    //   17104: getstatic Perryc.c : I
    //   17107: iflt -> 17121
    //   17110: ldc2_w -350799423
    //   17113: l2i
    //   17114: ldc_w -1536236480
    //   17117: ixor
    //   17118: goto -> 17129
    //   17121: ldc2_w 1400958383
    //   17124: l2i
    //   17125: ldc_w 462084165
    //   17128: ixor
    //   17129: ldc2_w 640264604
    //   17132: l2i
    //   17133: ldc_w -697156409
    //   17136: ixor
    //   17137: ixor
    //   17138: lookupswitch default -> 17164, -1088272166 -> 18462, -250777255 -> 17121
    //   17164: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   17167: ldc_w 6.8847632
    //   17170: invokestatic floatToIntBits : (F)I
    //   17173: ldc_w 2136756219
    //   17176: ixor
    //   17177: invokestatic intBitsToFloat : (I)F
    //   17180: getstatic Perryc.0 : I
    //   17183: ifle -> 17197
    //   17186: ldc2_w 1441892887
    //   17189: l2i
    //   17190: ldc_w 467005169
    //   17193: ixor
    //   17194: goto -> 17205
    //   17197: ldc2_w 634014293
    //   17200: l2i
    //   17201: ldc_w -456119183
    //   17204: ixor
    //   17205: ldc2_w 2103349340
    //   17208: l2i
    //   17209: ldc_w -92825315
    //   17212: ixor
    //   17213: ixor
    //   17214: lookupswitch default -> 18570, -921866841 -> 17197, 1177775973 -> 17240
    //   17240: invokestatic valueOf : (F)Ljava/lang/Float;
    //   17243: ldc_w 99.02038
    //   17246: invokestatic floatToIntBits : (F)I
    //   17249: ldc_w 2131412642
    //   17252: ixor
    //   17253: invokestatic intBitsToFloat : (I)F
    //   17256: getstatic Perryc.c : I
    //   17259: iflt -> 17273
    //   17262: ldc2_w 1672938059
    //   17265: l2i
    //   17266: ldc_w -846109418
    //   17269: ixor
    //   17270: goto -> 17281
    //   17273: ldc2_w -1065653867
    //   17276: l2i
    //   17277: ldc_w 1043938352
    //   17280: ixor
    //   17281: ldc2_w -161290300
    //   17284: l2i
    //   17285: ldc_w 439247944
    //   17288: ixor
    //   17289: ixor
    //   17290: lookupswitch default -> 17316, -1661586828 -> 17273, 1114301649 -> 18306
    //   17316: invokestatic valueOf : (F)Ljava/lang/Float;
    //   17319: ldc_w 1.7283415
    //   17322: invokestatic floatToIntBits : (F)I
    //   17325: ldc_w 2138913355
    //   17328: ixor
    //   17329: invokestatic intBitsToFloat : (I)F
    //   17332: getstatic Perryc.1 : I
    //   17335: ifeq -> 17349
    //   17338: ldc2_w -581718927
    //   17341: l2i
    //   17342: ldc_w 901468020
    //   17345: ixor
    //   17346: goto -> 17357
    //   17349: ldc2_w -1510994531
    //   17352: l2i
    //   17353: ldc_w 1455615649
    //   17356: ixor
    //   17357: ldc2_w 1225872306
    //   17360: l2i
    //   17361: ldc_w 1461028180
    //   17364: ixor
    //   17365: ixor
    //   17366: lookupswitch default -> 17392, -1096856882 -> 17349, -152291869 -> 18224
    //   17392: invokestatic valueOf : (F)Ljava/lang/Float;
    //   17395: getstatic Perryc.1 : I
    //   17398: ifeq -> 17412
    //   17401: ldc2_w 1586199984
    //   17404: l2i
    //   17405: ldc_w -1284420889
    //   17408: ixor
    //   17409: goto -> 17420
    //   17412: ldc2_w 1158919634
    //   17415: l2i
    //   17416: ldc_w -104472006
    //   17419: ixor
    //   17420: ldc2_w -388707780
    //   17423: l2i
    //   17424: ldc_w -442929297
    //   17427: ixor
    //   17428: ixor
    //   17429: lookupswitch default -> 18358, -1315179845 -> 17456, -524840444 -> 17412
    //   17456: aload_0
    //   17457: <illegal opcode> test : (Lbigname/zprestige/webhack/features/modules/Player/Speedmine;)Ljava/util/function/Predicate;
    //   17462: getstatic Perryc.c : I
    //   17465: iflt -> 17479
    //   17468: ldc2_w 689831045
    //   17471: l2i
    //   17472: ldc_w -244832187
    //   17475: ixor
    //   17476: goto -> 17487
    //   17479: ldc2_w 785050033
    //   17482: l2i
    //   17483: ldc_w -161923764
    //   17486: ixor
    //   17487: ldc2_w 1171522037
    //   17490: l2i
    //   17491: ldc_w 1723461674
    //   17494: ixor
    //   17495: ixor
    //   17496: lookupswitch default -> 18624, -82303713 -> 17479, -67230430 -> 17524
    //   17524: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Predicate;)V
    //   17527: getstatic Perryc.c : I
    //   17530: iflt -> 17544
    //   17533: ldc2_w 738745070
    //   17536: l2i
    //   17537: ldc_w 1592817827
    //   17540: ixor
    //   17541: goto -> 17552
    //   17544: ldc2_w 63006224
    //   17547: l2i
    //   17548: ldc_w -358262004
    //   17551: ixor
    //   17552: ldc2_w 1341578213
    //   17555: l2i
    //   17556: ldc_w -773294429
    //   17559: ixor
    //   17560: ixor
    //   17561: lookupswitch default -> 18342, -320434421 -> 17544, 2004521050 -> 17588
    //   17588: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   17591: getstatic Perryc.1 : I
    //   17594: ifeq -> 17608
    //   17597: ldc2_w -1833735453
    //   17600: l2i
    //   17601: ldc_w -919430813
    //   17604: ixor
    //   17605: goto -> 17616
    //   17608: ldc2_w -1790745060
    //   17611: l2i
    //   17612: ldc_w -1358284666
    //   17615: ixor
    //   17616: ldc2_w -1862409451
    //   17619: l2i
    //   17620: ldc_w -1549722482
    //   17623: ixor
    //   17624: ixor
    //   17625: lookupswitch default -> 18676, 152412417 -> 17652, 1759317019 -> 17608
    //   17652: putfield lineWidth : Lbigname/zprestige/webhack/features/setting/Setting;
    //   17655: getstatic Perryc.0 : I
    //   17658: ifle -> 17672
    //   17661: ldc2_w 798676674
    //   17664: l2i
    //   17665: ldc_w -2099887428
    //   17668: ixor
    //   17669: goto -> 17680
    //   17672: ldc2_w -204906995
    //   17675: l2i
    //   17676: ldc_w -1086612628
    //   17679: ixor
    //   17680: ldc2_w -1770011069
    //   17683: l2i
    //   17684: ldc_w 1680056332
    //   17687: ixor
    //   17688: ixor
    //   17689: lookupswitch default -> 17716, -1125713182 -> 17672, 1594946097 -> 18496
    //   17716: aload_0
    //   17717: ldc2_w 1360720525
    //   17720: l2i
    //   17721: ldc_w 1360720525
    //   17724: ixor
    //   17725: getstatic Perryc.1 : I
    //   17728: ifeq -> 17742
    //   17731: ldc2_w 246304563
    //   17734: l2i
    //   17735: ldc_w -1174137452
    //   17738: ixor
    //   17739: goto -> 17750
    //   17742: ldc2_w 1378634189
    //   17745: l2i
    //   17746: ldc_w -1693763344
    //   17749: ixor
    //   17750: ldc2_w -224934280
    //   17753: l2i
    //   17754: ldc_w 1242681007
    //   17757: ixor
    //   17758: ixor
    //   17759: lookupswitch default -> 18314, 204231280 -> 17742, 1906407914 -> 17784
    //   17784: putfield isMining : Z
    //   17787: getstatic Perryc.1 : I
    //   17790: ifeq -> 17804
    //   17793: ldc2_w 639455668
    //   17796: l2i
    //   17797: ldc_w -1966565527
    //   17800: ixor
    //   17801: goto -> 17812
    //   17804: ldc2_w -74099562
    //   17807: l2i
    //   17808: ldc_w -1602141366
    //   17811: ixor
    //   17812: ldc2_w 751887551
    //   17815: l2i
    //   17816: ldc_w -1999854272
    //   17819: ixor
    //   17820: ixor
    //   17821: lookupswitch default -> 17848, -134500490 -> 17804, 147425058 -> 18444
    //   17848: aload_0
    //   17849: aconst_null
    //   17850: getstatic Perryc.c : I
    //   17853: iflt -> 17867
    //   17856: ldc2_w 1850589536
    //   17859: l2i
    //   17860: ldc_w 2120684611
    //   17863: ixor
    //   17864: goto -> 17875
    //   17867: ldc2_w 259552360
    //   17870: l2i
    //   17871: ldc_w 1895984747
    //   17874: ixor
    //   17875: ldc2_w -889971046
    //   17878: l2i
    //   17879: ldc_w -694877073
    //   17882: ixor
    //   17883: ixor
    //   17884: lookupswitch default -> 18574, 206294998 -> 17867, 1645936886 -> 17912
    //   17912: putfield lastPos : Lnet/minecraft/util/math/BlockPos;
    //   17915: getstatic Perryc.1 : I
    //   17918: ifeq -> 17932
    //   17921: ldc2_w 1337356517
    //   17924: l2i
    //   17925: ldc_w -1164413658
    //   17928: ixor
    //   17929: goto -> 17940
    //   17932: ldc2_w 343519071
    //   17935: l2i
    //   17936: ldc_w -501700962
    //   17939: ixor
    //   17940: ldc2_w -1397670192
    //   17943: l2i
    //   17944: ldc_w -193497732
    //   17947: ixor
    //   17948: ixor
    //   17949: lookupswitch default -> 18208, -1377284497 -> 17932, -1364770195 -> 17976
    //   17976: aload_0
    //   17977: aconst_null
    //   17978: getstatic Perryc.0 : I
    //   17981: ifle -> 17995
    //   17984: ldc2_w -1204412133
    //   17987: l2i
    //   17988: ldc_w -1217597788
    //   17991: ixor
    //   17992: goto -> 18003
    //   17995: ldc2_w 580576043
    //   17998: l2i
    //   17999: ldc_w -1096526574
    //   18002: ixor
    //   18003: ldc2_w 1985843977
    //   18006: l2i
    //   18007: ldc_w 1229162197
    //   18010: ixor
    //   18011: ixor
    //   18012: lookupswitch default -> 18040, -509780262 -> 17995, 809818723 -> 18232
    //   18040: putfield lastFacing : Lnet/minecraft/util/EnumFacing;
    //   18043: getstatic Perryc.1 : I
    //   18046: ifeq -> 18060
    //   18049: ldc2_w -1666224467
    //   18052: l2i
    //   18053: ldc_w -198137325
    //   18056: ixor
    //   18057: goto -> 18068
    //   18060: ldc2_w 79379950
    //   18063: l2i
    //   18064: ldc_w 1086071017
    //   18067: ixor
    //   18068: ldc2_w 305489470
    //   18071: l2i
    //   18072: ldc_w 1343574764
    //   18075: ixor
    //   18076: ixor
    //   18077: lookupswitch default -> 18420, 103229909 -> 18104, 717221996 -> 18060
    //   18104: aload_0
    //   18105: getstatic Perryc.0 : I
    //   18108: ifle -> 18122
    //   18111: ldc2_w -564300721
    //   18114: l2i
    //   18115: ldc_w -1799241697
    //   18118: ixor
    //   18119: goto -> 18130
    //   18122: ldc2_w -1501225266
    //   18125: l2i
    //   18126: ldc_w -1426834843
    //   18129: ixor
    //   18130: ldc2_w -899698717
    //   18133: l2i
    //   18134: ldc_w -511789794
    //   18137: ixor
    //   18138: ixor
    //   18139: lookupswitch default -> 18596, 659570262 -> 18164, 1639820973 -> 18122
    //   18164: invokespecial setInstance : ()V
    //   18167: return
    //   18168: aconst_null
    //   18169: athrow
    //   18170: aconst_null
    //   18171: athrow
    //   18172: aconst_null
    //   18173: athrow
    //   18174: aconst_null
    //   18175: athrow
    //   18176: aconst_null
    //   18177: athrow
    //   18178: aconst_null
    //   18179: athrow
    //   18180: aconst_null
    //   18181: athrow
    //   18182: aconst_null
    //   18183: athrow
    //   18184: aconst_null
    //   18185: athrow
    //   18186: aconst_null
    //   18187: athrow
    //   18188: aconst_null
    //   18189: athrow
    //   18190: aconst_null
    //   18191: athrow
    //   18192: aconst_null
    //   18193: athrow
    //   18194: aconst_null
    //   18195: athrow
    //   18196: aconst_null
    //   18197: athrow
    //   18198: aconst_null
    //   18199: athrow
    //   18200: aconst_null
    //   18201: athrow
    //   18202: aconst_null
    //   18203: athrow
    //   18204: aconst_null
    //   18205: athrow
    //   18206: aconst_null
    //   18207: athrow
    //   18208: aconst_null
    //   18209: athrow
    //   18210: aconst_null
    //   18211: athrow
    //   18212: aconst_null
    //   18213: athrow
    //   18214: aconst_null
    //   18215: athrow
    //   18216: aconst_null
    //   18217: athrow
    //   18218: aconst_null
    //   18219: athrow
    //   18220: aconst_null
    //   18221: athrow
    //   18222: aconst_null
    //   18223: athrow
    //   18224: aconst_null
    //   18225: athrow
    //   18226: aconst_null
    //   18227: athrow
    //   18228: aconst_null
    //   18229: athrow
    //   18230: aconst_null
    //   18231: athrow
    //   18232: aconst_null
    //   18233: athrow
    //   18234: aconst_null
    //   18235: athrow
    //   18236: aconst_null
    //   18237: athrow
    //   18238: aconst_null
    //   18239: athrow
    //   18240: aconst_null
    //   18241: athrow
    //   18242: aconst_null
    //   18243: athrow
    //   18244: aconst_null
    //   18245: athrow
    //   18246: aconst_null
    //   18247: athrow
    //   18248: aconst_null
    //   18249: athrow
    //   18250: aconst_null
    //   18251: athrow
    //   18252: aconst_null
    //   18253: athrow
    //   18254: aconst_null
    //   18255: athrow
    //   18256: aconst_null
    //   18257: athrow
    //   18258: aconst_null
    //   18259: athrow
    //   18260: aconst_null
    //   18261: athrow
    //   18262: aconst_null
    //   18263: athrow
    //   18264: aconst_null
    //   18265: athrow
    //   18266: aconst_null
    //   18267: athrow
    //   18268: aconst_null
    //   18269: athrow
    //   18270: aconst_null
    //   18271: athrow
    //   18272: aconst_null
    //   18273: athrow
    //   18274: aconst_null
    //   18275: athrow
    //   18276: aconst_null
    //   18277: athrow
    //   18278: aconst_null
    //   18279: athrow
    //   18280: aconst_null
    //   18281: athrow
    //   18282: aconst_null
    //   18283: athrow
    //   18284: aconst_null
    //   18285: athrow
    //   18286: aconst_null
    //   18287: athrow
    //   18288: aconst_null
    //   18289: athrow
    //   18290: aconst_null
    //   18291: athrow
    //   18292: aconst_null
    //   18293: athrow
    //   18294: aconst_null
    //   18295: athrow
    //   18296: aconst_null
    //   18297: athrow
    //   18298: aconst_null
    //   18299: athrow
    //   18300: aconst_null
    //   18301: athrow
    //   18302: aconst_null
    //   18303: athrow
    //   18304: aconst_null
    //   18305: athrow
    //   18306: aconst_null
    //   18307: athrow
    //   18308: aconst_null
    //   18309: athrow
    //   18310: aconst_null
    //   18311: athrow
    //   18312: aconst_null
    //   18313: athrow
    //   18314: aconst_null
    //   18315: athrow
    //   18316: aconst_null
    //   18317: athrow
    //   18318: aconst_null
    //   18319: athrow
    //   18320: aconst_null
    //   18321: athrow
    //   18322: aconst_null
    //   18323: athrow
    //   18324: aconst_null
    //   18325: athrow
    //   18326: aconst_null
    //   18327: athrow
    //   18328: aconst_null
    //   18329: athrow
    //   18330: aconst_null
    //   18331: athrow
    //   18332: aconst_null
    //   18333: athrow
    //   18334: aconst_null
    //   18335: athrow
    //   18336: aconst_null
    //   18337: athrow
    //   18338: aconst_null
    //   18339: athrow
    //   18340: aconst_null
    //   18341: athrow
    //   18342: aconst_null
    //   18343: athrow
    //   18344: aconst_null
    //   18345: athrow
    //   18346: aconst_null
    //   18347: athrow
    //   18348: aconst_null
    //   18349: athrow
    //   18350: aconst_null
    //   18351: athrow
    //   18352: aconst_null
    //   18353: athrow
    //   18354: aconst_null
    //   18355: athrow
    //   18356: aconst_null
    //   18357: athrow
    //   18358: aconst_null
    //   18359: athrow
    //   18360: aconst_null
    //   18361: athrow
    //   18362: aconst_null
    //   18363: athrow
    //   18364: aconst_null
    //   18365: athrow
    //   18366: aconst_null
    //   18367: athrow
    //   18368: aconst_null
    //   18369: athrow
    //   18370: aconst_null
    //   18371: athrow
    //   18372: aconst_null
    //   18373: athrow
    //   18374: aconst_null
    //   18375: athrow
    //   18376: aconst_null
    //   18377: athrow
    //   18378: aconst_null
    //   18379: athrow
    //   18380: aconst_null
    //   18381: athrow
    //   18382: aconst_null
    //   18383: athrow
    //   18384: aconst_null
    //   18385: athrow
    //   18386: aconst_null
    //   18387: athrow
    //   18388: aconst_null
    //   18389: athrow
    //   18390: aconst_null
    //   18391: athrow
    //   18392: aconst_null
    //   18393: athrow
    //   18394: aconst_null
    //   18395: athrow
    //   18396: aconst_null
    //   18397: athrow
    //   18398: aconst_null
    //   18399: athrow
    //   18400: aconst_null
    //   18401: athrow
    //   18402: aconst_null
    //   18403: athrow
    //   18404: aconst_null
    //   18405: athrow
    //   18406: aconst_null
    //   18407: athrow
    //   18408: aconst_null
    //   18409: athrow
    //   18410: aconst_null
    //   18411: athrow
    //   18412: aconst_null
    //   18413: athrow
    //   18414: aconst_null
    //   18415: athrow
    //   18416: aconst_null
    //   18417: athrow
    //   18418: aconst_null
    //   18419: athrow
    //   18420: aconst_null
    //   18421: athrow
    //   18422: aconst_null
    //   18423: athrow
    //   18424: aconst_null
    //   18425: athrow
    //   18426: aconst_null
    //   18427: athrow
    //   18428: aconst_null
    //   18429: athrow
    //   18430: aconst_null
    //   18431: athrow
    //   18432: aconst_null
    //   18433: athrow
    //   18434: aconst_null
    //   18435: athrow
    //   18436: aconst_null
    //   18437: athrow
    //   18438: aconst_null
    //   18439: athrow
    //   18440: aconst_null
    //   18441: athrow
    //   18442: aconst_null
    //   18443: athrow
    //   18444: aconst_null
    //   18445: athrow
    //   18446: aconst_null
    //   18447: athrow
    //   18448: aconst_null
    //   18449: athrow
    //   18450: aconst_null
    //   18451: athrow
    //   18452: aconst_null
    //   18453: athrow
    //   18454: aconst_null
    //   18455: athrow
    //   18456: aconst_null
    //   18457: athrow
    //   18458: aconst_null
    //   18459: athrow
    //   18460: aconst_null
    //   18461: athrow
    //   18462: aconst_null
    //   18463: athrow
    //   18464: aconst_null
    //   18465: athrow
    //   18466: aconst_null
    //   18467: athrow
    //   18468: aconst_null
    //   18469: athrow
    //   18470: aconst_null
    //   18471: athrow
    //   18472: aconst_null
    //   18473: athrow
    //   18474: aconst_null
    //   18475: athrow
    //   18476: aconst_null
    //   18477: athrow
    //   18478: aconst_null
    //   18479: athrow
    //   18480: aconst_null
    //   18481: athrow
    //   18482: aconst_null
    //   18483: athrow
    //   18484: aconst_null
    //   18485: athrow
    //   18486: aconst_null
    //   18487: athrow
    //   18488: aconst_null
    //   18489: athrow
    //   18490: aconst_null
    //   18491: athrow
    //   18492: aconst_null
    //   18493: athrow
    //   18494: aconst_null
    //   18495: athrow
    //   18496: aconst_null
    //   18497: athrow
    //   18498: aconst_null
    //   18499: athrow
    //   18500: aconst_null
    //   18501: athrow
    //   18502: aconst_null
    //   18503: athrow
    //   18504: aconst_null
    //   18505: athrow
    //   18506: aconst_null
    //   18507: athrow
    //   18508: aconst_null
    //   18509: athrow
    //   18510: aconst_null
    //   18511: athrow
    //   18512: aconst_null
    //   18513: athrow
    //   18514: aconst_null
    //   18515: athrow
    //   18516: aconst_null
    //   18517: athrow
    //   18518: aconst_null
    //   18519: athrow
    //   18520: aconst_null
    //   18521: athrow
    //   18522: aconst_null
    //   18523: athrow
    //   18524: aconst_null
    //   18525: athrow
    //   18526: aconst_null
    //   18527: athrow
    //   18528: aconst_null
    //   18529: athrow
    //   18530: aconst_null
    //   18531: athrow
    //   18532: aconst_null
    //   18533: athrow
    //   18534: aconst_null
    //   18535: athrow
    //   18536: aconst_null
    //   18537: athrow
    //   18538: aconst_null
    //   18539: athrow
    //   18540: aconst_null
    //   18541: athrow
    //   18542: aconst_null
    //   18543: athrow
    //   18544: aconst_null
    //   18545: athrow
    //   18546: aconst_null
    //   18547: athrow
    //   18548: aconst_null
    //   18549: athrow
    //   18550: aconst_null
    //   18551: athrow
    //   18552: aconst_null
    //   18553: athrow
    //   18554: aconst_null
    //   18555: athrow
    //   18556: aconst_null
    //   18557: athrow
    //   18558: aconst_null
    //   18559: athrow
    //   18560: aconst_null
    //   18561: athrow
    //   18562: aconst_null
    //   18563: athrow
    //   18564: aconst_null
    //   18565: athrow
    //   18566: aconst_null
    //   18567: athrow
    //   18568: aconst_null
    //   18569: athrow
    //   18570: aconst_null
    //   18571: athrow
    //   18572: aconst_null
    //   18573: athrow
    //   18574: aconst_null
    //   18575: athrow
    //   18576: aconst_null
    //   18577: athrow
    //   18578: aconst_null
    //   18579: athrow
    //   18580: aconst_null
    //   18581: athrow
    //   18582: aconst_null
    //   18583: athrow
    //   18584: aconst_null
    //   18585: athrow
    //   18586: aconst_null
    //   18587: athrow
    //   18588: aconst_null
    //   18589: athrow
    //   18590: aconst_null
    //   18591: athrow
    //   18592: aconst_null
    //   18593: athrow
    //   18594: aconst_null
    //   18595: athrow
    //   18596: aconst_null
    //   18597: athrow
    //   18598: aconst_null
    //   18599: athrow
    //   18600: aconst_null
    //   18601: athrow
    //   18602: aconst_null
    //   18603: athrow
    //   18604: aconst_null
    //   18605: athrow
    //   18606: aconst_null
    //   18607: athrow
    //   18608: aconst_null
    //   18609: athrow
    //   18610: aconst_null
    //   18611: athrow
    //   18612: aconst_null
    //   18613: athrow
    //   18614: aconst_null
    //   18615: athrow
    //   18616: aconst_null
    //   18617: athrow
    //   18618: aconst_null
    //   18619: athrow
    //   18620: aconst_null
    //   18621: athrow
    //   18622: aconst_null
    //   18623: athrow
    //   18624: aconst_null
    //   18625: athrow
    //   18626: aconst_null
    //   18627: athrow
    //   18628: aconst_null
    //   18629: athrow
    //   18630: aconst_null
    //   18631: athrow
    //   18632: aconst_null
    //   18633: athrow
    //   18634: aconst_null
    //   18635: athrow
    //   18636: aconst_null
    //   18637: athrow
    //   18638: aconst_null
    //   18639: athrow
    //   18640: aconst_null
    //   18641: athrow
    //   18642: aconst_null
    //   18643: athrow
    //   18644: aconst_null
    //   18645: athrow
    //   18646: aconst_null
    //   18647: athrow
    //   18648: aconst_null
    //   18649: athrow
    //   18650: aconst_null
    //   18651: athrow
    //   18652: aconst_null
    //   18653: athrow
    //   18654: aconst_null
    //   18655: athrow
    //   18656: aconst_null
    //   18657: athrow
    //   18658: aconst_null
    //   18659: athrow
    //   18660: aconst_null
    //   18661: athrow
    //   18662: aconst_null
    //   18663: athrow
    //   18664: aconst_null
    //   18665: athrow
    //   18666: aconst_null
    //   18667: athrow
    //   18668: aconst_null
    //   18669: athrow
    //   18670: aconst_null
    //   18671: athrow
    //   18672: aconst_null
    //   18673: athrow
    //   18674: aconst_null
    //   18675: athrow
    //   18676: aconst_null
    //   18677: athrow
    //   18678: aconst_null
    //   18679: athrow
    //   18680: aconst_null
    //   18681: athrow
    //   18682: aconst_null
    //   18683: athrow
    //   18684: aconst_null
    //   18685: athrow
    //   18686: aconst_null
    //   18687: athrow
    //   18688: aconst_null
    //   18689: athrow
    //   18690: aconst_null
    //   18691: athrow
    //   18692: aconst_null
    //   18693: athrow
    //   18694: aconst_null
    //   18695: athrow
    //   18696: aconst_null
    //   18697: athrow
    //   18698: aconst_null
    //   18699: athrow
    //   18700: aconst_null
    //   18701: athrow
    //   18702: aconst_null
    //   18703: athrow
    //   18704: aconst_null
    //   18705: athrow
    //   18706: aconst_null
    //   18707: athrow
    //   18708: aconst_null
    //   18709: athrow
    //   18710: aconst_null
    //   18711: athrow
    //   18712: aconst_null
    //   18713: athrow
    //   18714: aconst_null
    //   18715: athrow
    //   18716: aconst_null
    //   18717: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	18168	0	this	Lbigname/zprestige/webhack/features/modules/Player/Speedmine;
  }
  
  @SubscribeEvent
  public void onBlockEvent(BlockEvent event) {
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
  
  public boolean lambda$new$14(Object paramObject) {
    return Perry1.1v(this, (int)721332128L ^ 0x6A57C23D, paramObject);
  }
  
  public static Speedmine getInstance() {
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
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 1804542158
    //   33: l2i
    //   34: ldc_w 1231773636
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1276540496
    //   44: l2i
    //   45: ldc_w 1980640753
    //   48: ixor
    //   49: ldc2_w -706873503
    //   52: l2i
    //   53: ldc_w -1700221055
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -2067110946 -> 41, 1838229482 -> 348
    //   84: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.INSTANCE : Lbigname/zprestige/webhack/features/modules/Player/Speedmine;
    //   87: ifnonnull -> 101
    //   90: ldc2_w 268443945
    //   93: l2i
    //   94: ldc_w -795201344
    //   97: ixor
    //   98: goto -> 109
    //   101: ldc2_w 260023085
    //   104: l2i
    //   105: ldc_w -807030075
    //   108: ixor
    //   109: ldc2_w -578140267
    //   112: l2i
    //   113: ldc_w -606829828
    //   116: ixor
    //   117: ixor
    //   118: tableswitch default -> 90, -960179072 -> 140, -960179071 -> 279
    //   140: new bigname/zprestige/webhack/features/modules/Player/Speedmine
    //   143: dup
    //   144: getstatic Perryc.c : I
    //   147: iflt -> 161
    //   150: ldc2_w 430629251
    //   153: l2i
    //   154: ldc_w -1799248328
    //   157: ixor
    //   158: goto -> 169
    //   161: ldc2_w 1633629196
    //   164: l2i
    //   165: ldc_w 1257303303
    //   168: ixor
    //   169: ldc2_w -35624782
    //   172: l2i
    //   173: ldc_w 592580993
    //   176: ixor
    //   177: ixor
    //   178: lookupswitch default -> 204, -291391961 -> 161, 1406746248 -> 350
    //   204: goto -> 208
    //   207: athrow
    //   208: invokespecial <init> : ()V
    //   211: goto -> 215
    //   214: athrow
    //   215: getstatic Perryc.c : I
    //   218: iflt -> 232
    //   221: ldc2_w 785320381
    //   224: l2i
    //   225: ldc_w 549547701
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w -564700488
    //   235: l2i
    //   236: ldc_w -1348207765
    //   239: ixor
    //   240: ldc2_w 2137850852
    //   243: l2i
    //   244: ldc_w -1829998249
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 346, -1669999776 -> 276, -477162053 -> 232
    //   276: putstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.INSTANCE : Lbigname/zprestige/webhack/features/modules/Player/Speedmine;
    //   279: getstatic Perryc.0 : I
    //   282: ifle -> 296
    //   285: ldc2_w -1156594809
    //   288: l2i
    //   289: ldc_w -1439592644
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w 12772126
    //   299: l2i
    //   300: ldc_w 1580395419
    //   303: ixor
    //   304: ldc2_w -2092481568
    //   307: l2i
    //   308: ldc_w -836616251
    //   311: ixor
    //   312: ixor
    //   313: lookupswitch default -> 344, 328561824 -> 340, 1549480094 -> 296
    //   340: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.INSTANCE : Lbigname/zprestige/webhack/features/modules/Player/Speedmine;
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
    //   8	20	361	finally
    //   208	214	214	finally
    //   208	214	214	java/util/ConcurrentModificationException
    //   208	214	214	java/lang/EnumConstantNotPresentException
    //   208	214	214	java/lang/IllegalArgumentException
    //   208	214	3	finally
    //   361	369	361	java/lang/RuntimeException
    //   377	379	3	finally
  }
  
  public String getDisplayInfo() {
    return Perry1.2(this, (int)-435704355L ^ 0xF7A91CD8);
  }
  
  public boolean lambda$new$6(Integer paramInteger) {
    return Perry1.5q(this, (int)-1997907752L ^ 0x8A50156C, paramInteger);
  }
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Player/Speedmine
    //   3: dup
    //   4: getstatic Perryc.1 : I
    //   7: ifeq -> 21
    //   10: ldc2_w -1730823592
    //   13: l2i
    //   14: ldc_w 1343129817
    //   17: ixor
    //   18: goto -> 29
    //   21: ldc2_w -1053016145
    //   24: l2i
    //   25: ldc_w -923446278
    //   28: ixor
    //   29: ldc2_w -258150850
    //   32: l2i
    //   33: ldc_w 1388747261
    //   36: ixor
    //   37: ixor
    //   38: lookupswitch default -> 132, -1416422506 -> 64, 1786856770 -> 21
    //   64: invokespecial <init> : ()V
    //   67: getstatic Perryc.1 : I
    //   70: ifeq -> 84
    //   73: ldc2_w -965598901
    //   76: l2i
    //   77: ldc_w -86475456
    //   80: ixor
    //   81: goto -> 92
    //   84: ldc2_w 714394173
    //   87: l2i
    //   88: ldc_w 2005592389
    //   91: ixor
    //   92: ldc2_w -805802276
    //   95: l2i
    //   96: ldc_w -1337804778
    //   99: ixor
    //   100: ixor
    //   101: lookupswitch default -> 128, 1054809585 -> 84, 1125157569 -> 134
    //   128: putstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.INSTANCE : Lbigname/zprestige/webhack/features/modules/Player/Speedmine;
    //   131: return
    //   132: aconst_null
    //   133: athrow
    //   134: aconst_null
    //   135: athrow
  }
  
  public void onUpdate() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 3451
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 3443
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 3435
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 1859898339
    //   33: l2i
    //   34: ldc_w 340882814
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1310112531
    //   44: l2i
    //   45: ldc_w -769320665
    //   48: ixor
    //   49: ldc2_w -1326222007
    //   52: l2i
    //   53: ldc_w -1579838843
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 3360, -1927985672 -> 84, 1806457169 -> 41
    //   84: goto -> 88
    //   87: athrow
    //   88: invokestatic fullNullCheck : ()Z
    //   91: goto -> 95
    //   94: athrow
    //   95: ifeq -> 109
    //   98: ldc2_w -393718136
    //   101: l2i
    //   102: ldc_w 43120143
    //   105: ixor
    //   106: goto -> 117
    //   109: ldc2_w 937957282
    //   112: l2i
    //   113: ldc_w -571361500
    //   116: ixor
    //   117: ldc2_w -1103138196
    //   120: l2i
    //   121: ldc_w 1655077333
    //   124: ixor
    //   125: ixor
    //   126: tableswitch default -> 98, 914402110 -> 148, 914402111 -> 149
    //   148: return
    //   149: getstatic Perryc.1 : I
    //   152: ifeq -> 166
    //   155: ldc2_w -1200856715
    //   158: l2i
    //   159: ldc_w -342889984
    //   162: ixor
    //   163: goto -> 174
    //   166: ldc2_w -442672226
    //   169: l2i
    //   170: ldc_w 1891294226
    //   173: ixor
    //   174: ldc2_w 147798694
    //   177: l2i
    //   178: ldc_w 751915500
    //   181: ixor
    //   182: ixor
    //   183: lookupswitch default -> 3402, -1321603898 -> 208, 2013126719 -> 166
    //   208: aload_0
    //   209: getstatic Perryc.c : I
    //   212: iflt -> 226
    //   215: ldc2_w 1593968242
    //   218: l2i
    //   219: ldc_w -1650300434
    //   222: ixor
    //   223: goto -> 234
    //   226: ldc2_w -28175763
    //   229: l2i
    //   230: ldc_w 1606915589
    //   233: ixor
    //   234: ldc2_w 802134706
    //   237: l2i
    //   238: ldc_w -1586508197
    //   241: ixor
    //   242: ixor
    //   243: lookupswitch default -> 3408, 792055937 -> 268, 1275083637 -> 226
    //   268: getfield noDelay : Lbigname/zprestige/webhack/features/setting/Setting;
    //   271: getstatic Perryc.1 : I
    //   274: ifeq -> 288
    //   277: ldc2_w 1935638689
    //   280: l2i
    //   281: ldc_w 2079140108
    //   284: ixor
    //   285: goto -> 296
    //   288: ldc2_w -843776095
    //   291: l2i
    //   292: ldc_w -567127813
    //   295: ixor
    //   296: ldc2_w -1668944119
    //   299: l2i
    //   300: ldc_w 1673766191
    //   303: ixor
    //   304: ixor
    //   305: lookupswitch default -> 332, -134945909 -> 3362, 776045016 -> 288
    //   332: goto -> 336
    //   335: athrow
    //   336: invokevirtual getValue : ()Ljava/lang/Object;
    //   339: goto -> 343
    //   342: athrow
    //   343: checkcast java/lang/Boolean
    //   346: getstatic Perryc.1 : I
    //   349: ifeq -> 363
    //   352: ldc2_w 1261541677
    //   355: l2i
    //   356: ldc_w 275127522
    //   359: ixor
    //   360: goto -> 371
    //   363: ldc2_w 1513777564
    //   366: l2i
    //   367: ldc_w -624420782
    //   370: ixor
    //   371: ldc2_w -657548184
    //   374: l2i
    //   375: ldc_w 373221753
    //   378: ixor
    //   379: ixor
    //   380: lookupswitch default -> 3364, -1784155938 -> 363, 1308755167 -> 408
    //   408: goto -> 412
    //   411: athrow
    //   412: invokevirtual booleanValue : ()Z
    //   415: goto -> 419
    //   418: athrow
    //   419: ifeq -> 433
    //   422: ldc2_w 182939778
    //   425: l2i
    //   426: ldc_w 1778950497
    //   429: ixor
    //   430: goto -> 441
    //   433: ldc2_w 1867662893
    //   436: l2i
    //   437: ldc_w 264083401
    //   440: ixor
    //   441: ldc2_w -261202527
    //   444: l2i
    //   445: ldc_w -1196646471
    //   448: ixor
    //   449: ixor
    //   450: tableswitch default -> 422, 674042875 -> 472, 674042876 -> 671
    //   472: getstatic Perryc.0 : I
    //   475: ifle -> 489
    //   478: ldc2_w -1814080616
    //   481: l2i
    //   482: ldc_w -1705189219
    //   485: ixor
    //   486: goto -> 497
    //   489: ldc2_w 717342454
    //   492: l2i
    //   493: ldc_w 1924657726
    //   496: ixor
    //   497: ldc2_w -1417193986
    //   500: l2i
    //   501: ldc_w 221209337
    //   504: ixor
    //   505: ixor
    //   506: lookupswitch default -> 532, -1356102654 -> 3380, 898267338 -> 489
    //   532: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.mc : Lnet/minecraft/client/Minecraft;
    //   535: getstatic Perryc.c : I
    //   538: iflt -> 552
    //   541: ldc2_w -1992771723
    //   544: l2i
    //   545: ldc_w -673715197
    //   548: ixor
    //   549: goto -> 560
    //   552: ldc2_w -331887832
    //   555: l2i
    //   556: ldc_w 576814417
    //   559: ixor
    //   560: ldc2_w -1642163957
    //   563: l2i
    //   564: ldc_w 1273662756
    //   567: ixor
    //   568: ixor
    //   569: lookupswitch default -> 596, -1961146535 -> 3356, -1304731750 -> 552
    //   596: getfield field_71442_b : Lnet/minecraft/client/multiplayer/PlayerControllerMP;
    //   599: ldc2_w 992347596
    //   602: l2i
    //   603: ldc_w 992347596
    //   606: ixor
    //   607: getstatic Perryc.c : I
    //   610: iflt -> 624
    //   613: ldc2_w -892991360
    //   616: l2i
    //   617: ldc_w -468886558
    //   620: ixor
    //   621: goto -> 632
    //   624: ldc2_w 2132795375
    //   627: l2i
    //   628: ldc_w -1514220962
    //   631: ixor
    //   632: ldc2_w -480606775
    //   635: l2i
    //   636: ldc_w 586556358
    //   639: ixor
    //   640: ixor
    //   641: lookupswitch default -> 3368, -278399635 -> 624, 453880766 -> 668
    //   668: putfield field_78781_i : I
    //   671: getstatic Perryc.0 : I
    //   674: ifle -> 688
    //   677: ldc2_w 514160270
    //   680: l2i
    //   681: ldc_w -1908832520
    //   684: ixor
    //   685: goto -> 696
    //   688: ldc2_w -111191691
    //   691: l2i
    //   692: ldc_w 1933792046
    //   695: ixor
    //   696: ldc2_w 787398976
    //   699: l2i
    //   700: ldc_w 1688792774
    //   703: ixor
    //   704: ixor
    //   705: lookupswitch default -> 732, -623190032 -> 3382, 871658143 -> 688
    //   732: aload_0
    //   733: getstatic Perryc.c : I
    //   736: iflt -> 750
    //   739: ldc2_w 586367761
    //   742: l2i
    //   743: ldc_w 490384901
    //   746: ixor
    //   747: goto -> 758
    //   750: ldc2_w 913106835
    //   753: l2i
    //   754: ldc_w 212565686
    //   757: ixor
    //   758: ldc2_w 1058913075
    //   761: l2i
    //   762: ldc_w 411567358
    //   765: ixor
    //   766: ixor
    //   767: lookupswitch default -> 792, -708037197 -> 750, 408703705 -> 3420
    //   792: getfield isMining : Z
    //   795: ifeq -> 809
    //   798: ldc2_w -1899827451
    //   801: l2i
    //   802: ldc_w 1464556796
    //   805: ixor
    //   806: goto -> 817
    //   809: ldc2_w -871153206
    //   812: l2i
    //   813: ldc_w 362476082
    //   816: ixor
    //   817: ldc2_w 1492739604
    //   820: l2i
    //   821: ldc_w 1594228021
    //   824: ixor
    //   825: ixor
    //   826: tableswitch default -> 798, -562747176 -> 848, -562747175 -> 2175
    //   848: getstatic Perryc.0 : I
    //   851: ifle -> 865
    //   854: ldc2_w 573645124
    //   857: l2i
    //   858: ldc_w -903010226
    //   861: ixor
    //   862: goto -> 873
    //   865: ldc2_w -580464211
    //   868: l2i
    //   869: ldc_w -613337654
    //   872: ixor
    //   873: ldc2_w -1486393925
    //   876: l2i
    //   877: ldc_w 1636760294
    //   880: ixor
    //   881: ixor
    //   882: lookupswitch default -> 3404, -1057066182 -> 908, 787848791 -> 865
    //   908: aload_0
    //   909: getstatic Perryc.0 : I
    //   912: ifle -> 926
    //   915: ldc2_w -335225125
    //   918: l2i
    //   919: ldc_w -1882385533
    //   922: ixor
    //   923: goto -> 934
    //   926: ldc2_w -1467069842
    //   929: l2i
    //   930: ldc_w -1774078000
    //   933: ixor
    //   934: ldc2_w 1669889793
    //   937: l2i
    //   938: ldc_w 1449053191
    //   941: ixor
    //   942: ixor
    //   943: lookupswitch default -> 3340, 186207928 -> 968, 1444904542 -> 926
    //   968: getfield lastPos : Lnet/minecraft/util/math/BlockPos;
    //   971: ifnull -> 985
    //   974: ldc2_w -903453235
    //   977: l2i
    //   978: ldc_w -747072415
    //   981: ixor
    //   982: goto -> 993
    //   985: ldc2_w -1924159193
    //   988: l2i
    //   989: ldc_w -1810802550
    //   992: ixor
    //   993: ldc2_w 1305694570
    //   996: l2i
    //   997: ldc_w -1760489578
    //   1000: ixor
    //   1001: ixor
    //   1002: tableswitch default -> 974, -1013141680 -> 1024, -1013141679 -> 2175
    //   1024: getstatic Perryc.c : I
    //   1027: iflt -> 1041
    //   1030: ldc2_w -1116227749
    //   1033: l2i
    //   1034: ldc_w 133232072
    //   1037: ixor
    //   1038: goto -> 1049
    //   1041: ldc2_w 172376970
    //   1044: l2i
    //   1045: ldc_w 9110155
    //   1048: ixor
    //   1049: ldc2_w -1598840838
    //   1052: l2i
    //   1053: ldc_w -746428266
    //   1056: ixor
    //   1057: ixor
    //   1058: lookupswitch default -> 1084, -910772737 -> 3394, 1265271676 -> 1041
    //   1084: aload_0
    //   1085: getstatic Perryc.0 : I
    //   1088: ifle -> 1102
    //   1091: ldc2_w -1126051476
    //   1094: l2i
    //   1095: ldc_w -1695433167
    //   1098: ixor
    //   1099: goto -> 1110
    //   1102: ldc2_w -1257534684
    //   1105: l2i
    //   1106: ldc_w -59663418
    //   1109: ixor
    //   1110: ldc2_w 1733178858
    //   1113: l2i
    //   1114: ldc_w 105955143
    //   1117: ixor
    //   1118: ixor
    //   1119: lookupswitch default -> 3366, 677681743 -> 1144, 1192158704 -> 1102
    //   1144: getfield lastFacing : Lnet/minecraft/util/EnumFacing;
    //   1147: ifnull -> 1161
    //   1150: ldc2_w -428714887
    //   1153: l2i
    //   1154: ldc_w 631826868
    //   1157: ixor
    //   1158: goto -> 1169
    //   1161: ldc2_w 707948812
    //   1164: l2i
    //   1165: ldc_w -370619200
    //   1168: ixor
    //   1169: ldc2_w 1593421637
    //   1172: l2i
    //   1173: ldc_w -1551058974
    //   1176: ixor
    //   1177: ixor
    //   1178: tableswitch default -> 1150, 1051698538 -> 1200, 1051698539 -> 2175
    //   1200: getstatic Perryc.c : I
    //   1203: iflt -> 1217
    //   1206: ldc2_w -1511346298
    //   1209: l2i
    //   1210: ldc_w 1248153519
    //   1213: ixor
    //   1214: goto -> 1225
    //   1217: ldc2_w 75424070
    //   1220: l2i
    //   1221: ldc_w 1092293402
    //   1224: ixor
    //   1225: ldc2_w 881827943
    //   1228: l2i
    //   1229: ldc_w -803722952
    //   1232: ixor
    //   1233: ixor
    //   1234: lookupswitch default -> 3424, -1577944317 -> 1260, 186149238 -> 1217
    //   1260: aload_0
    //   1261: getstatic Perryc.c : I
    //   1264: iflt -> 1278
    //   1267: ldc2_w 1754371617
    //   1270: l2i
    //   1271: ldc_w -1165721886
    //   1274: ixor
    //   1275: goto -> 1286
    //   1278: ldc2_w 889696718
    //   1281: l2i
    //   1282: ldc_w -1078003519
    //   1285: ixor
    //   1286: ldc2_w -879007638
    //   1289: l2i
    //   1290: ldc_w -344738959
    //   1293: ixor
    //   1294: ixor
    //   1295: lookupswitch default -> 1320, -218287144 -> 3418, 2044511805 -> 1278
    //   1320: getfield noBreakAnim : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1323: getstatic Perryc.c : I
    //   1326: iflt -> 1340
    //   1329: ldc2_w 1124103285
    //   1332: l2i
    //   1333: ldc_w 1194778753
    //   1336: ixor
    //   1337: goto -> 1348
    //   1340: ldc2_w 1885111859
    //   1343: l2i
    //   1344: ldc_w 1784526085
    //   1347: ixor
    //   1348: ldc2_w -339364142
    //   1351: l2i
    //   1352: ldc_w -591427308
    //   1355: ixor
    //   1356: ixor
    //   1357: lookupswitch default -> 3350, 763038960 -> 1384, 860662578 -> 1340
    //   1384: goto -> 1388
    //   1387: athrow
    //   1388: invokevirtual getValue : ()Ljava/lang/Object;
    //   1391: goto -> 1395
    //   1394: athrow
    //   1395: checkcast java/lang/Boolean
    //   1398: getstatic Perryc.0 : I
    //   1401: ifle -> 1415
    //   1404: ldc2_w -320568901
    //   1407: l2i
    //   1408: ldc_w 1194666170
    //   1411: ixor
    //   1412: goto -> 1423
    //   1415: ldc2_w 1292935777
    //   1418: l2i
    //   1419: ldc_w 1510122993
    //   1422: ixor
    //   1423: ldc2_w -1413832103
    //   1426: l2i
    //   1427: ldc_w -1961455516
    //   1430: ixor
    //   1431: ixor
    //   1432: lookupswitch default -> 3398, -1954702532 -> 1415, 935212461 -> 1460
    //   1460: goto -> 1464
    //   1463: athrow
    //   1464: invokevirtual booleanValue : ()Z
    //   1467: goto -> 1471
    //   1470: athrow
    //   1471: ifeq -> 1485
    //   1474: ldc2_w 355834919
    //   1477: l2i
    //   1478: ldc_w 1919794185
    //   1481: ixor
    //   1482: goto -> 1493
    //   1485: ldc2_w 1198074496
    //   1488: l2i
    //   1489: ldc_w 540084905
    //   1492: ixor
    //   1493: ldc2_w -1681617408
    //   1496: l2i
    //   1497: ldc_w 447695861
    //   1500: ixor
    //   1501: ixor
    //   1502: tableswitch default -> 1474, -432806437 -> 1524, -432806436 -> 2175
    //   1524: getstatic Perryc.0 : I
    //   1527: ifle -> 1541
    //   1530: ldc2_w -1445673244
    //   1533: l2i
    //   1534: ldc_w -1670703923
    //   1537: ixor
    //   1538: goto -> 1549
    //   1541: ldc2_w -926651051
    //   1544: l2i
    //   1545: ldc_w -8776075
    //   1548: ixor
    //   1549: ldc2_w -1687689457
    //   1552: l2i
    //   1553: ldc_w -1218056647
    //   1556: ixor
    //   1557: ixor
    //   1558: lookupswitch default -> 1584, -1427184879 -> 1541, 431872799 -> 3386
    //   1584: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.mc : Lnet/minecraft/client/Minecraft;
    //   1587: getstatic Perryc.c : I
    //   1590: iflt -> 1604
    //   1593: ldc2_w 758735558
    //   1596: l2i
    //   1597: ldc_w 870585289
    //   1600: ixor
    //   1601: goto -> 1612
    //   1604: ldc2_w 765830133
    //   1607: l2i
    //   1608: ldc_w -611646381
    //   1611: ixor
    //   1612: ldc2_w 1454793587
    //   1615: l2i
    //   1616: ldc_w 1151118362
    //   1619: ixor
    //   1620: ixor
    //   1621: lookupswitch default -> 3370, -469473073 -> 1648, 217562726 -> 1604
    //   1648: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   1651: getstatic Perryc.0 : I
    //   1654: ifle -> 1668
    //   1657: ldc2_w -1750691419
    //   1660: l2i
    //   1661: ldc_w -2119443027
    //   1664: ixor
    //   1665: goto -> 1676
    //   1668: ldc2_w -3001053
    //   1671: l2i
    //   1672: ldc_w 589612241
    //   1675: ixor
    //   1676: ldc2_w -1575531252
    //   1679: l2i
    //   1680: ldc_w 322771833
    //   1683: ixor
    //   1684: ixor
    //   1685: lookupswitch default -> 1712, -1490609539 -> 3352, -446881549 -> 1668
    //   1712: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   1715: new net/minecraft/network/play/client/CPacketPlayerDigging
    //   1718: dup
    //   1719: getstatic Perryc.c : I
    //   1722: iflt -> 1736
    //   1725: ldc2_w 1768919776
    //   1728: l2i
    //   1729: ldc_w -1928000691
    //   1732: ixor
    //   1733: goto -> 1744
    //   1736: ldc2_w 108046746
    //   1739: l2i
    //   1740: ldc_w -2018922891
    //   1743: ixor
    //   1744: ldc2_w 1397106847
    //   1747: l2i
    //   1748: ldc_w 2075389286
    //   1751: ixor
    //   1752: ixor
    //   1753: lookupswitch default -> 3396, -1456684522 -> 1780, -863019948 -> 1736
    //   1780: getstatic net/minecraft/network/play/client/CPacketPlayerDigging$Action.ABORT_DESTROY_BLOCK : Lnet/minecraft/network/play/client/CPacketPlayerDigging$Action;
    //   1783: getstatic Perryc.c : I
    //   1786: iflt -> 1800
    //   1789: ldc2_w 1493611586
    //   1792: l2i
    //   1793: ldc_w 1052786595
    //   1796: ixor
    //   1797: goto -> 1808
    //   1800: ldc2_w -312499750
    //   1803: l2i
    //   1804: ldc_w 71593897
    //   1807: ixor
    //   1808: ldc2_w 979768581
    //   1811: l2i
    //   1812: ldc_w -1667487649
    //   1815: ixor
    //   1816: ixor
    //   1817: lookupswitch default -> 1844, -1356669211 -> 1800, -1052985669 -> 3358
    //   1844: aload_0
    //   1845: getstatic Perryc.1 : I
    //   1848: ifeq -> 1862
    //   1851: ldc2_w -2127586252
    //   1854: l2i
    //   1855: ldc_w 1001145444
    //   1858: ixor
    //   1859: goto -> 1870
    //   1862: ldc2_w -673204684
    //   1865: l2i
    //   1866: ldc_w -1988577557
    //   1869: ixor
    //   1870: ldc2_w -619187295
    //   1873: l2i
    //   1874: ldc_w 1956554985
    //   1877: ixor
    //   1878: ixor
    //   1879: lookupswitch default -> 1904, 353010456 -> 3422, 1324922842 -> 1862
    //   1904: getfield lastPos : Lnet/minecraft/util/math/BlockPos;
    //   1907: getstatic Perryc.0 : I
    //   1910: ifle -> 1924
    //   1913: ldc2_w -1495211230
    //   1916: l2i
    //   1917: ldc_w -1444237713
    //   1920: ixor
    //   1921: goto -> 1932
    //   1924: ldc2_w 464457705
    //   1927: l2i
    //   1928: ldc_w 1867050879
    //   1931: ixor
    //   1932: ldc2_w -504904858
    //   1935: l2i
    //   1936: ldc_w -1319019323
    //   1939: ixor
    //   1940: ixor
    //   1941: lookupswitch default -> 3412, 610369333 -> 1968, 1603064558 -> 1924
    //   1968: aload_0
    //   1969: getstatic Perryc.0 : I
    //   1972: ifle -> 1986
    //   1975: ldc2_w -437736088
    //   1978: l2i
    //   1979: ldc_w 1618453786
    //   1982: ixor
    //   1983: goto -> 1994
    //   1986: ldc2_w -1691444997
    //   1989: l2i
    //   1990: ldc_w -1903739610
    //   1993: ixor
    //   1994: ldc2_w 2109424423
    //   1997: l2i
    //   1998: ldc_w -1789616209
    //   2001: ixor
    //   2002: ixor
    //   2003: lookupswitch default -> 3376, -45713067 -> 2028, 1836111098 -> 1986
    //   2028: getfield lastFacing : Lnet/minecraft/util/EnumFacing;
    //   2031: getstatic Perryc.0 : I
    //   2034: ifle -> 2048
    //   2037: ldc2_w -208705286
    //   2040: l2i
    //   2041: ldc_w -1746230197
    //   2044: ixor
    //   2045: goto -> 2056
    //   2048: ldc2_w -1919325573
    //   2051: l2i
    //   2052: ldc_w -1179482147
    //   2055: ixor
    //   2056: ldc2_w 1313933575
    //   2059: l2i
    //   2060: ldc_w 1290102040
    //   2063: ixor
    //   2064: ixor
    //   2065: lookupswitch default -> 3392, 916423097 -> 2092, 1725014190 -> 2048
    //   2092: goto -> 2096
    //   2095: athrow
    //   2096: invokespecial <init> : (Lnet/minecraft/network/play/client/CPacketPlayerDigging$Action;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V
    //   2099: goto -> 2103
    //   2102: athrow
    //   2103: getstatic Perryc.1 : I
    //   2106: ifeq -> 2120
    //   2109: ldc2_w 1599019278
    //   2112: l2i
    //   2113: ldc_w -1877689936
    //   2116: ixor
    //   2117: goto -> 2128
    //   2120: ldc2_w -904882021
    //   2123: l2i
    //   2124: ldc_w 1777125058
    //   2127: ixor
    //   2128: ldc2_w -907907550
    //   2131: l2i
    //   2132: ldc_w 1750458089
    //   2135: ixor
    //   2136: ixor
    //   2137: lookupswitch default -> 2164, -1590400777 -> 2120, 1860964469 -> 3354
    //   2164: goto -> 2168
    //   2167: athrow
    //   2168: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   2171: goto -> 2175
    //   2174: athrow
    //   2175: getstatic Perryc.0 : I
    //   2178: ifle -> 2192
    //   2181: ldc2_w 2141936464
    //   2184: l2i
    //   2185: ldc_w 1925657075
    //   2188: ixor
    //   2189: goto -> 2200
    //   2192: ldc2_w -742198842
    //   2195: l2i
    //   2196: ldc_w -1818141719
    //   2199: ixor
    //   2200: ldc2_w 2119655972
    //   2203: l2i
    //   2204: ldc_w -1143359926
    //   2207: ixor
    //   2208: ixor
    //   2209: lookupswitch default -> 2236, -924664115 -> 3400, -589594311 -> 2192
    //   2236: aload_0
    //   2237: getstatic Perryc.0 : I
    //   2240: ifle -> 2254
    //   2243: ldc2_w 1036129322
    //   2246: l2i
    //   2247: ldc_w 1185832911
    //   2250: ixor
    //   2251: goto -> 2262
    //   2254: ldc2_w 544481227
    //   2257: l2i
    //   2258: ldc_w 476665906
    //   2261: ixor
    //   2262: ldc2_w -81029839
    //   2265: l2i
    //   2266: ldc_w -1843168598
    //   2269: ixor
    //   2270: ixor
    //   2271: lookupswitch default -> 2296, 308585598 -> 3372, 1266176414 -> 2254
    //   2296: getfield reset : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2299: getstatic Perryc.c : I
    //   2302: iflt -> 2316
    //   2305: ldc2_w 934642972
    //   2308: l2i
    //   2309: ldc_w -620917102
    //   2312: ixor
    //   2313: goto -> 2324
    //   2316: ldc2_w 293866926
    //   2319: l2i
    //   2320: ldc_w -1280859194
    //   2323: ixor
    //   2324: ldc2_w 1017842088
    //   2327: l2i
    //   2328: ldc_w 2075133702
    //   2331: ixor
    //   2332: ixor
    //   2333: lookupswitch default -> 2360, -1437399776 -> 3384, 521568910 -> 2316
    //   2360: goto -> 2364
    //   2363: athrow
    //   2364: invokevirtual getValue : ()Ljava/lang/Object;
    //   2367: goto -> 2371
    //   2370: athrow
    //   2371: checkcast java/lang/Boolean
    //   2374: getstatic Perryc.1 : I
    //   2377: ifeq -> 2391
    //   2380: ldc2_w 1496396433
    //   2383: l2i
    //   2384: ldc_w 1188935290
    //   2387: ixor
    //   2388: goto -> 2399
    //   2391: ldc2_w 855288959
    //   2394: l2i
    //   2395: ldc_w 269655433
    //   2398: ixor
    //   2399: ldc2_w 1464432795
    //   2402: l2i
    //   2403: ldc_w 301111019
    //   2406: ixor
    //   2407: ixor
    //   2408: lookupswitch default -> 3344, 1498901147 -> 2391, 1683218310 -> 2436
    //   2436: goto -> 2440
    //   2439: athrow
    //   2440: invokevirtual booleanValue : ()Z
    //   2443: goto -> 2447
    //   2446: athrow
    //   2447: ifeq -> 2461
    //   2450: ldc2_w 159194558
    //   2453: l2i
    //   2454: ldc_w 2126543889
    //   2457: ixor
    //   2458: goto -> 2469
    //   2461: ldc2_w -735882733
    //   2464: l2i
    //   2465: ldc_w -1549913155
    //   2468: ixor
    //   2469: ldc2_w 137968165
    //   2472: l2i
    //   2473: ldc_w -604142574
    //   2476: ixor
    //   2477: ixor
    //   2478: tableswitch default -> 2450, -1535516776 -> 2500, -1535516775 -> 3339
    //   2500: getstatic Perryc.1 : I
    //   2503: ifeq -> 2517
    //   2506: ldc2_w 56973558
    //   2509: l2i
    //   2510: ldc_w 186007762
    //   2513: ixor
    //   2514: goto -> 2525
    //   2517: ldc2_w 1323701690
    //   2520: l2i
    //   2521: ldc_w -1410508434
    //   2524: ixor
    //   2525: ldc2_w 1176264559
    //   2528: l2i
    //   2529: ldc_w -795371117
    //   2532: ixor
    //   2533: ixor
    //   2534: lookupswitch default -> 2560, -1627857192 -> 3410, -1142223706 -> 2517
    //   2560: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.mc : Lnet/minecraft/client/Minecraft;
    //   2563: getstatic Perryc.0 : I
    //   2566: ifle -> 2580
    //   2569: ldc2_w -218904362
    //   2572: l2i
    //   2573: ldc_w 1656752479
    //   2576: ixor
    //   2577: goto -> 2588
    //   2580: ldc2_w -526592554
    //   2583: l2i
    //   2584: ldc_w -1037521850
    //   2587: ixor
    //   2588: ldc2_w -1473754590
    //   2591: l2i
    //   2592: ldc_w -151539360
    //   2595: ixor
    //   2596: ixor
    //   2597: lookupswitch default -> 3342, -823379253 -> 2580, 2087420626 -> 2624
    //   2624: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   2627: getstatic Perryc.1 : I
    //   2630: ifeq -> 2644
    //   2633: ldc2_w 3781370
    //   2636: l2i
    //   2637: ldc_w -1329858527
    //   2640: ixor
    //   2641: goto -> 2652
    //   2644: ldc2_w -262783456
    //   2647: l2i
    //   2648: ldc_w -929805323
    //   2651: ixor
    //   2652: ldc2_w 2082969480
    //   2655: l2i
    //   2656: ldc_w 1688860403
    //   2659: ixor
    //   2660: ixor
    //   2661: lookupswitch default -> 3378, -1475597408 -> 2644, 541856942 -> 2688
    //   2688: getfield field_74313_G : Lnet/minecraft/client/settings/KeyBinding;
    //   2691: getstatic Perryc.0 : I
    //   2694: ifle -> 2708
    //   2697: ldc2_w -48884776
    //   2700: l2i
    //   2701: ldc_w 233552177
    //   2704: ixor
    //   2705: goto -> 2716
    //   2708: ldc2_w 1606329182
    //   2711: l2i
    //   2712: ldc_w 921264989
    //   2715: ixor
    //   2716: ldc2_w 411794242
    //   2719: l2i
    //   2720: ldc_w 914689662
    //   2723: ixor
    //   2724: ixor
    //   2725: lookupswitch default -> 3390, -554442795 -> 2708, 1197061439 -> 2752
    //   2752: goto -> 2756
    //   2755: athrow
    //   2756: invokevirtual func_151470_d : ()Z
    //   2759: goto -> 2763
    //   2762: athrow
    //   2763: ifeq -> 2777
    //   2766: ldc2_w 501153567
    //   2769: l2i
    //   2770: ldc_w -395040603
    //   2773: ixor
    //   2774: goto -> 2785
    //   2777: ldc2_w -1085224289
    //   2780: l2i
    //   2781: ldc_w 1257905446
    //   2784: ixor
    //   2785: ldc2_w 569205895
    //   2788: l2i
    //   2789: ldc_w 1965728128
    //   2792: ixor
    //   2793: ixor
    //   2794: tableswitch default -> 2766, -1586687299 -> 2816, -1586687298 -> 3339
    //   2816: getstatic Perryc.1 : I
    //   2819: ifeq -> 2833
    //   2822: ldc2_w -1926740132
    //   2825: l2i
    //   2826: ldc_w -1421591314
    //   2829: ixor
    //   2830: goto -> 2841
    //   2833: ldc2_w 1979757120
    //   2836: l2i
    //   2837: ldc_w 1734258205
    //   2840: ixor
    //   2841: ldc2_w 1765422135
    //   2844: l2i
    //   2845: ldc_w -349285558
    //   2848: ixor
    //   2849: ixor
    //   2850: lookupswitch default -> 2876, -1535632177 -> 3414, 183936857 -> 2833
    //   2876: aload_0
    //   2877: getstatic Perryc.1 : I
    //   2880: ifeq -> 2894
    //   2883: ldc2_w 647066009
    //   2886: l2i
    //   2887: ldc_w -2111385814
    //   2890: ixor
    //   2891: goto -> 2902
    //   2894: ldc2_w -1035677384
    //   2897: l2i
    //   2898: ldc_w -1692333226
    //   2901: ixor
    //   2902: ldc2_w 355577189
    //   2905: l2i
    //   2906: ldc_w -136745828
    //   2909: ixor
    //   2910: ixor
    //   2911: lookupswitch default -> 2936, -434624648 -> 2894, 1180663626 -> 3416
    //   2936: getfield allow : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2939: getstatic Perryc.c : I
    //   2942: iflt -> 2956
    //   2945: ldc2_w -1718034823
    //   2948: l2i
    //   2949: ldc_w 1448270198
    //   2952: ixor
    //   2953: goto -> 2964
    //   2956: ldc2_w -1718600131
    //   2959: l2i
    //   2960: ldc_w -617740458
    //   2963: ixor
    //   2964: ldc2_w -1783207410
    //   2967: l2i
    //   2968: ldc_w -1006310529
    //   2971: ixor
    //   2972: ixor
    //   2973: lookupswitch default -> 3348, -1636268418 -> 2956, 319600666 -> 3000
    //   3000: goto -> 3004
    //   3003: athrow
    //   3004: invokevirtual getValue : ()Ljava/lang/Object;
    //   3007: goto -> 3011
    //   3010: athrow
    //   3011: checkcast java/lang/Boolean
    //   3014: getstatic Perryc.c : I
    //   3017: iflt -> 3031
    //   3020: ldc2_w -1266889969
    //   3023: l2i
    //   3024: ldc_w 1902805237
    //   3027: ixor
    //   3028: goto -> 3039
    //   3031: ldc2_w 134275758
    //   3034: l2i
    //   3035: ldc_w -1640921601
    //   3038: ixor
    //   3039: ldc2_w -1711401185
    //   3042: l2i
    //   3043: ldc_w 151385849
    //   3046: ixor
    //   3047: ixor
    //   3048: lookupswitch default -> 3374, 113936055 -> 3076, 1441638940 -> 3031
    //   3076: goto -> 3080
    //   3079: athrow
    //   3080: invokevirtual booleanValue : ()Z
    //   3083: goto -> 3087
    //   3086: athrow
    //   3087: ifne -> 3101
    //   3090: ldc2_w -433329809
    //   3093: l2i
    //   3094: ldc_w -1116084141
    //   3097: ixor
    //   3098: goto -> 3109
    //   3101: ldc2_w -1700141761
    //   3104: l2i
    //   3105: ldc_w -1040456702
    //   3108: ixor
    //   3109: ldc2_w -1561127609
    //   3112: l2i
    //   3113: ldc_w 88391075
    //   3116: ixor
    //   3117: ixor
    //   3118: tableswitch default -> 3090, -52057640 -> 3140, -52057639 -> 3339
    //   3140: getstatic Perryc.0 : I
    //   3143: ifle -> 3157
    //   3146: ldc2_w -476303586
    //   3149: l2i
    //   3150: ldc_w -1026871456
    //   3153: ixor
    //   3154: goto -> 3165
    //   3157: ldc2_w 781201892
    //   3160: l2i
    //   3161: ldc_w -1805962083
    //   3164: ixor
    //   3165: ldc2_w -2037730312
    //   3168: l2i
    //   3169: ldc_w 233493522
    //   3172: ixor
    //   3173: ixor
    //   3174: lookupswitch default -> 3200, -1439209580 -> 3388, 320585697 -> 3157
    //   3200: getstatic bigname/zprestige/webhack/features/modules/Player/Speedmine.mc : Lnet/minecraft/client/Minecraft;
    //   3203: getstatic Perryc.c : I
    //   3206: iflt -> 3220
    //   3209: ldc2_w 300534853
    //   3212: l2i
    //   3213: ldc_w 1000798427
    //   3216: ixor
    //   3217: goto -> 3228
    //   3220: ldc2_w 1633777691
    //   3223: l2i
    //   3224: ldc_w 783240127
    //   3227: ixor
    //   3228: ldc2_w -1517244796
    //   3231: l2i
    //   3232: ldc_w 1794369397
    //   3235: ixor
    //   3236: ixor
    //   3237: lookupswitch default -> 3406, -2136114603 -> 3264, -450069137 -> 3220
    //   3264: getfield field_71442_b : Lnet/minecraft/client/multiplayer/PlayerControllerMP;
    //   3267: ldc2_w -719287796
    //   3270: l2i
    //   3271: ldc_w -719287796
    //   3274: ixor
    //   3275: getstatic Perryc.1 : I
    //   3278: ifeq -> 3292
    //   3281: ldc2_w -902929425
    //   3284: l2i
    //   3285: ldc_w -2055442741
    //   3288: ixor
    //   3289: goto -> 3300
    //   3292: ldc2_w 2072999295
    //   3295: l2i
    //   3296: ldc_w 934828493
    //   3299: ixor
    //   3300: ldc2_w 112995033
    //   3303: l2i
    //   3304: ldc_w 1638459688
    //   3307: ixor
    //   3308: ixor
    //   3309: lookupswitch default -> 3346, 675729109 -> 3292, 723775299 -> 3336
    //   3336: putfield field_78778_j : Z
    //   3339: return
    //   3340: aconst_null
    //   3341: athrow
    //   3342: aconst_null
    //   3343: athrow
    //   3344: aconst_null
    //   3345: athrow
    //   3346: aconst_null
    //   3347: athrow
    //   3348: aconst_null
    //   3349: athrow
    //   3350: aconst_null
    //   3351: athrow
    //   3352: aconst_null
    //   3353: athrow
    //   3354: aconst_null
    //   3355: athrow
    //   3356: aconst_null
    //   3357: athrow
    //   3358: aconst_null
    //   3359: athrow
    //   3360: aconst_null
    //   3361: athrow
    //   3362: aconst_null
    //   3363: athrow
    //   3364: aconst_null
    //   3365: athrow
    //   3366: aconst_null
    //   3367: athrow
    //   3368: aconst_null
    //   3369: athrow
    //   3370: aconst_null
    //   3371: athrow
    //   3372: aconst_null
    //   3373: athrow
    //   3374: aconst_null
    //   3375: athrow
    //   3376: aconst_null
    //   3377: athrow
    //   3378: aconst_null
    //   3379: athrow
    //   3380: aconst_null
    //   3381: athrow
    //   3382: aconst_null
    //   3383: athrow
    //   3384: aconst_null
    //   3385: athrow
    //   3386: aconst_null
    //   3387: athrow
    //   3388: aconst_null
    //   3389: athrow
    //   3390: aconst_null
    //   3391: athrow
    //   3392: aconst_null
    //   3393: athrow
    //   3394: aconst_null
    //   3395: athrow
    //   3396: aconst_null
    //   3397: athrow
    //   3398: aconst_null
    //   3399: athrow
    //   3400: aconst_null
    //   3401: athrow
    //   3402: aconst_null
    //   3403: athrow
    //   3404: aconst_null
    //   3405: athrow
    //   3406: aconst_null
    //   3407: athrow
    //   3408: aconst_null
    //   3409: athrow
    //   3410: aconst_null
    //   3411: athrow
    //   3412: aconst_null
    //   3413: athrow
    //   3414: aconst_null
    //   3415: athrow
    //   3416: aconst_null
    //   3417: athrow
    //   3418: aconst_null
    //   3419: athrow
    //   3420: aconst_null
    //   3421: athrow
    //   3422: aconst_null
    //   3423: athrow
    //   3424: aconst_null
    //   3425: athrow
    //   3426: pop
    //   3427: goto -> 24
    //   3430: pop
    //   3431: aconst_null
    //   3432: goto -> 3426
    //   3435: dup
    //   3436: ifnull -> 3426
    //   3439: checkcast java/lang/Throwable
    //   3442: athrow
    //   3443: dup
    //   3444: ifnull -> 3430
    //   3447: checkcast java/lang/Throwable
    //   3450: athrow
    //   3451: aconst_null
    //   3452: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	3316	0	this	Lbigname/zprestige/webhack/features/modules/Player/Speedmine;
    // Exception table:
    //   from	to	target	type
    //   8	20	3435	java/lang/ClassCastException
    //   87	94	94	finally
    //   87	94	3	finally
    //   88	94	3	finally
    //   88	94	87	finally
    //   88	94	94	java/lang/NullPointerException
    //   335	342	342	finally
    //   335	342	335	java/lang/NumberFormatException
    //   336	342	342	java/lang/ArrayIndexOutOfBoundsException
    //   336	342	335	finally
    //   336	342	3	java/lang/NullPointerException
    //   411	418	418	finally
    //   411	418	418	java/util/ConcurrentModificationException
    //   411	418	418	finally
    //   412	418	411	finally
    //   412	418	3	java/lang/ArithmeticException
    //   1387	1394	1394	finally
    //   1387	1394	1387	java/lang/ClassCastException
    //   1387	1394	1387	java/lang/AssertionError
    //   1388	1394	1387	finally
    //   1388	1394	1387	finally
    //   1463	1470	1470	finally
    //   1463	1470	3	finally
    //   1463	1470	1463	java/util/ConcurrentModificationException
    //   1464	1470	3	java/lang/ClassCastException
    //   1464	1470	1470	java/lang/IllegalArgumentException
    //   2096	2102	2102	finally
    //   2096	2102	3	finally
    //   2096	2102	2102	finally
    //   2096	2102	3	finally
    //   2096	2102	3	java/lang/IllegalStateException
    //   2167	2174	2174	finally
    //   2167	2174	2174	java/lang/EnumConstantNotPresentException
    //   2167	2174	3	finally
    //   2168	2174	2167	java/lang/AssertionError
    //   2168	2174	2167	finally
    //   2363	2370	2370	finally
    //   2363	2370	3	finally
    //   2363	2370	2363	finally
    //   2364	2370	2370	finally
    //   2364	2370	2363	finally
    //   2439	2446	2446	finally
    //   2439	2446	3	finally
    //   2439	2446	2446	java/util/ConcurrentModificationException
    //   2439	2446	2439	finally
    //   2439	2446	3	java/lang/ArrayIndexOutOfBoundsException
    //   2755	2762	2762	finally
    //   2755	2762	3	java/util/ConcurrentModificationException
    //   2755	2762	2762	finally
    //   2755	2762	3	finally
    //   2756	2762	2755	finally
    //   3003	3010	3010	finally
    //   3003	3010	3010	finally
    //   3003	3010	3003	finally
    //   3003	3010	3	java/lang/UnsupportedOperationException
    //   3004	3010	3	finally
    //   3079	3086	3086	finally
    //   3079	3086	3086	finally
    //   3079	3086	3086	finally
    //   3080	3086	3086	java/lang/StringIndexOutOfBoundsException
    //   3080	3086	3079	java/lang/AssertionError
    //   3435	3443	3435	java/lang/StringIndexOutOfBoundsException
    //   3451	3453	3	java/lang/EnumConstantNotPresentException
  }
  
  public int getPickSlot() {
    return Perry1.2V(this, (int)-820980867L ^ 0xF96D3625);
  }
  
  public boolean lambda$new$5(Integer paramInteger) {
    return Perry1.5e(this, (int)-573362716L ^ 0xBB057C69, paramInteger);
  }
  
  public boolean lambda$new$12(Object paramObject) {
    return Perry1.29(this, (int)-902755124L ^ 0xEBE9574E, paramObject);
  }
  
  public boolean lambda$new$0(Object paramObject) {
    return Perry1.1F(this, (int)472487454L ^ 0x4242FD41, paramObject);
  }
  
  public boolean lambda$new$1(Object paramObject) {
    return Perry1.1E(this, (int)2072670637L ^ 0x59F510B3, paramObject);
  }
  
  public boolean lambda$new$16(Object paramObject) {
    return Perry1.1W(this, (int)-1175597157L ^ 0xDE7B3150, paramObject);
  }
  
  public void setInstance() {
    Perry1.3e(this, (int)-1794287842L ^ 0xEE64F0E9);
  }
  
  public boolean lambda$new$17(Float paramFloat) {
    return Perry1.I(this, (int)-116411027L ^ 0xC4F4B2DB, paramFloat);
  }
  
  public boolean lambda$new$3(Object paramObject) {
    return Perry1.1Z(this, (int)1282679002L ^ 0x5DC9B9EB, paramObject);
  }
  
  public void showAnimation(boolean isMining, BlockPos lastPos, EnumFacing lastFacing) {
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
  
  public boolean lambda$new$8(Boolean paramBoolean) {
    return Perry1.2u(this, (int)-1485647096L ^ 0xBD5D4B27, paramBoolean);
  }
  
  public boolean lambda$new$4(Boolean paramBoolean) {
    return Perry1.2x(this, (int)-2105224807L ^ 0xB8F49158, paramBoolean);
  }
  
  public boolean lambda$new$15(Boolean paramBoolean) {
    return Perry1.2p(this, (int)-59633279L ^ 0xABB1E610, paramBoolean);
  }
  
  public void showAnimation() {
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
  
  public boolean lambda$new$9(Integer paramInteger) {
    return Perry1.5z(this, (int)-130583148L ^ 0xAA12B507, paramInteger);
  }
  
  public void onRender3D(Render3DEvent event) {
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
  
  public boolean lambda$new$2(Object paramObject) {
    return Perry1.24(this, (int)1073703561L ^ 0x789435BC, paramObject);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Player\Speedmine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */