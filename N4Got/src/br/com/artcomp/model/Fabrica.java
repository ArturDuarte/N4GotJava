package br.com.artcomp.model;

import br.com.artcomp.wiew.Principal;
import br.com.artcomp.wiew.TelaEditar;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fabrica {

    /**
     * @param principal
     */
    public void setPainelPrincipal(Principal principal) {
        this.setpPrincipal(principal);
    }

    public void setTelaEditar(TelaEditar telaEditar) {
        this.setpEditar(telaEditar);
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

    private Principal pPrincipal;
    private TelaEditar pEditar;

    // private ConexaoBanco conexaoBanco;
    private static Fabrica INSTANCIA = new Fabrica();

    private Fabrica() {
        try {
            pPrincipal = new Principal();
            pEditar = new TelaEditar();

            // conexaoBanco = new ConexaoBanco();
        } catch (SQLException ex) {
            Logger.getLogger(Fabrica.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Fabrica getInstancia() {
        return getINSTANCIA();
    }

    /**
     * @return the painelPrincipal
     */
    public Principal getPrincipal() {
        return getpPrincipal();
    }
    public TelaEditar getTelaEditar() {
        return getpEditar();
    }

    /**
     * @return the pPrincipal
     */
    public Principal getpPrincipal() {
        return pPrincipal;
    }

    /**
     * @param pPrincipal the pPrincipal to set
     */
    public void setpPrincipal(Principal pPrincipal) {
        this.pPrincipal = pPrincipal;
    }

    /**
     * @return the pEditar
     */
    public TelaEditar getpEditar() {
        return pEditar;
    }

    /**
     * @param pEditar the pEditar to set
     */
    public void setpEditar(TelaEditar pEditar) {
        this.pEditar = pEditar;
    }

}
