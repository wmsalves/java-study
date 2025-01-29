package exercicios.controle;

import java.util.Scanner;

public class ifexample {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média do aluno: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("Aluno aprovado!");
            System.out.println("Parabéns pelo desempenho!");
        }

        if (media < 7.0 && media >= 4.5) {
            System.out.println("Aluno em recuperação.");
        }

        boolean reprovado = media < 4.5 && media >= 0;

        if (reprovado) {
            System.out.println("Aluno reprovado.");
        }

        entrada.close();
    }
}
