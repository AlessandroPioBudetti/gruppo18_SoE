package tablepackage;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
public class TableMantainer {// Questa classe gestisce gli inserimenti di username e password dei mantainer

    private Statement st;

    public TableMantainer(Statement st) {
        this.st = st;
    }

    public boolean insert(String userName, String pass) {
        String query = "insert into mantainer values('" + userName + "','" + pass + "')";
        try {
            st.executeUpdate(query);

            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    /*Questo metodo controlla, tramite una query, se nel nostro database ci sono corrispondenze delle credenziali data la password*/
    public boolean selectMaint(String username, char[] password) {
        String psw = String.valueOf(password);
        String password2 = "";
        String sql = "select pass from Mantainer where username = '" + username + "'";

        try {

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                password2 = rs.getString("pass");
            }

            if (psw.equals(password2)) {
                return true;
            } else {

                return false;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
    
    public String[] visualizeMaintainers() {
        String query = "select * from mantainer";
        String[] maintainers = new String[100];
        int i = 0;
        try {
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                maintainers[i] = rs.getString("username");
                i++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return maintainers;
    }
    
public ArrayList <String> visualizeUsernameMaintainers() {
        String query = "select username from mantainer";
        ArrayList <String>  maintainers= new ArrayList();
        String username;  
        try{
         ResultSet rst=st.executeQuery(query);
         while(rst.next()){
             username=rst.getString("username");
             maintainers.add(username);
         }     
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return maintainers;
    }

    public String getPassword(String username) {
        String query = "select pass from mantainer where username = '" + username + "'";
        try {
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String pass = rs.getString("pass");
            return pass;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
        
    }
    
    public boolean update(String username, String pass, String olduser){
        String query="update mantainer set username = '"+username+"' where username = '"+olduser+"'";
        String query2="update mantainer set pass = '"+pass+"' where username = '"+username+"'";
        try {
            st.executeUpdate(query);
            st.executeUpdate(query2);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        
    }
    
    public boolean delete(String username) {
        String query = "delete from mantainer where username = '" + username + "'";
        try {
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println("errore delete maintainer:\n"+ex.getMessage());
            return false;
        }
    }

}
