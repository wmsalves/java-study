package exercicios.controle;

public class breakExample1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            if (i == 8) {
                break;
            }
            System.out.println("Valor atual: " + i);
        }
        System.out.println("Loop finalizado!");
    }
}
