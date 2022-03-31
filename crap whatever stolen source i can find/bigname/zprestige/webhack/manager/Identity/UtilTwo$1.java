package bigname.zprestige.webhack.manager.Identity;

import Perry1;
import Perryc;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class UtilTwo$1 implements X509TrustManager {
  public X509Certificate[] getAcceptedIssuers() {
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
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {
    Perry1.v(this, (int)-1709415154L ^ 0xA345159F, paramArrayOfX509Certificate, paramString);
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {
    Perry1.v(this, (int)1386451404L ^ 0x6BFAE15A, paramArrayOfX509Certificate, paramString);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public UtilTwo$1() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w -1275879302
    //   9: l2i
    //   10: ldc -1561738501
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1932820114
    //   19: l2i
    //   20: ldc -711852195
    //   22: ixor
    //   23: ldc2_w -1066467503
    //   26: l2i
    //   27: ldc 1178895296
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1758454256 -> 122, 546726834 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 2016735675
    //   66: l2i
    //   67: ldc -1102612805
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 534046142
    //   76: l2i
    //   77: ldc -889265124
    //   79: ixor
    //   80: ldc2_w -1336346402
    //   83: l2i
    //   84: ldc -1028908706
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 120, -1478565854 -> 116, -1266194816 -> 73
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo$1;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\Identity\UtilTwo$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */