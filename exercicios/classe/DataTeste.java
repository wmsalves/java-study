package exercicios.classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.ano = 2023;

        var d2 = new Data(25, 11, 2022);

        String dataFormatada1 = d1.obterDataFormatada();

        System.out.println(dataFormatada1);
        System.out.println(d2.obterDataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
    }
}
