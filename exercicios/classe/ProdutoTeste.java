package exercicios.classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.preco = 150.00;
        p1.desconto = 0.10;  // 10% de desconto

        var p2 = new Produto("Notebook", 3500.00, 0.15);  // 15% de desconto

        String precoComDesconto1 = "Preço com desconto: R$" + p1.obterPrecoComDesconto();

        System.out.println(precoComDesconto1);
        System.out.println("Preço com desconto: R$" + p2.obterPrecoComDesconto());

        p1.imprimirPrecoComDesconto();
        p2.imprimirPrecoComDesconto();
    }
}