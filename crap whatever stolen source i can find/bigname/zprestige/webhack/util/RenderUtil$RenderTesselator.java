package bigname.zprestige.webhack.util;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL11;

public class RenderUtil$RenderTesselator extends Tessellator {
  public static RenderUtil$RenderTesselator INSTANCE = new RenderUtil$RenderTesselator();
  
  public static void prepare(int mode) {
    prepareGL();
    begin(mode);
  }
  
  public static void prepareGL() {
    GL11.glBlendFunc((int)-1597143113L ^ 0xA0CD84B5, (int)-1331788472L ^ 0xB09E864B);
    GlStateManager.func_187428_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
    GlStateManager.func_187441_d(Float.intBitsToFloat(Float.floatToIntBits(5.9190726F) ^ 0x7F7D690B));
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)1495560254L ^ 0x5924703E);
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179140_f();
    GlStateManager.func_179129_p();
    GlStateManager.func_179141_d();
    GlStateManager.func_179124_c(Float.intBitsToFloat(Float.floatToIntBits(6.766283F) ^ 0x7F588564), Float.intBitsToFloat(Float.floatToIntBits(8.284558F) ^ 0x7E848D8D), Float.intBitsToFloat(Float.floatToIntBits(5.190129F) ^ 0x7F261589));
  }
  
  public static void drawBox(BufferBuilder buffer, float x, float y, float z, float w, float h, float d, int r, int g, int b, int a, int sides) {
    if ((sides & ((int)48671104L ^ 0x2E6A981)) != 0) {
      buffer.func_181662_b((x + w), y, z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), y, (z + d)).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b(x, y, (z + d)).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b(x, y, z).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)1354135882L ^ 0x50B67948)) != 0) {
      buffer.func_181662_b((x + w), (y + h), z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b(x, (y + h), z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b(x, (y + h), (z + d)).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), (y + h), (z + d)).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)-1460789881L ^ 0xA8EE1D83)) != 0) {
      buffer.func_181662_b((x + w), y, z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b(x, y, z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b(x, (y + h), z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), (y + h), z).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)-533731877L ^ 0xE02FE5D3)) != 0) {
      buffer.func_181662_b(x, y, (z + d)).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), y, (z + d)).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), (y + h), (z + d)).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b(x, (y + h), (z + d)).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)-1294859555L ^ 0xB2D202CD)) != 0) {
      buffer.func_181662_b(x, y, z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b(x, y, (z + d)).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b(x, (y + h), (z + d)).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b(x, (y + h), z).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)1943078868L ^ 0x73D107F4)) != 0) {
      buffer.func_181662_b((x + w), y, (z + d)).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), y, z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), (y + h), z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), (y + h), (z + d)).func_181669_b(r, g, b, a).func_181675_d();
    } 
  }
  
  public RenderUtil$RenderTesselator() {
    super((int)840047910L ^ 0x32321D26);
  }
  
  public static void render() {
    INSTANCE.func_78381_a();
  }
  
  public static BufferBuilder getBufferBuilder() {
    return INSTANCE.func_178180_c();
  }
  
  public static void drawHalfBox(BlockPos blockPos, int r, int g, int b, int a, int sides) {
    drawBox(INSTANCE.func_178180_c(), blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p(), Float.intBitsToFloat(Float.floatToIntBits(4.7660136F) ^ 0x7F18832F), Float.intBitsToFloat(Float.floatToIntBits(3.2299118F) ^ 0x7F4EB6E0), Float.intBitsToFloat(Float.floatToIntBits(5.187275F) ^ 0x7F25FE28), r, g, b, a, sides);
  }
  
  public static void drawBox(BlockPos blockPos, int argb, int sides) {
    int a = argb >>> ((int)1542623292L ^ 0x5BF29024) & ((int)1127110314L ^ 0x432E5655);
    int r = argb >>> ((int)1009719266L ^ 0x3C2F17F2) & ((int)1376451351L ^ 0x520AFBE8);
    int g = argb >>> ((int)207383812L ^ 0xC5C6D0C) & ((int)-1826195642L ^ 0x932677B9);
    int b = argb & ((int)1965500523L ^ 0x75272894);
    drawBox(blockPos, r, g, b, a, sides);
  }
  
  public static void drawFullBox(AxisAlignedBB bb, BlockPos blockPos, float width, int argb, int alpha2) {
    int a = argb >>> ((int)-205446278L ^ 0xF3C12362) & ((int)-321367732L ^ 0xECD851B3);
    int r = argb >>> ((int)-388463351L ^ 0xE8D88519) & ((int)1115068933L ^ 0x42769AFA);
    int g = argb >>> ((int)-1240979229L ^ 0xB60828EB) & ((int)-381809407L ^ 0xE93E0DFE);
    int b = argb & ((int)1368066594L ^ 0x518B0ADD);
    drawFullBox(bb, blockPos, width, r, g, b, a, alpha2);
  }
  
  public static void drawHalfBox(BlockPos blockPos, int argb, int sides) {
    int a = argb >>> ((int)556598152L ^ 0x212D0390) & ((int)341444570L ^ 0x145A0725);
    int r = argb >>> ((int)1119387270L ^ 0x42B87E96) & ((int)818346712L ^ 0x30C6FA27);
    int g = argb >>> ((int)-810037662L ^ 0xCFB7CE6A) & ((int)-599444435L ^ 0xDC4534D2);
    int b = argb & ((int)829957916L ^ 0x317827E3);
    drawHalfBox(blockPos, r, g, b, a, sides);
  }
  
  public static void drawLines(BufferBuilder buffer, float x, float y, float z, float w, float h, float d, int r, int g, int b, int a, int sides) {
    if ((sides & ((int)596956948L ^ 0x2394D705)) != 0) {
      buffer.func_181662_b(x, y, z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b(x, y, (z + d)).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)1698743717L ^ 0x6540C5B7)) != 0) {
      buffer.func_181662_b(x, (y + h), z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b(x, (y + h), (z + d)).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)171658725L ^ 0xA3B4DC4)) != 0) {
      buffer.func_181662_b((x + w), y, z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), y, (z + d)).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)672452555L ^ 0x2814CFE9)) != 0) {
      buffer.func_181662_b((x + w), (y + h), z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), (y + h), (z + d)).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)-62111852L ^ 0xFC4C3F91)) != 0) {
      buffer.func_181662_b(x, y, z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), y, z).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)-2007329310L ^ 0x885A95E4)) != 0) {
      buffer.func_181662_b(x, (y + h), z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), (y + h), z).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)228512419L ^ 0xD9ED2AA)) != 0) {
      buffer.func_181662_b(x, y, (z + d)).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), y, (z + d)).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)-1858337383L ^ 0x913C0593)) != 0) {
      buffer.func_181662_b(x, (y + h), (z + d)).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), (y + h), (z + d)).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)1166327387L ^ 0x4584BE4F)) != 0) {
      buffer.func_181662_b(x, y, z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b(x, (y + h), z).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)861981795L ^ 0x3360CC47)) != 0) {
      buffer.func_181662_b((x + w), y, z).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), (y + h), z).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)2126789586L ^ 0x7EC43BCA)) != 0) {
      buffer.func_181662_b(x, y, (z + d)).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b(x, (y + h), (z + d)).func_181669_b(r, g, b, a).func_181675_d();
    } 
    if ((sides & ((int)-2101174688L ^ 0x82C29E48)) != 0) {
      buffer.func_181662_b((x + w), y, (z + d)).func_181669_b(r, g, b, a).func_181675_d();
      buffer.func_181662_b((x + w), (y + h), (z + d)).func_181669_b(r, g, b, a).func_181675_d();
    } 
  }
  
  public static void drawBox(BlockPos blockPos, int r, int g, int b, int a, int sides) {
    drawBox(INSTANCE.func_178180_c(), blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p(), Float.intBitsToFloat(Float.floatToIntBits(5.807584F) ^ 0x7F39D7BA), Float.intBitsToFloat(Float.floatToIntBits(15.193452F) ^ 0x7EF31861), Float.intBitsToFloat(Float.floatToIntBits(13.047296F) ^ 0x7ED0C1B9), r, g, b, a, sides);
  }
  
  public static void releaseGL() {
    GlStateManager.func_179089_o();
    GlStateManager.func_179132_a((int)-1788797119L ^ 0x95611F40);
    GlStateManager.func_179098_w();
    GlStateManager.func_179147_l();
    GlStateManager.func_179126_j();
  }
  
  public static void drawBox(float x, float y, float z, int argb, int sides) {
    int a = argb >>> ((int)473590946L ^ 0x1C3A6CBA) & ((int)-1215240106L ^ 0xB790E8A9);
    int r = argb >>> ((int)1014904458L ^ 0x3C7E369A) & ((int)-278248260L ^ 0xEF6A4443);
    int g = argb >>> ((int)258314947L ^ 0xF6592CB) & ((int)654483870L ^ 0x2702A161);
    int b = argb & ((int)1856549307L ^ 0x6EA8B144);
    drawBox(INSTANCE.func_178180_c(), x, y, z, Float.intBitsToFloat(Float.floatToIntBits(410.57224F) ^ 0x7C4D493F), Float.intBitsToFloat(Float.floatToIntBits(4.790612F) ^ 0x7F194CB2), Float.intBitsToFloat(Float.floatToIntBits(64.06286F) ^ 0x7D00202F), r, g, b, a, sides);
  }
  
  public static void drawBoundingBox(AxisAlignedBB bb, float width, float red, float green, float blue, float alpha) {
    GlStateManager.func_179094_E();
    GlStateManager.func_179147_l();
    GlStateManager.func_179097_i();
    GlStateManager.func_179120_a((int)195957032L ^ 0xBAE122A, (int)-1736514795L ^ 0x987EE016, (int)148258455L ^ 0x8D63E97, (int)1187296112L ^ 0x46C4B371);
    GlStateManager.func_179090_x();
    GlStateManager.func_179132_a((int)1513617303L ^ 0x5A37F797);
    GL11.glEnable((int)150651017L ^ 0x8FACBA9);
    GL11.glHint((int)-1663523650L ^ 0x9CD8A8EC, (int)-541004738L ^ 0xDFC0FD3C);
    GL11.glLineWidth(width);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferbuilder = tessellator.func_178180_c();
    bufferbuilder.func_181668_a((int)-1020054434L ^ 0xC333345D, DefaultVertexFormats.field_181706_f);
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
    GL11.glDisable((int)1024840075L ^ 0x3D15DAAB);
    GlStateManager.func_179132_a((int)-473783396L ^ 0xE3C2A39D);
    GlStateManager.func_179126_j();
    GlStateManager.func_179098_w();
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public static void begin(int mode) {
    INSTANCE.func_178180_c().func_181668_a(mode, DefaultVertexFormats.field_181706_f);
  }
  
  public static void drawFullBox(AxisAlignedBB bb, BlockPos blockPos, float width, int red, int green, int blue, int alpha, int alpha2) {
    prepare((int)-1552827447L ^ 0xA371BBCE);
    drawBox(blockPos, red, green, blue, alpha, (int)1140093878L ^ 0x43F47389);
    release();
    drawBoundingBox(bb, width, red, green, blue, alpha2);
  }
  
  public static void release() {
    render();
    releaseGL();
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhac\\util\RenderUtil$RenderTesselator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */