package exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {    public static void main(String[] args) {

    Consumer<String> exibirTexto = System.out::print;
    Consumer<Integer> exibirNumero = System.out::println;

    // Criando uma Stream diretamente
    Stream<String> linguagens = Stream.of("Java ", "Lua ", "JS\n");
    linguagens.forEach(exibirTexto);

    // Criando uma Stream a partir de um array
    String[] outrasLinguagens = { "Python ", "Lisp ", "Perl ", "Go\n" };

    Stream.of(outrasLinguagens).forEach(exibirTexto);
    Arrays.stream(outrasLinguagens).forEach(exibirTexto);
    Arrays.stream(outrasLinguagens, 1, 4).forEach(exibirTexto);

    // Criando uma Stream a partir de uma lista
    List<String> listaLinguagens = Arrays.asList("C ", "PHP ", "Kotlin\n");
    listaLinguagens.stream().forEach(exibirTexto);
    listaLinguagens.parallelStream().forEach(exibirTexto);

    // Gerando uma sequência infinita de números
    Stream.iterate(0, n -> n + 1).forEach(exibirNumero);
    }
}