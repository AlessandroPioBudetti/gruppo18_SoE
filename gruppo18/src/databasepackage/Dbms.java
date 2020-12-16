
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dbms {

    private Connection db;

    public Dbms() {
    }

    public Statement connectToDatabase() {
        String url = "jdbc:postgresql://hattie.db.elephantsql.com:5432/vvtnxvos";
        String username = "vvtnxvos";
        String password = "1Q3EfD1TG53vJQKtIpMj_c4Bf75dEW1q";
       
        try {
            db = DriverManager.getConnection(url, username, password);
            Statement st = db.createStatement();
            System.out.println("Ciao, la tua connessione al database è avvenuta con successo.");
            //db.close();
            //st.close();
            return st;
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public Connection getDb() {
        return db;
    }

}
