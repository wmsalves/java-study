package exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Luna", 6.1);
        Aluno aluno3 = new Aluno("Gui", 8.1);
        Aluno aluno4 = new Aluno("Gabi", 10.0);

        List<Aluno> listaAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

        Predicate<Aluno> estaAprovado = aluno -> aluno.nota >= 7;
        Function<Aluno, Double> extrairNota = aluno -> aluno.nota;

        BiFunction<Media, Double, Media> adicionarNotaNaMedia =
                (media, nota) -> media.adicionar(nota);

        BinaryOperator<Media> combinarMedias =
                Media::combinar;

        Media mediaFinal = listaAlunos.parallelStream()
                .filter(estaAprovado)
                .map(extrairNota)
                .reduce(new Media(), adicionarNotaNaMedia, combinarMedias);

        System.out.println("A média da turma é " + mediaFinal.getValor());
    }
}
