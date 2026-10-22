import java.util.*;
public class Ej18 {
  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Introduce 3 numero: ");
   double num1 = sc.nextDouble();
   double num2 = sc.nextDouble();
   double num3 = sc.nextDouble();
   double suma = num1 + num2 + num3; 
   
   System.out.println("La suma es: " + (int) suma);
  }
}