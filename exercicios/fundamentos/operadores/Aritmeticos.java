package exercicios.fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args) {

        System.out.println(9 + 2);

        var x = 1.56;
        double y = 6.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 4;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / (double) b);
        System.out.println(a / (float) b);

        System.out.println(a % b);
        System.out.println(8 % 3);

        System.out.println(x + y - a * b);
    }
}