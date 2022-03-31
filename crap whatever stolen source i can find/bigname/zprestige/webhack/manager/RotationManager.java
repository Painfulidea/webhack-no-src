package bigname.zprestige.webhack.manager;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.features.Feature;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class RotationManager extends Feature {
  public float yaw;
  
  public float pitch;
  
  public void setPitch(float pitch) {
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
  
  public void setYaw(float paramFloat) {
    Perry1.11(this, (int)1745395184L ^ 0x567A2868, paramFloat);
  }
  
  public float getYaw() {
    return Perry1.2O(this, (int)1007623990L ^ 0x3C6EAC22);
  }
  
  public float getPitch() {
    return Perry1.2K(this, (int)-1232102279L ^ 0xD832437D);
  }
  
  public void setPlayerRotations(float paramFloat1, float paramFloat2) {
    Perry1.O(this, (int)-1709608093L ^ 0xC3EEB2C6, paramFloat1, paramFloat2);
  }
  
  public void updateRotations() {
    Perry1.4j(this, (int)-1195608533L ^ 0xC11FEE66);
  }
  
  public void restoreRotations() {
    Perry1.3s(this, (int)-1517903528L ^ 0x85AAAFFE);
  }
  
  public String getDirection4D(boolean paramBoolean) {
    return Perry1.5I(this, (int)146263041L ^ 0xC7CB831, paramBoolean);
  }
  
  public void setPlayerPitch(float paramFloat) {
    Perry1.10(this, (int)-832824882L ^ 0xF42F7B0A, paramFloat);
  }
  
  public void setPlayerYaw(float paramFloat) {
    Perry1.0X(this, (int)526118215L ^ 0x4ED48A4A, paramFloat);
  }
  
  public void lookAtVec3d(Vec3d vec3d) {
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
  
  public void lookAtEntity(Entity paramEntity) {
    Perry1.5O(this, (int)180052870L ^ 0x2C713296, paramEntity);
  }
  
  public RotationManager() {
    // Byte code:
    //   0: getstatic Perryc.c : I
    //   3: iflt -> 17
    //   6: ldc2_w 1049674009
    //   9: l2i
    //   10: ldc_w -1868246746
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -1712272106
    //   20: l2i
    //   21: ldc_w -485366274
    //   24: ixor
    //   25: ldc2_w -2126311025
    //   28: l2i
    //   29: ldc_w -1323003081
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, -1638690169 -> 126, 885278394 -> 17
    //   60: aload_0
    //   61: getstatic Perryc.1 : I
    //   64: ifeq -> 78
    //   67: ldc2_w -1003620560
    //   70: l2i
    //   71: ldc_w 1671866208
    //   74: ixor
    //   75: goto -> 86
    //   78: ldc2_w 988577411
    //   81: l2i
    //   82: ldc_w -1818255930
    //   85: ixor
    //   86: ldc2_w -2026188823
    //   89: l2i
    //   90: ldc_w -1451256253
    //   93: ixor
    //   94: ixor
    //   95: lookupswitch default -> 120, -1982985734 -> 124, 1205185767 -> 78
    //   120: invokespecial <init> : ()V
    //   123: return
    //   124: aconst_null
    //   125: athrow
    //   126: aconst_null
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	124	0	this	Lbigname/zprestige/webhack/manager/RotationManager;
  }
  
  public int getDirection4D() {
    return Perry1.2X(this, (int)-1341196449L ^ 0xD32887B0);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void lookAtVec3d(double x, double y, double z) {
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
  
  public void lookAtPos(BlockPos pos) {
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
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\manager\RotationManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */