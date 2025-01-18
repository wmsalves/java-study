package exercicios.fundamentos;

public class tipoString {

    public static void main(String[] args) {
        System.out.println("Olá mundo".charAt(2));

        String s = "Boa noite";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toUpperCase().endsWith("NOITE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa noite"));
        System.out.println(s.equalsIgnoreCase("boa noite"));

        var nome = "Carlos";
        var sobrenome = "Almeida";
        var idade = 45;
        var salario = 9876.543;

        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: " + idade +
                "\nSalario: " + salario + "\n\n";
        System.out.println(maisUmaFrase);

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Texto qualquer".contains("qual"));
        System.out.println("Texto qualquer".indexOf("qual"));
        System.out.println("Texto qualquer".substring(6));
        System.out.println("Texto qualquer".substring(6, 10));
    }
}
