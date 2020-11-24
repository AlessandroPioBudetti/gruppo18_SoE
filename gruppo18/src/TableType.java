
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
    private String idType;
    private String type;
    private Statement stm;

    public TableType(Statement stm, Random R) {
        int len=1+R.nextInt(15);
        this.idType= randomString(3,R);
        this.stm=stm;
    }
     
    public void getInsertQuery(String type){
        StringBuilder temp= new StringBuilder();
        temp.append("insert into Type(idType, type)");
        temp.append("values(");
        temp.append("'").append(idType).append("',");
        temp.append("'").append(type).append("'");
        temp.append(")");
        try{
        stm.executeUpdate(temp.toString());
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
  
    public void update(String type, String typeUpdate){
        StringBuilder temp= new StringBuilder();
        temp.append("update Type set type=");
        temp.append(typeUpdate);
        temp.append("where type=");
        temp.append(type);
        try{
        stm.executeUpdate(temp.toString());
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void delete(String type){
        StringBuilder temp= new StringBuilder();
        temp.append("delete from Type");
        temp.append("where type=");
        temp.append(type);
        try{
        stm.executeUpdate(temp.toString());
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public ArrayList<String> visualize(){
    StringBuilder temp= new StringBuilder();
    ArrayList <String> types=new ArrayList();
    String type;
        temp.append("select * from Type");    
        try{
         ResultSet rst=stm.executeQuery(temp.toString());
         while(rst.next()){
             type=rst.getString("type");
             types.add(type);
         }     
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
     return types; 
    }
    
   public String randomString(int len, Random R) {
    String lowerLetters = "abcdefghilmnopqrstuvz";
    StringBuilder temp = new StringBuilder();
    temp.setLength(0);
    while (temp.length() < len) {
      temp.append(lowerLetters.charAt(R.nextInt(lowerLetters.length())));
    }
    return temp.toString();
  }
}
