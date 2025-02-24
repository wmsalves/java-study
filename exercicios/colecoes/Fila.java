package exercicios.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e add -> adicionam elementos na fila
        // Diferença é o comportamento ocorre
        // Quando a fila está cheia

        fila.add("João");
        fila.offer("Maria");
        fila.add("Pedro");
        fila.offer("Lucas");
        fila.add("Vitoria");
        fila.offer("Sofia");

        System.out.println(fila);

        // Peek e Element -> obter o próximo elemento da fila (sem remover)

        System.out.println(fila.peek()); // False,
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());


        // Pool e Remove -> obter o próximo elemento
        System.out.println(fila.poll()); // False
        System.out.println(fila.remove()); // Exception
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains(...)
    }
}
