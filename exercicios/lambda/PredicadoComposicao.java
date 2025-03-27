package exercicios.lambda;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isMultiploDeCinco = num -> num % 5 == 0;
        Predicate<Integer> isDoisDigitos = num -> num >= 10 && num <= 99;

        System.out.println(isMultiploDeCinco.and(isDoisDigitos).negate().test(25));
        System.out.println(isMultiploDeCinco.or(isDoisDigitos).test(50));
    }
}