package exercicios.generics;


public class MapaSimplesTeste {

    public static void main(String[] args) {

        MapaSimples<Integer, String> ranking = new MapaSimples<>();

        ranking.inserir(10, "Lucas");
        ranking.inserir(20, "Juliana");
        ranking.inserir(30, "Carlos");
        ranking.inserir(40, "Bianca");
        ranking.inserir(20, "Fernanda"); // sobrescreve chave 20

        System.out.println(ranking.buscar(10));
        System.out.println(ranking.buscar(40));
        System.out.println(ranking.buscar(20));
    }
}