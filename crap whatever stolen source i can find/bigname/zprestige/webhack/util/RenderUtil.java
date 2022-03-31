package bigname.zprestige.webhack.util;

import bigname.zprestige.webhack.WebHack;
import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
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
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Sphere;

public class RenderUtil implements Util {
  public static boolean texture;
  
  public static FloatBuffer modelView;
  
  public static boolean override;
  
  public static boolean bind;
  
  public static boolean clean;
  
  public static boolean depth;
  
  public static IntBuffer viewport;
  
  public static FloatBuffer projection;
  
  public static ICamera camera;
  
  public static Frustum frustrum = new Frustum();
  
  public static RenderItem itemRender;
  
  public static boolean $assertionsDisabled;
  
  public static FloatBuffer screenCoords = BufferUtils.createFloatBuffer((int)1389783044L ^ 0x52D66807);
  
  public static void drawText(BlockPos pos, String text) {
    GlStateManager.func_179094_E();
    glBillboardDistanceScaled(pos.func_177958_n() + Float.intBitsToFloat(Float.floatToIntBits(54.487545F) ^ 0x7D59F33F), pos.func_177956_o() + Float.intBitsToFloat(Float.floatToIntBits(2.1738994F) ^ 0x7F0B212B), pos.func_177952_p() + Float.intBitsToFloat(Float.floatToIntBits(3.3723562F) ^ 0x7F57D4AF), (EntityPlayer)mc.field_71439_g, Float.intBitsToFloat(Float.floatToIntBits(5.0153503F) ^ 0x7F207DC0));
    GlStateManager.func_179097_i();
    GlStateManager.func_179137_b(-(WebHack.textManager.getStringWidth(text) / Double.longBitsToDouble(Double.doubleToLongBits(0.5752405402051805D) ^ 0x7FE2685ED97077CBL)), Double.longBitsToDouble(Double.doubleToLongBits(1.0486247007243384E308D) ^ 0x7FE2AA881A72AD01L), Double.longBitsToDouble(Double.doubleToLongBits(9.200116066533162E307D) ^ 0x7FE06072B38C8310L));
    WebHack.textManager.drawStringWithShadow(text, Float.intBitsToFloat(Float.floatToIntBits(9.720232E37F) ^ 0x7E9240F9), Float.intBitsToFloat(Float.floatToIntBits(1.4725324E38F) ^ 0x7EDD8FE3), (int)1572991681L ^ 0xA26B586B);
    GlStateManager.func_179121_F();
  }
  
  public static void GlPost() {
    GLPost(depth, texture, clean, bind, override);
  }
  
  public static void drawBoxESP2(BlockPos pos, Color color, boolean secondC, Color secondColor, float lineWidth, boolean outline, boolean box, int boxAlpha, boolean air, double height, boolean gradientBox, boolean gradientOutline, boolean invertGradientBox, boolean invertGradientOutline, int gradientAlpha) {
    if (box)
      drawBox2(pos, new Color(color.getRed(), color.getGreen(), color.getBlue(), boxAlpha), height, gradientBox, invertGradientBox, gradientAlpha); 
    if (outline)
      drawBlockOutline2(pos, secondC ? secondColor : color, lineWidth, air, height, gradientOutline, invertGradientOutline, gradientAlpha); 
  }
  
  public static void drawRectangleXY(float x, float y, float width, float height) {
    GL11.glEnable((int)982308996L ^ 0x3A8CD366);
    GL11.glBlendFunc((int)-1879844045L ^ 0x8FF3D831, (int)289964802L ^ 0x11488001);
    GL11.glBegin((int)-25692299L ^ 0xFE77F777);
    GL11.glVertex2d((x + width), y);
    GL11.glVertex2d(x, y);
    GL11.glVertex2d(x, (y + height));
    GL11.glVertex2d((x + width), (y + height));
    glEnd();
  }
  
