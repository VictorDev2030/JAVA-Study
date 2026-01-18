import java.util.Scanner;

public class CondicionaisAula6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.next();
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        if(idade <= 10){
            System.out.println("Sua idade: "+idade+"\n"+nome+", Participara da categoria infantil");
        }
        else if(idade >=11 && idade <=15){
            System.out.println("Sua idade: "+idade+"\n"+nome+", Participara da categoria juvenil");
        }
        else if(idade >= 16 && idade <= 19){
            System.out.println("Sua idade: "+idade+"\n"+nome+", Participara da categoria pré-adulto");
        }
        else{
            System.out.println("Sua idade: "+idade+"\n"+nome+", Participara da categoria Adulto");
        }
    }
}