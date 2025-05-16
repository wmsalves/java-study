package exercicios.generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class MapaSimples<K extends Number, V> {

    private final Set<Dupla<K, V>> itens = new LinkedHashSet<>();

    public void inserir(K chave, V valor) {
        if (chave == null) return;

        Dupla<K, V> novo = new Dupla<>(chave, valor);

        if (itens.contains(novo)) {
            itens.remove(novo);
        }

        itens.add(novo);
    }

    public V buscar(K chave) {
        if (chave == null) return null;

        Optional<Dupla<K, V>> resultado = itens.stream()
                .filter(d -> chave.equals(d.getChave()))
                .findFirst();

        return resultado.map(Dupla::getValor).orElse(null);
    }
}
