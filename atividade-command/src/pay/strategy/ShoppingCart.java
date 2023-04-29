/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay.strategy;


import java.util.ArrayList;
import java.util.List;
import model.produto.Produto;

/**
 *
 * @author mvictor
 */
public final class ShoppingCart implements IShoppingCart <Produto> {
    private final List<Produto> produtos = new ArrayList<>();     
    @Override
    public void addProduct(Produto entity) {
        produtos.add(entity);
    }
    @Override
    public double getTotal() {
        double total=0;
        total = produtos.stream().map((produto) -> produto.getPreco()).reduce(total, (accumulator, _item) -> accumulator + _item);
        return total;
    }
    @Override
    public List<Produto> getProducts() {
        return produtos;
    }
    @Override
    public void removeProduct(Produto entity) {
        produtos.remove(entity);
    }

    @Override
    public void removeProduto(int id) {
        produtos.remove(id);
    }

    @Override
    public void cleanProducts() {
        produtos.removeAll(produtos);
    }
    
    @Override
    public List<String> getDescricao(List<Produto>produtos) {
        List<String> nomes = new ArrayList<>();
        produtos.forEach((produto) -> {
            nomes.add(produto.getNome());
        });
        return nomes;
    }

    @Override
    public List<Double> getPreco(List<Produto> produtos) {
        List<Double> preco = new ArrayList<>();
        produtos.forEach((produto) -> {
            preco.add(produto.getPreco());
        });
        return preco;
    }

    @Override
    public boolean isEmpty() {
        return produtos.isEmpty();
    }

   
}
