/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.abstractfactory.abstracts;

/**
 *
 * @author mvictor
 */
public abstract class Bebida {
    
    
    protected String description;
    protected double price;
    protected String[] ingredients;
    
    public String getDescription(){
        return description;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String[] getIngredients(){
        return ingredients;
    }
    
}
