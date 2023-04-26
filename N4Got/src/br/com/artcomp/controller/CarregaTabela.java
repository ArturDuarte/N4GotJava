/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.controller;

import br.com.artcomp.DAO.ObjetoDAO;
import br.com.artcomp.model.Objetos;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author artco
 */
public class CarregaTabela {
    
    ObjetoDAO objDAO = new ObjetoDAO();
    ArrayList<Objetos> lista;

    public CarregaTabela() throws SQLException {
        this.lista = objDAO.readAll();
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
