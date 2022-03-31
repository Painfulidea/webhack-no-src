package bigname.zprestige.webhack.event.events;

import Perry1;
import bigname.zprestige.webhack.event.EventStage;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;

public class ConnectionEvent extends EventStage {
  public String name;
  
  public EntityPlayer entity;
  
  public UUID uuid;
  
  public UUID getUuid() {
    return Perry1.1h(this, (int)1482410989L ^ 0x5BAF2242);
  }
  
  public ConnectionEvent(int stage, EntityPlayer entity, UUID uuid, String name) {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 16
    //   6: ldc2_w 132393771
    //   9: l2i
    //   10: ldc -611256890
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w 711440493
    //   19: l2i
    //   20: ldc -1531543762
    //   22: ixor
    //   23: ldc2_w -1733633719
    //   26: l2i
    //   27: ldc 429705012
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 726, 266852670 -> 56, 1564655760 -> 16
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w -344333495
    //   66: l2i
    //   67: ldc -758412681
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -1696557617
    //   76: l2i
    //   77: ldc -1323529843
    //   79: ixor
    //   80: ldc2_w 1366931259
    //   83: l2i
    //   84: ldc 1598492099
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 116, -1370890254 -> 73, 931976134 -> 736
    //   116: iload_1
    //   117: getstatic Perryc.1 : I
    //   120: ifeq -> 133
    //   123: ldc2_w -574593939
    //   126: l2i
    //   127: ldc -139987999
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w -1654573388
    //   136: l2i
    //   137: ldc -1705898223
    //   139: ixor
    //   140: ldc2_w 1940278063
    //   143: l2i
    //   144: ldc -110273485
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 728, -1913114951 -> 176, -1599307632 -> 133
    //   176: invokespecial <init> : (I)V
    //   179: getstatic Perryc.1 : I
    //   182: ifeq -> 195
    //   185: ldc2_w -304531698
    //   188: l2i
    //   189: ldc -1925866364
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w 1775471741
    //   198: l2i
    //   199: ldc 764445871
    //   201: ixor
    //   202: ldc2_w 322317791
    //   205: l2i
    //   206: ldc -621467653
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 730, -1920990474 -> 236, -1456496210 -> 195
    //   236: aload_0
    //   237: getstatic Perryc.0 : I
    //   240: ifle -> 253
    //   243: ldc2_w 1609164731
    //   246: l2i
    //   247: ldc 1969072697
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w 1374309027
    //   256: l2i
    //   257: ldc -2068819307
    //   259: ixor
    //   260: ldc2_w 884654469
    //   263: l2i
    //   264: ldc 1250388118
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 296, 1418323089 -> 740, 1679008221 -> 253
    //   296: aload_2
    //   297: getstatic Perryc.0 : I
    //   300: ifle -> 313
    //   303: ldc2_w -1217512824
    //   306: l2i
    //   307: ldc 1308002873
    //   309: ixor
    //   310: goto -> 320
    //   313: ldc2_w 1565414531
    //   316: l2i
    //   317: ldc 1366626229
    //   319: ixor
    //   320: ldc2_w 635235687
    //   323: l2i
    //   324: ldc 161842404
    //   326: ixor
    //   327: ixor
    //   328: lookupswitch default -> 356, -1202707859 -> 313, -689841870 -> 732
    //   356: putfield entity : Lnet/minecraft/entity/player/EntityPlayer;
    //   359: getstatic Perryc.1 : I
    //   362: ifeq -> 375
    //   365: ldc2_w -1727466012
    //   368: l2i
    //   369: ldc 1915336080
    //   371: ixor
    //   372: goto -> 382
    //   375: ldc2_w -2021346100
    //   378: l2i
    //   379: ldc -1299550567
    //   381: ixor
    //   382: ldc2_w 590636658
    //   385: l2i
    //   386: ldc 1202891612
    //   388: ixor
    //   389: ixor
    //   390: lookupswitch default -> 416, -1884844710 -> 720, 152695495 -> 375
    //   416: aload_0
    //   417: getstatic Perryc.1 : I
    //   420: ifeq -> 433
    //   423: ldc2_w -2016628026
    //   426: l2i
    //   427: ldc 1484210983
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 1396326173
    //   436: l2i
    //   437: ldc 1582320862
    //   439: ixor
    //   440: ldc2_w -1287518742
    //   443: l2i
    //   444: ldc 796550849
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, 1132696266 -> 742, 1346798405 -> 433
    //   476: aload_3
    //   477: getstatic Perryc.0 : I
    //   480: ifle -> 493
    //   483: ldc2_w -549126532
    //   486: l2i
    //   487: ldc -704777132
    //   489: ixor
    //   490: goto -> 500
    //   493: ldc2_w 194513285
    //   496: l2i
    //   497: ldc -1133516719
    //   499: ixor
    //   500: ldc2_w -1154870050
    //   503: l2i
    //   504: ldc 1404975816
    //   506: ixor
    //   507: ixor
    //   508: lookupswitch default -> 536, -500358082 -> 724, 1365996065 -> 493
    //   536: putfield uuid : Ljava/util/UUID;
    //   539: getstatic Perryc.c : I
    //   542: iflt -> 555
    //   545: ldc2_w 1712448749
    //   548: l2i
    //   549: ldc -1421400011
    //   551: ixor
    //   552: goto -> 562
    //   555: ldc2_w -1823007381
    //   558: l2i
    //   559: ldc 595204091
    //   561: ixor
    //   562: ldc2_w 1740659034
    //   565: l2i
    //   566: ldc -2015783644
    //   568: ixor
    //   569: ixor
    //   570: lookupswitch default -> 596, -2061857483 -> 555, 760152230 -> 738
    //   596: aload_0
    //   597: getstatic Perryc.1 : I
    //   600: ifeq -> 613
    //   603: ldc2_w 1032581441
    //   606: l2i
    //   607: ldc -2016564558
    //   609: ixor
    //   610: goto -> 620
    //   613: ldc2_w -1457417641
    //   616: l2i
    //   617: ldc -683702429
    //   619: ixor
    //   620: ldc2_w -808923701
    //   623: l2i
    //   624: ldc -1616198070
    //   626: ixor
    //   627: ixor
    //   628: lookupswitch default -> 656, -1485440827 -> 613, -366718862 -> 722
    //   656: aload #4
    //   658: getstatic Perryc.0 : I
    //   661: ifle -> 674
    //   664: ldc2_w 1461008822
    //   667: l2i
    //   668: ldc -447226548
    //   670: ixor
    //   671: goto -> 681
    //   674: ldc2_w -1638870989
    //   677: l2i
    //   678: ldc -924194681
    //   680: ixor
    //   681: ldc2_w 2073060822
    //   684: l2i
    //   685: ldc 1505326168
    //   687: ixor
    //   688: ixor
    //   689: lookupswitch default -> 716, -1871973004 -> 734, 1257746804 -> 674
    //   716: putfield name : Ljava/lang/String;
    //   719: return
    //   720: aconst_null
    //   721: athrow
    //   722: aconst_null
    //   723: athrow
    //   724: aconst_null
    //   725: athrow
    //   726: aconst_null
    //   727: athrow
    //   728: aconst_null
    //   729: athrow
    //   730: aconst_null
    //   731: athrow
    //   732: aconst_null
    //   733: athrow
    //   734: aconst_null
    //   735: athrow
    //   736: aconst_null
    //   737: athrow
    //   738: aconst_null
    //   739: athrow
    //   740: aconst_null
    //   741: athrow
    //   742: aconst_null
    //   743: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	720	0	this	Lbigname/zprestige/webhack/event/events/ConnectionEvent;
    //   0	720	1	stage	I
    //   0	720	2	entity	Lnet/minecraft/entity/player/EntityPlayer;
    //   0	720	3	uuid	Ljava/util/UUID;
    //   0	720	4	name	Ljava/lang/String;
  }
  
