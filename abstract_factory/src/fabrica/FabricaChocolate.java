/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import app.interfaces.FabricaBebida;
import bebidas.chocolate.ChocolateGelado;
import bebidas.chocolate.ChocolateQuente;
import br.app.abstracts.Bebida;





/**
 *
 * @author mvictor
 */
public class FabricaChocolate implements FabricaBebida{

    @Override
    public Bebida criarBebidaQuente() {
        return new ChocolateQuente();
    }

    @Override
    public Bebida criarBebidaGelada() {
        return new ChocolateGelado();
    }
}
