import java.util.*;
public class Ej17 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el importe: ");
    double importe = sc.nextInt();
    double importe1 = importe>100 ? (importe*20)/100 : importe;
    System.out.println("Su precio final es: " +importe1);
  }
}