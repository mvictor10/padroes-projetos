/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.construct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import br.app.abstracts.Bebida;

/**
 *
 * @author mvictor
 */
public class BebidaBuilder {
    
    private String nome;
    private double preco;
    private List<String> items = new ArrayList<>();
    
    public BebidaBuilder withNome(String nome){
        this.nome = nome;
        return this;
    }
    
    public BebidaBuilder withPreco(double preco){
        this.preco = preco;
        return this;
    }
    
    public BebidaBuilder withItems(String items){
        this.items.add(items);
        return this;
    } 
    
    public BebidaBuilder withItems(String... items){
        this.items.addAll(Arrays.asList(items));
        return this;
    }
    
    public Bebida build() {
        return new Bebida() {
            {
                this.nome = nome;
                this.preco = preco;
                this.items = items;
            }
        };
    }
        
}
