package tablepackage;


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
    public boolean selectAdm(String username, char[] password){
        String psw = String.valueOf(password);
        String password2= "";
        String sql = "select pass from Administrator where username = '" + username + "'";
        
        try{
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
               password2 = rs.getString("pass"); 
            }
            
            if (psw.equals(password2)){
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
