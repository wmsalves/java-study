package exercicios.generics;

import java.util.Optional;

/**
 * Caixa que pode armazenar qualquer tipo de objeto.
 */
public class CaixaObjeto {

    private Object coisa;

    /**
     * Armazena qualquer objeto.
     *
     * @param coisa o objeto a ser armazenado
     */
    public void guardar(Object coisa) {
        this.coisa = coisa;
    }

    /**
     * Retorna o objeto armazenado, encapsulado em Optional.
     *
     * @return Optional com o objeto armazenado, ou vazio se nulo
     */
    public Optional<Object> abrir() {
        return Optional.ofNullable(coisa);
    }

    /**
     * Verifica se o conteúdo é de um tipo específico.
     *
     * @param tipo a classe do tipo a ser verificado
     * @return true se o conteúdo for do tipo especificado
     */
    public boolean éDoTipo(Class<?> tipo) {
        return tipo.isInstance(coisa);
    }

    /**
     * Tenta retornar o conteúdo convertido para o tipo especificado.
     *
     * @param <T>  tipo esperado
     * @param tipo classe do tipo
     * @return Optional com o valor convertido, ou vazio se não for do tipo
     */
    public <T> Optional<T> abrirComo(Class<T> tipo) {
        return tipo.isInstance(coisa) ? Optional.of(tipo.cast(coisa)) : Optional.empty();
    }

    @Override
    public String toString() {
        return "CaixaObjeto{" + "coisa=" + coisa + '}';
    }
}