/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas;

import br.app.abstracts.Bebida;
import java.util.Arrays;

/**
 *
 * @author mvictor
 */
public class Chocolate extends Bebida{
    public Chocolate(){
       nome = "Chocolate";
       preco = 3.75f;
       ingredientes = Arrays.asList("Chocolate em Pó", "Açucar", "Água", "Leite");
    }
}
