import java.util.*;
public class Ej19 {
  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Introduce la primera calificacion: ");
   double nota1 = sc.nextDouble();

   System.out.print("Introduce la segunda calificacion: ");
   double nota2 = sc.nextDouble();

   System.out.print("Introduce la tercera calificacion: ");
   double nota3 = sc.nextDouble();

   System.out.print("Introduce la cuarta calificacion: ");
   double nota4 = sc.nextDouble();
   double media = (nota1 + nota2 + nota3 + nota4) /4;
   System.out.println("La media es: " + Math.round(media));
  }
}