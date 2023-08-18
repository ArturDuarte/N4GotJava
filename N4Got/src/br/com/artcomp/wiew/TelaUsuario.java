/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.artcomp.wiew;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author artco
 */
public class TelaUsuario extends javax.swing.JInternalFrame {

    
    public TelaUsuario() {
        initComponents();       
        
        this.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel1.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));         
        this.kGradientPanel7.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel2.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel4.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));         
        this.kGradientPanel3.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel5.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));

        this.setSize(760, 595);
        this.setLocation(0, 0);
        
        this.JTNome.setBackground(new Color(9, 73, 110));
        this.JTNome.setFont(new Font("Square721 BT", 1, 14));
        this.JTNome.setForeground(new Color(255, 255, 255));
        this.JTNome.setToolTipText("");
        this.JTNome.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        this.JTNome.setCaretColor(new Color(255, 255, 255));
        this.JTNome.setDisabledTextColor(new Color(255, 255, 255));
        this.JTNome.setOpaque(false);
        this.JTNome.setSelectionColor(new Color(9, 73, 110));
        
         this.JTLogin.setBackground(new Color(9, 73, 110));
        this.JTLogin.setFont(new Font("Square721 BT", 1, 14));
        this.JTLogin.setForeground(new Color(255, 255, 255));
        this.JTLogin.setToolTipText("");
        this.JTLogin.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        this.JTLogin.setCaretColor(new Color(255, 255, 255));
        this.JTLogin.setDisabledTextColor(new Color(255, 255, 255));
        this.JTLogin.setOpaque(false);
        this.JTLogin.setSelectionColor(new Color(9, 73, 110));
        
        this.JTEmail.setBackground(new Color(9, 73, 110));
        this.JTEmail.setFont(new Font("Square721 BT", 1, 14));
        this.JTEmail.setForeground(new Color(255, 255, 255));
        this.JTEmail.setToolTipText("");
        this.JTEmail.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        this.JTEmail.setCaretColor(new Color(255, 255, 255));
        this.JTEmail.setDisabledTextColor(new Color(255, 255, 255));
        this.JTEmail.setOpaque(false);
        this.JTEmail.setSelectionColor(new Color(9, 73, 110));
        
        this.JTDataNascimento.setBackground(new Color(9, 73, 110));
        this.JTDataNascimento.setFont(new Font("Square721 BT", 1, 14));
        this.JTDataNascimento.setForeground(new Color(255, 255, 255));
        this.JTDataNascimento.setToolTipText("");
        this.JTDataNascimento.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        this.JTDataNascimento.setCaretColor(new Color(255, 255, 255));
        this.JTDataNascimento.setDisabledTextColor(new Color(255, 255, 255));
        this.JTDataNascimento.setOpaque(false);
        this.JTDataNascimento.setSelectionColor(new Color(9, 73, 110));

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
        
        kGradientPanel7.setSize(740, 530);

        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);// remove a barra do JInternoFrame

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
        jBFechar1 = new javax.swing.JButton();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTDataNascimento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        JTLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        JTSenha = new javax.swing.JTextField();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel7 = new javax.swing.JLabel();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        JTSenha1 = new javax.swing.JTextField();

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
        kGradientPanel1.setkEndColor(new java.awt.Color(195, 79, 1));
        kGradientPanel1.setkGradientFocus(200);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 102, 0));
        kGradientPanel1.setName(""); // NOI18N
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        kGradientPanel2.setkBorderRadius(20);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 153, 51));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 102, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/artcomp/imagens/camera.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 130, 120));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data Nascimento");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        JTNome.setBackground(new java.awt.Color(30, 30, 30));
        JTNome.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTNome.setForeground(new java.awt.Color(255, 255, 255));
        JTNome.setToolTipText("");
        JTNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JTNome.setCaretColor(new java.awt.Color(255, 255, 255));
        JTNome.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTNome.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel1.add(JTNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 320, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        JTEmail.setBackground(new java.awt.Color(30, 30, 30));
        JTEmail.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTEmail.setForeground(new java.awt.Color(255, 255, 255));
        JTEmail.setToolTipText("");
        JTEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JTEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        JTEmail.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTEmail.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel1.add(JTEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 320, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        JTDataNascimento.setBackground(new java.awt.Color(30, 30, 30));
        JTDataNascimento.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        JTDataNascimento.setToolTipText("");
        JTDataNascimento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        JTDataNascimento.setCaretColor(new java.awt.Color(255, 255, 255));
        JTDataNascimento.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTDataNascimento.setSelectionColor(new java.awt.Color(9, 73, 110));
        JTDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTDataNascimentoActionPerformed(evt);
            }
        });
        kGradientPanel1.add(JTDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 170, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        kGradientPanel4.setkBorderRadius(30);
        kGradientPanel4.setkEndColor(new java.awt.Color(170, 68, 0));
        kGradientPanel4.setkStartColor(new java.awt.Color(170, 68, 0));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTLogin.setBackground(new java.awt.Color(30, 30, 30));
        JTLogin.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTLogin.setForeground(new java.awt.Color(255, 255, 255));
        JTLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTLogin.setToolTipText("");
        JTLogin.setBorder(null);
        JTLogin.setCaretColor(new java.awt.Color(255, 255, 255));
        JTLogin.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTLogin.setEnabled(false);
        JTLogin.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel4.add(JTLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 290, 40));

        kGradientPanel1.add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 310, 38));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

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
        JTSenha.setBorder(null);
        JTSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        JTSenha.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTSenha.setEnabled(false);
        JTSenha.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel3.add(JTSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 290, 40));

        kGradientPanel1.add(kGradientPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 310, 38));

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
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Senha");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        kGradientPanel5.setkBorderRadius(30);
        kGradientPanel5.setkEndColor(new java.awt.Color(170, 68, 0));
        kGradientPanel5.setkStartColor(new java.awt.Color(170, 68, 0));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTSenha1.setBackground(new java.awt.Color(30, 30, 30));
        JTSenha1.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        JTSenha1.setForeground(new java.awt.Color(255, 255, 255));
        JTSenha1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTSenha1.setText("***************");
        JTSenha1.setToolTipText("");
        JTSenha1.setBorder(null);
        JTSenha1.setCaretColor(new java.awt.Color(255, 255, 255));
        JTSenha1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTSenha1.setEnabled(false);
        JTSenha1.setSelectionColor(new java.awt.Color(9, 73, 110));
        kGradientPanel5.add(JTSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 290, 40));

        kGradientPanel1.add(kGradientPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 310, 38));

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

    private void jBFechar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFechar1ActionPerformed
        TelaTabela tab = new TelaTabela();
        getParent().add(tab);
        tab.setVisible(true);       
        this.dispose();
    }//GEN-LAST:event_jBFechar1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed

        

        // TODO add your handling code here:
    }//GEN-LAST:event_kButton2ActionPerformed

    private void JTDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTDataNascimentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTDataNascimento;
    private javax.swing.JTextField JTEmail;
    private javax.swing.JTextField JTLogin;
    private javax.swing.JTextField JTNome;
    private javax.swing.JTextField JTSenha;
    private javax.swing.JTextField JTSenha1;
    private javax.swing.JButton jBFechar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    public com.k33ptoo.components.KGradientPanel kGradientPanel7;
    // End of variables declaration//GEN-END:variables
}
