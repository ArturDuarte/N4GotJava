/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.controller;

import br.com.artcomp.DAO.SelectDAO;
import br.com.artcomp.model.Objetos;
import br.com.artcomp.wiew.ColorJOptionPane;
import java.util.ArrayList;

/**
 *
 * @author artco
 */
public class PesquisaObjeto {
    
    SelectDAO objDAO = new SelectDAO();
    ArrayList<Objetos> lista;

    public ArrayList<Objetos> verificaObjeto(String text) {
       
        this.lista = objDAO.readPesquisaObjeto(text);
                     
        if(lista == null || lista.size() == 0){
            
            System.out.println("lista vazia ----");
//            ColorJOptionPane.showMessageDialog(null, "Nenhum registro encontrado!");            
            
        }else{
            return lista;
        }
        return null;  
       
    }
    
}
