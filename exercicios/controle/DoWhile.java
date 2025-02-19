package exercicios.controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String resposta = "";

        do {
            System.out.println("Para continuar, diga a palavra secreta...");
            System.out.print("Deseja encerrar? ");
            resposta = input.nextLine();
        } while (!resposta.equalsIgnoreCase("sim"));

        System.out.println("Encerrando o programa. Até logo!");
        input.close();
    }
}

