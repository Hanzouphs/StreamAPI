import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploStream{
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,5,8,7,4,6,3,2,1,8,5,7,4);

        String novaLista = lista.stream()
        .distinct()
        .filter(e -> e >= 2)
        .map(e -> e * 3)
        .map(String::valueOf)
        .collect(Collectors.joining(" - "));
        System.out.println(novaLista);




    }
}