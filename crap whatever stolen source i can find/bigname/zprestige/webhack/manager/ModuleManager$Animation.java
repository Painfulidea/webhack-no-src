package bigname.zprestige.webhack.manager;

import Perry1;
import bigname.zprestige.webhack.features.modules.Module;
import java.util.concurrent.ScheduledExecutorService;

public class ModuleManager$Animation extends Thread {
  public ModuleManager this$0;
  
  public float offset;
  
  public Module module;
  
  public float vOffset;
  
  public ScheduledExecutorService service;
  
  public ModuleManager$Animation(ModuleManager paramModuleManager) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -501571695
    //   9: l2i
    //   10: ldc -651388471
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 224329321
    //   19: l2i
    //   20: ldc -1199395380
    //   22: ixor
    //   23: ldc2_w 1355958709
    //   26: l2i
    //   27: ldc -1093703249
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -718592446 -> 550, 1352393003 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w -1027939344
    //   66: l2i
    //   67: ldc -2106840452
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 488412829
    //   76: l2i
    //   77: ldc -1111486756
    //   79: ixor
    //   80: ldc2_w -1437991308
    //   83: l2i
    //   84: ldc -143082796
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -822743071 -> 73, 501714220 -> 544
    //   116: aload_1
    //   117: getstatic Perryc.0 : I
    //   120: ifle -> 133
    //   123: ldc2_w -756972907
    //   126: l2i
    //   127: ldc -1377400144
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w 910268388
    //   136: l2i
    //   137: ldc -1903644647
    //   139: ixor
    //   140: ldc2_w -1123419183
    //   143: l2i
    //   144: ldc 1841467624
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 546, -1345559780 -> 133, 1744981188 -> 176
    //   176: putfield this$0 : Lbigname/zprestige/webhack/manager/ModuleManager;
    //   179: getstatic Perryc.c : I
    //   182: iflt -> 195
    //   185: ldc2_w 1955661086
    //   188: l2i
    //   189: ldc 2064296337
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w 932581661
    //   198: l2i
    //   199: ldc -178161617
    //   201: ixor
    //   202: ldc2_w -1868395109
    //   205: l2i
    //   206: ldc 1090559677
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 552, -566640727 -> 195, 324368916 -> 236
    //   236: aload_0
    //   237: ldc '㌝㶺嫳ϝ๰郗蹭'
    //   239: getstatic Perryc.1 : I
    //   242: ifeq -> 255
    //   245: ldc2_w 2109418685
    //   248: l2i
    //   249: ldc -1332592971
    //   251: ixor
    //   252: goto -> 262
    //   255: ldc2_w -447409769
    //   258: l2i
    //   259: ldc 1619857193
    //   261: ixor
    //   262: ldc2_w 1950150251
    //   265: l2i
    //   266: ldc -921308279
    //   268: ixor
    //   269: ixor
    //   270: lookupswitch default -> 548, 955319132 -> 296, 1879052266 -> 255
    //   296: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   299: getstatic Perryc.1 : I
    //   302: ifeq -> 315
    //   305: ldc2_w -2090825328
    //   308: l2i
    //   309: ldc -438308218
    //   311: ixor
    //   312: goto -> 322
    //   315: ldc2_w 316533946
    //   318: l2i
    //   319: ldc -265426566
    //   321: ixor
    //   322: ldc2_w 291662471
    //   325: l2i
    //   326: ldc 676753027
    //   328: ixor
    //   329: ixor
    //   330: lookupswitch default -> 540, -607911484 -> 356, 1602977554 -> 315
    //   356: invokespecial <init> : (Ljava/lang/String;)V
    //   359: getstatic Perryc.0 : I
    //   362: ifle -> 375
    //   365: ldc2_w 1406687837
    //   368: l2i
    //   369: ldc -1952259639
    //   371: ixor
    //   372: goto -> 382
    //   375: ldc2_w -655690552
    //   378: l2i
    //   379: ldc 685104217
    //   381: ixor
    //   382: ldc2_w 1043190547
    //   385: l2i
    //   386: ldc 2030504358
    //   388: ixor
    //   389: ixor
    //   390: lookupswitch default -> 554, -1622122207 -> 375, -1223298524 -> 416
    //   416: aload_0
    //   417: getstatic Perryc.1 : I
    //   420: ifeq -> 433
    //   423: ldc2_w -823741733
    //   426: l2i
    //   427: ldc -538072446
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 1018775380
    //   436: l2i
    //   437: ldc 479061507
    //   439: ixor
    //   440: ldc2_w 1228397680
    //   443: l2i
    //   444: ldc 127457364
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 542, 1604590717 -> 433, 1855694195 -> 476
    //   476: invokestatic newSingleThreadScheduledExecutor : ()Ljava/util/concurrent/ScheduledExecutorService;
    //   479: getstatic Perryc.0 : I
    //   482: ifle -> 495
    //   485: ldc2_w 1059907234
    //   488: l2i
    //   489: ldc 810569975
    //   491: ixor
    //   492: goto -> 502
    //   495: ldc2_w 1916833320
    //   498: l2i
    //   499: ldc -859940518
    //   501: ixor
    //   502: ldc2_w 2135614647
    //   505: l2i
    //   506: ldc -1262710436
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 536, -997538882 -> 556, 1985598111 -> 495
    //   536: putfield service : Ljava/util/concurrent/ScheduledExecutorService;
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
    //   0	540	0	this	Lbigname/zprestige/webhack/manager/ModuleManager$Animation;
  }
  
  public void start() {
    Perry1.3N(this, (int)1568968002L ^ 0x56D521D2);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\ModuleManager$Animation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */