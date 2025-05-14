package exercicios.generics;

public class CaixaTeste {

    public static void main(String[] args) {

        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Segredo!");

        caixaA.abrir().ifPresentOrElse(
                valor -> System.out.println("Caixa A: " + valor),
                () -> System.out.println("Caixa A está vazia.")
        );

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.1415);

        caixaB.abrir().ifPresentOrElse(
                valor -> System.out.println("Caixa B: " + valor),
                () -> System.out.println("Caixa B está vazia.")
        );
    }
}