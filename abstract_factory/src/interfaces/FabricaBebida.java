/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import br.app.abstracts.Bebida;

/**
 *
 * @author mvictor
 */
public interface FabricaBebida {
    Bebida criarBebidaQuente();
    Bebida criarBebidaGelada();
}
