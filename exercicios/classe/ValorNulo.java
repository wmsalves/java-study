package exercicios.classe;

public class ValorNulo {
    public static void main(String[] args) {

        String s1 = "Olá";
        System.out.println(s1.concat(" Mundo!"));

        Data d1 = Math.random() > 0.5 ? new Data() : null;

        if (d1 != null) {
            d1.mes = 12;
            System.out.println(d1.obterDataFormatada());
        }

        String s2 = Math.random() > 0.5 ? "Boa tarde" : null;

        if (s2 != null) {
            System.out.println(s2.concat(", pessoal!"));
        }
    }
}