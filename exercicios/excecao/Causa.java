package exercicios.excecao;

public class Causa {
    public static void main(String[] args) {

    // Primeira chamada: trata exceção com causa
    try {
        processarAluno(null);
    } catch (IllegalArgumentException e) {
        Throwable causaOriginal = e.getCause();
        if (causaOriginal != null) {
            System.out.println("Erro capturado: " + causaOriginal.getMessage());
        }
    }

    // Segunda chamada: sem tratamento de exceção
    processarAluno(null);
}

    static void processarAluno(Aluno aluno) {
        try {
            validarAluno(aluno);
        } catch (Exception ex) {
            throw new IllegalArgumentException("Erro ao processar aluno", ex);
        }
    }

    static void validarAluno(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("Objeto Aluno está nulo!");
        }

        System.out.println("Nome do aluno: " + aluno.nome);
    }
}