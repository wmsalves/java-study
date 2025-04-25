package exercicios.excecao.personalizadoA;

@SuppressWarnings("serial")
public class CampoTextoVazio extends RuntimeException {

    private String nomeCampo;

    public CampoTextoVazio(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }

    @Override
    public String getMessage() {
        return String.format("O campo de texto '%s' não pode estar vazio.", nomeCampo);
    }
}