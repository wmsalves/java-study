package exercicios.padroes.observer;

@FunctionalInterface
public interface ObservadorLancamentoProduto {

    public void chegou(EventoLancamentoProduto evento);
}