package exercicios.generics;

import java.util.Optional;

/**
 * Caixa especializada para armazenar números.
 * @param <N> tipo numérico que estende Number (ex: Integer, Double)
 */
public class CaixaNumero<N extends Number> extends Caixa<N> {

    /**
     * Retorna o valor armazenado em formato double.
     * @return Optional com o valor convertido, ou vazio se não houver valor.
     */
    public Optional<Double> valorComoDouble() {
        return abrir().map(Number::doubleValue);
    }

    /**
     * Retorna o dobro do número armazenado.
     * @return Optional com o dobro do valor, ou vazio se não houver valor.
     */
    public Optional<Double> dobro() {
        return valorComoDouble().map(v -> v * 2);
    }

    /**
     * Verifica se o número armazenado é negativo.
     * @return true se for negativo, false caso contrário ou se estiver vazio.
     */
    public boolean isNegativo() {
        return valorComoDouble().map(v -> v < 0).orElse(false);
    }
}