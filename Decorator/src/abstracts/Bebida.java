/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracts;

/**
 *
 * @author mvictor
 */
public abstract class Bebida {
   
    protected String descricao = "Bebida Desconhecida";
    
    public String getDescricao(){
        return descricao;
    }
    
    public abstract double getPreco();
}
