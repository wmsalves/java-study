package exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> carros = Arrays.asList("Ferrari ", "Mercedes ", "Toyota ");
        carros.stream().map(String::toUpperCase).forEach(print);

        UnaryOperator<String> primeiraLetra = palavra -> palavra.substring(0, 1);

        System.out.println("\n\nUsando composição...");
        carros.stream()
                .map(Utilitarios.maiuscula)
                .map(primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);
    }
}
