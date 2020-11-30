
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
      
    public void insert(String id, String typeOfMainance, String type, String area, String week, Object estimatedTime, String interruptibleActivity){
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
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
  
    public void update(String oldId, String id, String typeOfMainance, String type, String area, String week, Object estimatedTime, String interruptibleActivity){
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
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void delete(String id){
        StringBuilder temp= new StringBuilder();
        temp.append("delete from manutenzione ");
        temp.append("where identificativo = ");
        temp.append("'").append(id).append("'");
        try{
        stm.executeUpdate(temp.toString());
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
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
   
    
    
    
}
