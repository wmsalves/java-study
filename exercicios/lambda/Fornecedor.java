package exercicios.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

    public static void main(String[] args) {

        Supplier<List<String>> gerarNomes =
                () -> Arrays.asList("Carlos", "Mariana", "Roberto", "Fernanda");

        System.out.println(gerarNomes.get());
    }
}