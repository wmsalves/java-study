package exercicios.oo.encapsulamento.casaB;

import exercicios.oo.encapsulamento.casaA.Maria;

public class Vitoria {
    void testeAcessos() {
        Maria sogra = new Maria();

        // System.out.println(sogra.codigoSecreto);
        // System.out.println(sogra.atividadeEmCasa);
        // System.out.println(sogra.estiloDeComunicacao);
        System.out.println(sogra.informacaoPublica);
    }
}