/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import tablepackage.TableMaintenanceActivities;
/**
 *
 * @author 39392
 */
public class TableMaintenanceActivitiesTest {
   Statement st;
   TableMaintenanceActivities t; 
   Dbms db;
   
    @Before
    public void initialization() {
        db = new Dbms();
        st = db.connectToDatabase();
        t = new TableMaintenanceActivities(st);
    }
   
    @Test
    public void testInsertNew(){
       assertTrue(t.insert("ID1", "Planned activity", "IDRAULICA", "Nord-Est", "2", "30", "No"));
    }

    @Test
    public void testInsertDuplicate() {
        t.insert("ID1", "Planned activity", "IDRAULICA", "Nord-Est", "2", "30", "No");
        assertFalse(t.insert("ID1", "Planned activity", "IDRAULICA", "Nord-Est", "2", "30", "No"));
    }

    @Test
    public void testUpdateNoDuplicate() {
        t.insert("ID1", "Planned activity", "IDRAULICA", "Nord-Est", "2", "30", "No");
        assertTrue(t.update("ID1","ID4", "Planned activity", "IDRAULICA", "Nord-Est", "2", "30", "No"));
    }
    
    @Test
    public void testUpdateDuplicate() {
       t.insert("ID2", "Planned activity", "IDRAULICA", "Nord-Est", "2", "30", "No");
       t.insert("ID3", "Planned activity", "IDRAULICA", "Nord-Est", "2", "30", "No");
       assertFalse(t.update("ID2","ID3", "Planned activity", "IDRAULICA", "Nord-Est", "2", "30", "No"));
    }
    
    @Test
    public void testUpdateUnexisting(){
        assertTrue(t.update("ID5","ID2", "Planned activity", "IDRAULICA", "Nord-Est", "2", "30", "No"));
    }
    
    @Test
    public void testDelete(){
        t.insert("ID3", "Planned activity", "IDRAULICA", "Nord-Est", "2", "30", "No");
        assertTrue(t.delete("ID3"));
    }
    
    @Test
    public void testDeleteUnexisting(){
        assertTrue(t.delete("ID5"));
    }

    @After
    public void removePreviousInsert() {
        String query = "delete from manutenzione where identificativo like 'ID%'";
        try {
            st.executeUpdate(query);
            st.close();
            db.getDb().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    
}
