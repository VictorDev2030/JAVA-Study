package Condicionais;

import java.util.Scanner;

public class CondicionaisAula9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Me diga um número de 1 a 7:");
        int numero = input.nextInt();

        if(numero==1){
            System.out.println("Domingo");
        }
        else if(numero==2){
            System.out.println("Segunda");
        }
        else if(numero==3){
            System.out.println("Terça");
        }
        else if(numero==4){
            System.out.println("Quarta");
        }
        else if(numero==5){
            System.out.println("Quinta");
        }
        else if(numero==6){
            System.out.println("Sexta");
        }
        else if(numero==7){
            System.out.println("Sabado");
        }
        else{
            System.out.println("Numero errado");
        }

    }
}
