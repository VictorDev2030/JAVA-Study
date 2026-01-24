package Arrays;

public class ArraysMultidimencionaisAula01 {
    static void main() {
        int[][] arrayMulti = new int[3][3];
        arrayMulti[0][0] = 2;
        arrayMulti[0][1] = 5;
        arrayMulti[0][2] = 6;
        arrayMulti[1][0] = 7;
        arrayMulti[1][1] = 8;
        arrayMulti[1][2] = 9;
        arrayMulti[2][0] = 10;
        arrayMulti[2][1] = 11;
        arrayMulti[2][2] = 12;
        int resultado = 1;

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                if(i==j){
                    resultado = resultado * arrayMulti[i][j];
                }
            }
        }
        System.out.println(resultado);
    }
}
