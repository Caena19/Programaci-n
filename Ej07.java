import java.util.*;

public class Ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora (0-23): ");
        int hora = sc.nextInt();

        System.out.print("¿Tienes pase nocturno? (true/false): ");
        boolean paseNocturno = sc.nextBoolean();

        if ((hora >= 8 && hora <= 22) || paseNocturno) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }

        sc.close();
    }
}