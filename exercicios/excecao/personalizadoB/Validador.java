package exercicios.excecao.personalizadoB;

import exercicios.excecao.Aluno;;

public class Validador {

    private Validador() {}

    public static void validarAluno(Aluno aluno)
            throws TextoNaoPreenchido, ValorInvalido {

        if (aluno == null) {
            throw new IllegalArgumentException("O objeto Aluno é nulo.");
        }

        if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new TextoNaoPreenchido("nome");
        }

        if (aluno.nota < 0 || aluno.nota > 10) {
            throw new ValorInvalido("nota");
        }
    }
}