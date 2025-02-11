package exercicios.classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto() {
        // nome = "Produto Genérico";
        // preco = 0.0;
        // desconto = 0.0;
        this("Produto Genérico", 0.0, 0.0);
    }

    Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    double obterPrecoComDesconto() {
        return this.preco * (1 - this.desconto);
    }

    void imprimirPrecoComDesconto() {
        System.out.println("Preço com desconto: R$" + this.obterPrecoComDesconto());
    }

}
