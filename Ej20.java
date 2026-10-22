import java.util.*;
public class Ej20 {
  public static void main(String args[]) {
   int precioSinIVA = 50;
   final double IVA = 0.21;
   double precioTotal = precioSinIVA * (1 + IVA);
   System.out.println("El precio total con IVA incluido es :" + precioTotal);
   
  }
}