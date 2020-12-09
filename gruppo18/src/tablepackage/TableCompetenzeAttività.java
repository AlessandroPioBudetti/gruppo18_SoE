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
public class TableCompetenzeAttività {

    Statement st;

    public TableCompetenzeAttività(Statement st) {
        this.st = st;
    }

    public boolean insert(String competenza, String attività) {
        String query = "insert into competenze_attività values('" + attività + "','" + competenza + "')";
        try {
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println("Errore inserimento competenza_attività:\n" + ex);
            return false;
        }
    }

    public String[] visualizeCompetencies(String attività) {
        String query = "select competenza from competenze_attività where attività = '" + attività + "'";
        String[] competencies = new String[100];
        int i = 0;
        try {
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                competencies[i] = rs.getString("competenza");
                i++;
            }
        } catch (SQLException ex) {
            System.out.println("Errore visualizza competenze_attività:\n" + ex.getMessage());
        }
        return competencies;
    }

    public boolean delete(String competenza, String attività) {
        String query = "delete from competenze_attività where competenza = '" + competenza + "' and attività = '"+ attività+"'";
        try {
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println("Errore delete competenze_attività:\n" + ex.getMessage());
            return false;
        }
    }
}
