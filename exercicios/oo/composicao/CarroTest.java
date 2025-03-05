package exercicios.oo.composicao;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println("O carro está ligado? " + c1.estaLigado());

        c1.ligar();
        System.out.println("O carro está ligado agora? " + c1.estaLigado());

        System.out.println("Giros iniciais do motor: " + c1.motor.giros());

        // Acelerando o carro algumas vezes
        for (int i = 0; i < 3; i++) {
            c1.acelerar();
        }
        System.out.println("Giros após aceleração: " + c1.motor.giros());

        // Freando o carro
        for (int i = 0; i < 5; i++) {
            c1.frear();
        }
        System.out.println("Giros após frenagem: " + c1.motor.giros());

        // Relação bidirecional sem redundância
        System.out.println("Giros via acesso bidirecional: " + c1.motor.carro.motor.giros());
    }
}
