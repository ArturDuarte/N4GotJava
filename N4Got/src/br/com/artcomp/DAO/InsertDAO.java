/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.DAO;

import br.com.artcomp.model.Objetos;
import br.com.artcomp.utilitarios.Conexao;
import br.com.artcomp.utilitarios.ConexaoFirebird;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author artco
 */
public class InsertDAO {

    ConexaoFirebird con_cadastro;

    public InsertDAO() {

    }

    public boolean insert(Objetos ob) {

        System.out.println("chegou gravardados" + ob.getNome() + ob.getLogin() + ob.getSenha() + ob.getPalavraChave() + ob.getImagem());

        con_cadastro = new ConexaoFirebird();
        this.con_cadastro.conecta();

        try {
            //String sql = "insert into cad_obj (nome,login,senha,palavrachave,imagem) values ('artur','wqwqw','1234','eu','we')";
            String sql = "insert into TB_OBJETO (nome,login,senha,palavrachave,imagem) values ('"
                    + String.valueOf(ob.getNome()) + "','"
                    + String.valueOf(ob.getLogin()) + "','"
                    + String.valueOf(ob.getSenha()) + "','"
                    + String.valueOf(ob.getPalavraChave()) + "','"
                    + String.valueOf(ob.getImagem()) + "')";

            System.out.println(sql);

            con_cadastro.statement.executeUpdate(sql);

            
            //this.con_cadastro.desconecta();
            return true;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "-Erro ao tentar Gravar o registro de pessoa " + e);

        }
        return false;

    }   

}
