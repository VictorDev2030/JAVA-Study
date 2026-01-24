package Arrays;

public class ArraysAula02 {
    static void main() {
        int[] array01 = new int[]{2, 4, 5, 6, 7, 8};
        int[] array02 = new int[]{2, 4, 5, 6, 7, 8};
        int[] array03 = new int[6];

        for (int i = 0; i < array01.length; i++) {
            array03[i] = array01[i] + array02[i];
            System.out.println(array03[i]);

        }
    }
}
