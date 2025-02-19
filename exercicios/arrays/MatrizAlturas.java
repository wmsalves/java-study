package exercicios.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizAlturas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas pessoas? ");
        int qtdePessoas = entrada.nextInt();

        System.out.print("Quantas medições de altura por pessoa? ");
        int qtdeMedicoes = entrada.nextInt();

        double[][] alturas = new double[qtdePessoas][qtdeMedicoes];

        double total = 0;
        for (int p = 0; p < alturas.length; p++) {
            for (int m = 0; m < alturas[p].length; m++) {
                System.out.printf("Informe a altura %d da pessoa %d (em metros): ", m + 1, p + 1);
                alturas[p][m] = entrada.nextDouble();
                total += alturas[p][m];
            }
        }

        double media = total / (qtdePessoas * qtdeMedicoes);
        System.out.println("Altura média do grupo: " + media + "m");

        for (double[] alturasPessoa : alturas) {
            System.out.println(Arrays.toString(alturasPessoa));
        }

        entrada.close();
    }
}
