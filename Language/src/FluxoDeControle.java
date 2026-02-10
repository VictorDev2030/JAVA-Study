public class FluxoDeControle {
    public static void main(String[] args) {
        /*String search = "victor gabriel mendonça";
        int max = search.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            if (search.charAt(i) != 'a')
                continue;
            numPs++;
        }
        System.out.println(numPs);
        System.out.println(search.charAt(5));*/

        String procura = "se inscreva no meu canal";
        String oqueProcuro = "paiazin";
        boolean validador = false;
        int max = procura.length() - oqueProcuro.length();

        test:
            for (int i = 0; i <= max; i++) {
                int n = oqueProcuro.length();
                int j = i;
                int k = 0;
                while (n-- != 0){
                    if (procura.charAt(j++) != oqueProcuro.charAt(k++)) {
                        continue test;
                    }
                }
                validador = true;
                    break test;
            }
            System.out.println(validador ? "Encontrado" : "Não encontrado");
    }
}
