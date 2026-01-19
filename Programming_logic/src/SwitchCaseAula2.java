public class SwitchCaseAula2 {
    static void main() {
        String conta = "CONTA_CORRENT";

        switch(conta){
            case "CONTA_POUPANCA": System.out.println("Tera 0.05% de juros");
                break;
            case "CONTA_CORRENTE": System.out.println("Tera 0.02% de juros");
                break;
            case "CONTA_INVESTIMENTOS": System.out.println("Tera 0.01% de juros");
                break;
            default: System.out.println("CONTA INEXISTENTE");
        }
    }
}
