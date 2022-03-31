package bigname.zprestige.webhack.features.gui.components.items.buttons;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.gui.components.items.Item;

public class Button extends Item {
  public boolean state;
  
  public void onMouseClick() {
    Perry1.3A(this, (int)-363456100L ^ 0x9736D2CA);
  }
  
  public boolean isHovering(int mouseX, int mouseY) {
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
  
  public void drawScreen(int paramInt1, int paramInt2, float paramFloat) {
    Perry1.4X(this, (int)-292998956L ^ 0xFB427E80, paramInt1, paramInt2, paramFloat);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public Button(String name) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w -1832724798
    //   9: l2i
    //   10: ldc_w -1830628490
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1125564601
    //   20: l2i
    //   21: ldc_w -371154756
    //   24: ixor
    //   25: ldc2_w -1461434307
    //   28: l2i
    //   29: ldc_w -1777085259
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1038827823 -> 17, 1054316860 -> 320
    //   60: aload_0
    //   61: getstatic Perryc.c : I
    //   64: iflt -> 78
    //   67: ldc2_w -319708152
    //   70: l2i
    //   71: ldc_w 1555318151
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -786245840
    //   81: l2i
    //   82: ldc_w -572597388
    //   85: ixor
    //   86: ldc2_w -1057501421
    //   89: l2i
    //   90: ldc_w 809951487
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 322, -62053464 -> 120, 1089785443 -> 78
    //   120: aload_1
    //   121: getstatic Perryc.0 : I
    //   124: ifle -> 138
    //   127: ldc2_w -1588162950
    //   130: l2i
    //   131: ldc_w -324635289
    //   134: ixor
    //   135: goto -> 146
    //   138: ldc2_w -1523550210
    //   141: l2i
    //   142: ldc_w -581630409
    //   145: ixor
    //   146: ldc2_w -67767602
    //   149: l2i
    //   150: ldc_w 1041516046
    //   153: ixor
    //   154: ixor
    //   155: lookupswitch default -> 324, -2012131363 -> 138, -1115372279 -> 180
    //   180: invokespecial <init> : (Ljava/lang/String;)V
    //   183: getstatic Perryc.c : I
    //   186: iflt -> 200
    //   189: ldc2_w -2055277286
    //   192: l2i
    //   193: ldc_w -692244640
    //   196: ixor
    //   197: goto -> 208
    //   200: ldc2_w -112523602
    //   203: l2i
    //   204: ldc_w -1521393926
    //   207: ixor
    //   208: ldc2_w 585415742
    //   211: l2i
    //   212: ldc_w -205282564
    //   215: ixor
    //   216: ixor
    //   217: lookupswitch default -> 316, -2098936648 -> 200, -1925364074 -> 244
    //   244: aload_0
    //   245: ldc2_w 1842676692
    //   248: l2i
    //   249: ldc_w 1842676699
    //   252: ixor
    //   253: getstatic Perryc.0 : I
    //   256: ifle -> 270
    //   259: ldc2_w 1921110295
    //   262: l2i
    //   263: ldc_w 1389211617
    //   266: ixor
    //   267: goto -> 278
    //   270: ldc2_w 955042538
    //   273: l2i
    //   274: ldc_w -627897514
    //   277: ixor
    //   278: ldc2_w 559299729
    //   281: l2i
    //   282: ldc_w 415650554
    //   285: ixor
    //   286: ixor
    //   287: lookupswitch default -> 318, -605048873 -> 312, 433852573 -> 270
    //   312: putfield height : I
    //   315: return
    //   316: aconst_null
    //   317: athrow
    //   318: aconst_null
    //   319: athrow
    //   320: aconst_null
    //   321: athrow
    //   322: aconst_null
    //   323: athrow
    //   324: aconst_null
    //   325: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	316	0	this	Lbigname/zprestige/webhack/features/gui/components/items/buttons/Button;
    //   0	316	1	name	Ljava/lang/String;
  }
  
  public void mouseClicked(int paramInt1, int paramInt2, int paramInt3) {
    Perry1.2Q(this, (int)-1056565560L ^ 0xD5726676, paramInt1, paramInt2, paramInt3);
  }
  
  public void toggle() {
    Perry1.3X(this, (int)340113385L ^ 0x59A16643);
  }
  
  public int getHeight() {
    return Perry1.35(this, (int)-223810786L ^ 0xF4319D30);
  }
  
  public boolean getState() {
    return Perry1.4F(this, (int)-227127235L ^ 0xDE1F3E3F);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\gui\components\items\buttons\Button.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */