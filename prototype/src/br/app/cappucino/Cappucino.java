/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.app.cappucino;

import br.app.abstracts.BebidasPrototype;
import java.util.List;

/**
 *
 * @author mvictor
 */
public class Cappucino extends BebidasPrototype {

    public Cappucino(String nome, List<String> items, double preco) {
        super(nome, items, preco);
    }

    @Override
    public BebidasPrototype clonar() {
        return new Cappucino(nome, items, preco);
    }
    
}
