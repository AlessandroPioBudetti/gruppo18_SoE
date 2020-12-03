
import java.sql.Statement;






public class Main {

    /**
     * Ci siamo connessi al nostro server remoto ElephantSQL, un servizio di hosting del server PostgreSQL.
     */
    public static void main(String[] args) {
      Dbms datb = new Dbms();
      Statement st = datb.connectToDatabase();
      /*  Questo codice serve per avviare l'interfaccia GuiAddUser, passandogli l'oggetto statement - SERVE SOLO PER PROVA NON VA NEL MAIN DEFINITIVO.
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAddUser(st).setVisible(true);
            }
        });
    */

// Questo codice serve per avviare l'interfaccia GuiTypeManagment, passandogli l'oggetto statement - SERVE SOLO PER PROVA NON VA NEL MAIN DEFINITIVO.
     
/*      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiTypeManagment(st).setVisible(true);
            }
        });
    */

/*
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenuAdmin(st).setVisible(true);
            }
        });
    
    */

 java.awt.EventQueue.invokeLater(new Runnable() {
     public void run() {
        new GuiLogin(st).setVisible(true);
      }
     });
 }
}