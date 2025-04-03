package exercicios.streams;

public class MediaTeste {
    public static void main(String[] args) {

    Media mediaAluno1 = new Media().adicionar(9.2).adicionar(7.5);
    Media mediaAluno2 = new Media().adicionar(8.1).adicionar(6.4);

    System.out.println("Média do Aluno 1: " + mediaAluno1.getValor());
    System.out.println("Média do Aluno 2: " + mediaAluno2.getValor());

    System.out.println("Média combinada: " + Media.combinar(mediaAluno1, mediaAluno2).getValor());
    }
}
