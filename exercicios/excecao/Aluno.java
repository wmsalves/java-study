package exercicios.excecao;

public class Aluno {	public final String nome;
    public final double mediaFinal;
    public final boolean temDisciplina;
    public int nota;

    public Aluno(String nome, double mediaFinal) {
        this(nome, mediaFinal, true);
    }

    public Aluno(String nome, double mediaFinal, boolean temDisciplina) {
        this.nome = nome;
        this.mediaFinal = mediaFinal;
        this.temDisciplina = temDisciplina;
    }

    @Override
    public String toString() {
        return nome + " alcançou média " + mediaFinal;
    }

    @Override
    public int hashCode() {
        final int primo = 31;
        int resultado = 1;
        resultado = primo * resultado + (temDisciplina ? 1231 : 1237);
        resultado = primo * resultado + ((nome == null) ? 0 : nome.hashCode());
        long temp = Double.doubleToLongBits(mediaFinal);
        resultado = primo * resultado + (int) (temp ^ (temp >>> 32));
        return resultado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Aluno outro = (Aluno) obj;
        if (temDisciplina != outro.temDisciplina)
            return false;
        if (nome == null) {
            if (outro.nome != null)
                return false;
        } else if (!nome.equals(outro.nome))
            return false;
        return Double.doubleToLongBits(mediaFinal) == Double.doubleToLongBits(outro.mediaFinal);
    }
}
