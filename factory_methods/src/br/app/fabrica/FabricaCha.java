/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.fabrica;

import br.app.interfaces.FabricaBebida;
import br.app.abstracts.Bebida;
import br.app.bebidas.Cha;
/**
 *
 * @author mvictor
 */
public class FabricaCha implements FabricaBebida{
    @Override
    public Bebida criarBebida(){
        return new Cha();
    }
}
