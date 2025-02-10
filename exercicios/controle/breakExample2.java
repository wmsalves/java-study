package exercicios.controle;

public class breakExample2 {
    public static void main(String[] args) {

        externo:
        for (int x = 2; x < 5; x++) {
            for (int y = 4; y < 7; y++) {
                if (x == 3) {
                    break externo;
                }
                System.out.printf("(%d %d) ", x, y);
            }
            System.out.println();
        }

        System.out.println("Concluído!");
    }

}
