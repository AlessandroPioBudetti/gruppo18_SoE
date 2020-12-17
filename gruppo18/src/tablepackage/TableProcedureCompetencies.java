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
public class TableProcedureCompetencies {
private Statement st;
    public TableProcedureCompetencies(Statement st) {
        this.st = st;
    }
     public boolean insertCompToProced(String competenza, String procedure) {
        String query = "insert into competenze_procedure values('" + procedure + "','" + competenza + "')";
        try {
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println("Errore inserimento competenza_procedura:\n" + ex);
            return false;
        }
    }

    public String[] visualizeCompetencies(String procedure) {
        String query = "select competenza from competenze_procedure where procedura = '" + procedure + "'";
        String[] competencies = new String[100];
        int i = 0;
        try {
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                competencies[i] = rs.getString("competenza");
                i++;
            }
        } catch (SQLException ex) {
            System.out.println("Errore visualizza competenze_procedure:\n" + ex.getMessage());
        }
        return competencies;
    }

    public boolean delete(String competenza) {
        String query = "delete from competenze_procedure where competenza = '" + competenza + "'";
        try {
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println("Errore delete competenze_procedure:\n" + ex.getMessage());
            return false;
        }
    }
    
    
}
