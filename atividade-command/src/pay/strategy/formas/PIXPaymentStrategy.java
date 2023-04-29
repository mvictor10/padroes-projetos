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
 * Classe que  configura o pagamento via PIX.
 * @author mvictor
 */
public class PIXPaymentStrategy implements PaymentStrategy {
    private final String codigo;
    private final String descricao;
    
    /**
     * Metódo que seta as  informações do pix - Código e Descrição.
     * @param codigo - Código Pix.
     * @param descricao - Descrição da Compra.
     */
    public PIXPaymentStrategy(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    /**
     * Metódo que seta Contexto do JFrame e valor da compra.
     * @param  frame - tela principal do App.
     * @param amount - valor da compra.
     */
    @Override
    public void pay(JFrame frame, double amount) {
        JOptionPane.showMessageDialog(frame, "Pagamento com PIX no valor de R$" + amount + " foi realizado com sucesso.");
    }
}