  public String getName() {
    return Perry1.1(this, (int)-1996248164L ^ 0xC16C89B8);
  }
  
  public ConnectionEvent(int stage, UUID uuid, String name) {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 16
    //   6: ldc2_w -1844277812
    //   9: l2i
    //   10: ldc 2074308180
    //   12: ixor
    //   13: goto -> 23
    //   16: ldc2_w -712794764
    //   19: l2i
    //   20: ldc 642729173
    //   22: ixor
    //   23: ldc2_w -853633452
    //   26: l2i
    //   27: ldc 1111046036
    //   29: ixor
    //   30: ixor
    //   31: lookupswitch default -> 680, 1721123416 -> 16, 2095806561 -> 56
    //   56: aload_0
    //   57: getstatic Perryc.c : I
    //   60: iflt -> 73
    //   63: ldc2_w 2015450617
    //   66: l2i
    //   67: ldc -895228646
    //   69: ixor
    //   70: goto -> 80
    //   73: ldc2_w -1115428615
    //   76: l2i
    //   77: ldc 987103598
    //   79: ixor
    //   80: ldc2_w -945637009
    //   83: l2i
    //   84: ldc 1548879321
    //   86: ixor
    //   87: ixor
    //   88: lookupswitch default -> 674, 480597281 -> 116, 695340117 -> 73
    //   116: iload_1
    //   117: getstatic Perryc.0 : I
    //   120: ifle -> 133
    //   123: ldc2_w 1683691610
    //   126: l2i
    //   127: ldc 180326004
    //   129: ixor
    //   130: goto -> 140
    //   133: ldc2_w -1072044531
    //   136: l2i
    //   137: ldc 1964666704
    //   139: ixor
    //   140: ldc2_w 457048777
    //   143: l2i
    //   144: ldc -1339080293
    //   146: ixor
    //   147: ixor
    //   148: lookupswitch default -> 686, -973744772 -> 133, 504547855 -> 176
    //   176: invokespecial <init> : (I)V
    //   179: getstatic Perryc.0 : I
    //   182: ifle -> 195
    //   185: ldc2_w 113096335
    //   188: l2i
    //   189: ldc -967653162
    //   191: ixor
    //   192: goto -> 202
    //   195: ldc2_w -775267245
    //   198: l2i
    //   199: ldc -717590091
    //   201: ixor
    //   202: ldc2_w -928229535
    //   205: l2i
    //   206: ldc -2082709717
    //   208: ixor
    //   209: ixor
    //   210: lookupswitch default -> 668, -1952483821 -> 195, 1333798316 -> 236
    //   236: aload_0
    //   237: getstatic Perryc.0 : I
    //   240: ifle -> 253
    //   243: ldc2_w 208565245
    //   246: l2i
    //   247: ldc -2143427934
    //   249: ixor
    //   250: goto -> 260
    //   253: ldc2_w -12860083
    //   256: l2i
    //   257: ldc -286557106
    //   259: ixor
    //   260: ldc2_w -969155336
    //   263: l2i
    //   264: ldc 999247223
    //   266: ixor
    //   267: ixor
    //   268: lookupswitch default -> 678, -328980340 -> 296, 1910964432 -> 253
    //   296: aload_2
    //   297: getstatic Perryc.c : I
    //   300: iflt -> 313
    //   303: ldc2_w -855278682
    //   306: l2i
    //   307: ldc -202381584
    //   309: ixor
    //   310: goto -> 320
    //   313: ldc2_w -461186452
    //   316: l2i
    //   317: ldc 1648586006
    //   319: ixor
    //   320: ldc2_w 357613116
    //   323: l2i
    //   324: ldc 1421959654
    //   326: ixor
    //   327: ixor
    //   328: lookupswitch default -> 356, 1826548348 -> 313, 2138784396 -> 684
    //   356: putfield uuid : Ljava/util/UUID;
    //   359: getstatic Perryc.0 : I
    //   362: ifle -> 375
    //   365: ldc2_w -662721527
    //   368: l2i
    //   369: ldc -762035238
    //   371: ixor
    //   372: goto -> 382
    //   375: ldc2_w 1423156030
    //   378: l2i
    //   379: ldc -414610258
    //   381: ixor
    //   382: ldc2_w -1027288721
    //   385: l2i
    //   386: ldc -681744587
    //   388: ixor
    //   389: ixor
    //   390: lookupswitch default -> 670, -1509713462 -> 416, 527587721 -> 375
    //   416: aload_0
    //   417: getstatic Perryc.c : I
    //   420: iflt -> 433
    //   423: ldc2_w -1805769507
    //   426: l2i
    //   427: ldc -190378898
    //   429: ixor
    //   430: goto -> 440
    //   433: ldc2_w 266287010
    //   436: l2i
    //   437: ldc 60115020
    //   439: ixor
    //   440: ldc2_w 811874720
    //   443: l2i
    //   444: ldc 1502764530
    //   446: ixor
    //   447: ixor
    //   448: lookupswitch default -> 476, -178227219 -> 433, 151997665 -> 688
    //   476: aload_3
    //   477: getstatic Perryc.0 : I
    //   480: ifle -> 493
    //   483: ldc2_w -201125845
    //   486: l2i
    //   487: ldc 1217405833
    //   489: ixor
    //   490: goto -> 500
    //   493: ldc2_w 254947914
    //   496: l2i
    //   497: ldc 2065925904
    //   499: ixor
    //   500: ldc2_w 467206173
    //   503: l2i
    //   504: ldc 745430260
    //   506: ixor
    //   507: ixor
    //   508: lookupswitch default -> 536, -1960546485 -> 682, 1445557696 -> 493
    //   536: putfield name : Ljava/lang/String;
    //   539: getstatic Perryc.1 : I
    //   542: ifeq -> 555
    //   545: ldc2_w -119368782
    //   548: l2i
    //   549: ldc 47684364
    //   551: ixor
    //   552: goto -> 563
    //   555: ldc2_w 799655260
    //   558: l2i
    //   559: ldc_w -1485725330
    //   562: ixor
    //   563: ldc2_w 899236117
    //   566: l2i
    //   567: ldc_w 1751111223
    //   570: ixor
    //   571: ixor
    //   572: lookupswitch default -> 600, -1477206116 -> 672, 1544681499 -> 555
    //   600: aload_0
    //   601: aconst_null
    //   602: getstatic Perryc.1 : I
    //   605: ifeq -> 619
    //   608: ldc2_w -173722357
    //   611: l2i
    //   612: ldc_w 486320111
    //   615: ixor
    //   616: goto -> 627
    //   619: ldc2_w 1382934276
    //   622: l2i
    //   623: ldc_w -827242904
    //   626: ixor
    //   627: ldc2_w -1480680647
    //   630: l2i
    //   631: ldc_w 1092739176
    //   634: ixor
    //   635: ixor
    //   636: lookupswitch default -> 676, 264694197 -> 619, 2051267133 -> 664
    //   664: putfield entity : Lnet/minecraft/entity/player/EntityPlayer;
    //   667: return
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
    //   684: aconst_null
    //   685: athrow
    //   686: aconst_null
    //   687: athrow
    //   688: aconst_null
    //   689: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	668	0	this	Lbigname/zprestige/webhack/event/events/ConnectionEvent;
    //   0	668	1	stage	I
    //   0	668	2	uuid	Ljava/util/UUID;
    //   0	668	3	name	Ljava/lang/String;
  }
  
  public EntityPlayer getEntity() {
    return Perry1.2j(this, (int)-1244289822L ^ 0x8001A9E2);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\event\events\ConnectionEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */