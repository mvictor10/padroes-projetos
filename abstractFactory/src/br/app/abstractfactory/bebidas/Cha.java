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
public class Cha extends Bebida{
    public Cha(){
        description = "Chá";
        price = 1.50;
        ingredients = new String[]{"Chá em Pó","Açuçar", "Água Quente"};
    }
}