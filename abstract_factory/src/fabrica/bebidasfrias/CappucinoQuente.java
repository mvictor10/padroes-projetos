/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.bebidasfrias;


import abstracts.BebidaQuente;
import java.util.Arrays;
import prices.Precos;

/**
 *
 * @author mvictor
 */
public class CappucinoQuente extends BebidaQuente{
    public CappucinoQuente(){
        nome = "Cappucino Quente";
        preco = Precos.cappucino_quente;
        ingredientes = Arrays.asList("Café em Pó", "Chocolate em Pó", "Leite em Pó","Açucar", "Creme de Leite", "Leite Condesado", "Água Quente");
    }
}
