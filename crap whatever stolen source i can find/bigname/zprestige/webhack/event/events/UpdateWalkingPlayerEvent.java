package bigname.zprestige.webhack.event.events;

import bigname.zprestige.webhack.event.EventStage;

public class UpdateWalkingPlayerEvent extends EventStage {
  public UpdateWalkingPlayerEvent(int stage) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 1787386384
    //   9: l2i
    //   10: ldc 1371305319
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1059082730
    //   19: l2i
    //   20: ldc 1404966849
    //   22: ixor
    //   23: ldc2_w 1302326319
    //   26: l2i
    //   27: ldc -1093619990
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -931500622 -> 180, 804974121 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 1948505819
    //   66: l2i
    //   67: ldc -1829137548
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 763836824
    //   76: l2i
    //   77: ldc 56691986
    //   79: ixor
    //   80: ldc2_w 1291874486
    //   83: l2i
    //   84: ldc 578063001
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 182, -1985036416 -> 73, 1100140197 -> 116
    //   116: iload_1
    //   117: getstatic Perryc.0 : I
    //   120: ifle -> 133
    //   123: ldc2_w -70362671
    //   126: l2i
    //   127: ldc -1152040602
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w 493431718
    //   136: l2i
    //   137: ldc 954074568
    //   139: ixor
    //   140: ldc2_w 997136221
    //   143: l2i
    //   144: ldc -2050583801
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 184, -1692489164 -> 176, -30237459 -> 133
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
    //   0	180	0	this	Lbigname/zprestige/webhack/event/events/UpdateWalkingPlayerEvent;
    //   0	180	1	stage	I
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\UpdateWalkingPlayerEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */