package Condicionais;

import java.util.Scanner;

public class CondicionaisAula8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Me informe seu Sexo[M/F]: ");
        String sexo = input.nextLine();
        System.out.print("Me informe sua Idade: ");
        int idade = input.nextInt();

        if (sexo.equalsIgnoreCase("M") && idade<18 || sexo.equalsIgnoreCase("F") && idade<18){
            System.out.println("Alistamento não obrigatorio!");
        }
        else if(sexo.equalsIgnoreCase("M") && idade>=18){
            System.out.println("Alistamento obrigatório!");
        }
        else if(sexo.equalsIgnoreCase("F") && idade>=18){
            input.nextLine();
            System.out.println("Você deseja se alistar?[S/N]: ");
            String resposta = input.nextLine();
            if(resposta.equalsIgnoreCase("S")){
                System.out.println("Vá a uma junta militar mais proxima se alistar");
            }
            else{
                System.out.println("tenha um bom dia");
            }
        }

        System.out.println("Sua idade: "+idade+" anos");
        input.close();
    }
}
