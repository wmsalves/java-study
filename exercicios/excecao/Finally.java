package exercicios.excecao;
import java.util.Scanner;

public class Finally {    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Digite um número para dividir 10: ");
        int numero = scanner.nextInt();
        System.out.println("Resultado: " + (10 / numero));
    } catch (ArithmeticException e) {
        System.out.println("Erro de divisão: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Erro inesperado: " + e.getMessage());
    } finally {
        System.out.println("Primeiro bloco finally executado.");
    }

    try {
        System.out.print("Digite outro número para dividir 10: ");
        int numero2 = scanner.nextInt();
        System.out.println("Resultado: " + (10 / numero2));
    } finally {
        System.out.println("Segundo bloco finally executado.");
        scanner.close();
    }

    System.out.println("Programa finalizado!");
}
}
