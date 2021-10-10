/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
import assignment2_car.Directory_Car;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author mhetr
 */
public class MngWorkAreaJPanel extends javax.swing.JPanel {


    /**
     * Creates new form MngWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Directory_Car carDirectory;
    /**
     * Creates new form MngWorkAreaJPanel
     */
   public MngWorkAreaJPanel(JPanel userProcessContainer, Directory_Car carDirectory) {
         initComponents();
         this.userProcessContainer=userProcessContainer;
         this.carDirectory= carDirectory;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateCarDetails1 = new javax.swing.JButton();
        btnManageCarDetails2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(107, 107, 127));

        btnCreateCarDetails1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnCreateCarDetails1.setText("Create Car Details");
        btnCreateCarDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCarDetails1ActionPerformed(evt);
            }
        });

        btnManageCarDetails2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnManageCarDetails2.setText("Manage Car Details");
        btnManageCarDetails2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCarDetails2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(382, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnManageCarDetails2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateCarDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(334, 334, 334))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnCreateCarDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnManageCarDetails2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCarDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCarDetails1ActionPerformed
        // TODO add your handling code here:
        CreateJPanel panel=new CreateJPanel(userProcessContainer,carDirectory);
        userProcessContainer.add("CreateJPanel",panel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateCarDetails1ActionPerformed

    private void btnManageCarDetails2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCarDetails2ActionPerformed
        // TODO add your handling code here:
        
         ManageJPanel panel=new ManageJPanel(userProcessContainer,carDirectory);
        userProcessContainer.add("ManageJPanel",panel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCarDetails2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCarDetails1;
    private javax.swing.JButton btnManageCarDetails2;
    // End of variables declaration//GEN-END:variables
}
