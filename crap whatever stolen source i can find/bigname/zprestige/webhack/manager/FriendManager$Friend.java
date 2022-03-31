package bigname.zprestige.webhack.manager;

import Perry1;
import Perryc;
import java.util.UUID;

public class FriendManager$Friend {
  public String username;
  
  public UUID uuid;
  
  public UUID getUuid() {
    return Perry1.1g(this, (int)952208729L ^ 0x6C9DC785);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public String getUsername() {
    return Perry1.a(this, (int)-1080163239L ^ 0xDF39BFBB);
  }
  
  public FriendManager$Friend(String username, UUID uuid) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w -481489199
    //   9: l2i
    //   10: ldc -568634315
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -850627423
    //   19: l2i
    //   20: ldc 207401861
    //   22: ixor
    //   23: ldc2_w 2086998088
    //   26: l2i
    //   27: ldc -765326631
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1823391627 -> 484, 2134579425 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 105729344
    //   66: l2i
    //   67: ldc -1757732388
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 939693444
    //   76: l2i
    //   77: ldc -69112653
    //   79: ixor
    //   80: ldc2_w -854269072
    //   83: l2i
    //   84: ldc 849981187
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -172737314 -> 73, 1858805999 -> 490
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.0 : I
    //   122: ifle -> 135
    //   125: ldc2_w 1633747897
    //   128: l2i
    //   129: ldc -572693020
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w 584907199
    //   138: l2i
    //   139: ldc -932143787
    //   141: ixor
    //   142: ldc2_w -127218792
    //   145: l2i
    //   146: ldc 1476343854
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, 321492459 -> 494, 1067041957 -> 135
    //   176: aload_0
    //   177: getstatic Perryc.0 : I
    //   180: ifle -> 193
    //   183: ldc2_w 729122909
    //   186: l2i
    //   187: ldc 1420143006
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w -1478760498
    //   196: l2i
    //   197: ldc 1735542831
    //   199: ixor
    //   200: ldc2_w 765733109
    //   203: l2i
    //   204: ldc 236066679
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 236, -832516866 -> 193, 1550196289 -> 486
    //   236: aload_1
    //   237: getstatic Perryc.0 : I
    //   240: ifle -> 253
    //   243: ldc2_w -1021973537
    //   246: l2i
    //   247: ldc -931845319
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w -609003251
    //   256: l2i
    //   257: ldc -31868597
    //   259: ixor
    //   260: ldc2_w 172359028
    //   263: l2i
    //   264: ldc -1706134004
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 488, -1687467106 -> 253, -1247712450 -> 296
    //   296: putfield username : Ljava/lang/String;
    //   299: getstatic Perryc.c : I
    //   302: iflt -> 315
    //   305: ldc2_w 104950231
    //   308: l2i
    //   309: ldc 1321199351
    //   311: ixor
    //   312: goto -> 322
    //   315: ldc2_w 716200343
    //   318: l2i
    //   319: ldc 1557756038
    //   321: ixor
    //   322: ldc2_w -622665164
    //   325: l2i
    //   326: ldc -871253735
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 492, 1577964557 -> 315, 1620736572 -> 356
    //   356: aload_0
    //   357: getstatic Perryc.0 : I
    //   360: ifle -> 373
    //   363: ldc2_w -695405014
    //   366: l2i
    //   367: ldc 1407323698
    //   369: ixor
    //   370: goto -> 380
    //   373: ldc2_w -408684337
    //   376: l2i
    //   377: ldc -204271265
    //   379: ixor
    //   380: ldc2_w -379340520
    //   383: l2i
    //   384: ldc -333435660
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 482, -2144506380 -> 373, 288586876 -> 416
    //   416: aload_2
    //   417: getstatic Perryc.c : I
    //   420: iflt -> 433
    //   423: ldc2_w 138881927
    //   426: l2i
    //   427: ldc 787783270
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 653322788
    //   436: l2i
    //   437: ldc -475677354
    //   439: ixor
    //   440: ldc2_w 322058278
    //   443: l2i
    //   444: ldc 227755299
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, -1990492897 -> 433, 940755172 -> 480
    //   476: putfield uuid : Ljava/util/UUID;
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
    //   0	480	0	this	Lbigname/zprestige/webhack/manager/FriendManager$Friend;
    //   0	480	1	username	Ljava/lang/String;
    //   0	480	2	uuid	Ljava/util/UUID;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\FriendManager$Friend.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */