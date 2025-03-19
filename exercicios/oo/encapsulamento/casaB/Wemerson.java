package exercicios.oo.encapsulamento.casaB;

import exercicios.oo.encapsulamento.casaA.Maria;

public class Wemerson extends Maria {
    void testeAcessos() {
        // System.out.println(codigoSecreto);
        // System.out.println(atividadeEmCasa);
        System.out.println(estiloDeComunicacao);
        System.out.println(informacaoPublica);
        System.out.println(new Maria().informacaoPublica);
    }
}
