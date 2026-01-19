import java.util.Scanner;

public class SwitchCaseAula01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Me diga um número de 1 a 7:");
        int numero = input.nextInt();

        switch(numero){
            case 1: System.out.println("Segunda");
                break;
            case 2: System.out.println("Terça");
                break;
            case 3: System.out.println("Quarta");
                break;
            case 4: System.out.println("Quinta");
                break;
            case 5: System.out.println("Sexta");
                break;
            case 6: System.out.println("Sabado");
                break;
            case 7: System.out.println("Domingo");
                break;
            default: System.out.println("Numero invalido!");
        }
        System.out.println("Fim do Programa");
    }
}
