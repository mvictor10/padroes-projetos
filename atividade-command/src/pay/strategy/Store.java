package pay.strategy;

import java.util.List;
import javax.swing.JFrame;
import model.produto.Produto;
import pay.command.ICommand;
import pay.commandBase.PaymentCommand;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Class que adiciona items ao carrinho.
 * @author mvictor
 */
public final class Store implements IStore <Produto>{
    private final ShoppingCart shoppingCart = new ShoppingCart();
    
    /**
     * Método que adiciona o produto ao carinho de compra.
     * @param produto - descrição, preco e etc do produto.
     */
    @Override
    public void addItemToCart(Produto produto) {
        shoppingCart.addProduct(produto);
    }
    /**
     * verificar o pagamento.
     * @param frame - instancia do JFrame.
     * @param paymentStrategy - Foram de pagamento.
     */
    @Override
    public void checkout(JFrame frame, PaymentStrategy paymentStrategy) {
        ICommand paymentCommand = new PaymentCommand(paymentStrategy, shoppingCart);
        paymentCommand.executar(frame);
    }

    @Override
    public void removeItemToCart(Produto entity) {
        shoppingCart.removeProduct(entity);
    }
    @Override
    public void removeItemToCart(int id) {
        shoppingCart.removeProduto(id);
    }

    @Override
    public void cleanCart() {
        shoppingCart.cleanProducts();
    }

    @Override
    public List<Produto> getAll() {
        return shoppingCart.getProducts();
    }

    @Override
    public List<String> getDescricao() {
        return shoppingCart.getDescricao(shoppingCart.getProducts());
    }

    @Override
    public boolean isEmpty() {
        return shoppingCart.isEmpty();
    }

    
}
