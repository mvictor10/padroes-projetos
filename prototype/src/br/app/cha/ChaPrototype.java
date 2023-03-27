/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.app.cha;

import br.app.abstracts.BebidasPrototype;
import java.util.List;

/**
 *
 * @author mvictor
 */
public class ChaPrototype extends BebidasPrototype {

    public ChaPrototype(String nome, List<String> items, double preco) {
        super(nome, items, preco);
    }

    @Override
    public BebidasPrototype clonar() {
        return new ChaPrototype(nome, items, preco);
    }
    
}
