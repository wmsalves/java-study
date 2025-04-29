package exercicios.excecao.personalizadoB;

@SuppressWarnings("serial")
public class TextoNaoPreenchido extends Exception {

    private String nomeDoCampo;

    public TextoNaoPreenchido(String nomeDoCampo) {
        this.nomeDoCampo = nomeDoCampo;
    }

    @Override
    public String getMessage() {
        return String.format("O campo '%s' não foi preenchido.", nomeDoCampo);
    }
}