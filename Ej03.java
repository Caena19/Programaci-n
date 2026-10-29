import java.util.*;
public class Ej03 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la nota: ");
    double nota = sc.nextDouble();
    if (nota >= 0 && nota <=10)
      System.out.println("Nota válida");
    if (nota >= 9 && nota <=10)
      System.out.println("¡Excelente!");
    sc.close();
  }
}