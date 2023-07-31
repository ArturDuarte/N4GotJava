package br.com.artcomp.wiew;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.BorderFactory;

/**
 *
 * @author Artur
 */
public class Principal extends javax.swing.JFrame {

    
    public Principal() {

        initComponents();

        this.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel1.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel2.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel8.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.setIconImage(this.getIconImage());
        this.Pesquisa.setBackground(new Color(9, 73, 110));
        this.Pesquisa.setFont(new Font("Square721 BT", 1, 14));
        this.Pesquisa.setForeground(new Color(255, 255, 255));
        this.Pesquisa.setToolTipText("");
        this.Pesquisa.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
        this.Pesquisa.setCaretColor(new Color(255, 255, 255));
        this.Pesquisa.setDisabledTextColor(new Color(255, 255, 255));
        this.Pesquisa.setOpaque(false);
        this.Pesquisa.setSelectionColor(new Color(9, 73, 110));

        TelaTabela TabInt = new TelaTabela();
        this.jDesktopPane1.add(TabInt).setVisible(true);

    }

    @Override
    public final Image getIconImage() {
        Image icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("br/com/artcomp/imagens/n4got50.png"));
        return icon;
    }      //        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jBMinimisar = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        Pesquisa = new javax.swing.JTextField();
        kGradientPanel8 = new com.k33ptoo.components.KGradientPanel();
        btolhar2 = new br.com.artcomp.cell.ActionButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setBackground(new java.awt.Color(255, 102, 0));
        kGradientPanel1.setkBorderRadius(15);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 102, 0));
        kGradientPanel1.setkGradientFocus(180);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 102, 0));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setName(""); // NOI18N
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBMinimisar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jBMinimisar.setForeground(new java.awt.Color(255, 255, 255));
        jBMinimisar.setText("-");
        jBMinimisar.setToolTipText("FECHAR");
        jBMinimisar.setBorder(null);
        jBMinimisar.setBorderPainted(false);
        jBMinimisar.setContentAreaFilled(false);
        jBMinimisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBMinimisar.setFocusPainted(false);
        jBMinimisar.setFocusable(false);
        jBMinimisar.setRolloverEnabled(false);
        jBMinimisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMinimisarActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jBMinimisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 40, 30));

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
        kGradientPanel1.add(jBFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 30, 30));

        kGradientPanel2.setBackground(new java.awt.Color(255, 102, 0));
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 102, 0));
        kGradientPanel2.setkStartColor(new java.awt.Color(170, 68, 0));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kButton3.setText("Novo Objeto");
        kButton3.setBorderPainted(false);
        kButton3.setFocusPainted(false);
        kButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton3.setkBackGroundColor(new java.awt.Color(0, 255, 255));
        kButton3.setkBorderRadius(20);
        kButton3.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton3.setkFillButton(false);
        kButton3.setkHoverColor(new java.awt.Color(255, 0, 0));
        kButton3.setkHoverEndColor(new java.awt.Color(255, 102, 0));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 102, 0));
        kButton3.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton3.setkIndicatorColor(new java.awt.Color(0, 255, 255));
        kButton3.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton3.setkStartColor(new java.awt.Color(255, 102, 0));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 166, 125, 70));

        kButton4.setText("Configurar");
        kButton4.setBorderPainted(false);
        kButton4.setFocusPainted(false);
        kButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton4.setkBackGroundColor(new java.awt.Color(0, 255, 255));
        kButton4.setkBorderRadius(20);
        kButton4.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton4.setkFillButton(false);
        kButton4.setkHoverColor(new java.awt.Color(255, 0, 0));
        kButton4.setkHoverEndColor(new java.awt.Color(255, 102, 0));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 102, 0));
        kButton4.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton4.setkIndicatorColor(new java.awt.Color(0, 255, 255));
        kButton4.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton4.setkStartColor(new java.awt.Color(255, 102, 0));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 254, 125, 70));

        kButton5.setText("Extras");
        kButton5.setBorderPainted(false);
        kButton5.setFocusPainted(false);
        kButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton5.setkBackGroundColor(new java.awt.Color(0, 255, 255));
        kButton5.setkBorderRadius(20);
        kButton5.setkEndColor(new java.awt.Color(255, 255, 255));
        kButton5.setkFillButton(false);
        kButton5.setkHoverColor(new java.awt.Color(255, 0, 0));
        kButton5.setkHoverEndColor(new java.awt.Color(255, 102, 0));
        kButton5.setkHoverForeGround(new java.awt.Color(255, 102, 0));
        kButton5.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        kButton5.setkIndicatorColor(new java.awt.Color(0, 255, 255));
        kButton5.setkPressedColor(new java.awt.Color(255, 255, 255));
        kButton5.setkStartColor(new java.awt.Color(255, 102, 0));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 342, 124, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/artcomp/imagens/engren.png"))); // NOI18N
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 30, 40));

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 680));

        Pesquisa.setBackground(new java.awt.Color(30, 30, 30));
        Pesquisa.setFont(new java.awt.Font("Square721 BT", 1, 14)); // NOI18N
        Pesquisa.setForeground(new java.awt.Color(255, 255, 255));
        Pesquisa.setToolTipText("");
        Pesquisa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        Pesquisa.setCaretColor(new java.awt.Color(255, 255, 255));
        Pesquisa.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Pesquisa.setSelectionColor(new java.awt.Color(9, 73, 110));
        Pesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PesquisaFocusLost(evt);
            }
        });
        Pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesquisaMouseClicked(evt);
            }
        });
        Pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PesquisaKeyPressed(evt);
            }
        });
        kGradientPanel1.add(Pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 270, 40));

        kGradientPanel8.setkBorderRadius(20);
        kGradientPanel8.setkEndColor(new java.awt.Color(170, 68, 0));
        kGradientPanel8.setkStartColor(new java.awt.Color(170, 68, 0));

        btolhar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/artcomp/imagens/lupa25.png"))); // NOI18N
        btolhar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btolhar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel8Layout = new javax.swing.GroupLayout(kGradientPanel8);
        kGradientPanel8.setLayout(kGradientPanel8Layout);
        kGradientPanel8Layout.setHorizontalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel8Layout.createSequentialGroup()
                .addGap(0, 284, Short.MAX_VALUE)
                .addComponent(btolhar2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kGradientPanel8Layout.setVerticalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btolhar2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        kGradientPanel1.add(kGradientPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 320, 35));

        jDesktopPane1.setBackground(new java.awt.Color(255, 102, 0));
        jDesktopPane1.setDoubleBuffered(true);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        kGradientPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 760, 580));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/artcomp/imagens/Nfrogot25.png"))); // NOI18N
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 110, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Artur Cristina Duarte Junior");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 220, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bem Vindo");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(970, 680));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBMinimisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMinimisarActionPerformed

        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jBMinimisarActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed

        TelaCadastroInt cad = new TelaCadastroInt();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(cad).setVisible(true);
        

    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
       TelaConfigInt conf = new TelaConfigInt();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(conf).setVisible(true);
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
       
        TelaExtraInt ext = new TelaExtraInt();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(ext).setVisible(true);
    }//GEN-LAST:event_kButton5ActionPerformed

    private void PesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisaKeyPressed

    }//GEN-LAST:event_PesquisaKeyPressed

    private void PesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisaMouseClicked

    }//GEN-LAST:event_PesquisaMouseClicked

    private void PesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PesquisaFocusLost

    }//GEN-LAST:event_PesquisaFocusLost

    private void PesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PesquisaFocusGained

    }//GEN-LAST:event_PesquisaFocusGained

    private void btolhar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btolhar2ActionPerformed
       
    }//GEN-LAST:event_btolhar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pesquisa;
    private br.com.artcomp.cell.ActionButton btolhar2;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBMinimisar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel8;
    // End of variables declaration//GEN-END:variables

}
