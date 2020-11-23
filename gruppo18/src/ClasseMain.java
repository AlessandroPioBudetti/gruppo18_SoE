
import java.sql.Statement;






public class ClasseMain {

    /**
     * Ci siamo connessi al nostro server remoto ElephantSQL, un servizio di hosting del server PostgreSQL.
     */
    public static void main(String[] args) {
      Database datb = new Database();
      Statement st = datb.connectToDatabase();
      
    }
    
}
