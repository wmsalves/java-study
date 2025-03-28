package exercicios.lambda;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> positivoOuNegativo =
                numero -> numero >= 0 ? "Positivo" : "Negativo";

        Function<String, String> resultadoFinal =
                valor -> "Resultado verificado: " + valor;

        Function<String, String> animado =
                valor -> valor + " 😃";

        Function<String, String> incerto =
                valor -> valor + " 🤔";

        String resultado1 = positivoOuNegativo
                .andThen(resultadoFinal)
                .andThen(animado)
                .apply(25);
        System.out.println(resultado1);

        String resultado2 = positivoOuNegativo
                .andThen(resultadoFinal)
                .andThen(incerto)
                .apply(-8);
        System.out.println(resultado2);

        System.out.println(positivoOuNegativo.apply(0));
    }
}
