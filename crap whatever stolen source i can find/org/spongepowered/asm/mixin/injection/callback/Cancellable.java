package org.spongepowered.asm.mixin.injection.callback;

public interface Cancellable {
  boolean isCancellable();
  
  boolean isCancelled();
  
  void cancel() throws CancellationException;
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\org\spongepowered\asm\mixin\injection\callback\Cancellable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */