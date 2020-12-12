
import java.sql.SQLException;
import java.sql.Statement;
import tablepackage.TableAvailabilityDay;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import tablepackage.TableMantainer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 39392
 */
public class TableAvailabilityTest {
   Statement st;
   TableAvailabilityDay a; 
   TableMantainer m;
   Dbms db;

     @Before
    public void initialization() {
        db = new Dbms();
        st = db.connectToDatabase();
        a = new TableAvailabilityDay(st);
         m=new TableMantainer(st);
    }
   
    @Test
    public void testInsert() {
        m.insert("USERNAME", "PASS");
       assertTrue(a.insertMaintainerInAvailability("USERNAME"));
    }

    @Test
    public void testInsertDuplicate() {
        m.insert("USERNAME", "PASS");
        a.insertMaintainerInAvailability("USERNAME");
        assertFalse(a.insertMaintainerInAvailability("USERNAME"));
    }
  
    @After
    public void removePreviousInsert() {
        String query = "delete from Mantainer where username='USERNAME'";
        String query1 = "delete from Disponibilità where manutentore='USERNAME'";
        try {
            st.executeUpdate(query);
            st.executeUpdate(query1);
            st.close();
            db.getDb().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }  
   
   
   
}
