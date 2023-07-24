/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.model;

import br.com.artcomp.wiew.Principal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author artco
 */
public class Fabrica {

    private Principal principal;
    private static Fabrica INSTANCIA = new Fabrica();

    /**
     * @param principal the Principal to set
     */
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    private Fabrica() {
        try {
            principal = new Principal();
        } catch (SQLException ex) {
            Logger.getLogger(Fabrica.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * @return the INSTANCIA
     */
    public static Fabrica getINSTANCIA() {
        return INSTANCIA;
    }

    public static Fabrica getInstancia() {
        return getINSTANCIA();
    }

    /**
     * @param INSTANCIA the INSTANCIA to set
     */
    public static void setINSTANCIA(Fabrica INSTANCIA) {
        INSTANCIA = INSTANCIA;
    }

    /**
     * @return the painelPrincipal
     */
    public Principal getPrincipal() {
        return principal;
    }
}
