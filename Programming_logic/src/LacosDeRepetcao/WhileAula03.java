package LacosDeRepetcao;
import java.util.Scanner;

public class WhileAula03 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int i = 0;

        while (i!=3) {
            System.out.println(" ");
            System.out.println("1.Calcular imposto");
            System.out.println("2.Depositar salário");
            System.out.println("3.Sair");
            System.out.println(" ");

            System.out.println("Me informe o numero: ");
            int numero = input.nextInt();
            i = numero;

            while (true) {
                switch (numero) {
                    case 1: System.out.println("Imposto calculado"); break;
                    case 2: System.out.println("Salario Depositado"); break;
                    case 3: System.out.println("Fechando o programa..."); break;
                    default: System.out.println("Numero errado!"); break;
                }
                break;
            }
        }
    }
}
