/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.bebida;

import br.app.build.BebidaBuilder;

/**
 *
 * @author mvictor
 */
public class CafeBuilder extends BebidaBuilder{

    @Override
    public void buildNome(String nome) {
       this.bebida.setNome(nome);
    }

    @Override
    public void buildPreco(double preco) {
        this.bebida.setPreco(preco);
    }

    
    @Override
    public void buildItems(String nome) {
        this.bebida.setNome(nome);
    }
    
}
