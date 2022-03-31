package bigname.zprestige.webhack.event;

import Perry1;
import net.minecraftforge.fml.common.eventhandler.Event;

public class EventStage extends Event {
  public int stage;
  
  public void setStage(int paramInt) {
    Perry1.y(this, (int)-1402520131L ^ 0xFF6A5C59, paramInt);
  }
  
  public int getStage() {
    return Perry1.2S(this, (int)513580407L ^ 0x5903E630);
  }
  
  public EventStage() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -444803517
    //   9: l2i
    //   10: ldc 881277663
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 805785524
    //   19: l2i
    //   20: ldc -840851110
    //   22: ixor
    //   23: ldc2_w 1803541934
    //   26: l2i
    //   27: ldc -2082038550
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, 690465729 -> 16, 962768344 -> 120
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w 1508384788
    //   66: l2i
    //   67: ldc -1120187705
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -361294713
    //   76: l2i
    //   77: ldc 1569268059
    //   79: ixor
    //   80: ldc2_w 2019950120
    //   83: l2i
    //   84: ldc 103957281
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1702570022 -> 122, 591919655 -> 73
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/event/EventStage;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public EventStage(int stage) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 1338857163
    //   9: l2i
    //   10: ldc -26257155
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 609338050
    //   19: l2i
    //   20: ldc 2001689567
    //   22: ixor
    //   23: ldc2_w 906138209
    //   26: l2i
    //   27: ldc 981079274
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 300, -1109751619 -> 16, 1600528278 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w -633787511
    //   66: l2i
    //   67: ldc -2618489
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1458064161
    //   76: l2i
    //   77: ldc 418191749
    //   79: ixor
    //   80: ldc2_w 257313550
    //   83: l2i
    //   84: ldc 155738596
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1983130660 -> 73, 603917028 -> 308
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.0 : I
    //   122: ifle -> 135
    //   125: ldc2_w -1161958370
    //   128: l2i
    //   129: ldc 1013714032
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -1700946173
    //   138: l2i
    //   139: ldc 893877919
    //   141: ixor
    //   142: ldc2_w 1725822905
    //   145: l2i
    //   146: ldc 1565754515
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, -1117809852 -> 302, -291500035 -> 135
    //   176: aload_0
    //   177: getstatic Perryc.0 : I
    //   180: ifle -> 193
    //   183: ldc2_w -1522335845
    //   186: l2i
    //   187: ldc 629546294
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w -1871278372
    //   196: l2i
    //   197: ldc 1360859979
    //   199: ixor
    //   200: ldc2_w 1147387996
    //   203: l2i
    //   204: ldc -568030291
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 306, 444836188 -> 193, 1529665126 -> 236
    //   236: iload_1
    //   237: getstatic Perryc.0 : I
    //   240: ifle -> 253
    //   243: ldc2_w -796925456
    //   246: l2i
    //   247: ldc 445445497
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w -24698104
    //   256: l2i
    //   257: ldc 474039562
    //   259: ixor
    //   260: ldc2_w -311069858
    //   263: l2i
    //   264: ldc -775661138
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 296, -1484216307 -> 253, -163430791 -> 304
    //   296: putfield stage : I
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
    //   0	300	0	this	Lbigname/zprestige/webhack/event/EventStage;
    //   0	300	1	stage	I
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\EventStage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */