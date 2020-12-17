/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 39392
 */

import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import tablepackage.TableAvailabilityDay;
import tablepackage.TableAvailabilityHours;
import tablepackage.TableMantainer;


public class TableAvailabilityHoursTest {
    private Statement st;
    private TableAvailabilityHours t; 
    private TableMantainer tm;
    private TableAvailabilityDay a;
    private Dbms db;
   
    @Before
    public void initialization() {
        db = new Dbms();
        st = db.connectToDatabase();
        t = new TableAvailabilityHours(st);
        tm = new TableMantainer(st);
         a = new TableAvailabilityDay(st);
    }
   
    @Test
    public void testInsert() {
       tm.insert("MANTAINER1", "PSW");
       a.insertMaintainerInAvailability("MANTAINER1");
       assertTrue(t.insertDefault("MANTAINER1",1,"MONDAY"));
    }

    @Test
    public void testInsertDuplicate() {
        tm.insert("MANTAINER1", "PSW");
        a.insertMaintainerInAvailability("MANTAINER1");
        t.insertDefault("MANTAINER1",1,"MONDAY");
        assertFalse(t.insertDefault("MANTAINER1",1,"MONDAY"));
        
    }
  
    @Test
    public void testUpdateUnexisting(){  
        tm.insert("MANTAINER1", "PSW");
        a.insertMaintainerInAvailability("MANTAINER1");
        assertTrue(t.update("MANTAINER1",1,"MONDAY",2,30));
    }
      
    @After
    public void removePreviousInsert() {
        String query= "delete from Disponibilità where manutentore='MANTAINER1'";
        String query1= "delete from orari_disponibilità where maintainer='MANTAINER1'";
        String query2 = "delete from mantainer where username like 'MANTAINER%'";
        try {
            st.executeUpdate(query);
            st.executeUpdate(query1);
            st.executeUpdate(query2);
            st.close();
            db.getDb().close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
