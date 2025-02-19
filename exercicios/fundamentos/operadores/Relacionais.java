package exercicios.fundamentos.operadores;

public class Relacionais {

    public static void main(String[] args) {

        int a = 65;
        int b = 'A';

        System.out.println(a == b); // true
        System.out.println(15 != 10); // true
        System.out.println(5 > 2); // true
        System.out.println(5 >= 5); // true
        System.out.println(6 < 10); // true
        System.out.println(20 <= 15); // false

        double nota = 8.5;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto); // true
    }
}