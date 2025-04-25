package exercicios.excecao.personalizadoA;

import exercicios.excecao.Aluno;

public class Validar {

    private Validar() {}

    public static void aluno(Aluno aluno) {

        if (aluno == null) {
            throw new IllegalArgumentException("O objeto 'aluno' não pode ser nulo.");
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new TextoNaoPreenchido("nome");
        }
    }
}
