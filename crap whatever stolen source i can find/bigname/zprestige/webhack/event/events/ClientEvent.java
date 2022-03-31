package bigname.zprestige.webhack.event.events;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.EventStage;
import bigname.zprestige.webhack.features.Feature;
import bigname.zprestige.webhack.features.setting.Setting;
import net.minecraftforge.fml.common.eventhandler.Cancelable;

@Cancelable
public class ClientEvent extends EventStage {
  public Feature feature;
  
  public Setting setting;
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public ClientEvent(int stage, Feature feature) {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 40483977
    //   9: l2i
    //   10: ldc 865355802
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 8756950
    //   19: l2i
    //   20: ldc -2123995457
    //   22: ixor
    //   23: ldc2_w 1821482931
    //   26: l2i
    //   27: ldc 89867971
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 370, -399957735 -> 56, 1480011235 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.0 : I
    //   60: ifle -> 73
    //   63: ldc2_w 641255598
    //   66: l2i
    //   67: ldc -1351607738
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -405820360
    //   76: l2i
    //   77: ldc -780703327
    //   79: ixor
    //   80: ldc2_w -1554059033
    //   83: l2i
    //   84: ldc -290894014
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 366, -994087603 -> 73, 2068806204 -> 116
    //   116: iload_1
    //   117: getstatic Perryc.0 : I
    //   120: ifle -> 133
    //   123: ldc2_w 685442986
    //   126: l2i
    //   127: ldc 766184800
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w -1353071769
    //   136: l2i
    //   137: ldc 1388148020
    //   139: ixor
    //   140: ldc2_w 2115294924
    //   143: l2i
    //   144: ldc -1243413814
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 362, -829956404 -> 133, 907240021 -> 176
    //   176: invokespecial <init> : (I)V
    //   179: getstatic Perryc.1 : I
    //   182: ifeq -> 195
    //   185: ldc2_w 1284517473
    //   188: l2i
    //   189: ldc -581453048
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w 1511438027
    //   198: l2i
    //   199: ldc -379187373
    //   201: ixor
    //   202: ldc2_w -1634404285
    //   205: l2i
    //   206: ldc -1309346400
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 236, -1096312694 -> 360, 2078721430 -> 195
    //   236: aload_0
    //   237: getstatic Perryc.c : I
    //   240: iflt -> 253
    //   243: ldc2_w -1292794305
    //   246: l2i
    //   247: ldc -2049888972
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w 865842782
    //   256: l2i
    //   257: ldc 1527878841
    //   259: ixor
    //   260: ldc2_w -578248367
    //   263: l2i
    //   264: ldc 430532225
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 368, -1398020809 -> 296, -218010405 -> 253
    //   296: aload_2
    //   297: getstatic Perryc.1 : I
    //   300: ifeq -> 313
    //   303: ldc2_w -415478454
    //   306: l2i
    //   307: ldc -214717058
    //   309: ixor
    //   310: goto -> 320
    //   313: ldc2_w -1405617214
    //   316: l2i
    //   317: ldc 1331374620
    //   319: ixor
    //   320: ldc2_w -239624476
    //   323: l2i
    //   324: ldc 1809601901
    //   326: ixor
    //   327: ixor
    //   328: lookupswitch default -> 364, -1906037827 -> 313, 2030508631 -> 356
    //   356: putfield feature : Lbigname/zprestige/webhack/features/Feature;
    //   359: return
    //   360: aconst_null
    //   361: athrow
    //   362: aconst_null
    //   363: athrow
    //   364: aconst_null
    //   365: athrow
    //   366: aconst_null
    //   367: athrow
    //   368: aconst_null
    //   369: athrow
    //   370: aconst_null
    //   371: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	360	0	this	Lbigname/zprestige/webhack/event/events/ClientEvent;
    //   0	360	1	stage	I
    //   0	360	2	feature	Lbigname/zprestige/webhack/features/Feature;
  }
  
  public Setting getSetting() {
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
  
  public Feature getFeature() {
    return Perry1.1k(this, (int)-1949037433L ^ 0xF8F062F6);
  }
  
  public ClientEvent(Setting setting) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w -1702627565
    //   9: l2i
    //   10: ldc -1897136797
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 90262438
    //   19: l2i
    //   20: ldc 836143511
    //   22: ixor
    //   23: ldc2_w -828233626
    //   26: l2i
    //   27: ldc 2141556296
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 56, -2139933367 -> 16, -1519408034 -> 308
    //   56: aload_0
    //   57: ldc2_w 1728916081
    //   60: l2i
    //   61: ldc 1728916083
    //   63: ixor
    //   64: getstatic Perryc.0 : I
    //   67: ifle -> 80
    //   70: ldc2_w 881322515
    //   73: l2i
    //   74: ldc 1575341732
    //   76: ixor
    //   77: goto -> 87
    //   80: ldc2_w 1347782336
    //   83: l2i
    //   84: ldc -1696611866
    //   86: ixor
    //   87: ldc2_w 2114408689
    //   90: l2i
    //   91: ldc 589209436
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, 294129700 -> 80, 880536346 -> 310
    //   120: invokespecial <init> : (I)V
    //   123: getstatic Perryc.0 : I
    //   126: ifle -> 139
    //   129: ldc2_w -2141737464
    //   132: l2i
    //   133: ldc -1142490978
    //   135: ixor
    //   136: goto -> 146
    //   139: ldc2_w -1397140839
    //   142: l2i
    //   143: ldc -585331348
    //   145: ixor
    //   146: ldc2_w 1379759101
    //   149: l2i
    //   150: ldc 2135488641
    //   152: ixor
    //   153: ixor
    //   154: lookupswitch default -> 180, -60148216 -> 139, 382000618 -> 306
    //   180: aload_0
    //   181: getstatic Perryc.0 : I
    //   184: ifle -> 197
    //   187: ldc2_w 2021557859
    //   190: l2i
    //   191: ldc 921750921
    //   193: ixor
    //   194: goto -> 204
    //   197: ldc2_w -1099988434
    //   200: l2i
    //   201: ldc -611849132
    //   203: ixor
    //   204: ldc2_w 1099578533
    //   207: l2i
    //   208: ldc 1047551275
    //   210: ixor
    //   211: ixor
    //   212: lookupswitch default -> 312, 437391348 -> 240, 829696612 -> 197
    //   240: aload_1
    //   241: getstatic Perryc.c : I
    //   244: iflt -> 257
    //   247: ldc2_w -172907598
    //   250: l2i
    //   251: ldc 249222086
    //   253: ixor
    //   254: goto -> 264
    //   257: ldc2_w -1902292486
    //   260: l2i
    //   261: ldc -609993615
    //   263: ixor
    //   264: ldc2_w 1357333320
    //   267: l2i
    //   268: ldc 992819647
    //   270: ixor
    //   271: ixor
    //   272: lookupswitch default -> 304, -1868494205 -> 257, 1056118652 -> 300
    //   300: putfield setting : Lbigname/zprestige/webhack/features/setting/Setting;
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
    //   0	304	0	this	Lbigname/zprestige/webhack/event/events/ClientEvent;
    //   0	304	1	setting	Lbigname/zprestige/webhack/features/setting/Setting;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\ClientEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */