package exercicios.excecao.personalizadoA;

@SuppressWarnings("serial")
public class ValorForaDoLimite extends RuntimeException {

    private String nomeCampo;

    public ValorForaDoLimite(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }

    @Override
    public String getMessage() {
        return String.format("O campo '%s' possui um valor fora dos limites permitidos.", nomeCampo);
    }
}