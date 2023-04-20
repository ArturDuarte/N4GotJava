/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.controller;

import br.com.artcomp.model.VerificaSenhaDAO;


public class VerificaSenha {
    
    VerificaSenhaDAO vsd = new VerificaSenhaDAO();
    public VerificaSenha(){
        
    }
    
    // Verifica se os valores são corretos não null
    public boolean VerificaSenha(String senha ) {

        if (senha.isEmpty()) {
            System.out.println("digitou a senha errado");
            return false;
            
        } else {
            
           return vsd.VerificaSenhaDAO(senha);

        }

    }
}
