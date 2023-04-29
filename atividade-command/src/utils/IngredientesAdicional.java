/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import interfaces.Bebida;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mvictor
 */
public class IngredientesAdicional implements Bebida
{
    
    private final Bebida bebida;
    private final String descricao;
    private final double preco;
    
    /**
     * Método construto - Ingredientes Adicional.
     * @param  bebida - Instancia da Bebida.
     * @param descricao - descrição da Bebida.
     * @param preco - preco da bebida.
     */
    public IngredientesAdicional(Bebida bebida, String descricao, double preco)
    {
        this.bebida = bebida;
        this.descricao = descricao;
        this.preco = preco;
        
    }
    
    /**
     * @return getDescricao - retorna a descrição da bebida. (Ingredientes).
     */
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + "\n[x] - " + descricao;
    }
    
    /**
     * @return getPreco - retorna o preço total da bebida. (Ingredientes).
     */
    @Override
    public double getPreco() {
        return bebida.getPreco() + preco;
    }

    
    
    
    
}
