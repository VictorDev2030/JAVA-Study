import java.util.Scanner;
public class CalculadoraNoTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double resposta = 0, numero1 = 0, numero2 = 0;
        boolean validador = true;
        String[] names = {"x", "-", "*", "/"};

        System.out.print("Hello User\n");
        System.out.println(" ");

        while(validador) {
            System.out.println(" ");
            System.out.println(
                    "+. Somar \n" +
                    "-. Subtrair \n" +
                    "*. Multiplicar \n" +
                    "/. Dividir \n" +
                    "x. Exit");
            System.out.println(" ");
            System.out.print("Me diga oque gostaria de fazer: ");
            String usuario = input.next();

            if (usuario.equals(names)){
                System.out.print("1. Numero: ");
                numero1 = input.nextDouble();
                System.out.print("2. Numero: ");
                numero2 = input.nextDouble();
                System.out.print("Números: " + numero1 + " e " + numero2 + "\n");
            }

            switch (usuario) {
                case "+": resposta = numero1 + numero2; break;
                case "-": resposta = numero1 - numero2; break;
                case "*": resposta = numero1 * numero2; break;
                case "/": resposta = numero1 / numero2; break;
                case "x": validador = false;
            }
            if (usuario == names[]){
                System.out.println("Resultado = " + resposta);
            }
            else if (usuario == "x"){
                System.out.println("Fechando o programa...");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
