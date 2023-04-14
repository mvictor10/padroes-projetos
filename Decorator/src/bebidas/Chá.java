/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas;

import abstracts.Bebida;

/**
 *
 * @author mvictor
 */
public class Chá extends Bebida{
    public Chá(){
        this.descricao = "Chá";
    }


    @Override
    public double getPreco() {
        return 6.50;
    }
}
