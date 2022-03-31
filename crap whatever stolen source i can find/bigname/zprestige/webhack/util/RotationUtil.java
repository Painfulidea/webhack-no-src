package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;

public class RotationUtil implements Util {
  public static String getDirection4D(boolean northRed) {
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
  
  public RotationUtil() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w 1467753422
    //   9: l2i
    //   10: ldc_w -1716034131
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1860751217
    //   20: l2i
    //   21: ldc_w 580155954
    //   24: ixor
    //   25: ldc2_w -812231813
    //   28: l2i
    //   29: ldc_w 1478865556
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -2109699050 -> 17, 1501079436 -> 126
    //   60: aload_0
    //   61: getstatic Perryc.0 : I
    //   64: ifle -> 78
    //   67: ldc2_w -1595020428
    //   70: l2i
    //   71: ldc_w 409886565
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1224778487
    //   81: l2i
    //   82: ldc_w -718063727
    //   85: ixor
    //   86: ldc2_w -1333974507
    //   89: l2i
    //   90: ldc_w 2069840555
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -1632655415 -> 78, 1939987631 -> 124
    //   120: invokespecial <init> : ()V
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	124	0	this	Lbigname/zprestige/webhack/util/RotationUtil;
  }
  
  public static float[] getAngle(Entity paramEntity) {
    return Perry1.0Q(null, (int)-1816458364L ^ 0xF06F6608, paramEntity);
  }
  
  public static void faceEntity(Entity paramEntity) {
    Perry1.5O(null, (int)-1006794995L ^ 0xE537D61C, paramEntity);
  }
  
