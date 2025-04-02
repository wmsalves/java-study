package exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Luna", 6.1);
        Aluno aluno3 = new Aluno("Gui", 8.1);
        Aluno aluno4 = new Aluno("Gabi", 10.0);

        List<Aluno> listaAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

        Predicate<Aluno> isAprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, Double> pegarNota = aluno -> aluno.nota;
        BinaryOperator<Double> somarNotas = Double::sum;

        listaAlunos.parallelStream()
                .filter(isAprovado)
                .map(pegarNota)
                .reduce(somarNotas)
                .ifPresent(System.out::println);
    }
}