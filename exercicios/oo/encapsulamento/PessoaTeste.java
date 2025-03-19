package exercicios.oo.encapsulamento;

public class PessoaTeste {public static void main(String[] args) {

    Pessoa pessoa1 = new Pessoa("Lucas", "Silva", -30);
    pessoa1.setIdade(150); // Tentativa de alterar para um valor inválido

    System.out.println("Idade ajustada: " + pessoa1.getIdade()); // Verifica a idade após validação
    System.out.println(pessoa1); // toString
    System.out.println("Nome completo: " + pessoa1.getNomeCompleto());
    }
}
