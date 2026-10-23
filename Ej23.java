import java.util.*;
public class Ej23 {
  public static void main(String args[]) {
    int resultado = 10 + 2 * 3 - 4;
    int resultado2 = (10 + 2) * (3 - 4);

    System.out.println("Resultado 1: " + resultado);
    System.out.println("Resultado 2: " + resultado2);

    // Los resultados son distintos porque la multiplicación va
    // antes que la suma y la resta. Los paréntesis cambian
    // el orden de las operaciones, haciendo que se calculen primero
    // los calculos que están dentro de ellos.
  }
}