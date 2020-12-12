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
    
    public ArrayList<ArrayList> visualize(String settimanaSelezionata, String day, String mantener){
    StringBuilder temp= new StringBuilder();
    ArrayList <ArrayList> disponibilità=new ArrayList();
    Double ottoNove, noveDieci, dieciUndici, undiciDodici, dodiciTredici,quattordiciQuindici, quindiciSedici, sediciDiciassette ;
        temp.append("select * from orari_disponibilità where week=").append(settimanaSelezionata).append(" and maintainer=").append(mantener).append(" and giorno=").append(day); 
        try{
         ArrayList <Double> disp=new ArrayList(); 
         ResultSet rst=stm.executeQuery(temp.toString());
         while(rst.next()){
             ottoNove=rst.getDouble("otto_nove");
             noveDieci=rst.getDouble("nove_dieci");
             dieciUndici=rst.getDouble("dieci_undici");
             undiciDodici=rst.getDouble("undici_dodici");
             quattordiciQuindici=rst.getDouble("quattordici_quindici");
             quindiciSedici=rst.getDouble("quindici_sedici");
             sediciDiciassette=rst.getDouble("sedici_diciassette");
             
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
           // System.out.println(ex.getMessage());
           ArrayList <Double> disp=new ArrayList();
            for(int i=0; i<9; i++)
                disp.add(60.00);
            disponibilità.add(disp);
            return disponibilità;
        }
     return disponibilità; 
    }
    
    
}
