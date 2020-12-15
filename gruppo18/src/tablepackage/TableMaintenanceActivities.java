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
      
    public boolean insert(String id, String typeOfMainance, String type, String area, String week, Object estimatedTime, String interruptibleActivity, String description){
        StringBuilder temp= new StringBuilder();
        temp.append("insert into manutenzione(identificativo, tipologia, sito, settimana, tipo_manutenzione, tempo_stimato, interrompibile, descrizione )");
        temp.append("values(");
        temp.append("'").append(id).append("',");
        temp.append(" '").append(type).append("',");
        temp.append(" '").append(area).append("',");
        temp.append(" '").append(week).append("',");
        temp.append(" '").append(typeOfMainance).append("',");
        temp.append(" '").append(estimatedTime).append("',");
        temp.append(" '").append(interruptibleActivity).append("',");
        temp.append(" '").append(description).append("'");
        temp.append(")");
        try{
        stm.executeUpdate(temp.toString());
        return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
  
    public boolean update(String oldId, String id, String typeOfMainance, String type, String area, String week, Object estimatedTime, String interruptibleActivity, String description){
        StringBuilder temp= new StringBuilder();
        temp.append("update manutenzione set identificativo=");
        temp.append("'").append(id).append("', tipologia=");
        temp.append("'").append(type).append("', sito=");
        temp.append("'").append(area).append("', settimana=");
        temp.append("'").append(week).append("', tipo_manutenzione=");
        temp.append("'").append(typeOfMainance).append("', tempo_stimato=");
        temp.append("'").append(estimatedTime).append("', interrompibile=");
        temp.append("'").append(interruptibleActivity).append("', descrizione=");
        temp.append("'").append(description).append("'");
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
    
     public boolean updateAssignedActivities(String id){
        StringBuilder temp= new StringBuilder();
        temp.append("update manutenzione set assegnata=");
        temp.append("'").append(true).append("'");
        temp.append(" where identificativo=");
        temp.append("'").append(id).append("'");
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
    String id,typeOfMainance,type,area, week,interruptibleActivity, description;
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
             description=rst.getString("descrizione");
             con.add(id);
             con.add(type);
             con.add(typeOfMainance);
             con.add(area);
             con.add(week);
             con.add(estimatedTime);
             con.add(interruptibleActivity);
             con.add(description);
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
    public String visualizeActivity2(String identifier) {
        String query = "select * from Manutenzione where identificativo = '"+identifier+"'";
        String dati;
        String id,typeOfMainance,area,estimatedTime;
        try {
            ResultSet rst = stm.executeQuery(query);
            rst.next();
            id=rst.getString("identificativo");
            typeOfMainance=rst.getString("tipologia");
            
            area=rst.getString("sito");
            
          
            estimatedTime=(String)rst.getString("tempo_stimato");
            dati = "      "+id+
                   "      -      "+ area+
                   "      -      "+typeOfMainance+
                    "    -       "+ estimatedTime + " min";
            return dati;
            
        } catch (SQLException ex) {
            System.out.println("Errore visualizza attività:\n"+ex.getMessage());
            return null;
        }
    }
     
    public String getDescription(String identifier) {
        String query = "select descrizione from Manutenzione where identificativo = '"+identifier+"'";
        String description;
        try {
            ResultSet rst = stm.executeQuery(query);
            rst.next();
            description=rst.getString("descrizione"); 
            return description;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public int getEstimatedTime(String identifier) {
        String query = "select tempo_stimato from Manutenzione where identificativo = '"+identifier+"'";
        int description;
        try {
            ResultSet rst = stm.executeQuery(query);
            rst.next();
            description=rst.getInt("tempo_stimato"); 
            return description;
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return 0;
        }
    }
    
     public int getWeekActivity(String identifier) {
        String query = "select * from Manutenzione where identificativo = '"+identifier+"'";
        int week;
        try {
            ResultSet rst = stm.executeQuery(query);
            rst.next();
            week=rst.getInt("settimana"); 
            return week;
            
        } catch (SQLException ex) {
            System.out.println("Errore visualizza attività:\n"+ex.getMessage());
            return 0;
        }
    }
}
