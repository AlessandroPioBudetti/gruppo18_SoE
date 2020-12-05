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
public class TableSite {
   
    private Statement stm;

    public TableSite(Statement stm) {
        this.stm=stm;
    }

    public boolean insert(String site){
        StringBuilder temp= new StringBuilder();
        temp.append("insert into Site(name_site)");
        temp.append("values(");
        temp.append("'").append(site).append("'");
        temp.append(")");
        try{
        stm.executeUpdate(temp.toString());
        return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
  
    public boolean update(String site, String siteUpdate){
        StringBuilder temp= new StringBuilder();
        temp.append("update Site set name_site=");
        temp.append("'").append(siteUpdate).append("'");
        temp.append(" where name_site=");
        temp.append("'").append(site).append("'");
        try{
        stm.executeUpdate(temp.toString());
        return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean delete(String site){
        StringBuilder temp= new StringBuilder();
        temp.append("delete from Site ");
        temp.append("where name_site = ");
        temp.append("'").append(site).append("'");
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
    ArrayList <String> sites=new ArrayList();
    String site;
        temp.append("select * from Site");    
        try{
         ResultSet rst=stm.executeQuery(temp.toString());
         while(rst.next()){
             site=rst.getString("name_site");
             sites.add(site);
         }     
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
     return sites; 
    }
}
