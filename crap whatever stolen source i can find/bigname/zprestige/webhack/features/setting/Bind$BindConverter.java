package bigname.zprestige.webhack.features.setting;

import Perry1;
import Perryc;
import com.google.common.base.Converter;
import com.google.gson.JsonElement;

public class Bind$BindConverter extends Converter {
  public Object doBackward(Object paramObject) {
    return Perry1.G(this, (int)532564948L ^ 0x3FED2004, paramObject);
  }
  
  public Bind$BindConverter() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w -1461577155
    //   9: l2i
    //   10: ldc -2023832321
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 71919032
    //   19: l2i
    //   20: ldc 532412060
    //   22: ixor
    //   23: ldc2_w 774029638
    //   26: l2i
    //   27: ldc -827075398
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 122, -819082434 -> 16, -77363496 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 573352228
    //   66: l2i
    //   67: ldc 372774736
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1118162124
    //   76: l2i
    //   77: ldc -2141969868
    //   79: ixor
    //   80: ldc2_w -2001105515
    //   83: l2i
    //   84: ldc -1788434506
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -680484586 -> 73, 701207639 -> 120
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/features/setting/Bind$BindConverter;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public Object doForward(Object paramObject) {
    return Perry1.G(this, (int)-1497372010L ^ 0x86EC8147, paramObject);
  }
  
  public Bind doBackward(JsonElement jsonElement) {
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
  
  public JsonElement doForward(Bind bind) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\setting\Bind$BindConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */