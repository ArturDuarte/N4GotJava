/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.artcomp.wiew;

import br.com.artcomp.cell.PintarCabecalho;
import br.com.artcomp.cell.TableActionCellEditor;
import br.com.artcomp.cell.TableActionCellRender;
import br.com.artcomp.cell.TableActionEvent;
import br.com.artcomp.controller.CarregaTabela;
import br.com.artcomp.controller.DeletaObjeto;
import br.com.artcomp.model.Objetos;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author artco
 */
public class TelaTabela extends javax.swing.JInternalFrame {

    CarregaTabela CaTab;
    ArrayList<Objetos> lista = null;

    public TelaTabela() {
        initComponents();

        this.CaTab = new CarregaTabela();
        lista = CaTab.VerificaLista();

        this.kGradientPanel7.setBackground(new Color(0.0F, 0.0F, 0.0F, 0.0F));
        this.scrollPaneWin112.setBorder(BorderFactory.createLineBorder(new Color(255, 102, 51), 1));
        this.scrollPaneWin112.setBackground(new Color(170, 68, 0));

        this.table.setForeground(new Color(255, 255, 255));
        table.getParent().setBackground(new Color(255, 102, 0));

        this.setSize(760, 595);
        this.setLocation(0, 0);

        kGradientPanel7.setSize(740, 530);

        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);// remove a barra do JInternoFrame

        criatabela();

