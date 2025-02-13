package exercicios.classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data() {
        this(10, 12, 2000); // Valores padrão alterados
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        final String formato = "%02d/%02d/%d"; // Adicionado zero à esquerda para dia e mês
        return String.format(formato, this.dia, this.mes, this.ano);
    }

    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada());
    }
}