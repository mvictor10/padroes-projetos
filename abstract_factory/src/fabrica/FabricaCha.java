/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import bebidas.cha.*;
import app.abstrata.Bebida;
import app.interfaces.FabricaBebida;

/**
 *
 * @author mvictor
 */
public class FabricaCha implements FabricaBebida{

    @Override
    public Bebida criarBebidaQuente() {
        return new ChaQuente();
    }

    @Override
    public Bebida criarBebidaGelada() {
        return new ChaGelado();
    }
    
}
