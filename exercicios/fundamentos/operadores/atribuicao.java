package exercicios.fundamentos.operadores;

public class atribuicao {

    public static void main(String[] args) {

        int x = 5;
        int y = x * 2;
        int z = x + y;

        z += y; // z = z + y;
        z -= x; // z = z - x;
        z *= y; // z = z * y;
        z /= x; // z = z / x;

        System.out.println(z);

        z %= 3; // z = z % 3; 0, 1 ou 2
        System.out.println(z);
    }
}
