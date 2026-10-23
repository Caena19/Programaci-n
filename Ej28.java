import java.util.*;
public class Ej28 {
  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Introduce 1 numero: ");
   int num = sc.nextInt();
   boolean rango = (num>=0 && num <= 100) ? true : false;
   System.out.println("Esta el numero entre 0 y 100: " + rango);
  }
}