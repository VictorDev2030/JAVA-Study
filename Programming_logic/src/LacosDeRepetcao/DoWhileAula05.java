package LacosDeRepetcao;
import java.util.Scanner;

public class DoWhileAula05 {
    static void main() {
        boolean continuar = true;
        Scanner verificador = new Scanner(System.in);

        do{
            System.out.print("PLAYER ONE: Digite o 1ª numero de 1 a 10: ");
            int numero1 = verificador.nextInt();
            System.out.print("PLAYER TWO: Digite o 2ª numero de 1 a 10: ");
            int numero2 = verificador.nextInt();
            System.out.println("ACERTOU?: "+(numero1==numero2));

            System.out.print("Você quer continuar?[S/N]: ");
            String validador = verificador.next();
            if(validador.equalsIgnoreCase("S")) {
                continue;
            }
            else {
                break;
            }

        }while(continuar);
    }
}
