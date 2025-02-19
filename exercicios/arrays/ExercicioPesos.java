package exercicios.arrays;

import java.util.Arrays;

public class ExercicioPesos {

    public static void main(String[] args) {

        double[] pesosPessoaA = new double[4];
        System.out.println(Arrays.toString(pesosPessoaA));

        pesosPessoaA[0] = 70.5;
        pesosPessoaA[1] = 68.2;
        pesosPessoaA[2] = 72.8;
        pesosPessoaA[3] = 69.4;

        System.out.println(Arrays.toString(pesosPessoaA));
        System.out.println(pesosPessoaA[0]);
        System.out.println(pesosPessoaA[pesosPessoaA.length - 1]);
        // System.out.println(pesosPessoaA[4]); ERRO!

        double totalPessoaA = 0;
        for (int i = 0; i < pesosPessoaA.length; i++) {
            totalPessoaA += pesosPessoaA[i];
        }

        System.out.println(totalPessoaA / pesosPessoaA.length);

        final double pesoArmazenado = 75.3;
        double[] pesosPessoaB = {80.1, 77.5, pesoArmazenado, 79.0};

        double totalPessoaB = 0;
        for (int i = 0; i < pesosPessoaB.length; i++) {
            totalPessoaB += pesosPessoaB[i];
        }

        System.out.println(totalPessoaB / pesosPessoaB.length);
    }
}
