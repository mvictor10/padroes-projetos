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
public class Chocolate extends Bebida{
    public Chocolate(){
        description = "Chocolate";
        price = 3.21;
        ingredients = new String[]{"Chocolate em Pó", "Leite", "Açuçar", "Água Quente"};
    }
}