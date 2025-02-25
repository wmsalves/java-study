package exercicios.colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoRandom {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(3.14); // double -> Double
        conjunto.add(false);
        conjunto.add("Exemplo");
        conjunto.add(42);
        conjunto.add('A');

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("Exemplo");
        conjunto.add('A');
        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("exemplo"));
        System.out.println(conjunto.remove("Exemplo"));
        System.out.println(conjunto.remove('A'));

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains('A'));
        System.out.println(conjunto.contains(42));
        System.out.println(conjunto.contains(false));

        Set numeros = new HashSet();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println(numeros);
        System.out.println(conjunto);

        // conjunto.addAll(numeros); // União entre dois conjuntos
        conjunto.retainAll(numeros);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
