
package br.com.artcomp.utilitarios;

import java.sql.*;
import javax.swing.*;

public class Conexao
{
    final private String driver = "org.postgresql.Driver";
    //drive do banco de dados
    //final private String url = "jdbc:postgresql://45.6.111.182/agenda";  
    final private String url = "jdbc:postgresql://localhost/nforgot";  
    final private String usuario = "postgres";
    final private String senha = "artur";
    private Connection conexao;
    public static Statement statement;
    public static ResultSet resultset;
    
    public boolean conecta()
    {
        boolean result = true;
        try
        {
            Class.forName(driver);
                    conexao = DriverManager.getConnection(url,usuario,senha);
                    //JOptionPane.showMessageDialog(null,"Conectado");
                    System.out.println("conectouBD");
        }
        catch(ClassNotFoundException Driver)
        {
            JOptionPane.showMessageDialog(null,"Driver não localizado: "+Driver);
            result = false;
        } 
        catch(SQLException Fonte)
        {
          JOptionPane.showMessageDialog(null,"Deu erro na conexão" +"com a fonte de dados"+Fonte);
          result = false;                         
        }
        return result;
    }
    
    
    public void desconecta()
                        
    {
        boolean result = true;
        try
        {
        conexao.close();
       //JOptionPane.showMessageDialog(null,"banco fechado");
       System.out.println("saiuBD");
        }
        catch(SQLException fecha)
        {
            JOptionPane.showMessageDialog(null,"Não foi possivel "+
                    "fechar o banco de dados:  "+fecha);
            result = false;
        }
    }
    
    public void executeSQL(String sql)
    {
        //System.out.println("chegou aqui");
        try
        {
            statement = conexao.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        }
        catch(SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi possivel "+
                     "executar o comando sql "+sqlex+", o sql passado foi "+sql);
        }
    }
}
        