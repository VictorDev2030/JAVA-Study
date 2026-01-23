package LacosDeRepetcao;
import java.util.Scanner;

public class ForAula02 {
    static void main() {
        /*
        for(int x = 15; x <= 200; x++ ){
            System.out.println(x*x);
        }
        */
        /*
        Scanner pergunta = new Scanner(System.in);
        System.out.print("Me diga o numero da tabuada: ");
        int numero = pergunta.nextInt();

        for(int x = 1; x <= 10; x++){
            System.out.println(numero+" x "+numero+" = "+numero*x);
        }
        */
        for(int n = 1; n <= 10; n++) {
            for (int x = 1; x <= 10; x++) {
                System.out.println(n + " x " + x + " = " + n * x);
            }
            System.out.println(" ");
        }
    }
}

