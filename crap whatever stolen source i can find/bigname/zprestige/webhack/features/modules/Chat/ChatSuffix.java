package bigname.zprestige.webhack.features.modules.Chat;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.PacketEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;
import bigname.zprestige.webhack.util.Timer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatSuffix extends Module {
  public Setting<ChatSuffix$Suffix> suffix;
  
  public Timer timer;
  
  public static ChatSuffix INSTANCE;
  
  public void setInstance() {
    Perry1.3E(this, (int)1698137786L ^ 0x11E448BF);
  }
  
  public static ChatSuffix getInstance() {
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
    //   0: new bigname/zprestige/webhack/features/modules/Chat/ChatSuffix
    //   3: dup
    //   4: getstatic Perryc.1 : I
    //   7: ifeq -> 20
    //   10: ldc2_w -1893302634
    //   13: l2i
    //   14: ldc 1054447857
    //   16: ixor
    //   17: goto -> 27
    //   20: ldc2_w 915161475
    //   23: l2i
    //   24: ldc -1560003204
    //   26: ixor
    //   27: ldc2_w 223251861
    //   30: l2i
    //   31: ldc -563148071
    //   33: ixor
    //   34: ixor
    //   35: lookupswitch default -> 126, 1185545139 -> 60, 1658741035 -> 20
    //   60: invokespecial <init> : ()V
    //   63: getstatic Perryc.c : I
    //   66: iflt -> 79
    //   69: ldc2_w 1461324791
    //   72: l2i
    //   73: ldc 23941977
    //   75: ixor
    //   76: goto -> 86
    //   79: ldc2_w 2048508861
    //   82: l2i
    //   83: ldc 2076678691
    //   85: ixor
    //   86: ldc2_w 1361705977
    //   89: l2i
    //   90: ldc 2079108431
    //   92: ixor
    //   93: ixor
    //   94: lookupswitch default -> 120, 1338631171 -> 79, 2092043800 -> 124
    //   120: putstatic bigname/zprestige/webhack/features/modules/Chat/ChatSuffix.INSTANCE : Lbigname/zprestige/webhack/features/modules/Chat/ChatSuffix;
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
  }
  
  public ChatSuffix() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -1196922930
    //   9: l2i
    //   10: ldc 1621097292
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1659687796
    //   19: l2i
    //   20: ldc -28014071
    //   22: ixor
    //   23: ldc2_w -990074842
    //   26: l2i
    //   27: ldc 1242761515
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, 611290777 -> 16, 1457012111 -> 1170
    //   56: aload_0
    //   57: ldc '떙㌛뗙㶣Ă嬓๿젙蹪巗'
    //   59: getstatic Perryc.1 : I
    //   62: ifeq -> 75
    //   65: ldc2_w -688696413
    //   68: l2i
    //   69: ldc 27187755
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -1430477516
    //   78: l2i
    //   79: ldc -1965813028
    //   81: ixor
    //   82: ldc2_w 1825369282
    //   85: l2i
    //   86: ldc 492850210
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 1140, -1497290392 -> 75, 1371805448 -> 116
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '떗㌜뗜㶾ķ嬏๼젌踣巖൮ਲ硸無?⣗辞涫'
    //   121: getstatic Perryc.0 : I
    //   124: ifle -> 137
    //   127: ldc2_w -601359558
    //   130: l2i
    //   131: ldc -1131769374
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 2101799433
    //   140: l2i
    //   141: ldc 977584141
    //   143: ixor
    //   144: ldc2_w 1092207017
    //   147: l2i
    //   148: ldc -1604584428
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 1174, -2115020955 -> 137, -1505749063 -> 180
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.0 : I
    //   186: ifle -> 199
    //   189: ldc2_w 59880775
    //   192: l2i
    //   193: ldc -1095489200
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w 1830923724
    //   202: l2i
    //   203: ldc 903740338
    //   205: ixor
    //   206: ldc2_w 602914866
    //   209: l2i
    //   210: ldc 1855434938
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 240, -262280033 -> 1168, 1407840075 -> 199
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.CHAT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w 1202181573
    //   246: l2i
    //   247: ldc 1202181572
    //   249: ixor
    //   250: ldc2_w -674887531
    //   253: l2i
    //   254: ldc -674887531
    //   256: ixor
    //   257: ldc2_w -2009069343
    //   260: l2i
    //   261: ldc -2009069343
    //   263: ixor
    //   264: getstatic Perryc.1 : I
    //   267: ifeq -> 280
    //   270: ldc2_w 1789677834
    //   273: l2i
    //   274: ldc -335651371
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w 326655920
    //   283: l2i
    //   284: ldc 1221855541
    //   286: ixor
    //   287: ldc2_w -1478792041
    //   290: l2i
    //   291: ldc -690356158
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 320, -262971382 -> 1172, 1956679981 -> 280
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.1 : I
    //   326: ifeq -> 339
    //   329: ldc2_w -1673362652
    //   332: l2i
    //   333: ldc -1167612332
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w -675410993
    //   342: l2i
    //   343: ldc 443866392
    //   345: ixor
    //   346: ldc2_w -961433107
    //   349: l2i
    //   350: ldc -1130374874
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 1150, -1209745892 -> 380, 1544244667 -> 339
    //   380: aload_0
    //   381: new bigname/zprestige/webhack/util/Timer
    //   384: dup
    //   385: getstatic Perryc.1 : I
    //   388: ifeq -> 401
    //   391: ldc2_w 1720574662
    //   394: l2i
    //   395: ldc -1900982774
    //   397: ixor
    //   398: goto -> 408
    //   401: ldc2_w -352226029
    //   404: l2i
    //   405: ldc -1442734885
    //   407: ixor
    //   408: ldc2_w 481258860
    //   411: l2i
    //   412: ldc -58558865
    //   414: ixor
    //   415: ixor
    //   416: lookupswitch default -> 444, 135378895 -> 1148, 491437550 -> 401
    //   444: invokespecial <init> : ()V
    //   447: getstatic Perryc.c : I
    //   450: iflt -> 463
    //   453: ldc2_w 391722188
    //   456: l2i
    //   457: ldc 1824016816
    //   459: ixor
    //   460: goto -> 470
    //   463: ldc2_w -1769633154
    //   466: l2i
    //   467: ldc -621328387
    //   469: ixor
    //   470: ldc2_w 770450557
    //   473: l2i
    //   474: ldc 1612421680
    //   476: ixor
    //   477: ixor
    //   478: lookupswitch default -> 1144, 25523150 -> 504, 907461425 -> 463
    //   504: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   507: getstatic Perryc.c : I
    //   510: iflt -> 523
    //   513: ldc2_w -69721755
    //   516: l2i
    //   517: ldc -1739485718
    //   519: ixor
    //   520: goto -> 530
    //   523: ldc2_w -1893789493
    //   526: l2i
    //   527: ldc 2004154332
    //   529: ixor
    //   530: ldc2_w -1786401841
    //   533: l2i
    //   534: ldc 1063656614
    //   536: ixor
    //   537: ixor
    //   538: lookupswitch default -> 564, -915792922 -> 1142, 1498335602 -> 523
    //   564: aload_0
    //   565: getstatic Perryc.1 : I
    //   568: ifeq -> 581
    //   571: ldc2_w 69776285
    //   574: l2i
    //   575: ldc 1825847168
    //   577: ixor
    //   578: goto -> 588
    //   581: ldc2_w -1811006524
    //   584: l2i
    //   585: ldc -1763566888
    //   587: ixor
    //   588: ldc2_w -26144918
    //   591: l2i
    //   592: ldc 636623114
    //   594: ixor
    //   595: ixor
    //   596: lookupswitch default -> 1160, -1283485059 -> 581, -647022724 -> 624
    //   624: aload_0
    //   625: new bigname/zprestige/webhack/features/setting/Setting
    //   628: dup
    //   629: ldc '떉㌆뗞㶱ĸ嬞'
    //   631: getstatic Perryc.c : I
    //   634: iflt -> 647
    //   637: ldc2_w -916152297
    //   640: l2i
    //   641: ldc -1400885479
    //   643: ixor
    //   644: goto -> 654
    //   647: ldc2_w -1607895639
    //   650: l2i
    //   651: ldc 1689959016
    //   653: ixor
    //   654: ldc2_w 1077755521
    //   657: l2i
    //   658: ldc -2040344427
    //   660: ixor
    //   661: ixor
    //   662: lookupswitch default -> 688, -1548000998 -> 1158, -1234320242 -> 647
    //   688: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   691: getstatic Perryc.1 : I
    //   694: ifeq -> 708
    //   697: ldc2_w -810352755
    //   700: l2i
    //   701: ldc_w 2046276060
    //   704: ixor
    //   705: goto -> 716
    //   708: ldc2_w -1237080973
    //   711: l2i
    //   712: ldc_w 1194943603
    //   715: ixor
    //   716: ldc2_w -454912860
    //   719: l2i
    //   720: ldc_w 198051252
    //   723: ixor
    //   724: ixor
    //   725: lookupswitch default -> 752, 1500110657 -> 1162, 1500663158 -> 708
    //   752: getstatic bigname/zprestige/webhack/features/modules/Chat/ChatSuffix$Suffix.WEB : Lbigname/zprestige/webhack/features/modules/Chat/ChatSuffix$Suffix;
    //   755: ldc_w '떃㌜뗍㶥ű嬵๬젙蹥巆൹੩'
    //   758: getstatic Perryc.1 : I
    //   761: ifeq -> 775
    //   764: ldc2_w -664841847
    //   767: l2i
    //   768: ldc_w 1442211862
    //   771: ixor
    //   772: goto -> 783
    //   775: ldc2_w 633657949
    //   778: l2i
    //   779: ldc_w 1499870626
    //   782: ixor
    //   783: ldc2_w 2091946791
    //   786: l2i
    //   787: ldc_w -2014462252
    //   790: ixor
    //   791: ixor
    //   792: lookupswitch default -> 820, -1395664927 -> 775, 1995707500 -> 1164
    //   820: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   823: getstatic Perryc.c : I
    //   826: iflt -> 840
    //   829: ldc2_w 1406823776
    //   832: l2i
    //   833: ldc_w 1621945579
    //   836: ixor
    //   837: goto -> 848
    //   840: ldc2_w 2069377903
    //   843: l2i
    //   844: ldc_w -1912868582
    //   847: ixor
    //   848: ldc2_w -1254784520
    //   851: l2i
    //   852: ldc_w -1263313687
    //   855: ixor
    //   856: ixor
    //   857: lookupswitch default -> 1152, -148562076 -> 884, 854613146 -> 840
    //   884: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V
    //   887: getstatic Perryc.c : I
    //   890: iflt -> 904
    //   893: ldc2_w -75753719
    //   896: l2i
    //   897: ldc_w 943014812
    //   900: ixor
    //   901: goto -> 912
    //   904: ldc2_w -215568566
    //   907: l2i
    //   908: ldc_w -503996319
    //   911: ixor
    //   912: ldc2_w 1679342871
    //   915: l2i
    //   916: ldc_w 272719585
    //   919: ixor
    //   920: ixor
    //   921: lookupswitch default -> 1154, -1223641245 -> 904, 1720380637 -> 948
    //   948: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   951: getstatic Perryc.c : I
    //   954: iflt -> 968
    //   957: ldc2_w -1167508798
    //   960: l2i
    //   961: ldc_w 473275781
    //   964: ixor
    //   965: goto -> 976
    //   968: ldc2_w 913952116
    //   971: l2i
    //   972: ldc_w -1847401036
    //   975: ixor
    //   976: ldc2_w 168003710
    //   979: l2i
    //   980: ldc_w 1388530688
    //   983: ixor
    //   984: ixor
    //   985: lookupswitch default -> 1012, -23305415 -> 1156, 1705376526 -> 968
    //   1012: putfield suffix : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1015: getstatic Perryc.c : I
    //   1018: iflt -> 1032
    //   1021: ldc2_w -70002196
    //   1024: l2i
    //   1025: ldc_w -1254596350
    //   1028: ixor
    //   1029: goto -> 1040
    //   1032: ldc2_w 2089063923
    //   1035: l2i
    //   1036: ldc_w -1938939859
    //   1039: ixor
    //   1040: ldc2_w 1193414534
    //   1043: l2i
    //   1044: ldc_w 1723747265
    //   1047: ixor
    //   1048: ixor
    //   1049: lookupswitch default -> 1146, -780734055 -> 1076, 1870134441 -> 1032
    //   1076: aload_0
    //   1077: getstatic Perryc.0 : I
    //   1080: ifle -> 1094
    //   1083: ldc2_w 1670808346
    //   1086: l2i
    //   1087: ldc_w -1233321486
    //   1090: ixor
    //   1091: goto -> 1102
    //   1094: ldc2_w -877241326
    //   1097: l2i
    //   1098: ldc_w -802287012
    //   1101: ixor
    //   1102: ldc2_w -1944021172
    //   1105: l2i
    //   1106: ldc_w -1380929084
    //   1109: ixor
    //   1110: ixor
    //   1111: lookupswitch default -> 1166, -193223584 -> 1094, 973629638 -> 1136
    //   1136: invokespecial setInstance : ()V
    //   1139: return
    //   1140: aconst_null
    //   1141: athrow
    //   1142: aconst_null
    //   1143: athrow
    //   1144: aconst_null
    //   1145: athrow
    //   1146: aconst_null
    //   1147: athrow
    //   1148: aconst_null
    //   1149: athrow
    //   1150: aconst_null
    //   1151: athrow
    //   1152: aconst_null
    //   1153: athrow
    //   1154: aconst_null
    //   1155: athrow
    //   1156: aconst_null
    //   1157: athrow
    //   1158: aconst_null
    //   1159: athrow
    //   1160: aconst_null
    //   1161: athrow
    //   1162: aconst_null
    //   1163: athrow
    //   1164: aconst_null
    //   1165: athrow
    //   1166: aconst_null
    //   1167: athrow
    //   1168: aconst_null
    //   1169: athrow
    //   1170: aconst_null
    //   1171: athrow
    //   1172: aconst_null
    //   1173: athrow
    //   1174: aconst_null
    //   1175: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1140	0	this	Lbigname/zprestige/webhack/features/modules/Chat/ChatSuffix;
  }
  
  @SubscribeEvent
  public void onPacketSend(PacketEvent.Send event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 2489
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 2481
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 2473
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 532900187
    //   33: l2i
    //   34: ldc_w 590591283
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1642189144
    //   44: l2i
    //   45: ldc_w 1653081788
    //   48: ixor
    //   49: ldc2_w 1194519325
    //   52: l2i
    //   53: ldc_w -1151874176
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1267664250 -> 41, -1063912203 -> 2432
    //   84: aload_1
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w 1946632898
    //   94: l2i
    //   95: ldc_w 1150495703
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -196343221
    //   105: l2i
    //   106: ldc_w -1166857203
    //   109: ixor
    //   110: ldc2_w 1473298964
    //   113: l2i
    //   114: ldc_w -1667775995
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 2462, -2055723433 -> 144, -70031100 -> 102
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual getStage : ()I
    //   151: goto -> 155
    //   154: athrow
    //   155: ifne -> 169
    //   158: ldc2_w 1982616085
    //   161: l2i
    //   162: ldc_w 1348795817
    //   165: ixor
    //   166: goto -> 177
    //   169: ldc2_w 1675141112
    //   172: l2i
    //   173: ldc_w 1167077445
    //   176: ixor
    //   177: ldc2_w 756630221
    //   180: l2i
    //   181: ldc_w -1988602353
    //   184: ixor
    //   185: ixor
    //   186: tableswitch default -> 158, -2111194242 -> 208, -2111194241 -> 2399
    //   208: getstatic Perryc.1 : I
    //   211: ifeq -> 225
    //   214: ldc2_w -1965146255
    //   217: l2i
    //   218: ldc_w -920744237
    //   221: ixor
    //   222: goto -> 233
    //   225: ldc2_w -1931954682
    //   228: l2i
    //   229: ldc_w 1887677246
    //   232: ixor
    //   233: ldc2_w 363244457
    //   236: l2i
    //   237: ldc_w -1996648821
    //   240: ixor
    //   241: ixor
    //   242: lookupswitch default -> 2416, -560229248 -> 225, 1627404314 -> 268
    //   268: aload_1
    //   269: getstatic Perryc.c : I
    //   272: iflt -> 286
    //   275: ldc2_w 640736839
    //   278: l2i
    //   279: ldc_w 675478330
    //   282: ixor
    //   283: goto -> 294
    //   286: ldc2_w 1737312591
    //   289: l2i
    //   290: ldc_w -441348527
    //   293: ixor
    //   294: ldc2_w -1731175906
    //   297: l2i
    //   298: ldc_w -2029722001
    //   301: ixor
    //   302: ixor
    //   303: lookupswitch default -> 2426, -1645708433 -> 328, 296130828 -> 286
    //   328: goto -> 332
    //   331: athrow
    //   332: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   335: goto -> 339
    //   338: athrow
    //   339: instanceof net/minecraft/network/play/client/CPacketChatMessage
    //   342: ifeq -> 356
    //   345: ldc2_w -1612310157
    //   348: l2i
    //   349: ldc_w -1261724996
    //   352: ixor
    //   353: goto -> 364
    //   356: ldc2_w 1425425064
    //   359: l2i
    //   360: ldc_w 2145108326
    //   363: ixor
    //   364: ldc2_w 1122388780
    //   367: l2i
    //   368: ldc_w -427987857
    //   371: ixor
    //   372: ixor
    //   373: tableswitch default -> 345, -1883855732 -> 396, -1883855731 -> 2399
    //   396: getstatic Perryc.0 : I
    //   399: ifle -> 413
    //   402: ldc2_w 1082026798
    //   405: l2i
    //   406: ldc_w 1390148348
    //   409: ixor
    //   410: goto -> 421
    //   413: ldc2_w 549647318
    //   416: l2i
    //   417: ldc_w 364669171
    //   420: ixor
    //   421: ldc2_w -1893002977
    //   424: l2i
    //   425: ldc_w -457112774
    //   428: ixor
    //   429: ixor
    //   430: lookupswitch default -> 2442, 1586792704 -> 456, 2035254263 -> 413
    //   456: aload_1
    //   457: getstatic Perryc.0 : I
    //   460: ifle -> 474
    //   463: ldc2_w -1751824877
    //   466: l2i
    //   467: ldc_w 1958647401
    //   470: ixor
    //   471: goto -> 482
    //   474: ldc2_w -188511578
    //   477: l2i
    //   478: ldc_w -286498394
    //   481: ixor
    //   482: ldc2_w 371153802
    //   485: l2i
    //   486: ldc_w -1677332518
    //   489: ixor
    //   490: ixor
    //   491: lookupswitch default -> 2418, -1875550384 -> 516, 1764844586 -> 474
    //   516: goto -> 520
    //   519: athrow
    //   520: invokevirtual getPacket : ()Lnet/minecraft/network/Packet;
    //   523: goto -> 527
    //   526: athrow
    //   527: checkcast net/minecraft/network/play/client/CPacketChatMessage
    //   530: getstatic Perryc.0 : I
    //   533: ifle -> 547
    //   536: ldc2_w 1122083387
    //   539: l2i
    //   540: ldc_w 38275462
    //   543: ixor
    //   544: goto -> 555
    //   547: ldc2_w -575111790
    //   550: l2i
    //   551: ldc_w 1002112526
    //   554: ixor
    //   555: ldc2_w -1740748518
    //   558: l2i
    //   559: ldc_w 9302153
    //   562: ixor
    //   563: ixor
    //   564: lookupswitch default -> 2450, -669380050 -> 547, 2125513231 -> 592
    //   592: astore_2
    //   593: getstatic Perryc.0 : I
    //   596: ifle -> 610
    //   599: ldc2_w 1353258686
    //   602: l2i
    //   603: ldc_w 218932573
    //   606: ixor
    //   607: goto -> 618
    //   610: ldc2_w 1545668295
    //   613: l2i
    //   614: ldc_w 201557283
    //   617: ixor
    //   618: ldc2_w 1432492907
    //   621: l2i
    //   622: ldc_w 1405623638
    //   625: ixor
    //   626: ixor
    //   627: lookupswitch default -> 2454, 1451787737 -> 652, 1527756254 -> 610
    //   652: aload_2
    //   653: getstatic Perryc.1 : I
    //   656: ifeq -> 670
    //   659: ldc2_w -629728316
    //   662: l2i
    //   663: ldc_w -914399744
    //   666: ixor
    //   667: goto -> 678
    //   670: ldc2_w -928637829
    //   673: l2i
    //   674: ldc_w 478461584
    //   677: ixor
    //   678: ldc2_w -1675810040
    //   681: l2i
    //   682: ldc_w -732957210
    //   685: ixor
    //   686: ixor
    //   687: lookupswitch default -> 712, -765599953 -> 670, 1532664618 -> 2428
    //   712: goto -> 716
    //   715: athrow
    //   716: invokevirtual func_149439_c : ()Ljava/lang/String;
    //   719: goto -> 723
    //   722: athrow
    //   723: getstatic Perryc.1 : I
    //   726: ifeq -> 740
    //   729: ldc2_w 2127096066
    //   732: l2i
    //   733: ldc_w 575803371
    //   736: ixor
    //   737: goto -> 748
    //   740: ldc2_w 1654017042
    //   743: l2i
    //   744: ldc_w 309718178
    //   747: ixor
    //   748: ldc2_w -384171330
    //   751: l2i
    //   752: ldc_w 191912628
    //   755: ixor
    //   756: ixor
    //   757: lookupswitch default -> 784, -1091518749 -> 2436, -187160201 -> 740
    //   784: astore_3
    //   785: getstatic Perryc.0 : I
    //   788: ifle -> 802
    //   791: ldc2_w 836477374
    //   794: l2i
    //   795: ldc_w -99455585
    //   798: ixor
    //   799: goto -> 810
    //   802: ldc2_w -274061612
    //   805: l2i
    //   806: ldc_w 1361332664
    //   809: ixor
    //   810: ldc2_w -265133255
    //   813: l2i
    //   814: ldc_w -91938191
    //   817: ixor
    //   818: ixor
    //   819: lookupswitch default -> 844, -1048670871 -> 2408, 1864892389 -> 802
    //   844: aload_3
    //   845: ldc_w '/'
    //   848: getstatic Perryc.c : I
    //   851: iflt -> 865
    //   854: ldc2_w 1796124250
    //   857: l2i
    //   858: ldc_w 325979555
    //   861: ixor
    //   862: goto -> 873
    //   865: ldc2_w -2110803084
    //   868: l2i
    //   869: ldc_w -1865073766
    //   872: ixor
    //   873: ldc2_w 279765137
    //   876: l2i
    //   877: ldc_w -1869458446
    //   880: ixor
    //   881: ixor
    //   882: lookupswitch default -> 908, -128053094 -> 2438, 273383116 -> 865
    //   908: goto -> 912
    //   911: athrow
    //   912: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   915: goto -> 919
    //   918: athrow
    //   919: ifeq -> 933
    //   922: ldc2_w -414231932
    //   925: l2i
    //   926: ldc_w -867440927
    //   929: ixor
    //   930: goto -> 941
    //   933: ldc2_w -588324335
    //   936: l2i
    //   937: ldc_w -135637387
    //   940: ixor
    //   941: ldc2_w 1913217061
    //   944: l2i
    //   945: ldc_w 2025991862
    //   948: ixor
    //   949: ixor
    //   950: tableswitch default -> 922, 567278326 -> 972, 567278327 -> 973
    //   972: return
    //   973: getstatic Perryc.0 : I
    //   976: ifle -> 990
    //   979: ldc2_w -337419449
    //   982: l2i
    //   983: ldc_w -1955992739
    //   986: ixor
    //   987: goto -> 998
    //   990: ldc2_w -822605501
    //   993: l2i
    //   994: ldc_w -804820121
    //   997: ixor
    //   998: ldc2_w 653035216
    //   1001: l2i
    //   1002: ldc_w -798768250
    //   1005: ixor
    //   1006: ixor
    //   1007: lookupswitch default -> 2448, -1778004660 -> 990, -395303054 -> 1032
    //   1032: getstatic bigname/zprestige/webhack/features/modules/Chat/ChatSuffix$1.$SwitchMap$bigname$zprestige$webhack$features$modules$Chat$ChatSuffix$Suffix : [I
    //   1035: getstatic Perryc.0 : I
    //   1038: ifle -> 1052
    //   1041: ldc2_w -1166169220
    //   1044: l2i
    //   1045: ldc_w 1490084770
    //   1048: ixor
    //   1049: goto -> 1060
    //   1052: ldc2_w 470541395
    //   1055: l2i
    //   1056: ldc_w -1869917275
    //   1059: ixor
    //   1060: ldc2_w 1780212277
    //   1063: l2i
    //   1064: ldc_w 498870348
    //   1067: ixor
    //   1068: ixor
    //   1069: lookupswitch default -> 2456, -1794473305 -> 1052, -81298033 -> 1096
    //   1096: aload_0
    //   1097: getstatic Perryc.c : I
    //   1100: iflt -> 1114
    //   1103: ldc2_w 862657221
    //   1106: l2i
    //   1107: ldc_w 2082389590
    //   1110: ixor
    //   1111: goto -> 1122
    //   1114: ldc2_w 1540585299
    //   1117: l2i
    //   1118: ldc_w -1385912431
    //   1121: ixor
    //   1122: ldc2_w -969137857
    //   1125: l2i
    //   1126: ldc_w 1078107021
    //   1129: ixor
    //   1130: ixor
    //   1131: lookupswitch default -> 1156, -922018271 -> 2434, 1052191228 -> 1114
    //   1156: getfield suffix : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1159: getstatic Perryc.0 : I
    //   1162: ifle -> 1176
    //   1165: ldc2_w -644759534
    //   1168: l2i
    //   1169: ldc_w -1450560870
    //   1172: ixor
    //   1173: goto -> 1184
    //   1176: ldc2_w 63326734
    //   1179: l2i
    //   1180: ldc_w -1085383017
    //   1183: ixor
    //   1184: ldc2_w -877591889
    //   1187: l2i
    //   1188: ldc_w 911677888
    //   1191: ixor
    //   1192: ixor
    //   1193: lookupswitch default -> 2460, -1912739353 -> 1176, 1097732086 -> 1220
    //   1220: goto -> 1224
    //   1223: athrow
    //   1224: invokevirtual getValue : ()Ljava/lang/Object;
    //   1227: goto -> 1231
    //   1230: athrow
    //   1231: checkcast bigname/zprestige/webhack/features/modules/Chat/ChatSuffix$Suffix
    //   1234: getstatic Perryc.c : I
    //   1237: iflt -> 1251
    //   1240: ldc2_w -1457070055
    //   1243: l2i
    //   1244: ldc_w -798452679
    //   1247: ixor
    //   1248: goto -> 1259
    //   1251: ldc2_w 1466749825
    //   1254: l2i
    //   1255: ldc_w 409842229
    //   1258: ixor
    //   1259: ldc2_w 1428611531
    //   1262: l2i
    //   1263: ldc_w -1084847331
    //   1266: ixor
    //   1267: ixor
    //   1268: lookupswitch default -> 1296, -1824645386 -> 2440, 1869227833 -> 1251
    //   1296: goto -> 1300
    //   1299: athrow
    //   1300: invokevirtual ordinal : ()I
    //   1303: goto -> 1307
    //   1306: athrow
    //   1307: iaload
    //   1308: lookupswitch default -> 1817, 1 -> 1328
    //   1328: new java/lang/StringBuilder
    //   1331: dup
    //   1332: getstatic Perryc.1 : I
    //   1335: ifeq -> 1349
    //   1338: ldc2_w -2022155992
    //   1341: l2i
    //   1342: ldc_w -435645479
    //   1345: ixor
    //   1346: goto -> 1357
    //   1349: ldc2_w -1902499371
    //   1352: l2i
    //   1353: ldc_w 1209922548
    //   1356: ixor
    //   1357: ldc2_w -717527776
    //   1360: l2i
    //   1361: ldc_w 198616936
    //   1364: ixor
    //   1365: ixor
    //   1366: lookupswitch default -> 1392, -1080227655 -> 2400, 1330732909 -> 1349
    //   1392: goto -> 1396
    //   1395: athrow
    //   1396: invokespecial <init> : ()V
    //   1399: goto -> 1403
    //   1402: athrow
    //   1403: getstatic Perryc.0 : I
    //   1406: ifle -> 1420
    //   1409: ldc2_w 2099535725
    //   1412: l2i
    //   1413: ldc_w -1442772921
    //   1416: ixor
    //   1417: goto -> 1428
    //   1420: ldc2_w -962768872
    //   1423: l2i
    //   1424: ldc_w 356695267
    //   1427: ixor
    //   1428: ldc2_w -984395888
    //   1431: l2i
    //   1432: ldc_w -87199126
    //   1435: ixor
    //   1436: ixor
    //   1437: lookupswitch default -> 2424, -390370608 -> 1420, -331230975 -> 1464
    //   1464: aload_3
    //   1465: getstatic Perryc.1 : I
    //   1468: ifeq -> 1482
    //   1471: ldc2_w 1962571225
    //   1474: l2i
    //   1475: ldc_w -398942238
    //   1478: ixor
    //   1479: goto -> 1490
    //   1482: ldc2_w 414978065
    //   1485: l2i
    //   1486: ldc_w -1546900671
    //   1489: ixor
    //   1490: ldc2_w -232435649
    //   1493: l2i
    //   1494: ldc_w -1612020722
    //   1497: ixor
    //   1498: ixor
    //   1499: lookupswitch default -> 2412, -692064415 -> 1524, -250790390 -> 1482
    //   1524: goto -> 1528
    //   1527: athrow
    //   1528: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1531: goto -> 1535
    //   1534: athrow
    //   1535: ldc_w '뗺Ⴃ떘䧫蕓姿ಅ핿祥?'
    //   1538: getstatic Perryc.c : I
    //   1541: iflt -> 1555
    //   1544: ldc2_w 196251776
    //   1547: l2i
    //   1548: ldc_w 756255963
    //   1551: ixor
    //   1552: goto -> 1563
    //   1555: ldc2_w -1227430097
    //   1558: l2i
    //   1559: ldc_w -1532894928
    //   1562: ixor
    //   1563: ldc2_w 877082960
    //   1566: l2i
    //   1567: ldc_w 1643085453
    //   1570: ixor
    //   1571: ixor
    //   1572: lookupswitch default -> 1600, -216643800 -> 1555, 1929993094 -> 2410
    //   1600: goto -> 1604
    //   1603: athrow
    //   1604: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   1607: goto -> 1611
    //   1610: athrow
    //   1611: getstatic Perryc.c : I
    //   1614: iflt -> 1628
    //   1617: ldc2_w 723721029
    //   1620: l2i
    //   1621: ldc_w 1441840542
    //   1624: ixor
    //   1625: goto -> 1636
    //   1628: ldc2_w 1686068544
    //   1631: l2i
    //   1632: ldc_w 566436124
    //   1635: ixor
    //   1636: ldc2_w 586071400
    //   1639: l2i
    //   1640: ldc_w 365455711
    //   1643: ixor
    //   1644: ixor
    //   1645: lookupswitch default -> 2414, 1240822508 -> 1628, 1922738283 -> 1672
    //   1672: goto -> 1676
    //   1675: athrow
    //   1676: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1679: goto -> 1683
    //   1682: athrow
    //   1683: getstatic Perryc.0 : I
    //   1686: ifle -> 1700
    //   1689: ldc2_w -541246828
    //   1692: l2i
    //   1693: ldc_w 810533947
    //   1696: ixor
    //   1697: goto -> 1708
    //   1700: ldc2_w 1963269359
    //   1703: l2i
    //   1704: ldc_w 315768779
    //   1707: ixor
    //   1708: ldc2_w -248200502
    //   1711: l2i
    //   1712: ldc_w -569031801
    //   1715: ixor
    //   1716: ixor
    //   1717: lookupswitch default -> 1744, -1059880990 -> 2420, -20533110 -> 1700
    //   1744: goto -> 1748
    //   1747: athrow
    //   1748: invokevirtual toString : ()Ljava/lang/String;
    //   1751: goto -> 1755
    //   1754: athrow
    //   1755: getstatic Perryc.1 : I
    //   1758: ifeq -> 1772
    //   1761: ldc2_w 497287452
    //   1764: l2i
    //   1765: ldc_w -1765404354
    //   1768: ixor
    //   1769: goto -> 1780
    //   1772: ldc2_w -404125182
    //   1775: l2i
    //   1776: ldc_w 692006191
    //   1779: ixor
    //   1780: ldc2_w 572813601
    //   1783: l2i
    //   1784: ldc_w -1750052559
    //   1787: ixor
    //   1788: ixor
    //   1789: lookupswitch default -> 2452, 1056321586 -> 1772, 2067957565 -> 1816
    //   1816: astore_3
    //   1817: getstatic Perryc.c : I
    //   1820: iflt -> 1834
    //   1823: ldc2_w 1008961859
    //   1826: l2i
    //   1827: ldc_w -838673579
    //   1830: ixor
    //   1831: goto -> 1842
    //   1834: ldc2_w -986191041
    //   1837: l2i
    //   1838: ldc_w 1263694177
    //   1841: ixor
    //   1842: ldc2_w 496630940
    //   1845: l2i
    //   1846: ldc_w 224437941
    //   1849: ixor
    //   1850: ixor
    //   1851: lookupswitch default -> 1876, -1395721854 -> 1834, -489158593 -> 2458
    //   1876: aload_3
    //   1877: getstatic Perryc.c : I
    //   1880: iflt -> 1894
    //   1883: ldc2_w 1752695787
    //   1886: l2i
    //   1887: ldc_w 1561033277
    //   1890: ixor
    //   1891: goto -> 1902
    //   1894: ldc2_w -1210944234
    //   1897: l2i
    //   1898: ldc_w 148491830
    //   1901: ixor
    //   1902: ldc2_w -303680047
    //   1905: l2i
    //   1906: ldc_w 405037634
    //   1909: ixor
    //   1910: ixor
    //   1911: lookupswitch default -> 2402, -1062130107 -> 1894, 1254747315 -> 1936
    //   1936: goto -> 1940
    //   1939: athrow
    //   1940: invokevirtual length : ()I
    //   1943: goto -> 1947
    //   1946: athrow
    //   1947: ldc2_w -1515843954
    //   1950: l2i
    //   1951: ldc_w -1515843698
    //   1954: ixor
    //   1955: if_icmplt -> 1969
    //   1958: ldc2_w 991685023
    //   1961: l2i
    //   1962: ldc_w -1242477735
    //   1965: ixor
    //   1966: goto -> 1977
    //   1969: ldc2_w -1622815655
    //   1972: l2i
    //   1973: ldc_w 296709790
    //   1976: ixor
    //   1977: ldc2_w 850507870
    //   1980: l2i
    //   1981: ldc_w -358971234
    //   1984: ixor
    //   1985: ixor
    //   1986: tableswitch default -> 1958, 1455526406 -> 2008, 1455526407 -> 2217
    //   2008: getstatic Perryc.0 : I
    //   2011: ifle -> 2025
    //   2014: ldc2_w -1905291010
    //   2017: l2i
    //   2018: ldc_w -1055764284
    //   2021: ixor
    //   2022: goto -> 2033
    //   2025: ldc2_w 1643979184
    //   2028: l2i
    //   2029: ldc_w -1791420480
    //   2032: ixor
    //   2033: ldc2_w 2003972759
    //   2036: l2i
    //   2037: ldc_w 59695740
    //   2040: ixor
    //   2041: ixor
    //   2042: lookupswitch default -> 2068, 998314193 -> 2444, 1113835179 -> 2025
    //   2068: aload_3
    //   2069: ldc2_w -241553106
    //   2072: l2i
    //   2073: ldc_w -241553106
    //   2076: ixor
    //   2077: ldc2_w -1554144912
    //   2080: l2i
    //   2081: ldc_w -1554145168
    //   2084: ixor
    //   2085: getstatic Perryc.1 : I
    //   2088: ifeq -> 2102
    //   2091: ldc2_w 1127531583
    //   2094: l2i
    //   2095: ldc_w 1799790779
    //   2098: ixor
    //   2099: goto -> 2110
    //   2102: ldc2_w 137215309
    //   2105: l2i
    //   2106: ldc_w 583142199
    //   2109: ixor
    //   2110: ldc2_w 852300610
    //   2113: l2i
    //   2114: ldc_w -284454490
    //   2117: ixor
    //   2118: ixor
    //   2119: lookupswitch default -> 2404, -172693920 -> 2102, -148294498 -> 2144
    //   2144: goto -> 2148
    //   2147: athrow
    //   2148: invokevirtual substring : (II)Ljava/lang/String;
    //   2151: goto -> 2155
    //   2154: athrow
    //   2155: getstatic Perryc.0 : I
    //   2158: ifle -> 2172
    //   2161: ldc2_w -199725229
    //   2164: l2i
    //   2165: ldc_w -94250650
    //   2168: ixor
    //   2169: goto -> 2180
    //   2172: ldc2_w -331029144
    //   2175: l2i
    //   2176: ldc_w 1582079994
    //   2179: ixor
    //   2180: ldc2_w 162354339
    //   2183: l2i
    //   2184: ldc_w -1589913756
    //   2187: ixor
    //   2188: ixor
    //   2189: lookupswitch default -> 2216, -1494272526 -> 2446, 1133545809 -> 2172
    //   2216: astore_3
    //   2217: getstatic Perryc.0 : I
    //   2220: ifle -> 2234
    //   2223: ldc2_w 1635332323
    //   2226: l2i
    //   2227: ldc_w -726773779
    //   2230: ixor
    //   2231: goto -> 2242
    //   2234: ldc2_w -719436749
    //   2237: l2i
    //   2238: ldc_w -1358839696
    //   2241: ixor
    //   2242: ldc2_w -172234588
    //   2245: l2i
    //   2246: ldc_w -482175453
    //   2249: ixor
    //   2250: ixor
    //   2251: lookupswitch default -> 2430, -1557266039 -> 2234, 1827076804 -> 2276
    //   2276: aload_2
    //   2277: getstatic Perryc.1 : I
    //   2280: ifeq -> 2294
    //   2283: ldc2_w -1913464352
    //   2286: l2i
    //   2287: ldc_w -65893378
    //   2290: ixor
    //   2291: goto -> 2302
    //   2294: ldc2_w -400595092
    //   2297: l2i
    //   2298: ldc_w 1577197199
    //   2301: ixor
    //   2302: ldc2_w -1437897463
    //   2305: l2i
    //   2306: ldc_w -1566457248
    //   2309: ixor
    //   2310: ixor
    //   2311: lookupswitch default -> 2406, -1091053942 -> 2336, 2030763383 -> 2294
    //   2336: aload_3
    //   2337: getstatic Perryc.1 : I
    //   2340: ifeq -> 2354
    //   2343: ldc2_w 1729139169
    //   2346: l2i
    //   2347: ldc_w 665834745
    //   2350: ixor
    //   2351: goto -> 2362
    //   2354: ldc2_w 1317951350
    //   2357: l2i
    //   2358: ldc_w 1612031859
    //   2361: ixor
    //   2362: ldc2_w 1999053687
    //   2365: l2i
    //   2366: ldc_w 1694506821
    //   2369: ixor
    //   2370: ixor
    //   2371: lookupswitch default -> 2422, 1019006007 -> 2396, 1385724202 -> 2354
    //   2396: putfield field_149440_a : Ljava/lang/String;
    //   2399: return
    //   2400: aconst_null
    //   2401: athrow
    //   2402: aconst_null
    //   2403: athrow
    //   2404: aconst_null
    //   2405: athrow
    //   2406: aconst_null
    //   2407: athrow
    //   2408: aconst_null
    //   2409: athrow
    //   2410: aconst_null
    //   2411: athrow
    //   2412: aconst_null
    //   2413: athrow
    //   2414: aconst_null
    //   2415: athrow
    //   2416: aconst_null
    //   2417: athrow
    //   2418: aconst_null
    //   2419: athrow
    //   2420: aconst_null
    //   2421: athrow
    //   2422: aconst_null
    //   2423: athrow
    //   2424: aconst_null
    //   2425: athrow
    //   2426: aconst_null
    //   2427: athrow
    //   2428: aconst_null
    //   2429: athrow
    //   2430: aconst_null
    //   2431: athrow
    //   2432: aconst_null
    //   2433: athrow
    //   2434: aconst_null
    //   2435: athrow
    //   2436: aconst_null
    //   2437: athrow
    //   2438: aconst_null
    //   2439: athrow
    //   2440: aconst_null
    //   2441: athrow
    //   2442: aconst_null
    //   2443: athrow
    //   2444: aconst_null
    //   2445: athrow
    //   2446: aconst_null
    //   2447: athrow
    //   2448: aconst_null
    //   2449: athrow
    //   2450: aconst_null
    //   2451: athrow
    //   2452: aconst_null
    //   2453: athrow
    //   2454: aconst_null
    //   2455: athrow
    //   2456: aconst_null
    //   2457: athrow
    //   2458: aconst_null
    //   2459: athrow
    //   2460: aconst_null
    //   2461: athrow
    //   2462: aconst_null
    //   2463: athrow
    //   2464: pop
    //   2465: goto -> 24
    //   2468: pop
    //   2469: aconst_null
    //   2470: goto -> 2464
    //   2473: dup
    //   2474: ifnull -> 2464
    //   2477: checkcast java/lang/Throwable
    //   2480: athrow
    //   2481: dup
    //   2482: ifnull -> 2468
    //   2485: checkcast java/lang/Throwable
    //   2488: athrow
    //   2489: aconst_null
    //   2490: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   593	1806	2	packet	Lnet/minecraft/network/play/client/CPacketChatMessage;
    //   785	1614	3	s	Ljava/lang/String;
    //   24	2376	0	this	Lbigname/zprestige/webhack/features/modules/Chat/ChatSuffix;
    //   24	2376	1	event	Lbigname/zprestige/webhack/event/events/PacketEvent$Send;
    // Exception table:
    //   from	to	target	type
    //   8	20	2473	java/lang/ClassCastException
    //   147	154	154	finally
    //   147	154	147	java/lang/IllegalArgumentException
    //   147	154	154	java/lang/ArithmeticException
    //   148	154	147	finally
    //   148	154	3	finally
    //   331	338	338	finally
    //   331	338	3	finally
    //   331	338	3	finally
    //   332	338	331	java/lang/UnsupportedOperationException
    //   332	338	338	finally
    //   519	526	526	finally
    //   519	526	3	java/lang/NullPointerException
    //   519	526	519	finally
    //   519	526	526	java/lang/RuntimeException
    //   520	526	526	java/lang/EnumConstantNotPresentException
    //   716	722	722	finally
    //   716	722	3	finally
    //   716	722	722	finally
    //   716	722	722	finally
    //   716	722	722	finally
    //   911	918	918	finally
    //   911	918	911	java/lang/NumberFormatException
    //   911	918	911	finally
    //   911	918	3	java/lang/ClassCastException
    //   911	918	3	java/lang/IndexOutOfBoundsException
    //   1223	1230	1230	finally
    //   1223	1230	3	java/lang/IllegalStateException
    //   1224	1230	1230	finally
    //   1224	1230	1223	java/lang/ArrayIndexOutOfBoundsException
    //   1224	1230	3	finally
    //   1299	1306	1306	finally
    //   1299	1306	1306	java/lang/NegativeArraySizeException
    //   1299	1306	3	java/util/ConcurrentModificationException
    //   1299	1306	1299	java/lang/EnumConstantNotPresentException
    //   1300	1306	3	finally
    //   1395	1402	1402	finally
    //   1395	1402	1402	java/util/NoSuchElementException
    //   1395	1402	1395	finally
    //   1396	1402	3	java/lang/ArithmeticException
    //   1396	1402	3	java/util/NoSuchElementException
    //   1527	1534	1534	finally
    //   1527	1534	1527	java/util/ConcurrentModificationException
    //   1527	1534	3	java/lang/ArithmeticException
    //   1527	1534	3	finally
    //   1528	1534	3	finally
    //   1603	1610	1610	finally
    //   1603	1610	1603	java/lang/NullPointerException
    //   1603	1610	3	finally
    //   1604	1610	3	java/lang/UnsupportedOperationException
    //   1604	1610	1610	java/lang/ClassCastException
    //   1675	1682	1682	finally
    //   1675	1682	1682	finally
    //   1675	1682	1682	java/lang/EnumConstantNotPresentException
    //   1676	1682	1682	java/lang/NegativeArraySizeException
    //   1676	1682	1675	java/util/ConcurrentModificationException
    //   1748	1754	1754	finally
    //   1748	1754	3	finally
    //   1748	1754	1754	finally
    //   1748	1754	1754	finally
    //   1748	1754	3	java/lang/ClassCastException
    //   1939	1946	1946	finally
    //   1939	1946	3	java/lang/ArithmeticException
    //   1939	1946	1939	java/lang/AssertionError
    //   1939	1946	3	finally
    //   1939	1946	1939	java/lang/NumberFormatException
    //   2147	2154	2154	finally
    //   2147	2154	3	java/lang/ArithmeticException
    //   2148	2154	2154	finally
    //   2148	2154	2147	java/lang/RuntimeException
    //   2148	2154	2154	finally
    //   2473	2481	2473	finally
    //   2489	2491	3	java/lang/NumberFormatException
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Chat\ChatSuffix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */