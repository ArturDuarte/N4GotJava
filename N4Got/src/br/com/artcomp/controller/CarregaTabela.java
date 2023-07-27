/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.controller;

import br.com.artcomp.DAO.SelectDAO;
import br.com.artcomp.model.Objetos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author artco
 */
public class CarregaTabela {
    
    SelectDAO objDAO = new SelectDAO();
    ArrayList<Objetos> lista;

    public CarregaTabela()  {
        try {
            this.lista = objDAO.readAll();
        } catch (SQLException ex) {
            Logger.getLogger(CarregaTabela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Objetos> VerificaLista(){
        
        if(lista == null){
            
            System.out.println("lista vazia ----");
        }else{
            return lista;
        }
        return null;             
        
    }
        
    
}
