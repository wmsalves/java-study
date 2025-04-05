package exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {

    List<Integer> numeros = Arrays.asList(10, 11, 12, 13, 14, 15);

    /*
     * 1. Converter número para binário... 13 => "1101"
     * 2. Inverter os bits... "1101" => "1011"
     * 3. Converter de volta para inteiro => "1011" => 11
     */

    UnaryOperator<String> inverterBits =
            bin -> new StringBuilder(bin).reverse().toString();
    Function<String, Integer> paraDecimal =
            bin -> Integer.parseInt(bin, 2);

    numeros.stream()
            .map(Integer::toBinaryString)
            .map(inverterBits)
            .map(paraDecimal)
            .forEach(System.out::println);
    }
}