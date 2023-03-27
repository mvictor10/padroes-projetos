/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.app.gerence;

import br.app.abstracts.BebidasPrototype;
import br.app.cafe.CafePrototype;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mvictor
 */
public class GerenciarBebidas {
    private final static Map<String,BebidasPrototype> prototipos = new HashMap<>();
    
    static{
        prototipos.put("cafe",new CafePrototype("Café", Arrays.asList("Café", "Açucar", "Água"), 1.50));
        prototipos.put("cappucino",new CafePrototype("Cappucino", Arrays.asList("Café", "Açucar", "Leite", "Chocolate"), 4.50));
        prototipos.put("cha",new CafePrototype("Chá", Arrays.asList("Essencia de Chá", "Açucar", "Água"), 2.0));
        prototipos.put("chocolate",new CafePrototype("Chocolate", Arrays.asList("Achocolatado", "Açucar", "Água"), 3.50));
    }
    
    public static BebidasPrototype getPrototipo(String nome){
        BebidasPrototype prototipo = prototipos.get(nome);
        if(prototipo != null){
            return prototipo.clonar();
        }
        return null;
    }
    
    public static void adicionarPrototipo(String nome, BebidasPrototype prototipo){
        prototipos.put(nome, prototipo);
    }
}
