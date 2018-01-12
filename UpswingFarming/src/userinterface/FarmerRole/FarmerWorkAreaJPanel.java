/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FarmerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FarmerOrganization;
import Business.Organization.ResearchOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.QAWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mayank
 */
public class FarmerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FarmerWorkAreaJPanel
     */
  JPanel userProcessContainer;
  UserAccount account;
  FarmerOrganization farmerOrganization;
  Enterprise enterprise;
  EcoSystem business;
   ArrayList<WorkRequest> listOfReq;
   
  
    public FarmerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, FarmerOrganization farmerOrganization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.farmerOrganization = farmerOrganization;
        this.enterprise = enterprise;
        this.business = business;
        this.listOfReq = farmerOrganization.getWorkQueue().getWorkRequestList();
        populateQATable();
       // System.out.println(farmerOrganization.getWorkQueue().getWorkRequestList().size());
        
   
//        JScrollPane js=new JScrollPane(tblQandA);
//        js.setVisible(true);
//        add(js);
//     
    
}
    public void populateQATable(){
    DefaultTableModel tbl = (DefaultTableModel) tblQandA.getModel();
        tbl.setRowCount(0);
    for(WorkRequest wk : listOfReq){
            
        Object[] row = new Object[5];
        row[0] = wk;
        row[1] = wk.getSender();
        row[2] = wk.getReceiver();
        row[3] = wk.getStatus();
        row[4] = wk.getAnswer();
        
        tbl.addRow(row);
 
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQandA = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("Farmer Work Area");

        jLabel2.setText("Community Q and A :");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblQandA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Question", "Sender", "Receiver", "Status", "Answer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblQandA);
        if (tblQandA.getColumnModel().getColumnCount() > 0) {
            tblQandA.getColumnModel().getColumn(0).setResizable(false);
            tblQandA.getColumnModel().getColumn(1).setResizable(false);
            tblQandA.getColumnModel().getColumn(2).setResizable(false);
            tblQandA.getColumnModel().getColumn(3).setResizable(false);
            tblQandA.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 670, 160));

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBack)
                                    .addComponent(btnAssign))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProcess))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh)))
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess)
                    .addComponent(btnAssign))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(btnBack))
                .addGap(24, 24, 24))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(101, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(101, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        int selectedRow = tblQandA.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
        
        else{
            DefaultTableModel tbl1 = (DefaultTableModel) tblQandA.getModel();
            
                WorkRequest wr = (WorkRequest)tbl1.getValueAt(selectedRow,0);
                wr.setReceiver(account);
                JOptionPane.showMessageDialog(null,"Question assigned to you");
                wr.setStatus("Waiting for answer from  "+account);
                populateQATable();
        }
       
    
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed

        int selectedRow = tblQandA.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
        
        else{
           
            DefaultTableModel tbl2 = (DefaultTableModel) tblQandA.getModel();
            WorkRequest wr = (WorkRequest)tbl2.getValueAt(selectedRow,0);
            if(wr.getReceiver()!=null){
                if(wr.getReceiver().toString().equalsIgnoreCase(account.toString())){

            String answer = JOptionPane.showInputDialog("Your Reply :");
            wr.setAnswer(answer);
            wr.setStatus("Completed");
            populateQATable();
                }
                else JOptionPane.showMessageDialog(null,"This question is already assigned to someone else!");
            }
            else JOptionPane.showMessageDialog(null,"Love your excitement! But please assign the question and then proceed to answer!");
        }

        

    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        populateQATable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblQandA;
    // End of variables declaration//GEN-END:variables
}
