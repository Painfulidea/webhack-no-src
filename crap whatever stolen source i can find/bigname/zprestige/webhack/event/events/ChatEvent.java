package bigname.zprestige.webhack.event.events;

import Perry1;
import bigname.zprestige.webhack.event.EventStage;
import net.minecraftforge.fml.common.eventhandler.Cancelable;

@Cancelable
public class ChatEvent extends EventStage {
  public String msg;
  
  public ChatEvent(String msg) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w -988699175
    //   9: l2i
    //   10: ldc -1894526282
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1181475310
    //   19: l2i
    //   20: ldc -979317886
    //   22: ixor
    //   23: ldc2_w -126937489
    //   26: l2i
    //   27: ldc -1574104583
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -159992083 -> 16, 272658681 -> 300
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 260994593
    //   66: l2i
    //   67: ldc 334209583
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 985144361
    //   76: l2i
    //   77: ldc -1905688683
    //   79: ixor
    //   80: ldc2_w 1525247561
    //   83: l2i
    //   84: ldc 1642547497
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 304, -1881193252 -> 116, 661386094 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.c : I
    //   122: iflt -> 135
    //   125: ldc2_w -573956213
    //   128: l2i
    //   129: ldc -1236234914
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -1873771774
    //   138: l2i
    //   139: ldc -1574805525
    //   141: ixor
    //   142: ldc2_w -963286988
    //   145: l2i
    //   146: ldc -965454865
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 306, 848553778 -> 176, 1803266318 -> 135
    //   176: aload_0
    //   177: getstatic Perryc.c : I
    //   180: iflt -> 193
    //   183: ldc2_w -1883719761
    //   186: l2i
    //   187: ldc 1068179520
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w 1770779296
    //   196: l2i
    //   197: ldc -689889561
    //   199: ixor
    //   200: ldc2_w 826122287
    //   203: l2i
    //   204: ldc 2049030915
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 236, -82867005 -> 302, 1865050542 -> 193
    //   236: aload_1
    //   237: getstatic Perryc.1 : I
    //   240: ifeq -> 253
    //   243: ldc2_w -1913377526
    //   246: l2i
    //   247: ldc 660030491
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w -817437934
    //   256: l2i
    //   257: ldc -1194523256
    //   259: ixor
    //   260: ldc2_w -1089195185
    //   263: l2i
    //   264: ldc -1561908699
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 308, -1219465093 -> 253, 1786314736 -> 296
    //   296: putfield msg : Ljava/lang/String;
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
    //   0	300	0	this	Lbigname/zprestige/webhack/event/events/ChatEvent;
    //   0	300	1	msg	Ljava/lang/String;
  }
  
  public String getMsg() {
    return Perry1.5(this, (int)1541160782L ^ 0x45CF368B);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\ChatEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */