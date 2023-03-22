/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas.cafe;

import br.app.abstracts.Bebida;
import java.util.ArrayList;
import prices.Precos;

/**
 *
 * @author mvictor
 */
public class CafeQuente extends Bebida {

    public CafeQuente() {
        this.nome = "Café Quente";
        this.preco = Precos.cafe_quente;
        this.ingredientes = new ArrayList<>();
        ingredientes.add("Café em Pó");
        ingredientes.add("Água Quente");
        ingredientes.add("Açucar");
    }
    
}
