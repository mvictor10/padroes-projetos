/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


/**
 * Classe que faz a conexão com o banco de dados SQLITE.
 * @version V1.0.0alpha
 * @author mvictor
 */
public final class Connector {
    private static Connector instance=null;
    private Connection connection=null;
    private int clientes=0;
    private Connector(){   
        try {
            Class.forName("org.sqlite.JDBC");//
            connection=DriverManager.getConnection("jdbc:sqlite:banco.db");
            System.out.println("DB[Sucess]");
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.print("Houve um Error: " + ex.getMessage());
        }
    }
    
    public static Connector getIstance(){
        if(instance==null){
            instance=new Connector();
        }
        return instance;
    }
    
    public Connection getConexao(){
        if(connection==null){
            throw new RuntimeException("connection==null");
        }
        clientes++;
        System.out.printf("DB[connection clients %d]\n", clientes);
        return connection;
    }
    
    public void shutdown(){
        System.out.printf("DB[shutdown cliente = %d]", clientes);
        clientes++;
        if(clientes>0){
           return;
        }
        try{
            connection.close();
            instance=null;
            connection=null;
            System.out.println("Closed connection!");
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
 
}
