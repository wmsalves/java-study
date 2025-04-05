package exercicios.streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
    Aluno a1 = new Aluno("Bruno", 6.8);
    Aluno a2 = new Aluno("Carla", 7.9);
    Aluno a3 = new Aluno("Diego", 5.5);
    Aluno a4 = new Aluno("Fernanda", 8.3);
    Aluno a5 = new Aluno("Bruno", 6.8);
    Aluno a6 = new Aluno("Helena", 9.4);
    Aluno a7 = new Aluno("Diego", 5.5);
    Aluno a8 = new Aluno("Isabela", 7.2);

    List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

    System.out.println("Alunos distintos:");
    alunos.stream()
            .distinct()
            .forEach(System.out::println);

    System.out.println("\nAplicando skip(3) e limit(3):");
    alunos.stream()
            .distinct()
            .skip(3)
            .limit(3)
            .forEach(System.out::println);

    System.out.println("\nAplicando takeWhile (nota >= 7):");
    alunos.stream()
            .distinct()
            .skip(2)
            .takeWhile(aluno -> aluno.nota >= 7)
            .forEach(System.out::println);
    }
}
