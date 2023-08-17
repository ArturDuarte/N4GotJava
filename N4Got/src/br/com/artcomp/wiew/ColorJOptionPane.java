/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.wiew;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author artco
 */
public class ColorJOptionPane extends JOptionPane {

    public ColorJOptionPane(Color c) {
              
        UIManager.put("OptionPane.background", new Color(255, 102, 0));
        UIManager.put("OptionPane.setUndecorated", true);
        UIManager.put("Panel.background", new Color(255, 102, 0));
        UIManager.put("Button.background", new Color(255, 102, 0));
        UIManager.put("text", new Color(255, 255, 255));
        UIManager.put("Button.foreground", Color.WHITE);
        UIManager.put("OptionPane.yesButtonText", "   Sim   ");
        UIManager.put("OptionPane.noButtonText", "   Não   ");
        UIManager.put("OptionPane.minimumSize", new Dimension(300, 100));
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        UIManager.put("OptionPane.buttonPadding", 20);
        UIManager.put("Button.border", new Color(255, 255, 255));
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Areal", Font.BOLD, 16)));
        UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("Areal", Font.BOLD, 14)));
        

    }

}
