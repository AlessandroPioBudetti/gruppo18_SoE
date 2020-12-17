
import java.sql.SQLException;
import java.sql.Statement;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import tablepackage.TableSite;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 39392
 */
public class TableSiteTest {
   private Statement st;
   private TableSite s; 
   private Dbms db;
   
    @Before
    public void initialization() {
        db = new Dbms();
        st = db.connectToDatabase();
        s = new TableSite(st);
    }
   
    @Test
    public void testInsert() {
       assertTrue(s.insert("SITE"));
    }

    @Test
    public void testInsertDuplicate() {
        s.insert("SITE");
        assertFalse(s.insert("SITE"));
    }
    
    @Test
    public void testUpdateNoDuplicate() {
       s.insert("SITE1");
       s.insert("SITE2");
       assertTrue(s.update("SITE1","SITE"));
    }
   
    @Test
    public void testUpdateDuplicate() {
       s.insert("SITE1");
       s.insert("SITE2");
       assertFalse(s.update("SITE2","SITE1"));
    }
    
    @Test
    public void testUpdateUnexisting(){
        assertTrue(s.update("SITE5", "SITE6"));
    }
    
    @Test
    public void testDelete(){
        s.insert("SITE");
        assertTrue(s.delete("SITE"));
    }
    
    @Test
    public void testDeleteUnexisting(){
        assertTrue(s.delete("SITE6"));
    }
    
    @After
    public void removePreviousInsert() {
        String query = "delete from Site where name_site like 'SITE%'";
        try {
            st.executeUpdate(query);
            st.close();
            db.getDb().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }  
}
