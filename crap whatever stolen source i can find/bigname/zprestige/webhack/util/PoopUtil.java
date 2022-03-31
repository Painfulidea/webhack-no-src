package bigname.zprestige.webhack.util;

import bigname.zprestige.webhack.WebHack;
import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Disk;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Sphere;

public class PoopUtil implements Util {
  public static ICamera camera;
  
  public static FloatBuffer modelView;
  
  public static boolean alpha432;
  
  public static boolean texture;
  
  public static RenderItem itemRender = mc.func_175599_af();
  
  public static boolean depth;
  
  public static IntBuffer viewport;
  
  public static Frustum frustrum;
  
  public static boolean override;
  
  public static boolean bind;
  
  public static FloatBuffer screenCoords;
  
  public static FloatBuffer projection;
  
  public static boolean clean;
  
  public static void drawGradientBoxTest(BlockPos pos, Color startColor, Color endColor) {}
  
  public static void drawGradientPlane(BlockPos pos, EnumFacing face, Color startColor, Color endColor, boolean half, boolean top) {
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder builder = tessellator.func_178180_c();
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    Vec3d interp = EntityUtil.interpolateEntity((Entity)mc.field_71439_g, mc.func_184121_ak());
    AxisAlignedBB bb = iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(7390.971827055736D) ^ 0x7FDCBCB529A86DC1L)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c);
    float red = startColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.0082905935F) ^ 0x7F78D545);
    float green = startColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.08577376F) ^ 0x7ED0AA27);
    float blue = startColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.47387287F) ^ 0x7D8D9F77);
    float alpha = startColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.013263402F) ^ 0x7F264EBD);
    float red2 = endColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(6.174016E-5F) ^ 0x7BFE7A7F);
    float green2 = endColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.013331381F) ^ 0x7F256BDD);
    float blue2 = endColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.39418074F) ^ 0x7DB6D20F);
    float alpha2 = endColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.088222034F) ^ 0x7ECBADC1);
    double x1 = Double.longBitsToDouble(Double.doubleToLongBits(1.3343070589377786E307D) ^ 0x7FB3004C3BE8A597L);
    double y1 = Double.longBitsToDouble(Double.doubleToLongBits(4.503305020012586E306D) ^ 0x7F99A6D44B977CBFL);
    double z1 = Double.longBitsToDouble(Double.doubleToLongBits(2.5408815061196537E307D) ^ 0x7FC21778226120FBL);
    double x2 = Double.longBitsToDouble(Double.doubleToLongBits(4.7985079698178963E306D) ^ 0x7F9B554D2A1EBCBFL);
    double y2 = Double.longBitsToDouble(Double.doubleToLongBits(1.0081048803914013E308D) ^ 0x7FE1F1E282B8B74BL);
    double z2 = Double.longBitsToDouble(Double.doubleToLongBits(6.115126588611919E307D) ^ 0x7FD5C5444ABB7C47L);
    if (face == EnumFacing.DOWN) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72336_d;
      y1 = bb.field_72338_b + (top ? Double.longBitsToDouble(Double.doubleToLongBits(11.028151412433436D) ^ 0x7FC60E69DCA779C3L) : Double.longBitsToDouble(Double.doubleToLongBits(2.0621019161534856E307D) ^ 0x7FBD5D84B22C8527L));
      y2 = bb.field_72338_b + (top ? Double.longBitsToDouble(Double.doubleToLongBits(2.6719869756158703D) ^ 0x7FE5603AB51CDD6AL) : Double.longBitsToDouble(Double.doubleToLongBits(2.5597294530401104E307D) ^ 0x7FC239D32F94F66FL));
      z1 = bb.field_72339_c;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.UP) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72336_d;
      y1 = bb.field_72337_e / (half ? ((int)-787126801L ^ 0xD11565ED) : ((int)1077360296L ^ 0x403736A9));
      y2 = bb.field_72337_e / (half ? ((int)215757907L ^ 0xCDC3451) : ((int)-1621908137L ^ 0x9F53A556));
      z1 = bb.field_72339_c;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.EAST) {
      x1 = bb.field_72336_d;
      x2 = bb.field_72336_d;
      y1 = bb.field_72338_b + (top ? Double.longBitsToDouble(Double.doubleToLongBits(2.371028662277568D) ^ 0x7FE2F7DDE012E2E2L) : Double.longBitsToDouble(Double.doubleToLongBits(1.022572976392256E308D) ^ 0x7FE233D0B1F649B0L));
      y2 = bb.field_72337_e / (half ? ((int)1491715731L ^ 0x58E9C691) : ((int)-757942924L ^ 0xD2D2B575));
      z1 = bb.field_72339_c;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.WEST) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72340_a;
      y1 = bb.field_72338_b + (top ? Double.longBitsToDouble(Double.doubleToLongBits(19.153705470823535D) ^ 0x7FD327593DE26743L) : Double.longBitsToDouble(Double.doubleToLongBits(1.4801793384129137E308D) ^ 0x7FEA591AE820D83FL));
      y2 = bb.field_72337_e / (half ? ((int)-1925933261L ^ 0x8D349731) : ((int)-1757866136L ^ 0x97391769));
      z1 = bb.field_72339_c;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.SOUTH) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72336_d;
      y1 = bb.field_72338_b + (top ? Double.longBitsToDouble(Double.doubleToLongBits(2.867387261809242D) ^ 0x7FE6F068BB938061L) : Double.longBitsToDouble(Double.doubleToLongBits(1.315727905060146E308D) ^ 0x7FE76BB53B67CCD6L));
      y2 = bb.field_72337_e / (half ? ((int)-519030619L ^ 0xE11038A7) : ((int)226364291L ^ 0xD7E0B82));
      z1 = bb.field_72334_f;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.NORTH) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72336_d;
      y1 = bb.field_72338_b + (top ? Double.longBitsToDouble(Double.doubleToLongBits(31.741646756288443D) ^ 0x7FDFBDDC8FD3717FL) : Double.longBitsToDouble(Double.doubleToLongBits(8.748748541391531E307D) ^ 0x7FDF25862E26BA93L));
      y2 = bb.field_72337_e / (half ? ((int)436633324L ^ 0x1A067EEE) : ((int)-1086728968L ^ 0xBF39D4F9));
      z1 = bb.field_72339_c;
      z2 = bb.field_72339_c;
    } 
    GlStateManager.func_179094_E();
    GlStateManager.func_179097_i();
    GlStateManager.func_179090_x();
    GlStateManager.func_179147_l();
    GlStateManager.func_179118_c();
    GlStateManager.func_179132_a((int)88698724L ^ 0x5496F64);
    builder.func_181668_a((int)-706476963L ^ 0xD5E40458, DefaultVertexFormats.field_181706_f);
    if (face == EnumFacing.EAST || face == EnumFacing.WEST || face == EnumFacing.NORTH || face == EnumFacing.SOUTH) {
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    } else if (face == EnumFacing.UP) {
      builder.func_181662_b(x1, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    } else if (face == EnumFacing.DOWN) {
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
    } 
    tessellator.func_78381_a();
    GlStateManager.func_179132_a((int)378958311L ^ 0x169671E6);
    GlStateManager.func_179084_k();
    GlStateManager.func_179141_d();
    GlStateManager.func_179098_w();
    GlStateManager.func_179126_j();
    GlStateManager.func_179121_F();
  }
  
  public static void setColor(Color color) {
    GL11.glColor4d(color.getRed() / Double.longBitsToDouble(Double.doubleToLongBits(0.4410873908707162D) ^ 0x7FB3DAC69B9DEEB7L), color.getGreen() / Double.longBitsToDouble(Double.doubleToLongBits(0.46610107427562614D) ^ 0x7FB2349999A93BE7L), color.getBlue() / Double.longBitsToDouble(Double.doubleToLongBits(0.9146786138600972D) ^ 0x7F82A50C159C26BFL), color.getAlpha() / Double.longBitsToDouble(Double.doubleToLongBits(0.013955279182059143D) ^ 0x7FE37495DD8C4666L));
  }
  
  public static void drawCompleteImage(float posX, float posY, float width, float height) {
    GL11.glPushMatrix();
    GL11.glTranslatef(posX, posY, Float.intBitsToFloat(Float.floatToIntBits(1.0310513E38F) ^ 0x7E9B22A7));
    GL11.glBegin((int)-1067058897L ^ 0xC065F928);
    GL11.glTexCoord2f(Float.intBitsToFloat(Float.floatToIntBits(1.2211044E38F) ^ 0x7EB7BB3B), Float.intBitsToFloat(Float.floatToIntBits(3.1104817E37F) ^ 0x7DBB348F));
    GL11.glVertex3f(Float.intBitsToFloat(Float.floatToIntBits(8.077753E36F) ^ 0x7CC276FF), Float.intBitsToFloat(Float.floatToIntBits(6.1817007E37F) ^ 0x7E3A0617), Float.intBitsToFloat(Float.floatToIntBits(3.2949403E38F) ^ 0x7F77E23E));
    GL11.glTexCoord2f(Float.intBitsToFloat(Float.floatToIntBits(1.2167244E38F) ^ 0x7EB71285), Float.intBitsToFloat(Float.floatToIntBits(12.39877F) ^ 0x7EC6615D));
    GL11.glVertex3f(Float.intBitsToFloat(Float.floatToIntBits(1.6103591E38F) ^ 0x7EF24CC7), height, Float.intBitsToFloat(Float.floatToIntBits(1.0767476E38F) ^ 0x7EA202CF));
    GL11.glTexCoord2f(Float.intBitsToFloat(Float.floatToIntBits(5.9410763F) ^ 0x7F3E1D4C), Float.intBitsToFloat(Float.floatToIntBits(6.783062F) ^ 0x7F590ED8));
    GL11.glVertex3f(width, height, Float.intBitsToFloat(Float.floatToIntBits(2.0607267E38F) ^ 0x7F1B0827));
    GL11.glTexCoord2f(Float.intBitsToFloat(Float.floatToIntBits(9.21004F) ^ 0x7E935C53), Float.intBitsToFloat(Float.floatToIntBits(3.2768697E38F) ^ 0x7F768637));
    GL11.glVertex3f(width, Float.intBitsToFloat(Float.floatToIntBits(2.9793266E38F) ^ 0x7F6023BE), Float.intBitsToFloat(Float.floatToIntBits(3.1625653E38F) ^ 0x7F6DECCB));
    GL11.glEnd();
    GL11.glPopMatrix();
  }
  
  public static void drawGradientBlockOutline(AxisAlignedBB bb, Color startColor, Color endColor, float linewidth) {
    float red = startColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.008114301F) ^ 0x7F7BF1D8);
    float green = startColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.015520072F) ^ 0x7F0147E6);
    float blue = startColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.10174718F) ^ 0x7EAF60D3);
    float alpha = startColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.015074593F) ^ 0x7F09FB6D);
    float red2 = endColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.01506125F) ^ 0x7F09C376);
    float green2 = endColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.045040693F) ^ 0x7E477C97);
    float blue2 = endColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.085674725F) ^ 0x7ED0763B);
    float alpha2 = endColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.013594684F) ^ 0x7F21BC3D);
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)814836800L ^ 0x30916F42, (int)-1846217891L ^ 0x91F4F05E, (int)2123647688L ^ 0x7E944AC8, (int)1352130385L ^ 0x5097DF50);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)2079360248L ^ 0x7BF084F8);
    GL11.glEnable((int)1706360935L ^ 0x65B50B47);
    GL11.glHint((int)-1799165874L ^ 0x94C2E41C, (int)-1243540282L ^ 0xB5E105C4);
    GL11.glLineWidth(linewidth);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)1138260866L ^ 0x43D87B81, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GL11.glDisable((int)2043853629L ^ 0x79D2B01D);
    GlStateManager.func_179132_a((int)1866740116L ^ 0x6F443195);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void drawClosedGradientBox(BlockPos pos, Color startColor, Color endColor, double height) {
    EnumFacing[] arrayOfEnumFacing = EnumFacing.values();
    int i = arrayOfEnumFacing.length;
    for (int j = (int)752191580L ^ 0x2CD5885C; j < i; j++) {
      EnumFacing face = arrayOfEnumFacing[j];
      drawGradientPlane(pos, face, startColor, endColor, height);
    } 
  }
  
  public static void draw3DRect(float x, float y, float w, float h, Color startColor, Color endColor, float lineWidth) {
    float alpha = startColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.09701129F) ^ 0x7EB9ADDB);
    float red = startColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.413444F) ^ 0x7DACAEEF);
    float green = startColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.011187829F) ^ 0x7F484D28);
    float blue = startColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.012035626F) ^ 0x7F3A3113);
    float alpha2 = endColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.040837597F) ^ 0x7E584553);
    float red2 = endColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.013239338F) ^ 0x7F27E9CF);
    float green2 = endColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.013641789F) ^ 0x7F2081CF);
    float blue2 = endColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.008005714F) ^ 0x7F7C2A66);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    GlStateManager.func_179147_l();
    GlStateManager.func_179090_x();
    GlStateManager.func_187441_d(lineWidth);
    GlStateManager.func_179120_a((int)1054825452L ^ 0x3EDF58EE, (int)-808977081L ^ 0xCFC7FE44, (int)-1683784772L ^ 0x9BA37BBD, (int)-213149615L ^ 0xF34B9851);
    bufferbuilder.func_181668_a((int)-2140552073L ^ 0x8069C470, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(x, h, Double.longBitsToDouble(Double.doubleToLongBits(7.529871430705501E307D) ^ 0x7FDACEA6C3BAEDC3L)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(w, h, Double.longBitsToDouble(Double.doubleToLongBits(1.5689935624901E307D) ^ 0x7FB657DC9C0AAAC7L)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(w, y, Double.longBitsToDouble(Double.doubleToLongBits(1.2347466732551752E307D) ^ 0x7FB1955825F18B8FL)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(x, y, Double.longBitsToDouble(Double.doubleToLongBits(5.972787270240501E307D) ^ 0x7FD5438A43DD2D7BL)).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
  }
  
  public static void drawTracerPointer(float x, float y, float size, float widthDiv, float heightDiv, boolean outline, float outlineWidth, int color) {
    boolean blend = GL11.glIsEnabled((int)1156414845L ^ 0x44ED769F);
    float alpha = (color >> ((int)609925538L ^ 0x245AB9BA) & ((int)530006675L ^ 0x1F97426C)) / Float.intBitsToFloat(Float.floatToIntBits(0.07808792F) ^ 0x7EE0EC8F);
    GL11.glEnable((int)-1648516858L ^ 0x9DBDAAE4);
    GL11.glDisable((int)2076946570L ^ 0x7BCBBD6B);
    GL11.glBlendFunc((int)-378478988L ^ 0xE970DD76, (int)1458441822L ^ 0x56EE0D5D);
    GL11.glEnable((int)-935352887L ^ 0xC83FAEE9);
    GL11.glPushMatrix();
    hexColor(color);
    GL11.glBegin((int)-338900744L ^ 0xEBCCC8FF);
    GL11.glVertex2d(x, y);
    GL11.glVertex2d((x - size / widthDiv), (y + size));
    GL11.glVertex2d(x, (y + size / heightDiv));
    GL11.glVertex2d((x + size / widthDiv), (y + size));
    GL11.glVertex2d(x, y);
    GL11.glEnd();
    if (outline) {
      GL11.glLineWidth(outlineWidth);
      GL11.glColor4f(Float.intBitsToFloat(Float.floatToIntBits(9.932855E37F) ^ 0x7E9573F7), Float.intBitsToFloat(Float.floatToIntBits(4.2569325E37F) ^ 0x7E001A37), Float.intBitsToFloat(Float.floatToIntBits(2.7722734E38F) ^ 0x7F50900B), alpha);
      GL11.glBegin((int)-1233777228L ^ 0xB6760DB6);
      GL11.glVertex2d(x, y);
      GL11.glVertex2d((x - size / widthDiv), (y + size));
      GL11.glVertex2d(x, (y + size / heightDiv));
      GL11.glVertex2d((x + size / widthDiv), (y + size));
      GL11.glVertex2d(x, y);
      GL11.glEnd();
    } 
    GL11.glPopMatrix();
    GL11.glEnable((int)-421843279L ^ 0xE6DB2350);
    if (!blend)
      GL11.glDisable((int)-2001267987L ^ 0x88B7190F); 
    GL11.glDisable((int)594689498L ^ 0x237236FA);
  }
  
  public static void renderOne(float lineWidth) {
    checkSetupFBO();
    GL11.glPushAttrib((int)230340363L ^ 0xDB548F4);
    GL11.glDisable((int)-1881457513L ^ 0x8FDB3757);
    GL11.glDisable((int)-767202124L ^ 0xD2456155);
    GL11.glDisable((int)1367045982L ^ 0x517B7C0E);
    GL11.glEnable((int)-591142031L ^ 0xDCC3E893);
    GL11.glBlendFunc((int)-1850568566L ^ 0x91B29388, (int)1392577724L ^ 0x53010FBF);
    GL11.glLineWidth(lineWidth);
    GL11.glEnable((int)952538610L ^ 0x38C69ED2);
    GL11.glEnable((int)2140495808L ^ 0x7F955450);
    GL11.glClear((int)-1410766323L ^ 0xABE96E0D);
    GL11.glClearStencil((int)-1547271704L ^ 0xA3C681E7);
    GL11.glStencilFunc((int)-968354956L ^ 0xC6481174, (int)-35176138L ^ 0xFDE74137, (int)-1480787478L ^ 0xA7BCF9E5);
    GL11.glStencilOp((int)-452736514L ^ 0xE503D7FF, (int)152027371L ^ 0x90FDEEA, (int)401821460L ^ 0x17F35115);
    GL11.glPolygonMode((int)76782599L ^ 0x493980F, (int)-1045141412L ^ 0xC1B4735D);
  }
  
  public static void drawColorBox(AxisAlignedBB axisalignedbb, float red, float green, float blue, float alpha) {
    Tessellator ts = Tessellator.func_178181_a();
    BufferBuilder vb = ts.func_178180_c();
    vb.func_181668_a((int)1535487745L ^ 0x5B85AF06, DefaultVertexFormats.field_181707_g);
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    ts.func_78381_a();
    vb.func_181668_a((int)-818020832L ^ 0xCF3DFE27, DefaultVertexFormats.field_181707_g);
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    ts.func_78381_a();
    vb.func_181668_a((int)-569267470L ^ 0xDE11AAF5, DefaultVertexFormats.field_181707_g);
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    ts.func_78381_a();
    vb.func_181668_a((int)-2015394904L ^ 0x87DF83AF, DefaultVertexFormats.field_181707_g);
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    ts.func_78381_a();
    vb.func_181668_a((int)823663026L ^ 0x311819B5, DefaultVertexFormats.field_181707_g);
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    ts.func_78381_a();
    vb.func_181668_a((int)538041469L ^ 0x2011DC7A, DefaultVertexFormats.field_181707_g);
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    ts.func_78381_a();
  }
  
  public static void drawBox(BlockPos pos, Color color) {
    AxisAlignedBB bb = new AxisAlignedBB(pos.func_177958_n() - (mc.func_175598_ae()).field_78730_l, pos.func_177956_o() - (mc.func_175598_ae()).field_78731_m, pos.func_177952_p() - (mc.func_175598_ae()).field_78728_n, (pos.func_177958_n() + ((int)208366956L ^ 0xC6B6D6D)) - (mc.func_175598_ae()).field_78730_l, (pos.func_177956_o() + ((int)-565586772L ^ 0xDE49D4AD)) - (mc.func_175598_ae()).field_78731_m, (pos.func_177952_p() + ((int)384562053L ^ 0x16EBF384)) - (mc.func_175598_ae()).field_78728_n);
    camera.func_78547_a(((Entity)Objects.requireNonNull((T)mc.func_175606_aa())).field_70165_t, (mc.func_175606_aa()).field_70163_u, (mc.func_175606_aa()).field_70161_v);
    if (camera.func_78546_a(new AxisAlignedBB(bb.field_72340_a + (mc.func_175598_ae()).field_78730_l, bb.field_72338_b + (mc.func_175598_ae()).field_78731_m, bb.field_72339_c + (mc.func_175598_ae()).field_78728_n, bb.field_72336_d + (mc.func_175598_ae()).field_78730_l, bb.field_72337_e + (mc.func_175598_ae()).field_78731_m, bb.field_72334_f + (mc.func_175598_ae()).field_78728_n))) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179147_l();
      GlStateManager.func_179097_i();
      GlStateManager.func_179120_a((int)-908314411L ^ 0xC9DC3BD7, (int)297260792L ^ 0x11B7D5FB, (int)-27459335L ^ 0xFE5D00F9, (int)-411524817L ^ 0xE778A12E);
      GlStateManager.func_179090_x();
      GlStateManager.func_179132_a((int)-327646745L ^ 0xEC7881E7);
      GL11.glEnable((int)1412337190L ^ 0x542E8506);
      GL11.glHint((int)606313005L ^ 0x2423967F, (int)1030750160L ^ 0x3D6FEED2);
      RenderGlobal.func_189696_b(bb, color.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.09079421F) ^ 0x7EC6F251), color.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.055267733F) ^ 0x7E1D606B), color.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.033596616F) ^ 0x7E769C9B), color.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.012002319F) ^ 0x7F3BA560));
      GL11.glDisable((int)826916345L ^ 0x3149B6D9);
      GlStateManager.func_179132_a((int)1868250710L ^ 0x6F5B3E57);
      GlStateManager.func_179126_j();
      GlStateManager.func_179098_w();
      GlStateManager.func_179084_k();
      GlStateManager.func_179121_F();
    } 
  }
  
  public static Vec3d to2D(double x, double y, double z) {
    GL11.glGetFloat((int)-964151791L ^ 0xC6883DB7, modelView);
    GL11.glGetFloat((int)-991673312L ^ 0xC4E44F87, projection);
    GL11.glGetInteger((int)-320315833L ^ 0xECE855E5, viewport);
    boolean result = GLU.gluProject((float)x, (float)y, (float)z, modelView, projection, viewport, screenCoords);
    return result ? new Vec3d(screenCoords.get((int)1274991284L ^ 0x4BFED2B4), (Display.getHeight() - screenCoords.get((int)82611861L ^ 0x4EC8E94)), screenCoords.get((int)1057432427L ^ 0x3F072369)) : null;
  }
  
  public static void drawBlockOutline(AxisAlignedBB bb, Color color, float linewidth) {
    float red = color.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.007996976F) ^ 0x7F7C05C0);
    float green = color.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.09249962F) ^ 0x7EC27071);
    float blue = color.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.073846616F) ^ 0x7EE83CE5);
    float alpha = color.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.009865188F) ^ 0x7F5EA199);
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)1951015913L ^ 0x744A20EB, (int)-39117557L ^ 0xFDAB1E08, (int)-601935453L ^ 0xDC1F31A3, (int)-724873093L ^ 0xD4CB507A);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)-997777676L ^ 0xC4871EF4);
    GL11.glEnable((int)-1308677587L ^ 0xB1FF210D);
    GL11.glHint((int)183668840L ^ 0xAF29C3A, (int)1396919711L ^ 0x53435C9D);
    GL11.glLineWidth(linewidth);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)-1992002342L ^ 0x894474D9, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GL11.glDisable((int)258784647L ^ 0xF6CB6A7);
    GlStateManager.func_179132_a((int)2064468525L ^ 0x7B0D4A2C);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void blockEsp(BlockPos blockPos, Color c, double length, double length2) {
    double x = blockPos.func_177958_n() - mc.field_175616_W.field_78725_b;
    double y = blockPos.func_177956_o() - mc.field_175616_W.field_78726_c;
    double z = blockPos.func_177952_p() - mc.field_175616_W.field_78723_d;
    GL11.glPushMatrix();
    GL11.glBlendFunc((int)-1619957073L ^ 0x9F7169AD, (int)318312267L ^ 0x12F90C48);
    GL11.glEnable((int)877784025L ^ 0x3451E03B);
    GL11.glLineWidth(Float.intBitsToFloat(Float.floatToIntBits(0.47772554F) ^ 0x7EF49871));
    GL11.glDisable((int)605674847L ^ 0x2419D0BE);
    GL11.glDisable((int)-2137231073L ^ 0x809C7A6E);
    GL11.glDepthMask((int)-362438279L ^ 0xEA65A179);
    GL11.glColor4d((c.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.008214731F) ^ 0x7F799714)), (c.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.06787751F) ^ 0x7EF4035D)), (c.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.049448874F) ^ 0x7E358AE7)), Double.longBitsToDouble(Double.doubleToLongBits(30.197394285110306D) ^ 0x7FEE32886E8EF750L));
    drawColorBox(new AxisAlignedBB(x, y, z, x + length2, y + Double.longBitsToDouble(Double.doubleToLongBits(7.7266269905050375D) ^ 0x7FEEE810E7E270AEL), z + length), Float.intBitsToFloat(Float.floatToIntBits(5.4213294E37F) ^ 0x7E232467), Float.intBitsToFloat(Float.floatToIntBits(1.1434171E38F) ^ 0x7EAC0AD3), Float.intBitsToFloat(Float.floatToIntBits(1.3767222E38F) ^ 0x7ECF2569), Float.intBitsToFloat(Float.floatToIntBits(2.555814E38F) ^ 0x7F404730));
    GL11.glColor4d(Double.longBitsToDouble(Double.doubleToLongBits(6.06984507285819E307D) ^ 0x7FD59BFF64E48CBBL), Double.longBitsToDouble(Double.doubleToLongBits(8.582537670584647E307D) ^ 0x7FDE8E0A8A649917L), Double.longBitsToDouble(Double.doubleToLongBits(2.065235767809569E307D) ^ 0x7FBD68F167DDCE2FL), Double.longBitsToDouble(Double.doubleToLongBits(119.90770436714728D) ^ 0x7FBDFA17D40ED55FL));
    drawSelectionBoundingBox(new AxisAlignedBB(x, y, z, x + length2, y + Double.longBitsToDouble(Double.doubleToLongBits(112.40839009830187D) ^ 0x7FAC1A2310390DDFL), z + length));
    GL11.glLineWidth(Float.intBitsToFloat(Float.floatToIntBits(0.60802126F) ^ 0x7F1BA748));
    GL11.glEnable((int)1636038544L ^ 0x6183FA71);
    GL11.glEnable((int)-1324368369L ^ 0xB10FB57E);
    GL11.glDepthMask((int)-1130228385L ^ 0xBCA2155E);
    GL11.glDisable((int)587026914L ^ 0x22FD5A00);
    GL11.glPopMatrix();
    GL11.glColor4f(Float.intBitsToFloat(Float.floatToIntBits(16.34812F) ^ 0x7E02C8F3), Float.intBitsToFloat(Float.floatToIntBits(5.7605186F) ^ 0x7F38562B), Float.intBitsToFloat(Float.floatToIntBits(84.50805F) ^ 0x7D29041F), Float.intBitsToFloat(Float.floatToIntBits(6.7645493F) ^ 0x7F587730));
  }
  
  public static void drawGradientSideways(double leftpos, double top, double right, double bottom, int col1, int col2) {
    float f = (col1 >> ((int)-601890938L ^ 0xDC1FDF9E) & ((int)-1211035770L ^ 0xB7D10F79)) / Float.intBitsToFloat(Float.floatToIntBits(0.010078046F) ^ 0x7F5A1E63);
    float f2 = (col1 >> ((int)879188120L ^ 0x34675888) & ((int)1893768245L ^ 0x70E09CCA)) / Float.intBitsToFloat(Float.floatToIntBits(0.10736535F) ^ 0x7EA4E25D);
    float f3 = (col1 >> ((int)363675176L ^ 0x15AD3E20) & ((int)-1571922781L ^ 0xA24E5C5C)) / Float.intBitsToFloat(Float.floatToIntBits(0.008268472F) ^ 0x7F78787C);
    float f4 = (col1 & ((int)-1926657525L ^ 0x8D298AF4)) / Float.intBitsToFloat(Float.floatToIntBits(0.33303544F) ^ 0x7DD5839F);
    float f5 = (col2 >> ((int)1408059181L ^ 0x53ED4735) & ((int)205584634L ^ 0xC40F805)) / Float.intBitsToFloat(Float.floatToIntBits(0.04831947F) ^ 0x7E3AEAA3);
    float f6 = (col2 >> ((int)2103050276L ^ 0x7D5A0034) & ((int)638722817L ^ 0x261223FE)) / Float.intBitsToFloat(Float.floatToIntBits(0.01105765F) ^ 0x7F4A2B25);
    float f7 = (col2 >> ((int)924300583L ^ 0x3717B52F) & ((int)-1769796010L ^ 0x96830EA9)) / Float.intBitsToFloat(Float.floatToIntBits(0.01517718F) ^ 0x7F07A9B5);
    float f8 = (col2 & ((int)1236953334L ^ 0x49BA6809)) / Float.intBitsToFloat(Float.floatToIntBits(0.008056134F) ^ 0x7F7CFDE0);
    GL11.glEnable((int)-1307767216L ^ 0xB20D05B2);
    GL11.glDisable((int)1270047419L ^ 0x4BB36F5A);
    GL11.glBlendFunc((int)-222208092L ^ 0xF2C15CA6, (int)-644279481L ^ 0xD9991044);
    GL11.glEnable((int)850469741L ^ 0x32B1284D);
    GL11.glShadeModel((int)2079414972L ^ 0x7BF147BD);
    GL11.glPushMatrix();
    GL11.glBegin((int)1262652386L ^ 0x4B428BE5);
    GL11.glColor4f(f2, f3, f4, f);
    GL11.glVertex2d(leftpos, top);
    GL11.glVertex2d(leftpos, bottom);
    GL11.glColor4f(f6, f7, f8, f5);
    GL11.glVertex2d(right, bottom);
    GL11.glVertex2d(right, top);
    GL11.glEnd();
    GL11.glPopMatrix();
    GL11.glEnable((int)-1783708061L ^ 0x95AECB82);
    GL11.glDisable((int)856665896L ^ 0x330FA4CA);
    GL11.glDisable((int)-1780821200L ^ 0x95DAD810);
    GL11.glShadeModel((int)-620062789L ^ 0xDB0A8ABB);
  }
  
  public static void drawFilledBoxESPN(BlockPos pos, Color color) {
    AxisAlignedBB bb = new AxisAlignedBB(pos.func_177958_n() - (mc.func_175598_ae()).field_78730_l, pos.func_177956_o() - (mc.func_175598_ae()).field_78731_m, pos.func_177952_p() - (mc.func_175598_ae()).field_78728_n, (pos.func_177958_n() + ((int)622323142L ^ 0x2517E5C7)) - (mc.func_175598_ae()).field_78730_l, (pos.func_177956_o() + ((int)82187089L ^ 0x4E61350)) - (mc.func_175598_ae()).field_78731_m, (pos.func_177952_p() + ((int)1326080141L ^ 0x4F0A608C)) - (mc.func_175598_ae()).field_78728_n);
    int rgba = ColorUtil.toRGBA(color);
    drawFilledBox(bb, rgba);
  }
  
  public static void drawTricolorGradientBox(BlockPos pos, Color startColor, Color midColor, Color endColor) {
    EnumFacing[] arrayOfEnumFacing = EnumFacing.values();
    int i = arrayOfEnumFacing.length;
    int j;
    for (j = (int)1542723715L ^ 0x5BF41883; j < i; j++) {
      EnumFacing face = arrayOfEnumFacing[j];
      if (face != EnumFacing.UP)
        drawGradientPlane(pos, face, startColor, midColor, (int)-86551219L ^ 0xFAD7554C, (int)-1372046783L ^ 0xAE383A41); 
    } 
    arrayOfEnumFacing = EnumFacing.values();
    i = arrayOfEnumFacing.length;
    for (j = (int)-1317044591L ^ 0xB17F7E91; j < i; j++) {
      EnumFacing face = arrayOfEnumFacing[j];
      if (face != EnumFacing.DOWN)
        drawGradientPlane(pos, face, midColor, endColor, (int)353495631L ^ 0x1511EA4E, (int)1037402108L ^ 0x3DD57FFD); 
    } 
  }
  
  public static void renderTwo() {
    GL11.glStencilFunc((int)-1666533065L ^ 0x9CAABB37, (int)947627544L ^ 0x387BA618, (int)108709996L ^ 0x67AC863);
    GL11.glStencilOp((int)1927801873L ^ 0x72E7F210, (int)50552867L ^ 0x3037E22, (int)-1435959596L ^ 0xAA68E0D5);
    GL11.glPolygonMode((int)1671470018L ^ 0x63A09FCA, (int)1598312460L ^ 0x5F444B0E);
  }
  
  public static void renderThree() {
    GL11.glStencilFunc((int)1705069744L ^ 0x65A14EB2, (int)1150809172L ^ 0x4497F455, (int)1665643475L ^ 0x6347B3DC);
    GL11.glStencilOp((int)1967664511L ^ 0x7548337F, (int)527601072L ^ 0x1F7293B0, (int)-104623039L ^ 0xF9C38A41);
    GL11.glPolygonMode((int)-1537289933L ^ 0xA45ED53B, (int)76397115L ^ 0x48DA13A);
  }
  
  public static void drawArcOutline(float cx, float cy, float r, float start_angle, float end_angle, int num_segments) {
    GL11.glBegin((int)1770418386L ^ 0x698670D0);
    for (int i = (int)(num_segments / Float.intBitsToFloat(Float.floatToIntBits(0.054142576F) ^ 0x7EE9C49B) / start_angle) + ((int)1838125242L ^ 0x6D8F90BB); i <= num_segments / Float.intBitsToFloat(Float.floatToIntBits(0.030166294F) ^ 0x7F431F4E) / end_angle; i++) {
      double angle = Double.longBitsToDouble(Double.doubleToLongBits(1.1864095208448429D) ^ 0x7FEBDA73D8FF3DF3L) * i / num_segments;
      GL11.glVertex2d(cx + Math.cos(angle) * r, cy + Math.sin(angle) * r);
    } 
    glEnd();
  }
  
  public static void drawCircleOutline(float x, float y, float radius) {
    drawCircleOutline(x, y, radius, (int)674954894L ^ 0x283AFE8E, (int)496420322L ^ 0x1D96C48A, (int)517892332L ^ 0x1EDE68C4);
  }
  
  public static void drawRectangleCorrectly(int x, int y, int w, int h, int color) {
    GL11.glLineWidth(Float.intBitsToFloat(Float.floatToIntBits(6.170615F) ^ 0x7F4575AE));
    Gui.func_73734_a(x, y, x + w, y + h, color);
  }
  
  public static void drawProperGradientBlockOutline(AxisAlignedBB bb, Color startColor, Color midColor, Color endColor, float linewidth) {
    float red = endColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.0133479955F) ^ 0x7F25B18D);
    float green = endColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.068381734F) ^ 0x7EF30BB9);
    float blue = endColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.04635444F) ^ 0x7E42DE27);
    float alpha = endColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.0136262F) ^ 0x7F20406D);
    float red2 = midColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.09039783F) ^ 0x7EC6227F);
    float green2 = midColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.007942666F) ^ 0x7F7D21F5);
    float blue2 = midColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.013884338F) ^ 0x7F1C7B22);
    float alpha2 = midColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.014565336F) ^ 0x7F11A372);
    float red3 = startColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.011074375F) ^ 0x7F4A714C);
    float green3 = startColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.4992039F) ^ 0x7D8097A7);
    float blue3 = startColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.011030462F) ^ 0x7F4BB91C);
    float alpha3 = startColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.010459762F) ^ 0x7F545F6C);
    double dif = (bb.field_72337_e - bb.field_72338_b) / Double.longBitsToDouble(Double.doubleToLongBits(0.7036148755295081D) ^ 0x7FE6840357EC1B6DL);
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)837133938L ^ 0x31E5A570, (int)98842733L ^ 0x5E43B6E, (int)-772890362L ^ 0xD1EEA106, (int)1192184980L ^ 0x470F4C95);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)138588671L ^ 0x842B1FF);
    GL11.glEnable((int)-1802278572L ^ 0x94936274);
    GL11.glHint((int)2016403156L ^ 0x782FD286, (int)895549491L ^ 0x35611131);
    GL11.glLineWidth(linewidth);
    GL11.glBegin((int)-2122330464L ^ 0x817FCEA1);
    GL11.glColor4d(red, green, blue, alpha);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c);
    GL11.glColor4d(red2, green2, blue2, alpha2);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b + dif, bb.field_72339_c);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b + dif, bb.field_72339_c);
    GL11.glColor4f(red3, green3, blue3, alpha3);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c);
    GL11.glColor4d(red, green, blue, alpha);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f);
    GL11.glColor4d(red2, green2, blue2, alpha2);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b + dif, bb.field_72334_f);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b + dif, bb.field_72334_f);
    GL11.glColor4d(red3, green3, blue3, alpha3);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f);
    GL11.glColor4d(red, green, blue, alpha);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f);
    GL11.glColor4d(red2, green2, blue2, alpha2);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b + dif, bb.field_72334_f);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b + dif, bb.field_72334_f);
    GL11.glColor4d(red3, green3, blue3, alpha3);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f);
    GL11.glColor4d(red, green, blue, alpha);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c);
    GL11.glColor4d(red2, green2, blue2, alpha2);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b + dif, bb.field_72339_c);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b + dif, bb.field_72339_c);
    GL11.glColor4d(red3, green3, blue3, alpha3);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c);
    GL11.glColor4d(red3, green3, blue3, alpha3);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c);
    GL11.glEnd();
    GL11.glDisable((int)-812896604L ^ 0xCF8C2584);
    GlStateManager.func_179132_a((int)1805224329L ^ 0x6B998988);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void drawBetterGradientBox(BlockPos pos, Color startColor, Color midColor, Color endColor) {
    float red = startColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.009323368F) ^ 0x7F67C10A);
    float green = startColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.012138931F) ^ 0x7F39E25E);
    float blue = startColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.014941636F) ^ 0x7F0BCDC3);
    float alpha = startColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.009200613F) ^ 0x7F69BE2B);
    float red2 = endColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.013087352F) ^ 0x7F296C55);
    float green2 = endColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.009166604F) ^ 0x7F692F86);
    float blue2 = endColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.008848853F) ^ 0x7F6FFAC8);
    float alpha2 = endColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.008846621F) ^ 0x7F6FF16B);
    float red3 = midColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(1.1341017F) ^ 0x7CEE2A3F);
    float green3 = midColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.009097759F) ^ 0x7F6A0EC4);
    float blue3 = midColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.07962664F) ^ 0x7EDC134B);
    float alpha3 = midColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.00788277F) ^ 0x7F7E26BC);
    AxisAlignedBB bb = new AxisAlignedBB(pos.func_177958_n() - (mc.func_175598_ae()).field_78730_l, pos.func_177956_o() - (mc.func_175598_ae()).field_78731_m, pos.func_177952_p() - (mc.func_175598_ae()).field_78728_n, (pos.func_177958_n() + ((int)-1473562634L ^ 0xA82B37F7)) - (mc.func_175598_ae()).field_78730_l, (pos.func_177956_o() + ((int)1250357511L ^ 0x4A86F106)) - (mc.func_175598_ae()).field_78731_m, (pos.func_177952_p() + ((int)-1562505340L ^ 0xA2DE0F85)) - (mc.func_175598_ae()).field_78728_n);
    double offset = (bb.field_72337_e - bb.field_72338_b) / Double.longBitsToDouble(Double.doubleToLongBits(0.2700458122752189D) ^ 0x7FD1486E3B09345BL);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder builder = tessellator.func_178180_c();
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)-1836052268L ^ 0x929013D6, (int)1801663106L ^ 0x6B633181, (int)-1994154621L ^ 0x89239D83, (int)-2139325414L ^ 0x807C7C1B);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)1365567687L ^ 0x5164E8C7);
    GL11.glEnable((int)710658906L ^ 0x2A5BC07A);
    GL11.glHint((int)-1054860981L ^ 0xC1201519, (int)471216068L ^ 0x1C163EC6);
    builder.func_181668_a((int)1763235697L ^ 0x6918D774, DefaultVertexFormats.field_181706_f);
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b + offset, bb.field_72339_c).func_181666_a(red3, green3, blue3, alpha3).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b + offset, bb.field_72334_f).func_181666_a(red3, green3, blue3, alpha3).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b + offset, bb.field_72334_f).func_181666_a(red3, green3, blue3, alpha3).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b + offset, bb.field_72334_f).func_181666_a(red3, green3, blue3, alpha3).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b + offset, bb.field_72339_c).func_181666_a(red3, green3, blue3, alpha3).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b + offset, bb.field_72339_c).func_181666_a(red3, green3, blue3, alpha3).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b + offset, bb.field_72339_c).func_181666_a(red3, green3, blue3, alpha3).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b + offset, bb.field_72334_f).func_181666_a(red3, green3, blue3, alpha3).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b + offset, bb.field_72334_f).func_181666_a(red3, green3, blue3, alpha3).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b + offset, bb.field_72334_f).func_181666_a(red3, green3, blue3, alpha3).func_181675_d();
    tessellator.func_78381_a();
    GL11.glDisable((int)956847999L ^ 0x39085C5F);
    GlStateManager.func_179132_a((int)-713090945L ^ 0xD57F187E);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void GLPre(float lineWidth) {
    depth = GL11.glIsEnabled((int)-602672821L ^ 0xDC13FA1B);
    texture = GL11.glIsEnabled((int)-1646906056L ^ 0x9DD63EDA);
    clean = GL11.glIsEnabled((int)-1439199557L ^ 0xAA37835A);
    bind = GL11.glIsEnabled((int)896660929L ^ 0x3571FEB0);
    override = GL11.glIsEnabled((int)-1468023518L ^ 0xA87FB602);
    GLPre(depth, texture, clean, bind, override, lineWidth);
  }
  
  public static void drawFilledCircle(double x, double y, double z, Color color, double radius) {
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder builder = tessellator.func_178180_c();
    builder.func_181668_a((int)427638131L ^ 0x197D3D76, DefaultVertexFormats.field_181706_f);
  }
  
  public static void drawCircle(float x, float y, float radius, int start, int end, int segments) {
    drawArc(x, y, radius, start, end, segments);
  }
  
  public static void drawGradientRect(int x, int y, int w, int h, int startColor, int endColor) {
    float f = (startColor >> ((int)-211353006L ^ 0xF367024A) & ((int)-1006160404L ^ 0xC4073513)) / Float.intBitsToFloat(Float.floatToIntBits(0.32060573F) ^ 0x7DDB266F);
    float f2 = (startColor >> ((int)-319789201L ^ 0xECF0677F) & ((int)-1793272529L ^ 0x951CD5D0)) / Float.intBitsToFloat(Float.floatToIntBits(0.106731825F) ^ 0x7EA59637);
    float f3 = (startColor >> ((int)-421584347L ^ 0xE6DF222D) & ((int)340326808L ^ 0x1448F967)) / Float.intBitsToFloat(Float.floatToIntBits(0.013756893F) ^ 0x7F1E6497);
    float f4 = (startColor & ((int)-730739782L ^ 0xD471CB45)) / Float.intBitsToFloat(Float.floatToIntBits(0.013755184F) ^ 0x7F1E5D6C);
    float f5 = (endColor >> ((int)-1842428484L ^ 0x922EC5A4) & ((int)1627607794L ^ 0x6103520D)) / Float.intBitsToFloat(Float.floatToIntBits(0.04018837F) ^ 0x7E5B9C8F);
    float f6 = (endColor >> ((int)-1348010652L ^ 0xAFA6FD74) & ((int)-1834215825L ^ 0x92AC1690)) / Float.intBitsToFloat(Float.floatToIntBits(0.013352363F) ^ 0x7F25C3DF);
    float f7 = (endColor >> ((int)1402843097L ^ 0x539DAFD1) & ((int)1344920842L ^ 0x5029DDF5)) / Float.intBitsToFloat(Float.floatToIntBits(0.014893333F) ^ 0x7F0B032B);
    float f8 = (endColor & ((int)442180639L ^ 0x1A5B24E0)) / Float.intBitsToFloat(Float.floatToIntBits(0.063728504F) ^ 0x7EFD8417);
    GlStateManager.func_179090_x();
    GlStateManager.func_179147_l();
    GlStateManager.func_179118_c();
    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
    GlStateManager.func_179103_j((int)-68629825L ^ 0xFBE8D7BE);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder vertexbuffer = tessellator.func_178180_c();
    vertexbuffer.func_181668_a((int)-183979875L ^ 0xF508B09A, DefaultVertexFormats.field_181706_f);
    vertexbuffer.func_181662_b(x + w, y, Double.longBitsToDouble(Double.doubleToLongBits(4.89890547456859E307D) ^ 0x7FD170D08FFE613BL)).func_181666_a(f2, f3, f4, f).func_181675_d();
    vertexbuffer.func_181662_b(x, y, Double.longBitsToDouble(Double.doubleToLongBits(9.082201172817944E307D) ^ 0x7FE02AB6FDC6CE37L)).func_181666_a(f2, f3, f4, f).func_181675_d();
    vertexbuffer.func_181662_b(x, y + h, Double.longBitsToDouble(Double.doubleToLongBits(1.6208855001976342E308D) ^ 0x7FECDA4BD57853E4L)).func_181666_a(f6, f7, f8, f5).func_181675_d();
    vertexbuffer.func_181662_b(x + w, y + h, Double.longBitsToDouble(Double.doubleToLongBits(6.209251541959277E307D) ^ 0x7FD61B0D23FBD4FFL)).func_181666_a(f6, f7, f8, f5).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179103_j((int)510729866L ^ 0x1E71038A);
    GlStateManager.func_179084_k();
    GlStateManager.func_179141_d();
    GlStateManager.func_179098_w();
  }
  
  public static void drawCircleOutline(float x, float y, float radius, int start, int end, int segments) {
    drawArcOutline(x, y, radius, start, end, segments);
  }
  
  public static void glBillboard(float x, float y, float z) {
    float scale = Float.intBitsToFloat(Float.floatToIntBits(62.849983F) ^ 0x7EA1126D);
    GlStateManager.func_179137_b(x - (mc.func_175598_ae()).field_78725_b, y - (mc.func_175598_ae()).field_78726_c, z - (mc.func_175598_ae()).field_78723_d);
    GlStateManager.func_187432_a(Float.intBitsToFloat(Float.floatToIntBits(1.2860426E38F) ^ 0x7EC1808F), Float.intBitsToFloat(Float.floatToIntBits(14.508134F) ^ 0x7EE82151), Float.intBitsToFloat(Float.floatToIntBits(3.3610668E37F) ^ 0x7DCA496F));
    GlStateManager.func_179114_b(-mc.field_71439_g.field_70177_z, Float.intBitsToFloat(Float.floatToIntBits(3.1738509E38F) ^ 0x7F6EC625), Float.intBitsToFloat(Float.floatToIntBits(10.438621F) ^ 0x7EA70497), Float.intBitsToFloat(Float.floatToIntBits(3.3067603E38F) ^ 0x7F78C5E3));
    GlStateManager.func_179114_b(mc.field_71439_g.field_70125_A, (mc.field_71474_y.field_74320_O == ((int)1098759984L ^ 0x417DBF32)) ? Float.intBitsToFloat(Float.floatToIntBits(-18.205908F) ^ 0x7E11A5B3) : Float.intBitsToFloat(Float.floatToIntBits(6.8922806F) ^ 0x7F5C8D90), Float.intBitsToFloat(Float.floatToIntBits(1.4021213E38F) ^ 0x7ED2F7BF), Float.intBitsToFloat(Float.floatToIntBits(2.128472E38F) ^ 0x7F2020E1));
    GlStateManager.func_179152_a(Float.intBitsToFloat(Float.floatToIntBits(-55.06083F) ^ 0x7E864A45), Float.intBitsToFloat(Float.floatToIntBits(-407.75876F) ^ 0x7F119510), Float.intBitsToFloat(Float.floatToIntBits(48.688614F) ^ 0x7E98B52B));
  }
  
  public static void drawSelectionBoundingBox(AxisAlignedBB boundingBox) {
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder vertexbuffer = tessellator.func_178180_c();
    vertexbuffer.func_181668_a((int)-507376089L ^ 0xE1C20E24, DefaultVertexFormats.field_181705_e);
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72338_b, boundingBox.field_72339_c).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72336_d, boundingBox.field_72338_b, boundingBox.field_72339_c).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72336_d, boundingBox.field_72338_b, boundingBox.field_72334_f).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72338_b, boundingBox.field_72334_f).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72338_b, boundingBox.field_72339_c).func_181675_d();
    tessellator.func_78381_a();
    vertexbuffer.func_181668_a((int)-1111361076L ^ 0xBDC1F9CF, DefaultVertexFormats.field_181705_e);
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72337_e, boundingBox.field_72339_c).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72336_d, boundingBox.field_72337_e, boundingBox.field_72339_c).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72336_d, boundingBox.field_72337_e, boundingBox.field_72334_f).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72337_e, boundingBox.field_72334_f).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72337_e, boundingBox.field_72339_c).func_181675_d();
    tessellator.func_78381_a();
    vertexbuffer.func_181668_a((int)1125121781L ^ 0x430FFEF4, DefaultVertexFormats.field_181705_e);
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72338_b, boundingBox.field_72339_c).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72337_e, boundingBox.field_72339_c).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72336_d, boundingBox.field_72338_b, boundingBox.field_72339_c).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72336_d, boundingBox.field_72337_e, boundingBox.field_72339_c).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72336_d, boundingBox.field_72338_b, boundingBox.field_72334_f).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72336_d, boundingBox.field_72337_e, boundingBox.field_72334_f).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72338_b, boundingBox.field_72334_f).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72337_e, boundingBox.field_72334_f).func_181675_d();
    tessellator.func_78381_a();
  }
  
  static {
    camera = (ICamera)new Frustum();
    frustrum = new Frustum();
    depth = GL11.glIsEnabled((int)1021927039L ^ 0x3CE9552F);
    texture = GL11.glIsEnabled((int)-388812825L ^ 0xE8D32405);
    clean = GL11.glIsEnabled((int)760845048L ^ 0x2D599F19);
    bind = GL11.glIsEnabled((int)-1775619624L ^ 0x962A3AA9);
    override = GL11.glIsEnabled((int)170093098L ^ 0xA23610A);
    screenCoords = BufferUtils.createFloatBuffer((int)-295426492L ^ 0xEE642647);
    viewport = BufferUtils.createIntBuffer((int)-183564286L ^ 0xF50F0812);
    modelView = BufferUtils.createFloatBuffer((int)-715062434L ^ 0xD561034E);
    projection = BufferUtils.createFloatBuffer((int)1786982726L ^ 0x6A833156);
  }
  
  public static void drawBetterGradientBox(BlockPos pos, Color startColor, Color endColor) {
    float red = startColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.008265757F) ^ 0x7F786D19);
    float green = startColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.014273028F) ^ 0x7F16D96B);
    float blue = startColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.015479805F) ^ 0x7F029F02);
    float alpha = startColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.011274786F) ^ 0x7F47B9E1);
    float red2 = endColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.008809964F) ^ 0x7F6F57AB);
    float green2 = endColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.00932981F) ^ 0x7F67DC0F);
    float blue2 = endColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.04720631F) ^ 0x7E3E5B67);
    float alpha2 = endColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.013402096F) ^ 0x7F249477);
    AxisAlignedBB bb = new AxisAlignedBB(pos.func_177958_n() - (mc.func_175598_ae()).field_78730_l, pos.func_177956_o() - (mc.func_175598_ae()).field_78731_m, pos.func_177952_p() - (mc.func_175598_ae()).field_78728_n, (pos.func_177958_n() + ((int)97233555L ^ 0x5CBAA92)) - (mc.func_175598_ae()).field_78730_l, (pos.func_177956_o() + ((int)1554415291L ^ 0x5CA67EBA)) - (mc.func_175598_ae()).field_78731_m, (pos.func_177952_p() + ((int)1417985247L ^ 0x5484BCDE)) - (mc.func_175598_ae()).field_78728_n);
    double offset = (bb.field_72337_e - bb.field_72338_b) / Double.longBitsToDouble(Double.doubleToLongBits(0.2112389783413414D) ^ 0x7FCB09E0FBCEE9EBL);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder builder = tessellator.func_178180_c();
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)1934972952L ^ 0x73555B1A, (int)-1221938125L ^ 0xB72AB730, (int)-648689278L ^ 0xD955C982, (int)-1649746639L ^ 0x9DAADD30);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)-833488900L ^ 0xCE51F7FC);
    GL11.glEnable((int)1878887681L ^ 0x6FFD8621);
    GL11.glHint((int)202116359L ^ 0xC0C0155, (int)747254350L ^ 0x2C8A234C);
    builder.func_181668_a((int)1412534278L ^ 0x54319003, DefaultVertexFormats.field_181706_f);
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
  }
  
  public static void drawBoxESP(BlockPos pos, Color color, float lineWidth, boolean outline, boolean box, int boxAlpha) {
    AxisAlignedBB bb = new AxisAlignedBB(pos.func_177958_n() - (mc.func_175598_ae()).field_78730_l, pos.func_177956_o() - (mc.func_175598_ae()).field_78731_m, pos.func_177952_p() - (mc.func_175598_ae()).field_78728_n, (pos.func_177958_n() + ((int)281061490L ^ 0x10C0A873)) - (mc.func_175598_ae()).field_78730_l, (pos.func_177956_o() + ((int)-1643044450L ^ 0x9E11219F)) - (mc.func_175598_ae()).field_78731_m, (pos.func_177952_p() + ((int)-1602460718L ^ 0xA07C63D3)) - (mc.func_175598_ae()).field_78728_n);
    camera.func_78547_a(((Entity)Objects.requireNonNull((T)mc.func_175606_aa())).field_70165_t, (mc.func_175606_aa()).field_70163_u, (mc.func_175606_aa()).field_70161_v);
    if (camera.func_78546_a(new AxisAlignedBB(bb.field_72340_a + (mc.func_175598_ae()).field_78730_l, bb.field_72338_b + (mc.func_175598_ae()).field_78731_m, bb.field_72339_c + (mc.func_175598_ae()).field_78728_n, bb.field_72336_d + (mc.func_175598_ae()).field_78730_l, bb.field_72337_e + (mc.func_175598_ae()).field_78731_m, bb.field_72334_f + (mc.func_175598_ae()).field_78728_n))) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179147_l();
      GlStateManager.func_179097_i();
      GlStateManager.func_179120_a((int)535369152L ^ 0x1FE916C2, (int)680191674L ^ 0x288AE5B9, (int)-891149255L ^ 0xCAE22439, (int)343572851L ^ 0x147A8172);
      GlStateManager.func_179090_x();
      GlStateManager.func_179132_a((int)864447624L ^ 0x33866C88);
      GL11.glEnable((int)420530979L ^ 0x1910C003);
      GL11.glHint((int)-1357947541L ^ 0xAF0F5139, (int)-1957430133L ^ 0x8B53ED89);
      GL11.glLineWidth(lineWidth);
      double dist = mc.field_71439_g.func_70011_f((pos.func_177958_n() + Float.intBitsToFloat(Float.floatToIntBits(3.7744505F) ^ 0x7F719099)), (pos.func_177956_o() + Float.intBitsToFloat(Float.floatToIntBits(24.744356F) ^ 0x7EC5F471)), (pos.func_177952_p() + Float.intBitsToFloat(Float.floatToIntBits(21.537138F) ^ 0x7EAC4C0F))) * Double.longBitsToDouble(Double.doubleToLongBits(13.892365786079507D) ^ 0x7FC3C8E42B168FC7L);
      if (box)
        RenderGlobal.func_189696_b(bb, color.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.124111645F) ^ 0x7E812E3F), color.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.07437415F) ^ 0x7EE75179), color.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.012537345F) ^ 0x7F326970), boxAlpha / Float.intBitsToFloat(Float.floatToIntBits(0.010097518F) ^ 0x7F5A700F)); 
      if (outline)
        RenderGlobal.func_189694_a(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c, bb.field_72336_d, bb.field_72337_e, bb.field_72334_f, color.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.010652081F) ^ 0x7F518611), color.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.0079374425F) ^ 0x7F7D0C0C), color.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.09343574F) ^ 0x7EC05B3D), color.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.010455671F) ^ 0x7F544E43)); 
      GL11.glDisable((int)-1672791816L ^ 0x9C4B33D8);
      GlStateManager.func_179132_a((int)-1530068611L ^ 0xA4CD017C);
      GlStateManager.func_179126_j();
      GlStateManager.func_179098_w();
      GlStateManager.func_179084_k();
      GlStateManager.func_179121_F();
    } 
  }
  
  public static void drawGradientFilledBox(BlockPos pos, Color startColor, Color endColor) {
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    Vec3d interp = EntityUtil.interpolateEntity((Entity)mc.field_71439_g, mc.func_184121_ak());
    drawGradientFilledBox(iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(6955.0536824254295D) ^ 0x7FDB49405E21A597L)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c), startColor, endColor);
  }
  
  public static void renderFive() {
    GL11.glPolygonOffset(Float.intBitsToFloat(Float.floatToIntBits(4.6929307F) ^ 0x7F162C7D), Float.intBitsToFloat(Float.floatToIntBits(7.63387E-6F) ^ 0x7EF43739));
    GL11.glDisable((int)-746293312L ^ 0xD3845DC2);
    GL11.glEnable((int)-174126449L ^ 0xF59F01FE);
    GL11.glDepthMask((int)1028806664L ^ 0x3D525809);
    GL11.glDisable((int)-380819047L ^ 0xE94D2209);
    GL11.glDisable((int)-1771576275L ^ 0x9667EF0D);
    GL11.glHint((int)1039668031L ^ 0x3DF81F6D, (int)-43319601L ^ 0xFD6AEFCF);
    GL11.glEnable((int)-286149542L ^ 0xEEF1BFB8);
    GL11.glEnable((int)-1098848199L ^ 0xBE80E369);
    GL11.glEnable((int)-1300240986L ^ 0xB27FE847);
    GL11.glEnable((int)155893735L ^ 0x94AB427);
    GL11.glPopAttrib();
  }
  
  public static void drawRoundedRectangle(float x, float y, float width, float height, float radius) {
    GL11.glEnable((int)1958077080L ^ 0x74B5E97A);
    drawArc(x + width - radius, y + height - radius, radius, Float.intBitsToFloat(Float.floatToIntBits(3.1083596E38F) ^ 0x7F69D8D4), Float.intBitsToFloat(Float.floatToIntBits(0.7450008F) ^ 0x7D8AB85F), (int)1840949500L ^ 0x6DBAA8EC);
    drawArc(x + radius, y + height - radius, radius, Float.intBitsToFloat(Float.floatToIntBits(0.014023391F) ^ 0x7ED1C25D), Float.intBitsToFloat(Float.floatToIntBits(0.078463726F) ^ 0x7E94B197), (int)-1736655056L ^ 0x987CBF20);
    drawArc(x + radius, y + radius, radius, Float.intBitsToFloat(Float.floatToIntBits(0.009357599F) ^ 0x7F2D509D), Float.intBitsToFloat(Float.floatToIntBits(0.025960019F) ^ 0x7F53AA1B), (int)1770343875L ^ 0x69854DD3);
    drawArc(x + width - radius, y + radius, radius, Float.intBitsToFloat(Float.floatToIntBits(0.06117059F) ^ 0x7EFD8E03), Float.intBitsToFloat(Float.floatToIntBits(0.019325178F) ^ 0x7F2A4FD6), (int)1063274034L ^ 0x3F604622);
    GL11.glBegin((int)-599376144L ^ 0xDC463EF4);
    GL11.glVertex2d((x + width - radius), y);
    GL11.glVertex2d((x + radius), y);
    GL11.glVertex2d((x + width - radius), (y + radius));
    GL11.glVertex2d((x + width - radius), (y + radius));
    GL11.glVertex2d((x + radius), y);
    GL11.glVertex2d((x + radius), (y + radius));
    GL11.glVertex2d((x + width), (y + radius));
    GL11.glVertex2d(x, (y + radius));
    GL11.glVertex2d(x, (y + height - radius));
    GL11.glVertex2d((x + width), (y + radius));
    GL11.glVertex2d(x, (y + height - radius));
    GL11.glVertex2d((x + width), (y + height - radius));
    GL11.glVertex2d((x + width - radius), (y + height - radius));
    GL11.glVertex2d((x + radius), (y + height - radius));
    GL11.glVertex2d((x + width - radius), (y + height));
    GL11.glVertex2d((x + width - radius), (y + height));
    GL11.glVertex2d((x + radius), (y + height - radius));
    GL11.glVertex2d((x + radius), (y + height));
    glEnd();
  }
  
  public static void drawTexturedRect(int x, int y, int textureX, int textureY, int width, int height, int zLevel) {
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder BufferBuilder2 = tessellator.func_178180_c();
    BufferBuilder2.func_181668_a((int)-1714326292L ^ 0x99D174EB, DefaultVertexFormats.field_181707_g);
    BufferBuilder2.func_181662_b((x + ((int)-617536148L ^ 0xDB31256C)), (y + height), zLevel).func_187315_a(((textureX + ((int)1228984244L ^ 0x4940CFB4)) * Float.intBitsToFloat(Float.floatToIntBits(3621.117F) ^ 0x7EE251DF)), ((textureY + height) * Float.intBitsToFloat(Float.floatToIntBits(18876.217F) ^ 0x7D13786F))).func_181675_d();
    BufferBuilder2.func_181662_b((x + width), (y + height), zLevel).func_187315_a(((textureX + width) * Float.intBitsToFloat(Float.floatToIntBits(2011.7292F) ^ 0x7F7B7756)), ((textureY + height) * Float.intBitsToFloat(Float.floatToIntBits(3498.2214F) ^ 0x7EDAA38B))).func_181675_d();
    BufferBuilder2.func_181662_b((x + width), (y + ((int)-233989813L ^ 0xF20D994B)), zLevel).func_187315_a(((textureX + width) * Float.intBitsToFloat(Float.floatToIntBits(6594.105F) ^ 0x7E4E10D7)), ((textureY + ((int)1373940135L ^ 0x51E4A9A7)) * Float.intBitsToFloat(Float.floatToIntBits(4761.062F) ^ 0x7E14C87F))).func_181675_d();
    BufferBuilder2.func_181662_b((x + ((int)88683653L ^ 0x5493485)), (y + ((int)-1069947600L ^ 0xC039E530)), zLevel).func_187315_a(((textureX + ((int)-44347978L ^ 0xFD5B4DB6)) * Float.intBitsToFloat(Float.floatToIntBits(1354.4525F) ^ 0x7F294E7B)), ((textureY + ((int)-1464267528L ^ 0xA8B90CF8)) * Float.intBitsToFloat(Float.floatToIntBits(18773.936F) ^ 0x7D12ABDF))).func_181675_d();
    tessellator.func_78381_a();
  }
  
  public static void drawEvenBetterGradientBox(BlockPos pos, Color startColor, Color midColor, Color endColor) {
    float red = startColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.114313446F) ^ 0x7E951D2B);
    float green = startColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.011612326F) ^ 0x7F4141A0);
    float blue = startColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.013276969F) ^ 0x7F2687A5);
    float alpha = startColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.03285652F) ^ 0x7E79948F);
    float red2 = endColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.114753954F) ^ 0x7E94041F);
    float green2 = endColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.0114336405F) ^ 0x7F44542A);
    float blue2 = endColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.05044658F) ^ 0x7E31A113);
    float alpha2 = endColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.013699846F) ^ 0x7F1F7552);
    float red3 = midColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.081902616F) ^ 0x7ED8BC8F);
    float green3 = midColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.0097147245F) ^ 0x7F602A82);
    float blue3 = midColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.100287534F) ^ 0x7EB2638D);
    float alpha3 = midColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.01397161F) ^ 0x7F1BE92E);
    AxisAlignedBB bb = new AxisAlignedBB(pos.func_177958_n() - (mc.func_175598_ae()).field_78730_l, pos.func_177956_o() - (mc.func_175598_ae()).field_78731_m, pos.func_177952_p() - (mc.func_175598_ae()).field_78728_n, (pos.func_177958_n() + ((int)1980394392L ^ 0x760A6B99)) - (mc.func_175598_ae()).field_78730_l, (pos.func_177956_o() + ((int)-1013239007L ^ 0xC39B3320)) - (mc.func_175598_ae()).field_78731_m, (pos.func_177952_p() + ((int)-2045603876L ^ 0x86128FDD)) - (mc.func_175598_ae()).field_78728_n);
    double offset = (bb.field_72337_e - bb.field_72338_b) / Double.longBitsToDouble(Double.doubleToLongBits(0.6154424181441444D) ^ 0x7FE3B1B44C50021BL);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder builder = tessellator.func_178180_c();
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)-1857061897L ^ 0x914F78F5, (int)1121330861L ^ 0x42D625AE, (int)676830810L ^ 0x28579E5A, (int)-652814811L ^ 0xD916D624);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)-111102483L ^ 0xF960B5ED);
    GL11.glEnable((int)-676332565L ^ 0xD7AFF0CB);
    GL11.glHint((int)-1247292494L ^ 0xB5A7DFE0, (int)-2016739407L ^ 0x87CAEEB3);
    builder.func_181668_a((int)-746964643L ^ 0xD37A3958, DefaultVertexFormats.field_181706_f);
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    builder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GL11.glDisable((int)-1758465812L ^ 0x972FFBCC);
    GlStateManager.func_179132_a((int)-738177368L ^ 0xD4004EA9);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static AxisAlignedBB interpolateAxis(AxisAlignedBB bb) {
    return new AxisAlignedBB(bb.field_72340_a - (mc.func_175598_ae()).field_78730_l, bb.field_72338_b - (mc.func_175598_ae()).field_78731_m, bb.field_72339_c - (mc.func_175598_ae()).field_78728_n, bb.field_72336_d - (mc.func_175598_ae()).field_78730_l, bb.field_72337_e - (mc.func_175598_ae()).field_78731_m, bb.field_72334_f - (mc.func_175598_ae()).field_78728_n);
  }
  
  public static float[][] getBipedRotations(ModelBiped biped) {
    float[][] rotations = new float[(int)-259101884L ^ 0xF08E6B41][];
    (new float[(int)-978891187L ^ 0xC5A74E4E])[(int)1055346937L ^ 0x3EE750F9] = biped.field_78116_c.field_78795_f;
    (new float[(int)-978891187L ^ 0xC5A74E4E])[(int)761901366L ^ 0x2D69B137] = biped.field_78116_c.field_78796_g;
    (new float[(int)-978891187L ^ 0xC5A74E4E])[(int)-1674867976L ^ 0x9C2B8AFA] = biped.field_78116_c.field_78808_h;
    float[] headRotation = new float[(int)-978891187L ^ 0xC5A74E4E];
    rotations[(int)1893886445L ^ 0x70E269ED] = headRotation;
    (new float[(int)1008065327L ^ 0x3C15DB2C])[(int)-1361947669L ^ 0xAED253EB] = biped.field_178723_h.field_78795_f;
    (new float[(int)1008065327L ^ 0x3C15DB2C])[(int)-330529802L ^ 0xEC4C83F7] = biped.field_178723_h.field_78796_g;
    (new float[(int)1008065327L ^ 0x3C15DB2C])[(int)-349189866L ^ 0xEB2FC914] = biped.field_178723_h.field_78808_h;
    float[] rightArmRotation = new float[(int)1008065327L ^ 0x3C15DB2C];
    rotations[(int)2040422938L ^ 0x799E621B] = rightArmRotation;
    (new float[(int)604244991L ^ 0x24040BFC])[(int)851960204L ^ 0x32C7E18C] = biped.field_178724_i.field_78795_f;
    (new float[(int)604244991L ^ 0x24040BFC])[(int)-437529187L ^ 0xE5EBD59C] = biped.field_178724_i.field_78796_g;
    (new float[(int)604244991L ^ 0x24040BFC])[(int)966604816L ^ 0x399D3812] = biped.field_178724_i.field_78808_h;
    float[] leftArmRotation = new float[(int)604244991L ^ 0x24040BFC];
    rotations[(int)-1384281535L ^ 0xAD7D8A43] = leftArmRotation;
    (new float[(int)219228853L ^ 0xD112AB6])[(int)834400227L ^ 0x31BBEFE3] = biped.field_178721_j.field_78795_f;
    (new float[(int)219228853L ^ 0xD112AB6])[(int)-1335186398L ^ 0xB06AAC23] = biped.field_178721_j.field_78796_g;
    (new float[(int)219228853L ^ 0xD112AB6])[(int)-930954765L ^ 0xC882C1F1] = biped.field_178721_j.field_78808_h;
    float[] rightLegRotation = new float[(int)219228853L ^ 0xD112AB6];
    rotations[(int)-1758857231L ^ 0x9729F7F2] = rightLegRotation;
    (new float[(int)320364795L ^ 0x131860F8])[(int)692707233L ^ 0x2949DFA1] = biped.field_178722_k.field_78795_f;
    (new float[(int)320364795L ^ 0x131860F8])[(int)973974712L ^ 0x3A0DACB9] = biped.field_178722_k.field_78796_g;
    (new float[(int)320364795L ^ 0x131860F8])[(int)1869263390L ^ 0x6F6AB21C] = biped.field_178722_k.field_78808_h;
    float[] leftLegRotation = new float[(int)320364795L ^ 0x131860F8];
    rotations[(int)1332484544L ^ 0x4F6C19C4] = leftLegRotation;
    return rotations;
  }
  
  public static void drawText(BlockPos pos, String text) {
    if (pos == null || text == null)
      return; 
    GlStateManager.func_179094_E();
    glBillboardDistanceScaled(pos.func_177958_n() + Float.intBitsToFloat(Float.floatToIntBits(29.227213F) ^ 0x7EE9D155), pos.func_177956_o() + Float.intBitsToFloat(Float.floatToIntBits(17.338785F) ^ 0x7E8AB5D5), pos.func_177952_p() + Float.intBitsToFloat(Float.floatToIntBits(3.6545725F) ^ 0x7F69E484), (EntityPlayer)mc.field_71439_g, Float.intBitsToFloat(Float.floatToIntBits(12.790467F) ^ 0x7ECCA5C1));
    GlStateManager.func_179097_i();
    GlStateManager.func_179137_b(-(WebHack.textManager.getStringWidth(text) / Double.longBitsToDouble(Double.doubleToLongBits(0.07185628482411764D) ^ 0x7FB2652C6954E6C7L)), Double.longBitsToDouble(Double.doubleToLongBits(1.1814729479947701E308D) ^ 0x7FE507EA25F47890L), Double.longBitsToDouble(Double.doubleToLongBits(1.205603317340048E308D) ^ 0x7FE575E0249D4EB9L));
    WebHack.textManager.drawStringWithShadow(text, Float.intBitsToFloat(Float.floatToIntBits(2.2428879E38F) ^ 0x7F28BC73), Float.intBitsToFloat(Float.floatToIntBits(1.6096801E38F) ^ 0x7EF2329F), (int)2006537570L ^ 0x8833FFC8);
    GlStateManager.func_179121_F();
  }
  
  public static void drawClock(float x, float y, float radius, int slices, int loops, float lineWidth, boolean fill, Color color) {
    Disk disk = new Disk();
    Date date = new Date();
    int hourAngle = ((int)-1468301571L ^ 0xA87B7E49) + -(Calendar.getInstance().get((int)2008612594L ^ 0x77B8FEF8) * ((int)1776743222L ^ 0x69E6F328) + Calendar.getInstance().get((int)-1174303810L ^ 0xBA018BB2) / ((int)-1963423203L ^ 0x8AF88A1F));
    int minuteAngle = ((int)-990595422L ^ 0xC4F4B616) + -(Calendar.getInstance().get((int)-664887503L ^ 0xD85E9F3D) * ((int)-201964078L ^ 0xF3F645D4) + Calendar.getInstance().get((int)73363493L ^ 0x45F7028) / ((int)888910564L ^ 0x34FBB2EE));
    int secondAngle = ((int)1798012030L ^ 0x6B2B7CCA) + -(Calendar.getInstance().get((int)842990303L ^ 0x323F02D2) * ((int)1458853365L ^ 0x56F455F3));
    int totalMinutesTime = Calendar.getInstance().get((int)1904719657L ^ 0x7187B725);
    int totalHoursTime = Calendar.getInstance().get((int)-1232884266L ^ 0xB683ADDC);
    if (fill) {
      GL11.glPushMatrix();
      GL11.glColor4f(color.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.015599978F) ^ 0x7F00970D), color.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.008681737F) ^ 0x7F713DD8), color.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.17197679F) ^ 0x7D4F1AAF), color.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.009924285F) ^ 0x7F5D9978));
      GL11.glBlendFunc((int)-2021979852L ^ 0x877B0A36, (int)375405958L ^ 0x16603E85);
      GL11.glEnable((int)-1933214804L ^ 0x8CC5704E);
      GL11.glLineWidth(lineWidth);
      GL11.glDisable((int)-2080645924L ^ 0x83FBD13D);
      disk.setOrientation((int)-2129184970L ^ 0x8116B182);
      disk.setDrawStyle((int)-1462529421L ^ 0xA8D214DF);
      GL11.glTranslated(x, y, Double.longBitsToDouble(Double.doubleToLongBits(4.1157113777530555E307D) ^ 0x7FCD4E09D8B80C2BL));
      disk.draw(Float.intBitsToFloat(Float.floatToIntBits(1.7910362E38F) ^ 0x7F06BE1A), radius, slices, loops);
      GL11.glEnable((int)-1350561092L ^ 0xAF801F5D);
      GL11.glDisable((int)-946596770L ^ 0xC7941FBC);
      GL11.glPopMatrix();
    } else {
      GL11.glPushMatrix();
      GL11.glColor4f(color.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.09689652F) ^ 0x7EB971AF), color.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.009480675F) ^ 0x7F6454D5), color.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.2883565F) ^ 0x7DECA377), color.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.123472385F) ^ 0x7E83DF17));
      GL11.glEnable((int)-172041365L ^ 0xF5BED089);
      GL11.glLineWidth(lineWidth);
      GL11.glDisable((int)-1275593839L ^ 0xB3F7F670);
      GL11.glBegin((int)1804314402L ^ 0x6B8BA721);
      ArrayList<Vec2f> hVectors = new ArrayList<>();
      float hue = (float)(System.currentTimeMillis() % (117330329L ^ 0x6FE4DB9L)) / Float.intBitsToFloat(Float.floatToIntBits(0.0022421156F) ^ 0x7EF3F075);
      for (int i = (int)-2035565183L ^ 0x86ABBD81; i <= ((int)-1627206436L ^ 0x9F02CDB4); i++) {
        Vec2f vec = new Vec2f(x + (float)Math.sin(i * Double.longBitsToDouble(Double.doubleToLongBits(0.630374011293326D) ^ 0x7FED0DFD4A1C34E0L) / Double.longBitsToDouble(Double.doubleToLongBits(0.11070334599177377D) ^ 0x7FDAD70DF297AA37L)) * radius, y + (float)Math.cos(i * Double.longBitsToDouble(Double.doubleToLongBits(0.14155673032706448D) ^ 0x7FCB3F7CBFE06A93L) / Double.longBitsToDouble(Double.doubleToLongBits(0.049416912585443944D) ^ 0x7FCFCD2C6ED8F8B7L)) * radius);
        hVectors.add(vec);
      } 
      Color color2 = new Color(Color.HSBtoRGB(hue, Float.intBitsToFloat(Float.floatToIntBits(27.733465F) ^ 0x7E5DDE23), Float.intBitsToFloat(Float.floatToIntBits(5.4531827F) ^ 0x7F2E8079)));
      for (int j = (int)-750442551L ^ 0xD34527C9; j < hVectors.size() - ((int)-1632277840L ^ 0x9EB56AB1); j++) {
        GL11.glColor4f(color2.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.119190626F) ^ 0x7E8B1A37), color2.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.007960378F) ^ 0x7F7D6C3F), color2.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.12435118F) ^ 0x7E81ABD5), color2.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.01423072F) ^ 0x7F1627F7));
        GL11.glVertex3d(((Vec2f)hVectors.get(j)).field_189982_i, ((Vec2f)hVectors.get(j)).field_189983_j, Double.longBitsToDouble(Double.doubleToLongBits(1.1816435768816928E308D) ^ 0x7FE508B1334F3111L));
        GL11.glVertex3d(((Vec2f)hVectors.get(j + ((int)-1123267528L ^ 0xBD0C4C39))).field_189982_i, ((Vec2f)hVectors.get(j + ((int)-557977250L ^ 0xDEBDF15F))).field_189983_j, Double.longBitsToDouble(Double.doubleToLongBits(1.5004776317302745E308D) ^ 0x7FEAB59A7AE72819L));
        color2 = new Color(Color.HSBtoRGB(hue += Float.intBitsToFloat(Float.floatToIntBits(79767.484F) ^ 0x7CADC0DF), Float.intBitsToFloat(Float.floatToIntBits(6.3642673F) ^ 0x7F4BA814), Float.intBitsToFloat(Float.floatToIntBits(10.613788F) ^ 0x7EA9D213)));
      } 
      GL11.glEnd();
      GL11.glEnable((int)999942838L ^ 0x3B99E757);
      GL11.glDisable((int)-454044279L ^ 0xE4EFDE6B);
      GL11.glPopMatrix();
    } 
    drawLine(x, y, x + (float)Math.sin(hourAngle * Double.longBitsToDouble(Double.doubleToLongBits(0.373741315432279D) ^ 0x7FDECA9BE5F8A8B3L) / Double.longBitsToDouble(Double.doubleToLongBits(0.03699033306742485D) ^ 0x7FC470659D95E1A3L)) * radius / Float.intBitsToFloat(Float.floatToIntBits(0.33937922F) ^ 0x7EADC31D), y + (float)Math.cos(hourAngle * Double.longBitsToDouble(Double.doubleToLongBits(0.8123631689233186D) ^ 0x7FE0DF1A5F2429A2L) / Double.longBitsToDouble(Double.doubleToLongBits(0.06887022255603419D) ^ 0x7FD7217A998BE16BL)) * radius / Float.intBitsToFloat(Float.floatToIntBits(0.33396164F) ^ 0x7EAAFD05), Float.intBitsToFloat(Float.floatToIntBits(7.7581005F) ^ 0x7F78425C), Color.WHITE.getRGB());
    drawLine(x, y, x + (float)Math.sin(minuteAngle * Double.longBitsToDouble(Double.doubleToLongBits(0.8863021470024822D) ^ 0x7FE57D6D05BC2F1BL) / Double.longBitsToDouble(Double.doubleToLongBits(0.46469463637560476D) ^ 0x7FBB3D8E92770787L)) * (radius - radius / Float.intBitsToFloat(Float.floatToIntBits(1.9783639F) ^ 0x7EDD3B07)), y + (float)Math.cos(minuteAngle * Double.longBitsToDouble(Double.doubleToLongBits(0.5485600364402516D) ^ 0x7FE8AC369348C416L) / Double.longBitsToDouble(Double.doubleToLongBits(0.23956091229164841D) ^ 0x7FA829EE95D8A59FL)) * (radius - radius / Float.intBitsToFloat(Float.floatToIntBits(0.5637178F) ^ 0x7E304FCF)), Float.intBitsToFloat(Float.floatToIntBits(5.6519113F) ^ 0x7F34DC75), Color.WHITE.getRGB());
    drawLine(x, y, x + (float)Math.sin(secondAngle * Double.longBitsToDouble(Double.doubleToLongBits(0.8749982947545151D) ^ 0x7FE2DE0738C4F543L) / Double.longBitsToDouble(Double.doubleToLongBits(0.014172046433914488D) ^ 0x7FEB863BDF9BC354L)) * (radius - radius / Float.intBitsToFloat(Float.floatToIntBits(1.9005138F) ^ 0x7ED34409)), y + (float)Math.cos(secondAngle * Double.longBitsToDouble(Double.doubleToLongBits(0.4586699961968907D) ^ 0x7FD47B223210B007L) / Double.longBitsToDouble(Double.doubleToLongBits(0.49609044489178394D) ^ 0x7FB93FF2232AC577L)) * (radius - radius / Float.intBitsToFloat(Float.floatToIntBits(0.5190956F) ^ 0x7E24E373)), Float.intBitsToFloat(Float.floatToIntBits(31.946432F) ^ 0x7E7F924B), Color.RED.getRGB());
  }
  
  public static void drawOpenGradientBox(BlockPos pos, Color startColor, Color endColor, double height) {
    EnumFacing[] arrayOfEnumFacing = EnumFacing.values();
    int i = arrayOfEnumFacing.length;
    for (int j = (int)1141201078L ^ 0x440558B6; j < i; j++) {
      EnumFacing face = arrayOfEnumFacing[j];
      if (face != EnumFacing.UP)
        drawGradientPlane(pos, face, startColor, endColor, height); 
    } 
  }
  
  public static void drawColoredBoundingBox(AxisAlignedBB bb, float width, float red, float green, float blue, float alpha) {
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)-233049591L ^ 0xF21BF10B, (int)-12152266L ^ 0xFF469135, (int)-205920670L ^ 0xF3B9E662, (int)-725325188L ^ 0xD4C46A7D);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)-2003754859L ^ 0x88912095);
    GL11.glEnable((int)60056255L ^ 0x394699F);
    GL11.glHint((int)-1519405684L ^ 0xA56FB9DE, (int)1014835559L ^ 0x3C7D3865);
    GL11.glLineWidth(width);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)-1065050783L ^ 0xC0849D62, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, Float.intBitsToFloat(Float.floatToIntBits(1.8783199E38F) ^ 0x7F0D4F20)).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, Float.intBitsToFloat(Float.floatToIntBits(1.3886268E38F) ^ 0x7ED0EFF5)).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, Float.intBitsToFloat(Float.floatToIntBits(1.0287128E38F) ^ 0x7E9AC893)).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, Float.intBitsToFloat(Float.floatToIntBits(1.7498537E38F) ^ 0x7F03A4F5)).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, Float.intBitsToFloat(Float.floatToIntBits(1.3248751E38F) ^ 0x7EC75855)).func_181675_d();
    tessellator.func_78381_a();
    GL11.glDisable((int)899326937L ^ 0x359AA8F9);
    GlStateManager.func_179132_a((int)1192401493L ^ 0x47129A54);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void glBillboardDistanceScaled(float x, float y, float z, EntityPlayer player, float scale) {
    glBillboard(x, y, z);
    int distance = (int)player.func_70011_f(x, y, z);
    float scaleDistance = distance / Float.intBitsToFloat(Float.floatToIntBits(0.718353F) ^ 0x7F37E5FB) / (Float.intBitsToFloat(Float.floatToIntBits(0.14093374F) ^ 0x7E1050EF) + Float.intBitsToFloat(Float.floatToIntBits(0.6820705F) ^ 0x7F2E9C2C) - scale);
    if (scaleDistance < Float.intBitsToFloat(Float.floatToIntBits(4.5307736F) ^ 0x7F10FC19))
      scaleDistance = Float.intBitsToFloat(Float.floatToIntBits(26.91596F) ^ 0x7E5753E3); 
    GlStateManager.func_179152_a(scaleDistance, scaleDistance, scaleDistance);
  }
  
  public static void drawArc(float cx, float cy, float r, float start_angle, float end_angle, int num_segments) {
    GL11.glBegin((int)-1337369929L ^ 0xB0495AB3);
    for (int i = (int)(num_segments / Float.intBitsToFloat(Float.floatToIntBits(0.025736492F) ^ 0x7F66D556) / start_angle) + ((int)542996872L ^ 0x205D7989); i <= num_segments / Float.intBitsToFloat(Float.floatToIntBits(0.031247383F) ^ 0x7F4BFA83) / end_angle; i++) {
      double previousangle = Double.longBitsToDouble(Double.doubleToLongBits(1.4613715477734663D) ^ 0x7FEE403C758BF3E4L) * (i - ((int)1804389667L ^ 0x6B8CCD22)) / num_segments;
      double angle = Double.longBitsToDouble(Double.doubleToLongBits(0.07307968924155782D) ^ 0x7FAB94A2EF0F746FL) * i / num_segments;
      GL11.glVertex2d(cx, cy);
      GL11.glVertex2d(cx + Math.cos(angle) * r, cy + Math.sin(angle) * r);
      GL11.glVertex2d(cx + Math.cos(previousangle) * r, cy + Math.sin(previousangle) * r);
    } 
    glEnd();
  }
  
  public static void blockESP(BlockPos b, Color c, double length, double length2) {
    blockEsp(b, c, length, length2);
  }
  
  public static void glStart(float n, float n2, float n3, float n4) {
    glrendermethod();
    GL11.glColor4f(n, n2, n3, n4);
  }
  
  public static void drawBoxESP(BlockPos pos, Color color, boolean secondC, Color secondColor, float lineWidth, boolean outline, boolean box, int boxAlpha, boolean air, double height, boolean gradientBox, boolean gradientOutline, boolean invertGradientBox, boolean invertGradientOutline, int gradientAlpha) {
    if (box)
      drawBox(pos, new Color(color.getRed(), color.getGreen(), color.getBlue(), boxAlpha), height, gradientBox, invertGradientBox, gradientAlpha); 
    if (outline)
      drawBlockOutline(pos, secondC ? secondColor : color, lineWidth, air, height, gradientOutline, invertGradientOutline, gradientAlpha); 
  }
  
  public static void drawCircle(float x, float y, float radius) {
    drawCircle(x, y, radius, (int)-777281200L ^ 0xD1ABA150, (int)508380295L ^ 0x1E4D45EF, (int)1947694572L ^ 0x741775AC);
  }
  
  public static void drawOutlineRect(float x, float y, float w, float h, int color) {
    float alpha = (color >> ((int)1277180026L ^ 0x4C203862) & ((int)-838978966L ^ 0xCDFE3295)) / Float.intBitsToFloat(Float.floatToIntBits(0.053262558F) ^ 0x7E2529D7);
    float red = (color >> ((int)-578309350L ^ 0xDD87B30A) & ((int)-1149901560L ^ 0xBB75E5F7)) / Float.intBitsToFloat(Float.floatToIntBits(0.009766555F) ^ 0x7F5F03E7);
    float green = (color >> ((int)-1865719635L ^ 0x90CB60A5) & ((int)-1448971691L ^ 0xA9A272AA)) / Float.intBitsToFloat(Float.floatToIntBits(0.081807844F) ^ 0x7ED88ADF);
    float blue = (color & ((int)-73712766L ^ 0xFB9B3B7D)) / Float.intBitsToFloat(Float.floatToIntBits(0.014247316F) ^ 0x7F166D93);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    GlStateManager.func_179147_l();
    GlStateManager.func_179090_x();
    GlStateManager.func_187441_d(Float.intBitsToFloat(Float.floatToIntBits(339.3867F) ^ 0x7C29B17F));
    GlStateManager.func_179120_a((int)1890908538L ^ 0x70B4FA78, (int)-599815624L ^ 0xDC3F893B, (int)366124057L ^ 0x15D29C18, (int)-978014330L ^ 0xC5B4AF86);
    bufferbuilder.func_181668_a((int)1177112033L ^ 0x46294DE3, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(x, h, Double.longBitsToDouble(Double.doubleToLongBits(1.0910702273546847E308D) ^ 0x7FE36BF42F7EBE5BL)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(w, h, Double.longBitsToDouble(Double.doubleToLongBits(1.442809695536817E308D) ^ 0x7FE9AED03F20365EL)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(w, y, Double.longBitsToDouble(Double.doubleToLongBits(8.523914838094891E307D) ^ 0x7FDE589CE6C26009L)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(x, y, Double.longBitsToDouble(Double.doubleToLongBits(7.326024480382686E307D) ^ 0x7FDA14DE076959D5L)).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
  }
  
  public static void checkSetupFBO() {
    Framebuffer fbo = mc.field_147124_at;
    if (fbo != null && fbo.field_147624_h > ((int)-1836892321L ^ 0x6D7CC0A0)) {
      setupFBO(fbo);
      fbo.field_147624_h = (int)87244102L ^ 0xFACCC2B9;
    } 
  }
  
  public static void GLPost(boolean depth, boolean texture, boolean clean, boolean bind, boolean override) {
    GlStateManager.func_179132_a((int)914458968L ^ 0x36818959);
    if (!override)
      GL11.glDisable((int)1025784774L ^ 0x3D2430E6); 
    if (bind)
      GL11.glEnable((int)788562758L ^ 0x2F008837); 
    if (clean)
      GL11.glEnable((int)890005918L ^ 0x350C647F); 
    if (!texture)
      GL11.glDisable((int)694669768L ^ 0x2967DA2A); 
    if (depth)
      GL11.glEnable((int)-744398786L ^ 0xD3A16B6E); 
  }
  
  public static void drawBoxESP2(BlockPos pos, Color color, float lineWidth, boolean outline, boolean box, int boxAlpha, float height) {
    AxisAlignedBB bb = new AxisAlignedBB(pos.func_177958_n() - (mc.func_175598_ae()).field_78730_l, pos.func_177956_o() - (mc.func_175598_ae()).field_78731_m, pos.func_177952_p() - (mc.func_175598_ae()).field_78728_n, (pos.func_177958_n() + ((int)-1268498885L ^ 0xB4643E3A)) - (mc.func_175598_ae()).field_78730_l, (pos.func_177956_o() + height) - (mc.func_175598_ae()).field_78731_m, (pos.func_177952_p() + ((int)-770124093L ^ 0xD218D6C2)) - (mc.func_175598_ae()).field_78728_n);
    camera.func_78547_a(((Entity)Objects.requireNonNull((T)mc.func_175606_aa())).field_70165_t, (mc.func_175606_aa()).field_70163_u, (mc.func_175606_aa()).field_70161_v);
    if (camera.func_78546_a(new AxisAlignedBB(pos))) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179147_l();
      GlStateManager.func_179097_i();
      GlStateManager.func_179120_a((int)-873057295L ^ 0xCBF630F3, (int)1366098162L ^ 0x516D03F1, (int)453141757L ^ 0x1B0264FD, (int)-593112332L ^ 0xDCA5D2F5);
      GlStateManager.func_179090_x();
      GlStateManager.func_179132_a((int)-349799906L ^ 0xEB267A1E);
      GL11.glEnable((int)-1782347723L ^ 0x95C38315);
      GL11.glHint((int)-1411905600L ^ 0xABD80B92, (int)302485171L ^ 0x12079FB1);
      GL11.glLineWidth(lineWidth);
      if (box)
        RenderGlobal.func_189696_b(bb, color.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.008776296F) ^ 0x7F70CA74), color.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.065951444F) ^ 0x7EF8118D), color.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.08182714F) ^ 0x7ED894FD), boxAlpha / Float.intBitsToFloat(Float.floatToIntBits(0.007852197F) ^ 0x7F7FA680)); 
      if (outline)
        RenderGlobal.func_189694_a(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c, bb.field_72336_d, bb.field_72337_e, bb.field_72334_f, color.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.1416776F) ^ 0x7D6E13EF), color.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.007985036F) ^ 0x7F7DD3AB), color.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.07075355F) ^ 0x7EEFE73D), color.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.0126460185F) ^ 0x7F30313F)); 
      GL11.glDisable((int)381248642L ^ 0x16B96FA2);
      GlStateManager.func_179132_a((int)-1220657435L ^ 0xB73E3EE4);
      GlStateManager.func_179126_j();
      GlStateManager.func_179098_w();
      GlStateManager.func_179084_k();
      GlStateManager.func_179121_F();
    } 
  }
  
  public static void drawOutlinedBox(AxisAlignedBB axisAlignedBB) {
    GL11.glBegin((int)-1795006202L ^ 0x95026107);
    GL11.glVertex3d(axisAlignedBB.field_72340_a, axisAlignedBB.field_72338_b, axisAlignedBB.field_72339_c);
    GL11.glVertex3d(axisAlignedBB.field_72336_d, axisAlignedBB.field_72338_b, axisAlignedBB.field_72339_c);
    GL11.glVertex3d(axisAlignedBB.field_72336_d, axisAlignedBB.field_72338_b, axisAlignedBB.field_72339_c);
    GL11.glVertex3d(axisAlignedBB.field_72336_d, axisAlignedBB.field_72338_b, axisAlignedBB.field_72334_f);
    GL11.glVertex3d(axisAlignedBB.field_72336_d, axisAlignedBB.field_72338_b, axisAlignedBB.field_72334_f);
    GL11.glVertex3d(axisAlignedBB.field_72340_a, axisAlignedBB.field_72338_b, axisAlignedBB.field_72334_f);
    GL11.glVertex3d(axisAlignedBB.field_72340_a, axisAlignedBB.field_72338_b, axisAlignedBB.field_72334_f);
    GL11.glVertex3d(axisAlignedBB.field_72340_a, axisAlignedBB.field_72338_b, axisAlignedBB.field_72339_c);
    GL11.glVertex3d(axisAlignedBB.field_72340_a, axisAlignedBB.field_72338_b, axisAlignedBB.field_72339_c);
    GL11.glVertex3d(axisAlignedBB.field_72340_a, axisAlignedBB.field_72337_e, axisAlignedBB.field_72339_c);
    GL11.glVertex3d(axisAlignedBB.field_72336_d, axisAlignedBB.field_72338_b, axisAlignedBB.field_72339_c);
    GL11.glVertex3d(axisAlignedBB.field_72336_d, axisAlignedBB.field_72337_e, axisAlignedBB.field_72339_c);
    GL11.glVertex3d(axisAlignedBB.field_72336_d, axisAlignedBB.field_72338_b, axisAlignedBB.field_72334_f);
    GL11.glVertex3d(axisAlignedBB.field_72336_d, axisAlignedBB.field_72337_e, axisAlignedBB.field_72334_f);
    GL11.glVertex3d(axisAlignedBB.field_72340_a, axisAlignedBB.field_72338_b, axisAlignedBB.field_72334_f);
    GL11.glVertex3d(axisAlignedBB.field_72340_a, axisAlignedBB.field_72337_e, axisAlignedBB.field_72334_f);
    GL11.glVertex3d(axisAlignedBB.field_72340_a, axisAlignedBB.field_72337_e, axisAlignedBB.field_72339_c);
    GL11.glVertex3d(axisAlignedBB.field_72336_d, axisAlignedBB.field_72337_e, axisAlignedBB.field_72339_c);
    GL11.glVertex3d(axisAlignedBB.field_72336_d, axisAlignedBB.field_72337_e, axisAlignedBB.field_72339_c);
    GL11.glVertex3d(axisAlignedBB.field_72336_d, axisAlignedBB.field_72337_e, axisAlignedBB.field_72334_f);
    GL11.glVertex3d(axisAlignedBB.field_72336_d, axisAlignedBB.field_72337_e, axisAlignedBB.field_72334_f);
    GL11.glVertex3d(axisAlignedBB.field_72340_a, axisAlignedBB.field_72337_e, axisAlignedBB.field_72334_f);
    GL11.glVertex3d(axisAlignedBB.field_72340_a, axisAlignedBB.field_72337_e, axisAlignedBB.field_72334_f);
    GL11.glVertex3d(axisAlignedBB.field_72340_a, axisAlignedBB.field_72337_e, axisAlignedBB.field_72339_c);
    GL11.glEnd();
  }
  
  public static void drawOutlinedRoundedRectangle(int x, int y, int width, int height, float radius, float dR, float dG, float dB, float dA, float outlineWidth) {
    drawRoundedRectangle(x, y, width, height, radius);
    GL11.glColor4f(dR, dG, dB, dA);
    drawRoundedRectangle(x + outlineWidth, y + outlineWidth, width - outlineWidth * Float.intBitsToFloat(Float.floatToIntBits(0.56581104F) ^ 0x7F10D8FE), height - outlineWidth * Float.intBitsToFloat(Float.floatToIntBits(0.87731385F) ^ 0x7F6097A4), radius);
  }
  
  public static AxisAlignedBB getBoundingBox(BlockPos blockPos) {
    return mc.field_71441_e.func_180495_p(blockPos).func_185900_c((IBlockAccess)mc.field_71441_e, blockPos).func_186670_a(blockPos);
  }
  
  public static void drawGradientBlockOutline(BlockPos pos, Color startColor, Color endColor, float linewidth, double height) {
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    Vec3d interp = EntityUtil.interpolateEntity((Entity)mc.field_71439_g, mc.func_184121_ak());
    drawGradientBlockOutline(iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(797.0048336026256D) ^ 0x7FE88A4406332997L)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c).func_72321_a(Double.longBitsToDouble(Double.doubleToLongBits(5.99599012832234E307D) ^ 0x7FD558AFDC650D27L), height, Double.longBitsToDouble(Double.doubleToLongBits(1.6359990651326918E307D) ^ 0x7FB74C22684AF2BFL)), startColor, endColor, linewidth);
  }
  
  public static void drawRectangle(float x, float y, float width, float height) {
    GL11.glEnable((int)-569989545L ^ 0xDE06ADB5);
    GL11.glBlendFunc((int)364217178L ^ 0x15B58058, (int)-1067896972L ^ 0xC0592C77);
    GL11.glBegin((int)1459669214L ^ 0x5700C8DC);
    GL11.glVertex2d(width, Double.longBitsToDouble(Double.doubleToLongBits(6.936311491425645E307D) ^ 0x7FD8B1AFCA56E3E3L));
    GL11.glVertex2d(Double.longBitsToDouble(Double.doubleToLongBits(8.496565300792311E307D) ^ 0x7FDE3FAFD1C2021BL), Double.longBitsToDouble(Double.doubleToLongBits(1.6890236719997058E307D) ^ 0x7FB80D705807BC5FL));
    GL11.glVertex2d(Double.longBitsToDouble(Double.doubleToLongBits(1.0022478977673508E308D) ^ 0x7FE1D731DFE80BF8L), height);
    GL11.glVertex2d(width, height);
    glEnd();
  }
  
  public static void hexColor(int hexColor) {
    float red = (hexColor >> ((int)-1049630880L ^ 0xC16FE770) & ((int)530588433L ^ 0x1FA023EE)) / Float.intBitsToFloat(Float.floatToIntBits(0.01240863F) ^ 0x7F344D91);
    float green = (hexColor >> ((int)1864531337L ^ 0x6F227D81) & ((int)-602572531L ^ 0xDC1579F2)) / Float.intBitsToFloat(Float.floatToIntBits(0.013209278F) ^ 0x7F276BBA);
    float blue = (hexColor & ((int)534003410L ^ 0x1FD43E2D)) / Float.intBitsToFloat(Float.floatToIntBits(0.013977364F) ^ 0x7F1A0150);
    float alpha = (hexColor >> ((int)1344667437L ^ 0x5025FF35) & ((int)1815848599L ^ 0x6C3BA668)) / Float.intBitsToFloat(Float.floatToIntBits(0.5413894F) ^ 0x7C75987F);
    GL11.glColor4f(red, green, blue, alpha);
  }
  
  public static void glEnd() {
    GL11.glColor4f(Float.intBitsToFloat(Float.floatToIntBits(20.588583F) ^ 0x7E24B56B), Float.intBitsToFloat(Float.floatToIntBits(13.628463F) ^ 0x7EDA0E2F), Float.intBitsToFloat(Float.floatToIntBits(4.784065F) ^ 0x7F19170F), Float.intBitsToFloat(Float.floatToIntBits(4.4164824F) ^ 0x7F0D53D3));
    GL11.glPopMatrix();
    GL11.glEnable((int)22153194L ^ 0x1520C9B);
    GL11.glEnable((int)1845090292L ^ 0x6DF9DA15);
    GL11.glDisable((int)1697845874L ^ 0x65331990);
    GL11.glDisable((int)-85317211L ^ 0xFAEA2285);
  }
  
  public static boolean isInViewFrustrum(Entity entity) {
    return (isInViewFrustrum(entity.func_174813_aQ()) || entity.field_70158_ak) ? ((int)-378634955L ^ 0xE96E7D34) : ((int)722729309L ^ 0x2B13F95D);
  }
  
  public static void updateModelViewProjectionMatrix() {
    GL11.glGetFloat((int)-1875924440L ^ 0x902FA18E, modelView);
    GL11.glGetFloat((int)1680608610L ^ 0x642C06C5, projection);
    GL11.glGetInteger((int)1294256102L ^ 0x4D24CC44, viewport);
    ScaledResolution res = new ScaledResolution(Minecraft.func_71410_x());
  }
  
  public static int getRainbow(int speed, int offset, float s, float b) {
    float hue = (float)((System.currentTimeMillis() + offset) % speed);
    return Color.getHSBColor(hue /= speed, s, b).getRGB();
  }
  
  public static void drawGradientRect(float x, float y, float w, float h, int startColor, int endColor) {
    float f = (startColor >> ((int)-1612109586L ^ 0x9FE928F6) & ((int)-790763260L ^ 0xD0DDE9FB)) / Float.intBitsToFloat(Float.floatToIntBits(0.010743826F) ^ 0x7F4F06DF);
    float f2 = (startColor >> ((int)-69239465L ^ 0xFBDF7D47) & ((int)-1217402538L ^ 0xB76FE9A9)) / Float.intBitsToFloat(Float.floatToIntBits(0.42603275F) ^ 0x7DA520F7);
    float f3 = (startColor >> ((int)1409467254L ^ 0x5402C37E) & ((int)-1826005857L ^ 0x93295C60)) / Float.intBitsToFloat(Float.floatToIntBits(0.11212016F) ^ 0x7E9A9F41);
    float f4 = (startColor & ((int)-322456720L ^ 0xECC7B38F)) / Float.intBitsToFloat(Float.floatToIntBits(0.10968699F) ^ 0x7E9FA393);
    float f5 = (endColor >> ((int)1976502672L ^ 0x75CF0988) & ((int)-1313782780L ^ 0xB1B144FB)) / Float.intBitsToFloat(Float.floatToIntBits(0.35670778F) ^ 0x7DC9A267);
    float f6 = (endColor >> ((int)-1333600114L ^ 0xB082E09E) & ((int)2136638226L ^ 0x7F5A83ED)) / Float.intBitsToFloat(Float.floatToIntBits(0.010549928F) ^ 0x7F53D99B);
    float f7 = (endColor >> ((int)576356217L ^ 0x225A7F71) & ((int)-1935845145L ^ 0x8C9D5818)) / Float.intBitsToFloat(Float.floatToIntBits(0.009885563F) ^ 0x7F5EF70E);
    float f8 = (endColor & ((int)1333663968L ^ 0x4F7E181F)) / Float.intBitsToFloat(Float.floatToIntBits(0.09275802F) ^ 0x7EC2F7EB);
    GlStateManager.func_179090_x();
    GlStateManager.func_179147_l();
    GlStateManager.func_179118_c();
    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
    GlStateManager.func_179103_j((int)298929128L ^ 0x11D156E9);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder vertexbuffer = tessellator.func_178180_c();
    vertexbuffer.func_181668_a((int)-227782862L ^ 0xF26C4F35, DefaultVertexFormats.field_181706_f);
    vertexbuffer.func_181662_b(x + w, y, Double.longBitsToDouble(Double.doubleToLongBits(1.1173913184217653E308D) ^ 0x7FE3E3E5D4D62B81L)).func_181666_a(f2, f3, f4, f).func_181675_d();
    vertexbuffer.func_181662_b(x, y, Double.longBitsToDouble(Double.doubleToLongBits(1.071828949232819E308D) ^ 0x7FE31445B458454EL)).func_181666_a(f2, f3, f4, f).func_181675_d();
    vertexbuffer.func_181662_b(x, y + h, Double.longBitsToDouble(Double.doubleToLongBits(5.239411837226598E307D) ^ 0x7FD2A7261CCD6F17L)).func_181666_a(f6, f7, f8, f5).func_181675_d();
    vertexbuffer.func_181662_b(x + w, y + h, Double.longBitsToDouble(Double.doubleToLongBits(1.2243584729434532E308D) ^ 0x7FE5CB5786047263L)).func_181666_a(f6, f7, f8, f5).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179103_j((int)-164912793L ^ 0xF62BBC67);
    GlStateManager.func_179084_k();
    GlStateManager.func_179141_d();
    GlStateManager.func_179098_w();
  }
  
  public static void drawBlockOutline(BlockPos pos, Color color, float linewidth, boolean air, double height, boolean gradient, boolean invert, int alpha) {
    if (gradient) {
      Color endColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
      drawGradientBlockOutline(pos, invert ? endColor : color, invert ? color : endColor, linewidth, height);
      return;
    } 
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    if ((air || iblockstate.func_185904_a() != Material.field_151579_a) && mc.field_71441_e.func_175723_af().func_177746_a(pos)) {
      AxisAlignedBB blockAxis = new AxisAlignedBB(pos.func_177958_n() - (mc.func_175598_ae()).field_78730_l, pos.func_177956_o() - (mc.func_175598_ae()).field_78731_m, pos.func_177952_p() - (mc.func_175598_ae()).field_78728_n, (pos.func_177958_n() + ((int)411903674L ^ 0x188D26BB)) - (mc.func_175598_ae()).field_78730_l, (pos.func_177956_o() + ((int)976750767L ^ 0x3A3808AE)) - (mc.func_175598_ae()).field_78731_m + height, (pos.func_177952_p() + ((int)629056563L ^ 0x257EA432)) - (mc.func_175598_ae()).field_78728_n);
      drawBlockOutline(blockAxis.func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(673.0806066156622D) ^ 0x7FE56AE8F514D0E2L)), color, linewidth);
    } 
  }
  
  public static void drawProperGradientBlockOutline(BlockPos pos, Color startColor, Color midColor, Color endColor, float linewidth) {
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    Vec3d interp = EntityUtil.interpolateEntity((Entity)mc.field_71439_g, mc.func_184121_ak());
    drawProperGradientBlockOutline(iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(5521.3152417139D) ^ 0x7FD5F31D53AE5389L)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c), startColor, midColor, endColor, linewidth);
  }
  
  public static void drawBoxESP(BlockPos pos, Color color, boolean secondC, Color secondColor, float lineWidth, boolean outline, boolean box, int boxAlpha, boolean air) {
    if (box)
      drawBox(pos, new Color(color.getRed(), color.getGreen(), color.getBlue(), boxAlpha)); 
    if (outline)
      drawBlockOutline(pos, secondC ? secondColor : color, lineWidth, air); 
  }
  
  public static void drawBox(BlockPos pos, Color color, double height, boolean gradient, boolean invert, int alpha) {
    if (gradient) {
      Color endColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), alpha);
      drawOpenGradientBox(pos, invert ? endColor : color, invert ? color : endColor, height);
      return;
    } 
    AxisAlignedBB bb = new AxisAlignedBB(pos.func_177958_n() - (mc.func_175598_ae()).field_78730_l, pos.func_177956_o() - (mc.func_175598_ae()).field_78731_m, pos.func_177952_p() - (mc.func_175598_ae()).field_78728_n, (pos.func_177958_n() + ((int)604935876L ^ 0x240E96C5)) - (mc.func_175598_ae()).field_78730_l, (pos.func_177956_o() + ((int)-925724454L ^ 0xC8D290DB)) - (mc.func_175598_ae()).field_78731_m + height, (pos.func_177952_p() + ((int)-914838133L ^ 0xC978AD8A)) - (mc.func_175598_ae()).field_78728_n);
    camera.func_78547_a(((Entity)Objects.requireNonNull((T)mc.func_175606_aa())).field_70165_t, (mc.func_175606_aa()).field_70163_u, (mc.func_175606_aa()).field_70161_v);
    if (camera.func_78546_a(new AxisAlignedBB(bb.field_72340_a + (mc.func_175598_ae()).field_78730_l, bb.field_72338_b + (mc.func_175598_ae()).field_78731_m, bb.field_72339_c + (mc.func_175598_ae()).field_78728_n, bb.field_72336_d + (mc.func_175598_ae()).field_78730_l, bb.field_72337_e + (mc.func_175598_ae()).field_78731_m, bb.field_72334_f + (mc.func_175598_ae()).field_78728_n))) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179147_l();
      GlStateManager.func_179097_i();
      GlStateManager.func_179120_a((int)997817472L ^ 0x3B797F82, (int)1620081573L ^ 0x609078A6, (int)1652907655L ^ 0x62855E87, (int)-136875075L ^ 0xF7D773BC);
      GlStateManager.func_179090_x();
      GlStateManager.func_179132_a((int)-905248949L ^ 0xCA0AFF4B);
      GL11.glEnable((int)235907695L ^ 0xE0FA14F);
      GL11.glHint((int)-943704384L ^ 0xC7C03A92, (int)1425867413L ^ 0x54FD1397);
      RenderGlobal.func_189696_b(bb, color.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.008069478F) ^ 0x7F7B35D8), color.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.009787437F) ^ 0x7F5F5B7C), color.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.44730923F) ^ 0x7D9A05B7), color.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.11092349F) ^ 0x7E9C2BDB));
      GL11.glDisable((int)1594999653L ^ 0x5F11C845);
      GlStateManager.func_179132_a((int)1436667166L ^ 0x55A1CD1F);
      GlStateManager.func_179126_j();
      GlStateManager.func_179098_w();
      GlStateManager.func_179084_k();
      GlStateManager.func_179121_F();
    } 
  }
  
  public static void setupFBO(Framebuffer fbo) {
    EXTFramebufferObject.glDeleteRenderbuffersEXT(fbo.field_147624_h);
    int stencilDepthBufferID = EXTFramebufferObject.glGenRenderbuffersEXT();
    EXTFramebufferObject.glBindRenderbufferEXT((int)1404841103L ^ 0x53BCA1CE, stencilDepthBufferID);
    EXTFramebufferObject.glRenderbufferStorageEXT((int)213855888L ^ 0xCBFA3D1, (int)1295267157L ^ 0x4D34B1AC, mc.field_71443_c, mc.field_71440_d);
    EXTFramebufferObject.glFramebufferRenderbufferEXT((int)-351596611L ^ 0xEB0B82FD, (int)-224111992L ^ 0xF2A4DFA8, (int)-1145652265L ^ 0xBBB63696, stencilDepthBufferID);
    EXTFramebufferObject.glFramebufferRenderbufferEXT((int)-1974588533L ^ 0x8A4EA6CB, (int)-397026581L ^ 0xE85557EB, (int)-1811911585L ^ 0x9400E11E, stencilDepthBufferID);
  }
  
  public static void drawBoundingBox(AxisAlignedBB bb, float width, int color) {
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)234353733L ^ 0xDF7F747, (int)-364145663L ^ 0xEA4B9702, (int)-1642315479L ^ 0x9E1C4129, (int)-1395902580L ^ 0xACCC378D);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)-1401815471L ^ 0xAC71FE51);
    GL11.glEnable((int)-1124529901L ^ 0xBCF90233);
    GL11.glHint((int)-1992615945L ^ 0x893B1BA5, (int)872559694L ^ 0x3402254C);
    GL11.glLineWidth(width);
    float alpha = (color >> ((int)-1131859966L ^ 0xBC89301A) & ((int)518434863L ^ 0x1EE6B0D0)) / Float.intBitsToFloat(Float.floatToIntBits(0.014133762F) ^ 0x7F18914B);
    float red = (color >> ((int)-1993282303L ^ 0x8930ED11) & ((int)-2010737493L ^ 0x88269454)) / Float.intBitsToFloat(Float.floatToIntBits(0.050726634F) ^ 0x7E30C6BB);
    float green = (color >> ((int)-1584913810L ^ 0xA1882266) & ((int)674096307L ^ 0x282DE44C)) / Float.intBitsToFloat(Float.floatToIntBits(0.23755334F) ^ 0x7D0C412F);
    float blue = (color & ((int)-1332364296L ^ 0xB095BB07)) / Float.intBitsToFloat(Float.floatToIntBits(0.098430924F) ^ 0x7EB69627);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)-1926685281L ^ 0x8D291D9C, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GL11.glDisable((int)2138606456L ^ 0x7F788058);
    GlStateManager.func_179132_a((int)519090478L ^ 0x1EF0B12F);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void drawGradientPlane(BlockPos pos, EnumFacing face, Color startColor, Color endColor, double height) {
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder builder = tessellator.func_178180_c();
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    Vec3d interp = EntityUtil.interpolateEntity((Entity)mc.field_71439_g, mc.func_184121_ak());
    AxisAlignedBB bb = iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(907.8457959473069D) ^ 0x7FEC3C89D0AA662EL)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c).func_72321_a(Double.longBitsToDouble(Double.doubleToLongBits(1.1256122466463684E307D) ^ 0x7FB0077CF5558E47L), height, Double.longBitsToDouble(Double.doubleToLongBits(4.4064708017724363E307D) ^ 0x7FCF600771513687L));
    float red = startColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.007885499F) ^ 0x7F7E322E);
    float green = startColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.46712777F) ^ 0x7D902B5F);
    float blue = startColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.25815174F) ^ 0x7DFB2C77);
    float alpha = startColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.03639796F) ^ 0x7E6A1607);
    float red2 = endColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.10044197F) ^ 0x7EB2B485);
    float green2 = endColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.013789312F) ^ 0x7F1EEC91);
    float blue2 = endColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.009113263F) ^ 0x7F6A4FCC);
    float alpha2 = endColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.0137789715F) ^ 0x7F1EC132);
    double x1 = Double.longBitsToDouble(Double.doubleToLongBits(1.6496743467323868E308D) ^ 0x7FED5D7C500F0633L);
    double y1 = Double.longBitsToDouble(Double.doubleToLongBits(3.787337365999587E307D) ^ 0x7FCAF77C165C15DFL);
    double z1 = Double.longBitsToDouble(Double.doubleToLongBits(1.1783376830566443E307D) ^ 0x7FB0C7B3B09DD1EFL);
    double x2 = Double.longBitsToDouble(Double.doubleToLongBits(1.0469093902545764E308D) ^ 0x7FE2A2B70EA77176L);
    double y2 = Double.longBitsToDouble(Double.doubleToLongBits(6.912204158574814E307D) ^ 0x7FD89BB72A8D23F3L);
    double z2 = Double.longBitsToDouble(Double.doubleToLongBits(3.11335250692728E307D) ^ 0x7FC62AF5502A4DDFL);
    if (face == EnumFacing.DOWN) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72336_d;
      y1 = bb.field_72338_b;
      y2 = bb.field_72338_b;
      z1 = bb.field_72339_c;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.UP) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72336_d;
      y1 = bb.field_72337_e;
      y2 = bb.field_72337_e;
      z1 = bb.field_72339_c;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.EAST) {
      x1 = bb.field_72336_d;
      x2 = bb.field_72336_d;
      y1 = bb.field_72338_b;
      y2 = bb.field_72337_e;
      z1 = bb.field_72339_c;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.WEST) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72340_a;
      y1 = bb.field_72338_b;
      y2 = bb.field_72337_e;
      z1 = bb.field_72339_c;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.SOUTH) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72336_d;
      y1 = bb.field_72338_b;
      y2 = bb.field_72337_e;
      z1 = bb.field_72334_f;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.NORTH) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72336_d;
      y1 = bb.field_72338_b;
      y2 = bb.field_72337_e;
      z1 = bb.field_72339_c;
      z2 = bb.field_72339_c;
    } 
    GlStateManager.func_179094_E();
    GlStateManager.func_179097_i();
    GlStateManager.func_179090_x();
    GlStateManager.func_179147_l();
    GlStateManager.func_179118_c();
    GlStateManager.func_179132_a((int)-478127486L ^ 0xE3805A82);
    builder.func_181668_a((int)323582754L ^ 0x13497B27, DefaultVertexFormats.field_181706_f);
    if (face == EnumFacing.EAST || face == EnumFacing.WEST || face == EnumFacing.NORTH || face == EnumFacing.SOUTH) {
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    } else if (face == EnumFacing.UP) {
      builder.func_181662_b(x1, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    } else if (face == EnumFacing.DOWN) {
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
    } 
    tessellator.func_78381_a();
    GlStateManager.func_179132_a((int)426521873L ^ 0x196C3510);
    GlStateManager.func_179084_k();
    GlStateManager.func_179141_d();
    GlStateManager.func_179098_w();
    GlStateManager.func_179126_j();
    GlStateManager.func_179121_F();
  }
  
  public static void drawGradientFilledBox(AxisAlignedBB bb, Color startColor, Color endColor) {
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)550058784L ^ 0x20C93822, (int)-1600022778L ^ 0xA0A19405, (int)-2123398118L ^ 0x816F841A, (int)1691068137L ^ 0x64CBA6E8);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)-1875418426L ^ 0x903762C6);
    float alpha = endColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.08173793F) ^ 0x7ED86637);
    float red = endColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.04639105F) ^ 0x7E41048B);
    float green = endColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.11650985F) ^ 0x7E919CB7);
    float blue = endColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.009769376F) ^ 0x7F5F0FBC);
    float alpha2 = startColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.013940632F) ^ 0x7F1B6740);
    float red2 = startColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.033761542F) ^ 0x7E75498B);
    float green2 = startColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.012498407F) ^ 0x7F33C61E);
    float blue2 = startColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.10731111F) ^ 0x7EA4C5ED);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)1020686041L ^ 0x3CD66EDE, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red2, green2, blue2, alpha2).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179132_a((int)-1239040417L ^ 0xB625BE5E);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void renderFour(Color color) {
    setColor(color);
    GL11.glDepthMask((int)1258985795L ^ 0x4B0A9943);
    GL11.glDisable((int)1989434950L ^ 0x76945537);
    GL11.glEnable((int)332347214L ^ 0x13CF1D4C);
    GL11.glPolygonOffset(Float.intBitsToFloat(Float.floatToIntBits(12.178351F) ^ 0x7EC2DA87), Float.intBitsToFloat(Float.floatToIntBits(-7.3250208E-6F) ^ 0x7F01ED73));
    OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, Float.intBitsToFloat(Float.floatToIntBits(0.03881621F) ^ 0x7E6EFDBF), Float.intBitsToFloat(Float.floatToIntBits(0.113849185F) ^ 0x7E9929C3));
  }
  
  public static void drawBlockOutline(BlockPos pos, Color color, float linewidth, boolean air) {
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    if ((air || iblockstate.func_185904_a() != Material.field_151579_a) && mc.field_71441_e.func_175723_af().func_177746_a(pos)) {
      Vec3d interp = EntityUtil.interpolateEntity((Entity)mc.field_71439_g, mc.func_184121_ak());
      drawBlockOutline(iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(4391.570167243813D) ^ 0x7FD145DC167B016DL)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c), color, linewidth);
    } 
  }
  
  public static boolean isInViewFrustrum(AxisAlignedBB bb) {
    Entity current = Minecraft.func_71410_x().func_175606_aa();
    frustrum.func_78547_a(current.field_70165_t, current.field_70163_u, current.field_70161_v);
    return frustrum.func_78546_a(bb);
  }
  
  public static void GLPre(boolean depth, boolean texture, boolean clean, boolean bind, boolean override, float lineWidth) {
    if (depth)
      GL11.glDisable((int)612760008L ^ 0x2485F298); 
    if (!texture)
      GL11.glEnable((int)611433792L ^ 0x2471B6A2); 
    GL11.glLineWidth(lineWidth);
    if (clean)
      GL11.glDisable((int)-735429779L ^ 0xD42A368C); 
    if (bind)
      GL11.glDisable((int)-1297968767L ^ 0xB2A29AF0); 
    if (!override)
      GL11.glEnable((int)-902483780L ^ 0xCA353B9C); 
    GlStateManager.func_187401_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
    GL11.glHint((int)616177180L ^ 0x24BA124E, (int)-1499193655L ^ 0xA6A40FCB);
    GlStateManager.func_179132_a((int)541386819L ^ 0x2044E843);
  }
  
  public static void glScissor(float x, float y, float x1, float y1, ScaledResolution sr) {
    GL11.glScissor((int)(x * sr.func_78325_e()), (int)(mc.field_71440_d - y1 * sr.func_78325_e()), (int)((x1 - x) * sr.func_78325_e()), (int)((y1 - y) * sr.func_78325_e()));
  }
  
  public static void drawSphere(double x, double y, double z, float size, int slices, int stacks) {
    Sphere s = new Sphere();
    GL11.glPushMatrix();
    GL11.glBlendFunc((int)282949037L ^ 0x10DD76AF, (int)933027142L ^ 0x379CDE45);
    GL11.glEnable((int)1177605265L ^ 0x4630DF73);
    GL11.glLineWidth(Float.intBitsToFloat(Float.floatToIntBits(16.28657F) ^ 0x7E1BD37F));
    GL11.glDisable((int)777302190L ^ 0x2E54BD4F);
    GL11.glDisable((int)783250371L ^ 0x2EAF78B2);
    GL11.glDepthMask((int)-1058798314L ^ 0xC0E40516);
    s.setDrawStyle((int)-1530463928L ^ 0xA4C77FE5);
    GL11.glTranslated(x - mc.field_175616_W.field_78725_b, y - mc.field_175616_W.field_78726_c, z - mc.field_175616_W.field_78723_d);
    s.draw(size, slices, stacks);
    GL11.glLineWidth(Float.intBitsToFloat(Float.floatToIntBits(0.44613233F) ^ 0x7EE46B75));
    GL11.glEnable((int)-1706038681L ^ 0x9A4FE786);
    GL11.glEnable((int)741825732L ^ 0x2C3757B5);
    GL11.glDepthMask((int)1495606344L ^ 0x59252449);
    GL11.glDisable((int)-701328311L ^ 0xD6329FAB);
    GL11.glPopMatrix();
  }
  
  public static void drawFilledBox(AxisAlignedBB bb, int color) {
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)1242677160L ^ 0x4A11BCAA, (int)741717840L ^ 0x2C35B453, (int)-1213926203L ^ 0xB7A4F4C5, (int)679428702L ^ 0x287F425F);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)-342823472L ^ 0xEB90EDD0);
    float alpha = (color >> ((int)-63431927L ^ 0xFC381B11) & ((int)-1600198534L ^ 0xA09EE885)) / Float.intBitsToFloat(Float.floatToIntBits(0.10139894F) ^ 0x7EB0AA3F);
    float red = (color >> ((int)1483215655L ^ 0x58681337) & ((int)-773113762L ^ 0xD1EB38A1)) / Float.intBitsToFloat(Float.floatToIntBits(0.05463929F) ^ 0x7E20CD73);
    float green = (color >> ((int)1454692244L ^ 0x56B4D79C) & ((int)2022136488L ^ 0x78875A57)) / Float.intBitsToFloat(Float.floatToIntBits(0.4135556F) ^ 0x7DACBD8F);
    float blue = (color & ((int)433315818L ^ 0x19D3DF15)) / Float.intBitsToFloat(Float.floatToIntBits(0.009948539F) ^ 0x7F5DFF32);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)-484005667L ^ 0xE326A8DA, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179132_a((int)-926429714L ^ 0xC8C7CDEF);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void drawRect(float x, float y, float w, float h, int color) {
    float alpha = (color >> ((int)462790459L ^ 0x1B959F23) & ((int)-711817608L ^ 0xD5928687)) / Float.intBitsToFloat(Float.floatToIntBits(0.051530566F) ^ 0x7E2C11B7);
    float red = (color >> ((int)1784075078L ^ 0x6A56D356) & ((int)-207915749L ^ 0xF39B75E4)) / Float.intBitsToFloat(Float.floatToIntBits(0.015014718F) ^ 0x7F09004B);
    float green = (color >> ((int)368404120L ^ 0x15F56690) & ((int)1182583578L ^ 0x467CCBE5)) / Float.intBitsToFloat(Float.floatToIntBits(0.014212481F) ^ 0x7F17DB77);
    float blue = (color & ((int)1469068380L ^ 0x579034A3)) / Float.intBitsToFloat(Float.floatToIntBits(0.102704085F) ^ 0x7EAD5685);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    GlStateManager.func_179147_l();
    GlStateManager.func_179090_x();
    GlStateManager.func_179120_a((int)1883320131L ^ 0x70412C41, (int)1119181275L ^ 0x42B55AD8, (int)1738899574L ^ 0x67A58077, (int)864490526L ^ 0x3387141E);
    bufferbuilder.func_181668_a((int)601545458L ^ 0x23DADAF5, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(x, h, Double.longBitsToDouble(Double.doubleToLongBits(1.4469802240744046E307D) ^ 0x7FB49B0DFFF45A4FL)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(w, h, Double.longBitsToDouble(Double.doubleToLongBits(1.5017090357936386E308D) ^ 0x7FEABB3702C75F75L)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(w, y, Double.longBitsToDouble(Double.doubleToLongBits(3.2563937565597274E307D) ^ 0x7FC72FB0E906BDB7L)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(x, y, Double.longBitsToDouble(Double.doubleToLongBits(1.2342462282804048E308D) ^ 0x7FE5F866605C7B2EL)).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
  }
  
  public static void drawRectangleXY(float x, float y, float width, float height) {
    GL11.glEnable((int)-843326126L ^ 0xCDBBD6B0);
    GL11.glBlendFunc((int)1484766190L ^ 0x587FB8EC, (int)381356153L ^ 0x16BB0B7A);
    GL11.glBegin((int)-669806615L ^ 0xD8138FEB);
    GL11.glVertex2d((x + width), y);
    GL11.glVertex2d(x, y);
    GL11.glVertex2d(x, (y + height));
    GL11.glVertex2d((x + width), (y + height));
    glEnd();
  }
  
  public static void drawGradientRectCharon(float left, float top, float right, float bottom, int startColor, int endColor) {
    float f = (startColor >> ((int)-1261507492L ^ 0xB4CEEC44) & ((int)1042893335L ^ 0x3E294AE8)) / Float.intBitsToFloat(Float.floatToIntBits(0.10893535F) ^ 0x7EA0197F);
    float f2 = (startColor >> ((int)456832376L ^ 0x1B3AB568) & ((int)1949157092L ^ 0x742DC61B)) / Float.intBitsToFloat(Float.floatToIntBits(0.49046156F) ^ 0x7D841DC7);
    float f3 = (startColor >> ((int)-1615420535L ^ 0x9FB6A381) & ((int)-1079902797L ^ 0xBFA1FD4C)) / Float.intBitsToFloat(Float.floatToIntBits(0.013607218F) ^ 0x7F21F0CF);
    float f4 = (startColor & ((int)1462386723L ^ 0x572A40DC)) / Float.intBitsToFloat(Float.floatToIntBits(3.4753975E-4F) ^ 0x7AC935FF);
    float f5 = (endColor >> ((int)495420169L ^ 0x1D878311) & ((int)330480696L ^ 0x13B2BCC7)) / Float.intBitsToFloat(Float.floatToIntBits(0.049344193F) ^ 0x7E351D23);
    float f6 = (endColor >> ((int)-448188210L ^ 0xE54930DE) & ((int)1311331351L ^ 0x4E2954E8)) / Float.intBitsToFloat(Float.floatToIntBits(0.054606717F) ^ 0x7E20AB4B);
    float f7 = (endColor >> ((int)-294728826L ^ 0xEE6ECB8E) & ((int)-83671869L ^ 0xFB03443C)) / Float.intBitsToFloat(Float.floatToIntBits(0.123216696F) ^ 0x7E835909);
    float f8 = (endColor & ((int)1428018457L ^ 0x551DD5E6)) / Float.intBitsToFloat(Float.floatToIntBits(0.010002845F) ^ 0x7F5CE2F9);
    GlStateManager.func_179090_x();
    GlStateManager.func_179147_l();
    GlStateManager.func_179118_c();
    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
    GlStateManager.func_179103_j((int)-1060867586L ^ 0xC0C46CFF);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)-1291644911L ^ 0xB3031016, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(right, top, Double.longBitsToDouble(Double.doubleToLongBits(1.7200102911896745E308D) ^ 0x7FEE9E00C907A7CEL)).func_181666_a(f2, f3, f4, f).func_181675_d();
    bufferbuilder.func_181662_b(left, top, Double.longBitsToDouble(Double.doubleToLongBits(1.1887837022348698E308D) ^ 0x7FE5293AB975FEB3L)).func_181666_a(f2, f3, f4, f).func_181675_d();
    bufferbuilder.func_181662_b(left, bottom, Double.longBitsToDouble(Double.doubleToLongBits(1.0045269758833086E308D) ^ 0x7FE1E19499BA1E4BL)).func_181666_a(f6, f7, f8, f5).func_181675_d();
    bufferbuilder.func_181662_b(right, bottom, Double.longBitsToDouble(Double.doubleToLongBits(1.4305845746975423E308D) ^ 0x7FE9771AABC3249CL)).func_181666_a(f6, f7, f8, f5).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179103_j((int)2077876228L ^ 0x7BD9FD04);
    GlStateManager.func_179084_k();
    GlStateManager.func_179141_d();
    GlStateManager.func_179098_w();
  }
  
  public static void drawOutlinedBlockESP(BlockPos pos, Color color, float linewidth) {
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    Vec3d interp = EntityUtil.interpolateEntity((Entity)mc.field_71439_g, mc.func_184121_ak());
    drawBoundingBox(iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(841.7079598358807D) ^ 0x7FEA2FE406D8AFEAL)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c), linewidth, ColorUtil.toRGBA(color));
  }
  
  public static void glrendermethod() {
    GL11.glEnable((int)138421384L ^ 0x8402F6A);
    GL11.glBlendFunc((int)620626802L ^ 0x24FE0070, (int)-169984801L ^ 0xF5DE3FDC);
    GL11.glEnable((int)-136097635L ^ 0xF7E35BBD);
    GL11.glLineWidth(Float.intBitsToFloat(Float.floatToIntBits(0.10902368F) ^ 0x7DDF47CF));
    GL11.glDisable((int)-24836359L ^ 0xFE850B18);
    GL11.glEnable((int)107650541L ^ 0x66A96A9);
    GL11.glDisable((int)-1017518723L ^ 0xC359EE0C);
    double viewerPosX = (mc.func_175598_ae()).field_78730_l;
    double viewerPosY = (mc.func_175598_ae()).field_78731_m;
    double viewerPosZ = (mc.func_175598_ae()).field_78728_n;
    GL11.glPushMatrix();
    GL11.glTranslated(-viewerPosX, -viewerPosY, -viewerPosZ);
  }
  
  public static void drawLine(float x, float y, float x1, float y1, float thickness, int hex) {
    float red = (hex >> ((int)-2004022846L ^ 0x888D09D2) & ((int)-1198428706L ^ 0xB8916D21)) / Float.intBitsToFloat(Float.floatToIntBits(0.11214102F) ^ 0x7E9AAA31);
    float green = (hex >> ((int)-2034522242L ^ 0x86BBA776) & ((int)1999429700L ^ 0x772CE0BB)) / Float.intBitsToFloat(Float.floatToIntBits(0.11300693F) ^ 0x7E98702D);
    float blue = (hex & ((int)-1097768575L ^ 0xBE91617E)) / Float.intBitsToFloat(Float.floatToIntBits(0.010106468F) ^ 0x7F5A9599);
    float alpha = (hex >> ((int)-505904820L ^ 0xE1D88154) & ((int)1195399515L ^ 0x474059A4)) / Float.intBitsToFloat(Float.floatToIntBits(0.015566272F) ^ 0x7F0009AD);
    GlStateManager.func_179094_E();
    GlStateManager.func_179090_x();
    GlStateManager.func_179147_l();
    GlStateManager.func_179118_c();
    GlStateManager.func_179120_a((int)-882290576L ^ 0xCB695372, (int)1402968275L ^ 0x539F9BD0, (int)-2068805810L ^ 0x84B0874F, (int)-1788602007L ^ 0x95641969);
    GlStateManager.func_179103_j((int)-808092732L ^ 0xCFD566C5);
    GL11.glLineWidth(thickness);
    GL11.glEnable((int)-1965664781L ^ 0x8AD65ED3);
    GL11.glHint((int)-394377405L ^ 0xE87E4B11, (int)1975444915L ^ 0x75BEF4B1);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)1016816938L ^ 0x3C9B6529, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(x, y, Double.longBitsToDouble(Double.doubleToLongBits(7.34564640404249E307D) ^ 0x7FDA26C022C5213FL)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(x1, y1, Double.longBitsToDouble(Double.doubleToLongBits(5.890839056423739E307D) ^ 0x7FD4F8DA71863C61L)).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179103_j((int)-1612104634L ^ 0x9FE92146);
    GL11.glDisable((int)1423235013L ^ 0x54D4DCE5);
    GlStateManager.func_179084_k();
    GlStateManager.func_179141_d();
    GlStateManager.func_179098_w();
    GlStateManager.func_179121_F();
  }
  
  public static void drawFilledRectangle(float x, float y, float width, float height) {
    GL11.glEnable((int)556375323L ^ 0x212996F9);
    GL11.glBlendFunc((int)1099914764L ^ 0x418F5D0E, (int)-1043979998L ^ 0xC1C62221);
    GL11.glBegin((int)568028245L ^ 0x21DB6C52);
    GL11.glVertex2d((x + width), y);
    GL11.glVertex2d(x, y);
    GL11.glVertex2d(x, (y + height));
    GL11.glVertex2d((x + width), (y + height));
    glEnd();
  }
  
  public static void GlPost() {
    GLPost(depth, texture, clean, bind, override);
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\PoopUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */