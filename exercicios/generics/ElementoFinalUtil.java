package exercicios.generics;

import java.util.List;

public class ElementoFinalUtil {

    public static Object pegarUltimoGenerico(List<?> lista) {
        return lista.get(lista.size() - 1);
    }

    public static <T> T pegarUltimoTipado(List<T> lista) {
        return lista.get(lista.size() - 1);
    }
}
