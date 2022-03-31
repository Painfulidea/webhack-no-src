package bigname.zprestige.webhack.manager;

import Perry1;
import bigname.zprestige.webhack.features.Feature;
import java.util.List;
import net.minecraft.network.Packet;

public class PacketManager extends Feature {
  public List<Packet<?>> noEventPackets;
  
  public boolean shouldSendPacket(Packet<?> packet) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 631
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.1 : I
    //   12: ifgt -> 623
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 615
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: getstatic Perryc.c : I
    //   27: iflt -> 40
    //   30: ldc2_w 2062057939
    //   33: l2i
    //   34: ldc 2114179262
    //   36: ixor
    //   37: goto -> 47
    //   40: ldc2_w -1080117332
    //   43: l2i
    //   44: ldc -1044003366
    //   46: ixor
    //   47: ldc2_w 1451529864
    //   50: l2i
    //   51: ldc 2112460678
    //   53: ixor
    //   54: ixor
    //   55: lookupswitch default -> 80, 797331555 -> 590, 842480325 -> 40
    //   80: aload_0
    //   81: getstatic Perryc.c : I
    //   84: iflt -> 97
    //   87: ldc2_w -313840454
    //   90: l2i
    //   91: ldc 298614266
    //   93: ixor
    //   94: goto -> 104
    //   97: ldc2_w -1309997322
    //   100: l2i
    //   101: ldc -1934156469
    //   103: ixor
    //   104: ldc2_w -941567790
    //   107: l2i
    //   108: ldc -229497820
    //   110: ixor
    //   111: ixor
    //   112: lookupswitch default -> 140, -919231050 -> 594, 1960525849 -> 97
    //   140: getfield noEventPackets : Ljava/util/List;
    //   143: getstatic Perryc.1 : I
    //   146: ifeq -> 159
    //   149: ldc2_w 756256014
    //   152: l2i
    //   153: ldc 1061987533
    //   155: ixor
    //   156: goto -> 166
    //   159: ldc2_w -1852571178
    //   162: l2i
    //   163: ldc -1477077511
    //   165: ixor
    //   166: ldc2_w 482186176
    //   169: l2i
    //   170: ldc 636971011
    //   172: ixor
    //   173: ixor
    //   174: lookupswitch default -> 200, -67062740 -> 159, 722850304 -> 600
    //   200: aload_1
    //   201: getstatic Perryc.1 : I
    //   204: ifeq -> 217
    //   207: ldc2_w -1717550457
    //   210: l2i
    //   211: ldc 948987357
    //   213: ixor
    //   214: goto -> 224
    //   217: ldc2_w -524555578
    //   220: l2i
    //   221: ldc 614780037
    //   223: ixor
    //   224: ldc2_w -626248456
    //   227: l2i
    //   228: ldc 401782151
    //   230: ixor
    //   231: ixor
    //   232: lookupswitch default -> 592, 155297596 -> 260, 1819190821 -> 217
    //   260: goto -> 264
    //   263: athrow
    //   264: invokeinterface contains : (Ljava/lang/Object;)Z
    //   269: goto -> 273
    //   272: athrow
    //   273: ifeq -> 286
    //   276: ldc2_w -1570587155
    //   279: l2i
    //   280: ldc 1583386307
    //   282: ixor
    //   283: goto -> 293
    //   286: ldc2_w 971719621
    //   289: l2i
    //   290: ldc -974556952
    //   292: ixor
    //   293: ldc2_w -2134582078
    //   296: l2i
    //   297: ldc -756716039
    //   299: ixor
    //   300: ixor
    //   301: tableswitch default -> 276, -1373404651 -> 324, -1373404650 -> 582
    //   324: getstatic Perryc.0 : I
    //   327: ifle -> 340
    //   330: ldc2_w -349871554
    //   333: l2i
    //   334: ldc -91193660
    //   336: ixor
    //   337: goto -> 347
    //   340: ldc2_w -154083075
    //   343: l2i
    //   344: ldc -636355201
    //   346: ixor
    //   347: ldc2_w -1637267530
    //   350: l2i
    //   351: ldc -1034503847
    //   353: ixor
    //   354: ixor
    //   355: lookupswitch default -> 380, -1030079101 -> 340, 1300947477 -> 604
    //   380: aload_0
    //   381: getstatic Perryc.1 : I
    //   384: ifeq -> 397
    //   387: ldc2_w -1677711941
    //   390: l2i
    //   391: ldc -286945518
    //   393: ixor
    //   394: goto -> 404
    //   397: ldc2_w 2012600122
    //   400: l2i
    //   401: ldc 668034260
    //   403: ixor
    //   404: ldc2_w 1125376618
    //   407: l2i
    //   408: ldc -1268660761
    //   410: ixor
    //   411: ixor
    //   412: lookupswitch default -> 440, -2053665500 -> 596, -590574783 -> 397
    //   440: getfield noEventPackets : Ljava/util/List;
    //   443: getstatic Perryc.1 : I
    //   446: ifeq -> 459
    //   449: ldc2_w -1022921615
    //   452: l2i
    //   453: ldc 379804615
    //   455: ixor
    //   456: goto -> 466
    //   459: ldc2_w -1863454495
    //   462: l2i
    //   463: ldc -1880912211
    //   465: ixor
    //   466: ldc2_w -1431609998
    //   469: l2i
    //   470: ldc -757745351
    //   472: ixor
    //   473: ixor
    //   474: lookupswitch default -> 500, -1512190299 -> 459, -1378169859 -> 598
    //   500: aload_1
    //   501: getstatic Perryc.c : I
    //   504: iflt -> 517
    //   507: ldc2_w -963776774
    //   510: l2i
    //   511: ldc -5860090
    //   513: ixor
    //   514: goto -> 524
    //   517: ldc2_w -789537176
    //   520: l2i
    //   521: ldc -773335168
    //   523: ixor
    //   524: ldc2_w -1142444699
    //   527: l2i
    //   528: ldc 1114476157
    //   530: ixor
    //   531: ixor
    //   532: lookupswitch default -> 560, -1063167772 -> 602, 70064914 -> 517
    //   560: goto -> 564
    //   563: athrow
    //   564: invokeinterface remove : (Ljava/lang/Object;)Z
    //   569: goto -> 573
    //   572: athrow
    //   573: pop
    //   574: ldc2_w -2029061963
    //   577: l2i
    //   578: ldc -2029061963
    //   580: ixor
    //   581: ireturn
    //   582: ldc2_w 148280105
    //   585: l2i
    //   586: ldc 148280104
    //   588: ixor
    //   589: ireturn
    //   590: aconst_null
    //   591: athrow
    //   592: aconst_null
    //   593: athrow
    //   594: aconst_null
    //   595: athrow
    //   596: aconst_null
    //   597: athrow
    //   598: aconst_null
    //   599: athrow
    //   600: aconst_null
    //   601: athrow
    //   602: aconst_null
    //   603: athrow
    //   604: aconst_null
    //   605: athrow
    //   606: pop
    //   607: goto -> 24
    //   610: pop
    //   611: aconst_null
    //   612: goto -> 606
    //   615: dup
    //   616: ifnull -> 606
    //   619: checkcast java/lang/Throwable
    //   622: athrow
    //   623: dup
    //   624: ifnull -> 610
    //   627: checkcast java/lang/Throwable
    //   630: athrow
    //   631: aconst_null
    //   632: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	566	0	this	Lbigname/zprestige/webhack/manager/PacketManager;
    //   24	566	1	packet	Lnet/minecraft/network/Packet;
    // Local variable type table:
    //   start	length	slot	name	signature
    //   24	566	1	packet	Lnet/minecraft/network/Packet<*>;
    // Exception table:
    //   from	to	target	type
    //   8	20	615	finally
    //   264	272	272	finally
    //   264	272	3	finally
    //   264	272	3	java/lang/StringIndexOutOfBoundsException
    //   264	272	272	java/lang/AssertionError
    //   264	272	272	java/lang/NegativeArraySizeException
    //   564	572	572	finally
    //   564	572	572	finally
    //   564	572	572	java/lang/NullPointerException
    //   564	572	3	java/lang/NullPointerException
    //   564	572	572	java/lang/ArrayIndexOutOfBoundsException
    //   615	623	615	java/lang/IllegalStateException
    //   631	633	3	java/util/ConcurrentModificationException
  }
  
  public void sendPacketNoEvent(Packet paramPacket) {
    Perry1.4T(this, (int)-1569884097L ^ 0xFCDD2EC6, paramPacket);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public PacketManager() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w -1127337657
    //   9: l2i
    //   10: ldc 1969653998
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 1694959087
    //   19: l2i
    //   20: ldc 499754143
    //   22: ixor
    //   23: ldc2_w 1727744451
    //   26: l2i
    //   27: ldc 193294525
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -1529446185 -> 310, 702086440 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.1 : I
    //   60: ifeq -> 73
    //   63: ldc2_w 1819085844
    //   66: l2i
    //   67: ldc -755681470
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w 301305748
    //   76: l2i
    //   77: ldc -1996198822
    //   79: ixor
    //   80: ldc2_w -1196859230
    //   83: l2i
    //   84: ldc -1065349671
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1995144464 -> 73, -961456595 -> 304
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.0 : I
    //   122: ifle -> 135
    //   125: ldc2_w -1954024136
    //   128: l2i
    //   129: ldc -1773570385
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -56108385
    //   138: l2i
    //   139: ldc 1794357359
    //   141: ixor
    //   142: ldc2_w -1210764042
    //   145: l2i
    //   146: ldc 613235451
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 306, -1902735974 -> 135, 84700413 -> 176
    //   176: aload_0
    //   177: new java/util/ArrayList
    //   180: dup
    //   181: getstatic Perryc.c : I
    //   184: iflt -> 197
    //   187: ldc2_w -1610604990
    //   190: l2i
    //   191: ldc 777496985
    //   193: ixor
    //   194: goto -> 204
    //   197: ldc2_w 1592092092
    //   200: l2i
    //   201: ldc 1343705907
    //   203: ixor
    //   204: ldc2_w 1334860260
    //   207: l2i
    //   208: ldc 1259691663
    //   210: ixor
    //   211: ixor
    //   212: lookupswitch default -> 240, -1965903696 -> 308, 2134669675 -> 197
    //   240: invokespecial <init> : ()V
    //   243: getstatic Perryc.0 : I
    //   246: ifle -> 259
    //   249: ldc2_w -1241676486
    //   252: l2i
    //   253: ldc 998018922
    //   255: ixor
    //   256: goto -> 266
    //   259: ldc2_w -1624305982
    //   262: l2i
    //   263: ldc -1486483411
    //   265: ixor
    //   266: ldc2_w -1292221116
    //   269: l2i
    //   270: ldc 899846323
    //   272: ixor
    //   273: ixor
    //   274: lookupswitch default -> 300, -903006444 -> 259, 165273511 -> 312
    //   300: putfield noEventPackets : Ljava/util/List;
    //   303: return
    //   304: aconst_null
    //   305: athrow
    //   306: aconst_null
    //   307: athrow
    //   308: aconst_null
    //   309: athrow
    //   310: aconst_null
    //   311: athrow
    //   312: aconst_null
    //   313: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	304	0	this	Lbigname/zprestige/webhack/manager/PacketManager;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\PacketManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */