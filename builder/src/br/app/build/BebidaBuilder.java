/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.build;

import br.app.produto.Bebida;

/**
 *
 * @author mvictor
 */
public abstract class BebidaBuilder{
    
    protected Bebida bebida;
    
    public BebidaBuilder(){
        bebida = new Bebida();
    }
    
    public abstract void buildNome(String nome);
    public abstract void buildPreco(double preco);
    public abstract void buildItems(String nome);
    
    public Bebida getBebida(){
        return bebida;
    }
}
