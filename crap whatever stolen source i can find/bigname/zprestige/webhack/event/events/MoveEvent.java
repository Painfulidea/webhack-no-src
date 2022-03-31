package bigname.zprestige.webhack.event.events;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.EventStage;
import net.minecraft.entity.MoverType;
import net.minecraftforge.fml.common.eventhandler.Cancelable;

@Cancelable
public class MoveEvent extends EventStage {
  public double z;
  
  public MoverType type;
  
  public double y;
  
  public double x;
  
  public void setType(MoverType type) {
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
  
  public double getZ() {
    return Perry1.2H(this, (int)147166986L ^ 0x6FA7747E);
  }
  
  public void setY(double paramDouble) {
    Perry1.4N(this, (int)1976966144L ^ 0x575F5800, paramDouble);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public double getX() {
    return Perry1.2F(this, (int)1684342823L ^ 0x419690E2);
  }
  
  public void setZ(double paramDouble) {
    Perry1.4L(this, (int)-1548146763L ^ 0xA73B229E, paramDouble);
  }
  
  public MoverType getType() {
    if (Perryc.1 <= 0) {
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
  
  public void setX(double x) {
    if (Perryc.1 <= 0) {
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
  
  public MoveEvent(int stage, MoverType type, double x, double y, double z) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -869036300
    //   9: l2i
    //   10: ldc -769393178
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -810932320
    //   19: l2i
    //   20: ldc 446714088
    //   22: ixor
    //   23: ldc2_w 2120364078
    //   26: l2i
    //   27: ldc 376427351
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1785880777 -> 16, 1981649003 -> 924
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w -1774041799
    //   66: l2i
    //   67: ldc -1527078803
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -2066287796
    //   76: l2i
    //   77: ldc 1403861802
    //   79: ixor
    //   80: ldc2_w -1615117720
    //   83: l2i
    //   84: ldc 70232757
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1456730743 -> 916, 154145268 -> 73
    //   116: iload_1
    //   117: getstatic Perryc.c : I
    //   120: iflt -> 133
    //   123: ldc2_w 542785276
    //   126: l2i
    //   127: ldc 1897867509
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w -1497278318
    //   136: l2i
    //   137: ldc -454043798
    //   139: ixor
    //   140: ldc2_w -1837920654
    //   143: l2i
    //   144: ldc -204619301
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 920, 596688977 -> 176, 821778848 -> 133
    //   176: invokespecial <init> : (I)V
    //   179: getstatic Perryc.c : I
    //   182: iflt -> 195
    //   185: ldc2_w -1021875487
    //   188: l2i
    //   189: ldc -1527369917
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w 1761162553
    //   198: l2i
    //   199: ldc -5712343
    //   201: ixor
    //   202: ldc2_w -144687025
    //   205: l2i
    //   206: ldc 1052956348
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 236, -1492403038 -> 195, -1371286703 -> 914
    //   236: aload_0
    //   237: getstatic Perryc.0 : I
    //   240: ifle -> 253
    //   243: ldc2_w -2011946356
    //   246: l2i
    //   247: ldc -2006264473
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w -751048263
    //   256: l2i
    //   257: ldc 1515806956
    //   259: ixor
    //   260: ldc2_w 1825991016
    //   263: l2i
    //   264: ldc -1607699687
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 926, -863703654 -> 253, 1167627044 -> 296
    //   296: aload_2
    //   297: getstatic Perryc.0 : I
    //   300: ifle -> 313
    //   303: ldc2_w 261257266
    //   306: l2i
    //   307: ldc -115467381
    //   309: ixor
    //   310: goto -> 320
    //   313: ldc2_w -1631550572
    //   316: l2i
    //   317: ldc 722873729
    //   319: ixor
    //   320: ldc2_w -877174412
    //   323: l2i
    //   324: ldc -492899160
    //   326: ixor
    //   327: ixor
    //   328: lookupswitch default -> 356, -542771611 -> 934, 109895755 -> 313
    //   356: putfield type : Lnet/minecraft/entity/MoverType;
    //   359: getstatic Perryc.0 : I
    //   362: ifle -> 375
    //   365: ldc2_w -857185913
    //   368: l2i
    //   369: ldc -181725418
    //   371: ixor
    //   372: goto -> 382
    //   375: ldc2_w 1944943134
    //   378: l2i
    //   379: ldc -494742243
    //   381: ixor
    //   382: ldc2_w -1562319802
    //   385: l2i
    //   386: ldc -1923681780
    //   388: ixor
    //   389: ixor
    //   390: lookupswitch default -> 928, -1093027511 -> 416, 376791259 -> 375
    //   416: aload_0
    //   417: getstatic Perryc.c : I
    //   420: iflt -> 433
    //   423: ldc2_w -1690778726
    //   426: l2i
    //   427: ldc -1950688099
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 1189810754
    //   436: l2i
    //   437: ldc 455193167
    //   439: ixor
    //   440: ldc2_w -1861845397
    //   443: l2i
    //   444: ldc -1586838921
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, 412585918 -> 433, 552510235 -> 930
    //   476: dload_3
    //   477: getstatic Perryc.c : I
    //   480: iflt -> 493
    //   483: ldc2_w -2099642609
    //   486: l2i
    //   487: ldc 1629083950
    //   489: ixor
    //   490: goto -> 500
    //   493: ldc2_w -222777588
    //   496: l2i
    //   497: ldc -327051567
    //   499: ixor
    //   500: ldc2_w -291248287
    //   503: l2i
    //   504: ldc -1838486362
    //   506: ixor
    //   507: ixor
    //   508: lookupswitch default -> 536, -1635619021 -> 493, -1626788378 -> 932
    //   536: putfield x : D
    //   539: getstatic Perryc.0 : I
    //   542: ifle -> 555
    //   545: ldc2_w 1428292657
    //   548: l2i
    //   549: ldc -1505082359
    //   551: ixor
    //   552: goto -> 562
    //   555: ldc2_w -1799196904
    //   558: l2i
    //   559: ldc -1781298055
    //   561: ixor
    //   562: ldc2_w -1583231088
    //   565: l2i
    //   566: ldc -2026383594
    //   568: ixor
    //   569: ixor
    //   570: lookupswitch default -> 596, -2076759247 -> 555, -704751426 -> 938
    //   596: aload_0
    //   597: getstatic Perryc.0 : I
    //   600: ifle -> 613
    //   603: ldc2_w -1163101862
    //   606: l2i
    //   607: ldc 54584725
    //   609: ixor
    //   610: goto -> 620
    //   613: ldc2_w -1706623911
    //   616: l2i
    //   617: ldc 628934610
    //   619: ixor
    //   620: ldc2_w -55584115
    //   623: l2i
    //   624: ldc -1688699326
    //   626: ixor
    //   627: ixor
    //   628: lookupswitch default -> 912, -657612988 -> 656, -568641536 -> 613
    //   656: dload #5
    //   658: getstatic Perryc.c : I
    //   661: iflt -> 675
    //   664: ldc2_w 618494386
    //   667: l2i
    //   668: ldc_w 436816041
    //   671: ixor
    //   672: goto -> 683
    //   675: ldc2_w 1696326864
    //   678: l2i
    //   679: ldc_w 309065265
    //   682: ixor
    //   683: ldc2_w 1373083980
    //   686: l2i
    //   687: ldc_w 1985182919
    //   690: ixor
    //   691: ixor
    //   692: lookupswitch default -> 720, 424727696 -> 922, 1003000061 -> 675
    //   720: putfield y : D
    //   723: getstatic Perryc.c : I
    //   726: iflt -> 740
    //   729: ldc2_w 97710189
    //   732: l2i
    //   733: ldc_w 1568953214
    //   736: ixor
    //   737: goto -> 748
    //   740: ldc2_w -1030747030
    //   743: l2i
    //   744: ldc_w 1792087512
    //   747: ixor
    //   748: ldc2_w -1883322663
    //   751: l2i
    //   752: ldc_w -1893872214
    //   755: ixor
    //   756: ixor
    //   757: lookupswitch default -> 918, -1461579071 -> 784, 1492494432 -> 740
    //   784: aload_0
    //   785: getstatic Perryc.1 : I
    //   788: ifeq -> 802
    //   791: ldc2_w 92774283
    //   794: l2i
    //   795: ldc_w 1064723048
    //   798: ixor
    //   799: goto -> 810
    //   802: ldc2_w -325272746
    //   805: l2i
    //   806: ldc_w -1656231219
    //   809: ixor
    //   810: ldc2_w -1091535887
    //   813: l2i
    //   814: ldc_w 432131071
    //   817: ixor
    //   818: ixor
    //   819: lookupswitch default -> 844, -1965910170 -> 802, -1648341523 -> 936
    //   844: dload #7
    //   846: getstatic Perryc.c : I
    //   849: iflt -> 863
    //   852: ldc2_w -1430040391
    //   855: l2i
    //   856: ldc_w -989905850
    //   859: ixor
    //   860: goto -> 871
    //   863: ldc2_w 1317376324
    //   866: l2i
    //   867: ldc_w 1691875757
    //   870: ixor
    //   871: ldc2_w -120956905
    //   874: l2i
    //   875: ldc_w -1824851167
    //   878: ixor
    //   879: ixor
    //   880: lookupswitch default -> 940, 97308617 -> 863, 1101188063 -> 908
    //   908: putfield z : D
    //   911: return
    //   912: aconst_null
    //   913: athrow
    //   914: aconst_null
    //   915: athrow
    //   916: aconst_null
    //   917: athrow
    //   918: aconst_null
    //   919: athrow
    //   920: aconst_null
    //   921: athrow
    //   922: aconst_null
    //   923: athrow
    //   924: aconst_null
    //   925: athrow
    //   926: aconst_null
    //   927: athrow
    //   928: aconst_null
    //   929: athrow
    //   930: aconst_null
    //   931: athrow
    //   932: aconst_null
    //   933: athrow
    //   934: aconst_null
    //   935: athrow
    //   936: aconst_null
    //   937: athrow
    //   938: aconst_null
    //   939: athrow
    //   940: aconst_null
    //   941: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	912	0	this	Lbigname/zprestige/webhack/event/events/MoveEvent;
    //   0	912	1	stage	I
    //   0	912	2	type	Lnet/minecraft/entity/MoverType;
    //   0	912	3	x	D
    //   0	912	5	y	D
    //   0	912	7	z	D
  }
  
  public double getY() {
    return Perry1.2A(this, (int)540929279L ^ 0x8D14B93);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\MoveEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */