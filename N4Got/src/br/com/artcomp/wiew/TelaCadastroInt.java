/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.artcomp.wiew;

import br.com.artcomp.controller.CadastroObjeto;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author artco
 */
public class TelaCadastroInt extends javax.swing.JInternalFrame {

    String imagem = "art";

    public TelaCadastroInt() {
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
        
        this.JTRepeteSenha.setBackground(new Color(9, 73, 110));
        this.JTRepeteSenha.setFont(new Font("Square721 BT", 1, 14));
        this.JTRepeteSenha.setForeground(new Color(255, 255, 255));
        this.JTRepeteSenha.setToolTipText("");
        this.JTRepeteSenha.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        this.JTRepeteSenha.setCaretColor(new Color(255, 255, 255));
        this.JTRepeteSenha.setDisabledTextColor(new Color(255, 255, 255));
        this.JTRepeteSenha.setOpaque(false);
        this.JTRepeteSenha.setSelectionColor(new Color(9, 73, 110));

        this.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel1.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel3.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel4.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel7.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel5.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));

        this.setSize(760, 595);
        this.setLocation(0, 0);

        kGradientPanel7.setSize(740, 530);

        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);// remove a barra do JInternoFrame

    }

    private void limpaDados() {
        JTNome.setText("");
        JTSobNome.setText("");
        JTLogin.setText("");
        JTSenha.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel7 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        JLImagem = new javax.swing.JLabel();
        JTNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTSobNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        JTLogin = new javax.swing.JTextField();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        JTSenha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBFechar1 = new javax.swing.JButton();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        JTRepeteSenha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 102, 0));
        setBorder(null);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(750, 590));

        kGradientPanel7.setkEndColor(new java.awt.Color(233, 93, 0));
        kGradientPanel7.setkGradientFocus(200);
        kGradientPanel7.setkStartColor(new java.awt.Color(233, 93, 0));
        kGradientPanel7.setkTransparentControls(false);

        kGradientPanel1.setBackground(new java.awt.Color(255, 102, 0));
        kGradientPanel1.setkBorderRadius(15);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 102, 0));
        kGradientPanel1.setkGradientFocus(200);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 102, 0));
        kGradientPanel1.setName(""); // NOI18N
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/artcomp/imagens/camera.png"))); // NOI18N
        kGradientPanel1.add(JLImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, 100));

        JTNome.setBackground(new java.awt.Color(30, 30, 30));
        JTNome.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTNome.setForeground(new java.awt.Color(255, 255, 255));
        JTNome.setToolTipText("");
        JTNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JTNome.setCaretColor(new java.awt.Color(255, 255, 255));
        JTNome.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTNome.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel1.add(JTNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 360, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descrição");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 120, 20));

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
        kGradientPanel1.add(JTSobNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 360, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, 20));

        kButton2.setText("Gravar");
        kButton2.setBorderPainted(false);
        kButton2.setFocusPainted(false);
        kButton2.setkBackGroundColor(new java.awt.Color(0, 255, 255));
        kButton2.setkBorderRadius(20);
        kButton2.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton2.setkFillButton(false);
        kButton2.setkHoverColor(new java.awt.Color(255, 0, 0));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 102, 0));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton2.setkIndicatorColor(new java.awt.Color(0, 255, 255));
        kButton2.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(255, 102, 0));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

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
        kGradientPanel4.add(JTLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 38));

        kGradientPanel1.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 260, 36));

        kGradientPanel3.setkBorderRadius(30);
        kGradientPanel3.setkEndColor(new java.awt.Color(170, 68, 0));
        kGradientPanel3.setkStartColor(new java.awt.Color(170, 68, 0));
        kGradientPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTSenha.setBackground(new java.awt.Color(30, 30, 30));
        JTSenha.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTSenha.setForeground(new java.awt.Color(255, 255, 255));
        JTSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTSenha.setToolTipText("");
        JTSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JTSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        JTSenha.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTSenha.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel3.add(JTSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 38));

        kGradientPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 260, 36));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, 20));

        jBFechar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jBFechar1.setForeground(new java.awt.Color(255, 255, 255));
        jBFechar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/artcomp/imagens/seta.png"))); // NOI18N
        jBFechar1.setToolTipText("FECHAR");
        jBFechar1.setBorder(null);
        jBFechar1.setBorderPainted(false);
        jBFechar1.setContentAreaFilled(false);
        jBFechar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBFechar1.setFocusPainted(false);
        jBFechar1.setFocusable(false);
        jBFechar1.setRolloverEnabled(false);
        jBFechar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFechar1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jBFechar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        kGradientPanel5.setkBorderRadius(30);
        kGradientPanel5.setkEndColor(new java.awt.Color(170, 68, 0));
        kGradientPanel5.setkStartColor(new java.awt.Color(170, 68, 0));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTRepeteSenha.setBackground(new java.awt.Color(30, 30, 30));
        JTRepeteSenha.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTRepeteSenha.setForeground(new java.awt.Color(255, 255, 255));
        JTRepeteSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTRepeteSenha.setToolTipText("");
        JTRepeteSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JTRepeteSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        JTRepeteSenha.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTRepeteSenha.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel5.add(JTRepeteSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 38));

        kGradientPanel1.add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 260, 36));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Repita Senha");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, 20));

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        setBounds(0, 0, 747, 590);
    }// </editor-fold>//GEN-END:initComponents

    private void btolhar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btolhar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btolhar1ActionPerformed

    private void JTSobNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTSobNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTSobNomeActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed

        CadastroObjeto co = new CadastroObjeto();

        if (co.cadastroObjeto(JTLogin.getText(), JTSenha.getText(), JTNome.getText(), JTSobNome.getText(), imagem)) {

            ColorJOptionPane op = new ColorJOptionPane(Color.red);
            op.showMessageDialog(null, "Gravação realizada com sucesso ");
            //instancia de uma classe fabrica
            TelaTabela tab = new TelaTabela();
            getParent().add(tab);
            tab.setVisible(true);
            limpaDados();
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Erro de Gravação ");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_kButton2ActionPerformed

    private void jBFechar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFechar1ActionPerformed
        TelaTabela tab = new TelaTabela();
        getParent().add(tab);
        tab.setVisible(true);
        limpaDados();
        this.dispose();
    }//GEN-LAST:event_jBFechar1ActionPerformed

    private void btolharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btolharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btolharActionPerformed

    private void btolhar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btolhar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btolhar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLImagem;
    private javax.swing.JTextField JTLogin;
    private javax.swing.JTextField JTNome;
    private javax.swing.JTextField JTRepeteSenha;
    private javax.swing.JTextField JTSenha;
    private javax.swing.JTextField JTSobNome;
    private javax.swing.JButton jBFechar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    public com.k33ptoo.components.KGradientPanel kGradientPanel7;
    // End of variables declaration//GEN-END:variables
}
