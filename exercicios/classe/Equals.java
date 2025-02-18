package exercicios.classe;

public class Equals {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Ana Souza";
        u1.email = "ana.souza@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Ana Souza";
        u2.email = "ana.souza@email.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        // System.out.println(u2.equals(new Date()));
    }
}