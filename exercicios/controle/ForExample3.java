package exercicios.controle;

public class ForExample3 {
    public static void main(String[] args) {

        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= 5; y++) {
                System.out.printf("(%d, %d) ", x, y);
            }
            System.out.println();
        }
    }
}

