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
 * @author sabrina
 */
public class TableCompetenzeMaintainers {
    private Statement st;

    public TableCompetenzeMaintainers(Statement st) {
        this.st = st;
    }

    public boolean insert(String mantainer, String competenza) {
        String query = "insert into competenze_manutentore values('" + mantainer + "','" + competenza + "')";
        try {
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println("Errore inserimento competenze_manutentore:\n" + ex);
            return false;
        }
    }

    public String[] visualizeCompetencies(String mantainer) {
        String query = "select competenza from competenze_manutentore where manutentore = '" + mantainer + "'";
        String[] competencies = new String[100];
        int i = 0;
        try {
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                competencies[i] = rs.getString("competenza");
                i++;
            }
        } catch (SQLException ex) {
            System.out.println("Errore visualizza competenze_manutentore:\n" + ex.getMessage());
        }
        return competencies;
    }

    public boolean delete(String competenza, String mantainer) {
        String query = "delete from competenze_manutentore where competenza = '" + competenza + "' and manutentore = '"+mantainer+"'";
        try {
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println("Errore delete competenze_manutentore:\n" + ex.getMessage());
            return false;
        }
    }
    
}
