package br.com.artcomp.model;


import br.com.artcomp.wiew.Principal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fabrica {

    /**
     * @param painelPrincipal the painelPrincipal to set
     */
    public void setPainelPrincipal(Principal principal) {
        this.pPrincipal = principal;
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
   
   // private ConexaoBanco conexaoBanco;
   

    private static Fabrica INSTANCIA = new Fabrica();

    private Fabrica() {
        try {
            pPrincipal = new Principal();
            
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
        return pPrincipal;
    }
   

   
}
