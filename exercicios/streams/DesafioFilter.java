package exercicios.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

        Produto p1 = new Produto("Caneta", 2.50, 0.30, 0);
        Produto p2 = new Produto("Smartphone", 2999.99, 0.35, 0);
        Produto p3 = new Produto("Agenda", 25.00, 0.10, 5.0);
        Produto p4 = new Produto("Scanner", 850.00, 0.33, 0);
        Produto p5 = new Produto("Tablet", 1500.00, 0.28, 0);
        Produto p6 = new Produto("Smartwatch", 999.00, 0.40, 0);
        Produto p7 = new Produto("Teclado", 350.00, 0.50, 10.0);

        List<Produto> listaProdutos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> temDescontoAlto = p -> p.desconto >= 0.3;
        Predicate<Produto> freteZero = p -> p.valorFrete == 0;
        Predicate<Produto> precoMinimo = p -> p.preco >= 800;

        Function<Produto, String> anuncio =
                p -> "Promoção: " + p.nome + " por apenas R$" + p.preco;

        listaProdutos.stream()
                .filter(temDescontoAlto)
                .filter(freteZero)
                .filter(precoMinimo)
                .map(anuncio)
                .forEach(System.out::println);
    }
}
