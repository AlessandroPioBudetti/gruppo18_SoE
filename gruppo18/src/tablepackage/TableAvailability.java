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
public class TableAvailability {
   private Statement stm;

    public TableAvailability(Statement stm) {
        this.stm = stm;
    }
    
     public ArrayList<ArrayList> visualize(String settimanaSelezionata){
    StringBuilder temp= new StringBuilder();
    ArrayList <ArrayList> disponibilità=new ArrayList();
    String manutentore, settimana, lunedì, martedì, mercoledì, giovedì, venerdì, sabato, domenica;
        temp.append("select * from Disponibilità where settimana=").append(settimanaSelezionata).append("or settimana=0");
        
        try{
         ResultSet rst=stm.executeQuery(temp.toString());
         while(rst.next()){
             ArrayList <Object> con=new ArrayList();
             manutentore=rst.getString("manutentore");
           
             lunedì=rst.getString("lunedì");
             martedì=rst.getString("martedì");
             mercoledì=rst.getString("mercoledì");
             giovedì=rst.getString("giovedì");
             venerdì=rst.getString("venerdì");
             sabato=rst.getString("sabato");
             domenica=rst.getString("domenica");
             con.add(manutentore);
             con.add(lunedì);
             con.add(martedì);
             con.add(mercoledì);
             con.add(giovedì);
             con.add(venerdì);
             con.add(sabato);
             con.add(domenica);
             disponibilità.add(con);
         }     
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
     return disponibilità; 
    }
    
    //questo metodo va nella classe tableCompetenzeManutentore
     public ArrayList<String> visualizeSkillsMaintenance(String manutentore){
    StringBuilder temp= new StringBuilder();
    ArrayList <String> competencies=new ArrayList();
    String skill;
    temp.append("select competenza from competenze_manutentore where manutentore = '").append(manutentore).append("'");    
        try{
         ResultSet rst=stm.executeQuery(temp.toString());
         while(rst.next()){
            skill=rst.getString("competenza");
            competencies.add(skill);
         }     
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
     return competencies; 
    }
    
   
}
