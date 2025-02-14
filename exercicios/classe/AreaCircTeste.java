package exercicios.classe;

public class AreaCircTeste {
    double lado;
    final static double CONSTANTE = 2.718;

    AreaCircTeste(double ladoInicial) {
        lado = ladoInicial;
    }

    double calcularArea() {
        return CONSTANTE * Math.pow(lado, 2);
    }

    static double calcularArea(double lado) {
        return CONSTANTE * Math.pow(lado, 2);
    }
}
