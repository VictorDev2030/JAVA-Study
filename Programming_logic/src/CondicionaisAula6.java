public class CondicionaisAula6 {
    public static void main(String[] args) {
        int idade = 20;
        String nome = "Tomas";

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