package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;

public class Timer {
  public long time;
  
  public long getMs(long paramLong) {
    return Perry1.6b(this, (int)1214426844L ^ 0x42DD281C, paramLong);
  }
  
  public long convertToNS(long paramLong) {
    return Perry1.6b(this, (int)-1770345013L ^ 0x9CC52B0A, paramLong);
  }
  
  public Timer reset() {
    return Perry1.07(this, (int)-1159440190L ^ 0xD7B4AA54);
  }
  
  public Timer() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 306282802
    //   9: l2i
    //   10: ldc 1731722595
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 3215956
    //   19: l2i
    //   20: ldc 136544230
    //   22: ixor
    //   23: ldc2_w -1447039720
    //   26: l2i
    //   27: ldc -1550352714
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 248, 37420572 -> 56, 2136928255 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w 2015492908
    //   66: l2i
    //   67: ldc -1814101523
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -1300629495
    //   76: l2i
    //   77: ldc -140652208
    //   79: ixor
    //   80: ldc2_w -466897993
    //   83: l2i
    //   84: ldc 37984514
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 244, -1551105044 -> 116, 227987572 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.c : I
    //   122: iflt -> 135
    //   125: ldc2_w 1846612995
    //   128: l2i
    //   129: ldc -1397602247
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w 1059970134
    //   138: l2i
    //   139: ldc 1544348667
    //   141: ixor
    //   142: ldc2_w -2142143022
    //   145: l2i
    //   146: ldc 138465550
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 250, -349138063 -> 176, 1253241062 -> 135
    //   176: aload_0
    //   177: ldc 19588854
    //   179: i2l
    //   180: ldc2_w -19588855
    //   183: lxor
    //   184: getstatic Perryc.c : I
    //   187: iflt -> 200
    //   190: ldc2_w 803309862
    //   193: l2i
    //   194: ldc 1455502217
    //   196: ixor
    //   197: goto -> 207
    //   200: ldc2_w -340455274
    //   203: l2i
    //   204: ldc 978048048
    //   206: ixor
    //   207: ldc2_w -1827186712
    //   210: l2i
    //   211: ldc -1809606794
    //   213: ixor
    //   214: ixor
    //   215: lookupswitch default -> 240, -314558944 -> 200, 2115271217 -> 246
    //   240: putfield time : J
    //   243: return
    //   244: aconst_null
    //   245: athrow
    //   246: aconst_null
    //   247: athrow
    //   248: aconst_null
    //   249: athrow
    //   250: aconst_null
    //   251: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	244	0	this	Lbigname/zprestige/webhack/util/Timer;
  }
  
  public boolean passedDs(double paramDouble) {
    return Perry1.4R(this, (int)-258190932L ^ 0xFF3652FA, paramDouble);
  }
  
  public boolean passedMs(long paramLong) {
    return Perry1.5N(this, (int)2088166982L ^ 0x6E86B21C, paramLong);
  }
  
  public void setMs(long ms) {
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
  
  public long getPassedTimeMs() {
    return Perry1.38(this, (int)-1716484658L ^ 0x8FE6A662);
  }
  
  public boolean passedNS(long paramLong) {
    return Perry1.5N(this, (int)1514231473L ^ 0x48B102E8, paramLong);
  }
  
  public boolean passedS(double paramDouble) {
    return Perry1.4R(this, (int)501370244L ^ 0x12484ED3, paramDouble);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\Timer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */