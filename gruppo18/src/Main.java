
import java.sql.Statement;






public class Main {

    /**
     * Ci siamo connessi al nostro server remoto ElephantSQL, un servizio di hosting del server PostgreSQL.
     */
    public static void main(String[] args) {
      Dbms datb = new Dbms();
      Statement st = datb.connectToDatabase();
      
    }
    
}
