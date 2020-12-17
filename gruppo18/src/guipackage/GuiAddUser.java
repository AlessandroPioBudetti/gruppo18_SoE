package guipackage;

import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import tablepackage.TableAvailabilityDay;
import tablepackage.TableMantainer;
import tablepackage.TablePlanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sabrina
 */
public class GuiAddUser extends javax.swing.JFrame {

    private Statement st;
    private TablePlanner planner;
    private TableMantainer mantainer;
    private TableAvailabilityDay disponibilità;

    /**
     * Creates new form GuiAmministratore
     *
     * @param st
     */
    public GuiAddUser(Statement st) {
        initComponents();
        this.st = st;
        planner = new TablePlanner(st);
        mantainer = new TableMantainer(st);
        disponibilità = new TableAvailabilityDay(st);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelInserireUtente = new javax.swing.JLabel();
        jButtonMenu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldUserName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBoxUtenti = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabelUserName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelPassword = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelScegli = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListUtenti = new javax.swing.JList<>();

        jLabelInserireUtente.setBackground(new java.awt.Color(27, 64, 82));
        jLabelInserireUtente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelInserireUtente.setForeground(new java.awt.Color(27, 64, 82));
        jLabelInserireUtente.setText("Users management");

        jButtonMenu.setBackground(new java.awt.Color(141, 199, 228));
        jButtonMenu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonMenu.setForeground(new java.awt.Color(34, 102, 136));
        jButtonMenu.setText("MENU");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Users Management");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(162, 197, 220));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonDelete.setBackground(new java.awt.Color(141, 199, 228));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(34, 102, 136));
        jButtonDelete.setText("DELETE");
        jButtonDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(141, 199, 228));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(34, 102, 136));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jTextFieldPassword.setBackground(new java.awt.Color(213, 234, 255));
        jTextFieldPassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextFieldPassword.setForeground(new java.awt.Color(46, 92, 137));
        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });

        jTextFieldUserName.setBackground(new java.awt.Color(213, 234, 255));
        jTextFieldUserName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextFieldUserName.setForeground(new java.awt.Color(46, 92, 137));
        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(141, 199, 228));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(34, 102, 136));
        jButton1.setText("INSERT");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxUtenti.setBackground(new java.awt.Color(213, 234, 255));
        jComboBoxUtenti.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBoxUtenti.setForeground(new java.awt.Color(46, 92, 137));
        jComboBoxUtenti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planner", "Mantainer" }));
        jComboBoxUtenti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxUtentiMouseClicked(evt);
            }
        });
        jComboBoxUtenti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUtentiActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(141, 199, 228));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUserName.setForeground(new java.awt.Color(27, 64, 82));
        jLabelUserName.setText("Username : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabelUserName)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUserName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(141, 199, 228));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(27, 64, 82));
        jLabelPassword.setText("Password : ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelPassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(141, 199, 228));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelScegli.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelScegli.setForeground(new java.awt.Color(27, 64, 82));
        jLabelScegli.setText("User Type :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabelScegli)
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelScegli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jListUtenti.setBackground(new java.awt.Color(213, 234, 255));
        jListUtenti.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jListUtenti.setForeground(new java.awt.Color(46, 92, 137));
        jListUtenti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListUtentiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListUtenti);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxUtenti, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldUserName))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxUtenti)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jTextFieldUserName.getText().isEmpty() || jTextFieldPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insert all fields.", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            String userName = jTextFieldUserName.getText().trim();      // il metodo trim() rimuove spazi bianchi
            String password = jTextFieldPassword.getText().trim();
            String utente = jComboBoxUtenti.getSelectedItem().toString();
            inserimento(userName, password, utente);
            jTextFieldUserName.setText("");
            jTextFieldPassword.setText("");
            visualizzaLista();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jComboBoxUtentiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUtentiActionPerformed
        String utente = jComboBoxUtenti.getSelectedItem().toString();
        if (utente.equalsIgnoreCase("planner")) {
            String[] planners;
            planners = planner.visualizePlanners();
            jListUtenti.setListData(planners);
        } else {
            String[] maintainers;
            maintainers = mantainer.visualizeMaintainers();
            jListUtenti.setListData(maintainers);
        }
    }//GEN-LAST:event_jComboBoxUtentiActionPerformed

    private void jComboBoxUtentiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxUtentiMouseClicked

    }//GEN-LAST:event_jComboBoxUtentiMouseClicked
    private String userSelected;
    private String passSelected;
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        boolean result;
        String user = jTextFieldUserName.getText();
        String pass = jTextFieldPassword.getText();
        if (user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Select the user to delete from the list.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (user.compareToIgnoreCase(userSelected) != 0 || pass.compareToIgnoreCase(passSelected) != 0) {  // se non sono state fatte modifiche non eseguo nessun aggiornamento
            JOptionPane.showMessageDialog(null, "Don't modify the fields before the deletion.", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextFieldUserName.setText("");
            jTextFieldPassword.setText("");
            return;
        }

        if (jComboBoxUtenti.getSelectedItem().toString().equalsIgnoreCase("planner")) {
            result = planner.delete(user);
        } else {
            result = mantainer.delete(user);
        }
        if (result) {
            JOptionPane.showMessageDialog(null, "Successful deletion.", "Info", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error: user inexistent.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        jTextFieldUserName.setText("");
        jTextFieldPassword.setText("");
        visualizzaLista();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        String user = jTextFieldUserName.getText();
        String pass = jTextFieldPassword.getText();
        boolean result;
        if (user.equals(userSelected) && pass.equals(passSelected)) {  // se non sono state fatte modifiche non eseguo nessun aggiornamento
            JOptionPane.showMessageDialog(null, "No update maded.", "Info", JOptionPane.INFORMATION_MESSAGE);
            jTextFieldUserName.setText("");
            jTextFieldPassword.setText("");
            return;
        }
        if (user.isEmpty() && pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Select the user to update from the list.", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextFieldUserName.setText("");
            jTextFieldPassword.setText("");
            return;
        }
        if (user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insert all fields.", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextFieldUserName.setText("");
            jTextFieldPassword.setText("");
            return;

        }
        if (jComboBoxUtenti.getSelectedItem().toString().equalsIgnoreCase("planner")) {  // se ho selezionato un planner
            result = planner.update(user, pass, userSelected);                           // modifico i suoi dati con quelli inseriti nelle text area user e pass
        } else {                                                                         // se ho selezionato un maintainer
            result = mantainer.update(user, pass, userSelected);                         //modifico i suoi dati con quelli inseriti nelle text area user e pass
        }
        if (result) {                                                                    // se il risultato dell'aggiornamento è true
            JOptionPane.showMessageDialog(null, "Successful update.", "Info", JOptionPane.INFORMATION_MESSAGE);             // allora l'agg è avvenuto con successo 
        } else {
            JOptionPane.showMessageDialog(null, "No update maded: user already exists.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        jTextFieldUserName.setText("");
        jTextFieldPassword.setText("");
        visualizzaLista();
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
       
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         this.setVisible(false);
         new GuiMenuAdmin(st).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jListUtentiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListUtentiMouseClicked
        userSelected = jListUtenti.getSelectedValue();
        jTextFieldUserName.setText(userSelected);
        if(userSelected==null){
            return;
        }
        if (jComboBoxUtenti.getSelectedItem().toString().equalsIgnoreCase("planner")) {
            passSelected = planner.getPassword(userSelected);
            jTextFieldPassword.setText(passSelected);
        } else {
            passSelected = mantainer.getPassword(userSelected);
            jTextFieldPassword.setText(passSelected);
        }
    }//GEN-LAST:event_jListUtentiMouseClicked

    private void inserimento(String username, String password, String utente) {
        if (utente.equalsIgnoreCase("planner")) {
            if (planner.insert(username, password) == true) {
                JOptionPane.showMessageDialog(null, "Successful registration:\nUsername: " + username + "\nPassword: " + password, "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error: username already existing.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (mantainer.insert(username, password) == true) {
                disponibilità.insertMaintainerInAvailability(username);
                JOptionPane.showMessageDialog(null, "Successful registration:\nUsername: " + username + "\nPassword: " + password, "Info", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error: user already exists.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void visualizzaLista() {
        String utente = jComboBoxUtenti.getSelectedItem().toString();
        if (utente.equalsIgnoreCase("planner")) {
            String[] planners;
            planners = planner.visualizePlanners();
            jListUtenti.setListData(planners);
        } else {
            String[] maintainers;
            maintainers = mantainer.visualizeMaintainers();
            jListUtenti.setListData(maintainers);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiAddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //         new GuiAddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxUtenti;
    private javax.swing.JLabel jLabelInserireUtente;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelScegli;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JList<String> jListUtenti;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
