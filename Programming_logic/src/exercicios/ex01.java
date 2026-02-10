package exercicios;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner gaveta = new Scanner (System.in);

        System.out.print("Digite uma letra: ");
        char letra = gaveta.next().charAt(0);

        char antecessor = (char) (letra - 1);
        System.out.println("Antecessor: "+antecessor);

        System.out.println("Agora digite um número: ");
        int numero = gaveta.nextInt();
        System.out.println("Seu antecessor é: "+(numero-1));
    }
}
