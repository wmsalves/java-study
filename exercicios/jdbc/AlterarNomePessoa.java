package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Informe o código da pessoa: ");
            int codigo = entrada.nextInt();
            entrada.nextLine(); // consumir quebra de linha

            Pessoa pessoa = buscarPessoaPorCodigo(codigo);

            if (pessoa == null) {
                System.out.println("Pessoa não encontrada!");
                return;
            }

            System.out.println("O nome atual é: " + pessoa.getNome());
            System.out.print("Informe o novo nome: ");
            String novoNome = entrada.nextLine();

            boolean atualizado = atualizarNomePessoa(codigo, novoNome);

            if (atualizado) {
                System.out.println("Pessoa alterada com sucesso!");
            } else {
                System.out.println("Falha ao atualizar pessoa!");
            }

        } catch (SQLException e) {
            System.err.println("Erro ao alterar pessoa: " + e.getMessage());
        }
    }

    private static Pessoa buscarPessoaPorCodigo(int codigo) throws SQLException {
        String sql = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";

        try (Connection conexao = FabricaConexao.getConexao();
                PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, codigo);
            try (ResultSet r = stmt.executeQuery()) {
                if (r.next()) {
                    return new Pessoa(r.getInt("codigo"), r.getString("nome"));
                }
            }
        }
        return null;
    }

    private static boolean atualizarNomePessoa(int codigo, String novoNome) throws SQLException {
        String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        try (Connection conexao = FabricaConexao.getConexao();
                PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);
            return stmt.executeUpdate() > 0;
        }
    }
}
