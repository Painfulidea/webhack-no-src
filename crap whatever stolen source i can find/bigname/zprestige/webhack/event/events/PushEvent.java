package bigname.zprestige.webhack.event.events;

import bigname.zprestige.webhack.event.EventStage;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.eventhandler.Cancelable;

@Cancelable
public class PushEvent extends EventStage {
  public double z;
  
  public double y;
  
  public boolean airbone;
  
  public Entity entity;
  
  public double x;
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public PushEvent(Entity entity, double x, double y, double z, boolean airbone) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w -1828500474
    //   9: l2i
    //   10: ldc 74522259
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 989400774
    //   19: l2i
    //   20: ldc 1980767496
    //   22: ixor
    //   23: ldc2_w 863268335
    //   26: l2i
    //   27: ldc -1958358304
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 1028, -187126591 -> 56, 792980890 -> 16
    //   56: aload_0
    //   57: ldc2_w 10762849
    //   60: l2i
    //   61: ldc 10762849
    //   63: ixor
    //   64: getstatic Perryc.1 : I
    //   67: ifeq -> 80
    //   70: ldc2_w 1074437671
    //   73: l2i
    //   74: ldc 516637027
    //   76: ixor
    //   77: goto -> 87
    //   80: ldc2_w 1788942932
    //   83: l2i
    //   84: ldc -862089706
    //   86: ixor
    //   87: ldc2_w 924199031
    //   90: l2i
    //   91: ldc 1572457294
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -325369146 -> 80, 879639677 -> 1046
    //   120: invokespecial <init> : (I)V
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 139
    //   129: ldc2_w 1170335923
    //   132: l2i
    //   133: ldc 2036489591
    //   135: ixor
    //   136: goto -> 146
    //   139: ldc2_w -214792686
    //   142: l2i
    //   143: ldc 1245860919
    //   145: ixor
    //   146: ldc2_w -896887670
    //   149: l2i
    //   150: ldc 776132659
    //   152: ixor
    //   153: ixor
    //   154: lookupswitch default -> 180, -664012419 -> 1042, 1457673820 -> 139
    //   180: aload_0
    //   181: getstatic Perryc.c : I
    //   184: iflt -> 197
    //   187: ldc2_w 1508430230
    //   190: l2i
    //   191: ldc -342738169
    //   193: ixor
    //   194: goto -> 204
    //   197: ldc2_w 351938417
    //   200: l2i
    //   201: ldc -1551694881
    //   203: ixor
    //   204: ldc2_w -1389187781
    //   207: l2i
    //   208: ldc 1247434112
    //   210: ixor
    //   211: ixor
    //   212: lookupswitch default -> 240, -2124331116 -> 197, 1427247658 -> 1036
    //   240: aload_1
    //   241: getstatic Perryc.1 : I
    //   244: ifeq -> 257
    //   247: ldc2_w -121314283
    //   250: l2i
    //   251: ldc -1869901277
    //   253: ixor
    //   254: goto -> 264
    //   257: ldc2_w 776969493
    //   260: l2i
    //   261: ldc -761373967
    //   263: ixor
    //   264: ldc2_w -1511017814
    //   267: l2i
    //   268: ldc -2116496252
    //   270: ixor
    //   271: ixor
    //   272: lookupswitch default -> 300, 1074841945 -> 257, 1282936856 -> 1026
    //   300: putfield entity : Lnet/minecraft/entity/Entity;
    //   303: getstatic Perryc.0 : I
    //   306: ifle -> 319
    //   309: ldc2_w -1721902432
    //   312: l2i
    //   313: ldc 569552401
    //   315: ixor
    //   316: goto -> 326
    //   319: ldc2_w -1707356199
    //   322: l2i
    //   323: ldc -646125182
    //   325: ixor
    //   326: ldc2_w 1101697434
    //   329: l2i
    //   330: ldc 1186627909
    //   332: ixor
    //   333: ixor
    //   334: lookupswitch default -> 360, -1077975954 -> 1038, 1583058530 -> 319
    //   360: aload_0
    //   361: getstatic Perryc.0 : I
    //   364: ifle -> 377
    //   367: ldc2_w 991288610
    //   370: l2i
    //   371: ldc 1761922457
    //   373: ixor
    //   374: goto -> 384
    //   377: ldc2_w 1611054449
    //   380: l2i
    //   381: ldc -75241956
    //   383: ixor
    //   384: ldc2_w -280064902
    //   387: l2i
    //   388: ldc 235170213
    //   390: ixor
    //   391: ixor
    //   392: lookupswitch default -> 1044, -1285819036 -> 377, 2060435122 -> 420
    //   420: dload_2
    //   421: getstatic Perryc.1 : I
    //   424: ifeq -> 437
    //   427: ldc2_w 1220687331
    //   430: l2i
    //   431: ldc -1399181761
    //   433: ixor
    //   434: goto -> 444
    //   437: ldc2_w -1927310878
    //   440: l2i
    //   441: ldc -1975028654
    //   443: ixor
    //   444: ldc2_w -1452744213
    //   447: l2i
    //   448: ldc -1604181556
    //   450: ixor
    //   451: ixor
    //   452: lookupswitch default -> 480, -313336837 -> 1050, 713876062 -> 437
    //   480: putfield x : D
    //   483: getstatic Perryc.1 : I
    //   486: ifeq -> 499
    //   489: ldc2_w 835805735
    //   492: l2i
    //   493: ldc 1387090561
    //   495: ixor
    //   496: goto -> 506
    //   499: ldc2_w -978080209
    //   502: l2i
    //   503: ldc 1891539938
    //   505: ixor
    //   506: ldc2_w -285187230
    //   509: l2i
    //   510: ldc -271211828
    //   512: ixor
    //   513: ixor
    //   514: lookupswitch default -> 1030, -1244072861 -> 540, 1672081672 -> 499
    //   540: aload_0
    //   541: getstatic Perryc.1 : I
    //   544: ifeq -> 557
    //   547: ldc2_w -951125411
    //   550: l2i
    //   551: ldc 1498134787
    //   553: ixor
    //   554: goto -> 564
    //   557: ldc2_w 889106425
    //   560: l2i
    //   561: ldc 1727689270
    //   563: ixor
    //   564: ldc2_w 130063729
    //   567: l2i
    //   568: ldc 126288378
    //   570: ixor
    //   571: ixor
    //   572: lookupswitch default -> 1024, -1639784491 -> 557, 1380139332 -> 600
    //   600: dload #4
    //   602: getstatic Perryc.1 : I
    //   605: ifeq -> 618
    //   608: ldc2_w 1418770860
    //   611: l2i
    //   612: ldc -599114528
    //   614: ixor
    //   615: goto -> 625
    //   618: ldc2_w 610471044
    //   621: l2i
    //   622: ldc 2033999555
    //   624: ixor
    //   625: ldc2_w -741230383
    //   628: l2i
    //   629: ldc 553277216
    //   631: ixor
    //   632: ixor
    //   633: lookupswitch default -> 1052, -1368080970 -> 660, 2079419069 -> 618
    //   660: putfield y : D
    //   663: getstatic Perryc.c : I
    //   666: iflt -> 679
    //   669: ldc2_w 1471413381
    //   672: l2i
    //   673: ldc 1957996168
    //   675: ixor
    //   676: goto -> 686
    //   679: ldc2_w 121757965
    //   682: l2i
    //   683: ldc 1160590902
    //   685: ixor
    //   686: ldc2_w 807056279
    //   689: l2i
    //   690: ldc -1455680284
    //   692: ixor
    //   693: ixor
    //   694: lookupswitch default -> 1040, -1172177538 -> 679, -615878584 -> 720
    //   720: aload_0
    //   721: getstatic Perryc.0 : I
    //   724: ifle -> 737
    //   727: ldc2_w -238529446
    //   730: l2i
    //   731: ldc 1271415921
    //   733: ixor
    //   734: goto -> 744
    //   737: ldc2_w -393904374
    //   740: l2i
    //   741: ldc 2097416677
    //   743: ixor
    //   744: ldc2_w 494761163
    //   747: l2i
    //   748: ldc -237447730
    //   750: ixor
    //   751: ixor
    //   752: lookupswitch default -> 1056, 1453699374 -> 737, 2032457706 -> 780
    //   780: dload #6
    //   782: getstatic Perryc.1 : I
    //   785: ifeq -> 798
    //   788: ldc2_w -372834072
    //   791: l2i
    //   792: ldc -816442329
    //   794: ixor
    //   795: goto -> 805
    //   798: ldc2_w 1843361360
    //   801: l2i
    //   802: ldc 907714190
    //   804: ixor
    //   805: ldc2_w 392111983
    //   808: l2i
    //   809: ldc -868896822
    //   811: ixor
    //   812: ixor
    //   813: lookupswitch default -> 1032, -2135990149 -> 840, -33842070 -> 798
    //   840: putfield z : D
    //   843: getstatic Perryc.0 : I
    //   846: ifle -> 859
    //   849: ldc2_w 1544197550
    //   852: l2i
    //   853: ldc 1948627153
    //   855: ixor
    //   856: goto -> 866
    //   859: ldc2_w 448955537
    //   862: l2i
    //   863: ldc -49792226
    //   865: ixor
    //   866: ldc2_w -1316121819
    //   869: l2i
    //   870: ldc 146516116
    //   872: ixor
    //   873: ixor
    //   874: lookupswitch default -> 1048, -1860624690 -> 859, 1593607230 -> 900
    //   900: aload_0
    //   901: getstatic Perryc.0 : I
    //   904: ifle -> 917
    //   907: ldc2_w -260878288
    //   910: l2i
    //   911: ldc 880665427
    //   913: ixor
    //   914: goto -> 924
    //   917: ldc2_w 1879539597
    //   920: l2i
    //   921: ldc -1541069047
    //   923: ixor
    //   924: ldc2_w 421458796
    //   927: l2i
    //   928: ldc 1723727933
    //   930: ixor
    //   931: ixor
    //   932: lookupswitch default -> 960, -1146208206 -> 1054, -491322992 -> 917
    //   960: iload #8
    //   962: getstatic Perryc.0 : I
    //   965: ifle -> 978
    //   968: ldc2_w 1969591008
    //   971: l2i
    //   972: ldc -1845932143
    //   974: ixor
    //   975: goto -> 985
    //   978: ldc2_w -1782767711
    //   981: l2i
    //   982: ldc -1878320333
    //   984: ixor
    //   985: ldc2_w 1494810561
    //   988: l2i
    //   989: ldc -2022557260
    //   991: ixor
    //   992: ixor
    //   993: lookupswitch default -> 1020, 479895306 -> 978, 989207300 -> 1034
    //   1020: putfield airbone : Z
    //   1023: return
    //   1024: aconst_null
    //   1025: athrow
    //   1026: aconst_null
    //   1027: athrow
    //   1028: aconst_null
    //   1029: athrow
    //   1030: aconst_null
    //   1031: athrow
    //   1032: aconst_null
    //   1033: athrow
    //   1034: aconst_null
    //   1035: athrow
    //   1036: aconst_null
    //   1037: athrow
    //   1038: aconst_null
    //   1039: athrow
    //   1040: aconst_null
    //   1041: athrow
    //   1042: aconst_null
    //   1043: athrow
    //   1044: aconst_null
    //   1045: athrow
    //   1046: aconst_null
    //   1047: athrow
    //   1048: aconst_null
    //   1049: athrow
    //   1050: aconst_null
    //   1051: athrow
    //   1052: aconst_null
    //   1053: athrow
    //   1054: aconst_null
    //   1055: athrow
    //   1056: aconst_null
    //   1057: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1024	0	this	Lbigname/zprestige/webhack/event/events/PushEvent;
    //   0	1024	1	entity	Lnet/minecraft/entity/Entity;
    //   0	1024	2	x	D
    //   0	1024	4	y	D
    //   0	1024	6	z	D
    //   0	1024	8	airbone	Z
  }
  
  public PushEvent(int stage) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 1479395634
    //   9: l2i
    //   10: ldc 1724048926
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1382413439
    //   19: l2i
    //   20: ldc 723246839
    //   22: ixor
    //   23: ldc2_w -452926047
    //   26: l2i
    //   27: ldc 1851485689
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1246451852 -> 184, 1641180879 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.1 : I
    //   60: ifeq -> 73
    //   63: ldc2_w -1649681128
    //   66: l2i
    //   67: ldc 1369146608
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -718499023
    //   76: l2i
    //   77: ldc 320325686
    //   79: ixor
    //   80: ldc2_w -1315507539
    //   83: l2i
    //   84: ldc 1549874134
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 182, 566728851 -> 73, 734829180 -> 116
    //   116: iload_1
    //   117: getstatic Perryc.1 : I
    //   120: ifeq -> 133
    //   123: ldc2_w -361617015
    //   126: l2i
    //   127: ldc -2125755247
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w -972734801
    //   136: l2i
    //   137: ldc 441348844
    //   139: ixor
    //   140: ldc2_w -1340558677
    //   143: l2i
    //   144: ldc -1363900664
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 176, -1947523411 -> 133, 1972736187 -> 180
    //   176: invokespecial <init> : (I)V
    //   179: return
    //   180: aconst_null
    //   181: athrow
    //   182: aconst_null
    //   183: athrow
    //   184: aconst_null
    //   185: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	180	0	this	Lbigname/zprestige/webhack/event/events/PushEvent;
    //   0	180	1	stage	I
  }
  
  public PushEvent(int stage, Entity entity) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 769432557
    //   9: l2i
    //   10: ldc 1778375255
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1877653114
    //   19: l2i
    //   20: ldc -1763412653
    //   22: ixor
    //   23: ldc2_w 1603863948
    //   26: l2i
    //   27: ldc 877607146
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1892165925 -> 16, 804617436 -> 372
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w 927586226
    //   66: l2i
    //   67: ldc 1843902116
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 2131265637
    //   76: l2i
    //   77: ldc 574797746
    //   79: ixor
    //   80: ldc2_w 1236326826
    //   83: l2i
    //   84: ldc -1363177279
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1113511811 -> 366, -507942960 -> 73
    //   116: iload_1
    //   117: getstatic Perryc.c : I
    //   120: iflt -> 133
    //   123: ldc2_w -1946227687
    //   126: l2i
    //   127: ldc -363731512
    //   129: ixor
    //   130: goto -> 141
    //   133: ldc2_w 531060554
    //   136: l2i
    //   137: ldc_w -1118633035
    //   140: ixor
    //   141: ldc2_w 767748115
    //   144: l2i
    //   145: ldc_w -1981792607
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, -980557981 -> 374, 1439752245 -> 133
    //   176: invokespecial <init> : (I)V
    //   179: getstatic Perryc.1 : I
    //   182: ifeq -> 196
    //   185: ldc2_w 621126242
    //   188: l2i
    //   189: ldc_w -1472922545
    //   192: ixor
    //   193: goto -> 204
    //   196: ldc2_w 494554408
    //   199: l2i
    //   200: ldc_w 1521950724
    //   203: ixor
    //   204: ldc2_w 1485712060
    //   207: l2i
    //   208: ldc_w -1692801736
    //   211: ixor
    //   212: ixor
    //   213: lookupswitch default -> 240, 824890261 -> 196, 1319539113 -> 368
    //   240: aload_0
    //   241: getstatic Perryc.1 : I
    //   244: ifeq -> 258
    //   247: ldc2_w -1899387505
    //   250: l2i
    //   251: ldc_w -1347140109
    //   254: ixor
    //   255: goto -> 266
    //   258: ldc2_w 1654075027
    //   261: l2i
    //   262: ldc_w 921547034
    //   265: ixor
    //   266: ldc2_w -248984291
    //   269: l2i
    //   270: ldc_w -84649686
    //   273: ixor
    //   274: ixor
    //   275: lookupswitch default -> 370, 715224139 -> 258, 1604717502 -> 300
    //   300: aload_2
    //   301: getstatic Perryc.0 : I
    //   304: ifle -> 318
    //   307: ldc2_w -55023169
    //   310: l2i
    //   311: ldc_w -1085185023
    //   314: ixor
    //   315: goto -> 326
    //   318: ldc2_w 1678541608
    //   321: l2i
    //   322: ldc_w -1895318819
    //   325: ixor
    //   326: ldc2_w -1763679695
    //   329: l2i
    //   330: ldc_w -1881390715
    //   333: ixor
    //   334: ixor
    //   335: lookupswitch default -> 364, -231269823 -> 360, 1523920394 -> 318
    //   360: putfield entity : Lnet/minecraft/entity/Entity;
    //   363: return
    //   364: aconst_null
    //   365: athrow
    //   366: aconst_null
    //   367: athrow
    //   368: aconst_null
    //   369: athrow
    //   370: aconst_null
    //   371: athrow
    //   372: aconst_null
    //   373: athrow
    //   374: aconst_null
    //   375: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	364	0	this	Lbigname/zprestige/webhack/event/events/PushEvent;
    //   0	364	1	stage	I
    //   0	364	2	entity	Lnet/minecraft/entity/Entity;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\PushEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */