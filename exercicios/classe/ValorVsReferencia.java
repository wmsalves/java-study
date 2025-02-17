package exercicios.classe;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 10;
        double b = a; // atribuição por valor (Tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(15, 7, 2023);
        Data d2 = d1; // atribuição por referência (Objeto)

        d1.dia = 10;
        d2.mes = 11;

        d1.ano = 2027;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        int c = 8;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    static void voltarDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 2000;
    }

    static void alterarPrimitivo(int c) {
        c++;
    }
}