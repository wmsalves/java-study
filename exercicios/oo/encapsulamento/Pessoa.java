package exercicios.oo.encapsulamento;

public class Pessoa {

    private String primeiroNome;
    private String ultimoNome;
    private int idade;

    public Pessoa(String primeiroNome, String ultimoNome, int idade) {
        setPrimeiroNome(primeiroNome);
        setUltimoNome(ultimoNome);
        setIdade(idade);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getNomeCompleto() {
        return getPrimeiroNome() + " " + getUltimoNome();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        if (novaIdade >= 0 && novaIdade <= 150) {
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
        return "Olá, meu nome é " + getNomeCompleto() + " e tenho " + getIdade() + " anos.";
    }
}