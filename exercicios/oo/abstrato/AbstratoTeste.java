package exercicios.oo.abstrato;

public class AbstratoTeste {

    public static void main(String[] args) {
        Mamifero a = new Cachorro();
        System.out.println(a.mover());
        System.out.println(a.mamar());
        System.out.println(a.respirar());
    }
}