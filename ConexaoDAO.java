
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexaoDAO {
    //DAO acesso ao banco de dados; 
    //encapsula o acesso aos dados, de forma que as demais classes não precisam saber sobre isso.
    public Connection conectaBD(){
        Connection conn = null;
        
        try{
            
            String url = "jdbc:mysql://localhost:3306/impressora?user=root&password=";
            conn = DriverManager.getConnection(url);

        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"ConexaoDAO"+ erro.getMessage());
        
        }return conn;
    }
    
}
