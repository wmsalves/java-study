package exercicios.generics;

import java.util.Optional;

public class CaixaIntTeste {

    public static void main(String[] args) {

        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(123);

        Optional<Integer> coisaA = caixaA.abrir();

        // Forma segura de acessar o valor dentro do Optional
        if (coisaA.isPresent()) {
            System.out.println("Valor da caixa: " + coisaA.get());
        } else {
            System.out.println("A caixa está vazia.");
        }
    }
}