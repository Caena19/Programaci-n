import java.util.*;
public class Ej01 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce tu edad: ");
    int edad = sc.nextInt();
    System.out.println("Introduce si tienes carnet: ");
    boolean carnet= sc.nextBoolean();
    if ((edad >= 18) && (edad <=65) && carnet)
      System.out.println("Acceso permitido");
    sc.close();
  }
}