/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import bebidas.cappucino.CappucinoGelado;
import bebidas.cappucino.CappucinoQuente;
import br.app.abstracts.Bebida;
import app.interfaces.FabricaBebida;



/**
 *
 * @author mvictor
 */
public class FabricaCappucino implements FabricaBebida{

    @Override
    public Bebida criarBebidaQuente() {
        return new CappucinoQuente();
    }

    @Override
    public Bebida criarBebidaGelada() {
        return new CappucinoGelado();
    }

}
