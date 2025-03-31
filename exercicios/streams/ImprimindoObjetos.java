package exercicios.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Carlos", "Mariana", "Rafael", "Fernanda");

        System.out.println("Usando o for-each:");
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        System.out.println("\nUsando Iterator:");
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterando: " + iterator.next());
        }

        System.out.println("\nUsando Stream:");
        Stream<String> stream = nomes.stream();
        stream.forEach(nome -> System.out.println("Stream: " + nome));
    }
}