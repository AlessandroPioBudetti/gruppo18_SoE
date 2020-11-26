/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sabrina
 */
public class TablePlannerTest {

    Statement st;
    TablePlanner tp;

    public TablePlannerTest() {
        Dbms db = new Dbms();
        st = db.connectToDatabase();
        tp = new TablePlanner(st);
    }

    @Test
    public void testInsertNew() {
        assertTrue(tp.insert("giovanni1", "aaakl"));
    }

    @Test
    public void testInsertDuplicate() {
        tp.insert("giovanni", "aaak");
        assertFalse(tp.insert("giovanni", "aaak"));
    }

    @After
    public void removePreviousInsert() {
        String query = "delete from planner where username = 'giovanni1'";
        String query1= "delete from planner where username = 'giovanni'";
        try {
            st.executeUpdate(query);
            st.executeUpdate(query1);
            st.close();
        } catch (SQLException ex) {
            System.out.println("Errore RemovePreviousInser\n"+ex.getMessage());
        }
    }

}
