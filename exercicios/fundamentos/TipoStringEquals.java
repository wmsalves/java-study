package exercicios.fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

    public static void main(String[] args) {
        System.out.println("5" == "5");

        String s1 = new String("5");
        System.out.println("5" == s1);
        System.out.println("5".equals(s1));

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next();
        System.out.println("5" == s2.trim());
        System.out.println("5".equals(s2.trim()));

        entrada.close();
    }
}
