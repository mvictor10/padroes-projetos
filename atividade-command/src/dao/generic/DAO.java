/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.generic;

import java.util.List;

/**
 * Classe para criar Prototipos da classe DAO para cada contexto em questão.
 * @author mvictor
 * @param <T> - Entidade generica.
 */
public interface DAO <T>{
    boolean save(T entity);
    boolean update(T entity, int id);
    boolean update(T entity, String nome);
    boolean delete(int id);
    boolean delete(String nome);
    List<T> getAll();
    T get(String nome);
    T get(int id);
}
