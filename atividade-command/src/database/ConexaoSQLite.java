/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mvictor
 */
public class ConexaoSQLite {
    private static ConexaoSQLite instancia=null;
    private Connection conexao=null;
    private int clientes=0;
    
    private ConexaoSQLite(){
        try{
           Class.forName("org.sqlite.JDBC");
           conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
           System.out.println("Conexão com SQLite estabelecida com sucesso!");
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println("Erro ao conectar com SQLite:" + ex.getMessage());
        }
    }
    
    public static ConexaoSQLite getInstance(){
        if(instancia==null)
        {
            instancia = new ConexaoSQLite();
        }
        return instancia;
    }
    
    public Connection getConexao(){
        return conexao;
    }
    
    public void fecharConexao(){
        try{
            if(conexao != null){
               conexao.close();
               System.out.println("Conexão com SQLite fechada.");
            }
        }
        catch(SQLException ex){
            System.out.println("Erro ao fechar conexão com SQLite: "+ ex.getMessage());
        }
    }
   
}

   
