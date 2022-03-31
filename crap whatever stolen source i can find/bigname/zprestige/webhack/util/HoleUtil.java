package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class HoleUtil implements Globals {
  public static boolean lambda$isHole$0(Map.Entry paramEntry) {
    return Perry1.4Q(null, (int)427711579L ^ 0x683EFE43, paramEntry);
  }
  
  public static boolean lambda$isDoubleHole$1(Map.Entry paramEntry) {
    return Perry1.4Q(null, (int)-938995833L ^ 0xB948AD9E, paramEntry);
  }
  
  public static HoleUtil$HoleInfo isDoubleHole(HoleUtil$HoleInfo info, BlockPos centreBlock, HoleUtil$BlockOffset weakSide) {
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
  
  public static HoleUtil$BlockSafety isBlockSafe(Block block) {
    // Byte code:
    //   0: aconst_null
    //   1: getstatic Perryc.c : I
    //   4: ifge -> 951
    //   7: pop
    //   8: aconst_null
    //   9: goto -> 943
    //   12: nop
    //   13: nop
    //   14: nop
    //   15: athrow
    //   16: getstatic Perryc.c : I
    //   19: iflt -> 33
    //   22: ldc2_w -336444751
    //   25: l2i
    //   26: ldc_w 364907389
    //   29: ixor
    //   30: goto -> 41
    //   33: ldc2_w 739746396
    //   36: l2i
    //   37: ldc_w -1739445950
    //   40: ixor
    //   41: ldc2_w 756118509
    //   44: l2i
    //   45: ldc_w -1776259975
    //   48: ixor
    //   49: ixor
    //   50: lookupswitch default -> 76, 1157846616 -> 920, 1669154335 -> 33
    //   76: aload_0
    //   77: getstatic Perryc.1 : I
    //   80: ifeq -> 94
    //   83: ldc2_w -159646346
    //   86: l2i
    //   87: ldc_w 755088435
    //   90: ixor
    //   91: goto -> 102
    //   94: ldc2_w 419082841
    //   97: l2i
    //   98: ldc_w -1185515678
    //   101: ixor
    //   102: ldc2_w 2099371802
    //   105: l2i
    //   106: ldc_w 2059031777
    //   109: ixor
    //   110: ixor
    //   111: lookupswitch default -> 914, -1506324800 -> 136, -589182274 -> 94
    //   136: getstatic net/minecraft/init/Blocks.field_150357_h : Lnet/minecraft/block/Block;
    //   139: if_acmpne -> 153
    //   142: ldc2_w -56151309
    //   145: l2i
    //   146: ldc_w 57690309
    //   149: ixor
    //   150: goto -> 161
    //   153: ldc2_w 2110196423
    //   156: l2i
    //   157: ldc_w -2112851714
    //   160: ixor
    //   161: ldc2_w -1080757923
    //   164: l2i
    //   165: ldc_w 479342876
    //   168: ixor
    //   169: ixor
    //   170: tableswitch default -> 142, 1557248631 -> 192, 1557248632 -> 256
    //   192: getstatic Perryc.1 : I
    //   195: ifeq -> 209
    //   198: ldc2_w -759137406
    //   201: l2i
    //   202: ldc_w 1961282485
    //   205: ixor
    //   206: goto -> 217
    //   209: ldc2_w 1868096085
    //   212: l2i
    //   213: ldc_w 587072281
    //   216: ixor
    //   217: ldc2_w 1532561552
    //   220: l2i
    //   221: ldc_w 23475016
    //   224: ixor
    //   225: ixor
    //   226: lookupswitch default -> 932, -65434641 -> 209, 395958932 -> 252
    //   252: getstatic bigname/zprestige/webhack/util/HoleUtil$BlockSafety.UNBREAKABLE : Lbigname/zprestige/webhack/util/HoleUtil$BlockSafety;
    //   255: areturn
    //   256: getstatic Perryc.c : I
    //   259: iflt -> 273
    //   262: ldc2_w 1304193117
    //   265: l2i
    //   266: ldc_w 1819030912
    //   269: ixor
    //   270: goto -> 281
    //   273: ldc2_w 951561646
    //   276: l2i
    //   277: ldc_w -1655488619
    //   280: ixor
    //   281: ldc2_w 1970294149
    //   284: l2i
    //   285: ldc_w -1395446501
    //   288: ixor
    //   289: ixor
    //   290: lookupswitch default -> 916, -126665405 -> 273, 2085089957 -> 316
    //   316: aload_0
    //   317: getstatic Perryc.0 : I
    //   320: ifle -> 334
    //   323: ldc2_w 214612605
    //   326: l2i
    //   327: ldc_w -276260797
    //   330: ixor
    //   331: goto -> 342
    //   334: ldc2_w 1551260697
    //   337: l2i
    //   338: ldc_w -858062351
    //   341: ixor
    //   342: ldc2_w 1578228183
    //   345: l2i
    //   346: ldc_w 1779749405
    //   349: ixor
    //   350: ixor
    //   351: lookupswitch default -> 926, -1532471774 -> 376, -683202060 -> 334
    //   376: getstatic net/minecraft/init/Blocks.field_150343_Z : Lnet/minecraft/block/Block;
    //   379: if_acmpeq -> 393
    //   382: ldc2_w -1206059750
    //   385: l2i
    //   386: ldc_w -2014694519
    //   389: ixor
    //   390: goto -> 401
    //   393: ldc2_w 47074698
    //   396: l2i
    //   397: ldc_w 1027113752
    //   400: ixor
    //   401: ldc2_w 1465042417
    //   404: l2i
    //   405: ldc_w 1641130594
    //   408: ixor
    //   409: ixor
    //   410: tableswitch default -> 382, 158703872 -> 432, 158703873 -> 784
    //   432: getstatic Perryc.1 : I
    //   435: ifeq -> 449
    //   438: ldc2_w 750671563
    //   441: l2i
    //   442: ldc_w -293190236
    //   445: ixor
    //   446: goto -> 457
    //   449: ldc2_w -1219218419
    //   452: l2i
    //   453: ldc_w -100882537
    //   456: ixor
    //   457: ldc2_w -1499460899
    //   460: l2i
    //   461: ldc_w -1373573497
    //   464: ixor
    //   465: ixor
    //   466: lookupswitch default -> 492, -893847755 -> 928, 1271320922 -> 449
    //   492: aload_0
    //   493: getstatic Perryc.0 : I
    //   496: ifle -> 510
    //   499: ldc2_w -1460911999
    //   502: l2i
    //   503: ldc_w 351091413
    //   506: ixor
    //   507: goto -> 518
    //   510: ldc2_w 137824802
    //   513: l2i
    //   514: ldc_w -2130346799
    //   517: ixor
    //   518: ldc2_w -1748976333
    //   521: l2i
    //   522: ldc_w 889955170
    //   525: ixor
    //   526: ixor
    //   527: lookupswitch default -> 552, 96134650 -> 510, 516580357 -> 922
    //   552: getstatic net/minecraft/init/Blocks.field_150477_bB : Lnet/minecraft/block/Block;
    //   555: if_acmpeq -> 569
    //   558: ldc2_w -321756475
    //   561: l2i
    //   562: ldc_w 993998666
    //   565: ixor
    //   566: goto -> 577
    //   569: ldc2_w -1535132411
    //   572: l2i
    //   573: ldc_w 1939007621
    //   576: ixor
    //   577: ldc2_w 984085486
    //   580: l2i
    //   581: ldc_w 1129488902
    //   584: ixor
    //   585: ixor
    //   586: tableswitch default -> 558, -1374157721 -> 608, -1374157720 -> 784
    //   608: getstatic Perryc.1 : I
    //   611: ifeq -> 625
    //   614: ldc2_w 2088683897
    //   617: l2i
    //   618: ldc_w -798926970
    //   621: ixor
    //   622: goto -> 633
    //   625: ldc2_w -113356036
    //   628: l2i
    //   629: ldc_w 1818390476
    //   632: ixor
    //   633: ldc2_w 2134136308
    //   636: l2i
    //   637: ldc_w 516521950
    //   640: ixor
    //   641: ixor
    //   642: lookupswitch default -> 918, -840780587 -> 625, -190769382 -> 668
    //   668: aload_0
    //   669: getstatic Perryc.0 : I
    //   672: ifle -> 686
    //   675: ldc2_w -679816159
    //   678: l2i
    //   679: ldc_w -654079171
    //   682: ixor
    //   683: goto -> 694
    //   686: ldc2_w -1769619492
    //   689: l2i
    //   690: ldc_w 1700878164
    //   693: ixor
    //   694: ldc2_w 1149744751
    //   697: l2i
    //   698: ldc_w 1712615634
    //   701: ixor
    //   702: ixor
    //   703: lookupswitch default -> 930, -780718539 -> 728, 753572257 -> 686
    //   728: getstatic net/minecraft/init/Blocks.field_150467_bQ : Lnet/minecraft/block/Block;
    //   731: if_acmpne -> 745
    //   734: ldc2_w -1722778582
    //   737: l2i
    //   738: ldc_w -717043961
    //   741: ixor
    //   742: goto -> 753
    //   745: ldc2_w -1515735274
    //   748: l2i
    //   749: ldc_w -374010820
    //   752: ixor
    //   753: ldc2_w 959465898
    //   756: l2i
    //   757: ldc_w -1193636596
    //   760: ixor
    //   761: ixor
    //   762: tableswitch default -> 734, -839352437 -> 784, -839352436 -> 848
    //   784: getstatic Perryc.0 : I
    //   787: ifle -> 801
    //   790: ldc2_w -1402694849
    //   793: l2i
    //   794: ldc_w 524831580
    //   797: ixor
    //   798: goto -> 809
    //   801: ldc2_w -276443763
    //   804: l2i
    //   805: ldc_w -1331300274
    //   808: ixor
    //   809: ldc2_w -1002403623
    //   812: l2i
    //   813: ldc_w 1609177380
    //   816: ixor
    //   817: ixor
    //   818: lookupswitch default -> 844, 679889310 -> 912, 1881933924 -> 801
    //   844: getstatic bigname/zprestige/webhack/util/HoleUtil$BlockSafety.RESISTANT : Lbigname/zprestige/webhack/util/HoleUtil$BlockSafety;
    //   847: areturn
    //   848: getstatic Perryc.1 : I
    //   851: ifeq -> 865
    //   854: ldc2_w -1357801849
    //   857: l2i
    //   858: ldc_w 1472846537
    //   861: ixor
    //   862: goto -> 873
    //   865: ldc2_w 849221645
    //   868: l2i
    //   869: ldc_w 1515625761
    //   872: ixor
    //   873: ldc2_w 19217670
    //   876: l2i
    //   877: ldc_w 1825674929
    //   880: ixor
    //   881: ixor
    //   882: lookupswitch default -> 908, -1886819119 -> 865, -1792219143 -> 924
    //   908: getstatic bigname/zprestige/webhack/util/HoleUtil$BlockSafety.BREAKABLE : Lbigname/zprestige/webhack/util/HoleUtil$BlockSafety;
    //   911: areturn
    //   912: aconst_null
    //   913: athrow
    //   914: aconst_null
    //   915: athrow
    //   916: aconst_null
    //   917: athrow
    //   918: aconst_null
    //   919: athrow
    //   920: aconst_null
    //   921: athrow
    //   922: aconst_null
    //   923: athrow
    //   924: aconst_null
    //   925: athrow
    //   926: aconst_null
    //   927: athrow
    //   928: aconst_null
    //   929: athrow
    //   930: aconst_null
    //   931: athrow
    //   932: aconst_null
    //   933: athrow
    //   934: pop
    //   935: goto -> 16
    //   938: pop
    //   939: aconst_null
    //   940: goto -> 934
    //   943: dup
    //   944: ifnull -> 934
    //   947: checkcast java/lang/Throwable
    //   950: athrow
    //   951: dup
    //   952: ifnull -> 938
    //   955: checkcast java/lang/Throwable
    //   958: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   16	896	0	block	Lnet/minecraft/block/Block;
    // Exception table:
    //   from	to	target	type
    //   0	12	943	finally
    //   943	951	943	finally
  }
  
  public static HashMap getUnsafeSides(BlockPos pos) {
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
  
  public HoleUtil() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -489699362
    //   9: l2i
    //   10: ldc_w -1973012162
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 2021183443
    //   20: l2i
    //   21: ldc_w -2048453129
    //   24: ixor
    //   25: ldc2_w 734439391
    //   28: l2i
    //   29: ldc_w -1481374557
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 126, -455385700 -> 17, 1911388504 -> 60
    //   60: aload_0
    //   61: getstatic Perryc.c : I
    //   64: iflt -> 78
    //   67: ldc2_w 1660252892
    //   70: l2i
    //   71: ldc_w 171892602
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w 361964222
    //   81: l2i
    //   82: ldc_w -258643779
    //   85: ixor
    //   86: ldc2_w -2011550241
    //   89: l2i
    //   90: ldc_w -160420569
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 124, -1687401733 -> 120, 379694430 -> 78
    //   120: invokespecial <init> : ()V
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	124	0	this	Lbigname/zprestige/webhack/util/HoleUtil;
  }
  
  public static HoleUtil$HoleInfo isHole(BlockPos centreBlock, boolean onlyOneWide, boolean ignoreDown) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\HoleUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */