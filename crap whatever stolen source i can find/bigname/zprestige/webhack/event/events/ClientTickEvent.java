package bigname.zprestige.webhack.event.events;

import bigname.zprestige.webhack.event.EventStage;

public class ClientTickEvent extends EventStage {
  public ClientTickEvent(int stage) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 126688674
    //   9: l2i
    //   10: ldc 1730744237
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 937262197
    //   19: l2i
    //   20: ldc 1538036784
    //   22: ixor
    //   23: ldc2_w -97226356
    //   26: l2i
    //   27: ldc -181153803
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -357932106 -> 16, 1872997494 -> 182
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 1383684778
    //   66: l2i
    //   67: ldc 2060955216
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1842711151
    //   76: l2i
    //   77: ldc 386416509
    //   79: ixor
    //   80: ldc2_w 2144900416
    //   83: l2i
    //   84: ldc -1771235413
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1055164911 -> 180, -503182114 -> 73
    //   116: iload_1
    //   117: getstatic Perryc.c : I
    //   120: iflt -> 133
    //   123: ldc2_w 308249003
    //   126: l2i
    //   127: ldc 1461835357
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w 852007839
    //   136: l2i
    //   137: ldc -713877826
    //   139: ixor
    //   140: ldc2_w -1031215807
    //   143: l2i
    //   144: ldc -2073744491
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 176, -1519670456 -> 133, 60004642 -> 184
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
    //   0	180	0	this	Lbigname/zprestige/webhack/event/events/ClientTickEvent;
    //   0	180	1	stage	I
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\ClientTickEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */