/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.controller;

import br.com.artcomp.DAO.SelectDAO;
import java.sql.SQLException;

/**
 *
 * @author artco
 */
public class VerificaConfiguracao {    
    
    SelectDAO selDAO = new SelectDAO();    
    
    public boolean verificaEntradaLogin () {        
        
        if (selDAO.readTelLogin()) {
            return true;
        }
        return false;
        
    }
    
}
