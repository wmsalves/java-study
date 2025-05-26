package exercicios.padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Seguranca {

    private List<ObservadorLancamentoProduto> observadores = new ArrayList<>();

    public void registrarObservador(ObservadorLancamentoProduto observador) {
        observadores.add(observador);
    }

    public void monitorar() {
        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!"sair".equalsIgnoreCase(valor)) {
            System.out.print("Produto foi lançado? ");
            valor = entrada.nextLine();

            if ("sim".equalsIgnoreCase(valor)) {
                EventoLancamentoProduto evento =
                        new EventoLancamentoProduto(new Date());

                observadores.stream()
                        .forEach(o -> o.chegou(evento));
                valor = "sair";
            } else {
                System.out.println("Falso alarme!");
            }
        }

        entrada.close();
    }
}

