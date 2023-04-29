/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author mvictor
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBancoSQLite {
    public static void main(String[] args) {
        Connection conexao = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
            System.out.println("Banco de dados criado com sucesso!");

            stmt = conexao.createStatement();
            String sql = "CREATE TABLE produtos " +
                    "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    " nome TEXT NOT NULL, " +
                    " preco REAL NOT NULL)";
            stmt.executeUpdate(sql);
            System.out.println("Tabela criada com sucesso!");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException ex) {
                System.err.println("Erro ao fechar conexão: " + ex.getMessage());
            }
        }
    }
}

