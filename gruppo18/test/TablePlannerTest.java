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
import org.junit.Before;

/**
 *
 * @author sabrina
 */
public class TablePlannerTest {
    Dbms db;
    Statement st;
    TablePlanner tp;

    @Before
    public void initialization() {
        db = new Dbms();
        st = db.connectToDatabase();
        tp = new TablePlanner(st);
        tp.insert("giovanni", "aaak");
        tp.insert("giovanni2", "bbbb");
    }

    @Test
    public void testInsertNew() {
        assertTrue(tp.insert("giovanni1", "aaakl"));
    }

    @Test
    public void testInsertDuplicate() {
        assertFalse(tp.insert("giovanni", "aaak"));
    }

    @Test
    public void testFindExistingPlanner(){
        char[] pass= { 'a','a','a','k'};
        assertTrue(tp.selectPl("giovanni", pass));
    }
    
    @Test
    public void testFindUnexistingPlanner(){
        char[] pass= { 'a','a','a'};
        assertFalse(tp.selectPl("giovanni", pass));
    }
    
    
    @Test 
    public void testGetExistingPassword(){
        String pass="aaak";
        assertEquals(pass,tp.getPassword("giovanni"));
    }
    
    @Test 
    public void testGetUnexistingPassword(){
        String pass=null;
        assertEquals(tp.getPassword("giovanni1"),pass);
    }
    
    @Test 
    public void testUpdateExistingPlanner(){
        assertTrue(tp.update("giovanni3", "aaak", "giovanni"));
    }
    
    @Test 
    public void testUpdateUnexistingPlanner(){
        assertTrue(tp.update("giovanni7", "aaak", "giovanni1"));
    }
    
    @Test 
    public void testUpdateWithDuplicatePassword(){
        assertFalse(tp.update("giovanni5", "bbbb", "giovanni"));
    }
    
    @Test
    public void deleteExistingPlanner(){
        assertTrue(tp.delete("giovanni"));
    }
    
    @Test
    public void deleteUnexistingPlanner(){
        assertTrue(tp.delete("giovanni4"));
    }
    
    @After
    public void removePreviousInsert() {
        String query = "delete from planner where username like 'giovanni%'";
        try {
            st.executeUpdate(query);
            st.close();
            db.getDb().close();
        } catch (SQLException ex) {
            System.out.println("Errore RemovePreviousInser\n" + ex.getMessage());
        }
    }

}
