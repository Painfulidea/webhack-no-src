package bigname.zprestige.webhack.manager.Identity;

import Perryc;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public class UtilTwo$ConnectionFactory$1 implements UtilTwo$ConnectionFactory {
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public UtilTwo$ConnectionFactory$1() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w -1357955968
    //   9: l2i
    //   10: ldc 1252556096
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -260364212
    //   19: l2i
    //   20: ldc 120237312
    //   22: ixor
    //   23: ldc2_w 1847787658
    //   26: l2i
    //   27: ldc 108500340
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 122, -1913400258 -> 16, -1627057998 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w 956848502
    //   66: l2i
    //   67: ldc -1736549789
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 2092491992
    //   76: l2i
    //   77: ldc 286457128
    //   79: ixor
    //   80: ldc2_w 567663169
    //   83: l2i
    //   84: ldc -1439217128
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 120, -431453783 -> 116, 714380108 -> 73
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo$ConnectionFactory$1;
  }
  
  public HttpURLConnection create(URL url, Proxy proxy) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 246
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 238
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 230
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.0 : I
    //   27: ifle -> 40
    //   30: ldc2_w -2122546586
    //   33: l2i
    //   34: ldc 616890442
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w 1134501599
    //   43: l2i
    //   44: ldc 538518100
    //   46: ixor
    //   47: ldc2_w 1368202761
    //   50: l2i
    //   51: ldc -1947159004
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 80, -184891543 -> 40, 2143562241 -> 215
    //   80: aload_1
    //   81: getstatic Perryc.1 : I
    //   84: ifeq -> 97
    //   87: ldc2_w -1113448945
    //   90: l2i
    //   91: ldc 2117656920
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -1078448488
    //   100: l2i
    //   101: ldc -1559905637
    //   103: ixor
    //   104: ldc2_w -2106467042
    //   107: l2i
    //   108: ldc -702361082
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, -1748373425 -> 219, -790135764 -> 97
    //   140: aload_2
    //   141: getstatic Perryc.c : I
    //   144: iflt -> 157
    //   147: ldc2_w 1287070666
    //   150: l2i
    //   151: ldc -1990410263
    //   153: ixor
    //   154: goto -> 164
    //   157: ldc2_w -2120464143
    //   160: l2i
    //   161: ldc -1248280279
    //   163: ixor
    //   164: ldc2_w -569616460
    //   167: l2i
    //   168: ldc -1581105503
    //   170: ixor
    //   171: ixor
    //   172: lookupswitch default -> 200, -1171917514 -> 217, 228889683 -> 157
    //   200: goto -> 204
    //   203: athrow
    //   204: invokevirtual openConnection : (Ljava/net/Proxy;)Ljava/net/URLConnection;
    //   207: goto -> 211
    //   210: athrow
    //   211: checkcast java/net/HttpURLConnection
    //   214: areturn
    //   215: aconst_null
    //   216: athrow
    //   217: aconst_null
    //   218: athrow
    //   219: aconst_null
    //   220: athrow
    //   221: pop
    //   222: goto -> 24
    //   225: pop
    //   226: aconst_null
    //   227: goto -> 221
    //   230: dup
    //   231: ifnull -> 221
    //   234: checkcast java/lang/Throwable
    //   237: athrow
    //   238: dup
    //   239: ifnull -> 225
    //   242: checkcast java/lang/Throwable
    //   245: athrow
    //   246: aconst_null
    //   247: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	191	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilTwo$ConnectionFactory$1;
    //   24	191	1	url	Ljava/net/URL;
    //   24	191	2	proxy	Ljava/net/Proxy;
    // Exception table:
    //   from	to	target	type
    //   8	20	230	finally
    //   203	210	210	finally
    //   203	210	3	finally
    //   203	210	3	finally
    //   204	210	203	java/util/NoSuchElementException
    //   204	210	3	java/lang/IndexOutOfBoundsException
    //   230	238	230	java/lang/EnumConstantNotPresentException
    //   246	248	3	java/lang/ArithmeticException
  }
  
  public HttpURLConnection create(URL url) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\Identity\UtilTwo$ConnectionFactory$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */