package bigname.zprestige.webhack.manager.Identity;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public interface UtilTwo$ConnectionFactory {
  public static final UtilTwo$ConnectionFactory DEFAULT = new UtilTwo$ConnectionFactory$1();
  
  HttpURLConnection create(URL paramURL);
  
  HttpURLConnection create(URL paramURL, Proxy paramProxy);
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\Identity\UtilTwo$ConnectionFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */