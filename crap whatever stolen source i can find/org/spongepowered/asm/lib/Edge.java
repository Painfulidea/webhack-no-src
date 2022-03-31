package org.spongepowered.asm.lib;

class Edge {
  static final int NORMAL = 0;
  
  static final int EXCEPTION = 2147483647;
  
  int info;
  
  Label successor;
  
  Edge next;
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\org\spongepowered\asm\lib\Edge.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */