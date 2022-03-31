package bigname.zprestige.webhack;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.manager.ColorManager;
import bigname.zprestige.webhack.manager.CommandManager;
import bigname.zprestige.webhack.manager.ConfigManager;
import bigname.zprestige.webhack.manager.EventManager;
import bigname.zprestige.webhack.manager.FileManager;
import bigname.zprestige.webhack.manager.FriendManager;
import bigname.zprestige.webhack.manager.HoleManager;
import bigname.zprestige.webhack.manager.Identity.IdentityManager;
import bigname.zprestige.webhack.manager.InventoryManager;
import bigname.zprestige.webhack.manager.ModuleManager;
import bigname.zprestige.webhack.manager.PacketManager;
import bigname.zprestige.webhack.manager.PositionManager;
import bigname.zprestige.webhack.manager.PotionManager;
import bigname.zprestige.webhack.manager.ReloadManager;
import bigname.zprestige.webhack.manager.RotationManager;
import bigname.zprestige.webhack.manager.ServerManager;
import bigname.zprestige.webhack.manager.SpeedManager;
import bigname.zprestige.webhack.manager.TextManager;
import bigname.zprestige.webhack.manager.TotemPopManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = "webhack", name = "WebHack", version = "0.8")
public class WebHack {
  public static TextManager textManager;
  
  public static ModuleManager moduleManager;
  
  public static EventManager eventManager;
  
  public static HoleManager holeManager;
  
  public static IdentityManager identityManager;
  
  public static FileManager fileManager;
  
  public static String MODID;
  
  public static String MODNAME;
  
  public static RotationManager rotationManager;
  
  public static SpeedManager speedManager;
  
  public static ConfigManager configManager;
  
  public static boolean unloaded;
  
  public static ReloadManager reloadManager;
  
  public static Logger LOGGER;
  
  public static FriendManager friendManager;
  
  public static ServerManager serverManager;
  
  public static InventoryManager inventoryManager;
  
  public static TotemPopManager totemPopManager;
  
  @Instance
  public static WebHack INSTANCE;
  
  public static PositionManager positionManager;
  
  public static PotionManager potionManager;
  
  public static PacketManager packetManager;
  
  public static CommandManager commandManager;
  
  public static String MODVER;
  
  public static ColorManager colorManager;
  
  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
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
  
  public WebHack() {
    // Byte code:
    //   0: getstatic Perryc.1 : I
    //   3: ifeq -> 16
    //   6: ldc2_w 1621770908
    //   9: l2i
    //   10: ldc 345894829
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -1918839561
    //   19: l2i
    //   20: ldc 1671793093
    //   22: ixor
    //   23: ldc2_w 1033630614
    //   26: l2i
    //   27: ldc 1060214182
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 120, -324060414 -> 56, 1990052609 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.1 : I
    //   60: ifeq -> 73
    //   63: ldc2_w 60829565
    //   66: l2i
    //   67: ldc 387178024
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -39571221
    //   76: l2i
    //   77: ldc 989162942
    //   79: ixor
    //   80: ldc2_w 180563777
    //   83: l2i
    //   84: ldc 282140960
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 122, -582790348 -> 116, 245497652 -> 73
    //   116: invokespecial <init> : ()V
    //   119: return
    //   120: aconst_null
    //   121: athrow
    //   122: aconst_null
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	120	0	this	Lbigname/zprestige/webhack/WebHack;
  }
  
  public static void unload(boolean unload) {
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
  
  @EventHandler
  public void Starting(FMLInitializationEvent event) {
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
  
  public static void copyToClipboard() {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 733
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 725
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 717
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: new java/awt/datatransfer/StringSelection
    //   27: dup
    //   28: getstatic Perryc.1 : I
    //   31: ifeq -> 45
    //   34: ldc2_w -1746334951
    //   37: l2i
    //   38: ldc_w 662034098
    //   41: ixor
    //   42: goto -> 53
    //   45: ldc2_w 1497651077
    //   48: l2i
    //   49: ldc_w -1733065962
    //   52: ixor
    //   53: ldc2_w 556221648
    //   56: l2i
    //   57: ldc_w 527204680
    //   60: ixor
    //   61: ixor
    //   62: lookupswitch default -> 88, -1898506189 -> 702, 556117548 -> 45
    //   88: goto -> 92
    //   91: athrow
    //   92: invokestatic getBlock : ()Ljava/lang/String;
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.0 : I
    //   102: ifle -> 116
    //   105: ldc2_w -93756067
    //   108: l2i
    //   109: ldc_w -1416894067
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w 2011540153
    //   119: l2i
    //   120: ldc_w 26910084
    //   123: ixor
    //   124: ldc2_w -1880964640
    //   127: l2i
    //   128: ldc_w -1918581408
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 160, -904952786 -> 116, 1403291728 -> 688
    //   160: goto -> 164
    //   163: athrow
    //   164: invokespecial <init> : (Ljava/lang/String;)V
    //   167: goto -> 171
    //   170: athrow
    //   171: getstatic Perryc.1 : I
    //   174: ifeq -> 188
    //   177: ldc2_w 152682916
    //   180: l2i
    //   181: ldc_w 607280503
    //   184: ixor
    //   185: goto -> 196
    //   188: ldc2_w 1772714529
    //   191: l2i
    //   192: ldc_w -1554927721
    //   195: ixor
    //   196: ldc2_w -173524997
    //   199: l2i
    //   200: ldc_w 823539941
    //   203: ixor
    //   204: ixor
    //   205: lookupswitch default -> 232, -376073267 -> 698, 810231863 -> 188
    //   232: astore_0
    //   233: getstatic Perryc.0 : I
    //   236: ifle -> 250
    //   239: ldc2_w 979028321
    //   242: l2i
    //   243: ldc_w 921330959
    //   246: ixor
    //   247: goto -> 258
    //   250: ldc2_w 387906933
    //   253: l2i
    //   254: ldc_w 509558619
    //   257: ixor
    //   258: ldc2_w 1962173363
    //   261: l2i
    //   262: ldc_w 2072438142
    //   265: ixor
    //   266: ixor
    //   267: lookupswitch default -> 690, 63056547 -> 250, 104023267 -> 292
    //   292: goto -> 296
    //   295: athrow
    //   296: invokestatic getDefaultToolkit : ()Ljava/awt/Toolkit;
    //   299: goto -> 303
    //   302: athrow
    //   303: getstatic Perryc.0 : I
    //   306: ifle -> 320
    //   309: ldc2_w -375369313
    //   312: l2i
    //   313: ldc_w 1633642452
    //   316: ixor
    //   317: goto -> 328
    //   320: ldc2_w 653920222
    //   323: l2i
    //   324: ldc_w 1194520938
    //   327: ixor
    //   328: ldc2_w -549399560
    //   331: l2i
    //   332: ldc_w 944578549
    //   335: ixor
    //   336: ixor
    //   337: lookupswitch default -> 364, -1016894418 -> 320, 1878194758 -> 704
    //   364: goto -> 368
    //   367: athrow
    //   368: invokevirtual getSystemClipboard : ()Ljava/awt/datatransfer/Clipboard;
    //   371: goto -> 375
    //   374: athrow
    //   375: getstatic Perryc.1 : I
    //   378: ifeq -> 392
    //   381: ldc2_w 471781531
    //   384: l2i
    //   385: ldc_w 2064416150
    //   388: ixor
    //   389: goto -> 400
    //   392: ldc2_w 198069213
    //   395: l2i
    //   396: ldc_w -880000504
    //   399: ixor
    //   400: ldc2_w 1666511196
    //   403: l2i
    //   404: ldc_w -689378786
    //   407: ixor
    //   408: ixor
    //   409: lookupswitch default -> 436, -760302001 -> 700, 2005418762 -> 392
    //   436: astore_1
    //   437: getstatic Perryc.c : I
    //   440: iflt -> 454
    //   443: ldc2_w -1661947518
    //   446: l2i
    //   447: ldc_w 558681708
    //   450: ixor
    //   451: goto -> 462
    //   454: ldc2_w 1510081346
    //   457: l2i
    //   458: ldc_w 460743229
    //   461: ixor
    //   462: ldc2_w 1045150525
    //   465: l2i
    //   466: ldc_w -307573164
    //   469: ixor
    //   470: ixor
    //   471: lookupswitch default -> 696, -1835723754 -> 496, 1851591303 -> 454
    //   496: aload_1
    //   497: getstatic Perryc.c : I
    //   500: iflt -> 514
    //   503: ldc2_w -1584770242
    //   506: l2i
    //   507: ldc_w -1584297232
    //   510: ixor
    //   511: goto -> 522
    //   514: ldc2_w -663432354
    //   517: l2i
    //   518: ldc_w 561100589
    //   521: ixor
    //   522: ldc2_w 625045140
    //   525: l2i
    //   526: ldc_w 986953483
    //   529: ixor
    //   530: ixor
    //   531: lookupswitch default -> 692, -426263060 -> 556, 529072209 -> 514
    //   556: aload_0
    //   557: getstatic Perryc.c : I
    //   560: iflt -> 574
    //   563: ldc2_w 648315794
    //   566: l2i
    //   567: ldc_w 1660978905
    //   570: ixor
    //   571: goto -> 582
    //   574: ldc2_w 767435478
    //   577: l2i
    //   578: ldc_w 280088980
    //   581: ixor
    //   582: ldc2_w 1254764279
    //   585: l2i
    //   586: ldc_w 1735405579
    //   589: ixor
    //   590: ixor
    //   591: lookupswitch default -> 616, 1153803227 -> 574, 1746803639 -> 694
    //   616: aload_0
    //   617: getstatic Perryc.c : I
    //   620: iflt -> 634
    //   623: ldc2_w -977553375
    //   626: l2i
    //   627: ldc_w -1853595525
    //   630: ixor
    //   631: goto -> 642
    //   634: ldc2_w 1295941125
    //   637: l2i
    //   638: ldc_w 595444805
    //   641: ixor
    //   642: ldc2_w 1447587090
    //   645: l2i
    //   646: ldc_w 658474491
    //   649: ixor
    //   650: ixor
    //   651: lookupswitch default -> 706, 523522729 -> 676, 625488051 -> 634
    //   676: goto -> 680
    //   679: athrow
    //   680: invokevirtual setContents : (Ljava/awt/datatransfer/Transferable;Ljava/awt/datatransfer/ClipboardOwner;)V
    //   683: goto -> 687
    //   686: athrow
    //   687: return
    //   688: aconst_null
    //   689: athrow
    //   690: aconst_null
    //   691: athrow
    //   692: aconst_null
    //   693: athrow
    //   694: aconst_null
    //   695: athrow
    //   696: aconst_null
    //   697: athrow
    //   698: aconst_null
    //   699: athrow
    //   700: aconst_null
    //   701: athrow
    //   702: aconst_null
    //   703: athrow
    //   704: aconst_null
    //   705: athrow
    //   706: aconst_null
    //   707: athrow
    //   708: pop
    //   709: goto -> 24
    //   712: pop
    //   713: aconst_null
    //   714: goto -> 708
    //   717: dup
    //   718: ifnull -> 708
    //   721: checkcast java/lang/Throwable
    //   724: athrow
    //   725: dup
    //   726: ifnull -> 712
    //   729: checkcast java/lang/Throwable
    //   732: athrow
    //   733: aconst_null
    //   734: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   233	455	0	selection	Ljava/awt/datatransfer/StringSelection;
    //   437	251	1	clipboard	Ljava/awt/datatransfer/Clipboard;
    // Exception table:
    //   from	to	target	type
    //   8	20	717	finally
    //   92	98	98	finally
    //   92	98	98	java/lang/EnumConstantNotPresentException
    //   92	98	3	finally
    //   92	98	98	java/util/ConcurrentModificationException
    //   92	98	98	finally
    //   163	170	170	finally
    //   164	170	3	finally
    //   164	170	163	finally
    //   164	170	163	java/lang/IllegalArgumentException
    //   164	170	163	finally
    //   295	302	302	finally
    //   295	302	295	finally
    //   295	302	295	java/lang/NullPointerException
    //   295	302	295	finally
    //   296	302	302	java/lang/StringIndexOutOfBoundsException
    //   367	374	374	finally
    //   367	374	367	java/lang/AssertionError
    //   367	374	367	finally
    //   367	374	367	java/lang/IllegalStateException
    //   368	374	374	java/lang/UnsupportedOperationException
    //   680	686	686	finally
    //   680	686	686	finally
    //   680	686	3	java/util/ConcurrentModificationException
    //   680	686	3	java/lang/EnumConstantNotPresentException
    //   680	686	3	java/lang/EnumConstantNotPresentException
    //   717	725	717	finally
    //   733	735	3	finally
  }
  
  public static void load() {
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
  
  public static void load_client() {
    Perry1.3Y(null, (int)561424082L ^ 0x7EF84418);
  }
  
  @EventHandler
  public void init(FMLInitializationEvent event) {
    // Byte code:
    //   0: goto -> 8
    //   3: dup
    //   4: ifnull -> 275
    //   7: athrow
    //   8: aconst_null
    //   9: getstatic Perryc.c : I
    //   12: ifge -> 267
    //   15: pop
    //   16: aconst_null
    //   17: goto -> 259
    //   20: nop
    //   21: nop
    //   22: nop
    //   23: athrow
    //   24: ldc_w '〙㌖う嫽ᰮ?๲䷃䂑袥੩ﶮ'
    //   27: getstatic Perryc.1 : I
    //   30: ifeq -> 44
    //   33: ldc2_w 2003933872
    //   36: l2i
    //   37: ldc_w -689880459
    //   40: ixor
    //   41: goto -> 52
    //   44: ldc2_w 1907738277
    //   47: l2i
    //   48: ldc_w -467350397
    //   51: ixor
    //   52: ldc2_w -1015393951
    //   55: l2i
    //   56: ldc_w -294691396
    //   59: ixor
    //   60: ixor
    //   61: lookupswitch default -> 88, -1937386472 -> 244, -1929818164 -> 44
    //   88: goto -> 92
    //   91: athrow
    //   92: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   95: goto -> 99
    //   98: athrow
    //   99: getstatic Perryc.0 : I
    //   102: ifle -> 116
    //   105: ldc2_w -516096755
    //   108: l2i
    //   109: ldc_w 579474286
    //   112: ixor
    //   113: goto -> 124
    //   116: ldc2_w 359532072
    //   119: l2i
    //   120: ldc_w 595951942
    //   123: ixor
    //   124: ldc2_w -1546099585
    //   127: l2i
    //   128: ldc_w -30637916
    //   131: ixor
    //   132: ixor
    //   133: lookupswitch default -> 246, -1639839048 -> 116, 1797219253 -> 160
    //   160: goto -> 164
    //   163: athrow
    //   164: invokestatic setTitle : (Ljava/lang/String;)V
    //   167: goto -> 171
    //   170: athrow
    //   171: getstatic Perryc.1 : I
    //   174: ifeq -> 188
    //   177: ldc2_w 1213826019
    //   180: l2i
    //   181: ldc_w -697220058
    //   184: ixor
    //   185: goto -> 196
    //   188: ldc2_w -1826551025
    //   191: l2i
    //   192: ldc_w -1430212096
    //   195: ixor
    //   196: ldc2_w 360952966
    //   199: l2i
    //   200: ldc_w -1103981947
    //   203: ixor
    //   204: ixor
    //   205: lookupswitch default -> 248, -1840210164 -> 232, 899277254 -> 188
    //   232: goto -> 236
    //   235: athrow
    //   236: invokestatic load : ()V
    //   239: goto -> 243
    //   242: athrow
    //   243: return
    //   244: aconst_null
    //   245: athrow
    //   246: aconst_null
    //   247: athrow
    //   248: aconst_null
    //   249: athrow
    //   250: pop
    //   251: goto -> 24
    //   254: pop
    //   255: aconst_null
    //   256: goto -> 250
    //   259: dup
    //   260: ifnull -> 250
    //   263: checkcast java/lang/Throwable
    //   266: athrow
    //   267: dup
    //   268: ifnull -> 254
    //   271: checkcast java/lang/Throwable
    //   274: athrow
    //   275: aconst_null
    //   276: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   24	220	0	this	Lbigname/zprestige/webhack/WebHack;
    //   24	220	1	event	Lnet/minecraftforge/fml/common/event/FMLInitializationEvent;
    // Exception table:
    //   from	to	target	type
    //   8	20	259	finally
    //   91	98	98	finally
    //   91	98	98	java/lang/UnsupportedOperationException
    //   91	98	91	finally
    //   91	98	98	java/lang/StringIndexOutOfBoundsException
    //   92	98	98	java/lang/IndexOutOfBoundsException
    //   163	170	170	finally
    //   163	170	170	finally
    //   163	170	163	finally
    //   164	170	163	finally
    //   164	170	170	finally
    //   235	242	242	finally
    //   235	242	235	java/lang/StringIndexOutOfBoundsException
    //   235	242	3	finally
    //   235	242	242	finally
    //   236	242	235	finally
    //   259	267	259	java/lang/IndexOutOfBoundsException
    //   275	277	3	java/lang/ClassCastException
  }
  
  public static void onUnload() {
    Perry1.3y(null, (int)-697083426L ^ 0xA3F76FD6);
  }
  
  static {
    // Byte code:
    //   0: ldc_w '〹㌖うㅤ돇?๲'
    //   3: getstatic Perryc.c : I
    //   6: iflt -> 20
    //   9: ldc2_w 541561372
    //   12: l2i
    //   13: ldc_w 458413427
    //   16: ixor
    //   17: goto -> 28
    //   20: ldc2_w 274630649
    //   23: l2i
    //   24: ldc_w 918197357
    //   27: ixor
    //   28: ldc2_w -1827241805
    //   31: l2i
    //   32: ldc_w -2077079331
    //   35: ixor
    //   36: ixor
    //   37: lookupswitch default -> 672, 741445377 -> 20, 834722810 -> 64
    //   64: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   67: getstatic Perryc.0 : I
    //   70: ifle -> 84
    //   73: ldc2_w -1393769126
    //   76: l2i
    //   77: ldc_w 284374437
    //   80: ixor
    //   81: goto -> 92
    //   84: ldc2_w 891858268
    //   87: l2i
    //   88: ldc_w -1149092546
    //   91: ixor
    //   92: ldc2_w 1644957114
    //   95: l2i
    //   96: ldc_w -1453930964
    //   99: ixor
    //   100: ixor
    //   101: lookupswitch default -> 128, -990701644 -> 84, 2001025897 -> 674
    //   128: putstatic bigname/zprestige/webhack/WebHack.MODID : Ljava/lang/String;
    //   131: ldc_w '〙㌖うㅄ돇?๲'
    //   134: getstatic Perryc.c : I
    //   137: iflt -> 151
    //   140: ldc2_w 702394999
    //   143: l2i
    //   144: ldc_w 1266300586
    //   147: ixor
    //   148: goto -> 159
    //   151: ldc2_w -171397947
    //   154: l2i
    //   155: ldc_w -109971308
    //   158: ixor
    //   159: ldc2_w 518710730
    //   162: l2i
    //   163: ldc_w -1570849487
    //   166: ixor
    //   167: ixor
    //   168: lookupswitch default -> 680, -1341322070 -> 196, -569123802 -> 151
    //   196: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   199: getstatic Perryc.1 : I
    //   202: ifeq -> 216
    //   205: ldc2_w -1026694412
    //   208: l2i
    //   209: ldc_w 1046509905
    //   212: ixor
    //   213: goto -> 224
    //   216: ldc2_w -1911919225
    //   219: l2i
    //   220: ldc_w -369228902
    //   223: ixor
    //   224: ldc2_w -1185985096
    //   227: l2i
    //   228: ldc_w 2023714023
    //   231: ixor
    //   232: ixor
    //   233: lookupswitch default -> 260, 1031650042 -> 668, 2126520172 -> 216
    //   260: putstatic bigname/zprestige/webhack/WebHack.MODNAME : Ljava/lang/String;
    //   263: ldc_w 'ま㍝〜'
    //   266: getstatic Perryc.c : I
    //   269: iflt -> 283
    //   272: ldc2_w -1131210861
    //   275: l2i
    //   276: ldc_w 591222344
    //   279: ixor
    //   280: goto -> 291
    //   283: ldc2_w 433935609
    //   286: l2i
    //   287: ldc_w -2125624344
    //   290: ixor
    //   291: ldc2_w 967826026
    //   294: l2i
    //   295: ldc_w -652053250
    //   298: ixor
    //   299: ixor
    //   300: lookupswitch default -> 328, -248416116 -> 283, 2133061455 -> 676
    //   328: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   331: getstatic Perryc.c : I
    //   334: iflt -> 348
    //   337: ldc2_w 851525590
    //   340: l2i
    //   341: ldc_w -846998996
    //   344: ixor
    //   345: goto -> 356
    //   348: ldc2_w -598363980
    //   351: l2i
    //   352: ldc_w -1164469866
    //   355: ixor
    //   356: ldc2_w -1851507967
    //   359: l2i
    //   360: ldc_w 3144645
    //   363: ixor
    //   364: ixor
    //   365: lookupswitch default -> 392, -1282015155 -> 348, 1858678078 -> 678
    //   392: putstatic bigname/zprestige/webhack/WebHack.MODVER : Ljava/lang/String;
    //   395: ldc_w '〙㌖うㅄ돇?๲'
    //   398: getstatic Perryc.1 : I
    //   401: ifeq -> 415
    //   404: ldc2_w -1909315803
    //   407: l2i
    //   408: ldc_w 2009358660
    //   411: ixor
    //   412: goto -> 423
    //   415: ldc2_w -849603673
    //   418: l2i
    //   419: ldc_w 941981652
    //   422: ixor
    //   423: ldc2_w -1879942161
    //   426: l2i
    //   427: ldc_w 1495094993
    //   430: ixor
    //   431: ixor
    //   432: lookupswitch default -> 682, 597057869 -> 460, 790186847 -> 415
    //   460: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   463: getstatic Perryc.1 : I
    //   466: ifeq -> 480
    //   469: ldc2_w 848070357
    //   472: l2i
    //   473: ldc_w -81389416
    //   476: ixor
    //   477: goto -> 488
    //   480: ldc2_w -117737250
    //   483: l2i
    //   484: ldc_w 1858824695
    //   487: ixor
    //   488: ldc2_w -470176184
    //   491: l2i
    //   492: ldc_w 1920812169
    //   495: ixor
    //   496: ixor
    //   497: lookupswitch default -> 524, -633445781 -> 480, 1479439500 -> 670
    //   524: invokestatic getLogger : (Ljava/lang/String;)Lorg/apache/logging/log4j/Logger;
    //   527: getstatic Perryc.c : I
    //   530: iflt -> 544
    //   533: ldc2_w -255488429
    //   536: l2i
    //   537: ldc_w -2075045886
    //   540: ixor
    //   541: goto -> 552
    //   544: ldc2_w -955217434
    //   547: l2i
    //   548: ldc_w -766487094
    //   551: ixor
    //   552: ldc2_w -1571956578
    //   555: l2i
    //   556: ldc_w 391229647
    //   559: ixor
    //   560: ixor
    //   561: lookupswitch default -> 664, -1604537219 -> 588, -1048005120 -> 544
    //   588: putstatic bigname/zprestige/webhack/WebHack.LOGGER : Lorg/apache/logging/log4j/Logger;
    //   591: ldc2_w -744439932
    //   594: l2i
    //   595: ldc_w -744439932
    //   598: ixor
    //   599: getstatic Perryc.0 : I
    //   602: ifle -> 616
    //   605: ldc2_w -1348414890
    //   608: l2i
    //   609: ldc_w -57102863
    //   612: ixor
    //   613: goto -> 624
    //   616: ldc2_w -204839336
    //   619: l2i
    //   620: ldc_w -1345667443
    //   623: ixor
    //   624: ldc2_w -1080431709
    //   627: l2i
    //   628: ldc_w -1156022986
    //   631: ixor
    //   632: ixor
    //   633: lookupswitch default -> 660, -187781160 -> 616, 1471801650 -> 666
    //   660: putstatic bigname/zprestige/webhack/WebHack.unloaded : Z
    //   663: return
    //   664: aconst_null
    //   665: athrow
    //   666: aconst_null
    //   667: athrow
    //   668: aconst_null
    //   669: athrow
    //   670: aconst_null
    //   671: athrow
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
  }
  
  public static void reload() {
    Perry1.3p(null, (int)99253055L ^ 0xB166B83);
  }
  
  public static String starting_client() {
    return Perry1.o(null, (int)-901244316L ^ 0xE0DA5D27);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\WebHack.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */