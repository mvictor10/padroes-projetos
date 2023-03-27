/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas.cafe;

import app.abstrata.Bebida;
import java.util.ArrayList;
import prices.Precos;

/**
 *
 * @author mvictor
 */
public class CafeGelado extends Bebida {

    public CafeGelado() {
        this.nome = "Café Gelado";
        this.preco = Precos.cafe_gelado;
        this.ingredientes = new ArrayList<>();
        ingredientes.add("Café em Pó");
        ingredientes.add("Água");
        ingredientes.add("Gelo");
        ingredientes.add("Leite Condesado");
    }
    
}
