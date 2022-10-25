/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author UddhavZ
 */
public class PatientLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientLoginJPanel
     */
    public PatientLoginJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPatientUsername = new javax.swing.JTextField();
        lblPatientPassword = new javax.swing.JLabel();
        pfPatientPassword = new javax.swing.JPasswordField();
        lblPatientAdminTitle = new javax.swing.JLabel();
        btnPatientLogin = new javax.swing.JButton();
        lblPatientUsername = new javax.swing.JLabel();

        lblPatientPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblPatientPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientPassword.setText("Password :");
        lblPatientPassword.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblPatientAdminTitle.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        lblPatientAdminTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientAdminTitle.setText("Patient Login");
        lblPatientAdminTitle.setToolTipText("");
        lblPatientAdminTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnPatientLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnPatientLogin.setText("Login");
        btnPatientLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientLoginActionPerformed(evt);
            }
        });

        lblPatientUsername.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblPatientUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientUsername.setText("Username :");
        lblPatientUsername.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(lblPatientAdminTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblPatientUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPatientPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pfPatientPassword)
                        .addComponent(txtPatientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnPatientLogin)
                        .addGap(74, 74, 74)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lblPatientAdminTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPatientUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPatientUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPatientPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPatientLogin)
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPatientLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPatientLogin;
    private javax.swing.JLabel lblPatientAdminTitle;
    private javax.swing.JLabel lblPatientPassword;
    private javax.swing.JLabel lblPatientUsername;
    private javax.swing.JPasswordField pfPatientPassword;
    private javax.swing.JTextField txtPatientUsername;
    // End of variables declaration//GEN-END:variables
}
