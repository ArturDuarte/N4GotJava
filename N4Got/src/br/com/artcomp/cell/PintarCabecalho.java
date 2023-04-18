/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.cell;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author artco
 */
public class PintarCabecalho extends JLabel implements TableCellRenderer{

    public PintarCabecalho() {
        
    }

    public  PintarCabecalho(Font font, boolean opaque, Color backgroud, Color foregroud ){
        
        
        setFont(font);        
        setOpaque(opaque);
        setBackground(backgroud);
        setForeground(foregroud);
        setHorizontalAlignment(CENTER);
        
        
    }

      
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       
        setText(value.toString());
        
        return this;
    }
    
}
