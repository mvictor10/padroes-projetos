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
 * Classe que  configura o pagamento via cartão de credito.
 * @author mvictor
 */
public class CreditCardPaymentStrategy implements PaymentStrategy {
    private final String cardNumber;
    private final String expirationDate;
    private final String cvv;
    private final int numero_parcelas;
    private final int senha;
    
    /**
     * Método que seta as informações referentes ao cartão de crédito.
     * @param  cardNumber - Número do cartão de crédito.
     * @param  expirationDate = Data de expiração do CC.
     * @param cvv - Código de segurança do cartão.
     * @param numero_parcelas - número de parcelas.
     * @param senha - número da senha.
     */
    public CreditCardPaymentStrategy(String cardNumber, String expirationDate, String cvv, int numero_parcelas, int senha) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.numero_parcelas = numero_parcelas;
        this.senha = senha;
    }
    
    /**
     * Metódo que seta Contexto do JFrame e valor da compra.
     * @param  frame - tela principal do App.
     * @param amount - valor da compra.
     */
    @Override
    public void pay(JFrame frame, double amount) {
        JOptionPane.showMessageDialog(frame, "Pagamento com cartão de crédito no valor de R$" + amount + " foi realizado com sucesso.");
    }
}