  public static void drawColoredBoundingBox(AxisAlignedBB bb, float width, float red, float green, float blue, float alpha) {
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)1863138220L ^ 0x6F0D38AE, (int)-1289588543L ^ 0xB32273C2, (int)1934835999L ^ 0x7353411F, (int)-1013738306L ^ 0xC39394BF);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)-48900842L ^ 0xFD15D516);
    GL11.glEnable((int)598829559L ^ 0x23B162D7);
    GL11.glHint((int)1961456752L ^ 0x74E97822, (int)508741546L ^ 0x1E52D6A8);
    GL11.glLineWidth(width);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)513293397L ^ 0x1E983C56, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, Float.intBitsToFloat(Float.floatToIntBits(6.0858886E37F) ^ 0x7E3723FB)).func_181675_d();
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
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, Float.intBitsToFloat(Float.floatToIntBits(3.253213E38F) ^ 0x7F74BE9A)).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, Float.intBitsToFloat(Float.floatToIntBits(1.7860035E38F) ^ 0x7F065D2D)).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, Float.intBitsToFloat(Float.floatToIntBits(4.3491525E37F) ^ 0x7E02E0A7)).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red, green, blue, Float.intBitsToFloat(Float.floatToIntBits(6.478335E37F) ^ 0x7E42F347)).func_181675_d();
    tessellator.func_78381_a();
    GL11.glDisable((int)-636595918L ^ 0xDA0E5A12);
    GlStateManager.func_179132_a((int)-1998526743L ^ 0x88E0E6E8);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void drawOutlinedBlockESP(BlockPos pos, Color color, float linewidth) {
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    Vec3d interp = EntityUtil.interpolateEntity((Entity)mc.field_71439_g, mc.func_184121_ak());
    drawBoundingBox(iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(566.5105861123399D) ^ 0x7FE1D6584E2BF255L)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c), linewidth, ColorUtil.toRGBA(color));
  }
  
  public static Vec3d to2D(double x, double y, double z) {
    GL11.glGetFloat((int)-2131042201L ^ 0x80FAEBC1, modelView);
    GL11.glGetFloat((int)-613591547L ^ 0xDB6D5DA2, projection);
    GL11.glGetInteger((int)430785417L ^ 0x19AD482B, viewport);
    boolean result = GLU.gluProject((float)x, (float)y, (float)z, modelView, projection, viewport, screenCoords);
    return result ? new Vec3d(screenCoords.get((int)89369914L ^ 0x553AD3A), (Display.getHeight() - screenCoords.get((int)-1518905680L ^ 0xA57756B1)), screenCoords.get((int)894906285L ^ 0x35572FAF)) : null;
  }
  
  public static void drawBox2(BlockPos pos, Color color, double height, boolean gradientBox, boolean invertGradientBox, int gradientAlpha) {
    AxisAlignedBB bb = new AxisAlignedBB(pos.func_177958_n() - (mc.func_175598_ae()).field_78730_l, pos.func_177956_o() - (mc.func_175598_ae()).field_78731_m, pos.func_177952_p() - (mc.func_175598_ae()).field_78728_n, (pos.func_177958_n() + ((int)1415717415L ^ 0x54622226)) - (mc.func_175598_ae()).field_78730_l, (pos.func_177956_o() + ((int)675748982L ^ 0x28471C77)) - (mc.func_175598_ae()).field_78731_m, (pos.func_177952_p() + ((int)602250603L ^ 0x23E59D6A)) - (mc.func_175598_ae()).field_78728_n);
    camera.func_78547_a(((Entity)Objects.requireNonNull((T)mc.func_175606_aa())).field_70165_t, (mc.func_175606_aa()).field_70163_u, (mc.func_175606_aa()).field_70161_v);
    if (camera.func_78546_a(new AxisAlignedBB(bb.field_72340_a + (mc.func_175598_ae()).field_78730_l, bb.field_72338_b + (mc.func_175598_ae()).field_78731_m, bb.field_72339_c + (mc.func_175598_ae()).field_78728_n, bb.field_72336_d + (mc.func_175598_ae()).field_78730_l, bb.field_72337_e + (mc.func_175598_ae()).field_78731_m, bb.field_72334_f + (mc.func_175598_ae()).field_78728_n))) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179147_l();
      GlStateManager.func_179097_i();
      GlStateManager.func_179120_a((int)1822218741L ^ 0x6C9CDAF7, (int)-261066712L ^ 0xF070732B, (int)1937335581L ^ 0x7379651D, (int)2098526668L ^ 0x7D14F9CD);
      GlStateManager.func_179090_x();
      GlStateManager.func_179132_a((int)460921971L ^ 0x1B791C73);
      GL11.glEnable((int)126789039L ^ 0x78EAE8F);
      GL11.glHint((int)1715809790L ^ 0x664521AC, (int)-812544591L ^ 0xCF919CB3);
      RenderGlobal.func_189696_b(bb, color.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.0079414835F) ^ 0x7F7D1CFF), color.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.118353434F) ^ 0x7E8D6349), color.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.0664944F) ^ 0x7EF72E37), color.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.08269239F) ^ 0x7ED65AA1));
      GL11.glDisable((int)-2041231324L ^ 0x86554304);
      GlStateManager.func_179132_a((int)-795706847L ^ 0xD0927A20);
      GlStateManager.func_179126_j();
      GlStateManager.func_179098_w();
      GlStateManager.func_179084_k();
      GlStateManager.func_179121_F();
    } 
  }
  
  public static void blockEsp(BlockPos blockPos, Color c, double length, double length2) {
    double x = blockPos.func_177958_n() - mc.field_175616_W.field_78725_b;
    double y = blockPos.func_177956_o() - mc.field_175616_W.field_78726_c;
    double z = blockPos.func_177952_p() - mc.field_175616_W.field_78723_d;
    GL11.glPushMatrix();
    GL11.glBlendFunc((int)-70010848L ^ 0xFBD3BB22, (int)395252809L ^ 0x178F174A);
    GL11.glEnable((int)1201456715L ^ 0x479CCDA9);
    GL11.glLineWidth(Float.intBitsToFloat(Float.floatToIntBits(0.56349486F) ^ 0x7F104133));
    GL11.glDisable((int)-368482745L ^ 0xEA096BA6);
    GL11.glDisable((int)-806126388L ^ 0xCFF377BD);
    GL11.glDepthMask((int)-344538668L ^ 0xEB76C1D4);
    GL11.glColor4d((c.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.19358133F) ^ 0x7D393A2F)), (c.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.014630407F) ^ 0x7F10B460)), (c.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.010894032F) ^ 0x7F4D7CE2)), Double.longBitsToDouble(Double.doubleToLongBits(18.352696704120092D) ^ 0x7FE25A4A54C99A50L));
    drawColorBox(new AxisAlignedBB(x, y, z, x + length2, y + Double.longBitsToDouble(Double.doubleToLongBits(8.386872535386791D) ^ 0x7FD0C614282E69EBL), z + length), Float.intBitsToFloat(Float.floatToIntBits(1.924514E38F) ^ 0x7F10C8CB), Float.intBitsToFloat(Float.floatToIntBits(3.074418E38F) ^ 0x7F674B23), Float.intBitsToFloat(Float.floatToIntBits(2.380058E38F) ^ 0x7F330E40), Float.intBitsToFloat(Float.floatToIntBits(3.190102E38F) ^ 0x7F6FFF21));
    GL11.glColor4d(Double.longBitsToDouble(Double.doubleToLongBits(1.2792201871836152E308D) ^ 0x7FE6C5581370EA01L), Double.longBitsToDouble(Double.doubleToLongBits(6.210693036297026E307D) ^ 0x7FD61C5D76D05C3FL), Double.longBitsToDouble(Double.doubleToLongBits(3.08324302547116E306D) ^ 0x7F91900F6AC5205FL), Double.longBitsToDouble(Double.doubleToLongBits(3.927651738475135D) ^ 0x7FEF6BD4ACB6A041L));
    drawSelectionBoundingBox(new AxisAlignedBB(x, y, z, x + length2, y + Double.longBitsToDouble(Double.doubleToLongBits(63.13480802235653D) ^ 0x7FBF914163A7A13FL), z + length));
    GL11.glLineWidth(Float.intBitsToFloat(Float.floatToIntBits(0.7478225F) ^ 0x7F3F714C));
    GL11.glEnable((int)-2091791964L ^ 0x8351C445);
    GL11.glEnable((int)6479603L ^ 0x62D582);
    GL11.glDepthMask((int)-379432511L ^ 0xE96251C0);
    GL11.glDisable((int)2099314344L ^ 0x7D20F54A);
    GL11.glPopMatrix();
    GL11.glColor4f(Float.intBitsToFloat(Float.floatToIntBits(6.746832F) ^ 0x7F57E60C), Float.intBitsToFloat(Float.floatToIntBits(7.81754F) ^ 0x7F7A294A), Float.intBitsToFloat(Float.floatToIntBits(19.127638F) ^ 0x7E190567), Float.intBitsToFloat(Float.floatToIntBits(4.081741F) ^ 0x7F029D9F));
  }
  
  public static void hexColor(int hexColor) {
    float red = (hexColor >> ((int)1710297345L ^ 0x65F11111) & ((int)-1913373143L ^ 0x8DF43ED6)) / Float.intBitsToFloat(Float.floatToIntBits(0.013826103F) ^ 0x7F1D86E1);
    float green = (hexColor >> ((int)-1623305124L ^ 0x9F3E5454) & ((int)1001751418L ^ 0x3BB58385)) / Float.intBitsToFloat(Float.floatToIntBits(0.00797185F) ^ 0x7F7D9C5D);
    float blue = (hexColor & ((int)1384237444L ^ 0x5281C97B)) / Float.intBitsToFloat(Float.floatToIntBits(0.122649945F) ^ 0x7E842FE5);
    float alpha = (hexColor >> ((int)-1033012141L ^ 0xC26D7C4B) & ((int)1189031627L ^ 0x46DF2E34)) / Float.intBitsToFloat(Float.floatToIntBits(0.2453854F) ^ 0x7D04464F);
    GL11.glColor4f(red, green, blue, alpha);
  }
  
  public static void drawSphere(double x, double y, double z, float size, int slices, int stacks) {
    Sphere s = new Sphere();
    GL11.glPushMatrix();
    GL11.glBlendFunc((int)1433670512L ^ 0x55741072, (int)-1257865456L ^ 0xB5067C13);
    GL11.glEnable((int)320924358L ^ 0x1320E124);
    GL11.glLineWidth(Float.intBitsToFloat(Float.floatToIntBits(14.365926F) ^ 0x7EFC434F));
    GL11.glDisable((int)-493873994L ^ 0xE2901957);
    GL11.glDisable((int)-287758199L ^ 0xEED923F8);
    GL11.glDepthMask((int)-1159577187L ^ 0xBAE2419D);
    s.setDrawStyle((int)-1621014298L ^ 0x9F60CE4B);
    GL11.glTranslated(x - mc.field_175616_W.field_78725_b, y - mc.field_175616_W.field_78726_c, z - mc.field_175616_W.field_78723_d);
    s.draw(size, slices, stacks);
    GL11.glLineWidth(Float.intBitsToFloat(Float.floatToIntBits(0.2161024F) ^ 0x7E5D49F3));
    GL11.glEnable((int)1382067346L ^ 0x5260A173);
    GL11.glEnable((int)-1890719632L ^ 0x8F4DE301);
    GL11.glDepthMask((int)1125231225L ^ 0x4311AA78);
    GL11.glDisable((int)-1249256901L ^ 0xB589D1D9);
    GL11.glPopMatrix();
  }
  
  public static void drawBoundingBox(AxisAlignedBB bb, float width, int color) {
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)-204675487L ^ 0xF3CCE563, (int)-1207176966L ^ 0xB80BF3F9, (int)1154307932L ^ 0x44CD575C, (int)-1615972107L ^ 0x9FAE38F4);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)-607900475L ^ 0xDBC42CC5);
    GL11.glEnable((int)461021152L ^ 0x1B7A94C0);
    GL11.glHint((int)279130902L ^ 0x10A33F44, (int)-160781748L ^ 0xF66ABB4E);
    GL11.glLineWidth(width);
    float alpha = (color >> ((int)160162598L ^ 0x98BE33E) & ((int)-1857183270L ^ 0x914DA125)) / Float.intBitsToFloat(Float.floatToIntBits(0.44370362F) ^ 0x7D9C2D1F);
    float red = (color >> ((int)-20035922L ^ 0xFECE46BE) & ((int)-681752381L ^ 0xD75D483C)) / Float.intBitsToFloat(Float.floatToIntBits(0.06827953F) ^ 0x7EF4D623);
    float green = (color >> ((int)782835794L ^ 0x2EA9205A) & ((int)298151585L ^ 0x11C56E5E)) / Float.intBitsToFloat(Float.floatToIntBits(0.008769203F) ^ 0x7F70ACB4);
    float blue = (color & ((int)1703346356L ^ 0x6587004B)) / Float.intBitsToFloat(Float.floatToIntBits(0.09898584F) ^ 0x7EB5B917);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)710633026L ^ 0x2A5B6641, DefaultVertexFormats.field_181706_f);
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
    GL11.glDisable((int)-317003184L ^ 0xED1AE170);
    GlStateManager.func_179132_a((int)1565644446L ^ 0x5D51D69F);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void drawBlockOutline(AxisAlignedBB bb, Color color, float linewidth) {
    float red = color.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.010118537F) ^ 0x7F5AC838);
    float green = color.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.9235229F) ^ 0x7C136BFF);
    float blue = color.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.29595515F) ^ 0x7DE8876F);
    float alpha = color.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.057157245F) ^ 0x7E151DB7);
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)1287097961L ^ 0x4CB78D6B, (int)382487254L ^ 0x16CC49D5, (int)-1016093624L ^ 0xC36FA448, (int)-2050178638L ^ 0x85CCC1B3);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)287395396L ^ 0x11214E44);
    GL11.glEnable((int)-326199061L ^ 0xEC8E93CB);
    GL11.glHint((int)979683794L ^ 0x3A64C580, (int)-2032255553L ^ 0x86DE2CBD);
    GL11.glLineWidth(linewidth);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)143015040L ^ 0x8863C83, DefaultVertexFormats.field_181706_f);
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
    GL11.glDisable((int)-1167419669L ^ 0xBA6A9DCB);
    GlStateManager.func_179132_a((int)2078196030L ^ 0x7BDEC13F);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void drawColorBox(AxisAlignedBB axisalignedbb, float red, float green, float blue, float alpha) {
    Tessellator ts = Tessellator.func_178181_a();
    BufferBuilder vb = ts.func_178180_c();
    vb.func_181668_a((int)306451773L ^ 0x1244153A, DefaultVertexFormats.field_181707_g);
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    ts.func_78381_a();
    vb.func_181668_a((int)1432261542L ^ 0x555E93A1, DefaultVertexFormats.field_181707_g);
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    ts.func_78381_a();
    vb.func_181668_a((int)1646307734L ^ 0x6220A991, DefaultVertexFormats.field_181707_g);
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    ts.func_78381_a();
    vb.func_181668_a((int)-236891084L ^ 0xF1E15433, DefaultVertexFormats.field_181707_g);
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    ts.func_78381_a();
    vb.func_181668_a((int)-1581809344L ^ 0xA1B78147, DefaultVertexFormats.field_181707_g);
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72340_a, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72338_b, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    vb.func_181662_b(axisalignedbb.field_72336_d, axisalignedbb.field_72337_e, axisalignedbb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    ts.func_78381_a();
    vb.func_181668_a((int)-643027728L ^ 0xD9AC2CF7, DefaultVertexFormats.field_181707_g);
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
  
  public static void drawTricolorGradientBox(BlockPos pos, Color startColor, Color midColor, Color endColor) {
    EnumFacing[] arrayOfEnumFacing = EnumFacing.values();
    int i = arrayOfEnumFacing.length;
    int j;
    for (j = (int)-1491996648L ^ 0xA711F018; j < i; j++) {
      EnumFacing face = arrayOfEnumFacing[j];
      if (face != EnumFacing.UP)
        drawGradientPlane(pos, face, startColor, midColor, (int)841515484L ^ 0x322881DD, (int)1925448783L ^ 0x72C4044F); 
    } 
    arrayOfEnumFacing = EnumFacing.values();
    i = arrayOfEnumFacing.length;
    for (j = (int)2014863700L ^ 0x78186154; j < i; j++) {
      EnumFacing face = arrayOfEnumFacing[j];
      if (face != EnumFacing.DOWN)
        drawGradientPlane(pos, face, midColor, endColor, (int)1025461574L ^ 0x3D1F4D47, (int)-1907254307L ^ 0x8E519BDC); 
    } 
  }
  
  public static void setColor(Color color) {
    GL11.glColor4d(color.getRed() / Double.longBitsToDouble(Double.doubleToLongBits(0.10676838665230011D) ^ 0x7FD4B52C48EB167DL), color.getGreen() / Double.longBitsToDouble(Double.doubleToLongBits(0.009965953894570459D) ^ 0x7FEB8907B067AD88L), color.getBlue() / Double.longBitsToDouble(Double.doubleToLongBits(0.010773981626512698D) ^ 0x7FE9F0AB55DE5D94L), color.getAlpha() / Double.longBitsToDouble(Double.doubleToLongBits(0.010475369603509184D) ^ 0x7FEA941C4EE27A17L));
  }
  
  public static void glBillboardDistanceScaled(float x, float y, float z, EntityPlayer player, float scale) {
    glBillboard(x, y, z);
    int distance = (int)player.func_70011_f(x, y, z);
    float scaleDistance = distance / Float.intBitsToFloat(Float.floatToIntBits(0.43159142F) ^ 0x7EDCF98D) / (Float.intBitsToFloat(Float.floatToIntBits(0.3351659F) ^ 0x7EAB9ADD) + Float.intBitsToFloat(Float.floatToIntBits(0.43493012F) ^ 0x7EDEAF29) - scale);
    if (scaleDistance < Float.intBitsToFloat(Float.floatToIntBits(9.826564F) ^ 0x7E9D399B))
      scaleDistance = Float.intBitsToFloat(Float.floatToIntBits(6.725151F) ^ 0x7F573470); 
    GlStateManager.func_179152_a(scaleDistance, scaleDistance, scaleDistance);
  }
  
  public static void drawProperGradientBlockOutline(BlockPos pos, Color startColor, Color midColor, Color endColor, float linewidth) {
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    Vec3d interp = EntityUtil.interpolateEntity((Entity)mc.field_71439_g, mc.func_184121_ak());
    drawProperGradientBlockOutline(iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(966.9696135132388D) ^ 0x7FEE558C24BAC8F6L)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c), startColor, midColor, endColor, linewidth);
  }
  
  public static boolean isInViewFrustrum(AxisAlignedBB bb) {
    Entity current = Minecraft.func_71410_x().func_175606_aa();
    frustrum.func_78547_a(current.field_70165_t, current.field_70163_u, current.field_70161_v);
    return frustrum.func_78546_a(bb);
  }
  
  public static void renderFour(Color color) {
    setColor(color);
    GL11.glDepthMask((int)1076988141L ^ 0x403188ED);
    GL11.glDisable((int)1023565057L ^ 0x3D025670);
    GL11.glEnable((int)2055504141L ^ 0x7A84AB0F);
    GL11.glPolygonOffset(Float.intBitsToFloat(Float.floatToIntBits(7.7031093F) ^ 0x7F767FDF), Float.intBitsToFloat(Float.floatToIntBits(-6.450572E-6F) ^ 0x7F2C55FE));
    OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, Float.intBitsToFloat(Float.floatToIntBits(0.107824065F) ^ 0x7EACD2DD), Float.intBitsToFloat(Float.floatToIntBits(0.010945636F) ^ 0x7F435553));
  }
  
  public static void drawGradientBlockOutline(AxisAlignedBB bb, Color startColor, Color endColor, float linewidth) {
    float red = startColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.08998097F) ^ 0x7EC747F1);
    float green = startColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.032792907F) ^ 0x7E7951DB);
    float blue = startColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.36167547F) ^ 0x7DC62D87);
    float alpha = startColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.27210996F) ^ 0x7DF451FF);
    float red1 = endColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.05016346F) ^ 0x7E327833);
    float green1 = endColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.010741709F) ^ 0x7F50FDFE);
    float blue1 = endColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.009321798F) ^ 0x7F67BA74);
    float alpha1 = endColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.013936478F) ^ 0x7F1B55D3);
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)-565713390L ^ 0xDE47E510, (int)-725852321L ^ 0xD4BC5C5C, (int)-1186520833L ^ 0xB94720FF, (int)-1391083774L ^ 0xAD15BF03);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)-1697439381L ^ 0x9AD3216B);
    GL11.glEnable((int)-1171500577L ^ 0xBA2C5AFF);
    GL11.glHint((int)-1038724252L ^ 0xC2165F36, (int)2109488694L ^ 0x7DBC2F34);
    GL11.glLineWidth(linewidth);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)-1536395620L ^ 0xA46C769F, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GL11.glDisable((int)309653855L ^ 0x1274FA7F);
    GlStateManager.func_179132_a((int)-1331593522L ^ 0xB0A17ECF);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void drawBlockOutline2(BlockPos pos, Color color, float linewidth, boolean b, double height, boolean gradientOutline, boolean air, int gradientAlpha) {
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    if ((air || iblockstate.func_185904_a() != Material.field_151579_a) && mc.field_71441_e.func_175723_af().func_177746_a(pos)) {
      Vec3d interp = EntityUtil.interpolateEntity((Entity)mc.field_71439_g, mc.func_184121_ak());
      drawBlockOutline(iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(886.0119253278713D) ^ 0x7FEBD2558C4E699CL)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c), color, linewidth);
    } 
  }
  
  public static void drawClosedGradientBox(BlockPos pos, Color startColor, Color endColor, double height) {
    EnumFacing[] arrayOfEnumFacing = EnumFacing.values();
    int i = arrayOfEnumFacing.length;
    for (int j = (int)-179844873L ^ 0xF547C8F7; j < i; j++) {
      EnumFacing face = arrayOfEnumFacing[j];
      drawGradientPlane(pos, face, startColor, endColor, height);
    } 
  }
  
  public static void drawGradientSideways(double leftpos, double top, double right, double bottom, int col1, int col2) {
    float f = (col1 >> ((int)1421304057L ^ 0x54B760E1) & ((int)-1160467101L ^ 0xBAD4AD9C)) / Float.intBitsToFloat(Float.floatToIntBits(0.06898666F) ^ 0x7EF248E1);
    float f2 = (col1 >> ((int)-460441106L ^ 0xE48E39FE) & ((int)-729354136L ^ 0xD486F097)) / Float.intBitsToFloat(Float.floatToIntBits(0.009098305F) ^ 0x7F6A110F);
    float f3 = (col1 >> ((int)1156299979L ^ 0x44EBBCC3) & ((int)-108050577L ^ 0xF98F4790)) / Float.intBitsToFloat(Float.floatToIntBits(0.008566023F) ^ 0x7F735881);
    float f4 = (col1 & ((int)-174562458L ^ 0xF5986399)) / Float.intBitsToFloat(Float.floatToIntBits(0.008121141F) ^ 0x7F7A0E89);
    float f5 = (col2 >> ((int)1876005497L ^ 0x6FD19261) & ((int)-38592268L ^ 0xFDB3200B)) / Float.intBitsToFloat(Float.floatToIntBits(0.013783807F) ^ 0x7F1ED57A);
    float f6 = (col2 >> ((int)877901901L ^ 0x3453B85D) & ((int)1805221200L ^ 0x6B997DAF)) / Float.intBitsToFloat(Float.floatToIntBits(0.01534695F) ^ 0x7F0471C6);
    float f7 = (col2 >> ((int)2018103382L ^ 0x7849D05E) & ((int)-1596283790L ^ 0xA0DAA48D)) / Float.intBitsToFloat(Float.floatToIntBits(0.08047434F) ^ 0x7EDBCFBB);
    float f8 = (col2 & ((int)-638987512L ^ 0xD9E9D3F7)) / Float.intBitsToFloat(Float.floatToIntBits(0.115881644F) ^ 0x7E92535B);
    GL11.glEnable((int)2113099010L ^ 0x7DF35EE0);
    GL11.glDisable((int)609560688L ^ 0x24552591);
    GL11.glBlendFunc((int)1717050065L ^ 0x665819D3, (int)-1084711352L ^ 0xBF589D4B);
    GL11.glEnable((int)-1426772630L ^ 0xAAF5264A);
    GL11.glShadeModel((int)-1328218639L ^ 0xB0D4E0F0);
    GL11.glPushMatrix();
    GL11.glBegin((int)964905022L ^ 0x39834839);
    GL11.glColor4f(f2, f3, f4, f);
    GL11.glVertex2d(leftpos, top);
    GL11.glVertex2d(leftpos, bottom);
    GL11.glColor4f(f6, f7, f8, f5);
    GL11.glVertex2d(right, bottom);
    GL11.glVertex2d(right, top);
    GL11.glEnd();
    GL11.glPopMatrix();
    GL11.glEnable((int)-782358590L ^ 0xD15E2A23);
    GL11.glDisable((int)1284646792L ^ 0x4C922C6A);
    GL11.glDisable((int)-1369080981L ^ 0xAE65704B);
    GL11.glShadeModel((int)1521262084L ^ 0x5AAC8304);
  }
  
  public static void renderTwo() {
    GL11.glStencilFunc((int)-587818072L ^ 0xDCF699A8, (int)1157668534L ^ 0x45009EB6, (int)689691315L ^ 0x291BDABC);
    GL11.glStencilOp((int)1606723401L ^ 0x5FC4B948, (int)-1821826120L ^ 0x93693DB9, (int)521531346L ^ 0x1F15F1D3);
    GL11.glPolygonMode((int)1962766203L ^ 0x74FD6B73, (int)550941198L ^ 0x20D6A90C);
  }
  
  public static void glBillboard(float x, float y, float z) {
    float scale = Float.intBitsToFloat(Float.floatToIntBits(296.74066F) ^ 0x7F4E2AC1);
    GlStateManager.func_179137_b(x - (mc.func_175598_ae()).field_78725_b, y - (mc.func_175598_ae()).field_78726_c, z - (mc.func_175598_ae()).field_78723_d);
    GlStateManager.func_187432_a(Float.intBitsToFloat(Float.floatToIntBits(1.8581734E38F) ^ 0x7F0BCB1E), Float.intBitsToFloat(Float.floatToIntBits(33.299984F) ^ 0x7D85332F), Float.intBitsToFloat(Float.floatToIntBits(4.310748E37F) ^ 0x7E01B8CB));
    GlStateManager.func_179114_b(-mc.field_71439_g.field_70177_z, Float.intBitsToFloat(Float.floatToIntBits(3.3929906E38F) ^ 0x7F7F429F), Float.intBitsToFloat(Float.floatToIntBits(5.5497627F) ^ 0x7F3197A8), Float.intBitsToFloat(Float.floatToIntBits(1.7942424E38F) ^ 0x7F06FBDA));
    GlStateManager.func_179114_b(mc.field_71439_g.field_70125_A, (mc.field_71474_y.field_74320_O == ((int)1687999093L ^ 0x649CD277)) ? Float.intBitsToFloat(Float.floatToIntBits(-20.921873F) ^ 0x7E275FFF) : Float.intBitsToFloat(Float.floatToIntBits(240.06834F) ^ 0x7CF0117F), Float.intBitsToFloat(Float.floatToIntBits(6.0131194E37F) ^ 0x7E34F363), Float.intBitsToFloat(Float.floatToIntBits(3.3246796E38F) ^ 0x7F7A1F00));
    GlStateManager.func_179152_a(-scale, -scale, scale);
  }
  
  public static void drawBoxESP(BlockPos pos, Color color, boolean secondC, Color secondColor, float lineWidth, boolean outline, boolean box, int boxAlpha, boolean air) {
    if (box)
      drawBox(pos, new Color(color.getRed(), color.getGreen(), color.getBlue(), boxAlpha)); 
    if (outline)
      drawBlockOutline(pos, secondC ? secondColor : color, lineWidth, air); 
  }
  
  public static void drawTexturedRect(int x, int y, int textureX, int textureY, int width, int height, int zLevel) {
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder BufferBuilder2 = tessellator.func_178180_c();
    BufferBuilder2.func_181668_a((int)-1215823966L ^ 0xB787FFA5, DefaultVertexFormats.field_181707_g);
    BufferBuilder2.func_181662_b((x + ((int)455778591L ^ 0x1B2AA11F)), (y + height), zLevel).func_187315_a(((textureX + ((int)1402831704L ^ 0x539D8358)) * Float.intBitsToFloat(Float.floatToIntBits(11397.991F) ^ 0x7DB217F7)), ((textureY + height) * Float.intBitsToFloat(Float.floatToIntBits(1421.4274F) ^ 0x7F31ADAD))).func_181675_d();
    BufferBuilder2.func_181662_b((x + width), (y + height), zLevel).func_187315_a(((textureX + width) * Float.intBitsToFloat(Float.floatToIntBits(5557.2944F) ^ 0x7E2DAA5B)), ((textureY + height) * Float.intBitsToFloat(Float.floatToIntBits(1749.688F) ^ 0x7F5AB604))).func_181675_d();
    BufferBuilder2.func_181662_b((x + width), (y + ((int)-650860905L ^ 0xD934A697)), zLevel).func_187315_a(((textureX + width) * Float.intBitsToFloat(Float.floatToIntBits(1205.2714F) ^ 0x7F16A8AF)), ((textureY + ((int)742808369L ^ 0x2C465B31)) * Float.intBitsToFloat(Float.floatToIntBits(2726.3577F) ^ 0x7EAA65B9))).func_181675_d();
    BufferBuilder2.func_181662_b((x + ((int)1704729742L ^ 0x659C1C8E)), (y + ((int)-394606547L ^ 0xE87AC82D)), zLevel).func_187315_a(((textureX + ((int)-1525931764L ^ 0xA50C210C)) * Float.intBitsToFloat(Float.floatToIntBits(4194.4233F) ^ 0x7E031363)), ((textureY + ((int)-946388176L ^ 0xC7974330)) * Float.intBitsToFloat(Float.floatToIntBits(4010.2283F) ^ 0x7EFAA3A7))).func_181675_d();
    tessellator.func_78381_a();
  }
  
  public static boolean isInViewFrustrum(Entity entity) {
    return (isInViewFrustrum(entity.func_174813_aQ()) || entity.field_70158_ak) ? ((int)1388351701L ^ 0x52C090D4) : ((int)656214808L ^ 0x271D0B18);
  }
  
  public static void glStart(float n, float n2, float n3, float n4) {
    glrendermethod();
    GL11.glColor4f(n, n2, n3, n4);
  }
  
  public static void drawArc(float cx, float cy, float r, float start_angle, float end_angle, int num_segments) {
    GL11.glBegin((int)876429347L ^ 0x343D4027);
    for (int i = (int)(num_segments / Float.intBitsToFloat(Float.floatToIntBits(0.08985346F) ^ 0x7E0C0517) / start_angle) + ((int)-1101673923L ^ 0xBE55CA3C); i <= num_segments / Float.intBitsToFloat(Float.floatToIntBits(0.42107722F) ^ 0x7D63976F) / end_angle; i++) {
      double previousangle = Double.longBitsToDouble(Double.doubleToLongBits(1.008643540489068D) ^ 0x7FE9029C3CFFA338L) * (i - ((int)-786852601L ^ 0xD1199506)) / num_segments;
      double angle = Double.longBitsToDouble(Double.doubleToLongBits(1.5620484200788876D) ^ 0x7FE1DFDD2FB430C6L) * i / num_segments;
      GL11.glVertex2d(cx, cy);
      GL11.glVertex2d(cx + Math.cos(angle) * r, cy + Math.sin(angle) * r);
      GL11.glVertex2d(cx + Math.cos(previousangle) * r, cy + Math.sin(previousangle) * r);
    } 
    glEnd();
  }
  
  public static void drawFilledBox(AxisAlignedBB bb, int color) {
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)1031517603L ^ 0x3D7BB6A1, (int)2068624688L ^ 0x7B4CB633, (int)785471273L ^ 0x2ED15729, (int)-949308514L ^ 0xC76AB39F);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)-1286274947L ^ 0xB355007D);
    float alpha = (color >> ((int)-177226303L ^ 0xF56FBDD9) & ((int)-2057683339L ^ 0x855A3E8A)) / Float.intBitsToFloat(Float.floatToIntBits(0.014513915F) ^ 0x7F12CBC6);
    float red = (color >> ((int)66034380L ^ 0x3EF9ADC) & ((int)-1841341091L ^ 0x923F5DA2)) / Float.intBitsToFloat(Float.floatToIntBits(0.015568382F) ^ 0x7F001287);
    float green = (color >> ((int)2083496825L ^ 0x7C2FA371) & ((int)-1599960644L ^ 0xA0A28943)) / Float.intBitsToFloat(Float.floatToIntBits(0.013244175F) ^ 0x7F27FE19);
    float blue = (color & ((int)445241755L ^ 0x1A89D964)) / Float.intBitsToFloat(Float.floatToIntBits(0.11161133F) ^ 0x7E9B947B);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)-1886452548L ^ 0x8F8F04BB, DefaultVertexFormats.field_181706_f);
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
    GlStateManager.func_179132_a((int)-1968961250L ^ 0x8AA4091F);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void drawRectangle(float x, float y, float width, float height) {
    GL11.glEnable((int)-436605434L ^ 0xE5F9E5E4);
    GL11.glBlendFunc((int)-930740218L ^ 0xC8860B04, (int)1460718473L ^ 0x5710C88A);
    GL11.glBegin((int)1804651934L ^ 0x6B90CD9C);
    GL11.glVertex2d(width, Double.longBitsToDouble(Double.doubleToLongBits(1.2896812778426786E308D) ^ 0x7FE6F503C524E3C2L));
    GL11.glVertex2d(Double.longBitsToDouble(Double.doubleToLongBits(9.925667604848515E306D) ^ 0x7FAC44ECE49B235FL), Double.longBitsToDouble(Double.doubleToLongBits(2.071867035841213E307D) ^ 0x7FBD811E207E44CFL));
    GL11.glVertex2d(Double.longBitsToDouble(Double.doubleToLongBits(1.40321531008571E306D) ^ 0x7F7FF8CFAD30E87FL), height);
    GL11.glVertex2d(width, height);
    glEnd();
  }
  
  public static int getRainbow(int speed, int offset, float s, float b) {
    float hue = (float)((System.currentTimeMillis() + offset) % speed);
    return Color.getHSBColor(hue /= speed, s, b).getRGB();
  }
  
  public static void drawGradientFilledBox(BlockPos pos, Color startColor, Color endColor) {
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    Vec3d interp = EntityUtil.interpolateEntity((Entity)mc.field_71439_g, mc.func_184121_ak());
    drawGradientFilledBox(iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(605.1999008746103D) ^ 0x7FE28BD485A13725L)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c), startColor, endColor);
  }
  
  public static void drawFilledRectangle(float x, float y, float width, float height) {
    GL11.glEnable((int)495360310L ^ 0x1D8692D4);
    GL11.glBlendFunc((int)2102350583L ^ 0x7D4F51F5, (int)-1912991699L ^ 0x8DFA132E);
    GL11.glBegin((int)409156627L ^ 0x18633C14);
    GL11.glVertex2d((x + width), y);
    GL11.glVertex2d(x, y);
    GL11.glVertex2d(x, (y + height));
    GL11.glVertex2d((x + width), (y + height));
    glEnd();
  }
  
  public static void drawCircleOutline(float x, float y, float radius, int start, int end, int segments) {
    drawArcOutline(x, y, radius, start, end, segments);
  }
  
  public static void drawTracerPointer(float x, float y, float size, float widthDiv, float heightDiv, boolean outline, float outlineWidth, int color) {
    boolean blend = GL11.glIsEnabled((int)1138498945L ^ 0x43DC1663);
    float alpha = (color >> ((int)-693168336L ^ 0xD6AF1728) & ((int)192721085L ^ 0xB7CB042)) / Float.intBitsToFloat(Float.floatToIntBits(0.115207486F) ^ 0x7E94F1E7);
    GL11.glEnable((int)151645761L ^ 0x909E5A3);
    GL11.glDisable((int)-957762964L ^ 0xC6E9BF8D);
    GL11.glBlendFunc((int)-1741308768L ^ 0x9835BFA2, (int)1722669724L ^ 0x66ADD99F);
    GL11.glEnable((int)281492837L ^ 0x10C73645);
    GL11.glPushMatrix();
    hexColor(color);
    GL11.glBegin((int)-971901228L ^ 0xC611F6D3);
    GL11.glVertex2d(x, y);
    GL11.glVertex2d((x - size / widthDiv), (y + size));
    GL11.glVertex2d(x, (y + size / heightDiv));
    GL11.glVertex2d((x + size / widthDiv), (y + size));
    GL11.glVertex2d(x, y);
    GL11.glEnd();
    if (outline) {
      GL11.glLineWidth(outlineWidth);
      GL11.glColor4f(Float.intBitsToFloat(Float.floatToIntBits(2.87916E38F) ^ 0x7F589A9B), Float.intBitsToFloat(Float.floatToIntBits(3.0290049E38F) ^ 0x7F63E083), Float.intBitsToFloat(Float.floatToIntBits(7.4151146E37F) ^ 0x7E5F23F7), alpha);
      GL11.glBegin((int)-639640112L ^ 0xD9DFDDD2);
      GL11.glVertex2d(x, y);
      GL11.glVertex2d((x - size / widthDiv), (y + size));
      GL11.glVertex2d(x, (y + size / heightDiv));
      GL11.glVertex2d((x + size / widthDiv), (y + size));
      GL11.glVertex2d(x, y);
      GL11.glEnd();
    } 
    GL11.glPopMatrix();
    GL11.glEnable((int)-616805479L ^ 0xDB3C4678);
    if (!blend)
      GL11.glDisable((int)846151130L ^ 0x326F3638); 
    GL11.glDisable((int)2104393223L ^ 0x7D6E7527);
  }
  
  public static void drawGradientPlane(BlockPos pos, EnumFacing face, Color startColor, Color endColor, double height) {
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder builder = tessellator.func_178180_c();
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    Vec3d interp = EntityUtil.interpolateEntity((Entity)mc.field_71439_g, mc.func_184121_ak());
    AxisAlignedBB bb = iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(968.0782823289422D) ^ 0x7FEE22EDB27C554BL)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c).func_72321_a(Double.longBitsToDouble(Double.doubleToLongBits(1.5518796301128712E308D) ^ 0x7FEB9FD6FFB4AE43L), height, Double.longBitsToDouble(Double.doubleToLongBits(1.4223178394667192E308D) ^ 0x7FE9516EDDED5AB0L));
    float red = startColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.013949171F) ^ 0x7F1B8B10);
    float green = startColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.008235334F) ^ 0x7F79ED7F);
    float blue = startColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.06583037F) ^ 0x7EF9D213);
    float alpha = startColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.015271909F) ^ 0x7F053707);
    float red1 = endColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.008741028F) ^ 0x7F703687);
    float green1 = endColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.010965397F) ^ 0x7F4CA835);
    float blue1 = endColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.07138493F) ^ 0x7EED3243);
    float alpha1 = endColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.033798244F) ^ 0x7E757007);
    double x1 = Double.longBitsToDouble(Double.doubleToLongBits(1.2097640034572107E308D) ^ 0x7FE588D5EA0C6772L);
    double y1 = Double.longBitsToDouble(Double.doubleToLongBits(1.7227611498870955E308D) ^ 0x7FEEAA89E1759675L);
    double z1 = Double.longBitsToDouble(Double.doubleToLongBits(1.1423549950013275E308D) ^ 0x7FE455A7F2000378L);
    double x2 = Double.longBitsToDouble(Double.doubleToLongBits(1.4291225171561437E307D) ^ 0x7FB459F40D38A4E7L);
    double y2 = Double.longBitsToDouble(Double.doubleToLongBits(3.2696154650112775E307D) ^ 0x7FC747CA947A91ABL);
    double z2 = Double.longBitsToDouble(Double.doubleToLongBits(1.661204794271643E308D) ^ 0x7FED92077F291C88L);
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
    GlStateManager.func_179132_a((int)-1765872072L ^ 0x96BEEE38);
    builder.func_181668_a((int)-785439766L ^ 0xD12F23EF, DefaultVertexFormats.field_181706_f);
    if (face == EnumFacing.EAST || face == EnumFacing.WEST || face == EnumFacing.NORTH || face == EnumFacing.SOUTH) {
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    } else if (face == EnumFacing.UP) {
      builder.func_181662_b(x1, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
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
    GlStateManager.func_179132_a((int)1071728579L ^ 0x3FE147C2);
    GlStateManager.func_179084_k();
    GlStateManager.func_179141_d();
    GlStateManager.func_179098_w();
    GlStateManager.func_179126_j();
    GlStateManager.func_179121_F();
  }
  
  public static void drawBox(BlockPos pos, Color color) {
    AxisAlignedBB bb = new AxisAlignedBB(pos.func_177958_n() - (mc.func_175598_ae()).field_78730_l, pos.func_177956_o() - (mc.func_175598_ae()).field_78731_m, pos.func_177952_p() - (mc.func_175598_ae()).field_78728_n, (pos.func_177958_n() + ((int)1028869472L ^ 0x3D534D61)) - (mc.func_175598_ae()).field_78730_l, (pos.func_177956_o() + ((int)-170057544L ^ 0xF5DD20B9)) - (mc.func_175598_ae()).field_78731_m, (pos.func_177952_p() + ((int)188225267L ^ 0xB3816F2)) - (mc.func_175598_ae()).field_78728_n);
    camera.func_78547_a(((Entity)Objects.requireNonNull((T)mc.func_175606_aa())).field_70165_t, (mc.func_175606_aa()).field_70163_u, (mc.func_175606_aa()).field_70161_v);
    if (camera.func_78546_a(new AxisAlignedBB(bb.field_72340_a + (mc.func_175598_ae()).field_78730_l, bb.field_72338_b + (mc.func_175598_ae()).field_78731_m, bb.field_72339_c + (mc.func_175598_ae()).field_78728_n, bb.field_72336_d + (mc.func_175598_ae()).field_78730_l, bb.field_72337_e + (mc.func_175598_ae()).field_78731_m, bb.field_72334_f + (mc.func_175598_ae()).field_78728_n))) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179147_l();
      GlStateManager.func_179097_i();
      GlStateManager.func_179120_a((int)-1979223486L ^ 0x8A077140, (int)-270482284L ^ 0xEFE0C797, (int)-421685781L ^ 0xE6DD95EB, (int)705619548L ^ 0x2A0EE65D);
      GlStateManager.func_179090_x();
      GlStateManager.func_179132_a((int)1563288557L ^ 0x5D2DE3ED);
      GL11.glEnable((int)2062888153L ^ 0x7AF527F9);
      GL11.glHint((int)1105100094L ^ 0x41DE716C, (int)-575175517L ^ 0xDDB795A1);
      RenderGlobal.func_189696_b(bb, color.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.011729787F) ^ 0x7F3F2E4B), color.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.34168407F) ^ 0x7DD1F137), color.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.037911814F) ^ 0x7E64496B), color.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.10549254F) ^ 0x7EA70C79));
      GL11.glDisable((int)-696628809L ^ 0xD67A4297);
      GlStateManager.func_179132_a((int)-1056146313L ^ 0xC10C7C76);
      GlStateManager.func_179126_j();
      GlStateManager.func_179098_w();
      GlStateManager.func_179084_k();
      GlStateManager.func_179121_F();
    } 
  }
  
  public static void GLPost(boolean depth, boolean texture, boolean clean, boolean bind, boolean override) {
    GlStateManager.func_179132_a((int)1687480727L ^ 0x6494E996);
    if (!override)
      GL11.glDisable((int)-970126491L ^ 0xC62D0045); 
    if (bind)
      GL11.glEnable((int)-1677327115L ^ 0x9C060F84); 
    if (clean)
      GL11.glEnable((int)713151482L ^ 0x2A81DE1B); 
    if (!texture)
      GL11.glDisable((int)1980022064L ^ 0x7604B6D2); 
    if (depth)
      GL11.glEnable((int)1903112069L ^ 0x716F24D5); 
  }
  
  public static void drawBlockOutline(BlockPos pos, Color color, float linewidth, boolean air) {
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    if ((air || iblockstate.func_185904_a() != Material.field_151579_a) && mc.field_71441_e.func_175723_af().func_177746_a(pos)) {
      assert mc.field_175622_Z != null;
      Vec3d interp = EntityUtil.interpolateEntity(mc.field_175622_Z, mc.func_184121_ak());
      drawBlockOutline(iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(5876.015391413778D) ^ 0x7FD6964E10B112D1L)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c), color, linewidth);
    } 
  }
  
  public static void drawGradientBoxTest(BlockPos pos, Color startColor, Color endColor) {}
  
  public static void glScissor(float x, float y, float x1, float y1, ScaledResolution sr) {
    GL11.glScissor((int)(x * sr.func_78325_e()), (int)(mc.field_71440_d - y1 * sr.func_78325_e()), (int)((x1 - x) * sr.func_78325_e()), (int)((y1 - y) * sr.func_78325_e()));
  }
  
  public static void drawLine(float x, float y, float x1, float y1, float thickness, int hex) {
    float red = (hex >> ((int)-1696068674L ^ 0x9AE80BAE) & ((int)1447787563L ^ 0x564B7CD4)) / Float.intBitsToFloat(Float.floatToIntBits(0.122864045F) ^ 0x7E84A025);
    float green = (hex >> ((int)-1855908972L ^ 0x9161139C) & ((int)-605899386L ^ 0xDBE2B579)) / Float.intBitsToFloat(Float.floatToIntBits(1.8482741F) ^ 0x7C93943F);
    float blue = (hex & ((int)-500332822L ^ 0xE22D8615)) / Float.intBitsToFloat(Float.floatToIntBits(0.066751845F) ^ 0x7EF7B531);
    float alpha = (hex >> ((int)-179965085L ^ 0xF545F37B) & ((int)-497030959L ^ 0xE25FE82E)) / Float.intBitsToFloat(Float.floatToIntBits(0.085794084F) ^ 0x7ED0B4CF);
    GlStateManager.func_179094_E();
    GlStateManager.func_179090_x();
    GlStateManager.func_179147_l();
    GlStateManager.func_179118_c();
    GlStateManager.func_179120_a((int)1250589351L ^ 0x4A8A79A5, (int)432603077L ^ 0x19C8FCC6, (int)-420976331L ^ 0xE6E86934, (int)-380812299L ^ 0xE94D43F5);
    GlStateManager.func_179103_j((int)-197418290L ^ 0xF43BBFCF);
    GL11.glLineWidth(thickness);
    GL11.glEnable((int)-1951589019L ^ 0x8BAD1645);
    GL11.glHint((int)516912773L ^ 0x1ECF7AD7, (int)547376053L ^ 0x20A05AB7);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)1932743399L ^ 0x733352E4, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(x, y, Double.longBitsToDouble(Double.doubleToLongBits(1.5359606408453464E308D) ^ 0x7FEB574C3B60924CL)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(x1, y1, Double.longBitsToDouble(Double.doubleToLongBits(1.7380148490073409E308D) ^ 0x7FEEF00C88A39660L)).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179103_j((int)-66671916L ^ 0xFC06B7D4);
    GL11.glDisable((int)-178026990L ^ 0xF5638D32);
    GlStateManager.func_179084_k();
    GlStateManager.func_179141_d();
    GlStateManager.func_179098_w();
    GlStateManager.func_179121_F();
  }
  
  public static void renderThree() {
    GL11.glStencilFunc((int)-563264546L ^ 0xDE6D41DC, (int)-539446223L ^ 0xDFD8B430, (int)-1750972340L ^ 0x97A24843);
    GL11.glStencilOp((int)1101599430L ^ 0x41A90CC6, (int)1959793742L ^ 0x74D00A4E, (int)-1112870967L ^ 0xBDAAF1C9);
    GL11.glPolygonMode((int)1056731467L ^ 0x3EFC7543, (int)-1595647911L ^ 0xA0E44358);
  }
  
  public static void drawBoxESP(BlockPos pos, Color color, float lineWidth, boolean outline, boolean box, int boxAlpha) {
    AxisAlignedBB bb = new AxisAlignedBB(pos.func_177958_n() - (mc.func_175598_ae()).field_78730_l, pos.func_177956_o() - (mc.func_175598_ae()).field_78731_m, pos.func_177952_p() - (mc.func_175598_ae()).field_78728_n, (pos.func_177958_n() + ((int)-532067071L ^ 0xE0494D00)) - (mc.func_175598_ae()).field_78730_l, (pos.func_177956_o() + ((int)1173868824L ^ 0x45F7D119)) - (mc.func_175598_ae()).field_78731_m, (pos.func_177952_p() + ((int)566884650L ^ 0x21C9F92B)) - (mc.func_175598_ae()).field_78728_n);
    camera.func_78547_a(((Entity)Objects.requireNonNull((T)mc.func_175606_aa())).field_70165_t, (mc.func_175606_aa()).field_70163_u, (mc.func_175606_aa()).field_70161_v);
    if (camera.func_78546_a(new AxisAlignedBB(bb.field_72340_a + (mc.func_175598_ae()).field_78730_l, bb.field_72338_b + (mc.func_175598_ae()).field_78731_m, bb.field_72339_c + (mc.func_175598_ae()).field_78728_n, bb.field_72336_d + (mc.func_175598_ae()).field_78730_l, bb.field_72337_e + (mc.func_175598_ae()).field_78731_m, bb.field_72334_f + (mc.func_175598_ae()).field_78728_n))) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179147_l();
      GlStateManager.func_179097_i();
      GlStateManager.func_179120_a((int)-1688636825L ^ 0x9B597165, (int)-1282392250L ^ 0xB3903C45, (int)127037494L ^ 0x7927036, (int)-1906831930L ^ 0x8E580DC7);
      GlStateManager.func_179090_x();
      GlStateManager.func_179132_a((int)-1484355456L ^ 0xA7868880);
      GL11.glEnable((int)998002585L ^ 0x3B7C44B9);
      GL11.glHint((int)1483915098L ^ 0x5872B308, (int)-1938598789L ^ 0x8C734579);
      GL11.glLineWidth(lineWidth);
      double dist = mc.field_71439_g.func_70011_f((pos.func_177958_n() + Float.intBitsToFloat(Float.floatToIntBits(2.007153F) ^ 0x7F007532)), (pos.func_177956_o() + Float.intBitsToFloat(Float.floatToIntBits(3.4773917F) ^ 0x7F5E8D96)), (pos.func_177952_p() + Float.intBitsToFloat(Float.floatToIntBits(3.2496052F) ^ 0x7F4FF988))) * Double.longBitsToDouble(Double.doubleToLongBits(25.543748928249766D) ^ 0x7FD18B332138115BL);
      if (box)
        RenderGlobal.func_189696_b(bb, color.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.12259341F) ^ 0x7E841241), color.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.040225472F) ^ 0x7E5BC377), color.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(1.3913115F) ^ 0x7CCD167F), boxAlpha / Float.intBitsToFloat(Float.floatToIntBits(0.06345906F) ^ 0x7EFEF6D3)); 
      if (outline)
        RenderGlobal.func_189694_a(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c, bb.field_72336_d, bb.field_72337_e, bb.field_72334_f, color.getRed() / Float.intBitsToFloat(Float.floatToIntBits(1.2080611F) ^ 0x7CE5A1BF), color.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.0082943F) ^ 0x7F78E4D1), color.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.11111658F) ^ 0x7E9C9117), color.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.01299323F) ^ 0x7F2BE18E)); 
      GL11.glDisable((int)435547630L ^ 0x19F5E6CE);
      GlStateManager.func_179132_a((int)1617497589L ^ 0x60690DF4);
      GlStateManager.func_179126_j();
      GlStateManager.func_179098_w();
      GlStateManager.func_179084_k();
      GlStateManager.func_179121_F();
    } 
  }
  
  public static float[][] getBipedRotations(ModelBiped biped) {
    float[][] rotations = new float[(int)-834937241L ^ 0xCE3BDE62][];
    (new float[(int)-693994084L ^ 0xD6A27D9F])[(int)-1261395334L ^ 0xB4D0A27A] = biped.field_78116_c.field_78795_f;
    (new float[(int)-693994084L ^ 0xD6A27D9F])[(int)-2030823839L ^ 0x86F41660] = biped.field_78116_c.field_78796_g;
    (new float[(int)-693994084L ^ 0xD6A27D9F])[(int)-1510490453L ^ 0xA5F7BEA9] = biped.field_78116_c.field_78808_h;
    float[] headRotation = new float[(int)-693994084L ^ 0xD6A27D9F];
    rotations[(int)-1843833042L ^ 0x9219572E] = headRotation;
    (new float[(int)-1322754236L ^ 0xB1285F47])[(int)294697607L ^ 0x1190BA87] = biped.field_178723_h.field_78795_f;
    (new float[(int)-1322754236L ^ 0xB1285F47])[(int)-1386852084L ^ 0xAD56510D] = biped.field_178723_h.field_78796_g;
    (new float[(int)-1322754236L ^ 0xB1285F47])[(int)1516433911L ^ 0x5A62F1F5] = biped.field_178723_h.field_78808_h;
    float[] rightArmRotation = new float[(int)-1322754236L ^ 0xB1285F47];
    rotations[(int)119783680L ^ 0x723C101] = rightArmRotation;
    (new float[(int)169699440L ^ 0xA1D6873])[(int)-2017184904L ^ 0x87C43378] = biped.field_178724_i.field_78795_f;
    (new float[(int)169699440L ^ 0xA1D6873])[(int)1219903404L ^ 0x48B63FAD] = biped.field_178724_i.field_78796_g;
    (new float[(int)169699440L ^ 0xA1D6873])[(int)523150175L ^ 0x1F2EA35D] = biped.field_178724_i.field_78808_h;
    float[] leftArmRotation = new float[(int)169699440L ^ 0xA1D6873];
    rotations[(int)-1908236422L ^ 0x8E429F78] = leftArmRotation;
    (new float[(int)1654229526L ^ 0x62998A15])[(int)-573282738L ^ 0xDDD4664E] = biped.field_178721_j.field_78795_f;
    (new float[(int)1654229526L ^ 0x62998A15])[(int)-1442779846L ^ 0xAA00ED3B] = biped.field_178721_j.field_78796_g;
    (new float[(int)1654229526L ^ 0x62998A15])[(int)2125510807L ^ 0x7EB0B895] = biped.field_178721_j.field_78808_h;
    float[] rightLegRotation = new float[(int)1654229526L ^ 0x62998A15];
    rotations[(int)-695642658L ^ 0xD68955DD] = rightLegRotation;
    (new float[(int)663678512L ^ 0x278EEE33])[(int)-987638202L ^ 0xC521D646] = biped.field_178722_k.field_78795_f;
    (new float[(int)663678512L ^ 0x278EEE33])[(int)-1514407959L ^ 0xA5BBF7E8] = biped.field_178722_k.field_78796_g;
    (new float[(int)663678512L ^ 0x278EEE33])[(int)1345911225L ^ 0x5038F9BB] = biped.field_178722_k.field_78808_h;
    float[] leftLegRotation = new float[(int)663678512L ^ 0x278EEE33];
    rotations[(int)-832098812L ^ 0xCE672E00] = leftLegRotation;
    return rotations;
  }
  
  public static void drawOutlinedRoundedRectangle(int x, int y, int width, int height, float radius, float dR, float dG, float dB, float dA, float outlineWidth) {
    drawRoundedRectangle(x, y, width, height, radius);
    GL11.glColor4f(dR, dG, dB, dA);
    drawRoundedRectangle(x + outlineWidth, y + outlineWidth, width - outlineWidth * Float.intBitsToFloat(Float.floatToIntBits(0.21956466F) ^ 0x7E60D58F), height - outlineWidth * Float.intBitsToFloat(Float.floatToIntBits(0.95295495F) ^ 0x7F73F4DB), radius);
  }
  
  public static void drawOpenGradientBox(BlockPos pos, Color startColor, Color endColor, double height) {
    EnumFacing[] arrayOfEnumFacing = EnumFacing.values();
    int i = arrayOfEnumFacing.length;
    for (int j = (int)1818138209L ^ 0x6C5E9661; j < i; j++) {
      EnumFacing face = arrayOfEnumFacing[j];
      if (face != EnumFacing.UP)
        drawGradientPlane(pos, face, startColor, endColor, height); 
    } 
  }
  
  public static void drawBoxESP2(BlockPos pos, Color color, boolean secondC, Color secondColor, float lineWidth, boolean outline, boolean box, int boxAlpha, boolean b, Double heightValue, Boolean gradientBoxValue, Boolean gradientOutlineValue, Boolean value, boolean air, int currentAlpha) {
    if (box)
      drawBox(pos, new Color(color.getRed(), color.getGreen(), color.getBlue(), boxAlpha)); 
    if (outline)
      drawBlockOutline(pos, secondC ? secondColor : color, lineWidth, air); 
  }
  
  public static void drawGradientRect(float x, float y, float w, float h, int startColor, int endColor) {
    float f = (startColor >> ((int)1452139082L ^ 0x568DE252) & ((int)1056443120L ^ 0x3EF80A0F)) / Float.intBitsToFloat(Float.floatToIntBits(0.0844324F) ^ 0x7ED3EAE5);
    float f1 = (startColor >> ((int)1281963341L ^ 0x4C69355D) & ((int)1955775801L ^ 0x7492C5C6)) / Float.intBitsToFloat(Float.floatToIntBits(0.10368339F) ^ 0x7EAB57F5);
    float f2 = (startColor >> ((int)653398866L ^ 0x26F2135A) & ((int)1170966669L ^ 0x45CB8872)) / Float.intBitsToFloat(Float.floatToIntBits(0.11334518F) ^ 0x7E972185);
    float f3 = (startColor & ((int)1406082405L ^ 0x53CF1D9A)) / Float.intBitsToFloat(Float.floatToIntBits(0.056534182F) ^ 0x7E189063);
    float f4 = (endColor >> ((int)-1685688387L ^ 0x9B866FA5) & ((int)519796132L ^ 0x1EFB755B)) / Float.intBitsToFloat(Float.floatToIntBits(0.012272016F) ^ 0x7F361091);
    float f5 = (endColor >> ((int)-891521571L ^ 0xCADC75CD) & ((int)1204449624L ^ 0x47CA71A7)) / Float.intBitsToFloat(Float.floatToIntBits(0.25139615F) ^ 0x7DFFB6FF);
    float f6 = (endColor >> ((int)-1122509911L ^ 0xBD17DBA1) & ((int)1606726734L ^ 0x5FC4B4B1)) / Float.intBitsToFloat(Float.floatToIntBits(0.3050749F) ^ 0x7DE332C7);
    float f7 = (endColor & ((int)482675762L ^ 0x1CC50CCD)) / Float.intBitsToFloat(Float.floatToIntBits(0.009359843F) ^ 0x7F665A07);
    GlStateManager.func_179090_x();
    GlStateManager.func_179147_l();
    GlStateManager.func_179118_c();
    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
    GlStateManager.func_179103_j((int)-269140969L ^ 0xEFF52116);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder vertexbuffer = tessellator.func_178180_c();
    vertexbuffer.func_181668_a((int)-564958499L ^ 0xDE536ADA, DefaultVertexFormats.field_181706_f);
    vertexbuffer.func_181662_b(x + w, y, Double.longBitsToDouble(Double.doubleToLongBits(1.122617942134049E308D) ^ 0x7FE3FBB71A84EDA4L)).func_181666_a(f1, f2, f3, f).func_181675_d();
    vertexbuffer.func_181662_b(x, y, Double.longBitsToDouble(Double.doubleToLongBits(6.517835389686828E307D) ^ 0x7FD7344AA8FF6293L)).func_181666_a(f1, f2, f3, f).func_181675_d();
    vertexbuffer.func_181662_b(x, y + h, Double.longBitsToDouble(Double.doubleToLongBits(1.1686184697920815E308D) ^ 0x7FE4CD566090D28EL)).func_181666_a(f5, f6, f7, f4).func_181675_d();
    vertexbuffer.func_181662_b(x + w, y + h, Double.longBitsToDouble(Double.doubleToLongBits(1.4230705953654622E308D) ^ 0x7FE954DD043AADEDL)).func_181666_a(f5, f6, f7, f4).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179103_j((int)637002426L ^ 0x25F7FFBA);
    GlStateManager.func_179084_k();
    GlStateManager.func_179141_d();
    GlStateManager.func_179098_w();
  }
  
  public static void drawOutlinedBox(AxisAlignedBB axisAlignedBB) {
    GL11.glBegin((int)119181753L ^ 0x71A91B8);
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
  
  public static void blockESP(BlockPos b, Color c, double length, double length2) {
    blockEsp(b, c, length, length2);
  }
  
  public static void renderOne(float lineWidth) {
    checkSetupFBO();
    GL11.glPushAttrib((int)-645200655L ^ 0xD984FB0E);
    GL11.glDisable((int)1634221513L ^ 0x61683609);
    GL11.glDisable((int)1058960847L ^ 0x3F1E782E);
    GL11.glDisable((int)-864553385L ^ 0xCC77FD07);
    GL11.glEnable((int)1085503830L ^ 0x40B372B4);
    GL11.glBlendFunc((int)-1529614224L ^ 0xA4D3F372, (int)-1365129603L ^ 0xAEA1C57E);
    GL11.glLineWidth(lineWidth);
    GL11.glEnable((int)-1692469533L ^ 0x9B1EFDC3);
    GL11.glEnable((int)1574602259L ^ 0x5DDA8D83);
    GL11.glClear((int)390527968L ^ 0x1746FFE0);
    GL11.glClearStencil((int)-1695500910L ^ 0x9AF0B59D);
    GL11.glStencilFunc((int)-329516549L ^ 0xEC5BFBFB, (int)1382322014L ^ 0x52648F5F, (int)-1652793213L ^ 0x9D7C608C);
    GL11.glStencilOp((int)-1603257996L ^ 0xA0702775, (int)-1625770974L ^ 0x9F18AA23, (int)1776748757L ^ 0x69E716D4);
    GL11.glPolygonMode((int)1402073020L ^ 0x5391EBB4, (int)1276587096L ^ 0x4C173759);
  }
  
  public static void setupFBO(Framebuffer fbo) {
    EXTFramebufferObject.glDeleteRenderbuffersEXT(fbo.field_147624_h);
    int stencilDepthBufferID = EXTFramebufferObject.glGenRenderbuffersEXT();
    EXTFramebufferObject.glBindRenderbufferEXT((int)1650699089L ^ 0x62632610, stencilDepthBufferID);
    EXTFramebufferObject.glRenderbufferStorageEXT((int)2107854400L ^ 0x7DA3C301, (int)-230863263L ^ 0xF23DCA98, mc.field_71443_c, mc.field_71440_d);
    EXTFramebufferObject.glFramebufferRenderbufferEXT((int)1459718663L ^ 0x57010747, (int)-754032343L ^ 0xD30EEC09, (int)-619234158L ^ 0xDB17B1D3, stencilDepthBufferID);
    EXTFramebufferObject.glFramebufferRenderbufferEXT((int)-2135735960L ^ 0x80B3CC28, (int)-1286548332L ^ 0xB3505994, (int)-32557750L ^ 0xFE0FB80B, stencilDepthBufferID);
  }
  
  public static void drawCircle(float x, float y, float radius) {
    drawCircle(x, y, radius, (int)-553918273L ^ 0xDEFBE0BF, (int)286326081L ^ 0x1110FC29, (int)1435550334L ^ 0x5590C23E);
  }
  
  public static void drawCircleOutline(float x, float y, float radius) {
    drawCircleOutline(x, y, radius, (int)-1471475429L ^ 0xA84B111B, (int)169464633L ^ 0xA19D251, (int)-80256386L ^ 0xFB376256);
  }
  
  public static AxisAlignedBB getBoundingBox(BlockPos blockPos) {
    return mc.field_71441_e.func_180495_p(blockPos).func_185900_c((IBlockAccess)mc.field_71441_e, blockPos).func_186670_a(blockPos);
  }
  
  public static void drawProperGradientBlockOutline(AxisAlignedBB bb, Color startColor, Color midColor, Color endColor, float linewidth) {
    float red = endColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.04687756F) ^ 0x7E3F02AF);
    float green = endColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.011958893F) ^ 0x7F3CEF3C);
    float blue = endColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.084165536F) ^ 0x7ED35EFB);
    float alpha = endColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.008158432F) ^ 0x7F7AAAF2);
    float red1 = midColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.010897571F) ^ 0x7F4D8BBA);
    float green1 = midColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.12414146F) ^ 0x7E813DE1);
    float blue1 = midColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.009004609F) ^ 0x7F6C8811);
    float alpha1 = midColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.081583045F) ^ 0x7ED81503);
    float red2 = startColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.06424605F) ^ 0x7EFC936F);
    float green2 = startColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.10520253F) ^ 0x7EA8746D);
    float blue2 = startColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.01206331F) ^ 0x7F3AA530);
    float alpha2 = startColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.008342765F) ^ 0x7F77B018);
    double dif = (bb.field_72337_e - bb.field_72338_b) / Double.longBitsToDouble(Double.doubleToLongBits(0.87204450299123D) ^ 0x7FEBE7C9DFA02002L);
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)-732423084L ^ 0xD4581F56, (int)9661186L ^ 0x936801, (int)363281218L ^ 0x15A73B42, (int)808230763L ^ 0x302C9F6A);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)-1985365496L ^ 0x89A9BA08);
    GL11.glEnable((int)12785679L ^ 0xC3132F);
    GL11.glHint((int)1116908830L ^ 0x4292A14C, (int)1064600833L ^ 0x3F749403);
    GL11.glLineWidth(linewidth);
    GL11.glBegin((int)-2069380544L ^ 0x84A7C241);
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
    GL11.glColor4d(red1, green1, blue1, alpha1);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b + dif, bb.field_72339_c);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b + dif, bb.field_72339_c);
    GL11.glColor4f(red2, green2, blue2, alpha2);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c);
    GL11.glColor4d(red, green, blue, alpha);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f);
    GL11.glColor4d(red1, green1, blue1, alpha1);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b + dif, bb.field_72334_f);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72338_b + dif, bb.field_72334_f);
    GL11.glColor4d(red2, green2, blue2, alpha2);
    GL11.glVertex3d(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f);
    GL11.glColor4d(red, green, blue, alpha);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f);
    GL11.glColor4d(red1, green1, blue1, alpha1);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b + dif, bb.field_72334_f);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b + dif, bb.field_72334_f);
    GL11.glColor4d(red2, green2, blue2, alpha2);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f);
    GL11.glColor4d(red, green, blue, alpha);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c);
    GL11.glColor4d(red1, green1, blue1, alpha1);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b + dif, bb.field_72339_c);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72338_b + dif, bb.field_72339_c);
    GL11.glColor4d(red2, green2, blue2, alpha2);
    GL11.glVertex3d(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c);
    GL11.glColor4d(red2, green2, blue2, alpha2);
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
    GL11.glDisable((int)608317958L ^ 0x24423926);
    GlStateManager.func_179132_a((int)506019499L ^ 0x1E293EAA);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void drawSelectionBoundingBox(AxisAlignedBB boundingBox) {
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder vertexbuffer = tessellator.func_178180_c();
    vertexbuffer.func_181668_a((int)55806332L ^ 0x353897F, DefaultVertexFormats.field_181705_e);
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72338_b, boundingBox.field_72339_c).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72336_d, boundingBox.field_72338_b, boundingBox.field_72339_c).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72336_d, boundingBox.field_72338_b, boundingBox.field_72334_f).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72338_b, boundingBox.field_72334_f).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72338_b, boundingBox.field_72339_c).func_181675_d();
    tessellator.func_78381_a();
    vertexbuffer.func_181668_a((int)773630527L ^ 0x2E1CAA3C, DefaultVertexFormats.field_181705_e);
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72337_e, boundingBox.field_72339_c).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72336_d, boundingBox.field_72337_e, boundingBox.field_72339_c).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72336_d, boundingBox.field_72337_e, boundingBox.field_72334_f).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72337_e, boundingBox.field_72334_f).func_181675_d();
    vertexbuffer.func_181662_b(boundingBox.field_72340_a, boundingBox.field_72337_e, boundingBox.field_72339_c).func_181675_d();
    tessellator.func_78381_a();
    vertexbuffer.func_181668_a((int)-154218460L ^ 0xF6CED025, DefaultVertexFormats.field_181705_e);
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
  
  public static void drawGradientBlockOutline(BlockPos pos, Color startColor, Color endColor, float linewidth, double height) {
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    Vec3d interp = EntityUtil.interpolateEntity((Entity)mc.field_71439_g, mc.func_184121_ak());
    drawGradientBlockOutline(iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(913.610517895775D) ^ 0x7FECEEAFB734DFD0L)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c).func_72321_a(Double.longBitsToDouble(Double.doubleToLongBits(1.5739296977729679E308D) ^ 0x7FEC045228011674L), height, Double.longBitsToDouble(Double.doubleToLongBits(6.389735956831323E306D) ^ 0x7FA232D59EBCF0CFL)), startColor, endColor, linewidth);
  }
  
  public static void GLPre(boolean depth, boolean texture, boolean clean, boolean bind, boolean override, float lineWidth) {
    if (depth)
      GL11.glDisable((int)-248211356L ^ 0xF1349334); 
    if (!texture)
      GL11.glEnable((int)1847889749L ^ 0x6E2484B7); 
    GL11.glLineWidth(lineWidth);
    if (clean)
      GL11.glDisable((int)476281819L ^ 0x1C63763A); 
    if (bind)
      GL11.glDisable((int)-1432395485L ^ 0xAA9F6A52); 
    if (!override)
      GL11.glEnable((int)-992997777L ^ 0xC4D0054F); 
    GlStateManager.func_187401_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
    GL11.glHint((int)1127120996L ^ 0x432E8C36, (int)-1099546381L ^ 0xBE7651F1);
    GlStateManager.func_179132_a((int)-916419967L ^ 0xC9608A81);
  }
  
  public static void renderFive() {
    GL11.glPolygonOffset(Float.intBitsToFloat(Float.floatToIntBits(5.6057878F) ^ 0x7F33629D), Float.intBitsToFloat(Float.floatToIntBits(1.2115127E-5F) ^ 0x7EBF6613));
    GL11.glDisable((int)557701382L ^ 0x213DF304);
    GL11.glEnable((int)-118282355L ^ 0xF8F32CFC);
    GL11.glDepthMask((int)-876145026L ^ 0xCBC7167F);
    GL11.glDisable((int)619578018L ^ 0x24EE0932);
    GL11.glDisable((int)-712674783L ^ 0xD5857901);
    GL11.glHint((int)2008201994L ^ 0x77B2B758, (int)323016592L ^ 0x1340C690);
    GL11.glEnable((int)918566354L ^ 0x36C03E30);
    GL11.glEnable((int)2040053228L ^ 0x7998B6BC);
    GL11.glEnable((int)-2021478878L ^ 0x8782A3C3);
    GL11.glEnable((int)-282531892L ^ 0xEF28EC0C);
    GL11.glPopAttrib();
  }
  
  public static void drawRect(float x, float y, float w, float h, int color) {
    float alpha = (color >> ((int)996556367L ^ 0x3B663E57) & ((int)-1011201132L ^ 0xC3BA4B6B)) / Float.intBitsToFloat(Float.floatToIntBits(0.010718119F) ^ 0x7F509B0D);
    float red = (color >> ((int)1497749596L ^ 0x5945D84C) & ((int)-1683079109L ^ 0x9BAE40C4)) / Float.intBitsToFloat(Float.floatToIntBits(0.010139851F) ^ 0x7F59219E);
    float green = (color >> ((int)1130435891L ^ 0x4361153B) & ((int)-372164476L ^ 0xE9D1387B)) / Float.intBitsToFloat(Float.floatToIntBits(0.009982403F) ^ 0x7F5C8D3C);
    float blue = (color & ((int)-1630004614L ^ 0x9ED81A85)) / Float.intBitsToFloat(Float.floatToIntBits(0.03866556F) ^ 0x7E615FC7);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    GlStateManager.func_179147_l();
    GlStateManager.func_179090_x();
    GlStateManager.func_179120_a((int)-620630169L ^ 0xDB01EC65, (int)549975820L ^ 0x20C7F40F, (int)-2120606127L ^ 0x819A1E50, (int)1030169069L ^ 0x3D6721ED);
    bufferbuilder.func_181668_a((int)-19045020L ^ 0xFEDD6563, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(x, h, Double.longBitsToDouble(Double.doubleToLongBits(2.0188846718938465E307D) ^ 0x7FBCBFF79D3E548FL)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(w, h, Double.longBitsToDouble(Double.doubleToLongBits(1.137667610665166E308D) ^ 0x7FE4404BBD1D59C3L)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(w, y, Double.longBitsToDouble(Double.doubleToLongBits(6.092016290322004E306D) ^ 0x7FA159C36EF46F8FL)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(x, y, Double.longBitsToDouble(Double.doubleToLongBits(6.820912433923301E307D) ^ 0x7FD848835ADA58E5L)).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
  }
  
  public static void drawRoundedRectangle(float x, float y, float width, float height, float radius) {
    GL11.glEnable((int)-879806133L ^ 0xCB8F32A9);
    drawArc(x + width - radius, y + height - radius, radius, Float.intBitsToFloat(Float.floatToIntBits(1.3358041E38F) ^ 0x7EC8FD4D), Float.intBitsToFloat(Float.floatToIntBits(0.011452348F) ^ 0x7E8FA2A1), (int)198794177L ^ 0xBD95BD1);
    drawArc(x + radius, y + height - radius, radius, Float.intBitsToFloat(Float.floatToIntBits(0.093133956F) ^ 0x7F0ABD04), Float.intBitsToFloat(Float.floatToIntBits(0.03528702F) ^ 0x7E24891F), (int)720326006L ^ 0x2AEF4D66);
    drawArc(x + radius, y + radius, radius, Float.intBitsToFloat(Float.floatToIntBits(0.008228151F) ^ 0x7F32CF5E), Float.intBitsToFloat(Float.floatToIntBits(0.081337444F) ^ 0x7E21943F), (int)-176319806L ^ 0xF57D92D2);
    drawArc(x + width - radius, y + radius, radius, Float.intBitsToFloat(Float.floatToIntBits(0.029869044F) ^ 0x7F73AFED), Float.intBitsToFloat(Float.floatToIntBits(0.043107506F) ^ 0x7E84917F), (int)-1329561148L ^ 0xB0C081D4);
    GL11.glBegin((int)-1114704813L ^ 0xBD8EF457);
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
  
  public static void GLPre(float lineWidth) {
    depth = GL11.glIsEnabled((int)-1412659818L ^ 0xABCC8EC6);
    texture = GL11.glIsEnabled((int)1434925961L ^ 0x5587306B);
    clean = GL11.glIsEnabled((int)-2048548295L ^ 0x85E5AFD8);
    bind = GL11.glIsEnabled((int)-821941252L ^ 0xCF02208D);
    override = GL11.glIsEnabled((int)-1644648755L ^ 0x9DF8ADED);
    GLPre(depth, texture, clean, bind, override, lineWidth);
  }
  
  public static void drawArcOutline(float cx, float cy, float r, float start_angle, float end_angle, int num_segments) {
    GL11.glBegin((int)353421303L ^ 0x1510C7F5);
    for (int i = (int)(num_segments / Float.intBitsToFloat(Float.floatToIntBits(0.046797927F) ^ 0x7E8BAF2F) / start_angle) + ((int)-1731186325L ^ 0x98D0316A); i <= num_segments / Float.intBitsToFloat(Float.floatToIntBits(1.956436F) ^ 0x7C4E6C7F) / end_angle; i++) {
      double angle = Double.longBitsToDouble(Double.doubleToLongBits(1.3042414545950753D) ^ 0x7FEDFFD71DDD0157L) * i / num_segments;
      GL11.glVertex2d(cx + Math.cos(angle) * r, cy + Math.sin(angle) * r);
    } 
    glEnd();
  }
  
  public static void drawRectangleCorrectly(int x, int y, int w, int h, int color) {
    GL11.glLineWidth(Float.intBitsToFloat(Float.floatToIntBits(12.801303F) ^ 0x7ECCD223));
    Gui.func_73734_a(x, y, x + w, y + h, color);
  }
  
  public static AxisAlignedBB interpolateAxis(AxisAlignedBB bb) {
    return new AxisAlignedBB(bb.field_72340_a - (mc.func_175598_ae()).field_78730_l, bb.field_72338_b - (mc.func_175598_ae()).field_78731_m, bb.field_72339_c - (mc.func_175598_ae()).field_78728_n, bb.field_72336_d - (mc.func_175598_ae()).field_78730_l, bb.field_72337_e - (mc.func_175598_ae()).field_78731_m, bb.field_72334_f - (mc.func_175598_ae()).field_78728_n);
  }
  
  public static void drawFilledBoxESPN(BlockPos pos, Color color) {
    AxisAlignedBB bb = new AxisAlignedBB(pos.func_177958_n() - (mc.func_175598_ae()).field_78730_l, pos.func_177956_o() - (mc.func_175598_ae()).field_78731_m, pos.func_177952_p() - (mc.func_175598_ae()).field_78728_n, (pos.func_177958_n() + ((int)2121645031L ^ 0x7E75BBE6)) - (mc.func_175598_ae()).field_78730_l, (pos.func_177956_o() + ((int)978515866L ^ 0x3A52F79B)) - (mc.func_175598_ae()).field_78731_m, (pos.func_177952_p() + ((int)-1593344079L ^ 0xA1077FB0)) - (mc.func_175598_ae()).field_78728_n);
    int rgba = ColorUtil.toRGBA(color);
    drawFilledBox(bb, rgba);
  }
  
  public static void drawOutlineRect(float x, float y, float w, float h, int color) {
    float alpha = (color >> ((int)-41455416L ^ 0xFD8770D0) & ((int)-695531322L ^ 0xD68B0839)) / Float.intBitsToFloat(Float.floatToIntBits(0.014939754F) ^ 0x7F0BC5DF);
    float red = (color >> ((int)-1607524955L ^ 0xA02F1DB5) & ((int)1151612000L ^ 0x44A4349F)) / Float.intBitsToFloat(Float.floatToIntBits(0.043809753F) ^ 0x7E4C71DB);
    float green = (color >> ((int)-1264440781L ^ 0xB4A22A3B) & ((int)1511732574L ^ 0x5A1B35A1)) / Float.intBitsToFloat(Float.floatToIntBits(0.23108314F) ^ 0x7D13A10F);
    float blue = (color & ((int)-65986053L ^ 0xFC112104)) / Float.intBitsToFloat(Float.floatToIntBits(0.17710398F) ^ 0x7D4A5ABF);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    GlStateManager.func_179147_l();
    GlStateManager.func_179090_x();
    GlStateManager.func_187441_d(Float.intBitsToFloat(Float.floatToIntBits(19.757467F) ^ 0x7E1E0F4B));
    GlStateManager.func_179120_a((int)861232648L ^ 0x33555D0A, (int)43665092L ^ 0x29A45C7, (int)-263340051L ^ 0xF04DBFEC, (int)-169369981L ^ 0xF5E79E83);
    bufferbuilder.func_181668_a((int)1195145489L ^ 0x473C7913, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(x, h, Double.longBitsToDouble(Double.doubleToLongBits(2.2210429660478158E307D) ^ 0x7FBFA0F298688617L)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(w, h, Double.longBitsToDouble(Double.doubleToLongBits(4.585957176948293E306D) ^ 0x7F9A1F5ACBB33EFFL)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(w, y, Double.longBitsToDouble(Double.doubleToLongBits(1.3604758462140628E308D) ^ 0x7FE8379F438F4674L)).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(x, y, Double.longBitsToDouble(Double.doubleToLongBits(6.291085047265315E307D) ^ 0x7FD665A232E9D675L)).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
  }
  
  public static void drawCircle(float x, float y, float radius, int start, int end, int segments) {
    drawArc(x, y, radius, start, end, segments);
  }
  
  static {
    viewport = BufferUtils.createIntBuffer((int)402857074L ^ 0x18031C62);
    modelView = BufferUtils.createFloatBuffer((int)1551496879L ^ 0x5C79F6BF);
    projection = BufferUtils.createFloatBuffer((int)-631041758L ^ 0xDA631132);
    itemRender = (mc.func_175597_ag()).field_178112_h;
    camera = (ICamera)new Frustum();
    depth = GL11.glIsEnabled((int)-100841374L ^ 0xF9FD4332);
    texture = GL11.glIsEnabled((int)-1159548219L ^ 0xBAE2B927);
    clean = GL11.glIsEnabled((int)-243294495L ^ 0xF17F9300);
    bind = GL11.glIsEnabled((int)1310626254L ^ 0x4E1E9ABF);
    override = GL11.glIsEnabled((int)1850643289L ^ 0x6E4E9879);
    itemRender = mc.func_175599_af();
    camera = (ICamera)new Frustum();
    depth = GL11.glIsEnabled((int)-1597716295L ^ 0xA0C4C3E9);
    texture = GL11.glIsEnabled((int)1657434370L ^ 0x62CA7AE0);
    clean = GL11.glIsEnabled((int)1475928977L ^ 0x57F8EE70);
    bind = GL11.glIsEnabled((int)-1451691064L ^ 0xA978F8B9);
    override = GL11.glIsEnabled((int)-1929870585L ^ 0x8CF88827);
  }
  
  public static void checkSetupFBO() {
    Framebuffer fbo = mc.field_147124_at;
    if (fbo != null && fbo.field_147624_h > ((int)465657550L ^ 0xE43EA131)) {
      setupFBO(fbo);
      fbo.field_147624_h = (int)1382073297L ^ 0xAD9F3C2E;
    } 
  }
  
  public static void glEnd() {
    GL11.glColor4f(Float.intBitsToFloat(Float.floatToIntBits(7.06501F) ^ 0x7F621490), Float.intBitsToFloat(Float.floatToIntBits(23.985212F) ^ 0x7E3FE1B7), Float.intBitsToFloat(Float.floatToIntBits(6.1564746F) ^ 0x7F4501D7), Float.intBitsToFloat(Float.floatToIntBits(47.50189F) ^ 0x7DBE01EF));
    GL11.glPopMatrix();
    GL11.glEnable((int)1913250695L ^ 0x7209E8F6);
    GL11.glEnable((int)970899685L ^ 0x39DECD04);
    GL11.glDisable((int)292404247L ^ 0x116DB7F5);
    GL11.glDisable((int)67603304L ^ 0x4078048);
  }
  
  public static void glrendermethod() {
    GL11.glEnable((int)351082170L ^ 0x14ED1D58);
    GL11.glBlendFunc((int)-1032151280L ^ 0xC27A9C12, (int)-1956319635L ^ 0x8B64ED6E);
    GL11.glEnable((int)1087374427L ^ 0x40D00F7B);
    GL11.glLineWidth(Float.intBitsToFloat(Float.floatToIntBits(0.1861885F) ^ 0x7E3EA833));
    GL11.glDisable((int)-121304695L ^ 0xF8C50468);
    GL11.glEnable((int)-3501907L ^ 0xFFCA9BE9);
    GL11.glDisable((int)-581903320L ^ 0xDD50D759);
    double viewerPosX = (mc.func_175598_ae()).field_78730_l;
    double viewerPosY = (mc.func_175598_ae()).field_78731_m;
    double viewerPosZ = (mc.func_175598_ae()).field_78728_n;
    GL11.glPushMatrix();
    GL11.glTranslated(-viewerPosX, -viewerPosY, -viewerPosZ);
  }
  
  public static void drawGradientFilledBox(AxisAlignedBB bb, Color startColor, Color endColor) {
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)-1053378835L ^ 0xC136B5EF, (int)690337215L ^ 0x2925B6BC, (int)1838545377L ^ 0x6D95F9E1, (int)-798292256L ^ 0xD06B06E1);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)-1897761137L ^ 0x8EE2768F);
    float alpha = endColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.031827744F) ^ 0x7E7D5DCF);
    float red = endColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.012013769F) ^ 0x7F3BD566);
    float green = endColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.09333912F) ^ 0x7EC02895);
    float blue = endColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.012903203F) ^ 0x7F2C67F5);
    float alpha1 = startColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.007868219F) ^ 0x7F7FE9B4);
    float red1 = startColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.031997662F) ^ 0x7E7C0FFB);
    float green1 = startColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.010160613F) ^ 0x7F5978B3);
    float blue1 = startColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.008406174F) ^ 0x7F76BA0D);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)-2030872462L ^ 0x86F35875, DefaultVertexFormats.field_181706_f);
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72339_c).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72338_b, bb.field_72334_f).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72336_d, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72339_c).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72338_b, bb.field_72334_f).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72334_f).func_181666_a(red, green, blue, alpha).func_181675_d();
    bufferbuilder.func_181662_b(bb.field_72340_a, bb.field_72337_e, bb.field_72339_c).func_181666_a(red, green, blue, alpha).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179132_a((int)1419384114L ^ 0x549A1533);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void drawGradientRect(int x, int y, int w, int h, int startColor, int endColor) {
    float f = (startColor >> ((int)-184406310L ^ 0xF5022EC2) & ((int)1645927579L ^ 0x621ADC64)) / Float.intBitsToFloat(Float.floatToIntBits(0.120488696F) ^ 0x7E89C2C7);
    float f1 = (startColor >> ((int)489015275L ^ 0x1D25C7FB) & ((int)-173787767L ^ 0xF5A43576)) / Float.intBitsToFloat(Float.floatToIntBits(0.11562807F) ^ 0x7E93CE69);
    float f2 = (startColor >> ((int)1365488822L ^ 0x5163B4BE) & ((int)-1928817348L ^ 0x8D0895C3)) / Float.intBitsToFloat(Float.floatToIntBits(0.013995482F) ^ 0x7F1A4D4E);
    float f3 = (startColor & ((int)1384460464L ^ 0x5285304F)) / Float.intBitsToFloat(Float.floatToIntBits(0.011307483F) ^ 0x7F464305);
    float f4 = (endColor >> ((int)-528824762L ^ 0xE07AC65E) & ((int)-46574800L ^ 0xFD3953CF)) / Float.intBitsToFloat(Float.floatToIntBits(0.013248747F) ^ 0x7F261146);
    float f5 = (endColor >> ((int)1966596498L ^ 0x7537E182) & ((int)-1505332832L ^ 0xA646715F)) / Float.intBitsToFloat(Float.floatToIntBits(0.010912901F) ^ 0x7F4DCC06);
    float f6 = (endColor >> ((int)-535249476L ^ 0xE018BDB4) & ((int)-1383103190L ^ 0xAD8F85D5)) / Float.intBitsToFloat(Float.floatToIntBits(0.0154756615F) ^ 0x7F028DA1);
    float f7 = (endColor & ((int)502086402L ^ 0x1DED3BFD)) / Float.intBitsToFloat(Float.floatToIntBits(0.06546586F) ^ 0x7EF912F7);
    GlStateManager.func_179090_x();
    GlStateManager.func_179147_l();
    GlStateManager.func_179118_c();
    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
    GlStateManager.func_179103_j((int)492687077L ^ 0x1D5DD3E4);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder vertexbuffer = tessellator.func_178180_c();
    vertexbuffer.func_181668_a((int)-959807231L ^ 0xC6CA8106, DefaultVertexFormats.field_181706_f);
    vertexbuffer.func_181662_b(x + w, y, Double.longBitsToDouble(Double.doubleToLongBits(1.0794432638238113E308D) ^ 0x7FE336F8686FD4F4L)).func_181666_a(f1, f2, f3, f).func_181675_d();
    vertexbuffer.func_181662_b(x, y, Double.longBitsToDouble(Double.doubleToLongBits(1.0740280289125974E308D) ^ 0x7FE31E4B1B157367L)).func_181666_a(f1, f2, f3, f).func_181675_d();
    vertexbuffer.func_181662_b(x, y + h, Double.longBitsToDouble(Double.doubleToLongBits(1.4598599544159156E306D) ^ 0x7F80A19B58CB5A3FL)).func_181666_a(f5, f6, f7, f4).func_181675_d();
    vertexbuffer.func_181662_b(x + w, y + h, Double.longBitsToDouble(Double.doubleToLongBits(2.0738969109379867E307D) ^ 0x7FBD88848916D4E7L)).func_181666_a(f5, f6, f7, f4).func_181675_d();
    tessellator.func_78381_a();
    GlStateManager.func_179103_j((int)-1950774459L ^ 0x8BB99645);
    GlStateManager.func_179084_k();
    GlStateManager.func_179141_d();
    GlStateManager.func_179098_w();
  }
  
  public static void drawGradientPlane(BlockPos pos, EnumFacing face, Color startColor, Color endColor, boolean half, boolean top) {
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder builder = tessellator.func_178180_c();
    IBlockState iblockstate = mc.field_71441_e.func_180495_p(pos);
    Vec3d interp = EntityUtil.interpolateEntity((Entity)mc.field_71439_g, mc.func_184121_ak());
    AxisAlignedBB bb = iblockstate.func_185918_c((World)mc.field_71441_e, pos).func_186662_g(Double.longBitsToDouble(Double.doubleToLongBits(3911.1514296956734D) ^ 0x7FCEEC0068316D1FL)).func_72317_d(-interp.field_72450_a, -interp.field_72448_b, -interp.field_72449_c);
    float red = startColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.24189948F) ^ 0x7D08B47F);
    float green = startColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.11136856F) ^ 0x7E9B1533);
    float blue = startColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.12214651F) ^ 0x7E8527F3);
    float alpha = startColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(0.011953865F) ^ 0x7F3CDA25);
    float red1 = endColor.getRed() / Float.intBitsToFloat(Float.floatToIntBits(0.46454594F) ^ 0x7D92D8F7);
    float green1 = endColor.getGreen() / Float.intBitsToFloat(Float.floatToIntBits(0.008681046F) ^ 0x7F713AF2);
    float blue1 = endColor.getBlue() / Float.intBitsToFloat(Float.floatToIntBits(0.03550997F) ^ 0x7E6E72E7);
    float alpha1 = endColor.getAlpha() / Float.intBitsToFloat(Float.floatToIntBits(8.756853E-5F) ^ 0x7BC8A4FF);
    double x1 = Double.longBitsToDouble(Double.doubleToLongBits(1.3995849942931187E308D) ^ 0x7FE8E9D731FA00F2L);
    double y1 = Double.longBitsToDouble(Double.doubleToLongBits(1.5477188266287792E308D) ^ 0x7FEB8CE117388916L);
    double z1 = Double.longBitsToDouble(Double.doubleToLongBits(4.146606604324988E307D) ^ 0x7FCD865A8AC28883L);
    double x2 = Double.longBitsToDouble(Double.doubleToLongBits(3.8552623131053634E307D) ^ 0x7FCB734C073EECA7L);
    double y2 = Double.longBitsToDouble(Double.doubleToLongBits(3.1407109518791356E307D) ^ 0x7FC65CD3A2417BE3L);
    double z2 = Double.longBitsToDouble(Double.doubleToLongBits(5.032126716801545E307D) ^ 0x7FD1EA3B32769A49L);
    if (face == EnumFacing.DOWN) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72336_d;
      y1 = bb.field_72338_b + (top ? Double.longBitsToDouble(Double.doubleToLongBits(13.922942973525485D) ^ 0x7FCBD88BFB3EBADBL) : Double.longBitsToDouble(Double.doubleToLongBits(1.2686949549826726E308D) ^ 0x7FE695618E3A7BB9L));
      y2 = bb.field_72338_b + (top ? Double.longBitsToDouble(Double.doubleToLongBits(24.005999325342646D) ^ 0x7FD801892BFA250DL) : Double.longBitsToDouble(Double.doubleToLongBits(1.2760645417469276E308D) ^ 0x7FE6B6F6C3BC5DB1L));
      z1 = bb.field_72339_c;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.UP) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72336_d;
      y1 = bb.field_72337_e / (half ? ((int)1955168592L ^ 0x74898152) : ((int)2005202796L ^ 0x7784F76D));
      y2 = bb.field_72337_e / (half ? ((int)1627806326L ^ 0x61065A74) : ((int)1613386963L ^ 0x602A54D2));
      z1 = bb.field_72339_c;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.EAST) {
      x1 = bb.field_72336_d;
      x2 = bb.field_72336_d;
      y1 = bb.field_72338_b + (top ? Double.longBitsToDouble(Double.doubleToLongBits(2.5582024978953006D) ^ 0x7FE47732DF080BEEL) : Double.longBitsToDouble(Double.doubleToLongBits(1.4364934144709646E308D) ^ 0x7FE99207CD6C26F3L));
      y2 = bb.field_72337_e / (half ? ((int)-1287735165L ^ 0xB33EB881) : ((int)-1051479605L ^ 0xC153B1CA));
      z1 = bb.field_72339_c;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.WEST) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72340_a;
      y1 = bb.field_72338_b + (top ? Double.longBitsToDouble(Double.doubleToLongBits(108.16976939042648D) ^ 0x7FBB0ADD806EEF97L) : Double.longBitsToDouble(Double.doubleToLongBits(1.1974060439659977E308D) ^ 0x7FE550855F2BC5BEL));
      y2 = bb.field_72337_e / (half ? ((int)-1906422084L ^ 0x8E5E4EBE) : ((int)-1458998373L ^ 0xA909739A));
      z1 = bb.field_72339_c;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.SOUTH) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72336_d;
      y1 = bb.field_72338_b + (top ? Double.longBitsToDouble(Double.doubleToLongBits(2.5257195282883687D) ^ 0x7FE434AC70A6EFCDL) : Double.longBitsToDouble(Double.doubleToLongBits(1.58740943392216E308D) ^ 0x7FEC41BF5726C6B0L));
      y2 = bb.field_72337_e / (half ? ((int)-1952247356L ^ 0x8BA311C6) : ((int)1554612507L ^ 0x5CA9811A));
      z1 = bb.field_72334_f;
      z2 = bb.field_72334_f;
    } else if (face == EnumFacing.NORTH) {
      x1 = bb.field_72340_a;
      x2 = bb.field_72336_d;
      y1 = bb.field_72338_b + (top ? Double.longBitsToDouble(Double.doubleToLongBits(3.2245451313958164D) ^ 0x7FE9CBDE515E9185L) : Double.longBitsToDouble(Double.doubleToLongBits(1.3490822158442456E308D) ^ 0x7FE803B3B0222C16L));
      y2 = bb.field_72337_e / (half ? ((int)712818224L ^ 0x2A7CBE32) : ((int)1886996099L ^ 0x70794682));
      z1 = bb.field_72339_c;
      z2 = bb.field_72339_c;
    } 
    GlStateManager.func_179094_E();
    GlStateManager.func_179097_i();
    GlStateManager.func_179090_x();
    GlStateManager.func_179147_l();
    GlStateManager.func_179118_c();
    GlStateManager.func_179132_a((int)1968459115L ^ 0x75544D6B);
    builder.func_181668_a((int)1382517227L ^ 0x526789EE, DefaultVertexFormats.field_181706_f);
    if (face == EnumFacing.EAST || face == EnumFacing.WEST || face == EnumFacing.NORTH || face == EnumFacing.SOUTH) {
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red, green, blue, alpha).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
    } else if (face == EnumFacing.UP) {
      builder.func_181662_b(x1, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y1, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y1, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x1, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z1).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
      builder.func_181662_b(x2, y2, z2).func_181666_a(red1, green1, blue1, alpha1).func_181675_d();
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
    GlStateManager.func_179132_a((int)2040778083L ^ 0x79A3CD62);
    GlStateManager.func_179084_k();
    GlStateManager.func_179141_d();
    GlStateManager.func_179098_w();
    GlStateManager.func_179126_j();
    GlStateManager.func_179121_F();
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\RenderUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */