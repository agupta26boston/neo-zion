package userinterface.planterRole;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Business.Data.CropData;
import Business.Data.CropDataDirectory;
import Business.Data.CropMethod;
import Business.Data.CropMethodDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EndUserOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JPanel;
//import userinterface.planterRole.LeaseLandJPanel;
////import userinterface.planterRole.PlanMyGardenJPanel;
//import userinterface.planterRole.RegisterForEventsJPanel;
//import userinterface.planterRole.SellLandJPanel;

/**
 *
 * @author kavyaprakash
 */
public class PlanterWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlanterWorkArea
     */
    JPanel container;
    EcoSystem system;
    UserAccount account;
    EndUserOrganization endUserOrganization;
    EcoSystem business;
    CropDataDirectory cropDataDirectory;
    CropMethodDirectory cropMethodDirectory;
    Enterprise enterprise;
    public PlanterWorkAreaJPanel(JPanel container, UserAccount account, EndUserOrganization endUserOrganization, Enterprise enterprise,EcoSystem business) {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
        this.container = container;
        this.account = account;
        this.endUserOrganization = endUserOrganization;
        this.endUserOrganization = endUserOrganization;
        this.business = business;
        this.enterprise=enterprise;
        uploadCropData();
        uploadCropMethod();
        
            
        
        
        
    }
    
    
    public void uploadCropData(){
        String csvFile = "Dataset.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        
        cropDataDirectory = new CropDataDirectory();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null){
                String[] vlues = line.split(csvSplitBy);
                
                String stateName = vlues[0];
                String city = vlues[1];
                String season = vlues[2];
                String crop1 = vlues[3];
                String crop2 = vlues[4];
                String crop3 = vlues[5];
                
                CropData cropData = cropDataDirectory.addCropData();
                cropData.setStateName(stateName);
                cropData.setCity(city);
                cropData.setSeason(season);
                cropData.setCrop1(crop1);
                cropData.setCrop2(crop2);
                cropData.setCrop3(crop3);
            }
           

            
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void uploadCropMethod(){
        String csvFile = "Method.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        
        cropMethodDirectory = new CropMethodDirectory();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null){
                String[] vlues = line.split(csvSplitBy);
                
                String cropName = vlues[0];
                String method = vlues[1];
                
                CropMethod cropMethod = cropMethodDirectory.addCropMethod();
                cropMethod.setCropName(cropName);
                cropMethod.setMethod(method);
                 
                System.out.println(cropMethod.getCropName()+" "+cropMethod.getMethod());
            }     

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
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
        btnPlanGarden = new javax.swing.JButton();
        btnRegisterForEvents = new javax.swing.JButton();
        btnLand = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCommunityQA = new javax.swing.JButton();
        btnPutLandForLease = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("PLANTER WORK AREA");

        btnPlanGarden.setText("PLAN MY GARDEN");
        btnPlanGarden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanGardenActionPerformed(evt);
            }
        });

        btnRegisterForEvents.setText("REGISTER FOR EVENTS");
        btnRegisterForEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterForEventsActionPerformed(evt);
            }
        });

        btnLand.setText("LEASE LAND");
        btnLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLandActionPerformed(evt);
            }
        });

        btnHistory.setText("MY HISTORY");

        jLabel2.setText("NIce looking garden picture here :D ");

        btnCommunityQA.setText("Ask Community");
        btnCommunityQA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityQAActionPerformed(evt);
            }
        });

        btnPutLandForLease.setText("PUT UP LAND FOR LEASE");
        btnPutLandForLease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPutLandForLeaseActionPerformed(evt);
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
                .addGap(284, 284, 284)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 291, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 605, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLand, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(btnPlanGarden, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPutLandForLease, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(btnRegisterForEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCommunityQA, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlanGarden, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegisterForEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPutLandForLease, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCommunityQA, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLand, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterForEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterForEventsActionPerformed
//         TODO add your handling code here:
        RegisterForEventsJPanel reg = new RegisterForEventsJPanel(container,account,endUserOrganization);
        container.add("Register for events", reg);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
                                
    }//GEN-LAST:event_btnRegisterForEventsActionPerformed

    private void btnPlanGardenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanGardenActionPerformed
        // TODO add your handling code here:
        PlanMyGardenJPanel plang = new PlanMyGardenJPanel(container,account,cropDataDirectory,cropMethodDirectory);
        container.add("Planmygarden", plang);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnPlanGardenActionPerformed

    private void btnLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLandActionPerformed
        // TODO add your handling code here:
        
        LeaseLandJPanel ll = new LeaseLandJPanel(container,account,endUserOrganization,enterprise,business);
        container.add("LeaseLandJPanel", ll);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnLandActionPerformed

    private void btnPutLandForLeaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPutLandForLeaseActionPerformed
        // TODO add your handling code here:
        SellLandJPanel sll = new SellLandJPanel(container,account,business);
        container.add("SellLandJPanel", sll);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnPutLandForLeaseActionPerformed

    private void btnCommunityQAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityQAActionPerformed
        // TODO add your handling code here:
        AskCommunityJPanel askjp = new AskCommunityJPanel(container,account,business);
        container.add("AskCommunityJPanel", askjp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnCommunityQAActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCommunityQA;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnLand;
    private javax.swing.JButton btnPlanGarden;
    private javax.swing.JButton btnPutLandForLease;
    private javax.swing.JButton btnRegisterForEvents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
