/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablepackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ALEX
 */

//Questa classe è stata creata per gestire le procedure di manuntezione. Per gestione intendiamo inserimento/cancellazione/modifica e visualizzazione.
public class TableProcedure {
    Statement st;
    public TableProcedure(Statement st) {
        this.st = st;
        
    }
    //Questa funzione ci permette di inserire una procedura all'interno del nostro database. Controllare il campo INFO prima di inserire una nuova procedura.
    public boolean insertProcedure(String name, String url){
        String query = "insert into procedure_di_manutenzione values('" + name + "','" +url+ "')";
         try {
            st.executeUpdate(query);

            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
        
    }
    //Questa funzione ci permette di visualizzare una procedura.
      public String[] visualizeProcedure() {
        String query = "select nome from procedure_di_manutenzione";
        String[] procedure = new String[100];
        int i = 0;
        try {
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                procedure[i] = rs.getString("nome");
                i++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return procedure;
    }
    //Questa funzione ci permette di cancellare una procedura.
    public boolean deleteProcedure(String name){
        String query = "delete from procedure_di_manutenzione where nome = '" + name + "'";
         try {
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    //Questa funzione ci permette di modificare una procedura.
    public boolean updateProcedure(String newname, String url, String oldname){
        String query = "update procedure_di_manutenzione set nome = '" + newname + "' where nome = '" + oldname + "'";
        String query2 = "update procedure_di_manutenzione set pdf = '" + url + "' where nome = '" + newname + "'";
        try {
            st.executeUpdate(query);
            st.executeUpdate(query2);
            return true;
        } catch (SQLException ex) {
            System.out.println("Errore Update procedure_di_manutenzione:\n" + ex.getMessage());
            return false;
        }

    }
    
    public String getUrl(String name) {
      String query = "select pdf from procedure_di_manutenzione where nome = '" + name + "'";
        try {
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String pdf = rs.getString("pdf");
            rs.close();
            return pdf;
        } catch (SQLException ex) {
            System.out.println("Errore GetPdf:\n"+ex.getMessage());
            return null;
        }
       
    }
    
    
}


