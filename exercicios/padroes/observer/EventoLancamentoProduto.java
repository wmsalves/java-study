package exercicios.padroes.observer;

import java.util.Date;

public class EventoLancamentoProduto {

    private final Date momento;

    public EventoLancamentoProduto(Date momento) {
        this.momento = momento;
    }

    public Date getMomento() {
        return momento;
    }
}