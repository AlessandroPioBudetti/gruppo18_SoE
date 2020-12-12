/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablepackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALEX
 */
public class TableProcedureActivity {
    Statement st;

    public TableProcedureActivity(Statement st) {
        this.st = st;
    }
       public boolean insertProcToAct(String activity, String procedure) {
        String query = "insert into procedure_attività values('" + activity + "','" + procedure + "')";
        try {
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println("Errore inserimento procedure_attività:\n" + ex);
            return false;
        }
    }

    public String[] visualizeProcedure(String activity) {
        String query = "select procedura from procedure_attività where attività = '" + activity + "'";
        String[] procedure = new String[100];
        int i = 0;
        try {
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                procedure[i] = rs.getString("procedura");
                i++;
            }
        } catch (SQLException ex) {
            System.out.println("Errore visualizza procedure_attività:\n" + ex.getMessage());
        }
        return procedure;
    }

    public boolean delete(String attività) {
        String query = "delete from procedure_attività where attività = '" + attività + "'";
        try {
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println("Errore delete procedure_attività:\n" + ex.getMessage());
            return false;
        }
    }
    
    public String getProcedureName(String id){
        String query = "select procedura from procedure_attività where attività = '"+id+"'";
        try {
            ResultSet rs = st.executeQuery(query);
            rs.next();
            return rs.getString("procedura");
        } catch (SQLException ex) {
            System.out.println("Errore getProcedureName:\n" + ex.getMessage());
            return null;
        }
        
    }
            
}
