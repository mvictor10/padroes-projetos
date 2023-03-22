/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.abstrata;

import java.util.List;

/**
 * Classe abstract Bebida
 * @author mvictor
 */
public abstract class Bebida {
    protected String nome;
    protected double preco;
    protected List<String> ingredientes;
    
    /**
     * @return retorna o nome da bebida.
     */
    public String getNome(){ return nome;}
    /**
     * @return retorna o preço da bebida
     */
    public double getPreco(){return preco;}
    /**
     * @return vetor ou lista de items do ingredientes.
     */
    public List<String> getIngredientes(){ return ingredientes;}
}
