package exercicios.generics;

import java.util.Arrays;
import java.util.List;

public class ElementoFinalTeste {

    public static void main(String[] args) {
        List<String> tecnologias = Arrays.asList("HTML", "CSS", "Python", "Go");
        List<Double> precos = Arrays.asList(19.99, 35.50, 7.80, 12.00);

        String ultimaTecnologia = (String) ElementoFinalUtil.pegarUltimoGenerico(tecnologias);
        System.out.println(ultimaTecnologia);

        Double ultimoPreco = (Double) ElementoFinalUtil.pegarUltimoGenerico(precos);
        System.out.println(ultimoPreco);

        String ultimaTecTipada = ElementoFinalUtil.pegarUltimoTipado(tecnologias);
        System.out.println(ultimaTecTipada);

        Double precoTipado = ElementoFinalUtil.<Double>pegarUltimoTipado(precos);
        System.out.println(precoTipado);
    }
}