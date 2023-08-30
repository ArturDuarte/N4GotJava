/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.model;

import br.com.artcomp.wiew.Principal;
import br.com.artcomp.wiew.TelaTabela;
import br.com.artcomp.wiew.TelaTabelaPesquisaObjeto;

/**
 *
 * @author artco
 */
public class Fabrica {

    private Principal principal;
    private TelaTabela telaTabela;
    private TelaTabelaPesquisaObjeto telaTabelaPesquisaObjeto;

    /**
     * @param principal the Principal to set
     */
    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    /**
     * @param telaTabela the Principal to set
     */
    public void setTelaTabela(TelaTabela telaTabela) {
        this.telaTabela = telaTabela;
    }

    /**
     * @param telaTabelaPesqObj the Principal to set
     */
    public void setTelaTabela(TelaTabelaPesquisaObjeto telaTabelaPesqObj) {
        this.telaTabelaPesquisaObjeto = telaTabelaPesqObj;
    }

    /**
     * @return the INSTANCIA
     */
    public static Fabrica getINSTANCIA() {
        return INSTANCIA;
    }

    /**
     * @param instancia  the INSTANCIA to set
     */
    public static void setINSTANCIA(Fabrica instancia) {
        INSTANCIA = instancia;
    }

    private static Fabrica INSTANCIA = new Fabrica();

    private Fabrica() {
        principal = new Principal();
        telaTabela = new TelaTabela();
        String obj = null;
        telaTabelaPesquisaObjeto = new TelaTabelaPesquisaObjeto(obj);
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

    /**
     * @return the Principal
     */
    public TelaTabelaPesquisaObjeto getTelaTabelaPesquisaObjeto() {
        return telaTabelaPesquisaObjeto;
    }
}
