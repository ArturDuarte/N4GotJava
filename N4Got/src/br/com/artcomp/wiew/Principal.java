package br.com.artcomp.wiew;

import br.com.artcomp.cell.PintarCabecalho;
import br.com.artcomp.cell.TableActionCellEditor;
import br.com.artcomp.cell.TableActionCellRender;
import br.com.artcomp.cell.TableActionEvent;
import br.com.artcomp.controller.CarregaTabela;
import br.com.artcomp.model.Objetos;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Artur
 */
public class Principal extends javax.swing.JFrame {

    TelaEditar edit = new TelaEditar();
    CarregaTabela CaTab = new CarregaTabela();
    ArrayList<Objetos> lista = CaTab.VerificaLista();

    public Principal() throws SQLException {
        initComponents();

        this.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel1.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel2.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel7.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.kGradientPanel8.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.setIconImage(this.getIconImage());

        this.scrollPaneWin112.setBorder(BorderFactory.createLineBorder(new Color(255, 102, 51), 1));
        this.table.setForeground(new Color(255, 255, 255));
        table.getParent().setBackground(new Color(255, 102, 0));
        table.getColumnModel().getColumn(0).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
        table.getColumnModel().getColumn(1).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
        table.getColumnModel().getColumn(2).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));

        scrollPaneWin112.setBackground(new Color(170, 68, 0));
        this.Pesquisa.setBackground(new Color(9, 73, 110));
        this.Pesquisa.setFont(new Font("Square721 BT", 1, 14));
        this.Pesquisa.setForeground(new Color(255, 255, 255));
        this.Pesquisa.setToolTipText("");
        this.Pesquisa.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(255, 255, 255)));
        this.Pesquisa.setCaretColor(new Color(255, 255, 255));
        this.Pesquisa.setDisabledTextColor(new Color(255, 255, 255));
        this.Pesquisa.setOpaque(false);
        this.Pesquisa.setSelectionColor(new Color(9, 73, 110));

        criatabela();

        carregaTabela();

    }

    @Override
    public final Image getIconImage() {
        Image icon = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("br/com/artcomp/imagens/n4got50.png"));
        return icon;
    }

    public void carregaTabela() throws SQLException {

        var linha = 0;

        for (Objetos o : lista) {

            System.out.println("aqui--" + o.getNome());

            table.setValueAt(o.getNome(), linha, 0);
            table.setValueAt(o.getPalavraChave(), linha, 1);
            linha++;

            TableActionEvent event;
            event = new TableActionEvent() {
                @Override
                public void onEdit(int row) {
                    System.out.println("Edit row : " + row);

                    edit.setVisible(true);
                }

                @Override
                public void onDelete(int row) {
                    if (table.isEditing()) {
                        table.getCellEditor().stopCellEditing();
                    }
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.removeRow(row);
                }

                @Override
                public void onView(int row) {
                    System.out.println("View row : " + row);
                    TelaMostrar most = new TelaMostrar();
                    most.mostraDados(lista.get(row).getNome(), lista.get(row).getSenha());
                    most.setVisible(true);

                }
            };
            table.getColumnModel().getColumn(2).setCellRenderer(new TableActionCellRender());
            table.getColumnModel().getColumn(2).setCellEditor(new TableActionCellEditor(event));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jBMinimisar = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();
        kButton3 = new com.k33ptoo.components.KButton();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        jLabel4 = new javax.swing.JLabel();
        kGradientPanel7 = new com.k33ptoo.components.KGradientPanel();
        scrollPaneWin112 = new br.com.artcomp.scroll.ScrollPaneWin11();
        table = new javax.swing.JTable();
        Pesquisa = new javax.swing.JTextField();
        kGradientPanel8 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/artcomp/imagens/n4got50.png"))); // NOI18N

        kButton2.setText("Todos os Objetos");
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

        kButton3.setText("Novo Objeto");
        kButton3.setBorderPainted(false);
        kButton3.setFocusPainted(false);
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

        kButton4.setText("Favoritos");
        kButton4.setBorderPainted(false);
        kButton4.setFocusPainted(false);
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

        kButton5.setText("Configuração");
        kButton5.setBorderPainted(false);
        kButton5.setFocusPainted(false);
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

        jLabel4.setText("1.0.1.12");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(kButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addGap(0, 59, Short.MAX_VALUE)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(76, 76, 76))))))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 660));

        kGradientPanel7.setkEndColor(new java.awt.Color(170, 68, 0));
        kGradientPanel7.setkStartColor(new java.awt.Color(170, 68, 0));
        kGradientPanel7.setkTransparentControls(false);

        scrollPaneWin112.setForeground(new java.awt.Color(255, 255, 255));

        table.setBackground(new java.awt.Color(255, 102, 0));
        table.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        table.setForeground(new java.awt.Color(255, 102, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OBJETO", "COMENTARIO", "ICONE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(255, 102, 0));
        table.setRequestFocusEnabled(false);
        table.setRowHeight(50);
        table.setSelectionBackground(new java.awt.Color(170, 68, 0));
        table.setSelectionForeground(new java.awt.Color(255, 102, 0));
        scrollPaneWin112.setViewportView(table);

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneWin112, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneWin112, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );

        kGradientPanel1.add(kGradientPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 750, 550));

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
        kGradientPanel1.add(Pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 210, 40));

        kGradientPanel8.setkBorderRadius(20);
        kGradientPanel8.setkEndColor(new java.awt.Color(170, 68, 0));
        kGradientPanel8.setkStartColor(new java.awt.Color(170, 68, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/artcomp/imagens/lupa25.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/artcomp/imagens/engren.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel8Layout = new javax.swing.GroupLayout(kGradientPanel8);
        kGradientPanel8.setLayout(kGradientPanel8Layout);
        kGradientPanel8Layout.setHorizontalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        kGradientPanel8Layout.setVerticalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        kGradientPanel1.add(kGradientPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 320, 35));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gerenciador de Senhas");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(960, 660));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed

        //this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBMinimisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMinimisarActionPerformed

        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jBMinimisarActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
      
         TelaCadastro tc = new TelaCadastro();
        tc.setVisible(true);        

    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton4ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton5ActionPerformed

    private void PesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PesquisaKeyPressed

       
    }//GEN-LAST:event_PesquisaKeyPressed

    private void PesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisaMouseClicked
        
        
    }//GEN-LAST:event_PesquisaMouseClicked

    private void PesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PesquisaFocusLost

    }//GEN-LAST:event_PesquisaFocusLost

    private void PesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PesquisaFocusGained

    }//GEN-LAST:event_PesquisaFocusGained

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
                try {
                    new Principal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pesquisa;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBMinimisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KButton kButton3;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel7;
    private com.k33ptoo.components.KGradientPanel kGradientPanel8;
    private br.com.artcomp.scroll.ScrollPaneWin11 scrollPaneWin112;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    public void criatabela() {

        System.out.println(lista.size());

        switch (lista.size()) {
            case 1:
                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null}
                        },
                        new String[]{
                            "OBJETO", "COMENTARIO", "ICONE"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, true
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                break;
            case 2:
                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "OBJETO", "COMENTARIO", "ICONE"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, true
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex
                    ) {
                        return canEdit[columnIndex];
                    }
                }
                );
                break;
            case 3:
                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "OBJETO", "COMENTARIO", "ICONE"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, true
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                break;
            case 4:
                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "OBJETO", "COMENTARIO", "ICONE"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, true
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                break;
            case 5:
                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "OBJETO", "COMENTARIO", "ICONE"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, true
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                break;
            case 6:
                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "OBJETO", "COMENTARIO", "ICONE"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, true
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                break;
            case 7:
                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "OBJETO", "COMENTARIO", "ICONE"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, true
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                break;
            case 8:
                System.out.println("entrou aqui - 8");
                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "OBJETO", "COMENTARIO", "ICONE"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, true
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                break;
            case 9:
                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "OBJETO", "COMENTARIO", "ICONE"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, true
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                table.getColumnModel().getColumn(0).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 14), true, new Color(170, 68, 0), Color.WHITE));
                table.getColumnModel().getColumn(1).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 14), true, new Color(170, 68, 0), Color.WHITE));
                table.getColumnModel().getColumn(2).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 14), true, new Color(170, 68, 0), Color.WHITE));
                break;
            case 10:
                System.out.println("entrou aqui 10");
                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "OBJETO", "COMENTARIO", "ICONE"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, true
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                table.getColumnModel().getColumn(0).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                table.getColumnModel().getColumn(1).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                table.getColumnModel().getColumn(2).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                break;
                case 11:
                System.out.println("entrou aqui 11");
                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "OBJETO", "COMENTARIO", "ICONE"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, true
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                table.getColumnModel().getColumn(0).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                table.getColumnModel().getColumn(1).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                table.getColumnModel().getColumn(2).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                break;
                case 12:
                System.out.println("entrou aqui 11");
                table.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null},
                            {null, null, null}
                        },
                        new String[]{
                            "OBJETO", "COMENTARIO", "ICONE"
                        }
                ) {
                    boolean[] canEdit = new boolean[]{
                        false, false, true
                    };

                    @Override
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
                table.getColumnModel().getColumn(0).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                table.getColumnModel().getColumn(1).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                table.getColumnModel().getColumn(2).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                break;
            default:
                throw new AssertionError();
        }

    }
}
