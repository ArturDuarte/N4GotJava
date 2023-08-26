/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.DAO;

import br.com.artcomp.utilitarios.Conexao;
import br.com.artcomp.utilitarios.ConexaoFirebird;
import java.sql.SQLException;

/**
 *
 * @author artco
 */
public class VerificaSenhaDAO {

    ConexaoFirebird con_cadastro;

    public boolean VerificaSenhaDAO(String SENHA) {

        con_cadastro = new ConexaoFirebird();
        this.con_cadastro.conecta();
        this.con_cadastro.executeSQL("select * from TB_LOGIN");
        
         try {
            while (true) {
                ConexaoFirebird co = this.con_cadastro;

                if (!ConexaoFirebird.resultset.next()) {
                    break;
                }

//                co = this.con_cadastro;
//                String id = Conexao.resultset.getString("id");
                co = this.con_cadastro;
                String senha = ConexaoFirebird.resultset.getString("senha");

                if (senha.equalsIgnoreCase(new String(SENHA))) {

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
