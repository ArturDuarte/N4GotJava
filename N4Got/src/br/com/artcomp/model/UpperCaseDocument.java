/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.model;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author artco
 */
public class UpperCaseDocument extends PlainDocument{

    public UpperCaseDocument() {
    }
    
    @Override
    public void insertString(int off,String str, AttributeSet a) throws BadLocationException{
        if(str == null){
            return;
        }
        super.insertString(off, str.toUpperCase(), a);
        
    }
}
