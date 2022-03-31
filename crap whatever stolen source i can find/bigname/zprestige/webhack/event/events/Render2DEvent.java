package bigname.zprestige.webhack.event.events;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.EventStage;
import net.minecraft.client.gui.ScaledResolution;

public class Render2DEvent extends EventStage {
  public ScaledResolution scaledResolution;
  
  public float partialTicks;
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void setPartialTicks(float paramFloat) {
    Perry1.1c(this, (int)-643392991L ^ 0xDCF6FE45, paramFloat);
  }
  
  public double getScreenWidth() {
    return Perry1.2B(this, (int)369973286L ^ 0x10F8937E);
  }
  
  public Render2DEvent(float partialTicks, ScaledResolution scaledResolution) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 248329769
    //   9: l2i
    //   10: ldc 215035770
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1480370837
    //   19: l2i
    //   20: ldc -1889759907
    //   22: ixor
    //   23: ldc2_w 710293542
    //   26: l2i
    //   27: ldc 1607095513
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -2108760813 -> 16, 2004907436 -> 484
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w 102955952
    //   66: l2i
    //   67: ldc -445959328
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 29013599
    //   76: l2i
    //   77: ldc -348006188
    //   79: ixor
    //   80: ldc2_w 2137131655
    //   83: l2i
    //   84: ldc 1319068847
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 490, -759912712 -> 73, -620363613 -> 116
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.1 : I
    //   122: ifeq -> 135
    //   125: ldc2_w -1533967553
    //   128: l2i
    //   129: ldc -1267720385
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w 1278360728
    //   138: l2i
    //   139: ldc -2042833024
    //   141: ixor
    //   142: ldc2_w 943845432
    //   145: l2i
    //   146: ldc 1550401138
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 482, -1373231790 -> 176, 1959350858 -> 135
    //   176: aload_0
    //   177: getstatic Perryc.c : I
    //   180: iflt -> 193
    //   183: ldc2_w 1946904765
    //   186: l2i
    //   187: ldc 250131369
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w -2063510382
    //   196: l2i
    //   197: ldc 1979631119
    //   199: ixor
    //   200: ldc2_w -1633068639
    //   203: l2i
    //   204: ldc 516466357
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 236, -92134400 -> 486, 1509929387 -> 193
    //   236: fload_1
    //   237: getstatic Perryc.0 : I
    //   240: ifle -> 253
    //   243: ldc2_w 596077165
    //   246: l2i
    //   247: ldc -1285788492
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w 1542945917
    //   256: l2i
    //   257: ldc 1243172165
    //   259: ixor
    //   260: ldc2_w 2046494171
    //   263: l2i
    //   264: ldc -1501449343
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 492, -829126814 -> 296, 1335996547 -> 253
    //   296: putfield partialTicks : F
    //   299: getstatic Perryc.0 : I
    //   302: ifle -> 315
    //   305: ldc2_w 573923857
    //   308: l2i
    //   309: ldc -1749689270
    //   311: ixor
    //   312: goto -> 322
    //   315: ldc2_w -986248702
    //   318: l2i
    //   319: ldc -1116107357
    //   321: ixor
    //   322: ldc2_w 1705432822
    //   325: l2i
    //   326: ldc 1946577919
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 356, -1541405870 -> 480, -1348120527 -> 315
    //   356: aload_0
    //   357: getstatic Perryc.1 : I
    //   360: ifeq -> 373
    //   363: ldc2_w 341148592
    //   366: l2i
    //   367: ldc -1078735159
    //   369: ixor
    //   370: goto -> 380
    //   373: ldc2_w 2054399091
    //   376: l2i
    //   377: ldc -2140690139
    //   379: ixor
    //   380: ldc2_w 1280315836
    //   383: l2i
    //   384: ldc -1562529103
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 416, 866658624 -> 373, 1164701300 -> 488
    //   416: aload_2
    //   417: getstatic Perryc.1 : I
    //   420: ifeq -> 433
    //   423: ldc2_w 326134306
    //   426: l2i
    //   427: ldc 1309623591
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 596671829
    //   436: l2i
    //   437: ldc -6418720
    //   439: ixor
    //   440: ldc2_w 1662612383
    //   443: l2i
    //   444: ldc 1911772593
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, 1335167275 -> 494, 1599039512 -> 433
    //   476: putfield scaledResolution : Lnet/minecraft/client/gui/ScaledResolution;
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
    //   0	480	0	this	Lbigname/zprestige/webhack/event/events/Render2DEvent;
    //   0	480	1	partialTicks	F
    //   0	480	2	scaledResolution	Lnet/minecraft/client/gui/ScaledResolution;
  }
  
  public double getScreenHeight() {
    return Perry1.2F(this, (int)-592380948L ^ 0xF943632E);
  }
  
  public void setScaledResolution(ScaledResolution scaledResolution) {
    if (Perryc.0 <= 0) {
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


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\Render2DEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */