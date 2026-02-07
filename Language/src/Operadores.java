public class Operadores {
    public static void main(String[] args) {
        int resultado = +5;
        int negativo = 10;
        negativo = -negativo;
        System.out.println(negativo);
        boolean validador = true;
        System.out.println(!validador);

        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = false;
        result = someCondition ? value1 : value2;
        System.out.println(result);

        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
    }
}
