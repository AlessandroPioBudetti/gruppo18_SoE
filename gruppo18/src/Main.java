
import guipackage.GuiAddUser;
import guipackage.GuiCompetencies;
import guipackage.GuiCompetenzeAttività;
import guipackage.GuiCompetenzeMantainer;
import guipackage.GuiLogin;
import guipackage.GuiMaintenanceAssignmentStep3;
import guipackage.GuiMaintenanceManagement;
import guipackage.GuiSelectActivities;
import guipackage.GuiTypeManagment;
import guipackage.GuiVerificaAttività;
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
        //new GuiCompetenzeMantainer(st).setVisible(true);
        // new GuiLogin(st).setVisible(true);
      // new GuiMaintenanceAssignmentStep3(st, "123").setVisible(true);
        new GuiSelectActivities(st).setVisible(true);
         //new  GuiMaintenanceManagement(st).setVisible(true);
        //new  GuiTypeManagment(st).setVisible(true);
        
      }
     });
 }
}