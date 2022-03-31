package bigname.zprestige.webhack.manager.Identity;

import Perry1;
import java.io.Closeable;

public abstract class UtilTwo$CloseOperation extends UtilTwo$Operation {
  public boolean ignoreCloseExceptions;
  
  public Closeable closeable;
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public UtilTwo$CloseOperation(Closeable closeable, boolean ignoreCloseExceptions) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -377433567
    //   9: l2i
    //   10: ldc -720476806
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 90745029
    //   19: l2i
    //   20: ldc 1169585333
    //   22: ixor
    //   23: ldc2_w -2110708876
    //   26: l2i
    //   27: ldc 2009226827
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -914503068 -> 492, 759970388 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w -1986207223
    //   66: l2i
    //   67: ldc 1619692143
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -1462775745
    //   76: l2i
    //   77: ldc -1265211939
    //   79: ixor
    //   80: ldc2_w 1409258345
    //   83: l2i
    //   84: ldc -418086069
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, 811877195 -> 73, 1576892484 -> 488
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.c : I
    //   122: iflt -> 135
    //   125: ldc2_w 36788399
    //   128: l2i
    //   129: ldc -566495121
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -791899201
    //   138: l2i
    //   139: ldc -2012487839
    //   141: ixor
    //   142: ldc2_w -513295776
    //   145: l2i
    //   146: ldc 1054834172
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 486, -2021684414 -> 176, 62023516 -> 135
    //   176: aload_0
    //   177: getstatic Perryc.0 : I
    //   180: ifle -> 193
    //   183: ldc2_w 545485285
    //   186: l2i
    //   187: ldc -1111468834
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w 719477753
    //   196: l2i
    //   197: ldc 411668560
    //   199: ixor
    //   200: ldc2_w 540809608
    //   203: l2i
    //   204: ldc -78690701
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 480, -384265134 -> 236, 1177582272 -> 193
    //   236: aload_1
    //   237: getstatic Perryc.c : I
    //   240: iflt -> 253
    //   243: ldc2_w 1773675475
    //   246: l2i
    //   247: ldc -1478323148
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w -761683289
    //   256: l2i
    //   257: ldc 585303234
    //   259: ixor
    //   260: ldc2_w -1121701840
    //   263: l2i
    //   264: ldc 1566993809
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 296, -536075704 -> 253, 773384774 -> 494
    //   296: putfield closeable : Ljava/io/Closeable;
    //   299: getstatic Perryc.c : I
    //   302: iflt -> 315
    //   305: ldc2_w -1373854258
    //   308: l2i
    //   309: ldc -2117061910
    //   311: ixor
    //   312: goto -> 322
    //   315: ldc2_w 598683715
    //   318: l2i
    //   319: ldc -1999470954
    //   321: ixor
    //   322: ldc2_w -1912592779
    //   325: l2i
    //   326: ldc 1804050154
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 356, -901042245 -> 482, 918374332 -> 315
    //   356: aload_0
    //   357: getstatic Perryc.1 : I
    //   360: ifeq -> 373
    //   363: ldc2_w -1642966307
    //   366: l2i
    //   367: ldc -1951728361
    //   369: ixor
    //   370: goto -> 380
    //   373: ldc2_w -1215063106
    //   376: l2i
    //   377: ldc 1259285886
    //   379: ixor
    //   380: ldc2_w 1397229378
    //   383: l2i
    //   384: ldc 654236604
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 416, -1499919426 -> 373, 1611559732 -> 490
    //   416: iload_2
    //   417: getstatic Perryc.0 : I
    //   420: ifle -> 433
    //   423: ldc2_w 1837176134
    //   426: l2i
    //   427: ldc -1342101850
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 50975358
    //   436: l2i
    //   437: ldc 1218743839
    //   439: ixor
    //   440: ldc2_w 1165639085
    //   443: l2i
    //   444: ldc -67748364
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, 433274757 -> 433, 1661744057 -> 484
    //   476: putfield ignoreCloseExceptions : Z
    //   479: return
    //   480: aconst_null
    //   481: athrow
    //   482: aconst_null
    //   483: athrow
    //   484: aconst_null
    //   485: athrow
    //   486: aconst_null
    //   487: athrow
    //   488: aconst_null
    //   489: athrow
    //   490: aconst_null
    //   491: athrow
    //   492: aconst_null
    //   493: athrow
    //   494: aconst_null
    //   495: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	480	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo$CloseOperation;
    //   0	480	1	closeable	Ljava/io/Closeable;
    //   0	480	2	ignoreCloseExceptions	Z
    // Local variable type table:
    //   start	length	slot	name	signature
    //   0	480	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo$CloseOperation<TV;>;
  }
  
  public void done() {
    Perry1.43(this, (int)1360537549L ^ 0x6BED7695);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\Identity\UtilTwo$CloseOperation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */