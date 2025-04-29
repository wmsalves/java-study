package exercicios.excecao.personalizadoB;

import exercicios.excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Ana", 7);
            Validador.validarAluno(aluno);

            Validador.validarAluno(null);
        } catch (TextoNaoPreenchido e) {
            System.out.println(e.getMessage());
        } catch (ValorInvalido | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Execução concluída :)");
    }
}