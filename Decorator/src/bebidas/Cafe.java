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
public class Cafe extends Bebida{
    public Cafe(){
        this.descricao = "Café";
    }


    @Override
    public double getPreco() {
        return 2.50;
    }
}
