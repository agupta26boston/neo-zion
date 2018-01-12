/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EventOrganizerRole;

import userinterface.EventOrganizerRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Network.SubNetwork;
import Business.Organization.EndUserOrganization;
import Business.Organization.EventOrganization;
import Business.Organization.FarmerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EventOrganizerWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Mayank
 */
public class EventOrganizerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EventOrganizerWorkAreaJPanel
     */
   JPanel userProcessContainer;
   Enterprise enterprise;
   UserAccount account;
   EcoSystem business;

    public EventOrganizerWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        
        populateMyQTable();
    }
    
    public void populateMyQTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblQandAPlanter.getModel();
        dtm.setRowCount(0);
        for(WorkRequest wk : account.getWorkQueue().getWorkRequestList()){
            if (wk instanceof EventOrganizerWorkRequest){
                Object[] row1 = new Object[6];
                row1[0] = ((EventOrganizerWorkRequest) wk).getEventName();
                row1[1] = ((EventOrganizerWorkRequest) wk).getEventAddress();
                row1[2] = ((EventOrganizerWorkRequest) wk).getEventDate();
                row1[3] = ((EventOrganizerWorkRequest) wk).getTotalSeats();
                row1[4] = wk.getStatus();
                row1[5] = ((EventOrganizerWorkRequest) wk).getRemainingSeat();
        
                 dtm.addRow(row1);
                
            }
            
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEventName = new javax.swing.JTextField();
        txtEventAddress = new javax.swing.JTextField();
        txtNumberOfSeats = new javax.swing.JTextField();
        btnPost = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQandAPlanter = new javax.swing.JTable();
        dateOfEvent = new com.toedter.calendar.JDateChooser();

        jLabel1.setText("Post New Event");

        jLabel2.setText("Event Name");

        jLabel3.setText("Event Address");

        jLabel4.setText("Event Date");

        jLabel5.setText("Number of Seats");

        btnPost.setText("Post");
        btnPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostActionPerformed(evt);
            }
        });

        tblQandAPlanter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Event Name", "Event Address", "Event Date", "Number of Seats", "Status", "Remaining Seat"
            }
        ));
        jScrollPane1.setViewportView(tblQandAPlanter);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(btnPost))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNumberOfSeats, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(txtEventAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(txtEventName, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(dateOfEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEventAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dateOfEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumberOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addComponent(btnPost)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostActionPerformed
        // TODO add your handling code here:
        //DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //Date newDate = new Date();
        //System.out.println(dateFormat.format(newDate));  
        //String d = dateFormat.format(dateOfEvent.getDate());
        
        Date date = dateOfEvent.getDate();
        String strDate = DateFormat.getDateInstance().format(date);
        
        String eventName = txtEventName.getText();
        String eventAddress = txtEventAddress.getText();
        String eventDate =   strDate;  //dateOfEvent.getDate().toString();                   //txtEventDate.getText();
        String eventSeat = txtNumberOfSeats.getText();
        int remSeat = Integer.parseInt(eventSeat);
        
       dateOfEvent.getDate().toString();
        
        EventOrganizerWorkRequest req = new EventOrganizerWorkRequest();
        req.setEventName(eventName);
        req.setEventAddress(eventAddress);
        req.setEventDate(eventDate);
        req.setTotalSeats(eventSeat);
        req.setRemainingSeat(remSeat);
        req.setMessage(eventName);
        req.setSender(account);
        
        boolean found = false;
        for (Network n : business.getNetworkList()) {
            for (SubNetwork sub : n.getSubNet()) {
                if (sub.toString().equalsIgnoreCase(account.getCity())) {
                    
                        for (Enterprise e : sub.getEnterpriseDirectory().getEnterpriseList()) {
                            for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                                if (org instanceof EndUserOrganization) {
                                    req.setStatus("Posted");
                                    org.getWorkQueue().getWorkRequestList().add(req);
                                    account.getWorkQueue().getWorkRequestList().add(req);
                                    found = true;
                                    
                                    break;
                                }

                                
                            }
                        }
                    }
                    // else JOptionPane.showMessageDialog(null,"No farmer organizations found in your city !");
                }

            }
        if(found){
            JOptionPane.showMessageDialog(null,"Event Created and Posted");
            populateMyQTable();
            
        }
        
    }//GEN-LAST:event_btnPostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPost;
    private com.toedter.calendar.JDateChooser dateOfEvent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblQandAPlanter;
    private javax.swing.JTextField txtEventAddress;
    private javax.swing.JTextField txtEventName;
    private javax.swing.JTextField txtNumberOfSeats;
    // End of variables declaration//GEN-END:variables
}