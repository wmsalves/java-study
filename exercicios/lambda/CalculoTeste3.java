package exercicios.lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {

        BinaryOperator<Double> calc = (x, y) -> { return x + y; };
        System.out.println(calc.apply(7.0, 10.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(7.0, 10.0));

        BinaryOperator<Integer> calc2 = (x, y) -> { return x + y; };
        System.out.println(calc2.apply(6, 8));

        calc = (x, y) -> x * y;
        System.out.println(calc2.apply(6, 8));
    }
}