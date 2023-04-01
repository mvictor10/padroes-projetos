/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebida;

import java.util.ArrayList;
import java.util.List;
import modelo.Bebida;
import builder.BebidaInterface;

/**
 *
 * @author mvictor
 */
public class BebidaBuilder implements BebidaInterface{
    
    private String nome;
    private double preco;
    private List<String> ingredientes = new ArrayList<>();
    
    @Override
    public void buildNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void buildPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void buildIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public Bebida getBebida() {
        return new Bebida(nome, preco, ingredientes);
    }
    
}
