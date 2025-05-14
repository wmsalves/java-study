package exercicios.generics;

import java.util.Optional;

/**
 * Uma caixa genérica para armazenar qualquer tipo de objeto.
 *
 * @param <T> o tipo de dado que será armazenado
 */
public class Caixa<T> {

    private T coisa;

    /**
     * Guarda um objeto na caixa.
     *
     * @param coisa o objeto a ser guardado
     */
    public void guardar(T coisa) {
        this.coisa = coisa;
    }

    /**
     * Retorna o conteúdo da caixa, encapsulado em um Optional.
     *
     * @return um Optional contendo o objeto armazenado (pode estar vazio)
     */
    public Optional<T> abrir() {
        return Optional.ofNullable(coisa);
    }

    @Override
    public String toString() {
        return "Caixa{" +
                "coisa=" + coisa +
                '}';
    }
}