package bigname.zprestige.webhack.features.modules.Movement;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.util.Timer;
import net.minecraft.util.math.Vec3d;

public class Phase$IDtime {
  public Timer timer;
  
  public Vec3d pos;
  
  public Phase$IDtime(Vec3d pos, Timer timer) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 1422954305
    //   9: l2i
    //   10: ldc 824485423
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 222449266
    //   19: l2i
    //   20: ldc 1782579322
    //   22: ixor
    //   23: ldc2_w -293721193
    //   26: l2i
    //   27: ldc -1712144710
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1688196864 -> 16, 309902403 -> 675
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 1245481988
    //   66: l2i
    //   67: ldc 1754582590
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 156589903
    //   76: l2i
    //   77: ldc 2016209092
    //   79: ixor
    //   80: ldc2_w -1844212975
    //   83: l2i
    //   84: ldc 1655952045
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 677, -2116424137 -> 116, -771220602 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.c : I
    //   122: iflt -> 135
    //   125: ldc2_w -1832570064
    //   128: l2i
    //   129: ldc -1544159584
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -1303914903
    //   138: l2i
    //   139: ldc -1170672325
    //   141: ixor
    //   142: ldc2_w -1770043079
    //   145: l2i
    //   146: ldc 1917493452
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, -1462216545 -> 135, -721083291 -> 679
    //   176: aload_0
    //   177: getstatic Perryc.1 : I
    //   180: ifeq -> 193
    //   183: ldc2_w 2062029869
    //   186: l2i
    //   187: ldc 872600940
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w 1665168860
    //   196: l2i
    //   197: ldc 1000723705
    //   199: ixor
    //   200: ldc2_w -807339146
    //   203: l2i
    //   204: ldc -1644567715
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 667, 184334606 -> 236, 485742954 -> 193
    //   236: aload_1
    //   237: getstatic Perryc.0 : I
    //   240: ifle -> 253
    //   243: ldc2_w -587255555
    //   246: l2i
    //   247: ldc 1671896879
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w -778726042
    //   256: l2i
    //   257: ldc 94585791
    //   259: ixor
    //   260: ldc2_w -445783517
    //   263: l2i
    //   264: ldc 223343102
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 296, -1535936372 -> 253, 1467628559 -> 681
    //   296: putfield pos : Lnet/minecraft/util/math/Vec3d;
    //   299: getstatic Perryc.0 : I
    //   302: ifle -> 315
    //   305: ldc2_w 1497602843
    //   308: l2i
    //   309: ldc 1709779498
    //   311: ixor
    //   312: goto -> 322
    //   315: ldc2_w -1164266342
    //   318: l2i
    //   319: ldc -1311095922
    //   321: ixor
    //   322: ldc2_w 1394668618
    //   325: l2i
    //   326: ldc -138286137
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 356, -1739870532 -> 669, -1143776637 -> 315
    //   356: aload_0
    //   357: getstatic Perryc.c : I
    //   360: iflt -> 373
    //   363: ldc2_w -583346677
    //   366: l2i
    //   367: ldc -2058572623
    //   369: ixor
    //   370: goto -> 380
    //   373: ldc2_w 1018054758
    //   376: l2i
    //   377: ldc 654218316
    //   379: ixor
    //   380: ldc2_w 896475664
    //   383: l2i
    //   384: ldc -1187971130
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 416, -1213287913 -> 373, -735467668 -> 663
    //   416: aload_2
    //   417: getstatic Perryc.0 : I
    //   420: ifle -> 433
    //   423: ldc2_w 1645648994
    //   426: l2i
    //   427: ldc -139587264
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 654534791
    //   436: l2i
    //   437: ldc -1100262576
    //   439: ixor
    //   440: ldc2_w 1086121974
    //   443: l2i
    //   444: ldc -1787130680
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, -66456967 -> 433, 1082058268 -> 661
    //   476: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   479: getstatic Perryc.0 : I
    //   482: ifle -> 495
    //   485: ldc2_w 238711483
    //   488: l2i
    //   489: ldc -1993297426
    //   491: ixor
    //   492: goto -> 502
    //   495: ldc2_w 688810677
    //   498: l2i
    //   499: ldc -327816229
    //   501: ixor
    //   502: ldc2_w -757059969
    //   505: l2i
    //   506: ldc -660298653
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 536, -1924249271 -> 671, -1040484892 -> 495
    //   536: aload_0
    //   537: getstatic Perryc.c : I
    //   540: iflt -> 553
    //   543: ldc2_w -1678187774
    //   546: l2i
    //   547: ldc 2128648058
    //   549: ixor
    //   550: goto -> 560
    //   553: ldc2_w 378211241
    //   556: l2i
    //   557: ldc 412656313
    //   559: ixor
    //   560: ldc2_w -295293069
    //   563: l2i
    //   564: ldc -165835524
    //   566: ixor
    //   567: ixor
    //   568: lookupswitch default -> 596, -43788297 -> 665, 1914593611 -> 553
    //   596: getfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   599: getstatic Perryc.c : I
    //   602: iflt -> 615
    //   605: ldc2_w -1403378585
    //   608: l2i
    //   609: ldc -1503079890
    //   611: ixor
    //   612: goto -> 622
    //   615: ldc2_w -1935403537
    //   618: l2i
    //   619: ldc 1244805265
    //   621: ixor
    //   622: ldc2_w -1066394928
    //   625: l2i
    //   626: ldc 1787922181
    //   628: ixor
    //   629: ixor
    //   630: lookupswitch default -> 656, -1596757092 -> 673, 1392400126 -> 615
    //   656: invokevirtual reset : ()Lbigname/zprestige/webhack/util/Timer;
    //   659: pop
    //   660: return
    //   661: aconst_null
    //   662: athrow
    //   663: aconst_null
    //   664: athrow
    //   665: aconst_null
    //   666: athrow
    //   667: aconst_null
    //   668: athrow
    //   669: aconst_null
    //   670: athrow
    //   671: aconst_null
    //   672: athrow
    //   673: aconst_null
    //   674: athrow
    //   675: aconst_null
    //   676: athrow
    //   677: aconst_null
    //   678: athrow
    //   679: aconst_null
    //   680: athrow
    //   681: aconst_null
    //   682: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	661	0	this	Lbigname/zprestige/webhack/features/modules/Movement/Phase$IDtime;
    //   0	661	1	pos	Lnet/minecraft/util/math/Vec3d;
    //   0	661	2	timer	Lbigname/zprestige/webhack/util/Timer;
  }
  
  public Timer getTimer() {
    return Perry1.07(this, (int)-198534210L ^ 0x997A6929);
  }
  
  public Vec3d getPos() {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Movement\Phase$IDtime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */