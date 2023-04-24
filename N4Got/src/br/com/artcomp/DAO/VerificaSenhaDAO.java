/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.DAO;

import br.com.artcomp.utilitarios.Conexao;
import java.sql.SQLException;

/**
 *
 * @author artco
 */
public class VerificaSenhaDAO {

    Conexao con_cadastro;

    public boolean VerificaSenhaDAO(String SENHA) {

        con_cadastro = new Conexao();
        this.con_cadastro.conecta();
        this.con_cadastro.executeSQL("select * from login");
        
         try {
            while (true) {
                Conexao co = this.con_cadastro;

                if (!Conexao.resultset.next()) {
                    break;
                }

//                co = this.con_cadastro;
//                String id = Conexao.resultset.getString("id");
                co = this.con_cadastro;
                String senha = Conexao.resultset.getString("senha");

                if (senha.equalsIgnoreCase(new String(SENHA))) {

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
