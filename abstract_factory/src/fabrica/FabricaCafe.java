/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import bebidas.cafe.CafeGelado;
import bebidas.cafe.CafeQuente;
import app.abstrata.Bebida;
import app.interfaces.FabricaBebida;

/**
 *
 * @author mvictor
 */
public class FabricaCafe implements FabricaBebida{

    @Override
    public Bebida criarBebidaQuente() {
        return new CafeQuente();
    }

    @Override
    public Bebida criarBebidaGelada() {
        return new CafeGelado();
    }
    
}
