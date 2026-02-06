import java.util.Scanner;
public class CalculadoraNoTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double resposta = 0, numero1 = 0, numero2 = 0;
        boolean validador = true;

        System.out.print("Hello User\n");
        System.out.println(" ");

        while(validador) {
            System.out.println(" ");
            System.out.println(
                    "1. Somar \n" +
                    "2. Subtrair \n" +
                    "3. Multiplicar \n" +
                    "4. Dividir \n" +
                    "5. Exit");
            System.out.println(" ");
            System.out.print("Me diga oque gostaria de fazer: ");
            int usuario = input.nextInt();

            if (usuario >= 1 && usuario <= 4){
                System.out.print("1. Numero: ");
                numero1 = input.nextDouble();
                System.out.print("2. Numero: ");
                numero2 = input.nextDouble();
                System.out.print("Números: " + numero1 + " e " + numero2 + "\n");
            }
            else{
                System.out.println("Fechando o programa...");
                System.exit(0);
            }
            switch (usuario) {
                case 1: resposta = numero1 + numero2; break;
                case 2: resposta = numero1 - numero2; break;
                case 3: resposta = numero1 * numero2; break;
                case 4: resposta = numero1 / numero2; break;
                case 5: validador = false;
            }
            System.out.println("Resultado = " + resposta);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
