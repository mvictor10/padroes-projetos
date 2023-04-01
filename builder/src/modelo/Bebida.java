/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author mvictor
 */
public class Bebida {
    
    private final String nome;
    private final double preco;
    private final List<String>ingredientes;
    
    public Bebida(String nome, double preco, List<String> ingredientes){
        this.nome = nome;
        this.preco = preco;
        this.ingredientes = ingredientes;
    }
    
    public String getNome(){ return nome;}
    public double getPreco(){ return preco;}
    public List<String> getIngredientes(){ return ingredientes;}
    
}
