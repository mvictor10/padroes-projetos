/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import modelo.Bebida;
import java.util.List;

/**
 *
 * @author mvictor
 */
public interface BebidaInterface {
    public void buildNome(String nome);
    public void buildPreco(double preco);
    public void buildIngredientes(List<String> ingredientes);
    public Bebida getBebida();
}
