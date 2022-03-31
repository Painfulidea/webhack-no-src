package bigname.zprestige.webhack.event.events;

import Perry1;
import bigname.zprestige.webhack.event.EventStage;

public class KeyEvent extends EventStage {
  public int key;
  
  public int getKey() {
    return Perry1.33(this, (int)897388712L ^ 0x39B96A9F);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public KeyEvent(int key) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 2016315306
    //   9: l2i
    //   10: ldc 1561755216
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -67392261
    //   19: l2i
    //   20: ldc -913318918
    //   22: ixor
    //   23: ldc2_w -600357471
    //   26: l2i
    //   27: ldc 544690022
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 302, -835420730 -> 56, -646384835 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w -1345935724
    //   66: l2i
    //   67: ldc -437692412
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 118134144
    //   76: l2i
    //   77: ldc 2021525041
    //   79: ixor
    //   80: ldc2_w 707060804
    //   83: l2i
    //   84: ldc 1291499922
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, 188850717 -> 73, 754033478 -> 300
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.0 : I
    //   122: ifle -> 135
    //   125: ldc2_w -721417860
    //   128: l2i
    //   129: ldc -1521357106
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w 1229873416
    //   138: l2i
    //   139: ldc -117762742
    //   141: ixor
    //   142: ldc2_w -611193138
    //   145: l2i
    //   146: ldc -594348241
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, 926797510 -> 135, 2001927763 -> 308
    //   176: aload_0
    //   177: getstatic Perryc.0 : I
    //   180: ifle -> 193
    //   183: ldc2_w -1216390779
    //   186: l2i
    //   187: ldc -208966750
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w 610074330
    //   196: l2i
    //   197: ldc -1547532987
    //   199: ixor
    //   200: ldc2_w -1106524454
    //   203: l2i
    //   204: ldc -609388090
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 304, -499596157 -> 236, 559058235 -> 193
    //   236: iload_1
    //   237: getstatic Perryc.c : I
    //   240: iflt -> 253
    //   243: ldc2_w -587351609
    //   246: l2i
    //   247: ldc 1839207430
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w 1697660708
    //   256: l2i
    //   257: ldc 1712969831
    //   259: ixor
    //   260: ldc2_w 384566355
    //   263: l2i
    //   264: ldc -1468541692
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 296, -389025628 -> 253, 264666262 -> 306
    //   296: putfield key : I
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
    //   0	300	0	this	Lbigname/zprestige/webhack/event/events/KeyEvent;
    //   0	300	1	key	I
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\KeyEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */