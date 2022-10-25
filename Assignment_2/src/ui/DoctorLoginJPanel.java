/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author UddhavZ
 */
public class DoctorLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorJPanel
     */
    public DoctorLoginJPanel() {
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

        lblDocAdminTitle = new javax.swing.JLabel();
        btnDocLogin = new javax.swing.JButton();
        lblDocUsername = new javax.swing.JLabel();
        txtDocUsername = new javax.swing.JTextField();
        lblDocPassword = new javax.swing.JLabel();
        pfDocPassword = new javax.swing.JPasswordField();

        lblDocAdminTitle.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        lblDocAdminTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocAdminTitle.setText("Doctor Login");
        lblDocAdminTitle.setToolTipText("");
        lblDocAdminTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnDocLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnDocLogin.setText("Login");
        btnDocLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocLoginActionPerformed(evt);
            }
        });

        lblDocUsername.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblDocUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDocUsername.setText("Username :");
        lblDocUsername.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblDocPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblDocPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDocPassword.setText("Password :");
        lblDocPassword.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(lblDocAdminTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblDocUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDocPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pfDocPassword)
                        .addComponent(txtDocUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnDocLogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lblDocAdminTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDocUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDocUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDocPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfDocPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDocLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDocLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDocLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDocLogin;
    private javax.swing.JLabel lblDocAdminTitle;
    private javax.swing.JLabel lblDocPassword;
    private javax.swing.JLabel lblDocUsername;
    private javax.swing.JPasswordField pfDocPassword;
    private javax.swing.JTextField txtDocUsername;
    // End of variables declaration//GEN-END:variables
}
