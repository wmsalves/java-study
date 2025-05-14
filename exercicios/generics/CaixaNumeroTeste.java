package exercicios.generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {

        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(2.3);

        caixaA.abrir().ifPresentOrElse(
                v -> System.out.println("Valor da caixaA: " + v),
                () -> System.out.println("caixaA está vazia.")
        );

        caixaA.dobro().ifPresent(d -> System.out.println("Dobro da caixaA: " + d));
        System.out.println("Valor da caixaA é negativo? " + caixaA.isNegativo());

        System.out.println();

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(-10);

        caixaB.abrir().ifPresentOrElse(
                v -> System.out.println("Valor da caixaB: " + v),
                () -> System.out.println("caixaB está vazia.")
        );

        caixaB.dobro().ifPresent(d -> System.out.println("Dobro da caixaB: " + d));
        System.out.println("Valor da caixaB é negativo? " + caixaB.isNegativo());
    }
}