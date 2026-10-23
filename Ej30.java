import java.util.*;
public class Ej30 {
  public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
   System.out.println("Introduce 1 numero ");
   int num1 = sc.nextInt();
   System.out.println("Aumentado 1 vez: " + (++num1));
   System.out.println("Aumentado 2 vez: " + (++num1));
   System.out.println("Aumentado 3 vez: " + (++num1));
   String parimpar = (num1%2 == 0) ? "Par" : "Impar";
   System.out.println("El numero es: " + parimpar );
  }
}