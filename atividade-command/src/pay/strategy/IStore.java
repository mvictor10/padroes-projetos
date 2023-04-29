/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay.strategy;

import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author mvictor
 * @param <T> - Modelo generico.
 */
public interface IStore <T>{
      void addItemToCart(T entity);
      void removeItemToCart(T entity);
      void removeItemToCart(int id);
      List<String>getDescricao();
      void cleanCart();
      List<T>getAll();
      boolean isEmpty();
      void checkout(JFrame frame, PaymentStrategy paymentStrategy);
}
