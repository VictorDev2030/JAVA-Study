package Condicionais;

public class CondicionaisAula3 {
    public static void main(String[] args) {
        float salario = 2000;
        float resultado = salario;
        String salarioResultado = "";
        if(salario > 4500){
            resultado = salario*0.3f;
            salarioResultado = "O salario é de 30%";
        }
        else{
            resultado = salario*0.15f;
             salarioResultado= "O salario é de 15%";
        }
        System.out.println("15% do Salario: "+resultado);
        System.out.println(salarioResultado);
    }
}
