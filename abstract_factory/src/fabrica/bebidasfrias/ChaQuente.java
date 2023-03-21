/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.bebidasfrias;



import abstracts.BebidaGelada;
import java.util.Arrays;
import prices.Precos;

/**
 *
 * @author mvictor
 */
public class ChaQuente extends BebidaGelada{
    public ChaQuente(){
        nome = "Chá Quente";
        preco = Precos.cha_quente;
        ingredientes = Arrays.asList("Café em Pó", "Açucar", "Água Gelada");
    }
}
