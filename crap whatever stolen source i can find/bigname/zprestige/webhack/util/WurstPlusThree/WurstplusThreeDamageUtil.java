package bigname.zprestige.webhack.util.WurstPlusThree;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.util.Globals;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class WurstplusThreeDamageUtil implements Globals {
  public static int getCooldownByWeapon(EntityPlayer paramEntityPlayer) {
    return Perry1.3b(null, (int)163603047L ^ 0x7475D4B5, paramEntityPlayer);
  }
  
  public static int getItemDamage(ItemStack stack) {
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
  
  public static boolean isArmorLow(EntityPlayer paramEntityPlayer, int paramInt) {
    return Perry1.53(null, (int)-45368841L ^ 0x9C368BD9, paramEntityPlayer, paramInt);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public WurstplusThreeDamageUtil() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w 27311624
    //   9: l2i
    //   10: ldc -1895562519
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 967396997
    //   19: l2i
    //   20: ldc -1129721263
    //   22: ixor
    //   23: ldc2_w -241482255
    //   26: l2i
    //   27: ldc 1618977343
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 122, 350518042 -> 56, 524311343 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w -859035675
    //   66: l2i
    //   67: ldc -875352090
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -1860368096
    //   76: l2i
    //   77: ldc -802467078
    //   79: ixor
    //   80: ldc2_w 590355541
    //   83: l2i
    //   84: ldc 1075762777
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -353395604 -> 73, 1680982543 -> 120
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/util/WurstPlusThree/WurstplusThreeDamageUtil;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\WurstPlusThree\WurstplusThreeDamageUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */