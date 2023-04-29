/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import interfaces.Bebida;

/**
 *
 * @author mvictor
 */
public class BebidaSimples implements Bebida{
    private String descricao;
    private double preco;
    
    public BebidaSimples(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }
    
    
    @Override
    public String getDescricao(){
        return descricao;
    }
    
    @Override
    public double getPreco(){
        return preco;
    }
}
