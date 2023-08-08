/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.artcomp.n4got;

import br.com.artcomp.controller.VerificaConfiguracao;
import br.com.artcomp.wiew.Login;
import br.com.artcomp.wiew.Principal;

/**
 *
 * @author artco
 */
public class N4Got {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        VerificaConfiguracao verifica = new VerificaConfiguracao();

        if (verifica.verificaTelaLogin()) {
            Login login = new Login();
            login.setVisible(true);
        }else{
            Principal pri = new Principal();
            pri.setVisible(true);
        }
    }
}
