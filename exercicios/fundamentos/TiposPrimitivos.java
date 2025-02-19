package exercicios.fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Informações do funcionario

        // numéricos inteiros
        byte anosDeEmpresa = 21;
        short numeroDeVoos = 242;
        int id = 63289;
        long pontosAcumulados = 5_122_245_113L;

        // numéricos reais
        float salario = 12_452.40F;
        double vendasAcumuladas = 3_811_697_213.01;

        // booleano
        boolean estaDeFerias = false; // true

        // caractere
        char status = 'A'; // ativo

        // dia de empresa
        System.out.println(anosDeEmpresa * 365);

        // numero de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}

