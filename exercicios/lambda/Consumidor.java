package exercicios.lambda;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> exibirProduto =
                p -> System.out.println("Produto: " + p.nome + "!!!");

        Produto p1 = new Produto("Mouse", 59.90, 0.10);
        exibirProduto.accept(p1);

        Produto p2 = new Produto("Teclado", 149.99, 0.15);
        Produto p3 = new Produto("Monitor", 899.90, 0.20);
        Produto p4 = new Produto("Fone de Ouvido", 199.90, 0.12);
        Produto p5 = new Produto("Webcam", 129.90, 0.08);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(exibirProduto);
        produtos.forEach(p -> System.out.println("Preço: R$" + p.preco));
        produtos.forEach(System.out::println);
    }
}
