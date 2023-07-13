/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.artcomp.wiew;

import br.com.artcomp.controller.VerificaSenha;
import br.com.artcomp.model.Objetos;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;

/**
 *
 * @author Artur
 */
public class TelaEditar extends javax.swing.JFrame {

    String T = "";

    public TelaEditar() {
        initComponents();

        
        this.JTNome.setBackground(new Color(9, 73, 110));
        this.JTNome.setFont(new Font("Square721 BT", 1, 14));
        this.JTNome.setForeground(new Color(255, 255, 255));
        this.JTNome.setToolTipText("");
        this.JTNome.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        this.JTNome.setCaretColor(new Color(255, 255, 255));
        this.JTNome.setDisabledTextColor(new Color(255, 255, 255));
        this.JTNome.setOpaque(false);
        this.JTNome.setSelectionColor(new Color(9, 73, 110));

        this.JTSobNome.setBackground(new Color(9, 73, 110));
        this.JTSobNome.setFont(new Font("Square721 BT", 1, 14));
        this.JTSobNome.setForeground(new Color(255, 255, 255));
        this.JTSobNome.setToolTipText("");
        this.JTSobNome.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        this.JTSobNome.setCaretColor(new Color(255, 255, 255));
        this.JTSobNome.setDisabledTextColor(new Color(255, 255, 255));
        this.JTSobNome.setOpaque(false);
        this.JTSobNome.setSelectionColor(new Color(9, 73, 110));

        this.JTLogin.setBackground(new Color(9, 73, 110));
        this.JTLogin.setFont(new Font("Square721 BT", 1, 14));
        this.JTLogin.setForeground(new Color(255, 255, 255));
        this.JTLogin.setToolTipText("");
        this.JTLogin.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        this.JTLogin.setCaretColor(new Color(255, 255, 255));
        this.JTLogin.setDisabledTextColor(new Color(255, 255, 255));
        this.JTLogin.setOpaque(false);
        this.JTLogin.setSelectionColor(new Color(9, 73, 110));

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
        this.kGradientPanel2.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel3.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel4.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel5.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel6.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        
        
        kGradientPanel5.setVisible(false);
       
        
    }

    public void mostraDados(String nome, String palavraChave, String login, String senha) {
        
        JTNome.setText(nome);
        JTSobNome.setText(palavraChave);
        JTLogin.setText(login);
        T = senha;
        JTSenha.setText("********");
        JTSenha.setEditable(false);       
        System.out.println("o valor de senha  " + senha);
    }

