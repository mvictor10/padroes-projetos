/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.diretor;

import br.app.abstracts.Bebidas;
import br.app.construct.BebidaBuilder;

/**
 *
 * @author mvictor
 */
public class BebidasDiretor {
    
    public static Bebidas montarCafe(){
        return new BebidaBuilder()
                .withNome("Café")
                .withPreco(1.50)
                .withItems("Água Quente", "Café em Pó", "Açucar")
                .build();
    }
    
    public static Bebidas montarCappucino(){
        return new BebidaBuilder()
                .withNome("Cappucino")
                .withPreco(4.50)
                .withItems("Café descafeinado", "Leite", "Chocolate", "Canela em Pó")
                .build();
    }
    
    public static Bebidas montarCha(){
        return new BebidaBuilder()
                .withNome("Chá")
                .withPreco(2.50)
                .withItems("Essencial de Chá", "Água Quente", "Açucar Mascavo")
                .build();
    }
    
    public static Bebidas montarChocolate(){
        return new BebidaBuilder()
                .withNome("Chocolate em Pó")
                .withPreco(5.50)
                .withItems("Achocolatado", "Leite")
                .build();
    }
}
