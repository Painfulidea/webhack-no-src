package bigname.zprestige.webhack.util;

import Perry1;
import Perryc;
import java.util.UUID;

public class PlayerUtil$lookUpName implements Runnable {
  public UUID uuidID;
  
  public String name;
  
  public String uuid;
  
  public void run() {
    Perry1.3E(this, (int)2058752146L ^ 0xE65DE96);
  }
  
  public String lookUpName() {
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
  
  public String getName() {
    return Perry1.7(this, (int)292011427L ^ 0x331A4601);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public PlayerUtil$lookUpName(UUID input) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w 1081797997
    //   9: l2i
    //   10: ldc_w -52420669
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1644874050
    //   20: l2i
    //   21: ldc_w 1492159728
    //   24: ixor
    //   25: ldc2_w -1297117036
    //   28: l2i
    //   29: ldc_w 1151684790
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 566, 856652396 -> 60, 1250964108 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.c : I
    //   64: iflt -> 78
    //   67: ldc2_w 171649837
    //   70: l2i
    //   71: ldc_w 2027534691
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1895576017
    //   81: l2i
    //   82: ldc_w -1867335646
    //   85: ixor
    //   86: ldc2_w 2034222953
    //   89: l2i
    //   90: ldc_w 641198397
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 570, 770358298 -> 78, 1085888601 -> 120
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 140
    //   129: ldc2_w -1635332668
    //   132: l2i
    //   133: ldc_w 1692393090
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w -1449435881
    //   143: l2i
    //   144: ldc_w 94461050
    //   147: ixor
    //   148: ldc2_w -118446808
    //   151: l2i
    //   152: ldc_w 33679394
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 556, 11034188 -> 140, 1456163943 -> 184
    //   184: aload_0
    //   185: getstatic Perryc.1 : I
    //   188: ifeq -> 202
    //   191: ldc2_w 1851192239
    //   194: l2i
    //   195: ldc_w 1477117327
    //   198: ixor
    //   199: goto -> 210
    //   202: ldc2_w -984776066
    //   205: l2i
    //   206: ldc_w 401773097
    //   209: ixor
    //   210: ldc2_w 2029048845
    //   213: l2i
    //   214: ldc_w -1268379066
    //   217: ixor
    //   218: ixor
    //   219: lookupswitch default -> 244, -261081833 -> 202, -87347093 -> 562
    //   244: aload_1
    //   245: getstatic Perryc.0 : I
    //   248: ifle -> 262
    //   251: ldc2_w 677086104
    //   254: l2i
    //   255: ldc_w -503464161
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w 1453302778
    //   265: l2i
    //   266: ldc_w 638733410
    //   269: ixor
    //   270: ldc2_w 1131236753
    //   273: l2i
    //   274: ldc_w -718369280
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 568, -422695927 -> 304, 1608908566 -> 262
    //   304: putfield uuidID : Ljava/util/UUID;
    //   307: getstatic Perryc.1 : I
    //   310: ifeq -> 324
    //   313: ldc2_w 1005425452
    //   316: l2i
    //   317: ldc_w 1130176001
    //   320: ixor
    //   321: goto -> 332
    //   324: ldc2_w 1928417340
    //   327: l2i
    //   328: ldc_w -1136917334
    //   331: ixor
    //   332: ldc2_w 965538469
    //   335: l2i
    //   336: ldc_w -147255250
    //   339: ixor
    //   340: ixor
    //   341: lookupswitch default -> 558, -1241157722 -> 324, 7910941 -> 368
    //   368: aload_0
    //   369: getstatic Perryc.1 : I
    //   372: ifeq -> 386
    //   375: ldc2_w -622543320
    //   378: l2i
    //   379: ldc_w 1655423914
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w -809182007
    //   389: l2i
    //   390: ldc_w -858213107
    //   393: ixor
    //   394: ldc2_w 514233399
    //   397: l2i
    //   398: ldc_w 2029931093
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 572, -568876064 -> 386, 1699002278 -> 428
    //   428: aload_1
    //   429: getstatic Perryc.1 : I
    //   432: ifeq -> 446
    //   435: ldc2_w -1404076565
    //   438: l2i
    //   439: ldc_w -413050460
    //   442: ixor
    //   443: goto -> 454
    //   446: ldc2_w -556156654
    //   449: l2i
    //   450: ldc_w -2134001868
    //   453: ixor
    //   454: ldc2_w 378012253
    //   457: l2i
    //   458: ldc_w -1960749173
    //   461: ixor
    //   462: ixor
    //   463: lookupswitch default -> 560, -1011000336 -> 488, -695766631 -> 446
    //   488: invokevirtual toString : ()Ljava/lang/String;
    //   491: getstatic Perryc.1 : I
    //   494: ifeq -> 508
    //   497: ldc2_w 203309087
    //   500: l2i
    //   501: ldc_w -1013574974
    //   504: ixor
    //   505: goto -> 516
    //   508: ldc2_w -627218171
    //   511: l2i
    //   512: ldc_w -1072292947
    //   515: ixor
    //   516: ldc2_w -2131359683
    //   519: l2i
    //   520: ldc_w 72880853
    //   523: ixor
    //   524: ixor
    //   525: lookupswitch default -> 564, -1641715648 -> 552, 1260800053 -> 508
    //   552: putfield uuid : Ljava/lang/String;
    //   555: return
    //   556: aconst_null
    //   557: athrow
    //   558: aconst_null
    //   559: athrow
    //   560: aconst_null
    //   561: athrow
    //   562: aconst_null
    //   563: athrow
    //   564: aconst_null
    //   565: athrow
    //   566: aconst_null
    //   567: athrow
    //   568: aconst_null
    //   569: athrow
    //   570: aconst_null
    //   571: athrow
    //   572: aconst_null
    //   573: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	556	0	this	Lbigname/zprestige/webhack/util/PlayerUtil$lookUpName;
    //   0	556	1	input	Ljava/util/UUID;
  }
  
  public PlayerUtil$lookUpName(String input) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 17
    //   6: ldc2_w -321374535
    //   9: l2i
    //   10: ldc_w -799261895
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1389139898
    //   20: l2i
    //   21: ldc_w -1032244965
    //   24: ixor
    //   25: ldc2_w 2032341070
    //   28: l2i
    //   29: ldc_w 350344602
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 558, 42507401 -> 60, 1363593300 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.c : I
    //   64: iflt -> 78
    //   67: ldc2_w -1547536881
    //   70: l2i
    //   71: ldc_w 1564162660
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1677561251
    //   81: l2i
    //   82: ldc_w 1836093664
    //   85: ixor
    //   86: ldc2_w 1258280756
    //   89: l2i
    //   90: ldc_w -1703447162
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, 779218649 -> 564, 792948393 -> 78
    //   120: invokespecial <init> : ()V
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 140
    //   129: ldc2_w 136991292
    //   132: l2i
    //   133: ldc_w -1719989000
    //   136: ixor
    //   137: goto -> 148
    //   140: ldc2_w 1387170654
    //   143: l2i
    //   144: ldc_w 1684806287
    //   147: ixor
    //   148: ldc2_w 443989094
    //   151: l2i
    //   152: ldc_w 1984481296
    //   155: ixor
    //   156: ixor
    //   157: lookupswitch default -> 560, -43046222 -> 140, 1526523303 -> 184
    //   184: aload_0
    //   185: getstatic Perryc.1 : I
    //   188: ifeq -> 202
    //   191: ldc2_w 1781779380
    //   194: l2i
    //   195: ldc_w -677096938
    //   198: ixor
    //   199: goto -> 210
    //   202: ldc2_w 1234402377
    //   205: l2i
    //   206: ldc_w 1778361585
    //   209: ixor
    //   210: ldc2_w -2000352182
    //   213: l2i
    //   214: ldc_w -1028784854
    //   217: ixor
    //   218: ixor
    //   219: lookupswitch default -> 244, -134256446 -> 570, 1653660173 -> 202
    //   244: aload_1
    //   245: getstatic Perryc.c : I
    //   248: iflt -> 262
    //   251: ldc2_w 1352549373
    //   254: l2i
    //   255: ldc_w 699280876
    //   258: ixor
    //   259: goto -> 270
    //   262: ldc2_w 1393661400
    //   265: l2i
    //   266: ldc_w -274295184
    //   269: ixor
    //   270: ldc2_w -1882999195
    //   273: l2i
    //   274: ldc_w -1387746533
    //   277: ixor
    //   278: ixor
    //   279: lookupswitch default -> 304, -1302160147 -> 262, 1539011439 -> 556
    //   304: putfield uuid : Ljava/lang/String;
    //   307: getstatic Perryc.c : I
    //   310: iflt -> 324
    //   313: ldc2_w -1690903209
    //   316: l2i
    //   317: ldc_w 979850107
    //   320: ixor
    //   321: goto -> 332
    //   324: ldc2_w 1883259912
    //   327: l2i
    //   328: ldc_w 2147465767
    //   331: ixor
    //   332: ldc2_w -1562517473
    //   335: l2i
    //   336: ldc_w 1167001507
    //   339: ixor
    //   340: ixor
    //   341: lookupswitch default -> 566, -387114605 -> 368, 1174628752 -> 324
    //   368: aload_0
    //   369: getstatic Perryc.1 : I
    //   372: ifeq -> 386
    //   375: ldc2_w 749005930
    //   378: l2i
    //   379: ldc_w -453692233
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w -559448758
    //   389: l2i
    //   390: ldc_w 1879916583
    //   393: ixor
    //   394: ldc2_w 1448253780
    //   397: l2i
    //   398: ldc_w -1005419538
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 428, 1183320143 -> 386, 1511113319 -> 568
    //   428: aload_1
    //   429: getstatic Perryc.0 : I
    //   432: ifle -> 446
    //   435: ldc2_w 508396216
    //   438: l2i
    //   439: ldc_w 1393864162
    //   442: ixor
    //   443: goto -> 454
    //   446: ldc2_w -1405741982
    //   449: l2i
    //   450: ldc_w -130761957
    //   453: ixor
    //   454: ldc2_w -707123427
    //   457: l2i
    //   458: ldc_w -1725063263
    //   461: ixor
    //   462: ixor
    //   463: lookupswitch default -> 488, -86069581 -> 446, 28219366 -> 572
    //   488: invokestatic fromString : (Ljava/lang/String;)Ljava/util/UUID;
    //   491: getstatic Perryc.1 : I
    //   494: ifeq -> 508
    //   497: ldc2_w 1078306370
    //   500: l2i
    //   501: ldc_w 2008286721
    //   504: ixor
    //   505: goto -> 516
    //   508: ldc2_w -1953398832
    //   511: l2i
    //   512: ldc_w -806223674
    //   515: ixor
    //   516: ldc2_w -1073945814
    //   519: l2i
    //   520: ldc_w -1271971423
    //   523: ixor
    //   524: ixor
    //   525: lookupswitch default -> 552, -1006176062 -> 508, 1008861896 -> 562
    //   552: putfield uuidID : Ljava/util/UUID;
    //   555: return
    //   556: aconst_null
    //   557: athrow
    //   558: aconst_null
    //   559: athrow
    //   560: aconst_null
    //   561: athrow
    //   562: aconst_null
    //   563: athrow
    //   564: aconst_null
    //   565: athrow
    //   566: aconst_null
    //   567: athrow
    //   568: aconst_null
    //   569: athrow
    //   570: aconst_null
    //   571: athrow
    //   572: aconst_null
    //   573: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	556	0	this	Lbigname/zprestige/webhack/util/PlayerUtil$lookUpName;
    //   0	556	1	input	Ljava/lang/String;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\PlayerUtil$lookUpName.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */