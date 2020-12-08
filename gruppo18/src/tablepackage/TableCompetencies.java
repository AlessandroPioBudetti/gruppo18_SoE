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
public class TableCompetencies {

    Statement st;

    public TableCompetencies(Statement st) {
        this.st = st;
    }

    public boolean insert(String Name) {
        String query = "insert into competenze values('" + Name + "')";
        try {
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println("Errore inserimento competenza:\n" + ex);
            return false;
        }
    }

    public String[] visualizeCompetencies() {
        String query = "select * from competenze";
        String[] competencies = new String[100];
        int i = 0;
        try {
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                competencies[i] = rs.getString("nome");
                i++;
            }
        } catch (SQLException ex) {
            System.out.println("Errore visualizza competenze:\n"+ex.getMessage());
        }
        return competencies;
    }

    public boolean update(String Name, String oldName) {
        String query = "update competenze set nome = '" + Name + "' where nome = '" + oldName + "'";
        try {
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println("Errore aggiornamento competenza:\n"+ex.getMessage());
            return false;
        }

    }

    public boolean delete(String Name) {
        String query = "delete from competenze where nome = '" + Name + "'";
        try {
            st.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            System.out.println("Errore delete competenze:\n" + ex.getMessage());
            return false;
        }
    }
}
