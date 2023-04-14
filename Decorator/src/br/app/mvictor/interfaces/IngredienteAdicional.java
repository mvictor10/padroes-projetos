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
public class IngredienteAdicional implements Bebida{

    Bebida bebida;
    String descricao;
    double preco;
    
    public IngredienteAdicional(Bebida bebida, String descricao, double preco){
        this.bebida = bebida;
        this.descricao = descricao;
        this.preco = preco;
    }
    
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + " \n " + descricao;
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + preco;
    }
    
}
