package exercicios.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

//      Set<String> listaCidades = new HashSet<>();
        SortedSet<String> listaCidades = new TreeSet<>();
        listaCidades.add("Belo Horizonte");
        listaCidades.add("São Paulo");
        listaCidades.add("Rio de Janeiro");
        listaCidades.add("Curitiba");

        for (String cidade : listaCidades) {
            System.out.println(cidade);
        }

        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(25);
        numeros.add(78);
        numeros.add(5);

        // numeros.get(1); Não é possível acessar pelo índice

        for (int num : numeros) {
            System.out.println(num);
        }
    }
}