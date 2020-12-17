/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipackage;

import java.awt.Color;
import java.awt.Font;
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

    private Statement st;
    private TableMaintenanceActivities tableMan;
    private DefaultTableModel model;
    private String week;

    /**
     * Creates new form GuiSelectActivities
     */
    public GuiSelectActivities(Statement st) {
        initComponents();
        this.st = st;
        tableMan = new TableMaintenanceActivities(st);
        model = (DefaultTableModel) maintenanceTable.getModel();
        visualizeWeekInCombo();
        setTableDesig();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        maintenanceTable = new javax.swing.JTable();
        weekComboBox = new javax.swing.JComboBox<>();
        jButtonSel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelWeek = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MAINTENANCE ACTIVITY  #STEP 1");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(162, 197, 220));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        weekComboBox.setBackground(new java.awt.Color(213, 234, 255));
        weekComboBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        weekComboBox.setForeground(new java.awt.Color(46, 92, 137));
        weekComboBox.setToolTipText("");
        weekComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jButtonSel.setBackground(new java.awt.Color(141, 199, 228));
        jButtonSel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonSel.setForeground(new java.awt.Color(34, 102, 136));
        jButtonSel.setText("SELECT");
        jButtonSel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(141, 199, 228));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelWeek.setBackground(new java.awt.Color(27, 64, 82));
        jLabelWeek.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelWeek.setForeground(new java.awt.Color(27, 64, 82));
        jLabelWeek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWeek.setText("Week");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelWeek, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelWeek))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(weekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(jButtonSel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(weekComboBox))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButtonSel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void maintenanceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maintenanceTableMouseClicked

    }//GEN-LAST:event_maintenanceTableMouseClicked

    private void weekComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weekComboBoxActionPerformed
        model.getDataVector().removeAllElements();
        week = weekComboBox.getSelectedItem().toString();
        ArrayList<ArrayList> items = new ArrayList();
        items = tableMan.visualizeActivitiesFromWeek(week);
        if (items.isEmpty()) {
            //Se nella week selezionata non troviamo nessuna attività, la table deve essere vuota.
            //Un modo per fare ciò, è quello di inserire una row vuota e cancellarla
            model.insertRow(model.getRowCount(), new Object[]{"", "", "", ""});
            model.getDataVector().removeAllElements();
            
        } else {
            for (ArrayList k : items) {
                model.insertRow(model.getRowCount(), new Object[]{k.get(0).toString(), k.get(1).toString(), k.get(2).toString(), k.get(3).toString()});
            }
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
        String id = (String) model.getValueAt(maintenanceTable.getSelectedRow(), 0);
        new GuiVerificaAttività(st, Integer.parseInt(week), id).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new GuiMenuPlanner(st).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing
    private void visualizeWeekInCombo() {
        for (int i = 1; i < 53; i++) {
            weekComboBox.addItem("" + i);
        }
    }
    
    private void setTableDesig(){
      maintenanceTable.getTableHeader().setBackground(new Color(141,199,228));
      maintenanceTable.getTableHeader().setForeground(new Color(27,64,82));
      maintenanceTable.getTableHeader().setFont(new Font("Tahoma",Font.BOLD,12));
      maintenanceTable.getTableHeader().setOpaque(false);
      maintenanceTable.setRowHeight(26);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable maintenanceTable;
    private javax.swing.JComboBox<String> weekComboBox;
    // End of variables declaration//GEN-END:variables
}
