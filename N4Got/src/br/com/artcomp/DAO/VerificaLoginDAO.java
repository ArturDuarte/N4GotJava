
package br.com.artcomp.DAO;

import br.com.artcomp.model.PessoaLogin;
import br.com.artcomp.utilitarios.Conexao;
import br.com.artcomp.utilitarios.ConexaoFirebird;
import java.sql.SQLException;

/**
 *
 * @author Artur Duarte
 */
public class VerificaLoginDAO {

    ConexaoFirebird con_cadastro;
    

    public VerificaLoginDAO() {

    }
    
    // verifica se o nome e senha estão corretos 
    //retornando true para correto 
    public boolean VerificaLoginBD(PessoaLogin pess) {

        con_cadastro = new ConexaoFirebird();
       
        this.con_cadastro.conecta();
       // this.con_cadastro.executeSQL("select * from login"); base postgris
        this.con_cadastro.executeSQL("select * from TB_LOGIN");

        try {
            while (true) {
                ConexaoFirebird co = this.con_cadastro;

                if (!ConexaoFirebird.resultset.next()) {
                    break;
                }

                co = this.con_cadastro;
                String nome = ConexaoFirebird.resultset.getString("NOME");
                System.out.println(nome);
                co = this.con_cadastro;
                String senha = ConexaoFirebird.resultset.getString("SENHA");
                System.out.println(senha);

                if (nome.equalsIgnoreCase(pess.getNome()) && senha.equalsIgnoreCase(new String(pess.getSenha()))) {

                    //this.con_cadastro.desconecta();
                    return true;

                }
            }
        } catch (SQLException e) {

            this.con_cadastro.desconecta();
            return false;
        }

        return false;
    }

}
