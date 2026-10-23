import java.util.*;
public class Ej27 {
  public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
   System.out.print("Introduce 2 numeros ");
   double num1 = sc.nextDouble();
   double num2 = sc.nextDouble();
   int mayor = (num1 > num2) ? num1 : num2;
   System.out.print("El mayor es: " + mayor);
  }
}