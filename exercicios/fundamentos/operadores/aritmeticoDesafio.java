package exercicios.fundamentos.operadores;

public class aritmeticoDesafio {

    public static void main(String[] args) {

        double numA = Math.pow(8 * (5 + 4), 1);
        double denA = 5 * 3;

        double numB = (4 - 10) * (4 - 14);
        double denB = 6;

        double superiorA = numA / denA;
        double superiorB = Math.pow(numB / denB, 2);

        double superior = Math.pow(superiorA - superiorB, 3);
        double inferior = Math.pow(30, 9);

        double resultado = superior / inferior;

        System.out.println("O resultado é " + resultado);
    }
}
