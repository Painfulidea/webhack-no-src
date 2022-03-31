package bigname.zprestige.webhack.features.gui.components.items.buttons;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.setting.Setting;

public class BooleanButton extends Button {
  public Setting setting;
  
  public void toggle() {
    Perry1.3H(this, (int)703899043L ^ 0x2820892F);
  }
  
  public boolean getState() {
    return Perry1.4F(this, (int)-1423399268L ^ 0x8741C89F);
  }
  
  public void drawScreen(int mouseX, int mouseY, float partialTicks) {
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
  
  public int getHeight() {
    return Perry1.2U(this, (int)-612916091L ^ 0x9E709173);
  }
  
  public BooleanButton(Setting setting) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w 552241498
    //   9: l2i
    //   10: ldc_w 1951735366
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w 1853587815
    //   20: l2i
    //   21: ldc_w 126233524
    //   24: ixor
    //   25: ldc2_w 2037534640
    //   28: l2i
    //   29: ldc_w -237198005
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -884675945 -> 17, -602833433 -> 572
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w 424158759
    //   70: l2i
    //   71: ldc_w 1645673141
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1220265568
    //   81: l2i
    //   82: ldc_w -2093866859
    //   85: ixor
    //   86: ldc2_w 737417763
    //   89: l2i
    //   90: ldc_w 510453813
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 568, 32434979 -> 120, 1321610884 -> 78
    //   120: aload_1
    //   121: getstatic Perryc.c : I
    //   124: iflt -> 138
    //   127: ldc2_w -1852366361
    //   130: l2i
    //   131: ldc_w -722731870
    //   134: ixor
    //   135: goto -> 146
    //   138: ldc2_w -1278408446
    //   141: l2i
    //   142: ldc_w -464961910
    //   145: ixor
    //   146: ldc2_w -1255685682
    //   149: l2i
    //   150: ldc_w -1112203083
    //   153: ixor
    //   154: ixor
    //   155: lookupswitch default -> 578, 1307458622 -> 138, 1595332339 -> 180
    //   180: invokevirtual getName : ()Ljava/lang/String;
    //   183: getstatic Perryc.1 : I
    //   186: ifeq -> 200
    //   189: ldc2_w 1689091787
    //   192: l2i
    //   193: ldc_w -351040241
    //   196: ixor
    //   197: goto -> 208
    //   200: ldc2_w -1485974404
    //   203: l2i
    //   204: ldc_w 411002592
    //   207: ixor
    //   208: ldc2_w 1305218628
    //   211: l2i
    //   212: ldc_w 1518759978
    //   215: ixor
    //   216: ixor
    //   217: lookupswitch default -> 564, -1728803414 -> 200, -1470575374 -> 244
    //   244: invokespecial <init> : (Ljava/lang/String;)V
    //   247: getstatic Perryc.0 : I
    //   250: ifle -> 264
    //   253: ldc2_w -1537606851
    //   256: l2i
    //   257: ldc_w -1887062468
    //   260: ixor
    //   261: goto -> 272
    //   264: ldc2_w 1406320276
    //   267: l2i
    //   268: ldc_w -505796268
    //   271: ixor
    //   272: ldc2_w -988391145
    //   275: l2i
    //   276: ldc_w -1501405365
    //   279: ixor
    //   280: ixor
    //   281: lookupswitch default -> 308, -1990134583 -> 264, 1212697437 -> 580
    //   308: aload_0
    //   309: getstatic Perryc.c : I
    //   312: iflt -> 326
    //   315: ldc2_w 978286316
    //   318: l2i
    //   319: ldc_w -1300731869
    //   322: ixor
    //   323: goto -> 334
    //   326: ldc2_w 2014236634
    //   329: l2i
    //   330: ldc_w -313344435
    //   333: ixor
    //   334: ldc2_w 40580017
    //   337: l2i
    //   338: ldc_w 603626430
    //   341: ixor
    //   342: ixor
    //   343: lookupswitch default -> 368, -1448692032 -> 570, 1007977199 -> 326
    //   368: aload_1
    //   369: getstatic Perryc.0 : I
    //   372: ifle -> 386
    //   375: ldc2_w -1715026953
    //   378: l2i
    //   379: ldc_w 1605820805
    //   382: ixor
    //   383: goto -> 394
    //   386: ldc2_w 895651676
    //   389: l2i
    //   390: ldc_w 1678777956
    //   393: ixor
    //   394: ldc2_w 1306807316
    //   397: l2i
    //   398: ldc_w -332122120
    //   401: ixor
    //   402: ixor
    //   403: lookupswitch default -> 428, 1738561950 -> 566, 1956168961 -> 386
    //   428: putfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
    //   431: getstatic Perryc.1 : I
    //   434: ifeq -> 448
    //   437: ldc2_w -1853163123
    //   440: l2i
    //   441: ldc_w -449248242
    //   444: ixor
    //   445: goto -> 456
    //   448: ldc2_w 1192753444
    //   451: l2i
    //   452: ldc_w 601961277
    //   455: ixor
    //   456: ldc2_w 1187113338
    //   459: l2i
    //   460: ldc_w 331415693
    //   463: ixor
    //   464: ixor
    //   465: lookupswitch default -> 576, 565384308 -> 448, 838214638 -> 492
    //   492: aload_0
    //   493: ldc2_w 1135575675
    //   496: l2i
    //   497: ldc_w 1135575668
    //   500: ixor
    //   501: getstatic Perryc.1 : I
    //   504: ifeq -> 518
    //   507: ldc2_w -419050957
    //   510: l2i
    //   511: ldc_w 99819644
    //   514: ixor
    //   515: goto -> 526
    //   518: ldc2_w 891857490
    //   521: l2i
    //   522: ldc_w 1769441640
    //   525: ixor
    //   526: ldc2_w -338480579
    //   529: l2i
    //   530: ldc_w -328140818
    //   533: ixor
    //   534: ixor
    //   535: lookupswitch default -> 574, -447402084 -> 518, 1543300841 -> 560
    //   560: putfield width : I
    //   563: return
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
    //   574: aconst_null
    //   575: athrow
    //   576: aconst_null
    //   577: athrow
    //   578: aconst_null
    //   579: athrow
    //   580: aconst_null
    //   581: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	564	0	this	Lbigname/zprestige/webhack/features/gui/components/items/buttons/BooleanButton;
    //   0	564	1	setting	Lbigname/zprestige/webhack/features/setting/Setting;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void mouseClicked(int mouseX, int mouseY, int mouseButton) {
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
  
  public void update() {
    Perry1.3h(this, (int)1332995246L ^ 0x3AA9DC07);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\gui\components\items\buttons\BooleanButton.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */