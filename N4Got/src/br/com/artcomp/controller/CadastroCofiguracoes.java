/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.controller;

import br.com.artcomp.DAO.UpdateDAO;
import br.com.artcomp.model.ConfiguracaoLogin;

/**
 *
 * @author artco
 */
public class CadastroCofiguracoes {

    UpdateDAO upDAO = new UpdateDAO();
    
    public CadastroCofiguracoes() {
        
        
    }
    
    public boolean cadastraMarcadores (Integer login, Integer senha){
        
        if (login == null) {
            System.out.println("vazio");
        } else {
        ConfiguracaoLogin conf = new ConfiguracaoLogin();
        conf.setTelLogin(login);
        conf.setSenhaPadrao(senha);
        
        return upDAO.updateMarcadores(conf);
        
        }
        return false;
        
        
    }
    
    
    
    
    
}
