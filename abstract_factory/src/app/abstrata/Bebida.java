/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.abstrata;

import java.util.List;

/**
 *
 * @author mvictor
 */
public abstract class Bebida {
    protected String nome;
    protected double preco;
    protected List<String> ingredientes;
    
    public String getNome(){ return nome;}
    public double getPreco(){return preco;}
    public List<String> getIngredientes(){ return ingredientes;}
}
