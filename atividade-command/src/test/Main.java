/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import base.Cafe;
import dao.produto.ProdutoDAO;
import database.Connector;
import interfaces.Bebida;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.produto.Produto;
import pay.strategy.PaymentStrategy;
import pay.strategy.Store;
import pay.strategy.formas.CreditCardPaymentStrategy;
import utils.IngredientesAdicional;

/**
 *
 * @author mvictor
 */
public class Main {
    
    public Main(){
        inicializar();
        
        
    }
    
    private void inicializar(){
        /*
        Bebida cafeComLeite = null;
        Bebida chocolate = null;
        String texto = "=========================================";
        cafeComLeite = new IngredientesAdicional(new IngredientesAdicional(new Cafe(), "Canela", 2.0), "Leite", 0.5);
        chocolate = new IngredientesAdicional(new IngredientesAdicional(new Cafe(), "Canela", 2.0), "Leite", 0.5);
        
        Store store = new Store();
        store.addItemToCart(cafeComLeite);
        store.addItemToCart(chocolate);
        store.addItemToCart(chocolate);
        store.addItemToCart(chocolate);
        
        
        PaymentStrategy paymentStrategy = new CreditCardPaymentStrategy("1234567890123456", "12/25", "123");
        store.checkout(paymentStrategy);
    */
     
        
        try {
            Connection conn = Connector.getIstance().getConexao();
            System.out.println(conn.getMetaData().getDatabaseProductName() + ":" + conn);
            ProdutoDAO dao = new ProdutoDAO();
            Produto produto = new Produto();
            produto.setNome("Arroz Doce");
            produto.setPreco(2.50);
            boolean status = dao.save(produto);
            if(status){
                System.out.println("Informações foram salvas com sucesso.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connector.getIstance().shutdown();
        
    }
        
    
    public static void main(String[] args){
        new Thread(){
            @Override
            public void run(){
                Main main;
                main = new Main();
            }
        }.start();
    }
    
}
