/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.artcomp.n4got;

import br.com.artcomp.controller.ManipulaTXT;
import br.com.artcomp.controller.VerificaConfiguracao;
import br.com.artcomp.wiew.Login;
import br.com.artcomp.wiew.Principal;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author artco
 */
public class N4Got {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {   
                    
        ManipulaTXT ma = new ManipulaTXT();
        ma.existe();
        
//        VerificaConfiguracao verifica = new VerificaConfiguracao();
//
//        if (verifica.verificaTelaLogin()) {
//            Login login = new Login();
//            login.setVisible(true);
//        }else{
//            Principal pri = new Principal();
//            pri.setVisible(true);
//        }        
    }
}