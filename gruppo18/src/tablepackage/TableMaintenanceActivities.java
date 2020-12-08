package tablepackage;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 39392
 */
public class TableMaintenanceActivities {
   private Statement stm;
   
   
    public TableMaintenanceActivities(Statement stm) {
        this.stm = stm;
    }
      
    public boolean insert(String id, String typeOfMainance, String type, String area, String week, Object estimatedTime, String interruptibleActivity){
        StringBuilder temp= new StringBuilder();
        temp.append("insert into manutenzione(identificativo, tipologia, sito, settimana, tipo_manutenzione, tempo_stimato, interrompibile)");
        temp.append("values(");
        temp.append("'").append(id).append("',");
        temp.append(" '").append(type).append("',");
        temp.append(" '").append(area).append("',");
        temp.append(" '").append(week).append("',");
        temp.append(" '").append(typeOfMainance).append("',");
        temp.append(" '").append(estimatedTime).append("',");
        temp.append(" '").append(interruptibleActivity).append("'");
        temp.append(")");
        try{
        stm.executeUpdate(temp.toString());
        return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
  
    public boolean update(String oldId, String id, String typeOfMainance, String type, String area, String week, Object estimatedTime, String interruptibleActivity){
        StringBuilder temp= new StringBuilder();
        temp.append("update manutenzione set identificativo=");
        temp.append("'").append(id).append("', tipologia=");
        temp.append("'").append(type).append("', sito=");
        temp.append("'").append(area).append("', settimana=");
        temp.append("'").append(week).append("', tipo_manutenzione=");
        temp.append("'").append(typeOfMainance).append("', tempo_stimato=");
        temp.append("'").append(estimatedTime).append("', interrompibile=");
        temp.append("'").append(interruptibleActivity).append("'");
        temp.append(" where identificativo=");
        temp.append("'").append(oldId).append("'");
        try{
        stm.executeUpdate(temp.toString());
        return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public boolean delete(String id){
        StringBuilder temp= new StringBuilder();
        temp.append("delete from manutenzione ");
        temp.append("where identificativo = ");
        temp.append("'").append(id).append("'");
        try{
        stm.executeUpdate(temp.toString());
        return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public ArrayList<ArrayList> visualize(){
    StringBuilder temp= new StringBuilder();
    ArrayList <ArrayList> maintenance=new ArrayList();
    String id,typeOfMainance,type,area, week,interruptibleActivity;
    Object estimatedTime;
        temp.append("select * from manutenzione");    
        try{
         ResultSet rst=stm.executeQuery(temp.toString());
         while(rst.next()){
             ArrayList <Object> con=new ArrayList();
             id=rst.getString("identificativo");
             typeOfMainance=rst.getString("tipologia");
             type=rst.getString("tipo_manutenzione");
             area=rst.getString("sito");
             week=rst.getString("settimana");
             interruptibleActivity=rst.getString("interrompibile");
             estimatedTime=rst.getObject("tempo_stimato");
             con.add(id);
             con.add(type);
             con.add(typeOfMainance);
             con.add(area);
             con.add(week);
             con.add(estimatedTime);
             con.add(interruptibleActivity);
             maintenance.add(con);
         }     
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
     return maintenance; 
    }
   
    public String[] visualizeActivities() {
        String query = "select * from Manutenzione ";
        String[] activities = new String[100];
        int i = 0;
        try {
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                activities[i] = rs.getString("identificativo");
                i++;
            }
        } catch (SQLException ex) {
            System.out.println("Errore visualizza attività:\n"+ex.getMessage());
        }
        return activities;
    }
    
     public String visualizeActivity(String identifier) {
        String query = "select * from Manutenzione where identificativo = '"+identifier+"'";
        String dati;
        String id,typeOfMainance,type,area, week,interruptibleActivity,estimatedTime;
        try {
            ResultSet rst = stm.executeQuery(query);
            rst.next();
            id=rst.getString("identificativo");
            typeOfMainance=rst.getString("tipologia");
            type=rst.getString("tipo_manutenzione");
            area=rst.getString("sito");
            week=rst.getString("settimana");
            interruptibleActivity=rst.getString("interrompibile");
            estimatedTime=(String)rst.getString("tempo_stimato");
            dati = "identifier: " +id+
                    "\ntypology: "+ typeOfMainance +
                    "\ntype of maintenance: "+ type +
                    "\narea: "+ area+
                    "\nweek: "+ week+
                    "\ninterruptible activity: "+interruptibleActivity+
                    "\nestimated time: "+ estimatedTime;
            return dati;
            
        } catch (SQLException ex) {
            System.out.println("Errore visualizza attività:\n"+ex.getMessage());
            return null;
        }
       
    }
    
}
