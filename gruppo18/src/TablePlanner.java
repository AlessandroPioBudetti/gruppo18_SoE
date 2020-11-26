
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sabrina
 */
public class TablePlanner { // Questa classe gestisce gli inserimenti di username e password dei planner.
   Statement st;

    public TablePlanner(Statement st) {
        this.st=st;
    }
    
    public boolean insert(String userName, String pass) {
        String query = "insert into Planner values('"+userName+"','"+pass+"')";
       try {
           st.executeUpdate(query);
          
           return true;
       } catch (SQLException ex) {
           System.out.println(ex);
           return false;
       }
    }
    /*Questo metodo controlla, tramite una query, se nel nostro database ci sono corrispondenze delle credenziali data la password*/
     public boolean selectPl(String username, char[] password){
        String psw = String.valueOf(password);
        
        String user= "";
        String sql = "select username from Planner where pass = '" + psw + "'";
        
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
    
    public String[] visualizePlanners() {
        String query = "select * from planner";
        String[] planners =new String[100];
        int i = 0;
        try {
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                planners[i] = rs.getString("username");
                i++;
            }  
        } catch (SQLException ex) {
            Logger.getLogger(TablePlanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return planners;
    }
    
    public String getPassword(String username) {
        String query = "select pass from planner where username = '" + username + "'";
        try {
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String pass = rs.getString("pass");
            return pass;
        } catch (SQLException ex) {
            Logger.getLogger(TableMantainer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean update(String username, String pass, String olduser){
        String query="update planner set username = '"+username+"' where username = '"+olduser+"'";
        String query2="update planner set pass = '"+pass+"' where username = '"+username+"'";
        try {
            st.executeUpdate(query);
            st.executeUpdate(query2);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TablePlanner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }

   
}
