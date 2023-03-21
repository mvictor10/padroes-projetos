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
public class Cafe extends Bebida{
    public Cafe(){
        description = "Café";
        price = 2.50;
        ingredients = new String[]{"Café em pó", "Açucar", "Água Quente"};
    }
}
