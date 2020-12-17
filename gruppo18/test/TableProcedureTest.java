
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import tablepackage.TableProcedure;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALEX
 */
public class TableProcedureTest {
    
    private Dbms db;
    private Statement st;
    private TableProcedure tableproc;
    
    @Before
    public void setUp() {
        db = new Dbms();
        st = db.connectToDatabase();
        tableproc = new TableProcedure(st);
        tableproc.insertProcedure("proced", "url");
        tableproc.insertProcedure("proced2", "url2");
    }
    
    @Test
    public void testInsertNew(){ // inserimento di un nuovo valore in procedure_di_manutenzione
        assertTrue(tableproc.insertProcedure("proced3", "url3"));
    }
    
    @Test
    public void testInsertDuplicate(){ // inserimento di un valore già esistente in procedure_di_manutenzione
        assertFalse(tableproc.insertProcedure("proced","url"));
    }
    
    @Test
    public void testUpdate(){ // aggiornamento di un valore con un altro valore non esistente in procedure_di_manutenzione
        assertTrue(tableproc.updateProcedure("proced4", "url4", "proced"));
    }
    
    @Test
    public void testUpdateDuplicate(){ // aggiornamento di un valore con un altro valore già esistente in procedure_di_manutenzione
        assertFalse(tableproc.updateProcedure("proced", "url","proced2"));
    }
    
    @Test
    public void testDelete(){  // cancellazione di un elemento esistente in procedure_di_manutenzione
        assertTrue(tableproc.deleteProcedure("proced"));
    }
    
    @Test
    public void testDeleteInexistent(){ // cancellazione di un elemento inesistente in procedure_di_manutenzione
        assertTrue(tableproc.deleteProcedure("proced321"));
    }
    
    @After
    public void removePreviousInsert() {
        String query = "delete from procedure_di_manutenzione where nome like 'proced%'";
        try {
            st.executeUpdate(query);
            st.close();
            db.getDb().close();
        } catch (SQLException ex) {
            System.out.println("Errore RemovePreviousInser\n" + ex.getMessage());
        }
    }
}
