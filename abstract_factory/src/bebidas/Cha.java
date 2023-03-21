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
public class Cha extends Bebida{
    public Cha(){
       nome = "Chá";
       preco = 1.0f;
       ingredientes = Arrays.asList("Essencia de Chá em Pó", "Açucar", "Água");
    }
}
