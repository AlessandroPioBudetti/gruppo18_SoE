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
import tablepackage.TableType;
/**
 *
 * @author 39392
 */
public class TableTypeTest {
   private Statement st;
   private TableType t; 
   private Dbms db;
   
    @Before
    public void initialization() {
        db = new Dbms();
        st = db.connectToDatabase();
        t = new TableType(st);
    }
   
    @Test
    public void testInsert() {
       assertTrue(t.insert("TYPE"));
    }

    @Test
    public void testInsertDuplicate() {
        t.insert("TYPE");
        assertFalse(t.insert("TYPE"));
    }
    
    @Test
    public void testUpdateNoDuplicate() {
       t.insert("TYPE1");
       t.insert("TYPE2");
       assertTrue(t.update("TYPE1","TYPE"));
    }
   
    @Test
    public void testUpdateDuplicate() {
       t.insert("TYPE1");
       t.insert("TYPE2");
       assertFalse(t.update("TYPE2","TYPE1"));
    }
    
    @Test
    public void testUpdateUnexisting(){
        assertTrue(t.update("TYPE5", "TYPE6"));
    }
    
    @Test
    public void testDelete(){
        t.insert("TYPE");
        assertTrue(t.delete("TYPE"));
    }
    
    @Test
    public void testDeleteUnexisting(){
        assertTrue(t.delete("TYPE6"));
    }
    
    @After
    public void removePreviousInsert() {
        String query = "delete from Typology where tipo like 'TYPE%'";
        try {
            st.executeUpdate(query);
            st.close();
            db.getDb().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
