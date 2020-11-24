
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sabrina
 */
public class TableMantainer {// Questa classe gestisce gli inserimenti di username e password dei mantainer
     Statement st;

    public TableMantainer(Statement st) {
        this.st= st;
    }
    
    public boolean insert(String userName, String pass) {
        String query = "insert into mantainer values('"+userName+"','"+pass+"')";
       try {
           st.executeUpdate(query);
           
           return true;
       } catch (SQLException ex) {
           System.out.println(ex);
           return false;
       }
    }
    
}
