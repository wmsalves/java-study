package exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {    public static void main(String[] args) {
    Aluno aluno1 = new Aluno("Bruno", 6.8);
    Aluno aluno2 = new Aluno("Mariana", 7.5);
    Aluno aluno3 = new Aluno("Carlos", 8.9);
    Aluno aluno4 = new Aluno("Fernanda", 9.3);

    List<Aluno> listaAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

    Predicate<Aluno> foiAprovado = aluno -> aluno.nota >= 7;
    Predicate<Aluno> foiReprovado = foiAprovado.negate();

    System.out.println("Todos aprovados? " + listaAlunos.stream().allMatch(foiAprovado));
    System.out.println("Algum aprovado? " + listaAlunos.stream().anyMatch(foiAprovado));
    System.out.println("Nenhum reprovado? " + listaAlunos.stream().noneMatch(foiReprovado));
    }
}
