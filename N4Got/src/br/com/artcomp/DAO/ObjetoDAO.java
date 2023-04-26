/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.DAO;

import br.com.artcomp.model.Objetos;
import br.com.artcomp.utilitarios.Conexao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author artco
 */
public class ObjetoDAO {

    Conexao con_cadastro;

    public ObjetoDAO() {

    }

    public ArrayList<Objetos> readAll() throws SQLException {
        con_cadastro = new Conexao();
        con_cadastro.conecta();
        ArrayList<Objetos> lista = new ArrayList<>();

        con_cadastro.executeSQL("select * from cad_obj  order by nome");

        try {
            while (con_cadastro.resultset.next()) {
                Objetos objts = new Objetos();
                objts.setId(con_cadastro.resultset.getInt("id"));
                objts.setNome(con_cadastro.resultset.getString("nome"));
                objts.setLogin(con_cadastro.resultset.getString("login"));
                objts.setSenha(con_cadastro.resultset.getString("senha"));
                objts.setPalavraChave(con_cadastro.resultset.getString("palavrachave"));
                objts.setImagem(con_cadastro.resultset.getString("imagem"));
                lista.add(objts);
            }
            con_cadastro.desconecta();
            //System.out.println("lista www" + lista.contains(this));
            return lista;

        } catch (SQLException ex) {
            System.err.println("deu erro na tabea lllll");
        } catch (Exception ex) {
            System.err.println("Erro gerallll´´" + ex.getMessage());
        }

        return lista;
    }
}
