package exercicios.generics;

public class Dupla<K, V> {

    private K chave;
    private V valor;

    public Dupla() {
    }

    public Dupla(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        return chave;
    }

    public void setChave(K chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        final int primo = 31;
        int resultado = 1;
        resultado = primo * resultado + ((chave == null) ? 0 : chave.hashCode());
        return resultado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Dupla<?, ?> outra = (Dupla<?, ?>) obj;
        if (chave == null) {
            return outra.chave == null;
        } else return chave.equals(outra.chave);
    }
}