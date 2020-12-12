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
import tablepackage.TableProcedure;
import tablepackage.TableProcedureActivity;
import tablepackage.TableProcedureCompetencies;
import tablepackage.TableSite;

/**
 *
 * @author ALEX
 */
public class TableProcedureActivityTest {
    
    Dbms db;
    Statement st;
    TableProcedureActivity tablePA;
    TableProcedure tableproced;
    TableMaintenanceActivities tableMA;
    TableSite tableS;
    
    
    @Before
    public void setUp() {
        db = new Dbms();
        st = db.connectToDatabase();
        tableproced = new TableProcedure(st);
        tablePA = new TableProcedureActivity(st);
        tableS = new TableSite(st);
        tableMA = new TableMaintenanceActivities(st);
        tableS.insert("xxx");
        tableproced.insertProcedure("proced1", "url");
        tableMA.insert("ID1", "Planned activity", "IDRAULICA", "xxx", "2", "30", "No","asdfgh");
        tablePA.insertProcToAct("ID1", "proced1");
    }
    
    @Test
    public void testInsertNew(){
        tableproced.insertProcedure("proced2", "url2");
        tableMA.insert("ID2", "Planned activity", "IDRAULICA", "xxx", "20", "310", "Yes","asdfgh");
        assertTrue(tablePA.insertProcToAct("ID2", "proced2"));
    }
    
    @Test
    public void testInsertDuplicate(){
        assertFalse(tablePA.insertProcToAct("ID1", "proced2"));
    }
    
    @Test
    public void testDeleteExisting(){
        assertTrue(tablePA.delete("ID1"));
    }
    
    @Test
    public void testDeleteInexisting(){
        assertTrue(tablePA.delete("ID12321"));
    }
    
    @After
    public void tearDown() {
        String query = "delete from procedure_di_manutenzione where nome like 'proced%'";
        String query1 = "delete from manutenzione where identificativo like 'ID%'";
        String query2= "delete from site where name_site = 'xxx'";
        try {
            st.executeUpdate(query);
            st.executeUpdate(query1);
            st.executeUpdate(query2);
            st.close();
            db.getDb().close();
        } catch (SQLException ex) {
            System.out.println("Errore RemovePreviousInser\n" + ex.getMessage());
        }
    }
    
}
