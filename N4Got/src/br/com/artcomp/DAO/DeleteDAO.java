/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.DAO;

import br.com.artcomp.utilitarios.Conexao;
import br.com.artcomp.utilitarios.ConexaoFirebird;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author artco
 */
public class DeleteDAO {
    
     ConexaoFirebird con_cadastro;
    
    public DeleteDAO (){        
    
    }
    
    public boolean removeLinha(Integer ID){
        
         con_cadastro = new ConexaoFirebird();
        this.con_cadastro.conecta();
        
        try {
            
            String sql = "DELETE FROM TB_OBJETO WHERE id ="+ ID +";";                   

            System.out.println(sql);

            con_cadastro.statement.execute(sql);
            
            System.out.println("linha apagada");
            
            this.con_cadastro.desconecta();
            return true;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "-Erro ao tentar Apagar o registro  " + e);

        }
               
        
         return false;
    }
}
