package LacosDeRepetcao;
import java.util.Scanner;

public class WhileAula02 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Me diga o Valor: ");
        int numero = input.nextInt();
        int i = 0;

        while(i<=numero){
            if(i%2!=0){
                System.out.println("Numero impar: "+i);
            }
            i = i+1;
        }


    }
}
