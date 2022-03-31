package bigname.zprestige.webhack.event.events;

import bigname.zprestige.webhack.event.EventStage;

public class KeyEvent2 extends EventStage {
  public boolean info;
  
  public boolean pressed;
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public KeyEvent2(int stage, boolean info, boolean pressed) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -1318452380
    //   9: l2i
    //   10: ldc 1729648986
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1079306704
    //   19: l2i
    //   20: ldc 1476407824
    //   22: ixor
    //   23: ldc2_w 1102198754
    //   26: l2i
    //   27: ldc -317828126
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 548, 1259814944 -> 56, 2060336702 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w -767441952
    //   66: l2i
    //   67: ldc 1267337454
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1456754250
    //   76: l2i
    //   77: ldc -1465138275
    //   79: ixor
    //   80: ldc2_w -1060860599
    //   83: l2i
    //   84: ldc 1939529027
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 554, 714447620 -> 73, 1294065117 -> 116
    //   116: iload_1
    //   117: getstatic Perryc.c : I
    //   120: iflt -> 133
    //   123: ldc2_w 1048358522
    //   126: l2i
    //   127: ldc 1700842910
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w -157729825
    //   136: l2i
    //   137: ldc 263616119
    //   139: ixor
    //   140: ldc2_w -1611016599
    //   143: l2i
    //   144: ldc -351519285
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 546, -1915050486 -> 176, 803833926 -> 133
    //   176: invokespecial <init> : (I)V
    //   179: getstatic Perryc.c : I
    //   182: iflt -> 195
    //   185: ldc2_w -520647794
    //   188: l2i
    //   189: ldc -307531788
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w -1871637561
    //   198: l2i
    //   199: ldc 711754080
    //   201: ixor
    //   202: ldc2_w 829858354
    //   205: l2i
    //   206: ldc 2105684484
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 236, -2045600845 -> 195, 1101558860 -> 550
    //   236: aload_0
    //   237: getstatic Perryc.1 : I
    //   240: ifeq -> 253
    //   243: ldc2_w 210633860
    //   246: l2i
    //   247: ldc 2049523995
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w -1339572338
    //   256: l2i
    //   257: ldc -198493853
    //   259: ixor
    //   260: ldc2_w -1575496654
    //   263: l2i
    //   264: ldc -2022975866
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 540, 1406879531 -> 253, 1634763865 -> 296
    //   296: iload_2
    //   297: getstatic Perryc.0 : I
    //   300: ifle -> 313
    //   303: ldc2_w 101775335
    //   306: l2i
    //   307: ldc -1803940118
    //   309: ixor
    //   310: goto -> 320
    //   313: ldc2_w 195887077
    //   316: l2i
    //   317: ldc -1299888790
    //   319: ixor
    //   320: ldc2_w -2051662020
    //   323: l2i
    //   324: ldc 253070914
    //   326: ixor
    //   327: ixor
    //   328: lookupswitch default -> 552, 415852659 -> 313, 864693233 -> 356
    //   356: putfield info : Z
    //   359: getstatic Perryc.1 : I
    //   362: ifeq -> 375
    //   365: ldc2_w -1648438582
    //   368: l2i
    //   369: ldc 614356728
    //   371: ixor
    //   372: goto -> 382
    //   375: ldc2_w -404911509
    //   378: l2i
    //   379: ldc -624945591
    //   381: ixor
    //   382: ldc2_w 379019675
    //   385: l2i
    //   386: ldc 2079980593
    //   388: ixor
    //   389: ixor
    //   390: lookupswitch default -> 542, -733079144 -> 375, 1349714312 -> 416
    //   416: aload_0
    //   417: getstatic Perryc.c : I
    //   420: iflt -> 433
    //   423: ldc2_w -448235789
    //   426: l2i
    //   427: ldc -1094898401
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 1541424836
    //   436: l2i
    //   437: ldc 322119982
    //   439: ixor
    //   440: ldc2_w 908982497
    //   443: l2i
    //   444: ldc 612840976
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, -207573013 -> 433, 1231000861 -> 544
    //   476: iload_3
    //   477: getstatic Perryc.0 : I
    //   480: ifle -> 493
    //   483: ldc2_w 123035124
    //   486: l2i
    //   487: ldc -98192851
    //   489: ixor
    //   490: goto -> 500
    //   493: ldc2_w 739713087
    //   496: l2i
    //   497: ldc -1253733652
    //   499: ixor
    //   500: ldc2_w -441809673
    //   503: l2i
    //   504: ldc -660662635
    //   506: ixor
    //   507: ixor
    //   508: lookupswitch default -> 536, -1069187653 -> 556, 762291432 -> 493
    //   536: putfield pressed : Z
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
    //   0	540	0	this	Lbigname/zprestige/webhack/event/events/KeyEvent2;
    //   0	540	1	stage	I
    //   0	540	2	info	Z
    //   0	540	3	pressed	Z
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\KeyEvent2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */