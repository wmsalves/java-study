package exercicios.fundamentos.operadores;

public class ternarios {

    public static void main(String[] args) {

        double media = 6.4; // Alterada para um valor menor que 7.0
        String resultadoFinal = media >= 7.0 ?
                "aprovado." : "em recuperação.";
        System.out.println("O aluno está " + resultadoFinal);

        double nota = 8.3; // Alterada para um valor diferente
        boolean bomComportamento = false; // Alterado para refletir mau comportamento
        boolean passouPorMedia = nota >= 7; // Condição permanece a mesma
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "Sim." : "Não.";

        System.out.printf("Tem desconto? %s", resultado);
    }
}
