package exercicios.arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas alturas deseja informar? ");
        int qtdeAlturas = entrada.nextInt();

        double[] alturas = new double[qtdeAlturas];

        for (int i = 0; i < alturas.length; i++) {
            System.out.print("Informe a altura " + (i + 1) + " em metros: ");
            alturas[i] = entrada.nextDouble();
        }

        double soma = 0;
        for (double altura : alturas) {
            soma += altura;
        }

        double media = soma / alturas.length;
        System.out.println("A altura média é " + media + "m!");
        entrada.close();
    }
}
