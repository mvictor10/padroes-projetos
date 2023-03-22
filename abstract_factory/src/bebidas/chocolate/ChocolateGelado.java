/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas.chocolate;

import app.abstrata.Bebida;
import java.util.ArrayList;
import prices.Precos;

/**
 *
 * @author mvictor
 */
public class ChocolateGelado extends Bebida {

    public ChocolateGelado() {
        this.nome = "Chocolate Gelado";
        this.preco = Precos.cappucino_quente;
        this.ingredientes = new ArrayList<>();
        ingredientes.add("Chocolate em Pó");
        ingredientes.add("Gelo");
        ingredientes.add("Leite");
        ingredientes.add("Chantili");
        ingredientes.add("Creme de Leite");
        ingredientes.add("Açucar");
    }
    
}
