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
public class Descriptografa {

    public String Descriptografa(String textoCriptografado, String chave) {
        
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPasswordCharArray(chave.toCharArray());
        
        String textDescriptografado = textEncryptor.decrypt(textoCriptografado);
        System.out.println(textDescriptografado);
        
        return textDescriptografado;
    }

}
