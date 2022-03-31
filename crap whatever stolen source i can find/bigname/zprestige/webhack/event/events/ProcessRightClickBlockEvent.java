package bigname.zprestige.webhack.event.events;

import bigname.zprestige.webhack.event.EventStage;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.eventhandler.Cancelable;

@Cancelable
public class ProcessRightClickBlockEvent extends EventStage {
  public BlockPos pos;
  
  public ItemStack stack;
  
  public EnumHand hand;
  
  public ProcessRightClickBlockEvent(BlockPos pos, EnumHand hand, ItemStack stack) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 326168464
    //   9: l2i
    //   10: ldc -1562954438
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 300150535
    //   19: l2i
    //   20: ldc -613070082
    //   22: ixor
    //   23: ldc2_w 494138930
    //   26: l2i
    //   27: ldc -1329678249
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 660, 476746959 -> 16, 1734077340 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 2021727576
    //   66: l2i
    //   67: ldc -1718565978
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1290933776
    //   76: l2i
    //   77: ldc 315669717
    //   79: ixor
    //   80: ldc2_w 108708688
    //   83: l2i
    //   84: ldc -297361840
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 670, -1239484475 -> 116, 153977854 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.0 : I
    //   122: ifle -> 135
    //   125: ldc2_w 1247810451
    //   128: l2i
    //   129: ldc -1115960377
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w 1785107388
    //   138: l2i
    //   139: ldc 286912008
    //   141: ixor
    //   142: ldc2_w -983025461
    //   145: l2i
    //   146: ldc -534933143
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, -1973058093 -> 135, -764513802 -> 676
    //   176: aload_0
    //   177: getstatic Perryc.c : I
    //   180: iflt -> 193
    //   183: ldc2_w -462833772
    //   186: l2i
    //   187: ldc 1749199259
    //   189: ixor
    //   190: goto -> 200
    //   193: ldc2_w -1784382712
    //   196: l2i
    //   197: ldc 352559885
    //   199: ixor
    //   200: ldc2_w 567738558
    //   203: l2i
    //   204: ldc -475276769
    //   206: ixor
    //   207: ixor
    //   208: lookupswitch default -> 236, -486791592 -> 193, 1314374830 -> 662
    //   236: aload_1
    //   237: getstatic Perryc.0 : I
    //   240: ifle -> 253
    //   243: ldc2_w -1022848805
    //   246: l2i
    //   247: ldc -774171144
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w 1949116865
    //   256: l2i
    //   257: ldc -1716574642
    //   259: ixor
    //   260: ldc2_w 1508307094
    //   263: l2i
    //   264: ldc 1291644608
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 296, 130653045 -> 668, 1673582530 -> 253
    //   296: putfield pos : Lnet/minecraft/util/math/BlockPos;
    //   299: getstatic Perryc.0 : I
    //   302: ifle -> 315
    //   305: ldc2_w -432887541
    //   308: l2i
    //   309: ldc -1321388843
    //   311: ixor
    //   312: goto -> 322
    //   315: ldc2_w 1332523983
    //   318: l2i
    //   319: ldc 249271834
    //   321: ixor
    //   322: ldc2_w -1099972183
    //   325: l2i
    //   326: ldc 1383596123
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 356, -1156031444 -> 674, -753435883 -> 315
    //   356: aload_0
    //   357: getstatic Perryc.1 : I
    //   360: ifeq -> 373
    //   363: ldc2_w 471460144
    //   366: l2i
    //   367: ldc 1402913010
    //   369: ixor
    //   370: goto -> 380
    //   373: ldc2_w 524807117
    //   376: l2i
    //   377: ldc 594685313
    //   379: ixor
    //   380: ldc2_w 1117436008
    //   383: l2i
    //   384: ldc -970470677
    //   386: ixor
    //   387: ixor
    //   388: lookupswitch default -> 678, -1199000369 -> 416, -885367999 -> 373
    //   416: aload_2
    //   417: getstatic Perryc.1 : I
    //   420: ifeq -> 433
    //   423: ldc2_w -139888139
    //   426: l2i
    //   427: ldc -1863081726
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 347100904
    //   436: l2i
    //   437: ldc 980015894
    //   439: ixor
    //   440: ldc2_w -503948061
    //   443: l2i
    //   444: ldc 1709039076
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, -479110672 -> 672, -75413088 -> 433
    //   476: putfield hand : Lnet/minecraft/util/EnumHand;
    //   479: getstatic Perryc.1 : I
    //   482: ifeq -> 495
    //   485: ldc2_w 563127357
    //   488: l2i
    //   489: ldc -1069059255
    //   491: ixor
    //   492: goto -> 502
    //   495: ldc2_w -516027832
    //   498: l2i
    //   499: ldc 1140771376
    //   501: ixor
    //   502: ldc2_w 945562565
    //   505: l2i
    //   506: ldc 184087098
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 536, -747436405 -> 664, 1936494882 -> 495
    //   536: aload_0
    //   537: getstatic Perryc.c : I
    //   540: iflt -> 553
    //   543: ldc2_w -221966902
    //   546: l2i
    //   547: ldc -1970276236
    //   549: ixor
    //   550: goto -> 560
    //   553: ldc2_w 1184613953
    //   556: l2i
    //   557: ldc -1224336322
    //   559: ixor
    //   560: ldc2_w -481892194
    //   563: l2i
    //   564: ldc -76591969
    //   566: ixor
    //   567: ixor
    //   568: lookupswitch default -> 596, -95320343 -> 553, 1617121727 -> 666
    //   596: aload_3
    //   597: getstatic Perryc.c : I
    //   600: iflt -> 613
    //   603: ldc2_w 1855306410
    //   606: l2i
    //   607: ldc 878199266
    //   609: ixor
    //   610: goto -> 620
    //   613: ldc2_w 1387639218
    //   616: l2i
    //   617: ldc 148422778
    //   619: ixor
    //   620: ldc2_w -1619157326
    //   623: l2i
    //   624: ldc -266359878
    //   626: ixor
    //   627: ixor
    //   628: lookupswitch default -> 680, 890193088 -> 656, 900714048 -> 613
    //   656: putfield stack : Lnet/minecraft/item/ItemStack;
    //   659: return
    //   660: aconst_null
    //   661: athrow
    //   662: aconst_null
    //   663: athrow
    //   664: aconst_null
    //   665: athrow
    //   666: aconst_null
    //   667: athrow
    //   668: aconst_null
    //   669: athrow
    //   670: aconst_null
    //   671: athrow
    //   672: aconst_null
    //   673: athrow
    //   674: aconst_null
    //   675: athrow
    //   676: aconst_null
    //   677: athrow
    //   678: aconst_null
    //   679: athrow
    //   680: aconst_null
    //   681: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	660	0	this	Lbigname/zprestige/webhack/event/events/ProcessRightClickBlockEvent;
    //   0	660	1	pos	Lnet/minecraft/util/math/BlockPos;
    //   0	660	2	hand	Lnet/minecraft/util/EnumHand;
    //   0	660	3	stack	Lnet/minecraft/item/ItemStack;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\ProcessRightClickBlockEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */