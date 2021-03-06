/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class Conversor extends javax.swing.JFrame {

    /**
     * Creates new form Conversor
     */
    public Conversor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlConversor = new javax.swing.JPanel();
        lbTemp = new javax.swing.JLabel();
        txtTemp = new javax.swing.JTextField();
        lbTextResultado = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        btnConverterC = new javax.swing.JButton();
        btnConverterF = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lbSimbolo = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor 1.0");

        lbTemp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTemp.setText("Temperatura:");

        txtTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempActionPerformed(evt);
            }
        });

        lbTextResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTextResultado.setText("A temperatura convertida fica:");

        lbResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnConverterC.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnConverterC.setText("Converter de Celsius para Fahrenheit");
        btnConverterC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterCActionPerformed(evt);
            }
        });

        btnConverterF.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnConverterF.setText("Converter de Fahrenheit para Celsius");
        btnConverterF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterFActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lbSimbolo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout pnlConversorLayout = new javax.swing.GroupLayout(pnlConversor);
        pnlConversor.setLayout(pnlConversorLayout);
        pnlConversorLayout.setHorizontalGroup(
            pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConversorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTemp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlConversorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTextResultado)
                .addGap(39, 39, 39)
                .addComponent(lbResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(pnlConversorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConverterC)
                .addGap(29, 29, 29)
                .addComponent(btnConverterF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlConversorLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(btnLimpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlConversorLayout.setVerticalGroup(
            pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConversorLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTemp)
                    .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbTextResultado))
                .addGap(19, 19, 19)
                .addGroup(pnlConversorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConverterC)
                    .addComponent(btnConverterF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConversor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlConversor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempActionPerformed

    private void btnConverterCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterCActionPerformed
        // Declarar Variaveis
        double temp, conversao;
        try {
        // Entradas
        temp = Double.parseDouble(txtTemp.getText().replaceAll(",", ","));
        
        // Processamento
        conversao = 9*temp/5 + 32;
        
        // Sa??da
        lbSimbolo.setText("??F");
        lbResultado.setText(String.valueOf(conversao).format("%.2f",conversao));
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Ops!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConverterCActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtTemp.setText(null);
        lbSimbolo.setText(null);
        lbResultado.setText(null);
        txtTemp.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnConverterFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterFActionPerformed
        // Declarar Variaveis
        double temp, conversao;
        try {
        // Entradas
        temp = Double.parseDouble(txtTemp.getText().replaceAll(",", ","));
        
        // Processamento
        conversao = (temp - 32) *5/9;
        
        // Sa??da
        lbSimbolo.setText("??C");
        lbResultado.setText(String.valueOf(conversao).format("%.2f",conversao));
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Ops!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConverterFActionPerformed

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
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConverterC;
    private javax.swing.JButton btnConverterF;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JLabel lbSimbolo;
    private javax.swing.JLabel lbTemp;
    private javax.swing.JLabel lbTextResultado;
    private javax.swing.JPanel pnlConversor;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables
}
