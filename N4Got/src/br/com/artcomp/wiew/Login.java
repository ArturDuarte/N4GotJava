package br.com.artcomp.wiew;

//import br.com.artcomp.controller.VerificaLogin;
import br.com.artcomp.controller.VerificaLogin;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;

/**
 *
 * @author Artur Duarte
 */
public class Login extends javax.swing.JFrame {

    VerificaLogin verL;
    Principal princ;

    public Login() {

        initComponents();
        try {
            this.princ = new Principal();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.verL = new VerificaLogin();
        this.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel1.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.jButton2.setBackground(new Color(0, 0, 0, 150));
        this.setIconImage(this.getIconImage());
        jLErro.setVisible(false);

        //Login
        this.Login.setBackground(new Color(9, 73, 110));
        this.Login.setFont(new Font("Square721 BT", 1, 14));
        this.Login.setForeground(new Color(255, 255, 255));
        this.Login.setToolTipText("");
        this.Login.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        this.Login.setCaretColor(new Color(255, 255, 255));
        this.Login.setDisabledTextColor(new Color(255, 255, 255));
        this.Login.setOpaque(false);
        this.Login.setSelectionColor(new Color(9, 73, 110));
        this.jLLogin1.setVisible(false);

        //Senha
        this.Senha.setBackground(new Color(9, 73, 110));
        this.Senha.setFont(new Font("Square721 BT", 1, 14));
        this.Senha.setForeground(new Color(255, 255, 255));
        this.Senha.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255, 255, 255)));
        this.Senha.setCaretColor(new Color(255, 255, 255));
        this.Senha.setOpaque(false);
        this.Senha.setSelectionColor(new Color(9, 73, 110));
        jLPass1.setVisible(false);

    }

    public final Image getIconImage() {
        Image icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("br/com/artcomp/imagens/n4got50.png"));
        return icon;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        jLErro = new javax.swing.JLabel();
        jLLogin1 = new javax.swing.JLabel();
        jLLogin2 = new javax.swing.JLabel();
        Login = new javax.swing.JTextField();
        jLPass1 = new javax.swing.JLabel();
        jLPass2 = new javax.swing.JLabel();
        Senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkBorderRadius(30);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 102, 0));
        kGradientPanel1.setkGradientFocus(300);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("x");
        jButton2.setToolTipText("FECHAR");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setRolloverEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/artcomp/imagens/n4got100.png"))); // NOI18N
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 36, -1, 111));

        kButton1.setText("ENTRAR");
        kButton1.setBorderPainted(false);
        kButton1.setkBackGroundColor(new java.awt.Color(0, 255, 255));
        kButton1.setkBorderRadius(30);
        kButton1.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverColor(new java.awt.Color(255, 0, 0));
        kButton1.setkHoverEndColor(new java.awt.Color(255, 102, 0));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 51, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton1.setkIndicatorColor(new java.awt.Color(0, 255, 255));
        kButton1.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(255, 102, 0));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 170, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("1.0.1.122");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 396, -1, -1));

        jLErro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLErro.setForeground(new java.awt.Color(2, 71, 96));
        jLErro.setText("SENHA INCORRETA !!!");
        jLErro.setFocusable(false);
        kGradientPanel1.add(jLErro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 160, 20));

        jLLogin1.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLLogin1.setForeground(new java.awt.Color(255, 255, 255));
        jLLogin1.setText("Login");
        kGradientPanel1.add(jLLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLLogin2.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLLogin2.setForeground(new java.awt.Color(255, 255, 255));
        jLLogin2.setText("Login");
        kGradientPanel1.add(jLLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 25));

        Login.setBackground(new java.awt.Color(30, 30, 30));
        Login.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setToolTipText("");
        Login.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Login.setCaretColor(new java.awt.Color(255, 255, 255));
        Login.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Login.setSelectionColor(new java.awt.Color(9, 73, 110));
        Login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoginFocusLost(evt);
            }
        });
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginKeyPressed(evt);
            }
        });
        kGradientPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 170, 25));

        jLPass1.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLPass1.setForeground(new java.awt.Color(255, 255, 255));
        jLPass1.setText("Senha");
        kGradientPanel1.add(jLPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, 20));

        jLPass2.setFont(new java.awt.Font("Square721 BT", 1, 12)); // NOI18N
        jLPass2.setForeground(new java.awt.Color(255, 255, 255));
        jLPass2.setText("Senha");
        kGradientPanel1.add(jLPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, 25));

        Senha.setBackground(new java.awt.Color(30, 30, 30));
        Senha.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Senha.setCaretColor(new java.awt.Color(255, 255, 255));
        Senha.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Senha.setSelectionColor(new java.awt.Color(9, 73, 110));
        Senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SenhaMouseClicked(evt);
            }
        });
        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });
        Senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SenhaKeyPressed(evt);
            }
        });
        kGradientPanel1.add(Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 170, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked

        jLLogin2.setVisible(false);
        jLLogin1.setVisible(true);
        Login.setText(null);
        Senha.setText(null);
        jLErro.setVisible(false);
        // jLErro.setBackground(new Color(0, 113, 155, 150));
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginMouseClicked

    private void LoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            jLPass2.setVisible(false);
            jLPass1.setVisible(true);
            Senha.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginKeyPressed

    private void SenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SenhaMouseClicked

        jLPass2.setVisible(false);
        jLPass1.setVisible(true);
        Senha.setText(null);
        jLErro.setVisible(false);
        //jLErro.setBackground(new Color(0, 113, 155, 150));
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaMouseClicked

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaActionPerformed

    private void SenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SenhaKeyPressed

        if (evt.getKeyCode() == evt.VK_ENTER) {

            if (verL.verificaLogin(Login.getText(), new String(this.Senha.getPassword()))) {

                this.dispose();
                princ.setVisible(true);
                
            } else {
                jLErro.setForeground(new Color(255, 0, 0, 255));
                jLErro.setVisible(true);
            }
        }

    }//GEN-LAST:event_SenhaKeyPressed

    private void LoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginFocusGained

        jLLogin2.setVisible(false);
        jLLogin1.setVisible(true);
    }//GEN-LAST:event_LoginFocusGained

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        
        if (verL.verificaLogin(Login.getText(), new String(this.Senha.getPassword()))) {
            this.dispose();
            princ.setVisible(true);
            
        } else {
            jLErro.setForeground(new Color(255, 0, 0, 255));
            jLErro.setVisible(true);
        }

    }//GEN-LAST:event_kButton1ActionPerformed

    private void LoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginFocusLost

        jLPass2.setVisible(false);
        jLPass1.setVisible(true);
    }//GEN-LAST:event_LoginFocusLost

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Login;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLErro;
    private javax.swing.JLabel jLLogin1;
    private javax.swing.JLabel jLLogin2;
    private javax.swing.JLabel jLPass1;
    private javax.swing.JLabel jLPass2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
