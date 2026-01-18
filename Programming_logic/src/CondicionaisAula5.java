public class CondicionaisAula5 {
    public static void main(String[] args) {
        float salario = 2000;
        float salarioFinal = 0;
        if (salario <= 2428.80){
            System.out.println("Isento: "+salario);
        }
        else if(salario >= 2428.81 && salario <= 2826.65){
            salarioFinal = salario*0.075f;
            System.out.println("Imposto IR: "+salarioFinal);
            salarioFinal = salario-(salario*0.075f);
            System.out.println("IR de 7,5%: "+salarioFinal);
        }
        else if(salario >= 2826.66 && salario <= 3751.05){
            salarioFinal = salario*0.15f;
            System.out.println("Imposto IR: "+salarioFinal);
            salarioFinal = salario-(salario*0.15f);
            System.out.println("IR de 15%: "+salarioFinal);
        }
        else if(salario >= 3751.06 && salario <= 4664.68) {
            salarioFinal = salario * 0.225f;
            System.out.println("Imposto IR: " + salarioFinal);
            salarioFinal = salario - (salario * 0.225f);
            System.out.println("IR de 22,5%: " + salarioFinal);
        }
        else{
            salarioFinal = salario * 0.275f;
            System.out.println("Imposto IR: " + salarioFinal);
            salarioFinal = salario - (salario * 0.275f);
            System.out.println("IR de 27,5%: " + salarioFinal);
        }
    }
}
