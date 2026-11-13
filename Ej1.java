import java.util.Scanner;

public class Ej1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        double suma = 0;
        int num;
        int i;
        for(i=1;i<=3;i++){
            System.out.println("Escribe 10 numeros enteros: ");
            num = sc.nextInt();
            suma = suma + num;
        }
        media = suma / (i-1);
        System.out.println(media);
    }
}
    

