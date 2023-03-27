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
public abstract class Bebida {
    private String nome;
    private List<String>items;
    private double preco;

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
