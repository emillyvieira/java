/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aula10;

/**
 *
 * @author cg3028569
 */
public class EsporteFrame extends javax.swing.JFrame {

    /**
     * Creates new form EsporteFrame
     */
    public EsporteFrame() {
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

        checkBoxFutebol = new javax.swing.JCheckBox();
        checkBoxVolei = new javax.swing.JCheckBox();
        checkBoxTenis = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        checkBoxFutebol.setText("Futebol");
        checkBoxFutebol.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxFutebolItemStateChanged(evt);
            }
        });
        checkBoxFutebol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxFutebolActionPerformed(evt);
            }
        });

        checkBoxVolei.setText("Vôlei");
        checkBoxVolei.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxVoleiItemStateChanged(evt);
            }
        });
        checkBoxVolei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxVoleiActionPerformed(evt);
            }
        });

        checkBoxTenis.setText("Tênis");
        checkBoxTenis.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkBoxTenisItemStateChanged(evt);
            }
        });
        checkBoxTenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxTenisActionPerformed(evt);
            }
        });

        jLabel1.setText("Qual é seu esporte favorito?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(checkBoxTenis)
                    .addComponent(checkBoxVolei)
                    .addComponent(checkBoxFutebol))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(checkBoxFutebol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxVolei)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxTenis)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxFutebolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxFutebolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxFutebolActionPerformed

    private void checkBoxVoleiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxVoleiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxVoleiActionPerformed

    private void checkBoxTenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxTenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxTenisActionPerformed

    private void checkBoxFutebolItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxFutebolItemStateChanged
        // TODO add your handling code here:
        String conteudo = jLabel1.getText();
        String texto = " " + checkBoxFutebol.getText() + ",";
        
        if (checkBoxFutebol.isSelected()) {
            jLabel1.setText(conteudo + texto);
        }
        else {
            conteudo = conteudo.replace(texto, "");
            jLabel1.setText(conteudo);
        }
    }//GEN-LAST:event_checkBoxFutebolItemStateChanged

    private void checkBoxVoleiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxVoleiItemStateChanged
        // TODO add your handling code here
        String conteudo = jLabel1.getText();
        String texto = " " + checkBoxVolei.getText() + ",";
        
        if (checkBoxVolei.isSelected()) {
            jLabel1.setText(conteudo + texto);
        }
        else {
            conteudo = conteudo.replace(texto, "");
            jLabel1.setText(conteudo);
        }
    }//GEN-LAST:event_checkBoxVoleiItemStateChanged

    private void checkBoxTenisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkBoxTenisItemStateChanged
        // TODO add your handling code here:
        String conteudo = jLabel1.getText();
        String texto = " " + checkBoxTenis.getText() + ",";
        
        if (checkBoxTenis.isSelected()) {
            jLabel1.setText(conteudo + texto);
        }
        else {
            conteudo = conteudo.replace(texto, "");
            jLabel1.setText(conteudo);
        }
    }//GEN-LAST:event_checkBoxTenisItemStateChanged

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
            java.util.logging.Logger.getLogger(EsporteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EsporteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EsporteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EsporteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EsporteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBoxFutebol;
    private javax.swing.JCheckBox checkBoxTenis;
    private javax.swing.JCheckBox checkBoxVolei;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
