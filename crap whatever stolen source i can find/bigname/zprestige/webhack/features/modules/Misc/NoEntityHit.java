package bigname.zprestige.webhack.features.modules.Misc;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.modules.Module;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class NoEntityHit extends Module {
  public boolean focus;
  
  public NoEntityHit() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 670825996
    //   9: l2i
    //   10: ldc 923288913
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 699685025
    //   19: l2i
    //   20: ldc -1710560738
    //   22: ixor
    //   23: ldc2_w 1564262801
    //   26: l2i
    //   27: ldc 507519932
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 458, -255700846 -> 56, 1401903472 -> 16
    //   56: aload_0
    //   57: ldc 'ϐ㌜α㶹꽩๭繊蹋묱'
    //   59: getstatic Perryc.c : I
    //   62: iflt -> 75
    //   65: ldc2_w 950521816
    //   68: l2i
    //   69: ldc -680083150
    //   71: ixor
    //   72: goto -> 82
    //   75: ldc2_w -104690553
    //   78: l2i
    //   79: ldc -1792057394
    //   81: ixor
    //   82: ldc2_w -401790956
    //   85: l2i
    //   86: ldc 276140033
    //   88: ixor
    //   89: ixor
    //   90: lookupswitch default -> 448, -1802146980 -> 116, 396998399 -> 75
    //   116: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc 'ϓ㌒Ο㶲꽮๬繁踣묬ਤ츭煠睭麞迟?ꝩ뉛谚侣䛾埍ᣚ꛴⥁粃暼摦'
    //   121: getstatic Perryc.1 : I
    //   124: ifeq -> 137
    //   127: ldc2_w -794576644
    //   130: l2i
    //   131: ldc -1066940843
    //   133: ixor
    //   134: goto -> 144
    //   137: ldc2_w 295561822
    //   140: l2i
    //   141: ldc -2028292109
    //   143: ixor
    //   144: ldc2_w 1134413423
    //   147: l2i
    //   148: ldc 1311253186
    //   150: ixor
    //   151: ixor
    //   152: lookupswitch default -> 450, -1691174656 -> 180, 493984260 -> 137
    //   180: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   183: getstatic Perryc.c : I
    //   186: iflt -> 199
    //   189: ldc2_w 454984385
    //   192: l2i
    //   193: ldc -1067061164
    //   195: ixor
    //   196: goto -> 206
    //   199: ldc2_w 1153810696
    //   202: l2i
    //   203: ldc -1562263577
    //   205: ixor
    //   206: ldc2_w 638439596
    //   209: l2i
    //   210: ldc 367069276
    //   212: ixor
    //   213: ixor
    //   214: lookupswitch default -> 452, -708270561 -> 240, -392713627 -> 199
    //   240: getstatic bigname/zprestige/webhack/features/modules/Module$Category.MISC : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   243: ldc2_w -1011928872
    //   246: l2i
    //   247: ldc -1011928871
    //   249: ixor
    //   250: ldc2_w 464890052
    //   253: l2i
    //   254: ldc 464890052
    //   256: ixor
    //   257: ldc2_w 1262871878
    //   260: l2i
    //   261: ldc 1262871878
    //   263: ixor
    //   264: getstatic Perryc.c : I
    //   267: iflt -> 280
    //   270: ldc2_w -1172232057
    //   273: l2i
    //   274: ldc -917966646
    //   276: ixor
    //   277: goto -> 287
    //   280: ldc2_w -604575704
    //   283: l2i
    //   284: ldc 306563716
    //   286: ixor
    //   287: ldc2_w -2046236828
    //   290: l2i
    //   291: ldc 506376520
    //   293: ixor
    //   294: ixor
    //   295: lookupswitch default -> 320, -857457504 -> 280, -347107743 -> 456
    //   320: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   323: getstatic Perryc.0 : I
    //   326: ifle -> 339
    //   329: ldc2_w -359582990
    //   332: l2i
    //   333: ldc 1947747871
    //   335: ixor
    //   336: goto -> 346
    //   339: ldc2_w -1130268569
    //   342: l2i
    //   343: ldc 823100749
    //   345: ixor
    //   346: ldc2_w -838288227
    //   349: l2i
    //   350: ldc -508925278
    //   352: ixor
    //   353: ixor
    //   354: lookupswitch default -> 454, -1576260843 -> 380, -1322540334 -> 339
    //   380: aload_0
    //   381: ldc2_w -1669981097
    //   384: l2i
    //   385: ldc -1669981097
    //   387: ixor
    //   388: getstatic Perryc.0 : I
    //   391: ifle -> 404
    //   394: ldc2_w 835597379
    //   397: l2i
    //   398: ldc 1589090041
    //   400: ixor
    //   401: goto -> 411
    //   404: ldc2_w 1391241541
    //   407: l2i
    //   408: ldc -1575423730
    //   410: ixor
    //   411: ldc2_w 370612169
    //   414: l2i
    //   415: ldc -843462902
    //   417: ixor
    //   418: ixor
    //   419: lookupswitch default -> 460, -1260948871 -> 404, 727353480 -> 444
    //   444: putfield focus : Z
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
    //   0	448	0	this	Lbigname/zprestige/webhack/features/modules/Misc/NoEntityHit;
  }
  
  public static boolean lambda$onUpdate$1(Entity paramEntity) {
    return Perry1.5R(null, (int)-500700943L ^ 0xFB0427AA, paramEntity);
  }
  
  public static boolean lambda$onUpdate$0(Entity paramEntity) {
    return Perry1.5U(null, (int)932682675L ^ 0x3059FE9F, paramEntity);
  }
  
  public void process(EntityLivingBase event) {
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
  
  public static EntityLivingBase lambda$onUpdate$2(Entity entity) {
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
  
  public static boolean lambda$onUpdate$3(EntityLivingBase paramEntityLivingBase) {
    return Perry1.5Z(null, (int)-1643398666L ^ 0xCAD03DF7, paramEntityLivingBase);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Misc\NoEntityHit.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */