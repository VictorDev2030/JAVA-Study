package LacosDeRepetcao;
import java.util.Scanner;

public class WhileAula04 {
    static void main() {
        Scanner input = new Scanner(System.in);
        String nome = "victor";
        String senha = "victor123";

        System.out.println((" "));
        System.out.println("LOGIN: ");
        System.out.println("SENHA: ");
        System.out.println(" ");

        System.out.print("Me informe o Login: ");
        String validadorN = input.next();
        System.out.print("Me informe a senha: ");
        String validadorS = input.next();

        while(!validadorN.equals(nome)){
            System.out.println("NOME INVALIDO! TENTE NOVAMENTE");
            System.out.print("Me informe o Login: ");
            validadorN = input.next();
        }
        while(!validadorS.equals(senha)){
            System.out.println("SENHA INVALIDA! TENTE NOVAMENTE");
            System.out.println("Me informe a senha: ");
            validadorS = input.next();
        }

        System.out.println("Login correto!");
    }
}
