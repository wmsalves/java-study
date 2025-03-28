package exercicios.lambda;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> menosTres = n -> n - 3;
        UnaryOperator<Integer> triplicar = n -> n * 3;
        UnaryOperator<Integer> aoCubo = n -> n * n * n;

        int resultado1 = menosTres
                .andThen(triplicar)
                .andThen(aoCubo)
                .apply(5);
        System.out.println("Resultado 1: " + resultado1);

        int resultado2 = aoCubo
                .compose(triplicar)
                .compose(menosTres)
                .apply(5);
        System.out.println("Resultado 2: " + resultado2);
    }
}
