package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Informe o código: ");
            int codigo = entrada.nextInt();

            int linhasAfetadas = deletarPessoaPorCodigo(codigo);

            if (linhasAfetadas > 0) {
                System.out.println("Pessoa excluída com sucesso!");
            } else {
                System.out.println("Nada feito! Nenhuma pessoa com esse código.");
            }

            System.out.println("Linhas afetadas: " + linhasAfetadas);
        } catch (SQLException e) {
            System.err.println("Erro ao excluir pessoa: " + e.getMessage());
        }
    }

    private static int deletarPessoaPorCodigo(int codigo) throws SQLException {
        final String sql = "DELETE FROM pessoas WHERE codigo = ?";

        try (Connection conexao = FabricaConexao.getConexao();
                PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, codigo);
            return stmt.executeUpdate();
        }
    }
}
