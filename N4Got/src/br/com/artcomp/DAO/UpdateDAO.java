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
import javax.swing.JOptionPane;

/**
 *
 * @author artco
 */
public class UpdateDAO {

    ConexaoFirebird con_cadastro;

    public UpdateDAO() {

    }

    public boolean update(Objetos ob) {

        System.out.println("chegou update" + ob.getId() + ob.getNome() + ob.getLogin() + ob.getSenha() + ob.getPalavraChave() + ob.getImagem());

        con_cadastro = new ConexaoFirebird();
        this.con_cadastro.conecta();

        try {

            String sql = "UPDATE cad_obj SET nome= '" + String.valueOf(ob.getNome()) + "',"
                    + "login='" + String.valueOf(ob.getLogin()) + "',"
                    + "senha='" + String.valueOf(ob.getSenha()) + "',"
                    + "palavrachave='" + String.valueOf(ob.getPalavraChave()) + "',"
                    + "imagem='" + String.valueOf(ob.getImagem()) + "'"
                    + "WHERE id =" + String.valueOf(ob.getId());

            System.out.println(sql);

            con_cadastro.statement.executeUpdate(sql);

            this.con_cadastro.desconecta();
            return true;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "-Erro ao tentar Atualizar o registro de pessoa " + e);

        }
        return false;

    }

    public boolean updateMarcadores(ConfiguracaoLogin conf) {

        System.out.println("chegou marcadores " + conf.getTelLogin() + conf.getSenhaPadrao());

        con_cadastro = new ConexaoFirebird();
        this.con_cadastro.conecta();

        try {
            String sql = "UPDATE TB_CONFIGURACAO SET tellogin= '"
                    + String.valueOf(conf.getTelLogin()) + "',"
                    + "senpadrao='" + String.valueOf(conf.getSenhaPadrao()) + "'"
                    + "WHERE id = 1" ;
            
            System.out.println(sql);

            con_cadastro.statement.executeUpdate(sql);

            this.con_cadastro.desconecta();
            return true;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "-Erro ao tentar Gravar o registro de marcadores " + e);

        }

        return false;

    }

}
