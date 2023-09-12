/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.controller;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 *
 * @author artco
 */
public class Criptografa {

    public String Criptografa(String string, String chave) {
        
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPasswordCharArray(chave.toCharArray());
        
        String textoOriginal = string;

        String textoCriptografado = textEncryptor.encrypt(textoOriginal);

        System.out.println("texto criptografado  (" +textoCriptografado+ ")");        
        return textoCriptografado;
       
    }

}
