/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.artcomp.wiew;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;

/**
 *
 * @author artco
 */
public class TelaSenha extends javax.swing.JFrame {

    /**
     * Creates new form TelaMostrar
     */
    public TelaSenha() {
        initComponents();

       
        
        this.JTSenha.setBackground(new Color(9, 73, 110));
        this.JTSenha.setFont(new Font("Square721 BT", 1, 14));
        this.JTSenha.setForeground(new Color(255, 255, 255));
        this.JTSenha.setToolTipText("");
        this.JTSenha.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        this.JTSenha.setCaretColor(new Color(255, 255, 255));
        this.JTSenha.setDisabledTextColor(new Color(255, 255, 255));
        this.JTSenha.setOpaque(false);
        this.JTSenha.setSelectionColor(new Color(9, 73, 110));
        
        this.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel1.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel3.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jBFechar = new javax.swing.JButton();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        JTSenha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setBackground(new java.awt.Color(255, 102, 0));
        kGradientPanel1.setkBorderRadius(15);
        kGradientPanel1.setkEndColor(new java.awt.Color(195, 79, 1));
        kGradientPanel1.setkGradientFocus(200);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 102, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBFechar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBFechar.setForeground(new java.awt.Color(255, 255, 255));
        jBFechar.setText("x");
        jBFechar.setToolTipText("FECHAR");
        jBFechar.setBorder(null);
        jBFechar.setBorderPainted(false);
        jBFechar.setContentAreaFilled(false);
        jBFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBFechar.setFocusPainted(false);
        jBFechar.setFocusable(false);
        jBFechar.setRolloverEnabled(false);
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jBFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 30, 30));

        kGradientPanel3.setkBorderRadius(30);
        kGradientPanel3.setkEndColor(new java.awt.Color(170, 68, 0));
        kGradientPanel3.setkStartColor(new java.awt.Color(170, 68, 0));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTSenha.setBackground(new java.awt.Color(30, 30, 30));
        JTSenha.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTSenha.setForeground(new java.awt.Color(255, 255, 255));
        JTSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTSenha.setText("***************");
        JTSenha.setToolTipText("");
        JTSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JTSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        JTSenha.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTSenha.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel3.add(JTSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 30));

        kGradientPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 260, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Digite sua senha ! ");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 180, 20));

        kButton2.setText("Descriptografar");
        kButton2.setBorderPainted(false);
        kButton2.setFocusPainted(false);
        kButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kButton2.setkBackGroundColor(new java.awt.Color(0, 255, 255));
        kButton2.setkBorderRadius(20);
        kButton2.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton2.setkFillButton(false);
        kButton2.setkHoverColor(new java.awt.Color(255, 0, 0));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 102, 0));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 102, 0));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton2.setkIndicatorColor(new java.awt.Color(0, 255, 255));
        kButton2.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(255, 102, 0));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed

        this.dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTSenha;
    private javax.swing.JButton jBFechar;
    private javax.swing.JLabel jLabel7;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    // End of variables declaration//GEN-END:variables
}
