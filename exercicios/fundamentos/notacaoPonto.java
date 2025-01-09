package exercicios.fundamentos;

public class notacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.replace("X", "Sra");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Wemerson".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X"
                .replace("X", "Victor")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."
        int a = 3;
        System.out.println(a);
    }
}