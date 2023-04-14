/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidas;

import abstracts.Adicional;
import abstracts.Bebida;

/**
 *
 * @author mvictor
 */
public class CremeDeLeite extends Adicional{
    
    Bebida bebida;
    
    public CremeDeLeite(Bebida bebida){
        this.bebida = bebida;
    }


    @Override
    public double getPreco() {
        return 0.50 + bebida.getPreco();
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + "+ Creme de Leite";
    }
}
