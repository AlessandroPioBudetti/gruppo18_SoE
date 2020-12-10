/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipackage;

import java.awt.Color;
import java.sql.Statement;
import javax.swing.JOptionPane;
import tablepackage.TableCompetencies;
import tablepackage.TableCompetenzeMaintainers;
import tablepackage.TableMantainer;

/**
 *
 * @author sabrina
 */
public class GuiCompetenzeMantainer extends javax.swing.JFrame {

    Statement st;
    TableMantainer tm;
    TableCompetencies tc;
    TableCompetenzeMaintainers competenzeMantainer;

    /**
     * Creates new form GuiCompetenzeMantainer
     *
     * @param st
     */
    public GuiCompetenzeMantainer(Statement st) {
        initComponents();
        this.st = st;
        tm = new TableMantainer(st);
        tc = new TableCompetencies(st);
        competenzeMantainer = new TableCompetenzeMaintainers(st);
        visualizzaCompetenze();
        visualizzaMantainers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMantainers = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCompetencies = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListCompMant = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(27, 64, 82));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 64, 82));
        jLabel2.setText("Maintainers' list");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(27, 64, 82));
        jLabel3.setText("Competencies list");

        jLabel4.setBackground(new java.awt.Color(27, 64, 82));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(27, 64, 82));
        jLabel4.setText("Competencies of the selected maintainer list ");

        jListMantainers.setBackground(new java.awt.Color(213, 234, 255));
        jListMantainers.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jListMantainers.setForeground(new java.awt.Color(46, 92, 137));
        jListMantainers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMantainersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListMantainers);

        jListCompetencies.setBackground(new java.awt.Color(213, 234, 255));
        jListCompetencies.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jListCompetencies.setForeground(new java.awt.Color(46, 92, 137));
        jScrollPane2.setViewportView(jListCompetencies);

        jListCompMant.setBackground(new java.awt.Color(213, 234, 255));
        jListCompMant.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jListCompMant.setForeground(new java.awt.Color(46, 92, 137));
        jScrollPane3.setViewportView(jListCompMant);

        jButton1.setBackground(new java.awt.Color(141, 199, 228));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(34, 102, 136));
        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonAdd.setBackground(new java.awt.Color(141, 199, 228));
        jButtonAdd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(34, 102, 136));
        jButtonAdd.setText("ADD COMPETENCE ");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonRemove.setBackground(new java.awt.Color(141, 199, 228));
        jButtonRemove.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonRemove.setForeground(new java.awt.Color(34, 102, 136));
        jButtonRemove.setText("REMOVE COMPETENCE");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(162, 197, 220));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 64, 82));
        jLabel1.setText("Maintainers' competencies management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel1)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(423, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addGap(98, 98, 98)
                        .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    String selectedMantainer;
    String selectedCompetence;
    private void jListMantainersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListMantainersMouseClicked
        selectedMantainer = jListMantainers.getSelectedValue();
        if (selectedMantainer != null) {
            visualizzaCompetenzeMantainer();
        }
    }//GEN-LAST:event_jListMantainersMouseClicked

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        selectedCompetence = jListCompetencies.getSelectedValue();
        if (selectedCompetence == null && selectedMantainer == null) {
            JOptionPane.showMessageDialog(null, "Please select a maintainer and a competence.", "Attention", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (selectedCompetence == null) {
            JOptionPane.showMessageDialog(null, "Please select a competence.", "Attention", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (selectedMantainer == null) {
            JOptionPane.showMessageDialog(null, "Please select a maintainer.", "Attention", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        boolean result = competenzeMantainer.insert(selectedMantainer, selectedCompetence);
        if (result) {
            visualizzaCompetenzeMantainer();
        } else {
            JOptionPane.showMessageDialog(null, "Competence already added for this maintainer.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        String competenza = jListCompMant.getSelectedValue();
        if (selectedMantainer == null) {
            JOptionPane.showMessageDialog(null, "Select the maintainer whose competence you want to remove.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (competenza == null) {
            JOptionPane.showMessageDialog(null, "Select the competence you want to remove.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean result = competenzeMantainer.delete(competenza, selectedMantainer);
        if (result) {
            visualizzaCompetenzeMantainer();
        } else {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRemoveActionPerformed
    private void visualizzaCompetenze() {
        String[] competenze = tc.visualizeCompetencies();
        jListCompetencies.setListData(competenze);
    }

    private void visualizzaMantainers() {
        String[] mantainer = tm.visualizeMaintainers();
        jListMantainers.setListData(mantainer);
    }

    private void visualizzaCompetenzeMantainer() {
        String[] competenze = competenzeMantainer.visualizeCompetencies(selectedMantainer);
        jListCompMant.setListData(competenze);
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
            java.util.logging.Logger.getLogger(GuiCompetenzeMantainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCompetenzeMantainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCompetenzeMantainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCompetenzeMantainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new GuiCompetenzeMantainer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListCompMant;
    private javax.swing.JList<String> jListCompetencies;
    private javax.swing.JList<String> jListMantainers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