        carregaTabela(lista);
    }

    public void carregaTabela(ArrayList<Objetos> lista) {

        var linha = 0;

        if (lista == null) {
            System.out.println("ultima verificação");
        } else {
            for (Objetos o : lista) {

                System.out.println("aqui--" + o.getNome());

                table.setValueAt("  " + o.getNome(), linha, 0);
                table.setValueAt(o.getPalavraChave(), linha, 1);
                linha++;

                TableActionEvent event;
                event = new TableActionEvent() {
                    @Override
                    public void onEdit(int row) {
                        System.out.println("Editar row : " + row);

                        TelaEditarInt edi = new TelaEditarInt();
                        Objetos ob = new Objetos();
                        ob.setId(lista.get(row).getId());
                        ob.setNome(lista.get(row).getNome());
                        ob.setPalavraChave(lista.get(row).getPalavraChave());
                        ob.setLogin(lista.get(row).getLogin());
                        ob.setSenha(lista.get(row).getSenha());
                        edi.mostraDados(lista.get(row).getId(), lista.get(row).getNome(), lista.get(row).getPalavraChave(), lista.get(row).getLogin(), lista.get(row).getSenha());
                        getParent().add(edi);
                        edi.setVisible(true);
                        fecha();

                    }

                    @Override
                    public void onDelete(int row) {
                        if (table.isEditing()) {
                            table.getCellEditor().stopCellEditing();
                        }
                                 
                        TelaTabela ta = new TelaTabela();
                        removeLinha(lista.get(row).getId());                         
                        ta.dispose();
                        ta.setVisible(true);
                    }

                    @Override
                    public void onView(int row) {
                        System.out.println("View row : " + row);
                        TelaMostrarInt most = new TelaMostrarInt();
                        most.mostraDados(lista.get(row).getLogin(), lista.get(row).getSenha());
                        most.setVisible(true);
                        getParent().add(most);
                        most.setVisible(true);
                        fecha();
                    }
                };
                table.getColumnModel().getColumn(2).setCellRenderer(new TableActionCellRender());
                table.getColumnModel().getColumn(2).setCellEditor(new TableActionCellEditor(event));

            }
        }
    }

    public void fecha() {
        this.dispose();
    }

    public void removeLinha(Integer ID) {
       
        System.out.println("numero da linha"+ ID);
        int id = ID;
        DeletaObjeto Del = new DeletaObjeto();
        if(Del.delete(id)){
            JOptionPane.showMessageDialog(null, "Deletodo com sucesso ");
            
            TelaTabela tab = new TelaTabela();
            getParent().add(tab);
            tab.setVisible(true);            
            this.dispose();
        }
        
        
    }

    public void criatabela() {

        if (lista == null) {
            System.out.println("linhas vazia");
        } else {
            System.out.println("lista --" + lista.size());

            switch (lista.size()) {
                case 1:
                    System.out.println("entrou aqui - 1");
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
                    table.getColumnModel().getColumn(0).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(1).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 2:
                    System.out.println("entrou aqui - 2");
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
                    table.getColumnModel().getColumn(0).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(1).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 3:
                    System.out.println("entrou aqui - 3");
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
                    table.getColumnModel().getColumn(0).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(1).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 4:
                    System.out.println("entrou aqui - 4");
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
                    table.getColumnModel().getColumn(0).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(1).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 5:
                    System.out.println("entrou aqui - 5");
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
                    table.getColumnModel().getColumn(0).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(1).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 6:
                    System.out.println("entrou aqui - 6");
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
                    table.getColumnModel().getColumn(0).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(1).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 7:
                    System.out.println("entrou aqui - 7");
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
                    table.getColumnModel().getColumn(0).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(1).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
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
                    table.getColumnModel().getColumn(0).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(1).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 9:
                    System.out.println("entrou aqui 9");
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
                    table.getColumnModel().getColumn(0).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(1).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 12:
                    System.out.println("entrou aqui 12");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 13:
                    System.out.println("entrou aqui 13");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 14:
                    System.out.println("entrou aqui 14");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 15:
                    System.out.println("entrou aqui 15");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 16:
                    System.out.println("entrou aqui 16");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 17:
                    System.out.println("entrou aqui 17");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 18:
                    System.out.println("entrou aqui 18");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 19:
                    System.out.println("entrou aqui 19");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 20:
                    System.out.println("entrou aqui 20");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 21:
                    System.out.println("entrou aqui 21");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 22:
                    System.out.println("entrou aqui 22");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 23:
                    System.out.println("entrou aqui 23");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 24:
                    System.out.println("entrou aqui 24");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);

                    break;
                case 25:
                    System.out.println("entrou aqui 25");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 26:
                    System.out.println("entrou aqui 26");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 27:
                    System.out.println("entrou aqui 27");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 28:
                    System.out.println("entrou aqui 28");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 29:
                    System.out.println("entrou aqui 29");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 30:
                    System.out.println("entrou aqui 30");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 31:
                    System.out.println("entrou aqui 31");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 32:
                    System.out.println("entrou aqui 32");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 33:
                    System.out.println("entrou aqui 33");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 34:
                    System.out.println("entrou aqui 34");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 35:
                    System.out.println("entrou aqui 35");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 36:
                    System.out.println("entrou aqui 36");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 37:
                    System.out.println("entrou aqui 37");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 38:
                    System.out.println("entrou aqui 38");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 39:
                    System.out.println("entrou aqui 39");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 40:
                    System.out.println("entrou aqui 40");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 41:
                    System.out.println("entrou aqui 41");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 42:
                    System.out.println("entrou aqui 42");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 43:
                    System.out.println("entrou aqui 43");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 44:
                    System.out.println("entrou aqui 44");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 45:
                    System.out.println("entrou aqui 45");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 46:
                    System.out.println("entrou aqui 46");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 47:
                    System.out.println("entrou aqui 47");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 48:
                    System.out.println("entrou aqui 48");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 49:
                    System.out.println("entrou aqui 49");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                case 50:
                    System.out.println("entrou aqui 50");
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
                    //table.getColumnModel().getColumn(3).setHeaderRenderer(new PintarCabecalho(new java.awt.Font("Tahoma", 1, 12), true, new Color(170, 68, 0), Color.WHITE));
                    table.getColumnModel().getColumn(2).setPreferredWidth(1);
                    //table.getColumnModel().getColumn(3).setPreferredWidth(10);
                    break;
                default:

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel7 = new com.k33ptoo.components.KGradientPanel();
        scrollPaneWin112 = new br.com.artcomp.scroll.ScrollPaneWin11();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 102, 0));
        setBorder(null);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(750, 590));

        kGradientPanel7.setkEndColor(new java.awt.Color(233, 93, 0));
        kGradientPanel7.setkGradientFocus(200);
        kGradientPanel7.setkStartColor(new java.awt.Color(233, 93, 0));
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
        table.setToolTipText("");
        table.setGridColor(new java.awt.Color(255, 102, 0));
        table.setInheritsPopupMenu(true);
        table.setName(""); // NOI18N
        table.setRequestFocusEnabled(false);
        table.setRowHeight(45);
        table.setSelectionBackground(new java.awt.Color(214, 86, 0));
        table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        table.setShowGrid(true);
        scrollPaneWin112.setViewportView(table);

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneWin112, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneWin112, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        setBounds(0, 0, 750, 590);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.k33ptoo.components.KGradientPanel kGradientPanel7;
    public br.com.artcomp.scroll.ScrollPaneWin11 scrollPaneWin112;
    public javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
