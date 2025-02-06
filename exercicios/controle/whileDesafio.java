package exercicios.controle;

import java.util.Scanner;

public class whileDesafio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroDeEntradas = 0;
        double valor = 0;
        double soma = 0;

        while (valor != -1) {
            System.out.print("Digite a nota (ou -1 para encerrar): ");
            valor = input.nextDouble();

            if (valor >= 0 && valor <= 100) {
                soma += valor;
                numeroDeEntradas++;
            } else if (valor != -1) {
                System.out.println("Nota inválida! Insira um valor entre 0 e 100.");
            }
        }

        // Calcular a média
        if (numeroDeEntradas > 0) {
            double mediaFinal = soma / numeroDeEntradas;
            System.out.println("Média final = " + mediaFinal);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        input.close();
    }
}