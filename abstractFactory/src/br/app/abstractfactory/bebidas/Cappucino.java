/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.abstractfactory.bebidas;

import br.app.abstractfactory.abstracts.Bebida;
/**
 *
 * @author mvictor
 */
public class Cappucino extends Bebida{
    public Cappucino(){
        description = "Cappucino";
        price = 4.00;
        ingredients = new String[]{"Café em Pó", "Leite", "Açuçar", "Água Quente"};
    }
}
