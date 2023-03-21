/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.abstractfactory.bebidas.fabrica;

import br.app.abstractfactory.abstracts.Bebida;
import br.app.abstractfactory.bebidas.Cafe;
import br.app.abstractfactory.bebidas.interfaces.FabricaBebidas;

/**
 *
 * @author mvictor
 */
public class FabricaCafe implements FabricaBebidas{

    @Override
    public Bebida criarBebida() {
        return new Cafe();
    }
    
}
