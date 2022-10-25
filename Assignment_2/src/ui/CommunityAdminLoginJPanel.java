/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author UddhavZ
 */
public class CommunityAdminLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdminJPanel
     */
    public CommunityAdminLoginJPanel() {
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

        txtCommUsername = new javax.swing.JTextField();
        lblCommPassword = new javax.swing.JLabel();
        pfCommPassword = new javax.swing.JPasswordField();
        lblCommAdminTitle = new javax.swing.JLabel();
        btnCommLogin = new javax.swing.JButton();
        lblCommUsername = new javax.swing.JLabel();

        lblCommPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblCommPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCommPassword.setText("Password :");
        lblCommPassword.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblCommAdminTitle.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        lblCommAdminTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCommAdminTitle.setText("Community Admin Login");
        lblCommAdminTitle.setToolTipText("");
        lblCommAdminTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnCommLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnCommLogin.setText("Login");
        btnCommLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommLoginActionPerformed(evt);
            }
        });

        lblCommUsername.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblCommUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCommUsername.setText("Username :");
        lblCommUsername.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(lblCommAdminTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCommUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCommPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pfCommPassword)
                        .addComponent(txtCommUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnCommLogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lblCommAdminTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCommUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCommUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCommPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfCommPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCommLogin)
                .addContainerGap(167, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCommLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCommLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommLogin;
    private javax.swing.JLabel lblCommAdminTitle;
    private javax.swing.JLabel lblCommPassword;
    private javax.swing.JLabel lblCommUsername;
    private javax.swing.JPasswordField pfCommPassword;
    private javax.swing.JTextField txtCommUsername;
    // End of variables declaration//GEN-END:variables
}
