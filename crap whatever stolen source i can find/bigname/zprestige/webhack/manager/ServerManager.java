package bigname.zprestige.webhack.manager;

import Perry1;
import bigname.zprestige.webhack.features.Feature;
import bigname.zprestige.webhack.util.Timer;
import java.text.DecimalFormat;

public class ServerManager extends Feature {
  public float TPS;
  
  public DecimalFormat format;
  
  public long lastUpdate;
  
  public String serverBrand;
  
  public float[] tpsCounts;
  
  public Timer timer;
  
  public ServerManager() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w -793936304
    //   9: l2i
    //   10: ldc -1324646135
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1101749759
    //   19: l2i
    //   20: ldc -956663415
    //   22: ixor
    //   23: ldc2_w 1363261256
    //   26: l2i
    //   27: ldc -1628051622
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 1076, -1374507189 -> 16, -1222997094 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.1 : I
    //   60: ifeq -> 73
    //   63: ldc2_w -1372479877
    //   66: l2i
    //   67: ldc -1159163215
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -1271997659
    //   76: l2i
    //   77: ldc -1242671782
    //   79: ixor
    //   80: ldc2_w 1377933377
    //   83: l2i
    //   84: ldc -778404448
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1755125461 -> 1072, -1520405572 -> 73
    //   116: invokespecial <init> : ()V
    //   119: getstatic Perryc.1 : I
    //   122: ifeq -> 135
    //   125: ldc2_w 925781088
    //   128: l2i
    //   129: ldc 934344258
    //   131: ixor
    //   132: goto -> 142
    //   135: ldc2_w -2109577630
    //   138: l2i
    //   139: ldc 1343157518
    //   141: ixor
    //   142: ldc2_w 1184257064
    //   145: l2i
    //   146: ldc 867964844
    //   148: ixor
    //   149: ixor
    //   150: lookupswitch default -> 176, -2073550374 -> 135, 1974794662 -> 1048
    //   176: aload_0
    //   177: ldc2_w 889857923
    //   180: l2i
    //   181: ldc 889857929
    //   183: ixor
    //   184: newarray float
    //   186: getstatic Perryc.1 : I
    //   189: ifeq -> 202
    //   192: ldc2_w 1588889982
    //   195: l2i
    //   196: ldc 1092268221
    //   198: ixor
    //   199: goto -> 209
    //   202: ldc2_w -621599459
    //   205: l2i
    //   206: ldc -1470629401
    //   208: ixor
    //   209: ldc2_w -1120864339
    //   212: l2i
    //   213: ldc -2032769322
    //   215: ixor
    //   216: ixor
    //   217: lookupswitch default -> 244, -1524439165 -> 202, 608741560 -> 1060
    //   244: putfield tpsCounts : [F
    //   247: getstatic Perryc.c : I
    //   250: iflt -> 263
    //   253: ldc2_w 342490346
    //   256: l2i
    //   257: ldc -378830668
    //   259: ixor
    //   260: goto -> 270
    //   263: ldc2_w 1506538822
    //   266: l2i
    //   267: ldc 140205029
    //   269: ixor
    //   270: ldc2_w 80806418
    //   273: l2i
    //   274: ldc 1903324848
    //   276: ixor
    //   277: ixor
    //   278: lookupswitch default -> 304, -2002710276 -> 1068, 745964267 -> 263
    //   304: aload_0
    //   305: new java/text/DecimalFormat
    //   308: dup
    //   309: ldc 'ᒁ㍐ᒞ㷧ꉩ悔'
    //   311: getstatic Perryc.c : I
    //   314: iflt -> 327
    //   317: ldc2_w 856885076
    //   320: l2i
    //   321: ldc -834986170
    //   323: ixor
    //   324: goto -> 334
    //   327: ldc2_w 4520185
    //   330: l2i
    //   331: ldc -865864193
    //   333: ixor
    //   334: ldc2_w -318372056
    //   337: l2i
    //   338: ldc -1136211093
    //   340: ixor
    //   341: ixor
    //   342: lookupswitch default -> 1078, -1654144699 -> 368, -1402416047 -> 327
    //   368: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   371: getstatic Perryc.c : I
    //   374: iflt -> 387
    //   377: ldc2_w 595736212
    //   380: l2i
    //   381: ldc -696231305
    //   383: ixor
    //   384: goto -> 394
    //   387: ldc2_w -942998981
    //   390: l2i
    //   391: ldc 1517243854
    //   393: ixor
    //   394: ldc2_w -1854926274
    //   397: l2i
    //   398: ldc -1473997512
    //   400: ixor
    //   401: ixor
    //   402: lookupswitch default -> 1058, -1527697165 -> 428, -866718747 -> 387
    //   428: invokespecial <init> : (Ljava/lang/String;)V
    //   431: getstatic Perryc.1 : I
    //   434: ifeq -> 447
    //   437: ldc2_w -1862479852
    //   440: l2i
    //   441: ldc 548313349
    //   443: ixor
    //   444: goto -> 454
    //   447: ldc2_w 1088380404
    //   450: l2i
    //   451: ldc 111211038
    //   453: ixor
    //   454: ldc2_w -1701352050
    //   457: l2i
    //   458: ldc -50952220
    //   460: ixor
    //   461: ixor
    //   462: lookupswitch default -> 1064, -701258885 -> 447, 538854784 -> 488
    //   488: putfield format : Ljava/text/DecimalFormat;
    //   491: getstatic Perryc.0 : I
    //   494: ifle -> 507
    //   497: ldc2_w -492421493
    //   500: l2i
    //   501: ldc 720507310
    //   503: ixor
    //   504: goto -> 514
    //   507: ldc2_w -1149369335
    //   510: l2i
    //   511: ldc -1310053657
    //   513: ixor
    //   514: ldc2_w -805458150
    //   517: l2i
    //   518: ldc -1704112555
    //   520: ixor
    //   521: ixor
    //   522: lookupswitch default -> 1056, -1648046486 -> 507, 1594150817 -> 548
    //   548: aload_0
    //   549: new bigname/zprestige/webhack/util/Timer
    //   552: dup
    //   553: getstatic Perryc.c : I
    //   556: iflt -> 569
    //   559: ldc2_w -1285072779
    //   562: l2i
    //   563: ldc 908383809
    //   565: ixor
    //   566: goto -> 576
    //   569: ldc2_w -606960283
    //   572: l2i
    //   573: ldc 1082696808
    //   575: ixor
    //   576: ldc2_w -1513234063
    //   579: l2i
    //   580: ldc -839621645
    //   582: ixor
    //   583: ixor
    //   584: lookupswitch default -> 1070, -310768458 -> 569, -211573873 -> 612
    //   612: invokespecial <init> : ()V
    //   615: getstatic Perryc.c : I
    //   618: iflt -> 631
    //   621: ldc2_w -101918807
    //   624: l2i
    //   625: ldc 1184218904
    //   627: ixor
    //   628: goto -> 638
    //   631: ldc2_w 1041321114
    //   634: l2i
    //   635: ldc -625896637
    //   637: ixor
    //   638: ldc2_w -310304233
    //   641: l2i
    //   642: ldc 1386885311
    //   644: ixor
    //   645: ixor
    //   646: lookupswitch default -> 672, 5405209 -> 1050, 1635041462 -> 631
    //   672: putfield timer : Lbigname/zprestige/webhack/util/Timer;
    //   675: getstatic Perryc.c : I
    //   678: iflt -> 691
    //   681: ldc2_w -1150754160
    //   684: l2i
    //   685: ldc -177998917
    //   687: ixor
    //   688: goto -> 698
    //   691: ldc2_w 193333712
    //   694: l2i
    //   695: ldc -911632058
    //   697: ixor
    //   698: ldc2_w -1753732614
    //   701: l2i
    //   702: ldc -758956519
    //   704: ixor
    //   705: ixor
    //   706: lookupswitch default -> 1052, -2020309131 -> 732, 196085448 -> 691
    //   732: aload_0
    //   733: ldc 1.2550181
    //   735: invokestatic floatToIntBits : (F)I
    //   738: ldc 2113971311
    //   740: ixor
    //   741: invokestatic intBitsToFloat : (I)F
    //   744: getstatic Perryc.1 : I
    //   747: ifeq -> 760
    //   750: ldc2_w -1375064758
    //   753: l2i
    //   754: ldc -1973273866
    //   756: ixor
    //   757: goto -> 767
    //   760: ldc2_w 421830484
    //   763: l2i
    //   764: ldc 316676621
    //   766: ixor
    //   767: ldc2_w 1418134127
    //   770: l2i
    //   771: ldc 1267139185
    //   773: ixor
    //   774: ixor
    //   775: lookupswitch default -> 800, 322666819 -> 760, 996677538 -> 1066
    //   800: putfield TPS : F
    //   803: getstatic Perryc.0 : I
    //   806: ifle -> 819
    //   809: ldc2_w 680355426
    //   812: l2i
    //   813: ldc 2129662553
    //   815: ixor
    //   816: goto -> 826
    //   819: ldc2_w -2009043072
    //   822: l2i
    //   823: ldc -426159171
    //   825: ixor
    //   826: ldc2_w -566909074
    //   829: l2i
    //   830: ldc 1192567983
    //   832: ixor
    //   833: ixor
    //   834: lookupswitch default -> 860, -1615610957 -> 819, -815925254 -> 1054
    //   860: aload_0
    //   861: ldc -2032611006
    //   863: i2l
    //   864: ldc2_w 2032611005
    //   867: lxor
    //   868: getstatic Perryc.c : I
    //   871: iflt -> 884
    //   874: ldc2_w 1900241302
    //   877: l2i
    //   878: ldc 1045826567
    //   880: ixor
    //   881: goto -> 891
    //   884: ldc2_w -281596053
    //   887: l2i
    //   888: ldc -1170078305
    //   890: ixor
    //   891: ldc2_w -684072501
    //   894: l2i
    //   895: ldc 1234851338
    //   897: ixor
    //   898: ixor
    //   899: lookupswitch default -> 924, -924316064 -> 884, -776545712 -> 1062
    //   924: putfield lastUpdate : J
    //   927: getstatic Perryc.0 : I
    //   930: ifle -> 943
    //   933: ldc2_w 1869860543
    //   936: l2i
    //   937: ldc -740166740
    //   939: ixor
    //   940: goto -> 950
    //   943: ldc2_w -287212199
    //   946: l2i
    //   947: ldc -2080272409
    //   949: ixor
    //   950: ldc2_w -1009659119
    //   953: l2i
    //   954: ldc 115081093
    //   956: ixor
    //   957: ixor
    //   958: lookupswitch default -> 984, 1026190590 -> 943, 2040009095 -> 1074
    //   984: aload_0
    //   985: ldc ''
    //   987: getstatic Perryc.1 : I
    //   990: ifeq -> 1003
    //   993: ldc2_w -883719624
    //   996: l2i
    //   997: ldc 2055223959
    //   999: ixor
    //   1000: goto -> 1010
    //   1003: ldc2_w 1955854333
    //   1006: l2i
    //   1007: ldc 1213692378
    //   1009: ixor
    //   1010: ldc2_w 1633105230
    //   1013: l2i
    //   1014: ldc -760396278
    //   1016: ixor
    //   1017: ixor
    //   1018: lookupswitch default -> 1044, -892941044 -> 1003, 36293611 -> 1080
    //   1044: putfield serverBrand : Ljava/lang/String;
    //   1047: return
    //   1048: aconst_null
    //   1049: athrow
    //   1050: aconst_null
    //   1051: athrow
    //   1052: aconst_null
    //   1053: athrow
    //   1054: aconst_null
    //   1055: athrow
    //   1056: aconst_null
    //   1057: athrow
    //   1058: aconst_null
    //   1059: athrow
    //   1060: aconst_null
    //   1061: athrow
    //   1062: aconst_null
    //   1063: athrow
    //   1064: aconst_null
    //   1065: athrow
    //   1066: aconst_null
    //   1067: athrow
    //   1068: aconst_null
    //   1069: athrow
    //   1070: aconst_null
    //   1071: athrow
    //   1072: aconst_null
    //   1073: athrow
    //   1074: aconst_null
    //   1075: athrow
    //   1076: aconst_null
    //   1077: athrow
    //   1078: aconst_null
    //   1079: athrow
    //   1080: aconst_null
    //   1081: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1048	0	this	Lbigname/zprestige/webhack/manager/ServerManager;
  }
  
  public float getTPS() {
    return Perry1.2O(this, (int)955699397L ^ 0x389763D0);
  }
  
  public void reset() {
    Perry1.49(this, (int)-930787231L ^ 0xACE55B11);
  }
  
  public String getServerBrand() {
    return Perry1.n(this, (int)1650197864L ^ 0x73FC4FAE);
  }
  
  public int getPing() {
    return Perry1.37(this, (int)-831357305L ^ 0x817BEC01);
  }
  
  public void update() {
    Perry1.42(this, (int)620911798L ^ 0x1FF830F1);
  }
  
  public void onPacketReceived() {
    Perry1.3U(this, (int)1186280335L ^ 0x1D285CBA);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public float getTpsFactor() {
    return Perry1.2P(this, (int)2041542559L ^ 0x45C60860);
  }
  
  public void setServerBrand(String paramString) {
    Perry1.1d(this, (int)389097373L ^ 0x656E5820, paramString);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\ServerManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */