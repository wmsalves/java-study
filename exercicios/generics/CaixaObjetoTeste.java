package exercicios.generics;

public class CaixaObjetoTeste {

    public static void main(String[] args) {

        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3);

        caixaA.abrirComo(Double.class).ifPresentOrElse(
                d -> System.out.println("Valor de caixaA (Double): " + d),
                () -> System.out.println("caixaA não contém um Double.")
        );

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("Olá");

        caixaB.abrirComo(String.class).ifPresentOrElse(
                s -> System.out.println("Valor de caixaB (String): " + s),
                () -> System.out.println("caixaB não contém uma String.")
        );

        // Teste de tipo incorreto
        caixaB.abrirComo(Integer.class).ifPresentOrElse(
                i -> System.out.println("Isto nunca será impresso: " + i),
                () -> System.out.println("caixaB não contém um Integer.")
        );
    }
}