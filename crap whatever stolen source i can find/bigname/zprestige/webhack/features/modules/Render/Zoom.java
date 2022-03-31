package bigname.zprestige.webhack.features.modules.Render;

import Perry1;
import bigname.zprestige.webhack.features.modules.Module;

public class Zoom extends Module {
  public float fov;
  
  public int fovslidergetterez;
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public Zoom() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 964010000
    //   9: l2i
    //   10: ldc 1507486458
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 401100316
    //   19: l2i
    //   20: ldc -1536767665
    //   22: ixor
    //   23: ldc2_w -53101033
    //   26: l2i
    //   27: ldc -432605224
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 450, -1452421476 -> 56, 2051834661 -> 16
    //   56: aload_0
    //   57: ldc '桼㌜栣㶺'
    //   59: getstatic Perryc.0 : I
    //   62: ifle -> 75
    //   65: ldc2_w -650366634
    //   68: l2i
    //   69: ldc 442336657
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -838782205
    //   78: l2i
    //   79: ldc 1665643154
    //   81: ixor
    //   82: ldc2_w -25130119
    //   85: l2i
    //   86: ldc -258942576
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 116, -848173522 -> 452, -348899119 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc '桐㌁栣㶸힨'
    //   121: getstatic Perryc.1 : I
    //   124: ifeq -> 137
    //   127: ldc2_w -730091330
    //   130: l2i
    //   131: ldc 10435473
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w -849537938
    //   140: l2i
    //   141: ldc -1231181546
    //   143: ixor
    //   144: ldc2_w -1265044661
    //   147: l2i
    //   148: ldc 1071560561
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 180, 1604505365 -> 458, 2063928760 -> 137
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.c : I
    //   186: iflt -> 199
    //   189: ldc2_w -732536635
    //   192: l2i
    //   193: ldc -476152246
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w 1419270936
    //   202: l2i
    //   203: ldc -138052997
    //   205: ixor
    //   206: ldc2_w -899099824
    //   209: l2i
    //   210: ldc -1201077676
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 460, -782438297 -> 240, 1170853771 -> 199
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.RENDER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w 1665658896
    //   246: l2i
    //   247: ldc 1665658897
    //   249: ixor
    //   250: ldc2_w 446848567
    //   253: l2i
    //   254: ldc 446848567
    //   256: ixor
    //   257: ldc2_w -1662122983
    //   260: l2i
    //   261: ldc -1662122983
    //   263: ixor
    //   264: getstatic Perryc.1 : I
    //   267: ifeq -> 280
    //   270: ldc2_w 361654012
    //   273: l2i
    //   274: ldc -546470404
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w 1353873862
    //   283: l2i
    //   284: ldc -1308862793
    //   286: ixor
    //   287: ldc2_w -2024755214
    //   290: l2i
    //   291: ldc -803635189
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 448, -1649750791 -> 280, -1241055096 -> 320
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.0 : I
    //   326: ifle -> 339
    //   329: ldc2_w 458937475
    //   332: l2i
    //   333: ldc 355398878
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w -1006896758
    //   342: l2i
    //   343: ldc -1727004909
    //   345: ixor
    //   346: ldc2_w 1039737942
    //   349: l2i
    //   350: ldc 2249508
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 380, -493961540 -> 339, 867129135 -> 456
    //   380: aload_0
    //   381: ldc2_w -1949413150
    //   384: l2i
    //   385: ldc -1949413150
    //   387: ixor
    //   388: getstatic Perryc.c : I
    //   391: iflt -> 404
    //   394: ldc2_w -641670448
    //   397: l2i
    //   398: ldc 662295464
    //   400: ixor
    //   401: goto -> 411
    //   404: ldc2_w -1986878726
    //   407: l2i
    //   408: ldc 2124898509
    //   410: ixor
    //   411: ldc2_w -347706512
    //   414: l2i
    //   415: ldc -73422210
    //   417: ixor
    //   418: ixor
    //   419: lookupswitch default -> 454, -403963079 -> 444, -295636874 -> 404
    //   444: putfield fovslidergetterez : I
    //   447: return
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
    //   458: aconst_null
    //   459: athrow
    //   460: aconst_null
    //   461: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	448	0	this	Lbigname/zprestige/webhack/features/modules/Render/Zoom;
  }
  
  public void onEnable() {
    Perry1.45(this, (int)844385493L ^ 0x7C866AC4);
  }
  
  public void onDisable() {
    Perry1.3t(this, (int)728432741L ^ 0x6FB8A83A);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Render\Zoom.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */