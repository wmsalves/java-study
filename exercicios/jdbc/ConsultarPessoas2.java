package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Informe o valor para pesquisa: ");
            String valor = entrada.nextLine();

            List<Pessoa> pessoas = buscarPessoasPorNome(valor);

            if (pessoas.isEmpty()) {
                System.out.println("Nenhuma pessoa encontrada com esse critério.");
            } else {
                System.out.println("Resultados da pesquisa:");
                for (Pessoa p : pessoas) {
                    System.out.println(p.getCodigo() + " ==> " + p.getNome());
                }
            }

        } catch (SQLException e) {
            System.err.println("Erro ao consultar pessoas: " + e.getMessage());
        }
    }

    private static List<Pessoa> buscarPessoasPorNome(String valor) throws SQLException {
        List<Pessoa> pessoas = new ArrayList<>();
        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        try (Connection conexao = FabricaConexao.getConexao();
                PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, "%" + valor + "%");

            try (ResultSet resultado = stmt.executeQuery()) {
                while (resultado.next()) {
                    int codigo = resultado.getInt("codigo");
                    String nome = resultado.getString("nome");
                    pessoas.add(new Pessoa(codigo, nome));
                }
            }
        }

        return pessoas;
    }
}
