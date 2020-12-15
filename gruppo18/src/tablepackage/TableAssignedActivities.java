/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablepackage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 39392
 */
public class TableAssignedActivities {
   
    private Statement stm;

    public TableAssignedActivities(Statement stm) {
        this.stm = stm;
    }
    
     public boolean insert(String id, String mantainer){
        StringBuilder temp= new StringBuilder();
        temp.append("insert into attività_assegnate(identificativo, mantainer) ");
        temp.append("values(");
        temp.append("'").append(id).append("'");
        temp.append(")");
        try{
        stm.executeUpdate(temp.toString());
        return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
     
    public ArrayList<ArrayList> visualize(String mantainer){
    StringBuilder temp= new StringBuilder();
    ArrayList <ArrayList> assigned=new ArrayList();
    String id, man;
        temp.append("select * from attività_assegnate where mantainer=").append(mantainer);
        try{
         ArrayList <String> con=new ArrayList(); 
         ResultSet rst=stm.executeQuery(temp.toString());
         while(rst.next()){
             id=rst.getString("identificativo");
             man=rst.getString("mantainer");
             con.add(id);
             con.add(man);
             assigned.add(con);
         }     
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
     return assigned; 
    }
    
}
