
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALEX
 */
public class TableAdministrator {
    Statement st;
    public TableAdministrator(Statement st) {
        this.st = st;
    }
    /*Questo metodo controlla, tramite una query, se nel nostro database ci sono corrispondenze delle credenziali data la password*/
    public boolean selectAdm(String username, String password){
        String user= "";
        String sql = "select username from Administrator where pass = '" + password + "'";
        
        try{
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
               user = rs.getString("username"); 
            }
            
            if (user.equals(username)){
                return true;
            } else {
                
                return false;
            }
               
        } catch (SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        
        
    }
    
}
