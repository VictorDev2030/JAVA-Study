import java.util.Arrays;

public class Matrizes {
    public static void main(String[] args) {
        float[] price = new float[3];
        price[0] = 5.0f;
        price[1] = 6.5f;
        price[2] = 3.4f;
        for (int i = 0; i < price.length; i++) {
            System.out.println("Preço = R$" + price[i]);
        }

        String[] fruits = {"apple", "banana", "avocado"};
        System.out.println(" ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruta = " + fruits[i]);
        }

        System.out.println(" ");
        double[] prices = {8.88, 9.99, 10.10};
        System.out.println("Preços novos: ");
        for (double preco : prices) {
            System.out.println("R$" + preco);
        }

        System.out.println(" ");
        int[] anArray = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };
        System.out.println(anArray[9]);

        System.out.println(" ");
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones", "David"},
                {"Nascimento", "Pereira", "Carvalho"}
        };
        System.out.println(names[0][2] + names[2][2]); /*o primeiro [] significa a linha na horizontal*/

        System.out.println(" ");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("3x3 Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        System.out.println(" ");
        String[][] concorrentes = {
                {"victor", "ana", "pedro"},
                {"ravel", "samuel", "ezequiel"},
                {"gabriel", "camila", "xamuel"}
        };
        for (int i = 0; i < concorrentes.length; i++) {
            for (int j = 0; j < concorrentes.length; j++) {
                System.out.print(concorrentes[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" ");
        int[] numbers = {45, 23, 67, 12, 89, 34};
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.println(" ");
        System.out.println("Second array: " + Arrays.toString(numbers));
        System.out.println("Total of second array: " + total);
        System.out.println(" ");
        int[] newNumbers = {2, 4, 6};
        int soma = 0;
        for(int n : newNumbers){
            soma += n;
        }
        System.out.println("valor final somado: "+soma);

        System.out.println(" ");
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }

        System.out.println(" ");
        int[] array1 = {1, 3, 3};
        int[] array2 = {1, 2, 3};
        for (int i = 0; i < array1.length; i++) {
            boolean igual = array1[i] == array2[i];
            System.out.println(igual);
        }

    }
}
