import java.nio.file.Path;
import java.util.List;

public class Complementos {
    public static void main(String[] args) {
        /*var não pode ser colocado fora de um metodo */
        var list = List.of("one");
        for (var element: list){
            System.out.println(element);
        }

        var nome = "Gabriel";
        System.out.println(nome);

        double d1 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
        System.out.println("d1 == 1 ? " + (d1 == 1.0));
    }
}
