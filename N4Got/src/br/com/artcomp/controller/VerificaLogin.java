/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.controller;

import br.com.artcomp.model.PessoaLogin;
import br.com.artcomp.DAO.VerificaLoginDAO;

/**
 *
 * @author Artur Duarte
 */
public class VerificaLogin {

    PessoaLogin pess = new PessoaLogin();
    VerificaLoginDAO ver = new VerificaLoginDAO();

    public VerificaLogin() {
    }

    // Verifica se os valores são corretos não null
    public boolean verificaLogin(String nome, String login) {

        if (nome.isEmpty()) {
            return false;
        } else {

            pess.setNome(nome);
            pess.setSenha(login);
            return ver.VerificaLoginBD(pess);

        }

    }

}
