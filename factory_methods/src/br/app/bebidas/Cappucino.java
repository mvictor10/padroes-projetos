/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.bebidas;

import br.app.abstracts.Bebida;
import java.util.Arrays;

/**
 *
 * @author mvictor
 */
public class Cappucino extends Bebida{
    public Cappucino(){
       nome = "Cappucino";
       preco = 4.00f;
       ingredientes = Arrays.asList("Café em Pó", "Açucar", "Água", "Chocolate em Pó", "Leite em Pó");
    }
}
