/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import tablepackage.TableCompetencies;
import tablepackage.TableCompetenzeAttività;
import tablepackage.TableMaintenanceActivities;
import tablepackage.TableSite;

/**
 *
 * @author sabrina
 */
public class TableCompetenzeAttivitàTest {
    
    private Dbms db;
    private Statement st;
    private TableCompetencies tc;
    private TableCompetenzeAttività tca;
    private TableMaintenanceActivities tma;
    private TableSite ts;
    
    @Before
    public void setUp() {
        db = new Dbms();
        st = db.connectToDatabase();
        tc = new TableCompetencies(st);
        tca = new TableCompetenzeAttività(st);
        tma = new TableMaintenanceActivities(st);
        ts = new TableSite(st);
        ts.insert("xxx");
        tc.insert("aaaaa");
        tma.insert("ID1", "Planned activity", "IDRAULICA", "xxx", "2", "30", "No","asdfgh");
        tca.insert("aaaaa", "ID1");
    }
    
    @Test
    public void testInsertNew(){
        tc.insert("aabbb");
        tma.insert("ID2", "Planned activity", "IDRAULICA", "xxx", "20", "310", "Yes","asdfgh");
        assertTrue(tca.insert("aabbb", "ID2"));
    }
    
    @Test
    public void testInsertDuplicate(){
        assertFalse(tca.insert("aaaaa", "ID1"));
    }
    
    @Test
    public void testDeleteExisting(){
        assertTrue(tca.delete("aaaaa","ID1"));
    }
    
    @Test
    public void testDeleteInexisting(){
        assertTrue(tca.delete("aaddd","ID2"));
    }
    
    @After
    public void tearDown() {
        String query = "delete from competenze where nome like 'aa%'";
        String query1 = "delete from manutenzione where identificativo like 'ID%'";
        String query2 = "delete from site where name_site = 'xxx'";
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
