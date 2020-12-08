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
import tablepackage.TableCompetencies;

/**
 *
 * @author sabrina
 */
public class TableCompetenciesTest {
    Dbms db;
    Statement st;
    TableCompetencies tc;
    
    @Before
    public void setUp() {
        db = new Dbms();
        st = db.connectToDatabase();
        tc = new TableCompetencies(st);
        tc.insert("aaaaa");
        tc.insert("aabbb");
    }
    
    @Test
    public void testInsertNew(){ // inserimento di un nuovo valore in competenze
        assertTrue(tc.insert("aaccc"));
    }
    
    @Test
    public void testInsertDuplicate(){ // inserimento di un valore già esistente in competenze
        assertFalse(tc.insert("aaaaa"));
    }
    
    @Test
    public void testUpdate(){ // aggiornamento di un valore con un altro valore non esistente in competenze
        assertTrue(tc.update("aaddd", "aaaaa"));
    }
    
    @Test
    public void testUpdateDuplicate(){ // aggiornamento di un valore con un altro valore già esistente in competenze
        assertFalse(tc.update("aaaaa", "aabbb"));
    }
    
    @Test
    public void testDelete(){  // cancellazione di un elemento esistente in competenze
        assertTrue(tc.delete("aaaaa"));
    }
    
    @Test
    public void testDeleteInexistent(){ // cancellazione di un elemento inesistente in competenze
        assertTrue(tc.delete("aaddd"));
    }
    
    @After
    public void removePreviousInsert() {
        String query = "delete from competenze where nome like 'aa%'";
        try {
            st.executeUpdate(query);
            st.close();
            db.getDb().close();
        } catch (SQLException ex) {
            System.out.println("Errore RemovePreviousInser\n" + ex.getMessage());
        }
    }
}
