/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.interfaces;

import app.abstrata.Bebida;


/**
 *
 * @author mvictor
 */
public interface FabricaBebida {
    Bebida criarBebidaQuente();
    Bebida criarBebidaGelada();
}
