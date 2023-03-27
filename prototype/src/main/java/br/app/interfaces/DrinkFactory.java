/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.app.interfaces;

import br.app.abstracts.BebidasPrototype;
/**
 *
 * @author mvictor
 */
public interface DrinkFactory {
    public BebidasPrototype makeHotDrink();
    public BebidasPrototype makeColdDrink();
}
