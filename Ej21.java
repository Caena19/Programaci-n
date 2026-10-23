import java.util.*;
public class Ej21 {
  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Introduce 2 numeros ");
   int num1 = sc.nextInt();
   int num2 = sc.nextInt();
   int suma = num1;
   suma += num2;
   System.out.println("La suma es :" + suma);
   int resta = num1;
   resta -= num2;
   System.out.println("La resta es :" + resta);
  }
}