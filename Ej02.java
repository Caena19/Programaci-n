import java.util.*;
public class Ej02 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la temperatura: ");
    int temperatura = sc.nextInt();
    System.out.println("Introduce si esta lloviendo: ");
    boolean lluvia= sc.nextBoolean();
    if ((temperatura >= 25) && (temperatura <=35) && !lluvia)
      System.out.println("Dia perfecto para la playa");
    sc.close();
  }
}