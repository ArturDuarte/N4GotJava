/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.artcomp.wiew;
import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author artco
 */
public class TelaConfigInt extends javax.swing.JInternalFrame {

    
    public TelaConfigInt() {
        initComponents();
        
        this.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel1.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));         
        this.kGradientPanel7.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));

        this.setSize(760, 595);
        this.setLocation(0, 0);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFechar1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    public com.k33ptoo.components.KGradientPanel kGradientPanel7;
    // End of variables declaration//GEN-END:variables
}
