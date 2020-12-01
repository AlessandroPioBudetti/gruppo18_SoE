
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 39392
 */
public class TableType {
    private String type;
    private Statement stm;

    public TableType(Statement stm) {
        this.stm=stm;
    }
     
    public boolean insert(String type){
        StringBuilder temp= new StringBuilder();
        temp.append("insert into Typology(tipo)");
        temp.append("values(");
        temp.append("'").append(type).append("'");
        temp.append(")");
        try{
        stm.executeUpdate(temp.toString());
        return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
  
    public boolean update(String type, String typeUpdate){
        StringBuilder temp= new StringBuilder();
        temp.append("update Typology set tipo=");
        temp.append("'").append(typeUpdate).append("'");
        temp.append(" where tipo=");
        temp.append("'").append(type).append("'");
        try{
        stm.executeUpdate(temp.toString());
        return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean delete(String type){
        StringBuilder temp= new StringBuilder();
        temp.append("delete from Typology ");
        temp.append("where tipo = ");
        temp.append("'").append(type).append("'");
        try{
        stm.executeUpdate(temp.toString());
        return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public ArrayList<String> visualize(){
    StringBuilder temp= new StringBuilder();
    ArrayList <String> types=new ArrayList();
    String type;
        temp.append("select * from Typology");    
        try{
         ResultSet rst=stm.executeQuery(temp.toString());
         while(rst.next()){
             type=rst.getString("tipo");
             types.add(type);
         }     
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
     return types; 
    }
   
}
