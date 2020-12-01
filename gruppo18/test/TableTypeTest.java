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
/**
 *
 * @author 39392
 */
public class TableTypeTest {
   Statement st;
   TableType t; 
   Dbms db;
   
    @Before
    public void initialization() {
        db = new Dbms();
        st = db.connectToDatabase();
        t = new TableType(st);
    }
   
    @Test
    public void testInsert() {
       assertTrue(t.insert("TYPE"));
       assertTrue(t.insert("TYPE2"));
    }

    @Test
    public void testInsertDuplicate() {
        t.insert("TYPE3");
        assertFalse(t.insert("TYPE3"));
    }
    
    @Test
    public void testUpdateNoDuplicate() {
       assertTrue(t.update("TYPE3","TYPE4"));
    }
   /* 
    @Test
    public void testUpdateDuplicate() {
       assertFalse(t.update("TYPE2","TYPE"));
    }
    */
    @Test
    public void testUpdateUnexisting(){
        assertTrue(t.update("TYPE5", "TYPE6"));
    }
    
    @Test
    public void testDelete(){
        assertTrue(t.delete("TYPE3"));
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
