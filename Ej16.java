import java.util.*;
public class Ej16 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero entero: ");
    int numero = sc.nextInt();
    int num1 = numero >= 0 ?  numero : (-(numero));
    System.out.println("Su valor absoluto es: " + num1);
  }
}