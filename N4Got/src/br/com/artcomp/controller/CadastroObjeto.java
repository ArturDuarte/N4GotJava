/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.controller;

import br.com.artcomp.DAO.InsertDAO;
import br.com.artcomp.model.Objetos;

/**
 *
 * @author artco
 */
public class CadastroObjeto {
    
    InsertDAO cadDAO = new InsertDAO();
    
    public CadastroObjeto(){
        
    }
    
    public boolean cadastroObjeto(String login, String senha, String nome, String sobrNome, String imagem){
        
        
        if (nome.isEmpty()) {
            System.out.println("vazio");
        } else {

            Objetos ob = new Objetos();
            ob.setNome(nome);
            ob.setPalavraChave(sobrNome);
            ob.setLogin(login);
            ob.setSenha(senha);
            ob.setImagem(imagem);
           
            
             return cadDAO.insert(ob);

        }
        return false;
    }
}
