package bigname.zprestige.webhack.features.modules.Player;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.modules.Module;

public class Quiver extends Module {
  public Integer tickDelay;
  
  public void onEnable() {
    Perry1.3x(this, (int)1576527396L ^ 0x3E57C34A);
  }
  
  public int findBow() {
    return Perry1.2Y(this, (int)1031961643L ^ 0x470B4CBB);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void onUpdate() {
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
  
  public Quiver() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w 1834594677
    //   9: l2i
    //   10: ldc_w -1287281997
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1517755234
    //   20: l2i
    //   21: ldc_w -1800588873
    //   24: ixor
    //   25: ldc2_w -1067607237
    //   28: l2i
    //   29: ldc_w 1786355537
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, 499361247 -> 17, 1949833132 -> 546
    //   60: aload_0
    //   61: ldc_w '㌆㶡垠ۨ'
    //   64: getstatic Perryc.1 : I
    //   67: ifeq -> 81
    //   70: ldc2_w 663369003
    //   73: l2i
    //   74: ldc_w -1338774342
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -1125080134
    //   84: l2i
    //   85: ldc_w 1165078250
    //   88: ixor
    //   89: ldc2_w 1462626422
    //   92: l2i
    //   93: ldc_w 392431575
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 124, -672123344 -> 552, 1756379370 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '㌼㶚埥ے๐闌蹋'
    //   130: getstatic Perryc.0 : I
    //   133: ifle -> 147
    //   136: ldc2_w -769430837
    //   139: l2i
    //   140: ldc_w 560958032
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w 906981298
    //   150: l2i
    //   151: ldc_w 16903681
    //   154: ixor
    //   155: ldc2_w 1833488673
    //   158: l2i
    //   159: ldc_w 788270176
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 548, -1325908518 -> 147, 1958370546 -> 192
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.0 : I
    //   198: ifle -> 212
    //   201: ldc2_w 292057980
    //   204: l2i
    //   205: ldc_w -526258461
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -530405874
    //   215: l2i
    //   216: ldc_w 703443264
    //   219: ixor
    //   220: ldc2_w 1606507896
    //   223: l2i
    //   224: ldc_w 1201233052
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 256, -376333189 -> 556, 1426505360 -> 212
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.PLAYER : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w -732717675
    //   262: l2i
    //   263: ldc_w -732717676
    //   266: ixor
    //   267: ldc2_w 582208687
    //   270: l2i
    //   271: ldc_w 582208687
    //   274: ixor
    //   275: ldc2_w -194107255
    //   278: l2i
    //   279: ldc_w -194107255
    //   282: ixor
    //   283: getstatic Perryc.1 : I
    //   286: ifeq -> 300
    //   289: ldc2_w 1504706376
    //   292: l2i
    //   293: ldc_w -1915681838
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 1004013470
    //   303: l2i
    //   304: ldc_w -838353318
    //   307: ixor
    //   308: ldc2_w 635672826
    //   311: l2i
    //   312: ldc_w 767953643
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 344, -1362207994 -> 300, -597987701 -> 544
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.c : I
    //   350: iflt -> 364
    //   353: ldc2_w -1108152833
    //   356: l2i
    //   357: ldc_w -292499633
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w 480431969
    //   367: l2i
    //   368: ldc_w -848180147
    //   371: ixor
    //   372: ldc2_w 1822021518
    //   375: l2i
    //   376: ldc_w 225521715
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 554, -1338252143 -> 408, 847955213 -> 364
    //   408: aload_0
    //   409: ldc2_w 225075218
    //   412: l2i
    //   413: ldc_w 225075217
    //   416: ixor
    //   417: getstatic Perryc.1 : I
    //   420: ifeq -> 434
    //   423: ldc2_w 407993421
    //   426: l2i
    //   427: ldc_w -1058540543
    //   430: ixor
    //   431: goto -> 442
    //   434: ldc2_w -330934087
    //   437: l2i
    //   438: ldc_w 847164011
    //   441: ixor
    //   442: ldc2_w -2134221018
    //   445: l2i
    //   446: ldc_w 1150013979
    //   449: ixor
    //   450: ixor
    //   451: lookupswitch default -> 558, 444164079 -> 476, 485950833 -> 434
    //   476: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   479: getstatic Perryc.0 : I
    //   482: ifle -> 496
    //   485: ldc2_w 1418850827
    //   488: l2i
    //   489: ldc_w -1297021247
    //   492: ixor
    //   493: goto -> 504
    //   496: ldc2_w 1369723891
    //   499: l2i
    //   500: ldc_w 1488806525
    //   503: ixor
    //   504: ldc2_w -320044925
    //   507: l2i
    //   508: ldc_w 1946941263
    //   511: ixor
    //   512: ixor
    //   513: lookupswitch default -> 550, -1845606846 -> 540, 2127004422 -> 496
    //   540: putfield tickDelay : Ljava/lang/Integer;
    //   543: return
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
    //   558: aconst_null
    //   559: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	544	0	this	Lbigname/zprestige/webhack/features/modules/Player/Quiver;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Player\Quiver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */