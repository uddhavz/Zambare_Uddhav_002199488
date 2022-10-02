/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Emp;
import model.EmpHistory;

/**
 *
 * @author UddhavZ
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Emp emp;
    EmpHistory history;
    String photo = "";
    
    public CreateJPanel(EmpHistory history) {
        initComponents();
        this.history = history;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmpID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblStartdate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblPositionTitle = new javax.swing.JLabel();
        lblCellPhone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmpID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtCellPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUploadPhoto = new javax.swing.JButton();
        rbMale = new javax.swing.JRadioButton();
        rbOther = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        dStartDate = new com.toedter.calendar.JDateChooser();
        cbPosTitle = new javax.swing.JComboBox<>();

        lblTitle.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Employee Information");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

        lblEmpID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmpID.setText("Employee ID:");

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age:");

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");

        lblStartdate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStartdate.setText("Start Date:");

        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLevel.setText("Level:");

        lblTeamInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTeamInfo.setText("Team Info:");

        lblPositionTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPositionTitle.setText("Position Title:");

        lblCellPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCellPhone.setText("Cell Phone:");

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email:");

        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoto.setText("Photo:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUploadPhoto.setText("Upload");
        btnUploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPhotoActionPerformed(evt);
            }
        });

        buttonGroupGender.add(rbMale);
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        buttonGroupGender.add(rbOther);
        rbOther.setText("Other");
        rbOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOtherActionPerformed(evt);
            }
        });

        buttonGroupGender.add(rbFemale);
        rbFemale.setText("Female");
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });

        dStartDate.setDateFormatString("dd-MM-yyyy");

        cbPosTitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "New Associate or Assistant", "Associate Engineer", "Analyst", "Senior Analyst", "Consultant, Team Lead, or Specialist", "Associate Manager", "Manager or Principal", "Senior Manager", "Associate Director ", "Managing Director (MD)", "Leadership" }));
        cbPosTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbPosTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPosTitleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStartdate, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbMale)
                        .addGap(30, 30, 30)
                        .addComponent(rbFemale)
                        .addGap(32, 32, 32)
                        .addComponent(rbOther)
                        .addGap(383, 383, 383))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSave)
                            .addComponent(txtAge)
                            .addComponent(btnUploadPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtName)
                            .addComponent(txtEmpID)
                            .addComponent(txtEmail)
                            .addComponent(txtCellPhone)
                            .addComponent(txtTeamInfo)
                            .addComponent(txtLevel)
                            .addComponent(dStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbPosTitle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(344, 344, 344))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblCellPhone, lblEmail, lblEmpID, lblGender, lblLevel, lblName, lblPhoto, lblPositionTitle, lblStartdate, lblTeamInfo});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnUploadPhoto, cbPosTitle, dStartDate, txtAge, txtCellPhone, txtEmail, txtEmpID, txtLevel, txtName, txtTeamInfo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpID)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(rbMale)
                    .addComponent(rbOther)
                    .addComponent(rbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStartdate)
                    .addComponent(dStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPositionTitle)
                    .addComponent(cbPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCellPhone)
                    .addComponent(txtCellPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoto)
                    .addComponent(btnUploadPhoto))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(246, 246, 246))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAge, lblCellPhone, lblEmail, lblEmpID, lblGender, lblLevel, lblName, lblPhoto, lblPositionTitle, lblStartdate, lblTeamInfo});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnUploadPhoto, cbPosTitle, dStartDate, txtAge, txtCellPhone, txtEmail, txtEmpID, txtLevel, txtName, txtTeamInfo});

    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
       
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        String empid = txtEmpID.getText();
        String gender;
        if(rbMale.isSelected()){
            gender = "Male";            
        }else if (rbFemale.isSelected()){
            gender = "Female";
        }else{
            gender = "Other";
        }
        
        //String gender = buttonGroupGender.getSelection().getActionCommand();
        //String startdate = txtStartdate.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String startdate = sdf.format(dStartDate.getDate());
        String level = txtLevel.getText();
        String teaminfo =txtTeamInfo.getText();
        String positiontitle = cbPosTitle.getSelectedItem().toString();
        long cellphone = Long.parseLong(txtCellPhone.getText());
        String email = txtEmail.getText();
        //String photo = txtPhoto.getText();
        
        Emp emp = history.addNewEmp();
        
        emp.setAge(age);
        emp.setCellPhone(cellphone);
        emp.setEmail(email);
        emp.setEmpID(empid);
        emp.setGender(gender);
        emp.setLevel(level);
        emp.setName(name);
        emp.setPhoto(photo);
        emp.setPositionTitle(positiontitle);
        emp.setStartdate(startdate);
        emp.setTeamInfo(teaminfo);
                
        JOptionPane.showMessageDialog(this, "Employee Information Saved.");
        
        txtAge.setText("");
        txtCellPhone.setText("");
        txtEmail.setText("");
        txtEmpID.setText("");
        buttonGroupGender.clearSelection();
        txtLevel.setText("");
        txtName.setText("");
        cbPosTitle.setSelectedIndex(0);
        dStartDate.setCalendar(null);
        txtTeamInfo.setText("");
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser browseFile = new JFileChooser();
        
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseFile.addChoosableFileFilter(fnef);
        int showMsg = browseFile.showOpenDialog(null);
        if (showMsg == JFileChooser.APPROVE_OPTION){
            File selectedImage = browseFile.getSelectedFile();
            photo = selectedImage.getAbsolutePath();
            JOptionPane.showMessageDialog(null, photo);
        }
    }//GEN-LAST:event_btnUploadPhotoActionPerformed

    private void rbOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOtherActionPerformed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void cbPosTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPosTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPosTitleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUploadPhoto;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JComboBox<String> cbPosTitle;
    private com.toedter.calendar.JDateChooser dStartDate;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellPhone;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblStartdate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JRadioButton rbOther;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellPhone;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    
}


