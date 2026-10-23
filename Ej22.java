import java.util.*;
public class Ej22
  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Introduce 1 numero ");
   int num1 = sc.nextInt();
   System.out.println("Su aumento prefijo es: " + (++num1));
   System.out.println("Su aumento postfijo es: " + (num1++));
   System.out.println("Su valor despues de num1++ es: " + num1);
   System.out.println("Su decremento prefijo es: " + (--num1));
   System.out.println("Su decremento postfijo es: " + (num1--));
   System.out.println("Su valor despues de num1-- es: " + num1);
  }
}