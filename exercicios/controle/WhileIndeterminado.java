package exercicios.controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String comando = "";

        while (!comando.equalsIgnoreCase("fim")) {
            System.out.print("Digite algo: ");
            comando = input.nextLine();
        }
        input.close();
    }
}
