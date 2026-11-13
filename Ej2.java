import java.util.Scanner;

public class Ej2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero del 1 al 10");
        int num = sc.nextInt();
        int mult;
        for (int i = 1; i<=10; i++){
            mult = num * i;
            System.out.println(mult);
            if(i>10){
                break;
            }
        }
    }
}
