/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipackage;

import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tablepackage.TableMaintenanceActivities;

/**
 *
 * @author ALEX
 */
public class GuiSelectActivities extends javax.swing.JFrame {

    Statement st;
    TableMaintenanceActivities tableMan;
    DefaultTableModel model;
    String week;

    /**
     * Creates new form GuiSelectActivities
     */
    public GuiSelectActivities(Statement st) {
        initComponents();
        this.st = st;
        tableMan = new TableMaintenanceActivities(st);
        model = (DefaultTableModel) maintenanceTable.getModel();
        visualizeWeekInCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        maintenanceTable = new javax.swing.JTable();
        weekComboBox = new javax.swing.JComboBox<>();
        jButtonSel = new javax.swing.JButton();
        jLabelWeek = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        maintenanceTable.setBackground(new java.awt.Color(213, 234, 255));
        maintenanceTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        maintenanceTable.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        maintenanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TYPE", "AREA", "ESTIMATED INTERVENTION TIME [min]"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        maintenanceTable.setToolTipText("");
        maintenanceTable.setShowVerticalLines(false);
        maintenanceTable.getTableHeader().setReorderingAllowed(false);
        maintenanceTable.setVerifyInputWhenFocusTarget(false);
        maintenanceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maintenanceTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(maintenanceTable);

        weekComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        weekComboBox.setToolTipText("");
        weekComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                weekComboBoxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                weekComboBoxMousePressed(evt);
            }
        });
        weekComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weekComboBoxActionPerformed(evt);
            }
        });

        jButtonSel.setText("SELECT");
        jButtonSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelActionPerformed(evt);
            }
        });

        jLabelWeek.setText("WEEK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelWeek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(weekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(539, 539, 539)
                        .addComponent(jButtonSel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(588, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelWeek))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maintenanceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maintenanceTableMouseClicked

    }//GEN-LAST:event_maintenanceTableMouseClicked

    private void weekComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weekComboBoxActionPerformed
        model.getDataVector().removeAllElements();
        week = weekComboBox.getSelectedItem().toString();
        ArrayList<ArrayList> items = new ArrayList();
        items = tableMan.visualizeActivitiesFromWeek(week);
        for (ArrayList k : items) {
            System.out.println(k + " ");
            model.insertRow(model.getRowCount(), new Object[]{k.get(0).toString(), k.get(1).toString(), k.get(2).toString(), k.get(3).toString()});
        }
    }//GEN-LAST:event_weekComboBoxActionPerformed

    private void weekComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weekComboBoxMouseClicked


    }//GEN-LAST:event_weekComboBoxMouseClicked

    private void weekComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_weekComboBoxMousePressed

    }//GEN-LAST:event_weekComboBoxMousePressed

    private void jButtonSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelActionPerformed

        if (maintenanceTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Plase select a row.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String id=(String)model.getValueAt(maintenanceTable.getSelectedRow(), 0);
        new GuiVerificaAttività(st,Integer.parseInt(week),id).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSelActionPerformed
    private void visualizeWeekInCombo() {
        for (int i = 1; i < 53; i++) {
            weekComboBox.addItem("" + i);
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
            java.util.logging.Logger.getLogger(GuiSelectActivities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiSelectActivities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiSelectActivities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiSelectActivities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new GuiSelectActivities().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSel;
    private javax.swing.JLabel jLabelWeek;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable maintenanceTable;
    private javax.swing.JComboBox<String> weekComboBox;
    // End of variables declaration//GEN-END:variables
}
