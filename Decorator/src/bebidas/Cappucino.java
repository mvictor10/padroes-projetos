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
public class Cappucino extends Bebida{
    public Cappucino(){
        this.descricao = "Cappucino";
    }


    @Override
    public double getPreco() {
        return 4.50;
    }
}
