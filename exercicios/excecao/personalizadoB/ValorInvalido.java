package exercicios.excecao.personalizadoB;

@SuppressWarnings("serial")
public class ValorInvalido extends Exception {

    private String nomeDoCampo;

    public ValorInvalido(String nomeDoCampo) {
        this.nomeDoCampo = nomeDoCampo;
    }

    @Override
    public String getMessage() {
        return String.format("O campo '%s' possui um valor inválido.", nomeDoCampo);
    }
}
