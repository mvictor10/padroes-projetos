/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas.cha;


import app.abstrata.Bebida;
import java.util.ArrayList;
import prices.Precos;

/**
 *
 * @author mvictor
 */
public class ChaGelado extends Bebida {

    public ChaGelado() {
        this.nome = "Chá Gelado";
        this.preco = Precos.cappucino_quente;
        this.ingredientes = new ArrayList<>();
        ingredientes.add("Chá em Pó");
        ingredientes.add("Gelo");
        ingredientes.add("Açucar");
        ingredientes.add("Água");
    }
    
}
