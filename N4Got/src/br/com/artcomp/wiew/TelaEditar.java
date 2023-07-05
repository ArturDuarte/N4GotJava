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
        
        this.JTSenha1.setBackground(new Color(9, 73, 110));
        this.JTSenha1.setFont(new Font("Square721 BT", 1, 14));
        this.JTSenha1.setForeground(new Color(255, 255, 255));
        this.JTSenha1.setToolTipText("");
        this.JTSenha1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        this.JTSenha1.setCaretColor(new Color(255, 255, 255));
        this.JTSenha1.setDisabledTextColor(new Color(255, 255, 255));
        this.JTSenha1.setOpaque(false);
        this.JTSenha1.setSelectionColor(new Color(9, 73, 110));
        this.JTSenha1.setVisible(true);
        
        this.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel1.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel3.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel4.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));

        mostraDados();
        
    }

    public void mostraDados() {

        Objetos ob = new Objetos();
        JTNome.setText(ob.getNome());
        JTSobNome.setText(ob.getPalavraChave());
        JTLogin.setText(ob.getLogin());
        
        JTSenha.setText("********");
        JTSenha.setEditable(false);
        JTSenha1.setText(ob.getSenha());
        System.out.println("o valor de senha  " + ob.getSenha());
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
        JTNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTSobNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        JTLogin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btolhar = new br.com.artcomp.cell.ActionButton();
        JTSenha1 = new javax.swing.JTextField();
        JTSenha = new javax.swing.JTextField();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();

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

        JTNome.setBackground(new java.awt.Color(30, 30, 30));
        JTNome.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTNome.setForeground(new java.awt.Color(255, 255, 255));
        JTNome.setToolTipText("");
        JTNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JTNome.setCaretColor(new java.awt.Color(255, 255, 255));
        JTNome.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTNome.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel1.add(JTNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 360, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sobre Nome");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 120, 20));

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
        kGradientPanel1.add(JTSobNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 360, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, 20));

        kButton2.setText("Gravar");
        kButton2.setBorderPainted(false);
        kButton2.setFocusPainted(false);
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
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, -1, -1));

        kGradientPanel3.setkBorderRadius(30);
        kGradientPanel3.setkEndColor(new java.awt.Color(170, 68, 0));
        kGradientPanel3.setkStartColor(new java.awt.Color(170, 68, 0));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        kGradientPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 260, 30));

        kGradientPanel4.setkBorderRadius(30);
        kGradientPanel4.setkEndColor(new java.awt.Color(170, 68, 0));
        kGradientPanel4.setkStartColor(new java.awt.Color(170, 68, 0));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTLogin.setBackground(new java.awt.Color(30, 30, 30));
        JTLogin.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTLogin.setForeground(new java.awt.Color(255, 255, 255));
        JTLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTLogin.setToolTipText("");
        JTLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JTLogin.setCaretColor(new java.awt.Color(255, 255, 255));
        JTLogin.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTLogin.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel4.add(JTLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 30));

        kGradientPanel1.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 260, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, 20));

        btolhar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/artcomp/imagens/olho.png"))); // NOI18N
        btolhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btolharActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btolhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 30, 30));

        JTSenha1.setBackground(new java.awt.Color(30, 30, 30));
        JTSenha1.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTSenha1.setForeground(new java.awt.Color(255, 255, 255));
        JTSenha1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTSenha1.setText("***************");
        JTSenha1.setToolTipText("");
        JTSenha1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JTSenha1.setCaretColor(new java.awt.Color(255, 255, 255));
        JTSenha1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTSenha1.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel1.add(JTSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 30));

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
        kGradientPanel1.add(JTSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 240, 30));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 450, 290));

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

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton2ActionPerformed

    private void JTSobNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTSobNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTSobNomeActionPerformed

    private void btolharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btolharActionPerformed

        TelaSenha ts = new TelaSenha();  
        
        ts.setVisible(true);

    }//GEN-LAST:event_btolharActionPerformed

    private void btolhar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btolhar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btolhar1ActionPerformed

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
    private javax.swing.JTextField JTSenha1;
    private javax.swing.JTextField JTSobNome;
    private br.com.artcomp.cell.ActionButton btolhar;
    private br.com.artcomp.cell.ActionButton btolhar1;
    private javax.swing.JButton jBFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    // End of variables declaration//GEN-END:variables
}
