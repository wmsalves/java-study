package exercicios.fundamentos.operadores;

public class unarios {
    public static void main(String[] args) {
        int a = 5; // Valor inicial alterado para 5
        int b = 10; // Valor inicial alterado para 10

        a++; // Incrementa a em 1 (a = 6)
        a--; // Decrementa a em 1 (a volta a ser 5)

        ++b; // Incrementa b em 1 antes da operação (b = 11)
        --b; // Decrementa b em 1 antes da operação (b volta a ser 10)

        System.out.println("Valor de a: " + a); // Exibe 5
        System.out.println("Valor de b: " + b); // Exibe 10

        System.out.println("Mini Desafio...");
        System.out.println(++a == b--); // a é incrementado para 6, b é comparado como 10 e depois decrementado para 9
        System.out.println(a == b); // Verifica se 6 é igual a 9 (false)
        System.out.println("Valor final de a: " + a); // Exibe 6
        System.out.println("Valor final de b: " + b); // Exibe 9
    }
}