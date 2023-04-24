/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.controller;

import br.com.artcomp.model.Objetos;

/**
 *
 * @author artco
 */
public class CadastroObjeto {
    
    Objetos ob = new Objetos();
    
    public CadastroObjeto(){
        
    }
    
    public boolean cadastroObjeto(String login, String senha, String nome, String sobrNome, String imagem){
        
        
        if (nome.isEmpty()) {
            return false;
        } else {

            ob.setNome(nome);
            ob.setPalavraChave(sobrNome);
            ob.setLogin(login);
            ob.setSenha(senha);
            ob.setImagem(imagem);
            return true;

        }
    }
}
