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
 * Classe que  configura o pagamento via dinheiro físico.
 * @author mvictor
 */
public class MoneyPaymentStrategy implements PaymentStrategy {

    private final String cpf;
    
    /**
     * Método que pega o número do Cpf da pessoa.
     * @param cpf - Cpf da pessoa.
     */
    public MoneyPaymentStrategy(String cpf) {
        this.cpf = cpf;
    }
    
    /**
     * Metódo que seta Contexto do JFrame e valor da compra.
     * @param  frame - tela principal do App.
     * @param amount - valor da compra.
     */
     @Override
    public void pay(JFrame frame, double amount) {
        JOptionPane.showMessageDialog(frame, "Pagamento em Dinheiro no valor de R$" + amount + " foi realizado com sucesso.");
    }
}

