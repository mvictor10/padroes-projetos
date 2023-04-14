/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.mvictor.interfaces;

/**
 *
 * @author mvictor
 */
public class BebidaBase implements Bebida{

    String descricao;
    double preco;
    
    public BebidaBase(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
    }
    
    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }
    
}
