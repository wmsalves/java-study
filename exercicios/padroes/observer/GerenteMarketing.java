package exercicios.padroes.observer;

public class GerenteMarketing implements ObservadorLancamentoProduto {

    public void chegou(EventoLancamentoProduto evento) {
        System.out.println("Notificar a equipe de comunicação...");
        System.out.println("Preparar a divulgação online...");
        System.out.println("Enviar e-mails para os clientes...");
        System.out.println("Lançamento iniciado com sucesso!");
    }
}