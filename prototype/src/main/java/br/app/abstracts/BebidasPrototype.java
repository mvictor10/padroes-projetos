/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.app.abstracts;

import java.util.List;

/**
 *
 * Class attributes drinks.
 * @author mvictor
 */
public abstract class BebidasPrototype {

    protected String nome;
    protected List<String> items;
    protected double preco;
    
    public BebidasPrototype(String nome, List<String> items, double preco){
        this.nome = nome;
        this.items = items;
        this.preco = preco;
    }
    
    public abstract BebidasPrototype clonar();
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the items
     */
    public List<String> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<String> items) {
        this.items = items;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
