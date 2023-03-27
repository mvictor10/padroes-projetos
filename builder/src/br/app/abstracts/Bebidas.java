/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.abstracts;

import java.util.List;

/**
 *
 * @author mvictor
 */
public class Bebidas {

    private final String nome;
    private final List<String> items;
    private final double preco;
    
    public Bebidas(String nome, List<String> items, double preco){
        this.nome = nome;
        this.items = items;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getItems() {
        return items;
    }

    public double getPreco() {
        return preco;
    }
    
}
