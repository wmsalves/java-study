package exercicios.fundamentos;

public class PrimitivoObjeto {
    public static void main(String[] args) {

        String s = new String("texto");
        s.toUpperCase();

        // Wrappers são a versão objeto dos tipos
        // primitivos!
        int a = 123;
        System.out.println(a);
    }
}
