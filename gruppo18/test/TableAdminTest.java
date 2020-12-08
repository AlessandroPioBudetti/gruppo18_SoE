/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import java.sql.Statement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tablepackage.TableAdministrator;

/**
 *
 * @author ALEX
 */
public class TableAdminTest {
    Statement st;
    TableAdministrator admin;
    Dbms db;
    
    @Before
    public void iniz(){
        db = new Dbms();
        st = db.connectToDatabase();
        admin = new TableAdministrator(st);
    }
   
    
    @Test
    //Il test passa correttamente se il nostro Admin è presente.
    public void testAdminPresente(){
        char[] password = {'0','9','8','7','6'};
        assertTrue(admin.selectAdm("asdfgh",password));
        }
    @Test
    //Il test passa correttamente se il nostro Admin non è presente.
    public void testAdminNonPresente(){
        char[] password = {'0','9','8','7','6'};  
        assertFalse(admin.selectAdm("asdfg",password));
        }
    
    @After
    public void chiudiDb(){
        try{
            st.close();
            db.getDb().close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
}
