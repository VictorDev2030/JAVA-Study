import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = teclado.next();
        System.out.println("Idade: ");
        int idade = teclado.nextInt();
        System.out.println("Seu nome: "+nome);
        System.out.println("Sua idade: "+idade);
    }
}
