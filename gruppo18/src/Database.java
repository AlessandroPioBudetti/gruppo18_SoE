
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Database {

    public Database() {
    }
    
    public Statement connectToDatabase(){
    
        
        String url = "jdbc:postgresql://hattie.db.elephantsql.com:5432/vvtnxvos";
        String username="vvtnxvos";
        String password = "***";
        /**String password = "***";;* Prima di poter utilizzare il database, bisogna inserire la password conosciuta dai membri del gruppo.
        Ricorda di togliere la password prima di effettuare una commit.
        */
        
        try{
            Connection db = DriverManager.getConnection(url,username,password);
            Statement st = db.createStatement();
            System.out.println("Ciao, la tua connessione al database è avvenuta con successo.");
            db.close();
            st.close();
            return st;
            
        }catch(java.sql.SQLException e){
            System.out.println(e.getMessage());
        }
        
        return null;
    }

}
