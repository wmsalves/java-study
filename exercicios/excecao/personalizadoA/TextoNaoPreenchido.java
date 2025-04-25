package exercicios.excecao.personalizadoA;

public class TextoNaoPreenchido extends RuntimeException {

    private String campo;

    public TextoNaoPreenchido(String campo) {
        this.campo = campo;
    }

    @Override
    public String getMessage() {
        return String.format("O campo '%s' deve ser preenchido.", campo);
    }
}
