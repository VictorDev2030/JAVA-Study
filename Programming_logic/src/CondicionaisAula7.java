import java.util.Scanner;

public class CondicionaisAula7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = input.nextLine();
        nome = nome.toUpperCase();

        if(nome.equals("ADMIN")||nome.equals("ADMINISTRADOR")||nome.equals("")){
            System.out.println("Usuário inválido"+"\n"+"login efetuado: "+nome);
        }
        else{
            System.out.println("Usuario valido"+"\n"+"Login efetuado: "+nome);
        }

    }
}
