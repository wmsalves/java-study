package exercicios.oo.heranca.teste;

import exercicios.oo.heranca.desafio.Carro;
import exercicios.oo.heranca.desafio.Civic;
import exercicios.oo.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Civic();

        c1.acelerar();
        System.out.println(c1.toString());

        c1.acelerar();
        System.out.println(c1.toString());

        Ferrari f1 = new Ferrari();

        f1.acelerar();
        System.out.println(f1.toString());

        f1.ligarTurbo();
        f1.ligarAr();
        f1.desligarAr();
        System.out.println(f1.velocidadeDoAr());

        f1.acelerar();
        f1.frear();
        System.out.println(f1);

        f1.acelerar();
        System.out.println(f1);
    }
}
