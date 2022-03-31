package bigname.zprestige.webhack.event.events;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.EventStage;
import net.minecraft.network.Packet;

public class PacketEvent extends EventStage {
  public Packet$Type type;
  
  public Packet<?> packet;
  
  public void setType(Packet$Type paramPacket$Type) {
    Perry1.1i(this, (int)749717331L ^ 0x42411E4, paramPacket$Type);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public Packet getPacket() {
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
  
  public PacketEvent(int stage, Packet<?> packet) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 767522581
    //   9: l2i
    //   10: ldc -1321260898
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1853768666
    //   19: l2i
    //   20: ldc 1111591986
    //   22: ixor
    //   23: ldc2_w -1748777030
    //   26: l2i
    //   27: ldc -350249473
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -530840114 -> 366, 1906492692 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w -1082087124
    //   66: l2i
    //   67: ldc 96337135
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1224392989
    //   76: l2i
    //   77: ldc -1370335578
    //   79: ixor
    //   80: ldc2_w 1652743589
    //   83: l2i
    //   84: ldc 1659825868
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1169070422 -> 362, -945241233 -> 73
    //   116: iload_1
    //   117: getstatic Perryc.c : I
    //   120: iflt -> 133
    //   123: ldc2_w -93287136
    //   126: l2i
    //   127: ldc -1935787050
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w -350735631
    //   136: l2i
    //   137: ldc -792859075
    //   139: ixor
    //   140: ldc2_w 787964729
    //   143: l2i
    //   144: ldc -1853967621
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 176, -915970252 -> 364, 1927037603 -> 133
    //   176: invokespecial <init> : (I)V
    //   179: getstatic Perryc.1 : I
    //   182: ifeq -> 195
    //   185: ldc2_w -875764792
    //   188: l2i
    //   189: ldc 437964967
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w 2004951514
    //   198: l2i
    //   199: ldc 1314648521
    //   201: ixor
    //   202: ldc2_w 2119230652
    //   205: l2i
    //   206: ldc 1037849999
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 236, -1839562148 -> 368, 1704343937 -> 195
    //   236: aload_0
    //   237: getstatic Perryc.c : I
    //   240: iflt -> 253
    //   243: ldc2_w -547090794
    //   246: l2i
    //   247: ldc 60237651
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w -1990222899
    //   256: l2i
    //   257: ldc -25725778
    //   259: ixor
    //   260: ldc2_w -2094399775
    //   263: l2i
    //   264: ldc 1169065755
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 360, -1313892711 -> 296, 443830335 -> 253
    //   296: aload_2
    //   297: getstatic Perryc.c : I
    //   300: iflt -> 313
    //   303: ldc2_w 1022931810
    //   306: l2i
    //   307: ldc -821031506
    //   309: ixor
    //   310: goto -> 320
    //   313: ldc2_w 986729876
    //   316: l2i
    //   317: ldc -212514650
    //   319: ixor
    //   320: ldc2_w -1336745443
    //   323: l2i
    //   324: ldc 1274436626
    //   326: ixor
    //   327: ixor
    //   328: lookupswitch default -> 356, -2006632752 -> 313, 139198659 -> 370
    //   356: putfield packet : Lnet/minecraft/network/Packet;
    //   359: return
    //   360: aconst_null
    //   361: athrow
    //   362: aconst_null
    //   363: athrow
    //   364: aconst_null
    //   365: athrow
    //   366: aconst_null
    //   367: athrow
    //   368: aconst_null
    //   369: athrow
    //   370: aconst_null
    //   371: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	360	0	this	Lbigname/zprestige/webhack/event/events/PacketEvent;
    //   0	360	1	stage	I
    //   0	360	2	packet	Lnet/minecraft/network/Packet;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   0	360	2	packet	Lnet/minecraft/network/Packet<*>;
  }
  
  public Packet$Type getType() {
    return Perry1.s(this, (int)423402474L ^ 0x1E18089);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\PacketEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */