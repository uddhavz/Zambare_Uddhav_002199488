/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Emp;
import model.EmpHistory;

/**
 *
 * @author UddhavZ
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    Emp emp;
    EmpHistory history;
    
    
    public ViewJPanel(EmpHistory history) {
        initComponents();
        this.history = history;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblDName = new javax.swing.JLabel();
        lblDEmpID = new javax.swing.JLabel();
        lblDAge = new javax.swing.JLabel();
        lblDGender = new javax.swing.JLabel();
        lblDStartDate = new javax.swing.JLabel();
        lblDLevel = new javax.swing.JLabel();
        lblDTeamInfo = new javax.swing.JLabel();
        lblDPosTitle = new javax.swing.JLabel();
        lblDCellPhn = new javax.swing.JLabel();
        lblDEmail = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Employee Chart");

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

        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Emp ID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Cell Phone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmp);
        if (tblEmp.getColumnModel().getColumnCount() > 0) {
            tblEmp.getColumnModel().getColumn(0).setMinWidth(150);
            tblEmp.getColumnModel().getColumn(1).setMinWidth(100);
            tblEmp.getColumnModel().getColumn(2).setMinWidth(50);
            tblEmp.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblEmp.getColumnModel().getColumn(2).setMaxWidth(50);
            tblEmp.getColumnModel().getColumn(3).setMinWidth(60);
            tblEmp.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblEmp.getColumnModel().getColumn(3).setMaxWidth(60);
            tblEmp.getColumnModel().getColumn(8).setMinWidth(100);
            tblEmp.getColumnModel().getColumn(9).setMinWidth(100);
        }

        btnDelete.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.MatteBorder(null));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setText("Photo");
        lblImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSearch.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSearch.setText("Search :");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCellPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPositionTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTeamInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStartdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmpID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDCellPhn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDAge, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDGender, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblDEmpID, lblDName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmpID)
                            .addComponent(lblDEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAge)
                            .addComponent(lblDAge, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGender)
                            .addComponent(lblDGender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStartdate)
                            .addComponent(lblDStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLevel)
                            .addComponent(lblDLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTeamInfo)
                            .addComponent(lblDTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPositionTitle)
                            .addComponent(lblDPosTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCellPhone)
                            .addComponent(lblDCellPhn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblDEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                        .addComponent(lblImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAge, lblCellPhone, lblEmail, lblEmpID, lblGender, lblLevel, lblName, lblPositionTitle, lblStartdate, lblTeamInfo});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblDEmpID, lblDName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblEmp.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmp.getModel();
        Emp selectedEmp = (Emp)model.getValueAt(selectedRowIndex, 0);
        
        history.deleteEmp(selectedEmp);
        JOptionPane.showMessageDialog(this, "Employee profile deleted.");
        
        populateTable();
        
        lblDAge.setText("");
        lblDCellPhn.setText("");
        lblDEmail.setText("");
        lblDEmpID.setText("");
        lblDGender.setText("");
        lblDLevel.setText("");
        lblDName.setText("");
        lblDPosTitle.setText("");
        lblDStartDate.setText("");
        lblDTeamInfo.setText("");
        lblImage.setIcon(new ImageIcon(""));
    }//GEN-LAST:event_btnDeleteActionPerformed
 
    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblEmp.getModel();        
        String query=txtSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblEmp.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));       
    }//GEN-LAST:event_txtSearchKeyReleased

    private void tblEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblEmp.getSelectedRow();
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblEmp.getModel();
        Emp selectedEmp = (Emp)model.getValueAt(selectedRowIndex, 0); 
        
        lblDName.setText(selectedEmp.getName());
        lblDEmpID.setText(selectedEmp.getEmpID());
        lblDAge.setText(String.valueOf(selectedEmp.getAge()));
        lblDGender.setText(String.valueOf(selectedEmp.getGender()));
        lblDStartDate.setText(selectedEmp.getStartdate());
        lblDLevel.setText(selectedEmp.getLevel());
        lblDTeamInfo.setText(selectedEmp.getTeamInfo());
        lblDPosTitle.setText(selectedEmp.getPositionTitle());
        lblDCellPhn.setText(String.valueOf(selectedEmp.getCellPhone()));
        lblDEmail.setText(selectedEmp.getEmail());
        //txtPhoto.setText(selectedEmp.getPhoto());
        ImageIcon ii = new ImageIcon(selectedEmp.getPhoto());
        Image img = ii.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
        lblImage.setIcon(new ImageIcon(img));
        
        
        
    }//GEN-LAST:event_tblEmpMouseClicked


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellPhone;
    private javax.swing.JLabel lblDAge;
    private javax.swing.JLabel lblDCellPhn;
    private javax.swing.JLabel lblDEmail;
    private javax.swing.JLabel lblDEmpID;
    private javax.swing.JLabel lblDGender;
    private javax.swing.JLabel lblDLevel;
    private javax.swing.JLabel lblDName;
    private javax.swing.JLabel lblDPosTitle;
    private javax.swing.JLabel lblDStartDate;
    private javax.swing.JLabel lblDTeamInfo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblStartdate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblEmp.getModel();
        model.setRowCount(0);
        
        for (Emp emp : history.getHistory()){
            Object[] row = new Object[10];
            row[0] = emp;
            row[1] = emp.getEmpID();
            row[2] = emp.getAge();
            row[3] = emp.getGender();
            row[4] = emp.getStartdate();
            row[5] = emp.getLevel();
            row[6] = emp.getTeamInfo();
            row[7] = emp.getPositionTitle();
            row[8] = emp.getCellPhone();
            row[9] = emp.getEmail();
            
            
            model.addRow(row);
        }
    }
    
    
}
