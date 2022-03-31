package bigname.zprestige.webhack.features.modules.Combat;

import Perry1;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.util.math.BlockPos;

public class CrystalAura$Threads extends Thread {
  public CrystalAura this$0;
  
  public CrystalAura$ThreadType type;
  
  public BlockPos bestBlock;
  
  public EntityEnderCrystal bestCrystal;
  
  public CrystalAura$Threads(CrystalAura this$0, CrystalAura$ThreadType type) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w -1457436342
    //   9: l2i
    //   10: ldc 1169464262
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1343855197
    //   19: l2i
    //   20: ldc -1001891290
    //   22: ixor
    //   23: ldc2_w 829540675
    //   26: l2i
    //   27: ldc -1488280222
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, 1426406564 -> 16, 2058272429 -> 484
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 1313130650
    //   66: l2i
    //   67: ldc 667851442
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -491219563
    //   76: l2i
    //   77: ldc -1773209201
    //   79: ixor
    //   80: ldc2_w 738410788
    //   83: l2i
    //   84: ldc -2075846675
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 480, -1043594015 -> 73, -592430381 -> 116
    //   116: aload_1
    //   117: getstatic Perryc.0 : I
    //   120: ifle -> 133
    //   123: ldc2_w 211530477
    //   126: l2i
    //   127: ldc -195672081
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w 1346146330
    //   136: l2i
    //   137: ldc 103482568
    //   139: ixor
    //   140: ldc2_w 1235132542
    //   143: l2i
    //   144: ldc 1114684406
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 494, -215748982 -> 133, 1576636250 -> 176
    //   176: putfield this$0 : Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura;
    //   179: getstatic Perryc.c : I
    //   182: iflt -> 195
    //   185: ldc2_w 481810971
    //   188: l2i
    //   189: ldc 1791971279
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w 1748430201
    //   198: l2i
    //   199: ldc -1424164004
    //   201: ixor
    //   202: ldc2_w -893453101
    //   205: l2i
    //   206: ldc 1544172706
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 236, -778589458 -> 195, -523477595 -> 490
    //   236: aload_0
    //   237: getstatic Perryc.0 : I
    //   240: ifle -> 253
    //   243: ldc2_w -1184815143
    //   246: l2i
    //   247: ldc 197856930
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w 1025375085
    //   256: l2i
    //   257: ldc 2053212520
    //   259: ixor
    //   260: ldc2_w -505602342
    //   263: l2i
    //   264: ldc 1551386051
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 486, -86431460 -> 296, 252670562 -> 253
    //   296: invokespecial <init> : ()V
    //   299: getstatic Perryc.0 : I
    //   302: ifle -> 315
    //   305: ldc2_w -1262986148
    //   308: l2i
    //   309: ldc -1699619806
    //   311: ixor
    //   312: goto -> 322
    //   315: ldc2_w -1886459772
    //   318: l2i
    //   319: ldc -393735935
    //   321: ixor
    //   322: ldc2_w -488214620
    //   325: l2i
    //   326: ldc -1477019580
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 492, 571928165 -> 356, 1796839326 -> 315
    //   356: aload_0
    //   357: getstatic Perryc.c : I
    //   360: iflt -> 373
    //   363: ldc2_w 1398943353
    //   366: l2i
    //   367: ldc 1294478653
    //   369: ixor
    //   370: goto -> 380
    //   373: ldc2_w -1149659510
    //   376: l2i
    //   377: ldc -1550522842
    //   379: ixor
    //   380: ldc2_w 1006905789
    //   383: l2i
    //   384: ldc 367889646
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 416, 548672103 -> 373, 933471767 -> 488
    //   416: aload_2
    //   417: getstatic Perryc.c : I
    //   420: iflt -> 433
    //   423: ldc2_w -1096883019
    //   426: l2i
    //   427: ldc 1592323187
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 324605520
    //   436: l2i
    //   437: ldc 607112929
    //   439: ixor
    //   440: ldc2_w -558979086
    //   443: l2i
    //   444: ldc 1738240095
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, -2113275987 -> 433, 1497620331 -> 482
    //   476: putfield type : Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType;
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
    //   0	480	0	this	Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura$Threads;
    //   0	480	1	this$0	Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura;
    //   0	480	2	type	Lbigname/zprestige/webhack/features/modules/Combat/CrystalAura$ThreadType;
  }
  
  public void run() {
    Perry1.3j(this, (int)-833027489L ^ 0xEDC37C60);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Combat\CrystalAura$Threads.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */