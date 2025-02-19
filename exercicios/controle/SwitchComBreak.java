package exercicios.controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String classificacao = "";
        System.out.print("Digite a pontuação: ");
        int pontuacao = input.nextInt();

        switch (pontuacao) {
            case 100:
            case 90:
                classificacao = "Excelente";
                break;
            case 80:
            case 70:
                classificacao = "Bom";
                break;
            case 60:
            case 50:
                classificacao = "Regular";
                break;
            case 40:
            case 30:
                classificacao = "Insuficiente";
                break;
            case 20:
            case 10:
            case 0:
                classificacao = "Muito insuficiente";
                break;
            default:
                classificacao = "Pontuação inválida!";
        }

        System.out.println("Classificação: " + classificacao);
        input.close();
    }
}
