package bigname.zprestige.webhack.features.modules.Client;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.ClientEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import java.util.HashMap;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Notify extends Module {
  public static HashMap<String, Integer> TotemPopContainer;
  
  public Setting<Boolean> moduleMessage;
  
  public Setting<Boolean> popCounter;
  
  public static List<String> modules;
  
  public static Notify INSTANCE;
  
  public Notify() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 2132276412
    //   9: l2i
    //   10: ldc 1479129512
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -2117436866
    //   19: l2i
    //   20: ldc -792813737
    //   22: ixor
    //   23: ldc2_w 1248268388
    //   26: l2i
    //   27: ldc 2075188488
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, 384401528 -> 1342, 1622025990 -> 16
    //   56: aload_0
    //   57: ldc '҉㌜ә㶾눂'
    //   59: getstatic Perryc.1 : I
    //   62: ifeq -> 75
    //   65: ldc2_w -650847980
    //   68: l2i
    //   69: ldc -1082721079
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -1436177992
    //   78: l2i
    //   79: ldc -785881221
    //   81: ixor
    //   82: ldc2_w -1743370534
    //   85: l2i
    //   86: ldc 1741601395
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 116, -1717905036 -> 1322, -1703623961 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc 'ҷ㌜ӝ㶢눔๷礃蹤뱹ਵ'
    //   121: getstatic Perryc.1 : I
    //   124: ifeq -> 137
    //   127: ldc2_w -1537953416
    //   130: l2i
    //   131: ldc -451610942
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w -1957285207
    //   140: l2i
    //   141: ldc -71555590
    //   143: ixor
    //   144: ldc2_w -540134091
    //   147: l2i
    //   148: ldc 340280637
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 1332, -1966721102 -> 137, -1150523557 -> 180
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.1 : I
    //   186: ifeq -> 199
    //   189: ldc2_w 5724658
    //   192: l2i
    //   193: ldc 925619005
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w 437910875
    //   202: l2i
    //   203: ldc -2143828031
    //   205: ixor
    //   206: ldc2_w 2101880450
    //   209: l2i
    //   210: ldc 270974958
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 240, -2004130192 -> 199, 1511134115 -> 1348
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.CLIENT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w 1353386738
    //   246: l2i
    //   247: ldc 1353386739
    //   249: ixor
    //   250: ldc2_w 1827146476
    //   253: l2i
    //   254: ldc 1827146476
    //   256: ixor
    //   257: ldc2_w -1910309788
    //   260: l2i
    //   261: ldc -1910309788
    //   263: ixor
    //   264: getstatic Perryc.1 : I
    //   267: ifeq -> 280
    //   270: ldc2_w 386579549
    //   273: l2i
    //   274: ldc -521585556
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w -1067447141
    //   283: l2i
    //   284: ldc -1302514013
    //   286: ixor
    //   287: ldc2_w -807785283
    //   290: l2i
    //   291: ldc -1784699769
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 1328, -1381627893 -> 280, 678998530 -> 320
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.1 : I
    //   326: ifeq -> 339
    //   329: ldc2_w 2088798515
    //   332: l2i
    //   333: ldc 364548497
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w 25185107
    //   342: l2i
    //   343: ldc -392282633
    //   345: ixor
    //   346: ldc2_w -698098821
    //   349: l2i
    //   350: ldc -1831641849
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 1344, -1381044008 -> 380, 764059358 -> 339
    //   380: aload_0
    //   381: getstatic Perryc.1 : I
    //   384: ifeq -> 397
    //   387: ldc2_w -2101138580
    //   390: l2i
    //   391: ldc -745627639
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w 177127532
    //   400: l2i
    //   401: ldc 1172516407
    //   403: ixor
    //   404: ldc2_w 1390441592
    //   407: l2i
    //   408: ldc 131515837
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 440, -1396199896 -> 397, 75184800 -> 1346
    //   440: aload_0
    //   441: new bigname/zprestige/webhack/features/setting/Setting
    //   444: dup
    //   445: ldc 'Ҋ㌜Ӊ㶢눈๔礏蹰뱽ਠ쥺'
    //   447: getstatic Perryc.0 : I
    //   450: ifle -> 463
    //   453: ldc2_w -346799799
    //   456: l2i
    //   457: ldc 1907829686
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w 256796724
    //   466: l2i
    //   467: ldc 269521842
    //   469: ixor
    //   470: ldc2_w 2029770241
    //   473: l2i
    //   474: ldc -1062572022
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 1312, -1492165235 -> 504, 582143220 -> 463
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: ldc2_w -1033272230
    //   510: l2i
    //   511: ldc -1033272230
    //   513: ixor
    //   514: getstatic Perryc.1 : I
    //   517: ifeq -> 530
    //   520: ldc2_w 1765755130
    //   523: l2i
    //   524: ldc -1165895017
    //   526: ixor
    //   527: goto -> 537
    //   530: ldc2_w -829555712
    //   533: l2i
    //   534: ldc 1970331835
    //   536: ixor
    //   537: ldc2_w 70027821
    //   540: l2i
    //   541: ldc 187126414
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 1314, -1258896360 -> 572, -592098610 -> 530
    //   572: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   575: getstatic Perryc.c : I
    //   578: iflt -> 591
    //   581: ldc2_w 1257095043
    //   584: l2i
    //   585: ldc -773156349
    //   587: ixor
    //   588: goto -> 598
    //   591: ldc2_w 2064047140
    //   594: l2i
    //   595: ldc 1420807671
    //   597: ixor
    //   598: ldc2_w 300666329
    //   601: l2i
    //   602: ldc -971719572
    //   604: ixor
    //   605: ixor
    //   606: lookupswitch default -> 1350, -128556954 -> 632, 1291344949 -> 591
    //   632: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   635: getstatic Perryc.c : I
    //   638: iflt -> 651
    //   641: ldc2_w -969940689
    //   644: l2i
    //   645: ldc -304383917
    //   647: ixor
    //   648: goto -> 658
    //   651: ldc2_w -860854337
    //   654: l2i
    //   655: ldc 194691278
    //   657: ixor
    //   658: ldc2_w 988099204
    //   661: l2i
    //   662: ldc 1094385849
    //   664: ixor
    //   665: ixor
    //   666: lookupswitch default -> 1336, -1124821684 -> 692, 1344973633 -> 651
    //   692: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   695: getstatic Perryc.c : I
    //   698: iflt -> 711
    //   701: ldc2_w -907091830
    //   704: l2i
    //   705: ldc -1289161957
    //   707: ixor
    //   708: goto -> 718
    //   711: ldc2_w 2079724409
    //   714: l2i
    //   715: ldc 1023909526
    //   717: ixor
    //   718: ldc2_w -101231859
    //   721: l2i
    //   722: ldc 803133997
    //   724: ixor
    //   725: ixor
    //   726: lookupswitch default -> 752, -1393583439 -> 1318, 2126298911 -> 711
    //   752: putfield moduleMessage : Lbigname/zprestige/webhack/features/setting/Setting;
    //   755: getstatic Perryc.c : I
    //   758: iflt -> 771
    //   761: ldc2_w 1168690264
    //   764: l2i
    //   765: ldc 2055666475
    //   767: ixor
    //   768: goto -> 778
    //   771: ldc2_w 1093984594
    //   774: l2i
    //   775: ldc -1719575961
    //   777: ixor
    //   778: ldc2_w 834679438
    //   781: l2i
    //   782: ldc -1110838411
    //   784: ixor
    //   785: ixor
    //   786: lookupswitch default -> 812, -1289226616 -> 1352, -226148547 -> 771
    //   812: aload_0
    //   813: getstatic Perryc.0 : I
    //   816: ifle -> 829
    //   819: ldc2_w -447043828
    //   822: l2i
    //   823: ldc 1015873795
    //   825: ixor
    //   826: goto -> 836
    //   829: ldc2_w -1335428931
    //   832: l2i
    //   833: ldc 466136973
    //   835: ixor
    //   836: ldc2_w 1757071997
    //   839: l2i
    //   840: ldc -322573107
    //   842: ixor
    //   843: ixor
    //   844: lookupswitch default -> 1324, 802255232 -> 872, 1571324095 -> 829
    //   872: aload_0
    //   873: new bigname/zprestige/webhack/features/setting/Setting
    //   876: dup
    //   877: ldc 'җ㌜ӝ㶔눋๷礞蹦'
    //   879: getstatic Perryc.1 : I
    //   882: ifeq -> 895
    //   885: ldc2_w 1205011101
    //   888: l2i
    //   889: ldc -477171258
    //   891: ixor
    //   892: goto -> 902
    //   895: ldc2_w -508004559
    //   898: l2i
    //   899: ldc 716368077
    //   901: ixor
    //   902: ldc2_w -1727369467
    //   905: l2i
    //   906: ldc 1036161429
    //   908: ixor
    //   909: ixor
    //   910: lookupswitch default -> 936, -581329851 -> 895, 9768395 -> 1326
    //   936: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   939: ldc2_w -430347741
    //   942: l2i
    //   943: ldc -430347741
    //   945: ixor
    //   946: getstatic Perryc.c : I
    //   949: iflt -> 962
    //   952: ldc2_w -527676667
    //   955: l2i
    //   956: ldc -86205811
    //   958: ixor
    //   959: goto -> 969
    //   962: ldc2_w 1623506343
    //   965: l2i
    //   966: ldc -440599322
    //   968: ixor
    //   969: ldc2_w 549423451
    //   972: l2i
    //   973: ldc 357050929
    //   975: ixor
    //   976: ixor
    //   977: lookupswitch default -> 1338, -1332747733 -> 1004, 799503074 -> 962
    //   1004: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   1007: getstatic Perryc.1 : I
    //   1010: ifeq -> 1023
    //   1013: ldc2_w 1177190393
    //   1016: l2i
    //   1017: ldc 150244234
    //   1019: ixor
    //   1020: goto -> 1030
    //   1023: ldc2_w -559183919
    //   1026: l2i
    //   1027: ldc -321268408
    //   1029: ixor
    //   1030: ldc2_w 1286545609
    //   1033: l2i
    //   1034: ldc 1269327512
    //   1036: ixor
    //   1037: ixor
    //   1038: lookupswitch default -> 1334, 896865480 -> 1064, 1239003682 -> 1023
    //   1064: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   1067: getstatic Perryc.c : I
    //   1070: iflt -> 1083
    //   1073: ldc2_w 331558076
    //   1076: l2i
    //   1077: ldc -1731553767
    //   1079: ixor
    //   1080: goto -> 1090
    //   1083: ldc2_w 704764533
    //   1086: l2i
    //   1087: ldc -2012388180
    //   1089: ixor
    //   1090: ldc2_w 295297153
    //   1093: l2i
    //   1094: ldc 1704583450
    //   1096: ixor
    //   1097: ixor
    //   1098: lookupswitch default -> 1124, -16139458 -> 1340, 1800859987 -> 1083
    //   1124: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1127: getstatic Perryc.1 : I
    //   1130: ifeq -> 1143
    //   1133: ldc2_w 625541097
    //   1136: l2i
    //   1137: ldc 1611524491
    //   1139: ixor
    //   1140: goto -> 1150
    //   1143: ldc2_w -2036207290
    //   1146: l2i
    //   1147: ldc 561177370
    //   1149: ixor
    //   1150: ldc2_w -1574799673
    //   1153: l2i
    //   1154: ldc_w -2017811201
    //   1157: ixor
    //   1158: ixor
    //   1159: lookupswitch default -> 1316, -2108964764 -> 1184, 1625146458 -> 1143
    //   1184: putfield popCounter : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1187: getstatic Perryc.0 : I
    //   1190: ifle -> 1204
    //   1193: ldc2_w 1516723420
    //   1196: l2i
    //   1197: ldc_w -1382164968
    //   1200: ixor
    //   1201: goto -> 1212
    //   1204: ldc2_w 1268471151
    //   1207: l2i
    //   1208: ldc_w -341705528
    //   1211: ixor
    //   1212: ldc2_w -760125826
    //   1215: l2i
    //   1216: ldc_w 785221385
    //   1219: ixor
    //   1220: ixor
    //   1221: lookupswitch default -> 1248, -2146122573 -> 1204, 193358771 -> 1330
    //   1248: aload_0
    //   1249: getstatic Perryc.0 : I
    //   1252: ifle -> 1266
    //   1255: ldc2_w 1304082705
    //   1258: l2i
    //   1259: ldc_w 1553379187
    //   1262: ixor
    //   1263: goto -> 1274
    //   1266: ldc2_w 168786068
    //   1269: l2i
    //   1270: ldc_w -1840671869
    //   1273: ixor
    //   1274: ldc2_w -225643432
    //   1277: l2i
    //   1278: ldc_w 206527123
    //   1281: ixor
    //   1282: ixor
    //   1283: lookupswitch default -> 1308, -269502295 -> 1320, 1755052806 -> 1266
    //   1308: invokespecial setInstance : ()V
    //   1311: return
    //   1312: aconst_null
    //   1313: athrow
    //   1314: aconst_null
    //   1315: athrow
    //   1316: aconst_null
    //   1317: athrow
    //   1318: aconst_null
    //   1319: athrow
    //   1320: aconst_null
    //   1321: athrow
    //   1322: aconst_null
    //   1323: athrow
    //   1324: aconst_null
    //   1325: athrow
    //   1326: aconst_null
    //   1327: athrow
    //   1328: aconst_null
    //   1329: athrow
    //   1330: aconst_null
    //   1331: athrow
    //   1332: aconst_null
    //   1333: athrow
    //   1334: aconst_null
    //   1335: athrow
    //   1336: aconst_null
    //   1337: athrow
    //   1338: aconst_null
    //   1339: athrow
    //   1340: aconst_null
    //   1341: athrow
    //   1342: aconst_null
    //   1343: athrow
    //   1344: aconst_null
    //   1345: athrow
    //   1346: aconst_null
    //   1347: athrow
    //   1348: aconst_null
    //   1349: athrow
    //   1350: aconst_null
    //   1351: athrow
    //   1352: aconst_null
    //   1353: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1312	0	this	Lbigname/zprestige/webhack/features/modules/Client/Notify;
  }
  
  public static Notify getInstance() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 377
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 369
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 361
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -460292283
    //   33: l2i
    //   34: ldc_w 1808971186
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1014765957
    //   44: l2i
    //   45: ldc_w 1330743319
    //   48: ixor
    //   49: ldc2_w -1954280398
    //   52: l2i
    //   53: ldc_w 336917418
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, 282211695 -> 348, 2003395490 -> 41
    //   84: getstatic bigname/zprestige/webhack/features/modules/Client/Notify.INSTANCE : Lbigname/zprestige/webhack/features/modules/Client/Notify;
    //   87: ifnonnull -> 101
    //   90: ldc2_w 452299649
    //   93: l2i
    //   94: ldc_w -1957796977
    //   97: ixor
    //   98: goto -> 109
    //   101: ldc2_w 660334821
    //   104: l2i
    //   105: ldc_w -1226833684
    //   108: ixor
    //   109: ldc2_w 2140102990
    //   112: l2i
    //   113: ldc_w -550855213
    //   116: ixor
    //   117: ixor
    //   118: tableswitch default -> 90, 824054931 -> 140, 824054932 -> 279
    //   140: new bigname/zprestige/webhack/features/modules/Client/Notify
    //   143: dup
    //   144: getstatic Perryc.1 : I
    //   147: ifeq -> 161
    //   150: ldc2_w 140764840
    //   153: l2i
    //   154: ldc_w -1588580744
    //   157: ixor
    //   158: goto -> 169
    //   161: ldc2_w 1702521464
    //   164: l2i
    //   165: ldc_w 187707535
    //   168: ixor
    //   169: ldc2_w 1156421993
    //   172: l2i
    //   173: ldc_w 1430377886
    //   176: ixor
    //   177: ixor
    //   178: lookupswitch default -> 204, -1197505497 -> 350, -888725343 -> 161
    //   204: goto -> 208
    //   207: athrow
    //   208: invokespecial <init> : ()V
    //   211: goto -> 215
    //   214: athrow
    //   215: getstatic Perryc.0 : I
    //   218: ifle -> 232
    //   221: ldc2_w 799100146
    //   224: l2i
    //   225: ldc_w -2115230919
    //   228: ixor
    //   229: goto -> 240
    //   232: ldc2_w 2135124810
    //   235: l2i
    //   236: ldc_w -981598783
    //   239: ixor
    //   240: ldc2_w 1333053142
    //   243: l2i
    //   244: ldc_w -819562778
    //   247: ixor
    //   248: ixor
    //   249: lookupswitch default -> 276, 499637783 -> 232, 773840891 -> 346
    //   276: putstatic bigname/zprestige/webhack/features/modules/Client/Notify.INSTANCE : Lbigname/zprestige/webhack/features/modules/Client/Notify;
    //   279: getstatic Perryc.0 : I
    //   282: ifle -> 296
    //   285: ldc2_w 487270640
    //   288: l2i
    //   289: ldc_w 272191827
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w 87457910
    //   299: l2i
    //   300: ldc_w -1896628794
    //   303: ixor
    //   304: ldc2_w -131759479
    //   307: l2i
    //   308: ldc_w 837121306
    //   311: ixor
    //   312: ixor
    //   313: lookupswitch default -> 344, -990736848 -> 296, 1107675683 -> 340
    //   340: getstatic bigname/zprestige/webhack/features/modules/Client/Notify.INSTANCE : Lbigname/zprestige/webhack/features/modules/Client/Notify;
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
    //   8	20	361	java/lang/StringIndexOutOfBoundsException
    //   208	214	214	finally
    //   208	214	3	finally
    //   208	214	3	java/lang/ArithmeticException
    //   208	214	214	java/lang/NullPointerException
    //   208	214	3	finally
    //   361	369	361	java/lang/NumberFormatException
    //   377	379	3	finally
  }
  
  @SubscribeEvent
  public void onToggleModule(ClientEvent event) {
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
  
  public void setInstance() {
    Perry1.40(this, (int)2082382759L ^ 0x6E024721);
  }
  
  public void onDeath(EntityPlayer player) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 7963
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 7955
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 7947
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 1143794418
    //   33: l2i
    //   34: ldc_w 1425176109
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 2049770457
    //   44: l2i
    //   45: ldc_w 185031670
    //   48: ixor
    //   49: ldc2_w -966697940
    //   52: l2i
    //   53: ldc_w 1890620921
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 7910, -1508944630 -> 41, -939814406 -> 84
    //   84: getstatic bigname/zprestige/webhack/features/modules/Client/Notify.TotemPopContainer : Ljava/util/HashMap;
    //   87: getstatic Perryc.1 : I
    //   90: ifeq -> 104
    //   93: ldc2_w -1802386879
    //   96: l2i
    //   97: ldc_w -208966937
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w 223338252
    //   107: l2i
    //   108: ldc_w -432346557
    //   111: ixor
    //   112: ldc2_w 1772374144
    //   115: l2i
    //   116: ldc_w 40693069
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 148, -1241094178 -> 104, 215092587 -> 7826
    //   148: aload_1
    //   149: getstatic Perryc.1 : I
    //   152: ifeq -> 166
    //   155: ldc2_w -2034970241
    //   158: l2i
    //   159: ldc_w 1554598392
    //   162: ixor
    //   163: goto -> 174
    //   166: ldc2_w -909297337
    //   169: l2i
    //   170: ldc_w -930873887
    //   173: ixor
    //   174: ldc2_w 49294083
    //   177: l2i
    //   178: ldc_w -1339880269
    //   181: ixor
    //   182: ixor
    //   183: lookupswitch default -> 7780, -1281498346 -> 208, 1758379831 -> 166
    //   208: goto -> 212
    //   211: athrow
    //   212: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   215: goto -> 219
    //   218: athrow
    //   219: getstatic Perryc.1 : I
    //   222: ifeq -> 236
    //   225: ldc2_w -463391418
    //   228: l2i
    //   229: ldc_w 1890642352
    //   232: ixor
    //   233: goto -> 244
    //   236: ldc2_w 1860662843
    //   239: l2i
    //   240: ldc_w 2064621994
    //   243: ixor
    //   244: ldc2_w -477661025
    //   247: l2i
    //   248: ldc_w 1936080700
    //   251: ixor
    //   252: ixor
    //   253: lookupswitch default -> 280, 70294357 -> 7920, 1273640782 -> 236
    //   280: goto -> 284
    //   283: athrow
    //   284: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   287: goto -> 291
    //   290: athrow
    //   291: ifeq -> 305
    //   294: ldc2_w 1613999389
    //   297: l2i
    //   298: ldc_w 1216996904
    //   301: ixor
    //   302: goto -> 313
    //   305: ldc2_w -622917416
    //   308: l2i
    //   309: ldc_w -228244500
    //   312: ixor
    //   313: ldc2_w 562671914
    //   316: l2i
    //   317: ldc_w -1174378887
    //   320: ixor
    //   321: ixor
    //   322: tableswitch default -> 294, -1288463258 -> 344, -1288463257 -> 7719
    //   344: getstatic Perryc.0 : I
    //   347: ifle -> 361
    //   350: ldc2_w 1220137827
    //   353: l2i
    //   354: ldc_w 763065947
    //   357: ixor
    //   358: goto -> 369
    //   361: ldc2_w -1173878660
    //   364: l2i
    //   365: ldc_w 1315457279
    //   368: ixor
    //   369: ldc2_w -1811493457
    //   372: l2i
    //   373: ldc_w -1642116225
    //   376: ixor
    //   377: ixor
    //   378: lookupswitch default -> 404, 337536907 -> 361, 1876632552 -> 7896
    //   404: getstatic bigname/zprestige/webhack/features/modules/Client/Notify.TotemPopContainer : Ljava/util/HashMap;
    //   407: getstatic Perryc.1 : I
    //   410: ifeq -> 424
    //   413: ldc2_w -886487633
    //   416: l2i
    //   417: ldc_w 883778036
    //   420: ixor
    //   421: goto -> 432
    //   424: ldc2_w 1777516604
    //   427: l2i
    //   428: ldc_w -2128634840
    //   431: ixor
    //   432: ldc2_w 1692431637
    //   435: l2i
    //   436: ldc_w 239910273
    //   439: ixor
    //   440: ixor
    //   441: lookupswitch default -> 468, -1792480049 -> 7782, 730757151 -> 424
    //   468: aload_1
    //   469: getstatic Perryc.0 : I
    //   472: ifle -> 486
    //   475: ldc2_w 1101224022
    //   478: l2i
    //   479: ldc_w 2092105104
    //   482: ixor
    //   483: goto -> 494
    //   486: ldc2_w -2085963168
    //   489: l2i
    //   490: ldc_w -201536488
    //   493: ixor
    //   494: ldc2_w -1844935974
    //   497: l2i
    //   498: ldc_w 1866752286
    //   501: ixor
    //   502: ixor
    //   503: lookupswitch default -> 528, -1641882714 -> 486, -1067629054 -> 7850
    //   528: goto -> 532
    //   531: athrow
    //   532: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   535: goto -> 539
    //   538: athrow
    //   539: getstatic Perryc.c : I
    //   542: iflt -> 556
    //   545: ldc2_w 689692410
    //   548: l2i
    //   549: ldc_w 51777529
    //   552: ixor
    //   553: goto -> 564
    //   556: ldc2_w 1622477962
    //   559: l2i
    //   560: ldc_w -1602084240
    //   563: ixor
    //   564: ldc2_w -1906882891
    //   567: l2i
    //   568: ldc_w 1776325414
    //   571: ixor
    //   572: ixor
    //   573: lookupswitch default -> 7876, -843447152 -> 556, 662764393 -> 600
    //   600: goto -> 604
    //   603: athrow
    //   604: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   607: goto -> 611
    //   610: athrow
    //   611: checkcast java/lang/Integer
    //   614: getstatic Perryc.1 : I
    //   617: ifeq -> 631
    //   620: ldc2_w -436144814
    //   623: l2i
    //   624: ldc_w -991002513
    //   627: ixor
    //   628: goto -> 639
    //   631: ldc2_w 662392423
    //   634: l2i
    //   635: ldc_w 651134697
    //   638: ixor
    //   639: ldc2_w -2089564435
    //   642: l2i
    //   643: ldc_w 2030353864
    //   646: ixor
    //   647: ixor
    //   648: lookupswitch default -> 7834, -661058024 -> 631, -71060565 -> 676
    //   676: goto -> 680
    //   679: athrow
    //   680: invokevirtual intValue : ()I
    //   683: goto -> 687
    //   686: athrow
    //   687: getstatic Perryc.1 : I
    //   690: ifeq -> 704
    //   693: ldc2_w 1571894648
    //   696: l2i
    //   697: ldc_w 1599398054
    //   700: ixor
    //   701: goto -> 712
    //   704: ldc2_w 963831308
    //   707: l2i
    //   708: ldc_w -1180395657
    //   711: ixor
    //   712: ldc2_w -131730712
    //   715: l2i
    //   716: ldc_w 1821852096
    //   719: ixor
    //   720: ixor
    //   721: lookupswitch default -> 748, -1772656906 -> 7774, -48481182 -> 704
    //   748: istore_2
    //   749: getstatic Perryc.1 : I
    //   752: ifeq -> 766
    //   755: ldc2_w 2081704742
    //   758: l2i
    //   759: ldc_w -1476491429
    //   762: ixor
    //   763: goto -> 774
    //   766: ldc2_w -1944438894
    //   769: l2i
    //   770: ldc_w 260743531
    //   773: ixor
    //   774: ldc2_w -1535239087
    //   777: l2i
    //   778: ldc_w -1951425858
    //   781: ixor
    //   782: ixor
    //   783: lookupswitch default -> 808, -243489507 -> 766, -197440878 -> 7758
    //   808: getstatic bigname/zprestige/webhack/features/modules/Client/Notify.TotemPopContainer : Ljava/util/HashMap;
    //   811: getstatic Perryc.0 : I
    //   814: ifle -> 828
    //   817: ldc2_w 1817167294
    //   820: l2i
    //   821: ldc_w -1009159059
    //   824: ixor
    //   825: goto -> 836
    //   828: ldc2_w 1289105191
    //   831: l2i
    //   832: ldc_w -1900802476
    //   835: ixor
    //   836: ldc2_w -1890786770
    //   839: l2i
    //   840: ldc_w -2145315629
    //   843: ixor
    //   844: ixor
    //   845: lookupswitch default -> 872, -1594144978 -> 7738, -949006831 -> 828
    //   872: aload_1
    //   873: getstatic Perryc.1 : I
    //   876: ifeq -> 890
    //   879: ldc2_w 459733018
    //   882: l2i
    //   883: ldc_w 631090078
    //   886: ixor
    //   887: goto -> 898
    //   890: ldc2_w -699217664
    //   893: l2i
    //   894: ldc_w 1019015560
    //   897: ixor
    //   898: ldc2_w 47502759
    //   901: l2i
    //   902: ldc_w 1279369120
    //   905: ixor
    //   906: ixor
    //   907: lookupswitch default -> 932, -320693175 -> 890, 1886263683 -> 7724
    //   932: goto -> 936
    //   935: athrow
    //   936: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   939: goto -> 943
    //   942: athrow
    //   943: getstatic Perryc.c : I
    //   946: iflt -> 960
    //   949: ldc2_w -466875934
    //   952: l2i
    //   953: ldc_w -928388294
    //   956: ixor
    //   957: goto -> 968
    //   960: ldc2_w 1007644174
    //   963: l2i
    //   964: ldc_w 1922420190
    //   967: ixor
    //   968: ldc2_w -554021709
    //   971: l2i
    //   972: ldc_w 1277935330
    //   975: ixor
    //   976: ixor
    //   977: lookupswitch default -> 7798, -1101786999 -> 960, -599043711 -> 1004
    //   1004: goto -> 1008
    //   1007: athrow
    //   1008: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1011: goto -> 1015
    //   1014: athrow
    //   1015: pop
    //   1016: getstatic Perryc.0 : I
    //   1019: ifle -> 1033
    //   1022: ldc2_w 1232443623
    //   1025: l2i
    //   1026: ldc_w 1992239027
    //   1029: ixor
    //   1030: goto -> 1041
    //   1033: ldc2_w 1560985902
    //   1036: l2i
    //   1037: ldc_w 1415358278
    //   1040: ixor
    //   1041: ldc2_w -395406260
    //   1044: l2i
    //   1045: ldc_w 1777817963
    //   1048: ixor
    //   1049: ixor
    //   1050: lookupswitch default -> 1076, -1586847265 -> 1033, -1101827469 -> 7934
    //   1076: iload_2
    //   1077: ldc2_w 808416723
    //   1080: l2i
    //   1081: ldc_w 808416722
    //   1084: ixor
    //   1085: if_icmpne -> 1099
    //   1088: ldc2_w -1633123969
    //   1091: l2i
    //   1092: ldc_w 984307276
    //   1095: ixor
    //   1096: goto -> 1107
    //   1099: ldc2_w 985890829
    //   1102: l2i
    //   1103: ldc_w -1631561919
    //   1106: ixor
    //   1107: ldc2_w -1776610884
    //   1110: l2i
    //   1111: ldc_w -1186281168
    //   1114: ixor
    //   1115: ixor
    //   1116: tableswitch default -> 1088, -1957556289 -> 1140, -1957556288 -> 4430
    //   1140: getstatic Perryc.0 : I
    //   1143: ifle -> 1157
    //   1146: ldc2_w -532564511
    //   1149: l2i
    //   1150: ldc_w 2076894981
    //   1153: ixor
    //   1154: goto -> 1165
    //   1157: ldc2_w -755717516
    //   1160: l2i
    //   1161: ldc_w -829389418
    //   1164: ixor
    //   1165: ldc2_w -1304800794
    //   1168: l2i
    //   1169: ldc_w 158497704
    //   1172: ixor
    //   1173: ixor
    //   1174: lookupswitch default -> 7742, -1490287188 -> 1200, 549681322 -> 1157
    //   1200: aload_0
    //   1201: getstatic Perryc.1 : I
    //   1204: ifeq -> 1218
    //   1207: ldc2_w 325090986
    //   1210: l2i
    //   1211: ldc_w -832778441
    //   1214: ixor
    //   1215: goto -> 1226
    //   1218: ldc2_w -64188234
    //   1221: l2i
    //   1222: ldc_w 1053245300
    //   1225: ixor
    //   1226: ldc2_w -830474959
    //   1229: l2i
    //   1230: ldc_w 537046312
    //   1233: ixor
    //   1234: ixor
    //   1235: lookupswitch default -> 1260, 859957636 -> 7862, 1000764453 -> 1218
    //   1260: getfield popCounter : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1263: getstatic Perryc.1 : I
    //   1266: ifeq -> 1280
    //   1269: ldc2_w 1562229729
    //   1272: l2i
    //   1273: ldc_w -1881511806
    //   1276: ixor
    //   1277: goto -> 1288
    //   1280: ldc2_w 909653239
    //   1283: l2i
    //   1284: ldc_w 2080267279
    //   1287: ixor
    //   1288: ldc2_w -208486441
    //   1291: l2i
    //   1292: ldc_w 1819131542
    //   1295: ixor
    //   1296: ixor
    //   1297: lookupswitch default -> 7926, -767989319 -> 1324, 1295569442 -> 1280
    //   1324: goto -> 1328
    //   1327: athrow
    //   1328: invokevirtual getValue : ()Ljava/lang/Object;
    //   1331: goto -> 1335
    //   1334: athrow
    //   1335: checkcast java/lang/Boolean
    //   1338: getstatic Perryc.c : I
    //   1341: iflt -> 1355
    //   1344: ldc2_w 1571968577
    //   1347: l2i
    //   1348: ldc_w 1115285855
    //   1351: ixor
    //   1352: goto -> 1363
    //   1355: ldc2_w -1629399503
    //   1358: l2i
    //   1359: ldc_w -1623365381
    //   1362: ixor
    //   1363: ldc2_w -1205053253
    //   1366: l2i
    //   1367: ldc_w -1124130472
    //   1370: ixor
    //   1371: ixor
    //   1372: lookupswitch default -> 1400, -883896358 -> 1355, 454608637 -> 7828
    //   1400: goto -> 1404
    //   1403: athrow
    //   1404: invokevirtual booleanValue : ()Z
    //   1407: goto -> 1411
    //   1410: athrow
    //   1411: ifeq -> 1425
    //   1414: ldc2_w -1392694199
    //   1417: l2i
    //   1418: ldc_w 2029572855
    //   1421: ixor
    //   1422: goto -> 1433
    //   1425: ldc2_w -1327128752
    //   1428: l2i
    //   1429: ldc_w 1692426721
    //   1432: ixor
    //   1433: ldc2_w -2009261419
    //   1436: l2i
    //   1437: ldc_w -2092719924
    //   1440: ixor
    //   1441: ixor
    //   1442: tableswitch default -> 1414, -545569561 -> 1464, -545569560 -> 7719
    //   1464: ldc2_w -882984896
    //   1467: l2i
    //   1468: ldc_w -882984896
    //   1471: ixor
    //   1472: getstatic Perryc.1 : I
    //   1475: ifeq -> 1489
    //   1478: ldc2_w 445699944
    //   1481: l2i
    //   1482: ldc_w -1447271907
    //   1485: ixor
    //   1486: goto -> 1497
    //   1489: ldc2_w -894483104
    //   1492: l2i
    //   1493: ldc_w -1815398390
    //   1496: ixor
    //   1497: ldc2_w 1378603410
    //   1500: l2i
    //   1501: ldc_w -1035744747
    //   1504: ixor
    //   1505: ixor
    //   1506: lookupswitch default -> 7818, -921934099 -> 1532, 591703794 -> 1489
    //   1532: istore_3
    //   1533: getstatic Perryc.0 : I
    //   1536: ifle -> 1550
    //   1539: ldc2_w -694755541
    //   1542: l2i
    //   1543: ldc_w 302246413
    //   1546: ixor
    //   1547: goto -> 1558
    //   1550: ldc2_w 1058563753
    //   1553: l2i
    //   1554: ldc_w -803942025
    //   1557: ixor
    //   1558: ldc2_w -1503660436
    //   1561: l2i
    //   1562: ldc_w 1597547741
    //   1565: ixor
    //   1566: ixor
    //   1567: lookupswitch default -> 1592, -1988408417 -> 1550, 1039296407 -> 7860
    //   1592: aload_1
    //   1593: getstatic Perryc.1 : I
    //   1596: ifeq -> 1610
    //   1599: ldc2_w -2028045681
    //   1602: l2i
    //   1603: ldc_w 1658903212
    //   1606: ixor
    //   1607: goto -> 1618
    //   1610: ldc2_w 1953156789
    //   1613: l2i
    //   1614: ldc_w 559983233
    //   1617: ixor
    //   1618: ldc2_w 908632070
    //   1621: l2i
    //   1622: ldc_w 112599988
    //   1625: ixor
    //   1626: ixor
    //   1627: lookupswitch default -> 1652, -715119727 -> 7788, 479271714 -> 1610
    //   1652: goto -> 1656
    //   1655: athrow
    //   1656: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   1659: goto -> 1663
    //   1662: athrow
    //   1663: getstatic Perryc.c : I
    //   1666: iflt -> 1680
    //   1669: ldc2_w -739327382
    //   1672: l2i
    //   1673: ldc_w -460129055
    //   1676: ixor
    //   1677: goto -> 1688
    //   1680: ldc2_w 686367209
    //   1683: l2i
    //   1684: ldc_w 1115493906
    //   1687: ixor
    //   1688: ldc2_w -965278087
    //   1691: l2i
    //   1692: ldc_w 490137319
    //   1695: ixor
    //   1696: ixor
    //   1697: lookupswitch default -> 7822, -1311385755 -> 1724, -331489771 -> 1680
    //   1724: goto -> 1728
    //   1727: athrow
    //   1728: invokevirtual toCharArray : ()[C
    //   1731: goto -> 1735
    //   1734: athrow
    //   1735: getstatic Perryc.0 : I
    //   1738: ifle -> 1752
    //   1741: ldc2_w 790788784
    //   1744: l2i
    //   1745: ldc_w 923082558
    //   1748: ixor
    //   1749: goto -> 1760
    //   1752: ldc2_w 2018682443
    //   1755: l2i
    //   1756: ldc_w -1486945002
    //   1759: ixor
    //   1760: ldc2_w 942500529
    //   1763: l2i
    //   1764: ldc_w 672699078
    //   1767: ixor
    //   1768: ixor
    //   1769: lookupswitch default -> 7768, -818390230 -> 1796, 135437817 -> 1752
    //   1796: astore #4
    //   1798: getstatic Perryc.1 : I
    //   1801: ifeq -> 1815
    //   1804: ldc2_w 2013990925
    //   1807: l2i
    //   1808: ldc_w 804862790
    //   1811: ixor
    //   1812: goto -> 1823
    //   1815: ldc2_w 1168832577
    //   1818: l2i
    //   1819: ldc_w 747535278
    //   1822: ixor
    //   1823: ldc2_w 2139551371
    //   1826: l2i
    //   1827: ldc_w -1961398227
    //   1830: ixor
    //   1831: ixor
    //   1832: lookupswitch default -> 7898, -1649081015 -> 1860, -1553748499 -> 1815
    //   1860: aload #4
    //   1862: arraylength
    //   1863: getstatic Perryc.0 : I
    //   1866: ifle -> 1880
    //   1869: ldc2_w 872793759
    //   1872: l2i
    //   1873: ldc_w -147985964
    //   1876: ixor
    //   1877: goto -> 1888
    //   1880: ldc2_w -1491126238
    //   1883: l2i
    //   1884: ldc_w 315126834
    //   1887: ixor
    //   1888: ldc2_w -747884294
    //   1891: l2i
    //   1892: ldc_w 1437242533
    //   1895: ixor
    //   1896: ixor
    //   1897: lookupswitch default -> 1924, -712127644 -> 1880, 1173261076 -> 7804
    //   1924: istore #5
    //   1926: ldc2_w -278701407
    //   1929: l2i
    //   1930: ldc_w -278701407
    //   1933: ixor
    //   1934: getstatic Perryc.1 : I
    //   1937: ifeq -> 1951
    //   1940: ldc2_w -1212231373
    //   1943: l2i
    //   1944: ldc_w -442355982
    //   1947: ixor
    //   1948: goto -> 1959
    //   1951: ldc2_w 131342033
    //   1954: l2i
    //   1955: ldc_w 244515444
    //   1958: ixor
    //   1959: ldc2_w -1799873786
    //   1962: l2i
    //   1963: ldc_w -128897378
    //   1966: ixor
    //   1967: ixor
    //   1968: lookupswitch default -> 7760, 1056295513 -> 1951, 1705912637 -> 1996
    //   1996: istore #6
    //   1998: getstatic Perryc.0 : I
    //   2001: ifle -> 2015
    //   2004: ldc2_w 827346947
    //   2007: l2i
    //   2008: ldc_w 219409006
    //   2011: ixor
    //   2012: goto -> 2023
    //   2015: ldc2_w -254258736
    //   2018: l2i
    //   2019: ldc_w 1367107826
    //   2022: ixor
    //   2023: ldc2_w -1475281880
    //   2026: l2i
    //   2027: ldc_w -520225160
    //   2030: ixor
    //   2031: ixor
    //   2032: lookupswitch default -> 7744, -381076622 -> 2060, 1957607485 -> 2015
    //   2060: iload #6
    //   2062: getstatic Perryc.1 : I
    //   2065: ifeq -> 2079
    //   2068: ldc2_w 1878772385
    //   2071: l2i
    //   2072: ldc_w 333427292
    //   2075: ixor
    //   2076: goto -> 2087
    //   2079: ldc2_w 1659599667
    //   2082: l2i
    //   2083: ldc_w -1109019789
    //   2086: ixor
    //   2087: ldc2_w 2117570619
    //   2090: l2i
    //   2091: ldc_w 1029942762
    //   2094: ixor
    //   2095: ixor
    //   2096: lookupswitch default -> 2124, -17042686 -> 2079, 1064322348 -> 7784
    //   2124: iload #5
    //   2126: if_icmpge -> 2140
    //   2129: ldc2_w -831749540
    //   2132: l2i
    //   2133: ldc_w 1120483078
    //   2136: ixor
    //   2137: goto -> 2148
    //   2140: ldc2_w -1100024458
    //   2143: l2i
    //   2144: ldc_w 852181027
    //   2147: ixor
    //   2148: ldc2_w 521234653
    //   2151: l2i
    //   2152: ldc_w 113991568
    //   2155: ixor
    //   2156: ixor
    //   2157: tableswitch default -> 2129, -1786805737 -> 2180, -1786805736 -> 2695
    //   2180: getstatic Perryc.1 : I
    //   2183: ifeq -> 2197
    //   2186: ldc2_w -1812505292
    //   2189: l2i
    //   2190: ldc_w 2082062793
    //   2193: ixor
    //   2194: goto -> 2205
    //   2197: ldc2_w -1529425989
    //   2200: l2i
    //   2201: ldc_w 2095650819
    //   2204: ixor
    //   2205: ldc2_w 2133329654
    //   2208: l2i
    //   2209: ldc_w -1324136963
    //   2212: ixor
    //   2213: ixor
    //   2214: lookupswitch default -> 2240, -2038519612 -> 2197, 567664630 -> 7882
    //   2240: aload #4
    //   2242: getstatic Perryc.1 : I
    //   2245: ifeq -> 2259
    //   2248: ldc2_w -1199197358
    //   2251: l2i
    //   2252: ldc_w -574564229
    //   2255: ixor
    //   2256: goto -> 2267
    //   2259: ldc2_w 686564821
    //   2262: l2i
    //   2263: ldc_w -1252948922
    //   2266: ixor
    //   2267: ldc2_w 1626087815
    //   2270: l2i
    //   2271: ldc_w -228900740
    //   2274: ixor
    //   2275: ixor
    //   2276: lookupswitch default -> 2304, -135132462 -> 7736, 802173300 -> 2259
    //   2304: iload #6
    //   2306: caload
    //   2307: getstatic Perryc.c : I
    //   2310: iflt -> 2324
    //   2313: ldc2_w -212361586
    //   2316: l2i
    //   2317: ldc_w 1461617539
    //   2320: ixor
    //   2321: goto -> 2332
    //   2324: ldc2_w 2048518588
    //   2327: l2i
    //   2328: ldc_w -831134513
    //   2331: ixor
    //   2332: ldc2_w 121937228
    //   2335: l2i
    //   2336: ldc_w 2101400610
    //   2339: ixor
    //   2340: ixor
    //   2341: lookupswitch default -> 7778, -832027619 -> 2368, -565357469 -> 2324
    //   2368: istore #7
    //   2370: getstatic Perryc.c : I
    //   2373: iflt -> 2387
    //   2376: ldc2_w -335820231
    //   2379: l2i
    //   2380: ldc_w -754452321
    //   2383: ixor
    //   2384: goto -> 2395
    //   2387: ldc2_w 786761888
    //   2390: l2i
    //   2391: ldc_w 1101792971
    //   2394: ixor
    //   2395: ldc2_w 181639
    //   2398: l2i
    //   2399: ldc_w 485364526
    //   2402: ixor
    //   2403: ixor
    //   2404: lookupswitch default -> 7868, 605086735 -> 2387, 1940248770 -> 2432
    //   2432: iload_3
    //   2433: getstatic Perryc.c : I
    //   2436: iflt -> 2450
    //   2439: ldc2_w -1231063500
    //   2442: l2i
    //   2443: ldc_w -772029794
    //   2446: ixor
    //   2447: goto -> 2458
    //   2450: ldc2_w -1335343573
    //   2453: l2i
    //   2454: ldc_w -1638644577
    //   2457: ixor
    //   2458: ldc2_w -1014220120
    //   2461: l2i
    //   2462: ldc_w -733853144
    //   2465: ixor
    //   2466: ixor
    //   2467: lookupswitch default -> 7928, 972190260 -> 2492, 1890239530 -> 2450
    //   2492: iload #7
    //   2494: iadd
    //   2495: getstatic Perryc.0 : I
    //   2498: ifle -> 2512
    //   2501: ldc2_w -599973726
    //   2504: l2i
    //   2505: ldc_w -642841963
    //   2508: ixor
    //   2509: goto -> 2520
    //   2512: ldc2_w 809339823
    //   2515: l2i
    //   2516: ldc_w 1081951699
    //   2519: ixor
    //   2520: ldc2_w -669872063
    //   2523: l2i
    //   2524: ldc_w -1368892884
    //   2527: ixor
    //   2528: ixor
    //   2529: lookupswitch default -> 7906, 104465425 -> 2556, 1944643674 -> 2512
    //   2556: istore_3
    //   2557: getstatic Perryc.1 : I
    //   2560: ifeq -> 2574
    //   2563: ldc2_w 757844314
    //   2566: l2i
    //   2567: ldc_w 1749880302
    //   2570: ixor
    //   2571: goto -> 2582
    //   2574: ldc2_w -1197621992
    //   2577: l2i
    //   2578: ldc_w -534814731
    //   2581: ixor
    //   2582: ldc2_w -1674747201
    //   2585: l2i
    //   2586: ldc_w -402248532
    //   2589: ixor
    //   2590: ixor
    //   2591: lookupswitch default -> 2616, 358499405 -> 2574, 827165351 -> 7886
    //   2616: iload_3
    //   2617: ldc2_w -224332356
    //   2620: l2i
    //   2621: ldc_w -224332362
    //   2624: ixor
    //   2625: imul
    //   2626: getstatic Perryc.0 : I
    //   2629: ifle -> 2643
    //   2632: ldc2_w 1802878556
    //   2635: l2i
    //   2636: ldc_w -1611844683
    //   2639: ixor
    //   2640: goto -> 2651
    //   2643: ldc2_w -341975676
    //   2646: l2i
    //   2647: ldc_w 1013588698
    //   2650: ixor
    //   2651: ldc2_w -1161152434
    //   2654: l2i
    //   2655: ldc_w 1907299017
    //   2658: ixor
    //   2659: ixor
    //   2660: lookupswitch default -> 2688, 177509609 -> 2643, 1073588078 -> 7922
    //   2688: istore_3
    //   2689: iinc #6, 1
    //   2692: goto -> 1998
    //   2695: getstatic Perryc.1 : I
    //   2698: ifeq -> 2712
    //   2701: ldc2_w -1692981321
    //   2704: l2i
    //   2705: ldc_w 1542427702
    //   2708: ixor
    //   2709: goto -> 2720
    //   2712: ldc2_w 1905899160
    //   2715: l2i
    //   2716: ldc_w 959267010
    //   2719: ixor
    //   2720: ldc2_w 329438041
    //   2723: l2i
    //   2724: ldc_w -957158236
    //   2727: ixor
    //   2728: ixor
    //   2729: lookupswitch default -> 7858, -1645950553 -> 2756, 363367548 -> 2712
    //   2756: getstatic bigname/zprestige/webhack/features/modules/Client/Notify.mc : Lnet/minecraft/client/Minecraft;
    //   2759: getstatic Perryc.0 : I
    //   2762: ifle -> 2776
    //   2765: ldc2_w 566657715
    //   2768: l2i
    //   2769: ldc_w 224752530
    //   2772: ixor
    //   2773: goto -> 2784
    //   2776: ldc2_w -1794966910
    //   2779: l2i
    //   2780: ldc_w 37336316
    //   2783: ixor
    //   2784: ldc2_w 1186850093
    //   2787: l2i
    //   2788: ldc_w 1549689448
    //   2791: ixor
    //   2792: ixor
    //   2793: lookupswitch default -> 7766, -1915172549 -> 2820, 910194276 -> 2776
    //   2820: getfield field_71456_v : Lnet/minecraft/client/gui/GuiIngame;
    //   2823: getstatic Perryc.c : I
    //   2826: iflt -> 2840
    //   2829: ldc2_w 1513621470
    //   2832: l2i
    //   2833: ldc_w 683235080
    //   2836: ixor
    //   2837: goto -> 2848
    //   2840: ldc2_w -1975703631
    //   2843: l2i
    //   2844: ldc_w 697950997
    //   2847: ixor
    //   2848: ldc2_w 1407362072
    //   2851: l2i
    //   2852: ldc_w -1327709330
    //   2855: ixor
    //   2856: ixor
    //   2857: lookupswitch default -> 7762, -1849739360 -> 2840, 1083876306 -> 2884
    //   2884: goto -> 2888
    //   2887: athrow
    //   2888: invokevirtual func_146158_b : ()Lnet/minecraft/client/gui/GuiNewChat;
    //   2891: goto -> 2895
    //   2894: athrow
    //   2895: new net/minecraft/util/text/TextComponentString
    //   2898: dup
    //   2899: new java/lang/StringBuilder
    //   2902: dup
    //   2903: getstatic Perryc.0 : I
    //   2906: ifle -> 2920
    //   2909: ldc2_w 469807552
    //   2912: l2i
    //   2913: ldc_w 570259756
    //   2916: ixor
    //   2917: goto -> 2928
    //   2920: ldc2_w 746010689
    //   2923: l2i
    //   2924: ldc_w 897197177
    //   2927: ixor
    //   2928: ldc2_w 1855723661
    //   2931: l2i
    //   2932: ldc_w -31292021
    //   2935: ixor
    //   2936: ixor
    //   2937: lookupswitch default -> 7726, -1984724674 -> 2964, -1388096022 -> 2920
    //   2964: goto -> 2968
    //   2967: athrow
    //   2968: invokespecial <init> : ()V
    //   2971: goto -> 2975
    //   2974: athrow
    //   2975: getstatic Perryc.c : I
    //   2978: iflt -> 2992
    //   2981: ldc2_w 1763364087
    //   2984: l2i
    //   2985: ldc_w 829419108
    //   2988: ixor
    //   2989: goto -> 3000
    //   2992: ldc2_w -1243435816
    //   2995: l2i
    //   2996: ldc_w -169953693
    //   2999: ixor
    //   3000: ldc2_w -833120256
    //   3003: l2i
    //   3004: ldc_w 979682027
    //   3007: ixor
    //   3008: ixor
    //   3009: lookupswitch default -> 3036, -1404667784 -> 7734, 459006199 -> 2992
    //   3036: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   3039: getstatic Perryc.0 : I
    //   3042: ifle -> 3056
    //   3045: ldc2_w 2069909628
    //   3048: l2i
    //   3049: ldc_w 556127986
    //   3052: ixor
    //   3053: goto -> 3064
    //   3056: ldc2_w -757706917
    //   3059: l2i
    //   3060: ldc_w 600488183
    //   3063: ixor
    //   3064: ldc2_w -553406340
    //   3067: l2i
    //   3068: ldc_w -1457492395
    //   3071: ixor
    //   3072: ixor
    //   3073: lookupswitch default -> 3100, 744904871 -> 7728, 967795280 -> 3056
    //   3100: goto -> 3104
    //   3103: athrow
    //   3104: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3107: goto -> 3111
    //   3110: athrow
    //   3111: getstatic Perryc.0 : I
    //   3114: ifle -> 3128
    //   3117: ldc2_w 1850784740
    //   3120: l2i
    //   3121: ldc_w 1614032544
    //   3124: ixor
    //   3125: goto -> 3136
    //   3128: ldc2_w 8370616
    //   3131: l2i
    //   3132: ldc_w -1295141905
    //   3135: ixor
    //   3136: ldc2_w -1404095096
    //   3139: l2i
    //   3140: ldc_w 1742780228
    //   3143: ixor
    //   3144: ixor
    //   3145: lookupswitch default -> 3172, -976545912 -> 7856, 2026041797 -> 3128
    //   3172: aload_1
    //   3173: getstatic Perryc.1 : I
    //   3176: ifeq -> 3190
    //   3179: ldc2_w -46874220
    //   3182: l2i
    //   3183: ldc_w 2089590242
    //   3186: ixor
    //   3187: goto -> 3198
    //   3190: ldc2_w -152598866
    //   3193: l2i
    //   3194: ldc_w 102759124
    //   3197: ixor
    //   3198: ldc2_w 1111933919
    //   3201: l2i
    //   3202: ldc_w 1642840457
    //   3205: ixor
    //   3206: ixor
    //   3207: lookupswitch default -> 3232, -1575657952 -> 7836, -1170691498 -> 3190
    //   3232: goto -> 3236
    //   3235: athrow
    //   3236: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   3239: goto -> 3243
    //   3242: athrow
    //   3243: getstatic Perryc.c : I
    //   3246: iflt -> 3260
    //   3249: ldc2_w 258370741
    //   3252: l2i
    //   3253: ldc_w -1377017367
    //   3256: ixor
    //   3257: goto -> 3268
    //   3260: ldc2_w -1629808733
    //   3263: l2i
    //   3264: ldc_w 807717110
    //   3267: ixor
    //   3268: ldc2_w 1999411067
    //   3271: l2i
    //   3272: ldc_w -298385163
    //   3275: ixor
    //   3276: ixor
    //   3277: lookupswitch default -> 3304, 973636746 -> 3260, 999398098 -> 7908
    //   3304: goto -> 3308
    //   3307: athrow
    //   3308: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3311: goto -> 3315
    //   3314: athrow
    //   3315: ldc_w 'ӧ㌗ӄ堕൥๸礌冚뱮੧쥯ᓉ핹駒辖?싎ဉ'
    //   3318: getstatic Perryc.1 : I
    //   3321: ifeq -> 3335
    //   3324: ldc2_w -1591373456
    //   3327: l2i
    //   3328: ldc_w 1200905488
    //   3331: ixor
    //   3332: goto -> 3343
    //   3335: ldc2_w 2009644406
    //   3338: l2i
    //   3339: ldc_w -1845722000
    //   3342: ixor
    //   3343: ldc2_w 2074452405
    //   3346: l2i
    //   3347: ldc_w -1571625299
    //   3350: ixor
    //   3351: ixor
    //   3352: lookupswitch default -> 7754, 1061587832 -> 3335, 1069776414 -> 3380
    //   3380: goto -> 3384
    //   3383: athrow
    //   3384: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   3387: goto -> 3391
    //   3390: athrow
    //   3391: getstatic Perryc.0 : I
    //   3394: ifle -> 3408
    //   3397: ldc2_w -1168701708
    //   3400: l2i
    //   3401: ldc_w -1310559473
    //   3404: ixor
    //   3405: goto -> 3416
    //   3408: ldc2_w 994101273
    //   3411: l2i
    //   3412: ldc_w -881586625
    //   3415: ixor
    //   3416: ldc2_w 412689203
    //   3419: l2i
    //   3420: ldc_w -2089388046
    //   3423: ixor
    //   3424: ixor
    //   3425: lookupswitch default -> 3452, -1873141446 -> 7752, 739511396 -> 3408
    //   3452: goto -> 3456
    //   3455: athrow
    //   3456: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3459: goto -> 3463
    //   3462: athrow
    //   3463: getstatic Perryc.0 : I
    //   3466: ifle -> 3480
    //   3469: ldc2_w 891981825
    //   3472: l2i
    //   3473: ldc_w -147477418
    //   3476: ixor
    //   3477: goto -> 3488
    //   3480: ldc2_w -1899245623
    //   3483: l2i
    //   3484: ldc_w 553078331
    //   3487: ixor
    //   3488: ldc2_w 828091471
    //   3491: l2i
    //   3492: ldc_w -937741602
    //   3495: ixor
    //   3496: ixor
    //   3497: lookupswitch default -> 3524, 431990391 -> 3480, 996123334 -> 7904
    //   3524: getstatic com/mojang/realmsclient/gui/ChatFormatting.GREEN : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   3527: getstatic Perryc.c : I
    //   3530: iflt -> 3544
    //   3533: ldc2_w 1373983406
    //   3536: l2i
    //   3537: ldc_w 1885910940
    //   3540: ixor
    //   3541: goto -> 3552
    //   3544: ldc2_w -1974939762
    //   3547: l2i
    //   3548: ldc_w -1010643857
    //   3551: ixor
    //   3552: ldc2_w 1005507666
    //   3555: l2i
    //   3556: ldc_w -1302782045
    //   3559: ixor
    //   3560: ixor
    //   3561: lookupswitch default -> 3588, -1472581949 -> 7878, 1586913882 -> 3544
    //   3588: goto -> 3592
    //   3591: athrow
    //   3592: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3595: goto -> 3599
    //   3598: athrow
    //   3599: getstatic Perryc.1 : I
    //   3602: ifeq -> 3616
    //   3605: ldc2_w 82915888
    //   3608: l2i
    //   3609: ldc_w -862306105
    //   3612: ixor
    //   3613: goto -> 3624
    //   3616: ldc2_w -773218534
    //   3619: l2i
    //   3620: ldc_w 65258294
    //   3623: ixor
    //   3624: ldc2_w 146330494
    //   3627: l2i
    //   3628: ldc_w 64165995
    //   3631: ixor
    //   3632: ixor
    //   3633: lookupswitch default -> 7790, -1023362590 -> 3616, -647915719 -> 3660
    //   3660: getstatic com/mojang/realmsclient/gui/ChatFormatting.BOLD : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   3663: getstatic Perryc.c : I
    //   3666: iflt -> 3680
    //   3669: ldc2_w 372438767
    //   3672: l2i
    //   3673: ldc_w -930450201
    //   3676: ixor
    //   3677: goto -> 3688
    //   3680: ldc2_w -2124922052
    //   3683: l2i
    //   3684: ldc_w 2022126399
    //   3687: ixor
    //   3688: ldc2_w -2082558868
    //   3691: l2i
    //   3692: ldc_w 105880728
    //   3695: ixor
    //   3696: ixor
    //   3697: lookupswitch default -> 3724, 806821631 -> 3680, 1529459452 -> 7740
    //   3724: goto -> 3728
    //   3727: athrow
    //   3728: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3731: goto -> 3735
    //   3734: athrow
    //   3735: getstatic Perryc.0 : I
    //   3738: ifle -> 3752
    //   3741: ldc2_w -556972575
    //   3744: l2i
    //   3745: ldc_w 1664203426
    //   3748: ixor
    //   3749: goto -> 3760
    //   3752: ldc2_w 402351914
    //   3755: l2i
    //   3756: ldc_w -520570319
    //   3759: ixor
    //   3760: ldc2_w -1898930395
    //   3763: l2i
    //   3764: ldc_w 1085820591
    //   3767: ixor
    //   3768: ixor
    //   3769: lookupswitch default -> 7812, 963316881 -> 3796, 1939091145 -> 3752
    //   3796: iload_2
    //   3797: getstatic Perryc.c : I
    //   3800: iflt -> 3814
    //   3803: ldc2_w 1269846366
    //   3806: l2i
    //   3807: ldc_w 1044383401
    //   3810: ixor
    //   3811: goto -> 3822
    //   3814: ldc2_w 808345405
    //   3817: l2i
    //   3818: ldc_w 704510853
    //   3821: ixor
    //   3822: ldc2_w -574543763
    //   3825: l2i
    //   3826: ldc_w 1090931752
    //   3829: ixor
    //   3830: ixor
    //   3831: lookupswitch default -> 3856, -1094751043 -> 3814, -382258254 -> 7770
    //   3856: goto -> 3860
    //   3859: athrow
    //   3860: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   3863: goto -> 3867
    //   3866: athrow
    //   3867: getstatic Perryc.0 : I
    //   3870: ifle -> 3884
    //   3873: ldc2_w -163151211
    //   3876: l2i
    //   3877: ldc_w -1000276021
    //   3880: ixor
    //   3881: goto -> 3892
    //   3884: ldc2_w 472445517
    //   3887: l2i
    //   3888: ldc_w -2092865784
    //   3891: ixor
    //   3892: ldc2_w 1361775188
    //   3895: l2i
    //   3896: ldc_w 778162849
    //   3899: ixor
    //   3900: ixor
    //   3901: lookupswitch default -> 3928, 160599324 -> 3884, 1298965931 -> 7838
    //   3928: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   3931: getstatic Perryc.c : I
    //   3934: iflt -> 3948
    //   3937: ldc2_w -409981801
    //   3940: l2i
    //   3941: ldc_w -708183484
    //   3944: ixor
    //   3945: goto -> 3956
    //   3948: ldc2_w 1915415394
    //   3951: l2i
    //   3952: ldc_w 568814333
    //   3955: ixor
    //   3956: ldc2_w 1354670578
    //   3959: l2i
    //   3960: ldc_w 324316648
    //   3963: ixor
    //   3964: ixor
    //   3965: lookupswitch default -> 7720, 271027589 -> 3992, 1907612361 -> 3948
    //   3992: goto -> 3996
    //   3995: athrow
    //   3996: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   3999: goto -> 4003
    //   4002: athrow
    //   4003: ldc_w 'ӧ㌧ӂ堄൤ุ'
    //   4006: getstatic Perryc.1 : I
    //   4009: ifeq -> 4023
    //   4012: ldc2_w -1445100143
    //   4015: l2i
    //   4016: ldc_w -1506552564
    //   4019: ixor
    //   4020: goto -> 4031
    //   4023: ldc2_w -1332341849
    //   4026: l2i
    //   4027: ldc_w 1189831863
    //   4030: ixor
    //   4031: ldc2_w 1249877088
    //   4034: l2i
    //   4035: ldc_w 569736509
    //   4038: ixor
    //   4039: ixor
    //   4040: lookupswitch default -> 4068, 1528517787 -> 4023, 1684320704 -> 7888
    //   4068: goto -> 4072
    //   4071: athrow
    //   4072: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4075: goto -> 4079
    //   4078: athrow
    //   4079: getstatic Perryc.1 : I
    //   4082: ifeq -> 4096
    //   4085: ldc2_w 2027726752
    //   4088: l2i
    //   4089: ldc_w -1414070299
    //   4092: ixor
    //   4093: goto -> 4104
    //   4096: ldc2_w -1343571984
    //   4099: l2i
    //   4100: ldc_w -1006116153
    //   4103: ixor
    //   4104: ldc2_w 902538895
    //   4107: l2i
    //   4108: ldc_w 509353384
    //   4111: ixor
    //   4112: ixor
    //   4113: lookupswitch default -> 7916, -117578910 -> 4096, 1081798160 -> 4140
    //   4140: goto -> 4144
    //   4143: athrow
    //   4144: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4147: goto -> 4151
    //   4150: athrow
    //   4151: getstatic Perryc.c : I
    //   4154: iflt -> 4168
    //   4157: ldc2_w -1495483556
    //   4160: l2i
    //   4161: ldc_w 1652273031
    //   4164: ixor
    //   4165: goto -> 4176
    //   4168: ldc2_w -583183867
    //   4171: l2i
    //   4172: ldc_w 1727535458
    //   4175: ixor
    //   4176: ldc2_w -1753653210
    //   4179: l2i
    //   4180: ldc_w -26235927
    //   4183: ixor
    //   4184: ixor
    //   4185: lookupswitch default -> 4212, -1380851948 -> 7764, 1061849941 -> 4168
    //   4212: goto -> 4216
    //   4215: athrow
    //   4216: invokevirtual toString : ()Ljava/lang/String;
    //   4219: goto -> 4223
    //   4222: athrow
    //   4223: getstatic Perryc.0 : I
    //   4226: ifle -> 4240
    //   4229: ldc2_w -1501139718
    //   4232: l2i
    //   4233: ldc_w -1990781077
    //   4236: ixor
    //   4237: goto -> 4248
    //   4240: ldc2_w -671554153
    //   4243: l2i
    //   4244: ldc_w -950331870
    //   4247: ixor
    //   4248: ldc2_w -238414925
    //   4251: l2i
    //   4252: ldc_w 201260698
    //   4255: ixor
    //   4256: ixor
    //   4257: lookupswitch default -> 4284, -706373960 -> 7844, 89011819 -> 4240
    //   4284: goto -> 4288
    //   4287: athrow
    //   4288: invokespecial <init> : (Ljava/lang/String;)V
    //   4291: goto -> 4295
    //   4294: athrow
    //   4295: getstatic Perryc.1 : I
    //   4298: ifeq -> 4312
    //   4301: ldc2_w 471315650
    //   4304: l2i
    //   4305: ldc_w -320456903
    //   4308: ixor
    //   4309: goto -> 4320
    //   4312: ldc2_w 280237185
    //   4315: l2i
    //   4316: ldc_w 264936062
    //   4319: ixor
    //   4320: ldc2_w -14656261
    //   4323: l2i
    //   4324: ldc_w 827333500
    //   4327: ixor
    //   4328: ixor
    //   4329: lookupswitch default -> 7722, -787560072 -> 4356, 1048691836 -> 4312
    //   4356: iload_3
    //   4357: getstatic Perryc.1 : I
    //   4360: ifeq -> 4374
    //   4363: ldc2_w -596540493
    //   4366: l2i
    //   4367: ldc_w 7533675
    //   4370: ixor
    //   4371: goto -> 4382
    //   4374: ldc2_w -55217604
    //   4377: l2i
    //   4378: ldc_w 2044115913
    //   4381: ixor
    //   4382: ldc2_w 633326803
    //   4385: l2i
    //   4386: ldc_w 33904310
    //   4389: ixor
    //   4390: ixor
    //   4391: lookupswitch default -> 7816, -1562815600 -> 4416, -71701059 -> 4374
    //   4416: goto -> 4420
    //   4419: athrow
    //   4420: invokevirtual func_146234_a : (Lnet/minecraft/util/text/ITextComponent;I)V
    //   4423: goto -> 4427
    //   4426: athrow
    //   4427: goto -> 7719
    //   4430: getstatic Perryc.c : I
    //   4433: iflt -> 4447
    //   4436: ldc2_w -1886784779
    //   4439: l2i
    //   4440: ldc_w -370823378
    //   4443: ixor
    //   4444: goto -> 4455
    //   4447: ldc2_w -532806168
    //   4450: l2i
    //   4451: ldc_w -637437272
    //   4454: ixor
    //   4455: ldc2_w -1756982199
    //   4458: l2i
    //   4459: ldc_w 1334964545
    //   4462: ixor
    //   4463: ixor
    //   4464: lookupswitch default -> 4492, -1095026477 -> 7918, 1366682140 -> 4447
    //   4492: aload_0
    //   4493: getstatic Perryc.c : I
    //   4496: iflt -> 4510
    //   4499: ldc2_w -1219132985
    //   4502: l2i
    //   4503: ldc_w -19445890
    //   4506: ixor
    //   4507: goto -> 4518
    //   4510: ldc2_w -1805764798
    //   4513: l2i
    //   4514: ldc_w 1784951443
    //   4517: ixor
    //   4518: ldc2_w -1938375783
    //   4521: l2i
    //   4522: ldc_w -1792061692
    //   4525: ixor
    //   4526: ixor
    //   4527: lookupswitch default -> 7872, -412880564 -> 4552, 1356542500 -> 4510
    //   4552: getfield popCounter : Lbigname/zprestige/webhack/features/setting/Setting;
    //   4555: getstatic Perryc.c : I
    //   4558: iflt -> 4572
    //   4561: ldc2_w 452364764
    //   4564: l2i
    //   4565: ldc_w -1691093167
    //   4568: ixor
    //   4569: goto -> 4580
    //   4572: ldc2_w 1668463270
    //   4575: l2i
    //   4576: ldc_w 2087759631
    //   4579: ixor
    //   4580: ldc2_w -1815788529
    //   4583: l2i
    //   4584: ldc_w -2088438655
    //   4587: ixor
    //   4588: ixor
    //   4589: lookupswitch default -> 4616, -1902138830 -> 4572, -1853567485 -> 7730
    //   4616: goto -> 4620
    //   4619: athrow
    //   4620: invokevirtual getValue : ()Ljava/lang/Object;
    //   4623: goto -> 4627
    //   4626: athrow
    //   4627: checkcast java/lang/Boolean
    //   4630: getstatic Perryc.0 : I
    //   4633: ifle -> 4647
    //   4636: ldc2_w 1469771659
    //   4639: l2i
    //   4640: ldc_w 1034902779
    //   4643: ixor
    //   4644: goto -> 4655
    //   4647: ldc2_w 5660909
    //   4650: l2i
    //   4651: ldc_w -1793798619
    //   4654: ixor
    //   4655: ldc2_w -773363523
    //   4658: l2i
    //   4659: ldc_w 985827808
    //   4662: ixor
    //   4663: ixor
    //   4664: lookupswitch default -> 7794, -2129636819 -> 4647, 2120699797 -> 4692
    //   4692: goto -> 4696
    //   4695: athrow
    //   4696: invokevirtual booleanValue : ()Z
    //   4699: goto -> 4703
    //   4702: athrow
    //   4703: ifeq -> 4717
    //   4706: ldc2_w -1173304754
    //   4709: l2i
    //   4710: ldc_w 863244174
    //   4713: ixor
    //   4714: goto -> 4725
    //   4717: ldc2_w 1661053085
    //   4720: l2i
    //   4721: ldc_w -362451620
    //   4724: ixor
    //   4725: ldc2_w -1677396841
    //   4728: l2i
    //   4729: ldc_w 1502207723
    //   4732: ixor
    //   4733: ixor
    //   4734: tableswitch default -> 4706, 1290399676 -> 4756, 1290399677 -> 7719
    //   4756: ldc2_w -1109081245
    //   4759: l2i
    //   4760: ldc_w -1109081245
    //   4763: ixor
    //   4764: getstatic Perryc.c : I
    //   4767: iflt -> 4781
    //   4770: ldc2_w -492012866
    //   4773: l2i
    //   4774: ldc_w -2024831781
    //   4777: ixor
    //   4778: goto -> 4789
    //   4781: ldc2_w -1245508677
    //   4784: l2i
    //   4785: ldc_w -592919860
    //   4788: ixor
    //   4789: ldc2_w 66768050
    //   4792: l2i
    //   4793: ldc_w -1763008167
    //   4796: ixor
    //   4797: ixor
    //   4798: lookupswitch default -> 4824, -600122260 -> 4781, -252472434 -> 7852
    //   4824: istore_3
    //   4825: getstatic Perryc.0 : I
    //   4828: ifle -> 4842
    //   4831: ldc2_w 683407129
    //   4834: l2i
    //   4835: ldc_w 1338457660
    //   4838: ixor
    //   4839: goto -> 4850
    //   4842: ldc2_w -1760348
    //   4845: l2i
    //   4846: ldc_w 1184203096
    //   4849: ixor
    //   4850: ldc2_w -1970125721
    //   4853: l2i
    //   4854: ldc_w 479574052
    //   4857: ixor
    //   4858: ixor
    //   4859: lookupswitch default -> 4884, -1637566771 -> 4842, -243583642 -> 7900
    //   4884: aload_1
    //   4885: getstatic Perryc.c : I
    //   4888: iflt -> 4902
    //   4891: ldc2_w -214832214
    //   4894: l2i
    //   4895: ldc_w 1041114589
    //   4898: ixor
    //   4899: goto -> 4910
    //   4902: ldc2_w 1486745923
    //   4905: l2i
    //   4906: ldc_w -1653570845
    //   4909: ixor
    //   4910: ldc2_w -1343341511
    //   4913: l2i
    //   4914: ldc_w 1810358130
    //   4917: ixor
    //   4918: ixor
    //   4919: lookupswitch default -> 4944, -931643175 -> 4902, 154545468 -> 7870
    //   4944: goto -> 4948
    //   4947: athrow
    //   4948: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   4951: goto -> 4955
    //   4954: athrow
    //   4955: getstatic Perryc.1 : I
    //   4958: ifeq -> 4972
    //   4961: ldc2_w 1817783521
    //   4964: l2i
    //   4965: ldc_w 1676786301
    //   4968: ixor
    //   4969: goto -> 4980
    //   4972: ldc2_w 1973737385
    //   4975: l2i
    //   4976: ldc_w -35178727
    //   4979: ixor
    //   4980: ldc2_w 2076980753
    //   4983: l2i
    //   4984: ldc_w 1799679581
    //   4987: ixor
    //   4988: ixor
    //   4989: lookupswitch default -> 7930, -1731512068 -> 5016, 522211024 -> 4972
    //   5016: goto -> 5020
    //   5019: athrow
    //   5020: invokevirtual toCharArray : ()[C
    //   5023: goto -> 5027
    //   5026: athrow
    //   5027: getstatic Perryc.1 : I
    //   5030: ifeq -> 5044
    //   5033: ldc2_w 1559698575
    //   5036: l2i
    //   5037: ldc_w -1658930362
    //   5040: ixor
    //   5041: goto -> 5052
    //   5044: ldc2_w -1182049568
    //   5047: l2i
    //   5048: ldc_w -1786570313
    //   5051: ixor
    //   5052: ldc2_w -230655216
    //   5055: l2i
    //   5056: ldc_w -2138727389
    //   5059: ixor
    //   5060: ixor
    //   5061: lookupswitch default -> 7892, -1288945414 -> 5044, 1590535268 -> 5088
    //   5088: astore #4
    //   5090: getstatic Perryc.1 : I
    //   5093: ifeq -> 5107
    //   5096: ldc2_w -1882607411
    //   5099: l2i
    //   5100: ldc_w -131103613
    //   5103: ixor
    //   5104: goto -> 5115
    //   5107: ldc2_w -959961830
    //   5110: l2i
    //   5111: ldc_w 1114656459
    //   5114: ixor
    //   5115: ldc2_w -770810475
    //   5118: l2i
    //   5119: ldc_w 1458945091
    //   5122: ixor
    //   5123: ixor
    //   5124: lookupswitch default -> 5152, -1701260593 -> 5107, -216148584 -> 7902
    //   5152: aload #4
    //   5154: arraylength
    //   5155: getstatic Perryc.0 : I
    //   5158: ifle -> 5172
    //   5161: ldc2_w -396294967
    //   5164: l2i
    //   5165: ldc_w -1927008461
    //   5168: ixor
    //   5169: goto -> 5180
    //   5172: ldc2_w -749775269
    //   5175: l2i
    //   5176: ldc_w -59761725
    //   5179: ixor
    //   5180: ldc2_w -1929578866
    //   5183: l2i
    //   5184: ldc_w 1705473753
    //   5187: ixor
    //   5188: ixor
    //   5189: lookupswitch default -> 5216, -1944147027 -> 7824, -1085438516 -> 5172
    //   5216: istore #5
    //   5218: ldc2_w -6584905
    //   5221: l2i
    //   5222: ldc_w -6584905
    //   5225: ixor
    //   5226: getstatic Perryc.c : I
    //   5229: iflt -> 5243
    //   5232: ldc2_w 1698163092
    //   5235: l2i
    //   5236: ldc_w 1846904408
    //   5239: ixor
    //   5240: goto -> 5251
    //   5243: ldc2_w -407468461
    //   5246: l2i
    //   5247: ldc_w -744458278
    //   5250: ixor
    //   5251: ldc2_w 617044719
    //   5254: l2i
    //   5255: ldc_w -481950089
    //   5258: ixor
    //   5259: ixor
    //   5260: lookupswitch default -> 5288, -861719724 -> 7890, 1234343339 -> 5243
    //   5288: istore #6
    //   5290: getstatic Perryc.1 : I
    //   5293: ifeq -> 5307
    //   5296: ldc2_w -220253047
    //   5299: l2i
    //   5300: ldc_w -63518665
    //   5303: ixor
    //   5304: goto -> 5315
    //   5307: ldc2_w 690584846
    //   5310: l2i
    //   5311: ldc_w 168213483
    //   5314: ixor
    //   5315: ldc2_w -1060565951
    //   5318: l2i
    //   5319: ldc_w 1491569236
    //   5322: ixor
    //   5323: ixor
    //   5324: lookupswitch default -> 5352, -1765311829 -> 7830, 733155278 -> 5307
    //   5352: iload #6
    //   5354: getstatic Perryc.0 : I
    //   5357: ifle -> 5371
    //   5360: ldc2_w -1759966428
    //   5363: l2i
    //   5364: ldc_w 602730347
    //   5367: ixor
    //   5368: goto -> 5379
    //   5371: ldc2_w -2021172149
    //   5374: l2i
    //   5375: ldc_w 1591006177
    //   5378: ixor
    //   5379: ldc2_w -951210562
    //   5382: l2i
    //   5383: ldc_w 953892295
    //   5386: ixor
    //   5387: ixor
    //   5388: lookupswitch default -> 7924, 650452947 -> 5416, 1264809014 -> 5371
    //   5416: iload #5
    //   5418: if_icmpge -> 5432
    //   5421: ldc2_w 824665564
    //   5424: l2i
    //   5425: ldc_w 1319735859
    //   5428: ixor
    //   5429: goto -> 5440
    //   5432: ldc2_w -663031115
    //   5435: l2i
    //   5436: ldc_w -1477180069
    //   5439: ixor
    //   5440: ldc2_w -144217637
    //   5443: l2i
    //   5444: ldc_w -577434634
    //   5447: ixor
    //   5448: ixor
    //   5449: tableswitch default -> 5421, 1434228162 -> 5472, 1434228163 -> 5987
    //   5472: getstatic Perryc.0 : I
    //   5475: ifle -> 5489
    //   5478: ldc2_w -1659548841
    //   5481: l2i
    //   5482: ldc_w 1483972907
    //   5485: ixor
    //   5486: goto -> 5497
    //   5489: ldc2_w -436334696
    //   5492: l2i
    //   5493: ldc_w -1233087433
    //   5496: ixor
    //   5497: ldc2_w 76112437
    //   5500: l2i
    //   5501: ldc_w 2019703582
    //   5504: ixor
    //   5505: ixor
    //   5506: lookupswitch default -> 5532, -1181895849 -> 7846, -526644023 -> 5489
    //   5532: aload #4
    //   5534: getstatic Perryc.c : I
    //   5537: iflt -> 5551
    //   5540: ldc2_w 12225323
    //   5543: l2i
    //   5544: ldc_w 1097822249
    //   5547: ixor
    //   5548: goto -> 5559
    //   5551: ldc2_w 790144056
    //   5554: l2i
    //   5555: ldc_w -892987290
    //   5558: ixor
    //   5559: ldc2_w -328801786
    //   5562: l2i
    //   5563: ldc_w -1861966431
    //   5566: ixor
    //   5567: ixor
    //   5568: lookupswitch default -> 7884, -1732445191 -> 5596, 1018674341 -> 5551
    //   5596: iload #6
    //   5598: caload
    //   5599: getstatic Perryc.0 : I
    //   5602: ifle -> 5616
    //   5605: ldc2_w 792720853
    //   5608: l2i
    //   5609: ldc_w -984486028
    //   5612: ixor
    //   5613: goto -> 5624
    //   5616: ldc2_w 968160642
    //   5619: l2i
    //   5620: ldc_w -873910500
    //   5623: ixor
    //   5624: ldc2_w -1765855116
    //   5627: l2i
    //   5628: ldc_w 481943300
    //   5631: ixor
    //   5632: ixor
    //   5633: lookupswitch default -> 7854, 1617491409 -> 5616, 2019243502 -> 5660
    //   5660: istore #7
    //   5662: getstatic Perryc.c : I
    //   5665: iflt -> 5679
    //   5668: ldc2_w 726324530
    //   5671: l2i
    //   5672: ldc_w 1893810524
    //   5675: ixor
    //   5676: goto -> 5687
    //   5679: ldc2_w 1248124348
    //   5682: l2i
    //   5683: ldc_w 200942636
    //   5686: ixor
    //   5687: ldc2_w -701935977
    //   5690: l2i
    //   5691: ldc_w 407120839
    //   5694: ixor
    //   5695: ixor
    //   5696: lookupswitch default -> 7806, -1879860032 -> 5724, -1782124226 -> 5679
    //   5724: iload_3
    //   5725: getstatic Perryc.c : I
    //   5728: iflt -> 5742
    //   5731: ldc2_w -261371258
    //   5734: l2i
    //   5735: ldc_w -2119576162
    //   5738: ixor
    //   5739: goto -> 5750
    //   5742: ldc2_w -1948886956
    //   5745: l2i
    //   5746: ldc_w 241073061
    //   5749: ixor
    //   5750: ldc2_w 1975646939
    //   5753: l2i
    //   5754: ldc_w 1609279347
    //   5757: ixor
    //   5758: ixor
    //   5759: lookupswitch default -> 7802, -1348305319 -> 5784, 1541948080 -> 5742
    //   5784: iload #7
    //   5786: iadd
    //   5787: getstatic Perryc.c : I
    //   5790: iflt -> 5804
    //   5793: ldc2_w -1100796246
    //   5796: l2i
    //   5797: ldc_w -491542915
    //   5800: ixor
    //   5801: goto -> 5812
    //   5804: ldc2_w 1236943894
    //   5807: l2i
    //   5808: ldc_w -679218072
    //   5811: ixor
    //   5812: ldc2_w 1603114003
    //   5815: l2i
    //   5816: ldc_w -2043234182
    //   5819: ixor
    //   5820: ixor
    //   5821: lookupswitch default -> 5848, -2056543042 -> 7746, 1531497885 -> 5804
    //   5848: istore_3
    //   5849: getstatic Perryc.1 : I
    //   5852: ifeq -> 5866
    //   5855: ldc2_w -383303656
    //   5858: l2i
    //   5859: ldc_w 956904235
    //   5862: ixor
    //   5863: goto -> 5874
    //   5866: ldc2_w -282081098
    //   5869: l2i
    //   5870: ldc_w 369689413
    //   5873: ixor
    //   5874: ldc2_w -1306102779
    //   5877: l2i
    //   5878: ldc_w -1548367648
    //   5881: ixor
    //   5882: ixor
    //   5883: lookupswitch default -> 7772, -1044525098 -> 5866, -390760682 -> 5908
    //   5908: iload_3
    //   5909: ldc2_w -1249328911
    //   5912: l2i
    //   5913: ldc_w -1249328901
    //   5916: ixor
    //   5917: imul
    //   5918: getstatic Perryc.c : I
    //   5921: iflt -> 5935
    //   5924: ldc2_w -1141908505
    //   5927: l2i
    //   5928: ldc_w -1845114467
    //   5931: ixor
    //   5932: goto -> 5943
    //   5935: ldc2_w -1687654914
    //   5938: l2i
    //   5939: ldc_w 2138073602
    //   5942: ixor
    //   5943: ldc2_w 1329960424
    //   5946: l2i
    //   5947: ldc_w -1076121130
    //   5950: ixor
    //   5951: ixor
    //   5952: lookupswitch default -> 5980, -646695356 -> 7820, -515595539 -> 5935
    //   5980: istore_3
    //   5981: iinc #6, 1
    //   5984: goto -> 5290
    //   5987: getstatic Perryc.0 : I
    //   5990: ifle -> 6004
    //   5993: ldc2_w -1617751655
    //   5996: l2i
    //   5997: ldc_w -108409077
    //   6000: ixor
    //   6001: goto -> 6012
    //   6004: ldc2_w 626902115
    //   6007: l2i
    //   6008: ldc_w -964606969
    //   6011: ixor
    //   6012: ldc2_w 511197575
    //   6015: l2i
    //   6016: ldc_w -1827593600
    //   6019: ixor
    //   6020: ixor
    //   6021: lookupswitch default -> 7932, -344736363 -> 6004, 1857413987 -> 6048
    //   6048: getstatic bigname/zprestige/webhack/features/modules/Client/Notify.mc : Lnet/minecraft/client/Minecraft;
    //   6051: getstatic Perryc.0 : I
    //   6054: ifle -> 6068
    //   6057: ldc2_w -1889317900
    //   6060: l2i
    //   6061: ldc_w -1359370892
    //   6064: ixor
    //   6065: goto -> 6076
    //   6068: ldc2_w -1757722385
    //   6071: l2i
    //   6072: ldc_w -441490867
    //   6075: ixor
    //   6076: ldc2_w 203889696
    //   6079: l2i
    //   6080: ldc_w 1244624738
    //   6083: ixor
    //   6084: ixor
    //   6085: lookupswitch default -> 7750, 882655712 -> 6112, 1737655746 -> 6068
    //   6112: getfield field_71456_v : Lnet/minecraft/client/gui/GuiIngame;
    //   6115: getstatic Perryc.c : I
    //   6118: iflt -> 6132
    //   6121: ldc2_w 1161647496
    //   6124: l2i
    //   6125: ldc_w 429740220
    //   6128: ixor
    //   6129: goto -> 6140
    //   6132: ldc2_w 848422439
    //   6135: l2i
    //   6136: ldc_w -1481684758
    //   6139: ixor
    //   6140: ldc2_w 1038077089
    //   6143: l2i
    //   6144: ldc_w 1310893543
    //   6147: ixor
    //   6148: ixor
    //   6149: lookupswitch default -> 6176, 794651762 -> 7786, 1853259812 -> 6132
    //   6176: goto -> 6180
    //   6179: athrow
    //   6180: invokevirtual func_146158_b : ()Lnet/minecraft/client/gui/GuiNewChat;
    //   6183: goto -> 6187
    //   6186: athrow
    //   6187: new net/minecraft/util/text/TextComponentString
    //   6190: dup
    //   6191: new java/lang/StringBuilder
    //   6194: dup
    //   6195: getstatic Perryc.0 : I
    //   6198: ifle -> 6212
    //   6201: ldc2_w 1861498991
    //   6204: l2i
    //   6205: ldc_w -1140932049
    //   6208: ixor
    //   6209: goto -> 6220
    //   6212: ldc2_w 417754700
    //   6215: l2i
    //   6216: ldc_w 975913619
    //   6219: ixor
    //   6220: ldc2_w 474670674
    //   6223: l2i
    //   6224: ldc_w 1861089449
    //   6227: ixor
    //   6228: ixor
    //   6229: lookupswitch default -> 7894, -1481775941 -> 6212, 1349136932 -> 6256
    //   6256: goto -> 6260
    //   6259: athrow
    //   6260: invokespecial <init> : ()V
    //   6263: goto -> 6267
    //   6266: athrow
    //   6267: getstatic Perryc.1 : I
    //   6270: ifeq -> 6284
    //   6273: ldc2_w -1853012120
    //   6276: l2i
    //   6277: ldc_w 1561606019
    //   6280: ixor
    //   6281: goto -> 6292
    //   6284: ldc2_w -2094962176
    //   6287: l2i
    //   6288: ldc_w 1731984280
    //   6291: ixor
    //   6292: ldc2_w -259368218
    //   6295: l2i
    //   6296: ldc_w -848905552
    //   6299: ixor
    //   6300: ixor
    //   6301: lookupswitch default -> 6328, -243953475 -> 7842, 1331096737 -> 6284
    //   6328: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   6331: getstatic Perryc.1 : I
    //   6334: ifeq -> 6348
    //   6337: ldc2_w -519334858
    //   6340: l2i
    //   6341: ldc_w -1574351578
    //   6344: ixor
    //   6345: goto -> 6356
    //   6348: ldc2_w 681508768
    //   6351: l2i
    //   6352: ldc_w 493318148
    //   6355: ixor
    //   6356: ldc2_w -611915431
    //   6359: l2i
    //   6360: ldc_w 548592496
    //   6363: ixor
    //   6364: ixor
    //   6365: lookupswitch default -> 6392, -1206457543 -> 7848, -999696366 -> 6348
    //   6392: goto -> 6396
    //   6395: athrow
    //   6396: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   6399: goto -> 6403
    //   6402: athrow
    //   6403: getstatic Perryc.0 : I
    //   6406: ifle -> 6420
    //   6409: ldc2_w 221904151
    //   6412: l2i
    //   6413: ldc_w -1271602370
    //   6416: ixor
    //   6417: goto -> 6428
    //   6420: ldc2_w 1861191202
    //   6423: l2i
    //   6424: ldc_w -1636761872
    //   6427: ixor
    //   6428: ldc2_w 2071890093
    //   6431: l2i
    //   6432: ldc_w 1479878942
    //   6435: ixor
    //   6436: ixor
    //   6437: lookupswitch default -> 6464, -1706639462 -> 7756, -1043489336 -> 6420
    //   6464: aload_1
    //   6465: getstatic Perryc.1 : I
    //   6468: ifeq -> 6482
    //   6471: ldc2_w -1931514030
    //   6474: l2i
    //   6475: ldc_w -1910979787
    //   6478: ixor
    //   6479: goto -> 6490
    //   6482: ldc2_w 1671668262
    //   6485: l2i
    //   6486: ldc_w -74872485
    //   6489: ixor
    //   6490: ldc2_w -214193257
    //   6493: l2i
    //   6494: ldc_w 1584950143
    //   6497: ixor
    //   6498: ixor
    //   6499: lookupswitch default -> 7814, -1350275953 -> 6482, 896134037 -> 6524
    //   6524: goto -> 6528
    //   6527: athrow
    //   6528: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   6531: goto -> 6535
    //   6534: athrow
    //   6535: getstatic Perryc.c : I
    //   6538: iflt -> 6552
    //   6541: ldc2_w -1424509817
    //   6544: l2i
    //   6545: ldc_w 80400838
    //   6548: ixor
    //   6549: goto -> 6560
    //   6552: ldc2_w 1455055977
    //   6555: l2i
    //   6556: ldc_w -1575406458
    //   6559: ixor
    //   6560: ldc2_w 1342871376
    //   6563: l2i
    //   6564: ldc_w 1876928899
    //   6567: ixor
    //   6568: ixor
    //   6569: lookupswitch default -> 7864, -1878500462 -> 6552, -881430980 -> 6596
    //   6596: goto -> 6600
    //   6599: athrow
    //   6600: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6603: goto -> 6607
    //   6606: athrow
    //   6607: ldc_w 'ӧ㌗ӄ堕൥๸礌冚뱮੧쥯ᓉ핹駒辖?싎ဉ'
    //   6610: getstatic Perryc.1 : I
    //   6613: ifeq -> 6627
    //   6616: ldc2_w 1497002665
    //   6619: l2i
    //   6620: ldc_w -677441723
    //   6623: ixor
    //   6624: goto -> 6635
    //   6627: ldc2_w 316883329
    //   6630: l2i
    //   6631: ldc_w 1977037128
    //   6634: ixor
    //   6635: ldc2_w 2065332072
    //   6638: l2i
    //   6639: ldc_w -1227423206
    //   6642: ixor
    //   6643: ixor
    //   6644: lookupswitch default -> 6672, -177704701 -> 6627, 1130891422 -> 7808
    //   6672: goto -> 6676
    //   6675: athrow
    //   6676: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   6679: goto -> 6683
    //   6682: athrow
    //   6683: getstatic Perryc.0 : I
    //   6686: ifle -> 6700
    //   6689: ldc2_w -1106335
    //   6692: l2i
    //   6693: ldc_w -964451889
    //   6696: ixor
    //   6697: goto -> 6708
    //   6700: ldc2_w -1972335520
    //   6703: l2i
    //   6704: ldc_w 1429463498
    //   6707: ixor
    //   6708: ldc2_w 803222561
    //   6711: l2i
    //   6712: ldc_w -2072300439
    //   6715: ixor
    //   6716: ixor
    //   6717: lookupswitch default -> 7880, -1829257242 -> 6700, 1960340962 -> 6744
    //   6744: goto -> 6748
    //   6747: athrow
    //   6748: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   6751: goto -> 6755
    //   6754: athrow
    //   6755: getstatic Perryc.1 : I
    //   6758: ifeq -> 6772
    //   6761: ldc2_w -936988631
    //   6764: l2i
    //   6765: ldc_w 1586886968
    //   6768: ixor
    //   6769: goto -> 6780
    //   6772: ldc2_w 43904637
    //   6775: l2i
    //   6776: ldc_w -2117484410
    //   6779: ixor
    //   6780: ldc2_w 512429352
    //   6783: l2i
    //   6784: ldc_w -794246125
    //   6787: ixor
    //   6788: ixor
    //   6789: lookupswitch default -> 6816, 1485865002 -> 7912, 1631120490 -> 6772
    //   6816: getstatic com/mojang/realmsclient/gui/ChatFormatting.GREEN : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   6819: getstatic Perryc.0 : I
    //   6822: ifle -> 6836
    //   6825: ldc2_w 2057752900
    //   6828: l2i
    //   6829: ldc_w 334721609
    //   6832: ixor
    //   6833: goto -> 6844
    //   6836: ldc2_w 840433431
    //   6839: l2i
    //   6840: ldc_w 1321312276
    //   6843: ixor
    //   6844: ldc2_w 1646489866
    //   6847: l2i
    //   6848: ldc_w -1300172860
    //   6851: ixor
    //   6852: ixor
    //   6853: lookupswitch default -> 6880, -1175044669 -> 7832, 2069118230 -> 6836
    //   6880: goto -> 6884
    //   6883: athrow
    //   6884: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   6887: goto -> 6891
    //   6890: athrow
    //   6891: getstatic Perryc.0 : I
    //   6894: ifle -> 6908
    //   6897: ldc2_w 931158640
    //   6900: l2i
    //   6901: ldc_w 2075784792
    //   6904: ixor
    //   6905: goto -> 6916
    //   6908: ldc2_w -154811724
    //   6911: l2i
    //   6912: ldc_w -110558054
    //   6915: ixor
    //   6916: ldc2_w -1354198247
    //   6919: l2i
    //   6920: ldc_w -1036836950
    //   6923: ixor
    //   6924: ixor
    //   6925: lookupswitch default -> 6952, -1638228667 -> 6908, 557981851 -> 7866
    //   6952: getstatic com/mojang/realmsclient/gui/ChatFormatting.BOLD : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   6955: getstatic Perryc.1 : I
    //   6958: ifeq -> 6972
    //   6961: ldc2_w 736997867
    //   6964: l2i
    //   6965: ldc_w -70174638
    //   6968: ixor
    //   6969: goto -> 6980
    //   6972: ldc2_w 397109412
    //   6975: l2i
    //   6976: ldc_w 817899624
    //   6979: ixor
    //   6980: ldc2_w -1823186149
    //   6983: l2i
    //   6984: ldc_w -1142412848
    //   6987: ixor
    //   6988: ixor
    //   6989: lookupswitch default -> 7016, -125779086 -> 7800, 1422899964 -> 6972
    //   7016: goto -> 7020
    //   7019: athrow
    //   7020: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   7023: goto -> 7027
    //   7026: athrow
    //   7027: getstatic Perryc.c : I
    //   7030: iflt -> 7044
    //   7033: ldc2_w 1857431239
    //   7036: l2i
    //   7037: ldc_w -435205500
    //   7040: ixor
    //   7041: goto -> 7052
    //   7044: ldc2_w 58082956
    //   7047: l2i
    //   7048: ldc_w -1220825556
    //   7051: ixor
    //   7052: ldc2_w -1317361168
    //   7055: l2i
    //   7056: ldc_w -727271136
    //   7059: ixor
    //   7060: ixor
    //   7061: lookupswitch default -> 7088, -312116077 -> 7840, 1427692867 -> 7044
    //   7088: iload_2
    //   7089: getstatic Perryc.1 : I
    //   7092: ifeq -> 7106
    //   7095: ldc2_w 1144638154
    //   7098: l2i
    //   7099: ldc_w -1064710220
    //   7102: ixor
    //   7103: goto -> 7114
    //   7106: ldc2_w 2026096256
    //   7109: l2i
    //   7110: ldc_w 2039661464
    //   7113: ixor
    //   7114: ldc2_w 925465622
    //   7117: l2i
    //   7118: ldc_w -1662599717
    //   7121: ixor
    //   7122: ixor
    //   7123: lookupswitch default -> 7148, 796902579 -> 7874, 869890339 -> 7106
    //   7148: goto -> 7152
    //   7151: athrow
    //   7152: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   7155: goto -> 7159
    //   7158: athrow
    //   7159: getstatic Perryc.0 : I
    //   7162: ifle -> 7176
    //   7165: ldc2_w -733577961
    //   7168: l2i
    //   7169: ldc_w 1728075258
    //   7172: ixor
    //   7173: goto -> 7184
    //   7176: ldc2_w -590589713
    //   7179: l2i
    //   7180: ldc_w -1497687277
    //   7183: ixor
    //   7184: ldc2_w 895467521
    //   7187: l2i
    //   7188: ldc_w -1280021877
    //   7191: ixor
    //   7192: ixor
    //   7193: lookupswitch default -> 7220, -1312776520 -> 7176, 900563559 -> 7936
    //   7220: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   7223: getstatic Perryc.0 : I
    //   7226: ifle -> 7240
    //   7229: ldc2_w 584005291
    //   7232: l2i
    //   7233: ldc_w -1375148548
    //   7236: ixor
    //   7237: goto -> 7248
    //   7240: ldc2_w -2077444039
    //   7243: l2i
    //   7244: ldc_w -1713201954
    //   7247: ixor
    //   7248: ldc2_w -1656264905
    //   7251: l2i
    //   7252: ldc_w 783194128
    //   7255: ixor
    //   7256: ixor
    //   7257: lookupswitch default -> 7284, 1059990640 -> 7792, 1085164690 -> 7240
    //   7284: goto -> 7288
    //   7287: athrow
    //   7288: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   7291: goto -> 7295
    //   7294: athrow
    //   7295: ldc_w 'ӧ㌧ӂ堄൤๪祋'
    //   7298: getstatic Perryc.0 : I
    //   7301: ifle -> 7315
    //   7304: ldc2_w -1206161994
    //   7307: l2i
    //   7308: ldc_w 120959561
    //   7311: ixor
    //   7312: goto -> 7323
    //   7315: ldc2_w 1531452428
    //   7318: l2i
    //   7319: ldc_w 2117577952
    //   7322: ixor
    //   7323: ldc2_w -1860840359
    //   7326: l2i
    //   7327: ldc_w 549034587
    //   7330: ixor
    //   7331: ixor
    //   7332: lookupswitch default -> 7796, -1798045970 -> 7360, 243438077 -> 7315
    //   7360: goto -> 7364
    //   7363: athrow
    //   7364: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7367: goto -> 7371
    //   7370: athrow
    //   7371: getstatic Perryc.1 : I
    //   7374: ifeq -> 7388
    //   7377: ldc2_w 533345186
    //   7380: l2i
    //   7381: ldc_w 1081079522
    //   7384: ixor
    //   7385: goto -> 7396
    //   7388: ldc2_w 1059349102
    //   7391: l2i
    //   7392: ldc_w -942398724
    //   7395: ixor
    //   7396: ldc2_w 1833035696
    //   7399: l2i
    //   7400: ldc_w -1233351082
    //   7403: ixor
    //   7404: ixor
    //   7405: lookupswitch default -> 7432, -2070369114 -> 7810, -1470749874 -> 7388
    //   7432: goto -> 7436
    //   7435: athrow
    //   7436: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7439: goto -> 7443
    //   7442: athrow
    //   7443: getstatic Perryc.1 : I
    //   7446: ifeq -> 7460
    //   7449: ldc2_w -1196552260
    //   7452: l2i
    //   7453: ldc_w 1499505905
    //   7456: ixor
    //   7457: goto -> 7468
    //   7460: ldc2_w -144588527
    //   7463: l2i
    //   7464: ldc_w 1686765871
    //   7467: ixor
    //   7468: ldc2_w 1938360009
    //   7471: l2i
    //   7472: ldc_w -16249354
    //   7475: ixor
    //   7476: ixor
    //   7477: lookupswitch default -> 7748, 527092481 -> 7504, 1833934962 -> 7460
    //   7504: goto -> 7508
    //   7507: athrow
    //   7508: invokevirtual toString : ()Ljava/lang/String;
    //   7511: goto -> 7515
    //   7514: athrow
    //   7515: getstatic Perryc.0 : I
    //   7518: ifle -> 7532
    //   7521: ldc2_w -140474885
    //   7524: l2i
    //   7525: ldc_w -1328770050
    //   7528: ixor
    //   7529: goto -> 7540
    //   7532: ldc2_w -693369501
    //   7535: l2i
    //   7536: ldc_w -531416494
    //   7539: ixor
    //   7540: ldc2_w 644965849
    //   7543: l2i
    //   7544: ldc_w -42448197
    //   7547: ixor
    //   7548: ixor
    //   7549: lookupswitch default -> 7576, -1671087769 -> 7776, -685625458 -> 7532
    //   7576: goto -> 7580
    //   7579: athrow
    //   7580: invokespecial <init> : (Ljava/lang/String;)V
    //   7583: goto -> 7587
    //   7586: athrow
    //   7587: getstatic Perryc.c : I
    //   7590: iflt -> 7604
    //   7593: ldc2_w -1730113413
    //   7596: l2i
    //   7597: ldc_w -1135442758
    //   7600: ixor
    //   7601: goto -> 7612
    //   7604: ldc2_w -1787362220
    //   7607: l2i
    //   7608: ldc_w 590031558
    //   7611: ixor
    //   7612: ldc2_w -239501148
    //   7615: l2i
    //   7616: ldc_w 2004215640
    //   7619: ixor
    //   7620: ixor
    //   7621: lookupswitch default -> 7732, -1568771267 -> 7604, 814762350 -> 7648
    //   7648: iload_3
    //   7649: getstatic Perryc.0 : I
    //   7652: ifle -> 7666
    //   7655: ldc2_w -559569499
    //   7658: l2i
    //   7659: ldc_w -69179355
    //   7662: ixor
    //   7663: goto -> 7674
    //   7666: ldc2_w -250997
    //   7669: l2i
    //   7670: ldc_w 1725992632
    //   7673: ixor
    //   7674: ldc2_w -211308259
    //   7677: l2i
    //   7678: ldc_w 983488045
    //   7681: ixor
    //   7682: ixor
    //   7683: lookupswitch default -> 7914, -323179856 -> 7666, 1357234691 -> 7708
    //   7708: goto -> 7712
    //   7711: athrow
    //   7712: invokevirtual func_146234_a : (Lnet/minecraft/util/text/ITextComponent;I)V
    //   7715: goto -> 7719
    //   7718: athrow
    //   7719: return
    //   7720: aconst_null
    //   7721: athrow
    //   7722: aconst_null
    //   7723: athrow
    //   7724: aconst_null
    //   7725: athrow
    //   7726: aconst_null
    //   7727: athrow
    //   7728: aconst_null
    //   7729: athrow
    //   7730: aconst_null
    //   7731: athrow
    //   7732: aconst_null
    //   7733: athrow
    //   7734: aconst_null
    //   7735: athrow
    //   7736: aconst_null
    //   7737: athrow
    //   7738: aconst_null
    //   7739: athrow
    //   7740: aconst_null
    //   7741: athrow
    //   7742: aconst_null
    //   7743: athrow
    //   7744: aconst_null
    //   7745: athrow
    //   7746: aconst_null
    //   7747: athrow
    //   7748: aconst_null
    //   7749: athrow
    //   7750: aconst_null
    //   7751: athrow
    //   7752: aconst_null
    //   7753: athrow
    //   7754: aconst_null
    //   7755: athrow
    //   7756: aconst_null
    //   7757: athrow
    //   7758: aconst_null
    //   7759: athrow
    //   7760: aconst_null
    //   7761: athrow
    //   7762: aconst_null
    //   7763: athrow
    //   7764: aconst_null
    //   7765: athrow
    //   7766: aconst_null
    //   7767: athrow
    //   7768: aconst_null
    //   7769: athrow
    //   7770: aconst_null
    //   7771: athrow
    //   7772: aconst_null
    //   7773: athrow
    //   7774: aconst_null
    //   7775: athrow
    //   7776: aconst_null
    //   7777: athrow
    //   7778: aconst_null
    //   7779: athrow
    //   7780: aconst_null
    //   7781: athrow
    //   7782: aconst_null
    //   7783: athrow
    //   7784: aconst_null
    //   7785: athrow
    //   7786: aconst_null
    //   7787: athrow
    //   7788: aconst_null
    //   7789: athrow
    //   7790: aconst_null
    //   7791: athrow
    //   7792: aconst_null
    //   7793: athrow
    //   7794: aconst_null
    //   7795: athrow
    //   7796: aconst_null
    //   7797: athrow
    //   7798: aconst_null
    //   7799: athrow
    //   7800: aconst_null
    //   7801: athrow
    //   7802: aconst_null
    //   7803: athrow
    //   7804: aconst_null
    //   7805: athrow
    //   7806: aconst_null
    //   7807: athrow
    //   7808: aconst_null
    //   7809: athrow
    //   7810: aconst_null
    //   7811: athrow
    //   7812: aconst_null
    //   7813: athrow
    //   7814: aconst_null
    //   7815: athrow
    //   7816: aconst_null
    //   7817: athrow
    //   7818: aconst_null
    //   7819: athrow
    //   7820: aconst_null
    //   7821: athrow
    //   7822: aconst_null
    //   7823: athrow
    //   7824: aconst_null
    //   7825: athrow
    //   7826: aconst_null
    //   7827: athrow
    //   7828: aconst_null
    //   7829: athrow
    //   7830: aconst_null
    //   7831: athrow
    //   7832: aconst_null
    //   7833: athrow
    //   7834: aconst_null
    //   7835: athrow
    //   7836: aconst_null
    //   7837: athrow
    //   7838: aconst_null
    //   7839: athrow
    //   7840: aconst_null
    //   7841: athrow
    //   7842: aconst_null
    //   7843: athrow
    //   7844: aconst_null
    //   7845: athrow
    //   7846: aconst_null
    //   7847: athrow
    //   7848: aconst_null
    //   7849: athrow
    //   7850: aconst_null
    //   7851: athrow
    //   7852: aconst_null
    //   7853: athrow
    //   7854: aconst_null
    //   7855: athrow
    //   7856: aconst_null
    //   7857: athrow
    //   7858: aconst_null
    //   7859: athrow
    //   7860: aconst_null
    //   7861: athrow
    //   7862: aconst_null
    //   7863: athrow
    //   7864: aconst_null
    //   7865: athrow
    //   7866: aconst_null
    //   7867: athrow
    //   7868: aconst_null
    //   7869: athrow
    //   7870: aconst_null
    //   7871: athrow
    //   7872: aconst_null
    //   7873: athrow
    //   7874: aconst_null
    //   7875: athrow
    //   7876: aconst_null
    //   7877: athrow
    //   7878: aconst_null
    //   7879: athrow
    //   7880: aconst_null
    //   7881: athrow
    //   7882: aconst_null
    //   7883: athrow
    //   7884: aconst_null
    //   7885: athrow
    //   7886: aconst_null
    //   7887: athrow
    //   7888: aconst_null
    //   7889: athrow
    //   7890: aconst_null
    //   7891: athrow
    //   7892: aconst_null
    //   7893: athrow
    //   7894: aconst_null
    //   7895: athrow
    //   7896: aconst_null
    //   7897: athrow
    //   7898: aconst_null
    //   7899: athrow
    //   7900: aconst_null
    //   7901: athrow
    //   7902: aconst_null
    //   7903: athrow
    //   7904: aconst_null
    //   7905: athrow
    //   7906: aconst_null
    //   7907: athrow
    //   7908: aconst_null
    //   7909: athrow
    //   7910: aconst_null
    //   7911: athrow
    //   7912: aconst_null
    //   7913: athrow
    //   7914: aconst_null
    //   7915: athrow
    //   7916: aconst_null
    //   7917: athrow
    //   7918: aconst_null
    //   7919: athrow
    //   7920: aconst_null
    //   7921: athrow
    //   7922: aconst_null
    //   7923: athrow
    //   7924: aconst_null
    //   7925: athrow
    //   7926: aconst_null
    //   7927: athrow
    //   7928: aconst_null
    //   7929: athrow
    //   7930: aconst_null
    //   7931: athrow
    //   7932: aconst_null
    //   7933: athrow
    //   7934: aconst_null
    //   7935: athrow
    //   7936: aconst_null
    //   7937: athrow
    //   7938: pop
    //   7939: goto -> 24
    //   7942: pop
    //   7943: aconst_null
    //   7944: goto -> 7938
    //   7947: dup
    //   7948: ifnull -> 7938
    //   7951: checkcast java/lang/Throwable
    //   7954: athrow
    //   7955: dup
    //   7956: ifnull -> 7942
    //   7959: checkcast java/lang/Throwable
    //   7962: athrow
    //   7963: aconst_null
    //   7964: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   2370	319	7	character	C
    //   1533	2894	3	id	I
    //   5662	319	7	character	C
    //   4825	2894	3	id	I
    //   749	6970	2	l_Count	I
    //   24	7696	0	this	Lbigname/zprestige/webhack/features/modules/Client/Notify;
    //   24	7696	1	player	Lnet/minecraft/entity/player/EntityPlayer;
    // Exception table:
    //   from	to	target	type
    //   8	20	7947	finally
    //   211	218	218	finally
    //   211	218	218	java/lang/RuntimeException
    //   211	218	3	finally
    //   212	218	3	java/lang/StringIndexOutOfBoundsException
    //   212	218	211	finally
    //   283	290	290	finally
    //   283	290	3	finally
    //   283	290	290	java/lang/StringIndexOutOfBoundsException
    //   284	290	283	java/lang/IllegalArgumentException
    //   284	290	3	java/lang/IndexOutOfBoundsException
    //   531	538	538	finally
    //   531	538	531	java/util/NoSuchElementException
    //   531	538	538	finally
    //   532	538	531	java/lang/ArithmeticException
    //   532	538	3	finally
    //   603	610	610	finally
    //   603	610	610	java/lang/ArrayIndexOutOfBoundsException
    //   604	610	610	finally
    //   604	610	3	java/util/ConcurrentModificationException
    //   604	610	603	finally
    //   679	686	686	finally
    //   679	686	3	finally
    //   679	686	686	java/lang/EnumConstantNotPresentException
    //   680	686	3	finally
    //   680	686	679	finally
    //   935	942	942	finally
    //   935	942	935	java/lang/ArithmeticException
    //   935	942	935	finally
    //   935	942	942	java/util/NoSuchElementException
    //   936	942	935	finally
    //   1007	1014	1014	finally
    //   1007	1014	3	java/lang/StringIndexOutOfBoundsException
    //   1007	1014	1014	java/lang/ArithmeticException
    //   1008	1014	1007	java/lang/NumberFormatException
    //   1008	1014	3	finally
    //   1327	1334	1334	finally
    //   1327	1334	3	finally
    //   1327	1334	1327	java/lang/IllegalArgumentException
    //   1327	1334	3	finally
    //   1328	1334	3	finally
    //   1403	1410	1410	finally
    //   1403	1410	1403	finally
    //   1403	1410	3	finally
    //   1403	1410	3	finally
    //   1403	1410	1410	java/lang/StringIndexOutOfBoundsException
    //   1655	1662	1662	finally
    //   1655	1662	1655	finally
    //   1655	1662	1655	java/lang/NegativeArraySizeException
    //   1656	1662	3	finally
    //   1656	1662	1662	java/lang/NumberFormatException
    //   1728	1734	1734	finally
    //   1728	1734	3	finally
    //   1728	1734	3	java/lang/NullPointerException
    //   1728	1734	1734	java/lang/IllegalStateException
    //   1728	1734	3	java/lang/IllegalArgumentException
    //   2887	2894	2894	finally
    //   2887	2894	3	java/lang/IndexOutOfBoundsException
    //   2887	2894	3	finally
    //   2887	2894	2894	finally
    //   2888	2894	2887	java/lang/IndexOutOfBoundsException
    //   2967	2974	2974	finally
    //   2967	2974	2967	java/lang/AssertionError
    //   2967	2974	3	java/lang/ArithmeticException
    //   2968	2974	2967	java/lang/EnumConstantNotPresentException
    //   2968	2974	3	finally
    //   3103	3110	3110	finally
    //   3103	3110	3	java/lang/IndexOutOfBoundsException
    //   3103	3110	3	java/lang/StringIndexOutOfBoundsException
    //   3104	3110	3103	finally
    //   3104	3110	3103	java/lang/IndexOutOfBoundsException
    //   3235	3242	3242	finally
    //   3235	3242	3235	finally
    //   3235	3242	3235	java/lang/EnumConstantNotPresentException
    //   3236	3242	3242	finally
    //   3236	3242	3235	java/lang/NullPointerException
    //   3308	3314	3314	finally
    //   3308	3314	3	finally
    //   3308	3314	3314	finally
    //   3308	3314	3314	finally
    //   3308	3314	3314	java/lang/NullPointerException
    //   3383	3390	3390	finally
    //   3383	3390	3383	finally
    //   3383	3390	3390	finally
    //   3383	3390	3383	java/util/NoSuchElementException
    //   3384	3390	3383	java/lang/NegativeArraySizeException
    //   3456	3462	3462	finally
    //   3456	3462	3	finally
    //   3456	3462	3	java/lang/RuntimeException
    //   3456	3462	3	finally
    //   3456	3462	3462	finally
    //   3591	3598	3598	finally
    //   3591	3598	3598	finally
    //   3591	3598	3591	finally
    //   3592	3598	3591	finally
    //   3592	3598	3	java/lang/AssertionError
    //   3727	3734	3734	finally
    //   3727	3734	3727	finally
    //   3727	3734	3	java/lang/NegativeArraySizeException
    //   3727	3734	3	finally
    //   3728	3734	3734	finally
    //   3859	3866	3866	finally
    //   3859	3866	3	java/lang/ArrayIndexOutOfBoundsException
    //   3859	3866	3	finally
    //   3859	3866	3859	java/lang/ClassCastException
    //   3860	3866	3	java/lang/AssertionError
    //   3995	4002	4002	finally
    //   3995	4002	4002	finally
    //   3996	4002	3995	finally
    //   3996	4002	3995	java/lang/UnsupportedOperationException
    //   3996	4002	3995	finally
    //   4071	4078	4078	finally
    //   4072	4078	4078	java/util/NoSuchElementException
    //   4072	4078	4071	finally
    //   4072	4078	3	java/lang/IndexOutOfBoundsException
    //   4072	4078	4071	finally
    //   4143	4150	4150	finally
    //   4143	4150	4150	finally
    //   4143	4150	3	java/lang/NegativeArraySizeException
    //   4143	4150	4150	java/lang/IllegalStateException
    //   4144	4150	4143	java/lang/IllegalStateException
    //   4215	4222	4222	finally
    //   4215	4222	4215	finally
    //   4216	4222	4222	finally
    //   4216	4222	3	java/lang/ArrayIndexOutOfBoundsException
    //   4216	4222	3	finally
    //   4287	4294	4294	finally
    //   4287	4294	4287	finally
    //   4288	4294	3	java/lang/RuntimeException
    //   4288	4294	3	finally
    //   4288	4294	4287	java/lang/NullPointerException
    //   4419	4426	4426	finally
    //   4419	4426	4426	java/lang/ArithmeticException
    //   4419	4426	4419	java/lang/ArrayIndexOutOfBoundsException
    //   4420	4426	3	java/util/ConcurrentModificationException
    //   4420	4426	3	java/lang/RuntimeException
    //   4619	4626	4626	finally
    //   4619	4626	3	java/lang/StringIndexOutOfBoundsException
    //   4619	4626	4619	java/lang/NumberFormatException
    //   4619	4626	4619	java/lang/StringIndexOutOfBoundsException
    //   4620	4626	4619	finally
    //   4695	4702	4702	finally
    //   4695	4702	4702	java/lang/ArithmeticException
    //   4695	4702	4702	java/lang/NegativeArraySizeException
    //   4695	4702	3	finally
    //   4696	4702	4695	java/lang/NegativeArraySizeException
    //   4947	4954	4954	finally
    //   4947	4954	3	finally
    //   4948	4954	3	finally
    //   4948	4954	4947	java/lang/RuntimeException
    //   4948	4954	3	java/lang/RuntimeException
    //   5019	5026	5026	finally
    //   5019	5026	5019	java/lang/UnsupportedOperationException
    //   5020	5026	3	finally
    //   5020	5026	3	java/util/NoSuchElementException
    //   5020	5026	3	finally
    //   6179	6186	6186	finally
    //   6179	6186	6179	finally
    //   6179	6186	3	java/lang/ArithmeticException
    //   6179	6186	6179	finally
    //   6180	6186	6179	finally
    //   6259	6266	6266	finally
    //   6259	6266	6259	finally
    //   6259	6266	6259	finally
    //   6260	6266	6266	finally
    //   6260	6266	3	java/lang/AssertionError
    //   6396	6402	6402	finally
    //   6396	6402	6402	java/lang/IllegalStateException
    //   6396	6402	6402	finally
    //   6396	6402	6402	finally
    //   6396	6402	3	java/lang/EnumConstantNotPresentException
    //   6527	6534	6534	finally
    //   6527	6534	3	finally
    //   6528	6534	6527	finally
    //   6528	6534	6534	finally
    //   6528	6534	3	finally
    //   6599	6606	6606	finally
    //   6599	6606	6606	finally
    //   6599	6606	6599	java/lang/ArrayIndexOutOfBoundsException
    //   6599	6606	6606	finally
    //   6600	6606	6599	finally
    //   6675	6682	6682	finally
    //   6676	6682	3	finally
    //   6676	6682	6675	java/lang/ArrayIndexOutOfBoundsException
    //   6676	6682	3	java/lang/UnsupportedOperationException
    //   6676	6682	6682	java/lang/NumberFormatException
    //   6747	6754	6754	finally
    //   6747	6754	6747	java/lang/IndexOutOfBoundsException
    //   6748	6754	6754	java/lang/StringIndexOutOfBoundsException
    //   6748	6754	6754	finally
    //   6748	6754	6747	finally
    //   6883	6890	6890	finally
    //   6883	6890	3	java/util/ConcurrentModificationException
    //   6883	6890	6883	finally
    //   6884	6890	6883	finally
    //   6884	6890	3	finally
    //   7019	7026	7026	finally
    //   7019	7026	3	java/lang/NumberFormatException
    //   7019	7026	3	java/lang/ClassCastException
    //   7020	7026	3	finally
    //   7020	7026	7019	java/lang/NumberFormatException
    //   7151	7158	7158	finally
    //   7151	7158	7151	finally
    //   7151	7158	7158	finally
    //   7151	7158	7151	finally
    //   7151	7158	7158	finally
    //   7288	7294	7294	finally
    //   7288	7294	7294	finally
    //   7288	7294	3	finally
    //   7288	7294	3	finally
    //   7288	7294	3	finally
    //   7364	7370	7370	finally
    //   7364	7370	7370	finally
    //   7364	7370	7370	java/lang/ArrayIndexOutOfBoundsException
    //   7364	7370	3	java/lang/NullPointerException
    //   7364	7370	7370	finally
    //   7435	7442	7442	finally
    //   7436	7442	7435	finally
    //   7436	7442	7435	finally
    //   7436	7442	7435	java/lang/UnsupportedOperationException
    //   7436	7442	3	finally
    //   7507	7514	7514	finally
    //   7507	7514	7507	java/lang/NumberFormatException
    //   7508	7514	7514	java/lang/ArrayIndexOutOfBoundsException
    //   7508	7514	3	finally
    //   7508	7514	3	java/util/ConcurrentModificationException
    //   7579	7586	7586	finally
    //   7579	7586	7586	java/util/NoSuchElementException
    //   7580	7586	3	java/lang/IllegalStateException
    //   7580	7586	3	java/lang/UnsupportedOperationException
    //   7580	7586	7579	java/lang/NumberFormatException
    //   7712	7718	7718	finally
    //   7712	7718	7718	java/lang/IllegalArgumentException
    //   7712	7718	7718	java/lang/IllegalStateException
    //   7712	7718	3	java/lang/NegativeArraySizeException
    //   7712	7718	3	finally
    //   7947	7955	7947	java/lang/AssertionError
    //   7963	7965	3	java/lang/ClassCastException
  }
  
  static {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: getstatic Perryc.1 : I
    //   7: ifeq -> 21
    //   10: ldc2_w 83311179
    //   13: l2i
    //   14: ldc_w 2024917934
    //   17: ixor
    //   18: goto -> 29
    //   21: ldc2_w -2097938808
    //   24: l2i
    //   25: ldc_w -807576504
    //   28: ixor
    //   29: ldc2_w -1304664362
    //   32: l2i
    //   33: ldc_w -2005867959
    //   36: ixor
    //   37: ixor
    //   38: lookupswitch default -> 64, 1070142926 -> 21, 1175090554 -> 404
    //   64: invokespecial <init> : ()V
    //   67: getstatic Perryc.c : I
    //   70: iflt -> 84
    //   73: ldc2_w -1598865805
    //   76: l2i
    //   77: ldc_w 745834963
    //   80: ixor
    //   81: goto -> 92
    //   84: ldc2_w -1703145598
    //   87: l2i
    //   88: ldc_w 1475101231
    //   91: ixor
    //   92: ldc2_w -1924696713
    //   95: l2i
    //   96: ldc_w -1533545896
    //   99: ixor
    //   100: ixor
    //   101: lookupswitch default -> 400, -1525206897 -> 84, -465515902 -> 128
    //   128: putstatic bigname/zprestige/webhack/features/modules/Client/Notify.modules : Ljava/util/List;
    //   131: new bigname/zprestige/webhack/features/modules/Client/Notify
    //   134: dup
    //   135: getstatic Perryc.0 : I
    //   138: ifle -> 152
    //   141: ldc2_w 1483618176
    //   144: l2i
    //   145: ldc_w 708567221
    //   148: ixor
    //   149: goto -> 160
    //   152: ldc2_w 1712596798
    //   155: l2i
    //   156: ldc_w -398726803
    //   159: ixor
    //   160: ldc2_w 1328331122
    //   163: l2i
    //   164: ldc_w 57472380
    //   167: ixor
    //   168: ixor
    //   169: lookupswitch default -> 196, -946495541 -> 152, 1041603387 -> 406
    //   196: invokespecial <init> : ()V
    //   199: getstatic Perryc.0 : I
    //   202: ifle -> 216
    //   205: ldc2_w -776933610
    //   208: l2i
    //   209: ldc_w -2100452391
    //   212: ixor
    //   213: goto -> 224
    //   216: ldc2_w 1867708550
    //   219: l2i
    //   220: ldc_w 1114533591
    //   223: ixor
    //   224: ldc2_w -389982130
    //   227: l2i
    //   228: ldc_w 1012030327
    //   231: ixor
    //   232: ixor
    //   233: lookupswitch default -> 260, -2014425098 -> 402, 793014670 -> 216
    //   260: putstatic bigname/zprestige/webhack/features/modules/Client/Notify.INSTANCE : Lbigname/zprestige/webhack/features/modules/Client/Notify;
    //   263: new java/util/HashMap
    //   266: dup
    //   267: getstatic Perryc.c : I
    //   270: iflt -> 284
    //   273: ldc2_w -1887262282
    //   276: l2i
    //   277: ldc_w -1467190517
    //   280: ixor
    //   281: goto -> 292
    //   284: ldc2_w 1098563596
    //   287: l2i
    //   288: ldc_w -417559279
    //   291: ixor
    //   292: ldc2_w 1136316838
    //   295: l2i
    //   296: ldc_w 1211969296
    //   299: ixor
    //   300: ixor
    //   301: lookupswitch default -> 328, 747185163 -> 396, 1113781367 -> 284
    //   328: invokespecial <init> : ()V
    //   331: getstatic Perryc.c : I
    //   334: iflt -> 348
    //   337: ldc2_w -1853375038
    //   340: l2i
    //   341: ldc_w -1925480401
    //   344: ixor
    //   345: goto -> 356
    //   348: ldc2_w 760372885
    //   351: l2i
    //   352: ldc_w -2009032732
    //   355: ixor
    //   356: ldc2_w 1623315824
    //   359: l2i
    //   360: ldc_w 1525710140
    //   363: ixor
    //   364: ixor
    //   365: lookupswitch default -> 392, -714834428 -> 348, 646813089 -> 398
    //   392: putstatic bigname/zprestige/webhack/features/modules/Client/Notify.TotemPopContainer : Ljava/util/HashMap;
    //   395: return
    //   396: aconst_null
    //   397: athrow
    //   398: aconst_null
    //   399: athrow
    //   400: aconst_null
    //   401: athrow
    //   402: aconst_null
    //   403: athrow
    //   404: aconst_null
    //   405: athrow
    //   406: aconst_null
    //   407: athrow
  }
  
  public void onTotemPop(EntityPlayer player) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 9035
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 9027
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 9019
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 637334713
    //   33: l2i
    //   34: ldc_w -1461274816
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 2008048152
    //   44: l2i
    //   45: ldc_w -1528020011
    //   48: ixor
    //   49: ldc2_w -731421715
    //   52: l2i
    //   53: ldc_w -2017475243
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1120900104 -> 41, -557652671 -> 8978
    //   84: goto -> 88
    //   87: athrow
    //   88: invokestatic fullNullCheck : ()Z
    //   91: goto -> 95
    //   94: athrow
    //   95: ifeq -> 109
    //   98: ldc2_w 1297419338
    //   101: l2i
    //   102: ldc_w -1232059755
    //   105: ixor
    //   106: goto -> 117
    //   109: ldc2_w -1882683418
    //   112: l2i
    //   113: ldc_w 1947060536
    //   116: ixor
    //   117: ldc2_w -928435824
    //   120: l2i
    //   121: ldc_w -1742908027
    //   124: ixor
    //   125: ixor
    //   126: tableswitch default -> 98, -1418646838 -> 148, -1418646837 -> 149
    //   148: return
    //   149: getstatic Perryc.0 : I
    //   152: ifle -> 166
    //   155: ldc2_w 1425108497
    //   158: l2i
    //   159: ldc_w -1731183798
    //   162: ixor
    //   163: goto -> 174
    //   166: ldc2_w -302438302
    //   169: l2i
    //   170: ldc_w -321690377
    //   173: ixor
    //   174: ldc2_w 666526052
    //   177: l2i
    //   178: ldc_w -1645648412
    //   181: ixor
    //   182: ixor
    //   183: lookupswitch default -> 8988, -1149679595 -> 208, 1987203547 -> 166
    //   208: getstatic bigname/zprestige/webhack/features/modules/Client/Notify.mc : Lnet/minecraft/client/Minecraft;
    //   211: getstatic Perryc.0 : I
    //   214: ifle -> 228
    //   217: ldc2_w 639701191
    //   220: l2i
    //   221: ldc_w -1119046728
    //   224: ixor
    //   225: goto -> 236
    //   228: ldc2_w -1745791465
    //   231: l2i
    //   232: ldc_w -1953407315
    //   235: ixor
    //   236: ldc2_w 835328328
    //   239: l2i
    //   240: ldc_w 435540471
    //   243: ixor
    //   244: ixor
    //   245: lookupswitch default -> 272, -1827086684 -> 228, -1286444096 -> 8992
    //   272: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   275: getstatic Perryc.1 : I
    //   278: ifeq -> 292
    //   281: ldc2_w 276857159
    //   284: l2i
    //   285: ldc_w -295092539
    //   288: ixor
    //   289: goto -> 300
    //   292: ldc2_w 1446065029
    //   295: l2i
    //   296: ldc_w 1918045133
    //   299: ixor
    //   300: ldc2_w 299051791
    //   303: l2i
    //   304: ldc_w 1653274675
    //   307: ixor
    //   308: ixor
    //   309: lookupswitch default -> 8940, -1917817666 -> 292, 1463544692 -> 336
    //   336: aload_1
    //   337: getstatic Perryc.0 : I
    //   340: ifle -> 354
    //   343: ldc2_w -1631423870
    //   346: l2i
    //   347: ldc_w 1099454961
    //   350: ixor
    //   351: goto -> 362
    //   354: ldc2_w -1444882872
    //   357: l2i
    //   358: ldc_w -1316954101
    //   361: ixor
    //   362: ldc2_w -485619267
    //   365: l2i
    //   366: ldc_w 1564930190
    //   369: ixor
    //   370: ixor
    //   371: lookupswitch default -> 8878, -1507274896 -> 396, 1627574848 -> 354
    //   396: goto -> 400
    //   399: athrow
    //   400: invokevirtual equals : (Ljava/lang/Object;)Z
    //   403: goto -> 407
    //   406: athrow
    //   407: ifeq -> 421
    //   410: ldc2_w 96138596
    //   413: l2i
    //   414: ldc_w 1585370014
    //   417: ixor
    //   418: goto -> 429
    //   421: ldc2_w 2066745240
    //   424: l2i
    //   425: ldc_w 552870241
    //   428: ixor
    //   429: ldc2_w 957020871
    //   432: l2i
    //   433: ldc_w -1134385008
    //   436: ixor
    //   437: ixor
    //   438: tableswitch default -> 410, -559123283 -> 460, -559123282 -> 461
    //   460: return
    //   461: ldc2_w 1806283503
    //   464: l2i
    //   465: ldc_w 1806283502
    //   468: ixor
    //   469: getstatic Perryc.0 : I
    //   472: ifle -> 486
    //   475: ldc2_w -54832846
    //   478: l2i
    //   479: ldc_w -1931965031
    //   482: ixor
    //   483: goto -> 494
    //   486: ldc2_w -177656992
    //   489: l2i
    //   490: ldc_w -533029043
    //   493: ixor
    //   494: ldc2_w -2039598757
    //   497: l2i
    //   498: ldc_w -1915513713
    //   501: ixor
    //   502: ixor
    //   503: lookupswitch default -> 9000, 518918649 -> 528, 2078177663 -> 486
    //   528: istore_2
    //   529: getstatic Perryc.1 : I
    //   532: ifeq -> 546
    //   535: ldc2_w -234427022
    //   538: l2i
    //   539: ldc_w 438714891
    //   542: ixor
    //   543: goto -> 554
    //   546: ldc2_w -475822144
    //   549: l2i
    //   550: ldc_w -2035720207
    //   553: ixor
    //   554: ldc2_w 1871456767
    //   557: l2i
    //   558: ldc_w 1232183564
    //   561: ixor
    //   562: ixor
    //   563: lookupswitch default -> 8794, -824367222 -> 546, 1140281538 -> 588
    //   588: getstatic bigname/zprestige/webhack/features/modules/Client/Notify.TotemPopContainer : Ljava/util/HashMap;
    //   591: getstatic Perryc.1 : I
    //   594: ifeq -> 608
    //   597: ldc2_w 2137668149
    //   600: l2i
    //   601: ldc_w -706695810
    //   604: ixor
    //   605: goto -> 616
    //   608: ldc2_w 1430997370
    //   611: l2i
    //   612: ldc_w -148394165
    //   615: ixor
    //   616: ldc2_w -397506341
    //   619: l2i
    //   620: ldc_w 1352777073
    //   623: ixor
    //   624: ixor
    //   625: lookupswitch default -> 652, -721495999 -> 608, 308650721 -> 8968
    //   652: aload_1
    //   653: getstatic Perryc.c : I
    //   656: iflt -> 670
    //   659: ldc2_w 1583283572
    //   662: l2i
    //   663: ldc_w 690585449
    //   666: ixor
    //   667: goto -> 678
    //   670: ldc2_w -641503944
    //   673: l2i
    //   674: ldc_w -1154375990
    //   677: ixor
    //   678: ldc2_w -1020339303
    //   681: l2i
    //   682: ldc_w -673718338
    //   685: ixor
    //   686: ixor
    //   687: lookupswitch default -> 8938, 1670284858 -> 670, 1980495829 -> 712
    //   712: goto -> 716
    //   715: athrow
    //   716: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   719: goto -> 723
    //   722: athrow
    //   723: getstatic Perryc.c : I
    //   726: iflt -> 740
    //   729: ldc2_w -1639068936
    //   732: l2i
    //   733: ldc_w -1588144717
    //   736: ixor
    //   737: goto -> 748
    //   740: ldc2_w 1449483405
    //   743: l2i
    //   744: ldc_w -124696604
    //   747: ixor
    //   748: ldc2_w -1070673604
    //   751: l2i
    //   752: ldc_w 196414119
    //   755: ixor
    //   756: ixor
    //   757: lookupswitch default -> 784, -192887600 -> 8910, 1087404276 -> 740
    //   784: goto -> 788
    //   787: athrow
    //   788: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   791: goto -> 795
    //   794: athrow
    //   795: ifeq -> 809
    //   798: ldc2_w 1911175562
    //   801: l2i
    //   802: ldc_w 452862986
    //   805: ixor
    //   806: goto -> 817
    //   809: ldc2_w 2070326540
    //   812: l2i
    //   813: ldc_w 275951757
    //   816: ixor
    //   817: ldc2_w -250402943
    //   820: l2i
    //   821: ldc_w 1421516631
    //   824: ixor
    //   825: ixor
    //   826: tableswitch default -> 798, -826432170 -> 848, -826432169 -> 1659
    //   848: getstatic Perryc.c : I
    //   851: iflt -> 865
    //   854: ldc2_w -1502533659
    //   857: l2i
    //   858: ldc_w -1352747255
    //   861: ixor
    //   862: goto -> 873
    //   865: ldc2_w -1694180354
    //   868: l2i
    //   869: ldc_w -467030029
    //   872: ixor
    //   873: ldc2_w 892481546
    //   876: l2i
    //   877: ldc_w 1999288389
    //   880: ixor
    //   881: ixor
    //   882: lookupswitch default -> 8820, 1026948162 -> 908, 1261901987 -> 865
    //   908: getstatic bigname/zprestige/webhack/features/modules/Client/Notify.TotemPopContainer : Ljava/util/HashMap;
    //   911: getstatic Perryc.c : I
    //   914: iflt -> 928
    //   917: ldc2_w -1370330905
    //   920: l2i
    //   921: ldc_w -1098411893
    //   924: ixor
    //   925: goto -> 936
    //   928: ldc2_w 2109929371
    //   931: l2i
    //   932: ldc_w 617352610
    //   935: ixor
    //   936: ldc2_w 1804088041
    //   939: l2i
    //   940: ldc_w -1557397770
    //   943: ixor
    //   944: ixor
    //   945: lookupswitch default -> 8890, -1850919386 -> 972, -663341965 -> 928
    //   972: aload_1
    //   973: getstatic Perryc.c : I
    //   976: iflt -> 990
    //   979: ldc2_w -707732592
    //   982: l2i
    //   983: ldc_w -532891832
    //   986: ixor
    //   987: goto -> 998
    //   990: ldc2_w 133052215
    //   993: l2i
    //   994: ldc_w -121621258
    //   997: ixor
    //   998: ldc2_w -925765762
    //   1001: l2i
    //   1002: ldc_w -2006617917
    //   1005: ixor
    //   1006: ixor
    //   1007: lookupswitch default -> 8970, -1080386436 -> 1032, 1968763749 -> 990
    //   1032: goto -> 1036
    //   1035: athrow
    //   1036: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   1039: goto -> 1043
    //   1042: athrow
    //   1043: getstatic Perryc.0 : I
    //   1046: ifle -> 1060
    //   1049: ldc2_w 417759600
    //   1052: l2i
    //   1053: ldc_w -1302628939
    //   1056: ixor
    //   1057: goto -> 1068
    //   1060: ldc2_w -312796299
    //   1063: l2i
    //   1064: ldc_w -858416829
    //   1067: ixor
    //   1068: ldc2_w 1261292763
    //   1071: l2i
    //   1072: ldc_w -523769493
    //   1075: ixor
    //   1076: ixor
    //   1077: lookupswitch default -> 1104, -1478765615 -> 1060, 22532469 -> 8896
    //   1104: goto -> 1108
    //   1107: athrow
    //   1108: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1111: goto -> 1115
    //   1114: athrow
    //   1115: checkcast java/lang/Integer
    //   1118: getstatic Perryc.1 : I
    //   1121: ifeq -> 1135
    //   1124: ldc2_w -619960010
    //   1127: l2i
    //   1128: ldc_w -2129302142
    //   1131: ixor
    //   1132: goto -> 1143
    //   1135: ldc2_w -1763217130
    //   1138: l2i
    //   1139: ldc_w 2037177108
    //   1142: ixor
    //   1143: ldc2_w -829546895
    //   1146: l2i
    //   1147: ldc_w -1249625914
    //   1150: ixor
    //   1151: ixor
    //   1152: lookupswitch default -> 8804, -1803449163 -> 1180, 554918403 -> 1135
    //   1180: goto -> 1184
    //   1183: athrow
    //   1184: invokevirtual intValue : ()I
    //   1187: goto -> 1191
    //   1190: athrow
    //   1191: getstatic Perryc.c : I
    //   1194: iflt -> 1208
    //   1197: ldc2_w -994673709
    //   1200: l2i
    //   1201: ldc_w 1769159814
    //   1204: ixor
    //   1205: goto -> 1216
    //   1208: ldc2_w -1343406655
    //   1211: l2i
    //   1212: ldc_w -1704319631
    //   1215: ixor
    //   1216: ldc2_w -1103688335
    //   1219: l2i
    //   1220: ldc_w 14329124
    //   1223: ixor
    //   1224: ixor
    //   1225: lookupswitch default -> 1252, -1837562725 -> 1208, 321449728 -> 8792
    //   1252: istore_2
    //   1253: getstatic Perryc.0 : I
    //   1256: ifle -> 1270
    //   1259: ldc2_w 2069892044
    //   1262: l2i
    //   1263: ldc_w 88006091
    //   1266: ixor
    //   1267: goto -> 1278
    //   1270: ldc2_w -478170382
    //   1273: l2i
    //   1274: ldc_w 1771831481
    //   1277: ixor
    //   1278: ldc2_w 1485238147
    //   1281: l2i
    //   1282: ldc_w 153889379
    //   1285: ixor
    //   1286: ixor
    //   1287: lookupswitch default -> 1312, 804525031 -> 8786, 929429656 -> 1270
    //   1312: getstatic bigname/zprestige/webhack/features/modules/Client/Notify.TotemPopContainer : Ljava/util/HashMap;
    //   1315: getstatic Perryc.1 : I
    //   1318: ifeq -> 1332
    //   1321: ldc2_w 1096985193
    //   1324: l2i
    //   1325: ldc_w -1210625572
    //   1328: ixor
    //   1329: goto -> 1340
    //   1332: ldc2_w -1195807535
    //   1335: l2i
    //   1336: ldc_w -1346616223
    //   1339: ixor
    //   1340: ldc2_w -646802094
    //   1343: l2i
    //   1344: ldc_w -38635224
    //   1347: ixor
    //   1348: ixor
    //   1349: lookupswitch default -> 1376, -764078129 -> 8994, -736897585 -> 1332
    //   1376: aload_1
    //   1377: getstatic Perryc.c : I
    //   1380: iflt -> 1394
    //   1383: ldc2_w 962116553
    //   1386: l2i
    //   1387: ldc_w -1027178760
    //   1390: ixor
    //   1391: goto -> 1402
    //   1394: ldc2_w -731085778
    //   1397: l2i
    //   1398: ldc_w -1145834411
    //   1401: ixor
    //   1402: ldc2_w -643177668
    //   1405: l2i
    //   1406: ldc_w 452796137
    //   1409: ixor
    //   1410: ixor
    //   1411: lookupswitch default -> 8796, -1400140370 -> 1436, 952776932 -> 1394
    //   1436: goto -> 1440
    //   1439: athrow
    //   1440: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   1443: goto -> 1447
    //   1446: athrow
    //   1447: iinc #2, 1
    //   1450: getstatic Perryc.c : I
    //   1453: iflt -> 1467
    //   1456: ldc2_w 1693935789
    //   1459: l2i
    //   1460: ldc_w 2091457661
    //   1463: ixor
    //   1464: goto -> 1475
    //   1467: ldc2_w -882447345
    //   1470: l2i
    //   1471: ldc_w -1071878277
    //   1474: ixor
    //   1475: ldc2_w 1044475092
    //   1478: l2i
    //   1479: ldc_w 1909628552
    //   1482: ixor
    //   1483: ixor
    //   1484: lookupswitch default -> 8774, 1156149544 -> 1512, 1473087116 -> 1467
    //   1512: iload_2
    //   1513: getstatic Perryc.1 : I
    //   1516: ifeq -> 1530
    //   1519: ldc2_w 401794272
    //   1522: l2i
    //   1523: ldc_w 1865821710
    //   1526: ixor
    //   1527: goto -> 1538
    //   1530: ldc2_w 1680293651
    //   1533: l2i
    //   1534: ldc_w -661339321
    //   1537: ixor
    //   1538: ldc2_w -588000925
    //   1541: l2i
    //   1542: ldc_w 406833816
    //   1545: ixor
    //   1546: ixor
    //   1547: lookupswitch default -> 8934, -1140272875 -> 1530, 2021648303 -> 1572
    //   1572: goto -> 1576
    //   1575: athrow
    //   1576: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1579: goto -> 1583
    //   1582: athrow
    //   1583: getstatic Perryc.c : I
    //   1586: iflt -> 1600
    //   1589: ldc2_w -87959763
    //   1592: l2i
    //   1593: ldc_w -1600829833
    //   1596: ixor
    //   1597: goto -> 1608
    //   1600: ldc2_w 937821039
    //   1603: l2i
    //   1604: ldc_w 1786063546
    //   1607: ixor
    //   1608: ldc2_w 41026510
    //   1611: l2i
    //   1612: ldc_w 1081406078
    //   1615: ixor
    //   1616: ixor
    //   1617: lookupswitch default -> 1644, 408051946 -> 8798, 457873085 -> 1600
    //   1644: goto -> 1648
    //   1647: athrow
    //   1648: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1651: goto -> 1655
    //   1654: athrow
    //   1655: pop
    //   1656: goto -> 2060
    //   1659: getstatic Perryc.0 : I
    //   1662: ifle -> 1676
    //   1665: ldc2_w 187904834
    //   1668: l2i
    //   1669: ldc_w -1646603811
    //   1672: ixor
    //   1673: goto -> 1684
    //   1676: ldc2_w 1303953656
    //   1679: l2i
    //   1680: ldc_w 1450060523
    //   1683: ixor
    //   1684: ldc2_w -1255569005
    //   1687: l2i
    //   1688: ldc_w -264399597
    //   1691: ixor
    //   1692: ixor
    //   1693: lookupswitch default -> 8880, -738329057 -> 1676, 1589835411 -> 1720
    //   1720: getstatic bigname/zprestige/webhack/features/modules/Client/Notify.TotemPopContainer : Ljava/util/HashMap;
    //   1723: getstatic Perryc.c : I
    //   1726: iflt -> 1740
    //   1729: ldc2_w -2057939212
    //   1732: l2i
    //   1733: ldc_w 946122584
    //   1736: ixor
    //   1737: goto -> 1748
    //   1740: ldc2_w 758830837
    //   1743: l2i
    //   1744: ldc_w -1042355663
    //   1747: ixor
    //   1748: ldc2_w 2122392280
    //   1751: l2i
    //   1752: ldc_w 513393750
    //   1755: ixor
    //   1756: ixor
    //   1757: lookupswitch default -> 1784, -584442078 -> 8998, -347389746 -> 1740
    //   1784: aload_1
    //   1785: getstatic Perryc.0 : I
    //   1788: ifle -> 1802
    //   1791: ldc2_w -1118907060
    //   1794: l2i
    //   1795: ldc_w 217814870
    //   1798: ixor
    //   1799: goto -> 1810
    //   1802: ldc2_w -415154798
    //   1805: l2i
    //   1806: ldc_w 1743037668
    //   1809: ixor
    //   1810: ldc2_w -104874149
    //   1813: l2i
    //   1814: ldc_w -1761721461
    //   1817: ixor
    //   1818: ixor
    //   1819: lookupswitch default -> 8974, -554385718 -> 1802, -270244442 -> 1844
    //   1844: goto -> 1848
    //   1847: athrow
    //   1848: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   1851: goto -> 1855
    //   1854: athrow
    //   1855: getstatic Perryc.0 : I
    //   1858: ifle -> 1872
    //   1861: ldc2_w 421874397
    //   1864: l2i
    //   1865: ldc_w -526184982
    //   1868: ixor
    //   1869: goto -> 1880
    //   1872: ldc2_w 82055484
    //   1875: l2i
    //   1876: ldc_w -104860436
    //   1879: ixor
    //   1880: ldc2_w 901704733
    //   1883: l2i
    //   1884: ldc_w -167190588
    //   1887: ixor
    //   1888: ixor
    //   1889: lookupswitch default -> 1916, 579898984 -> 1872, 976254190 -> 8862
    //   1916: iload_2
    //   1917: getstatic Perryc.0 : I
    //   1920: ifle -> 1934
    //   1923: ldc2_w -89839626
    //   1926: l2i
    //   1927: ldc_w -814390440
    //   1930: ixor
    //   1931: goto -> 1942
    //   1934: ldc2_w -968808200
    //   1937: l2i
    //   1938: ldc_w -1889206640
    //   1941: ixor
    //   1942: ldc2_w -604829723
    //   1945: l2i
    //   1946: ldc_w 1873743457
    //   1949: ixor
    //   1950: ixor
    //   1951: lookupswitch default -> 8892, -2121511638 -> 1934, -42344468 -> 1976
    //   1976: goto -> 1980
    //   1979: athrow
    //   1980: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1983: goto -> 1987
    //   1986: athrow
    //   1987: getstatic Perryc.1 : I
    //   1990: ifeq -> 2004
    //   1993: ldc2_w 1462503799
    //   1996: l2i
    //   1997: ldc_w -89569267
    //   2000: ixor
    //   2001: goto -> 2012
    //   2004: ldc2_w 1697801836
    //   2007: l2i
    //   2008: ldc_w -318539607
    //   2011: ixor
    //   2012: ldc2_w 980868497
    //   2015: l2i
    //   2016: ldc_w 1539345599
    //   2019: ixor
    //   2020: ixor
    //   2021: lookupswitch default -> 8856, -869068716 -> 2004, -377008149 -> 2048
    //   2048: goto -> 2052
    //   2051: athrow
    //   2052: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   2055: goto -> 2059
    //   2058: athrow
    //   2059: pop
    //   2060: getstatic Perryc.c : I
    //   2063: iflt -> 2077
    //   2066: ldc2_w 364119430
    //   2069: l2i
    //   2070: ldc_w -203292103
    //   2073: ixor
    //   2074: goto -> 2085
    //   2077: ldc2_w -872169245
    //   2080: l2i
    //   2081: ldc_w -1453685967
    //   2084: ixor
    //   2085: ldc2_w -912314421
    //   2088: l2i
    //   2089: ldc_w 1329867228
    //   2092: ixor
    //   2093: ixor
    //   2094: lookupswitch default -> 2120, -1006108834 -> 2077, 1619853736 -> 8866
    //   2120: iload_2
    //   2121: ldc2_w -1034729996
    //   2124: l2i
    //   2125: ldc_w -1034729995
    //   2128: ixor
    //   2129: if_icmpne -> 2143
    //   2132: ldc2_w 1958215146
    //   2135: l2i
    //   2136: ldc_w -1915946853
    //   2139: ixor
    //   2140: goto -> 2151
    //   2143: ldc2_w -2097018431
    //   2146: l2i
    //   2147: ldc_w 2054753423
    //   2150: ixor
    //   2151: ldc2_w -1388152892
    //   2154: l2i
    //   2155: ldc_w 1602938090
    //   2158: ixor
    //   2159: ixor
    //   2160: tableswitch default -> 2132, 196318815 -> 2184, 196318816 -> 5474
    //   2184: getstatic Perryc.0 : I
    //   2187: ifle -> 2201
    //   2190: ldc2_w -983296617
    //   2193: l2i
    //   2194: ldc_w -89250587
    //   2197: ixor
    //   2198: goto -> 2209
    //   2201: ldc2_w 1555073256
    //   2204: l2i
    //   2205: ldc_w 9629564
    //   2208: ixor
    //   2209: ldc2_w 1406285857
    //   2212: l2i
    //   2213: ldc_w 1764899060
    //   2216: ixor
    //   2217: ixor
    //   2218: lookupswitch default -> 8950, 86651303 -> 2201, 1724016449 -> 2244
    //   2244: aload_0
    //   2245: getstatic Perryc.1 : I
    //   2248: ifeq -> 2262
    //   2251: ldc2_w -1868820978
    //   2254: l2i
    //   2255: ldc_w -347708281
    //   2258: ixor
    //   2259: goto -> 2270
    //   2262: ldc2_w 822605367
    //   2265: l2i
    //   2266: ldc_w 1639687409
    //   2269: ixor
    //   2270: ldc2_w -956856
    //   2273: l2i
    //   2274: ldc_w 1445824501
    //   2277: ixor
    //   2278: ixor
    //   2279: lookupswitch default -> 2304, -771323084 -> 9008, 1643276539 -> 2262
    //   2304: getfield popCounter : Lbigname/zprestige/webhack/features/setting/Setting;
    //   2307: getstatic Perryc.0 : I
    //   2310: ifle -> 2324
    //   2313: ldc2_w -154275651
    //   2316: l2i
    //   2317: ldc_w 682772148
    //   2320: ixor
    //   2321: goto -> 2332
    //   2324: ldc2_w 975307818
    //   2327: l2i
    //   2328: ldc_w -1145998535
    //   2331: ixor
    //   2332: ldc2_w 2005824010
    //   2335: l2i
    //   2336: ldc_w -1503617494
    //   2339: ixor
    //   2340: ixor
    //   2341: lookupswitch default -> 2368, -1381248828 -> 2324, 261184041 -> 8904
    //   2368: goto -> 2372
    //   2371: athrow
    //   2372: invokevirtual getValue : ()Ljava/lang/Object;
    //   2375: goto -> 2379
    //   2378: athrow
    //   2379: checkcast java/lang/Boolean
    //   2382: getstatic Perryc.c : I
    //   2385: iflt -> 2399
    //   2388: ldc2_w -1448059618
    //   2391: l2i
    //   2392: ldc_w 69749469
    //   2395: ixor
    //   2396: goto -> 2407
    //   2399: ldc2_w 523270194
    //   2402: l2i
    //   2403: ldc_w -815608601
    //   2406: ixor
    //   2407: ldc2_w 1515866694
    //   2410: l2i
    //   2411: ldc_w -1903608044
    //   2414: ixor
    //   2415: ixor
    //   2416: lookupswitch default -> 8948, 75612551 -> 2444, 2034983569 -> 2399
    //   2444: goto -> 2448
    //   2447: athrow
    //   2448: invokevirtual booleanValue : ()Z
    //   2451: goto -> 2455
    //   2454: athrow
    //   2455: ifeq -> 2469
    //   2458: ldc2_w 1794318002
    //   2461: l2i
    //   2462: ldc_w -2063839545
    //   2465: ixor
    //   2466: goto -> 2477
    //   2469: ldc2_w -1960735531
    //   2472: l2i
    //   2473: ldc_w 1697569953
    //   2476: ixor
    //   2477: ldc2_w 335009027
    //   2480: l2i
    //   2481: ldc_w -1546582860
    //   2484: ixor
    //   2485: ixor
    //   2486: tableswitch default -> 2458, 1579778498 -> 2508, 1579778499 -> 8763
    //   2508: ldc2_w 348464032
    //   2511: l2i
    //   2512: ldc_w 348464032
    //   2515: ixor
    //   2516: getstatic Perryc.1 : I
    //   2519: ifeq -> 2533
    //   2522: ldc2_w 1099702697
    //   2525: l2i
    //   2526: ldc_w -1005828048
    //   2529: ixor
    //   2530: goto -> 2541
    //   2533: ldc2_w -923795220
    //   2536: l2i
    //   2537: ldc_w -1588279184
    //   2540: ixor
    //   2541: ldc2_w 504903621
    //   2544: l2i
    //   2545: ldc_w 314601711
    //   2548: ixor
    //   2549: ixor
    //   2550: lookupswitch default -> 8870, -1990709581 -> 2533, 1702662070 -> 2576
    //   2576: istore_3
    //   2577: getstatic Perryc.0 : I
    //   2580: ifle -> 2594
    //   2583: ldc2_w -35633387
    //   2586: l2i
    //   2587: ldc_w -1278356962
    //   2590: ixor
    //   2591: goto -> 2602
    //   2594: ldc2_w -1084371603
    //   2597: l2i
    //   2598: ldc_w -48360151
    //   2601: ixor
    //   2602: ldc2_w 1144311818
    //   2605: l2i
    //   2606: ldc_w 1337030167
    //   2609: ixor
    //   2610: ixor
    //   2611: lookupswitch default -> 8828, 1168651030 -> 2594, 1237745241 -> 2636
    //   2636: aload_1
    //   2637: getstatic Perryc.c : I
    //   2640: iflt -> 2654
    //   2643: ldc2_w 404513025
    //   2646: l2i
    //   2647: ldc_w 1855229410
    //   2650: ixor
    //   2651: goto -> 2662
    //   2654: ldc2_w 600066229
    //   2657: l2i
    //   2658: ldc_w -231343192
    //   2661: ixor
    //   2662: ldc2_w 633301507
    //   2665: l2i
    //   2666: ldc_w 635454974
    //   2669: ixor
    //   2670: ixor
    //   2671: lookupswitch default -> 8898, -777085728 -> 2696, 1993851678 -> 2654
    //   2696: goto -> 2700
    //   2699: athrow
    //   2700: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   2703: goto -> 2707
    //   2706: athrow
    //   2707: getstatic Perryc.0 : I
    //   2710: ifle -> 2724
    //   2713: ldc2_w 1544647293
    //   2716: l2i
    //   2717: ldc_w -1767344661
    //   2720: ixor
    //   2721: goto -> 2732
    //   2724: ldc2_w -1461826376
    //   2727: l2i
    //   2728: ldc_w 1877032010
    //   2731: ixor
    //   2732: ldc2_w -621437199
    //   2735: l2i
    //   2736: ldc_w -1396738626
    //   2739: ixor
    //   2740: ixor
    //   2741: lookupswitch default -> 8990, -1317692483 -> 2768, -1124864807 -> 2724
    //   2768: goto -> 2772
    //   2771: athrow
    //   2772: invokevirtual toCharArray : ()[C
    //   2775: goto -> 2779
    //   2778: athrow
    //   2779: getstatic Perryc.1 : I
    //   2782: ifeq -> 2796
    //   2785: ldc2_w -248816436
    //   2788: l2i
    //   2789: ldc_w 828774071
    //   2792: ixor
    //   2793: goto -> 2804
    //   2796: ldc2_w -1311354724
    //   2799: l2i
    //   2800: ldc_w -604868821
    //   2803: ixor
    //   2804: ldc2_w -649564744
    //   2807: l2i
    //   2808: ldc_w 955759826
    //   2811: ixor
    //   2812: ixor
    //   2813: lookupswitch default -> 8868, -1952715043 -> 2840, 569547537 -> 2796
    //   2840: astore #4
    //   2842: getstatic Perryc.c : I
    //   2845: iflt -> 2859
    //   2848: ldc2_w 1145714167
    //   2851: l2i
    //   2852: ldc_w 1869643945
    //   2855: ixor
    //   2856: goto -> 2867
    //   2859: ldc2_w 642411804
    //   2862: l2i
    //   2863: ldc_w -1389082852
    //   2866: ixor
    //   2867: ldc2_w 1567862886
    //   2870: l2i
    //   2871: ldc_w 986446647
    //   2874: ixor
    //   2875: ixor
    //   2876: lookupswitch default -> 8778, -322543279 -> 2904, 1283653135 -> 2859
    //   2904: aload #4
    //   2906: arraylength
    //   2907: getstatic Perryc.1 : I
    //   2910: ifeq -> 2924
    //   2913: ldc2_w 1889195804
    //   2916: l2i
    //   2917: ldc_w 2064591469
    //   2920: ixor
    //   2921: goto -> 2932
    //   2924: ldc2_w -1747982870
    //   2927: l2i
    //   2928: ldc_w 77230258
    //   2931: ixor
    //   2932: ldc2_w -957245517
    //   2935: l2i
    //   2936: ldc_w 1427436174
    //   2939: ixor
    //   2940: ixor
    //   2941: lookupswitch default -> 8818, -1737451444 -> 2924, 11595877 -> 2968
    //   2968: istore #5
    //   2970: ldc2_w -171933973
    //   2973: l2i
    //   2974: ldc_w -171933973
    //   2977: ixor
    //   2978: getstatic Perryc.0 : I
    //   2981: ifle -> 2995
    //   2984: ldc2_w -1279638279
    //   2987: l2i
    //   2988: ldc_w 1397112525
    //   2991: ixor
    //   2992: goto -> 3003
    //   2995: ldc2_w -1089822148
    //   2998: l2i
    //   2999: ldc_w -354010384
    //   3002: ixor
    //   3003: ldc2_w 2078938644
    //   3006: l2i
    //   3007: ldc_w -1516789931
    //   3010: ixor
    //   3011: ixor
    //   3012: lookupswitch default -> 8900, -1953427059 -> 3040, 1048703861 -> 2995
    //   3040: istore #6
    //   3042: getstatic Perryc.1 : I
    //   3045: ifeq -> 3059
    //   3048: ldc2_w -2084293190
    //   3051: l2i
    //   3052: ldc_w -1032366470
    //   3055: ixor
    //   3056: goto -> 3067
    //   3059: ldc2_w -1861394246
    //   3062: l2i
    //   3063: ldc_w 5881972
    //   3066: ixor
    //   3067: ldc2_w -1383882059
    //   3070: l2i
    //   3071: ldc_w 1976578674
    //   3074: ixor
    //   3075: ixor
    //   3076: lookupswitch default -> 3104, -1713310969 -> 8770, 1849166698 -> 3059
    //   3104: iload #6
    //   3106: getstatic Perryc.c : I
    //   3109: iflt -> 3123
    //   3112: ldc2_w 778379319
    //   3115: l2i
    //   3116: ldc_w 1722241984
    //   3119: ixor
    //   3120: goto -> 3131
    //   3123: ldc2_w 251553333
    //   3126: l2i
    //   3127: ldc_w -970762779
    //   3130: ixor
    //   3131: ldc2_w -1908598190
    //   3134: l2i
    //   3135: ldc_w -747248242
    //   3138: ixor
    //   3139: ixor
    //   3140: lookupswitch default -> 8916, -1785345012 -> 3168, 361401387 -> 3123
    //   3168: iload #5
    //   3170: if_icmpge -> 3184
    //   3173: ldc2_w -1171250446
    //   3176: l2i
    //   3177: ldc_w -431328564
    //   3180: ixor
    //   3181: goto -> 3192
    //   3184: ldc2_w -1883436168
    //   3187: l2i
    //   3188: ldc_w -741909689
    //   3191: ixor
    //   3192: ldc2_w -1782578295
    //   3195: l2i
    //   3196: ldc_w 2099284933
    //   3199: ixor
    //   3200: ixor
    //   3201: tableswitch default -> 3173, -1264920462 -> 3224, -1264920461 -> 3739
    //   3224: getstatic Perryc.0 : I
    //   3227: ifle -> 3241
    //   3230: ldc2_w -1101021166
    //   3233: l2i
    //   3234: ldc_w -56732939
    //   3237: ixor
    //   3238: goto -> 3249
    //   3241: ldc2_w -1231305938
    //   3244: l2i
    //   3245: ldc_w 599252150
    //   3248: ixor
    //   3249: ldc2_w -2027421595
    //   3252: l2i
    //   3253: ldc_w 409350693
    //   3256: ixor
    //   3257: ixor
    //   3258: lookupswitch default -> 3284, -878551105 -> 3241, -577789785 -> 8782
    //   3284: aload #4
    //   3286: getstatic Perryc.0 : I
    //   3289: ifle -> 3303
    //   3292: ldc2_w 347078870
    //   3295: l2i
    //   3296: ldc_w 627854220
    //   3299: ixor
    //   3300: goto -> 3311
    //   3303: ldc2_w 917780874
    //   3306: l2i
    //   3307: ldc_w 1229814838
    //   3310: ixor
    //   3311: ldc2_w -969745450
    //   3314: l2i
    //   3315: ldc_w -1562166458
    //   3318: ixor
    //   3319: ixor
    //   3320: lookupswitch default -> 8966, 455648556 -> 3348, 1426959306 -> 3303
    //   3348: iload #6
    //   3350: caload
    //   3351: getstatic Perryc.0 : I
    //   3354: ifle -> 3368
    //   3357: ldc2_w 496370943
    //   3360: l2i
    //   3361: ldc_w -1710493478
    //   3364: ixor
    //   3365: goto -> 3376
    //   3368: ldc2_w 1116455065
    //   3371: l2i
    //   3372: ldc_w 929106943
    //   3375: ixor
    //   3376: ldc2_w 1131034305
    //   3379: l2i
    //   3380: ldc_w 645459317
    //   3383: ixor
    //   3384: ixor
    //   3385: lookupswitch default -> 8932, -493932655 -> 3368, 284692690 -> 3412
    //   3412: istore #7
    //   3414: getstatic Perryc.c : I
    //   3417: iflt -> 3431
    //   3420: ldc2_w 515652182
    //   3423: l2i
    //   3424: ldc_w -1866039696
    //   3427: ixor
    //   3428: goto -> 3439
    //   3431: ldc2_w -1988761515
    //   3434: l2i
    //   3435: ldc_w 615628355
    //   3438: ixor
    //   3439: ldc2_w -520751889
    //   3442: l2i
    //   3443: ldc_w -462098249
    //   3446: ixor
    //   3447: ixor
    //   3448: lookupswitch default -> 8848, -1963245442 -> 3431, -1455074738 -> 3476
    //   3476: iload_3
    //   3477: getstatic Perryc.0 : I
    //   3480: ifle -> 3494
    //   3483: ldc2_w -7881462
    //   3486: l2i
    //   3487: ldc_w -1221895752
    //   3490: ixor
    //   3491: goto -> 3502
    //   3494: ldc2_w 442584415
    //   3497: l2i
    //   3498: ldc_w -1633645001
    //   3501: ixor
    //   3502: ldc2_w 777110217
    //   3505: l2i
    //   3506: ldc_w -1988671206
    //   3509: ixor
    //   3510: ixor
    //   3511: lookupswitch default -> 3536, -1933126710 -> 3494, -276140191 -> 8882
    //   3536: iload #7
    //   3538: iadd
    //   3539: getstatic Perryc.1 : I
    //   3542: ifeq -> 3556
    //   3545: ldc2_w 1797096498
    //   3548: l2i
    //   3549: ldc_w -205441003
    //   3552: ixor
    //   3553: goto -> 3564
    //   3556: ldc2_w 1716612412
    //   3559: l2i
    //   3560: ldc_w 1772284486
    //   3563: ixor
    //   3564: ldc2_w 924006818
    //   3567: l2i
    //   3568: ldc_w -1601610333
    //   3571: ixor
    //   3572: ixor
    //   3573: lookupswitch default -> 8952, -1737890949 -> 3600, 256301094 -> 3556
    //   3600: istore_3
    //   3601: getstatic Perryc.0 : I
    //   3604: ifle -> 3618
    //   3607: ldc2_w 101068485
    //   3610: l2i
    //   3611: ldc_w -1332858630
    //   3614: ixor
    //   3615: goto -> 3626
    //   3618: ldc2_w -1530846101
    //   3621: l2i
    //   3622: ldc_w -1193011259
    //   3625: ixor
    //   3626: ldc2_w 1314899291
    //   3629: l2i
    //   3630: ldc_w 220929250
    //   3633: ixor
    //   3634: ixor
    //   3635: lookupswitch default -> 8822, -167983226 -> 3618, 1599203863 -> 3660
    //   3660: iload_3
    //   3661: ldc2_w 1099932254
    //   3664: l2i
    //   3665: ldc_w 1099932244
    //   3668: ixor
    //   3669: imul
    //   3670: getstatic Perryc.0 : I
    //   3673: ifle -> 3687
    //   3676: ldc2_w 786548793
    //   3679: l2i
    //   3680: ldc_w 1434511445
    //   3683: ixor
    //   3684: goto -> 3695
    //   3687: ldc2_w -1713598865
    //   3690: l2i
    //   3691: ldc_w -391258580
    //   3694: ixor
    //   3695: ldc2_w 2086946191
    //   3698: l2i
    //   3699: ldc_w -13968234
    //   3702: ixor
    //   3703: ixor
    //   3704: lookupswitch default -> 8874, -230700710 -> 3732, -131090059 -> 3687
    //   3732: istore_3
    //   3733: iinc #6, 1
    //   3736: goto -> 3042
    //   3739: getstatic Perryc.c : I
    //   3742: iflt -> 3756
    //   3745: ldc2_w 410017127
    //   3748: l2i
    //   3749: ldc_w -19002726
    //   3752: ixor
    //   3753: goto -> 3764
    //   3756: ldc2_w -1034702843
    //   3759: l2i
    //   3760: ldc_w 1527738027
    //   3763: ixor
    //   3764: ldc2_w -906899916
    //   3767: l2i
    //   3768: ldc_w 1623653048
    //   3771: ixor
    //   3772: ixor
    //   3773: lookupswitch default -> 3800, 120025100 -> 3756, 1335452529 -> 8854
    //   3800: getstatic bigname/zprestige/webhack/features/modules/Client/Notify.mc : Lnet/minecraft/client/Minecraft;
    //   3803: getstatic Perryc.1 : I
    //   3806: ifeq -> 3820
    //   3809: ldc2_w -1472463652
    //   3812: l2i
    //   3813: ldc_w -1331212103
    //   3816: ixor
    //   3817: goto -> 3828
    //   3820: ldc2_w 496424850
    //   3823: l2i
    //   3824: ldc_w -547205107
    //   3827: ixor
    //   3828: ldc2_w 709808627
    //   3831: l2i
    //   3832: ldc_w 725688149
    //   3835: ixor
    //   3836: ixor
    //   3837: lookupswitch default -> 3864, 429089475 -> 8802, 645576735 -> 3820
    //   3864: getfield field_71456_v : Lnet/minecraft/client/gui/GuiIngame;
    //   3867: getstatic Perryc.1 : I
    //   3870: ifeq -> 3884
    //   3873: ldc2_w 1830415518
    //   3876: l2i
    //   3877: ldc_w 1482014119
    //   3880: ixor
    //   3881: goto -> 3892
    //   3884: ldc2_w -1692162644
    //   3887: l2i
    //   3888: ldc_w 436630577
    //   3891: ixor
    //   3892: ldc2_w 1101262580
    //   3895: l2i
    //   3896: ldc_w -1594061279
    //   3899: ixor
    //   3900: ixor
    //   3901: lookupswitch default -> 3928, -736939540 -> 8772, 1851114492 -> 3884
    //   3928: goto -> 3932
    //   3931: athrow
    //   3932: invokevirtual func_146158_b : ()Lnet/minecraft/client/gui/GuiNewChat;
    //   3935: goto -> 3939
    //   3938: athrow
    //   3939: new net/minecraft/util/text/TextComponentString
    //   3942: dup
    //   3943: new java/lang/StringBuilder
    //   3946: dup
    //   3947: getstatic Perryc.0 : I
    //   3950: ifle -> 3964
    //   3953: ldc2_w -1426846402
    //   3956: l2i
    //   3957: ldc_w -1182003715
    //   3960: ixor
    //   3961: goto -> 3972
    //   3964: ldc2_w -1160011003
    //   3967: l2i
    //   3968: ldc_w 1737671525
    //   3971: ixor
    //   3972: ldc2_w -1574515853
    //   3975: l2i
    //   3976: ldc_w 2141865879
    //   3979: ixor
    //   3980: ixor
    //   3981: lookupswitch default -> 8816, -822834137 -> 3964, 12971140 -> 4008
    //   4008: goto -> 4012
    //   4011: athrow
    //   4012: invokespecial <init> : ()V
    //   4015: goto -> 4019
    //   4018: athrow
    //   4019: getstatic Perryc.1 : I
    //   4022: ifeq -> 4036
    //   4025: ldc2_w -597180882
    //   4028: l2i
    //   4029: ldc_w -619561214
    //   4032: ixor
    //   4033: goto -> 4044
    //   4036: ldc2_w 1701590122
    //   4039: l2i
    //   4040: ldc_w -233873234
    //   4043: ixor
    //   4044: ldc2_w 631573510
    //   4047: l2i
    //   4048: ldc_w 715526105
    //   4051: ixor
    //   4052: ixor
    //   4053: lookupswitch default -> 8944, -1738516709 -> 4080, 141984499 -> 4036
    //   4080: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   4083: getstatic Perryc.0 : I
    //   4086: ifle -> 4100
    //   4089: ldc2_w -1258539143
    //   4092: l2i
    //   4093: ldc_w -1698964837
    //   4096: ixor
    //   4097: goto -> 4108
    //   4100: ldc2_w 332080720
    //   4103: l2i
    //   4104: ldc_w 1417571093
    //   4107: ixor
    //   4108: ldc2_w 1764852929
    //   4111: l2i
    //   4112: ldc_w 116085469
    //   4115: ixor
    //   4116: ixor
    //   4117: lookupswitch default -> 8776, 678402905 -> 4144, 1100823550 -> 4100
    //   4144: goto -> 4148
    //   4147: athrow
    //   4148: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   4151: goto -> 4155
    //   4154: athrow
    //   4155: getstatic Perryc.1 : I
    //   4158: ifeq -> 4172
    //   4161: ldc2_w 1153696997
    //   4164: l2i
    //   4165: ldc_w 807910783
    //   4168: ixor
    //   4169: goto -> 4180
    //   4172: ldc2_w 2024046063
    //   4175: l2i
    //   4176: ldc_w -1274308007
    //   4179: ixor
    //   4180: ldc2_w 1407481603
    //   4183: l2i
    //   4184: ldc_w 1203257937
    //   4187: ixor
    //   4188: ixor
    //   4189: lookupswitch default -> 8902, -655109404 -> 4216, 1623166152 -> 4172
    //   4216: aload_1
    //   4217: getstatic Perryc.1 : I
    //   4220: ifeq -> 4234
    //   4223: ldc2_w -1513215793
    //   4226: l2i
    //   4227: ldc_w 1579684610
    //   4230: ixor
    //   4231: goto -> 4242
    //   4234: ldc2_w -459432742
    //   4237: l2i
    //   4238: ldc_w -1745487934
    //   4241: ixor
    //   4242: ldc2_w -1692247969
    //   4245: l2i
    //   4246: ldc_w -1887950058
    //   4249: ixor
    //   4250: ixor
    //   4251: lookupswitch default -> 4276, -1632219403 -> 4234, -272873340 -> 8810
    //   4276: goto -> 4280
    //   4279: athrow
    //   4280: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   4283: goto -> 4287
    //   4286: athrow
    //   4287: getstatic Perryc.1 : I
    //   4290: ifeq -> 4304
    //   4293: ldc2_w -2034003096
    //   4296: l2i
    //   4297: ldc_w -1541742585
    //   4300: ixor
    //   4301: goto -> 4312
    //   4304: ldc2_w 655798737
    //   4307: l2i
    //   4308: ldc_w 161530450
    //   4311: ixor
    //   4312: ldc2_w -1933462340
    //   4315: l2i
    //   4316: ldc_w -1924911123
    //   4319: ixor
    //   4320: ixor
    //   4321: lookupswitch default -> 4348, -1591857658 -> 4304, 593291326 -> 8780
    //   4348: goto -> 4352
    //   4351: athrow
    //   4352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4355: goto -> 4359
    //   4358: athrow
    //   4359: ldc_w 'ӧ㌃ӂ戚᝷๽祊'
    //   4362: getstatic Perryc.1 : I
    //   4365: ifeq -> 4379
    //   4368: ldc2_w -562334885
    //   4371: l2i
    //   4372: ldc_w 1416980034
    //   4375: ixor
    //   4376: goto -> 4387
    //   4379: ldc2_w -682972989
    //   4382: l2i
    //   4383: ldc_w -88154085
    //   4386: ixor
    //   4387: ldc2_w 737003864
    //   4390: l2i
    //   4391: ldc_w 2137050410
    //   4394: ixor
    //   4395: ixor
    //   4396: lookupswitch default -> 4424, -1512416252 -> 4379, -561835669 -> 8886
    //   4424: goto -> 4428
    //   4427: athrow
    //   4428: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   4431: goto -> 4435
    //   4434: athrow
    //   4435: getstatic Perryc.c : I
    //   4438: iflt -> 4452
    //   4441: ldc2_w 2097989540
    //   4444: l2i
    //   4445: ldc_w 392653504
    //   4448: ixor
    //   4449: goto -> 4460
    //   4452: ldc2_w -913969744
    //   4455: l2i
    //   4456: ldc_w -368720041
    //   4459: ixor
    //   4460: ldc2_w -744227234
    //   4463: l2i
    //   4464: ldc_w -130305591
    //   4467: ixor
    //   4468: ixor
    //   4469: lookupswitch default -> 4496, -155880902 -> 4452, 1106502387 -> 8850
    //   4496: goto -> 4500
    //   4499: athrow
    //   4500: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   4503: goto -> 4507
    //   4506: athrow
    //   4507: getstatic Perryc.c : I
    //   4510: iflt -> 4524
    //   4513: ldc2_w 1444920187
    //   4516: l2i
    //   4517: ldc_w 720100452
    //   4520: ixor
    //   4521: goto -> 4532
    //   4524: ldc2_w 67558631
    //   4527: l2i
    //   4528: ldc_w 487769448
    //   4531: ixor
    //   4532: ldc2_w 185799105
    //   4535: l2i
    //   4536: ldc_w 1950820341
    //   4539: ixor
    //   4540: ixor
    //   4541: lookupswitch default -> 4568, 60838187 -> 8834, 1871761919 -> 4524
    //   4568: getstatic com/mojang/realmsclient/gui/ChatFormatting.GREEN : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   4571: getstatic Perryc.1 : I
    //   4574: ifeq -> 4588
    //   4577: ldc2_w 1305762887
    //   4580: l2i
    //   4581: ldc_w -1816532234
    //   4584: ixor
    //   4585: goto -> 4596
    //   4588: ldc2_w -1144036453
    //   4591: l2i
    //   4592: ldc_w 1449173350
    //   4595: ixor
    //   4596: ldc2_w 1618027121
    //   4599: l2i
    //   4600: ldc_w 1102595204
    //   4603: ixor
    //   4604: ixor
    //   4605: lookupswitch default -> 4632, -5975996 -> 8908, 88108198 -> 4588
    //   4632: goto -> 4636
    //   4635: athrow
    //   4636: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   4639: goto -> 4643
    //   4642: athrow
    //   4643: getstatic Perryc.c : I
    //   4646: iflt -> 4660
    //   4649: ldc2_w -1118490061
    //   4652: l2i
    //   4653: ldc_w 84389217
    //   4656: ixor
    //   4657: goto -> 4668
    //   4660: ldc2_w -1765101373
    //   4663: l2i
    //   4664: ldc_w 1464609483
    //   4667: ixor
    //   4668: ldc2_w -1655000616
    //   4671: l2i
    //   4672: ldc_w 335851690
    //   4675: ixor
    //   4676: ixor
    //   4677: lookupswitch default -> 8864, 822910496 -> 4660, 1222155130 -> 4704
    //   4704: getstatic com/mojang/realmsclient/gui/ChatFormatting.BOLD : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   4707: getstatic Perryc.0 : I
    //   4710: ifle -> 4724
    //   4713: ldc2_w -1943076769
    //   4716: l2i
    //   4717: ldc_w 891076123
    //   4720: ixor
    //   4721: goto -> 4732
    //   4724: ldc2_w -1362408865
    //   4727: l2i
    //   4728: ldc_w -1692421093
    //   4731: ixor
    //   4732: ldc2_w -1484121209
    //   4735: l2i
    //   4736: ldc_w 1558849154
    //   4739: ixor
    //   4740: ixor
    //   4741: lookupswitch default -> 4768, 1059720776 -> 4724, 1112769345 -> 8924
    //   4768: goto -> 4772
    //   4771: athrow
    //   4772: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   4775: goto -> 4779
    //   4778: athrow
    //   4779: getstatic Perryc.0 : I
    //   4782: ifle -> 4796
    //   4785: ldc2_w 1171350165
    //   4788: l2i
    //   4789: ldc_w -2112077312
    //   4792: ixor
    //   4793: goto -> 4804
    //   4796: ldc2_w -2059789074
    //   4799: l2i
    //   4800: ldc_w 1225926428
    //   4803: ixor
    //   4804: ldc2_w 720097590
    //   4807: l2i
    //   4808: ldc_w -1761888369
    //   4811: ixor
    //   4812: ixor
    //   4813: lookupswitch default -> 8894, 1882742091 -> 4840, 2078098988 -> 4796
    //   4840: iload_2
    //   4841: getstatic Perryc.1 : I
    //   4844: ifeq -> 4858
    //   4847: ldc2_w 1851716302
    //   4850: l2i
    //   4851: ldc_w -159294274
    //   4854: ixor
    //   4855: goto -> 4866
    //   4858: ldc2_w -1600109958
    //   4861: l2i
    //   4862: ldc_w -1232495477
    //   4865: ixor
    //   4866: ldc2_w -723789077
    //   4869: l2i
    //   4870: ldc_w 1230567000
    //   4873: ixor
    //   4874: ixor
    //   4875: lookupswitch default -> 4900, -748819916 -> 4858, 89948867 -> 8942
    //   4900: goto -> 4904
    //   4903: athrow
    //   4904: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   4907: goto -> 4911
    //   4910: athrow
    //   4911: getstatic Perryc.0 : I
    //   4914: ifle -> 4928
    //   4917: ldc2_w 14665298
    //   4920: l2i
    //   4921: ldc_w -538125292
    //   4924: ixor
    //   4925: goto -> 4936
    //   4928: ldc2_w -1248898579
    //   4931: l2i
    //   4932: ldc_w 52210857
    //   4935: ixor
    //   4936: ldc2_w 1333682356
    //   4939: l2i
    //   4940: ldc_w 2060727045
    //   4943: ixor
    //   4944: ixor
    //   4945: lookupswitch default -> 8840, -2093371659 -> 4972, -359052809 -> 4928
    //   4972: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   4975: getstatic Perryc.c : I
    //   4978: iflt -> 4992
    //   4981: ldc2_w -2146291066
    //   4984: l2i
    //   4985: ldc_w 1453236136
    //   4988: ixor
    //   4989: goto -> 5000
    //   4992: ldc2_w -2055842444
    //   4995: l2i
    //   4996: ldc_w 351834219
    //   4999: ixor
    //   5000: ldc2_w 897395270
    //   5003: l2i
    //   5004: ldc_w 95762824
    //   5007: ixor
    //   5008: ixor
    //   5009: lookupswitch default -> 8920, -1589193007 -> 5036, -431702304 -> 4992
    //   5036: goto -> 5040
    //   5039: athrow
    //   5040: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   5043: goto -> 5047
    //   5046: athrow
    //   5047: ldc_w 'ӧ㌧ӂ戞ᝢุ'
    //   5050: getstatic Perryc.0 : I
    //   5053: ifle -> 5067
    //   5056: ldc2_w -1252867276
    //   5059: l2i
    //   5060: ldc_w -293780851
    //   5063: ixor
    //   5064: goto -> 5075
    //   5067: ldc2_w -902009139
    //   5070: l2i
    //   5071: ldc_w 1582276674
    //   5074: ixor
    //   5075: ldc2_w -1462849288
    //   5078: l2i
    //   5079: ldc_w -1317381129
    //   5082: ixor
    //   5083: ixor
    //   5084: lookupswitch default -> 5112, -25493936 -> 5067, 1117481654 -> 8980
    //   5112: goto -> 5116
    //   5115: athrow
    //   5116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   5119: goto -> 5123
    //   5122: athrow
    //   5123: getstatic Perryc.c : I
    //   5126: iflt -> 5140
    //   5129: ldc2_w 1783178734
    //   5132: l2i
    //   5133: ldc_w -774681512
    //   5136: ixor
    //   5137: goto -> 5148
    //   5140: ldc2_w 522349204
    //   5143: l2i
    //   5144: ldc_w -296758265
    //   5147: ixor
    //   5148: ldc2_w -1869328641
    //   5151: l2i
    //   5152: ldc_w -1497424222
    //   5155: ixor
    //   5156: ixor
    //   5157: lookupswitch default -> 5184, -1917765141 -> 8964, -1152368918 -> 5140
    //   5184: goto -> 5188
    //   5187: athrow
    //   5188: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   5191: goto -> 5195
    //   5194: athrow
    //   5195: getstatic Perryc.c : I
    //   5198: iflt -> 5212
    //   5201: ldc2_w -1204044967
    //   5204: l2i
    //   5205: ldc_w 1263761577
    //   5208: ixor
    //   5209: goto -> 5220
    //   5212: ldc2_w 1865697396
    //   5215: l2i
    //   5216: ldc_w 1215156182
    //   5219: ixor
    //   5220: ldc2_w -2020816839
    //   5223: l2i
    //   5224: ldc_w -342963530
    //   5227: ixor
    //   5228: ixor
    //   5229: lookupswitch default -> 5256, -1620393601 -> 8788, 1436591455 -> 5212
    //   5256: goto -> 5260
    //   5259: athrow
    //   5260: invokevirtual toString : ()Ljava/lang/String;
    //   5263: goto -> 5267
    //   5266: athrow
    //   5267: getstatic Perryc.0 : I
    //   5270: ifle -> 5284
    //   5273: ldc2_w 297972630
    //   5276: l2i
    //   5277: ldc_w 1926335831
    //   5280: ixor
    //   5281: goto -> 5292
    //   5284: ldc2_w 1168104149
    //   5287: l2i
    //   5288: ldc_w -742913887
    //   5291: ixor
    //   5292: ldc2_w 999108276
    //   5295: l2i
    //   5296: ldc_w 177827669
    //   5299: ixor
    //   5300: ixor
    //   5301: lookupswitch default -> 8858, -1489792107 -> 5328, 1376223008 -> 5284
    //   5328: goto -> 5332
    //   5331: athrow
    //   5332: invokespecial <init> : (Ljava/lang/String;)V
    //   5335: goto -> 5339
    //   5338: athrow
    //   5339: getstatic Perryc.1 : I
    //   5342: ifeq -> 5356
    //   5345: ldc2_w 1101892730
    //   5348: l2i
    //   5349: ldc_w 1249687296
    //   5352: ixor
    //   5353: goto -> 5364
    //   5356: ldc2_w 592386776
    //   5359: l2i
    //   5360: ldc_w 819473633
    //   5363: ixor
    //   5364: ldc2_w -1133653346
    //   5367: l2i
    //   5368: ldc_w 110348560
    //   5371: ixor
    //   5372: ixor
    //   5373: lookupswitch default -> 8884, -1452724809 -> 5400, -1322311436 -> 5356
    //   5400: iload_3
    //   5401: getstatic Perryc.1 : I
    //   5404: ifeq -> 5418
    //   5407: ldc2_w 2138879487
    //   5410: l2i
    //   5411: ldc_w 1407967536
    //   5414: ixor
    //   5415: goto -> 5426
    //   5418: ldc2_w -929495032
    //   5421: l2i
    //   5422: ldc_w 234468412
    //   5425: ixor
    //   5426: ldc2_w 908107364
    //   5429: l2i
    //   5430: ldc_w 1395271289
    //   5433: ixor
    //   5434: ixor
    //   5435: lookupswitch default -> 5460, 1235086546 -> 8824, 1955606049 -> 5418
    //   5460: goto -> 5464
    //   5463: athrow
    //   5464: invokevirtual func_146234_a : (Lnet/minecraft/util/text/ITextComponent;I)V
    //   5467: goto -> 5471
    //   5470: athrow
    //   5471: goto -> 8763
    //   5474: getstatic Perryc.c : I
    //   5477: iflt -> 5491
    //   5480: ldc2_w 152522046
    //   5483: l2i
    //   5484: ldc_w -277837398
    //   5487: ixor
    //   5488: goto -> 5499
    //   5491: ldc2_w -304052241
    //   5494: l2i
    //   5495: ldc_w -589018503
    //   5498: ixor
    //   5499: ldc2_w -1820012192
    //   5502: l2i
    //   5503: ldc_w -171689127
    //   5506: ixor
    //   5507: ixor
    //   5508: lookupswitch default -> 8764, -2144915795 -> 5491, 1464084399 -> 5536
    //   5536: aload_0
    //   5537: getstatic Perryc.0 : I
    //   5540: ifle -> 5554
    //   5543: ldc2_w -398801610
    //   5546: l2i
    //   5547: ldc_w 898106284
    //   5550: ixor
    //   5551: goto -> 5562
    //   5554: ldc2_w 53121746
    //   5557: l2i
    //   5558: ldc_w -1996433863
    //   5561: ixor
    //   5562: ldc2_w -246851952
    //   5565: l2i
    //   5566: ldc_w -955653632
    //   5569: ixor
    //   5570: ixor
    //   5571: lookupswitch default -> 5596, -336432630 -> 8984, 1798448936 -> 5554
    //   5596: getfield popCounter : Lbigname/zprestige/webhack/features/setting/Setting;
    //   5599: getstatic Perryc.c : I
    //   5602: iflt -> 5616
    //   5605: ldc2_w 538706940
    //   5608: l2i
    //   5609: ldc_w -560026454
    //   5612: ixor
    //   5613: goto -> 5624
    //   5616: ldc2_w 1054132339
    //   5619: l2i
    //   5620: ldc_w -1355739248
    //   5623: ixor
    //   5624: ldc2_w -1561182616
    //   5627: l2i
    //   5628: ldc_w -595067249
    //   5631: ixor
    //   5632: ixor
    //   5633: lookupswitch default -> 5660, -2131267663 -> 8958, 690224423 -> 5616
    //   5660: goto -> 5664
    //   5663: athrow
    //   5664: invokevirtual getValue : ()Ljava/lang/Object;
    //   5667: goto -> 5671
    //   5670: athrow
    //   5671: checkcast java/lang/Boolean
    //   5674: getstatic Perryc.1 : I
    //   5677: ifeq -> 5691
    //   5680: ldc2_w -42929857
    //   5683: l2i
    //   5684: ldc_w -1509567718
    //   5687: ixor
    //   5688: goto -> 5699
    //   5691: ldc2_w 419602763
    //   5694: l2i
    //   5695: ldc_w -122105710
    //   5698: ixor
    //   5699: ldc2_w -1003691920
    //   5702: l2i
    //   5703: ldc_w 2145876910
    //   5706: ixor
    //   5707: ixor
    //   5708: lookupswitch default -> 5736, -1099664471 -> 5691, -524371461 -> 8790
    //   5736: goto -> 5740
    //   5739: athrow
    //   5740: invokevirtual booleanValue : ()Z
    //   5743: goto -> 5747
    //   5746: athrow
    //   5747: ifeq -> 5761
    //   5750: ldc2_w -1971814196
    //   5753: l2i
    //   5754: ldc_w -862455420
    //   5757: ixor
    //   5758: goto -> 5769
    //   5761: ldc2_w 900276447
    //   5764: l2i
    //   5765: ldc_w 1933990288
    //   5768: ixor
    //   5769: ldc2_w 2030216967
    //   5772: l2i
    //   5773: ldc_w -156039324
    //   5776: ixor
    //   5777: ixor
    //   5778: tableswitch default -> 5750, -916530901 -> 5800, -916530900 -> 8763
    //   5800: ldc2_w -1967577226
    //   5803: l2i
    //   5804: ldc_w -1967577226
    //   5807: ixor
    //   5808: getstatic Perryc.1 : I
    //   5811: ifeq -> 5825
    //   5814: ldc2_w -1240181614
    //   5817: l2i
    //   5818: ldc_w 728182512
    //   5821: ixor
    //   5822: goto -> 5833
    //   5825: ldc2_w -1162210614
    //   5828: l2i
    //   5829: ldc_w -1658457651
    //   5832: ixor
    //   5833: ldc2_w -38360152
    //   5836: l2i
    //   5837: ldc_w 1168987276
    //   5840: ixor
    //   5841: ixor
    //   5842: lookupswitch default -> 5868, 627606854 -> 8960, 1857404579 -> 5825
    //   5868: istore_3
    //   5869: getstatic Perryc.1 : I
    //   5872: ifeq -> 5886
    //   5875: ldc2_w 969911033
    //   5878: l2i
    //   5879: ldc_w 401114921
    //   5882: ixor
    //   5883: goto -> 5894
    //   5886: ldc2_w 976246933
    //   5889: l2i
    //   5890: ldc_w -575282819
    //   5893: ixor
    //   5894: ldc2_w 1745015527
    //   5897: l2i
    //   5898: ldc_w 1514270592
    //   5901: ixor
    //   5902: ixor
    //   5903: lookupswitch default -> 5928, 464304118 -> 5886, 476319927 -> 8954
    //   5928: aload_1
    //   5929: getstatic Perryc.c : I
    //   5932: iflt -> 5946
    //   5935: ldc2_w 1277390500
    //   5938: l2i
    //   5939: ldc_w 583316647
    //   5942: ixor
    //   5943: goto -> 5954
    //   5946: ldc2_w 344957288
    //   5949: l2i
    //   5950: ldc_w -107591988
    //   5953: ixor
    //   5954: ldc2_w 69787800
    //   5957: l2i
    //   5958: ldc_w -1066001540
    //   5961: ixor
    //   5962: ixor
    //   5963: lookupswitch default -> 5988, -1430707737 -> 9004, 668693591 -> 5946
    //   5988: goto -> 5992
    //   5991: athrow
    //   5992: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   5995: goto -> 5999
    //   5998: athrow
    //   5999: getstatic Perryc.c : I
    //   6002: iflt -> 6016
    //   6005: ldc2_w -116394962
    //   6008: l2i
    //   6009: ldc_w 1462732017
    //   6012: ixor
    //   6013: goto -> 6024
    //   6016: ldc2_w -271775889
    //   6019: l2i
    //   6020: ldc_w -727005595
    //   6023: ixor
    //   6024: ldc2_w -1631220554
    //   6027: l2i
    //   6028: ldc_w 1249814866
    //   6031: ixor
    //   6032: ixor
    //   6033: lookupswitch default -> 6060, 1065806361 -> 6016, 2057000251 -> 8876
    //   6060: goto -> 6064
    //   6063: athrow
    //   6064: invokevirtual toCharArray : ()[C
    //   6067: goto -> 6071
    //   6070: athrow
    //   6071: getstatic Perryc.c : I
    //   6074: iflt -> 6088
    //   6077: ldc2_w -658592822
    //   6080: l2i
    //   6081: ldc_w 1460162432
    //   6084: ixor
    //   6085: goto -> 6096
    //   6088: ldc2_w 425734815
    //   6091: l2i
    //   6092: ldc_w -200307534
    //   6095: ixor
    //   6096: ldc2_w 1682738775
    //   6099: l2i
    //   6100: ldc_w -1114669965
    //   6103: ixor
    //   6104: ixor
    //   6105: lookupswitch default -> 6132, 1006474030 -> 6088, 1450514030 -> 8808
    //   6132: astore #4
    //   6134: getstatic Perryc.0 : I
    //   6137: ifle -> 6151
    //   6140: ldc2_w 1708895265
    //   6143: l2i
    //   6144: ldc_w 1236945437
    //   6147: ixor
    //   6148: goto -> 6159
    //   6151: ldc2_w 1720196632
    //   6154: l2i
    //   6155: ldc_w -817416658
    //   6158: ixor
    //   6159: ldc2_w -1661801093
    //   6162: l2i
    //   6163: ldc_w 1945958514
    //   6166: ixor
    //   6167: ixor
    //   6168: lookupswitch default -> 6196, -1016073419 -> 8946, 1473473064 -> 6151
    //   6196: aload #4
    //   6198: arraylength
    //   6199: getstatic Perryc.0 : I
    //   6202: ifle -> 6216
    //   6205: ldc2_w -419844630
    //   6208: l2i
    //   6209: ldc_w 173737334
    //   6212: ixor
    //   6213: goto -> 6224
    //   6216: ldc2_w -712274978
    //   6219: l2i
    //   6220: ldc_w -1219699690
    //   6223: ixor
    //   6224: ldc2_w -1261996711
    //   6227: l2i
    //   6228: ldc_w 2002026015
    //   6231: ixor
    //   6232: ixor
    //   6233: lookupswitch default -> 8922, -1588306802 -> 6260, 791782362 -> 6216
    //   6260: istore #5
    //   6262: ldc2_w 1678980007
    //   6265: l2i
    //   6266: ldc_w 1678980007
    //   6269: ixor
    //   6270: getstatic Perryc.0 : I
    //   6273: ifle -> 6287
    //   6276: ldc2_w 1051446790
    //   6279: l2i
    //   6280: ldc_w -1092487486
    //   6283: ixor
    //   6284: goto -> 6295
    //   6287: ldc2_w -1022179675
    //   6290: l2i
    //   6291: ldc_w 1492281082
    //   6294: ixor
    //   6295: ldc2_w 1446136523
    //   6298: l2i
    //   6299: ldc_w -1202044953
    //   6302: ixor
    //   6303: ixor
    //   6304: lookupswitch default -> 6332, 1847741928 -> 8962, 1956733146 -> 6287
    //   6332: istore #6
    //   6334: getstatic Perryc.0 : I
    //   6337: ifle -> 6351
    //   6340: ldc2_w -236341705
    //   6343: l2i
    //   6344: ldc_w -1195937909
    //   6347: ixor
    //   6348: goto -> 6359
    //   6351: ldc2_w -2141969197
    //   6354: l2i
    //   6355: ldc_w 1056646997
    //   6358: ixor
    //   6359: ldc2_w 109439436
    //   6362: l2i
    //   6363: ldc_w -1348236284
    //   6366: ixor
    //   6367: ixor
    //   6368: lookupswitch default -> 8906, -528958348 -> 6351, 394880590 -> 6396
    //   6396: iload #6
    //   6398: getstatic Perryc.1 : I
    //   6401: ifeq -> 6415
    //   6404: ldc2_w -1414638959
    //   6407: l2i
    //   6408: ldc_w -1205150062
    //   6411: ixor
    //   6412: goto -> 6423
    //   6415: ldc2_w 1533818486
    //   6418: l2i
    //   6419: ldc_w -1274825122
    //   6422: ixor
    //   6423: ldc2_w -1615330484
    //   6426: l2i
    //   6427: ldc_w -1316477418
    //   6430: ixor
    //   6431: ixor
    //   6432: lookupswitch default -> 8928, -1050696334 -> 6460, 1035250009 -> 6415
    //   6460: iload #5
    //   6462: if_icmpge -> 6476
    //   6465: ldc2_w 375087352
    //   6468: l2i
    //   6469: ldc_w -1623810972
    //   6472: ixor
    //   6473: goto -> 6484
    //   6476: ldc2_w -65082893
    //   6479: l2i
    //   6480: ldc_w 1970476398
    //   6483: ixor
    //   6484: ldc2_w 1679305905
    //   6487: l2i
    //   6488: ldc_w -209177557
    //   6491: ixor
    //   6492: ixor
    //   6493: tableswitch default -> 6465, 519955462 -> 6516, 519955463 -> 7031
    //   6516: getstatic Perryc.c : I
    //   6519: iflt -> 6533
    //   6522: ldc2_w 1699533713
    //   6525: l2i
    //   6526: ldc_w 1287258517
    //   6529: ixor
    //   6530: goto -> 6541
    //   6533: ldc2_w 184522996
    //   6536: l2i
    //   6537: ldc_w 1082115564
    //   6540: ixor
    //   6541: ldc2_w -1792297742
    //   6544: l2i
    //   6545: ldc_w 1976998418
    //   6548: ixor
    //   6549: ixor
    //   6550: lookupswitch default -> 6576, -1089777798 -> 6533, -921961244 -> 9006
    //   6576: aload #4
    //   6578: getstatic Perryc.0 : I
    //   6581: ifle -> 6595
    //   6584: ldc2_w 2079585232
    //   6587: l2i
    //   6588: ldc_w 1102890006
    //   6591: ixor
    //   6592: goto -> 6603
    //   6595: ldc2_w -1748219146
    //   6598: l2i
    //   6599: ldc_w -614023465
    //   6602: ixor
    //   6603: ldc2_w -1679353427
    //   6606: l2i
    //   6607: ldc_w 968815036
    //   6610: ixor
    //   6611: ixor
    //   6612: lookupswitch default -> 8814, -1743331369 -> 6595, -286057424 -> 6640
    //   6640: iload #6
    //   6642: caload
    //   6643: getstatic Perryc.0 : I
    //   6646: ifle -> 6660
    //   6649: ldc2_w -945178317
    //   6652: l2i
    //   6653: ldc_w -1833530020
    //   6656: ixor
    //   6657: goto -> 6668
    //   6660: ldc2_w -1406946934
    //   6663: l2i
    //   6664: ldc_w 1971061342
    //   6667: ixor
    //   6668: ldc2_w 1390958703
    //   6671: l2i
    //   6672: ldc_w 290618221
    //   6675: ixor
    //   6676: ixor
    //   6677: lookupswitch default -> 8872, -1696231210 -> 6704, 379918189 -> 6660
    //   6704: istore #7
    //   6706: getstatic Perryc.0 : I
    //   6709: ifle -> 6723
    //   6712: ldc2_w 1284960955
    //   6715: l2i
    //   6716: ldc_w 1632653376
    //   6719: ixor
    //   6720: goto -> 6731
    //   6723: ldc2_w -1001262593
    //   6726: l2i
    //   6727: ldc_w 608574283
    //   6730: ixor
    //   6731: ldc2_w 2042856953
    //   6734: l2i
    //   6735: ldc_w -1717862278
    //   6738: ixor
    //   6739: ixor
    //   6740: lookupswitch default -> 6768, -845240456 -> 8852, 494945829 -> 6723
    //   6768: iload_3
    //   6769: getstatic Perryc.0 : I
    //   6772: ifle -> 6786
    //   6775: ldc2_w -1921488827
    //   6778: l2i
    //   6779: ldc_w -1988021680
    //   6782: ixor
    //   6783: goto -> 6794
    //   6786: ldc2_w -145080726
    //   6789: l2i
    //   6790: ldc_w -1704706045
    //   6793: ixor
    //   6794: ldc2_w -1292778998
    //   6797: l2i
    //   6798: ldc_w 769471711
    //   6801: ixor
    //   6802: ixor
    //   6803: lookupswitch default -> 8986, -1680495424 -> 6786, -233666372 -> 6828
    //   6828: iload #7
    //   6830: iadd
    //   6831: getstatic Perryc.1 : I
    //   6834: ifeq -> 6848
    //   6837: ldc2_w -280988496
    //   6840: l2i
    //   6841: ldc_w -1127064892
    //   6844: ixor
    //   6845: goto -> 6856
    //   6848: ldc2_w -1126408698
    //   6851: l2i
    //   6852: ldc_w 41964411
    //   6855: ixor
    //   6856: ldc2_w -822004679
    //   6859: l2i
    //   6860: ldc_w -591869719
    //   6863: ixor
    //   6864: ixor
    //   6865: lookupswitch default -> 6892, 695970224 -> 6848, 1076613796 -> 8830
    //   6892: istore_3
    //   6893: getstatic Perryc.0 : I
    //   6896: ifle -> 6910
    //   6899: ldc2_w -994350864
    //   6902: l2i
    //   6903: ldc_w 1708673914
    //   6906: ixor
    //   6907: goto -> 6918
    //   6910: ldc2_w 734015815
    //   6913: l2i
    //   6914: ldc_w 1994098490
    //   6917: ixor
    //   6918: ldc2_w -1647625900
    //   6921: l2i
    //   6922: ldc_w -466338021
    //   6925: ixor
    //   6926: ixor
    //   6927: lookupswitch default -> 6952, -660855355 -> 8914, -647148794 -> 6910
    //   6952: iload_3
    //   6953: ldc2_w -691596189
    //   6956: l2i
    //   6957: ldc_w -691596183
    //   6960: ixor
    //   6961: imul
    //   6962: getstatic Perryc.1 : I
    //   6965: ifeq -> 6979
    //   6968: ldc2_w 1917302770
    //   6971: l2i
    //   6972: ldc_w -261756707
    //   6975: ixor
    //   6976: goto -> 6987
    //   6979: ldc2_w -927750891
    //   6982: l2i
    //   6983: ldc_w -1619048798
    //   6986: ixor
    //   6987: ldc2_w 1867522157
    //   6990: l2i
    //   6991: ldc_w 1345843889
    //   6994: ixor
    //   6995: ixor
    //   6996: lookupswitch default -> 8806, -1119515149 -> 6979, 1756049771 -> 7024
    //   7024: istore_3
    //   7025: iinc #6, 1
    //   7028: goto -> 6334
    //   7031: getstatic Perryc.c : I
    //   7034: iflt -> 7048
    //   7037: ldc2_w -1909918979
    //   7040: l2i
    //   7041: ldc_w -1489155630
    //   7044: ixor
    //   7045: goto -> 7056
    //   7048: ldc2_w -999719030
    //   7051: l2i
    //   7052: ldc_w -1246309470
    //   7055: ixor
    //   7056: ldc2_w 1361414514
    //   7059: l2i
    //   7060: ldc_w -1691525491
    //   7063: ixor
    //   7064: ixor
    //   7065: lookupswitch default -> 7092, -1470077270 -> 7048, -484610864 -> 8860
    //   7092: getstatic bigname/zprestige/webhack/features/modules/Client/Notify.mc : Lnet/minecraft/client/Minecraft;
    //   7095: getstatic Perryc.c : I
    //   7098: iflt -> 7112
    //   7101: ldc2_w -1355651495
    //   7104: l2i
    //   7105: ldc_w -1590436863
    //   7108: ixor
    //   7109: goto -> 7120
    //   7112: ldc2_w -488966223
    //   7115: l2i
    //   7116: ldc_w 1578273260
    //   7119: ixor
    //   7120: ldc2_w 687699157
    //   7123: l2i
    //   7124: ldc_w 942367134
    //   7127: ixor
    //   7128: ixor
    //   7129: lookupswitch default -> 8768, -1407292650 -> 7156, 517451539 -> 7112
    //   7156: getfield field_71456_v : Lnet/minecraft/client/gui/GuiIngame;
    //   7159: getstatic Perryc.0 : I
    //   7162: ifle -> 7176
    //   7165: ldc2_w -1936397588
    //   7168: l2i
    //   7169: ldc_w -438643248
    //   7172: ixor
    //   7173: goto -> 7184
    //   7176: ldc2_w 893880303
    //   7179: l2i
    //   7180: ldc_w -1096666926
    //   7183: ixor
    //   7184: ldc2_w 1681598632
    //   7187: l2i
    //   7188: ldc_w 970475746
    //   7191: ixor
    //   7192: ixor
    //   7193: lookupswitch default -> 8826, -704194697 -> 7220, 883777398 -> 7176
    //   7220: goto -> 7224
    //   7223: athrow
    //   7224: invokevirtual func_146158_b : ()Lnet/minecraft/client/gui/GuiNewChat;
    //   7227: goto -> 7231
    //   7230: athrow
    //   7231: new net/minecraft/util/text/TextComponentString
    //   7234: dup
    //   7235: new java/lang/StringBuilder
    //   7238: dup
    //   7239: getstatic Perryc.1 : I
    //   7242: ifeq -> 7256
    //   7245: ldc2_w 843996789
    //   7248: l2i
    //   7249: ldc_w -1494015939
    //   7252: ixor
    //   7253: goto -> 7264
    //   7256: ldc2_w 97907793
    //   7259: l2i
    //   7260: ldc_w 761719010
    //   7263: ixor
    //   7264: ldc2_w -1096537822
    //   7267: l2i
    //   7268: ldc_w 413513541
    //   7271: ixor
    //   7272: ixor
    //   7273: lookupswitch default -> 8982, -1900903724 -> 7300, 851238959 -> 7256
    //   7300: goto -> 7304
    //   7303: athrow
    //   7304: invokespecial <init> : ()V
    //   7307: goto -> 7311
    //   7310: athrow
    //   7311: getstatic Perryc.c : I
    //   7314: iflt -> 7328
    //   7317: ldc2_w 1123030697
    //   7320: l2i
    //   7321: ldc_w 2008319551
    //   7324: ixor
    //   7325: goto -> 7336
    //   7328: ldc2_w -981018758
    //   7331: l2i
    //   7332: ldc_w -1362435074
    //   7335: ixor
    //   7336: ldc2_w -218179755
    //   7339: l2i
    //   7340: ldc_w 27283250
    //   7343: ixor
    //   7344: ixor
    //   7345: lookupswitch default -> 8838, -1743606557 -> 7372, -971372303 -> 7328
    //   7372: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   7375: getstatic Perryc.1 : I
    //   7378: ifeq -> 7392
    //   7381: ldc2_w -215372282
    //   7384: l2i
    //   7385: ldc_w -2131699897
    //   7388: ixor
    //   7389: goto -> 7400
    //   7392: ldc2_w -1631278103
    //   7395: l2i
    //   7396: ldc_w 1211817546
    //   7399: ixor
    //   7400: ldc2_w 1281917028
    //   7403: l2i
    //   7404: ldc_w 375835719
    //   7407: ixor
    //   7408: ixor
    //   7409: lookupswitch default -> 7436, 701969762 -> 8926, 1569281220 -> 7392
    //   7436: goto -> 7440
    //   7439: athrow
    //   7440: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   7443: goto -> 7447
    //   7446: athrow
    //   7447: getstatic Perryc.0 : I
    //   7450: ifle -> 7464
    //   7453: ldc2_w 260371318
    //   7456: l2i
    //   7457: ldc_w 1629315373
    //   7460: ixor
    //   7461: goto -> 7472
    //   7464: ldc2_w -1404970665
    //   7467: l2i
    //   7468: ldc_w -419534436
    //   7471: ixor
    //   7472: ldc2_w -1747414156
    //   7475: l2i
    //   7476: ldc_w 1276256832
    //   7479: ixor
    //   7480: ixor
    //   7481: lookupswitch default -> 8888, -1854602753 -> 7508, -1252842641 -> 7464
    //   7508: aload_1
    //   7509: getstatic Perryc.0 : I
    //   7512: ifle -> 7526
    //   7515: ldc2_w 635745503
    //   7518: l2i
    //   7519: ldc_w 1491147397
    //   7522: ixor
    //   7523: goto -> 7534
    //   7526: ldc2_w -1991038379
    //   7529: l2i
    //   7530: ldc_w -894400979
    //   7533: ixor
    //   7534: ldc2_w -1514619576
    //   7537: l2i
    //   7538: ldc_w -597050876
    //   7541: ixor
    //   7542: ixor
    //   7543: lookupswitch default -> 9002, 81045782 -> 7526, 976399156 -> 7568
    //   7568: goto -> 7572
    //   7571: athrow
    //   7572: invokevirtual func_70005_c_ : ()Ljava/lang/String;
    //   7575: goto -> 7579
    //   7578: athrow
    //   7579: getstatic Perryc.0 : I
    //   7582: ifle -> 7596
    //   7585: ldc2_w -189170287
    //   7588: l2i
    //   7589: ldc_w -557566651
    //   7592: ixor
    //   7593: goto -> 7604
    //   7596: ldc2_w -937767095
    //   7599: l2i
    //   7600: ldc_w 1655785111
    //   7603: ixor
    //   7604: ldc2_w -1546223087
    //   7607: l2i
    //   7608: ldc_w 715496336
    //   7611: ixor
    //   7612: ixor
    //   7613: lookupswitch default -> 8812, -1559342763 -> 7596, 601395295 -> 7640
    //   7640: goto -> 7644
    //   7643: athrow
    //   7644: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7647: goto -> 7651
    //   7650: athrow
    //   7651: ldc_w 'ӧ㌃ӂ戚᝷๽祊'
    //   7654: getstatic Perryc.1 : I
    //   7657: ifeq -> 7671
    //   7660: ldc2_w -747971932
    //   7663: l2i
    //   7664: ldc_w 1669279867
    //   7667: ixor
    //   7668: goto -> 7679
    //   7671: ldc2_w -1616474193
    //   7674: l2i
    //   7675: ldc_w -392840484
    //   7678: ixor
    //   7679: ldc2_w 564067126
    //   7682: l2i
    //   7683: ldc_w 2127554475
    //   7686: ixor
    //   7687: ixor
    //   7688: lookupswitch default -> 8836, -280693182 -> 7671, 677521902 -> 7716
    //   7716: goto -> 7720
    //   7719: athrow
    //   7720: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   7723: goto -> 7727
    //   7726: athrow
    //   7727: getstatic Perryc.1 : I
    //   7730: ifeq -> 7744
    //   7733: ldc2_w 415589210
    //   7736: l2i
    //   7737: ldc_w 2058283284
    //   7740: ixor
    //   7741: goto -> 7752
    //   7744: ldc2_w 1226541964
    //   7747: l2i
    //   7748: ldc_w 1384156108
    //   7751: ixor
    //   7752: ldc2_w 1501850324
    //   7755: l2i
    //   7756: ldc_w 1842480223
    //   7759: ixor
    //   7760: ixor
    //   7761: lookupswitch default -> 8844, 801992395 -> 7788, 1446896837 -> 7744
    //   7788: goto -> 7792
    //   7791: athrow
    //   7792: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   7795: goto -> 7799
    //   7798: athrow
    //   7799: getstatic Perryc.0 : I
    //   7802: ifle -> 7816
    //   7805: ldc2_w 899433636
    //   7808: l2i
    //   7809: ldc_w 704247349
    //   7812: ixor
    //   7813: goto -> 7824
    //   7816: ldc2_w 969753100
    //   7819: l2i
    //   7820: ldc_w -1007363289
    //   7823: ixor
    //   7824: ldc2_w 1647375672
    //   7827: l2i
    //   7828: ldc_w -1738985839
    //   7831: ixor
    //   7832: ixor
    //   7833: lookupswitch default -> 8930, -435394248 -> 7816, 5259906 -> 7860
    //   7860: getstatic com/mojang/realmsclient/gui/ChatFormatting.GREEN : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   7863: getstatic Perryc.c : I
    //   7866: iflt -> 7880
    //   7869: ldc2_w 1449658543
    //   7872: l2i
    //   7873: ldc_w -736263230
    //   7876: ixor
    //   7877: goto -> 7888
    //   7880: ldc2_w -1601250827
    //   7883: l2i
    //   7884: ldc_w 1232544516
    //   7887: ixor
    //   7888: ldc2_w -938576522
    //   7891: l2i
    //   7892: ldc_w -60967385
    //   7895: ixor
    //   7896: ixor
    //   7897: lookupswitch default -> 7924, -1239005124 -> 8912, 1907806199 -> 7880
    //   7924: goto -> 7928
    //   7927: athrow
    //   7928: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   7931: goto -> 7935
    //   7934: athrow
    //   7935: getstatic Perryc.c : I
    //   7938: iflt -> 7952
    //   7941: ldc2_w -1539637281
    //   7944: l2i
    //   7945: ldc_w 744869039
    //   7948: ixor
    //   7949: goto -> 7960
    //   7952: ldc2_w 1832091648
    //   7955: l2i
    //   7956: ldc_w -1662865975
    //   7959: ixor
    //   7960: ldc2_w -1226637373
    //   7963: l2i
    //   7964: ldc_w 1553335449
    //   7967: ixor
    //   7968: ixor
    //   7969: lookupswitch default -> 7996, -289437610 -> 7952, 1647036458 -> 8976
    //   7996: getstatic com/mojang/realmsclient/gui/ChatFormatting.BOLD : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   7999: getstatic Perryc.0 : I
    //   8002: ifle -> 8016
    //   8005: ldc2_w -38402850
    //   8008: l2i
    //   8009: ldc_w -865542105
    //   8012: ixor
    //   8013: goto -> 8024
    //   8016: ldc2_w -145322321
    //   8019: l2i
    //   8020: ldc_w 199289504
    //   8023: ixor
    //   8024: ldc2_w 1490070091
    //   8027: l2i
    //   8028: ldc_w -2108562232
    //   8031: ixor
    //   8032: ixor
    //   8033: lookupswitch default -> 8060, -346051974 -> 8846, 321113828 -> 8016
    //   8060: goto -> 8064
    //   8063: athrow
    //   8064: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   8067: goto -> 8071
    //   8070: athrow
    //   8071: getstatic Perryc.c : I
    //   8074: iflt -> 8088
    //   8077: ldc2_w 446296361
    //   8080: l2i
    //   8081: ldc_w 976124802
    //   8084: ixor
    //   8085: goto -> 8096
    //   8088: ldc2_w 1001215854
    //   8091: l2i
    //   8092: ldc_w -370526247
    //   8095: ixor
    //   8096: ldc2_w 1789989229
    //   8099: l2i
    //   8100: ldc_w -1977062363
    //   8103: ixor
    //   8104: ixor
    //   8105: lookupswitch default -> 8132, -1070663709 -> 8800, 786654658 -> 8088
    //   8132: iload_2
    //   8133: getstatic Perryc.c : I
    //   8136: iflt -> 8150
    //   8139: ldc2_w -491775116
    //   8142: l2i
    //   8143: ldc_w -2065519316
    //   8146: ixor
    //   8147: goto -> 8158
    //   8150: ldc2_w 180503822
    //   8153: l2i
    //   8154: ldc_w 1839357657
    //   8157: ixor
    //   8158: ldc2_w 452802598
    //   8161: l2i
    //   8162: ldc_w -2086338748
    //   8165: ixor
    //   8166: ixor
    //   8167: lookupswitch default -> 8192, -16027334 -> 8972, 1174859826 -> 8150
    //   8192: goto -> 8196
    //   8195: athrow
    //   8196: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   8199: goto -> 8203
    //   8202: athrow
    //   8203: getstatic Perryc.1 : I
    //   8206: ifeq -> 8220
    //   8209: ldc2_w 17067994
    //   8212: l2i
    //   8213: ldc_w -1530528761
    //   8216: ixor
    //   8217: goto -> 8228
    //   8220: ldc2_w 1520657404
    //   8223: l2i
    //   8224: ldc_w -993630270
    //   8227: ixor
    //   8228: ldc2_w -663682705
    //   8231: l2i
    //   8232: ldc_w 1501906368
    //   8235: ixor
    //   8236: ixor
    //   8237: lookupswitch default -> 8264, -1918358478 -> 8220, 607508338 -> 8766
    //   8264: getstatic com/mojang/realmsclient/gui/ChatFormatting.RED : Lcom/mojang/realmsclient/gui/ChatFormatting;
    //   8267: getstatic Perryc.1 : I
    //   8270: ifeq -> 8284
    //   8273: ldc2_w 166689367
    //   8276: l2i
    //   8277: ldc_w -1309668687
    //   8280: ixor
    //   8281: goto -> 8292
    //   8284: ldc2_w -402316187
    //   8287: l2i
    //   8288: ldc_w 1184853850
    //   8291: ixor
    //   8292: ldc2_w -2121815181
    //   8295: l2i
    //   8296: ldc_w 1614797361
    //   8299: ixor
    //   8300: ixor
    //   8301: lookupswitch default -> 8936, 1327643261 -> 8328, 1504117156 -> 8284
    //   8328: goto -> 8332
    //   8331: athrow
    //   8332: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   8335: goto -> 8339
    //   8338: athrow
    //   8339: ldc_w 'ӧ㌧ӂ戞ᝢ๪祋'
    //   8342: getstatic Perryc.c : I
    //   8345: iflt -> 8359
    //   8348: ldc2_w 1686269726
    //   8351: l2i
    //   8352: ldc_w -1061828281
    //   8355: ixor
    //   8356: goto -> 8367
    //   8359: ldc2_w -506295214
    //   8362: l2i
    //   8363: ldc_w -601025952
    //   8366: ixor
    //   8367: ldc2_w -995185591
    //   8370: l2i
    //   8371: ldc_w -650520594
    //   8374: ixor
    //   8375: ixor
    //   8376: lookupswitch default -> 8404, -1180639746 -> 8996, -945169363 -> 8359
    //   8404: goto -> 8408
    //   8407: athrow
    //   8408: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   8411: goto -> 8415
    //   8414: athrow
    //   8415: getstatic Perryc.c : I
    //   8418: iflt -> 8432
    //   8421: ldc2_w 1738887220
    //   8424: l2i
    //   8425: ldc_w 2025354512
    //   8428: ixor
    //   8429: goto -> 8440
    //   8432: ldc2_w 599990838
    //   8435: l2i
    //   8436: ldc_w 325739357
    //   8439: ixor
    //   8440: ldc2_w -695921155
    //   8443: l2i
    //   8444: ldc_w 1854531873
    //   8447: ixor
    //   8448: ixor
    //   8449: lookupswitch default -> 8476, -1492002312 -> 8784, -64772277 -> 8432
    //   8476: goto -> 8480
    //   8479: athrow
    //   8480: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   8483: goto -> 8487
    //   8486: athrow
    //   8487: getstatic Perryc.c : I
    //   8490: iflt -> 8504
    //   8493: ldc2_w 508404374
    //   8496: l2i
    //   8497: ldc_w 1964990836
    //   8500: ixor
    //   8501: goto -> 8512
    //   8504: ldc2_w 257878600
    //   8507: l2i
    //   8508: ldc_w -1702255893
    //   8511: ixor
    //   8512: ldc2_w -1737082924
    //   8515: l2i
    //   8516: ldc_w -2068828815
    //   8519: ixor
    //   8520: ixor
    //   8521: lookupswitch default -> 8842, -1995353594 -> 8548, 2006243655 -> 8504
    //   8548: goto -> 8552
    //   8551: athrow
    //   8552: invokevirtual toString : ()Ljava/lang/String;
    //   8555: goto -> 8559
    //   8558: athrow
    //   8559: getstatic Perryc.1 : I
    //   8562: ifeq -> 8576
    //   8565: ldc2_w -1807210033
    //   8568: l2i
    //   8569: ldc_w 1985105043
    //   8572: ixor
    //   8573: goto -> 8584
    //   8576: ldc2_w 1710298864
    //   8579: l2i
    //   8580: ldc_w -1320988946
    //   8583: ixor
    //   8584: ldc2_w 834276799
    //   8587: l2i
    //   8588: ldc_w 1510760571
    //   8591: ixor
    //   8592: ixor
    //   8593: lookupswitch default -> 8620, -1985214312 -> 8918, 605880536 -> 8576
    //   8620: goto -> 8624
    //   8623: athrow
    //   8624: invokespecial <init> : (Ljava/lang/String;)V
    //   8627: goto -> 8631
    //   8630: athrow
    //   8631: getstatic Perryc.c : I
    //   8634: iflt -> 8648
    //   8637: ldc2_w -127656463
    //   8640: l2i
    //   8641: ldc_w 1431512724
    //   8644: ixor
    //   8645: goto -> 8656
    //   8648: ldc2_w -1342940540
    //   8651: l2i
    //   8652: ldc_w 442195980
    //   8655: ixor
    //   8656: ldc2_w 1327559306
    //   8659: l2i
    //   8660: ldc_w -1428895891
    //   8663: ixor
    //   8664: ixor
    //   8665: lookupswitch default -> 8832, 1220742786 -> 8648, 1348145007 -> 8692
    //   8692: iload_3
    //   8693: getstatic Perryc.0 : I
    //   8696: ifle -> 8710
    //   8699: ldc2_w 1412374191
    //   8702: l2i
    //   8703: ldc_w 1686471324
    //   8706: ixor
    //   8707: goto -> 8718
    //   8710: ldc2_w -1214642309
    //   8713: l2i
    //   8714: ldc_w 1666784818
    //   8717: ixor
    //   8718: ldc2_w 871495449
    //   8721: l2i
    //   8722: ldc_w 1744853347
    //   8725: ixor
    //   8726: ixor
    //   8727: lookupswitch default -> 8752, 461591533 -> 8710, 1801138761 -> 8956
    //   8752: goto -> 8756
    //   8755: athrow
    //   8756: invokevirtual func_146234_a : (Lnet/minecraft/util/text/ITextComponent;I)V
    //   8759: goto -> 8763
    //   8762: athrow
    //   8763: return
    //   8764: aconst_null
    //   8765: athrow
    //   8766: aconst_null
    //   8767: athrow
    //   8768: aconst_null
    //   8769: athrow
    //   8770: aconst_null
    //   8771: athrow
    //   8772: aconst_null
    //   8773: athrow
    //   8774: aconst_null
    //   8775: athrow
    //   8776: aconst_null
    //   8777: athrow
    //   8778: aconst_null
    //   8779: athrow
    //   8780: aconst_null
    //   8781: athrow
    //   8782: aconst_null
    //   8783: athrow
    //   8784: aconst_null
    //   8785: athrow
    //   8786: aconst_null
    //   8787: athrow
    //   8788: aconst_null
    //   8789: athrow
    //   8790: aconst_null
    //   8791: athrow
    //   8792: aconst_null
    //   8793: athrow
    //   8794: aconst_null
    //   8795: athrow
    //   8796: aconst_null
    //   8797: athrow
    //   8798: aconst_null
    //   8799: athrow
    //   8800: aconst_null
    //   8801: athrow
    //   8802: aconst_null
    //   8803: athrow
    //   8804: aconst_null
    //   8805: athrow
    //   8806: aconst_null
    //   8807: athrow
    //   8808: aconst_null
    //   8809: athrow
    //   8810: aconst_null
    //   8811: athrow
    //   8812: aconst_null
    //   8813: athrow
    //   8814: aconst_null
    //   8815: athrow
    //   8816: aconst_null
    //   8817: athrow
    //   8818: aconst_null
    //   8819: athrow
    //   8820: aconst_null
    //   8821: athrow
    //   8822: aconst_null
    //   8823: athrow
    //   8824: aconst_null
    //   8825: athrow
    //   8826: aconst_null
    //   8827: athrow
    //   8828: aconst_null
    //   8829: athrow
    //   8830: aconst_null
    //   8831: athrow
    //   8832: aconst_null
    //   8833: athrow
    //   8834: aconst_null
    //   8835: athrow
    //   8836: aconst_null
    //   8837: athrow
    //   8838: aconst_null
    //   8839: athrow
    //   8840: aconst_null
    //   8841: athrow
    //   8842: aconst_null
    //   8843: athrow
    //   8844: aconst_null
    //   8845: athrow
    //   8846: aconst_null
    //   8847: athrow
    //   8848: aconst_null
    //   8849: athrow
    //   8850: aconst_null
    //   8851: athrow
    //   8852: aconst_null
    //   8853: athrow
    //   8854: aconst_null
    //   8855: athrow
    //   8856: aconst_null
    //   8857: athrow
    //   8858: aconst_null
    //   8859: athrow
    //   8860: aconst_null
    //   8861: athrow
    //   8862: aconst_null
    //   8863: athrow
    //   8864: aconst_null
    //   8865: athrow
    //   8866: aconst_null
    //   8867: athrow
    //   8868: aconst_null
    //   8869: athrow
    //   8870: aconst_null
    //   8871: athrow
    //   8872: aconst_null
    //   8873: athrow
    //   8874: aconst_null
    //   8875: athrow
    //   8876: aconst_null
    //   8877: athrow
    //   8878: aconst_null
    //   8879: athrow
    //   8880: aconst_null
    //   8881: athrow
    //   8882: aconst_null
    //   8883: athrow
    //   8884: aconst_null
    //   8885: athrow
    //   8886: aconst_null
    //   8887: athrow
    //   8888: aconst_null
    //   8889: athrow
    //   8890: aconst_null
    //   8891: athrow
    //   8892: aconst_null
    //   8893: athrow
    //   8894: aconst_null
    //   8895: athrow
    //   8896: aconst_null
    //   8897: athrow
    //   8898: aconst_null
    //   8899: athrow
    //   8900: aconst_null
    //   8901: athrow
    //   8902: aconst_null
    //   8903: athrow
    //   8904: aconst_null
    //   8905: athrow
    //   8906: aconst_null
    //   8907: athrow
    //   8908: aconst_null
    //   8909: athrow
    //   8910: aconst_null
    //   8911: athrow
    //   8912: aconst_null
    //   8913: athrow
    //   8914: aconst_null
    //   8915: athrow
    //   8916: aconst_null
    //   8917: athrow
    //   8918: aconst_null
    //   8919: athrow
    //   8920: aconst_null
    //   8921: athrow
    //   8922: aconst_null
    //   8923: athrow
    //   8924: aconst_null
    //   8925: athrow
    //   8926: aconst_null
    //   8927: athrow
    //   8928: aconst_null
    //   8929: athrow
    //   8930: aconst_null
    //   8931: athrow
    //   8932: aconst_null
    //   8933: athrow
    //   8934: aconst_null
    //   8935: athrow
    //   8936: aconst_null
    //   8937: athrow
    //   8938: aconst_null
    //   8939: athrow
    //   8940: aconst_null
    //   8941: athrow
    //   8942: aconst_null
    //   8943: athrow
    //   8944: aconst_null
    //   8945: athrow
    //   8946: aconst_null
    //   8947: athrow
    //   8948: aconst_null
    //   8949: athrow
    //   8950: aconst_null
    //   8951: athrow
    //   8952: aconst_null
    //   8953: athrow
    //   8954: aconst_null
    //   8955: athrow
    //   8956: aconst_null
    //   8957: athrow
    //   8958: aconst_null
    //   8959: athrow
    //   8960: aconst_null
    //   8961: athrow
    //   8962: aconst_null
    //   8963: athrow
    //   8964: aconst_null
    //   8965: athrow
    //   8966: aconst_null
    //   8967: athrow
    //   8968: aconst_null
    //   8969: athrow
    //   8970: aconst_null
    //   8971: athrow
    //   8972: aconst_null
    //   8973: athrow
    //   8974: aconst_null
    //   8975: athrow
    //   8976: aconst_null
    //   8977: athrow
    //   8978: aconst_null
    //   8979: athrow
    //   8980: aconst_null
    //   8981: athrow
    //   8982: aconst_null
    //   8983: athrow
    //   8984: aconst_null
    //   8985: athrow
    //   8986: aconst_null
    //   8987: athrow
    //   8988: aconst_null
    //   8989: athrow
    //   8990: aconst_null
    //   8991: athrow
    //   8992: aconst_null
    //   8993: athrow
    //   8994: aconst_null
    //   8995: athrow
    //   8996: aconst_null
    //   8997: athrow
    //   8998: aconst_null
    //   8999: athrow
    //   9000: aconst_null
    //   9001: athrow
    //   9002: aconst_null
    //   9003: athrow
    //   9004: aconst_null
    //   9005: athrow
    //   9006: aconst_null
    //   9007: athrow
    //   9008: aconst_null
    //   9009: athrow
    //   9010: pop
    //   9011: goto -> 24
    //   9014: pop
    //   9015: aconst_null
    //   9016: goto -> 9010
    //   9019: dup
    //   9020: ifnull -> 9010
    //   9023: checkcast java/lang/Throwable
    //   9026: athrow
    //   9027: dup
    //   9028: ifnull -> 9014
    //   9031: checkcast java/lang/Throwable
    //   9034: athrow
    //   9035: aconst_null
    //   9036: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   3414	319	7	character	C
    //   2577	2894	3	id	I
    //   6706	319	7	character	C
    //   5869	2894	3	id	I
    //   24	8740	0	this	Lbigname/zprestige/webhack/features/modules/Client/Notify;
    //   24	8740	1	player	Lnet/minecraft/entity/player/EntityPlayer;
    //   529	8235	2	l_Count	I
    // Exception table:
    //   from	to	target	type
    //   8	20	9019	finally
    //   88	94	94	finally
    //   88	94	94	java/lang/IllegalArgumentException
    //   88	94	94	finally
    //   88	94	94	java/lang/ArithmeticException
    //   88	94	94	finally
    //   399	406	406	finally
    //   399	406	3	finally
    //   400	406	399	finally
    //   400	406	3	finally
    //   400	406	3	finally
    //   715	722	722	finally
    //   715	722	722	java/lang/ArrayIndexOutOfBoundsException
    //   715	722	3	finally
    //   715	722	722	java/lang/StringIndexOutOfBoundsException
    //   716	722	715	java/lang/UnsupportedOperationException
    //   787	794	794	finally
    //   787	794	794	java/lang/IndexOutOfBoundsException
    //   787	794	787	java/lang/NumberFormatException
    //   788	794	794	finally
    //   788	794	794	java/lang/IllegalArgumentException
    //   1035	1042	1042	finally
    //   1035	1042	1042	finally
    //   1035	1042	1035	finally
    //   1035	1042	3	finally
    //   1036	1042	1035	java/lang/NullPointerException
    //   1107	1114	1114	finally
    //   1107	1114	1107	java/lang/IndexOutOfBoundsException
    //   1107	1114	1114	finally
    //   1108	1114	1107	finally
    //   1108	1114	1107	java/lang/AssertionError
    //   1184	1190	1190	finally
    //   1184	1190	1190	finally
    //   1184	1190	1190	finally
    //   1184	1190	1190	java/util/ConcurrentModificationException
    //   1184	1190	1190	java/lang/IllegalStateException
    //   1439	1446	1446	finally
    //   1439	1446	1439	java/lang/NegativeArraySizeException
    //   1439	1446	1439	finally
    //   1440	1446	1439	java/lang/NegativeArraySizeException
    //   1440	1446	1439	finally
    //   1575	1582	1582	finally
    //   1576	1582	1575	finally
    //   1576	1582	1582	finally
    //   1576	1582	1582	java/lang/UnsupportedOperationException
    //   1576	1582	1575	finally
    //   1647	1654	1654	finally
    //   1647	1654	1654	java/util/NoSuchElementException
    //   1647	1654	1647	java/lang/ClassCastException
    //   1647	1654	3	java/lang/ArithmeticException
    //   1648	1654	1654	finally
    //   1847	1854	1854	finally
    //   1847	1854	3	finally
    //   1848	1854	1847	finally
    //   1848	1854	3	java/util/ConcurrentModificationException
    //   1848	1854	1854	java/lang/AssertionError
    //   1979	1986	1986	finally
    //   1979	1986	1979	finally
    //   1979	1986	3	finally
    //   1980	1986	3	java/util/ConcurrentModificationException
    //   1980	1986	1986	java/lang/IllegalStateException
    //   2051	2058	2058	finally
    //   2051	2058	2058	java/lang/NegativeArraySizeException
    //   2052	2058	2051	finally
    //   2052	2058	3	java/lang/ArrayIndexOutOfBoundsException
    //   2052	2058	2058	java/lang/StringIndexOutOfBoundsException
    //   2371	2378	2378	finally
    //   2371	2378	3	java/lang/AssertionError
    //   2372	2378	2371	finally
    //   2372	2378	3	java/lang/StringIndexOutOfBoundsException
    //   2372	2378	3	java/lang/UnsupportedOperationException
    //   2448	2454	2454	finally
    //   2448	2454	3	java/lang/EnumConstantNotPresentException
    //   2448	2454	2454	finally
    //   2448	2454	3	java/lang/UnsupportedOperationException
    //   2448	2454	3	java/util/ConcurrentModificationException
    //   2699	2706	2706	finally
    //   2699	2706	2699	finally
    //   2700	2706	3	java/lang/StringIndexOutOfBoundsException
    //   2700	2706	2699	java/lang/ArrayIndexOutOfBoundsException
    //   2700	2706	2699	java/lang/NegativeArraySizeException
    //   2771	2778	2778	finally
    //   2772	2778	3	java/lang/AssertionError
    //   2772	2778	2771	java/lang/IllegalStateException
    //   2772	2778	3	finally
    //   2772	2778	2778	finally
    //   3931	3938	3938	finally
    //   3931	3938	3	java/lang/NullPointerException
    //   3931	3938	3938	java/lang/ArithmeticException
    //   3932	3938	3931	java/lang/IndexOutOfBoundsException
    //   3932	3938	3	java/util/ConcurrentModificationException
    //   4011	4018	4018	finally
    //   4011	4018	3	java/lang/NullPointerException
    //   4011	4018	4011	java/util/ConcurrentModificationException
    //   4012	4018	4011	java/lang/NullPointerException
    //   4012	4018	3	finally
    //   4147	4154	4154	finally
    //   4147	4154	4147	java/lang/ArrayIndexOutOfBoundsException
    //   4147	4154	3	finally
    //   4148	4154	4154	finally
    //   4148	4154	3	java/util/NoSuchElementException
    //   4279	4286	4286	finally
    //   4279	4286	4279	finally
    //   4279	4286	3	finally
    //   4280	4286	4286	java/lang/ArithmeticException
    //   4280	4286	4279	finally
    //   4351	4358	4358	finally
    //   4351	4358	4351	java/util/ConcurrentModificationException
    //   4351	4358	3	java/lang/AssertionError
    //   4352	4358	4351	finally
    //   4352	4358	4358	finally
    //   4427	4434	4434	finally
    //   4427	4434	4427	java/lang/NegativeArraySizeException
    //   4427	4434	3	java/lang/StringIndexOutOfBoundsException
    //   4427	4434	3	java/lang/NegativeArraySizeException
    //   4427	4434	3	finally
    //   4499	4506	4506	finally
    //   4499	4506	4499	java/util/NoSuchElementException
    //   4499	4506	4506	finally
    //   4499	4506	3	java/lang/StringIndexOutOfBoundsException
    //   4500	4506	4499	finally
    //   4635	4642	4642	finally
    //   4635	4642	3	java/lang/ArrayIndexOutOfBoundsException
    //   4635	4642	3	finally
    //   4635	4642	4635	finally
    //   4636	4642	4635	finally
    //   4772	4778	4778	finally
    //   4772	4778	3	java/lang/NullPointerException
    //   4772	4778	4778	java/lang/StringIndexOutOfBoundsException
    //   4772	4778	4778	finally
    //   4772	4778	4778	java/util/NoSuchElementException
    //   4904	4910	4910	finally
    //   4904	4910	3	finally
    //   4904	4910	4910	java/lang/EnumConstantNotPresentException
    //   4904	4910	4910	java/util/NoSuchElementException
    //   4904	4910	3	java/lang/UnsupportedOperationException
    //   5039	5046	5046	finally
    //   5039	5046	5039	finally
    //   5039	5046	5039	java/lang/NullPointerException
    //   5040	5046	5046	finally
    //   5040	5046	5039	finally
    //   5115	5122	5122	finally
    //   5115	5122	5115	java/lang/ArithmeticException
    //   5115	5122	5115	java/lang/NullPointerException
    //   5115	5122	5122	finally
    //   5116	5122	3	finally
    //   5187	5194	5194	finally
    //   5187	5194	5187	finally
    //   5187	5194	5194	finally
    //   5188	5194	5194	finally
    //   5188	5194	3	finally
    //   5259	5266	5266	finally
    //   5259	5266	5266	java/lang/EnumConstantNotPresentException
    //   5259	5266	3	finally
    //   5259	5266	5259	finally
    //   5260	5266	5266	finally
    //   5332	5338	5338	finally
    //   5332	5338	5338	java/lang/IllegalArgumentException
    //   5332	5338	3	java/lang/IllegalArgumentException
    //   5332	5338	5338	finally
    //   5332	5338	5338	finally
    //   5463	5470	5470	finally
    //   5463	5470	5470	finally
    //   5463	5470	5463	finally
    //   5464	5470	5470	java/lang/ArithmeticException
    //   5464	5470	5463	finally
    //   5663	5670	5670	finally
    //   5663	5670	5670	java/lang/IllegalArgumentException
    //   5663	5670	5670	java/lang/StringIndexOutOfBoundsException
    //   5663	5670	3	java/lang/NegativeArraySizeException
    //   5664	5670	5663	java/lang/ClassCastException
    //   5739	5746	5746	finally
    //   5739	5746	5746	finally
    //   5739	5746	5739	java/lang/NumberFormatException
    //   5740	5746	3	java/lang/UnsupportedOperationException
    //   5740	5746	5739	finally
    //   5991	5998	5998	finally
    //   5991	5998	5991	finally
    //   5992	5998	5991	finally
    //   5992	5998	5998	finally
    //   5992	5998	5991	java/lang/StringIndexOutOfBoundsException
    //   6063	6070	6070	finally
    //   6063	6070	6070	finally
    //   6064	6070	6063	java/lang/NegativeArraySizeException
    //   6064	6070	3	finally
    //   6064	6070	3	finally
    //   7223	7230	7230	finally
    //   7223	7230	3	finally
    //   7223	7230	7230	finally
    //   7223	7230	7223	finally
    //   7224	7230	3	java/lang/RuntimeException
    //   7303	7310	7310	finally
    //   7303	7310	7303	java/lang/RuntimeException
    //   7303	7310	7303	java/lang/AssertionError
    //   7303	7310	7310	finally
    //   7304	7310	7303	java/lang/IllegalStateException
    //   7439	7446	7446	finally
    //   7439	7446	3	java/lang/NullPointerException
    //   7439	7446	3	finally
    //   7439	7446	3	java/lang/RuntimeException
    //   7440	7446	7439	java/lang/StringIndexOutOfBoundsException
    //   7571	7578	7578	finally
    //   7571	7578	3	finally
    //   7571	7578	7571	java/util/NoSuchElementException
    //   7572	7578	7578	java/lang/ArithmeticException
    //   7572	7578	7571	finally
    //   7644	7650	7650	finally
    //   7644	7650	7650	finally
    //   7644	7650	7650	finally
    //   7644	7650	3	finally
    //   7644	7650	3	finally
    //   7719	7726	7726	finally
    //   7719	7726	7726	java/util/NoSuchElementException
    //   7719	7726	7719	finally
    //   7720	7726	7726	java/lang/ArithmeticException
    //   7720	7726	3	finally
    //   7791	7798	7798	finally
    //   7791	7798	7798	finally
    //   7792	7798	7798	finally
    //   7792	7798	7798	finally
    //   7792	7798	7791	finally
    //   7927	7934	7934	finally
    //   7927	7934	7934	java/util/NoSuchElementException
    //   7927	7934	7927	finally
    //   7928	7934	7934	finally
    //   7928	7934	3	finally
    //   8064	8070	8070	finally
    //   8064	8070	3	finally
    //   8064	8070	8070	java/lang/EnumConstantNotPresentException
    //   8064	8070	8070	finally
    //   8064	8070	8070	java/util/ConcurrentModificationException
    //   8195	8202	8202	finally
    //   8195	8202	8195	finally
    //   8195	8202	8202	java/util/NoSuchElementException
    //   8196	8202	8195	java/lang/IllegalArgumentException
    //   8196	8202	8202	java/lang/NegativeArraySizeException
    //   8331	8338	8338	finally
    //   8331	8338	8331	java/lang/UnsupportedOperationException
    //   8332	8338	8338	finally
    //   8332	8338	8331	finally
    //   8332	8338	8331	java/lang/ClassCastException
    //   8407	8414	8414	finally
    //   8407	8414	8414	java/lang/UnsupportedOperationException
    //   8407	8414	8407	finally
    //   8407	8414	8414	java/lang/AssertionError
    //   8408	8414	8407	java/util/NoSuchElementException
    //   8479	8486	8486	finally
    //   8479	8486	8479	java/lang/StringIndexOutOfBoundsException
    //   8479	8486	3	java/lang/NegativeArraySizeException
    //   8480	8486	8479	finally
    //   8480	8486	3	finally
    //   8551	8558	8558	finally
    //   8551	8558	8551	java/lang/EnumConstantNotPresentException
    //   8552	8558	8551	java/lang/IllegalStateException
    //   8552	8558	8558	finally
    //   8552	8558	8558	java/util/ConcurrentModificationException
    //   8623	8630	8630	finally
    //   8624	8630	8630	finally
    //   8624	8630	3	finally
    //   8624	8630	8623	finally
    //   8624	8630	8623	java/lang/IllegalStateException
    //   8755	8762	8762	finally
    //   8755	8762	3	java/lang/UnsupportedOperationException
    //   8755	8762	8755	java/lang/EnumConstantNotPresentException
    //   8756	8762	3	java/lang/AssertionError
    //   8756	8762	8755	java/lang/ArrayIndexOutOfBoundsException
    //   9019	9027	9019	finally
    //   9035	9037	3	java/util/NoSuchElementException
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Client\Notify.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */