package exercicios.oo.abstrato;

public abstract class Mamifero extends Animal {

    public abstract String mamar();

    @Override
    public String mover() {
        return "Se movendo do lugar";
    }
}