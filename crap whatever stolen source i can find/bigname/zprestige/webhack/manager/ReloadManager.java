package bigname.zprestige.webhack.manager;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.PacketEvent;
import bigname.zprestige.webhack.features.Feature;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ReloadManager extends Feature {
  public String prefix;
  
  public void unload() {
    Perry1.3v(this, (int)-996421951L ^ 0xF5EF091F);
  }
  
  @SubscribeEvent
  public void onPacketSend(PacketEvent.Send paramSend) {
    Perry1.67(this, (int)-1013243696L ^ 0xA3D31D9C, paramSend);
  }
  
  public void init(String prefix) {
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
  
  public ReloadManager() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w -630558337
    //   9: l2i
    //   10: ldc_w 15696791
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -466257070
    //   20: l2i
    //   21: ldc_w -1701380963
    //   24: ixor
    //   25: ldc2_w 1495628656
    //   28: l2i
    //   29: ldc_w -1311625986
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1714774728 -> 17, 846374246 -> 126
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w -1185059184
    //   70: l2i
    //   71: ldc_w -289354938
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w -1063142446
    //   81: l2i
    //   82: ldc_w -2125183257
    //   85: ixor
    //   86: ldc2_w 36992718
    //   89: l2i
    //   90: ldc_w -1946863147
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 124, -936070610 -> 120, -564335923 -> 78
    //   120: invokespecial <init> : ()V
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	124	0	this	Lbigname/zprestige/webhack/manager/ReloadManager;
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\ReloadManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */