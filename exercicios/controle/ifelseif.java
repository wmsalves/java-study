package exercicios.controle;

import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");

        double temperatura = entrada.nextDouble();

        if (temperatura > 50 || temperatura < -30) {
            System.out.println("Temperatura inválida!");
        } else if (temperatura >= 35) {
            System.out.println("Muito quente!");
            System.out.println("Fique hidratado!");
        } else if (temperatura >= 25) {
            System.out.println("Clima agradável.");
        } else if (temperatura >= 15) {
            System.out.println("Levemente frio.");
        } else if (temperatura >= 5) {
            System.out.println("Frio intenso.");
        } else {
            System.out.println("Muito frio! Cuidado com a hipotermia.");
        }

        System.out.println("Fim!");
        entrada.close();
    }
}
