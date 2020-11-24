
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
    
}
