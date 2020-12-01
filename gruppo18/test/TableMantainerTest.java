/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sabrina
 */
public class TableMantainerTest {
   Dbms db;
    Statement st;
    TableMantainer tm;

    @Before
    public void initialization() {
        db = new Dbms();
        st = db.connectToDatabase();
        tm = new TableMantainer(st);
        tm.insert("giovanni", "aaak");
        tm.insert("giovanni2", "bbbb");
    }

    @Test
    public void testInsertNew() {
        assertTrue(tm.insert("giovanni1", "aaakl"));
    }

    @Test
    public void testInsertDuplicate() {
        assertFalse(tm.insert("giovanni", "aaak"));
    }

    @Test
    public void testFindExistingMantainer(){
        char[] pass= { 'a','a','a','k'};
        assertTrue(tm.selectMaint("giovanni", pass));
    }
    
    @Test
    public void testFindUnexistingMantainer(){
        char[] pass= { 'a','a','a'};
        assertFalse(tm.selectMaint("giovanni", pass));
    }
    
    
    @Test 
    public void testGetExistingPassword(){
        String pass="aaak";
        assertEquals(pass,tm.getPassword("giovanni"));
    }
    
    @Test 
    public void testGetUnexistingPassword(){
        String pass=null;
        assertEquals(tm.getPassword("giovanni1"),pass);
    }
    
    @Test 
    public void testUpdateExistingMantainer(){
        assertTrue(tm.update("giovanni3", "aaak", "giovanni"));
    }
    
    @Test 
    public void testUpdateUnexistingMantainer(){
        assertTrue(tm.update("giovanni7", "aaak", "giovanni1"));
    }
    
    @Test 
    public void testUpdateWithDuplicatePassword(){
        assertFalse(tm.update("giovanni5", "bbbb", "giovanni"));
    }
    
    @Test
    public void deleteExistingMantainer(){
        assertTrue(tm.delete("giovanni"));
    }
    
    @Test
    public void deleteUnexistingMantainer(){
        assertTrue(tm.delete("giovanni4"));
    }
    
    @After
    public void removePreviousInsert() {
        String query = "delete from mantainer where username like 'giovanni%'";
        try {
            st.executeUpdate(query);
            st.close();
            db.getDb().close();
        } catch (SQLException ex) {
            System.out.println("Errore RemovePreviousInser\n" + ex.getMessage());
        }
    }
}
