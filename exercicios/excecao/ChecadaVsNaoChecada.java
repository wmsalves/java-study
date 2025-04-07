package exercicios.excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {

    try {
        dispararErroNaoVerificado();
    } catch (RuntimeException ex) {
        System.out.println("Erro capturado: " + ex.getMessage());
    }

    try {
        dispararErroVerificado();
    } catch (Exception ex) {
        System.out.println("Exceção tratada: " + ex.getMessage());
    }

    System.out.println("Programa encerrado com sucesso!");
}

    // Exceção não checada
    static void dispararErroNaoVerificado() {
        throw new RuntimeException("Falha inesperada #01");
    }

    // Exceção checada
    static void dispararErroVerificado() throws Exception {
        throw new Exception("Falha controlada #02");
    }
}
