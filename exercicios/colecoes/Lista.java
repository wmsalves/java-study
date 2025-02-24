package exercicios.colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("João");
        lista.add(u1);

        lista.add(new Usuario("Mariana"));
        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Lucas"));
        lista.add(new Usuario("Fernanda"));
        lista.add(new Usuario("Fernanda"));

        System.out.println(lista.get(3)); // Acessar pelo índice

        System.out.println(">>>> " + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Fernanda")));
        System.out.println(lista.remove(new Usuario("Fernanda")));
        System.out.println(lista.remove(new Usuario("Fernanda")));

        System.out.println("Tem? " + lista.contains(new Usuario("Pedro")));
        System.out.println("Tem? " + lista.contains(u1));

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
    }
}
