/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aula09;

import javax.swing.JOptionPane;

/**
 *
 * @author cg3028569
 */
public class RadioButtonJFrame extends javax.swing.JFrame {

    /**
     * Creates new form RadioButtonJFrame
     */
    public RadioButtonJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        radiokmms = new javax.swing.JRadioButton();
        radiomskm = new javax.swing.JRadioButton();
        converter = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor:");

        valor.setOpaque(true);
        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });

        radiokmms.setText("km/h para m/s");
        radiokmms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiokmmsActionPerformed(evt);
            }
        });

        radiomskm.setText("m/s para km/h");
        radiomskm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiomskmActionPerformed(evt);
            }
        });

        converter.setText("CONVERTER");
        converter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                converterMouseClicked(evt);
            }
        });
        converter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converterActionPerformed(evt);
            }
        });

        resultado.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        resultado.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radiomskm)
                    .addComponent(radiokmms)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(77, 77, 77)
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(converter)
                        .addGap(41, 41, 41)
                        .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(radiokmms)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radiomskm)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(converter)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void radiokmmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiokmmsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiokmmsActionPerformed

    private void radiomskmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiomskmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiomskmActionPerformed

    private void converterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_converterActionPerformed

    private void converterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_converterMouseClicked
        // TODO add your handling code here:
        float res = Float.parseFloat(valor.getText()) /3.6f;
        if (radiokmms.isSelected()) {
            
        }
        JOptionPane.showMessageDialog(null, "O resultado é " + String.format("%.2f", res) + "m/s", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        jLabel4.setText(String.format("%.2f", res));
    }//GEN-LAST:event_converterMouseClicked

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
            java.util.logging.Logger.getLogger(RadioButtonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadioButtonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadioButtonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioButtonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadioButtonJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton converter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton radiokmms;
    private javax.swing.JRadioButton radiomskm;
    private javax.swing.JLabel resultado;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
