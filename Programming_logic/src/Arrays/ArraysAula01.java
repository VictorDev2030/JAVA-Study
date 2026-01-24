package Arrays;
import java.util.Scanner;

public class ArraysAula01 {
    static void main() {
        double[] notas = new double[4];
        Scanner pergunta = new Scanner(System.in);
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Qual a "+(i+1)+"ª nota: ");
            notas[i] = pergunta.nextInt();
            media = media + notas[i];
        }
        System.out.println("---------------------------------");
        for (int x = 0; x < notas.length; x++) {
            System.out.println("NOTAS DO ALUNO: " + notas[x]);
            if(x == notas.length - 1){
                System.out.println("MEDIA:"+media/notas.length);
            }
        }
    }
}
