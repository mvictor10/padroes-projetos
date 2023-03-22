/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas.cappucino;

import br.app.abstracts.Bebida;
import java.util.ArrayList;
import prices.Precos;

/**
 *
 * @author mvictor
 */
public class CappucinoGelado extends Bebida {

    public CappucinoGelado() {
        this.nome = "Cappucino Gelado";
        this.preco = Precos.cappucino_quente;
        this.ingredientes = new ArrayList<>();
        ingredientes.add("Café em Pó");
        ingredientes.add("Chocolate em Pó");
        ingredientes.add("Leite em Pó");
        ingredientes.add("Gelo");
        ingredientes.add("Água");
        ingredientes.add("Leite Condesado");
    }
    
}
