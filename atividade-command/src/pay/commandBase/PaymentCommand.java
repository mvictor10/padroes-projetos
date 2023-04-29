/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay.commandBase;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pay.command.ICommand;
import pay.strategy.PaymentStrategy;
import pay.strategy.ShoppingCart;

/**
 *
 * @author mvictor
 */

public class PaymentCommand implements ICommand {
    private final PaymentStrategy paymentStrategy;
    private final ShoppingCart shoppingCart;
    
    
    public PaymentCommand(PaymentStrategy paymentStrategy, ShoppingCart shoppingCart) {
        this.paymentStrategy = paymentStrategy;
        this.shoppingCart = shoppingCart;
    }
    
    @Override
    public void executar(JFrame frame) {
        paymentStrategy.pay(frame, shoppingCart.getTotal());
    }
}
