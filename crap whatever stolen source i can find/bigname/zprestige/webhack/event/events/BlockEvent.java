package bigname.zprestige.webhack.event.events;

import bigname.zprestige.webhack.event.EventStage;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.eventhandler.Cancelable;

@Cancelable
public class BlockEvent extends EventStage {
  public EnumFacing facing;
  
  public BlockPos pos;
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public BlockEvent(int stage, BlockPos pos, EnumFacing facing) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 570580070
    //   9: l2i
    //   10: ldc -1542703597
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -671591771
    //   19: l2i
    //   20: ldc -1372287970
    //   22: ixor
    //   23: ldc2_w -553002141
    //   26: l2i
    //   27: ldc -1912270818
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1995692945 -> 16, -687693560 -> 546
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w -1517180808
    //   66: l2i
    //   67: ldc 1688986110
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -1978483337
    //   76: l2i
    //   77: ldc -71409791
    //   79: ixor
    //   80: ldc2_w -1447706115
    //   83: l2i
    //   84: ldc 2113542135
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -2058686477 -> 73, 360030092 -> 552
    //   116: iload_1
    //   117: getstatic Perryc.1 : I
    //   120: ifeq -> 133
    //   123: ldc2_w 1517802060
    //   126: l2i
    //   127: ldc 23638321
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w -950345036
    //   136: l2i
    //   137: ldc 2091384743
    //   139: ixor
    //   140: ldc2_w -1872499460
    //   143: l2i
    //   144: ldc 1558443721
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 176, -1751156408 -> 556, 1057607337 -> 133
    //   176: invokespecial <init> : (I)V
    //   179: getstatic Perryc.c : I
    //   182: iflt -> 195
    //   185: ldc2_w -827277718
    //   188: l2i
    //   189: ldc 2099649375
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w -1216558002
    //   198: l2i
    //   199: ldc -891140983
    //   201: ixor
    //   202: ldc2_w -550066109
    //   205: l2i
    //   206: ldc -353689319
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 236, -2041893777 -> 540, 1906936879 -> 195
    //   236: aload_0
    //   237: getstatic Perryc.0 : I
    //   240: ifle -> 253
    //   243: ldc2_w -1532057407
    //   246: l2i
    //   247: ldc 1468793440
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w 1282187157
    //   256: l2i
    //   257: ldc -2102908207
    //   259: ixor
    //   260: ldc2_w 4622605
    //   263: l2i
    //   264: ldc 2108194817
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 542, -1899191379 -> 253, -1289044920 -> 296
    //   296: aload_2
    //   297: getstatic Perryc.c : I
    //   300: iflt -> 313
    //   303: ldc2_w -530033576
    //   306: l2i
    //   307: ldc 1099872795
    //   309: ixor
    //   310: goto -> 320
    //   313: ldc2_w -452341156
    //   316: l2i
    //   317: ldc 1671557404
    //   319: ixor
    //   320: ldc2_w 2051255829
    //   323: l2i
    //   324: ldc -1731020754
    //   326: ixor
    //   327: ixor
    //   328: lookupswitch default -> 356, -2101575275 -> 313, 1131935864 -> 548
    //   356: putfield pos : Lnet/minecraft/util/math/BlockPos;
    //   359: getstatic Perryc.1 : I
    //   362: ifeq -> 375
    //   365: ldc2_w 1595311906
    //   368: l2i
    //   369: ldc 744672828
    //   371: ixor
    //   372: goto -> 382
    //   375: ldc2_w 1824694790
    //   378: l2i
    //   379: ldc -1690702954
    //   381: ixor
    //   382: ldc2_w 1225457601
    //   385: l2i
    //   386: ldc 1850372168
    //   388: ixor
    //   389: ixor
    //   390: lookupswitch default -> 416, 297645933 -> 375, 1412744855 -> 550
    //   416: aload_0
    //   417: getstatic Perryc.0 : I
    //   420: ifle -> 433
    //   423: ldc2_w 1932920170
    //   426: l2i
    //   427: ldc 245800335
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 1125040539
    //   436: l2i
    //   437: ldc 1680087672
    //   439: ixor
    //   440: ldc2_w 2128570037
    //   443: l2i
    //   444: ldc -199555857
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 544, -1376863815 -> 476, -145425729 -> 433
    //   476: aload_3
    //   477: getstatic Perryc.0 : I
    //   480: ifle -> 493
    //   483: ldc2_w -868472494
    //   486: l2i
    //   487: ldc 1616329915
    //   489: ixor
    //   490: goto -> 500
    //   493: ldc2_w 175610731
    //   496: l2i
    //   497: ldc -315931047
    //   499: ixor
    //   500: ldc2_w -1740669213
    //   503: l2i
    //   504: ldc 1048188490
    //   506: ixor
    //   507: ixor
    //   508: lookupswitch default -> 554, 170818880 -> 493, 1092203931 -> 536
    //   536: putfield facing : Lnet/minecraft/util/EnumFacing;
    //   539: return
    //   540: aconst_null
    //   541: athrow
    //   542: aconst_null
    //   543: athrow
    //   544: aconst_null
    //   545: athrow
    //   546: aconst_null
    //   547: athrow
    //   548: aconst_null
    //   549: athrow
    //   550: aconst_null
    //   551: athrow
    //   552: aconst_null
    //   553: athrow
    //   554: aconst_null
    //   555: athrow
    //   556: aconst_null
    //   557: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	540	0	this	Lbigname/zprestige/webhack/event/events/BlockEvent;
    //   0	540	1	stage	I
    //   0	540	2	pos	Lnet/minecraft/util/math/BlockPos;
    //   0	540	3	facing	Lnet/minecraft/util/EnumFacing;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\BlockEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */