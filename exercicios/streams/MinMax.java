package exercicios.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Ana", 7.1);
    Aluno aluno2 = new Aluno("Luna", 6.1);
    Aluno aluno3 = new Aluno("Gui", 8.1);
    Aluno aluno4 = new Aluno("Gabi", 10);

    List<Aluno> listaAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

    Comparator<Aluno> compararNota = Comparator.comparing(aluno -> aluno.nota);

    System.out.println("Aluno com a melhor nota: " + listaAlunos.stream().max(compararNota).get());
    System.out.println("Aluno com a pior nota: " + listaAlunos.stream().min(compararNota).get());
    }
}