
package br.com.artcomp.model;

import br.com.artcomp.utilitarios.Conexao;
import java.sql.SQLException;

/**
 *
 * @author Artur Duarte
 */
public class VerificaLoginDAO {

    Conexao con_cadastro;

    public VerificaLoginDAO() {

    }
    
    // verifica se o nome e senha estão corretos 
    //retornando true para correto 
    public boolean VerificaLoginBD(PessoaLogin pess) {

        con_cadastro = new Conexao();
        this.con_cadastro.conecta();
        this.con_cadastro.executeSQL("select * from login");

        try {
            while (true) {
                Conexao co = this.con_cadastro;

                if (!Conexao.resultset.next()) {
                    break;
                }

                co = this.con_cadastro;
                String nome = Conexao.resultset.getString("nome");
                co = this.con_cadastro;
                String senha = Conexao.resultset.getString("senha");

                if (nome.equalsIgnoreCase(pess.getNome()) && senha.equalsIgnoreCase(new String(pess.getSenha()))) {

                    this.con_cadastro.desconecta();
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
