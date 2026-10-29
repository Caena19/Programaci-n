import java.util.*;
public class Ej04 {
  public static void main(String args[]) {
    double precio = 80;
    boolean clienteVIP = true; 
    boolean descuentoActivo = false; 
    if (precio > 50 && (clienteVIP || descuentoActivo))
      System.out.println(precio + (precio * 0.15));
      
  }
}