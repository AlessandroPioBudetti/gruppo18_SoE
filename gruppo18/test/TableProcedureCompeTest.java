
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import tablepackage.TableCompetencies;
import tablepackage.TableProcedure;
import tablepackage.TableProcedureCompetencies;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ALEX
 */
public class TableProcedureCompeTest {
    
    private Dbms db;
    private Statement st;
    private TableCompetencies tablecomp;
    private TableProcedureCompetencies tablePC;
    private TableProcedure tableproced;
    
    
    @Before
    public void setUp() {
        db = new Dbms();
        st = db.connectToDatabase();
        tablecomp = new TableCompetencies(st);
        tableproced = new TableProcedure(st);
        tablePC = new TableProcedureCompetencies(st);
        tablecomp.insert("compe1");
        tableproced.insertProcedure("proced1", "url");
        tablePC.insertCompToProced("compe1", "proced1");
    }
    
    @Test
    public void testInsertNew(){
        tablecomp.insert("compe2");
        tableproced.insertProcedure("proced2", "url2");
        assertTrue(tablePC.insertCompToProced("compe2", "proced2"));
    }
    
    @Test
    public void testInsertDuplicate(){
        assertFalse(tablePC.insertCompToProced("compe1", "proced1"));
    }
    
    @Test
    public void testDeleteExisting(){
        assertTrue(tablePC.delete("compe1"));
    }
    
    @Test
    public void testDeleteInexisting(){
        assertTrue(tablePC.delete("compe12"));
    }
    
    @After
    public void tearDown() {
        String query = "delete from competenze where nome like 'compe%'";
        String query1 = "delete from procedure_di_manutenzione where nome like 'proced%'";
        try {
            st.executeUpdate(query);
            st.executeUpdate(query1);
            st.close();
            db.getDb().close();
        } catch (SQLException ex) {
            System.out.println("Errore RemovePreviousInser\n" + ex.getMessage());
        }
    }
    
}
