package exercicios.controle;

public class WhileDeterminado {
    public static void main(String[] args) {

        int valor = 3;
        while (valor <= 30) {
            System.out.printf("Valor atual: %d\n", valor);
            valor += 3;
        }
    }
}