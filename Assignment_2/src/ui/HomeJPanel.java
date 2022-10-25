/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import model.*;

/**
 *
 * @author UddhavZ
 */
public class HomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HomeJPanel
     */
    ManagementSystem system;
    JLayeredPane layeredPane;
    
    public HomeJPanel(JLayeredPane layeredPane, ManagementSystem system) {
        initComponents();
        this.layeredPane=layeredPane;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLoginAstxt = new javax.swing.JLabel();
        btnPatient = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnCommunityAdmin = new javax.swing.JButton();
        btnHospitalAdmin = new javax.swing.JButton();
        btnSystemAdmin = new javax.swing.JButton();

        lblLoginAstxt.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        lblLoginAstxt.setForeground(new java.awt.Color(102, 102, 102));
        lblLoginAstxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginAstxt.setText("Login");

        btnPatient.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnPatient.setText("Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnDoctor.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        btnCommunityAdmin.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnCommunityAdmin.setText("Community Admin");
        btnCommunityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityAdminActionPerformed(evt);
            }
        });

        btnHospitalAdmin.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnHospitalAdmin.setText("Hospital Admin");
        btnHospitalAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalAdminActionPerformed(evt);
            }
        });

        btnSystemAdmin.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnSystemAdmin.setText("System Admin");
        btnSystemAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(btnSystemAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblLoginAstxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCommunityAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(btnHospitalAdmin)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(btnPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnDoctor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCommunityAdmin, btnDoctor, btnHospitalAdmin, btnPatient, btnSystemAdmin});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblLoginAstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCommunityAdmin)
                    .addComponent(btnSystemAdmin)
                    .addComponent(btnHospitalAdmin))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPatient)
                    .addComponent(btnDoctor))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCommunityAdmin, btnDoctor, btnHospitalAdmin, btnPatient, btnSystemAdmin});

    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        PatientLoginJPanel patientloginPanel = new PatientLoginJPanel();
        displayPanel(patientloginPanel);
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        // TODO add your handling code here:
        DoctorLoginJPanel docloginPanel = new DoctorLoginJPanel();
        displayPanel(docloginPanel);
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnCommunityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityAdminActionPerformed
        // TODO add your handling code here:
        CommunityAdminLoginJPanel commadminPanel = new CommunityAdminLoginJPanel();
        displayPanel(commadminPanel);
    }//GEN-LAST:event_btnCommunityAdminActionPerformed

    private void btnHospitalAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalAdminActionPerformed
        // TODO add your handling code here:
        HospAdminLoginJPanel hosadminPanel = new HospAdminLoginJPanel();
        displayPanel(hosadminPanel);
    }//GEN-LAST:event_btnHospitalAdminActionPerformed

    private void btnSystemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemAdminActionPerformed
        // TODO add your handling code here:
        SysAdminLoginJPanel sysadminPanel = new SysAdminLoginJPanel(layeredPane, system);
        displayPanel(sysadminPanel);
    }//GEN-LAST:event_btnSystemAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommunityAdmin;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnHospitalAdmin;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnSystemAdmin;
    private javax.swing.JLabel lblLoginAstxt;
    // End of variables declaration//GEN-END:variables

    public void displayPanel(JPanel panel) {
        layeredPane.removeAll();
        layeredPane.add(panel);
        layeredPane.repaint();
        layeredPane.revalidate();
    }

}