/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.DAO;

import br.com.artcomp.model.ConfiguracaoLogin;
import br.com.artcomp.model.Objetos;
import br.com.artcomp.utilitarios.Conexao;
import br.com.artcomp.utilitarios.ConexaoFirebird;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author artco
 */
public class SelectDAO {

    ConexaoFirebird con_cadastro;

    public SelectDAO() {

    }

    public ArrayList<Objetos> readAll() throws SQLException {
        
        con_cadastro = new ConexaoFirebird();
        con_cadastro.conecta();
        ArrayList<Objetos> lista = new ArrayList<>();

        con_cadastro.executeSQL("select * from TB_OBJETO  order by nome");

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
            //con_cadastro.desconecta();
            //System.out.println("lista www" + lista.contains(this));
            return lista;

        } catch (SQLException ex) {
            System.err.println("deu erro na tabea lllll");
        } catch (Exception ex) {
            System.err.println("Erro gerallll´´" + ex.getMessage());
        }

        return lista;
    }
    
    public ArrayList<Objetos> readPesquisaObjeto(String obj)  {
        
        con_cadastro = new ConexaoFirebird();
        con_cadastro.conecta();
        ArrayList<Objetos> lista = new ArrayList<>();
        
        con_cadastro.executeSQL( "select * from TB_OBJETO where nome like '%" + obj + "%' order by nome" );
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
            //con_cadastro.desconecta();
            System.out.println("select * from TB_OBJETO where nome like '%" + obj + "%' order by nome");
            return lista;

        } catch (SQLException ex) {
            System.err.println("deu erro na tabea lllll");
        } catch (Exception ex) {
            System.err.println("Erro gerallll´´" + ex.getMessage());
        }

        return lista;
        
    }    
    
    public ArrayList<ConfiguracaoLogin> readConfMarcacoes () {// verifica a tabela cad_conf
        
        con_cadastro = new ConexaoFirebird();
        con_cadastro.conecta();
        ArrayList<ConfiguracaoLogin> marcacoes = new ArrayList<>();
        
        con_cadastro.executeSQL("select * from TB_CONFIGURACAO ");
        
        
        try {
            while (con_cadastro.resultset.next()) {                
                ConfiguracaoLogin confLogin = new ConfiguracaoLogin();
                confLogin.setTelLogin(con_cadastro.resultset.getInt("tellogin"));   
                confLogin.setSenhaPadrao(con_cadastro.resultset.getInt("senpadrao"));
                System.out.println("Estou em selct login" + con_cadastro.resultset.getInt("tellogin"));
                System.out.println("Estou em selct senha" + con_cadastro.resultset.getInt("senpadrao"));
                marcacoes.add(confLogin);
                
            }
            } catch (SQLException ex) {
            System.err.println("deu erro cad_conf");
        } catch (Exception ex) {
            System.err.println("Erro gerallll´´" + ex.getMessage());
        }
               
        return marcacoes;        
        
    }
}
