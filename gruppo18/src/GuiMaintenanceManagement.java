
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    
/**
 *
 * @author 39392
 */
public class GuiMaintenanceManagement extends javax.swing.JFrame {
    private Statement st;
    private DefaultTableModel model;
    
    public GuiMaintenanceManagement(Statement st) {
        initComponents();
        this.st=st;
        model=(DefaultTableModel) maintenanceTable.getModel();
        visualizeTypeInCombo();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        manutTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        maintenanceTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        areaTextField = new javax.swing.JTextField();
        typeComboBox = new javax.swing.JComboBox<>();
        yesRadioButton = new javax.swing.JRadioButton();
        noRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        weekComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        typeOfMainanceComboBox = new javax.swing.JComboBox<>();
        estimatedTimeSpinner = new javax.swing.JSpinner();

        manutTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "AREA", "TYPE", "Estimated intervention time [min]"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(manutTable);

        setTitle("MAINTENANCE MANAGEMENT");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(162, 197, 220));

        addButton.setText("Add");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeButtonMouseClicked(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        maintenanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TYPOLOGY OF MAINTENANCE", "TYPE", "AREA", "WEEK", "ESTIMATED INTERVENTION TIME [min]", "INTERRUPTIBLE ACTIVITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        maintenanceTable.setToolTipText("");
        maintenanceTable.getTableHeader().setReorderingAllowed(false);
        maintenanceTable.setVerifyInputWhenFocusTarget(false);
        maintenanceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maintenanceTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(maintenanceTable);
        if (maintenanceTable.getColumnModel().getColumnCount() > 0) {
            maintenanceTable.getColumnModel().getColumn(0).setMinWidth(60);
            maintenanceTable.getColumnModel().getColumn(0).setMaxWidth(60);
            maintenanceTable.getColumnModel().getColumn(1).setMinWidth(200);
            maintenanceTable.getColumnModel().getColumn(1).setMaxWidth(200);
            maintenanceTable.getColumnModel().getColumn(2).setMinWidth(200);
            maintenanceTable.getColumnModel().getColumn(2).setMaxWidth(200);
            maintenanceTable.getColumnModel().getColumn(3).setMinWidth(200);
            maintenanceTable.getColumnModel().getColumn(3).setMaxWidth(200);
            maintenanceTable.getColumnModel().getColumn(4).setMinWidth(60);
            maintenanceTable.getColumnModel().getColumn(4).setMaxWidth(60);
            maintenanceTable.getColumnModel().getColumn(5).setMinWidth(230);
            maintenanceTable.getColumnModel().getColumn(5).setMaxWidth(230);
            maintenanceTable.getColumnModel().getColumn(6).setMinWidth(200);
            maintenanceTable.getColumnModel().getColumn(6).setMaxWidth(200);
        }
        maintenanceTable.getAccessibleContext().setAccessibleName("");

        jLabel3.setText("ID:");

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("AREA:");

        jLabel5.setText("TYPE:");

        jLabel6.setText("ESTIMATED INTERVENTION TIME [min]:");

        areaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTextFieldActionPerformed(evt);
            }
        });

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[-- Select one type --]" }));

        yesRadioButton.setBackground(new java.awt.Color(162, 197, 220));
        yesRadioButton.setText("Yes");
        yesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesRadioButtonActionPerformed(evt);
            }
        });

        noRadioButton.setBackground(new java.awt.Color(162, 197, 220));
        noRadioButton.setText("No");
        noRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noRadioButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("INTERRUPTIBLE ACTIVITY:");

        jLabel7.setText("WEEK:");

        weekComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[-- Select one week --]" }));
        weekComboBox.setToolTipText("");
        weekComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weekComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setText("TYPOLOGY:");

        typeOfMainanceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[-- Select one typology --]", "Planned activity", "Un-planned activity (EWO)", "Extra activity (unplanned activity)" }));

        estimatedTimeSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(areaTextField)
                                            .addComponent(estimatedTimeSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(typeComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(weekComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(typeOfMainanceComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yesRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(noRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(typeOfMainanceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(yesRadioButton)
                    .addComponent(noRadioButton)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(areaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weekComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(estimatedTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(removeButton)
                    .addComponent(updateButton))
                .addGap(25, 25, 25))
        );

        weekComboBox.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTextFieldActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void weekComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weekComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weekComboBoxActionPerformed

    private void yesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesRadioButtonActionPerformed
        if(yesRadioButton.isSelected()){
          noRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_yesRadioButtonActionPerformed

    private void noRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRadioButtonActionPerformed
      if(noRadioButton.isSelected()){
         yesRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_noRadioButtonActionPerformed

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        if(idTextField.getText().equals("") || typeOfMainanceComboBox.getSelectedIndex()==0 || typeComboBox.getSelectedIndex()==0 || areaTextField.getText().equals("")|| weekComboBox.getSelectedIndex()==0 || selectedRadioButton().equals(""))
            JOptionPane.showMessageDialog(this, "Plase enter all data.","ERROR",JOptionPane.ERROR_MESSAGE); 
        else{
        if(checkId()){
        visualizeInTable();
        resetFields();
        }else{
           JOptionPane.showMessageDialog(this, "Plase specify another id.","ERROR",JOptionPane.ERROR_MESSAGE);
        }
       }
    }//GEN-LAST:event_addButtonMouseClicked

    private void removeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseClicked
        deleteInTable();
    }//GEN-LAST:event_removeButtonMouseClicked

    private void maintenanceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maintenanceTableMouseClicked
        resetFields();
        visualizeFields();
    }//GEN-LAST:event_maintenanceTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
     String id=idTextField.getText();
     String typologyOfMaintenance= typeOfMainanceComboBox.getSelectedItem().toString();
     String type=typeComboBox.getSelectedItem().toString();
     String area=areaTextField.getText();
     String week= weekComboBox.getSelectedItem().toString(); 
     String estimatedTime=estimatedTimeSpinner.getValue().toString(); 
     String interruptibleActivity=selectedRadioButton();
     if(maintenanceTable.getSelectedRowCount()==1 ){
           if(checkId() ||  model.getValueAt(maintenanceTable.getSelectedRow(), 0).toString().equals(idTextField.getText())){
               model.setValueAt(id, maintenanceTable.getSelectedRow(),0);
               model.setValueAt(typologyOfMaintenance, maintenanceTable.getSelectedRow(),1);
               model.setValueAt(type, maintenanceTable.getSelectedRow(),2);
               model.setValueAt(area, maintenanceTable.getSelectedRow(),3);
               model.setValueAt(week, maintenanceTable.getSelectedRow(),4);
               model.setValueAt(estimatedTime, maintenanceTable.getSelectedRow(),5);
               model.setValueAt(interruptibleActivity, maintenanceTable.getSelectedRow(),6);
               JOptionPane.showMessageDialog(this, "Update successfully", "INFORMATION MESSAGE", JOptionPane.INFORMATION_MESSAGE);
           }else{
               JOptionPane.showMessageDialog(this, "Plase specify another id.","ERROR",JOptionPane.ERROR_MESSAGE);
           }
      }else{
          JOptionPane.showMessageDialog(this, "Plase select single row for update.","ERROR",JOptionPane.ERROR_MESSAGE);    
       }
           
    }//GEN-LAST:event_updateButtonActionPerformed


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
            java.util.logging.Logger.getLogger(GuiMaintenanceManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMaintenanceManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMaintenanceManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMaintenanceManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //new GuiMaintenanceManagement().setVisible(true);
            }
        });
    }
    
 private void visualizeTypeInCombo(){  
      TableType typology=new TableType(this.st);;
      ArrayList <String> items=new ArrayList();
      items=typology.visualize();
      for (String k : items){
          typeComboBox.addItem(k);
      }
}
 private void visualizeWeekInCombo(){  
   for(int i=1; i<53; i++){
      weekComboBox.addItem(""+i);
   }
}
  private void visualizeInTable(){
      model.insertRow(model.getRowCount(),new Object[]{idTextField.getText(),typeOfMainanceComboBox.getSelectedItem(),typeComboBox.getSelectedItem(), areaTextField.getText(), weekComboBox.getSelectedItem(), estimatedTimeSpinner.getValue(), selectedRadioButton()});
 }
  private void deleteInTable(){
       // model.removeRow(model.);
      //  model.insertRow(model.getRowCount(),new Object[]{idTextField.getText(),typeOfMainanceComboBox.getSelectedItem(),typeComboBox.getSelectedItem(), areaTextField.getText(), weekComboBox.getSelectedItem(), estimatedTimeSpinner.getValue(), selectedRadioButton()});
 }
 
  
 private String selectedRadioButton(){
  if(yesRadioButton.isSelected())
    return "Yes";
   if(noRadioButton.isSelected())
    return "No";
   return "";
}
 private void resetFields(){
   idTextField.setText("");
   typeOfMainanceComboBox.setSelectedIndex(0); 
   typeComboBox.setSelectedIndex(0);
   areaTextField.setText("");
   weekComboBox.setSelectedIndex(0);
   yesRadioButton.setSelected(false);
   noRadioButton.setSelected(false);
   estimatedTimeSpinner.setValue(1);
 }
 
 private boolean checkId(){
     //ritorna true se l'id non è già presente nella tabella, false altrimenti.
     for(int i=0; i<model.getRowCount(); i++){
         //in getValue i è la riga, 0 è la colonna
         if(idTextField.getText().equals(model.getValueAt(i, 0).toString())){
             return false;
        }
     }
     return true;
 }
 private void visualizeFields(){
    String id=model.getValueAt(maintenanceTable.getSelectedRow(), 0).toString();
    String typologyOfMaintenance=model.getValueAt(maintenanceTable.getSelectedRow(), 1).toString();
    String type=model.getValueAt(maintenanceTable.getSelectedRow(), 2).toString();
    String area=model.getValueAt(maintenanceTable.getSelectedRow(), 3).toString();
    String week=model.getValueAt(maintenanceTable.getSelectedRow(), 4).toString();
    Object estimatedTime=model.getValueAt(maintenanceTable.getSelectedRow(), 5);
    String interruptibleActivity=model.getValueAt(maintenanceTable.getSelectedRow(), 6).toString();
    idTextField.setText(id);
    typeOfMainanceComboBox.setSelectedItem(typologyOfMaintenance);
    typeComboBox.setSelectedItem(type);
    areaTextField.setText(area);
    weekComboBox.setSelectedItem(week);
    estimatedTimeSpinner.setValue( estimatedTime);
    if(interruptibleActivity.equals("Yes"))
        yesRadioButton.setSelected(true);
    else
        noRadioButton.setSelected(true);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField areaTextField;
    private javax.swing.JSpinner estimatedTimeSpinner;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable maintenanceTable;
    private javax.swing.JTable manutTable;
    private javax.swing.JRadioButton noRadioButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JComboBox<String> typeOfMainanceComboBox;
    private javax.swing.JButton updateButton;
    private javax.swing.JComboBox<String> weekComboBox;
    private javax.swing.JRadioButton yesRadioButton;
    // End of variables declaration//GEN-END:variables
}
