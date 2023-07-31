/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.controller;

import br.com.artcomp.DAO.DeleteDAO;

/**
 *
 * @author artco
 */
public class DeletaObjeto {
    
    DeleteDAO delete = new DeleteDAO();
    
    public DeletaObjeto(){
                
    }
    
    public boolean delete (Integer ID){
        
        if(ID.equals(0)){
           
            System.out.println("ID não existe");
        }else{
            
            return delete.removeLinha(ID);            
        }   
        
        return false;
    }    
}
