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
public class CappucinoPrototype extends BebidasPrototype {

    public CappucinoPrototype(String nome, List<String> items, double preco) {
        super(nome, items, preco);
    }

    @Override
    public BebidasPrototype clonar() {
        return new CappucinoPrototype(nome, items, preco);
    }
    
}
