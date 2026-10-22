import java.util.*;
public class Ej18 {
  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Introduce 3 numero: ");
   double num1 = sc.nextInt();
   double num2 = sc.nextInt();
   double num3 = sc.nextInt();
   double suma = num1 + num2 + num3; 
   int suma1 = (int) suma;
   System.out.println("La suma es: " +suma);
  }
}