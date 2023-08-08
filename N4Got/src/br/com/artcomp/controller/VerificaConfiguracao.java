/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.controller;

import br.com.artcomp.DAO.SelectDAO;
import br.com.artcomp.model.ConfiguracaoLogin;
import java.util.ArrayList;

/**
 *
 * @author artco
 */
public class VerificaConfiguracao {    
    
    SelectDAO selDAO = new SelectDAO();    
    ArrayList<ConfiguracaoLogin> marcacoes;
    
    public VerificaConfiguracao () {        
        
        this.marcacoes = selDAO.readConfMarcacoes();            
        
    }
    
    public ArrayList<ConfiguracaoLogin> verificaMarcacoes(){
        
        if(marcacoes == null){
            
            System.out.println("marcações vazias ----");
        }
            return marcacoes;                 
        
    }
    
    public boolean verificaTelaLogin(){        
        
        for (ConfiguracaoLogin co : marcacoes) {
            
            if(co.getTelLogin() == 0){
                return true;
            }
            
        }
        return false;
    }
    
}
