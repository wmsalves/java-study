package exercicios.controle;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String nivel = "avançado";

        switch (nivel.toLowerCase()) {
            case "especialista":
                System.out.println("Domina algoritmos complexos...");
            case "avançado":
                System.out.println("Conhece estruturas de dados avançadas");
            case "intermediário":
                System.out.println("Compreende orientação a objetos");
            case "básico":
                System.out.println("Sabe sintaxe fundamental");
            case "iniciante":
                System.out.println("Entende lógica de programação");
                break;
            default:
                System.out.println("Nenhum conhecimento identificado");
        }

        System.out.println("Avaliação concluída!");

        int experiencia = 1;

        switch (experiencia) {
            case 5:
                System.out.println("Experiência sênior em desenvolvimento");
            case 3:
                System.out.println("Experiência intermediária em projetos");
            case 1:
                System.out.println("Experiência básica em programação");
            case 0:
                System.out.println("Nenhuma experiência prévia");
        }
    }
}
