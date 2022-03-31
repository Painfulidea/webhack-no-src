package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import com.google.common.util.concurrent.AtomicDouble;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class BlockUtil implements Util {
  public static List<Block> blackList;
  
  public static List<Block> shulkerList;
  
  public static List<Block> unSafeBlocks;
  
  public static List<Block> unSolidBlocks;
  
  public static int isPositionPlaceable(BlockPos pos, boolean rayTrace, boolean entityCheck) {
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
  
  public static void faceVector(Vec3d vec, boolean normalizeAngle) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1221
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 1213
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1205
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w -718715783
    //   33: l2i
    //   34: ldc_w 510592808
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1847365327
    //   44: l2i
    //   45: ldc_w -1339566581
    //   48: ixor
    //   49: ldc2_w -1899154427
    //   52: l2i
    //   53: ldc_w 1647403721
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 1176, -851906058 -> 84, 666506653 -> 41
    //   84: aload_0
    //   85: getstatic Perryc.0 : I
    //   88: ifle -> 102
    //   91: ldc2_w 938355110
    //   94: l2i
    //   95: ldc_w -893815829
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -1811636194
    //   105: l2i
    //   106: ldc_w -1997940908
    //   109: ixor
    //   110: ldc2_w 1969465965
    //   113: l2i
    //   114: ldc_w 752576643
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -1527801693 -> 1184, 59187038 -> 102
    //   144: goto -> 148
    //   147: athrow
    //   148: invokestatic getLegitRotations : (Lnet/minecraft/util/math/Vec3d;)[F
    //   151: goto -> 155
    //   154: athrow
    //   155: getstatic Perryc.0 : I
    //   158: ifle -> 172
    //   161: ldc2_w -1302234083
    //   164: l2i
    //   165: ldc_w 1362434778
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w 778343172
    //   175: l2i
    //   176: ldc_w -1706739195
    //   179: ixor
    //   180: ldc2_w -534287725
    //   183: l2i
    //   184: ldc_w 1438254474
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 1180, 29148696 -> 216, 1456015838 -> 172
    //   216: astore_2
    //   217: getstatic Perryc.c : I
    //   220: iflt -> 234
    //   223: ldc2_w -558002981
    //   226: l2i
    //   227: ldc_w 1553421312
    //   230: ixor
    //   231: goto -> 242
    //   234: ldc2_w 404548745
    //   237: l2i
    //   238: ldc_w -566753542
    //   241: ixor
    //   242: ldc2_w -1595324943
    //   245: l2i
    //   246: ldc_w -1368369636
    //   249: ixor
    //   250: ixor
    //   251: lookupswitch default -> 1166, -1934374090 -> 234, -927073890 -> 276
    //   276: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   279: getstatic Perryc.1 : I
    //   282: ifeq -> 296
    //   285: ldc2_w 335858456
    //   288: l2i
    //   289: ldc_w 299186870
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w -1794377740
    //   299: l2i
    //   300: ldc_w 1028620045
    //   303: ixor
    //   304: ldc2_w -1220019091
    //   307: l2i
    //   308: ldc_w -285648489
    //   311: ixor
    //   312: ixor
    //   313: lookupswitch default -> 340, -1731956784 -> 296, 1550799956 -> 1186
    //   340: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   343: getstatic Perryc.0 : I
    //   346: ifle -> 360
    //   349: ldc2_w 1687717263
    //   352: l2i
    //   353: ldc_w -205718469
    //   356: ixor
    //   357: goto -> 368
    //   360: ldc2_w 401956172
    //   363: l2i
    //   364: ldc_w 926990902
    //   367: ixor
    //   368: ldc2_w -62482483
    //   371: l2i
    //   372: ldc_w -1046427164
    //   375: ixor
    //   376: ixor
    //   377: lookupswitch default -> 404, -1430116451 -> 1188, 1349642551 -> 360
    //   404: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   407: new net/minecraft/network/play/client/CPacketPlayer$Rotation
    //   410: dup
    //   411: getstatic Perryc.1 : I
    //   414: ifeq -> 428
    //   417: ldc2_w 1031957363
    //   420: l2i
    //   421: ldc_w -1293006226
    //   424: ixor
    //   425: goto -> 436
    //   428: ldc2_w -1028412954
    //   431: l2i
    //   432: ldc_w -835202029
    //   435: ixor
    //   436: ldc2_w 1266967179
    //   439: l2i
    //   440: ldc_w 2029764351
    //   443: ixor
    //   444: ixor
    //   445: lookupswitch default -> 472, -1575152315 -> 428, -1139540631 -> 1164
    //   472: aload_2
    //   473: ldc2_w -1597610356
    //   476: l2i
    //   477: ldc_w -1597610356
    //   480: ixor
    //   481: faload
    //   482: getstatic Perryc.1 : I
    //   485: ifeq -> 499
    //   488: ldc2_w -718052738
    //   491: l2i
    //   492: ldc_w 180518056
    //   495: ixor
    //   496: goto -> 507
    //   499: ldc2_w -1231775079
    //   502: l2i
    //   503: ldc_w 823515973
    //   506: ixor
    //   507: ldc2_w 1546541008
    //   510: l2i
    //   511: ldc_w 599835701
    //   514: ixor
    //   515: ixor
    //   516: lookupswitch default -> 544, -1608544973 -> 1168, 1970539557 -> 499
    //   544: iload_1
    //   545: ifeq -> 559
    //   548: ldc2_w -352462411
    //   551: l2i
    //   552: ldc_w 1103640142
    //   555: ixor
    //   556: goto -> 567
    //   559: ldc2_w -1902383978
    //   562: l2i
    //   563: ldc_w 632161134
    //   566: ixor
    //   567: ldc2_w -542100869
    //   570: l2i
    //   571: ldc_w -2007491351
    //   574: ixor
    //   575: ixor
    //   576: tableswitch default -> 548, -52575895 -> 600, -52575894 -> 755
    //   600: getstatic Perryc.1 : I
    //   603: ifeq -> 617
    //   606: ldc2_w 1868220825
    //   609: l2i
    //   610: ldc_w 1175598204
    //   613: ixor
    //   614: goto -> 625
    //   617: ldc2_w -1368059409
    //   620: l2i
    //   621: ldc_w 1529262069
    //   624: ixor
    //   625: ldc2_w 210845177
    //   628: l2i
    //   629: ldc_w -823979262
    //   632: ixor
    //   633: ixor
    //   634: lookupswitch default -> 1194, -348466402 -> 617, 924946657 -> 660
    //   660: aload_2
    //   661: ldc2_w 1509964251
    //   664: l2i
    //   665: ldc_w 1509964250
    //   668: ixor
    //   669: faload
    //   670: f2i
    //   671: ldc2_w 1858136155
    //   674: l2i
    //   675: ldc_w 1858136371
    //   678: ixor
    //   679: getstatic Perryc.1 : I
    //   682: ifeq -> 696
    //   685: ldc2_w 1324730938
    //   688: l2i
    //   689: ldc_w -1523401948
    //   692: ixor
    //   693: goto -> 704
    //   696: ldc2_w -335814796
    //   699: l2i
    //   700: ldc_w 1273327683
    //   703: ixor
    //   704: ldc2_w -2052127164
    //   707: l2i
    //   708: ldc_w -704748737
    //   711: ixor
    //   712: ixor
    //   713: lookupswitch default -> 1182, -1147792283 -> 696, -263206324 -> 740
    //   740: goto -> 744
    //   743: athrow
    //   744: invokestatic func_180184_b : (II)I
    //   747: goto -> 751
    //   750: athrow
    //   751: i2f
    //   752: goto -> 826
    //   755: getstatic Perryc.0 : I
    //   758: ifle -> 772
    //   761: ldc2_w 2037575713
    //   764: l2i
    //   765: ldc_w -1511644470
    //   768: ixor
    //   769: goto -> 780
    //   772: ldc2_w -573579426
    //   775: l2i
    //   776: ldc_w -1741947026
    //   779: ixor
    //   780: ldc2_w 1934327047
    //   783: l2i
    //   784: ldc_w 2143232817
    //   787: ixor
    //   788: ixor
    //   789: lookupswitch default -> 1190, -798978851 -> 772, 1225817606 -> 816
    //   816: aload_2
    //   817: ldc2_w 923948894
    //   820: l2i
    //   821: ldc_w 923948895
    //   824: ixor
    //   825: faload
    //   826: getstatic Perryc.0 : I
    //   829: ifle -> 843
    //   832: ldc2_w 245436556
    //   835: l2i
    //   836: ldc_w 196714107
    //   839: ixor
    //   840: goto -> 851
    //   843: ldc2_w 85496968
    //   846: l2i
    //   847: ldc_w 1689627087
    //   850: ixor
    //   851: ldc2_w 2007744218
    //   854: l2i
    //   855: ldc_w -1920783305
    //   858: ixor
    //   859: ixor
    //   860: lookupswitch default -> 1170, -1685737558 -> 888, -13624294 -> 843
    //   888: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   891: getstatic Perryc.1 : I
    //   894: ifeq -> 908
    //   897: ldc2_w 929255018
    //   900: l2i
    //   901: ldc_w 1676455717
    //   904: ixor
    //   905: goto -> 916
    //   908: ldc2_w 289658721
    //   911: l2i
    //   912: ldc_w 39044584
    //   915: ixor
    //   916: ldc2_w 176831023
    //   919: l2i
    //   920: ldc_w 197354256
    //   923: ixor
    //   924: ixor
    //   925: lookupswitch default -> 1192, 307841974 -> 952, 1439086704 -> 908
    //   952: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   955: getstatic Perryc.c : I
    //   958: iflt -> 972
    //   961: ldc2_w 1535472288
    //   964: l2i
    //   965: ldc_w -1293502272
    //   968: ixor
    //   969: goto -> 980
    //   972: ldc2_w -1569301668
    //   975: l2i
    //   976: ldc_w -619284777
    //   979: ixor
    //   980: ldc2_w 746197139
    //   983: l2i
    //   984: ldc_w 894665177
    //   987: ixor
    //   988: ixor
    //   989: lookupswitch default -> 1016, -263562454 -> 1172, 1505468636 -> 972
    //   1016: getfield field_70122_E : Z
    //   1019: getstatic Perryc.1 : I
    //   1022: ifeq -> 1036
    //   1025: ldc2_w 2084183501
    //   1028: l2i
    //   1029: ldc_w 1944216941
    //   1032: ixor
    //   1033: goto -> 1044
    //   1036: ldc2_w -133829953
    //   1039: l2i
    //   1040: ldc_w -457619641
    //   1043: ixor
    //   1044: ldc2_w 824017482
    //   1047: l2i
    //   1048: ldc_w 2118264210
    //   1051: ixor
    //   1052: ixor
    //   1053: lookupswitch default -> 1080, -48998485 -> 1036, 1082646392 -> 1174
    //   1080: goto -> 1084
    //   1083: athrow
    //   1084: invokespecial <init> : (FFZ)V
    //   1087: goto -> 1091
    //   1090: athrow
    //   1091: getstatic Perryc.c : I
    //   1094: iflt -> 1108
    //   1097: ldc2_w 1915622547
    //   1100: l2i
    //   1101: ldc_w -1214137305
    //   1104: ixor
    //   1105: goto -> 1116
    //   1108: ldc2_w 443355340
    //   1111: l2i
    //   1112: ldc_w -1439427781
    //   1115: ixor
    //   1116: ldc2_w 630314816
    //   1119: l2i
    //   1120: ldc_w 1498517792
    //   1123: ixor
    //   1124: ixor
    //   1125: lookupswitch default -> 1178, -1185943852 -> 1108, -862370409 -> 1152
    //   1152: goto -> 1156
    //   1155: athrow
    //   1156: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   1159: goto -> 1163
    //   1162: athrow
    //   1163: return
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
    //   1176: aconst_null
    //   1177: athrow
    //   1178: aconst_null
    //   1179: athrow
    //   1180: aconst_null
    //   1181: athrow
    //   1182: aconst_null
    //   1183: athrow
    //   1184: aconst_null
    //   1185: athrow
    //   1186: aconst_null
    //   1187: athrow
    //   1188: aconst_null
    //   1189: athrow
    //   1190: aconst_null
    //   1191: athrow
    //   1192: aconst_null
    //   1193: athrow
    //   1194: aconst_null
    //   1195: athrow
    //   1196: pop
    //   1197: goto -> 24
    //   1200: pop
    //   1201: aconst_null
    //   1202: goto -> 1196
    //   1205: dup
    //   1206: ifnull -> 1196
    //   1209: checkcast java/lang/Throwable
    //   1212: athrow
    //   1213: dup
    //   1214: ifnull -> 1200
    //   1217: checkcast java/lang/Throwable
    //   1220: athrow
    //   1221: aconst_null
    //   1222: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1140	0	vec	Lnet/minecraft/util/math/Vec3d;
    //   24	1140	1	normalizeAngle	Z
    //   217	947	2	rotations	[F
    // Exception table:
    //   from	to	target	type
    //   8	20	1205	finally
    //   147	154	154	finally
    //   147	154	147	java/lang/AssertionError
    //   148	154	154	java/lang/NumberFormatException
    //   148	154	147	java/lang/RuntimeException
    //   148	154	154	java/lang/NumberFormatException
    //   743	750	750	finally
    //   743	750	750	finally
    //   744	750	750	java/lang/RuntimeException
    //   744	750	743	finally
    //   744	750	3	finally
    //   1083	1090	1090	finally
    //   1083	1090	1090	java/lang/ArithmeticException
    //   1084	1090	3	finally
    //   1084	1090	1083	finally
    //   1084	1090	3	finally
    //   1156	1162	1162	finally
    //   1156	1162	1162	finally
    //   1156	1162	1162	java/lang/AssertionError
    //   1156	1162	3	finally
    //   1156	1162	1162	finally
    //   1205	1213	1205	finally
    //   1221	1223	3	finally
  }
  
  public static BlockUtil$ValidResult valid(BlockPos pos) {
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
  
  public static boolean rayTracePlaceCheck(BlockPos paramBlockPos) {
    return Perry1.6t(null, (int)-421877718L ^ 0x852FA12F, paramBlockPos);
  }
  
  public static void placeBlockStopSneaking(BlockPos pos, EnumHand hand, boolean rotate, boolean packet, boolean isSneaking) {
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
  
  public static boolean canBeClicked(BlockPos paramBlockPos) {
    return Perry1.6h(null, (int)-818290140L ^ 0xEE24E5DE, paramBlockPos);
  }
  
  public static Vec3d getEyesPos() {
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
  
  public static Vec3d[] getHelpingBlocks(Vec3d vec3d) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 4476
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 4468
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 4460
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: ldc2_w 2063160318
    //   27: l2i
    //   28: ldc_w 2063160315
    //   31: ixor
    //   32: anewarray net/minecraft/util/math/Vec3d
    //   35: dup
    //   36: ldc2_w -1456720391
    //   39: l2i
    //   40: ldc_w -1456720391
    //   43: ixor
    //   44: new net/minecraft/util/math/Vec3d
    //   47: dup
    //   48: getstatic Perryc.1 : I
    //   51: ifeq -> 65
    //   54: ldc2_w -168786463
    //   57: l2i
    //   58: ldc_w 352934523
    //   61: ixor
    //   62: goto -> 73
    //   65: ldc2_w 793891492
    //   68: l2i
    //   69: ldc_w 631364910
    //   72: ixor
    //   73: ldc2_w 1348124172
    //   76: l2i
    //   77: ldc_w 739554639
    //   80: ixor
    //   81: ixor
    //   82: lookupswitch default -> 108, -1665674023 -> 4349, 1308043039 -> 65
    //   108: aload_0
    //   109: getstatic Perryc.0 : I
    //   112: ifle -> 126
    //   115: ldc2_w 1580840221
    //   118: l2i
    //   119: ldc_w -279111801
    //   122: ixor
    //   123: goto -> 134
    //   126: ldc2_w -740869633
    //   129: l2i
    //   130: ldc_w -781757014
    //   133: ixor
    //   134: ldc2_w 211756182
    //   137: l2i
    //   138: ldc_w -1202135794
    //   141: ixor
    //   142: ixor
    //   143: lookupswitch default -> 168, 94591746 -> 4387, 205101210 -> 126
    //   168: getfield field_72450_a : D
    //   171: getstatic Perryc.0 : I
    //   174: ifle -> 188
    //   177: ldc2_w -795280435
    //   180: l2i
    //   181: ldc_w -529082174
    //   184: ixor
    //   185: goto -> 196
    //   188: ldc2_w -1464003321
    //   191: l2i
    //   192: ldc_w -1573216847
    //   195: ixor
    //   196: ldc2_w 340245210
    //   199: l2i
    //   200: ldc_w 80572694
    //   203: ixor
    //   204: ixor
    //   205: lookupswitch default -> 4335, 437076858 -> 232, 543484099 -> 188
    //   232: aload_0
    //   233: getstatic Perryc.0 : I
    //   236: ifle -> 250
    //   239: ldc2_w -2042791807
    //   242: l2i
    //   243: ldc_w -287662082
    //   246: ixor
    //   247: goto -> 258
    //   250: ldc2_w 1603558904
    //   253: l2i
    //   254: ldc_w 324339200
    //   257: ixor
    //   258: ldc2_w -193170341
    //   261: l2i
    //   262: ldc_w 146951603
    //   265: ixor
    //   266: ixor
    //   267: lookupswitch default -> 4409, -1806049641 -> 250, -1333829104 -> 292
    //   292: getfield field_72448_b : D
    //   295: ldc2_w 6.37107220357485
    //   298: invokestatic doubleToLongBits : (D)J
    //   301: ldc2_w 9217034427573156875
    //   304: lxor
    //   305: invokestatic longBitsToDouble : (J)D
    //   308: dsub
    //   309: getstatic Perryc.1 : I
    //   312: ifeq -> 326
    //   315: ldc2_w -129059301
    //   318: l2i
    //   319: ldc_w 736443537
    //   322: ixor
    //   323: goto -> 334
    //   326: ldc2_w 489606309
    //   329: l2i
    //   330: ldc_w -1236801765
    //   333: ixor
    //   334: ldc2_w 138128458
    //   337: l2i
    //   338: ldc_w -1438950359
    //   341: ixor
    //   342: ixor
    //   343: lookupswitch default -> 4351, 157932509 -> 368, 1907063529 -> 326
    //   368: aload_0
    //   369: getstatic Perryc.1 : I
    //   372: ifeq -> 386
    //   375: ldc2_w 1770542043
    //   378: l2i
    //   379: ldc_w -1570870384
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w -1429954091
    //   389: l2i
    //   390: ldc_w 540024593
    //   393: ixor
    //   394: ldc2_w 1386054903
    //   397: l2i
    //   398: ldc_w 496964005
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 428, -2066436839 -> 4389, -1854017018 -> 386
    //   428: getfield field_72449_c : D
    //   431: getstatic Perryc.0 : I
    //   434: ifle -> 448
    //   437: ldc2_w 57270232
    //   440: l2i
    //   441: ldc_w 1702006970
    //   444: ixor
    //   445: goto -> 456
    //   448: ldc2_w -442049684
    //   451: l2i
    //   452: ldc_w -62313542
    //   455: ixor
    //   456: ldc2_w -356531371
    //   459: l2i
    //   460: ldc_w 6021245
    //   463: ixor
    //   464: ixor
    //   465: lookupswitch default -> 4445, -1929417654 -> 448, -217328642 -> 492
    //   492: goto -> 496
    //   495: athrow
    //   496: invokespecial <init> : (DDD)V
    //   499: goto -> 503
    //   502: athrow
    //   503: aastore
    //   504: dup
    //   505: ldc2_w -246757905
    //   508: l2i
    //   509: ldc_w -246757906
    //   512: ixor
    //   513: new net/minecraft/util/math/Vec3d
    //   516: dup
    //   517: getstatic Perryc.0 : I
    //   520: ifle -> 534
    //   523: ldc2_w 1410599909
    //   526: l2i
    //   527: ldc_w 735011230
    //   530: ixor
    //   531: goto -> 542
    //   534: ldc2_w -1142396668
    //   537: l2i
    //   538: ldc_w 772842465
    //   541: ixor
    //   542: ldc2_w 152660351
    //   545: l2i
    //   546: ldc_w 1100288325
    //   549: ixor
    //   550: ixor
    //   551: lookupswitch default -> 576, -589091385 -> 534, 928453185 -> 4333
    //   576: aload_0
    //   577: getstatic Perryc.c : I
    //   580: iflt -> 594
    //   583: ldc2_w 291878653
    //   586: l2i
    //   587: ldc_w 297485180
    //   590: ixor
    //   591: goto -> 602
    //   594: ldc2_w -797375226
    //   597: l2i
    //   598: ldc_w -1779288246
    //   601: ixor
    //   602: ldc2_w 1176942013
    //   605: l2i
    //   606: ldc_w -162833243
    //   609: ixor
    //   610: ixor
    //   611: lookupswitch default -> 4407, -1330439015 -> 594, -169419948 -> 636
    //   636: getfield field_72450_a : D
    //   639: ldc2_w 1.5244368889184314E308
    //   642: invokestatic doubleToLongBits : (D)J
    //   645: ldc2_w 9217499308421666403
    //   648: lxor
    //   649: invokestatic longBitsToDouble : (J)D
    //   652: dcmpl
    //   653: ifeq -> 667
    //   656: ldc2_w 1418323361
    //   659: l2i
    //   660: ldc_w 1683109262
    //   663: ixor
    //   664: goto -> 675
    //   667: ldc2_w 464963925
    //   670: l2i
    //   671: ldc_w 728570235
    //   674: ixor
    //   675: ldc2_w -317190105
    //   678: l2i
    //   679: ldc_w 1649431538
    //   682: ixor
    //   683: ixor
    //   684: tableswitch default -> 656, -1080847366 -> 708, -1080847365 -> 848
    //   708: getstatic Perryc.1 : I
    //   711: ifeq -> 725
    //   714: ldc2_w 1872226905
    //   717: l2i
    //   718: ldc_w -551727165
    //   721: ixor
    //   722: goto -> 733
    //   725: ldc2_w -1454227495
    //   728: l2i
    //   729: ldc_w -2090212365
    //   732: ixor
    //   733: ldc2_w 572182543
    //   736: l2i
    //   737: ldc_w 954082983
    //   740: ixor
    //   741: ixor
    //   742: lookupswitch default -> 768, -1437707470 -> 4411, 1885878881 -> 725
    //   768: aload_0
    //   769: getstatic Perryc.0 : I
    //   772: ifle -> 786
    //   775: ldc2_w 539000953
    //   778: l2i
    //   779: ldc_w -107599163
    //   782: ixor
    //   783: goto -> 794
    //   786: ldc2_w 1466431017
    //   789: l2i
    //   790: ldc_w -1169341939
    //   793: ixor
    //   794: ldc2_w 1512106290
    //   797: l2i
    //   798: ldc_w -701759904
    //   801: ixor
    //   802: ixor
    //   803: lookupswitch default -> 828, -1114111515 -> 786, 1438498286 -> 4397
    //   828: getfield field_72450_a : D
    //   831: ldc2_w 0.11754466198859069
    //   834: invokestatic doubleToLongBits : (D)J
    //   837: ldc2_w 9204820424625452159
    //   840: lxor
    //   841: invokestatic longBitsToDouble : (J)D
    //   844: dmul
    //   845: goto -> 971
    //   848: getstatic Perryc.c : I
    //   851: iflt -> 865
    //   854: ldc2_w -1396892457
    //   857: l2i
    //   858: ldc_w 1814598238
    //   861: ixor
    //   862: goto -> 873
    //   865: ldc2_w -2009200473
    //   868: l2i
    //   869: ldc_w -2132471111
    //   872: ixor
    //   873: ldc2_w 1402333796
    //   876: l2i
    //   877: ldc_w -1853543114
    //   880: ixor
    //   881: ixor
    //   882: lookupswitch default -> 908, -36586880 -> 865, 42289627 -> 4373
    //   908: aload_0
    //   909: getstatic Perryc.0 : I
    //   912: ifle -> 926
    //   915: ldc2_w -2067556993
    //   918: l2i
    //   919: ldc_w -1317715638
    //   922: ixor
    //   923: goto -> 934
    //   926: ldc2_w 955125777
    //   929: l2i
    //   930: ldc_w 1833574396
    //   933: ixor
    //   934: ldc2_w -680351122
    //   937: l2i
    //   938: ldc_w -1607921862
    //   941: ixor
    //   942: ixor
    //   943: lookupswitch default -> 968, -830128174 -> 926, 1122857313 -> 4405
    //   968: getfield field_72450_a : D
    //   971: getstatic Perryc.0 : I
    //   974: ifle -> 988
    //   977: ldc2_w 1442463276
    //   980: l2i
    //   981: ldc_w 1372428108
    //   984: ixor
    //   985: goto -> 996
    //   988: ldc2_w -255041262
    //   991: l2i
    //   992: ldc_w 427557623
    //   995: ixor
    //   996: ldc2_w -756564534
    //   999: l2i
    //   1000: ldc_w -1524602093
    //   1003: ixor
    //   1004: ixor
    //   1005: lookupswitch default -> 1032, -1165310773 -> 988, 1945141177 -> 4355
    //   1032: aload_0
    //   1033: getstatic Perryc.1 : I
    //   1036: ifeq -> 1050
    //   1039: ldc2_w 29392268
    //   1042: l2i
    //   1043: ldc_w -1473240154
    //   1046: ixor
    //   1047: goto -> 1058
    //   1050: ldc2_w 880266173
    //   1053: l2i
    //   1054: ldc_w -763405524
    //   1057: ixor
    //   1058: ldc2_w -757136152
    //   1061: l2i
    //   1062: ldc_w -1580985451
    //   1065: ixor
    //   1066: ixor
    //   1067: lookupswitch default -> 4391, -1793882132 -> 1092, -622114473 -> 1050
    //   1092: getfield field_72448_b : D
    //   1095: getstatic Perryc.0 : I
    //   1098: ifle -> 1112
    //   1101: ldc2_w 944464983
    //   1104: l2i
    //   1105: ldc_w -1276583648
    //   1108: ixor
    //   1109: goto -> 1120
    //   1112: ldc2_w -2032450830
    //   1115: l2i
    //   1116: ldc_w 1677949205
    //   1119: ixor
    //   1120: ldc2_w 253429415
    //   1123: l2i
    //   1124: ldc_w -1471639573
    //   1127: ixor
    //   1128: ixor
    //   1129: lookupswitch default -> 4439, 753929275 -> 1112, 1166783147 -> 1156
    //   1156: aload_0
    //   1157: getstatic Perryc.0 : I
    //   1160: ifle -> 1174
    //   1163: ldc2_w -483817543
    //   1166: l2i
    //   1167: ldc_w -1339375767
    //   1170: ixor
    //   1171: goto -> 1182
    //   1174: ldc2_w -1845699471
    //   1177: l2i
    //   1178: ldc_w 1758336499
    //   1181: ixor
    //   1182: ldc2_w -1876958198
    //   1185: l2i
    //   1186: ldc_w 856804593
    //   1189: ixor
    //   1190: ixor
    //   1191: lookupswitch default -> 1216, -1141186376 -> 1174, -267579349 -> 4401
    //   1216: getfield field_72450_a : D
    //   1219: ldc2_w 1.7257661740605127E308
    //   1222: invokestatic doubleToLongBits : (D)J
    //   1225: ldc2_w 9218508052879728863
    //   1228: lxor
    //   1229: invokestatic longBitsToDouble : (J)D
    //   1232: dcmpl
    //   1233: ifeq -> 1247
    //   1236: ldc2_w -1085986442
    //   1239: l2i
    //   1240: ldc_w 874863602
    //   1243: ixor
    //   1244: goto -> 1255
    //   1247: ldc2_w 518828174
    //   1250: l2i
    //   1251: ldc_w -1785937399
    //   1254: ixor
    //   1255: ldc2_w 1917404238
    //   1258: l2i
    //   1259: ldc_w 1830512251
    //   1262: ixor
    //   1263: ixor
    //   1264: tableswitch default -> 1236, -1808641871 -> 1288, -1808641870 -> 1414
    //   1288: getstatic Perryc.1 : I
    //   1291: ifeq -> 1305
    //   1294: ldc2_w -2085055821
    //   1297: l2i
    //   1298: ldc_w -388845732
    //   1301: ixor
    //   1302: goto -> 1313
    //   1305: ldc2_w 1122414117
    //   1308: l2i
    //   1309: ldc_w -1272458175
    //   1312: ixor
    //   1313: ldc2_w 2088674626
    //   1316: l2i
    //   1317: ldc_w 325154224
    //   1320: ixor
    //   1321: ixor
    //   1322: lookupswitch default -> 4347, -1713460586 -> 1348, 74837277 -> 1305
    //   1348: aload_0
    //   1349: getstatic Perryc.1 : I
    //   1352: ifeq -> 1366
    //   1355: ldc2_w 1246344189
    //   1358: l2i
    //   1359: ldc_w -1819678271
    //   1362: ixor
    //   1363: goto -> 1374
    //   1366: ldc2_w -1149668711
    //   1369: l2i
    //   1370: ldc_w -1972021738
    //   1373: ixor
    //   1374: ldc2_w 2139451145
    //   1377: l2i
    //   1378: ldc_w 1064308606
    //   1381: ixor
    //   1382: ixor
    //   1383: lookupswitch default -> 1408, -1724564917 -> 4433, 1390888387 -> 1366
    //   1408: getfield field_72449_c : D
    //   1411: goto -> 1553
    //   1414: getstatic Perryc.1 : I
    //   1417: ifeq -> 1431
    //   1420: ldc2_w -160361482
    //   1423: l2i
    //   1424: ldc_w 752708170
    //   1427: ixor
    //   1428: goto -> 1439
    //   1431: ldc2_w 1812628626
    //   1434: l2i
    //   1435: ldc_w -1658208387
    //   1438: ixor
    //   1439: ldc2_w 18844547
    //   1442: l2i
    //   1443: ldc_w 309594576
    //   1446: ixor
    //   1447: ixor
    //   1448: lookupswitch default -> 1476, -1612479666 -> 1431, -909640721 -> 4361
    //   1476: aload_0
    //   1477: getstatic Perryc.c : I
    //   1480: iflt -> 1494
    //   1483: ldc2_w 491166408
    //   1486: l2i
    //   1487: ldc_w 1639523268
    //   1490: ixor
    //   1491: goto -> 1502
    //   1494: ldc2_w -517445373
    //   1497: l2i
    //   1498: ldc_w -254218241
    //   1501: ixor
    //   1502: ldc2_w -1106693367
    //   1505: l2i
    //   1506: ldc_w -1446239585
    //   1509: ixor
    //   1510: ixor
    //   1511: lookupswitch default -> 4417, 104175466 -> 1536, 1799006362 -> 1494
    //   1536: getfield field_72449_c : D
    //   1539: ldc2_w 0.14005523985084709
    //   1542: invokestatic doubleToLongBits : (D)J
    //   1545: ldc2_w 9205900060525951811
    //   1548: lxor
    //   1549: invokestatic longBitsToDouble : (J)D
    //   1552: dmul
    //   1553: getstatic Perryc.c : I
    //   1556: iflt -> 1570
    //   1559: ldc2_w 1788862774
    //   1562: l2i
    //   1563: ldc_w -838051481
    //   1566: ixor
    //   1567: goto -> 1578
    //   1570: ldc2_w -1958728995
    //   1573: l2i
    //   1574: ldc_w -1978514212
    //   1577: ixor
    //   1578: ldc2_w 182315759
    //   1581: l2i
    //   1582: ldc_w -1691408525
    //   1585: ixor
    //   1586: ixor
    //   1587: lookupswitch default -> 4423, -1868520547 -> 1612, 895579597 -> 1570
    //   1612: goto -> 1616
    //   1615: athrow
    //   1616: invokespecial <init> : (DDD)V
    //   1619: goto -> 1623
    //   1622: athrow
    //   1623: aastore
    //   1624: dup
    //   1625: ldc2_w -1087912421
    //   1628: l2i
    //   1629: ldc_w -1087912423
    //   1632: ixor
    //   1633: new net/minecraft/util/math/Vec3d
    //   1636: dup
    //   1637: getstatic Perryc.c : I
    //   1640: iflt -> 1654
    //   1643: ldc2_w 606377479
    //   1646: l2i
    //   1647: ldc_w 2064442424
    //   1650: ixor
    //   1651: goto -> 1662
    //   1654: ldc2_w -1917083334
    //   1657: l2i
    //   1658: ldc_w 1321666851
    //   1661: ixor
    //   1662: ldc2_w 800737683
    //   1665: l2i
    //   1666: ldc_w 1643103069
    //   1669: ixor
    //   1670: ixor
    //   1671: lookupswitch default -> 1696, 293468401 -> 4337, 482260547 -> 1654
    //   1696: aload_0
    //   1697: getstatic Perryc.c : I
    //   1700: iflt -> 1714
    //   1703: ldc2_w -1562326992
    //   1706: l2i
    //   1707: ldc_w 210053050
    //   1710: ixor
    //   1711: goto -> 1722
    //   1714: ldc2_w 956422842
    //   1717: l2i
    //   1718: ldc_w -310608481
    //   1721: ixor
    //   1722: ldc2_w -452056418
    //   1725: l2i
    //   1726: ldc_w -140220582
    //   1729: ixor
    //   1730: ixor
    //   1731: lookupswitch default -> 1756, -1127243186 -> 4399, 361791719 -> 1714
    //   1756: getfield field_72450_a : D
    //   1759: ldc2_w 1.0363813741445901E308
    //   1762: invokestatic doubleToLongBits : (D)J
    //   1765: ldc2_w 9215053944870072342
    //   1768: lxor
    //   1769: invokestatic longBitsToDouble : (J)D
    //   1772: dcmpl
    //   1773: ifne -> 1787
    //   1776: ldc2_w -26664926
    //   1779: l2i
    //   1780: ldc_w -384661077
    //   1783: ixor
    //   1784: goto -> 1795
    //   1787: ldc2_w 887024997
    //   1790: l2i
    //   1791: ldc_w 598033645
    //   1794: ixor
    //   1795: ldc2_w 641031451
    //   1798: l2i
    //   1799: ldc_w -1227954410
    //   1802: ixor
    //   1803: ixor
    //   1804: tableswitch default -> 1776, -2021649532 -> 1828, -2021649531 -> 1968
    //   1828: getstatic Perryc.c : I
    //   1831: iflt -> 1845
    //   1834: ldc2_w -266641935
    //   1837: l2i
    //   1838: ldc_w 1287780354
    //   1841: ixor
    //   1842: goto -> 1853
    //   1845: ldc2_w 1865144316
    //   1848: l2i
    //   1849: ldc_w 1239013379
    //   1852: ixor
    //   1853: ldc2_w 1739349976
    //   1856: l2i
    //   1857: ldc_w 1017306554
    //   1860: ixor
    //   1861: ixor
    //   1862: lookupswitch default -> 1888, -928248801 -> 1845, -405526639 -> 4447
    //   1888: aload_0
    //   1889: getstatic Perryc.1 : I
    //   1892: ifeq -> 1906
    //   1895: ldc2_w -783692040
    //   1898: l2i
    //   1899: ldc_w 2137280911
    //   1902: ixor
    //   1903: goto -> 1914
    //   1906: ldc2_w 1927297814
    //   1909: l2i
    //   1910: ldc_w -1643110995
    //   1913: ixor
    //   1914: ldc2_w 1852820392
    //   1917: l2i
    //   1918: ldc_w -767105743
    //   1921: ixor
    //   1922: ixor
    //   1923: lookupswitch default -> 4379, 302297582 -> 1906, 1356400674 -> 1948
    //   1948: getfield field_72450_a : D
    //   1951: ldc2_w 7.845950585941781
    //   1954: invokestatic doubleToLongBits : (D)J
    //   1957: ldc2_w 9218694993006468002
    //   1960: lxor
    //   1961: invokestatic longBitsToDouble : (J)D
    //   1964: dadd
    //   1965: goto -> 2091
    //   1968: getstatic Perryc.0 : I
    //   1971: ifle -> 1985
    //   1974: ldc2_w -1149365011
    //   1977: l2i
    //   1978: ldc_w -863650893
    //   1981: ixor
    //   1982: goto -> 1993
    //   1985: ldc2_w -95085778
    //   1988: l2i
    //   1989: ldc_w -1642062682
    //   1992: ixor
    //   1993: ldc2_w 1901257033
    //   1996: l2i
    //   1997: ldc_w 1649808899
    //   2000: ixor
    //   2001: ixor
    //   2002: lookupswitch default -> 2028, -175976698 -> 1985, 1694455828 -> 4345
    //   2028: aload_0
    //   2029: getstatic Perryc.0 : I
    //   2032: ifle -> 2046
    //   2035: ldc2_w 2028117960
    //   2038: l2i
    //   2039: ldc_w 1938300561
    //   2042: ixor
    //   2043: goto -> 2054
    //   2046: ldc2_w 576131646
    //   2049: l2i
    //   2050: ldc_w 393551263
    //   2053: ixor
    //   2054: ldc2_w 901957574
    //   2057: l2i
    //   2058: ldc_w 1230282823
    //   2061: ixor
    //   2062: ixor
    //   2063: lookupswitch default -> 2088, 8469069 -> 2046, 2013062872 -> 4393
    //   2088: getfield field_72450_a : D
    //   2091: getstatic Perryc.0 : I
    //   2094: ifle -> 2108
    //   2097: ldc2_w -1284689353
    //   2100: l2i
    //   2101: ldc_w -1365335047
    //   2104: ixor
    //   2105: goto -> 2116
    //   2108: ldc2_w 424285091
    //   2111: l2i
    //   2112: ldc_w 866713786
    //   2115: ixor
    //   2116: ldc2_w 337934294
    //   2119: l2i
    //   2120: ldc_w -536061861
    //   2123: ixor
    //   2124: ixor
    //   2125: lookupswitch default -> 4381, -557106028 -> 2152, -371474877 -> 2108
    //   2152: aload_0
    //   2153: getstatic Perryc.1 : I
    //   2156: ifeq -> 2170
    //   2159: ldc2_w -1512144299
    //   2162: l2i
    //   2163: ldc_w 507818159
    //   2166: ixor
    //   2167: goto -> 2178
    //   2170: ldc2_w 1336296914
    //   2173: l2i
    //   2174: ldc_w 2021492077
    //   2177: ixor
    //   2178: ldc2_w 1639288269
    //   2181: l2i
    //   2182: ldc_w -925127493
    //   2185: ixor
    //   2186: ixor
    //   2187: lookupswitch default -> 2212, -278560101 -> 2170, 317985676 -> 4341
    //   2212: getfield field_72448_b : D
    //   2215: getstatic Perryc.1 : I
    //   2218: ifeq -> 2232
    //   2221: ldc2_w -1993599766
    //   2224: l2i
    //   2225: ldc_w -369971426
    //   2228: ixor
    //   2229: goto -> 2240
    //   2232: ldc2_w 685155582
    //   2235: l2i
    //   2236: ldc_w -692785817
    //   2239: ixor
    //   2240: ldc2_w 920471469
    //   2243: l2i
    //   2244: ldc_w 858808946
    //   2247: ixor
    //   2248: ixor
    //   2249: lookupswitch default -> 2276, 1697881643 -> 4377, 2058120774 -> 2232
    //   2276: aload_0
    //   2277: getstatic Perryc.0 : I
    //   2280: ifle -> 2294
    //   2283: ldc2_w -1951819321
    //   2286: l2i
    //   2287: ldc_w -688205552
    //   2290: ixor
    //   2291: goto -> 2302
    //   2294: ldc2_w -1732471559
    //   2297: l2i
    //   2298: ldc_w -1278588166
    //   2301: ixor
    //   2302: ldc2_w -1228430602
    //   2305: l2i
    //   2306: ldc_w -1254964177
    //   2309: ixor
    //   2310: ixor
    //   2311: lookupswitch default -> 2336, 1587949070 -> 4425, 1667018091 -> 2294
    //   2336: getfield field_72450_a : D
    //   2339: ldc2_w 6.018832577051757E305
    //   2342: invokestatic doubleToLongBits : (D)J
    //   2345: ldc2_w 9181552603395376127
    //   2348: lxor
    //   2349: invokestatic longBitsToDouble : (J)D
    //   2352: dcmpl
    //   2353: ifne -> 2367
    //   2356: ldc2_w 1967625286
    //   2359: l2i
    //   2360: ldc_w -2066755205
    //   2363: ixor
    //   2364: goto -> 2375
    //   2367: ldc2_w 1129960248
    //   2370: l2i
    //   2371: ldc_w -1294887418
    //   2374: ixor
    //   2375: ldc2_w -1353568079
    //   2378: l2i
    //   2379: ldc_w -973727379
    //   2382: ixor
    //   2383: ixor
    //   2384: tableswitch default -> 2356, -1691587359 -> 2408, -1691587358 -> 2534
    //   2408: getstatic Perryc.c : I
    //   2411: iflt -> 2425
    //   2414: ldc2_w -42822421
    //   2417: l2i
    //   2418: ldc_w -376895306
    //   2421: ixor
    //   2422: goto -> 2433
    //   2425: ldc2_w 1448920943
    //   2428: l2i
    //   2429: ldc_w -838324617
    //   2432: ixor
    //   2433: ldc2_w -6707558
    //   2436: l2i
    //   2437: ldc_w 180723378
    //   2440: ixor
    //   2441: ixor
    //   2442: lookupswitch default -> 4369, -509107083 -> 2425, 1829294384 -> 2468
    //   2468: aload_0
    //   2469: getstatic Perryc.1 : I
    //   2472: ifeq -> 2486
    //   2475: ldc2_w -1509121229
    //   2478: l2i
    //   2479: ldc_w 509034850
    //   2482: ixor
    //   2483: goto -> 2494
    //   2486: ldc2_w 1032694654
    //   2489: l2i
    //   2490: ldc_w -24890242
    //   2493: ixor
    //   2494: ldc2_w 677979224
    //   2497: l2i
    //   2498: ldc_w 371410061
    //   2501: ixor
    //   2502: ixor
    //   2503: lookupswitch default -> 4419, -2045672828 -> 2486, -45875243 -> 2528
    //   2528: getfield field_72449_c : D
    //   2531: goto -> 2673
    //   2534: getstatic Perryc.c : I
    //   2537: iflt -> 2551
    //   2540: ldc2_w -97288297
    //   2543: l2i
    //   2544: ldc_w -128685240
    //   2547: ixor
    //   2548: goto -> 2559
    //   2551: ldc2_w -653444592
    //   2554: l2i
    //   2555: ldc_w -1021145951
    //   2558: ixor
    //   2559: ldc2_w -1408841739
    //   2562: l2i
    //   2563: ldc_w -226404202
    //   2566: ixor
    //   2567: ixor
    //   2568: lookupswitch default -> 2596, 1558219708 -> 4353, 1886172450 -> 2551
    //   2596: aload_0
    //   2597: getstatic Perryc.c : I
    //   2600: iflt -> 2614
    //   2603: ldc2_w 2021574673
    //   2606: l2i
    //   2607: ldc_w -1938964362
    //   2610: ixor
    //   2611: goto -> 2622
    //   2614: ldc2_w 705516044
    //   2617: l2i
    //   2618: ldc_w -530417994
    //   2621: ixor
    //   2622: ldc2_w -960317416
    //   2625: l2i
    //   2626: ldc_w -865457891
    //   2629: ixor
    //   2630: ixor
    //   2631: lookupswitch default -> 2656, -21259934 -> 4375, 1845089500 -> 2614
    //   2656: getfield field_72449_c : D
    //   2659: ldc2_w 6.030437331089044
    //   2662: invokestatic doubleToLongBits : (D)J
    //   2665: ldc2_w 9216650906801957757
    //   2668: lxor
    //   2669: invokestatic longBitsToDouble : (J)D
    //   2672: dadd
    //   2673: getstatic Perryc.0 : I
    //   2676: ifle -> 2690
    //   2679: ldc2_w 1720874615
    //   2682: l2i
    //   2683: ldc_w 64202738
    //   2686: ixor
    //   2687: goto -> 2698
    //   2690: ldc2_w 1925568673
    //   2693: l2i
    //   2694: ldc_w 1213106293
    //   2697: ixor
    //   2698: ldc2_w 2100444130
    //   2701: l2i
    //   2702: ldc_w -1659759429
    //   2705: ixor
    //   2706: ixor
    //   2707: lookupswitch default -> 4413, -2057175332 -> 2690, -626294899 -> 2732
    //   2732: goto -> 2736
    //   2735: athrow
    //   2736: invokespecial <init> : (DDD)V
    //   2739: goto -> 2743
    //   2742: athrow
    //   2743: aastore
    //   2744: dup
    //   2745: ldc2_w -900913577
    //   2748: l2i
    //   2749: ldc_w -900913580
    //   2752: ixor
    //   2753: new net/minecraft/util/math/Vec3d
    //   2756: dup
    //   2757: getstatic Perryc.0 : I
    //   2760: ifle -> 2774
    //   2763: ldc2_w 1981490557
    //   2766: l2i
    //   2767: ldc_w 476021507
    //   2770: ixor
    //   2771: goto -> 2782
    //   2774: ldc2_w -985228441
    //   2777: l2i
    //   2778: ldc_w 1082474874
    //   2781: ixor
    //   2782: ldc2_w 38968578
    //   2785: l2i
    //   2786: ldc_w 2049610553
    //   2789: ixor
    //   2790: ixor
    //   2791: lookupswitch default -> 2816, 305965125 -> 4339, 2089453422 -> 2774
    //   2816: aload_0
    //   2817: getstatic Perryc.c : I
    //   2820: iflt -> 2834
    //   2823: ldc2_w -197235112
    //   2826: l2i
    //   2827: ldc_w -1965292890
    //   2830: ixor
    //   2831: goto -> 2842
    //   2834: ldc2_w -1171526582
    //   2837: l2i
    //   2838: ldc_w -1124893944
    //   2841: ixor
    //   2842: ldc2_w 1042829484
    //   2845: l2i
    //   2846: ldc_w -367092279
    //   2849: ixor
    //   2850: ixor
    //   2851: lookupswitch default -> 4435, -1428905573 -> 2834, -756131289 -> 2876
    //   2876: getfield field_72450_a : D
    //   2879: ldc2_w 1.620521214652492E308
    //   2882: invokestatic doubleToLongBits : (D)J
    //   2885: ldc2_w 9217980731335488904
    //   2888: lxor
    //   2889: invokestatic longBitsToDouble : (J)D
    //   2892: dcmpl
    //   2893: ifne -> 2907
    //   2896: ldc2_w -730268115
    //   2899: l2i
    //   2900: ldc_w -761930366
    //   2903: ixor
    //   2904: goto -> 2915
    //   2907: ldc2_w 2118243359
    //   2910: l2i
    //   2911: ldc_w 2024601521
    //   2914: ixor
    //   2915: ldc2_w -1897119213
    //   2918: l2i
    //   2919: ldc_w -1128062216
    //   2922: ixor
    //   2923: ixor
    //   2924: tableswitch default -> 2896, 885146436 -> 2948, 885146437 -> 3088
    //   2948: getstatic Perryc.c : I
    //   2951: iflt -> 2965
    //   2954: ldc2_w 1193384860
    //   2957: l2i
    //   2958: ldc_w -195030256
    //   2961: ixor
    //   2962: goto -> 2973
    //   2965: ldc2_w 2025549299
    //   2968: l2i
    //   2969: ldc_w -1919872813
    //   2972: ixor
    //   2973: ldc2_w 985165119
    //   2976: l2i
    //   2977: ldc_w 553181846
    //   2980: ixor
    //   2981: ixor
    //   2982: lookupswitch default -> 3008, -1459550427 -> 4383, 534448117 -> 2965
    //   3008: aload_0
    //   3009: getstatic Perryc.1 : I
    //   3012: ifeq -> 3026
    //   3015: ldc2_w 1985357574
    //   3018: l2i
    //   3019: ldc_w -365192491
    //   3022: ixor
    //   3023: goto -> 3034
    //   3026: ldc2_w -2144470523
    //   3029: l2i
    //   3030: ldc_w -163725611
    //   3033: ixor
    //   3034: ldc2_w 1940395911
    //   3037: l2i
    //   3038: ldc_w -1486922473
    //   3041: ixor
    //   3042: ixor
    //   3043: lookupswitch default -> 4441, -1561915840 -> 3068, 1218115395 -> 3026
    //   3068: getfield field_72450_a : D
    //   3071: ldc2_w 4.800524978252375
    //   3074: invokestatic doubleToLongBits : (D)J
    //   3077: ldc2_w 9215266148598474359
    //   3080: lxor
    //   3081: invokestatic longBitsToDouble : (J)D
    //   3084: dsub
    //   3085: goto -> 3211
    //   3088: getstatic Perryc.c : I
    //   3091: iflt -> 3105
    //   3094: ldc2_w 1009515362
    //   3097: l2i
    //   3098: ldc_w 416754338
    //   3101: ixor
    //   3102: goto -> 3113
    //   3105: ldc2_w -956265349
    //   3108: l2i
    //   3109: ldc_w 1452160271
    //   3112: ixor
    //   3113: ldc2_w -2007273
    //   3116: l2i
    //   3117: ldc_w 319165923
    //   3120: ixor
    //   3121: ixor
    //   3122: lookupswitch default -> 4427, -937714892 -> 3105, 2104095616 -> 3148
    //   3148: aload_0
    //   3149: getstatic Perryc.c : I
    //   3152: iflt -> 3166
    //   3155: ldc2_w 1590908817
    //   3158: l2i
    //   3159: ldc_w 502975337
    //   3162: ixor
    //   3163: goto -> 3174
    //   3166: ldc2_w -1016492463
    //   3169: l2i
    //   3170: ldc_w 1146287712
    //   3173: ixor
    //   3174: ldc2_w -243123965
    //   3177: l2i
    //   3178: ldc_w 1885738567
    //   3181: ixor
    //   3182: ixor
    //   3183: lookupswitch default -> 4357, -1026706500 -> 3166, 115300213 -> 3208
    //   3208: getfield field_72450_a : D
    //   3211: getstatic Perryc.1 : I
    //   3214: ifeq -> 3228
    //   3217: ldc2_w 1752095276
    //   3220: l2i
    //   3221: ldc_w 1393134495
    //   3224: ixor
    //   3225: goto -> 3236
    //   3228: ldc2_w -675500313
    //   3231: l2i
    //   3232: ldc_w 40480379
    //   3235: ixor
    //   3236: ldc2_w 1047007534
    //   3239: l2i
    //   3240: ldc_w -1596111154
    //   3243: ixor
    //   3244: ixor
    //   3245: lookupswitch default -> 3272, -2130212347 -> 3228, -1512962477 -> 4429
    //   3272: aload_0
    //   3273: getstatic Perryc.0 : I
    //   3276: ifle -> 3290
    //   3279: ldc2_w -1021600162
    //   3282: l2i
    //   3283: ldc_w 590192411
    //   3286: ixor
    //   3287: goto -> 3298
    //   3290: ldc2_w -198693724
    //   3293: l2i
    //   3294: ldc_w -2063672749
    //   3297: ixor
    //   3298: ldc2_w 834603824
    //   3301: l2i
    //   3302: ldc_w -523276507
    //   3305: ixor
    //   3306: ixor
    //   3307: lookupswitch default -> 4365, -1582918942 -> 3332, 826697040 -> 3290
    //   3332: getfield field_72448_b : D
    //   3335: getstatic Perryc.0 : I
    //   3338: ifle -> 3352
    //   3341: ldc2_w 54773418
    //   3344: l2i
    //   3345: ldc_w 374795615
    //   3348: ixor
    //   3349: goto -> 3360
    //   3352: ldc2_w -310158586
    //   3355: l2i
    //   3356: ldc_w -2048813906
    //   3359: ixor
    //   3360: ldc2_w -494380638
    //   3363: l2i
    //   3364: ldc_w 859298144
    //   3367: ixor
    //   3368: ixor
    //   3369: lookupswitch default -> 3396, -995448009 -> 4431, -628596659 -> 3352
    //   3396: aload_0
    //   3397: getstatic Perryc.1 : I
    //   3400: ifeq -> 3414
    //   3403: ldc2_w 417020460
    //   3406: l2i
    //   3407: ldc_w 515201404
    //   3410: ixor
    //   3411: goto -> 3422
    //   3414: ldc2_w 2046532703
    //   3417: l2i
    //   3418: ldc_w 8728565
    //   3421: ixor
    //   3422: ldc2_w 433955307
    //   3425: l2i
    //   3426: ldc_w 491869823
    //   3429: ixor
    //   3430: ixor
    //   3431: lookupswitch default -> 4385, 48403652 -> 3414, 2113029182 -> 3456
    //   3456: getfield field_72450_a : D
    //   3459: ldc2_w 1.4888848934220431E308
    //   3462: invokestatic doubleToLongBits : (D)J
    //   3465: ldc2_w 9217321177960393796
    //   3468: lxor
    //   3469: invokestatic longBitsToDouble : (J)D
    //   3472: dcmpl
    //   3473: ifne -> 3487
    //   3476: ldc2_w 834515364
    //   3479: l2i
    //   3480: ldc_w -1696078418
    //   3483: ixor
    //   3484: goto -> 3495
    //   3487: ldc2_w -1405018415
    //   3490: l2i
    //   3491: ldc_w 119229148
    //   3494: ixor
    //   3495: ldc2_w 1603920941
    //   3498: l2i
    //   3499: ldc_w 1635869820
    //   3502: ixor
    //   3503: ixor
    //   3504: tableswitch default -> 3476, -1790782373 -> 3528, -1790782372 -> 3654
    //   3528: getstatic Perryc.1 : I
    //   3531: ifeq -> 3545
    //   3534: ldc2_w 163308950
    //   3537: l2i
    //   3538: ldc_w -592788177
    //   3541: ixor
    //   3542: goto -> 3553
    //   3545: ldc2_w 1014959699
    //   3548: l2i
    //   3549: ldc_w -61457516
    //   3552: ixor
    //   3553: ldc2_w 1204522651
    //   3556: l2i
    //   3557: ldc_w 835827193
    //   3560: ixor
    //   3561: ixor
    //   3562: lookupswitch default -> 3588, -1559553061 -> 4443, 1169034466 -> 3545
    //   3588: aload_0
    //   3589: getstatic Perryc.c : I
    //   3592: iflt -> 3606
    //   3595: ldc2_w 1413189134
    //   3598: l2i
    //   3599: ldc_w -1457043849
    //   3602: ixor
    //   3603: goto -> 3614
    //   3606: ldc2_w 1850530936
    //   3609: l2i
    //   3610: ldc_w 1475350917
    //   3613: ixor
    //   3614: ldc2_w 1501919184
    //   3617: l2i
    //   3618: ldc_w -1362731037
    //   3621: ixor
    //   3622: ixor
    //   3623: lookupswitch default -> 4343, -822090290 -> 3648, 174055498 -> 3606
    //   3648: getfield field_72449_c : D
    //   3651: goto -> 3793
    //   3654: getstatic Perryc.c : I
    //   3657: iflt -> 3671
    //   3660: ldc2_w 679244080
    //   3663: l2i
    //   3664: ldc_w 1566823366
    //   3667: ixor
    //   3668: goto -> 3679
    //   3671: ldc2_w 1832540863
    //   3674: l2i
    //   3675: ldc_w 672239779
    //   3678: ixor
    //   3679: ldc2_w -730656056
    //   3682: l2i
    //   3683: ldc_w -1519972408
    //   3686: ixor
    //   3687: ixor
    //   3688: lookupswitch default -> 3716, 67878902 -> 4363, 1086933151 -> 3671
    //   3716: aload_0
    //   3717: getstatic Perryc.c : I
    //   3720: iflt -> 3734
    //   3723: ldc2_w -1498296145
    //   3726: l2i
    //   3727: ldc_w 1061477398
    //   3730: ixor
    //   3731: goto -> 3742
    //   3734: ldc2_w 1891283603
    //   3737: l2i
    //   3738: ldc_w 837409600
    //   3741: ixor
    //   3742: ldc2_w -1640894421
    //   3745: l2i
    //   3746: ldc_w 1132222918
    //   3749: ixor
    //   3750: ixor
    //   3751: lookupswitch default -> 3776, -1892642938 -> 3734, 1152951636 -> 4421
    //   3776: getfield field_72449_c : D
    //   3779: ldc2_w 31.68784635370444
    //   3782: invokestatic doubleToLongBits : (D)J
    //   3785: ldc2_w 9209773374532343131
    //   3788: lxor
    //   3789: invokestatic longBitsToDouble : (J)D
    //   3792: dsub
    //   3793: getstatic Perryc.1 : I
    //   3796: ifeq -> 3810
    //   3799: ldc2_w -838156608
    //   3802: l2i
    //   3803: ldc_w 669185472
    //   3806: ixor
    //   3807: goto -> 3818
    //   3810: ldc2_w 2124879436
    //   3813: l2i
    //   3814: ldc_w 651788223
    //   3817: ixor
    //   3818: ldc2_w -823241776
    //   3821: l2i
    //   3822: ldc_w 714248273
    //   3825: ixor
    //   3826: ixor
    //   3827: lookupswitch default -> 4359, -1140675982 -> 3852, 227838081 -> 3810
    //   3852: goto -> 3856
    //   3855: athrow
    //   3856: invokespecial <init> : (DDD)V
    //   3859: goto -> 3863
    //   3862: athrow
    //   3863: aastore
    //   3864: dup
    //   3865: ldc2_w -270806174
    //   3868: l2i
    //   3869: ldc_w -270806170
    //   3872: ixor
    //   3873: new net/minecraft/util/math/Vec3d
    //   3876: dup
    //   3877: getstatic Perryc.1 : I
    //   3880: ifeq -> 3894
    //   3883: ldc2_w 1218925135
    //   3886: l2i
    //   3887: ldc_w 387002991
    //   3890: ixor
    //   3891: goto -> 3902
    //   3894: ldc2_w -191080943
    //   3897: l2i
    //   3898: ldc_w 678055806
    //   3901: ixor
    //   3902: ldc2_w 723041412
    //   3905: l2i
    //   3906: ldc_w 650309880
    //   3909: ixor
    //   3910: ixor
    //   3911: lookupswitch default -> 3936, -498917339 -> 3894, 1382820956 -> 4367
    //   3936: aload_0
    //   3937: getstatic Perryc.c : I
    //   3940: iflt -> 3954
    //   3943: ldc2_w -2005489350
    //   3946: l2i
    //   3947: ldc_w -742798054
    //   3950: ixor
    //   3951: goto -> 3962
    //   3954: ldc2_w -1414692796
    //   3957: l2i
    //   3958: ldc_w -2037822197
    //   3961: ixor
    //   3962: ldc2_w 1897877840
    //   3965: l2i
    //   3966: ldc_w -1150967686
    //   3969: ixor
    //   3970: ixor
    //   3971: lookupswitch default -> 3996, -2109953072 -> 3954, -1850370806 -> 4415
    //   3996: getfield field_72450_a : D
    //   3999: getstatic Perryc.c : I
    //   4002: iflt -> 4016
    //   4005: ldc2_w -1507912280
    //   4008: l2i
    //   4009: ldc_w -1104441432
    //   4012: ixor
    //   4013: goto -> 4024
    //   4016: ldc2_w -1825377925
    //   4019: l2i
    //   4020: ldc_w -217570627
    //   4023: ixor
    //   4024: ldc2_w -1857610267
    //   4027: l2i
    //   4028: ldc_w -281411836
    //   4031: ixor
    //   4032: ixor
    //   4033: lookupswitch default -> 4403, 507785511 -> 4060, 1716156641 -> 4016
    //   4060: aload_0
    //   4061: getstatic Perryc.c : I
    //   4064: iflt -> 4078
    //   4067: ldc2_w 58676797
    //   4070: l2i
    //   4071: ldc_w 1497930144
    //   4074: ixor
    //   4075: goto -> 4086
    //   4078: ldc2_w 1543341066
    //   4081: l2i
    //   4082: ldc_w -1927412995
    //   4085: ixor
    //   4086: ldc2_w 1523281385
    //   4089: l2i
    //   4090: ldc_w -2083103129
    //   4093: ixor
    //   4094: ixor
    //   4095: lookupswitch default -> 4437, -2094334957 -> 4078, 268350841 -> 4120
    //   4120: getfield field_72448_b : D
    //   4123: ldc2_w 9.046935347999339
    //   4126: invokestatic doubleToLongBits : (D)J
    //   4129: ldc2_w 9210450610178055673
    //   4132: lxor
    //   4133: invokestatic longBitsToDouble : (J)D
    //   4136: dadd
    //   4137: getstatic Perryc.1 : I
    //   4140: ifeq -> 4154
    //   4143: ldc2_w -909189315
    //   4146: l2i
    //   4147: ldc_w 1928448963
    //   4150: ixor
    //   4151: goto -> 4162
    //   4154: ldc2_w 1115156566
    //   4157: l2i
    //   4158: ldc_w -564371777
    //   4161: ixor
    //   4162: ldc2_w -54153911
    //   4165: l2i
    //   4166: ldc_w -1270838274
    //   4169: ixor
    //   4170: ixor
    //   4171: lookupswitch default -> 4371, -726759330 -> 4196, -205901239 -> 4154
    //   4196: aload_0
    //   4197: getstatic Perryc.1 : I
    //   4200: ifeq -> 4214
    //   4203: ldc2_w 472868674
    //   4206: l2i
    //   4207: ldc_w -216386572
    //   4210: ixor
    //   4211: goto -> 4222
    //   4214: ldc2_w -1427111131
    //   4217: l2i
    //   4218: ldc_w 417877125
    //   4221: ixor
    //   4222: ldc2_w 2085517819
    //   4225: l2i
    //   4226: ldc_w 290749836
    //   4229: ixor
    //   4230: ixor
    //   4231: lookupswitch default -> 4395, -2110828351 -> 4214, -553497641 -> 4256
    //   4256: getfield field_72449_c : D
    //   4259: getstatic Perryc.c : I
    //   4262: iflt -> 4276
    //   4265: ldc2_w 1522999142
    //   4268: l2i
    //   4269: ldc_w 1848099033
    //   4272: ixor
    //   4273: goto -> 4284
    //   4276: ldc2_w 1630597041
    //   4279: l2i
    //   4280: ldc_w 1588056188
    //   4283: ixor
    //   4284: ldc2_w -545175856
    //   4287: l2i
    //   4288: ldc_w 1922134512
    //   4291: ixor
    //   4292: ixor
    //   4293: lookupswitch default -> 4449, -1836644115 -> 4320, -1712265057 -> 4276
    //   4320: goto -> 4324
    //   4323: athrow
    //   4324: invokespecial <init> : (DDD)V
    //   4327: goto -> 4331
    //   4330: athrow
    //   4331: aastore
    //   4332: areturn
    //   4333: aconst_null
    //   4334: athrow
    //   4335: aconst_null
    //   4336: athrow
    //   4337: aconst_null
    //   4338: athrow
    //   4339: aconst_null
    //   4340: athrow
    //   4341: aconst_null
    //   4342: athrow
    //   4343: aconst_null
    //   4344: athrow
    //   4345: aconst_null
    //   4346: athrow
    //   4347: aconst_null
    //   4348: athrow
    //   4349: aconst_null
    //   4350: athrow
    //   4351: aconst_null
    //   4352: athrow
    //   4353: aconst_null
    //   4354: athrow
    //   4355: aconst_null
    //   4356: athrow
    //   4357: aconst_null
    //   4358: athrow
    //   4359: aconst_null
    //   4360: athrow
    //   4361: aconst_null
    //   4362: athrow
    //   4363: aconst_null
    //   4364: athrow
    //   4365: aconst_null
    //   4366: athrow
    //   4367: aconst_null
    //   4368: athrow
    //   4369: aconst_null
    //   4370: athrow
    //   4371: aconst_null
    //   4372: athrow
    //   4373: aconst_null
    //   4374: athrow
    //   4375: aconst_null
    //   4376: athrow
    //   4377: aconst_null
    //   4378: athrow
    //   4379: aconst_null
    //   4380: athrow
    //   4381: aconst_null
    //   4382: athrow
    //   4383: aconst_null
    //   4384: athrow
    //   4385: aconst_null
    //   4386: athrow
    //   4387: aconst_null
    //   4388: athrow
    //   4389: aconst_null
    //   4390: athrow
    //   4391: aconst_null
    //   4392: athrow
    //   4393: aconst_null
    //   4394: athrow
    //   4395: aconst_null
    //   4396: athrow
    //   4397: aconst_null
    //   4398: athrow
    //   4399: aconst_null
    //   4400: athrow
    //   4401: aconst_null
    //   4402: athrow
    //   4403: aconst_null
    //   4404: athrow
    //   4405: aconst_null
    //   4406: athrow
    //   4407: aconst_null
    //   4408: athrow
    //   4409: aconst_null
    //   4410: athrow
    //   4411: aconst_null
    //   4412: athrow
    //   4413: aconst_null
    //   4414: athrow
    //   4415: aconst_null
    //   4416: athrow
    //   4417: aconst_null
    //   4418: athrow
    //   4419: aconst_null
    //   4420: athrow
    //   4421: aconst_null
    //   4422: athrow
    //   4423: aconst_null
    //   4424: athrow
    //   4425: aconst_null
    //   4426: athrow
    //   4427: aconst_null
    //   4428: athrow
    //   4429: aconst_null
    //   4430: athrow
    //   4431: aconst_null
    //   4432: athrow
    //   4433: aconst_null
    //   4434: athrow
    //   4435: aconst_null
    //   4436: athrow
    //   4437: aconst_null
    //   4438: athrow
    //   4439: aconst_null
    //   4440: athrow
    //   4441: aconst_null
    //   4442: athrow
    //   4443: aconst_null
    //   4444: athrow
    //   4445: aconst_null
    //   4446: athrow
    //   4447: aconst_null
    //   4448: athrow
    //   4449: aconst_null
    //   4450: athrow
    //   4451: pop
    //   4452: goto -> 24
    //   4455: pop
    //   4456: aconst_null
    //   4457: goto -> 4451
    //   4460: dup
    //   4461: ifnull -> 4451
    //   4464: checkcast java/lang/Throwable
    //   4467: athrow
    //   4468: dup
    //   4469: ifnull -> 4455
    //   4472: checkcast java/lang/Throwable
    //   4475: athrow
    //   4476: aconst_null
    //   4477: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	4309	0	vec3d	Lnet/minecraft/util/math/Vec3d;
    // Exception table:
    //   from	to	target	type
    //   8	20	4460	finally
    //   495	502	502	finally
    //   495	502	3	finally
    //   496	502	495	java/lang/IllegalStateException
    //   496	502	495	finally
    //   496	502	502	java/lang/EnumConstantNotPresentException
    //   1615	1622	1622	finally
    //   1615	1622	3	java/lang/EnumConstantNotPresentException
    //   1615	1622	1622	finally
    //   1616	1622	1622	java/lang/NumberFormatException
    //   1616	1622	1615	java/lang/AssertionError
    //   2736	2742	2742	finally
    //   2736	2742	3	finally
    //   2736	2742	3	finally
    //   2736	2742	2742	java/util/ConcurrentModificationException
    //   2736	2742	3	java/lang/IndexOutOfBoundsException
    //   3855	3862	3862	finally
    //   3855	3862	3862	finally
    //   3855	3862	3855	java/lang/UnsupportedOperationException
    //   3855	3862	3855	java/util/NoSuchElementException
    //   3856	3862	3	finally
    //   4323	4330	4330	finally
    //   4323	4330	3	java/lang/EnumConstantNotPresentException
    //   4324	4330	4330	finally
    //   4324	4330	4323	java/lang/NegativeArraySizeException
    //   4324	4330	3	finally
    //   4460	4468	4460	java/lang/UnsupportedOperationException
    //   4476	4478	3	java/lang/NumberFormatException
  }
  
  public static boolean canBreak(BlockPos paramBlockPos) {
    return Perry1.6n(null, (int)1301880381L ^ 0xFAEA54, paramBlockPos);
  }
  
  public static BlockPos[] toBlockPos(Vec3d[] vec3ds) {
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
  
  public static Vec3d[] convertVec3ds(EntityPlayer entity, Vec3d[] input) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 321
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 313
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 305
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 1253748006
    //   33: l2i
    //   34: ldc_w -1276396672
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 918111969
    //   44: l2i
    //   45: ldc_w -697848268
    //   48: ixor
    //   49: ldc2_w -1899988382
    //   52: l2i
    //   53: ldc_w -203151159
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 288, -2072689651 -> 41, -1644512642 -> 84
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w 1439766016
    //   94: l2i
    //   95: ldc_w -2096896574
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -931086897
    //   105: l2i
    //   106: ldc_w -1971248003
    //   109: ixor
    //   110: ldc2_w -1855339141
    //   113: l2i
    //   114: ldc_w 1331238389
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 294, -1674491588 -> 144, 149037900 -> 102
    //   144: goto -> 148
    //   147: athrow
    //   148: invokevirtual func_174791_d : ()Lnet/minecraft/util/math/Vec3d;
    //   151: goto -> 155
    //   154: athrow
    //   155: getstatic Perryc.0 : I
    //   158: ifle -> 172
    //   161: ldc2_w -1647081545
    //   164: l2i
    //   165: ldc_w -1905582455
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w -77553564
    //   175: l2i
    //   176: ldc_w 1239411462
    //   179: ixor
    //   180: ldc2_w -607513963
    //   183: l2i
    //   184: ldc_w -330948556
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 216, 607431583 -> 292, 938700201 -> 172
    //   216: aload_1
    //   217: getstatic Perryc.c : I
    //   220: iflt -> 234
    //   223: ldc2_w -982286358
    //   226: l2i
    //   227: ldc_w -1381145214
    //   230: ixor
    //   231: goto -> 242
    //   234: ldc2_w -1415138359
    //   237: l2i
    //   238: ldc_w 1624853053
    //   241: ixor
    //   242: ldc2_w 1449253779
    //   245: l2i
    //   246: ldc_w -1285973298
    //   249: ixor
    //   250: ixor
    //   251: lookupswitch default -> 276, -1914283211 -> 290, -716334900 -> 234
    //   276: goto -> 280
    //   279: athrow
    //   280: invokestatic convertVec3ds : (Lnet/minecraft/util/math/Vec3d;[Lnet/minecraft/util/math/Vec3d;)[Lnet/minecraft/util/math/Vec3d;
    //   283: goto -> 287
    //   286: athrow
    //   287: areturn
    //   288: aconst_null
    //   289: athrow
    //   290: aconst_null
    //   291: athrow
    //   292: aconst_null
    //   293: athrow
    //   294: aconst_null
    //   295: athrow
    //   296: pop
    //   297: goto -> 24
    //   300: pop
    //   301: aconst_null
    //   302: goto -> 296
    //   305: dup
    //   306: ifnull -> 296
    //   309: checkcast java/lang/Throwable
    //   312: athrow
    //   313: dup
    //   314: ifnull -> 300
    //   317: checkcast java/lang/Throwable
    //   320: athrow
    //   321: aconst_null
    //   322: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	264	0	entity	Lnet/minecraft/entity/player/EntityPlayer;
    //   24	264	1	input	[Lnet/minecraft/util/math/Vec3d;
    // Exception table:
    //   from	to	target	type
    //   8	20	305	finally
    //   148	154	154	finally
    //   148	154	154	finally
    //   148	154	154	finally
    //   148	154	154	finally
    //   148	154	3	finally
    //   279	286	286	finally
    //   279	286	279	finally
    //   279	286	286	finally
    //   279	286	279	java/lang/NumberFormatException
    //   280	286	279	finally
    //   305	313	305	finally
    //   321	323	3	java/lang/NegativeArraySizeException
  }
  
  public static List getOffsetList(int y, boolean floor) {
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
  
  public static boolean placeBlock(BlockPos pos, EnumHand hand, boolean rotate, boolean packet, boolean isSneaking) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 5045
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 5037
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 5029
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: ldc2_w 1306360296
    //   27: l2i
    //   28: ldc_w 1306360296
    //   31: ixor
    //   32: getstatic Perryc.0 : I
    //   35: ifle -> 49
    //   38: ldc2_w 1685763795
    //   41: l2i
    //   42: ldc_w -874438698
    //   45: ixor
    //   46: goto -> 57
    //   49: ldc2_w 1050731070
    //   52: l2i
    //   53: ldc_w -123475975
    //   56: ixor
    //   57: ldc2_w -1809510175
    //   60: l2i
    //   61: ldc_w 195377095
    //   64: ixor
    //   65: ixor
    //   66: lookupswitch default -> 92, -116026859 -> 49, 807112227 -> 4916
    //   92: istore #5
    //   94: getstatic Perryc.0 : I
    //   97: ifle -> 111
    //   100: ldc2_w -1555547677
    //   103: l2i
    //   104: ldc_w 1986515352
    //   107: ixor
    //   108: goto -> 119
    //   111: ldc2_w 1769269511
    //   114: l2i
    //   115: ldc_w 2068574422
    //   118: ixor
    //   119: ldc2_w 1348649115
    //   122: l2i
    //   123: ldc_w -819556999
    //   126: ixor
    //   127: ixor
    //   128: lookupswitch default -> 4900, -1921297357 -> 156, 1248568729 -> 111
    //   156: aload_0
    //   157: getstatic Perryc.1 : I
    //   160: ifeq -> 174
    //   163: ldc2_w -1857834419
    //   166: l2i
    //   167: ldc_w 1914478953
    //   170: ixor
    //   171: goto -> 182
    //   174: ldc2_w -69984586
    //   177: l2i
    //   178: ldc_w -160327417
    //   181: ixor
    //   182: ldc2_w -1980569176
    //   185: l2i
    //   186: ldc_w -855730244
    //   189: ixor
    //   190: ixor
    //   191: lookupswitch default -> 4996, -1504482000 -> 174, 1219099045 -> 216
    //   216: goto -> 220
    //   219: athrow
    //   220: invokestatic getFirstFacing : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/EnumFacing;
    //   223: goto -> 227
    //   226: athrow
    //   227: getstatic Perryc.c : I
    //   230: iflt -> 244
    //   233: ldc2_w 1645376308
    //   236: l2i
    //   237: ldc_w 858250064
    //   240: ixor
    //   241: goto -> 252
    //   244: ldc2_w -607156268
    //   247: l2i
    //   248: ldc_w -914045607
    //   251: ixor
    //   252: ldc2_w -547542238
    //   255: l2i
    //   256: ldc_w -979043711
    //   259: ixor
    //   260: ixor
    //   261: lookupswitch default -> 4918, 145920814 -> 288, 1271691719 -> 244
    //   288: astore #6
    //   290: getstatic Perryc.1 : I
    //   293: ifeq -> 307
    //   296: ldc2_w 65631888
    //   299: l2i
    //   300: ldc_w 754015539
    //   303: ixor
    //   304: goto -> 315
    //   307: ldc2_w 299814256
    //   310: l2i
    //   311: ldc_w -1835390040
    //   314: ixor
    //   315: ldc2_w 593210949
    //   318: l2i
    //   319: ldc_w 339979672
    //   322: ixor
    //   323: ixor
    //   324: lookupswitch default -> 352, -2014377958 -> 307, 402663550 -> 4960
    //   352: aload #6
    //   354: ifnonnull -> 368
    //   357: ldc2_w 46081830
    //   360: l2i
    //   361: ldc_w -1120672601
    //   364: ixor
    //   365: goto -> 376
    //   368: ldc2_w -1488536383
    //   371: l2i
    //   372: ldc_w 415924033
    //   375: ixor
    //   376: ldc2_w -996215103
    //   379: l2i
    //   380: ldc_w -24070370
    //   383: ixor
    //   384: ixor
    //   385: tableswitch default -> 357, -2055044514 -> 408, -2055044513 -> 471
    //   408: getstatic Perryc.1 : I
    //   411: ifeq -> 425
    //   414: ldc2_w -404989188
    //   417: l2i
    //   418: ldc_w -1124300469
    //   421: ixor
    //   422: goto -> 433
    //   425: ldc2_w -1984953346
    //   428: l2i
    //   429: ldc_w -1709303197
    //   432: ixor
    //   433: ldc2_w 1225065934
    //   436: l2i
    //   437: ldc_w -1872588200
    //   440: ixor
    //   441: ixor
    //   442: lookupswitch default -> 468, -2109258719 -> 4976, -1660716274 -> 425
    //   468: iload #4
    //   470: ireturn
    //   471: getstatic Perryc.1 : I
    //   474: ifeq -> 488
    //   477: ldc2_w -792919909
    //   480: l2i
    //   481: ldc_w 836753680
    //   484: ixor
    //   485: goto -> 496
    //   488: ldc2_w 2025781858
    //   491: l2i
    //   492: ldc_w -1694278994
    //   495: ixor
    //   496: ldc2_w 1674487945
    //   499: l2i
    //   500: ldc_w -502832137
    //   503: ixor
    //   504: ixor
    //   505: lookupswitch default -> 4930, 1621824245 -> 488, 1651796914 -> 532
    //   532: aload_0
    //   533: getstatic Perryc.1 : I
    //   536: ifeq -> 550
    //   539: ldc2_w -1123086218
    //   542: l2i
    //   543: ldc_w -1320186897
    //   546: ixor
    //   547: goto -> 558
    //   550: ldc2_w 700366639
    //   553: l2i
    //   554: ldc_w -110917133
    //   557: ixor
    //   558: ldc2_w -205396565
    //   561: l2i
    //   562: ldc_w -151891633
    //   565: ixor
    //   566: ixor
    //   567: lookupswitch default -> 4920, -705789384 -> 592, 158543741 -> 550
    //   592: aload #6
    //   594: getstatic Perryc.c : I
    //   597: iflt -> 611
    //   600: ldc2_w 1465034061
    //   603: l2i
    //   604: ldc_w -549031612
    //   607: ixor
    //   608: goto -> 619
    //   611: ldc2_w 544385478
    //   614: l2i
    //   615: ldc_w -831277482
    //   618: ixor
    //   619: ldc2_w -751970347
    //   622: l2i
    //   623: ldc_w 1940802603
    //   626: ixor
    //   627: ixor
    //   628: lookupswitch default -> 656, 681005047 -> 4914, 1054755415 -> 611
    //   656: goto -> 660
    //   659: athrow
    //   660: invokevirtual func_177972_a : (Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
    //   663: goto -> 667
    //   666: athrow
    //   667: getstatic Perryc.1 : I
    //   670: ifeq -> 684
    //   673: ldc2_w -1262042817
    //   676: l2i
    //   677: ldc_w -1108014198
    //   680: ixor
    //   681: goto -> 692
    //   684: ldc2_w 120921650
    //   687: l2i
    //   688: ldc_w -910859312
    //   691: ixor
    //   692: ldc2_w 838304867
    //   695: l2i
    //   696: ldc_w -1871068122
    //   699: ixor
    //   700: ixor
    //   701: lookupswitch default -> 728, -1463973136 -> 4988, -1006656152 -> 684
    //   728: astore #7
    //   730: getstatic Perryc.1 : I
    //   733: ifeq -> 747
    //   736: ldc2_w 1692158267
    //   739: l2i
    //   740: ldc_w -968018290
    //   743: ixor
    //   744: goto -> 755
    //   747: ldc2_w 1858393029
    //   750: l2i
    //   751: ldc_w -1807735794
    //   754: ixor
    //   755: ldc2_w 60068746
    //   758: l2i
    //   759: ldc_w -1089168648
    //   762: ixor
    //   763: ixor
    //   764: lookupswitch default -> 792, -573494383 -> 747, 504460999 -> 4898
    //   792: aload #6
    //   794: getstatic Perryc.0 : I
    //   797: ifle -> 811
    //   800: ldc2_w -249493370
    //   803: l2i
    //   804: ldc_w 2018974816
    //   807: ixor
    //   808: goto -> 819
    //   811: ldc2_w 400287842
    //   814: l2i
    //   815: ldc_w 631851608
    //   818: ixor
    //   819: ldc2_w -1653787171
    //   822: l2i
    //   823: ldc_w -13255519
    //   826: ixor
    //   827: ixor
    //   828: lookupswitch default -> 4902, -349266534 -> 811, 1344940870 -> 856
    //   856: goto -> 860
    //   859: athrow
    //   860: invokevirtual func_176734_d : ()Lnet/minecraft/util/EnumFacing;
    //   863: goto -> 867
    //   866: athrow
    //   867: getstatic Perryc.c : I
    //   870: iflt -> 884
    //   873: ldc2_w 768774897
    //   876: l2i
    //   877: ldc_w 140641508
    //   880: ixor
    //   881: goto -> 892
    //   884: ldc2_w -884769766
    //   887: l2i
    //   888: ldc_w -798055513
    //   891: ixor
    //   892: ldc2_w -1531938566
    //   895: l2i
    //   896: ldc_w -295015310
    //   899: ixor
    //   900: ixor
    //   901: lookupswitch default -> 928, 1759767232 -> 884, 1869251229 -> 4986
    //   928: astore #8
    //   930: new net/minecraft/util/math/Vec3d
    //   933: dup
    //   934: getstatic Perryc.0 : I
    //   937: ifle -> 951
    //   940: ldc2_w 1604469428
    //   943: l2i
    //   944: ldc_w -91132329
    //   947: ixor
    //   948: goto -> 959
    //   951: ldc2_w -358031954
    //   954: l2i
    //   955: ldc_w 1898913707
    //   958: ixor
    //   959: ldc2_w -1477372361
    //   962: l2i
    //   963: ldc_w 1053246228
    //   966: ixor
    //   967: ixor
    //   968: lookupswitch default -> 4936, 45192998 -> 996, 1006991808 -> 951
    //   996: aload #7
    //   998: getstatic Perryc.0 : I
    //   1001: ifle -> 1015
    //   1004: ldc2_w -779160636
    //   1007: l2i
    //   1008: ldc_w -1611476299
    //   1011: ixor
    //   1012: goto -> 1023
    //   1015: ldc2_w -1934293271
    //   1018: l2i
    //   1019: ldc_w -2100293666
    //   1022: ixor
    //   1023: ldc2_w 764296891
    //   1026: l2i
    //   1027: ldc_w -1744077012
    //   1030: ixor
    //   1031: ixor
    //   1032: lookupswitch default -> 1060, -67542810 -> 4934, 346150961 -> 1015
    //   1060: goto -> 1064
    //   1063: athrow
    //   1064: invokespecial <init> : (Lnet/minecraft/util/math/Vec3i;)V
    //   1067: goto -> 1071
    //   1070: athrow
    //   1071: ldc2_w 2.0085454710840542
    //   1074: invokestatic doubleToLongBits : (D)J
    //   1077: ldc2_w 9214384080290229742
    //   1080: lxor
    //   1081: invokestatic longBitsToDouble : (J)D
    //   1084: ldc2_w 3.3435869883232296
    //   1087: invokestatic doubleToLongBits : (D)J
    //   1090: ldc2_w 9217390326530010988
    //   1093: lxor
    //   1094: invokestatic longBitsToDouble : (J)D
    //   1097: ldc2_w 127.50644478408502
    //   1100: invokestatic doubleToLongBits : (D)J
    //   1103: ldc2_w 9205322907484567551
    //   1106: lxor
    //   1107: invokestatic longBitsToDouble : (J)D
    //   1110: getstatic Perryc.0 : I
    //   1113: ifle -> 1127
    //   1116: ldc2_w -1321376073
    //   1119: l2i
    //   1120: ldc_w 2136129839
    //   1123: ixor
    //   1124: goto -> 1135
    //   1127: ldc2_w 1990178971
    //   1130: l2i
    //   1131: ldc_w -911964253
    //   1134: ixor
    //   1135: ldc2_w 2032429702
    //   1138: l2i
    //   1139: ldc_w 2146972052
    //   1142: ixor
    //   1143: ixor
    //   1144: lookupswitch default -> 1172, -927728502 -> 4894, 1571750065 -> 1127
    //   1172: goto -> 1176
    //   1175: athrow
    //   1176: invokevirtual func_72441_c : (DDD)Lnet/minecraft/util/math/Vec3d;
    //   1179: goto -> 1183
    //   1182: athrow
    //   1183: new net/minecraft/util/math/Vec3d
    //   1186: dup
    //   1187: getstatic Perryc.c : I
    //   1190: iflt -> 1204
    //   1193: ldc2_w -303607120
    //   1196: l2i
    //   1197: ldc_w -298025837
    //   1200: ixor
    //   1201: goto -> 1212
    //   1204: ldc2_w 1777295030
    //   1207: l2i
    //   1208: ldc_w 1732319936
    //   1211: ixor
    //   1212: ldc2_w -1763980526
    //   1215: l2i
    //   1216: ldc_w -196545669
    //   1219: ixor
    //   1220: ixor
    //   1221: lookupswitch default -> 4892, 1632114250 -> 1204, 1815968799 -> 1248
    //   1248: aload #8
    //   1250: getstatic Perryc.c : I
    //   1253: iflt -> 1267
    //   1256: ldc2_w 2078413675
    //   1259: l2i
    //   1260: ldc_w 807720905
    //   1263: ixor
    //   1264: goto -> 1275
    //   1267: ldc2_w 1788396749
    //   1270: l2i
    //   1271: ldc_w 888500838
    //   1274: ixor
    //   1275: ldc2_w -1815914185
    //   1278: l2i
    //   1279: ldc_w -1686571462
    //   1282: ixor
    //   1283: ixor
    //   1284: lookupswitch default -> 4950, 1132293039 -> 1267, 1456871846 -> 1312
    //   1312: goto -> 1316
    //   1315: athrow
    //   1316: invokevirtual func_176730_m : ()Lnet/minecraft/util/math/Vec3i;
    //   1319: goto -> 1323
    //   1322: athrow
    //   1323: getstatic Perryc.c : I
    //   1326: iflt -> 1340
    //   1329: ldc2_w 1999351257
    //   1332: l2i
    //   1333: ldc_w 630317498
    //   1336: ixor
    //   1337: goto -> 1348
    //   1340: ldc2_w 385083916
    //   1343: l2i
    //   1344: ldc_w 474431633
    //   1347: ixor
    //   1348: ldc2_w 264969856
    //   1351: l2i
    //   1352: ldc_w -1835273620
    //   1355: ixor
    //   1356: ixor
    //   1357: lookupswitch default -> 4958, -1746647439 -> 1384, -806707057 -> 1340
    //   1384: goto -> 1388
    //   1387: athrow
    //   1388: invokespecial <init> : (Lnet/minecraft/util/math/Vec3i;)V
    //   1391: goto -> 1395
    //   1394: athrow
    //   1395: ldc2_w 2.230714375917673
    //   1398: invokestatic doubleToLongBits : (D)J
    //   1401: ldc2_w 9214884360188740740
    //   1404: lxor
    //   1405: invokestatic longBitsToDouble : (J)D
    //   1408: getstatic Perryc.0 : I
    //   1411: ifle -> 1425
    //   1414: ldc2_w -1853920683
    //   1417: l2i
    //   1418: ldc_w -1395953073
    //   1421: ixor
    //   1422: goto -> 1433
    //   1425: ldc2_w 1369522882
    //   1428: l2i
    //   1429: ldc_w 1000051785
    //   1432: ixor
    //   1433: ldc2_w 1939849499
    //   1436: l2i
    //   1437: ldc_w 1595409696
    //   1440: ixor
    //   1441: ixor
    //   1442: lookupswitch default -> 1468, 288611361 -> 4948, 716627145 -> 1425
    //   1468: goto -> 1472
    //   1471: athrow
    //   1472: invokevirtual func_186678_a : (D)Lnet/minecraft/util/math/Vec3d;
    //   1475: goto -> 1479
    //   1478: athrow
    //   1479: getstatic Perryc.0 : I
    //   1482: ifle -> 1496
    //   1485: ldc2_w -1791770361
    //   1488: l2i
    //   1489: ldc_w 1076044355
    //   1492: ixor
    //   1493: goto -> 1504
    //   1496: ldc2_w -195020628
    //   1499: l2i
    //   1500: ldc_w -1302012590
    //   1503: ixor
    //   1504: ldc2_w 1431347641
    //   1507: l2i
    //   1508: ldc_w 329285609
    //   1511: ixor
    //   1512: ixor
    //   1513: lookupswitch default -> 4922, -1814020844 -> 1496, 16006062 -> 1540
    //   1540: goto -> 1544
    //   1543: athrow
    //   1544: invokevirtual func_178787_e : (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
    //   1547: goto -> 1551
    //   1550: athrow
    //   1551: getstatic Perryc.0 : I
    //   1554: ifle -> 1568
    //   1557: ldc2_w -2119258087
    //   1560: l2i
    //   1561: ldc_w -1619785783
    //   1564: ixor
    //   1565: goto -> 1576
    //   1568: ldc2_w 1011344496
    //   1571: l2i
    //   1572: ldc_w -852519102
    //   1575: ixor
    //   1576: ldc2_w -159482882
    //   1579: l2i
    //   1580: ldc_w 527221681
    //   1583: ixor
    //   1584: ixor
    //   1585: lookupswitch default -> 4998, -137883745 -> 1568, 410700669 -> 1612
    //   1612: astore #9
    //   1614: getstatic Perryc.1 : I
    //   1617: ifeq -> 1631
    //   1620: ldc2_w 1703232744
    //   1623: l2i
    //   1624: ldc_w -236652446
    //   1627: ixor
    //   1628: goto -> 1639
    //   1631: ldc2_w 1297019475
    //   1634: l2i
    //   1635: ldc_w 1916420891
    //   1638: ixor
    //   1639: ldc2_w -1048474244
    //   1642: l2i
    //   1643: ldc_w 1248298752
    //   1646: ixor
    //   1647: ixor
    //   1648: lookupswitch default -> 1676, 528987894 -> 4954, 1028194020 -> 1631
    //   1676: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1679: getstatic Perryc.1 : I
    //   1682: ifeq -> 1696
    //   1685: ldc2_w 1851165765
    //   1688: l2i
    //   1689: ldc_w -1316807481
    //   1692: ixor
    //   1693: goto -> 1704
    //   1696: ldc2_w 1205370329
    //   1699: l2i
    //   1700: ldc_w -512743213
    //   1703: ixor
    //   1704: ldc2_w -222265286
    //   1707: l2i
    //   1708: ldc_w -1177963234
    //   1711: ixor
    //   1712: ixor
    //   1713: lookupswitch default -> 4944, -1797479002 -> 1696, -308191186 -> 1740
    //   1740: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1743: getstatic Perryc.0 : I
    //   1746: ifle -> 1760
    //   1749: ldc2_w -2033003628
    //   1752: l2i
    //   1753: ldc_w 1246614339
    //   1756: ixor
    //   1757: goto -> 1768
    //   1760: ldc2_w -1601643846
    //   1763: l2i
    //   1764: ldc_w 1067549241
    //   1767: ixor
    //   1768: ldc2_w -301859680
    //   1771: l2i
    //   1772: ldc_w -1618599656
    //   1775: ixor
    //   1776: ixor
    //   1777: lookupswitch default -> 4942, -1122443921 -> 1760, -290552517 -> 1804
    //   1804: aload #7
    //   1806: getstatic Perryc.c : I
    //   1809: iflt -> 1823
    //   1812: ldc2_w 1659065351
    //   1815: l2i
    //   1816: ldc_w -1258339661
    //   1819: ixor
    //   1820: goto -> 1831
    //   1823: ldc2_w -1080139075
    //   1826: l2i
    //   1827: ldc_w 1608829948
    //   1830: ixor
    //   1831: ldc2_w -51880926
    //   1834: l2i
    //   1835: ldc_w 1387736741
    //   1838: ixor
    //   1839: ixor
    //   1840: lookupswitch default -> 1868, -1994533917 -> 1823, 2017682483 -> 4990
    //   1868: goto -> 1872
    //   1871: athrow
    //   1872: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1875: goto -> 1879
    //   1878: athrow
    //   1879: getstatic Perryc.1 : I
    //   1882: ifeq -> 1896
    //   1885: ldc2_w 136976620
    //   1888: l2i
    //   1889: ldc_w -1259491395
    //   1892: ixor
    //   1893: goto -> 1904
    //   1896: ldc2_w 932249588
    //   1899: l2i
    //   1900: ldc_w 1233384034
    //   1903: ixor
    //   1904: ldc2_w -326202766
    //   1907: l2i
    //   1908: ldc_w -1597541332
    //   1911: ixor
    //   1912: ixor
    //   1913: lookupswitch default -> 4910, -259110641 -> 1896, 844821448 -> 1940
    //   1940: goto -> 1944
    //   1943: athrow
    //   1944: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   1949: goto -> 1953
    //   1952: athrow
    //   1953: getstatic Perryc.0 : I
    //   1956: ifle -> 1970
    //   1959: ldc2_w 312147457
    //   1962: l2i
    //   1963: ldc_w -1855972633
    //   1966: ixor
    //   1967: goto -> 1978
    //   1970: ldc2_w -90990824
    //   1973: l2i
    //   1974: ldc_w 436641310
    //   1977: ixor
    //   1978: ldc2_w -491689638
    //   1981: l2i
    //   1982: ldc_w -793562259
    //   1985: ixor
    //   1986: ixor
    //   1987: lookupswitch default -> 2012, -1309098287 -> 5000, -801430725 -> 1970
    //   2012: astore #10
    //   2014: getstatic Perryc.c : I
    //   2017: iflt -> 2031
    //   2020: ldc2_w -1731492566
    //   2023: l2i
    //   2024: ldc_w -1700497188
    //   2027: ixor
    //   2028: goto -> 2039
    //   2031: ldc2_w -2070918032
    //   2034: l2i
    //   2035: ldc_w 875820172
    //   2038: ixor
    //   2039: ldc2_w 1022070809
    //   2042: l2i
    //   2043: ldc_w -1708284531
    //   2046: ixor
    //   2047: ixor
    //   2048: lookupswitch default -> 4992, -1532376990 -> 2031, 375754088 -> 2076
    //   2076: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2079: getstatic Perryc.0 : I
    //   2082: ifle -> 2096
    //   2085: ldc2_w 619499831
    //   2088: l2i
    //   2089: ldc_w -1221318239
    //   2092: ixor
    //   2093: goto -> 2104
    //   2096: ldc2_w 1628684500
    //   2099: l2i
    //   2100: ldc_w 614697138
    //   2103: ixor
    //   2104: ldc2_w 1582330651
    //   2107: l2i
    //   2108: ldc_w 964720157
    //   2111: ixor
    //   2112: ixor
    //   2113: lookupswitch default -> 2140, -200737392 -> 5002, 474203199 -> 2096
    //   2140: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2143: getstatic Perryc.1 : I
    //   2146: ifeq -> 2160
    //   2149: ldc2_w 770214233
    //   2152: l2i
    //   2153: ldc_w -2079577741
    //   2156: ixor
    //   2157: goto -> 2168
    //   2160: ldc2_w 1451794273
    //   2163: l2i
    //   2164: ldc_w 1163233729
    //   2167: ixor
    //   2168: ldc2_w 1037278818
    //   2171: l2i
    //   2172: ldc_w -420249039
    //   2175: ixor
    //   2176: ixor
    //   2177: lookupswitch default -> 4982, -922940685 -> 2204, 1925495929 -> 2160
    //   2204: goto -> 2208
    //   2207: athrow
    //   2208: invokevirtual func_70093_af : ()Z
    //   2211: goto -> 2215
    //   2214: athrow
    //   2215: ifne -> 2229
    //   2218: ldc2_w 1335333349
    //   2221: l2i
    //   2222: ldc_w 675824838
    //   2225: ixor
    //   2226: goto -> 2237
    //   2229: ldc2_w 1176926638
    //   2232: l2i
    //   2233: ldc_w 570010764
    //   2236: ixor
    //   2237: ldc2_w -1512312816
    //   2240: l2i
    //   2241: ldc_w 632218555
    //   2244: ixor
    //   2245: ixor
    //   2246: tableswitch default -> 2218, -408238456 -> 2268, -408238455 -> 3590
    //   2268: getstatic Perryc.0 : I
    //   2271: ifle -> 2285
    //   2274: ldc2_w -941712668
    //   2277: l2i
    //   2278: ldc_w 858086694
    //   2281: ixor
    //   2282: goto -> 2293
    //   2285: ldc2_w 1016056658
    //   2288: l2i
    //   2289: ldc_w 1478163621
    //   2292: ixor
    //   2293: ldc2_w -4627908
    //   2296: l2i
    //   2297: ldc_w -363550146
    //   2300: ixor
    //   2301: ixor
    //   2302: lookupswitch default -> 2328, -518647872 -> 4984, 1571642551 -> 2285
    //   2328: getstatic bigname/zprestige/webhack/util/BlockUtil.blackList : Ljava/util/List;
    //   2331: getstatic Perryc.0 : I
    //   2334: ifle -> 2348
    //   2337: ldc2_w -1076212460
    //   2340: l2i
    //   2341: ldc_w -2142497390
    //   2344: ixor
    //   2345: goto -> 2356
    //   2348: ldc2_w 1403163063
    //   2351: l2i
    //   2352: ldc_w 228754196
    //   2355: ixor
    //   2356: ldc2_w 887077719
    //   2359: l2i
    //   2360: ldc_w 1303205768
    //   2363: ixor
    //   2364: ixor
    //   2365: lookupswitch default -> 5006, 661847676 -> 2392, 1189393497 -> 2348
    //   2392: aload #10
    //   2394: getstatic Perryc.1 : I
    //   2397: ifeq -> 2411
    //   2400: ldc2_w 882114347
    //   2403: l2i
    //   2404: ldc_w -423331107
    //   2407: ixor
    //   2408: goto -> 2419
    //   2411: ldc2_w 1336798866
    //   2414: l2i
    //   2415: ldc_w 353964567
    //   2418: ixor
    //   2419: ldc2_w -1607480331
    //   2422: l2i
    //   2423: ldc_w 1761747229
    //   2426: ixor
    //   2427: ixor
    //   2428: lookupswitch default -> 4978, -1818683795 -> 2456, 461008670 -> 2411
    //   2456: goto -> 2460
    //   2459: athrow
    //   2460: invokeinterface contains : (Ljava/lang/Object;)Z
    //   2465: goto -> 2469
    //   2468: athrow
    //   2469: ifne -> 2483
    //   2472: ldc2_w -609373946
    //   2475: l2i
    //   2476: ldc_w -1753138603
    //   2479: ixor
    //   2480: goto -> 2491
    //   2483: ldc2_w -300107739
    //   2486: l2i
    //   2487: ldc_w -1573899401
    //   2490: ixor
    //   2491: ldc2_w 383364081
    //   2494: l2i
    //   2495: ldc_w 553012134
    //   2498: ixor
    //   2499: ixor
    //   2500: tableswitch default -> 2472, 2047044356 -> 2524, 2047044357 -> 2780
    //   2524: getstatic Perryc.0 : I
    //   2527: ifle -> 2541
    //   2530: ldc2_w 1105054308
    //   2533: l2i
    //   2534: ldc_w 1418890997
    //   2537: ixor
    //   2538: goto -> 2549
    //   2541: ldc2_w -510426566
    //   2544: l2i
    //   2545: ldc_w 198343819
    //   2548: ixor
    //   2549: ldc2_w -724142437
    //   2552: l2i
    //   2553: ldc_w -1739401154
    //   2556: ixor
    //   2557: ixor
    //   2558: lookupswitch default -> 4924, -1497018348 -> 2584, 1506535988 -> 2541
    //   2584: getstatic bigname/zprestige/webhack/util/BlockUtil.shulkerList : Ljava/util/List;
    //   2587: getstatic Perryc.c : I
    //   2590: iflt -> 2604
    //   2593: ldc2_w -459684704
    //   2596: l2i
    //   2597: ldc_w -168707139
    //   2600: ixor
    //   2601: goto -> 2612
    //   2604: ldc2_w 152492454
    //   2607: l2i
    //   2608: ldc_w -585645603
    //   2611: ixor
    //   2612: ldc2_w 1417961768
    //   2615: l2i
    //   2616: ldc_w 1751605471
    //   2619: ixor
    //   2620: ixor
    //   2621: lookupswitch default -> 4888, -387835508 -> 2648, 764116714 -> 2604
    //   2648: aload #10
    //   2650: getstatic Perryc.0 : I
    //   2653: ifle -> 2667
    //   2656: ldc2_w -561251271
    //   2659: l2i
    //   2660: ldc_w 27502156
    //   2663: ixor
    //   2664: goto -> 2675
    //   2667: ldc2_w -161008272
    //   2670: l2i
    //   2671: ldc_w 800189994
    //   2674: ixor
    //   2675: ldc2_w 1805473751
    //   2678: l2i
    //   2679: ldc_w 66694380
    //   2682: ixor
    //   2683: ixor
    //   2684: lookupswitch default -> 5016, -1313726367 -> 2712, -1219714738 -> 2667
    //   2712: goto -> 2716
    //   2715: athrow
    //   2716: invokeinterface contains : (Ljava/lang/Object;)Z
    //   2721: goto -> 2725
    //   2724: athrow
    //   2725: ifeq -> 2739
    //   2728: ldc2_w -329902446
    //   2731: l2i
    //   2732: ldc_w 401229468
    //   2735: ixor
    //   2736: goto -> 2747
    //   2739: ldc2_w 863296663
    //   2742: l2i
    //   2743: ldc_w -926380904
    //   2746: ixor
    //   2747: ldc2_w 1692652915
    //   2750: l2i
    //   2751: ldc_w 1783140323
    //   2754: ixor
    //   2755: ixor
    //   2756: tableswitch default -> 2728, -183039330 -> 2780, -183039329 -> 3590
    //   2780: getstatic Perryc.1 : I
    //   2783: ifeq -> 2797
    //   2786: ldc2_w 1322013014
    //   2789: l2i
    //   2790: ldc_w 98220889
    //   2793: ixor
    //   2794: goto -> 2805
    //   2797: ldc2_w -1073280024
    //   2800: l2i
    //   2801: ldc_w 769925904
    //   2804: ixor
    //   2805: ldc2_w 1787024109
    //   2808: l2i
    //   2809: ldc_w -716860914
    //   2812: ixor
    //   2813: ixor
    //   2814: lookupswitch default -> 4896, -187651348 -> 2797, 1378183195 -> 2840
    //   2840: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2843: getstatic Perryc.c : I
    //   2846: iflt -> 2860
    //   2849: ldc2_w 941581115
    //   2852: l2i
    //   2853: ldc_w -522923472
    //   2856: ixor
    //   2857: goto -> 2868
    //   2860: ldc2_w 1374868773
    //   2863: l2i
    //   2864: ldc_w 103608892
    //   2867: ixor
    //   2868: ldc2_w 1621355152
    //   2871: l2i
    //   2872: ldc_w 1975011089
    //   2875: ixor
    //   2876: ixor
    //   2877: lookupswitch default -> 4952, -841999222 -> 2860, 1120242328 -> 2904
    //   2904: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2907: getstatic Perryc.0 : I
    //   2910: ifle -> 2924
    //   2913: ldc2_w 1693626263
    //   2916: l2i
    //   2917: ldc_w -872736311
    //   2920: ixor
    //   2921: goto -> 2932
    //   2924: ldc2_w 1197102637
    //   2927: l2i
    //   2928: ldc_w -1306978851
    //   2931: ixor
    //   2932: ldc2_w -1498142212
    //   2935: l2i
    //   2936: ldc_w -737682508
    //   2939: ixor
    //   2940: ixor
    //   2941: lookupswitch default -> 4904, -2014269000 -> 2968, -574995434 -> 2924
    //   2968: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   2971: new net/minecraft/network/play/client/CPacketEntityAction
    //   2974: dup
    //   2975: getstatic Perryc.0 : I
    //   2978: ifle -> 2992
    //   2981: ldc2_w -1782946434
    //   2984: l2i
    //   2985: ldc_w -531334340
    //   2988: ixor
    //   2989: goto -> 3000
    //   2992: ldc2_w 952086709
    //   2995: l2i
    //   2996: ldc_w 973944398
    //   2999: ixor
    //   3000: ldc2_w 1129701306
    //   3003: l2i
    //   3004: ldc_w -1614272398
    //   3007: ixor
    //   3008: ixor
    //   3009: lookupswitch default -> 3036, -1548660363 -> 2992, -1452021366 -> 5008
    //   3036: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   3039: getstatic Perryc.1 : I
    //   3042: ifeq -> 3056
    //   3045: ldc2_w -370719898
    //   3048: l2i
    //   3049: ldc_w 530629617
    //   3052: ixor
    //   3053: goto -> 3064
    //   3056: ldc2_w 68486681
    //   3059: l2i
    //   3060: ldc_w 144659905
    //   3063: ixor
    //   3064: ldc2_w 1552151986
    //   3067: l2i
    //   3068: ldc_w 1272762257
    //   3071: ixor
    //   3072: ixor
    //   3073: lookupswitch default -> 3100, -518473036 -> 4964, 555906625 -> 3056
    //   3100: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3103: getstatic Perryc.1 : I
    //   3106: ifeq -> 3120
    //   3109: ldc2_w 1298504898
    //   3112: l2i
    //   3113: ldc_w 1352620651
    //   3116: ixor
    //   3117: goto -> 3128
    //   3120: ldc2_w -1418946228
    //   3123: l2i
    //   3124: ldc_w -220285690
    //   3127: ixor
    //   3128: ldc2_w 1927356731
    //   3131: l2i
    //   3132: ldc_w -636458433
    //   3135: ixor
    //   3136: ixor
    //   3137: lookupswitch default -> 5010, -1257534035 -> 3120, -247240882 -> 3164
    //   3164: getstatic net/minecraft/network/play/client/CPacketEntityAction$Action.START_SNEAKING : Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
    //   3167: getstatic Perryc.1 : I
    //   3170: ifeq -> 3184
    //   3173: ldc2_w 416914574
    //   3176: l2i
    //   3177: ldc_w -1401022087
    //   3180: ixor
    //   3181: goto -> 3192
    //   3184: ldc2_w 1554599316
    //   3187: l2i
    //   3188: ldc_w 1338135074
    //   3191: ixor
    //   3192: ldc2_w -481057815
    //   3195: l2i
    //   3196: ldc_w 1847342715
    //   3199: ixor
    //   3200: ixor
    //   3201: lookupswitch default -> 3228, 439866108 -> 3184, 971509861 -> 5012
    //   3228: goto -> 3232
    //   3231: athrow
    //   3232: invokespecial <init> : (Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
    //   3235: goto -> 3239
    //   3238: athrow
    //   3239: getstatic Perryc.1 : I
    //   3242: ifeq -> 3256
    //   3245: ldc2_w -41274707
    //   3248: l2i
    //   3249: ldc_w -1221684095
    //   3252: ixor
    //   3253: goto -> 3264
    //   3256: ldc2_w -943906878
    //   3259: l2i
    //   3260: ldc_w 1613723109
    //   3263: ixor
    //   3264: ldc2_w -712824321
    //   3267: l2i
    //   3268: ldc_w -1850989874
    //   3271: ixor
    //   3272: ixor
    //   3273: lookupswitch default -> 4962, -474128106 -> 3300, 244034845 -> 3256
    //   3300: goto -> 3304
    //   3303: athrow
    //   3304: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   3307: goto -> 3311
    //   3310: athrow
    //   3311: getstatic Perryc.1 : I
    //   3314: ifeq -> 3328
    //   3317: ldc2_w 746732232
    //   3320: l2i
    //   3321: ldc_w 108555959
    //   3324: ixor
    //   3325: goto -> 3336
    //   3328: ldc2_w -2094516727
    //   3331: l2i
    //   3332: ldc_w -1191020771
    //   3335: ixor
    //   3336: ldc2_w -417597449
    //   3339: l2i
    //   3340: ldc_w 2031036812
    //   3343: ixor
    //   3344: ixor
    //   3345: lookupswitch default -> 3372, -1259435516 -> 4906, -420684264 -> 3328
    //   3372: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   3375: getstatic Perryc.c : I
    //   3378: iflt -> 3392
    //   3381: ldc2_w -666128380
    //   3384: l2i
    //   3385: ldc_w 1038221701
    //   3388: ixor
    //   3389: goto -> 3400
    //   3392: ldc2_w 2040103883
    //   3395: l2i
    //   3396: ldc_w -1613933440
    //   3399: ixor
    //   3400: ldc2_w 1496937542
    //   3403: l2i
    //   3404: ldc_w 2099126293
    //   3407: ixor
    //   3408: ixor
    //   3409: lookupswitch default -> 3436, -1047599662 -> 4926, 1144626447 -> 3392
    //   3436: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3439: ldc2_w 900481867
    //   3442: l2i
    //   3443: ldc_w 900481866
    //   3446: ixor
    //   3447: getstatic Perryc.0 : I
    //   3450: ifle -> 3464
    //   3453: ldc2_w 8677128
    //   3456: l2i
    //   3457: ldc_w -1288077573
    //   3460: ixor
    //   3461: goto -> 3472
    //   3464: ldc2_w -2082423889
    //   3467: l2i
    //   3468: ldc_w -280172453
    //   3471: ixor
    //   3472: ldc2_w -1526272450
    //   3475: l2i
    //   3476: ldc_w 956819732
    //   3479: ixor
    //   3480: ixor
    //   3481: lookupswitch default -> 3508, -45495986 -> 3464, 800857817 -> 5004
    //   3508: goto -> 3512
    //   3511: athrow
    //   3512: invokevirtual func_70095_a : (Z)V
    //   3515: goto -> 3519
    //   3518: athrow
    //   3519: ldc2_w -1311618079
    //   3522: l2i
    //   3523: ldc_w -1311618080
    //   3526: ixor
    //   3527: getstatic Perryc.0 : I
    //   3530: ifle -> 3544
    //   3533: ldc2_w -221931919
    //   3536: l2i
    //   3537: ldc_w -662384034
    //   3540: ixor
    //   3541: goto -> 3552
    //   3544: ldc2_w -319944080
    //   3547: l2i
    //   3548: ldc_w -1456627991
    //   3551: ixor
    //   3552: ldc2_w 1865887715
    //   3555: l2i
    //   3556: ldc_w 1927769626
    //   3559: ixor
    //   3560: ixor
    //   3561: lookupswitch default -> 4968, 932251094 -> 3544, 1477694816 -> 3588
    //   3588: istore #5
    //   3590: getstatic Perryc.c : I
    //   3593: iflt -> 3607
    //   3596: ldc2_w -1741887023
    //   3599: l2i
    //   3600: ldc_w -1938448600
    //   3603: ixor
    //   3604: goto -> 3615
    //   3607: ldc2_w -75475583
    //   3610: l2i
    //   3611: ldc_w 374139284
    //   3614: ixor
    //   3615: ldc2_w 521875257
    //   3618: l2i
    //   3619: ldc_w -1818284799
    //   3622: ixor
    //   3623: ixor
    //   3624: lookupswitch default -> 4908, -1730317119 -> 3607, 1632157229 -> 3652
    //   3652: iload_2
    //   3653: ifeq -> 3667
    //   3656: ldc2_w -1674102590
    //   3659: l2i
    //   3660: ldc_w 951775302
    //   3663: ixor
    //   3664: goto -> 3675
    //   3667: ldc2_w 1880458162
    //   3670: l2i
    //   3671: ldc_w -728216779
    //   3674: ixor
    //   3675: ldc2_w -660927112
    //   3678: l2i
    //   3679: ldc_w -736105023
    //   3682: ixor
    //   3683: ixor
    //   3684: tableswitch default -> 3656, -1475794883 -> 3708, -1475794882 -> 3851
    //   3708: getstatic Perryc.1 : I
    //   3711: ifeq -> 3725
    //   3714: ldc2_w 1240784804
    //   3717: l2i
    //   3718: ldc_w -1792545919
    //   3721: ixor
    //   3722: goto -> 3733
    //   3725: ldc2_w 263747742
    //   3728: l2i
    //   3729: ldc_w 259733638
    //   3732: ixor
    //   3733: ldc2_w 1088043442
    //   3736: l2i
    //   3737: ldc_w 1086053995
    //   3740: ixor
    //   3741: ixor
    //   3742: lookupswitch default -> 3768, -592260100 -> 4966, 276203009 -> 3725
    //   3768: aload #9
    //   3770: ldc2_w 149686617
    //   3773: l2i
    //   3774: ldc_w 149686616
    //   3777: ixor
    //   3778: getstatic Perryc.c : I
    //   3781: iflt -> 3795
    //   3784: ldc2_w -507908376
    //   3787: l2i
    //   3788: ldc_w -241515008
    //   3791: ixor
    //   3792: goto -> 3803
    //   3795: ldc2_w 12352790
    //   3798: l2i
    //   3799: ldc_w 615946550
    //   3802: ixor
    //   3803: ldc2_w 498235185
    //   3806: l2i
    //   3807: ldc_w 1810816067
    //   3810: ixor
    //   3811: ixor
    //   3812: lookupswitch default -> 4972, 1381388114 -> 3840, 1719632794 -> 3795
    //   3840: goto -> 3844
    //   3843: athrow
    //   3844: invokestatic faceVector : (Lnet/minecraft/util/math/Vec3d;Z)V
    //   3847: goto -> 3851
    //   3850: athrow
    //   3851: getstatic Perryc.0 : I
    //   3854: ifle -> 3868
    //   3857: ldc2_w -261072500
    //   3860: l2i
    //   3861: ldc_w -2014505493
    //   3864: ixor
    //   3865: goto -> 3876
    //   3868: ldc2_w 2124801932
    //   3871: l2i
    //   3872: ldc_w 1263764811
    //   3875: ixor
    //   3876: ldc2_w 929436024
    //   3879: l2i
    //   3880: ldc_w -946013002
    //   3883: ixor
    //   3884: ixor
    //   3885: lookupswitch default -> 4980, -2023251543 -> 3868, -989032695 -> 3912
    //   3912: aload #7
    //   3914: getstatic Perryc.c : I
    //   3917: iflt -> 3931
    //   3920: ldc2_w -323744189
    //   3923: l2i
    //   3924: ldc_w 1245624838
    //   3927: ixor
    //   3928: goto -> 3939
    //   3931: ldc2_w 1328450004
    //   3934: l2i
    //   3935: ldc_w 375980694
    //   3938: ixor
    //   3939: ldc2_w -322491882
    //   3942: l2i
    //   3943: ldc_w 867033195
    //   3946: ixor
    //   3947: ixor
    //   3948: lookupswitch default -> 3976, -125867994 -> 3931, 2044755512 -> 4890
    //   3976: aload #9
    //   3978: getstatic Perryc.0 : I
    //   3981: ifle -> 3995
    //   3984: ldc2_w 1677611449
    //   3987: l2i
    //   3988: ldc_w 598919650
    //   3991: ixor
    //   3992: goto -> 4003
    //   3995: ldc2_w 1018346048
    //   3998: l2i
    //   3999: ldc_w -1261467469
    //   4002: ixor
    //   4003: ldc2_w 2067346629
    //   4006: l2i
    //   4007: ldc_w -2140939632
    //   4010: ixor
    //   4011: ixor
    //   4012: lookupswitch default -> 4994, -1156155890 -> 3995, 1931992230 -> 4040
    //   4040: aload_1
    //   4041: getstatic Perryc.1 : I
    //   4044: ifeq -> 4058
    //   4047: ldc2_w 831135992
    //   4050: l2i
    //   4051: ldc_w -686962232
    //   4054: ixor
    //   4055: goto -> 4066
    //   4058: ldc2_w -780680795
    //   4061: l2i
    //   4062: ldc_w -2079377528
    //   4065: ixor
    //   4066: ldc2_w -477455664
    //   4069: l2i
    //   4070: ldc_w 1322765689
    //   4073: ixor
    //   4074: ixor
    //   4075: lookupswitch default -> 4100, 1272626841 -> 4932, 1829723885 -> 4058
    //   4100: aload #8
    //   4102: getstatic Perryc.1 : I
    //   4105: ifeq -> 4119
    //   4108: ldc2_w 1093311469
    //   4111: l2i
    //   4112: ldc_w -1597287626
    //   4115: ixor
    //   4116: goto -> 4127
    //   4119: ldc2_w 2139902178
    //   4122: l2i
    //   4123: ldc_w -1717693958
    //   4126: ixor
    //   4127: ldc2_w -2066216632
    //   4130: l2i
    //   4131: ldc_w -393685533
    //   4134: ixor
    //   4135: ixor
    //   4136: lookupswitch default -> 4164, -1917774736 -> 5014, -1475550202 -> 4119
    //   4164: iload_3
    //   4165: getstatic Perryc.0 : I
    //   4168: ifle -> 4182
    //   4171: ldc2_w -1673512109
    //   4174: l2i
    //   4175: ldc_w -559531029
    //   4178: ixor
    //   4179: goto -> 4190
    //   4182: ldc2_w 1827157771
    //   4185: l2i
    //   4186: ldc_w -704303720
    //   4189: ixor
    //   4190: ldc2_w 609791777
    //   4193: l2i
    //   4194: ldc_w 1237719621
    //   4197: ixor
    //   4198: ixor
    //   4199: lookupswitch default -> 4224, 724668731 -> 4182, 796440028 -> 4938
    //   4224: goto -> 4228
    //   4227: athrow
    //   4228: invokestatic rightClickBlock : (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;Z)V
    //   4231: goto -> 4235
    //   4234: athrow
    //   4235: getstatic Perryc.0 : I
    //   4238: ifle -> 4252
    //   4241: ldc2_w 1355789388
    //   4244: l2i
    //   4245: ldc_w -1802907643
    //   4248: ixor
    //   4249: goto -> 4260
    //   4252: ldc2_w 1842535297
    //   4255: l2i
    //   4256: ldc_w 634081971
    //   4259: ixor
    //   4260: ldc2_w 518759533
    //   4263: l2i
    //   4264: ldc_w 148110188
    //   4267: ixor
    //   4268: ixor
    //   4269: lookupswitch default -> 4970, -763479224 -> 4252, 1579275827 -> 4296
    //   4296: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   4299: getstatic Perryc.1 : I
    //   4302: ifeq -> 4316
    //   4305: ldc2_w -2011196085
    //   4308: l2i
    //   4309: ldc_w -286329891
    //   4312: ixor
    //   4313: goto -> 4324
    //   4316: ldc2_w 1952256704
    //   4319: l2i
    //   4320: ldc_w 1816737355
    //   4323: ixor
    //   4324: ldc2_w -621496178
    //   4327: l2i
    //   4328: ldc_w 1827784961
    //   4331: ixor
    //   4332: ixor
    //   4333: lookupswitch default -> 4360, -1049606527 -> 4316, -789309671 -> 4928
    //   4360: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4363: getstatic Perryc.c : I
    //   4366: iflt -> 4380
    //   4369: ldc2_w -1278287411
    //   4372: l2i
    //   4373: ldc_w 1053533889
    //   4376: ixor
    //   4377: goto -> 4388
    //   4380: ldc2_w -444439490
    //   4383: l2i
    //   4384: ldc_w 1648458003
    //   4387: ixor
    //   4388: ldc2_w -847591510
    //   4391: l2i
    //   4392: ldc_w -1484373066
    //   4395: ixor
    //   4396: ixor
    //   4397: lookupswitch default -> 4424, -403062000 -> 4956, 2096096471 -> 4380
    //   4424: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   4427: getstatic Perryc.c : I
    //   4430: iflt -> 4444
    //   4433: ldc2_w 667472999
    //   4436: l2i
    //   4437: ldc_w -1744375969
    //   4440: ixor
    //   4441: goto -> 4452
    //   4444: ldc2_w 1039199961
    //   4447: l2i
    //   4448: ldc_w -270253747
    //   4451: ixor
    //   4452: ldc2_w -1625187969
    //   4455: l2i
    //   4456: ldc_w 1878082152
    //   4459: ixor
    //   4460: ixor
    //   4461: lookupswitch default -> 4974, 583300227 -> 4488, 1327423535 -> 4444
    //   4488: goto -> 4492
    //   4491: athrow
    //   4492: invokevirtual func_184609_a : (Lnet/minecraft/util/EnumHand;)V
    //   4495: goto -> 4499
    //   4498: athrow
    //   4499: getstatic Perryc.0 : I
    //   4502: ifle -> 4516
    //   4505: ldc2_w 1054563425
    //   4508: l2i
    //   4509: ldc_w -474206335
    //   4512: ixor
    //   4513: goto -> 4524
    //   4516: ldc2_w 1330576978
    //   4519: l2i
    //   4520: ldc_w 2116362824
    //   4523: ixor
    //   4524: ldc2_w 2094004656
    //   4527: l2i
    //   4528: ldc_w 1509595997
    //   4531: ixor
    //   4532: ixor
    //   4533: lookupswitch default -> 4912, -128839411 -> 4516, 341753591 -> 4560
    //   4560: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   4563: ldc2_w 1064271549
    //   4566: l2i
    //   4567: ldc_w 1064271545
    //   4570: ixor
    //   4571: getstatic Perryc.0 : I
    //   4574: ifle -> 4588
    //   4577: ldc2_w -481999307
    //   4580: l2i
    //   4581: ldc_w 1041428475
    //   4584: ixor
    //   4585: goto -> 4596
    //   4588: ldc2_w -1234474137
    //   4591: l2i
    //   4592: ldc_w 2147189150
    //   4595: ixor
    //   4596: ldc2_w -1008871792
    //   4599: l2i
    //   4600: ldc_w 313341457
    //   4603: ixor
    //   4604: ixor
    //   4605: lookupswitch default -> 4632, 203901263 -> 4940, 890842527 -> 4588
    //   4632: putfield field_71467_ac : I
    //   4635: getstatic Perryc.0 : I
    //   4638: ifle -> 4652
    //   4641: ldc2_w 1633637454
    //   4644: l2i
    //   4645: ldc_w -716500333
    //   4648: ixor
    //   4649: goto -> 4660
    //   4652: ldc2_w -1031772684
    //   4655: l2i
    //   4656: ldc_w 347122331
    //   4659: ixor
    //   4660: ldc2_w -656463762
    //   4663: l2i
    //   4664: ldc_w -523946834
    //   4667: ixor
    //   4668: ixor
    //   4669: lookupswitch default -> 4946, -1945216483 -> 4652, -299183185 -> 4696
    //   4696: iload #5
    //   4698: ifne -> 4712
    //   4701: ldc2_w 171126199
    //   4704: l2i
    //   4705: ldc_w 389569014
    //   4708: ixor
    //   4709: goto -> 4720
    //   4712: ldc2_w 59985224
    //   4715: l2i
    //   4716: ldc_w 513292552
    //   4719: ixor
    //   4720: ldc2_w 1525941796
    //   4723: l2i
    //   4724: ldc_w -1915964403
    //   4727: ixor
    //   4728: ixor
    //   4729: tableswitch default -> 4701, -902576536 -> 4752, -902576535 -> 4868
    //   4752: getstatic Perryc.1 : I
    //   4755: ifeq -> 4769
    //   4758: ldc2_w 2116686405
    //   4761: l2i
    //   4762: ldc_w 341571310
    //   4765: ixor
    //   4766: goto -> 4777
    //   4769: ldc2_w -1728008061
    //   4772: l2i
    //   4773: ldc_w -568892751
    //   4776: ixor
    //   4777: ldc2_w 756359915
    //   4780: l2i
    //   4781: ldc_w 254824836
    //   4784: ixor
    //   4785: ixor
    //   4786: lookupswitch default -> 4812, 1213503428 -> 5018, 1407267595 -> 4769
    //   4812: iload #4
    //   4814: ifeq -> 4828
    //   4817: ldc2_w -137870502
    //   4820: l2i
    //   4821: ldc_w 1137596912
    //   4824: ixor
    //   4825: goto -> 4836
    //   4828: ldc2_w 358899139
    //   4831: l2i
    //   4832: ldc_w -1587394712
    //   4835: ixor
    //   4836: ldc2_w 1620647402
    //   4839: l2i
    //   4840: ldc_w -873130428
    //   4843: ixor
    //   4844: ixor
    //   4845: tableswitch default -> 4817, 527044868 -> 4868, 527044869 -> 4879
    //   4868: ldc2_w 1350590915
    //   4871: l2i
    //   4872: ldc_w 1350590914
    //   4875: ixor
    //   4876: goto -> 4887
    //   4879: ldc2_w 577631728
    //   4882: l2i
    //   4883: ldc_w 577631728
    //   4886: ixor
    //   4887: ireturn
    //   4888: aconst_null
    //   4889: athrow
    //   4890: aconst_null
    //   4891: athrow
    //   4892: aconst_null
    //   4893: athrow
    //   4894: aconst_null
    //   4895: athrow
    //   4896: aconst_null
    //   4897: athrow
    //   4898: aconst_null
    //   4899: athrow
    //   4900: aconst_null
    //   4901: athrow
    //   4902: aconst_null
    //   4903: athrow
    //   4904: aconst_null
    //   4905: athrow
    //   4906: aconst_null
    //   4907: athrow
    //   4908: aconst_null
    //   4909: athrow
    //   4910: aconst_null
    //   4911: athrow
    //   4912: aconst_null
    //   4913: athrow
    //   4914: aconst_null
    //   4915: athrow
    //   4916: aconst_null
    //   4917: athrow
    //   4918: aconst_null
    //   4919: athrow
    //   4920: aconst_null
    //   4921: athrow
    //   4922: aconst_null
    //   4923: athrow
    //   4924: aconst_null
    //   4925: athrow
    //   4926: aconst_null
    //   4927: athrow
    //   4928: aconst_null
    //   4929: athrow
    //   4930: aconst_null
    //   4931: athrow
    //   4932: aconst_null
    //   4933: athrow
    //   4934: aconst_null
    //   4935: athrow
    //   4936: aconst_null
    //   4937: athrow
    //   4938: aconst_null
    //   4939: athrow
    //   4940: aconst_null
    //   4941: athrow
    //   4942: aconst_null
    //   4943: athrow
    //   4944: aconst_null
    //   4945: athrow
    //   4946: aconst_null
    //   4947: athrow
    //   4948: aconst_null
    //   4949: athrow
    //   4950: aconst_null
    //   4951: athrow
    //   4952: aconst_null
    //   4953: athrow
    //   4954: aconst_null
    //   4955: athrow
    //   4956: aconst_null
    //   4957: athrow
    //   4958: aconst_null
    //   4959: athrow
    //   4960: aconst_null
    //   4961: athrow
    //   4962: aconst_null
    //   4963: athrow
    //   4964: aconst_null
    //   4965: athrow
    //   4966: aconst_null
    //   4967: athrow
    //   4968: aconst_null
    //   4969: athrow
    //   4970: aconst_null
    //   4971: athrow
    //   4972: aconst_null
    //   4973: athrow
    //   4974: aconst_null
    //   4975: athrow
    //   4976: aconst_null
    //   4977: athrow
    //   4978: aconst_null
    //   4979: athrow
    //   4980: aconst_null
    //   4981: athrow
    //   4982: aconst_null
    //   4983: athrow
    //   4984: aconst_null
    //   4985: athrow
    //   4986: aconst_null
    //   4987: athrow
    //   4988: aconst_null
    //   4989: athrow
    //   4990: aconst_null
    //   4991: athrow
    //   4992: aconst_null
    //   4993: athrow
    //   4994: aconst_null
    //   4995: athrow
    //   4996: aconst_null
    //   4997: athrow
    //   4998: aconst_null
    //   4999: athrow
    //   5000: aconst_null
    //   5001: athrow
    //   5002: aconst_null
    //   5003: athrow
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
    //   5020: pop
    //   5021: goto -> 24
    //   5024: pop
    //   5025: aconst_null
    //   5026: goto -> 5020
    //   5029: dup
    //   5030: ifnull -> 5020
    //   5033: checkcast java/lang/Throwable
    //   5036: athrow
    //   5037: dup
    //   5038: ifnull -> 5024
    //   5041: checkcast java/lang/Throwable
    //   5044: athrow
    //   5045: aconst_null
    //   5046: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	4864	0	pos	Lnet/minecraft/util/math/BlockPos;
    //   24	4864	1	hand	Lnet/minecraft/util/EnumHand;
    //   24	4864	2	rotate	Z
    //   24	4864	3	packet	Z
    //   24	4864	4	isSneaking	Z
    //   94	4794	5	sneaking	Z
    //   290	4598	6	side	Lnet/minecraft/util/EnumFacing;
    //   730	4158	7	neighbour	Lnet/minecraft/util/math/BlockPos;
    //   930	3958	8	opposite	Lnet/minecraft/util/EnumFacing;
    //   1614	3274	9	hitVec	Lnet/minecraft/util/math/Vec3d;
    //   2014	2874	10	neighbourBlock	Lnet/minecraft/block/Block;
    // Exception table:
    //   from	to	target	type
    //   8	20	5029	java/lang/RuntimeException
    //   219	226	226	finally
    //   220	226	219	java/lang/RuntimeException
    //   220	226	3	java/lang/IllegalArgumentException
    //   220	226	3	finally
    //   220	226	219	java/lang/NullPointerException
    //   659	666	666	finally
    //   659	666	659	finally
    //   659	666	659	java/lang/EnumConstantNotPresentException
    //   660	666	3	finally
    //   660	666	3	finally
    //   859	866	866	finally
    //   859	866	3	finally
    //   859	866	859	finally
    //   859	866	859	finally
    //   860	866	859	java/util/ConcurrentModificationException
    //   1064	1070	1070	finally
    //   1064	1070	1070	java/lang/NumberFormatException
    //   1064	1070	3	java/lang/RuntimeException
    //   1064	1070	3	java/lang/NegativeArraySizeException
    //   1064	1070	1070	finally
    //   1175	1182	1182	finally
    //   1175	1182	3	java/lang/NumberFormatException
    //   1175	1182	1175	finally
    //   1175	1182	1175	finally
    //   1176	1182	3	java/lang/StringIndexOutOfBoundsException
    //   1315	1322	1322	finally
    //   1316	1322	3	finally
    //   1316	1322	1322	finally
    //   1316	1322	3	finally
    //   1316	1322	1315	java/lang/ArrayIndexOutOfBoundsException
    //   1388	1394	1394	finally
    //   1388	1394	3	java/lang/AssertionError
    //   1388	1394	3	java/lang/ArrayIndexOutOfBoundsException
    //   1388	1394	3	finally
    //   1388	1394	1394	java/lang/NumberFormatException
    //   1471	1478	1478	finally
    //   1471	1478	3	finally
    //   1471	1478	1478	finally
    //   1472	1478	3	java/lang/NegativeArraySizeException
    //   1472	1478	1471	java/lang/IllegalStateException
    //   1544	1550	1550	finally
    //   1544	1550	3	java/lang/IllegalArgumentException
    //   1544	1550	1550	java/lang/NegativeArraySizeException
    //   1544	1550	3	java/util/ConcurrentModificationException
    //   1544	1550	1550	finally
    //   1872	1878	1878	finally
    //   1872	1878	1878	finally
    //   1872	1878	3	java/lang/StringIndexOutOfBoundsException
    //   1872	1878	3	java/lang/EnumConstantNotPresentException
    //   1872	1878	3	java/lang/NegativeArraySizeException
    //   1944	1952	1952	finally
    //   1944	1952	3	finally
    //   1944	1952	1952	java/lang/IllegalStateException
    //   1944	1952	1952	finally
    //   1944	1952	3	java/lang/RuntimeException
    //   2208	2214	2214	finally
    //   2208	2214	3	java/lang/EnumConstantNotPresentException
    //   2208	2214	2214	java/lang/StringIndexOutOfBoundsException
    //   2208	2214	3	java/lang/RuntimeException
    //   2208	2214	2214	finally
    //   2460	2468	2468	finally
    //   2460	2468	2468	finally
    //   2460	2468	3	finally
    //   2460	2468	2468	finally
    //   2460	2468	3	java/lang/UnsupportedOperationException
    //   2715	2724	2724	finally
    //   2715	2724	2715	java/util/NoSuchElementException
    //   2715	2724	3	java/lang/EnumConstantNotPresentException
    //   2716	2724	3	finally
    //   2716	2724	2715	finally
    //   3231	3238	3238	finally
    //   3232	3238	3	java/lang/UnsupportedOperationException
    //   3232	3238	3231	java/lang/NumberFormatException
    //   3232	3238	3	finally
    //   3232	3238	3238	finally
    //   3303	3310	3310	finally
    //   3303	3310	3310	java/lang/IllegalStateException
    //   3303	3310	3303	java/lang/AssertionError
    //   3303	3310	3310	java/lang/IndexOutOfBoundsException
    //   3304	3310	3310	finally
    //   3512	3518	3518	finally
    //   3512	3518	3	java/util/ConcurrentModificationException
    //   3512	3518	3	java/lang/RuntimeException
    //   3512	3518	3	java/lang/StringIndexOutOfBoundsException
    //   3512	3518	3518	java/lang/IllegalStateException
    //   3843	3850	3850	finally
    //   3843	3850	3850	finally
    //   3843	3850	3850	java/lang/ClassCastException
    //   3844	3850	3850	java/util/NoSuchElementException
    //   3844	3850	3843	finally
    //   4227	4234	4234	finally
    //   4227	4234	3	finally
    //   4227	4234	4227	finally
    //   4228	4234	4227	finally
    //   4228	4234	4227	finally
    //   4491	4498	4498	finally
    //   4491	4498	4491	finally
    //   4491	4498	4498	java/lang/IndexOutOfBoundsException
    //   4492	4498	3	finally
    //   4492	4498	4491	finally
    //   5029	5037	5029	java/lang/IllegalArgumentException
    //   5045	5047	3	java/lang/ArrayIndexOutOfBoundsException
  }
  
  public static void rightClickBlockLegit(BlockPos pos, float range, boolean rotate, EnumHand hand, AtomicDouble Yaw, AtomicDouble Pitch, AtomicBoolean rotating) {
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
  
  public static EnumFacing getRayTraceFacing(BlockPos pos) {
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
  
  public static boolean hasNeighbour(BlockPos paramBlockPos) {
    return Perry1.6o(null, (int)765244485L ^ 0x5AD9CC12, paramBlockPos);
  }
  
  public static boolean placeBlockSmartRotate(BlockPos pos, EnumHand hand, boolean rotate, boolean packet, boolean isSneaking) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 5103
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 5095
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 5087
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: ldc2_w 1784231774
    //   27: l2i
    //   28: ldc_w 1784231774
    //   31: ixor
    //   32: getstatic Perryc.1 : I
    //   35: ifeq -> 49
    //   38: ldc2_w -1239978120
    //   41: l2i
    //   42: ldc_w 754448203
    //   45: ixor
    //   46: goto -> 57
    //   49: ldc2_w -1593859263
    //   52: l2i
    //   53: ldc_w 1559732152
    //   56: ixor
    //   57: ldc2_w 1624398147
    //   60: l2i
    //   61: ldc_w 1238335704
    //   64: ixor
    //   65: ixor
    //   66: lookupswitch default -> 4956, -1275248216 -> 49, -719985310 -> 92
    //   92: istore #5
    //   94: getstatic Perryc.c : I
    //   97: iflt -> 111
    //   100: ldc2_w 2003081787
    //   103: l2i
    //   104: ldc_w -1772924221
    //   107: ixor
    //   108: goto -> 119
    //   111: ldc2_w -2074533744
    //   114: l2i
    //   115: ldc_w 1725107062
    //   118: ixor
    //   119: ldc2_w 1607796323
    //   122: l2i
    //   123: ldc_w 904865927
    //   126: ixor
    //   127: ixor
    //   128: lookupswitch default -> 156, -1962023396 -> 4984, 221332506 -> 111
    //   156: aload_0
    //   157: getstatic Perryc.1 : I
    //   160: ifeq -> 174
    //   163: ldc2_w 908557385
    //   166: l2i
    //   167: ldc_w 1746439672
    //   170: ixor
    //   171: goto -> 182
    //   174: ldc2_w 651349039
    //   177: l2i
    //   178: ldc_w -374320681
    //   181: ixor
    //   182: ldc2_w 122337511
    //   185: l2i
    //   186: ldc_w 943149986
    //   189: ixor
    //   190: ixor
    //   191: lookupswitch default -> 216, 233892961 -> 174, 1631722228 -> 5064
    //   216: goto -> 220
    //   219: athrow
    //   220: invokestatic getFirstFacing : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/EnumFacing;
    //   223: goto -> 227
    //   226: athrow
    //   227: getstatic Perryc.1 : I
    //   230: ifeq -> 244
    //   233: ldc2_w -393677962
    //   236: l2i
    //   237: ldc_w -422205933
    //   240: ixor
    //   241: goto -> 252
    //   244: ldc2_w 1728755613
    //   247: l2i
    //   248: ldc_w -1121093656
    //   251: ixor
    //   252: ldc2_w -516339438
    //   255: l2i
    //   256: ldc_w 320379928
    //   259: ixor
    //   260: ixor
    //   261: lookupswitch default -> 5022, -58949521 -> 244, 671487359 -> 288
    //   288: astore #6
    //   290: getstatic Perryc.1 : I
    //   293: ifeq -> 307
    //   296: ldc2_w 2019128044
    //   299: l2i
    //   300: ldc_w 2010969026
    //   303: ixor
    //   304: goto -> 315
    //   307: ldc2_w -1388266327
    //   310: l2i
    //   311: ldc_w -537837931
    //   314: ixor
    //   315: ldc2_w -377133078
    //   318: l2i
    //   319: ldc_w -1721168597
    //   322: ixor
    //   323: ixor
    //   324: lookupswitch default -> 352, 1436359019 -> 307, 2137648111 -> 4966
    //   352: aload #6
    //   354: getstatic Perryc.0 : I
    //   357: ifle -> 371
    //   360: ldc2_w -552856261
    //   363: l2i
    //   364: ldc_w -1249324124
    //   367: ixor
    //   368: goto -> 379
    //   371: ldc2_w 1792741039
    //   374: l2i
    //   375: ldc_w 1005517116
    //   378: ixor
    //   379: ldc2_w 1481528880
    //   382: l2i
    //   383: ldc_w -1191359802
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 416, -1976051095 -> 5030, -902790260 -> 371
    //   416: goto -> 420
    //   419: athrow
    //   420: invokevirtual toString : ()Ljava/lang/String;
    //   423: goto -> 427
    //   426: athrow
    //   427: getstatic Perryc.0 : I
    //   430: ifle -> 444
    //   433: ldc2_w -1799065949
    //   436: l2i
    //   437: ldc_w 1695266047
    //   440: ixor
    //   441: goto -> 452
    //   444: ldc2_w -1178826775
    //   447: l2i
    //   448: ldc_w -99491327
    //   451: ixor
    //   452: ldc2_w -231456258
    //   455: l2i
    //   456: ldc_w -895749666
    //   459: ixor
    //   460: ixor
    //   461: lookupswitch default -> 488, -916428164 -> 4968, 1749580346 -> 444
    //   488: goto -> 492
    //   491: athrow
    //   492: invokestatic sendMessage : (Ljava/lang/String;)V
    //   495: goto -> 499
    //   498: athrow
    //   499: getstatic Perryc.1 : I
    //   502: ifeq -> 516
    //   505: ldc2_w 1849309091
    //   508: l2i
    //   509: ldc_w -548860478
    //   512: ixor
    //   513: goto -> 524
    //   516: ldc2_w 523503547
    //   519: l2i
    //   520: ldc_w -273550378
    //   523: ixor
    //   524: ldc2_w -1538957223
    //   527: l2i
    //   528: ldc_w -2049483119
    //   531: ixor
    //   532: ixor
    //   533: lookupswitch default -> 560, -1864301399 -> 5042, 817630743 -> 516
    //   560: aload #6
    //   562: ifnonnull -> 576
    //   565: ldc2_w -1756010116
    //   568: l2i
    //   569: ldc_w 561051333
    //   572: ixor
    //   573: goto -> 584
    //   576: ldc2_w -1047460646
    //   579: l2i
    //   580: ldc_w 2008324962
    //   583: ixor
    //   584: ldc2_w 881874544
    //   587: l2i
    //   588: ldc_w 1319617301
    //   591: ixor
    //   592: ixor
    //   593: tableswitch default -> 565, -871232804 -> 616, -871232803 -> 679
    //   616: getstatic Perryc.c : I
    //   619: iflt -> 633
    //   622: ldc2_w 1859293634
    //   625: l2i
    //   626: ldc_w 1262604190
    //   629: ixor
    //   630: goto -> 641
    //   633: ldc2_w 154266141
    //   636: l2i
    //   637: ldc_w 2099141388
    //   640: ixor
    //   641: ldc2_w -762122340
    //   644: l2i
    //   645: ldc_w 932237844
    //   648: ixor
    //   649: ixor
    //   650: lookupswitch default -> 676, -1064213548 -> 4952, 1191428491 -> 633
    //   676: iload #4
    //   678: ireturn
    //   679: getstatic Perryc.1 : I
    //   682: ifeq -> 696
    //   685: ldc2_w 1176070594
    //   688: l2i
    //   689: ldc_w 1666727220
    //   692: ixor
    //   693: goto -> 704
    //   696: ldc2_w -1492111967
    //   699: l2i
    //   700: ldc_w -1227731258
    //   703: ixor
    //   704: ldc2_w -1592583425
    //   707: l2i
    //   708: ldc_w 375763921
    //   711: ixor
    //   712: ixor
    //   713: lookupswitch default -> 4944, -1841824296 -> 696, -1498101175 -> 740
    //   740: aload_0
    //   741: getstatic Perryc.1 : I
    //   744: ifeq -> 758
    //   747: ldc2_w -634021300
    //   750: l2i
    //   751: ldc_w 1539013340
    //   754: ixor
    //   755: goto -> 766
    //   758: ldc2_w 771975818
    //   761: l2i
    //   762: ldc_w -1279653490
    //   765: ixor
    //   766: ldc2_w 148780215
    //   769: l2i
    //   770: ldc_w 371661157
    //   773: ixor
    //   774: ixor
    //   775: lookupswitch default -> 5044, -2092937514 -> 800, -1619538622 -> 758
    //   800: aload #6
    //   802: getstatic Perryc.1 : I
    //   805: ifeq -> 819
    //   808: ldc2_w -765461605
    //   811: l2i
    //   812: ldc_w -204363861
    //   815: ixor
    //   816: goto -> 827
    //   819: ldc2_w 539495610
    //   822: l2i
    //   823: ldc_w 1959269536
    //   826: ixor
    //   827: ldc2_w -404265754
    //   830: l2i
    //   831: ldc_w -565400937
    //   834: ixor
    //   835: ixor
    //   836: lookupswitch default -> 864, -48399603 -> 819, 405115457 -> 4958
    //   864: goto -> 868
    //   867: athrow
    //   868: invokevirtual func_177972_a : (Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos;
    //   871: goto -> 875
    //   874: athrow
    //   875: getstatic Perryc.0 : I
    //   878: ifle -> 892
    //   881: ldc2_w 16300160
    //   884: l2i
    //   885: ldc_w 1432634012
    //   888: ixor
    //   889: goto -> 900
    //   892: ldc2_w -1482059206
    //   895: l2i
    //   896: ldc_w -211236448
    //   899: ixor
    //   900: ldc2_w 1640733273
    //   903: l2i
    //   904: ldc_w -842808117
    //   907: ixor
    //   908: ixor
    //   909: lookupswitch default -> 936, -107699058 -> 5020, -25164657 -> 892
    //   936: astore #7
    //   938: getstatic Perryc.c : I
    //   941: iflt -> 955
    //   944: ldc2_w 1848314957
    //   947: l2i
    //   948: ldc_w -1486261424
    //   951: ixor
    //   952: goto -> 963
    //   955: ldc2_w -1974146264
    //   958: l2i
    //   959: ldc_w -2114680871
    //   962: ixor
    //   963: ldc2_w 2076514137
    //   966: l2i
    //   967: ldc_w -889351962
    //   970: ixor
    //   971: ixor
    //   972: lookupswitch default -> 5054, -1164383410 -> 1000, 2021324962 -> 955
    //   1000: aload #6
    //   1002: getstatic Perryc.c : I
    //   1005: iflt -> 1019
    //   1008: ldc2_w -1109499114
    //   1011: l2i
    //   1012: ldc_w -632898479
    //   1015: ixor
    //   1016: goto -> 1027
    //   1019: ldc2_w 538051738
    //   1022: l2i
    //   1023: ldc_w -1218434731
    //   1026: ixor
    //   1027: ldc2_w -1209095681
    //   1030: l2i
    //   1031: ldc_w 2033983362
    //   1034: ixor
    //   1035: ixor
    //   1036: lookupswitch default -> 4976, -1454741190 -> 1019, 1503697842 -> 1064
    //   1064: goto -> 1068
    //   1067: athrow
    //   1068: invokevirtual func_176734_d : ()Lnet/minecraft/util/EnumFacing;
    //   1071: goto -> 1075
    //   1074: athrow
    //   1075: getstatic Perryc.1 : I
    //   1078: ifeq -> 1092
    //   1081: ldc2_w -599073788
    //   1084: l2i
    //   1085: ldc_w -1972849905
    //   1088: ixor
    //   1089: goto -> 1100
    //   1092: ldc2_w -60700174
    //   1095: l2i
    //   1096: ldc_w -665382889
    //   1099: ixor
    //   1100: ldc2_w 791519979
    //   1103: l2i
    //   1104: ldc_w 732825175
    //   1107: ixor
    //   1108: ixor
    //   1109: lookupswitch default -> 1136, -98838466 -> 1092, 1386335159 -> 4980
    //   1136: astore #8
    //   1138: new net/minecraft/util/math/Vec3d
    //   1141: dup
    //   1142: getstatic Perryc.0 : I
    //   1145: ifle -> 1159
    //   1148: ldc2_w -151477183
    //   1151: l2i
    //   1152: ldc_w 2065333385
    //   1155: ixor
    //   1156: goto -> 1167
    //   1159: ldc2_w -2082997374
    //   1162: l2i
    //   1163: ldc_w -1893044672
    //   1166: ixor
    //   1167: ldc2_w -1892058664
    //   1170: l2i
    //   1171: ldc_w -322400971
    //   1174: ixor
    //   1175: ixor
    //   1176: lookupswitch default -> 1204, -1490424647 -> 1159, -300733403 -> 5004
    //   1204: aload #7
    //   1206: getstatic Perryc.1 : I
    //   1209: ifeq -> 1223
    //   1212: ldc2_w 857745697
    //   1215: l2i
    //   1216: ldc_w 29377418
    //   1219: ixor
    //   1220: goto -> 1231
    //   1223: ldc2_w -919232231
    //   1226: l2i
    //   1227: ldc_w 1849353762
    //   1230: ixor
    //   1231: ldc2_w -574002386
    //   1234: l2i
    //   1235: ldc_w -1004048779
    //   1238: ixor
    //   1239: ixor
    //   1240: lookupswitch default -> 1268, -1070026001 -> 1223, 722366448 -> 4946
    //   1268: goto -> 1272
    //   1271: athrow
    //   1272: invokespecial <init> : (Lnet/minecraft/util/math/Vec3i;)V
    //   1275: goto -> 1279
    //   1278: athrow
    //   1279: ldc2_w 2.7767454914671417
    //   1282: invokestatic doubleToLongBits : (D)J
    //   1285: ldc2_w 9216113912953001382
    //   1288: lxor
    //   1289: invokestatic longBitsToDouble : (J)D
    //   1292: ldc2_w 30.027223701765205
    //   1295: invokestatic doubleToLongBits : (D)J
    //   1298: ldc2_w 9213809550437433843
    //   1301: lxor
    //   1302: invokestatic longBitsToDouble : (J)D
    //   1305: ldc2_w 3.3925632669423886
    //   1308: invokestatic doubleToLongBits : (D)J
    //   1311: ldc2_w 9217500611305080607
    //   1314: lxor
    //   1315: invokestatic longBitsToDouble : (J)D
    //   1318: getstatic Perryc.c : I
    //   1321: iflt -> 1335
    //   1324: ldc2_w -317236275
    //   1327: l2i
    //   1328: ldc_w -1121187494
    //   1331: ixor
    //   1332: goto -> 1343
    //   1335: ldc2_w 21465232
    //   1338: l2i
    //   1339: ldc_w 720803138
    //   1342: ixor
    //   1343: ldc2_w 1198177319
    //   1346: l2i
    //   1347: ldc_w -1232666924
    //   1350: ixor
    //   1351: ixor
    //   1352: lookupswitch default -> 5026, -1579741084 -> 1335, -631415007 -> 1380
    //   1380: goto -> 1384
    //   1383: athrow
    //   1384: invokevirtual func_72441_c : (DDD)Lnet/minecraft/util/math/Vec3d;
    //   1387: goto -> 1391
    //   1390: athrow
    //   1391: new net/minecraft/util/math/Vec3d
    //   1394: dup
    //   1395: getstatic Perryc.c : I
    //   1398: iflt -> 1412
    //   1401: ldc2_w -777356323
    //   1404: l2i
    //   1405: ldc_w -301805286
    //   1408: ixor
    //   1409: goto -> 1420
    //   1412: ldc2_w -1524628941
    //   1415: l2i
    //   1416: ldc_w -1209783314
    //   1419: ixor
    //   1420: ldc2_w -1354405688
    //   1423: l2i
    //   1424: ldc_w 1722998745
    //   1427: ixor
    //   1428: ixor
    //   1429: lookupswitch default -> 1456, -1397617611 -> 1412, -161538602 -> 4988
    //   1456: aload #8
    //   1458: getstatic Perryc.c : I
    //   1461: iflt -> 1475
    //   1464: ldc2_w 782243101
    //   1467: l2i
    //   1468: ldc_w -291621424
    //   1471: ixor
    //   1472: goto -> 1483
    //   1475: ldc2_w -1259769391
    //   1478: l2i
    //   1479: ldc_w -1572182388
    //   1482: ixor
    //   1483: ldc2_w -789113394
    //   1486: l2i
    //   1487: ldc_w 1108036206
    //   1490: ixor
    //   1491: ixor
    //   1492: lookupswitch default -> 4970, -2074130179 -> 1520, 1388478317 -> 1475
    //   1520: goto -> 1524
    //   1523: athrow
    //   1524: invokevirtual func_176730_m : ()Lnet/minecraft/util/math/Vec3i;
    //   1527: goto -> 1531
    //   1530: athrow
    //   1531: getstatic Perryc.c : I
    //   1534: iflt -> 1548
    //   1537: ldc2_w 746756315
    //   1540: l2i
    //   1541: ldc_w -638189816
    //   1544: ixor
    //   1545: goto -> 1556
    //   1548: ldc2_w -1371710700
    //   1551: l2i
    //   1552: ldc_w -32281623
    //   1555: ixor
    //   1556: ldc2_w 302609491
    //   1559: l2i
    //   1560: ldc_w 1866708993
    //   1563: ixor
    //   1564: ixor
    //   1565: lookupswitch default -> 1592, -2009224319 -> 4994, 962130217 -> 1548
    //   1592: goto -> 1596
    //   1595: athrow
    //   1596: invokespecial <init> : (Lnet/minecraft/util/math/Vec3i;)V
    //   1599: goto -> 1603
    //   1602: athrow
    //   1603: ldc2_w 3.269747123374319
    //   1606: invokestatic doubleToLongBits : (D)J
    //   1609: ldc2_w 9217224053935876487
    //   1612: lxor
    //   1613: invokestatic longBitsToDouble : (J)D
    //   1616: getstatic Perryc.0 : I
    //   1619: ifle -> 1633
    //   1622: ldc2_w 1358097736
    //   1625: l2i
    //   1626: ldc_w -520588672
    //   1629: ixor
    //   1630: goto -> 1641
    //   1633: ldc2_w 510468224
    //   1636: l2i
    //   1637: ldc_w 574418862
    //   1640: ixor
    //   1641: ldc2_w 554947601
    //   1644: l2i
    //   1645: ldc_w -1971960367
    //   1648: ixor
    //   1649: ixor
    //   1650: lookupswitch default -> 5060, -1758175506 -> 1676, 460262920 -> 1633
    //   1676: goto -> 1680
    //   1679: athrow
    //   1680: invokevirtual func_186678_a : (D)Lnet/minecraft/util/math/Vec3d;
    //   1683: goto -> 1687
    //   1686: athrow
    //   1687: getstatic Perryc.1 : I
    //   1690: ifeq -> 1704
    //   1693: ldc2_w 1766853966
    //   1696: l2i
    //   1697: ldc_w -1704467539
    //   1700: ixor
    //   1701: goto -> 1712
    //   1704: ldc2_w 1157979425
    //   1707: l2i
    //   1708: ldc_w 1266171194
    //   1711: ixor
    //   1712: ldc2_w -958491285
    //   1715: l2i
    //   1716: ldc_w 922721951
    //   1719: ixor
    //   1720: ixor
    //   1721: lookupswitch default -> 1748, 51832087 -> 4954, 718822268 -> 1704
    //   1748: goto -> 1752
    //   1751: athrow
    //   1752: invokevirtual func_178787_e : (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
    //   1755: goto -> 1759
    //   1758: athrow
    //   1759: getstatic Perryc.1 : I
    //   1762: ifeq -> 1776
    //   1765: ldc2_w -348760769
    //   1768: l2i
    //   1769: ldc_w 1578486683
    //   1772: ixor
    //   1773: goto -> 1784
    //   1776: ldc2_w -1684339531
    //   1779: l2i
    //   1780: ldc_w -492073852
    //   1783: ixor
    //   1784: ldc2_w -1964962107
    //   1787: l2i
    //   1788: ldc_w -1574733604
    //   1791: ixor
    //   1792: ixor
    //   1793: lookupswitch default -> 1820, -2092392215 -> 1776, -1646139203 -> 4960
    //   1820: astore #9
    //   1822: getstatic Perryc.0 : I
    //   1825: ifle -> 1839
    //   1828: ldc2_w 1010766390
    //   1831: l2i
    //   1832: ldc_w -912469060
    //   1835: ixor
    //   1836: goto -> 1847
    //   1839: ldc2_w 1388636065
    //   1842: l2i
    //   1843: ldc_w 54743972
    //   1846: ixor
    //   1847: ldc2_w -1202088148
    //   1850: l2i
    //   1851: ldc_w -637581043
    //   1854: ixor
    //   1855: ixor
    //   1856: lookupswitch default -> 1884, -1811603541 -> 4982, 1458711599 -> 1839
    //   1884: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1887: getstatic Perryc.0 : I
    //   1890: ifle -> 1904
    //   1893: ldc2_w 341012399
    //   1896: l2i
    //   1897: ldc_w -136532515
    //   1900: ixor
    //   1901: goto -> 1912
    //   1904: ldc2_w -2118385469
    //   1907: l2i
    //   1908: ldc_w 1597901980
    //   1911: ixor
    //   1912: ldc2_w -54595719
    //   1915: l2i
    //   1916: ldc_w 971504087
    //   1919: ixor
    //   1920: ixor
    //   1921: lookupswitch default -> 1948, -1606123817 -> 1904, 651613404 -> 5016
    //   1948: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1951: getstatic Perryc.0 : I
    //   1954: ifle -> 1968
    //   1957: ldc2_w 1039798355
    //   1960: l2i
    //   1961: ldc_w -1796417020
    //   1964: ixor
    //   1965: goto -> 1976
    //   1968: ldc2_w 661979893
    //   1971: l2i
    //   1972: ldc_w 129891340
    //   1975: ixor
    //   1976: ldc2_w -2043409211
    //   1979: l2i
    //   1980: ldc_w -874352401
    //   1983: ixor
    //   1984: ixor
    //   1985: lookupswitch default -> 2012, -457132419 -> 4978, -401559630 -> 1968
    //   2012: aload #7
    //   2014: getstatic Perryc.1 : I
    //   2017: ifeq -> 2031
    //   2020: ldc2_w -615741806
    //   2023: l2i
    //   2024: ldc_w -585353111
    //   2027: ixor
    //   2028: goto -> 2039
    //   2031: ldc2_w 808652791
    //   2034: l2i
    //   2035: ldc_w -962670357
    //   2038: ixor
    //   2039: ldc2_w 935989734
    //   2042: l2i
    //   2043: ldc_w 949732325
    //   2046: ixor
    //   2047: ixor
    //   2048: lookupswitch default -> 2076, 151088376 -> 5062, 871590113 -> 2031
    //   2076: goto -> 2080
    //   2079: athrow
    //   2080: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   2083: goto -> 2087
    //   2086: athrow
    //   2087: getstatic Perryc.c : I
    //   2090: iflt -> 2104
    //   2093: ldc2_w 1020946980
    //   2096: l2i
    //   2097: ldc_w -291614608
    //   2100: ixor
    //   2101: goto -> 2112
    //   2104: ldc2_w -1403075660
    //   2107: l2i
    //   2108: ldc_w 1109477841
    //   2111: ixor
    //   2112: ldc2_w 1263034248
    //   2115: l2i
    //   2116: ldc_w -926058303
    //   2119: ixor
    //   2120: ixor
    //   2121: lookupswitch default -> 5040, 1371610397 -> 2104, 1845144876 -> 2148
    //   2148: goto -> 2152
    //   2151: athrow
    //   2152: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   2157: goto -> 2161
    //   2160: athrow
    //   2161: getstatic Perryc.c : I
    //   2164: iflt -> 2178
    //   2167: ldc2_w 635822749
    //   2170: l2i
    //   2171: ldc_w 1685223729
    //   2174: ixor
    //   2175: goto -> 2186
    //   2178: ldc2_w -296454167
    //   2181: l2i
    //   2182: ldc_w -1914465630
    //   2185: ixor
    //   2186: ldc2_w 1623834277
    //   2189: l2i
    //   2190: ldc_w 122202324
    //   2193: ixor
    //   2194: ixor
    //   2195: lookupswitch default -> 2220, -1013108653 -> 2178, 639012317 -> 5006
    //   2220: astore #10
    //   2222: getstatic Perryc.0 : I
    //   2225: ifle -> 2239
    //   2228: ldc2_w -858236321
    //   2231: l2i
    //   2232: ldc_w 1407330498
    //   2235: ixor
    //   2236: goto -> 2247
    //   2239: ldc2_w -1811326946
    //   2242: l2i
    //   2243: ldc_w 2050259826
    //   2246: ixor
    //   2247: ldc2_w 1316675653
    //   2250: l2i
    //   2251: ldc_w 847142043
    //   2254: ixor
    //   2255: ixor
    //   2256: lookupswitch default -> 2284, -555960094 -> 2239, -482423229 -> 5050
    //   2284: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2287: getstatic Perryc.0 : I
    //   2290: ifle -> 2304
    //   2293: ldc2_w -1816235550
    //   2296: l2i
    //   2297: ldc_w 1084426959
    //   2300: ixor
    //   2301: goto -> 2312
    //   2304: ldc2_w 76932597
    //   2307: l2i
    //   2308: ldc_w -250326531
    //   2311: ixor
    //   2312: ldc2_w 1491917377
    //   2315: l2i
    //   2316: ldc_w 191263421
    //   2319: ixor
    //   2320: ixor
    //   2321: lookupswitch default -> 5070, -2137533487 -> 2304, -1509221132 -> 2348
    //   2348: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   2351: getstatic Perryc.0 : I
    //   2354: ifle -> 2368
    //   2357: ldc2_w -882979007
    //   2360: l2i
    //   2361: ldc_w 1870386091
    //   2364: ixor
    //   2365: goto -> 2376
    //   2368: ldc2_w -286111218
    //   2371: l2i
    //   2372: ldc_w -1842108832
    //   2375: ixor
    //   2376: ldc2_w 207146780
    //   2379: l2i
    //   2380: ldc_w -99718053
    //   2383: ixor
    //   2384: ixor
    //   2385: lookupswitch default -> 2412, 1383317421 -> 4962, 2146517732 -> 2368
    //   2412: goto -> 2416
    //   2415: athrow
    //   2416: invokevirtual func_70093_af : ()Z
    //   2419: goto -> 2423
    //   2422: athrow
    //   2423: ifne -> 2437
    //   2426: ldc2_w 897399630
    //   2429: l2i
    //   2430: ldc_w 651452058
    //   2433: ixor
    //   2434: goto -> 2445
    //   2437: ldc2_w -1273718523
    //   2440: l2i
    //   2441: ldc_w -1480721194
    //   2444: ixor
    //   2445: ldc2_w -2122165674
    //   2448: l2i
    //   2449: ldc_w 262219713
    //   2452: ixor
    //   2453: ixor
    //   2454: tableswitch default -> 2426, -1651896253 -> 2476, -1651896252 -> 3590
    //   2476: getstatic Perryc.1 : I
    //   2479: ifeq -> 2493
    //   2482: ldc2_w 1930542119
    //   2485: l2i
    //   2486: ldc_w -1254836359
    //   2489: ixor
    //   2490: goto -> 2501
    //   2493: ldc2_w 762633848
    //   2496: l2i
    //   2497: ldc_w -1959018672
    //   2500: ixor
    //   2501: ldc2_w 166961422
    //   2504: l2i
    //   2505: ldc_w -643623421
    //   2508: ixor
    //   2509: ixor
    //   2510: lookupswitch default -> 2536, -1486044761 -> 2493, 376814675 -> 5024
    //   2536: getstatic bigname/zprestige/webhack/util/BlockUtil.blackList : Ljava/util/List;
    //   2539: getstatic Perryc.0 : I
    //   2542: ifle -> 2556
    //   2545: ldc2_w -1573757657
    //   2548: l2i
    //   2549: ldc_w -560469161
    //   2552: ixor
    //   2553: goto -> 2564
    //   2556: ldc2_w 866880958
    //   2559: l2i
    //   2560: ldc_w 836569857
    //   2563: ixor
    //   2564: ldc2_w 1253032830
    //   2567: l2i
    //   2568: ldc_w -1436766721
    //   2571: ixor
    //   2572: ixor
    //   2573: lookupswitch default -> 2600, -1672029967 -> 5000, -1609913915 -> 2556
    //   2600: aload #10
    //   2602: getstatic Perryc.1 : I
    //   2605: ifeq -> 2619
    //   2608: ldc2_w -561976327
    //   2611: l2i
    //   2612: ldc_w 1415665771
    //   2615: ixor
    //   2616: goto -> 2627
    //   2619: ldc2_w -362863672
    //   2622: l2i
    //   2623: ldc_w 1146353798
    //   2626: ixor
    //   2627: ldc2_w -1855511852
    //   2630: l2i
    //   2631: ldc_w 682777906
    //   2634: ixor
    //   2635: ixor
    //   2636: lookupswitch default -> 4948, 400139432 -> 2664, 859098228 -> 2619
    //   2664: goto -> 2668
    //   2667: athrow
    //   2668: invokeinterface contains : (Ljava/lang/Object;)Z
    //   2673: goto -> 2677
    //   2676: athrow
    //   2677: ifne -> 2691
    //   2680: ldc2_w -1902412889
    //   2683: l2i
    //   2684: ldc_w 779696847
    //   2687: ixor
    //   2688: goto -> 2699
    //   2691: ldc2_w -1525758613
    //   2694: l2i
    //   2695: ldc_w 99386370
    //   2698: ixor
    //   2699: ldc2_w -1479445958
    //   2702: l2i
    //   2703: ldc_w 963081924
    //   2706: ixor
    //   2707: ixor
    //   2708: tableswitch default -> 2680, 1045710230 -> 2732, 1045710231 -> 2988
    //   2732: getstatic Perryc.0 : I
    //   2735: ifle -> 2749
    //   2738: ldc2_w 1375714025
    //   2741: l2i
    //   2742: ldc_w -1061575669
    //   2745: ixor
    //   2746: goto -> 2757
    //   2749: ldc2_w -1662653053
    //   2752: l2i
    //   2753: ldc_w 1828599311
    //   2756: ixor
    //   2757: ldc2_w -1743877694
    //   2760: l2i
    //   2761: ldc_w -361184280
    //   2764: ixor
    //   2765: ixor
    //   2766: lookupswitch default -> 2792, -733420916 -> 2749, -483371832 -> 4986
    //   2792: getstatic bigname/zprestige/webhack/util/BlockUtil.shulkerList : Ljava/util/List;
    //   2795: getstatic Perryc.1 : I
    //   2798: ifeq -> 2812
    //   2801: ldc2_w -1470069037
    //   2804: l2i
    //   2805: ldc_w 93958158
    //   2808: ixor
    //   2809: goto -> 2820
    //   2812: ldc2_w -837483150
    //   2815: l2i
    //   2816: ldc_w -1070601074
    //   2819: ixor
    //   2820: ldc2_w -193048284
    //   2823: l2i
    //   2824: ldc_w 653219172
    //   2827: ixor
    //   2828: ixor
    //   2829: lookupswitch default -> 2856, 1468522949 -> 2812, 2137535133 -> 4990
    //   2856: aload #10
    //   2858: getstatic Perryc.1 : I
    //   2861: ifeq -> 2875
    //   2864: ldc2_w -744116102
    //   2867: l2i
    //   2868: ldc_w 1124264402
    //   2871: ixor
    //   2872: goto -> 2883
    //   2875: ldc2_w 1748410116
    //   2878: l2i
    //   2879: ldc_w 111181343
    //   2882: ixor
    //   2883: ldc2_w -2035139820
    //   2886: l2i
    //   2887: ldc_w 263712858
    //   2890: ixor
    //   2891: ixor
    //   2892: lookupswitch default -> 2920, -461744300 -> 2875, 430084838 -> 5074
    //   2920: goto -> 2924
    //   2923: athrow
    //   2924: invokeinterface contains : (Ljava/lang/Object;)Z
    //   2929: goto -> 2933
    //   2932: athrow
    //   2933: ifeq -> 2947
    //   2936: ldc2_w 1029722343
    //   2939: l2i
    //   2940: ldc_w -2052325904
    //   2943: ixor
    //   2944: goto -> 2955
    //   2947: ldc2_w 1090911625
    //   2950: l2i
    //   2951: ldc_w -103919457
    //   2954: ixor
    //   2955: ldc2_w -1282226473
    //   2958: l2i
    //   2959: ldc_w -1351373684
    //   2962: ixor
    //   2963: ixor
    //   2964: tableswitch default -> 2936, -1540700340 -> 2988, -1540700339 -> 3590
    //   2988: getstatic Perryc.0 : I
    //   2991: ifle -> 3005
    //   2994: ldc2_w -228947577
    //   2997: l2i
    //   2998: ldc_w -1599982118
    //   3001: ixor
    //   3002: goto -> 3013
    //   3005: ldc2_w 1511373431
    //   3008: l2i
    //   3009: ldc_w 163463022
    //   3012: ixor
    //   3013: ldc2_w 861697795
    //   3016: l2i
    //   3017: ldc_w 1168142235
    //   3020: ixor
    //   3021: ixor
    //   3022: lookupswitch default -> 4996, 604284101 -> 3005, 626498945 -> 3048
    //   3048: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   3051: getstatic Perryc.1 : I
    //   3054: ifeq -> 3068
    //   3057: ldc2_w 1894267987
    //   3060: l2i
    //   3061: ldc_w -1587876836
    //   3064: ixor
    //   3065: goto -> 3076
    //   3068: ldc2_w 1665870918
    //   3071: l2i
    //   3072: ldc_w 780569879
    //   3075: ixor
    //   3076: ldc2_w -651413975
    //   3079: l2i
    //   3080: ldc_w -1445902384
    //   3083: ixor
    //   3084: ixor
    //   3085: lookupswitch default -> 5032, -1588616778 -> 3068, 1026609320 -> 3112
    //   3112: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3115: getstatic Perryc.0 : I
    //   3118: ifle -> 3132
    //   3121: ldc2_w -440798698
    //   3124: l2i
    //   3125: ldc_w -207045668
    //   3128: ixor
    //   3129: goto -> 3140
    //   3132: ldc2_w -330753871
    //   3135: l2i
    //   3136: ldc_w 1382587201
    //   3139: ixor
    //   3140: ldc2_w 1544151430
    //   3143: l2i
    //   3144: ldc_w -80787194
    //   3147: ixor
    //   3148: ixor
    //   3149: lookupswitch default -> 3176, -1321737910 -> 4992, 906102308 -> 3132
    //   3176: getfield field_71174_a : Lnet/minecraft/client/network/NetHandlerPlayClient;
    //   3179: new net/minecraft/network/play/client/CPacketEntityAction
    //   3182: dup
    //   3183: getstatic Perryc.1 : I
    //   3186: ifeq -> 3200
    //   3189: ldc2_w -438847262
    //   3192: l2i
    //   3193: ldc_w -1996305750
    //   3196: ixor
    //   3197: goto -> 3208
    //   3200: ldc2_w -2044075140
    //   3203: l2i
    //   3204: ldc_w -189610551
    //   3207: ixor
    //   3208: ldc2_w -1163398654
    //   3211: l2i
    //   3212: ldc_w 1499798265
    //   3215: ixor
    //   3216: ixor
    //   3217: lookupswitch default -> 3244, -1894278477 -> 5036, 722013869 -> 3200
    //   3244: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   3247: getstatic Perryc.1 : I
    //   3250: ifeq -> 3264
    //   3253: ldc2_w -1084976181
    //   3256: l2i
    //   3257: ldc_w -1877036011
    //   3260: ixor
    //   3261: goto -> 3272
    //   3264: ldc2_w -1571013081
    //   3267: l2i
    //   3268: ldc_w 1972596092
    //   3271: ixor
    //   3272: ldc2_w 2053375978
    //   3275: l2i
    //   3276: ldc_w 1406827649
    //   3279: ixor
    //   3280: ixor
    //   3281: lookupswitch default -> 3308, 116677813 -> 4972, 1709594329 -> 3264
    //   3308: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   3311: getstatic Perryc.0 : I
    //   3314: ifle -> 3328
    //   3317: ldc2_w 1082936504
    //   3320: l2i
    //   3321: ldc_w -693235564
    //   3324: ixor
    //   3325: goto -> 3336
    //   3328: ldc2_w 130664164
    //   3331: l2i
    //   3332: ldc_w -347836439
    //   3335: ixor
    //   3336: ldc2_w 941644271
    //   3339: l2i
    //   3340: ldc_w 920707444
    //   3343: ixor
    //   3344: ixor
    //   3345: lookupswitch default -> 3372, -1729960777 -> 5028, -1166483599 -> 3328
    //   3372: getstatic net/minecraft/network/play/client/CPacketEntityAction$Action.START_SNEAKING : Lnet/minecraft/network/play/client/CPacketEntityAction$Action;
    //   3375: getstatic Perryc.0 : I
    //   3378: ifle -> 3392
    //   3381: ldc2_w 1918984938
    //   3384: l2i
    //   3385: ldc_w -1140206594
    //   3388: ixor
    //   3389: goto -> 3400
    //   3392: ldc2_w -1965525028
    //   3395: l2i
    //   3396: ldc_w 580628507
    //   3399: ixor
    //   3400: ldc2_w -2024013081
    //   3403: l2i
    //   3404: ldc_w -1768310299
    //   3407: ixor
    //   3408: ixor
    //   3409: lookupswitch default -> 3436, -1851090232 -> 3392, -542307818 -> 5056
    //   3436: goto -> 3440
    //   3439: athrow
    //   3440: invokespecial <init> : (Lnet/minecraft/entity/Entity;Lnet/minecraft/network/play/client/CPacketEntityAction$Action;)V
    //   3443: goto -> 3447
    //   3446: athrow
    //   3447: getstatic Perryc.c : I
    //   3450: iflt -> 3464
    //   3453: ldc2_w -1102817223
    //   3456: l2i
    //   3457: ldc_w 1451787024
    //   3460: ixor
    //   3461: goto -> 3472
    //   3464: ldc2_w -1279291239
    //   3467: l2i
    //   3468: ldc_w 387441783
    //   3471: ixor
    //   3472: ldc2_w 408657758
    //   3475: l2i
    //   3476: ldc_w -1827619162
    //   3479: ixor
    //   3480: ixor
    //   3481: lookupswitch default -> 3508, -883322196 -> 3464, 1669855953 -> 5010
    //   3508: goto -> 3512
    //   3511: athrow
    //   3512: invokevirtual func_147297_a : (Lnet/minecraft/network/Packet;)V
    //   3515: goto -> 3519
    //   3518: athrow
    //   3519: ldc2_w -907778452
    //   3522: l2i
    //   3523: ldc_w -907778451
    //   3526: ixor
    //   3527: getstatic Perryc.c : I
    //   3530: iflt -> 3544
    //   3533: ldc2_w 363225086
    //   3536: l2i
    //   3537: ldc_w 1901092400
    //   3540: ixor
    //   3541: goto -> 3552
    //   3544: ldc2_w 1635698627
    //   3547: l2i
    //   3548: ldc_w -4653605
    //   3551: ixor
    //   3552: ldc2_w 927642588
    //   3555: l2i
    //   3556: ldc_w -1066370683
    //   3559: ixor
    //   3560: ixor
    //   3561: lookupswitch default -> 3588, -1815295081 -> 5002, -1739275204 -> 3544
    //   3588: istore #5
    //   3590: getstatic Perryc.0 : I
    //   3593: ifle -> 3607
    //   3596: ldc2_w -1085111609
    //   3599: l2i
    //   3600: ldc_w 1502835060
    //   3603: ixor
    //   3604: goto -> 3615
    //   3607: ldc2_w -594148572
    //   3610: l2i
    //   3611: ldc_w 995734822
    //   3614: ixor
    //   3615: ldc2_w -1580473404
    //   3618: l2i
    //   3619: ldc_w 739220393
    //   3622: ixor
    //   3623: ixor
    //   3624: lookupswitch default -> 3652, -1152664940 -> 3607, 1795525598 -> 5048
    //   3652: iload_2
    //   3653: ifeq -> 3667
    //   3656: ldc2_w 473223264
    //   3659: l2i
    //   3660: ldc_w -130457393
    //   3663: ixor
    //   3664: goto -> 3675
    //   3667: ldc2_w -949840611
    //   3670: l2i
    //   3671: ldc_w 594486669
    //   3674: ixor
    //   3675: ldc2_w 2099861954
    //   3678: l2i
    //   3679: ldc_w 1912462834
    //   3682: ixor
    //   3683: ixor
    //   3684: tableswitch default -> 3656, -388418401 -> 3708, -388418400 -> 3907
    //   3708: getstatic Perryc.1 : I
    //   3711: ifeq -> 3725
    //   3714: ldc2_w 1632641926
    //   3717: l2i
    //   3718: ldc_w -1433122676
    //   3721: ixor
    //   3722: goto -> 3733
    //   3725: ldc2_w -290196936
    //   3728: l2i
    //   3729: ldc_w -1967598878
    //   3732: ixor
    //   3733: ldc2_w 534207714
    //   3736: l2i
    //   3737: ldc_w 338835077
    //   3740: ixor
    //   3741: ixor
    //   3742: lookupswitch default -> 3768, -1071578771 -> 5072, 223522224 -> 3725
    //   3768: getstatic bigname/zprestige/webhack/WebHack.rotationManager : Lbigname/zprestige/webhack/manager/RotationManager;
    //   3771: getstatic Perryc.c : I
    //   3774: iflt -> 3788
    //   3777: ldc2_w -514590488
    //   3780: l2i
    //   3781: ldc_w -219465945
    //   3784: ixor
    //   3785: goto -> 3796
    //   3788: ldc2_w -247602736
    //   3791: l2i
    //   3792: ldc_w -568339380
    //   3795: ixor
    //   3796: ldc2_w -1382271412
    //   3799: l2i
    //   3800: ldc_w 1268491295
    //   3803: ixor
    //   3804: ixor
    //   3805: lookupswitch default -> 3832, -172008036 -> 5038, 34615679 -> 3788
    //   3832: aload #9
    //   3834: getstatic Perryc.1 : I
    //   3837: ifeq -> 3851
    //   3840: ldc2_w -1754141783
    //   3843: l2i
    //   3844: ldc_w -147465155
    //   3847: ixor
    //   3848: goto -> 3859
    //   3851: ldc2_w 1681296909
    //   3854: l2i
    //   3855: ldc_w 1912104719
    //   3858: ixor
    //   3859: ldc2_w -733724587
    //   3862: l2i
    //   3863: ldc_w 1385908521
    //   3866: ixor
    //   3867: ixor
    //   3868: lookupswitch default -> 5066, -1827544962 -> 3896, -426033432 -> 3851
    //   3896: goto -> 3900
    //   3899: athrow
    //   3900: invokevirtual lookAtVec3d : (Lnet/minecraft/util/math/Vec3d;)V
    //   3903: goto -> 3907
    //   3906: athrow
    //   3907: getstatic Perryc.0 : I
    //   3910: ifle -> 3924
    //   3913: ldc2_w -336243914
    //   3916: l2i
    //   3917: ldc_w -735470262
    //   3920: ixor
    //   3921: goto -> 3932
    //   3924: ldc2_w -1353109730
    //   3927: l2i
    //   3928: ldc_w -1198596375
    //   3931: ixor
    //   3932: ldc2_w 594939821
    //   3935: l2i
    //   3936: ldc_w 689614030
    //   3939: ixor
    //   3940: ixor
    //   3941: lookupswitch default -> 3968, -906357761 -> 3924, 900754719 -> 5008
    //   3968: aload #7
    //   3970: getstatic Perryc.0 : I
    //   3973: ifle -> 3987
    //   3976: ldc2_w -1489380894
    //   3979: l2i
    //   3980: ldc_w 338932472
    //   3983: ixor
    //   3984: goto -> 3995
    //   3987: ldc2_w -1033828377
    //   3990: l2i
    //   3991: ldc_w -519459851
    //   3994: ixor
    //   3995: ldc2_w 1055196328
    //   3998: l2i
    //   3999: ldc_w -507130187
    //   4002: ixor
    //   4003: ixor
    //   4004: lookupswitch default -> 4032, -141951308 -> 3987, 1814733063 -> 4998
    //   4032: aload #9
    //   4034: getstatic Perryc.1 : I
    //   4037: ifeq -> 4051
    //   4040: ldc2_w -196184609
    //   4043: l2i
    //   4044: ldc_w -1831178342
    //   4047: ixor
    //   4048: goto -> 4059
    //   4051: ldc2_w 1976618682
    //   4054: l2i
    //   4055: ldc_w 1995795047
    //   4058: ixor
    //   4059: ldc2_w -1681978159
    //   4062: l2i
    //   4063: ldc_w 1265605498
    //   4066: ixor
    //   4067: ixor
    //   4068: lookupswitch default -> 4096, -1237021202 -> 5018, -471505954 -> 4051
    //   4096: aload_1
    //   4097: getstatic Perryc.c : I
    //   4100: iflt -> 4114
    //   4103: ldc2_w 557891470
    //   4106: l2i
    //   4107: ldc_w -1562619270
    //   4110: ixor
    //   4111: goto -> 4122
    //   4114: ldc2_w 1943320113
    //   4117: l2i
    //   4118: ldc_w 412173055
    //   4121: ixor
    //   4122: ldc2_w -201526941
    //   4125: l2i
    //   4126: ldc_w -2081978763
    //   4129: ixor
    //   4130: ixor
    //   4131: lookupswitch default -> 4156, -209216798 -> 4964, 489868468 -> 4114
    //   4156: aload #8
    //   4158: getstatic Perryc.1 : I
    //   4161: ifeq -> 4175
    //   4164: ldc2_w -580251396
    //   4167: l2i
    //   4168: ldc_w -496915772
    //   4171: ixor
    //   4172: goto -> 4183
    //   4175: ldc2_w 2017375138
    //   4178: l2i
    //   4179: ldc_w -2091327198
    //   4182: ixor
    //   4183: ldc2_w 887944819
    //   4186: l2i
    //   4187: ldc_w 1177800931
    //   4190: ixor
    //   4191: ixor
    //   4192: lookupswitch default -> 5034, -1984334832 -> 4220, 1305779368 -> 4175
    //   4220: iload_3
    //   4221: getstatic Perryc.c : I
    //   4224: iflt -> 4238
    //   4227: ldc2_w -579355634
    //   4230: l2i
    //   4231: ldc_w -1812648014
    //   4234: ixor
    //   4235: goto -> 4246
    //   4238: ldc2_w -181664984
    //   4241: l2i
    //   4242: ldc_w 1919194934
    //   4245: ixor
    //   4246: ldc2_w 278052267
    //   4249: l2i
    //   4250: ldc_w 2035578270
    //   4253: ixor
    //   4254: ixor
    //   4255: lookupswitch default -> 4280, -1917068006 -> 4238, 658791305 -> 4974
    //   4280: goto -> 4284
    //   4283: athrow
    //   4284: invokestatic rightClickBlock : (Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;Z)V
    //   4287: goto -> 4291
    //   4290: athrow
    //   4291: getstatic Perryc.1 : I
    //   4294: ifeq -> 4308
    //   4297: ldc2_w -1236904118
    //   4300: l2i
    //   4301: ldc_w -1481222635
    //   4304: ixor
    //   4305: goto -> 4316
    //   4308: ldc2_w 1061860158
    //   4311: l2i
    //   4312: ldc_w -1868842717
    //   4315: ixor
    //   4316: ldc2_w 1780959759
    //   4319: l2i
    //   4320: ldc_w -568938353
    //   4323: ixor
    //   4324: ixor
    //   4325: lookupswitch default -> 4352, -1514013729 -> 5052, 799723650 -> 4308
    //   4352: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   4355: getstatic Perryc.c : I
    //   4358: iflt -> 4372
    //   4361: ldc2_w -1135355538
    //   4364: l2i
    //   4365: ldc_w -1019284720
    //   4368: ixor
    //   4369: goto -> 4380
    //   4372: ldc2_w -1977638025
    //   4375: l2i
    //   4376: ldc_w -1465564306
    //   4379: ixor
    //   4380: ldc2_w -1129989298
    //   4383: l2i
    //   4384: ldc_w 314086086
    //   4387: ixor
    //   4388: ixor
    //   4389: lookupswitch default -> 5012, -1935160943 -> 4416, -781188106 -> 4372
    //   4416: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   4419: getstatic Perryc.c : I
    //   4422: iflt -> 4436
    //   4425: ldc2_w 729850940
    //   4428: l2i
    //   4429: ldc_w -2098781704
    //   4432: ixor
    //   4433: goto -> 4444
    //   4436: ldc2_w -2063714607
    //   4439: l2i
    //   4440: ldc_w -1877253933
    //   4443: ixor
    //   4444: ldc2_w -1410902413
    //   4447: l2i
    //   4448: ldc_w 441285171
    //   4451: ixor
    //   4452: ixor
    //   4453: lookupswitch default -> 5014, -1521518014 -> 4480, 416131460 -> 4436
    //   4480: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   4483: getstatic Perryc.0 : I
    //   4486: ifle -> 4500
    //   4489: ldc2_w 1206568858
    //   4492: l2i
    //   4493: ldc_w 199181957
    //   4496: ixor
    //   4497: goto -> 4508
    //   4500: ldc2_w 1873037943
    //   4503: l2i
    //   4504: ldc_w 2146695425
    //   4507: ixor
    //   4508: ldc2_w 602582005
    //   4511: l2i
    //   4512: ldc_w -44098919
    //   4515: ixor
    //   4516: ixor
    //   4517: lookupswitch default -> 4544, -2108075420 -> 4500, -1837092749 -> 5058
    //   4544: goto -> 4548
    //   4547: athrow
    //   4548: invokevirtual func_184609_a : (Lnet/minecraft/util/EnumHand;)V
    //   4551: goto -> 4555
    //   4554: athrow
    //   4555: getstatic Perryc.0 : I
    //   4558: ifle -> 4572
    //   4561: ldc2_w 1067151879
    //   4564: l2i
    //   4565: ldc_w -1026006918
    //   4568: ixor
    //   4569: goto -> 4580
    //   4572: ldc2_w 1547553396
    //   4575: l2i
    //   4576: ldc_w -1369927223
    //   4579: ixor
    //   4580: ldc2_w 2027073525
    //   4583: l2i
    //   4584: ldc_w -511816213
    //   4587: ixor
    //   4588: ixor
    //   4589: lookupswitch default -> 5068, 1693446243 -> 4572, 1808382371 -> 4616
    //   4616: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   4619: ldc2_w 1869295242
    //   4622: l2i
    //   4623: ldc_w 1869295246
    //   4626: ixor
    //   4627: getstatic Perryc.c : I
    //   4630: iflt -> 4644
    //   4633: ldc2_w 1683002299
    //   4636: l2i
    //   4637: ldc_w -471962361
    //   4640: ixor
    //   4641: goto -> 4652
    //   4644: ldc2_w -1670164149
    //   4647: l2i
    //   4648: ldc_w 1009284497
    //   4651: ixor
    //   4652: ldc2_w 265596648
    //   4655: l2i
    //   4656: ldc_w 687623570
    //   4659: ixor
    //   4660: ixor
    //   4661: lookupswitch default -> 4688, -1599726138 -> 5076, 1288366320 -> 4644
    //   4688: putfield field_71467_ac : I
    //   4691: getstatic Perryc.c : I
    //   4694: iflt -> 4708
    //   4697: ldc2_w -1390474596
    //   4700: l2i
    //   4701: ldc_w -1863849005
    //   4704: ixor
    //   4705: goto -> 4716
    //   4708: ldc2_w -1534950436
    //   4711: l2i
    //   4712: ldc_w -236343122
    //   4715: ixor
    //   4716: ldc2_w 1034581813
    //   4719: l2i
    //   4720: ldc_w -1389110144
    //   4723: ixor
    //   4724: ixor
    //   4725: lookupswitch default -> 4950, -1386132742 -> 4708, -973956921 -> 4752
    //   4752: iload #5
    //   4754: ifne -> 4768
    //   4757: ldc2_w -1743779682
    //   4760: l2i
    //   4761: ldc_w -2088370417
    //   4764: ixor
    //   4765: goto -> 4776
    //   4768: ldc2_w 1830699236
    //   4771: l2i
    //   4772: ldc_w 1988867956
    //   4775: ixor
    //   4776: ldc2_w 878743771
    //   4779: l2i
    //   4780: ldc_w -1274696664
    //   4783: ixor
    //   4784: ixor
    //   4785: tableswitch default -> 4757, -1678718110 -> 4808, -1678718109 -> 4924
    //   4808: getstatic Perryc.1 : I
    //   4811: ifeq -> 4825
    //   4814: ldc2_w 241860237
    //   4817: l2i
    //   4818: ldc_w -415993129
    //   4821: ixor
    //   4822: goto -> 4833
    //   4825: ldc2_w -125107540
    //   4828: l2i
    //   4829: ldc_w -409405917
    //   4832: ixor
    //   4833: ldc2_w 802233460
    //   4836: l2i
    //   4837: ldc_w 1290572883
    //   4840: ixor
    //   4841: ixor
    //   4842: lookupswitch default -> 5046, -1973189507 -> 4825, 2083421352 -> 4868
    //   4868: iload #4
    //   4870: ifeq -> 4884
    //   4873: ldc2_w -1411627397
    //   4876: l2i
    //   4877: ldc_w 1162891568
    //   4880: ixor
    //   4881: goto -> 4892
    //   4884: ldc2_w -2020002379
    //   4887: l2i
    //   4888: ldc_w 1762992893
    //   4891: ixor
    //   4892: ldc2_w 95773781
    //   4895: l2i
    //   4896: ldc_w 660763491
    //   4899: ixor
    //   4900: ixor
    //   4901: tableswitch default -> 4873, -866451331 -> 4924, -866451330 -> 4935
    //   4924: ldc2_w -250162635
    //   4927: l2i
    //   4928: ldc_w -250162636
    //   4931: ixor
    //   4932: goto -> 4943
    //   4935: ldc2_w -290513470
    //   4938: l2i
    //   4939: ldc_w -290513470
    //   4942: ixor
    //   4943: ireturn
    //   4944: aconst_null
    //   4945: athrow
    //   4946: aconst_null
    //   4947: athrow
    //   4948: aconst_null
    //   4949: athrow
    //   4950: aconst_null
    //   4951: athrow
    //   4952: aconst_null
    //   4953: athrow
    //   4954: aconst_null
    //   4955: athrow
    //   4956: aconst_null
    //   4957: athrow
    //   4958: aconst_null
    //   4959: athrow
    //   4960: aconst_null
    //   4961: athrow
    //   4962: aconst_null
    //   4963: athrow
    //   4964: aconst_null
    //   4965: athrow
    //   4966: aconst_null
    //   4967: athrow
    //   4968: aconst_null
    //   4969: athrow
    //   4970: aconst_null
    //   4971: athrow
    //   4972: aconst_null
    //   4973: athrow
    //   4974: aconst_null
    //   4975: athrow
    //   4976: aconst_null
    //   4977: athrow
    //   4978: aconst_null
    //   4979: athrow
    //   4980: aconst_null
    //   4981: athrow
    //   4982: aconst_null
    //   4983: athrow
    //   4984: aconst_null
    //   4985: athrow
    //   4986: aconst_null
    //   4987: athrow
    //   4988: aconst_null
    //   4989: athrow
    //   4990: aconst_null
    //   4991: athrow
    //   4992: aconst_null
    //   4993: athrow
    //   4994: aconst_null
    //   4995: athrow
    //   4996: aconst_null
    //   4997: athrow
    //   4998: aconst_null
    //   4999: athrow
    //   5000: aconst_null
    //   5001: athrow
    //   5002: aconst_null
    //   5003: athrow
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
    //   5078: pop
    //   5079: goto -> 24
    //   5082: pop
    //   5083: aconst_null
    //   5084: goto -> 5078
    //   5087: dup
    //   5088: ifnull -> 5078
    //   5091: checkcast java/lang/Throwable
    //   5094: athrow
    //   5095: dup
    //   5096: ifnull -> 5082
    //   5099: checkcast java/lang/Throwable
    //   5102: athrow
    //   5103: aconst_null
    //   5104: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	4920	0	pos	Lnet/minecraft/util/math/BlockPos;
    //   24	4920	1	hand	Lnet/minecraft/util/EnumHand;
    //   24	4920	2	rotate	Z
    //   24	4920	3	packet	Z
    //   24	4920	4	isSneaking	Z
    //   94	4850	5	sneaking	Z
    //   290	4654	6	side	Lnet/minecraft/util/EnumFacing;
    //   938	4006	7	neighbour	Lnet/minecraft/util/math/BlockPos;
    //   1138	3806	8	opposite	Lnet/minecraft/util/EnumFacing;
    //   1822	3122	9	hitVec	Lnet/minecraft/util/math/Vec3d;
    //   2222	2722	10	neighbourBlock	Lnet/minecraft/block/Block;
    // Exception table:
    //   from	to	target	type
    //   8	20	5087	finally
    //   219	226	226	finally
    //   219	226	226	finally
    //   219	226	226	finally
    //   220	226	219	java/util/NoSuchElementException
    //   220	226	3	finally
    //   419	426	426	finally
    //   419	426	426	finally
    //   419	426	419	finally
    //   419	426	426	finally
    //   420	426	426	java/lang/UnsupportedOperationException
    //   491	498	498	finally
    //   491	498	491	finally
    //   491	498	498	java/lang/IndexOutOfBoundsException
    //   491	498	3	finally
    //   492	498	498	java/util/NoSuchElementException
    //   867	874	874	finally
    //   867	874	874	finally
    //   867	874	867	finally
    //   868	874	3	finally
    //   868	874	3	java/lang/IllegalStateException
    //   1067	1074	1074	finally
    //   1068	1074	1067	finally
    //   1068	1074	3	java/lang/ArithmeticException
    //   1068	1074	3	finally
    //   1068	1074	1074	finally
    //   1271	1278	1278	finally
    //   1271	1278	1278	java/lang/ArrayIndexOutOfBoundsException
    //   1271	1278	1278	java/util/ConcurrentModificationException
    //   1272	1278	1271	finally
    //   1272	1278	3	java/lang/RuntimeException
    //   1383	1390	1390	finally
    //   1383	1390	1383	finally
    //   1384	1390	3	java/lang/EnumConstantNotPresentException
    //   1384	1390	1390	finally
    //   1384	1390	3	finally
    //   1523	1530	1530	finally
    //   1523	1530	1523	finally
    //   1523	1530	1530	finally
    //   1524	1530	1523	finally
    //   1524	1530	1523	java/lang/IndexOutOfBoundsException
    //   1595	1602	1602	finally
    //   1595	1602	3	java/lang/ArithmeticException
    //   1595	1602	1595	finally
    //   1596	1602	3	java/lang/ClassCastException
    //   1596	1602	1602	finally
    //   1679	1686	1686	finally
    //   1679	1686	1686	finally
    //   1680	1686	1679	finally
    //   1680	1686	1679	java/lang/StringIndexOutOfBoundsException
    //   1680	1686	3	java/lang/ArithmeticException
    //   1751	1758	1758	finally
    //   1751	1758	1751	finally
    //   1751	1758	1751	finally
    //   1752	1758	3	java/lang/StringIndexOutOfBoundsException
    //   1752	1758	1758	java/lang/NegativeArraySizeException
    //   2080	2086	2086	finally
    //   2080	2086	2086	finally
    //   2080	2086	3	finally
    //   2080	2086	2086	java/util/NoSuchElementException
    //   2080	2086	3	finally
    //   2151	2160	2160	finally
    //   2151	2160	2160	java/lang/EnumConstantNotPresentException
    //   2151	2160	2160	finally
    //   2151	2160	2151	java/lang/ArithmeticException
    //   2152	2160	2151	finally
    //   2416	2422	2422	finally
    //   2416	2422	2422	java/lang/IllegalArgumentException
    //   2416	2422	3	finally
    //   2416	2422	3	finally
    //   2416	2422	2422	java/lang/NegativeArraySizeException
    //   2667	2676	2676	finally
    //   2667	2676	2676	java/lang/ArithmeticException
    //   2668	2676	2667	java/lang/ArithmeticException
    //   2668	2676	2676	finally
    //   2668	2676	2667	java/util/ConcurrentModificationException
    //   2923	2932	2932	finally
    //   2923	2932	2923	java/lang/NegativeArraySizeException
    //   2923	2932	3	java/lang/RuntimeException
    //   2923	2932	3	finally
    //   2924	2932	2932	finally
    //   3439	3446	3446	finally
    //   3439	3446	3439	finally
    //   3439	3446	3	finally
    //   3439	3446	3439	java/lang/StringIndexOutOfBoundsException
    //   3440	3446	3	java/util/ConcurrentModificationException
    //   3511	3518	3518	finally
    //   3511	3518	3511	java/lang/RuntimeException
    //   3511	3518	3	finally
    //   3512	3518	3511	finally
    //   3512	3518	3518	finally
    //   3899	3906	3906	finally
    //   3899	3906	3899	java/lang/NullPointerException
    //   3900	3906	3906	finally
    //   3900	3906	3	java/lang/RuntimeException
    //   3900	3906	3	java/lang/StringIndexOutOfBoundsException
    //   4283	4290	4290	finally
    //   4283	4290	4290	java/lang/IllegalArgumentException
    //   4283	4290	4283	java/lang/IndexOutOfBoundsException
    //   4284	4290	4290	java/lang/RuntimeException
    //   4284	4290	4290	finally
    //   4547	4554	4554	finally
    //   4547	4554	3	finally
    //   4548	4554	4554	java/lang/NumberFormatException
    //   4548	4554	4547	finally
    //   4548	4554	4547	finally
    //   5087	5095	5087	finally
    //   5103	5105	3	finally
  }
  
  public static boolean isBlockSolid(BlockPos paramBlockPos) {
    return Perry1.6l(null, (int)1277141605L ^ 0x2BE02410, paramBlockPos);
  }
  
  public static boolean lambda$getBlockSphere$0(Class clazz, BlockPos pos) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 527
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 519
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 511
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 1178840132
    //   33: l2i
    //   34: ldc_w -2072226860
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 866144987
    //   44: l2i
    //   45: ldc_w -1533939214
    //   48: ixor
    //   49: ldc2_w 2134057543
    //   52: l2i
    //   53: ldc_w -1918813309
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 490, 816703060 -> 41, 1705229037 -> 84
    //   84: aload_0
    //   85: getstatic Perryc.1 : I
    //   88: ifeq -> 102
    //   91: ldc2_w 364202218
    //   94: l2i
    //   95: ldc_w -686635186
    //   98: ixor
    //   99: goto -> 110
    //   102: ldc2_w -1311122606
    //   105: l2i
    //   106: ldc_w -323077065
    //   109: ixor
    //   110: ldc2_w 26387415
    //   113: l2i
    //   114: ldc_w -1456285280
    //   117: ixor
    //   118: ixor
    //   119: lookupswitch default -> 144, -1566022699 -> 102, 1778906579 -> 498
    //   144: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   147: getstatic Perryc.1 : I
    //   150: ifeq -> 164
    //   153: ldc2_w -565194330
    //   156: l2i
    //   157: ldc_w -1902483889
    //   160: ixor
    //   161: goto -> 172
    //   164: ldc2_w 1858858345
    //   167: l2i
    //   168: ldc_w -1851473780
    //   171: ixor
    //   172: ldc2_w -1174172439
    //   175: l2i
    //   176: ldc_w -356810009
    //   179: ixor
    //   180: ixor
    //   181: lookupswitch default -> 208, -352070437 -> 164, 7191015 -> 494
    //   208: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   211: getstatic Perryc.1 : I
    //   214: ifeq -> 228
    //   217: ldc2_w 2006210891
    //   220: l2i
    //   221: ldc_w -1922062081
    //   224: ixor
    //   225: goto -> 236
    //   228: ldc2_w -1585133305
    //   231: l2i
    //   232: ldc_w -614167655
    //   235: ixor
    //   236: ldc2_w 1689086003
    //   239: l2i
    //   240: ldc_w -1605394407
    //   243: ixor
    //   244: ixor
    //   245: lookupswitch default -> 272, 186137847 -> 228, 1041840542 -> 496
    //   272: aload_1
    //   273: getstatic Perryc.1 : I
    //   276: ifeq -> 290
    //   279: ldc2_w 1524819153
    //   282: l2i
    //   283: ldc_w 769347637
    //   286: ixor
    //   287: goto -> 298
    //   290: ldc2_w 1983796916
    //   293: l2i
    //   294: ldc_w -579527417
    //   297: ixor
    //   298: ldc2_w -932227093
    //   301: l2i
    //   302: ldc_w 1096806958
    //   305: ixor
    //   306: ixor
    //   307: lookupswitch default -> 488, -32960223 -> 290, 578547318 -> 332
    //   332: goto -> 336
    //   335: athrow
    //   336: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   339: goto -> 343
    //   342: athrow
    //   343: getstatic Perryc.0 : I
    //   346: ifle -> 360
    //   349: ldc2_w 450606442
    //   352: l2i
    //   353: ldc_w -717485700
    //   356: ixor
    //   357: goto -> 368
    //   360: ldc2_w 1396669966
    //   363: l2i
    //   364: ldc_w 1740648375
    //   367: ixor
    //   368: ldc2_w 2063515316
    //   371: l2i
    //   372: ldc_w -1516086638
    //   375: ixor
    //   376: ixor
    //   377: lookupswitch default -> 500, -341592673 -> 404, 280713264 -> 360
    //   404: goto -> 408
    //   407: athrow
    //   408: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   413: goto -> 417
    //   416: athrow
    //   417: getstatic Perryc.0 : I
    //   420: ifle -> 434
    //   423: ldc2_w -656288489
    //   426: l2i
    //   427: ldc_w 1627367591
    //   430: ixor
    //   431: goto -> 442
    //   434: ldc2_w 422039785
    //   437: l2i
    //   438: ldc_w -1759380313
    //   441: ixor
    //   442: ldc2_w -1762079985
    //   445: l2i
    //   446: ldc_w 311550333
    //   449: ixor
    //   450: ixor
    //   451: lookupswitch default -> 492, 175048252 -> 476, 1014454210 -> 434
    //   476: goto -> 480
    //   479: athrow
    //   480: invokevirtual isInstance : (Ljava/lang/Object;)Z
    //   483: goto -> 487
    //   486: athrow
    //   487: ireturn
    //   488: aconst_null
    //   489: athrow
    //   490: aconst_null
    //   491: athrow
    //   492: aconst_null
    //   493: athrow
    //   494: aconst_null
    //   495: athrow
    //   496: aconst_null
    //   497: athrow
    //   498: aconst_null
    //   499: athrow
    //   500: aconst_null
    //   501: athrow
    //   502: pop
    //   503: goto -> 24
    //   506: pop
    //   507: aconst_null
    //   508: goto -> 502
    //   511: dup
    //   512: ifnull -> 502
    //   515: checkcast java/lang/Throwable
    //   518: athrow
    //   519: dup
    //   520: ifnull -> 506
    //   523: checkcast java/lang/Throwable
    //   526: athrow
    //   527: aconst_null
    //   528: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	464	0	clazz	Ljava/lang/Class;
    //   24	464	1	pos	Lnet/minecraft/util/math/BlockPos;
    // Exception table:
    //   from	to	target	type
    //   8	20	511	finally
    //   336	342	342	finally
    //   336	342	342	java/lang/ArrayIndexOutOfBoundsException
    //   336	342	342	java/lang/ArrayIndexOutOfBoundsException
    //   336	342	3	finally
    //   336	342	3	finally
    //   407	416	416	finally
    //   407	416	3	java/lang/RuntimeException
    //   407	416	3	finally
    //   408	416	407	finally
    //   408	416	3	java/lang/IllegalArgumentException
    //   480	486	486	finally
    //   480	486	486	finally
    //   480	486	486	java/lang/AssertionError
    //   480	486	3	finally
    //   480	486	3	java/lang/RuntimeException
    //   511	519	511	java/lang/IllegalStateException
    //   527	529	3	finally
  }
  
  public static int isPositionPlaceable(BlockPos paramBlockPos, boolean paramBoolean) {
    return Perry1.M(null, (int)943238234L ^ 0x2F235949, paramBlockPos, paramBoolean);
  }
  
  public static boolean canPlaceCrystal(BlockPos blockPos) {
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
  
  public static boolean rayTracePlaceCheck(BlockPos paramBlockPos, boolean paramBoolean) {
    return Perry1.5c(null, (int)2068541312L ^ 0x4D50AAA8, paramBlockPos, paramBoolean);
  }
  
  public static boolean isBlockUnSolid(BlockPos paramBlockPos) {
    return Perry1.6p(null, (int)-1717427467L ^ 0xC3E1CA15, paramBlockPos);
  }
  
  public static boolean isValidBlock(BlockPos paramBlockPos) {
    return Perry1.6n(null, (int)1528842193L ^ 0x1643B3BB, paramBlockPos);
  }
  
  public static boolean isBlockUnSolid(Block paramBlock) {
    return Perry1.5L(null, (int)-831122204L ^ 0xC9C3C83C, paramBlock);
  }
  
  public static boolean canPlaceCrystal(BlockPos blockPos, boolean specialEntityCheck, boolean oneDot15) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 5347
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 5339
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 5331
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w -202041505
    //   33: l2i
    //   34: ldc_w 133114804
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1879958398
    //   44: l2i
    //   45: ldc_w 1132289160
    //   48: ixor
    //   49: ldc2_w -1850278778
    //   52: l2i
    //   53: ldc_w 576361476
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1504508469 -> 41, 1207325801 -> 5238
    //   84: aload_0
    //   85: ldc2_w 1100387105
    //   88: l2i
    //   89: ldc_w 1100387105
    //   92: ixor
    //   93: ldc2_w 1816813111
    //   96: l2i
    //   97: ldc_w 1816813110
    //   100: ixor
    //   101: ldc2_w 1024372560
    //   104: l2i
    //   105: ldc_w 1024372560
    //   108: ixor
    //   109: getstatic Perryc.0 : I
    //   112: ifle -> 126
    //   115: ldc2_w 1484620926
    //   118: l2i
    //   119: ldc_w 484771698
    //   122: ixor
    //   123: goto -> 134
    //   126: ldc2_w 1535016052
    //   129: l2i
    //   130: ldc_w 1185276266
    //   133: ixor
    //   134: ldc2_w -1229907410
    //   137: l2i
    //   138: ldc_w -15193673
    //   141: ixor
    //   142: ixor
    //   143: lookupswitch default -> 168, -1600568393 -> 126, 221360277 -> 5296
    //   168: goto -> 172
    //   171: athrow
    //   172: invokevirtual func_177982_a : (III)Lnet/minecraft/util/math/BlockPos;
    //   175: goto -> 179
    //   178: athrow
    //   179: getstatic Perryc.0 : I
    //   182: ifle -> 196
    //   185: ldc2_w -1940077166
    //   188: l2i
    //   189: ldc_w 39716154
    //   192: ixor
    //   193: goto -> 204
    //   196: ldc2_w -1381303991
    //   199: l2i
    //   200: ldc_w -329017482
    //   203: ixor
    //   204: ldc2_w -1583234511
    //   207: l2i
    //   208: ldc_w -1441052161
    //   211: ixor
    //   212: ixor
    //   213: lookupswitch default -> 240, -2051519642 -> 5230, 846125870 -> 196
    //   240: astore_3
    //   241: getstatic Perryc.0 : I
    //   244: ifle -> 258
    //   247: ldc2_w -1395737780
    //   250: l2i
    //   251: ldc_w 1517146979
    //   254: ixor
    //   255: goto -> 266
    //   258: ldc2_w 1516700417
    //   261: l2i
    //   262: ldc_w -841921264
    //   265: ixor
    //   266: ldc2_w 97832516
    //   269: l2i
    //   270: ldc_w 721676600
    //   273: ixor
    //   274: ixor
    //   275: lookupswitch default -> 300, -663466157 -> 5240, -66334415 -> 258
    //   300: aload_0
    //   301: ldc2_w -178092454
    //   304: l2i
    //   305: ldc_w -178092454
    //   308: ixor
    //   309: ldc2_w -1842861670
    //   312: l2i
    //   313: ldc_w -1842861672
    //   316: ixor
    //   317: ldc2_w -516849620
    //   320: l2i
    //   321: ldc_w -516849620
    //   324: ixor
    //   325: getstatic Perryc.1 : I
    //   328: ifeq -> 342
    //   331: ldc2_w -1205429306
    //   334: l2i
    //   335: ldc_w -1981793382
    //   338: ixor
    //   339: goto -> 350
    //   342: ldc2_w -1481302155
    //   345: l2i
    //   346: ldc_w -176109088
    //   349: ixor
    //   350: ldc2_w -1867651280
    //   353: l2i
    //   354: ldc_w -2122947785
    //   357: ixor
    //   358: ixor
    //   359: lookupswitch default -> 5272, 538780763 -> 342, 1139692178 -> 384
    //   384: goto -> 388
    //   387: athrow
    //   388: invokevirtual func_177982_a : (III)Lnet/minecraft/util/math/BlockPos;
    //   391: goto -> 395
    //   394: athrow
    //   395: getstatic Perryc.c : I
    //   398: iflt -> 412
    //   401: ldc2_w 623152473
    //   404: l2i
    //   405: ldc_w 687833561
    //   408: ixor
    //   409: goto -> 420
    //   412: ldc2_w -335778502
    //   415: l2i
    //   416: ldc_w -1133494862
    //   419: ixor
    //   420: ldc2_w 1539509131
    //   423: l2i
    //   424: ldc_w -36083392
    //   427: ixor
    //   428: ixor
    //   429: lookupswitch default -> 5266, -1413386677 -> 412, -241814973 -> 456
    //   456: astore #4
    //   458: getstatic Perryc.0 : I
    //   461: ifle -> 475
    //   464: ldc2_w 209173645
    //   467: l2i
    //   468: ldc_w -1242346276
    //   471: ixor
    //   472: goto -> 483
    //   475: ldc2_w 253968423
    //   478: l2i
    //   479: ldc_w 870976761
    //   482: ixor
    //   483: ldc2_w 465072943
    //   486: l2i
    //   487: ldc_w -302569024
    //   490: ixor
    //   491: ixor
    //   492: lookupswitch default -> 5274, -897182159 -> 520, 1338747582 -> 475
    //   520: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   523: getstatic Perryc.c : I
    //   526: iflt -> 540
    //   529: ldc2_w -1644907225
    //   532: l2i
    //   533: ldc_w -2080254926
    //   536: ixor
    //   537: goto -> 548
    //   540: ldc2_w -1992803462
    //   543: l2i
    //   544: ldc_w -1346692996
    //   547: ixor
    //   548: ldc2_w -274261648
    //   551: l2i
    //   552: ldc_w -1114859305
    //   555: ixor
    //   556: ixor
    //   557: lookupswitch default -> 584, 503621911 -> 540, 1272897714 -> 5194
    //   584: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   587: getstatic Perryc.0 : I
    //   590: ifle -> 604
    //   593: ldc2_w -1479939025
    //   596: l2i
    //   597: ldc_w -29068126
    //   600: ixor
    //   601: goto -> 612
    //   604: ldc2_w 172484517
    //   607: l2i
    //   608: ldc_w -682464882
    //   611: ixor
    //   612: ldc2_w -100650
    //   615: l2i
    //   616: ldc_w 1321255137
    //   619: ixor
    //   620: ixor
    //   621: lookupswitch default -> 5202, -390910278 -> 604, 1814771740 -> 648
    //   648: aload_0
    //   649: getstatic Perryc.0 : I
    //   652: ifle -> 666
    //   655: ldc2_w 828678694
    //   658: l2i
    //   659: ldc_w 481592844
    //   662: ixor
    //   663: goto -> 674
    //   666: ldc2_w -1495996164
    //   669: l2i
    //   670: ldc_w 14160255
    //   673: ixor
    //   674: ldc2_w -1508507907
    //   677: l2i
    //   678: ldc_w -1847691007
    //   681: ixor
    //   682: ixor
    //   683: lookupswitch default -> 5254, -1849196929 -> 708, 438019030 -> 666
    //   708: goto -> 712
    //   711: athrow
    //   712: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   715: goto -> 719
    //   718: athrow
    //   719: getstatic Perryc.c : I
    //   722: iflt -> 736
    //   725: ldc2_w 1103909461
    //   728: l2i
    //   729: ldc_w -1352152049
    //   732: ixor
    //   733: goto -> 744
    //   736: ldc2_w -1202472437
    //   739: l2i
    //   740: ldc_w -374272481
    //   743: ixor
    //   744: ldc2_w -1778309883
    //   747: l2i
    //   748: ldc_w 279190241
    //   751: ixor
    //   752: ixor
    //   753: lookupswitch default -> 780, -1255814984 -> 736, 1745789374 -> 5278
    //   780: goto -> 784
    //   783: athrow
    //   784: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   789: goto -> 793
    //   792: athrow
    //   793: getstatic Perryc.c : I
    //   796: iflt -> 810
    //   799: ldc2_w 339982408
    //   802: l2i
    //   803: ldc_w -2066976286
    //   806: ixor
    //   807: goto -> 818
    //   810: ldc2_w -1489088877
    //   813: l2i
    //   814: ldc_w -404182710
    //   817: ixor
    //   818: ldc2_w -2131105395
    //   821: l2i
    //   822: ldc_w -1731607536
    //   825: ixor
    //   826: ixor
    //   827: lookupswitch default -> 852, -2000690121 -> 5208, -1391819411 -> 810
    //   852: getstatic net/minecraft/init/Blocks.field_150357_h : Lnet/minecraft/block/Block;
    //   855: if_acmpeq -> 869
    //   858: ldc2_w 1956033940
    //   861: l2i
    //   862: ldc_w 679592742
    //   865: ixor
    //   866: goto -> 877
    //   869: ldc2_w 238423135
    //   872: l2i
    //   873: ldc_w 1377925868
    //   876: ixor
    //   877: ldc2_w -2050135961
    //   880: l2i
    //   881: ldc_w -469284675
    //   884: ixor
    //   885: ixor
    //   886: tableswitch default -> 858, 1037915752 -> 908, 1037915753 -> 1365
    //   908: getstatic Perryc.1 : I
    //   911: ifeq -> 925
    //   914: ldc2_w -474038775
    //   917: l2i
    //   918: ldc_w -392083044
    //   921: ixor
    //   922: goto -> 933
    //   925: ldc2_w -429293779
    //   928: l2i
    //   929: ldc_w 986526303
    //   932: ixor
    //   933: ldc2_w 297037037
    //   936: l2i
    //   937: ldc_w -2085487581
    //   940: ixor
    //   941: ixor
    //   942: lookupswitch default -> 968, -1726322853 -> 5228, 1835808575 -> 925
    //   968: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   971: getstatic Perryc.0 : I
    //   974: ifle -> 988
    //   977: ldc2_w -1206511232
    //   980: l2i
    //   981: ldc_w -419066938
    //   984: ixor
    //   985: goto -> 996
    //   988: ldc2_w 1238414581
    //   991: l2i
    //   992: ldc_w -210924864
    //   995: ixor
    //   996: ldc2_w -780957201
    //   999: l2i
    //   1000: ldc_w 724325250
    //   1003: ixor
    //   1004: ixor
    //   1005: lookupswitch default -> 5280, -1521727445 -> 988, 1088611416 -> 1032
    //   1032: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1035: getstatic Perryc.1 : I
    //   1038: ifeq -> 1052
    //   1041: ldc2_w -840587716
    //   1044: l2i
    //   1045: ldc_w -1751571653
    //   1048: ixor
    //   1049: goto -> 1060
    //   1052: ldc2_w -1863671506
    //   1055: l2i
    //   1056: ldc_w -1738995540
    //   1059: ixor
    //   1060: ldc2_w 450490439
    //   1063: l2i
    //   1064: ldc_w 912939264
    //   1067: ixor
    //   1068: ixor
    //   1069: lookupswitch default -> 5222, 603979973 -> 1096, 1993288768 -> 1052
    //   1096: aload_0
    //   1097: getstatic Perryc.1 : I
    //   1100: ifeq -> 1114
    //   1103: ldc2_w -280118247
    //   1106: l2i
    //   1107: ldc_w 6767822
    //   1110: ixor
    //   1111: goto -> 1122
    //   1114: ldc2_w -1118035028
    //   1117: l2i
    //   1118: ldc_w -1016902795
    //   1121: ixor
    //   1122: ldc2_w 527551392
    //   1125: l2i
    //   1126: ldc_w -588681540
    //   1129: ixor
    //   1130: ixor
    //   1131: lookupswitch default -> 5284, -1113076283 -> 1156, 749886923 -> 1114
    //   1156: goto -> 1160
    //   1159: athrow
    //   1160: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1163: goto -> 1167
    //   1166: athrow
    //   1167: getstatic Perryc.c : I
    //   1170: iflt -> 1184
    //   1173: ldc2_w -781753635
    //   1176: l2i
    //   1177: ldc_w -802087806
    //   1180: ixor
    //   1181: goto -> 1192
    //   1184: ldc2_w 1224741833
    //   1187: l2i
    //   1188: ldc_w -1339353969
    //   1191: ixor
    //   1192: ldc2_w -354298703
    //   1195: l2i
    //   1196: ldc_w -609096750
    //   1199: ixor
    //   1200: ixor
    //   1201: lookupswitch default -> 5300, -931448795 -> 1228, 805716284 -> 1184
    //   1228: goto -> 1232
    //   1231: athrow
    //   1232: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   1237: goto -> 1241
    //   1240: athrow
    //   1241: getstatic Perryc.1 : I
    //   1244: ifeq -> 1258
    //   1247: ldc2_w 2062270088
    //   1250: l2i
    //   1251: ldc_w -698023832
    //   1254: ixor
    //   1255: goto -> 1266
    //   1258: ldc2_w 1952534715
    //   1261: l2i
    //   1262: ldc_w 756331962
    //   1265: ixor
    //   1266: ldc2_w 24224331
    //   1269: l2i
    //   1270: ldc_w -197176466
    //   1273: ixor
    //   1274: ixor
    //   1275: lookupswitch default -> 1300, -945359636 -> 1258, 1505775557 -> 5250
    //   1300: getstatic net/minecraft/init/Blocks.field_150343_Z : Lnet/minecraft/block/Block;
    //   1303: if_acmpeq -> 1317
    //   1306: ldc2_w 111806088
    //   1309: l2i
    //   1310: ldc_w -1337455784
    //   1313: ixor
    //   1314: goto -> 1325
    //   1317: ldc2_w 44539164
    //   1320: l2i
    //   1321: ldc_w -1270509389
    //   1324: ixor
    //   1325: ldc2_w 638430503
    //   1328: l2i
    //   1329: ldc_w 1083673928
    //   1332: ixor
    //   1333: ixor
    //   1334: tableswitch default -> 1306, -797430337 -> 1356, -797430336 -> 1365
    //   1356: ldc2_w -1480575161
    //   1359: l2i
    //   1360: ldc_w -1480575161
    //   1363: ixor
    //   1364: ireturn
    //   1365: getstatic Perryc.c : I
    //   1368: iflt -> 1382
    //   1371: ldc2_w -1205003027
    //   1374: l2i
    //   1375: ldc_w -1528592398
    //   1378: ixor
    //   1379: goto -> 1390
    //   1382: ldc2_w -1842061618
    //   1385: l2i
    //   1386: ldc_w -690706622
    //   1389: ixor
    //   1390: ldc2_w 241921276
    //   1393: l2i
    //   1394: ldc_w -790567770
    //   1397: ixor
    //   1398: ixor
    //   1399: lookupswitch default -> 5282, -1704234538 -> 1424, -1035660475 -> 1382
    //   1424: iload_2
    //   1425: ifne -> 1439
    //   1428: ldc2_w 811025706
    //   1431: l2i
    //   1432: ldc_w 1836711808
    //   1435: ixor
    //   1436: goto -> 1447
    //   1439: ldc2_w 337629051
    //   1442: l2i
    //   1443: ldc_w 1227978194
    //   1446: ixor
    //   1447: ldc2_w 1978498688
    //   1450: l2i
    //   1451: ldc_w 1117986031
    //   1454: ixor
    //   1455: ixor
    //   1456: tableswitch default -> 1428, 1784731845 -> 1480, 1784731846 -> 1932
    //   1480: getstatic Perryc.0 : I
    //   1483: ifle -> 1497
    //   1486: ldc2_w 581496959
    //   1489: l2i
    //   1490: ldc_w 477002375
    //   1493: ixor
    //   1494: goto -> 1505
    //   1497: ldc2_w -1409662557
    //   1500: l2i
    //   1501: ldc_w 422077234
    //   1504: ixor
    //   1505: ldc2_w 1076936155
    //   1508: l2i
    //   1509: ldc_w 1984593519
    //   1512: ixor
    //   1513: ixor
    //   1514: lookupswitch default -> 1540, 146557260 -> 5306, 378280322 -> 1497
    //   1540: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1543: getstatic Perryc.1 : I
    //   1546: ifeq -> 1560
    //   1549: ldc2_w -1715481442
    //   1552: l2i
    //   1553: ldc_w -1622924068
    //   1556: ixor
    //   1557: goto -> 1568
    //   1560: ldc2_w -1678333
    //   1563: l2i
    //   1564: ldc_w 2089171584
    //   1567: ixor
    //   1568: ldc2_w -919931624
    //   1571: l2i
    //   1572: ldc_w 710622061
    //   1575: ixor
    //   1576: ixor
    //   1577: lookupswitch default -> 5232, -443924937 -> 1560, 1611763958 -> 1604
    //   1604: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1607: getstatic Perryc.1 : I
    //   1610: ifeq -> 1624
    //   1613: ldc2_w 833943131
    //   1616: l2i
    //   1617: ldc_w 679988768
    //   1620: ixor
    //   1621: goto -> 1632
    //   1624: ldc2_w -440731574
    //   1627: l2i
    //   1628: ldc_w 1563320758
    //   1631: ixor
    //   1632: ldc2_w -867799977
    //   1635: l2i
    //   1636: ldc_w 1721331746
    //   1639: ixor
    //   1640: ixor
    //   1641: lookupswitch default -> 5320, -1276369906 -> 1624, 306939273 -> 1668
    //   1668: aload #4
    //   1670: getstatic Perryc.1 : I
    //   1673: ifeq -> 1687
    //   1676: ldc2_w 1844570267
    //   1679: l2i
    //   1680: ldc_w -1136471888
    //   1683: ixor
    //   1684: goto -> 1695
    //   1687: ldc2_w 1456254096
    //   1690: l2i
    //   1691: ldc_w 670301787
    //   1694: ixor
    //   1695: ldc2_w 1069290558
    //   1698: l2i
    //   1699: ldc_w -222108212
    //   1702: ixor
    //   1703: ixor
    //   1704: lookupswitch default -> 1732, 483248601 -> 5200, 606368655 -> 1687
    //   1732: goto -> 1736
    //   1735: athrow
    //   1736: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1739: goto -> 1743
    //   1742: athrow
    //   1743: getstatic Perryc.c : I
    //   1746: iflt -> 1760
    //   1749: ldc2_w 1237579561
    //   1752: l2i
    //   1753: ldc_w -526382166
    //   1756: ixor
    //   1757: goto -> 1768
    //   1760: ldc2_w 1377885761
    //   1763: l2i
    //   1764: ldc_w 1274788141
    //   1767: ixor
    //   1768: ldc2_w -196905891
    //   1771: l2i
    //   1772: ldc_w -479141021
    //   1775: ixor
    //   1776: ixor
    //   1777: lookupswitch default -> 5206, -1102025795 -> 1760, 250146898 -> 1804
    //   1804: goto -> 1808
    //   1807: athrow
    //   1808: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   1813: goto -> 1817
    //   1816: athrow
    //   1817: getstatic Perryc.1 : I
    //   1820: ifeq -> 1834
    //   1823: ldc2_w 552166694
    //   1826: l2i
    //   1827: ldc_w 2101236262
    //   1830: ixor
    //   1831: goto -> 1842
    //   1834: ldc2_w 1469173974
    //   1837: l2i
    //   1838: ldc_w -452264586
    //   1841: ixor
    //   1842: ldc2_w 1651854227
    //   1845: l2i
    //   1846: ldc_w -376683930
    //   1849: ixor
    //   1850: ixor
    //   1851: lookupswitch default -> 1876, -1638209024 -> 1834, -701612299 -> 5242
    //   1876: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
    //   1879: if_acmpne -> 1893
    //   1882: ldc2_w -1832678883
    //   1885: l2i
    //   1886: ldc_w -261806406
    //   1889: ixor
    //   1890: goto -> 1901
    //   1893: ldc2_w 2103660409
    //   1896: l2i
    //   1897: ldc_w 533062621
    //   1900: ixor
    //   1901: ldc2_w 1366338185
    //   1904: l2i
    //   1905: ldc_w -600875165
    //   1908: ixor
    //   1909: ixor
    //   1910: tableswitch default -> 1882, -268871347 -> 1932, -268871346 -> 2380
    //   1932: getstatic Perryc.c : I
    //   1935: iflt -> 1949
    //   1938: ldc2_w -753192307
    //   1941: l2i
    //   1942: ldc_w 1616477131
    //   1945: ixor
    //   1946: goto -> 1957
    //   1949: ldc2_w 275218702
    //   1952: l2i
    //   1953: ldc_w -463949878
    //   1956: ixor
    //   1957: ldc2_w 1124070420
    //   1960: l2i
    //   1961: ldc_w -946193621
    //   1964: ixor
    //   1965: ixor
    //   1966: lookupswitch default -> 1992, -952647990 -> 1949, 908559993 -> 5220
    //   1992: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1995: getstatic Perryc.1 : I
    //   1998: ifeq -> 2012
    //   2001: ldc2_w -1567286948
    //   2004: l2i
    //   2005: ldc_w 588880935
    //   2008: ixor
    //   2009: goto -> 2020
    //   2012: ldc2_w 1444566765
    //   2015: l2i
    //   2016: ldc_w -2043942268
    //   2019: ixor
    //   2020: ldc2_w -1965453096
    //   2023: l2i
    //   2024: ldc_w -1358399707
    //   2027: ixor
    //   2028: ixor
    //   2029: lookupswitch default -> 2056, -1537383802 -> 5212, -266555437 -> 2012
    //   2056: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   2059: getstatic Perryc.1 : I
    //   2062: ifeq -> 2076
    //   2065: ldc2_w -775426385
    //   2068: l2i
    //   2069: ldc_w -13709314
    //   2072: ixor
    //   2073: goto -> 2084
    //   2076: ldc2_w 67669429
    //   2079: l2i
    //   2080: ldc_w 1491353455
    //   2083: ixor
    //   2084: ldc2_w -22876568
    //   2087: l2i
    //   2088: ldc_w 704739905
    //   2091: ixor
    //   2092: ixor
    //   2093: lookupswitch default -> 5268, -2008078605 -> 2120, -95767176 -> 2076
    //   2120: aload_3
    //   2121: getstatic Perryc.c : I
    //   2124: iflt -> 2138
    //   2127: ldc2_w 8032947
    //   2130: l2i
    //   2131: ldc_w -1313107820
    //   2134: ixor
    //   2135: goto -> 2146
    //   2138: ldc2_w 1587751659
    //   2141: l2i
    //   2142: ldc_w -779663081
    //   2145: ixor
    //   2146: ldc2_w 2145795493
    //   2149: l2i
    //   2150: ldc_w -614533932
    //   2153: ixor
    //   2154: ixor
    //   2155: lookupswitch default -> 5312, 360303446 -> 2138, 731687565 -> 2180
    //   2180: goto -> 2184
    //   2183: athrow
    //   2184: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   2187: goto -> 2191
    //   2190: athrow
    //   2191: getstatic Perryc.c : I
    //   2194: iflt -> 2208
    //   2197: ldc2_w -1355456090
    //   2200: l2i
    //   2201: ldc_w 1555278739
    //   2204: ixor
    //   2205: goto -> 2216
    //   2208: ldc2_w -854402339
    //   2211: l2i
    //   2212: ldc_w -161526446
    //   2215: ixor
    //   2216: ldc2_w -444445787
    //   2219: l2i
    //   2220: ldc_w -1050016288
    //   2223: ixor
    //   2224: ixor
    //   2225: lookupswitch default -> 2252, -1094128681 -> 2208, -680622992 -> 5234
    //   2252: goto -> 2256
    //   2255: athrow
    //   2256: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   2261: goto -> 2265
    //   2264: athrow
    //   2265: getstatic Perryc.c : I
    //   2268: iflt -> 2282
    //   2271: ldc2_w 646095643
    //   2274: l2i
    //   2275: ldc_w -1122523140
    //   2278: ixor
    //   2279: goto -> 2290
    //   2282: ldc2_w 1052109999
    //   2285: l2i
    //   2286: ldc_w -2134258513
    //   2289: ixor
    //   2290: ldc2_w 744170892
    //   2293: l2i
    //   2294: ldc_w -90583113
    //   2297: ixor
    //   2298: ixor
    //   2299: lookupswitch default -> 2324, -1573556782 -> 2282, 1297608412 -> 5286
    //   2324: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
    //   2327: if_acmpeq -> 2341
    //   2330: ldc2_w -911871343
    //   2333: l2i
    //   2334: ldc_w -1458160169
    //   2337: ixor
    //   2338: goto -> 2349
    //   2341: ldc2_w -1076186499
    //   2344: l2i
    //   2345: ldc_w -546734796
    //   2348: ixor
    //   2349: ldc2_w -1614875582
    //   2352: l2i
    //   2353: ldc_w 1670731827
    //   2356: ixor
    //   2357: ixor
    //   2358: tableswitch default -> 2330, -1667734729 -> 2380, -1667734728 -> 2389
    //   2380: ldc2_w 217281515
    //   2383: l2i
    //   2384: ldc_w 217281515
    //   2387: ixor
    //   2388: ireturn
    //   2389: getstatic Perryc.c : I
    //   2392: iflt -> 2406
    //   2395: ldc2_w -1496469542
    //   2398: l2i
    //   2399: ldc_w 1122651737
    //   2402: ixor
    //   2403: goto -> 2414
    //   2406: ldc2_w -457352276
    //   2409: l2i
    //   2410: ldc_w 783851637
    //   2413: ixor
    //   2414: ldc2_w 917312427
    //   2417: l2i
    //   2418: ldc_w 996000880
    //   2421: ixor
    //   2422: ixor
    //   2423: lookupswitch default -> 2448, -676497539 -> 2406, -371771816 -> 5298
    //   2448: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2451: getstatic Perryc.0 : I
    //   2454: ifle -> 2468
    //   2457: ldc2_w -32731001
    //   2460: l2i
    //   2461: ldc_w 570981275
    //   2464: ixor
    //   2465: goto -> 2476
    //   2468: ldc2_w 902736565
    //   2471: l2i
    //   2472: ldc_w 698144208
    //   2475: ixor
    //   2476: ldc2_w -1729178865
    //   2479: l2i
    //   2480: ldc_w -468177063
    //   2483: ixor
    //   2484: ixor
    //   2485: lookupswitch default -> 5246, -1594747062 -> 2468, 1621394227 -> 2512
    //   2512: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   2515: ldc_w net/minecraft/entity/Entity
    //   2518: new net/minecraft/util/math/AxisAlignedBB
    //   2521: dup
    //   2522: getstatic Perryc.1 : I
    //   2525: ifeq -> 2539
    //   2528: ldc2_w 208428672
    //   2531: l2i
    //   2532: ldc_w -1152100367
    //   2535: ixor
    //   2536: goto -> 2547
    //   2539: ldc2_w 824242004
    //   2542: l2i
    //   2543: ldc_w 516131390
    //   2546: ixor
    //   2547: ldc2_w 1850270340
    //   2550: l2i
    //   2551: ldc_w -507237001
    //   2554: ixor
    //   2555: ixor
    //   2556: lookupswitch default -> 2584, 951371394 -> 5262, 1212517385 -> 2539
    //   2584: aload_3
    //   2585: getstatic Perryc.0 : I
    //   2588: ifle -> 2602
    //   2591: ldc2_w 342768291
    //   2594: l2i
    //   2595: ldc_w 1477965531
    //   2598: ixor
    //   2599: goto -> 2610
    //   2602: ldc2_w 1334475603
    //   2605: l2i
    //   2606: ldc_w -224546964
    //   2609: ixor
    //   2610: ldc2_w 1668939851
    //   2613: l2i
    //   2614: ldc_w -1166092889
    //   2617: ixor
    //   2618: ixor
    //   2619: lookupswitch default -> 2644, -1786963564 -> 5308, 796914468 -> 2602
    //   2644: goto -> 2648
    //   2647: athrow
    //   2648: invokespecial <init> : (Lnet/minecraft/util/math/BlockPos;)V
    //   2651: goto -> 2655
    //   2654: athrow
    //   2655: getstatic Perryc.1 : I
    //   2658: ifeq -> 2672
    //   2661: ldc2_w -516562115
    //   2664: l2i
    //   2665: ldc_w -342685169
    //   2668: ixor
    //   2669: goto -> 2680
    //   2672: ldc2_w -746367
    //   2675: l2i
    //   2676: ldc_w -385971321
    //   2679: ixor
    //   2680: ldc2_w 1689616227
    //   2683: l2i
    //   2684: ldc_w 600614104
    //   2687: ixor
    //   2688: ixor
    //   2689: lookupswitch default -> 2716, 1306473097 -> 5258, 1762266804 -> 2672
    //   2716: goto -> 2720
    //   2719: athrow
    //   2720: invokevirtual func_72872_a : (Ljava/lang/Class;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
    //   2723: goto -> 2727
    //   2726: athrow
    //   2727: getstatic Perryc.0 : I
    //   2730: ifle -> 2744
    //   2733: ldc2_w 1679015701
    //   2736: l2i
    //   2737: ldc_w 57374540
    //   2740: ixor
    //   2741: goto -> 2752
    //   2744: ldc2_w -1937825635
    //   2747: l2i
    //   2748: ldc_w -1072421192
    //   2751: ixor
    //   2752: ldc2_w -1309195700
    //   2755: l2i
    //   2756: ldc_w 1485096234
    //   2759: ixor
    //   2760: ixor
    //   2761: lookupswitch default -> 2788, -1911861441 -> 5256, 1208465076 -> 2744
    //   2788: goto -> 2792
    //   2791: athrow
    //   2792: invokeinterface iterator : ()Ljava/util/Iterator;
    //   2797: goto -> 2801
    //   2800: athrow
    //   2801: getstatic Perryc.1 : I
    //   2804: ifeq -> 2818
    //   2807: ldc2_w -882674908
    //   2810: l2i
    //   2811: ldc_w 340270995
    //   2814: ixor
    //   2815: goto -> 2826
    //   2818: ldc2_w -1113594950
    //   2821: l2i
    //   2822: ldc_w -1264358557
    //   2825: ixor
    //   2826: ldc2_w -923453661
    //   2829: l2i
    //   2830: ldc_w -1339594656
    //   2833: ixor
    //   2834: ixor
    //   2835: lookupswitch default -> 2860, -1988251217 -> 2818, -1476840460 -> 5204
    //   2860: astore #5
    //   2862: getstatic Perryc.1 : I
    //   2865: ifeq -> 2879
    //   2868: ldc2_w 15328484
    //   2871: l2i
    //   2872: ldc_w -818837321
    //   2875: ixor
    //   2876: goto -> 2887
    //   2879: ldc2_w -822369700
    //   2882: l2i
    //   2883: ldc_w 118415765
    //   2886: ixor
    //   2887: ldc2_w 1205331947
    //   2890: l2i
    //   2891: ldc_w -103869467
    //   2894: ixor
    //   2895: ixor
    //   2896: lookupswitch default -> 5290, 1908447325 -> 2879, 2012067783 -> 2924
    //   2924: aload #5
    //   2926: getstatic Perryc.0 : I
    //   2929: ifle -> 2943
    //   2932: ldc2_w 909978400
    //   2935: l2i
    //   2936: ldc_w -62708365
    //   2939: ixor
    //   2940: goto -> 2951
    //   2943: ldc2_w -1224143957
    //   2946: l2i
    //   2947: ldc_w 336865212
    //   2950: ixor
    //   2951: ldc2_w -178203112
    //   2954: l2i
    //   2955: ldc_w 105814634
    //   2958: ixor
    //   2959: ixor
    //   2960: lookupswitch default -> 5216, 961561121 -> 2943, 1345544293 -> 2988
    //   2988: goto -> 2992
    //   2991: athrow
    //   2992: invokeinterface hasNext : ()Z
    //   2997: goto -> 3001
    //   3000: athrow
    //   3001: ifeq -> 3015
    //   3004: ldc2_w -1755601991
    //   3007: l2i
    //   3008: ldc_w 1246160453
    //   3011: ixor
    //   3012: goto -> 3023
    //   3015: ldc2_w -1131510836
    //   3018: l2i
    //   3019: ldc_w 1637074481
    //   3022: ixor
    //   3023: ldc2_w 426068269
    //   3026: l2i
    //   3027: ldc_w -1285255765
    //   3030: ixor
    //   3031: ixor
    //   3032: tableswitch default -> 3004, 1998356858 -> 3056, 1998356859 -> 3688
    //   3056: getstatic Perryc.0 : I
    //   3059: ifle -> 3073
    //   3062: ldc2_w 1408028196
    //   3065: l2i
    //   3066: ldc_w -1944018680
    //   3069: ixor
    //   3070: goto -> 3081
    //   3073: ldc2_w -2142918947
    //   3076: l2i
    //   3077: ldc_w 1235656589
    //   3080: ixor
    //   3081: ldc2_w -237697261
    //   3084: l2i
    //   3085: ldc_w -831488540
    //   3088: ixor
    //   3089: ixor
    //   3090: lookupswitch default -> 5226, -529984037 -> 3073, -163167321 -> 3116
    //   3116: aload #5
    //   3118: getstatic Perryc.0 : I
    //   3121: ifle -> 3135
    //   3124: ldc2_w 1740608404
    //   3127: l2i
    //   3128: ldc_w -183157067
    //   3131: ixor
    //   3132: goto -> 3143
    //   3135: ldc2_w 1079635928
    //   3138: l2i
    //   3139: ldc_w -592113327
    //   3142: ixor
    //   3143: ldc2_w -1220684507
    //   3146: l2i
    //   3147: ldc_w -223582221
    //   3150: ixor
    //   3151: ixor
    //   3152: lookupswitch default -> 3180, -683991049 -> 5224, 1434523148 -> 3135
    //   3180: goto -> 3184
    //   3183: athrow
    //   3184: invokeinterface next : ()Ljava/lang/Object;
    //   3189: goto -> 3193
    //   3192: athrow
    //   3193: checkcast net/minecraft/entity/Entity
    //   3196: getstatic Perryc.1 : I
    //   3199: ifeq -> 3213
    //   3202: ldc2_w 308227056
    //   3205: l2i
    //   3206: ldc_w -873303098
    //   3209: ixor
    //   3210: goto -> 3221
    //   3213: ldc2_w 2050934874
    //   3216: l2i
    //   3217: ldc_w -1595402441
    //   3220: ixor
    //   3221: ldc2_w 883924599
    //   3224: l2i
    //   3225: ldc_w 1091172919
    //   3228: ixor
    //   3229: ixor
    //   3230: lookupswitch default -> 3256, -1408549770 -> 5310, -739116918 -> 3213
    //   3256: astore #6
    //   3258: getstatic Perryc.1 : I
    //   3261: ifeq -> 3275
    //   3264: ldc2_w 1028696492
    //   3267: l2i
    //   3268: ldc_w -2035588205
    //   3271: ixor
    //   3272: goto -> 3283
    //   3275: ldc2_w 1323092440
    //   3278: l2i
    //   3279: ldc_w -1159920063
    //   3282: ixor
    //   3283: ldc2_w 882704971
    //   3286: l2i
    //   3287: ldc_w 1955518803
    //   3290: ixor
    //   3291: ixor
    //   3292: lookupswitch default -> 3320, -68677337 -> 5316, 1528723632 -> 3275
    //   3320: aload #6
    //   3322: getstatic Perryc.0 : I
    //   3325: ifle -> 3339
    //   3328: ldc2_w -1116144182
    //   3331: l2i
    //   3332: ldc_w 1775001667
    //   3335: ixor
    //   3336: goto -> 3347
    //   3339: ldc2_w 1490394183
    //   3342: l2i
    //   3343: ldc_w 1344894768
    //   3346: ixor
    //   3347: ldc2_w 1636223063
    //   3350: l2i
    //   3351: ldc_w 1773203071
    //   3354: ixor
    //   3355: ixor
    //   3356: lookupswitch default -> 5196, -595412063 -> 3339, 13290847 -> 3384
    //   3384: getfield field_70128_L : Z
    //   3387: ifne -> 3401
    //   3390: ldc2_w -598799478
    //   3393: l2i
    //   3394: ldc_w 1686056972
    //   3397: ixor
    //   3398: goto -> 3409
    //   3401: ldc2_w -1721653624
    //   3404: l2i
    //   3405: ldc_w 558996751
    //   3408: ixor
    //   3409: ldc2_w 1919469553
    //   3412: l2i
    //   3413: ldc_w -161544493
    //   3416: ixor
    //   3417: ixor
    //   3418: tableswitch default -> 3390, 1007155876 -> 3440, 1007155877 -> 2862
    //   3440: getstatic Perryc.0 : I
    //   3443: ifle -> 3457
    //   3446: ldc2_w -424791436
    //   3449: l2i
    //   3450: ldc_w -1149646741
    //   3453: ixor
    //   3454: goto -> 3465
    //   3457: ldc2_w 1329824767
    //   3460: l2i
    //   3461: ldc_w -95491959
    //   3464: ixor
    //   3465: ldc2_w -1732158928
    //   3468: l2i
    //   3469: ldc_w -2097118548
    //   3472: ixor
    //   3473: ixor
    //   3474: lookupswitch default -> 3500, -1921918355 -> 3457, 1175855747 -> 5314
    //   3500: iload_1
    //   3501: ifeq -> 3515
    //   3504: ldc2_w -1511137891
    //   3507: l2i
    //   3508: ldc_w -61188399
    //   3511: ixor
    //   3512: goto -> 3523
    //   3515: ldc2_w -2088555286
    //   3518: l2i
    //   3519: ldc_w -634083417
    //   3522: ixor
    //   3523: ldc2_w -1748830111
    //   3526: l2i
    //   3527: ldc_w -252696947
    //   3530: ixor
    //   3531: ixor
    //   3532: tableswitch default -> 3504, 1048925600 -> 3556, 1048925601 -> 3679
    //   3556: getstatic Perryc.0 : I
    //   3559: ifle -> 3573
    //   3562: ldc2_w -385131588
    //   3565: l2i
    //   3566: ldc_w 81566056
    //   3569: ixor
    //   3570: goto -> 3581
    //   3573: ldc2_w 1527758851
    //   3576: l2i
    //   3577: ldc_w -2120232672
    //   3580: ixor
    //   3581: ldc2_w 1543884953
    //   3584: l2i
    //   3585: ldc_w 38992484
    //   3588: ixor
    //   3589: ixor
    //   3590: lookupswitch default -> 3616, -1572872532 -> 3573, -1283397591 -> 5198
    //   3616: aload #6
    //   3618: instanceof net/minecraft/entity/item/EntityEnderCrystal
    //   3621: ifeq -> 3635
    //   3624: ldc2_w -1914037227
    //   3627: l2i
    //   3628: ldc_w -627207613
    //   3631: ixor
    //   3632: goto -> 3643
    //   3635: ldc2_w -348195422
    //   3638: l2i
    //   3639: ldc_w -1136034827
    //   3642: ixor
    //   3643: ldc2_w 1742346248
    //   3646: l2i
    //   3647: ldc_w 1106921676
    //   3650: ixor
    //   3651: ixor
    //   3652: tableswitch default -> 3624, 1901584018 -> 3676, 1901584019 -> 3679
    //   3676: goto -> 2862
    //   3679: ldc2_w -1923374155
    //   3682: l2i
    //   3683: ldc_w -1923374155
    //   3686: ixor
    //   3687: ireturn
    //   3688: getstatic Perryc.1 : I
    //   3691: ifeq -> 3705
    //   3694: ldc2_w 1051692984
    //   3697: l2i
    //   3698: ldc_w -1260506348
    //   3701: ixor
    //   3702: goto -> 3713
    //   3705: ldc2_w 1448803632
    //   3708: l2i
    //   3709: ldc_w -95150785
    //   3712: ixor
    //   3713: ldc2_w 1868860719
    //   3716: l2i
    //   3717: ldc_w -1524976973
    //   3720: ixor
    //   3721: ixor
    //   3722: lookupswitch default -> 3748, 1074758448 -> 5294, 1299805830 -> 3705
    //   3748: iload_2
    //   3749: ifne -> 3763
    //   3752: ldc2_w 1210584022
    //   3755: l2i
    //   3756: ldc_w -642480723
    //   3759: ixor
    //   3760: goto -> 3771
    //   3763: ldc2_w 1986846589
    //   3766: l2i
    //   3767: ldc_w -403681017
    //   3770: ixor
    //   3771: ldc2_w -1929193446
    //   3774: l2i
    //   3775: ldc_w -1513342503
    //   3778: ixor
    //   3779: ixor
    //   3780: tableswitch default -> 3752, -1185779784 -> 3804, -1185779783 -> 5108
    //   3804: getstatic Perryc.1 : I
    //   3807: ifeq -> 3821
    //   3810: ldc2_w -121694586
    //   3813: l2i
    //   3814: ldc_w 1267850537
    //   3817: ixor
    //   3818: goto -> 3829
    //   3821: ldc2_w 594220909
    //   3824: l2i
    //   3825: ldc_w -309713375
    //   3828: ixor
    //   3829: ldc2_w 1183273397
    //   3832: l2i
    //   3833: ldc_w 128100446
    //   3836: ixor
    //   3837: ixor
    //   3838: lookupswitch default -> 5304, -1882928985 -> 3864, -234147260 -> 3821
    //   3864: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   3867: getstatic Perryc.1 : I
    //   3870: ifeq -> 3884
    //   3873: ldc2_w 1372842498
    //   3876: l2i
    //   3877: ldc_w 704221930
    //   3880: ixor
    //   3881: goto -> 3892
    //   3884: ldc2_w 193300907
    //   3887: l2i
    //   3888: ldc_w 1340627523
    //   3891: ixor
    //   3892: ldc2_w -474388779
    //   3895: l2i
    //   3896: ldc_w -951167246
    //   3899: ixor
    //   3900: ixor
    //   3901: lookupswitch default -> 3928, -154372456 -> 3884, 1558005967 -> 5270
    //   3928: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   3931: ldc_w net/minecraft/entity/Entity
    //   3934: new net/minecraft/util/math/AxisAlignedBB
    //   3937: dup
    //   3938: getstatic Perryc.c : I
    //   3941: iflt -> 3955
    //   3944: ldc2_w 1691211255
    //   3947: l2i
    //   3948: ldc_w 3387423
    //   3951: ixor
    //   3952: goto -> 3963
    //   3955: ldc2_w -788371319
    //   3958: l2i
    //   3959: ldc_w -371151194
    //   3962: ixor
    //   3963: ldc2_w 480654617
    //   3966: l2i
    //   3967: ldc_w 163825154
    //   3970: ixor
    //   3971: ixor
    //   3972: lookupswitch default -> 5252, 763835700 -> 4000, 1906022131 -> 3955
    //   4000: aload #4
    //   4002: getstatic Perryc.1 : I
    //   4005: ifeq -> 4019
    //   4008: ldc2_w -809256752
    //   4011: l2i
    //   4012: ldc_w -1407061916
    //   4015: ixor
    //   4016: goto -> 4027
    //   4019: ldc2_w 491958776
    //   4022: l2i
    //   4023: ldc_w 962911927
    //   4026: ixor
    //   4027: ldc2_w 204326015
    //   4030: l2i
    //   4031: ldc_w -644721812
    //   4034: ixor
    //   4035: ixor
    //   4036: lookupswitch default -> 4064, -1235361881 -> 5214, 1006888897 -> 4019
    //   4064: goto -> 4068
    //   4067: athrow
    //   4068: invokespecial <init> : (Lnet/minecraft/util/math/BlockPos;)V
    //   4071: goto -> 4075
    //   4074: athrow
    //   4075: getstatic Perryc.c : I
    //   4078: iflt -> 4092
    //   4081: ldc2_w 751602389
    //   4084: l2i
    //   4085: ldc_w -955592514
    //   4088: ixor
    //   4089: goto -> 4100
    //   4092: ldc2_w 1434616926
    //   4095: l2i
    //   4096: ldc_w -1212631056
    //   4099: ixor
    //   4100: ldc2_w -572069026
    //   4103: l2i
    //   4104: ldc_w 254830006
    //   4107: ixor
    //   4108: ixor
    //   4109: lookupswitch default -> 5192, 820821318 -> 4136, 957404291 -> 4092
    //   4136: goto -> 4140
    //   4139: athrow
    //   4140: invokevirtual func_72872_a : (Ljava/lang/Class;Lnet/minecraft/util/math/AxisAlignedBB;)Ljava/util/List;
    //   4143: goto -> 4147
    //   4146: athrow
    //   4147: getstatic Perryc.0 : I
    //   4150: ifle -> 4164
    //   4153: ldc2_w 1118512735
    //   4156: l2i
    //   4157: ldc_w -286161652
    //   4160: ixor
    //   4161: goto -> 4172
    //   4164: ldc2_w -1972318656
    //   4167: l2i
    //   4168: ldc_w -836637895
    //   4171: ixor
    //   4172: ldc2_w -1516482387
    //   4175: l2i
    //   4176: ldc_w -1229830063
    //   4179: ixor
    //   4180: ixor
    //   4181: lookupswitch default -> 4208, -1082868817 -> 5244, -85984991 -> 4164
    //   4208: goto -> 4212
    //   4211: athrow
    //   4212: invokeinterface iterator : ()Ljava/util/Iterator;
    //   4217: goto -> 4221
    //   4220: athrow
    //   4221: getstatic Perryc.0 : I
    //   4224: ifle -> 4238
    //   4227: ldc2_w 894614611
    //   4230: l2i
    //   4231: ldc_w 1613649159
    //   4234: ixor
    //   4235: goto -> 4246
    //   4238: ldc2_w 921487295
    //   4241: l2i
    //   4242: ldc_w 1523812017
    //   4245: ixor
    //   4246: ldc2_w 1590505712
    //   4249: l2i
    //   4250: ldc_w -190695971
    //   4253: ixor
    //   4254: ixor
    //   4255: lookupswitch default -> 4280, -15471495 -> 5288, 91976538 -> 4238
    //   4280: astore #5
    //   4282: getstatic Perryc.c : I
    //   4285: iflt -> 4299
    //   4288: ldc2_w 1424474133
    //   4291: l2i
    //   4292: ldc_w 1166215864
    //   4295: ixor
    //   4296: goto -> 4307
    //   4299: ldc2_w -271688738
    //   4302: l2i
    //   4303: ldc_w -792197953
    //   4306: ixor
    //   4307: ldc2_w -1576713739
    //   4310: l2i
    //   4311: ldc_w 652882495
    //   4314: ixor
    //   4315: ixor
    //   4316: lookupswitch default -> 4344, -1786005145 -> 5264, 1027872507 -> 4299
    //   4344: aload #5
    //   4346: getstatic Perryc.1 : I
    //   4349: ifeq -> 4363
    //   4352: ldc2_w 1089437683
    //   4355: l2i
    //   4356: ldc_w 1839669033
    //   4359: ixor
    //   4360: goto -> 4371
    //   4363: ldc2_w -24023999
    //   4366: l2i
    //   4367: ldc_w -604089395
    //   4370: ixor
    //   4371: ldc2_w 1787435099
    //   4374: l2i
    //   4375: ldc_w 1712099892
    //   4378: ixor
    //   4379: ixor
    //   4380: lookupswitch default -> 4408, -855500786 -> 4363, 567208629 -> 5236
    //   4408: goto -> 4412
    //   4411: athrow
    //   4412: invokeinterface hasNext : ()Z
    //   4417: goto -> 4421
    //   4420: athrow
    //   4421: ifeq -> 4435
    //   4424: ldc2_w -1529265561
    //   4427: l2i
    //   4428: ldc_w -698453818
    //   4431: ixor
    //   4432: goto -> 4443
    //   4435: ldc2_w -97176231
    //   4438: l2i
    //   4439: ldc_w -2001598489
    //   4442: ixor
    //   4443: ldc2_w 2113432448
    //   4446: l2i
    //   4447: ldc_w 2132179886
    //   4450: ixor
    //   4451: ixor
    //   4452: tableswitch default -> 4424, 1885938319 -> 4476, 1885938320 -> 5108
    //   4476: getstatic Perryc.0 : I
    //   4479: ifle -> 4493
    //   4482: ldc2_w -2095328211
    //   4485: l2i
    //   4486: ldc_w 1833272742
    //   4489: ixor
    //   4490: goto -> 4501
    //   4493: ldc2_w -2698200
    //   4496: l2i
    //   4497: ldc_w 1204063860
    //   4500: ixor
    //   4501: ldc2_w -1885292586
    //   4504: l2i
    //   4505: ldc_w -1839105616
    //   4508: ixor
    //   4509: ixor
    //   4510: lookupswitch default -> 4536, -207642643 -> 5276, -37752565 -> 4493
    //   4536: aload #5
    //   4538: getstatic Perryc.1 : I
    //   4541: ifeq -> 4555
    //   4544: ldc2_w -2141781425
    //   4547: l2i
    //   4548: ldc_w -848754532
    //   4551: ixor
    //   4552: goto -> 4563
    //   4555: ldc2_w -211878218
    //   4558: l2i
    //   4559: ldc_w 717242534
    //   4562: ixor
    //   4563: ldc2_w -468283599
    //   4566: l2i
    //   4567: ldc_w 895979079
    //   4570: ixor
    //   4571: ixor
    //   4572: lookupswitch default -> 5292, -1672541275 -> 4555, 149929830 -> 4600
    //   4600: goto -> 4604
    //   4603: athrow
    //   4604: invokeinterface next : ()Ljava/lang/Object;
    //   4609: goto -> 4613
    //   4612: athrow
    //   4613: checkcast net/minecraft/entity/Entity
    //   4616: getstatic Perryc.0 : I
    //   4619: ifle -> 4633
    //   4622: ldc2_w 403496969
    //   4625: l2i
    //   4626: ldc_w -329231361
    //   4629: ixor
    //   4630: goto -> 4641
    //   4633: ldc2_w 1548156661
    //   4636: l2i
    //   4637: ldc_w 279897353
    //   4640: ixor
    //   4641: ldc2_w -1075817808
    //   4644: l2i
    //   4645: ldc_w -229950250
    //   4648: ixor
    //   4649: ixor
    //   4650: lookupswitch default -> 5260, -1178083952 -> 4633, 21198234 -> 4676
    //   4676: astore #6
    //   4678: getstatic Perryc.0 : I
    //   4681: ifle -> 4695
    //   4684: ldc2_w -812555228
    //   4687: l2i
    //   4688: ldc_w -1639254933
    //   4691: ixor
    //   4692: goto -> 4703
    //   4695: ldc2_w 635992867
    //   4698: l2i
    //   4699: ldc_w -1017111072
    //   4702: ixor
    //   4703: ldc2_w -943880985
    //   4706: l2i
    //   4707: ldc_w 1822963510
    //   4710: ixor
    //   4711: ixor
    //   4712: lookupswitch default -> 5302, -87153762 -> 4695, 1302189330 -> 4740
    //   4740: aload #6
    //   4742: getstatic Perryc.c : I
    //   4745: iflt -> 4759
    //   4748: ldc2_w 931562005
    //   4751: l2i
    //   4752: ldc_w 2072403117
    //   4755: ixor
    //   4756: goto -> 4767
    //   4759: ldc2_w -277772831
    //   4762: l2i
    //   4763: ldc_w 2128558525
    //   4766: ixor
    //   4767: ldc2_w 481555268
    //   4770: l2i
    //   4771: ldc_w -2092401089
    //   4774: ixor
    //   4775: ixor
    //   4776: lookupswitch default -> 4804, -738503741 -> 5218, 1483454046 -> 4759
    //   4804: getfield field_70128_L : Z
    //   4807: ifne -> 4821
    //   4810: ldc2_w 980893506
    //   4813: l2i
    //   4814: ldc_w -1901338099
    //   4817: ixor
    //   4818: goto -> 4829
    //   4821: ldc2_w -735962089
    //   4824: l2i
    //   4825: ldc_w 1627308377
    //   4828: ixor
    //   4829: ldc2_w 1787498274
    //   4832: l2i
    //   4833: ldc_w 987671237
    //   4836: ixor
    //   4837: ixor
    //   4838: tableswitch default -> 4810, -460752728 -> 4860, -460752727 -> 4282
    //   4860: getstatic Perryc.1 : I
    //   4863: ifeq -> 4877
    //   4866: ldc2_w 631406282
    //   4869: l2i
    //   4870: ldc_w 1685162837
    //   4873: ixor
    //   4874: goto -> 4885
    //   4877: ldc2_w 1767610123
    //   4880: l2i
    //   4881: ldc_w 25504308
    //   4884: ixor
    //   4885: ldc2_w -2035362508
    //   4888: l2i
    //   4889: ldc_w 2129400563
    //   4892: ixor
    //   4893: ixor
    //   4894: lookupswitch default -> 4920, -1181666728 -> 5318, -1115155254 -> 4877
    //   4920: iload_1
    //   4921: ifeq -> 4935
    //   4924: ldc2_w -1686693719
    //   4927: l2i
    //   4928: ldc_w 1669214096
    //   4931: ixor
    //   4932: goto -> 4943
    //   4935: ldc2_w -467010767
    //   4938: l2i
    //   4939: ldc_w 471911435
    //   4942: ixor
    //   4943: ldc2_w 2129899724
    //   4946: l2i
    //   4947: ldc_w 1774872360
    //   4950: ixor
    //   4951: ixor
    //   4952: tableswitch default -> 4924, -282009379 -> 4976, -282009378 -> 5099
    //   4976: getstatic Perryc.c : I
    //   4979: iflt -> 4993
    //   4982: ldc2_w -1840065211
    //   4985: l2i
    //   4986: ldc_w -699241475
    //   4989: ixor
    //   4990: goto -> 5001
    //   4993: ldc2_w -1381716430
    //   4996: l2i
    //   4997: ldc_w -858752345
    //   5000: ixor
    //   5001: ldc2_w 579429629
    //   5004: l2i
    //   5005: ldc_w 1842013270
    //   5008: ixor
    //   5009: ixor
    //   5010: lookupswitch default -> 5210, 188956179 -> 4993, 775377982 -> 5036
    //   5036: aload #6
    //   5038: instanceof net/minecraft/entity/item/EntityEnderCrystal
    //   5041: ifeq -> 5055
    //   5044: ldc2_w 1397618134
    //   5047: l2i
    //   5048: ldc_w -546687939
    //   5051: ixor
    //   5052: goto -> 5063
    //   5055: ldc2_w -613195099
    //   5058: l2i
    //   5059: ldc_w 1465164609
    //   5062: ixor
    //   5063: ldc2_w -970717219
    //   5066: l2i
    //   5067: ldc_w 923196929
    //   5070: ixor
    //   5071: ixor
    //   5072: tableswitch default -> 5044, 2097485879 -> 5096, 2097485880 -> 5099
    //   5096: goto -> 4282
    //   5099: ldc2_w 209353991
    //   5102: l2i
    //   5103: ldc_w 209353991
    //   5106: ixor
    //   5107: ireturn
    //   5108: goto -> 5183
    //   5111: getstatic Perryc.0 : I
    //   5114: ifle -> 5128
    //   5117: ldc2_w -1150875181
    //   5120: l2i
    //   5121: ldc_w 370567215
    //   5124: ixor
    //   5125: goto -> 5136
    //   5128: ldc2_w 186437196
    //   5131: l2i
    //   5132: ldc_w -1898034686
    //   5135: ixor
    //   5136: ldc2_w 280110230
    //   5139: l2i
    //   5140: ldc_w -965893107
    //   5143: ixor
    //   5144: ixor
    //   5145: lookupswitch default -> 5172, -957086540 -> 5128, 2075058535 -> 5248
    //   5172: astore #5
    //   5174: ldc2_w 533021494
    //   5177: l2i
    //   5178: ldc_w 533021494
    //   5181: ixor
    //   5182: ireturn
    //   5183: ldc2_w -1236288797
    //   5186: l2i
    //   5187: ldc_w -1236288798
    //   5190: ixor
    //   5191: ireturn
    //   5192: aconst_null
    //   5193: athrow
    //   5194: aconst_null
    //   5195: athrow
    //   5196: aconst_null
    //   5197: athrow
    //   5198: aconst_null
    //   5199: athrow
    //   5200: aconst_null
    //   5201: athrow
    //   5202: aconst_null
    //   5203: athrow
    //   5204: aconst_null
    //   5205: athrow
    //   5206: aconst_null
    //   5207: athrow
    //   5208: aconst_null
    //   5209: athrow
    //   5210: aconst_null
    //   5211: athrow
    //   5212: aconst_null
    //   5213: athrow
    //   5214: aconst_null
    //   5215: athrow
    //   5216: aconst_null
    //   5217: athrow
    //   5218: aconst_null
    //   5219: athrow
    //   5220: aconst_null
    //   5221: athrow
    //   5222: aconst_null
    //   5223: athrow
    //   5224: aconst_null
    //   5225: athrow
    //   5226: aconst_null
    //   5227: athrow
    //   5228: aconst_null
    //   5229: athrow
    //   5230: aconst_null
    //   5231: athrow
    //   5232: aconst_null
    //   5233: athrow
    //   5234: aconst_null
    //   5235: athrow
    //   5236: aconst_null
    //   5237: athrow
    //   5238: aconst_null
    //   5239: athrow
    //   5240: aconst_null
    //   5241: athrow
    //   5242: aconst_null
    //   5243: athrow
    //   5244: aconst_null
    //   5245: athrow
    //   5246: aconst_null
    //   5247: athrow
    //   5248: aconst_null
    //   5249: athrow
    //   5250: aconst_null
    //   5251: athrow
    //   5252: aconst_null
    //   5253: athrow
    //   5254: aconst_null
    //   5255: athrow
    //   5256: aconst_null
    //   5257: athrow
    //   5258: aconst_null
    //   5259: athrow
    //   5260: aconst_null
    //   5261: athrow
    //   5262: aconst_null
    //   5263: athrow
    //   5264: aconst_null
    //   5265: athrow
    //   5266: aconst_null
    //   5267: athrow
    //   5268: aconst_null
    //   5269: athrow
    //   5270: aconst_null
    //   5271: athrow
    //   5272: aconst_null
    //   5273: athrow
    //   5274: aconst_null
    //   5275: athrow
    //   5276: aconst_null
    //   5277: athrow
    //   5278: aconst_null
    //   5279: athrow
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
    //   5322: pop
    //   5323: goto -> 24
    //   5326: pop
    //   5327: aconst_null
    //   5328: goto -> 5322
    //   5331: dup
    //   5332: ifnull -> 5322
    //   5335: checkcast java/lang/Throwable
    //   5338: athrow
    //   5339: dup
    //   5340: ifnull -> 5326
    //   5343: checkcast java/lang/Throwable
    //   5346: athrow
    //   5347: aconst_null
    //   5348: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   3258	430	6	entity	Lnet/minecraft/entity/Entity;
    //   4678	430	6	entity	Lnet/minecraft/entity/Entity;
    //   5174	9	5	ignored	Ljava/lang/Exception;
    //   24	5168	0	blockPos	Lnet/minecraft/util/math/BlockPos;
    //   24	5168	1	specialEntityCheck	Z
    //   24	5168	2	oneDot15	Z
    //   241	4951	3	boost	Lnet/minecraft/util/math/BlockPos;
    //   458	4734	4	boost2	Lnet/minecraft/util/math/BlockPos;
    // Exception table:
    //   from	to	target	type
    //   8	20	5331	java/util/NoSuchElementException
    //   171	178	178	finally
    //   171	178	3	java/lang/IllegalArgumentException
    //   171	178	178	java/lang/NegativeArraySizeException
    //   171	178	178	finally
    //   171	178	171	finally
    //   388	394	394	finally
    //   388	394	394	finally
    //   388	394	394	finally
    //   388	394	3	java/lang/ClassCastException
    //   388	394	394	finally
    //   458	1364	5111	java/lang/Exception
    //   711	718	718	finally
    //   711	718	3	java/lang/IndexOutOfBoundsException
    //   711	718	711	finally
    //   711	718	718	finally
    //   712	718	3	java/lang/NegativeArraySizeException
    //   783	792	792	finally
    //   783	792	3	java/lang/IllegalArgumentException
    //   784	792	792	finally
    //   784	792	783	finally
    //   784	792	3	finally
    //   1159	1166	1166	finally
    //   1159	1166	1166	finally
    //   1159	1166	1166	java/lang/RuntimeException
    //   1160	1166	1159	finally
    //   1160	1166	1159	finally
    //   1231	1240	1240	finally
    //   1231	1240	1231	java/lang/EnumConstantNotPresentException
    //   1231	1240	1231	finally
    //   1232	1240	1231	finally
    //   1232	1240	3	java/util/NoSuchElementException
    //   1365	1735	5111	java/lang/Exception
    //   1736	1742	1742	finally
    //   1736	1742	1742	finally
    //   1736	1742	1742	finally
    //   1736	1742	1742	finally
    //   1736	1742	3	java/lang/NumberFormatException
    //   1736	2388	5111	java/lang/Exception
    //   1807	1816	1816	finally
    //   1807	1816	1807	finally
    //   1807	1816	1807	finally
    //   1807	1816	3	java/lang/AssertionError
    //   1808	1816	3	java/lang/NumberFormatException
    //   2183	2190	2190	finally
    //   2184	2190	2190	finally
    //   2184	2190	3	finally
    //   2184	2190	2183	java/util/ConcurrentModificationException
    //   2184	2190	3	finally
    //   2255	2264	2264	finally
    //   2255	2264	2255	finally
    //   2256	2264	2255	finally
    //   2256	2264	2264	java/lang/ArithmeticException
    //   2256	2264	3	java/lang/IllegalStateException
    //   2389	2791	5111	java/lang/Exception
    //   2647	2654	2654	finally
    //   2647	2654	3	finally
    //   2648	2654	2654	java/lang/ClassCastException
    //   2648	2654	2647	java/util/ConcurrentModificationException
    //   2648	2654	2647	finally
    //   2719	2726	2726	finally
    //   2719	2726	3	finally
    //   2720	2726	2726	java/lang/ClassCastException
    //   2720	2726	2719	java/lang/UnsupportedOperationException
    //   2720	2726	3	finally
    //   2792	2800	2800	finally
    //   2792	2800	3	finally
    //   2792	2800	2800	finally
    //   2792	2800	3	finally
    //   2792	2800	3	finally
    //   2792	3687	5111	java/lang/Exception
    //   2991	3000	3000	finally
    //   2991	3000	2991	java/lang/NumberFormatException
    //   2991	3000	2991	finally
    //   2991	3000	3	finally
    //   2992	3000	2991	finally
    //   3183	3192	3192	finally
    //   3183	3192	3	java/lang/NullPointerException
    //   3183	3192	3183	java/util/NoSuchElementException
    //   3183	3192	3	java/lang/UnsupportedOperationException
    //   3184	3192	3192	java/lang/UnsupportedOperationException
    //   3688	5107	5111	java/lang/Exception
    //   4067	4074	4074	finally
    //   4067	4074	4074	java/lang/RuntimeException
    //   4068	4074	4074	finally
    //   4068	4074	4067	java/lang/ArithmeticException
    //   4068	4074	4067	finally
    //   4139	4146	4146	finally
    //   4139	4146	4139	java/lang/IllegalArgumentException
    //   4140	4146	3	finally
    //   4140	4146	3	java/lang/ClassCastException
    //   4140	4146	4146	finally
    //   4211	4220	4220	finally
    //   4212	4220	3	finally
    //   4212	4220	4211	java/lang/StringIndexOutOfBoundsException
    //   4212	4220	3	finally
    //   4212	4220	3	finally
    //   4411	4420	4420	finally
    //   4411	4420	4411	java/lang/ClassCastException
    //   4412	4420	4411	java/lang/IllegalStateException
    //   4412	4420	3	finally
    //   4412	4420	4411	finally
    //   4603	4612	4612	finally
    //   4603	4612	4612	finally
    //   4603	4612	4612	java/lang/RuntimeException
    //   4604	4612	4612	finally
    //   4604	4612	4603	java/lang/NegativeArraySizeException
    //   5331	5339	5331	finally
    //   5347	5349	3	java/lang/AssertionError
  }
  
  public static boolean isBlockBelowEntitySolid(Entity entity) {
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
  
  public static boolean lambda$possiblePlacePositions$1(boolean paramBoolean1, boolean paramBoolean2, BlockPos paramBlockPos) {
    return Perry1.0p(null, (int)1679221220L ^ 0x64D01827, paramBoolean1, paramBoolean2, paramBlockPos);
  }
  
  public static void debugPos(String message, BlockPos pos) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1423
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 1415
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1407
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/lang/StringBuilder
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w -1641945735
    //   37: l2i
    //   38: ldc_w -1859867816
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -1232972500
    //   48: l2i
    //   49: ldc_w 1465000898
    //   52: ixor
    //   53: ldc2_w 1496905646
    //   56: l2i
    //   57: ldc_w 754405339
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 1392, -1809854821 -> 88, 2060121684 -> 45
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.c : I
    //   102: iflt -> 116
    //   105: ldc2_w 593736203
    //   108: l2i
    //   109: ldc_w 1132783422
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w 342950547
    //   119: l2i
    //   120: ldc_w 778149121
    //   123: ixor
    //   124: ldc2_w 1304484301
    //   127: l2i
    //   128: ldc_w 2132405726
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 160, -1824623504 -> 116, 1379819814 -> 1394
    //   160: aload_0
    //   161: getstatic Perryc.c : I
    //   164: iflt -> 178
    //   167: ldc2_w 71039436
    //   170: l2i
    //   171: ldc_w 1510018390
    //   174: ixor
    //   175: goto -> 186
    //   178: ldc2_w 57595523
    //   181: l2i
    //   182: ldc_w -1029671925
    //   185: ixor
    //   186: ldc2_w 124489644
    //   189: l2i
    //   190: ldc_w 1202977087
    //   193: ixor
    //   194: ixor
    //   195: lookupswitch default -> 220, -944578669 -> 178, 518160905 -> 1364
    //   220: goto -> 224
    //   223: athrow
    //   224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: goto -> 231
    //   230: athrow
    //   231: getstatic Perryc.c : I
    //   234: iflt -> 248
    //   237: ldc2_w 1168317569
    //   240: l2i
    //   241: ldc_w -130459384
    //   244: ixor
    //   245: goto -> 256
    //   248: ldc2_w 293970454
    //   251: l2i
    //   252: ldc_w 973651553
    //   255: ixor
    //   256: ldc2_w -1876632872
    //   259: l2i
    //   260: ldc_w 1482279641
    //   263: ixor
    //   264: ixor
    //   265: lookupswitch default -> 292, -1006725814 -> 248, 1978094984 -> 1386
    //   292: aload_1
    //   293: getstatic Perryc.1 : I
    //   296: ifeq -> 310
    //   299: ldc2_w 1046886643
    //   302: l2i
    //   303: ldc_w 2098128884
    //   306: ixor
    //   307: goto -> 318
    //   310: ldc2_w -537385504
    //   313: l2i
    //   314: ldc_w -748802800
    //   317: ixor
    //   318: ldc2_w -1884652368
    //   321: l2i
    //   322: ldc_w -739229186
    //   325: ixor
    //   326: ixor
    //   327: lookupswitch default -> 352, 523428425 -> 1384, 1849709073 -> 310
    //   352: goto -> 356
    //   355: athrow
    //   356: invokevirtual func_177958_n : ()I
    //   359: goto -> 363
    //   362: athrow
    //   363: getstatic Perryc.0 : I
    //   366: ifle -> 380
    //   369: ldc2_w 1323435820
    //   372: l2i
    //   373: ldc_w -621400420
    //   376: ixor
    //   377: goto -> 388
    //   380: ldc2_w 1035395870
    //   383: l2i
    //   384: ldc_w -1181777910
    //   387: ixor
    //   388: ldc2_w -1108860087
    //   391: l2i
    //   392: ldc_w 618833348
    //   395: ixor
    //   396: ixor
    //   397: lookupswitch default -> 1396, 220114749 -> 380, 489940377 -> 424
    //   424: goto -> 428
    //   427: athrow
    //   428: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   431: goto -> 435
    //   434: athrow
    //   435: ldc_w 'ﰎ㍟ﰼ'
    //   438: getstatic Perryc.c : I
    //   441: iflt -> 455
    //   444: ldc2_w -2064762479
    //   447: l2i
    //   448: ldc_w -1699583347
    //   451: ixor
    //   452: goto -> 463
    //   455: ldc2_w 1665725793
    //   458: l2i
    //   459: ldc_w 783775107
    //   462: ixor
    //   463: ldc2_w -151399540
    //   466: l2i
    //   467: ldc_w -1422547498
    //   470: ixor
    //   471: ixor
    //   472: lookupswitch default -> 1372, 271840952 -> 500, 1133520198 -> 455
    //   500: goto -> 504
    //   503: athrow
    //   504: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   507: goto -> 511
    //   510: athrow
    //   511: getstatic Perryc.0 : I
    //   514: ifle -> 528
    //   517: ldc2_w -945609356
    //   520: l2i
    //   521: ldc_w 1512749819
    //   524: ixor
    //   525: goto -> 536
    //   528: ldc2_w 1506250754
    //   531: l2i
    //   532: ldc_w -1239165442
    //   535: ixor
    //   536: ldc2_w 400900131
    //   539: l2i
    //   540: ldc_w -1699132334
    //   543: ixor
    //   544: ixor
    //   545: lookupswitch default -> 572, -1006351680 -> 528, 282432510 -> 1374
    //   572: goto -> 576
    //   575: athrow
    //   576: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   579: goto -> 583
    //   582: athrow
    //   583: getstatic Perryc.0 : I
    //   586: ifle -> 600
    //   589: ldc2_w -1852679599
    //   592: l2i
    //   593: ldc_w 1933930182
    //   596: ixor
    //   597: goto -> 608
    //   600: ldc2_w 332981320
    //   603: l2i
    //   604: ldc_w 9522551
    //   607: ixor
    //   608: ldc2_w 43962192
    //   611: l2i
    //   612: ldc_w -1433274138
    //   615: ixor
    //   616: ixor
    //   617: lookupswitch default -> 1382, -1152999799 -> 644, 1255670561 -> 600
    //   644: aload_1
    //   645: getstatic Perryc.c : I
    //   648: iflt -> 662
    //   651: ldc2_w 166956386
    //   654: l2i
    //   655: ldc_w 385043704
    //   658: ixor
    //   659: goto -> 670
    //   662: ldc2_w 613888147
    //   665: l2i
    //   666: ldc_w 289810620
    //   669: ixor
    //   670: ldc2_w 262159882
    //   673: l2i
    //   674: ldc_w -557751119
    //   677: ixor
    //   678: ixor
    //   679: lookupswitch default -> 1360, -832464095 -> 662, -458210668 -> 704
    //   704: goto -> 708
    //   707: athrow
    //   708: invokevirtual func_177956_o : ()I
    //   711: goto -> 715
    //   714: athrow
    //   715: getstatic Perryc.1 : I
    //   718: ifeq -> 732
    //   721: ldc2_w 1458708882
    //   724: l2i
    //   725: ldc_w 479587755
    //   728: ixor
    //   729: goto -> 740
    //   732: ldc2_w 1433691290
    //   735: l2i
    //   736: ldc_w -1708890033
    //   739: ixor
    //   740: ldc2_w -1889643169
    //   743: l2i
    //   744: ldc_w -1869312710
    //   747: ixor
    //   748: ixor
    //   749: lookupswitch default -> 776, 786933784 -> 732, 1437406300 -> 1376
    //   776: goto -> 780
    //   779: athrow
    //   780: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   783: goto -> 787
    //   786: athrow
    //   787: ldc_w 'ﰏ㍟ﰼ'
    //   790: getstatic Perryc.1 : I
    //   793: ifeq -> 807
    //   796: ldc2_w -1704584830
    //   799: l2i
    //   800: ldc_w -1677339742
    //   803: ixor
    //   804: goto -> 815
    //   807: ldc2_w -1930948906
    //   810: l2i
    //   811: ldc_w -1058851747
    //   814: ixor
    //   815: ldc2_w 1409981269
    //   818: l2i
    //   819: ldc_w -1330410907
    //   822: ixor
    //   823: ixor
    //   824: lookupswitch default -> 1388, -1464718405 -> 852, -488973552 -> 807
    //   852: goto -> 856
    //   855: athrow
    //   856: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   859: goto -> 863
    //   862: athrow
    //   863: getstatic Perryc.1 : I
    //   866: ifeq -> 880
    //   869: ldc2_w -1297959057
    //   872: l2i
    //   873: ldc_w -2079818394
    //   876: ixor
    //   877: goto -> 888
    //   880: ldc2_w 501869195
    //   883: l2i
    //   884: ldc_w 1840015482
    //   887: ixor
    //   888: ldc2_w 1211878316
    //   891: l2i
    //   892: ldc_w 529214117
    //   895: ixor
    //   896: ixor
    //   897: lookupswitch default -> 1362, 670393336 -> 924, 1629104896 -> 880
    //   924: goto -> 928
    //   927: athrow
    //   928: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   931: goto -> 935
    //   934: athrow
    //   935: getstatic Perryc.0 : I
    //   938: ifle -> 952
    //   941: ldc2_w 1011976267
    //   944: l2i
    //   945: ldc_w 1228695625
    //   948: ixor
    //   949: goto -> 960
    //   952: ldc2_w -1081319350
    //   955: l2i
    //   956: ldc_w -520260360
    //   959: ixor
    //   960: ldc2_w 427559134
    //   963: l2i
    //   964: ldc_w 1708418374
    //   967: ixor
    //   968: ixor
    //   969: lookupswitch default -> 1366, 163941786 -> 952, 601454890 -> 996
    //   996: aload_1
    //   997: getstatic Perryc.1 : I
    //   1000: ifeq -> 1014
    //   1003: ldc2_w -206711136
    //   1006: l2i
    //   1007: ldc_w 1774002527
    //   1010: ixor
    //   1011: goto -> 1022
    //   1014: ldc2_w 688949117
    //   1017: l2i
    //   1018: ldc_w -644058926
    //   1021: ixor
    //   1022: ldc2_w -2089472747
    //   1025: l2i
    //   1026: ldc_w -1155500320
    //   1029: ixor
    //   1030: ixor
    //   1031: lookupswitch default -> 1056, -1572492278 -> 1370, -1032377700 -> 1014
    //   1056: goto -> 1060
    //   1059: athrow
    //   1060: invokevirtual func_177952_p : ()I
    //   1063: goto -> 1067
    //   1066: athrow
    //   1067: getstatic Perryc.0 : I
    //   1070: ifle -> 1084
    //   1073: ldc2_w 1340706779
    //   1076: l2i
    //   1077: ldc_w -934267912
    //   1080: ixor
    //   1081: goto -> 1092
    //   1084: ldc2_w 441303870
    //   1087: l2i
    //   1088: ldc_w 510766348
    //   1091: ixor
    //   1092: ldc2_w 2116832581
    //   1095: l2i
    //   1096: ldc_w 2020561295
    //   1099: ixor
    //   1100: ixor
    //   1101: lookupswitch default -> 1390, -2114281239 -> 1084, 41906936 -> 1128
    //   1128: goto -> 1132
    //   1131: athrow
    //   1132: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1135: goto -> 1139
    //   1138: athrow
    //   1139: ldc_w 'z'
    //   1142: getstatic Perryc.c : I
    //   1145: iflt -> 1159
    //   1148: ldc2_w -1308908543
    //   1151: l2i
    //   1152: ldc_w 1218783189
    //   1155: ixor
    //   1156: goto -> 1167
    //   1159: ldc2_w 1615726406
    //   1162: l2i
    //   1163: ldc_w 77834449
    //   1166: ixor
    //   1167: ldc2_w 1291431073
    //   1170: l2i
    //   1171: ldc_w 13059861
    //   1174: ixor
    //   1175: ixor
    //   1176: lookupswitch default -> 1368, -1251973024 -> 1159, 684934179 -> 1204
    //   1204: goto -> 1208
    //   1207: athrow
    //   1208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1211: goto -> 1215
    //   1214: athrow
    //   1215: getstatic Perryc.c : I
    //   1218: iflt -> 1232
    //   1221: ldc2_w 412324279
    //   1224: l2i
    //   1225: ldc_w -1726481544
    //   1228: ixor
    //   1229: goto -> 1240
    //   1232: ldc2_w -898365362
    //   1235: l2i
    //   1236: ldc_w 1636928733
    //   1239: ixor
    //   1240: ldc2_w -1056718460
    //   1243: l2i
    //   1244: ldc_w 1485232609
    //   1247: ixor
    //   1248: ixor
    //   1249: lookupswitch default -> 1276, 402748074 -> 1378, 586671410 -> 1232
    //   1276: goto -> 1280
    //   1279: athrow
    //   1280: invokevirtual toString : ()Ljava/lang/String;
    //   1283: goto -> 1287
    //   1286: athrow
    //   1287: getstatic Perryc.0 : I
    //   1290: ifle -> 1304
    //   1293: ldc2_w -2135563943
    //   1296: l2i
    //   1297: ldc_w 1708249344
    //   1300: ixor
    //   1301: goto -> 1312
    //   1304: ldc2_w 1317954826
    //   1307: l2i
    //   1308: ldc_w 1489399528
    //   1311: ixor
    //   1312: ldc2_w -2079929780
    //   1315: l2i
    //   1316: ldc_w -1486865730
    //   1319: ixor
    //   1320: ixor
    //   1321: lookupswitch default -> 1380, -972898133 -> 1304, 892271376 -> 1348
    //   1348: goto -> 1352
    //   1351: athrow
    //   1352: invokestatic sendMessage : (Ljava/lang/String;)V
    //   1355: goto -> 1359
    //   1358: athrow
    //   1359: return
    //   1360: aconst_null
    //   1361: athrow
    //   1362: aconst_null
    //   1363: athrow
    //   1364: aconst_null
    //   1365: athrow
    //   1366: aconst_null
    //   1367: athrow
    //   1368: aconst_null
    //   1369: athrow
    //   1370: aconst_null
    //   1371: athrow
    //   1372: aconst_null
    //   1373: athrow
    //   1374: aconst_null
    //   1375: athrow
    //   1376: aconst_null
    //   1377: athrow
    //   1378: aconst_null
    //   1379: athrow
    //   1380: aconst_null
    //   1381: athrow
    //   1382: aconst_null
    //   1383: athrow
    //   1384: aconst_null
    //   1385: athrow
    //   1386: aconst_null
    //   1387: athrow
    //   1388: aconst_null
    //   1389: athrow
    //   1390: aconst_null
    //   1391: athrow
    //   1392: aconst_null
    //   1393: athrow
    //   1394: aconst_null
    //   1395: athrow
    //   1396: aconst_null
    //   1397: athrow
    //   1398: pop
    //   1399: goto -> 24
    //   1402: pop
    //   1403: aconst_null
    //   1404: goto -> 1398
    //   1407: dup
    //   1408: ifnull -> 1398
    //   1411: checkcast java/lang/Throwable
    //   1414: athrow
    //   1415: dup
    //   1416: ifnull -> 1402
    //   1419: checkcast java/lang/Throwable
    //   1422: athrow
    //   1423: aconst_null
    //   1424: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1336	0	message	Ljava/lang/String;
    //   24	1336	1	pos	Lnet/minecraft/util/math/BlockPos;
    // Exception table:
    //   from	to	target	type
    //   8	20	1407	java/lang/IndexOutOfBoundsException
    //   92	98	98	finally
    //   92	98	3	finally
    //   92	98	3	java/lang/EnumConstantNotPresentException
    //   92	98	3	finally
    //   92	98	98	finally
    //   223	230	230	finally
    //   223	230	223	finally
    //   224	230	3	finally
    //   224	230	3	java/lang/NumberFormatException
    //   224	230	3	finally
    //   355	362	362	finally
    //   356	362	355	finally
    //   356	362	362	finally
    //   356	362	3	finally
    //   356	362	362	java/util/ConcurrentModificationException
    //   427	434	434	finally
    //   427	434	427	finally
    //   427	434	434	finally
    //   428	434	3	finally
    //   428	434	427	finally
    //   503	510	510	finally
    //   503	510	3	java/lang/NumberFormatException
    //   504	510	3	finally
    //   504	510	3	finally
    //   504	510	503	java/lang/EnumConstantNotPresentException
    //   575	582	582	finally
    //   575	582	575	finally
    //   575	582	582	finally
    //   576	582	582	java/lang/RuntimeException
    //   576	582	575	java/lang/IllegalStateException
    //   707	714	714	finally
    //   707	714	3	finally
    //   707	714	707	finally
    //   708	714	3	finally
    //   708	714	707	java/lang/AssertionError
    //   779	786	786	finally
    //   779	786	779	java/lang/EnumConstantNotPresentException
    //   779	786	3	finally
    //   780	786	3	finally
    //   780	786	3	java/lang/IllegalArgumentException
    //   855	862	862	finally
    //   855	862	3	finally
    //   856	862	855	finally
    //   856	862	3	java/lang/ClassCastException
    //   856	862	855	finally
    //   927	934	934	finally
    //   927	934	3	java/lang/ClassCastException
    //   927	934	927	finally
    //   927	934	927	java/lang/StringIndexOutOfBoundsException
    //   928	934	927	java/lang/AssertionError
    //   1060	1066	1066	finally
    //   1060	1066	1066	java/lang/RuntimeException
    //   1060	1066	3	finally
    //   1060	1066	1066	finally
    //   1060	1066	3	finally
    //   1132	1138	1138	finally
    //   1132	1138	3	java/util/NoSuchElementException
    //   1132	1138	3	finally
    //   1132	1138	3	java/lang/ClassCastException
    //   1132	1138	3	java/lang/IllegalStateException
    //   1207	1214	1214	finally
    //   1207	1214	3	finally
    //   1207	1214	3	java/lang/UnsupportedOperationException
    //   1208	1214	1207	java/lang/NegativeArraySizeException
    //   1208	1214	1214	java/lang/ClassCastException
    //   1279	1286	1286	finally
    //   1279	1286	3	java/lang/ArithmeticException
    //   1279	1286	3	java/lang/RuntimeException
    //   1280	1286	1279	finally
    //   1280	1286	3	finally
    //   1351	1358	1358	finally
    //   1351	1358	3	java/util/NoSuchElementException
    //   1352	1358	1351	java/lang/IllegalStateException
    //   1352	1358	1358	finally
    //   1352	1358	1358	java/util/NoSuchElementException
    //   1407	1415	1407	finally
    //   1423	1425	3	finally
  }
  
  public static IBlockState getState(BlockPos paramBlockPos) {
    return Perry1.6u(null, (int)1425132231L ^ 0x11133575, paramBlockPos);
  }
  
  public static boolean rayTracePlaceCheck(BlockPos pos, boolean shouldCheck, float height) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1899
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 1891
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1883
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 41
    //   30: ldc2_w 1202355170
    //   33: l2i
    //   34: ldc_w 1473517032
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w 1151209865
    //   44: l2i
    //   45: ldc_w 1675151399
    //   48: ixor
    //   49: ldc2_w -349704951
    //   52: l2i
    //   53: ldc_w 147818710
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 1826, -995181455 -> 84, -208270379 -> 41
    //   84: iload_1
    //   85: ifeq -> 99
    //   88: ldc2_w 456956660
    //   91: l2i
    //   92: ldc_w -1207159463
    //   95: ixor
    //   96: goto -> 107
    //   99: ldc2_w 1344100183
    //   102: l2i
    //   103: ldc_w -215090949
    //   106: ixor
    //   107: ldc2_w -169895269
    //   110: l2i
    //   111: ldc_w -440956582
    //   114: ixor
    //   115: ixor
    //   116: tableswitch default -> 88, -1286030228 -> 140, -1286030227 -> 1804
    //   140: getstatic Perryc.c : I
    //   143: iflt -> 157
    //   146: ldc2_w -1734607204
    //   149: l2i
    //   150: ldc_w -1109283171
    //   153: ixor
    //   154: goto -> 165
    //   157: ldc2_w 1843404611
    //   160: l2i
    //   161: ldc_w -1055195320
    //   164: ixor
    //   165: ldc2_w 1846647228
    //   168: l2i
    //   169: ldc_w 493633837
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 200, 428227242 -> 157, 1443334288 -> 1862
    //   200: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   203: getstatic Perryc.1 : I
    //   206: ifeq -> 220
    //   209: ldc2_w 1170252078
    //   212: l2i
    //   213: ldc_w 2125695912
    //   216: ixor
    //   217: goto -> 228
    //   220: ldc2_w -681006720
    //   223: l2i
    //   224: ldc_w -338225148
    //   227: ixor
    //   228: ldc2_w 499709388
    //   231: l2i
    //   232: ldc_w 342624498
    //   235: ixor
    //   236: ixor
    //   237: lookupswitch default -> 1872, 853006264 -> 220, 890981562 -> 264
    //   264: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   267: new net/minecraft/util/math/Vec3d
    //   270: dup
    //   271: getstatic Perryc.1 : I
    //   274: ifeq -> 288
    //   277: ldc2_w 953886239
    //   280: l2i
    //   281: ldc_w -585790235
    //   284: ixor
    //   285: goto -> 296
    //   288: ldc2_w -2063568644
    //   291: l2i
    //   292: ldc_w -588687291
    //   295: ixor
    //   296: ldc2_w -2102181360
    //   299: l2i
    //   300: ldc_w 1815699650
    //   303: ixor
    //   304: ixor
    //   305: lookupswitch default -> 1828, -1218246037 -> 332, 189040680 -> 288
    //   332: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   335: getstatic Perryc.1 : I
    //   338: ifeq -> 352
    //   341: ldc2_w 1133965827
    //   344: l2i
    //   345: ldc_w 1341952785
    //   348: ixor
    //   349: goto -> 360
    //   352: ldc2_w 1101836411
    //   355: l2i
    //   356: ldc_w -1839227259
    //   359: ixor
    //   360: ldc2_w 897626898
    //   363: l2i
    //   364: ldc_w -1471696496
    //   367: ixor
    //   368: ixor
    //   369: lookupswitch default -> 396, -1850907760 -> 1854, -312135250 -> 352
    //   396: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   399: getstatic Perryc.0 : I
    //   402: ifle -> 416
    //   405: ldc2_w 909703681
    //   408: l2i
    //   409: ldc_w 1646478441
    //   412: ixor
    //   413: goto -> 424
    //   416: ldc2_w 1579309125
    //   419: l2i
    //   420: ldc_w -1585596293
    //   423: ixor
    //   424: ldc2_w 708111152
    //   427: l2i
    //   428: ldc_w -504026808
    //   431: ixor
    //   432: ixor
    //   433: lookupswitch default -> 1858, -1613071344 -> 416, 882778694 -> 460
    //   460: getfield field_70165_t : D
    //   463: getstatic Perryc.1 : I
    //   466: ifeq -> 480
    //   469: ldc2_w 611185833
    //   472: l2i
    //   473: ldc_w 647570073
    //   476: ixor
    //   477: goto -> 488
    //   480: ldc2_w 403576622
    //   483: l2i
    //   484: ldc_w -383143395
    //   487: ixor
    //   488: ldc2_w -1546899904
    //   491: l2i
    //   492: ldc_w -641288583
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 524, 786074663 -> 480, 2029932041 -> 1848
    //   524: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   527: getstatic Perryc.1 : I
    //   530: ifeq -> 544
    //   533: ldc2_w -2136985415
    //   536: l2i
    //   537: ldc_w -1066428913
    //   540: ixor
    //   541: goto -> 552
    //   544: ldc2_w -1989236345
    //   547: l2i
    //   548: ldc_w 641638392
    //   551: ixor
    //   552: ldc2_w -363162745
    //   555: l2i
    //   556: ldc_w 407896756
    //   559: ixor
    //   560: ixor
    //   561: lookupswitch default -> 1850, -1295698043 -> 544, 1566222156 -> 588
    //   588: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   591: getstatic Perryc.1 : I
    //   594: ifeq -> 608
    //   597: ldc2_w 968246163
    //   600: l2i
    //   601: ldc_w -1943210693
    //   604: ixor
    //   605: goto -> 616
    //   608: ldc2_w 1689138418
    //   611: l2i
    //   612: ldc_w 2014699184
    //   615: ixor
    //   616: ldc2_w 258013602
    //   619: l2i
    //   620: ldc_w -262266039
    //   623: ixor
    //   624: ixor
    //   625: lookupswitch default -> 1868, -477810519 -> 652, 1252289603 -> 608
    //   652: getfield field_70163_u : D
    //   655: getstatic Perryc.c : I
    //   658: iflt -> 672
    //   661: ldc2_w 1606918065
    //   664: l2i
    //   665: ldc_w 1894345390
    //   668: ixor
    //   669: goto -> 680
    //   672: ldc2_w -1114043437
    //   675: l2i
    //   676: ldc_w -240329550
    //   679: ixor
    //   680: ldc2_w -1860149133
    //   683: l2i
    //   684: ldc_w 2001978682
    //   687: ixor
    //   688: ixor
    //   689: lookupswitch default -> 1836, -1438223832 -> 716, -916631466 -> 672
    //   716: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   719: getstatic Perryc.0 : I
    //   722: ifle -> 736
    //   725: ldc2_w 170020487
    //   728: l2i
    //   729: ldc_w 327957580
    //   732: ixor
    //   733: goto -> 744
    //   736: ldc2_w 1657385319
    //   739: l2i
    //   740: ldc_w 240332102
    //   743: ixor
    //   744: ldc2_w -1478849538
    //   747: l2i
    //   748: ldc_w -1914539464
    //   751: ixor
    //   752: ixor
    //   753: lookupswitch default -> 780, -2054585897 -> 736, 865504013 -> 1844
    //   780: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   783: getstatic Perryc.c : I
    //   786: iflt -> 800
    //   789: ldc2_w -706962680
    //   792: l2i
    //   793: ldc_w -426644192
    //   796: ixor
    //   797: goto -> 808
    //   800: ldc2_w 808230924
    //   803: l2i
    //   804: ldc_w -251549333
    //   807: ixor
    //   808: ldc2_w -263539259
    //   811: l2i
    //   812: ldc_w 302086178
    //   815: ixor
    //   816: ixor
    //   817: lookupswitch default -> 844, -788087857 -> 1860, -160379462 -> 800
    //   844: goto -> 848
    //   847: athrow
    //   848: invokevirtual func_70047_e : ()F
    //   851: goto -> 855
    //   854: athrow
    //   855: f2d
    //   856: dadd
    //   857: getstatic Perryc.0 : I
    //   860: ifle -> 874
    //   863: ldc2_w 1547921555
    //   866: l2i
    //   867: ldc_w -1684619029
    //   870: ixor
    //   871: goto -> 882
    //   874: ldc2_w 2146373356
    //   877: l2i
    //   878: ldc_w -1339683838
    //   881: ixor
    //   882: ldc2_w 366679550
    //   885: l2i
    //   886: ldc_w 1679063063
    //   889: ixor
    //   890: ixor
    //   891: lookupswitch default -> 916, -1239759471 -> 1866, 507043185 -> 874
    //   916: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   919: getstatic Perryc.c : I
    //   922: iflt -> 936
    //   925: ldc2_w -2002916675
    //   928: l2i
    //   929: ldc_w 1983979676
    //   932: ixor
    //   933: goto -> 944
    //   936: ldc2_w -636366538
    //   939: l2i
    //   940: ldc_w 1050270367
    //   943: ixor
    //   944: ldc2_w 893018806
    //   947: l2i
    //   948: ldc_w -437038592
    //   951: ixor
    //   952: ixor
    //   953: lookupswitch default -> 980, 773192343 -> 1852, 895830294 -> 936
    //   980: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   983: getstatic Perryc.0 : I
    //   986: ifle -> 1000
    //   989: ldc2_w -1013164145
    //   992: l2i
    //   993: ldc_w 1578838692
    //   996: ixor
    //   997: goto -> 1008
    //   1000: ldc2_w 1359910061
    //   1003: l2i
    //   1004: ldc_w 171114275
    //   1007: ixor
    //   1008: ldc2_w 1627348777
    //   1011: l2i
    //   1012: ldc_w -948174492
    //   1015: ixor
    //   1016: ixor
    //   1017: lookupswitch default -> 1044, 13065301 -> 1000, 973349734 -> 1838
    //   1044: getfield field_70161_v : D
    //   1047: getstatic Perryc.0 : I
    //   1050: ifle -> 1064
    //   1053: ldc2_w 2009496385
    //   1056: l2i
    //   1057: ldc_w 1038090738
    //   1060: ixor
    //   1061: goto -> 1072
    //   1064: ldc2_w 1279979107
    //   1067: l2i
    //   1068: ldc_w -649622653
    //   1071: ixor
    //   1072: ldc2_w 1611526036
    //   1075: l2i
    //   1076: ldc_w 732719823
    //   1079: ixor
    //   1080: ixor
    //   1081: lookupswitch default -> 1830, -559095621 -> 1108, 25690088 -> 1064
    //   1108: goto -> 1112
    //   1111: athrow
    //   1112: invokespecial <init> : (DDD)V
    //   1115: goto -> 1119
    //   1118: athrow
    //   1119: new net/minecraft/util/math/Vec3d
    //   1122: dup
    //   1123: getstatic Perryc.c : I
    //   1126: iflt -> 1140
    //   1129: ldc2_w 1465256632
    //   1132: l2i
    //   1133: ldc_w -1805030528
    //   1136: ixor
    //   1137: goto -> 1148
    //   1140: ldc2_w 1559937193
    //   1143: l2i
    //   1144: ldc_w -1395318286
    //   1147: ixor
    //   1148: ldc2_w -1501300064
    //   1151: l2i
    //   1152: ldc_w 1195366170
    //   1155: ixor
    //   1156: ixor
    //   1157: lookupswitch default -> 1840, 294898913 -> 1184, 579030146 -> 1140
    //   1184: aload_0
    //   1185: getstatic Perryc.1 : I
    //   1188: ifeq -> 1202
    //   1191: ldc2_w -2032801609
    //   1194: l2i
    //   1195: ldc_w -1568758879
    //   1198: ixor
    //   1199: goto -> 1210
    //   1202: ldc2_w -1093648132
    //   1205: l2i
    //   1206: ldc_w -436735143
    //   1209: ixor
    //   1210: ldc2_w -1455060254
    //   1213: l2i
    //   1214: ldc_w -1406597335
    //   1217: ixor
    //   1218: ixor
    //   1219: lookupswitch default -> 1244, 566740701 -> 1832, 1248845747 -> 1202
    //   1244: goto -> 1248
    //   1247: athrow
    //   1248: invokevirtual func_177958_n : ()I
    //   1251: goto -> 1255
    //   1254: athrow
    //   1255: i2d
    //   1256: getstatic Perryc.c : I
    //   1259: iflt -> 1273
    //   1262: ldc2_w 333485343
    //   1265: l2i
    //   1266: ldc_w -1605296878
    //   1269: ixor
    //   1270: goto -> 1281
    //   1273: ldc2_w -1116748565
    //   1276: l2i
    //   1277: ldc_w 847585903
    //   1280: ixor
    //   1281: ldc2_w -818131737
    //   1284: l2i
    //   1285: ldc_w 1244492692
    //   1288: ixor
    //   1289: ixor
    //   1290: lookupswitch default -> 1316, 394963999 -> 1273, 916502398 -> 1846
    //   1316: aload_0
    //   1317: getstatic Perryc.1 : I
    //   1320: ifeq -> 1334
    //   1323: ldc2_w -814396111
    //   1326: l2i
    //   1327: ldc_w 1053245598
    //   1330: ixor
    //   1331: goto -> 1342
    //   1334: ldc2_w 885438680
    //   1337: l2i
    //   1338: ldc_w 1251096515
    //   1341: ixor
    //   1342: ldc2_w 945619821
    //   1345: l2i
    //   1346: ldc_w -1005778055
    //   1349: ixor
    //   1350: ixor
    //   1351: lookupswitch default -> 1834, -2113632497 -> 1376, 232916411 -> 1334
    //   1376: goto -> 1380
    //   1379: athrow
    //   1380: invokevirtual func_177956_o : ()I
    //   1383: goto -> 1387
    //   1386: athrow
    //   1387: i2f
    //   1388: getstatic Perryc.1 : I
    //   1391: ifeq -> 1405
    //   1394: ldc2_w -1426755043
    //   1397: l2i
    //   1398: ldc_w -1290393350
    //   1401: ixor
    //   1402: goto -> 1413
    //   1405: ldc2_w -1017107486
    //   1408: l2i
    //   1409: ldc_w 1636836613
    //   1412: ixor
    //   1413: ldc2_w 207246742
    //   1416: l2i
    //   1417: ldc_w 1236642012
    //   1420: ixor
    //   1421: ixor
    //   1422: lookupswitch default -> 1448, -2119314955 -> 1405, 1544333229 -> 1870
    //   1448: fload_2
    //   1449: fadd
    //   1450: f2d
    //   1451: getstatic Perryc.c : I
    //   1454: iflt -> 1468
    //   1457: ldc2_w 1667570795
    //   1460: l2i
    //   1461: ldc_w 676640926
    //   1464: ixor
    //   1465: goto -> 1476
    //   1468: ldc2_w 1435789758
    //   1471: l2i
    //   1472: ldc_w -36233480
    //   1475: ixor
    //   1476: ldc2_w 2097820491
    //   1479: l2i
    //   1480: ldc_w -734439701
    //   1483: ixor
    //   1484: ixor
    //   1485: lookupswitch default -> 1856, -503135915 -> 1468, 24122086 -> 1512
    //   1512: aload_0
    //   1513: getstatic Perryc.0 : I
    //   1516: ifle -> 1530
    //   1519: ldc2_w -2032171092
    //   1522: l2i
    //   1523: ldc_w 501958281
    //   1526: ixor
    //   1527: goto -> 1538
    //   1530: ldc2_w -671040052
    //   1533: l2i
    //   1534: ldc_w -1475688554
    //   1537: ixor
    //   1538: ldc2_w -2087876270
    //   1541: l2i
    //   1542: ldc_w -181364972
    //   1545: ixor
    //   1546: ixor
    //   1547: lookupswitch default -> 1824, -309731485 -> 1530, 112682012 -> 1572
    //   1572: goto -> 1576
    //   1575: athrow
    //   1576: invokevirtual func_177952_p : ()I
    //   1579: goto -> 1583
    //   1582: athrow
    //   1583: i2d
    //   1584: getstatic Perryc.1 : I
    //   1587: ifeq -> 1601
    //   1590: ldc2_w 223569456
    //   1593: l2i
    //   1594: ldc_w -1044503544
    //   1597: ixor
    //   1598: goto -> 1609
    //   1601: ldc2_w 378942969
    //   1604: l2i
    //   1605: ldc_w 1644000371
    //   1608: ixor
    //   1609: ldc2_w -217648347
    //   1612: l2i
    //   1613: ldc_w -1442899382
    //   1616: ixor
    //   1617: ixor
    //   1618: lookupswitch default -> 1864, -1777030313 -> 1601, 764586213 -> 1644
    //   1644: goto -> 1648
    //   1647: athrow
    //   1648: invokespecial <init> : (DDD)V
    //   1651: goto -> 1655
    //   1654: athrow
    //   1655: ldc2_w 902181324
    //   1658: l2i
    //   1659: ldc_w 902181324
    //   1662: ixor
    //   1663: ldc2_w -1332482625
    //   1666: l2i
    //   1667: ldc_w -1332482626
    //   1670: ixor
    //   1671: ldc2_w -1905157700
    //   1674: l2i
    //   1675: ldc_w -1905157700
    //   1678: ixor
    //   1679: getstatic Perryc.0 : I
    //   1682: ifle -> 1696
    //   1685: ldc2_w 683859310
    //   1688: l2i
    //   1689: ldc_w 1182335498
    //   1692: ixor
    //   1693: goto -> 1704
    //   1696: ldc2_w 222246867
    //   1699: l2i
    //   1700: ldc_w -1918169499
    //   1703: ixor
    //   1704: ldc2_w 1059118016
    //   1707: l2i
    //   1708: ldc_w 2107685778
    //   1711: ixor
    //   1712: ixor
    //   1713: lookupswitch default -> 1740, -2058668157 -> 1696, 742113078 -> 1842
    //   1740: goto -> 1744
    //   1743: athrow
    //   1744: invokevirtual func_147447_a : (Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;ZZZ)Lnet/minecraft/util/math/RayTraceResult;
    //   1747: goto -> 1751
    //   1750: athrow
    //   1751: ifnonnull -> 1765
    //   1754: ldc2_w -238705949
    //   1757: l2i
    //   1758: ldc_w 1136113923
    //   1761: ixor
    //   1762: goto -> 1773
    //   1765: ldc2_w -1786218162
    //   1768: l2i
    //   1769: ldc_w 670720681
    //   1772: ixor
    //   1773: ldc2_w 1513566111
    //   1776: l2i
    //   1777: ldc_w 26205804
    //   1780: ixor
    //   1781: ixor
    //   1782: tableswitch default -> 1754, -372577773 -> 1804, -372577772 -> 1815
    //   1804: ldc2_w -955053891
    //   1807: l2i
    //   1808: ldc_w -955053892
    //   1811: ixor
    //   1812: goto -> 1823
    //   1815: ldc2_w 204158104
    //   1818: l2i
    //   1819: ldc_w 204158104
    //   1822: ixor
    //   1823: ireturn
    //   1824: aconst_null
    //   1825: athrow
    //   1826: aconst_null
    //   1827: athrow
    //   1828: aconst_null
    //   1829: athrow
    //   1830: aconst_null
    //   1831: athrow
    //   1832: aconst_null
    //   1833: athrow
    //   1834: aconst_null
    //   1835: athrow
    //   1836: aconst_null
    //   1837: athrow
    //   1838: aconst_null
    //   1839: athrow
    //   1840: aconst_null
    //   1841: athrow
    //   1842: aconst_null
    //   1843: athrow
    //   1844: aconst_null
    //   1845: athrow
    //   1846: aconst_null
    //   1847: athrow
    //   1848: aconst_null
    //   1849: athrow
    //   1850: aconst_null
    //   1851: athrow
    //   1852: aconst_null
    //   1853: athrow
    //   1854: aconst_null
    //   1855: athrow
    //   1856: aconst_null
    //   1857: athrow
    //   1858: aconst_null
    //   1859: athrow
    //   1860: aconst_null
    //   1861: athrow
    //   1862: aconst_null
    //   1863: athrow
    //   1864: aconst_null
    //   1865: athrow
    //   1866: aconst_null
    //   1867: athrow
    //   1868: aconst_null
    //   1869: athrow
    //   1870: aconst_null
    //   1871: athrow
    //   1872: aconst_null
    //   1873: athrow
    //   1874: pop
    //   1875: goto -> 24
    //   1878: pop
    //   1879: aconst_null
    //   1880: goto -> 1874
    //   1883: dup
    //   1884: ifnull -> 1874
    //   1887: checkcast java/lang/Throwable
    //   1890: athrow
    //   1891: dup
    //   1892: ifnull -> 1878
    //   1895: checkcast java/lang/Throwable
    //   1898: athrow
    //   1899: aconst_null
    //   1900: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1800	0	pos	Lnet/minecraft/util/math/BlockPos;
    //   24	1800	1	shouldCheck	Z
    //   24	1800	2	height	F
    // Exception table:
    //   from	to	target	type
    //   8	20	1883	java/lang/UnsupportedOperationException
    //   847	854	854	finally
    //   847	854	3	finally
    //   847	854	3	java/lang/IllegalArgumentException
    //   847	854	854	finally
    //   848	854	847	finally
    //   1111	1118	1118	finally
    //   1111	1118	3	java/lang/ArithmeticException
    //   1111	1118	1111	java/lang/UnsupportedOperationException
    //   1111	1118	1111	finally
    //   1112	1118	3	finally
    //   1248	1254	1254	finally
    //   1248	1254	1254	java/lang/IllegalArgumentException
    //   1248	1254	3	finally
    //   1248	1254	3	java/lang/RuntimeException
    //   1248	1254	1254	java/lang/StringIndexOutOfBoundsException
    //   1380	1386	1386	finally
    //   1380	1386	1386	finally
    //   1380	1386	3	finally
    //   1380	1386	1386	finally
    //   1380	1386	3	java/lang/NegativeArraySizeException
    //   1576	1582	1582	finally
    //   1576	1582	1582	finally
    //   1576	1582	1582	finally
    //   1576	1582	1582	java/lang/NumberFormatException
    //   1576	1582	3	finally
    //   1648	1654	1654	finally
    //   1648	1654	1654	java/util/NoSuchElementException
    //   1648	1654	1654	java/util/ConcurrentModificationException
    //   1648	1654	1654	finally
    //   1648	1654	3	java/lang/IllegalArgumentException
    //   1743	1750	1750	finally
    //   1743	1750	1750	finally
    //   1743	1750	1743	java/lang/StringIndexOutOfBoundsException
    //   1744	1750	1750	java/lang/ArrayIndexOutOfBoundsException
    //   1744	1750	3	java/lang/EnumConstantNotPresentException
    //   1883	1891	1883	finally
    //   1899	1901	3	java/lang/StringIndexOutOfBoundsException
  }
  
  public static void rightClickBlock(BlockPos pos, Vec3d vec, EnumHand hand, EnumFacing direction, boolean packet) {
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
  
  public static Vec3d[] convertVec3ds(Vec3d vec3d, Vec3d[] input) {
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
  
  public static List getSphere(BlockPos pos, float r, int h, boolean hollow, boolean sphere, int plus_y) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 5178
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 5170
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 5162
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/util/ArrayList
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w -369282917
    //   37: l2i
    //   38: ldc_w -306574540
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -626484811
    //   48: l2i
    //   49: ldc_w -1794804052
    //   52: ixor
    //   53: ldc2_w -546766332
    //   56: l2i
    //   57: ldc_w -539461162
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, 83247229 -> 5081, 236876366 -> 45
    //   88: goto -> 92
    //   91: athrow
    //   92: invokespecial <init> : ()V
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.1 : I
    //   102: ifeq -> 116
    //   105: ldc2_w -186242141
    //   108: l2i
    //   109: ldc_w 182801135
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w 1443957070
    //   119: l2i
    //   120: ldc_w 1521591308
    //   123: ixor
    //   124: ldc2_w -272154948
    //   127: l2i
    //   128: ldc_w 2104598337
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 5079, -1642722113 -> 160, 1823856817 -> 116
    //   160: astore #6
    //   162: getstatic Perryc.c : I
    //   165: iflt -> 179
    //   168: ldc2_w -1940628557
    //   171: l2i
    //   172: ldc_w 2035227935
    //   175: ixor
    //   176: goto -> 187
    //   179: ldc2_w 1305054254
    //   182: l2i
    //   183: ldc_w 2067855853
    //   186: ixor
    //   187: ldc2_w 149178993
    //   190: l2i
    //   191: ldc_w 1270022438
    //   194: ixor
    //   195: ixor
    //   196: lookupswitch default -> 5017, -1236529669 -> 179, 1977499284 -> 224
    //   224: aload_0
    //   225: getstatic Perryc.0 : I
    //   228: ifle -> 242
    //   231: ldc2_w -2120900190
    //   234: l2i
    //   235: ldc_w -1426251816
    //   238: ixor
    //   239: goto -> 250
    //   242: ldc2_w -965098943
    //   245: l2i
    //   246: ldc_w -236077985
    //   249: ixor
    //   250: ldc2_w -1182668867
    //   253: l2i
    //   254: ldc_w 1607531524
    //   257: ixor
    //   258: ixor
    //   259: lookupswitch default -> 5105, -851860029 -> 242, -775592537 -> 284
    //   284: goto -> 288
    //   287: athrow
    //   288: invokevirtual func_177958_n : ()I
    //   291: goto -> 295
    //   294: athrow
    //   295: getstatic Perryc.1 : I
    //   298: ifeq -> 312
    //   301: ldc2_w -182537690
    //   304: l2i
    //   305: ldc_w 1834849336
    //   308: ixor
    //   309: goto -> 320
    //   312: ldc2_w -865991098
    //   315: l2i
    //   316: ldc_w -1659215700
    //   319: ixor
    //   320: ldc2_w -935418811
    //   323: l2i
    //   324: ldc_w -739562032
    //   327: ixor
    //   328: ixor
    //   329: lookupswitch default -> 5141, -2087276661 -> 312, 1252913023 -> 356
    //   356: istore #7
    //   358: getstatic Perryc.1 : I
    //   361: ifeq -> 375
    //   364: ldc2_w -1554030309
    //   367: l2i
    //   368: ldc_w 1469642812
    //   371: ixor
    //   372: goto -> 383
    //   375: ldc2_w -344359179
    //   378: l2i
    //   379: ldc_w 1905684117
    //   382: ixor
    //   383: ldc2_w 977203773
    //   386: l2i
    //   387: ldc_w -237912845
    //   390: ixor
    //   391: ixor
    //   392: lookupswitch default -> 420, 1059641321 -> 5097, 1125820228 -> 375
    //   420: aload_0
    //   421: getstatic Perryc.1 : I
    //   424: ifeq -> 438
    //   427: ldc2_w -1324649220
    //   430: l2i
    //   431: ldc_w 1726402865
    //   434: ixor
    //   435: goto -> 446
    //   438: ldc2_w -1947149942
    //   441: l2i
    //   442: ldc_w -1886243238
    //   445: ixor
    //   446: ldc2_w 392150545
    //   449: l2i
    //   450: ldc_w -732715992
    //   453: ixor
    //   454: ixor
    //   455: lookupswitch default -> 5041, -949029399 -> 480, 350339060 -> 438
    //   480: goto -> 484
    //   483: athrow
    //   484: invokevirtual func_177956_o : ()I
    //   487: goto -> 491
    //   490: athrow
    //   491: getstatic Perryc.0 : I
    //   494: ifle -> 508
    //   497: ldc2_w 1658557935
    //   500: l2i
    //   501: ldc_w -1883888565
    //   504: ixor
    //   505: goto -> 516
    //   508: ldc2_w -535350822
    //   511: l2i
    //   512: ldc_w -861422695
    //   515: ixor
    //   516: ldc2_w -1535904716
    //   519: l2i
    //   520: ldc_w 1989688834
    //   523: ixor
    //   524: ixor
    //   525: lookupswitch default -> 5023, -27574155 -> 552, 1065778066 -> 508
    //   552: istore #8
    //   554: getstatic Perryc.c : I
    //   557: iflt -> 571
    //   560: ldc2_w 495369990
    //   563: l2i
    //   564: ldc_w 647217463
    //   567: ixor
    //   568: goto -> 579
    //   571: ldc2_w 1556835938
    //   574: l2i
    //   575: ldc_w -1204839004
    //   578: ixor
    //   579: ldc2_w 2088234793
    //   582: l2i
    //   583: ldc_w 1295959652
    //   586: ixor
    //   587: ixor
    //   588: lookupswitch default -> 616, 173823868 -> 5143, 629549314 -> 571
    //   616: aload_0
    //   617: getstatic Perryc.1 : I
    //   620: ifeq -> 634
    //   623: ldc2_w -798539049
    //   626: l2i
    //   627: ldc_w -140646462
    //   630: ixor
    //   631: goto -> 642
    //   634: ldc2_w -326945647
    //   637: l2i
    //   638: ldc_w 1017819073
    //   641: ixor
    //   642: ldc2_w -1610094751
    //   645: l2i
    //   646: ldc_w 1632445076
    //   649: ixor
    //   650: ixor
    //   651: lookupswitch default -> 5057, -424648480 -> 634, 291724965 -> 676
    //   676: goto -> 680
    //   679: athrow
    //   680: invokevirtual func_177952_p : ()I
    //   683: goto -> 687
    //   686: athrow
    //   687: getstatic Perryc.0 : I
    //   690: ifle -> 704
    //   693: ldc2_w -87419261
    //   696: l2i
    //   697: ldc_w -2141688806
    //   700: ixor
    //   701: goto -> 712
    //   704: ldc2_w -1454251923
    //   707: l2i
    //   708: ldc_w -1004928126
    //   711: ixor
    //   712: ldc2_w 1333965838
    //   715: l2i
    //   716: ldc_w -790742304
    //   719: ixor
    //   720: ixor
    //   721: lookupswitch default -> 5087, -439421833 -> 704, -233345791 -> 748
    //   748: istore #9
    //   750: getstatic Perryc.1 : I
    //   753: ifeq -> 767
    //   756: ldc2_w 1586122705
    //   759: l2i
    //   760: ldc_w -185942510
    //   763: ixor
    //   764: goto -> 775
    //   767: ldc2_w -293544905
    //   770: l2i
    //   771: ldc_w -254110247
    //   774: ixor
    //   775: ldc2_w -929976385
    //   778: l2i
    //   779: ldc_w 1278359742
    //   782: ixor
    //   783: ixor
    //   784: lookupswitch default -> 5071, -1694900497 -> 812, 784557762 -> 767
    //   812: iload #7
    //   814: getstatic Perryc.0 : I
    //   817: ifle -> 831
    //   820: ldc2_w -72646467
    //   823: l2i
    //   824: ldc_w -1097481522
    //   827: ixor
    //   828: goto -> 839
    //   831: ldc2_w -986989252
    //   834: l2i
    //   835: ldc_w -1975198177
    //   838: ixor
    //   839: ldc2_w -903395956
    //   842: l2i
    //   843: ldc_w -454812812
    //   846: ixor
    //   847: ixor
    //   848: lookupswitch default -> 876, -498786720 -> 831, 1811750027 -> 5111
    //   876: fload_1
    //   877: f2i
    //   878: isub
    //   879: getstatic Perryc.c : I
    //   882: iflt -> 896
    //   885: ldc2_w -565729334
    //   888: l2i
    //   889: ldc_w -1626684355
    //   892: ixor
    //   893: goto -> 904
    //   896: ldc2_w -483779168
    //   899: l2i
    //   900: ldc_w -16358737
    //   903: ixor
    //   904: ldc2_w 1311276272
    //   907: l2i
    //   908: ldc_w 59663083
    //   911: ixor
    //   912: ixor
    //   913: lookupswitch default -> 940, -698033749 -> 896, 216759788 -> 5047
    //   940: istore #10
    //   942: getstatic Perryc.c : I
    //   945: iflt -> 959
    //   948: ldc2_w 831678611
    //   951: l2i
    //   952: ldc_w 697279149
    //   955: ixor
    //   956: goto -> 967
    //   959: ldc2_w 1437397552
    //   962: l2i
    //   963: ldc_w 166451701
    //   966: ixor
    //   967: ldc2_w -153860320
    //   970: l2i
    //   971: ldc_w 644711837
    //   974: ixor
    //   975: ixor
    //   976: lookupswitch default -> 5095, -1929451144 -> 1004, -928774013 -> 959
    //   1004: iload #10
    //   1006: i2f
    //   1007: getstatic Perryc.0 : I
    //   1010: ifle -> 1024
    //   1013: ldc2_w 155196227
    //   1016: l2i
    //   1017: ldc_w -1891422784
    //   1020: ixor
    //   1021: goto -> 1032
    //   1024: ldc2_w -437079341
    //   1027: l2i
    //   1028: ldc_w 1495933526
    //   1031: ixor
    //   1032: ldc2_w -560312912
    //   1035: l2i
    //   1036: ldc_w 1810148306
    //   1039: ixor
    //   1040: ixor
    //   1041: lookupswitch default -> 5049, 161904359 -> 1068, 863883489 -> 1024
    //   1068: iload #7
    //   1070: i2f
    //   1071: getstatic Perryc.1 : I
    //   1074: ifeq -> 1088
    //   1077: ldc2_w -2111492337
    //   1080: l2i
    //   1081: ldc_w 1311888331
    //   1084: ixor
    //   1085: goto -> 1096
    //   1088: ldc2_w -1710604008
    //   1091: l2i
    //   1092: ldc_w 1333850702
    //   1095: ixor
    //   1096: ldc2_w -533663761
    //   1099: l2i
    //   1100: ldc_w 1684616081
    //   1103: ixor
    //   1104: ixor
    //   1105: lookupswitch default -> 5069, 1213014202 -> 1088, 1372811048 -> 1132
    //   1132: fload_1
    //   1133: fadd
    //   1134: fcmpg
    //   1135: ifgt -> 1149
    //   1138: ldc2_w -444122076
    //   1141: l2i
    //   1142: ldc_w 1507859877
    //   1145: ixor
    //   1146: goto -> 1157
    //   1149: ldc2_w -821328365
    //   1152: l2i
    //   1153: ldc_w 1936500627
    //   1156: ixor
    //   1157: ldc2_w 1379367254
    //   1160: l2i
    //   1161: ldc_w -738533127
    //   1164: ixor
    //   1165: ixor
    //   1166: tableswitch default -> 1138, 1034598446 -> 1188, 1034598447 -> 4950
    //   1188: getstatic Perryc.0 : I
    //   1191: ifle -> 1205
    //   1194: ldc2_w 408489834
    //   1197: l2i
    //   1198: ldc_w 676195349
    //   1201: ixor
    //   1202: goto -> 1213
    //   1205: ldc2_w -876064231
    //   1208: l2i
    //   1209: ldc_w -2062046088
    //   1212: ixor
    //   1213: ldc2_w -1496134445
    //   1216: l2i
    //   1217: ldc_w -1121451280
    //   1220: ixor
    //   1221: ixor
    //   1222: lookupswitch default -> 1248, 137389035 -> 1205, 737029468 -> 5093
    //   1248: iload #9
    //   1250: getstatic Perryc.c : I
    //   1253: iflt -> 1267
    //   1256: ldc2_w -1002176875
    //   1259: l2i
    //   1260: ldc_w -635685210
    //   1263: ixor
    //   1264: goto -> 1275
    //   1267: ldc2_w 1518199262
    //   1270: l2i
    //   1271: ldc_w -254786686
    //   1274: ixor
    //   1275: ldc2_w 1865899131
    //   1278: l2i
    //   1279: ldc_w -1933427134
    //   1282: ixor
    //   1283: ixor
    //   1284: lookupswitch default -> 5117, -39146998 -> 1267, 1230553189 -> 1312
    //   1312: fload_1
    //   1313: f2i
    //   1314: isub
    //   1315: getstatic Perryc.c : I
    //   1318: iflt -> 1332
    //   1321: ldc2_w -1802205853
    //   1324: l2i
    //   1325: ldc_w -1661338667
    //   1328: ixor
    //   1329: goto -> 1340
    //   1332: ldc2_w -1678386791
    //   1335: l2i
    //   1336: ldc_w -2096843611
    //   1339: ixor
    //   1340: ldc2_w 1301704462
    //   1343: l2i
    //   1344: ldc_w 900845870
    //   1347: ixor
    //   1348: ixor
    //   1349: lookupswitch default -> 1376, -341955806 -> 1332, 1883947158 -> 5151
    //   1376: istore #11
    //   1378: getstatic Perryc.1 : I
    //   1381: ifeq -> 1395
    //   1384: ldc2_w 1312752956
    //   1387: l2i
    //   1388: ldc_w 1090181260
    //   1391: ixor
    //   1392: goto -> 1403
    //   1395: ldc2_w 1769168630
    //   1398: l2i
    //   1399: ldc_w -1015856322
    //   1402: ixor
    //   1403: ldc2_w -2119453906
    //   1406: l2i
    //   1407: ldc_w -913907590
    //   1410: ixor
    //   1411: ixor
    //   1412: lookupswitch default -> 5089, -500347236 -> 1440, 1189646052 -> 1395
    //   1440: iload #11
    //   1442: i2f
    //   1443: getstatic Perryc.0 : I
    //   1446: ifle -> 1460
    //   1449: ldc2_w 748176747
    //   1452: l2i
    //   1453: ldc_w 116953389
    //   1456: ixor
    //   1457: goto -> 1468
    //   1460: ldc2_w -2049840327
    //   1463: l2i
    //   1464: ldc_w 1229065311
    //   1467: ixor
    //   1468: ldc2_w -1757449458
    //   1471: l2i
    //   1472: ldc_w 639741124
    //   1475: ixor
    //   1476: ixor
    //   1477: lookupswitch default -> 5051, -1686238324 -> 1460, 2106407084 -> 1504
    //   1504: iload #9
    //   1506: i2f
    //   1507: getstatic Perryc.1 : I
    //   1510: ifeq -> 1524
    //   1513: ldc2_w 422333625
    //   1516: l2i
    //   1517: ldc_w 938705691
    //   1520: ixor
    //   1521: goto -> 1532
    //   1524: ldc2_w -335941892
    //   1527: l2i
    //   1528: ldc_w 265073104
    //   1531: ixor
    //   1532: ldc2_w 2080596516
    //   1535: l2i
    //   1536: ldc_w 1529442015
    //   1539: ixor
    //   1540: ixor
    //   1541: lookupswitch default -> 1568, 167101273 -> 5129, 770890022 -> 1524
    //   1568: fload_1
    //   1569: fadd
    //   1570: fcmpg
    //   1571: ifgt -> 1585
    //   1574: ldc2_w 231273141
    //   1577: l2i
    //   1578: ldc_w 351924865
    //   1581: ixor
    //   1582: goto -> 1593
    //   1585: ldc2_w 447863883
    //   1588: l2i
    //   1589: ldc_w 58776688
    //   1592: ixor
    //   1593: ldc2_w -627691273
    //   1596: l2i
    //   1597: ldc_w -1112440108
    //   1600: ixor
    //   1601: ixor
    //   1602: tableswitch default -> 1574, 2115416599 -> 1624, 2115416600 -> 4944
    //   1624: getstatic Perryc.1 : I
    //   1627: ifeq -> 1641
    //   1630: ldc2_w 812872975
    //   1633: l2i
    //   1634: ldc_w -936475352
    //   1637: ixor
    //   1638: goto -> 1649
    //   1641: ldc2_w 1337374382
    //   1644: l2i
    //   1645: ldc_w -915774595
    //   1648: ixor
    //   1649: ldc2_w -2122546297
    //   1652: l2i
    //   1653: ldc_w 1248622741
    //   1656: ixor
    //   1657: ixor
    //   1658: lookupswitch default -> 5063, 860687157 -> 1641, 1305226945 -> 1684
    //   1684: iload #4
    //   1686: ifeq -> 1700
    //   1689: ldc2_w 262563009
    //   1692: l2i
    //   1693: ldc_w 1066448269
    //   1696: ixor
    //   1697: goto -> 1708
    //   1700: ldc2_w -680163891
    //   1703: l2i
    //   1704: ldc_w -415017856
    //   1707: ixor
    //   1708: ldc2_w 1446145367
    //   1711: l2i
    //   1712: ldc_w -2115725099
    //   1715: ixor
    //   1716: ixor
    //   1717: tableswitch default -> 1689, -404740914 -> 1740, -404740913 -> 1870
    //   1740: getstatic Perryc.c : I
    //   1743: iflt -> 1757
    //   1746: ldc2_w 2121142188
    //   1749: l2i
    //   1750: ldc_w 2105787847
    //   1753: ixor
    //   1754: goto -> 1765
    //   1757: ldc2_w 1047067985
    //   1760: l2i
    //   1761: ldc_w 782202930
    //   1764: ixor
    //   1765: ldc2_w -1592525717
    //   1768: l2i
    //   1769: ldc_w 2135756355
    //   1772: ixor
    //   1773: ixor
    //   1774: lookupswitch default -> 5045, -827754677 -> 1800, -575457213 -> 1757
    //   1800: iload #8
    //   1802: getstatic Perryc.c : I
    //   1805: iflt -> 1819
    //   1808: ldc2_w 681416597
    //   1811: l2i
    //   1812: ldc_w -657231086
    //   1815: ixor
    //   1816: goto -> 1827
    //   1819: ldc2_w 115265091
    //   1822: l2i
    //   1823: ldc_w -1805095669
    //   1826: ixor
    //   1827: ldc2_w 606181714
    //   1830: l2i
    //   1831: ldc_w 1834698112
    //   1834: ixor
    //   1835: ixor
    //   1836: lookupswitch default -> 5029, -1187760043 -> 1819, -607354982 -> 1864
    //   1864: fload_1
    //   1865: f2i
    //   1866: isub
    //   1867: goto -> 1934
    //   1870: getstatic Perryc.c : I
    //   1873: iflt -> 1887
    //   1876: ldc2_w -651769173
    //   1879: l2i
    //   1880: ldc_w -389479125
    //   1883: ixor
    //   1884: goto -> 1895
    //   1887: ldc2_w -612965715
    //   1890: l2i
    //   1891: ldc_w 27316919
    //   1894: ixor
    //   1895: ldc2_w -1995303059
    //   1898: l2i
    //   1899: ldc_w -1675512460
    //   1902: ixor
    //   1903: ixor
    //   1904: lookupswitch default -> 5121, -807038461 -> 1932, 618425753 -> 1887
    //   1932: iload #8
    //   1934: getstatic Perryc.0 : I
    //   1937: ifle -> 1951
    //   1940: ldc2_w -1341038622
    //   1943: l2i
    //   1944: ldc_w -1776188972
    //   1947: ixor
    //   1948: goto -> 1959
    //   1951: ldc2_w 162829736
    //   1954: l2i
    //   1955: ldc_w -1182922324
    //   1958: ixor
    //   1959: ldc2_w 877064661
    //   1962: l2i
    //   1963: ldc_w 1817531195
    //   1966: ixor
    //   1967: ixor
    //   1968: lookupswitch default -> 1996, -264129592 -> 1951, 2116254936 -> 5091
    //   1996: istore #12
    //   1998: getstatic Perryc.0 : I
    //   2001: ifle -> 2015
    //   2004: ldc2_w -1104771787
    //   2007: l2i
    //   2008: ldc_w -314019749
    //   2011: ixor
    //   2012: goto -> 2023
    //   2015: ldc2_w -855672707
    //   2018: l2i
    //   2019: ldc_w 1818774773
    //   2022: ixor
    //   2023: ldc2_w 1787229522
    //   2026: l2i
    //   2027: ldc_w 1946962983
    //   2030: ixor
    //   2031: ixor
    //   2032: lookupswitch default -> 2060, -377610320 -> 2015, 1306807323 -> 5119
    //   2060: iload #12
    //   2062: i2f
    //   2063: getstatic Perryc.c : I
    //   2066: iflt -> 2080
    //   2069: ldc2_w -1527657824
    //   2072: l2i
    //   2073: ldc_w 1590159820
    //   2076: ixor
    //   2077: goto -> 2088
    //   2080: ldc2_w 31097161
    //   2083: l2i
    //   2084: ldc_w 620347337
    //   2087: ixor
    //   2088: ldc2_w -1433880544
    //   2091: l2i
    //   2092: ldc_w 967390141
    //   2095: ixor
    //   2096: ixor
    //   2097: lookupswitch default -> 2124, 180257791 -> 2080, 1763158257 -> 5031
    //   2124: fstore #13
    //   2126: getstatic Perryc.1 : I
    //   2129: ifeq -> 2143
    //   2132: ldc2_w 1808161038
    //   2135: l2i
    //   2136: ldc_w -1953165671
    //   2139: ixor
    //   2140: goto -> 2151
    //   2143: ldc2_w -630314602
    //   2146: l2i
    //   2147: ldc_w -323643219
    //   2150: ixor
    //   2151: ldc2_w 273472964
    //   2154: l2i
    //   2155: ldc_w 639536630
    //   2158: ixor
    //   2159: ixor
    //   2160: lookupswitch default -> 5053, -704575579 -> 2143, 9036041 -> 2188
    //   2188: iload #4
    //   2190: ifeq -> 2204
    //   2193: ldc2_w 1919526757
    //   2196: l2i
    //   2197: ldc_w -585631786
    //   2200: ixor
    //   2201: goto -> 2212
    //   2204: ldc2_w 1671599441
    //   2207: l2i
    //   2208: ldc_w -857946655
    //   2211: ixor
    //   2212: ldc2_w 578086886
    //   2215: l2i
    //   2216: ldc_w 643221368
    //   2219: ixor
    //   2220: ixor
    //   2221: tableswitch default -> 2193, -1420005331 -> 2244, -1420005330 -> 2373
    //   2244: getstatic Perryc.1 : I
    //   2247: ifeq -> 2261
    //   2250: ldc2_w 922222597
    //   2253: l2i
    //   2254: ldc_w -590813010
    //   2257: ixor
    //   2258: goto -> 2269
    //   2261: ldc2_w 671547751
    //   2264: l2i
    //   2265: ldc_w -320564178
    //   2268: ixor
    //   2269: ldc2_w 560880445
    //   2272: l2i
    //   2273: ldc_w 734155394
    //   2276: ixor
    //   2277: ixor
    //   2278: lookupswitch default -> 5021, -833643274 -> 2304, -526589676 -> 2261
    //   2304: iload #8
    //   2306: i2f
    //   2307: getstatic Perryc.c : I
    //   2310: iflt -> 2324
    //   2313: ldc2_w 418642658
    //   2316: l2i
    //   2317: ldc_w -1680925256
    //   2320: ixor
    //   2321: goto -> 2332
    //   2324: ldc2_w -1350966381
    //   2327: l2i
    //   2328: ldc_w 1873414381
    //   2331: ixor
    //   2332: ldc2_w -593690817
    //   2335: l2i
    //   2336: ldc_w -557078464
    //   2339: ixor
    //   2340: ixor
    //   2341: lookupswitch default -> 2368, -2123648987 -> 5113, -1761382906 -> 2324
    //   2368: fload_1
    //   2369: fadd
    //   2370: goto -> 2499
    //   2373: getstatic Perryc.1 : I
    //   2376: ifeq -> 2390
    //   2379: ldc2_w -338150226
    //   2382: l2i
    //   2383: ldc_w 1667884913
    //   2386: ixor
    //   2387: goto -> 2398
    //   2390: ldc2_w -1935486306
    //   2393: l2i
    //   2394: ldc_w -113121319
    //   2397: ixor
    //   2398: ldc2_w 249549836
    //   2401: l2i
    //   2402: ldc_w -1354117826
    //   2405: ixor
    //   2406: ixor
    //   2407: lookupswitch default -> 2432, 208599070 -> 2390, 690471661 -> 5061
    //   2432: iload #8
    //   2434: getstatic Perryc.1 : I
    //   2437: ifeq -> 2451
    //   2440: ldc2_w 10583185
    //   2443: l2i
    //   2444: ldc_w 665692649
    //   2447: ixor
    //   2448: goto -> 2459
    //   2451: ldc2_w -819959780
    //   2454: l2i
    //   2455: ldc_w -1881433784
    //   2458: ixor
    //   2459: ldc2_w 1504677947
    //   2462: l2i
    //   2463: ldc_w -551849131
    //   2466: ixor
    //   2467: ixor
    //   2468: lookupswitch default -> 2496, -1581763050 -> 5073, 796428361 -> 2451
    //   2496: iload_2
    //   2497: iadd
    //   2498: i2f
    //   2499: getstatic Perryc.0 : I
    //   2502: ifle -> 2516
    //   2505: ldc2_w -804858504
    //   2508: l2i
    //   2509: ldc_w 1289244229
    //   2512: ixor
    //   2513: goto -> 2524
    //   2516: ldc2_w -224878734
    //   2519: l2i
    //   2520: ldc_w 630792055
    //   2523: ixor
    //   2524: ldc2_w -256059676
    //   2527: l2i
    //   2528: ldc_w 836832321
    //   2531: ixor
    //   2532: ixor
    //   2533: lookupswitch default -> 5075, 375151264 -> 2560, 1568883096 -> 2516
    //   2560: fstore #14
    //   2562: getstatic Perryc.c : I
    //   2565: iflt -> 2579
    //   2568: ldc2_w -1639893598
    //   2571: l2i
    //   2572: ldc_w -2115523224
    //   2575: ixor
    //   2576: goto -> 2587
    //   2579: ldc2_w -759489360
    //   2582: l2i
    //   2583: ldc_w 1558913736
    //   2586: ixor
    //   2587: ldc2_w -1226352528
    //   2590: l2i
    //   2591: ldc_w -991024420
    //   2594: ixor
    //   2595: ixor
    //   2596: lookupswitch default -> 5033, -61256492 -> 2624, 1840245350 -> 2579
    //   2624: fload #13
    //   2626: getstatic Perryc.0 : I
    //   2629: ifle -> 2643
    //   2632: ldc2_w 1284390461
    //   2635: l2i
    //   2636: ldc_w 1428589230
    //   2639: ixor
    //   2640: goto -> 2651
    //   2643: ldc2_w 805994212
    //   2646: l2i
    //   2647: ldc_w -1218581470
    //   2650: ixor
    //   2651: ldc2_w 2033100027
    //   2654: l2i
    //   2655: ldc_w 1616763181
    //   2658: ixor
    //   2659: ixor
    //   2660: lookupswitch default -> 5059, -1641746672 -> 2688, 14403909 -> 2643
    //   2688: fload #14
    //   2690: fcmpg
    //   2691: iflt -> 2705
    //   2694: ldc2_w 443445287
    //   2697: l2i
    //   2698: ldc_w 1080503465
    //   2701: ixor
    //   2702: goto -> 2713
    //   2705: ldc2_w 212110899
    //   2708: l2i
    //   2709: ldc_w 1454232254
    //   2712: ixor
    //   2713: ldc2_w -2021134294
    //   2716: l2i
    //   2717: ldc_w -777248751
    //   2720: ixor
    //   2721: ixor
    //   2722: tableswitch default -> 2694, 203590837 -> 2744, 203590838 -> 2747
    //   2744: goto -> 4938
    //   2747: getstatic Perryc.0 : I
    //   2750: ifle -> 2764
    //   2753: ldc2_w 1246028713
    //   2756: l2i
    //   2757: ldc_w -652965663
    //   2760: ixor
    //   2761: goto -> 2772
    //   2764: ldc2_w -72487406
    //   2767: l2i
    //   2768: ldc_w 2038366650
    //   2771: ixor
    //   2772: ldc2_w -1215600760
    //   2775: l2i
    //   2776: ldc_w -1468750875
    //   2779: ixor
    //   2780: ixor
    //   2781: lookupswitch default -> 5065, -1934643419 -> 2764, -1657984059 -> 2808
    //   2808: iload #7
    //   2810: getstatic Perryc.c : I
    //   2813: iflt -> 2827
    //   2816: ldc2_w -100687990
    //   2819: l2i
    //   2820: ldc_w -538146389
    //   2823: ixor
    //   2824: goto -> 2835
    //   2827: ldc2_w 592373906
    //   2830: l2i
    //   2831: ldc_w 1357516619
    //   2834: ixor
    //   2835: ldc2_w 104374200
    //   2838: l2i
    //   2839: ldc_w -1104985097
    //   2842: ixor
    //   2843: ixor
    //   2844: lookupswitch default -> 2872, -1643591058 -> 5133, -406274457 -> 2827
    //   2872: iload #10
    //   2874: isub
    //   2875: getstatic Perryc.c : I
    //   2878: iflt -> 2892
    //   2881: ldc2_w 1003853200
    //   2884: l2i
    //   2885: ldc_w 1149916305
    //   2888: ixor
    //   2889: goto -> 2900
    //   2892: ldc2_w 1121225902
    //   2895: l2i
    //   2896: ldc_w 894262066
    //   2899: ixor
    //   2900: ldc2_w -366297338
    //   2903: l2i
    //   2904: ldc_w 1337006756
    //   2907: ixor
    //   2908: ixor
    //   2909: lookupswitch default -> 5067, -771591618 -> 2936, -624663389 -> 2892
    //   2936: iload #7
    //   2938: getstatic Perryc.0 : I
    //   2941: ifle -> 2955
    //   2944: ldc2_w -753229268
    //   2947: l2i
    //   2948: ldc_w 2086999104
    //   2951: ixor
    //   2952: goto -> 2963
    //   2955: ldc2_w -519653777
    //   2958: l2i
    //   2959: ldc_w -1476170941
    //   2962: ixor
    //   2963: ldc2_w 1359899075
    //   2966: l2i
    //   2967: ldc_w 1731241169
    //   2970: ixor
    //   2971: ixor
    //   2972: lookupswitch default -> 3000, -1723761794 -> 5099, -1442281852 -> 2955
    //   3000: iload #10
    //   3002: isub
    //   3003: imul
    //   3004: getstatic Perryc.1 : I
    //   3007: ifeq -> 3021
    //   3010: ldc2_w 454789398
    //   3013: l2i
    //   3014: ldc_w 405166270
    //   3017: ixor
    //   3018: goto -> 3029
    //   3021: ldc2_w -792858227
    //   3024: l2i
    //   3025: ldc_w -1269349908
    //   3028: ixor
    //   3029: ldc2_w 1657720752
    //   3032: l2i
    //   3033: ldc_w -860844158
    //   3036: ixor
    //   3037: ixor
    //   3038: lookupswitch default -> 3064, -1388080742 -> 5123, -1002800270 -> 3021
    //   3064: iload #9
    //   3066: getstatic Perryc.c : I
    //   3069: iflt -> 3083
    //   3072: ldc2_w -1336674169
    //   3075: l2i
    //   3076: ldc_w -1610523857
    //   3079: ixor
    //   3080: goto -> 3091
    //   3083: ldc2_w -271433555
    //   3086: l2i
    //   3087: ldc_w 276060262
    //   3090: ixor
    //   3091: ldc2_w -1303064007
    //   3094: l2i
    //   3095: ldc_w -1204921572
    //   3098: ixor
    //   3099: ixor
    //   3100: lookupswitch default -> 3128, 199704843 -> 3083, 438839949 -> 5043
    //   3128: iload #11
    //   3130: isub
    //   3131: getstatic Perryc.1 : I
    //   3134: ifeq -> 3148
    //   3137: ldc2_w -678736022
    //   3140: l2i
    //   3141: ldc_w 1343798993
    //   3144: ixor
    //   3145: goto -> 3156
    //   3148: ldc2_w -54542614
    //   3151: l2i
    //   3152: ldc_w 1985571058
    //   3155: ixor
    //   3156: ldc2_w 406105441
    //   3159: l2i
    //   3160: ldc_w -836974989
    //   3163: ixor
    //   3164: ixor
    //   3165: lookupswitch default -> 5015, 1371249321 -> 3148, 1557052682 -> 3192
    //   3192: iload #9
    //   3194: getstatic Perryc.0 : I
    //   3197: ifle -> 3211
    //   3200: ldc2_w 284051060
    //   3203: l2i
    //   3204: ldc_w -1528469571
    //   3207: ixor
    //   3208: goto -> 3219
    //   3211: ldc2_w -1523482817
    //   3214: l2i
    //   3215: ldc_w 2104214814
    //   3218: ixor
    //   3219: ldc2_w 1348287803
    //   3222: l2i
    //   3223: ldc_w 97440838
    //   3226: ixor
    //   3227: ixor
    //   3228: lookupswitch default -> 3256, -1184364249 -> 3211, -510080844 -> 5137
    //   3256: iload #11
    //   3258: isub
    //   3259: imul
    //   3260: iadd
    //   3261: getstatic Perryc.0 : I
    //   3264: ifle -> 3278
    //   3267: ldc2_w -2133850558
    //   3270: l2i
    //   3271: ldc_w 480245897
    //   3274: ixor
    //   3275: goto -> 3286
    //   3278: ldc2_w -660610812
    //   3281: l2i
    //   3282: ldc_w -1531813048
    //   3285: ixor
    //   3286: ldc2_w 979384582
    //   3289: l2i
    //   3290: ldc_w -1289653503
    //   3293: ixor
    //   3294: ixor
    //   3295: lookupswitch default -> 3320, -2018696696 -> 3278, 353285324 -> 5135
    //   3320: iload #4
    //   3322: ifeq -> 3336
    //   3325: ldc2_w -1978117496
    //   3328: l2i
    //   3329: ldc_w -859434839
    //   3332: ixor
    //   3333: goto -> 3344
    //   3336: ldc2_w 316650941
    //   3339: l2i
    //   3340: ldc_w 1409415069
    //   3343: ixor
    //   3344: ldc2_w -62187019
    //   3347: l2i
    //   3348: ldc_w 2141999474
    //   3351: ixor
    //   3352: ixor
    //   3353: tableswitch default -> 3325, -986117466 -> 3376, -986117465 -> 3635
    //   3376: getstatic Perryc.0 : I
    //   3379: ifle -> 3393
    //   3382: ldc2_w -1371333956
    //   3385: l2i
    //   3386: ldc_w 1378228538
    //   3389: ixor
    //   3390: goto -> 3401
    //   3393: ldc2_w -499537120
    //   3396: l2i
    //   3397: ldc_w -1549631354
    //   3400: ixor
    //   3401: ldc2_w -138406927
    //   3404: l2i
    //   3405: ldc_w -1241677435
    //   3408: ixor
    //   3409: ixor
    //   3410: lookupswitch default -> 5037, -1101491726 -> 3393, 61258194 -> 3436
    //   3436: iload #8
    //   3438: getstatic Perryc.c : I
    //   3441: iflt -> 3455
    //   3444: ldc2_w -791943171
    //   3447: l2i
    //   3448: ldc_w 825609614
    //   3451: ixor
    //   3452: goto -> 3463
    //   3455: ldc2_w 710266196
    //   3458: l2i
    //   3459: ldc_w 1570779706
    //   3462: ixor
    //   3463: ldc2_w 1038249359
    //   3466: l2i
    //   3467: ldc_w -1858801439
    //   3470: ixor
    //   3471: ixor
    //   3472: lookupswitch default -> 3500, -1115525105 -> 3455, 1294513949 -> 5101
    //   3500: iload #12
    //   3502: isub
    //   3503: getstatic Perryc.0 : I
    //   3506: ifle -> 3520
    //   3509: ldc2_w 1247229073
    //   3512: l2i
    //   3513: ldc_w 1762510521
    //   3516: ixor
    //   3517: goto -> 3528
    //   3520: ldc2_w -330214256
    //   3523: l2i
    //   3524: ldc_w 189527728
    //   3527: ixor
    //   3528: ldc2_w 467565351
    //   3531: l2i
    //   3532: ldc_w 320128642
    //   3535: ixor
    //   3536: ixor
    //   3537: lookupswitch default -> 3564, 730877837 -> 5149, 924578293 -> 3520
    //   3564: iload #8
    //   3566: getstatic Perryc.c : I
    //   3569: iflt -> 3583
    //   3572: ldc2_w -1100665489
    //   3575: l2i
    //   3576: ldc_w 1886742884
    //   3579: ixor
    //   3580: goto -> 3591
    //   3583: ldc2_w -79656989
    //   3586: l2i
    //   3587: ldc_w 1166568486
    //   3590: ixor
    //   3591: ldc2_w 489664667
    //   3594: l2i
    //   3595: ldc_w 1045526202
    //   3598: ixor
    //   3599: ixor
    //   3600: lookupswitch default -> 5145, -1649005084 -> 3628, -311524822 -> 3583
    //   3628: iload #12
    //   3630: isub
    //   3631: imul
    //   3632: goto -> 3643
    //   3635: ldc2_w 2041329577
    //   3638: l2i
    //   3639: ldc_w 2041329577
    //   3642: ixor
    //   3643: iadd
    //   3644: i2d
    //   3645: getstatic Perryc.1 : I
    //   3648: ifeq -> 3662
    //   3651: ldc2_w 1026619084
    //   3654: l2i
    //   3655: ldc_w -672469391
    //   3658: ixor
    //   3659: goto -> 3670
    //   3662: ldc2_w -153325070
    //   3665: l2i
    //   3666: ldc_w -1977672966
    //   3669: ixor
    //   3670: ldc2_w 1913825611
    //   3673: l2i
    //   3674: ldc_w -2123061210
    //   3677: ixor
    //   3678: ixor
    //   3679: lookupswitch default -> 5109, -1884984731 -> 3704, 431757776 -> 3662
    //   3704: dstore #15
    //   3706: getstatic Perryc.1 : I
    //   3709: ifeq -> 3723
    //   3712: ldc2_w 88478454
    //   3715: l2i
    //   3716: ldc_w -96454121
    //   3719: ixor
    //   3720: goto -> 3731
    //   3723: ldc2_w 402952482
    //   3726: l2i
    //   3727: ldc_w -908846620
    //   3730: ixor
    //   3731: ldc2_w -1065062443
    //   3734: l2i
    //   3735: ldc_w -55333230
    //   3738: ixor
    //   3739: ixor
    //   3740: lookupswitch default -> 3768, -1020139098 -> 5083, -810668486 -> 3723
    //   3768: dload #15
    //   3770: getstatic Perryc.c : I
    //   3773: iflt -> 3787
    //   3776: ldc2_w 279134623
    //   3779: l2i
    //   3780: ldc_w -784602043
    //   3783: ixor
    //   3784: goto -> 3795
    //   3787: ldc2_w -1912284265
    //   3790: l2i
    //   3791: ldc_w -839315492
    //   3794: ixor
    //   3795: ldc2_w -637439988
    //   3798: l2i
    //   3799: ldc_w 1000890046
    //   3802: ixor
    //   3803: ixor
    //   3804: lookupswitch default -> 5019, -1571489031 -> 3832, 540115816 -> 3787
    //   3832: fload_1
    //   3833: getstatic Perryc.0 : I
    //   3836: ifle -> 3850
    //   3839: ldc2_w -384473925
    //   3842: l2i
    //   3843: ldc_w -2130708329
    //   3846: ixor
    //   3847: goto -> 3858
    //   3850: ldc2_w -189109373
    //   3853: l2i
    //   3854: ldc_w -1071579151
    //   3857: ixor
    //   3858: ldc2_w 2119862129
    //   3861: l2i
    //   3862: ldc_w -1851438699
    //   3865: ixor
    //   3866: ixor
    //   3867: lookupswitch default -> 3892, -2045422904 -> 5035, 1906652063 -> 3850
    //   3892: fload_1
    //   3893: fmul
    //   3894: f2d
    //   3895: dcmpg
    //   3896: ifge -> 3910
    //   3899: ldc2_w -1584619019
    //   3902: l2i
    //   3903: ldc_w 137984356
    //   3906: ixor
    //   3907: goto -> 3918
    //   3910: ldc2_w 1307065233
    //   3913: l2i
    //   3914: ldc_w -463609087
    //   3917: ixor
    //   3918: ldc2_w -1912274769
    //   3921: l2i
    //   3922: ldc_w 606991514
    //   3925: ixor
    //   3926: ixor
    //   3927: tableswitch default -> 3899, 60632228 -> 3948, 60632229 -> 4932
    //   3948: getstatic Perryc.1 : I
    //   3951: ifeq -> 3965
    //   3954: ldc2_w -1145763554
    //   3957: l2i
    //   3958: ldc_w -91637212
    //   3961: ixor
    //   3962: goto -> 3973
    //   3965: ldc2_w 2118499006
    //   3968: l2i
    //   3969: ldc_w -876488367
    //   3972: ixor
    //   3973: ldc2_w 361576270
    //   3976: l2i
    //   3977: ldc_w 1954290793
    //   3980: ixor
    //   3981: ixor
    //   3982: lookupswitch default -> 4008, 550344733 -> 5085, 751275275 -> 3965
    //   4008: iload_3
    //   4009: ifeq -> 4023
    //   4012: ldc2_w -58747732
    //   4015: l2i
    //   4016: ldc_w 1571358924
    //   4019: ixor
    //   4020: goto -> 4031
    //   4023: ldc2_w 1514684765
    //   4026: l2i
    //   4027: ldc_w -73474756
    //   4030: ixor
    //   4031: ldc2_w 1371587327
    //   4034: l2i
    //   4035: ldc_w 119576927
    //   4038: ixor
    //   4039: ixor
    //   4040: tableswitch default -> 4012, -147404864 -> 4064, -147404863 -> 4336
    //   4064: getstatic Perryc.0 : I
    //   4067: ifle -> 4081
    //   4070: ldc2_w 262625099
    //   4073: l2i
    //   4074: ldc_w 2050350955
    //   4077: ixor
    //   4078: goto -> 4089
    //   4081: ldc2_w 971972601
    //   4084: l2i
    //   4085: ldc_w -1958976465
    //   4088: ixor
    //   4089: ldc2_w 255563967
    //   4092: l2i
    //   4093: ldc_w -557869771
    //   4096: ixor
    //   4097: ixor
    //   4098: lookupswitch default -> 5131, -1542027862 -> 4081, 1666676316 -> 4124
    //   4124: dload #15
    //   4126: getstatic Perryc.1 : I
    //   4129: ifeq -> 4143
    //   4132: ldc2_w 1439218207
    //   4135: l2i
    //   4136: ldc_w 297702199
    //   4139: ixor
    //   4140: goto -> 4151
    //   4143: ldc2_w -365573435
    //   4146: l2i
    //   4147: ldc_w 953909743
    //   4150: ixor
    //   4151: ldc2_w 352931510
    //   4154: l2i
    //   4155: ldc_w 116381033
    //   4158: ixor
    //   4159: ixor
    //   4160: lookupswitch default -> 4188, -591062295 -> 4143, 1469100791 -> 5025
    //   4188: fload_1
    //   4189: ldc_w 12.178929
    //   4192: invokestatic floatToIntBits : (F)I
    //   4195: ldc_w 2126699749
    //   4198: ixor
    //   4199: invokestatic intBitsToFloat : (I)F
    //   4202: fsub
    //   4203: getstatic Perryc.1 : I
    //   4206: ifeq -> 4220
    //   4209: ldc2_w -889539405
    //   4212: l2i
    //   4213: ldc_w -469767271
    //   4216: ixor
    //   4217: goto -> 4228
    //   4220: ldc2_w -208265380
    //   4223: l2i
    //   4224: ldc_w -1209045081
    //   4227: ixor
    //   4228: ldc2_w -676472861
    //   4231: l2i
    //   4232: ldc_w -1465223410
    //   4235: ixor
    //   4236: ixor
    //   4237: lookupswitch default -> 5055, 998166550 -> 4264, 1443037127 -> 4220
    //   4264: fload_1
    //   4265: ldc_w 9.908893
    //   4268: invokestatic floatToIntBits : (F)I
    //   4271: ldc_w 2124319443
    //   4274: ixor
    //   4275: invokestatic intBitsToFloat : (I)F
    //   4278: fsub
    //   4279: fmul
    //   4280: f2d
    //   4281: dcmpl
    //   4282: iflt -> 4296
    //   4285: ldc2_w 589746311
    //   4288: l2i
    //   4289: ldc_w -529444382
    //   4292: ixor
    //   4293: goto -> 4304
    //   4296: ldc2_w -518457655
    //   4299: l2i
    //   4300: ldc_w 575633327
    //   4303: ixor
    //   4304: ldc2_w 173121421
    //   4307: l2i
    //   4308: ldc_w -105578167
    //   4311: ixor
    //   4312: ixor
    //   4313: tableswitch default -> 4285, 817045409 -> 4336, 817045410 -> 4932
    //   4336: new net/minecraft/util/math/BlockPos
    //   4339: dup
    //   4340: getstatic Perryc.1 : I
    //   4343: ifeq -> 4357
    //   4346: ldc2_w 508521296
    //   4349: l2i
    //   4350: ldc_w -654886022
    //   4353: ixor
    //   4354: goto -> 4365
    //   4357: ldc2_w -1598920508
    //   4360: l2i
    //   4361: ldc_w -1448012413
    //   4364: ixor
    //   4365: ldc2_w -1693522631
    //   4368: l2i
    //   4369: ldc_w -188624701
    //   4372: ixor
    //   4373: ixor
    //   4374: lookupswitch default -> 5125, -1451792944 -> 4357, 1724663997 -> 4400
    //   4400: iload #10
    //   4402: getstatic Perryc.c : I
    //   4405: iflt -> 4419
    //   4408: ldc2_w -1210942659
    //   4411: l2i
    //   4412: ldc_w -932325277
    //   4415: ixor
    //   4416: goto -> 4427
    //   4419: ldc2_w 1838808463
    //   4422: l2i
    //   4423: ldc_w -1952417518
    //   4426: ixor
    //   4427: ldc2_w -1309025513
    //   4430: l2i
    //   4431: ldc_w 1622696606
    //   4434: ixor
    //   4435: ixor
    //   4436: lookupswitch default -> 5127, -1359078697 -> 4419, 930626836 -> 4464
    //   4464: iload #12
    //   4466: getstatic Perryc.0 : I
    //   4469: ifle -> 4483
    //   4472: ldc2_w -1000443858
    //   4475: l2i
    //   4476: ldc_w -769619509
    //   4479: ixor
    //   4480: goto -> 4491
    //   4483: ldc2_w 732779319
    //   4486: l2i
    //   4487: ldc_w 2031168197
    //   4490: ixor
    //   4491: ldc2_w 311813472
    //   4494: l2i
    //   4495: ldc_w 1171476075
    //   4498: ixor
    //   4499: ixor
    //   4500: lookupswitch default -> 5103, 100324089 -> 4528, 1094210286 -> 4483
    //   4528: iload #5
    //   4530: iadd
    //   4531: getstatic Perryc.1 : I
    //   4534: ifeq -> 4548
    //   4537: ldc2_w 1748172559
    //   4540: l2i
    //   4541: ldc_w -399929380
    //   4544: ixor
    //   4545: goto -> 4556
    //   4548: ldc2_w -1751337766
    //   4551: l2i
    //   4552: ldc_w -36480572
    //   4555: ixor
    //   4556: ldc2_w 132507314
    //   4559: l2i
    //   4560: ldc_w -397299397
    //   4563: ixor
    //   4564: ixor
    //   4565: lookupswitch default -> 4592, 302517891 -> 4548, 1873749850 -> 5107
    //   4592: iload #11
    //   4594: getstatic Perryc.1 : I
    //   4597: ifeq -> 4611
    //   4600: ldc2_w -642405188
    //   4603: l2i
    //   4604: ldc_w -1629255196
    //   4607: ixor
    //   4608: goto -> 4619
    //   4611: ldc2_w 1190178511
    //   4614: l2i
    //   4615: ldc_w 1433304587
    //   4618: ixor
    //   4619: ldc2_w 1469487169
    //   4622: l2i
    //   4623: ldc_w -1208862610
    //   4626: ixor
    //   4627: ixor
    //   4628: lookupswitch default -> 4656, -1489861257 -> 5027, -307508678 -> 4611
    //   4656: goto -> 4660
    //   4659: athrow
    //   4660: invokespecial <init> : (III)V
    //   4663: goto -> 4667
    //   4666: athrow
    //   4667: getstatic Perryc.1 : I
    //   4670: ifeq -> 4684
    //   4673: ldc2_w 166038290
    //   4676: l2i
    //   4677: ldc_w -1617843525
    //   4680: ixor
    //   4681: goto -> 4692
    //   4684: ldc2_w 1016180617
    //   4687: l2i
    //   4688: ldc_w 1073051294
    //   4691: ixor
    //   4692: ldc2_w -661286872
    //   4695: l2i
    //   4696: ldc_w -2046124739
    //   4699: ixor
    //   4700: ixor
    //   4701: lookupswitch default -> 4728, -924111684 -> 5039, 1265389497 -> 4684
    //   4728: astore #17
    //   4730: getstatic Perryc.1 : I
    //   4733: ifeq -> 4747
    //   4736: ldc2_w 1595012594
    //   4739: l2i
    //   4740: ldc_w 2113637036
    //   4743: ixor
    //   4744: goto -> 4755
    //   4747: ldc2_w 944268663
    //   4750: l2i
    //   4751: ldc_w 739146231
    //   4754: ixor
    //   4755: ldc2_w 2015419363
    //   4758: l2i
    //   4759: ldc_w -809627448
    //   4762: ixor
    //   4763: ixor
    //   4764: lookupswitch default -> 4792, -1787513739 -> 5077, -403571741 -> 4747
    //   4792: aload #6
    //   4794: getstatic Perryc.0 : I
    //   4797: ifle -> 4811
    //   4800: ldc2_w -934255113
    //   4803: l2i
    //   4804: ldc_w -762358900
    //   4807: ixor
    //   4808: goto -> 4819
    //   4811: ldc2_w -2015019459
    //   4814: l2i
    //   4815: ldc_w 1250276724
    //   4818: ixor
    //   4819: ldc2_w 625444983
    //   4822: l2i
    //   4823: ldc_w -950308932
    //   4826: ixor
    //   4827: ixor
    //   4828: lookupswitch default -> 4856, -860724323 -> 4811, -121384528 -> 5147
    //   4856: aload #17
    //   4858: getstatic Perryc.0 : I
    //   4861: ifle -> 4875
    //   4864: ldc2_w -1241358475
    //   4867: l2i
    //   4868: ldc_w 411717305
    //   4871: ixor
    //   4872: goto -> 4883
    //   4875: ldc2_w -704373090
    //   4878: l2i
    //   4879: ldc_w 2004244217
    //   4882: ixor
    //   4883: ldc2_w -1996448491
    //   4886: l2i
    //   4887: ldc_w -1081091183
    //   4890: ixor
    //   4891: ixor
    //   4892: lookupswitch default -> 4920, -1744349368 -> 5115, -225867856 -> 4875
    //   4920: goto -> 4924
    //   4923: athrow
    //   4924: invokevirtual add : (Ljava/lang/Object;)Z
    //   4927: goto -> 4931
    //   4930: athrow
    //   4931: pop
    //   4932: iinc #12, 1
    //   4935: goto -> 1998
    //   4938: iinc #11, 1
    //   4941: goto -> 1378
    //   4944: iinc #10, 1
    //   4947: goto -> 942
    //   4950: getstatic Perryc.1 : I
    //   4953: ifeq -> 4967
    //   4956: ldc2_w -757287925
    //   4959: l2i
    //   4960: ldc_w -15309782
    //   4963: ixor
    //   4964: goto -> 4975
    //   4967: ldc2_w -720700014
    //   4970: l2i
    //   4971: ldc_w 1611913772
    //   4974: ixor
    //   4975: ldc2_w -232378501
    //   4978: l2i
    //   4979: ldc_w -839675948
    //   4982: ixor
    //   4983: ixor
    //   4984: lookupswitch default -> 5012, 304050318 -> 5139, 702192528 -> 4967
    //   5012: aload #6
    //   5014: areturn
    //   5015: aconst_null
    //   5016: athrow
    //   5017: aconst_null
    //   5018: athrow
    //   5019: aconst_null
    //   5020: athrow
    //   5021: aconst_null
    //   5022: athrow
    //   5023: aconst_null
    //   5024: athrow
    //   5025: aconst_null
    //   5026: athrow
    //   5027: aconst_null
    //   5028: athrow
    //   5029: aconst_null
    //   5030: athrow
    //   5031: aconst_null
    //   5032: athrow
    //   5033: aconst_null
    //   5034: athrow
    //   5035: aconst_null
    //   5036: athrow
    //   5037: aconst_null
    //   5038: athrow
    //   5039: aconst_null
    //   5040: athrow
    //   5041: aconst_null
    //   5042: athrow
    //   5043: aconst_null
    //   5044: athrow
    //   5045: aconst_null
    //   5046: athrow
    //   5047: aconst_null
    //   5048: athrow
    //   5049: aconst_null
    //   5050: athrow
    //   5051: aconst_null
    //   5052: athrow
    //   5053: aconst_null
    //   5054: athrow
    //   5055: aconst_null
    //   5056: athrow
    //   5057: aconst_null
    //   5058: athrow
    //   5059: aconst_null
    //   5060: athrow
    //   5061: aconst_null
    //   5062: athrow
    //   5063: aconst_null
    //   5064: athrow
    //   5065: aconst_null
    //   5066: athrow
    //   5067: aconst_null
    //   5068: athrow
    //   5069: aconst_null
    //   5070: athrow
    //   5071: aconst_null
    //   5072: athrow
    //   5073: aconst_null
    //   5074: athrow
    //   5075: aconst_null
    //   5076: athrow
    //   5077: aconst_null
    //   5078: athrow
    //   5079: aconst_null
    //   5080: athrow
    //   5081: aconst_null
    //   5082: athrow
    //   5083: aconst_null
    //   5084: athrow
    //   5085: aconst_null
    //   5086: athrow
    //   5087: aconst_null
    //   5088: athrow
    //   5089: aconst_null
    //   5090: athrow
    //   5091: aconst_null
    //   5092: athrow
    //   5093: aconst_null
    //   5094: athrow
    //   5095: aconst_null
    //   5096: athrow
    //   5097: aconst_null
    //   5098: athrow
    //   5099: aconst_null
    //   5100: athrow
    //   5101: aconst_null
    //   5102: athrow
    //   5103: aconst_null
    //   5104: athrow
    //   5105: aconst_null
    //   5106: athrow
    //   5107: aconst_null
    //   5108: athrow
    //   5109: aconst_null
    //   5110: athrow
    //   5111: aconst_null
    //   5112: athrow
    //   5113: aconst_null
    //   5114: athrow
    //   5115: aconst_null
    //   5116: athrow
    //   5117: aconst_null
    //   5118: athrow
    //   5119: aconst_null
    //   5120: athrow
    //   5121: aconst_null
    //   5122: athrow
    //   5123: aconst_null
    //   5124: athrow
    //   5125: aconst_null
    //   5126: athrow
    //   5127: aconst_null
    //   5128: athrow
    //   5129: aconst_null
    //   5130: athrow
    //   5131: aconst_null
    //   5132: athrow
    //   5133: aconst_null
    //   5134: athrow
    //   5135: aconst_null
    //   5136: athrow
    //   5137: aconst_null
    //   5138: athrow
    //   5139: aconst_null
    //   5140: athrow
    //   5141: aconst_null
    //   5142: athrow
    //   5143: aconst_null
    //   5144: athrow
    //   5145: aconst_null
    //   5146: athrow
    //   5147: aconst_null
    //   5148: athrow
    //   5149: aconst_null
    //   5150: athrow
    //   5151: aconst_null
    //   5152: athrow
    //   5153: pop
    //   5154: goto -> 24
    //   5157: pop
    //   5158: aconst_null
    //   5159: goto -> 5153
    //   5162: dup
    //   5163: ifnull -> 5153
    //   5166: checkcast java/lang/Throwable
    //   5169: athrow
    //   5170: dup
    //   5171: ifnull -> 5157
    //   5174: checkcast java/lang/Throwable
    //   5177: athrow
    //   5178: aconst_null
    //   5179: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   4730	202	17	l	Lnet/minecraft/util/math/BlockPos;
    //   2126	2809	13	f	F
    //   2562	2373	14	f2	F
    //   3706	1229	15	dist	D
    //   1998	2943	12	y	I
    //   1378	3569	11	z	I
    //   24	4991	0	pos	Lnet/minecraft/util/math/BlockPos;
    //   24	4991	1	r	F
    //   24	4991	2	h	I
    //   24	4991	3	hollow	Z
    //   24	4991	4	sphere	Z
    //   24	4991	5	plus_y	I
    //   162	4853	6	circleblocks	Ljava/util/ArrayList;
    //   358	4657	7	cx	I
    //   554	4461	8	cy	I
    //   750	4265	9	cz	I
    //   942	4073	10	x	I
    // Local variable type table:
    //   start	length	slot	name	signature
    //   162	4853	6	circleblocks	Ljava/util/ArrayList<Lnet/minecraft/util/math/BlockPos;>;
    // Exception table:
    //   from	to	target	type
    //   8	20	5162	java/lang/NumberFormatException
    //   91	98	98	finally
    //   91	98	91	finally
    //   91	98	91	finally
    //   92	98	3	finally
    //   92	98	3	java/lang/UnsupportedOperationException
    //   287	294	294	finally
    //   287	294	287	finally
    //   287	294	3	finally
    //   288	294	287	java/lang/EnumConstantNotPresentException
    //   288	294	294	java/lang/RuntimeException
    //   483	490	490	finally
    //   483	490	490	finally
    //   483	490	490	finally
    //   483	490	490	java/lang/StringIndexOutOfBoundsException
    //   484	490	483	java/lang/AssertionError
    //   679	686	686	finally
    //   679	686	3	java/lang/NegativeArraySizeException
    //   679	686	686	finally
    //   680	686	679	java/lang/IllegalArgumentException
    //   680	686	3	finally
    //   4660	4666	4666	finally
    //   4660	4666	3	finally
    //   4660	4666	3	finally
    //   4660	4666	4666	finally
    //   4660	4666	4666	java/lang/ArrayIndexOutOfBoundsException
    //   4924	4930	4930	finally
    //   4924	4930	4930	finally
    //   4924	4930	3	java/lang/IllegalStateException
    //   4924	4930	4930	finally
    //   4924	4930	4930	java/lang/NumberFormatException
    //   5162	5170	5162	finally
    //   5178	5180	3	java/lang/UnsupportedOperationException
  }
  
  public static BlockPos vec3dToPos(Vec3d vec3d) {
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
  
  public static List possiblePlacePositions(float placeRange, boolean specialEntityCheck, boolean oneDot15) {
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
  
  public static float[] getLegitRotations(Vec3d paramVec3d) {
    return Perry1.6x(null, (int)-252301599L ^ 0xDBA690B5, paramVec3d);
  }
  
  public static boolean isBlockUnSafe(Block paramBlock) {
    return Perry1.5L(null, (int)-2063070872L ^ 0x82BDD5AF, paramBlock);
  }
  
  public static EnumFacing getFirstFacing(BlockPos pos) {
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
  
  public static Block getBlock(BlockPos pos) {
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
  
  public static BlockUtil$BlockResistance getBlockResistance(BlockPos block) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 6387
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 6379
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 6371
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 41
    //   30: ldc2_w 1634630086
    //   33: l2i
    //   34: ldc_w 1505807874
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -2029362221
    //   44: l2i
    //   45: ldc_w -582038141
    //   48: ixor
    //   49: ldc2_w 562460244
    //   52: l2i
    //   53: ldc_w -255513829
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -370283893 -> 6246, 2041481718 -> 41
    //   84: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   87: getstatic Perryc.c : I
    //   90: iflt -> 104
    //   93: ldc2_w 975568176
    //   96: l2i
    //   97: ldc_w -410455888
    //   100: ixor
    //   101: goto -> 112
    //   104: ldc2_w 117231823
    //   107: l2i
    //   108: ldc_w 428642117
    //   111: ixor
    //   112: ldc2_w -1810084979
    //   115: l2i
    //   116: ldc_w -791486383
    //   119: ixor
    //   120: ixor
    //   121: lookupswitch default -> 148, -1721522596 -> 6316, 1379631383 -> 104
    //   148: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   151: getstatic Perryc.1 : I
    //   154: ifeq -> 168
    //   157: ldc2_w 1003899474
    //   160: l2i
    //   161: ldc_w 2025406426
    //   164: ixor
    //   165: goto -> 176
    //   168: ldc2_w 756062062
    //   171: l2i
    //   172: ldc_w -439442133
    //   175: ixor
    //   176: ldc2_w -2099625928
    //   179: l2i
    //   180: ldc_w -316308124
    //   183: ixor
    //   184: ixor
    //   185: lookupswitch default -> 6360, -1490946279 -> 212, 747679956 -> 168
    //   212: aload_0
    //   213: getstatic Perryc.1 : I
    //   216: ifeq -> 230
    //   219: ldc2_w -1724395841
    //   222: l2i
    //   223: ldc_w -1872557091
    //   226: ixor
    //   227: goto -> 238
    //   230: ldc2_w 72570071
    //   233: l2i
    //   234: ldc_w -1778601708
    //   237: ixor
    //   238: ldc2_w -1831093819
    //   241: l2i
    //   242: ldc_w -1574379940
    //   245: ixor
    //   246: ixor
    //   247: lookupswitch default -> 272, 869118550 -> 230, 967287547 -> 6306
    //   272: goto -> 276
    //   275: athrow
    //   276: invokevirtual func_175623_d : (Lnet/minecraft/util/math/BlockPos;)Z
    //   279: goto -> 283
    //   282: athrow
    //   283: ifeq -> 297
    //   286: ldc2_w -1524918897
    //   289: l2i
    //   290: ldc_w 1146669795
    //   293: ixor
    //   294: goto -> 305
    //   297: ldc2_w 1354655315
    //   300: l2i
    //   301: ldc_w -1308804802
    //   304: ixor
    //   305: ldc2_w 1412425265
    //   308: l2i
    //   309: ldc_w 407432197
    //   312: ixor
    //   313: ixor
    //   314: tableswitch default -> 286, -1390127784 -> 336, -1390127783 -> 400
    //   336: getstatic Perryc.1 : I
    //   339: ifeq -> 353
    //   342: ldc2_w 782311135
    //   345: l2i
    //   346: ldc_w -1360333557
    //   349: ixor
    //   350: goto -> 361
    //   353: ldc2_w 957271920
    //   356: l2i
    //   357: ldc_w 1377182289
    //   360: ixor
    //   361: ldc2_w 1812878256
    //   364: l2i
    //   365: ldc_w 1887062311
    //   368: ixor
    //   369: ixor
    //   370: lookupswitch default -> 396, -1673531069 -> 6292, -104251703 -> 353
    //   396: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Blank : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   399: areturn
    //   400: getstatic Perryc.c : I
    //   403: iflt -> 417
    //   406: ldc2_w 1815267014
    //   409: l2i
    //   410: ldc_w 1553146087
    //   413: ixor
    //   414: goto -> 425
    //   417: ldc2_w -347347925
    //   420: l2i
    //   421: ldc_w 2097558402
    //   424: ixor
    //   425: ldc2_w 839672674
    //   428: l2i
    //   429: ldc_w -1272147447
    //   432: ixor
    //   433: ixor
    //   434: lookupswitch default -> 6348, -1233053878 -> 417, 275588802 -> 460
    //   460: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   463: getstatic Perryc.1 : I
    //   466: ifeq -> 480
    //   469: ldc2_w 302320760
    //   472: l2i
    //   473: ldc_w 679231715
    //   476: ixor
    //   477: goto -> 488
    //   480: ldc2_w -1222547036
    //   483: l2i
    //   484: ldc_w -653372565
    //   487: ixor
    //   488: ldc2_w -1275908204
    //   491: l2i
    //   492: ldc_w -864454253
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 524, -623273535 -> 480, 1173559964 -> 6200
    //   524: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   527: getstatic Perryc.0 : I
    //   530: ifle -> 544
    //   533: ldc2_w -2028019469
    //   536: l2i
    //   537: ldc_w -2015308183
    //   540: ixor
    //   541: goto -> 552
    //   544: ldc2_w 964413135
    //   547: l2i
    //   548: ldc_w 1551152010
    //   551: ixor
    //   552: ldc2_w 1710446095
    //   555: l2i
    //   556: ldc_w 1588774897
    //   559: ixor
    //   560: ixor
    //   561: lookupswitch default -> 6318, 1002415972 -> 544, 1582228667 -> 588
    //   588: aload_0
    //   589: getstatic Perryc.0 : I
    //   592: ifle -> 606
    //   595: ldc2_w -1380091463
    //   598: l2i
    //   599: ldc_w -255000983
    //   602: ixor
    //   603: goto -> 614
    //   606: ldc2_w 1348448997
    //   609: l2i
    //   610: ldc_w 530119191
    //   613: ixor
    //   614: ldc2_w -228863306
    //   617: l2i
    //   618: ldc_w -2021749672
    //   621: ixor
    //   622: ixor
    //   623: lookupswitch default -> 6270, 676649278 -> 606, 987895324 -> 648
    //   648: goto -> 652
    //   651: athrow
    //   652: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   655: goto -> 659
    //   658: athrow
    //   659: getstatic Perryc.1 : I
    //   662: ifeq -> 676
    //   665: ldc2_w -397217968
    //   668: l2i
    //   669: ldc_w -1235943754
    //   672: ixor
    //   673: goto -> 684
    //   676: ldc2_w -1394376839
    //   679: l2i
    //   680: ldc_w 33154114
    //   683: ixor
    //   684: ldc2_w -1968938311
    //   687: l2i
    //   688: ldc_w -802187147
    //   691: ixor
    //   692: ixor
    //   693: lookupswitch default -> 720, -13566639 -> 676, 76409642 -> 6352
    //   720: goto -> 724
    //   723: athrow
    //   724: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   729: goto -> 733
    //   732: athrow
    //   733: getstatic Perryc.c : I
    //   736: iflt -> 750
    //   739: ldc2_w -710616374
    //   742: l2i
    //   743: ldc_w -1745027177
    //   746: ixor
    //   747: goto -> 758
    //   750: ldc2_w -231420084
    //   753: l2i
    //   754: ldc_w -1132537235
    //   757: ixor
    //   758: ldc2_w -1972304545
    //   761: l2i
    //   762: ldc_w -219943544
    //   765: ixor
    //   766: ixor
    //   767: lookupswitch default -> 792, 986369418 -> 6204, 2006150933 -> 750
    //   792: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   795: getstatic Perryc.0 : I
    //   798: ifle -> 812
    //   801: ldc2_w -904455552
    //   804: l2i
    //   805: ldc_w 753631134
    //   808: ixor
    //   809: goto -> 820
    //   812: ldc2_w -1209306969
    //   815: l2i
    //   816: ldc_w -2078758819
    //   819: ixor
    //   820: ldc2_w 287594641
    //   823: l2i
    //   824: ldc_w 291930864
    //   827: ixor
    //   828: ixor
    //   829: lookupswitch default -> 6244, -423706753 -> 812, 867238555 -> 856
    //   856: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   859: getstatic Perryc.1 : I
    //   862: ifeq -> 876
    //   865: ldc2_w -1104432940
    //   868: l2i
    //   869: ldc_w -344916858
    //   872: ixor
    //   873: goto -> 884
    //   876: ldc2_w -1445944961
    //   879: l2i
    //   880: ldc_w 1333006132
    //   883: ixor
    //   884: ldc2_w 1352543439
    //   887: l2i
    //   888: ldc_w -1119432584
    //   891: ixor
    //   892: ixor
    //   893: lookupswitch default -> 6300, -1199329051 -> 876, 192697084 -> 920
    //   920: aload_0
    //   921: getstatic Perryc.0 : I
    //   924: ifle -> 938
    //   927: ldc2_w 1269493582
    //   930: l2i
    //   931: ldc_w 1433375058
    //   934: ixor
    //   935: goto -> 946
    //   938: ldc2_w -1495404548
    //   941: l2i
    //   942: ldc_w -1269773998
    //   945: ixor
    //   946: ldc2_w -1610748716
    //   949: l2i
    //   950: ldc_w 319009405
    //   953: ixor
    //   954: ixor
    //   955: lookupswitch default -> 6334, -1841618763 -> 938, -1636599801 -> 980
    //   980: goto -> 984
    //   983: athrow
    //   984: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   987: goto -> 991
    //   990: athrow
    //   991: getstatic Perryc.1 : I
    //   994: ifeq -> 1008
    //   997: ldc2_w 1257471733
    //   1000: l2i
    //   1001: ldc_w -1220096932
    //   1004: ixor
    //   1005: goto -> 1016
    //   1008: ldc2_w 1557024266
    //   1011: l2i
    //   1012: ldc_w 1104464791
    //   1015: ixor
    //   1016: ldc2_w 2019062346
    //   1019: l2i
    //   1020: ldc_w 96099928
    //   1023: ixor
    //   1024: ixor
    //   1025: lookupswitch default -> 1052, -2141741381 -> 6256, 1743881586 -> 1008
    //   1052: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1055: getstatic Perryc.0 : I
    //   1058: ifle -> 1072
    //   1061: ldc2_w -1909596960
    //   1064: l2i
    //   1065: ldc_w -87242990
    //   1068: ixor
    //   1069: goto -> 1080
    //   1072: ldc2_w 1403769653
    //   1075: l2i
    //   1076: ldc_w -119454124
    //   1079: ixor
    //   1080: ldc2_w 1590871924
    //   1083: l2i
    //   1084: ldc_w -866898208
    //   1087: ixor
    //   1088: ixor
    //   1089: lookupswitch default -> 1116, -643715915 -> 1072, -429395354 -> 6208
    //   1116: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1119: getstatic Perryc.1 : I
    //   1122: ifeq -> 1136
    //   1125: ldc2_w 1458968962
    //   1128: l2i
    //   1129: ldc_w -1710653567
    //   1132: ixor
    //   1133: goto -> 1144
    //   1136: ldc2_w 91380230
    //   1139: l2i
    //   1140: ldc_w 1030718904
    //   1143: ixor
    //   1144: ldc2_w -778806022
    //   1147: l2i
    //   1148: ldc_w 1655155332
    //   1151: ixor
    //   1152: ixor
    //   1153: lookupswitch default -> 1180, -1249224149 -> 1136, 2144112765 -> 6282
    //   1180: aload_0
    //   1181: getstatic Perryc.c : I
    //   1184: iflt -> 1198
    //   1187: ldc2_w 1651553353
    //   1190: l2i
    //   1191: ldc_w -429382328
    //   1194: ixor
    //   1195: goto -> 1206
    //   1198: ldc2_w -506737727
    //   1201: l2i
    //   1202: ldc_w 1554504711
    //   1205: ixor
    //   1206: ldc2_w -1543112514
    //   1209: l2i
    //   1210: ldc_w -918900350
    //   1213: ixor
    //   1214: ixor
    //   1215: lookupswitch default -> 6332, -799842566 -> 1240, -383264707 -> 1198
    //   1240: goto -> 1244
    //   1243: athrow
    //   1244: invokevirtual func_176195_g : (Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)F
    //   1247: goto -> 1251
    //   1250: athrow
    //   1251: ldc_w -6.430086
    //   1254: invokestatic floatToIntBits : (F)I
    //   1257: ldc_w 2135802692
    //   1260: ixor
    //   1261: invokestatic intBitsToFloat : (I)F
    //   1264: fcmpl
    //   1265: ifeq -> 1279
    //   1268: ldc2_w -506091082
    //   1271: l2i
    //   1272: ldc_w 1436936296
    //   1275: ixor
    //   1276: goto -> 1287
    //   1279: ldc2_w -786707919
    //   1282: l2i
    //   1283: ldc_w 1701546990
    //   1286: ixor
    //   1287: ldc2_w 263624353
    //   1290: l2i
    //   1291: ldc_w 1619297599
    //   1294: ixor
    //   1295: ixor
    //   1296: tableswitch default -> 1268, -616410560 -> 1320, -616410559 -> 3464
    //   1320: getstatic Perryc.0 : I
    //   1323: ifle -> 1337
    //   1326: ldc2_w 810193583
    //   1329: l2i
    //   1330: ldc_w 403699928
    //   1333: ixor
    //   1334: goto -> 1345
    //   1337: ldc2_w -1812191955
    //   1340: l2i
    //   1341: ldc_w -1009051032
    //   1344: ixor
    //   1345: ldc2_w -1867499149
    //   1348: l2i
    //   1349: ldc_w 1622436867
    //   1352: ixor
    //   1353: ixor
    //   1354: lookupswitch default -> 1380, -1890044436 -> 1337, -666812665 -> 6288
    //   1380: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1383: getstatic Perryc.1 : I
    //   1386: ifeq -> 1400
    //   1389: ldc2_w -817263961
    //   1392: l2i
    //   1393: ldc_w 2141563084
    //   1396: ixor
    //   1397: goto -> 1408
    //   1400: ldc2_w -330809528
    //   1403: l2i
    //   1404: ldc_w 76991510
    //   1407: ixor
    //   1408: ldc2_w 504296004
    //   1411: l2i
    //   1412: ldc_w -223797035
    //   1415: ixor
    //   1416: ixor
    //   1417: lookupswitch default -> 6272, 75047375 -> 1444, 1548480762 -> 1400
    //   1444: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1447: getstatic Perryc.c : I
    //   1450: iflt -> 1464
    //   1453: ldc2_w -1893078823
    //   1456: l2i
    //   1457: ldc_w 791924601
    //   1460: ixor
    //   1461: goto -> 1472
    //   1464: ldc2_w -1706352589
    //   1467: l2i
    //   1468: ldc_w -1262116224
    //   1471: ixor
    //   1472: ldc2_w -1658564674
    //   1475: l2i
    //   1476: ldc_w 659738345
    //   1479: ixor
    //   1480: ixor
    //   1481: lookupswitch default -> 6248, -1795685404 -> 1508, 443328247 -> 1464
    //   1508: aload_0
    //   1509: getstatic Perryc.c : I
    //   1512: iflt -> 1526
    //   1515: ldc2_w -197763191
    //   1518: l2i
    //   1519: ldc_w 1863833266
    //   1522: ixor
    //   1523: goto -> 1534
    //   1526: ldc2_w -564757154
    //   1529: l2i
    //   1530: ldc_w -204571713
    //   1533: ixor
    //   1534: ldc2_w 2041673376
    //   1537: l2i
    //   1538: ldc_w 1471563727
    //   1541: ixor
    //   1542: ixor
    //   1543: lookupswitch default -> 6284, -1255753644 -> 1526, 60766094 -> 1568
    //   1568: goto -> 1572
    //   1571: athrow
    //   1572: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   1575: goto -> 1579
    //   1578: athrow
    //   1579: getstatic Perryc.c : I
    //   1582: iflt -> 1596
    //   1585: ldc2_w -1675483621
    //   1588: l2i
    //   1589: ldc_w -422411479
    //   1592: ixor
    //   1593: goto -> 1604
    //   1596: ldc2_w -1234956597
    //   1599: l2i
    //   1600: ldc_w -113977619
    //   1603: ixor
    //   1604: ldc2_w -1753552131
    //   1607: l2i
    //   1608: ldc_w 837206345
    //   1611: ixor
    //   1612: ixor
    //   1613: lookupswitch default -> 1640, -596865402 -> 6296, 512227810 -> 1596
    //   1640: goto -> 1644
    //   1643: athrow
    //   1644: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   1649: goto -> 1653
    //   1652: athrow
    //   1653: getstatic Perryc.1 : I
    //   1656: ifeq -> 1670
    //   1659: ldc2_w -2060711241
    //   1662: l2i
    //   1663: ldc_w -1270205990
    //   1666: ixor
    //   1667: goto -> 1678
    //   1670: ldc2_w -1730824571
    //   1673: l2i
    //   1674: ldc_w 2045830632
    //   1677: ixor
    //   1678: ldc2_w -1369466429
    //   1681: l2i
    //   1682: ldc_w 972246717
    //   1685: ixor
    //   1686: ixor
    //   1687: lookupswitch default -> 1712, -1496650733 -> 6264, 264070966 -> 1670
    //   1712: getstatic net/minecraft/init/Blocks.field_150343_Z : Lnet/minecraft/block/Block;
    //   1715: getstatic Perryc.1 : I
    //   1718: ifeq -> 1732
    //   1721: ldc2_w 661377535
    //   1724: l2i
    //   1725: ldc_w -847416541
    //   1728: ixor
    //   1729: goto -> 1740
    //   1732: ldc2_w -1583622754
    //   1735: l2i
    //   1736: ldc_w 14267126
    //   1739: ixor
    //   1740: ldc2_w -152067574
    //   1743: l2i
    //   1744: ldc_w 1536402884
    //   1747: ixor
    //   1748: ixor
    //   1749: lookupswitch default -> 6258, 205414566 -> 1776, 1198171410 -> 1732
    //   1776: goto -> 1780
    //   1779: athrow
    //   1780: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1783: goto -> 1787
    //   1786: athrow
    //   1787: ifne -> 1801
    //   1790: ldc2_w 10768450
    //   1793: l2i
    //   1794: ldc_w -437832324
    //   1797: ixor
    //   1798: goto -> 1809
    //   1801: ldc2_w -730648184
    //   1804: l2i
    //   1805: ldc_w 825250999
    //   1808: ixor
    //   1809: ldc2_w 1536160914
    //   1812: l2i
    //   1813: ldc_w -84839308
    //   1816: ixor
    //   1817: ixor
    //   1818: tableswitch default -> 1790, 1144907224 -> 1840, 1144907225 -> 3464
    //   1840: getstatic Perryc.c : I
    //   1843: iflt -> 1857
    //   1846: ldc2_w -1924722860
    //   1849: l2i
    //   1850: ldc_w 1713549191
    //   1853: ixor
    //   1854: goto -> 1865
    //   1857: ldc2_w 2136180744
    //   1860: l2i
    //   1861: ldc_w 771954315
    //   1864: ixor
    //   1865: ldc2_w -733888411
    //   1868: l2i
    //   1869: ldc_w -669757350
    //   1872: ixor
    //   1873: ixor
    //   1874: lookupswitch default -> 1900, -416272148 -> 6276, 1037867193 -> 1857
    //   1900: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   1903: getstatic Perryc.c : I
    //   1906: iflt -> 1920
    //   1909: ldc2_w 1637278995
    //   1912: l2i
    //   1913: ldc_w -678443975
    //   1916: ixor
    //   1917: goto -> 1928
    //   1920: ldc2_w 490481062
    //   1923: l2i
    //   1924: ldc_w -1935174712
    //   1927: ixor
    //   1928: ldc2_w 210011263
    //   1931: l2i
    //   1932: ldc_w -530656394
    //   1935: ixor
    //   1936: ixor
    //   1937: lookupswitch default -> 6240, 1522759203 -> 1920, 2101469543 -> 1964
    //   1964: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   1967: getstatic Perryc.c : I
    //   1970: iflt -> 1984
    //   1973: ldc2_w 654062094
    //   1976: l2i
    //   1977: ldc_w -1125644555
    //   1980: ixor
    //   1981: goto -> 1992
    //   1984: ldc2_w -1172888011
    //   1987: l2i
    //   1988: ldc_w -463509919
    //   1991: ixor
    //   1992: ldc2_w 403754686
    //   1995: l2i
    //   1996: ldc_w 1082829914
    //   1999: ixor
    //   2000: ixor
    //   2001: lookupswitch default -> 6322, -1030859233 -> 1984, 114434736 -> 2028
    //   2028: aload_0
    //   2029: getstatic Perryc.0 : I
    //   2032: ifle -> 2046
    //   2035: ldc2_w 1522793163
    //   2038: l2i
    //   2039: ldc_w -1875467091
    //   2042: ixor
    //   2043: goto -> 2054
    //   2046: ldc2_w -1130979924
    //   2049: l2i
    //   2050: ldc_w -1143563252
    //   2053: ixor
    //   2054: ldc2_w 16589082
    //   2057: l2i
    //   2058: ldc_w 1905573092
    //   2061: ixor
    //   2062: ixor
    //   2063: lookupswitch default -> 2088, -1147354216 -> 6344, 1149584487 -> 2046
    //   2088: goto -> 2092
    //   2091: athrow
    //   2092: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   2095: goto -> 2099
    //   2098: athrow
    //   2099: getstatic Perryc.1 : I
    //   2102: ifeq -> 2116
    //   2105: ldc2_w -593639808
    //   2108: l2i
    //   2109: ldc_w -1540168505
    //   2112: ixor
    //   2113: goto -> 2124
    //   2116: ldc2_w -1014857244
    //   2119: l2i
    //   2120: ldc_w 431772540
    //   2123: ixor
    //   2124: ldc2_w -1163779891
    //   2127: l2i
    //   2128: ldc_w 1553202631
    //   2131: ixor
    //   2132: ixor
    //   2133: lookupswitch default -> 2160, -1633747123 -> 6358, 634570016 -> 2116
    //   2160: goto -> 2164
    //   2163: athrow
    //   2164: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   2169: goto -> 2173
    //   2172: athrow
    //   2173: getstatic Perryc.0 : I
    //   2176: ifle -> 2190
    //   2179: ldc2_w -1641838751
    //   2182: l2i
    //   2183: ldc_w 1704120453
    //   2186: ixor
    //   2187: goto -> 2198
    //   2190: ldc2_w 1051370450
    //   2193: l2i
    //   2194: ldc_w 757190997
    //   2197: ixor
    //   2198: ldc2_w 1569632869
    //   2201: l2i
    //   2202: ldc_w 1699174883
    //   2205: ixor
    //   2206: ixor
    //   2207: lookupswitch default -> 2232, -1015497630 -> 6320, 725854398 -> 2190
    //   2232: getstatic net/minecraft/init/Blocks.field_150467_bQ : Lnet/minecraft/block/Block;
    //   2235: getstatic Perryc.0 : I
    //   2238: ifle -> 2252
    //   2241: ldc2_w 589786400
    //   2244: l2i
    //   2245: ldc_w -108827390
    //   2248: ixor
    //   2249: goto -> 2260
    //   2252: ldc2_w 477283198
    //   2255: l2i
    //   2256: ldc_w 1442893869
    //   2259: ixor
    //   2260: ldc2_w 1754854072
    //   2263: l2i
    //   2264: ldc_w -1634586483
    //   2267: ixor
    //   2268: ixor
    //   2269: lookupswitch default -> 2296, 749650455 -> 6286, 946719263 -> 2252
    //   2296: goto -> 2300
    //   2299: athrow
    //   2300: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2303: goto -> 2307
    //   2306: athrow
    //   2307: ifne -> 2321
    //   2310: ldc2_w -1137634136
    //   2313: l2i
    //   2314: ldc_w 159970879
    //   2317: ixor
    //   2318: goto -> 2329
    //   2321: ldc2_w 792293177
    //   2324: l2i
    //   2325: ldc_w -1702851159
    //   2328: ixor
    //   2329: ldc2_w 8718428
    //   2332: l2i
    //   2333: ldc_w -1416630576
    //   2336: ixor
    //   2337: ixor
    //   2338: tableswitch default -> 2310, 515048475 -> 2360, 515048476 -> 3464
    //   2360: getstatic Perryc.1 : I
    //   2363: ifeq -> 2377
    //   2366: ldc2_w -1058907686
    //   2369: l2i
    //   2370: ldc_w -2133421336
    //   2373: ixor
    //   2374: goto -> 2385
    //   2377: ldc2_w -1569203101
    //   2380: l2i
    //   2381: ldc_w 1387171966
    //   2384: ixor
    //   2385: ldc2_w -830554738
    //   2388: l2i
    //   2389: ldc_w -245874554
    //   2392: ixor
    //   2393: ixor
    //   2394: lookupswitch default -> 2420, 2091986633 -> 2377, 2131899962 -> 6198
    //   2420: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2423: getstatic Perryc.1 : I
    //   2426: ifeq -> 2440
    //   2429: ldc2_w -1675972588
    //   2432: l2i
    //   2433: ldc_w -1796362942
    //   2436: ixor
    //   2437: goto -> 2448
    //   2440: ldc2_w -1337712308
    //   2443: l2i
    //   2444: ldc_w 713158086
    //   2447: ixor
    //   2448: ldc2_w 1299854801
    //   2451: l2i
    //   2452: ldc_w -1022904516
    //   2455: ixor
    //   2456: ixor
    //   2457: lookupswitch default -> 2484, -2037735493 -> 6302, 1124686760 -> 2440
    //   2484: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   2487: getstatic Perryc.0 : I
    //   2490: ifle -> 2504
    //   2493: ldc2_w -416849750
    //   2496: l2i
    //   2497: ldc_w -552575657
    //   2500: ixor
    //   2501: goto -> 2512
    //   2504: ldc2_w 1533663826
    //   2507: l2i
    //   2508: ldc_w 82819265
    //   2511: ixor
    //   2512: ldc2_w 1394439523
    //   2515: l2i
    //   2516: ldc_w 1023578990
    //   2519: ixor
    //   2520: ixor
    //   2521: lookupswitch default -> 2548, 560132570 -> 2504, 1445518320 -> 6278
    //   2548: aload_0
    //   2549: getstatic Perryc.1 : I
    //   2552: ifeq -> 2566
    //   2555: ldc2_w 1569072335
    //   2558: l2i
    //   2559: ldc_w -450470759
    //   2562: ixor
    //   2563: goto -> 2574
    //   2566: ldc2_w -1737465324
    //   2569: l2i
    //   2570: ldc_w -1333743302
    //   2573: ixor
    //   2574: ldc2_w 1016299361
    //   2577: l2i
    //   2578: ldc_w -707101024
    //   2581: ixor
    //   2582: ixor
    //   2583: lookupswitch default -> 2608, -1524799894 -> 2566, 1374255511 -> 6210
    //   2608: goto -> 2612
    //   2611: athrow
    //   2612: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   2615: goto -> 2619
    //   2618: athrow
    //   2619: getstatic Perryc.0 : I
    //   2622: ifle -> 2636
    //   2625: ldc2_w 1759338671
    //   2628: l2i
    //   2629: ldc_w 274519156
    //   2632: ixor
    //   2633: goto -> 2644
    //   2636: ldc2_w -1953055362
    //   2639: l2i
    //   2640: ldc_w -813906896
    //   2643: ixor
    //   2644: ldc2_w 1802527130
    //   2647: l2i
    //   2648: ldc_w 1421473242
    //   2651: ixor
    //   2652: ixor
    //   2653: lookupswitch default -> 6356, 1195909275 -> 2636, 2065952014 -> 2680
    //   2680: goto -> 2684
    //   2683: athrow
    //   2684: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   2689: goto -> 2693
    //   2692: athrow
    //   2693: getstatic Perryc.1 : I
    //   2696: ifeq -> 2710
    //   2699: ldc2_w -1814328167
    //   2702: l2i
    //   2703: ldc_w 1984020334
    //   2706: ixor
    //   2707: goto -> 2718
    //   2710: ldc2_w -1547644381
    //   2713: l2i
    //   2714: ldc_w 446876756
    //   2717: ixor
    //   2718: ldc2_w 393160180
    //   2721: l2i
    //   2722: ldc_w 432489537
    //   2725: ixor
    //   2726: ixor
    //   2727: lookupswitch default -> 2752, -349023678 -> 6212, 986634544 -> 2710
    //   2752: getstatic net/minecraft/init/Blocks.field_150381_bn : Lnet/minecraft/block/Block;
    //   2755: getstatic Perryc.c : I
    //   2758: iflt -> 2772
    //   2761: ldc2_w 1505396441
    //   2764: l2i
    //   2765: ldc_w 1941563584
    //   2768: ixor
    //   2769: goto -> 2780
    //   2772: ldc2_w 673428650
    //   2775: l2i
    //   2776: ldc_w 835014062
    //   2779: ixor
    //   2780: ldc2_w 1985815245
    //   2783: l2i
    //   2784: ldc_w -900345323
    //   2787: ixor
    //   2788: ixor
    //   2789: lookupswitch default -> 6308, -1777623359 -> 2772, -1511126564 -> 2816
    //   2816: goto -> 2820
    //   2819: athrow
    //   2820: invokevirtual equals : (Ljava/lang/Object;)Z
    //   2823: goto -> 2827
    //   2826: athrow
    //   2827: ifne -> 2841
    //   2830: ldc2_w 1989276679
    //   2833: l2i
    //   2834: ldc_w -981066238
    //   2837: ixor
    //   2838: goto -> 2849
    //   2841: ldc2_w -1140779181
    //   2844: l2i
    //   2845: ldc_w 253164887
    //   2848: ixor
    //   2849: ldc2_w 202520282
    //   2852: l2i
    //   2853: ldc_w -199036433
    //   2856: ixor
    //   2857: ixor
    //   2858: tableswitch default -> 2830, 1260858672 -> 2880, 1260858673 -> 3464
    //   2880: getstatic Perryc.1 : I
    //   2883: ifeq -> 2897
    //   2886: ldc2_w 2145505890
    //   2889: l2i
    //   2890: ldc_w 218283385
    //   2893: ixor
    //   2894: goto -> 2905
    //   2897: ldc2_w -2076351249
    //   2900: l2i
    //   2901: ldc_w -1846320913
    //   2904: ixor
    //   2905: ldc2_w -968474499
    //   2908: l2i
    //   2909: ldc_w -1854901498
    //   2912: ixor
    //   2913: ixor
    //   2914: lookupswitch default -> 2940, 634739808 -> 6290, 1265971938 -> 2897
    //   2940: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   2943: getstatic Perryc.1 : I
    //   2946: ifeq -> 2960
    //   2949: ldc2_w 1791224403
    //   2952: l2i
    //   2953: ldc_w -1749133538
    //   2956: ixor
    //   2957: goto -> 2968
    //   2960: ldc2_w -2085838985
    //   2963: l2i
    //   2964: ldc_w -213121764
    //   2967: ixor
    //   2968: ldc2_w -1702437422
    //   2971: l2i
    //   2972: ldc_w 2020096835
    //   2975: ixor
    //   2976: ixor
    //   2977: lookupswitch default -> 3004, -1987627330 -> 2960, 529751004 -> 6260
    //   3004: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   3007: getstatic Perryc.1 : I
    //   3010: ifeq -> 3024
    //   3013: ldc2_w 622464302
    //   3016: l2i
    //   3017: ldc_w 427758524
    //   3020: ixor
    //   3021: goto -> 3032
    //   3024: ldc2_w -1597666675
    //   3027: l2i
    //   3028: ldc_w 242916195
    //   3031: ixor
    //   3032: ldc2_w -702379790
    //   3035: l2i
    //   3036: ldc_w -1577877840
    //   3039: ixor
    //   3040: ixor
    //   3041: lookupswitch default -> 3068, 178785190 -> 3024, 1270147280 -> 6262
    //   3068: aload_0
    //   3069: getstatic Perryc.c : I
    //   3072: iflt -> 3086
    //   3075: ldc2_w 610187975
    //   3078: l2i
    //   3079: ldc_w 1599030715
    //   3082: ixor
    //   3083: goto -> 3094
    //   3086: ldc2_w 1494026440
    //   3089: l2i
    //   3090: ldc_w -69091523
    //   3093: ixor
    //   3094: ldc2_w -1288031436
    //   3097: l2i
    //   3098: ldc_w 78022206
    //   3101: ixor
    //   3102: ixor
    //   3103: lookupswitch default -> 3128, -863155594 -> 6340, 1387691298 -> 3086
    //   3128: goto -> 3132
    //   3131: athrow
    //   3132: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   3135: goto -> 3139
    //   3138: athrow
    //   3139: getstatic Perryc.c : I
    //   3142: iflt -> 3156
    //   3145: ldc2_w -1963078700
    //   3148: l2i
    //   3149: ldc_w 1354736224
    //   3152: ixor
    //   3153: goto -> 3164
    //   3156: ldc2_w 1171235946
    //   3159: l2i
    //   3160: ldc_w -1930437992
    //   3163: ixor
    //   3164: ldc2_w 2047884262
    //   3167: l2i
    //   3168: ldc_w 1762967918
    //   3171: ixor
    //   3172: ixor
    //   3173: lookupswitch default -> 3200, -918121668 -> 6346, -69376934 -> 3156
    //   3200: goto -> 3204
    //   3203: athrow
    //   3204: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   3209: goto -> 3213
    //   3212: athrow
    //   3213: getstatic Perryc.1 : I
    //   3216: ifeq -> 3230
    //   3219: ldc2_w -1555285812
    //   3222: l2i
    //   3223: ldc_w 1615294159
    //   3226: ixor
    //   3227: goto -> 3238
    //   3230: ldc2_w 2087447681
    //   3233: l2i
    //   3234: ldc_w 1258665586
    //   3237: ixor
    //   3238: ldc2_w -918637946
    //   3241: l2i
    //   3242: ldc_w 1758430712
    //   3245: ixor
    //   3246: ixor
    //   3247: lookupswitch default -> 6328, -1767936627 -> 3272, 1660576125 -> 3230
    //   3272: getstatic net/minecraft/init/Blocks.field_150477_bB : Lnet/minecraft/block/Block;
    //   3275: getstatic Perryc.c : I
    //   3278: iflt -> 3292
    //   3281: ldc2_w -563640186
    //   3284: l2i
    //   3285: ldc_w 1144216126
    //   3288: ixor
    //   3289: goto -> 3300
    //   3292: ldc2_w -1115257421
    //   3295: l2i
    //   3296: ldc_w 2117820263
    //   3299: ixor
    //   3300: ldc2_w 726963670
    //   3303: l2i
    //   3304: ldc_w 1340799668
    //   3307: ixor
    //   3308: ixor
    //   3309: lookupswitch default -> 3336, -18170406 -> 6228, 871164462 -> 3292
    //   3336: goto -> 3340
    //   3339: athrow
    //   3340: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3343: goto -> 3347
    //   3346: athrow
    //   3347: ifne -> 3361
    //   3350: ldc2_w -2014925956
    //   3353: l2i
    //   3354: ldc_w -1666212427
    //   3357: ixor
    //   3358: goto -> 3369
    //   3361: ldc2_w 1320597182
    //   3364: l2i
    //   3365: ldc_w 1442807928
    //   3368: ixor
    //   3369: ldc2_w 1496891087
    //   3372: l2i
    //   3373: ldc_w 404094865
    //   3376: ixor
    //   3377: ixor
    //   3378: tableswitch default -> 3350, 1516533655 -> 3400, 1516533656 -> 3464
    //   3400: getstatic Perryc.1 : I
    //   3403: ifeq -> 3417
    //   3406: ldc2_w 965871574
    //   3409: l2i
    //   3410: ldc_w -1331147071
    //   3413: ixor
    //   3414: goto -> 3425
    //   3417: ldc2_w -1158694147
    //   3420: l2i
    //   3421: ldc_w 35976565
    //   3424: ixor
    //   3425: ldc2_w -998207997
    //   3428: l2i
    //   3429: ldc_w 752751912
    //   3432: ixor
    //   3433: ixor
    //   3434: lookupswitch default -> 3460, 1020713542 -> 3417, 1633997372 -> 6232
    //   3460: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Breakable : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   3463: areturn
    //   3464: getstatic Perryc.1 : I
    //   3467: ifeq -> 3481
    //   3470: ldc2_w 2109756736
    //   3473: l2i
    //   3474: ldc_w 1922952255
    //   3477: ixor
    //   3478: goto -> 3489
    //   3481: ldc2_w 1404591165
    //   3484: l2i
    //   3485: ldc_w -769654777
    //   3488: ixor
    //   3489: ldc2_w 245066034
    //   3492: l2i
    //   3493: ldc_w 1839190089
    //   3496: ixor
    //   3497: ixor
    //   3498: lookupswitch default -> 6342, -493034175 -> 3524, 1817772036 -> 3481
    //   3524: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   3527: getstatic Perryc.1 : I
    //   3530: ifeq -> 3544
    //   3533: ldc2_w -1257182722
    //   3536: l2i
    //   3537: ldc_w -1268525387
    //   3540: ixor
    //   3541: goto -> 3552
    //   3544: ldc2_w 1436276321
    //   3547: l2i
    //   3548: ldc_w -1547714685
    //   3551: ixor
    //   3552: ldc2_w -1986836057
    //   3555: l2i
    //   3556: ldc_w -1529928862
    //   3559: ixor
    //   3560: ixor
    //   3561: lookupswitch default -> 3588, -522371523 -> 3544, 741299598 -> 6238
    //   3588: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   3591: getstatic Perryc.0 : I
    //   3594: ifle -> 3608
    //   3597: ldc2_w -610527648
    //   3600: l2i
    //   3601: ldc_w -1510205089
    //   3604: ixor
    //   3605: goto -> 3616
    //   3608: ldc2_w 2108477940
    //   3611: l2i
    //   3612: ldc_w 1996217652
    //   3615: ixor
    //   3616: ldc2_w 1345458708
    //   3619: l2i
    //   3620: ldc_w 1368749114
    //   3623: ixor
    //   3624: ixor
    //   3625: lookupswitch default -> 6202, 183528174 -> 3652, 2143774993 -> 3608
    //   3652: aload_0
    //   3653: getstatic Perryc.1 : I
    //   3656: ifeq -> 3670
    //   3659: ldc2_w -432189987
    //   3662: l2i
    //   3663: ldc_w 1819181995
    //   3666: ixor
    //   3667: goto -> 3678
    //   3670: ldc2_w 1584763597
    //   3673: l2i
    //   3674: ldc_w -877793260
    //   3677: ixor
    //   3678: ldc2_w 783790125
    //   3681: l2i
    //   3682: ldc_w 1291320214
    //   3685: ixor
    //   3686: ixor
    //   3687: lookupswitch default -> 3712, -401373747 -> 6330, 396886828 -> 3670
    //   3712: goto -> 3716
    //   3715: athrow
    //   3716: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   3719: goto -> 3723
    //   3722: athrow
    //   3723: getstatic Perryc.0 : I
    //   3726: ifle -> 3740
    //   3729: ldc2_w 1569255025
    //   3732: l2i
    //   3733: ldc_w 1459532527
    //   3736: ixor
    //   3737: goto -> 3748
    //   3740: ldc2_w -620760756
    //   3743: l2i
    //   3744: ldc_w 269837762
    //   3747: ixor
    //   3748: ldc2_w -790709048
    //   3751: l2i
    //   3752: ldc_w 1157821236
    //   3755: ixor
    //   3756: ixor
    //   3757: lookupswitch default -> 3784, -1633021086 -> 6310, 1686133492 -> 3740
    //   3784: goto -> 3788
    //   3787: athrow
    //   3788: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   3793: goto -> 3797
    //   3796: athrow
    //   3797: getstatic Perryc.1 : I
    //   3800: ifeq -> 3814
    //   3803: ldc2_w -1193726448
    //   3806: l2i
    //   3807: ldc_w 89394418
    //   3810: ixor
    //   3811: goto -> 3822
    //   3814: ldc2_w -1058025819
    //   3817: l2i
    //   3818: ldc_w 36722119
    //   3821: ixor
    //   3822: ldc2_w -1037519089
    //   3825: l2i
    //   3826: ldc_w 206929326
    //   3829: ixor
    //   3830: ixor
    //   3831: lookupswitch default -> 6234, 211964355 -> 3856, 1945167939 -> 3814
    //   3856: getstatic net/minecraft/init/Blocks.field_150343_Z : Lnet/minecraft/block/Block;
    //   3859: getstatic Perryc.c : I
    //   3862: iflt -> 3876
    //   3865: ldc2_w -579878083
    //   3868: l2i
    //   3869: ldc_w -1715509754
    //   3872: ixor
    //   3873: goto -> 3884
    //   3876: ldc2_w 829917620
    //   3879: l2i
    //   3880: ldc_w -50453010
    //   3883: ixor
    //   3884: ldc2_w 545821654
    //   3887: l2i
    //   3888: ldc_w -631177135
    //   3891: ixor
    //   3892: ixor
    //   3893: lookupswitch default -> 6312, -1103546692 -> 3876, 929054685 -> 3920
    //   3920: goto -> 3924
    //   3923: athrow
    //   3924: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3927: goto -> 3931
    //   3930: athrow
    //   3931: ifne -> 3945
    //   3934: ldc2_w -769438291
    //   3937: l2i
    //   3938: ldc_w -282279960
    //   3941: ixor
    //   3942: goto -> 3953
    //   3945: ldc2_w -1553424368
    //   3948: l2i
    //   3949: ldc_w -1637395884
    //   3952: ixor
    //   3953: ldc2_w -1142446423
    //   3956: l2i
    //   3957: ldc_w 2033834616
    //   3960: ixor
    //   3961: ixor
    //   3962: tableswitch default -> 3934, -3043692 -> 3984, -3043691 -> 5544
    //   3984: getstatic Perryc.c : I
    //   3987: iflt -> 4001
    //   3990: ldc2_w -850380206
    //   3993: l2i
    //   3994: ldc_w -1512971903
    //   3997: ixor
    //   3998: goto -> 4009
    //   4001: ldc2_w -191689783
    //   4004: l2i
    //   4005: ldc_w -873522225
    //   4008: ixor
    //   4009: ldc2_w -34970521
    //   4012: l2i
    //   4013: ldc_w -1620873008
    //   4016: ixor
    //   4017: ixor
    //   4018: lookupswitch default -> 6298, 168349540 -> 4001, 1576338609 -> 4044
    //   4044: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   4047: getstatic Perryc.c : I
    //   4050: iflt -> 4064
    //   4053: ldc2_w 26376058
    //   4056: l2i
    //   4057: ldc_w 1981671581
    //   4060: ixor
    //   4061: goto -> 4072
    //   4064: ldc2_w 1843872877
    //   4067: l2i
    //   4068: ldc_w -2029710208
    //   4071: ixor
    //   4072: ldc2_w -1440715499
    //   4075: l2i
    //   4076: ldc_w -1520867728
    //   4079: ixor
    //   4080: ixor
    //   4081: lookupswitch default -> 4108, -1150083636 -> 4064, 2029425794 -> 6222
    //   4108: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   4111: getstatic Perryc.1 : I
    //   4114: ifeq -> 4128
    //   4117: ldc2_w -1000240318
    //   4120: l2i
    //   4121: ldc_w -506809623
    //   4124: ixor
    //   4125: goto -> 4136
    //   4128: ldc2_w -1554124193
    //   4131: l2i
    //   4132: ldc_w -1059038787
    //   4135: ixor
    //   4136: ldc2_w -409510584
    //   4139: l2i
    //   4140: ldc_w -2040286085
    //   4143: ixor
    //   4144: ixor
    //   4145: lookupswitch default -> 6326, 38355665 -> 4172, 1147130008 -> 4128
    //   4172: aload_0
    //   4173: getstatic Perryc.c : I
    //   4176: iflt -> 4190
    //   4179: ldc2_w 1704571329
    //   4182: l2i
    //   4183: ldc_w -1146960769
    //   4186: ixor
    //   4187: goto -> 4198
    //   4190: ldc2_w 1099715743
    //   4193: l2i
    //   4194: ldc_w 625522243
    //   4197: ixor
    //   4198: ldc2_w -232475724
    //   4201: l2i
    //   4202: ldc_w 155604816
    //   4205: ixor
    //   4206: ixor
    //   4207: lookupswitch default -> 6242, -1616509384 -> 4232, 626626906 -> 4190
    //   4232: goto -> 4236
    //   4235: athrow
    //   4236: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   4239: goto -> 4243
    //   4242: athrow
    //   4243: getstatic Perryc.0 : I
    //   4246: ifle -> 4260
    //   4249: ldc2_w -37142023
    //   4252: l2i
    //   4253: ldc_w 745444972
    //   4256: ixor
    //   4257: goto -> 4268
    //   4260: ldc2_w 936460546
    //   4263: l2i
    //   4264: ldc_w 993637205
    //   4267: ixor
    //   4268: ldc2_w 1064999244
    //   4271: l2i
    //   4272: ldc_w 1254669670
    //   4275: ixor
    //   4276: ixor
    //   4277: lookupswitch default -> 6324, -1542065217 -> 4260, 2035996285 -> 4304
    //   4304: goto -> 4308
    //   4307: athrow
    //   4308: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   4313: goto -> 4317
    //   4316: athrow
    //   4317: getstatic Perryc.0 : I
    //   4320: ifle -> 4334
    //   4323: ldc2_w -1611086466
    //   4326: l2i
    //   4327: ldc_w -1697662021
    //   4330: ixor
    //   4331: goto -> 4342
    //   4334: ldc2_w 164713043
    //   4337: l2i
    //   4338: ldc_w -298182633
    //   4341: ixor
    //   4342: ldc2_w -1262369082
    //   4345: l2i
    //   4346: ldc_w -1108303214
    //   4349: ixor
    //   4350: ixor
    //   4351: lookupswitch default -> 4376, -1903335 -> 4334, 201726609 -> 6226
    //   4376: getstatic net/minecraft/init/Blocks.field_150467_bQ : Lnet/minecraft/block/Block;
    //   4379: getstatic Perryc.0 : I
    //   4382: ifle -> 4396
    //   4385: ldc2_w 642233502
    //   4388: l2i
    //   4389: ldc_w -478670259
    //   4392: ixor
    //   4393: goto -> 4404
    //   4396: ldc2_w 187098037
    //   4399: l2i
    //   4400: ldc_w -1719848364
    //   4403: ixor
    //   4404: ldc2_w 287851831
    //   4407: l2i
    //   4408: ldc_w -1291281843
    //   4411: ixor
    //   4412: ixor
    //   4413: lookupswitch default -> 4440, 426744663 -> 4396, 1730116009 -> 6250
    //   4440: goto -> 4444
    //   4443: athrow
    //   4444: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4447: goto -> 4451
    //   4450: athrow
    //   4451: ifne -> 4465
    //   4454: ldc2_w 742823018
    //   4457: l2i
    //   4458: ldc_w 287128066
    //   4461: ixor
    //   4462: goto -> 4473
    //   4465: ldc2_w 614356721
    //   4468: l2i
    //   4469: ldc_w 432404632
    //   4472: ixor
    //   4473: ldc2_w -398029789
    //   4476: l2i
    //   4477: ldc_w 1152135441
    //   4480: ixor
    //   4481: ixor
    //   4482: tableswitch default -> 4454, -1850666150 -> 4504, -1850666149 -> 5544
    //   4504: getstatic Perryc.c : I
    //   4507: iflt -> 4521
    //   4510: ldc2_w -1885967483
    //   4513: l2i
    //   4514: ldc_w 1339862022
    //   4517: ixor
    //   4518: goto -> 4529
    //   4521: ldc2_w -429662242
    //   4524: l2i
    //   4525: ldc_w 845837929
    //   4528: ixor
    //   4529: ldc2_w -1621955668
    //   4532: l2i
    //   4533: ldc_w -472104079
    //   4536: ixor
    //   4537: ixor
    //   4538: lookupswitch default -> 6268, -1467547286 -> 4564, -1127977122 -> 4521
    //   4564: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   4567: getstatic Perryc.1 : I
    //   4570: ifeq -> 4584
    //   4573: ldc2_w 605228591
    //   4576: l2i
    //   4577: ldc_w 852669163
    //   4580: ixor
    //   4581: goto -> 4592
    //   4584: ldc2_w -1134104158
    //   4587: l2i
    //   4588: ldc_w -1809245718
    //   4591: ixor
    //   4592: ldc2_w -980860070
    //   4595: l2i
    //   4596: ldc_w -1022317539
    //   4599: ixor
    //   4600: ixor
    //   4601: lookupswitch default -> 4628, -932614338 -> 4584, 274224003 -> 6214
    //   4628: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   4631: getstatic Perryc.0 : I
    //   4634: ifle -> 4648
    //   4637: ldc2_w -757375122
    //   4640: l2i
    //   4641: ldc_w 1112503261
    //   4644: ixor
    //   4645: goto -> 4656
    //   4648: ldc2_w -723004205
    //   4651: l2i
    //   4652: ldc_w -961148393
    //   4655: ixor
    //   4656: ldc2_w -1750073206
    //   4659: l2i
    //   4660: ldc_w -1388792916
    //   4663: ixor
    //   4664: ixor
    //   4665: lookupswitch default -> 6230, -1440964715 -> 4648, 685338082 -> 4692
    //   4692: aload_0
    //   4693: getstatic Perryc.1 : I
    //   4696: ifeq -> 4710
    //   4699: ldc2_w 2042024761
    //   4702: l2i
    //   4703: ldc_w 503021798
    //   4706: ixor
    //   4707: goto -> 4718
    //   4710: ldc2_w -347713228
    //   4713: l2i
    //   4714: ldc_w -8261257
    //   4717: ixor
    //   4718: ldc2_w 1992781167
    //   4721: l2i
    //   4722: ldc_w -253029967
    //   4725: ixor
    //   4726: ixor
    //   4727: lookupswitch default -> 4752, -496947455 -> 6206, 209178574 -> 4710
    //   4752: goto -> 4756
    //   4755: athrow
    //   4756: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   4759: goto -> 4763
    //   4762: athrow
    //   4763: getstatic Perryc.c : I
    //   4766: iflt -> 4780
    //   4769: ldc2_w -1770260622
    //   4772: l2i
    //   4773: ldc_w 665634437
    //   4776: ixor
    //   4777: goto -> 4788
    //   4780: ldc2_w -471946968
    //   4783: l2i
    //   4784: ldc_w 2087689643
    //   4787: ixor
    //   4788: ldc2_w 1739907537
    //   4791: l2i
    //   4792: ldc_w 984903690
    //   4795: ixor
    //   4796: ixor
    //   4797: lookupswitch default -> 4824, -1497721756 -> 4780, -321413076 -> 6266
    //   4824: goto -> 4828
    //   4827: athrow
    //   4828: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   4833: goto -> 4837
    //   4836: athrow
    //   4837: getstatic Perryc.c : I
    //   4840: iflt -> 4854
    //   4843: ldc2_w -719404100
    //   4846: l2i
    //   4847: ldc_w 1343022273
    //   4850: ixor
    //   4851: goto -> 4862
    //   4854: ldc2_w 1321637872
    //   4857: l2i
    //   4858: ldc_w -1703867499
    //   4861: ixor
    //   4862: ldc2_w -1474238282
    //   4865: l2i
    //   4866: ldc_w -649240447
    //   4869: ixor
    //   4870: ixor
    //   4871: lookupswitch default -> 4896, -192958646 -> 6350, 159310384 -> 4854
    //   4896: getstatic net/minecraft/init/Blocks.field_150381_bn : Lnet/minecraft/block/Block;
    //   4899: getstatic Perryc.c : I
    //   4902: iflt -> 4916
    //   4905: ldc2_w 60195492
    //   4908: l2i
    //   4909: ldc_w 1463431909
    //   4912: ixor
    //   4913: goto -> 4924
    //   4916: ldc2_w 272432936
    //   4919: l2i
    //   4920: ldc_w -453736446
    //   4923: ixor
    //   4924: ldc2_w -1456424871
    //   4927: l2i
    //   4928: ldc_w 1588240386
    //   4931: ixor
    //   4932: ixor
    //   4933: lookupswitch default -> 4960, -1556699110 -> 6218, -625157777 -> 4916
    //   4960: goto -> 4964
    //   4963: athrow
    //   4964: invokevirtual equals : (Ljava/lang/Object;)Z
    //   4967: goto -> 4971
    //   4970: athrow
    //   4971: ifne -> 4985
    //   4974: ldc2_w 69834925
    //   4977: l2i
    //   4978: ldc_w 806382726
    //   4981: ixor
    //   4982: goto -> 4993
    //   4985: ldc2_w -1987464119
    //   4988: l2i
    //   4989: ldc_w -1112522655
    //   4992: ixor
    //   4993: ldc2_w -1762105224
    //   4996: l2i
    //   4997: ldc_w -808924630
    //   5000: ixor
    //   5001: ixor
    //   5002: tableswitch default -> 4974, 1829328505 -> 5024, 1829328506 -> 5544
    //   5024: getstatic Perryc.c : I
    //   5027: iflt -> 5041
    //   5030: ldc2_w -1938841288
    //   5033: l2i
    //   5034: ldc_w -1154193081
    //   5037: ixor
    //   5038: goto -> 5049
    //   5041: ldc2_w -1907275468
    //   5044: l2i
    //   5045: ldc_w -662160021
    //   5048: ixor
    //   5049: ldc2_w 1073919702
    //   5052: l2i
    //   5053: ldc_w -77768628
    //   5056: ixor
    //   5057: ixor
    //   5058: lookupswitch default -> 5084, -1945884955 -> 6338, -734928632 -> 5041
    //   5084: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   5087: getstatic Perryc.0 : I
    //   5090: ifle -> 5104
    //   5093: ldc2_w -2067413089
    //   5096: l2i
    //   5097: ldc_w 36818262
    //   5100: ixor
    //   5101: goto -> 5112
    //   5104: ldc2_w -1306429648
    //   5107: l2i
    //   5108: ldc_w 1366318538
    //   5111: ixor
    //   5112: ldc2_w -1586630708
    //   5115: l2i
    //   5116: ldc_w -721917356
    //   5119: ixor
    //   5120: ixor
    //   5121: lookupswitch default -> 5148, -772109184 -> 5104, -211710127 -> 6314
    //   5148: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   5151: getstatic Perryc.c : I
    //   5154: iflt -> 5168
    //   5157: ldc2_w -992239417
    //   5160: l2i
    //   5161: ldc_w 362850089
    //   5164: ixor
    //   5165: goto -> 5176
    //   5168: ldc2_w -1956941787
    //   5171: l2i
    //   5172: ldc_w -1765342571
    //   5175: ixor
    //   5176: ldc2_w 1280608737
    //   5179: l2i
    //   5180: ldc_w -1309800558
    //   5183: ixor
    //   5184: ixor
    //   5185: lookupswitch default -> 6254, -534315837 -> 5212, 750881181 -> 5168
    //   5212: aload_0
    //   5213: getstatic Perryc.1 : I
    //   5216: ifeq -> 5230
    //   5219: ldc2_w 409165554
    //   5222: l2i
    //   5223: ldc_w 393449884
    //   5226: ixor
    //   5227: goto -> 5238
    //   5230: ldc2_w 77532299
    //   5233: l2i
    //   5234: ldc_w -965948937
    //   5237: ixor
    //   5238: ldc2_w -1049802885
    //   5241: l2i
    //   5242: ldc_w -524168361
    //   5245: ixor
    //   5246: ixor
    //   5247: lookupswitch default -> 6236, -480292528 -> 5272, 784096066 -> 5230
    //   5272: goto -> 5276
    //   5275: athrow
    //   5276: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   5279: goto -> 5283
    //   5282: athrow
    //   5283: getstatic Perryc.1 : I
    //   5286: ifeq -> 5300
    //   5289: ldc2_w -2075668692
    //   5292: l2i
    //   5293: ldc_w 1169074359
    //   5296: ixor
    //   5297: goto -> 5308
    //   5300: ldc2_w 1541334093
    //   5303: l2i
    //   5304: ldc_w 1990836753
    //   5307: ixor
    //   5308: ldc2_w 535219796
    //   5311: l2i
    //   5312: ldc_w 251284916
    //   5315: ixor
    //   5316: ixor
    //   5317: lookupswitch default -> 6294, -789191557 -> 5300, 1013687740 -> 5344
    //   5344: goto -> 5348
    //   5347: athrow
    //   5348: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   5353: goto -> 5357
    //   5356: athrow
    //   5357: getstatic Perryc.0 : I
    //   5360: ifle -> 5374
    //   5363: ldc2_w -247025759
    //   5366: l2i
    //   5367: ldc_w 2109530963
    //   5370: ixor
    //   5371: goto -> 5382
    //   5374: ldc2_w 1135639280
    //   5377: l2i
    //   5378: ldc_w 126049969
    //   5381: ixor
    //   5382: ldc2_w -1485732036
    //   5385: l2i
    //   5386: ldc_w 1017418578
    //   5389: ixor
    //   5390: ixor
    //   5391: lookupswitch default -> 5416, 388978844 -> 6252, 1430939350 -> 5374
    //   5416: getstatic net/minecraft/init/Blocks.field_150477_bB : Lnet/minecraft/block/Block;
    //   5419: getstatic Perryc.1 : I
    //   5422: ifeq -> 5436
    //   5425: ldc2_w -2131907356
    //   5428: l2i
    //   5429: ldc_w 1617055317
    //   5432: ixor
    //   5433: goto -> 5444
    //   5436: ldc2_w 402837286
    //   5439: l2i
    //   5440: ldc_w -2103542588
    //   5443: ixor
    //   5444: ldc2_w 631551227
    //   5447: l2i
    //   5448: ldc_w -1674058116
    //   5451: ixor
    //   5452: ixor
    //   5453: lookupswitch default -> 6280, 588243301 -> 5480, 1495052342 -> 5436
    //   5480: goto -> 5484
    //   5483: athrow
    //   5484: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5487: goto -> 5491
    //   5490: athrow
    //   5491: ifeq -> 5505
    //   5494: ldc2_w 1209802040
    //   5497: l2i
    //   5498: ldc_w 804690696
    //   5501: ixor
    //   5502: goto -> 5513
    //   5505: ldc2_w -318940081
    //   5508: l2i
    //   5509: ldc_w -1961371012
    //   5512: ixor
    //   5513: ldc2_w -588291825
    //   5516: l2i
    //   5517: ldc_w 1255669154
    //   5520: ixor
    //   5521: ixor
    //   5522: tableswitch default -> 5494, -237888867 -> 5544, -237888866 -> 5608
    //   5544: getstatic Perryc.0 : I
    //   5547: ifle -> 5561
    //   5550: ldc2_w -103160117
    //   5553: l2i
    //   5554: ldc_w 815151848
    //   5557: ixor
    //   5558: goto -> 5569
    //   5561: ldc2_w 1824902870
    //   5564: l2i
    //   5565: ldc_w -876085483
    //   5568: ixor
    //   5569: ldc2_w -284265249
    //   5572: l2i
    //   5573: ldc_w -1648890491
    //   5576: ixor
    //   5577: ixor
    //   5578: lookupswitch default -> 5604, -1141488263 -> 6354, -713907556 -> 5561
    //   5604: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Resistant : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   5607: areturn
    //   5608: getstatic Perryc.c : I
    //   5611: iflt -> 5625
    //   5614: ldc2_w 1909939670
    //   5617: l2i
    //   5618: ldc_w -1012056821
    //   5621: ixor
    //   5622: goto -> 5633
    //   5625: ldc2_w 616384379
    //   5628: l2i
    //   5629: ldc_w 2001253869
    //   5632: ixor
    //   5633: ldc2_w 457764099
    //   5636: l2i
    //   5637: ldc_w 321926757
    //   5640: ixor
    //   5641: ixor
    //   5642: lookupswitch default -> 5668, -1853310756 -> 5625, -1174225989 -> 6274
    //   5668: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   5671: getstatic Perryc.c : I
    //   5674: iflt -> 5688
    //   5677: ldc2_w -887261605
    //   5680: l2i
    //   5681: ldc_w 1391475095
    //   5684: ixor
    //   5685: goto -> 5696
    //   5688: ldc2_w -517149309
    //   5691: l2i
    //   5692: ldc_w -1997981526
    //   5695: ixor
    //   5696: ldc2_w -1991721127
    //   5699: l2i
    //   5700: ldc_w 1232937888
    //   5703: ixor
    //   5704: ixor
    //   5705: lookupswitch default -> 6336, -1443870256 -> 5732, 1507382069 -> 5688
    //   5732: getfield field_71441_e : Lnet/minecraft/client/multiplayer/WorldClient;
    //   5735: getstatic Perryc.0 : I
    //   5738: ifle -> 5752
    //   5741: ldc2_w -27429315
    //   5744: l2i
    //   5745: ldc_w 566505197
    //   5748: ixor
    //   5749: goto -> 5760
    //   5752: ldc2_w 609789598
    //   5755: l2i
    //   5756: ldc_w 1368515230
    //   5759: ixor
    //   5760: ldc2_w -243991621
    //   5763: l2i
    //   5764: ldc_w -1038094962
    //   5767: ixor
    //   5768: ixor
    //   5769: lookupswitch default -> 6194, -319664411 -> 5752, 1185042997 -> 5796
    //   5796: aload_0
    //   5797: getstatic Perryc.c : I
    //   5800: iflt -> 5814
    //   5803: ldc2_w -1371726670
    //   5806: l2i
    //   5807: ldc_w -1767266868
    //   5810: ixor
    //   5811: goto -> 5822
    //   5814: ldc2_w 1380411632
    //   5817: l2i
    //   5818: ldc_w -1704331346
    //   5821: ixor
    //   5822: ldc2_w 487321556
    //   5825: l2i
    //   5826: ldc_w 1906375157
    //   5829: ixor
    //   5830: ixor
    //   5831: lookupswitch default -> 5856, 1413459807 -> 6224, 2030454667 -> 5814
    //   5856: goto -> 5860
    //   5859: athrow
    //   5860: invokevirtual func_180495_p : (Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;
    //   5863: goto -> 5867
    //   5866: athrow
    //   5867: getstatic Perryc.1 : I
    //   5870: ifeq -> 5884
    //   5873: ldc2_w -126704650
    //   5876: l2i
    //   5877: ldc_w -1046094627
    //   5880: ixor
    //   5881: goto -> 5892
    //   5884: ldc2_w 96703658
    //   5887: l2i
    //   5888: ldc_w -1511935726
    //   5891: ixor
    //   5892: ldc2_w 1832998169
    //   5895: l2i
    //   5896: ldc_w -1542410617
    //   5899: ixor
    //   5900: ixor
    //   5901: lookupswitch default -> 6196, -259619659 -> 5884, 1769201190 -> 5928
    //   5928: goto -> 5932
    //   5931: athrow
    //   5932: invokeinterface func_177230_c : ()Lnet/minecraft/block/Block;
    //   5937: goto -> 5941
    //   5940: athrow
    //   5941: getstatic Perryc.c : I
    //   5944: iflt -> 5958
    //   5947: ldc2_w -381023261
    //   5950: l2i
    //   5951: ldc_w 1565259747
    //   5954: ixor
    //   5955: goto -> 5966
    //   5958: ldc2_w 2085582891
    //   5961: l2i
    //   5962: ldc_w -1353019890
    //   5965: ixor
    //   5966: ldc2_w -148265474
    //   5969: l2i
    //   5970: ldc_w -501772764
    //   5973: ixor
    //   5974: ixor
    //   5975: lookupswitch default -> 6000, -1589651494 -> 6216, -950603636 -> 5958
    //   6000: getstatic net/minecraft/init/Blocks.field_150357_h : Lnet/minecraft/block/Block;
    //   6003: getstatic Perryc.1 : I
    //   6006: ifeq -> 6020
    //   6009: ldc2_w -1740327962
    //   6012: l2i
    //   6013: ldc_w 874995872
    //   6016: ixor
    //   6017: goto -> 6028
    //   6020: ldc2_w 752549350
    //   6023: l2i
    //   6024: ldc_w 1705746330
    //   6027: ixor
    //   6028: ldc2_w -217055382
    //   6031: l2i
    //   6032: ldc_w -1510266987
    //   6035: ixor
    //   6036: ixor
    //   6037: lookupswitch default -> 6064, -90764359 -> 6304, 1692045652 -> 6020
    //   6064: goto -> 6068
    //   6067: athrow
    //   6068: invokevirtual equals : (Ljava/lang/Object;)Z
    //   6071: goto -> 6075
    //   6074: athrow
    //   6075: ifeq -> 6089
    //   6078: ldc2_w -835009701
    //   6081: l2i
    //   6082: ldc_w -1787136687
    //   6085: ixor
    //   6086: goto -> 6097
    //   6089: ldc2_w 1448840376
    //   6092: l2i
    //   6093: ldc_w 219888307
    //   6096: ixor
    //   6097: ldc2_w 215783570
    //   6100: l2i
    //   6101: ldc_w 214734398
    //   6104: ixor
    //   6105: ixor
    //   6106: tableswitch default -> 6078, 1532016806 -> 6128, 1532016807 -> 6192
    //   6128: getstatic Perryc.c : I
    //   6131: iflt -> 6145
    //   6134: ldc2_w -1400397118
    //   6137: l2i
    //   6138: ldc_w 1970147998
    //   6141: ixor
    //   6142: goto -> 6153
    //   6145: ldc2_w -34827972
    //   6148: l2i
    //   6149: ldc_w -1329595235
    //   6152: ixor
    //   6153: ldc2_w 1701390921
    //   6156: l2i
    //   6157: ldc_w -1516645505
    //   6160: ixor
    //   6161: ixor
    //   6162: lookupswitch default -> 6220, -1918659433 -> 6188, 421087594 -> 6145
    //   6188: getstatic bigname/zprestige/webhack/util/BlockUtil$BlockResistance.Unbreakable : Lbigname/zprestige/webhack/util/BlockUtil$BlockResistance;
    //   6191: areturn
    //   6192: aconst_null
    //   6193: areturn
    //   6194: aconst_null
    //   6195: athrow
    //   6196: aconst_null
    //   6197: athrow
    //   6198: aconst_null
    //   6199: athrow
    //   6200: aconst_null
    //   6201: athrow
    //   6202: aconst_null
    //   6203: athrow
    //   6204: aconst_null
    //   6205: athrow
    //   6206: aconst_null
    //   6207: athrow
    //   6208: aconst_null
    //   6209: athrow
    //   6210: aconst_null
    //   6211: athrow
    //   6212: aconst_null
    //   6213: athrow
    //   6214: aconst_null
    //   6215: athrow
    //   6216: aconst_null
    //   6217: athrow
    //   6218: aconst_null
    //   6219: athrow
    //   6220: aconst_null
    //   6221: athrow
    //   6222: aconst_null
    //   6223: athrow
    //   6224: aconst_null
    //   6225: athrow
    //   6226: aconst_null
    //   6227: athrow
    //   6228: aconst_null
    //   6229: athrow
    //   6230: aconst_null
    //   6231: athrow
    //   6232: aconst_null
    //   6233: athrow
    //   6234: aconst_null
    //   6235: athrow
    //   6236: aconst_null
    //   6237: athrow
    //   6238: aconst_null
    //   6239: athrow
    //   6240: aconst_null
    //   6241: athrow
    //   6242: aconst_null
    //   6243: athrow
    //   6244: aconst_null
    //   6245: athrow
    //   6246: aconst_null
    //   6247: athrow
    //   6248: aconst_null
    //   6249: athrow
    //   6250: aconst_null
    //   6251: athrow
    //   6252: aconst_null
    //   6253: athrow
    //   6254: aconst_null
    //   6255: athrow
    //   6256: aconst_null
    //   6257: athrow
    //   6258: aconst_null
    //   6259: athrow
    //   6260: aconst_null
    //   6261: athrow
    //   6262: aconst_null
    //   6263: athrow
    //   6264: aconst_null
    //   6265: athrow
    //   6266: aconst_null
    //   6267: athrow
    //   6268: aconst_null
    //   6269: athrow
    //   6270: aconst_null
    //   6271: athrow
    //   6272: aconst_null
    //   6273: athrow
    //   6274: aconst_null
    //   6275: athrow
    //   6276: aconst_null
    //   6277: athrow
    //   6278: aconst_null
    //   6279: athrow
    //   6280: aconst_null
    //   6281: athrow
    //   6282: aconst_null
    //   6283: athrow
    //   6284: aconst_null
    //   6285: athrow
    //   6286: aconst_null
    //   6287: athrow
    //   6288: aconst_null
    //   6289: athrow
    //   6290: aconst_null
    //   6291: athrow
    //   6292: aconst_null
    //   6293: athrow
    //   6294: aconst_null
    //   6295: athrow
    //   6296: aconst_null
    //   6297: athrow
    //   6298: aconst_null
    //   6299: athrow
    //   6300: aconst_null
    //   6301: athrow
    //   6302: aconst_null
    //   6303: athrow
    //   6304: aconst_null
    //   6305: athrow
    //   6306: aconst_null
    //   6307: athrow
    //   6308: aconst_null
    //   6309: athrow
    //   6310: aconst_null
    //   6311: athrow
    //   6312: aconst_null
    //   6313: athrow
    //   6314: aconst_null
    //   6315: athrow
    //   6316: aconst_null
    //   6317: athrow
    //   6318: aconst_null
    //   6319: athrow
    //   6320: aconst_null
    //   6321: athrow
    //   6322: aconst_null
    //   6323: athrow
    //   6324: aconst_null
    //   6325: athrow
    //   6326: aconst_null
    //   6327: athrow
    //   6328: aconst_null
    //   6329: athrow
    //   6330: aconst_null
    //   6331: athrow
    //   6332: aconst_null
    //   6333: athrow
    //   6334: aconst_null
    //   6335: athrow
    //   6336: aconst_null
    //   6337: athrow
    //   6338: aconst_null
    //   6339: athrow
    //   6340: aconst_null
    //   6341: athrow
    //   6342: aconst_null
    //   6343: athrow
    //   6344: aconst_null
    //   6345: athrow
    //   6346: aconst_null
    //   6347: athrow
    //   6348: aconst_null
    //   6349: athrow
    //   6350: aconst_null
    //   6351: athrow
    //   6352: aconst_null
    //   6353: athrow
    //   6354: aconst_null
    //   6355: athrow
    //   6356: aconst_null
    //   6357: athrow
    //   6358: aconst_null
    //   6359: athrow
    //   6360: aconst_null
    //   6361: athrow
    //   6362: pop
    //   6363: goto -> 24
    //   6366: pop
    //   6367: aconst_null
    //   6368: goto -> 6362
    //   6371: dup
    //   6372: ifnull -> 6362
    //   6375: checkcast java/lang/Throwable
    //   6378: athrow
    //   6379: dup
    //   6380: ifnull -> 6366
    //   6383: checkcast java/lang/Throwable
    //   6386: athrow
    //   6387: aconst_null
    //   6388: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	6170	0	block	Lnet/minecraft/util/math/BlockPos;
    // Exception table:
    //   from	to	target	type
    //   8	20	6371	finally
    //   275	282	282	finally
    //   275	282	275	java/util/ConcurrentModificationException
    //   276	282	275	finally
    //   276	282	275	java/lang/IndexOutOfBoundsException
    //   276	282	282	finally
    //   651	658	658	finally
    //   651	658	651	finally
    //   651	658	3	finally
    //   652	658	658	finally
    //   652	658	658	java/lang/StringIndexOutOfBoundsException
    //   723	732	732	finally
    //   723	732	723	java/lang/ClassCastException
    //   723	732	723	java/lang/NegativeArraySizeException
    //   724	732	732	java/lang/IllegalStateException
    //   724	732	732	java/lang/ArrayIndexOutOfBoundsException
    //   984	990	990	finally
    //   984	990	990	java/lang/StringIndexOutOfBoundsException
    //   984	990	3	finally
    //   984	990	3	finally
    //   984	990	3	java/lang/ClassCastException
    //   1244	1250	1250	finally
    //   1244	1250	3	finally
    //   1244	1250	1250	java/lang/ClassCastException
    //   1244	1250	1250	finally
    //   1244	1250	3	finally
    //   1571	1578	1578	finally
    //   1571	1578	1578	finally
    //   1571	1578	1578	finally
    //   1571	1578	1571	java/lang/EnumConstantNotPresentException
    //   1572	1578	1578	java/lang/EnumConstantNotPresentException
    //   1643	1652	1652	finally
    //   1643	1652	1652	finally
    //   1644	1652	1652	finally
    //   1644	1652	3	finally
    //   1644	1652	1643	finally
    //   1779	1786	1786	finally
    //   1779	1786	1779	java/util/NoSuchElementException
    //   1780	1786	1786	java/lang/NegativeArraySizeException
    //   1780	1786	3	java/lang/EnumConstantNotPresentException
    //   1780	1786	3	java/lang/NumberFormatException
    //   2091	2098	2098	finally
    //   2092	2098	2098	finally
    //   2092	2098	2098	java/lang/IndexOutOfBoundsException
    //   2092	2098	3	java/lang/IndexOutOfBoundsException
    //   2092	2098	2091	finally
    //   2164	2172	2172	finally
    //   2164	2172	3	java/lang/UnsupportedOperationException
    //   2164	2172	2172	java/lang/RuntimeException
    //   2164	2172	3	finally
    //   2164	2172	2172	finally
    //   2300	2306	2306	finally
    //   2300	2306	3	finally
    //   2300	2306	3	java/util/ConcurrentModificationException
    //   2300	2306	3	finally
    //   2300	2306	3	java/lang/IllegalArgumentException
    //   2612	2618	2618	finally
    //   2612	2618	2618	finally
    //   2612	2618	3	finally
    //   2612	2618	3	java/util/ConcurrentModificationException
    //   2612	2618	2618	finally
    //   2683	2692	2692	finally
    //   2683	2692	2683	java/util/ConcurrentModificationException
    //   2683	2692	3	finally
    //   2683	2692	3	java/lang/NullPointerException
    //   2684	2692	3	finally
    //   2819	2826	2826	finally
    //   2819	2826	2826	java/lang/ClassCastException
    //   2819	2826	3	finally
    //   2820	2826	3	java/util/ConcurrentModificationException
    //   2820	2826	2819	java/lang/IllegalArgumentException
    //   3131	3138	3138	finally
    //   3131	3138	3131	finally
    //   3131	3138	3131	java/lang/UnsupportedOperationException
    //   3132	3138	3138	finally
    //   3132	3138	3	java/lang/IllegalStateException
    //   3203	3212	3212	finally
    //   3203	3212	3	java/lang/IndexOutOfBoundsException
    //   3203	3212	3203	java/lang/ClassCastException
    //   3204	3212	3203	finally
    //   3204	3212	3203	finally
    //   3339	3346	3346	finally
    //   3339	3346	3339	java/lang/ClassCastException
    //   3339	3346	3	finally
    //   3339	3346	3346	java/lang/NullPointerException
    //   3340	3346	3	finally
    //   3715	3722	3722	finally
    //   3715	3722	3722	finally
    //   3716	3722	3715	finally
    //   3716	3722	3715	finally
    //   3716	3722	3722	finally
    //   3787	3796	3796	finally
    //   3787	3796	3	java/util/ConcurrentModificationException
    //   3787	3796	3796	finally
    //   3788	3796	3787	finally
    //   3788	3796	3	finally
    //   3923	3930	3930	finally
    //   3923	3930	3930	java/lang/ArithmeticException
    //   3924	3930	3930	finally
    //   3924	3930	3923	java/lang/NegativeArraySizeException
    //   3924	3930	3930	java/lang/RuntimeException
    //   4235	4242	4242	finally
    //   4236	4242	3	finally
    //   4236	4242	4235	java/lang/StringIndexOutOfBoundsException
    //   4236	4242	4235	finally
    //   4236	4242	4235	finally
    //   4307	4316	4316	finally
    //   4307	4316	3	java/lang/RuntimeException
    //   4307	4316	3	finally
    //   4307	4316	4307	java/lang/ArithmeticException
    //   4308	4316	4307	java/lang/IllegalArgumentException
    //   4443	4450	4450	finally
    //   4443	4450	3	finally
    //   4444	4450	4450	java/lang/AssertionError
    //   4444	4450	4450	java/lang/UnsupportedOperationException
    //   4444	4450	4443	finally
    //   4755	4762	4762	finally
    //   4755	4762	3	finally
    //   4755	4762	4755	finally
    //   4756	4762	3	finally
    //   4756	4762	4762	finally
    //   4827	4836	4836	finally
    //   4827	4836	3	java/lang/UnsupportedOperationException
    //   4827	4836	4827	java/lang/ArrayIndexOutOfBoundsException
    //   4828	4836	3	java/lang/ClassCastException
    //   4828	4836	3	java/lang/AssertionError
    //   4963	4970	4970	finally
    //   4963	4970	4963	finally
    //   4963	4970	4963	finally
    //   4964	4970	4970	java/lang/NumberFormatException
    //   4964	4970	4970	java/lang/ClassCastException
    //   5275	5282	5282	finally
    //   5275	5282	5275	java/lang/RuntimeException
    //   5275	5282	5282	finally
    //   5276	5282	5282	java/lang/AssertionError
    //   5276	5282	3	java/lang/AssertionError
    //   5348	5356	5356	finally
    //   5348	5356	3	finally
    //   5348	5356	3	finally
    //   5348	5356	5356	finally
    //   5348	5356	5356	java/lang/IllegalStateException
    //   5483	5490	5490	finally
    //   5483	5490	5490	finally
    //   5483	5490	5483	java/util/ConcurrentModificationException
    //   5484	5490	5483	java/lang/StringIndexOutOfBoundsException
    //   5484	5490	5490	finally
    //   5859	5866	5866	finally
    //   5859	5866	5859	finally
    //   5859	5866	3	finally
    //   5859	5866	3	java/lang/AssertionError
    //   5860	5866	5866	java/lang/EnumConstantNotPresentException
    //   5931	5940	5940	finally
    //   5931	5940	5931	java/lang/EnumConstantNotPresentException
    //   5932	5940	5940	finally
    //   5932	5940	5940	finally
    //   5932	5940	3	finally
    //   6067	6074	6074	finally
    //   6067	6074	6067	finally
    //   6067	6074	3	java/lang/UnsupportedOperationException
    //   6068	6074	6074	finally
    //   6068	6074	6067	finally
    //   6371	6379	6371	finally
    //   6387	6389	3	java/lang/EnumConstantNotPresentException
  }
  
  static {
    // Byte code:
    //   0: ldc2_w 909360823
    //   3: l2i
    //   4: ldc_w 909360828
    //   7: ixor
    //   8: anewarray net/minecraft/block/Block
    //   11: dup
    //   12: ldc2_w -1752022688
    //   15: l2i
    //   16: ldc_w -1752022688
    //   19: ixor
    //   20: getstatic Perryc.0 : I
    //   23: ifle -> 37
    //   26: ldc2_w 1526000357
    //   29: l2i
    //   30: ldc_w -1834496729
    //   33: ixor
    //   34: goto -> 45
    //   37: ldc2_w 483421822
    //   40: l2i
    //   41: ldc_w 1003240011
    //   44: ixor
    //   45: ldc2_w 1682614468
    //   48: l2i
    //   49: ldc_w -892196898
    //   52: ixor
    //   53: ixor
    //   54: lookupswitch default -> 6650, -1987781841 -> 80, 1724623064 -> 37
    //   80: getstatic net/minecraft/init/Blocks.field_150477_bB : Lnet/minecraft/block/Block;
    //   83: aastore
    //   84: dup
    //   85: ldc2_w -1492627869
    //   88: l2i
    //   89: ldc_w -1492627870
    //   92: ixor
    //   93: getstatic Perryc.c : I
    //   96: iflt -> 110
    //   99: ldc2_w -972267801
    //   102: l2i
    //   103: ldc_w 13603374
    //   106: ixor
    //   107: goto -> 118
    //   110: ldc2_w -853090437
    //   113: l2i
    //   114: ldc_w 113961371
    //   117: ixor
    //   118: ldc2_w -1891020762
    //   121: l2i
    //   122: ldc_w -987633738
    //   125: ixor
    //   126: ixor
    //   127: lookupswitch default -> 6694, -2122022544 -> 152, -1934918823 -> 110
    //   152: getstatic net/minecraft/init/Blocks.field_150486_ae : Lnet/minecraft/block/BlockChest;
    //   155: aastore
    //   156: dup
    //   157: ldc2_w -369787731
    //   160: l2i
    //   161: ldc_w -369787729
    //   164: ixor
    //   165: getstatic Perryc.0 : I
    //   168: ifle -> 182
    //   171: ldc2_w -2115641180
    //   174: l2i
    //   175: ldc_w -360702449
    //   178: ixor
    //   179: goto -> 190
    //   182: ldc2_w 1062914856
    //   185: l2i
    //   186: ldc_w -953528705
    //   189: ixor
    //   190: ldc2_w -574680793
    //   193: l2i
    //   194: ldc_w 1909181911
    //   197: ixor
    //   198: ixor
    //   199: lookupswitch default -> 6756, -955178405 -> 182, 1409571239 -> 224
    //   224: getstatic net/minecraft/init/Blocks.field_150447_bR : Lnet/minecraft/block/Block;
    //   227: aastore
    //   228: dup
    //   229: ldc2_w -1421553845
    //   232: l2i
    //   233: ldc_w -1421553848
    //   236: ixor
    //   237: getstatic Perryc.c : I
    //   240: iflt -> 254
    //   243: ldc2_w -70857819
    //   246: l2i
    //   247: ldc_w -626912094
    //   250: ixor
    //   251: goto -> 262
    //   254: ldc2_w -665839879
    //   257: l2i
    //   258: ldc_w 114559236
    //   261: ixor
    //   262: ldc2_w 1601216060
    //   265: l2i
    //   266: ldc_w -1641547743
    //   269: ixor
    //   270: ixor
    //   271: lookupswitch default -> 6728, -533481190 -> 254, 533952992 -> 296
    //   296: getstatic net/minecraft/init/Blocks.field_150462_ai : Lnet/minecraft/block/Block;
    //   299: aastore
    //   300: dup
    //   301: ldc2_w -112248347
    //   304: l2i
    //   305: ldc_w -112248351
    //   308: ixor
    //   309: getstatic Perryc.c : I
    //   312: iflt -> 326
    //   315: ldc2_w 2021575984
    //   318: l2i
    //   319: ldc_w -784668479
    //   322: ixor
    //   323: goto -> 334
    //   326: ldc2_w 144206910
    //   329: l2i
    //   330: ldc_w -335584707
    //   333: ixor
    //   334: ldc2_w -1998599398
    //   337: l2i
    //   338: ldc_w 1487351956
    //   341: ixor
    //   342: ixor
    //   343: lookupswitch default -> 368, 613490323 -> 326, 2034032255 -> 6692
    //   368: getstatic net/minecraft/init/Blocks.field_150467_bQ : Lnet/minecraft/block/Block;
    //   371: aastore
    //   372: dup
    //   373: ldc2_w 1429589253
    //   376: l2i
    //   377: ldc_w 1429589248
    //   380: ixor
    //   381: getstatic Perryc.0 : I
    //   384: ifle -> 398
    //   387: ldc2_w -270908943
    //   390: l2i
    //   391: ldc_w -511752713
    //   394: ixor
    //   395: goto -> 406
    //   398: ldc2_w -813062384
    //   401: l2i
    //   402: ldc_w 1864083859
    //   405: ixor
    //   406: ldc2_w 1666732252
    //   409: l2i
    //   410: ldc_w -957128632
    //   413: ixor
    //   414: ixor
    //   415: lookupswitch default -> 440, -1700212054 -> 398, -1425132398 -> 6686
    //   440: getstatic net/minecraft/init/Blocks.field_150382_bo : Lnet/minecraft/block/Block;
    //   443: aastore
    //   444: dup
    //   445: ldc2_w 658896559
    //   448: l2i
    //   449: ldc_w 658896553
    //   452: ixor
    //   453: getstatic Perryc.0 : I
    //   456: ifle -> 470
    //   459: ldc2_w 1827302388
    //   462: l2i
    //   463: ldc_w 980271317
    //   466: ixor
    //   467: goto -> 478
    //   470: ldc2_w 1038541444
    //   473: l2i
    //   474: ldc_w -553937916
    //   477: ixor
    //   478: ldc2_w -1258644354
    //   481: l2i
    //   482: ldc_w -966068169
    //   485: ixor
    //   486: ixor
    //   487: lookupswitch default -> 6780, -1853025591 -> 512, 605540200 -> 470
    //   512: getstatic net/minecraft/init/Blocks.field_150438_bZ : Lnet/minecraft/block/BlockHopper;
    //   515: aastore
    //   516: dup
    //   517: ldc2_w -16784140
    //   520: l2i
    //   521: ldc_w -16784141
    //   524: ixor
    //   525: getstatic Perryc.c : I
    //   528: iflt -> 542
    //   531: ldc2_w -1909897626
    //   534: l2i
    //   535: ldc_w -1695590684
    //   538: ixor
    //   539: goto -> 550
    //   542: ldc2_w 973539239
    //   545: l2i
    //   546: ldc_w -690717915
    //   549: ixor
    //   550: ldc2_w -1677501263
    //   553: l2i
    //   554: ldc_w 428569260
    //   557: ixor
    //   558: ixor
    //   559: lookupswitch default -> 6720, -1857143137 -> 542, 1767592607 -> 584
    //   584: getstatic net/minecraft/init/Blocks.field_150409_cd : Lnet/minecraft/block/Block;
    //   587: aastore
    //   588: dup
    //   589: ldc2_w -1498402084
    //   592: l2i
    //   593: ldc_w -1498402092
    //   596: ixor
    //   597: getstatic Perryc.1 : I
    //   600: ifeq -> 614
    //   603: ldc2_w -272805787
    //   606: l2i
    //   607: ldc_w 1695743116
    //   610: ixor
    //   611: goto -> 622
    //   614: ldc2_w -64729958
    //   617: l2i
    //   618: ldc_w -4963615
    //   621: ixor
    //   622: ldc2_w -1295213317
    //   625: l2i
    //   626: ldc_w -1940556947
    //   629: ixor
    //   630: ixor
    //   631: lookupswitch default -> 6688, -1271512193 -> 614, 1024057837 -> 656
    //   656: getstatic net/minecraft/init/Blocks.field_150367_z : Lnet/minecraft/block/Block;
    //   659: aastore
    //   660: dup
    //   661: ldc2_w 637029324
    //   664: l2i
    //   665: ldc_w 637029317
    //   668: ixor
    //   669: getstatic Perryc.1 : I
    //   672: ifeq -> 686
    //   675: ldc2_w -1295197718
    //   678: l2i
    //   679: ldc_w 1691332463
    //   682: ixor
    //   683: goto -> 694
    //   686: ldc2_w 658860985
    //   689: l2i
    //   690: ldc_w 1370923402
    //   693: ixor
    //   694: ldc2_w 79248147
    //   697: l2i
    //   698: ldc_w 545287266
    //   701: ixor
    //   702: ixor
    //   703: lookupswitch default -> 728, -231071244 -> 6740, 1690988887 -> 686
    //   728: getstatic net/minecraft/init/Blocks.field_150415_aT : Lnet/minecraft/block/Block;
    //   731: aastore
    //   732: dup
    //   733: ldc2_w -469936772
    //   736: l2i
    //   737: ldc_w -469936778
    //   740: ixor
    //   741: getstatic Perryc.1 : I
    //   744: ifeq -> 758
    //   747: ldc2_w 2091426928
    //   750: l2i
    //   751: ldc_w 68185749
    //   754: ixor
    //   755: goto -> 766
    //   758: ldc2_w 1359855968
    //   761: l2i
    //   762: ldc_w -1877671394
    //   765: ixor
    //   766: ldc2_w -105285169
    //   769: l2i
    //   770: ldc_w -1048448858
    //   773: ixor
    //   774: ixor
    //   775: lookupswitch default -> 6744, -115324393 -> 800, 1082147724 -> 758
    //   800: getstatic net/minecraft/init/Blocks.field_150381_bn : Lnet/minecraft/block/Block;
    //   803: aastore
    //   804: getstatic Perryc.0 : I
    //   807: ifle -> 821
    //   810: ldc2_w -1820864653
    //   813: l2i
    //   814: ldc_w -547978876
    //   817: ixor
    //   818: goto -> 829
    //   821: ldc2_w -834047629
    //   824: l2i
    //   825: ldc_w -1308227459
    //   828: ixor
    //   829: ldc2_w -1773769963
    //   832: l2i
    //   833: ldc_w 1233955070
    //   836: ixor
    //   837: ixor
    //   838: lookupswitch default -> 864, -1813279460 -> 6724, 443762905 -> 821
    //   864: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   867: getstatic Perryc.c : I
    //   870: iflt -> 884
    //   873: ldc2_w -332427943
    //   876: l2i
    //   877: ldc_w -323258949
    //   880: ixor
    //   881: goto -> 892
    //   884: ldc2_w 2043389600
    //   887: l2i
    //   888: ldc_w 175027914
    //   891: ixor
    //   892: ldc2_w -531280963
    //   895: l2i
    //   896: ldc_w 1348374429
    //   899: ixor
    //   900: ixor
    //   901: lookupswitch default -> 928, -1331741502 -> 6782, 159622236 -> 884
    //   928: putstatic bigname/zprestige/webhack/util/BlockUtil.blackList : Ljava/util/List;
    //   931: ldc2_w 527068978
    //   934: l2i
    //   935: ldc_w 527068962
    //   938: ixor
    //   939: anewarray net/minecraft/block/Block
    //   942: dup
    //   943: ldc2_w 1611046372
    //   946: l2i
    //   947: ldc_w 1611046372
    //   950: ixor
    //   951: getstatic Perryc.c : I
    //   954: iflt -> 968
    //   957: ldc2_w 1016073871
    //   960: l2i
    //   961: ldc_w -162755354
    //   964: ixor
    //   965: goto -> 976
    //   968: ldc2_w 1808348009
    //   971: l2i
    //   972: ldc_w 1012254481
    //   975: ixor
    //   976: ldc2_w 34167997
    //   979: l2i
    //   980: ldc_w -1081310002
    //   983: ixor
    //   984: ixor
    //   985: lookupswitch default -> 1012, -1714548837 -> 968, 2002344474 -> 6676
    //   1012: getstatic net/minecraft/init/Blocks.field_190977_dl : Lnet/minecraft/block/Block;
    //   1015: aastore
    //   1016: dup
    //   1017: ldc2_w 430152987
    //   1020: l2i
    //   1021: ldc_w 430152986
    //   1024: ixor
    //   1025: getstatic Perryc.0 : I
    //   1028: ifle -> 1042
    //   1031: ldc2_w 1779228706
    //   1034: l2i
    //   1035: ldc_w -180327817
    //   1038: ixor
    //   1039: goto -> 1050
    //   1042: ldc2_w 1763169954
    //   1045: l2i
    //   1046: ldc_w 1249585762
    //   1049: ixor
    //   1050: ldc2_w 313159785
    //   1053: l2i
    //   1054: ldc_w 125362027
    //   1057: ixor
    //   1058: ixor
    //   1059: lookupswitch default -> 1084, -1969347241 -> 6716, 2054335239 -> 1042
    //   1084: getstatic net/minecraft/init/Blocks.field_190978_dm : Lnet/minecraft/block/Block;
    //   1087: aastore
    //   1088: dup
    //   1089: ldc2_w -1473416335
    //   1092: l2i
    //   1093: ldc_w -1473416333
    //   1096: ixor
    //   1097: getstatic Perryc.1 : I
    //   1100: ifeq -> 1114
    //   1103: ldc2_w 1229453575
    //   1106: l2i
    //   1107: ldc_w -1873920672
    //   1110: ixor
    //   1111: goto -> 1122
    //   1114: ldc2_w -1951354344
    //   1117: l2i
    //   1118: ldc_w 1700131955
    //   1121: ixor
    //   1122: ldc2_w -1564984452
    //   1125: l2i
    //   1126: ldc_w 1669119599
    //   1129: ixor
    //   1130: ixor
    //   1131: lookupswitch default -> 6718, 416104820 -> 1114, 790741880 -> 1156
    //   1156: getstatic net/minecraft/init/Blocks.field_190979_dn : Lnet/minecraft/block/Block;
    //   1159: aastore
    //   1160: dup
    //   1161: ldc2_w -1276985859
    //   1164: l2i
    //   1165: ldc_w -1276985858
    //   1168: ixor
    //   1169: getstatic Perryc.1 : I
    //   1172: ifeq -> 1186
    //   1175: ldc2_w 904464820
    //   1178: l2i
    //   1179: ldc_w 1030901314
    //   1182: ixor
    //   1183: goto -> 1194
    //   1186: ldc2_w 60378849
    //   1189: l2i
    //   1190: ldc_w 469924112
    //   1193: ixor
    //   1194: ldc2_w -1891044081
    //   1197: l2i
    //   1198: ldc_w 2041294888
    //   1201: ixor
    //   1202: ixor
    //   1203: lookupswitch default -> 6626, -377982250 -> 1228, -25689391 -> 1186
    //   1228: getstatic net/minecraft/init/Blocks.field_190980_do : Lnet/minecraft/block/Block;
    //   1231: aastore
    //   1232: dup
    //   1233: ldc2_w -1922360201
    //   1236: l2i
    //   1237: ldc_w -1922360205
    //   1240: ixor
    //   1241: getstatic Perryc.1 : I
    //   1244: ifeq -> 1258
    //   1247: ldc2_w -813205914
    //   1250: l2i
    //   1251: ldc_w -837507188
    //   1254: ixor
    //   1255: goto -> 1266
    //   1258: ldc2_w 2139180190
    //   1261: l2i
    //   1262: ldc_w 347765009
    //   1265: ixor
    //   1266: ldc2_w -2125135269
    //   1269: l2i
    //   1270: ldc_w -446610322
    //   1273: ixor
    //   1274: ixor
    //   1275: lookupswitch default -> 1300, -82810326 -> 1258, 1705482207 -> 6630
    //   1300: getstatic net/minecraft/init/Blocks.field_190981_dp : Lnet/minecraft/block/Block;
    //   1303: aastore
    //   1304: dup
    //   1305: ldc2_w -1686529307
    //   1308: l2i
    //   1309: ldc_w -1686529312
    //   1312: ixor
    //   1313: getstatic Perryc.c : I
    //   1316: iflt -> 1330
    //   1319: ldc2_w -1602171651
    //   1322: l2i
    //   1323: ldc_w 1623927795
    //   1326: ixor
    //   1327: goto -> 1338
    //   1330: ldc2_w 224389739
    //   1333: l2i
    //   1334: ldc_w 419389341
    //   1337: ixor
    //   1338: ldc2_w 110630470
    //   1341: l2i
    //   1342: ldc_w 253607945
    //   1345: ixor
    //   1346: ixor
    //   1347: lookupswitch default -> 6608, -909233855 -> 1330, 472212409 -> 1372
    //   1372: getstatic net/minecraft/init/Blocks.field_190982_dq : Lnet/minecraft/block/Block;
    //   1375: aastore
    //   1376: dup
    //   1377: ldc2_w 621233188
    //   1380: l2i
    //   1381: ldc_w 621233186
    //   1384: ixor
    //   1385: getstatic Perryc.0 : I
    //   1388: ifle -> 1402
    //   1391: ldc2_w 393383216
    //   1394: l2i
    //   1395: ldc_w 828151165
    //   1398: ixor
    //   1399: goto -> 1410
    //   1402: ldc2_w -668668458
    //   1405: l2i
    //   1406: ldc_w 755571365
    //   1409: ixor
    //   1410: ldc2_w -2119999729
    //   1413: l2i
    //   1414: ldc_w -157549335
    //   1417: ixor
    //   1418: ixor
    //   1419: lookupswitch default -> 6636, -2112531307 -> 1444, 1360444331 -> 1402
    //   1444: getstatic net/minecraft/init/Blocks.field_190983_dr : Lnet/minecraft/block/Block;
    //   1447: aastore
    //   1448: dup
    //   1449: ldc2_w 303934815
    //   1452: l2i
    //   1453: ldc_w 303934808
    //   1456: ixor
    //   1457: getstatic Perryc.1 : I
    //   1460: ifeq -> 1474
    //   1463: ldc2_w -1210058834
    //   1466: l2i
    //   1467: ldc_w 776648287
    //   1470: ixor
    //   1471: goto -> 1482
    //   1474: ldc2_w 678242167
    //   1477: l2i
    //   1478: ldc_w 41015828
    //   1481: ixor
    //   1482: ldc2_w 422400855
    //   1485: l2i
    //   1486: ldc_w -2001936168
    //   1489: ixor
    //   1490: ixor
    //   1491: lookupswitch default -> 1516, -1617572498 -> 1474, 135590526 -> 6684
    //   1516: getstatic net/minecraft/init/Blocks.field_190984_ds : Lnet/minecraft/block/Block;
    //   1519: aastore
    //   1520: dup
    //   1521: ldc2_w -599716761
    //   1524: l2i
    //   1525: ldc_w -599716753
    //   1528: ixor
    //   1529: getstatic Perryc.1 : I
    //   1532: ifeq -> 1546
    //   1535: ldc2_w 571865148
    //   1538: l2i
    //   1539: ldc_w 1905037132
    //   1542: ixor
    //   1543: goto -> 1554
    //   1546: ldc2_w -598975589
    //   1549: l2i
    //   1550: ldc_w -1907040380
    //   1553: ixor
    //   1554: ldc2_w -906218374
    //   1557: l2i
    //   1558: ldc_w -927703411
    //   1561: ixor
    //   1562: ixor
    //   1563: lookupswitch default -> 1588, 1389436295 -> 6624, 1515045240 -> 1546
    //   1588: getstatic net/minecraft/init/Blocks.field_190985_dt : Lnet/minecraft/block/Block;
    //   1591: aastore
    //   1592: dup
    //   1593: ldc2_w -1796391894
    //   1596: l2i
    //   1597: ldc_w -1796391901
    //   1600: ixor
    //   1601: getstatic Perryc.0 : I
    //   1604: ifle -> 1618
    //   1607: ldc2_w -358095464
    //   1610: l2i
    //   1611: ldc_w 438439565
    //   1614: ixor
    //   1615: goto -> 1626
    //   1618: ldc2_w 832052970
    //   1621: l2i
    //   1622: ldc_w 69449815
    //   1625: ixor
    //   1626: ldc2_w -1274190584
    //   1629: l2i
    //   1630: ldc_w -129498989
    //   1633: ixor
    //   1634: ixor
    //   1635: lookupswitch default -> 6784, -1128231282 -> 1618, 2046739238 -> 1660
    //   1660: getstatic net/minecraft/init/Blocks.field_190986_du : Lnet/minecraft/block/Block;
    //   1663: aastore
    //   1664: dup
    //   1665: ldc2_w -1916698839
    //   1668: l2i
    //   1669: ldc_w -1916698845
    //   1672: ixor
    //   1673: getstatic Perryc.1 : I
    //   1676: ifeq -> 1690
    //   1679: ldc2_w 1911336146
    //   1682: l2i
    //   1683: ldc_w -752874569
    //   1686: ixor
    //   1687: goto -> 1698
    //   1690: ldc2_w 1477163937
    //   1693: l2i
    //   1694: ldc_w -1201295109
    //   1697: ixor
    //   1698: ldc2_w 1671462216
    //   1701: l2i
    //   1702: ldc_w 627317704
    //   1705: ixor
    //   1706: ixor
    //   1707: lookupswitch default -> 1732, -469188123 -> 6622, 565046810 -> 1690
    //   1732: getstatic net/minecraft/init/Blocks.field_190987_dv : Lnet/minecraft/block/Block;
    //   1735: aastore
    //   1736: dup
    //   1737: ldc2_w 1570138666
    //   1740: l2i
    //   1741: ldc_w 1570138657
    //   1744: ixor
    //   1745: getstatic Perryc.0 : I
    //   1748: ifle -> 1762
    //   1751: ldc2_w -915962629
    //   1754: l2i
    //   1755: ldc_w -2039842918
    //   1758: ixor
    //   1759: goto -> 1770
    //   1762: ldc2_w -952900918
    //   1765: l2i
    //   1766: ldc_w -620142668
    //   1769: ixor
    //   1770: ldc2_w 1613786449
    //   1773: l2i
    //   1774: ldc_w 584277464
    //   1777: ixor
    //   1778: ixor
    //   1779: lookupswitch default -> 6618, 233751528 -> 1762, 1591315959 -> 1804
    //   1804: getstatic net/minecraft/init/Blocks.field_190988_dw : Lnet/minecraft/block/Block;
    //   1807: aastore
    //   1808: dup
    //   1809: ldc2_w 1581289282
    //   1812: l2i
    //   1813: ldc_w 1581289294
    //   1816: ixor
    //   1817: getstatic Perryc.1 : I
    //   1820: ifeq -> 1834
    //   1823: ldc2_w -409365204
    //   1826: l2i
    //   1827: ldc_w 1256141042
    //   1830: ixor
    //   1831: goto -> 1842
    //   1834: ldc2_w -1884736413
    //   1837: l2i
    //   1838: ldc_w -1178200911
    //   1841: ixor
    //   1842: ldc2_w 1625237200
    //   1845: l2i
    //   1846: ldc_w 1830439941
    //   1849: ixor
    //   1850: ixor
    //   1851: lookupswitch default -> 1876, -1601974517 -> 6658, 291279605 -> 1834
    //   1876: getstatic net/minecraft/init/Blocks.field_190989_dx : Lnet/minecraft/block/Block;
    //   1879: aastore
    //   1880: dup
    //   1881: ldc2_w -975091071
    //   1884: l2i
    //   1885: ldc_w -975091060
    //   1888: ixor
    //   1889: getstatic Perryc.c : I
    //   1892: iflt -> 1906
    //   1895: ldc2_w 419929813
    //   1898: l2i
    //   1899: ldc_w -161779059
    //   1902: ixor
    //   1903: goto -> 1914
    //   1906: ldc2_w 1572433391
    //   1909: l2i
    //   1910: ldc_w -1096575068
    //   1913: ixor
    //   1914: ldc2_w -1839235934
    //   1917: l2i
    //   1918: ldc_w -1013081681
    //   1921: ixor
    //   1922: ixor
    //   1923: lookupswitch default -> 6652, -1294459066 -> 1948, -1096939179 -> 1906
    //   1948: getstatic net/minecraft/init/Blocks.field_190990_dy : Lnet/minecraft/block/Block;
    //   1951: aastore
    //   1952: dup
    //   1953: ldc2_w -727678195
    //   1956: l2i
    //   1957: ldc_w -727678205
    //   1960: ixor
    //   1961: getstatic Perryc.1 : I
    //   1964: ifeq -> 1978
    //   1967: ldc2_w 1240063110
    //   1970: l2i
    //   1971: ldc_w 1772889984
    //   1974: ixor
    //   1975: goto -> 1986
    //   1978: ldc2_w 1844140874
    //   1981: l2i
    //   1982: ldc_w -1647504818
    //   1985: ixor
    //   1986: ldc2_w 1420860760
    //   1989: l2i
    //   1990: ldc_w 616376758
    //   1993: ixor
    //   1994: ixor
    //   1995: lookupswitch default -> 6696, -2144600598 -> 2020, 1346916328 -> 1978
    //   2020: getstatic net/minecraft/init/Blocks.field_190991_dz : Lnet/minecraft/block/Block;
    //   2023: aastore
    //   2024: dup
    //   2025: ldc2_w 196641154
    //   2028: l2i
    //   2029: ldc_w 196641165
    //   2032: ixor
    //   2033: getstatic Perryc.c : I
    //   2036: iflt -> 2050
    //   2039: ldc2_w 899788952
    //   2042: l2i
    //   2043: ldc_w 610794464
    //   2046: ixor
    //   2047: goto -> 2058
    //   2050: ldc2_w 1810341585
    //   2053: l2i
    //   2054: ldc_w 2111582127
    //   2057: ixor
    //   2058: ldc2_w -1524076473
    //   2061: l2i
    //   2062: ldc_w -1172064712
    //   2065: ixor
    //   2066: ixor
    //   2067: lookupswitch default -> 6628, 154171137 -> 2092, 248352007 -> 2050
    //   2092: getstatic net/minecraft/init/Blocks.field_190975_dA : Lnet/minecraft/block/Block;
    //   2095: aastore
    //   2096: getstatic Perryc.1 : I
    //   2099: ifeq -> 2113
    //   2102: ldc2_w -1850174340
    //   2105: l2i
    //   2106: ldc_w 1542738764
    //   2109: ixor
    //   2110: goto -> 2121
    //   2113: ldc2_w -697372884
    //   2116: l2i
    //   2117: ldc_w -93461940
    //   2120: ixor
    //   2121: ldc2_w 1785458919
    //   2124: l2i
    //   2125: ldc_w -1222784980
    //   2128: ixor
    //   2129: ixor
    //   2130: lookupswitch default -> 2156, 389742587 -> 6748, 2046235707 -> 2113
    //   2156: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   2159: getstatic Perryc.0 : I
    //   2162: ifle -> 2176
    //   2165: ldc2_w 834903787
    //   2168: l2i
    //   2169: ldc_w 444298158
    //   2172: ixor
    //   2173: goto -> 2184
    //   2176: ldc2_w 265272784
    //   2179: l2i
    //   2180: ldc_w -1022583084
    //   2183: ixor
    //   2184: ldc2_w 248172981
    //   2187: l2i
    //   2188: ldc_w 2086927386
    //   2191: ixor
    //   2192: ixor
    //   2193: lookupswitch default -> 2220, -1710755245 -> 2176, 1494335722 -> 6750
    //   2220: putstatic bigname/zprestige/webhack/util/BlockUtil.shulkerList : Ljava/util/List;
    //   2223: ldc2_w 569637636
    //   2226: l2i
    //   2227: ldc_w 569637632
    //   2230: ixor
    //   2231: anewarray net/minecraft/block/Block
    //   2234: dup
    //   2235: ldc2_w -671275332
    //   2238: l2i
    //   2239: ldc_w -671275332
    //   2242: ixor
    //   2243: getstatic Perryc.1 : I
    //   2246: ifeq -> 2260
    //   2249: ldc2_w 2040331170
    //   2252: l2i
    //   2253: ldc_w 1435552509
    //   2256: ixor
    //   2257: goto -> 2268
    //   2260: ldc2_w 1236679680
    //   2263: l2i
    //   2264: ldc_w 2137169989
    //   2267: ixor
    //   2268: ldc2_w 1663805064
    //   2271: l2i
    //   2272: ldc_w 1258978356
    //   2275: ixor
    //   2276: ixor
    //   2277: lookupswitch default -> 6776, 70118371 -> 2260, 519390969 -> 2304
    //   2304: getstatic net/minecraft/init/Blocks.field_150343_Z : Lnet/minecraft/block/Block;
    //   2307: aastore
    //   2308: dup
    //   2309: ldc2_w 932176377
    //   2312: l2i
    //   2313: ldc_w 932176376
    //   2316: ixor
    //   2317: getstatic Perryc.0 : I
    //   2320: ifle -> 2334
    //   2323: ldc2_w 1559690918
    //   2326: l2i
    //   2327: ldc_w -270407132
    //   2330: ixor
    //   2331: goto -> 2342
    //   2334: ldc2_w -610762268
    //   2337: l2i
    //   2338: ldc_w 729893947
    //   2341: ixor
    //   2342: ldc2_w -1776683379
    //   2345: l2i
    //   2346: ldc_w 1082887477
    //   2349: ixor
    //   2350: ixor
    //   2351: lookupswitch default -> 6706, 646690407 -> 2376, 1703243578 -> 2334
    //   2376: getstatic net/minecraft/init/Blocks.field_150357_h : Lnet/minecraft/block/Block;
    //   2379: aastore
    //   2380: dup
    //   2381: ldc2_w 369375378
    //   2384: l2i
    //   2385: ldc_w 369375376
    //   2388: ixor
    //   2389: getstatic Perryc.0 : I
    //   2392: ifle -> 2406
    //   2395: ldc2_w -1450725998
    //   2398: l2i
    //   2399: ldc_w 1864539536
    //   2402: ixor
    //   2403: goto -> 2414
    //   2406: ldc2_w 1658227896
    //   2409: l2i
    //   2410: ldc_w 1338980674
    //   2413: ixor
    //   2414: ldc2_w -1916984961
    //   2417: l2i
    //   2418: ldc_w -422273364
    //   2421: ixor
    //   2422: ixor
    //   2423: lookupswitch default -> 6752, -1379102767 -> 2406, 1181747753 -> 2448
    //   2448: getstatic net/minecraft/init/Blocks.field_150477_bB : Lnet/minecraft/block/Block;
    //   2451: aastore
    //   2452: dup
    //   2453: ldc2_w 955935362
    //   2456: l2i
    //   2457: ldc_w 955935361
    //   2460: ixor
    //   2461: getstatic Perryc.1 : I
    //   2464: ifeq -> 2478
    //   2467: ldc2_w -427777798
    //   2470: l2i
    //   2471: ldc_w 476796036
    //   2474: ixor
    //   2475: goto -> 2486
    //   2478: ldc2_w 187679427
    //   2481: l2i
    //   2482: ldc_w -1928881904
    //   2485: ixor
    //   2486: ldc2_w 1085882692
    //   2489: l2i
    //   2490: ldc_w 1549143207
    //   2493: ixor
    //   2494: ixor
    //   2495: lookupswitch default -> 6702, -1698228688 -> 2520, -435897955 -> 2478
    //   2520: getstatic net/minecraft/init/Blocks.field_150467_bQ : Lnet/minecraft/block/Block;
    //   2523: aastore
    //   2524: getstatic Perryc.c : I
    //   2527: iflt -> 2541
    //   2530: ldc2_w 103277427
    //   2533: l2i
    //   2534: ldc_w 320571495
    //   2537: ixor
    //   2538: goto -> 2549
    //   2541: ldc2_w 2117641975
    //   2544: l2i
    //   2545: ldc_w 215522092
    //   2548: ixor
    //   2549: ldc2_w -1799810762
    //   2552: l2i
    //   2553: ldc_w -1017138177
    //   2556: ixor
    //   2557: ixor
    //   2558: lookupswitch default -> 6672, 621190930 -> 2584, 1121634781 -> 2541
    //   2584: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   2587: getstatic Perryc.c : I
    //   2590: iflt -> 2604
    //   2593: ldc2_w 556786463
    //   2596: l2i
    //   2597: ldc_w -124857770
    //   2600: ixor
    //   2601: goto -> 2612
    //   2604: ldc2_w 521907035
    //   2607: l2i
    //   2608: ldc_w -356736736
    //   2611: ixor
    //   2612: ldc2_w -1017657016
    //   2615: l2i
    //   2616: ldc_w 731778419
    //   2619: ixor
    //   2620: ixor
    //   2621: lookupswitch default -> 6788, 493801024 -> 2648, 828962162 -> 2604
    //   2648: putstatic bigname/zprestige/webhack/util/BlockUtil.unSafeBlocks : Ljava/util/List;
    //   2651: ldc2_w -2090792424
    //   2654: l2i
    //   2655: ldc_w -2090792403
    //   2658: ixor
    //   2659: anewarray net/minecraft/block/Block
    //   2662: dup
    //   2663: ldc2_w 291458830
    //   2666: l2i
    //   2667: ldc_w 291458830
    //   2670: ixor
    //   2671: getstatic Perryc.1 : I
    //   2674: ifeq -> 2688
    //   2677: ldc2_w 1322360788
    //   2680: l2i
    //   2681: ldc_w -435878910
    //   2684: ixor
    //   2685: goto -> 2696
    //   2688: ldc2_w -1426897165
    //   2691: l2i
    //   2692: ldc_w -1039339672
    //   2695: ixor
    //   2696: ldc2_w -83195645
    //   2699: l2i
    //   2700: ldc_w -929839998
    //   2703: ixor
    //   2704: ixor
    //   2705: lookupswitch default -> 2732, -1689397673 -> 6656, -986425777 -> 2688
    //   2732: getstatic net/minecraft/init/Blocks.field_150356_k : Lnet/minecraft/block/BlockDynamicLiquid;
    //   2735: aastore
    //   2736: dup
    //   2737: ldc2_w -668887016
    //   2740: l2i
    //   2741: ldc_w -668887015
    //   2744: ixor
    //   2745: getstatic Perryc.c : I
    //   2748: iflt -> 2762
    //   2751: ldc2_w 1189260076
    //   2754: l2i
    //   2755: ldc_w -1184008680
    //   2758: ixor
    //   2759: goto -> 2770
    //   2762: ldc2_w -191778025
    //   2765: l2i
    //   2766: ldc_w 469483776
    //   2769: ixor
    //   2770: ldc2_w 148023320
    //   2773: l2i
    //   2774: ldc_w -667312247
    //   2777: ixor
    //   2778: ixor
    //   2779: lookupswitch default -> 6730, 795142821 -> 2762, 1065436550 -> 2804
    //   2804: getstatic net/minecraft/init/Blocks.field_150457_bL : Lnet/minecraft/block/Block;
    //   2807: aastore
    //   2808: dup
    //   2809: ldc2_w 481322253
    //   2812: l2i
    //   2813: ldc_w 481322255
    //   2816: ixor
    //   2817: getstatic Perryc.0 : I
    //   2820: ifle -> 2834
    //   2823: ldc2_w 1258899572
    //   2826: l2i
    //   2827: ldc_w -844448500
    //   2830: ixor
    //   2831: goto -> 2842
    //   2834: ldc2_w 222859452
    //   2837: l2i
    //   2838: ldc_w -707159324
    //   2841: ixor
    //   2842: ldc2_w 1086911323
    //   2845: l2i
    //   2846: ldc_w -701836956
    //   2849: ixor
    //   2850: ixor
    //   2851: lookupswitch default -> 6662, 272750407 -> 2834, 1316169831 -> 2876
    //   2876: getstatic net/minecraft/init/Blocks.field_150433_aE : Lnet/minecraft/block/Block;
    //   2879: aastore
    //   2880: dup
    //   2881: ldc2_w -811070358
    //   2884: l2i
    //   2885: ldc_w -811070359
    //   2888: ixor
    //   2889: getstatic Perryc.c : I
    //   2892: iflt -> 2906
    //   2895: ldc2_w 681262732
    //   2898: l2i
    //   2899: ldc_w 1290883061
    //   2902: ixor
    //   2903: goto -> 2914
    //   2906: ldc2_w 1809060145
    //   2909: l2i
    //   2910: ldc_w 1686548350
    //   2913: ixor
    //   2914: ldc2_w -1984444925
    //   2917: l2i
    //   2918: ldc_w -1118813836
    //   2921: ixor
    //   2922: ixor
    //   2923: lookupswitch default -> 2948, 1351480846 -> 6690, 1661361277 -> 2906
    //   2948: getstatic net/minecraft/init/Blocks.field_150404_cg : Lnet/minecraft/block/Block;
    //   2951: aastore
    //   2952: dup
    //   2953: ldc2_w -131868300
    //   2956: l2i
    //   2957: ldc_w -131868304
    //   2960: ixor
    //   2961: getstatic Perryc.c : I
    //   2964: iflt -> 2978
    //   2967: ldc2_w -581496
    //   2970: l2i
    //   2971: ldc_w -1568600863
    //   2974: ixor
    //   2975: goto -> 2986
    //   2978: ldc2_w 1199653811
    //   2981: l2i
    //   2982: ldc_w 846454563
    //   2985: ixor
    //   2986: ldc2_w -368471943
    //   2989: l2i
    //   2990: ldc_w -626075099
    //   2993: ixor
    //   2994: ixor
    //   2995: lookupswitch default -> 3020, -1589343014 -> 2978, 1842439733 -> 6758
    //   3020: getstatic net/minecraft/init/Blocks.field_185764_cQ : Lnet/minecraft/block/Block;
    //   3023: aastore
    //   3024: dup
    //   3025: ldc2_w 37547353
    //   3028: l2i
    //   3029: ldc_w 37547356
    //   3032: ixor
    //   3033: getstatic Perryc.c : I
    //   3036: iflt -> 3050
    //   3039: ldc2_w 1543752301
    //   3042: l2i
    //   3043: ldc_w 1153377667
    //   3046: ixor
    //   3047: goto -> 3058
    //   3050: ldc2_w -1743917196
    //   3053: l2i
    //   3054: ldc_w 1522983183
    //   3057: ixor
    //   3058: ldc2_w 1657926871
    //   3061: l2i
    //   3062: ldc_w 765611632
    //   3065: ixor
    //   3066: ixor
    //   3067: lookupswitch default -> 3092, -2119415159 -> 3050, 1473205577 -> 6772
    //   3092: getstatic net/minecraft/init/Blocks.field_150465_bP : Lnet/minecraft/block/BlockSkull;
    //   3095: aastore
    //   3096: dup
    //   3097: ldc2_w 1356002503
    //   3100: l2i
    //   3101: ldc_w 1356002497
    //   3104: ixor
    //   3105: getstatic Perryc.1 : I
    //   3108: ifeq -> 3122
    //   3111: ldc2_w -1320208511
    //   3114: l2i
    //   3115: ldc_w 886437706
    //   3118: ixor
    //   3119: goto -> 3130
    //   3122: ldc2_w 1528809267
    //   3125: l2i
    //   3126: ldc_w 1894275781
    //   3129: ixor
    //   3130: ldc2_w -516639560
    //   3133: l2i
    //   3134: ldc_w 121559298
    //   3137: ixor
    //   3138: ixor
    //   3139: lookupswitch default -> 6654, -838995892 -> 3164, 1670425969 -> 3122
    //   3164: getstatic net/minecraft/init/Blocks.field_150457_bL : Lnet/minecraft/block/Block;
    //   3167: aastore
    //   3168: dup
    //   3169: ldc2_w 1885325327
    //   3172: l2i
    //   3173: ldc_w 1885325320
    //   3176: ixor
    //   3177: getstatic Perryc.1 : I
    //   3180: ifeq -> 3194
    //   3183: ldc2_w 449158304
    //   3186: l2i
    //   3187: ldc_w 281169511
    //   3190: ixor
    //   3191: goto -> 3202
    //   3194: ldc2_w -1080936769
    //   3197: l2i
    //   3198: ldc_w -1024832903
    //   3201: ixor
    //   3202: ldc2_w 1048386713
    //   3205: l2i
    //   3206: ldc_w 2061721775
    //   3209: ixor
    //   3210: ixor
    //   3211: lookupswitch default -> 3236, -781136318 -> 3194, 1318694641 -> 6726
    //   3236: getstatic net/minecraft/init/Blocks.field_150473_bD : Lnet/minecraft/block/Block;
    //   3239: aastore
    //   3240: dup
    //   3241: ldc2_w 1407394404
    //   3244: l2i
    //   3245: ldc_w 1407394412
    //   3248: ixor
    //   3249: getstatic Perryc.0 : I
    //   3252: ifle -> 3266
    //   3255: ldc2_w -1167127313
    //   3258: l2i
    //   3259: ldc_w 302129341
    //   3262: ixor
    //   3263: goto -> 3274
    //   3266: ldc2_w 13676191
    //   3269: l2i
    //   3270: ldc_w -1309368317
    //   3273: ixor
    //   3274: ldc2_w 1512913129
    //   3277: l2i
    //   3278: ldc_w 325721336
    //   3281: ixor
    //   3282: ixor
    //   3283: lookupswitch default -> 6746, -517339069 -> 3266, -127718771 -> 3308
    //   3308: getstatic net/minecraft/init/Blocks.field_150479_bC : Lnet/minecraft/block/BlockTripWireHook;
    //   3311: aastore
    //   3312: dup
    //   3313: ldc2_w 380832767
    //   3316: l2i
    //   3317: ldc_w 380832758
    //   3320: ixor
    //   3321: getstatic Perryc.c : I
    //   3324: iflt -> 3338
    //   3327: ldc2_w -818018860
    //   3330: l2i
    //   3331: ldc_w 971825940
    //   3334: ixor
    //   3335: goto -> 3346
    //   3338: ldc2_w -436581403
    //   3341: l2i
    //   3342: ldc_w -1674462064
    //   3345: ixor
    //   3346: ldc2_w 1132090274
    //   3349: l2i
    //   3350: ldc_w -18487649
    //   3353: ixor
    //   3354: ixor
    //   3355: lookupswitch default -> 3380, 212671372 -> 3338, 1263358973 -> 6722
    //   3380: getstatic net/minecraft/init/Blocks.field_150471_bO : Lnet/minecraft/block/Block;
    //   3383: aastore
    //   3384: dup
    //   3385: ldc2_w 791837088
    //   3388: l2i
    //   3389: ldc_w 791837098
    //   3392: ixor
    //   3393: getstatic Perryc.c : I
    //   3396: iflt -> 3410
    //   3399: ldc2_w -18662876
    //   3402: l2i
    //   3403: ldc_w -1287608239
    //   3406: ixor
    //   3407: goto -> 3418
    //   3410: ldc2_w -1640955689
    //   3413: l2i
    //   3414: ldc_w 1880398642
    //   3417: ixor
    //   3418: ldc2_w -1103753295
    //   3421: l2i
    //   3422: ldc_w 1762452347
    //   3425: ixor
    //   3426: ixor
    //   3427: lookupswitch default -> 3452, -1701216577 -> 6732, 1138724602 -> 3410
    //   3452: getstatic net/minecraft/init/Blocks.field_150442_at : Lnet/minecraft/block/Block;
    //   3455: aastore
    //   3456: dup
    //   3457: ldc2_w -1893787499
    //   3460: l2i
    //   3461: ldc_w -1893787490
    //   3464: ixor
    //   3465: getstatic Perryc.1 : I
    //   3468: ifeq -> 3482
    //   3471: ldc2_w 907759519
    //   3474: l2i
    //   3475: ldc_w -687536131
    //   3478: ixor
    //   3479: goto -> 3490
    //   3482: ldc2_w 2104186066
    //   3485: l2i
    //   3486: ldc_w 378932008
    //   3489: ixor
    //   3490: ldc2_w -593529514
    //   3493: l2i
    //   3494: ldc_w -1054599295
    //   3497: ixor
    //   3498: ixor
    //   3499: lookupswitch default -> 6766, -56284491 -> 3482, 1984314669 -> 3524
    //   3524: getstatic net/minecraft/init/Blocks.field_150430_aB : Lnet/minecraft/block/Block;
    //   3527: aastore
    //   3528: dup
    //   3529: ldc2_w 979931220
    //   3532: l2i
    //   3533: ldc_w 979931224
    //   3536: ixor
    //   3537: getstatic Perryc.0 : I
    //   3540: ifle -> 3554
    //   3543: ldc2_w 574083798
    //   3546: l2i
    //   3547: ldc_w -176997738
    //   3550: ixor
    //   3551: goto -> 3562
    //   3554: ldc2_w -687003984
    //   3557: l2i
    //   3558: ldc_w -131589290
    //   3561: ixor
    //   3562: ldc2_w 1215274177
    //   3565: l2i
    //   3566: ldc_w 1003834412
    //   3569: ixor
    //   3570: ixor
    //   3571: lookupswitch default -> 3596, -1526843219 -> 6778, 1373860000 -> 3554
    //   3596: getstatic net/minecraft/init/Blocks.field_150468_ap : Lnet/minecraft/block/Block;
    //   3599: aastore
    //   3600: dup
    //   3601: ldc2_w -1557318849
    //   3604: l2i
    //   3605: ldc_w -1557318862
    //   3608: ixor
    //   3609: getstatic Perryc.0 : I
    //   3612: ifle -> 3626
    //   3615: ldc2_w -530616895
    //   3618: l2i
    //   3619: ldc_w 646789979
    //   3622: ixor
    //   3623: goto -> 3634
    //   3626: ldc2_w -6112804
    //   3629: l2i
    //   3630: ldc_w 1870843701
    //   3633: ixor
    //   3634: ldc2_w 779444641
    //   3637: l2i
    //   3638: ldc_w -1037882537
    //   3641: ixor
    //   3642: ixor
    //   3643: lookupswitch default -> 6704, 713301100 -> 3626, 2088123423 -> 3668
    //   3668: getstatic net/minecraft/init/Blocks.field_150441_bU : Lnet/minecraft/block/BlockRedstoneComparator;
    //   3671: aastore
    //   3672: dup
    //   3673: ldc2_w 1331340004
    //   3676: l2i
    //   3677: ldc_w 1331340010
    //   3680: ixor
    //   3681: getstatic Perryc.c : I
    //   3684: iflt -> 3698
    //   3687: ldc2_w -69479234
    //   3690: l2i
    //   3691: ldc_w 1922782642
    //   3694: ixor
    //   3695: goto -> 3706
    //   3698: ldc2_w -843654948
    //   3701: l2i
    //   3702: ldc_w 161585384
    //   3705: ixor
    //   3706: ldc2_w -1485750565
    //   3709: l2i
    //   3710: ldc_w 788427218
    //   3713: ixor
    //   3714: ixor
    //   3715: lookupswitch default -> 3740, -1617294763 -> 3698, 13618693 -> 6698
    //   3740: getstatic net/minecraft/init/Blocks.field_150455_bV : Lnet/minecraft/block/BlockRedstoneComparator;
    //   3743: aastore
    //   3744: dup
    //   3745: ldc2_w -2011297692
    //   3748: l2i
    //   3749: ldc_w -2011297685
    //   3752: ixor
    //   3753: getstatic Perryc.1 : I
    //   3756: ifeq -> 3770
    //   3759: ldc2_w 827153881
    //   3762: l2i
    //   3763: ldc_w 2113533853
    //   3766: ixor
    //   3767: goto -> 3778
    //   3770: ldc2_w -1758760188
    //   3773: l2i
    //   3774: ldc_w 1173600301
    //   3777: ixor
    //   3778: ldc2_w 2144199107
    //   3781: l2i
    //   3782: ldc_w -2020966644
    //   3785: ixor
    //   3786: ixor
    //   3787: lookupswitch default -> 3812, -1259129717 -> 6768, -1248767270 -> 3770
    //   3812: getstatic net/minecraft/init/Blocks.field_150413_aR : Lnet/minecraft/block/BlockRedstoneRepeater;
    //   3815: aastore
    //   3816: dup
    //   3817: ldc2_w -1853004531
    //   3820: l2i
    //   3821: ldc_w -1853004515
    //   3824: ixor
    //   3825: getstatic Perryc.0 : I
    //   3828: ifle -> 3842
    //   3831: ldc2_w 1933543065
    //   3834: l2i
    //   3835: ldc_w 621998831
    //   3838: ixor
    //   3839: goto -> 3850
    //   3842: ldc2_w 2120194393
    //   3845: l2i
    //   3846: ldc_w 1359151481
    //   3849: ixor
    //   3850: ldc2_w -2046034869
    //   3853: l2i
    //   3854: ldc_w 995557879
    //   3857: ixor
    //   3858: ixor
    //   3859: lookupswitch default -> 3884, -344880694 -> 6674, -321030519 -> 3842
    //   3884: getstatic net/minecraft/init/Blocks.field_150416_aS : Lnet/minecraft/block/BlockRedstoneRepeater;
    //   3887: aastore
    //   3888: dup
    //   3889: ldc2_w 1181247921
    //   3892: l2i
    //   3893: ldc_w 1181247904
    //   3896: ixor
    //   3897: getstatic Perryc.c : I
    //   3900: iflt -> 3914
    //   3903: ldc2_w -1156225926
    //   3906: l2i
    //   3907: ldc_w 869619046
    //   3910: ixor
    //   3911: goto -> 3922
    //   3914: ldc2_w 314688297
    //   3917: l2i
    //   3918: ldc_w 1944013468
    //   3921: ixor
    //   3922: ldc2_w -1160599441
    //   3925: l2i
    //   3926: ldc_w -319145175
    //   3929: ixor
    //   3930: ixor
    //   3931: lookupswitch default -> 6682, -555179430 -> 3914, 926292723 -> 3956
    //   3956: getstatic net/minecraft/init/Blocks.field_150437_az : Lnet/minecraft/block/Block;
    //   3959: aastore
    //   3960: dup
    //   3961: ldc2_w 659050029
    //   3964: l2i
    //   3965: ldc_w 659050047
    //   3968: ixor
    //   3969: getstatic Perryc.1 : I
    //   3972: ifeq -> 3986
    //   3975: ldc2_w 1608119314
    //   3978: l2i
    //   3979: ldc_w 1324685342
    //   3982: ixor
    //   3983: goto -> 3994
    //   3986: ldc2_w -106506438
    //   3989: l2i
    //   3990: ldc_w 1732101644
    //   3993: ixor
    //   3994: ldc2_w -226207684
    //   3997: l2i
    //   3998: ldc_w 848556848
    //   4001: ixor
    //   4002: ixor
    //   4003: lookupswitch default -> 6762, -784644352 -> 3986, 1586281018 -> 4028
    //   4028: getstatic net/minecraft/init/Blocks.field_150429_aA : Lnet/minecraft/block/Block;
    //   4031: aastore
    //   4032: dup
    //   4033: ldc2_w 1150536462
    //   4036: l2i
    //   4037: ldc_w 1150536477
    //   4040: ixor
    //   4041: getstatic Perryc.1 : I
    //   4044: ifeq -> 4058
    //   4047: ldc2_w -45104250
    //   4050: l2i
    //   4051: ldc_w 1598000936
    //   4054: ixor
    //   4055: goto -> 4066
    //   4058: ldc2_w -1447418799
    //   4061: l2i
    //   4062: ldc_w 1593934752
    //   4065: ixor
    //   4066: ldc2_w -712491160
    //   4069: l2i
    //   4070: ldc_w 1669101979
    //   4073: ixor
    //   4074: ixor
    //   4075: lookupswitch default -> 6736, 344197725 -> 4058, 1078976770 -> 4100
    //   4100: getstatic net/minecraft/init/Blocks.field_150488_af : Lnet/minecraft/block/BlockRedstoneWire;
    //   4103: aastore
    //   4104: dup
    //   4105: ldc2_w -86508710
    //   4108: l2i
    //   4109: ldc_w -86508722
    //   4112: ixor
    //   4113: getstatic Perryc.c : I
    //   4116: iflt -> 4130
    //   4119: ldc2_w -726318398
    //   4122: l2i
    //   4123: ldc_w -892611734
    //   4126: ixor
    //   4127: goto -> 4138
    //   4130: ldc2_w 1055002721
    //   4133: l2i
    //   4134: ldc_w -883880168
    //   4137: ixor
    //   4138: ldc2_w -1427720214
    //   4141: l2i
    //   4142: ldc_w -471644004
    //   4145: ixor
    //   4146: ixor
    //   4147: lookupswitch default -> 4172, 1467707102 -> 6642, 2031744940 -> 4130
    //   4172: getstatic net/minecraft/init/Blocks.field_150350_a : Lnet/minecraft/block/Block;
    //   4175: aastore
    //   4176: dup
    //   4177: ldc2_w -1005404639
    //   4180: l2i
    //   4181: ldc_w -1005404620
    //   4184: ixor
    //   4185: getstatic Perryc.0 : I
    //   4188: ifle -> 4202
    //   4191: ldc2_w 1196728286
    //   4194: l2i
    //   4195: ldc_w 718807915
    //   4198: ixor
    //   4199: goto -> 4210
    //   4202: ldc2_w 2034595026
    //   4205: l2i
    //   4206: ldc_w 1017836068
    //   4209: ixor
    //   4210: ldc2_w 1642085213
    //   4213: l2i
    //   4214: ldc_w -347544273
    //   4217: ixor
    //   4218: ixor
    //   4219: lookupswitch default -> 4244, -417045817 -> 6678, 1999077967 -> 4202
    //   4244: getstatic net/minecraft/init/Blocks.field_150427_aO : Lnet/minecraft/block/BlockPortal;
    //   4247: aastore
    //   4248: dup
    //   4249: ldc2_w -995721146
    //   4252: l2i
    //   4253: ldc_w -995721136
    //   4256: ixor
    //   4257: getstatic Perryc.0 : I
    //   4260: ifle -> 4274
    //   4263: ldc2_w 555471703
    //   4266: l2i
    //   4267: ldc_w 1262131596
    //   4270: ixor
    //   4271: goto -> 4282
    //   4274: ldc2_w -2071117921
    //   4277: l2i
    //   4278: ldc_w -353493314
    //   4281: ixor
    //   4282: ldc2_w -1739197907
    //   4285: l2i
    //   4286: ldc_w 358741993
    //   4289: ixor
    //   4290: ixor
    //   4291: lookupswitch default -> 4316, -2087350321 -> 4274, -418033889 -> 6614
    //   4316: getstatic net/minecraft/init/Blocks.field_150384_bq : Lnet/minecraft/block/Block;
    //   4319: aastore
    //   4320: dup
    //   4321: ldc2_w -1258085027
    //   4324: l2i
    //   4325: ldc_w -1258085046
    //   4328: ixor
    //   4329: getstatic Perryc.c : I
    //   4332: iflt -> 4346
    //   4335: ldc2_w -1949662675
    //   4338: l2i
    //   4339: ldc_w 1002382334
    //   4342: ixor
    //   4343: goto -> 4354
    //   4346: ldc2_w -910404886
    //   4349: l2i
    //   4350: ldc_w 1381951439
    //   4353: ixor
    //   4354: ldc2_w -672201990
    //   4357: l2i
    //   4358: ldc_w -2004117034
    //   4361: ixor
    //   4362: ixor
    //   4363: lookupswitch default -> 6668, -997839351 -> 4388, -284083457 -> 4346
    //   4388: getstatic net/minecraft/init/Blocks.field_150355_j : Lnet/minecraft/block/BlockStaticLiquid;
    //   4391: aastore
    //   4392: dup
    //   4393: ldc2_w 1528736058
    //   4396: l2i
    //   4397: ldc_w 1528736034
    //   4400: ixor
    //   4401: getstatic Perryc.c : I
    //   4404: iflt -> 4418
    //   4407: ldc2_w -611248896
    //   4410: l2i
    //   4411: ldc_w 524978232
    //   4414: ixor
    //   4415: goto -> 4426
    //   4418: ldc2_w -119179030
    //   4421: l2i
    //   4422: ldc_w -82350200
    //   4425: ixor
    //   4426: ldc2_w 2046297790
    //   4429: l2i
    //   4430: ldc_w -1570470365
    //   4433: ixor
    //   4434: ixor
    //   4435: lookupswitch default -> 6764, -663840769 -> 4460, 524754341 -> 4418
    //   4460: getstatic net/minecraft/init/Blocks.field_150358_i : Lnet/minecraft/block/BlockDynamicLiquid;
    //   4463: aastore
    //   4464: dup
    //   4465: ldc2_w -838921720
    //   4468: l2i
    //   4469: ldc_w -838921711
    //   4472: ixor
    //   4473: getstatic Perryc.0 : I
    //   4476: ifle -> 4490
    //   4479: ldc2_w -2097023849
    //   4482: l2i
    //   4483: ldc_w -492587066
    //   4486: ixor
    //   4487: goto -> 4498
    //   4490: ldc2_w -817555562
    //   4493: l2i
    //   4494: ldc_w -82217455
    //   4497: ixor
    //   4498: ldc2_w -379234955
    //   4501: l2i
    //   4502: ldc_w 1908239551
    //   4505: ixor
    //   4506: ixor
    //   4507: lookupswitch default -> 6754, -1400612787 -> 4532, -109413733 -> 4490
    //   4532: getstatic net/minecraft/init/Blocks.field_150353_l : Lnet/minecraft/block/BlockStaticLiquid;
    //   4535: aastore
    //   4536: dup
    //   4537: ldc2_w -875727557
    //   4540: l2i
    //   4541: ldc_w -875727583
    //   4544: ixor
    //   4545: getstatic Perryc.c : I
    //   4548: iflt -> 4562
    //   4551: ldc2_w 786632932
    //   4554: l2i
    //   4555: ldc_w 1940366459
    //   4558: ixor
    //   4559: goto -> 4570
    //   4562: ldc2_w -1180737117
    //   4565: l2i
    //   4566: ldc_w 1443857389
    //   4569: ixor
    //   4570: ldc2_w -78772943
    //   4573: l2i
    //   4574: ldc_w 1048745461
    //   4577: ixor
    //   4578: ixor
    //   4579: lookupswitch default -> 6734, -1735908261 -> 4562, 710701706 -> 4604
    //   4604: getstatic net/minecraft/init/Blocks.field_150356_k : Lnet/minecraft/block/BlockDynamicLiquid;
    //   4607: aastore
    //   4608: dup
    //   4609: ldc2_w 1125108003
    //   4612: l2i
    //   4613: ldc_w 1125108024
    //   4616: ixor
    //   4617: getstatic Perryc.c : I
    //   4620: iflt -> 4634
    //   4623: ldc2_w 850039843
    //   4626: l2i
    //   4627: ldc_w 944359732
    //   4630: ixor
    //   4631: goto -> 4642
    //   4634: ldc2_w -685289144
    //   4637: l2i
    //   4638: ldc_w -186330361
    //   4641: ixor
    //   4642: ldc2_w -722135740
    //   4645: l2i
    //   4646: ldc_w 29119797
    //   4649: ixor
    //   4650: ixor
    //   4651: lookupswitch default -> 4676, -542499482 -> 6660, 1373884786 -> 4634
    //   4676: getstatic net/minecraft/init/Blocks.field_150345_g : Lnet/minecraft/block/Block;
    //   4679: aastore
    //   4680: dup
    //   4681: ldc2_w -271518569
    //   4684: l2i
    //   4685: ldc_w -271518581
    //   4688: ixor
    //   4689: getstatic Perryc.0 : I
    //   4692: ifle -> 4706
    //   4695: ldc2_w -402110138
    //   4698: l2i
    //   4699: ldc_w 1553571066
    //   4702: ixor
    //   4703: goto -> 4714
    //   4706: ldc2_w 1155502865
    //   4709: l2i
    //   4710: ldc_w 1522393758
    //   4713: ixor
    //   4714: ldc2_w -772865874
    //   4717: l2i
    //   4718: ldc_w -1378543898
    //   4721: ixor
    //   4722: ixor
    //   4723: lookupswitch default -> 4748, -928267276 -> 6738, 403531096 -> 4706
    //   4748: getstatic net/minecraft/init/Blocks.field_150328_O : Lnet/minecraft/block/BlockFlower;
    //   4751: aastore
    //   4752: dup
    //   4753: ldc2_w 1164404085
    //   4756: l2i
    //   4757: ldc_w 1164404072
    //   4760: ixor
    //   4761: getstatic Perryc.c : I
    //   4764: iflt -> 4778
    //   4767: ldc2_w 1924645126
    //   4770: l2i
    //   4771: ldc_w -1619109769
    //   4774: ixor
    //   4775: goto -> 4786
    //   4778: ldc2_w 1498430449
    //   4781: l2i
    //   4782: ldc_w -303728055
    //   4785: ixor
    //   4786: ldc2_w -155240563
    //   4789: l2i
    //   4790: ldc_w 1313230778
    //   4793: ixor
    //   4794: ixor
    //   4795: lookupswitch default -> 6742, 206322063 -> 4820, 1429266758 -> 4778
    //   4820: getstatic net/minecraft/init/Blocks.field_150327_N : Lnet/minecraft/block/BlockFlower;
    //   4823: aastore
    //   4824: dup
    //   4825: ldc2_w 1423741419
    //   4828: l2i
    //   4829: ldc_w 1423741429
    //   4832: ixor
    //   4833: getstatic Perryc.c : I
    //   4836: iflt -> 4850
    //   4839: ldc2_w 1222566624
    //   4842: l2i
    //   4843: ldc_w 1359883849
    //   4846: ixor
    //   4847: goto -> 4858
    //   4850: ldc2_w 269299580
    //   4853: l2i
    //   4854: ldc_w -1912197159
    //   4857: ixor
    //   4858: ldc2_w 1409564740
    //   4861: l2i
    //   4862: ldc_w -1418368194
    //   4865: ixor
    //   4866: ixor
    //   4867: lookupswitch default -> 6640, -425596973 -> 4850, 1635396575 -> 4892
    //   4892: getstatic net/minecraft/init/Blocks.field_150338_P : Lnet/minecraft/block/BlockBush;
    //   4895: aastore
    //   4896: dup
    //   4897: ldc2_w 686231911
    //   4900: l2i
    //   4901: ldc_w 686231928
    //   4904: ixor
    //   4905: getstatic Perryc.1 : I
    //   4908: ifeq -> 4922
    //   4911: ldc2_w 715067332
    //   4914: l2i
    //   4915: ldc_w 1730542482
    //   4918: ixor
    //   4919: goto -> 4930
    //   4922: ldc2_w 539079882
    //   4925: l2i
    //   4926: ldc_w -333277268
    //   4929: ixor
    //   4930: ldc2_w 763401950
    //   4933: l2i
    //   4934: ldc_w -2019443619
    //   4937: ixor
    //   4938: ixor
    //   4939: lookupswitch default -> 4964, -409215275 -> 6610, 449147498 -> 4922
    //   4964: getstatic net/minecraft/init/Blocks.field_150337_Q : Lnet/minecraft/block/BlockBush;
    //   4967: aastore
    //   4968: dup
    //   4969: ldc2_w 1058244353
    //   4972: l2i
    //   4973: ldc_w 1058244385
    //   4976: ixor
    //   4977: getstatic Perryc.c : I
    //   4980: iflt -> 4994
    //   4983: ldc2_w 860777535
    //   4986: l2i
    //   4987: ldc_w 860116946
    //   4990: ixor
    //   4991: goto -> 5002
    //   4994: ldc2_w 44042893
    //   4997: l2i
    //   4998: ldc_w -1743147489
    //   5001: ixor
    //   5002: ldc2_w -45014643
    //   5005: l2i
    //   5006: ldc_w -1843624658
    //   5009: ixor
    //   5010: ixor
    //   5011: lookupswitch default -> 6634, -168558543 -> 5036, 1866964814 -> 4994
    //   5036: getstatic net/minecraft/init/Blocks.field_150464_aj : Lnet/minecraft/block/Block;
    //   5039: aastore
    //   5040: dup
    //   5041: ldc2_w 964786085
    //   5044: l2i
    //   5045: ldc_w 964786052
    //   5048: ixor
    //   5049: getstatic Perryc.1 : I
    //   5052: ifeq -> 5066
    //   5055: ldc2_w -1932645765
    //   5058: l2i
    //   5059: ldc_w -1980663842
    //   5062: ixor
    //   5063: goto -> 5074
    //   5066: ldc2_w 2022805284
    //   5069: l2i
    //   5070: ldc_w 1929387810
    //   5073: ixor
    //   5074: ldc2_w -87240371
    //   5077: l2i
    //   5078: ldc_w -1876343140
    //   5081: ixor
    //   5082: ixor
    //   5083: lookupswitch default -> 5108, -559954493 -> 5066, 1876609652 -> 6710
    //   5108: getstatic net/minecraft/init/Blocks.field_150459_bM : Lnet/minecraft/block/Block;
    //   5111: aastore
    //   5112: dup
    //   5113: ldc2_w 2031943117
    //   5116: l2i
    //   5117: ldc_w 2031943151
    //   5120: ixor
    //   5121: getstatic Perryc.0 : I
    //   5124: ifle -> 5138
    //   5127: ldc2_w -1895659741
    //   5130: l2i
    //   5131: ldc_w 357665425
    //   5134: ixor
    //   5135: goto -> 5146
    //   5138: ldc2_w -2076020036
    //   5141: l2i
    //   5142: ldc_w -1095434631
    //   5145: ixor
    //   5146: ldc2_w -1556712875
    //   5149: l2i
    //   5150: ldc_w 1603095271
    //   5153: ixor
    //   5154: ixor
    //   5155: lookupswitch default -> 6712, -967986057 -> 5180, 1726493952 -> 5138
    //   5180: getstatic net/minecraft/init/Blocks.field_150469_bN : Lnet/minecraft/block/Block;
    //   5183: aastore
    //   5184: dup
    //   5185: ldc2_w 364031548
    //   5188: l2i
    //   5189: ldc_w 364031519
    //   5192: ixor
    //   5193: getstatic Perryc.1 : I
    //   5196: ifeq -> 5210
    //   5199: ldc2_w 447182603
    //   5202: l2i
    //   5203: ldc_w 329017962
    //   5206: ixor
    //   5207: goto -> 5218
    //   5210: ldc2_w 1927209352
    //   5213: l2i
    //   5214: ldc_w -494497956
    //   5217: ixor
    //   5218: ldc2_w -950195390
    //   5221: l2i
    //   5222: ldc_w 690432970
    //   5225: ixor
    //   5226: ixor
    //   5227: lookupswitch default -> 5252, -1983913460 -> 5210, -415162903 -> 6786
    //   5252: getstatic net/minecraft/init/Blocks.field_185773_cZ : Lnet/minecraft/block/Block;
    //   5255: aastore
    //   5256: dup
    //   5257: ldc2_w -851533689
    //   5260: l2i
    //   5261: ldc_w -851533661
    //   5264: ixor
    //   5265: getstatic Perryc.1 : I
    //   5268: ifeq -> 5282
    //   5271: ldc2_w -53554049
    //   5274: l2i
    //   5275: ldc_w -494908754
    //   5278: ixor
    //   5279: goto -> 5290
    //   5282: ldc2_w 1166110068
    //   5285: l2i
    //   5286: ldc_w 254634001
    //   5289: ixor
    //   5290: ldc2_w -1118821329
    //   5293: l2i
    //   5294: ldc_w 1057921688
    //   5297: ixor
    //   5298: ixor
    //   5299: lookupswitch default -> 6714, -1676664730 -> 5282, -923616302 -> 5324
    //   5324: getstatic net/minecraft/init/Blocks.field_150436_aH : Lnet/minecraft/block/BlockReed;
    //   5327: aastore
    //   5328: dup
    //   5329: ldc2_w 613938781
    //   5332: l2i
    //   5333: ldc_w 613938808
    //   5336: ixor
    //   5337: getstatic Perryc.c : I
    //   5340: iflt -> 5354
    //   5343: ldc2_w -338812568
    //   5346: l2i
    //   5347: ldc_w -1658278345
    //   5350: ixor
    //   5351: goto -> 5362
    //   5354: ldc2_w 612297797
    //   5357: l2i
    //   5358: ldc_w -1838976287
    //   5361: ixor
    //   5362: ldc2_w 28993222
    //   5365: l2i
    //   5366: ldc_w -1471762047
    //   5369: ixor
    //   5370: ixor
    //   5371: lookupswitch default -> 6708, -551921640 -> 5354, 534858211 -> 5396
    //   5396: getstatic net/minecraft/init/Blocks.field_150393_bb : Lnet/minecraft/block/Block;
    //   5399: aastore
    //   5400: dup
    //   5401: ldc2_w -104455348
    //   5404: l2i
    //   5405: ldc_w -104455318
    //   5408: ixor
    //   5409: getstatic Perryc.1 : I
    //   5412: ifeq -> 5426
    //   5415: ldc2_w -1859460432
    //   5418: l2i
    //   5419: ldc_w 1115407159
    //   5422: ixor
    //   5423: goto -> 5434
    //   5426: ldc2_w -1519262685
    //   5429: l2i
    //   5430: ldc_w 128036025
    //   5433: ixor
    //   5434: ldc2_w -1767792516
    //   5437: l2i
    //   5438: ldc_w 756748133
    //   5441: ixor
    //   5442: ixor
    //   5443: lookupswitch default -> 6644, 426436483 -> 5468, 1760267934 -> 5426
    //   5468: getstatic net/minecraft/init/Blocks.field_150394_bc : Lnet/minecraft/block/Block;
    //   5471: aastore
    //   5472: dup
    //   5473: ldc2_w -531945069
    //   5476: l2i
    //   5477: ldc_w -531945036
    //   5480: ixor
    //   5481: getstatic Perryc.c : I
    //   5484: iflt -> 5498
    //   5487: ldc2_w -1857656778
    //   5490: l2i
    //   5491: ldc_w -1797593131
    //   5494: ixor
    //   5495: goto -> 5506
    //   5498: ldc2_w 624850130
    //   5501: l2i
    //   5502: ldc_w 311508578
    //   5505: ixor
    //   5506: ldc2_w 797938736
    //   5509: l2i
    //   5510: ldc_w 1423236867
    //   5513: ixor
    //   5514: ixor
    //   5515: lookupswitch default -> 5540, -1030307307 -> 5498, 2127021264 -> 6612
    //   5540: getstatic net/minecraft/init/Blocks.field_150392_bi : Lnet/minecraft/block/Block;
    //   5543: aastore
    //   5544: dup
    //   5545: ldc2_w -1431630745
    //   5548: l2i
    //   5549: ldc_w -1431630769
    //   5552: ixor
    //   5553: getstatic Perryc.0 : I
    //   5556: ifle -> 5570
    //   5559: ldc2_w 78768088
    //   5562: l2i
    //   5563: ldc_w -2140009881
    //   5566: ixor
    //   5567: goto -> 5578
    //   5570: ldc2_w 1049336590
    //   5573: l2i
    //   5574: ldc_w -1846180777
    //   5577: ixor
    //   5578: ldc2_w 1584153445
    //   5581: l2i
    //   5582: ldc_w -2095040835
    //   5585: ixor
    //   5586: ixor
    //   5587: lookupswitch default -> 6620, 1502582887 -> 5570, 1915906689 -> 5612
    //   5612: getstatic net/minecraft/init/Blocks.field_150388_bm : Lnet/minecraft/block/Block;
    //   5615: aastore
    //   5616: dup
    //   5617: ldc2_w -1781920358
    //   5620: l2i
    //   5621: ldc_w -1781920333
    //   5624: ixor
    //   5625: getstatic Perryc.1 : I
    //   5628: ifeq -> 5642
    //   5631: ldc2_w 837393943
    //   5634: l2i
    //   5635: ldc_w -1362903248
    //   5638: ixor
    //   5639: goto -> 5650
    //   5642: ldc2_w 237801027
    //   5645: l2i
    //   5646: ldc_w 484167122
    //   5649: ixor
    //   5650: ldc2_w -540856812
    //   5653: l2i
    //   5654: ldc_w 527555604
    //   5657: ixor
    //   5658: ixor
    //   5659: lookupswitch default -> 6774, -767184495 -> 5684, 1603851047 -> 5642
    //   5684: getstatic net/minecraft/init/Blocks.field_150375_by : Lnet/minecraft/block/Block;
    //   5687: aastore
    //   5688: dup
    //   5689: ldc2_w -1003753500
    //   5692: l2i
    //   5693: ldc_w -1003753522
    //   5696: ixor
    //   5697: getstatic Perryc.c : I
    //   5700: iflt -> 5714
    //   5703: ldc2_w 1163721494
    //   5706: l2i
    //   5707: ldc_w -1620406264
    //   5710: ixor
    //   5711: goto -> 5722
    //   5714: ldc2_w -1331139146
    //   5717: l2i
    //   5718: ldc_w -718262811
    //   5721: ixor
    //   5722: ldc2_w -1355600964
    //   5725: l2i
    //   5726: ldc_w 1014564753
    //   5729: ixor
    //   5730: ixor
    //   5731: lookupswitch default -> 5756, 1033919428 -> 5714, 1232881459 -> 6632
    //   5756: getstatic net/minecraft/init/Blocks.field_185766_cS : Lnet/minecraft/block/Block;
    //   5759: aastore
    //   5760: dup
    //   5761: ldc2_w -2012369175
    //   5764: l2i
    //   5765: ldc_w -2012369214
    //   5768: ixor
    //   5769: getstatic Perryc.0 : I
    //   5772: ifle -> 5786
    //   5775: ldc2_w 212448115
    //   5778: l2i
    //   5779: ldc_w 1964946594
    //   5782: ixor
    //   5783: goto -> 5794
    //   5786: ldc2_w 2032090995
    //   5789: l2i
    //   5790: ldc_w -953033290
    //   5793: ixor
    //   5794: ldc2_w -974769022
    //   5797: l2i
    //   5798: ldc_w 2041293111
    //   5801: ixor
    //   5802: ixor
    //   5803: lookupswitch default -> 6664, -973432220 -> 5786, 40075120 -> 5828
    //   5828: getstatic net/minecraft/init/Blocks.field_185765_cR : Lnet/minecraft/block/Block;
    //   5831: aastore
    //   5832: dup
    //   5833: ldc2_w 782761445
    //   5836: l2i
    //   5837: ldc_w 782761417
    //   5840: ixor
    //   5841: getstatic Perryc.0 : I
    //   5844: ifle -> 5858
    //   5847: ldc2_w -1960056086
    //   5850: l2i
    //   5851: ldc_w -2070171821
    //   5854: ixor
    //   5855: goto -> 5866
    //   5858: ldc2_w -594498969
    //   5861: l2i
    //   5862: ldc_w -1901375099
    //   5865: ixor
    //   5866: ldc2_w 686442611
    //   5869: l2i
    //   5870: ldc_w 11565458
    //   5873: ixor
    //   5874: ixor
    //   5875: lookupswitch default -> 5900, 214703798 -> 5858, 669676632 -> 6616
    //   5900: getstatic net/minecraft/init/Blocks.field_150329_H : Lnet/minecraft/block/BlockTallGrass;
    //   5903: aastore
    //   5904: dup
    //   5905: ldc2_w 993829541
    //   5908: l2i
    //   5909: ldc_w 993829512
    //   5912: ixor
    //   5913: getstatic Perryc.0 : I
    //   5916: ifle -> 5930
    //   5919: ldc2_w 932173295
    //   5922: l2i
    //   5923: ldc_w -2109233191
    //   5926: ixor
    //   5927: goto -> 5938
    //   5930: ldc2_w 878862222
    //   5933: l2i
    //   5934: ldc_w -303951245
    //   5937: ixor
    //   5938: ldc2_w 1526822500
    //   5941: l2i
    //   5942: ldc_w -148086255
    //   5945: ixor
    //   5946: ixor
    //   5947: lookupswitch default -> 6770, 434464323 -> 5930, 1974294920 -> 5972
    //   5972: getstatic net/minecraft/init/Blocks.field_150330_I : Lnet/minecraft/block/BlockDeadBush;
    //   5975: aastore
    //   5976: dup
    //   5977: ldc2_w 823673467
    //   5980: l2i
    //   5981: ldc_w 823673429
    //   5984: ixor
    //   5985: getstatic Perryc.1 : I
    //   5988: ifeq -> 6002
    //   5991: ldc2_w -909423952
    //   5994: l2i
    //   5995: ldc_w 794153584
    //   5998: ixor
    //   5999: goto -> 6010
    //   6002: ldc2_w -1545231858
    //   6005: l2i
    //   6006: ldc_w 1895177275
    //   6009: ixor
    //   6010: ldc2_w 78789904
    //   6013: l2i
    //   6014: ldc_w -1583840344
    //   6017: ixor
    //   6018: ixor
    //   6019: lookupswitch default -> 6646, 1135879800 -> 6002, 1983447181 -> 6044
    //   6044: getstatic net/minecraft/init/Blocks.field_150395_bd : Lnet/minecraft/block/Block;
    //   6047: aastore
    //   6048: dup
    //   6049: ldc2_w 891441110
    //   6052: l2i
    //   6053: ldc_w 891441145
    //   6056: ixor
    //   6057: getstatic Perryc.1 : I
    //   6060: ifeq -> 6074
    //   6063: ldc2_w -1495290826
    //   6066: l2i
    //   6067: ldc_w -855526960
    //   6070: ixor
    //   6071: goto -> 6082
    //   6074: ldc2_w -1719841757
    //   6077: l2i
    //   6078: ldc_w 861924912
    //   6081: ixor
    //   6082: ldc2_w 1427972072
    //   6085: l2i
    //   6086: ldc_w -1689669265
    //   6089: ixor
    //   6090: ixor
    //   6091: lookupswitch default -> 6116, -1517636767 -> 6700, 1202458131 -> 6074
    //   6116: getstatic net/minecraft/init/Blocks.field_150480_ab : Lnet/minecraft/block/BlockFire;
    //   6119: aastore
    //   6120: dup
    //   6121: ldc2_w -1674405472
    //   6124: l2i
    //   6125: ldc_w -1674405488
    //   6128: ixor
    //   6129: getstatic Perryc.0 : I
    //   6132: ifle -> 6146
    //   6135: ldc2_w -317294294
    //   6138: l2i
    //   6139: ldc_w 1527786670
    //   6142: ixor
    //   6143: goto -> 6154
    //   6146: ldc2_w -1069278367
    //   6149: l2i
    //   6150: ldc_w 783447239
    //   6153: ixor
    //   6154: ldc2_w 724506989
    //   6157: l2i
    //   6158: ldc_w 1036701909
    //   6161: ixor
    //   6162: ixor
    //   6163: lookupswitch default -> 6648, -1595696068 -> 6146, -132930018 -> 6188
    //   6188: getstatic net/minecraft/init/Blocks.field_150448_aq : Lnet/minecraft/block/Block;
    //   6191: aastore
    //   6192: dup
    //   6193: ldc2_w 648489903
    //   6196: l2i
    //   6197: ldc_w 648489886
    //   6200: ixor
    //   6201: getstatic Perryc.0 : I
    //   6204: ifle -> 6218
    //   6207: ldc2_w -1367278641
    //   6210: l2i
    //   6211: ldc_w -415354626
    //   6214: ixor
    //   6215: goto -> 6226
    //   6218: ldc2_w -1138041663
    //   6221: l2i
    //   6222: ldc_w -1378881335
    //   6225: ixor
    //   6226: ldc2_w -502902878
    //   6229: l2i
    //   6230: ldc_w 122298379
    //   6233: ixor
    //   6234: ixor
    //   6235: lookupswitch default -> 6260, -1393384296 -> 6760, 714077096 -> 6218
    //   6260: getstatic net/minecraft/init/Blocks.field_150408_cc : Lnet/minecraft/block/Block;
    //   6263: aastore
    //   6264: dup
    //   6265: ldc2_w -1006882936
    //   6268: l2i
    //   6269: ldc_w -1006882886
    //   6272: ixor
    //   6273: getstatic Perryc.0 : I
    //   6276: ifle -> 6290
    //   6279: ldc2_w 1774783066
    //   6282: l2i
    //   6283: ldc_w -1182100034
    //   6286: ixor
    //   6287: goto -> 6298
    //   6290: ldc2_w -2041067318
    //   6293: l2i
    //   6294: ldc_w 2093646948
    //   6297: ixor
    //   6298: ldc2_w 830805511
    //   6301: l2i
    //   6302: ldc_w 1697618611
    //   6305: ixor
    //   6306: ixor
    //   6307: lookupswitch default -> 6332, -2065099952 -> 6670, -1645770884 -> 6290
    //   6332: getstatic net/minecraft/init/Blocks.field_150319_E : Lnet/minecraft/block/Block;
    //   6335: aastore
    //   6336: dup
    //   6337: ldc2_w -146433607
    //   6340: l2i
    //   6341: ldc_w -146433654
    //   6344: ixor
    //   6345: getstatic Perryc.c : I
    //   6348: iflt -> 6362
    //   6351: ldc2_w 139784183
    //   6354: l2i
    //   6355: ldc_w -1439109912
    //   6358: ixor
    //   6359: goto -> 6370
    //   6362: ldc2_w -1729850711
    //   6365: l2i
    //   6366: ldc_w 315059668
    //   6369: ixor
    //   6370: ldc2_w 601877084
    //   6373: l2i
    //   6374: ldc_w 2144242260
    //   6377: ixor
    //   6378: ixor
    //   6379: lookupswitch default -> 6638, -701325451 -> 6404, -25337065 -> 6362
    //   6404: getstatic net/minecraft/init/Blocks.field_150318_D : Lnet/minecraft/block/Block;
    //   6407: aastore
    //   6408: dup
    //   6409: ldc2_w 932020877
    //   6412: l2i
    //   6413: ldc_w 932020921
    //   6416: ixor
    //   6417: getstatic Perryc.c : I
    //   6420: iflt -> 6434
    //   6423: ldc2_w -346746114
    //   6426: l2i
    //   6427: ldc_w -1666046166
    //   6430: ixor
    //   6431: goto -> 6442
    //   6434: ldc2_w 1006757258
    //   6437: l2i
    //   6438: ldc_w 412635633
    //   6441: ixor
    //   6442: ldc2_w -932911360
    //   6445: l2i
    //   6446: ldc_w -603462930
    //   6449: ixor
    //   6450: ixor
    //   6451: lookupswitch default -> 6476, -955408878 -> 6434, 1669607482 -> 6666
    //   6476: getstatic net/minecraft/init/Blocks.field_150478_aa : Lnet/minecraft/block/Block;
    //   6479: aastore
    //   6480: getstatic Perryc.1 : I
    //   6483: ifeq -> 6497
    //   6486: ldc2_w -686486221
    //   6489: l2i
    //   6490: ldc_w 167953547
    //   6493: ixor
    //   6494: goto -> 6505
    //   6497: ldc2_w -2103647895
    //   6500: l2i
    //   6501: ldc_w -812522872
    //   6504: ixor
    //   6505: ldc2_w -950705214
    //   6508: l2i
    //   6509: ldc_w 396020180
    //   6512: ixor
    //   6513: ixor
    //   6514: lookupswitch default -> 6540, 232285102 -> 6790, 1445859553 -> 6497
    //   6540: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   6543: getstatic Perryc.1 : I
    //   6546: ifeq -> 6560
    //   6549: ldc2_w 137719898
    //   6552: l2i
    //   6553: ldc_w 722625604
    //   6556: ixor
    //   6557: goto -> 6568
    //   6560: ldc2_w -1376040073
    //   6563: l2i
    //   6564: ldc_w -648789395
    //   6567: ixor
    //   6568: ldc2_w 1837698206
    //   6571: l2i
    //   6572: ldc_w -1929957053
    //   6575: ixor
    //   6576: ixor
    //   6577: lookupswitch default -> 6680, -1781451577 -> 6604, -1034343997 -> 6560
    //   6604: putstatic bigname/zprestige/webhack/util/BlockUtil.unSolidBlocks : Ljava/util/List;
    //   6607: return
    //   6608: aconst_null
    //   6609: athrow
    //   6610: aconst_null
    //   6611: athrow
    //   6612: aconst_null
    //   6613: athrow
    //   6614: aconst_null
    //   6615: athrow
    //   6616: aconst_null
    //   6617: athrow
    //   6618: aconst_null
    //   6619: athrow
    //   6620: aconst_null
    //   6621: athrow
    //   6622: aconst_null
    //   6623: athrow
    //   6624: aconst_null
    //   6625: athrow
    //   6626: aconst_null
    //   6627: athrow
    //   6628: aconst_null
    //   6629: athrow
    //   6630: aconst_null
    //   6631: athrow
    //   6632: aconst_null
    //   6633: athrow
    //   6634: aconst_null
    //   6635: athrow
    //   6636: aconst_null
    //   6637: athrow
    //   6638: aconst_null
    //   6639: athrow
    //   6640: aconst_null
    //   6641: athrow
    //   6642: aconst_null
    //   6643: athrow
    //   6644: aconst_null
    //   6645: athrow
    //   6646: aconst_null
    //   6647: athrow
    //   6648: aconst_null
    //   6649: athrow
    //   6650: aconst_null
    //   6651: athrow
    //   6652: aconst_null
    //   6653: athrow
    //   6654: aconst_null
    //   6655: athrow
    //   6656: aconst_null
    //   6657: athrow
    //   6658: aconst_null
    //   6659: athrow
    //   6660: aconst_null
    //   6661: athrow
    //   6662: aconst_null
    //   6663: athrow
    //   6664: aconst_null
    //   6665: athrow
    //   6666: aconst_null
    //   6667: athrow
    //   6668: aconst_null
    //   6669: athrow
    //   6670: aconst_null
    //   6671: athrow
    //   6672: aconst_null
    //   6673: athrow
    //   6674: aconst_null
    //   6675: athrow
    //   6676: aconst_null
    //   6677: athrow
    //   6678: aconst_null
    //   6679: athrow
    //   6680: aconst_null
    //   6681: athrow
    //   6682: aconst_null
    //   6683: athrow
    //   6684: aconst_null
    //   6685: athrow
    //   6686: aconst_null
    //   6687: athrow
    //   6688: aconst_null
    //   6689: athrow
    //   6690: aconst_null
    //   6691: athrow
    //   6692: aconst_null
    //   6693: athrow
    //   6694: aconst_null
    //   6695: athrow
    //   6696: aconst_null
    //   6697: athrow
    //   6698: aconst_null
    //   6699: athrow
    //   6700: aconst_null
    //   6701: athrow
    //   6702: aconst_null
    //   6703: athrow
    //   6704: aconst_null
    //   6705: athrow
    //   6706: aconst_null
    //   6707: athrow
    //   6708: aconst_null
    //   6709: athrow
    //   6710: aconst_null
    //   6711: athrow
    //   6712: aconst_null
    //   6713: athrow
    //   6714: aconst_null
    //   6715: athrow
    //   6716: aconst_null
    //   6717: athrow
    //   6718: aconst_null
    //   6719: athrow
    //   6720: aconst_null
    //   6721: athrow
    //   6722: aconst_null
    //   6723: athrow
    //   6724: aconst_null
    //   6725: athrow
    //   6726: aconst_null
    //   6727: athrow
    //   6728: aconst_null
    //   6729: athrow
    //   6730: aconst_null
    //   6731: athrow
    //   6732: aconst_null
    //   6733: athrow
    //   6734: aconst_null
    //   6735: athrow
    //   6736: aconst_null
    //   6737: athrow
    //   6738: aconst_null
    //   6739: athrow
    //   6740: aconst_null
    //   6741: athrow
    //   6742: aconst_null
    //   6743: athrow
    //   6744: aconst_null
    //   6745: athrow
    //   6746: aconst_null
    //   6747: athrow
    //   6748: aconst_null
    //   6749: athrow
    //   6750: aconst_null
    //   6751: athrow
    //   6752: aconst_null
    //   6753: athrow
    //   6754: aconst_null
    //   6755: athrow
    //   6756: aconst_null
    //   6757: athrow
    //   6758: aconst_null
    //   6759: athrow
    //   6760: aconst_null
    //   6761: athrow
    //   6762: aconst_null
    //   6763: athrow
    //   6764: aconst_null
    //   6765: athrow
    //   6766: aconst_null
    //   6767: athrow
    //   6768: aconst_null
    //   6769: athrow
    //   6770: aconst_null
    //   6771: athrow
    //   6772: aconst_null
    //   6773: athrow
    //   6774: aconst_null
    //   6775: athrow
    //   6776: aconst_null
    //   6777: athrow
    //   6778: aconst_null
    //   6779: athrow
    //   6780: aconst_null
    //   6781: athrow
    //   6782: aconst_null
    //   6783: athrow
    //   6784: aconst_null
    //   6785: athrow
    //   6786: aconst_null
    //   6787: athrow
    //   6788: aconst_null
    //   6789: athrow
    //   6790: aconst_null
    //   6791: athrow
  }
  
  public static void placeCrystalOnBlock(BlockPos pos, EnumHand hand, boolean swing, boolean exactHand) {
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
  
  public static boolean checkForNeighbours(BlockPos paramBlockPos) {
    return Perry1.6g(null, (int)829204994L ^ 0x4E67EE5, paramBlockPos);
  }
  
  public BlockUtil() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -947656062
    //   9: l2i
    //   10: ldc_w -1614851230
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 193355029
    //   20: l2i
    //   21: ldc_w 2128479138
    //   24: ixor
    //   25: ldc2_w -1017376624
    //   28: l2i
    //   29: ldc_w 1476938566
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1473811582 -> 17, -1016536522 -> 124
    //   60: aload_0
    //   61: getstatic Perryc.c : I
    //   64: iflt -> 78
    //   67: ldc2_w -1812102593
    //   70: l2i
    //   71: ldc_w 51535728
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -579972212
    //   81: l2i
    //   82: ldc_w 533617262
    //   85: ixor
    //   86: ldc2_w 180554236
    //   89: l2i
    //   90: ldc_w 540635164
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -1172986705 -> 126, -311460345 -> 78
    //   120: invokespecial <init> : ()V
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	124	0	this	Lbigname/zprestige/webhack/util/BlockUtil;
  }
  
  public static boolean isScaffoldPos(BlockPos paramBlockPos) {
    return Perry1.6q(null, (int)96578196L ^ 0x2A8EF3C8, paramBlockPos);
  }
  
  public static List getBlockSphere(float breakRange, Class clazz) {
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
  
  public static boolean isBlockAboveEntitySolid(Entity entity) {
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
  
  public static Vec3d posToVec3d(BlockPos pos) {
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
  
  public static void placeBlockScaffold(BlockPos pos) {
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
  
  public static List possiblePlacePositions(float placeRange) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 1125
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.0 : I
    //   12: ifgt -> 1117
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 1109
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.1 : I
    //   27: ifeq -> 41
    //   30: ldc2_w 1962067279
    //   33: l2i
    //   34: ldc_w 693440961
    //   37: ixor
    //   38: goto -> 49
    //   41: ldc2_w -1478772705
    //   44: l2i
    //   45: ldc_w -533382614
    //   48: ixor
    //   49: ldc2_w 1264679914
    //   52: l2i
    //   53: ldc_w 301260187
    //   56: ixor
    //   57: ixor
    //   58: lookupswitch default -> 84, -1526470507 -> 41, 120746751 -> 1084
    //   84: goto -> 88
    //   87: athrow
    //   88: invokestatic func_191196_a : ()Lnet/minecraft/util/NonNullList;
    //   91: goto -> 95
    //   94: athrow
    //   95: getstatic Perryc.0 : I
    //   98: ifle -> 112
    //   101: ldc2_w 854089295
    //   104: l2i
    //   105: ldc_w 464591736
    //   108: ixor
    //   109: goto -> 120
    //   112: ldc2_w -1621520233
    //   115: l2i
    //   116: ldc_w 422835998
    //   119: ixor
    //   120: ldc2_w -1832900874
    //   123: l2i
    //   124: ldc_w -478268965
    //   127: ixor
    //   128: ixor
    //   129: lookupswitch default -> 1072, -137072476 -> 156, 1491554842 -> 112
    //   156: astore_1
    //   157: getstatic Perryc.1 : I
    //   160: ifeq -> 174
    //   163: ldc2_w -727999608
    //   166: l2i
    //   167: ldc_w 1032217236
    //   170: ixor
    //   171: goto -> 182
    //   174: ldc2_w 1673632518
    //   177: l2i
    //   178: ldc_w 1075100225
    //   181: ixor
    //   182: ldc2_w -85233452
    //   185: l2i
    //   186: ldc_w 2020552528
    //   189: ixor
    //   190: ixor
    //   191: lookupswitch default -> 1086, -1588494653 -> 216, 1805231768 -> 174
    //   216: aload_1
    //   217: getstatic Perryc.c : I
    //   220: iflt -> 234
    //   223: ldc2_w -1185428018
    //   226: l2i
    //   227: ldc_w 316632419
    //   230: ixor
    //   231: goto -> 242
    //   234: ldc2_w 1547516409
    //   237: l2i
    //   238: ldc_w 1049534083
    //   241: ixor
    //   242: ldc2_w -447563233
    //   245: l2i
    //   246: ldc_w 162030941
    //   249: ixor
    //   250: ixor
    //   251: lookupswitch default -> 1080, -1907787720 -> 276, 1198686191 -> 234
    //   276: getstatic bigname/zprestige/webhack/util/BlockUtil.mc : Lnet/minecraft/client/Minecraft;
    //   279: getstatic Perryc.c : I
    //   282: iflt -> 296
    //   285: ldc2_w -1476707655
    //   288: l2i
    //   289: ldc_w -1984496335
    //   292: ixor
    //   293: goto -> 304
    //   296: ldc2_w -2039723758
    //   299: l2i
    //   300: ldc_w 683476823
    //   303: ixor
    //   304: ldc2_w 1927015086
    //   307: l2i
    //   308: ldc_w 1038576454
    //   311: ixor
    //   312: ixor
    //   313: lookupswitch default -> 340, -2027000088 -> 296, 1634813536 -> 1070
    //   340: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   343: getstatic Perryc.0 : I
    //   346: ifle -> 360
    //   349: ldc2_w 1289273861
    //   352: l2i
    //   353: ldc_w 1868509531
    //   356: ixor
    //   357: goto -> 368
    //   360: ldc2_w 993375521
    //   363: l2i
    //   364: ldc_w 888147978
    //   367: ixor
    //   368: ldc2_w 54898700
    //   371: l2i
    //   372: ldc_w -1820200817
    //   375: ixor
    //   376: ixor
    //   377: lookupswitch default -> 404, -1287408675 -> 1074, -1059474269 -> 360
    //   404: goto -> 408
    //   407: athrow
    //   408: invokestatic getPlayerPos : (Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/util/math/BlockPos;
    //   411: goto -> 415
    //   414: athrow
    //   415: getstatic Perryc.1 : I
    //   418: ifeq -> 432
    //   421: ldc2_w 295853295
    //   424: l2i
    //   425: ldc_w 1350699362
    //   428: ixor
    //   429: goto -> 440
    //   432: ldc2_w 2090914460
    //   435: l2i
    //   436: ldc_w 1239365459
    //   439: ixor
    //   440: ldc2_w 660086083
    //   443: l2i
    //   444: ldc_w 1015259154
    //   447: ixor
    //   448: ixor
    //   449: lookupswitch default -> 476, 729453002 -> 432, 1526458588 -> 1076
    //   476: fload_0
    //   477: getstatic Perryc.1 : I
    //   480: ifeq -> 494
    //   483: ldc2_w -1373437403
    //   486: l2i
    //   487: ldc_w 892613640
    //   490: ixor
    //   491: goto -> 502
    //   494: ldc2_w -1876138813
    //   497: l2i
    //   498: ldc_w -686625056
    //   501: ixor
    //   502: ldc2_w -1591531122
    //   505: l2i
    //   506: ldc_w -1453409800
    //   509: ixor
    //   510: ixor
    //   511: lookupswitch default -> 1082, -1821727141 -> 494, 1329797717 -> 536
    //   536: fload_0
    //   537: f2i
    //   538: ldc2_w 1952084764
    //   541: l2i
    //   542: ldc_w 1952084764
    //   545: ixor
    //   546: ldc2_w -695992429
    //   549: l2i
    //   550: ldc_w -695992430
    //   553: ixor
    //   554: ldc2_w 857258725
    //   557: l2i
    //   558: ldc_w 857258725
    //   561: ixor
    //   562: getstatic Perryc.c : I
    //   565: iflt -> 579
    //   568: ldc2_w 1628672789
    //   571: l2i
    //   572: ldc_w -1046984988
    //   575: ixor
    //   576: goto -> 587
    //   579: ldc2_w 1988952526
    //   582: l2i
    //   583: ldc_w 1570487639
    //   586: ixor
    //   587: ldc2_w 2010066104
    //   590: l2i
    //   591: ldc_w -1223062136
    //   594: ixor
    //   595: ixor
    //   596: lookupswitch default -> 1096, -339731031 -> 624, 1616737473 -> 579
    //   624: goto -> 628
    //   627: athrow
    //   628: invokestatic getSphere : (Lnet/minecraft/util/math/BlockPos;FIZZI)Ljava/util/List;
    //   631: goto -> 635
    //   634: athrow
    //   635: getstatic Perryc.c : I
    //   638: iflt -> 652
    //   641: ldc2_w 336434002
    //   644: l2i
    //   645: ldc_w -410139232
    //   648: ixor
    //   649: goto -> 660
    //   652: ldc2_w 1732728109
    //   655: l2i
    //   656: ldc_w -998489653
    //   659: ixor
    //   660: ldc2_w 1463243484
    //   663: l2i
    //   664: ldc_w 530265985
    //   667: ixor
    //   668: ixor
    //   669: lookupswitch default -> 696, -1154731089 -> 1078, -591365058 -> 652
    //   696: goto -> 700
    //   699: athrow
    //   700: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   705: goto -> 709
    //   708: athrow
    //   709: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   714: getstatic Perryc.1 : I
    //   717: ifeq -> 731
    //   720: ldc2_w -1497944594
    //   723: l2i
    //   724: ldc_w 229573084
    //   727: ixor
    //   728: goto -> 739
    //   731: ldc2_w 1778075093
    //   734: l2i
    //   735: ldc_w -1838402857
    //   738: ixor
    //   739: ldc2_w -1827364581
    //   742: l2i
    //   743: ldc_w 1002323191
    //   746: ixor
    //   747: ixor
    //   748: lookupswitch default -> 776, -924961435 -> 731, 62042590 -> 1092
    //   776: goto -> 780
    //   779: athrow
    //   780: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   785: goto -> 789
    //   788: athrow
    //   789: getstatic Perryc.1 : I
    //   792: ifeq -> 806
    //   795: ldc2_w -1251639918
    //   798: l2i
    //   799: ldc_w 2000306652
    //   802: ixor
    //   803: goto -> 814
    //   806: ldc2_w -2111600596
    //   809: l2i
    //   810: ldc_w -426099924
    //   813: ixor
    //   814: ldc2_w -1891512051
    //   817: l2i
    //   818: ldc_w -1602933494
    //   821: ixor
    //   822: ixor
    //   823: lookupswitch default -> 848, -311705527 -> 1098, 501630038 -> 806
    //   848: goto -> 852
    //   851: athrow
    //   852: invokestatic toList : ()Ljava/util/stream/Collector;
    //   855: goto -> 859
    //   858: athrow
    //   859: getstatic Perryc.1 : I
    //   862: ifeq -> 876
    //   865: ldc2_w -157793131
    //   868: l2i
    //   869: ldc_w -1159148710
    //   872: ixor
    //   873: goto -> 884
    //   876: ldc2_w 2143238735
    //   879: l2i
    //   880: ldc_w 502845902
    //   883: ixor
    //   884: ldc2_w -1282705248
    //   887: l2i
    //   888: ldc_w -1959133304
    //   891: ixor
    //   892: ixor
    //   893: lookupswitch default -> 1094, 1526033577 -> 920, 1958873319 -> 876
    //   920: goto -> 924
    //   923: athrow
    //   924: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   929: goto -> 933
    //   932: athrow
    //   933: checkcast java/util/Collection
    //   936: getstatic Perryc.0 : I
    //   939: ifle -> 953
    //   942: ldc2_w -564617098
    //   945: l2i
    //   946: ldc_w -1185767093
    //   949: ixor
    //   950: goto -> 961
    //   953: ldc2_w -2069274609
    //   956: l2i
    //   957: ldc_w -978946787
    //   960: ixor
    //   961: ldc2_w -81170402
    //   964: l2i
    //   965: ldc_w -1704228782
    //   968: ixor
    //   969: ixor
    //   970: lookupswitch default -> 1090, 105445745 -> 953, 541977950 -> 996
    //   996: goto -> 1000
    //   999: athrow
    //   1000: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   1003: goto -> 1007
    //   1006: athrow
    //   1007: pop
    //   1008: getstatic Perryc.1 : I
    //   1011: ifeq -> 1025
    //   1014: ldc2_w 620673325
    //   1017: l2i
    //   1018: ldc_w 1708179578
    //   1021: ixor
    //   1022: goto -> 1033
    //   1025: ldc2_w -859578003
    //   1028: l2i
    //   1029: ldc_w 1293431313
    //   1032: ixor
    //   1033: ldc2_w -1615238753
    //   1036: l2i
    //   1037: ldc_w -1670988741
    //   1040: ixor
    //   1041: ixor
    //   1042: lookupswitch default -> 1088, -2113665320 -> 1068, 1123134707 -> 1025
    //   1068: aload_1
    //   1069: areturn
    //   1070: aconst_null
    //   1071: athrow
    //   1072: aconst_null
    //   1073: athrow
    //   1074: aconst_null
    //   1075: athrow
    //   1076: aconst_null
    //   1077: athrow
    //   1078: aconst_null
    //   1079: athrow
    //   1080: aconst_null
    //   1081: athrow
    //   1082: aconst_null
    //   1083: athrow
    //   1084: aconst_null
    //   1085: athrow
    //   1086: aconst_null
    //   1087: athrow
    //   1088: aconst_null
    //   1089: athrow
    //   1090: aconst_null
    //   1091: athrow
    //   1092: aconst_null
    //   1093: athrow
    //   1094: aconst_null
    //   1095: athrow
    //   1096: aconst_null
    //   1097: athrow
    //   1098: aconst_null
    //   1099: athrow
    //   1100: pop
    //   1101: goto -> 24
    //   1104: pop
    //   1105: aconst_null
    //   1106: goto -> 1100
    //   1109: dup
    //   1110: ifnull -> 1100
    //   1113: checkcast java/lang/Throwable
    //   1116: athrow
    //   1117: dup
    //   1118: ifnull -> 1104
    //   1121: checkcast java/lang/Throwable
    //   1124: athrow
    //   1125: aconst_null
    //   1126: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	1046	0	placeRange	F
    //   157	913	1	positions	Lnet/minecraft/util/NonNullList;
    // Exception table:
    //   from	to	target	type
    //   8	20	1109	finally
    //   87	94	94	finally
    //   87	94	87	java/util/ConcurrentModificationException
    //   87	94	94	java/lang/ClassCastException
    //   88	94	94	java/lang/ClassCastException
    //   88	94	94	java/lang/StringIndexOutOfBoundsException
    //   407	414	414	finally
    //   407	414	3	finally
    //   407	414	414	finally
    //   408	414	3	finally
    //   408	414	407	finally
    //   627	634	634	finally
    //   627	634	627	finally
    //   627	634	634	finally
    //   628	634	627	java/lang/UnsupportedOperationException
    //   628	634	3	java/lang/UnsupportedOperationException
    //   699	708	708	finally
    //   699	708	708	java/lang/AssertionError
    //   699	708	3	java/lang/IllegalArgumentException
    //   699	708	3	java/lang/IllegalStateException
    //   699	708	699	finally
    //   779	788	788	finally
    //   779	788	779	java/lang/IllegalArgumentException
    //   779	788	788	finally
    //   780	788	788	java/lang/UnsupportedOperationException
    //   780	788	3	finally
    //   851	858	858	finally
    //   851	858	858	java/lang/IllegalArgumentException
    //   851	858	851	java/lang/NegativeArraySizeException
    //   852	858	3	finally
    //   852	858	3	java/lang/ClassCastException
    //   923	932	932	finally
    //   923	932	3	java/lang/ArrayIndexOutOfBoundsException
    //   923	932	932	finally
    //   923	932	932	java/lang/RuntimeException
    //   924	932	923	finally
    //   1000	1006	1006	finally
    //   1000	1006	1006	java/lang/StringIndexOutOfBoundsException
    //   1000	1006	1006	java/lang/NumberFormatException
    //   1000	1006	1006	finally
    //   1000	1006	3	finally
    //   1109	1117	1109	java/lang/NumberFormatException
    //   1125	1127	3	java/lang/NullPointerException
  }
  
  public static List getCock(float radius, boolean ignoreAir) {
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
  
  public static Boolean isPosInFov(BlockPos pos) {
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
  
  public static List getPossibleSides(BlockPos pos) {
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
  
  public static Vec3d[] getOffsets(int paramInt, boolean paramBoolean) {
    return Perry1.0N(null, (int)-246140935L ^ 0x9C8114B6, paramInt, paramBoolean);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\BlockUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */