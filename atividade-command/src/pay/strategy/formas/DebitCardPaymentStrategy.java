/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay.strategy.formas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pay.strategy.PaymentStrategy;

/**
 * Classe que  configura o pagamento via cartão de débito.
 * @author mvictor
 */
public class DebitCardPaymentStrategy implements PaymentStrategy {
    private final int senha;
    
    /**
     * Método que pega a senha do cartão de débito.
     * @param senha - senha do cartão.
     */
    public DebitCardPaymentStrategy(int senha) {
        this.senha = senha;
    }

    /**
     * Metódo que seta Contexto do JFrame e valor da compra.
     * @param  frame - tela principal do App.
     * @param amount - valor da compra.
     */
     @Override
    public void pay(JFrame frame, double amount) {
        JOptionPane.showMessageDialog(frame, "Pagamento com cartão de Débito no valor de R$" + amount + " foi realizado com sucesso.");
    }
}

