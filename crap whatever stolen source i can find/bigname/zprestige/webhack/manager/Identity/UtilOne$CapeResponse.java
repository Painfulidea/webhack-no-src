package bigname.zprestige.webhack.manager.Identity;

import Perry1;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class UtilOne$CapeResponse {
  @SerializedName("retry_after")
  public int retryAfter;
  
  public String message;
  
  public List<String> username;
  
  public List<String> embeds;
  
  public List<String> connection;
  
  public boolean global;
  
  public String getMessage() {
    return Perry1.6(this, (int)449554578L ^ 0x1EE32AEF);
  }
  
  public int getRetryAfter() {
    return Perry1.30(this, (int)-1079347767L ^ 0xB88D87D6);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public List getEmbeds() {
    return Perry1.56(this, (int)1453174793L ^ 0x207E9584);
  }
  
  public List getConnection() {
    return Perry1.55(this, (int)-518052656L ^ 0xB50E56CF);
  }
  
  public UtilOne$CapeResponse() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 1143956010
    //   9: l2i
    //   10: ldc -325922661
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1669306745
    //   19: l2i
    //   20: ldc 1068435364
    //   22: ixor
    //   23: ldc2_w 1387669727
    //   26: l2i
    //   27: ldc 1142195571
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 692, -1248998257 -> 56, -1105256675 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.1 : I
    //   60: ifeq -> 73
    //   63: ldc2_w -1531313476
    //   66: l2i
    //   67: ldc -1857271916
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 1221288989
    //   76: l2i
    //   77: ldc 51573893
    //   79: ixor
    //   80: ldc2_w 620020888
    //   83: l2i
    //   84: ldc -2094935005
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1963319241 -> 73, -1843178093 -> 682
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.0 : I
    //   122: ifle -> 135
    //   125: ldc2_w 1152277064
    //   128: l2i
    //   129: ldc 486337849
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -680049526
    //   138: l2i
    //   139: ldc -400761914
    //   141: ixor
    //   142: ldc2_w -1169126338
    //   145: l2i
    //   146: ldc 664460324
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 684, -1566453930 -> 176, -979835029 -> 135
    //   176: aload_0
    //   177: new java/util/ArrayList
    //   180: dup
    //   181: getstatic Perryc.0 : I
    //   184: ifle -> 197
    //   187: ldc2_w -2132784171
    //   190: l2i
    //   191: ldc -1671919738
    //   193: ixor
    //   194: goto -> 204
    //   197: ldc2_w 44634785
    //   200: l2i
    //   201: ldc -1355271638
    //   203: ixor
    //   204: ldc2_w -1410638055
    //   207: l2i
    //   208: ldc 1289275890
    //   210: ixor
    //   211: ixor
    //   212: lookupswitch default -> 676, -74753352 -> 197, 1252177504 -> 240
    //   240: invokespecial <init> : ()V
    //   243: getstatic Perryc.1 : I
    //   246: ifeq -> 259
    //   249: ldc2_w 1634944418
    //   252: l2i
    //   253: ldc 1526655535
    //   255: ixor
    //   256: goto -> 266
    //   259: ldc2_w 809881084
    //   262: l2i
    //   263: ldc 2122526073
    //   265: ixor
    //   266: ldc2_w 162833201
    //   269: l2i
    //   270: ldc 1732366296
    //   272: ixor
    //   273: ixor
    //   274: lookupswitch default -> 678, 540249196 -> 300, 1433977700 -> 259
    //   300: putfield username : Ljava/util/List;
    //   303: getstatic Perryc.0 : I
    //   306: ifle -> 319
    //   309: ldc2_w -40979424
    //   312: l2i
    //   313: ldc -513689437
    //   315: ixor
    //   316: goto -> 326
    //   319: ldc2_w -1135921990
    //   322: l2i
    //   323: ldc 1107919712
    //   325: ixor
    //   326: ldc2_w 676032196
    //   329: l2i
    //   330: ldc -100187915
    //   332: ixor
    //   333: ixor
    //   334: lookupswitch default -> 686, -828169550 -> 319, 739154411 -> 360
    //   360: aload_0
    //   361: new java/util/ArrayList
    //   364: dup
    //   365: getstatic Perryc.1 : I
    //   368: ifeq -> 381
    //   371: ldc2_w -1902826206
    //   374: l2i
    //   375: ldc 584914785
    //   377: ixor
    //   378: goto -> 388
    //   381: ldc2_w -1721269661
    //   384: l2i
    //   385: ldc 448905435
    //   387: ixor
    //   388: ldc2_w -832802113
    //   391: l2i
    //   392: ldc 490289262
    //   394: ixor
    //   395: ixor
    //   396: lookupswitch default -> 674, 1354958953 -> 424, 2133684370 -> 381
    //   424: invokespecial <init> : ()V
    //   427: getstatic Perryc.1 : I
    //   430: ifeq -> 443
    //   433: ldc2_w -227520654
    //   436: l2i
    //   437: ldc -1378711297
    //   439: ixor
    //   440: goto -> 450
    //   443: ldc2_w -66263831
    //   446: l2i
    //   447: ldc -2067688614
    //   449: ixor
    //   450: ldc2_w 1055503420
    //   453: l2i
    //   454: ldc 974073701
    //   456: ixor
    //   457: ixor
    //   458: lookupswitch default -> 484, 1531206868 -> 688, 1703980286 -> 443
    //   484: putfield embeds : Ljava/util/List;
    //   487: getstatic Perryc.1 : I
    //   490: ifeq -> 503
    //   493: ldc2_w 1715723061
    //   496: l2i
    //   497: ldc 412772252
    //   499: ixor
    //   500: goto -> 510
    //   503: ldc2_w 1189263396
    //   506: l2i
    //   507: ldc 1485815046
    //   509: ixor
    //   510: ldc2_w -1428725877
    //   513: l2i
    //   514: ldc 335124853
    //   516: ixor
    //   517: ixor
    //   518: lookupswitch default -> 672, -1488731172 -> 544, -940082601 -> 503
    //   544: aload_0
    //   545: new java/util/ArrayList
    //   548: dup
    //   549: getstatic Perryc.1 : I
    //   552: ifeq -> 565
    //   555: ldc2_w 144763648
    //   558: l2i
    //   559: ldc 1417583896
    //   561: ixor
    //   562: goto -> 572
    //   565: ldc2_w -2053542381
    //   568: l2i
    //   569: ldc 41456351
    //   571: ixor
    //   572: ldc2_w -1000048618
    //   575: l2i
    //   576: ldc 2123379000
    //   578: ixor
    //   579: ixor
    //   580: lookupswitch default -> 690, -433438922 -> 565, 1024832994 -> 608
    //   608: invokespecial <init> : ()V
    //   611: getstatic Perryc.1 : I
    //   614: ifeq -> 627
    //   617: ldc2_w 1816212633
    //   620: l2i
    //   621: ldc 621340086
    //   623: ixor
    //   624: goto -> 634
    //   627: ldc2_w -698666101
    //   630: l2i
    //   631: ldc 1989337712
    //   633: ixor
    //   634: ldc2_w -1434081577
    //   637: l2i
    //   638: ldc 1725934871
    //   640: ixor
    //   641: ixor
    //   642: lookupswitch default -> 668, -2062296337 -> 680, -1513469840 -> 627
    //   668: putfield connection : Ljava/util/List;
    //   671: return
    //   672: aconst_null
    //   673: athrow
    //   674: aconst_null
    //   675: athrow
    //   676: aconst_null
    //   677: athrow
    //   678: aconst_null
    //   679: athrow
    //   680: aconst_null
    //   681: athrow
    //   682: aconst_null
    //   683: athrow
    //   684: aconst_null
    //   685: athrow
    //   686: aconst_null
    //   687: athrow
    //   688: aconst_null
    //   689: athrow
    //   690: aconst_null
    //   691: athrow
    //   692: aconst_null
    //   693: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	672	0	this	Lbigname/zprestige/webhack/manager/Identity/UtilOne$CapeResponse;
  }
  
  public List getUsername() {
    return Perry1.58(this, (int)-175477450L ^ 0x8DD7B8BD);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\Identity\UtilOne$CapeResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */