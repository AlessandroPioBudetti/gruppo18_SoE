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
public class TableAvailabilityDay {

    private Statement stm;

    public TableAvailabilityDay(Statement stm) {
        this.stm = stm;
    }

    public boolean insertMaintainerInAvailability(String mantainer) {
        try {
        for (int i = 1; i <= 52; i++) {
            StringBuilder temp = new StringBuilder();
            temp.append("insert into Disponibilità(manutentore, settimana)");
            temp.append("values(");
            temp.append("'").append(mantainer).append("',");
            temp.append(i);
            temp.append(")");
            stm.executeUpdate(temp.toString());
        }    
            return true;
        } catch (SQLException ex) {
            System.out.println("Errore insertMaintainerInAvailability\n"+ex.getMessage());
            return false;
        }
    }

    
     public boolean update(String mantener, int week, int dayAttr, String percentuale){
        StringBuilder temp= new StringBuilder();
        
        temp.append("update Disponibilità set ").append(getAttributeDay(dayAttr)).append("=");
        temp.append("'").append(percentuale.replaceAll("[ %]", "")).append("'");
        temp.append(" where manutentore=");
        temp.append("'").append(mantener).append("'");
        temp.append(" and settimana=");
        temp.append("'").append(week).append("'");
        try{
        stm.executeUpdate(temp.toString());
        return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
     
    public ArrayList<ArrayList> visualize(int week){
        StringBuilder temp = new StringBuilder();
        ArrayList<ArrayList> disponibilità = new ArrayList();
        String manutentore, settimana, lunedì, martedì, mercoledì, giovedì, venerdì, sabato, domenica;
        temp.append("select * from Disponibilità where settimana='").append(week).append("'");
        try {
            ResultSet rst = stm.executeQuery(temp.toString());
            while (rst.next()) {
                ArrayList<String> con = new ArrayList();
                manutentore = rst.getString("manutentore");
                lunedì = rst.getString("lunedì");
                martedì = rst.getString("martedì");
                mercoledì = rst.getString("mercoledì");
                giovedì = rst.getString("giovedì");
                venerdì = rst.getString("venerdì");
                sabato = rst.getString("sabato");
                domenica = rst.getString("domenica");
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
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return disponibilità;
    }

    public String getPercentuale(String mantener, int week, int attr) {
         
        String query = "select * from Disponibilità where manutentore='"+mantener+"'"+" and settimana='"+week+"'";
        String percentuale;
                try {
            ResultSet rst = stm.executeQuery(query);
            rst.next();
            percentuale=rst.getString(getAttributeDay(attr)); 
            return percentuale;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return "";

        }
           
    }
    
    private String getAttributeDay(int attributeDay){
    switch (attributeDay){
		case 2: 
                   return "lunedì";
		case 3: 
                   return "martedì";
		case 4: 
                    return "mercoledì";
		case 5: 
                    return "giovedì";
                case 6: 
                    return "venerdì";
                case 7: 
                   return "sabato";
                case 8: 
                   return "domenica";
    } 
   return ""; 
   }
    
    
}
