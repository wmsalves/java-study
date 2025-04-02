package exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (acumulador, numero) -> acumulador + numero;

        Integer total1 = numeros.parallelStream().reduce(soma).orElse(0);
        System.out.println(total1);

        Integer total2 = numeros.stream().reduce(50, soma);
        System.out.println(total2);

        // Exibir apenas se houver um resultado presente
        numeros.stream()
                .filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
