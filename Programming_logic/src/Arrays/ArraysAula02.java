package Arrays;
import java.util.Scanner;

public class ArraysAula02 {
    static void main() {
        Scanner gaveta = new Scanner(System.in);
        int[] array01 = new int[6];
        int[] array02 = new int[6];
        int[] array03 = new int[6];

        for (int i = 0; i < array01.length; i++) {
            System.out.print("Me diga o "+(i+1)+"ª valor do 1ª array: ");
            array01[i] = gaveta.nextInt();
            System.out.print("Me diga o "+(i+1)+"ª valor do 2ª array: ");
            array02[i] = gaveta.nextInt();
        }
        for (int i = 0; i < array01.length; i++) {
            array03[i] = array01[i] * array02[i];
            System.out.println(array03[i]);

        }
    }
}
