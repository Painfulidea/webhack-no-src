package bigname.zprestige.webhack.features.modules.Movement;

import Perry1;
import bigname.zprestige.webhack.event.events.MoveEvent;
import bigname.zprestige.webhack.features.modules.Module;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Sprint extends Module {
  public static Sprint INSTANCE;
  
  public void onUpdate() {
    Perry1.3o(this, (int)-213621422L ^ 0xF9CD060C);
  }
  
  @SubscribeEvent
  public void onSprint(MoveEvent paramMoveEvent) {
    Perry1.W(this, (int)1523978407L ^ 0x3364A8A4, paramMoveEvent);
  }
  
  public void onDisable() {
    Perry1.3g(this, (int)-1511734238L ^ 0xBBF172A8);
  }
  
  static {
    // Byte code:
    //   0: new bigname/zprestige/webhack/features/modules/Movement/Sprint
    //   3: dup
    //   4: getstatic Perryc.c : I
    //   7: iflt -> 20
    //   10: ldc2_w 466610704
    //   13: l2i
    //   14: ldc 1128071468
    //   16: ixor
    //   17: goto -> 27
    //   20: ldc2_w -2070660838
    //   23: l2i
    //   24: ldc 1416647653
    //   26: ixor
    //   27: ldc2_w -301783476
    //   30: l2i
    //   31: ldc -809293984
    //   33: ixor
    //   34: ixor
    //   35: lookupswitch default -> 60, -1638784491 -> 20, 2033379856 -> 124
    //   60: invokespecial <init> : ()V
    //   63: getstatic Perryc.0 : I
    //   66: ifle -> 79
    //   69: ldc2_w 1014830937
    //   72: l2i
    //   73: ldc 1328652332
    //   75: ixor
    //   76: goto -> 86
    //   79: ldc2_w -2085720947
    //   82: l2i
    //   83: ldc 397337929
    //   85: ixor
    //   86: ldc2_w -321046080
    //   89: l2i
    //   90: ldc 1626467389
    //   92: ixor
    //   93: ixor
    //   94: lookupswitch default -> 120, -1100608634 -> 79, -10460536 -> 126
    //   120: putstatic bigname/zprestige/webhack/features/modules/Movement/Sprint.INSTANCE : Lbigname/zprestige/webhack/features/modules/Movement/Sprint;
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
  }
  
  public String getDisplayInfo() {
    return Perry1.a(this, (int)1791031087L ^ 0xA674CCC);
  }
  
  public static Sprint getInstance() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 357
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 349
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 341
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 40
    //   30: ldc2_w -2073653816
    //   33: l2i
    //   34: ldc -1096062663
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 130297561
    //   43: l2i
    //   44: ldc -2128892296
    //   46: ixor
    //   47: ldc2_w 1114623464
    //   50: l2i
    //   51: ldc 1843975926
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 326, -1453810753 -> 80, 357236719 -> 40
    //   80: getstatic bigname/zprestige/webhack/features/modules/Movement/Sprint.INSTANCE : Lbigname/zprestige/webhack/features/modules/Movement/Sprint;
    //   83: ifnonnull -> 96
    //   86: ldc2_w -1329946323
    //   89: l2i
    //   90: ldc -420572591
    //   92: ixor
    //   93: goto -> 103
    //   96: ldc2_w -1175217627
    //   99: l2i
    //   100: ldc -274224808
    //   102: ixor
    //   103: ldc2_w 89049003
    //   106: l2i
    //   107: ldc -347374373
    //   109: ixor
    //   110: ixor
    //   111: tableswitch default -> 86, -1202616308 -> 132, -1202616307 -> 263
    //   132: new bigname/zprestige/webhack/features/modules/Movement/Sprint
    //   135: dup
    //   136: getstatic Perryc.0 : I
    //   139: ifle -> 152
    //   142: ldc2_w -1509344261
    //   145: l2i
    //   146: ldc 1509567778
    //   148: ixor
    //   149: goto -> 159
    //   152: ldc2_w -1418986899
    //   155: l2i
    //   156: ldc 541541627
    //   158: ixor
    //   159: ldc2_w -1858529490
    //   162: l2i
    //   163: ldc 1718176005
    //   165: ixor
    //   166: ixor
    //   167: lookupswitch default -> 324, 144918770 -> 152, 2088558781 -> 192
    //   192: goto -> 196
    //   195: athrow
    //   196: invokespecial <init> : ()V
    //   199: goto -> 203
    //   202: athrow
    //   203: getstatic Perryc.0 : I
    //   206: ifle -> 219
    //   209: ldc2_w -1858352187
    //   212: l2i
    //   213: ldc -1712187846
    //   215: ixor
    //   216: goto -> 226
    //   219: ldc2_w -1823898207
    //   222: l2i
    //   223: ldc 808124763
    //   225: ixor
    //   226: ldc2_w 384248295
    //   229: l2i
    //   230: ldc -1200504693
    //   232: ixor
    //   233: ixor
    //   234: lookupswitch default -> 330, -1503710061 -> 219, 234122646 -> 260
    //   260: putstatic bigname/zprestige/webhack/features/modules/Movement/Sprint.INSTANCE : Lbigname/zprestige/webhack/features/modules/Movement/Sprint;
    //   263: getstatic Perryc.c : I
    //   266: iflt -> 279
    //   269: ldc2_w 1864788485
    //   272: l2i
    //   273: ldc -977152094
    //   275: ixor
    //   276: goto -> 286
    //   279: ldc2_w -576186280
    //   282: l2i
    //   283: ldc 1046249955
    //   285: ixor
    //   286: ldc2_w 1944753873
    //   289: l2i
    //   290: ldc -63489412
    //   292: ixor
    //   293: ixor
    //   294: lookupswitch default -> 320, -1585488520 -> 279, 624562442 -> 328
    //   320: getstatic bigname/zprestige/webhack/features/modules/Movement/Sprint.INSTANCE : Lbigname/zprestige/webhack/features/modules/Movement/Sprint;
    //   323: areturn
    //   324: aconst_null
    //   325: athrow
    //   326: aconst_null
    //   327: athrow
    //   328: aconst_null
    //   329: athrow
    //   330: aconst_null
    //   331: athrow
    //   332: pop
    //   333: goto -> 24
    //   336: pop
    //   337: aconst_null
    //   338: goto -> 332
    //   341: dup
    //   342: ifnull -> 332
    //   345: checkcast java/lang/Throwable
    //   348: athrow
    //   349: dup
    //   350: ifnull -> 336
    //   353: checkcast java/lang/Throwable
    //   356: athrow
    //   357: aconst_null
    //   358: athrow
    // Exception table:
    //   from	to	target	type
    //   8	20	341	java/lang/ArithmeticException
    //   196	202	202	finally
    //   196	202	3	finally
    //   196	202	202	finally
    //   196	202	202	finally
    //   196	202	3	finally
    //   341	349	341	java/lang/ArrayIndexOutOfBoundsException
    //   357	359	3	finally
  }
  
  public void setInstance() {
    Perry1.4g(this, (int)-167961927L ^ 0xC7F9C57B);
  }
  
  public Sprint() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -42614981
    //   9: l2i
    //   10: ldc -348213682
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1629307074
    //   19: l2i
    //   20: ldc -928636317
    //   22: ixor
    //   23: ldc2_w -918997699
    //   26: l2i
    //   27: ldc 1893390121
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1347882143 -> 446, 148129518 -> 16
    //   56: aload_0
    //   57: ldc '죣㌃좰㶾癙♸'
    //   59: getstatic Perryc.0 : I
    //   62: ifle -> 75
    //   65: ldc2_w -801596574
    //   68: l2i
    //   69: ldc -937454971
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -419090853
    //   78: l2i
    //   79: ldc 1440183693
    //   81: ixor
    //   82: ldc2_w -1028215931
    //   85: l2i
    //   86: ldc 872599844
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 452, -292326586 -> 75, 1147543927 -> 116
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '죽㌜좦㶾癑♥๼땶踣⪺瀛ਵԙ煯깋喼辑Ⴢ'
    //   121: getstatic Perryc.1 : I
    //   124: ifeq -> 137
    //   127: ldc2_w 1260838220
    //   130: l2i
    //   131: ldc -940832664
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w -901607718
    //   140: l2i
    //   141: ldc -712497019
    //   143: ixor
    //   144: ldc2_w -244651802
    //   147: l2i
    //   148: ldc 394997180
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 456, -114597115 -> 180, 1781207166 -> 137
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.c : I
    //   186: iflt -> 199
    //   189: ldc2_w 730511037
    //   192: l2i
    //   193: ldc 77466854
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w -1473808604
    //   202: l2i
    //   203: ldc 2123988078
    //   205: ixor
    //   206: ldc2_w -1529433563
    //   209: l2i
    //   210: ldc -2015846015
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 240, -1887871920 -> 199, 203074047 -> 454
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.MOVEMENT : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w -1887883862
    //   246: l2i
    //   247: ldc -1887883862
    //   249: ixor
    //   250: ldc2_w -182404033
    //   253: l2i
    //   254: ldc -182404033
    //   256: ixor
    //   257: ldc2_w 984758393
    //   260: l2i
    //   261: ldc 984758393
    //   263: ixor
    //   264: getstatic Perryc.1 : I
    //   267: ifeq -> 280
    //   270: ldc2_w 252324226
    //   273: l2i
    //   274: ldc -1271372346
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w -935420018
    //   283: l2i
    //   284: ldc -1634842354
    //   286: ixor
    //   287: ldc2_w 1782011366
    //   290: l2i
    //   291: ldc 657877692
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 320, -1591441415 -> 280, -164400354 -> 444
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.1 : I
    //   326: ifeq -> 339
    //   329: ldc2_w 953037908
    //   332: l2i
    //   333: ldc 2072488927
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w 1069343711
    //   342: l2i
    //   343: ldc 1321687755
    //   345: ixor
    //   346: ldc2_w 1267578044
    //   349: l2i
    //   350: ldc -1448230432
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 448, -1822700472 -> 380, -1586894121 -> 339
    //   380: aload_0
    //   381: getstatic Perryc.1 : I
    //   384: ifeq -> 397
    //   387: ldc2_w -902190648
    //   390: l2i
    //   391: ldc -1614762429
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w -344164356
    //   400: l2i
    //   401: ldc -1233655528
    //   403: ixor
    //   404: ldc2_w 439540117
    //   407: l2i
    //   408: ldc -1494594776
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 440, -383675082 -> 450, 2137484638 -> 397
    //   440: invokespecial setInstance : ()V
    //   443: return
    //   444: aconst_null
    //   445: athrow
    //   446: aconst_null
    //   447: athrow
    //   448: aconst_null
    //   449: athrow
    //   450: aconst_null
    //   451: athrow
    //   452: aconst_null
    //   453: athrow
    //   454: aconst_null
    //   455: athrow
    //   456: aconst_null
    //   457: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	444	0	this	Lbigname/zprestige/webhack/features/modules/Movement/Sprint;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Movement\Sprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */