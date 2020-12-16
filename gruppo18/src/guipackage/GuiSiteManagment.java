/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipackage;

import java.sql.Statement;
import java.util.ArrayList;
import tablepackage.TableSite;

/**
 *
 * @author 39392
 */
public class GuiSiteManagment extends javax.swing.JFrame {
   private Statement st;
   private TableSite sites;
    public GuiSiteManagment(Statement st) {
        initComponents();
        this.st=st;
        sites= new TableSite(st);
        visualizeInCombo();
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
        siteComboBox = new javax.swing.JComboBox<>();
        siteTextField = new javax.swing.JTextField();
        AddSiteButton = new javax.swing.JButton();
        removeSiteButton = new javax.swing.JButton();
        updateSiteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SITE MANAGEMENT");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(162, 197, 220));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(510, 129));

        siteComboBox.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        siteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[-- Select one site --]" }));
        siteComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        siteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteComboBoxActionPerformed(evt);
            }
        });

        siteTextField.setBackground(new java.awt.Color(213, 234, 255));
        siteTextField.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        siteTextField.setForeground(new java.awt.Color(46, 92, 137));
        siteTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AddSiteButton.setBackground(new java.awt.Color(141, 199, 228));
        AddSiteButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        AddSiteButton.setForeground(new java.awt.Color(34, 102, 136));
        AddSiteButton.setText("ADD");
        AddSiteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddSiteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddSiteButtonMouseClicked(evt);
            }
        });

        removeSiteButton.setBackground(new java.awt.Color(141, 199, 228));
        removeSiteButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        removeSiteButton.setForeground(new java.awt.Color(34, 102, 136));
        removeSiteButton.setText("REMOVE");
        removeSiteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeSiteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeSiteButtonMouseClicked(evt);
            }
        });

        updateSiteButton.setBackground(new java.awt.Color(141, 199, 228));
        updateSiteButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        updateSiteButton.setForeground(new java.awt.Color(34, 102, 136));
        updateSiteButton.setText("UPDATE");
        updateSiteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateSiteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateSiteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(siteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddSiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(removeSiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(updateSiteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddSiteButton)
                    .addComponent(removeSiteButton)
                    .addComponent(updateSiteButton))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void siteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteComboBoxActionPerformed
       String selectedValue=siteComboBox.getSelectedItem().toString();
        if(siteComboBox.getSelectedIndex()==0){
            siteTextField.setText("Invalid selection");
        }else{
            siteTextField.setText(selectedValue);
        }
    }//GEN-LAST:event_siteComboBoxActionPerformed

    private void AddSiteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddSiteButtonMouseClicked
       int on=0;
        String newSite=siteTextField.getText().toUpperCase();
        if(siteTextField.getText().equals("")){
           siteTextField.setText("Site not valid"); 
           on=1;
        }
        for(int i=0; i<siteComboBox.getItemCount(); i++){
            if(siteComboBox.getItemAt(i).equals(newSite)){
                siteTextField.setText("Site already present");
                on=1;
            }
        }
        if(on!=1){
            addInCombo(newSite);
            siteTextField.setText("");
        }
    }//GEN-LAST:event_AddSiteButtonMouseClicked

    private void removeSiteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeSiteButtonMouseClicked
        String deleteSite=siteTextField.getText().toUpperCase();
        deleteInCombo(deleteSite);
        siteTextField.setText("");  
    }//GEN-LAST:event_removeSiteButtonMouseClicked

    private void updateSiteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateSiteButtonMouseClicked
        int on=0;
        String updateSite=siteTextField.getText().toUpperCase();
        if(siteComboBox.getSelectedIndex()==0){
           siteTextField.setText("Site not valid"); 
           on=1;
        }
        for(int i=0; i<siteComboBox.getItemCount(); i++){
            if(siteComboBox.getItemAt(i).equals(siteTextField.getText())){
                 siteTextField.setText("Site already present");
                on=1;
            }
        }
        if(on!=1){
            updateInCombo(updateSite,siteComboBox.getSelectedIndex(),siteComboBox.getSelectedItem().toString());
            siteTextField.setText("");
            
        }
    }//GEN-LAST:event_updateSiteButtonMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
        new GuiMenuAdmin(st).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(GuiSiteManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiSiteManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiSiteManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiSiteManagment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new GuiSiteManagment().setVisible(true);
            }
        });
    }
 private void visualizeInCombo(){
      ArrayList <String> items=new ArrayList();
      items=sites.visualize();
      for (String k : items){
          siteComboBox.addItem(k);
      }
    }
  private void addInCombo(String item){
      sites.insert(item);
      siteComboBox.addItem(item);  
    }
    private void deleteInCombo(String item){
      sites.delete(item);
      siteComboBox.removeItem(item);
    }
    private void updateInCombo(String newItem, int indexOldItem,String oldItem){
      sites.update(oldItem, newItem);
      siteComboBox.insertItemAt(newItem, indexOldItem);
      siteComboBox.removeItem(oldItem);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSiteButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton removeSiteButton;
    private javax.swing.JComboBox<String> siteComboBox;
    private javax.swing.JTextField siteTextField;
    private javax.swing.JButton updateSiteButton;
    // End of variables declaration//GEN-END:variables
}
