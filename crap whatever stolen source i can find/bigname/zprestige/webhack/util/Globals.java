package bigname.zprestige.webhack.util;

import Perry1;
import java.util.Random;
import net.minecraft.client.Minecraft;

public interface Globals {
  public static final char SECTIONSIGN = (int)-1951547013L ^ 0x8BADC1DC;
  
  public static final Minecraft mc = Minecraft.func_71410_x();
  
  public static final Random random = new Random();
  
  default boolean nullCheck() {
    return Perry1.4l(this, (int)-1902044595L ^ 0xBCCD616A);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\Globals.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */