package exercicios.excecao;

public class Basico {
    public static void main(String[] args) {

    Aluno aluno = null;

    try {
        exibirNomeAluno(aluno);
    } catch(Exception e) {
        System.out.println("Erro ao tentar acessar o nome do aluno.");
    }

    try {
        int resultado = 10 / 0;
        System.out.println(resultado);
    } catch (ArithmeticException erro) {
        System.out.println("Divisão por zero não é permitida: " + erro.getMessage());
    }

    System.out.println("Programa finalizado com sucesso!");
}

    public static void exibirNomeAluno(Aluno a) {
        System.out.println(a.nome);
    }
}
