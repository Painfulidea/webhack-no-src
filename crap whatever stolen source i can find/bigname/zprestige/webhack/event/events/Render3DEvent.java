package bigname.zprestige.webhack.event.events;

import Perryc;
import bigname.zprestige.webhack.event.EventStage;

public class Render3DEvent extends EventStage {
  public float partialTicks;
  
  public Render3DEvent(float partialTicks) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 831129373
    //   9: l2i
    //   10: ldc 708314041
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1844374322
    //   19: l2i
    //   20: ldc -282653510
    //   22: ixor
    //   23: ldc2_w 1446301156
    //   26: l2i
    //   27: ldc -1495653392
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -2101837727 -> 16, -346232144 -> 300
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w -860766685
    //   66: l2i
    //   67: ldc -45449351
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1971463317
    //   76: l2i
    //   77: ldc 921520918
    //   79: ixor
    //   80: ldc2_w 1601797330
    //   83: l2i
    //   84: ldc 93406333
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 306, 428300076 -> 116, 1796471285 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.c : I
    //   122: iflt -> 135
    //   125: ldc2_w -1669738091
    //   128: l2i
    //   129: ldc 289124726
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w 1749239345
    //   138: l2i
    //   139: ldc 1774241900
    //   141: ixor
    //   142: ldc2_w -1548519619
    //   145: l2i
    //   146: ldc 1256246821
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, -716310646 -> 135, 1678891515 -> 308
    //   176: aload_0
    //   177: getstatic Perryc.0 : I
    //   180: ifle -> 193
    //   183: ldc2_w 1377185096
    //   186: l2i
    //   187: ldc 703473903
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w 1127692349
    //   196: l2i
    //   197: ldc -1819489670
    //   199: ixor
    //   200: ldc2_w 201253115
    //   203: l2i
    //   204: ldc -261549395
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 302, -2140145679 -> 193, 724303889 -> 236
    //   236: fload_1
    //   237: getstatic Perryc.c : I
    //   240: iflt -> 253
    //   243: ldc2_w 106144720
    //   246: l2i
    //   247: ldc 1986484618
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w 1024592198
    //   256: l2i
    //   257: ldc -1837552706
    //   259: ixor
    //   260: ldc2_w -2134902375
    //   263: l2i
    //   264: ldc 1795767672
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 304, -1685963077 -> 253, 1155393049 -> 296
    //   296: putfield partialTicks : F
    //   299: return
    //   300: aconst_null
    //   301: athrow
    //   302: aconst_null
    //   303: athrow
    //   304: aconst_null
    //   305: athrow
    //   306: aconst_null
    //   307: athrow
    //   308: aconst_null
    //   309: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	300	0	this	Lbigname/zprestige/webhack/event/events/Render3DEvent;
    //   0	300	1	partialTicks	F
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public float getPartialTicks() {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\Render3DEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */