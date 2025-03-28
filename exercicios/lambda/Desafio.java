package exercicios.lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        /*
         * 1. A partir do produto calcular o preço com desconto aplicado
         * 2. Imposto Estadual: >= 2000 (7,5%) / < 2000 (Isento)
         * 3. Taxa de entrega: >= 3500 (120) / < 3500 (60)
         * 4. Arredondar: Duas casas decimais
         * 5. Formatar: R$1.234,56
         */

        Function<Produto, Double> precoComDesconto =
                produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoEstadual =
                preco -> preco >= 2000 ? preco * 1.075 : preco;
        UnaryOperator<Double> taxaEntrega =
                preco -> preco >= 3500 ? preco + 120 : preco + 60;
        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("MacBook", 4120.75, 0.10);
        String precoFinal = precoComDesconto
                .andThen(impostoEstadual)
                .andThen(taxaEntrega)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.println("O preço final é " + precoFinal);
    }
}
