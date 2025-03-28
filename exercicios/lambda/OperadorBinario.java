package exercicios.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {

        BinaryOperator<Integer> soma = (a, b) -> a + b;
        System.out.println(soma.apply(15, 25));

        BiFunction<Integer, Integer, String> comparar = (a, b) -> {
            int diferenca = Math.abs(a - b);
            return diferenca > 10 ? "Valores distantes" : "Valores próximos";
        };

        System.out.println(comparar.apply(30, 18));

        Function<Integer, String> analise =
                valor -> valor > 50 ? "Alto" : "Baixo";

        System.out.println(soma.andThen(analise).apply(20, 40));
    }
}

