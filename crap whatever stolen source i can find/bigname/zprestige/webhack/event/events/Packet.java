package bigname.zprestige.webhack.event.events;

import Perry1;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.Event;

@Cancelable
public class Packet extends Event {
  public Packet$Type type;
  
  public Object packet;
  
  public void setType(Packet$Type paramPacket$Type) {
    Perry1.1i(this, (int)374403179L ^ 0x3EDB26DB, paramPacket$Type);
  }
  
  public Object getPacket() {
    return Perry1.2h(this, (int)495513426L ^ 0x66CD400B);
  }
  
  public Packet$Type getType() {
    return Perry1.s(this, (int)-1316720104L ^ 0xA959697A);
  }
  
  public void setPacket(Object paramObject) {
    Perry1.1n(this, (int)-1399158652L ^ 0x93BD709B, paramObject);
  }
  
  public Packet(Object packet, Packet$Type type) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w -1375153050
    //   9: l2i
    //   10: ldc -1486408212
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1220903157
    //   19: l2i
    //   20: ldc -1452405882
    //   22: ixor
    //   23: ldc2_w -1588022715
    //   26: l2i
    //   27: ldc 1597330540
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 484, -150861917 -> 16, 533097818 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.1 : I
    //   60: ifeq -> 73
    //   63: ldc2_w -2096070734
    //   66: l2i
    //   67: ldc -1744463438
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -192642311
    //   76: l2i
    //   77: ldc -1010467981
    //   79: ixor
    //   80: ldc2_w 904579446
    //   83: l2i
    //   84: ldc -604512208
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 490, -648228660 -> 116, -183972026 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.c : I
    //   122: iflt -> 135
    //   125: ldc2_w -951391199
    //   128: l2i
    //   129: ldc -1707443802
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -1965248092
    //   138: l2i
    //   139: ldc -420136365
    //   141: ixor
    //   142: ldc2_w -1617250881
    //   145: l2i
    //   146: ldc -1174960234
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 482, 1246018014 -> 176, 2065541038 -> 135
    //   176: aload_0
    //   177: getstatic Perryc.c : I
    //   180: iflt -> 193
    //   183: ldc2_w -1356554550
    //   186: l2i
    //   187: ldc -353742973
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w 2081550537
    //   196: l2i
    //   197: ldc -1897686771
    //   199: ixor
    //   200: ldc2_w -1537617343
    //   203: l2i
    //   204: ldc -1718010225
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 236, -912830445 -> 193, 2014199175 -> 494
    //   236: aload_1
    //   237: getstatic Perryc.0 : I
    //   240: ifle -> 253
    //   243: ldc2_w -1285487313
    //   246: l2i
    //   247: ldc -1529873015
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w 496346929
    //   256: l2i
    //   257: ldc 1601383361
    //   259: ixor
    //   260: ldc2_w 789593144
    //   263: l2i
    //   264: ldc 1364623702
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 296, 1729572707 -> 253, 1776829896 -> 492
    //   296: putfield packet : Ljava/lang/Object;
    //   299: getstatic Perryc.0 : I
    //   302: ifle -> 315
    //   305: ldc2_w 1198775574
    //   308: l2i
    //   309: ldc 518894585
    //   311: ixor
    //   312: goto -> 322
    //   315: ldc2_w 1526347682
    //   318: l2i
    //   319: ldc -118718620
    //   321: ixor
    //   322: ldc2_w -532562466
    //   325: l2i
    //   326: ldc 1554149754
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 480, -444751285 -> 315, 519406690 -> 356
    //   356: aload_0
    //   357: getstatic Perryc.c : I
    //   360: iflt -> 373
    //   363: ldc2_w -617030382
    //   366: l2i
    //   367: ldc -2026862283
    //   369: ixor
    //   370: goto -> 380
    //   373: ldc2_w 633801221
    //   376: l2i
    //   377: ldc 992890774
    //   379: ixor
    //   380: ldc2_w -1822154016
    //   383: l2i
    //   384: ldc 1887666386
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 416, -1074792939 -> 486, 645223101 -> 373
    //   416: aload_2
    //   417: getstatic Perryc.0 : I
    //   420: ifle -> 433
    //   423: ldc2_w -585807878
    //   426: l2i
    //   427: ldc -693654004
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 1422129623
    //   436: l2i
    //   437: ldc -84482689
    //   439: ixor
    //   440: ldc2_w 74889542
    //   443: l2i
    //   444: ldc -128964204
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, -141264604 -> 488, 1414507124 -> 433
    //   476: putfield type : Lbigname/zprestige/webhack/event/events/Packet$Type;
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
    //   0	480	0	this	Lbigname/zprestige/webhack/event/events/Packet;
    //   0	480	1	packet	Ljava/lang/Object;
    //   0	480	2	type	Lbigname/zprestige/webhack/event/events/Packet$Type;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\Packet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */