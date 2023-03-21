/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.abstractfactory.views;

import javax.swing.JOptionPane;

/**
 *
 * @author mvictor
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btncappucino = new javax.swing.JButton();
        btncoffe = new javax.swing.JButton();
        lblcha = new javax.swing.JLabel();
        lblcappucino = new javax.swing.JLabel();
        btncha = new javax.swing.JButton();
        lblcoffe1 = new javax.swing.JLabel();
        btnchocolate = new javax.swing.JButton();
        lblchocolate = new javax.swing.JLabel();
        lblsubtitle = new javax.swing.JLabel();
        lblnomestory = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vitão Coffe");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btncappucino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cappucino.png"))); // NOI18N
        btncappucino.setBorder(null);
        btncappucino.setBorderPainted(false);
        btncappucino.setContentAreaFilled(false);
        btncappucino.setFocusPainted(false);
        btncappucino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncappucinoActionPerformed(evt);
            }
        });

        btncoffe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cafe.png"))); // NOI18N
        btncoffe.setBorder(null);
        btncoffe.setBorderPainted(false);
        btncoffe.setContentAreaFilled(false);
        btncoffe.setFocusPainted(false);
        btncoffe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncoffeActionPerformed(evt);
            }
        });

        lblcha.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        lblcha.setText("Chá");

        lblcappucino.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        lblcappucino.setText("Cappucino");

        btncha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/chá.png"))); // NOI18N
        btncha.setBorder(null);
        btncha.setBorderPainted(false);
        btncha.setContentAreaFilled(false);
        btncha.setFocusPainted(false);
        btncha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchaActionPerformed(evt);
            }
        });

        lblcoffe1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        lblcoffe1.setText("Coffe");

        btnchocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/chocolate.png"))); // NOI18N
        btnchocolate.setBorder(null);
        btnchocolate.setBorderPainted(false);
        btnchocolate.setContentAreaFilled(false);
        btnchocolate.setFocusPainted(false);
        btnchocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchocolateActionPerformed(evt);
            }
        });

        lblchocolate.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        lblchocolate.setText("Chocolate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btncha, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncappucino, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblcappucino)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblcha)
                        .addGap(95, 95, 95))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(btncoffe, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(361, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(lblcoffe1)
                    .addContainerGap(423, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(btnchocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(359, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(lblchocolate)
                    .addContainerGap(395, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btncappucino, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblcappucino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncha, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcha)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(btncoffe, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(277, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(190, 190, 190)
                    .addComponent(lblcoffe1)
                    .addContainerGap(236, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(234, Short.MAX_VALUE)
                    .addComponent(btnchocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(67, 67, 67)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(403, Short.MAX_VALUE)
                    .addComponent(lblchocolate)
                    .addGap(23, 23, 23)))
        );

        lblsubtitle.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        lblsubtitle.setForeground(new java.awt.Color(255, 0, 0));
        lblsubtitle.setText("Clique no Icone para Efetuar A compra.");

        lblnomestory.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        lblnomestory.setText("Vitão Coffe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblsubtitle)
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(lblnomestory)
                    .addContainerGap(413, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblsubtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(lblnomestory)
                    .addContainerGap(561, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchaActionPerformed
        // TODO add your handling code here
        TelaCha tcha = new TelaCha();
        tcha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnchaActionPerformed

    private void btnchocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchocolateActionPerformed
        // TODO add your handling code here:
        TelaChocolate tchocolate = new TelaChocolate();
        tchocolate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnchocolateActionPerformed

    private void btncoffeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncoffeActionPerformed
        // TODO add your handling code here:
        TelaCoffe tcoffe = new TelaCoffe();
        tcoffe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncoffeActionPerformed

    private void btncappucinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncappucinoActionPerformed
        // TODO add your handling code here:
        TelaCappucino tcappucino = new TelaCappucino();
        tcappucino.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncappucinoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncappucino;
    private javax.swing.JButton btncha;
    private javax.swing.JButton btnchocolate;
    private javax.swing.JButton btncoffe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcappucino;
    private javax.swing.JLabel lblcha;
    private javax.swing.JLabel lblchocolate;
    private javax.swing.JLabel lblcoffe1;
    private javax.swing.JLabel lblnomestory;
    private javax.swing.JLabel lblsubtitle;
    // End of variables declaration//GEN-END:variables
}
