/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.abstractfactory;

import br.app.abstractfactory.bebidas.Cafe;
import br.app.abstractfactory.bebidas.fabrica.FabricaCafe;
import br.app.abstractfactory.bebidas.interfaces.FabricaBebidas;

/**
 *
 * @author mvictor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FabricaBebidas fabrica = new FabricaCafe();
        
    }
    
}