   public void atualizaDados(){
       this.dispose();
       JTSenha.setVisible(false);
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        btolhar1 = new br.com.artcomp.cell.ActionButton();
        jBFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btolhar = new br.com.artcomp.cell.ActionButton();
        JTNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTSobNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        JTLogin = new javax.swing.JTextField();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        JTSenha = new javax.swing.JTextField();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel6 = new com.k33ptoo.components.KGradientPanel();
        JTSenha2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setBackground(new java.awt.Color(255, 102, 0));
        kGradientPanel1.setkBorderRadius(15);
        kGradientPanel1.setkEndColor(new java.awt.Color(195, 79, 1));
        kGradientPanel1.setkGradientFocus(200);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 102, 0));
        kGradientPanel1.setName(""); // NOI18N
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btolhar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/artcomp/imagens/Itens.png"))); // NOI18N
        btolhar1.setFocusable(false);
        btolhar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btolhar1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btolhar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 40, -1));

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
        kGradientPanel1.add(jBFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/artcomp/imagens/camera.png"))); // NOI18N
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, 100));

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 102, 0));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 102, 0));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login");
        kGradientPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha");
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, 30));

        btolhar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/artcomp/imagens/olho.png"))); // NOI18N
        btolhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btolharActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btolhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 40, 40));

        JTNome.setBackground(new java.awt.Color(30, 30, 30));
        JTNome.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTNome.setForeground(new java.awt.Color(255, 255, 255));
        JTNome.setToolTipText("");
        JTNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JTNome.setCaretColor(new java.awt.Color(255, 255, 255));
        JTNome.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTNome.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel2.add(JTNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 360, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sobre Nome");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 120, 20));

        JTSobNome.setBackground(new java.awt.Color(30, 30, 30));
        JTSobNome.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTSobNome.setForeground(new java.awt.Color(255, 255, 255));
        JTSobNome.setToolTipText("");
        JTSobNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JTSobNome.setCaretColor(new java.awt.Color(255, 255, 255));
        JTSobNome.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTSobNome.setSelectionColor(new java.awt.Color(9, 73, 110));
        JTSobNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTSobNomeActionPerformed(evt);
            }
        });
        kGradientPanel2.add(JTSobNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 360, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 20));

        kGradientPanel3.setkBorderRadius(30);
        kGradientPanel3.setkEndColor(new java.awt.Color(170, 68, 0));
        kGradientPanel3.setkStartColor(new java.awt.Color(170, 68, 0));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTLogin.setBackground(new java.awt.Color(30, 30, 30));
        JTLogin.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTLogin.setForeground(new java.awt.Color(255, 255, 255));
        JTLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTLogin.setToolTipText("");
        JTLogin.setBorder(null);
        JTLogin.setCaretColor(new java.awt.Color(255, 255, 255));
        JTLogin.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTLogin.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel3.add(JTLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 40));

        kGradientPanel2.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 300, 38));

        kGradientPanel4.setkBorderRadius(30);
        kGradientPanel4.setkEndColor(new java.awt.Color(170, 68, 0));
        kGradientPanel4.setkStartColor(new java.awt.Color(170, 68, 0));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTSenha.setBackground(new java.awt.Color(30, 30, 30));
        JTSenha.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTSenha.setForeground(new java.awt.Color(255, 255, 255));
        JTSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTSenha.setText("***************");
        JTSenha.setToolTipText("");
        JTSenha.setBorder(null);
        JTSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        JTSenha.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTSenha.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel4.add(JTSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 280, 40));

        kGradientPanel2.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 300, 38));

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 490, 280));

        kGradientPanel5.setkEndColor(new java.awt.Color(255, 102, 0));
        kGradientPanel5.setkStartColor(new java.awt.Color(255, 102, 0));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel6.setkBorderRadius(30);
        kGradientPanel6.setkEndColor(new java.awt.Color(170, 68, 0));
        kGradientPanel6.setkStartColor(new java.awt.Color(170, 68, 0));
        kGradientPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTSenha2.setBackground(new java.awt.Color(30, 30, 30));
        JTSenha2.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTSenha2.setForeground(new java.awt.Color(255, 255, 255));
        JTSenha2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTSenha2.setToolTipText("");
        JTSenha2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JTSenha2.setCaretColor(new java.awt.Color(255, 255, 255));
        JTSenha2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTSenha2.setSelectionColor(new java.awt.Color(9, 73, 110));
        JTSenha2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTSenha2KeyPressed(evt);
            }
        });
        kGradientPanel6.add(JTSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 40));

        kGradientPanel5.add(kGradientPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 108, 260, 38));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Digite sua senha ! ");
        kGradientPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 53, 180, 20));

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
        kGradientPanel5.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 176, -1, 50));

        kGradientPanel1.add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 490, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed

        this.dispose();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void JTSobNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTSobNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTSobNomeActionPerformed

    private void btolharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btolharActionPerformed

        kGradientPanel2.setVisible(false);
        kGradientPanel5.setVisible(true);
        

    }//GEN-LAST:event_btolharActionPerformed

    private void btolhar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btolhar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btolhar1ActionPerformed

    private void JTSenha2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTSenha2KeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            VerificaSenha vs = new VerificaSenha();
            if (vs.VerificaSenha(JTSenha2.getText())) {

                JTSenha.setText(T);
                kGradientPanel2.setVisible(false);
                kGradientPanel1.setVisible(true);
            } else {
                System.out.println("erro da senha");
            }

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_JTSenha2KeyPressed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed

        VerificaSenha vs = new VerificaSenha();
        if (vs.VerificaSenha(JTSenha2.getText())) {

            JTSenha.setText(T);
            kGradientPanel5.setVisible(false);
            kGradientPanel2.setVisible(true);
        } else {
            System.out.println("erro da senha");
        }

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
            java.util.logging.Logger.getLogger(TelaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTLogin;
    private javax.swing.JTextField JTNome;
    private javax.swing.JTextField JTSenha;
    private javax.swing.JTextField JTSenha2;
    private javax.swing.JTextField JTSobNome;
    private br.com.artcomp.cell.ActionButton btolhar;
    private br.com.artcomp.cell.ActionButton btolhar1;
    private javax.swing.JButton jBFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel6;
    // End of variables declaration//GEN-END:variables
}
