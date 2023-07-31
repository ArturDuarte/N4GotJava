/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.artcomp.DAO;

import br.com.artcomp.utilitarios.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author artco
 */
public class DeleteDAO {
    
     Conexao con_cadastro;
    
    public DeleteDAO (){        
    
    }
    
    public boolean removeLinha(Integer ID){
        
         con_cadastro = new Conexao();
        this.con_cadastro.conecta();
        
        try {
            
            String sql = "DELETE FROM cad_obj WHERE id ="+ ID +";";                   

            System.out.println(sql);

            con_cadastro.statement.execute(sql);
            
            System.out.println("linha apagada");
            
            return true;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "-Erro ao tentar Apagar o registro  " + e);

        }
               
        
         return false;
    }
}
