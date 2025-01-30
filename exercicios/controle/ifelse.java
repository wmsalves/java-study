package exercicios.controle;

import javax.swing.JOptionPane;

public class ifelse {
    public static void main(String[] args) {

        String entrada = JOptionPane.showInputDialog(
                "Digite um número:");
        int numero = Integer.parseInt(entrada);

        if (numero % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }
    }
}
