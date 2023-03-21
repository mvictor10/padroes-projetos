/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.bebidasquentes;

import abstracts.BebidaQuente;
import java.util.Arrays;
import prices.Precos;

/**
 *
 * @author mvictor
 */
public class ChocolateQuente extends BebidaQuente{
    public ChocolateQuente(){
        nome = "Café Quente";
        preco = Precos.chocolate_quente;
        ingredientes = Arrays.asList("Chocolate em Pó", "Leite em Pó", "Açucar", "Água Quente");
    }
}
