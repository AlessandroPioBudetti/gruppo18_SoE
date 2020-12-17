/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;
import tablepackage.TableCompetencies;
import tablepackage.TableCompetenciesActivity;
import tablepackage.TableCompetenciesMaintainers;
import tablepackage.TableMantainer;

/**
 *
 * @author sabrina
 */
public class TableCompetenciesMaintainersTest {

    private Dbms db;
    private Statement st;
    private TableCompetencies tc;
    private TableCompetenciesMaintainers tcm;
    private TableMantainer tm;

    @Before
    public void setUp() {
        db = new Dbms();
        st = db.connectToDatabase();
        tc = new TableCompetencies(st);
        tcm = new TableCompetenciesMaintainers(st);
        tm = new TableMantainer(st);
        tc.insert("aaaaa");
        tm.insert("giovanni1", "aaaa");
        tcm.insert("giovanni1", "aaaaa");
    }

    @Test
    public void testInsertNew() {
        tc.insert("aabbb");
        assertTrue(tcm.insert("giovanni1", "aabbb"));
    }

    @Test
    public void testInsertDuplicate(){
        assertFalse(tcm.insert("giovanni1", "aaaaa"));
    }
    
    @Test
    public void testDeleteExitsting(){
        assertTrue(tcm.delete("aaaaa", "giovanni1"));
    }
    
    @Test
    public void testDeleteInexisting(){
        assertTrue(tcm.delete("aabbb", "giovanni"));
    }
            
    
    @After
    public void tearDown() {
        String query = "delete from competenze where nome like 'aa%'";
        String query1 = "delete from mantainer where username like 'giovanni%'";
        try {
            st.executeUpdate(query);
            st.executeUpdate(query1);
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
