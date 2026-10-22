import java.util.*;
public class Ej15 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero entero: ");
    int numero = sc.nextInt(); 
    int parimpar = numero%2 == 0 ? 0 : 1 ; 
    System.out.println("Par=0 | Impar=1: " + parimpar);
  }
}