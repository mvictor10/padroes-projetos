/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componente;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

public class JOptionCustom {
    
    private static JDialog dialog;
    private static JPanel panel;
    private static JPanel buttonPanel;
    private static JLabel label;
    private static JButton okButton;
    private static JButton cancelButton;
    private static JFormattedTextField textField;
    private static JTextField txtfield;
    private static MaskFormatter maskFormatter = null;
    private static final Dimension dim = new Dimension(500, 300);
   
    
    /**
     * @return showPopup - exibe um Popup e retorna o valor digitado dentro dele.
     * @param parent - JFrame que está associado a esse popup.
     * @param titulo - titulo do popup.
     * @param message - corpo de mensagem do popup.
     */
    public static String showPopup(JFrame parent, String titulo, String message) {
        //txtfield
        txtfield = new javax.swing.JTextField();
        txtfield.setColumns(10);
        
        // Cria um JDialog personalizado com a mensagem e o campo de entrada de texto
        dialog = new javax.swing.JDialog(parent, true);
        dialog.setTitle(titulo);
        //dialog.setMaximumSize(dim);
        dialog.setSize(dim);
        panel = new javax.swing.JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel.setSize(dim);
        label = new javax.swing.JLabel(message, SwingConstants.CENTER);
        Font font = label.getFont();
        label.setFont(font.deriveFont(Font.BOLD));
        panel.add(label, BorderLayout.NORTH);
        panel.add(txtfield, BorderLayout.CENTER);

        // Cria um painel com os botões OK e Cancelar
        buttonPanel = new javax.swing.JPanel(new FlowLayout(FlowLayout.CENTER));
        okButton = new javax.swing.JButton("OK");
        cancelButton = new javax.swing.JButton("Cancelar");
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);

        // Adiciona o painel de botões ao painel principal
        panel.add(buttonPanel, BorderLayout.SOUTH);

        // Define o tamanho do JDialog
        dialog.getContentPane().setLayout(new BorderLayout());
        dialog.getContentPane().add(panel, BorderLayout.CENTER);
        dialog.pack();
        dialog.setLocationRelativeTo(parent);

        // Cria um listener para o botão OK
         okButton.addActionListener((ActionEvent e) -> {
            dialog.dispose();
         });

        // Cria um listener para o botão Cancelar
        cancelButton.addActionListener((ActionEvent e) -> {
            txtfield.setText(null);
            dialog.dispose();
        });

        // Exibe o JDialog
        dialog.setVisible(true);
        // Retorna o valor inserido pelo usuário ou null se a janela for fechada
        return  txtfield.getText() != null ? txtfield.getText() : null;
    }
    /**
     * @return showPopup - exibe um Popup e retorna o valor digitado dentro dele.
     * @param parent - JFrame que está associado a esse popup.
     * @param titulo - titulo do popup.
     * @param message - corpo de mensagem do popup.
     * @param mask - mascará de input.
    */
    public static String showPopup(JFrame parent, String titulo, String message, String mask) {
        // Cria um JFormattedTextField com a máscara fornecida
        try {
            maskFormatter = new MaskFormatter(mask);
            textField = new JFormattedTextField(maskFormatter);
            textField.setColumns(10);

            // Cria um JDialog personalizado com a mensagem e o campo de entrada de texto
            dialog = new JDialog(parent, true);
            dialog.setTitle(titulo);
            //dialog.setMaximumSize(dim);
            dialog.setSize(dim);
            panel = new JPanel(new BorderLayout());
            panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            panel.setSize(dim);
            label = new JLabel(message, SwingConstants.CENTER);
            Font font = label.getFont();
            label.setFont(font.deriveFont(Font.BOLD));
            panel.add(label, BorderLayout.NORTH);
            panel.add(textField, BorderLayout.CENTER);

            // Cria um painel com os botões OK e Cancelar
            buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            okButton = new JButton("OK");
            cancelButton = new JButton("Cancelar");
            buttonPanel.add(okButton);
            buttonPanel.add(cancelButton);

            // Adiciona o painel de botões ao painel principal
            panel.add(buttonPanel, BorderLayout.SOUTH);

            // Define o tamanho do JDialog
            dialog.getContentPane().setLayout(new BorderLayout());
            dialog.getContentPane().add(panel, BorderLayout.CENTER);
            dialog.pack();
            dialog.setLocationRelativeTo(parent);

            // Cria um listener para o botão OK
            okButton.addActionListener((ActionEvent e) -> {
                dialog.dispose();
            });

            // Cria um listener para o botão Cancelar
            cancelButton.addActionListener((ActionEvent e) -> {
                textField.setValue(null); // Limpa o campo de texto
                dialog.dispose();
            });

            // Exibe o JDialog
            dialog.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(JOptionCustom.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Retorna o valor inserido pelo usuário ou null se a janela for fechada
        return textField.getValue() != null ? textField.getValue().toString() : null;
    }
    
    /**
     * @return showPopup - exibe um Popup e retorna o valor digitado dentro dele.
     * @param parent - JFrame que está associado a esse popup.
     * @param titulo - titulo do popup.
     * @param message - corpo de mensagem do popup.
     */
    public static int InputDialog(JFrame parent, String titulo, String message) {
        NumberFormat format = NumberFormat.getInstance();
        format.setGroupingUsed(false); // don't use commas or dots as grouping separators
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(1);
        formatter.setMaximum(30);
        formatter.setAllowsInvalid(false); // don't allow invalid values
        formatter.setCommitsOnValidEdit(true); // commit edits on valid values
        // Cria um JFormattedTextField com a máscara fornecida
        // Cria um JFormattedTextField com a máscara fornecida
        textField = new JFormattedTextField(formatter);
        textField.setColumns(10);
        try {
            maskFormatter = new MaskFormatter("##");
            // Cria um JDialog personalizado com a mensagem e o campo de entrada de texto
            dialog = new JDialog(parent, true);
            dialog.setTitle(titulo);
            dialog.setSize(dim);
            panel = new JPanel(new BorderLayout());
            panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            panel.setSize(dim);
            label = new JLabel(message, SwingConstants.CENTER);
            Font font = label.getFont();
            label.setFont(font.deriveFont(Font.BOLD));
            panel.add(label, BorderLayout.NORTH);
            panel.add(textField, BorderLayout.CENTER);

            // Cria um painel com os botões OK e Cancelar
            buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            okButton = new JButton("OK");
            cancelButton = new JButton("Cancelar");
            buttonPanel.add(okButton);
            buttonPanel.add(cancelButton);

            // Adiciona o painel de botões ao painel principal
            panel.add(buttonPanel, BorderLayout.SOUTH);

            // Define o tamanho do JDialog
            dialog.getContentPane().setLayout(new BorderLayout());
            dialog.getContentPane().add(panel, BorderLayout.CENTER);
            dialog.pack();
            dialog.setLocationRelativeTo(parent);

            // Cria um listener para o botão OK
            okButton.addActionListener((ActionEvent e) -> {
                dialog.dispose();
            });

            // Cria um listener para o botão Cancelar
            cancelButton.addActionListener((ActionEvent e) -> {
                textField.setValue(null); // Limpa o campo de texto
                dialog.dispose();
            });

            // Exibe o JDialog
            dialog.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(JOptionCustom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int valor = 0;
        if(textField.getValue()!= null && !textField.getValue().toString().isEmpty()){
            valor = Integer.parseInt(textField.getValue().toString());
        }
        // Retorna o valor inserido pelo usuário ou null se a janela for fechada
        return valor;
    }
    
    /**
     * @return showPopup - exibe um Popup e retorna o valor digitado dentro dele.
     * @param parent - JFrame que está associado a esse popup.
     * @param titulo - titulo do popup.
     * @param message - corpo de mensagem do popup.
     */
     public static int showPopupPassword(JFrame parent, String titulo, String message) {
        NumberFormat format = NumberFormat.getInstance();
        format.setGroupingUsed(false); // don't use commas or dots as grouping separators
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(1);
        formatter.setMaximum(9999);
        formatter.setAllowsInvalid(false); // don't allow invalid values
        formatter.setCommitsOnValidEdit(true); // commit edits on valid values
        // Cria um JFormattedTextField com a máscara fornecida
        // Cria um JFormattedTextField com a máscara fornecida
        textField = new JFormattedTextField(formatter);
        textField.setColumns(10);
        try {
            maskFormatter = new MaskFormatter("####");
            // Cria um JDialog personalizado com a mensagem e o campo de entrada de texto
            dialog = new JDialog(parent, true);
            dialog.setTitle(titulo);
            dialog.setSize(dim);
            panel = new JPanel(new BorderLayout());
            panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
            panel.setSize(dim);
            label = new JLabel(message, SwingConstants.CENTER);
            Font font = label.getFont();
            label.setFont(font.deriveFont(Font.BOLD));
            panel.add(label, BorderLayout.NORTH);
            panel.add(textField, BorderLayout.CENTER);

            // Cria um painel com os botões OK e Cancelar
            buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            okButton = new JButton("OK");
            cancelButton = new JButton("Cancelar");
            buttonPanel.add(okButton);
            buttonPanel.add(cancelButton);

            // Adiciona o painel de botões ao painel principal
            panel.add(buttonPanel, BorderLayout.SOUTH);

            // Define o tamanho do JDialog
            dialog.getContentPane().setLayout(new BorderLayout());
            dialog.getContentPane().add(panel, BorderLayout.CENTER);
            dialog.pack();
            dialog.setLocationRelativeTo(parent);

            // Cria um listener para o botão OK
            okButton.addActionListener((ActionEvent e) -> {
                dialog.dispose();
            });

            // Cria um listener para o botão Cancelar
            cancelButton.addActionListener((ActionEvent e) -> {
                textField.setValue(null); // Limpa o campo de texto
                dialog.dispose();
            });

            // Exibe o JDialog
            dialog.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(JOptionCustom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int valor = 0;
        if(textField.getValue()!= null && !textField.getValue().toString().isEmpty()){
            valor = Integer.parseInt(textField.getValue().toString());
        }
        // Retorna o valor inserido pelo usuário ou null se a janela for fechada
        return valor;
    }
    
}

