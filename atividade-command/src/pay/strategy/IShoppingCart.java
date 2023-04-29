/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay.strategy;

import java.util.List;
import model.produto.Produto;

/**
 *
 * @author mvictor
 * @param <T> - modelo generico.
 */
public interface IShoppingCart <T>{
    void addProduct(T entity);
    void removeProduct(T entity);
    void removeProduto(int id);
    void cleanProducts();
    double getTotal();
    boolean isEmpty();
    List<T> getProducts();
    List<String> getDescricao(List<Produto>produtos);
    List<Double> getPreco(List<Produto>produtos);
}
