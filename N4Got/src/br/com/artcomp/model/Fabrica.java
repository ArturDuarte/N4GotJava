/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.model;

import br.com.artcomp.wiew.Principal;
import br.com.artcomp.wiew.TelaTabela;

/**
 *
 * @author artco
 */
public class Fabrica {

    /**
     * @param principal the Principal to set
     */
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

     /**
     * @param telaDeletar the Principal to set
     */
    public void setTelaTabela(TelaTabela telaTabela) {
        this.telaTabela = telaTabela;
    }
    
    /**
     * @return the INSTANCIA
     */
    public static Fabrica getINSTANCIA() {
        return INSTANCIA;
    }

    /**
     * @param aINSTANCIA the INSTANCIA to set     
     */
    public static void setINSTANCIA(Fabrica aINSTANCIA) {
        INSTANCIA = aINSTANCIA;
    }

    private Principal principal;
    private TelaTabela telaTabela;

    private static Fabrica INSTANCIA = new Fabrica();

    private Fabrica() {
        principal = new Principal();
        telaTabela = new TelaTabela();

    }

    public static Fabrica getInstancia() {
        return getINSTANCIA();
    }

    /**
     * @return the Principal
     */
    public Principal getPrincipal() {
        return principal;
    }
    
    /**
     * @return the Principal
     */
    public TelaTabela getTelaTabela() {
        return telaTabela;
    }
}