  public static void faceVector(Vec3d vec, boolean normalizeAngle) {
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
  
  public static double[] calculateLookAt(double paramDouble1, double paramDouble2, double paramDouble3, EntityPlayer paramEntityPlayer) {
    return Perry1.F(null, (int)300272198L ^ 0x5774E7F2, paramDouble1, paramDouble2, paramDouble3, paramEntityPlayer);
  }
  
  public static Vec3d getEyesPos() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 927
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 919
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 911
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new net/minecraft/util/math/Vec3d
    //   27: dup
    //   28: getstatic Perryc.0 : I
    //   31: ifle -> 45
    //   34: ldc2_w 963806958
    //   37: l2i
    //   38: ldc_w 1164385348
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w -810759679
    //   48: l2i
    //   49: ldc_w -658819439
    //   52: ixor
    //   53: ldc2_w -1337355166
    //   56: l2i
    //   57: ldc_w 1803341543
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -1491025873 -> 876, 18367058 -> 45
    //   88: getstatic bigname/zprestige/webhack/util/RotationUtil.mc : Lnet/minecraft/client/Minecraft;
    //   91: getstatic Perryc.0 : I
    //   94: ifle -> 108
    //   97: ldc2_w -1393300427
    //   100: l2i
    //   101: ldc_w -1876637610
    //   104: ixor
    //   105: goto -> 116
    //   108: ldc2_w -2006497209
    //   111: l2i
    //   112: ldc_w -1989645690
    //   115: ixor
    //   116: ldc2_w 29287023
    //   119: l2i
    //   120: ldc_w 2083552514
    //   123: ixor
    //   124: ixor
    //   125: lookupswitch default -> 152, 805294821 -> 108, 1096399630 -> 888
    //   152: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   155: getstatic Perryc.c : I
    //   158: iflt -> 172
    //   161: ldc2_w 1398982217
    //   164: l2i
    //   165: ldc_w 853431568
    //   168: ixor
    //   169: goto -> 180
    //   172: ldc2_w -1225131740
    //   175: l2i
    //   176: ldc_w 103639333
    //   179: ixor
    //   180: ldc2_w 975526776
    //   183: l2i
    //   184: ldc_w 1981780043
    //   187: ixor
    //   188: ixor
    //   189: lookupswitch default -> 894, -51487950 -> 216, 763779178 -> 172
    //   216: getfield field_70165_t : D
    //   219: getstatic Perryc.0 : I
    //   222: ifle -> 236
    //   225: ldc2_w 53089321
    //   228: l2i
    //   229: ldc_w 1043697792
    //   232: ixor
    //   233: goto -> 244
    //   236: ldc2_w -1803671681
    //   239: l2i
    //   240: ldc_w -1074223953
    //   243: ixor
    //   244: ldc2_w 2022923910
    //   247: l2i
    //   248: ldc_w -2071614874
    //   251: ixor
    //   252: ixor
    //   253: lookupswitch default -> 886, -1056346039 -> 236, -678398160 -> 280
    //   280: getstatic bigname/zprestige/webhack/util/RotationUtil.mc : Lnet/minecraft/client/Minecraft;
    //   283: getstatic Perryc.c : I
    //   286: iflt -> 300
    //   289: ldc2_w 332647899
    //   292: l2i
    //   293: ldc_w -1000831565
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 1936433426
    //   303: l2i
    //   304: ldc_w -937736516
    //   307: ixor
    //   308: ldc2_w 776934609
    //   311: l2i
    //   312: ldc_w -274872968
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 882, 374970817 -> 300, 2057451015 -> 344
    //   344: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   347: getstatic Perryc.c : I
    //   350: iflt -> 364
    //   353: ldc2_w 1352290540
    //   356: l2i
    //   357: ldc_w -1463681611
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -1613672085
    //   367: l2i
    //   368: ldc_w -481408444
    //   371: ixor
    //   372: ldc2_w -659805427
    //   375: l2i
    //   376: ldc_w -71013129
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -617354589 -> 892, 1009110515 -> 364
    //   408: getfield field_70163_u : D
    //   411: getstatic Perryc.c : I
    //   414: iflt -> 428
    //   417: ldc2_w -545430665
    //   420: l2i
    //   421: ldc_w -789820412
    //   424: ixor
    //   425: goto -> 436
    //   428: ldc2_w -1704645601
    //   431: l2i
    //   432: ldc_w -1538235405
    //   435: ixor
    //   436: ldc2_w -1531287294
    //   439: l2i
    //   440: ldc_w -2107516215
    //   443: ixor
    //   444: ixor
    //   445: lookupswitch default -> 900, 418315303 -> 472, 692755640 -> 428
    //   472: getstatic bigname/zprestige/webhack/util/RotationUtil.mc : Lnet/minecraft/client/Minecraft;
    //   475: getstatic Perryc.c : I
    //   478: iflt -> 492
    //   481: ldc2_w -1525116390
    //   484: l2i
    //   485: ldc_w -1344032363
    //   488: ixor
    //   489: goto -> 500
    //   492: ldc2_w -161366335
    //   495: l2i
    //   496: ldc_w -270281763
    //   499: ixor
    //   500: ldc2_w -1637109714
    //   503: l2i
    //   504: ldc_w -1838355169
    //   507: ixor
    //   508: ixor
    //   509: lookupswitch default -> 536, 117210814 -> 880, 916601928 -> 492
    //   536: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   539: getstatic Perryc.0 : I
    //   542: ifle -> 556
    //   545: ldc2_w -1089398503
    //   548: l2i
    //   549: ldc_w 1422759799
    //   552: ixor
    //   553: goto -> 564
    //   556: ldc2_w 825840173
    //   559: l2i
    //   560: ldc_w 1155304076
    //   563: ixor
    //   564: ldc2_w 171057349
    //   567: l2i
    //   568: ldc_w -2097003520
    //   571: ixor
    //   572: ixor
    //   573: lookupswitch default -> 890, -53101468 -> 600, 1659693739 -> 556
    //   600: goto -> 604
    //   603: athrow
    //   604: invokevirtual func_70047_e : ()F
    //   607: goto -> 611
    //   610: athrow
    //   611: f2d
    //   612: dadd
    //   613: getstatic Perryc.0 : I
    //   616: ifle -> 630
    //   619: ldc2_w 505860451
    //   622: l2i
    //   623: ldc_w 1785069282
    //   626: ixor
    //   627: goto -> 638
    //   630: ldc2_w -830881947
    //   633: l2i
    //   634: ldc_w 1090353965
    //   637: ixor
    //   638: ldc2_w 560261802
    //   641: l2i
    //   642: ldc_w 1344290861
    //   645: ixor
    //   646: ixor
    //   647: lookupswitch default -> 672, -1421413865 -> 630, 84378886 -> 884
    //   672: getstatic bigname/zprestige/webhack/util/RotationUtil.mc : Lnet/minecraft/client/Minecraft;
    //   675: getstatic Perryc.c : I
    //   678: iflt -> 692
    //   681: ldc2_w -1897068556
    //   684: l2i
    //   685: ldc_w -419103078
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w 1588880675
    //   695: l2i
    //   696: ldc_w 1351682964
    //   699: ixor
    //   700: ldc2_w 292107551
    //   703: l2i
    //   704: ldc_w -630721208
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 896, -1561904839 -> 692, -986992928 -> 736
    //   736: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   739: getstatic Perryc.1 : I
    //   742: ifeq -> 756
    //   745: ldc2_w -637996223
    //   748: l2i
    //   749: ldc_w 279347901
    //   752: ixor
    //   753: goto -> 764
    //   756: ldc2_w -1383026478
    //   759: l2i
    //   760: ldc_w -448616553
    //   763: ixor
    //   764: ldc2_w -35167675
    //   767: l2i
    //   768: ldc_w 748087401
    //   771: ixor
    //   772: ixor
    //   773: lookupswitch default -> 800, -70421976 -> 756, 405797840 -> 898
    //   800: getfield field_70161_v : D
    //   803: getstatic Perryc.c : I
    //   806: iflt -> 820
    //   809: ldc2_w 1635210184
    //   812: l2i
    //   813: ldc_w 530314845
    //   816: ixor
    //   817: goto -> 828
    //   820: ldc2_w 1521002632
    //   823: l2i
    //   824: ldc_w 592370497
    //   827: ixor
    //   828: ldc2_w 130698516
    //   831: l2i
    //   832: ldc_w 178067816
    //   835: ixor
    //   836: ixor
    //   837: lookupswitch default -> 878, 1941697001 -> 820, 1957767093 -> 864
    //   864: goto -> 868
    //   867: athrow
    //   868: invokespecial <init> : (DDD)V
    //   871: goto -> 875
    //   874: athrow
    //   875: areturn
    //   876: aconst_null
    //   877: athrow
    //   878: aconst_null
    //   879: athrow
    //   880: aconst_null
    //   881: athrow
    //   882: aconst_null
    //   883: athrow
    //   884: aconst_null
    //   885: athrow
    //   886: aconst_null
    //   887: athrow
    //   888: aconst_null
    //   889: athrow
    //   890: aconst_null
    //   891: athrow
    //   892: aconst_null
    //   893: athrow
    //   894: aconst_null
    //   895: athrow
    //   896: aconst_null
    //   897: athrow
    //   898: aconst_null
    //   899: athrow
    //   900: aconst_null
    //   901: athrow
    //   902: pop
    //   903: goto -> 24
    //   906: pop
    //   907: aconst_null
    //   908: goto -> 902
    //   911: dup
    //   912: ifnull -> 902
    //   915: checkcast java/lang/Throwable
    //   918: athrow
    //   919: dup
    //   920: ifnull -> 906
    //   923: checkcast java/lang/Throwable
    //   926: athrow
    //   927: aconst_null
    //   928: athrow
    // Exception table:
    //   from	to	target	type
    //   8	20	911	finally
    //   604	610	610	finally
    //   604	610	610	finally
    //   604	610	610	java/lang/NullPointerException
    //   604	610	3	finally
    //   604	610	610	finally
    //   868	874	874	finally
    //   868	874	3	finally
    //   868	874	874	finally
    //   868	874	3	finally
    //   868	874	874	java/lang/NegativeArraySizeException
    //   911	919	911	java/util/ConcurrentModificationException
    //   927	929	3	java/lang/IndexOutOfBoundsException
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public static float[] getLegitRotations(Vec3d paramVec3d) {
    return Perry1.6x(null, (int)806304695L ^ 0x1B5F85FC, paramVec3d);
  }
  
  public static int getDirection4D() {
    return Perry1.2R(null, (int)1351768635L ^ 0x5C562F91);
  }
  
  public static void faceYawAndPitch(float yaw, float pitch) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\RotationUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */