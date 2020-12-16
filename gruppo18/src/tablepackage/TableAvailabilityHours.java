/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablepackage;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;


/**
 *
 * @author 39392
 */
public class TableAvailabilityHours {
    
    private Statement stm;
    
    public TableAvailabilityHours(Statement stm) {
             
        this.stm = stm;
    }
    
     public boolean insertDefault(String mantener, int week, String day){
        StringBuilder temp= new StringBuilder();
        temp.append("insert into orari_disponibilità(maintainer, week, giorno) ");      
        temp.append("values(");
        temp.append("'").append(mantener).append("',");
        temp.append(" '").append(week).append("',");
        temp.append(" '").append(day).append("'");
        temp.append(")");
        try{
        stm.executeUpdate(temp.toString());
        return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            //Se già esiste questa riga
            
            return false;
        }
    }
    
     public boolean update(String mantener, int week, String day, int attributeHours, int time){
        StringBuilder temp= new StringBuilder();
        temp.append("update orari_disponibilità set ").append(getAttributeHours(attributeHours)).append("=");
        temp.append("'").append(time).append("'");
        temp.append(" where maintainer=");
        temp.append("'").append(mantener).append("'");
        temp.append(" and week=");
        temp.append("'").append(week).append("'");
        temp.append(" and giorno=");
        temp.append("'").append(day).append("'");
        
        try{
        stm.executeUpdate(temp.toString());
        return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public ArrayList<ArrayList> visualize(int week, String day, String mantener){
    StringBuilder temp= new StringBuilder();
    ArrayList <ArrayList> disponibilità=new ArrayList();
    int ottoNove, noveDieci, dieciUndici, undiciDodici, dodiciTredici,quattordiciQuindici, quindiciSedici, sediciDiciassette;
    temp.append("select * from orari_disponibilità where maintainer='").append(mantener).append("' and  week='").append(week).append("' and giorno='").append(day).append("'"); 
        try{
         ResultSet rst=stm.executeQuery(temp.toString());
         while(rst.next()){
             ArrayList <Integer> disp=new ArrayList(); 
             ottoNove=rst.getInt("otto_nove");
             noveDieci=rst.getInt("nove_dieci");
             dieciUndici=rst.getInt("dieci_undici");
             undiciDodici=rst.getInt("undici_dodici");
             quattordiciQuindici=rst.getInt("quattordici_quindici");
             quindiciSedici=rst.getInt("quindici_sedici");
             sediciDiciassette=rst.getInt("sedici_diciassette");
             
             disp.add(ottoNove);
             disp.add(noveDieci);
             disp.add(dieciUndici);
             disp.add(undiciDodici);
             disp.add(quattordiciQuindici);
             disp.add(quindiciSedici);
             disp.add(sediciDiciassette);
             disponibilità.add(disp);
         }     
        }catch(SQLException ex){
           System.out.println(ex.getMessage());
        }
        return disponibilità; 
    }
  
    
    
    public int getSumMinDisp(String mantener,int week, String day) {
    StringBuilder temp= new StringBuilder();
    temp.append("select * from orari_disponibilità where maintainer='").append(mantener).append("' and  week='").append(week).append("' and giorno='").append(day).append("'"); 
    int sumMinDisp=0;
    int ottoNove=0, noveDieci=0, dieciUndici=0, undiciDodici=0,quattordiciQuindici=0, quindiciSedici=0, sediciDiciassette=0;
        try {
            ResultSet rst=stm.executeQuery(temp.toString());
            while(rst.next()){
             System.out.println("Sono qui1");
             ottoNove=rst.getInt("otto_nove");
             noveDieci=rst.getInt("nove_dieci");
             dieciUndici=rst.getInt("dieci_undici");
             undiciDodici=rst.getInt("undici_dodici");
             quattordiciQuindici=rst.getInt("quattordici_quindici");
             quindiciSedici=rst.getInt("quindici_sedici");
             sediciDiciassette=rst.getInt("sedici_diciassette");  
             sumMinDisp=ottoNove+noveDieci+dieciUndici+undiciDodici+quattordiciQuindici+quindiciSedici+sediciDiciassette;
             System.out.println("Sono qui2");
            }
        } catch (SQLException ex) {
           
           System.out.println("ERRORE"+ex.getMessage());
        }
       
        return sumMinDisp;
    }

 private String getAttributeHours(int attributeHoursN){
    switch (attributeHoursN){
		case 2: 
                   return "otto_nove";
		case 3: 
                   return "nove_dieci";
		case 4: 
                    return "dieci_undici";
		case 5: 
                    return "undici_dodici";
                case 6: 
                    return "quattordici_quindici";
                case 7: 
                   return "quindici_sedici";
                case 8: 
                   return "sedici_diciassette";
    } 
   return ""; 
   }
}