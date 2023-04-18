/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.artcomp.model;

import br.com.artcomp.cell.TableActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Artbook
 */
public class ObjetosTableModel extends AbstractTableModel {

    private String[] colunas = {"Objeto", "Comentario", "Icone" };

    private List<Objetos> obj = new ArrayList<>();

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //identifica o nome das colunas
    }

    @Override
    public int getRowCount() {
        return obj.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
           //seta os valores na linhas com referencia por coluna
        switch(coluna){
            case 0:
            return obj.get(linha).getNome();
            case 1:
            return obj.get(linha).getPalavraChave();
//            case 2:
//            return obj.get(linha).getTipo();
//            case 3:
//            return obj.get(linha).getCnpj();
//            case 4:
//            return obj.get(linha).getTelefone();
            
        }
        return null;
    }

    public void addRow(Objetos o) {
        this.obj.add(o);             
        this.fireTableDataChanged();     

    }
    
    
    
}
