import java.util.*;
public class Ej24 {
  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Introduce 2 numeros: ");
   int num1 = sc.nextInt();
   int num2 = sc.nextInt();
   int divEntera = num1 / num2;
   double divReal = (double) num1 / num2;
   System.out.println("Resultado de la division entera: " + divEntera);
   System.out.println("Resultado de la division real: " + divReal);
  }
}