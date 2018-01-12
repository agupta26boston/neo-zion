/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author kavyaprakash
 */
public class FundingWorkRequest extends WorkRequest {
    private int id;

   
    private String applicant;
    private String request;
    private String status;
    static int counter=0;
    
    
    public FundingWorkRequest() {
        counter++;
        this.id = counter;
        
    }
    
  public int getId() {
        return id;
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    

    
    
    @Override 
    public String toString(){
    return request;
}
    
    
}
