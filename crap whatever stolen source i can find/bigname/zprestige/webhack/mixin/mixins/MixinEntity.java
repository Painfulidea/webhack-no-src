/*     */ package bigname.zprestige.webhack.mixin.mixins;
/*     */ 
/*     */ import bigname.zprestige.webhack.event.events.PushEvent;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.material.Material;
/*     */ import net.minecraft.block.state.IBlockState;
/*     */ import net.minecraft.crash.CrashReport;
/*     */ import net.minecraft.crash.CrashReportCategory;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.MoverType;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.init.SoundEvents;
/*     */ import net.minecraft.util.EnumFacing;
/*     */ import net.minecraft.util.ReportedException;
/*     */ import net.minecraft.util.SoundEvent;
/*     */ import net.minecraft.util.math.AxisAlignedBB;
/*     */ import net.minecraft.util.math.BlockPos;
/*     */ import net.minecraft.util.math.MathHelper;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.fml.common.eventhandler.Event;
/*     */ import org.spongepowered.asm.mixin.Final;
/*     */ import org.spongepowered.asm.mixin.Mixin;
/*     */ import org.spongepowered.asm.mixin.Overwrite;
/*     */ import org.spongepowered.asm.mixin.Shadow;
/*     */ import org.spongepowered.asm.mixin.injection.At;
/*     */ import org.spongepowered.asm.mixin.injection.Redirect;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Mixin({Entity.class})
/*     */ public abstract class MixinEntity
/*     */ {
/*     */   @Shadow
/*     */   public double field_70165_t;
/*     */   @Shadow
/*     */   public double field_70163_u;
/*     */   @Shadow
/*     */   public double field_70161_v;
/*     */   @Shadow
/*     */   public double field_70159_w;
/*     */   @Shadow
/*     */   public double field_70181_x;
/*     */   @Shadow
/*     */   public double field_70179_y;
/*     */   @Shadow
/*     */   public float field_70177_z;
/*     */   @Shadow
/*     */   public float field_70125_A;
/*     */   @Shadow
/*     */   public boolean field_70122_E;
/*     */   @Shadow
/*     */   public boolean field_70145_X;
/*     */   @Shadow
/*     */   public float field_70141_P;
/*     */   @Shadow
/*     */   public World field_70170_p;
/*     */   @Shadow
/*     */   @Final
/*     */   private double[] field_191505_aI;
/*     */   @Shadow
/*     */   private long field_191506_aJ;
/*     */   @Shadow
/*     */   protected boolean field_70134_J;
/*     */   @Shadow
/*     */   public float field_70138_W;
/*     */   @Shadow
/*     */   public boolean field_70123_F;
/*     */   @Shadow
/*     */   public boolean field_70124_G;
/*     */   @Shadow
/*     */   public boolean field_70132_H;
/*     */   @Shadow
/*     */   public float field_70140_Q;
/*     */   @Shadow
/*     */   public float field_82151_R;
/*     */   @Shadow
/*     */   private int field_190534_ay;
/*     */   @Shadow
/*     */   private int field_70150_b;
/*     */   @Shadow
/*     */   private float field_191959_ay;
/*     */   @Shadow
/*     */   protected Random field_70146_Z;
/*     */   
/*     */   @Shadow
/*     */   public abstract boolean func_70051_ag();
/*     */   
/*     */   @Shadow
/*     */   public abstract boolean func_184218_aH();
/*     */   
/*     */   @Shadow
/*     */   public abstract boolean func_70093_af();
/*     */   
/*     */   @Shadow
/*     */   public abstract void func_174826_a(AxisAlignedBB paramAxisAlignedBB);
/*     */   
/*     */   @Shadow
/*     */   public abstract AxisAlignedBB func_174813_aQ();
/*     */   
/*     */   @Shadow
/*     */   public abstract void func_174829_m();
/*     */   
/*     */   @Shadow
/*     */   protected abstract void func_184231_a(double paramDouble, boolean paramBoolean, IBlockState paramIBlockState, BlockPos paramBlockPos);
/*     */   
/*     */   @Shadow
/*     */   protected abstract boolean func_70041_e_();
/*     */   
/*     */   @Shadow
/*     */   public abstract boolean func_70090_H();
/*     */   
/*     */   @Shadow
/*     */   public abstract boolean func_184207_aI();
/*     */   
/*     */   @Shadow
/*     */   public abstract Entity func_184179_bs();
/*     */   
/*     */   @Shadow
/*     */   public abstract void func_184185_a(SoundEvent paramSoundEvent, float paramFloat1, float paramFloat2);
/*     */   
/*     */   @Shadow
/*     */   protected abstract void func_145775_I();
/*     */   
/*     */   @Shadow
/*     */   public abstract boolean func_70026_G();
/*     */   
/*     */   @Shadow
/*     */   protected abstract void func_180429_a(BlockPos paramBlockPos, Block paramBlock);
/*     */   
/*     */   @Shadow
/*     */   protected abstract SoundEvent func_184184_Z();
/*     */   
/*     */   @Shadow
/*     */   protected abstract float func_191954_d(float paramFloat);
/*     */   
/*     */   @Shadow
/*     */   protected abstract boolean func_191957_ae();
/*     */   
/*     */   @Shadow
/*     */   public abstract void func_85029_a(CrashReportCategory paramCrashReportCategory);
/*     */   
/*     */   @Shadow
/*     */   protected abstract void func_70081_e(int paramInt);
/*     */   
/*     */   @Shadow
/*     */   public abstract void func_70015_d(int paramInt);
/*     */   
/*     */   @Shadow
/*     */   protected abstract int func_190531_bD();
/*     */   
/*     */   @Shadow
/*     */   public abstract boolean func_70027_ad();
/*     */   
/*     */   @Shadow
/*     */   public abstract int func_82145_z();
/*     */   
/*     */   @Overwrite
/*     */   public void func_70091_d(MoverType type, double x, double y, double z) {
/* 165 */     Entity _this = (Entity)this;
/* 166 */     if (this.field_70145_X) {
/* 167 */       func_174826_a(func_174813_aQ().func_72317_d(x, y, z));
/* 168 */       func_174829_m();
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 174 */       if (type == MoverType.PISTON) {
/* 175 */         long i = this.field_70170_p.func_82737_E();
/* 176 */         if (i != this.field_191506_aJ) {
/* 177 */           Arrays.fill(this.field_191505_aI, 0.0D);
/* 178 */           this.field_191506_aJ = i;
/*     */         } 
/* 180 */         if (x != 0.0D) {
/* 181 */           int j = EnumFacing.Axis.X.ordinal();
/* 182 */           double d0 = MathHelper.func_151237_a(x + this.field_191505_aI[j], -0.51D, 0.51D);
/* 183 */           x = d0 - this.field_191505_aI[j];
/* 184 */           this.field_191505_aI[j] = d0;
/* 185 */           if (Math.abs(x) <= 9.999999747378752E-6D) {
/*     */             return;
/*     */           }
/* 188 */         } else if (y != 0.0D) {
/* 189 */           int l4 = EnumFacing.Axis.Y.ordinal();
/* 190 */           double d12 = MathHelper.func_151237_a(y + this.field_191505_aI[l4], -0.51D, 0.51D);
/* 191 */           y = d12 - this.field_191505_aI[l4];
/* 192 */           this.field_191505_aI[l4] = d12;
/* 193 */           if (Math.abs(y) <= 9.999999747378752E-6D) {
/*     */             return;
/*     */           }
/*     */         } else {
/* 197 */           if (z == 0.0D) {
/*     */             return;
/*     */           }
/* 200 */           int i5 = EnumFacing.Axis.Z.ordinal();
/* 201 */           double d13 = MathHelper.func_151237_a(z + this.field_191505_aI[i5], -0.51D, 0.51D);
/* 202 */           z = d13 - this.field_191505_aI[i5];
/* 203 */           this.field_191505_aI[i5] = d13;
/* 204 */           if (Math.abs(z) <= 9.999999747378752E-6D) {
/*     */             return;
/*     */           }
/*     */         } 
/*     */       } 
/* 209 */       this.field_70170_p.field_72984_F.func_76320_a("move");
/* 210 */       double d10 = this.field_70165_t;
/* 211 */       double d11 = this.field_70163_u;
/* 212 */       double d1 = this.field_70161_v;
/* 213 */       if (this.field_70134_J) {
/* 214 */         this.field_70134_J = false;
/* 215 */         x *= 0.25D;
/* 216 */         y *= 0.05000000074505806D;
/* 217 */         z *= 0.25D;
/* 218 */         this.field_70159_w = 0.0D;
/* 219 */         this.field_70181_x = 0.0D;
/* 220 */         this.field_70179_y = 0.0D;
/*     */       } 
/* 222 */       double d2 = x;
/* 223 */       double d3 = y;
/* 224 */       double d4 = z;
/* 225 */       if ((type == MoverType.SELF || type == MoverType.PLAYER) && this.field_70122_E && func_70093_af() && _this instanceof net.minecraft.entity.player.EntityPlayer) {
/* 226 */         while (x != 0.0D && this.field_70170_p.func_184144_a(_this, func_174813_aQ().func_72317_d(x, -this.field_70138_W, 0.0D)).isEmpty()) {
/* 227 */           x = (x < 0.05D && x >= -0.05D) ? 0.0D : ((x > 0.0D) ? (x -= 0.05D) : (x += 0.05D));
/* 228 */           d2 = x;
/*     */         } 
/* 230 */         while (z != 0.0D && this.field_70170_p.func_184144_a(_this, func_174813_aQ().func_72317_d(0.0D, -this.field_70138_W, z)).isEmpty()) {
/* 231 */           z = (z < 0.05D && z >= -0.05D) ? 0.0D : ((z > 0.0D) ? (z -= 0.05D) : (z += 0.05D));
/* 232 */           d4 = z;
/*     */         } 
/* 234 */         while (x != 0.0D && z != 0.0D && this.field_70170_p.func_184144_a(_this, func_174813_aQ().func_72317_d(x, -this.field_70138_W, z)).isEmpty()) {
/* 235 */           x = (x < 0.05D && x >= -0.05D) ? 0.0D : ((x > 0.0D) ? (x -= 0.05D) : (x += 0.05D));
/* 236 */           d2 = x;
/* 237 */           z = (z < 0.05D && z >= -0.05D) ? 0.0D : ((z > 0.0D) ? (z -= 0.05D) : (z += 0.05D));
/* 238 */           d4 = z;
/*     */         } 
/*     */       } 
/* 241 */       List<AxisAlignedBB> list1 = this.field_70170_p.func_184144_a(_this, func_174813_aQ().func_72321_a(x, y, z));
/* 242 */       AxisAlignedBB axisalignedbb = func_174813_aQ();
/* 243 */       if (y != 0.0D) {
/* 244 */         for (AxisAlignedBB o : list1) {
/* 245 */           y = ((AxisAlignedBB)o).func_72323_b(func_174813_aQ(), y);
/*     */         }
/* 247 */         func_174826_a(func_174813_aQ().func_72317_d(0.0D, y, 0.0D));
/*     */       } 
/* 249 */       if (x != 0.0D) {
/* 250 */         for (AxisAlignedBB o : list1) {
/* 251 */           x = ((AxisAlignedBB)o).func_72316_a(func_174813_aQ(), x);
/*     */         }
/* 253 */         if (x != 0.0D) {
/* 254 */           func_174826_a(func_174813_aQ().func_72317_d(x, 0.0D, 0.0D));
/*     */         }
/*     */       } 
/* 257 */       if (z != 0.0D) {
/* 258 */         int i6 = list1.size();
/* 259 */         for (int k5 = 0; k5 < i6; k5++) {
/* 260 */           z = ((AxisAlignedBB)list1.get(k5)).func_72322_c(func_174813_aQ(), z);
/*     */         }
/* 262 */         if (z != 0.0D) {
/* 263 */           func_174826_a(func_174813_aQ().func_72317_d(0.0D, 0.0D, z));
/*     */         }
/*     */       } 
/* 266 */       this.field_70170_p.field_72984_F.func_76319_b();
/* 267 */       this.field_70170_p.field_72984_F.func_76320_a("rest");
/* 268 */       func_174829_m();
/* 269 */       this.field_70123_F = (d2 != x || d4 != z);
/* 270 */       this.field_70124_G = (d3 != y);
/* 271 */       this.field_70122_E = (this.field_70124_G && d3 < 0.0D);
/* 272 */       this.field_70132_H = (this.field_70123_F || this.field_70124_G);
/* 273 */       int j6 = MathHelper.func_76128_c(this.field_70165_t);
/* 274 */       int i1 = MathHelper.func_76128_c(this.field_70163_u - 0.20000000298023224D);
/* 275 */       int k6 = MathHelper.func_76128_c(this.field_70161_v);
/* 276 */       BlockPos blockpos = new BlockPos(j6, i1, k6);
/* 277 */       IBlockState iblockstate = this.field_70170_p.func_180495_p(blockpos); BlockPos blockpos1; IBlockState iblockstate1; Block block1;
/* 278 */       if (iblockstate.func_185904_a() == Material.field_151579_a && (block1 = (iblockstate1 = this.field_70170_p.func_180495_p(blockpos1 = blockpos.func_177977_b())).func_177230_c() instanceof net.minecraft.block.BlockFence || block1 instanceof net.minecraft.block.BlockWall || block1 instanceof net.minecraft.block.BlockFenceGate)) {
/* 279 */         iblockstate = iblockstate1;
/* 280 */         blockpos = blockpos1;
/*     */       } 
/* 282 */       func_184231_a(y, this.field_70122_E, iblockstate, blockpos);
/* 283 */       if (d2 != x) {
/* 284 */         this.field_70159_w = 0.0D;
/*     */       }
/* 286 */       if (d4 != z) {
/* 287 */         this.field_70179_y = 0.0D;
/*     */       }
/* 289 */       Block block = iblockstate.func_177230_c();
/* 290 */       if (d3 != y) {
/* 291 */         block.func_176216_a(this.field_70170_p, _this);
/*     */       }
/* 293 */       if (func_70041_e_() && (!this.field_70122_E || !func_70093_af() || !(_this instanceof net.minecraft.entity.player.EntityPlayer)) && !func_184218_aH()) {
/* 294 */         double d15 = this.field_70165_t - d10;
/* 295 */         double d16 = this.field_70163_u - d11;
/* 296 */         double d17 = this.field_70161_v - d1;
/* 297 */         if (block != Blocks.field_150468_ap) {
/* 298 */           d16 = 0.0D;
/*     */         }
/* 300 */         if (block != null && this.field_70122_E) {
/* 301 */           block.func_176199_a(this.field_70170_p, blockpos, _this);
/*     */         }
/* 303 */         this.field_70140_Q = (float)(this.field_70140_Q + MathHelper.func_76133_a(d15 * d15 + d17 * d17) * 0.6D);
/* 304 */         this.field_82151_R = (float)(this.field_82151_R + MathHelper.func_76133_a(d15 * d15 + d16 * d16 + d17 * d17) * 0.6D);
/* 305 */         if (this.field_82151_R > this.field_70150_b && iblockstate.func_185904_a() != Material.field_151579_a) {
/* 306 */           this.field_70150_b = (int)this.field_82151_R + 1;
/* 307 */           if (func_70090_H()) {
/* 308 */             Entity entity = (func_184207_aI() && func_184179_bs() != null) ? func_184179_bs() : _this;
/* 309 */             float f = (entity == _this) ? 0.35F : 0.4F;
/* 310 */             float f1 = MathHelper.func_76133_a(entity.field_70159_w * entity.field_70159_w * 0.20000000298023224D + entity.field_70181_x * entity.field_70181_x + entity.field_70179_y * entity.field_70179_y * 0.20000000298023224D) * f;
/* 311 */             if (f1 > 1.0F) {
/* 312 */               f1 = 1.0F;
/*     */             }
/* 314 */             func_184185_a(func_184184_Z(), f1, 1.0F + (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.4F);
/*     */           } else {
/* 316 */             func_180429_a(blockpos, block);
/*     */           } 
/* 318 */         } else if (this.field_82151_R > this.field_191959_ay && func_191957_ae() && iblockstate.func_185904_a() == Material.field_151579_a) {
/* 319 */           this.field_191959_ay = func_191954_d(this.field_82151_R);
/*     */         } 
/*     */       } 
/*     */       try {
/* 323 */         func_145775_I();
/*     */       }
/* 325 */       catch (Throwable throwable) {
/* 326 */         CrashReport crashreport = CrashReport.func_85055_a(throwable, "Checking entity block collision");
/* 327 */         CrashReportCategory crashreportcategory = crashreport.func_85058_a("Entity being checked for collision");
/* 328 */         func_85029_a(crashreportcategory);
/* 329 */         throw new ReportedException(crashreport);
/*     */       } 
/* 331 */       boolean flag1 = func_70026_G();
/* 332 */       if (this.field_70170_p.func_147470_e(func_174813_aQ().func_186664_h(0.001D))) {
/* 333 */         func_70081_e(1);
/* 334 */         if (!flag1) {
/* 335 */           this.field_190534_ay++;
/* 336 */           if (this.field_190534_ay == 0) {
/* 337 */             func_70015_d(8);
/*     */           }
/*     */         } 
/* 340 */       } else if (this.field_190534_ay <= 0) {
/* 341 */         this.field_190534_ay = -func_190531_bD();
/*     */       } 
/* 343 */       if (flag1 && func_70027_ad()) {
/* 344 */         func_184185_a(SoundEvents.field_187541_bC, 0.7F, 1.6F + (this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.4F);
/* 345 */         this.field_190534_ay = -func_190531_bD();
/*     */       } 
/* 347 */       this.field_70170_p.field_72984_F.func_76319_b();
/*     */     } 
/*     */   }
/*     */   
/*     */   @Redirect(method = {"onEntityUpdate"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;getMaxInPortalTime()I"))
/*     */   private int getMaxInPortalTimeHook(Entity entity) {
/* 353 */     int time = func_82145_z();
/* 354 */     return time;
/*     */   }
/*     */   
/*     */   @Redirect(method = {"applyEntityCollision"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;addVelocity(DDD)V"))
/*     */   public void addVelocityHook(Entity entity, double x, double y, double z) {
/* 359 */     PushEvent event = new PushEvent(entity, x, y, z, true);
/* 360 */     MinecraftForge.EVENT_BUS.post((Event)event);
/* 361 */     if (!event.isCanceled()) {
/* 362 */       entity.field_70159_w += event.x;
/* 363 */       entity.field_70181_x += event.y;
/* 364 */       entity.field_70179_y += event.z;
/* 365 */       entity.field_70160_al = event.airbone;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\mixin\mixins\MixinEntity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */