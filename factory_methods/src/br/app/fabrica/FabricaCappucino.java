/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.fabrica;

import br.app.abstracts.Bebida;
import br.app.bebidas.Cappucino;
import br.app.interfaces.FabricaBebida;

/**
 *
 * @author mvictor
 */
public class FabricaCappucino implements FabricaBebida{
    @Override
    public Bebida criarBebida() {
        return new Cappucino();
    }
}
