import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el numero de hijos");
    int hijos = sc.nextInt();
    int asignacion;
    if (hijos < 0){
        System.out.println("Error");
    }
    else{
            asignacion = switch (hijos) {
            case 0 -> asignacion = 0;
            case 1 -> asignacion = 50;
            case 2 -> asignacion = 75;
            default -> asignacion = 100;
         };
        System.out.println("la asignacion familiar es " + asignacion + " euros");
        }
    }
}
