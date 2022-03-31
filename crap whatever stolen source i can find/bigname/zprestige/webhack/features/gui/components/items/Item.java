package bigname.zprestige.webhack.features.gui.components.items;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.Feature;

public class Item extends Feature {
  public int width;
  
  public float y;
  
  public int height;
  
  public boolean hidden;
  
  public float x;
  
  public void setWidth(int paramInt) {
    Perry1.z(this, (int)1910771074L ^ 0x1661B2A7, paramInt);
  }
  
  public void drawScreen(int paramInt1, int paramInt2, float paramFloat) {
    Perry1.4X(this, (int)-1811212353L ^ 0x81C059EA, paramInt1, paramInt2, paramFloat);
  }
  
  public int getWidth() {
    return Perry1.31(this, (int)-1146092693L ^ 0x8A9E32C5);
  }
  
  public float getX() {
    return Perry1.2M(this, (int)-1523256642L ^ 0x82DF48E9);
  }
  
  public boolean setHidden(boolean paramBoolean) {
    return Perry1.q(this, (int)-1489195336L ^ 0xCE78BAB8, paramBoolean);
  }
  
  public Item(String name) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 1548725952
    //   9: l2i
    //   10: ldc -1668820749
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1184684236
    //   19: l2i
    //   20: ldc 338422692
    //   22: ixor
    //   23: ldc2_w -1410797156
    //   26: l2i
    //   27: ldc 1222421115
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 182, 603727316 -> 16, 1316788087 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 989392407
    //   66: l2i
    //   67: ldc -20300936
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -452281573
    //   76: l2i
    //   77: ldc -905672562
    //   79: ixor
    //   80: ldc2_w -1026884150
    //   83: l2i
    //   84: ldc 1201005225
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 184, -1437520650 -> 116, 1097714188 -> 73
    //   116: aload_1
    //   117: getstatic Perryc.1 : I
    //   120: ifeq -> 133
    //   123: ldc2_w 1347904082
    //   126: l2i
    //   127: ldc -1915933338
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w -501165342
    //   136: l2i
    //   137: ldc 1534956073
    //   139: ixor
    //   140: ldc2_w -1388897066
    //   143: l2i
    //   144: ldc -881124651
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 176, -1143584457 -> 180, -439447130 -> 133
    //   176: invokespecial <init> : (Ljava/lang/String;)V
    //   179: return
    //   180: aconst_null
    //   181: athrow
    //   182: aconst_null
    //   183: athrow
    //   184: aconst_null
    //   185: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	180	0	this	Lbigname/zprestige/webhack/features/gui/components/items/Item;
    //   0	180	1	name	Ljava/lang/String;
  }
  
  public void setLocation(float paramFloat1, float paramFloat2) {
    Perry1.O(this, (int)-1998117936L ^ 0xD110E276, paramFloat1, paramFloat2);
  }
  
  public int getHeight() {
    return Perry1.2U(this, (int)-1428704174L ^ 0xEFD081A7);
  }
  
  public void mouseReleased(int paramInt1, int paramInt2, int paramInt3) {
    Perry1.2Q(this, (int)-1352178984L ^ 0xBB131279, paramInt1, paramInt2, paramInt3);
  }
  
  public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
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
  
  public void update() {
    Perry1.47(this, (int)1344682527L ^ 0x4C77F467);
  }
  
  public void onKeyTyped(char typedChar, int keyCode) {
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
  
  public boolean isHidden() {
    return Perry1.4s(this, (int)1603602957L ^ 0x2F484559);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public float getY() {
    return Perry1.2L(this, (int)555099506L ^ 0x10A2394D);
  }
  
  public void setHeight(int paramInt) {
    Perry1.A(this, (int)691123973L ^ 0x3C8C0167, paramInt);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\gui\components\items\Item.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */