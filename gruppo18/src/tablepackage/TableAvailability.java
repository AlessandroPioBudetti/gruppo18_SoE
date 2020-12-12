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
public class TableAvailability {

    private Statement stm;

    public TableAvailability(Statement stm) {
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

    public ArrayList<ArrayList> visualize(String settimanaSelezionata) {
        StringBuilder temp = new StringBuilder();
        ArrayList<ArrayList> disponibilità = new ArrayList();
        String manutentore, settimana, lunedì, martedì, mercoledì, giovedì, venerdì, sabato, domenica;
        temp.append("select * from Disponibilità where settimana=").append(settimanaSelezionata).append("or settimana=0");

        try {
            ResultSet rst = stm.executeQuery(temp.toString());
            while (rst.next()) {
                ArrayList<Object> con = new ArrayList();
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

}
