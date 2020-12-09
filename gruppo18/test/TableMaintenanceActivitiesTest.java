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
import tablepackage.TableSite;
import tablepackage.TableType;
/**
 *
 * @author 39392
 */
public class TableMaintenanceActivitiesTest {
   Statement st;
   TableMaintenanceActivities t; 
   TableSite site;
   TableType type; 
   Dbms db;
   
    @Before
    public void initialization() {
        db = new Dbms();
        st = db.connectToDatabase();
        t = new TableMaintenanceActivities(st);
        site = new TableSite(st);
        type = new TableType(st);
    }
   
    @Test
    public void testInsertNew(){
       site.insert("SITE");
       type.insert("TYPE");
       assertTrue(t.insert("ID1", "Planned activity", "TYPE", "SITE", "2", "30", "No"));
    }

    @Test
    public void testInsertDuplicate() {
        site.insert("SITE");
        type.insert("TYPE");
        t.insert("ID1", "Planned activity", "TYPE", "SITE", "2", "30", "No");
        assertFalse(t.insert("ID1", "Planned activity", "TYPE", "SITE", "2", "30", "No"));
    }

    @Test
    public void testUpdateNoDuplicate() {
        site.insert("SITE");
        type.insert("TYPE");
        t.insert("ID1", "Planned activity", "TYPE", "SITE", "2", "30", "No");
        assertTrue(t.update("ID1","ID4", "Planned activity", "TYPE", "SITE", "2", "30", "No"));
    }
    
    @Test
    public void testUpdateDuplicate() {
       site.insert("SITE");
       type.insert("TYPE");
       t.insert("ID2", "Planned activity", "TYPE", "SITE", "2", "30", "No");
       t.insert("ID3", "Planned activity", "TYPE", "SITE", "2", "30", "No");
       assertFalse(t.update("ID2","ID3", "Planned activity", "IDRAULICA", "Nord-Est", "2", "30", "No"));
    }
    
    @Test
    public void testUpdateUnexisting(){
        assertTrue(t.update("ID5","ID2", "Planned activity", "IDRAULICA", "Nord-Est", "2", "30", "No"));
    }
    
    @Test
    public void testDelete(){
        site.insert("SITE");
        type.insert("TYPE");
        t.insert("ID3", "Planned activity", "TYPE", "SITE", "2", "30", "No");
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
