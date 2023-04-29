/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.produto;

import dao.generic.DAO;
import database.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.produto.Produto;

/**
 *
 * @author mvictor
 */
public class ProdutoDAO implements DAO <Produto>{
    private Connection conn = null;
    
    public ProdutoDAO(){
        this.conn = Connector.getIstance().getConexao();
    }
    
    /**
     * @return save - retorna verdadeiro se as informações forem salvas, caso contrário falso.
     * @param entity - Classe modelo com as informações.
     */
    @Override
    public boolean save(Produto entity) {
        boolean status=false;
        String sql = "INSERT INTO produtos(nome, preco, items) VALUES(?, ?, ?)";
        try{
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, entity.getNome());
                ps.setDouble(2, entity.getPreco());
                ps.setString(3, entity.getIgredientes());
                int rowsInserted = ps.executeUpdate();
                if(rowsInserted >0){
                    status=true;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error ao executar consulta: "+e.getMessage());
        }
        //Connector.getIstance().shutdown();
        return status;
    }
    
     /**
     * @return update - retorna verdadeiro se as informações forem atualizadas, caso contrário falso.
     * @param entity - Classe modelo com as informações.
     * @param id - id do registro.
     */
    @Override
    public boolean update(Produto entity, int id) {
        boolean status=false;
        String sql = "UPDATE produtos SET ON nome = ? , preco = ? , items = ? WHERE id = ?";
        try{
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, entity.getNome());
                ps.setDouble(2, entity.getPreco());
                ps.setString(3,entity.getIgredientes());
                ps.setInt(4, entity.getId());
                int rowsInserted = ps.executeUpdate();
                if(rowsInserted >0){
                    status=true;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error ao executar consulta: "+e.getMessage());
        }
        //Connector.getIstance().shutdown();
        return status;
    }
    
     /**
     * @return save - retorna verdadeiro se as informações forem deletadas, caso contrário falso.
     * @param entity - Classe modelo com as informações.
     * @param nome - nome do produto que você queira buscar.
     */
    @Override
    public boolean update(Produto entity, String nome) {
        boolean status=false;
        String sql = "UPDATE produtos SET ON nome = ? , preco = ? , items = ? WHERE nome LIKE ?";
        try{
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, entity.getNome());
                ps.setDouble(2, entity.getPreco());
                ps.setString(3, entity.getIgredientes());
                ps.setString(4, nome);
                int rowsInserted = ps.executeUpdate();
                if(rowsInserted >0){
                    status=true;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error ao executar consulta: "+e.getMessage());
        }
        //Connector.getIstance().shutdown();
        return status;
    }
    
    /**
     * @return save - retorna verdadeiro se as informações forem deletadas, caso contrário falso.
     * @param id - id do registro.
     */
    @Override
    public boolean delete(int id) {
        boolean status=false;
        String sql = "DELETE FROM produtos WHERE id = ?";
        try{
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                int rowInserted = ps.executeUpdate();
                if(rowInserted > 0){
                    status=true;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error ao executar consulta: "+e.getMessage());
        }
        //Connector.getIstance().shutdown();
        return status;
    }

    /**
     * @return save - retorna verdadeiro se as informações forem deletadas, caso contrário falso.
     * @param nome - nome do produto que você queira buscar.
     */
    @Override
    public boolean delete(String nome) {
        boolean status=false;
        String sql = "DELETE FROM produtos WHERE nome = ?";
        try{
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1,nome);
                int rowInserted = ps.executeUpdate();
                if(rowInserted > 0){
                    status=true;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error ao executar consulta: "+e.getMessage());
        }
        //Connector.getIstance().shutdown();
        return status;
    }

    /**
     * @return getAll - retorna uma lista de produtos.
     */
    @Override
    public List<Produto> getAll(){
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos";
        try{
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    Produto produto = new Produto();
                    produto.setId(rs.getInt("id"));
                    produto.setNome(rs.getString("nome"));
                    produto.setPreco(rs.getDouble("preco"));
                    produto.setIgredientes(rs.getString("items"));
                    produtos.add(produto);
                }
            }
        }
        catch(SQLException e){
            System.out.println("Houve um Error:" + e.getMessage());
        }
        Connector.getIstance().shutdown();
        return produtos;
    }
    
    /**
     * @param nome - nome do produto que você queira retorna.
     * @return get - retorna um produto especifico.
     */
    @Override
    public Produto get(String nome) {
        Produto produto = null;
        String sql = "SELECT * FROM produtos WHERE nome = ?";
        try {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, nome);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    produto = new Produto();
                    produto.setId(rs.getInt("id"));
                    produto.setNome(rs.getString("nome"));
                    produto.setPreco(rs.getDouble("preco"));
                    produto.setIgredientes(rs.getString("items"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Houve um erro: " + e.getMessage());
        }
        Connector.getIstance().shutdown();
        return produto;
    }

    /**
     * @param id - código id do produto que você quer retornar.
     * @return get - retorna o produto em questão.
     */
    @Override
    public Produto get(int id) {
        Produto produto = null;
        String sql = "SELECT * FROM produtos WHERE id = ?";
        try {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    produto = new Produto();
                    produto.setId(rs.getInt("id"));
                    produto.setNome(rs.getString("nome"));
                    produto.setPreco(rs.getDouble("preco"));
                    produto.setIgredientes(rs.getString("items"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Houve um erro: " + e.getMessage());
        }
        //Connector.getIstance().shutdown();
        return produto;
    }
    
}
