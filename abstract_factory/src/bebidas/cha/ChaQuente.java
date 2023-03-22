/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas.cha;


import br.app.abstracts.Bebida;
import java.util.ArrayList;
import prices.Precos;

/**
 *
 * @author mvictor
 */
public class ChaQuente extends Bebida {

    public ChaQuente() {
        this.nome = "Chá Quente";
        this.preco = Precos.cappucino_quente;
        this.ingredientes = new ArrayList<>();
        ingredientes.add("Chá em Pó");
        ingredientes.add("Açucar");
        ingredientes.add("Água Quente");
    }
    
}
