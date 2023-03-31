/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas.cappucino;

import app.abstrata.Bebida;
import java.util.ArrayList;
import prices.Precos;

/**
 *
 * @author mvictor
 */
public class CappucinoQuente extends Bebida {

    public CappucinoQuente() {
        this.nome = "Cappucino Quente";
        this.preco = Precos.cappucino_quente;
        this.ingredientes = new ArrayList<>();
        ingredientes.add("Café em Pó");
        ingredientes.add("Chocolate em Pó");
        ingredientes.add("Leite Quente");
        ingredientes.add("Água");
        ingredientes.add("Leite Condesado");
    }
    
}
